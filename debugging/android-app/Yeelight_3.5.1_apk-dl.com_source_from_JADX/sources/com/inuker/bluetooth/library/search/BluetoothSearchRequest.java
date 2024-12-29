package com.inuker.bluetooth.library.search;

import android.bluetooth.BluetoothDevice;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.inuker.bluetooth.library.search.response.BluetoothSearchResponse;
import com.inuker.bluetooth.library.utils.BluetoothLog;
import com.inuker.bluetooth.library.utils.BluetoothUtils;
import java.util.ArrayList;
import java.util.List;

public class BluetoothSearchRequest implements Handler.Callback {
    private static final int MSG_DEVICE_FOUND = 18;
    private static final int MSG_START_SEARCH = 17;
    private static final int SCAN_INTERVAL = 100;
    private BluetoothSearchTask mCurrentTask;
    /* access modifiers changed from: private */
    public Handler mHandler;
    private BluetoothSearchResponse mSearchResponse;
    private List<BluetoothSearchTask> mSearchTaskList = new ArrayList();

    private class BluetoothSearchTaskResponse implements BluetoothSearchResponse {
        BluetoothSearchTask task;

        BluetoothSearchTaskResponse(BluetoothSearchTask bluetoothSearchTask) {
            this.task = bluetoothSearchTask;
        }

        public void onDeviceFounded(SearchResult searchResult) {
            BluetoothLog.m7332v(String.format("onDeviceFounded %s", new Object[]{searchResult}));
            BluetoothSearchRequest.this.notifyDeviceFounded(searchResult);
        }

        public void onSearchCanceled() {
            BluetoothLog.m7332v(String.format("%s onSearchCanceled", new Object[]{this.task}));
        }

        public void onSearchStarted() {
            BluetoothLog.m7332v(String.format("%s onSearchStarted", new Object[]{this.task}));
        }

        public void onSearchStopped() {
            BluetoothLog.m7332v(String.format("%s onSearchStopped", new Object[]{this.task}));
            BluetoothSearchRequest.this.mHandler.sendEmptyMessageDelayed(17, 100);
        }
    }

    public BluetoothSearchRequest(SearchRequest searchRequest) {
        for (SearchTask bluetoothSearchTask : searchRequest.getTasks()) {
            this.mSearchTaskList.add(new BluetoothSearchTask(bluetoothSearchTask));
        }
        this.mHandler = new Handler(Looper.myLooper(), this);
    }

    private void notifyBondedBluetoothClassicDevices() {
        for (BluetoothDevice searchResult : BluetoothUtils.getBondedBluetoothClassicDevices()) {
            notifyDeviceFounded(new SearchResult(searchResult));
        }
    }

    private void notifyConnectedBluetoothDevices() {
        boolean z = false;
        boolean z2 = false;
        for (BluetoothSearchTask next : this.mSearchTaskList) {
            if (next.isBluetoothLeSearch()) {
                z = true;
            } else if (next.isBluetoothClassicSearch()) {
                z2 = true;
            } else {
                throw new IllegalArgumentException("unknown search task type!");
            }
        }
        if (z) {
            notifyConnectedBluetoothLeDevices();
        }
        if (z2) {
            notifyBondedBluetoothClassicDevices();
        }
    }

    private void notifyConnectedBluetoothLeDevices() {
        for (BluetoothDevice searchResult : BluetoothUtils.getConnectedBluetoothLeDevices()) {
            notifyDeviceFounded(new SearchResult(searchResult));
        }
    }

    /* access modifiers changed from: private */
    public void notifyDeviceFounded(SearchResult searchResult) {
        this.mHandler.obtainMessage(18, searchResult).sendToTarget();
    }

    private void scheduleNewSearchTask() {
        if (this.mSearchTaskList.size() > 0) {
            BluetoothSearchTask remove = this.mSearchTaskList.remove(0);
            this.mCurrentTask = remove;
            remove.start(new BluetoothSearchTaskResponse(remove));
            return;
        }
        this.mCurrentTask = null;
        BluetoothSearchResponse bluetoothSearchResponse = this.mSearchResponse;
        if (bluetoothSearchResponse != null) {
            bluetoothSearchResponse.onSearchStopped();
        }
    }

    public void cancel() {
        BluetoothSearchTask bluetoothSearchTask = this.mCurrentTask;
        if (bluetoothSearchTask != null) {
            bluetoothSearchTask.cancel();
            this.mCurrentTask = null;
        }
        this.mSearchTaskList.clear();
        BluetoothSearchResponse bluetoothSearchResponse = this.mSearchResponse;
        if (bluetoothSearchResponse != null) {
            bluetoothSearchResponse.onSearchCanceled();
        }
        this.mSearchResponse = null;
    }

    public boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 17) {
            scheduleNewSearchTask();
            return true;
        } else if (i != 18) {
            return true;
        } else {
            SearchResult searchResult = (SearchResult) message.obj;
            BluetoothSearchResponse bluetoothSearchResponse = this.mSearchResponse;
            if (bluetoothSearchResponse == null) {
                return true;
            }
            bluetoothSearchResponse.onDeviceFounded(searchResult);
            return true;
        }
    }

    public void setSearchResponse(BluetoothSearchResponse bluetoothSearchResponse) {
        this.mSearchResponse = bluetoothSearchResponse;
    }

    public void start() {
        BluetoothSearchResponse bluetoothSearchResponse = this.mSearchResponse;
        if (bluetoothSearchResponse != null) {
            bluetoothSearchResponse.onSearchStarted();
        }
        notifyConnectedBluetoothDevices();
        this.mHandler.sendEmptyMessageDelayed(17, 100);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (BluetoothSearchTask bluetoothSearchTask : this.mSearchTaskList) {
            sb.append(bluetoothSearchTask.toString() + ", ");
        }
        return sb.toString();
    }
}
