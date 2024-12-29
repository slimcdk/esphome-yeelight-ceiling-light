package com.miot.service.connection.bluetooth;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.wifi.ScanResult;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.inuker.bluetooth.library.Code;
import com.inuker.bluetooth.library.connect.response.BleNotifyResponse;
import com.inuker.bluetooth.library.connect.response.BleUnnotifyResponse;
import com.inuker.bluetooth.library.utils.BluetoothLog;
import com.inuker.bluetooth.library.utils.BluetoothUtils;
import com.inuker.bluetooth.library.utils.ByteUtils;
import com.inuker.bluetooth.library.utils.Task;
import com.miot.bluetooth.BluetoothConstants;
import com.miot.bluetooth.MiotBleClient;
import com.miot.service.connection.bluetooth.BLEBytesWriter;
import com.miot.service.connection.bluetooth.BleFastConnector;
import com.miot.service.connection.wifi.SmartConfigDataProvider;
import java.util.UUID;
import java.util.concurrent.Future;
import miot.bluetooth.security.cache.BleDevicePropCache;
import miot.bluetooth.security.cache.BluetoothCache;

public class BleComboConnector extends BaseBleComboConnector {
    public static final int NOTIFY_AUTHENTICATION_ERROR = 5;
    public static final int NOTIFY_CONNECTING_ROUTER = 1;
    public static final int NOTIFY_ROUTER_CONNECTED = 2;
    public static final int NOTIFY_SERVER_CONNECTED = 3;
    public static final int NOTIFY_START = 0;
    public static final int NOTIFY_UNKNONW_ERROR = 4;
    private IBleFastConnector mBleFastConnector;
    private NotifyReceiver mReceiver;

