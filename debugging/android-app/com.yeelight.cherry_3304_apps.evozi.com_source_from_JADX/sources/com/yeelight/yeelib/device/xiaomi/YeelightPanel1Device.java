package com.yeelight.yeelib.device.xiaomi;

import android.os.Parcel;
import android.os.Parcelable;
import com.miot.common.abstractdevice.AbstractDevice;
import com.miot.common.device.Device;
import com.miot.common.device.Service;

public class YeelightPanel1Device extends AbstractDevice {
    public static final Parcelable.Creator<YeelightPanel1Device> CREATOR = new C9702a();
    private static final String DEVICE_TYPE = "YeelightPanel1Device";
    public static final String SERVICE_Panel1Service = "urn:schemas-mi-com:service:Panel1:Service:1";
    private static final String TAG = "YeelightPanel1Device";
    public Panel1Service mDeviceService;

    /* renamed from: com.yeelight.yeelib.device.xiaomi.YeelightPanel1Device$a */
    static class C9702a implements Parcelable.Creator<YeelightPanel1Device> {
        C9702a() {
        }

        /* renamed from: a */
        public YeelightPanel1Device createFromParcel(Parcel parcel) {
            return new YeelightPanel1Device(parcel, (C9702a) null);
        }

        /* renamed from: b */
        public YeelightPanel1Device[] newArray(int i) {
            return new YeelightPanel1Device[i];
        }
    }

    private YeelightPanel1Device() {
        this.mDeviceService = new Panel1Service(this);
    }

    private YeelightPanel1Device(Parcel parcel) {
        this.mDeviceService = new Panel1Service(this);
        readFromParcel(parcel);
    }

    /* synthetic */ YeelightPanel1Device(Parcel parcel, C9702a aVar) {
        this(parcel);
    }

    public static synchronized YeelightPanel1Device create(Device device) {
        YeelightPanel1Device yeelightPanel1Device;
        synchronized (YeelightPanel1Device.class) {
            yeelightPanel1Device = null;
            if (device.getType().getName().equals("YeelightPanel1Device")) {
                YeelightPanel1Device yeelightPanel1Device2 = new YeelightPanel1Device();
                if (yeelightPanel1Device2.init(device)) {
                    yeelightPanel1Device = yeelightPanel1Device2;
                }
            }
        }
        return yeelightPanel1Device;
    }

    private boolean init(Device device) {
        Service service;
        if (device == null || (service = device.getService((String) SERVICE_Panel1Service)) == null) {
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
