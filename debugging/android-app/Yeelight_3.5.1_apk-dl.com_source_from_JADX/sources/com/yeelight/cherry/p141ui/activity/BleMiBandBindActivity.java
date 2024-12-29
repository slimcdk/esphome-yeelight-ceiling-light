package com.yeelight.cherry.p141ui.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.yeelight.cherry.C12224R$drawable;
import com.yeelight.cherry.C12225R$id;
import com.yeelight.cherry.C12228R$layout;
import com.yeelight.yeelib.device.base.DeviceStatusBase;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.p142ui.activity.BaseActivity;
import com.yeelight.yeelib.utils.AppUtils;
import p051j4.C9193k;
import p170i4.C9113d;
import p223w3.C11627r;
import p227x3.C11966c;
import p232y3.C12038c;
import p237z3.C12145e;

/* renamed from: com.yeelight.cherry.ui.activity.BleMiBandBindActivity */
public class BleMiBandBindActivity extends BaseActivity implements C12145e {

    /* renamed from: e */
    private static final String f9904e = "BleMiBandBindActivity";

    /* renamed from: f */
    public static final /* synthetic */ int f9905f = 0;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C11627r f9906a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C11966c f9907b;

    /* renamed from: c */
    private boolean f9908c;
    /* access modifiers changed from: private */
    @SuppressLint({"HandlerLeak"})

    /* renamed from: d */
    public Handler f9909d = new C5053a();
    @BindView(2131296459)
    Button mBtnBindBand;
    @BindView(2131296918)
    ImageView mImgSleepSwitch;
    @BindView(2131297094)
    LinearLayout mLlSleepOff;
    @BindView(2131297660)
    TextView mTvIntroduce;
    @BindView(2131297672)
    TextView mTvRelieveBind;

    /* renamed from: com.yeelight.cherry.ui.activity.BleMiBandBindActivity$a */
    class C5053a extends Handler {
        C5053a() {
        }

