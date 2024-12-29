package com.yeelight.yeelib.device.xiaomi;

import android.os.Parcel;
import android.os.Parcelable;
import com.miot.common.abstractdevice.AbstractDevice;
import com.miot.common.device.Device;
import com.miot.common.device.Service;

public class YeelightBhfLightDevice extends AbstractDevice {
    public static final Parcelable.Creator<YeelightBhfLightDevice> CREATOR = new C9669a();
    private static final String DEVICE_TYPE = "YeelightBhfLightDevice";
    public static final String SERVICE_BhfLightService = "urn:schemas-mi-com:service:BhfLight:Service:1";
    private static final String TAG = "YeelightBhfLightDevice";
    public BhfLightService mDeviceService;

    /* renamed from: com.yeelight.yeelib.device.xiaomi.YeelightBhfLightDevice$a */
    static class C9669a implements Parcelable.Creator<YeelightBhfLightDevice> {
        C9669a() {
        }

        /* renamed from: a */
        public YeelightBhfLightDevice createFromParcel(Parcel parcel) {
            return new YeelightBhfLightDevice(parcel, (C9669a) null);
        }

        /* renamed from: b */
        public YeelightBhfLightDevice[] newArray(int i) {
            return new YeelightBhfLightDevice[i];
        }
    }

    private YeelightBhfLightDevice() {
        this.mDeviceService = new BhfLightService(this);
    }

    private YeelightBhfLightDevice(Parcel parcel) {
        this.mDeviceService = new BhfLightService(this);
        readFromParcel(parcel);
    }

    /* synthetic */ YeelightBhfLightDevice(Parcel parcel, C9669a aVar) {
        this(parcel);
    }

    public static synchronized YeelightBhfLightDevice create(Device device) {
        YeelightBhfLightDevice yeelightBhfLightDevice;
        synchronized (YeelightBhfLightDevice.class) {
            yeelightBhfLightDevice = null;
            if ((device.getType().getClassType() + device.getType().getSubType()).equals("YeelightBhfLightDevice")) {
                YeelightBhfLightDevice yeelightBhfLightDevice2 = new YeelightBhfLightDevice();
                if (yeelightBhfLightDevice2.init(device)) {
                    yeelightBhfLightDevice = yeelightBhfLightDevice2;
                }
            }
        }
        return yeelightBhfLightDevice;
    }

    private boolean init(Device device) {
        Service service;
        if (device == null || (service = device.getService((String) SERVICE_BhfLightService)) == null) {
            return false;
        }
        this.mDeviceService.setService(service);
        setDevice(device);
        return true;
    }

    public int describeContents() {
        return 0;
    }

    public void readFromParcel(Parcel parcel) {
        boolean init = init((Device) parcel.readParcelable(Device.class.getClassLoader()));
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(getDevice(), i);
    }
}
