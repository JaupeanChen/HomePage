package com.me.module_homepage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.me.module_common.BaseActivity;

public class HomePageActivity extends BaseActivity {


    @Override
    public int getLayout() {
        return R.layout.activity_home_page;
    }

    @Override
    public boolean isNeedToolBar() {
        return false;
    }

    @Override
    public void initData() {

    }
}