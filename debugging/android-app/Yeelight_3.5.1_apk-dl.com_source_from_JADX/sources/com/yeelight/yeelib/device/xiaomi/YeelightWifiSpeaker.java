package com.yeelight.yeelib.device.xiaomi;

import android.os.Parcel;
import android.os.Parcelable;
import com.miot.common.abstractdevice.AbstractDevice;
import com.miot.common.device.Device;
import com.miot.common.device.Service;

public class YeelightWifiSpeaker extends AbstractDevice {
    public static final Parcelable.Creator<YeelightWifiSpeaker> CREATOR = new C8200a();
    private static final String DEVICE_TYPE = "YeelightWifiSpeaker";
    public static final String SERVICE_WifiSpeakerService = "urn:schemas-mi-com:service:WifiSpeaker:Service:1";
    private static final String TAG = "YeelightWifiSpeaker";
    public WifiSpeakerService mDeviceService;

    /* renamed from: com.yeelight.yeelib.device.xiaomi.YeelightWifiSpeaker$a */
    class C8200a implements Parcelable.Creator<YeelightWifiSpeaker> {
        C8200a() {
        }

        /* renamed from: a */
        public YeelightWifiSpeaker createFromParcel(Parcel parcel) {
            return new YeelightWifiSpeaker(parcel, (C8200a) null);
        }

        /* renamed from: b */
        public YeelightWifiSpeaker[] newArray(int i) {
            return new YeelightWifiSpeaker[i];
        }
    }

    private YeelightWifiSpeaker() {
        this.mDeviceService = new WifiSpeakerService(this);
    }

    private YeelightWifiSpeaker(Parcel parcel) {
        this.mDeviceService = new WifiSpeakerService(this);
        readFromParcel(parcel);
    }

    /* synthetic */ YeelightWifiSpeaker(Parcel parcel, C8200a aVar) {
        this(parcel);
    }

    public static synchronized YeelightWifiSpeaker create(Device device) {
        YeelightWifiSpeaker yeelightWifiSpeaker;
        synchronized (YeelightWifiSpeaker.class) {
            yeelightWifiSpeaker = null;
            if (device.getType().getName().equals("YeelightWifiSpeaker")) {
                YeelightWifiSpeaker yeelightWifiSpeaker2 = new YeelightWifiSpeaker();
                if (yeelightWifiSpeaker2.init(device)) {
                    yeelightWifiSpeaker = yeelightWifiSpeaker2;
                }
            }
        }
        return yeelightWifiSpeaker;
    }

    private boolean init(Device device) {
        Service service;
        if (device == null || (service = device.getService((String) SERVICE_WifiSpeakerService)) == null) {
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
