package com.yeelight.cherry.p177ui.activity;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.inuker.bluetooth.library.connect.response.BluetoothConnectStatusResponse;
import com.miot.api.bluetooth.response.BleResponse;
import com.yeelight.cherry.C11748R$layout;
import com.yeelight.yeelib.device.models.C7626i;
import com.yeelight.yeelib.p150c.p151i.C6039j;
import com.yeelight.yeelib.p152f.C4214g;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p194ui.activity.BaseActivity;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;
import com.yeelight.yeelib.utils.C10547m;
import com.yeelight.yeelib.utils.C4308b;
import java.util.Locale;

/* renamed from: com.yeelight.cherry.ui.activity.MeshDeviceFirmwareUpgradeActivity */
public class MeshDeviceFirmwareUpgradeActivity extends BaseActivity {
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final String f11187h = MeshDeviceFirmwareUpgradeActivity.class.getSimpleName();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C6039j f11188b;

    /* renamed from: c */
    private ObjectAnimator f11189c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public int f11190d = 0;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public int f11191e = 0;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public boolean f11192f = false;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public Handler f11193g = new Handler(new C5368a());
    @BindView(2131296431)
    Button mBtnReCheckVersion;
    @BindView(2131296432)
    Button mBtnRetry;
    @BindView(2131296442)
    Button mBtnUpdate;
    @BindView(2131296906)
    LinearLayout mCheckVersionFailLayout;
    @BindView(2131296725)
    ImageView mGetVersionProgress;
    @BindView(2131296531)
    TextView mNewUpdateCurrentVersion;
    @BindView(2131296869)
    TextView mNewUpdateLatestVersion;
    @BindView(2131296916)
    LinearLayout mNewUpdateLayout;
    @BindView(2131297158)
    TextView mNewUpdateReleaseNote;
    @BindView(2131297052)
    TextView mNoUpdateCurrentVersion;
    @BindView(2131296918)
    LinearLayout mNoupdateLayout;
    @BindView(2131297533)
    TextView mProgress;
    @BindView(2131297114)
    ImageView mProgressView;
    @BindView(2131296905)
    LinearLayout mQueryCurrentFirmwareVersionLayout;
    @BindView(2131297424)
    CommonTitleBar mTitleBar;
    @BindView(2131296698)
    LinearLayout mUpdateFailLayout;
    @BindView(2131297535)
    TextView mUpdatingHint;
    @BindView(2131296699)
    LinearLayout mUpdatingLayout;

    /* renamed from: com.yeelight.cherry.ui.activity.MeshDeviceFirmwareUpgradeActivity$a */
    class C5368a implements Handler.Callback {
        C5368a() {
        }

