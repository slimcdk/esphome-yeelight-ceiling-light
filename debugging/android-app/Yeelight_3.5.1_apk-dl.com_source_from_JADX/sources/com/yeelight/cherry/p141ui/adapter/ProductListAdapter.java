package com.yeelight.cherry.p141ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.yeelight.cherry.p141ui.deviceViewHolder.ProductListViewHolder;
import com.yeelight.yeelib.models.ProductInfo;
import java.util.List;

/* renamed from: com.yeelight.cherry.ui.adapter.ProductListAdapter */
public class ProductListAdapter extends RecyclerView.Adapter<ProductListViewHolder> {

    /* renamed from: a */
    private LayoutInflater f11866a;

    /* renamed from: b */
    private List<ProductInfo> f11867b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C5900b f11868c;

    /* renamed from: com.yeelight.cherry.ui.adapter.ProductListAdapter$a */
    class C5899a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ProductListViewHolder f11869a;

        /* renamed from: b */
        final /* synthetic */ ProductInfo f11870b;

        C5899a(ProductListViewHolder productListViewHolder, ProductInfo productInfo) {
            this.f11869a = productListViewHolder;
            this.f11870b = productInfo;
        }

        public void onClick(View view) {
            if (ProductListAdapter.this.f11868c != null) {
                ProductListAdapter.this.f11868c.mo30812a(this.f11869a.getAdapterPosition(), this.f11870b);
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.adapter.ProductListAdapter$b */
    public interface C5900b {
        /* renamed from: a */
        void mo30812a(int i, ProductInfo productInfo);
    }

    public ProductListAdapter(Context context, List<ProductInfo> list) {
        this.f11866a = LayoutInflater.from(context);
        this.f11867b = list;
    }

    /* renamed from: b */
    public void onBindViewHolder(ProductListViewHolder productListViewHolder, int i) {
        ProductInfo productInfo = this.f11867b.get(i);
        productListViewHolder.mo31217a().setImageResource(productInfo.getProductIcon());
        productListViewHolder.mo31218b().setText(productInfo.getProductName());
        productListViewHolder.itemView.setOnClickListener(new C5899a(productListViewHolder, productInfo));
    }

    /* renamed from: c */
    public ProductListViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ProductListViewHolder(this.f11866a.inflate(2131493156, viewGroup, false));
    }

    /* renamed from: d */
    public void mo31174d(C5900b bVar) {
        this.f11868c = bVar;
    }

    public int getItemCount() {
        return this.f11867b.size();
    }
}
