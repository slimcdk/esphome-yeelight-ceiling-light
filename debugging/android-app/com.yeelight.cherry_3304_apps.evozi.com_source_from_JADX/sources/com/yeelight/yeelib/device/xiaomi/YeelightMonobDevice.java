package com.yeelight.yeelib.device.xiaomi;

import android.os.Parcel;
import android.os.Parcelable;
import com.miot.common.abstractdevice.AbstractDevice;
import com.miot.common.device.Device;
import com.miot.common.device.Service;

public class YeelightMonobDevice extends AbstractDevice {
    public static final Parcelable.Creator<YeelightMonobDevice> CREATOR = new C9701a();
    private static final String DEVICE_TYPE = "YeelightMonobDevice";
    public static final String SERVICE_MonobService = "urn:schemas-mi-com:service:Monob:Service:1";
    private static final String TAG = "YeelightMonobDevice";
    public MonobService mDeviceService;

    /* renamed from: com.yeelight.yeelib.device.xiaomi.YeelightMonobDevice$a */
    static class C9701a implements Parcelable.Creator<YeelightMonobDevice> {
        C9701a() {
        }

        /* renamed from: a */
        public YeelightMonobDevice createFromParcel(Parcel parcel) {
            return new YeelightMonobDevice(parcel, (C9701a) null);
        }

        /* renamed from: b */
        public YeelightMonobDevice[] newArray(int i) {
            return new YeelightMonobDevice[i];
        }
    }

    private YeelightMonobDevice() {
        this.mDeviceService = new MonobService(this);
    }

    private YeelightMonobDevice(Parcel parcel) {
        this.mDeviceService = new MonobService(this);
        readFromParcel(parcel);
    }

    /* synthetic */ YeelightMonobDevice(Parcel parcel, C9701a aVar) {
        this(parcel);
    }

    public static synchronized YeelightMonobDevice create(Device device) {
        YeelightMonobDevice yeelightMonobDevice;
        synchronized (YeelightMonobDevice.class) {
            yeelightMonobDevice = null;
            if (device.getType().getName().equals("YeelightMonobDevice")) {
                YeelightMonobDevice yeelightMonobDevice2 = new YeelightMonobDevice();
                if (yeelightMonobDevice2.init(device)) {
                    yeelightMonobDevice = yeelightMonobDevice2;
                }
            }
        }
        return yeelightMonobDevice;
    }

    private boolean init(Device device) {
        Service service;
        if (device == null || (service = device.getService((String) SERVICE_MonobService)) == null) {
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
