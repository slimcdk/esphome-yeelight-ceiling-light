package com.yeelight.yeelib.device.xiaomi;

import android.os.Parcel;
import android.os.Parcelable;
import com.miot.common.abstractdevice.AbstractDevice;
import com.miot.common.device.Device;
import com.miot.common.device.Service;

public class YeelightCeiling6Device extends AbstractDevice {
    public static final Parcelable.Creator<YeelightCeiling6Device> CREATOR = new C9680a();
    private static final String DEVICE_TYPE = "YeelightCeiling6Device";
    public static final String SERVICE_Ceiling6Service = "urn:schemas-mi-com:service:Ceiling6:Service:1";
    private static final String TAG = "YeelightCeiling6Device";
    public Ceiling6Service mDeviceService;

    /* renamed from: com.yeelight.yeelib.device.xiaomi.YeelightCeiling6Device$a */
    static class C9680a implements Parcelable.Creator<YeelightCeiling6Device> {
        C9680a() {
        }

        /* renamed from: a */
        public YeelightCeiling6Device createFromParcel(Parcel parcel) {
            return new YeelightCeiling6Device(parcel, (C9680a) null);
        }

        /* renamed from: b */
        public YeelightCeiling6Device[] newArray(int i) {
            return new YeelightCeiling6Device[i];
        }
    }

    private YeelightCeiling6Device() {
        this.mDeviceService = new Ceiling6Service(this);
    }

    private YeelightCeiling6Device(Parcel parcel) {
        this.mDeviceService = new Ceiling6Service(this);
        readFromParcel(parcel);
    }

    /* synthetic */ YeelightCeiling6Device(Parcel parcel, C9680a aVar) {
        this(parcel);
    }

    public static synchronized YeelightCeiling6Device create(Device device) {
        YeelightCeiling6Device yeelightCeiling6Device;
        synchronized (YeelightCeiling6Device.class) {
            yeelightCeiling6Device = null;
            if (device.getType().getName().equals("YeelightCeiling6Device")) {
                YeelightCeiling6Device yeelightCeiling6Device2 = new YeelightCeiling6Device();
                if (yeelightCeiling6Device2.init(device)) {
                    yeelightCeiling6Device = yeelightCeiling6Device2;
                }
            }
        }
        return yeelightCeiling6Device;
    }

    private boolean init(Device device) {
        Service service;
        if (device == null || (service = device.getService((String) SERVICE_Ceiling6Service)) == null) {
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
