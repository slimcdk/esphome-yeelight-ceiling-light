package com.yeelight.yeelib.p142ui.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.picasso.Picasso;
import com.yeelight.yeelib.R$drawable;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.managers.C3108x;
import com.yeelight.yeelib.models.C8321m;
import com.yeelight.yeelib.p142ui.viewholder.RecommendSceneVH;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.yeelight.yeelib.ui.adapter.RecommendSceneAdapter */
public class RecommendSceneAdapter extends RecyclerView.Adapter<RecommendSceneVH> {

    /* renamed from: a */
    private List<C8321m> f15480a = new ArrayList();

    /* renamed from: b */
    private int f15481b;

    /* renamed from: c */
    private int f15482c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C8743b f15483d;

    /* renamed from: com.yeelight.yeelib.ui.adapter.RecommendSceneAdapter$a */
    class C8742a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ RecommendSceneVH f15484a;

        /* renamed from: b */
        final /* synthetic */ C8321m f15485b;

        C8742a(RecommendSceneVH recommendSceneVH, C8321m mVar) {
            this.f15484a = recommendSceneVH;
            this.f15485b = mVar;
        }

        public void onClick(View view) {
            if (RecommendSceneAdapter.this.f15483d != null) {
                RecommendSceneAdapter.this.f15483d.mo36049a(this.f15484a.getAdapterPosition(), this.f15485b);
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.adapter.RecommendSceneAdapter$b */
    public interface C8743b {
        /* renamed from: a */
        void mo36049a(int i, C8321m mVar);
    }

    /* renamed from: b */
    public void onBindViewHolder(RecommendSceneVH recommendSceneVH, int i) {
        C8321m mVar = this.f15480a.get(i);
        recommendSceneVH.f16149a.setText(mVar.mo35450q());
        recommendSceneVH.f16150b.setText(mVar.mo35442i());
        Picasso.m12253o(C3108x.f4951e).mo28111j(mVar.mo35405X()).mo28226g(this.f15481b, this.f15482c).mo28222a().mo28225f(R$drawable.recommend_scene_placeholder).mo28223d(recommendSceneVH.f16152d);
        recommendSceneVH.f16152d.setLayoutParams(new FrameLayout.LayoutParams(this.f15481b, this.f15482c));
        recommendSceneVH.f16151c.setOnClickListener(new C8742a(recommendSceneVH, mVar));
    }

    /* renamed from: c */
    public RecommendSceneVH onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2 = viewGroup.getResources().getDisplayMetrics().widthPixels;
        this.f15481b = i2;
        this.f15482c = (int) (((float) i2) / 2.1f);
        return new RecommendSceneVH(LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.item_scene_recommend, viewGroup, false));
    }

    /* renamed from: d */
    public void mo36046d(List<C8321m> list) {
        StringBuilder sb = new StringBuilder();
        sb.append("Set recommend data = ");
        sb.append(Arrays.toString(list.toArray()));
        this.f15480a.clear();
        this.f15480a.addAll(list);
        notifyDataSetChanged();
    }

    /* renamed from: e */
    public void mo36047e(C8743b bVar) {
        this.f15483d = bVar;
    }

    public int getItemCount() {
        return this.f15480a.size();
    }
}
