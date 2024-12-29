package com.inuker.bluetooth.library.receiver;

import android.content.Context;
import android.content.Intent;
import com.inuker.bluetooth.library.receiver.listener.BleConnectStatusChangeListener;
import com.inuker.bluetooth.library.receiver.listener.BluetoothReceiverListener;
import com.inuker.bluetooth.library.utils.BluetoothLog;
import java.util.Arrays;
import java.util.List;

public class BleConnectStatusChangeReceiver extends AbsBluetoothReceiver {
    private static final String[] ACTIONS = {"action.connect_status_changed"};

    protected BleConnectStatusChangeReceiver(IReceiverDispatcher iReceiverDispatcher) {
        super(iReceiverDispatcher);
    }

    public static BleConnectStatusChangeReceiver newInstance(IReceiverDispatcher iReceiverDispatcher) {
        return new BleConnectStatusChangeReceiver(iReceiverDispatcher);
    }

    private void onConnectStatusChanged(String str, int i) {
        for (BluetoothReceiverListener invoke : getListeners(BleConnectStatusChangeListener.class)) {
            invoke.invoke(str, Integer.valueOf(i));
        }
    }

    /* access modifiers changed from: package-private */
    public List<String> getActions() {
        return Arrays.asList(ACTIONS);
    }

    /* access modifiers changed from: package-private */
    public boolean onReceive(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra("extra.mac");
        int intExtra = intent.getIntExtra("extra.status", 0);
        BluetoothLog.m10338v(String.format("onConnectStatusChanged for %s, status = %d", new Object[]{stringExtra, Integer.valueOf(intExtra)}));
        onConnectStatusChanged(stringExtra, intExtra);
        return true;
    }
}
