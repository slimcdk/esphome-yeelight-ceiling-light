package com.yeelight.yeelib.device.xiaomi;

import android.os.Parcel;
import android.os.Parcelable;
import com.miot.common.abstractdevice.AbstractDevice;
import com.miot.common.device.Device;
import com.miot.common.device.Service;

public class YeelightMonoDevice extends AbstractDevice {
    public static final Parcelable.Creator<YeelightMonoDevice> CREATOR = new C9700a();
    private static final String DEVICE_TYPE = "YeelightMonoDevice";
    public static final String SERVICE_MonoService = "urn:schemas-mi-com:service:Mono:Service:1";
    private static final String TAG = "YeelightMonoDevice";
    public MonoService mDeviceService;

    /* renamed from: com.yeelight.yeelib.device.xiaomi.YeelightMonoDevice$a */
    static class C9700a implements Parcelable.Creator<YeelightMonoDevice> {
        C9700a() {
        }

        /* renamed from: a */
        public YeelightMonoDevice createFromParcel(Parcel parcel) {
            return new YeelightMonoDevice(parcel, (C9700a) null);
        }

        /* renamed from: b */
        public YeelightMonoDevice[] newArray(int i) {
            return new YeelightMonoDevice[i];
        }
    }

    private YeelightMonoDevice() {
        this.mDeviceService = new MonoService(this);
    }

    private YeelightMonoDevice(Parcel parcel) {
        this.mDeviceService = new MonoService(this);
        readFromParcel(parcel);
    }

    /* synthetic */ YeelightMonoDevice(Parcel parcel, C9700a aVar) {
        this(parcel);
    }

    public static synchronized YeelightMonoDevice create(Device device) {
        YeelightMonoDevice yeelightMonoDevice;
        synchronized (YeelightMonoDevice.class) {
            yeelightMonoDevice = null;
            if ((device.getType().getClassType() + device.getType().getSubType()).equals("YeelightMonoDevice")) {
                YeelightMonoDevice yeelightMonoDevice2 = new YeelightMonoDevice();
                if (yeelightMonoDevice2.init(device)) {
                    yeelightMonoDevice = yeelightMonoDevice2;
                }
            }
        }
        return yeelightMonoDevice;
    }

    private boolean init(Device device) {
        Service service;
        if (device == null || (service = device.getService((String) SERVICE_MonoService)) == null) {
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
