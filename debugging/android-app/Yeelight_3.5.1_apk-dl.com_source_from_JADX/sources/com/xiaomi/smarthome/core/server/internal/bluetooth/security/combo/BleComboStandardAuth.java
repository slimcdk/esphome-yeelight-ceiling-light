package com.xiaomi.smarthome.core.server.internal.bluetooth.security.combo;

import android.os.Bundle;
import com.inuker.bluetooth.library.connect.options.BleConnectOptions;
import com.miot.bluetooth.BluetoothConstants;
import miot.bluetooth.security.BleSecurityConnector;
import miot.bluetooth.security.BleSecurityLauncher;

public class BleComboStandardAuth extends BleSecurityLauncher {
    private BleComboStandardAuthConnector mAuthConnector;

    public BleComboStandardAuth(String str, int i, BleComboWifiConfig bleComboWifiConfig, BleConnectOptions bleConnectOptions) {
        super(str, i, bleConnectOptions);
        this.mAuthConnector = new BleComboStandardAuthConnector(this.mLauncher, bleComboWifiConfig);
    }

    /* access modifiers changed from: protected */
    public BleSecurityConnector getSecurityConnector() {
        return this.mAuthConnector;
    }

    /* access modifiers changed from: protected */
    public void onPostConnect(int i, Bundle bundle) {
        Bundle bundle2 = this.mBundle;
        if (bundle2 != null) {
            bundle2.putString(BluetoothConstants.KEY_DEVICE_DID, this.mAuthConnector.getDidText());
        }
        if (i == 0) {
            notifyBindProcess(BleSecurityLauncher.ACTION_BLE_BIND, 0);
        }
        dispatchResult(i);
    }
}
