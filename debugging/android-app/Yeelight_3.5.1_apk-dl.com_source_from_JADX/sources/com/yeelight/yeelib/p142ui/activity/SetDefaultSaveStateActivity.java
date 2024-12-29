package com.yeelight.yeelib.p142ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.yeelight.cherry.p141ui.activity.ComboDeviceControlActivity;
import com.yeelight.cherry.p141ui.activity.DemoControlViewActivity;
import com.yeelight.yeelib.R$color;
import com.yeelight.yeelib.R$drawable;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.device.WifiDeviceBase;
import com.yeelight.yeelib.device.base.C6091a;
import com.yeelight.yeelib.device.base.DeviceStatusBase;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;
import com.yeelight.yeelib.utils.AppUtils;
import p051j4.C9193k;
import p237z3.C12145e;

/* renamed from: com.yeelight.yeelib.ui.activity.SetDefaultSaveStateActivity */
public class SetDefaultSaveStateActivity extends BaseActivity implements C12145e {

    /* renamed from: j */
    private static final String f15198j = "SetDefaultSaveStateActivity";

    /* renamed from: a */
    CommonTitleBar f15199a;

    /* renamed from: b */
    ImageView f15200b;

    /* renamed from: c */
    LinearLayout f15201c;

    /* renamed from: d */
    LinearLayout f15202d;

    /* renamed from: e */
    LinearLayout f15203e;

    /* renamed from: f */
    TextView f15204f;

    /* renamed from: g */
    LinearLayout f15205g;

    /* renamed from: h */
    ImageView f15206h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public WifiDeviceBase f15207i;

    /* renamed from: com.yeelight.yeelib.ui.activity.SetDefaultSaveStateActivity$a */
    class C8628a implements View.OnClickListener {
        C8628a() {
        }

