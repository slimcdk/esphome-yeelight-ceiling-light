package com.yeelight.cherry.p141ui.activity;

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
import androidx.constraintlayout.motion.widget.Key;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.miot.api.DeviceManager;
import com.miot.api.MiotManager;
import com.miot.common.device.firmware.MiotFirmware;
import com.miot.common.exception.MiotException;
import com.yeelight.cherry.C12228R$layout;
import com.yeelight.yeelib.device.base.C3010c;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.p142ui.activity.BaseActivity;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;
import com.yeelight.yeelib.utils.AppUtils;
import java.util.Locale;
import p051j4.C9193k;
import p227x3.C11969f;
import p227x3.C11981q;

/* renamed from: com.yeelight.cherry.ui.activity.FirmwareUpgradeActivity */
public class FirmwareUpgradeActivity extends BaseActivity {
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final String f10499e = "FirmwareUpgradeActivity";

    /* renamed from: f */
    public static final /* synthetic */ int f10500f = 0;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C3010c f10501a;

    /* renamed from: b */
    private ObjectAnimator f10502b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public int f10503c = 0;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public Handler f10504d = new C5311a();
    @BindView(2131296490)
    Button mBtnRetry;
    @BindView(2131296500)
    Button mBtnUpdate;
    @BindView(2131296605)
    TextView mNewUpdateCurrentVersion;
    @BindView(2131296979)
    TextView mNewUpdateLatestVersion;
    @BindView(2131297027)
    LinearLayout mNewUpdateLayout;
    @BindView(2131297298)
    TextView mNewUpdateReleaseNote;
    @BindView(2131297175)
    TextView mNoUpdateCurrentVersion;
    @BindView(2131297029)
    LinearLayout mNoupdateLayout;
    @BindView(2131297713)
    TextView mProgress;
    @BindView(2131297247)
    ImageView mProgressView;
    @BindView(2131297591)
    CommonTitleBar mTitleBar;
    @BindView(2131296792)
    LinearLayout mUpdateFailLayout;
    @BindView(2131297715)
    TextView mUpdatingHint;
    @BindView(2131296793)
    LinearLayout mUpdatingLayout;

    /* renamed from: com.yeelight.cherry.ui.activity.FirmwareUpgradeActivity$a */
    class C5311a extends Handler {
        C5311a() {
        }

        public void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    FirmwareUpgradeActivity.m16320X(FirmwareUpgradeActivity.this);
                    if (FirmwareUpgradeActivity.this.f10503c > 60) {
                        sendEmptyMessageDelayed(5, 3000);
                        return;
                    }
                    int e = FirmwareUpgradeActivity.this.f10501a.mo23197N().mo42523e();
                    if (e > 0 && e <= 100) {
                        FirmwareUpgradeActivity.this.mProgress.setText(String.valueOf(e));
                        return;
                    }
                    return;
                case 2:
                    FirmwareUpgradeActivity.this.m16329g0();
                    return;
                case 3:
                    FirmwareUpgradeActivity.this.m16334l0();
                    FirmwareUpgradeActivity.this.f10501a.mo23197N().mo42539k(false);
                    FirmwareUpgradeActivity.this.mProgress.setText(String.valueOf(100));
                    removeMessages(6);
                    sendEmptyMessageDelayed(4, 1000);
                    return;
                case 4:
                    FirmwareUpgradeActivity.this.m16331i0();
                    return;
                case 5:
                    removeMessages(1);
                    removeMessages(2);
                    removeMessages(6);
                    FirmwareUpgradeActivity.this.m16332j0();
                    FirmwareUpgradeActivity.this.f10501a.mo23197N().mo42539k(false);
                    return;
                case 6:
                    removeMessages(1);
                    removeMessages(2);
                    FirmwareUpgradeActivity.this.m16332j0();
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.FirmwareUpgradeActivity$b */
    class C5312b implements View.OnClickListener {
        C5312b() {
        }

