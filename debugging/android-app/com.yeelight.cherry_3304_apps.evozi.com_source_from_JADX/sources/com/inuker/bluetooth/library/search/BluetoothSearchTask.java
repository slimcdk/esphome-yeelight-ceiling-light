package com.inuker.bluetooth.library.search;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.core.p005os.EnvironmentCompat;
import com.inuker.bluetooth.library.search.response.BluetoothSearchResponse;

public class BluetoothSearchTask implements Handler.Callback {
    private static final int MSG_SEARCH_TIMEOUT = 34;
    private BluetoothSearcher mBluetoothSearcher;
    private Handler mHandler = new Handler(Looper.myLooper(), this);
    private int searchDuration;
    private int searchType;

    public BluetoothSearchTask(SearchTask searchTask) {
        setSearchType(searchTask.getSearchType());
        setSearchDuration(searchTask.getSearchDuration());
    }

    private BluetoothSearcher getBluetoothSearcher() {
        if (this.mBluetoothSearcher == null) {
            this.mBluetoothSearcher = BluetoothSearcher.newInstance(this.searchType);
        }
        return this.mBluetoothSearcher;
    }

    public void cancel() {
        this.mHandler.removeCallbacksAndMessages((Object) null);
        getBluetoothSearcher().cancelScanBluetooth();
    }

    public boolean handleMessage(Message message) {
        if (message.what != 34) {
            return true;
        }
        getBluetoothSearcher().stopScanBluetooth();
        return true;
    }

    public boolean isBluetoothClassicSearch() {
        return this.searchType == 1;
    }

    public boolean isBluetoothLeSearch() {
        return this.searchType == 2;
    }

    public void setSearchDuration(int i) {
        this.searchDuration = i;
    }

    public void setSearchType(int i) {
        this.searchType = i;
    }

    public void start(BluetoothSearchResponse bluetoothSearchResponse) {
        getBluetoothSearcher().startScanBluetooth(bluetoothSearchResponse);
        this.mHandler.sendEmptyMessageDelayed(34, (long) this.searchDuration);
    }

    public String toString() {
        String str = isBluetoothLeSearch() ? "Ble" : isBluetoothClassicSearch() ? "classic" : EnvironmentCompat.MEDIA_UNKNOWN;
        int i = this.searchDuration;
        Object[] objArr = new Object[2];
        if (i >= 1000) {
            objArr[0] = str;
            objArr[1] = Integer.valueOf(i / 1000);
            return String.format("%s search (%ds)", objArr);
        }
        objArr[0] = str;
        double d = (double) i;
        Double.isNaN(d);
        objArr[1] = Double.valueOf((d * 1.0d) / 1000.0d);
        return String.format("%s search (%.1fs)", objArr);
    }
}
