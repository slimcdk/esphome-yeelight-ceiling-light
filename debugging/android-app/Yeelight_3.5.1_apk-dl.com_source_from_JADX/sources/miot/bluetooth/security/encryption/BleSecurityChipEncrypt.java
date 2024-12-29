package miot.bluetooth.security.encryption;

import com.inuker.bluetooth.library.connect.response.BleReadResponse;
import com.inuker.bluetooth.library.utils.BluetoothLog;
import com.inuker.bluetooth.library.utils.BluetoothUtils;
import java.util.HashMap;
import java.util.Map;
import miot.bluetooth.security.cache.BluetoothCache;

public class BleSecurityChipEncrypt {
    private static Map<String, EncryptCounter> mCounterMap = new HashMap();

    public static class EncryptCounter {
        private short mAppHighCounter;
        private short mAppLowCounter;
        private short mDevHighCounter;
        private short mDevLowCounter;

        public void addAppLowCounter() {
            short s = this.mAppLowCounter;
            int i = (s & 32768) >> 15;
            short s2 = (short) (s + 1);
            this.mAppLowCounter = s2;
            if (i != ((s2 & 32768) >> 15)) {
                this.mAppHighCounter = (short) (this.mAppHighCounter + 1);
            }
        }

        public short getAppLowCounter() {
            return this.mAppLowCounter;
        }

        public byte[] getAppNonce() {
            short s = this.mAppLowCounter;
            short s2 = this.mAppHighCounter;
            return new byte[]{(byte) (s & 255), (byte) (s >> 8), (byte) (s2 & 255), (byte) (s2 >> 8)};
        }

        public byte[] getDevNonce() {
            short s = this.mDevLowCounter;
            short s2 = this.mDevHighCounter;
            return new byte[]{(byte) (s & 255), (byte) (s >> 8), (byte) (s2 & 255), (byte) (s2 >> 8)};
        }

        public void resetAllCounter() {
            this.mAppHighCounter = 0;
            this.mAppLowCounter = 0;
            this.mDevHighCounter = 0;
            this.mDevLowCounter = 0;
        }

        public void updateDevLowCounter(short s) {
            int i = (this.mDevLowCounter & 32768) >> 15;
            int i2 = (32768 & s) >> 15;
            this.mDevLowCounter = s;
            if (i != i2) {
                this.mDevHighCounter = (short) (this.mDevHighCounter + 1);
            }
        }
    }

