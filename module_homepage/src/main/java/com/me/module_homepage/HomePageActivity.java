package com.me.module_homepage;

import android.widget.Button;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.me.export_cart.CartRouteTable;
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

        //获取购物车Fragment实例
        Fragment fragment = (Fragment) ARouter.getInstance().build(CartRouteTable.PATH_CART_FRAGMENT_ROUTE).navigation();
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = manager.beginTransaction();
        fragmentTransaction.replace(R.id.fl_fragment, fragment);
        fragmentTransaction.commit();
    }
}