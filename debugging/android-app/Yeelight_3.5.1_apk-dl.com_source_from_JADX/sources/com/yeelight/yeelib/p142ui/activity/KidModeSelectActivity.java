package com.yeelight.yeelib.p142ui.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.device.WifiDeviceBase;
import com.yeelight.yeelib.device.base.DeviceStatusBase;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;
import p051j4.C9193k;
import p150e4.C8987p;
import p150e4.C8988q;
import p237z3.C12145e;

/* renamed from: com.yeelight.yeelib.ui.activity.KidModeSelectActivity */
public class KidModeSelectActivity extends BaseActivity implements View.OnClickListener, C12145e {

    /* renamed from: a */
    private ImageView f14773a;

    /* renamed from: b */
    private ImageView f14774b;

    /* renamed from: c */
    private WifiDeviceBase f14775c;

    /* access modifiers changed from: private */
    /* renamed from: X */
    public /* synthetic */ void m20152X(View view) {
        finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: Y */
    public /* synthetic */ void m20153Y() {
        boolean Y = this.f14775c.mo23221d0().mo31574Y();
        int i = 0;
        this.f14773a.setVisibility(Y ? 0 : 4);
        ImageView imageView = this.f14774b;
        if (Y) {
            i = 4;
        }
        imageView.setVisibility(i);
    }

    /* renamed from: Z */
    private void m20154Z() {
        runOnUiThread(new C8988q(this));
    }

    public void onClick(View view) {
        WifiDeviceBase wifiDeviceBase;
        boolean z;
        int id = view.getId();
        if (id == R$id.rl_kids_mode) {
            wifiDeviceBase = this.f14775c;
            z = true;
        } else if (id == R$id.rl_adult_mode) {
            wifiDeviceBase = this.f14775c;
            z = false;
        } else {
            return;
        }
        wifiDeviceBase.mo31487P1(z);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C9193k.m22157h(true, this);
        if (getIntent().hasExtra("com.yeelight.cherry.device_id")) {
            this.f14775c = YeelightDeviceManager.m7800o0().mo23274P0(getIntent().getStringExtra("com.yeelight.cherry.device_id"));
        }
        if (this.f14775c == null) {
            finish();
            return;
        }
        setContentView(R$layout.activity_kid_mode_select);
        this.f14773a = (ImageView) findViewById(R$id.img_kids_mode);
        this.f14774b = (ImageView) findViewById(R$id.img_adult_mode);
        findViewById(R$id.rl_kids_mode).setOnClickListener(this);
        findViewById(R$id.rl_adult_mode).setOnClickListener(this);
        ((CommonTitleBar) findViewById(R$id.title_bar)).mo36195a(getString(R$string.vision_mode_selection), new C8987p(this), (View.OnClickListener) null);
        m20154Z();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.f14775c.mo23213W0(this);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f14775c.mo23178B0(this);
    }

    public void onStatusChange(int i, DeviceStatusBase deviceStatusBase) {
        if (i == 4096) {
            m20154Z();
        }
    }
}
