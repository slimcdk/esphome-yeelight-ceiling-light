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

public class Ceiling29Service extends AbstractService {
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
    public static final String ACTION_setScene2 = "setScene2";
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
    public static final String PROPERTY_TransIntervalDflt = "TransIntervalDflt";
    public static final String PROPERTY_adjustAction = "adjustAction";
    public static final String PROPERTY_adjustProper = "adjustProper";
    public static final String PROPERTY_onFromPower = "onFromPower";
    private static final String TAG = "Ceiling29Service";
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
        cfg_smart_switch,
        trans_default
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

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling29Service$a */
    class C6537a implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6564n0 f12958a;

        C6537a(Ceiling29Service ceiling29Service, C6564n0 n0Var) {
            this.f12958a = n0Var;
        }

        public void onFailed(int i, String str) {
            this.f12958a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("LanMode");
            if (property.isValueValid()) {
                this.f12958a.mo32497a((Long) propertyInfo.getValue("LanMode"));
                return;
            }
            C6564n0 n0Var = this.f12958a;
            n0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling29Service$a0 */
    class C6538a0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12959a;

        C6538a0(Ceiling29Service ceiling29Service, CompletionHandler completionHandler) {
            this.f12959a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12959a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12959a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling29Service$b */
    class C6539b implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6576t0 f12960a;

        C6539b(Ceiling29Service ceiling29Service, C6576t0 t0Var) {
            this.f12960a = t0Var;
        }

        public void onFailed(int i, String str) {
            this.f12960a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("SaveState");
            if (property.isValueValid()) {
                this.f12960a.mo32509a((Long) propertyInfo.getValue("SaveState"));
                return;
            }
            C6576t0 t0Var = this.f12960a;
            t0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling29Service$b0 */
    class C6540b0 implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12961a;

        C6540b0(Ceiling29Service ceiling29Service, CompletionHandler completionHandler) {
            this.f12961a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12961a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f12961a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling29Service$c */
    class C6541c implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6580v0 f12962a;

        C6541c(Ceiling29Service ceiling29Service, C6580v0 v0Var) {
            this.f12962a = v0Var;
        }

        public void onFailed(int i, String str) {
            this.f12962a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("TransIntervalDflt");
            if (property.isValueValid()) {
                this.f12962a.mo32513a((Long) propertyInfo.getValue("TransIntervalDflt"));
                return;
            }
            C6580v0 v0Var = this.f12962a;
            v0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling29Service$c0 */
    class C6542c0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6574s0 f12963a;

        C6542c0(Ceiling29Service ceiling29Service, C6574s0 s0Var) {
            this.f12963a = s0Var;
        }

        public void onFailed(int i, String str) {
            this.f12963a.onFailed(i, str);
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
                com.yeelight.yeelib.device.xiaomi.Ceiling29Service$Power r1 = com.yeelight.yeelib.device.xiaomi.Ceiling29Service.Power.valueOf(r1)
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
                java.lang.String r1 = "TransIntervalDflt"
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
                java.lang.String r1 = "onFromPower"
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
                java.lang.String r1 = "NLBright"
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
                java.lang.String r1 = "NightTimeInfo"
                com.miot.common.property.Property r1 = r0.getProperty(r1)
                boolean r2 = r1.isValueValid()
                if (r2 == 0) goto L_0x00ed
                java.lang.Object r1 = r1.getValue()
                java.lang.String r1 = (java.lang.String) r1
                r15 = r1
                goto L_0x00ee
            L_0x00ed:
                r15 = r3
            L_0x00ee:
                java.lang.String r1 = "MiBandSleep"
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
                java.lang.String r1 = "Flowing"
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
                com.yeelight.yeelib.device.xiaomi.Ceiling29Service$s0 r4 = r0.f12963a
                r4.mo32507a(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.xiaomi.Ceiling29Service.C6542c0.onSucceed(com.miot.common.device.invocation.PropertyInfo):void");
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling29Service$d */
    class C6543d implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6582w0 f12964a;

        C6543d(Ceiling29Service ceiling29Service, C6582w0 w0Var) {
            this.f12964a = w0Var;
        }

        public void onFailed(int i, String str) {
            this.f12964a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("onFromPower");
            if (property.isValueValid()) {
                this.f12964a.mo32515a((Long) propertyInfo.getValue("onFromPower"));
                return;
            }
            C6582w0 w0Var = this.f12964a;
            w0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling29Service$d0 */
    class C6544d0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6572r0 f12965a;

        C6544d0(Ceiling29Service ceiling29Service, C6572r0 r0Var) {
            this.f12965a = r0Var;
        }

        public void onFailed(int i, String str) {
            this.f12965a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Power");
            if (property.isValueValid()) {
                this.f12965a.mo32505a(Power.valueOf((String) propertyInfo.getValue("Power")));
                return;
            }
            C6572r0 r0Var = this.f12965a;
            r0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling29Service$e */
    class C6545e implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6568p0 f12966a;

        C6545e(Ceiling29Service ceiling29Service, C6568p0 p0Var) {
            this.f12966a = p0Var;
        }

        public void onFailed(int i, String str) {
            this.f12966a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("NLBright");
            if (property.isValueValid()) {
                this.f12966a.mo32501a((Long) propertyInfo.getValue("NLBright"));
                return;
            }
            C6568p0 p0Var = this.f12966a;
            p0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling29Service$e0 */
    class C6546e0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6554i0 f12967a;

        C6546e0(Ceiling29Service ceiling29Service, C6554i0 i0Var) {
            this.f12967a = i0Var;
        }

        public void onFailed(int i, String str) {
            this.f12967a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Bright");
            if (property.isValueValid()) {
                this.f12967a.mo32487a((Long) propertyInfo.getValue("Bright"));
                return;
            }
            C6554i0 i0Var = this.f12967a;
            i0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling29Service$f */
    class C6547f implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6570q0 f12968a;

        C6547f(Ceiling29Service ceiling29Service, C6570q0 q0Var) {
            this.f12968a = q0Var;
        }

        public void onFailed(int i, String str) {
            this.f12968a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("NightTimeInfo");
            if (property.isValueValid()) {
                this.f12968a.onSucceed((String) propertyInfo.getValue("NightTimeInfo"));
                return;
            }
            C6570q0 q0Var = this.f12968a;
            q0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling29Service$f0 */
    class C6548f0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6556j0 f12969a;

        C6548f0(Ceiling29Service ceiling29Service, C6556j0 j0Var) {
            this.f12969a = j0Var;
        }

        public void onFailed(int i, String str) {
            this.f12969a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Ct");
            if (property.isValueValid()) {
                this.f12969a.mo32489a((Long) propertyInfo.getValue("Ct"));
                return;
            }
            C6556j0 j0Var = this.f12969a;
            j0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling29Service$g */
    class C6549g implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6566o0 f12970a;

        C6549g(Ceiling29Service ceiling29Service, C6566o0 o0Var) {
            this.f12970a = o0Var;
        }

        public void onFailed(int i, String str) {
            this.f12970a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("MiBandSleep");
            if (property.isValueValid()) {
                this.f12970a.mo32499a((Long) propertyInfo.getValue("MiBandSleep"));
                return;
            }
            C6566o0 o0Var = this.f12970a;
            o0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling29Service$g0 */
    class C6550g0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6558k0 f12971a;

        C6550g0(Ceiling29Service ceiling29Service, C6558k0 k0Var) {
            this.f12971a = k0Var;
        }

        public void onFailed(int i, String str) {
            this.f12971a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("DelayOff");
            if (property.isValueValid()) {
                this.f12971a.mo32491a((Long) propertyInfo.getValue("DelayOff"));
                return;
            }
            C6558k0 k0Var = this.f12971a;
            k0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling29Service$h */
    class C6551h implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6562m0 f12972a;

        C6551h(Ceiling29Service ceiling29Service, C6562m0 m0Var) {
            this.f12972a = m0Var;
        }

        public void onFailed(int i, String str) {
            this.f12972a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Flowing");
            if (property.isValueValid()) {
                this.f12972a.mo32495a((Long) propertyInfo.getValue("Flowing"));
                return;
            }
            C6562m0 m0Var = this.f12972a;
            m0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling29Service$h0 */
    class C6552h0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6560l0 f12973a;

        C6552h0(Ceiling29Service ceiling29Service, C6560l0 l0Var) {
            this.f12973a = l0Var;
        }

        public void onFailed(int i, String str) {
            this.f12973a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("FlowParams");
            if (property.isValueValid()) {
                this.f12973a.onSucceed((String) propertyInfo.getValue("FlowParams"));
                return;
            }
            C6560l0 l0Var = this.f12973a;
            l0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling29Service$i */
    class C6553i implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6578u0 f12974a;

        C6553i(Ceiling29Service ceiling29Service, C6578u0 u0Var) {
            this.f12974a = u0Var;
        }

        public void onFailed(int i, String str) {
            this.f12974a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("SmartSwitch");
            if (property.isValueValid()) {
                this.f12974a.mo32511a((Long) propertyInfo.getValue("SmartSwitch"));
                return;
            }
            C6578u0 u0Var = this.f12974a;
            u0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling29Service$i0 */
    public interface C6554i0 {
        /* renamed from: a */
        void mo32487a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling29Service$j */
    class C6555j implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12975a;

        C6555j(Ceiling29Service ceiling29Service, CompletionHandler completionHandler) {
            this.f12975a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12975a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12975a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling29Service$j0 */
    public interface C6556j0 {
        /* renamed from: a */
        void mo32489a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling29Service$k */
    class C6557k implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12976a;

        C6557k(Ceiling29Service ceiling29Service, CompletionHandler completionHandler) {
            this.f12976a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12976a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f12976a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling29Service$k0 */
    public interface C6558k0 {
        /* renamed from: a */
        void mo32491a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling29Service$l */
    class C6559l implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12977a;

        C6559l(Ceiling29Service ceiling29Service, CompletionHandler completionHandler) {
            this.f12977a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12977a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12977a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling29Service$l0 */
    public interface C6560l0 {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling29Service$m */
    class C6561m implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12978a;

        C6561m(Ceiling29Service ceiling29Service, CompletionHandler completionHandler) {
            this.f12978a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12978a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12978a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling29Service$m0 */
    public interface C6562m0 {
        /* renamed from: a */
        void mo32495a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling29Service$n */
    class C6563n implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12979a;

        C6563n(Ceiling29Service ceiling29Service, CompletionHandler completionHandler) {
            this.f12979a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12979a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12979a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling29Service$n0 */
    public interface C6564n0 {
        /* renamed from: a */
        void mo32497a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling29Service$o */
    class C6565o implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12980a;

        C6565o(Ceiling29Service ceiling29Service, CompletionHandler completionHandler) {
            this.f12980a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12980a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12980a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling29Service$o0 */
    public interface C6566o0 {
        /* renamed from: a */
        void mo32499a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling29Service$p */
    class C6567p implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12981a;

        C6567p(Ceiling29Service ceiling29Service, CompletionHandler completionHandler) {
            this.f12981a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12981a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12981a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling29Service$p0 */
    public interface C6568p0 {
        /* renamed from: a */
        void mo32501a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling29Service$q */
    class C6569q implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12982a;

        C6569q(Ceiling29Service ceiling29Service, CompletionHandler completionHandler) {
            this.f12982a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12982a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12982a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling29Service$q0 */
    public interface C6570q0 {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling29Service$r */
    class C6571r implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12983a;

        C6571r(Ceiling29Service ceiling29Service, CompletionHandler completionHandler) {
            this.f12983a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12983a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12983a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling29Service$r0 */
    public interface C6572r0 {
        /* renamed from: a */
        void mo32505a(Power power);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling29Service$s */
    class C6573s implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12984a;

        C6573s(Ceiling29Service ceiling29Service, CompletionHandler completionHandler) {
            this.f12984a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12984a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12984a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling29Service$s0 */
    public interface C6574s0 {
        /* renamed from: a */
        void mo32507a(Power power, Long l, Long l2, Long l3, String str, Long l4, Long l5, Long l6, Long l7, Long l8, String str2, Long l9, Long l10, Long l11);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling29Service$t */
    class C6575t implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12985a;

        C6575t(Ceiling29Service ceiling29Service, CompletionHandler completionHandler) {
            this.f12985a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12985a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12985a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling29Service$t0 */
    public interface C6576t0 {
        /* renamed from: a */
        void mo32509a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling29Service$u */
    class C6577u implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12986a;

        C6577u(Ceiling29Service ceiling29Service, CompletionHandler completionHandler) {
            this.f12986a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12986a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12986a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling29Service$u0 */
    public interface C6578u0 {
        /* renamed from: a */
        void mo32511a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling29Service$v */
    class C6579v implements DeviceManipulator.PropertyChangedListener {

        /* renamed from: a */
        final /* synthetic */ C6584x0 f12987a;

        C6579v(Ceiling29Service ceiling29Service, C6584x0 x0Var) {
            this.f12987a = x0Var;
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
                case -718325097:
                    if (str2.equals("TransIntervalDflt")) {
                        c = 4;
                        break;
                    }
                    break;
                case -80340154:
                    if (str2.equals("MiBandSleep")) {
                        c = 5;
                        break;
                    }
                    break;
                case 2193:
                    if (str2.equals("Ct")) {
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
                        this.f12987a.mo32519c((Long) propertyInfo3.getValue(str3));
                        return;
                    }
                    return;
                case 1:
                    String str4 = "FlowParams";
                    PropertyInfo propertyInfo4 = propertyInfo;
                    if (propertyInfo4.getProperty(str4).isValueValid()) {
                        this.f12987a.mo32521e((String) propertyInfo4.getValue(str4));
                        return;
                    }
                    return;
                case 2:
                    PropertyInfo propertyInfo5 = propertyInfo;
                    if (propertyInfo5.getProperty("NightTimeInfo").isValueValid()) {
                        this.f12987a.mo32525i((String) propertyInfo5.getValue("NightTimeInfo"));
                        return;
                    }
                    return;
                case 3:
                    PropertyInfo propertyInfo6 = propertyInfo;
                    if (propertyInfo6.getProperty("NLBright").isValueValid()) {
                        this.f12987a.mo32526k((Long) propertyInfo6.getValue("NLBright"));
                        return;
                    }
                    return;
                case 4:
                    PropertyInfo propertyInfo7 = propertyInfo;
                    if (propertyInfo7.getProperty("TransIntervalDflt").isValueValid()) {
                        this.f12987a.mo32529p((Long) propertyInfo7.getValue("TransIntervalDflt"));
                        return;
                    }
                    return;
                case 5:
                    PropertyInfo propertyInfo8 = propertyInfo;
                    if (propertyInfo8.getProperty("MiBandSleep").isValueValid()) {
                        this.f12987a.mo32527m((Long) propertyInfo8.getValue("MiBandSleep"));
                        return;
                    }
                    return;
                case 6:
                    PropertyInfo propertyInfo9 = propertyInfo;
                    if (propertyInfo9.getProperty("Ct").isValueValid()) {
                        this.f12987a.mo32524h((Long) propertyInfo9.getValue("Ct"));
                        return;
                    }
                    return;
                case 7:
                    PropertyInfo propertyInfo10 = propertyInfo;
                    if (propertyInfo10.getProperty("onFromPower").isValueValid()) {
                        this.f12987a.mo32522f((Long) propertyInfo10.getValue("onFromPower"));
                        return;
                    }
                    return;
                case 8:
                    PropertyInfo propertyInfo11 = propertyInfo;
                    if (propertyInfo11.getProperty("Power").isValueValid()) {
                        this.f12987a.mo32530q(Power.valueOf((String) propertyInfo11.getValue("Power")));
                        return;
                    }
                    return;
                case 9:
                    PropertyInfo propertyInfo12 = propertyInfo;
                    if (propertyInfo12.getProperty("DelayOff").isValueValid()) {
                        this.f12987a.mo32518b((Long) propertyInfo12.getValue("DelayOff"));
                        return;
                    }
                    return;
                case 10:
                    PropertyInfo propertyInfo13 = propertyInfo;
                    if (propertyInfo13.getProperty("Flowing").isValueValid()) {
                        this.f12987a.mo32520d((Long) propertyInfo13.getValue("Flowing"));
                        return;
                    }
                    return;
                case 11:
                    PropertyInfo propertyInfo14 = propertyInfo;
                    if (propertyInfo14.getProperty("SmartSwitch").isValueValid()) {
                        this.f12987a.mo32528o((Long) propertyInfo14.getValue("SmartSwitch"));
                        return;
                    }
                    return;
                case 12:
                    PropertyInfo propertyInfo15 = propertyInfo;
                    if (propertyInfo15.getProperty("LanMode").isValueValid()) {
                        this.f12987a.mo32523g((Long) propertyInfo15.getValue("LanMode"));
                        return;
                    }
                    return;
                case 13:
                    PropertyInfo propertyInfo16 = propertyInfo;
                    if (propertyInfo16.getProperty("Bright").isValueValid()) {
                        this.f12987a.mo32517a((Long) propertyInfo16.getValue("Bright"));
                        return;
                    }
                    break;
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling29Service$v0 */
    public interface C6580v0 {
        /* renamed from: a */
        void mo32513a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling29Service$w */
    class C6581w implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12988a;

        C6581w(Ceiling29Service ceiling29Service, CompletionHandler completionHandler) {
            this.f12988a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12988a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12988a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling29Service$w0 */
    public interface C6582w0 {
        /* renamed from: a */
        void mo32515a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling29Service$x */
    class C6583x implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12989a;

        C6583x(Ceiling29Service ceiling29Service, CompletionHandler completionHandler) {
            this.f12989a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12989a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12989a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling29Service$x0 */
    public interface C6584x0 {
        /* renamed from: a */
        void mo32517a(Long l);

        /* renamed from: b */
        void mo32518b(Long l);

        /* renamed from: c */
        void mo32519c(Long l);

        /* renamed from: d */
        void mo32520d(Long l);

        /* renamed from: e */
        void mo32521e(String str);

        /* renamed from: f */
        void mo32522f(Long l);

        /* renamed from: g */
        void mo32523g(Long l);

        /* renamed from: h */
        void mo32524h(Long l);

        /* renamed from: i */
        void mo32525i(String str);

        /* renamed from: k */
        void mo32526k(Long l);

        /* renamed from: m */
        void mo32527m(Long l);

        /* renamed from: o */
        void mo32528o(Long l);

        /* renamed from: p */
        void mo32529p(Long l);

        /* renamed from: q */
        void mo32530q(Power power);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling29Service$y */
    class C6585y implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12990a;

        C6585y(Ceiling29Service ceiling29Service, CompletionHandler completionHandler) {
            this.f12990a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12990a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12990a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling29Service$z */
    class C6586z implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12991a;

        C6586z(Ceiling29Service ceiling29Service, CompletionHandler completionHandler) {
            this.f12991a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12991a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12991a.onSucceed();
        }
    }

    public Ceiling29Service(AbstractDevice abstractDevice) {
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
                MiotManager.getDeviceManipulator().invoke(create, new C6573s(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6559l(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getBright(C6554i0 i0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Bright"), new C6546e0(this, i0Var));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6538a0(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getCt(C6556j0 j0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Ct"), new C6548f0(this, j0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getDelayOff(C6558k0 k0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "DelayOff"), new C6550g0(this, k0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowParams(C6560l0 l0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "FlowParams"), new C6552h0(this, l0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowing(C6562m0 m0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Flowing"), new C6551h(this, m0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getLanMode(C6564n0 n0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "LanMode"), new C6537a(this, n0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getMiBandSleep(C6566o0 o0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "MiBandSleep"), new C6549g(this, o0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getNLBright(C6568p0 p0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "NLBright"), new C6545e(this, p0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getNightTimeInfo(C6570q0 q0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "NightTimeInfo"), new C6547f(this, q0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getPower(C6572r0 r0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Power"), new C6544d0(this, r0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getProperties(C6574s0 s0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            PropertyInfo create = PropertyInfoFactory.create(getService());
            create.addProperty(getService().getProperty("Power"));
            create.addProperty(getService().getProperty("Bright"));
            create.addProperty(getService().getProperty("Ct"));
            create.addProperty(getService().getProperty("DelayOff"));
            create.addProperty(getService().getProperty("FlowParams"));
            create.addProperty(getService().getProperty("LanMode"));
            create.addProperty(getService().getProperty("SaveState"));
            create.addProperty(getService().getProperty("TransIntervalDflt"));
            create.addProperty(getService().getProperty("onFromPower"));
            create.addProperty(getService().getProperty("NLBright"));
            create.addProperty(getService().getProperty("NightTimeInfo"));
            create.addProperty(getService().getProperty("MiBandSleep"));
            create.addProperty(getService().getProperty("Flowing"));
            create.addProperty(getService().getProperty("SmartSwitch"));
            MiotManager.getDeviceManipulator().readProperty(create, new C6542c0(this, s0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getSaveState(C6576t0 t0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "SaveState"), new C6539b(this, t0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getSmartSwitch(C6578u0 u0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "SmartSwitch"), new C6553i(this, u0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getTransIntervalDflt(C6580v0 v0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "TransIntervalDflt"), new C6541c(this, v0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getonFromPower(C6582w0 w0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "onFromPower"), new C6543d(this, w0Var));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6567p(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6561m(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6581w(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6555j(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6586z(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6575t(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6585y(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6577u(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6569q(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6563n(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setScene2(String str, Long l, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setScene2");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("ParamModel", str)) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("ParamCount", l)) {
                MiotManager.getDeviceManipulator().invoke(create, new C6565o(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6583x(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void subscribeNotifications(CompletionHandler completionHandler, C6584x0 x0Var) {
        if (completionHandler == null) {
            throw new IllegalArgumentException("handler is null");
        } else if (x0Var != null) {
            PropertyInfo create = PropertyInfoFactory.create(getService());
            for (Property next : getService().getProperties()) {
                if (next.getDefinition().isNotifiable()) {
                    create.addProperty(next);
                }
            }
            MiotManager.getDeviceManipulator().addPropertyChangedListener(create, new C6557k(this, completionHandler), new C6579v(this, x0Var));
        } else {
            throw new IllegalArgumentException("listener is null");
        }
    }

    public void toggle(CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "toggle");
            if (create != null) {
                MiotManager.getDeviceManipulator().invoke(create, new C6571r(this, completionHandler));
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
            MiotManager.getDeviceManipulator().removePropertyChangedListener(create, new C6540b0(this, completionHandler));
            return;
        }
        throw new IllegalArgumentException("handler is null");
    }
}
