package com.yeelight.cherry.p177ui.activity;

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
import androidx.core.view.ViewCompat;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.google.android.material.tabs.TabLayout;
import com.yeelight.cherry.C11748R$layout;
import com.yeelight.yeelib.p150c.p151i.C6024e;
import com.yeelight.yeelib.p150c.p151i.C6038h;
import com.yeelight.yeelib.p150c.p151i.C6072p;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p186e.C9768c;
import com.yeelight.yeelib.p186e.C9770e;
import com.yeelight.yeelib.p194ui.activity.BaseActivity;
import com.yeelight.yeelib.p194ui.activity.DelaySetNew2Activity;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;
import com.yeelight.yeelib.utils.C10547m;
import com.yeelight.yeelib.utils.C4308b;
import com.yeelight.yeelib.utils.C4315y;
import java.lang.reflect.Field;
import java.util.List;

/* renamed from: com.yeelight.cherry.ui.activity.SwitchControlActivity */
public class SwitchControlActivity extends BaseActivity implements C9768c, C9770e {

    /* renamed from: h */
    private static final String f11883h = SwitchControlActivity.class.getSimpleName();

    /* renamed from: b */
    private long f11884b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C6072p f11885c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f11886d = false;

    /* renamed from: e */
    private boolean f11887e = false;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public List<C6038h> f11888f;

    /* renamed from: g */
    private C5666d f11889g;
    @BindView(2131296545)
    TextView mDelayEnable;
    @BindView(2131296721)
    GridView mFunctionGridView;
    @BindView(2131296762)
    ImageView mImageLeft;
    @BindView(2131296765)
    ImageView mImageMiddle;
    @BindView(2131296766)
    ImageView mImageRight;
    @BindView(2131296886)
    LinearLayout mLayoutAnimation;
    @BindView(2131296912)
    LinearLayout mLayoutLeft;
    @BindView(2131296914)
    ViewGroup mLayoutMiddle;
    @BindView(2131296921)
    LinearLayout mLayoutRight;
    @BindView(2131297309)
    LinearLayout mLayoutShadows;
    @BindView(2131296515)
    LinearLayout mMoreLayout;
    @BindView(2131297374)
    TabLayout mTabLayout;
    @BindView(2131297424)
    CommonTitleBar mTitleBar;
    @BindView(2131297479)
    TextView mTvFirmware;

    /* renamed from: com.yeelight.cherry.ui.activity.SwitchControlActivity$a */
    class C5663a implements TabLayout.BaseOnTabSelectedListener {
        C5663a() {
        }

        public void onTabReselected(TabLayout.Tab tab) {
        }

        public void onTabSelected(TabLayout.Tab tab) {
            SwitchControlActivity.this.f11885c.mo27860s2(tab.getPosition());
            SwitchControlActivity switchControlActivity = SwitchControlActivity.this;
            switchControlActivity.m17101b0(switchControlActivity.f11885c.mo23332k1());
            SwitchControlActivity.this.m17105r0();
        }

