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

public class BsLamp2Service extends AbstractService {
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
    private static final String TAG = "BsLamp2Service";
    private AbstractDevice mDevice = null;

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp2Service$a */
    class C7701a implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7738r0 f15679a;

        C7701a(BsLamp2Service bsLamp2Service, C7738r0 r0Var) {
            this.f15679a = r0Var;
        }

        public void onFailed(int i, String str) {
            this.f15679a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Flowing");
            if (property.isValueValid()) {
                this.f15679a.mo29186a((Long) propertyInfo.getValue("Flowing"));
                return;
            }
            C7738r0 r0Var = this.f15679a;
            r0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp2Service$a0 */
    class C7702a0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15680a;

        C7702a0(BsLamp2Service bsLamp2Service, CompletionHandler completionHandler) {
            this.f15680a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15680a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f15680a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp2Service$a1 */
    public enum C7703a1 {
        undefined,
        on,
        off
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp2Service$b */
    class C7704b implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7730n0 f15685a;

        C7704b(BsLamp2Service bsLamp2Service, C7730n0 n0Var) {
            this.f15685a = n0Var;
        }

        public void onFailed(int i, String str) {
            this.f15685a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("ColorMode");
            if (property.isValueValid()) {
                this.f15685a.mo29178a((Long) propertyInfo.getValue("ColorMode"));
                return;
            }
            C7730n0 n0Var = this.f15685a;
            n0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp2Service$b0 */
    class C7705b0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15686a;

        C7705b0(BsLamp2Service bsLamp2Service, CompletionHandler completionHandler) {
            this.f15686a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15686a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f15686a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp2Service$b1 */
    public interface C7706b1 {
        /* renamed from: a */
        void mo28140a(Long l);

        /* renamed from: b */
        void mo28141b(Long l);

        /* renamed from: c */
        void mo28142c(Long l);

        /* renamed from: d */
        void mo28143d(Long l);

        /* renamed from: e */
        void mo28144e(String str);

        /* renamed from: h */
        void mo28145h(Long l);

        /* renamed from: i */
        void mo28146i(String str);

        /* renamed from: j */
        void mo28147j(Long l);

        /* renamed from: k */
        void mo28148k(Long l);

        /* renamed from: l */
        void mo28149l(Long l);

        /* renamed from: n */
        void mo28150n(Long l);

        /* renamed from: o */
        void mo28151o(Long l);

        /* renamed from: p */
        void mo28152p(C7703a1 a1Var);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp2Service$c */
    class C7707c implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7750x0 f15687a;

        C7707c(BsLamp2Service bsLamp2Service, C7750x0 x0Var) {
            this.f15687a = x0Var;
        }

        public void onFailed(int i, String str) {
            this.f15687a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Rgb");
            if (property.isValueValid()) {
                this.f15687a.mo29196a((Long) propertyInfo.getValue("Rgb"));
                return;
            }
            C7750x0 x0Var = this.f15687a;
            x0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp2Service$c0 */
    class C7708c0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15688a;

        C7708c0(BsLamp2Service bsLamp2Service, CompletionHandler completionHandler) {
            this.f15688a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15688a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f15688a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp2Service$d */
    class C7709d implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7734p0 f15689a;

        C7709d(BsLamp2Service bsLamp2Service, C7734p0 p0Var) {
            this.f15689a = p0Var;
        }

        public void onFailed(int i, String str) {
            this.f15689a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("DelayOff");
            if (property.isValueValid()) {
                this.f15689a.mo29182a((Long) propertyInfo.getValue("DelayOff"));
                return;
            }
            C7734p0 p0Var = this.f15689a;
            p0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp2Service$d0 */
    class C7710d0 implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15690a;

        C7710d0(BsLamp2Service bsLamp2Service, CompletionHandler completionHandler) {
            this.f15690a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15690a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f15690a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp2Service$e */
    class C7711e implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7736q0 f15691a;

        C7711e(BsLamp2Service bsLamp2Service, C7736q0 q0Var) {
            this.f15691a = q0Var;
        }

        public void onFailed(int i, String str) {
            this.f15691a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("FlowParams");
            if (property.isValueValid()) {
                this.f15691a.onSucceed((String) propertyInfo.getValue("FlowParams"));
                return;
            }
            C7736q0 q0Var = this.f15691a;
            q0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp2Service$e0 */
    class C7712e0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7748w0 f15692a;

        C7712e0(BsLamp2Service bsLamp2Service, C7748w0 w0Var) {
            this.f15692a = w0Var;
        }

        public void onFailed(int i, String str) {
            this.f15692a.onFailed(i, str);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.String} */
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
                com.yeelight.yeelib.device.xiaomi.BsLamp2Service$a1 r1 = com.yeelight.yeelib.device.xiaomi.BsLamp2Service.C7703a1.valueOf(r1)
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
                java.lang.String r1 = "SaveState"
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
                java.lang.String r1 = "MusicEnable"
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
                java.lang.String r1 = "NightTimeInfo"
                com.miot.common.property.Property r0 = r0.getProperty(r1)
                boolean r1 = r0.isValueValid()
                if (r1 == 0) goto L_0x0118
                java.lang.Object r0 = r0.getValue()
                r3 = r0
                java.lang.String r3 = (java.lang.String) r3
            L_0x0118:
                r0 = r18
                r17 = r3
                com.yeelight.yeelib.device.xiaomi.BsLamp2Service$w0 r4 = r0.f15692a
                r4.mo28138a(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.xiaomi.BsLamp2Service.C7712e0.onSucceed(com.miot.common.device.invocation.PropertyInfo):void");
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp2Service$f */
    class C7713f implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7754z0 f15693a;

        C7713f(BsLamp2Service bsLamp2Service, C7754z0 z0Var) {
            this.f15693a = z0Var;
        }

        public void onFailed(int i, String str) {
            this.f15693a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("SaveState");
            if (property.isValueValid()) {
                this.f15693a.mo29200a((Long) propertyInfo.getValue("SaveState"));
                return;
            }
            C7754z0 z0Var = this.f15693a;
            z0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp2Service$f0 */
    class C7714f0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7746v0 f15694a;

        C7714f0(BsLamp2Service bsLamp2Service, C7746v0 v0Var) {
            this.f15694a = v0Var;
        }

        public void onFailed(int i, String str) {
            this.f15694a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Power");
            if (property.isValueValid()) {
                this.f15694a.mo29194a(C7703a1.valueOf((String) propertyInfo.getValue("Power")));
                return;
            }
            C7746v0 v0Var = this.f15694a;
            v0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp2Service$g */
    class C7715g implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7742t0 f15695a;

        C7715g(BsLamp2Service bsLamp2Service, C7742t0 t0Var) {
            this.f15695a = t0Var;
        }

        public void onFailed(int i, String str) {
            this.f15695a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("MusicEnable");
            if (property.isValueValid()) {
                this.f15695a.mo29190a((Long) propertyInfo.getValue("MusicEnable"));
                return;
            }
            C7742t0 t0Var = this.f15695a;
            t0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp2Service$g0 */
    class C7716g0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7728m0 f15696a;

        C7716g0(BsLamp2Service bsLamp2Service, C7728m0 m0Var) {
            this.f15696a = m0Var;
        }

        public void onFailed(int i, String str) {
            this.f15696a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Bright");
            if (property.isValueValid()) {
                this.f15696a.mo29176a((Long) propertyInfo.getValue("Bright"));
                return;
            }
            C7728m0 m0Var = this.f15696a;
            m0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp2Service$h */
    class C7717h implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7744u0 f15697a;

        C7717h(BsLamp2Service bsLamp2Service, C7744u0 u0Var) {
            this.f15697a = u0Var;
        }

        public void onFailed(int i, String str) {
            this.f15697a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("NightTimeInfo");
            if (property.isValueValid()) {
                this.f15697a.onSucceed((String) propertyInfo.getValue("NightTimeInfo"));
                return;
            }
            C7744u0 u0Var = this.f15697a;
            u0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp2Service$h0 */
    class C7718h0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7732o0 f15698a;

        C7718h0(BsLamp2Service bsLamp2Service, C7732o0 o0Var) {
            this.f15698a = o0Var;
        }

        public void onFailed(int i, String str) {
            this.f15698a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Ct");
            if (property.isValueValid()) {
                this.f15698a.mo29180a((Long) propertyInfo.getValue("Ct"));
                return;
            }
            C7732o0 o0Var = this.f15698a;
            o0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp2Service$i */
    class C7719i implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15699a;

        C7719i(BsLamp2Service bsLamp2Service, CompletionHandler completionHandler) {
            this.f15699a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15699a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f15699a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp2Service$i0 */
    class C7720i0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7740s0 f15700a;

        C7720i0(BsLamp2Service bsLamp2Service, C7740s0 s0Var) {
            this.f15700a = s0Var;
        }

        public void onFailed(int i, String str) {
            this.f15700a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Hue");
            if (property.isValueValid()) {
                this.f15700a.mo29188a((Long) propertyInfo.getValue("Hue"));
                return;
            }
            C7740s0 s0Var = this.f15700a;
            s0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp2Service$j */
    class C7721j implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15701a;

        C7721j(BsLamp2Service bsLamp2Service, CompletionHandler completionHandler) {
            this.f15701a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15701a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f15701a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp2Service$j0 */
    class C7722j0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7752y0 f15702a;

        C7722j0(BsLamp2Service bsLamp2Service, C7752y0 y0Var) {
            this.f15702a = y0Var;
        }

        public void onFailed(int i, String str) {
            this.f15702a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Sat");
            if (property.isValueValid()) {
                this.f15702a.mo29198a((Long) propertyInfo.getValue("Sat"));
                return;
            }
            C7752y0 y0Var = this.f15702a;
            y0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp2Service$k */
    class C7723k implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15703a;

        C7723k(BsLamp2Service bsLamp2Service, CompletionHandler completionHandler) {
            this.f15703a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15703a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f15703a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp2Service$k0 */
    public enum C7724k0 {
        undefined,
        cfg_pomodoro,
        cfg_lan_ctrl,
        nighttime,
        pseudo_beacon,
        cfg_init_power,
        cfg_save_state
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp2Service$l */
    class C7725l implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15712a;

        C7725l(BsLamp2Service bsLamp2Service, CompletionHandler completionHandler) {
            this.f15712a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15712a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f15712a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp2Service$l0 */
    public enum C7726l0 {
        undefined,
        smooth,
        sudden
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp2Service$m */
    class C7727m implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15717a;

        C7727m(BsLamp2Service bsLamp2Service, CompletionHandler completionHandler) {
            this.f15717a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15717a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f15717a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp2Service$m0 */
    public interface C7728m0 {
        /* renamed from: a */
        void mo29176a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp2Service$n */
    class C7729n implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15718a;

        C7729n(BsLamp2Service bsLamp2Service, CompletionHandler completionHandler) {
            this.f15718a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15718a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f15718a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp2Service$n0 */
    public interface C7730n0 {
        /* renamed from: a */
        void mo29178a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp2Service$o */
    class C7731o implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15719a;

        C7731o(BsLamp2Service bsLamp2Service, CompletionHandler completionHandler) {
            this.f15719a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15719a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f15719a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp2Service$o0 */
    public interface C7732o0 {
        /* renamed from: a */
        void mo29180a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp2Service$p */
    class C7733p implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15720a;

        C7733p(BsLamp2Service bsLamp2Service, CompletionHandler completionHandler) {
            this.f15720a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15720a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f15720a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp2Service$p0 */
    public interface C7734p0 {
        /* renamed from: a */
        void mo29182a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp2Service$q */
    class C7735q implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15721a;

        C7735q(BsLamp2Service bsLamp2Service, CompletionHandler completionHandler) {
            this.f15721a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15721a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f15721a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp2Service$q0 */
    public interface C7736q0 {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp2Service$r */
    class C7737r implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15722a;

        C7737r(BsLamp2Service bsLamp2Service, CompletionHandler completionHandler) {
            this.f15722a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15722a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f15722a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp2Service$r0 */
    public interface C7738r0 {
        /* renamed from: a */
        void mo29186a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp2Service$s */
    class C7739s implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15723a;

        C7739s(BsLamp2Service bsLamp2Service, CompletionHandler completionHandler) {
            this.f15723a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15723a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f15723a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp2Service$s0 */
    public interface C7740s0 {
        /* renamed from: a */
        void mo29188a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp2Service$t */
    class C7741t implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15724a;

        C7741t(BsLamp2Service bsLamp2Service, CompletionHandler completionHandler) {
            this.f15724a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15724a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f15724a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp2Service$t0 */
    public interface C7742t0 {
        /* renamed from: a */
        void mo29190a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp2Service$u */
    class C7743u implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15725a;

        C7743u(BsLamp2Service bsLamp2Service, CompletionHandler completionHandler) {
            this.f15725a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15725a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f15725a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp2Service$u0 */
    public interface C7744u0 {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp2Service$v */
    class C7745v implements DeviceManipulator.PropertyChangedListener {

        /* renamed from: a */
        final /* synthetic */ C7706b1 f15726a;

        C7745v(BsLamp2Service bsLamp2Service, C7706b1 b1Var) {
            this.f15726a = b1Var;
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
                java.lang.String r5 = "Flowing"
                java.lang.String r6 = "DelayOff"
                java.lang.String r7 = "Power"
                java.lang.String r8 = "Sat"
                java.lang.String r9 = "Rgb"
                java.lang.String r10 = "Hue"
                java.lang.String r11 = "Ct"
                java.lang.String r12 = "ColorMode"
                java.lang.String r13 = "NightTimeInfo"
                java.lang.String r14 = "MusicEnable"
                java.lang.String r15 = "FlowParams"
                java.lang.String r0 = "SaveState"
                switch(r3) {
                    case -2117953292: goto L_0x008f;
                    case -2002016140: goto L_0x0086;
                    case -1787381784: goto L_0x007d;
                    case -1331143373: goto L_0x0074;
                    case -310275194: goto L_0x006c;
                    case 2193: goto L_0x0064;
                    case 72920: goto L_0x005c;
                    case 82093: goto L_0x0054;
                    case 82886: goto L_0x004c;
                    case 77306085: goto L_0x0044;
                    case 880790796: goto L_0x003b;
                    case 898856916: goto L_0x0032;
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
                r2 = 8
                goto L_0x0099
            L_0x0044:
                boolean r2 = r2.equals(r7)
                if (r2 == 0) goto L_0x0098
                r2 = 0
                goto L_0x0099
            L_0x004c:
                boolean r2 = r2.equals(r8)
                if (r2 == 0) goto L_0x0098
                r2 = 4
                goto L_0x0099
            L_0x0054:
                boolean r2 = r2.equals(r9)
                if (r2 == 0) goto L_0x0098
                r2 = 7
                goto L_0x0099
            L_0x005c:
                boolean r2 = r2.equals(r10)
                if (r2 == 0) goto L_0x0098
                r2 = 3
                goto L_0x0099
            L_0x0064:
                boolean r2 = r2.equals(r11)
                if (r2 == 0) goto L_0x0098
                r2 = 2
                goto L_0x0099
            L_0x006c:
                boolean r2 = r2.equals(r12)
                if (r2 == 0) goto L_0x0098
                r2 = 6
                goto L_0x0099
            L_0x0074:
                boolean r2 = r2.equals(r13)
                if (r2 == 0) goto L_0x0098
                r2 = 12
                goto L_0x0099
            L_0x007d:
                boolean r2 = r2.equals(r14)
                if (r2 == 0) goto L_0x0098
                r2 = 11
                goto L_0x0099
            L_0x0086:
                boolean r2 = r2.equals(r15)
                if (r2 == 0) goto L_0x0098
                r2 = 9
                goto L_0x0099
            L_0x008f:
                boolean r2 = r2.equals(r0)
                if (r2 == 0) goto L_0x0098
                r2 = 10
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
                com.miot.common.property.Property r0 = r1.getProperty(r13)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x009c
                java.lang.Object r0 = r1.getValue(r13)
                java.lang.String r0 = (java.lang.String) r0
                r2 = r16
                com.yeelight.yeelib.device.xiaomi.BsLamp2Service$b1 r1 = r2.f15726a
                r1.mo28146i(r0)
                goto L_0x01e3
            L_0x00b9:
                r2 = r16
                com.miot.common.property.Property r0 = r1.getProperty(r14)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x01e3
                java.lang.Object r0 = r1.getValue(r14)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.BsLamp2Service$b1 r1 = r2.f15726a
                r1.mo28151o(r0)
                goto L_0x01e3
            L_0x00d2:
                r2 = r16
                com.miot.common.property.Property r3 = r1.getProperty(r0)
                boolean r3 = r3.isValueValid()
                if (r3 == 0) goto L_0x01e3
                java.lang.Object r0 = r1.getValue(r0)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.BsLamp2Service$b1 r1 = r2.f15726a
                r1.mo28143d(r0)
                goto L_0x01e3
            L_0x00eb:
                r2 = r16
                com.miot.common.property.Property r0 = r1.getProperty(r15)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x01e3
                java.lang.Object r0 = r1.getValue(r15)
                java.lang.String r0 = (java.lang.String) r0
                com.yeelight.yeelib.device.xiaomi.BsLamp2Service$b1 r1 = r2.f15726a
                r1.mo28144e(r0)
                goto L_0x01e3
            L_0x0104:
                r2 = r16
                com.miot.common.property.Property r0 = r1.getProperty(r6)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x01e3
                java.lang.Object r0 = r1.getValue(r6)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.BsLamp2Service$b1 r1 = r2.f15726a
                r1.mo28141b(r0)
                goto L_0x01e3
            L_0x011d:
                r2 = r16
                com.miot.common.property.Property r0 = r1.getProperty(r9)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x01e3
                java.lang.Object r0 = r1.getValue(r9)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.BsLamp2Service$b1 r1 = r2.f15726a
                r1.mo28147j(r0)
                goto L_0x01e3
            L_0x0136:
                r2 = r16
                com.miot.common.property.Property r0 = r1.getProperty(r12)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x01e3
                java.lang.Object r0 = r1.getValue(r12)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.BsLamp2Service$b1 r1 = r2.f15726a
                r1.mo28149l(r0)
                goto L_0x01e3
            L_0x014f:
                r2 = r16
                com.miot.common.property.Property r0 = r1.getProperty(r5)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x01e3
                java.lang.Object r0 = r1.getValue(r5)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.BsLamp2Service$b1 r1 = r2.f15726a
                r1.mo28142c(r0)
                goto L_0x01e3
            L_0x0168:
                r2 = r16
                com.miot.common.property.Property r0 = r1.getProperty(r8)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x01e3
                java.lang.Object r0 = r1.getValue(r8)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.BsLamp2Service$b1 r1 = r2.f15726a
                r1.mo28148k(r0)
                goto L_0x01e3
            L_0x0180:
                r2 = r16
                com.miot.common.property.Property r0 = r1.getProperty(r10)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x01e3
                java.lang.Object r0 = r1.getValue(r10)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.BsLamp2Service$b1 r1 = r2.f15726a
                r1.mo28150n(r0)
                goto L_0x01e3
            L_0x0198:
                r2 = r16
                com.miot.common.property.Property r0 = r1.getProperty(r11)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x01e3
                java.lang.Object r0 = r1.getValue(r11)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.BsLamp2Service$b1 r1 = r2.f15726a
                r1.mo28145h(r0)
                goto L_0x01e3
            L_0x01b0:
                r2 = r16
                com.miot.common.property.Property r0 = r1.getProperty(r4)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x01e3
                java.lang.Object r0 = r1.getValue(r4)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.BsLamp2Service$b1 r1 = r2.f15726a
                r1.mo28140a(r0)
                goto L_0x01e3
            L_0x01c8:
                r2 = r16
                com.miot.common.property.Property r0 = r1.getProperty(r7)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x01e3
                java.lang.Object r0 = r1.getValue(r7)
                java.lang.String r0 = (java.lang.String) r0
                com.yeelight.yeelib.device.xiaomi.BsLamp2Service$a1 r0 = com.yeelight.yeelib.device.xiaomi.BsLamp2Service.C7703a1.valueOf(r0)
                com.yeelight.yeelib.device.xiaomi.BsLamp2Service$b1 r1 = r2.f15726a
                r1.mo28152p(r0)
            L_0x01e3:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.xiaomi.BsLamp2Service.C7745v.onPropertyChanged(com.miot.common.device.invocation.PropertyInfo, java.lang.String):void");
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp2Service$v0 */
    public interface C7746v0 {
        /* renamed from: a */
        void mo29194a(C7703a1 a1Var);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp2Service$w */
    class C7747w implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15727a;

        C7747w(BsLamp2Service bsLamp2Service, CompletionHandler completionHandler) {
            this.f15727a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15727a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f15727a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp2Service$w0 */
    public interface C7748w0 {
        /* renamed from: a */
        void mo28138a(C7703a1 a1Var, Long l, Long l2, Long l3, Long l4, Long l5, Long l6, Long l7, Long l8, String str, Long l9, Long l10, String str2);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp2Service$x */
    class C7749x implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15728a;

        C7749x(BsLamp2Service bsLamp2Service, CompletionHandler completionHandler) {
            this.f15728a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15728a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f15728a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp2Service$x0 */
    public interface C7750x0 {
        /* renamed from: a */
        void mo29196a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp2Service$y */
    class C7751y implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15729a;

        C7751y(BsLamp2Service bsLamp2Service, CompletionHandler completionHandler) {
            this.f15729a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15729a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f15729a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp2Service$y0 */
    public interface C7752y0 {
        /* renamed from: a */
        void mo29198a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp2Service$z */
    class C7753z implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15730a;

        C7753z(BsLamp2Service bsLamp2Service, CompletionHandler completionHandler) {
            this.f15730a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15730a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f15730a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp2Service$z0 */
    public interface C7754z0 {
        /* renamed from: a */
        void mo29200a(Long l);

        void onFailed(int i, String str);
    }

    public BsLamp2Service(AbstractDevice abstractDevice) {
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
                MiotManager.getDeviceManipulator().invoke(create, new C7739s(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7725l(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7719i(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7705b0(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getBright(C7728m0 m0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Bright"), new C7716g0(this, m0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getColorMode(C7730n0 n0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "ColorMode"), new C7704b(this, n0Var));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7702a0(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getCt(C7732o0 o0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Ct"), new C7718h0(this, o0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getDelayOff(C7734p0 p0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "DelayOff"), new C7709d(this, p0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowParams(C7736q0 q0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "FlowParams"), new C7711e(this, q0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowing(C7738r0 r0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Flowing"), new C7701a(this, r0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getHue(C7740s0 s0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Hue"), new C7720i0(this, s0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getMusicEnable(C7742t0 t0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "MusicEnable"), new C7715g(this, t0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getNightTimeInfo(C7744u0 u0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "NightTimeInfo"), new C7717h(this, u0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getPower(C7746v0 v0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Power"), new C7714f0(this, v0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getProperties(C7748w0 w0Var) {
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
            create.addProperty(getService().getProperty("SaveState"));
            create.addProperty(getService().getProperty("MusicEnable"));
            create.addProperty(getService().getProperty("NightTimeInfo"));
            MiotManager.getDeviceManipulator().readProperty(create, new C7712e0(this, w0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getRgb(C7750x0 x0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Rgb"), new C7707c(this, x0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getSat(C7752y0 y0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Sat"), new C7722j0(this, y0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getSaveState(C7754z0 z0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "SaveState"), new C7713f(this, z0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void openWithMode(C7703a1 a1Var, C7726l0 l0Var, Long l, Long l2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "openWithMode");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("Power", a1Var.toString())) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Effect", l0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Duration", l)) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("Mode", l2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C7731o(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7727m(this, completionHandler));
                return;
            }
            throw new MiotException("actionInfo is null");
        }
        throw new MiotException("device not configurated connection");
    }

    public void sendCmd(C7724k0 k0Var, String str, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "sendCmd");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("CmdKey", k0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("CmdValue", str)) {
                MiotManager.getDeviceManipulator().invoke(create, new C7747w(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setBright(Long l, C7726l0 l0Var, Long l2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setBright");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("Bright", l)) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Effect", l0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("Duration", l2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C7721j(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setCt(Long l, C7726l0 l0Var, Long l2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setCt");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("Ct", l)) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Effect", l0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("Duration", l2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C7753z(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7741t(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7751y(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7743u(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setPower(C7703a1 a1Var, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setPower");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (create.setArgumentValue("Power", a1Var.toString())) {
                MiotManager.getDeviceManipulator().invoke(create, new C7733p(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setRgb(Long l, C7726l0 l0Var, Long l2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setRgb");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("Rgb", l)) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Effect", l0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("Duration", l2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C7735q(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7729n(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7749x(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7708c0(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void subscribeNotifications(CompletionHandler completionHandler, C7706b1 b1Var) {
        if (completionHandler == null) {
            throw new IllegalArgumentException("handler is null");
        } else if (b1Var != null) {
            PropertyInfo create = PropertyInfoFactory.create(getService());
            for (Property next : getService().getProperties()) {
                if (next.getDefinition().isNotifiable()) {
                    create.addProperty(next);
                }
            }
            MiotManager.getDeviceManipulator().addPropertyChangedListener(create, new C7723k(this, completionHandler), new C7745v(this, b1Var));
        } else {
            throw new IllegalArgumentException("listener is null");
        }
    }

    public void toggle(CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "toggle");
            if (create != null) {
                MiotManager.getDeviceManipulator().invoke(create, new C7737r(this, completionHandler));
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
            MiotManager.getDeviceManipulator().removePropertyChangedListener(create, new C7710d0(this, completionHandler));
            return;
        }
        throw new IllegalArgumentException("handler is null");
    }
}
