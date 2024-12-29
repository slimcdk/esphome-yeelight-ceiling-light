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

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling6Service$a */
    class C6794a implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6817l0 f13141a;

        C6794a(Ceiling6Service ceiling6Service, C6817l0 l0Var) {
            this.f13141a = l0Var;
        }

        public void onFailed(int i, String str) {
            this.f13141a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("LanMode");
            if (property.isValueValid()) {
                this.f13141a.mo32889a((Long) propertyInfo.getValue("LanMode"));
                return;
            }
            C6817l0 l0Var = this.f13141a;
            l0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling6Service$a0 */
    class C6795a0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6827q0 f13142a;

        C6795a0(Ceiling6Service ceiling6Service, C6827q0 q0Var) {
            this.f13142a = q0Var;
        }

        public void onFailed(int i, String str) {
            this.f13142a.onFailed(i, str);
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
                com.yeelight.yeelib.device.xiaomi.Ceiling6Service$Power r1 = com.yeelight.yeelib.device.xiaomi.Ceiling6Service.Power.valueOf(r1)
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
                com.yeelight.yeelib.device.xiaomi.Ceiling6Service$q0 r4 = r0.f13142a
                r4.mo32899a(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.xiaomi.Ceiling6Service.C6795a0.onSucceed(com.miot.common.device.invocation.PropertyInfo):void");
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling6Service$b */
    class C6796b implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6829r0 f13143a;

        C6796b(Ceiling6Service ceiling6Service, C6829r0 r0Var) {
            this.f13143a = r0Var;
        }

        public void onFailed(int i, String str) {
            this.f13143a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("SaveState");
            if (property.isValueValid()) {
                this.f13143a.mo32901a((Long) propertyInfo.getValue("SaveState"));
                return;
            }
            C6829r0 r0Var = this.f13143a;
            r0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling6Service$b0 */
    class C6797b0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6825p0 f13144a;

        C6797b0(Ceiling6Service ceiling6Service, C6825p0 p0Var) {
            this.f13144a = p0Var;
        }

        public void onFailed(int i, String str) {
            this.f13144a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Power");
            if (property.isValueValid()) {
                this.f13144a.mo32897a(Power.valueOf((String) propertyInfo.getValue("Power")));
                return;
            }
            C6825p0 p0Var = this.f13144a;
            p0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling6Service$c */
    class C6798c implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6833t0 f13145a;

        C6798c(Ceiling6Service ceiling6Service, C6833t0 t0Var) {
            this.f13145a = t0Var;
        }

        public void onFailed(int i, String str) {
            this.f13145a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("onFromPower");
            if (property.isValueValid()) {
                this.f13145a.mo32905a((Long) propertyInfo.getValue("onFromPower"));
                return;
            }
            C6833t0 t0Var = this.f13145a;
            t0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling6Service$c0 */
    class C6799c0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6807g0 f13146a;

        C6799c0(Ceiling6Service ceiling6Service, C6807g0 g0Var) {
            this.f13146a = g0Var;
        }

        public void onFailed(int i, String str) {
            this.f13146a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Bright");
            if (property.isValueValid()) {
                this.f13146a.mo32879a((Long) propertyInfo.getValue("Bright"));
                return;
            }
            C6807g0 g0Var = this.f13146a;
            g0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling6Service$d */
    class C6800d implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6821n0 f13147a;

        C6800d(Ceiling6Service ceiling6Service, C6821n0 n0Var) {
            this.f13147a = n0Var;
        }

        public void onFailed(int i, String str) {
            this.f13147a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("NLBright");
            if (property.isValueValid()) {
                this.f13147a.mo32893a((Long) propertyInfo.getValue("NLBright"));
                return;
            }
            C6821n0 n0Var = this.f13147a;
            n0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling6Service$d0 */
    class C6801d0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6809h0 f13148a;

        C6801d0(Ceiling6Service ceiling6Service, C6809h0 h0Var) {
            this.f13148a = h0Var;
        }

        public void onFailed(int i, String str) {
            this.f13148a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Ct");
            if (property.isValueValid()) {
                this.f13148a.mo32881a((Long) propertyInfo.getValue("Ct"));
                return;
            }
            C6809h0 h0Var = this.f13148a;
            h0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling6Service$e */
    class C6802e implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6823o0 f13149a;

        C6802e(Ceiling6Service ceiling6Service, C6823o0 o0Var) {
            this.f13149a = o0Var;
        }

        public void onFailed(int i, String str) {
            this.f13149a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("NightTimeInfo");
            if (property.isValueValid()) {
                this.f13149a.onSucceed((String) propertyInfo.getValue("NightTimeInfo"));
                return;
            }
            C6823o0 o0Var = this.f13149a;
            o0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling6Service$e0 */
    class C6803e0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6811i0 f13150a;

        C6803e0(Ceiling6Service ceiling6Service, C6811i0 i0Var) {
            this.f13150a = i0Var;
        }

        public void onFailed(int i, String str) {
            this.f13150a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("DelayOff");
            if (property.isValueValid()) {
                this.f13150a.mo32883a((Long) propertyInfo.getValue("DelayOff"));
                return;
            }
            C6811i0 i0Var = this.f13150a;
            i0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling6Service$f */
    class C6804f implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6819m0 f13151a;

        C6804f(Ceiling6Service ceiling6Service, C6819m0 m0Var) {
            this.f13151a = m0Var;
        }

        public void onFailed(int i, String str) {
            this.f13151a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("MiBandSleep");
            if (property.isValueValid()) {
                this.f13151a.mo32891a((Long) propertyInfo.getValue("MiBandSleep"));
                return;
            }
            C6819m0 m0Var = this.f13151a;
            m0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling6Service$f0 */
    class C6805f0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6813j0 f13152a;

        C6805f0(Ceiling6Service ceiling6Service, C6813j0 j0Var) {
            this.f13152a = j0Var;
        }

        public void onFailed(int i, String str) {
            this.f13152a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("FlowParams");
            if (property.isValueValid()) {
                this.f13152a.onSucceed((String) propertyInfo.getValue("FlowParams"));
                return;
            }
            C6813j0 j0Var = this.f13152a;
            j0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling6Service$g */
    class C6806g implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6815k0 f13153a;

        C6806g(Ceiling6Service ceiling6Service, C6815k0 k0Var) {
            this.f13153a = k0Var;
        }

        public void onFailed(int i, String str) {
            this.f13153a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Flowing");
            if (property.isValueValid()) {
                this.f13153a.mo32887a((Long) propertyInfo.getValue("Flowing"));
                return;
            }
            C6815k0 k0Var = this.f13153a;
            k0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling6Service$g0 */
    public interface C6807g0 {
        /* renamed from: a */
        void mo32879a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling6Service$h */
    class C6808h implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6831s0 f13154a;

        C6808h(Ceiling6Service ceiling6Service, C6831s0 s0Var) {
            this.f13154a = s0Var;
        }

        public void onFailed(int i, String str) {
            this.f13154a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("SmartSwitch");
            if (property.isValueValid()) {
                this.f13154a.mo32903a((Long) propertyInfo.getValue("SmartSwitch"));
                return;
            }
            C6831s0 s0Var = this.f13154a;
            s0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling6Service$h0 */
    public interface C6809h0 {
        /* renamed from: a */
        void mo32881a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling6Service$i */
    class C6810i implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13155a;

        C6810i(Ceiling6Service ceiling6Service, CompletionHandler completionHandler) {
            this.f13155a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13155a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13155a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling6Service$i0 */
    public interface C6811i0 {
        /* renamed from: a */
        void mo32883a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling6Service$j */
    class C6812j implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13156a;

        C6812j(Ceiling6Service ceiling6Service, CompletionHandler completionHandler) {
            this.f13156a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13156a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13156a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling6Service$j0 */
    public interface C6813j0 {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling6Service$k */
    class C6814k implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13157a;

        C6814k(Ceiling6Service ceiling6Service, CompletionHandler completionHandler) {
            this.f13157a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13157a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f13157a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling6Service$k0 */
    public interface C6815k0 {
        /* renamed from: a */
        void mo32887a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling6Service$l */
    class C6816l implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13158a;

        C6816l(Ceiling6Service ceiling6Service, CompletionHandler completionHandler) {
            this.f13158a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13158a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13158a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling6Service$l0 */
    public interface C6817l0 {
        /* renamed from: a */
        void mo32889a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling6Service$m */
    class C6818m implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13159a;

        C6818m(Ceiling6Service ceiling6Service, CompletionHandler completionHandler) {
            this.f13159a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13159a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13159a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling6Service$m0 */
    public interface C6819m0 {
        /* renamed from: a */
        void mo32891a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling6Service$n */
    class C6820n implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13160a;

        C6820n(Ceiling6Service ceiling6Service, CompletionHandler completionHandler) {
            this.f13160a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13160a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13160a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling6Service$n0 */
    public interface C6821n0 {
        /* renamed from: a */
        void mo32893a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling6Service$o */
    class C6822o implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13161a;

        C6822o(Ceiling6Service ceiling6Service, CompletionHandler completionHandler) {
            this.f13161a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13161a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13161a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling6Service$o0 */
    public interface C6823o0 {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling6Service$p */
    class C6824p implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13162a;

        C6824p(Ceiling6Service ceiling6Service, CompletionHandler completionHandler) {
            this.f13162a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13162a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13162a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling6Service$p0 */
    public interface C6825p0 {
        /* renamed from: a */
        void mo32897a(Power power);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling6Service$q */
    class C6826q implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13163a;

        C6826q(Ceiling6Service ceiling6Service, CompletionHandler completionHandler) {
            this.f13163a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13163a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13163a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling6Service$q0 */
    public interface C6827q0 {
        /* renamed from: a */
        void mo32899a(Power power, Long l, Long l2, Long l3, String str, Long l4, Long l5, Long l6, Long l7, String str2, Long l8, Long l9, Long l10);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling6Service$r */
    class C6828r implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13164a;

        C6828r(Ceiling6Service ceiling6Service, CompletionHandler completionHandler) {
            this.f13164a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13164a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13164a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling6Service$r0 */
    public interface C6829r0 {
        /* renamed from: a */
        void mo32901a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling6Service$s */
    class C6830s implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13165a;

        C6830s(Ceiling6Service ceiling6Service, CompletionHandler completionHandler) {
            this.f13165a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13165a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13165a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling6Service$s0 */
    public interface C6831s0 {
        /* renamed from: a */
        void mo32903a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling6Service$t */
    class C6832t implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13166a;

        C6832t(Ceiling6Service ceiling6Service, CompletionHandler completionHandler) {
            this.f13166a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13166a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13166a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling6Service$t0 */
    public interface C6833t0 {
        /* renamed from: a */
        void mo32905a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling6Service$u */
    class C6834u implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13167a;

        C6834u(Ceiling6Service ceiling6Service, CompletionHandler completionHandler) {
            this.f13167a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13167a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13167a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling6Service$u0 */
    public interface C6835u0 {
        /* renamed from: a */
        void mo32907a(Long l);

        /* renamed from: b */
        void mo32908b(Long l);

        /* renamed from: c */
        void mo32909c(Long l);

        /* renamed from: d */
        void mo32910d(Long l);

        /* renamed from: e */
        void mo32911e(String str);

        /* renamed from: f */
        void mo32912f(Long l);

        /* renamed from: g */
        void mo32913g(Long l);

        /* renamed from: h */
        void mo32914h(Long l);

        /* renamed from: i */
        void mo32915i(String str);

        /* renamed from: j */
        void mo32916j(Power power);

        /* renamed from: k */
        void mo32917k(Long l);

        /* renamed from: m */
        void mo32918m(Long l);

        /* renamed from: o */
        void mo32919o(Long l);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling6Service$v */
    class C6836v implements DeviceManipulator.PropertyChangedListener {

        /* renamed from: a */
        final /* synthetic */ C6835u0 f13168a;

        C6836v(Ceiling6Service ceiling6Service, C6835u0 u0Var) {
            this.f13168a = u0Var;
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
                case 35911772:
                    if (str2.equals("onFromPower")) {
                        c = 6;
                        break;
                    }
                    break;
                case 77306085:
                    if (str2.equals("Power")) {
                        c = 7;
                        break;
                    }
                    break;
                case 880790796:
                    if (str2.equals("DelayOff")) {
                        c = 8;
                        break;
                    }
                    break;
                case 898856916:
                    if (str2.equals("Flowing")) {
                        c = 9;
                        break;
                    }
                    break;
                case 1179821629:
                    if (str2.equals("SmartSwitch")) {
                        c = 10;
                        break;
                    }
                    break;
                case 1611821756:
                    if (str2.equals("LanMode")) {
                        c = 11;
                        break;
                    }
                    break;
                case 1998035738:
                    if (str2.equals("Bright")) {
                        c = 12;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    if (propertyInfo2.getProperty("SaveState").isValueValid()) {
                        this.f13168a.mo32909c((Long) propertyInfo2.getValue("SaveState"));
                        return;
                    }
                    return;
                case 1:
                    if (propertyInfo2.getProperty("FlowParams").isValueValid()) {
                        this.f13168a.mo32911e((String) propertyInfo2.getValue("FlowParams"));
                        return;
                    }
                    return;
                case 2:
                    if (propertyInfo2.getProperty("NightTimeInfo").isValueValid()) {
                        this.f13168a.mo32915i((String) propertyInfo2.getValue("NightTimeInfo"));
                        return;
                    }
                    return;
                case 3:
                    if (propertyInfo2.getProperty("NLBright").isValueValid()) {
                        this.f13168a.mo32917k((Long) propertyInfo2.getValue("NLBright"));
                        return;
                    }
                    return;
                case 4:
                    if (propertyInfo2.getProperty("MiBandSleep").isValueValid()) {
                        this.f13168a.mo32918m((Long) propertyInfo2.getValue("MiBandSleep"));
                        return;
                    }
                    return;
                case 5:
                    if (propertyInfo2.getProperty("Ct").isValueValid()) {
                        this.f13168a.mo32914h((Long) propertyInfo2.getValue("Ct"));
                        return;
                    }
                    return;
                case 6:
                    if (propertyInfo2.getProperty("onFromPower").isValueValid()) {
                        this.f13168a.mo32912f((Long) propertyInfo2.getValue("onFromPower"));
                        return;
                    }
                    return;
                case 7:
                    if (propertyInfo2.getProperty("Power").isValueValid()) {
                        this.f13168a.mo32916j(Power.valueOf((String) propertyInfo2.getValue("Power")));
                        return;
                    }
                    return;
                case 8:
                    if (propertyInfo2.getProperty("DelayOff").isValueValid()) {
                        this.f13168a.mo32908b((Long) propertyInfo2.getValue("DelayOff"));
                        return;
                    }
                    return;
                case 9:
                    if (propertyInfo2.getProperty("Flowing").isValueValid()) {
                        this.f13168a.mo32910d((Long) propertyInfo2.getValue("Flowing"));
                        return;
                    }
                    return;
                case 10:
                    if (propertyInfo2.getProperty("SmartSwitch").isValueValid()) {
                        this.f13168a.mo32919o((Long) propertyInfo2.getValue("SmartSwitch"));
                        return;
                    }
                    return;
                case 11:
                    if (propertyInfo2.getProperty("LanMode").isValueValid()) {
                        this.f13168a.mo32913g((Long) propertyInfo2.getValue("LanMode"));
                        return;
                    }
                    return;
                case 12:
                    if (propertyInfo2.getProperty("Bright").isValueValid()) {
                        this.f13168a.mo32907a((Long) propertyInfo2.getValue("Bright"));
                        return;
                    }
                    break;
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling6Service$w */
    class C6837w implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13169a;

        C6837w(Ceiling6Service ceiling6Service, CompletionHandler completionHandler) {
            this.f13169a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13169a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13169a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling6Service$x */
    class C6838x implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13170a;

        C6838x(Ceiling6Service ceiling6Service, CompletionHandler completionHandler) {
            this.f13170a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13170a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13170a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling6Service$y */
    class C6839y implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13171a;

        C6839y(Ceiling6Service ceiling6Service, CompletionHandler completionHandler) {
            this.f13171a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13171a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13171a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling6Service$z */
    class C6840z implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13172a;

        C6840z(Ceiling6Service ceiling6Service, CompletionHandler completionHandler) {
            this.f13172a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13172a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f13172a.onSucceed();
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
                MiotManager.getDeviceManipulator().invoke(create, new C6826q(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6812j(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getBright(C6807g0 g0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Bright"), new C6799c0(this, g0Var));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6839y(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getCt(C6809h0 h0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Ct"), new C6801d0(this, h0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getDelayOff(C6811i0 i0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "DelayOff"), new C6803e0(this, i0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowParams(C6813j0 j0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "FlowParams"), new C6805f0(this, j0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowing(C6815k0 k0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Flowing"), new C6806g(this, k0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getLanMode(C6817l0 l0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "LanMode"), new C6794a(this, l0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getMiBandSleep(C6819m0 m0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "MiBandSleep"), new C6804f(this, m0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getNLBright(C6821n0 n0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "NLBright"), new C6800d(this, n0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getNightTimeInfo(C6823o0 o0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "NightTimeInfo"), new C6802e(this, o0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getPower(C6825p0 p0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Power"), new C6797b0(this, p0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getProperties(C6827q0 q0Var) {
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
            MiotManager.getDeviceManipulator().readProperty(create, new C6795a0(this, q0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getSaveState(C6829r0 r0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "SaveState"), new C6796b(this, r0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getSmartSwitch(C6831s0 s0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "SmartSwitch"), new C6808h(this, s0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getonFromPower(C6833t0 t0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "onFromPower"), new C6798c(this, t0Var));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6820n(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6816l(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6832t(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6810i(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6838x(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6828r(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6837w(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6830s(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6822o(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6818m(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6834u(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void subscribeNotifications(CompletionHandler completionHandler, C6835u0 u0Var) {
        if (completionHandler == null) {
            throw new IllegalArgumentException("handler is null");
        } else if (u0Var != null) {
            PropertyInfo create = PropertyInfoFactory.create(getService());
            for (Property next : getService().getProperties()) {
                if (next.getDefinition().isNotifiable()) {
                    create.addProperty(next);
                }
            }
            MiotManager.getDeviceManipulator().addPropertyChangedListener(create, new C6814k(this, completionHandler), new C6836v(this, u0Var));
        } else {
            throw new IllegalArgumentException("listener is null");
        }
    }

    public void toggle(CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "toggle");
            if (create != null) {
                MiotManager.getDeviceManipulator().invoke(create, new C6824p(this, completionHandler));
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
            MiotManager.getDeviceManipulator().removePropertyChangedListener(create, new C6840z(this, completionHandler));
            return;
        }
        throw new IllegalArgumentException("handler is null");
    }
}
