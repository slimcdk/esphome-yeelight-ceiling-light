package com.yeelight.cherry.p141ui.fragment;

import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout;
import com.yeelight.cherry.C12224R$drawable;
import com.yeelight.cherry.C12225R$id;
import com.yeelight.cherry.C12228R$layout;
import com.yeelight.cherry.p141ui.activity.CreateSceneActivity;
import com.yeelight.yeelib.managers.C3096u;
import com.yeelight.yeelib.managers.C8272e;
import com.yeelight.yeelib.managers.C8281l;
import com.yeelight.yeelib.models.C8329t;
import com.yeelight.yeelib.p142ui.view.C8869a;
import com.yeelight.yeelib.p142ui.view.CommonFragmentDefaultView;
import com.yeelight.yeelib.p142ui.view.YeelightScrollView;
import com.yeelight.yeelib.utils.RVEmptyObserver;
import java.util.ArrayList;
import java.util.List;
import p096s2.C3691f;

/* renamed from: com.yeelight.cherry.ui.fragment.SceneFragment */
public class SceneFragment extends Fragment implements C3096u.C3104d, C8281l.C3080a, C8272e.C3063a {

    /* renamed from: j */
    private static final String f12101j = SceneFragment.class.getSimpleName();

    /* renamed from: a */
    private int f12102a = 2;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public SceneRecyclerViewAdapter f12103b;

    /* renamed from: c */
    TwinklingRefreshLayout f12104c;

    /* renamed from: d */
    YeelightScrollView f12105d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public LinearLayout f12106e;

    /* renamed from: f */
    private TextView f12107f;

    /* renamed from: g */
    private boolean f12108g = false;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public List<C8329t> f12109h = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: i */
    public Handler f12110i = new Handler(new C5981a());

    /* renamed from: com.yeelight.cherry.ui.fragment.SceneFragment$SceneItemDecoration */
    public class SceneItemDecoration extends RecyclerView.ItemDecoration {

        /* renamed from: a */
        Paint f12111a;

        public SceneItemDecoration(SceneFragment sceneFragment) {
            Paint paint = new Paint();
            this.f12111a = paint;
            paint.setColor(Color.parseColor("#e8e8e8"));
            this.f12111a.setStrokeWidth(1.0f);
        }

