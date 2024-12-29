package com.yeelight.cherry.p177ui.adapter;

import android.view.View;
import com.yeelight.cherry.p177ui.adapter.ProductFromCategoryAdapter;
import com.yeelight.yeelib.p153g.C9855x;

/* renamed from: com.yeelight.cherry.ui.adapter.c */
/* compiled from: lambda */
public final /* synthetic */ class C5867c implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ ProductFromCategoryAdapter f12360a;

    /* renamed from: b */
    public final /* synthetic */ ProductFromCategoryAdapter.ProductViewHolder f12361b;

    /* renamed from: c */
    public final /* synthetic */ C9855x f12362c;

    public /* synthetic */ C5867c(ProductFromCategoryAdapter productFromCategoryAdapter, ProductFromCategoryAdapter.ProductViewHolder productViewHolder, C9855x xVar) {
        this.f12360a = productFromCategoryAdapter;
        this.f12361b = productViewHolder;
        this.f12362c = xVar;
    }

    public final void onClick(View view) {
        this.f12360a.mo27202a(this.f12361b, this.f12362c, view);
    }
}
