package com.yeelight.yeelib.p142ui.fragment;

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
import com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout;
import com.miot.api.Constants;
import com.yeelight.yeelib.R$color;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.device.base.C3012e;
import com.yeelight.yeelib.device.base.C6091a;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.models.C3112v;
import com.yeelight.yeelib.models.C8321m;
import com.yeelight.yeelib.models.C8327s;
import com.yeelight.yeelib.nativelib.NativeLightMix;
import com.yeelight.yeelib.p142ui.adapter.FavoriteSceneAdapter;
import com.yeelight.yeelib.p142ui.view.C8869a;
import com.yeelight.yeelib.p142ui.widget.C8891a;
import com.yeelight.yeelib.utils.AppUtils;
import java.util.List;
import p051j4.C9193k;
import p096s2.C3686a;
import p096s2.C3691f;
import p165h4.C9092a;
import p165h4.C9093b;
import p223w3.C11627r;
import p227x3.C11972i;

/* renamed from: com.yeelight.yeelib.ui.fragment.FavoriteSceneFragment */
public class FavoriteSceneFragment extends Fragment implements C3112v.C3119g {

    /* renamed from: a */
    RecyclerView f15541a;

    /* renamed from: b */
    private View f15542b;

    /* renamed from: c */
    private LinearLayoutManager f15543c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public FavoriteSceneAdapter f15544d;

    /* renamed from: e */
    TwinklingRefreshLayout f15545e;

    /* renamed from: f */
    LinearLayout f15546f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C3012e f15547g;

    /* renamed from: h */
    private boolean f15548h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public String f15549i;

    /* renamed from: j */
    private int f15550j = -1;

    /* renamed from: k */
    private int f15551k = -1;

    /* renamed from: com.yeelight.yeelib.ui.fragment.FavoriteSceneFragment$a */
    class C8757a implements FavoriteSceneAdapter.C8741c {

        /* renamed from: com.yeelight.yeelib.ui.fragment.FavoriteSceneFragment$a$a */
        class C8758a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C8891a f15553a;

            C8758a(C8757a aVar, C8891a aVar2) {
                this.f15553a = aVar2;
            }

            public void onClick(View view) {
                this.f15553a.dismiss();
            }
        }

        C8757a() {
        }

