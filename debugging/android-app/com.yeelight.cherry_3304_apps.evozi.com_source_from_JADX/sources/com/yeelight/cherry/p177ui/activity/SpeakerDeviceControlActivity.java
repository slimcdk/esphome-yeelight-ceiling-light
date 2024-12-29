package com.yeelight.cherry.p177ui.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.yeelight.cherry.C11748R$layout;
import com.yeelight.yeelib.device.models.C7622g;
import com.yeelight.yeelib.device.xiaomi.WifiSpeakerService;
import com.yeelight.yeelib.p150c.p151i.C6024e;
import com.yeelight.yeelib.p150c.p183m.C6418d1;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p186e.C9768c;
import com.yeelight.yeelib.p186e.C9770e;
import com.yeelight.yeelib.p191j.p192a.C9904e;
import com.yeelight.yeelib.p194ui.activity.BaseActivity;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;
import com.yeelight.yeelib.p194ui.widget.C10515b;
import com.yeelight.yeelib.utils.C10547m;
import com.yeelight.yeelib.utils.C4308b;

/* renamed from: com.yeelight.cherry.ui.activity.SpeakerDeviceControlActivity */
public class SpeakerDeviceControlActivity extends BaseActivity implements C9770e, C9768c {

    /* renamed from: g */
    private static final String f11876g = SpeakerDeviceControlActivity.class.getSimpleName();

    /* renamed from: b */
    private C6418d1 f11877b;

    /* renamed from: c */
    private C10515b.C10517b f11878c;

    /* renamed from: d */
    private C10515b f11879d;

    /* renamed from: e */
    private C9904e f11880e;

    /* renamed from: f */
    private Handler f11881f;
    @BindView(2131297424)
    CommonTitleBar mTitleBar;
    @BindView(2131297512)
    TextView mTvVersion;

    /* renamed from: V */
    public /* synthetic */ void mo26961V(WifiSpeakerService.C9665g gVar) {
        this.f11880e.dismiss();
        this.f11877b.mo28157d2(gVar);
    }

    /* renamed from: W */
    public /* synthetic */ void mo26962W(View view) {
        onBackPressed();
    }

    /* renamed from: X */
    public /* synthetic */ void mo26963X(View view) {
        Intent intent = new Intent(this, DeviceSettingActivity.class);
        intent.putExtra("com.yeelight.cherry.device_id", this.f11877b.mo23372G());
        startActivity(intent);
    }

    /* renamed from: Y */
    public /* synthetic */ void mo26964Y() {
        C9904e eVar = new C9904e(this);
        this.f11880e = eVar;
        eVar.mo32020b(new C5704e3(this));
        this.f11880e.show();
    }

    /* renamed from: Z */
    public /* synthetic */ void mo26965Z() {
        if (!isFinishing()) {
            if (this.f11878c == null) {
                this.f11878c = new C10515b.C10517b(this);
            }
            this.f11878c.mo33281b(1, getString(2131756301));
            if (this.f11879d == null) {
                this.f11879d = this.f11878c.mo33280a();
            }
            this.f11879d.show();
        }
    }

    /* renamed from: a0 */
    public /* synthetic */ void mo26966a0() {
        if (!isFinishing()) {
            if (this.f11878c == null) {
                this.f11878c = new C10515b.C10517b(this);
            }
            this.f11878c.mo33281b(2, getString(2131756300));
            if (this.f11879d == null) {
                this.f11879d = this.f11878c.mo33280a();
            }
            this.f11879d.show();
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
        this.f11881f = new Handler();
        C10547m.m25758h(true, this);
        setContentView(C11748R$layout.activity_speaker_device_control);
        ButterKnife.bind((Activity) this);
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            C4308b.m12141t(f11876g, "Activity has not device id", false);
        } else {
            C6418d1 d1Var = (C6418d1) C4257w.m11945h0(intent.getStringExtra("com.yeelight.cherry.device_id"));
            this.f11877b = d1Var;
            if (d1Var == null || !d1Var.mo23331k0()) {
                BaseActivity.m24384U(this);
            } else {
                this.mTitleBar.mo32825a(this.f11877b.mo23397U(), new C5801z2(this), new C5684a3(this));
                this.mTitleBar.setTitleTextSize(16);
                C7622g N = this.f11877b.mo23384N();
                if (N != null) {
                    this.mTvVersion.setText(String.format(getText(2131756299).toString(), new Object[]{N.mo29040c()}));
                } else {
                    this.mTvVersion.setText(String.format(getText(2131756299).toString(), new Object[]{"--"}));
                }
                if (!this.f11877b.mo28156b2()) {
                    this.f11881f.postDelayed(new C5689b3(this), 500);
                    return;
                }
                return;
            }
        }
        finish();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        this.f11881f.removeCallbacksAndMessages((Object) null);
        C9904e eVar = this.f11880e;
        if (eVar != null && eVar.isShowing()) {
            this.f11880e.dismiss();
        }
        C10515b bVar = this.f11879d;
        if (bVar != null && bVar.isShowing()) {
            this.f11879d.dismiss();
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
        C6418d1 d1Var = this.f11877b;
        if (d1Var != null) {
            d1Var.mo23400W0(this);
            this.f11877b.mo23319V0(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.mTitleBar.setTitle(this.f11877b.mo23397U());
        C6418d1 d1Var = this.f11877b;
        if (d1Var != null) {
            d1Var.mo23365B0(this);
            this.f11877b.mo23358z0(this);
        }
    }

    public void onStatusChange(int i, C6024e eVar) {
        if (i == 16777216) {
            this.f11881f.postDelayed(new C5694c3(this), 3000);
        } else if (i == 33554432) {
            this.f11881f.post(new C5699d3(this));
        }
    }
}
