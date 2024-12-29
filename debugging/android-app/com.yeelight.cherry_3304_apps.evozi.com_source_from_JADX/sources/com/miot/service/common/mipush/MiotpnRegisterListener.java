package com.miot.service.common.mipush;

public interface MiotpnRegisterListener {
    void onRegisterFailed(long j, String str);

    void onRegisterSucceed(String str);
}
