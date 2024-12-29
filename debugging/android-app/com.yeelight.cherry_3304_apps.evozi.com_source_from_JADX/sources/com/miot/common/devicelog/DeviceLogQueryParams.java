package com.miot.common.devicelog;

import android.os.Parcel;
import android.os.Parcelable;

public class DeviceLogQueryParams implements Parcelable {
    public static final Parcelable.Creator<DeviceLogQueryParams> CREATOR = new Parcelable.Creator<DeviceLogQueryParams>() {
        public DeviceLogQueryParams createFromParcel(Parcel parcel) {
            return new DeviceLogQueryParams(parcel);
        }

        public DeviceLogQueryParams[] newArray(int i) {
            return new DeviceLogQueryParams[i];
        }
    };
    String did;
    String key;
    int limit;
    long time_end;
    long time_start;
    String type;

    public DeviceLogQueryParams() {
    }

    protected DeviceLogQueryParams(Parcel parcel) {
        this.did = parcel.readString();
        this.type = parcel.readString();
        this.key = parcel.readString();
        this.time_start = parcel.readLong();
        this.time_end = parcel.readLong();
        this.limit = parcel.readInt();
    }

    public int describeContents() {
        return 0;
    }

    public String getDid() {
        return this.did;
    }

    public String getKey() {
        return this.key;
    }

    public int getLimit() {
        return this.limit;
    }

    public long getTimeEnd() {
        return this.time_end;
    }

    public long getTimeStart() {
        return this.time_start;
    }

    public String getType() {
        return this.type;
    }

    public void setDid(String str) {
        this.did = str;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void setLimit(int i) {
        this.limit = i;
    }

    public void setTimeEnd(long j) {
        this.time_end = j;
    }

    public void setTimeStart(long j) {
        this.time_start = j;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.did);
        parcel.writeString(this.type);
        parcel.writeString(this.key);
        parcel.writeLong(this.time_start);
        parcel.writeLong(this.time_end);
        parcel.writeInt(this.limit);
    }
}
