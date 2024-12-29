package com.yeelight.cherry.p141ui.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.yeelight.cherry.C12228R$layout;
import com.yeelight.yeelib.device.base.DeviceStatusBase;
import com.yeelight.yeelib.device.xiaomi.WifiSpeakerService;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.p142ui.activity.BaseActivity;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;
import com.yeelight.yeelib.utils.AppUtils;
import p051j4.C9193k;
import p160g4.C9078e;
import p170i4.C9107b;
import p223w3.C10916f1;
import p227x3.C11969f;
import p237z3.C12143c;
import p237z3.C12145e;

/* renamed from: com.yeelight.cherry.ui.activity.SpeakerDeviceControlActivity */
public class SpeakerDeviceControlActivity extends BaseActivity implements C12145e, C12143c {

    /* renamed from: f */
    private static final String f11447f = "SpeakerDeviceControlActivity";

    /* renamed from: g */
    public static final /* synthetic */ int f11448g = 0;

    /* renamed from: a */
    private C10916f1 f11449a;

    /* renamed from: b */
    private C9107b.C9109b f11450b;

    /* renamed from: c */
    private C9107b f11451c;

    /* renamed from: d */
    private C9078e f11452d;

    /* renamed from: e */
    private Handler f11453e;
    @BindView(2131297591)
    CommonTitleBar mTitleBar;
    @BindView(2131297691)
    TextView mTvVersion;

    /* access modifiers changed from: private */
    /* renamed from: b0 */
    public /* synthetic */ void m17112b0(View view) {
        onBackPressed();
    }

    /* access modifiers changed from: private */
    /* renamed from: c0 */
    public /* synthetic */ void m17113c0(View view) {
        Intent intent = new Intent(this, DeviceSettingActivity.class);
        intent.putExtra("com.yeelight.cherry.device_id", this.f11449a.mo23185G());
        startActivity(intent);
    }

    /* access modifiers changed from: private */
    /* renamed from: d0 */
    public /* synthetic */ void m17114d0(WifiSpeakerService.AiProvider aiProvider) {
        this.f11452d.dismiss();
        this.f11449a.mo42281d2(aiProvider);
    }

    /* access modifiers changed from: private */
    /* renamed from: e0 */
    public /* synthetic */ void m17115e0() {
        C9078e eVar = new C9078e(this);
        this.f11452d = eVar;
        eVar.mo37031b(new C5854x3(this));
        this.f11452d.show();
    }

    /* access modifiers changed from: private */
    /* renamed from: f0 */
    public /* synthetic */ void m17116f0() {
        if (!isFinishing()) {
            if (this.f11450b == null) {
                this.f11450b = new C9107b.C9109b(this);
            }
            this.f11450b.mo37128b(1, getString(2131756330));
            if (this.f11451c == null) {
                this.f11451c = this.f11450b.mo37127a();
            }
            this.f11451c.show();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g0 */
    public /* synthetic */ void m17117g0() {
        if (!isFinishing()) {
            if (this.f11450b == null) {
                this.f11450b = new C9107b.C9109b(this);
            }
            this.f11450b.mo37128b(2, getString(2131756329));
            if (this.f11451c == null) {
                this.f11451c = this.f11450b.mo37127a();
            }
            this.f11451c.show();
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
        this.f11453e = new Handler();
        C9193k.m22157h(true, this);
        setContentView(C12228R$layout.activity_speaker_device_control);
        ButterKnife.bind((Activity) this);
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            AppUtils.m8302w(f11447f, "Activity has not device id", false);
        } else {
            C10916f1 f1Var = (C10916f1) YeelightDeviceManager.m7794j0(intent.getStringExtra("com.yeelight.cherry.device_id"));
            this.f11449a = f1Var;
            if (f1Var == null || !f1Var.mo23145k0()) {
                BaseActivity.m19947U(this);
            } else {
                this.mTitleBar.mo36195a(this.f11449a.mo23210U(), new C5844v3(this), new C5849w3(this));
                this.mTitleBar.setTitleTextSize(16);
                C11969f N = this.f11449a.mo23197N();
                if (N != null) {
                    this.mTvVersion.setText(String.format(getText(2131756328).toString(), new Object[]{N.mo42511c()}));
                } else {
                    this.mTvVersion.setText(String.format(getText(2131756328).toString(), new Object[]{"--"}));
                }
                if (!this.f11449a.mo42280b2()) {
                    this.f11453e.postDelayed(new C5859y3(this), 500);
                    return;
                }
                return;
            }
        }
        finish();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        this.f11453e.removeCallbacksAndMessages((Object) null);
        C9078e eVar = this.f11452d;
        if (eVar != null && eVar.isShowing()) {
            this.f11452d.dismiss();
        }
        C9107b bVar = this.f11451c;
        if (bVar != null && bVar.isShowing()) {
            this.f11451c.dismiss();
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
        C10916f1 f1Var = this.f11449a;
        if (f1Var != null) {
            f1Var.mo23213W0(this);
            this.f11449a.mo23133V0(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.mTitleBar.setTitle(this.f11449a.mo23210U());
        C10916f1 f1Var = this.f11449a;
        if (f1Var != null) {
            f1Var.mo23178B0(this);
            this.f11449a.mo23171z0(this);
        }
    }

    public void onStatusChange(int i, DeviceStatusBase deviceStatusBase) {
        if (i == 16777216) {
            this.f11453e.postDelayed(new C5864z3(this), 3000);
        } else if (i == 33554432) {
            this.f11453e.post(new C5727a4(this));
        }
    }
}
