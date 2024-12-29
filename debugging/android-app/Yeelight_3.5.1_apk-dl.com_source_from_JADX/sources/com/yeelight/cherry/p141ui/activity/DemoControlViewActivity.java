package com.yeelight.cherry.p141ui.activity;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.LightingColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
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
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.constraintlayout.motion.widget.Key;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import butterknife.BindView;
import com.yeelight.yeelib.device.C6119c;
import com.yeelight.yeelib.device.C6169f;
import com.yeelight.yeelib.device.WifiDeviceBase;
import com.yeelight.yeelib.device.base.C3010c;
import com.yeelight.yeelib.device.base.C3012e;
import com.yeelight.yeelib.device.base.C6093d;
import com.yeelight.yeelib.device.base.DeviceStatusBase;
import com.yeelight.yeelib.managers.C3088r;
import com.yeelight.yeelib.managers.C8272e;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.models.C3112v;
import com.yeelight.yeelib.models.C8321m;
import com.yeelight.yeelib.p142ui.activity.BaseActivity;
import com.yeelight.yeelib.p142ui.activity.SceneActivity;
import com.yeelight.yeelib.p142ui.activity.YeelightWebviewActivity;
import com.yeelight.yeelib.p142ui.view.BrightnessSeekBarView;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;
import com.yeelight.yeelib.p142ui.view.FavoriteSceneViewBar;
import com.yeelight.yeelib.p142ui.view.ModeSelectionViewNew;
import com.yeelight.yeelib.pickcolor.CaptureActivity;
import com.yeelight.yeelib.utils.AppUtils;
import java.util.List;
import p051j4.C3278f;
import p051j4.C3284x;
import p051j4.C9183a0;
import p051j4.C9197p;
import p134c4.C4007b;
import p170i4.C9113d;
import p170i4.C9119e;
import p237z3.C12143c;
import p237z3.C12145e;

/* renamed from: com.yeelight.cherry.ui.activity.DemoControlViewActivity */
public class DemoControlViewActivity extends BaseActivity implements C12145e, C12143c, C8272e.C3063a {

    /* renamed from: o */
    private static final String f10264o = "DemoControlViewActivity";

    /* renamed from: p */
    public static final /* synthetic */ int f10265p = 0;

    /* renamed from: a */
    private C5239z f10266a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public List<C6093d> f10267b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C3012e f10268c;

    /* renamed from: d */
    private C9119e f10269d;

    /* renamed from: e */
    private boolean f10270e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public long f10271f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public boolean f10272g = false;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public boolean f10273h = false;

    /* renamed from: i */
    private boolean f10274i = false;

    /* renamed from: j */
    private boolean f10275j = false;

    /* renamed from: k */
    private boolean f10276k = false;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public boolean f10277l = false;

    /* renamed from: m */
    private boolean f10278m = false;
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
    @BindView(2131297136)
    ModeSelectionViewNew mModeSelection;
    @BindView(2131296587)
    LinearLayout mMoreLayout;
    @BindView(2131297591)
    CommonTitleBar mTitleBar;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public Handler f10279n = new C5227q();

    /* renamed from: com.yeelight.cherry.ui.activity.DemoControlViewActivity$a */
    class C5209a implements View.OnClickListener {
        C5209a() {
        }

