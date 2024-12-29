package com.yeelight.yeelib.device.xiaomi.base;

import android.os.Parcel;
import android.os.Parcelable;
import com.miot.api.MiotManager;
import com.p022mi.iot.common.abstractdevice.AbstractDevice;
import com.p022mi.iot.common.abstractdevice.AbstractService;
import com.p022mi.iot.common.error.IotError;
import com.p022mi.iot.common.exception.IotException;
import com.p022mi.iot.common.handler.CommonHandler;
import com.p022mi.iot.common.handler.CompletedHandler;
import com.p022mi.iot.common.handler.ModifyPropertyHandler;
import com.p022mi.iot.common.instance.Action;
import com.p022mi.iot.common.instance.Device;
import com.p022mi.iot.common.instance.Property;
import com.p022mi.iot.common.instance.Service;
import com.yeelight.yeelib.utils.AppUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MiSpecDevice extends AbstractDevice {
    public static final Parcelable.Creator<MiSpecDevice> CREATOR = new C8250f();
    public static final String TAG = MiSpecDevice.class.getSimpleName();
    private Map<Integer, MiSpecService> mServiceMap;

    /* renamed from: com.yeelight.yeelib.device.xiaomi.base.MiSpecDevice$a */
    class C8245a implements ModifyPropertyHandler {

        /* renamed from: a */
        final /* synthetic */ CompletedHandler f14139a;

        C8245a(MiSpecDevice miSpecDevice, CompletedHandler completedHandler) {
            this.f14139a = completedHandler;
        }

        public void onFail(IotError iotError) {
            CompletedHandler completedHandler = this.f14139a;
            if (completedHandler != null) {
                completedHandler.onFailed(iotError);
            }
        }

        public void onModifyFail(List<Property> list) {
            CompletedHandler completedHandler = this.f14139a;
            if (completedHandler != null) {
                completedHandler.onSucceed();
            }
        }

        public void onModifySuccess(List<Property> list) {
            CompletedHandler completedHandler = this.f14139a;
            if (completedHandler != null) {
                completedHandler.onSucceed();
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.base.MiSpecDevice$b */
    class C8246b implements ModifyPropertyHandler {

        /* renamed from: a */
        final /* synthetic */ CompletedHandler f14140a;

        C8246b(MiSpecDevice miSpecDevice, CompletedHandler completedHandler) {
            this.f14140a = completedHandler;
        }

        public void onFail(IotError iotError) {
            CompletedHandler completedHandler = this.f14140a;
            if (completedHandler != null) {
                completedHandler.onFailed(iotError);
            }
        }

        public void onModifyFail(List<Property> list) {
            CompletedHandler completedHandler = this.f14140a;
            if (completedHandler != null) {
                completedHandler.onSucceed();
            }
        }

        public void onModifySuccess(List<Property> list) {
            CompletedHandler completedHandler = this.f14140a;
            if (completedHandler != null) {
                completedHandler.onSucceed();
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.base.MiSpecDevice$c */
    class C8247c implements CommonHandler<List<Property>> {

        /* renamed from: a */
        final /* synthetic */ int f14141a;

        /* renamed from: b */
        final /* synthetic */ C8251a f14142b;

        C8247c(MiSpecDevice miSpecDevice, int i, C8251a aVar) {
            this.f14141a = i;
            this.f14142b = aVar;
        }

        /* renamed from: a */
        public void onSucceed(List<Property> list) {
            HashMap hashMap = new HashMap();
            for (Property next : list) {
                hashMap.put(Integer.valueOf(next.getInstanceID()), next);
            }
            Property property = (Property) hashMap.get(Integer.valueOf(this.f14141a));
            if (property.isValueValid()) {
                this.f14142b.onSucceed(property.getValue());
            } else {
                this.f14142b.onFailed(IotError.CLIENT_REQUEST_ERROR);
            }
        }

        public void onFailed(IotError iotError) {
            this.f14142b.onFailed(iotError);
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.base.MiSpecDevice$d */
    class C8248d implements CommonHandler<List<Property>> {

        /* renamed from: a */
        final /* synthetic */ C8251a f14143a;

        C8248d(MiSpecDevice miSpecDevice, C8251a aVar) {
            this.f14143a = aVar;
        }

        /* renamed from: a */
        public void onSucceed(List<Property> list) {
            HashMap hashMap = new HashMap();
            for (Property next : list) {
                if (next.isValueValid()) {
                    hashMap.put(Integer.valueOf(next.getInstanceID()), next.getValue());
                }
            }
            this.f14143a.onSucceed(hashMap);
        }

        public void onFailed(IotError iotError) {
            this.f14143a.onFailed(iotError);
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.base.MiSpecDevice$e */
    class C8249e implements CommonHandler<Action> {

        /* renamed from: a */
        final /* synthetic */ CompletedHandler f14144a;

        C8249e(MiSpecDevice miSpecDevice, CompletedHandler completedHandler) {
            this.f14144a = completedHandler;
        }

        /* renamed from: a */
        public void onSucceed(Action action) {
            this.f14144a.onSucceed();
        }

        public void onFailed(IotError iotError) {
            this.f14144a.onFailed(iotError);
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.base.MiSpecDevice$f */
    class C8250f implements Parcelable.Creator<MiSpecDevice> {
        C8250f() {
        }

        /* renamed from: a */
        public MiSpecDevice createFromParcel(Parcel parcel) {
            return new MiSpecDevice(parcel, (C8245a) null);
        }

        /* renamed from: b */
        public MiSpecDevice[] newArray(int i) {
            return new MiSpecDevice[i];
        }
    }

    private MiSpecDevice(Parcel parcel) {
        readFromParcel(parcel);
    }

    /* synthetic */ MiSpecDevice(Parcel parcel, C8245a aVar) {
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

    public void getProperties(int i, int[] iArr, C8251a<Map<Integer, Object>> aVar) {
        AbstractService abstractService = this.mServiceMap.get(Integer.valueOf(i));
        if (abstractService == null || iArr == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("getProperties: service is empty!!! serviceId: ");
            sb.append(i);
            sb.append("   propertyIds: ");
            sb.append(iArr);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int property : iArr) {
            Property property2 = abstractService.getProperty(property);
            if (property2 != null) {
                arrayList.add(property2);
            } else if (AppUtils.f4977a) {
                throw new AppUtils.SuicideException("Property null exception", "Property is null, Please check UrnType in Application");
            }
        }
        try {
            MiotManager.getControllerManager().getPropertiesV2(this.mDevice, arrayList, new C8248d(this, aVar));
        } catch (IotException e) {
            e.printStackTrace();
        }
    }

    public <T> void getProperty(int i, int i2, C8251a<T> aVar) {
        AbstractService abstractService;
        Map<Integer, MiSpecService> map = this.mServiceMap;
        if (map != null && (abstractService = map.get(Integer.valueOf(i))) != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(abstractService.getProperty(i2));
            try {
                MiotManager.getControllerManager().getPropertiesV2(this.mDevice, arrayList, new C8247c(this, i2, aVar));
            } catch (IotException e) {
                e.printStackTrace();
            }
        }
    }

    public List<Property> getQueryProperties(int i, int[] iArr) {
        AbstractService abstractService = this.mServiceMap.get(Integer.valueOf(i));
        if (abstractService == null || iArr == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("getQueryProperties: service is empty!!! + device name: ");
            sb.append(getDevice().getName());
            sb.append("serviceId: ");
            sb.append(i);
            sb.append("   propertyIds: ");
            sb.append(iArr);
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 : iArr) {
            Property property = abstractService.getProperty(i2);
            if (property != null) {
                arrayList.add(property);
            } else if (AppUtils.f4977a) {
                throw new AppUtils.SuicideException("getQueryProperties: Property null exception", "Property is null, Please check UrnType in Application。  device name: " + getName() + "  server id: " + i + "  property id: " + i2);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    public boolean initService(Device device) {
        this.mServiceMap = new HashMap();
        int[] a = C8252b.m19449a(device);
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
        initService(device);
    }

    public void setAction(int i, int i2, int i3, Object obj, CompletedHandler completedHandler) {
        AbstractService abstractService = this.mServiceMap.get(Integer.valueOf(i));
        if (abstractService == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("getProperties: service is empty!!! serviceId: ");
            sb.append(i);
            sb.append("   actionId: ");
            sb.append(i2);
            return;
        }
        Action action = abstractService.getAction(i2);
        action.setArgumentValue(i3, obj);
        try {
            MiotManager.getControllerManager().invokeActionV2(this.mDevice, action, new C8249e(this, completedHandler));
        } catch (IotException e) {
            e.printStackTrace();
        }
    }

    public void setProperties(C8253c[] cVarArr, CompletedHandler completedHandler) {
        if (cVarArr != null) {
            ArrayList arrayList = new ArrayList();
            for (C8253c cVar : cVarArr) {
                MiSpecService miSpecService = getMiSpecService(cVar.mo35158b());
                if (miSpecService != null) {
                    Property property = miSpecService.getProperty(cVar.mo35157a());
                    property.setValue(cVar.mo35159c());
                    arrayList.add(property);
                }
            }
            try {
                MiotManager.getControllerManager().setPropertiesV2(this.mDevice, arrayList, new C8246b(this, completedHandler));
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
                MiotManager.getControllerManager().setPropertiesV2(this.mDevice, arrayList, new C8245a(this, completedHandler));
            } catch (IotException e) {
                e.printStackTrace();
            }
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(getDevice(), i);
    }
}
