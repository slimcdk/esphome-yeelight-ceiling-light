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
    public void notifyBindProcess(String str, int i, Bundle bundle) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1886663917:
                if (str.equals(ACTION_BLE_AUTH)) {
                    c = 0;
                    break;
                }
                break;
            case -1886645848:
                if (str.equals(ACTION_BLE_BIND)) {
                    c = 1;
                    break;
                }
                break;
            case -64745569:
                if (str.equals(ACTION_BLE_CONNECT)) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                BleSecurityStatusResponse bleSecurityStatusResponse = this.mResponse;
                if (bleSecurityStatusResponse != null) {
                    bleSecurityStatusResponse.onAuthResponse(i, bundle);
                    return;
                }
                return;
            case 1:
                BleSecurityStatusResponse bleSecurityStatusResponse2 = this.mResponse;
                if (bleSecurityStatusResponse2 != null) {
                    bleSecurityStatusResponse2.onBindResponse(i, bundle);
                    return;
                }
                return;
            case 2:
                BleSecurityStatusResponse bleSecurityStatusResponse3 = this.mResponse;
                if (bleSecurityStatusResponse3 != null) {
                    bleSecurityStatusResponse3.onConnectResponse(i, bundle);
                    return;
                }
                return;
            default:
                BluetoothLog.m7329e(String.format("notifyBindProcess: unknown action = %s, code = %d", new Object[]{str, Integer.valueOf(i)}));
                return;
        }
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
        BluetoothLog.m7332v(String.format("SecureConnect onResponse: code = %s", new Object[]{Code.toString(i)}));
        byte[] propTokenBytes = BluetoothCache.getPropTokenBytes(this.mDeviceMac);
        if (!ByteUtils.isEmpty(propTokenBytes)) {
            this.mBundle.putByteArray(XmBluetoothManager.EXTRA_TOKEN, propTokenBytes);
        }
        BleSecurityStatusResponse bleSecurityStatusResponse = this.mResponse;
        if (bleSecurityStatusResponse != null) {
            try {
                bleSecurityStatusResponse.onResponse(i, this.mBundle);
            } catch (Exception e) {
                BluetoothLog.m7334w((Throwable) e);
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
        BluetoothLog.m7332v(String.format("%s for %s", new Object[]{getClass().getSimpleName(), this.mDeviceMac}));
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
