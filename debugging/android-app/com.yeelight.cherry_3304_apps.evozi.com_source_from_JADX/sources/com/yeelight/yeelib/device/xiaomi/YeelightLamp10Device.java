package com.yeelight.yeelib.device.xiaomi;

import android.os.Parcel;
import android.os.Parcelable;
import com.miot.common.abstractdevice.AbstractDevice;
import com.miot.common.device.Device;
import com.miot.common.device.Service;

public class YeelightLamp10Device extends AbstractDevice {
    public static final Parcelable.Creator<YeelightLamp10Device> CREATOR = new C9691a();
    private static final String DEVICE_TYPE = "YeelightLamp10Device";
    public static final String SERVICE_Lamp10Service = "urn:schemas-mi-com:service:Lamp10:Service:1";
    private static final String TAG = "YeelightLamp10Device";
    public Lamp10Service mDeviceService;

    /* renamed from: com.yeelight.yeelib.device.xiaomi.YeelightLamp10Device$a */
    static class C9691a implements Parcelable.Creator<YeelightLamp10Device> {
        C9691a() {
        }

        /* renamed from: a */
        public YeelightLamp10Device createFromParcel(Parcel parcel) {
            return new YeelightLamp10Device(parcel, (C9691a) null);
        }

        /* renamed from: b */
        public YeelightLamp10Device[] newArray(int i) {
            return new YeelightLamp10Device[i];
        }
    }

    private YeelightLamp10Device() {
        this.mDeviceService = new Lamp10Service(this);
    }

    private YeelightLamp10Device(Parcel parcel) {
        this.mDeviceService = new Lamp10Service(this);
        readFromParcel(parcel);
    }

    /* synthetic */ YeelightLamp10Device(Parcel parcel, C9691a aVar) {
        this(parcel);
    }

    public static synchronized YeelightLamp10Device create(Device device) {
        YeelightLamp10Device yeelightLamp10Device;
        synchronized (YeelightLamp10Device.class) {
            yeelightLamp10Device = null;
            if (device.getType().getName().equals("YeelightLamp10Device")) {
                YeelightLamp10Device yeelightLamp10Device2 = new YeelightLamp10Device();
                if (yeelightLamp10Device2.init(device)) {
                    yeelightLamp10Device = yeelightLamp10Device2;
                }
            }
        }
        return yeelightLamp10Device;
    }

    private boolean init(Device device) {
        Service service;
        if (device == null || (service = device.getService((String) SERVICE_Lamp10Service)) == null) {
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
