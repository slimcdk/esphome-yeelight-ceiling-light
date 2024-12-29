package com.miot.service.connection;

import android.os.Parcel;
import android.os.Parcelable;

public class WifiInfo implements Parcelable {
    public static final Parcelable.Creator<WifiInfo> CREATOR = new Parcelable.Creator<WifiInfo>() {
        public WifiInfo createFromParcel(Parcel parcel) {
            return new WifiInfo(parcel);
        }

        public WifiInfo[] newArray(int i) {
            return new WifiInfo[i];
        }
    };
    private String mBssid;
    private String mCapabilities;
    private String mPassword;
    private String mSsid;

    public WifiInfo() {
    }

    protected WifiInfo(Parcel parcel) {
        this.mSsid = parcel.readString();
        this.mBssid = parcel.readString();
        this.mPassword = parcel.readString();
        this.mCapabilities = parcel.readString();
    }

    public int describeContents() {
        return 0;
    }

    public String getBssid() {
        return this.mBssid;
    }

    public String getCapabilities() {
        return this.mCapabilities;
    }

    public String getPassword() {
        return this.mPassword;
    }

    public String getSsid() {
        return this.mSsid;
    }

    public void setBssid(String str) {
        this.mBssid = str;
    }

    public void setCapabilities(String str) {
        this.mCapabilities = str;
    }

    public void setPassword(String str) {
        this.mPassword = str;
    }

    public void setSsid(String str) {
        this.mSsid = str;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mSsid);
        parcel.writeString(this.mBssid);
        parcel.writeString(this.mPassword);
        parcel.writeString(this.mCapabilities);
    }
}
