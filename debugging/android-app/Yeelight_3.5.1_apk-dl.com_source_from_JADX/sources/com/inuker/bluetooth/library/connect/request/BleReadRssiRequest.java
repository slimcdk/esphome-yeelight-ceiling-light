package com.inuker.bluetooth.library.connect.request;

import com.inuker.bluetooth.library.Constants;
import com.inuker.bluetooth.library.connect.listener.ReadRssiListener;
import com.inuker.bluetooth.library.connect.response.BleGeneralResponse;

public class BleReadRssiRequest extends BleRequest implements ReadRssiListener {
    public BleReadRssiRequest(BleGeneralResponse bleGeneralResponse) {
        super(bleGeneralResponse);
    }

    private void startReadRssi() {
        if (!readRemoteRssi()) {
            onRequestCompleted(-1);
        } else {
            startRequestTiming();
        }
    }

    public void onReadRemoteRssi(int i, int i2) {
        int i3;
        stopRequestTiming();
        if (i2 == 0) {
            putIntExtra(Constants.EXTRA_RSSI, i);
            i3 = 0;
        } else {
            i3 = -1;
        }
        onRequestCompleted(i3);
    }

    public void processRequest() {
        int currentStatus = getCurrentStatus();
        if (currentStatus == 0 || !(currentStatus == 2 || currentStatus == 19)) {
            onRequestCompleted(-1);
        } else {
            startReadRssi();
        }
    }
}
