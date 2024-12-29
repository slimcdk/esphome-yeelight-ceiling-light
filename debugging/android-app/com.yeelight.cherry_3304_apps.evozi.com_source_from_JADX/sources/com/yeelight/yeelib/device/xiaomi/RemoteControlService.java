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
    class C9441a implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17391a;

        C9441a(RemoteControlService remoteControlService, CompletionHandler completionHandler) {
            this.f17391a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17391a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f17391a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.RemoteControlService$b */
    class C9442b implements DeviceManipulator.PropertyChangedListener {

        /* renamed from: a */
        final /* synthetic */ C9448h f17392a;

        C9442b(RemoteControlService remoteControlService, C9448h hVar) {
            this.f17392a = hVar;
        }

        public void onPropertyChanged(PropertyInfo propertyInfo, String str) {
            if (((str.hashCode() == -414573505 && str.equals(RemoteControlService.PROPERTY_BatteryStatus)) ? (char) 0 : 65535) == 0) {
                this.f17392a.mo28135a((Long) propertyInfo.getValue(RemoteControlService.PROPERTY_BatteryStatus));
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.RemoteControlService$c */
    class C9443c implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17393a;

        C9443c(RemoteControlService remoteControlService, CompletionHandler completionHandler) {
            this.f17393a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17393a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f17393a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.RemoteControlService$d */
    class C9444d implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9447g f17394a;

        C9444d(RemoteControlService remoteControlService, C9447g gVar) {
            this.f17394a = gVar;
        }

        public void onFailed(int i, String str) {
            this.f17394a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            this.f17394a.mo28133a((Long) propertyInfo.getValue(RemoteControlService.PROPERTY_BatteryStatus));
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.RemoteControlService$e */
    class C9445e implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9446f f17395a;

        C9445e(RemoteControlService remoteControlService, C9446f fVar) {
            this.f17395a = fVar;
        }

        public void onFailed(int i, String str) {
            this.f17395a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty(RemoteControlService.PROPERTY_BatteryStatus);
            if (property.isValueValid()) {
                this.f17395a.mo31120a((Long) propertyInfo.getValue(RemoteControlService.PROPERTY_BatteryStatus));
                return;
            }
            C9446f fVar = this.f17395a;
            fVar.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.RemoteControlService$f */
    public interface C9446f {
        /* renamed from: a */
        void mo31120a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.RemoteControlService$g */
    public interface C9447g {
        /* renamed from: a */
        void mo28133a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.RemoteControlService$h */
    public interface C9448h {
        /* renamed from: a */
        void mo28135a(Long l);
    }

    public RemoteControlService(AbstractDevice abstractDevice) {
        this.mDevice = abstractDevice;
    }

    public void getBatteryStatus(C9446f fVar) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), PROPERTY_BatteryStatus), new C9445e(this, fVar));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getProperties(C9447g gVar) {
        if (this.mDevice.isConnectionEstablished()) {
            PropertyInfo create = PropertyInfoFactory.create(getService());
            create.addProperty(getService().getProperty(PROPERTY_BatteryStatus));
            MiotManager.getDeviceManipulator().readProperty(create, new C9444d(this, gVar));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void subscribeNotifications(CompletionHandler completionHandler, C9448h hVar) {
        if (completionHandler == null) {
            throw new IllegalArgumentException("handler is null");
        } else if (hVar != null) {
            PropertyInfo create = PropertyInfoFactory.create(getService());
            for (Property next : getService().getProperties()) {
                if (next.getDefinition().isNotifiable()) {
                    create.addProperty(next);
                }
            }
            MiotManager.getDeviceManipulator().addPropertyChangedListener(create, new C9441a(this, completionHandler), new C9442b(this, hVar));
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
            MiotManager.getDeviceManipulator().removePropertyChangedListener(create, new C9443c(this, completionHandler));
            return;
        }
        throw new IllegalArgumentException("handler is null");
    }
}
