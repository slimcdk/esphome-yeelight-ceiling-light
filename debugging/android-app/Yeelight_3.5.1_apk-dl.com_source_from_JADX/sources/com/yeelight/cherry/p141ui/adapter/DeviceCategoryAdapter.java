package com.yeelight.cherry.p141ui.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.yeelight.cherry.C12225R$id;
import com.yeelight.cherry.C12228R$layout;
import com.yeelight.cherry.p141ui.activity.ProductListFromCategoryActivity;
import com.yeelight.yeelib.models.C8325q;
import java.util.List;
import p190o3.C9777c;

/* renamed from: com.yeelight.cherry.ui.adapter.DeviceCategoryAdapter */
public class DeviceCategoryAdapter extends RecyclerView.Adapter<CategoryViewHolder> {

    /* renamed from: a */
    private Context f11736a;

    /* renamed from: b */
    private List<C8325q> f11737b;

    /* renamed from: com.yeelight.cherry.ui.adapter.DeviceCategoryAdapter$CategoryViewHolder */
    protected static class CategoryViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        ImageView f11738a;

        /* renamed from: b */
        TextView f11739b;

        /* renamed from: c */
        TextView f11740c;

        public CategoryViewHolder(@NonNull View view) {
            super(view);
            this.f11738a = (ImageView) view.findViewById(C12225R$id.img_icon);
            this.f11739b = (TextView) view.findViewById(2131297686);
            this.f11740c = (TextView) view.findViewById(2131297644);
        }
    }

    public DeviceCategoryAdapter(Context context, List<C8325q> list) {
        this.f11736a = context;
        this.f11737b = list;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m17232b(C8325q qVar, View view) {
        Intent intent = new Intent(this.f11736a, ProductListFromCategoryActivity.class);
        intent.putExtra("extra_category_id", qVar.mo35412f());
        this.f11736a.startActivity(intent);
    }

    /* renamed from: c */
    public void onBindViewHolder(@NonNull CategoryViewHolder categoryViewHolder, int i) {
        C8325q qVar = this.f11737b.get(i);
        categoryViewHolder.f11738a.setImageResource(qVar.mo35414h());
        categoryViewHolder.f11739b.setText(qVar.mo35413g());
        categoryViewHolder.f11740c.setText(qVar.mo35411e());
        categoryViewHolder.itemView.setOnClickListener(new C9777c(this, qVar));
    }

    @NonNull
    /* renamed from: d */
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new CategoryViewHolder(LayoutInflater.from(this.f11736a).inflate(C12228R$layout.item_device_category, viewGroup, false));
    }

    public int getItemCount() {
        List<C8325q> list = this.f11737b;
        if (list == null) {
            return 0;
        }
        return list.size();
    }
}
