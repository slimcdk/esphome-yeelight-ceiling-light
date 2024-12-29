package com.yeelight.yeelib.device.xiaomi;

import android.os.Parcel;
import android.os.Parcelable;
import com.miot.common.abstractdevice.AbstractDevice;
import com.miot.common.device.Device;
import com.miot.common.device.Service;

public class YeelightBsLamp2Device extends AbstractDevice {
    public static final Parcelable.Creator<YeelightBsLamp2Device> CREATOR = new C9671a();
    private static final String DEVICE_TYPE = "YeelightBsLamp2Device";
    public static final String SERVICE_BsLamp2Service = "urn:schemas-mi-com:service:BsLamp2:Service:1";
    private static final String TAG = "YeelightBsLamp2Device";
    public BsLamp2Service mDeviceService;

    /* renamed from: com.yeelight.yeelib.device.xiaomi.YeelightBsLamp2Device$a */
    static class C9671a implements Parcelable.Creator<YeelightBsLamp2Device> {
        C9671a() {
        }

        /* renamed from: a */
        public YeelightBsLamp2Device createFromParcel(Parcel parcel) {
            return new YeelightBsLamp2Device(parcel, (C9671a) null);
        }

        /* renamed from: b */
        public YeelightBsLamp2Device[] newArray(int i) {
            return new YeelightBsLamp2Device[i];
        }
    }

    private YeelightBsLamp2Device() {
        this.mDeviceService = new BsLamp2Service(this);
    }

    private YeelightBsLamp2Device(Parcel parcel) {
        this.mDeviceService = new BsLamp2Service(this);
        readFromParcel(parcel);
    }

    /* synthetic */ YeelightBsLamp2Device(Parcel parcel, C9671a aVar) {
        this(parcel);
    }

    public static synchronized YeelightBsLamp2Device create(Device device) {
        YeelightBsLamp2Device yeelightBsLamp2Device;
        synchronized (YeelightBsLamp2Device.class) {
            yeelightBsLamp2Device = null;
            if (device.getType().getName().equals("YeelightBsLamp2Device")) {
                YeelightBsLamp2Device yeelightBsLamp2Device2 = new YeelightBsLamp2Device();
                if (yeelightBsLamp2Device2.init(device)) {
                    yeelightBsLamp2Device = yeelightBsLamp2Device2;
                }
            }
        }
        return yeelightBsLamp2Device;
    }

    private boolean init(Device device) {
        Service service;
        if (device == null || (service = device.getService((String) SERVICE_BsLamp2Service)) == null) {
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
