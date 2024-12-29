package com.yeelight.cherry.p177ui.activity;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.yeelight.cherry.C11745R$id;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;

/* renamed from: com.yeelight.cherry.ui.activity.ProductListActivity_ViewBinding */
public class ProductListActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private ProductListActivity f11613a;

    @UiThread
    public ProductListActivity_ViewBinding(ProductListActivity productListActivity, View view) {
        this.f11613a = productListActivity;
        productListActivity.mDeviceList = (RecyclerView) Utils.findRequiredViewAsType(view, C11745R$id.dev_category_list, "field 'mDeviceList'", RecyclerView.class);
        productListActivity.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, 2131297424, "field 'mTitleBar'", CommonTitleBar.class);
    }

    @CallSuper
    public void unbind() {
        ProductListActivity productListActivity = this.f11613a;
        if (productListActivity != null) {
            this.f11613a = null;
            productListActivity.mDeviceList = null;
            productListActivity.mTitleBar = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
