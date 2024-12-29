package com.yeelight.yeelib.device.xiaomi;

import android.os.Parcel;
import android.os.Parcelable;
import com.miot.common.abstractdevice.AbstractDevice;
import com.miot.common.device.Device;
import com.miot.common.device.Service;

public class YeelightColorcDevice extends AbstractDevice {
    public static final Parcelable.Creator<YeelightColorcDevice> CREATOR = new C8178a();
    private static final String DEVICE_TYPE = "YeelightColorcDevice";
    public static final String SERVICE_ColorcService = "urn:schemas-mi-com:service:Colorc:Service:1";
    private static final String TAG = "YeelightColorcDevice";
    public ColorcService mDeviceService;

    /* renamed from: com.yeelight.yeelib.device.xiaomi.YeelightColorcDevice$a */
    class C8178a implements Parcelable.Creator<YeelightColorcDevice> {
        C8178a() {
        }

        /* renamed from: a */
        public YeelightColorcDevice createFromParcel(Parcel parcel) {
            return new YeelightColorcDevice(parcel, (C8178a) null);
        }

        /* renamed from: b */
        public YeelightColorcDevice[] newArray(int i) {
            return new YeelightColorcDevice[i];
        }
    }

    private YeelightColorcDevice() {
        this.mDeviceService = new ColorcService(this);
    }

    private YeelightColorcDevice(Parcel parcel) {
        this.mDeviceService = new ColorcService(this);
        readFromParcel(parcel);
    }

    /* synthetic */ YeelightColorcDevice(Parcel parcel, C8178a aVar) {
        this(parcel);
    }

    public static synchronized YeelightColorcDevice create(Device device) {
        YeelightColorcDevice yeelightColorcDevice;
        synchronized (YeelightColorcDevice.class) {
            yeelightColorcDevice = null;
            if (device.getType().getName().equals("YeelightColorcDevice")) {
                YeelightColorcDevice yeelightColorcDevice2 = new YeelightColorcDevice();
                if (yeelightColorcDevice2.init(device)) {
                    yeelightColorcDevice = yeelightColorcDevice2;
                }
            }
        }
        return yeelightColorcDevice;
    }

    private boolean init(Device device) {
        Service service;
        if (device == null || (service = device.getService((String) SERVICE_ColorcService)) == null) {
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
