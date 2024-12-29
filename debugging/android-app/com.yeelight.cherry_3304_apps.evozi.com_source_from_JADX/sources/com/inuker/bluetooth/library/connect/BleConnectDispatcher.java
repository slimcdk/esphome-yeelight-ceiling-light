package com.inuker.bluetooth.library.connect;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.inuker.bluetooth.library.RuntimeChecker;
import com.inuker.bluetooth.library.connect.options.BleConnectOptions;
import com.inuker.bluetooth.library.connect.request.BleConnectRequest;
import com.inuker.bluetooth.library.connect.request.BleIndicateRequest;
import com.inuker.bluetooth.library.connect.request.BleNotifyRequest;
import com.inuker.bluetooth.library.connect.request.BleReadDescriptorRequest;
import com.inuker.bluetooth.library.connect.request.BleReadRequest;
import com.inuker.bluetooth.library.connect.request.BleReadRssiRequest;
import com.inuker.bluetooth.library.connect.request.BleRequest;
import com.inuker.bluetooth.library.connect.request.BleUnnotifyRequest;
import com.inuker.bluetooth.library.connect.request.BleWriteDescriptorRequest;
import com.inuker.bluetooth.library.connect.request.BleWriteNoRspFastRequest;
import com.inuker.bluetooth.library.connect.request.BleWriteNoRspRequest;
import com.inuker.bluetooth.library.connect.request.BleWriteRequest;
import com.inuker.bluetooth.library.connect.response.BleGeneralResponse;
import com.inuker.bluetooth.library.utils.BluetoothLog;
import com.inuker.bluetooth.library.utils.ListUtils;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

public class BleConnectDispatcher implements IBleConnectDispatcher, RuntimeChecker, Handler.Callback {
    private static final int MAX_REQUEST_COUNT = 100;
    private static final int MSG_SCHEDULE_NEXT = 18;
    private String mAddress;
    private List<BleRequest> mBleWorkList = new LinkedList();
    private BleRequest mCurrentRequest;
    private Handler mHandler;
    private IBleConnectWorker mWorker;

    private BleConnectDispatcher(String str) {
        this.mAddress = str;
        this.mWorker = new BleConnectWorker(str, this);
        this.mHandler = new Handler(Looper.myLooper(), this);
    }

    private void addNewRequest(BleRequest bleRequest) {
        checkRuntime();
        if (this.mBleWorkList.size() < 100) {
            bleRequest.setRuntimeChecker(this);
            bleRequest.setAddress(this.mAddress);
            bleRequest.setWorker(this.mWorker);
            this.mBleWorkList.add(bleRequest);
        } else {
            bleRequest.onResponse(-8);
        }
        scheduleNextRequest(10);
    }

    private boolean isRequestMatch(BleRequest bleRequest, int i) {
        if ((i & 1) != 0) {
            return bleRequest instanceof BleReadRequest;
        }
        if ((i & 2) != 0) {
            return (bleRequest instanceof BleWriteRequest) || (bleRequest instanceof BleWriteNoRspRequest);
        }
        if ((i & 4) != 0) {
            return (bleRequest instanceof BleNotifyRequest) || (bleRequest instanceof BleUnnotifyRequest) || (bleRequest instanceof BleIndicateRequest);
        }
        if ((i & 8) != 0) {
            return bleRequest instanceof BleReadRssiRequest;
        }
        return false;
    }

    public static BleConnectDispatcher newInstance(String str) {
        return new BleConnectDispatcher(str);
    }

    private void scheduleNextRequest() {
        if (this.mCurrentRequest == null && !ListUtils.isEmpty(this.mBleWorkList)) {
            BleRequest remove = this.mBleWorkList.remove(0);
            this.mCurrentRequest = remove;
            remove.process(this);
        }
    }

    private void scheduleNextRequest(long j) {
        this.mHandler.sendEmptyMessageDelayed(18, j);
    }

    public void checkRuntime() {
        if (Thread.currentThread() != this.mHandler.getLooper().getThread()) {
            throw new IllegalStateException("Thread Context Illegal");
        }
    }

