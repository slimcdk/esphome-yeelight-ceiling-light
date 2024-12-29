package com.miot.service.connection.bluetooth;

public interface ComboConnectResponse {
    void onNotifyStatus(int i);

    void onSearchComboAddress(String str);

    void onSendSSIDAndPassWd(int i);
}
