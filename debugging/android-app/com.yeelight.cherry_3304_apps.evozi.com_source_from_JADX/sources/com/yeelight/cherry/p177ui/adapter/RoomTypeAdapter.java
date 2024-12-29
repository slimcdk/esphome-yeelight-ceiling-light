package com.yeelight.cherry.p177ui.adapter;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.yeelight.cherry.C11745R$id;
import com.yeelight.cherry.C11748R$layout;
import java.util.List;

/* renamed from: com.yeelight.cherry.ui.adapter.RoomTypeAdapter */
public class RoomTypeAdapter extends RecyclerView.Adapter<C5860b> {

    /* renamed from: a */
    private List<Integer> f12334a = null;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public int f12335b;

    /* renamed from: com.yeelight.cherry.ui.adapter.RoomTypeAdapter$a */
    class C5859a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C5860b f12336a;

        C5859a(C5860b bVar) {
            this.f12336a = bVar;
        }

        public void onClick(View view) {
            if (RoomTypeAdapter.this.f12335b != this.f12336a.getAdapterPosition()) {
                int a = RoomTypeAdapter.this.f12335b;
                int unused = RoomTypeAdapter.this.f12335b = this.f12336a.getAdapterPosition();
                RoomTypeAdapter.this.notifyItemChanged(a);
                return;
            }
            int unused2 = RoomTypeAdapter.this.f12335b = this.f12336a.getAdapterPosition();
            view.setBackgroundColor(view.getResources().getColor(2131099742));
        }
    }

    /* renamed from: com.yeelight.cherry.ui.adapter.RoomTypeAdapter$b */
    class C5860b extends RecyclerView.ViewHolder {

        /* renamed from: a */
        ImageView f12338a;

        public C5860b(RoomTypeAdapter roomTypeAdapter, View view) {
            super(view);
            this.f12338a = (ImageView) view.findViewById(C11745R$id.type_img);
        }
    }

    public RoomTypeAdapter(List<Integer> list) {
        this.f12334a = list;
    }

    /* renamed from: c */
    public void onBindViewHolder(C5860b bVar, int i) {
        View view;
        int i2;
        Resources resources;
        bVar.f12338a.setImageResource(this.f12334a.get(i).intValue());
        if (this.f12335b == i) {
            view = bVar.itemView;
            resources = view.getResources();
            i2 = 2131099742;
        } else {
            view = bVar.itemView;
            resources = view.getResources();
            i2 = 2131100175;
        }
        view.setBackgroundColor(resources.getColor(i2));
        bVar.itemView.setOnClickListener(new C5859a(bVar));
    }

    /* renamed from: d */
    public C5860b onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C5860b(this, LayoutInflater.from(viewGroup.getContext()).inflate(C11748R$layout.list_item_root_type, viewGroup, false));
    }

    /* renamed from: e */
    public void mo27241e(C5868d dVar) {
    }

    public int getItemCount() {
        List<Integer> list = this.f12334a;
        if (list == null) {
            return 0;
        }
        return list.size();
    }
}
