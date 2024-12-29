package com.yeelight.yeelib.device.xiaomi;

import android.os.Parcel;
import android.os.Parcelable;
import com.miot.common.abstractdevice.AbstractDevice;
import com.miot.common.device.Device;
import com.miot.common.device.Service;

public class YeelightCeilingDevice extends AbstractDevice {
    public static final Parcelable.Creator<YeelightCeilingDevice> CREATOR = new C9682a();
    private static final String DEVICE_TYPE = "YeelightCeilingDevice";
    public static final String SERVICE_CeilingService = "urn:schemas-mi-com:service:Ceiling:Service:1";
    private static final String TAG = "YeelightCeilingDevice";
    public CeilingService mDeviceService;

    /* renamed from: com.yeelight.yeelib.device.xiaomi.YeelightCeilingDevice$a */
    static class C9682a implements Parcelable.Creator<YeelightCeilingDevice> {
        C9682a() {
        }

        /* renamed from: a */
        public YeelightCeilingDevice createFromParcel(Parcel parcel) {
            return new YeelightCeilingDevice(parcel, (C9682a) null);
        }

        /* renamed from: b */
        public YeelightCeilingDevice[] newArray(int i) {
            return new YeelightCeilingDevice[i];
        }
    }

    private YeelightCeilingDevice() {
        this.mDeviceService = new CeilingService(this);
    }

    private YeelightCeilingDevice(Parcel parcel) {
        this.mDeviceService = new CeilingService(this);
        readFromParcel(parcel);
    }

    /* synthetic */ YeelightCeilingDevice(Parcel parcel, C9682a aVar) {
        this(parcel);
    }

    public static synchronized YeelightCeilingDevice create(Device device) {
        YeelightCeilingDevice yeelightCeilingDevice;
        synchronized (YeelightCeilingDevice.class) {
            yeelightCeilingDevice = null;
            if ((device.getType().getClassType() + device.getType().getSubType()).equals("YeelightCeilingDevice")) {
                YeelightCeilingDevice yeelightCeilingDevice2 = new YeelightCeilingDevice();
                if (yeelightCeilingDevice2.init(device)) {
                    yeelightCeilingDevice = yeelightCeilingDevice2;
                }
            }
        }
        return yeelightCeilingDevice;
    }

    private boolean init(Device device) {
        Service service;
        if (device == null || (service = device.getService((String) SERVICE_CeilingService)) == null) {
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
