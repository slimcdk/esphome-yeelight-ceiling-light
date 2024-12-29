package com.yeelight.cherry.p177ui.fragment;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Intent;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.lcodecore.tkrefreshlayout.C3387a;
import com.lcodecore.tkrefreshlayout.C3392f;
import com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout;
import com.xiaomi.mistatistic.sdk.MiStatInterface;
import com.yeelight.cherry.C11744R$drawable;
import com.yeelight.cherry.C11745R$id;
import com.yeelight.cherry.C11748R$layout;
import com.yeelight.cherry.p177ui.activity.ProductListActivity;
import com.yeelight.yeelib.data.AppConfigurationProvider;
import com.yeelight.yeelib.data.C7579c;
import com.yeelight.yeelib.data.C7601g;
import com.yeelight.yeelib.data.DeviceDataProvider;
import com.yeelight.yeelib.p150c.p151i.C4200i;
import com.yeelight.yeelib.p152f.C4201a;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p152f.C9784e;
import com.yeelight.yeelib.p186e.C9769d;
import com.yeelight.yeelib.p194ui.view.C10493b;
import com.yeelight.yeelib.p194ui.view.CommonFragmentDefaultView;
import com.yeelight.yeelib.p194ui.view.YeelightScrollView;
import com.yeelight.yeelib.utils.C4311i;
import com.yeelight.yeelib.utils.RVEmptyObserver;
import java.util.Locale;

/* renamed from: com.yeelight.cherry.ui.fragment.NewDeviceListFragment */
public class NewDeviceListFragment extends Fragment implements SwipeRefreshLayout.OnRefreshListener, C9784e.C4213a, C9769d {

    /* renamed from: u */
    public static final String f12460u = NewDeviceListFragment.class.getSimpleName();

    /* renamed from: a */
    LinearLayout f12461a;

    /* renamed from: b */
    TextView f12462b;

    /* renamed from: c */
    YeelightScrollView f12463c;

    /* renamed from: d */
    LinearLayout f12464d;

    /* renamed from: e */
    LinearLayout f12465e;

    /* renamed from: f */
    LinearLayout f12466f;

    /* renamed from: g */
    LinearLayout f12467g;

    /* renamed from: h */
    RecyclerView f12468h;

    /* renamed from: i */
    RecyclerView f12469i;

    /* renamed from: j */
    ImageView f12470j;

    /* renamed from: k */
    ImageView f12471k;

    /* renamed from: l */
    TextView f12472l;

    /* renamed from: m */
    TextView f12473m;

    /* renamed from: n */
    TwinklingRefreshLayout f12474n;

    /* renamed from: o */
    private boolean f12475o = false;

    /* renamed from: p */
    private Uri f12476p = C7579c.f15357b;

    /* renamed from: q */
    DeviceRecyclerViewAdapter f12477q;

    /* renamed from: r */
    GroupRecyclerViewAdapter f12478r;

    /* renamed from: s */
    private ContentObserver f12479s = new C5916m(new Handler());
    /* access modifiers changed from: private */

    /* renamed from: t */
    public Handler f12480t = new C5909f();

    /* renamed from: com.yeelight.cherry.ui.fragment.NewDeviceListFragment$a */
    class C5904a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ RecyclerView f12481a;

