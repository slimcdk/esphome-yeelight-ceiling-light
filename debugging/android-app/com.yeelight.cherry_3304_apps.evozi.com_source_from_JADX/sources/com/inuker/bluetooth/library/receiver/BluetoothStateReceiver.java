package com.inuker.bluetooth.library.receiver;

import android.content.Context;
import android.content.Intent;
import androidx.core.p005os.EnvironmentCompat;
import com.inuker.bluetooth.library.receiver.listener.BluetoothReceiverListener;
import com.inuker.bluetooth.library.receiver.listener.BluetoothStateChangeListener;
import com.inuker.bluetooth.library.utils.BluetoothLog;
import java.util.Arrays;
import java.util.List;

public class BluetoothStateReceiver extends AbsBluetoothReceiver {
    private static final String[] ACTIONS = {"android.bluetooth.adapter.action.STATE_CHANGED"};

    protected BluetoothStateReceiver(IReceiverDispatcher iReceiverDispatcher) {
        super(iReceiverDispatcher);
    }

    private String getStateString(int i) {
        switch (i) {
            case 10:
                return "state_off";
            case 11:
                return "state_turning_on";
            case 12:
                return "state_on";
            case 13:
                return "state_turning_off";
            default:
                return EnvironmentCompat.MEDIA_UNKNOWN;
        }
    }

    public static BluetoothStateReceiver newInstance(IReceiverDispatcher iReceiverDispatcher) {
        return new BluetoothStateReceiver(iReceiverDispatcher);
    }

    private void onBluetoothStateChanged(int i, int i2) {
        for (BluetoothReceiverListener invoke : getListeners(BluetoothStateChangeListener.class)) {
            invoke.invoke(Integer.valueOf(i), Integer.valueOf(i2));
        }
    }

    /* access modifiers changed from: package-private */
    public List<String> getActions() {
        return Arrays.asList(ACTIONS);
    }

    public boolean onReceive(Context context, Intent intent) {
        int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", 0);
        int intExtra2 = intent.getIntExtra("android.bluetooth.adapter.extra.PREVIOUS_STATE", 0);
        BluetoothLog.m10338v(String.format("state changed: %s -> %s", new Object[]{getStateString(intExtra2), getStateString(intExtra)}));
        onBluetoothStateChanged(intExtra2, intExtra);
        return true;
    }
}
