package com.p146mi.iot.common.constraint;

import android.os.Parcel;
import android.os.Parcelable;
import com.p146mi.iot.common.instance.DataFormat;

/* renamed from: com.mi.iot.common.constraint.AllowedValueAny */
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
        this.mDataFormat = DataFormat.retrieveType(parcel.readString());
    }

    public AllowedValueAny(DataFormat dataFormat) {
        super(dataFormat);
    }

    public int describeContents() {
        return 0;
    }

    public boolean isValueValid(Object obj) {
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mDataFormat.toString());
    }
}
