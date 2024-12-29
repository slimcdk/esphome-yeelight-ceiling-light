package com.miot.service.connection.bluetooth;

import android.net.wifi.ScanResult;

public interface IBleComboConnector {
    void closeComboNotify();

    void openComboNotify();

    void release();

    void restore(ComboRestoreResponse comboRestoreResponse);

    void retryConnect();

    void searchComboAddress(ScanResult scanResult);

    void sendSSIDAndPassWd(String str);
}
