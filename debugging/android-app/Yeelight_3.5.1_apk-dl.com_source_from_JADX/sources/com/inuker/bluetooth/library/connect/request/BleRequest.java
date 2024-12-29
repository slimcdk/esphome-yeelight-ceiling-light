package com.inuker.bluetooth.library.connect.request;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcelable;
import com.inuker.bluetooth.library.Constants;
import com.inuker.bluetooth.library.RuntimeChecker;
import com.inuker.bluetooth.library.connect.IBleConnectDispatcher;
import com.inuker.bluetooth.library.connect.IBleConnectWorker;
import com.inuker.bluetooth.library.connect.listener.GattResponseListener;
import com.inuker.bluetooth.library.connect.response.BleGeneralResponse;
import com.inuker.bluetooth.library.model.BleGattProfile;
import com.inuker.bluetooth.library.utils.BluetoothLog;
import com.inuker.bluetooth.library.utils.BluetoothUtils;
import java.util.UUID;

public abstract class BleRequest implements IBleConnectWorker, IBleRequest, Handler.Callback, GattResponseListener, RuntimeChecker {
    protected static final int MSG_REQUEST_TIMEOUT = 32;
    protected String mAddress;
    protected IBleConnectDispatcher mDispatcher;
    protected Bundle mExtra = new Bundle();
    private boolean mFinished;
    protected Handler mHandler = new Handler(Looper.myLooper(), this);
    protected boolean mRequestTimeout;
    protected BleGeneralResponse mResponse;
    protected Handler mResponseHandler = new Handler(Looper.getMainLooper());
    private RuntimeChecker mRuntimeChecker;
    protected IBleConnectWorker mWorker;

    public BleRequest(BleGeneralResponse bleGeneralResponse) {
        this.mResponse = bleGeneralResponse;
    }

    public void cancel() {
        checkRuntime();
        log(String.format("request canceled", new Object[0]));
        this.mHandler.removeCallbacksAndMessages((Object) null);
        clearGattResponseListener(this);
        onResponse(-2);
    }

    public void checkRuntime() {
        this.mRuntimeChecker.checkRuntime();
    }

    public void clearGattResponseListener(GattResponseListener gattResponseListener) {
        this.mWorker.clearGattResponseListener(gattResponseListener);
    }

    public void closeGatt() {
        log(String.format("close gatt", new Object[0]));
        this.mWorker.closeGatt();
    }

    public boolean discoverService() {
        return this.mWorker.discoverService();
    }

    public String getAddress() {
        return this.mAddress;
    }

    public int getCurrentStatus() {
        return this.mWorker.getCurrentStatus();
    }

    public Bundle getExtra() {
        return this.mExtra;
    }

    public BleGattProfile getGattProfile() {
        return this.mWorker.getGattProfile();
    }

    public int getIntExtra(String str, int i) {
        return this.mExtra.getInt(str, i);
    }

    /* access modifiers changed from: protected */
    public String getStatusText() {
        return Constants.getStatusText(getCurrentStatus());
    }

    /* access modifiers changed from: protected */
    public long getTimeoutInMillis() {
        return 30000;
    }

    public boolean handleMessage(Message message) {
        if (message.what == 32) {
            this.mRequestTimeout = true;
            closeGatt();
        }
        return true;
    }

    public void isCharacterExist(UUID uuid, UUID uuid2, BleGeneralResponse bleGeneralResponse) {
        this.mWorker.isCharacterExist(uuid, uuid2, bleGeneralResponse);
    }

    /* access modifiers changed from: protected */
    public void log(String str) {
        BluetoothLog.m7332v(String.format("%s %s >>> %s", new Object[]{getClass().getSimpleName(), getAddress(), str}));
    }

    public void onConnectStatusChanged(boolean z) {
        if (!z) {
            onRequestCompleted(this.mRequestTimeout ? -7 : -1);
        }
    }

    /* access modifiers changed from: protected */
    public void onRequestCompleted(int i) {
        log(String.format("request complete: code = %d", new Object[]{Integer.valueOf(i)}));
        this.mHandler.removeCallbacksAndMessages((Object) null);
        clearGattResponseListener(this);
        onResponse(i);
        this.mDispatcher.onRequestCompleted(this);
    }

