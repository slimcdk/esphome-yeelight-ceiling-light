package com.miot.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.miot.common.abstractdevice.AbstractDevice;
import com.miot.common.device.Device;

public class XiaomiBluetooth extends AbstractDevice {
    public static final Parcelable.Creator<XiaomiBluetooth> CREATOR = new Parcelable.Creator<XiaomiBluetooth>() {
        public XiaomiBluetooth createFromParcel(Parcel parcel) {
            return new XiaomiBluetooth(parcel);
        }

        public XiaomiBluetooth[] newArray(int i) {
            return new XiaomiBluetooth[i];
        }
    };
    private static final String DEVICE_TYPE = "XiaomiBluetooth";
    private static final String TAG = "XiaomiBluetooth";

    private XiaomiBluetooth() {
    }

    private XiaomiBluetooth(Parcel parcel) {
        readFromParcel(parcel);
    }

    public static synchronized XiaomiBluetooth create(Device device) {
        XiaomiBluetooth xiaomiBluetooth;
        synchronized (XiaomiBluetooth.class) {
            xiaomiBluetooth = null;
            if ((device.getType().getClassType() + device.getType().getSubType()).equals("XiaomiBluetooth")) {
                XiaomiBluetooth xiaomiBluetooth2 = new XiaomiBluetooth();
                if (xiaomiBluetooth2.init(device)) {
                    xiaomiBluetooth = xiaomiBluetooth2;
                }
            }
        }
        return xiaomiBluetooth;
    }

    private boolean init(Device device) {
        if (device == null) {
            return false;
        }
        setDevice(device);
        return true;
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
