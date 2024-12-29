package com.miot.common.share;

import android.os.Parcel;
import android.os.Parcelable;
import com.miot.common.device.Device;

public class SharedRequest implements Parcelable {
    public static final Parcelable.Creator<SharedRequest> CREATOR = new Parcelable.Creator<SharedRequest>() {
        public SharedRequest createFromParcel(Parcel parcel) {
            return new SharedRequest(parcel);
        }

        public SharedRequest[] newArray(int i) {
            return new SharedRequest[i];
        }
    };
    private long mExpireTime;
    private final int mInvitedId;
    private final String mMessageId;
    private final String mSender;
    private final String mSenderName;
    private ShareStatus mShareStatus;
    private long mShareTime;
    private Device mSharedDevice;

    public SharedRequest(int i, String str, String str2, String str3) {
        this.mInvitedId = i;
        this.mMessageId = str;
        this.mSender = str2;
        this.mSenderName = str3;
    }

    protected SharedRequest(Parcel parcel) {
        this.mInvitedId = parcel.readInt();
        this.mMessageId = parcel.readString();
        this.mSender = parcel.readString();
        this.mSenderName = parcel.readString();
        int readInt = parcel.readInt();
        this.mShareStatus = readInt == -1 ? null : ShareStatus.values()[readInt];
        this.mShareTime = parcel.readLong();
        this.mExpireTime = parcel.readLong();
        this.mSharedDevice = (Device) parcel.readParcelable(Device.class.getClassLoader());
    }

    public int describeContents() {
        return 0;
    }

    public long getExpireTime() {
        return this.mExpireTime;
    }

    public int getInvitedId() {
        return this.mInvitedId;
    }

    public String getMessageId() {
        return this.mMessageId;
    }

    public String getSender() {
        return this.mSender;
    }

    public String getSenderName() {
        return this.mSenderName;
    }

    public ShareStatus getShareStatus() {
        return this.mShareStatus;
    }

    public long getShareTime() {
        return this.mShareTime;
    }

    public Device getSharedDevice() {
        return this.mSharedDevice;
    }

    public void setExpireTime(long j) {
        this.mExpireTime = j;
    }

    public void setShareStatus(ShareStatus shareStatus) {
        this.mShareStatus = shareStatus;
    }

    public void setShareTime(long j) {
        this.mShareTime = j;
    }

    public void setSharedDevice(Device device) {
        this.mSharedDevice = device;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mInvitedId);
        parcel.writeString(this.mMessageId);
        parcel.writeString(this.mSender);
        parcel.writeString(this.mSenderName);
        ShareStatus shareStatus = this.mShareStatus;
        parcel.writeInt(shareStatus == null ? -1 : shareStatus.ordinal());
        parcel.writeLong(this.mShareTime);
        parcel.writeLong(this.mExpireTime);
        parcel.writeParcelable(this.mSharedDevice, i);
    }
}