    public void onResponse(final int i) {
        if (!this.mFinished) {
            this.mFinished = true;
            this.mResponseHandler.post(new Runnable() {
                public void run() {
                    try {
                        BleRequest bleRequest = BleRequest.this;
                        BleGeneralResponse bleGeneralResponse = bleRequest.mResponse;
                        if (bleGeneralResponse != null) {
                            bleGeneralResponse.onResponse(i, bleRequest.mExtra);
                        }
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            });
        }
    }

    public boolean openGatt() {
        return this.mWorker.openGatt();
    }

    public final void process(IBleConnectDispatcher iBleConnectDispatcher) {
        int i;
        checkRuntime();
        this.mDispatcher = iBleConnectDispatcher;
        BluetoothLog.m7333w(String.format("Process %s, status = %s", new Object[]{getClass().getSimpleName(), getStatusText()}));
        if (!BluetoothUtils.isBleSupported()) {
            i = -4;
        } else if (!BluetoothUtils.isBluetoothEnabled()) {
            i = -5;
        } else {
            try {
                registerGattResponseListener(this);
                processRequest();
                return;
            } catch (Throwable th) {
                BluetoothLog.m7330e(th);
                i = -10;
            }
        }
        onRequestCompleted(i);
    }

    public abstract void processRequest();

    public void putByteArray(String str, byte[] bArr) {
        this.mExtra.putByteArray(str, bArr);
    }

    public void putIntExtra(String str, int i) {
        this.mExtra.putInt(str, i);
    }

    public void putParcelable(String str, Parcelable parcelable) {
        this.mExtra.putParcelable(str, parcelable);
    }

    public boolean readCharacteristic(UUID uuid, UUID uuid2) {
        return this.mWorker.readCharacteristic(uuid, uuid2);
    }

    public boolean readDescriptor(UUID uuid, UUID uuid2, UUID uuid3) {
        return this.mWorker.readDescriptor(uuid, uuid2, uuid3);
    }

    public boolean readRemoteRssi() {
        return this.mWorker.readRemoteRssi();
    }

    public boolean refreshDeviceCache() {
        return this.mWorker.refreshDeviceCache();
    }

    public void registerGattResponseListener(GattResponseListener gattResponseListener) {
        this.mWorker.registerGattResponseListener(gattResponseListener);
    }

    public void setAddress(String str) {
        this.mAddress = str;
    }

    public boolean setCharacteristicIndication(UUID uuid, UUID uuid2, boolean z) {
        return this.mWorker.setCharacteristicIndication(uuid, uuid2, z);
    }

    public boolean setCharacteristicNotification(UUID uuid, UUID uuid2, boolean z) {
        return this.mWorker.setCharacteristicNotification(uuid, uuid2, z);
    }

    public void setRuntimeChecker(RuntimeChecker runtimeChecker) {
        this.mRuntimeChecker = runtimeChecker;
    }

    public void setWorker(IBleConnectWorker iBleConnectWorker) {
        this.mWorker = iBleConnectWorker;
    }

    /* access modifiers changed from: protected */
    public void startRequestTiming() {
        this.mHandler.sendEmptyMessageDelayed(32, getTimeoutInMillis());
    }

    /* access modifiers changed from: protected */
    public void stopRequestTiming() {
        this.mHandler.removeMessages(32);
    }

    public String toString() {
        return getClass().getSimpleName();
    }

    public boolean writeCharacteristic(UUID uuid, UUID uuid2, byte[] bArr) {
        return this.mWorker.writeCharacteristic(uuid, uuid2, bArr);
    }

    public boolean writeCharacteristicWithNoRsp(UUID uuid, UUID uuid2, byte[] bArr) {
        return this.mWorker.writeCharacteristicWithNoRsp(uuid, uuid2, bArr);
    }

    public boolean writeDescriptor(UUID uuid, UUID uuid2, UUID uuid3, byte[] bArr) {
        return this.mWorker.writeDescriptor(uuid, uuid2, uuid3, bArr);
    }
}
