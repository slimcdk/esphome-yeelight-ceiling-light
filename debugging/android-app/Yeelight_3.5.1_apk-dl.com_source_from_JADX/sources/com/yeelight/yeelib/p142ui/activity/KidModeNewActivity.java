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
import p237z3.C12145e;

/* renamed from: com.yeelight.yeelib.ui.activity.KidModeNewActivity */
public class KidModeNewActivity extends BaseActivity implements C12145e {

    /* renamed from: d */
    private static final String f14766d = "KidModeNewActivity";

    /* renamed from: a */
    ImageView f14767a;

    /* renamed from: b */
    ImageView f14768b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public WifiDeviceBase f14769c;

    /* renamed from: com.yeelight.yeelib.ui.activity.KidModeNewActivity$a */
    class C8482a implements View.OnClickListener {
        C8482a() {
        }

        public void onClick(View view) {
            KidModeNewActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.KidModeNewActivity$b */
    class C8483b implements View.OnClickListener {
        C8483b() {
        }

        public void onClick(View view) {
            KidModeNewActivity.this.f14769c.mo31486O1(!KidModeNewActivity.this.f14769c.mo23221d0().mo31572X());
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.KidModeNewActivity$c */
    class C8484c implements Runnable {
        C8484c() {
        }

        public void run() {
            int i;
            ImageView imageView;
            if (KidModeNewActivity.this.f14769c.mo23221d0().mo31572X()) {
                imageView = KidModeNewActivity.this.f14768b;
                i = R$drawable.icon_yeelight_switch_point_on_new;
            } else {
                imageView = KidModeNewActivity.this.f14768b;
                i = R$drawable.icon_yeelight_switch_point_off_new;
            }
            imageView.setImageResource(i);
        }
    }

    /* renamed from: W */
    private void m20149W() {
        runOnUiThread(new C8484c());
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo35653P();
        C9193k.m22157h(true, this);
        setContentView(R$layout.activity_kid_mode_new);
        this.f14767a = (ImageView) findViewById(R$id.img_back_view);
        this.f14768b = (ImageView) findViewById(R$id.img_switch_view);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        findViewById(R$id.title_view).setLayoutParams(layoutParams);
        layoutParams.setMargins(0, C9193k.m22154e(this), 0, 0);
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            AppUtils.m8302w(f14766d, "Activity has not device id", false);
            finish();
            return;
        }
        WifiDeviceBase P0 = YeelightDeviceManager.m7800o0().mo23274P0(intent.getStringExtra("com.yeelight.cherry.device_id"));
        this.f14769c = P0;
        if (P0 == null || !P0.mo23145k0()) {
            BaseActivity.m19947U(this);
            finish();
            return;
        }
        this.f14767a.setOnClickListener(new C8482a());
        this.f14768b.setOnClickListener(new C8483b());
        m20149W();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.f14769c.mo23213W0(this);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f14769c.mo23178B0(this);
    }

    public void onStatusChange(int i, DeviceStatusBase deviceStatusBase) {
        if (i == -1 || i == 4096) {
            m20149W();
        }
    }
}
