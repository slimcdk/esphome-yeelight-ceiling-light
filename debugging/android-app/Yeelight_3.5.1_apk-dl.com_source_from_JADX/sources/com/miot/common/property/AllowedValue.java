package com.miot.common.property;

public abstract class AllowedValue {
    protected DataType mDataType;

    public AllowedValue() {
    }

    public AllowedValue(DataType dataType) {
        this.mDataType = dataType;
    }

    public boolean isTypeValid(Object obj) {
        return this.mDataType.validate(obj);
    }

    public boolean isValid(Object obj) {
        return isTypeValid(obj) && isValueValid(obj);
    }

    public abstract boolean isValueValid(Object obj);
}
