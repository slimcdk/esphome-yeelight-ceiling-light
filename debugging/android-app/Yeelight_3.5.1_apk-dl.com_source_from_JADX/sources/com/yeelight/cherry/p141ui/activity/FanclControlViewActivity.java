package com.yeelight.cherry.p141ui.activity;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.LightingColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.BaseAdapter;
import android.widget.CheckedTextView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.constraintlayout.motion.widget.Key;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.yeelight.cherry.C12224R$drawable;
import com.yeelight.cherry.C12228R$layout;
import com.yeelight.yeelib.device.base.C3010c;
import com.yeelight.yeelib.device.base.C6093d;
import com.yeelight.yeelib.device.base.DeviceStatusBase;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.models.C3112v;
import com.yeelight.yeelib.models.C8321m;
import com.yeelight.yeelib.p142ui.activity.BaseActivity;
import com.yeelight.yeelib.p142ui.view.BrightnessSeekBarView;
import com.yeelight.yeelib.p142ui.view.FanProgressView;
import com.yeelight.yeelib.p142ui.view.FavoriteSceneViewBar;
import com.yeelight.yeelib.p142ui.view.ModeSelectionViewNew;
import com.yeelight.yeelib.utils.AppUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.lucode.hackware.magicindicator.MagicIndicator;
import p051j4.C3278f;
import p051j4.C9183a0;
import p051j4.C9193k;
import p135c5.C4008a;
import p151e5.C8999b;
import p156f5.C9035a;
import p161g5.C9080a;
import p161g5.C9082c;
import p161g5.C9083d;
import p166h5.C9094a;
import p170i4.C9113d;
import p175j5.C9212a;
import p207s3.C10337c;
import p227x3.C11969f;
import p237z3.C12143c;
import p237z3.C12145e;

/* renamed from: com.yeelight.cherry.ui.activity.FanclControlViewActivity */
public class FanclControlViewActivity extends BaseActivity implements C12143c, C12145e {
    /* access modifiers changed from: private */

    /* renamed from: m */
    public static final String f10418m = "FanclControlViewActivity";

    /* renamed from: n */
    public static final /* synthetic */ int f10419n = 0;

    /* renamed from: a */
    private Handler f10420a = new Handler(new C5851x0(this));
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C10337c f10421b;

    /* renamed from: c */
    private long f10422c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f10423d = false;

    /* renamed from: e */
    private List<C6093d> f10424e;

    /* renamed from: f */
    private List<C6093d> f10425f;

    /* renamed from: g */
    private C5288g f10426g;

    /* renamed from: h */
    private C5288g f10427h;

    /* renamed from: i */
    private ValueAnimator f10428i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C10337c.C10340c f10429j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public List<C10337c.C10340c> f10430k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public C4008a f10431l = new C4008a();
    @BindView(2131297090)
    ViewGroup llFanView2;
    @BindView(2131296444)
    BrightnessSeekBarView mBrightnessSeekBar;
    @BindView(2131296545)
    ViewGroup mClTab;
    @BindView(2131296546)
    ViewGroup mClTitle;
    @BindView(2131296600)
    CheckedTextView mCtvFan;
    @BindView(2131296601)
    CheckedTextView mCtvLight;
    @BindView(2131296622)
    TextView mDelayFanEnable;
    @BindView(2131296760)
    FanProgressView mFanProgressView;
    @BindView(2131296761)
    SeekBar mFanSeekBar;
    @BindView(2131296770)
    FavoriteSceneViewBar mFavoriteSceneViewBar;
    @BindView(2131296817)
    GridView mFunctionFanGridView;
    @BindView(2131296818)
    GridView mFunctionGridView;
    @BindView(2131296863)
    ImageView mImageFanLeft;
    @BindView(2131296864)
    ImageView mImageFanMiddle;
    @BindView(2131296865)
    ImageView mImageFanRight;
    @BindView(2131296866)
    ImageView mImageLeft;
    @BindView(2131296869)
    ImageView mImageMiddle;
    @BindView(2131296870)
    ImageView mImageRight;
    @BindView(2131296892)
    ImageView mImgFanBg;
    @BindView(2131296997)
    LinearLayout mLayoutAnimation;
    @BindView(2131297010)
    LinearLayout mLayoutFanAnimation;
    @BindView(2131297011)
    LinearLayout mLayoutFanLeft;
    @BindView(2131297012)
    ViewGroup mLayoutFanMiddle;
    @BindView(2131297013)
    LinearLayout mLayoutFanRight;
    @BindView(2131297023)
    LinearLayout mLayoutLeft;
    @BindView(2131297025)
    ViewGroup mLayoutMiddle;
    @BindView(2131297032)
    LinearLayout mLayoutRight;
    @BindView(2131297452)
    LinearLayout mLayoutShadows;
    @BindView(2131297091)
    ViewGroup mLlFavoriteScene;
    @BindView(2131297136)
    ModeSelectionViewNew mModeSelection;
    @BindView(2131296586)
    LinearLayout mMoreFanLayout;
    @BindView(2131296587)
    LinearLayout mMoreLayout;
    @BindView(2131297530)
    MagicIndicator mTabLayout;
    @BindView(2131296763)
    TextView mTextFanValue;
    @BindView(2131297691)
    TextView mTvVersion;

