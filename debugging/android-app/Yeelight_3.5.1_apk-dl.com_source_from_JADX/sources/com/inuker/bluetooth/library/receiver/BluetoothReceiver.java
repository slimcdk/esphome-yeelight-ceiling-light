package com.inuker.bluetooth.library.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.inuker.bluetooth.library.receiver.listener.BluetoothReceiverListener;
import com.inuker.bluetooth.library.utils.BluetoothLog;
import com.inuker.bluetooth.library.utils.BluetoothUtils;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class BluetoothReceiver extends BroadcastReceiver implements IBluetoothReceiver, Handler.Callback {
    private static final int MSG_REGISTER = 1;
    private static IBluetoothReceiver mReceiver;
    private AbsBluetoothReceiver[] RECEIVERS;
    private IReceiverDispatcher mDispatcher;
    private Handler mHandler = new Handler(Looper.getMainLooper(), this);
    /* access modifiers changed from: private */
    public Map<String, List<BluetoothReceiverListener>> mListeners = new HashMap();

    private BluetoothReceiver() {
        C26611 r0 = new IReceiverDispatcher() {
            public List<BluetoothReceiverListener> getListeners(Class<?> cls) {
                return (List) BluetoothReceiver.this.mListeners.get(cls.getSimpleName());
            }
        };
        this.mDispatcher = r0;
        this.RECEIVERS = new AbsBluetoothReceiver[]{BluetoothStateReceiver.newInstance(r0), BluetoothBondReceiver.newInstance(this.mDispatcher), BleConnectStatusChangeReceiver.newInstance(this.mDispatcher), BleCharacterChangeReceiver.newInstance(this.mDispatcher)};
        BluetoothUtils.registerReceiver(this, getIntentFilter());
    }

    public static IBluetoothReceiver getInstance() {
        if (mReceiver == null) {
            synchronized (BluetoothReceiver.class) {
                if (mReceiver == null) {
                    mReceiver = new BluetoothReceiver();
                }
            }
        }
        return mReceiver;
    }

    private IntentFilter getIntentFilter() {
        IntentFilter intentFilter = new IntentFilter();
        for (AbsBluetoothReceiver actions : this.RECEIVERS) {
            for (String addAction : actions.getActions()) {
                intentFilter.addAction(addAction);
            }
        }
        return intentFilter;
    }

    private void registerInner(BluetoothReceiverListener bluetoothReceiverListener) {
        if (bluetoothReceiverListener != null) {
            List list = this.mListeners.get(bluetoothReceiverListener.getName());
            if (list == null) {
                list = new LinkedList();
                this.mListeners.put(bluetoothReceiverListener.getName(), list);
            }
            list.add(bluetoothReceiverListener);
        }
    }

    public boolean handleMessage(Message message) {
        if (message.what == 1) {
            registerInner((BluetoothReceiverListener) message.obj);
        }
        return true;
    }

    public void onReceive(Context context, Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if (!TextUtils.isEmpty(action)) {
                int i = 0;
                BluetoothLog.m7332v(String.format("BluetoothReceiver onReceive: %s", new Object[]{action}));
                AbsBluetoothReceiver[] absBluetoothReceiverArr = this.RECEIVERS;
                int length = absBluetoothReceiverArr.length;
                while (i < length) {
                    AbsBluetoothReceiver absBluetoothReceiver = absBluetoothReceiverArr[i];
                    if (!absBluetoothReceiver.containsAction(action) || !absBluetoothReceiver.onReceive(context, intent)) {
                        i++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public void register(BluetoothReceiverListener bluetoothReceiverListener) {
        this.mHandler.obtainMessage(1, bluetoothReceiverListener).sendToTarget();
    }
}
