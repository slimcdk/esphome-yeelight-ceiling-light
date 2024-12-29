package com.yeelight.yeelib.p142ui.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.chauthai.swipereveallayout.C0635a;
import com.chauthai.swipereveallayout.SwipeRevealLayout;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.models.C3112v;
import com.yeelight.yeelib.models.C8321m;
import com.yeelight.yeelib.p142ui.view.LightView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.yeelight.yeelib.ui.adapter.FavoriteSceneAdapter */
public class FavoriteSceneAdapter extends RecyclerView.Adapter<FavoriteSceneVH> {

    /* renamed from: a */
    private final String f15463a;

    /* renamed from: b */
    private List<C8321m> f15464b = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C8741c f15465c;

    /* renamed from: d */
    private final C0635a f15466d;

    /* renamed from: e */
    private boolean f15467e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C3112v.C3119g f15468f;

    /* renamed from: com.yeelight.yeelib.ui.adapter.FavoriteSceneAdapter$FavoriteSceneVH */
    public class FavoriteSceneVH extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public LightView f15469a;

        /* renamed from: b */
        public TextView f15470b;

        /* renamed from: c */
        public TextView f15471c;

        /* renamed from: d */
        public LinearLayout f15472d;

        /* renamed from: e */
        public SwipeRevealLayout f15473e;

        /* renamed from: f */
        public ImageView f15474f;

