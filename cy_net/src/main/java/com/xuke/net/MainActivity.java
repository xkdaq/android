package com.xuke.net;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.xuke.net.bean.AreaEntity;
import com.xuke.net.bean.CountryEntity;
import com.xuke.net.bean.ResultObjNewEntity;
import com.xuke.net.retrofit.RetrofitHelper;
import com.xuke.net.view.pickerview.OptionsPickerView;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private OptionsPickerView addressPicker;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView tvCountry = (TextView) findViewById(R.id.tv_country);
        TextView tvArea = (TextView) findViewById(R.id.tv_area);
        TextView tvShowPicker = (TextView) findViewById(R.id.tv_showPicker);


        tvCountry.setOnClickListener(this);
        tvArea.setOnClickListener(this);
        tvShowPicker.setOnClickListener(this);

        //getCountry();
        //getArea("1");


    }


    @Override
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.tv_country) {
            getCountry();
        } else if (id == R.id.tv_area) {
            //getArea("1");
        } else if (id == R.id.tv_showPicker) {
            showPicker();
            //Intent intent = new Intent(this, ExcavateActivity.class);
            //startActivity(intent);
        }
    }

    private List<String> options1Items;
    private List<List<String>> options2Items;
    private List<List<ArrayList<String>>> options3Items;

    private List<CountryEntity> countryList = new ArrayList<>();   //网络请求获取国家
    private ArrayList<AreaEntity> getCityList = new ArrayList<>();  //网络请求获取省市

    private List<String> country = new ArrayList<>();
    private List<List<String>> city = new ArrayList<>();


    /**
     * showPicker
     */
    private void showPicker() {
        if (addressPicker == null) {
            addressPicker = new OptionsPickerView(this);
        }
        if (options1Items == null) {
            options1Items = new ArrayList<>();
        }
        if (options2Items == null) {
            options2Items = new ArrayList<>();
        }
        if (options3Items == null) {
            options3Items = new ArrayList<>();
        }
        options1Items.clear();
        options2Items.clear();
        options3Items.clear();

//        Collections.addAll(options1Items, APPConstant.country1);
//        for (String[] c : APPConstant.Province1) {
//            ArrayList<String> list = new ArrayList<>();
//            Collections.addAll(list, c);
//            options2Items.add(list);
//        }
//        ArrayList<ArrayList<String>> list3 = new ArrayList<>();
//        for (String[][] c : APPConstant.City1) {
//            ArrayList<String[]> list = new ArrayList<>();
//            Collections.addAll(list, c);
//            for (String[] d : list) {
//                ArrayList<String> list2 = new ArrayList<>();
//                Collections.addAll(list2, d);
//                list3.add(list2);
//            }
//            options3Items.add(list3);
//        }


        //三级联动效果
        //addressPicker.setPicker(options1Items, options2Items, options3Items, true);
        addressPicker.setCyclic(false);
        addressPicker.setCancelable(true);
        //设置默认选中的三级项目
        //监听确定选择按钮
        addressPicker.setOnoptionsSelectListener(new OptionsPickerView.OnOptionsSelectListener() {
            @Override
            public void onOptionsSelect(int options1, int option2, int options3) {

            }
        });
        addressPicker.show();
    }

    /**
     * 获取城市
     */
    private void getArea(final String pAreaCode) {
        Call<ResultObjNewEntity<List<AreaEntity>>> areaNew = RetrofitHelper.getInstance().getAreaNew(pAreaCode);
        areaNew.enqueue(new Callback<ResultObjNewEntity<List<AreaEntity>>>() {
            @Override
            public void onResponse(Call<ResultObjNewEntity<List<AreaEntity>>> call, Response<ResultObjNewEntity<List<AreaEntity>>> response) {
                if (response != null) {
                    ResultObjNewEntity<List<AreaEntity>> body = response.body();
                    if (body != null) {
                        if ("200".equals(body.getCode())) {
                            List<AreaEntity> data = body.getData();
                            getCityList.addAll(data);
                        }
                    }
                }
            }

            @Override
            public void onFailure(Call<ResultObjNewEntity<List<AreaEntity>>> call, Throwable t) {

            }
        });
    }


    /**
     * 获取国家
     */
    private void getCountry() {
        Call<ResultObjNewEntity<List<CountryEntity>>> countryNew = RetrofitHelper.getInstance().getCountryNew();
        countryNew.enqueue(new Callback<ResultObjNewEntity<List<CountryEntity>>>() {
            @Override
            public void onResponse(Call<ResultObjNewEntity<List<CountryEntity>>> call, Response<ResultObjNewEntity<List<CountryEntity>>> response) {
                if (response != null) {
                    ResultObjNewEntity<List<CountryEntity>> body = response.body();
                    if (body != null) {
                        if ("200".equals(body.getCode())) {
                            countryList = body.getData();

                            ArrayList<String> c = new ArrayList<>();
                            for (CountryEntity s : countryList) {
                                c.add(s.getName());
                            }


                            String[] array2 = c.toArray(new String[c.size()]);

                            String s = "";
                            for (int i = 0; i < array2.length; i++) {
                                Log.e("xuke", array2[i]);
                                s = s + "\""+array2[i] + "\",";
                            }

                            Log.e("xuke", s);

                        }
                    }
                }
            }

            @Override
            public void onFailure(Call<ResultObjNewEntity<List<CountryEntity>>> call, Throwable t) {
                t.printStackTrace();
            }
        });

    }


    /**
     * 重名
     * */



}
