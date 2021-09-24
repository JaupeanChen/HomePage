package com.me.module_homepage;

import android.widget.Button;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.me.module_common.BaseActivity;

@Route(path = "/homepage/HomePageActivity")
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
        Button button = findViewById(R.id.btn_go);
        button.setOnClickListener(v ->
                ARouter.getInstance()
                        .build("/cart/CartActivity")
                        .navigation()
        );

    }
}