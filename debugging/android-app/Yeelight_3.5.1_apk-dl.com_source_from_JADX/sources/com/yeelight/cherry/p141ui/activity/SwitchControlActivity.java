package com.yeelight.cherry.p141ui.activity;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.LightingColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.motion.widget.Key;
import androidx.core.view.ViewCompat;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.google.android.material.tabs.TabLayout;
import com.yeelight.cherry.C12228R$layout;
import com.yeelight.yeelib.device.base.C6093d;
import com.yeelight.yeelib.device.base.C6117h;
import com.yeelight.yeelib.device.base.DeviceStatusBase;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.p142ui.activity.BaseActivity;
import com.yeelight.yeelib.p142ui.activity.DelaySetNew2Activity;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;
import com.yeelight.yeelib.utils.AppUtils;
import java.lang.reflect.Field;
import java.util.List;
import p051j4.C3284x;
import p051j4.C9193k;
import p237z3.C12143c;
import p237z3.C12145e;

/* renamed from: com.yeelight.cherry.ui.activity.SwitchControlActivity */
public class SwitchControlActivity extends BaseActivity implements C12143c, C12145e {

    /* renamed from: g */
    private static final String f11455g = "SwitchControlActivity";

    /* renamed from: h */
    public static final /* synthetic */ int f11456h = 0;

    /* renamed from: a */
    private long f11457a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C6117h f11458b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public boolean f11459c = false;

    /* renamed from: d */
    private boolean f11460d = false;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public List<C6093d> f11461e;

    /* renamed from: f */
    private C5707d f11462f;
    @BindView(2131296621)
    TextView mDelayEnable;
    @BindView(2131296818)
    GridView mFunctionGridView;
    @BindView(2131296866)
    ImageView mImageLeft;
    @BindView(2131296869)
    ImageView mImageMiddle;
    @BindView(2131296870)
    ImageView mImageRight;
    @BindView(2131296997)
    LinearLayout mLayoutAnimation;
    @BindView(2131297023)
    LinearLayout mLayoutLeft;
    @BindView(2131297025)
    ViewGroup mLayoutMiddle;
    @BindView(2131297032)
    LinearLayout mLayoutRight;
    @BindView(2131297452)
    LinearLayout mLayoutShadows;
    @BindView(2131296587)
    LinearLayout mMoreLayout;
    @BindView(2131297530)
    TabLayout mTabLayout;
    @BindView(2131297591)
    CommonTitleBar mTitleBar;
    @BindView(2131297654)
    TextView mTvFirmware;

    /* renamed from: com.yeelight.cherry.ui.activity.SwitchControlActivity$a */
    class C5704a implements TabLayout.BaseOnTabSelectedListener {
        C5704a() {
        }

        public void onTabReselected(TabLayout.Tab tab) {
        }

        public void onTabSelected(TabLayout.Tab tab) {
            SwitchControlActivity.this.f11458b.mo31741s2(tab.getPosition());
            SwitchControlActivity switchControlActivity = SwitchControlActivity.this;
            switchControlActivity.m17140n0(switchControlActivity.f11458b.mo23146k1());
            SwitchControlActivity.this.m17120D0();
        }

