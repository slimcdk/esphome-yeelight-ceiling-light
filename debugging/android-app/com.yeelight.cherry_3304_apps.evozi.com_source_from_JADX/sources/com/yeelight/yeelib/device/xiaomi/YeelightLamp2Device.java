package com.yeelight.yeelib.device.xiaomi;

import android.os.Parcel;
import android.os.Parcelable;
import com.miot.common.abstractdevice.AbstractDevice;
import com.miot.common.device.Device;
import com.miot.common.device.Service;

public class YeelightLamp2Device extends AbstractDevice {
    public static final Parcelable.Creator<YeelightLamp2Device> CREATOR = new C9693a();
    private static final String DEVICE_TYPE = "YeelightLamp2Device";
    public static final String SERVICE_Lamp2Service = "urn:schemas-mi-com:service:Lamp2:Service:1";
    private static final String TAG = "YeelightLamp2Device";
    public Lamp2Service mDeviceService;

    /* renamed from: com.yeelight.yeelib.device.xiaomi.YeelightLamp2Device$a */
    static class C9693a implements Parcelable.Creator<YeelightLamp2Device> {
        C9693a() {
        }

        /* renamed from: a */
        public YeelightLamp2Device createFromParcel(Parcel parcel) {
            return new YeelightLamp2Device(parcel, (C9693a) null);
        }

        /* renamed from: b */
        public YeelightLamp2Device[] newArray(int i) {
            return new YeelightLamp2Device[i];
        }
    }

    private YeelightLamp2Device() {
        this.mDeviceService = new Lamp2Service(this);
    }

    private YeelightLamp2Device(Parcel parcel) {
        this.mDeviceService = new Lamp2Service(this);
        readFromParcel(parcel);
    }

    /* synthetic */ YeelightLamp2Device(Parcel parcel, C9693a aVar) {
        this(parcel);
    }

    public static synchronized YeelightLamp2Device create(Device device) {
        YeelightLamp2Device yeelightLamp2Device;
        synchronized (YeelightLamp2Device.class) {
            yeelightLamp2Device = null;
            if (device.getType().getName().equals("YeelightLamp2Device")) {
                YeelightLamp2Device yeelightLamp2Device2 = new YeelightLamp2Device();
                if (yeelightLamp2Device2.init(device)) {
                    yeelightLamp2Device = yeelightLamp2Device2;
                }
            }
        }
        return yeelightLamp2Device;
    }

    private boolean init(Device device) {
        Service service;
        if (device == null || (service = device.getService((String) SERVICE_Lamp2Service)) == null) {
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
