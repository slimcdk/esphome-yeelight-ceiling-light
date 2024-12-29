package com.yeelight.yeelib.p142ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import com.yeelight.yeelib.R$drawable;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.device.base.C3010c;
import com.yeelight.yeelib.device.base.DeviceStatusBase;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;
import com.yeelight.yeelib.utils.AppUtils;
import p051j4.C9193k;
import p150e4.C8966a;
import p150e4.C8968b;
import p237z3.C12145e;

/* renamed from: com.yeelight.yeelib.ui.activity.BleCfgSettingActivity */
public class BleCfgSettingActivity extends BaseActivity implements View.OnClickListener, C12145e {

    /* renamed from: c */
    private static final String f14442c = BleCfgSettingActivity.class.getSimpleName();

    /* renamed from: a */
    private C3010c f14443a;

    /* renamed from: b */
    private ImageView f14444b;

    /* access modifiers changed from: private */
    /* renamed from: X */
    public /* synthetic */ void m19960X(View view) {
        onBackPressed();
    }

    /* access modifiers changed from: private */
    /* renamed from: Y */
    public /* synthetic */ void m19961Y() {
        int i;
        ImageView imageView;
        if (this.f14443a.mo23221d0().mo31558Q()) {
            imageView = this.f14444b;
            i = R$drawable.icon_yeelight_switch_point_on_new;
        } else {
            imageView = this.f14444b;
            i = R$drawable.icon_yeelight_switch_point_off_new;
        }
        imageView.setImageResource(i);
    }

    /* renamed from: Z */
    private void m19962Z() {
        runOnUiThread(new C8968b(this));
    }

    public void onClick(View view) {
        if (view.getId() == R$id.img_switch) {
            C3010c cVar = this.f14443a;
            cVar.mo23237u(!cVar.mo23221d0().mo31558Q());
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C9193k.m22157h(true, this);
        setContentView(R$layout.activity_ble_cfg_setting);
        this.f14444b = (ImageView) findViewById(R$id.img_switch);
        ((CommonTitleBar) findViewById(R$id.title_bar)).mo36195a(getString(R$string.common_text_bluetooth_mode), new C8966a(this), (View.OnClickListener) null);
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            AppUtils.m8302w(f14442c, "Activity has not device id", false);
            finish();
            return;
        }
        this.f14443a = YeelightDeviceManager.m7794j0(intent.getStringExtra("com.yeelight.cherry.device_id"));
        this.f14444b.setOnClickListener(this);
        m19962Z();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.f14443a.mo23213W0(this);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f14443a.mo23178B0(this);
    }

    public void onStatusChange(int i, DeviceStatusBase deviceStatusBase) {
        if (i == -1 || i == 4096) {
            m19962Z();
        }
    }
}
