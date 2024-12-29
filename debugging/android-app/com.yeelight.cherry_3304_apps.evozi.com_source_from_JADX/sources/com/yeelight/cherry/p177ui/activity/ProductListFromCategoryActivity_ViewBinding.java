package com.yeelight.cherry.p177ui.activity;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.yeelight.cherry.C11745R$id;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;

/* renamed from: com.yeelight.cherry.ui.activity.ProductListFromCategoryActivity_ViewBinding */
public class ProductListFromCategoryActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private ProductListFromCategoryActivity f11625a;

    @UiThread
    public ProductListFromCategoryActivity_ViewBinding(ProductListFromCategoryActivity productListFromCategoryActivity, View view) {
        this.f11625a = productListFromCategoryActivity;
        productListFromCategoryActivity.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, 2131297424, "field 'mTitleBar'", CommonTitleBar.class);
        productListFromCategoryActivity.mRvProduct = (RecyclerView) Utils.findRequiredViewAsType(view, C11745R$id.rv_product, "field 'mRvProduct'", RecyclerView.class);
    }

    @CallSuper
    public void unbind() {
        ProductListFromCategoryActivity productListFromCategoryActivity = this.f11625a;
        if (productListFromCategoryActivity != null) {
            this.f11625a = null;
            productListFromCategoryActivity.mTitleBar = null;
            productListFromCategoryActivity.mRvProduct = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