        public boolean handleMessage(Message message) {
            switch (message.what) {
                case 0:
                    MeshDeviceFirmwareUpgradeActivity.this.m16601m0();
                    break;
                case 1:
                    MeshDeviceFirmwareUpgradeActivity.this.m16603o0();
                    break;
                case 2:
                    MeshDeviceFirmwareUpgradeActivity.this.m16602n0();
                    break;
                case 3:
                    MeshDeviceFirmwareUpgradeActivity.this.m16610v0();
                    if (MeshDeviceFirmwareUpgradeActivity.this.f11188b.mo23384N() != null) {
                        MeshDeviceFirmwareUpgradeActivity.this.f11188b.mo23384N().mo29068k(false);
                    }
                    MeshDeviceFirmwareUpgradeActivity.this.mProgress.setText(String.valueOf(100));
                    MeshDeviceFirmwareUpgradeActivity.this.f11193g.removeMessages(6);
                    MeshDeviceFirmwareUpgradeActivity.this.f11193g.sendEmptyMessageDelayed(4, 1000);
                    break;
                case 4:
                    MeshDeviceFirmwareUpgradeActivity.this.m16606r0();
                    break;
                case 5:
                    String unused = MeshDeviceFirmwareUpgradeActivity.f11187h;
                    MeshDeviceFirmwareUpgradeActivity.this.f11193g.removeMessages(6);
                    MeshDeviceFirmwareUpgradeActivity.this.m16608t0();
                    if (MeshDeviceFirmwareUpgradeActivity.this.f11188b.mo23384N() != null) {
                        MeshDeviceFirmwareUpgradeActivity.this.f11188b.mo23384N().mo29068k(false);
                        break;
                    }
                    break;
                case 6:
                    MeshDeviceFirmwareUpgradeActivity.this.m16608t0();
                    break;
                case 8:
                    MeshDeviceFirmwareUpgradeActivity.this.m16604p0();
                    break;
            }
            return false;
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MeshDeviceFirmwareUpgradeActivity$b */
    class C5369b implements View.OnClickListener {
        C5369b() {
        }

        public void onClick(View view) {
            MeshDeviceFirmwareUpgradeActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MeshDeviceFirmwareUpgradeActivity$c */
    class C5370c extends BluetoothConnectStatusResponse {

        /* renamed from: com.yeelight.cherry.ui.activity.MeshDeviceFirmwareUpgradeActivity$c$a */
        class C5371a implements BleResponse<String> {
            C5371a() {
            }

            /* renamed from: a */
            public void onResponse(int i, String str) {
                int i2;
                Handler handler;
                if (i == 0) {
                    String unused = MeshDeviceFirmwareUpgradeActivity.f11187h;
                    "current version = " + str;
                    MeshDeviceFirmwareUpgradeActivity.this.f11188b.mo23378J0(new C7626i(str));
                    handler = MeshDeviceFirmwareUpgradeActivity.this.f11193g;
                    i2 = 1;
                } else {
                    handler = MeshDeviceFirmwareUpgradeActivity.this.f11193g;
                    i2 = 8;
                }
                handler.sendEmptyMessage(i2);
            }
        }

        C5370c() {
        }

        public void onAuthResponse(int i, Bundle bundle) {
            String unused = MeshDeviceFirmwareUpgradeActivity.f11187h;
        }

        public void onBindResponse(int i, Bundle bundle) {
            String unused = MeshDeviceFirmwareUpgradeActivity.f11187h;
        }

        public void onCallback(int i, Bundle bundle) {
            String unused = MeshDeviceFirmwareUpgradeActivity.f11187h;
            if (i == 0) {
                MeshDeviceFirmwareUpgradeActivity.this.f11188b.mo27793j2(new C5371a());
                return;
            }
            "connect device fail " + MeshDeviceFirmwareUpgradeActivity.this.f11190d;
            if (MeshDeviceFirmwareUpgradeActivity.this.f11190d < 5) {
                MeshDeviceFirmwareUpgradeActivity.this.f11193g.sendEmptyMessageDelayed(0, 3000);
            } else {
                MeshDeviceFirmwareUpgradeActivity.this.f11193g.sendEmptyMessage(8);
            }
            MeshDeviceFirmwareUpgradeActivity.m16588Z(MeshDeviceFirmwareUpgradeActivity.this);
        }

        public void onConnectResponse(int i, Bundle bundle) {
            String unused = MeshDeviceFirmwareUpgradeActivity.f11187h;
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MeshDeviceFirmwareUpgradeActivity$d */
    class C5372d implements View.OnClickListener {
        C5372d() {
        }

        public void onClick(View view) {
            String unused = MeshDeviceFirmwareUpgradeActivity.f11187h;
            MeshDeviceFirmwareUpgradeActivity.this.f11188b.mo23323Y0();
            MeshDeviceFirmwareUpgradeActivity.this.m16609u0();
            MeshDeviceFirmwareUpgradeActivity.this.f11193g.sendEmptyMessageDelayed(6, 600000);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MeshDeviceFirmwareUpgradeActivity$e */
    class C5373e implements View.OnClickListener {
        C5373e() {
        }

        public void onClick(View view) {
            boolean unused = MeshDeviceFirmwareUpgradeActivity.this.f11192f = false;
            int unused2 = MeshDeviceFirmwareUpgradeActivity.this.f11191e = 0;
            int unused3 = MeshDeviceFirmwareUpgradeActivity.this.f11190d = 0;
            MeshDeviceFirmwareUpgradeActivity.this.m16607s0();
            MeshDeviceFirmwareUpgradeActivity.this.f11193g.sendEmptyMessage(0);
            MeshDeviceFirmwareUpgradeActivity.this.f11193g.sendEmptyMessageDelayed(6, 600000);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MeshDeviceFirmwareUpgradeActivity$f */
    class C5374f implements View.OnClickListener {
        C5374f() {
        }

        public void onClick(View view) {
            int unused = MeshDeviceFirmwareUpgradeActivity.this.f11191e = 0;
            int unused2 = MeshDeviceFirmwareUpgradeActivity.this.f11190d = 0;
            MeshDeviceFirmwareUpgradeActivity.this.m16607s0();
            MeshDeviceFirmwareUpgradeActivity.this.f11193g.sendEmptyMessage(0);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MeshDeviceFirmwareUpgradeActivity$g */
    class C5375g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f11201a;

        C5375g(int i) {
            this.f11201a = i;
        }

        public void run() {
            MeshDeviceFirmwareUpgradeActivity.this.mProgress.setText(String.valueOf(this.f11201a));
        }
    }

    /* renamed from: Z */
    static /* synthetic */ int m16588Z(MeshDeviceFirmwareUpgradeActivity meshDeviceFirmwareUpgradeActivity) {
        int i = meshDeviceFirmwareUpgradeActivity.f11190d;
        meshDeviceFirmwareUpgradeActivity.f11190d = i + 1;
        return i;
    }

    /* access modifiers changed from: private */
    /* renamed from: m0 */
    public void m16601m0() {
        this.f11188b.mo27792i2(new C5370c());
    }

    /* access modifiers changed from: private */
    /* renamed from: n0 */
    public void m16602n0() {
        if (!(this.f11188b.mo23384N() instanceof C7626i)) {
            return;
        }
        if (((C7626i) this.f11188b.mo23384N()).mo29071l() == 0) {
            int e = this.f11188b.mo23384N().mo29052e();
            "queryFirmwareUpgradeProgress!!! " + e;
            if (e == 100) {
                this.f11192f = true;
                this.f11193g.sendEmptyMessageDelayed(0, 30000);
                return;
            }
            runOnUiThread(new C5375g(e));
            this.f11192f = false;
            this.f11193g.sendEmptyMessageDelayed(2, 3000);
            return;
        }
        this.f11193g.sendEmptyMessage(5);
    }

    /* access modifiers changed from: private */
    /* renamed from: o0 */
    public void m16603o0() {
        C4214g.C4219d m = C4214g.m11665j().mo23494m(this.f11188b.mo23395T());
        if (m == null) {
            if (this.f11191e < 5) {
                this.f11188b.mo27796m2();
                this.f11193g.sendEmptyMessageDelayed(1, 3000);
            } else {
                this.f11193g.sendEmptyMessage(8);
            }
            this.f11191e++;
        } else if (this.f11188b.mo23384N() != null) {
            "current version = " + this.f11188b.mo23384N().mo29039b() + " ,latest version = " + m.mo23519a();
            if (m.mo23519a() > this.f11188b.mo23384N().mo29039b()) {
                m16605q0();
            } else if (!this.f11192f) {
                m16606r0();
            } else {
                this.f11193g.sendEmptyMessage(3);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: p0 */
    public void m16604p0() {
        this.mNewUpdateLayout.setVisibility(8);
        this.mNoupdateLayout.setVisibility(8);
        this.mUpdatingLayout.setVisibility(8);
        this.mUpdateFailLayout.setVisibility(8);
        this.mQueryCurrentFirmwareVersionLayout.setVisibility(8);
        this.mCheckVersionFailLayout.setVisibility(0);
        ObjectAnimator objectAnimator = this.f11189c;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        this.mBtnReCheckVersion.setOnClickListener(new C5374f());
    }

    /* renamed from: q0 */
    private void m16605q0() {
        C4214g.C4221f fVar = (C4214g.C4221f) C4214g.m11665j().mo23494m(this.f11188b.mo23395T());
        this.mNewUpdateLayout.setVisibility(0);
        this.mNoupdateLayout.setVisibility(8);
        this.mUpdatingLayout.setVisibility(8);
        this.mUpdateFailLayout.setVisibility(8);
        this.mQueryCurrentFirmwareVersionLayout.setVisibility(8);
        this.mCheckVersionFailLayout.setVisibility(8);
        String format = String.format(Locale.US, getText(2131755650).toString(), new Object[]{this.f11188b.mo23384N().mo29040c()});
        String format2 = String.format(Locale.US, getText(2131755651).toString(), new Object[]{fVar.mo23530f()});
        this.mNewUpdateCurrentVersion.setText(format);
        this.mNewUpdateLatestVersion.setText(format2);
        this.mNewUpdateReleaseNote.setText(fVar.mo23531g());
        ObjectAnimator objectAnimator = this.f11189c;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        this.mBtnUpdate.setOnClickListener(new C5372d());
    }

    /* access modifiers changed from: private */
    /* renamed from: r0 */
    public void m16606r0() {
        C4214g.C4221f fVar = (C4214g.C4221f) C4214g.m11665j().mo23494m(this.f11188b.mo23395T());
        this.mNewUpdateLayout.setVisibility(8);
        this.mNoupdateLayout.setVisibility(0);
        this.mUpdatingLayout.setVisibility(8);
        this.mUpdateFailLayout.setVisibility(8);
        this.mQueryCurrentFirmwareVersionLayout.setVisibility(8);
        this.mCheckVersionFailLayout.setVisibility(8);
        if (this.f11188b.mo23384N() != null) {
            this.mNoUpdateCurrentVersion.setText(String.format(Locale.US, getText(2131755650).toString(), new Object[]{fVar.mo23530f()}));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: s0 */
    public void m16607s0() {
        this.mNewUpdateLayout.setVisibility(8);
        this.mNoupdateLayout.setVisibility(8);
        this.mUpdatingLayout.setVisibility(8);
        this.mUpdateFailLayout.setVisibility(8);
        this.mQueryCurrentFirmwareVersionLayout.setVisibility(0);
        this.mCheckVersionFailLayout.setVisibility(8);
        this.mGetVersionProgress.setImageResource(2131231487);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.mGetVersionProgress, "rotation", new float[]{0.0f, 359.0f});
        this.f11189c = ofFloat;
        ofFloat.setInterpolator(new LinearInterpolator());
        this.f11189c.setDuration(1500);
        this.f11189c.setRepeatMode(1);
        this.f11189c.setRepeatCount(-1);
        this.f11189c.start();
    }

    /* access modifiers changed from: private */
    /* renamed from: t0 */
    public void m16608t0() {
        this.mNewUpdateLayout.setVisibility(8);
        this.mNoupdateLayout.setVisibility(8);
        this.mUpdatingLayout.setVisibility(8);
        this.mUpdateFailLayout.setVisibility(0);
        this.mQueryCurrentFirmwareVersionLayout.setVisibility(8);
        this.mCheckVersionFailLayout.setVisibility(8);
        ObjectAnimator objectAnimator = this.f11189c;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        this.mBtnRetry.setOnClickListener(new C5373e());
    }

    /* access modifiers changed from: private */
    /* renamed from: u0 */
    public void m16609u0() {
        this.mNewUpdateLayout.setVisibility(8);
        this.mNoupdateLayout.setVisibility(8);
        this.mUpdatingLayout.setVisibility(0);
        this.mUpdateFailLayout.setVisibility(8);
        this.mQueryCurrentFirmwareVersionLayout.setVisibility(8);
        this.mCheckVersionFailLayout.setVisibility(8);
        this.mUpdatingHint.setText(2131755657);
        m16602n0();
        this.mProgressView.setImageResource(2131231487);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.mProgressView, "rotation", new float[]{0.0f, 359.0f});
        this.f11189c = ofFloat;
        ofFloat.setInterpolator(new LinearInterpolator());
        this.f11189c.setDuration(1500);
        this.f11189c.setRepeatMode(1);
        this.f11189c.setRepeatCount(-1);
        this.f11189c.start();
    }

    /* access modifiers changed from: private */
    /* renamed from: v0 */
    public void m16610v0() {
        this.mNewUpdateLayout.setVisibility(8);
        this.mNoupdateLayout.setVisibility(8);
        this.mUpdatingLayout.setVisibility(0);
        this.mUpdateFailLayout.setVisibility(8);
        this.mQueryCurrentFirmwareVersionLayout.setVisibility(8);
        this.mCheckVersionFailLayout.setVisibility(8);
        ObjectAnimator objectAnimator = this.f11189c;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        this.mProgressView.setImageResource(2131231486);
        this.mUpdatingHint.setText(2131755654);
    }

    public void onBackPressed() {
        super.onBackPressed();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo32193P();
        getWindow().addFlags(128);
        C10547m.m25758h(true, this);
        setContentView(C11748R$layout.activity_mesh_device_firmware_upgrade);
        ButterKnife.bind((Activity) this);
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            C4308b.m12141t(f11187h, "Activity has no device id", false);
            finish();
            return;
        }
        this.f11188b = C4257w.m11947l0().mo23683q0(intent.getStringExtra("com.yeelight.cherry.device_id"));
        "device id = " + this.f11188b.mo23372G();
        C6039j jVar = this.f11188b;
        if (jVar == null || !jVar.mo23331k0()) {
            BaseActivity.m24384U(this);
            finish();
            return;
        }
        this.mTitleBar.mo32825a(getResources().getString(2131755653), new C5369b(), (View.OnClickListener) null);
        this.mTitleBar.setTitleTextSize(16);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        this.mTitleBar.setLayoutParams(layoutParams);
        layoutParams.setMargins(0, C10547m.m25755e(this), 0, 0);
        m16607s0();
        this.f11193g.sendEmptyMessage(0);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        this.f11193g.removeCallbacksAndMessages((Object) null);
        super.onDestroy();
        mo32192M(this);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
    }
}
