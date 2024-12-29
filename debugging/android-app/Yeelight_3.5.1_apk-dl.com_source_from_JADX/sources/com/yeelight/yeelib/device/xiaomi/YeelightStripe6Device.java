package com.yeelight.yeelib.device.xiaomi;

import android.os.Parcel;
import android.os.Parcelable;
import com.miot.common.abstractdevice.AbstractDevice;
import com.miot.common.device.Device;
import com.miot.common.device.Service;

public class YeelightStripe6Device extends AbstractDevice {
    public static final Parcelable.Creator<YeelightStripe6Device> CREATOR = new C8198a();
    private static final String DEVICE_TYPE = "YeelightStripe6Device";
    public static final String SERVICE_Stripe6Service = "urn:schemas-mi-com:service:Stripe6:Service:1";
    private static final String TAG = "YeelightStripe6Device";
    public Stripe6Service mDeviceService;

    /* renamed from: com.yeelight.yeelib.device.xiaomi.YeelightStripe6Device$a */
    class C8198a implements Parcelable.Creator<YeelightStripe6Device> {
        C8198a() {
        }

        /* renamed from: a */
        public YeelightStripe6Device createFromParcel(Parcel parcel) {
            return new YeelightStripe6Device(parcel, (C8198a) null);
        }

        /* renamed from: b */
        public YeelightStripe6Device[] newArray(int i) {
            return new YeelightStripe6Device[i];
        }
    }

    private YeelightStripe6Device() {
        this.mDeviceService = new Stripe6Service(this);
    }

    private YeelightStripe6Device(Parcel parcel) {
        this.mDeviceService = new Stripe6Service(this);
        readFromParcel(parcel);
    }

    /* synthetic */ YeelightStripe6Device(Parcel parcel, C8198a aVar) {
        this(parcel);
    }

    public static synchronized YeelightStripe6Device create(Device device) {
        YeelightStripe6Device yeelightStripe6Device;
        synchronized (YeelightStripe6Device.class) {
            yeelightStripe6Device = null;
            if (device.getType().getName().equals("YeelightStripe6Device")) {
                YeelightStripe6Device yeelightStripe6Device2 = new YeelightStripe6Device();
                if (yeelightStripe6Device2.init(device)) {
                    yeelightStripe6Device = yeelightStripe6Device2;
                }
            }
        }
        return yeelightStripe6Device;
    }

    private boolean init(Device device) {
        Service service;
        if (device == null || (service = device.getService((String) SERVICE_Stripe6Service)) == null) {
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
