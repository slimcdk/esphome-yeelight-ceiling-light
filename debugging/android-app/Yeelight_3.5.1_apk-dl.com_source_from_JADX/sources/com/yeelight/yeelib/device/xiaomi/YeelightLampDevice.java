package com.yeelight.yeelib.device.xiaomi;

import android.os.Parcel;
import android.os.Parcelable;
import com.miot.common.abstractdevice.AbstractDevice;
import com.miot.common.device.Device;
import com.miot.common.device.Service;

public class YeelightLampDevice extends AbstractDevice {
    public static final Parcelable.Creator<YeelightLampDevice> CREATOR = new C8187a();
    private static final String DEVICE_TYPE = "YeelightLampDevice";
    public static final String SERVICE_LampService = "urn:schemas-mi-com:service:Lamp:Service:1";
    private static final String TAG = "YeelightLampDevice";
    public LampService mDeviceService;

    /* renamed from: com.yeelight.yeelib.device.xiaomi.YeelightLampDevice$a */
    class C8187a implements Parcelable.Creator<YeelightLampDevice> {
        C8187a() {
        }

        /* renamed from: a */
        public YeelightLampDevice createFromParcel(Parcel parcel) {
            return new YeelightLampDevice(parcel, (C8187a) null);
        }

        /* renamed from: b */
        public YeelightLampDevice[] newArray(int i) {
            return new YeelightLampDevice[i];
        }
    }

    private YeelightLampDevice() {
        this.mDeviceService = new LampService(this);
    }

    private YeelightLampDevice(Parcel parcel) {
        this.mDeviceService = new LampService(this);
        readFromParcel(parcel);
    }

    /* synthetic */ YeelightLampDevice(Parcel parcel, C8187a aVar) {
        this(parcel);
    }

    public static synchronized YeelightLampDevice create(Device device) {
        YeelightLampDevice yeelightLampDevice;
        synchronized (YeelightLampDevice.class) {
            yeelightLampDevice = null;
            if (device.getType().getName().equals("YeelightLampDevice")) {
                YeelightLampDevice yeelightLampDevice2 = new YeelightLampDevice();
                if (yeelightLampDevice2.init(device)) {
                    yeelightLampDevice = yeelightLampDevice2;
                }
            }
        }
        return yeelightLampDevice;
    }

    private boolean init(Device device) {
        Service service;
        if (device == null || (service = device.getService((String) SERVICE_LampService)) == null) {
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
        init((Device) parcel.readParcelable(Device.class.getClassLoader()));
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(getDevice(), i);
    }
}
