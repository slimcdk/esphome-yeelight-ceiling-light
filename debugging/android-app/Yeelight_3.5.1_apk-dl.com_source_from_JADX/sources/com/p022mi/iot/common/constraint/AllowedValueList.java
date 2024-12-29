package com.p022mi.iot.common.constraint;

import android.os.Parcel;
import android.os.Parcelable;
import com.p022mi.iot.common.instance.DataFormat;
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

    /* JADX WARNING: Removed duplicated region for block: B:3:0x000d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isValueValid(java.lang.Object r9) {
        /*
            r8 = this;
            java.util.List<com.mi.iot.common.constraint.AllowedValueList$DataValue> r0 = r8.mDataValues
            java.util.Iterator r0 = r0.iterator()
        L_0x0006:
            boolean r1 = r0.hasNext()
            r2 = 1
            if (r1 == 0) goto L_0x0034
            java.lang.Object r1 = r0.next()
            com.mi.iot.common.constraint.AllowedValueList$DataValue r1 = (com.p022mi.iot.common.constraint.AllowedValueList.DataValue) r1
            boolean r3 = r9 instanceof java.lang.Number
            if (r3 == 0) goto L_0x002d
            java.lang.Object r3 = r1.getValue()
            java.lang.Number r3 = (java.lang.Number) r3
            double r3 = r3.doubleValue()
            r5 = r9
            java.lang.Number r5 = (java.lang.Number) r5
            double r5 = r5.doubleValue()
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x002d
            goto L_0x0035
        L_0x002d:
            java.lang.Object r1 = r1.getValue()
            if (r1 != r9) goto L_0x0006
            goto L_0x0035
        L_0x0034:
            r2 = 0
        L_0x0035:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p022mi.iot.common.constraint.AllowedValueList.isValueValid(java.lang.Object):boolean");
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
