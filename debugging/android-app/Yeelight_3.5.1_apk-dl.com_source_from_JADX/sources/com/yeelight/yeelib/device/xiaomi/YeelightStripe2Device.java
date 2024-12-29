package com.yeelight.yeelib.device.xiaomi;

import android.os.Parcel;
import android.os.Parcelable;
import com.miot.common.abstractdevice.AbstractDevice;
import com.miot.common.device.Device;
import com.miot.common.device.Service;

public class YeelightStripe2Device extends AbstractDevice {
    public static final Parcelable.Creator<YeelightStripe2Device> CREATOR = new C8196a();
    private static final String DEVICE_TYPE = "YeelightStripe2Device";
    public static final String SERVICE_Stripe2Service = "urn:schemas-mi-com:service:Stripe2:Service:1";
    private static final String TAG = "YeelightStripe2Device";
    public Stripe2Service mDeviceService;

    /* renamed from: com.yeelight.yeelib.device.xiaomi.YeelightStripe2Device$a */
    class C8196a implements Parcelable.Creator<YeelightStripe2Device> {
        C8196a() {
        }

        /* renamed from: a */
        public YeelightStripe2Device createFromParcel(Parcel parcel) {
            return new YeelightStripe2Device(parcel, (C8196a) null);
        }

        /* renamed from: b */
        public YeelightStripe2Device[] newArray(int i) {
            return new YeelightStripe2Device[i];
        }
    }

    private YeelightStripe2Device() {
        this.mDeviceService = new Stripe2Service(this);
    }

    private YeelightStripe2Device(Parcel parcel) {
        this.mDeviceService = new Stripe2Service(this);
        readFromParcel(parcel);
    }

    /* synthetic */ YeelightStripe2Device(Parcel parcel, C8196a aVar) {
        this(parcel);
    }

    public static synchronized YeelightStripe2Device create(Device device) {
        YeelightStripe2Device yeelightStripe2Device;
        synchronized (YeelightStripe2Device.class) {
            yeelightStripe2Device = null;
            if ((device.getType().getClassType() + device.getType().getSubType()).equals("YeelightStripe2Device")) {
                YeelightStripe2Device yeelightStripe2Device2 = new YeelightStripe2Device();
                if (yeelightStripe2Device2.init(device)) {
                    yeelightStripe2Device = yeelightStripe2Device2;
                }
            }
        }
        return yeelightStripe2Device;
    }

    private boolean init(Device device) {
        Service service;
        if (device == null || (service = device.getService((String) SERVICE_Stripe2Service)) == null) {
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
