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

public class Ceiling6Service extends AbstractService {
    public static final String ACTION_addCron = "addCron";
    public static final String ACTION_delCron = "delCron";
    public static final String ACTION_getCron = "getCron";
    public static final String ACTION_openWithMode = "openWithMode";
    public static final String ACTION_restore = "restore";
    public static final String ACTION_sendCmd = "sendCmd";
    public static final String ACTION_setBright = "setBright";
    public static final String ACTION_setCt = "setCt";
    public static final String ACTION_setDefault = "setDefault";
    public static final String ACTION_setFlowScene = "setFlowScene";
    public static final String ACTION_setNLScene = "setNLScene";
    public static final String ACTION_setPower = "setPower";
    public static final String ACTION_setScene = "setScene";
    public static final String ACTION_setadjust = "setadjust";
    public static final String ACTION_toggle = "toggle";
    public static final String PROPERTY_Bright = "Bright";
    public static final String PROPERTY_CmdKey = "CmdKey";
    public static final String PROPERTY_CmdValue = "CmdValue";
    public static final String PROPERTY_CronType = "CronType";
    public static final String PROPERTY_Ct = "Ct";
    public static final String PROPERTY_DelayOff = "DelayOff";
    public static final String PROPERTY_Duration = "Duration";
    public static final String PROPERTY_Effect = "Effect";
    public static final String PROPERTY_FlowParams = "FlowParams";
    public static final String PROPERTY_Flowing = "Flowing";
    public static final String PROPERTY_LanMode = "LanMode";
    public static final String PROPERTY_MiBandSleep = "MiBandSleep";
    public static final String PROPERTY_Mode = "Mode";
    public static final String PROPERTY_NLBright = "NLBright";
    public static final String PROPERTY_NightTimeInfo = "NightTimeInfo";
    public static final String PROPERTY_ParamColors = "ParamColors";
    public static final String PROPERTY_ParamCount = "ParamCount";
    public static final String PROPERTY_ParamFinish = "ParamFinish";
    public static final String PROPERTY_ParamModel = "ParamModel";
    public static final String PROPERTY_Power = "Power";
    public static final String PROPERTY_SaveState = "SaveState";
    public static final String PROPERTY_SmartSwitch = "SmartSwitch";
    public static final String PROPERTY_adjustAction = "adjustAction";
    public static final String PROPERTY_adjustProper = "adjustProper";
    public static final String PROPERTY_onFromPower = "onFromPower";
    private static final String TAG = "Ceiling6Service";
    private AbstractDevice mDevice = null;

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling6Service$a */
    class C8247a implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8274n0 f16223a;

        C8247a(Ceiling6Service ceiling6Service, C8274n0 n0Var) {
            this.f16223a = n0Var;
        }

