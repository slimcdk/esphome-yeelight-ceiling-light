package com.yeelight.yeelib.p194ui.fragment;

import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.device.models.C7632k;
import com.yeelight.yeelib.nativelib.NativeLightMix;
import com.yeelight.yeelib.p150c.p151i.C4200i;
import com.yeelight.yeelib.p150c.p183m.C7186q;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p153g.C4300b0;
import com.yeelight.yeelib.p153g.C9849r;
import com.yeelight.yeelib.p153g.C9856y;
import com.yeelight.yeelib.p194ui.adapter.RecommendSceneAdapter;
import com.yeelight.yeelib.p194ui.widget.C10521d;
import com.yeelight.yeelib.utils.C10547m;
import com.yeelight.yeelib.utils.C4308b;
import java.util.List;

/* renamed from: com.yeelight.yeelib.ui.fragment.RecommendSceneFragment */
public class RecommendSceneFragment extends Fragment {

    /* renamed from: a */
    RecyclerView f19293a;

    /* renamed from: b */
    private View f19294b;

    /* renamed from: c */
    private LinearLayoutManager f19295c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public RecommendSceneAdapter f19296d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C4200i f19297e;

    /* renamed from: f */
    private boolean f19298f;

    /* renamed from: g */
    private String f19299g;

    /* renamed from: h */
    private int f19300h = -1;

    /* renamed from: com.yeelight.yeelib.ui.fragment.RecommendSceneFragment$a */
    class C10383a extends RecyclerView.ItemDecoration {
        C10383a(RecommendSceneFragment recommendSceneFragment) {
        }

        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
            super.getItemOffsets(rect, view, recyclerView, state);
            rect.set(0, 0, 0, C10547m.m25752b(recyclerView.getContext(), 1.0f));
        }

        public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
            super.onDraw(canvas, recyclerView, state);
            int childCount = recyclerView.getChildCount();
            int paddingLeft = recyclerView.getPaddingLeft();
            int measuredWidth = recyclerView.getMeasuredWidth() - recyclerView.getPaddingRight();
            Paint paint = new Paint();
            paint.setColor(Color.parseColor("#EEEEEE"));
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView.getChildAt(i);
                int bottom = childAt.getBottom() + ((RecyclerView.LayoutParams) childAt.getLayoutParams()).bottomMargin;
                canvas.drawRect((float) paddingLeft, (float) bottom, (float) measuredWidth, (float) (C10547m.m25752b(recyclerView.getContext(), 1.0f) + bottom), paint);
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.fragment.RecommendSceneFragment$b */
    class C10384b implements RecommendSceneAdapter.C10358b {

        /* renamed from: com.yeelight.yeelib.ui.fragment.RecommendSceneFragment$b$a */
        class C10385a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C10521d f19302a;

            C10385a(C10384b bVar, C10521d dVar) {
                this.f19302a = dVar;
            }

            public void onClick(View view) {
                this.f19302a.dismiss();
            }
        }

        C10384b() {
        }

        /* renamed from: a */
        public void mo32666a(int i, C9849r rVar) {
            if (RecommendSceneFragment.this.f19297e.mo23408d0().mo27671W()) {
                int b = C7632k.m22545f(RecommendSceneFragment.this.f19297e.mo23330i1()).mo29080b();
                int a = C7632k.m22545f(RecommendSceneFragment.this.f19297e.mo23330i1()).mo29079a();
                if (rVar.mo31855D() && (rVar.mo31876h() > a || rVar.mo31876h() < b)) {
                    View inflate = View.inflate(RecommendSceneFragment.this.getActivity(), R$layout.kid_mode_not_support_layout, (ViewGroup) null);
                    if (inflate != null) {
                        C10521d a2 = new C10521d.C10523b(RecommendSceneFragment.this.getContext()).mo33316a();
                        ((TextView) inflate.findViewById(R$id.msg_kid_mode_no_support)).setText(String.format(RecommendSceneFragment.this.getResources().getString(R$string.custom_knob_custom_kidmode_notice), new Object[]{Integer.valueOf(rVar.mo31876h())}));
                        ((Button) inflate.findViewById(R$id.btn_kid_mode_no_cancel)).setOnClickListener(new C10385a(this, a2));
                        a2.mo33309e(inflate);
                        a2.show();
                        return;
                    }
                    return;
                }
            }
            RecommendSceneFragment.this.m25066u(rVar);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.fragment.RecommendSceneFragment$c */
    class C10386c implements C4300b0.C4307g {
        C10386c() {
        }

        /* renamed from: a */
        public void mo23766a(String str) {
        }

        /* renamed from: f */
        public void mo23767f() {
        }

        /* renamed from: n */
        public void mo23768n(boolean z, List<C9849r> list) {
            RecommendSceneFragment.this.f19296d.mo32663d(list);
        }

        public void onRefresh() {
        }

        /* renamed from: p */
        public void mo23770p(String str) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public void m25066u(C9849r rVar) {
        if (this.f19298f) {
            Intent intent = new Intent();
            intent.putExtra("scene", rVar.mo31886r());
            intent.putExtra("com.yeelight.cherry.device_id", this.f19297e.mo23372G());
            intent.putExtra("scene_type", 0);
            intent.putExtra("scene_name", rVar.mo31885q());
            intent.putExtra("position", this.f19300h);
            getActivity().setResult(-1, intent);
            getActivity().finish();
            return;
        }
        C4200i iVar = this.f19297e;
        if (iVar instanceof C7186q) {
            C9856y b = C9856y.m24058b(rVar);
            int g = rVar.mo31875g();
            if (g != -1) {
                b.mo31862K(NativeLightMix.color_rgb_trans((char) Color.red(g), (char) Color.green(g), (char) Color.blue(g)));
                this.f19297e.mo23355x1(b);
                Toast.makeText(getActivity(), R$string.common_text_apply_success, 0).show();
            }
            iVar = this.f19297e;
        }
        iVar.mo23355x1(rVar);
        Toast.makeText(getActivity(), R$string.common_text_apply_success, 0).show();
    }

    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        View inflate = layoutInflater.inflate(R$layout.fragment_scene, viewGroup, false);
        this.f19294b = inflate;
        this.f19293a = (RecyclerView) inflate.findViewById(R$id.recycle_view);
        C4200i o0 = C4257w.m11953o0(getArguments().getString("com.yeelight.cherry.device_id"));
        this.f19297e = o0;
        if (o0 == null) {
            C4308b.m12139r("RecommendSceneFragment", "Device shouldn't be null!!!");
        }
        this.f19299g = this.f19297e.mo23330i1();
        this.f19298f = getArguments().getBoolean("start_for_result", false);
        this.f19300h = getArguments().getInt("position", -1);
        return this.f19294b;
    }

    public void onResume() {
        super.onResume();
        C4300b0.m12083u().mo23749m(this.f19299g, new C10386c(), true);
    }

    public void onViewCreated(View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        this.f19295c = linearLayoutManager;
        this.f19293a.setLayoutManager(linearLayoutManager);
        this.f19293a.setItemAnimator(new DefaultItemAnimator());
        RecommendSceneAdapter recommendSceneAdapter = new RecommendSceneAdapter();
        this.f19296d = recommendSceneAdapter;
        this.f19293a.setAdapter(recommendSceneAdapter);
        this.f19293a.addItemDecoration(new C10383a(this));
        this.f19296d.mo32664e(new C10384b());
    }
}
