package com.yeelight.yeelib.device.xiaomi;

import com.miot.api.CompletionHandler;
import com.miot.api.DeviceManipulator;
import com.miot.api.MiotManager;
import com.miot.common.ReturnCode;
import com.miot.common.abstractdevice.AbstractDevice;
import com.miot.common.abstractdevice.AbstractService;
import com.miot.common.device.invocation.ActionInfo;
import com.miot.common.device.invocation.ActionInfoFactory;
import com.miot.common.device.invocation.PropertyInfo;
import com.miot.common.device.invocation.PropertyInfoFactory;
import com.miot.common.exception.MiotException;
import com.miot.common.property.Property;

public class WifiSpeakerService extends AbstractService {
    public static final String ACTION_setAiProvider = "setAiProvider";
    public static final String PROPERTY_AiProvider = "AiProvider";
    private static final String TAG = "WifiSpeakerService";
    private AbstractDevice mDevice = null;

    /* renamed from: com.yeelight.yeelib.device.xiaomi.WifiSpeakerService$a */
    class C9659a implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17601a;

        C9659a(WifiSpeakerService wifiSpeakerService, CompletionHandler completionHandler) {
            this.f17601a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17601a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f17601a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.WifiSpeakerService$b */
    class C9660b implements DeviceManipulator.PropertyChangedListener {

        /* renamed from: a */
        final /* synthetic */ C9668j f17602a;

        C9660b(WifiSpeakerService wifiSpeakerService, C9668j jVar) {
            this.f17602a = jVar;
        }

        public void onPropertyChanged(PropertyInfo propertyInfo, String str) {
            if (((str.hashCode() == -1615484327 && str.equals(WifiSpeakerService.PROPERTY_AiProvider)) ? (char) 0 : 65535) == 0 && propertyInfo.getProperty(WifiSpeakerService.PROPERTY_AiProvider).isValueValid()) {
                this.f17602a.mo28159a(C9665g.valueOf((String) propertyInfo.getValue(WifiSpeakerService.PROPERTY_AiProvider)));
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.WifiSpeakerService$c */
    class C9661c implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17603a;

        C9661c(WifiSpeakerService wifiSpeakerService, CompletionHandler completionHandler) {
            this.f17603a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17603a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f17603a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.WifiSpeakerService$d */
    class C9662d implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9667i f17604a;

        C9662d(WifiSpeakerService wifiSpeakerService, C9667i iVar) {
            this.f17604a = iVar;
        }

        public void onFailed(int i, String str) {
            this.f17604a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty(WifiSpeakerService.PROPERTY_AiProvider);
            this.f17604a.mo28160a(property.isValueValid() ? C9665g.valueOf((String) property.getValue()) : null);
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.WifiSpeakerService$e */
    class C9663e implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9666h f17605a;

        C9663e(WifiSpeakerService wifiSpeakerService, C9666h hVar) {
            this.f17605a = hVar;
        }

        public void onFailed(int i, String str) {
            this.f17605a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty(WifiSpeakerService.PROPERTY_AiProvider);
            if (property.isValueValid()) {
                this.f17605a.mo31363a(C9665g.valueOf((String) propertyInfo.getValue(WifiSpeakerService.PROPERTY_AiProvider)));
                return;
            }
            C9666h hVar = this.f17605a;
            hVar.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.WifiSpeakerService$f */
    class C9664f implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17606a;

        C9664f(WifiSpeakerService wifiSpeakerService, CompletionHandler completionHandler) {
            this.f17606a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17606a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17606a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.WifiSpeakerService$g */
    public enum C9665g {
        undefined,
        mibrain,
        xiaobing
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.WifiSpeakerService$h */
    public interface C9666h {
        /* renamed from: a */
        void mo31363a(C9665g gVar);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.WifiSpeakerService$i */
    public interface C9667i {
        /* renamed from: a */
        void mo28160a(C9665g gVar);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.WifiSpeakerService$j */
    public interface C9668j {
        /* renamed from: a */
        void mo28159a(C9665g gVar);
    }

    public WifiSpeakerService(AbstractDevice abstractDevice) {
        this.mDevice = abstractDevice;
    }

    public void getAiProvider(C9666h hVar) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), PROPERTY_AiProvider), new C9663e(this, hVar));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getProperties(C9667i iVar) {
        if (this.mDevice.isConnectionEstablished()) {
            PropertyInfo create = PropertyInfoFactory.create(getService());
            create.addProperty(getService().getProperty(PROPERTY_AiProvider));
            MiotManager.getDeviceManipulator().readProperty(create, new C9662d(this, iVar));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void setAiProvider(C9665g gVar, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), ACTION_setAiProvider);
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (create.setArgumentValue(PROPERTY_AiProvider, gVar.toString())) {
                MiotManager.getDeviceManipulator().invoke(create, new C9664f(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void subscribeNotifications(CompletionHandler completionHandler, C9668j jVar) {
        if (completionHandler == null) {
            throw new IllegalArgumentException("handler is null");
        } else if (jVar != null) {
            PropertyInfo create = PropertyInfoFactory.create(getService());
            for (Property next : getService().getProperties()) {
                if (next.getDefinition().isNotifiable()) {
                    create.addProperty(next);
                }
            }
            MiotManager.getDeviceManipulator().addPropertyChangedListener(create, new C9659a(this, completionHandler), new C9660b(this, jVar));
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
            MiotManager.getDeviceManipulator().removePropertyChangedListener(create, new C9661c(this, completionHandler));
            return;
        }
        throw new IllegalArgumentException("handler is null");
    }
}
