package com.yeelight.yeelib.authority;

import com.yeelight.yeelib.authority.DeviceAuthorityBase;
import com.yeelight.yeelib.utils.AppUtils;
import p211t3.C10387b;

/* renamed from: com.yeelight.yeelib.authority.a */
public class C6030a extends DeviceAuthorityBase {

    /* renamed from: c */
    protected C10387b f12249c;

    public C6030a(C10387b bVar) {
        this.f12249c = bVar;
    }

    /* renamed from: a */
    public void mo31412a(int i) {
        DeviceAuthorityBase.AuthState authState;
        switch (i) {
            case 1:
                authState = DeviceAuthorityBase.AuthState.AUTH_IP;
                break;
            case 2:
            case 4:
                authState = DeviceAuthorityBase.AuthState.AUTH_SUC;
                break;
            case 3:
            case 5:
            case 6:
            case 7:
                authState = DeviceAuthorityBase.AuthState.AUTH_FAIL;
                break;
            default:
                AppUtils.m8300u("BleAuthority", "invalid auth notify: " + i);
                return;
        }
        mo31416e(authState);
    }

    /* renamed from: d */
    public boolean mo31415d() {
        if (this.f12247a != DeviceAuthorityBase.AuthState.AUTH_UNKNOWN) {
            return true;
        }
        this.f12249c.mo41980A();
        return true;
    }
}
