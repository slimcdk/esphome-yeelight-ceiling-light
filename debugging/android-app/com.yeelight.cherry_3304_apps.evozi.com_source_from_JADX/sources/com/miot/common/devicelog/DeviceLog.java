package com.miot.common.devicelog;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONObject;
import p011c.p012a.p046d.C0664f;

public class DeviceLog implements Parcelable {
    public static final Parcelable.Creator<DeviceLog> CREATOR = new Parcelable.Creator<DeviceLog>() {
        public DeviceLog createFromParcel(Parcel parcel) {
            return new DeviceLog(parcel);
        }

        public DeviceLog[] newArray(int i) {
            return new DeviceLog[i];
        }
    };
    private String did;
    private String key;
    private int time;
    private String type;
    private String uid;
    private String value;

    public DeviceLog() {
    }

    protected DeviceLog(Parcel parcel) {
        this.uid = parcel.readString();
        this.time = parcel.readInt();
        this.value = parcel.readString();
        this.did = parcel.readString();
        this.type = parcel.readString();
        this.key = parcel.readString();
    }

    public static DeviceLog create(JSONObject jSONObject) {
        return (DeviceLog) new C0664f().mo8704i(jSONObject.toString(), DeviceLog.class);
    }

    public int describeContents() {
        return 0;
    }

    public String getDeviceId() {
        return this.did;
    }

    public String getKey() {
        return this.key;
    }

    public int getTime() {
        return this.time;
    }

    public String getType() {
        return this.type;
    }

    public String getUserId() {
        return this.uid;
    }

    public String getValue() {
        return this.value;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.uid);
        parcel.writeInt(this.time);
        parcel.writeString(this.value);
        parcel.writeString(this.did);
        parcel.writeString(this.type);
        parcel.writeString(this.key);
    }
}
