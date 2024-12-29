package com.yeelight.yeelib.device.xiaomi;

import android.os.Parcel;
import android.os.Parcelable;
import com.miot.common.abstractdevice.AbstractDevice;
import com.miot.common.device.Device;
import com.miot.common.device.Service;

public class YeelightLamp9Device extends AbstractDevice {
    public static final Parcelable.Creator<YeelightLamp9Device> CREATOR = new C9696a();
    private static final String DEVICE_TYPE = "YeelightLamp9Device";
    public static final String SERVICE_Lamp9Service = "urn:schemas-mi-com:service:Lamp9:Service:1";
    private static final String TAG = "YeelightLamp9Device";
    public Lamp9Service mDeviceService;

    /* renamed from: com.yeelight.yeelib.device.xiaomi.YeelightLamp9Device$a */
    static class C9696a implements Parcelable.Creator<YeelightLamp9Device> {
        C9696a() {
        }

        /* renamed from: a */
        public YeelightLamp9Device createFromParcel(Parcel parcel) {
            return new YeelightLamp9Device(parcel, (C9696a) null);
        }

        /* renamed from: b */
        public YeelightLamp9Device[] newArray(int i) {
            return new YeelightLamp9Device[i];
        }
    }

    private YeelightLamp9Device() {
        this.mDeviceService = new Lamp9Service(this);
    }

    private YeelightLamp9Device(Parcel parcel) {
        this.mDeviceService = new Lamp9Service(this);
        readFromParcel(parcel);
    }

    /* synthetic */ YeelightLamp9Device(Parcel parcel, C9696a aVar) {
        this(parcel);
    }

    public static synchronized YeelightLamp9Device create(Device device) {
        YeelightLamp9Device yeelightLamp9Device;
        synchronized (YeelightLamp9Device.class) {
            yeelightLamp9Device = null;
            if (device.getType().getName().equals("YeelightLamp9Device")) {
                YeelightLamp9Device yeelightLamp9Device2 = new YeelightLamp9Device();
                if (yeelightLamp9Device2.init(device)) {
                    yeelightLamp9Device = yeelightLamp9Device2;
                }
            }
        }
        return yeelightLamp9Device;
    }

    private boolean init(Device device) {
        Service service;
        if (device == null || (service = device.getService((String) SERVICE_Lamp9Service)) == null) {
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
