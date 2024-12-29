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

    public enum AiProvider {
        undefined,
        mibrain,
        xiaobing
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.WifiSpeakerService$a */
    class C8149a implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f14103a;

        C8149a(WifiSpeakerService wifiSpeakerService, CompletionHandler completionHandler) {
            this.f14103a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f14103a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f14103a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.WifiSpeakerService$b */
    class C8150b implements DeviceManipulator.PropertyChangedListener {

        /* renamed from: a */
        final /* synthetic */ C8157i f14104a;

        C8150b(WifiSpeakerService wifiSpeakerService, C8157i iVar) {
            this.f14104a = iVar;
        }

        public void onPropertyChanged(PropertyInfo propertyInfo, String str) {
            str.hashCode();
            if (str.equals(WifiSpeakerService.PROPERTY_AiProvider) && propertyInfo.getProperty(WifiSpeakerService.PROPERTY_AiProvider).isValueValid()) {
                this.f14104a.mo34902a(AiProvider.valueOf((String) propertyInfo.getValue(WifiSpeakerService.PROPERTY_AiProvider)));
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.WifiSpeakerService$c */
    class C8151c implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f14105a;

        C8151c(WifiSpeakerService wifiSpeakerService, CompletionHandler completionHandler) {
            this.f14105a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f14105a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f14105a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.WifiSpeakerService$d */
    class C8152d implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8156h f14106a;

        C8152d(WifiSpeakerService wifiSpeakerService, C8156h hVar) {
            this.f14106a = hVar;
        }

        public void onFailed(int i, String str) {
            this.f14106a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty(WifiSpeakerService.PROPERTY_AiProvider);
            this.f14106a.mo34900a(property.isValueValid() ? AiProvider.valueOf((String) property.getValue()) : null);
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.WifiSpeakerService$e */
    class C8153e implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8155g f14107a;

        C8153e(WifiSpeakerService wifiSpeakerService, C8155g gVar) {
            this.f14107a = gVar;
        }

        public void onFailed(int i, String str) {
            this.f14107a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty(WifiSpeakerService.PROPERTY_AiProvider);
            if (property.isValueValid()) {
                this.f14107a.mo34898a(AiProvider.valueOf((String) propertyInfo.getValue(WifiSpeakerService.PROPERTY_AiProvider)));
                return;
            }
            C8155g gVar = this.f14107a;
            gVar.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.WifiSpeakerService$f */
    class C8154f implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f14108a;

        C8154f(WifiSpeakerService wifiSpeakerService, CompletionHandler completionHandler) {
            this.f14108a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f14108a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f14108a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.WifiSpeakerService$g */
    public interface C8155g {
        /* renamed from: a */
        void mo34898a(AiProvider aiProvider);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.WifiSpeakerService$h */
    public interface C8156h {
        /* renamed from: a */
        void mo34900a(AiProvider aiProvider);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.WifiSpeakerService$i */
    public interface C8157i {
        /* renamed from: a */
        void mo34902a(AiProvider aiProvider);
    }

    public WifiSpeakerService(AbstractDevice abstractDevice) {
        this.mDevice = abstractDevice;
    }

    public void getAiProvider(C8155g gVar) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), PROPERTY_AiProvider), new C8153e(this, gVar));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getProperties(C8156h hVar) {
        if (this.mDevice.isConnectionEstablished()) {
            PropertyInfo create = PropertyInfoFactory.create(getService());
            create.addProperty(getService().getProperty(PROPERTY_AiProvider));
            MiotManager.getDeviceManipulator().readProperty(create, new C8152d(this, hVar));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void setAiProvider(AiProvider aiProvider, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), ACTION_setAiProvider);
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (create.setArgumentValue(PROPERTY_AiProvider, aiProvider.toString())) {
                MiotManager.getDeviceManipulator().invoke(create, new C8154f(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void subscribeNotifications(CompletionHandler completionHandler, C8157i iVar) {
        if (completionHandler == null) {
            throw new IllegalArgumentException("handler is null");
        } else if (iVar != null) {
            PropertyInfo create = PropertyInfoFactory.create(getService());
            for (Property next : getService().getProperties()) {
                if (next.getDefinition().isNotifiable()) {
                    create.addProperty(next);
                }
            }
            MiotManager.getDeviceManipulator().addPropertyChangedListener(create, new C8149a(this, completionHandler), new C8150b(this, iVar));
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
            MiotManager.getDeviceManipulator().removePropertyChangedListener(create, new C8151c(this, completionHandler));
            return;
        }
        throw new IllegalArgumentException("handler is null");
    }
}
