package com.yeelight.cherry.p177ui.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.yeelight.cherry.C11745R$id;
import com.yeelight.cherry.C11748R$layout;
import com.yeelight.cherry.p177ui.activity.ProductListFromCategoryActivity;
import com.yeelight.yeelib.p153g.C9853v;
import java.util.List;

/* renamed from: com.yeelight.cherry.ui.adapter.DeviceCategoryAdapter */
public class DeviceCategoryAdapter extends RecyclerView.Adapter<CategoryViewHolder> {

    /* renamed from: a */
    private Context f12136a;

    /* renamed from: b */
    private List<C9853v> f12137b;

    /* renamed from: com.yeelight.cherry.ui.adapter.DeviceCategoryAdapter$CategoryViewHolder */
    protected static class CategoryViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        ImageView f12138a;

        /* renamed from: b */
        TextView f12139b;

        /* renamed from: c */
        TextView f12140c;

        public CategoryViewHolder(@NonNull View view) {
            super(view);
            this.f12138a = (ImageView) view.findViewById(C11745R$id.img_icon);
            this.f12139b = (TextView) view.findViewById(2131297510);
            this.f12140c = (TextView) view.findViewById(2131297469);
        }
    }

    public DeviceCategoryAdapter(Context context, List<C9853v> list) {
        this.f12136a = context;
        this.f12137b = list;
    }

    /* renamed from: a */
    public /* synthetic */ void mo27157a(C9853v vVar, View view) {
        Intent intent = new Intent(this.f12136a, ProductListFromCategoryActivity.class);
        intent.putExtra("extra_category_id", vVar.mo31835f());
        this.f12136a.startActivity(intent);
    }

    /* renamed from: b */
    public void onBindViewHolder(@NonNull CategoryViewHolder categoryViewHolder, int i) {
        C9853v vVar = this.f12137b.get(i);
        categoryViewHolder.f12138a.setImageResource(vVar.mo31837h());
        categoryViewHolder.f12139b.setText(vVar.mo31836g());
        categoryViewHolder.f12140c.setText(vVar.mo31834e());
        categoryViewHolder.itemView.setOnClickListener(new C5866b(this, vVar));
    }

    @NonNull
    /* renamed from: c */
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new CategoryViewHolder(LayoutInflater.from(this.f12136a).inflate(C11748R$layout.item_device_category, viewGroup, false));
    }

    public int getItemCount() {
        List<C9853v> list = this.f12137b;
        if (list == null) {
            return 0;
        }
        return list.size();
    }
}
