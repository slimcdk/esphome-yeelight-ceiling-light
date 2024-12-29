package com.xiaomi.smarthome.core.server.internal.bluetooth.security.combo;

import android.os.Parcel;
import android.os.Parcelable;

public class BleComboWifiConfig implements Parcelable {
    public static final Parcelable.Creator<BleComboWifiConfig> CREATOR = new Parcelable.Creator<BleComboWifiConfig>() {
        public BleComboWifiConfig createFromParcel(Parcel parcel) {
            return new BleComboWifiConfig(parcel);
        }

        public BleComboWifiConfig[] newArray(int i) {
            return new BleComboWifiConfig[i];
        }
    };
    private static final String TAG = BleComboWifiConfig.class.getName();
    private static final int TYPE_BINDKEY_INDEX = 13;
    private static final int TYPE_BINDKEY_TIMESTAMP = 14;
    private static final int TYPE_BIND_KEY = 9;
    private static final int TYPE_CONFIG_TYPE = 8;
    private static final int TYPE_COUNTRY_CODE = 10;
    private static final int TYPE_COUNTRY_DOMAIN = 6;
    private static final int TYPE_GMT_OFFSET = 5;
    private static final int TYPE_LOCK_WIFI_TOKEN = 12;
    private static final int TYPE_PASSPORT_URL = 11;
    private static final int TYPE_PWD = 2;
    private static final int TYPE_SSID = 1;
    private static final int TYPE_TIME_ZONE = 7;
    private static final int TYPE_UID = 0;
    public String bindIndex = "";
    public String bindKey = "";
    public long bindTimestamp;
    public String bleToken = "";
    public String configType = "";
    public String countryCode = "";
    public String countryDomain = "";
    public int gmtOffset;
    public String passportUrl = "";
    public String password = "";
    public String ssid = "";
    public String timezone = "";
    public String uid = "";

    public BleComboWifiConfig() {
    }

    public BleComboWifiConfig(Parcel parcel) {
        this.uid = parcel.readString();
        this.ssid = parcel.readString();
        this.password = parcel.readString();
        this.gmtOffset = parcel.readInt();
        this.countryDomain = parcel.readString();
        this.timezone = parcel.readString();
        this.configType = parcel.readString();
        this.bindKey = parcel.readString();
        this.countryCode = parcel.readString();
        this.passportUrl = parcel.readString();
        this.bleToken = parcel.readString();
        this.bindIndex = parcel.readString();
        this.bindTimestamp = parcel.readLong();
    }

