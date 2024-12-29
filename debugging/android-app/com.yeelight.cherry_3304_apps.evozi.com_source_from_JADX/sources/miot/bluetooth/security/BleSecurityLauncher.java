package miot.bluetooth.security;

import android.os.Bundle;
import com.inuker.bluetooth.library.Code;
import com.inuker.bluetooth.library.connect.options.BleConnectOptions;
import com.inuker.bluetooth.library.utils.BluetoothLog;
import com.inuker.bluetooth.library.utils.BluetoothUtils;
import com.inuker.bluetooth.library.utils.ByteUtils;
import com.miot.api.bluetooth.XmBluetoothManager;
import com.miot.bluetooth.BleSecurityConnectResponse;
import com.miot.bluetooth.BleSecurityStatusResponse;
import com.miot.bluetooth.BluetoothConstants;
import com.miot.bluetooth.MiotBleClient;
import miot.bluetooth.security.cache.BluetoothCache;

public abstract class BleSecurityLauncher {
    public static final String ACTION_BLE_AUTH = "action.ble.auth";
    public static final String ACTION_BLE_BIND = "action.ble.bind";
    public static final String ACTION_BLE_CONNECT = "action.ble.connect";
    public static final String LAUNCHER_TYPE = "launcher_type_statis";
    protected Bundle mBundle;
    protected volatile boolean mCanceled;
    protected BleConnectOptions mConnectOptions;
    /* access modifiers changed from: protected */
    public String mDeviceMac;
    protected IBleDeviceLauncher mLauncher;
    /* access modifiers changed from: protected */
    public int mProductId;
    protected BleSecurityStatusResponse mResponse;
    protected byte[] mToken;

    public BleSecurityLauncher(String str, int i, BleConnectOptions bleConnectOptions) {
        this(str, i, (byte[]) null, bleConnectOptions);
    }

    public BleSecurityLauncher(String str, int i, byte[] bArr) {
        this(str, i, bArr, MiotBleClient.CONNECT_OPTIONS);
    }

