package com.miot.common.device;

import android.os.Parcel;
import android.os.Parcelable;

public enum Location implements Parcelable {
    UNKNOWN,
    LOCAL,
    REMOTE;
    
    public static final Parcelable.Creator<Location> CREATOR = null;

    static {
        CREATOR = new Parcelable.Creator<Location>() {
            public Location createFromParcel(Parcel parcel) {
                return Location.values()[parcel.readInt()];
            }

            public Location[] newArray(int i) {
                return new Location[i];
            }
        };
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(ordinal());
    }
}
