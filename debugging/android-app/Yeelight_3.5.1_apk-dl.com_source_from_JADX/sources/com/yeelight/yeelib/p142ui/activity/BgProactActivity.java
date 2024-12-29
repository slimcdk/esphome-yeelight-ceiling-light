package com.yeelight.yeelib.p142ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
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

/* renamed from: com.yeelight.yeelib.ui.activity.BgProactActivity */
public class BgProactActivity extends BaseActivity implements C12145e {
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final String f14434e = SetDefaultSaveStateActivity.class.getSimpleName();

    /* renamed from: a */
    CommonTitleBar f14435a;

    /* renamed from: b */
    ImageView f14436b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public WifiDeviceBase f14437c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public long f14438d = 0;

    /* renamed from: com.yeelight.yeelib.ui.activity.BgProactActivity$a */
    class C8367a implements View.OnClickListener {
        C8367a() {
        }

        public void onClick(View view) {
            BgProactActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.BgProactActivity$b */
    class C8368b implements View.OnClickListener {
        C8368b() {
        }

        public void onClick(View view) {
            if (System.currentTimeMillis() - BgProactActivity.this.f14438d >= 800) {
                long unused = BgProactActivity.this.f14438d = System.currentTimeMillis();
                if (BgProactActivity.this.f14437c instanceof C6091a) {
                    ((C6091a) BgProactActivity.this.f14437c).mo31660n2(!BgProactActivity.this.f14437c.mo23221d0().mo31599l());
                } else {
                    AppUtils.m8300u(BgProactActivity.f14434e, "Invalid device type!");
                }
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.BgProactActivity$c */
    class C8369c implements Runnable {
        C8369c() {
        }

        public void run() {
            int i;
            ImageView imageView;
            if (BgProactActivity.this.f14437c.mo23221d0().mo31599l()) {
                imageView = BgProactActivity.this.f14436b;
                i = R$drawable.icon_yeelight_switch_point_on_new;
            } else {
                imageView = BgProactActivity.this.f14436b;
                i = R$drawable.icon_yeelight_switch_point_off_new;
            }
            imageView.setImageResource(i);
        }
    }

    /* renamed from: Z */
    private void m19957Z() {
        runOnUiThread(new C8369c());
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo35653P();
        C9193k.m22157h(true, this);
        setContentView(R$layout.activity_bg_proact);
        this.f14435a = (CommonTitleBar) findViewById(R$id.title_bar);
        this.f14436b = (ImageView) findViewById(R$id.img_switch_ambi_setting);
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            AppUtils.m8302w(f14434e, "Activity has not device id", false);
            finish();
            return;
        }
        WifiDeviceBase P0 = YeelightDeviceManager.m7800o0().mo23274P0(intent.getStringExtra("com.yeelight.cherry.device_id"));
        this.f14437c = P0;
        if (P0 == null) {
            BaseActivity.m19947U(this);
            finish();
            return;
        }
        this.f14435a.mo36195a(getString(R$string.settings_feature_ambi_title), new C8367a(), (View.OnClickListener) null);
        this.f14435a.setTitleTextSize(16);
        m19957Z();
        this.f14436b.setOnClickListener(new C8368b());
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.f14437c.mo23213W0(this);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f14437c.mo23178B0(this);
        this.f14437c.mo23167x0();
    }

    public void onStatusChange(int i, DeviceStatusBase deviceStatusBase) {
        if (i == -1 || i == 4096) {
            m19957Z();
        }
    }
}
