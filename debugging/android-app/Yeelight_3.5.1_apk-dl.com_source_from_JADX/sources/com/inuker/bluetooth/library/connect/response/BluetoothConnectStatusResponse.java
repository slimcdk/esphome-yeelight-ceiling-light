package com.inuker.bluetooth.library.connect.response;

import android.os.Bundle;
import com.inuker.bluetooth.library.utils.BluetoothLog;
import com.miot.api.IResponse;
import miot.bluetooth.security.BleSecurityLauncher;

public abstract class BluetoothConnectStatusResponse extends IResponse.Stub {
    public static final String KEY_ACTION = "key.action.bluetooth.connect.status";

    public abstract void onAuthResponse(int i, Bundle bundle);

    public abstract void onBindResponse(int i, Bundle bundle);

    public abstract void onCallback(int i, Bundle bundle);

    public abstract void onConnectResponse(int i, Bundle bundle);

    public final void onResponse(int i, Bundle bundle) {
        if (bundle == null) {
            onCallback(i, (Bundle) null);
            return;
        }
        String string = bundle.getString(KEY_ACTION);
        BluetoothLog.m7328d("BluetoothConnectStatusResponse onResponse ,action= " + string + ",data=" + bundle.toString());
        if (BleSecurityLauncher.ACTION_BLE_AUTH.equals(string)) {
            onAuthResponse(i, bundle);
        } else if (BleSecurityLauncher.ACTION_BLE_BIND.equals(string)) {
            onBindResponse(i, bundle);
        } else if (BleSecurityLauncher.ACTION_BLE_CONNECT.equals(string)) {
            onConnectResponse(i, bundle);
        } else {
            onCallback(i, bundle);
        }
    }
}