    public BleSecurityLauncher(String str, int i, byte[] bArr, BleConnectOptions bleConnectOptions) {
        this.mLauncher = new IBleDeviceLauncher() {
            public String getDeviceMac() {
                return BleSecurityLauncher.this.mDeviceMac;
            }

            public int getDeviceProductId() {
                return BleSecurityLauncher.this.mProductId;
            }

            public byte[] getDeviceToken() {
                return BleSecurityLauncher.this.mToken;
            }

            public void notifyAuthProcess(int i, Bundle bundle) {
                BleSecurityLauncher.this.notifyBindProcess(BleSecurityLauncher.ACTION_BLE_AUTH, i, bundle);
            }

            public void notifyConnectProcess(int i, Bundle bundle) {
                BleSecurityLauncher.this.notifyBindProcess(BleSecurityLauncher.ACTION_BLE_CONNECT, i, bundle);
            }
        };
        this.mDeviceMac = str;
        this.mProductId = i;
        this.mToken = bArr;
        this.mConnectOptions = bleConnectOptions;
        Bundle bundle = new Bundle();
        this.mBundle = bundle;
        bundle.setClassLoader(getClass().getClassLoader());
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0060  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void notifyBindProcess(java.lang.String r6, int r7, android.os.Bundle r8) {
        /*
            r5 = this;
            int r0 = r6.hashCode()
            r1 = -1886663917(0xffffffff8f8bcb13, float:-1.378468E-29)
            r2 = 0
            r3 = 2
            r4 = 1
            if (r0 == r1) goto L_0x002b
            r1 = -1886645848(0xffffffff8f8c11a8, float:-1.3811867E-29)
            if (r0 == r1) goto L_0x0021
            r1 = -64745569(0xfffffffffc240f9f, float:-3.407414E36)
            if (r0 == r1) goto L_0x0017
            goto L_0x0035
        L_0x0017:
            java.lang.String r0 = "action.ble.connect"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0035
            r0 = 0
            goto L_0x0036
        L_0x0021:
            java.lang.String r0 = "action.ble.bind"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0035
            r0 = 2
            goto L_0x0036
        L_0x002b:
            java.lang.String r0 = "action.ble.auth"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0035
            r0 = 1
            goto L_0x0036
        L_0x0035:
            r0 = -1
        L_0x0036:
            if (r0 == 0) goto L_0x0060
            if (r0 == r4) goto L_0x0058
            if (r0 == r3) goto L_0x0050
            java.lang.Object[] r8 = new java.lang.Object[r3]
            r8[r2] = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)
            r8[r4] = r6
            java.lang.String r6 = "notifyBindProcess: unknown action = %s, code = %d"
            java.lang.String r6 = java.lang.String.format(r6, r8)
            com.inuker.bluetooth.library.utils.BluetoothLog.m10335e((java.lang.String) r6)
            goto L_0x0067
        L_0x0050:
            com.miot.bluetooth.BleSecurityStatusResponse r6 = r5.mResponse
            if (r6 == 0) goto L_0x0067
            r6.onBindResponse(r7, r8)
            goto L_0x0067
        L_0x0058:
            com.miot.bluetooth.BleSecurityStatusResponse r6 = r5.mResponse
            if (r6 == 0) goto L_0x0067
            r6.onAuthResponse(r7, r8)
            goto L_0x0067
        L_0x0060:
            com.miot.bluetooth.BleSecurityStatusResponse r6 = r5.mResponse
            if (r6 == 0) goto L_0x0067
            r6.onConnectResponse(r7, r8)
        L_0x0067:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: miot.bluetooth.security.BleSecurityLauncher.notifyBindProcess(java.lang.String, int, android.os.Bundle):void");
    }

    public void cancel() {
        this.mCanceled = true;
        BleSecurityConnector securityConnector = getSecurityConnector();
        if (securityConnector != null) {
            securityConnector.cancel();
        }
        onCanceled();
    }

    /* access modifiers changed from: protected */
    public void dispatchResult(int i) {
        if (isCanceled()) {
            i = -2;
        }
        BluetoothLog.m10338v(String.format("SecureConnect onResponse: code = %s", new Object[]{Code.toString(i)}));
        byte[] propTokenBytes = BluetoothCache.getPropTokenBytes(this.mDeviceMac);
        if (!ByteUtils.isEmpty(propTokenBytes)) {
            this.mBundle.putByteArray(XmBluetoothManager.EXTRA_TOKEN, propTokenBytes);
        }
        BleSecurityStatusResponse bleSecurityStatusResponse = this.mResponse;
        if (bleSecurityStatusResponse != null) {
            try {
                bleSecurityStatusResponse.onResponse(i, this.mBundle);
            } catch (Exception e) {
                BluetoothLog.m10340w((Throwable) e);
            }
        }
        this.mResponse = null;
        if (i != 0 && !BluetoothUtils.isDeviceConnected(this.mDeviceMac)) {
            MiotBleClient.getInstance().disconnect(this.mDeviceMac);
        }
    }

    /* access modifiers changed from: protected */
    public abstract BleSecurityConnector getSecurityConnector();

    /* access modifiers changed from: protected */
    public boolean isCanceled() {
        return this.mCanceled;
    }

    /* access modifiers changed from: protected */
    public void notifyBindProcess(String str, int i) {
        notifyBindProcess(str, i, this.mBundle);
    }

    /* access modifiers changed from: protected */
    public void onCanceled() {
    }

    /* access modifiers changed from: protected */
    public abstract void onPostConnect(int i, Bundle bundle);

    /* access modifiers changed from: protected */
    public void onPostConnectFailed(int i) {
    }

    public void start(BleSecurityStatusResponse bleSecurityStatusResponse) {
        BluetoothLog.m10338v(String.format("%s for %s", new Object[]{getClass().getSimpleName(), this.mDeviceMac}));
        this.mResponse = bleSecurityStatusResponse;
        BleSecurityConnector securityConnector = getSecurityConnector();
        if (securityConnector != null) {
            securityConnector.connect(new BleSecurityConnectResponse() {
                public void onResponse(int i, Bundle bundle) {
                    if (i == 0) {
                        BleSecurityLauncher.this.notifyBindProcess(BleSecurityLauncher.ACTION_BLE_AUTH, i, bundle);
                        if (bundle != null) {
                            BleSecurityLauncher.this.mBundle.putAll(bundle);
                        }
                        BleSecurityLauncher.this.onPostConnect(i, bundle);
                        return;
                    }
                    boolean z = false;
                    if (bundle != null) {
                        z = bundle.getBoolean(BluetoothConstants.KEY_IS_CONNECT_FAILED, false);
                    }
                    if (!z) {
                        BleSecurityLauncher.this.notifyBindProcess(BleSecurityLauncher.ACTION_BLE_AUTH, i, bundle);
                    }
                    BleSecurityLauncher.this.onPostConnectFailed(i);
                    BleSecurityLauncher.this.dispatchResult(i);
                }
            });
            return;
        }
        throw new IllegalArgumentException("Ble security connector should not be null");
    }
}
