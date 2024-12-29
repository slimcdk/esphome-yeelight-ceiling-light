package com.yeelight.yeelib.device.xiaomi;

import android.os.Parcel;
import android.os.Parcelable;
import com.miot.common.abstractdevice.AbstractDevice;
import com.miot.common.device.Device;
import com.miot.common.device.Service;

public class YeelightStripe4Device extends AbstractDevice {
    public static final Parcelable.Creator<YeelightStripe4Device> CREATOR = new C9706a();
    private static final String DEVICE_TYPE = "YeelightStripe4Device";
    public static final String SERVICE_Stripe4Service = "urn:schemas-mi-com:service:Stripe4:Service:1";
    private static final String TAG = "YeelightStripe4Device";
    public Stripe4Service mDeviceService;

    /* renamed from: com.yeelight.yeelib.device.xiaomi.YeelightStripe4Device$a */
    static class C9706a implements Parcelable.Creator<YeelightStripe4Device> {
        C9706a() {
        }

        /* renamed from: a */
        public YeelightStripe4Device createFromParcel(Parcel parcel) {
            return new YeelightStripe4Device(parcel, (C9706a) null);
        }

        /* renamed from: b */
        public YeelightStripe4Device[] newArray(int i) {
            return new YeelightStripe4Device[i];
        }
    }

    private YeelightStripe4Device() {
        this.mDeviceService = new Stripe4Service(this);
    }

    private YeelightStripe4Device(Parcel parcel) {
        this.mDeviceService = new Stripe4Service(this);
        readFromParcel(parcel);
    }

    /* synthetic */ YeelightStripe4Device(Parcel parcel, C9706a aVar) {
        this(parcel);
    }

    public static synchronized YeelightStripe4Device create(Device device) {
        YeelightStripe4Device yeelightStripe4Device;
        synchronized (YeelightStripe4Device.class) {
            yeelightStripe4Device = null;
            if (device.getType().getName().equals("YeelightStripe4Device")) {
                YeelightStripe4Device yeelightStripe4Device2 = new YeelightStripe4Device();
                if (yeelightStripe4Device2.init(device)) {
                    yeelightStripe4Device = yeelightStripe4Device2;
                }
            }
        }
        return yeelightStripe4Device;
    }

    private boolean init(Device device) {
        Service service;
        if (device == null || (service = device.getService((String) SERVICE_Stripe4Service)) == null) {
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
