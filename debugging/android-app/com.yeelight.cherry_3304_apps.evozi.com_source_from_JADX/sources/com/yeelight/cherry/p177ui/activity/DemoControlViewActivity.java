package com.yeelight.cherry.p177ui.activity;

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
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import butterknife.BindView;
import com.yeelight.yeelib.p150c.C5980c;
import com.yeelight.yeelib.p150c.C6005g;
import com.yeelight.yeelib.p150c.C6006h;
import com.yeelight.yeelib.p150c.p151i.C4198d;
import com.yeelight.yeelib.p150c.p151i.C4200i;
import com.yeelight.yeelib.p150c.p151i.C6024e;
import com.yeelight.yeelib.p150c.p151i.C6038h;
import com.yeelight.yeelib.p152f.C4239r;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p152f.C9784e;
import com.yeelight.yeelib.p153g.C4300b0;
import com.yeelight.yeelib.p153g.C9849r;
import com.yeelight.yeelib.p186e.C9768c;
import com.yeelight.yeelib.p186e.C9770e;
import com.yeelight.yeelib.p187h.p189h.C9874b;
import com.yeelight.yeelib.p194ui.activity.BaseActivity;
import com.yeelight.yeelib.p194ui.activity.SceneActivity;
import com.yeelight.yeelib.p194ui.activity.YeelightWebviewActivity;
import com.yeelight.yeelib.p194ui.view.BrightnessSeekBarView;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;
import com.yeelight.yeelib.p194ui.view.FavoriteSceneViewBar;
import com.yeelight.yeelib.p194ui.view.ModeSelectionViewNew;
import com.yeelight.yeelib.p194ui.widget.C10526e;
import com.yeelight.yeelib.p194ui.widget.C10532f;
import com.yeelight.yeelib.pickcolor.CaptureActivity;
import com.yeelight.yeelib.utils.C10536b0;
import com.yeelight.yeelib.utils.C10551r;
import com.yeelight.yeelib.utils.C4308b;
import com.yeelight.yeelib.utils.C4310h;
import com.yeelight.yeelib.utils.C4315y;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yeelight.cherry.ui.activity.DemoControlViewActivity */
public class DemoControlViewActivity extends BaseActivity implements C9770e, C9768c, C9784e.C4213a {

    /* renamed from: p */
    private static final String f10708p = DemoControlViewActivity.class.getSimpleName();

    /* renamed from: b */
    private C5191z f10709b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public List<C6038h> f10710c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C4200i f10711d;

    /* renamed from: e */
    private C10532f f10712e;

    /* renamed from: f */
    private boolean f10713f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public long f10714g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public boolean f10715h = false;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public boolean f10716i = false;

    /* renamed from: j */
    private boolean f10717j = false;

    /* renamed from: k */
    private boolean f10718k = false;

    /* renamed from: l */
    private boolean f10719l = false;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public boolean f10720m = false;
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
    @BindView(2131297017)
    ModeSelectionViewNew mModeSelection;
    @BindView(2131296515)
    LinearLayout mMoreLayout;
    @BindView(2131297424)
    CommonTitleBar mTitleBar;

    /* renamed from: n */
    private boolean f10721n = false;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public Handler f10722o = new C5179q();

    /* renamed from: com.yeelight.cherry.ui.activity.DemoControlViewActivity$a */
    class C5161a implements View.OnClickListener {
        C5161a() {
        }

