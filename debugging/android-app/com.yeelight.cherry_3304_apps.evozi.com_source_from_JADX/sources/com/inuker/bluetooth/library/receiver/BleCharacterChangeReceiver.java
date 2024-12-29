package com.inuker.bluetooth.library.receiver;

import android.content.Context;
import android.content.Intent;
import com.inuker.bluetooth.library.receiver.listener.BleCharacterChangeListener;
import com.inuker.bluetooth.library.receiver.listener.BluetoothReceiverListener;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public class BleCharacterChangeReceiver extends AbsBluetoothReceiver {
    private static final String[] ACTIONS = {"action.character_changed"};

    protected BleCharacterChangeReceiver(IReceiverDispatcher iReceiverDispatcher) {
        super(iReceiverDispatcher);
    }

    public static BleCharacterChangeReceiver newInstance(IReceiverDispatcher iReceiverDispatcher) {
        return new BleCharacterChangeReceiver(iReceiverDispatcher);
    }

    private void onCharacterChanged(String str, UUID uuid, UUID uuid2, byte[] bArr) {
        for (BluetoothReceiverListener invoke : getListeners(BleCharacterChangeListener.class)) {
            invoke.invoke(str, uuid, uuid2, bArr);
        }
    }

    /* access modifiers changed from: package-private */
    public List<String> getActions() {
        return Arrays.asList(ACTIONS);
    }

    /* access modifiers changed from: package-private */
    public boolean onReceive(Context context, Intent intent) {
        onCharacterChanged(intent.getStringExtra("extra.mac"), (UUID) intent.getSerializableExtra("extra.service.uuid"), (UUID) intent.getSerializableExtra("extra.character.uuid"), intent.getByteArrayExtra("extra.byte.value"));
        return true;
    }
}
