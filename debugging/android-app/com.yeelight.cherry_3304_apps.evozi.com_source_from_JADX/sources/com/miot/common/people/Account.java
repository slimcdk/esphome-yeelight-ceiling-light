package com.miot.common.people;

import android.os.Parcel;
import android.os.Parcelable;

public class Account implements Parcelable {
    public static final Parcelable.Creator<Account> CREATOR = new Parcelable.Creator<Account>() {
        public Account createFromParcel(Parcel parcel) {
            return new Account(parcel);
        }

        public Account[] newArray(int i) {
            return new Account[i];
        }
    };
    private String mIcon;
    private String mIcon120;
    private String mIcon320;
    private String mIcon75;
    private String mIcon90;
    private final String mUserId;
    private String mUserName;

    protected Account(Parcel parcel) {
        this.mUserName = parcel.readString();
        this.mUserId = parcel.readString();
        this.mIcon = parcel.readString();
        this.mIcon75 = parcel.readString();
        this.mIcon90 = parcel.readString();
        this.mIcon120 = parcel.readString();
        this.mIcon320 = parcel.readString();
    }

    public Account(String str) {
        this.mUserId = str;
    }

    public int describeContents() {
        return 0;
    }

    public String getIcon() {
        return this.mIcon;
    }

    public String getIcon120() {
        return this.mIcon120;
    }

    public String getIcon320() {
        return this.mIcon320;
    }

    public String getIcon75() {
        return this.mIcon75;
    }

    public String getIcon90() {
        return this.mIcon90;
    }

    public String getUserId() {
        return this.mUserId;
    }

    public String getUserName() {
        return this.mUserName;
    }

    public void setIcon(String str) {
        this.mIcon = str;
    }

    public void setIcon120(String str) {
        this.mIcon120 = str;
    }

    public void setIcon320(String str) {
        this.mIcon320 = str;
    }

    public void setIcon75(String str) {
        this.mIcon75 = str;
    }

    public void setIcon90(String str) {
        this.mIcon90 = str;
    }

    public void setUserName(String str) {
        this.mUserName = str;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mUserName);
        parcel.writeString(this.mUserId);
        parcel.writeString(this.mIcon);
        parcel.writeString(this.mIcon75);
        parcel.writeString(this.mIcon90);
        parcel.writeString(this.mIcon120);
        parcel.writeString(this.mIcon320);
    }
}
