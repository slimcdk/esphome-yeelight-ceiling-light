package com.yeelight.yeelib.device.xiaomi;

import android.os.Parcel;
import android.os.Parcelable;
import com.miot.common.abstractdevice.AbstractDevice;
import com.miot.common.device.Device;
import com.miot.common.device.Service;

public class YeelightCeilingDDevice extends AbstractDevice {
    public static final Parcelable.Creator<YeelightCeilingDDevice> CREATOR = new C9681a();
    private static final String DEVICE_TYPE = "YeelightCeilingDDevice";
    public static final String SERVICE_CeilingDService = "urn:schemas-mi-com:service:CeilingD:Service:1";
    private static final String TAG = "YeelightCeilingDDevice";
    public CeilingDService mDeviceService;

    /* renamed from: com.yeelight.yeelib.device.xiaomi.YeelightCeilingDDevice$a */
    static class C9681a implements Parcelable.Creator<YeelightCeilingDDevice> {
        C9681a() {
        }

        /* renamed from: a */
        public YeelightCeilingDDevice createFromParcel(Parcel parcel) {
            return new YeelightCeilingDDevice(parcel, (C9681a) null);
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

    /* synthetic */ YeelightCeilingDDevice(Parcel parcel, C9681a aVar) {
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
        boolean init = init((Device) parcel.readParcelable(Device.class.getClassLoader()));
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(getDevice(), i);
    }
}
