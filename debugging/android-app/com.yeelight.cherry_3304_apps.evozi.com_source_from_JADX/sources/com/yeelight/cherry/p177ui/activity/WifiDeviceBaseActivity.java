package com.yeelight.cherry.p177ui.activity;

import android.os.Bundle;
import com.miot.common.abstractdevice.AbstractDevice;
import com.yeelight.yeelib.p150c.C6006h;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p194ui.activity.BaseActivity;
import com.yeelight.yeelib.utils.C4308b;

/* renamed from: com.yeelight.cherry.ui.activity.WifiDeviceBaseActivity */
public class WifiDeviceBaseActivity extends BaseActivity {

    /* renamed from: e */
    private static final String f11915e = WifiDeviceBaseActivity.class.getSimpleName();

    /* renamed from: b */
    protected String f11916b = null;

    /* renamed from: c */
    protected C6006h f11917c;

    /* renamed from: d */
    protected AbstractDevice f11918d;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f11916b = getIntent().getStringExtra("com.yeelight.cherry.device_id");
        C6006h L0 = C4257w.m11947l0().mo23651L0(this.f11916b);
        this.f11917c = L0;
        if (L0 == null) {
            C4308b.m12139r(f11915e, "Device not found in Device Manager!");
        }
        AbstractDevice S = this.f11917c.mo23393S();
        this.f11918d = S;
        if (S == null) {
            C4308b.m12139r(f11915e, "MiDevice is null!");
        }
        Object[] objArr = new Object[2];
        objArr[0] = this.f11917c.mo23397U();
        objArr[1] = this.f11918d.isOnline() ? "(Accessable)" : "(New Device)";
        setTitle(String.format("%s %s", objArr));
    }
}
