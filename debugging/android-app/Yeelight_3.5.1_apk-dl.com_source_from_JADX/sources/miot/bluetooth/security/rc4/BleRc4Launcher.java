package miot.bluetooth.security.rc4;

import com.inuker.bluetooth.library.connect.options.BleConnectOptions;
import com.inuker.bluetooth.library.connect.response.BleReadResponse;
import com.inuker.bluetooth.library.connect.response.BleWriteResponse;
import com.inuker.bluetooth.library.utils.BluetoothLog;
import com.miot.bluetooth.BleBindResponse;
import com.miot.bluetooth.MiotBleClient;
import com.miot.bluetooth.MiotBleDeviceConfig;
import miot.bluetooth.security.BleDeviceBinder;
import miot.bluetooth.security.BleRegisterConnector;
import miot.bluetooth.security.BleSecurityConnector;
import miot.bluetooth.security.BleSecurityLauncher;
import miot.bluetooth.security.IBleDeviceBinder;
import miot.bluetooth.security.cache.BluetoothCache;

public abstract class BleRc4Launcher extends BleSecurityLauncher implements IBleDeviceBinder {
    protected BleDeviceBinder mBleDeviceBinder = new BleDeviceBinder(this.mLauncher);

    public BleRc4Launcher(String str, int i, BleConnectOptions bleConnectOptions) {
        super(str, i, bleConnectOptions);
    }

    public BleRc4Launcher(String str, int i, byte[] bArr, BleConnectOptions bleConnectOptions) {
        super(str, i, bArr, bleConnectOptions);
    }

    public static boolean checkBindStyle() {
        int bindStyle = MiotBleDeviceConfig.bindStyle();
        return bindStyle == 1 || bindStyle == 2;
    }

    public void bindDeviceToServer(BleBindResponse bleBindResponse) {
        this.mBleDeviceBinder.bindDeviceToServer(bleBindResponse);
    }

    public int getBindStyle() {
        return this.mBleDeviceBinder.getBindStyle();
    }

    /* access modifiers changed from: protected */
    public void onCanceled() {
        BleDeviceBinder bleDeviceBinder = this.mBleDeviceBinder;
        if (bleDeviceBinder != null) {
            bleDeviceBinder.cancel();
        }
    }

    public void readBeaconKeyFromDevice(BleReadResponse bleReadResponse) {
        this.mBleDeviceBinder.readBeaconKeyFromDevice(bleReadResponse);
    }

    public void readSNFromDevice(BleReadResponse bleReadResponse) {
        this.mBleDeviceBinder.readSNFromDevice(bleReadResponse);
    }

    /* access modifiers changed from: protected */
    public void refreshRemoteBinded(int i) {
        int i2 = 0;
        int i3 = 1;
        boolean z = i == 0;
        int bindStyle = getBindStyle();
        if (bindStyle == 1) {
            String str = this.mDeviceMac;
            if (z) {
                i2 = 2;
            }
            BluetoothCache.setPropBoundStatus(str, i2);
        } else if (bindStyle == 2) {
            String str2 = this.mDeviceMac;
            if (z) {
                i3 = 2;
            }
            BluetoothCache.setPropBoundStatus(str2, i3);
        }
    }

    public boolean shouldBindToServer() {
        BleSecurityConnector securityConnector = getSecurityConnector();
        boolean z = false;
        boolean z2 = !(securityConnector instanceof BleRc4Connector) || (((BleRc4Connector) securityConnector).checkBindAbility() && checkBindStyle());
        if (securityConnector instanceof BleRegisterConnector) {
            if (((BleRegisterConnector) securityConnector).checkBindAbility() && checkBindStyle()) {
                z = true;
            }
            z2 = z;
        }
        MiotBleClient.getInstance().getConfig().getBindStyle();
        BluetoothLog.m7332v("ShouldBindToServer: " + z2);
        return z2;
    }

    public void writeSNToDevice(byte[] bArr, BleWriteResponse bleWriteResponse) {
        this.mBleDeviceBinder.writeSNToDevice(bArr, bleWriteResponse);
    }
}
