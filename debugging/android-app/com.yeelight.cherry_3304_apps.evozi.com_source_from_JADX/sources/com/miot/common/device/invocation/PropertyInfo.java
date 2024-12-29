package com.miot.common.device.invocation;

import android.os.Parcel;
import android.os.Parcelable;
import com.miot.common.property.Property;
import java.util.ArrayList;
import java.util.List;

public class PropertyInfo implements Parcelable {
    public static final Parcelable.Creator<PropertyInfo> CREATOR = new Parcelable.Creator<PropertyInfo>() {
        public PropertyInfo createFromParcel(Parcel parcel) {
            return new PropertyInfo(parcel);
        }

        public PropertyInfo[] newArray(int i) {
            return new PropertyInfo[i];
        }
    };
    private InvokeInfo mInvokeInfo = new InvokeInfo();
    private List<Property> mProperties = new ArrayList();
    private String mPropertyMethod;
    private String mServiceType;

    public PropertyInfo() {
    }

    protected PropertyInfo(Parcel parcel) {
        this.mInvokeInfo = (InvokeInfo) parcel.readParcelable(InvokeInfo.class.getClassLoader());
        this.mServiceType = parcel.readString();
        this.mPropertyMethod = parcel.readString();
        this.mProperties = parcel.createTypedArrayList(Property.CREATOR);
    }

    public void addProperty(Property property) {
        this.mProperties.add(property);
    }

    public int describeContents() {
        return 0;
    }

    public String getDeviceId() {
        return this.mInvokeInfo.getDeviceId();
    }

    public InvokeInfo getInvokeInfo() {
        return this.mInvokeInfo;
    }

    public List<Property> getProperties() {
        return this.mProperties;
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x000c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.miot.common.property.Property getProperty(java.lang.String r4) {
        /*
            r3 = this;
            java.util.List<com.miot.common.property.Property> r0 = r3.mProperties
            java.util.Iterator r0 = r0.iterator()
        L_0x0006:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x002f
            java.lang.Object r1 = r0.next()
            com.miot.common.property.Property r1 = (com.miot.common.property.Property) r1
            com.miot.common.property.PropertyDefinition r2 = r1.getDefinition()
            java.lang.String r2 = r2.getFriendlyName()
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x0030
            com.miot.common.property.PropertyDefinition r2 = r1.getDefinition()
            java.lang.String r2 = r2.getInternalName()
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x0006
            goto L_0x0030
        L_0x002f:
            r1 = 0
        L_0x0030:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.miot.common.device.invocation.PropertyInfo.getProperty(java.lang.String):com.miot.common.property.Property");
    }

    public String getPropertyMethod() {
        return this.mPropertyMethod;
    }

    public String getServiceType() {
        return this.mServiceType;
    }

    public Object getValue(String str) {
        Property property = getProperty(str);
        if (property == null || !property.isValueValid()) {
            return null;
        }
        return property.getValue();
    }

    public void setInvokeInfo(InvokeInfo invokeInfo) {
        this.mInvokeInfo = invokeInfo;
    }

    public void setPropertyMethod(String str) {
        this.mPropertyMethod = str;
    }

    public void setServiceType(String str) {
        this.mServiceType = str;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.mInvokeInfo, i);
        parcel.writeString(this.mServiceType);
        parcel.writeString(this.mPropertyMethod);
        parcel.writeTypedList(this.mProperties);
    }
}
