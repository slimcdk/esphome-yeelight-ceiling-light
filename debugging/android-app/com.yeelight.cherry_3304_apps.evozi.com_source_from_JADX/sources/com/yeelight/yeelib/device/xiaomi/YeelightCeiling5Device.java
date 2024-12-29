package com.yeelight.yeelib.device.xiaomi;

import android.os.Parcel;
import android.os.Parcelable;
import com.miot.common.abstractdevice.AbstractDevice;
import com.miot.common.device.Device;
import com.miot.common.device.Service;

public class YeelightCeiling5Device extends AbstractDevice {
    public static final Parcelable.Creator<YeelightCeiling5Device> CREATOR = new C9679a();
    private static final String DEVICE_TYPE = "YeelightCeiling5Device";
    public static final String SERVICE_Ceiling5Service = "urn:schemas-mi-com:service:Ceiling5:Service:1";
    private static final String TAG = "YeelightCeiling5Device";
    public Ceiling5Service mDeviceService;

    /* renamed from: com.yeelight.yeelib.device.xiaomi.YeelightCeiling5Device$a */
    static class C9679a implements Parcelable.Creator<YeelightCeiling5Device> {
        C9679a() {
        }

        /* renamed from: a */
        public YeelightCeiling5Device createFromParcel(Parcel parcel) {
            return new YeelightCeiling5Device(parcel, (C9679a) null);
        }

        /* renamed from: b */
        public YeelightCeiling5Device[] newArray(int i) {
            return new YeelightCeiling5Device[i];
        }
    }

    private YeelightCeiling5Device() {
        this.mDeviceService = new Ceiling5Service(this);
    }

    private YeelightCeiling5Device(Parcel parcel) {
        this.mDeviceService = new Ceiling5Service(this);
        readFromParcel(parcel);
    }

    /* synthetic */ YeelightCeiling5Device(Parcel parcel, C9679a aVar) {
        this(parcel);
    }

    public static synchronized YeelightCeiling5Device create(Device device) {
        YeelightCeiling5Device yeelightCeiling5Device;
        synchronized (YeelightCeiling5Device.class) {
            yeelightCeiling5Device = null;
            if (device.getType().getName().equals("YeelightCeiling5Device")) {
                YeelightCeiling5Device yeelightCeiling5Device2 = new YeelightCeiling5Device();
                if (yeelightCeiling5Device2.init(device)) {
                    yeelightCeiling5Device = yeelightCeiling5Device2;
                }
            }
        }
        return yeelightCeiling5Device;
    }

    private boolean init(Device device) {
        Service service;
        if (device == null || (service = device.getService((String) SERVICE_Ceiling5Service)) == null) {
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
