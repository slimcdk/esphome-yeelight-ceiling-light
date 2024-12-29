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
import com.miot.api.DeviceManager;
import com.miot.api.MiotManager;
import com.miot.common.device.firmware.MiotFirmware;
import com.miot.common.exception.MiotException;
import com.yeelight.cherry.C11748R$layout;
import com.yeelight.yeelib.device.models.C7622g;
import com.yeelight.yeelib.device.models.C7640n0;
import com.yeelight.yeelib.p150c.p151i.C4198d;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p194ui.activity.BaseActivity;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;
import com.yeelight.yeelib.utils.C10547m;
import com.yeelight.yeelib.utils.C4308b;
import java.util.Locale;

/* renamed from: com.yeelight.cherry.ui.activity.FirmwareUpgradeActivity */
public class FirmwareUpgradeActivity extends BaseActivity {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final String f10935f = FirmwareUpgradeActivity.class.getSimpleName();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C4198d f10936b;

    /* renamed from: c */
    private ObjectAnimator f10937c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public int f10938d = 0;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public Handler f10939e = new C5263a();
    @BindView(2131296432)
    Button mBtnRetry;
    @BindView(2131296442)
    Button mBtnUpdate;
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
    @BindView(2131297424)
    CommonTitleBar mTitleBar;
    @BindView(2131296698)
    LinearLayout mUpdateFailLayout;
    @BindView(2131297535)
    TextView mUpdatingHint;
    @BindView(2131296699)
    LinearLayout mUpdatingLayout;

    /* renamed from: com.yeelight.cherry.ui.activity.FirmwareUpgradeActivity$a */
    class C5263a extends Handler {
        C5263a() {
        }

        public void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    FirmwareUpgradeActivity.m16382X(FirmwareUpgradeActivity.this);
                    if (FirmwareUpgradeActivity.this.f10938d > 60) {
                        sendEmptyMessageDelayed(5, 3000);
                        return;
                    }
                    int e = FirmwareUpgradeActivity.this.f10936b.mo23384N().mo29052e();
                    if (e > 0 && e <= 100) {
                        FirmwareUpgradeActivity.this.mProgress.setText(String.valueOf(e));
                        return;
                    }
                    return;
                case 2:
                    FirmwareUpgradeActivity.this.m16391g0();
                    return;
                case 3:
                    FirmwareUpgradeActivity.this.m16396l0();
                    FirmwareUpgradeActivity.this.f10936b.mo23384N().mo29068k(false);
                    FirmwareUpgradeActivity.this.mProgress.setText(String.valueOf(100));
                    removeMessages(6);
                    sendEmptyMessageDelayed(4, 1000);
                    return;
                case 4:
                    FirmwareUpgradeActivity.this.m16393i0();
                    return;
                case 5:
                    removeMessages(1);
                    removeMessages(2);
                    removeMessages(6);
                    FirmwareUpgradeActivity.this.m16394j0();
                    FirmwareUpgradeActivity.this.f10936b.mo23384N().mo29068k(false);
                    return;
                case 6:
                    removeMessages(1);
                    removeMessages(2);
                    FirmwareUpgradeActivity.this.m16394j0();
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.FirmwareUpgradeActivity$b */
    class C5264b implements View.OnClickListener {
        C5264b() {
        }

