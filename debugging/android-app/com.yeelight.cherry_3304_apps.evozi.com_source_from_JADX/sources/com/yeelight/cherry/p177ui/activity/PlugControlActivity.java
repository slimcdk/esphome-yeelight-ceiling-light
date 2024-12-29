package com.yeelight.cherry.p177ui.activity;

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
import androidx.core.view.ViewCompat;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.yeelight.cherry.C11748R$layout;
import com.yeelight.yeelib.p150c.p151i.C4198d;
import com.yeelight.yeelib.p150c.p151i.C6024e;
import com.yeelight.yeelib.p150c.p151i.C6038h;
import com.yeelight.yeelib.p150c.p183m.C6318b1;
import com.yeelight.yeelib.p150c.p184n.C7554e;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p186e.C9768c;
import com.yeelight.yeelib.p186e.C9770e;
import com.yeelight.yeelib.p194ui.activity.BaseActivity;
import com.yeelight.yeelib.p194ui.activity.DelaySetNew2Activity;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;
import com.yeelight.yeelib.utils.C10547m;
import com.yeelight.yeelib.utils.C4308b;
import com.yeelight.yeelib.utils.C4315y;
import java.util.List;

/* renamed from: com.yeelight.cherry.ui.activity.PlugControlActivity */
public class PlugControlActivity extends BaseActivity implements C9768c, C9770e {

    /* renamed from: h */
    private static final String f11568h = PlugControlActivity.class.getSimpleName();

    /* renamed from: b */
    private long f11569b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C6318b1 f11570c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f11571d = false;

    /* renamed from: e */
    private boolean f11572e = false;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public List<C6038h> f11573f;

    /* renamed from: g */
    private C5539c f11574g;
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
    @BindView(2131297424)
    CommonTitleBar mTitleBar;
    @BindView(2131297479)
    TextView mTvFirmware;

