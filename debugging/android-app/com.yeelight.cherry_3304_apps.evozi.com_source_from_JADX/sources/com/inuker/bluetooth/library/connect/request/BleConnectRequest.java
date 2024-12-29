package com.inuker.bluetooth.library.connect.request;

import android.os.Message;
import com.inuker.bluetooth.library.Constants;
import com.inuker.bluetooth.library.connect.listener.ServiceDiscoverListener;
import com.inuker.bluetooth.library.connect.options.BleConnectOptions;
import com.inuker.bluetooth.library.connect.response.BleGeneralResponse;
import com.inuker.bluetooth.library.model.BleGattProfile;
import com.inuker.bluetooth.library.utils.BluetoothLog;

public class BleConnectRequest extends BleRequest implements ServiceDiscoverListener {
    private static final int MSG_CONNECT = 1;
    private static final int MSG_CONNECT_TIMEOUT = 3;
    private static final int MSG_DISCOVER_SERVICE = 2;
    private static final int MSG_DISCOVER_SERVICE_TIMEOUT = 4;
    private static final int MSG_RETRY_DISCOVER_SERVICE = 5;
    private int mConnectCount;
    private BleConnectOptions mConnectOptions;
    private int mServiceDiscoverCount;

    public BleConnectRequest(BleConnectOptions bleConnectOptions, BleGeneralResponse bleGeneralResponse) {
        super(bleGeneralResponse);
        this.mConnectOptions = bleConnectOptions == null ? new BleConnectOptions.Builder().build() : bleConnectOptions;
    }

    private boolean doDiscoverService() {
        this.mServiceDiscoverCount++;
        return discoverService();
    }

    private boolean doOpenNewGatt() {
        this.mConnectCount++;
        return openGatt();
    }

    private void onConnectSuccess() {
        BleGattProfile gattProfile = getGattProfile();
        if (gattProfile != null) {
            putParcelable(Constants.EXTRA_GATT_PROFILE, gattProfile);
        }
        onRequestCompleted(0);
    }

    private void onServiceDiscoverFailed() {
        BluetoothLog.m10338v(String.format("onServiceDiscoverFailed", new Object[0]));
        refreshDeviceCache();
        this.mHandler.sendEmptyMessage(5);
    }

    private void processConnect() {
        this.mHandler.removeCallbacksAndMessages((Object) null);
        this.mServiceDiscoverCount = 0;
        int currentStatus = getCurrentStatus();
        if (currentStatus != 0) {
            if (currentStatus == 2) {
                processDiscoverService();
            } else if (currentStatus == 19) {
                onConnectSuccess();
            }
        } else if (!doOpenNewGatt()) {
            closeGatt();
        } else {
            this.mHandler.sendEmptyMessageDelayed(3, (long) this.mConnectOptions.getConnectTimeout());
        }
    }

    private void processConnectTimeout() {
        log(String.format("connect timeout", new Object[0]));
        this.mHandler.removeCallbacksAndMessages((Object) null);
        closeGatt();
    }

    private void processDiscoverService() {
        BluetoothLog.m10338v(String.format("processDiscoverService, status = %s", new Object[]{getStatusText()}));
        int currentStatus = getCurrentStatus();
        if (currentStatus == 0) {
            retryConnectIfNeeded();
        } else if (currentStatus != 2) {
            if (currentStatus == 19) {
                onConnectSuccess();
            }
        } else if (!doDiscoverService()) {
            onServiceDiscoverFailed();
        } else {
            this.mHandler.sendEmptyMessageDelayed(4, (long) this.mConnectOptions.getServiceDiscoverTimeout());
        }
    }

    private void processDiscoverServiceTimeout() {
        log(String.format("service discover timeout", new Object[0]));
        this.mHandler.removeCallbacksAndMessages((Object) null);
        closeGatt();
    }

    private void retryConnectIfNeeded() {
        if (this.mConnectCount < this.mConnectOptions.getConnectRetry() + 1) {
            retryConnectLater();
        } else {
            onRequestCompleted(-1);
        }
    }

    private void retryConnectLater() {
        log(String.format("retry connect later", new Object[0]));
        this.mHandler.removeCallbacksAndMessages((Object) null);
        this.mHandler.sendEmptyMessageDelayed(1, 1000);
    }

    private void retryDiscoverServiceIfNeeded() {
        if (this.mServiceDiscoverCount < this.mConnectOptions.getServiceDiscoverRetry() + 1) {
            retryDiscoverServiceLater();
        } else {
            closeGatt();
        }
    }

    private void retryDiscoverServiceLater() {
        log(String.format("retry discover service later", new Object[0]));
        this.mHandler.removeCallbacksAndMessages((Object) null);
        this.mHandler.sendEmptyMessageDelayed(2, 1000);
    }

    public boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            processConnect();
        } else if (i == 2) {
            processDiscoverService();
        } else if (i == 3) {
            processConnectTimeout();
        } else if (i == 4) {
            processDiscoverServiceTimeout();
        } else if (i == 5) {
            retryDiscoverServiceIfNeeded();
        }
        return super.handleMessage(message);
    }

    public void onConnectStatusChanged(boolean z) {
        checkRuntime();
        this.mHandler.removeMessages(3);
        if (z) {
            this.mHandler.sendEmptyMessageDelayed(2, 300);
            return;
        }
        this.mHandler.removeCallbacksAndMessages((Object) null);
        retryConnectIfNeeded();
    }

    public void onServicesDiscovered(int i, BleGattProfile bleGattProfile) {
        checkRuntime();
        this.mHandler.removeMessages(4);
        if (i == 0) {
            onConnectSuccess();
        } else {
            onServiceDiscoverFailed();
        }
    }

    public void processRequest() {
        processConnect();
    }

    public String toString() {
        return "BleConnectRequest{options=" + this.mConnectOptions + '}';
    }
}
