package com.p146mi.iot.common.instance;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.mi.iot.common.instance.Property */
public class Property implements Parcelable {
    public static final Parcelable.Creator<Property> CREATOR = new Parcelable.Creator<Property>() {
        public Property createFromParcel(Parcel parcel) {
            return new Property(parcel);
        }

        public Property[] newArray(int i) {
            return new Property[i];
        }
    };
    private static final String TAG = Property.class.getSimpleName();
    private PropertyDefinition mDefinition;
    private int mInstanceID;
    private int mOpStatus;
    private String mPid;
    private volatile PropertyValue mPropertyValue;
    private boolean mSubscribed;
    private int mWriteStatus = -1;

    public Property() {
    }

    protected Property(Parcel parcel) {
        this.mPid = parcel.readString();
        this.mInstanceID = parcel.readInt();
        this.mDefinition = (PropertyDefinition) parcel.readParcelable(PropertyDefinition.class.getClassLoader());
        this.mPropertyValue = (PropertyValue) parcel.readParcelable(PropertyValue.class.getClassLoader());
        this.mSubscribed = parcel.readByte() != 0;
        this.mOpStatus = parcel.readInt();
        this.mWriteStatus = parcel.readInt();
    }

    public Property(Property property) {
        this.mPid = property.getPid();
        this.mInstanceID = property.getInstanceID();
        this.mDefinition = property.getDefinition();
        this.mPropertyValue = property.getPropertyValue();
    }

    public Property(PropertyDefinition propertyDefinition) {
        this.mDefinition = propertyDefinition;
        this.mPropertyValue = new PropertyValue(propertyDefinition.getDataFormat());
    }

    public int describeContents() {
        return 0;
    }

    public PropertyDefinition getDefinition() {
        return this.mDefinition;
    }

    public int getInstanceID() {
        return this.mInstanceID;
    }

    public int getOpStatus() {
        return this.mOpStatus;
    }

    public String getPid() {
        return this.mPid;
    }

    public PropertyValue getPropertyValue() {
        return this.mPropertyValue;
    }

    public Object getValue() {
        return this.mPropertyValue.getValue();
    }

    public String getWriteErrorDesc() {
        return "status:" + this.mWriteStatus + ",error:" + null;
    }

    public boolean isSubscribed() {
        return this.mSubscribed;
    }

    public boolean isValueValid() {
        return this.mPropertyValue.isValid();
    }

    public void setInstanceID(int i) {
        this.mInstanceID = i;
    }

    public void setOpStatus(int i) {
        this.mOpStatus = i;
    }

    public void setPid(String str) {
        this.mPid = str;
    }

    public void setSubscribed(boolean z) {
        this.mSubscribed = z;
    }

    public boolean setValue(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!this.mDefinition.validate(obj)) {
            this.mDefinition.getName() + this.mDefinition.getDataFormat() + " invalid value: " + obj;
            this.mPropertyValue.setValid(false);
            return false;
        }
        this.mPropertyValue.update(obj);
        return true;
    }

    public void setValueValid(boolean z) {
        this.mPropertyValue.setValid(z);
    }

    public void setWriteStatus(int i) {
        this.mWriteStatus = i;
    }

    public boolean writeSuccess() {
        return this.mWriteStatus == 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mPid);
        parcel.writeInt(this.mInstanceID);
        parcel.writeParcelable(this.mDefinition, i);
        parcel.writeParcelable(this.mPropertyValue, i);
        parcel.writeByte(this.mSubscribed ? (byte) 1 : 0);
        parcel.writeInt(this.mOpStatus);
        parcel.writeInt(this.mWriteStatus);
    }
}
