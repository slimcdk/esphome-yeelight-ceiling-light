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

public class CeilingDService extends AbstractService {
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
    public static final String PROPERTY_TransIntervalDflt = "TransIntervalDflt";
    public static final String PROPERTY_adjustAction = "adjustAction";
    public static final String PROPERTY_adjustProper = "adjustProper";
    public static final String PROPERTY_onFromPower = "onFromPower";
    private static final String TAG = "CeilingDService";
    private AbstractDevice mDevice = null;

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingDService$a */
    class C8297a implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8324n0 f16274a;

        C8297a(CeilingDService ceilingDService, C8324n0 n0Var) {
            this.f16274a = n0Var;
        }

        public void onFailed(int i, String str) {
            this.f16274a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("LanMode");
            if (property.isValueValid()) {
                this.f16274a.mo29866a((Long) propertyInfo.getValue("LanMode"));
                return;
            }
            C8324n0 n0Var = this.f16274a;
            n0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingDService$a0 */
    class C8298a0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8334s0 f16275a;

        C8298a0(CeilingDService ceilingDService, C8334s0 s0Var) {
            this.f16275a = s0Var;
        }

        public void onFailed(int i, String str) {
            this.f16275a.onFailed(i, str);
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
                com.yeelight.yeelib.device.xiaomi.CeilingDService$w0 r1 = com.yeelight.yeelib.device.xiaomi.CeilingDService.C8342w0.valueOf(r1)
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
                java.lang.String r1 = "TransIntervalDflt"
                com.miot.common.property.Property r0 = r0.getProperty(r1)
                boolean r1 = r0.isValueValid()
                if (r1 == 0) goto L_0x0118
                java.lang.Object r0 = r0.getValue()
                r3 = r0
                java.lang.Long r3 = (java.lang.Long) r3
            L_0x0118:
                r0 = r18
                r17 = r3
                com.yeelight.yeelib.device.xiaomi.CeilingDService$s0 r4 = r0.f16275a
                r4.mo28564a(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.xiaomi.CeilingDService.C8298a0.onSucceed(com.miot.common.device.invocation.PropertyInfo):void");
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingDService$b */
    class C8299b implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8336t0 f16276a;

        C8299b(CeilingDService ceilingDService, C8336t0 t0Var) {
            this.f16276a = t0Var;
        }

        public void onFailed(int i, String str) {
            this.f16276a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("SaveState");
            if (property.isValueValid()) {
                this.f16276a.mo29876a((Long) propertyInfo.getValue("SaveState"));
                return;
            }
            C8336t0 t0Var = this.f16276a;
            t0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingDService$b0 */
    class C8300b0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8332r0 f16277a;

        C8300b0(CeilingDService ceilingDService, C8332r0 r0Var) {
            this.f16277a = r0Var;
        }

        public void onFailed(int i, String str) {
            this.f16277a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Power");
            if (property.isValueValid()) {
                this.f16277a.mo29874a(C8342w0.valueOf((String) propertyInfo.getValue("Power")));
                return;
            }
            C8332r0 r0Var = this.f16277a;
            r0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingDService$c */
    class C8301c implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8340v0 f16278a;

        C8301c(CeilingDService ceilingDService, C8340v0 v0Var) {
            this.f16278a = v0Var;
        }

        public void onFailed(int i, String str) {
            this.f16278a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("onFromPower");
            if (property.isValueValid()) {
                this.f16278a.mo29880a((Long) propertyInfo.getValue("onFromPower"));
                return;
            }
            C8340v0 v0Var = this.f16278a;
            v0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingDService$c0 */
    class C8302c0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8314i0 f16279a;

        C8302c0(CeilingDService ceilingDService, C8314i0 i0Var) {
            this.f16279a = i0Var;
        }

        public void onFailed(int i, String str) {
            this.f16279a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Bright");
            if (property.isValueValid()) {
                this.f16279a.mo29856a((Long) propertyInfo.getValue("Bright"));
                return;
            }
            C8314i0 i0Var = this.f16279a;
            i0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingDService$d */
    class C8303d implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8328p0 f16280a;

        C8303d(CeilingDService ceilingDService, C8328p0 p0Var) {
            this.f16280a = p0Var;
        }

        public void onFailed(int i, String str) {
            this.f16280a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("NLBright");
            if (property.isValueValid()) {
                this.f16280a.mo29870a((Long) propertyInfo.getValue("NLBright"));
                return;
            }
            C8328p0 p0Var = this.f16280a;
            p0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingDService$d0 */
    class C8304d0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8316j0 f16281a;

        C8304d0(CeilingDService ceilingDService, C8316j0 j0Var) {
            this.f16281a = j0Var;
        }

        public void onFailed(int i, String str) {
            this.f16281a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Ct");
            if (property.isValueValid()) {
                this.f16281a.mo29858a((Long) propertyInfo.getValue("Ct"));
                return;
            }
            C8316j0 j0Var = this.f16281a;
            j0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingDService$e */
    class C8305e implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8330q0 f16282a;

        C8305e(CeilingDService ceilingDService, C8330q0 q0Var) {
            this.f16282a = q0Var;
        }

        public void onFailed(int i, String str) {
            this.f16282a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("NightTimeInfo");
            if (property.isValueValid()) {
                this.f16282a.onSucceed((String) propertyInfo.getValue("NightTimeInfo"));
                return;
            }
            C8330q0 q0Var = this.f16282a;
            q0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingDService$e0 */
    class C8306e0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8318k0 f16283a;

        C8306e0(CeilingDService ceilingDService, C8318k0 k0Var) {
            this.f16283a = k0Var;
        }

        public void onFailed(int i, String str) {
            this.f16283a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("DelayOff");
            if (property.isValueValid()) {
                this.f16283a.mo29860a((Long) propertyInfo.getValue("DelayOff"));
                return;
            }
            C8318k0 k0Var = this.f16283a;
            k0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingDService$f */
    class C8307f implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8326o0 f16284a;

        C8307f(CeilingDService ceilingDService, C8326o0 o0Var) {
            this.f16284a = o0Var;
        }

        public void onFailed(int i, String str) {
            this.f16284a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("MiBandSleep");
            if (property.isValueValid()) {
                this.f16284a.mo29868a((Long) propertyInfo.getValue("MiBandSleep"));
                return;
            }
            C8326o0 o0Var = this.f16284a;
            o0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingDService$f0 */
    class C8308f0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8320l0 f16285a;

        C8308f0(CeilingDService ceilingDService, C8320l0 l0Var) {
            this.f16285a = l0Var;
        }

        public void onFailed(int i, String str) {
            this.f16285a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("FlowParams");
            if (property.isValueValid()) {
                this.f16285a.onSucceed((String) propertyInfo.getValue("FlowParams"));
                return;
            }
            C8320l0 l0Var = this.f16285a;
            l0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingDService$g */
    class C8309g implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8322m0 f16286a;

        C8309g(CeilingDService ceilingDService, C8322m0 m0Var) {
            this.f16286a = m0Var;
        }

        public void onFailed(int i, String str) {
            this.f16286a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Flowing");
            if (property.isValueValid()) {
                this.f16286a.mo29864a((Long) propertyInfo.getValue("Flowing"));
                return;
            }
            C8322m0 m0Var = this.f16286a;
            m0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingDService$g0 */
    public enum C8310g0 {
        undefined,
        cfg_pomodoro,
        cfg_lan_ctrl,
        cfg_save_state,
        nighttime,
        nightlight,
        miband_sleep,
        pseudo_beacon,
        cfg_init_power,
        cfg_smart_switch,
        trans_default
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingDService$h */
    class C8311h implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8338u0 f16299a;

        C8311h(CeilingDService ceilingDService, C8338u0 u0Var) {
            this.f16299a = u0Var;
        }

        public void onFailed(int i, String str) {
            this.f16299a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("TransIntervalDflt");
            if (property.isValueValid()) {
                this.f16299a.mo29878a((Long) propertyInfo.getValue("TransIntervalDflt"));
                return;
            }
            C8338u0 u0Var = this.f16299a;
            u0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingDService$h0 */
    public enum C8312h0 {
        undefined,
        smooth,
        sudden
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingDService$i */
    class C8313i implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16304a;

        C8313i(CeilingDService ceilingDService, CompletionHandler completionHandler) {
            this.f16304a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16304a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16304a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingDService$i0 */
    public interface C8314i0 {
        /* renamed from: a */
        void mo29856a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingDService$j */
    class C8315j implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16305a;

        C8315j(CeilingDService ceilingDService, CompletionHandler completionHandler) {
            this.f16305a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16305a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16305a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingDService$j0 */
    public interface C8316j0 {
        /* renamed from: a */
        void mo29858a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingDService$k */
    class C8317k implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16306a;

        C8317k(CeilingDService ceilingDService, CompletionHandler completionHandler) {
            this.f16306a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16306a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f16306a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingDService$k0 */
    public interface C8318k0 {
        /* renamed from: a */
        void mo29860a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingDService$l */
    class C8319l implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16307a;

        C8319l(CeilingDService ceilingDService, CompletionHandler completionHandler) {
            this.f16307a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16307a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16307a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingDService$l0 */
    public interface C8320l0 {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingDService$m */
    class C8321m implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16308a;

        C8321m(CeilingDService ceilingDService, CompletionHandler completionHandler) {
            this.f16308a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16308a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16308a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingDService$m0 */
    public interface C8322m0 {
        /* renamed from: a */
        void mo29864a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingDService$n */
    class C8323n implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16309a;

        C8323n(CeilingDService ceilingDService, CompletionHandler completionHandler) {
            this.f16309a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16309a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16309a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingDService$n0 */
    public interface C8324n0 {
        /* renamed from: a */
        void mo29866a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingDService$o */
    class C8325o implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16310a;

        C8325o(CeilingDService ceilingDService, CompletionHandler completionHandler) {
            this.f16310a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16310a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16310a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingDService$o0 */
    public interface C8326o0 {
        /* renamed from: a */
        void mo29868a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingDService$p */
    class C8327p implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16311a;

        C8327p(CeilingDService ceilingDService, CompletionHandler completionHandler) {
            this.f16311a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16311a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16311a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingDService$p0 */
    public interface C8328p0 {
        /* renamed from: a */
        void mo29870a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingDService$q */
    class C8329q implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16312a;

        C8329q(CeilingDService ceilingDService, CompletionHandler completionHandler) {
            this.f16312a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16312a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16312a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingDService$q0 */
    public interface C8330q0 {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingDService$r */
    class C8331r implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16313a;

        C8331r(CeilingDService ceilingDService, CompletionHandler completionHandler) {
            this.f16313a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16313a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16313a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingDService$r0 */
    public interface C8332r0 {
        /* renamed from: a */
        void mo29874a(C8342w0 w0Var);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingDService$s */
    class C8333s implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16314a;

        C8333s(CeilingDService ceilingDService, CompletionHandler completionHandler) {
            this.f16314a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16314a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16314a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingDService$s0 */
    public interface C8334s0 {
        /* renamed from: a */
        void mo28564a(C8342w0 w0Var, Long l, Long l2, Long l3, String str, Long l4, Long l5, Long l6, Long l7, String str2, Long l8, Long l9, Long l10);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingDService$t */
    class C8335t implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16315a;

        C8335t(CeilingDService ceilingDService, CompletionHandler completionHandler) {
            this.f16315a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16315a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16315a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingDService$t0 */
    public interface C8336t0 {
        /* renamed from: a */
        void mo29876a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingDService$u */
    class C8337u implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16316a;

        C8337u(CeilingDService ceilingDService, CompletionHandler completionHandler) {
            this.f16316a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16316a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16316a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingDService$u0 */
    public interface C8338u0 {
        /* renamed from: a */
        void mo29878a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingDService$v */
    class C8339v implements DeviceManipulator.PropertyChangedListener {

        /* renamed from: a */
        final /* synthetic */ C8344x0 f16317a;

        C8339v(CeilingDService ceilingDService, C8344x0 x0Var) {
            this.f16317a = x0Var;
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
                java.lang.String r6 = "Flowing"
                java.lang.String r7 = "DelayOff"
                java.lang.String r8 = "Power"
                java.lang.String r9 = "onFromPower"
                java.lang.String r10 = "Ct"
                java.lang.String r11 = "MiBandSleep"
                java.lang.String r12 = "TransIntervalDflt"
                java.lang.String r13 = "NLBright"
                java.lang.String r14 = "NightTimeInfo"
                java.lang.String r15 = "FlowParams"
                java.lang.String r0 = "SaveState"
                switch(r3) {
                    case -2117953292: goto L_0x0090;
                    case -2002016140: goto L_0x0088;
                    case -1331143373: goto L_0x007f;
                    case -770908584: goto L_0x0076;
                    case -718325097: goto L_0x006d;
                    case -80340154: goto L_0x0064;
                    case 2193: goto L_0x005c;
                    case 35911772: goto L_0x0054;
                    case 77306085: goto L_0x004c;
                    case 880790796: goto L_0x0044;
                    case 898856916: goto L_0x003b;
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
                r2 = 11
                goto L_0x0099
            L_0x0044:
                boolean r2 = r2.equals(r7)
                if (r2 == 0) goto L_0x0098
                r2 = 3
                goto L_0x0099
            L_0x004c:
                boolean r2 = r2.equals(r8)
                if (r2 == 0) goto L_0x0098
                r2 = 0
                goto L_0x0099
            L_0x0054:
                boolean r2 = r2.equals(r9)
                if (r2 == 0) goto L_0x0098
                r2 = 7
                goto L_0x0099
            L_0x005c:
                boolean r2 = r2.equals(r10)
                if (r2 == 0) goto L_0x0098
                r2 = 2
                goto L_0x0099
            L_0x0064:
                boolean r2 = r2.equals(r11)
                if (r2 == 0) goto L_0x0098
                r2 = 10
                goto L_0x0099
            L_0x006d:
                boolean r2 = r2.equals(r12)
                if (r2 == 0) goto L_0x0098
                r2 = 12
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
                com.miot.common.property.Property r0 = r1.getProperty(r12)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x009c
                java.lang.Object r0 = r1.getValue(r12)
                java.lang.Long r0 = (java.lang.Long) r0
                r2 = r16
                com.yeelight.yeelib.device.xiaomi.CeilingDService$x0 r1 = r2.f16317a
                r1.mo28563q(r0)
                goto L_0x01e3
            L_0x00b9:
                r2 = r16
                com.miot.common.property.Property r0 = r1.getProperty(r6)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x01e3
                java.lang.Object r0 = r1.getValue(r6)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.CeilingDService$x0 r1 = r2.f16317a
                r1.mo28553c(r0)
                goto L_0x01e3
            L_0x00d2:
                r2 = r16
                com.miot.common.property.Property r0 = r1.getProperty(r11)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x01e3
                java.lang.Object r0 = r1.getValue(r11)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.CeilingDService$x0 r1 = r2.f16317a
                r1.mo28562m(r0)
                goto L_0x01e3
            L_0x00eb:
                r2 = r16
                com.miot.common.property.Property r0 = r1.getProperty(r14)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x01e3
                java.lang.Object r0 = r1.getValue(r14)
                java.lang.String r0 = (java.lang.String) r0
                com.yeelight.yeelib.device.xiaomi.CeilingDService$x0 r1 = r2.f16317a
                r1.mo28559i(r0)
                goto L_0x01e3
            L_0x0104:
                r2 = r16
                com.miot.common.property.Property r0 = r1.getProperty(r13)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x01e3
                java.lang.Object r0 = r1.getValue(r13)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.CeilingDService$x0 r1 = r2.f16317a
                r1.mo28561k(r0)
                goto L_0x01e3
            L_0x011d:
                r2 = r16
                com.miot.common.property.Property r0 = r1.getProperty(r9)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x01e3
                java.lang.Object r0 = r1.getValue(r9)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.CeilingDService$x0 r1 = r2.f16317a
                r1.mo28556f(r0)
                goto L_0x01e3
            L_0x0136:
                r2 = r16
                com.miot.common.property.Property r3 = r1.getProperty(r0)
                boolean r3 = r3.isValueValid()
                if (r3 == 0) goto L_0x01e3
                java.lang.Object r0 = r1.getValue(r0)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.CeilingDService$x0 r1 = r2.f16317a
                r1.mo28554d(r0)
                goto L_0x01e3
            L_0x014f:
                r2 = r16
                com.miot.common.property.Property r0 = r1.getProperty(r5)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x01e3
                java.lang.Object r0 = r1.getValue(r5)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.CeilingDService$x0 r1 = r2.f16317a
                r1.mo28557g(r0)
                goto L_0x01e3
            L_0x0168:
                r2 = r16
                com.miot.common.property.Property r0 = r1.getProperty(r15)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x01e3
                java.lang.Object r0 = r1.getValue(r15)
                java.lang.String r0 = (java.lang.String) r0
                com.yeelight.yeelib.device.xiaomi.CeilingDService$x0 r1 = r2.f16317a
                r1.mo28555e(r0)
                goto L_0x01e3
            L_0x0180:
                r2 = r16
                com.miot.common.property.Property r0 = r1.getProperty(r7)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x01e3
                java.lang.Object r0 = r1.getValue(r7)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.CeilingDService$x0 r1 = r2.f16317a
                r1.mo28552b(r0)
                goto L_0x01e3
            L_0x0198:
                r2 = r16
                com.miot.common.property.Property r0 = r1.getProperty(r10)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x01e3
                java.lang.Object r0 = r1.getValue(r10)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.CeilingDService$x0 r1 = r2.f16317a
                r1.mo28558h(r0)
                goto L_0x01e3
            L_0x01b0:
                r2 = r16
                com.miot.common.property.Property r0 = r1.getProperty(r4)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x01e3
                java.lang.Object r0 = r1.getValue(r4)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.CeilingDService$x0 r1 = r2.f16317a
                r1.mo28551a(r0)
                goto L_0x01e3
            L_0x01c8:
                r2 = r16
                com.miot.common.property.Property r0 = r1.getProperty(r8)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x01e3
                java.lang.Object r0 = r1.getValue(r8)
                java.lang.String r0 = (java.lang.String) r0
                com.yeelight.yeelib.device.xiaomi.CeilingDService$w0 r0 = com.yeelight.yeelib.device.xiaomi.CeilingDService.C8342w0.valueOf(r0)
                com.yeelight.yeelib.device.xiaomi.CeilingDService$x0 r1 = r2.f16317a
                r1.mo28560j(r0)
            L_0x01e3:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.xiaomi.CeilingDService.C8339v.onPropertyChanged(com.miot.common.device.invocation.PropertyInfo, java.lang.String):void");
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingDService$v0 */
    public interface C8340v0 {
        /* renamed from: a */
        void mo29880a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingDService$w */
    class C8341w implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16318a;

        C8341w(CeilingDService ceilingDService, CompletionHandler completionHandler) {
            this.f16318a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16318a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16318a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingDService$w0 */
    public enum C8342w0 {
        undefined,
        on,
        off
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingDService$x */
    class C8343x implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16323a;

        C8343x(CeilingDService ceilingDService, CompletionHandler completionHandler) {
            this.f16323a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16323a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16323a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingDService$x0 */
    public interface C8344x0 {
        /* renamed from: a */
        void mo28551a(Long l);

        /* renamed from: b */
        void mo28552b(Long l);

        /* renamed from: c */
        void mo28553c(Long l);

        /* renamed from: d */
        void mo28554d(Long l);

        /* renamed from: e */
        void mo28555e(String str);

        /* renamed from: f */
        void mo28556f(Long l);

        /* renamed from: g */
        void mo28557g(Long l);

        /* renamed from: h */
        void mo28558h(Long l);

        /* renamed from: i */
        void mo28559i(String str);

        /* renamed from: j */
        void mo28560j(C8342w0 w0Var);

        /* renamed from: k */
        void mo28561k(Long l);

        /* renamed from: m */
        void mo28562m(Long l);

        /* renamed from: q */
        void mo28563q(Long l);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingDService$y */
    class C8345y implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16324a;

        C8345y(CeilingDService ceilingDService, CompletionHandler completionHandler) {
            this.f16324a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16324a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16324a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingDService$z */
    class C8346z implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16325a;

        C8346z(CeilingDService ceilingDService, CompletionHandler completionHandler) {
            this.f16325a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16325a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f16325a.onSucceed();
        }
    }

    public CeilingDService(AbstractDevice abstractDevice) {
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
                MiotManager.getDeviceManipulator().invoke(create, new C8329q(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8315j(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getBright(C8314i0 i0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Bright"), new C8302c0(this, i0Var));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8345y(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getCt(C8316j0 j0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Ct"), new C8304d0(this, j0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getDelayOff(C8318k0 k0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "DelayOff"), new C8306e0(this, k0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowParams(C8320l0 l0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "FlowParams"), new C8308f0(this, l0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowing(C8322m0 m0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Flowing"), new C8309g(this, m0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getLanMode(C8324n0 n0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "LanMode"), new C8297a(this, n0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getMiBandSleep(C8326o0 o0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "MiBandSleep"), new C8307f(this, o0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getNLBright(C8328p0 p0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "NLBright"), new C8303d(this, p0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getNightTimeInfo(C8330q0 q0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "NightTimeInfo"), new C8305e(this, q0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getPower(C8332r0 r0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Power"), new C8300b0(this, r0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getProperties(C8334s0 s0Var) {
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
            create.addProperty(getService().getProperty("TransIntervalDflt"));
            MiotManager.getDeviceManipulator().readProperty(create, new C8298a0(this, s0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getSaveState(C8336t0 t0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "SaveState"), new C8299b(this, t0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getTransIntervalDflt(C8338u0 u0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "TransIntervalDflt"), new C8311h(this, u0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getonFromPower(C8340v0 v0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "onFromPower"), new C8301c(this, v0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void openWithMode(C8342w0 w0Var, C8312h0 h0Var, Long l, Long l2, CompletionHandler completionHandler) {
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
                MiotManager.getDeviceManipulator().invoke(create, new C8323n(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8319l(this, completionHandler));
                return;
            }
            throw new MiotException("actionInfo is null");
        }
        throw new MiotException("device not configurated connection");
    }

    public void sendCmd(C8310g0 g0Var, String str, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "sendCmd");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("CmdKey", g0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("CmdValue", str)) {
                MiotManager.getDeviceManipulator().invoke(create, new C8335t(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setBright(Long l, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setBright");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (create.setArgumentValue("Bright", l)) {
                MiotManager.getDeviceManipulator().invoke(create, new C8313i(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setCt(Long l, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setCt");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (create.setArgumentValue("Ct", l)) {
                MiotManager.getDeviceManipulator().invoke(create, new C8343x(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8331r(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8341w(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8333s(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setPower(C8342w0 w0Var, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setPower");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (create.setArgumentValue("Power", w0Var.toString())) {
                MiotManager.getDeviceManipulator().invoke(create, new C8325o(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8321m(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8337u(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void subscribeNotifications(CompletionHandler completionHandler, C8344x0 x0Var) {
        if (completionHandler == null) {
            throw new IllegalArgumentException("handler is null");
        } else if (x0Var != null) {
            PropertyInfo create = PropertyInfoFactory.create(getService());
            for (Property next : getService().getProperties()) {
                if (next.getDefinition().isNotifiable()) {
                    create.addProperty(next);
                }
            }
            MiotManager.getDeviceManipulator().addPropertyChangedListener(create, new C8317k(this, completionHandler), new C8339v(this, x0Var));
        } else {
            throw new IllegalArgumentException("listener is null");
        }
    }

    public void toggle(CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "toggle");
            if (create != null) {
                MiotManager.getDeviceManipulator().invoke(create, new C8327p(this, completionHandler));
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
            MiotManager.getDeviceManipulator().removePropertyChangedListener(create, new C8346z(this, completionHandler));
            return;
        }
        throw new IllegalArgumentException("handler is null");
    }
}
