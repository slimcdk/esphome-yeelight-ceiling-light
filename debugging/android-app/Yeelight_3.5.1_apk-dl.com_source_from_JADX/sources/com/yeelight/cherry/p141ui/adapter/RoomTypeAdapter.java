package com.yeelight.cherry.p141ui.adapter;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.yeelight.cherry.C12225R$id;
import com.yeelight.cherry.C12228R$layout;
import java.util.List;
import p190o3.C9776b;

/* renamed from: com.yeelight.cherry.ui.adapter.RoomTypeAdapter */
public class RoomTypeAdapter extends RecyclerView.Adapter<C5923b> {

    /* renamed from: a */
    private List<Integer> f11935a = null;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public int f11936b;

    /* renamed from: com.yeelight.cherry.ui.adapter.RoomTypeAdapter$a */
    class C5922a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C5923b f11937a;

        C5922a(C5923b bVar) {
            this.f11937a = bVar;
        }

        public void onClick(View view) {
            if (RoomTypeAdapter.this.f11936b != this.f11937a.getAdapterPosition()) {
                int a = RoomTypeAdapter.this.f11936b;
                int unused = RoomTypeAdapter.this.f11936b = this.f11937a.getAdapterPosition();
                RoomTypeAdapter.this.notifyItemChanged(a);
                return;
            }
            int unused2 = RoomTypeAdapter.this.f11936b = this.f11937a.getAdapterPosition();
            view.setBackgroundColor(view.getResources().getColor(2131099745));
        }
    }

    /* renamed from: com.yeelight.cherry.ui.adapter.RoomTypeAdapter$b */
    class C5923b extends RecyclerView.ViewHolder {

        /* renamed from: a */
        ImageView f11939a;

        public C5923b(RoomTypeAdapter roomTypeAdapter, View view) {
            super(view);
            this.f11939a = (ImageView) view.findViewById(C12225R$id.type_img);
        }
    }

    public RoomTypeAdapter(List<Integer> list) {
        this.f11935a = list;
    }

    /* renamed from: c */
    public void onBindViewHolder(C5923b bVar, int i) {
        View view;
        int i2;
        Resources resources;
        bVar.f11939a.setImageResource(this.f11935a.get(i).intValue());
        if (this.f11936b == i) {
            view = bVar.itemView;
            resources = view.getResources();
            i2 = 2131099745;
        } else {
            view = bVar.itemView;
            resources = view.getResources();
            i2 = 2131100178;
        }
        view.setBackgroundColor(resources.getColor(i2));
        bVar.itemView.setOnClickListener(new C5922a(bVar));
    }

    /* renamed from: d */
    public C5923b onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C5923b(this, LayoutInflater.from(viewGroup.getContext()).inflate(C12228R$layout.list_item_root_type, viewGroup, false));
    }

    /* renamed from: e */
    public void mo31206e(C9776b bVar) {
    }

    public int getItemCount() {
        List<Integer> list = this.f11935a;
        if (list == null) {
            return 0;
        }
        return list.size();
    }
}
