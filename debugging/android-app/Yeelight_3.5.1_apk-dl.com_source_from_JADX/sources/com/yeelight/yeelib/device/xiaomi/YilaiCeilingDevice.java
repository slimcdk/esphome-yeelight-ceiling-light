package com.yeelight.yeelib.device.xiaomi;

import android.os.Parcel;
import android.os.Parcelable;
import com.miot.common.abstractdevice.AbstractDevice;
import com.miot.common.device.Device;
import com.miot.common.device.Service;

public class YilaiCeilingDevice extends AbstractDevice {
    public static final Parcelable.Creator<YilaiCeilingDevice> CREATOR = new C8201a();
    private static final String DEVICE_TYPE = "YilaiCeilingDevice";
    public static final String SERVICE_YilaiCeilingService = "urn:schemas-mi-com:service:YilaiCeiling:Service:1";
    private static final String TAG = "YilaiCeilingDevice";
    public YilaiCeilingService mDeviceService;

    /* renamed from: com.yeelight.yeelib.device.xiaomi.YilaiCeilingDevice$a */
    class C8201a implements Parcelable.Creator<YilaiCeilingDevice> {
        C8201a() {
        }

        /* renamed from: a */
        public YilaiCeilingDevice createFromParcel(Parcel parcel) {
            return new YilaiCeilingDevice(parcel, (C8201a) null);
        }

        /* renamed from: b */
        public YilaiCeilingDevice[] newArray(int i) {
            return new YilaiCeilingDevice[i];
        }
    }

    private YilaiCeilingDevice() {
        this.mDeviceService = new YilaiCeilingService(this);
    }

    private YilaiCeilingDevice(Parcel parcel) {
        this.mDeviceService = new YilaiCeilingService(this);
        readFromParcel(parcel);
    }

    /* synthetic */ YilaiCeilingDevice(Parcel parcel, C8201a aVar) {
        this(parcel);
    }

    public static synchronized YilaiCeilingDevice create(Device device) {
        YilaiCeilingDevice yilaiCeilingDevice;
        synchronized (YilaiCeilingDevice.class) {
            yilaiCeilingDevice = null;
            if ((device.getType().getClassType() + device.getType().getSubType()).equals("YilaiCeilingDevice")) {
                YilaiCeilingDevice yilaiCeilingDevice2 = new YilaiCeilingDevice();
                if (yilaiCeilingDevice2.init(device)) {
                    yilaiCeilingDevice = yilaiCeilingDevice2;
                }
            }
        }
        return yilaiCeilingDevice;
    }

    private boolean init(Device device) {
        Service service;
        if (device == null || (service = device.getService((String) SERVICE_YilaiCeilingService)) == null) {
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