        /* renamed from: a */
        public void mo36043a(int i, C8321m mVar) {
            if (FavoriteSceneFragment.this.f15547g.mo23221d0().mo31572X()) {
                int b = C11972i.m30708f(FavoriteSceneFragment.this.f15547g.mo23144i1()).mo42547b();
                int a = C11972i.m30708f(FavoriteSceneFragment.this.f15547g.mo23144i1()).mo42546a();
                if (mVar.mo35419D() && (mVar.mo35441h() > a || mVar.mo35441h() < b)) {
                    View inflate = View.inflate(FavoriteSceneFragment.this.getActivity(), R$layout.kid_mode_not_support_layout, (ViewGroup) null);
                    if (inflate != null) {
                        C8891a a2 = new C8891a.C8893b(FavoriteSceneFragment.this.getContext()).mo36655a();
                        ((TextView) inflate.findViewById(R$id.msg_kid_mode_no_support)).setText(String.format(FavoriteSceneFragment.this.getResources().getString(R$string.custom_knob_custom_kidmode_notice), new Object[]{String.valueOf(mVar.mo35441h())}));
                        ((Button) inflate.findViewById(R$id.btn_kid_mode_no_cancel)).setOnClickListener(new C8758a(this, a2));
                        a2.mo36648e(inflate);
                        a2.show();
                        return;
                    }
                    return;
                }
            }
            FavoriteSceneFragment.this.m20637F(mVar);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.fragment.FavoriteSceneFragment$b */
    class C8759b extends RecyclerView.ItemDecoration {
        C8759b(FavoriteSceneFragment favoriteSceneFragment) {
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
                    f3 = (float) (C9193k.m22151b(recyclerView.getContext(), 20.0f) + paddingLeft);
                    f2 = (float) bottom;
                    f = (float) measuredWidth;
                }
                canvas.drawRect(f3, f2, f, (float) i2, paint);
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.fragment.FavoriteSceneFragment$c */
    class C8760c extends C3691f {
        C8760c() {
        }

        /* renamed from: a */
        public void mo20223a(TwinklingRefreshLayout twinklingRefreshLayout) {
        }

        /* renamed from: e */
        public void mo20228e(TwinklingRefreshLayout twinklingRefreshLayout) {
            FavoriteSceneFragment.this.m20640K();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.fragment.FavoriteSceneFragment$d */
    class C8761d implements C3112v.C3119g {
        C8761d() {
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public /* synthetic */ void m20655c() {
            FavoriteSceneFragment.this.f15544d.mo36039e(C3112v.m8242u().mo23564p(FavoriteSceneFragment.this.f15549i));
            FavoriteSceneFragment.this.m20641M();
        }

        /* renamed from: a */
        public void mo23579a(String str) {
        }

        /* renamed from: g */
        public void mo23580g() {
        }

        public void onRefresh() {
            FavoriteSceneFragment.this.f15545e.post(new C8768a(this));
        }

        /* renamed from: r */
        public void mo23582r(boolean z, List<C8321m> list) {
        }

        /* renamed from: s */
        public void mo23583s(String str) {
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.fragment.FavoriteSceneFragment$e */
    class C8762e implements C3112v.C3119g {
        C8762e() {
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public /* synthetic */ void m20661c() {
            FavoriteSceneFragment.this.f15544d.mo36039e(C3112v.m8242u().mo23564p(FavoriteSceneFragment.this.f15549i));
            FavoriteSceneFragment.this.m20641M();
        }

        /* renamed from: a */
        public void mo23579a(String str) {
        }

        /* renamed from: g */
        public void mo23580g() {
        }

        public void onRefresh() {
            FavoriteSceneFragment.this.f15545e.post(new C8769b(this));
        }

        /* renamed from: r */
        public void mo23582r(boolean z, List<C8321m> list) {
        }

        /* renamed from: s */
        public void mo23583s(String str) {
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.fragment.FavoriteSceneFragment$f */
    class C8763f implements C3112v.C3119g {
        C8763f() {
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m20668d() {
            FavoriteSceneFragment.this.f15545e.mo20222A();
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ void m20669e() {
            FavoriteSceneFragment.this.f15544d.mo36039e(C3112v.m8242u().mo23564p(FavoriteSceneFragment.this.f15549i));
            FavoriteSceneFragment.this.m20641M();
            FavoriteSceneFragment.this.f15545e.mo20222A();
        }

        /* renamed from: a */
        public void mo23579a(String str) {
            FavoriteSceneFragment.this.f15545e.post(new C8770c(this));
        }

        /* renamed from: g */
        public void mo23580g() {
        }

        public void onRefresh() {
            FavoriteSceneFragment.this.f15545e.post(new C8771d(this));
        }

        /* renamed from: r */
        public void mo23582r(boolean z, List<C8321m> list) {
        }

        /* renamed from: s */
        public void mo23583s(String str) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: F */
    public void m20637F(C8321m mVar) {
        if (this.f15548h) {
            Intent intent = new Intent();
            intent.putExtra("scene", mVar.mo35451r());
            intent.putExtra("com.yeelight.cherry.device_id", this.f15547g.mo23185G());
            intent.putExtra("scene_type", 1);
            intent.putExtra("scene_name", mVar.mo35450q());
            intent.putExtra("position", this.f15550j);
            intent.putExtra(Constants.EXTRA_PUSH_COMMAND, mVar.mo35294a().toString());
            getActivity().setResult(-1, intent);
            getActivity().finish();
            return;
        }
        C3012e eVar = this.f15547g;
        if (eVar instanceof C11627r) {
            C8327s b = C8327s.m19803b(mVar);
            int g = mVar.mo35440g();
            if (g != -1) {
                b.mo35427L(NativeLightMix.color_rgb_trans((char) Color.red(g), (char) Color.green(g), (char) Color.blue(g)));
                this.f15547g.mo23168x1(b);
                Toast.makeText(getActivity(), R$string.common_text_apply_success, 0).show();
            }
            eVar = this.f15547g;
        } else if (this.f15551k == 2) {
            ((C6091a) eVar).mo31661o2(mVar);
            Toast.makeText(getActivity(), R$string.common_text_apply_success, 0).show();
        }
        eVar.mo23168x1(mVar);
        Toast.makeText(getActivity(), R$string.common_text_apply_success, 0).show();
    }

    /* access modifiers changed from: private */
    /* renamed from: H */
    public /* synthetic */ void m20638H(String str) {
        Toast.makeText(getActivity(), str, 0).show();
    }

    /* access modifiers changed from: private */
    /* renamed from: J */
    public /* synthetic */ void m20639J() {
        int i;
        LinearLayout linearLayout;
        if (C3112v.m8242u().mo23564p(this.f15549i).size() > 0) {
            linearLayout = this.f15546f;
            i = 4;
        } else {
            linearLayout = this.f15546f;
            i = 0;
        }
        linearLayout.setVisibility(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: K */
    public void m20640K() {
        if (C3112v.m8242u().mo23564p(this.f15549i) != null) {
            this.f15544d.mo36039e(C3112v.m8242u().mo23564p(this.f15549i));
            m20641M();
        }
        C3112v.m8242u().mo23565q(this.f15549i, new C8763f());
    }

    /* access modifiers changed from: private */
    /* renamed from: M */
    public void m20641M() {
        this.f15546f.post(new C9092a(this));
    }

    /* renamed from: G */
    public void mo36098G(Bundle bundle) {
        C3012e r0 = YeelightDeviceManager.m7804r0(bundle.getString("com.yeelight.cherry.device_id"));
        this.f15547g = r0;
        if (r0 == null) {
            AppUtils.m8300u("FavoriteSceneFragment", "Device shouldn't be null!!!");
        }
        int i = bundle.getInt("device_lamp_mode", -1);
        this.f15551k = i;
        this.f15549i = i == 2 ? "yeelink.light.ceiling4.ambi" : this.f15547g.mo23144i1();
        this.f15548h = bundle.getBoolean("start_for_result", false);
        this.f15550j = bundle.getInt("position", -1);
        FavoriteSceneAdapter favoriteSceneAdapter = new FavoriteSceneAdapter(this.f15549i, this.f15548h, this);
        this.f15544d = favoriteSceneAdapter;
        this.f15541a.setAdapter(favoriteSceneAdapter);
        this.f15544d.mo36040f(new C8757a());
    }

    /* renamed from: a */
    public void mo23579a(String str) {
    }

    /* renamed from: g */
    public void mo23580g() {
        C3112v.m8242u().mo23565q(this.f15549i, new C8762e());
    }

    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        View inflate = layoutInflater.inflate(R$layout.fragment_scene, viewGroup, false);
        this.f15542b = inflate;
        this.f15541a = (RecyclerView) inflate.findViewById(R$id.recycle_view);
        return this.f15542b;
    }

    public void onRefresh() {
        C3112v.m8242u().mo23565q(this.f15549i, new C8761d());
    }

    public void onResume() {
        super.onResume();
        m20640K();
    }

    public void onViewCreated(View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        this.f15543c = linearLayoutManager;
        this.f15541a.setLayoutManager(linearLayoutManager);
        this.f15541a.setItemAnimator(new DefaultItemAnimator());
        this.f15541a.addItemDecoration(new C8759b(this));
        this.f15545e = (TwinklingRefreshLayout) view.findViewById(R$id.refresh_layout);
        C8869a aVar = new C8869a(getContext());
        this.f15545e.setOverScrollRefreshShow(false);
        this.f15545e.setHeaderView(aVar);
        this.f15545e.setBottomView((C3686a) null);
        this.f15545e.setEnableLoadmore(false);
        this.f15545e.setEnableOverScroll(true);
        this.f15545e.setOnRefreshListener(new C8760c());
        this.f15546f = (LinearLayout) view.findViewById(R$id.no_update_layout);
    }

    /* renamed from: r */
    public void mo23582r(boolean z, List<C8321m> list) {
    }

    /* renamed from: s */
    public void mo23583s(String str) {
        this.f15546f.post(new C9093b(this, str));
    }
}
