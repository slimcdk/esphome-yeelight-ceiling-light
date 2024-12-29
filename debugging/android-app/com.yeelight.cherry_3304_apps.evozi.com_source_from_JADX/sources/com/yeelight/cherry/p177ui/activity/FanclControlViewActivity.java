package com.yeelight.cherry.p177ui.activity;

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
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.yeelight.cherry.C11744R$drawable;
import com.yeelight.cherry.C11748R$layout;
import com.yeelight.yeelib.device.models.C7622g;
import com.yeelight.yeelib.p150c.p151i.C4198d;
import com.yeelight.yeelib.p150c.p151i.C6024e;
import com.yeelight.yeelib.p150c.p151i.C6033g;
import com.yeelight.yeelib.p150c.p151i.C6038h;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p153g.C4300b0;
import com.yeelight.yeelib.p153g.C9849r;
import com.yeelight.yeelib.p186e.C9768c;
import com.yeelight.yeelib.p186e.C9770e;
import com.yeelight.yeelib.p194ui.activity.BaseActivity;
import com.yeelight.yeelib.p194ui.view.BrightnessSeekBarView;
import com.yeelight.yeelib.p194ui.view.FanProgressView;
import com.yeelight.yeelib.p194ui.view.FavoriteSceneViewBar;
import com.yeelight.yeelib.p194ui.view.ModeSelectionViewNew;
import com.yeelight.yeelib.p194ui.widget.C10526e;
import com.yeelight.yeelib.utils.C10536b0;
import com.yeelight.yeelib.utils.C10547m;
import com.yeelight.yeelib.utils.C4308b;
import com.yeelight.yeelib.utils.C4310h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.lucode.hackware.magicindicator.C11714a;
import net.lucode.hackware.magicindicator.MagicIndicator;
import net.lucode.hackware.magicindicator.p265d.C11721b;
import net.lucode.hackware.magicindicator.p265d.p266c.C11722a;
import net.lucode.hackware.magicindicator.p265d.p266c.p267b.C11724a;
import net.lucode.hackware.magicindicator.p265d.p266c.p267b.C11726c;
import net.lucode.hackware.magicindicator.p265d.p266c.p267b.C11727d;
import net.lucode.hackware.magicindicator.p265d.p266c.p268c.C11728a;
import net.lucode.hackware.magicindicator.p265d.p266c.p270e.C11730a;

/* renamed from: com.yeelight.cherry.ui.activity.FanclControlViewActivity */
public class FanclControlViewActivity extends BaseActivity implements C9768c, C9770e {
    /* access modifiers changed from: private */

    /* renamed from: n */
    public static final String f10854n = FanclControlViewActivity.class.getSimpleName();

    /* renamed from: b */
    private Handler f10855b = new Handler(new C5766r0(this));
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C6033g f10856c;

    /* renamed from: d */
    private long f10857d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public boolean f10858e = false;

    /* renamed from: f */
    private List<C6038h> f10859f;

    /* renamed from: g */
    private List<C6038h> f10860g;

    /* renamed from: h */
    private C5239g f10861h;

    /* renamed from: i */
    private C5239g f10862i;

    /* renamed from: j */
    private ValueAnimator f10863j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public C6033g.C6036c f10864k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public List<C6033g.C6036c> f10865l;
    @BindView(2131296973)
    ViewGroup llFanView2;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public C11714a f10866m = new C11714a();
    @BindView(2131296386)
    BrightnessSeekBarView mBrightnessSeekBar;
    @BindView(2131296477)
    ViewGroup mClTab;
    @BindView(2131296478)
    ViewGroup mClTitle;
    @BindView(2131296527)
    CheckedTextView mCtvFan;
    @BindView(2131296528)
    CheckedTextView mCtvLight;
    @BindView(2131296546)
    TextView mDelayFanEnable;
    @BindView(2131296666)
    FanProgressView mFanProgressView;
    @BindView(2131296667)
    SeekBar mFanSeekBar;
    @BindView(2131296676)
    FavoriteSceneViewBar mFavoriteSceneViewBar;
    @BindView(2131296720)
    GridView mFunctionFanGridView;
    @BindView(2131296721)
    GridView mFunctionGridView;
    @BindView(2131296759)
    ImageView mImageFanLeft;
    @BindView(2131296760)
    ImageView mImageFanMiddle;
    @BindView(2131296761)
    ImageView mImageFanRight;
    @BindView(2131296762)
    ImageView mImageLeft;
    @BindView(2131296765)
    ImageView mImageMiddle;
    @BindView(2131296766)
    ImageView mImageRight;
    @BindView(2131296788)
    ImageView mImgFanBg;
    @BindView(2131296886)
    LinearLayout mLayoutAnimation;
    @BindView(2131296899)
    LinearLayout mLayoutFanAnimation;
    @BindView(2131296900)
    LinearLayout mLayoutFanLeft;
    @BindView(2131296901)
    ViewGroup mLayoutFanMiddle;
    @BindView(2131296902)
    LinearLayout mLayoutFanRight;
    @BindView(2131296912)
    LinearLayout mLayoutLeft;
    @BindView(2131296914)
    ViewGroup mLayoutMiddle;
    @BindView(2131296921)
    LinearLayout mLayoutRight;
    @BindView(2131297309)
    LinearLayout mLayoutShadows;
    @BindView(2131296974)
    ViewGroup mLlFavoriteScene;
    @BindView(2131297017)
    ModeSelectionViewNew mModeSelection;
    @BindView(2131296514)
    LinearLayout mMoreFanLayout;
    @BindView(2131296515)
    LinearLayout mMoreLayout;
    @BindView(2131297374)
    MagicIndicator mTabLayout;
    @BindView(2131296669)
    TextView mTextFanValue;
    @BindView(2131297512)
    TextView mTvVersion;

