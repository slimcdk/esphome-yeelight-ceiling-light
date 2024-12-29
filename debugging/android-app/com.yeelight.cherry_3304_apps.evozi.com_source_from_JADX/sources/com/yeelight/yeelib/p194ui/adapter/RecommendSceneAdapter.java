package com.yeelight.yeelib.p194ui.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.yeelight.yeelib.R$drawable;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.p152f.C4297y;
import com.yeelight.yeelib.p153g.C9849r;
import com.yeelight.yeelib.p194ui.viewholder.RecommendSceneVH;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p011c.p083d.p090b.C1203t;
import p011c.p083d.p090b.C1219x;

/* renamed from: com.yeelight.yeelib.ui.adapter.RecommendSceneAdapter */
public class RecommendSceneAdapter extends RecyclerView.Adapter<RecommendSceneVH> {

    /* renamed from: a */
    private List<C9849r> f19204a = new ArrayList();

    /* renamed from: b */
    private int f19205b;

    /* renamed from: c */
    private int f19206c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C10358b f19207d;

    /* renamed from: com.yeelight.yeelib.ui.adapter.RecommendSceneAdapter$a */
    class C10357a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ RecommendSceneVH f19208a;

        /* renamed from: b */
        final /* synthetic */ C9849r f19209b;

        C10357a(RecommendSceneVH recommendSceneVH, C9849r rVar) {
            this.f19208a = recommendSceneVH;
            this.f19209b = rVar;
        }

        public void onClick(View view) {
            if (RecommendSceneAdapter.this.f19207d != null) {
                RecommendSceneAdapter.this.f19207d.mo32666a(this.f19208a.getAdapterPosition(), this.f19209b);
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.adapter.RecommendSceneAdapter$b */
    public interface C10358b {
        /* renamed from: a */
        void mo32666a(int i, C9849r rVar);
    }

    /* renamed from: b */
    public void onBindViewHolder(RecommendSceneVH recommendSceneVH, int i) {
        C9849r rVar = this.f19204a.get(i);
        recommendSceneVH.f19891a.setText(rVar.mo31885q());
        recommendSceneVH.f19892b.setText(rVar.mo31877i());
        C1219x j = C1203t.m3106o(C4297y.f7456e).mo10003j(rVar.mo31818W());
        j.mo10039g(this.f19205b, this.f19206c);
        j.mo10035a();
        j.mo10038f(R$drawable.recommend_scene_placeholder);
        j.mo10036d(recommendSceneVH.f19894d);
        recommendSceneVH.f19894d.setLayoutParams(new FrameLayout.LayoutParams(this.f19205b, this.f19206c));
        recommendSceneVH.f19893c.setOnClickListener(new C10357a(recommendSceneVH, rVar));
    }

    /* renamed from: c */
    public RecommendSceneVH onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2 = viewGroup.getResources().getDisplayMetrics().widthPixels;
        this.f19205b = i2;
        this.f19206c = (int) (((float) i2) / 2.1f);
        return new RecommendSceneVH(LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.item_scene_recommend, viewGroup, false));
    }

    /* renamed from: d */
    public void mo32663d(List<C9849r> list) {
        "Set recommend data = " + Arrays.toString(list.toArray());
        this.f19204a.clear();
        this.f19204a.addAll(list);
        notifyDataSetChanged();
    }

    /* renamed from: e */
    public void mo32664e(C10358b bVar) {
        this.f19207d = bVar;
    }

    public int getItemCount() {
        return this.f19204a.size();
    }
}
