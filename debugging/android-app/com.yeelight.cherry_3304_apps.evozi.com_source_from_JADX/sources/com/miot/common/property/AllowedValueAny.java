package com.miot.common.property;

import android.os.Parcel;
import android.os.Parcelable;

public class AllowedValueAny extends AllowedValue implements Parcelable {
    public static final Parcelable.Creator<AllowedValueAny> CREATOR = new Parcelable.Creator<AllowedValueAny>() {
        public AllowedValueAny createFromParcel(Parcel parcel) {
            return new AllowedValueAny(parcel);
        }

        public AllowedValueAny[] newArray(int i) {
            return new AllowedValueAny[i];
        }
    };

    protected AllowedValueAny(Parcel parcel) {
        this.mDataType = DataType.retrieveType(parcel.readString());
    }

    public AllowedValueAny(DataType dataType) {
        super(dataType);
    }

    public int describeContents() {
        return 0;
    }

    public boolean isValueValid(Object obj) {
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mDataType.toString());
    }
}
