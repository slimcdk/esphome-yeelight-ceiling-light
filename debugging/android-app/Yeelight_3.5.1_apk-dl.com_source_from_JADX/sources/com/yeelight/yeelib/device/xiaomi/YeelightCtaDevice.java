package com.yeelight.yeelib.device.xiaomi;

import android.os.Parcel;
import android.os.Parcelable;
import com.miot.common.abstractdevice.AbstractDevice;
import com.miot.common.device.Device;
import com.miot.common.device.Service;

public class YeelightCtaDevice extends AbstractDevice {
    public static final Parcelable.Creator<YeelightCtaDevice> CREATOR = new C8180a();
    private static final String DEVICE_TYPE = "YeelightCtaDevice";
    public static final String SERVICE_CtaService = "urn:schemas-mi-com:service:Cta:Service:1";
    private static final String TAG = "YeelightCtaDevice";
    public CtaService mDeviceService;

    /* renamed from: com.yeelight.yeelib.device.xiaomi.YeelightCtaDevice$a */
    class C8180a implements Parcelable.Creator<YeelightCtaDevice> {
        C8180a() {
        }

        /* renamed from: a */
        public YeelightCtaDevice createFromParcel(Parcel parcel) {
            return new YeelightCtaDevice(parcel, (C8180a) null);
        }

        /* renamed from: b */
        public YeelightCtaDevice[] newArray(int i) {
            return new YeelightCtaDevice[i];
        }
    }

    private YeelightCtaDevice() {
        this.mDeviceService = new CtaService(this);
    }

    private YeelightCtaDevice(Parcel parcel) {
        this.mDeviceService = new CtaService(this);
        readFromParcel(parcel);
    }

    /* synthetic */ YeelightCtaDevice(Parcel parcel, C8180a aVar) {
        this(parcel);
    }

    public static synchronized YeelightCtaDevice create(Device device) {
        YeelightCtaDevice yeelightCtaDevice;
        synchronized (YeelightCtaDevice.class) {
            yeelightCtaDevice = null;
            if (device.getType().getName().equals("YeelightCtaDevice")) {
                YeelightCtaDevice yeelightCtaDevice2 = new YeelightCtaDevice();
                if (yeelightCtaDevice2.init(device)) {
                    yeelightCtaDevice = yeelightCtaDevice2;
                }
            }
        }
        return yeelightCtaDevice;
    }

    private boolean init(Device device) {
        Service service;
        if (device == null || (service = device.getService((String) SERVICE_CtaService)) == null) {
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
