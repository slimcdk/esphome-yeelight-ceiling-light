package com.miot.common.field;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

public class Field implements Parcelable, Serializable {
    public static final Parcelable.Creator<Field> CREATOR = new Parcelable.Creator<Field>() {
        public Field createFromParcel(Parcel parcel) {
            return new Field(parcel);
        }

        public Field[] newArray(int i) {
            return new Field[i];
        }
    };
    private FieldDefinition definition;
    private Object value;

    public Field(Parcel parcel) {
        readFromParcel(parcel);
    }

    public Field(FieldDefinition fieldDefinition, Object obj) {
        init(fieldDefinition, obj);
    }

    private void init(FieldDefinition fieldDefinition, Object obj) {
        if (obj == null) {
            obj = fieldDefinition.getDataType().createObjectValue();
        }
        this.definition = fieldDefinition;
        this.value = obj;
    }

    public int describeContents() {
        return 0;
    }

    public FieldDefinition getDefinition() {
        return this.definition;
    }

    public Object getValue() {
        return this.value;
    }

    public void readFromParcel(Parcel parcel) {
        this.definition = (FieldDefinition) parcel.readParcelable(FieldDefinition.class.getClassLoader());
        this.value = parcel.readValue(Object.class.getClassLoader());
    }

    public void setDefinition(FieldDefinition fieldDefinition) {
        this.definition = fieldDefinition;
        this.value = fieldDefinition.getDataType().createObjectValue();
    }

    public boolean setValue(Object obj) {
        this.value = obj;
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.definition, i);
        parcel.writeValue(this.value);
    }
}
