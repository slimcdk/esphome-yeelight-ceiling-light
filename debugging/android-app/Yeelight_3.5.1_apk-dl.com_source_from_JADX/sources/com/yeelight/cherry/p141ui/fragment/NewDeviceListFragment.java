package com.yeelight.cherry.p141ui.fragment;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Intent;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Build;
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
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.constraintlayout.motion.widget.Key;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout;
import com.yeelight.cherry.C12224R$drawable;
import com.yeelight.cherry.C12225R$id;
import com.yeelight.cherry.C12228R$layout;
import com.yeelight.cherry.p141ui.activity.SearchDeviceAutoActivity;
import com.yeelight.yeelib.data.AppConfigurationProvider;
import com.yeelight.yeelib.data.C6043b;
import com.yeelight.yeelib.data.C6065f;
import com.yeelight.yeelib.data.DeviceDataProvider;
import com.yeelight.yeelib.device.base.C3012e;
import com.yeelight.yeelib.managers.C3051a;
import com.yeelight.yeelib.managers.C8272e;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.p142ui.view.C8869a;
import com.yeelight.yeelib.p142ui.view.CommonFragmentDefaultView;
import com.yeelight.yeelib.p142ui.view.YeelightScrollView;
import com.yeelight.yeelib.utils.RVEmptyObserver;
import java.util.Locale;
import p051j4.C3279g;
import p096s2.C3686a;
import p096s2.C3691f;
import p237z3.C12144d;

/* renamed from: com.yeelight.cherry.ui.fragment.NewDeviceListFragment */
public class NewDeviceListFragment extends Fragment implements SwipeRefreshLayout.OnRefreshListener, C8272e.C3063a, C12144d {

    /* renamed from: t */
    public static final String f12054t = NewDeviceListFragment.class.getSimpleName();

    /* renamed from: a */
    LinearLayout f12055a;

    /* renamed from: b */
    TextView f12056b;

    /* renamed from: c */
    YeelightScrollView f12057c;

    /* renamed from: d */
    LinearLayout f12058d;

    /* renamed from: e */
    LinearLayout f12059e;

    /* renamed from: f */
    LinearLayout f12060f;

    /* renamed from: g */
    LinearLayout f12061g;

    /* renamed from: h */
    RecyclerView f12062h;

    /* renamed from: i */
    RecyclerView f12063i;

    /* renamed from: j */
    ImageView f12064j;

    /* renamed from: k */
    ImageView f12065k;

    /* renamed from: l */
    TextView f12066l;

    /* renamed from: m */
    TextView f12067m;

    /* renamed from: n */
    TwinklingRefreshLayout f12068n;

    /* renamed from: o */
    private boolean f12069o = false;

    /* renamed from: p */
    DeviceRecyclerViewAdapter f12070p;

    /* renamed from: q */
    GroupRecyclerViewAdapter f12071q;

    /* renamed from: r */
    private ContentObserver f12072r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public Handler f12073s;

    /* renamed from: com.yeelight.cherry.ui.fragment.NewDeviceListFragment$a */
    class C5964a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ RecyclerView f12074a;

