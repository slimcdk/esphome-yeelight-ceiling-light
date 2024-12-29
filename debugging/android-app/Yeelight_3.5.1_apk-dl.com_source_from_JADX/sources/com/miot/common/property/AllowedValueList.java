package com.miot.common.property;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

public class AllowedValueList extends AllowedValue implements Parcelable {
    public static final Parcelable.Creator<AllowedValueList> CREATOR = new Parcelable.Creator<AllowedValueList>() {
        public AllowedValueList createFromParcel(Parcel parcel) {
            return new AllowedValueList(parcel);
        }

        public AllowedValueList[] newArray(int i) {
            return new AllowedValueList[i];
        }
    };
    private static final String TAG = "AllowedValueList";
    private List<Object> mAllowedValues = new ArrayList();

    private AllowedValueList() {
    }

    public AllowedValueList(Parcel parcel) {
        readFromParcel(parcel);
    }

    public AllowedValueList(DataType dataType) {
        super(dataType);
    }

    public boolean appendAllowedValue(Object obj) {
        if (!isTypeValid(obj)) {
            return false;
        }
        this.mAllowedValues.add(obj);
        return true;
    }

    public int describeContents() {
        return 0;
    }

    public List<Object> getAllowedValues() {
        return this.mAllowedValues;
    }

    public boolean isValueValid(Object obj) {
        return this.mAllowedValues.contains(obj);
    }

    public void readFromParcel(Parcel parcel) {
        this.mDataType = DataType.retrieveType(parcel.readString());
        parcel.readList(this.mAllowedValues, Object.class.getClassLoader());
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mDataType.toString());
        parcel.writeList(this.mAllowedValues);
    }
}
