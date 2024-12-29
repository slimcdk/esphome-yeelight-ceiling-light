package com.p146mi.iot.common.constraint;

import android.os.Parcel;
import android.os.Parcelable;
import com.p146mi.iot.common.instance.DataFormat;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.mi.iot.common.constraint.AllowedValueList */
public class AllowedValueList extends AllowedValue implements Parcelable {
    public static final Parcelable.Creator<AllowedValueList> CREATOR = new Parcelable.Creator<AllowedValueList>() {
        public AllowedValueList createFromParcel(Parcel parcel) {
            return new AllowedValueList(parcel);
        }

        public AllowedValueList[] newArray(int i) {
            return new AllowedValueList[i];
        }
    };
    private static final String TAG = AllowedValueList.class.getSimpleName();
    private List<DataValue> mDataValues = new ArrayList();

    /* renamed from: com.mi.iot.common.constraint.AllowedValueList$DataValue */
    public static class DataValue implements Parcelable {
        public static final Parcelable.Creator<DataValue> CREATOR = new Parcelable.Creator<DataValue>() {
            public DataValue createFromParcel(Parcel parcel) {
                return new DataValue(parcel);
            }

            public DataValue[] newArray(int i) {
                return new DataValue[i];
            }
        };
        String mDescription;
        Object mValue;

        protected DataValue(Parcel parcel) {
            this.mValue = parcel.readValue(Object.class.getClassLoader());
            this.mDescription = parcel.readString();
        }

        public DataValue(Object obj, String str) {
            this.mValue = obj;
            this.mDescription = str;
        }

        public int describeContents() {
            return 0;
        }

        public String getDescription() {
            return this.mDescription;
        }

        public Object getValue() {
            return this.mValue;
        }

        public void setDescription(String str) {
            this.mDescription = str;
        }

        public void setValue(Object obj) {
            this.mValue = obj;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeValue(this.mValue);
            parcel.writeString(this.mDescription);
        }
    }

    private AllowedValueList() {
    }

    public AllowedValueList(Parcel parcel) {
        readFromParcel(parcel);
    }

    public AllowedValueList(DataFormat dataFormat) {
        super(dataFormat);
    }

    public boolean appendAllowedValue(DataValue dataValue) {
        if (!isTypeValid(dataValue.getValue())) {
            return false;
        }
        this.mDataValues.add(dataValue);
        return true;
    }

    public int describeContents() {
        return 0;
    }

    public List<DataValue> getDataValues() {
        return this.mDataValues;
    }

    public boolean isValueValid(Object obj) {
        for (DataValue value : this.mDataValues) {
            if (value.getValue() == obj) {
                return true;
            }
        }
        return false;
    }

    public void readFromParcel(Parcel parcel) {
        this.mDataFormat = DataFormat.retrieveType(parcel.readString());
        parcel.readList(this.mDataValues, DataValue.class.getClassLoader());
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mDataFormat.toString());
        parcel.writeList(this.mDataValues);
    }
}
