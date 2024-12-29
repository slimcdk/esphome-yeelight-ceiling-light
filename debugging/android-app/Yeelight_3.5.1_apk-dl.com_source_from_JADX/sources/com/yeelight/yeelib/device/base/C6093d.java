package com.yeelight.yeelib.device.base;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.p142ui.activity.BlankActivity;
import com.yeelight.yeelib.p142ui.view.RedSpotTipTextView;
import p227x3.C11969f;
import p237z3.C12145e;

/* renamed from: com.yeelight.yeelib.device.base.d */
public abstract class C6093d implements C12145e {

    /* renamed from: a */
    protected RedSpotTipTextView f12505a;

    /* renamed from: b */
    protected int f12506b;

    /* renamed from: c */
    protected String f12507c;

    /* renamed from: d */
    protected boolean f12508d = false;

    /* renamed from: e */
    protected boolean f12509e = false;

    /* renamed from: f */
    protected String f12510f;

    /* renamed from: g */
    protected final int f12511g;

    public C6093d(int i, String str, int i2, String str2) {
        this.f12506b = i;
        this.f12507c = str;
        this.f12511g = i2;
        this.f12510f = str2;
        this.f12509e = false;
    }

    public C6093d(int i, String str, int i2, String str2, boolean z) {
        this.f12506b = i;
        this.f12507c = str;
        this.f12511g = i2;
        this.f12510f = str2;
        this.f12509e = z;
    }

    /* renamed from: a */
    public abstract View mo31681a(Activity activity, C3010c cVar);

    /* renamed from: b */
    public abstract void mo31682b();

    /* renamed from: c */
    public abstract void mo31683c(C3010c cVar);

    /* renamed from: d */
    public int mo31684d() {
        return this.f12511g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public C11969f mo31685e(DeviceStatusBase deviceStatusBase) {
        return deviceStatusBase.mo31613s();
    }

    /* renamed from: f */
    public int mo31686f() {
        return this.f12506b;
    }

    /* renamed from: g */
    public String mo31687g() {
        return this.f12507c;
    }

    /* renamed from: h */
    public abstract Class mo31688h();

    /* renamed from: i */
    public C3010c mo31689i() {
        return YeelightDeviceManager.m7794j0(this.f12510f);
    }

    /* renamed from: j */
    public abstract boolean mo31690j();

    /* renamed from: k */
    public boolean mo31691k(C3010c cVar) {
        return false;
    }

    /* renamed from: l */
    public boolean mo31692l() {
        return this.f12509e;
    }

    /* renamed from: m */
    public void mo31693m() {
        this.f12508d = false;
    }

    /* renamed from: n */
    public void mo31694n(boolean z) {
        this.f12505a.mo36489a(z);
    }

    /* renamed from: o */
    public void mo31695o(Activity activity, String str) {
        Class<BlankActivity> h = mo31688h();
        if (h == null) {
            h = BlankActivity.class;
        }
        Intent intent = new Intent();
        intent.setClass(activity, h);
        intent.putExtra("com.yeelight.cherry.device_id", str);
        activity.startActivity(intent);
    }

    /* renamed from: p */
    public void mo31696p(Activity activity, String str, int i) {
        Class<BlankActivity> h = mo31688h();
        if (h == null) {
            h = BlankActivity.class;
        }
        Intent intent = new Intent();
        intent.setClass(activity, h);
        intent.putExtra("com.yeelight.cherry.device_id", str);
        intent.putExtra("device_lamp_mode", i);
        activity.startActivity(intent);
    }
}
