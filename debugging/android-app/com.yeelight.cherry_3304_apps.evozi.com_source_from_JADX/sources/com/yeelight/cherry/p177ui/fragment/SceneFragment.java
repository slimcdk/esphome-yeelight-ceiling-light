package com.yeelight.cherry.p177ui.fragment;

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
import com.lcodecore.tkrefreshlayout.C3392f;
import com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout;
import com.yeelight.cherry.C11744R$drawable;
import com.yeelight.cherry.C11745R$id;
import com.yeelight.cherry.C11748R$layout;
import com.yeelight.cherry.p177ui.activity.CreateSceneActivity;
import com.yeelight.yeelib.p152f.C4230l;
import com.yeelight.yeelib.p152f.C4247u;
import com.yeelight.yeelib.p152f.C9784e;
import com.yeelight.yeelib.p153g.C9858z;
import com.yeelight.yeelib.p194ui.view.C10493b;
import com.yeelight.yeelib.p194ui.view.CommonFragmentDefaultView;
import com.yeelight.yeelib.p194ui.view.YeelightScrollView;
import com.yeelight.yeelib.utils.RVEmptyObserver;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yeelight.cherry.ui.fragment.SceneFragment */
public class SceneFragment extends Fragment implements C4247u.C4255d, C4230l.C4231a, C9784e.C4213a {

    /* renamed from: j */
    private static final String f12508j = SceneFragment.class.getSimpleName();

    /* renamed from: a */
    private int f12509a = 2;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public SceneRecyclerViewAdapter f12510b;

    /* renamed from: c */
    TwinklingRefreshLayout f12511c;

    /* renamed from: d */
    YeelightScrollView f12512d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public LinearLayout f12513e;

    /* renamed from: f */
    private TextView f12514f;

    /* renamed from: g */
    private boolean f12515g = false;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public List<C9858z> f12516h = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: i */
    public Handler f12517i = new Handler(new C5921a());

    /* renamed from: com.yeelight.cherry.ui.fragment.SceneFragment$SceneItemDecoration */
    public class SceneItemDecoration extends RecyclerView.ItemDecoration {

        /* renamed from: a */
        Paint f12518a;

