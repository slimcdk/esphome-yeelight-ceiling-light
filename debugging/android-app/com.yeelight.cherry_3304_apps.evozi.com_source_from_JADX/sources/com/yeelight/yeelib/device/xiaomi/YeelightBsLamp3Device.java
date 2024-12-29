package com.yeelight.yeelib.device.xiaomi;

import android.os.Parcel;
import android.os.Parcelable;
import com.miot.common.abstractdevice.AbstractDevice;
import com.miot.common.device.Device;
import com.miot.common.device.Service;

public class YeelightBsLamp3Device extends AbstractDevice {
    public static final Parcelable.Creator<YeelightBsLamp3Device> CREATOR = new C9672a();
    private static final String DEVICE_TYPE = "YeelightBsLamp3Device";
    public static final String SERVICE_BsLamp3Service = "urn:schemas-mi-com:service:BsLamp3:Service:1";
    private static final String TAG = "YeelightBsLamp3Device";
    public BsLamp3Service mDeviceService;

    /* renamed from: com.yeelight.yeelib.device.xiaomi.YeelightBsLamp3Device$a */
    static class C9672a implements Parcelable.Creator<YeelightBsLamp3Device> {
        C9672a() {
        }

        /* renamed from: a */
        public YeelightBsLamp3Device createFromParcel(Parcel parcel) {
            return new YeelightBsLamp3Device(parcel, (C9672a) null);
        }

        /* renamed from: b */
        public YeelightBsLamp3Device[] newArray(int i) {
            return new YeelightBsLamp3Device[i];
        }
    }

    private YeelightBsLamp3Device() {
        this.mDeviceService = new BsLamp3Service(this);
    }

    private YeelightBsLamp3Device(Parcel parcel) {
        this.mDeviceService = new BsLamp3Service(this);
        readFromParcel(parcel);
    }

    /* synthetic */ YeelightBsLamp3Device(Parcel parcel, C9672a aVar) {
        this(parcel);
    }

    public static synchronized YeelightBsLamp3Device create(Device device) {
        YeelightBsLamp3Device yeelightBsLamp3Device;
        synchronized (YeelightBsLamp3Device.class) {
            yeelightBsLamp3Device = null;
            if (device.getType().getName().equals("YeelightBsLamp3Device")) {
                YeelightBsLamp3Device yeelightBsLamp3Device2 = new YeelightBsLamp3Device();
                if (yeelightBsLamp3Device2.init(device)) {
                    yeelightBsLamp3Device = yeelightBsLamp3Device2;
                }
            }
        }
        return yeelightBsLamp3Device;
    }

    private boolean init(Device device) {
        Service service;
        if (device == null || (service = device.getService((String) SERVICE_BsLamp3Service)) == null) {
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
