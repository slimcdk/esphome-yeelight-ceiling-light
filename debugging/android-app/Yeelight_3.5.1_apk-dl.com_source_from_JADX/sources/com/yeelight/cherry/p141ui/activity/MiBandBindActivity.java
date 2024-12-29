package com.yeelight.cherry.p141ui.activity;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
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
import p207s3.C10333b;
import p207s3.C10343e;
import p237z3.C12145e;

/* renamed from: com.yeelight.cherry.ui.activity.MiBandBindActivity */
public class MiBandBindActivity extends BaseActivity implements C12145e {

    /* renamed from: d */
    public static final String f10884d = "MiBandBindActivity";
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C10333b f10885a;

    /* renamed from: b */
    private C10343e f10886b;

    /* renamed from: c */
    private boolean f10887c;
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

    /* renamed from: com.yeelight.cherry.ui.activity.MiBandBindActivity$a */
    class C5471a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f10888a;

        C5471a(int i) {
            this.f10888a = i;
        }

        public void run() {
            if (this.f10888a == 16384) {
                MiBandBindActivity.this.m16655c0(false);
                MiBandBindActivity.this.f10885a.mo41884e2();
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MiBandBindActivity$b */
    class C5472b implements Runnable {
        C5472b() {
        }

        public void run() {
            MiBandBindActivity.this.mLlSleepOff.setEnabled(true);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Y */
    public /* synthetic */ void m16653Y(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        mo30687b0();
    }

    /* renamed from: a0 */
    private void m16654a0() {
        new C9113d.C9118e(this).mo37178h(2131755901).mo37176f(2131755880).mo37174d(-2, getString(2131755232), (DialogInterface.OnClickListener) null).mo37174d(-1, getString(2131755281), new C5847w1(this)).mo37172b().show();
    }

    /* access modifiers changed from: private */
    /* renamed from: c0 */
    public void m16655c0(boolean z) {
        int i = 0;
        this.mLlSleepOff.setVisibility(z ? 0 : 4);
        this.mTvRelieveBind.setVisibility(z ? 0 : 4);
        Button button = this.mBtnBindBand;
        if (z) {
            i = 4;
        }
        button.setVisibility(i);
        this.mTvIntroduce.setText(z ? 2131755919 : 2131755899);
        if (z) {
            boolean a0 = this.f10885a.mo23221d0().mo31578a0();
            this.f10887c = a0;
            this.mImgSleepSwitch.setImageResource(a0 ? C12224R$drawable.icon_yeelight_band_switch_on : C12224R$drawable.icon_yeelight_band_switch_off);
        }
    }

    /* renamed from: Z */
    public void mo30686Z(boolean z) {
        this.f10885a.mo41882a2(z);
        this.mImgSleepSwitch.setImageResource(z ? C12224R$drawable.icon_yeelight_band_switch_on : C12224R$drawable.icon_yeelight_band_switch_off);
        this.f10885a.mo41884e2();
    }

    /* renamed from: b0 */
    public void mo30687b0() {
        C10343e eVar = this.f10886b;
        if (eVar != null && eVar.mo41919a() != null) {
            this.f10885a.mo41886h2(this.f10886b.mo41919a(), this.f10886b.mo41921c(), 8193);
            m16655c0(false);
        }
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
            AppUtils.m8302w(f10884d, "Activity has not device id", false);
            finish();
            return;
        }
        C10333b bVar = (C10333b) YeelightDeviceManager.m7800o0().mo23274P0(intent.getStringExtra("com.yeelight.cherry.device_id"));
        this.f10885a = bVar;
        if (bVar == null || !bVar.mo23145k0()) {
            BaseActivity.m19947U(this);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        C10333b bVar = this.f10885a;
        if (bVar != null) {
            bVar.mo23178B0(this);
            C10343e y = this.f10885a.mo23221d0().mo31625y();
            this.f10886b = y;
            m16655c0((y == null || y.mo41919a() == null) ? false : true);
            return;
        }
        finish();
    }

    public void onStatusChange(int i, DeviceStatusBase deviceStatusBase) {
        runOnUiThread(new C5471a(i));
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        C10333b bVar = this.f10885a;
        if (bVar != null) {
            bVar.mo23213W0(this);
        }
    }

    @OnClick({2131296876, 2131297094, 2131296459, 2131297672})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case C12225R$id.btn_bind_band:
                Intent intent = new Intent(this, MiBandOpenBluetoothActivity.class);
                intent.putExtra("deviceType", 1);
                intent.putExtra("com.yeelight.cherry.device_id", this.f10885a.mo23185G());
                startActivity(intent);
                return;
            case 2131296876:
                finish();
                return;
            case C12225R$id.ll_sleep_off:
                this.mLlSleepOff.setEnabled(false);
                boolean z = !this.f10887c;
                this.f10887c = z;
                mo30686Z(z);
                this.mLlSleepOff.postDelayed(new C5472b(), 500);
                return;
            case C12225R$id.tv_relieve_bind:
                m16654a0();
                return;
            default:
                return;
        }
    }
}