    private static boolean checkRuntime(String str) {
        StringBuilder sb;
        String str2;
        if (!BluetoothUtils.isDeviceConnected(str)) {
            sb = new StringBuilder();
            sb.append(str);
            str2 = " is not connected";
        } else {
            byte[] propSessionKeyBytes = BluetoothCache.getPropSessionKeyBytes(str);
            if (propSessionKeyBytes != null && propSessionKeyBytes.length == 64) {
                return true;
            }
            sb = new StringBuilder();
            sb.append(str);
            str2 = " sessionKey is null or invalid";
        }
        sb.append(str2);
        BluetoothLog.m7329e(sb.toString());
        return false;
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:21:0x0064=Splitter:B:21:0x0064, B:25:0x0069=Splitter:B:25:0x0069} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void decrypt(java.lang.String r9, byte[] r10, com.inuker.bluetooth.library.connect.response.BleReadResponse r11) {
        /*
            java.lang.Class<miot.bluetooth.security.encryption.BleSecurityChipEncrypt> r0 = miot.bluetooth.security.encryption.BleSecurityChipEncrypt.class
            monitor-enter(r0)
            boolean r1 = checkRuntime(r9)     // Catch:{ all -> 0x006e }
            r2 = 0
            r3 = -1
            if (r1 != 0) goto L_0x0010
            invokeResponse(r11, r3, r2)     // Catch:{ all -> 0x006e }
            monitor-exit(r0)
            return
        L_0x0010:
            if (r10 == 0) goto L_0x0069
            int r1 = r10.length     // Catch:{ all -> 0x006e }
            r4 = 2
            if (r1 > r4) goto L_0x0017
            goto L_0x0069
        L_0x0017:
            byte[] r1 = miot.bluetooth.security.cache.BluetoothCache.getPropSessionKeyBytes(r9)     // Catch:{ all -> 0x006e }
            if (r1 == 0) goto L_0x0064
            int r5 = r1.length     // Catch:{ all -> 0x006e }
            if (r5 != 0) goto L_0x0021
            goto L_0x0064
        L_0x0021:
            r2 = 16
            r3 = 0
            byte[] r2 = java.util.Arrays.copyOfRange(r1, r3, r2)     // Catch:{ all -> 0x006e }
            r5 = 32
            r6 = 36
            byte[] r1 = java.util.Arrays.copyOfRange(r1, r5, r6)     // Catch:{ all -> 0x006e }
            r5 = 1
            byte r5 = r10[r5]     // Catch:{ all -> 0x006e }
            r6 = 8
            int r5 = r5 << r6
            byte r7 = r10[r3]     // Catch:{ all -> 0x006e }
            r7 = r7 & 255(0xff, float:3.57E-43)
            r5 = r5 | r7
            short r5 = (short) r5     // Catch:{ all -> 0x006e }
            int r7 = r10.length     // Catch:{ all -> 0x006e }
            int r7 = r7 - r4
            byte[] r7 = new byte[r7]     // Catch:{ all -> 0x006e }
            int r8 = r10.length     // Catch:{ all -> 0x006e }
            int r8 = r8 - r4
            java.lang.System.arraycopy(r10, r4, r7, r3, r8)     // Catch:{ all -> 0x006e }
            miot.bluetooth.security.encryption.BleSecurityChipEncrypt$EncryptCounter r9 = getEncryptCounter(r9)     // Catch:{ all -> 0x006e }
            r9.updateDevLowCounter(r5)     // Catch:{ all -> 0x006e }
            r10 = 12
            byte[] r10 = new byte[r10]     // Catch:{ all -> 0x006e }
            r4 = 4
            java.lang.System.arraycopy(r1, r3, r10, r3, r4)     // Catch:{ all -> 0x006e }
            byte[] r9 = r9.getDevNonce()     // Catch:{ all -> 0x006e }
            java.lang.System.arraycopy(r9, r3, r10, r6, r4)     // Catch:{ all -> 0x006e }
            byte[] r9 = miot.bluetooth.security.utils.SecurityChipUtil.AESDecrypt(r2, r10, r7)     // Catch:{ all -> 0x006e }
            invokeResponse(r11, r3, r9)     // Catch:{ all -> 0x006e }
            monitor-exit(r0)
            return
        L_0x0064:
            invokeResponse(r11, r3, r2)     // Catch:{ all -> 0x006e }
            monitor-exit(r0)
            return
        L_0x0069:
            invokeResponse(r11, r3, r2)     // Catch:{ all -> 0x006e }
            monitor-exit(r0)
            return
        L_0x006e:
            r9 = move-exception
            monitor-exit(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: miot.bluetooth.security.encryption.BleSecurityChipEncrypt.decrypt(java.lang.String, byte[], com.inuker.bluetooth.library.connect.response.BleReadResponse):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0071, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void encrypt(java.lang.String r10, byte[] r11, com.inuker.bluetooth.library.connect.response.BleReadResponse r12) {
        /*
            java.lang.Class<miot.bluetooth.security.encryption.BleSecurityChipEncrypt> r0 = miot.bluetooth.security.encryption.BleSecurityChipEncrypt.class
            monitor-enter(r0)
            boolean r1 = checkRuntime(r10)     // Catch:{ all -> 0x0077 }
            r2 = 0
            r3 = -1
            if (r1 != 0) goto L_0x0010
            invokeResponse(r12, r3, r2)     // Catch:{ all -> 0x0077 }
            monitor-exit(r0)
            return
        L_0x0010:
            byte[] r1 = miot.bluetooth.security.cache.BluetoothCache.getPropSessionKeyBytes(r10)     // Catch:{ all -> 0x0077 }
            if (r1 == 0) goto L_0x0072
            int r4 = r1.length     // Catch:{ all -> 0x0077 }
            if (r4 != 0) goto L_0x001a
            goto L_0x0072
        L_0x001a:
            r4 = 16
            r5 = 32
            byte[] r4 = java.util.Arrays.copyOfRange(r1, r4, r5)     // Catch:{ all -> 0x0077 }
            r5 = 36
            r6 = 40
            byte[] r1 = java.util.Arrays.copyOfRange(r1, r5, r6)     // Catch:{ all -> 0x0077 }
            r5 = 12
            byte[] r5 = new byte[r5]     // Catch:{ all -> 0x0077 }
            r6 = 4
            r7 = 0
            java.lang.System.arraycopy(r1, r7, r5, r7, r6)     // Catch:{ all -> 0x0077 }
            miot.bluetooth.security.encryption.BleSecurityChipEncrypt$EncryptCounter r10 = getEncryptCounter(r10)     // Catch:{ all -> 0x0077 }
            short r1 = r10.getAppLowCounter()     // Catch:{ all -> 0x0077 }
            byte[] r8 = r10.getAppNonce()     // Catch:{ all -> 0x0077 }
            r9 = 8
            java.lang.System.arraycopy(r8, r7, r5, r9, r6)     // Catch:{ all -> 0x0077 }
            byte[] r11 = miot.bluetooth.security.utils.SecurityChipUtil.AESEncrypt(r4, r5, r11)     // Catch:{ all -> 0x0077 }
            if (r11 != 0) goto L_0x004e
            invokeResponse(r12, r3, r2)     // Catch:{ all -> 0x0077 }
            goto L_0x0070
        L_0x004e:
            r10.addAppLowCounter()     // Catch:{ all -> 0x0077 }
            r10 = 65535(0xffff, float:9.1834E-41)
            r10 = r10 & r1
            short r10 = (short) r10     // Catch:{ all -> 0x0077 }
            int r1 = r11.length     // Catch:{ all -> 0x0077 }
            int r1 = r1 + 2
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r1)     // Catch:{ all -> 0x0077 }
            java.nio.ByteOrder r2 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch:{ all -> 0x0077 }
            java.nio.ByteBuffer r1 = r1.order(r2)     // Catch:{ all -> 0x0077 }
            r1.putShort(r10)     // Catch:{ all -> 0x0077 }
            r1.put(r11)     // Catch:{ all -> 0x0077 }
            byte[] r10 = r1.array()     // Catch:{ all -> 0x0077 }
            invokeResponse(r12, r7, r10)     // Catch:{ all -> 0x0077 }
        L_0x0070:
            monitor-exit(r0)
            return
        L_0x0072:
            invokeResponse(r12, r3, r2)     // Catch:{ all -> 0x0077 }
            monitor-exit(r0)
            return
        L_0x0077:
            r10 = move-exception
            monitor-exit(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: miot.bluetooth.security.encryption.BleSecurityChipEncrypt.encrypt(java.lang.String, byte[], com.inuker.bluetooth.library.connect.response.BleReadResponse):void");
    }

    private static EncryptCounter getEncryptCounter(String str) {
        EncryptCounter encryptCounter = mCounterMap.get(str);
        if (encryptCounter != null) {
            return encryptCounter;
        }
        EncryptCounter encryptCounter2 = new EncryptCounter();
        mCounterMap.put(str, encryptCounter2);
        return encryptCounter2;
    }

    private static void invokeResponse(BleReadResponse bleReadResponse, int i, byte[] bArr) {
        if (bleReadResponse != null) {
            bleReadResponse.onResponse(i, bArr);
        }
    }

    public static void resetEncryptCounter(String str) {
        EncryptCounter encryptCounter = mCounterMap.get(str);
        if (encryptCounter != null) {
            encryptCounter.resetAllCounter();
        }
    }
}
