package com.yeelight.cherry.p141ui.activity;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Intent;
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
import com.yeelight.cherry.C12228R$layout;
import com.yeelight.yeelib.device.base.C3010c;
import com.yeelight.yeelib.device.base.C6093d;
import com.yeelight.yeelib.device.base.DeviceStatusBase;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.p142ui.activity.BaseActivity;
import com.yeelight.yeelib.p142ui.activity.DelaySetNew2Activity;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;
import com.yeelight.yeelib.utils.AppUtils;
import java.util.List;
import p051j4.C3284x;
import p051j4.C9193k;
import p223w3.C10797d1;
import p232y3.C12041e;
import p237z3.C12143c;
import p237z3.C12145e;

/* renamed from: com.yeelight.cherry.ui.activity.PlugControlActivity */
public class PlugControlActivity extends BaseActivity implements C12143c, C12145e {

    /* renamed from: g */
    private static final String f11132g = "PlugControlActivity";

    /* renamed from: h */
    public static final /* synthetic */ int f11133h = 0;

    /* renamed from: a */
    private long f11134a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C10797d1 f11135b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public boolean f11136c = false;

    /* renamed from: d */
    private boolean f11137d = false;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public List<C6093d> f11138e;

    /* renamed from: f */
    private C5582c f11139f;
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
    @BindView(2131297591)
    CommonTitleBar mTitleBar;
    @BindView(2131297654)
    TextView mTvFirmware;