    public int describeContents() {
        return 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x019c  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x01a0  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x01e3  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x01e7  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x022a  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x022e  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x026c  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x02af  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x02ec  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x032b  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0057  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] toBytes() {
        /*
            r10 = this;
            r0 = 1024(0x400, float:1.435E-42)
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r0 = r0.order(r1)
            com.miot.service.log.MyLogger r1 = com.miot.service.log.MyLogger.getInstance()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = TAG
            r2.append(r3)
            java.lang.String r3 = " sendUserId = %s"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.String r5 = r10.uid
            r6 = 0
            r4[r6] = r5
            java.lang.String r2 = java.lang.String.format(r2, r4)
            r1.log(r2)
            r0.put(r6)
            java.lang.String r1 = r10.uid
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            r4 = 0
            if (r1 != 0) goto L_0x0052
            java.lang.String r1 = r10.uid     // Catch:{ all -> 0x0046 }
            long r1 = java.lang.Long.parseLong(r1)     // Catch:{ all -> 0x0046 }
            goto L_0x0053
        L_0x0046:
            r1 = move-exception
            com.miot.service.log.MyLogger r2 = com.miot.service.log.MyLogger.getInstance()
            java.lang.String r1 = r1.getMessage()
            r2.log(r1)
        L_0x0052:
            r1 = r4
        L_0x0053:
            int r7 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r7 >= 0) goto L_0x0058
            r1 = r4
        L_0x0058:
            byte[] r1 = com.inuker.bluetooth.library.utils.ByteUtils.fromLong(r1)
            int r2 = r1.length
            byte r2 = (byte) r2
            r0.put(r2)
            r0.put(r1)
            r0.put(r3)
            java.lang.String r1 = r10.ssid
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x0073
            r0.put(r6)
            goto L_0x0087
        L_0x0073:
            java.lang.String r1 = r10.ssid
            byte[] r1 = r1.getBytes()
            int r1 = r1.length
            byte r1 = (byte) r1
            r0.put(r1)
            java.lang.String r1 = r10.ssid
            byte[] r1 = r1.getBytes()
            r0.put(r1)
        L_0x0087:
            r1 = 2
            r0.put(r1)
            java.lang.String r1 = r10.password
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x0097
            r0.put(r6)
            goto L_0x00ab
        L_0x0097:
            java.lang.String r1 = r10.password
            byte[] r1 = r1.getBytes()
            int r1 = r1.length
            byte r1 = (byte) r1
            r0.put(r1)
            java.lang.String r1 = r10.password
            byte[] r1 = r1.getBytes()
            r0.put(r1)
        L_0x00ab:
            com.miot.service.log.MyLogger r1 = com.miot.service.log.MyLogger.getInstance()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r7 = TAG
            r2.append(r7)
            java.lang.String r8 = " gmt_offset = %d"
            r2.append(r8)
            java.lang.String r2 = r2.toString()
            java.lang.Object[] r8 = new java.lang.Object[r3]
            int r9 = r10.gmtOffset
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r8[r6] = r9
            java.lang.String r2 = java.lang.String.format(r2, r8)
            r1.log(r2)
            r1 = 5
            r0.put(r1)
            r1 = 4
            r0.put(r1)
            int r1 = r10.gmtOffset
            byte[] r1 = com.inuker.bluetooth.library.utils.ByteUtils.fromInt(r1)
            r0.put(r1)
            com.miot.service.log.MyLogger r1 = com.miot.service.log.MyLogger.getInstance()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r7)
            java.lang.String r8 = " country_domain = %s"
            r2.append(r8)
            java.lang.String r2 = r2.toString()
            java.lang.Object[] r8 = new java.lang.Object[r3]
            java.lang.String r9 = r10.countryDomain
            r8[r6] = r9
            java.lang.String r2 = java.lang.String.format(r2, r8)
            r1.log(r2)
            r1 = 6
            r0.put(r1)
            r1 = 3
            r0.put(r1)
            byte[] r1 = new byte[r1]
            r1 = {0, 0, 0} // fill-array
            java.lang.String r2 = r10.countryDomain
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x0124
            java.lang.String r2 = r10.countryDomain
            byte[] r2 = r2.getBytes()
            com.inuker.bluetooth.library.utils.ByteUtils.copy(r1, r2, r6, r6)
        L_0x0124:
            r0.put(r1)
            com.miot.service.log.MyLogger r1 = com.miot.service.log.MyLogger.getInstance()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r7)
            java.lang.String r8 = " timezone = %s"
            r2.append(r8)
            java.lang.String r2 = r2.toString()
            java.lang.Object[] r8 = new java.lang.Object[r3]
            java.lang.String r9 = r10.timezone
            r8[r6] = r9
            java.lang.String r2 = java.lang.String.format(r2, r8)
            r1.log(r2)
            r1 = 7
            r0.put(r1)
            java.lang.String r1 = r10.timezone
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x0159
            r0.put(r6)
            goto L_0x016d
        L_0x0159:
            java.lang.String r1 = r10.timezone
            byte[] r1 = r1.getBytes()
            int r1 = r1.length
            byte r1 = (byte) r1
            r0.put(r1)
            java.lang.String r1 = r10.timezone
            byte[] r1 = r1.getBytes()
            r0.put(r1)
        L_0x016d:
            com.miot.service.log.MyLogger r1 = com.miot.service.log.MyLogger.getInstance()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r7)
            java.lang.String r8 = " config_type = %s"
            r2.append(r8)
            java.lang.String r2 = r2.toString()
            java.lang.Object[] r8 = new java.lang.Object[r3]
            java.lang.String r9 = r10.configType
            r8[r6] = r9
            java.lang.String r2 = java.lang.String.format(r2, r8)
            r1.log(r2)
            r1 = 8
            r0.put(r1)
            java.lang.String r1 = r10.configType
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x01a0
            r0.put(r6)
            goto L_0x01b4
        L_0x01a0:
            java.lang.String r1 = r10.configType
            byte[] r1 = r1.getBytes()
            int r1 = r1.length
            byte r1 = (byte) r1
            r0.put(r1)
            java.lang.String r1 = r10.configType
            byte[] r1 = r1.getBytes()
            r0.put(r1)
        L_0x01b4:
            com.miot.service.log.MyLogger r1 = com.miot.service.log.MyLogger.getInstance()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r7)
            java.lang.String r8 = " bind_key = %s"
            r2.append(r8)
            java.lang.String r2 = r2.toString()
            java.lang.Object[] r8 = new java.lang.Object[r3]
            java.lang.String r9 = r10.bindKey
            r8[r6] = r9
            java.lang.String r2 = java.lang.String.format(r2, r8)
            r1.log(r2)
            r1 = 9
            r0.put(r1)
            java.lang.String r1 = r10.bindKey
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x01e7
            r0.put(r6)
            goto L_0x01fb
        L_0x01e7:
            java.lang.String r1 = r10.bindKey
            byte[] r1 = r1.getBytes()
            int r1 = r1.length
            byte r1 = (byte) r1
            r0.put(r1)
            java.lang.String r1 = r10.bindKey
            byte[] r1 = r1.getBytes()
            r0.put(r1)
        L_0x01fb:
            com.miot.service.log.MyLogger r1 = com.miot.service.log.MyLogger.getInstance()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r7)
            java.lang.String r8 = " country_code = %s"
            r2.append(r8)
            java.lang.String r2 = r2.toString()
            java.lang.Object[] r8 = new java.lang.Object[r3]
            java.lang.String r9 = r10.countryCode
            r8[r6] = r9
            java.lang.String r2 = java.lang.String.format(r2, r8)
            r1.log(r2)
            r1 = 10
            r0.put(r1)
            java.lang.String r1 = r10.countryCode
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x022e
            r0.put(r6)
            goto L_0x0242
        L_0x022e:
            java.lang.String r1 = r10.countryCode
            byte[] r1 = r1.getBytes()
            int r1 = r1.length
            byte r1 = (byte) r1
            r0.put(r1)
            java.lang.String r1 = r10.countryCode
            byte[] r1 = r1.getBytes()
            r0.put(r1)
        L_0x0242:
            com.miot.service.log.MyLogger r1 = com.miot.service.log.MyLogger.getInstance()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r7)
            java.lang.String r8 = " passportUrl = %s"
            r2.append(r8)
            java.lang.String r2 = r2.toString()
            java.lang.Object[] r8 = new java.lang.Object[r3]
            java.lang.String r9 = r10.passportUrl
            r8[r6] = r9
            java.lang.String r2 = java.lang.String.format(r2, r8)
            r1.log(r2)
            java.lang.String r1 = r10.passportUrl
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0285
            r1 = 11
            r0.put(r1)
            java.lang.String r1 = r10.passportUrl
            byte[] r1 = r1.getBytes()
            int r1 = r1.length
            byte r1 = (byte) r1
            r0.put(r1)
            java.lang.String r1 = r10.passportUrl
            byte[] r1 = r1.getBytes()
            r0.put(r1)
        L_0x0285:
            com.miot.service.log.MyLogger r1 = com.miot.service.log.MyLogger.getInstance()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r7)
            java.lang.String r8 = " ble token = %s"
            r2.append(r8)
            java.lang.String r2 = r2.toString()
            java.lang.Object[] r8 = new java.lang.Object[r3]
            java.lang.String r9 = r10.bleToken
            r8[r6] = r9
            java.lang.String r2 = java.lang.String.format(r2, r8)
            r1.log(r2)
            java.lang.String r1 = r10.bleToken
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x02c2
            r1 = 12
            r0.put(r1)
            java.lang.String r1 = r10.bleToken
            byte[] r1 = com.inuker.bluetooth.library.utils.ByteUtils.stringToBytes(r1)
            int r2 = r1.length
            byte r2 = (byte) r2
            r0.put(r2)
            r0.put(r1)
        L_0x02c2:
            com.miot.service.log.MyLogger r1 = com.miot.service.log.MyLogger.getInstance()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r7)
            java.lang.String r8 = " bindIndex = %s"
            r2.append(r8)
            java.lang.String r2 = r2.toString()
            java.lang.Object[] r8 = new java.lang.Object[r3]
            java.lang.String r9 = r10.bindIndex
            r8[r6] = r9
            java.lang.String r2 = java.lang.String.format(r2, r8)
            r1.log(r2)
            java.lang.String r1 = r10.bindIndex
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x02ff
            r1 = 13
            r0.put(r1)
            java.lang.String r1 = r10.bindIndex
            byte[] r1 = r1.getBytes()
            int r2 = r1.length
            byte r2 = (byte) r2
            r0.put(r2)
            r0.put(r1)
        L_0x02ff:
            com.miot.service.log.MyLogger r1 = com.miot.service.log.MyLogger.getInstance()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r7)
            java.lang.String r7 = " bindTimestamp = %s"
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            java.lang.Object[] r3 = new java.lang.Object[r3]
            long r7 = r10.bindTimestamp
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r3[r6] = r7
            java.lang.String r2 = java.lang.String.format(r2, r3)
            r1.log(r2)
            long r1 = r10.bindTimestamp
            int r3 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r3 <= 0) goto L_0x033e
            r1 = 14
            r0.put(r1)
            long r1 = r10.bindTimestamp
            byte[] r1 = com.inuker.bluetooth.library.utils.ByteUtils.fromLong(r1)
            int r2 = r1.length
            byte r2 = (byte) r2
            r0.put(r2)
            r0.put(r1)
        L_0x033e:
            int r1 = r0.position()
            byte[] r2 = new byte[r1]
            byte[] r0 = r0.array()
            java.lang.System.arraycopy(r0, r6, r2, r6, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.smarthome.core.server.internal.bluetooth.security.combo.BleComboWifiConfig.toBytes():byte[]");
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.uid);
        parcel.writeString(this.ssid);
        parcel.writeString(this.password);
        parcel.writeInt(this.gmtOffset);
        parcel.writeString(this.countryDomain);
        parcel.writeString(this.timezone);
        parcel.writeString(this.configType);
        parcel.writeString(this.bindKey);
        parcel.writeString(this.countryCode);
        parcel.writeString(this.passportUrl);
        parcel.writeString(this.bleToken);
        parcel.writeString(this.bindIndex);
        parcel.writeLong(this.bindTimestamp);
    }
}
