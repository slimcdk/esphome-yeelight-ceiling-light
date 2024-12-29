package com.miot.common.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

public class DeviceModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<DeviceModel> CREATOR = new Parcelable.Creator<DeviceModel>() {
        public DeviceModel createFromParcel(Parcel parcel) {
            return new DeviceModel(parcel);
        }

        public DeviceModel[] newArray(int i) {
            return new DeviceModel[i];
        }
    };
    private final Class<?> mClazz;
    private final String mModel;
    private final String mUrl;

    private DeviceModel(Parcel parcel) {
        this.mModel = parcel.readString();
        this.mUrl = parcel.readString();
        this.mClazz = (Class) parcel.readSerializable();
    }

    DeviceModel(String str, String str2, Class<?> cls) {
        this.mModel = str;
        this.mUrl = str2;
        this.mClazz = cls;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DeviceModel)) {
            return false;
        }
        return this.mModel.equals(((DeviceModel) obj).getModel());
    }

    public Class<?> getClazz() {
        return this.mClazz;
    }

    public String getModel() {
        return this.mModel;
    }

    public String getUrl() {
        return this.mUrl;
    }

    public int hashCode() {
        return this.mModel.hashCode();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mModel);
        parcel.writeString(this.mUrl);
        parcel.writeSerializable(this.mClazz);
    }
}
