package com.p022mi.iot.common.constraint;

import com.p022mi.iot.common.instance.DataFormat;

/* renamed from: com.mi.iot.common.constraint.AllowedValue */
public abstract class AllowedValue {
    protected DataFormat mDataFormat;

    public AllowedValue() {
    }

    public AllowedValue(DataFormat dataFormat) {
        this.mDataFormat = dataFormat;
    }

    public boolean isTypeValid(Object obj) {
        return this.mDataFormat.validate(obj);
    }

    public boolean isValid(Object obj) {
        return isTypeValid(obj) && isValueValid(obj);
    }

    public abstract boolean isValueValid(Object obj);
}
