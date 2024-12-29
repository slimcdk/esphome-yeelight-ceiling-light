package p190o3;

import android.view.View;
import com.yeelight.cherry.p141ui.adapter.ProductFromCategoryAdapter;
import com.yeelight.yeelib.models.ProductInfo;

/* renamed from: o3.d */
public final /* synthetic */ class C9778d implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ ProductFromCategoryAdapter f17633a;

    /* renamed from: b */
    public final /* synthetic */ ProductFromCategoryAdapter.ProductViewHolder f17634b;

    /* renamed from: c */
    public final /* synthetic */ ProductInfo f17635c;

    public /* synthetic */ C9778d(ProductFromCategoryAdapter productFromCategoryAdapter, ProductFromCategoryAdapter.ProductViewHolder productViewHolder, ProductInfo productInfo) {
        this.f17633a = productFromCategoryAdapter;
        this.f17634b = productViewHolder;
        this.f17635c = productInfo;
    }

    public final void onClick(View view) {
        this.f17633a.m17299b(this.f17634b, this.f17635c, view);
    }
}