        public SceneItemDecoration(SceneFragment sceneFragment) {
            Paint paint = new Paint();
            this.f12518a = paint;
            paint.setColor(Color.parseColor("#e8e8e8"));
            this.f12518a.setStrokeWidth(1.0f);
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
                    canvas.drawLine(f2, y, f4, f5, this.f12518a);
                    paint = this.f12518a;
                    canvas2 = canvas;
                    f3 = f5;
                    f = f5;
                } else {
                    f = y + ((float) height);
                    f2 = x + ((float) width);
                    paint = this.f12518a;
                    canvas2 = canvas;
                    f3 = f;
                }
                canvas2.drawLine(x, f3, f2, f, paint);
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.fragment.SceneFragment$a */
    class C5921a implements Handler.Callback {
        C5921a() {
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i != 1) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return false;
                        }
                        SceneFragment.this.f12516h.clear();
                        SceneFragment.this.f12516h.addAll(C4247u.m11865n().mo23620p());
                        SceneFragment.this.f12510b.notifyDataSetChanged();
                        return false;
                    }
                } else if (!SceneFragment.this.f12517i.hasMessages(1)) {
                    SceneFragment.this.f12517i.sendEmptyMessageDelayed(4, 2000);
                    return false;
                } else {
                    SceneFragment.this.f12517i.removeMessages(1);
                    SceneFragment.this.f12517i.sendEmptyMessage(1);
                    return false;
                }
            } else if (SceneFragment.this.f12517i.hasMessages(3)) {
                SceneFragment.this.f12517i.sendEmptyMessageDelayed(1, 1000);
                return false;
            } else {
                SceneFragment.this.f12516h.clear();
                SceneFragment.this.f12516h.addAll(C4247u.m11865n().mo23620p());
                SceneFragment.this.f12510b.notifyDataSetChanged();
            }
            SceneFragment.this.f12511c.mo18609A();
            return false;
        }
    }

    /* renamed from: com.yeelight.cherry.ui.fragment.SceneFragment$b */
    class C5922b implements View.OnClickListener {
        C5922b() {
        }

        public void onClick(View view) {
            if (SceneFragment.this.f12513e.getVisibility() == 8) {
                SceneFragment.this.startActivity(new Intent(SceneFragment.this.getContext(), CreateSceneActivity.class));
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.fragment.SceneFragment$c */
    class C5923c extends C3392f {
        C5923c() {
        }

        /* renamed from: a */
        public void mo18610a(TwinklingRefreshLayout twinklingRefreshLayout) {
        }

        /* renamed from: c */
        public void mo18612c(TwinklingRefreshLayout twinklingRefreshLayout, float f) {
            super.mo18612c(twinklingRefreshLayout, f);
            SceneFragment.this.f12512d.scrollTo(0, 0);
        }

        /* renamed from: e */
        public void mo18615e(TwinklingRefreshLayout twinklingRefreshLayout) {
            C4247u.m11865n().mo23615D();
            SceneFragment.this.f12517i.sendEmptyMessageDelayed(3, 1000);
        }
    }

    /* renamed from: A */
    public /* synthetic */ void mo27355A() {
        this.f12514f.setText(getResources().getString(2131755634));
        this.f12513e.setVisibility(0);
    }

    /* renamed from: B */
    public /* synthetic */ void mo27356B() {
        if (isAdded()) {
            this.f12514f.setText(getResources().getString(2131755640));
        }
        this.f12513e.setVisibility(0);
    }

    /* renamed from: I */
    public void mo23487I() {
        getActivity().runOnUiThread(new C5945r(this));
        this.f12515g = true;
    }

    /* renamed from: c */
    public void mo23557c(String str) {
        C4247u.m11865n().mo23615D();
    }

    /* renamed from: e */
    public void mo23632e() {
    }

    /* renamed from: g */
    public void mo23633g() {
        Runnable runnable;
        LinearLayout linearLayout;
        this.f12517i.sendEmptyMessage(1);
        if (!this.f12515g) {
            linearLayout = this.f12513e;
            runnable = new C5944q(this);
        } else {
            linearLayout = this.f12513e;
            runnable = new C5947t(this);
        }
        linearLayout.post(runnable);
    }

    /* renamed from: h */
    public void mo23488h(int i) {
        this.f12515g = false;
        C4247u.m11865n().mo23615D();
        this.f12513e.post(new C5948u(this));
    }

    /* renamed from: i */
    public void mo23634i() {
    }

    /* renamed from: j */
    public void mo23489j() {
    }

    /* renamed from: l */
    public void mo23635l() {
        if (!this.f12515g) {
            this.f12513e.post(new C5946s(this));
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.f12509a = getArguments().getInt("column-count");
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C11748R$layout.fragment_scene_list, viewGroup, false);
        CommonFragmentDefaultView commonFragmentDefaultView = (CommonFragmentDefaultView) inflate.findViewById(2131296644);
        commonFragmentDefaultView.mo32824a(C11744R$drawable.icon_yeelight_default_image_scene, 2131756217, 2131756216, 2131756211, new C5922b());
        this.f12512d = (YeelightScrollView) inflate.findViewById(C11745R$id.base_layout);
        this.f12513e = (LinearLayout) inflate.findViewById(C11745R$id.layout_alarm);
        this.f12514f = (TextView) inflate.findViewById(C11745R$id.tv_alarm);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(C11745R$id.list);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), this.f12509a));
        recyclerView.addItemDecoration(new SceneItemDecoration(this));
        SceneRecyclerViewAdapter sceneRecyclerViewAdapter = new SceneRecyclerViewAdapter(this.f12516h);
        this.f12510b = sceneRecyclerViewAdapter;
        recyclerView.setAdapter(sceneRecyclerViewAdapter);
        this.f12510b.registerAdapterDataObserver(new RVEmptyObserver(recyclerView, commonFragmentDefaultView, recyclerView));
        this.f12511c = (TwinklingRefreshLayout) inflate.findViewById(2131297152);
        C10493b bVar = new C10493b(getContext());
        this.f12511c.setOverScrollRefreshShow(false);
        this.f12511c.setHeaderView(bVar);
        this.f12511c.setEnableLoadmore(false);
        this.f12511c.setEnableOverScroll(true);
        this.f12511c.setOnRefreshListener(new C5923c());
        return inflate;
    }

    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (!z) {
            C4247u.m11865n().mo23615D();
        }
    }

    public void onPause() {
        super.onPause();
        C9784e.m23711b().mo31636m(this);
    }

    public void onResume() {
        super.onResume();
        C9784e.m23711b().mo31634j(this);
    }

    public void onStart() {
        super.onStart();
        C4247u.m11865n().mo23613A(this);
        C4247u.m11865n().mo23615D();
        this.f12517i.sendEmptyMessage(5);
    }

    public void onStop() {
        super.onStop();
        C4247u.m11865n().mo23616E(this);
        this.f12517i.removeCallbacksAndMessages((Object) null);
        this.f12511c.mo18609A();
    }

    public void onViewCreated(View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
    }

    /* renamed from: v */
    public void mo23490v() {
    }

    /* renamed from: w */
    public /* synthetic */ void mo27357w() {
        this.f12513e.setVisibility(8);
    }

    /* renamed from: x */
    public /* synthetic */ void mo27358x() {
        this.f12514f.setText(getResources().getString(2131755634));
        this.f12513e.setVisibility(0);
    }

    /* renamed from: z */
    public /* synthetic */ void mo27359z() {
        this.f12513e.setVisibility(8);
    }
}
