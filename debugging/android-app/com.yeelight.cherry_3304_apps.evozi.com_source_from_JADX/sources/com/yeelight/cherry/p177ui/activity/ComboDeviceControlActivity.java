package com.yeelight.cherry.p177ui.activity;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.LightingColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.BaseAdapter;
import android.widget.CheckedTextView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.yeelight.cherry.C11748R$layout;
import com.yeelight.yeelib.p150c.p151i.C6017a;
import com.yeelight.yeelib.p150c.p151i.C6018b;
import com.yeelight.yeelib.p150c.p151i.C6024e;
import com.yeelight.yeelib.p150c.p151i.C6038h;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p152f.C9784e;
import com.yeelight.yeelib.p153g.C4300b0;
import com.yeelight.yeelib.p153g.C9849r;
import com.yeelight.yeelib.p186e.C9767b;
import com.yeelight.yeelib.p186e.C9768c;
import com.yeelight.yeelib.p186e.C9770e;
import com.yeelight.yeelib.p194ui.activity.BaseActivity;
import com.yeelight.yeelib.p194ui.activity.SceneActivity;
import com.yeelight.yeelib.p194ui.view.BrightnessSeekBarView;
import com.yeelight.yeelib.p194ui.view.FavoriteSceneViewBar;
import com.yeelight.yeelib.p194ui.view.ModeSelectionViewNew;
import com.yeelight.yeelib.p194ui.widget.C10526e;
import com.yeelight.yeelib.pickcolor.CaptureActivity;
import com.yeelight.yeelib.utils.C10536b0;
import com.yeelight.yeelib.utils.C10547m;
import com.yeelight.yeelib.utils.C4308b;
import com.yeelight.yeelib.utils.C4315y;
import java.util.List;

/* renamed from: com.yeelight.cherry.ui.activity.ComboDeviceControlActivity */
public class ComboDeviceControlActivity extends BaseActivity implements C9768c, C9784e.C4213a, C9767b, C9770e {

    /* renamed from: l */
    private static final String f10465l = ComboDeviceControlActivity.class.getSimpleName();

    /* renamed from: b */
    private C5064t f10466b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public List<C6038h> f10467c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C6017a f10468d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public long f10469e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public boolean f10470f = false;

    /* renamed from: g */
    private boolean f10471g = false;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public boolean f10472h = false;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public boolean f10473i = false;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public int f10474j = 1;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public Handler f10475k = new C5054j();
    @BindView(2131296339)
    LinearLayout mAmbientLampLayout;
    @BindView(2131296651)
    TextView mAmbientLampPrompt;
    @BindView(2131296650)
    CheckedTextView mAmbientLampText;
    @BindView(2131296386)
    BrightnessSeekBarView mBrightnessSeekBar;
    @BindView(2131296676)
    FavoriteSceneViewBar mFavoriteSceneViewBar;
    @BindView(2131296721)
    GridView mFunctionGridView;
    @BindView(2131296762)
    ImageView mImageLeft;
    @BindView(2131296765)
    ImageView mImageMiddle;
    @BindView(2131296766)
    ImageView mImageRight;
    @BindView(2131296437)
    ImageView mImgBack;
    @BindView(2131296438)
    ImageView mImgMore;
    @BindView(2131296886)
    LinearLayout mLayoutAnimation;
    @BindView(2131296912)
    LinearLayout mLayoutLeft;
    @BindView(2131296914)
    LinearLayout mLayoutMiddle;
    @BindView(2131296921)
    LinearLayout mLayoutRight;
    @BindView(2131297309)
    LinearLayout mLayoutShadows;
    @BindView(2131296988)
    LinearLayout mMainLampLayout;
    @BindView(2131296653)
    TextView mMainLampPrompt;
    @BindView(2131296652)
    CheckedTextView mMainLampText;
    @BindView(2131297017)
    ModeSelectionViewNew mModeSelection;
    @BindView(2131296515)
    LinearLayout mMoreLayout;
    @BindView(2131297414)
    TextView mTitleBarRightText;

    /* renamed from: com.yeelight.cherry.ui.activity.ComboDeviceControlActivity$a */
    class C5045a implements View.OnClickListener {
        C5045a() {
        }