        public void onClick(View view) {
            SetDefaultSaveStateActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.SetDefaultSaveStateActivity$b */
    class C8629b implements View.OnClickListener {
        C8629b() {
        }

        public void onClick(View view) {
            SetDefaultSaveStateActivity.this.f15207i.mo31490S1(!SetDefaultSaveStateActivity.this.f15207i.mo23221d0().mo31586e0());
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.SetDefaultSaveStateActivity$c */
    class C8630c implements View.OnClickListener {
        C8630c() {
        }

        public void onClick(View view) {
            int I = SetDefaultSaveStateActivity.this.f15207i.mo23221d0().mo31542I();
            WifiDeviceBase V = SetDefaultSaveStateActivity.this.f15207i;
            int i = 1;
            if (I == 1) {
                i = 2;
            }
            V.mo31489R1(i);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.SetDefaultSaveStateActivity$d */
    class C8631d implements Runnable {

        /* renamed from: com.yeelight.yeelib.ui.activity.SetDefaultSaveStateActivity$d$a */
        class C8632a implements View.OnClickListener {
            C8632a() {
            }

            public void onClick(View view) {
                Class cls;
                try {
                    if (SetDefaultSaveStateActivity.this.f15207i instanceof C6091a) {
                        cls = ComboDeviceControlActivity.class;
                        int i = ComboDeviceControlActivity.f10016l;
                    } else {
                        cls = DemoControlViewActivity.class;
                        int i2 = DemoControlViewActivity.f10265p;
                    }
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                    cls = null;
                }
                if (cls != null) {
                    Intent intent = new Intent();
                    intent.setClass(SetDefaultSaveStateActivity.this, cls);
                    intent.putExtra("com.yeelight.cherry.device_id", SetDefaultSaveStateActivity.this.f15207i.mo23185G());
                    intent.putExtra("set_device_default", true);
                    SetDefaultSaveStateActivity.this.startActivityForResult(intent, 100);
                }
            }
        }

        C8631d() {
        }

        public void run() {
            C8632a aVar;
            LinearLayout linearLayout;
            int i;
            ImageView imageView;
            if (SetDefaultSaveStateActivity.this.f15207i.mo23221d0().mo31586e0()) {
                SetDefaultSaveStateActivity.this.f15200b.setImageResource(R$drawable.icon_yeelight_switch_point_on_new);
                SetDefaultSaveStateActivity setDefaultSaveStateActivity = SetDefaultSaveStateActivity.this;
                setDefaultSaveStateActivity.f15204f.setTextColor(setDefaultSaveStateActivity.getResources().getColor(R$color.common_text_color_not_clickable_cc));
                linearLayout = SetDefaultSaveStateActivity.this.f15203e;
                aVar = null;
            } else {
                SetDefaultSaveStateActivity.this.f15200b.setImageResource(R$drawable.icon_yeelight_switch_point_off_new);
                SetDefaultSaveStateActivity setDefaultSaveStateActivity2 = SetDefaultSaveStateActivity.this;
                setDefaultSaveStateActivity2.f15204f.setTextColor(setDefaultSaveStateActivity2.getResources().getColor(R$color.common_text_color_primary_33));
                linearLayout = SetDefaultSaveStateActivity.this.f15203e;
                aVar = new C8632a();
            }
            linearLayout.setOnClickListener(aVar);
            if (SetDefaultSaveStateActivity.this.f15207i.mo23229n0(30)) {
                if (SetDefaultSaveStateActivity.this.f15207i.mo23221d0().mo31542I() == 1) {
                    imageView = SetDefaultSaveStateActivity.this.f15206h;
                    i = R$drawable.icon_yeelight_switch_point_on_new;
                } else {
                    imageView = SetDefaultSaveStateActivity.this.f15206h;
                    i = R$drawable.icon_yeelight_switch_point_off_new;
                }
                imageView.setImageResource(i);
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0044, code lost:
        if (android.text.TextUtils.equals(r0.mo23208T(), "yeelink.light.ceiling20") != false) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009a, code lost:
        if (r0.equals("yeelink.light.ceiling21") == false) goto L_0x0071;
     */
    /* renamed from: W */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m20397W() {
        /*
            r5 = this;
            com.yeelight.yeelib.device.WifiDeviceBase r0 = r5.f15207i
            r1 = 30
            boolean r0 = r0.mo23229n0(r1)
            r1 = 8
            r2 = 0
            if (r0 != 0) goto L_0x004c
            android.widget.LinearLayout r0 = r5.f15205g
            r0.setVisibility(r1)
            com.yeelight.yeelib.device.WifiDeviceBase r0 = r5.f15207i
            boolean r3 = r0 instanceof p223w3.C11311k0
            if (r3 == 0) goto L_0x0024
            java.lang.String r0 = r0.mo23208T()
            java.lang.String r3 = "yeelink.light.lamp4"
            boolean r0 = android.text.TextUtils.equals(r0, r3)
            if (r0 == 0) goto L_0x0046
        L_0x0024:
            com.yeelight.yeelib.device.WifiDeviceBase r0 = r5.f15207i
            boolean r3 = r0 instanceof p223w3.C11250j1
            if (r3 != 0) goto L_0x0046
            boolean r3 = r0 instanceof p223w3.C11078h1
            if (r3 != 0) goto L_0x0046
            boolean r3 = r0 instanceof p223w3.C11542p
            if (r3 != 0) goto L_0x0046
            boolean r3 = r0 instanceof p223w3.C11195j
            if (r3 != 0) goto L_0x0046
            boolean r3 = r0 instanceof p223w3.C11363l
            if (r3 == 0) goto L_0x0060
            java.lang.String r0 = r0.mo23208T()
            java.lang.String r3 = "yeelink.light.ceiling20"
            boolean r0 = android.text.TextUtils.equals(r0, r3)
            if (r0 != 0) goto L_0x0060
        L_0x0046:
            android.widget.LinearLayout r0 = r5.f15202d
            r0.setVisibility(r1)
            goto L_0x0060
        L_0x004c:
            android.widget.LinearLayout r0 = r5.f15205g
            r0.setVisibility(r2)
            android.widget.LinearLayout r0 = r5.f15202d
            r0.setVisibility(r2)
            android.widget.ImageView r0 = r5.f15206h
            com.yeelight.yeelib.ui.activity.SetDefaultSaveStateActivity$c r3 = new com.yeelight.yeelib.ui.activity.SetDefaultSaveStateActivity$c
            r3.<init>()
            r0.setOnClickListener(r3)
        L_0x0060:
            com.yeelight.yeelib.device.WifiDeviceBase r0 = r5.f15207i
            java.lang.String r0 = r0.mo23208T()
            r0.hashCode()
            r3 = -1
            int r4 = r0.hashCode()
            switch(r4) {
                case -1462015159: goto L_0x0094;
                case -1462015158: goto L_0x0089;
                case -1462015157: goto L_0x007e;
                case 922669547: goto L_0x0073;
                default: goto L_0x0071;
            }
        L_0x0071:
            r2 = -1
            goto L_0x009d
        L_0x0073:
            java.lang.String r2 = "yeelink.light.ceiling5"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x007c
            goto L_0x0071
        L_0x007c:
            r2 = 3
            goto L_0x009d
        L_0x007e:
            java.lang.String r2 = "yeelink.light.ceiling23"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0087
            goto L_0x0071
        L_0x0087:
            r2 = 2
            goto L_0x009d
        L_0x0089:
            java.lang.String r2 = "yeelink.light.ceiling22"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0092
            goto L_0x0071
        L_0x0092:
            r2 = 1
            goto L_0x009d
        L_0x0094:
            java.lang.String r4 = "yeelink.light.ceiling21"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x009d
            goto L_0x0071
        L_0x009d:
            switch(r2) {
                case 0: goto L_0x00a1;
                case 1: goto L_0x00a1;
                case 2: goto L_0x00a1;
                case 3: goto L_0x00a1;
                default: goto L_0x00a0;
            }
        L_0x00a0:
            goto L_0x00a6
        L_0x00a1:
            android.widget.LinearLayout r0 = r5.f15201c
            r0.setVisibility(r1)
        L_0x00a6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p142ui.activity.SetDefaultSaveStateActivity.m20397W():void");
    }

    /* renamed from: X */
    private void m20398X() {
        runOnUiThread(new C8631d());
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 100 && i2 == -1 && this.f15207i.mo23160t1()) {
            Toast.makeText(this, getText(R$string.save_default_msg_save_success).toString(), 0).show();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo35653P();
        C9193k.m22157h(true, this);
        setContentView(R$layout.activity_set_default);
        this.f15199a = (CommonTitleBar) findViewById(R$id.title_bar);
        this.f15200b = (ImageView) findViewById(R$id.img_switch_view);
        this.f15202d = (LinearLayout) findViewById(R$id.automatic_recovery_layout);
        this.f15203e = (LinearLayout) findViewById(R$id.default_state_layout);
        this.f15204f = (TextView) findViewById(R$id.default_state_title);
        this.f15205g = (LinearLayout) findViewById(R$id.automatic_power_on);
        this.f15206h = (ImageView) findViewById(R$id.img_switch_on_from_power);
        this.f15201c = (LinearLayout) findViewById(R$id.ll_recover);
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            AppUtils.m8302w(f15198j, "Activity has not device id", false);
            finish();
            return;
        }
        WifiDeviceBase P0 = YeelightDeviceManager.m7800o0().mo23274P0(intent.getStringExtra("com.yeelight.cherry.device_id"));
        this.f15207i = P0;
        if (P0 == null) {
            BaseActivity.m19947U(this);
            finish();
            return;
        }
        this.f15199a.mo36195a(getString(R$string.feature_set_default), new C8628a(), (View.OnClickListener) null);
        this.f15199a.setTitleTextSize(16);
        this.f15200b.setOnClickListener(new C8629b());
        m20397W();
        m20398X();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.f15207i.mo23213W0(this);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        if (this.f15207i.mo23145k0()) {
            this.f15207i.mo23178B0(this);
            this.f15207i.mo23167x0();
            return;
        }
        finish();
    }

    public void onStatusChange(int i, DeviceStatusBase deviceStatusBase) {
        if (i == -1 || i == 4096) {
            m20398X();
        }
    }
}
