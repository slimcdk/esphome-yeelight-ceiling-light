package com.miot.bluetooth;

import android.os.Bundle;
import android.os.RemoteException;
import com.inuker.bluetooth.library.connect.response.BluetoothConnectStatusResponse;
import com.inuker.bluetooth.library.utils.BluetoothLog;
import com.miot.api.IResponse;
import miot.bluetooth.security.BleSecurityLauncher;

public class BleSecurityStatusResponseWrapper implements BleSecurityStatusResponse {
    private IResponse mResponse;

    public BleSecurityStatusResponseWrapper(IResponse iResponse) {
        this.mResponse = iResponse;
    }

    public void onAuthResponse(int i, Bundle bundle) {
        if (this.mResponse == null) {
            BluetoothLog.m10335e("BleSecurityStatusResponseWrapper >> IResponse is null");
            return;
        }
        Bundle bundle2 = new Bundle(bundle);
        bundle2.putString(BluetoothConnectStatusResponse.KEY_ACTION, BleSecurityLauncher.ACTION_BLE_AUTH);
        try {
            this.mResponse.onResponse(i, bundle2);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void onBindResponse(int i, Bundle bundle) {
        if (this.mResponse == null) {
            BluetoothLog.m10335e("BleSecurityStatusResponseWrapper >> IResponse is null");
            return;
        }
        Bundle bundle2 = new Bundle(bundle);
        bundle2.putString(BluetoothConnectStatusResponse.KEY_ACTION, BleSecurityLauncher.ACTION_BLE_BIND);
        try {
            this.mResponse.onResponse(i, bundle2);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void onConnectResponse(int i, Bundle bundle) {
        if (this.mResponse == null) {
            BluetoothLog.m10335e("BleSecurityStatusResponseWrapper >> IResponse is null");
            return;
        }
        Bundle bundle2 = new Bundle(bundle);
        bundle2.putString(BluetoothConnectStatusResponse.KEY_ACTION, BleSecurityLauncher.ACTION_BLE_CONNECT);
        try {
            this.mResponse.onResponse(i, bundle2);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void onResponse(int i, Bundle bundle) {
        IResponse iResponse = this.mResponse;
        if (iResponse == null) {
            BluetoothLog.m10335e("BleSecurityStatusResponseWrapper >> IResponse is null");
            return;
        }
        try {
            iResponse.onResponse(i, bundle);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