        C5904a(NewDeviceListFragment newDeviceListFragment, RecyclerView recyclerView) {
            this.f12481a = recyclerView;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f12481a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: com.yeelight.cherry.ui.fragment.NewDeviceListFragment$b */
    class C5905b implements Animator.AnimatorListener {
        C5905b() {
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            NewDeviceListFragment.this.f12468h.setVisibility(8);
            NewDeviceListFragment.this.m17374O(0);
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: com.yeelight.cherry.ui.fragment.NewDeviceListFragment$c */
    class C5906c implements Animator.AnimatorListener {
        C5906c() {
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            NewDeviceListFragment.this.m17374O(1);
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
            NewDeviceListFragment.this.f12468h.setVisibility(0);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.fragment.NewDeviceListFragment$d */
    class C5907d implements Animator.AnimatorListener {
        C5907d() {
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            NewDeviceListFragment.this.f12469i.setVisibility(8);
            NewDeviceListFragment.this.f12467g.setVisibility(0);
            NewDeviceListFragment.this.m17373N(0);
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: com.yeelight.cherry.ui.fragment.NewDeviceListFragment$e */
    class C5908e implements Animator.AnimatorListener {
        C5908e() {
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            NewDeviceListFragment.this.f12467g.setVisibility(8);
            NewDeviceListFragment.this.m17373N(1);
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
            NewDeviceListFragment.this.f12469i.setVisibility(0);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.fragment.NewDeviceListFragment$f */
    class C5909f extends Handler {
        C5909f() {
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 0) {
                NewDeviceListFragment.this.f12474n.mo18609A();
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.fragment.NewDeviceListFragment$g */
    class C5910g implements View.OnClickListener {
        C5910g() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(NewDeviceListFragment.this.getContext(), ProductListActivity.class);
            intent.putExtra("key_add_device", 1);
            NewDeviceListFragment.this.startActivity(intent);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.fragment.NewDeviceListFragment$h */
    class C5911h extends C3392f {
        C5911h() {
        }

        /* renamed from: a */
        public void mo18610a(TwinklingRefreshLayout twinklingRefreshLayout) {
        }

        /* renamed from: c */
        public void mo18612c(TwinklingRefreshLayout twinklingRefreshLayout, float f) {
            super.mo18612c(twinklingRefreshLayout, f);
            NewDeviceListFragment.this.f12463c.scrollTo(0, 0);
        }

        /* renamed from: e */
        public void mo18615e(TwinklingRefreshLayout twinklingRefreshLayout) {
            C4257w.m11947l0().mo23655X(true, false, true);
            NewDeviceListFragment.this.f12480t.sendEmptyMessageDelayed(0, 1000);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.fragment.NewDeviceListFragment$i */
    class C5912i implements View.OnClickListener {
        C5912i() {
        }

        public void onClick(View view) {
            NewDeviceListFragment.this.m17371C();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.fragment.NewDeviceListFragment$j */
    class C5913j implements View.OnClickListener {
        C5913j() {
        }

        public void onClick(View view) {
            NewDeviceListFragment.this.m17381z();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.fragment.NewDeviceListFragment$k */
    class C5914k implements View.OnClickListener {
        C5914k(NewDeviceListFragment newDeviceListFragment) {
        }

        public void onClick(View view) {
            C4257w.m11947l0().mo23640B1();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.fragment.NewDeviceListFragment$l */
    class C5915l implements View.OnClickListener {
        C5915l(NewDeviceListFragment newDeviceListFragment) {
        }

        public void onClick(View view) {
            C4257w.m11947l0().mo23643D1();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.fragment.NewDeviceListFragment$m */
    class C5916m extends ContentObserver {
        C5916m(Handler handler) {
            super(handler);
        }

        public void onChange(boolean z) {
            super.onChange(z);
            if (NewDeviceListFragment.this.isAdded() && C4201a.m11610z()) {
                NewDeviceListFragment.this.mo27319M();
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.fragment.NewDeviceListFragment$n */
    class C5917n implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C7601g f12492a;

        /* renamed from: b */
        final /* synthetic */ MatrixCursor f12493b;

        C5917n(C7601g gVar, MatrixCursor matrixCursor) {
            this.f12492a = gVar;
            this.f12493b = matrixCursor;
        }

        public void run() {
            NewDeviceListFragment.this.f12477q.mo27123b(this.f12492a);
            if (this.f12493b.getCount() > 0) {
                NewDeviceListFragment.this.f12464d.setVisibility(0);
            } else {
                NewDeviceListFragment.this.f12464d.setVisibility(8);
            }
            NewDeviceListFragment.this.f12478r.mo27123b(this.f12493b);
            NewDeviceListFragment newDeviceListFragment = NewDeviceListFragment.this;
            newDeviceListFragment.f12473m.setText(String.format(Locale.US, newDeviceListFragment.getString(2131755723), new Object[]{Integer.valueOf(NewDeviceListFragment.this.f12477q.getItemCount())}));
            NewDeviceListFragment newDeviceListFragment2 = NewDeviceListFragment.this;
            newDeviceListFragment2.f12472l.setText(String.format(Locale.US, newDeviceListFragment2.getString(2131755725), new Object[]{Integer.valueOf(NewDeviceListFragment.this.f12478r.getItemCount())}));
        }
    }

    /* renamed from: A */
    private boolean m17369A() {
        String f = AppConfigurationProvider.m22353f("device_status");
        return f.isEmpty() || Integer.valueOf(f).intValue() == 1;
    }

    /* renamed from: B */
    private boolean m17370B() {
        String f = AppConfigurationProvider.m22353f("group_status");
        return f.isEmpty() || Integer.valueOf(f).intValue() == 1;
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public void m17371C() {
        ValueAnimator valueAnimator;
        AnimatorSet animatorSet;
        ObjectAnimator objectAnimator;
        ValueAnimator valueAnimator2;
        if (this.f12468h.getVisibility() == 0) {
            valueAnimator2 = m17372K((float) this.f12468h.getHeight(), 0.0f, this.f12468h);
            valueAnimator2.setDuration(200);
            valueAnimator2.setInterpolator(new AccelerateInterpolator());
            valueAnimator2.addListener(new C5905b());
            valueAnimator = m17375q(1.0f, 0.3f, this.f12468h);
            valueAnimator.setDuration(200);
            objectAnimator = ObjectAnimator.ofFloat(this.f12470j, "rotation", new float[]{90.0f, 0.0f}).setDuration(200);
            animatorSet = new AnimatorSet();
        } else {
            this.f12468h.setVisibility(0);
            valueAnimator2 = m17372K(0.0f, (float) this.f12468h.getHeight(), this.f12468h);
            valueAnimator2.setDuration(200);
            valueAnimator2.setInterpolator(new AccelerateInterpolator());
            valueAnimator2.addListener(new C5906c());
            valueAnimator = m17375q(0.0f, 1.0f, this.f12468h);
            valueAnimator.setDuration(200);
            objectAnimator = ObjectAnimator.ofFloat(this.f12470j, "rotation", new float[]{0.0f, 90.0f}).setDuration(200);
            animatorSet = new AnimatorSet();
        }
        animatorSet.play(valueAnimator).with(valueAnimator2).with(objectAnimator);
        animatorSet.start();
    }

    /* renamed from: K */
    private ValueAnimator m17372K(float f, float f2, RecyclerView recyclerView) {
        return ValueAnimator.ofFloat(new float[]{f, f2});
    }

    /* access modifiers changed from: private */
    /* renamed from: N */
    public void m17373N(int i) {
        C4311i.m12153d(i);
        AppConfigurationProvider.m22361n("device_status", String.valueOf(i));
    }

    /* access modifiers changed from: private */
    /* renamed from: O */
    public void m17374O(int i) {
        AppConfigurationProvider.m22361n("group_status", String.valueOf(i));
    }

    /* renamed from: q */
    private ValueAnimator m17375q(float f, float f2, RecyclerView recyclerView) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f, f2});
        ofFloat.addUpdateListener(new C5904a(this, recyclerView));
        return ofFloat;
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public void m17381z() {
        if (this.f12469i.getVisibility() == 0) {
            ValueAnimator K = m17372K((float) this.f12469i.getHeight(), (float) this.f12467g.getHeight(), this.f12469i);
            K.setDuration(200);
            K.setInterpolator(new DecelerateInterpolator());
            K.addListener(new C5907d());
            ValueAnimator q = m17375q(1.0f, 0.0f, this.f12469i);
            q.setDuration(200);
            ObjectAnimator duration = ObjectAnimator.ofFloat(this.f12471k, "rotation", new float[]{90.0f, 0.0f}).setDuration(200);
            ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.f12467g, "alpha", new float[]{0.3f, 1.0f}).setDuration(200);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.play(q).with(K).with(duration).with(duration2);
            animatorSet.start();
            return;
        }
        ValueAnimator K2 = m17372K((float) this.f12467g.getHeight(), (float) this.f12469i.getHeight(), this.f12469i);
        K2.setDuration(200);
        K2.setInterpolator(new AccelerateInterpolator());
        K2.addListener(new C5908e());
        ValueAnimator q2 = m17375q(0.0f, 1.0f, this.f12469i);
        q2.setDuration(200);
        ObjectAnimator duration3 = ObjectAnimator.ofFloat(this.f12471k, "rotation", new float[]{0.0f, 90.0f}).setDuration(200);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.play(q2).with(K2).with(duration3);
        animatorSet2.start();
    }

    /* renamed from: D */
    public /* synthetic */ void mo27314D() {
        this.f12461a.setVisibility(8);
    }

    /* renamed from: E */
    public void mo26093E(C4200i iVar) {
    }

    /* renamed from: F */
    public /* synthetic */ void mo27315F() {
        this.f12462b.setText(getResources().getString(2131755634));
        this.f12461a.setVisibility(0);
    }

    /* renamed from: G */
    public /* synthetic */ void mo27316G() {
        this.f12461a.setVisibility(8);
    }

    /* renamed from: H */
    public /* synthetic */ void mo27317H() {
        this.f12462b.setText(getResources().getString(2131755634));
        this.f12461a.setVisibility(0);
    }

    /* renamed from: I */
    public void mo23487I() {
        getActivity().runOnUiThread(new C5936i(this));
        this.f12475o = true;
    }

    /* renamed from: J */
    public /* synthetic */ void mo27318J(int i) {
        TextView textView = this.f12462b;
        textView.setText(getResources().getString(2131755640) + "(" + i + ")");
        this.f12461a.setVisibility(0);
    }

    /* renamed from: L */
    public void mo26094L() {
        Runnable runnable;
        LinearLayout linearLayout;
        if (!this.f12475o) {
            linearLayout = this.f12461a;
            runnable = new C5933f(this);
        } else {
            linearLayout = this.f12461a;
            runnable = new C5934g(this);
        }
        linearLayout.post(runnable);
    }

    /* renamed from: M */
    public void mo27319M() {
        C7601g gVar = new C7601g(DeviceDataProvider.m22422z());
        MatrixCursor matrixCursor = new MatrixCursor(new String[]{C7579c.C7582b.C7583a.f15383a, "group_id"});
        Cursor C = DeviceDataProvider.m22368C();
        int i = 0;
        while (C.moveToNext()) {
            matrixCursor.addRow(new Object[]{Integer.valueOf(i), C.getString(C.getColumnIndex(C7579c.C7582b.C7583a.f15383a))});
            i++;
        }
        C.close();
        Cursor D = DeviceDataProvider.m22369D();
        while (D.moveToNext()) {
            int i2 = i + 1;
            matrixCursor.addRow(new Object[]{Integer.valueOf(i), D.getString(D.getColumnIndex(C7579c.C7590f.C7591a.f15423c)) + "_" + D.getString(D.getColumnIndex(C7579c.C7590f.C7591a.f15421a))});
            i = i2;
        }
        D.close();
        this.f12480t.post(new C5917n(gVar, matrixCursor));
    }

    /* renamed from: h */
    public void mo23488h(int i) {
        this.f12475o = false;
        if (C4201a.m11610z()) {
            C4257w.m11947l0().mo23655X(false, false, true);
        }
        this.f12461a.post(new C5937j(this));
    }

    /* renamed from: j */
    public void mo23489j() {
    }

    /* renamed from: k */
    public void mo26095k() {
    }

    /* renamed from: m */
    public void mo26096m(C4200i iVar) {
    }

    /* renamed from: o */
    public void mo26097o() {
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C11748R$layout.fragment_new_device_list, viewGroup, false);
        this.f12461a = (LinearLayout) inflate.findViewById(C11745R$id.layout_alarm);
        this.f12462b = (TextView) inflate.findViewById(C11745R$id.tv_alarm);
        this.f12463c = (YeelightScrollView) inflate.findViewById(C11745R$id.device_group_list_view);
        this.f12464d = (LinearLayout) inflate.findViewById(C11745R$id.group_list_layout);
        this.f12465e = (LinearLayout) inflate.findViewById(C11745R$id.group_list_bar);
        this.f12466f = (LinearLayout) inflate.findViewById(C11745R$id.device_list_bar);
        this.f12468h = (RecyclerView) inflate.findViewById(C11745R$id.group_device_list);
        this.f12469i = (RecyclerView) inflate.findViewById(2131296591);
        this.f12470j = (ImageView) inflate.findViewById(C11745R$id.img_group_view_tip);
        this.f12471k = (ImageView) inflate.findViewById(C11745R$id.img_device_view_tip);
        this.f12467g = (LinearLayout) inflate.findViewById(C11745R$id.layout_control_device_all);
        this.f12473m = (TextView) inflate.findViewById(C11745R$id.text_device_info);
        this.f12472l = (TextView) inflate.findViewById(C11745R$id.text_group_info);
        CommonFragmentDefaultView commonFragmentDefaultView = (CommonFragmentDefaultView) inflate.findViewById(2131296644);
        commonFragmentDefaultView.mo32824a(C11744R$drawable.icon_yeelight_default_image_device, 2131756213, 2131756212, 2131756209, new C5910g());
        this.f12469i.setLayoutManager(new LinearLayoutManager(inflate.getContext()));
        this.f12468h.setLayoutManager(new LinearLayoutManager(inflate.getContext()));
        this.f12477q = new DeviceRecyclerViewAdapter(getActivity(), (Cursor) null);
        this.f12478r = new GroupRecyclerViewAdapter(getActivity(), (Cursor) null);
        this.f12469i.setAdapter(this.f12477q);
        this.f12468h.setAdapter(this.f12478r);
        this.f12477q.registerAdapterDataObserver(new RVEmptyObserver(inflate.findViewById(2131296968), commonFragmentDefaultView, this.f12469i));
        this.f12468h.setNestedScrollingEnabled(false);
        this.f12469i.setNestedScrollingEnabled(false);
        this.f12474n = (TwinklingRefreshLayout) inflate.findViewById(2131297152);
        C10493b bVar = new C10493b(getContext());
        this.f12474n.setOverScrollRefreshShow(false);
        this.f12474n.setHeaderView(bVar);
        this.f12474n.setNestedScrollingEnabled(false);
        this.f12474n.setBottomView((C3387a) null);
        this.f12474n.setEnableLoadmore(false);
        this.f12474n.setEnableOverScroll(true);
        this.f12474n.setOnRefreshListener(new C5911h());
        this.f12465e.setOnClickListener(new C5912i());
        this.f12466f.setOnClickListener(new C5913j());
        if (m17369A()) {
            ObjectAnimator.ofFloat(this.f12471k, "rotation", new float[]{0.0f, 90.0f}).setDuration(1).start();
            this.f12469i.setVisibility(0);
            this.f12467g.setVisibility(8);
        } else {
            this.f12469i.setVisibility(8);
            this.f12467g.setVisibility(0);
        }
        if (m17370B()) {
            ObjectAnimator.ofFloat(this.f12470j, "rotation", new float[]{0.0f, 90.0f}).setDuration(1).start();
            this.f12468h.setVisibility(0);
        } else {
            this.f12468h.setVisibility(8);
        }
        inflate.findViewById(C11745R$id.device_all_off_layout).setOnClickListener(new C5914k(this));
        inflate.findViewById(C11745R$id.device_all_on_layout).setOnClickListener(new C5915l(this));
        return inflate;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f12480t.removeCallbacksAndMessages((Object) null);
        this.f12477q = null;
        this.f12478r = null;
    }

    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
    }

    public void onPause() {
        super.onPause();
        DeviceRecyclerViewAdapter deviceRecyclerViewAdapter = this.f12477q;
        if (deviceRecyclerViewAdapter != null) {
            deviceRecyclerViewAdapter.mo27258i(false);
        }
        C4257w.m11947l0().mo23646F1(this);
    }

    public void onRefresh() {
    }

    public void onResume() {
        super.onResume();
        DeviceRecyclerViewAdapter deviceRecyclerViewAdapter = this.f12477q;
        if (deviceRecyclerViewAdapter != null) {
            deviceRecyclerViewAdapter.mo27258i(true);
        }
        C4257w.m11947l0().mo23678m1(this);
    }

    public void onStart() {
        super.onStart();
        C9784e.m23711b().mo31634j(this);
        C4257w.m11947l0().mo23689t1(MiStatInterface.MIN_UPLOAD_INTERVAL);
        if (C4201a.m11610z()) {
            C4257w.m11947l0().mo23655X(true, false, true);
            C4257w.m11947l0().mo23677l1();
        }
        mo27319M();
        getActivity().getContentResolver().registerContentObserver(C7579c.C7580a.f15368a, true, this.f12479s);
        getActivity().getContentResolver().registerContentObserver(C7579c.C7582b.f15382a, true, this.f12479s);
    }

    public void onStop() {
        super.onStop();
        C9784e.m23711b().mo31636m(this);
        getActivity().getContentResolver().unregisterContentObserver(this.f12479s);
        C4257w.m11947l0().mo23698y1();
    }

    /* renamed from: t */
    public void mo26104t() {
    }

    /* renamed from: v */
    public void mo23490v() {
    }

    /* renamed from: y */
    public void mo26107y(int i) {
        "onRemoteWifiDiscoveryError: " + i;
        this.f12461a.post(new C5935h(this, i));
    }
}
