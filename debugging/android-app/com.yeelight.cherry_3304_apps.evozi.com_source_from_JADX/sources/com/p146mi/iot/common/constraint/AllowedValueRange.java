package com.p146mi.iot.common.constraint;

import android.os.Parcel;
import android.os.Parcelable;
import com.p146mi.iot.common.instance.DataFormat;

/* renamed from: com.mi.iot.common.constraint.AllowedValueRange */
public class AllowedValueRange extends AllowedValue implements Parcelable {
    public static final Parcelable.Creator<AllowedValueRange> CREATOR = new Parcelable.Creator<AllowedValueRange>() {
        public AllowedValueRange createFromParcel(Parcel parcel) {
            return new AllowedValueRange(parcel);
        }

        public AllowedValueRange[] newArray(int i) {
            return new AllowedValueRange[i];
        }
    };
    private static final String TAG = AllowedValueRange.class.getSimpleName();
    private Number mMaxValue;
    private Number mMinValue;
    private Number mStep;

    private AllowedValueRange() {
    }

    public AllowedValueRange(Parcel parcel) {
        readFromParcel(parcel);
    }

    public AllowedValueRange(DataFormat dataFormat, Number number, Number number2) {
        super(dataFormat);
        if (Double.compare(number2.doubleValue(), number.doubleValue()) >= 0) {
            this.mMinValue = number;
            this.mMaxValue = number2;
            return;
        }
        throw new IllegalArgumentException("min >= max");
    }

    public AllowedValueRange(DataFormat dataFormat, Number number, Number number2, Number number3) {
        this(dataFormat, number, number2);
        this.mStep = number3;
    }

    public int describeContents() {
        return 0;
    }

    public Object getMaxValue() {
        return this.mMaxValue;
    }

    public Object getMinValue() {
        return this.mMinValue;
    }

    public boolean isValueValid(Object obj) {
        Number number = (Number) obj;
        return Double.compare(number.doubleValue(), this.mMinValue.doubleValue()) >= 0 && Double.compare(this.mMaxValue.doubleValue(), number.doubleValue()) >= 0;
    }

    public void readFromParcel(Parcel parcel) {
        this.mDataFormat = DataFormat.retrieveType(parcel.readString());
        this.mMaxValue = (Number) parcel.readValue(Number.class.getClassLoader());
        this.mMinValue = (Number) parcel.readValue(Number.class.getClassLoader());
        this.mStep = (Number) parcel.readValue(Number.class.getClassLoader());
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mDataFormat.toString());
        parcel.writeValue(this.mMaxValue);
        parcel.writeValue(this.mMinValue);
        parcel.writeValue(this.mStep);
    }
}