        public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
            Paint paint;
            float f;
            float f2;
            float f3;
            Canvas canvas2;
            super.onDraw(canvas, recyclerView, state);
            int childCount = recyclerView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView.getChildAt(i);
                float x = childAt.getX();
                float y = childAt.getY();
                int width = childAt.getWidth();
                int height = childAt.getHeight();
                if (i % 2 == 0) {
                    float f4 = x + ((float) width);
                    float f5 = ((float) height) + y;
                    f2 = f4;
                    canvas.drawLine(f2, y, f4, f5, this.f12111a);
                    paint = this.f12111a;
                    canvas2 = canvas;
                    f3 = f5;
                    f = f5;
                } else {
                    f = y + ((float) height);
                    f2 = x + ((float) width);
                    paint = this.f12111a;
                    canvas2 = canvas;
                    f3 = f;
                }
                canvas2.drawLine(x, f3, f2, f, paint);
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.fragment.SceneFragment$a */
    class C5981a implements Handler.Callback {
        C5981a() {
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i != 1) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return false;
                        }
                        SceneFragment.this.f12109h.clear();
                        SceneFragment.this.f12109h.addAll(C3096u.m8175n().mo23513p());
                        SceneFragment.this.f12103b.notifyDataSetChanged();
                        return false;
                    }
                } else if (!SceneFragment.this.f12110i.hasMessages(1)) {
                    SceneFragment.this.f12110i.sendEmptyMessageDelayed(4, 2000);
                    return false;
                } else {
                    SceneFragment.this.f12110i.removeMessages(1);
                    SceneFragment.this.f12110i.sendEmptyMessage(1);
                    return false;
                }
            } else if (SceneFragment.this.f12110i.hasMessages(3)) {
                SceneFragment.this.f12110i.sendEmptyMessageDelayed(1, 1000);
                return false;
            } else {
                SceneFragment.this.f12109h.clear();
                SceneFragment.this.f12109h.addAll(C3096u.m8175n().mo23513p());
                SceneFragment.this.f12103b.notifyDataSetChanged();
            }
            SceneFragment.this.f12104c.mo20222A();
            return false;
        }
    }

    /* renamed from: com.yeelight.cherry.ui.fragment.SceneFragment$b */
    class C5982b implements View.OnClickListener {
        C5982b() {
        }

        public void onClick(View view) {
            if (SceneFragment.this.f12106e.getVisibility() == 8) {
                SceneFragment.this.startActivity(new Intent(SceneFragment.this.getContext(), CreateSceneActivity.class));
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.fragment.SceneFragment$c */
    class C5983c extends C3691f {
        C5983c() {
        }

        /* renamed from: a */
        public void mo20223a(TwinklingRefreshLayout twinklingRefreshLayout) {
        }

        /* renamed from: c */
        public void mo20225c(TwinklingRefreshLayout twinklingRefreshLayout, float f) {
            super.mo20225c(twinklingRefreshLayout, f);
            SceneFragment.this.f12105d.scrollTo(0, 0);
        }

        /* renamed from: e */
        public void mo20228e(TwinklingRefreshLayout twinklingRefreshLayout) {
            C3096u.m8175n().mo23508D();
            SceneFragment.this.f12110i.sendEmptyMessageDelayed(3, 1000);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: G */
    public /* synthetic */ void m17494G() {
        this.f12106e.setVisibility(8);
    }

    /* access modifiers changed from: private */
    /* renamed from: H */
    public /* synthetic */ void m17495H() {
        this.f12107f.setText(getResources().getString(2131755640));
        this.f12106e.setVisibility(0);
    }

    /* access modifiers changed from: private */
    /* renamed from: J */
    public /* synthetic */ void m17496J() {
        this.f12106e.setVisibility(8);
    }

    /* access modifiers changed from: private */
    /* renamed from: K */
    public /* synthetic */ void m17497K() {
        this.f12107f.setText(getResources().getString(2131755640));
        this.f12106e.setVisibility(0);
    }

    /* access modifiers changed from: private */
    /* renamed from: M */
    public /* synthetic */ void m17498M() {
        if (isAdded()) {
            this.f12107f.setText(getResources().getString(2131755646));
        }
        this.f12106e.setVisibility(0);
    }

    /* renamed from: I */
    public void mo23265I() {
        getActivity().runOnUiThread(new C6021z(this));
        this.f12108g = true;
    }

    /* renamed from: c */
    public void mo23281c(String str) {
        C3096u.m8175n().mo23508D();
    }

    /* renamed from: f */
    public void mo23525f() {
    }

    /* renamed from: i */
    public void mo23294i(int i) {
        this.f12108g = false;
        C3096u.m8175n().mo23508D();
        this.f12106e.post(new C6019x(this));
    }

    /* renamed from: j */
    public void mo23296j() {
    }

    /* renamed from: n */
    public void mo23526n() {
        Runnable runnable;
        LinearLayout linearLayout;
        this.f12110i.sendEmptyMessage(1);
        if (!this.f12108g) {
            linearLayout = this.f12106e;
            runnable = new C6020y(this);
        } else {
            linearLayout = this.f12106e;
            runnable = new C5989a0(this);
        }
        linearLayout.post(runnable);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.f12102a = getArguments().getInt("column-count");
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C12228R$layout.fragment_scene_list, viewGroup, false);
        CommonFragmentDefaultView commonFragmentDefaultView = (CommonFragmentDefaultView) inflate.findViewById(2131296738);
        commonFragmentDefaultView.mo36194a(C12224R$drawable.icon_yeelight_default_image_scene, 2131756242, 2131756241, 2131756236, new C5982b());
        this.f12105d = (YeelightScrollView) inflate.findViewById(C12225R$id.base_layout);
        this.f12106e = (LinearLayout) inflate.findViewById(C12225R$id.layout_alarm);
        this.f12107f = (TextView) inflate.findViewById(C12225R$id.tv_alarm);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(C12225R$id.list);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), this.f12102a));
        recyclerView.addItemDecoration(new SceneItemDecoration(this));
        SceneRecyclerViewAdapter sceneRecyclerViewAdapter = new SceneRecyclerViewAdapter(this.f12109h);
        this.f12103b = sceneRecyclerViewAdapter;
        recyclerView.setAdapter(sceneRecyclerViewAdapter);
        this.f12103b.registerAdapterDataObserver(new RVEmptyObserver(recyclerView, commonFragmentDefaultView, recyclerView));
        this.f12104c = (TwinklingRefreshLayout) inflate.findViewById(2131297292);
        C8869a aVar = new C8869a(getContext());
        this.f12104c.setOverScrollRefreshShow(false);
        this.f12104c.setHeaderView(aVar);
        this.f12104c.setEnableLoadmore(false);
        this.f12104c.setEnableOverScroll(true);
        this.f12104c.setOnRefreshListener(new C5983c());
        return inflate;
    }

    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (!z) {
            C3096u.m8175n().mo23508D();
        }
    }

    public void onPause() {
        super.onPause();
        C8272e.m19511b().mo35212m(this);
    }

    public void onResume() {
        super.onResume();
        C8272e.m19511b().mo35210j(this);
    }

    public void onStart() {
        super.onStart();
        C3096u.m8175n().mo23506A(this);
        C3096u.m8175n().mo23508D();
        this.f12110i.sendEmptyMessage(5);
    }

    public void onStop() {
        super.onStop();
        C3096u.m8175n().mo23509E(this);
        this.f12110i.removeCallbacksAndMessages((Object) null);
        this.f12104c.mo20222A();
    }

    public void onViewCreated(View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
    }

    /* renamed from: p */
    public void mo23527p() {
    }

    /* renamed from: q */
    public void mo23528q() {
        if (!this.f12108g) {
            this.f12106e.post(new C5991b0(this));
        }
    }

    /* renamed from: v */
    public void mo23318v() {
    }
}
