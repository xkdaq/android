package com.xuke.net.view.activity;

import android.Manifest;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;

import com.xuke.net.R;
import com.xuke.net.bean.BaseResultEntity;
import com.xuke.net.bean.LoginUser;
import com.xuke.net.bean.PeerAlumniEntity;
import com.xuke.net.contacts.Contacts;
import com.xuke.net.contacts.ContactsHelper;
import com.xuke.net.retrofit.RetrofitHelper;
import com.xuke.net.runtimepermissions.PermissionsManager;
import com.xuke.net.runtimepermissions.PermissionsResultAction;

import net.sourceforge.pinyin4j.PinyinHelper;
import net.sourceforge.pinyin4j.format.HanyuPinyinCaseType;
import net.sourceforge.pinyin4j.format.HanyuPinyinOutputFormat;
import net.sourceforge.pinyin4j.format.HanyuPinyinToneType;
import net.sourceforge.pinyin4j.format.exception.BadHanyuPinyinOutputFormatCombination;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class ExcavateActivity extends BaseActivity implements ContactsHelper.OnContactsLoad {


    private Call<BaseResultEntity<LoginUser>> userProfileCall;
    private ArrayList<PeerAlumniEntity.ObjBean> contactsEntities;
    private List<PeerAlumniEntity.ObjBean> mSearchContacts;
    private HashMap<String, PeerAlumniEntity.ObjBean> mUserMap;
    private boolean startLoad;
    private String exprenceId;
    private Call<PeerAlumniEntity> peerAlumniCall;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void setUpView() {
        contactsEntities = new ArrayList<>();
        mSearchContacts = new ArrayList<>();
        mUserMap = new HashMap<>();
        PermissionsManager.getInstance().requestPermissionsIfNecessaryForResult(
                context, new String[]{Manifest.permission.READ_CONTACTS}
                , new PermissionsResultAction() {
                    @Override
                    public void onGranted() {
                        ContactsHelper.getInstance().setOnContactsLoad(ExcavateActivity.this);
                        startLoad = ContactsHelper.getInstance().startLoadContacts();
                        if (!startLoad) {
                            getContactsEntity();
                        }
                    }

                    @Override
                    public void onDenied(String permission) {
                        finish();
                    }
                }
        );
    }

    @Override
    public void onContactsLoadSuccess() {
        Log.e("Tag", "联系人获取成功");
        getContactsEntity();
    }

    @Override
    public void onContactsLoadFailed() {
        Log.e("Tag", "联系人获取失败");
    }

    private void getContactsEntity() {

        userProfileCall = RetrofitHelper.getInstance().getUserProfile("1226", "123456");
        userProfileCall.enqueue(new Callback<BaseResultEntity<LoginUser>>() {
            @Override
            public void onResponse(Call<BaseResultEntity<LoginUser>> call, Response<BaseResultEntity<LoginUser>> response) {
                if (response != null) {
                    BaseResultEntity<LoginUser> body = response.body();
                    LoginUser obj = body.getObj();
                    exprenceId = obj.getBaseInfoId();
                    loaddata();
                }
            }

            @Override
            public void onFailure(Call<BaseResultEntity<LoginUser>> call, Throwable t) {

            }
        });


    }

    /**
     * 获取校友数据
     */
    private void loaddata() {
        Log.e("Tag", exprenceId);
        peerAlumniCall = RetrofitHelper.getInstance().getPeerAlumni(exprenceId);
        peerAlumniCall.enqueue(new Callback<PeerAlumniEntity>() {
            @Override
            public void onResponse(Call<PeerAlumniEntity> call, Response<PeerAlumniEntity> response) {
                if (response != null) {
                    PeerAlumniEntity peerAlumniEntity = response.body();

                    if (peerAlumniEntity != null && peerAlumniEntity.isSuccess()) {
                        if (peerAlumniEntity.getObj() != null && peerAlumniEntity.getObj().size() > 0) {
                            for (PeerAlumniEntity.ObjBean objBean : peerAlumniEntity.getObj()) {
                                contactsEntities.add(objBean);
                            }
                            Log.e("Tag", "请求到的用户信息" + peerAlumniEntity.toString());
                            if (contactsEntities.size() < 1) {
                                Log.e("Tag", "查询不到信息");
                            } else {
                                match(contactsEntities);
                            }
                        }
                    }

                }
            }

            @Override
            public void onFailure(Call<PeerAlumniEntity> call, Throwable t) {

            }
        });

    }


    private void match(ArrayList<PeerAlumniEntity.ObjBean> contactsEntities) {
        Log.e("Tag", "匹配数据");
        for (PeerAlumniEntity.ObjBean contactsEntity : contactsEntities) {
            //这里可以添加一个是否是认证的判断
            String contactPinYin = getPinYin(contactsEntity.getName());

            if (TextUtils.isEmpty(contactPinYin)) {


            } else {
                String[] pinyinContacts = contactPinYin.split(",");//有多音字的话会用“，”分隔，造成字符串拼音不准确，这里选择了第一个转换后的拼音
                ContactsHelper.getInstance().qwertySearch(pinyinContacts[0]);//匹配，会保存到ContactsHelper的mSearchContacts
            }

            if (ContactsHelper.getInstance().getSearchContacts() != null && ContactsHelper.getInstance().getSearchContacts().size() > 0) {
                for (Contacts constant : ContactsHelper.getInstance().getSearchContacts()) {//这里循环复制数据，为list用
                    if (!TextUtils.isEmpty(constant.getName())) {
                        PeerAlumniEntity.ObjBean peerAlumin = new PeerAlumniEntity.ObjBean();
                        peerAlumin.setName(constant.getName());

                        Log.e("TAG", "匹配到人的名字" + constant.getName());
                        String phoneNum = constant.getPhoneNumber().replace(" ", "").replace("-", "");
                        peerAlumin.setPhoneNum(phoneNum);
                        peerAlumin.setBaseInfoId(contactsEntity.getBaseInfoId());
                        peerAlumin.setClassName(contactsEntity.getClassName());
                        peerAlumin.setHasRecord(contactsEntity.getHasRecord());
                        //打印手机号
                        Log.e("TAG", "匹配到人的手机号" + constant.getPhoneNumber());

                    }
                }
            }
        }


    }

    public String getPinYin(String chines) {

        StringBuffer pinyinName = new StringBuffer();
        char[] nameChar = chines.toCharArray();
        HanyuPinyinOutputFormat defaultFormat = new HanyuPinyinOutputFormat();
        defaultFormat.setCaseType(HanyuPinyinCaseType.LOWERCASE);
        defaultFormat.setToneType(HanyuPinyinToneType.WITHOUT_TONE);
        for (int i = 0; i < nameChar.length; i++) {
            if (nameChar[i] > 128) {
                try {
                    // 取得当前汉字的所有全拼
                    String[] strs = PinyinHelper.toHanyuPinyinStringArray(
                            nameChar[i], defaultFormat);
                    if (strs != null) {
                        for (int j = 0; j < strs.length; j++) {
                            pinyinName.append(strs[j]);
                            if (j != strs.length - 1) {
                                pinyinName.append(",");
                            }
                        }
                    }
                } catch (BadHanyuPinyinOutputFormatCombination e) {
                    e.printStackTrace();
                }
            } else {
                pinyinName.append(nameChar[i]);
            }
            pinyinName.append(" ");
        }
        Log.e("TAG", "联系人的拼音" + pinyinName);
        // return pinyinName.toString();
        return parseTheChineseByObject(discountTheChinese(pinyinName.toString()));
    }

    private static List<Map<String, Integer>> discountTheChinese(String theStr) {
        // 去除重复拼音后的拼音列表
        List<Map<String, Integer>> mapList = new ArrayList<Map<String, Integer>>();
        // 用于处理每个字的多音字，去掉重复
        Map<String, Integer> onlyOne = null;
        String[] firsts = theStr.split(" ");
        // 读出每个汉字的拼音
        for (String str : firsts) {
            onlyOne = new Hashtable<String, Integer>();
            String[] china = str.split(",");
            // 多音字处理
            for (String s : china) {
                Integer count = onlyOne.get(s);
                if (count == null) {
                    onlyOne.put(s, new Integer(1));
                } else {
                    onlyOne.remove(s);
                    count++;
                    onlyOne.put(s, count);
                }
            }
            mapList.add(onlyOne);
        }
        return mapList;
    }

    /**
     * 解析并组合拼音，对象合并方案(推荐使用)
     *
     * @return
     */
    private static String parseTheChineseByObject(
            List<Map<String, Integer>> list) {
        Map<String, Integer> first = null; // 用于统计每一次,集合组合数据
        // 遍历每一组集合
        for (int i = 0; i < list.size(); i++) {
            // 每一组集合与上一次组合的Map
            Map<String, Integer> temp = new Hashtable<String, Integer>();
            // 第一次循环，first为空
            if (first != null) {
                // 取出上次组合与此次集合的字符，并保存
                for (String s : first.keySet()) {
                    for (String s1 : list.get(i).keySet()) {
                        String str = s + s1;
                        temp.put(str, 1);
                    }
                }
                // 清理上一次组合数据
                if (temp != null && temp.size() > 0) {
                    first.clear();
                }
            } else {
                for (String s : list.get(i).keySet()) {
                    String str = s;
                    temp.put(str, 1);
                }
            }
            // 保存组合数据以便下次循环使用
            if (temp != null && temp.size() > 0) {
                first = temp;
            }
        }
        String returnStr = "";
        if (first != null) {
            // 遍历取出组合字符串
            for (String str : first.keySet()) {
                returnStr += (str + ",");
            }
        }
        if (returnStr.length() > 0) {
            returnStr = returnStr.substring(0, returnStr.length() - 1);
        }
        return returnStr;
    }
}
