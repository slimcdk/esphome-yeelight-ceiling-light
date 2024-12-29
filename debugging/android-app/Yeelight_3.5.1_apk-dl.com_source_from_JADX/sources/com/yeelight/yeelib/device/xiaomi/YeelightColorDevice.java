package com.yeelight.yeelib.device.xiaomi;

import android.os.Parcel;
import android.os.Parcelable;
import com.miot.common.abstractdevice.AbstractDevice;
import com.miot.common.device.Device;
import com.miot.common.device.Service;

public class YeelightColorDevice extends AbstractDevice {
    public static final Parcelable.Creator<YeelightColorDevice> CREATOR = new C8177a();
    private static final String DEVICE_TYPE = "YeelightColorDevice";
    public static final String SERVICE_ColorService = "urn:schemas-mi-com:service:Color:Service:1";
    private static final String TAG = "YeelightColorDevice";
    public ColorService mDeviceService;

    /* renamed from: com.yeelight.yeelib.device.xiaomi.YeelightColorDevice$a */
    class C8177a implements Parcelable.Creator<YeelightColorDevice> {
        C8177a() {
        }

        /* renamed from: a */
        public YeelightColorDevice createFromParcel(Parcel parcel) {
            return new YeelightColorDevice(parcel, (C8177a) null);
        }

        /* renamed from: b */
        public YeelightColorDevice[] newArray(int i) {
            return new YeelightColorDevice[i];
        }
    }

    private YeelightColorDevice() {
        this.mDeviceService = new ColorService(this);
    }

    private YeelightColorDevice(Parcel parcel) {
        this.mDeviceService = new ColorService(this);
        readFromParcel(parcel);
    }

    /* synthetic */ YeelightColorDevice(Parcel parcel, C8177a aVar) {
        this(parcel);
    }

    public static synchronized YeelightColorDevice create(Device device) {
        YeelightColorDevice yeelightColorDevice;
        synchronized (YeelightColorDevice.class) {
            yeelightColorDevice = null;
            if ((device.getType().getClassType() + device.getType().getSubType()).equals("YeelightColorDevice")) {
                YeelightColorDevice yeelightColorDevice2 = new YeelightColorDevice();
                if (yeelightColorDevice2.init(device)) {
                    yeelightColorDevice = yeelightColorDevice2;
                }
            }
        }
        return yeelightColorDevice;
    }

    private boolean init(Device device) {
        Service service;
        if (device == null || (service = device.getService((String) SERVICE_ColorService)) == null) {
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
