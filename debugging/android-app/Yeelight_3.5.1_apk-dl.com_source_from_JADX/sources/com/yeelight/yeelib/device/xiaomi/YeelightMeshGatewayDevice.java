package com.yeelight.yeelib.device.xiaomi;

import android.os.Parcel;
import android.os.Parcelable;
import com.miot.common.abstractdevice.AbstractDevice;
import com.miot.common.device.Device;
import com.miot.common.device.Service;

public class YeelightMeshGatewayDevice extends AbstractDevice {
    public static final Parcelable.Creator<YeelightMeshGatewayDevice> CREATOR = new C8188a();
    private static final String DEVICE_TYPE = "YeelightMeshGatewayDevice";
    public static final String SERVICE_MeshGatewayService = "urn:schemas-mi-com:service:MeshGateway:Service:1";
    private static final String TAG = "YeelightMeshGatewayDevice";
    public MeshGatewayService mDeviceService;

    /* renamed from: com.yeelight.yeelib.device.xiaomi.YeelightMeshGatewayDevice$a */
    class C8188a implements Parcelable.Creator<YeelightMeshGatewayDevice> {
        C8188a() {
        }

        /* renamed from: a */
        public YeelightMeshGatewayDevice createFromParcel(Parcel parcel) {
            return new YeelightMeshGatewayDevice(parcel, (C8188a) null);
        }

        /* renamed from: b */
        public YeelightMeshGatewayDevice[] newArray(int i) {
            return new YeelightMeshGatewayDevice[i];
        }
    }

    private YeelightMeshGatewayDevice() {
        this.mDeviceService = new MeshGatewayService(this);
    }

    private YeelightMeshGatewayDevice(Parcel parcel) {
        this.mDeviceService = new MeshGatewayService(this);
        readFromParcel(parcel);
    }

    /* synthetic */ YeelightMeshGatewayDevice(Parcel parcel, C8188a aVar) {
        this(parcel);
    }

    public static synchronized YeelightMeshGatewayDevice create(Device device) {
        YeelightMeshGatewayDevice yeelightMeshGatewayDevice;
        synchronized (YeelightMeshGatewayDevice.class) {
            yeelightMeshGatewayDevice = null;
            if (device.getType().getName().equals("YeelightMeshGatewayDevice")) {
                YeelightMeshGatewayDevice yeelightMeshGatewayDevice2 = new YeelightMeshGatewayDevice();
                if (yeelightMeshGatewayDevice2.init(device)) {
                    yeelightMeshGatewayDevice = yeelightMeshGatewayDevice2;
                }
            }
        }
        return yeelightMeshGatewayDevice;
    }

    private boolean init(Device device) {
        Service service;
        if (device == null || (service = device.getService((String) SERVICE_MeshGatewayService)) == null) {
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
