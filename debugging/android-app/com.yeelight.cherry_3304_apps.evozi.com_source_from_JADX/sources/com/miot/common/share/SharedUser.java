package com.miot.common.share;

import android.os.Parcel;
import android.os.Parcelable;
import com.miot.common.people.Account;

public class SharedUser implements Parcelable {
    public static final Parcelable.Creator<SharedUser> CREATOR = new Parcelable.Creator<SharedUser>() {
        public SharedUser createFromParcel(Parcel parcel) {
            return new SharedUser(parcel);
        }

        public SharedUser[] newArray(int i) {
            return new SharedUser[i];
        }
    };
    private Account mAccount;
    private long mShareTime;
    private ShareStatus mStatus;

    public SharedUser() {
    }

    protected SharedUser(Parcel parcel) {
        this.mAccount = (Account) parcel.readParcelable(Account.class.getClassLoader());
        int readInt = parcel.readInt();
        this.mStatus = readInt == -1 ? null : ShareStatus.values()[readInt];
        this.mShareTime = parcel.readLong();
    }

    public int describeContents() {
        return 0;
    }

    public String getIcon() {
        return this.mAccount.getIcon();
    }

    public long getShareTime() {
        return this.mShareTime;
    }

    public ShareStatus getStatus() {
        return this.mStatus;
    }

    public String getUserId() {
        return this.mAccount.getUserId();
    }

    public String getUserName() {
        return this.mAccount.getUserName();
    }

    public void setAccount(Account account) {
        this.mAccount = account;
    }

    public void setShareTime(long j) {
        this.mShareTime = j;
    }

    public void setStatus(ShareStatus shareStatus) {
        this.mStatus = shareStatus;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.mAccount, i);
        ShareStatus shareStatus = this.mStatus;
        parcel.writeInt(shareStatus == null ? -1 : shareStatus.ordinal());
        parcel.writeLong(this.mShareTime);
    }
}
