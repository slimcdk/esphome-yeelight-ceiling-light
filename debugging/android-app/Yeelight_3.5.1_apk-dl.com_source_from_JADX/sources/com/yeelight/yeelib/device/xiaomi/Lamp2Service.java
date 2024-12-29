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

public class Lamp2Service extends AbstractService {
    public static final String ACTION_addCron = "addCron";
    public static final String ACTION_delCron = "delCron";
    public static final String ACTION_getCron = "getCron";
    public static final String ACTION_getData = "getData";
    public static final String ACTION_openWithMode = "openWithMode";
    public static final String ACTION_restore = "restore";
    public static final String ACTION_sendCmd = "sendCmd";
    public static final String ACTION_setBright = "setBright";
    public static final String ACTION_setCt = "setCt";
    public static final String ACTION_setDefault = "setDefault";
    public static final String ACTION_setFlowScene = "setFlowScene";
    public static final String ACTION_setPower = "setPower";
    public static final String ACTION_setScene = "setScene";
    public static final String ACTION_toggle = "toggle";
    public static final String PROPERTY_Bright = "Bright";
    public static final String PROPERTY_CmdKey = "CmdKey";
    public static final String PROPERTY_CmdResp = "CmdResp";
    public static final String PROPERTY_CmdValue = "CmdValue";
    public static final String PROPERTY_CronType = "CronType";
    public static final String PROPERTY_Ct = "Ct";
    public static final String PROPERTY_DelayOff = "DelayOff";
    public static final String PROPERTY_Duration = "Duration";
    public static final String PROPERTY_Effect = "Effect";
    public static final String PROPERTY_FlowParams = "FlowParams";
    public static final String PROPERTY_Flowing = "Flowing";
    public static final String PROPERTY_KidMode = "KidMode";
    public static final String PROPERTY_Mode = "Mode";
    public static final String PROPERTY_ParamColors = "ParamColors";
    public static final String PROPERTY_ParamCount = "ParamCount";
    public static final String PROPERTY_ParamFinish = "ParamFinish";
    public static final String PROPERTY_ParamModel = "ParamModel";
    public static final String PROPERTY_PdoBreakTime = "PdoBreakTime";
    public static final String PROPERTY_PdoStatus = "PdoStatus";
    public static final String PROPERTY_PdoWorkTime = "PdoWorkTime";
    public static final String PROPERTY_Power = "Power";
    public static final String PROPERTY_SaveState = "SaveState";
    public static final String PROPERTY_ShortKeyAction = "ShortKeyAction";
    public static final String PROPERTY_ShortKeySceneName = "ShortKeySceneName";
    public static final String PROPERTY_onFromPower = "onFromPower";
    private static final String TAG = "Lamp2Service";
    private AbstractDevice mDevice = null;

    public enum CmdKey {
        undefined,
        cfg_pomodoro,
        cfg_kidmode,
        cfg_lan_ctrl,
        cfg_save_state,
        cfg_shortkey,
        cfg_init_power
    }

    public enum Effect {
        undefined,
        smooth,
        sudden
    }

    public enum Power {
        undefined,
        on,
        off
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp2Service$a */
    class C7473a implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7500n0 f13623a;

        C7473a(Lamp2Service lamp2Service, C7500n0 n0Var) {
            this.f13623a = n0Var;
        }

