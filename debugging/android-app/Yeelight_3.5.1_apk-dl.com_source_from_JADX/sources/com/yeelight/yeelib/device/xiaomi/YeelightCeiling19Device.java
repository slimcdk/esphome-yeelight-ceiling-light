package com.yeelight.yeelib.device.xiaomi;

import android.os.Parcel;
import android.os.Parcelable;
import com.miot.common.abstractdevice.AbstractDevice;
import com.miot.common.device.Device;
import com.miot.common.device.Service;

public class YeelightCeiling19Device extends AbstractDevice {
    public static final Parcelable.Creator<YeelightCeiling19Device> CREATOR = new C8164a();
    private static final String DEVICE_TYPE = "YeelightCeiling19Device";
    public static final String SERVICE_Ceiling19Service = "urn:schemas-mi-com:service:Ceiling19:Service:1";
    private static final String TAG = "YeelightCeiling19Device";
    public Ceiling19Service mDeviceService;

    /* renamed from: com.yeelight.yeelib.device.xiaomi.YeelightCeiling19Device$a */
    class C8164a implements Parcelable.Creator<YeelightCeiling19Device> {
        C8164a() {
        }

        /* renamed from: a */
        public YeelightCeiling19Device createFromParcel(Parcel parcel) {
            return new YeelightCeiling19Device(parcel, (C8164a) null);
        }

        /* renamed from: b */
        public YeelightCeiling19Device[] newArray(int i) {
            return new YeelightCeiling19Device[i];
        }
    }

    private YeelightCeiling19Device() {
        this.mDeviceService = new Ceiling19Service(this);
    }

    private YeelightCeiling19Device(Parcel parcel) {
        this.mDeviceService = new Ceiling19Service(this);
        readFromParcel(parcel);
    }

    /* synthetic */ YeelightCeiling19Device(Parcel parcel, C8164a aVar) {
        this(parcel);
    }

    public static synchronized YeelightCeiling19Device create(Device device) {
        YeelightCeiling19Device yeelightCeiling19Device;
        synchronized (YeelightCeiling19Device.class) {
            yeelightCeiling19Device = null;
            if (device.getType().getName().equals("YeelightCeiling19Device")) {
                YeelightCeiling19Device yeelightCeiling19Device2 = new YeelightCeiling19Device();
                if (yeelightCeiling19Device2.init(device)) {
                    yeelightCeiling19Device = yeelightCeiling19Device2;
                }
            }
        }
        return yeelightCeiling19Device;
    }

    private boolean init(Device device) {
        Service service;
        if (device == null || (service = device.getService((String) SERVICE_Ceiling19Service)) == null) {
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
