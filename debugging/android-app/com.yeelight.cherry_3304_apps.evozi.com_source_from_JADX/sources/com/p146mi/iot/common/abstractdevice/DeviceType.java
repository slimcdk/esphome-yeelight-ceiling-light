package com.p146mi.iot.common.abstractdevice;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.p146mi.iot.common.urn.UrnType;
import com.xiaomi.mipush.sdk.Constants;

/* renamed from: com.mi.iot.common.abstractdevice.DeviceType */
public class DeviceType implements Parcelable {
    public static final Parcelable.Creator<DeviceType> CREATOR = new Parcelable.Creator<DeviceType>() {
        public DeviceType createFromParcel(Parcel parcel) {
            return new DeviceType(parcel);
        }

        public DeviceType[] newArray(int i) {
            return new DeviceType[i];
        }
    };
    private Class<? extends AbstractDevice> mClazz;
    private UrnType mDeviceType;
    private String mModel;

    protected DeviceType(Parcel parcel) {
        this.mDeviceType = (UrnType) parcel.readParcelable(UrnType.class.getClassLoader());
        this.mClazz = (Class) parcel.readSerializable();
        this.mModel = parcel.readString();
    }

    @Deprecated
    public DeviceType(UrnType urnType, Class<? extends AbstractDevice> cls) {
        this.mDeviceType = urnType;
        this.mClazz = cls;
    }

    public DeviceType(UrnType urnType, Class<? extends AbstractDevice> cls, String str) {
        this.mDeviceType = urnType;
        this.mClazz = cls;
        this.mModel = str;
    }

    public int describeContents() {
        return 0;
    }

    public Class<? extends AbstractDevice> getClazz() {
        return this.mClazz;
    }

    public String getModel() {
        String str = this.mModel;
        if (str != null) {
            return str;
        }
        UrnType urnType = this.mDeviceType;
        if (urnType == null) {
            return "";
        }
        String name = urnType.getName();
        String vendor = this.mDeviceType.getVendor();
        if (!TextUtils.isEmpty(name) && !TextUtils.isEmpty(vendor) && vendor.contains(Constants.ACCEPT_TIME_SEPARATOR_SERVER)) {
            try {
                String[] split = vendor.split(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
                return split[0] + "." + name + "." + split[1];
            } catch (Exception unused) {
            }
        }
        return "";
    }

    public UrnType getType() {
        return this.mDeviceType;
    }

    public void setClazz(Class<? extends AbstractDevice> cls) {
        this.mClazz = cls;
    }

    public void setDeviceType(UrnType urnType) {
        this.mDeviceType = urnType;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.mDeviceType, i);
        parcel.writeSerializable(this.mClazz);
        parcel.writeString(this.mModel);
    }
}
