package miot.bluetooth.security;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.inuker.bluetooth.library.Code;
import com.inuker.bluetooth.library.connect.response.BleConnectResponse;
import com.inuker.bluetooth.library.connect.response.BleNotifyResponse;
import com.inuker.bluetooth.library.connect.response.BleUnnotifyResponse;
import com.inuker.bluetooth.library.utils.BluetoothLog;
import com.inuker.bluetooth.library.utils.BluetoothUtils;
import com.miot.bluetooth.BleSecurityConnectResponse;
import com.miot.bluetooth.BluetoothConstants;
import com.miot.bluetooth.MiotBleClient;
import java.util.UUID;

public abstract class BleSecurityConnector implements ISecurityConnect {
    private final BleConnectResponse mBleConnectResponse = new BleConnectResponse() {
        public void onResponse(int i, Bundle bundle) {
            BluetoothLog.m10334d("connect onResponse: " + Code.toString(i));
            if (i == 0) {
                if (bundle != null) {
                    BleSecurityConnector.this.mBundle.putAll(bundle);
                }
                BleSecurityConnector.this.onConnectSuccess(bundle);
                BleSecurityConnector.this.registerBleNotifyReceiver();
                BleSecurityConnector.this.processStep1();
                return;
            }
            BleSecurityConnector.this.dispatchResult(-1, true);
        }
    };
    /* access modifiers changed from: protected */
    public Bundle mBundle;
    private boolean mCanceled;
    /* access modifiers changed from: protected */
    public final Handler mHandler = new Handler(Looper.getMainLooper()) {
        public void handleMessage(Message message) {
            BleSecurityConnector.this.processHandlerMessage(message);
        }
    };
    private IBleDeviceLauncher mLauncher;
    private ConnectReceiver mReceiver;
    protected BleSecurityConnectResponse mResponse;