        public void onFailed(int i, String str) {
            this.f16223a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("LanMode");
            if (property.isValueValid()) {
                this.f16223a.mo29809a((Long) propertyInfo.getValue("LanMode"));
                return;
            }
            C8274n0 n0Var = this.f16223a;
            n0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling6Service$a0 */
    class C8248a0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8284s0 f16224a;

        C8248a0(Ceiling6Service ceiling6Service, C8284s0 s0Var) {
            this.f16224a = s0Var;
        }

        public void onFailed(int i, String str) {
            this.f16224a.onFailed(i, str);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.Long} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onSucceed(com.miot.common.device.invocation.PropertyInfo r19) {
            /*
                r18 = this;
                r0 = r19
                java.lang.String r1 = "Power"
                com.miot.common.property.Property r1 = r0.getProperty(r1)
                boolean r2 = r1.isValueValid()
                r3 = 0
                if (r2 == 0) goto L_0x001b
                java.lang.Object r1 = r1.getValue()
                java.lang.String r1 = (java.lang.String) r1
                com.yeelight.yeelib.device.xiaomi.Ceiling6Service$w0 r1 = com.yeelight.yeelib.device.xiaomi.Ceiling6Service.C8292w0.valueOf(r1)
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
                java.lang.String r1 = "DelayOff"
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
                java.lang.String r1 = "FlowParams"
                com.miot.common.property.Property r1 = r0.getProperty(r1)
                boolean r2 = r1.isValueValid()
                if (r2 == 0) goto L_0x006f
                java.lang.Object r1 = r1.getValue()
                java.lang.String r1 = (java.lang.String) r1
                r9 = r1
                goto L_0x0070
            L_0x006f:
                r9 = r3
            L_0x0070:
                java.lang.String r1 = "LanMode"
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
                java.lang.String r1 = "SaveState"
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
                java.lang.String r1 = "onFromPower"
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
                java.lang.String r1 = "NLBright"
                com.miot.common.property.Property r1 = r0.getProperty(r1)
                boolean r2 = r1.isValueValid()
                if (r2 == 0) goto L_0x00c3
                java.lang.Object r1 = r1.getValue()
                java.lang.Long r1 = (java.lang.Long) r1
                r13 = r1
                goto L_0x00c4
            L_0x00c3:
                r13 = r3
            L_0x00c4:
                java.lang.String r1 = "NightTimeInfo"
                com.miot.common.property.Property r1 = r0.getProperty(r1)
                boolean r2 = r1.isValueValid()
                if (r2 == 0) goto L_0x00d8
                java.lang.Object r1 = r1.getValue()
                java.lang.String r1 = (java.lang.String) r1
                r14 = r1
                goto L_0x00d9
            L_0x00d8:
                r14 = r3
            L_0x00d9:
                java.lang.String r1 = "MiBandSleep"
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
                java.lang.String r1 = "Flowing"
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
                java.lang.String r1 = "SmartSwitch"
                com.miot.common.property.Property r0 = r0.getProperty(r1)
                boolean r1 = r0.isValueValid()
                if (r1 == 0) goto L_0x0118
                java.lang.Object r0 = r0.getValue()
                r3 = r0
                java.lang.Long r3 = (java.lang.Long) r3
            L_0x0118:
                r0 = r18
                r17 = r3
                com.yeelight.yeelib.device.xiaomi.Ceiling6Service$s0 r4 = r0.f16224a
                r4.mo28547a(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.xiaomi.Ceiling6Service.C8248a0.onSucceed(com.miot.common.device.invocation.PropertyInfo):void");
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling6Service$b */
    class C8249b implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8286t0 f16225a;

        C8249b(Ceiling6Service ceiling6Service, C8286t0 t0Var) {
            this.f16225a = t0Var;
        }

        public void onFailed(int i, String str) {
            this.f16225a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("SaveState");
            if (property.isValueValid()) {
                this.f16225a.mo29819a((Long) propertyInfo.getValue("SaveState"));
                return;
            }
            C8286t0 t0Var = this.f16225a;
            t0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling6Service$b0 */
    class C8250b0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8282r0 f16226a;

        C8250b0(Ceiling6Service ceiling6Service, C8282r0 r0Var) {
            this.f16226a = r0Var;
        }

        public void onFailed(int i, String str) {
            this.f16226a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Power");
            if (property.isValueValid()) {
                this.f16226a.mo29817a(C8292w0.valueOf((String) propertyInfo.getValue("Power")));
                return;
            }
            C8282r0 r0Var = this.f16226a;
            r0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling6Service$c */
    class C8251c implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8290v0 f16227a;

        C8251c(Ceiling6Service ceiling6Service, C8290v0 v0Var) {
            this.f16227a = v0Var;
        }

        public void onFailed(int i, String str) {
            this.f16227a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("onFromPower");
            if (property.isValueValid()) {
                this.f16227a.mo29823a((Long) propertyInfo.getValue("onFromPower"));
                return;
            }
            C8290v0 v0Var = this.f16227a;
            v0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling6Service$c0 */
    class C8252c0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8264i0 f16228a;

        C8252c0(Ceiling6Service ceiling6Service, C8264i0 i0Var) {
            this.f16228a = i0Var;
        }

        public void onFailed(int i, String str) {
            this.f16228a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Bright");
            if (property.isValueValid()) {
                this.f16228a.mo29799a((Long) propertyInfo.getValue("Bright"));
                return;
            }
            C8264i0 i0Var = this.f16228a;
            i0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling6Service$d */
    class C8253d implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8278p0 f16229a;

        C8253d(Ceiling6Service ceiling6Service, C8278p0 p0Var) {
            this.f16229a = p0Var;
        }

        public void onFailed(int i, String str) {
            this.f16229a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("NLBright");
            if (property.isValueValid()) {
                this.f16229a.mo29813a((Long) propertyInfo.getValue("NLBright"));
                return;
            }
            C8278p0 p0Var = this.f16229a;
            p0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling6Service$d0 */
    class C8254d0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8266j0 f16230a;

        C8254d0(Ceiling6Service ceiling6Service, C8266j0 j0Var) {
            this.f16230a = j0Var;
        }

        public void onFailed(int i, String str) {
            this.f16230a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Ct");
            if (property.isValueValid()) {
                this.f16230a.mo29801a((Long) propertyInfo.getValue("Ct"));
                return;
            }
            C8266j0 j0Var = this.f16230a;
            j0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling6Service$e */
    class C8255e implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8280q0 f16231a;

        C8255e(Ceiling6Service ceiling6Service, C8280q0 q0Var) {
            this.f16231a = q0Var;
        }

        public void onFailed(int i, String str) {
            this.f16231a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("NightTimeInfo");
            if (property.isValueValid()) {
                this.f16231a.onSucceed((String) propertyInfo.getValue("NightTimeInfo"));
                return;
            }
            C8280q0 q0Var = this.f16231a;
            q0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling6Service$e0 */
    class C8256e0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8268k0 f16232a;

        C8256e0(Ceiling6Service ceiling6Service, C8268k0 k0Var) {
            this.f16232a = k0Var;
        }

        public void onFailed(int i, String str) {
            this.f16232a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("DelayOff");
            if (property.isValueValid()) {
                this.f16232a.mo29803a((Long) propertyInfo.getValue("DelayOff"));
                return;
            }
            C8268k0 k0Var = this.f16232a;
            k0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling6Service$f */
    class C8257f implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8276o0 f16233a;

        C8257f(Ceiling6Service ceiling6Service, C8276o0 o0Var) {
            this.f16233a = o0Var;
        }

        public void onFailed(int i, String str) {
            this.f16233a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("MiBandSleep");
            if (property.isValueValid()) {
                this.f16233a.mo29811a((Long) propertyInfo.getValue("MiBandSleep"));
                return;
            }
            C8276o0 o0Var = this.f16233a;
            o0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling6Service$f0 */
    class C8258f0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8270l0 f16234a;

        C8258f0(Ceiling6Service ceiling6Service, C8270l0 l0Var) {
            this.f16234a = l0Var;
        }

        public void onFailed(int i, String str) {
            this.f16234a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("FlowParams");
            if (property.isValueValid()) {
                this.f16234a.onSucceed((String) propertyInfo.getValue("FlowParams"));
                return;
            }
            C8270l0 l0Var = this.f16234a;
            l0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling6Service$g */
    class C8259g implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8272m0 f16235a;

        C8259g(Ceiling6Service ceiling6Service, C8272m0 m0Var) {
            this.f16235a = m0Var;
        }

        public void onFailed(int i, String str) {
            this.f16235a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Flowing");
            if (property.isValueValid()) {
                this.f16235a.mo29807a((Long) propertyInfo.getValue("Flowing"));
                return;
            }
            C8272m0 m0Var = this.f16235a;
            m0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling6Service$g0 */
    public enum C8260g0 {
        undefined,
        cfg_pomodoro,
        cfg_lan_ctrl,
        cfg_save_state,
        nighttime,
        nightlight,
        miband_sleep,
        pseudo_beacon,
        cfg_init_power,
        cfg_smart_switch
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling6Service$h */
    class C8261h implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8288u0 f16247a;

        C8261h(Ceiling6Service ceiling6Service, C8288u0 u0Var) {
            this.f16247a = u0Var;
        }

        public void onFailed(int i, String str) {
            this.f16247a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("SmartSwitch");
            if (property.isValueValid()) {
                this.f16247a.mo29821a((Long) propertyInfo.getValue("SmartSwitch"));
                return;
            }
            C8288u0 u0Var = this.f16247a;
            u0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling6Service$h0 */
    public enum C8262h0 {
        undefined,
        smooth,
        sudden
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling6Service$i */
    class C8263i implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16252a;

        C8263i(Ceiling6Service ceiling6Service, CompletionHandler completionHandler) {
            this.f16252a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16252a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16252a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling6Service$i0 */
    public interface C8264i0 {
        /* renamed from: a */
        void mo29799a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling6Service$j */
    class C8265j implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16253a;

        C8265j(Ceiling6Service ceiling6Service, CompletionHandler completionHandler) {
            this.f16253a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16253a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16253a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling6Service$j0 */
    public interface C8266j0 {
        /* renamed from: a */
        void mo29801a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling6Service$k */
    class C8267k implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16254a;

        C8267k(Ceiling6Service ceiling6Service, CompletionHandler completionHandler) {
            this.f16254a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16254a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f16254a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling6Service$k0 */
    public interface C8268k0 {
        /* renamed from: a */
        void mo29803a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling6Service$l */
    class C8269l implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16255a;

        C8269l(Ceiling6Service ceiling6Service, CompletionHandler completionHandler) {
            this.f16255a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16255a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16255a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling6Service$l0 */
    public interface C8270l0 {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling6Service$m */
    class C8271m implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16256a;

        C8271m(Ceiling6Service ceiling6Service, CompletionHandler completionHandler) {
            this.f16256a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16256a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16256a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling6Service$m0 */
    public interface C8272m0 {
        /* renamed from: a */
        void mo29807a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling6Service$n */
    class C8273n implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16257a;

        C8273n(Ceiling6Service ceiling6Service, CompletionHandler completionHandler) {
            this.f16257a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16257a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16257a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling6Service$n0 */
    public interface C8274n0 {
        /* renamed from: a */
        void mo29809a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling6Service$o */
    class C8275o implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16258a;

        C8275o(Ceiling6Service ceiling6Service, CompletionHandler completionHandler) {
            this.f16258a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16258a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16258a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling6Service$o0 */
    public interface C8276o0 {
        /* renamed from: a */
        void mo29811a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling6Service$p */
    class C8277p implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16259a;

        C8277p(Ceiling6Service ceiling6Service, CompletionHandler completionHandler) {
            this.f16259a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16259a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16259a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling6Service$p0 */
    public interface C8278p0 {
        /* renamed from: a */
        void mo29813a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling6Service$q */
    class C8279q implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16260a;

        C8279q(Ceiling6Service ceiling6Service, CompletionHandler completionHandler) {
            this.f16260a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16260a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16260a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling6Service$q0 */
    public interface C8280q0 {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling6Service$r */
    class C8281r implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16261a;

        C8281r(Ceiling6Service ceiling6Service, CompletionHandler completionHandler) {
            this.f16261a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16261a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16261a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling6Service$r0 */
    public interface C8282r0 {
        /* renamed from: a */
        void mo29817a(C8292w0 w0Var);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling6Service$s */
    class C8283s implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16262a;

        C8283s(Ceiling6Service ceiling6Service, CompletionHandler completionHandler) {
            this.f16262a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16262a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16262a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling6Service$s0 */
    public interface C8284s0 {
        /* renamed from: a */
        void mo28547a(C8292w0 w0Var, Long l, Long l2, Long l3, String str, Long l4, Long l5, Long l6, Long l7, String str2, Long l8, Long l9, Long l10);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling6Service$t */
    class C8285t implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16263a;

        C8285t(Ceiling6Service ceiling6Service, CompletionHandler completionHandler) {
            this.f16263a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16263a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16263a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling6Service$t0 */
    public interface C8286t0 {
        /* renamed from: a */
        void mo29819a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling6Service$u */
    class C8287u implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16264a;

        C8287u(Ceiling6Service ceiling6Service, CompletionHandler completionHandler) {
            this.f16264a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16264a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16264a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling6Service$u0 */
    public interface C8288u0 {
        /* renamed from: a */
        void mo29821a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling6Service$v */
    class C8289v implements DeviceManipulator.PropertyChangedListener {

        /* renamed from: a */
        final /* synthetic */ C8294x0 f16265a;

        C8289v(Ceiling6Service ceiling6Service, C8294x0 x0Var) {
            this.f16265a = x0Var;
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onPropertyChanged(com.miot.common.device.invocation.PropertyInfo r17, java.lang.String r18) {
            /*
                r16 = this;
                r0 = r16
                r1 = r17
                r2 = r18
                int r3 = r18.hashCode()
                java.lang.String r4 = "Bright"
                java.lang.String r5 = "LanMode"
                java.lang.String r6 = "SmartSwitch"
                java.lang.String r7 = "Flowing"
                java.lang.String r8 = "DelayOff"
                java.lang.String r9 = "Power"
                java.lang.String r10 = "onFromPower"
                java.lang.String r11 = "Ct"
                java.lang.String r12 = "MiBandSleep"
                java.lang.String r13 = "NLBright"
                java.lang.String r14 = "NightTimeInfo"
                java.lang.String r15 = "FlowParams"
                java.lang.String r0 = "SaveState"
                switch(r3) {
                    case -2117953292: goto L_0x0090;
                    case -2002016140: goto L_0x0088;
                    case -1331143373: goto L_0x007f;
                    case -770908584: goto L_0x0076;
                    case -80340154: goto L_0x006d;
                    case 2193: goto L_0x0065;
                    case 35911772: goto L_0x005d;
                    case 77306085: goto L_0x0055;
                    case 880790796: goto L_0x004d;
                    case 898856916: goto L_0x0044;
                    case 1179821629: goto L_0x003b;
                    case 1611821756: goto L_0x0032;
                    case 1998035738: goto L_0x0029;
                    default: goto L_0x0027;
                }
            L_0x0027:
                goto L_0x0098
            L_0x0029:
                boolean r2 = r2.equals(r4)
                if (r2 == 0) goto L_0x0098
                r2 = 1
                goto L_0x0099
            L_0x0032:
                boolean r2 = r2.equals(r5)
                if (r2 == 0) goto L_0x0098
                r2 = 5
                goto L_0x0099
            L_0x003b:
                boolean r2 = r2.equals(r6)
                if (r2 == 0) goto L_0x0098
                r2 = 12
                goto L_0x0099
            L_0x0044:
                boolean r2 = r2.equals(r7)
                if (r2 == 0) goto L_0x0098
                r2 = 11
                goto L_0x0099
            L_0x004d:
                boolean r2 = r2.equals(r8)
                if (r2 == 0) goto L_0x0098
                r2 = 3
                goto L_0x0099
            L_0x0055:
                boolean r2 = r2.equals(r9)
                if (r2 == 0) goto L_0x0098
                r2 = 0
                goto L_0x0099
            L_0x005d:
                boolean r2 = r2.equals(r10)
                if (r2 == 0) goto L_0x0098
                r2 = 7
                goto L_0x0099
            L_0x0065:
                boolean r2 = r2.equals(r11)
                if (r2 == 0) goto L_0x0098
                r2 = 2
                goto L_0x0099
            L_0x006d:
                boolean r2 = r2.equals(r12)
                if (r2 == 0) goto L_0x0098
                r2 = 10
                goto L_0x0099
            L_0x0076:
                boolean r2 = r2.equals(r13)
                if (r2 == 0) goto L_0x0098
                r2 = 8
                goto L_0x0099
            L_0x007f:
                boolean r2 = r2.equals(r14)
                if (r2 == 0) goto L_0x0098
                r2 = 9
                goto L_0x0099
            L_0x0088:
                boolean r2 = r2.equals(r15)
                if (r2 == 0) goto L_0x0098
                r2 = 4
                goto L_0x0099
            L_0x0090:
                boolean r2 = r2.equals(r0)
                if (r2 == 0) goto L_0x0098
                r2 = 6
                goto L_0x0099
            L_0x0098:
                r2 = -1
            L_0x0099:
                switch(r2) {
                    case 0: goto L_0x01c8;
                    case 1: goto L_0x01b0;
                    case 2: goto L_0x0198;
                    case 3: goto L_0x0180;
                    case 4: goto L_0x0168;
                    case 5: goto L_0x014f;
                    case 6: goto L_0x0136;
                    case 7: goto L_0x011d;
                    case 8: goto L_0x0104;
                    case 9: goto L_0x00eb;
                    case 10: goto L_0x00d2;
                    case 11: goto L_0x00b9;
                    case 12: goto L_0x00a0;
                    default: goto L_0x009c;
                }
            L_0x009c:
                r2 = r16
                goto L_0x01e3
            L_0x00a0:
                com.miot.common.property.Property r0 = r1.getProperty(r6)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x009c
                java.lang.Object r0 = r1.getValue(r6)
                java.lang.Long r0 = (java.lang.Long) r0
                r2 = r16
                com.yeelight.yeelib.device.xiaomi.Ceiling6Service$x0 r1 = r2.f16265a
                r1.mo28546p(r0)
                goto L_0x01e3
            L_0x00b9:
                r2 = r16
                com.miot.common.property.Property r0 = r1.getProperty(r7)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x01e3
                java.lang.Object r0 = r1.getValue(r7)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Ceiling6Service$x0 r1 = r2.f16265a
                r1.mo28536c(r0)
                goto L_0x01e3
            L_0x00d2:
                r2 = r16
                com.miot.common.property.Property r0 = r1.getProperty(r12)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x01e3
                java.lang.Object r0 = r1.getValue(r12)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Ceiling6Service$x0 r1 = r2.f16265a
                r1.mo28545m(r0)
                goto L_0x01e3
            L_0x00eb:
                r2 = r16
                com.miot.common.property.Property r0 = r1.getProperty(r14)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x01e3
                java.lang.Object r0 = r1.getValue(r14)
                java.lang.String r0 = (java.lang.String) r0
                com.yeelight.yeelib.device.xiaomi.Ceiling6Service$x0 r1 = r2.f16265a
                r1.mo28542i(r0)
                goto L_0x01e3
            L_0x0104:
                r2 = r16
                com.miot.common.property.Property r0 = r1.getProperty(r13)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x01e3
                java.lang.Object r0 = r1.getValue(r13)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Ceiling6Service$x0 r1 = r2.f16265a
                r1.mo28544k(r0)
                goto L_0x01e3
            L_0x011d:
                r2 = r16
                com.miot.common.property.Property r0 = r1.getProperty(r10)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x01e3
                java.lang.Object r0 = r1.getValue(r10)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Ceiling6Service$x0 r1 = r2.f16265a
                r1.mo28539f(r0)
                goto L_0x01e3
            L_0x0136:
                r2 = r16
                com.miot.common.property.Property r3 = r1.getProperty(r0)
                boolean r3 = r3.isValueValid()
                if (r3 == 0) goto L_0x01e3
                java.lang.Object r0 = r1.getValue(r0)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Ceiling6Service$x0 r1 = r2.f16265a
                r1.mo28537d(r0)
                goto L_0x01e3
            L_0x014f:
                r2 = r16
                com.miot.common.property.Property r0 = r1.getProperty(r5)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x01e3
                java.lang.Object r0 = r1.getValue(r5)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Ceiling6Service$x0 r1 = r2.f16265a
                r1.mo28540g(r0)
                goto L_0x01e3
            L_0x0168:
                r2 = r16
                com.miot.common.property.Property r0 = r1.getProperty(r15)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x01e3
                java.lang.Object r0 = r1.getValue(r15)
                java.lang.String r0 = (java.lang.String) r0
                com.yeelight.yeelib.device.xiaomi.Ceiling6Service$x0 r1 = r2.f16265a
                r1.mo28538e(r0)
                goto L_0x01e3
            L_0x0180:
                r2 = r16
                com.miot.common.property.Property r0 = r1.getProperty(r8)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x01e3
                java.lang.Object r0 = r1.getValue(r8)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Ceiling6Service$x0 r1 = r2.f16265a
                r1.mo28535b(r0)
                goto L_0x01e3
            L_0x0198:
                r2 = r16
                com.miot.common.property.Property r0 = r1.getProperty(r11)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x01e3
                java.lang.Object r0 = r1.getValue(r11)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Ceiling6Service$x0 r1 = r2.f16265a
                r1.mo28541h(r0)
                goto L_0x01e3
            L_0x01b0:
                r2 = r16
                com.miot.common.property.Property r0 = r1.getProperty(r4)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x01e3
                java.lang.Object r0 = r1.getValue(r4)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Ceiling6Service$x0 r1 = r2.f16265a
                r1.mo28534a(r0)
                goto L_0x01e3
            L_0x01c8:
                r2 = r16
                com.miot.common.property.Property r0 = r1.getProperty(r9)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x01e3
                java.lang.Object r0 = r1.getValue(r9)
                java.lang.String r0 = (java.lang.String) r0
                com.yeelight.yeelib.device.xiaomi.Ceiling6Service$w0 r0 = com.yeelight.yeelib.device.xiaomi.Ceiling6Service.C8292w0.valueOf(r0)
                com.yeelight.yeelib.device.xiaomi.Ceiling6Service$x0 r1 = r2.f16265a
                r1.mo28543j(r0)
            L_0x01e3:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.xiaomi.Ceiling6Service.C8289v.onPropertyChanged(com.miot.common.device.invocation.PropertyInfo, java.lang.String):void");
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling6Service$v0 */
    public interface C8290v0 {
        /* renamed from: a */
        void mo29823a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling6Service$w */
    class C8291w implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16266a;

        C8291w(Ceiling6Service ceiling6Service, CompletionHandler completionHandler) {
            this.f16266a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16266a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16266a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling6Service$w0 */
    public enum C8292w0 {
        undefined,
        on,
        off
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling6Service$x */
    class C8293x implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16271a;

        C8293x(Ceiling6Service ceiling6Service, CompletionHandler completionHandler) {
            this.f16271a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16271a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16271a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling6Service$x0 */
    public interface C8294x0 {
        /* renamed from: a */
        void mo28534a(Long l);

        /* renamed from: b */
        void mo28535b(Long l);

        /* renamed from: c */
        void mo28536c(Long l);

        /* renamed from: d */
        void mo28537d(Long l);

        /* renamed from: e */
        void mo28538e(String str);

        /* renamed from: f */
        void mo28539f(Long l);

        /* renamed from: g */
        void mo28540g(Long l);

        /* renamed from: h */
        void mo28541h(Long l);

        /* renamed from: i */
        void mo28542i(String str);

        /* renamed from: j */
        void mo28543j(C8292w0 w0Var);

        /* renamed from: k */
        void mo28544k(Long l);

        /* renamed from: m */
        void mo28545m(Long l);

        /* renamed from: p */
        void mo28546p(Long l);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling6Service$y */
    class C8295y implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16272a;

        C8295y(Ceiling6Service ceiling6Service, CompletionHandler completionHandler) {
            this.f16272a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16272a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16272a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling6Service$z */
    class C8296z implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16273a;

        C8296z(Ceiling6Service ceiling6Service, CompletionHandler completionHandler) {
            this.f16273a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16273a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f16273a.onSucceed();
        }
    }

    public Ceiling6Service(AbstractDevice abstractDevice) {
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
                MiotManager.getDeviceManipulator().invoke(create, new C8279q(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8265j(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getBright(C8264i0 i0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Bright"), new C8252c0(this, i0Var));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8295y(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getCt(C8266j0 j0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Ct"), new C8254d0(this, j0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getDelayOff(C8268k0 k0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "DelayOff"), new C8256e0(this, k0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowParams(C8270l0 l0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "FlowParams"), new C8258f0(this, l0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowing(C8272m0 m0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Flowing"), new C8259g(this, m0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getLanMode(C8274n0 n0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "LanMode"), new C8247a(this, n0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getMiBandSleep(C8276o0 o0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "MiBandSleep"), new C8257f(this, o0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getNLBright(C8278p0 p0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "NLBright"), new C8253d(this, p0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getNightTimeInfo(C8280q0 q0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "NightTimeInfo"), new C8255e(this, q0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getPower(C8282r0 r0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Power"), new C8250b0(this, r0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getProperties(C8284s0 s0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            PropertyInfo create = PropertyInfoFactory.create(getService());
            create.addProperty(getService().getProperty("Power"));
            create.addProperty(getService().getProperty("Bright"));
            create.addProperty(getService().getProperty("Ct"));
            create.addProperty(getService().getProperty("DelayOff"));
            create.addProperty(getService().getProperty("FlowParams"));
            create.addProperty(getService().getProperty("LanMode"));
            create.addProperty(getService().getProperty("SaveState"));
            create.addProperty(getService().getProperty("onFromPower"));
            create.addProperty(getService().getProperty("NLBright"));
            create.addProperty(getService().getProperty("NightTimeInfo"));
            create.addProperty(getService().getProperty("MiBandSleep"));
            create.addProperty(getService().getProperty("Flowing"));
            create.addProperty(getService().getProperty("SmartSwitch"));
            MiotManager.getDeviceManipulator().readProperty(create, new C8248a0(this, s0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getSaveState(C8286t0 t0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "SaveState"), new C8249b(this, t0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getSmartSwitch(C8288u0 u0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "SmartSwitch"), new C8261h(this, u0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getonFromPower(C8290v0 v0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "onFromPower"), new C8251c(this, v0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void openWithMode(C8292w0 w0Var, C8262h0 h0Var, Long l, Long l2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "openWithMode");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("Power", w0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Effect", h0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Duration", l)) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("Mode", l2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C8273n(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8269l(this, completionHandler));
                return;
            }
            throw new MiotException("actionInfo is null");
        }
        throw new MiotException("device not configurated connection");
    }

    public void sendCmd(C8260g0 g0Var, String str, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "sendCmd");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("CmdKey", g0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("CmdValue", str)) {
                MiotManager.getDeviceManipulator().invoke(create, new C8285t(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setBright(Long l, C8262h0 h0Var, Long l2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setBright");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("Bright", l)) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Effect", h0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("Duration", l2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C8263i(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setCt(Long l, C8262h0 h0Var, Long l2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setCt");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("Ct", l)) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Effect", h0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("Duration", l2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C8293x(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8281r(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8291w(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setNLScene(String str, Long l, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setNLScene");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("ParamModel", str)) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("ParamFinish", l)) {
                MiotManager.getDeviceManipulator().invoke(create, new C8283s(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setPower(C8292w0 w0Var, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setPower");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (create.setArgumentValue("Power", w0Var.toString())) {
                MiotManager.getDeviceManipulator().invoke(create, new C8275o(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8271m(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setadjust(String str, String str2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setadjust");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("adjustAction", str)) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("adjustProper", str2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C8287u(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void subscribeNotifications(CompletionHandler completionHandler, C8294x0 x0Var) {
        if (completionHandler == null) {
            throw new IllegalArgumentException("handler is null");
        } else if (x0Var != null) {
            PropertyInfo create = PropertyInfoFactory.create(getService());
            for (Property next : getService().getProperties()) {
                if (next.getDefinition().isNotifiable()) {
                    create.addProperty(next);
                }
            }
            MiotManager.getDeviceManipulator().addPropertyChangedListener(create, new C8267k(this, completionHandler), new C8289v(this, x0Var));
        } else {
            throw new IllegalArgumentException("listener is null");
        }
    }

    public void toggle(CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "toggle");
            if (create != null) {
                MiotManager.getDeviceManipulator().invoke(create, new C8277p(this, completionHandler));
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
            MiotManager.getDeviceManipulator().removePropertyChangedListener(create, new C8296z(this, completionHandler));
            return;
        }
        throw new IllegalArgumentException("handler is null");
    }
}
