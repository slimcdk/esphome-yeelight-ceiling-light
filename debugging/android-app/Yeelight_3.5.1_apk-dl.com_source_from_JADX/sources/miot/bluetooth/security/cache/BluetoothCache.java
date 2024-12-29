package miot.bluetooth.security.cache;

import android.text.TextUtils;
import com.inuker.bluetooth.library.model.BleGattProfile;
import com.inuker.bluetooth.library.utils.ByteUtils;
import miot.bluetooth.security.encryption.TokenEncryption;

public class BluetoothCache {
    public static final int LOCAL_BOUNDED_DEVICES = 100;
    public static final int LOCAL_REMOVED_DEVICES = 101;
    public static final int PROP_BOUND_STATUS = 5;
    public static final int PROP_DESC = 3;
    public static final int PROP_DID = 2;
    public static final int PROP_EXTRA = 7;
    public static final int PROP_GATT_PROFILE = 9;
    public static final int PROP_MODEL = 4;
    public static final int PROP_NAME = 1;
    public static final int PROP_OWNER_ID = 10;
    public static final int PROP_SCANRECORD = 8;
    public static final int PROP_TOKEN = 6;
    public static final int REMOTE_BOUNDED_DEVICES = 102;

    public static String getPropBeaconKey(String str) {
        return BleDevicePropCache.getInstance().getPropBeaconKey(str);
    }

    public static int getPropBoundStatus(String str) {
        return BleDevicePropCache.getInstance().getPropBoundStatus(str);
    }

    public static String getPropDesc(String str) {
        return BleDevicePropCache.getInstance().getPropDesc(str);
    }

    public static String getPropDid(String str) {
        return BleDevicePropCache.getInstance().getPropDid(str);
    }

    public static String getPropExtra(String str, String str2) {
        return BleDevicePropCache.getInstance().getPropExtra(str, str2);
    }

    public static boolean getPropExtra(String str, String str2, boolean z) {
        return BleDevicePropCache.getInstance().getPropExtra(str, str2, z);
    }

    public static BleGattProfile getPropGattProfile(String str) {
        return BleDevicePropCache.getInstance().getPropGattProfile(str);
    }

    public static String getPropLtmk(String str) {
        return TokenEncryption.getInstance().decryptToken(BleDevicePropCache.getInstance().getEncryptedLtmk(str));
    }

    public static byte[] getPropLtmkBytes(String str) {
        String propLtmk = getPropLtmk(str);
        return TextUtils.isEmpty(propLtmk) ? ByteUtils.EMPTY_BYTES : ByteUtils.stringToBytes(propLtmk);
    }

    public static String getPropModel(String str) {
        return BleDevicePropCache.getInstance().getPropModel(str);
    }

    public static String getPropName(String str) {
        return BleDevicePropCache.getInstance().getPropName(str);
    }

    public static int getPropProductId(String str) {
        return BleDevicePropCache.getInstance().getPropProductId(str);
    }

    public static byte[] getPropScanRecord(String str) {
        return BleDevicePropCache.getInstance().getPropScanRecord(str);
    }

    public static String getPropSessionKey(String str) {
        return TokenEncryption.getInstance().decryptToken(BleDevicePropCache.getInstance().getEncryptedSessionKey(str));
    }

    public static byte[] getPropSessionKeyBytes(String str) {
        String propSessionKey = getPropSessionKey(str);
        return TextUtils.isEmpty(propSessionKey) ? ByteUtils.EMPTY_BYTES : ByteUtils.stringToBytes(propSessionKey);
    }

    public static String getPropToken(String str) {
        return TokenEncryption.getInstance().decryptToken(BleDevicePropCache.getInstance().getEncryptedToken(str));
    }

    public static byte[] getPropTokenBytes(String str) {
        String propToken = getPropToken(str);
        return TextUtils.isEmpty(propToken) ? ByteUtils.EMPTY_BYTES : ByteUtils.stringToBytes(propToken);
    }

    public static void reloadCache() {
        BleDevicePropCache.getInstance().reloadIfNeeded();
    }

    public static void removePropToken(String str) {
        BleDevicePropCache.getInstance().setEncryptedToken(str, "");
    }

    public static void setPropBeaconKey(String str, String str2) {
        BleDevicePropCache.getInstance().setPropBeaconKey(str, str2);
    }

    public static void setPropBoundStatus(String str, int i) {
        BleDevicePropCache.getInstance().setPropBoundStatus(str, i);
    }

    public static void setPropDesc(String str, String str2) {
        BleDevicePropCache.getInstance().setPropDesc(str, str2);
    }

    public static void setPropDid(String str, String str2) {
        BleDevicePropCache.getInstance().setPropDid(str, str2);
    }

    public static void setPropExtra(String str, String str2, String str3) {
        BleDevicePropCache.getInstance().setPropExtra(str, str2, str3);
    }

    public static void setPropExtra(String str, String str2, boolean z) {
        BleDevicePropCache.getInstance().setPropExtra(str, str2, z);
    }

    public static void setPropGattProfile(String str, BleGattProfile bleGattProfile) {
        BleDevicePropCache.getInstance().setPropGattProfile(str, bleGattProfile);
    }

    public static void setPropLtmk(String str, String str2) {
        BleDevicePropCache.getInstance().setEncryptedLtmk(str, TokenEncryption.getInstance().encryptToken(str2));
    }

    public static void setPropLtmkBytes(String str, byte[] bArr) {
        setPropLtmk(str, ByteUtils.byteToString(bArr));
    }

    public static void setPropMeshBindInfo(String str, String str2) {
        BleDevicePropCache.getInstance().setEncryptedMeshBindInfo(str, TokenEncryption.getInstance().encryptToken(str2));
    }

    public static void setPropModel(String str, String str2) {
        BleDevicePropCache.getInstance().setPropModel(str, str2);
    }

    public static void setPropName(String str, String str2) {
        BleDevicePropCache.getInstance().setPropName(str, str2);
    }

    public static void setPropProductId(String str, int i) {
        BleDevicePropCache.getInstance().setPropProductId(str, i);
    }

    public static void setPropScanRecord(String str, byte[] bArr) {
        BleDevicePropCache.getInstance().setPropScanRecord(str, bArr);
    }

    public static void setPropSessionKey(String str, String str2) {
        BleDevicePropCache.getInstance().setEncryptedSessionKey(str, TokenEncryption.getInstance().encryptToken(str2));
    }

    public static void setPropSessionKeyBytes(String str, byte[] bArr) {
        setPropSessionKey(str, ByteUtils.byteToString(bArr));
    }

    public static void setPropToken(String str, String str2) {
        BleDevicePropCache.getInstance().setEncryptedToken(str, TokenEncryption.getInstance().encryptToken(str2));
    }

    public static void setPropTokenBytes(String str, byte[] bArr) {
        setPropToken(str, ByteUtils.byteToString(bArr));
    }
}
