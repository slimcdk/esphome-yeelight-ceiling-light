package com.yeelight.yeelib.device.xiaomi;

import android.os.Parcel;
import android.os.Parcelable;
import com.miot.common.abstractdevice.AbstractDevice;
import com.miot.common.device.Device;
import com.miot.common.device.Service;

public class YeelightLamp15Device extends AbstractDevice {
    public static final Parcelable.Creator<YeelightLamp15Device> CREATOR = new C9692a();
    private static final String DEVICE_TYPE = "YeelightLamp15Device";
    public static final String SERVICE_Lamp15Service = "urn:schemas-mi-com:service:Lamp15:Service:1";
    private static final String TAG = "YeelightLamp15Device";
    public Lamp15Service mDeviceService;

    /* renamed from: com.yeelight.yeelib.device.xiaomi.YeelightLamp15Device$a */
    static class C9692a implements Parcelable.Creator<YeelightLamp15Device> {
        C9692a() {
        }

        /* renamed from: a */
        public YeelightLamp15Device createFromParcel(Parcel parcel) {
            return new YeelightLamp15Device(parcel, (C9692a) null);
        }

        /* renamed from: b */
        public YeelightLamp15Device[] newArray(int i) {
            return new YeelightLamp15Device[i];
        }
    }

    private YeelightLamp15Device() {
        this.mDeviceService = new Lamp15Service(this);
    }

    private YeelightLamp15Device(Parcel parcel) {
        this.mDeviceService = new Lamp15Service(this);
        readFromParcel(parcel);
    }

    /* synthetic */ YeelightLamp15Device(Parcel parcel, C9692a aVar) {
        this(parcel);
    }

    public static synchronized YeelightLamp15Device create(Device device) {
        YeelightLamp15Device yeelightLamp15Device;
        synchronized (YeelightLamp15Device.class) {
            yeelightLamp15Device = null;
            if (device.getType().getName().equals("YeelightLamp15Device")) {
                YeelightLamp15Device yeelightLamp15Device2 = new YeelightLamp15Device();
                if (yeelightLamp15Device2.init(device)) {
                    yeelightLamp15Device = yeelightLamp15Device2;
                }
            }
        }
        return yeelightLamp15Device;
    }

    private boolean init(Device device) {
        Service service;
        if (device == null || (service = device.getService((String) SERVICE_Lamp15Service)) == null) {
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