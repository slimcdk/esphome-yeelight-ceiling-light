package com.yeelight.cherry.p141ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.yeelight.cherry.C12225R$id;
import com.yeelight.cherry.C12228R$layout;
import com.yeelight.cherry.p141ui.adapter.ProductListAdapter;
import com.yeelight.yeelib.models.ProductInfo;
import java.util.List;
import p190o3.C9778d;

/* renamed from: com.yeelight.cherry.ui.adapter.ProductFromCategoryAdapter */
public class ProductFromCategoryAdapter extends RecyclerView.Adapter<ProductViewHolder> {

    /* renamed from: a */
    private final Context f11861a;

    /* renamed from: b */
    private final List<ProductInfo> f11862b;

    /* renamed from: c */
    private ProductListAdapter.C5900b f11863c;

    /* renamed from: com.yeelight.cherry.ui.adapter.ProductFromCategoryAdapter$ProductViewHolder */
    protected static class ProductViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        ImageView f11864a;

        /* renamed from: b */
        TextView f11865b;

        public ProductViewHolder(@NonNull View view) {
            super(view);
            this.f11864a = (ImageView) view.findViewById(C12225R$id.img_icon);
            this.f11865b = (TextView) view.findViewById(2131297649);
        }
    }

    public ProductFromCategoryAdapter(Context context, List<ProductInfo> list) {
        this.f11861a = context;
        this.f11862b = list;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m17299b(ProductViewHolder productViewHolder, ProductInfo productInfo, View view) {
        ProductListAdapter.C5900b bVar = this.f11863c;
        if (bVar != null) {
            bVar.mo30812a(productViewHolder.getAdapterPosition(), productInfo);
        }
    }

    /* renamed from: c */
    public void onBindViewHolder(@NonNull ProductViewHolder productViewHolder, int i) {
        ProductInfo productInfo = this.f11862b.get(i);
        productViewHolder.f11864a.setImageResource(productInfo.getProductIcon());
        productViewHolder.f11865b.setText(productInfo.getProductName());
        productViewHolder.itemView.setOnClickListener(new C9778d(this, productViewHolder, productInfo));
    }

    @NonNull
    /* renamed from: d */
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new ProductViewHolder(LayoutInflater.from(this.f11861a).inflate(C12228R$layout.item_product_from_category, viewGroup, false));
    }

    /* renamed from: e */
    public void mo31171e(ProductListAdapter.C5900b bVar) {
        this.f11863c = bVar;
    }

    public int getItemCount() {
        List<ProductInfo> list = this.f11862b;
        if (list == null) {
            return 0;
        }
        return list.size();
    }
}