        public FavoriteSceneVH(FavoriteSceneAdapter favoriteSceneAdapter, View view) {
            super(view);
            this.f15473e = (SwipeRevealLayout) view.findViewById(R$id.swipe_reveal_layout);
            this.f15469a = (LightView) view.findViewById(R$id.fav_img);
            this.f15470b = (TextView) view.findViewById(R$id.fav_name);
            this.f15471c = (TextView) view.findViewById(R$id.fav_value);
            this.f15472d = (LinearLayout) view.findViewById(R$id.fav_apply);
            this.f15474f = (ImageView) view.findViewById(R$id.img_delete);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.adapter.FavoriteSceneAdapter$a */
    class C8739a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ FavoriteSceneVH f15475a;

        /* renamed from: b */
        final /* synthetic */ C8321m f15476b;

        C8739a(FavoriteSceneVH favoriteSceneVH, C8321m mVar) {
            this.f15475a = favoriteSceneVH;
            this.f15476b = mVar;
        }

        public void onClick(View view) {
            if (FavoriteSceneAdapter.this.f15465c != null) {
                FavoriteSceneAdapter.this.f15465c.mo36043a(this.f15475a.getAdapterPosition(), this.f15476b);
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.adapter.FavoriteSceneAdapter$b */
    class C8740b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C8321m f15478a;

        C8740b(C8321m mVar) {
            this.f15478a = mVar;
        }

        public void onClick(View view) {
            C3112v.m8242u().mo23555f(this.f15478a, FavoriteSceneAdapter.this.f15468f);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.adapter.FavoriteSceneAdapter$c */
    public interface C8741c {
        /* renamed from: a */
        void mo36043a(int i, C8321m mVar);
    }

    public FavoriteSceneAdapter(String str, boolean z, C3112v.C3119g gVar) {
        C0635a aVar = new C0635a();
        this.f15466d = aVar;
        this.f15467e = false;
        this.f15463a = str;
        aVar.mo11089h(true);
        this.f15467e = z;
        this.f15468f = gVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x011c  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onBindViewHolder(com.yeelight.yeelib.p142ui.adapter.FavoriteSceneAdapter.FavoriteSceneVH r6, int r7) {
        /*
            r5 = this;
            java.util.List<com.yeelight.yeelib.models.m> r0 = r5.f15464b
            java.lang.Object r7 = r0.get(r7)
            com.yeelight.yeelib.models.m r7 = (com.yeelight.yeelib.models.C8321m) r7
            android.widget.TextView r0 = r6.f15470b
            java.lang.String r1 = r7.mo35450q()
            r0.setText(r1)
            android.widget.LinearLayout r0 = r6.f15472d
            com.yeelight.yeelib.ui.adapter.FavoriteSceneAdapter$a r1 = new com.yeelight.yeelib.ui.adapter.FavoriteSceneAdapter$a
            r1.<init>(r6, r7)
            r0.setOnClickListener(r1)
            boolean r0 = r7.mo35458y()
            java.lang.String r1 = "："
            if (r0 == 0) goto L_0x0050
            android.widget.TextView r0 = r6.f15471c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            android.widget.TextView r3 = r6.f15471c
            android.content.Context r3 = r3.getContext()
            android.content.res.Resources r3 = r3.getResources()
            int r4 = com.yeelight.yeelib.R$string.common_text_bright
            java.lang.String r3 = r3.getString(r4)
            r2.append(r3)
            r2.append(r1)
            int r1 = r7.mo35439f()
        L_0x0044:
            r2.append(r1)
            java.lang.String r1 = r2.toString()
        L_0x004b:
            r0.setText(r1)
            goto L_0x00fc
        L_0x0050:
            boolean r0 = r7.mo35417B()
            if (r0 == 0) goto L_0x009a
            android.widget.TextView r0 = r6.f15471c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            android.widget.TextView r3 = r6.f15471c
            android.content.Context r3 = r3.getContext()
            android.content.res.Resources r3 = r3.getResources()
            int r4 = com.yeelight.yeelib.R$string.common_text_color
            java.lang.String r3 = r3.getString(r4)
            r2.append(r3)
            r2.append(r1)
            int r1 = r7.mo35440g()
            int r1 = android.graphics.Color.red(r1)
            r2.append(r1)
            java.lang.String r1 = ", "
            r2.append(r1)
            int r3 = r7.mo35440g()
            int r3 = android.graphics.Color.green(r3)
            r2.append(r3)
            r2.append(r1)
            int r1 = r7.mo35440g()
            int r1 = android.graphics.Color.blue(r1)
            goto L_0x0044
        L_0x009a:
            boolean r0 = r7.mo35419D()
            if (r0 == 0) goto L_0x00c2
            android.widget.TextView r0 = r6.f15471c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            android.widget.TextView r3 = r6.f15471c
            android.content.Context r3 = r3.getContext()
            android.content.res.Resources r3 = r3.getResources()
            int r4 = com.yeelight.yeelib.R$string.personality_light_add_ct
            java.lang.String r3 = r3.getString(r4)
            r2.append(r3)
            r2.append(r1)
            int r1 = r7.mo35441h()
            goto L_0x0044
        L_0x00c2:
            boolean r0 = r7.mo35420E()
            if (r0 == 0) goto L_0x00de
            android.widget.TextView r0 = r6.f15471c
            android.content.Context r0 = r0.getContext()
            android.content.res.Resources r0 = r0.getResources()
            int r1 = com.yeelight.yeelib.R$string.common_text_flow
            java.lang.String r0 = r0.getString(r1)
            android.widget.TextView r1 = r6.f15471c
            r1.setText(r0)
            goto L_0x00fc
        L_0x00de:
            boolean r0 = r7.mo35421F()
            if (r0 != 0) goto L_0x00ea
            boolean r0 = r7.mo35422G()
            if (r0 == 0) goto L_0x00fc
        L_0x00ea:
            android.widget.TextView r0 = r6.f15471c
            android.content.Context r1 = r0.getContext()
            android.content.res.Resources r1 = r1.getResources()
            int r2 = com.yeelight.yeelib.R$string.common_text_night_light
            java.lang.String r1 = r1.getString(r2)
            goto L_0x004b
        L_0x00fc:
            android.widget.ImageView r0 = r6.f15474f
            com.yeelight.yeelib.ui.adapter.FavoriteSceneAdapter$b r1 = new com.yeelight.yeelib.ui.adapter.FavoriteSceneAdapter$b
            r1.<init>(r7)
            r0.setOnClickListener(r1)
            com.yeelight.yeelib.ui.view.LightView r0 = r6.f15469a
            java.lang.String r1 = r5.f15463a
            int[] r1 = r7.mo35438e(r1)
            r0.setColors(r1)
            boolean r0 = r5.f15467e
            if (r0 == 0) goto L_0x011c
            com.chauthai.swipereveallayout.SwipeRevealLayout r6 = r6.f15473e
            r7 = 1
            r6.setLockDrag(r7)
            goto L_0x0131
        L_0x011c:
            com.chauthai.swipereveallayout.a r0 = r5.f15466d
            com.chauthai.swipereveallayout.SwipeRevealLayout r1 = r6.f15473e
            int r7 = r7.mo35451r()
            java.lang.String r7 = java.lang.String.valueOf(r7)
            r0.mo11087d(r1, r7)
            com.chauthai.swipereveallayout.SwipeRevealLayout r6 = r6.f15473e
            r7 = 0
            r6.mo11062B(r7)
        L_0x0131:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p142ui.adapter.FavoriteSceneAdapter.onBindViewHolder(com.yeelight.yeelib.ui.adapter.FavoriteSceneAdapter$FavoriteSceneVH, int):void");
    }

    /* renamed from: d */
    public FavoriteSceneVH onCreateViewHolder(ViewGroup viewGroup, int i) {
        FavoriteSceneVH favoriteSceneVH = new FavoriteSceneVH(this, LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.item_scene_favorite, viewGroup, false));
        favoriteSceneVH.itemView.setBackgroundColor(-1);
        return favoriteSceneVH;
    }

    /* renamed from: e */
    public void mo36039e(List<C8321m> list) {
        StringBuilder sb = new StringBuilder();
        sb.append("Set scene data = ");
        sb.append(Arrays.toString(list.toArray()));
        this.f15464b.clear();
        this.f15464b.addAll(list);
        notifyDataSetChanged();
    }

    /* renamed from: f */
    public void mo36040f(C8741c cVar) {
        this.f15465c = cVar;
    }

    public int getItemCount() {
        return this.f15464b.size();
    }
}
