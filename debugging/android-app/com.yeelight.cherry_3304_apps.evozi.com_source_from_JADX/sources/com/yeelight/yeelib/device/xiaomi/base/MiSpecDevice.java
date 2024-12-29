package com.yeelight.yeelib.device.xiaomi.base;

import android.os.Parcel;
import android.os.Parcelable;
import com.miot.api.MiotManager;
import com.p146mi.iot.common.abstractdevice.AbstractDevice;
import com.p146mi.iot.common.abstractdevice.AbstractService;
import com.p146mi.iot.common.error.IotError;
import com.p146mi.iot.common.exception.IotException;
import com.p146mi.iot.common.handler.CommonHandler;
import com.p146mi.iot.common.handler.CompletedHandler;
import com.p146mi.iot.common.handler.ModifyPropertyHandler;
import com.p146mi.iot.common.instance.Action;
import com.p146mi.iot.common.instance.Device;
import com.p146mi.iot.common.instance.Property;
import com.p146mi.iot.common.instance.Service;
import com.yeelight.yeelib.utils.C4308b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MiSpecDevice extends AbstractDevice {
    public static final Parcelable.Creator<MiSpecDevice> CREATOR = new C9762f();
    public static final String TAG = MiSpecDevice.class.getSimpleName();
    private Map<Integer, MiSpecService> mServiceMap;

    /* renamed from: com.yeelight.yeelib.device.xiaomi.base.MiSpecDevice$a */
    class C9757a implements ModifyPropertyHandler {

        /* renamed from: a */
        final /* synthetic */ CompletedHandler f17658a;

        C9757a(CompletedHandler completedHandler) {
            this.f17658a = completedHandler;
        }

        public void onFail(IotError iotError) {
            CompletedHandler completedHandler = this.f17658a;
            if (completedHandler != null) {
                completedHandler.onFailed(iotError);
            }
        }

        public void onModifyFail(List<Property> list) {
            CompletedHandler completedHandler = this.f17658a;
            if (completedHandler != null) {
                completedHandler.onSucceed();
            }
        }

        public void onModifySuccess(List<Property> list) {
            CompletedHandler completedHandler = this.f17658a;
            if (completedHandler != null) {
                completedHandler.onSucceed();
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.base.MiSpecDevice$b */
    class C9758b implements ModifyPropertyHandler {

        /* renamed from: a */
        final /* synthetic */ CompletedHandler f17660a;

        C9758b(CompletedHandler completedHandler) {
            this.f17660a = completedHandler;
        }

        public void onFail(IotError iotError) {
            CompletedHandler completedHandler = this.f17660a;
            if (completedHandler != null) {
                completedHandler.onFailed(iotError);
            }
        }

        public void onModifyFail(List<Property> list) {
            CompletedHandler completedHandler = this.f17660a;
            if (completedHandler != null) {
                completedHandler.onSucceed();
            }
        }

        public void onModifySuccess(List<Property> list) {
            CompletedHandler completedHandler = this.f17660a;
            if (completedHandler != null) {
                completedHandler.onSucceed();
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.base.MiSpecDevice$c */
    class C9759c implements CommonHandler<List<Property>> {

        /* renamed from: a */
        final /* synthetic */ int f17662a;

        /* renamed from: b */
        final /* synthetic */ C9763a f17663b;

        C9759c(int i, C9763a aVar) {
            this.f17662a = i;
            this.f17663b = aVar;
        }

        /* renamed from: a */
        public void onSucceed(List<Property> list) {
            HashMap hashMap = new HashMap();
            for (Property next : list) {
                hashMap.put(Integer.valueOf(next.getInstanceID()), next);
            }
            Property property = (Property) hashMap.get(Integer.valueOf(this.f17662a));
            if (property.isValueValid()) {
                this.f17663b.onSucceed(property.getValue());
            } else {
                this.f17663b.onFailed(IotError.CLIENT_REQUEST_ERROR);
            }
        }

        public void onFailed(IotError iotError) {
            this.f17663b.onFailed(iotError);
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.base.MiSpecDevice$d */
    class C9760d implements CommonHandler<List<Property>> {

        /* renamed from: a */
        final /* synthetic */ C9763a f17665a;

        C9760d(C9763a aVar) {
            this.f17665a = aVar;
        }

        /* renamed from: a */
        public void onSucceed(List<Property> list) {
            HashMap hashMap = new HashMap();
            for (Property next : list) {
                if (next.isValueValid()) {
                    hashMap.put(Integer.valueOf(next.getInstanceID()), next.getValue());
                }
            }
            this.f17665a.onSucceed(hashMap);
        }

        public void onFailed(IotError iotError) {
            this.f17665a.onFailed(iotError);
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.base.MiSpecDevice$e */
    class C9761e implements CommonHandler<Action> {

        /* renamed from: a */
        final /* synthetic */ CompletedHandler f17667a;

        C9761e(CompletedHandler completedHandler) {
            this.f17667a = completedHandler;
        }

        /* renamed from: a */
        public void onSucceed(Action action) {
            this.f17667a.onSucceed();
        }

        public void onFailed(IotError iotError) {
            this.f17667a.onFailed(iotError);
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.base.MiSpecDevice$f */
    static class C9762f implements Parcelable.Creator<MiSpecDevice> {
        C9762f() {
        }

        /* renamed from: a */
        public MiSpecDevice createFromParcel(Parcel parcel) {
            return new MiSpecDevice(parcel, (C9757a) null);
        }

        /* renamed from: b */
        public MiSpecDevice[] newArray(int i) {
            return new MiSpecDevice[i];
        }
    }

    private MiSpecDevice(Parcel parcel) {
        readFromParcel(parcel);
    }

    /* synthetic */ MiSpecDevice(Parcel parcel, C9757a aVar) {
        this(parcel);
    }

    private MiSpecDevice(Device device) {
        super(device);
    }

    public static synchronized MiSpecDevice create(Device device) {
        MiSpecDevice miSpecDevice;
        synchronized (MiSpecDevice.class) {
            miSpecDevice = new MiSpecDevice(device);
            if (!miSpecDevice.initService(device)) {
                miSpecDevice = null;
            }
        }
        return miSpecDevice;
    }

    public int describeContents() {
        return 0;
    }

    public MiSpecService getMiSpecService(int i) {
        return this.mServiceMap.get(Integer.valueOf(i));
    }

    public void getProperties(int i, int[] iArr, C9763a<Map<Integer, Object>> aVar) {
        AbstractService abstractService = this.mServiceMap.get(Integer.valueOf(i));
        if (abstractService == null || iArr == null) {
            "getProperties: service is empty!!! serviceId: " + i + "   propertyIds: " + iArr;
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int property : iArr) {
            Property property2 = abstractService.getProperty(property);
            if (property2 != null) {
                arrayList.add(property2);
            } else if (C4308b.f7482a) {
                throw new C4308b.C4309a("Property null exception", "Property is null, Please check UrnType in Application");
            }
        }
        try {
            MiotManager.getControllerManager().getPropertiesV2(this.mDevice, arrayList, new C9760d(aVar));
        } catch (IotException e) {
            e.printStackTrace();
        }
    }

    public <T> void getProperty(int i, int i2, C9763a<T> aVar) {
        AbstractService abstractService;
        Map<Integer, MiSpecService> map = this.mServiceMap;
        if (map != null && (abstractService = map.get(Integer.valueOf(i))) != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(abstractService.getProperty(i2));
            try {
                MiotManager.getControllerManager().getPropertiesV2(this.mDevice, arrayList, new C9759c(i2, aVar));
            } catch (IotException e) {
                e.printStackTrace();
            }
        }
    }

    public List<Property> getQueryProperties(int i, int[] iArr) {
        AbstractService abstractService = this.mServiceMap.get(Integer.valueOf(i));
        if (abstractService == null || iArr == null) {
            "getQueryProperties: service is empty!!! + device name: " + getDevice().getName() + "serviceId: " + i + "   propertyIds: " + iArr;
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 : iArr) {
            Property property = abstractService.getProperty(i2);
            if (property != null) {
                arrayList.add(property);
            } else if (C4308b.f7482a) {
                throw new C4308b.C4309a("getQueryProperties: Property null exception", "Property is null, Please check UrnType in Application。  device name: " + getName() + "  server id: " + i + "  property id: " + i2);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    public boolean initService(Device device) {
        this.mServiceMap = new HashMap();
        int[] a = C9764b.m23660a(device);
        if (device == null || a == null) {
            return false;
        }
        for (int i : a) {
            Service service = device.getService(i);
            if (service == null) {
                break;
            }
            this.mServiceMap.put(Integer.valueOf(i), new MiSpecService(service));
        }
        return true;
    }

    public void readFromParcel(Parcel parcel) {
        Device device = (Device) parcel.readParcelable(Device.class.getClassLoader());
        this.mDevice = device;
        boolean initService = initService(device);
    }

    public void setAction(int i, int i2, int i3, Object obj, CompletedHandler completedHandler) {
        AbstractService abstractService = this.mServiceMap.get(Integer.valueOf(i));
        if (abstractService == null) {
            "getProperties: service is empty!!! serviceId: " + i + "   actionId: " + i2;
            return;
        }
        Action action = abstractService.getAction(i2);
        action.setArgumentValue(i3, obj);
        try {
            MiotManager.getControllerManager().invokeActionV2(this.mDevice, action, new C9761e(completedHandler));
        } catch (IotException e) {
            e.printStackTrace();
        }
    }

    public void setProperties(C9765c[] cVarArr, CompletedHandler completedHandler) {
        if (cVarArr != null) {
            ArrayList arrayList = new ArrayList();
            for (C9765c cVar : cVarArr) {
                MiSpecService miSpecService = getMiSpecService(cVar.mo31599b());
                if (miSpecService != null) {
                    Property property = miSpecService.getProperty(cVar.mo31598a());
                    property.setValue(cVar.mo31600c());
                    arrayList.add(property);
                }
            }
            try {
                MiotManager.getControllerManager().setPropertiesV2(this.mDevice, arrayList, new C9758b(completedHandler));
            } catch (IotException e) {
                e.printStackTrace();
            }
        }
    }

    public void setProperty(int i, int i2, Object obj, CompletedHandler completedHandler) {
        MiSpecService miSpecService = getMiSpecService(i);
        if (miSpecService != null) {
            ArrayList arrayList = new ArrayList();
            Property property = miSpecService.getProperty(i2);
            property.setValue(obj);
            arrayList.add(property);
            try {
                MiotManager.getControllerManager().setPropertiesV2(this.mDevice, arrayList, new C9757a(completedHandler));
            } catch (IotException e) {
                e.printStackTrace();
            }
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(getDevice(), i);
    }
}
