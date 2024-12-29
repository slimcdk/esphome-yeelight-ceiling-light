package com.yeelight.yeelib.device.xiaomi;

import android.os.Parcel;
import android.os.Parcelable;
import com.miot.common.abstractdevice.AbstractDevice;
import com.miot.common.device.Device;
import com.miot.common.device.Service;

public class YeelightLamp7Device extends AbstractDevice {
    public static final Parcelable.Creator<YeelightLamp7Device> CREATOR = new C8185a();
    private static final String DEVICE_TYPE = "YeelightLamp7Device";
    public static final String SERVICE_Lamp7Service = "urn:schemas-mi-com:service:Lamp7:Service:1";
    private static final String TAG = "YeelightLamp7Device";
    public Lamp7Service mDeviceService;

    /* renamed from: com.yeelight.yeelib.device.xiaomi.YeelightLamp7Device$a */
    class C8185a implements Parcelable.Creator<YeelightLamp7Device> {
        C8185a() {
        }

        /* renamed from: a */
        public YeelightLamp7Device createFromParcel(Parcel parcel) {
            return new YeelightLamp7Device(parcel, (C8185a) null);
        }

        /* renamed from: b */
        public YeelightLamp7Device[] newArray(int i) {
            return new YeelightLamp7Device[i];
        }
    }

    private YeelightLamp7Device() {
        this.mDeviceService = new Lamp7Service(this);
    }

    private YeelightLamp7Device(Parcel parcel) {
        this.mDeviceService = new Lamp7Service(this);
        readFromParcel(parcel);
    }

    /* synthetic */ YeelightLamp7Device(Parcel parcel, C8185a aVar) {
        this(parcel);
    }

    public static synchronized YeelightLamp7Device create(Device device) {
        YeelightLamp7Device yeelightLamp7Device;
        synchronized (YeelightLamp7Device.class) {
            yeelightLamp7Device = null;
            if (device.getType().getName().equals("YeelightLamp7Device")) {
                YeelightLamp7Device yeelightLamp7Device2 = new YeelightLamp7Device();
                if (yeelightLamp7Device2.init(device)) {
                    yeelightLamp7Device = yeelightLamp7Device2;
                }
            }
        }
        return yeelightLamp7Device;
    }

    private boolean init(Device device) {
        Service service;
        if (device == null || (service = device.getService((String) SERVICE_Lamp7Service)) == null) {
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
