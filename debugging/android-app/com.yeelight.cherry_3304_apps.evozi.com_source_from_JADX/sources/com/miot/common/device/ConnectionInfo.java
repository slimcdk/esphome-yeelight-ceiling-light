package com.miot.common.device;

import android.os.Parcel;
import android.os.Parcelable;

public class ConnectionInfo implements Parcelable {
    public static final Parcelable.Creator<ConnectionInfo> CREATOR = new Parcelable.Creator<ConnectionInfo>() {
        public ConnectionInfo createFromParcel(Parcel parcel) {
            return new ConnectionInfo(parcel);
        }

        public ConnectionInfo[] newArray(int i) {
            return new ConnectionInfo[i];
        }
    };
    public static final int DEFAULT_PORT = 54321;
    private String mBssid;
    private String mHost;
    private volatile Location mLocation = Location.REMOTE;
    private int mPort = DEFAULT_PORT;
    private int mRssi;
    private String mSsid;

    public ConnectionInfo() {
    }

    protected ConnectionInfo(Parcel parcel) {
        this.mSsid = parcel.readString();
        this.mBssid = parcel.readString();
        this.mRssi = parcel.readInt();
        this.mHost = parcel.readString();
        this.mPort = parcel.readInt();
        this.mLocation = (Location) parcel.readParcelable(Location.class.getClassLoader());
    }

    public int describeContents() {
        return 0;
    }

    public String getBssid() {
        return this.mBssid;
    }

    public String getHost() {
        return this.mHost;
    }

    public Location getLocation() {
        return this.mLocation;
    }

    public int getPort() {
        return this.mPort;
    }

    public int getRssi() {
        return this.mRssi;
    }

    public String getSsid() {
        return this.mSsid;
    }

    public void setBssid(String str) {
        this.mBssid = str;
    }

    public void setHost(String str) {
        this.mHost = str;
    }

    public void setLocation(Location location) {
        this.mLocation = location;
    }

    public void setRssi(int i) {
        this.mRssi = i;
    }

    public void setSsid(String str) {
        this.mSsid = str;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mSsid);
        parcel.writeString(this.mBssid);
        parcel.writeInt(this.mRssi);
        parcel.writeString(this.mHost);
        parcel.writeInt(this.mPort);
        parcel.writeParcelable(this.mLocation, i);
    }
}