    private class ConnectReceiver extends BroadcastReceiver {
        private ConnectReceiver() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                String action = intent.getAction();
                BluetoothLog.m10334d("onReceive: " + action);
                if ("action.character_changed".equalsIgnoreCase(action)) {
                    if (BleSecurityConnector.this.getMac().equalsIgnoreCase(intent.getStringExtra("extra.mac"))) {
                        UUID uuid = (UUID) intent.getSerializableExtra("extra.service.uuid");
                        UUID uuid2 = (UUID) intent.getSerializableExtra("extra.character.uuid");
                        byte[] byteArrayExtra = intent.getByteArrayExtra("extra.byte.value");
                        if (uuid != null && uuid2 != null) {
                            BleSecurityConnector.this.processNotify(uuid, uuid2, byteArrayExtra);
                        }
                    }
                } else if ("action.connect_status_changed".equalsIgnoreCase(action)) {
                    if (BleSecurityConnector.this.getMac().equalsIgnoreCase(intent.getStringExtra("extra.mac")) && intent.getIntExtra("extra.status", 5) == 32) {
                        BleSecurityConnector.this.dispatchResult(-1, false);
                    }
                }
            }
        }
    }

    protected BleSecurityConnector(IBleDeviceLauncher iBleDeviceLauncher) {
        this.mLauncher = iBleDeviceLauncher;
        if (iBleDeviceLauncher != null) {
            Bundle bundle = new Bundle();
            this.mBundle = bundle;
            bundle.setClassLoader(getClass().getClassLoader());
            return;
        }
        throw new NullPointerException("launcher should not be null");
    }

    /* access modifiers changed from: private */
    public void dispatchResultInMainThread(int i, boolean z) {
        boolean z2 = i == 0;
        closeTokenNotify();
        unregisterBleNotifyReceiver();
        onConnectFinished();
        if (!z2) {
            disconnect();
        }
        if (this.mResponse != null) {
            if (z2) {
                this.mBundle.putByteArray(BluetoothConstants.KEY_TOKEN, getGeneratedToken());
            }
            this.mBundle.putBoolean(BluetoothConstants.KEY_IS_CONNECT_FAILED, z);
            this.mResponse.onResponse(i, this.mBundle);
        }
        this.mHandler.removeCallbacksAndMessages((Object) null);
        this.mResponse = null;
    }

    private void unregisterBleNotifyReceiver() {
        ConnectReceiver connectReceiver = this.mReceiver;
        if (connectReceiver != null) {
            BluetoothUtils.unregisterReceiver(connectReceiver);
            this.mReceiver = null;
        }
    }

    /* access modifiers changed from: protected */
    public void cancel() {
        this.mCanceled = true;
    }

    public void closeTokenNotify() {
        MiotBleClient.getInstance().unnotify(getMac(), BluetoothConstants.MISERVICE, BluetoothConstants.CHARACTER_TOKEN, new BleUnnotifyResponse() {
            public void onResponse(int i) {
            }
        });
    }

    public void connect(BleSecurityConnectResponse bleSecurityConnectResponse) {
        this.mResponse = bleSecurityConnectResponse;
        MiotBleClient.getInstance().connect(getMac(), this.mBleConnectResponse);
    }

    public void disconnect() {
        BluetoothLog.m10334d(getClass().getSimpleName() + ".disconnect");
        MiotBleClient.getInstance().disconnect(this.mLauncher.getDeviceMac());
    }

    /* access modifiers changed from: protected */
    public void dispatchResult(int i) {
        BluetoothLog.m10338v(String.format("%s.dispatchResult code = %s", new Object[]{getClass().getSimpleName(), Code.toString(i)}));
        dispatchResult(i, false);
    }

    /* access modifiers changed from: protected */
    public void dispatchResult(final int i, final boolean z) {
        this.mHandler.post(new Runnable() {
            public void run() {
                BleSecurityConnector.this.dispatchResultInMainThread(i, z);
            }
        });
    }

    /* access modifiers changed from: protected */
    public byte[] getGeneratedToken() {
        return null;
    }

    /* access modifiers changed from: protected */
    public String getMac() {
        return this.mLauncher.getDeviceMac();
    }

    /* access modifiers changed from: protected */
    public int getProductId() {
        return this.mLauncher.getDeviceProductId();
    }

    /* access modifiers changed from: protected */
    public byte[] getToken() {
        return this.mLauncher.getDeviceToken();
    }

    /* access modifiers changed from: protected */
    public boolean isCanceled() {
        return this.mCanceled;
    }

    /* access modifiers changed from: protected */
    public void onConnectFinished() {
    }

    /* access modifiers changed from: protected */
    public void onConnectSuccess(Bundle bundle) {
    }

    public void openAuthNotify(final BleNotifyResponse bleNotifyResponse) {
        MiotBleClient.getInstance().notify(getMac(), BluetoothConstants.MISERVICE, BluetoothConstants.CHARACTER_AUTH, new BleNotifyResponse() {
            public void onNotify(UUID uuid, UUID uuid2, byte[] bArr) {
            }

            public void onResponse(int i) {
                bleNotifyResponse.onResponse(i);
            }
        });
    }

    public void openTokenNotify(BleNotifyResponse bleNotifyResponse) {
        MiotBleClient.getInstance().notify(getMac(), BluetoothConstants.MISERVICE, BluetoothConstants.CHARACTER_TOKEN, bleNotifyResponse);
    }

    /* access modifiers changed from: protected */
    public abstract void processHandlerMessage(Message message);

    /* access modifiers changed from: protected */
    public abstract void processNotify(UUID uuid, UUID uuid2, byte[] bArr);

    /* access modifiers changed from: protected */
    public abstract void processStep1();

    public void registerBleNotifyReceiver() {
        if (this.mReceiver == null) {
            this.mReceiver = new ConnectReceiver();
            IntentFilter intentFilter = new IntentFilter("action.character_changed");
            intentFilter.addAction("action.connect_status_changed");
            BluetoothUtils.registerReceiver(this.mReceiver, intentFilter);
        }
    }
}
