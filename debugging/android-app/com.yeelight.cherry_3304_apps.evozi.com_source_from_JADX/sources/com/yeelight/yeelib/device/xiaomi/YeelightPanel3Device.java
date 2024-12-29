package com.yeelight.yeelib.device.xiaomi;

import android.os.Parcel;
import android.os.Parcelable;
import com.miot.common.abstractdevice.AbstractDevice;
import com.miot.common.device.Device;
import com.miot.common.device.Service;

public class YeelightPanel3Device extends AbstractDevice {
    public static final Parcelable.Creator<YeelightPanel3Device> CREATOR = new C9703a();
    private static final String DEVICE_TYPE = "YeelightPanel3Device";
    public static final String SERVICE_Panel3Service = "urn:schemas-mi-com:service:Panel3:Service:1";
    private static final String TAG = "YeelightPanel3Device";
    public Panel3Service mDeviceService;

    /* renamed from: com.yeelight.yeelib.device.xiaomi.YeelightPanel3Device$a */
    static class C9703a implements Parcelable.Creator<YeelightPanel3Device> {
        C9703a() {
        }

        /* renamed from: a */
        public YeelightPanel3Device createFromParcel(Parcel parcel) {
            return new YeelightPanel3Device(parcel, (C9703a) null);
        }

        /* renamed from: b */
        public YeelightPanel3Device[] newArray(int i) {
            return new YeelightPanel3Device[i];
        }
    }

    private YeelightPanel3Device() {
        this.mDeviceService = new Panel3Service(this);
    }

    private YeelightPanel3Device(Parcel parcel) {
        this.mDeviceService = new Panel3Service(this);
        readFromParcel(parcel);
    }

    /* synthetic */ YeelightPanel3Device(Parcel parcel, C9703a aVar) {
        this(parcel);
    }

    public static synchronized YeelightPanel3Device create(Device device) {
        YeelightPanel3Device yeelightPanel3Device;
        synchronized (YeelightPanel3Device.class) {
            yeelightPanel3Device = null;
            if (device.getType().getName().equals("YeelightPanel3Device")) {
                YeelightPanel3Device yeelightPanel3Device2 = new YeelightPanel3Device();
                if (yeelightPanel3Device2.init(device)) {
                    yeelightPanel3Device = yeelightPanel3Device2;
                }
            }
        }
        return yeelightPanel3Device;
    }

    private boolean init(Device device) {
        Service service;
        if (device == null || (service = device.getService((String) SERVICE_Panel3Service)) == null) {
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
