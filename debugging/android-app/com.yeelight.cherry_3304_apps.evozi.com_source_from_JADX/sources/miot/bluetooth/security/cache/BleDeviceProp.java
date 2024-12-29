package miot.bluetooth.security.cache;

import android.text.TextUtils;
import com.inuker.bluetooth.library.model.BleGattProfile;
import com.inuker.bluetooth.library.utils.BluetoothLog;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

public class BleDeviceProp implements Serializable {
    private String beaconKey;
    private int boundStatus;
    private String desc;
    private String did;
    private String encryptedLtmk;
    private String encryptedMeshBindInfo;
    private String encryptedSession;
    private String encryptedToken;
    private JSONObject extras = new JSONObject();
    private String model;
    private String name;
    private String ownerId;
    private int productId;
    private BleGattProfile profile;
    private String scanRecord;

    public static BleDeviceProp fromJson(String str) {
        try {
            BleDeviceProp bleDeviceProp = new BleDeviceProp();
            JSONObject jSONObject = new JSONObject(str);
            bleDeviceProp.name = jSONObject.optString("name");
            bleDeviceProp.did = jSONObject.optString("did");
            bleDeviceProp.desc = jSONObject.optString("desc");
            bleDeviceProp.model = jSONObject.optString("model");
            bleDeviceProp.productId = jSONObject.optInt("productId");
            bleDeviceProp.boundStatus = jSONObject.optInt("boundStatus");
            bleDeviceProp.encryptedToken = jSONObject.optString("encryptedToken");
            bleDeviceProp.ownerId = jSONObject.optString("ownerId");
            JSONObject optJSONObject = jSONObject.optJSONObject("extras");
            bleDeviceProp.encryptedMeshBindInfo = jSONObject.optString("encryptedMeshBindInfo");
            if (optJSONObject != null) {
                bleDeviceProp.extras = optJSONObject;
            }
            return bleDeviceProp;
        } catch (Exception unused) {
            return null;
        }
    }

    public String getBeaconKey() {
        return this.beaconKey;
    }

    public int getBoundStatus() {
        return this.boundStatus;
    }

    public String getDesc() {
        return this.desc;
    }

    public String getDid() {
        return this.did;
    }

    public String getEncryptedLtmk() {
        return this.encryptedLtmk;
    }

    public String getEncryptedMeshBindInfo() {
        return this.encryptedMeshBindInfo;
    }

    public String getEncryptedSession() {
        return this.encryptedSession;
    }

    public String getEncryptedToken() {
        return this.encryptedToken;
    }

    public int getExtra(String str, int i) {
        return this.extras.optInt(str, i);
    }

    public String getExtra(String str, String str2) {
        return this.extras.optString(str, str2);
    }

    public boolean getExtra(String str, boolean z) {
        return this.extras.optBoolean(str, z);
    }

    public String getModel() {
        return this.model;
    }

    public String getName() {
        return this.name;
    }

    public String getOwnerId() {
        return this.ownerId;
    }

    public int getProductId() {
        return this.productId;
    }

    public BleGattProfile getProfile() {
        return this.profile;
    }

    public String getScanRecord() {
        return this.scanRecord;
    }

    public void removeExtra(String str) {
        this.extras.remove(str);
    }

    public void setBeaconKey(String str) {
        this.beaconKey = str;
    }

    public void setBoundStatus(int i) {
        this.boundStatus = i;
    }

    public void setDesc(String str) {
        this.desc = str;
    }

    public void setDid(String str) {
        this.did = str;
    }

    public void setEncryptedLtmk(String str) {
        this.encryptedLtmk = str;
    }

    public void setEncryptedMeshBindInfo(String str) {
        this.encryptedMeshBindInfo = str;
    }

    public void setEncryptedSession(String str) {
        this.encryptedSession = str;
    }

    public void setEncryptedToken(String str) {
        this.encryptedToken = str;
    }

    public void setExtra(String str, int i) {
        try {
            this.extras.put(str, i);
        } catch (JSONException e) {
            BluetoothLog.m10336e((Throwable) e);
        }
    }

    public void setExtra(String str, String str2) {
        try {
            this.extras.put(str, str2);
        } catch (JSONException e) {
            BluetoothLog.m10336e((Throwable) e);
        }
    }

    public void setExtra(String str, boolean z) {
        try {
            this.extras.put(str, z);
        } catch (JSONException e) {
            BluetoothLog.m10336e((Throwable) e);
        }
    }

    public void setModel(String str) {
        this.model = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setOwnerId(String str) {
        this.ownerId = str;
    }

    public void setProductId(int i) {
        this.productId = i;
    }

    public void setProfile(BleGattProfile bleGattProfile) {
        this.profile = bleGattProfile;
    }

    public void setScanRecord(String str) {
        this.scanRecord = str;
    }

    public String toJson() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", this.name);
            jSONObject.put("did", this.did);
            jSONObject.put("desc", this.desc);
            jSONObject.put("model", this.model);
            jSONObject.put("productId", this.productId);
            jSONObject.put("boundStatus", this.boundStatus);
            jSONObject.put("encryptedToken", this.encryptedToken);
            jSONObject.put("ownerId", this.ownerId);
            jSONObject.put("extras", this.extras);
            jSONObject.put("encryptedMeshBindInfo", this.encryptedMeshBindInfo);
        } catch (Exception unused) {
        }
        return jSONObject.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(this.name)) {
            sb.append("name = " + this.name);
        }
        if (!TextUtils.isEmpty(this.did)) {
            sb.append(", did = " + this.did);
        }
        if (!TextUtils.isEmpty(this.desc)) {
            sb.append(", desc = " + this.desc);
        }
        if (!TextUtils.isEmpty(this.model)) {
            sb.append(", model = " + this.model);
        }
        if (this.productId > 0) {
            sb.append(", productId = " + this.productId);
        }
        sb.append(", boundStatus = " + this.boundStatus);
        if (this.extras.length() > 0) {
            sb.append(", extras = " + this.extras);
        }
        return sb.toString();
    }
}