        C5964a(NewDeviceListFragment newDeviceListFragment, RecyclerView recyclerView) {
            this.f12074a = recyclerView;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f12074a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: com.yeelight.cherry.ui.fragment.NewDeviceListFragment$b */
    class C5965b implements Animator.AnimatorListener {
        C5965b() {
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            NewDeviceListFragment.this.f12062h.setVisibility(8);
            NewDeviceListFragment.this.m17443Y(0);
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: com.yeelight.cherry.ui.fragment.NewDeviceListFragment$c */
    class C5966c implements Animator.AnimatorListener {
        C5966c() {
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            NewDeviceListFragment.this.m17443Y(1);
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
            NewDeviceListFragment.this.f12062h.setVisibility(0);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.fragment.NewDeviceListFragment$d */
    class C5967d implements Animator.AnimatorListener {
        C5967d() {
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            NewDeviceListFragment.this.f12063i.setVisibility(8);
            NewDeviceListFragment.this.f12061g.setVisibility(0);
            NewDeviceListFragment.this.m17442X(0);
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: com.yeelight.cherry.ui.fragment.NewDeviceListFragment$e */
    class C5968e implements Animator.AnimatorListener {
        C5968e() {
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            NewDeviceListFragment.this.f12061g.setVisibility(8);
            NewDeviceListFragment.this.m17442X(1);
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
            NewDeviceListFragment.this.f12063i.setVisibility(0);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.fragment.NewDeviceListFragment$f */
    class C5969f extends Handler {
        C5969f() {
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 0) {
                NewDeviceListFragment.this.f12068n.mo20222A();
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.fragment.NewDeviceListFragment$g */
    class C5970g implements View.OnClickListener {
        C5970g() {
        }

        public void onClick(View view) {
            NewDeviceListFragment.this.startActivity(new Intent(NewDeviceListFragment.this.getContext(), SearchDeviceAutoActivity.class));
        }
    }

    /* renamed from: com.yeelight.cherry.ui.fragment.NewDeviceListFragment$h */
    class C5971h extends C3691f {
        C5971h() {
        }

        /* renamed from: a */
        public void mo20223a(TwinklingRefreshLayout twinklingRefreshLayout) {
        }

        /* renamed from: c */
        public void mo20225c(TwinklingRefreshLayout twinklingRefreshLayout, float f) {
            super.mo20225c(twinklingRefreshLayout, f);
            NewDeviceListFragment.this.f12057c.scrollTo(0, 0);
        }

        /* renamed from: e */
        public void mo20228e(TwinklingRefreshLayout twinklingRefreshLayout) {
            YeelightDeviceManager.m7800o0().mo23278Z(true, false, true);
            NewDeviceListFragment.this.f12073s.sendEmptyMessageDelayed(0, 1000);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.fragment.NewDeviceListFragment$i */
    class C5972i implements View.OnClickListener {
        C5972i() {
        }

        public void onClick(View view) {
            NewDeviceListFragment.this.m17434O();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.fragment.NewDeviceListFragment$j */
    class C5973j implements View.OnClickListener {
        C5973j() {
        }

        public void onClick(View view) {
            NewDeviceListFragment.this.m17431K();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.fragment.NewDeviceListFragment$k */
    class C5974k implements View.OnClickListener {
        C5974k(NewDeviceListFragment newDeviceListFragment) {
        }

        public void onClick(View view) {
            YeelightDeviceManager.m7800o0().mo23264H1();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.fragment.NewDeviceListFragment$l */
    class C5975l implements View.OnClickListener {
        C5975l(NewDeviceListFragment newDeviceListFragment) {
        }

        public void onClick(View view) {
            YeelightDeviceManager.m7800o0().mo23269J1();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.fragment.NewDeviceListFragment$m */
    class C5976m extends ContentObserver {
        C5976m(Handler handler) {
            super(handler);
        }

        public void onChange(boolean z) {
            super.onChange(z);
            if (NewDeviceListFragment.this.isAdded() && C3051a.m7928z()) {
                NewDeviceListFragment.this.mo31273W();
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.fragment.NewDeviceListFragment$n */
    class C5977n implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C6065f f12085a;

        /* renamed from: b */
        final /* synthetic */ MatrixCursor f12086b;

        C5977n(C6065f fVar, MatrixCursor matrixCursor) {
            this.f12085a = fVar;
            this.f12086b = matrixCursor;
        }

        public void run() {
            NewDeviceListFragment.this.f12070p.mo31092b(this.f12085a);
            if (this.f12086b.getCount() > 0) {
                NewDeviceListFragment.this.f12058d.setVisibility(0);
            } else {
                NewDeviceListFragment.this.f12058d.setVisibility(8);
            }
            NewDeviceListFragment.this.f12071q.mo31092b(this.f12086b);
            NewDeviceListFragment newDeviceListFragment = NewDeviceListFragment.this;
            TextView textView = newDeviceListFragment.f12067m;
            Locale locale = Locale.US;
            textView.setText(String.format(locale, newDeviceListFragment.getString(2131755732), new Object[]{Integer.valueOf(NewDeviceListFragment.this.f12070p.getItemCount())}));
            NewDeviceListFragment newDeviceListFragment2 = NewDeviceListFragment.this;
            newDeviceListFragment2.f12066l.setText(String.format(locale, newDeviceListFragment2.getString(2131755734), new Object[]{Integer.valueOf(NewDeviceListFragment.this.f12071q.getItemCount())}));
        }
    }

    public NewDeviceListFragment() {
        Uri uri = C6043b.f12320b;
        this.f12072r = new C5976m(new Handler());
        this.f12073s = new C5969f();
    }

    /* renamed from: C */
    private ValueAnimator m17425C(float f, float f2, RecyclerView recyclerView) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f, f2});
        ofFloat.addUpdateListener(new C5964a(this, recyclerView));
        return ofFloat;
    }

    /* access modifiers changed from: private */
    /* renamed from: K */
    public void m17431K() {
        if (this.f12063i.getVisibility() == 0) {
            ValueAnimator V = m17441V((float) this.f12063i.getHeight(), (float) this.f12061g.getHeight(), this.f12063i);
            V.setDuration(200);
            V.setInterpolator(new DecelerateInterpolator());
            V.addListener(new C5967d());
            ValueAnimator C = m17425C(1.0f, 0.0f, this.f12063i);
            C.setDuration(200);
            ObjectAnimator duration = ObjectAnimator.ofFloat(this.f12065k, Key.ROTATION, new float[]{90.0f, 0.0f}).setDuration(200);
            ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.f12061g, "alpha", new float[]{0.3f, 1.0f}).setDuration(200);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.play(C).with(V).with(duration).with(duration2);
            animatorSet.start();
            return;
        }
        ValueAnimator V2 = m17441V((float) this.f12061g.getHeight(), (float) this.f12063i.getHeight(), this.f12063i);
        V2.setDuration(200);
        V2.setInterpolator(new AccelerateInterpolator());
        V2.addListener(new C5968e());
        ValueAnimator C2 = m17425C(0.0f, 1.0f, this.f12063i);
        C2.setDuration(200);
        ObjectAnimator duration3 = ObjectAnimator.ofFloat(this.f12065k, Key.ROTATION, new float[]{0.0f, 90.0f}).setDuration(200);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.play(C2).with(V2).with(duration3);
        animatorSet2.start();
    }

    /* renamed from: M */
    private boolean m17432M() {
        String f = AppConfigurationProvider.m17574f("device_status");
        return f.isEmpty() || Integer.valueOf(f).intValue() == 1;
    }

    /* renamed from: N */
    private boolean m17433N() {
        String f = AppConfigurationProvider.m17574f("group_status");
        return f.isEmpty() || Integer.valueOf(f).intValue() == 1;
    }

    /* access modifiers changed from: private */
    /* renamed from: O */
    public void m17434O() {
        ValueAnimator valueAnimator;
        AnimatorSet animatorSet;
        ObjectAnimator objectAnimator;
        ValueAnimator valueAnimator2;
        if (this.f12062h.getVisibility() == 0) {
            valueAnimator2 = m17441V((float) this.f12062h.getHeight(), 0.0f, this.f12062h);
            valueAnimator2.setDuration(200);
            valueAnimator2.setInterpolator(new AccelerateInterpolator());
            valueAnimator2.addListener(new C5965b());
            valueAnimator = m17425C(1.0f, 0.3f, this.f12062h);
            valueAnimator.setDuration(200);
            objectAnimator = ObjectAnimator.ofFloat(this.f12064j, Key.ROTATION, new float[]{90.0f, 0.0f}).setDuration(200);
            animatorSet = new AnimatorSet();
        } else {
            this.f12062h.setVisibility(0);
            valueAnimator2 = m17441V(0.0f, (float) this.f12062h.getHeight(), this.f12062h);
            valueAnimator2.setDuration(200);
            valueAnimator2.setInterpolator(new AccelerateInterpolator());
            valueAnimator2.addListener(new C5966c());
            valueAnimator = m17425C(0.0f, 1.0f, this.f12062h);
            valueAnimator.setDuration(200);
            objectAnimator = ObjectAnimator.ofFloat(this.f12064j, Key.ROTATION, new float[]{0.0f, 90.0f}).setDuration(200);
            animatorSet = new AnimatorSet();
        }
        animatorSet.play(valueAnimator).with(valueAnimator2).with(objectAnimator);
        animatorSet.start();
    }

    /* access modifiers changed from: private */
    /* renamed from: P */
    public /* synthetic */ void m17435P() {
        this.f12055a.setVisibility(8);
    }

    /* access modifiers changed from: private */
    /* renamed from: Q */
    public /* synthetic */ void m17436Q() {
        this.f12056b.setText(getResources().getString(2131755640));
        this.f12055a.setVisibility(0);
    }

    /* access modifiers changed from: private */
    /* renamed from: R */
    public /* synthetic */ boolean m17437R() {
        if (Build.VERSION.SDK_INT < 31) {
            return true;
        }
        if (ContextCompat.checkSelfPermission(getContext(), "android.permission.BLUETOOTH_SCAN") == 0 && ContextCompat.checkSelfPermission(getContext(), "android.permission.BLUETOOTH_CONNECT") == 0) {
            return true;
        }
        if (shouldShowRequestPermissionRationale("android.permission.BLUETOOTH_SCAN")) {
            Toast.makeText(getContext(), 2131755993, 0).show();
            return false;
        }
        requestPermissions(new String[]{"android.permission.BLUETOOTH_SCAN", "android.permission.BLUETOOTH_CONNECT"}, 201);
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: S */
    public /* synthetic */ void m17438S() {
        this.f12055a.setVisibility(8);
    }

    /* access modifiers changed from: private */
    /* renamed from: T */
    public /* synthetic */ void m17439T() {
        this.f12056b.setText(getResources().getString(2131755640));
        this.f12055a.setVisibility(0);
    }

    /* access modifiers changed from: private */
    /* renamed from: U */
    public /* synthetic */ void m17440U(int i) {
        TextView textView = this.f12056b;
        textView.setText(getResources().getString(2131755646) + "(" + i + ")");
        this.f12055a.setVisibility(0);
    }

    /* renamed from: V */
    private ValueAnimator m17441V(float f, float f2, RecyclerView recyclerView) {
        return ValueAnimator.ofFloat(new float[]{f, f2});
    }

    /* access modifiers changed from: private */
    /* renamed from: X */
    public void m17442X(int i) {
        C3279g.m8804d(i);
        AppConfigurationProvider.m17582n("device_status", String.valueOf(i));
    }

    /* access modifiers changed from: private */
    /* renamed from: Y */
    public void m17443Y(int i) {
        AppConfigurationProvider.m17582n("group_status", String.valueOf(i));
    }

    /* renamed from: E */
    public void mo30149E(C3012e eVar) {
    }

    /* renamed from: I */
    public void mo23265I() {
        getActivity().runOnUiThread(new C6010o(this));
        this.f12069o = true;
    }

    /* renamed from: L */
    public void mo30150L() {
        Runnable runnable;
        LinearLayout linearLayout;
        if (!this.f12069o) {
            linearLayout = this.f12055a;
            runnable = new C6011p(this);
        } else {
            linearLayout = this.f12055a;
            runnable = new C6008m(this);
        }
        linearLayout.post(runnable);
    }

    /* renamed from: W */
    public void mo31273W() {
        C6065f fVar = new C6065f(DeviceDataProvider.m17644z());
        MatrixCursor matrixCursor = new MatrixCursor(new String[]{C6043b.C6046b.C6047a.f12342a, "group_id"});
        Cursor C = DeviceDataProvider.m17590C();
        int i = 0;
        while (C.moveToNext()) {
            matrixCursor.addRow(new Object[]{Integer.valueOf(i), C.getString(C.getColumnIndex(C6043b.C6046b.C6047a.f12342a))});
            i++;
        }
        C.close();
        Cursor D = DeviceDataProvider.m17591D();
        while (D.moveToNext()) {
            int i2 = i + 1;
            matrixCursor.addRow(new Object[]{Integer.valueOf(i), D.getString(D.getColumnIndex(C6043b.C6054f.C6055a.f12382c)) + "_" + D.getString(D.getColumnIndex(C6043b.C6054f.C6055a.f12380a))});
            i = i2;
        }
        D.close();
        this.f12073s.post(new C5977n(fVar, matrixCursor));
    }

    /* renamed from: i */
    public void mo23294i(int i) {
        this.f12069o = false;
        if (C3051a.m7928z()) {
            YeelightDeviceManager.m7800o0().mo23278Z(false, false, true);
        }
        this.f12055a.post(new C6009n(this));
    }

    /* renamed from: j */
    public void mo23296j() {
    }

    /* renamed from: k */
    public void mo30151k() {
    }

    /* renamed from: m */
    public void mo30152m(C3012e eVar) {
    }

    /* renamed from: o */
    public void mo30153o() {
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C12228R$layout.fragment_new_device_list, viewGroup, false);
        this.f12055a = (LinearLayout) inflate.findViewById(C12225R$id.layout_alarm);
        this.f12056b = (TextView) inflate.findViewById(C12225R$id.tv_alarm);
        this.f12057c = (YeelightScrollView) inflate.findViewById(C12225R$id.device_group_list_view);
        this.f12058d = (LinearLayout) inflate.findViewById(C12225R$id.group_list_layout);
        this.f12059e = (LinearLayout) inflate.findViewById(C12225R$id.group_list_bar);
        this.f12060f = (LinearLayout) inflate.findViewById(C12225R$id.device_list_bar);
        this.f12062h = (RecyclerView) inflate.findViewById(C12225R$id.group_device_list);
        this.f12063i = (RecyclerView) inflate.findViewById(2131296669);
        this.f12064j = (ImageView) inflate.findViewById(C12225R$id.img_group_view_tip);
        this.f12065k = (ImageView) inflate.findViewById(C12225R$id.img_device_view_tip);
        this.f12061g = (LinearLayout) inflate.findViewById(C12225R$id.layout_control_device_all);
        this.f12067m = (TextView) inflate.findViewById(C12225R$id.text_device_info);
        this.f12066l = (TextView) inflate.findViewById(C12225R$id.text_group_info);
        CommonFragmentDefaultView commonFragmentDefaultView = (CommonFragmentDefaultView) inflate.findViewById(2131296738);
        commonFragmentDefaultView.mo36194a(C12224R$drawable.icon_yeelight_default_image_device, 2131756238, 2131756237, 2131756234, new C5970g());
        this.f12063i.setLayoutManager(new LinearLayoutManager(inflate.getContext()));
        this.f12062h.setLayoutManager(new LinearLayoutManager(inflate.getContext()));
        DeviceRecyclerViewAdapter deviceRecyclerViewAdapter = new DeviceRecyclerViewAdapter(getActivity(), (Cursor) null);
        this.f12070p = deviceRecyclerViewAdapter;
        deviceRecyclerViewAdapter.mo31221j(new C6007l(this));
        this.f12071q = new GroupRecyclerViewAdapter(getActivity(), (Cursor) null);
        this.f12063i.setAdapter(this.f12070p);
        this.f12062h.setAdapter(this.f12071q);
        this.f12070p.registerAdapterDataObserver(new RVEmptyObserver(inflate.findViewById(2131297081), commonFragmentDefaultView, this.f12063i));
        this.f12062h.setNestedScrollingEnabled(false);
        this.f12063i.setNestedScrollingEnabled(false);
        this.f12068n = (TwinklingRefreshLayout) inflate.findViewById(2131297292);
        C8869a aVar = new C8869a(getContext());
        this.f12068n.setOverScrollRefreshShow(false);
        this.f12068n.setHeaderView(aVar);
        this.f12068n.setNestedScrollingEnabled(false);
        this.f12068n.setBottomView((C3686a) null);
        this.f12068n.setEnableLoadmore(false);
        this.f12068n.setEnableOverScroll(true);
        this.f12068n.setOnRefreshListener(new C5971h());
        this.f12059e.setOnClickListener(new C5972i());
        this.f12060f.setOnClickListener(new C5973j());
        if (m17432M()) {
            ObjectAnimator.ofFloat(this.f12065k, Key.ROTATION, new float[]{0.0f, 90.0f}).setDuration(1).start();
            this.f12063i.setVisibility(0);
            this.f12061g.setVisibility(8);
        } else {
            this.f12063i.setVisibility(8);
            this.f12061g.setVisibility(0);
        }
        if (m17433N()) {
            ObjectAnimator.ofFloat(this.f12064j, Key.ROTATION, new float[]{0.0f, 90.0f}).setDuration(1).start();
            this.f12062h.setVisibility(0);
        } else {
            this.f12062h.setVisibility(8);
        }
        inflate.findViewById(C12225R$id.device_all_off_layout).setOnClickListener(new C5974k(this));
        inflate.findViewById(C12225R$id.device_all_on_layout).setOnClickListener(new C5975l(this));
        return inflate;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f12073s.removeCallbacksAndMessages((Object) null);
        this.f12070p = null;
        this.f12071q = null;
    }

    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
    }

    public void onPause() {
        super.onPause();
        DeviceRecyclerViewAdapter deviceRecyclerViewAdapter = this.f12070p;
        if (deviceRecyclerViewAdapter != null) {
            deviceRecyclerViewAdapter.mo31222k(false);
        }
        YeelightDeviceManager.m7800o0().mo23271L1(this);
    }

    public void onRefresh() {
    }

    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 201 && iArr.length > 0 && iArr[0] == 0) {
            YeelightDeviceManager.m7800o0().mo23278Z(true, false, false);
        }
    }

    public void onResume() {
        super.onResume();
        DeviceRecyclerViewAdapter deviceRecyclerViewAdapter = this.f12070p;
        if (deviceRecyclerViewAdapter != null) {
            deviceRecyclerViewAdapter.mo31222k(true);
        }
        YeelightDeviceManager.m7800o0().mo23309q1(this);
    }

    public void onStart() {
        super.onStart();
        C8272e.m19511b().mo35210j(this);
        YeelightDeviceManager.m7800o0().mo23323x1(60000);
        if (C3051a.m7928z()) {
            YeelightDeviceManager.m7800o0().mo23278Z(true, false, true);
            YeelightDeviceManager.m7800o0().mo23307p1();
        }
        mo31273W();
        getActivity().getContentResolver().registerContentObserver(C6043b.C6044a.f12327a, true, this.f12072r);
        getActivity().getContentResolver().registerContentObserver(C6043b.C6046b.f12341a, true, this.f12072r);
    }

    public void onStop() {
        super.onStop();
        C8272e.m19511b().mo35212m(this);
        getActivity().getContentResolver().unregisterContentObserver(this.f12072r);
        YeelightDeviceManager.m7800o0().mo23259D1();
    }

    /* renamed from: t */
    public void mo30160t() {
    }

    /* renamed from: v */
    public void mo23318v() {
    }

    /* renamed from: y */
    public void mo30163y(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("onRemoteWifiDiscoveryError: ");
        sb.append(i);
        this.f12055a.post(new C6012q(this, i));
    }
}