        public void onClick(View view) {
            FirmwareUpgradeActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.FirmwareUpgradeActivity$c */
    class C5265c implements View.OnClickListener {
        C5265c() {
        }

        public void onClick(View view) {
            FirmwareUpgradeActivity.this.f10936b.mo23323Y0();
            FirmwareUpgradeActivity.this.m16395k0();
            FirmwareUpgradeActivity.this.f10939e.sendEmptyMessageDelayed(6, 180000);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.FirmwareUpgradeActivity$d */
    class C5266d implements View.OnClickListener {
        C5266d() {
        }

        public void onClick(View view) {
            int unused = FirmwareUpgradeActivity.this.f10938d = 3;
            FirmwareUpgradeActivity.this.f10939e.sendEmptyMessage(1);
            FirmwareUpgradeActivity.this.m16395k0();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.FirmwareUpgradeActivity$e */
    class C5267e implements DeviceManager.QueryFirmwareHandler {
        C5267e() {
        }

        public void onFailed(int i, String str) {
            String unused = FirmwareUpgradeActivity.f10935f;
            FirmwareUpgradeActivity.this.f10939e.sendEmptyMessageDelayed(2, 3000);
        }

        public void onSucceed(MiotFirmware miotFirmware) {
            String unused = FirmwareUpgradeActivity.f10935f;
            "queryFirmwareUpgradeProgress onSucceed! progress: " + miotFirmware.getOtaProgress();
            if (miotFirmware.isLatestVersion()) {
                FirmwareUpgradeActivity.this.f10936b.mo23378J0(new C7640n0(miotFirmware));
                FirmwareUpgradeActivity.this.f10939e.removeMessages(1);
                FirmwareUpgradeActivity.this.f10939e.sendEmptyMessage(3);
                return;
            }
            C7622g N = FirmwareUpgradeActivity.this.f10936b.mo23384N();
            if (N != null) {
                N.mo29055j(miotFirmware.getOtaProgress());
            }
            FirmwareUpgradeActivity.this.f10939e.sendEmptyMessage(1);
            FirmwareUpgradeActivity.this.f10939e.sendEmptyMessageDelayed(2, 3000);
        }
    }

    /* renamed from: X */
    static /* synthetic */ int m16382X(FirmwareUpgradeActivity firmwareUpgradeActivity) {
        int i = firmwareUpgradeActivity.f10938d;
        firmwareUpgradeActivity.f10938d = i + 1;
        return i;
    }

    /* access modifiers changed from: private */
    /* renamed from: g0 */
    public void m16391g0() {
        try {
            MiotManager.getDeviceManager().queryFirmwareUpgradeInfo(this.f10936b.mo23393S(), new C5267e());
        } catch (MiotException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: h0 */
    private void m16392h0() {
        this.mNewUpdateLayout.setVisibility(0);
        this.mNoupdateLayout.setVisibility(8);
        this.mUpdatingLayout.setVisibility(8);
        this.mUpdateFailLayout.setVisibility(8);
        String format = String.format(Locale.US, getText(2131755650).toString(), new Object[]{this.f10936b.mo23384N().mo29040c()});
        String format2 = String.format(Locale.US, getText(2131755651).toString(), new Object[]{this.f10936b.mo23384N().mo29041d()});
        this.mNewUpdateCurrentVersion.setText(format);
        this.mNewUpdateLatestVersion.setText(format2);
        this.mNewUpdateReleaseNote.setText(this.f10936b.mo23384N().mo29054f());
        this.mBtnUpdate.setOnClickListener(new C5265c());
    }

    /* access modifiers changed from: private */
    /* renamed from: i0 */
    public void m16393i0() {
        this.mNewUpdateLayout.setVisibility(8);
        this.mNoupdateLayout.setVisibility(0);
        this.mUpdatingLayout.setVisibility(8);
        this.mUpdateFailLayout.setVisibility(8);
        if (this.f10936b.mo23384N() != null) {
            this.mNoUpdateCurrentVersion.setText(String.format(Locale.US, getText(2131755650).toString(), new Object[]{this.f10936b.mo23384N().mo29040c()}));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j0 */
    public void m16394j0() {
        this.mNewUpdateLayout.setVisibility(8);
        this.mNoupdateLayout.setVisibility(8);
        this.mUpdatingLayout.setVisibility(8);
        this.mUpdateFailLayout.setVisibility(0);
        ObjectAnimator objectAnimator = this.f10937c;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        this.mBtnRetry.setOnClickListener(new C5266d());
    }

    /* access modifiers changed from: private */
    /* renamed from: k0 */
    public void m16395k0() {
        this.mNewUpdateLayout.setVisibility(8);
        this.mNoupdateLayout.setVisibility(8);
        this.mUpdatingLayout.setVisibility(0);
        this.mUpdateFailLayout.setVisibility(8);
        this.mUpdatingHint.setText(2131755657);
        m16391g0();
        this.mProgressView.setImageResource(2131231487);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.mProgressView, "rotation", new float[]{0.0f, 359.0f});
        this.f10937c = ofFloat;
        ofFloat.setInterpolator(new LinearInterpolator());
        this.f10937c.setDuration(1500);
        this.f10937c.setRepeatMode(1);
        this.f10937c.setRepeatCount(-1);
        this.f10937c.start();
    }

    /* access modifiers changed from: private */
    /* renamed from: l0 */
    public void m16396l0() {
        this.mNewUpdateLayout.setVisibility(8);
        this.mNoupdateLayout.setVisibility(8);
        this.mUpdatingLayout.setVisibility(0);
        this.mUpdateFailLayout.setVisibility(8);
        ObjectAnimator objectAnimator = this.f10937c;
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
        setContentView(C11748R$layout.activity_wifi_firmware_upgrade_new);
        ButterKnife.bind((Activity) this);
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            C4308b.m12141t(f10935f, "Activity has no device id", false);
        } else {
            C4198d h0 = C4257w.m11945h0(intent.getStringExtra("com.yeelight.cherry.device_id"));
            this.f10936b = h0;
            if (h0 == null || !h0.mo23331k0()) {
                BaseActivity.m24384U(this);
            } else {
                this.mTitleBar.mo32825a(getResources().getString(2131755653), new C5264b(), (View.OnClickListener) null);
                this.mTitleBar.setTitleTextSize(16);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                this.mTitleBar.setLayoutParams(layoutParams);
                layoutParams.setMargins(0, C10547m.m25755e(this), 0, 0);
                if (this.f10936b.mo23384N() == null) {
                    return;
                }
                if (!this.f10936b.mo23384N().mo29042g()) {
                    this.mNewUpdateLayout.setVisibility(8);
                    this.mNoupdateLayout.setVisibility(0);
                    this.mUpdatingLayout.setVisibility(8);
                    this.mUpdateFailLayout.setVisibility(8);
                    m16393i0();
                    return;
                } else if (this.f10936b.mo23384N().mo29067h()) {
                    this.mNewUpdateLayout.setVisibility(8);
                    this.mNoupdateLayout.setVisibility(8);
                    this.mUpdatingLayout.setVisibility(0);
                    this.mUpdateFailLayout.setVisibility(8);
                    this.f10938d = 3;
                    this.f10939e.sendEmptyMessage(1);
                    this.f10939e.sendEmptyMessageDelayed(6, 180000);
                    m16395k0();
                    return;
                } else {
                    this.mNewUpdateLayout.setVisibility(0);
                    this.mNoupdateLayout.setVisibility(8);
                    this.mUpdatingLayout.setVisibility(8);
                    this.mUpdateFailLayout.setVisibility(8);
                    m16392h0();
                    return;
                }
            }
        }
        finish();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        this.f10939e.removeCallbacksAndMessages((Object) null);
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
