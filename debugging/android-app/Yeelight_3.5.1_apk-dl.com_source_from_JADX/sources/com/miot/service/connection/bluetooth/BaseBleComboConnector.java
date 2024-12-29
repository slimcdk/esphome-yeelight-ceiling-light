package com.miot.service.connection.bluetooth;

import android.net.wifi.ScanResult;
import android.os.Handler;
import android.os.Looper;
import com.inuker.bluetooth.library.utils.BluetoothLog;

public class BaseBleComboConnector implements IBleComboConnector {
    protected String mComboAddress;
    protected Handler mHandler = new Handler(Looper.getMainLooper());
    protected int mNotifyStatus;
    protected ComboConnectResponse mResponse;

    protected BaseBleComboConnector(ComboConnectResponse comboConnectResponse) {
        this.mResponse = comboConnectResponse;
    }

    public void closeComboNotify() {
        BluetoothLog.m7332v(String.format("%s.closeComboNotify", new Object[]{getClass().getSimpleName()}));
    }

    /* access modifiers changed from: protected */
    public void onNotifyStatus(final int i) {
        BluetoothLog.m7332v(String.format("%s.onNotifyStatus: status = %d", new Object[]{getClass().getSimpleName(), Integer.valueOf(i)}));
        this.mNotifyStatus = i;
        this.mHandler.post(new Runnable() {
            public void run() {
                BaseBleComboConnector.this.mResponse.onNotifyStatus(i);
            }
        });
    }

    /* access modifiers changed from: protected */
    public void onSearchComboAddress(final String str) {
        BluetoothLog.m7332v(String.format("%s.onSearchComboAddress: mac = %s", new Object[]{getClass().getSimpleName(), str}));
        this.mHandler.post(new Runnable() {
            public void run() {
                BaseBleComboConnector.this.mResponse.onSearchComboAddress(str);
            }
        });
    }

    /* access modifiers changed from: protected */
    public void onSendSSIDAndPassWd(final int i) {
        BluetoothLog.m7332v(String.format("%s.onSendSSIDAndPassWd: code = %d", new Object[]{getClass().getSimpleName(), Integer.valueOf(i)}));
        this.mHandler.post(new Runnable() {
            public void run() {
                BaseBleComboConnector.this.mResponse.onSendSSIDAndPassWd(i);
            }
        });
    }

    public void openComboNotify() {
        BluetoothLog.m7332v(String.format("%s.openComboNotify", new Object[]{getClass().getSimpleName()}));
    }

    public void release() {
        BluetoothLog.m7332v(String.format("%s.release", new Object[]{getClass().getSimpleName()}));
        this.mHandler.removeCallbacksAndMessages((Object) null);
    }

    public void restore(ComboRestoreResponse comboRestoreResponse) {
        BluetoothLog.m7332v(String.format("%s.restore", new Object[]{getClass().getSimpleName()}));
    }

    public void retryConnect() {
        BluetoothLog.m7332v(String.format("%s.retryConnect", new Object[]{getClass().getSimpleName()}));
    }

    public void searchComboAddress(ScanResult scanResult) {
        BluetoothLog.m7332v(String.format("%s.searchComboAddress", new Object[]{getClass().getSimpleName()}));
    }

    public void sendSSIDAndPassWd(String str) {
        BluetoothLog.m7332v(String.format("%s.sendSSIDAndPassWd", new Object[]{getClass().getSimpleName()}));
    }
}
