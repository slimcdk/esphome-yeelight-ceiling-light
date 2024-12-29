package com.yeelight.cherry.p177ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.yeelight.cherry.C11745R$id;
import com.yeelight.cherry.C11748R$layout;
import com.yeelight.cherry.p177ui.adapter.ProductListAdapter;
import com.yeelight.yeelib.p153g.C9855x;
import java.util.List;

/* renamed from: com.yeelight.cherry.ui.adapter.ProductFromCategoryAdapter */
public class ProductFromCategoryAdapter extends RecyclerView.Adapter<ProductViewHolder> {

    /* renamed from: a */
    private final Context f12261a;

    /* renamed from: b */
    private final List<C9855x> f12262b;

    /* renamed from: c */
    private ProductListAdapter.C5837b f12263c;

    /* renamed from: com.yeelight.cherry.ui.adapter.ProductFromCategoryAdapter$ProductViewHolder */
    protected static class ProductViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        ImageView f12264a;

        /* renamed from: b */
        TextView f12265b;

        public ProductViewHolder(@NonNull View view) {
            super(view);
            this.f12264a = (ImageView) view.findViewById(C11745R$id.img_icon);
            this.f12265b = (TextView) view.findViewById(2131297474);
        }
    }

    public ProductFromCategoryAdapter(Context context, List<C9855x> list) {
        this.f12261a = context;
        this.f12262b = list;
    }

    /* renamed from: a */
    public /* synthetic */ void mo27202a(ProductViewHolder productViewHolder, C9855x xVar, View view) {
        ProductListAdapter.C5837b bVar = this.f12263c;
        if (bVar != null) {
            bVar.mo26827a(productViewHolder.getAdapterPosition(), xVar);
        }
    }

    /* renamed from: b */
    public void onBindViewHolder(@NonNull ProductViewHolder productViewHolder, int i) {
        C9855x xVar = this.f12262b.get(i);
        productViewHolder.f12264a.setImageResource(xVar.mo31840b());
        productViewHolder.f12265b.setText(xVar.mo31842d());
        productViewHolder.itemView.setOnClickListener(new C5867c(this, productViewHolder, xVar));
    }

    @NonNull
    /* renamed from: c */
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new ProductViewHolder(LayoutInflater.from(this.f12261a).inflate(C11748R$layout.item_product_from_category, viewGroup, false));
    }

    /* renamed from: d */
    public void mo27205d(ProductListAdapter.C5837b bVar) {
        this.f12263c = bVar;
    }

    public int getItemCount() {
        List<C9855x> list = this.f12262b;
        if (list == null) {
            return 0;
        }
        return list.size();
    }
}
