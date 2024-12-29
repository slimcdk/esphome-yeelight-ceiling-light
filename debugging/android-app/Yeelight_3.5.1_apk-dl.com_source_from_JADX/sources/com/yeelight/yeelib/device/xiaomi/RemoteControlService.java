package com.yeelight.yeelib.device.xiaomi;

import com.miot.api.CompletionHandler;
import com.miot.api.DeviceManipulator;
import com.miot.api.MiotManager;
import com.miot.common.ReturnCode;
import com.miot.common.abstractdevice.AbstractDevice;
import com.miot.common.abstractdevice.AbstractService;
import com.miot.common.device.invocation.PropertyInfo;
import com.miot.common.device.invocation.PropertyInfoFactory;
import com.miot.common.exception.MiotException;
import com.miot.common.property.Property;

public class RemoteControlService extends AbstractService {
    public static final String PROPERTY_BatteryStatus = "BatteryStatus";
    public static final String PROPERTY_Button = "Button";
    public static final String PROPERTY_EventType = "EventType";
    private static final String TAG = "RemoteControlService";
    private AbstractDevice mDevice = null;

    /* renamed from: com.yeelight.yeelib.device.xiaomi.RemoteControlService$a */
    class C7946a implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13957a;

        C7946a(RemoteControlService remoteControlService, CompletionHandler completionHandler) {
            this.f13957a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13957a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f13957a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.RemoteControlService$b */
    class C7947b implements DeviceManipulator.PropertyChangedListener {

        /* renamed from: a */
        final /* synthetic */ C7953h f13958a;

        C7947b(RemoteControlService remoteControlService, C7953h hVar) {
            this.f13958a = hVar;
        }

        public void onPropertyChanged(PropertyInfo propertyInfo, String str) {
            str.hashCode();
            if (str.equals(RemoteControlService.PROPERTY_BatteryStatus)) {
                this.f13958a.mo34595a((Long) propertyInfo.getValue(RemoteControlService.PROPERTY_BatteryStatus));
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.RemoteControlService$c */
    class C7948c implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13959a;

        C7948c(RemoteControlService remoteControlService, CompletionHandler completionHandler) {
            this.f13959a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13959a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f13959a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.RemoteControlService$d */
    class C7949d implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7952g f13960a;

        C7949d(RemoteControlService remoteControlService, C7952g gVar) {
            this.f13960a = gVar;
        }

        public void onFailed(int i, String str) {
            this.f13960a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            this.f13960a.mo34593a((Long) propertyInfo.getValue(RemoteControlService.PROPERTY_BatteryStatus));
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.RemoteControlService$e */
    class C7950e implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7951f f13961a;

        C7950e(RemoteControlService remoteControlService, C7951f fVar) {
            this.f13961a = fVar;
        }

        public void onFailed(int i, String str) {
            this.f13961a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty(RemoteControlService.PROPERTY_BatteryStatus);
            if (property.isValueValid()) {
                this.f13961a.mo34591a((Long) propertyInfo.getValue(RemoteControlService.PROPERTY_BatteryStatus));
                return;
            }
            C7951f fVar = this.f13961a;
            fVar.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.RemoteControlService$f */
    public interface C7951f {
        /* renamed from: a */
        void mo34591a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.RemoteControlService$g */
    public interface C7952g {
        /* renamed from: a */
        void mo34593a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.RemoteControlService$h */
    public interface C7953h {
        /* renamed from: a */
        void mo34595a(Long l);
    }

    public RemoteControlService(AbstractDevice abstractDevice) {
        this.mDevice = abstractDevice;
    }

    public void getBatteryStatus(C7951f fVar) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), PROPERTY_BatteryStatus), new C7950e(this, fVar));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getProperties(C7952g gVar) {
        if (this.mDevice.isConnectionEstablished()) {
            PropertyInfo create = PropertyInfoFactory.create(getService());
            create.addProperty(getService().getProperty(PROPERTY_BatteryStatus));
            MiotManager.getDeviceManipulator().readProperty(create, new C7949d(this, gVar));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void subscribeNotifications(CompletionHandler completionHandler, C7953h hVar) {
        if (completionHandler == null) {
            throw new IllegalArgumentException("handler is null");
        } else if (hVar != null) {
            PropertyInfo create = PropertyInfoFactory.create(getService());
            for (Property next : getService().getProperties()) {
                if (next.getDefinition().isNotifiable()) {
                    create.addProperty(next);
                }
            }
            MiotManager.getDeviceManipulator().addPropertyChangedListener(create, new C7946a(this, completionHandler), new C7947b(this, hVar));
        } else {
            throw new IllegalArgumentException("listener is null");
        }
    }

    public void unsubscribeNotifications(CompletionHandler completionHandler) {
        if (completionHandler != null) {
            PropertyInfo create = PropertyInfoFactory.create(getService());
            for (Property next : getService().getProperties()) {
                if (next.getDefinition().isNotifiable()) {
                    create.addProperty(next);
                }
            }
            MiotManager.getDeviceManipulator().removePropertyChangedListener(create, new C7948c(this, completionHandler));
            return;
        }
        throw new IllegalArgumentException("handler is null");
    }
}
