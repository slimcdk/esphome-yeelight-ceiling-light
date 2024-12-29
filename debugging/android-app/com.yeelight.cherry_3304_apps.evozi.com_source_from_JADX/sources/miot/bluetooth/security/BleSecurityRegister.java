package miot.bluetooth.security;

import android.os.Bundle;
import com.miot.bluetooth.BleBindResponse;
import com.miot.bluetooth.BleSecurityStatusResponse;
import com.miot.bluetooth.BluetoothConstants;
import com.miot.bluetooth.MiotBleClient;
import miot.bluetooth.security.cache.BluetoothCache;
import miot.bluetooth.security.rc4.BleRc4Launcher;

public class BleSecurityRegister extends BleRc4Launcher {
    private final BleBindResponse mStrongBindResponse = new BleBindResponse() {
        public void onResponse(int i) {
            if (i == 0) {
                BleSecurityRegister.this.refreshLocalToken();
            }
            BluetoothCache.setPropBoundStatus(BleSecurityRegister.this.mDeviceMac, i == 0 ? 2 : 0);
            BleSecurityRegister.this.notifyBindProcess(BleSecurityLauncher.ACTION_BLE_BIND, i);
            BleSecurityRegister.this.dispatchResult(i);
        }
    };
    private final BleBindResponse mWeakBindResponse = new BleBindResponse() {
        public void onResponse(int i) {
            BleSecurityRegister.this.refreshRemoteBinded(i);
            BleSecurityRegister.this.dispatchResult(0);
        }
    };

    public BleSecurityRegister(String str, int i) {
        super(str, i, (byte[]) null, MiotBleClient.CONNECT_OPTIONS);
    }

    /* access modifiers changed from: private */
    public void refreshLocalToken() {
        BluetoothCache.setPropTokenBytes(this.mDeviceMac, this.mToken);
    }

    public static void register(String str, int i, BleSecurityStatusResponse bleSecurityStatusResponse) {
        new BleSecurityRegister(str, i).start(bleSecurityStatusResponse);
    }

    private void registerForStrongBind() {
        bindDeviceToServer(this.mStrongBindResponse);
    }

    private void registerForWeakBind() {
        refreshLocalToken();
        bindDeviceToServer(this.mWeakBindResponse);
    }

    /* access modifiers changed from: protected */
    public BleSecurityConnector getSecurityConnector() {
        return new BleRegisterConnector(this.mLauncher);
    }

    /* access modifiers changed from: protected */
    public void onPostConnect(int i, Bundle bundle) {
        this.mToken = this.mBundle.getByteArray(BluetoothConstants.KEY_TOKEN);
        if (!shouldBindToServer()) {
            refreshLocalToken();
            notifyBindProcess(BleSecurityLauncher.ACTION_BLE_BIND, 0);
            dispatchResult(i);
            return;
        }
        int bindStyle = getBindStyle();
        if (bindStyle == 1) {
            registerForStrongBind();
        } else if (bindStyle == 2) {
            registerForWeakBind();
        } else {
            throw new IllegalStateException("impossible here");
        }
    }
}
