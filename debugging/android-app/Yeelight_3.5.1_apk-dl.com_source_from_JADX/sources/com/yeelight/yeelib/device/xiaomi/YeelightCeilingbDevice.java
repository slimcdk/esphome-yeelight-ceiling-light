package com.yeelight.yeelib.device.xiaomi;

import android.os.Parcel;
import android.os.Parcelable;
import com.miot.common.abstractdevice.AbstractDevice;
import com.miot.common.device.Device;
import com.miot.common.device.Service;

public class YeelightCeilingbDevice extends AbstractDevice {
    public static final Parcelable.Creator<YeelightCeilingbDevice> CREATOR = new C8173a();
    private static final String DEVICE_TYPE = "YeelightCeilingbDevice";
    public static final String SERVICE_CeilingbService = "urn:schemas-mi-com:service:Ceilingb:Service:1";
    private static final String TAG = "YeelightCeilingbDevice";
    public CeilingbService mDeviceService;

    /* renamed from: com.yeelight.yeelib.device.xiaomi.YeelightCeilingbDevice$a */
    class C8173a implements Parcelable.Creator<YeelightCeilingbDevice> {
        C8173a() {
        }

        /* renamed from: a */
        public YeelightCeilingbDevice createFromParcel(Parcel parcel) {
            return new YeelightCeilingbDevice(parcel, (C8173a) null);
        }

        /* renamed from: b */
        public YeelightCeilingbDevice[] newArray(int i) {
            return new YeelightCeilingbDevice[i];
        }
    }

    private YeelightCeilingbDevice() {
        this.mDeviceService = new CeilingbService(this);
    }

    private YeelightCeilingbDevice(Parcel parcel) {
        this.mDeviceService = new CeilingbService(this);
        readFromParcel(parcel);
    }

    /* synthetic */ YeelightCeilingbDevice(Parcel parcel, C8173a aVar) {
        this(parcel);
    }

    public static synchronized YeelightCeilingbDevice create(Device device) {
        YeelightCeilingbDevice yeelightCeilingbDevice;
        synchronized (YeelightCeilingbDevice.class) {
            yeelightCeilingbDevice = null;
            if (device.getType().getName().equals("YeelightCeilingbDevice")) {
                YeelightCeilingbDevice yeelightCeilingbDevice2 = new YeelightCeilingbDevice();
                if (yeelightCeilingbDevice2.init(device)) {
                    yeelightCeilingbDevice = yeelightCeilingbDevice2;
                }
            }
        }
        return yeelightCeilingbDevice;
    }

    private boolean init(Device device) {
        Service service;
        if (device == null || (service = device.getService((String) SERVICE_CeilingbService)) == null) {
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