        public void onClick(View view) {
            if (DemoControlViewActivity.this.f10711d.mo23332k1()) {
                DemoControlViewActivity.this.m16237u0();
                return;
            }
            DemoControlViewActivity.this.f10722o.removeMessages(0);
            DemoControlViewActivity.this.f10722o.sendEmptyMessageDelayed(0, 500);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.DemoControlViewActivity$a0 */
    private class C5162a0 implements C9770e {

        /* renamed from: a */
        public ImageView f10724a;

        /* renamed from: b */
        public TextView f10725b;

        /* renamed from: c */
        public TextView f10726c;

        /* renamed from: d */
        public LinearLayout f10727d;

        /* renamed from: e */
        public int f10728e;

        /* renamed from: com.yeelight.cherry.ui.activity.DemoControlViewActivity$a0$a */
        class C5163a implements Runnable {
            C5163a() {
            }

            public void run() {
                if (DemoControlViewActivity.this.f10711d != null && DemoControlViewActivity.this.f10711d.mo23382M() != null) {
                    for (C6038h next : DemoControlViewActivity.this.f10711d.mo23382M()) {
                        if (next.mo27774d() == C5162a0.this.f10728e) {
                            if (next.mo27780j()) {
                                C5162a0 a0Var = C5162a0.this;
                                a0Var.f10725b.setBackgroundColor(DemoControlViewActivity.this.getResources().getColor(2131099806));
                            } else {
                                C5162a0.this.f10725b.setBackgroundColor(-3355444);
                            }
                        }
                    }
                }
            }
        }

        private C5162a0() {
        }

        /* synthetic */ C5162a0(DemoControlViewActivity demoControlViewActivity, C5173k kVar) {
            this();
        }

        public void onStatusChange(int i, C6024e eVar) {
            if (i == 4096) {
                DemoControlViewActivity.this.runOnUiThread(new C5163a());
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.DemoControlViewActivity$b */
    class C5164b implements View.OnClickListener {
        C5164b() {
        }

        public void onClick(View view) {
            if (System.currentTimeMillis() - DemoControlViewActivity.this.f10714g >= 300) {
                long unused = DemoControlViewActivity.this.f10714g = System.currentTimeMillis();
                DemoControlViewActivity demoControlViewActivity = DemoControlViewActivity.this;
                demoControlViewActivity.m16236t0(demoControlViewActivity.f10715h);
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.DemoControlViewActivity$c */
    class C5165c implements View.OnClickListener {
        C5165c() {
        }

        public void onClick(View view) {
            if (!DemoControlViewActivity.this.f10720m || !DemoControlViewActivity.this.f10711d.mo23408d0().mo27661R()) {
                DemoControlViewActivity demoControlViewActivity = DemoControlViewActivity.this;
                demoControlViewActivity.setResult(-1, demoControlViewActivity.getIntent());
                DemoControlViewActivity.this.finish();
                return;
            }
            DemoControlViewActivity.this.f10722o.removeMessages(1);
            DemoControlViewActivity.this.f10722o.sendEmptyMessageDelayed(1, 500);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.DemoControlViewActivity$d */
    class C5166d implements View.OnLayoutChangeListener {
        C5166d() {
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            if (DemoControlViewActivity.this.f10716i) {
                boolean unused = DemoControlViewActivity.this.f10716i = false;
                if (DemoControlViewActivity.this.f10715h) {
                    boolean unused2 = DemoControlViewActivity.this.f10715h = false;
                    DemoControlViewActivity demoControlViewActivity = DemoControlViewActivity.this;
                    demoControlViewActivity.m16236t0(demoControlViewActivity.f10715h);
                    return;
                }
                DemoControlViewActivity demoControlViewActivity2 = DemoControlViewActivity.this;
                demoControlViewActivity2.mLayoutAnimation.setTranslationY((float) demoControlViewActivity2.mMoreLayout.getHeight());
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.DemoControlViewActivity$e */
    class C5167e implements C9874b<String> {
        C5167e(DemoControlViewActivity demoControlViewActivity) {
        }

        /* renamed from: b */
        public void mo23475a(String str) {
        }

        public void onFailure(int i, String str) {
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.DemoControlViewActivity$f */
    class C5168f implements DialogInterface.OnClickListener {
        C5168f() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            DemoControlViewActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.DemoControlViewActivity$g */
    class C5169g implements DialogInterface.OnClickListener {
        C5169g() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            Intent intent = new Intent();
            intent.setClass(DemoControlViewActivity.this, FirmwareUpgradeActivity.class);
            intent.putExtra("com.yeelight.cherry.device_id", DemoControlViewActivity.this.f10711d.mo23372G());
            DemoControlViewActivity.this.startActivity(intent);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.DemoControlViewActivity$h */
    class C5170h implements View.OnClickListener {
        C5170h() {
        }

        public void onClick(View view) {
            DemoControlViewActivity demoControlViewActivity;
            boolean z;
            if (DemoControlViewActivity.this.f10711d.mo23332k1()) {
                DemoControlViewActivity.this.f10711d.mo23326b1();
                demoControlViewActivity = DemoControlViewActivity.this;
                z = false;
            } else {
                DemoControlViewActivity.this.f10711d.mo23334l1();
                demoControlViewActivity = DemoControlViewActivity.this;
                z = true;
            }
            demoControlViewActivity.m16232l0(z);
            C4315y.m12185b();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.DemoControlViewActivity$i */
    class C5171i implements Runnable {

        /* renamed from: a */
        final /* synthetic */ boolean f10737a;

        C5171i(boolean z) {
            this.f10737a = z;
        }

        public void run() {
            if (this.f10737a) {
                DemoControlViewActivity demoControlViewActivity = DemoControlViewActivity.this;
                demoControlViewActivity.m16240x0(demoControlViewActivity.mImageLeft, 2131231233);
                return;
            }
            DemoControlViewActivity.this.mImageLeft.setBackgroundResource(2131231233);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.DemoControlViewActivity$j */
    class C5172j implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ImageView f10739a;

        /* renamed from: b */
        final /* synthetic */ int f10740b;

        C5172j(ImageView imageView, int i) {
            this.f10739a = imageView;
            this.f10740b = i;
        }

        public void run() {
            LightingColorFilter lightingColorFilter = new LightingColorFilter(ViewCompat.MEASURED_STATE_MASK, DemoControlViewActivity.this.getResources().getColor(2131099802));
            Drawable drawable = this.f10739a.getContext().getResources().getDrawable(this.f10740b);
            drawable.clearColorFilter();
            drawable.mutate().setColorFilter(lightingColorFilter);
            this.f10739a.setBackground(drawable);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.DemoControlViewActivity$k */
    class C5173k implements View.OnClickListener {
        C5173k() {
        }

        public void onClick(View view) {
            DemoControlViewActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.DemoControlViewActivity$l */
    class C5174l implements Animator.AnimatorListener {
        C5174l() {
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            DemoControlViewActivity.this.mLayoutShadows.setVisibility(8);
            DemoControlViewActivity demoControlViewActivity = DemoControlViewActivity.this;
            boolean unused = demoControlViewActivity.f10715h = !demoControlViewActivity.f10715h;
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.DemoControlViewActivity$m */
    class C5175m implements Animator.AnimatorListener {
        C5175m() {
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            DemoControlViewActivity demoControlViewActivity = DemoControlViewActivity.this;
            boolean unused = demoControlViewActivity.f10715h = !demoControlViewActivity.f10715h;
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
            DemoControlViewActivity.this.mLayoutShadows.setVisibility(0);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.DemoControlViewActivity$n */
    class C5176n implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C10526e f10745a;

        C5176n(DemoControlViewActivity demoControlViewActivity, C10526e eVar) {
            this.f10745a = eVar;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            this.f10745a.mo33333d();
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.DemoControlViewActivity$o */
    class C5177o implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C10526e f10746a;

        /* renamed from: b */
        final /* synthetic */ C9849r f10747b;

        C5177o(C10526e eVar, C9849r rVar) {
            this.f10746a = eVar;
            this.f10747b = rVar;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            if (!TextUtils.isEmpty(this.f10746a.mo33332c().getText().toString())) {
                if (this.f10747b != null) {
                    this.f10747b.mo31866O(this.f10746a.mo33332c().getText().toString().trim());
                    DemoControlViewActivity.this.m16234r0(this.f10747b);
                } else {
                    DemoControlViewActivity demoControlViewActivity = DemoControlViewActivity.this;
                    Toast.makeText(demoControlViewActivity, demoControlViewActivity.getText(2131756203).toString(), 0).show();
                }
                this.f10746a.mo33333d();
                dialogInterface.dismiss();
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.DemoControlViewActivity$p */
    class C5178p implements C4300b0.C4307g {
        C5178p() {
        }

        /* renamed from: a */
        public void mo23766a(String str) {
        }

        /* renamed from: b */
        public /* synthetic */ void mo26359b(String str) {
            Toast.makeText(DemoControlViewActivity.this.getApplicationContext(), str, 0).show();
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
            DemoControlViewActivity.this.runOnUiThread(new C5701e0(this, str));
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.DemoControlViewActivity$q */
    class C5179q extends Handler {
        C5179q() {
        }

        public void handleMessage(Message message) {
            DemoControlViewActivity demoControlViewActivity;
            int i;
            super.handleMessage(message);
            int i2 = message.what;
            if (i2 == 0) {
                demoControlViewActivity = DemoControlViewActivity.this;
                i = 2131756181;
            } else if (i2 == 1) {
                demoControlViewActivity = DemoControlViewActivity.this;
                i = 2131756178;
            } else {
                return;
            }
            Toast.makeText(demoControlViewActivity, demoControlViewActivity.getText(i).toString(), 0).show();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.DemoControlViewActivity$r */
    class C5180r implements View.OnClickListener {
        C5180r() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(DemoControlViewActivity.this, DeviceSettingActivity.class);
            intent.putExtra("com.yeelight.cherry.device_id", DemoControlViewActivity.this.f10711d.mo23372G());
            DemoControlViewActivity.this.startActivity(intent);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.DemoControlViewActivity$s */
    class C5181s implements Runnable {
        C5181s() {
        }

        public void run() {
            DemoControlViewActivity demoControlViewActivity = DemoControlViewActivity.this;
            demoControlViewActivity.mLayoutAnimation.setTranslationY((float) demoControlViewActivity.mMoreLayout.getHeight());
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.DemoControlViewActivity$t */
    class C5182t implements View.OnClickListener {
        C5182t() {
        }

        public void onClick(View view) {
            if (System.currentTimeMillis() - DemoControlViewActivity.this.f10714g >= 300) {
                long unused = DemoControlViewActivity.this.f10714g = System.currentTimeMillis();
                if (DemoControlViewActivity.this.f10715h) {
                    DemoControlViewActivity demoControlViewActivity = DemoControlViewActivity.this;
                    demoControlViewActivity.m16236t0(demoControlViewActivity.f10715h);
                }
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.DemoControlViewActivity$u */
    class C5183u implements View.OnClickListener {
        C5183u() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(DemoControlViewActivity.this, SceneActivity.class);
            intent.putExtra("com.yeelight.cherry.device_id", DemoControlViewActivity.this.f10711d.mo23372G());
            DemoControlViewActivity.this.startActivity(intent);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.DemoControlViewActivity$v */
    class C5184v implements View.OnClickListener {

        /* renamed from: com.yeelight.cherry.ui.activity.DemoControlViewActivity$v$a */
        class C5185a implements DialogInterface.OnClickListener {
            C5185a(C5184v vVar) {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        }

        /* renamed from: com.yeelight.cherry.ui.activity.DemoControlViewActivity$v$b */
        class C5186b implements DialogInterface.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C6005g f10756a;

            C5186b(C6005g gVar) {
                this.f10756a = gVar;
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                Intent intent = new Intent(DemoControlViewActivity.this, ImageModeSelectionActivity.class);
                intent.putExtra("image_type", 3);
                intent.putExtra("com.yeelight.cherry.room_id", this.f10756a.mo23372G());
                DemoControlViewActivity.this.startActivity(intent);
                dialogInterface.dismiss();
            }
        }

        /* renamed from: com.yeelight.cherry.ui.activity.DemoControlViewActivity$v$c */
        class C5187c implements DialogInterface.OnClickListener {
            C5187c(C5184v vVar) {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        }

        C5184v() {
        }

        public void onClick(View view) {
            C10526e eVar;
            C6005g gVar = (C6005g) DemoControlViewActivity.this.f10711d;
            int i = 0;
            for (C4198d next : gVar.mo27498K1()) {
                if ((next instanceof C6006h) && next.mo23416o0()) {
                    i++;
                }
            }
            if (i == gVar.mo27498K1().size()) {
                Intent intent = new Intent(DemoControlViewActivity.this, ImageModeSelectionActivity.class);
                intent.putExtra("image_type", 3);
                intent.putExtra("com.yeelight.cherry.room_id", gVar.mo23372G());
                DemoControlViewActivity.this.startActivity(intent);
                return;
            }
            if (i > 0) {
                C10526e.C10531e eVar2 = new C10526e.C10531e(DemoControlViewActivity.this);
                eVar2.mo33357h(2131755275);
                eVar2.mo33356g(DemoControlViewActivity.this.getString(2131756169));
                eVar2.mo33353d(-1, DemoControlViewActivity.this.getString(2131755277), new C5186b(gVar));
                eVar2.mo33353d(-2, DemoControlViewActivity.this.getString(2131755229), new C5185a(this));
                eVar = eVar2.mo33351b();
            } else {
                C10526e.C10531e eVar3 = new C10526e.C10531e(DemoControlViewActivity.this);
                eVar3.mo33358i(DemoControlViewActivity.this.getString(2131756154));
                eVar3.mo33356g(DemoControlViewActivity.this.getString(2131756169));
                eVar3.mo33353d(-1, DemoControlViewActivity.this.getString(2131755277), new C5187c(this));
                eVar = eVar3.mo33351b();
            }
            eVar.show();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.DemoControlViewActivity$w */
    class C5188w implements View.OnClickListener {
        C5188w() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(DemoControlViewActivity.this, SceneActivity.class);
            intent.putExtra("com.yeelight.cherry.device_id", DemoControlViewActivity.this.f10711d.mo23372G());
            DemoControlViewActivity.this.startActivity(intent);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.DemoControlViewActivity$x */
    class C5189x implements View.OnClickListener {
        C5189x() {
        }

        public void onClick(View view) {
            if (System.currentTimeMillis() - DemoControlViewActivity.this.f10714g >= 300) {
                long unused = DemoControlViewActivity.this.f10714g = System.currentTimeMillis();
                DemoControlViewActivity demoControlViewActivity = DemoControlViewActivity.this;
                demoControlViewActivity.m16236t0(demoControlViewActivity.f10715h);
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.DemoControlViewActivity$y */
    class C5190y implements View.OnClickListener {
        C5190y() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(DemoControlViewActivity.this, SceneActivity.class);
            intent.putExtra("com.yeelight.cherry.device_id", DemoControlViewActivity.this.f10711d.mo23372G());
            DemoControlViewActivity.this.startActivity(intent);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.DemoControlViewActivity$z */
    private class C5191z extends BaseAdapter {

        /* renamed from: com.yeelight.cherry.ui.activity.DemoControlViewActivity$z$a */
        class C5192a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ int f10762a;

            C5192a(int i) {
                this.f10762a = i;
            }

            public void onClick(View view) {
                Class<CaptureActivity> h = ((C6038h) DemoControlViewActivity.this.f10710c.get(this.f10762a)).mo27778h();
                if (h == null) {
                    return;
                }
                if (h == CaptureActivity.class) {
                    ArrayList arrayList = new ArrayList();
                    if (ContextCompat.checkSelfPermission(DemoControlViewActivity.this.getApplicationContext(), "android.permission.CAMERA") != 0) {
                        arrayList.add("android.permission.CAMERA");
                    }
                    if (ContextCompat.checkSelfPermission(DemoControlViewActivity.this.getApplicationContext(), "android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                        arrayList.add("android.permission.WRITE_EXTERNAL_STORAGE");
                    }
                    if (!arrayList.isEmpty()) {
                        ActivityCompat.requestPermissions(DemoControlViewActivity.this, (String[]) arrayList.toArray(new String[arrayList.size()]), 0);
                    } else {
                        DemoControlViewActivity.this.m16238v0();
                    }
                } else {
                    DemoControlViewActivity demoControlViewActivity = DemoControlViewActivity.this;
                    ((C6038h) DemoControlViewActivity.this.f10710c.get(this.f10762a)).mo27785o(demoControlViewActivity, demoControlViewActivity.f10711d.mo23372G());
                }
            }
        }

        private C5191z() {
        }

        /* synthetic */ C5191z(DemoControlViewActivity demoControlViewActivity, C5173k kVar) {
            this();
        }

        public int getCount() {
            return DemoControlViewActivity.this.f10710c == null ? 0 : 9;
        }

        public Object getItem(int i) {
            return null;
        }

        public long getItemId(int i) {
            return 0;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            C5162a0 a0Var;
            int i2;
            TextView textView;
            if (i >= DemoControlViewActivity.this.f10710c.size()) {
                return LayoutInflater.from(DemoControlViewActivity.this).inflate(2131493102, (ViewGroup) null);
            }
            if (view == null || view.getTag() == null) {
                a0Var = new C5162a0(DemoControlViewActivity.this, (C5173k) null);
                view = LayoutInflater.from(DemoControlViewActivity.this).inflate(2131493103, (ViewGroup) null);
                view.setTag(a0Var);
            } else {
                a0Var = (C5162a0) view.getTag();
            }
            a0Var.f10728e = ((C6038h) DemoControlViewActivity.this.f10710c.get(i)).mo27774d();
            a0Var.f10724a = (ImageView) view.findViewById(2131296722);
            a0Var.f10725b = (TextView) view.findViewById(2131296719);
            a0Var.f10726c = (TextView) view.findViewById(2131296723);
            a0Var.f10727d = (LinearLayout) view.findViewById(2131296729);
            a0Var.f10726c.setText(((C6038h) DemoControlViewActivity.this.f10710c.get(i)).mo27777g());
            if (((C6038h) DemoControlViewActivity.this.f10710c.get(i)).mo27782l()) {
                a0Var.f10725b.setVisibility(0);
                if (((C6038h) DemoControlViewActivity.this.f10710c.get(i)).mo27780j()) {
                    textView = a0Var.f10725b;
                    i2 = DemoControlViewActivity.this.getResources().getColor(2131099806);
                } else {
                    textView = a0Var.f10725b;
                    i2 = -3355444;
                }
                textView.setBackgroundColor(i2);
                DemoControlViewActivity.this.f10711d.mo23365B0(a0Var);
            } else {
                a0Var.f10725b.setVisibility(4);
                DemoControlViewActivity.this.f10711d.mo23400W0(a0Var);
            }
            a0Var.f10724a.setBackgroundResource(((C6038h) DemoControlViewActivity.this.f10710c.get(i)).mo27776f());
            a0Var.f10727d.setOnClickListener(new C5192a(i));
            return view;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: l0 */
    public void m16232l0(boolean z) {
        this.mImageLeft.post(new C5171i(z));
    }

    /* renamed from: q0 */
    private void m16233q0(C4198d dVar, String str) {
        if (C4257w.m11945h0(dVar.mo23372G()) == null) {
            String str2 = f10708p;
            C4310h.m12146b(new C4308b.C4309a(str2, "Device is null! Fix me! device id: " + dVar.mo23372G() + ", debugDid: " + str + ", device model: " + dVar.mo23395T()));
            return;
        }
        this.mModeSelection.setDeviceId(dVar.mo23372G());
        this.mBrightnessSeekBar.setDeviceId(dVar.mo23372G());
        this.mFavoriteSceneViewBar.setDeviceId(dVar.mo23372G());
    }

    /* access modifiers changed from: private */
    /* renamed from: r0 */
    public void m16234r0(C9849r rVar) {
        C4300b0.m12083u().mo23738A(rVar, new C5178p());
    }

    /* access modifiers changed from: private */
    /* renamed from: s0 */
    public void mo26334n0() {
        C10532f fVar = new C10532f(this);
        this.f10712e = fVar;
        fVar.mo33361b(new C5711g0(this));
        this.f10712e.show();
    }

    /* access modifiers changed from: private */
    /* renamed from: t0 */
    public void m16236t0(boolean z) {
        ObjectAnimator objectAnimator;
        Animator.AnimatorListener animatorListener;
        if (z) {
            objectAnimator = ObjectAnimator.ofFloat(this.mLayoutAnimation, "translationY", new float[]{0.0f, (float) this.mMoreLayout.getHeight()}).setDuration(300);
            objectAnimator.setInterpolator(new AccelerateInterpolator());
            objectAnimator.start();
            ObjectAnimator.ofFloat(this.mImageRight, "rotation", new float[]{180.0f, 0.0f}).setDuration(20).start();
            ObjectAnimator.ofFloat(this.mLayoutShadows, "alpha", new float[]{1.0f, 0.0f}).setDuration(300).start();
            animatorListener = new C5174l();
        } else {
            this.mLayoutShadows.setVisibility(0);
            objectAnimator = ObjectAnimator.ofFloat(this.mLayoutAnimation, "translationY", new float[]{(float) this.mMoreLayout.getHeight(), 0.0f}).setDuration(300);
            objectAnimator.setInterpolator(new DecelerateInterpolator());
            objectAnimator.start();
            ObjectAnimator.ofFloat(this.mImageRight, "rotation", new float[]{0.0f, 180.0f}).setDuration(20).start();
            ObjectAnimator.ofFloat(this.mLayoutShadows, "alpha", new float[]{0.0f, 1.0f}).setDuration(300).start();
            animatorListener = new C5175m();
        }
        objectAnimator.addListener(animatorListener);
    }

    /* access modifiers changed from: private */
    /* renamed from: u0 */
    public void m16237u0() {
        C10526e.C10531e eVar = new C10526e.C10531e(this);
        eVar.mo33358i(getText(2131756208).toString());
        eVar.mo33356g(getText(2131756180).toString());
        eVar.mo33360k(true);
        C10526e b = eVar.mo33351b();
        b.mo33335g(-2, getText(2131755229).toString(), new C5176n(this, b));
        b.mo33335g(-1, getText(2131755277).toString(), new C5177o(b, this.f10711d.mo23407c0()));
        b.setCancelable(true);
        b.mo33332c().addTextChangedListener(new C10536b0(20, b.mo33332c()));
        b.show();
        b.mo33343o();
    }

    /* access modifiers changed from: private */
    /* renamed from: v0 */
    public void m16238v0() {
        Intent intent = new Intent(this, CaptureActivity.class);
        intent.putExtra("com.yeelight.cherry.device_id", this.f10711d.mo23372G());
        startActivity(intent);
    }

    /* renamed from: w0 */
    private void m16239w0() {
        this.mModeSelection.mo32995v();
        this.mBrightnessSeekBar.mo32740i();
    }

    /* access modifiers changed from: private */
    /* renamed from: x0 */
    public void m16240x0(ImageView imageView, int i) {
        imageView.post(new C5172j(imageView, i));
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

    /* renamed from: m0 */
    public /* synthetic */ void mo26333m0(View view) {
        Intent intent = new Intent(this, YeelightWebviewActivity.class);
        intent.putExtra("url_index", 27);
        startActivity(intent);
    }

    /* renamed from: o0 */
    public /* synthetic */ void mo26335o0() {
        this.f10716i = true;
        this.f10710c = this.f10711d.mo23382M();
        C5191z zVar = this.f10709b;
        if (zVar != null) {
            zVar.notifyDataSetChanged();
        }
    }

    public void onBackPressed() {
        boolean z = this.f10715h;
        if (z) {
            m16236t0(z);
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
            r5.mo32193P()
            r6 = 1
            com.yeelight.yeelib.utils.C10547m.m25758h(r6, r5)
            r0 = 2131492914(0x7f0c0032, float:1.8609293E38)
            r5.setContentView(r0)
            butterknife.ButterKnife.bind((android.app.Activity) r5)
            android.content.Intent r0 = r5.getIntent()
            java.lang.String r1 = "com.yeelight.cherry.device_id"
            boolean r2 = r0.hasExtra(r1)
            r3 = 0
            if (r2 != 0) goto L_0x002b
            java.lang.String r6 = f10708p
            java.lang.String r0 = "Activity has not device id"
            com.yeelight.yeelib.utils.C4308b.m12141t(r6, r0, r3)
            r5.finish()
            return
        L_0x002b:
            java.lang.String r1 = r0.getStringExtra(r1)
            java.lang.String r2 = "google_home_hint_key"
            boolean r0 = r0.getBooleanExtra(r2, r3)
            r5.f10713f = r0
            com.yeelight.yeelib.c.i.i r0 = com.yeelight.yeelib.p152f.C4257w.m11953o0(r1)
            r5.f10711d = r0
            android.content.Intent r0 = r5.getIntent()
            java.lang.String r1 = "room_flag"
            boolean r0 = r0.getBooleanExtra(r1, r3)
            r5.f10718k = r0
            android.content.Intent r0 = r5.getIntent()
            java.lang.String r1 = "group_flag"
            boolean r0 = r0.getBooleanExtra(r1, r3)
            r5.f10719l = r0
            android.content.Intent r0 = r5.getIntent()
            java.lang.String r1 = "mesh_group_flag"
            boolean r0 = r0.getBooleanExtra(r1, r3)
            r5.f10721n = r0
            android.content.Intent r0 = r5.getIntent()
            java.lang.String r1 = "scene_bundle_item"
            boolean r0 = r0.getBooleanExtra(r1, r3)
            r5.f10717j = r0
            android.content.Intent r0 = r5.getIntent()
            java.lang.String r1 = "set_device_default"
            boolean r0 = r0.getBooleanExtra(r1, r3)
            r5.f10720m = r0
            com.yeelight.yeelib.c.i.i r0 = r5.f10711d
            if (r0 == 0) goto L_0x01f2
            boolean r0 = r0.mo23331k0()
            if (r0 != 0) goto L_0x0085
            goto L_0x01f2
        L_0x0085:
            com.yeelight.yeelib.c.i.i r0 = r5.f10711d
            com.yeelight.yeelib.device.models.g r0 = r0.mo23384N()
            if (r0 != 0) goto L_0x0092
            com.yeelight.yeelib.c.i.i r0 = r5.f10711d
            r0.mo23356y0()
        L_0x0092:
            com.yeelight.yeelib.ui.view.CommonTitleBar r0 = r5.mTitleBar
            com.yeelight.yeelib.c.i.i r1 = r5.f10711d
            java.lang.String r1 = r1.mo23397U()
            com.yeelight.cherry.ui.activity.DemoControlViewActivity$k r2 = new com.yeelight.cherry.ui.activity.DemoControlViewActivity$k
            r2.<init>()
            com.yeelight.cherry.ui.activity.DemoControlViewActivity$r r4 = new com.yeelight.cherry.ui.activity.DemoControlViewActivity$r
            r4.<init>()
            r0.mo32825a(r1, r2, r4)
            com.yeelight.yeelib.ui.view.CommonTitleBar r0 = r5.mTitleBar
            r1 = 16
            r0.setTitleTextSize(r1)
            com.yeelight.yeelib.c.i.i r0 = r5.f10711d
            java.lang.String r0 = r0.mo23395T()
            java.lang.String r1 = "yeelink.light.color6"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00cd
            boolean r0 = r5.f10720m
            if (r0 != 0) goto L_0x00cd
            com.yeelight.yeelib.ui.view.CommonTitleBar r0 = r5.mTitleBar
            r1 = 2131231496(0x7f080308, float:1.8079075E38)
            com.yeelight.cherry.ui.activity.d0 r2 = new com.yeelight.cherry.ui.activity.d0
            r2.<init>(r5)
            r0.mo32826b(r1, r2)
        L_0x00cd:
            com.yeelight.yeelib.c.i.i r0 = r5.f10711d
            boolean r1 = r0 instanceof com.yeelight.yeelib.p150c.C5980c
            if (r1 == 0) goto L_0x00d8
            com.yeelight.yeelib.c.c r0 = (com.yeelight.yeelib.p150c.C5980c) r0
            r0.mo27507T1()
        L_0x00d8:
            com.yeelight.yeelib.c.i.i r0 = r5.f10711d
            java.util.List r0 = r0.mo23382M()
            r5.f10710c = r0
            com.yeelight.cherry.ui.activity.DemoControlViewActivity$z r0 = new com.yeelight.cherry.ui.activity.DemoControlViewActivity$z
            r1 = 0
            r0.<init>(r5, r1)
            r5.f10709b = r0
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
            boolean r0 = r5.f10718k
            r1 = 1050253722(0x3e99999a, float:0.3)
            r2 = 2131231216(0x7f0801f0, float:1.8078507E38)
            r4 = 8
            if (r0 == 0) goto L_0x0134
            com.yeelight.yeelib.ui.view.CommonTitleBar r0 = r5.mTitleBar
            r0.setRightButtonVisibility(r4)
            android.widget.ImageView r0 = r5.mImageRight
            r0.setImageResource(r2)
            android.widget.ImageView r0 = r5.mImageMiddle
            r2 = 2131231228(0x7f0801fc, float:1.8078531E38)
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
            boolean r0 = r5.f10719l
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
            boolean r0 = r5.f10721n
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
            boolean r0 = r5.f10717j
            if (r0 != 0) goto L_0x018c
            boolean r0 = r5.f10720m
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
            r0 = 2131755305(0x7f100129, float:1.9141486E38)
            java.lang.String r0 = r5.getString(r0)
            r6.setRightTextStr(r0)
            com.yeelight.yeelib.ui.view.CommonTitleBar r6 = r5.mTitleBar
            android.content.res.Resources r0 = r5.getResources()
            r1 = 2131099839(0x7f0600bf, float:1.7812043E38)
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
            boolean r6 = r5.f10713f
            if (r6 == 0) goto L_0x01e7
            android.os.Handler r6 = r5.f10722o
            com.yeelight.cherry.ui.activity.f0 r0 = new com.yeelight.cherry.ui.activity.f0
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
            com.yeelight.yeelib.p194ui.activity.BaseActivity.m24384U(r5)
            r5.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.cherry.p177ui.activity.DemoControlViewActivity.onCreate(android.os.Bundle):void");
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        this.f10722o.removeCallbacksAndMessages((Object) null);
        C10532f fVar = this.f10712e;
        if (fVar != null && fVar.isShowing()) {
            this.f10712e.dismiss();
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

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
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
                m16238v0();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        C4200i iVar = this.f10711d;
        if (iVar != null) {
            this.mTitleBar.setTitle(iVar.mo23397U());
            this.mLayoutLeft.setOnClickListener(new C5170h());
            m16232l0(this.f10711d.mo23332k1());
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        String stringExtra = getIntent().getStringExtra("com.yeelight.cherry.device_id");
        C4200i o0 = C4257w.m11953o0(stringExtra);
        this.f10711d = o0;
        if (o0 == null) {
            C10551r.m25777i(new C5167e(this), stringExtra);
            BaseActivity.m24384U(this);
            finish();
            return;
        }
        o0.mo23358z0(this);
        this.f10711d.mo23365B0(this);
        C4200i iVar = this.f10711d;
        if ((iVar instanceof C6006h) || ((iVar instanceof C5980c) && ((C5980c) iVar).mo27505R1())) {
            C9784e.m23711b().mo31634j(this);
        }
        m16233q0(this.f10711d, stringExtra);
        if (this.f10711d.mo23384N() != null && this.f10711d.mo23384N().mo29042g() && this.f10711d.mo23384N().mo29039b() < C4239r.m11807g().mo23579l(this.f10711d.mo23395T())) {
            C10526e.C10531e eVar = new C10526e.C10531e(this);
            eVar.mo33358i(getString(2131755539));
            eVar.mo33356g(getString(2131755538));
            eVar.mo33353d(-1, getString(2131755277), new C5169g());
            eVar.mo33353d(-2, getString(2131755229), new C5168f());
            eVar.mo33359j();
        }
    }

    public void onStatusChange(int i, C6024e eVar) {
        if (i == 1) {
            m16232l0(true);
        } else if (i == 2) {
            m16232l0(false);
        } else if (i == 256) {
            this.f10722o.postDelayed(new C5691c0(this), 100);
        }
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        m16239w0();
        C9784e.m23711b().mo31636m(this);
        C4200i iVar = this.f10711d;
        if (iVar != null) {
            iVar.mo23319V0(this);
            this.f10711d.mo23400W0(this);
        }
        if (this.f10715h) {
            this.mLayoutAnimation.setTranslationY((float) this.mMoreLayout.getHeight());
            this.mImageRight.setRotation(0.0f);
            this.mLayoutShadows.setVisibility(8);
            this.f10715h = false;
        }
    }

    /* renamed from: p0 */
    public /* synthetic */ void mo26336p0(View view) {
        Intent intent = new Intent(this, YeelightWebviewActivity.class);
        intent.putExtra("url_index", 27);
        startActivity(intent);
    }

    /* renamed from: v */
    public void mo23490v() {
    }
}
