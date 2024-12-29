package miot.bluetooth.security.rc4;

import android.os.Bundle;
import com.inuker.bluetooth.library.connect.response.BleNotifyResponse;
import com.inuker.bluetooth.library.connect.response.BleReadResponse;
import com.inuker.bluetooth.library.utils.BluetoothLog;
import com.inuker.bluetooth.library.utils.ByteUtils;
import com.miot.bluetooth.BluetoothConstants;
import com.miot.bluetooth.MiotBleClient;
import java.util.UUID;
import miot.bluetooth.security.BLECipher;
import miot.bluetooth.security.BleSecurityConnector;
import miot.bluetooth.security.IBleDeviceLauncher;

public abstract class BleRc4Connector extends BleSecurityConnector {
    protected boolean mNeedBindToServer = true;

    protected BleRc4Connector(IBleDeviceLauncher iBleDeviceLauncher) {
        super(iBleDeviceLauncher);
    }

    private boolean checkFirmwareVersionAccess() {
        return checkBindAbility();
    }

    public boolean checkBindAbility() {
        return this.mNeedBindToServer;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r3 = ((com.inuker.bluetooth.library.model.BleGattProfile) r3.getParcelable(com.inuker.bluetooth.library.Constants.EXTRA_GATT_PROFILE)).getService(com.miot.bluetooth.BluetoothConstants.MISERVICE);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean checkNeedBindToServer(android.os.Bundle r3) {
        /*
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L_0x0025
            java.lang.String r1 = "extra.gatt.profile"
            android.os.Parcelable r3 = r3.getParcelable(r1)
            com.inuker.bluetooth.library.model.BleGattProfile r3 = (com.inuker.bluetooth.library.model.BleGattProfile) r3
            java.util.UUID r1 = com.miot.bluetooth.BluetoothConstants.MISERVICE
            com.inuker.bluetooth.library.model.BleGattService r3 = r3.getService(r1)
            if (r3 == 0) goto L_0x0025
            java.util.UUID r1 = com.miot.bluetooth.BluetoothConstants.CHARACTER_SN
            boolean r1 = r3.contains(r1)
            if (r1 == 0) goto L_0x0025
            java.util.UUID r1 = com.miot.bluetooth.BluetoothConstants.CHARACTER_BEACONKEY
            boolean r3 = r3.contains(r1)
            if (r3 == 0) goto L_0x0025
            r3 = 1
            r0 = 1
        L_0x0025:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: miot.bluetooth.security.rc4.BleRc4Connector.checkNeedBindToServer(android.os.Bundle):boolean");
    }

    /* access modifiers changed from: protected */
    public void onConnectSuccess(Bundle bundle) {
        this.mNeedBindToServer = checkNeedBindToServer(bundle);
    }

    public void openTokenNotify(final BleNotifyResponse bleNotifyResponse) {
        MiotBleClient.getInstance().notify(getMac(), BluetoothConstants.MISERVICE, BluetoothConstants.CHARACTER_TOKEN, new BleNotifyResponse() {
            public void onNotify(UUID uuid, UUID uuid2, byte[] bArr) {
            }

            public void onResponse(int i) {
                bleNotifyResponse.onResponse(i);
            }
        });
    }

    /* access modifiers changed from: protected */
    public void readFirmwareVersionFromDevice(final byte[] bArr, final int i) {
        if (isCanceled()) {
            dispatchResult(-2);
        } else if (!checkFirmwareVersionAccess()) {
            dispatchResult(i);
        } else {
            BluetoothLog.m7332v("readFirmwareVersionFromDevice: ");
            MiotBleClient.getInstance().read(getMac(), BluetoothConstants.MISERVICE, BluetoothConstants.CHARACTER_FIRMWARE_VERSION, new BleReadResponse() {
                public void onResponse(int i, byte[] bArr) {
                    if (i == 0 && !ByteUtils.isEmpty(bArr)) {
                        String str = new String(ByteUtils.cutAfterBytes(BLECipher.encrypt(bArr, bArr), (byte) 0));
                        BluetoothLog.m7333w("firmWare version " + str);
                        BleRc4Connector.this.mBundle.putString(BluetoothConstants.KEY_VERSION, str);
                    }
                    BleRc4Connector.this.dispatchResult(i);
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    public boolean willNotifyTokenNotMatch() {
        return checkBindAbility();
    }
}
