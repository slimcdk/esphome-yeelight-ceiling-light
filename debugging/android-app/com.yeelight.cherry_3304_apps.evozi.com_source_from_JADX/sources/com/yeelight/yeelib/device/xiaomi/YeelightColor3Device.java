package com.yeelight.yeelib.device.xiaomi;

import android.os.Parcel;
import android.os.Parcelable;
import com.miot.common.abstractdevice.AbstractDevice;
import com.miot.common.device.Device;
import com.miot.common.device.Service;

public class YeelightColor3Device extends AbstractDevice {
    public static final Parcelable.Creator<YeelightColor3Device> CREATOR = new C9685a();
    private static final String DEVICE_TYPE = "YeelightColor3Device";
    public static final String SERVICE_Color3Service = "urn:schemas-mi-com:service:Color3:Service:1";
    private static final String TAG = "YeelightColor3Device";
    public Color3Service mDeviceService;

    /* renamed from: com.yeelight.yeelib.device.xiaomi.YeelightColor3Device$a */
    static class C9685a implements Parcelable.Creator<YeelightColor3Device> {
        C9685a() {
        }

        /* renamed from: a */
        public YeelightColor3Device createFromParcel(Parcel parcel) {
            return new YeelightColor3Device(parcel, (C9685a) null);
        }

        /* renamed from: b */
        public YeelightColor3Device[] newArray(int i) {
            return new YeelightColor3Device[i];
        }
    }

    private YeelightColor3Device() {
        this.mDeviceService = new Color3Service(this);
    }

    private YeelightColor3Device(Parcel parcel) {
        this.mDeviceService = new Color3Service(this);
        readFromParcel(parcel);
    }

    /* synthetic */ YeelightColor3Device(Parcel parcel, C9685a aVar) {
        this(parcel);
    }

    public static synchronized YeelightColor3Device create(Device device) {
        YeelightColor3Device yeelightColor3Device;
        synchronized (YeelightColor3Device.class) {
            yeelightColor3Device = null;
            if (device.getType().getName().equals("YeelightColor3Device")) {
                YeelightColor3Device yeelightColor3Device2 = new YeelightColor3Device();
                if (yeelightColor3Device2.init(device)) {
                    yeelightColor3Device = yeelightColor3Device2;
                }
            }
        }
        return yeelightColor3Device;
    }

    private boolean init(Device device) {
        Service service;
        if (device == null || (service = device.getService((String) SERVICE_Color3Service)) == null) {
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
