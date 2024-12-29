package com.yeelight.yeelib.device.xiaomi;

import android.os.Parcel;
import android.os.Parcelable;
import com.miot.common.abstractdevice.AbstractDevice;
import com.miot.common.device.Device;
import com.miot.common.device.Service;

public class YeelightCeiling2Device extends AbstractDevice {
    public static final Parcelable.Creator<YeelightCeiling2Device> CREATOR = new C8166a();
    private static final String DEVICE_TYPE = "YeelightCeiling2Device";
    public static final String SERVICE_Ceiling2Service = "urn:schemas-mi-com:service:Ceiling2:Service:1";
    private static final String TAG = "YeelightCeiling2Device";
    public Ceiling2Service mDeviceService;

    /* renamed from: com.yeelight.yeelib.device.xiaomi.YeelightCeiling2Device$a */
    class C8166a implements Parcelable.Creator<YeelightCeiling2Device> {
        C8166a() {
        }

        /* renamed from: a */
        public YeelightCeiling2Device createFromParcel(Parcel parcel) {
            return new YeelightCeiling2Device(parcel, (C8166a) null);
        }

        /* renamed from: b */
        public YeelightCeiling2Device[] newArray(int i) {
            return new YeelightCeiling2Device[i];
        }
    }

    private YeelightCeiling2Device() {
        this.mDeviceService = new Ceiling2Service(this);
    }

    private YeelightCeiling2Device(Parcel parcel) {
        this.mDeviceService = new Ceiling2Service(this);
        readFromParcel(parcel);
    }

    /* synthetic */ YeelightCeiling2Device(Parcel parcel, C8166a aVar) {
        this(parcel);
    }

    public static synchronized YeelightCeiling2Device create(Device device) {
        YeelightCeiling2Device yeelightCeiling2Device;
        synchronized (YeelightCeiling2Device.class) {
            yeelightCeiling2Device = null;
            if ((device.getType().getClassType() + device.getType().getSubType()).equals("YeelightCeiling2Device")) {
                YeelightCeiling2Device yeelightCeiling2Device2 = new YeelightCeiling2Device();
                if (yeelightCeiling2Device2.init(device)) {
                    yeelightCeiling2Device = yeelightCeiling2Device2;
                }
            }
        }
        return yeelightCeiling2Device;
    }

    private boolean init(Device device) {
        Service service;
        if (device == null || (service = device.getService((String) SERVICE_Ceiling2Service)) == null) {
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
