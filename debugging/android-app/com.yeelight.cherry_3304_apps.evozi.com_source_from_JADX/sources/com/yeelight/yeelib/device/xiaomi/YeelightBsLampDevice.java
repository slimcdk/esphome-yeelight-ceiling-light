package com.yeelight.yeelib.device.xiaomi;

import android.os.Parcel;
import android.os.Parcelable;
import com.miot.common.abstractdevice.AbstractDevice;
import com.miot.common.device.Device;
import com.miot.common.device.Service;

public class YeelightBsLampDevice extends AbstractDevice {
    public static final Parcelable.Creator<YeelightBsLampDevice> CREATOR = new C9673a();
    private static final String DEVICE_TYPE = "YeelightBsLampDevice";
    public static final String SERVICE_BsLampService = "urn:schemas-mi-com:service:BsLamp:Service:1";
    private static final String TAG = "YeelightBsLampDevice";
    public BsLampService mDeviceService;

    /* renamed from: com.yeelight.yeelib.device.xiaomi.YeelightBsLampDevice$a */
    static class C9673a implements Parcelable.Creator<YeelightBsLampDevice> {
        C9673a() {
        }

        /* renamed from: a */
        public YeelightBsLampDevice createFromParcel(Parcel parcel) {
            return new YeelightBsLampDevice(parcel, (C9673a) null);
        }

        /* renamed from: b */
        public YeelightBsLampDevice[] newArray(int i) {
            return new YeelightBsLampDevice[i];
        }
    }

    private YeelightBsLampDevice() {
        this.mDeviceService = new BsLampService(this);
    }

    private YeelightBsLampDevice(Parcel parcel) {
        this.mDeviceService = new BsLampService(this);
        readFromParcel(parcel);
    }

    /* synthetic */ YeelightBsLampDevice(Parcel parcel, C9673a aVar) {
        this(parcel);
    }

    public static synchronized YeelightBsLampDevice create(Device device) {
        YeelightBsLampDevice yeelightBsLampDevice;
        synchronized (YeelightBsLampDevice.class) {
            yeelightBsLampDevice = null;
            if (device.getType().getName().equals("YeelightBsLampDevice")) {
                YeelightBsLampDevice yeelightBsLampDevice2 = new YeelightBsLampDevice();
                if (yeelightBsLampDevice2.init(device)) {
                    yeelightBsLampDevice = yeelightBsLampDevice2;
                }
            }
        }
        return yeelightBsLampDevice;
    }

    private boolean init(Device device) {
        Service service;
        if (device == null || (service = device.getService((String) SERVICE_BsLampService)) == null) {
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
