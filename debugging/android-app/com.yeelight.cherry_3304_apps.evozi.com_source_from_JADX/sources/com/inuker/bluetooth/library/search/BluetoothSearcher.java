package com.inuker.bluetooth.library.search;

import android.bluetooth.BluetoothAdapter;
import com.inuker.bluetooth.library.search.classic.BluetoothClassicSearcher;
import com.inuker.bluetooth.library.search.p140le.BluetoothLESearcher;
import com.inuker.bluetooth.library.search.response.BluetoothSearchResponse;

public class BluetoothSearcher {
    protected BluetoothAdapter mBluetoothAdapter;
    protected BluetoothSearchResponse mSearchResponse;

    public static BluetoothSearcher newInstance(int i) {
        if (i == 1) {
            return BluetoothClassicSearcher.getInstance();
        }
        if (i == 2) {
            return BluetoothLESearcher.getInstance();
        }
        throw new IllegalStateException(String.format("unknown search type %d", new Object[]{Integer.valueOf(i)}));
    }

    private void notifySearchCanceled() {
        BluetoothSearchResponse bluetoothSearchResponse = this.mSearchResponse;
        if (bluetoothSearchResponse != null) {
            bluetoothSearchResponse.onSearchCanceled();
        }
    }

    private void notifySearchStarted() {
        BluetoothSearchResponse bluetoothSearchResponse = this.mSearchResponse;
        if (bluetoothSearchResponse != null) {
            bluetoothSearchResponse.onSearchStarted();
        }
    }

    private void notifySearchStopped() {
        BluetoothSearchResponse bluetoothSearchResponse = this.mSearchResponse;
        if (bluetoothSearchResponse != null) {
            bluetoothSearchResponse.onSearchStopped();
        }
    }

    /* access modifiers changed from: protected */
    public void cancelScanBluetooth() {
        notifySearchCanceled();
        this.mSearchResponse = null;
    }

    /* access modifiers changed from: protected */
    public void notifyDeviceFounded(SearchResult searchResult) {
        BluetoothSearchResponse bluetoothSearchResponse = this.mSearchResponse;
        if (bluetoothSearchResponse != null) {
            bluetoothSearchResponse.onDeviceFounded(searchResult);
        }
    }

    /* access modifiers changed from: protected */
    public void startScanBluetooth(BluetoothSearchResponse bluetoothSearchResponse) {
        this.mSearchResponse = bluetoothSearchResponse;
        notifySearchStarted();
    }

    /* access modifiers changed from: protected */
    public void stopScanBluetooth() {
        notifySearchStopped();
        this.mSearchResponse = null;
    }
}
