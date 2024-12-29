package com.inuker.bluetooth.library.receiver;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.inuker.bluetooth.library.BluetoothContext;
import com.inuker.bluetooth.library.receiver.listener.BluetoothReceiverListener;
import com.inuker.bluetooth.library.utils.ListUtils;
import java.util.Collections;
import java.util.List;

public abstract class AbsBluetoothReceiver {
    protected Context mContext = BluetoothContext.get();
    protected IReceiverDispatcher mDispatcher;
    protected Handler mHandler = new Handler(Looper.getMainLooper());

    protected AbsBluetoothReceiver(IReceiverDispatcher iReceiverDispatcher) {
        this.mDispatcher = iReceiverDispatcher;
    }

    /* access modifiers changed from: package-private */
    public boolean containsAction(String str) {
        List<String> actions = getActions();
        if (ListUtils.isEmpty(actions) || TextUtils.isEmpty(str)) {
            return false;
        }
        return actions.contains(str);
    }

    /* access modifiers changed from: package-private */
    public abstract List<String> getActions();

    /* access modifiers changed from: protected */
    public List<BluetoothReceiverListener> getListeners(Class<?> cls) {
        List<BluetoothReceiverListener> listeners = this.mDispatcher.getListeners(cls);
        return listeners != null ? listeners : Collections.EMPTY_LIST;
    }

    /* access modifiers changed from: package-private */
    public abstract boolean onReceive(Context context, Intent intent);
}
