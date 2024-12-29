package com.yeelight.cherry.p141ui.activity;

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
import androidx.annotation.NonNull;
import androidx.constraintlayout.motion.widget.Key;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.yeelight.cherry.C12228R$layout;
import com.yeelight.yeelib.device.base.C6091a;
import com.yeelight.yeelib.device.base.C6092b;
import com.yeelight.yeelib.device.base.C6093d;
import com.yeelight.yeelib.device.base.DeviceStatusBase;
import com.yeelight.yeelib.managers.C8272e;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.models.C3112v;
import com.yeelight.yeelib.models.C8321m;
import com.yeelight.yeelib.p142ui.activity.BaseActivity;
import com.yeelight.yeelib.p142ui.activity.SceneActivity;
import com.yeelight.yeelib.p142ui.view.BrightnessSeekBarView;
import com.yeelight.yeelib.p142ui.view.FavoriteSceneViewBar;
import com.yeelight.yeelib.p142ui.view.ModeSelectionViewNew;
import com.yeelight.yeelib.pickcolor.CaptureActivity;
import com.yeelight.yeelib.utils.AppUtils;
import java.util.List;
import p051j4.C3284x;
import p051j4.C9183a0;
import p051j4.C9193k;
import p170i4.C9113d;
import p237z3.C12142b;
import p237z3.C12143c;
import p237z3.C12145e;

/* renamed from: com.yeelight.cherry.ui.activity.ComboDeviceControlActivity */
public class ComboDeviceControlActivity extends BaseActivity implements C12143c, C8272e.C3063a, C12142b, C12145e {

    /* renamed from: k */
    private static final String f10015k = "ComboDeviceControlActivity";

    /* renamed from: l */
    public static final /* synthetic */ int f10016l = 0;

    /* renamed from: a */
    private C5111t f10017a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public List<C6093d> f10018b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C6091a f10019c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public long f10020d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public boolean f10021e = false;

    /* renamed from: f */
    private boolean f10022f = false;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public boolean f10023g = false;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public boolean f10024h = false;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public int f10025i = 1;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public Handler f10026j = new C5101j();
    @BindView(2131296382)
    LinearLayout mAmbientLampLayout;
    @BindView(2131296745)
    TextView mAmbientLampPrompt;
    @BindView(2131296744)
    CheckedTextView mAmbientLampText;
    @BindView(2131296444)
    BrightnessSeekBarView mBrightnessSeekBar;
    @BindView(2131296770)
    FavoriteSceneViewBar mFavoriteSceneViewBar;
    @BindView(2131296818)
    GridView mFunctionGridView;
    @BindView(2131296866)
    ImageView mImageLeft;
    @BindView(2131296869)
    ImageView mImageMiddle;
    @BindView(2131296870)
    ImageView mImageRight;
    @BindView(2131296495)
    ImageView mImgBack;
    @BindView(2131296496)
    ImageView mImgMore;
    @BindView(2131296997)
    LinearLayout mLayoutAnimation;
    @BindView(2131297023)
    LinearLayout mLayoutLeft;
    @BindView(2131297025)
    LinearLayout mLayoutMiddle;
    @BindView(2131297032)
    LinearLayout mLayoutRight;
    @BindView(2131297452)
    LinearLayout mLayoutShadows;
    @BindView(2131297105)
    LinearLayout mMainLampLayout;
    @BindView(2131296747)
    TextView mMainLampPrompt;
    @BindView(2131296746)
    CheckedTextView mMainLampText;
    @BindView(2131297136)
    ModeSelectionViewNew mModeSelection;
    @BindView(2131296587)
    LinearLayout mMoreLayout;
    @BindView(2131297580)
    TextView mTitleBarRightText;

    /* renamed from: com.yeelight.cherry.ui.activity.ComboDeviceControlActivity$a */
    class C5092a implements View.OnClickListener {
        C5092a() {
        }

