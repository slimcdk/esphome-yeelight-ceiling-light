package com.yeelight.cherry.p141ui.activity;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.yeelight.cherry.C12225R$id;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;

/* renamed from: com.yeelight.cherry.ui.activity.ProductListActivity_ViewBinding */
public class ProductListActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private ProductListActivity f11178a;

    @UiThread
    public ProductListActivity_ViewBinding(ProductListActivity productListActivity, View view) {
        this.f11178a = productListActivity;
        productListActivity.mDeviceList = (RecyclerView) Utils.findRequiredViewAsType(view, C12225R$id.dev_category_list, "field 'mDeviceList'", RecyclerView.class);
        productListActivity.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, 2131297591, "field 'mTitleBar'", CommonTitleBar.class);
    }

    @CallSuper
    public void unbind() {
        ProductListActivity productListActivity = this.f11178a;
        if (productListActivity != null) {
            this.f11178a = null;
            productListActivity.mDeviceList = null;
            productListActivity.mTitleBar = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