    /* renamed from: com.yeelight.cherry.ui.activity.PlugControlActivity$a */
    class C5580a implements Animator.AnimatorListener {
        C5580a() {
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            PlugControlActivity.this.mLayoutShadows.setVisibility(8);
            PlugControlActivity plugControlActivity = PlugControlActivity.this;
            boolean unused = plugControlActivity.f11136c = !plugControlActivity.f11136c;
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.PlugControlActivity$b */
    class C5581b implements Animator.AnimatorListener {
        C5581b() {
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            PlugControlActivity plugControlActivity = PlugControlActivity.this;
            boolean unused = plugControlActivity.f11136c = !plugControlActivity.f11136c;
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
            PlugControlActivity.this.mLayoutShadows.setVisibility(0);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.PlugControlActivity$c */
    private class C5582c extends BaseAdapter {

        /* renamed from: com.yeelight.cherry.ui.activity.PlugControlActivity$c$a */
        class C5583a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ int f11143a;

            C5583a(int i) {
                this.f11143a = i;
            }

            public void onClick(View view) {
                PlugControlActivity plugControlActivity = PlugControlActivity.this;
                ((C6093d) PlugControlActivity.this.f11138e.get(this.f11143a)).mo31695o(plugControlActivity, plugControlActivity.f11135b.mo23185G());
            }
        }

        private C5582c() {
        }

        /* synthetic */ C5582c(PlugControlActivity plugControlActivity, C5580a aVar) {
            this();
        }

        public int getCount() {
            return PlugControlActivity.this.f11138e == null ? 0 : 9;
        }

        public Object getItem(int i) {
            return null;
        }

        public long getItemId(int i) {
            return 0;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            C5584d dVar;
            int i2;
            TextView textView;
            if (i >= PlugControlActivity.this.f11138e.size()) {
                return LayoutInflater.from(PlugControlActivity.this).inflate(2131493106, (ViewGroup) null);
            }
            if (view == null || view.getTag() == null) {
                dVar = new C5584d(PlugControlActivity.this, (C5580a) null);
                view = LayoutInflater.from(PlugControlActivity.this).inflate(2131493107, (ViewGroup) null);
                view.setTag(dVar);
            } else {
                dVar = (C5584d) view.getTag();
            }
            dVar.f11149e = ((C6093d) PlugControlActivity.this.f11138e.get(i)).mo31684d();
            dVar.f11145a = (ImageView) view.findViewById(2131296819);
            dVar.f11146b = (TextView) view.findViewById(2131296816);
            dVar.f11147c = (TextView) view.findViewById(2131296820);
            dVar.f11148d = (LinearLayout) view.findViewById(2131296828);
            dVar.f11147c.setText(((C6093d) PlugControlActivity.this.f11138e.get(i)).mo31687g());
            if (((C6093d) PlugControlActivity.this.f11138e.get(i)).mo31692l()) {
                dVar.f11146b.setVisibility(0);
                if (((C6093d) PlugControlActivity.this.f11138e.get(i)).mo31690j()) {
                    textView = dVar.f11146b;
                    i2 = PlugControlActivity.this.getResources().getColor(2131099809);
                } else {
                    textView = dVar.f11146b;
                    i2 = -3355444;
                }
                textView.setBackgroundColor(i2);
                PlugControlActivity.this.f11135b.mo23178B0(dVar);
            } else {
                dVar.f11146b.setVisibility(4);
                PlugControlActivity.this.f11135b.mo23213W0(dVar);
            }
            dVar.f11145a.setBackgroundResource(((C6093d) PlugControlActivity.this.f11138e.get(i)).mo31686f());
            dVar.f11148d.setOnClickListener(new C5583a(i));
            return view;
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.PlugControlActivity$d */
    private class C5584d implements C12145e {

        /* renamed from: a */
        public ImageView f11145a;

        /* renamed from: b */
        public TextView f11146b;

        /* renamed from: c */
        public TextView f11147c;

        /* renamed from: d */
        public LinearLayout f11148d;

        /* renamed from: e */
        public int f11149e;

        /* renamed from: com.yeelight.cherry.ui.activity.PlugControlActivity$d$a */
        class C5585a implements Runnable {
            C5585a() {
            }

            public void run() {
                if (PlugControlActivity.this.f11135b != null && PlugControlActivity.this.f11135b.mo23195M() != null) {
                    for (C6093d next : PlugControlActivity.this.f11135b.mo23195M()) {
                        if (next.mo31684d() == C5584d.this.f11149e) {
                            if (next.mo31690j()) {
                                C5584d dVar = C5584d.this;
                                dVar.f11146b.setBackgroundColor(PlugControlActivity.this.getResources().getColor(2131099809));
                            } else {
                                C5584d.this.f11146b.setBackgroundColor(-3355444);
                            }
                        }
                    }
                }
            }
        }

        private C5584d() {
        }

        /* synthetic */ C5584d(PlugControlActivity plugControlActivity, C5580a aVar) {
            this();
        }

        public void onStatusChange(int i, DeviceStatusBase deviceStatusBase) {
            if (i == 4096) {
                PlugControlActivity.this.runOnUiThread(new C5585a());
            }
        }
    }

    /* renamed from: k0 */
    private void m16844k0(boolean z) {
        this.mImageLeft.post(new C5808o2(this, z));
    }

    /* access modifiers changed from: private */
    /* renamed from: m0 */
    public /* synthetic */ void m16845m0(boolean z) {
        if (z) {
            m16857y0(this.mImageLeft, 2131231247);
        } else {
            this.mImageLeft.setBackgroundResource(2131231247);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: n0 */
    public /* synthetic */ void m16846n0(View view) {
        onBackPressed();
    }

    /* access modifiers changed from: private */
    /* renamed from: o0 */
    public /* synthetic */ void m16847o0(View view) {
        Intent intent = new Intent(this, DeviceSettingActivity.class);
        intent.putExtra("com.yeelight.cherry.device_id", this.f11135b.mo23185G());
        startActivity(intent);
    }

    /* access modifiers changed from: private */
    /* renamed from: p0 */
    public /* synthetic */ void m16848p0() {
        this.mLayoutAnimation.setTranslationY((float) this.mMoreLayout.getHeight());
    }

    /* access modifiers changed from: private */
    /* renamed from: q0 */
    public /* synthetic */ void m16849q0(View view) {
        if (System.currentTimeMillis() - this.f11134a >= 300) {
            this.f11134a = System.currentTimeMillis();
            boolean z = this.f11136c;
            if (z) {
                m16856x0(z);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: r0 */
    public /* synthetic */ void m16850r0(View view) {
        boolean z;
        if (this.f11135b.mo23146k1()) {
            this.f11135b.mo23140b1();
            z = false;
        } else {
            this.f11135b.mo23148l1();
            z = true;
        }
        m16844k0(z);
        C3284x.m8852b();
    }

    /* access modifiers changed from: private */
    /* renamed from: s0 */
    public /* synthetic */ void m16851s0(View view) {
        Intent intent = new Intent();
        intent.setClass(this, DelaySetNew2Activity.class);
        intent.putExtra("com.yeelight.cherry.device_id", this.f11135b.mo23185G());
        intent.putExtra("feature_name", getResources().getString(2131756062));
        startActivity(intent);
    }

    /* access modifiers changed from: private */
    /* renamed from: t0 */
    public /* synthetic */ void m16852t0(View view) {
        if (System.currentTimeMillis() - this.f11134a >= 300) {
            this.f11134a = System.currentTimeMillis();
            m16856x0(this.f11136c);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: u0 */
    public /* synthetic */ void m16853u0(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (this.f11137d) {
            this.f11137d = false;
            if (this.f11136c) {
                this.f11136c = false;
                m16856x0(false);
                return;
            }
            this.mLayoutAnimation.setTranslationY((float) this.mMoreLayout.getHeight());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: v0 */
    public /* synthetic */ void m16854v0() {
        this.f11137d = true;
        this.f11138e = this.f11135b.mo23195M();
        C5582c cVar = this.f11139f;
        if (cVar != null) {
            cVar.notifyDataSetChanged();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: w0 */
    public /* synthetic */ void m16855w0(ImageView imageView, int i) {
        LightingColorFilter lightingColorFilter = new LightingColorFilter(ViewCompat.MEASURED_STATE_MASK, getResources().getColor(2131099805));
        Drawable drawable = imageView.getContext().getResources().getDrawable(i);
        drawable.clearColorFilter();
        drawable.mutate().setColorFilter(lightingColorFilter);
        imageView.setBackground(drawable);
    }

    /* renamed from: x0 */
    private void m16856x0(boolean z) {
        ObjectAnimator objectAnimator;
        Animator.AnimatorListener animatorListener;
        if (z) {
            objectAnimator = ObjectAnimator.ofFloat(this.mLayoutAnimation, "translationY", new float[]{0.0f, (float) this.mMoreLayout.getHeight()}).setDuration(300);
            objectAnimator.setInterpolator(new AccelerateInterpolator());
            objectAnimator.start();
            ObjectAnimator.ofFloat(this.mImageRight, Key.ROTATION, new float[]{180.0f, 0.0f}).setDuration(20).start();
            ObjectAnimator.ofFloat(this.mLayoutShadows, "alpha", new float[]{1.0f, 0.0f}).setDuration(300).start();
            animatorListener = new C5580a();
        } else {
            this.mLayoutShadows.setVisibility(0);
            objectAnimator = ObjectAnimator.ofFloat(this.mLayoutAnimation, "translationY", new float[]{(float) this.mMoreLayout.getHeight(), 0.0f}).setDuration(300);
            objectAnimator.setInterpolator(new DecelerateInterpolator());
            objectAnimator.start();
            ObjectAnimator.ofFloat(this.mImageRight, Key.ROTATION, new float[]{0.0f, 180.0f}).setDuration(20).start();
            ObjectAnimator.ofFloat(this.mLayoutShadows, "alpha", new float[]{0.0f, 1.0f}).setDuration(300).start();
            animatorListener = new C5581b();
        }
        objectAnimator.addListener(animatorListener);
    }

    /* renamed from: y0 */
    private void m16857y0(ImageView imageView, int i) {
        imageView.post(new C5853x2(this, imageView, i));
    }

    /* renamed from: l0 */
    public boolean mo30787l0(C3010c cVar) {
        C12041e eVar;
        if (cVar == null || (eVar = (C12041e) cVar.mo23221d0().mo31611r(2)) == null) {
            return false;
        }
        return eVar.mo42679c();
    }

    public void onBackPressed() {
        boolean z = this.f11136c;
        if (z) {
            m16856x0(z);
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
        setContentView(C12228R$layout.activity_plug_control);
        C9193k.m22157h(true, this);
        ButterKnife.bind((Activity) this);
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            AppUtils.m8302w(f11132g, "Activity has not device id", false);
            finish();
            return;
        }
        C10797d1 d1Var = (C10797d1) YeelightDeviceManager.m7804r0(intent.getStringExtra("com.yeelight.cherry.device_id"));
        this.f11135b = d1Var;
        if (d1Var == null || !d1Var.mo23145k0()) {
            BaseActivity.m19947U(this);
            finish();
            return;
        }
        if (this.f11135b.mo23197N() == null) {
            this.f11135b.mo23169y0();
        }
        if (this.f11135b.mo23197N() != null) {
            textView = this.mTvFirmware;
            str = String.format(getText(2131756328).toString(), new Object[]{this.f11135b.mo23197N().mo42511c()});
        } else {
            textView = this.mTvFirmware;
            str = String.format(getText(2131756328).toString(), new Object[]{"--"});
        }
        textView.setText(str);
        this.mTitleBar.mo36195a(this.f11135b.mo23210U(), new C5828s2(this), new C5803n2(this));
        this.mTitleBar.setTitleTextSize(16);
        this.f11138e = this.f11135b.mo23195M();
        C5582c cVar = new C5582c(this, (C5580a) null);
        this.f11139f = cVar;
        this.mFunctionGridView.setAdapter(cVar);
        this.mMoreLayout.post(new C5848w2(this));
        this.mLayoutShadows.setOnClickListener(new C5833t2(this));
        this.mLayoutLeft.setOnClickListener(new C5818q2(this));
        this.mLayoutMiddle.setOnClickListener(new C5823r2(this));
        this.mLayoutRight.setOnClickListener(new C5813p2(this));
        this.mMoreLayout.addOnLayoutChangeListener(new C5838u2(this));
    }

    public void onLocalConnected() {
    }

    public void onLocalDisconnected() {
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.f11135b.mo23133V0(this);
        this.f11135b.mo23213W0(this);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        C10797d1 d1Var = this.f11135b;
        if (d1Var != null) {
            this.mTitleBar.setTitle(d1Var.mo23210U());
            m16844k0(this.f11135b.mo23146k1());
            this.mDelayEnable.setBackgroundColor(mo30787l0(this.f11135b) ? getResources().getColor(2131099809) : -3355444);
            this.f11135b.mo23171z0(this);
            this.f11135b.mo23178B0(this);
        }
    }

    public void onStatusChange(int i, DeviceStatusBase deviceStatusBase) {
        if (i == 1) {
            m16844k0(true);
        } else if (i == 2) {
            m16844k0(false);
        } else if (i == 256) {
            this.mLayoutAnimation.postDelayed(new C5843v2(this), 100);
        } else if (i == 4096) {
            this.mDelayEnable.setBackgroundColor(mo30787l0(this.f11135b) ? getResources().getColor(2131099809) : -3355444);
        }
    }
}
