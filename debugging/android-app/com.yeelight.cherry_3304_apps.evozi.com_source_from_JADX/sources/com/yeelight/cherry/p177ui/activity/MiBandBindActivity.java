package com.yeelight.cherry.p177ui.activity;

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
import com.yeelight.cherry.C11744R$drawable;
import com.yeelight.cherry.C11745R$id;
import com.yeelight.cherry.C11748R$layout;
import com.yeelight.yeelib.p150c.p151i.C6024e;
import com.yeelight.yeelib.p150c.p151i.C6029f;
import com.yeelight.yeelib.p150c.p151i.C6046l;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p186e.C9770e;
import com.yeelight.yeelib.p194ui.activity.BaseActivity;
import com.yeelight.yeelib.p194ui.widget.C10526e;
import com.yeelight.yeelib.utils.C10547m;
import com.yeelight.yeelib.utils.C4308b;

/* renamed from: com.yeelight.cherry.ui.activity.MiBandBindActivity */
public class MiBandBindActivity extends BaseActivity implements C9770e {

    /* renamed from: e */
    public static final String f11314e = MiBandBindActivity.class.getSimpleName();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C6029f f11315b;

    /* renamed from: c */
    private C6046l f11316c;

    /* renamed from: d */
    private boolean f11317d;
    @BindView(2131296401)
    Button mBtnBindBand;
    @BindView(2131296814)
    ImageView mImgSleepSwitch;
    @BindView(2131296977)
    LinearLayout mLlSleepOff;
    @BindView(2131297485)
    TextView mTvIntroduce;
    @BindView(2131297496)
    TextView mTvRelieveBind;

    /* renamed from: com.yeelight.cherry.ui.activity.MiBandBindActivity$a */
    class C5425a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f11318a;

        C5425a(int i) {
            this.f11318a = i;
        }

        public void run() {
            if (this.f11318a == 16384) {
                MiBandBindActivity.this.m16693b0(false);
                MiBandBindActivity.this.f11315b.mo27736e2();
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MiBandBindActivity$b */
    class C5426b implements Runnable {
        C5426b() {
        }

        public void run() {
            MiBandBindActivity.this.mLlSleepOff.setEnabled(true);
        }
    }

    /* renamed from: Z */
    private void m16692Z() {
        C10526e.C10531e eVar = new C10526e.C10531e(this);
        eVar.mo33357h(2131755891);
        eVar.mo33355f(2131755870);
        eVar.mo33353d(-2, getString(2131755229), (DialogInterface.OnClickListener) null);
        eVar.mo33353d(-1, getString(2131755277), new C5707f1(this));
        eVar.mo33351b().show();
    }

    /* access modifiers changed from: private */
    /* renamed from: b0 */
    public void m16693b0(boolean z) {
        int i = 0;
        this.mLlSleepOff.setVisibility(z ? 0 : 4);
        this.mTvRelieveBind.setVisibility(z ? 0 : 4);
        Button button = this.mBtnBindBand;
        if (z) {
            i = 4;
        }
        button.setVisibility(i);
        this.mTvIntroduce.setText(z ? 2131755909 : 2131755889);
        if (z) {
            boolean Z = this.f11315b.mo23408d0().mo27675Z();
            this.f11317d = Z;
            this.mImgSleepSwitch.setImageResource(Z ? C11744R$drawable.icon_yeelight_band_switch_on : C11744R$drawable.icon_yeelight_band_switch_off);
        }
    }

    /* renamed from: X */
    public /* synthetic */ void mo26671X(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        mo26673a0();
    }

    /* renamed from: Y */
    public void mo26672Y(boolean z) {
        this.f11315b.mo27734a2(z);
        this.mImgSleepSwitch.setImageResource(z ? C11744R$drawable.icon_yeelight_band_switch_on : C11744R$drawable.icon_yeelight_band_switch_off);
        this.f11315b.mo27736e2();
    }

    /* renamed from: a0 */
    public void mo26673a0() {
        C6046l lVar = this.f11316c;
        if (lVar != null && lVar.mo27797a() != null) {
            this.f11315b.mo27738h2(this.f11316c.mo27797a(), this.f11316c.mo27799c(), 8193);
            m16693b0(false);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C11748R$layout.activity_mi_band_bind);
        ButterKnife.bind((Activity) this);
        C10547m.m25758h(true, this);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        findViewById(2131297431).setLayoutParams(layoutParams);
        layoutParams.setMargins(0, C10547m.m25755e(this), 0, 0);
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            C4308b.m12141t(f11314e, "Activity has not device id", false);
            finish();
            return;
        }
        C6029f fVar = (C6029f) C4257w.m11947l0().mo23651L0(intent.getStringExtra("com.yeelight.cherry.device_id"));
        this.f11315b = fVar;
        if (fVar == null || !fVar.mo23331k0()) {
            BaseActivity.m24384U(this);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        C6029f fVar = this.f11315b;
        if (fVar != null) {
            fVar.mo23365B0(this);
            C6046l y = this.f11315b.mo23408d0().mo27724y();
            this.f11316c = y;
            m16693b0((y == null || y.mo27797a() == null) ? false : true);
            return;
        }
        finish();
    }

    public void onStatusChange(int i, C6024e eVar) {
        runOnUiThread(new C5425a(i));
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        C6029f fVar = this.f11315b;
        if (fVar != null) {
            fVar.mo23400W0(this);
        }
    }

    @OnClick({2131296772, 2131296977, 2131296401, 2131297496})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case C11745R$id.btn_bind_band:
                Intent intent = new Intent(this, MiBandOpenBluetoothActivity.class);
                intent.putExtra("deviceType", 1);
                intent.putExtra("com.yeelight.cherry.device_id", this.f11315b.mo23372G());
                startActivity(intent);
                return;
            case 2131296772:
                finish();
                return;
            case C11745R$id.ll_sleep_off:
                this.mLlSleepOff.setEnabled(false);
                boolean z = !this.f11317d;
                this.f11317d = z;
                mo26672Y(z);
                this.mLlSleepOff.postDelayed(new C5426b(), 500);
                return;
            case C11745R$id.tv_relieve_bind:
                m16692Z();
                return;
            default:
                return;
        }
    }
}
