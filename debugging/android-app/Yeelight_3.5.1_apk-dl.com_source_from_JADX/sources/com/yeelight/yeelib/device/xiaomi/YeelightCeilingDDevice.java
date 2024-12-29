package com.yeelight.yeelib.device.xiaomi;

import android.os.Parcel;
import android.os.Parcelable;
import com.miot.common.abstractdevice.AbstractDevice;
import com.miot.common.device.Device;
import com.miot.common.device.Service;

public class YeelightCeilingDDevice extends AbstractDevice {
    public static final Parcelable.Creator<YeelightCeilingDDevice> CREATOR = new C8171a();
    private static final String DEVICE_TYPE = "YeelightCeilingDDevice";
    public static final String SERVICE_CeilingDService = "urn:schemas-mi-com:service:CeilingD:Service:1";
    private static final String TAG = "YeelightCeilingDDevice";
    public CeilingDService mDeviceService;

    /* renamed from: com.yeelight.yeelib.device.xiaomi.YeelightCeilingDDevice$a */
    class C8171a implements Parcelable.Creator<YeelightCeilingDDevice> {
        C8171a() {
        }

        /* renamed from: a */
        public YeelightCeilingDDevice createFromParcel(Parcel parcel) {
            return new YeelightCeilingDDevice(parcel, (C8171a) null);
        }

        /* renamed from: b */
        public YeelightCeilingDDevice[] newArray(int i) {
            return new YeelightCeilingDDevice[i];
        }
    }

    private YeelightCeilingDDevice() {
        this.mDeviceService = new CeilingDService(this);
    }

    private YeelightCeilingDDevice(Parcel parcel) {
        this.mDeviceService = new CeilingDService(this);
        readFromParcel(parcel);
    }

    /* synthetic */ YeelightCeilingDDevice(Parcel parcel, C8171a aVar) {
        this(parcel);
    }

    public static synchronized YeelightCeilingDDevice create(Device device) {
        YeelightCeilingDDevice yeelightCeilingDDevice;
        synchronized (YeelightCeilingDDevice.class) {
            yeelightCeilingDDevice = null;
            if (device.getType().getName().equals("YeelightCeilingDDevice")) {
                YeelightCeilingDDevice yeelightCeilingDDevice2 = new YeelightCeilingDDevice();
                if (yeelightCeilingDDevice2.init(device)) {
                    yeelightCeilingDDevice = yeelightCeilingDDevice2;
                }
            }
        }
        return yeelightCeilingDDevice;
    }

    private boolean init(Device device) {
        Service service;
        if (device == null || (service = device.getService((String) SERVICE_CeilingDService)) == null) {
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
