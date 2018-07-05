package com.xuke.net.retrofit;

import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.xuke.net.bean.AreaEntity;
import com.xuke.net.bean.BaseEntity;
import com.xuke.net.bean.BaseResultEntity;
import com.xuke.net.bean.CountryEntity;
import com.xuke.net.bean.LoginUser;
import com.xuke.net.bean.PeerAlumniEntity;
import com.xuke.net.bean.PeerAlumniUserEntity;
import com.xuke.net.bean.ResultObjNewEntity;
import com.xuke.net.bean.UserEntity;
import com.xuke.net.contant.Commands;

import java.util.List;
import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class RetrofitHelper {

    private static final long DEFAULT_TIMEOUT = 30;
    private static RetrofitHelper mInstance;
    private APIService mAPIService;
    private static Gson gson;

    private RetrofitHelper() {
        initRetrofit();
    }

    public static RetrofitHelper getInstance() {
        if (mInstance == null) {
            synchronized (RetrofitHelper.class) {
                if (mInstance == null) {
                    mInstance = new RetrofitHelper();
                    gson = new GsonBuilder()
                            .setDateFormat("yyyy-MM-dd HH:mm:ss")
                            .create();
                }
            }
        }
        return mInstance;
    }

    private static String URL = "http://v31.cycloud.net";
    //private static String URL = "http://wx.cyapp.net";

    private void initRetrofit() {
        Retrofit retrofit = new Retrofit
                .Builder()
                .baseUrl(URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(getBuilder().build())
                .build();
        mAPIService = retrofit.create(APIService.class);
    }


    private OkHttpClient.Builder getBuilder() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder()
                .readTimeout(DEFAULT_TIMEOUT, TimeUnit.SECONDS)
                .writeTimeout(DEFAULT_TIMEOUT, TimeUnit.SECONDS)
                .connectTimeout(DEFAULT_TIMEOUT, TimeUnit.SECONDS)
                .retryOnConnectionFailure(true);
        return builder;
    }


    public Call<ResultObjNewEntity<List<CountryEntity>>> getCountryNew() {
        return mAPIService.getCountryNew();
    }

    public Call<ResultObjNewEntity<List<AreaEntity>>> getAreaNew(String pAreaCode) {
        return mAPIService.getAreaNew(pAreaCode);
    }

    /**
     * 3.0  获取个人信息10
     */
    public Call<BaseResultEntity<LoginUser>> getUserProfile(String accountNum, String pwdStr) {
        UserEntity userEntity = new UserEntity();
        userEntity.setAccountNum(accountNum);
        userEntity.setPassword(pwdStr);
        BaseEntity<UserEntity> baseEntity = new BaseEntity<>();
        baseEntity.setCommand(Commands.GET_USER_PROFILE);
        baseEntity.setContent(userEntity);
        String result = gson.toJson(baseEntity);
        Log.e("TAG", result);
        return mAPIService.getUserProfile(result);
    }


    /**
     * 3.0  数据挖掘,挖掘同班同学校友
     */
    public Call<PeerAlumniEntity> getPeerAlumni(String classPathStr) {
        BaseEntity<PeerAlumniUserEntity> baseEntity = new BaseEntity<>();
        PeerAlumniUserEntity peerAlumniUserEntity = new PeerAlumniUserEntity();
        peerAlumniUserEntity.setClassPathStr(classPathStr);
        peerAlumniUserEntity.setLevel("16");
        baseEntity.setCommand(Commands.GET_PEERALUMNI);
        baseEntity.setContent(peerAlumniUserEntity);
        String result = gson.toJson(baseEntity);
        Log.e("TAG", result);
        return mAPIService.getPeerAlumni(result);
    }

}