    public void clearRequest(int i) {
        checkRuntime();
        BluetoothLog.m10339w(String.format("clearRequest %d", new Object[]{Integer.valueOf(i)}));
        LinkedList<BleRequest> linkedList = new LinkedList<>();
        if (i == 0) {
            linkedList.addAll(this.mBleWorkList);
        } else {
            for (BleRequest next : this.mBleWorkList) {
                if (isRequestMatch(next, i)) {
                    linkedList.add(next);
                }
            }
        }
        for (BleRequest cancel : linkedList) {
            cancel.cancel();
        }
        this.mBleWorkList.removeAll(linkedList);
    }

    public void connect(BleConnectOptions bleConnectOptions, BleGeneralResponse bleGeneralResponse) {
        addNewRequest(new BleConnectRequest(bleConnectOptions, bleGeneralResponse));
    }

    public void disconnect() {
        checkRuntime();
        BluetoothLog.m10339w(String.format("Process disconnect", new Object[0]));
        BleRequest bleRequest = this.mCurrentRequest;
        if (bleRequest != null) {
            bleRequest.cancel();
            this.mCurrentRequest = null;
        }
        for (BleRequest cancel : this.mBleWorkList) {
            cancel.cancel();
        }
        this.mBleWorkList.clear();
        this.mWorker.closeGatt();
    }

    public boolean handleMessage(Message message) {
        if (message.what != 18) {
            return true;
        }
        scheduleNextRequest();
        return true;
    }

    public void indicate(UUID uuid, UUID uuid2, BleGeneralResponse bleGeneralResponse) {
        addNewRequest(new BleIndicateRequest(uuid, uuid2, bleGeneralResponse));
    }

    public void isCharacterExist(UUID uuid, UUID uuid2, BleGeneralResponse bleGeneralResponse) {
        this.mWorker.isCharacterExist(uuid, uuid2, bleGeneralResponse);
    }

    public void notify(UUID uuid, UUID uuid2, BleGeneralResponse bleGeneralResponse) {
        addNewRequest(new BleNotifyRequest(uuid, uuid2, bleGeneralResponse));
    }

    public void onRequestCompleted(BleRequest bleRequest) {
        checkRuntime();
        if (bleRequest == this.mCurrentRequest) {
            this.mCurrentRequest = null;
            scheduleNextRequest(10);
            return;
        }
        throw new IllegalStateException("request not match");
    }

    public void read(UUID uuid, UUID uuid2, BleGeneralResponse bleGeneralResponse) {
        addNewRequest(new BleReadRequest(uuid, uuid2, bleGeneralResponse));
    }

    public void readDescriptor(UUID uuid, UUID uuid2, UUID uuid3, BleGeneralResponse bleGeneralResponse) {
        addNewRequest(new BleReadDescriptorRequest(uuid, uuid2, uuid3, bleGeneralResponse));
    }

    public void readRemoteRssi(BleGeneralResponse bleGeneralResponse) {
        addNewRequest(new BleReadRssiRequest(bleGeneralResponse));
    }

    public void unindicate(UUID uuid, UUID uuid2, BleGeneralResponse bleGeneralResponse) {
        addNewRequest(new BleUnnotifyRequest(uuid, uuid2, bleGeneralResponse));
    }

    public void unnotify(UUID uuid, UUID uuid2, BleGeneralResponse bleGeneralResponse) {
        addNewRequest(new BleUnnotifyRequest(uuid, uuid2, bleGeneralResponse));
    }

    public void write(UUID uuid, UUID uuid2, byte[] bArr, BleGeneralResponse bleGeneralResponse) {
        addNewRequest(new BleWriteRequest(uuid, uuid2, bArr, bleGeneralResponse));
    }

    public void writeDescriptor(UUID uuid, UUID uuid2, UUID uuid3, byte[] bArr, BleGeneralResponse bleGeneralResponse) {
        addNewRequest(new BleWriteDescriptorRequest(uuid, uuid2, uuid3, bArr, bleGeneralResponse));
    }

    public void writeNoRsp(UUID uuid, UUID uuid2, byte[] bArr, BleGeneralResponse bleGeneralResponse) {
        addNewRequest(new BleWriteNoRspRequest(uuid, uuid2, bArr, bleGeneralResponse));
    }

    public void writeNoRspFast(UUID uuid, UUID uuid2, byte[] bArr, BleGeneralResponse bleGeneralResponse) {
        addNewRequest(new BleWriteNoRspFastRequest(uuid, uuid2, bArr, bleGeneralResponse));
    }
}
