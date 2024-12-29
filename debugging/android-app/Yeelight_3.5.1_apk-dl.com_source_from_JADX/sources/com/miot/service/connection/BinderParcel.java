package com.miot.service.connection;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

public class BinderParcel implements Parcelable {
    public static final Parcelable.Creator<BinderParcel> CREATOR = new Parcelable.Creator<BinderParcel>() {
        public BinderParcel createFromParcel(Parcel parcel) {
            return new BinderParcel(parcel);
        }

        public BinderParcel[] newArray(int i) {
            return new BinderParcel[i];
        }
    };
    private IBinder binder = null;

    public BinderParcel(IBinder iBinder) {
        this.binder = iBinder;
    }

    public BinderParcel(Parcel parcel) {
        readFromParcel(parcel);
    }

    public int describeContents() {
        return 0;
    }

    public IBinder getBinder() {
        return this.binder;
    }

    public void readFromParcel(Parcel parcel) {
        this.binder = parcel.readStrongBinder();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStrongBinder(this.binder);
    }
}
