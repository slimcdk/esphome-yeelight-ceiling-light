package miot.bluetooth.security;

import android.os.Bundle;
import com.inuker.bluetooth.library.utils.BluetoothLog;
import com.miot.bluetooth.BleBindResponse;
import com.miot.bluetooth.BleSecurityStatusResponse;
import com.miot.bluetooth.MiotBleClient;
import miot.bluetooth.security.cache.BluetoothCache;
import miot.bluetooth.security.rc4.BleRc4Launcher;

public class BleSecurityLogin extends BleRc4Launcher {
    public BleSecurityLogin(String str, int i, byte[] bArr) {
        super(str, i, bArr, MiotBleClient.CONNECT_OPTIONS);
    }

    public static void login(String str, int i, byte[] bArr, BleSecurityStatusResponse bleSecurityStatusResponse) {
        new BleSecurityLogin(str, i, bArr).start(bleSecurityStatusResponse);
    }

    private void loginForStrongBind(int i) {
        BluetoothLog.m10339w("loginForStrongBind " + i);
        notifyBindProcess(BleSecurityLauncher.ACTION_BLE_BIND, 0);
        dispatchResult(i);
    }

    private void loginForWeakBind(final int i) {
        if (BluetoothCache.getPropBoundStatus(this.mDeviceMac) != 2) {
            BluetoothLog.m10339w("loginForWeakBind, remoteBinded false");
            bindDeviceToServer(new BleBindResponse() {
                public void onResponse(int i) {
                    BleSecurityLogin.this.refreshRemoteBinded(i);
                    BleSecurityLogin.this.notifyBindProcess(BleSecurityLauncher.ACTION_BLE_BIND, i);
                    BleSecurityLogin.this.dispatchResult(i);
                }
            });
            return;
        }
        BluetoothLog.m10339w("loginForWeakBind, remoteBinded true");
        notifyBindProcess(BleSecurityLauncher.ACTION_BLE_BIND, 0);
        dispatchResult(i);
    }

    /* access modifiers changed from: protected */
    public BleSecurityConnector getSecurityConnector() {
        return new BleLoginConnector(this.mLauncher);
    }

    /* access modifiers changed from: protected */
    public void onPostConnect(int i, Bundle bundle) {
        if (!shouldBindToServer()) {
            notifyBindProcess(BleSecurityLauncher.ACTION_BLE_BIND, 0);
            dispatchResult(i);
            return;
        }
        int bindStyle = getBindStyle();
        if (bindStyle == 1) {
            loginForStrongBind(i);
        } else if (bindStyle == 2) {
            loginForWeakBind(i);
        } else {
            throw new IllegalStateException("impossible here");
        }
    }
}
