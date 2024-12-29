package com.yeelight.yeelib.device.xiaomi;

import android.os.Parcel;
import android.os.Parcelable;
import com.miot.common.abstractdevice.AbstractDevice;
import com.miot.common.device.Device;
import com.miot.common.device.Service;

public class YeelightMono4Device extends AbstractDevice {
    public static final Parcelable.Creator<YeelightMono4Device> CREATOR = new C8189a();
    private static final String DEVICE_TYPE = "YeelightMono4Device";
    public static final String SERVICE_Mono4Service = "urn:schemas-mi-com:service:Mono4:Service:1";
    private static final String TAG = "YeelightMono4Device";
    public Mono4Service mDeviceService;

    /* renamed from: com.yeelight.yeelib.device.xiaomi.YeelightMono4Device$a */
    class C8189a implements Parcelable.Creator<YeelightMono4Device> {
        C8189a() {
        }

        /* renamed from: a */
        public YeelightMono4Device createFromParcel(Parcel parcel) {
            return new YeelightMono4Device(parcel, (C8189a) null);
        }

        /* renamed from: b */
        public YeelightMono4Device[] newArray(int i) {
            return new YeelightMono4Device[i];
        }
    }

    private YeelightMono4Device() {
        this.mDeviceService = new Mono4Service(this);
    }

    private YeelightMono4Device(Parcel parcel) {
        this.mDeviceService = new Mono4Service(this);
        readFromParcel(parcel);
    }

    /* synthetic */ YeelightMono4Device(Parcel parcel, C8189a aVar) {
        this(parcel);
    }

    public static synchronized YeelightMono4Device create(Device device) {
        YeelightMono4Device yeelightMono4Device;
        synchronized (YeelightMono4Device.class) {
            yeelightMono4Device = null;
            if (device.getType().getName().equals("YeelightMono4Device")) {
                YeelightMono4Device yeelightMono4Device2 = new YeelightMono4Device();
                if (yeelightMono4Device2.init(device)) {
                    yeelightMono4Device = yeelightMono4Device2;
                }
            }
        }
        return yeelightMono4Device;
    }

    private boolean init(Device device) {
        Service service;
        if (device == null || (service = device.getService((String) SERVICE_Mono4Service)) == null) {
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