        public void handleMessage(Message message) {
            if (message.what == 7) {
                BleMiBandBindActivity.this.m15862f0(false);
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.BleMiBandBindActivity$b */
    class C5054b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f9911a;

        /* renamed from: b */
        final /* synthetic */ DeviceStatusBase f9912b;

        /* renamed from: com.yeelight.cherry.ui.activity.BleMiBandBindActivity$b$a */
        class C5055a implements Runnable {
            C5055a() {
            }

            public void run() {
                BleMiBandBindActivity.this.f9906a.mo42337A2();
            }
        }

        C5054b(int i, DeviceStatusBase deviceStatusBase) {
            this.f9911a = i;
            this.f9912b = deviceStatusBase;
        }

        public void run() {
            BleMiBandBindActivity bleMiBandBindActivity;
            int i = this.f9911a;
            boolean z = false;
            if (i == 8192) {
                BleMiBandBindActivity.this.f9909d.removeMessages(7);
                C11966c unused = BleMiBandBindActivity.this.f9907b = ((C12038c) this.f9912b).mo42667Z0();
                if (BleMiBandBindActivity.this.f9907b.mo42532a() == null) {
                    bleMiBandBindActivity = BleMiBandBindActivity.this;
                } else {
                    bleMiBandBindActivity = BleMiBandBindActivity.this;
                    z = true;
                }
                bleMiBandBindActivity.m15862f0(z);
            } else if (i == 16384) {
                BleMiBandBindActivity.this.m15862f0(false);
                BleMiBandBindActivity.this.f9909d.postDelayed(new C5055a(), 1000);
            } else if (i == 32768) {
                BleMiBandBindActivity.this.f9906a.mo42337A2();
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.BleMiBandBindActivity$c */
    class C5056c implements Runnable {
        C5056c() {
        }

        public void run() {
            BleMiBandBindActivity.this.mLlSleepOff.setEnabled(true);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b0 */
    public /* synthetic */ void m15860b0(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        mo30188e0();
    }

    /* renamed from: d0 */
    private void m15861d0() {
        new C9113d.C9118e(this).mo37178h(2131755901).mo37176f(2131755880).mo37174d(-2, getString(2131755232), (DialogInterface.OnClickListener) null).mo37174d(-1, getString(2131755281), new C5794m(this)).mo37172b().show();
    }

    /* access modifiers changed from: private */
    /* renamed from: f0 */
    public void m15862f0(boolean z) {
        int i = 4;
        boolean z2 = false;
        this.mLlSleepOff.setVisibility(z ? 0 : 4);
        this.mTvRelieveBind.setVisibility(z ? 0 : 4);
        Button button = this.mBtnBindBand;
        if (!z) {
            i = 0;
        }
        button.setVisibility(i);
        this.mTvIntroduce.setText(z ? 2131755919 : 2131755899);
        if (z) {
            C11966c cVar = this.f9907b;
            if (cVar != null && cVar.mo42533b()) {
                z2 = true;
            }
            this.f9908c = z2;
            this.mImgSleepSwitch.setImageResource(z2 ? C12224R$drawable.icon_yeelight_band_switch_on : C12224R$drawable.icon_yeelight_band_switch_off);
        }
    }

    /* renamed from: c0 */
    public void mo30187c0(boolean z) {
        this.f9906a.mo42350u2(z);
        this.mImgSleepSwitch.setImageResource(z ? C12224R$drawable.icon_yeelight_band_switch_on : C12224R$drawable.icon_yeelight_band_switch_off);
        this.f9906a.mo42337A2();
    }

    /* renamed from: e0 */
    public void mo30188e0() {
        C11966c cVar = this.f9907b;
        if (!(cVar == null || cVar.mo42532a() == null)) {
            try {
                String[] split = this.f9907b.mo42532a().split("#");
                this.f9906a.mo42348s2(split[0], split[1], split[2]);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        m15862f0(false);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C12228R$layout.activity_mi_band_bind);
        ButterKnife.bind((Activity) this);
        C9193k.m22157h(true, this);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        findViewById(2131297598).setLayoutParams(layoutParams);
        layoutParams.setMargins(0, C9193k.m22154e(this), 0, 0);
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            AppUtils.m8302w(f9904e, "Activity has not device id", false);
            finish();
            return;
        }
        C11627r rVar = (C11627r) YeelightDeviceManager.m7800o0().mo23295i0(intent.getStringExtra("com.yeelight.cherry.device_id"));
        this.f9906a = rVar;
        if (rVar == null || !rVar.mo23145k0()) {
            BaseActivity.m19947U(this);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        C11627r rVar = this.f9906a;
        if (rVar != null) {
            rVar.mo23178B0(this);
            this.f9906a.mo42337A2();
            this.f9909d.sendEmptyMessageDelayed(7, 1500);
            return;
        }
        finish();
    }

    public void onStatusChange(int i, DeviceStatusBase deviceStatusBase) {
        runOnUiThread(new C5054b(i, deviceStatusBase));
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        C11627r rVar = this.f9906a;
        if (rVar != null) {
            rVar.mo23213W0(this);
        }
    }

    @OnClick({2131296876, 2131297094, 2131296459, 2131297672})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case C12225R$id.btn_bind_band:
                Intent intent = new Intent(this, MiBandOpenBluetoothActivity.class);
                intent.putExtra("deviceType", 2);
                intent.putExtra("com.yeelight.cherry.device_id", this.f9906a.mo23185G());
                startActivity(intent);
                return;
            case 2131296876:
                finish();
                return;
            case C12225R$id.ll_sleep_off:
                this.mLlSleepOff.setEnabled(false);
                boolean z = !this.f9908c;
                this.f9908c = z;
                mo30187c0(z);
                this.mLlSleepOff.postDelayed(new C5056c(), 500);
                return;
            case C12225R$id.tv_relieve_bind:
                m15861d0();
                return;
            default:
                return;
        }
    }
}
