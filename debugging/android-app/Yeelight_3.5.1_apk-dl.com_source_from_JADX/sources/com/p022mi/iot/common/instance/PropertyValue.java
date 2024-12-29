package com.p022mi.iot.common.instance;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* renamed from: com.mi.iot.common.instance.PropertyValue */
public class PropertyValue implements Parcelable {
    public static final Parcelable.Creator<PropertyValue> CREATOR = new Parcelable.Creator<PropertyValue>() {
        public PropertyValue createFromParcel(Parcel parcel) {
            return new PropertyValue(parcel);
        }

        public PropertyValue[] newArray(int i) {
            return new PropertyValue[i];
        }
    };
    private static final String TAG = "PropertyValue";
    private volatile Object mCurrentValue;
    private boolean mIsValid = true;
    private volatile Object mOldValue;

    protected PropertyValue(Parcel parcel) {
        Class<Object> cls = Object.class;
        boolean z = true;
        this.mIsValid = parcel.readByte() == 0 ? false : z;
        this.mOldValue = parcel.readValue(cls.getClassLoader());
        this.mCurrentValue = parcel.readValue(cls.getClassLoader());
    }

    public PropertyValue(DataFormat dataFormat) {
        init(dataFormat.createObjectValue());
    }

    public PropertyValue(Object obj) {
        init(obj);
    }

    /* access modifiers changed from: protected */
    public Object clone() {
        return new PropertyValue(getValue());
    }

    public int describeContents() {
        return 0;
    }

    public Object getValue() {
        return this.mCurrentValue != null ? this.mCurrentValue : this.mOldValue;
    }

    public void init(Object obj) {
        this.mOldValue = obj;
    }

    public boolean isValid() {
        return this.mIsValid;
    }

    public void setValid(boolean z) {
        this.mIsValid = z;
    }

    public void update(Object obj) {
        Objects.requireNonNull(obj, "value is null");
        if (this.mCurrentValue != null) {
            this.mOldValue = this.mCurrentValue;
        }
        this.mCurrentValue = obj;
        this.mIsValid = true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.mIsValid ? (byte) 1 : 0);
        parcel.writeValue(this.mOldValue);
        parcel.writeValue(this.mCurrentValue);
    }
}
