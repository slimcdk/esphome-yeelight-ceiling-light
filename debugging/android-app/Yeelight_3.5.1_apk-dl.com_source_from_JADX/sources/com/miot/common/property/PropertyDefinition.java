package com.miot.common.property;

import android.os.Parcel;
import android.os.Parcelable;
import com.miot.common.device.urn.UrnType;

public class PropertyDefinition implements Parcelable {
    public static final Parcelable.Creator<PropertyDefinition> CREATOR = new Parcelable.Creator<PropertyDefinition>() {
        public PropertyDefinition createFromParcel(Parcel parcel) {
            return new PropertyDefinition(parcel);
        }

        public PropertyDefinition[] newArray(int i) {
            return new PropertyDefinition[i];
        }
    };
    private AllowedValue mAllowedValue;
    private DataType mDataType;
    private String mDescription;
    private String mFriendlyName;
    private boolean mGettable;
    private String mInternalName;
    private boolean mNotifiable;
    private String mServiceType;
    private boolean mSettable;
    private UrnType mType;

    public PropertyDefinition() {
    }

    protected PropertyDefinition(Parcel parcel) {
        boolean z = false;
        this.mGettable = parcel.readByte() != 0;
        this.mNotifiable = parcel.readByte() != 0 ? true : z;
        this.mServiceType = parcel.readString();
        this.mFriendlyName = parcel.readString();
        this.mInternalName = parcel.readString();
        this.mDescription = parcel.readString();
        this.mDataType = DataType.retrieveType(parcel.readString());
        int readInt = parcel.readInt();
        this.mAllowedValue = (AllowedValue) parcel.readParcelable((readInt == 0 ? AllowedValueAny.class : readInt == 1 ? AllowedValueRange.class : AllowedValueList.class).getClassLoader());
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        String str = this.mFriendlyName;
        String str2 = ((PropertyDefinition) obj).mFriendlyName;
        if (str == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str.equals(str2)) {
            return false;
        }
        return true;
    }

    public AllowedValue getAllowedValue() {
        return this.mAllowedValue;
    }

    public int getAllowedValueType() {
        AllowedValue allowedValue = this.mAllowedValue;
        if (allowedValue instanceof AllowedValueAny) {
            return 0;
        }
        return allowedValue instanceof AllowedValueList ? 1 : 2;
    }

    public DataType getDataType() {
        return this.mDataType;
    }

    public String getDescription() {
        return this.mDescription;
    }

    public String getFriendlyName() {
        return this.mFriendlyName;
    }

    public boolean getGettable() {
        return this.mGettable;
    }

    public String getInternalName() {
        return this.mInternalName;
    }

    public String getName() {
        return this.mFriendlyName;
    }

    public boolean getNotifiable() {
        return this.mNotifiable;
    }

    public String getServiceType() {
        return this.mServiceType;
    }

    public boolean getSettable() {
        return this.mSettable;
    }

    public UrnType getType() {
        return this.mType;
    }

    public int hashCode() {
        String str = this.mFriendlyName;
        return 31 + (str == null ? 0 : str.hashCode());
    }

    public boolean isGettable() {
        return this.mGettable;
    }

    public boolean isNotifiable() {
        return this.mNotifiable;
    }

    public void setAllowedValue(AllowedValue allowedValue) {
        this.mAllowedValue = allowedValue;
    }

    public void setDataType(DataType dataType) {
        this.mDataType = dataType;
    }

    public void setDescription(String str) {
        this.mDescription = str;
    }

    public void setFriendlyName(String str) {
        this.mFriendlyName = str;
    }

    public void setGettable(boolean z) {
        this.mGettable = z;
    }

    public void setInternalName(String str) {
        this.mInternalName = str;
    }

    public void setName(String str) {
        this.mFriendlyName = str;
    }

    public void setNotifiable(boolean z) {
        this.mNotifiable = z;
    }

    public void setServiceType(String str) {
        this.mServiceType = str;
    }

    public void setSettable(boolean z) {
        this.mSettable = z;
    }

    public void setType(UrnType urnType) {
        this.mType = urnType;
    }

    public boolean validate(Object obj) {
        return this.mAllowedValue.isValid(obj);
    }

    public void writeToParcel(Parcel parcel, int i) {
        Parcelable parcelable;
        parcel.writeByte(this.mGettable ? (byte) 1 : 0);
        parcel.writeByte(this.mNotifiable ? (byte) 1 : 0);
        parcel.writeString(this.mServiceType);
        parcel.writeString(this.mFriendlyName);
        parcel.writeString(this.mInternalName);
        parcel.writeString(this.mDescription);
        parcel.writeString(this.mDataType.toString());
        AllowedValue allowedValue = this.mAllowedValue;
        if (allowedValue instanceof AllowedValueAny) {
            parcel.writeInt(0);
            parcelable = (AllowedValueAny) this.mAllowedValue;
        } else if (allowedValue instanceof AllowedValueList) {
            parcel.writeInt(1);
            parcelable = (AllowedValueList) this.mAllowedValue;
        } else {
            parcel.writeInt(2);
            parcelable = (AllowedValueRange) this.mAllowedValue;
        }
        parcel.writeParcelable(parcelable, i);
    }
}
