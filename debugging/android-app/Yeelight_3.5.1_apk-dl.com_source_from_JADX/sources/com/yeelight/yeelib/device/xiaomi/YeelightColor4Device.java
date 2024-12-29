package com.yeelight.yeelib.device.xiaomi;

import android.os.Parcel;
import android.os.Parcelable;
import com.miot.common.abstractdevice.AbstractDevice;
import com.miot.common.device.Device;
import com.miot.common.device.Service;

public class YeelightColor4Device extends AbstractDevice {
    public static final Parcelable.Creator<YeelightColor4Device> CREATOR = new C8176a();
    private static final String DEVICE_TYPE = "YeelightColor4Device";
    public static final String SERVICE_Color4Service = "urn:schemas-mi-com:service:Color4:Service:1";
    private static final String TAG = "YeelightColor4Device";
    public Color4Service mDeviceService;

    /* renamed from: com.yeelight.yeelib.device.xiaomi.YeelightColor4Device$a */
    class C8176a implements Parcelable.Creator<YeelightColor4Device> {
        C8176a() {
        }

        /* renamed from: a */
        public YeelightColor4Device createFromParcel(Parcel parcel) {
            return new YeelightColor4Device(parcel, (C8176a) null);
        }

        /* renamed from: b */
        public YeelightColor4Device[] newArray(int i) {
            return new YeelightColor4Device[i];
        }
    }

    private YeelightColor4Device() {
        this.mDeviceService = new Color4Service(this);
    }

    private YeelightColor4Device(Parcel parcel) {
        this.mDeviceService = new Color4Service(this);
        readFromParcel(parcel);
    }

    /* synthetic */ YeelightColor4Device(Parcel parcel, C8176a aVar) {
        this(parcel);
    }

    public static synchronized YeelightColor4Device create(Device device) {
        YeelightColor4Device yeelightColor4Device;
        synchronized (YeelightColor4Device.class) {
            yeelightColor4Device = null;
            if (device.getType().getName().equals("YeelightColor4Device")) {
                YeelightColor4Device yeelightColor4Device2 = new YeelightColor4Device();
                if (yeelightColor4Device2.init(device)) {
                    yeelightColor4Device = yeelightColor4Device2;
                }
            }
        }
        return yeelightColor4Device;
    }

    private boolean init(Device device) {
        Service service;
        if (device == null || (service = device.getService((String) SERVICE_Color4Service)) == null) {
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
