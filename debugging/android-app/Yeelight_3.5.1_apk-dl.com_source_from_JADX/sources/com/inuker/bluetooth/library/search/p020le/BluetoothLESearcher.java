package com.inuker.bluetooth.library.search.p020le;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import com.inuker.bluetooth.library.search.BluetoothSearcher;
import com.inuker.bluetooth.library.search.SearchResult;
import com.inuker.bluetooth.library.search.response.BluetoothSearchResponse;
import com.inuker.bluetooth.library.utils.BluetoothLog;
import com.inuker.bluetooth.library.utils.BluetoothUtils;

/* renamed from: com.inuker.bluetooth.library.search.le.BluetoothLESearcher */
public class BluetoothLESearcher extends BluetoothSearcher {
    private final BluetoothAdapter.LeScanCallback mLeScanCallback;

    /* renamed from: com.inuker.bluetooth.library.search.le.BluetoothLESearcher$BluetoothLESearcherHolder */
    private static class BluetoothLESearcherHolder {
        /* access modifiers changed from: private */
        public static BluetoothLESearcher instance = new BluetoothLESearcher();

        private BluetoothLESearcherHolder() {
        }
    }

    private BluetoothLESearcher() {
        this.mLeScanCallback = new BluetoothAdapter.LeScanCallback() {
            public void onLeScan(BluetoothDevice bluetoothDevice, int i, byte[] bArr) {
                BluetoothLESearcher.this.notifyDeviceFounded(new SearchResult(bluetoothDevice, i, bArr));
            }
        };
        this.mBluetoothAdapter = BluetoothUtils.getBluetoothAdapter();
    }

    public static BluetoothLESearcher getInstance() {
        return BluetoothLESearcherHolder.instance;
    }

    /* access modifiers changed from: protected */
    @TargetApi(18)
    public void cancelScanBluetooth() {
        this.mBluetoothAdapter.stopLeScan(this.mLeScanCallback);
        super.cancelScanBluetooth();
    }

    @TargetApi(18)
    public void startScanBluetooth(BluetoothSearchResponse bluetoothSearchResponse) {
        super.startScanBluetooth(bluetoothSearchResponse);
        this.mBluetoothAdapter.startLeScan(this.mLeScanCallback);
    }

    @TargetApi(18)
    public void stopScanBluetooth() {
        try {
            this.mBluetoothAdapter.stopLeScan(this.mLeScanCallback);
        } catch (Exception e) {
            BluetoothLog.m7330e((Throwable) e);
        }
        super.stopScanBluetooth();
    }
}
