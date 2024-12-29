package com.yeelight.yeelib.device.xiaomi;

import android.os.Parcel;
import android.os.Parcelable;
import com.miot.common.abstractdevice.AbstractDevice;
import com.miot.common.device.Device;
import com.miot.common.device.Service;

public class YeelightCeiling4Device extends AbstractDevice {
    public static final Parcelable.Creator<YeelightCeiling4Device> CREATOR = new C8168a();
    private static final String DEVICE_TYPE = "YeelightCeiling4Device";
    public static final String SERVICE_Ceiling4Service = "urn:schemas-mi-com:service:Ceiling4:Service:1";
    private static final String TAG = "YeelightCeiling4Device";
    public Ceiling4Service mDeviceService;

    /* renamed from: com.yeelight.yeelib.device.xiaomi.YeelightCeiling4Device$a */
    class C8168a implements Parcelable.Creator<YeelightCeiling4Device> {
        C8168a() {
        }

        /* renamed from: a */
        public YeelightCeiling4Device createFromParcel(Parcel parcel) {
            return new YeelightCeiling4Device(parcel, (C8168a) null);
        }

        /* renamed from: b */
        public YeelightCeiling4Device[] newArray(int i) {
            return new YeelightCeiling4Device[i];
        }
    }

    private YeelightCeiling4Device() {
        this.mDeviceService = new Ceiling4Service(this);
    }

    private YeelightCeiling4Device(Parcel parcel) {
        this.mDeviceService = new Ceiling4Service(this);
        readFromParcel(parcel);
    }

    /* synthetic */ YeelightCeiling4Device(Parcel parcel, C8168a aVar) {
        this(parcel);
    }

    public static synchronized YeelightCeiling4Device create(Device device) {
        YeelightCeiling4Device yeelightCeiling4Device;
        synchronized (YeelightCeiling4Device.class) {
            yeelightCeiling4Device = null;
            if ((device.getType().getClassType() + device.getType().getSubType()).equals("YeelightCeiling4Device")) {
                YeelightCeiling4Device yeelightCeiling4Device2 = new YeelightCeiling4Device();
                if (yeelightCeiling4Device2.init(device)) {
                    yeelightCeiling4Device = yeelightCeiling4Device2;
                }
            }
        }
        return yeelightCeiling4Device;
    }

    private boolean init(Device device) {
        Service service;
        if (device == null || (service = device.getService((String) SERVICE_Ceiling4Service)) == null) {
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
