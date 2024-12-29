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
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.lcodecore.tkrefreshlayout.C3387a;
import com.lcodecore.tkrefreshlayout.C3392f;
import com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout;
import com.miot.api.Constants;
import com.yeelight.yeelib.R$color;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.device.models.C7632k;
import com.yeelight.yeelib.nativelib.NativeLightMix;
import com.yeelight.yeelib.p150c.p151i.C4200i;
import com.yeelight.yeelib.p150c.p151i.C6017a;
import com.yeelight.yeelib.p150c.p183m.C7186q;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p153g.C4300b0;
import com.yeelight.yeelib.p153g.C9849r;
import com.yeelight.yeelib.p153g.C9856y;
import com.yeelight.yeelib.p194ui.adapter.FavoriteSceneAdapter;
import com.yeelight.yeelib.p194ui.view.C10493b;
import com.yeelight.yeelib.p194ui.widget.C10521d;
import com.yeelight.yeelib.utils.C10547m;
import com.yeelight.yeelib.utils.C4308b;
import java.util.List;

/* renamed from: com.yeelight.yeelib.ui.fragment.FavoriteSceneFragment */
public class FavoriteSceneFragment extends Fragment implements C4300b0.C4307g {

    /* renamed from: a */
    RecyclerView f19276a;

    /* renamed from: b */
    private View f19277b;

    /* renamed from: c */
    private LinearLayoutManager f19278c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public FavoriteSceneAdapter f19279d;

    /* renamed from: e */
    TwinklingRefreshLayout f19280e;

    /* renamed from: f */
    LinearLayout f19281f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C4200i f19282g;

    /* renamed from: h */
    private boolean f19283h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public String f19284i;

    /* renamed from: j */
    private int f19285j = -1;

    /* renamed from: k */
    private int f19286k = -1;

    /* renamed from: com.yeelight.yeelib.ui.fragment.FavoriteSceneFragment$a */
    class C10376a implements FavoriteSceneAdapter.C10356c {

        /* renamed from: com.yeelight.yeelib.ui.fragment.FavoriteSceneFragment$a$a */
        class C10377a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C10521d f19288a;

            C10377a(C10376a aVar, C10521d dVar) {
                this.f19288a = dVar;
            }

            public void onClick(View view) {
                this.f19288a.dismiss();
            }
        }

        C10376a() {
        }

