package com.yeelight.yeelib.device.xiaomi;

import android.os.Parcel;
import android.os.Parcelable;
import com.miot.common.abstractdevice.AbstractDevice;
import com.miot.common.device.Device;
import com.miot.common.device.Service;

public class YeelightStripeDevice extends AbstractDevice {
    public static final Parcelable.Creator<YeelightStripeDevice> CREATOR = new C8199a();
    private static final String DEVICE_TYPE = "YeelightStripeDevice";
    public static final String SERVICE_StripeService = "urn:schemas-mi-com:service:Stripe:Service:1";
    private static final String TAG = "YeelightStripeDevice";
    public StripeService mDeviceService;

    /* renamed from: com.yeelight.yeelib.device.xiaomi.YeelightStripeDevice$a */
    class C8199a implements Parcelable.Creator<YeelightStripeDevice> {
        C8199a() {
        }

        /* renamed from: a */
        public YeelightStripeDevice createFromParcel(Parcel parcel) {
            return new YeelightStripeDevice(parcel, (C8199a) null);
        }

        /* renamed from: b */
        public YeelightStripeDevice[] newArray(int i) {
            return new YeelightStripeDevice[i];
        }
    }

    private YeelightStripeDevice() {
        this.mDeviceService = new StripeService(this);
    }

    private YeelightStripeDevice(Parcel parcel) {
        this.mDeviceService = new StripeService(this);
        readFromParcel(parcel);
    }

    /* synthetic */ YeelightStripeDevice(Parcel parcel, C8199a aVar) {
        this(parcel);
    }

    public static synchronized YeelightStripeDevice create(Device device) {
        YeelightStripeDevice yeelightStripeDevice;
        synchronized (YeelightStripeDevice.class) {
            yeelightStripeDevice = null;
            if ((device.getType().getClassType() + device.getType().getSubType()).equals("YeelightStripeDevice")) {
                YeelightStripeDevice yeelightStripeDevice2 = new YeelightStripeDevice();
                if (yeelightStripeDevice2.init(device)) {
                    yeelightStripeDevice = yeelightStripeDevice2;
                }
            }
        }
        return yeelightStripeDevice;
    }

    private boolean init(Device device) {
        Service service;
        if (device == null || (service = device.getService((String) SERVICE_StripeService)) == null) {
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