    private class NotifyReceiver extends BroadcastReceiver {
        private NotifyReceiver() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                String stringExtra = intent.getStringExtra("extra.mac");
                if (!TextUtils.isEmpty(stringExtra) && stringExtra.equalsIgnoreCase(BleComboConnector.this.mComboAddress)) {
                    String action = intent.getAction();
                    if ("action.character_changed".equalsIgnoreCase(action)) {
                        UUID uuid = (UUID) intent.getSerializableExtra("extra.character.uuid");
                        byte[] byteArrayExtra = intent.getByteArrayExtra("extra.byte.value");
                        if (((UUID) intent.getSerializableExtra("extra.service.uuid")).equals(BluetoothConstants.MISERVICE) && uuid.equals(BluetoothConstants.CHARACTER_WIFISTATUS) && !ByteUtils.isEmpty(byteArrayExtra)) {
                            BleComboConnector.this.onNotifyStatus(byteArrayExtra[0]);
                        }
                    } else if ("action.connect_status_changed".equalsIgnoreCase(action)) {
                        intent.getIntExtra("extra.status", 5);
                    }
                }
            }
        }
    }

    public BleComboConnector(ComboConnectResponse comboConnectResponse) {
        super(comboConnectResponse);
    }

    private void registerBleReceiver() {
        if (this.mReceiver == null) {
            this.mReceiver = new NotifyReceiver();
            IntentFilter intentFilter = new IntentFilter("action.character_changed");
            intentFilter.addAction("action.connect_status_changed");
            BluetoothUtils.registerReceiver(this.mReceiver, intentFilter);
        }
    }

    private void unregisterBleReceiver() {
        NotifyReceiver notifyReceiver = this.mReceiver;
        if (notifyReceiver != null) {
            BluetoothUtils.unregisterReceiver(notifyReceiver);
            this.mReceiver = null;
        }
    }

    public void closeComboNotify() {
        super.closeComboNotify();
        unregisterBleReceiver();
        if (!TextUtils.isEmpty(this.mComboAddress)) {
            MiotBleClient.getInstance().unnotify(this.mComboAddress, BluetoothConstants.MISERVICE, BluetoothConstants.CHARACTER_WIFISTATUS, new BleUnnotifyResponse() {
                public void onResponse(int i) {
                    BluetoothLog.m7328d("closeComboNotify  onResponse  code" + i);
                }
            });
        }
    }

    public void openComboNotify() {
        super.openComboNotify();
        registerBleReceiver();
        MiotBleClient.getInstance().notify(this.mComboAddress, BluetoothConstants.MISERVICE, BluetoothConstants.CHARACTER_WIFISTATUS, new BleNotifyResponse() {
            public void onNotify(UUID uuid, UUID uuid2, byte[] bArr) {
            }

            public void onResponse(int i) {
            }
        });
    }

    public void release() {
        super.release();
        closeComboNotify();
        MiotBleClient.getInstance().disconnect(this.mComboAddress);
    }

    public void restore(final ComboRestoreResponse comboRestoreResponse) {
        super.restore(comboRestoreResponse);
        this.mBleFastConnector.sendRestoreCommand(new BLEBytesWriter.BLEBytesWriteResponse() {
            public void onResponse(int i, Void voidR) {
                ComboRestoreResponse comboRestoreResponse = comboRestoreResponse;
                if (comboRestoreResponse != null) {
                    comboRestoreResponse.onResponse(i);
                }
            }
        });
    }

    public void retryConnect() {
        super.retryConnect();
        this.mBleFastConnector.sendRetryCommand(new BLEBytesWriter.BLEBytesWriteResponse() {
            public void onResponse(int i, Void voidR) {
            }
        });
    }

    public void searchComboAddress(ScanResult scanResult) {
        super.searchComboAddress(scanResult);
        BluetoothLog.m7333w("BleComboConnector.connectCombo");
        MiotBleClient.getInstance().stopSearch();
        final Future<String> searchComboDeviceAsync = ComboDeviceManager.searchComboDeviceAsync(scanResult);
        if (searchComboDeviceAsync == null) {
            onSearchComboAddress((String) null);
        } else {
            Task.execute(new Task() {
                /* JADX WARNING: Removed duplicated region for block: B:9:0x001a  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public void doInBackground() {
                    /*
                        r2 = this;
                        java.util.concurrent.Future r0 = r2     // Catch:{ InterruptedException -> 0x000e, ExecutionException -> 0x0009 }
                        java.lang.Object r0 = r0.get()     // Catch:{ InterruptedException -> 0x000e, ExecutionException -> 0x0009 }
                        java.lang.String r0 = (java.lang.String) r0     // Catch:{ InterruptedException -> 0x000e, ExecutionException -> 0x0009 }
                        goto L_0x0014
                    L_0x0009:
                        r0 = move-exception
                        r0.printStackTrace()
                        goto L_0x0012
                    L_0x000e:
                        r0 = move-exception
                        r0.printStackTrace()
                    L_0x0012:
                        java.lang.String r0 = ""
                    L_0x0014:
                        boolean r1 = android.text.TextUtils.isEmpty(r0)
                        if (r1 != 0) goto L_0x001e
                        com.miot.service.connection.bluetooth.BleComboConnector r1 = com.miot.service.connection.bluetooth.BleComboConnector.this
                        r1.mComboAddress = r0
                    L_0x001e:
                        com.miot.service.connection.bluetooth.BleComboConnector r1 = com.miot.service.connection.bluetooth.BleComboConnector.this
                        r1.onSearchComboAddress(r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.miot.service.connection.bluetooth.BleComboConnector.C29201.doInBackground():void");
                }
            }, AsyncTask.THREAD_POOL_EXECUTOR);
        }
    }

    public void sendSSIDAndPassWd(String str) {
        super.sendSSIDAndPassWd(str);
        String selectedSSID = SmartConfigDataProvider.getInstance().getSelectedSSID();
        String selectedApPasswd = SmartConfigDataProvider.getInstance().getSelectedApPasswd();
        BluetoothLog.m7333w(String.format("BleComboConnector.sendSSIDAndPassWd ssid = %s, passwd = %s", new Object[]{selectedSSID, selectedApPasswd}));
        if (this.mBleFastConnector == null) {
            if (BleDevicePropCache.getInstance().getPropExtra(this.mComboAddress, "mibeacon_auth_mode", 0) == 0) {
                this.mBleFastConnector = new BleFastConnector(this.mComboAddress, selectedSSID, selectedApPasswd);
            } else {
                this.mBleFastConnector = new BleStandardAuthFastConnecter(this.mComboAddress, selectedSSID, selectedApPasswd, str, 0, "", "app", "");
            }
        }
        BluetoothCache.removePropToken(this.mComboAddress);
        this.mBleFastConnector.connect(new BleFastConnector.BleFastConnectResponse() {
            public void onResponse(int i, Void voidR) {
                BluetoothLog.m7333w(String.format("mBleFastConnector onResponse = %s", new Object[]{Code.toString(i)}));
                BleComboConnector.this.onSendSSIDAndPassWd(i);
            }
        });
    }
}
