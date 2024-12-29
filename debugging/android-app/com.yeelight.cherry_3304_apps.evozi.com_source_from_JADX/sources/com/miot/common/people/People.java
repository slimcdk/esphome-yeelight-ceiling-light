package com.miot.common.people;

import android.os.Parcel;
import android.os.Parcelable;

public class People implements Parcelable {
    public static final Parcelable.Creator<People> CREATOR = new Parcelable.Creator<People>() {
        public People createFromParcel(Parcel parcel) {
            return new People(parcel);
        }

        public People[] newArray(int i) {
            return new People[i];
        }
    };
    private final String mAccessToken;
    private Account mAccount;
    private Long mExpiresIn;
    private boolean mIsOauth;
    private String mMacAlgorithm;
    private String mMacKey;
    private String mRefreshToken;
    private String mServiceSecurity;
    private Long mTimeDiff;

    protected People(Parcel parcel) {
        Class<Long> cls = Long.class;
        this.mAccount = (Account) parcel.readParcelable(Account.class.getClassLoader());
        this.mIsOauth = parcel.readByte() != 0;
        this.mAccessToken = parcel.readString();
        this.mTimeDiff = (Long) parcel.readValue(cls.getClassLoader());
        this.mServiceSecurity = parcel.readString();
        this.mExpiresIn = (Long) parcel.readValue(cls.getClassLoader());
        this.mMacKey = parcel.readString();
        this.mMacAlgorithm = parcel.readString();
        this.mRefreshToken = parcel.readString();
    }

    public People(String str, String str2) {
        this.mAccessToken = str;
        this.mAccount = new Account(str2);
    }

    public int describeContents() {
        return 0;
    }

    public String getAccessToken() {
        return this.mAccessToken;
    }

    public Account getAccount() {
        return this.mAccount;
    }

    public Long getExpiresIn() {
        return this.mExpiresIn;
    }

    public String getIcon() {
        return this.mAccount.getIcon();
    }

    public String getIcon120() {
        return this.mAccount.getIcon120();
    }

    public String getIcon320() {
        return this.mAccount.getIcon320();
    }

    public String getIcon75() {
        return this.mAccount.getIcon75();
    }

    public String getIcon90() {
        return this.mAccount.getIcon90();
    }

    public String getMacAlgorithm() {
        return this.mMacAlgorithm;
    }

    public String getMacKey() {
        return this.mMacKey;
    }

    public String getRefreshToken() {
        return this.mRefreshToken;
    }

    public String getServiceSecurity() {
        return this.mServiceSecurity;
    }

    public Long getTimeDiff() {
        return this.mTimeDiff;
    }

    public String getUserId() {
        return this.mAccount.getUserId();
    }

    public String getUserName() {
        return this.mAccount.getUserName();
    }

    public boolean isOauth() {
        return this.mIsOauth;
    }

    public void setExpiresIn(Long l) {
        this.mExpiresIn = l;
    }

    public void setIcon(String str) {
        this.mAccount.setIcon(str);
    }

    public void setIcon120(String str) {
        this.mAccount.setIcon120(str);
    }

    public void setIcon320(String str) {
        this.mAccount.setIcon320(str);
    }

    public void setIcon75(String str) {
        this.mAccount.setIcon75(str);
    }

    public void setIcon90(String str) {
        this.mAccount.setIcon90(str);
    }

    public void setMacAlgorithm(String str) {
        this.mMacAlgorithm = str;
    }

    public void setMacKey(String str) {
        this.mMacKey = str;
    }

    public void setOauth(boolean z) {
        this.mIsOauth = z;
    }

    public void setRefreshToken(String str) {
        this.mRefreshToken = str;
    }

    public void setServiceSecurity(String str) {
        this.mServiceSecurity = str;
    }

    public void setTimeDiff(Long l) {
        this.mTimeDiff = l;
    }

    public void setUserName(String str) {
        this.mAccount.setUserName(str);
    }

    public String toString() {
        return "userId: " + getUserId() + "  token: " + getAccessToken() + "  refreshToken: " + getRefreshToken() + "  timeDiff: " + getTimeDiff();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.mAccount, i);
        parcel.writeByte(this.mIsOauth ? (byte) 1 : 0);
        parcel.writeString(this.mAccessToken);
        parcel.writeValue(this.mTimeDiff);
        parcel.writeString(this.mServiceSecurity);
        parcel.writeValue(this.mExpiresIn);
        parcel.writeString(this.mMacKey);
        parcel.writeString(this.mMacAlgorithm);
        parcel.writeString(this.mRefreshToken);
    }
}
