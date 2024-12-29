package com.yeelight.yeelib.p194ui.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.chauthai.swipereveallayout.C1261a;
import com.chauthai.swipereveallayout.SwipeRevealLayout;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.p153g.C4300b0;
import com.yeelight.yeelib.p153g.C9849r;
import com.yeelight.yeelib.p194ui.view.LightView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.yeelight.yeelib.ui.adapter.FavoriteSceneAdapter */
public class FavoriteSceneAdapter extends RecyclerView.Adapter<FavoriteSceneVH> {

    /* renamed from: a */
    private final String f19187a;

    /* renamed from: b */
    private List<C9849r> f19188b = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C10356c f19189c;

    /* renamed from: d */
    private final C1261a f19190d;

    /* renamed from: e */
    private boolean f19191e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C4300b0.C4307g f19192f;

    /* renamed from: com.yeelight.yeelib.ui.adapter.FavoriteSceneAdapter$FavoriteSceneVH */
    public class FavoriteSceneVH extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public LightView f19193a;

        /* renamed from: b */
        public TextView f19194b;

        /* renamed from: c */
        public TextView f19195c;

        /* renamed from: d */
        public LinearLayout f19196d;

        /* renamed from: e */
        public SwipeRevealLayout f19197e;

        /* renamed from: f */
        public ImageView f19198f;

