package com.p146mi.iot.common.instance;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.mi.iot.common.instance.DiscoveryType */
public enum DiscoveryType implements Parcelable {
    UNDEFINED("undefined"),
    IOT_OVER_CLOUD("IOT_OVER_CLOUD");
    
    public static final Parcelable.Creator<DiscoveryType> CREATOR = null;
    private String mValue;

    static {
        CREATOR = new Parcelable.Creator<DiscoveryType>() {
            public DiscoveryType createFromParcel(Parcel parcel) {
                return DiscoveryType.readFromParcel(parcel);
            }

            public DiscoveryType[] newArray(int i) {
                return new DiscoveryType[i];
            }
        };
    }

    private DiscoveryType(String str) {
        this.mValue = str;
    }

    public static DiscoveryType readFromParcel(Parcel parcel) {
        return retrieveType(parcel.readString());
    }

    public static DiscoveryType retrieveType(String str) {
        for (DiscoveryType discoveryType : values()) {
            if (discoveryType.toString().equals(str)) {
                return discoveryType;
            }
        }
        return UNDEFINED;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.mValue;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mValue);
    }
}
