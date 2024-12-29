package miot.bluetooth.security;

import android.os.Bundle;

public interface IBleDeviceLauncher {
    String getDeviceMac();

    int getDeviceProductId();

    byte[] getDeviceToken();

    void notifyAuthProcess(int i, Bundle bundle);

    void notifyConnectProcess(int i, Bundle bundle);
}
