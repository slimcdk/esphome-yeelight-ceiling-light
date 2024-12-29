package com.miot.common.field;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class FieldList implements Parcelable, Serializable {
    public static final Parcelable.Creator<FieldList> CREATOR = new Parcelable.Creator<FieldList>() {
        public FieldList createFromParcel(Parcel parcel) {
            return new FieldList(parcel);
        }

        public FieldList[] newArray(int i) {
            return new FieldList[i];
        }
    };
    private Map<String, Field> mFields = new HashMap();

    public FieldList() {
    }

    public FieldList(Parcel parcel) {
        readFromParcel(parcel);
    }

    private Field getField(FieldDefinition fieldDefinition) {
        return this.mFields.get(fieldDefinition.getName());
    }

    private Field getField(String str) {
        return this.mFields.get(str);
    }

    private FieldDefinition getFieldDefinition(String str) {
        Field field = getField(str);
        if (field == null) {
            return null;
        }
        return field.getDefinition();
    }

    public int describeContents() {
        return 0;
    }

    public Object getValue(FieldDefinition fieldDefinition) {
        Field field = getField(fieldDefinition);
        if (field == null) {
            return null;
        }
        return field.getValue();
    }

    public Object getValue(String str) {
        Field field = getField(str);
        if (field == null) {
            return null;
        }
        return field.getValue();
    }

    public void initField(Field field) {
        this.mFields.put(field.getDefinition().getName(), field);
    }

    public void initField(FieldDefinition fieldDefinition, Object obj) {
        this.mFields.put(fieldDefinition.getName(), new Field(fieldDefinition, obj));
    }

    public void readFromParcel(Parcel parcel) {
        int readInt = parcel.readInt();
        for (int i = 0; i < readInt; i++) {
            Field field = (Field) parcel.readParcelable(Field.class.getClassLoader());
            this.mFields.put(field.getDefinition().getName(), field);
        }
    }

    public boolean setValue(FieldDefinition fieldDefinition, Object obj) {
        Field field = getField(fieldDefinition);
        if (field == null) {
            return false;
        }
        field.setValue(obj);
        return true;
    }

    public boolean setValue(String str, Object obj) {
        Field field = getField(str);
        if (field == null) {
            return false;
        }
        field.setValue(obj);
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mFields.size());
        for (Field writeParcelable : this.mFields.values()) {
            parcel.writeParcelable(writeParcelable, i);
        }
    }
}
