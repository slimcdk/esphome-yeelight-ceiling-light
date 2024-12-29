package com.yeelight.yeelib.device.xiaomi;

import android.os.Parcel;
import android.os.Parcelable;
import com.miot.common.abstractdevice.AbstractDevice;
import com.miot.common.device.Device;
import com.miot.common.device.Service;

public class YeelightCeiling35Device extends AbstractDevice {
    public static final Parcelable.Creator<YeelightCeiling35Device> CREATOR = new C8167a();
    private static final String DEVICE_TYPE = "YeelightCeiling35Device";
    public static final String SERVICE_Ceiling35Service = "urn:schemas-mi-com:service:Ceiling35:Service:1";
    private static final String TAG = "YeelightCeiling35Device";
    public Ceiling35Service mCeiling35Service;

    /* renamed from: com.yeelight.yeelib.device.xiaomi.YeelightCeiling35Device$a */
    class C8167a implements Parcelable.Creator<YeelightCeiling35Device> {
        C8167a() {
        }

        /* renamed from: a */
        public YeelightCeiling35Device createFromParcel(Parcel parcel) {
            return new YeelightCeiling35Device(parcel, (C8167a) null);
        }

        /* renamed from: b */
        public YeelightCeiling35Device[] newArray(int i) {
            return new YeelightCeiling35Device[i];
        }
    }

    private YeelightCeiling35Device() {
        this.mCeiling35Service = new Ceiling35Service(this);
    }

    private YeelightCeiling35Device(Parcel parcel) {
        this.mCeiling35Service = new Ceiling35Service(this);
        readFromParcel(parcel);
    }

    /* synthetic */ YeelightCeiling35Device(Parcel parcel, C8167a aVar) {
        this(parcel);
    }

    public static synchronized YeelightCeiling35Device create(Device device) {
        YeelightCeiling35Device yeelightCeiling35Device;
        synchronized (YeelightCeiling35Device.class) {
            yeelightCeiling35Device = null;
            if (device.getType().getName().equals("YeelightCeiling35Device")) {
                YeelightCeiling35Device yeelightCeiling35Device2 = new YeelightCeiling35Device();
                if (yeelightCeiling35Device2.init(device)) {
                    yeelightCeiling35Device = yeelightCeiling35Device2;
                }
            }
        }
        return yeelightCeiling35Device;
    }

    private boolean init(Device device) {
        Service service;
        if (device == null || (service = device.getService((String) SERVICE_Ceiling35Service)) == null) {
            return false;
        }
        this.mCeiling35Service.setService(service);
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
