package com.miot.bluetooth;

import android.os.Bundle;

public interface BleSecurityStatusResponse extends BleSecurityConnectResponse {
    void onAuthResponse(int i, Bundle bundle);

    void onBindResponse(int i, Bundle bundle);

    void onConnectResponse(int i, Bundle bundle);
}