        public FavoriteSceneVH(FavoriteSceneAdapter favoriteSceneAdapter, View view) {
            super(view);
            this.f19197e = (SwipeRevealLayout) view.findViewById(R$id.swipe_reveal_layout);
            this.f19193a = (LightView) view.findViewById(R$id.fav_img);
            this.f19194b = (TextView) view.findViewById(R$id.fav_name);
            this.f19195c = (TextView) view.findViewById(R$id.fav_value);
            this.f19196d = (LinearLayout) view.findViewById(R$id.fav_apply);
            this.f19198f = (ImageView) view.findViewById(R$id.img_delete);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.adapter.FavoriteSceneAdapter$a */
    class C10354a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ FavoriteSceneVH f19199a;

        /* renamed from: b */
        final /* synthetic */ C9849r f19200b;

        C10354a(FavoriteSceneVH favoriteSceneVH, C9849r rVar) {
            this.f19199a = favoriteSceneVH;
            this.f19200b = rVar;
        }

        public void onClick(View view) {
            if (FavoriteSceneAdapter.this.f19189c != null) {
                FavoriteSceneAdapter.this.f19189c.mo32660a(this.f19199a.getAdapterPosition(), this.f19200b);
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.adapter.FavoriteSceneAdapter$b */
    class C10355b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C9849r f19202a;

        C10355b(C9849r rVar) {
            this.f19202a = rVar;
        }

        public void onClick(View view) {
            C4300b0.m12083u().mo23742f(this.f19202a, FavoriteSceneAdapter.this.f19192f);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.adapter.FavoriteSceneAdapter$c */
    public interface C10356c {
        /* renamed from: a */
        void mo32660a(int i, C9849r rVar);
    }

    public FavoriteSceneAdapter(String str, boolean z, C4300b0.C4307g gVar) {
        C1261a aVar = new C1261a();
        this.f19190d = aVar;
        this.f19191e = false;
        this.f19187a = str;
        aVar.mo10111h(true);
        this.f19191e = z;
        this.f19192f = gVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0116  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onBindViewHolder(com.yeelight.yeelib.p194ui.adapter.FavoriteSceneAdapter.FavoriteSceneVH r6, int r7) {
        /*
            r5 = this;
            java.util.List<com.yeelight.yeelib.g.r> r0 = r5.f19188b
            java.lang.Object r7 = r0.get(r7)
            com.yeelight.yeelib.g.r r7 = (com.yeelight.yeelib.p153g.C9849r) r7
            android.widget.TextView r0 = r6.f19194b
            java.lang.String r1 = r7.mo31885q()
            r0.setText(r1)
            android.widget.LinearLayout r0 = r6.f19196d
            com.yeelight.yeelib.ui.adapter.FavoriteSceneAdapter$a r1 = new com.yeelight.yeelib.ui.adapter.FavoriteSceneAdapter$a
            r1.<init>(r6, r7)
            r0.setOnClickListener(r1)
            boolean r0 = r7.mo31893y()
            java.lang.String r1 = "："
            if (r0 == 0) goto L_0x0050
            android.widget.TextView r0 = r6.f19195c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            android.widget.TextView r3 = r6.f19195c
            android.content.Context r3 = r3.getContext()
            android.content.res.Resources r3 = r3.getResources()
            int r4 = com.yeelight.yeelib.R$string.common_text_bright
            java.lang.String r3 = r3.getString(r4)
            r2.append(r3)
            r2.append(r1)
            int r1 = r7.mo31874f()
        L_0x0044:
            r2.append(r1)
            java.lang.String r1 = r2.toString()
        L_0x004b:
            r0.setText(r1)
            goto L_0x00f6
        L_0x0050:
            boolean r0 = r7.mo31853B()
            if (r0 == 0) goto L_0x009a
            android.widget.TextView r0 = r6.f19195c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            android.widget.TextView r3 = r6.f19195c
            android.content.Context r3 = r3.getContext()
            android.content.res.Resources r3 = r3.getResources()
            int r4 = com.yeelight.yeelib.R$string.common_text_color
            java.lang.String r3 = r3.getString(r4)
            r2.append(r3)
            r2.append(r1)
            int r1 = r7.mo31875g()
            int r1 = android.graphics.Color.red(r1)
            r2.append(r1)
            java.lang.String r1 = ", "
            r2.append(r1)
            int r3 = r7.mo31875g()
            int r3 = android.graphics.Color.green(r3)
            r2.append(r3)
            r2.append(r1)
            int r1 = r7.mo31875g()
            int r1 = android.graphics.Color.blue(r1)
            goto L_0x0044
        L_0x009a:
            boolean r0 = r7.mo31855D()
            if (r0 == 0) goto L_0x00c2
            android.widget.TextView r0 = r6.f19195c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            android.widget.TextView r3 = r6.f19195c
            android.content.Context r3 = r3.getContext()
            android.content.res.Resources r3 = r3.getResources()
            int r4 = com.yeelight.yeelib.R$string.personality_light_add_ct
            java.lang.String r3 = r3.getString(r4)
            r2.append(r3)
            r2.append(r1)
            int r1 = r7.mo31876h()
            goto L_0x0044
        L_0x00c2:
            boolean r0 = r7.mo31856E()
            if (r0 == 0) goto L_0x00de
            android.widget.TextView r0 = r6.f19195c
            android.content.Context r0 = r0.getContext()
            android.content.res.Resources r0 = r0.getResources()
            int r1 = com.yeelight.yeelib.R$string.common_text_flow
            java.lang.String r0 = r0.getString(r1)
            android.widget.TextView r1 = r6.f19195c
            r1.setText(r0)
            goto L_0x00f6
        L_0x00de:
            boolean r0 = r7.mo31857F()
            if (r0 == 0) goto L_0x00f6
            android.widget.TextView r0 = r6.f19195c
            android.content.Context r1 = r0.getContext()
            android.content.res.Resources r1 = r1.getResources()
            int r2 = com.yeelight.yeelib.R$string.common_text_night_light
            java.lang.String r1 = r1.getString(r2)
            goto L_0x004b
        L_0x00f6:
            android.widget.ImageView r0 = r6.f19198f
            com.yeelight.yeelib.ui.adapter.FavoriteSceneAdapter$b r1 = new com.yeelight.yeelib.ui.adapter.FavoriteSceneAdapter$b
            r1.<init>(r7)
            r0.setOnClickListener(r1)
            com.yeelight.yeelib.ui.view.LightView r0 = r6.f19193a
            java.lang.String r1 = r5.f19187a
            int[] r1 = r7.mo31873e(r1)
            r0.setColors(r1)
            boolean r0 = r5.f19191e
            if (r0 == 0) goto L_0x0116
            com.chauthai.swipereveallayout.SwipeRevealLayout r6 = r6.f19197e
            r7 = 1
            r6.setLockDrag(r7)
            goto L_0x012b
        L_0x0116:
            com.chauthai.swipereveallayout.a r0 = r5.f19190d
            com.chauthai.swipereveallayout.SwipeRevealLayout r1 = r6.f19197e
            int r7 = r7.mo31886r()
            java.lang.String r7 = java.lang.String.valueOf(r7)
            r0.mo10109d(r1, r7)
            com.chauthai.swipereveallayout.SwipeRevealLayout r6 = r6.f19197e
            r7 = 0
            r6.mo10084B(r7)
        L_0x012b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p194ui.adapter.FavoriteSceneAdapter.onBindViewHolder(com.yeelight.yeelib.ui.adapter.FavoriteSceneAdapter$FavoriteSceneVH, int):void");
    }

    /* renamed from: d */
    public FavoriteSceneVH onCreateViewHolder(ViewGroup viewGroup, int i) {
        FavoriteSceneVH favoriteSceneVH = new FavoriteSceneVH(this, LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.item_scene_favorite, viewGroup, false));
        favoriteSceneVH.itemView.setBackgroundColor(-1);
        return favoriteSceneVH;
    }

    /* renamed from: e */
    public void mo32656e(List<C9849r> list) {
        "Set scene data = " + Arrays.toString(list.toArray());
        this.f19188b.clear();
        this.f19188b.addAll(list);
        notifyDataSetChanged();
    }

    /* renamed from: f */
    public void mo32657f(C10356c cVar) {
        this.f19189c = cVar;
    }

    public int getItemCount() {
        return this.f19188b.size();
    }
}
