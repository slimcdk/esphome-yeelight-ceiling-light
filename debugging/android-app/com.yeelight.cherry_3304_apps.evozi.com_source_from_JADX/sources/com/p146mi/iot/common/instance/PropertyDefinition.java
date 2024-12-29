package com.p146mi.iot.common.instance;

import android.os.Parcel;
import android.os.Parcelable;
import com.p146mi.iot.common.constraint.AccessType;
import com.p146mi.iot.common.constraint.AllowedValue;
import com.p146mi.iot.common.constraint.AllowedValueAny;
import com.p146mi.iot.common.constraint.AllowedValueList;
import com.p146mi.iot.common.constraint.AllowedValueRange;
import com.p146mi.iot.common.constraint.UnitType;
import com.p146mi.iot.common.urn.UrnType;

/* renamed from: com.mi.iot.common.instance.PropertyDefinition */
public class PropertyDefinition implements Parcelable {
    public static final Parcelable.Creator<PropertyDefinition> CREATOR = new Parcelable.Creator<PropertyDefinition>() {
        public PropertyDefinition createFromParcel(Parcel parcel) {
            return new PropertyDefinition(parcel);
        }

        public PropertyDefinition[] newArray(int i) {
            return new PropertyDefinition[i];
        }
    };
    private static final String TAG = PropertyDefinition.class.getSimpleName();
    private AccessType mAccessType;
    private AllowedValue mAllowedValue;
    private DataFormat mDataFormat;
    private String mDescription;
    private UrnType mPropertyType;
    private UnitType mUnitType;

    public PropertyDefinition() {
        this.mUnitType = UnitType.UNDEFINED;
    }

    protected PropertyDefinition(Parcel parcel) {
        this.mUnitType = UnitType.UNDEFINED;
        this.mPropertyType = (UrnType) parcel.readParcelable(UrnType.class.getClassLoader());
        this.mDescription = parcel.readString();
        this.mAccessType = (AccessType) parcel.readParcelable(AccessType.class.getClassLoader());
        int readInt = parcel.readInt();
        UnitType unitType = null;
        this.mDataFormat = readInt == -1 ? null : DataFormat.values()[readInt];
        int readInt2 = parcel.readInt();
        this.mUnitType = readInt2 != -1 ? UnitType.values()[readInt2] : unitType;
        int readInt3 = parcel.readInt();
        this.mAllowedValue = (AllowedValue) parcel.readParcelable((readInt3 == 0 ? AllowedValueAny.class : readInt3 == 1 ? AllowedValueRange.class : AllowedValueList.class).getClassLoader());
    }

    public PropertyDefinition(UrnType urnType, AccessType accessType, DataFormat dataFormat) {
        UnitType unitType = UnitType.UNDEFINED;
        this.mUnitType = unitType;
        this.mPropertyType = urnType;
        this.mAccessType = accessType;
        this.mDataFormat = dataFormat;
        this.mUnitType = unitType;
    }

    public PropertyDefinition(UrnType urnType, AccessType accessType, DataFormat dataFormat, AllowedValue allowedValue) {
        UnitType unitType = UnitType.UNDEFINED;
        this.mUnitType = unitType;
        this.mPropertyType = urnType;
        this.mAccessType = accessType;
        this.mDataFormat = dataFormat;
        this.mAllowedValue = allowedValue;
        this.mUnitType = unitType;
    }

    public PropertyDefinition(UrnType urnType, AccessType accessType, DataFormat dataFormat, AllowedValue allowedValue, UnitType unitType) {
        this.mUnitType = UnitType.UNDEFINED;
        this.mPropertyType = urnType;
        this.mAccessType = accessType;
        this.mDataFormat = dataFormat;
        this.mUnitType = unitType;
        this.mAllowedValue = allowedValue;
    }

    public PropertyDefinition(UrnType urnType, AccessType accessType, DataFormat dataFormat, UnitType unitType) {
        this.mUnitType = UnitType.UNDEFINED;
        this.mPropertyType = urnType;
        this.mAccessType = accessType;
        this.mDataFormat = dataFormat;
        this.mUnitType = unitType;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PropertyDefinition)) {
            return false;
        }
        return getPropertyType().equals(((PropertyDefinition) obj).getPropertyType());
    }

    public AccessType getAccessType() {
        return this.mAccessType;
    }

    public AllowedValue getAllowedValue() {
        return this.mAllowedValue;
    }

    public int getAllowedValueType() {
        AllowedValue allowedValue = this.mAllowedValue;
        if (allowedValue instanceof AllowedValueAny) {
            return 0;
        }
        if (allowedValue instanceof AllowedValueList) {
            return 1;
        }
        return allowedValue instanceof AllowedValueRange ? 2 : 0;
    }

    public DataFormat getDataFormat() {
        return this.mDataFormat;
    }

    public String getDescription() {
        return this.mDescription;
    }

    public String getName() {
        return this.mPropertyType.getName();
    }

    public UrnType getPropertyType() {
        return this.mPropertyType;
    }

    public UnitType getUnitType() {
        return this.mUnitType;
    }

    public int hashCode() {
        UrnType urnType = this.mPropertyType;
        return 31 + (urnType == null ? 0 : urnType.hashCode());
    }

    public boolean isGettable() {
        return this.mAccessType.isGettable();
    }

    public boolean isNotifiable() {
        return this.mAccessType.isNotifiable();
    }

    public boolean isSettable() {
        return this.mAccessType.isSettable();
    }

    public void setAccessType(AccessType accessType) {
        this.mAccessType = accessType;
    }

    public void setAllowedValue(AllowedValue allowedValue) {
        this.mAllowedValue = allowedValue;
    }

    public void setDataFormat(DataFormat dataFormat) {
        this.mDataFormat = dataFormat;
    }

    public void setDescription(String str) {
        this.mDescription = str;
    }

    public void setGettable(boolean z) {
        this.mAccessType.setGettable(z);
    }

    public void setNotifiable(boolean z) {
        this.mAccessType.setNotifiable(z);
    }

    public void setPropertyType(UrnType urnType) {
        this.mPropertyType = urnType;
    }

    public void setSettable(boolean z) {
        this.mAccessType.setSettable(z);
    }

    public void setUnitType(UnitType unitType) {
        this.mUnitType = unitType;
    }

    public boolean validate(Object obj) {
        if (!this.mDataFormat.validate(obj)) {
            return false;
        }
        AllowedValue allowedValue = this.mAllowedValue;
        if (allowedValue != null) {
            return allowedValue.isValid(obj);
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        Parcelable parcelable;
        parcel.writeParcelable(this.mPropertyType, i);
        parcel.writeString(this.mDescription);
        parcel.writeParcelable(this.mAccessType, i);
        DataFormat dataFormat = this.mDataFormat;
        int i2 = -1;
        parcel.writeInt(dataFormat == null ? -1 : dataFormat.ordinal());
        UnitType unitType = this.mUnitType;
        if (unitType != null) {
            i2 = unitType.ordinal();
        }
        parcel.writeInt(i2);
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
