package com.xuke.net.retrofit;


import com.xuke.net.bean.AreaEntity;
import com.xuke.net.bean.BaseResultEntity;
import com.xuke.net.bean.CountryEntity;
import com.xuke.net.bean.LoginUser;
import com.xuke.net.bean.PeerAlumniEntity;
import com.xuke.net.bean.ResultObjNewEntity;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface APIService {

    /**
     * 获取所在城市 国家
     */
    @POST("/v31/open/v1/dict/selectCountry")
    Call<ResultObjNewEntity<List<CountryEntity>>> getCountryNew();

    /**
     * 获取所在城市 省市
     */
    @FormUrlEncoded
    @POST("/v31/open/v1/dict/selectAreaList")
    Call<ResultObjNewEntity<List<AreaEntity>>> getAreaNew(@Field("pAreaCode") String pAreaCode);

    /**
     * 获取登录用户信息
     */
    @FormUrlEncoded
    @POST("/userProfile/userProfileAction!doNotNeedSessionAndSecurity_userProfileHandler.action")
    Call<BaseResultEntity<LoginUser>> getUserProfile(@Field("jsonStr") String result);


    @FormUrlEncoded
    @POST("/userProfile/userProfileAction!doNotNeedSessionAndSecurity_userProfileHandler.action")
    Call<PeerAlumniEntity> getPeerAlumni(@Field("jsonStr") String result);

}