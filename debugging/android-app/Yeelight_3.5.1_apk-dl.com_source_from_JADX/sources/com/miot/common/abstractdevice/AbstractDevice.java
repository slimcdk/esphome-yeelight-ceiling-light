package com.miot.common.abstractdevice;

import android.os.Parcel;
import android.os.Parcelable;
import com.miot.common.device.ConnectionType;
import com.miot.common.device.Device;
import com.miot.common.device.firmware.MiotFirmware;

public class AbstractDevice implements Parcelable {
    public static final Parcelable.Creator<AbstractDevice> CREATOR = new Parcelable.Creator<AbstractDevice>() {
        public AbstractDevice createFromParcel(Parcel parcel) {
            return new AbstractDevice(parcel);
        }

        public AbstractDevice[] newArray(int i) {
            return new AbstractDevice[i];
        }
    };
    private static final String TAG = "AbstractDevice";
    protected Device mDevice;
    protected MiotFirmware mMiotFirmware;

    public AbstractDevice() {
    }

    protected AbstractDevice(Parcel parcel) {
        readFromParcel(parcel);
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

    public String getAddress() {
        return this.mDevice.getAddress();
    }

    public ConnectionType getConnectionType() {
        return this.mDevice.getConnectionType();
    }

    public Device getDevice() {
        return this.mDevice;
    }

    public String getDeviceId() {
        return this.mDevice.getDeviceId();
    }

    public String getDeviceModel() {
        return this.mDevice.getDeviceModel();
    }

    public MiotFirmware getMiotFirmware() {
        return this.mMiotFirmware;
    }

    public String getName() {
        return this.mDevice.getName();
    }

    public Device.OwnerInfo getOwnerInfo() {
        return this.mDevice.getOwnerInfo();
    }

    public Device.Ownership getOwnership() {
        return this.mDevice.getOwnership();
    }

    public int hashCode() {
        Device device = this.mDevice;
        if (device != null) {
            return device.hashCode();
        }
        return 31;
    }

    public boolean isConnectionEstablished() {
        return true;
    }

    public boolean isOnline() {
        return this.mDevice.isOnline();
    }

    public boolean isVirtual() {
        return this.mDevice.isVirtual().booleanValue();
    }

    public void readFromParcel(Parcel parcel) {
        this.mDevice = (Device) parcel.readParcelable(Device.class.getClassLoader());
        this.mMiotFirmware = (MiotFirmware) parcel.readParcelable(MiotFirmware.class.getClassLoader());
    }

    public void setDevice(Device device) {
        this.mDevice = device;
    }

    public void setMiotFirmware(MiotFirmware miotFirmware) {
        this.mMiotFirmware = miotFirmware;
    }

    public boolean setName(String str) {
        return this.mDevice.setName(str);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.mDevice, i);
        parcel.writeParcelable(this.mMiotFirmware, i);
    }
}