    /* renamed from: com.yeelight.cherry.ui.activity.PlugControlActivity$a */
    class C5537a implements Animator.AnimatorListener {
        C5537a() {
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            PlugControlActivity.this.mLayoutShadows.setVisibility(8);
            PlugControlActivity plugControlActivity = PlugControlActivity.this;
            boolean unused = plugControlActivity.f11571d = !plugControlActivity.f11571d;
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.PlugControlActivity$b */
    class C5538b implements Animator.AnimatorListener {
        C5538b() {
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            PlugControlActivity plugControlActivity = PlugControlActivity.this;
            boolean unused = plugControlActivity.f11571d = !plugControlActivity.f11571d;
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
            PlugControlActivity.this.mLayoutShadows.setVisibility(0);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.PlugControlActivity$c */
    private class C5539c extends BaseAdapter {

        /* renamed from: com.yeelight.cherry.ui.activity.PlugControlActivity$c$a */
        class C5540a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ int f11578a;

            C5540a(int i) {
                this.f11578a = i;
            }

            public void onClick(View view) {
                PlugControlActivity plugControlActivity = PlugControlActivity.this;
                ((C6038h) PlugControlActivity.this.f11573f.get(this.f11578a)).mo27785o(plugControlActivity, plugControlActivity.f11570c.mo23372G());
            }
        }

        private C5539c() {
        }

        /* synthetic */ C5539c(PlugControlActivity plugControlActivity, C5537a aVar) {
            this();
        }

        public int getCount() {
            return PlugControlActivity.this.f11573f == null ? 0 : 9;
        }

        public Object getItem(int i) {
            return null;
        }

        public long getItemId(int i) {
            return 0;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            C5541d dVar;
            int i2;
            TextView textView;
            if (i >= PlugControlActivity.this.f11573f.size()) {
                return LayoutInflater.from(PlugControlActivity.this).inflate(2131493102, (ViewGroup) null);
            }
            if (view == null || view.getTag() == null) {
                dVar = new C5541d(PlugControlActivity.this, (C5537a) null);
                view = LayoutInflater.from(PlugControlActivity.this).inflate(2131493103, (ViewGroup) null);
                view.setTag(dVar);
            } else {
                dVar = (C5541d) view.getTag();
            }
            dVar.f11584e = ((C6038h) PlugControlActivity.this.f11573f.get(i)).mo27774d();
            dVar.f11580a = (ImageView) view.findViewById(2131296722);
            dVar.f11581b = (TextView) view.findViewById(2131296719);
            dVar.f11582c = (TextView) view.findViewById(2131296723);
            dVar.f11583d = (LinearLayout) view.findViewById(2131296729);
            dVar.f11582c.setText(((C6038h) PlugControlActivity.this.f11573f.get(i)).mo27777g());
            if (((C6038h) PlugControlActivity.this.f11573f.get(i)).mo27782l()) {
                dVar.f11581b.setVisibility(0);
                if (((C6038h) PlugControlActivity.this.f11573f.get(i)).mo27780j()) {
                    textView = dVar.f11581b;
                    i2 = PlugControlActivity.this.getResources().getColor(2131099806);
                } else {
                    textView = dVar.f11581b;
                    i2 = -3355444;
                }
                textView.setBackgroundColor(i2);
                PlugControlActivity.this.f11570c.mo23365B0(dVar);
            } else {
                dVar.f11581b.setVisibility(4);
                PlugControlActivity.this.f11570c.mo23400W0(dVar);
            }
            dVar.f11580a.setBackgroundResource(((C6038h) PlugControlActivity.this.f11573f.get(i)).mo27776f());
            dVar.f11583d.setOnClickListener(new C5540a(i));
            return view;
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.PlugControlActivity$d */
    private class C5541d implements C9770e {

        /* renamed from: a */
        public ImageView f11580a;

        /* renamed from: b */
        public TextView f11581b;

        /* renamed from: c */
        public TextView f11582c;

        /* renamed from: d */
        public LinearLayout f11583d;

        /* renamed from: e */
        public int f11584e;

        /* renamed from: com.yeelight.cherry.ui.activity.PlugControlActivity$d$a */
        class C5542a implements Runnable {
            C5542a() {
            }

            public void run() {
                if (PlugControlActivity.this.f11570c != null && PlugControlActivity.this.f11570c.mo23382M() != null) {
                    for (C6038h next : PlugControlActivity.this.f11570c.mo23382M()) {
                        if (next.mo27774d() == C5541d.this.f11584e) {
                            if (next.mo27780j()) {
                                C5541d dVar = C5541d.this;
                                dVar.f11581b.setBackgroundColor(PlugControlActivity.this.getResources().getColor(2131099806));
                            } else {
                                C5541d.this.f11581b.setBackgroundColor(-3355444);
                            }
                        }
                    }
                }
            }
        }

        private C5541d() {
        }

        /* synthetic */ C5541d(PlugControlActivity plugControlActivity, C5537a aVar) {
            this();
        }

        public void onStatusChange(int i, C6024e eVar) {
            if (i == 4096) {
                PlugControlActivity.this.runOnUiThread(new C5542a());
            }
        }
    }

    /* renamed from: Z */
    private void m16854Z(boolean z) {
        this.mImageLeft.post(new C5693c2(this, z));
    }

    /* renamed from: m0 */
    private void m16855m0(boolean z) {
        ObjectAnimator objectAnimator;
        Animator.AnimatorListener animatorListener;
        if (z) {
            objectAnimator = ObjectAnimator.ofFloat(this.mLayoutAnimation, "translationY", new float[]{0.0f, (float) this.mMoreLayout.getHeight()}).setDuration(300);
            objectAnimator.setInterpolator(new AccelerateInterpolator());
            objectAnimator.start();
            ObjectAnimator.ofFloat(this.mImageRight, "rotation", new float[]{180.0f, 0.0f}).setDuration(20).start();
            ObjectAnimator.ofFloat(this.mLayoutShadows, "alpha", new float[]{1.0f, 0.0f}).setDuration(300).start();
            animatorListener = new C5537a();
        } else {
            this.mLayoutShadows.setVisibility(0);
            objectAnimator = ObjectAnimator.ofFloat(this.mLayoutAnimation, "translationY", new float[]{(float) this.mMoreLayout.getHeight(), 0.0f}).setDuration(300);
            objectAnimator.setInterpolator(new DecelerateInterpolator());
            objectAnimator.start();
            ObjectAnimator.ofFloat(this.mImageRight, "rotation", new float[]{0.0f, 180.0f}).setDuration(20).start();
            ObjectAnimator.ofFloat(this.mLayoutShadows, "alpha", new float[]{0.0f, 1.0f}).setDuration(300).start();
            animatorListener = new C5538b();
        }
        objectAnimator.addListener(animatorListener);
    }

    /* renamed from: n0 */
    private void m16856n0(ImageView imageView, int i) {
        imageView.post(new C5703e2(this, imageView, i));
    }

    /* renamed from: a0 */
    public boolean mo26791a0(C4198d dVar) {
        C7554e eVar;
        if (dVar == null || (eVar = (C7554e) dVar.mo23408d0().mo27710r(2)) == null) {
            return false;
        }
        return eVar.mo28882c();
    }

    /* renamed from: b0 */
    public /* synthetic */ void mo26792b0(boolean z) {
        if (z) {
            m16856n0(this.mImageLeft, 2131231233);
        } else {
            this.mImageLeft.setBackgroundResource(2131231233);
        }
    }

    /* renamed from: c0 */
    public /* synthetic */ void mo26793c0(View view) {
        onBackPressed();
    }

    /* renamed from: d0 */
    public /* synthetic */ void mo26794d0(View view) {
        Intent intent = new Intent(this, DeviceSettingActivity.class);
        intent.putExtra("com.yeelight.cherry.device_id", this.f11570c.mo23372G());
        startActivity(intent);
    }

    /* renamed from: e0 */
    public /* synthetic */ void mo26795e0() {
        this.mLayoutAnimation.setTranslationY((float) this.mMoreLayout.getHeight());
    }

    /* renamed from: f0 */
    public /* synthetic */ void mo26796f0(View view) {
        if (System.currentTimeMillis() - this.f11569b >= 300) {
            this.f11569b = System.currentTimeMillis();
            boolean z = this.f11571d;
            if (z) {
                m16855m0(z);
            }
        }
    }

    /* renamed from: g0 */
    public /* synthetic */ void mo26797g0(View view) {
        boolean z;
        if (this.f11570c.mo23332k1()) {
            this.f11570c.mo23326b1();
            z = false;
        } else {
            this.f11570c.mo23334l1();
            z = true;
        }
        m16854Z(z);
        C4315y.m12185b();
    }

    /* renamed from: h0 */
    public /* synthetic */ void mo26798h0(View view) {
        Intent intent = new Intent();
        intent.setClass(this, DelaySetNew2Activity.class);
        intent.putExtra("com.yeelight.cherry.device_id", this.f11570c.mo23372G());
        intent.putExtra("feature_name", getResources().getString(2131756050));
        startActivity(intent);
    }

    /* renamed from: i0 */
    public /* synthetic */ void mo26799i0(View view) {
        if (System.currentTimeMillis() - this.f11569b >= 300) {
            this.f11569b = System.currentTimeMillis();
            m16855m0(this.f11571d);
        }
    }

    /* renamed from: j0 */
    public /* synthetic */ void mo26800j0(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (this.f11572e) {
            this.f11572e = false;
            if (this.f11571d) {
                this.f11571d = false;
                m16855m0(false);
                return;
            }
            this.mLayoutAnimation.setTranslationY((float) this.mMoreLayout.getHeight());
        }
    }

    /* renamed from: k0 */
    public /* synthetic */ void mo26801k0() {
        this.f11572e = true;
        this.f11573f = this.f11570c.mo23382M();
        C5539c cVar = this.f11574g;
        if (cVar != null) {
            cVar.notifyDataSetChanged();
        }
    }

    /* renamed from: l0 */
    public /* synthetic */ void mo26802l0(ImageView imageView, int i) {
        LightingColorFilter lightingColorFilter = new LightingColorFilter(ViewCompat.MEASURED_STATE_MASK, getResources().getColor(2131099802));
        Drawable drawable = imageView.getContext().getResources().getDrawable(i);
        drawable.clearColorFilter();
        drawable.mutate().setColorFilter(lightingColorFilter);
        imageView.setBackground(drawable);
    }

    public void onBackPressed() {
        boolean z = this.f11571d;
        if (z) {
            m16855m0(z);
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
        setContentView(C11748R$layout.activity_plug_control);
        C10547m.m25758h(true, this);
        ButterKnife.bind((Activity) this);
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            C4308b.m12141t(f11568h, "Activity has not device id", false);
            finish();
            return;
        }
        C6318b1 b1Var = (C6318b1) C4257w.m11953o0(intent.getStringExtra("com.yeelight.cherry.device_id"));
        this.f11570c = b1Var;
        if (b1Var == null || !b1Var.mo23331k0()) {
            BaseActivity.m24384U(this);
            finish();
            return;
        }
        if (this.f11570c.mo23384N() == null) {
            this.f11570c.mo23356y0();
        }
        if (this.f11570c.mo23384N() != null) {
            textView = this.mTvFirmware;
            str = String.format(getText(2131756299).toString(), new Object[]{this.f11570c.mo23384N().mo29040c()});
        } else {
            textView = this.mTvFirmware;
            str = String.format(getText(2131756299).toString(), new Object[]{"--"});
        }
        textView.setText(str);
        this.mTitleBar.mo32825a(this.f11570c.mo23397U(), new C5713g2(this), new C5683a2(this));
        this.mTitleBar.setTitleTextSize(16);
        this.f11573f = this.f11570c.mo23382M();
        C5539c cVar = new C5539c(this, (C5537a) null);
        this.f11574g = cVar;
        this.mFunctionGridView.setAdapter(cVar);
        this.mMoreLayout.post(new C5698d2(this));
        this.mLayoutShadows.setOnClickListener(new C5688b2(this));
        this.mLayoutLeft.setOnClickListener(new C5796y1(this));
        this.mLayoutMiddle.setOnClickListener(new C5792x1(this));
        this.mLayoutRight.setOnClickListener(new C5708f2(this));
        this.mMoreLayout.addOnLayoutChangeListener(new C5788w1(this));
    }

    public void onLocalConnected() {
    }

    public void onLocalDisconnected() {
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.f11570c.mo23319V0(this);
        this.f11570c.mo23400W0(this);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        C6318b1 b1Var = this.f11570c;
        if (b1Var != null) {
            this.mTitleBar.setTitle(b1Var.mo23397U());
            m16854Z(this.f11570c.mo23332k1());
            this.mDelayEnable.setBackgroundColor(mo26791a0(this.f11570c) ? getResources().getColor(2131099806) : -3355444);
            this.f11570c.mo23358z0(this);
            this.f11570c.mo23365B0(this);
        }
    }

    public void onStatusChange(int i, C6024e eVar) {
        if (i == 1) {
            m16854Z(true);
        } else if (i == 2) {
            m16854Z(false);
        } else if (i == 256) {
            this.mLayoutAnimation.postDelayed(new C5800z1(this), 100);
        } else if (i == 4096) {
            this.mDelayEnable.setBackgroundColor(mo26791a0(this.f11570c) ? getResources().getColor(2131099806) : -3355444);
        }
    }
}
