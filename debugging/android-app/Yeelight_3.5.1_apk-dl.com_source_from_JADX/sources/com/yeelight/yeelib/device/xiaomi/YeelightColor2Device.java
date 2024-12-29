package com.yeelight.yeelib.device.xiaomi;

import android.os.Parcel;
import android.os.Parcelable;
import com.miot.common.abstractdevice.AbstractDevice;
import com.miot.common.device.Device;
import com.miot.common.device.Service;

public class YeelightColor2Device extends AbstractDevice {
    public static final Parcelable.Creator<YeelightColor2Device> CREATOR = new C8174a();
    private static final String DEVICE_TYPE = "YeelightColor2Device";
    public static final String SERVICE_Color2Service = "urn:schemas-mi-com:service:Color2:Service:1";
    private static final String TAG = "YeelightColor2Device";
    public Color2Service mColor2Service;

    /* renamed from: com.yeelight.yeelib.device.xiaomi.YeelightColor2Device$a */
    class C8174a implements Parcelable.Creator<YeelightColor2Device> {
        C8174a() {
        }

        /* renamed from: a */
        public YeelightColor2Device createFromParcel(Parcel parcel) {
            return new YeelightColor2Device(parcel, (C8174a) null);
        }

        /* renamed from: b */
        public YeelightColor2Device[] newArray(int i) {
            return new YeelightColor2Device[i];
        }
    }

    private YeelightColor2Device() {
        this.mColor2Service = new Color2Service(this);
    }

    private YeelightColor2Device(Parcel parcel) {
        this.mColor2Service = new Color2Service(this);
        readFromParcel(parcel);
    }

    /* synthetic */ YeelightColor2Device(Parcel parcel, C8174a aVar) {
        this(parcel);
    }

    public static synchronized YeelightColor2Device create(Device device) {
        YeelightColor2Device yeelightColor2Device;
        synchronized (YeelightColor2Device.class) {
            yeelightColor2Device = null;
            if ((device.getType().getClassType() + device.getType().getSubType()).equals("YeelightColor2Device")) {
                YeelightColor2Device yeelightColor2Device2 = new YeelightColor2Device();
                if (yeelightColor2Device2.init(device)) {
                    yeelightColor2Device = yeelightColor2Device2;
                }
            }
        }
        return yeelightColor2Device;
    }

    private boolean init(Device device) {
        Service service;
        if (device == null || (service = device.getService((String) SERVICE_Color2Service)) == null) {
            return false;
        }
        this.mColor2Service.setService(service);
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
