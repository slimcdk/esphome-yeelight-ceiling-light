package miot.bluetooth.security.cache;

import com.inuker.bluetooth.library.model.BleGattProfile;
import miot.bluetooth.security.cache.BleDevicePropCache;

public interface IBlePropCacher {
    String getEncryptedLtmk(String str);

    String getEncryptedMeshBindInfo(String str);

    String getEncryptedSessionKey(String str);

    String getEncryptedToken(String str);

    String getPropBeaconKey(String str);

    int getPropBoundStatus(String str);

    String getPropDesc(String str);

    String getPropDid(String str);

    int getPropExtra(String str, String str2, int i);

    String getPropExtra(String str, String str2);

    boolean getPropExtra(String str, String str2, boolean z);

    BleGattProfile getPropGattProfile(String str);

    String getPropModel(String str);

    String getPropName(String str);

    String getPropOwnerId(String str);

    int getPropProductId(String str);

    byte[] getPropScanRecord(String str);

    void removePropExtra(String str, String str2);

    void setEncryptedLtmk(String str, String str2);

    void setEncryptedMeshBindInfo(String str, String str2);

    void setEncryptedSessionKey(String str, String str2);

    void setEncryptedToken(String str, String str2);

    void setPropBeaconKey(String str, String str2);

    void setPropBoundStatus(String str, int i);

    void setPropDesc(String str, String str2);

    void setPropDid(String str, String str2);

    void setPropExtra(String str, String str2, int i);

    void setPropExtra(String str, String str2, String str3);

    void setPropExtra(String str, String str2, boolean z);

    void setPropGattProfile(String str, BleGattProfile bleGattProfile);

    void setPropModel(String str, String str2);

    void setPropName(String str, String str2);

    void setPropOwnerId(String str, String str2);

    void setPropProductId(String str, int i);

    void setPropScanRecord(String str, byte[] bArr);

    void traverse(BleDevicePropCache.IPropTraverse iPropTraverse);
}