        public void onClick(View view) {
            FirmwareUpgradeActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.FirmwareUpgradeActivity$c */
    class C5313c implements View.OnClickListener {
        C5313c() {
        }

        public void onClick(View view) {
            FirmwareUpgradeActivity.this.f10501a.mo23137Y0();
            FirmwareUpgradeActivity.this.m16333k0();
            FirmwareUpgradeActivity.this.f10504d.sendEmptyMessageDelayed(6, 180000);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.FirmwareUpgradeActivity$d */
    class C5314d implements View.OnClickListener {
        C5314d() {
        }

        public void onClick(View view) {
            int unused = FirmwareUpgradeActivity.this.f10503c = 3;
            FirmwareUpgradeActivity.this.f10504d.sendEmptyMessage(1);
            FirmwareUpgradeActivity.this.m16333k0();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.FirmwareUpgradeActivity$e */
    class C5315e implements DeviceManager.QueryFirmwareHandler {
        C5315e() {
        }

        public void onFailed(int i, String str) {
            String unused = FirmwareUpgradeActivity.f10499e;
            FirmwareUpgradeActivity.this.f10504d.sendEmptyMessageDelayed(2, 3000);
        }

        public void onSucceed(MiotFirmware miotFirmware) {
            String unused = FirmwareUpgradeActivity.f10499e;
            StringBuilder sb = new StringBuilder();
            sb.append("queryFirmwareUpgradeProgress onSucceed! progress: ");
            sb.append(miotFirmware.getOtaProgress());
            if (miotFirmware.isLatestVersion()) {
                FirmwareUpgradeActivity.this.f10501a.mo23191J0(new C11981q(miotFirmware));
                FirmwareUpgradeActivity.this.f10504d.removeMessages(1);
                FirmwareUpgradeActivity.this.f10504d.sendEmptyMessage(3);
                return;
            }
            C11969f N = FirmwareUpgradeActivity.this.f10501a.mo23197N();
            if (N != null) {
                N.mo42526j(miotFirmware.getOtaProgress());
            }
            FirmwareUpgradeActivity.this.f10504d.sendEmptyMessage(1);
            FirmwareUpgradeActivity.this.f10504d.sendEmptyMessageDelayed(2, 3000);
        }
    }

    /* renamed from: X */
    static /* synthetic */ int m16320X(FirmwareUpgradeActivity firmwareUpgradeActivity) {
        int i = firmwareUpgradeActivity.f10503c;
        firmwareUpgradeActivity.f10503c = i + 1;
        return i;
    }

    /* access modifiers changed from: private */
    /* renamed from: g0 */
    public void m16329g0() {
        try {
            MiotManager.getDeviceManager().queryFirmwareUpgradeInfo(this.f10501a.mo23206S(), new C5315e());
        } catch (MiotException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: h0 */
    private void m16330h0() {
        this.mNewUpdateLayout.setVisibility(0);
        this.mNoupdateLayout.setVisibility(8);
        this.mUpdatingLayout.setVisibility(8);
        this.mUpdateFailLayout.setVisibility(8);
        Locale locale = Locale.US;
        String format = String.format(locale, getText(2131755656).toString(), new Object[]{this.f10501a.mo23197N().mo42511c()});
        String format2 = String.format(locale, getText(2131755657).toString(), new Object[]{this.f10501a.mo23197N().mo42512d()});
        this.mNewUpdateCurrentVersion.setText(format);
        this.mNewUpdateLatestVersion.setText(format2);
        this.mNewUpdateReleaseNote.setText(this.f10501a.mo23197N().mo42525f());
        this.mBtnUpdate.setOnClickListener(new C5313c());
    }

    /* access modifiers changed from: private */
    /* renamed from: i0 */
    public void m16331i0() {
        this.mNewUpdateLayout.setVisibility(8);
        this.mNoupdateLayout.setVisibility(0);
        this.mUpdatingLayout.setVisibility(8);
        this.mUpdateFailLayout.setVisibility(8);
        if (this.f10501a.mo23197N() != null) {
            this.mNoUpdateCurrentVersion.setText(String.format(Locale.US, getText(2131755656).toString(), new Object[]{this.f10501a.mo23197N().mo42511c()}));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j0 */
    public void m16332j0() {
        this.mNewUpdateLayout.setVisibility(8);
        this.mNoupdateLayout.setVisibility(8);
        this.mUpdatingLayout.setVisibility(8);
        this.mUpdateFailLayout.setVisibility(0);
        ObjectAnimator objectAnimator = this.f10502b;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        this.mBtnRetry.setOnClickListener(new C5314d());
    }

    /* access modifiers changed from: private */
    /* renamed from: k0 */
    public void m16333k0() {
        this.mNewUpdateLayout.setVisibility(8);
        this.mNoupdateLayout.setVisibility(8);
        this.mUpdatingLayout.setVisibility(0);
        this.mUpdateFailLayout.setVisibility(8);
        this.mUpdatingHint.setText(2131755663);
        m16329g0();
        this.mProgressView.setImageResource(2131231509);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.mProgressView, Key.ROTATION, new float[]{0.0f, 359.0f});
        this.f10502b = ofFloat;
        ofFloat.setInterpolator(new LinearInterpolator());
        this.f10502b.setDuration(1500);
        this.f10502b.setRepeatMode(1);
        this.f10502b.setRepeatCount(-1);
        this.f10502b.start();
    }

    /* access modifiers changed from: private */
    /* renamed from: l0 */
    public void m16334l0() {
        this.mNewUpdateLayout.setVisibility(8);
        this.mNoupdateLayout.setVisibility(8);
        this.mUpdatingLayout.setVisibility(0);
        this.mUpdateFailLayout.setVisibility(8);
        ObjectAnimator objectAnimator = this.f10502b;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        this.mProgressView.setImageResource(2131231508);
        this.mUpdatingHint.setText(2131755660);
    }

    public void onBackPressed() {
        super.onBackPressed();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo35653P();
        getWindow().addFlags(128);
        C9193k.m22157h(true, this);
        setContentView(C12228R$layout.activity_wifi_firmware_upgrade_new);
        ButterKnife.bind((Activity) this);
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            AppUtils.m8302w(f10499e, "Activity has no device id", false);
        } else {
            C3010c j0 = YeelightDeviceManager.m7794j0(intent.getStringExtra("com.yeelight.cherry.device_id"));
            this.f10501a = j0;
            if (j0 == null || !j0.mo23145k0()) {
                BaseActivity.m19947U(this);
            } else {
                this.mTitleBar.mo36195a(getResources().getString(2131755659), new C5312b(), (View.OnClickListener) null);
                this.mTitleBar.setTitleTextSize(16);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                this.mTitleBar.setLayoutParams(layoutParams);
                layoutParams.setMargins(0, C9193k.m22154e(this), 0, 0);
                if (this.f10501a.mo23197N() == null) {
                    return;
                }
                if (!this.f10501a.mo23197N().mo42513g()) {
                    this.mNewUpdateLayout.setVisibility(8);
                    this.mNoupdateLayout.setVisibility(0);
                    this.mUpdatingLayout.setVisibility(8);
                    this.mUpdateFailLayout.setVisibility(8);
                    m16331i0();
                    return;
                } else if (this.f10501a.mo23197N().mo42538h()) {
                    this.mNewUpdateLayout.setVisibility(8);
                    this.mNoupdateLayout.setVisibility(8);
                    this.mUpdatingLayout.setVisibility(0);
                    this.mUpdateFailLayout.setVisibility(8);
                    this.f10503c = 3;
                    this.f10504d.sendEmptyMessage(1);
                    this.f10504d.sendEmptyMessageDelayed(6, 180000);
                    m16333k0();
                    return;
                } else {
                    this.mNewUpdateLayout.setVisibility(0);
                    this.mNoupdateLayout.setVisibility(8);
                    this.mUpdatingLayout.setVisibility(8);
                    this.mUpdateFailLayout.setVisibility(8);
                    m16330h0();
                    return;
                }
            }
        }
        finish();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        this.f10504d.removeCallbacksAndMessages((Object) null);
        super.onDestroy();
        mo35652M(this);
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
