package miot.bluetooth.security;

import android.os.Bundle;
import com.miot.bluetooth.BleSecurityStatusResponse;
import com.miot.bluetooth.BluetoothConstants;
import miot.bluetooth.security.cache.BluetoothCache;

public class BleMeshLogin extends BleSecurityLauncher {
    private BleMeshLoginConnector mLoginConnector;

    public BleMeshLogin(String str, int i, byte[] bArr) {
        super(str, i, bArr);
        this.mLoginConnector = new BleMeshLoginConnector(this.mLauncher, bArr);
    }

    public static void register(String str, int i, byte[] bArr, BleSecurityStatusResponse bleSecurityStatusResponse) {
        new BleMeshLogin(str, i, bArr).start(bleSecurityStatusResponse);
    }

    /* access modifiers changed from: protected */
    public BleSecurityConnector getSecurityConnector() {
        return this.mLoginConnector;
    }

    /* access modifiers changed from: protected */
    public void onPostConnect(int i, Bundle bundle) {
        BluetoothCache.setPropSessionKeyBytes(this.mDeviceMac, bundle.getByteArray(BluetoothConstants.KEY_SESSION_KEY));
        notifyBindProcess(BleSecurityLauncher.ACTION_BLE_BIND, i);
        dispatchResult(i);
    }
}