        /* renamed from: a */
        public void mo32660a(int i, C9849r rVar) {
            if (FavoriteSceneFragment.this.f19282g.mo23408d0().mo27671W()) {
                int b = C7632k.m22545f(FavoriteSceneFragment.this.f19282g.mo23330i1()).mo29080b();
                int a = C7632k.m22545f(FavoriteSceneFragment.this.f19282g.mo23330i1()).mo29079a();
                if (rVar.mo31855D() && (rVar.mo31876h() > a || rVar.mo31876h() < b)) {
                    View inflate = View.inflate(FavoriteSceneFragment.this.getActivity(), R$layout.kid_mode_not_support_layout, (ViewGroup) null);
                    if (inflate != null) {
                        C10521d a2 = new C10521d.C10523b(FavoriteSceneFragment.this.getContext()).mo33316a();
                        ((TextView) inflate.findViewById(R$id.msg_kid_mode_no_support)).setText(String.format(FavoriteSceneFragment.this.getResources().getString(R$string.custom_knob_custom_kidmode_notice), new Object[]{String.valueOf(rVar.mo31876h())}));
                        ((Button) inflate.findViewById(R$id.btn_kid_mode_no_cancel)).setOnClickListener(new C10377a(this, a2));
                        a2.mo33309e(inflate);
                        a2.show();
                        return;
                    }
                    return;
                }
            }
            FavoriteSceneFragment.this.m25036z(rVar);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.fragment.FavoriteSceneFragment$b */
    class C10378b extends RecyclerView.ItemDecoration {
        C10378b(FavoriteSceneFragment favoriteSceneFragment) {
        }

        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
            super.getItemOffsets(rect, view, recyclerView, state);
        }

        public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
            float f;
            float f2;
            float f3;
            super.onDrawOver(canvas, recyclerView, state);
            int childCount = recyclerView.getChildCount();
            int paddingLeft = recyclerView.getPaddingLeft();
            int measuredWidth = recyclerView.getMeasuredWidth() - recyclerView.getPaddingRight();
            Paint paint = new Paint();
            paint.setColor(recyclerView.getContext().getResources().getColor(R$color.common_color_divider_line));
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView.getChildAt(i);
                int bottom = childAt.getBottom() + ((RecyclerView.LayoutParams) childAt.getLayoutParams()).bottomMargin;
                int i2 = bottom + 1;
                if (i == childCount - 1) {
                    f3 = (float) paddingLeft;
                    f2 = (float) bottom;
                    f = (float) measuredWidth;
                    i2 -= 2;
                } else {
                    f3 = (float) (C10547m.m25752b(recyclerView.getContext(), 20.0f) + paddingLeft);
                    f2 = (float) bottom;
                    f = (float) measuredWidth;
                }
                canvas.drawRect(f3, f2, f, (float) i2, paint);
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.fragment.FavoriteSceneFragment$c */
    class C10379c extends C3392f {
        C10379c() {
        }

        /* renamed from: a */
        public void mo18610a(TwinklingRefreshLayout twinklingRefreshLayout) {
        }

        /* renamed from: e */
        public void mo18615e(TwinklingRefreshLayout twinklingRefreshLayout) {
            FavoriteSceneFragment.this.m25028D();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.fragment.FavoriteSceneFragment$d */
    class C10380d implements C4300b0.C4307g {
        C10380d() {
        }

        /* renamed from: a */
        public void mo23766a(String str) {
        }

        /* renamed from: b */
        public /* synthetic */ void mo32724b() {
            FavoriteSceneFragment.this.f19279d.mo32656e(C4300b0.m12083u().mo23751p(FavoriteSceneFragment.this.f19284i));
            FavoriteSceneFragment.this.m25029F();
        }

        /* renamed from: f */
        public void mo23767f() {
        }

        /* renamed from: n */
        public void mo23768n(boolean z, List<C9849r> list) {
        }

        public void onRefresh() {
            FavoriteSceneFragment.this.f19280e.post(new C10387a(this));
        }

        /* renamed from: p */
        public void mo23770p(String str) {
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.fragment.FavoriteSceneFragment$e */
    class C10381e implements C4300b0.C4307g {
        C10381e() {
        }

        /* renamed from: a */
        public void mo23766a(String str) {
        }

        /* renamed from: b */
        public /* synthetic */ void mo32725b() {
            FavoriteSceneFragment.this.f19279d.mo32656e(C4300b0.m12083u().mo23751p(FavoriteSceneFragment.this.f19284i));
            FavoriteSceneFragment.this.m25029F();
        }

        /* renamed from: f */
        public void mo23767f() {
        }

        /* renamed from: n */
        public void mo23768n(boolean z, List<C9849r> list) {
        }

        public void onRefresh() {
            FavoriteSceneFragment.this.f19280e.post(new C10388b(this));
        }

        /* renamed from: p */
        public void mo23770p(String str) {
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.fragment.FavoriteSceneFragment$f */
    class C10382f implements C4300b0.C4307g {
        C10382f() {
        }

        /* renamed from: a */
        public void mo23766a(String str) {
            FavoriteSceneFragment.this.f19280e.post(new C10389c(this));
        }

        /* renamed from: b */
        public /* synthetic */ void mo32726b() {
            FavoriteSceneFragment.this.f19280e.mo18609A();
        }

        /* renamed from: c */
        public /* synthetic */ void mo32727c() {
            FavoriteSceneFragment.this.f19279d.mo32656e(C4300b0.m12083u().mo23751p(FavoriteSceneFragment.this.f19284i));
            FavoriteSceneFragment.this.m25029F();
            FavoriteSceneFragment.this.f19280e.mo18609A();
        }

        /* renamed from: f */
        public void mo23767f() {
        }

        /* renamed from: n */
        public void mo23768n(boolean z, List<C9849r> list) {
        }

        public void onRefresh() {
            FavoriteSceneFragment.this.f19280e.post(new C10390d(this));
        }

        /* renamed from: p */
        public void mo23770p(String str) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: D */
    public void m25028D() {
        if (C4300b0.m12083u().mo23751p(this.f19284i) != null) {
            this.f19279d.mo32656e(C4300b0.m12083u().mo23751p(this.f19284i));
            m25029F();
        }
        C4300b0.m12083u().mo23752q(this.f19284i, new C10382f());
    }

    /* access modifiers changed from: private */
    /* renamed from: F */
    public void m25029F() {
        this.f19281f.post(new C10392f(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public void m25036z(C9849r rVar) {
        if (this.f19283h) {
            Intent intent = new Intent();
            intent.putExtra("scene", rVar.mo31886r());
            intent.putExtra("com.yeelight.cherry.device_id", this.f19282g.mo23372G());
            intent.putExtra("scene_type", 1);
            intent.putExtra("scene_name", rVar.mo31885q());
            intent.putExtra("position", this.f19285j);
            intent.putExtra(Constants.EXTRA_PUSH_COMMAND, rVar.mo31743a().toString());
            getActivity().setResult(-1, intent);
            getActivity().finish();
            return;
        }
        C4200i iVar = this.f19282g;
        if (iVar instanceof C7186q) {
            C9856y b = C9856y.m24058b(rVar);
            int g = rVar.mo31875g();
            if (g != -1) {
                b.mo31862K(NativeLightMix.color_rgb_trans((char) Color.red(g), (char) Color.green(g), (char) Color.blue(g)));
                this.f19282g.mo23355x1(b);
                Toast.makeText(getActivity(), R$string.common_text_apply_success, 0).show();
            }
            iVar = this.f19282g;
        } else if (this.f19286k == 2) {
            ((C6017a) iVar).mo27595o2(rVar);
            Toast.makeText(getActivity(), R$string.common_text_apply_success, 0).show();
        }
        iVar.mo23355x1(rVar);
        Toast.makeText(getActivity(), R$string.common_text_apply_success, 0).show();
    }

    /* renamed from: A */
    public void mo32720A(Bundle bundle) {
        C4200i o0 = C4257w.m11953o0(bundle.getString("com.yeelight.cherry.device_id"));
        this.f19282g = o0;
        if (o0 == null) {
            C4308b.m12139r("FavoriteSceneFragment", "Device shouldn't be null!!!");
        }
        int i = bundle.getInt("device_lamp_mode", -1);
        this.f19286k = i;
        this.f19284i = i == 2 ? "yeelink.light.ceiling4.ambi" : this.f19282g.mo23330i1();
        this.f19283h = bundle.getBoolean("start_for_result", false);
        this.f19285j = bundle.getInt("position", -1);
        FavoriteSceneAdapter favoriteSceneAdapter = new FavoriteSceneAdapter(this.f19284i, this.f19283h, this);
        this.f19279d = favoriteSceneAdapter;
        this.f19276a.setAdapter(favoriteSceneAdapter);
        this.f19279d.mo32657f(new C10376a());
    }

    /* renamed from: B */
    public /* synthetic */ void mo32721B(String str) {
        Toast.makeText(getActivity(), str, 0).show();
    }

    /* renamed from: C */
    public /* synthetic */ void mo32722C() {
        int i;
        LinearLayout linearLayout;
        if (C4300b0.m12083u().mo23751p(this.f19284i).size() > 0) {
            linearLayout = this.f19281f;
            i = 4;
        } else {
            linearLayout = this.f19281f;
            i = 0;
        }
        linearLayout.setVisibility(i);
    }

    /* renamed from: a */
    public void mo23766a(String str) {
    }

    /* renamed from: f */
    public void mo23767f() {
        C4300b0.m12083u().mo23752q(this.f19284i, new C10381e());
    }

    /* renamed from: n */
    public void mo23768n(boolean z, List<C9849r> list) {
    }

    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        View inflate = layoutInflater.inflate(R$layout.fragment_scene, viewGroup, false);
        this.f19277b = inflate;
        this.f19276a = (RecyclerView) inflate.findViewById(R$id.recycle_view);
        return this.f19277b;
    }

    public void onRefresh() {
        C4300b0.m12083u().mo23752q(this.f19284i, new C10380d());
    }

    public void onResume() {
        super.onResume();
        m25028D();
    }

    public void onViewCreated(View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        this.f19278c = linearLayoutManager;
        this.f19276a.setLayoutManager(linearLayoutManager);
        this.f19276a.setItemAnimator(new DefaultItemAnimator());
        this.f19276a.addItemDecoration(new C10378b(this));
        this.f19280e = (TwinklingRefreshLayout) view.findViewById(R$id.refresh_layout);
        C10493b bVar = new C10493b(getContext());
        this.f19280e.setOverScrollRefreshShow(false);
        this.f19280e.setHeaderView(bVar);
        this.f19280e.setBottomView((C3387a) null);
        this.f19280e.setEnableLoadmore(false);
        this.f19280e.setEnableOverScroll(true);
        this.f19280e.setOnRefreshListener(new C10379c());
        this.f19281f = (LinearLayout) view.findViewById(R$id.no_update_layout);
    }

    /* renamed from: p */
    public void mo23770p(String str) {
        this.f19281f.post(new C10391e(this, str));
    }
}