    /* renamed from: com.yeelight.cherry.ui.activity.FanclControlViewActivity$a */
    class C5233a implements SeekBar.OnSeekBarChangeListener {
        C5233a() {
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
            FanclControlViewActivity.this.f10856c.mo27745D2(FanclControlViewActivity.this.f10864k, progress);
            FanclControlViewActivity.this.mTextFanValue.setText(String.valueOf(progress));
            FanclControlViewActivity.this.m16317E0(progress);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.FanclControlViewActivity$b */
    class C5234b extends C11724a {
        C5234b() {
        }

        /* renamed from: a */
        public int mo26444a() {
            return FanclControlViewActivity.this.f10865l.size();
        }

        /* renamed from: b */
        public C11726c mo26445b(Context context) {
            C11728a aVar = new C11728a(context);
            aVar.setMode(2);
            aVar.setLineWidth((float) C11721b.m30419a(context, 20.0d));
            aVar.setLineHeight((float) C11721b.m30419a(context, 1.0d));
            aVar.setColors(Integer.valueOf(ContextCompat.getColor(FanclControlViewActivity.this, 2131099802)));
            return aVar;
        }

        /* renamed from: c */
        public C11727d mo26446c(Context context, int i) {
            C11730a aVar = new C11730a(context);
            aVar.setNormalColor(ContextCompat.getColor(FanclControlViewActivity.this, 2131099835));
            aVar.setSelectedColor(ContextCompat.getColor(FanclControlViewActivity.this, 2131099802));
            aVar.setText(((C6033g.C6036c) FanclControlViewActivity.this.f10865l.get(i)).mo27764c());
            aVar.setTextSize(15.0f);
            aVar.setOnClickListener(new C5716h0(this, i));
            return aVar;
        }

        /* renamed from: h */
        public /* synthetic */ void mo26447h(int i, View view) {
            String unused = FanclControlViewActivity.f10854n;
            "getTitleView: " + i;
            FanclControlViewActivity.this.f10866m.mo36805i(i);
            FanclControlViewActivity fanclControlViewActivity = FanclControlViewActivity.this;
            C6033g.C6036c unused2 = fanclControlViewActivity.f10864k = (C6033g.C6036c) fanclControlViewActivity.f10865l.get(i);
            FanclControlViewActivity.this.f10856c.mo27743B2(FanclControlViewActivity.this.f10864k.mo27762a());
            FanclControlViewActivity.this.m16343z0();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.FanclControlViewActivity$c */
    class C5235c extends ColorDrawable {
        C5235c() {
        }

        public int getIntrinsicWidth() {
            return C11721b.m30419a(FanclControlViewActivity.this, 15.0d);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.FanclControlViewActivity$d */
    class C5236d implements C4300b0.C4307g {
        C5236d() {
        }

        /* renamed from: a */
        public void mo23766a(String str) {
        }

        /* renamed from: b */
        public /* synthetic */ void mo26449b(String str) {
            Toast.makeText(FanclControlViewActivity.this.getApplicationContext(), str, 0).show();
        }

        /* renamed from: f */
        public void mo23767f() {
        }

        /* renamed from: n */
        public void mo23768n(boolean z, List<C9849r> list) {
        }

        public void onRefresh() {
        }

        /* renamed from: p */
        public void mo23770p(String str) {
            FanclControlViewActivity.this.runOnUiThread(new C5726j0(this, str));
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.FanclControlViewActivity$e */
    class C5237e implements Animator.AnimatorListener {
        C5237e() {
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            FanclControlViewActivity.this.mLayoutShadows.setVisibility(8);
            FanclControlViewActivity fanclControlViewActivity = FanclControlViewActivity.this;
            boolean unused = fanclControlViewActivity.f10858e = !fanclControlViewActivity.f10858e;
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.FanclControlViewActivity$f */
    class C5238f implements Animator.AnimatorListener {
        C5238f() {
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            FanclControlViewActivity fanclControlViewActivity = FanclControlViewActivity.this;
            boolean unused = fanclControlViewActivity.f10858e = !fanclControlViewActivity.f10858e;
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
            FanclControlViewActivity.this.mLayoutShadows.setVisibility(0);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.FanclControlViewActivity$g */
    private class C5239g extends BaseAdapter {

        /* renamed from: a */
        private List<C6038h> f10873a;

        public C5239g(List<C6038h> list) {
            this.f10873a = list;
        }

        /* renamed from: a */
        public /* synthetic */ void mo26458a(int i, View view) {
            if (this.f10873a.get(i).mo27778h() != null) {
                FanclControlViewActivity fanclControlViewActivity = FanclControlViewActivity.this;
                this.f10873a.get(i).mo27785o(fanclControlViewActivity, fanclControlViewActivity.f10856c.mo23372G());
            }
        }

        public int getCount() {
            return this.f10873a == null ? 0 : 9;
        }

        public Object getItem(int i) {
            return null;
        }

        public long getItemId(int i) {
            return 0;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            C5240h hVar;
            int i2;
            TextView textView;
            if (i >= this.f10873a.size()) {
                return LayoutInflater.from(FanclControlViewActivity.this).inflate(2131493102, (ViewGroup) null);
            }
            if (view == null || view.getTag() == null) {
                hVar = new C5240h(FanclControlViewActivity.this, (C5233a) null);
                view = LayoutInflater.from(FanclControlViewActivity.this).inflate(2131493103, (ViewGroup) null);
                view.setTag(hVar);
            } else {
                hVar = (C5240h) view.getTag();
            }
            hVar.f10879e = this.f10873a.get(i).mo27774d();
            hVar.f10875a = (ImageView) view.findViewById(2131296722);
            hVar.f10876b = (TextView) view.findViewById(2131296719);
            hVar.f10877c = (TextView) view.findViewById(2131296723);
            hVar.f10878d = (LinearLayout) view.findViewById(2131296729);
            hVar.f10877c.setText(this.f10873a.get(i).mo27777g());
            if (this.f10873a.get(i).mo27782l()) {
                hVar.f10876b.setVisibility(0);
                if (this.f10873a.get(i).mo27780j()) {
                    textView = hVar.f10876b;
                    i2 = FanclControlViewActivity.this.getResources().getColor(2131099806);
                } else {
                    textView = hVar.f10876b;
                    i2 = -3355444;
                }
                textView.setBackgroundColor(i2);
                FanclControlViewActivity.this.f10856c.mo23365B0(hVar);
            } else {
                hVar.f10876b.setVisibility(4);
                FanclControlViewActivity.this.f10856c.mo23400W0(hVar);
            }
            hVar.f10875a.setBackgroundResource(this.f10873a.get(i).mo27776f());
            hVar.f10878d.setOnClickListener(new C5731k0(this, i));
            return view;
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.FanclControlViewActivity$h */
    private class C5240h implements C9770e {

        /* renamed from: a */
        public ImageView f10875a;

        /* renamed from: b */
        public TextView f10876b;

        /* renamed from: c */
        public TextView f10877c;

        /* renamed from: d */
        public LinearLayout f10878d;

        /* renamed from: e */
        public int f10879e;

        private C5240h() {
        }

        /* synthetic */ C5240h(FanclControlViewActivity fanclControlViewActivity, C5233a aVar) {
            this();
        }

        /* renamed from: a */
        public /* synthetic */ void mo26463a() {
            int i;
            TextView textView;
            if (FanclControlViewActivity.this.f10856c != null && FanclControlViewActivity.this.f10856c.mo23382M() != null) {
                for (C6038h next : FanclControlViewActivity.this.f10856c.mo23382M()) {
                    if (next.mo27774d() == this.f10879e) {
                        if (next.mo27780j()) {
                            textView = this.f10876b;
                            i = FanclControlViewActivity.this.getResources().getColor(2131099806);
                        } else {
                            textView = this.f10876b;
                            i = -3355444;
                        }
                        textView.setBackgroundColor(i);
                    }
                }
            }
        }

        public void onStatusChange(int i, C6024e eVar) {
            if (i == 4096) {
                FanclControlViewActivity.this.runOnUiThread(new C5746n0(this));
            }
        }
    }

    /* renamed from: A0 */
    private void m16313A0(C4198d dVar, String str) {
        if (C4257w.m11945h0(dVar.mo23372G()) == null) {
            String str2 = f10854n;
            C4310h.m12146b(new C4308b.C4309a(str2, "Device is null! Fix me! device id: " + dVar.mo23372G() + ", debugDid: " + str + ", device model: " + dVar.mo23395T()));
            return;
        }
        this.mModeSelection.setDeviceId(dVar.mo23372G());
        this.mBrightnessSeekBar.setDeviceId(dVar.mo23372G());
        this.mFavoriteSceneViewBar.setDeviceId(dVar.mo23372G());
    }

    /* renamed from: B0 */
    private void m16314B0(C9849r rVar) {
        C4300b0.m12083u().mo23738A(rVar, new C5236d());
    }

    /* renamed from: C0 */
    private void m16315C0(boolean z) {
        ObjectAnimator objectAnimator;
        Animator.AnimatorListener animatorListener;
        LinearLayout linearLayout = this.mCtvLight.isChecked() ? this.mMoreLayout : this.mMoreFanLayout;
        ImageView imageView = this.mCtvLight.isChecked() ? this.mImageRight : this.mImageFanRight;
        LinearLayout linearLayout2 = this.mCtvLight.isChecked() ? this.mLayoutAnimation : this.mLayoutFanAnimation;
        if (z) {
            objectAnimator = ObjectAnimator.ofFloat(linearLayout2, "translationY", new float[]{0.0f, (float) linearLayout.getHeight()}).setDuration(300);
            objectAnimator.setInterpolator(new AccelerateInterpolator());
            objectAnimator.start();
            ObjectAnimator.ofFloat(imageView, "rotation", new float[]{180.0f, 0.0f}).setDuration(20).start();
            ObjectAnimator.ofFloat(this.mLayoutShadows, "alpha", new float[]{1.0f, 0.0f}).setDuration(300).start();
            animatorListener = new C5237e();
        } else {
            this.mLayoutShadows.setVisibility(0);
            objectAnimator = ObjectAnimator.ofFloat(linearLayout2, "translationY", new float[]{(float) linearLayout.getHeight(), 0.0f}).setDuration(300);
            objectAnimator.setInterpolator(new DecelerateInterpolator());
            objectAnimator.start();
            ObjectAnimator.ofFloat(imageView, "rotation", new float[]{0.0f, 180.0f}).setDuration(20).start();
            ObjectAnimator.ofFloat(this.mLayoutShadows, "alpha", new float[]{0.0f, 1.0f}).setDuration(300).start();
            animatorListener = new C5238f();
        }
        objectAnimator.addListener(animatorListener);
    }

    /* renamed from: D0 */
    private void m16316D0() {
        C10526e.C10531e eVar = new C10526e.C10531e(this);
        eVar.mo33358i(getText(2131756208).toString());
        eVar.mo33356g(getText(2131756180).toString());
        eVar.mo33360k(true);
        C10526e b = eVar.mo33351b();
        b.mo33335g(-2, getText(2131755229).toString(), new C5721i0(b));
        b.mo33335g(-1, getText(2131755277).toString(), new C5736l0(this, b, this.f10856c.mo23407c0()));
        b.setCancelable(true);
        b.mo33332c().addTextChangedListener(new C10536b0(20, b.mo33332c()));
        b.show();
        b.mo33343o();
    }

    /* access modifiers changed from: private */
    /* renamed from: E0 */
    public void m16317E0(int i) {
        if (this.f10863j == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f10863j = valueAnimator;
            valueAnimator.setInterpolator(new LinearInterpolator());
            this.f10863j.setRepeatCount(-1);
            this.f10863j.setRepeatMode(1);
            this.f10863j.addUpdateListener(new C5756p0(this));
        }
        this.f10863j.cancel();
        this.f10863j.setDuration(m16333g0(i));
        this.f10863j.setFloatValues(new float[]{0.0f, 1.0f});
        if (this.f10856c.mo27758y2()) {
            this.f10863j.start();
        }
    }

    /* renamed from: F0 */
    private void m16318F0() {
        ValueAnimator valueAnimator = this.f10863j;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    /* renamed from: G0 */
    private void m16319G0() {
        this.mModeSelection.mo32995v();
        this.mBrightnessSeekBar.mo32740i();
    }

    /* renamed from: H0 */
    private void m16320H0() {
        this.mDelayFanEnable.setBackgroundColor(this.f10856c.mo27757x2() ? getResources().getColor(2131099806) : -3355444);
    }

    /* renamed from: I0 */
    private void m16321I0(ImageView imageView, int i) {
        imageView.post(new C5771s0(this, imageView, i));
    }

    /* renamed from: f0 */
    private long m16332f0(int i) {
        return (long) (800 - (i * 5));
    }

    /* renamed from: g0 */
    private long m16333g0(int i) {
        if (this.f10864k.mo27765d() == 100) {
            return m16332f0(i);
        }
        return m16332f0((int) ((((float) i) / ((float) this.f10864k.mo27765d())) * 100.0f));
    }

    /* renamed from: h0 */
    private int m16334h0() {
        Iterator<C6033g.C6036c> it = this.f10865l.iterator();
        int i = 0;
        while (it.hasNext() && it.next().mo27762a() != this.f10856c.mo27756v2().mo27768X0()) {
            i++;
        }
        "getCurrentTab: " + i;
        return i;
    }

    /* renamed from: i0 */
    private void m16335i0() {
        C6033g.C6036c cVar = this.f10864k;
        if (cVar != null) {
            this.mFanProgressView.setTotalProgress(cVar.mo27765d());
            int b = this.f10864k.mo27763b();
            "initFanView modeValue: " + b;
            if (this.f10864k.mo27765d() == 100) {
                this.mFanSeekBar.setVisibility(0);
                this.mFanProgressView.setVisibility(4);
                this.mFanSeekBar.setProgress(b);
                this.mTextFanValue.setVisibility(0);
                this.mTextFanValue.setText(String.valueOf(this.f10864k.mo27763b()));
                return;
            }
            this.mFanSeekBar.setVisibility(4);
            this.mTextFanValue.setVisibility(4);
            this.mFanProgressView.setVisibility(0);
            this.mFanProgressView.setProgress(b);
        }
    }

    /* renamed from: j0 */
    private void m16336j0() {
        int i;
        ImageView imageView;
        C6033g gVar = this.f10856c;
        if (gVar != null) {
            String T = gVar.mo23395T();
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
                        c = 3;
                        break;
                    }
                    break;
                case -1235140468:
                    if (T.equals("yeelink.light.fancl5")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1235140467:
                    if (T.equals("yeelink.light.fancl6")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            if (c == 0 || c == 1 || c == 2) {
                imageView = this.mImgFanBg;
                i = C11744R$drawable.icon_yeelight_fancl1_bg;
            } else if (c == 3) {
                imageView = this.mImgFanBg;
                i = C11744R$drawable.icon_yeelight_fancl2_bg;
            } else {
                return;
            }
            imageView.setBackgroundResource(i);
        }
    }

    /* renamed from: k0 */
    private void m16337k0(boolean z) {
        if (z) {
            this.f10856c.mo27742A2(0);
            this.mCtvLight.setChecked(true);
            this.mCtvFan.setChecked(false);
            this.mClTitle.setBackgroundResource(C11744R$drawable.icon_yeelight_fancl_light);
            this.mModeSelection.setVisibility(0);
            this.mImgFanBg.setVisibility(4);
            this.mLlFavoriteScene.setVisibility(0);
            this.mLayoutAnimation.setVisibility(0);
            this.mLayoutFanAnimation.setVisibility(4);
            this.mBrightnessSeekBar.setVisibility(0);
            this.llFanView2.setVisibility(4);
        } else {
            this.f10856c.mo27742A2(1);
            this.mCtvLight.setChecked(false);
            this.mCtvFan.setChecked(true);
            this.mClTitle.setBackgroundResource(C11744R$drawable.icon_yeelight_fancl_fan);
            this.mModeSelection.setVisibility(4);
            this.mImgFanBg.setVisibility(0);
            this.mLlFavoriteScene.setVisibility(8);
            this.mLayoutAnimation.setVisibility(4);
            this.mLayoutFanAnimation.setVisibility(0);
            this.mBrightnessSeekBar.setVisibility(4);
            this.llFanView2.setVisibility(0);
            if (this.f10865l.size() != 1) {
                this.mClTab.setVisibility(0);
                m16339m0();
            }
        }
        this.mClTab.setVisibility(8);
        m16339m0();
    }

    /* renamed from: l0 */
    private void m16338l0() {
        C6033g gVar = this.f10856c;
        if (gVar != null) {
            C7622g N = gVar.mo23384N();
            if (N != null) {
                this.mTvVersion.setText(String.format(getText(2131756299).toString(), new Object[]{N.mo29040c()}));
                return;
            }
            this.mTvVersion.setText(String.format(getText(2131756299).toString(), new Object[]{"--"}));
        }
    }

    /* renamed from: m0 */
    private void m16339m0() {
        boolean z;
        boolean z2;
        if (this.mCtvLight.isChecked()) {
            z2 = true;
            z = this.f10856c.mo23332k1();
        } else {
            z2 = false;
            z = this.f10856c.mo27758y2();
        }
        m16340n0(z2, z);
    }

    /* renamed from: n0 */
    private void m16340n0(boolean z, boolean z2) {
        ImageView imageView = z ? this.mImageLeft : this.mImageFanLeft;
        imageView.post(new C5761q0(this, z2, imageView));
        if (z) {
            return;
        }
        if (z2) {
            m16317E0(this.f10864k.mo27763b());
        } else {
            m16318F0();
        }
    }

    /* renamed from: o0 */
    private void m16341o0() {
        C11722a aVar = new C11722a(this);
        aVar.setAdjustMode(true);
        aVar.setAdapter(new C5234b());
        this.mTabLayout.setNavigator(aVar);
        LinearLayout titleContainer = aVar.getTitleContainer();
        titleContainer.setShowDividers(2);
        titleContainer.setDividerDrawable(new C5235c());
        this.f10866m.mo36804d(this.mTabLayout);
        this.f10866m.mo36805i(m16334h0());
    }

    /* renamed from: v0 */
    static /* synthetic */ void m16342v0(C10526e eVar, DialogInterface dialogInterface, int i) {
        eVar.mo33333d();
        dialogInterface.dismiss();
    }

    /* access modifiers changed from: private */
    /* renamed from: z0 */
    public void m16343z0() {
        m16335i0();
        m16317E0(this.f10864k.mo27763b());
    }

    public void onBackPressed() {
        boolean z = this.f10858e;
        if (z) {
            m16315C0(z);
        } else {
            super.onBackPressed();
        }
    }

    public void onConnectionStateChanged(int i, int i2) {
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C11748R$layout.activity_fancl_control_view);
        C10547m.m25758h(true, this);
        ButterKnife.bind((Activity) this);
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            C4308b.m12141t(f10854n, "Activity has not device id", false);
            finish();
            return;
        }
        String stringExtra = intent.getStringExtra("com.yeelight.cherry.device_id");
        C6033g gVar = (C6033g) C4257w.m11953o0(stringExtra);
        this.f10856c = gVar;
        if (gVar == null || !gVar.mo23331k0()) {
            BaseActivity.m24384U(this);
            finish();
            return;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            this.mFanSeekBar.setSplitTrack(false);
        }
        ArrayList arrayList = new ArrayList(this.f10856c.mo27755u2().values());
        this.f10865l = arrayList;
        this.f10864k = (C6033g.C6036c) arrayList.get(m16334h0());
        m16313A0(this.f10856c, stringExtra);
        this.mModeSelection.setBrightnessSeekbarView(this.mBrightnessSeekBar);
        this.f10859f = this.f10856c.mo23382M();
        this.f10860g = this.f10856c.mo27754t2();
        C5239g gVar2 = new C5239g(this.f10859f);
        this.f10861h = gVar2;
        this.mFunctionGridView.setAdapter(gVar2);
        C5239g gVar3 = new C5239g(this.f10860g);
        this.f10862i = gVar3;
        this.mFunctionFanGridView.setAdapter(gVar3);
        this.mMoreLayout.post(new C5741m0(this));
        this.mMoreFanLayout.post(new C5779u0(this));
        m16341o0();
        m16337k0(true);
        m16335i0();
        m16336j0();
        this.mFanProgressView.setOnProgressChangeListener(new C5751o0(this));
        this.mFanSeekBar.setOnSeekBarChangeListener(new C5233a());
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        m16319G0();
    }

    public void onLocalConnected() {
    }

    public void onLocalDisconnected() {
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.f10856c.mo23319V0(this);
        this.f10856c.mo23400W0(this);
        m16318F0();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        C6033g gVar = this.f10856c;
        if (gVar != null) {
            m16340n0(true, gVar.mo23332k1());
            m16340n0(false, this.f10856c.mo27758y2());
            m16320H0();
            m16338l0();
            this.f10856c.mo23358z0(this);
            this.f10856c.mo23365B0(this);
        }
    }

    public void onStatusChange(int i, C6024e eVar) {
        runOnUiThread(new C5775t0(this, i));
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006f, code lost:
        m16315C0(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00b1, code lost:
        com.yeelight.yeelib.utils.C4315y.m12185b();
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
    @butterknife.OnClick({2131296528, 2131296527, 2131297309, 2131296515, 2131296912, 2131296914, 2131296921, 2131296900, 2131296901, 2131296902, 2131296437, 2131296438})
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
                case 2131296437: goto L_0x00e8;
                case 2131296438: goto L_0x00d4;
                case 2131296515: goto L_0x00bd;
                case 2131296527: goto L_0x00b9;
                case 2131296528: goto L_0x00b5;
                case 2131296900: goto L_0x0098;
                case 2131296901: goto L_0x0074;
                case 2131296902: goto L_0x005b;
                case 2131296912: goto L_0x0041;
                case 2131296914: goto L_0x0026;
                case 2131296921: goto L_0x005b;
                case 2131297309: goto L_0x000f;
                default: goto L_0x000d;
            }
        L_0x000d:
            goto L_0x00eb
        L_0x000f:
            long r2 = java.lang.System.currentTimeMillis()
            long r4 = r6.f10857d
            long r2 = r2 - r4
            int r7 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r7 >= 0) goto L_0x001b
            return
        L_0x001b:
            long r0 = java.lang.System.currentTimeMillis()
            r6.f10857d = r0
            boolean r7 = r6.f10858e
            if (r7 == 0) goto L_0x00eb
            goto L_0x006f
        L_0x0026:
            com.yeelight.yeelib.c.i.g r7 = r6.f10856c
            boolean r7 = r7.mo23332k1()
            if (r7 == 0) goto L_0x0033
            r6.m16316D0()
            goto L_0x00eb
        L_0x0033:
            android.os.Handler r7 = r6.f10855b
            r7.removeMessages(r4)
            android.os.Handler r7 = r6.f10855b
            r0 = 500(0x1f4, double:2.47E-321)
            r7.sendEmptyMessageDelayed(r4, r0)
            goto L_0x00eb
        L_0x0041:
            com.yeelight.yeelib.c.i.g r7 = r6.f10856c
            boolean r7 = r7.mo23332k1()
            if (r7 == 0) goto L_0x0052
            com.yeelight.yeelib.c.i.g r7 = r6.f10856c
            r7.mo23326b1()
            r6.m16340n0(r3, r4)
            goto L_0x00b1
        L_0x0052:
            com.yeelight.yeelib.c.i.g r7 = r6.f10856c
            r7.mo23334l1()
            r6.m16340n0(r3, r3)
            goto L_0x00b1
        L_0x005b:
            long r2 = java.lang.System.currentTimeMillis()
            long r4 = r6.f10857d
            long r2 = r2 - r4
            int r7 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r7 >= 0) goto L_0x0067
            return
        L_0x0067:
            long r0 = java.lang.System.currentTimeMillis()
            r6.f10857d = r0
            boolean r7 = r6.f10858e
        L_0x006f:
            r6.m16315C0(r7)
            goto L_0x00eb
        L_0x0074:
            android.content.Intent r7 = new android.content.Intent
            r7.<init>()
            java.lang.Class<com.yeelight.yeelib.ui.activity.DelaySetNewActivity> r0 = com.yeelight.yeelib.p194ui.activity.DelaySetNewActivity.class
            r7.setClass(r6, r0)
            com.yeelight.yeelib.c.i.g r0 = r6.f10856c
            java.lang.String r0 = r0.mo23372G()
            r7.putExtra(r2, r0)
            android.content.res.Resources r0 = r6.getResources()
            r1 = 2131755561(0x7f100229, float:1.9142005E38)
            java.lang.String r0 = r0.getString(r1)
            java.lang.String r1 = "feature_name"
            r7.putExtra(r1, r0)
            goto L_0x00e4
        L_0x0098:
            com.yeelight.yeelib.c.i.g r7 = r6.f10856c
            boolean r7 = r7.mo27758y2()
            if (r7 == 0) goto L_0x00a9
            com.yeelight.yeelib.c.i.g r7 = r6.f10856c
            r7.mo27750p2()
            r6.m16340n0(r4, r4)
            goto L_0x00b1
        L_0x00a9:
            com.yeelight.yeelib.c.i.g r7 = r6.f10856c
            r7.mo27759z2()
            r6.m16340n0(r4, r3)
        L_0x00b1:
            com.yeelight.yeelib.utils.C4315y.m12185b()
            goto L_0x00eb
        L_0x00b5:
            r6.m16337k0(r3)
            goto L_0x00eb
        L_0x00b9:
            r6.m16337k0(r4)
            goto L_0x00eb
        L_0x00bd:
            boolean r7 = r6.f10858e
            if (r7 == 0) goto L_0x00c7
            r6.f10858e = r4
            r6.m16315C0(r4)
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
            java.lang.Class<com.yeelight.cherry.ui.activity.DeviceSettingActivity> r0 = com.yeelight.cherry.p177ui.activity.DeviceSettingActivity.class
            r7.<init>(r6, r0)
            com.yeelight.yeelib.c.i.g r0 = r6.f10856c
            java.lang.String r0 = r0.mo23372G()
            r7.putExtra(r2, r0)
        L_0x00e4:
            r6.startActivity(r7)
            goto L_0x00eb
        L_0x00e8:
            r6.onBackPressed()
        L_0x00eb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.cherry.p177ui.activity.FanclControlViewActivity.onViewClick(android.view.View):void");
    }

    /* renamed from: p0 */
    public /* synthetic */ void mo26432p0(boolean z, ImageView imageView) {
        if (z) {
            m16321I0(imageView, 2131231233);
        } else {
            imageView.setBackgroundResource(2131231233);
        }
    }

    /* renamed from: q0 */
    public /* synthetic */ boolean mo26433q0(Message message) {
        int i;
        int i2 = message.what;
        if (i2 != 0) {
            if (i2 == 1) {
                i = 2131756178;
            }
            return false;
        }
        i = 2131756181;
        Toast.makeText(this, getText(i).toString(), 0).show();
        return false;
    }

    /* renamed from: r0 */
    public /* synthetic */ void mo26434r0() {
        this.mLayoutAnimation.setTranslationY((float) this.mMoreLayout.getHeight());
    }

    /* renamed from: s0 */
    public /* synthetic */ void mo26435s0() {
        this.mLayoutFanAnimation.setTranslationY((float) this.mMoreFanLayout.getHeight());
    }

    /* renamed from: t0 */
    public /* synthetic */ void mo26436t0(int i) {
        this.f10856c.mo27746E2(i);
        m16317E0(i);
    }

    /* renamed from: u0 */
    public /* synthetic */ void mo26437u0(int i) {
        if (i == 1 || i == 2) {
            m16339m0();
        } else if (i == 4096) {
            this.f10866m.mo36805i(m16334h0());
            m16320H0();
            this.f10864k = this.f10856c.mo27753s2();
            m16339m0();
            m16343z0();
        }
    }

    /* renamed from: w0 */
    public /* synthetic */ void mo26438w0(C10526e eVar, C9849r rVar, DialogInterface dialogInterface, int i) {
        if (!TextUtils.isEmpty(eVar.mo33332c().getText().toString())) {
            if (rVar != null) {
                rVar.mo31866O(eVar.mo33332c().getText().toString().trim());
                m16314B0(rVar);
            } else {
                Toast.makeText(this, getText(2131756203).toString(), 0).show();
            }
            eVar.mo33333d();
            dialogInterface.dismiss();
        }
    }

    /* renamed from: x0 */
    public /* synthetic */ void mo26439x0(ValueAnimator valueAnimator) {
        if (this.f10864k.mo27766e()) {
            this.mImgFanBg.setRotation(360.0f - (((Float) valueAnimator.getAnimatedValue()).floatValue() * 360.0f));
        } else {
            this.mImgFanBg.setRotation(((Float) valueAnimator.getAnimatedValue()).floatValue() * 360.0f);
        }
    }

    /* renamed from: y0 */
    public /* synthetic */ void mo26440y0(ImageView imageView, int i) {
        LightingColorFilter lightingColorFilter = new LightingColorFilter(ViewCompat.MEASURED_STATE_MASK, getResources().getColor(2131099802));
        Drawable drawable = imageView.getContext().getResources().getDrawable(i);
        drawable.clearColorFilter();
        drawable.mutate().setColorFilter(lightingColorFilter);
        imageView.setBackground(drawable);
    }
}