        public void onTabUnselected(TabLayout.Tab tab) {
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.SwitchControlActivity$b */
    class C5705b implements Animator.AnimatorListener {
        C5705b() {
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            SwitchControlActivity.this.mLayoutShadows.setVisibility(8);
            SwitchControlActivity switchControlActivity = SwitchControlActivity.this;
            boolean unused = switchControlActivity.f11459c = !switchControlActivity.f11459c;
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.SwitchControlActivity$c */
    class C5706c implements Animator.AnimatorListener {
        C5706c() {
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            SwitchControlActivity switchControlActivity = SwitchControlActivity.this;
            boolean unused = switchControlActivity.f11459c = !switchControlActivity.f11459c;
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
            SwitchControlActivity.this.mLayoutShadows.setVisibility(0);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.SwitchControlActivity$d */
    private class C5707d extends BaseAdapter {

        /* renamed from: com.yeelight.cherry.ui.activity.SwitchControlActivity$d$a */
        class C5708a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ int f11467a;

            C5708a(int i) {
                this.f11467a = i;
            }

            public void onClick(View view) {
                if (((C6093d) SwitchControlActivity.this.f11461e.get(this.f11467a)).mo31688h() != null) {
                    SwitchControlActivity switchControlActivity = SwitchControlActivity.this;
                    ((C6093d) SwitchControlActivity.this.f11461e.get(this.f11467a)).mo31695o(switchControlActivity, switchControlActivity.f11458b.mo23185G());
                }
            }
        }

        private C5707d() {
        }

        /* synthetic */ C5707d(SwitchControlActivity switchControlActivity, C5704a aVar) {
            this();
        }

        public int getCount() {
            return SwitchControlActivity.this.f11461e == null ? 0 : 9;
        }

        public Object getItem(int i) {
            return null;
        }

        public long getItemId(int i) {
            return 0;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            C5709e eVar;
            int i2;
            TextView textView;
            if (i >= SwitchControlActivity.this.f11461e.size()) {
                return LayoutInflater.from(SwitchControlActivity.this).inflate(2131493106, (ViewGroup) null);
            }
            if (view == null || view.getTag() == null) {
                eVar = new C5709e(SwitchControlActivity.this, (C5704a) null);
                view = LayoutInflater.from(SwitchControlActivity.this).inflate(2131493107, (ViewGroup) null);
                view.setTag(eVar);
            } else {
                eVar = (C5709e) view.getTag();
            }
            eVar.f11473e = ((C6093d) SwitchControlActivity.this.f11461e.get(i)).mo31684d();
            eVar.f11469a = (ImageView) view.findViewById(2131296819);
            eVar.f11470b = (TextView) view.findViewById(2131296816);
            eVar.f11471c = (TextView) view.findViewById(2131296820);
            eVar.f11472d = (LinearLayout) view.findViewById(2131296828);
            eVar.f11471c.setText(((C6093d) SwitchControlActivity.this.f11461e.get(i)).mo31687g());
            if (((C6093d) SwitchControlActivity.this.f11461e.get(i)).mo31692l()) {
                eVar.f11470b.setVisibility(0);
                if (((C6093d) SwitchControlActivity.this.f11461e.get(i)).mo31690j()) {
                    textView = eVar.f11470b;
                    i2 = SwitchControlActivity.this.getResources().getColor(2131099809);
                } else {
                    textView = eVar.f11470b;
                    i2 = -3355444;
                }
                textView.setBackgroundColor(i2);
                SwitchControlActivity.this.f11458b.mo23178B0(eVar);
            } else {
                eVar.f11470b.setVisibility(4);
                SwitchControlActivity.this.f11458b.mo23213W0(eVar);
            }
            eVar.f11469a.setBackgroundResource(((C6093d) SwitchControlActivity.this.f11461e.get(i)).mo31686f());
            eVar.f11472d.setOnClickListener(new C5708a(i));
            return view;
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.SwitchControlActivity$e */
    private class C5709e implements C12145e {

        /* renamed from: a */
        public ImageView f11469a;

        /* renamed from: b */
        public TextView f11470b;

        /* renamed from: c */
        public TextView f11471c;

        /* renamed from: d */
        public LinearLayout f11472d;

        /* renamed from: e */
        public int f11473e;

        /* renamed from: com.yeelight.cherry.ui.activity.SwitchControlActivity$e$a */
        class C5710a implements Runnable {
            C5710a() {
            }

            public void run() {
                if (SwitchControlActivity.this.f11458b != null && SwitchControlActivity.this.f11458b.mo23195M() != null) {
                    for (C6093d next : SwitchControlActivity.this.f11458b.mo23195M()) {
                        if (next.mo31684d() == C5709e.this.f11473e) {
                            if (next.mo31690j()) {
                                C5709e eVar = C5709e.this;
                                eVar.f11470b.setBackgroundColor(SwitchControlActivity.this.getResources().getColor(2131099809));
                            } else {
                                C5709e.this.f11470b.setBackgroundColor(-3355444);
                            }
                        }
                    }
                }
            }
        }

        private C5709e() {
        }

        /* synthetic */ C5709e(SwitchControlActivity switchControlActivity, C5704a aVar) {
            this();
        }

        public void onStatusChange(int i, DeviceStatusBase deviceStatusBase) {
            if (i == 4096) {
                SwitchControlActivity.this.runOnUiThread(new C5710a());
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: A0 */
    public /* synthetic */ void m17118A0(ImageView imageView, int i) {
        LightingColorFilter lightingColorFilter = new LightingColorFilter(ViewCompat.MEASURED_STATE_MASK, getResources().getColor(2131099805));
        Drawable drawable = imageView.getContext().getResources().getDrawable(i);
        drawable.clearColorFilter();
        drawable.mutate().setColorFilter(lightingColorFilter);
        imageView.setBackground(drawable);
    }

    /* renamed from: C0 */
    private void m17119C0(boolean z) {
        ObjectAnimator objectAnimator;
        Animator.AnimatorListener animatorListener;
        if (z) {
            objectAnimator = ObjectAnimator.ofFloat(this.mLayoutAnimation, "translationY", new float[]{0.0f, (float) this.mMoreLayout.getHeight()}).setDuration(300);
            objectAnimator.setInterpolator(new AccelerateInterpolator());
            objectAnimator.start();
            ObjectAnimator.ofFloat(this.mImageRight, Key.ROTATION, new float[]{180.0f, 0.0f}).setDuration(20).start();
            ObjectAnimator.ofFloat(this.mLayoutShadows, "alpha", new float[]{1.0f, 0.0f}).setDuration(300).start();
            animatorListener = new C5705b();
        } else {
            this.mLayoutShadows.setVisibility(0);
            objectAnimator = ObjectAnimator.ofFloat(this.mLayoutAnimation, "translationY", new float[]{(float) this.mMoreLayout.getHeight(), 0.0f}).setDuration(300);
            objectAnimator.setInterpolator(new DecelerateInterpolator());
            objectAnimator.start();
            ObjectAnimator.ofFloat(this.mImageRight, Key.ROTATION, new float[]{0.0f, 180.0f}).setDuration(20).start();
            ObjectAnimator.ofFloat(this.mLayoutShadows, "alpha", new float[]{0.0f, 1.0f}).setDuration(300).start();
            animatorListener = new C5706c();
        }
        objectAnimator.addListener(animatorListener);
    }

    /* access modifiers changed from: private */
    /* renamed from: D0 */
    public void m17120D0() {
        this.mDelayEnable.setBackgroundColor(this.f11458b.mo31740r2() ? getResources().getColor(2131099809) : -3355444);
    }

    /* renamed from: E0 */
    private void m17121E0(ImageView imageView, int i) {
        imageView.post(new C5739c4(this, imageView, i));
    }

    /* access modifiers changed from: private */
    /* renamed from: n0 */
    public void m17140n0(boolean z) {
        this.mImageLeft.post(new C5745d4(this, z));
    }

    /* renamed from: o0 */
    private void m17141o0() {
        int[] iArr = {2131756350, 2131756352};
        mo30926B0(this.mTabLayout, 0);
        for (int i = 0; i < 2; i++) {
            int i2 = iArr[i];
            TabLayout.Tab newTab = this.mTabLayout.newTab();
            newTab.setText(i2);
            this.mTabLayout.addTab(newTab);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: p0 */
    public /* synthetic */ void m17142p0(boolean z) {
        if (z) {
            m17121E0(this.mImageLeft, 2131231247);
        } else {
            this.mImageLeft.setBackgroundResource(2131231247);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: q0 */
    public /* synthetic */ void m17143q0(View view) {
        onBackPressed();
    }

    /* access modifiers changed from: private */
    /* renamed from: r0 */
    public /* synthetic */ void m17144r0(View view) {
        Intent intent = new Intent(this, DeviceSettingActivity.class);
        intent.putExtra("com.yeelight.cherry.device_id", this.f11458b.mo23185G());
        startActivity(intent);
    }

    /* access modifiers changed from: private */
    /* renamed from: s0 */
    public /* synthetic */ void m17145s0() {
        this.mLayoutAnimation.setTranslationY((float) this.mMoreLayout.getHeight());
    }

    /* access modifiers changed from: private */
    /* renamed from: t0 */
    public /* synthetic */ void m17146t0(View view) {
        if (System.currentTimeMillis() - this.f11457a >= 300) {
            this.f11457a = System.currentTimeMillis();
            boolean z = this.f11459c;
            if (z) {
                m17119C0(z);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: u0 */
    public /* synthetic */ void m17147u0(View view) {
        boolean z;
        if (this.f11458b.mo23146k1()) {
            this.f11458b.mo23140b1();
            z = false;
        } else {
            this.f11458b.mo23148l1();
            z = true;
        }
        m17140n0(z);
        C3284x.m8852b();
    }

    /* access modifiers changed from: private */
    /* renamed from: v0 */
    public /* synthetic */ void m17148v0(View view) {
        Resources resources;
        int i;
        Intent intent = new Intent();
        intent.setClass(this, DelaySetNew2Activity.class);
        intent.putExtra("com.yeelight.cherry.device_id", this.f11458b.mo23185G());
        if (this.mTabLayout.getSelectedTabPosition() == 0) {
            resources = getResources();
            i = 2131756349;
        } else {
            if (this.mTabLayout.getSelectedTabPosition() == 1) {
                resources = getResources();
                i = 2131756351;
            }
            startActivity(intent);
        }
        intent.putExtra("feature_name", resources.getString(i));
        startActivity(intent);
    }

    /* access modifiers changed from: private */
    /* renamed from: w0 */
    public /* synthetic */ void m17149w0(View view) {
        if (System.currentTimeMillis() - this.f11457a >= 300) {
            this.f11457a = System.currentTimeMillis();
            m17119C0(this.f11459c);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: x0 */
    public /* synthetic */ void m17150x0(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (this.f11460d) {
            this.f11460d = false;
            if (this.f11459c) {
                this.f11459c = false;
                m17119C0(false);
                return;
            }
            this.mLayoutAnimation.setTranslationY((float) this.mMoreLayout.getHeight());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: y0 */
    public /* synthetic */ void m17151y0() {
        this.f11460d = true;
        this.f11461e = this.f11458b.mo23195M();
        C5707d dVar = this.f11462f;
        if (dVar != null) {
            dVar.notifyDataSetChanged();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: z0 */
    public static /* synthetic */ void m17152z0(TabLayout tabLayout, int i) {
        try {
            LinearLayout linearLayout = (LinearLayout) tabLayout.getChildAt(0);
            int b = C9193k.m22151b(tabLayout.getContext(), (float) i);
            for (int i2 = 0; i2 < linearLayout.getChildCount(); i2++) {
                View childAt = linearLayout.getChildAt(i2);
                Field declaredField = childAt.getClass().getDeclaredField("textView");
                declaredField.setAccessible(true);
                TextView textView = (TextView) declaredField.get(childAt);
                childAt.setPadding(0, 0, 0, 0);
                int width = textView.getWidth();
                if (width == 0) {
                    textView.measure(0, 0);
                    width = textView.getMeasuredWidth();
                }
                int width2 = childAt.getWidth();
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
                layoutParams.width = width;
                if (i == 0) {
                    int i3 = width2 - width;
                    layoutParams.leftMargin = i3 / 2;
                    layoutParams.rightMargin = i3 / 2;
                } else {
                    layoutParams.leftMargin = b;
                    layoutParams.rightMargin = b;
                }
                childAt.setLayoutParams(layoutParams);
                childAt.invalidate();
            }
        } catch (IllegalAccessException | NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: B0 */
    public void mo30926B0(TabLayout tabLayout, int i) {
        tabLayout.post(new C5787k4(tabLayout, i));
    }

    public void onBackPressed() {
        boolean z = this.f11459c;
        if (z) {
            m17119C0(z);
        } else {
            super.onBackPressed();
        }
    }

    public void onConnectionStateChanged(int i, int i2) {
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        String str;
        TextView textView;
        super.onCreate(bundle);
        setContentView(C12228R$layout.activity_switch_control);
        C9193k.m22157h(true, this);
        ButterKnife.bind((Activity) this);
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            AppUtils.m8302w(f11455g, "Activity has not device id", false);
            finish();
            return;
        }
        C6117h hVar = (C6117h) YeelightDeviceManager.m7804r0(intent.getStringExtra("com.yeelight.cherry.device_id"));
        this.f11458b = hVar;
        if (hVar == null || !hVar.mo23145k0()) {
            BaseActivity.m19947U(this);
            finish();
            return;
        }
        if (this.f11458b.mo23197N() == null) {
            this.f11458b.mo23169y0();
        }
        if (this.f11458b.mo23197N() != null) {
            textView = this.mTvFirmware;
            str = String.format(getText(2131756328).toString(), new Object[]{this.f11458b.mo23197N().mo42511c()});
        } else {
            textView = this.mTvFirmware;
            str = String.format(getText(2131756328).toString(), new Object[]{"--"});
        }
        textView.setText(str);
        this.mTitleBar.mo36195a(this.f11458b.mo23210U(), new C5733b4(this), new C5775i4(this));
        this.mTitleBar.setTitleTextSize(16);
        m17141o0();
        this.f11458b.mo31741s2(0);
        this.f11461e = this.f11458b.mo23195M();
        C5707d dVar = new C5707d(this, (C5704a) null);
        this.f11462f = dVar;
        this.mFunctionGridView.setAdapter(dVar);
        this.mMoreLayout.post(new C5793l4(this));
        this.mTabLayout.addOnTabSelectedListener(new C5704a());
        this.mLayoutShadows.setOnClickListener(new C5763g4(this));
        this.mLayoutLeft.setOnClickListener(new C5769h4(this));
        this.mLayoutMiddle.setOnClickListener(new C5757f4(this));
        this.mLayoutRight.setOnClickListener(new C5751e4(this));
        this.mMoreLayout.addOnLayoutChangeListener(new C5781j4(this));
    }

    public void onLocalConnected() {
    }

    public void onLocalDisconnected() {
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.f11458b.mo23133V0(this);
        this.f11458b.mo23213W0(this);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        C6117h hVar = this.f11458b;
        if (hVar != null) {
            this.mTitleBar.setTitle(hVar.mo23210U());
            m17140n0(this.f11458b.mo23146k1());
            m17120D0();
            this.f11458b.mo23171z0(this);
            this.f11458b.mo23178B0(this);
        }
    }

    public void onStatusChange(int i, DeviceStatusBase deviceStatusBase) {
        if (i == 1 || i == 2) {
            m17140n0(this.f11458b.mo23146k1());
        } else if (i == 256) {
            this.mLayoutAnimation.postDelayed(new C5799m4(this), 100);
        } else if (i == 4096) {
            m17120D0();
        }
    }
}
