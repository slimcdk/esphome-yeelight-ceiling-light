package com.yeelight.yeelib.device.xiaomi;

import android.os.Parcel;
import android.os.Parcelable;
import com.miot.common.abstractdevice.AbstractDevice;
import com.miot.common.device.Device;
import com.miot.common.device.Service;

public class YeelightCeiling29Device extends AbstractDevice {
    public static final Parcelable.Creator<YeelightCeiling29Device> CREATOR = new C8165a();
    private static final String DEVICE_TYPE = "YeelightCeiling29Device";
    public static final String SERVICE_Ceiling29Service = "urn:schemas-mi-com:service:Ceiling29:Service:1";
    private static final String TAG = "YeelightCeiling29Device";
    public Ceiling29Service mDeviceService;

    /* renamed from: com.yeelight.yeelib.device.xiaomi.YeelightCeiling29Device$a */
    class C8165a implements Parcelable.Creator<YeelightCeiling29Device> {
        C8165a() {
        }

        /* renamed from: a */
        public YeelightCeiling29Device createFromParcel(Parcel parcel) {
            return new YeelightCeiling29Device(parcel, (C8165a) null);
        }

        /* renamed from: b */
        public YeelightCeiling29Device[] newArray(int i) {
            return new YeelightCeiling29Device[i];
        }
    }

    private YeelightCeiling29Device() {
        this.mDeviceService = new Ceiling29Service(this);
    }

    private YeelightCeiling29Device(Parcel parcel) {
        this.mDeviceService = new Ceiling29Service(this);
        readFromParcel(parcel);
    }

    /* synthetic */ YeelightCeiling29Device(Parcel parcel, C8165a aVar) {
        this(parcel);
    }

    public static synchronized YeelightCeiling29Device create(Device device) {
        YeelightCeiling29Device yeelightCeiling29Device;
        synchronized (YeelightCeiling29Device.class) {
            yeelightCeiling29Device = null;
            if (device.getType().getName().equals("YeelightCeiling29Device")) {
                YeelightCeiling29Device yeelightCeiling29Device2 = new YeelightCeiling29Device();
                if (yeelightCeiling29Device2.init(device)) {
                    yeelightCeiling29Device = yeelightCeiling29Device2;
                }
            }
        }
        return yeelightCeiling29Device;
    }

    private boolean init(Device device) {
        Service service;
        if (device == null || (service = device.getService((String) SERVICE_Ceiling29Service)) == null) {
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
