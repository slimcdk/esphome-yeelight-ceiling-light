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

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MeshGatewayService$a */
    class C9214a implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17152a;

        C9214a(MeshGatewayService meshGatewayService, CompletionHandler completionHandler) {
            this.f17152a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17152a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17152a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MeshGatewayService$b */
    class C9215b implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17153a;

        C9215b(MeshGatewayService meshGatewayService, CompletionHandler completionHandler) {
            this.f17153a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17153a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17153a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MeshGatewayService$c */
    class C9216c implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17154a;

        C9216c(MeshGatewayService meshGatewayService, CompletionHandler completionHandler) {
            this.f17154a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17154a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f17154a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MeshGatewayService$d */
    class C9217d implements DeviceManipulator.PropertyChangedListener {

        /* renamed from: a */
        final /* synthetic */ C9231r f17155a;

        C9217d(MeshGatewayService meshGatewayService, C9231r rVar) {
            this.f17155a = rVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0027  */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x0040  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onPropertyChanged(com.miot.common.device.invocation.PropertyInfo r6, java.lang.String r7) {
            /*
                r5 = this;
                int r0 = r7.hashCode()
                r1 = -2011583463(0xffffffff8819ac19, float:-4.6244063E-34)
                r2 = 1
                java.lang.String r3 = "Indicator"
                java.lang.String r4 = "Timezone"
                if (r0 == r1) goto L_0x001c
                r1 = 1291967983(0x4d01ddef, float:1.36175344E8)
                if (r0 == r1) goto L_0x0014
                goto L_0x0024
            L_0x0014:
                boolean r7 = r7.equals(r3)
                if (r7 == 0) goto L_0x0024
                r7 = 0
                goto L_0x0025
            L_0x001c:
                boolean r7 = r7.equals(r4)
                if (r7 == 0) goto L_0x0024
                r7 = 1
                goto L_0x0025
            L_0x0024:
                r7 = -1
            L_0x0025:
                if (r7 == 0) goto L_0x0040
                if (r7 == r2) goto L_0x002a
                goto L_0x0059
            L_0x002a:
                com.miot.common.property.Property r7 = r6.getProperty(r4)
                boolean r7 = r7.isValueValid()
                if (r7 == 0) goto L_0x0059
                java.lang.Object r6 = r6.getValue(r4)
                java.lang.String r6 = (java.lang.String) r6
                com.yeelight.yeelib.device.xiaomi.MeshGatewayService$r r7 = r5.f17155a
                r7.mo28588a(r6)
                goto L_0x0059
            L_0x0040:
                com.miot.common.property.Property r7 = r6.getProperty(r3)
                boolean r7 = r7.isValueValid()
                if (r7 == 0) goto L_0x0059
                java.lang.Object r6 = r6.getValue(r3)
                java.lang.String r6 = (java.lang.String) r6
                com.yeelight.yeelib.device.xiaomi.MeshGatewayService$p r6 = com.yeelight.yeelib.device.xiaomi.MeshGatewayService.C9229p.valueOf(r6)
                com.yeelight.yeelib.device.xiaomi.MeshGatewayService$r r7 = r5.f17155a
                r7.mo28589b(r6)
            L_0x0059:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.xiaomi.MeshGatewayService.C9217d.onPropertyChanged(com.miot.common.device.invocation.PropertyInfo, java.lang.String):void");
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MeshGatewayService$e */
    class C9218e implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17156a;

        C9218e(MeshGatewayService meshGatewayService, CompletionHandler completionHandler) {
            this.f17156a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17156a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f17156a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MeshGatewayService$f */
    class C9219f implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9227n f17157a;

        C9219f(MeshGatewayService meshGatewayService, C9227n nVar) {
            this.f17157a = nVar;
        }

        public void onFailed(int i, String str) {
            this.f17157a.onFailed(i, str);
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
                com.yeelight.yeelib.device.xiaomi.MeshGatewayService$p r0 = com.yeelight.yeelib.device.xiaomi.MeshGatewayService.C9229p.valueOf(r0)
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
                com.yeelight.yeelib.device.xiaomi.MeshGatewayService$n r4 = r3.f17157a
                r4.mo28586a(r0, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.xiaomi.MeshGatewayService.C9219f.onSucceed(com.miot.common.device.invocation.PropertyInfo):void");
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MeshGatewayService$g */
    class C9220g implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9226m f17158a;

        C9220g(MeshGatewayService meshGatewayService, C9226m mVar) {
            this.f17158a = mVar;
        }

        public void onFailed(int i, String str) {
            this.f17158a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty(MeshGatewayService.PROPERTY_Indicator);
            if (property.isValueValid()) {
                this.f17158a.mo30883a(C9229p.valueOf((String) propertyInfo.getValue(MeshGatewayService.PROPERTY_Indicator)));
                return;
            }
            C9226m mVar = this.f17158a;
            mVar.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MeshGatewayService$h */
    class C9221h implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9228o f17159a;

        C9221h(MeshGatewayService meshGatewayService, C9228o oVar) {
            this.f17159a = oVar;
        }

        public void onFailed(int i, String str) {
            this.f17159a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty(MeshGatewayService.PROPERTY_Timezone);
            if (property.isValueValid()) {
                this.f17159a.onSucceed((String) propertyInfo.getValue(MeshGatewayService.PROPERTY_Timezone));
                return;
            }
            C9228o oVar = this.f17159a;
            oVar.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MeshGatewayService$i */
    class C9222i implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17160a;

        C9222i(MeshGatewayService meshGatewayService, CompletionHandler completionHandler) {
            this.f17160a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17160a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17160a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MeshGatewayService$j */
    class C9223j implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17161a;

        C9223j(MeshGatewayService meshGatewayService, CompletionHandler completionHandler) {
            this.f17161a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17161a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17161a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MeshGatewayService$k */
    class C9224k implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17162a;

        C9224k(MeshGatewayService meshGatewayService, CompletionHandler completionHandler) {
            this.f17162a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17162a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17162a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MeshGatewayService$l */
    public enum C9225l {
        undefined,
        cfg_pomodoro,
        cfg_lan_ctrl,
        cfg_save_state,
        cfg_init_power
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MeshGatewayService$m */
    public interface C9226m {
        /* renamed from: a */
        void mo30883a(C9229p pVar);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MeshGatewayService$n */
    public interface C9227n {
        /* renamed from: a */
        void mo28586a(C9229p pVar, String str);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MeshGatewayService$o */
    public interface C9228o {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MeshGatewayService$p */
    public enum C9229p {
        undefined,
        on,
        off,
        unknow
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MeshGatewayService$q */
    public enum C9230q {
        undefined,
        on,
        off,
        unknow
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MeshGatewayService$r */
    public interface C9231r {
        /* renamed from: a */
        void mo28588a(String str);

        /* renamed from: b */
        void mo28589b(C9229p pVar);
    }

    public MeshGatewayService(AbstractDevice abstractDevice) {
        this.mDevice = abstractDevice;
    }

    public void getIndicator(C9226m mVar) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), PROPERTY_Indicator), new C9220g(this, mVar));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getProperties(C9227n nVar) {
        if (this.mDevice.isConnectionEstablished()) {
            PropertyInfo create = PropertyInfoFactory.create(getService());
            create.addProperty(getService().getProperty(PROPERTY_Indicator));
            create.addProperty(getService().getProperty(PROPERTY_Timezone));
            MiotManager.getDeviceManipulator().readProperty(create, new C9219f(this, nVar));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getTimezone(C9228o oVar) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), PROPERTY_Timezone), new C9221h(this, oVar));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void restore(CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "restore");
            if (create != null) {
                MiotManager.getDeviceManipulator().invoke(create, new C9224k(this, completionHandler));
                return;
            }
            throw new MiotException("actionInfo is null");
        }
        throw new MiotException("device not configurated connection");
    }

    public void sendCmd(C9225l lVar, String str, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "sendCmd");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("CmdKey", lVar.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("CmdValue", str)) {
                MiotManager.getDeviceManipulator().invoke(create, new C9222i(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C9215b(this, completionHandler));
                return;
            }
            throw new MiotException("actionInfo is null");
        }
        throw new MiotException("device not configurated connection");
    }

    public void setLEDIndicator(C9230q qVar, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setLEDIndicator");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (create.setArgumentValue("IndicatorParams", qVar.toString())) {
                MiotManager.getDeviceManipulator().invoke(create, new C9223j(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C9214a(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void subscribeNotifications(CompletionHandler completionHandler, C9231r rVar) {
        if (completionHandler == null) {
            throw new IllegalArgumentException("handler is null");
        } else if (rVar != null) {
            PropertyInfo create = PropertyInfoFactory.create(getService());
            for (Property next : getService().getProperties()) {
                if (next.getDefinition().isNotifiable()) {
                    create.addProperty(next);
                }
            }
            MiotManager.getDeviceManipulator().addPropertyChangedListener(create, new C9216c(this, completionHandler), new C9217d(this, rVar));
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
            MiotManager.getDeviceManipulator().removePropertyChangedListener(create, new C9218e(this, completionHandler));
            return;
        }
        throw new IllegalArgumentException("handler is null");
    }
}
