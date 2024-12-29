package com.yeelight.cherry.p177ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.yeelight.cherry.p177ui.deviceViewHolder.ProductListViewHolder;
import com.yeelight.yeelib.p153g.C9855x;
import java.util.List;

/* renamed from: com.yeelight.cherry.ui.adapter.ProductListAdapter */
public class ProductListAdapter extends RecyclerView.Adapter<ProductListViewHolder> {

    /* renamed from: a */
    private LayoutInflater f12266a;

    /* renamed from: b */
    private List<C9855x> f12267b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C5837b f12268c;

    /* renamed from: com.yeelight.cherry.ui.adapter.ProductListAdapter$a */
    class C5836a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ProductListViewHolder f12269a;

        /* renamed from: b */
        final /* synthetic */ C9855x f12270b;

        C5836a(ProductListViewHolder productListViewHolder, C9855x xVar) {
            this.f12269a = productListViewHolder;
            this.f12270b = xVar;
        }

        public void onClick(View view) {
            if (ProductListAdapter.this.f12268c != null) {
                ProductListAdapter.this.f12268c.mo26827a(this.f12269a.getAdapterPosition(), this.f12270b);
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.adapter.ProductListAdapter$b */
    public interface C5837b {
        /* renamed from: a */
        void mo26827a(int i, C9855x xVar);
    }

    public ProductListAdapter(Context context, List<C9855x> list) {
        this.f12266a = LayoutInflater.from(context);
        this.f12267b = list;
    }

    /* renamed from: b */
    public void onBindViewHolder(ProductListViewHolder productListViewHolder, int i) {
        C9855x xVar = this.f12267b.get(i);
        productListViewHolder.mo27254a().setImageResource(xVar.mo31840b());
        productListViewHolder.mo27255b().setText(xVar.mo31842d());
        productListViewHolder.itemView.setOnClickListener(new C5836a(productListViewHolder, xVar));
    }

    /* renamed from: c */
    public ProductListViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ProductListViewHolder(this.f12266a.inflate(2131493152, viewGroup, false));
    }

    /* renamed from: d */
    public void mo27208d(C5837b bVar) {
        this.f12268c = bVar;
    }

    public int getItemCount() {
        return this.f12267b.size();
    }
}
