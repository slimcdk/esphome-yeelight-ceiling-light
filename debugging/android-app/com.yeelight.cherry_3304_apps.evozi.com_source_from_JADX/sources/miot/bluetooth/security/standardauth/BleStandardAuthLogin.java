package miot.bluetooth.security.standardauth;

import android.os.Bundle;
import com.inuker.bluetooth.library.connect.options.BleConnectOptions;
import com.miot.bluetooth.BluetoothConstants;
import miot.bluetooth.security.BleSecurityConnector;
import miot.bluetooth.security.BleSecurityLauncher;
import miot.bluetooth.security.cache.BluetoothCache;
import miot.bluetooth.security.encryption.BleSecurityChipEncrypt;

public class BleStandardAuthLogin extends BleSecurityLauncher {
    private BleStandardAuthLoginConnector mLoginConnector = new BleStandardAuthLoginConnector(this.mLauncher);

    public BleStandardAuthLogin(String str, int i, byte[] bArr, BleConnectOptions bleConnectOptions) {
        super(str, i, bArr, bleConnectOptions);
    }

    private void doPostResult(int i, Bundle bundle) {
        BluetoothCache.setPropSessionKeyBytes(this.mDeviceMac, bundle.getByteArray(BluetoothConstants.KEY_SESSION_KEY));
        BleSecurityChipEncrypt.resetEncryptCounter(this.mDeviceMac);
        notifyBindProcess(BleSecurityLauncher.ACTION_BLE_BIND, i);
        dispatchResult(i);
    }

    /* access modifiers changed from: protected */
    public BleSecurityConnector getSecurityConnector() {
        return this.mLoginConnector;
    }

    /* access modifiers changed from: protected */
    public void onPostConnect(int i, Bundle bundle) {
        doPostResult(i, bundle);
    }
}
