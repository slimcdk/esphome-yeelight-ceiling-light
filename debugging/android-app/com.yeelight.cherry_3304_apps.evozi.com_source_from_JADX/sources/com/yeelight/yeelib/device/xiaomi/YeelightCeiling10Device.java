package com.yeelight.yeelib.device.xiaomi;

import android.os.Parcel;
import android.os.Parcelable;
import com.miot.common.abstractdevice.AbstractDevice;
import com.miot.common.device.Device;
import com.miot.common.device.Service;

public class YeelightCeiling10Device extends AbstractDevice {
    public static final Parcelable.Creator<YeelightCeiling10Device> CREATOR = new C9674a();
    private static final String DEVICE_TYPE = "YeelightCeiling10Device";
    public static final String SERVICE_Ceiling10Service = "urn:schemas-mi-com:service:Ceiling10:Service:1";
    private static final String TAG = "YeelightCeiling10Device";
    public Ceiling10Service mDeviceService;

    /* renamed from: com.yeelight.yeelib.device.xiaomi.YeelightCeiling10Device$a */
    static class C9674a implements Parcelable.Creator<YeelightCeiling10Device> {
        C9674a() {
        }

        /* renamed from: a */
        public YeelightCeiling10Device createFromParcel(Parcel parcel) {
            return new YeelightCeiling10Device(parcel, (C9674a) null);
        }

        /* renamed from: b */
        public YeelightCeiling10Device[] newArray(int i) {
            return new YeelightCeiling10Device[i];
        }
    }

    private YeelightCeiling10Device() {
        this.mDeviceService = new Ceiling10Service(this);
    }

    private YeelightCeiling10Device(Parcel parcel) {
        this.mDeviceService = new Ceiling10Service(this);
        readFromParcel(parcel);
    }

    /* synthetic */ YeelightCeiling10Device(Parcel parcel, C9674a aVar) {
        this(parcel);
    }

    public static synchronized YeelightCeiling10Device create(Device device) {
        YeelightCeiling10Device yeelightCeiling10Device;
        synchronized (YeelightCeiling10Device.class) {
            yeelightCeiling10Device = null;
            if (device.getType().getName().equals("YeelightCeiling10Device")) {
                YeelightCeiling10Device yeelightCeiling10Device2 = new YeelightCeiling10Device();
                if (yeelightCeiling10Device2.init(device)) {
                    yeelightCeiling10Device = yeelightCeiling10Device2;
                }
            }
        }
        return yeelightCeiling10Device;
    }

    private boolean init(Device device) {
        Service service;
        if (device == null || (service = device.getService((String) SERVICE_Ceiling10Service)) == null) {
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
