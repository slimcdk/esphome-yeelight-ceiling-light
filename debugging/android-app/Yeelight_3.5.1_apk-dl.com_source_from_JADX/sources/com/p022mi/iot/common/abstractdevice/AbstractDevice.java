package com.p022mi.iot.common.abstractdevice;

import android.os.Parcel;
import android.os.Parcelable;
import com.p022mi.iot.common.instance.Device;

/* renamed from: com.mi.iot.common.abstractdevice.AbstractDevice */
public class AbstractDevice implements Parcelable {
    public static final Parcelable.Creator<AbstractDevice> CREATOR = new Parcelable.Creator<AbstractDevice>() {
        public AbstractDevice createFromParcel(Parcel parcel) {
            return new AbstractDevice(parcel);
        }

        public AbstractDevice[] newArray(int i) {
            return new AbstractDevice[i];
        }
    };
    private static final String TAG = AbstractDevice.class.getSimpleName();
    protected Device mDevice;

    public AbstractDevice() {
    }

    protected AbstractDevice(Parcel parcel) {
        readFromParcel(parcel);
    }

    public AbstractDevice(Device device) {
        this.mDevice = device;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AbstractDevice)) {
            return false;
        }
        AbstractDevice abstractDevice = (AbstractDevice) obj;
        Device device = this.mDevice;
        return device != null && device.equals(abstractDevice.getDevice());
    }

    public Device getDevice() {
        return this.mDevice;
    }

    public String getDeviceId() {
        return this.mDevice.getDeviceId();
    }

    public String getName() {
        return this.mDevice.getName();
    }

    public int hashCode() {
        Device device = this.mDevice;
        if (device != null) {
            return device.hashCode();
        }
        return 31;
    }

    public boolean isOnline() {
        return this.mDevice.isOnline();
    }

    public void readFromParcel(Parcel parcel) {
        this.mDevice = (Device) parcel.readParcelable(Device.class.getClassLoader());
    }

    public void setDevice(Device device) {
        this.mDevice = device;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.mDevice, i);
    }
}
