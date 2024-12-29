package com.yeelight.yeelib.authority;

import com.yeelight.yeelib.authority.DeviceAuthorityBase;
import com.yeelight.yeelib.utils.AppUtils;

/* renamed from: com.yeelight.yeelib.authority.b */
public class C6031b extends DeviceAuthorityBase {
    /* renamed from: a */
    public void mo31412a(int i) {
        DeviceAuthorityBase.AuthState authState;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (!(i == 6 || i == 7)) {
                            AppUtils.m8300u("WifiAuthority", "invalid auth notify: " + i);
                            mo31413b();
                        }
                    }
                }
                authState = DeviceAuthorityBase.AuthState.AUTH_FAIL;
            }
            authState = DeviceAuthorityBase.AuthState.AUTH_SUC;
        } else {
            authState = DeviceAuthorityBase.AuthState.AUTH_IP;
        }
        this.f12247a = authState;
        mo31413b();
    }

    /* renamed from: d */
    public boolean mo31415d() {
        this.f12247a = DeviceAuthorityBase.AuthState.AUTH_IP;
        mo31413b();
        return true;
    }
}
