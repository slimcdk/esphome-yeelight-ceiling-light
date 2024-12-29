package com.miot.service.manager.discovery;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.os.RemoteException;
import com.miot.api.IDeviceHandler;
import com.miot.common.device.Device;
import com.miot.service.manager.discovery.impl.DeviceFactory;
import java.util.ArrayList;

public class BleDeviceScan implements DeviceScan {
    private BluetoothAdapter mBtAdapter = BluetoothAdapter.getDefaultAdapter();
    /* access modifiers changed from: private */
    public Context mContext;
    /* access modifiers changed from: private */
    public IDeviceHandler mHandler;
    private BluetoothAdapter.LeScanCallback mScanCallback = new BluetoothAdapter.LeScanCallback() {
        public void onLeScan(BluetoothDevice bluetoothDevice, int i, byte[] bArr) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(DeviceFactory.createFrom(BleDeviceScan.this.mContext, bluetoothDevice));
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                try {
                    BleDeviceScan.this.mHandler.onSucceed((Device) arrayList.get(i2), i2, size);
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            }
        }
    };

    public BleDeviceScan(Context context) {
        this.mContext = context;
    }

    public void setHandler(IDeviceHandler iDeviceHandler) {
        this.mHandler = iDeviceHandler;
    }

    public void start() {
        this.mBtAdapter.startLeScan(this.mScanCallback);
    }

    public void stop() {
        this.mBtAdapter.stopLeScan(this.mScanCallback);
    }
}
