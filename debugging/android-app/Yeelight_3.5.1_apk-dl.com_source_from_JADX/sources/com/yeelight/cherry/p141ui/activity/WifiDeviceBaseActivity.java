package com.yeelight.cherry.p141ui.activity;

import android.os.Bundle;
import com.miot.common.abstractdevice.AbstractDevice;
import com.yeelight.yeelib.device.WifiDeviceBase;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.p142ui.activity.BaseActivity;
import com.yeelight.yeelib.utils.AppUtils;

/* renamed from: com.yeelight.cherry.ui.activity.WifiDeviceBaseActivity */
public class WifiDeviceBaseActivity extends BaseActivity {

    /* renamed from: d */
    private static final String f11489d = "WifiDeviceBaseActivity";

    /* renamed from: a */
    protected String f11490a = null;

    /* renamed from: b */
    protected WifiDeviceBase f11491b;

    /* renamed from: c */
    protected AbstractDevice f11492c;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f11490a = getIntent().getStringExtra("com.yeelight.cherry.device_id");
        WifiDeviceBase P0 = YeelightDeviceManager.m7800o0().mo23274P0(this.f11490a);
        this.f11491b = P0;
        if (P0 == null) {
            AppUtils.m8300u(f11489d, "Device not found in Device Manager!");
        }
        AbstractDevice S = this.f11491b.mo23206S();
        this.f11492c = S;
        if (S == null) {
            AppUtils.m8300u(f11489d, "MiDevice is null!");
        }
        Object[] objArr = new Object[2];
        objArr[0] = this.f11491b.mo23210U();
        objArr[1] = this.f11492c.isOnline() ? "(Accessable)" : "(New Device)";
        setTitle(String.format("%s %s", objArr));
    }
}