    /* renamed from: com.yeelight.cherry.ui.activity.FanclControlViewActivity$a */
    class C5282a implements SeekBar.OnSeekBarChangeListener {
        C5282a() {
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            if (i <= 0) {
                i = 1;
            }
            FanclControlViewActivity.this.mTextFanValue.setText(String.valueOf(i));
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
            int progress = seekBar.getProgress();
            if (progress <= 0) {
                progress = 1;
            }
            FanclControlViewActivity.this.f10421b.mo41893D2(FanclControlViewActivity.this.f10429j, progress);
            FanclControlViewActivity.this.mTextFanValue.setText(String.valueOf(progress));
            FanclControlViewActivity.this.m16249O0(progress);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.FanclControlViewActivity$b */
    class C5283b extends C9080a {
        C5283b() {
        }

        /* access modifiers changed from: private */
        /* renamed from: i */
        public /* synthetic */ void m16286i(int i, View view) {
            String unused = FanclControlViewActivity.f10418m;
            StringBuilder sb = new StringBuilder();
            sb.append("getTitleView: ");
            sb.append(i);
            FanclControlViewActivity.this.f10431l.mo26602i(i);
            FanclControlViewActivity fanclControlViewActivity = FanclControlViewActivity.this;
            C10337c.C10340c unused2 = fanclControlViewActivity.f10429j = (C10337c.C10340c) fanclControlViewActivity.f10430k.get(i);
            FanclControlViewActivity.this.f10421b.mo41891B2(FanclControlViewActivity.this.f10429j.mo41910a());
            FanclControlViewActivity.this.m16244J0();
        }

        /* renamed from: a */
        public int mo30471a() {
            return FanclControlViewActivity.this.f10430k.size();
        }

        /* renamed from: b */
        public C9082c mo30472b(Context context) {
            C9094a aVar = new C9094a(context);
            aVar.setMode(2);
            aVar.setLineWidth((float) C8999b.m21447a(context, 20.0d));
            aVar.setLineHeight((float) C8999b.m21447a(context, 1.0d));
            aVar.setColors(Integer.valueOf(ContextCompat.getColor(FanclControlViewActivity.this, 2131099805)));
            return aVar;
        }

        /* renamed from: c */
        public C9083d mo30473c(Context context, int i) {
            C9212a aVar = new C9212a(context);
            aVar.setNormalColor(ContextCompat.getColor(FanclControlViewActivity.this, 2131099838));
            aVar.setSelectedColor(ContextCompat.getColor(FanclControlViewActivity.this, 2131099805));
            aVar.setText(((C10337c.C10340c) FanclControlViewActivity.this.f10430k.get(i)).mo41912c());
            aVar.setTextSize(15.0f);
            aVar.setOnClickListener(new C5748e1(this, i));
            return aVar;
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.FanclControlViewActivity$c */
    class C5284c extends ColorDrawable {
        C5284c() {
        }

        public int getIntrinsicWidth() {
            return C8999b.m21447a(FanclControlViewActivity.this, 15.0d);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.FanclControlViewActivity$d */
    class C5285d implements C3112v.C3119g {
        C5285d() {
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public /* synthetic */ void m16291c(String str) {
            Toast.makeText(FanclControlViewActivity.this.getApplicationContext(), str, 0).show();
        }

        /* renamed from: a */
        public void mo23579a(String str) {
        }

        /* renamed from: g */
        public void mo23580g() {
        }

        public void onRefresh() {
        }

        /* renamed from: r */
        public void mo23582r(boolean z, List<C8321m> list) {
        }

        /* renamed from: s */
        public void mo23583s(String str) {
            FanclControlViewActivity.this.runOnUiThread(new C5754f1(this, str));
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.FanclControlViewActivity$e */
    class C5286e implements Animator.AnimatorListener {
        C5286e() {
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            FanclControlViewActivity.this.mLayoutShadows.setVisibility(8);
            FanclControlViewActivity fanclControlViewActivity = FanclControlViewActivity.this;
            boolean unused = fanclControlViewActivity.f10423d = !fanclControlViewActivity.f10423d;
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.FanclControlViewActivity$f */
    class C5287f implements Animator.AnimatorListener {
        C5287f() {
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            FanclControlViewActivity fanclControlViewActivity = FanclControlViewActivity.this;
            boolean unused = fanclControlViewActivity.f10423d = !fanclControlViewActivity.f10423d;
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
            FanclControlViewActivity.this.mLayoutShadows.setVisibility(0);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.FanclControlViewActivity$g */
    private class C5288g extends BaseAdapter {

        /* renamed from: a */
        private List<C6093d> f10438a;

        public C5288g(List<C6093d> list) {
            this.f10438a = list;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m16297b(int i, View view) {
            if (this.f10438a.get(i).mo31688h() != null) {
                FanclControlViewActivity fanclControlViewActivity = FanclControlViewActivity.this;
                this.f10438a.get(i).mo31695o(fanclControlViewActivity, fanclControlViewActivity.f10421b.mo23185G());
            }
        }

        public int getCount() {
            return this.f10438a == null ? 0 : 9;
        }

        public Object getItem(int i) {
            return null;
        }

        public long getItemId(int i) {
            return 0;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            C5289h hVar;
            int i2;
            TextView textView;
            if (i >= this.f10438a.size()) {
                return LayoutInflater.from(FanclControlViewActivity.this).inflate(2131493106, (ViewGroup) null);
            }
            if (view == null || view.getTag() == null) {
                hVar = new C5289h(FanclControlViewActivity.this, (C5282a) null);
                view = LayoutInflater.from(FanclControlViewActivity.this).inflate(2131493107, (ViewGroup) null);
                view.setTag(hVar);
            } else {
                hVar = (C5289h) view.getTag();
            }
            hVar.f10444e = this.f10438a.get(i).mo31684d();
            hVar.f10440a = (ImageView) view.findViewById(2131296819);
            hVar.f10441b = (TextView) view.findViewById(2131296816);
            hVar.f10442c = (TextView) view.findViewById(2131296820);
            hVar.f10443d = (LinearLayout) view.findViewById(2131296828);
            hVar.f10442c.setText(this.f10438a.get(i).mo31687g());
            if (this.f10438a.get(i).mo31692l()) {
                hVar.f10441b.setVisibility(0);
                if (this.f10438a.get(i).mo31690j()) {
                    textView = hVar.f10441b;
                    i2 = FanclControlViewActivity.this.getResources().getColor(2131099809);
                } else {
                    textView = hVar.f10441b;
                    i2 = -3355444;
                }
                textView.setBackgroundColor(i2);
                FanclControlViewActivity.this.f10421b.mo23178B0(hVar);
            } else {
                hVar.f10441b.setVisibility(4);
                FanclControlViewActivity.this.f10421b.mo23213W0(hVar);
            }
            hVar.f10440a.setBackgroundResource(this.f10438a.get(i).mo31686f());
            hVar.f10443d.setOnClickListener(new C5760g1(this, i));
            return view;
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.FanclControlViewActivity$h */
    private class C5289h implements C12145e {

        /* renamed from: a */
        public ImageView f10440a;

        /* renamed from: b */
        public TextView f10441b;

        /* renamed from: c */
        public TextView f10442c;

        /* renamed from: d */
        public LinearLayout f10443d;

        /* renamed from: e */
        public int f10444e;

        private C5289h() {
        }

        /* synthetic */ C5289h(FanclControlViewActivity fanclControlViewActivity, C5282a aVar) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m16299b() {
            int i;
            TextView textView;
            if (FanclControlViewActivity.this.f10421b != null && FanclControlViewActivity.this.f10421b.mo23195M() != null) {
                for (C6093d next : FanclControlViewActivity.this.f10421b.mo23195M()) {
                    if (next.mo31684d() == this.f10444e) {
                        if (next.mo31690j()) {
                            textView = this.f10441b;
                            i = FanclControlViewActivity.this.getResources().getColor(2131099809);
                        } else {
                            textView = this.f10441b;
                            i = -3355444;
                        }
                        textView.setBackgroundColor(i);
                    }
                }
            }
        }

        public void onStatusChange(int i, DeviceStatusBase deviceStatusBase) {
            if (i == 4096) {
                FanclControlViewActivity.this.runOnUiThread(new C5766h1(this));
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: A0 */
    public /* synthetic */ boolean m16235A0(Message message) {
        int i;
        int i2 = message.what;
        if (i2 != 0) {
            if (i2 == 1) {
                i = 2131756203;
            }
            return false;
        }
        i = 2131756206;
        Toast.makeText(this, getText(i).toString(), 0).show();
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: B0 */
    public /* synthetic */ void m16236B0() {
        this.mLayoutAnimation.setTranslationY((float) this.mMoreLayout.getHeight());
    }

    /* access modifiers changed from: private */
    /* renamed from: C0 */
    public /* synthetic */ void m16237C0() {
        this.mLayoutFanAnimation.setTranslationY((float) this.mMoreFanLayout.getHeight());
    }

    /* access modifiers changed from: private */
    /* renamed from: D0 */
    public /* synthetic */ void m16238D0(int i) {
        this.f10421b.mo41894E2(i);
        m16249O0(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: E0 */
    public /* synthetic */ void m16239E0(int i) {
        if (i == 1 || i == 2) {
            m16281w0();
        } else if (i == 4096) {
            this.f10431l.mo26602i(m16276r0());
            m16252R0();
            this.f10429j = this.f10421b.mo41901s2();
            m16281w0();
            m16244J0();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: F0 */
    public static /* synthetic */ void m16240F0(C9113d dVar, DialogInterface dialogInterface, int i) {
        dVar.mo37154d();
        dialogInterface.dismiss();
    }

    /* access modifiers changed from: private */
    /* renamed from: G0 */
    public /* synthetic */ void m16241G0(C9113d dVar, C8321m mVar, DialogInterface dialogInterface, int i) {
        if (!TextUtils.isEmpty(dVar.mo37153c().getText().toString())) {
            if (mVar != null) {
                mVar.mo35431P(dVar.mo37153c().getText().toString().trim());
                m16246L0(mVar);
            } else {
                Toast.makeText(this, getText(2131756228).toString(), 0).show();
            }
            dVar.mo37154d();
            dialogInterface.dismiss();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: H0 */
    public /* synthetic */ void m16242H0(ValueAnimator valueAnimator) {
        if (this.f10429j.mo41914e()) {
            this.mImgFanBg.setRotation(360.0f - (((Float) valueAnimator.getAnimatedValue()).floatValue() * 360.0f));
        } else {
            this.mImgFanBg.setRotation(((Float) valueAnimator.getAnimatedValue()).floatValue() * 360.0f);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: I0 */
    public /* synthetic */ void m16243I0(ImageView imageView, int i) {
        LightingColorFilter lightingColorFilter = new LightingColorFilter(ViewCompat.MEASURED_STATE_MASK, getResources().getColor(2131099805));
        Drawable drawable = imageView.getContext().getResources().getDrawable(i);
        drawable.clearColorFilter();
        drawable.mutate().setColorFilter(lightingColorFilter);
        imageView.setBackground(drawable);
    }

    /* access modifiers changed from: private */
    /* renamed from: J0 */
    public void m16244J0() {
        m16277s0();
        m16249O0(this.f10429j.mo41911b());
    }

    /* renamed from: K0 */
    private void m16245K0(C3010c cVar, String str) {
        if (YeelightDeviceManager.m7794j0(cVar.mo23185G()) == null) {
            String str2 = f10418m;
            C3278f.m8797b(new AppUtils.SuicideException(str2, "Device is null! Fix me! device id: " + cVar.mo23185G() + ", debugDid: " + str + ", device model: " + cVar.mo23208T()));
            return;
        }
        this.mModeSelection.setDeviceId(cVar.mo23185G());
        this.mBrightnessSeekBar.setDeviceId(cVar.mo23185G());
        this.mFavoriteSceneViewBar.setDeviceId(cVar.mo23185G());
    }

    /* renamed from: L0 */
    private void m16246L0(C8321m mVar) {
        C3112v.m8242u().mo23552A(mVar, new C5285d());
    }

    /* renamed from: M0 */
    private void m16247M0(boolean z) {
        ObjectAnimator objectAnimator;
        Animator.AnimatorListener animatorListener;
        LinearLayout linearLayout = this.mCtvLight.isChecked() ? this.mMoreLayout : this.mMoreFanLayout;
        ImageView imageView = this.mCtvLight.isChecked() ? this.mImageRight : this.mImageFanRight;
        LinearLayout linearLayout2 = this.mCtvLight.isChecked() ? this.mLayoutAnimation : this.mLayoutFanAnimation;
        if (z) {
            objectAnimator = ObjectAnimator.ofFloat(linearLayout2, "translationY", new float[]{0.0f, (float) linearLayout.getHeight()}).setDuration(300);
            objectAnimator.setInterpolator(new AccelerateInterpolator());
            objectAnimator.start();
            ObjectAnimator.ofFloat(imageView, Key.ROTATION, new float[]{180.0f, 0.0f}).setDuration(20).start();
            ObjectAnimator.ofFloat(this.mLayoutShadows, "alpha", new float[]{1.0f, 0.0f}).setDuration(300).start();
            animatorListener = new C5286e();
        } else {
            this.mLayoutShadows.setVisibility(0);
            objectAnimator = ObjectAnimator.ofFloat(linearLayout2, "translationY", new float[]{(float) linearLayout.getHeight(), 0.0f}).setDuration(300);
            objectAnimator.setInterpolator(new DecelerateInterpolator());
            objectAnimator.start();
            ObjectAnimator.ofFloat(imageView, Key.ROTATION, new float[]{0.0f, 180.0f}).setDuration(20).start();
            ObjectAnimator.ofFloat(this.mLayoutShadows, "alpha", new float[]{0.0f, 1.0f}).setDuration(300).start();
            animatorListener = new C5287f();
        }
        objectAnimator.addListener(animatorListener);
    }

    /* renamed from: N0 */
    private void m16248N0() {
        C9113d b = new C9113d.C9118e(this).mo37179i(getText(2131756233).toString()).mo37177g(getText(2131756205).toString()).mo37181k(true).mo37172b();
        b.mo37156g(-2, getText(2131755232).toString(), new C5846w0(b));
        b.mo37156g(-1, getText(2131755281).toString(), new C5841v0(this, b, this.f10421b.mo23220c0()));
        b.setCancelable(true);
        b.mo37153c().addTextChangedListener(new C9183a0(20, b.mo37153c()));
        b.show();
        b.mo37164o();
    }

    /* access modifiers changed from: private */
    /* renamed from: O0 */
    public void m16249O0(int i) {
        if (this.f10428i == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f10428i = valueAnimator;
            valueAnimator.setInterpolator(new LinearInterpolator());
            this.f10428i.setRepeatCount(-1);
            this.f10428i.setRepeatMode(1);
            this.f10428i.addUpdateListener(new C5836u0(this));
        }
        this.f10428i.cancel();
        this.f10428i.setDuration(m16275q0(i));
        this.f10428i.setFloatValues(new float[]{0.0f, 1.0f});
        if (this.f10421b.mo41906y2()) {
            this.f10428i.start();
        }
    }

    /* renamed from: P0 */
    private void m16250P0() {
        ValueAnimator valueAnimator = this.f10428i;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    /* renamed from: Q0 */
    private void m16251Q0() {
        this.mModeSelection.mo36365v();
        this.mBrightnessSeekBar.mo36110i();
    }

    /* renamed from: R0 */
    private void m16252R0() {
        this.mDelayFanEnable.setBackgroundColor(this.f10421b.mo41905x2() ? getResources().getColor(2131099809) : -3355444);
    }

    /* renamed from: S0 */
    private void m16253S0(ImageView imageView, int i) {
        imageView.post(new C5736c1(this, imageView, i));
    }

    /* renamed from: p0 */
    private long m16274p0(int i) {
        return (long) (800 - (i * 5));
    }

    /* renamed from: q0 */
    private long m16275q0(int i) {
        if (this.f10429j.mo41913d() == 100) {
            return m16274p0(i);
        }
        return m16274p0((int) ((((float) i) / ((float) this.f10429j.mo41913d())) * 100.0f));
    }

    /* renamed from: r0 */
    private int m16276r0() {
        Iterator<C10337c.C10340c> it = this.f10430k.iterator();
        int i = 0;
        while (it.hasNext() && it.next().mo41910a() != this.f10421b.mo41904v2().mo41916Z0()) {
            i++;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("getCurrentTab: ");
        sb.append(i);
        return i;
    }

    /* renamed from: s0 */
    private void m16277s0() {
        C10337c.C10340c cVar = this.f10429j;
        if (cVar != null) {
            this.mFanProgressView.setTotalProgress(cVar.mo41913d());
            int b = this.f10429j.mo41911b();
            StringBuilder sb = new StringBuilder();
            sb.append("initFanView modeValue: ");
            sb.append(b);
            if (this.f10429j.mo41913d() == 100) {
                this.mFanSeekBar.setVisibility(0);
                this.mFanProgressView.setVisibility(4);
                this.mFanSeekBar.setProgress(b);
                this.mTextFanValue.setVisibility(0);
                this.mTextFanValue.setText(String.valueOf(this.f10429j.mo41911b()));
                return;
            }
            this.mFanSeekBar.setVisibility(4);
            this.mTextFanValue.setVisibility(4);
            this.mFanProgressView.setVisibility(0);
            this.mFanProgressView.setProgress(b);
        }
    }

    /* renamed from: t0 */
    private void m16278t0() {
        int i;
        ImageView imageView;
        C10337c cVar = this.f10421b;
        if (cVar != null) {
            String T = cVar.mo23208T();
            T.hashCode();
            char c = 65535;
            switch (T.hashCode()) {
                case -1235140472:
                    if (T.equals("yeelink.light.fancl1")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1235140471:
                    if (T.equals("yeelink.light.fancl2")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1235140468:
                    if (T.equals("yeelink.light.fancl5")) {
                        c = 2;
                        break;
                    }
                    break;
                case -1235140467:
                    if (T.equals("yeelink.light.fancl6")) {
                        c = 3;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                case 2:
                case 3:
                    imageView = this.mImgFanBg;
                    i = C12224R$drawable.icon_yeelight_fancl1_bg;
                    break;
                case 1:
                    imageView = this.mImgFanBg;
                    i = C12224R$drawable.icon_yeelight_fancl2_bg;
                    break;
                default:
                    return;
            }
            imageView.setBackgroundResource(i);
        }
    }

    /* renamed from: u0 */
    private void m16279u0(boolean z) {
        if (z) {
            this.f10421b.mo41890A2(0);
            this.mCtvLight.setChecked(true);
            this.mCtvFan.setChecked(false);
            this.mClTitle.setBackgroundResource(C12224R$drawable.icon_yeelight_fancl_light);
            this.mModeSelection.setVisibility(0);
            this.mImgFanBg.setVisibility(4);
            this.mLlFavoriteScene.setVisibility(0);
            this.mLayoutAnimation.setVisibility(0);
            this.mLayoutFanAnimation.setVisibility(4);
            this.mBrightnessSeekBar.setVisibility(0);
            this.llFanView2.setVisibility(4);
        } else {
            this.f10421b.mo41890A2(1);
            this.mCtvLight.setChecked(false);
            this.mCtvFan.setChecked(true);
            this.mClTitle.setBackgroundResource(C12224R$drawable.icon_yeelight_fancl_fan);
            this.mModeSelection.setVisibility(4);
            this.mImgFanBg.setVisibility(0);
            this.mLlFavoriteScene.setVisibility(8);
            this.mLayoutAnimation.setVisibility(4);
            this.mLayoutFanAnimation.setVisibility(0);
            this.mBrightnessSeekBar.setVisibility(4);
            this.llFanView2.setVisibility(0);
            if (this.f10430k.size() != 1) {
                this.mClTab.setVisibility(0);
                m16281w0();
            }
        }
        this.mClTab.setVisibility(8);
        m16281w0();
    }

    /* renamed from: v0 */
    private void m16280v0() {
        C10337c cVar = this.f10421b;
        if (cVar != null) {
            C11969f N = cVar.mo23197N();
            if (N != null) {
                this.mTvVersion.setText(String.format(getText(2131756328).toString(), new Object[]{N.mo42511c()}));
                return;
            }
            this.mTvVersion.setText(String.format(getText(2131756328).toString(), new Object[]{"--"}));
        }
    }

    /* renamed from: w0 */
    private void m16281w0() {
        boolean z;
        boolean z2;
        if (this.mCtvLight.isChecked()) {
            z2 = true;
            z = this.f10421b.mo23146k1();
        } else {
            z2 = false;
            z = this.f10421b.mo41906y2();
        }
        m16282x0(z2, z);
    }

    /* renamed from: x0 */
    private void m16282x0(boolean z, boolean z2) {
        ImageView imageView = z ? this.mImageLeft : this.mImageFanLeft;
        imageView.post(new C5742d1(this, z2, imageView));
        if (z) {
            return;
        }
        if (z2) {
            m16249O0(this.f10429j.mo41911b());
        } else {
            m16250P0();
        }
    }

    /* renamed from: y0 */
    private void m16283y0() {
        C9035a aVar = new C9035a(this);
        aVar.setAdjustMode(true);
        aVar.setAdapter(new C5283b());
        this.mTabLayout.setNavigator(aVar);
        LinearLayout titleContainer = aVar.getTitleContainer();
        titleContainer.setShowDividers(2);
        titleContainer.setDividerDrawable(new C5284c());
        this.f10431l.mo26601d(this.mTabLayout);
        this.f10431l.mo26602i(m16276r0());
    }

    /* access modifiers changed from: private */
    /* renamed from: z0 */
    public /* synthetic */ void m16284z0(boolean z, ImageView imageView) {
        if (z) {
            m16253S0(imageView, 2131231247);
        } else {
            imageView.setBackgroundResource(2131231247);
        }
    }

    public void onBackPressed() {
        boolean z = this.f10423d;
        if (z) {
            m16247M0(z);
        } else {
            super.onBackPressed();
        }
    }

    public void onConnectionStateChanged(int i, int i2) {
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C12228R$layout.activity_fancl_control_view);
        C9193k.m22157h(true, this);
        ButterKnife.bind((Activity) this);
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            AppUtils.m8302w(f10418m, "Activity has not device id", false);
            finish();
            return;
        }
        String stringExtra = intent.getStringExtra("com.yeelight.cherry.device_id");
        C10337c cVar = (C10337c) YeelightDeviceManager.m7804r0(stringExtra);
        this.f10421b = cVar;
        if (cVar == null || !cVar.mo23145k0()) {
            BaseActivity.m19947U(this);
            finish();
            return;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            this.mFanSeekBar.setSplitTrack(false);
        }
        ArrayList arrayList = new ArrayList(this.f10421b.mo41903u2().values());
        this.f10430k = arrayList;
        this.f10429j = (C10337c.C10340c) arrayList.get(m16276r0());
        m16245K0(this.f10421b, stringExtra);
        this.mModeSelection.setBrightnessSeekbarView(this.mBrightnessSeekBar);
        this.f10424e = this.f10421b.mo23195M();
        this.f10425f = this.f10421b.mo41902t2();
        C5288g gVar = new C5288g(this.f10424e);
        this.f10426g = gVar;
        this.mFunctionGridView.setAdapter(gVar);
        C5288g gVar2 = new C5288g(this.f10425f);
        this.f10427h = gVar2;
        this.mFunctionFanGridView.setAdapter(gVar2);
        this.mMoreLayout.post(new C5724a1(this));
        this.mMoreFanLayout.post(new C5861z0(this));
        m16283y0();
        m16279u0(true);
        m16277s0();
        m16278t0();
        this.mFanProgressView.setOnProgressChangeListener(new C5856y0(this));
        this.mFanSeekBar.setOnSeekBarChangeListener(new C5282a());
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        m16251Q0();
    }

    public void onLocalConnected() {
    }

    public void onLocalDisconnected() {
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.f10421b.mo23133V0(this);
        this.f10421b.mo23213W0(this);
        m16250P0();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        C10337c cVar = this.f10421b;
        if (cVar != null) {
            m16282x0(true, cVar.mo23146k1());
            m16282x0(false, this.f10421b.mo41906y2());
            m16252R0();
            m16280v0();
            this.f10421b.mo23171z0(this);
            this.f10421b.mo23178B0(this);
        }
    }

    public void onStatusChange(int i, DeviceStatusBase deviceStatusBase) {
        runOnUiThread(new C5730b1(this, i));
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006f, code lost:
        m16247M0(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00b1, code lost:
        p051j4.C3284x.m8852b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00e4, code lost:
        startActivity(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        return;
     */
    @butterknife.OnClick({2131296601, 2131296600, 2131297452, 2131296587, 2131297023, 2131297025, 2131297032, 2131297011, 2131297012, 2131297013, 2131296495, 2131296496})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onViewClick(android.view.View r7) {
        /*
            r6 = this;
            int r7 = r7.getId()
            r0 = 300(0x12c, double:1.48E-321)
            java.lang.String r2 = "com.yeelight.cherry.device_id"
            r3 = 1
            r4 = 0
            switch(r7) {
                case 2131296495: goto L_0x00e8;
                case 2131296496: goto L_0x00d4;
                case 2131296587: goto L_0x00bd;
                case 2131296600: goto L_0x00b9;
                case 2131296601: goto L_0x00b5;
                case 2131297011: goto L_0x0098;
                case 2131297012: goto L_0x0074;
                case 2131297013: goto L_0x005b;
                case 2131297023: goto L_0x0041;
                case 2131297025: goto L_0x0026;
                case 2131297032: goto L_0x005b;
                case 2131297452: goto L_0x000f;
                default: goto L_0x000d;
            }
        L_0x000d:
            goto L_0x00eb
        L_0x000f:
            long r2 = java.lang.System.currentTimeMillis()
            long r4 = r6.f10422c
            long r2 = r2 - r4
            int r7 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r7 >= 0) goto L_0x001b
            return
        L_0x001b:
            long r0 = java.lang.System.currentTimeMillis()
            r6.f10422c = r0
            boolean r7 = r6.f10423d
            if (r7 == 0) goto L_0x00eb
            goto L_0x006f
        L_0x0026:
            s3.c r7 = r6.f10421b
            boolean r7 = r7.mo23146k1()
            if (r7 == 0) goto L_0x0033
            r6.m16248N0()
            goto L_0x00eb
        L_0x0033:
            android.os.Handler r7 = r6.f10420a
            r7.removeMessages(r4)
            android.os.Handler r7 = r6.f10420a
            r0 = 500(0x1f4, double:2.47E-321)
            r7.sendEmptyMessageDelayed(r4, r0)
            goto L_0x00eb
        L_0x0041:
            s3.c r7 = r6.f10421b
            boolean r7 = r7.mo23146k1()
            if (r7 == 0) goto L_0x0052
            s3.c r7 = r6.f10421b
            r7.mo23140b1()
            r6.m16282x0(r3, r4)
            goto L_0x00b1
        L_0x0052:
            s3.c r7 = r6.f10421b
            r7.mo23148l1()
            r6.m16282x0(r3, r3)
            goto L_0x00b1
        L_0x005b:
            long r2 = java.lang.System.currentTimeMillis()
            long r4 = r6.f10422c
            long r2 = r2 - r4
            int r7 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r7 >= 0) goto L_0x0067
            return
        L_0x0067:
            long r0 = java.lang.System.currentTimeMillis()
            r6.f10422c = r0
            boolean r7 = r6.f10423d
        L_0x006f:
            r6.m16247M0(r7)
            goto L_0x00eb
        L_0x0074:
            android.content.Intent r7 = new android.content.Intent
            r7.<init>()
            java.lang.Class<com.yeelight.yeelib.ui.activity.DelaySetNewActivity> r0 = com.yeelight.yeelib.p142ui.activity.DelaySetNewActivity.class
            r7.setClass(r6, r0)
            s3.c r0 = r6.f10421b
            java.lang.String r0 = r0.mo23185G()
            r7.putExtra(r2, r0)
            android.content.res.Resources r0 = r6.getResources()
            r1 = 2131755565(0x7f10022d, float:1.9142013E38)
            java.lang.String r0 = r0.getString(r1)
            java.lang.String r1 = "feature_name"
            r7.putExtra(r1, r0)
            goto L_0x00e4
        L_0x0098:
            s3.c r7 = r6.f10421b
            boolean r7 = r7.mo41906y2()
            if (r7 == 0) goto L_0x00a9
            s3.c r7 = r6.f10421b
            r7.mo41898p2()
            r6.m16282x0(r4, r4)
            goto L_0x00b1
        L_0x00a9:
            s3.c r7 = r6.f10421b
            r7.mo41907z2()
            r6.m16282x0(r4, r3)
        L_0x00b1:
            p051j4.C3284x.m8852b()
            goto L_0x00eb
        L_0x00b5:
            r6.m16279u0(r3)
            goto L_0x00eb
        L_0x00b9:
            r6.m16279u0(r4)
            goto L_0x00eb
        L_0x00bd:
            boolean r7 = r6.f10423d
            if (r7 == 0) goto L_0x00c7
            r6.f10423d = r4
            r6.m16247M0(r4)
            goto L_0x00eb
        L_0x00c7:
            android.widget.LinearLayout r7 = r6.mLayoutAnimation
            android.widget.LinearLayout r0 = r6.mMoreLayout
            int r0 = r0.getHeight()
            float r0 = (float) r0
            r7.setTranslationY(r0)
            goto L_0x00eb
        L_0x00d4:
            android.content.Intent r7 = new android.content.Intent
            java.lang.Class<com.yeelight.cherry.ui.activity.DeviceSettingActivity> r0 = com.yeelight.cherry.p141ui.activity.DeviceSettingActivity.class
            r7.<init>(r6, r0)
            s3.c r0 = r6.f10421b
            java.lang.String r0 = r0.mo23185G()
            r7.putExtra(r2, r0)
        L_0x00e4:
            r6.startActivity(r7)
            goto L_0x00eb
        L_0x00e8:
            r6.onBackPressed()
        L_0x00eb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.cherry.p141ui.activity.FanclControlViewActivity.onViewClick(android.view.View):void");
    }
}
