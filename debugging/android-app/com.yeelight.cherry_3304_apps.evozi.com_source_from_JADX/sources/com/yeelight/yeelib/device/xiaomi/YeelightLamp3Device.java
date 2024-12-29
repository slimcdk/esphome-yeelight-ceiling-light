package com.yeelight.yeelib.device.xiaomi;

import android.os.Parcel;
import android.os.Parcelable;
import com.miot.common.abstractdevice.AbstractDevice;
import com.miot.common.device.Device;
import com.miot.common.device.Service;

public class YeelightLamp3Device extends AbstractDevice {
    public static final Parcelable.Creator<YeelightLamp3Device> CREATOR = new C9694a();
    private static final String DEVICE_TYPE = "YeelightLamp3Device";
    public static final String SERVICE_Lamp3Service = "urn:schemas-mi-com:service:Lamp3:Service:1";
    private static final String TAG = "YeelightLamp3Device";
    public Lamp3Service mDeviceService;

    /* renamed from: com.yeelight.yeelib.device.xiaomi.YeelightLamp3Device$a */
    static class C9694a implements Parcelable.Creator<YeelightLamp3Device> {
        C9694a() {
        }

        /* renamed from: a */
        public YeelightLamp3Device createFromParcel(Parcel parcel) {
            return new YeelightLamp3Device(parcel, (C9694a) null);
        }

        /* renamed from: b */
        public YeelightLamp3Device[] newArray(int i) {
            return new YeelightLamp3Device[i];
        }
    }

    private YeelightLamp3Device() {
        this.mDeviceService = new Lamp3Service(this);
    }

    private YeelightLamp3Device(Parcel parcel) {
        this.mDeviceService = new Lamp3Service(this);
        readFromParcel(parcel);
    }

    /* synthetic */ YeelightLamp3Device(Parcel parcel, C9694a aVar) {
        this(parcel);
    }

    public static synchronized YeelightLamp3Device create(Device device) {
        YeelightLamp3Device yeelightLamp3Device;
        synchronized (YeelightLamp3Device.class) {
            yeelightLamp3Device = null;
            if ((device.getType().getClassType() + device.getType().getSubType()).equals("YeelightLamp3Device")) {
                YeelightLamp3Device yeelightLamp3Device2 = new YeelightLamp3Device();
                if (yeelightLamp3Device2.init(device)) {
                    yeelightLamp3Device = yeelightLamp3Device2;
                }
            }
        }
        return yeelightLamp3Device;
    }

    private boolean init(Device device) {
        Service service;
        if (device == null || (service = device.getService((String) SERVICE_Lamp3Service)) == null) {
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
