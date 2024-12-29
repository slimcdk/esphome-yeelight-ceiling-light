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

public class Ceiling35Service extends AbstractService {
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
    public static final String PROPERTY_NlCt = "NlCt";
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
    private static final String TAG = "Ceiling35Service";
    private AbstractDevice mDevice = null;

    public enum CmdKey {
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

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling35Service$a */
    class C6629a implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6654m0 f13023a;

        C6629a(Ceiling35Service ceiling35Service, C6654m0 m0Var) {
            this.f13023a = m0Var;
        }

        public void onFailed(int i, String str) {
            this.f13023a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("LanMode");
            if (property.isValueValid()) {
                this.f13023a.mo32636a((Long) propertyInfo.getValue("LanMode"));
                return;
            }
            C6654m0 m0Var = this.f13023a;
            m0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling35Service$a0 */
    class C6630a0 implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13024a;

        C6630a0(Ceiling35Service ceiling35Service, CompletionHandler completionHandler) {
            this.f13024a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13024a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f13024a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling35Service$b */
    class C6631b implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6668t0 f13025a;

        C6631b(Ceiling35Service ceiling35Service, C6668t0 t0Var) {
            this.f13025a = t0Var;
        }

        public void onFailed(int i, String str) {
            this.f13025a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("SaveState");
            if (property.isValueValid()) {
                this.f13025a.mo32650a((Long) propertyInfo.getValue("SaveState"));
                return;
            }
            C6668t0 t0Var = this.f13025a;
            t0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling35Service$b0 */
    class C6632b0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6666s0 f13026a;

        C6632b0(Ceiling35Service ceiling35Service, C6666s0 s0Var) {
            this.f13026a = s0Var;
        }

        public void onFailed(int i, String str) {
            this.f13026a.onFailed(i, str);
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
                com.yeelight.yeelib.device.xiaomi.Ceiling35Service$Power r1 = com.yeelight.yeelib.device.xiaomi.Ceiling35Service.Power.valueOf(r1)
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
                java.lang.String r1 = "NlCt"
                com.miot.common.property.Property r1 = r0.getProperty(r1)
                boolean r2 = r1.isValueValid()
                if (r2 == 0) goto L_0x011a
                java.lang.Object r1 = r1.getValue()
                java.lang.Long r1 = (java.lang.Long) r1
                r17 = r1
                goto L_0x011c
            L_0x011a:
                r17 = r3
            L_0x011c:
                java.lang.String r1 = "SmartSwitch"
                com.miot.common.property.Property r0 = r0.getProperty(r1)
                boolean r1 = r0.isValueValid()
                if (r1 == 0) goto L_0x012f
                java.lang.Object r0 = r0.getValue()
                r3 = r0
                java.lang.Long r3 = (java.lang.Long) r3
            L_0x012f:
                r0 = r19
                r18 = r3
                com.yeelight.yeelib.device.xiaomi.Ceiling35Service$s0 r4 = r0.f13026a
                r4.mo32648a(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.xiaomi.Ceiling35Service.C6632b0.onSucceed(com.miot.common.device.invocation.PropertyInfo):void");
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling35Service$c */
    class C6633c implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6672v0 f13027a;

        C6633c(Ceiling35Service ceiling35Service, C6672v0 v0Var) {
            this.f13027a = v0Var;
        }

        public void onFailed(int i, String str) {
            this.f13027a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("onFromPower");
            if (property.isValueValid()) {
                this.f13027a.mo32654a((Long) propertyInfo.getValue("onFromPower"));
                return;
            }
            C6672v0 v0Var = this.f13027a;
            v0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling35Service$c0 */
    class C6634c0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6664r0 f13028a;

        C6634c0(Ceiling35Service ceiling35Service, C6664r0 r0Var) {
            this.f13028a = r0Var;
        }

        public void onFailed(int i, String str) {
            this.f13028a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Power");
            if (property.isValueValid()) {
                this.f13028a.mo32646a(Power.valueOf((String) propertyInfo.getValue("Power")));
                return;
            }
            C6664r0 r0Var = this.f13028a;
            r0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling35Service$d */
    class C6635d implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6658o0 f13029a;

        C6635d(Ceiling35Service ceiling35Service, C6658o0 o0Var) {
            this.f13029a = o0Var;
        }

        public void onFailed(int i, String str) {
            this.f13029a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("NLBright");
            if (property.isValueValid()) {
                this.f13029a.mo32640a((Long) propertyInfo.getValue("NLBright"));
                return;
            }
            C6658o0 o0Var = this.f13029a;
            o0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling35Service$d0 */
    class C6636d0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6644h0 f13030a;

        C6636d0(Ceiling35Service ceiling35Service, C6644h0 h0Var) {
            this.f13030a = h0Var;
        }

        public void onFailed(int i, String str) {
            this.f13030a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Bright");
            if (property.isValueValid()) {
                this.f13030a.mo32626a((Long) propertyInfo.getValue("Bright"));
                return;
            }
            C6644h0 h0Var = this.f13030a;
            h0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling35Service$e */
    class C6637e implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6660p0 f13031a;

        C6637e(Ceiling35Service ceiling35Service, C6660p0 p0Var) {
            this.f13031a = p0Var;
        }

        public void onFailed(int i, String str) {
            this.f13031a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("NightTimeInfo");
            if (property.isValueValid()) {
                this.f13031a.onSucceed((String) propertyInfo.getValue("NightTimeInfo"));
                return;
            }
            C6660p0 p0Var = this.f13031a;
            p0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling35Service$e0 */
    class C6638e0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6646i0 f13032a;

        C6638e0(Ceiling35Service ceiling35Service, C6646i0 i0Var) {
            this.f13032a = i0Var;
        }

        public void onFailed(int i, String str) {
            this.f13032a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Ct");
            if (property.isValueValid()) {
                this.f13032a.mo32628a((Long) propertyInfo.getValue("Ct"));
                return;
            }
            C6646i0 i0Var = this.f13032a;
            i0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling35Service$f */
    class C6639f implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6656n0 f13033a;

        C6639f(Ceiling35Service ceiling35Service, C6656n0 n0Var) {
            this.f13033a = n0Var;
        }

        public void onFailed(int i, String str) {
            this.f13033a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("MiBandSleep");
            if (property.isValueValid()) {
                this.f13033a.mo32638a((Long) propertyInfo.getValue("MiBandSleep"));
                return;
            }
            C6656n0 n0Var = this.f13033a;
            n0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling35Service$f0 */
    class C6640f0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6648j0 f13034a;

        C6640f0(Ceiling35Service ceiling35Service, C6648j0 j0Var) {
            this.f13034a = j0Var;
        }

        public void onFailed(int i, String str) {
            this.f13034a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("DelayOff");
            if (property.isValueValid()) {
                this.f13034a.mo32630a((Long) propertyInfo.getValue("DelayOff"));
                return;
            }
            C6648j0 j0Var = this.f13034a;
            j0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling35Service$g */
    class C6641g implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6652l0 f13035a;

        C6641g(Ceiling35Service ceiling35Service, C6652l0 l0Var) {
            this.f13035a = l0Var;
        }

        public void onFailed(int i, String str) {
            this.f13035a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Flowing");
            if (property.isValueValid()) {
                this.f13035a.mo32634a((Long) propertyInfo.getValue("Flowing"));
                return;
            }
            C6652l0 l0Var = this.f13035a;
            l0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling35Service$g0 */
    class C6642g0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6650k0 f13036a;

        C6642g0(Ceiling35Service ceiling35Service, C6650k0 k0Var) {
            this.f13036a = k0Var;
        }

        public void onFailed(int i, String str) {
            this.f13036a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("FlowParams");
            if (property.isValueValid()) {
                this.f13036a.onSucceed((String) propertyInfo.getValue("FlowParams"));
                return;
            }
            C6650k0 k0Var = this.f13036a;
            k0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling35Service$h */
    class C6643h implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6662q0 f13037a;

        C6643h(Ceiling35Service ceiling35Service, C6662q0 q0Var) {
            this.f13037a = q0Var;
        }

        public void onFailed(int i, String str) {
            this.f13037a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty(Ceiling35Service.PROPERTY_NlCt);
            if (property.isValueValid()) {
                this.f13037a.mo32644a((Long) propertyInfo.getValue(Ceiling35Service.PROPERTY_NlCt));
                return;
            }
            C6662q0 q0Var = this.f13037a;
            q0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling35Service$h0 */
    public interface C6644h0 {
        /* renamed from: a */
        void mo32626a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling35Service$i */
    class C6645i implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6670u0 f13038a;

        C6645i(Ceiling35Service ceiling35Service, C6670u0 u0Var) {
            this.f13038a = u0Var;
        }

        public void onFailed(int i, String str) {
            this.f13038a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("SmartSwitch");
            if (property.isValueValid()) {
                this.f13038a.mo32652a((Long) propertyInfo.getValue("SmartSwitch"));
                return;
            }
            C6670u0 u0Var = this.f13038a;
            u0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling35Service$i0 */
    public interface C6646i0 {
        /* renamed from: a */
        void mo32628a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling35Service$j */
    class C6647j implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13039a;

        C6647j(Ceiling35Service ceiling35Service, CompletionHandler completionHandler) {
            this.f13039a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13039a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13039a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling35Service$j0 */
    public interface C6648j0 {
        /* renamed from: a */
        void mo32630a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling35Service$k */
    class C6649k implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13040a;

        C6649k(Ceiling35Service ceiling35Service, CompletionHandler completionHandler) {
            this.f13040a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13040a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f13040a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling35Service$k0 */
    public interface C6650k0 {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling35Service$l */
    class C6651l implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13041a;

        C6651l(Ceiling35Service ceiling35Service, CompletionHandler completionHandler) {
            this.f13041a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13041a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13041a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling35Service$l0 */
    public interface C6652l0 {
        /* renamed from: a */
        void mo32634a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling35Service$m */
    class C6653m implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13042a;

        C6653m(Ceiling35Service ceiling35Service, CompletionHandler completionHandler) {
            this.f13042a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13042a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13042a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling35Service$m0 */
    public interface C6654m0 {
        /* renamed from: a */
        void mo32636a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling35Service$n */
    class C6655n implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13043a;

        C6655n(Ceiling35Service ceiling35Service, CompletionHandler completionHandler) {
            this.f13043a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13043a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13043a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling35Service$n0 */
    public interface C6656n0 {
        /* renamed from: a */
        void mo32638a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling35Service$o */
    class C6657o implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13044a;

        C6657o(Ceiling35Service ceiling35Service, CompletionHandler completionHandler) {
            this.f13044a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13044a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13044a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling35Service$o0 */
    public interface C6658o0 {
        /* renamed from: a */
        void mo32640a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling35Service$p */
    class C6659p implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13045a;

        C6659p(Ceiling35Service ceiling35Service, CompletionHandler completionHandler) {
            this.f13045a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13045a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13045a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling35Service$p0 */
    public interface C6660p0 {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling35Service$q */
    class C6661q implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13046a;

        C6661q(Ceiling35Service ceiling35Service, CompletionHandler completionHandler) {
            this.f13046a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13046a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13046a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling35Service$q0 */
    public interface C6662q0 {
        /* renamed from: a */
        void mo32644a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling35Service$r */
    class C6663r implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13047a;

        C6663r(Ceiling35Service ceiling35Service, CompletionHandler completionHandler) {
            this.f13047a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13047a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13047a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling35Service$r0 */
    public interface C6664r0 {
        /* renamed from: a */
        void mo32646a(Power power);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling35Service$s */
    class C6665s implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13048a;

        C6665s(Ceiling35Service ceiling35Service, CompletionHandler completionHandler) {
            this.f13048a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13048a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13048a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling35Service$s0 */
    public interface C6666s0 {
        /* renamed from: a */
        void mo32648a(Power power, Long l, Long l2, Long l3, String str, Long l4, Long l5, Long l6, Long l7, String str2, Long l8, Long l9, Long l10, Long l11);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling35Service$t */
    class C6667t implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13049a;

        C6667t(Ceiling35Service ceiling35Service, CompletionHandler completionHandler) {
            this.f13049a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13049a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13049a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling35Service$t0 */
    public interface C6668t0 {
        /* renamed from: a */
        void mo32650a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling35Service$u */
    class C6669u implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13050a;

        C6669u(Ceiling35Service ceiling35Service, CompletionHandler completionHandler) {
            this.f13050a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13050a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13050a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling35Service$u0 */
    public interface C6670u0 {
        /* renamed from: a */
        void mo32652a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling35Service$v */
    class C6671v implements DeviceManipulator.PropertyChangedListener {

        /* renamed from: a */
        final /* synthetic */ C6674w0 f13051a;

        C6671v(Ceiling35Service ceiling35Service, C6674w0 w0Var) {
            this.f13051a = w0Var;
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
                case -2002016140:
                    if (str2.equals("FlowParams")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1331143373:
                    if (str2.equals("NightTimeInfo")) {
                        c = 2;
                        break;
                    }
                    break;
                case -770908584:
                    if (str2.equals("NLBright")) {
                        c = 3;
                        break;
                    }
                    break;
                case -80340154:
                    if (str2.equals("MiBandSleep")) {
                        c = 4;
                        break;
                    }
                    break;
                case 2193:
                    if (str2.equals("Ct")) {
                        c = 5;
                        break;
                    }
                    break;
                case 2429679:
                    if (str2.equals(Ceiling35Service.PROPERTY_NlCt)) {
                        c = 6;
                        break;
                    }
                    break;
                case 35911772:
                    if (str2.equals("onFromPower")) {
                        c = 7;
                        break;
                    }
                    break;
                case 77306085:
                    if (str2.equals("Power")) {
                        c = 8;
                        break;
                    }
                    break;
                case 880790796:
                    if (str2.equals("DelayOff")) {
                        c = 9;
                        break;
                    }
                    break;
                case 898856916:
                    if (str2.equals("Flowing")) {
                        c = 10;
                        break;
                    }
                    break;
                case 1179821629:
                    if (str2.equals("SmartSwitch")) {
                        c = 11;
                        break;
                    }
                    break;
                case 1611821756:
                    if (str2.equals("LanMode")) {
                        c = 12;
                        break;
                    }
                    break;
                case 1998035738:
                    if (str2.equals("Bright")) {
                        c = 13;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    PropertyInfo propertyInfo3 = propertyInfo;
                    String str3 = "SaveState";
                    if (propertyInfo3.getProperty(str3).isValueValid()) {
                        this.f13051a.mo32658c((Long) propertyInfo3.getValue(str3));
                        return;
                    }
                    return;
                case 1:
                    String str4 = "FlowParams";
                    PropertyInfo propertyInfo4 = propertyInfo;
                    if (propertyInfo4.getProperty(str4).isValueValid()) {
                        this.f13051a.mo32660e((String) propertyInfo4.getValue(str4));
                        return;
                    }
                    return;
                case 2:
                    PropertyInfo propertyInfo5 = propertyInfo;
                    if (propertyInfo5.getProperty("NightTimeInfo").isValueValid()) {
                        this.f13051a.mo32664i((String) propertyInfo5.getValue("NightTimeInfo"));
                        return;
                    }
                    return;
                case 3:
                    PropertyInfo propertyInfo6 = propertyInfo;
                    if (propertyInfo6.getProperty("NLBright").isValueValid()) {
                        this.f13051a.mo32666k((Long) propertyInfo6.getValue("NLBright"));
                        return;
                    }
                    return;
                case 4:
                    PropertyInfo propertyInfo7 = propertyInfo;
                    if (propertyInfo7.getProperty("MiBandSleep").isValueValid()) {
                        this.f13051a.mo32668m((Long) propertyInfo7.getValue("MiBandSleep"));
                        return;
                    }
                    return;
                case 5:
                    PropertyInfo propertyInfo8 = propertyInfo;
                    if (propertyInfo8.getProperty("Ct").isValueValid()) {
                        this.f13051a.mo32663h((Long) propertyInfo8.getValue("Ct"));
                        return;
                    }
                    return;
                case 6:
                    PropertyInfo propertyInfo9 = propertyInfo;
                    if (propertyInfo9.getProperty(Ceiling35Service.PROPERTY_NlCt).isValueValid()) {
                        this.f13051a.mo32665j((Long) propertyInfo9.getValue(Ceiling35Service.PROPERTY_NlCt));
                        return;
                    }
                    return;
                case 7:
                    PropertyInfo propertyInfo10 = propertyInfo;
                    if (propertyInfo10.getProperty("onFromPower").isValueValid()) {
                        this.f13051a.mo32661f((Long) propertyInfo10.getValue("onFromPower"));
                        return;
                    }
                    return;
                case 8:
                    PropertyInfo propertyInfo11 = propertyInfo;
                    if (propertyInfo11.getProperty("Power").isValueValid()) {
                        this.f13051a.mo32667l(Power.valueOf((String) propertyInfo11.getValue("Power")));
                        return;
                    }
                    return;
                case 9:
                    PropertyInfo propertyInfo12 = propertyInfo;
                    if (propertyInfo12.getProperty("DelayOff").isValueValid()) {
                        this.f13051a.mo32657b((Long) propertyInfo12.getValue("DelayOff"));
                        return;
                    }
                    return;
                case 10:
                    PropertyInfo propertyInfo13 = propertyInfo;
                    if (propertyInfo13.getProperty("Flowing").isValueValid()) {
                        this.f13051a.mo32659d((Long) propertyInfo13.getValue("Flowing"));
                        return;
                    }
                    return;
                case 11:
                    PropertyInfo propertyInfo14 = propertyInfo;
                    if (propertyInfo14.getProperty("SmartSwitch").isValueValid()) {
                        this.f13051a.mo32669o((Long) propertyInfo14.getValue("SmartSwitch"));
                        return;
                    }
                    return;
                case 12:
                    PropertyInfo propertyInfo15 = propertyInfo;
                    if (propertyInfo15.getProperty("LanMode").isValueValid()) {
                        this.f13051a.mo32662g((Long) propertyInfo15.getValue("LanMode"));
                        return;
                    }
                    return;
                case 13:
                    PropertyInfo propertyInfo16 = propertyInfo;
                    if (propertyInfo16.getProperty("Bright").isValueValid()) {
                        this.f13051a.mo32656a((Long) propertyInfo16.getValue("Bright"));
                        return;
                    }
                    break;
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling35Service$v0 */
    public interface C6672v0 {
        /* renamed from: a */
        void mo32654a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling35Service$w */
    class C6673w implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13052a;

        C6673w(Ceiling35Service ceiling35Service, CompletionHandler completionHandler) {
            this.f13052a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13052a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13052a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling35Service$w0 */
    public interface C6674w0 {
        /* renamed from: a */
        void mo32656a(Long l);

        /* renamed from: b */
        void mo32657b(Long l);

        /* renamed from: c */
        void mo32658c(Long l);

        /* renamed from: d */
        void mo32659d(Long l);

        /* renamed from: e */
        void mo32660e(String str);

        /* renamed from: f */
        void mo32661f(Long l);

        /* renamed from: g */
        void mo32662g(Long l);

        /* renamed from: h */
        void mo32663h(Long l);

        /* renamed from: i */
        void mo32664i(String str);

        /* renamed from: j */
        void mo32665j(Long l);

        /* renamed from: k */
        void mo32666k(Long l);

        /* renamed from: l */
        void mo32667l(Power power);

        /* renamed from: m */
        void mo32668m(Long l);

        /* renamed from: o */
        void mo32669o(Long l);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling35Service$x */
    class C6675x implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13053a;

        C6675x(Ceiling35Service ceiling35Service, CompletionHandler completionHandler) {
            this.f13053a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13053a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13053a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling35Service$y */
    class C6676y implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13054a;

        C6676y(Ceiling35Service ceiling35Service, CompletionHandler completionHandler) {
            this.f13054a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13054a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13054a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling35Service$z */
    class C6677z implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13055a;

        C6677z(Ceiling35Service ceiling35Service, CompletionHandler completionHandler) {
            this.f13055a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13055a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13055a.onSucceed();
        }
    }

    public Ceiling35Service(AbstractDevice abstractDevice) {
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
                MiotManager.getDeviceManipulator().invoke(create, new C6663r(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6651l(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getBright(C6644h0 h0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Bright"), new C6636d0(this, h0Var));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6677z(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getCt(C6646i0 i0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Ct"), new C6638e0(this, i0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getDelayOff(C6648j0 j0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "DelayOff"), new C6640f0(this, j0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowParams(C6650k0 k0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "FlowParams"), new C6642g0(this, k0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowing(C6652l0 l0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Flowing"), new C6641g(this, l0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getLanMode(C6654m0 m0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "LanMode"), new C6629a(this, m0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getMiBandSleep(C6656n0 n0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "MiBandSleep"), new C6639f(this, n0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getNLBright(C6658o0 o0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "NLBright"), new C6635d(this, o0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getNightTimeInfo(C6660p0 p0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "NightTimeInfo"), new C6637e(this, p0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getNlCt(C6662q0 q0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), PROPERTY_NlCt), new C6643h(this, q0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getPower(C6664r0 r0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Power"), new C6634c0(this, r0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getProperties(C6666s0 s0Var) {
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
            create.addProperty(getService().getProperty(PROPERTY_NlCt));
            create.addProperty(getService().getProperty("SmartSwitch"));
            MiotManager.getDeviceManipulator().readProperty(create, new C6632b0(this, s0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getSaveState(C6668t0 t0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "SaveState"), new C6631b(this, t0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getSmartSwitch(C6670u0 u0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "SmartSwitch"), new C6645i(this, u0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getonFromPower(C6672v0 v0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "onFromPower"), new C6633c(this, v0Var));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6657o(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6653m(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6669u(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6647j(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6676y(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6665s(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6675x(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setNLScene(String str, Long l, Long l2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setNLScene");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("ParamModel", str)) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("ParamFinish", l)) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("Ct", l2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C6667t(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6659p(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6655n(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6673w(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void subscribeNotifications(CompletionHandler completionHandler, C6674w0 w0Var) {
        if (completionHandler == null) {
            throw new IllegalArgumentException("handler is null");
        } else if (w0Var != null) {
            PropertyInfo create = PropertyInfoFactory.create(getService());
            for (Property next : getService().getProperties()) {
                if (next.getDefinition().isNotifiable()) {
                    create.addProperty(next);
                }
            }
            MiotManager.getDeviceManipulator().addPropertyChangedListener(create, new C6649k(this, completionHandler), new C6671v(this, w0Var));
        } else {
            throw new IllegalArgumentException("listener is null");
        }
    }

    public void toggle(CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "toggle");
            if (create != null) {
                MiotManager.getDeviceManipulator().invoke(create, new C6661q(this, completionHandler));
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
            MiotManager.getDeviceManipulator().removePropertyChangedListener(create, new C6630a0(this, completionHandler));
            return;
        }
        throw new IllegalArgumentException("handler is null");
    }
}
