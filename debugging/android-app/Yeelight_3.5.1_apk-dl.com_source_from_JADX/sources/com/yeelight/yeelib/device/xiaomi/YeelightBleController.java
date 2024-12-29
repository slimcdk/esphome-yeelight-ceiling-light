package com.yeelight.yeelib.device.xiaomi;

import android.os.Parcel;
import android.os.Parcelable;
import com.miot.common.abstractdevice.AbstractDevice;
import com.miot.common.device.Device;
import com.miot.common.device.Service;

public class YeelightBleController extends AbstractDevice {
    public static final Parcelable.Creator<YeelightBleController> CREATOR = new C8159a();
    private static final String DEVICE_TYPE = "YeelightBleController";
    public static final String SERVICE_BleControllerService = "urn:schemas-mi-com:service:BleController:Service:1";
    private static final String TAG = "YeelightBleController";
    public BleControllerService mDeviceService;

    /* renamed from: com.yeelight.yeelib.device.xiaomi.YeelightBleController$a */
    class C8159a implements Parcelable.Creator<YeelightBleController> {
        C8159a() {
        }

        /* renamed from: a */
        public YeelightBleController createFromParcel(Parcel parcel) {
            return new YeelightBleController(parcel, (C8159a) null);
        }

        /* renamed from: b */
        public YeelightBleController[] newArray(int i) {
            return new YeelightBleController[i];
        }
    }

    private YeelightBleController() {
        this.mDeviceService = new BleControllerService(this);
    }

    private YeelightBleController(Parcel parcel) {
        this.mDeviceService = new BleControllerService(this);
        readFromParcel(parcel);
    }

    /* synthetic */ YeelightBleController(Parcel parcel, C8159a aVar) {
        this(parcel);
    }

    public static synchronized YeelightBleController create(Device device) {
        YeelightBleController yeelightBleController;
        synchronized (YeelightBleController.class) {
            yeelightBleController = null;
            if ((device.getType().getClassType() + device.getType().getSubType()).equals("YeelightBleController")) {
                YeelightBleController yeelightBleController2 = new YeelightBleController();
                if (yeelightBleController2.init(device)) {
                    yeelightBleController = yeelightBleController2;
                }
            }
        }
        return yeelightBleController;
    }

    private boolean init(Device device) {
        Service service;
        if (device == null || (service = device.getService((String) SERVICE_BleControllerService)) == null) {
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
