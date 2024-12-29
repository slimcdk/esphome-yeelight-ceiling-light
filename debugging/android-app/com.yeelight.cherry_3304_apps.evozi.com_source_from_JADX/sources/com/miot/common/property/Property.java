package com.miot.common.property;

import android.os.Parcel;
import android.os.Parcelable;

public class Property implements Parcelable, Cloneable {
    public static final Parcelable.Creator<Property> CREATOR = new Parcelable.Creator<Property>() {
        public Property createFromParcel(Parcel parcel) {
            return new Property(parcel);
        }

        public Property[] newArray(int i) {
            return new Property[i];
        }
    };
    private static final String TAG = "Property";
    private PropertyDefinition mDefinition;
    private volatile PropertyValue mValue;

    public Property() {
    }

    public Property(Parcel parcel) {
        readFromParcel(parcel);
    }

    public Property(PropertyDefinition propertyDefinition) {
        this.mDefinition = propertyDefinition;
        this.mValue = new PropertyValue(propertyDefinition.getDataType());
    }

    public Property(PropertyDefinition propertyDefinition, Object obj) {
        if (obj != null) {
            this.mDefinition = propertyDefinition;
            this.mValue = new PropertyValue(obj);
            return;
        }
        throw new IllegalArgumentException("value is null");
    }

    public Object clone() {
        Property property;
        CloneNotSupportedException e;
        try {
            property = (Property) super.clone();
            try {
                property.mValue = (PropertyValue) this.mValue.clone();
            } catch (CloneNotSupportedException e2) {
                e = e2;
            }
        } catch (CloneNotSupportedException e3) {
            CloneNotSupportedException cloneNotSupportedException = e3;
            property = null;
            e = cloneNotSupportedException;
            e.printStackTrace();
            return property;
        }
        return property;
    }

    public int describeContents() {
        return 0;
    }

    public PropertyDefinition getDefinition() {
        return this.mDefinition;
    }

    public String getFriendlyName() {
        return this.mDefinition.getFriendlyName();
    }

    public String getInternalName() {
        return this.mDefinition.getInternalName();
    }

    public String getStringValue() {
        return this.mValue.getValue().toString();
    }

    public Object getValue() {
        return this.mValue.getValue();
    }

    public boolean isValueValid() {
        return this.mValue.isValid();
    }

    public void readFromParcel(Parcel parcel) {
        this.mDefinition = (PropertyDefinition) parcel.readParcelable(PropertyDefinition.class.getClassLoader());
        this.mValue = (PropertyValue) parcel.readParcelable(PropertyValue.class.getClassLoader());
    }

    public boolean setValue(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!this.mDefinition.validate(obj)) {
            this.mDefinition.getFriendlyName() + " invalid value: " + obj;
            this.mValue.setValid(false);
            return false;
        }
        this.mValue.update(obj);
        return true;
    }

    public void setValueValid(boolean z) {
        this.mValue.setValid(z);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.mDefinition, i);
        parcel.writeParcelable(this.mValue, i);
    }
}
