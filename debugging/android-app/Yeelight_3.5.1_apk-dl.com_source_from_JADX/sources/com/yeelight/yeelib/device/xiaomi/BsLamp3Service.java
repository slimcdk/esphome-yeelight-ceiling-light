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

public class BsLamp3Service extends AbstractService {
    public static final String ACTION_addCron = "addCron";
    public static final String ACTION_delCron = "delCron";
    public static final String ACTION_disableMusic = "disableMusic";
    public static final String ACTION_enableMusic = "enableMusic";
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
    public static final String ACTION_setRgb = "setRgb";
    public static final String ACTION_setScene = "setScene";
    public static final String ACTION_setadjust = "setadjust";
    public static final String ACTION_start_cf = "start_cf";
    public static final String ACTION_toggle = "toggle";
    public static final String PROPERTY_Bright = "Bright";
    public static final String PROPERTY_CmdKey = "CmdKey";
    public static final String PROPERTY_CmdValue = "CmdValue";
    public static final String PROPERTY_ColorMode = "ColorMode";
    public static final String PROPERTY_CronType = "CronType";
    public static final String PROPERTY_Ct = "Ct";
    public static final String PROPERTY_DelayOff = "DelayOff";
    public static final String PROPERTY_Duration = "Duration";
    public static final String PROPERTY_Effect = "Effect";
    public static final String PROPERTY_FlowParams = "FlowParams";
    public static final String PROPERTY_Flowing = "Flowing";
    public static final String PROPERTY_Hue = "Hue";
    public static final String PROPERTY_KnockEnable = "KnockEnable";
    public static final String PROPERTY_LanMode = "LanMode";
    public static final String PROPERTY_Mode = "Mode";
    public static final String PROPERTY_MusicEnable = "MusicEnable";
    public static final String PROPERTY_MusicIPAddress = "MusicIPAddress";
    public static final String PROPERTY_MusicPort = "MusicPort";
    public static final String PROPERTY_NightTimeInfo = "NightTimeInfo";
    public static final String PROPERTY_ParamColors = "ParamColors";
    public static final String PROPERTY_ParamCount = "ParamCount";
    public static final String PROPERTY_ParamFinish = "ParamFinish";
    public static final String PROPERTY_ParamModel = "ParamModel";
    public static final String PROPERTY_Power = "Power";
    public static final String PROPERTY_Rgb = "Rgb";
    public static final String PROPERTY_Sat = "Sat";
    public static final String PROPERTY_SaveState = "SaveState";
    public static final String PROPERTY_adjustAction = "adjustAction";
    public static final String PROPERTY_adjustProper = "adjustProper";
    private static final String TAG = "BsLamp3Service";
    private AbstractDevice mDevice = null;

    public enum CmdKey {
        undefined,
        cfg_pomodoro,
        cfg_lan_ctrl,
        nighttime,
        pseudo_beacon,
        cfg_init_power,
        cfg_save_state,
        knock_enable
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

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp3Service$a */
    class C6287a implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6325r0 f12778a;

        C6287a(BsLamp3Service bsLamp3Service, C6325r0 r0Var) {
            this.f12778a = r0Var;
        }