        public void onTabUnselected(TabLayout.Tab tab) {
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.SwitchControlActivity$b */
    class C5664b implements Animator.AnimatorListener {
        C5664b() {
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            SwitchControlActivity.this.mLayoutShadows.setVisibility(8);
            SwitchControlActivity switchControlActivity = SwitchControlActivity.this;
            boolean unused = switchControlActivity.f11886d = !switchControlActivity.f11886d;
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.SwitchControlActivity$c */
    class C5665c implements Animator.AnimatorListener {
        C5665c() {
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            SwitchControlActivity switchControlActivity = SwitchControlActivity.this;
            boolean unused = switchControlActivity.f11886d = !switchControlActivity.f11886d;
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
            SwitchControlActivity.this.mLayoutShadows.setVisibility(0);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.SwitchControlActivity$d */
    private class C5666d extends BaseAdapter {

        /* renamed from: com.yeelight.cherry.ui.activity.SwitchControlActivity$d$a */
        class C5667a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ int f11894a;

            C5667a(int i) {
                this.f11894a = i;
            }

            public void onClick(View view) {
                if (((C6038h) SwitchControlActivity.this.f11888f.get(this.f11894a)).mo27778h() != null) {
                    SwitchControlActivity switchControlActivity = SwitchControlActivity.this;
                    ((C6038h) SwitchControlActivity.this.f11888f.get(this.f11894a)).mo27785o(switchControlActivity, switchControlActivity.f11885c.mo23372G());
                }
            }
        }

        private C5666d() {
        }

        /* synthetic */ C5666d(SwitchControlActivity switchControlActivity, C5663a aVar) {
            this();
        }

        public int getCount() {
            return SwitchControlActivity.this.f11888f == null ? 0 : 9;
        }

        public Object getItem(int i) {
            return null;
        }

        public long getItemId(int i) {
            return 0;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            C5668e eVar;
            int i2;
            TextView textView;
            if (i >= SwitchControlActivity.this.f11888f.size()) {
                return LayoutInflater.from(SwitchControlActivity.this).inflate(2131493102, (ViewGroup) null);
            }
            if (view == null || view.getTag() == null) {
                eVar = new C5668e(SwitchControlActivity.this, (C5663a) null);
                view = LayoutInflater.from(SwitchControlActivity.this).inflate(2131493103, (ViewGroup) null);
                view.setTag(eVar);
            } else {
                eVar = (C5668e) view.getTag();
            }
            eVar.f11900e = ((C6038h) SwitchControlActivity.this.f11888f.get(i)).mo27774d();
            eVar.f11896a = (ImageView) view.findViewById(2131296722);
            eVar.f11897b = (TextView) view.findViewById(2131296719);
            eVar.f11898c = (TextView) view.findViewById(2131296723);
            eVar.f11899d = (LinearLayout) view.findViewById(2131296729);
            eVar.f11898c.setText(((C6038h) SwitchControlActivity.this.f11888f.get(i)).mo27777g());
            if (((C6038h) SwitchControlActivity.this.f11888f.get(i)).mo27782l()) {
                eVar.f11897b.setVisibility(0);
                if (((C6038h) SwitchControlActivity.this.f11888f.get(i)).mo27780j()) {
                    textView = eVar.f11897b;
                    i2 = SwitchControlActivity.this.getResources().getColor(2131099806);
                } else {
                    textView = eVar.f11897b;
                    i2 = -3355444;
                }
                textView.setBackgroundColor(i2);
                SwitchControlActivity.this.f11885c.mo23365B0(eVar);
            } else {
                eVar.f11897b.setVisibility(4);
                SwitchControlActivity.this.f11885c.mo23400W0(eVar);
            }
            eVar.f11896a.setBackgroundResource(((C6038h) SwitchControlActivity.this.f11888f.get(i)).mo27776f());
            eVar.f11899d.setOnClickListener(new C5667a(i));
            return view;
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.SwitchControlActivity$e */
    private class C5668e implements C9770e {

        /* renamed from: a */
        public ImageView f11896a;

        /* renamed from: b */
        public TextView f11897b;

        /* renamed from: c */
        public TextView f11898c;

        /* renamed from: d */
        public LinearLayout f11899d;

        /* renamed from: e */
        public int f11900e;

        /* renamed from: com.yeelight.cherry.ui.activity.SwitchControlActivity$e$a */
        class C5669a implements Runnable {
            C5669a() {
            }

            public void run() {
                if (SwitchControlActivity.this.f11885c != null && SwitchControlActivity.this.f11885c.mo23382M() != null) {
                    for (C6038h next : SwitchControlActivity.this.f11885c.mo23382M()) {
                        if (next.mo27774d() == C5668e.this.f11900e) {
                            if (next.mo27780j()) {
                                C5668e eVar = C5668e.this;
                                eVar.f11897b.setBackgroundColor(SwitchControlActivity.this.getResources().getColor(2131099806));
                            } else {
                                C5668e.this.f11897b.setBackgroundColor(-3355444);
                            }
                        }
                    }
                }
            }
        }

        private C5668e() {
        }

        /* synthetic */ C5668e(SwitchControlActivity switchControlActivity, C5663a aVar) {
            this();
        }

        public void onStatusChange(int i, C6024e eVar) {
            if (i == 4096) {
                SwitchControlActivity.this.runOnUiThread(new C5669a());
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b0 */
    public void m17101b0(boolean z) {
        this.mImageLeft.post(new C5709f3(this, z));
    }

    /* renamed from: c0 */
    private void m17102c0() {
        int[] iArr = {2131756321, 2131756323};
        mo26978p0(this.mTabLayout, 0);
        for (int i = 0; i < 2; i++) {
            int i2 = iArr[i];
            TabLayout.Tab newTab = this.mTabLayout.newTab();
            newTab.setText(i2);
            this.mTabLayout.addTab(newTab);
        }
    }

    /* renamed from: n0 */
    static /* synthetic */ void m17103n0(TabLayout tabLayout, int i) {
        try {
            LinearLayout linearLayout = (LinearLayout) tabLayout.getChildAt(0);
            int b = C10547m.m25752b(tabLayout.getContext(), (float) i);
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

    /* renamed from: q0 */
    private void m17104q0(boolean z) {
        ObjectAnimator objectAnimator;
        Animator.AnimatorListener animatorListener;
        if (z) {
            objectAnimator = ObjectAnimator.ofFloat(this.mLayoutAnimation, "translationY", new float[]{0.0f, (float) this.mMoreLayout.getHeight()}).setDuration(300);
            objectAnimator.setInterpolator(new AccelerateInterpolator());
            objectAnimator.start();
            ObjectAnimator.ofFloat(this.mImageRight, "rotation", new float[]{180.0f, 0.0f}).setDuration(20).start();
            ObjectAnimator.ofFloat(this.mLayoutShadows, "alpha", new float[]{1.0f, 0.0f}).setDuration(300).start();
            animatorListener = new C5664b();
        } else {
            this.mLayoutShadows.setVisibility(0);
            objectAnimator = ObjectAnimator.ofFloat(this.mLayoutAnimation, "translationY", new float[]{(float) this.mMoreLayout.getHeight(), 0.0f}).setDuration(300);
            objectAnimator.setInterpolator(new DecelerateInterpolator());
            objectAnimator.start();
            ObjectAnimator.ofFloat(this.mImageRight, "rotation", new float[]{0.0f, 180.0f}).setDuration(20).start();
            ObjectAnimator.ofFloat(this.mLayoutShadows, "alpha", new float[]{0.0f, 1.0f}).setDuration(300).start();
            animatorListener = new C5665c();
        }
        objectAnimator.addListener(animatorListener);
    }

    /* access modifiers changed from: private */
    /* renamed from: r0 */
    public void m17105r0() {
        this.mDelayEnable.setBackgroundColor(this.f11885c.mo27859r2() ? getResources().getColor(2131099806) : -3355444);
    }

    /* renamed from: s0 */
    private void m17106s0(ImageView imageView, int i) {
        imageView.post(new C5719h3(this, imageView, i));
    }

    /* renamed from: d0 */
    public /* synthetic */ void mo26967d0(boolean z) {
        if (z) {
            m17106s0(this.mImageLeft, 2131231233);
        } else {
            this.mImageLeft.setBackgroundResource(2131231233);
        }
    }

    /* renamed from: e0 */
    public /* synthetic */ void mo26968e0(View view) {
        onBackPressed();
    }

    /* renamed from: f0 */
    public /* synthetic */ void mo26969f0(View view) {
        Intent intent = new Intent(this, DeviceSettingActivity.class);
        intent.putExtra("com.yeelight.cherry.device_id", this.f11885c.mo23372G());
        startActivity(intent);
    }

    /* renamed from: g0 */
    public /* synthetic */ void mo26970g0() {
        this.mLayoutAnimation.setTranslationY((float) this.mMoreLayout.getHeight());
    }

    /* renamed from: h0 */
    public /* synthetic */ void mo26971h0(View view) {
        if (System.currentTimeMillis() - this.f11884b >= 300) {
            this.f11884b = System.currentTimeMillis();
            boolean z = this.f11886d;
            if (z) {
                m17104q0(z);
            }
        }
    }

    /* renamed from: i0 */
    public /* synthetic */ void mo26972i0(View view) {
        boolean z;
        if (this.f11885c.mo23332k1()) {
            this.f11885c.mo23326b1();
            z = false;
        } else {
            this.f11885c.mo23334l1();
            z = true;
        }
        m17101b0(z);
        C4315y.m12185b();
    }

    /* renamed from: j0 */
    public /* synthetic */ void mo26973j0(View view) {
        Resources resources;
        int i;
        Intent intent = new Intent();
        intent.setClass(this, DelaySetNew2Activity.class);
        intent.putExtra("com.yeelight.cherry.device_id", this.f11885c.mo23372G());
        if (this.mTabLayout.getSelectedTabPosition() == 0) {
            resources = getResources();
            i = 2131756320;
        } else {
            if (this.mTabLayout.getSelectedTabPosition() == 1) {
                resources = getResources();
                i = 2131756322;
            }
            startActivity(intent);
        }
        intent.putExtra("feature_name", resources.getString(i));
        startActivity(intent);
    }

    /* renamed from: k0 */
    public /* synthetic */ void mo26974k0(View view) {
        if (System.currentTimeMillis() - this.f11884b >= 300) {
            this.f11884b = System.currentTimeMillis();
            m17104q0(this.f11886d);
        }
    }

    /* renamed from: l0 */
    public /* synthetic */ void mo26975l0(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (this.f11887e) {
            this.f11887e = false;
            if (this.f11886d) {
                this.f11886d = false;
                m17104q0(false);
                return;
            }
            this.mLayoutAnimation.setTranslationY((float) this.mMoreLayout.getHeight());
        }
    }

    /* renamed from: m0 */
    public /* synthetic */ void mo26976m0() {
        this.f11887e = true;
        this.f11888f = this.f11885c.mo23382M();
        C5666d dVar = this.f11889g;
        if (dVar != null) {
            dVar.notifyDataSetChanged();
        }
    }

    /* renamed from: o0 */
    public /* synthetic */ void mo26977o0(ImageView imageView, int i) {
        LightingColorFilter lightingColorFilter = new LightingColorFilter(ViewCompat.MEASURED_STATE_MASK, getResources().getColor(2131099802));
        Drawable drawable = imageView.getContext().getResources().getDrawable(i);
        drawable.clearColorFilter();
        drawable.mutate().setColorFilter(lightingColorFilter);
        imageView.setBackground(drawable);
    }

    public void onBackPressed() {
        boolean z = this.f11886d;
        if (z) {
            m17104q0(z);
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
        setContentView(C11748R$layout.activity_switch_control);
        C10547m.m25758h(true, this);
        ButterKnife.bind((Activity) this);
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            C4308b.m12141t(f11883h, "Activity has not device id", false);
            finish();
            return;
        }
        C6072p pVar = (C6072p) C4257w.m11953o0(intent.getStringExtra("com.yeelight.cherry.device_id"));
        this.f11885c = pVar;
        if (pVar == null || !pVar.mo23331k0()) {
            BaseActivity.m24384U(this);
            finish();
            return;
        }
        if (this.f11885c.mo23384N() == null) {
            this.f11885c.mo23356y0();
        }
        if (this.f11885c.mo23384N() != null) {
            textView = this.mTvFirmware;
            str = String.format(getText(2131756299).toString(), new Object[]{this.f11885c.mo23384N().mo29040c()});
        } else {
            textView = this.mTvFirmware;
            str = String.format(getText(2131756299).toString(), new Object[]{"--"});
        }
        textView.setText(str);
        this.mTitleBar.mo32825a(this.f11885c.mo23397U(), new C5754o3(this), new C5744m3(this));
        this.mTitleBar.setTitleTextSize(16);
        m17102c0();
        this.f11885c.mo27860s2(0);
        this.f11888f = this.f11885c.mo23382M();
        C5666d dVar = new C5666d(this, (C5663a) null);
        this.f11889g = dVar;
        this.mFunctionGridView.setAdapter(dVar);
        this.mMoreLayout.post(new C5714g3(this));
        this.mTabLayout.addOnTabSelectedListener(new C5663a());
        this.mLayoutShadows.setOnClickListener(new C5734k3(this));
        this.mLayoutLeft.setOnClickListener(new C5739l3(this));
        this.mLayoutMiddle.setOnClickListener(new C5729j3(this));
        this.mLayoutRight.setOnClickListener(new C5749n3(this));
        this.mMoreLayout.addOnLayoutChangeListener(new C5759p3(this));
    }

    public void onLocalConnected() {
    }

    public void onLocalDisconnected() {
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.f11885c.mo23319V0(this);
        this.f11885c.mo23400W0(this);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        C6072p pVar = this.f11885c;
        if (pVar != null) {
            this.mTitleBar.setTitle(pVar.mo23397U());
            m17101b0(this.f11885c.mo23332k1());
            m17105r0();
            this.f11885c.mo23358z0(this);
            this.f11885c.mo23365B0(this);
        }
    }

    public void onStatusChange(int i, C6024e eVar) {
        if (i == 1 || i == 2) {
            m17101b0(this.f11885c.mo23332k1());
        } else if (i == 256) {
            this.mLayoutAnimation.postDelayed(new C5724i3(this), 100);
        } else if (i == 4096) {
            m17105r0();
        }
    }

    /* renamed from: p0 */
    public void mo26978p0(TabLayout tabLayout, int i) {
        tabLayout.post(new C5764q3(tabLayout, i));
    }
}