        public void onFailed(int i, String str) {
            this.f13623a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("PdoBreakTime");
            if (property.isValueValid()) {
                this.f13623a.mo33929a((Long) propertyInfo.getValue("PdoBreakTime"));
                return;
            }
            C7500n0 n0Var = this.f13623a;
            n0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp2Service$a0 */
    class C7474a0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7508r0 f13624a;

        C7474a0(Lamp2Service lamp2Service, C7508r0 r0Var) {
            this.f13624a = r0Var;
        }

        public void onFailed(int i, String str) {
            this.f13624a.onFailed(i, str);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.Long} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onSucceed(com.miot.common.device.invocation.PropertyInfo r20) {
            /*
                r19 = this;
                r0 = r20
                java.lang.String r1 = "Power"
                com.miot.common.property.Property r1 = r0.getProperty(r1)
                boolean r2 = r1.isValueValid()
                r3 = 0
                if (r2 == 0) goto L_0x001b
                java.lang.Object r1 = r1.getValue()
                java.lang.String r1 = (java.lang.String) r1
                com.yeelight.yeelib.device.xiaomi.Lamp2Service$Power r1 = com.yeelight.yeelib.device.xiaomi.Lamp2Service.Power.valueOf(r1)
                r5 = r1
                goto L_0x001c
            L_0x001b:
                r5 = r3
            L_0x001c:
                java.lang.String r1 = "Bright"
                com.miot.common.property.Property r1 = r0.getProperty(r1)
                boolean r2 = r1.isValueValid()
                if (r2 == 0) goto L_0x0030
                java.lang.Object r1 = r1.getValue()
                java.lang.Long r1 = (java.lang.Long) r1
                r6 = r1
                goto L_0x0031
            L_0x0030:
                r6 = r3
            L_0x0031:
                java.lang.String r1 = "Ct"
                com.miot.common.property.Property r1 = r0.getProperty(r1)
                boolean r2 = r1.isValueValid()
                if (r2 == 0) goto L_0x0045
                java.lang.Object r1 = r1.getValue()
                java.lang.Long r1 = (java.lang.Long) r1
                r7 = r1
                goto L_0x0046
            L_0x0045:
                r7 = r3
            L_0x0046:
                java.lang.String r1 = "PdoStatus"
                com.miot.common.property.Property r1 = r0.getProperty(r1)
                boolean r2 = r1.isValueValid()
                if (r2 == 0) goto L_0x005a
                java.lang.Object r1 = r1.getValue()
                java.lang.Long r1 = (java.lang.Long) r1
                r8 = r1
                goto L_0x005b
            L_0x005a:
                r8 = r3
            L_0x005b:
                java.lang.String r1 = "PdoWorkTime"
                com.miot.common.property.Property r1 = r0.getProperty(r1)
                boolean r2 = r1.isValueValid()
                if (r2 == 0) goto L_0x006f
                java.lang.Object r1 = r1.getValue()
                java.lang.Long r1 = (java.lang.Long) r1
                r9 = r1
                goto L_0x0070
            L_0x006f:
                r9 = r3
            L_0x0070:
                java.lang.String r1 = "PdoBreakTime"
                com.miot.common.property.Property r1 = r0.getProperty(r1)
                boolean r2 = r1.isValueValid()
                if (r2 == 0) goto L_0x0084
                java.lang.Object r1 = r1.getValue()
                java.lang.Long r1 = (java.lang.Long) r1
                r10 = r1
                goto L_0x0085
            L_0x0084:
                r10 = r3
            L_0x0085:
                java.lang.String r1 = "DelayOff"
                com.miot.common.property.Property r1 = r0.getProperty(r1)
                boolean r2 = r1.isValueValid()
                if (r2 == 0) goto L_0x0099
                java.lang.Object r1 = r1.getValue()
                java.lang.Long r1 = (java.lang.Long) r1
                r11 = r1
                goto L_0x009a
            L_0x0099:
                r11 = r3
            L_0x009a:
                java.lang.String r1 = "KidMode"
                com.miot.common.property.Property r1 = r0.getProperty(r1)
                boolean r2 = r1.isValueValid()
                if (r2 == 0) goto L_0x00ae
                java.lang.Object r1 = r1.getValue()
                java.lang.Long r1 = (java.lang.Long) r1
                r12 = r1
                goto L_0x00af
            L_0x00ae:
                r12 = r3
            L_0x00af:
                java.lang.String r1 = "FlowParams"
                com.miot.common.property.Property r1 = r0.getProperty(r1)
                boolean r2 = r1.isValueValid()
                if (r2 == 0) goto L_0x00c3
                java.lang.Object r1 = r1.getValue()
                java.lang.String r1 = (java.lang.String) r1
                r13 = r1
                goto L_0x00c4
            L_0x00c3:
                r13 = r3
            L_0x00c4:
                java.lang.String r1 = "SaveState"
                com.miot.common.property.Property r1 = r0.getProperty(r1)
                boolean r2 = r1.isValueValid()
                if (r2 == 0) goto L_0x00d8
                java.lang.Object r1 = r1.getValue()
                java.lang.Long r1 = (java.lang.Long) r1
                r14 = r1
                goto L_0x00d9
            L_0x00d8:
                r14 = r3
            L_0x00d9:
                java.lang.String r1 = "onFromPower"
                com.miot.common.property.Property r1 = r0.getProperty(r1)
                boolean r2 = r1.isValueValid()
                if (r2 == 0) goto L_0x00ed
                java.lang.Object r1 = r1.getValue()
                java.lang.Long r1 = (java.lang.Long) r1
                r15 = r1
                goto L_0x00ee
            L_0x00ed:
                r15 = r3
            L_0x00ee:
                java.lang.String r1 = "ShortKeyAction"
                com.miot.common.property.Property r1 = r0.getProperty(r1)
                boolean r2 = r1.isValueValid()
                if (r2 == 0) goto L_0x0103
                java.lang.Object r1 = r1.getValue()
                java.lang.Long r1 = (java.lang.Long) r1
                r16 = r1
                goto L_0x0105
            L_0x0103:
                r16 = r3
            L_0x0105:
                java.lang.String r1 = "ShortKeySceneName"
                com.miot.common.property.Property r1 = r0.getProperty(r1)
                boolean r2 = r1.isValueValid()
                if (r2 == 0) goto L_0x011a
                java.lang.Object r1 = r1.getValue()
                java.lang.String r1 = (java.lang.String) r1
                r17 = r1
                goto L_0x011c
            L_0x011a:
                r17 = r3
            L_0x011c:
                java.lang.String r1 = "Flowing"
                com.miot.common.property.Property r0 = r0.getProperty(r1)
                boolean r1 = r0.isValueValid()
                if (r1 == 0) goto L_0x012f
                java.lang.Object r0 = r0.getValue()
                r3 = r0
                java.lang.Long r3 = (java.lang.Long) r3
            L_0x012f:
                r0 = r19
                r18 = r3
                com.yeelight.yeelib.device.xiaomi.Lamp2Service$r0 r4 = r0.f13624a
                r4.mo33937a(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.xiaomi.Lamp2Service.C7474a0.onSucceed(com.miot.common.device.invocation.PropertyInfo):void");
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp2Service$b */
    class C7475b implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7492j0 f13625a;

        C7475b(Lamp2Service lamp2Service, C7492j0 j0Var) {
            this.f13625a = j0Var;
        }

        public void onFailed(int i, String str) {
            this.f13625a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("DelayOff");
            if (property.isValueValid()) {
                this.f13625a.mo33921a((Long) propertyInfo.getValue("DelayOff"));
                return;
            }
            C7492j0 j0Var = this.f13625a;
            j0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp2Service$b0 */
    class C7476b0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7506q0 f13626a;

        C7476b0(Lamp2Service lamp2Service, C7506q0 q0Var) {
            this.f13626a = q0Var;
        }

        public void onFailed(int i, String str) {
            this.f13626a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Power");
            if (property.isValueValid()) {
                this.f13626a.mo33935a(Power.valueOf((String) propertyInfo.getValue("Power")));
                return;
            }
            C7506q0 q0Var = this.f13626a;
            q0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp2Service$c */
    class C7477c implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7498m0 f13627a;

        C7477c(Lamp2Service lamp2Service, C7498m0 m0Var) {
            this.f13627a = m0Var;
        }

        public void onFailed(int i, String str) {
            this.f13627a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("KidMode");
            if (property.isValueValid()) {
                this.f13627a.mo33927a((Long) propertyInfo.getValue("KidMode"));
                return;
            }
            C7498m0 m0Var = this.f13627a;
            m0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp2Service$c0 */
    class C7478c0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7486g0 f13628a;

        C7478c0(Lamp2Service lamp2Service, C7486g0 g0Var) {
            this.f13628a = g0Var;
        }

        public void onFailed(int i, String str) {
            this.f13628a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Bright");
            if (property.isValueValid()) {
                this.f13628a.mo33915a((Long) propertyInfo.getValue("Bright"));
                return;
            }
            C7486g0 g0Var = this.f13628a;
            g0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp2Service$d */
    class C7479d implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7494k0 f13629a;

        C7479d(Lamp2Service lamp2Service, C7494k0 k0Var) {
            this.f13629a = k0Var;
        }

        public void onFailed(int i, String str) {
            this.f13629a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("FlowParams");
            if (property.isValueValid()) {
                this.f13629a.onSucceed((String) propertyInfo.getValue("FlowParams"));
                return;
            }
            C7494k0 k0Var = this.f13629a;
            k0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp2Service$d0 */
    class C7480d0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7488h0 f13630a;

        C7480d0(Lamp2Service lamp2Service, C7488h0 h0Var) {
            this.f13630a = h0Var;
        }

        public void onFailed(int i, String str) {
            this.f13630a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Ct");
            if (property.isValueValid()) {
                this.f13630a.mo33917a((Long) propertyInfo.getValue("Ct"));
                return;
            }
            C7488h0 h0Var = this.f13630a;
            h0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp2Service$e */
    class C7481e implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7510s0 f13631a;

        C7481e(Lamp2Service lamp2Service, C7510s0 s0Var) {
            this.f13631a = s0Var;
        }

        public void onFailed(int i, String str) {
            this.f13631a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("SaveState");
            if (property.isValueValid()) {
                this.f13631a.mo33939a((Long) propertyInfo.getValue("SaveState"));
                return;
            }
            C7510s0 s0Var = this.f13631a;
            s0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp2Service$e0 */
    class C7482e0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7502o0 f13632a;

        C7482e0(Lamp2Service lamp2Service, C7502o0 o0Var) {
            this.f13632a = o0Var;
        }

        public void onFailed(int i, String str) {
            this.f13632a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("PdoStatus");
            if (property.isValueValid()) {
                this.f13632a.mo33931a((Long) propertyInfo.getValue("PdoStatus"));
                return;
            }
            C7502o0 o0Var = this.f13632a;
            o0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp2Service$f */
    class C7483f implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7516v0 f13633a;

        C7483f(Lamp2Service lamp2Service, C7516v0 v0Var) {
            this.f13633a = v0Var;
        }

        public void onFailed(int i, String str) {
            this.f13633a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("onFromPower");
            if (property.isValueValid()) {
                this.f13633a.mo33945a((Long) propertyInfo.getValue("onFromPower"));
                return;
            }
            C7516v0 v0Var = this.f13633a;
            v0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp2Service$f0 */
    class C7484f0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7504p0 f13634a;

        C7484f0(Lamp2Service lamp2Service, C7504p0 p0Var) {
            this.f13634a = p0Var;
        }

        public void onFailed(int i, String str) {
            this.f13634a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("PdoWorkTime");
            if (property.isValueValid()) {
                this.f13634a.mo33933a((Long) propertyInfo.getValue("PdoWorkTime"));
                return;
            }
            C7504p0 p0Var = this.f13634a;
            p0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp2Service$g */
    class C7485g implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7512t0 f13635a;

        C7485g(Lamp2Service lamp2Service, C7512t0 t0Var) {
            this.f13635a = t0Var;
        }

        public void onFailed(int i, String str) {
            this.f13635a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("ShortKeyAction");
            if (property.isValueValid()) {
                this.f13635a.mo33941a((Long) propertyInfo.getValue("ShortKeyAction"));
                return;
            }
            C7512t0 t0Var = this.f13635a;
            t0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp2Service$g0 */
    public interface C7486g0 {
        /* renamed from: a */
        void mo33915a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp2Service$h */
    class C7487h implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7514u0 f13636a;

        C7487h(Lamp2Service lamp2Service, C7514u0 u0Var) {
            this.f13636a = u0Var;
        }

        public void onFailed(int i, String str) {
            this.f13636a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("ShortKeySceneName");
            if (property.isValueValid()) {
                this.f13636a.onSucceed((String) propertyInfo.getValue("ShortKeySceneName"));
                return;
            }
            C7514u0 u0Var = this.f13636a;
            u0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp2Service$h0 */
    public interface C7488h0 {
        /* renamed from: a */
        void mo33917a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp2Service$i */
    class C7489i implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7496l0 f13637a;

        C7489i(Lamp2Service lamp2Service, C7496l0 l0Var) {
            this.f13637a = l0Var;
        }

        public void onFailed(int i, String str) {
            this.f13637a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Flowing");
            if (property.isValueValid()) {
                this.f13637a.mo33925a((Long) propertyInfo.getValue("Flowing"));
                return;
            }
            C7496l0 l0Var = this.f13637a;
            l0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp2Service$i0 */
    public interface C7490i0 {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp2Service$j */
    class C7491j implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13638a;

        C7491j(Lamp2Service lamp2Service, CompletionHandler completionHandler) {
            this.f13638a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13638a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13638a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp2Service$j0 */
    public interface C7492j0 {
        /* renamed from: a */
        void mo33921a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp2Service$k */
    class C7493k implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13639a;

        C7493k(Lamp2Service lamp2Service, CompletionHandler completionHandler) {
            this.f13639a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13639a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f13639a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp2Service$k0 */
    public interface C7494k0 {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp2Service$l */
    class C7495l implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13640a;

        C7495l(Lamp2Service lamp2Service, CompletionHandler completionHandler) {
            this.f13640a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13640a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13640a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp2Service$l0 */
    public interface C7496l0 {
        /* renamed from: a */
        void mo33925a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp2Service$m */
    class C7497m implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13641a;

        C7497m(Lamp2Service lamp2Service, CompletionHandler completionHandler) {
            this.f13641a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13641a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13641a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp2Service$m0 */
    public interface C7498m0 {
        /* renamed from: a */
        void mo33927a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp2Service$n */
    class C7499n implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13642a;

        C7499n(Lamp2Service lamp2Service, CompletionHandler completionHandler) {
            this.f13642a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13642a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13642a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp2Service$n0 */
    public interface C7500n0 {
        /* renamed from: a */
        void mo33929a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp2Service$o */
    class C7501o implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13643a;

        C7501o(Lamp2Service lamp2Service, CompletionHandler completionHandler) {
            this.f13643a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13643a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13643a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp2Service$o0 */
    public interface C7502o0 {
        /* renamed from: a */
        void mo33931a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp2Service$p */
    class C7503p implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13644a;

        C7503p(Lamp2Service lamp2Service, CompletionHandler completionHandler) {
            this.f13644a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13644a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13644a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp2Service$p0 */
    public interface C7504p0 {
        /* renamed from: a */
        void mo33933a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp2Service$q */
    class C7505q implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13645a;

        C7505q(Lamp2Service lamp2Service, CompletionHandler completionHandler) {
            this.f13645a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13645a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13645a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp2Service$q0 */
    public interface C7506q0 {
        /* renamed from: a */
        void mo33935a(Power power);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp2Service$r */
    class C7507r implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13646a;

        C7507r(Lamp2Service lamp2Service, CompletionHandler completionHandler) {
            this.f13646a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13646a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13646a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp2Service$r0 */
    public interface C7508r0 {
        /* renamed from: a */
        void mo33937a(Power power, Long l, Long l2, Long l3, Long l4, Long l5, Long l6, Long l7, String str, Long l8, Long l9, Long l10, String str2, Long l11);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp2Service$s */
    class C7509s implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13647a;

        C7509s(Lamp2Service lamp2Service, CompletionHandler completionHandler) {
            this.f13647a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13647a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13647a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp2Service$s0 */
    public interface C7510s0 {
        /* renamed from: a */
        void mo33939a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp2Service$t */
    class C7511t implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13648a;

        C7511t(Lamp2Service lamp2Service, CompletionHandler completionHandler) {
            this.f13648a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13648a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13648a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp2Service$t0 */
    public interface C7512t0 {
        /* renamed from: a */
        void mo33941a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp2Service$u */
    class C7513u implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13649a;

        C7513u(Lamp2Service lamp2Service, CompletionHandler completionHandler) {
            this.f13649a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13649a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13649a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp2Service$u0 */
    public interface C7514u0 {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp2Service$v */
    class C7515v implements DeviceManipulator.PropertyChangedListener {

        /* renamed from: a */
        final /* synthetic */ C7518w0 f13650a;

        C7515v(Lamp2Service lamp2Service, C7518w0 w0Var) {
            this.f13650a = w0Var;
        }

        public void onPropertyChanged(PropertyInfo propertyInfo, String str) {
            PropertyInfo propertyInfo2 = propertyInfo;
            String str2 = str;
            str.hashCode();
            char c = 65535;
            switch (str.hashCode()) {
                case -2117953292:
                    if (str2.equals("SaveState")) {
                        c = 0;
                        break;
                    }
                    break;
                case -2096941615:
                    if (str2.equals("PdoBreakTime")) {
                        c = 1;
                        break;
                    }
                    break;
                case -2002016140:
                    if (str2.equals("FlowParams")) {
                        c = 2;
                        break;
                    }
                    break;
                case 2193:
                    if (str2.equals("Ct")) {
                        c = 3;
                        break;
                    }
                    break;
                case 35911772:
                    if (str2.equals("onFromPower")) {
                        c = 4;
                        break;
                    }
                    break;
                case 77306085:
                    if (str2.equals("Power")) {
                        c = 5;
                        break;
                    }
                    break;
                case 880790796:
                    if (str2.equals("DelayOff")) {
                        c = 6;
                        break;
                    }
                    break;
                case 898856916:
                    if (str2.equals("Flowing")) {
                        c = 7;
                        break;
                    }
                    break;
                case 944116073:
                    if (str2.equals("KidMode")) {
                        c = 8;
                        break;
                    }
                    break;
                case 1136799609:
                    if (str2.equals("PdoWorkTime")) {
                        c = 9;
                        break;
                    }
                    break;
                case 1834919085:
                    if (str2.equals("PdoStatus")) {
                        c = 10;
                        break;
                    }
                    break;
                case 1998035738:
                    if (str2.equals("Bright")) {
                        c = 11;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    if (propertyInfo2.getProperty("SaveState").isValueValid()) {
                        this.f13650a.mo33949c((Long) propertyInfo2.getValue("SaveState"));
                        return;
                    }
                    return;
                case 1:
                    if (propertyInfo2.getProperty("PdoBreakTime").isValueValid()) {
                        this.f13650a.mo33955j((Long) propertyInfo2.getValue("PdoBreakTime"));
                        return;
                    }
                    return;
                case 2:
                    if (propertyInfo2.getProperty("FlowParams").isValueValid()) {
                        this.f13650a.mo33951e((String) propertyInfo2.getValue("FlowParams"));
                        return;
                    }
                    return;
                case 3:
                    if (propertyInfo2.getProperty("Ct").isValueValid()) {
                        this.f13650a.mo33953h((Long) propertyInfo2.getValue("Ct"));
                        return;
                    }
                    return;
                case 4:
                    if (propertyInfo2.getProperty("onFromPower").isValueValid()) {
                        this.f13650a.mo33952f((Long) propertyInfo2.getValue("onFromPower"));
                        return;
                    }
                    return;
                case 5:
                    if (propertyInfo2.getProperty("Power").isValueValid()) {
                        this.f13650a.mo33958m(Power.valueOf((String) propertyInfo2.getValue("Power")));
                        return;
                    }
                    return;
                case 6:
                    if (propertyInfo2.getProperty("DelayOff").isValueValid()) {
                        this.f13650a.mo33948b((Long) propertyInfo2.getValue("DelayOff"));
                        return;
                    }
                    return;
                case 7:
                    if (propertyInfo2.getProperty("Flowing").isValueValid()) {
                        this.f13650a.mo33950d((Long) propertyInfo2.getValue("Flowing"));
                        return;
                    }
                    return;
                case 8:
                    if (propertyInfo2.getProperty("KidMode").isValueValid()) {
                        this.f13650a.mo33954i((Long) propertyInfo2.getValue("KidMode"));
                        return;
                    }
                    return;
                case 9:
                    if (propertyInfo2.getProperty("PdoWorkTime").isValueValid()) {
                        this.f13650a.mo33956k((Long) propertyInfo2.getValue("PdoWorkTime"));
                        return;
                    }
                    return;
                case 10:
                    if (propertyInfo2.getProperty("PdoStatus").isValueValid()) {
                        this.f13650a.mo33957l((Long) propertyInfo2.getValue("PdoStatus"));
                        return;
                    }
                    return;
                case 11:
                    if (propertyInfo2.getProperty("Bright").isValueValid()) {
                        this.f13650a.mo33947a((Long) propertyInfo2.getValue("Bright"));
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp2Service$v0 */
    public interface C7516v0 {
        /* renamed from: a */
        void mo33945a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp2Service$w */
    class C7517w implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13651a;

        C7517w(Lamp2Service lamp2Service, CompletionHandler completionHandler) {
            this.f13651a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13651a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13651a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp2Service$w0 */
    public interface C7518w0 {
        /* renamed from: a */
        void mo33947a(Long l);

        /* renamed from: b */
        void mo33948b(Long l);

        /* renamed from: c */
        void mo33949c(Long l);

        /* renamed from: d */
        void mo33950d(Long l);

        /* renamed from: e */
        void mo33951e(String str);

        /* renamed from: f */
        void mo33952f(Long l);

        /* renamed from: h */
        void mo33953h(Long l);

        /* renamed from: i */
        void mo33954i(Long l);

        /* renamed from: j */
        void mo33955j(Long l);

        /* renamed from: k */
        void mo33956k(Long l);

        /* renamed from: l */
        void mo33957l(Long l);

        /* renamed from: m */
        void mo33958m(Power power);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp2Service$x */
    class C7519x implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13652a;

        C7519x(Lamp2Service lamp2Service, CompletionHandler completionHandler) {
            this.f13652a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13652a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13652a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp2Service$y */
    class C7520y implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7490i0 f13653a;

        C7520y(Lamp2Service lamp2Service, C7490i0 i0Var) {
            this.f13653a = i0Var;
        }

        public void onFailed(int i, String str) {
            this.f13653a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            Object argumentValue = actionInfo.getArgumentValue("CmdResp");
            this.f13653a.onSucceed(argumentValue != null ? (String) argumentValue : null);
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp2Service$z */
    class C7521z implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13654a;

        C7521z(Lamp2Service lamp2Service, CompletionHandler completionHandler) {
            this.f13654a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13654a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f13654a.onSucceed();
        }
    }

    public Lamp2Service(AbstractDevice abstractDevice) {
        this.mDevice = abstractDevice;
    }

    public void addCron(Long l, Long l2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "addCron");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("CronType", l)) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("DelayOff", l2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C7507r(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void delCron(Long l, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "delCron");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (create.setArgumentValue("CronType", l)) {
                MiotManager.getDeviceManipulator().invoke(create, new C7495l(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getBright(C7486g0 g0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Bright"), new C7478c0(this, g0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getCron(Long l, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "getCron");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (create.setArgumentValue("CronType", l)) {
                MiotManager.getDeviceManipulator().invoke(create, new C7519x(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getCt(C7488h0 h0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Ct"), new C7480d0(this, h0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getData(CmdKey cmdKey, String str, C7490i0 i0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "getData");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("CmdKey", cmdKey.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("CmdValue", str)) {
                MiotManager.getDeviceManipulator().invoke(create, new C7520y(this, i0Var));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getDelayOff(C7492j0 j0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "DelayOff"), new C7475b(this, j0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowParams(C7494k0 k0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "FlowParams"), new C7479d(this, k0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowing(C7496l0 l0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Flowing"), new C7489i(this, l0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getKidMode(C7498m0 m0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "KidMode"), new C7477c(this, m0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getPdoBreakTime(C7500n0 n0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "PdoBreakTime"), new C7473a(this, n0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getPdoStatus(C7502o0 o0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "PdoStatus"), new C7482e0(this, o0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getPdoWorkTime(C7504p0 p0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "PdoWorkTime"), new C7484f0(this, p0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getPower(C7506q0 q0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Power"), new C7476b0(this, q0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getProperties(C7508r0 r0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            PropertyInfo create = PropertyInfoFactory.create(getService());
            create.addProperty(getService().getProperty("Power"));
            create.addProperty(getService().getProperty("Bright"));
            create.addProperty(getService().getProperty("Ct"));
            create.addProperty(getService().getProperty("PdoStatus"));
            create.addProperty(getService().getProperty("PdoWorkTime"));
            create.addProperty(getService().getProperty("PdoBreakTime"));
            create.addProperty(getService().getProperty("DelayOff"));
            create.addProperty(getService().getProperty("KidMode"));
            create.addProperty(getService().getProperty("FlowParams"));
            create.addProperty(getService().getProperty("SaveState"));
            create.addProperty(getService().getProperty("onFromPower"));
            create.addProperty(getService().getProperty("ShortKeyAction"));
            create.addProperty(getService().getProperty("ShortKeySceneName"));
            create.addProperty(getService().getProperty("Flowing"));
            MiotManager.getDeviceManipulator().readProperty(create, new C7474a0(this, r0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getSaveState(C7510s0 s0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "SaveState"), new C7481e(this, s0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getShortKeyAction(C7512t0 t0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "ShortKeyAction"), new C7485g(this, t0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getShortKeySceneName(C7514u0 u0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "ShortKeySceneName"), new C7487h(this, u0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getonFromPower(C7516v0 v0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "onFromPower"), new C7483f(this, v0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void openWithMode(Power power, Effect effect, Long l, Long l2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "openWithMode");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("Power", power.toString())) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Effect", effect.toString())) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Duration", l)) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("Mode", l2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C7501o(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void restore(CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "restore");
            if (create != null) {
                MiotManager.getDeviceManipulator().invoke(create, new C7497m(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7511t(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setBright(Long l, Effect effect, Long l2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setBright");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("Bright", l)) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Effect", effect.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("Duration", l2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C7491j(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setCt(Long l, Effect effect, Long l2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setCt");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("Ct", l)) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Effect", effect.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("Duration", l2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C7517w(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7509s(this, completionHandler));
                return;
            }
            throw new MiotException("actionInfo is null");
        }
        throw new MiotException("device not configurated connection");
    }

    public void setFlowScene(String str, Long l, Long l2, String str2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setFlowScene");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("ParamModel", str)) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("ParamCount", l)) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("ParamFinish", l2)) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("ParamColors", str2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C7513u(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setPower(Power power, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setPower");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (create.setArgumentValue("Power", power.toString())) {
                MiotManager.getDeviceManipulator().invoke(create, new C7503p(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setScene(String str, Long l, Long l2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setScene");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("ParamModel", str)) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("ParamCount", l)) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("ParamFinish", l2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C7499n(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void subscribeNotifications(CompletionHandler completionHandler, C7518w0 w0Var) {
        if (completionHandler == null) {
            throw new IllegalArgumentException("handler is null");
        } else if (w0Var != null) {
            PropertyInfo create = PropertyInfoFactory.create(getService());
            for (Property next : getService().getProperties()) {
                if (next.getDefinition().isNotifiable()) {
                    create.addProperty(next);
                }
            }
            MiotManager.getDeviceManipulator().addPropertyChangedListener(create, new C7493k(this, completionHandler), new C7515v(this, w0Var));
        } else {
            throw new IllegalArgumentException("listener is null");
        }
    }

    public void toggle(CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "toggle");
            if (create != null) {
                MiotManager.getDeviceManipulator().invoke(create, new C7505q(this, completionHandler));
                return;
            }
            throw new MiotException("actionInfo is null");
        }
        throw new MiotException("device not configurated connection");
    }

    public void unsubscribeNotifications(CompletionHandler completionHandler) {
        if (completionHandler != null) {
            PropertyInfo create = PropertyInfoFactory.create(getService());
            for (Property next : getService().getProperties()) {
                if (next.getDefinition().isNotifiable()) {
                    create.addProperty(next);
                }
            }
            MiotManager.getDeviceManipulator().removePropertyChangedListener(create, new C7521z(this, completionHandler));
            return;
        }
        throw new IllegalArgumentException("handler is null");
    }
}
