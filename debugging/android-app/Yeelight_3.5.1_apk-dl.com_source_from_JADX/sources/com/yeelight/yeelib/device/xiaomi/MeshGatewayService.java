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

public class MeshGatewayService extends AbstractService {
    public static final String ACTION_restore = "restore";
    public static final String ACTION_sendCmd = "sendCmd";
    public static final String ACTION_setDefault = "setDefault";
    public static final String ACTION_setLEDIndicator = "setLEDIndicator";
    public static final String ACTION_setTimezone = "setTimezone";
    public static final String PROPERTY_CmdKey = "CmdKey";
    public static final String PROPERTY_CmdValue = "CmdValue";
    public static final String PROPERTY_Indicator = "Indicator";
    public static final String PROPERTY_IndicatorParams = "IndicatorParams";
    public static final String PROPERTY_Timezone = "Timezone";
    private static final String TAG = "MeshGatewayService";
    private AbstractDevice mDevice = null;

    public enum CmdKey {
        undefined,
        cfg_pomodoro,
        cfg_lan_ctrl,
        cfg_save_state,
        cfg_init_power
    }

    public enum Indicator {
        undefined,
        on,
        off,
        unknow
    }

    public enum IndicatorParams {
        undefined,
        on,
        off,
        unknow
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MeshGatewayService$a */
    class C7697a implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13779a;

