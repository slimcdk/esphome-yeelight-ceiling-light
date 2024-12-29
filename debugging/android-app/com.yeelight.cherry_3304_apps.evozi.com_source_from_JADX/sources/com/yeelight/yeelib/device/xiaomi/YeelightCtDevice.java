package com.yeelight.yeelib.device.xiaomi;

import android.os.Parcel;
import android.os.Parcelable;
import com.miot.common.abstractdevice.AbstractDevice;
import com.miot.common.device.Device;
import com.miot.common.device.Service;

public class YeelightCtDevice extends AbstractDevice {
    public static final Parcelable.Creator<YeelightCtDevice> CREATOR = new C9689a();
    private static final String DEVICE_TYPE = "YeelightCtDevice";
    public static final String SERVICE_CtService = "urn:schemas-mi-com:service:Ct:Service:1";
    private static final String TAG = "YeelightCtDevice";
    public CtService mDeviceService;

    /* renamed from: com.yeelight.yeelib.device.xiaomi.YeelightCtDevice$a */
    static class C9689a implements Parcelable.Creator<YeelightCtDevice> {
        C9689a() {
        }

        /* renamed from: a */
        public YeelightCtDevice createFromParcel(Parcel parcel) {
            return new YeelightCtDevice(parcel, (C9689a) null);
        }

        /* renamed from: b */
        public YeelightCtDevice[] newArray(int i) {
            return new YeelightCtDevice[i];
        }
    }

    private YeelightCtDevice() {
        this.mDeviceService = new CtService(this);
    }

    private YeelightCtDevice(Parcel parcel) {
        this.mDeviceService = new CtService(this);
        readFromParcel(parcel);
    }

    /* synthetic */ YeelightCtDevice(Parcel parcel, C9689a aVar) {
        this(parcel);
    }

    public static synchronized YeelightCtDevice create(Device device) {
        YeelightCtDevice yeelightCtDevice;
        synchronized (YeelightCtDevice.class) {
            yeelightCtDevice = null;
            if (device.getType().getName().equals("YeelightCtDevice")) {
                YeelightCtDevice yeelightCtDevice2 = new YeelightCtDevice();
                if (yeelightCtDevice2.init(device)) {
                    yeelightCtDevice = yeelightCtDevice2;
                }
            }
        }
        return yeelightCtDevice;
    }

    private boolean init(Device device) {
        Service service;
        if (device == null || (service = device.getService((String) SERVICE_CtService)) == null) {
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
