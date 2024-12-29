package com.inuker.bluetooth.library;

import android.text.TextUtils;
import com.google.p017ar.schemas.sceneform.ParameterInitDefType;
import com.inuker.bluetooth.library.utils.BluetoothLog;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class BleMessageParser {
    public static final byte CHANNEL_VERSION = 1;
    public static final byte COMPRESS_GZIP = 1;
    public static final byte COMPRESS_NONE = 0;
    public static final byte DEVICE_PROP_MSG_TYPE = 2;
    public static final byte ECHO_MSG_TYPE = 4;
    public static final byte ENCRYPTION_NONE = 0;
    public static final int HEADER_SIZE = 5;
    public static final byte RESULT_FAIL = 0;
    public static final byte RESULT_OK = 1;
    public static final byte RPC_MSG_TYPE = 1;
    public static final byte UNKNOWN_MSG_TYPE = 0;
    public static final byte WRITE_BLOCK_MSG_TYPE = 3;
    private static Map<String, IResponse> sBlockBleListenerMap = new ConcurrentHashMap();

    public static class MiBTChannelData {
        /* access modifiers changed from: private */
        public byte[] data;
        /* access modifiers changed from: private */

        /* renamed from: id */
        public short f4523id = 0;
        private byte result = 0;
        private byte type = 0;

        public MiBTChannelData(short s, byte b, byte b2, byte[] bArr) {
            this.f4523id = s;
            this.type = b;
            this.result = b2;
            this.data = bArr;
        }

        public MiBTChannelData(short s, byte b, byte[] bArr) {
            this.f4523id = s;
            this.type = b;
            this.data = bArr;
        }

        public byte[] getData() {
            return this.data;
        }

        public short getId() {
            return this.f4523id;
        }

        public byte getResult() {
            return this.result;
        }

        public byte getType() {
            return this.type;
        }

        public boolean isResultOk() {
            return this.result == 1;
        }

        public String toString() {
            return "MiBTChannelUtil{id=" + this.f4523id + ", type=" + this.type + ", data='" + this.data + '\'' + '}';
        }
    }

    public static byte[] build(MiBTChannelData miBTChannelData, boolean z) {
        byte[] access$000 = miBTChannelData.data;
        if (z && miBTChannelData.data != null && miBTChannelData.data.length > 0) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                gZIPOutputStream.write(miBTChannelData.data);
                gZIPOutputStream.finish();
                gZIPOutputStream.close();
                access$000 = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        ByteBuffer order = ByteBuffer.allocate(access$000 != null ? access$000.length + 5 : 5).order(ByteOrder.LITTLE_ENDIAN);
        order.put((byte) 1);
        order.putShort(miBTChannelData.f4523id);
        order.put((byte) (miBTChannelData.getResult() | (miBTChannelData.getType() << 4)));
        order.put((byte) ((z ? 1 : 0) << true));
        if (access$000 != null) {
            order.put(access$000);
        }
        return order.array();
    }

    private static MiBTChannelData parse(byte[] bArr) {
        if (bArr == null || bArr.length < 5) {
            BluetoothLog.m7332v("MiBTChannelUtil parse data invalid");
            return null;
        }
        ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
        order.get();
        short s = order.getShort();
        byte b = order.get();
        byte b2 = order.get();
        byte[] bArr2 = new byte[0];
        if (bArr.length > 5) {
            bArr2 = Arrays.copyOfRange(bArr, 5, bArr.length);
        }
        byte b3 = (byte) (b & ParameterInitDefType.CubemapSamplerInit);
        byte b4 = (byte) ((b & 255) >> 4);
        if (((byte) ((b2 & 255) >> 5)) == 1 && bArr2.length > 0) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr2);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                byte[] bArr3 = new byte[256];
                while (true) {
                    int read = gZIPInputStream.read(bArr3);
                    if (read < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr3, 0, read);
                }
                bArr2 = byteArrayOutputStream.toByteArray();
                gZIPInputStream.close();
                byteArrayInputStream.close();
                byteArrayOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return new MiBTChannelData(s, b4, b3, bArr2);
    }

    public static void registerBlockListener(String str, IResponse iResponse) {
        if (!TextUtils.isEmpty(str) && iResponse != null) {
            sBlockBleListenerMap.put(str, iResponse);
        }
    }

    public static void unregisterBlockListener(String str) {
        sBlockBleListenerMap.remove(str);
    }

    public static byte[] writeBlockMsgWrapper(byte[] bArr) {
        return build(new MiBTChannelData(0, (byte) 3, (byte) 1, bArr), false);
    }
}