        public void onClick(View view) {
            if (!ComboDeviceControlActivity.this.f10472h || !ComboDeviceControlActivity.this.f10468d.mo23408d0().mo27661R()) {
                ComboDeviceControlActivity comboDeviceControlActivity = ComboDeviceControlActivity.this;
                comboDeviceControlActivity.setResult(-1, comboDeviceControlActivity.getIntent());
                ComboDeviceControlActivity.this.finish();
                return;
            }
            ComboDeviceControlActivity.this.f10475k.removeMessages(1);
            ComboDeviceControlActivity.this.f10475k.sendEmptyMessageDelayed(1, 500);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.ComboDeviceControlActivity$b */
    class C5046b implements View.OnLayoutChangeListener {
        C5046b() {
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            if (ComboDeviceControlActivity.this.f10473i) {
                boolean unused = ComboDeviceControlActivity.this.f10473i = false;
                if (ComboDeviceControlActivity.this.f10470f) {
                    boolean unused2 = ComboDeviceControlActivity.this.f10470f = false;
                    ComboDeviceControlActivity comboDeviceControlActivity = ComboDeviceControlActivity.this;
                    comboDeviceControlActivity.m16104s0(comboDeviceControlActivity.f10470f);
                    return;
                }
                ComboDeviceControlActivity comboDeviceControlActivity2 = ComboDeviceControlActivity.this;
                comboDeviceControlActivity2.mLayoutAnimation.setTranslationY((float) comboDeviceControlActivity2.mMoreLayout.getHeight());
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.ComboDeviceControlActivity$c */
    class C5047c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ boolean f10478a;

        C5047c(boolean z) {
            this.f10478a = z;
        }

        public void run() {
            if (this.f10478a) {
                ComboDeviceControlActivity comboDeviceControlActivity = ComboDeviceControlActivity.this;
                comboDeviceControlActivity.m16109x0(comboDeviceControlActivity.mImageLeft, 2131231233);
                return;
            }
            ComboDeviceControlActivity.this.mImageLeft.setBackgroundResource(2131231233);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.ComboDeviceControlActivity$d */
    class C5048d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ImageView f10480a;

        /* renamed from: b */
        final /* synthetic */ int f10481b;

        C5048d(ImageView imageView, int i) {
            this.f10480a = imageView;
            this.f10481b = i;
        }

        public void run() {
            LightingColorFilter lightingColorFilter = new LightingColorFilter(ViewCompat.MEASURED_STATE_MASK, ComboDeviceControlActivity.this.getResources().getColor(2131099802));
            Drawable drawable = this.f10480a.getContext().getResources().getDrawable(this.f10481b);
            drawable.clearColorFilter();
            drawable.mutate().setColorFilter(lightingColorFilter);
            this.f10480a.setBackground(drawable);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.ComboDeviceControlActivity$e */
    class C5049e implements Animator.AnimatorListener {
        C5049e() {
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            ComboDeviceControlActivity.this.mLayoutShadows.setVisibility(8);
            ComboDeviceControlActivity comboDeviceControlActivity = ComboDeviceControlActivity.this;
            boolean unused = comboDeviceControlActivity.f10470f = !comboDeviceControlActivity.f10470f;
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.ComboDeviceControlActivity$f */
    class C5050f implements Animator.AnimatorListener {
        C5050f() {
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            ComboDeviceControlActivity comboDeviceControlActivity = ComboDeviceControlActivity.this;
            boolean unused = comboDeviceControlActivity.f10470f = !comboDeviceControlActivity.f10470f;
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
            ComboDeviceControlActivity.this.mLayoutShadows.setVisibility(0);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.ComboDeviceControlActivity$g */
    class C5051g implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C10526e f10485a;

        C5051g(ComboDeviceControlActivity comboDeviceControlActivity, C10526e eVar) {
            this.f10485a = eVar;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            this.f10485a.mo33333d();
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.ComboDeviceControlActivity$h */
    class C5052h implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C10526e f10486a;

        /* renamed from: b */
        final /* synthetic */ C9849r f10487b;

        C5052h(C10526e eVar, C9849r rVar) {
            this.f10486a = eVar;
            this.f10487b = rVar;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            if (!TextUtils.isEmpty(this.f10486a.mo33332c().getText().toString())) {
                if (this.f10487b != null) {
                    this.f10487b.mo31866O(this.f10486a.mo33332c().getText().toString().trim());
                    ComboDeviceControlActivity.this.m16103r0(this.f10487b);
                } else {
                    ComboDeviceControlActivity comboDeviceControlActivity = ComboDeviceControlActivity.this;
                    Toast.makeText(comboDeviceControlActivity, comboDeviceControlActivity.getText(2131756203).toString(), 0).show();
                }
                this.f10486a.mo33333d();
                dialogInterface.dismiss();
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.ComboDeviceControlActivity$i */
    class C5053i implements C4300b0.C4307g {
        C5053i() {
        }

        /* renamed from: a */
        public void mo23766a(String str) {
        }

        /* renamed from: b */
        public /* synthetic */ void mo26205b(String str) {
            Toast.makeText(ComboDeviceControlActivity.this.getApplicationContext(), str, 0).show();
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
            if (!ComboDeviceControlActivity.this.isFinishing()) {
                ComboDeviceControlActivity.this.runOnUiThread(new C5750o(this, str));
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.ComboDeviceControlActivity$j */
    class C5054j extends Handler {
        C5054j() {
        }

        public void handleMessage(Message message) {
            ComboDeviceControlActivity comboDeviceControlActivity;
            int i;
            super.handleMessage(message);
            int i2 = message.what;
            if (i2 == 0) {
                comboDeviceControlActivity = ComboDeviceControlActivity.this;
                i = 2131756181;
            } else if (i2 == 1) {
                comboDeviceControlActivity = ComboDeviceControlActivity.this;
                i = 2131756178;
            } else {
                return;
            }
            Toast.makeText(comboDeviceControlActivity, comboDeviceControlActivity.getText(i).toString(), 0).show();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.ComboDeviceControlActivity$k */
    class C5055k implements View.OnClickListener {
        C5055k() {
        }

        public void onClick(View view) {
            ComboDeviceControlActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.ComboDeviceControlActivity$l */
    class C5056l implements View.OnClickListener {
        C5056l() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(ComboDeviceControlActivity.this, DeviceSettingActivity.class);
            intent.putExtra("com.yeelight.cherry.device_id", ComboDeviceControlActivity.this.f10468d.mo23372G());
            ComboDeviceControlActivity.this.startActivity(intent);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.ComboDeviceControlActivity$m */
    class C5057m implements Runnable {
        C5057m() {
        }

        public void run() {
            ComboDeviceControlActivity comboDeviceControlActivity = ComboDeviceControlActivity.this;
            comboDeviceControlActivity.mLayoutAnimation.setTranslationY((float) comboDeviceControlActivity.mMoreLayout.getHeight());
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.ComboDeviceControlActivity$n */
    class C5058n implements View.OnClickListener {
        C5058n() {
        }

        public void onClick(View view) {
            if (System.currentTimeMillis() - ComboDeviceControlActivity.this.f10469e >= 300) {
                long unused = ComboDeviceControlActivity.this.f10469e = System.currentTimeMillis();
                if (ComboDeviceControlActivity.this.f10470f) {
                    ComboDeviceControlActivity comboDeviceControlActivity = ComboDeviceControlActivity.this;
                    comboDeviceControlActivity.m16104s0(comboDeviceControlActivity.f10470f);
                }
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.ComboDeviceControlActivity$o */
    class C5059o implements View.OnClickListener {
        C5059o() {
        }

        public void onClick(View view) {
            if (ComboDeviceControlActivity.this.f10474j == 1) {
                if (ComboDeviceControlActivity.this.f10468d.mo27591k2().mo27603h()) {
                    ComboDeviceControlActivity.this.f10468d.mo23326b1();
                } else {
                    ComboDeviceControlActivity.this.f10468d.mo23334l1();
                    ComboDeviceControlActivity.this.m16101o0(true);
                    C4315y.m12185b();
                }
            } else if (ComboDeviceControlActivity.this.f10468d.mo27591k2().mo27601f()) {
                ComboDeviceControlActivity.this.f10468d.mo27589i2();
            } else {
                ComboDeviceControlActivity.this.f10468d.mo27592l2();
                ComboDeviceControlActivity.this.m16101o0(true);
                C4315y.m12185b();
            }
            ComboDeviceControlActivity.this.m16101o0(false);
            C4315y.m12185b();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.ComboDeviceControlActivity$p */
    class C5060p implements View.OnClickListener {
        C5060p() {
        }

        public void onClick(View view) {
            if (ComboDeviceControlActivity.this.f10474j != 1) {
                ComboDeviceControlActivity.this.m16110y0();
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.ComboDeviceControlActivity$q */
    class C5061q implements View.OnClickListener {
        C5061q() {
        }

        public void onClick(View view) {
            if (ComboDeviceControlActivity.this.f10474j != 2) {
                ComboDeviceControlActivity.this.m16108w0();
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.ComboDeviceControlActivity$r */
    class C5062r implements View.OnClickListener {
        C5062r() {
        }

        public void onClick(View view) {
            if (ComboDeviceControlActivity.this.f10468d.mo23332k1()) {
                ComboDeviceControlActivity.this.m16105t0();
                return;
            }
            ComboDeviceControlActivity.this.f10475k.removeMessages(0);
            ComboDeviceControlActivity.this.f10475k.sendEmptyMessageDelayed(0, 500);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.ComboDeviceControlActivity$s */
    class C5063s implements View.OnClickListener {
        C5063s() {
        }

        public void onClick(View view) {
            if (System.currentTimeMillis() - ComboDeviceControlActivity.this.f10469e >= 300) {
                long unused = ComboDeviceControlActivity.this.f10469e = System.currentTimeMillis();
                ComboDeviceControlActivity comboDeviceControlActivity = ComboDeviceControlActivity.this;
                comboDeviceControlActivity.m16104s0(comboDeviceControlActivity.f10470f);
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.ComboDeviceControlActivity$t */
    private class C5064t extends BaseAdapter {

        /* renamed from: com.yeelight.cherry.ui.activity.ComboDeviceControlActivity$t$a */
        class C5065a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ int f10501a;

            C5065a(int i) {
                this.f10501a = i;
            }

            public void onClick(View view) {
                Class<SceneActivity> h = ((C6038h) ComboDeviceControlActivity.this.f10467c.get(this.f10501a)).mo27778h();
                if (h == null) {
                    return;
                }
                if (h == CaptureActivity.class) {
                    if (ContextCompat.checkSelfPermission(ComboDeviceControlActivity.this.getApplicationContext(), "android.permission.CAMERA") != 0) {
                        ActivityCompat.requestPermissions(ComboDeviceControlActivity.this, new String[]{"android.permission.CAMERA"}, 0);
                    } else {
                        ComboDeviceControlActivity.this.m16106u0();
                    }
                } else if (h == SceneActivity.class && ComboDeviceControlActivity.this.f10474j == 2) {
                    ComboDeviceControlActivity comboDeviceControlActivity = ComboDeviceControlActivity.this;
                    ((C6038h) ComboDeviceControlActivity.this.f10467c.get(this.f10501a)).mo27786p(comboDeviceControlActivity, comboDeviceControlActivity.f10468d.mo23372G(), 2);
                } else {
                    ComboDeviceControlActivity comboDeviceControlActivity2 = ComboDeviceControlActivity.this;
                    ((C6038h) ComboDeviceControlActivity.this.f10467c.get(this.f10501a)).mo27785o(comboDeviceControlActivity2, comboDeviceControlActivity2.f10468d.mo23372G());
                }
            }
        }

        private C5064t() {
        }

        /* synthetic */ C5064t(ComboDeviceControlActivity comboDeviceControlActivity, C5055k kVar) {
            this();
        }

        public int getCount() {
            return ComboDeviceControlActivity.this.f10467c == null ? 0 : 9;
        }

        public Object getItem(int i) {
            return null;
        }

        public long getItemId(int i) {
            return 0;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            View view2;
            C5066u uVar;
            int i2;
            TextView textView;
            if (i >= ComboDeviceControlActivity.this.f10467c.size()) {
                return LayoutInflater.from(ComboDeviceControlActivity.this).inflate(2131493102, (ViewGroup) null);
            }
            if (view == null) {
                uVar = new C5066u(ComboDeviceControlActivity.this, (C5055k) null);
                view2 = LayoutInflater.from(ComboDeviceControlActivity.this).inflate(2131493103, (ViewGroup) null);
                view2.setTag(uVar);
            } else {
                view2 = view;
                uVar = (C5066u) view.getTag();
            }
            uVar.f10507e = ((C6038h) ComboDeviceControlActivity.this.f10467c.get(i)).mo27774d();
            uVar.f10503a = (ImageView) view2.findViewById(2131296722);
            uVar.f10504b = (TextView) view2.findViewById(2131296719);
            uVar.f10505c = (TextView) view2.findViewById(2131296723);
            uVar.f10506d = (LinearLayout) view2.findViewById(2131296729);
            uVar.f10505c.setText(((C6038h) ComboDeviceControlActivity.this.f10467c.get(i)).mo27777g());
            if (((C6038h) ComboDeviceControlActivity.this.f10467c.get(i)).mo27782l()) {
                uVar.f10504b.setVisibility(0);
                if (((C6038h) ComboDeviceControlActivity.this.f10467c.get(i)).mo27780j()) {
                    textView = uVar.f10504b;
                    i2 = ComboDeviceControlActivity.this.getResources().getColor(2131099806);
                } else {
                    textView = uVar.f10504b;
                    i2 = -3355444;
                }
                textView.setBackgroundColor(i2);
                if (ComboDeviceControlActivity.this.f10468d != null) {
                    ComboDeviceControlActivity.this.f10468d.mo23365B0(uVar);
                }
            } else {
                uVar.f10504b.setVisibility(4);
                if (ComboDeviceControlActivity.this.f10468d != null) {
                    ComboDeviceControlActivity.this.f10468d.mo23400W0(uVar);
                }
            }
            uVar.f10503a.setBackgroundResource(((C6038h) ComboDeviceControlActivity.this.f10467c.get(i)).mo27776f());
            uVar.f10506d.setOnClickListener(new C5065a(i));
            return view2;
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.ComboDeviceControlActivity$u */
    private class C5066u implements C9770e {

        /* renamed from: a */
        public ImageView f10503a;

        /* renamed from: b */
        public TextView f10504b;

        /* renamed from: c */
        public TextView f10505c;

        /* renamed from: d */
        public LinearLayout f10506d;

        /* renamed from: e */
        public int f10507e;

        /* renamed from: com.yeelight.cherry.ui.activity.ComboDeviceControlActivity$u$a */
        class C5067a implements Runnable {
            C5067a() {
            }

            public void run() {
                for (C6038h next : ComboDeviceControlActivity.this.f10468d.mo23382M()) {
                    if (next.mo27774d() == C5066u.this.f10507e) {
                        if (next.mo27780j()) {
                            C5066u uVar = C5066u.this;
                            uVar.f10504b.setBackgroundColor(ComboDeviceControlActivity.this.getResources().getColor(2131099806));
                        } else {
                            C5066u.this.f10504b.setBackgroundColor(-3355444);
                        }
                    }
                }
            }
        }

        private C5066u() {
        }

        /* synthetic */ C5066u(ComboDeviceControlActivity comboDeviceControlActivity, C5055k kVar) {
            this();
        }

        public void onStatusChange(int i, C6024e eVar) {
            if (i == 4096) {
                ComboDeviceControlActivity.this.runOnUiThread(new C5067a());
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: o0 */
    public void m16101o0(boolean z) {
        this.mImageLeft.post(new C5047c(z));
    }

    /* renamed from: q0 */
    private void m16102q0(String str) {
        this.mBrightnessSeekBar.setDeviceId(str);
        this.mFavoriteSceneViewBar.setDeviceId(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: r0 */
    public void m16103r0(C9849r rVar) {
        C4300b0.m12083u().mo23738A(rVar, new C5053i());
    }

    /* access modifiers changed from: private */
    /* renamed from: s0 */
    public void m16104s0(boolean z) {
        ObjectAnimator objectAnimator;
        Animator.AnimatorListener animatorListener;
        if (z) {
            objectAnimator = ObjectAnimator.ofFloat(this.mLayoutAnimation, "translationY", new float[]{0.0f, (float) this.mMoreLayout.getHeight()}).setDuration(300);
            objectAnimator.setInterpolator(new AccelerateInterpolator());
            objectAnimator.start();
            ObjectAnimator.ofFloat(this.mImageRight, "rotation", new float[]{180.0f, 0.0f}).setDuration(20).start();
            ObjectAnimator.ofFloat(this.mLayoutShadows, "alpha", new float[]{1.0f, 0.0f}).setDuration(300).start();
            animatorListener = new C5049e();
        } else {
            this.mLayoutShadows.setVisibility(0);
            objectAnimator = ObjectAnimator.ofFloat(this.mLayoutAnimation, "translationY", new float[]{(float) this.mMoreLayout.getHeight(), 0.0f}).setDuration(300);
            objectAnimator.setInterpolator(new DecelerateInterpolator());
            objectAnimator.start();
            ObjectAnimator.ofFloat(this.mImageRight, "rotation", new float[]{0.0f, 180.0f}).setDuration(20).start();
            ObjectAnimator.ofFloat(this.mLayoutShadows, "alpha", new float[]{0.0f, 1.0f}).setDuration(300).start();
            animatorListener = new C5050f();
        }
        objectAnimator.addListener(animatorListener);
    }

    /* access modifiers changed from: private */
    /* renamed from: t0 */
    public void m16105t0() {
        C10526e.C10531e eVar = new C10526e.C10531e(this);
        eVar.mo33358i(getText(2131756208).toString());
        eVar.mo33356g(getText(2131756180).toString());
        eVar.mo33360k(true);
        C10526e b = eVar.mo33351b();
        b.mo33335g(-2, getText(2131755146).toString(), new C5051g(this, b));
        b.mo33335g(-1, getText(2131755277).toString(), new C5052h(b, this.f10474j == 2 ? this.f10468d.mo27590j2() : this.f10468d.mo23407c0()));
        b.setCancelable(true);
        b.mo33332c().addTextChangedListener(new C10536b0(20, b.mo33332c()));
        b.show();
        b.mo33343o();
    }

    /* access modifiers changed from: private */
    /* renamed from: u0 */
    public void m16106u0() {
        Intent intent = new Intent(this, CaptureActivity.class);
        intent.putExtra("com.yeelight.cherry.device_id", this.f10468d.mo23372G());
        startActivity(intent);
    }

    /* renamed from: v0 */
    private void m16107v0() {
        this.mModeSelection.mo32995v();
        this.mBrightnessSeekBar.mo32740i();
    }

    /* access modifiers changed from: private */
    /* renamed from: w0 */
    public void m16108w0() {
        this.f10474j = 2;
        this.mMainLampPrompt.setVisibility(4);
        this.mAmbientLampPrompt.setVisibility(0);
        this.mMainLampText.setChecked(false);
        this.mAmbientLampText.setChecked(true);
        this.mBrightnessSeekBar.setEosProLampMode(this.f10474j);
        this.mModeSelection.mo32991q(this.f10468d.mo23372G(), this.f10474j);
        this.mFavoriteSceneViewBar.mo32878v(this.f10474j, this.f10468d.mo23395T());
        if (this.f10468d.mo27591k2().mo27601f()) {
            m16101o0(true);
        } else {
            m16101o0(false);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: x0 */
    public void m16109x0(ImageView imageView, int i) {
        imageView.post(new C5048d(imageView, i));
    }

    /* access modifiers changed from: private */
    /* renamed from: y0 */
    public void m16110y0() {
        this.f10474j = 1;
        this.mMainLampPrompt.setVisibility(0);
        this.mAmbientLampPrompt.setVisibility(4);
        this.mMainLampText.setChecked(true);
        this.mAmbientLampText.setChecked(false);
        this.mBrightnessSeekBar.setEosProLampMode(this.f10474j);
        this.mModeSelection.mo32991q(this.f10468d.mo23372G(), this.f10474j);
        this.mFavoriteSceneViewBar.mo32878v(this.f10474j, this.f10468d.mo23395T());
        if (this.f10468d.mo27591k2().mo27603h()) {
            m16101o0(true);
        } else {
            m16101o0(false);
        }
    }

    /* renamed from: I */
    public void mo23487I() {
        finish();
    }

    /* renamed from: h */
    public void mo23488h(int i) {
    }

    /* renamed from: j */
    public void mo23489j() {
    }

    public void onBackPressed() {
        boolean z = this.f10470f;
        if (z) {
            m16104s0(z);
        } else {
            super.onBackPressed();
        }
    }

    public void onConnectionStateChanged(int i, int i2) {
        if (i2 == 0) {
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo32193P();
        C10547m.m25758h(true, this);
        setContentView(C11748R$layout.activity_control_view_eos_pro);
        ButterKnife.bind((Activity) this);
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            C4308b.m12141t(f10465l, "Activity has not device id", false);
            finish();
            return;
        }
        this.f10468d = (C6017a) C4257w.m11953o0(intent.getStringExtra("com.yeelight.cherry.device_id"));
        this.f10471g = getIntent().getBooleanExtra("scene_bundle_item", false);
        this.f10472h = getIntent().getBooleanExtra("set_device_default", false);
        C6017a aVar = this.f10468d;
        if (aVar == null || !aVar.mo23331k0()) {
            BaseActivity.m24384U(this);
            finish();
            return;
        }
        this.mImgBack.setOnClickListener(new C5055k());
        this.mImgMore.setOnClickListener(new C5056l());
        this.f10467c = this.f10468d.mo23382M();
        C5064t tVar = new C5064t(this, (C5055k) null);
        this.f10466b = tVar;
        this.mFunctionGridView.setAdapter(tVar);
        if (this.f10468d.mo23384N() == null) {
            this.f10468d.mo23356y0();
        }
        this.mMoreLayout.post(new C5057m());
        this.mLayoutShadows.setOnClickListener(new C5058n());
        this.mLayoutLeft.setOnClickListener(new C5059o());
        m16101o0(this.f10468d.mo23332k1());
        this.mMainLampText.setChecked(true);
        this.mMainLampPrompt.setVisibility(0);
        this.mAmbientLampText.setChecked(false);
        this.mAmbientLampPrompt.setVisibility(4);
        this.mMainLampLayout.setOnClickListener(new C5060p());
        this.mAmbientLampLayout.setOnClickListener(new C5061q());
        this.mLayoutMiddle.setOnClickListener(new C5062r());
        this.mLayoutRight.setOnClickListener(new C5063s());
        if (this.f10471g || this.f10472h) {
            this.mLayoutMiddle.setClickable(false);
            this.mImageMiddle.setAlpha(0.3f);
            this.mLayoutRight.setClickable(false);
            this.mImageRight.setAlpha(0.3f);
            this.mTitleBarRightText.setVisibility(0);
            this.mImgMore.setVisibility(8);
            this.mTitleBarRightText.setText(getString(2131755305));
            this.mTitleBarRightText.setTextColor(getResources().getColor(2131099839));
            this.mTitleBarRightText.setOnClickListener(new C5045a());
        }
        this.f10468d.mo23358z0(this);
        this.mModeSelection.setBrightnessSeekbarView(this.mBrightnessSeekBar);
        this.mMoreLayout.addOnLayoutChangeListener(new C5046b());
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        this.f10475k.removeCallbacksAndMessages((Object) null);
        super.onDestroy();
    }

    public void onLocalConnected() {
    }

    public void onLocalDisconnected() {
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 0 && iArr.length > 0 && iArr[0] == 0) {
            m16106u0();
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        if (this.f10474j == 2) {
            m16108w0();
        } else {
            m16110y0();
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        C6017a aVar = (C6017a) C4257w.m11953o0(getIntent().getStringExtra("com.yeelight.cherry.device_id"));
        this.f10468d = aVar;
        if (aVar == null) {
            finish();
            return;
        }
        aVar.mo23358z0(this);
        this.f10468d.mo27591k2().mo27604i(this);
        this.f10468d.mo23365B0(this);
        C9784e.m23711b().mo31634j(this);
        m16102q0(this.f10468d.mo23372G());
    }

    public void onStatusChange(int i, C6024e eVar) {
        if (i == 256) {
            this.f10475k.postDelayed(new C5755p(this), 100);
        }
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        m16107v0();
        C9784e.m23711b().mo31636m(this);
        C6017a aVar = this.f10468d;
        if (aVar != null) {
            aVar.mo23319V0(this);
            this.f10468d.mo23400W0(this);
        }
        if (this.f10470f) {
            this.mLayoutAnimation.setTranslationY((float) this.mMoreLayout.getHeight());
            this.mImageRight.setRotation(0.0f);
            this.mLayoutShadows.setVisibility(8);
            this.f10470f = false;
        }
        C6017a aVar2 = this.f10468d;
        if (aVar2 instanceof C6017a) {
            aVar2.mo27591k2().mo27614s(this);
        }
    }

    /* renamed from: p */
    public void mo26189p(int i, C6018b bVar) {
        if (i != 524288) {
            if (i != 1048576) {
                if (i != 2097152) {
                    if (!(i == 4194304 && this.f10474j == 2)) {
                        return;
                    }
                } else if (this.f10474j != 2) {
                    return;
                }
            } else if (this.f10474j != 1) {
                return;
            }
            m16101o0(false);
            return;
        } else if (this.f10474j != 1) {
            return;
        }
        m16101o0(true);
    }

    /* renamed from: p0 */
    public /* synthetic */ void mo26190p0() {
        this.f10473i = true;
        this.f10467c = this.f10468d.mo23382M();
        C5064t tVar = this.f10466b;
        if (tVar != null) {
            tVar.notifyDataSetChanged();
        }
    }

    /* renamed from: v */
    public void mo23490v() {
    }
}
