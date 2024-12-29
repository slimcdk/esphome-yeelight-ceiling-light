package com.miot.common.field;

import android.os.Parcel;
import android.os.Parcelable;
import com.miot.common.property.DataType;
import java.io.Serializable;

public class FieldDefinition implements Parcelable, Serializable {
    public static final Parcelable.Creator<FieldDefinition> CREATOR = new Parcelable.Creator<FieldDefinition>() {
        public FieldDefinition createFromParcel(Parcel parcel) {
            return new FieldDefinition(parcel);
        }

        public FieldDefinition[] newArray(int i) {
            return new FieldDefinition[i];
        }
    };
    private DataType dataType;
    private String name;

    private FieldDefinition() {
    }

    public FieldDefinition(Parcel parcel) {
        readFromParcel(parcel);
    }

    public FieldDefinition(String str, DataType dataType2) {
        this.name = str;
        this.dataType = dataType2;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || FieldDefinition.class != obj.getClass()) {
            return false;
        }
        String str = this.name;
        String str2 = ((FieldDefinition) obj).name;
        if (str == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str.equals(str2)) {
            return false;
        }
        return true;
    }

    public DataType getDataType() {
        return this.dataType;
    }

    public String getName() {
        return this.name;
    }

    public int hashCode() {
        String str = this.name;
        return 31 + (str == null ? 0 : str.hashCode());
    }

    public void readFromParcel(Parcel parcel) {
        this.name = parcel.readString();
        this.dataType = DataType.valueOf(parcel.readString());
    }

    public void setDataType(DataType dataType2) {
        this.dataType = dataType2;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        parcel.writeString(this.dataType.toString());
    }
}