        public void onFailed(int i, String str) {
            this.f12778a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Flowing");
            if (property.isValueValid()) {
                this.f12778a.mo32134a((Long) propertyInfo.getValue("Flowing"));
                return;
            }
            C6325r0 r0Var = this.f12778a;
            r0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp3Service$a0 */
    class C6288a0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12779a;

        C6288a0(BsLamp3Service bsLamp3Service, CompletionHandler completionHandler) {
            this.f12779a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12779a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12779a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp3Service$a1 */
    public interface C6289a1 {
        /* renamed from: a */
        void mo32105a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp3Service$b */
    class C6290b implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6317n0 f12780a;

        C6290b(BsLamp3Service bsLamp3Service, C6317n0 n0Var) {
            this.f12780a = n0Var;
        }

        public void onFailed(int i, String str) {
            this.f12780a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("ColorMode");
            if (property.isValueValid()) {
                this.f12780a.mo32126a((Long) propertyInfo.getValue("ColorMode"));
                return;
            }
            C6317n0 n0Var = this.f12780a;
            n0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp3Service$b0 */
    class C6291b0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12781a;

        C6291b0(BsLamp3Service bsLamp3Service, CompletionHandler completionHandler) {
            this.f12781a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12781a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12781a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp3Service$b1 */
    public interface C6292b1 {
        /* renamed from: a */
        void mo32107a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp3Service$c */
    class C6293c implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6341z0 f12782a;

        C6293c(BsLamp3Service bsLamp3Service, C6341z0 z0Var) {
            this.f12782a = z0Var;
        }

        public void onFailed(int i, String str) {
            this.f12782a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Rgb");
            if (property.isValueValid()) {
                this.f12782a.mo32150a((Long) propertyInfo.getValue("Rgb"));
                return;
            }
            C6341z0 z0Var = this.f12782a;
            z0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp3Service$c0 */
    class C6294c0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12783a;

        C6294c0(BsLamp3Service bsLamp3Service, CompletionHandler completionHandler) {
            this.f12783a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12783a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12783a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp3Service$c1 */
    public interface C6295c1 {
        /* renamed from: a */
        void mo32109a(Long l);

        /* renamed from: b */
        void mo32110b(Long l);

        /* renamed from: c */
        void mo32111c(Long l);

        /* renamed from: d */
        void mo32112d(Long l);

        /* renamed from: e */
        void mo32113e(String str);

        /* renamed from: g */
        void mo32114g(Long l);

        /* renamed from: h */
        void mo32115h(Long l);

        /* renamed from: i */
        void mo32116i(String str);

        /* renamed from: j */
        void mo32117j(Long l);

        /* renamed from: k */
        void mo32118k(Long l);

        /* renamed from: l */
        void mo32119l(Long l);

        /* renamed from: m */
        void mo32120m(Long l);

        /* renamed from: n */
        void mo32121n(Long l);

        /* renamed from: o */
        void mo32122o(Long l);

        /* renamed from: p */
        void mo32123p(Power power);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp3Service$d */
    class C6296d implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6321p0 f12784a;

        C6296d(BsLamp3Service bsLamp3Service, C6321p0 p0Var) {
            this.f12784a = p0Var;
        }

        public void onFailed(int i, String str) {
            this.f12784a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("DelayOff");
            if (property.isValueValid()) {
                this.f12784a.mo32130a((Long) propertyInfo.getValue("DelayOff"));
                return;
            }
            C6321p0 p0Var = this.f12784a;
            p0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp3Service$d0 */
    class C6297d0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12785a;

        C6297d0(BsLamp3Service bsLamp3Service, CompletionHandler completionHandler) {
            this.f12785a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12785a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12785a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp3Service$e */
    class C6298e implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6323q0 f12786a;

        C6298e(BsLamp3Service bsLamp3Service, C6323q0 q0Var) {
            this.f12786a = q0Var;
        }

        public void onFailed(int i, String str) {
            this.f12786a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("FlowParams");
            if (property.isValueValid()) {
                this.f12786a.onSucceed((String) propertyInfo.getValue("FlowParams"));
                return;
            }
            C6323q0 q0Var = this.f12786a;
            q0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp3Service$e0 */
    class C6299e0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12787a;

        C6299e0(BsLamp3Service bsLamp3Service, CompletionHandler completionHandler) {
            this.f12787a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12787a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12787a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp3Service$f */
    class C6300f implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6331u0 f12788a;

        C6300f(BsLamp3Service bsLamp3Service, C6331u0 u0Var) {
            this.f12788a = u0Var;
        }

        public void onFailed(int i, String str) {
            this.f12788a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("LanMode");
            if (property.isValueValid()) {
                this.f12788a.mo32140a((Long) propertyInfo.getValue("LanMode"));
                return;
            }
            C6331u0 u0Var = this.f12788a;
            u0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp3Service$f0 */
    class C6301f0 implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12789a;

        C6301f0(BsLamp3Service bsLamp3Service, CompletionHandler completionHandler) {
            this.f12789a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12789a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f12789a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp3Service$g */
    class C6302g implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6292b1 f12790a;

        C6302g(BsLamp3Service bsLamp3Service, C6292b1 b1Var) {
            this.f12790a = b1Var;
        }

        public void onFailed(int i, String str) {
            this.f12790a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("SaveState");
            if (property.isValueValid()) {
                this.f12790a.mo32107a((Long) propertyInfo.getValue("SaveState"));
                return;
            }
            C6292b1 b1Var = this.f12790a;
            b1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp3Service$g0 */
    class C6303g0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6339y0 f12791a;

        C6303g0(BsLamp3Service bsLamp3Service, C6339y0 y0Var) {
            this.f12791a = y0Var;
        }

        public void onFailed(int i, String str) {
            this.f12791a.onFailed(i, str);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.Long} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onSucceed(com.miot.common.device.invocation.PropertyInfo r21) {
            /*
                r20 = this;
                r0 = r21
                java.lang.String r1 = "Power"
                com.miot.common.property.Property r1 = r0.getProperty(r1)
                boolean r2 = r1.isValueValid()
                r3 = 0
                if (r2 == 0) goto L_0x001b
                java.lang.Object r1 = r1.getValue()
                java.lang.String r1 = (java.lang.String) r1
                com.yeelight.yeelib.device.xiaomi.BsLamp3Service$Power r1 = com.yeelight.yeelib.device.xiaomi.BsLamp3Service.Power.valueOf(r1)
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
                java.lang.String r1 = "Hue"
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
                java.lang.String r1 = "Sat"
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
                java.lang.String r1 = "Flowing"
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
                java.lang.String r1 = "ColorMode"
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
                java.lang.String r1 = "Rgb"
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
                java.lang.String r1 = "DelayOff"
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
                java.lang.String r1 = "FlowParams"
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
                java.lang.String r1 = "LanMode"
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
                java.lang.String r1 = "SaveState"
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
                java.lang.String r1 = "MusicEnable"
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
                java.lang.String r1 = "NightTimeInfo"
                com.miot.common.property.Property r1 = r0.getProperty(r1)
                boolean r2 = r1.isValueValid()
                if (r2 == 0) goto L_0x0131
                java.lang.Object r1 = r1.getValue()
                java.lang.String r1 = (java.lang.String) r1
                r18 = r1
                goto L_0x0133
            L_0x0131:
                r18 = r3
            L_0x0133:
                java.lang.String r1 = "KnockEnable"
                com.miot.common.property.Property r0 = r0.getProperty(r1)
                boolean r1 = r0.isValueValid()
                if (r1 == 0) goto L_0x0146
                java.lang.Object r0 = r0.getValue()
                r3 = r0
                java.lang.Long r3 = (java.lang.Long) r3
            L_0x0146:
                r0 = r20
                r19 = r3
                com.yeelight.yeelib.device.xiaomi.BsLamp3Service$y0 r4 = r0.f12791a
                r4.mo32148a(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.xiaomi.BsLamp3Service.C6303g0.onSucceed(com.miot.common.device.invocation.PropertyInfo):void");
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp3Service$h */
    class C6304h implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6333v0 f12792a;

        C6304h(BsLamp3Service bsLamp3Service, C6333v0 v0Var) {
            this.f12792a = v0Var;
        }

        public void onFailed(int i, String str) {
            this.f12792a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("MusicEnable");
            if (property.isValueValid()) {
                this.f12792a.mo32142a((Long) propertyInfo.getValue("MusicEnable"));
                return;
            }
            C6333v0 v0Var = this.f12792a;
            v0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp3Service$h0 */
    class C6305h0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6337x0 f12793a;

        C6305h0(BsLamp3Service bsLamp3Service, C6337x0 x0Var) {
            this.f12793a = x0Var;
        }

        public void onFailed(int i, String str) {
            this.f12793a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Power");
            if (property.isValueValid()) {
                this.f12793a.mo32146a(Power.valueOf((String) propertyInfo.getValue("Power")));
                return;
            }
            C6337x0 x0Var = this.f12793a;
            x0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp3Service$i */
    class C6306i implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6335w0 f12794a;

        C6306i(BsLamp3Service bsLamp3Service, C6335w0 w0Var) {
            this.f12794a = w0Var;
        }

        public void onFailed(int i, String str) {
            this.f12794a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("NightTimeInfo");
            if (property.isValueValid()) {
                this.f12794a.onSucceed((String) propertyInfo.getValue("NightTimeInfo"));
                return;
            }
            C6335w0 w0Var = this.f12794a;
            w0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp3Service$i0 */
    class C6307i0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6315m0 f12795a;

        C6307i0(BsLamp3Service bsLamp3Service, C6315m0 m0Var) {
            this.f12795a = m0Var;
        }

        public void onFailed(int i, String str) {
            this.f12795a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Bright");
            if (property.isValueValid()) {
                this.f12795a.mo32124a((Long) propertyInfo.getValue("Bright"));
                return;
            }
            C6315m0 m0Var = this.f12795a;
            m0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp3Service$j */
    class C6308j implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6329t0 f12796a;

        C6308j(BsLamp3Service bsLamp3Service, C6329t0 t0Var) {
            this.f12796a = t0Var;
        }

        public void onFailed(int i, String str) {
            this.f12796a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty(BsLamp3Service.PROPERTY_KnockEnable);
            if (property.isValueValid()) {
                this.f12796a.mo32138a((Long) propertyInfo.getValue(BsLamp3Service.PROPERTY_KnockEnable));
                return;
            }
            C6329t0 t0Var = this.f12796a;
            t0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp3Service$j0 */
    class C6309j0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6319o0 f12797a;

        C6309j0(BsLamp3Service bsLamp3Service, C6319o0 o0Var) {
            this.f12797a = o0Var;
        }

        public void onFailed(int i, String str) {
            this.f12797a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Ct");
            if (property.isValueValid()) {
                this.f12797a.mo32128a((Long) propertyInfo.getValue("Ct"));
                return;
            }
            C6319o0 o0Var = this.f12797a;
            o0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp3Service$k */
    class C6310k implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12798a;

        C6310k(BsLamp3Service bsLamp3Service, CompletionHandler completionHandler) {
            this.f12798a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12798a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f12798a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp3Service$k0 */
    class C6311k0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6327s0 f12799a;

        C6311k0(BsLamp3Service bsLamp3Service, C6327s0 s0Var) {
            this.f12799a = s0Var;
        }

        public void onFailed(int i, String str) {
            this.f12799a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Hue");
            if (property.isValueValid()) {
                this.f12799a.mo32136a((Long) propertyInfo.getValue("Hue"));
                return;
            }
            C6327s0 s0Var = this.f12799a;
            s0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp3Service$l */
    class C6312l implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12800a;

        C6312l(BsLamp3Service bsLamp3Service, CompletionHandler completionHandler) {
            this.f12800a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12800a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12800a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp3Service$l0 */
    class C6313l0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6289a1 f12801a;

        C6313l0(BsLamp3Service bsLamp3Service, C6289a1 a1Var) {
            this.f12801a = a1Var;
        }

        public void onFailed(int i, String str) {
            this.f12801a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Sat");
            if (property.isValueValid()) {
                this.f12801a.mo32105a((Long) propertyInfo.getValue("Sat"));
                return;
            }
            C6289a1 a1Var = this.f12801a;
            a1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp3Service$m */
    class C6314m implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12802a;

        C6314m(BsLamp3Service bsLamp3Service, CompletionHandler completionHandler) {
            this.f12802a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12802a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12802a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp3Service$m0 */
    public interface C6315m0 {
        /* renamed from: a */
        void mo32124a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp3Service$n */
    class C6316n implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12803a;

        C6316n(BsLamp3Service bsLamp3Service, CompletionHandler completionHandler) {
            this.f12803a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12803a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12803a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp3Service$n0 */
    public interface C6317n0 {
        /* renamed from: a */
        void mo32126a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp3Service$o */
    class C6318o implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12804a;

        C6318o(BsLamp3Service bsLamp3Service, CompletionHandler completionHandler) {
            this.f12804a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12804a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12804a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp3Service$o0 */
    public interface C6319o0 {
        /* renamed from: a */
        void mo32128a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp3Service$p */
    class C6320p implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12805a;

        C6320p(BsLamp3Service bsLamp3Service, CompletionHandler completionHandler) {
            this.f12805a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12805a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12805a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp3Service$p0 */
    public interface C6321p0 {
        /* renamed from: a */
        void mo32130a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp3Service$q */
    class C6322q implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12806a;

        C6322q(BsLamp3Service bsLamp3Service, CompletionHandler completionHandler) {
            this.f12806a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12806a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12806a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp3Service$q0 */
    public interface C6323q0 {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp3Service$r */
    class C6324r implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12807a;

        C6324r(BsLamp3Service bsLamp3Service, CompletionHandler completionHandler) {
            this.f12807a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12807a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12807a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp3Service$r0 */
    public interface C6325r0 {
        /* renamed from: a */
        void mo32134a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp3Service$s */
    class C6326s implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12808a;

        C6326s(BsLamp3Service bsLamp3Service, CompletionHandler completionHandler) {
            this.f12808a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12808a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12808a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp3Service$s0 */
    public interface C6327s0 {
        /* renamed from: a */
        void mo32136a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp3Service$t */
    class C6328t implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12809a;

        C6328t(BsLamp3Service bsLamp3Service, CompletionHandler completionHandler) {
            this.f12809a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12809a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12809a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp3Service$t0 */
    public interface C6329t0 {
        /* renamed from: a */
        void mo32138a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp3Service$u */
    class C6330u implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12810a;

        C6330u(BsLamp3Service bsLamp3Service, CompletionHandler completionHandler) {
            this.f12810a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12810a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12810a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp3Service$u0 */
    public interface C6331u0 {
        /* renamed from: a */
        void mo32140a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp3Service$v */
    class C6332v implements DeviceManipulator.PropertyChangedListener {

        /* renamed from: a */
        final /* synthetic */ C6295c1 f12811a;

        C6332v(BsLamp3Service bsLamp3Service, C6295c1 c1Var) {
            this.f12811a = c1Var;
        }

        public void onPropertyChanged(PropertyInfo propertyInfo, String str) {
            String str2;
            PropertyInfo propertyInfo2 = propertyInfo;
            String str3 = str;
            str.hashCode();
            String str4 = "FlowParams";
            char c = 65535;
            switch (str.hashCode()) {
                case -2117953292:
                    str2 = str4;
                    if (str3.equals("SaveState")) {
                        c = 0;
                        break;
                    }
                    break;
                case -2002016140:
                    str2 = str4;
                    if (str3.equals(str2)) {
                        c = 1;
                        break;
                    }
                    break;
                case -1787381784:
                    if (str3.equals("MusicEnable")) {
                        c = 2;
                        break;
                    }
                    break;
                case -1534833833:
                    if (str3.equals(BsLamp3Service.PROPERTY_KnockEnable)) {
                        c = 3;
                        break;
                    }
                    break;
                case -1331143373:
                    if (str3.equals("NightTimeInfo")) {
                        c = 4;
                        break;
                    }
                    break;
                case -310275194:
                    if (str3.equals("ColorMode")) {
                        c = 5;
                        break;
                    }
                    break;
                case 2193:
                    if (str3.equals("Ct")) {
                        c = 6;
                        break;
                    }
                    break;
                case 72920:
                    if (str3.equals("Hue")) {
                        c = 7;
                        break;
                    }
                    break;
                case 82093:
                    if (str3.equals("Rgb")) {
                        c = 8;
                        break;
                    }
                    break;
                case 82886:
                    if (str3.equals("Sat")) {
                        c = 9;
                        break;
                    }
                    break;
                case 77306085:
                    if (str3.equals("Power")) {
                        c = 10;
                        break;
                    }
                    break;
                case 880790796:
                    if (str3.equals("DelayOff")) {
                        c = 11;
                        break;
                    }
                    break;
                case 898856916:
                    if (str3.equals("Flowing")) {
                        c = 12;
                        break;
                    }
                    break;
                case 1611821756:
                    if (str3.equals("LanMode")) {
                        c = 13;
                        break;
                    }
                    break;
                case 1998035738:
                    if (str3.equals("Bright")) {
                        c = 14;
                        break;
                    }
                    break;
            }
            str2 = str4;
            switch (c) {
                case 0:
                    PropertyInfo propertyInfo3 = propertyInfo;
                    if (propertyInfo3.getProperty("SaveState").isValueValid()) {
                        this.f12811a.mo32111c((Long) propertyInfo3.getValue("SaveState"));
                        return;
                    }
                    return;
                case 1:
                    PropertyInfo propertyInfo4 = propertyInfo;
                    String str5 = str2;
                    if (propertyInfo4.getProperty(str5).isValueValid()) {
                        this.f12811a.mo32113e((String) propertyInfo4.getValue(str5));
                        return;
                    }
                    return;
                case 2:
                    String str6 = "MusicEnable";
                    PropertyInfo propertyInfo5 = propertyInfo;
                    if (propertyInfo5.getProperty(str6).isValueValid()) {
                        this.f12811a.mo32120m((Long) propertyInfo5.getValue(str6));
                        return;
                    }
                    return;
                case 3:
                    PropertyInfo propertyInfo6 = propertyInfo;
                    if (propertyInfo6.getProperty(BsLamp3Service.PROPERTY_KnockEnable).isValueValid()) {
                        this.f12811a.mo32122o((Long) propertyInfo6.getValue(BsLamp3Service.PROPERTY_KnockEnable));
                        return;
                    }
                    return;
                case 4:
                    PropertyInfo propertyInfo7 = propertyInfo;
                    if (propertyInfo7.getProperty("NightTimeInfo").isValueValid()) {
                        this.f12811a.mo32116i((String) propertyInfo7.getValue("NightTimeInfo"));
                        return;
                    }
                    return;
                case 5:
                    PropertyInfo propertyInfo8 = propertyInfo;
                    if (propertyInfo8.getProperty("ColorMode").isValueValid()) {
                        this.f12811a.mo32119l((Long) propertyInfo8.getValue("ColorMode"));
                        return;
                    }
                    return;
                case 6:
                    PropertyInfo propertyInfo9 = propertyInfo;
                    if (propertyInfo9.getProperty("Ct").isValueValid()) {
                        this.f12811a.mo32115h((Long) propertyInfo9.getValue("Ct"));
                        return;
                    }
                    return;
                case 7:
                    PropertyInfo propertyInfo10 = propertyInfo;
                    if (propertyInfo10.getProperty("Hue").isValueValid()) {
                        this.f12811a.mo32121n((Long) propertyInfo10.getValue("Hue"));
                        return;
                    }
                    return;
                case 8:
                    PropertyInfo propertyInfo11 = propertyInfo;
                    if (propertyInfo11.getProperty("Rgb").isValueValid()) {
                        this.f12811a.mo32117j((Long) propertyInfo11.getValue("Rgb"));
                        return;
                    }
                    return;
                case 9:
                    PropertyInfo propertyInfo12 = propertyInfo;
                    if (propertyInfo12.getProperty("Sat").isValueValid()) {
                        this.f12811a.mo32118k((Long) propertyInfo12.getValue("Sat"));
                        return;
                    }
                    return;
                case 10:
                    PropertyInfo propertyInfo13 = propertyInfo;
                    if (propertyInfo13.getProperty("Power").isValueValid()) {
                        this.f12811a.mo32123p(Power.valueOf((String) propertyInfo13.getValue("Power")));
                        return;
                    }
                    return;
                case 11:
                    PropertyInfo propertyInfo14 = propertyInfo;
                    if (propertyInfo14.getProperty("DelayOff").isValueValid()) {
                        this.f12811a.mo32110b((Long) propertyInfo14.getValue("DelayOff"));
                        return;
                    }
                    return;
                case 12:
                    PropertyInfo propertyInfo15 = propertyInfo;
                    if (propertyInfo15.getProperty("Flowing").isValueValid()) {
                        this.f12811a.mo32112d((Long) propertyInfo15.getValue("Flowing"));
                        return;
                    }
                    return;
                case 13:
                    PropertyInfo propertyInfo16 = propertyInfo;
                    if (propertyInfo16.getProperty("LanMode").isValueValid()) {
                        this.f12811a.mo32114g((Long) propertyInfo16.getValue("LanMode"));
                        return;
                    }
                    return;
                case 14:
                    PropertyInfo propertyInfo17 = propertyInfo;
                    if (propertyInfo17.getProperty("Bright").isValueValid()) {
                        this.f12811a.mo32109a((Long) propertyInfo17.getValue("Bright"));
                        return;
                    }
                    break;
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp3Service$v0 */
    public interface C6333v0 {
        /* renamed from: a */
        void mo32142a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp3Service$w */
    class C6334w implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12812a;

        C6334w(BsLamp3Service bsLamp3Service, CompletionHandler completionHandler) {
            this.f12812a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12812a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12812a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp3Service$w0 */
    public interface C6335w0 {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp3Service$x */
    class C6336x implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12813a;

        C6336x(BsLamp3Service bsLamp3Service, CompletionHandler completionHandler) {
            this.f12813a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12813a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12813a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp3Service$x0 */
    public interface C6337x0 {
        /* renamed from: a */
        void mo32146a(Power power);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp3Service$y */
    class C6338y implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12814a;

        C6338y(BsLamp3Service bsLamp3Service, CompletionHandler completionHandler) {
            this.f12814a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12814a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12814a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp3Service$y0 */
    public interface C6339y0 {
        /* renamed from: a */
        void mo32148a(Power power, Long l, Long l2, Long l3, Long l4, Long l5, Long l6, Long l7, Long l8, String str, Long l9, Long l10, Long l11, String str2, Long l12);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp3Service$z */
    class C6340z implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12815a;

        C6340z(BsLamp3Service bsLamp3Service, CompletionHandler completionHandler) {
            this.f12815a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12815a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12815a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp3Service$z0 */
    public interface C6341z0 {
        /* renamed from: a */
        void mo32150a(Long l);

        void onFailed(int i, String str);
    }

    public BsLamp3Service(AbstractDevice abstractDevice) {
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
                MiotManager.getDeviceManipulator().invoke(create, new C6330u(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6316n(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void disableMusic(Long l, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "disableMusic");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (create.setArgumentValue("MusicEnable", l)) {
                MiotManager.getDeviceManipulator().invoke(create, new C6312l(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void enableMusic(Long l, String str, Long l2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "enableMusic");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("MusicEnable", l)) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("MusicIPAddress", str)) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("MusicPort", l2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C6297d0(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getBright(C6315m0 m0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Bright"), new C6307i0(this, m0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getColorMode(C6317n0 n0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "ColorMode"), new C6290b(this, n0Var));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6294c0(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getCt(C6319o0 o0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Ct"), new C6309j0(this, o0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getDelayOff(C6321p0 p0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "DelayOff"), new C6296d(this, p0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowParams(C6323q0 q0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "FlowParams"), new C6298e(this, q0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowing(C6325r0 r0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Flowing"), new C6287a(this, r0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getHue(C6327s0 s0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Hue"), new C6311k0(this, s0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getKnockEnable(C6329t0 t0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), PROPERTY_KnockEnable), new C6308j(this, t0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getLanMode(C6331u0 u0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "LanMode"), new C6300f(this, u0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getMusicEnable(C6333v0 v0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "MusicEnable"), new C6304h(this, v0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getNightTimeInfo(C6335w0 w0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "NightTimeInfo"), new C6306i(this, w0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getPower(C6337x0 x0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Power"), new C6305h0(this, x0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getProperties(C6339y0 y0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            PropertyInfo create = PropertyInfoFactory.create(getService());
            create.addProperty(getService().getProperty("Power"));
            create.addProperty(getService().getProperty("Bright"));
            create.addProperty(getService().getProperty("Ct"));
            create.addProperty(getService().getProperty("Hue"));
            create.addProperty(getService().getProperty("Sat"));
            create.addProperty(getService().getProperty("Flowing"));
            create.addProperty(getService().getProperty("ColorMode"));
            create.addProperty(getService().getProperty("Rgb"));
            create.addProperty(getService().getProperty("DelayOff"));
            create.addProperty(getService().getProperty("FlowParams"));
            create.addProperty(getService().getProperty("LanMode"));
            create.addProperty(getService().getProperty("SaveState"));
            create.addProperty(getService().getProperty("MusicEnable"));
            create.addProperty(getService().getProperty("NightTimeInfo"));
            create.addProperty(getService().getProperty(PROPERTY_KnockEnable));
            MiotManager.getDeviceManipulator().readProperty(create, new C6303g0(this, y0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getRgb(C6341z0 z0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Rgb"), new C6293c(this, z0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getSat(C6289a1 a1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Sat"), new C6313l0(this, a1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getSaveState(C6292b1 b1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "SaveState"), new C6302g(this, b1Var));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6322q(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6318o(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6338y(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6314m(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6291b0(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6334w(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6288a0(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6336x(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6324r(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setRgb(Long l, Effect effect, Long l2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setRgb");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("Rgb", l)) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Effect", effect.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("Duration", l2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C6326s(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6320p(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6340z(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void start_cf(Long l, Long l2, String str, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "start_cf");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("ParamCount", l)) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("ParamFinish", l2)) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("ParamColors", str)) {
                MiotManager.getDeviceManipulator().invoke(create, new C6299e0(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void subscribeNotifications(CompletionHandler completionHandler, C6295c1 c1Var) {
        if (completionHandler == null) {
            throw new IllegalArgumentException("handler is null");
        } else if (c1Var != null) {
            PropertyInfo create = PropertyInfoFactory.create(getService());
            for (Property next : getService().getProperties()) {
                if (next.getDefinition().isNotifiable()) {
                    create.addProperty(next);
                }
            }
            MiotManager.getDeviceManipulator().addPropertyChangedListener(create, new C6310k(this, completionHandler), new C6332v(this, c1Var));
        } else {
            throw new IllegalArgumentException("listener is null");
        }
    }

    public void toggle(CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "toggle");
            if (create != null) {
                MiotManager.getDeviceManipulator().invoke(create, new C6328t(this, completionHandler));
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
            MiotManager.getDeviceManipulator().removePropertyChangedListener(create, new C6301f0(this, completionHandler));
            return;
        }
        throw new IllegalArgumentException("handler is null");
    }
}
