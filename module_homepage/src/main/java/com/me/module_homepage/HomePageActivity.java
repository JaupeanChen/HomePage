package com.me.module_homepage;

import android.widget.Button;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.me.export_cart.CartServiceUtil;
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
//                ARouter.getInstance()
//                        .build("/cart/CartActivity")
//                        .navigation()
                        CartServiceUtil.navigateToCart("param1", "param2")
        );
        TextView tvCount = findViewById(R.id.tv_count);
        String count = "购物车商品数量：" + CartServiceUtil.getCartInfo().getCount();
        tvCount.setText(count);
    }
}