        public void onClick(View view) {
            if (DemoControlViewActivity.this.f10268c.mo23146k1()) {
                DemoControlViewActivity.this.m16129B0();
                return;
            }
            DemoControlViewActivity.this.f10279n.removeMessages(0);
            DemoControlViewActivity.this.f10279n.sendEmptyMessageDelayed(0, 500);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.DemoControlViewActivity$a0 */
    private class C5210a0 implements C12145e {

        /* renamed from: a */
        public ImageView f10281a;

        /* renamed from: b */
        public TextView f10282b;

        /* renamed from: c */
        public TextView f10283c;

        /* renamed from: d */
        public LinearLayout f10284d;

        /* renamed from: e */
        public int f10285e;

        /* renamed from: com.yeelight.cherry.ui.activity.DemoControlViewActivity$a0$a */
        class C5211a implements Runnable {
            C5211a() {
            }

            public void run() {
                if (DemoControlViewActivity.this.f10268c != null && DemoControlViewActivity.this.f10268c.mo23195M() != null) {
                    for (C6093d next : DemoControlViewActivity.this.f10268c.mo23195M()) {
                        if (next.mo31684d() == C5210a0.this.f10285e) {
                            if (next.mo31690j()) {
                                C5210a0 a0Var = C5210a0.this;
                                a0Var.f10282b.setBackgroundColor(DemoControlViewActivity.this.getResources().getColor(2131099809));
                            } else {
                                C5210a0.this.f10282b.setBackgroundColor(-3355444);
                            }
                        }
                    }
                }
            }
        }

        private C5210a0() {
        }

        /* synthetic */ C5210a0(DemoControlViewActivity demoControlViewActivity, C5221k kVar) {
            this();
        }

        public void onStatusChange(int i, DeviceStatusBase deviceStatusBase) {
            if (i == 4096) {
                DemoControlViewActivity.this.runOnUiThread(new C5211a());
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.DemoControlViewActivity$b */
    class C5212b implements View.OnClickListener {
        C5212b() {
        }

        public void onClick(View view) {
            if (System.currentTimeMillis() - DemoControlViewActivity.this.f10271f >= 300) {
                long unused = DemoControlViewActivity.this.f10271f = System.currentTimeMillis();
                DemoControlViewActivity demoControlViewActivity = DemoControlViewActivity.this;
                demoControlViewActivity.m16128A0(demoControlViewActivity.f10272g);
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.DemoControlViewActivity$c */
    class C5213c implements View.OnClickListener {
        C5213c() {
        }

        public void onClick(View view) {
            if (DemoControlViewActivity.this.f10277l) {
                if (DemoControlViewActivity.this.f10268c.mo23221d0().mo31562S()) {
                    DemoControlViewActivity.this.f10279n.removeMessages(1);
                    DemoControlViewActivity.this.f10279n.sendEmptyMessageDelayed(1, 500);
                    return;
                } else if (!DemoControlViewActivity.this.f10268c.mo23221d0().mo31584d0()) {
                    DemoControlViewActivity.this.mo35655S(2131756202);
                    return;
                }
            }
            DemoControlViewActivity demoControlViewActivity = DemoControlViewActivity.this;
            demoControlViewActivity.setResult(-1, demoControlViewActivity.getIntent());
            DemoControlViewActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.DemoControlViewActivity$d */
    class C5214d implements View.OnLayoutChangeListener {
        C5214d() {
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            if (DemoControlViewActivity.this.f10273h) {
                boolean unused = DemoControlViewActivity.this.f10273h = false;
                if (DemoControlViewActivity.this.f10272g) {
                    boolean unused2 = DemoControlViewActivity.this.f10272g = false;
                    DemoControlViewActivity demoControlViewActivity = DemoControlViewActivity.this;
                    demoControlViewActivity.m16128A0(demoControlViewActivity.f10272g);
                    return;
                }
                DemoControlViewActivity demoControlViewActivity2 = DemoControlViewActivity.this;
                demoControlViewActivity2.mLayoutAnimation.setTranslationY((float) demoControlViewActivity2.mMoreLayout.getHeight());
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.DemoControlViewActivity$e */
    class C5215e implements C4007b<String> {
        C5215e(DemoControlViewActivity demoControlViewActivity) {
        }

        /* renamed from: b */
        public void mo23338a(String str) {
        }

        public void onFailure(int i, String str) {
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.DemoControlViewActivity$f */
    class C5216f implements DialogInterface.OnClickListener {
        C5216f() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            DemoControlViewActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.DemoControlViewActivity$g */
    class C5217g implements DialogInterface.OnClickListener {
        C5217g() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            Intent intent = new Intent();
            intent.setClass(DemoControlViewActivity.this, FirmwareUpgradeActivity.class);
            intent.putExtra("com.yeelight.cherry.device_id", DemoControlViewActivity.this.f10268c.mo23185G());
            DemoControlViewActivity.this.startActivity(intent);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.DemoControlViewActivity$h */
    class C5218h implements View.OnClickListener {
        C5218h() {
        }

        public void onClick(View view) {
            DemoControlViewActivity demoControlViewActivity;
            boolean z;
            if (DemoControlViewActivity.this.f10268c.mo23146k1()) {
                DemoControlViewActivity.this.f10268c.mo23140b1();
                demoControlViewActivity = DemoControlViewActivity.this;
                z = false;
            } else {
                DemoControlViewActivity.this.f10268c.mo23148l1();
                demoControlViewActivity = DemoControlViewActivity.this;
                z = true;
            }
            demoControlViewActivity.m16155r0(z);
            C3284x.m8852b();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.DemoControlViewActivity$i */
    class C5219i implements Runnable {

        /* renamed from: a */
        final /* synthetic */ boolean f10294a;

        C5219i(boolean z) {
            this.f10294a = z;
        }

        public void run() {
            if (this.f10294a) {
                DemoControlViewActivity demoControlViewActivity = DemoControlViewActivity.this;
                demoControlViewActivity.m16132E0(demoControlViewActivity.mImageLeft, 2131231247);
                return;
            }
            DemoControlViewActivity.this.mImageLeft.setBackgroundResource(2131231247);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.DemoControlViewActivity$j */
    class C5220j implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ImageView f10296a;

        /* renamed from: b */
        final /* synthetic */ int f10297b;

        C5220j(ImageView imageView, int i) {
            this.f10296a = imageView;
            this.f10297b = i;
        }

        public void run() {
            LightingColorFilter lightingColorFilter = new LightingColorFilter(ViewCompat.MEASURED_STATE_MASK, DemoControlViewActivity.this.getResources().getColor(2131099805));
            Drawable drawable = this.f10296a.getContext().getResources().getDrawable(this.f10297b);
            drawable.clearColorFilter();
            drawable.mutate().setColorFilter(lightingColorFilter);
            this.f10296a.setBackground(drawable);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.DemoControlViewActivity$k */
    class C5221k implements View.OnClickListener {
        C5221k() {
        }

        public void onClick(View view) {
            DemoControlViewActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.DemoControlViewActivity$l */
    class C5222l implements Animator.AnimatorListener {
        C5222l() {
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            DemoControlViewActivity.this.mLayoutShadows.setVisibility(8);
            DemoControlViewActivity demoControlViewActivity = DemoControlViewActivity.this;
            boolean unused = demoControlViewActivity.f10272g = !demoControlViewActivity.f10272g;
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.DemoControlViewActivity$m */
    class C5223m implements Animator.AnimatorListener {
        C5223m() {
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            DemoControlViewActivity demoControlViewActivity = DemoControlViewActivity.this;
            boolean unused = demoControlViewActivity.f10272g = !demoControlViewActivity.f10272g;
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
            DemoControlViewActivity.this.mLayoutShadows.setVisibility(0);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.DemoControlViewActivity$n */
    class C5224n implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C9113d f10302a;

        C5224n(DemoControlViewActivity demoControlViewActivity, C9113d dVar) {
            this.f10302a = dVar;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            this.f10302a.mo37154d();
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.DemoControlViewActivity$o */
    class C5225o implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C9113d f10303a;

        /* renamed from: b */
        final /* synthetic */ C8321m f10304b;

        C5225o(C9113d dVar, C8321m mVar) {
            this.f10303a = dVar;
            this.f10304b = mVar;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            if (!TextUtils.isEmpty(this.f10303a.mo37153c().getText().toString())) {
                if (this.f10304b != null) {
                    this.f10304b.mo35431P(this.f10303a.mo37153c().getText().toString().trim());
                    DemoControlViewActivity.this.m16162y0(this.f10304b);
                } else {
                    DemoControlViewActivity demoControlViewActivity = DemoControlViewActivity.this;
                    Toast.makeText(demoControlViewActivity, demoControlViewActivity.getText(2131756228).toString(), 0).show();
                }
                this.f10303a.mo37154d();
                dialogInterface.dismiss();
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.DemoControlViewActivity$p */
    class C5226p implements C3112v.C3119g {
        C5226p() {
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public /* synthetic */ void m16171c(String str) {
            Toast.makeText(DemoControlViewActivity.this.getApplicationContext(), str, 0).show();
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
            DemoControlViewActivity.this.runOnUiThread(new C5826s0(this, str));
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.DemoControlViewActivity$q */
    class C5227q extends Handler {
        C5227q() {
        }

        public void handleMessage(Message message) {
            DemoControlViewActivity demoControlViewActivity;
            int i;
            super.handleMessage(message);
            int i2 = message.what;
            if (i2 == 0) {
                demoControlViewActivity = DemoControlViewActivity.this;
                i = 2131756206;
            } else if (i2 == 1) {
                demoControlViewActivity = DemoControlViewActivity.this;
                i = 2131756203;
            } else {
                return;
            }
            Toast.makeText(demoControlViewActivity, demoControlViewActivity.getText(i).toString(), 0).show();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.DemoControlViewActivity$r */
    class C5228r implements View.OnClickListener {
        C5228r() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(DemoControlViewActivity.this, DeviceSettingActivity.class);
            intent.putExtra("com.yeelight.cherry.device_id", DemoControlViewActivity.this.f10268c.mo23185G());
            DemoControlViewActivity.this.startActivity(intent);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.DemoControlViewActivity$s */
    class C5229s implements Runnable {
        C5229s() {
        }

        public void run() {
            DemoControlViewActivity demoControlViewActivity = DemoControlViewActivity.this;
            demoControlViewActivity.mLayoutAnimation.setTranslationY((float) demoControlViewActivity.mMoreLayout.getHeight());
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.DemoControlViewActivity$t */
    class C5230t implements View.OnClickListener {
        C5230t() {
        }

        public void onClick(View view) {
            if (System.currentTimeMillis() - DemoControlViewActivity.this.f10271f >= 300) {
                long unused = DemoControlViewActivity.this.f10271f = System.currentTimeMillis();
                if (DemoControlViewActivity.this.f10272g) {
                    DemoControlViewActivity demoControlViewActivity = DemoControlViewActivity.this;
                    demoControlViewActivity.m16128A0(demoControlViewActivity.f10272g);
                }
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.DemoControlViewActivity$u */
    class C5231u implements View.OnClickListener {
        C5231u() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(DemoControlViewActivity.this, SceneActivity.class);
            intent.putExtra("com.yeelight.cherry.device_id", DemoControlViewActivity.this.f10268c.mo23185G());
            DemoControlViewActivity.this.startActivity(intent);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.DemoControlViewActivity$v */
    class C5232v implements View.OnClickListener {

        /* renamed from: com.yeelight.cherry.ui.activity.DemoControlViewActivity$v$a */
        class C5233a implements DialogInterface.OnClickListener {
            C5233a(C5232v vVar) {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        }

        /* renamed from: com.yeelight.cherry.ui.activity.DemoControlViewActivity$v$b */
        class C5234b implements DialogInterface.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C6169f f10313a;

            C5234b(C6169f fVar) {
                this.f10313a = fVar;
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                Intent intent = new Intent(DemoControlViewActivity.this, ImageModeSelectionActivity.class);
                intent.putExtra("image_type", 3);
                intent.putExtra("com.yeelight.cherry.room_id", this.f10313a.mo23185G());
                DemoControlViewActivity.this.startActivity(intent);
                dialogInterface.dismiss();
            }
        }

        /* renamed from: com.yeelight.cherry.ui.activity.DemoControlViewActivity$v$c */
        class C5235c implements DialogInterface.OnClickListener {
            C5235c(C5232v vVar) {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        }

        C5232v() {
        }

        public void onClick(View view) {
            C6169f fVar = (C6169f) DemoControlViewActivity.this.f10268c;
            int i = 0;
            for (C3010c next : fVar.mo31753K1()) {
                if ((next instanceof WifiDeviceBase) && next.mo23230o0()) {
                    i++;
                }
            }
            if (i == fVar.mo31753K1().size()) {
                Intent intent = new Intent(DemoControlViewActivity.this, ImageModeSelectionActivity.class);
                intent.putExtra("image_type", 3);
                intent.putExtra("com.yeelight.cherry.room_id", fVar.mo23185G());
                DemoControlViewActivity.this.startActivity(intent);
                return;
            }
            (i > 0 ? new C9113d.C9118e(DemoControlViewActivity.this).mo37178h(2131755279).mo37177g(DemoControlViewActivity.this.getString(2131756193)).mo37174d(-1, DemoControlViewActivity.this.getString(2131755281), new C5234b(fVar)).mo37174d(-2, DemoControlViewActivity.this.getString(2131755232), new C5233a(this)) : new C9113d.C9118e(DemoControlViewActivity.this).mo37179i(DemoControlViewActivity.this.getString(2131756178)).mo37177g(DemoControlViewActivity.this.getString(2131756193)).mo37174d(-1, DemoControlViewActivity.this.getString(2131755281), new C5235c(this))).mo37172b().show();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.DemoControlViewActivity$w */
    class C5236w implements View.OnClickListener {
        C5236w() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(DemoControlViewActivity.this, SceneActivity.class);
            intent.putExtra("com.yeelight.cherry.device_id", DemoControlViewActivity.this.f10268c.mo23185G());
            DemoControlViewActivity.this.startActivity(intent);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.DemoControlViewActivity$x */
    class C5237x implements View.OnClickListener {
        C5237x() {
        }

        public void onClick(View view) {
            if (System.currentTimeMillis() - DemoControlViewActivity.this.f10271f >= 300) {
                long unused = DemoControlViewActivity.this.f10271f = System.currentTimeMillis();
                DemoControlViewActivity demoControlViewActivity = DemoControlViewActivity.this;
                demoControlViewActivity.m16128A0(demoControlViewActivity.f10272g);
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.DemoControlViewActivity$y */
    class C5238y implements View.OnClickListener {
        C5238y() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(DemoControlViewActivity.this, SceneActivity.class);
            intent.putExtra("com.yeelight.cherry.device_id", DemoControlViewActivity.this.f10268c.mo23185G());
            DemoControlViewActivity.this.startActivity(intent);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.DemoControlViewActivity$z */
    private class C5239z extends BaseAdapter {
        private C5239z() {
        }

        /* synthetic */ C5239z(DemoControlViewActivity demoControlViewActivity, C5221k kVar) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m16177b(int i, View view) {
            Class<CaptureActivity> h = ((C6093d) DemoControlViewActivity.this.f10267b.get(i)).mo31688h();
            if (h == null) {
                return;
            }
            if (h == CaptureActivity.class) {
                DemoControlViewActivity.this.m16161x0();
                return;
            }
            DemoControlViewActivity demoControlViewActivity = DemoControlViewActivity.this;
            ((C6093d) DemoControlViewActivity.this.f10267b.get(i)).mo31695o(demoControlViewActivity, demoControlViewActivity.f10268c.mo23185G());
        }

        public int getCount() {
            return DemoControlViewActivity.this.f10267b == null ? 0 : 9;
        }

        public Object getItem(int i) {
            return null;
        }

        public long getItemId(int i) {
            return 0;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            C5210a0 a0Var;
            int i2;
            TextView textView;
            if (i >= DemoControlViewActivity.this.f10267b.size()) {
                return LayoutInflater.from(DemoControlViewActivity.this).inflate(2131493106, (ViewGroup) null);
            }
            if (view == null || view.getTag() == null) {
                a0Var = new C5210a0(DemoControlViewActivity.this, (C5221k) null);
                view = LayoutInflater.from(DemoControlViewActivity.this).inflate(2131493107, (ViewGroup) null);
                view.setTag(a0Var);
            } else {
                a0Var = (C5210a0) view.getTag();
            }
            a0Var.f10285e = ((C6093d) DemoControlViewActivity.this.f10267b.get(i)).mo31684d();
            a0Var.f10281a = (ImageView) view.findViewById(2131296819);
            a0Var.f10282b = (TextView) view.findViewById(2131296816);
            a0Var.f10283c = (TextView) view.findViewById(2131296820);
            a0Var.f10284d = (LinearLayout) view.findViewById(2131296828);
            a0Var.f10283c.setText(((C6093d) DemoControlViewActivity.this.f10267b.get(i)).mo31687g());
            if (((C6093d) DemoControlViewActivity.this.f10267b.get(i)).mo31692l()) {
                a0Var.f10282b.setVisibility(0);
                if (((C6093d) DemoControlViewActivity.this.f10267b.get(i)).mo31690j()) {
                    textView = a0Var.f10282b;
                    i2 = DemoControlViewActivity.this.getResources().getColor(2131099809);
                } else {
                    textView = a0Var.f10282b;
                    i2 = -3355444;
                }
                textView.setBackgroundColor(i2);
                DemoControlViewActivity.this.f10268c.mo23178B0(a0Var);
            } else {
                a0Var.f10282b.setVisibility(4);
                DemoControlViewActivity.this.f10268c.mo23213W0(a0Var);
            }
            a0Var.f10281a.setBackgroundResource(((C6093d) DemoControlViewActivity.this.f10267b.get(i)).mo31686f());
            a0Var.f10284d.setOnClickListener(new C5831t0(this, i));
            return view;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: A0 */
    public void m16128A0(boolean z) {
        ObjectAnimator objectAnimator;
        Animator.AnimatorListener animatorListener;
        if (z) {
            objectAnimator = ObjectAnimator.ofFloat(this.mLayoutAnimation, "translationY", new float[]{0.0f, (float) this.mMoreLayout.getHeight()}).setDuration(300);
            objectAnimator.setInterpolator(new AccelerateInterpolator());
            objectAnimator.start();
            ObjectAnimator.ofFloat(this.mImageRight, Key.ROTATION, new float[]{180.0f, 0.0f}).setDuration(20).start();
            ObjectAnimator.ofFloat(this.mLayoutShadows, "alpha", new float[]{1.0f, 0.0f}).setDuration(300).start();
            animatorListener = new C5222l();
        } else {
            this.mLayoutShadows.setVisibility(0);
            objectAnimator = ObjectAnimator.ofFloat(this.mLayoutAnimation, "translationY", new float[]{(float) this.mMoreLayout.getHeight(), 0.0f}).setDuration(300);
            objectAnimator.setInterpolator(new DecelerateInterpolator());
            objectAnimator.start();
            ObjectAnimator.ofFloat(this.mImageRight, Key.ROTATION, new float[]{0.0f, 180.0f}).setDuration(20).start();
            ObjectAnimator.ofFloat(this.mLayoutShadows, "alpha", new float[]{0.0f, 1.0f}).setDuration(300).start();
            animatorListener = new C5223m();
        }
        objectAnimator.addListener(animatorListener);
    }

    /* access modifiers changed from: private */
    /* renamed from: B0 */
    public void m16129B0() {
        C9113d b = new C9113d.C9118e(this).mo37179i(getText(2131756233).toString()).mo37177g(getText(2131756205).toString()).mo37181k(true).mo37172b();
        b.mo37156g(-2, getText(2131755232).toString(), new C5224n(this, b));
        b.mo37156g(-1, getText(2131755281).toString(), new C5225o(b, this.f10268c.mo23220c0()));
        b.setCancelable(true);
        b.mo37153c().addTextChangedListener(new C9183a0(20, b.mo37153c()));
        b.show();
        b.mo37164o();
    }

    /* renamed from: C0 */
    private void m16130C0() {
        Intent intent = new Intent(this, CaptureActivity.class);
        intent.putExtra("com.yeelight.cherry.device_id", this.f10268c.mo23185G());
        startActivity(intent);
    }

    /* renamed from: D0 */
    private void m16131D0() {
        this.mModeSelection.mo36365v();
        this.mBrightnessSeekBar.mo36110i();
    }

    /* access modifiers changed from: private */
    /* renamed from: E0 */
    public void m16132E0(ImageView imageView, int i) {
        imageView.post(new C5220j(imageView, i));
    }

    /* renamed from: q0 */
    private boolean m16154q0(String str) {
        return ContextCompat.checkSelfPermission(this, str) != 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: r0 */
    public void m16155r0(boolean z) {
        this.mImageLeft.post(new C5219i(z));
    }

    /* access modifiers changed from: private */
    /* renamed from: s0 */
    public /* synthetic */ void m16156s0(View view) {
        Intent intent = new Intent(this, YeelightWebviewActivity.class);
        intent.putExtra("url_index", 27);
        startActivity(intent);
    }

    /* access modifiers changed from: private */
    /* renamed from: u0 */
    public /* synthetic */ void m16158u0() {
        this.f10273h = true;
        this.f10267b = this.f10268c.mo23195M();
        C5239z zVar = this.f10266a;
        if (zVar != null) {
            zVar.notifyDataSetChanged();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: v0 */
    public /* synthetic */ void m16159v0(View view) {
        Intent intent = new Intent(this, YeelightWebviewActivity.class);
        intent.putExtra("url_index", 27);
        startActivity(intent);
    }

    /* renamed from: w0 */
    private void m16160w0(C3010c cVar, String str) {
        if (YeelightDeviceManager.m7794j0(cVar.mo23185G()) == null) {
            String str2 = f10264o;
            C3278f.m8797b(new AppUtils.SuicideException(str2, "Device is null! Fix me! device id: " + cVar.mo23185G() + ", debugDid: " + str + ", device model: " + cVar.mo23208T()));
            return;
        }
        this.mModeSelection.setDeviceId(cVar.mo23185G());
        this.mBrightnessSeekBar.setDeviceId(cVar.mo23185G());
        this.mFavoriteSceneViewBar.setDeviceId(cVar.mo23185G());
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001c, code lost:
        if (m16154q0(r1) != false) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0025, code lost:
        if (m16154q0(r1) != false) goto L_0x0027;
     */
    /* renamed from: x0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m16161x0() {
        /*
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r1 = "android.permission.CAMERA"
            boolean r2 = r3.m16154q0(r1)
            if (r2 == 0) goto L_0x0010
            r0.add(r1)
        L_0x0010:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 33
            if (r1 >= r2) goto L_0x001f
            java.lang.String r1 = "android.permission.READ_EXTERNAL_STORAGE"
            boolean r2 = r3.m16154q0(r1)
            if (r2 == 0) goto L_0x002a
            goto L_0x0027
        L_0x001f:
            java.lang.String r1 = "android.permission.READ_MEDIA_IMAGES"
            boolean r2 = r3.m16154q0(r1)
            if (r2 == 0) goto L_0x002a
        L_0x0027:
            r0.add(r1)
        L_0x002a:
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x0034
            r3.m16130C0()
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
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.cherry.p141ui.activity.DemoControlViewActivity.m16161x0():void");
    }

    /* access modifiers changed from: private */
    /* renamed from: y0 */
    public void m16162y0(C8321m mVar) {
        C3112v.m8242u().mo23552A(mVar, new C5226p());
    }

    /* access modifiers changed from: private */
    /* renamed from: z0 */
    public void m16157t0() {
        C9119e eVar = new C9119e(this);
        this.f10269d = eVar;
        eVar.mo37182b(new C5811p0(this));
        this.f10269d.show();
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
        boolean z = this.f10272g;
        if (z) {
            m16128A0(z);
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
    /* JADX WARNING: Removed duplicated region for block: B:37:0x01db  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r6) {
        /*
            r5 = this;
            super.onCreate(r6)
            r5.mo35653P()
            r6 = 1
            p051j4.C9193k.m22157h(r6, r5)
            r0 = 2131492916(0x7f0c0034, float:1.8609297E38)
            r5.setContentView(r0)
            butterknife.ButterKnife.bind((android.app.Activity) r5)
            android.content.Intent r0 = r5.getIntent()
            java.lang.String r1 = "com.yeelight.cherry.device_id"
            boolean r2 = r0.hasExtra(r1)
            r3 = 0
            if (r2 != 0) goto L_0x002b
            java.lang.String r6 = f10264o
            java.lang.String r0 = "Activity has not device id"
            com.yeelight.yeelib.utils.AppUtils.m8302w(r6, r0, r3)
            r5.finish()
            return
        L_0x002b:
            java.lang.String r1 = r0.getStringExtra(r1)
            java.lang.String r2 = "google_home_hint_key"
            boolean r0 = r0.getBooleanExtra(r2, r3)
            r5.f10270e = r0
            com.yeelight.yeelib.device.base.e r0 = com.yeelight.yeelib.managers.YeelightDeviceManager.m7804r0(r1)
            r5.f10268c = r0
            android.content.Intent r0 = r5.getIntent()
            java.lang.String r1 = "room_flag"
            boolean r0 = r0.getBooleanExtra(r1, r3)
            r5.f10275j = r0
            android.content.Intent r0 = r5.getIntent()
            java.lang.String r1 = "group_flag"
            boolean r0 = r0.getBooleanExtra(r1, r3)
            r5.f10276k = r0
            android.content.Intent r0 = r5.getIntent()
            java.lang.String r1 = "mesh_group_flag"
            boolean r0 = r0.getBooleanExtra(r1, r3)
            r5.f10278m = r0
            android.content.Intent r0 = r5.getIntent()
            java.lang.String r1 = "scene_bundle_item"
            boolean r0 = r0.getBooleanExtra(r1, r3)
            r5.f10274i = r0
            android.content.Intent r0 = r5.getIntent()
            java.lang.String r1 = "set_device_default"
            boolean r0 = r0.getBooleanExtra(r1, r3)
            r5.f10277l = r0
            com.yeelight.yeelib.device.base.e r0 = r5.f10268c
            if (r0 == 0) goto L_0x01f2
            boolean r0 = r0.mo23145k0()
            if (r0 != 0) goto L_0x0085
            goto L_0x01f2
        L_0x0085:
            com.yeelight.yeelib.device.base.e r0 = r5.f10268c
            x3.f r0 = r0.mo23197N()
            if (r0 != 0) goto L_0x0092
            com.yeelight.yeelib.device.base.e r0 = r5.f10268c
            r0.mo23169y0()
        L_0x0092:
            com.yeelight.yeelib.ui.view.CommonTitleBar r0 = r5.mTitleBar
            com.yeelight.yeelib.device.base.e r1 = r5.f10268c
            java.lang.String r1 = r1.mo23210U()
            com.yeelight.cherry.ui.activity.DemoControlViewActivity$k r2 = new com.yeelight.cherry.ui.activity.DemoControlViewActivity$k
            r2.<init>()
            com.yeelight.cherry.ui.activity.DemoControlViewActivity$r r4 = new com.yeelight.cherry.ui.activity.DemoControlViewActivity$r
            r4.<init>()
            r0.mo36195a(r1, r2, r4)
            com.yeelight.yeelib.ui.view.CommonTitleBar r0 = r5.mTitleBar
            r1 = 16
            r0.setTitleTextSize(r1)
            com.yeelight.yeelib.device.base.e r0 = r5.f10268c
            java.lang.String r0 = r0.mo23208T()
            java.lang.String r1 = "yeelink.light.color6"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00cd
            boolean r0 = r5.f10277l
            if (r0 != 0) goto L_0x00cd
            com.yeelight.yeelib.ui.view.CommonTitleBar r0 = r5.mTitleBar
            r1 = 2131231518(0x7f08031e, float:1.807912E38)
            com.yeelight.cherry.ui.activity.o0 r2 = new com.yeelight.cherry.ui.activity.o0
            r2.<init>(r5)
            r0.mo36196b(r1, r2)
        L_0x00cd:
            com.yeelight.yeelib.device.base.e r0 = r5.f10268c
            boolean r1 = r0 instanceof com.yeelight.yeelib.device.C6119c
            if (r1 == 0) goto L_0x00d8
            com.yeelight.yeelib.device.c r0 = (com.yeelight.yeelib.device.C6119c) r0
            r0.mo31762T1()
        L_0x00d8:
            com.yeelight.yeelib.device.base.e r0 = r5.f10268c
            java.util.List r0 = r0.mo23195M()
            r5.f10267b = r0
            com.yeelight.cherry.ui.activity.DemoControlViewActivity$z r0 = new com.yeelight.cherry.ui.activity.DemoControlViewActivity$z
            r1 = 0
            r0.<init>(r5, r1)
            r5.f10266a = r0
            android.widget.GridView r1 = r5.mFunctionGridView
            r1.setAdapter(r0)
            android.widget.LinearLayout r0 = r5.mMoreLayout
            com.yeelight.cherry.ui.activity.DemoControlViewActivity$s r1 = new com.yeelight.cherry.ui.activity.DemoControlViewActivity$s
            r1.<init>()
            r0.post(r1)
            android.widget.LinearLayout r0 = r5.mLayoutShadows
            com.yeelight.cherry.ui.activity.DemoControlViewActivity$t r1 = new com.yeelight.cherry.ui.activity.DemoControlViewActivity$t
            r1.<init>()
            r0.setOnClickListener(r1)
            boolean r0 = r5.f10275j
            r1 = 1050253722(0x3e99999a, float:0.3)
            r2 = 2131231230(0x7f0801fe, float:1.8078535E38)
            r4 = 8
            if (r0 == 0) goto L_0x0134
            com.yeelight.yeelib.ui.view.CommonTitleBar r0 = r5.mTitleBar
            r0.setRightButtonVisibility(r4)
            android.widget.ImageView r0 = r5.mImageRight
            r0.setImageResource(r2)
            android.widget.ImageView r0 = r5.mImageMiddle
            r2 = 2131231242(0x7f08020a, float:1.807856E38)
            r0.setImageResource(r2)
            android.widget.LinearLayout r0 = r5.mLayoutRight
            com.yeelight.cherry.ui.activity.DemoControlViewActivity$u r2 = new com.yeelight.cherry.ui.activity.DemoControlViewActivity$u
            r2.<init>()
            r0.setOnClickListener(r2)
            android.widget.LinearLayout r0 = r5.mLayoutMiddle
            com.yeelight.cherry.ui.activity.DemoControlViewActivity$v r2 = new com.yeelight.cherry.ui.activity.DemoControlViewActivity$v
            r2.<init>()
        L_0x0130:
            r0.setOnClickListener(r2)
            goto L_0x0184
        L_0x0134:
            boolean r0 = r5.f10276k
            if (r0 == 0) goto L_0x014f
            android.widget.ImageView r0 = r5.mImageMiddle
            r0.setImageResource(r2)
            android.widget.LinearLayout r0 = r5.mLayoutMiddle
            com.yeelight.cherry.ui.activity.DemoControlViewActivity$w r2 = new com.yeelight.cherry.ui.activity.DemoControlViewActivity$w
            r2.<init>()
            r0.setOnClickListener(r2)
            android.widget.LinearLayout r0 = r5.mLayoutRight
            com.yeelight.cherry.ui.activity.DemoControlViewActivity$x r2 = new com.yeelight.cherry.ui.activity.DemoControlViewActivity$x
            r2.<init>()
            goto L_0x0130
        L_0x014f:
            boolean r0 = r5.f10278m
            if (r0 == 0) goto L_0x0172
            android.widget.ImageView r0 = r5.mImageMiddle
            r0.setImageResource(r2)
            android.widget.LinearLayout r0 = r5.mLayoutMiddle
            com.yeelight.cherry.ui.activity.DemoControlViewActivity$y r2 = new com.yeelight.cherry.ui.activity.DemoControlViewActivity$y
            r2.<init>()
            r0.setOnClickListener(r2)
            android.widget.LinearLayout r0 = r5.mLayoutRight
            r0.setClickable(r3)
            android.widget.ImageView r0 = r5.mImageRight
            r0.setAlpha(r1)
            com.yeelight.yeelib.ui.view.CommonTitleBar r0 = r5.mTitleBar
            r0.setRightButtonVisibility(r4)
            goto L_0x0184
        L_0x0172:
            android.widget.LinearLayout r0 = r5.mLayoutMiddle
            com.yeelight.cherry.ui.activity.DemoControlViewActivity$a r2 = new com.yeelight.cherry.ui.activity.DemoControlViewActivity$a
            r2.<init>()
            r0.setOnClickListener(r2)
            android.widget.LinearLayout r0 = r5.mLayoutRight
            com.yeelight.cherry.ui.activity.DemoControlViewActivity$b r2 = new com.yeelight.cherry.ui.activity.DemoControlViewActivity$b
            r2.<init>()
            goto L_0x0130
        L_0x0184:
            boolean r0 = r5.f10274i
            if (r0 != 0) goto L_0x018c
            boolean r0 = r5.f10277l
            if (r0 == 0) goto L_0x01d0
        L_0x018c:
            android.widget.LinearLayout r0 = r5.mLayoutMiddle
            r0.setClickable(r3)
            android.widget.ImageView r0 = r5.mImageMiddle
            r0.setAlpha(r1)
            android.widget.LinearLayout r0 = r5.mLayoutRight
            r0.setClickable(r3)
            android.widget.ImageView r0 = r5.mImageRight
            r0.setAlpha(r1)
            com.yeelight.yeelib.ui.view.CommonTitleBar r0 = r5.mTitleBar
            r0.setRightButtonVisibility(r4)
            com.yeelight.yeelib.ui.view.CommonTitleBar r0 = r5.mTitleBar
            r0.setRightTextVisible(r6)
            com.yeelight.yeelib.ui.view.CommonTitleBar r6 = r5.mTitleBar
            r0 = 2131755309(0x7f10012d, float:1.9141494E38)
            java.lang.String r0 = r5.getString(r0)
            r6.setRightTextStr(r0)
            com.yeelight.yeelib.ui.view.CommonTitleBar r6 = r5.mTitleBar
            android.content.res.Resources r0 = r5.getResources()
            r1 = 2131099842(0x7f0600c2, float:1.7812049E38)
            int r0 = r0.getColor(r1)
            r6.setRightTextColor(r0)
            com.yeelight.yeelib.ui.view.CommonTitleBar r6 = r5.mTitleBar
            com.yeelight.cherry.ui.activity.DemoControlViewActivity$c r0 = new com.yeelight.cherry.ui.activity.DemoControlViewActivity$c
            r0.<init>()
            r6.setRightButtonClickListener(r0)
        L_0x01d0:
            com.yeelight.yeelib.ui.view.ModeSelectionViewNew r6 = r5.mModeSelection
            com.yeelight.yeelib.ui.view.BrightnessSeekBarView r0 = r5.mBrightnessSeekBar
            r6.setBrightnessSeekbarView(r0)
            boolean r6 = r5.f10270e
            if (r6 == 0) goto L_0x01e7
            android.os.Handler r6 = r5.f10279n
            com.yeelight.cherry.ui.activity.r0 r0 = new com.yeelight.cherry.ui.activity.r0
            r0.<init>(r5)
            r1 = 500(0x1f4, double:2.47E-321)
            r6.postDelayed(r0, r1)
        L_0x01e7:
            android.widget.LinearLayout r6 = r5.mMoreLayout
            com.yeelight.cherry.ui.activity.DemoControlViewActivity$d r0 = new com.yeelight.cherry.ui.activity.DemoControlViewActivity$d
            r0.<init>()
            r6.addOnLayoutChangeListener(r0)
            return
        L_0x01f2:
            com.yeelight.yeelib.p142ui.activity.BaseActivity.m19947U(r5)
            r5.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.cherry.p141ui.activity.DemoControlViewActivity.onCreate(android.os.Bundle):void");
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        this.f10279n.removeCallbacksAndMessages((Object) null);
        C9119e eVar = this.f10269d;
        if (eVar != null && eVar.isShowing()) {
            this.f10269d.dismiss();
        }
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
                m16130C0();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        C3012e eVar = this.f10268c;
        if (eVar != null) {
            this.mTitleBar.setTitle(eVar.mo23210U());
            this.mLayoutLeft.setOnClickListener(new C5218h());
            m16155r0(this.f10268c.mo23146k1());
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        String stringExtra = getIntent().getStringExtra("com.yeelight.cherry.device_id");
        C3012e r0 = YeelightDeviceManager.m7804r0(stringExtra);
        this.f10268c = r0;
        if (r0 == null) {
            C9197p.m22176i(new C5215e(this), stringExtra);
            BaseActivity.m19947U(this);
            finish();
            return;
        }
        r0.mo23171z0(this);
        this.f10268c.mo23178B0(this);
        C3012e eVar = this.f10268c;
        if ((eVar instanceof WifiDeviceBase) || ((eVar instanceof C6119c) && ((C6119c) eVar).mo31760R1())) {
            C8272e.m19511b().mo35210j(this);
        }
        m16160w0(this.f10268c, stringExtra);
        if (this.f10268c.mo23197N() != null && this.f10268c.mo23197N().mo42513g() && this.f10268c.mo23197N().mo42510b() < C3088r.m8117g().mo23472l(this.f10268c.mo23208T())) {
            C9113d.C9118e eVar2 = new C9113d.C9118e(this);
            eVar2.mo37179i(getString(2131755543)).mo37177g(getString(2131755542)).mo37174d(-1, getString(2131755281), new C5217g()).mo37174d(-2, getString(2131755232), new C5216f());
            eVar2.mo37180j();
        }
    }

    public void onStatusChange(int i, DeviceStatusBase deviceStatusBase) {
        if (i == 1) {
            m16155r0(true);
        } else if (i == 2) {
            m16155r0(false);
        } else if (i == 256) {
            this.f10279n.postDelayed(new C5816q0(this), 100);
        }
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        m16131D0();
        C8272e.m19511b().mo35212m(this);
        C3012e eVar = this.f10268c;
        if (eVar != null) {
            eVar.mo23133V0(this);
            this.f10268c.mo23213W0(this);
        }
        if (this.f10272g) {
            this.mLayoutAnimation.setTranslationY((float) this.mMoreLayout.getHeight());
            this.mImageRight.setRotation(0.0f);
            this.mLayoutShadows.setVisibility(8);
            this.f10272g = false;
        }
    }

    /* renamed from: v */
    public void mo23318v() {
    }
}
