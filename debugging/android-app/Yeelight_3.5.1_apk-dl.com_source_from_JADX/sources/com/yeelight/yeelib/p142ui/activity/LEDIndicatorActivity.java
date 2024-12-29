package com.yeelight.yeelib.p142ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.yeelight.yeelib.R$drawable;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.device.WifiDeviceBase;
import com.yeelight.yeelib.device.base.DeviceStatusBase;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.utils.AppUtils;
import p051j4.C9193k;
import p223w3.C11571p0;
import p237z3.C12145e;

/* renamed from: com.yeelight.yeelib.ui.activity.LEDIndicatorActivity */
public class LEDIndicatorActivity extends BaseActivity implements C12145e {

    /* renamed from: e */
    private static final String f14776e = "LEDIndicatorActivity";

    /* renamed from: a */
    ImageView f14777a;

    /* renamed from: b */
    ImageView f14778b;

    /* renamed from: c */
    ImageView f14779c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public WifiDeviceBase f14780d;

    /* renamed from: com.yeelight.yeelib.ui.activity.LEDIndicatorActivity$a */
    class C8485a implements View.OnClickListener {
        C8485a() {
        }

        public void onClick(View view) {
            LEDIndicatorActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.LEDIndicatorActivity$b */
    class C8486b implements View.OnClickListener {
        C8486b() {
        }

        public void onClick(View view) {
            LEDIndicatorActivity.this.f14780d.mo23249v1(!LEDIndicatorActivity.this.f14780d.mo23221d0().mo31576Z());
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.LEDIndicatorActivity$c */
    class C8487c implements Runnable {
        C8487c() {
        }

        public void run() {
            ImageView imageView;
            int i;
            boolean Z = LEDIndicatorActivity.this.f14780d.mo23221d0().mo31576Z();
            LEDIndicatorActivity.this.f14778b.setImageResource(Z ? R$drawable.icon_yeelight_switch_point_on_new : R$drawable.icon_yeelight_switch_point_off_new);
            if (LEDIndicatorActivity.this.f14780d instanceof C11571p0) {
                imageView = LEDIndicatorActivity.this.f14779c;
                i = Z ? R$drawable.icon_yeelight_gateway_led_indicator_on_bg : R$drawable.icon_yeelight_gateway_led_indicator_off_bg;
            } else {
                imageView = LEDIndicatorActivity.this.f14779c;
                i = Z ? R$drawable.icon_yeelight_led_indicator_on_bg : R$drawable.icon_yeelight_led_indicator_off_bg;
            }
            imageView.setImageResource(i);
        }
    }

    /* renamed from: W */
    private void m20156W() {
        runOnUiThread(new C8487c());
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo35653P();
        C9193k.m22157h(true, this);
        setContentView(R$layout.activity_led_indicator);
        this.f14777a = (ImageView) findViewById(R$id.img_back_view);
        this.f14778b = (ImageView) findViewById(R$id.img_switch_view);
        this.f14779c = (ImageView) findViewById(R$id.led_indicator_bg);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        findViewById(R$id.title_view).setLayoutParams(layoutParams);
        layoutParams.setMargins(0, C9193k.m22154e(this), 0, 0);
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            AppUtils.m8302w(f14776e, "Activity has not device id", false);
            finish();
            return;
        }
        WifiDeviceBase P0 = YeelightDeviceManager.m7800o0().mo23274P0(intent.getStringExtra("com.yeelight.cherry.device_id"));
        this.f14780d = P0;
        if (P0 == null || !P0.mo23145k0()) {
            BaseActivity.m19947U(this);
            finish();
            return;
        }
        this.f14777a.setOnClickListener(new C8485a());
        this.f14778b.setOnClickListener(new C8486b());
        m20156W();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.f14780d.mo23213W0(this);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f14780d.mo23178B0(this);
    }

    public void onStatusChange(int i, DeviceStatusBase deviceStatusBase) {
        if (i == -1 || i == 4096) {
            m20156W();
        }
    }
}
