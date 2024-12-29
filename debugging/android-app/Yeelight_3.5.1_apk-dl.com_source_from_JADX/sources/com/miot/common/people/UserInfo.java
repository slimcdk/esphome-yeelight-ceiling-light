package com.miot.common.people;

import android.os.Parcel;
import android.os.Parcelable;

public class UserInfo implements Parcelable {
    public static final Parcelable.Creator<UserInfo> CREATOR = new Parcelable.Creator<UserInfo>() {
        public UserInfo createFromParcel(Parcel parcel) {
            return new UserInfo(parcel);
        }

        public UserInfo[] newArray(int i) {
            return new UserInfo[i];
        }
    };
    private String icon;
    private String icon120;
    private String icon320;
    private String icon75;
    private String icon90;
    private String miId;
    private String nickName;

    protected UserInfo(Parcel parcel) {
        this.miId = parcel.readString();
        this.nickName = parcel.readString();
        this.icon = parcel.readString();
        this.icon75 = parcel.readString();
        this.icon90 = parcel.readString();
        this.icon120 = parcel.readString();
        this.icon320 = parcel.readString();
    }

    public UserInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.miId = str;
        this.nickName = str2;
        this.icon = str3;
        this.icon75 = str4;
        this.icon90 = str5;
        this.icon120 = str6;
        this.icon320 = str7;
    }

    public int describeContents() {
        return 0;
    }

    public String getIcon() {
        return this.icon;
    }

    public String getIcon120() {
        return this.icon120;
    }

    public String getIcon320() {
        return this.icon320;
    }

    public String getIcon75() {
        return this.icon75;
    }

    public String getIcon90() {
        return this.icon90;
    }

    public String getMiId() {
        return this.miId;
    }

    public String getNickName() {
        return this.nickName;
    }

    public void setIcon(String str) {
        this.icon = str;
    }

    public void setIcon120(String str) {
        this.icon120 = str;
    }

    public void setIcon320(String str) {
        this.icon320 = str;
    }

    public void setIcon75(String str) {
        this.icon75 = str;
    }

    public void setIcon90(String str) {
        this.icon90 = str;
    }

    public void setMiId(String str) {
        this.miId = str;
    }

    public void setNickName(String str) {
        this.nickName = str;
    }

    public String toString() {
        return "UserInfo{miId='" + this.miId + '\'' + ", nickName='" + this.nickName + '\'' + ", icon='" + this.icon + '\'' + ", icon75='" + this.icon75 + '\'' + ", icon90='" + this.icon90 + '\'' + ", icon120='" + this.icon120 + '\'' + ", icon320='" + this.icon320 + '\'' + '}';
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.miId);
        parcel.writeString(this.nickName);
        parcel.writeString(this.icon);
        parcel.writeString(this.icon75);
        parcel.writeString(this.icon90);
        parcel.writeString(this.icon120);
        parcel.writeString(this.icon320);
    }
}
