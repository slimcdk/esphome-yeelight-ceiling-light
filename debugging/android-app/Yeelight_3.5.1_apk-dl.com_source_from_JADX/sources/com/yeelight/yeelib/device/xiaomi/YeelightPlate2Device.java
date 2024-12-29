package com.yeelight.yeelib.device.xiaomi;

import android.os.Parcel;
import android.os.Parcelable;
import com.miot.common.abstractdevice.AbstractDevice;
import com.miot.common.device.Device;
import com.miot.common.device.Service;

public class YeelightPlate2Device extends AbstractDevice {
    public static final Parcelable.Creator<YeelightPlate2Device> CREATOR = new C8194a();
    private static final String DEVICE_TYPE = "YeelightPlate2Device";
    public static final String SERVICE_Plate2Service = "urn:schemas-mi-com:service:Plate2:Service:1";
    private static final String TAG = "YeelightPlate2Device";
    public Plate2Service mPlate2Service;

    /* renamed from: com.yeelight.yeelib.device.xiaomi.YeelightPlate2Device$a */
    class C8194a implements Parcelable.Creator<YeelightPlate2Device> {
        C8194a() {
        }

        /* renamed from: a */
        public YeelightPlate2Device createFromParcel(Parcel parcel) {
            return new YeelightPlate2Device(parcel, (C8194a) null);
        }

        /* renamed from: b */
        public YeelightPlate2Device[] newArray(int i) {
            return new YeelightPlate2Device[i];
        }
    }

    private YeelightPlate2Device() {
        this.mPlate2Service = new Plate2Service(this);
    }

    private YeelightPlate2Device(Parcel parcel) {
        this.mPlate2Service = new Plate2Service(this);
        readFromParcel(parcel);
    }

    /* synthetic */ YeelightPlate2Device(Parcel parcel, C8194a aVar) {
        this(parcel);
    }

    public static synchronized YeelightPlate2Device create(Device device) {
        YeelightPlate2Device yeelightPlate2Device;
        synchronized (YeelightPlate2Device.class) {
            yeelightPlate2Device = null;
            if (device.getType().getName().equals("YeelightPlate2Device")) {
                YeelightPlate2Device yeelightPlate2Device2 = new YeelightPlate2Device();
                if (yeelightPlate2Device2.init(device)) {
                    yeelightPlate2Device = yeelightPlate2Device2;
                }
            }
        }
        return yeelightPlate2Device;
    }

    private boolean init(Device device) {
        Service service;
        if (device == null || (service = device.getService((String) SERVICE_Plate2Service)) == null) {
            return false;
        }
        this.mPlate2Service.setService(service);
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
