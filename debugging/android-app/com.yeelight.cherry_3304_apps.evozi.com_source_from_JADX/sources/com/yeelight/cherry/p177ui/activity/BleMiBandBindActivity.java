package com.yeelight.cherry.p177ui.activity;

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
import com.yeelight.cherry.C11744R$drawable;
import com.yeelight.cherry.C11745R$id;
import com.yeelight.cherry.C11748R$layout;
import com.yeelight.yeelib.device.models.C7616d;
import com.yeelight.yeelib.p150c.p151i.C6024e;
import com.yeelight.yeelib.p150c.p183m.C7186q;
import com.yeelight.yeelib.p150c.p184n.C7551c;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p186e.C9770e;
import com.yeelight.yeelib.p194ui.activity.BaseActivity;
import com.yeelight.yeelib.p194ui.widget.C10526e;
import com.yeelight.yeelib.utils.C10547m;
import com.yeelight.yeelib.utils.C4308b;

/* renamed from: com.yeelight.cherry.ui.activity.BleMiBandBindActivity */
public class BleMiBandBindActivity extends BaseActivity implements C9770e {

    /* renamed from: f */
    private static final String f10360f = BleMiBandBindActivity.class.getSimpleName();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C7186q f10361b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C7616d f10362c;

    /* renamed from: d */
    private boolean f10363d;
    /* access modifiers changed from: private */
    @SuppressLint({"HandlerLeak"})

    /* renamed from: e */
    public Handler f10364e = new C5008a();
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

    /* renamed from: com.yeelight.cherry.ui.activity.BleMiBandBindActivity$a */
    class C5008a extends Handler {
        C5008a() {
        }

        public void handleMessage(Message message) {
            if (message.what == 7) {
                BleMiBandBindActivity.this.m16006e0(false);
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.BleMiBandBindActivity$b */
    class C5009b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f10366a;

        /* renamed from: b */
        final /* synthetic */ C6024e f10367b;

        /* renamed from: com.yeelight.cherry.ui.activity.BleMiBandBindActivity$b$a */
        class C5010a implements Runnable {
            C5010a() {
            }

            public void run() {
                BleMiBandBindActivity.this.f10361b.mo28617A2();
            }
        }

        C5009b(int i, C6024e eVar) {
            this.f10366a = i;
            this.f10367b = eVar;
        }

        public void run() {
            BleMiBandBindActivity bleMiBandBindActivity;
            int i = this.f10366a;
            boolean z = false;
            if (i == 8192) {
                BleMiBandBindActivity.this.f10364e.removeMessages(7);
                C7616d unused = BleMiBandBindActivity.this.f10362c = ((C7551c) this.f10367b).mo28870X0();
                if (BleMiBandBindActivity.this.f10362c.mo29061a() == null) {
                    bleMiBandBindActivity = BleMiBandBindActivity.this;
                } else {
                    bleMiBandBindActivity = BleMiBandBindActivity.this;
                    z = true;
                }
                bleMiBandBindActivity.m16006e0(z);
            } else if (i == 16384) {
                BleMiBandBindActivity.this.m16006e0(false);
                BleMiBandBindActivity.this.f10364e.postDelayed(new C5010a(), 1000);
            } else if (i == 32768) {
                BleMiBandBindActivity.this.f10361b.mo28617A2();
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.BleMiBandBindActivity$c */
    class C5011c implements Runnable {
        C5011c() {
        }

        public void run() {
            BleMiBandBindActivity.this.mLlSleepOff.setEnabled(true);
        }
    }

    /* renamed from: c0 */
    private void m16005c0() {
        C10526e.C10531e eVar = new C10526e.C10531e(this);
        eVar.mo33357h(2131755891);
        eVar.mo33355f(2131755870);
        eVar.mo33353d(-2, getString(2131755229), (DialogInterface.OnClickListener) null);
        eVar.mo33353d(-1, getString(2131755277), new C5720i(this));
        eVar.mo33351b().show();
    }

    /* access modifiers changed from: private */
    /* renamed from: e0 */
    public void m16006e0(boolean z) {
        int i = 4;
        boolean z2 = false;
        this.mLlSleepOff.setVisibility(z ? 0 : 4);
        this.mTvRelieveBind.setVisibility(z ? 0 : 4);
        Button button = this.mBtnBindBand;
        if (!z) {
            i = 0;
        }
        button.setVisibility(i);
        this.mTvIntroduce.setText(z ? 2131755909 : 2131755889);
        if (z) {
            C7616d dVar = this.f10362c;
            if (dVar != null && dVar.mo29062b()) {
                z2 = true;
            }
            this.f10363d = z2;
            this.mImgSleepSwitch.setImageResource(z2 ? C11744R$drawable.icon_yeelight_band_switch_on : C11744R$drawable.icon_yeelight_band_switch_off);
        }
    }

    /* renamed from: a0 */
    public /* synthetic */ void mo26131a0(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        mo26133d0();
    }

    /* renamed from: b0 */
    public void mo26132b0(boolean z) {
        this.f10361b.mo28630u2(z);
        this.mImgSleepSwitch.setImageResource(z ? C11744R$drawable.icon_yeelight_band_switch_on : C11744R$drawable.icon_yeelight_band_switch_off);
        this.f10361b.mo28617A2();
    }

    /* renamed from: d0 */
    public void mo26133d0() {
        C7616d dVar = this.f10362c;
        if (!(dVar == null || dVar.mo29061a() == null)) {
            try {
                String[] split = this.f10362c.mo29061a().split("#");
                this.f10361b.mo28628s2(split[0], split[1], split[2]);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        m16006e0(false);
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
            C4308b.m12141t(f10360f, "Activity has not device id", false);
            finish();
            return;
        }
        C7186q qVar = (C7186q) C4257w.m11947l0().mo23668g0(intent.getStringExtra("com.yeelight.cherry.device_id"));
        this.f10361b = qVar;
        if (qVar == null || !qVar.mo23331k0()) {
            BaseActivity.m24384U(this);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        C7186q qVar = this.f10361b;
        if (qVar != null) {
            qVar.mo23365B0(this);
            this.f10361b.mo28617A2();
            this.f10364e.sendEmptyMessageDelayed(7, 1500);
            return;
        }
        finish();
    }

    public void onStatusChange(int i, C6024e eVar) {
        runOnUiThread(new C5009b(i, eVar));
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        C7186q qVar = this.f10361b;
        if (qVar != null) {
            qVar.mo23400W0(this);
        }
    }

    @OnClick({2131296772, 2131296977, 2131296401, 2131297496})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case C11745R$id.btn_bind_band:
                Intent intent = new Intent(this, MiBandOpenBluetoothActivity.class);
                intent.putExtra("deviceType", 2);
                intent.putExtra("com.yeelight.cherry.device_id", this.f10361b.mo23372G());
                startActivity(intent);
                return;
            case 2131296772:
                finish();
                return;
            case C11745R$id.ll_sleep_off:
                this.mLlSleepOff.setEnabled(false);
                boolean z = !this.f10363d;
                this.f10363d = z;
                mo26132b0(z);
                this.mLlSleepOff.postDelayed(new C5011c(), 500);
                return;
            case C11745R$id.tv_relieve_bind:
                m16005c0();
                return;
            default:
                return;
        }
    }
}
