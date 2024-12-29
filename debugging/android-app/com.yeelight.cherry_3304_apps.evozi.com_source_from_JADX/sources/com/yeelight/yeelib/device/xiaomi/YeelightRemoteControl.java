package com.yeelight.yeelib.device.xiaomi;

import android.os.Parcel;
import android.os.Parcelable;
import com.miot.common.abstractdevice.AbstractDevice;
import com.miot.common.device.Device;
import com.miot.common.device.Service;

public class YeelightRemoteControl extends AbstractDevice {
    public static final Parcelable.Creator<YeelightRemoteControl> CREATOR = new C9704a();
    private static final String DEVICE_TYPE = "YeelightRemoteControl";
    public static final String SERVICE_RemoteControlService = "urn:schemas-mi-com:service:RemoteControl:Service:1";
    private static final String TAG = "YeelightRemoteControl";
    public RemoteControlService mDeviceService;

    /* renamed from: com.yeelight.yeelib.device.xiaomi.YeelightRemoteControl$a */
    static class C9704a implements Parcelable.Creator<YeelightRemoteControl> {
        C9704a() {
        }

        /* renamed from: a */
        public YeelightRemoteControl createFromParcel(Parcel parcel) {
            return new YeelightRemoteControl(parcel, (C9704a) null);
        }

        /* renamed from: b */
        public YeelightRemoteControl[] newArray(int i) {
            return new YeelightRemoteControl[i];
        }
    }

    private YeelightRemoteControl() {
        this.mDeviceService = new RemoteControlService(this);
    }

    private YeelightRemoteControl(Parcel parcel) {
        this.mDeviceService = new RemoteControlService(this);
        readFromParcel(parcel);
    }

    /* synthetic */ YeelightRemoteControl(Parcel parcel, C9704a aVar) {
        this(parcel);
    }

    public static synchronized YeelightRemoteControl create(Device device) {
        YeelightRemoteControl yeelightRemoteControl;
        synchronized (YeelightRemoteControl.class) {
            yeelightRemoteControl = null;
            if ((device.getType().getClassType() + device.getType().getSubType()).equals("YeelightRemoteControl")) {
                YeelightRemoteControl yeelightRemoteControl2 = new YeelightRemoteControl();
                if (yeelightRemoteControl2.init(device)) {
                    yeelightRemoteControl = yeelightRemoteControl2;
                }
            }
        }
        return yeelightRemoteControl;
    }

    private boolean init(Device device) {
        Service service;
        if (device == null || (service = device.getService((String) SERVICE_RemoteControlService)) == null) {
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
