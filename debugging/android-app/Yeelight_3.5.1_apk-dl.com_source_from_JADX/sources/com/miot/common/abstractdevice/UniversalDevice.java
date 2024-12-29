package com.miot.common.abstractdevice;

import android.os.Parcel;
import android.os.Parcelable;
import com.miot.common.device.Device;

public class UniversalDevice extends AbstractDevice {
    public static final Parcelable.Creator<UniversalDevice> CREATOR = new Parcelable.Creator<UniversalDevice>() {
        public UniversalDevice createFromParcel(Parcel parcel) {
            return new UniversalDevice(parcel);
        }

        public UniversalDevice[] newArray(int i) {
            return new UniversalDevice[i];
        }
    };
    private static final String TAG = "UniversalDevice";

    private UniversalDevice() {
    }

    private UniversalDevice(Parcel parcel) {
        readFromParcel(parcel);
    }

    public static synchronized UniversalDevice create(Device device) {
        UniversalDevice universalDevice;
        synchronized (UniversalDevice.class) {
            universalDevice = new UniversalDevice();
            universalDevice.init(device);
        }
        return universalDevice;
    }

    private void init(Device device) {
        if (device != null) {
            setDevice(device);
            return;
        }
        throw new IllegalArgumentException("deivce is null");
    }

    public int describeContents() {
        return 0;
    }

    public void readFromParcel(Parcel parcel) {
        init((Device) parcel.readParcelable(Device.class.getClassLoader()));
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(getDevice(), i);
    }
}
