package com.miot.service.connection.bluetooth;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.inuker.bluetooth.library.connect.response.BleWriteResponse;
import com.inuker.bluetooth.library.utils.ByteUtils;
import com.miot.api.bluetooth.response.BleResponse;
import com.miot.bluetooth.BluetoothConstants;
import com.miot.bluetooth.MiotBleClient;
import java.util.UUID;
import miot.bluetooth.security.BLECipher;

public class BLEBytesWriter {
    private static final int BATCH_PREFIX = 254;
    private static final int BATCH_SIZE = 20;
    private static final int MSG_WRITE_NEXT = 16;
    /* access modifiers changed from: private */
    public byte[] mBytesToWrite;
    /* access modifiers changed from: private */
    public int mCurrentIndex;
    private byte[] mEncryptKey;
    /* access modifiers changed from: private */
    public Handler mHandler = new Handler(Looper.getMainLooper()) {
        public void handleMessage(Message message) {
            if (message.what == 16) {
                if (BLEBytesWriter.this.mCurrentIndex < BLEBytesWriter.this.mBytesToWrite.length) {
                    BLEBytesWriter.this.batchSendBytes();
                } else {
                    BLEBytesWriter.this.onBytesWriteSuccess();
                }
            }
        }
    };
    private String mMac;
    private BLEBytesWriteResponse mResponse;
    private int mType;
    private UUID mUUID;

    public interface BLEBytesWriteResponse extends BleResponse<Void> {
    }

    private BLEBytesWriter(String str, UUID uuid, int i, byte[] bArr, byte[] bArr2, BLEBytesWriteResponse bLEBytesWriteResponse) {
        this.mMac = str;
        this.mUUID = uuid;
        this.mType = i;
        this.mEncryptKey = bArr2;
        this.mBytesToWrite = bArr;
        this.mResponse = bLEBytesWriteResponse;
    }

    /* access modifiers changed from: private */
    public void batchSendBytes() {
        int length = this.mBytesToWrite.length - this.mCurrentIndex;
        int min = Math.min(18, length);
        byte[] bArr = new byte[(min + 2)];
        bArr[0] = (byte) length;
        bArr[1] = (byte) this.mType;
        ByteUtils.copy(bArr, this.mBytesToWrite, 2, this.mCurrentIndex);
        this.mCurrentIndex += min;
        if (!ByteUtils.isEmpty(this.mEncryptKey)) {
            bArr = BLECipher.encrypt(this.mEncryptKey, bArr);
        }
        MiotBleClient.getInstance().write(this.mMac, BluetoothConstants.MISERVICE, this.mUUID, bArr, new BleWriteResponse() {
            public void onResponse(int i) {
                if (i == 0) {
                    BLEBytesWriter.this.mHandler.obtainMessage(16).sendToTarget();
                } else {
                    BLEBytesWriter.this.onBytesWriteFailed();
                }
            }
        });
    }

    private void doWrite() {
        this.mHandler.obtainMessage(16, 0).sendToTarget();
    }

    /* access modifiers changed from: private */
    public void onBytesWriteFailed() {
        BLEBytesWriteResponse bLEBytesWriteResponse = this.mResponse;
        if (bLEBytesWriteResponse != null) {
            bLEBytesWriteResponse.onResponse(-1, null);
        }
    }

    /* access modifiers changed from: private */
    public void onBytesWriteSuccess() {
        BLEBytesWriteResponse bLEBytesWriteResponse = this.mResponse;
        if (bLEBytesWriteResponse != null) {
            bLEBytesWriteResponse.onResponse(0, null);
        }
    }

    public static void write(String str, UUID uuid, int i, byte[] bArr, byte[] bArr2, BLEBytesWriteResponse bLEBytesWriteResponse) {
        new BLEBytesWriter(str, uuid, i, bArr, bArr2, bLEBytesWriteResponse).doWrite();
    }
}
