package com.xuke.net.view.activity;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.inputmethod.InputMethodManager;

import butterknife.ButterKnife;

public abstract class BaseActivity extends AppCompatActivity {
    public String TAG = this.getClass().getSimpleName();
    protected Activity context;
    protected InputMethodManager inputMethodManager;
    public SharedPreferences prefs;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context = this;
        inputMethodManager = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        prefs = PreferenceManager.getDefaultSharedPreferences(this);

        setContentView(getLayoutId());
        ButterKnife.bind(this);
        setUpView();
        if (savedInstanceState != null) {
            handlerSavedInstanceState(savedInstanceState);
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        context = null;
    }

    /**
     * 获取布局文件id
     *
     * @return resId
     */
    protected abstract int getLayoutId();


    /**
     * 做一些初始化数据操作
     */
    protected abstract void setUpView();


    /**
     * 处理页面保存信息,需要时复写
     *
     * @param savedInstanceState Bundle
     */
    protected void handlerSavedInstanceState(Bundle savedInstanceState) {

    }


    @Override
    public Resources getResources() {
        Resources mResources = super.getResources();
        Configuration config = new Configuration();
        config.setToDefaults();
        mResources.updateConfiguration(config, mResources.getDisplayMetrics());
        return mResources;
    }
}