        public void onClick(View view) {
            if (ComboDeviceControlActivity.this.f10023g) {
                if (ComboDeviceControlActivity.this.f10019c.mo23221d0().mo31562S()) {
                    ComboDeviceControlActivity.this.f10026j.removeMessages(1);
                    ComboDeviceControlActivity.this.f10026j.sendEmptyMessageDelayed(1, 500);
                    return;
                } else if (!ComboDeviceControlActivity.this.f10019c.mo31657k2().mo31669h()) {
                    ComboDeviceControlActivity.this.mo35655S(2131756202);
                    return;
                }
            }
            ComboDeviceControlActivity comboDeviceControlActivity = ComboDeviceControlActivity.this;
            comboDeviceControlActivity.setResult(-1, comboDeviceControlActivity.getIntent());
            ComboDeviceControlActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.ComboDeviceControlActivity$b */
    class C5093b implements View.OnLayoutChangeListener {
        C5093b() {
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            if (ComboDeviceControlActivity.this.f10024h) {
                boolean unused = ComboDeviceControlActivity.this.f10024h = false;
                if (ComboDeviceControlActivity.this.f10021e) {
                    boolean unused2 = ComboDeviceControlActivity.this.f10021e = false;
                    ComboDeviceControlActivity comboDeviceControlActivity = ComboDeviceControlActivity.this;
                    comboDeviceControlActivity.m16002w0(comboDeviceControlActivity.f10021e);
                    return;
                }
                ComboDeviceControlActivity comboDeviceControlActivity2 = ComboDeviceControlActivity.this;
                comboDeviceControlActivity2.mLayoutAnimation.setTranslationY((float) comboDeviceControlActivity2.mMoreLayout.getHeight());
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.ComboDeviceControlActivity$c */
    class C5094c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ boolean f10029a;

        C5094c(boolean z) {
            this.f10029a = z;
        }

        public void run() {
            if (this.f10029a) {
                ComboDeviceControlActivity comboDeviceControlActivity = ComboDeviceControlActivity.this;
                comboDeviceControlActivity.m15973B0(comboDeviceControlActivity.mImageLeft, 2131231247);
                return;
            }
            ComboDeviceControlActivity.this.mImageLeft.setBackgroundResource(2131231247);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.ComboDeviceControlActivity$d */
    class C5095d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ImageView f10031a;

        /* renamed from: b */
        final /* synthetic */ int f10032b;

        C5095d(ImageView imageView, int i) {
            this.f10031a = imageView;
            this.f10032b = i;
        }

        public void run() {
            LightingColorFilter lightingColorFilter = new LightingColorFilter(ViewCompat.MEASURED_STATE_MASK, ComboDeviceControlActivity.this.getResources().getColor(2131099805));
            Drawable drawable = this.f10031a.getContext().getResources().getDrawable(this.f10032b);
            drawable.clearColorFilter();
            drawable.mutate().setColorFilter(lightingColorFilter);
            this.f10031a.setBackground(drawable);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.ComboDeviceControlActivity$e */
    class C5096e implements Animator.AnimatorListener {
        C5096e() {
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            ComboDeviceControlActivity.this.mLayoutShadows.setVisibility(8);
            ComboDeviceControlActivity comboDeviceControlActivity = ComboDeviceControlActivity.this;
            boolean unused = comboDeviceControlActivity.f10021e = !comboDeviceControlActivity.f10021e;
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.ComboDeviceControlActivity$f */
    class C5097f implements Animator.AnimatorListener {
        C5097f() {
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            ComboDeviceControlActivity comboDeviceControlActivity = ComboDeviceControlActivity.this;
            boolean unused = comboDeviceControlActivity.f10021e = !comboDeviceControlActivity.f10021e;
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
            ComboDeviceControlActivity.this.mLayoutShadows.setVisibility(0);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.ComboDeviceControlActivity$g */
    class C5098g implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C9113d f10036a;

        C5098g(ComboDeviceControlActivity comboDeviceControlActivity, C9113d dVar) {
            this.f10036a = dVar;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            this.f10036a.mo37154d();
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.ComboDeviceControlActivity$h */
    class C5099h implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C9113d f10037a;

        /* renamed from: b */
        final /* synthetic */ C8321m f10038b;

        C5099h(C9113d dVar, C8321m mVar) {
            this.f10037a = dVar;
            this.f10038b = mVar;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            if (!TextUtils.isEmpty(this.f10037a.mo37153c().getText().toString())) {
                if (this.f10038b != null) {
                    this.f10038b.mo35431P(this.f10037a.mo37153c().getText().toString().trim());
                    ComboDeviceControlActivity.this.m16001v0(this.f10038b);
                } else {
                    ComboDeviceControlActivity comboDeviceControlActivity = ComboDeviceControlActivity.this;
                    Toast.makeText(comboDeviceControlActivity, comboDeviceControlActivity.getText(2131756228).toString(), 0).show();
                }
                this.f10037a.mo37154d();
                dialogInterface.dismiss();
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.ComboDeviceControlActivity$i */
    class C5100i implements C3112v.C3119g {
        C5100i() {
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public /* synthetic */ void m16012c(String str) {
            Toast.makeText(ComboDeviceControlActivity.this.getApplicationContext(), str, 0).show();
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
            if (!ComboDeviceControlActivity.this.isFinishing()) {
                ComboDeviceControlActivity.this.runOnUiThread(new C5723a0(this, str));
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.ComboDeviceControlActivity$j */
    class C5101j extends Handler {
        C5101j() {
        }

        public void handleMessage(Message message) {
            ComboDeviceControlActivity comboDeviceControlActivity;
            int i;
            super.handleMessage(message);
            int i2 = message.what;
            if (i2 == 0) {
                comboDeviceControlActivity = ComboDeviceControlActivity.this;
                i = 2131756206;
            } else if (i2 == 1) {
                comboDeviceControlActivity = ComboDeviceControlActivity.this;
                i = 2131756203;
            } else {
                return;
            }
            Toast.makeText(comboDeviceControlActivity, comboDeviceControlActivity.getText(i).toString(), 0).show();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.ComboDeviceControlActivity$k */
    class C5102k implements View.OnClickListener {
        C5102k() {
        }

        public void onClick(View view) {
            ComboDeviceControlActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.ComboDeviceControlActivity$l */
    class C5103l implements View.OnClickListener {
        C5103l() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(ComboDeviceControlActivity.this, DeviceSettingActivity.class);
            intent.putExtra("com.yeelight.cherry.device_id", ComboDeviceControlActivity.this.f10019c.mo23185G());
            ComboDeviceControlActivity.this.startActivity(intent);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.ComboDeviceControlActivity$m */
    class C5104m implements Runnable {
        C5104m() {
        }

        public void run() {
            ComboDeviceControlActivity comboDeviceControlActivity = ComboDeviceControlActivity.this;
            comboDeviceControlActivity.mLayoutAnimation.setTranslationY((float) comboDeviceControlActivity.mMoreLayout.getHeight());
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.ComboDeviceControlActivity$n */
    class C5105n implements View.OnClickListener {
        C5105n() {
        }

        public void onClick(View view) {
            if (System.currentTimeMillis() - ComboDeviceControlActivity.this.f10020d >= 300) {
                long unused = ComboDeviceControlActivity.this.f10020d = System.currentTimeMillis();
                if (ComboDeviceControlActivity.this.f10021e) {
                    ComboDeviceControlActivity comboDeviceControlActivity = ComboDeviceControlActivity.this;
                    comboDeviceControlActivity.m16002w0(comboDeviceControlActivity.f10021e);
                }
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.ComboDeviceControlActivity$o */
    class C5106o implements View.OnClickListener {
        C5106o() {
        }

        public void onClick(View view) {
            if (ComboDeviceControlActivity.this.f10025i == 1) {
                if (ComboDeviceControlActivity.this.f10019c.mo31657k2().mo31669h()) {
                    ComboDeviceControlActivity.this.f10019c.mo23140b1();
                } else {
                    ComboDeviceControlActivity.this.f10019c.mo23148l1();
                    ComboDeviceControlActivity.this.m15997r0(true);
                    C3284x.m8852b();
                }
            } else if (ComboDeviceControlActivity.this.f10019c.mo31657k2().mo31667f()) {
                ComboDeviceControlActivity.this.f10019c.mo31655i2();
            } else {
                ComboDeviceControlActivity.this.f10019c.mo31658l2();
                ComboDeviceControlActivity.this.m15997r0(true);
                C3284x.m8852b();
            }
            ComboDeviceControlActivity.this.m15997r0(false);
            C3284x.m8852b();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.ComboDeviceControlActivity$p */
    class C5107p implements View.OnClickListener {
        C5107p() {
        }

        public void onClick(View view) {
            if (ComboDeviceControlActivity.this.f10025i != 1) {
                ComboDeviceControlActivity.this.m15974C0();
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.ComboDeviceControlActivity$q */
    class C5108q implements View.OnClickListener {
        C5108q() {
        }

        public void onClick(View view) {
            if (ComboDeviceControlActivity.this.f10025i != 2) {
                ComboDeviceControlActivity.this.m15972A0();
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.ComboDeviceControlActivity$r */
    class C5109r implements View.OnClickListener {
        C5109r() {
        }

        public void onClick(View view) {
            if (ComboDeviceControlActivity.this.f10019c.mo23146k1()) {
                ComboDeviceControlActivity.this.m16003x0();
                return;
            }
            ComboDeviceControlActivity.this.f10026j.removeMessages(0);
            ComboDeviceControlActivity.this.f10026j.sendEmptyMessageDelayed(0, 500);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.ComboDeviceControlActivity$s */
    class C5110s implements View.OnClickListener {
        C5110s() {
        }

        public void onClick(View view) {
            if (System.currentTimeMillis() - ComboDeviceControlActivity.this.f10020d >= 300) {
                long unused = ComboDeviceControlActivity.this.f10020d = System.currentTimeMillis();
                ComboDeviceControlActivity comboDeviceControlActivity = ComboDeviceControlActivity.this;
                comboDeviceControlActivity.m16002w0(comboDeviceControlActivity.f10021e);
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.ComboDeviceControlActivity$t */
    private class C5111t extends BaseAdapter {

        /* renamed from: com.yeelight.cherry.ui.activity.ComboDeviceControlActivity$t$a */
        class C5112a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ int f10052a;

            C5112a(int i) {
                this.f10052a = i;
            }

            public void onClick(View view) {
                Class<SceneActivity> h = ((C6093d) ComboDeviceControlActivity.this.f10018b.get(this.f10052a)).mo31688h();
                if (h == null) {
                    return;
                }
                if (h == CaptureActivity.class) {
                    ComboDeviceControlActivity.this.m16000u0();
                } else if (h == SceneActivity.class && ComboDeviceControlActivity.this.f10025i == 2) {
                    ComboDeviceControlActivity comboDeviceControlActivity = ComboDeviceControlActivity.this;
                    ((C6093d) ComboDeviceControlActivity.this.f10018b.get(this.f10052a)).mo31696p(comboDeviceControlActivity, comboDeviceControlActivity.f10019c.mo23185G(), 2);
                } else {
                    ComboDeviceControlActivity comboDeviceControlActivity2 = ComboDeviceControlActivity.this;
                    ((C6093d) ComboDeviceControlActivity.this.f10018b.get(this.f10052a)).mo31695o(comboDeviceControlActivity2, comboDeviceControlActivity2.f10019c.mo23185G());
                }
            }
        }

        private C5111t() {
        }

        /* synthetic */ C5111t(ComboDeviceControlActivity comboDeviceControlActivity, C5102k kVar) {
            this();
        }

        public int getCount() {
            return ComboDeviceControlActivity.this.f10018b == null ? 0 : 9;
        }

        public Object getItem(int i) {
            return null;
        }

        public long getItemId(int i) {
            return 0;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            View view2;
            C5113u uVar;
            int i2;
            TextView textView;
            if (i >= ComboDeviceControlActivity.this.f10018b.size()) {
                return LayoutInflater.from(ComboDeviceControlActivity.this).inflate(2131493106, (ViewGroup) null);
            }
            if (view == null) {
                uVar = new C5113u(ComboDeviceControlActivity.this, (C5102k) null);
                view2 = LayoutInflater.from(ComboDeviceControlActivity.this).inflate(2131493107, (ViewGroup) null);
                view2.setTag(uVar);
            } else {
                view2 = view;
                uVar = (C5113u) view.getTag();
            }
            uVar.f10058e = ((C6093d) ComboDeviceControlActivity.this.f10018b.get(i)).mo31684d();
            uVar.f10054a = (ImageView) view2.findViewById(2131296819);
            uVar.f10055b = (TextView) view2.findViewById(2131296816);
            uVar.f10056c = (TextView) view2.findViewById(2131296820);
            uVar.f10057d = (LinearLayout) view2.findViewById(2131296828);
            uVar.f10056c.setText(((C6093d) ComboDeviceControlActivity.this.f10018b.get(i)).mo31687g());
            if (((C6093d) ComboDeviceControlActivity.this.f10018b.get(i)).mo31692l()) {
                uVar.f10055b.setVisibility(0);
                if (((C6093d) ComboDeviceControlActivity.this.f10018b.get(i)).mo31690j()) {
                    textView = uVar.f10055b;
                    i2 = ComboDeviceControlActivity.this.getResources().getColor(2131099809);
                } else {
                    textView = uVar.f10055b;
                    i2 = -3355444;
                }
                textView.setBackgroundColor(i2);
                if (ComboDeviceControlActivity.this.f10019c != null) {
                    ComboDeviceControlActivity.this.f10019c.mo23178B0(uVar);
                }
            } else {
                uVar.f10055b.setVisibility(4);
                if (ComboDeviceControlActivity.this.f10019c != null) {
                    ComboDeviceControlActivity.this.f10019c.mo23213W0(uVar);
                }
            }
            uVar.f10054a.setBackgroundResource(((C6093d) ComboDeviceControlActivity.this.f10018b.get(i)).mo31686f());
            uVar.f10057d.setOnClickListener(new C5112a(i));
            return view2;
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.ComboDeviceControlActivity$u */
    private class C5113u implements C12145e {

        /* renamed from: a */
        public ImageView f10054a;

        /* renamed from: b */
        public TextView f10055b;

        /* renamed from: c */
        public TextView f10056c;

        /* renamed from: d */
        public LinearLayout f10057d;

        /* renamed from: e */
        public int f10058e;

        /* renamed from: com.yeelight.cherry.ui.activity.ComboDeviceControlActivity$u$a */
        class C5114a implements Runnable {
            C5114a() {
            }

            public void run() {
                for (C6093d next : ComboDeviceControlActivity.this.f10019c.mo23195M()) {
                    if (next.mo31684d() == C5113u.this.f10058e) {
                        if (next.mo31690j()) {
                            C5113u uVar = C5113u.this;
                            uVar.f10055b.setBackgroundColor(ComboDeviceControlActivity.this.getResources().getColor(2131099809));
                        } else {
                            C5113u.this.f10055b.setBackgroundColor(-3355444);
                        }
                    }
                }
            }
        }

        private C5113u() {
        }

        /* synthetic */ C5113u(ComboDeviceControlActivity comboDeviceControlActivity, C5102k kVar) {
            this();
        }

        public void onStatusChange(int i, DeviceStatusBase deviceStatusBase) {
            if (i == 4096) {
                ComboDeviceControlActivity.this.runOnUiThread(new C5114a());
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: A0 */
    public void m15972A0() {
        this.f10025i = 2;
        this.mMainLampPrompt.setVisibility(4);
        this.mAmbientLampPrompt.setVisibility(0);
        this.mMainLampText.setChecked(false);
        this.mAmbientLampText.setChecked(true);
        this.mBrightnessSeekBar.setEosProLampMode(this.f10025i);
        this.mModeSelection.mo36361q(this.f10019c.mo23185G(), this.f10025i);
        this.mFavoriteSceneViewBar.mo36248v(this.f10025i, this.f10019c.mo23208T());
        if (this.f10019c.mo31657k2().mo31667f()) {
            m15997r0(true);
        } else {
            m15997r0(false);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: B0 */
    public void m15973B0(ImageView imageView, int i) {
        imageView.post(new C5095d(imageView, i));
    }

    /* access modifiers changed from: private */
    /* renamed from: C0 */
    public void m15974C0() {
        this.f10025i = 1;
        this.mMainLampPrompt.setVisibility(0);
        this.mAmbientLampPrompt.setVisibility(4);
        this.mMainLampText.setChecked(true);
        this.mAmbientLampText.setChecked(false);
        this.mBrightnessSeekBar.setEosProLampMode(this.f10025i);
        this.mModeSelection.mo36361q(this.f10019c.mo23185G(), this.f10025i);
        this.mFavoriteSceneViewBar.mo36248v(this.f10025i, this.f10019c.mo23208T());
        if (this.f10019c.mo31657k2().mo31669h()) {
            m15997r0(true);
        } else {
            m15997r0(false);
        }
    }

    /* renamed from: q0 */
    private boolean m15996q0(String str) {
        return ContextCompat.checkSelfPermission(this, str) != 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: r0 */
    public void m15997r0(boolean z) {
        this.mImageLeft.post(new C5094c(z));
    }

    /* access modifiers changed from: private */
    /* renamed from: s0 */
    public /* synthetic */ void m15998s0() {
        this.f10024h = true;
        this.f10018b = this.f10019c.mo23195M();
        C5111t tVar = this.f10017a;
        if (tVar != null) {
            tVar.notifyDataSetChanged();
        }
    }

    /* renamed from: t0 */
    private void m15999t0(String str) {
        this.mBrightnessSeekBar.setDeviceId(str);
        this.mFavoriteSceneViewBar.setDeviceId(str);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001c, code lost:
        if (m15996q0(r1) != false) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0025, code lost:
        if (m15996q0(r1) != false) goto L_0x0027;
     */
    /* renamed from: u0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m16000u0() {
        /*
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r1 = "android.permission.CAMERA"
            boolean r2 = r3.m15996q0(r1)
            if (r2 == 0) goto L_0x0010
            r0.add(r1)
        L_0x0010:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 33
            if (r1 >= r2) goto L_0x001f
            java.lang.String r1 = "android.permission.READ_EXTERNAL_STORAGE"
            boolean r2 = r3.m15996q0(r1)
            if (r2 == 0) goto L_0x002a
            goto L_0x0027
        L_0x001f:
            java.lang.String r1 = "android.permission.READ_MEDIA_IMAGES"
            boolean r2 = r3.m15996q0(r1)
            if (r2 == 0) goto L_0x002a
        L_0x0027:
            r0.add(r1)
        L_0x002a:
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x0034
            r3.m16004y0()
            goto L_0x0040
        L_0x0034:
            r1 = 0
            java.lang.String[] r2 = new java.lang.String[r1]
            java.lang.Object[] r0 = r0.toArray(r2)
            java.lang.String[] r0 = (java.lang.String[]) r0
            androidx.core.app.ActivityCompat.requestPermissions(r3, r0, r1)
        L_0x0040:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.cherry.p141ui.activity.ComboDeviceControlActivity.m16000u0():void");
    }

    /* access modifiers changed from: private */
    /* renamed from: v0 */
    public void m16001v0(C8321m mVar) {
        C3112v.m8242u().mo23552A(mVar, new C5100i());
    }

    /* access modifiers changed from: private */
    /* renamed from: w0 */
    public void m16002w0(boolean z) {
        ObjectAnimator objectAnimator;
        Animator.AnimatorListener animatorListener;
        if (z) {
            objectAnimator = ObjectAnimator.ofFloat(this.mLayoutAnimation, "translationY", new float[]{0.0f, (float) this.mMoreLayout.getHeight()}).setDuration(300);
            objectAnimator.setInterpolator(new AccelerateInterpolator());
            objectAnimator.start();
            ObjectAnimator.ofFloat(this.mImageRight, Key.ROTATION, new float[]{180.0f, 0.0f}).setDuration(20).start();
            ObjectAnimator.ofFloat(this.mLayoutShadows, "alpha", new float[]{1.0f, 0.0f}).setDuration(300).start();
            animatorListener = new C5096e();
        } else {
            this.mLayoutShadows.setVisibility(0);
            objectAnimator = ObjectAnimator.ofFloat(this.mLayoutAnimation, "translationY", new float[]{(float) this.mMoreLayout.getHeight(), 0.0f}).setDuration(300);
            objectAnimator.setInterpolator(new DecelerateInterpolator());
            objectAnimator.start();
            ObjectAnimator.ofFloat(this.mImageRight, Key.ROTATION, new float[]{0.0f, 180.0f}).setDuration(20).start();
            ObjectAnimator.ofFloat(this.mLayoutShadows, "alpha", new float[]{0.0f, 1.0f}).setDuration(300).start();
            animatorListener = new C5097f();
        }
        objectAnimator.addListener(animatorListener);
    }

    /* access modifiers changed from: private */
    /* renamed from: x0 */
    public void m16003x0() {
        C9113d b = new C9113d.C9118e(this).mo37179i(getText(2131756233).toString()).mo37177g(getText(2131756205).toString()).mo37181k(true).mo37172b();
        b.mo37156g(-2, getText(2131755147).toString(), new C5098g(this, b));
        b.mo37156g(-1, getText(2131755281).toString(), new C5099h(b, this.f10025i == 2 ? this.f10019c.mo31656j2() : this.f10019c.mo23220c0()));
        b.setCancelable(true);
        b.mo37153c().addTextChangedListener(new C9183a0(20, b.mo37153c()));
        b.show();
        b.mo37164o();
    }

    /* renamed from: y0 */
    private void m16004y0() {
        Intent intent = new Intent(this, CaptureActivity.class);
        intent.putExtra("com.yeelight.cherry.device_id", this.f10019c.mo23185G());
        startActivity(intent);
    }

    /* renamed from: z0 */
    private void m16005z0() {
        this.mModeSelection.mo36365v();
        this.mBrightnessSeekBar.mo36110i();
    }

    /* renamed from: I */
    public void mo23265I() {
        finish();
    }

    /* renamed from: i */
    public void mo23294i(int i) {
    }

    /* renamed from: j */
    public void mo23296j() {
    }

    public void onBackPressed() {
        boolean z = this.f10021e;
        if (z) {
            m16002w0(z);
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
        mo35653P();
        C9193k.m22157h(true, this);
        setContentView(C12228R$layout.activity_control_view_eos_pro);
        ButterKnife.bind((Activity) this);
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            AppUtils.m8302w(f10015k, "Activity has not device id", false);
            finish();
            return;
        }
        this.f10019c = (C6091a) YeelightDeviceManager.m7804r0(intent.getStringExtra("com.yeelight.cherry.device_id"));
        this.f10022f = getIntent().getBooleanExtra("scene_bundle_item", false);
        this.f10023g = getIntent().getBooleanExtra("set_device_default", false);
        C6091a aVar = this.f10019c;
        if (aVar == null || !aVar.mo23145k0()) {
            BaseActivity.m19947U(this);
            finish();
            return;
        }
        this.mImgBack.setOnClickListener(new C5102k());
        this.mImgMore.setOnClickListener(new C5103l());
        this.f10018b = this.f10019c.mo23195M();
        C5111t tVar = new C5111t(this, (C5102k) null);
        this.f10017a = tVar;
        this.mFunctionGridView.setAdapter(tVar);
        if (this.f10019c.mo23197N() == null) {
            this.f10019c.mo23169y0();
        }
        this.mMoreLayout.post(new C5104m());
        this.mLayoutShadows.setOnClickListener(new C5105n());
        this.mLayoutLeft.setOnClickListener(new C5106o());
        m15997r0(this.f10019c.mo31657k2().mo31669h());
        this.mMainLampText.setChecked(true);
        this.mMainLampPrompt.setVisibility(0);
        this.mAmbientLampText.setChecked(false);
        this.mAmbientLampPrompt.setVisibility(4);
        this.mMainLampLayout.setOnClickListener(new C5107p());
        this.mAmbientLampLayout.setOnClickListener(new C5108q());
        this.mLayoutMiddle.setOnClickListener(new C5109r());
        this.mLayoutRight.setOnClickListener(new C5110s());
        if (this.f10022f || this.f10023g) {
            this.mLayoutMiddle.setClickable(false);
            this.mImageMiddle.setAlpha(0.3f);
            this.mLayoutRight.setClickable(false);
            this.mImageRight.setAlpha(0.3f);
            this.mTitleBarRightText.setVisibility(0);
            this.mImgMore.setVisibility(8);
            this.mTitleBarRightText.setText(getString(2131755309));
            this.mTitleBarRightText.setTextColor(getResources().getColor(2131099842));
            this.mTitleBarRightText.setOnClickListener(new C5092a());
        }
        this.f10019c.mo23171z0(this);
        this.mModeSelection.setBrightnessSeekbarView(this.mBrightnessSeekBar);
        this.mMoreLayout.addOnLayoutChangeListener(new C5093b());
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        this.f10026j.removeCallbacksAndMessages((Object) null);
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

    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 0) {
            boolean z = false;
            if (iArr.length > 0) {
                int length = iArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        z = true;
                        break;
                    } else if (iArr[i2] != 0) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            if (z) {
                m16004y0();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        if (this.f10025i == 2) {
            m15972A0();
        } else {
            m15974C0();
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        C6091a aVar = (C6091a) YeelightDeviceManager.m7804r0(getIntent().getStringExtra("com.yeelight.cherry.device_id"));
        this.f10019c = aVar;
        if (aVar == null) {
            finish();
            return;
        }
        aVar.mo23171z0(this);
        this.f10019c.mo31657k2().mo31670i(this);
        this.f10019c.mo23178B0(this);
        C8272e.m19511b().mo35210j(this);
        m15999t0(this.f10019c.mo23185G());
    }

    public void onStatusChange(int i, DeviceStatusBase deviceStatusBase) {
        if (i == 256) {
            this.f10026j.postDelayed(new C5860z(this), 100);
        }
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        m16005z0();
        C8272e.m19511b().mo35212m(this);
        C6091a aVar = this.f10019c;
        if (aVar != null) {
            aVar.mo23133V0(this);
            this.f10019c.mo23213W0(this);
        }
        if (this.f10021e) {
            this.mLayoutAnimation.setTranslationY((float) this.mMoreLayout.getHeight());
            this.mImageRight.setRotation(0.0f);
            this.mLayoutShadows.setVisibility(8);
            this.f10021e = false;
        }
        C6091a aVar2 = this.f10019c;
        if (aVar2 instanceof C6091a) {
            aVar2.mo31657k2().mo31680s(this);
        }
    }

    /* renamed from: p */
    public void mo30241p(int i, C6092b bVar) {
        if (i != 524288) {
            if (i != 1048576) {
                if (i != 2097152) {
                    if (!(i == 4194304 && this.f10025i == 2)) {
                        return;
                    }
                } else if (this.f10025i != 2) {
                    return;
                }
            } else if (this.f10025i != 1) {
                return;
            }
            m15997r0(false);
            return;
        } else if (this.f10025i != 1) {
            return;
        }
        m15997r0(true);
    }

    /* renamed from: v */
    public void mo23318v() {
    }
}