        C7697a(MeshGatewayService meshGatewayService, CompletionHandler completionHandler) {
            this.f13779a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13779a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13779a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MeshGatewayService$b */
    class C7698b implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13780a;

        C7698b(MeshGatewayService meshGatewayService, CompletionHandler completionHandler) {
            this.f13780a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13780a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13780a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MeshGatewayService$c */
    class C7699c implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13781a;

        C7699c(MeshGatewayService meshGatewayService, CompletionHandler completionHandler) {
            this.f13781a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13781a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f13781a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MeshGatewayService$d */
    class C7700d implements DeviceManipulator.PropertyChangedListener {

        /* renamed from: a */
        final /* synthetic */ C7711o f13782a;

        C7700d(MeshGatewayService meshGatewayService, C7711o oVar) {
            this.f13782a = oVar;
        }

        public void onPropertyChanged(PropertyInfo propertyInfo, String str) {
            str.hashCode();
            if (!str.equals(MeshGatewayService.PROPERTY_Timezone)) {
                if (str.equals(MeshGatewayService.PROPERTY_Indicator) && propertyInfo.getProperty(MeshGatewayService.PROPERTY_Indicator).isValueValid()) {
                    this.f13782a.mo34240b(Indicator.valueOf((String) propertyInfo.getValue(MeshGatewayService.PROPERTY_Indicator)));
                }
            } else if (propertyInfo.getProperty(MeshGatewayService.PROPERTY_Timezone).isValueValid()) {
                this.f13782a.mo34239a((String) propertyInfo.getValue(MeshGatewayService.PROPERTY_Timezone));
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MeshGatewayService$e */
    class C7701e implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13783a;

        C7701e(MeshGatewayService meshGatewayService, CompletionHandler completionHandler) {
            this.f13783a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13783a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f13783a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MeshGatewayService$f */
    class C7702f implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7709m f13784a;

        C7702f(MeshGatewayService meshGatewayService, C7709m mVar) {
            this.f13784a = mVar;
        }

        public void onFailed(int i, String str) {
            this.f13784a.onFailed(i, str);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.String} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onSucceed(com.miot.common.device.invocation.PropertyInfo r4) {
            /*
                r3 = this;
                java.lang.String r0 = "Indicator"
                com.miot.common.property.Property r0 = r4.getProperty(r0)
                boolean r1 = r0.isValueValid()
                r2 = 0
                if (r1 == 0) goto L_0x0018
                java.lang.Object r0 = r0.getValue()
                java.lang.String r0 = (java.lang.String) r0
                com.yeelight.yeelib.device.xiaomi.MeshGatewayService$Indicator r0 = com.yeelight.yeelib.device.xiaomi.MeshGatewayService.Indicator.valueOf(r0)
                goto L_0x0019
            L_0x0018:
                r0 = r2
            L_0x0019:
                java.lang.String r1 = "Timezone"
                com.miot.common.property.Property r4 = r4.getProperty(r1)
                boolean r1 = r4.isValueValid()
                if (r1 == 0) goto L_0x002c
                java.lang.Object r4 = r4.getValue()
                r2 = r4
                java.lang.String r2 = (java.lang.String) r2
            L_0x002c:
                com.yeelight.yeelib.device.xiaomi.MeshGatewayService$m r4 = r3.f13784a
                r4.mo34235a(r0, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.xiaomi.MeshGatewayService.C7702f.onSucceed(com.miot.common.device.invocation.PropertyInfo):void");
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MeshGatewayService$g */
    class C7703g implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7708l f13785a;

        C7703g(MeshGatewayService meshGatewayService, C7708l lVar) {
            this.f13785a = lVar;
        }

        public void onFailed(int i, String str) {
            this.f13785a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty(MeshGatewayService.PROPERTY_Indicator);
            if (property.isValueValid()) {
                this.f13785a.mo34233a(Indicator.valueOf((String) propertyInfo.getValue(MeshGatewayService.PROPERTY_Indicator)));
                return;
            }
            C7708l lVar = this.f13785a;
            lVar.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MeshGatewayService$h */
    class C7704h implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7710n f13786a;

        C7704h(MeshGatewayService meshGatewayService, C7710n nVar) {
            this.f13786a = nVar;
        }

        public void onFailed(int i, String str) {
            this.f13786a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty(MeshGatewayService.PROPERTY_Timezone);
            if (property.isValueValid()) {
                this.f13786a.onSucceed((String) propertyInfo.getValue(MeshGatewayService.PROPERTY_Timezone));
                return;
            }
            C7710n nVar = this.f13786a;
            nVar.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MeshGatewayService$i */
    class C7705i implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13787a;

        C7705i(MeshGatewayService meshGatewayService, CompletionHandler completionHandler) {
            this.f13787a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13787a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13787a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MeshGatewayService$j */
    class C7706j implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13788a;

        C7706j(MeshGatewayService meshGatewayService, CompletionHandler completionHandler) {
            this.f13788a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13788a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13788a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MeshGatewayService$k */
    class C7707k implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13789a;

        C7707k(MeshGatewayService meshGatewayService, CompletionHandler completionHandler) {
            this.f13789a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13789a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13789a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MeshGatewayService$l */
    public interface C7708l {
        /* renamed from: a */
        void mo34233a(Indicator indicator);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MeshGatewayService$m */
    public interface C7709m {
        /* renamed from: a */
        void mo34235a(Indicator indicator, String str);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MeshGatewayService$n */
    public interface C7710n {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MeshGatewayService$o */
    public interface C7711o {
        /* renamed from: a */
        void mo34239a(String str);

        /* renamed from: b */
        void mo34240b(Indicator indicator);
    }

    public MeshGatewayService(AbstractDevice abstractDevice) {
        this.mDevice = abstractDevice;
    }

    public void getIndicator(C7708l lVar) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), PROPERTY_Indicator), new C7703g(this, lVar));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getProperties(C7709m mVar) {
        if (this.mDevice.isConnectionEstablished()) {
            PropertyInfo create = PropertyInfoFactory.create(getService());
            create.addProperty(getService().getProperty(PROPERTY_Indicator));
            create.addProperty(getService().getProperty(PROPERTY_Timezone));
            MiotManager.getDeviceManipulator().readProperty(create, new C7702f(this, mVar));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getTimezone(C7710n nVar) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), PROPERTY_Timezone), new C7704h(this, nVar));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void restore(CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "restore");
            if (create != null) {
                MiotManager.getDeviceManipulator().invoke(create, new C7707k(this, completionHandler));
                return;
            }
            throw new MiotException("actionInfo is null");
        }
        throw new MiotException("device not configurated connection");
    }

    public void sendCmd(CmdKey cmdKey, String str, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "sendCmd");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("CmdKey", cmdKey.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("CmdValue", str)) {
                MiotManager.getDeviceManipulator().invoke(create, new C7705i(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setDefault(CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setDefault");
            if (create != null) {
                MiotManager.getDeviceManipulator().invoke(create, new C7698b(this, completionHandler));
                return;
            }
            throw new MiotException("actionInfo is null");
        }
        throw new MiotException("device not configurated connection");
    }

    public void setLEDIndicator(IndicatorParams indicatorParams, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setLEDIndicator");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (create.setArgumentValue("IndicatorParams", indicatorParams.toString())) {
                MiotManager.getDeviceManipulator().invoke(create, new C7706j(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setTimezone(String str, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), ACTION_setTimezone);
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (create.setArgumentValue(PROPERTY_Timezone, str)) {
                MiotManager.getDeviceManipulator().invoke(create, new C7697a(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void subscribeNotifications(CompletionHandler completionHandler, C7711o oVar) {
        if (completionHandler == null) {
            throw new IllegalArgumentException("handler is null");
        } else if (oVar != null) {
            PropertyInfo create = PropertyInfoFactory.create(getService());
            for (Property next : getService().getProperties()) {
                if (next.getDefinition().isNotifiable()) {
                    create.addProperty(next);
                }
            }
            MiotManager.getDeviceManipulator().addPropertyChangedListener(create, new C7699c(this, completionHandler), new C7700d(this, oVar));
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
            MiotManager.getDeviceManipulator().removePropertyChangedListener(create, new C7701e(this, completionHandler));
            return;
        }
        throw new IllegalArgumentException("handler is null");
    }
}
