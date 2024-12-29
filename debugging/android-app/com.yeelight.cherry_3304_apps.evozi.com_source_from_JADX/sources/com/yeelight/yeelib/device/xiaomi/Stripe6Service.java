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

public class Stripe6Service extends AbstractService {
    public static final String ACTION_addCron = "addCron";
    public static final String ACTION_delCron = "delCron";
    public static final String ACTION_disableMusic = "disableMusic";
    public static final String ACTION_enableMusic = "enableMusic";
    public static final String ACTION_getCron = "getCron";
    public static final String ACTION_openWithMode = "openWithMode";
    public static final String ACTION_restore = "restore";
    public static final String ACTION_sendCmd = "sendCmd";
    public static final String ACTION_setBright = "setBright";
    public static final String ACTION_setDefault = "setDefault";
    public static final String ACTION_setFlowScene = "setFlowScene";
    public static final String ACTION_setLEDIndicator = "setLEDIndicator";
    public static final String ACTION_setPower = "setPower";
    public static final String ACTION_setRgb = "setRgb";
    public static final String ACTION_setScene = "setScene";
    public static final String ACTION_start_cf = "start_cf";
    public static final String ACTION_toggle = "toggle";
    public static final String PROPERTY_Bright = "Bright";
    public static final String PROPERTY_CmdKey = "CmdKey";
    public static final String PROPERTY_CmdValue = "CmdValue";
    public static final String PROPERTY_ColorMode = "ColorMode";
    public static final String PROPERTY_CronType = "CronType";
    public static final String PROPERTY_DelayOff = "DelayOff";
    public static final String PROPERTY_Duration = "Duration";
    public static final String PROPERTY_Effect = "Effect";
    public static final String PROPERTY_FlowParams = "FlowParams";
    public static final String PROPERTY_Flowing = "Flowing";
    public static final String PROPERTY_Hue = "Hue";
    public static final String PROPERTY_IndicatorOn = "IndicatorOn";
    public static final String PROPERTY_IndicatorParams = "IndicatorParams";
    public static final String PROPERTY_LanMode = "LanMode";
    public static final String PROPERTY_Mode = "Mode";
    public static final String PROPERTY_MusicEnable = "MusicEnable";
    public static final String PROPERTY_MusicIPAddress = "MusicIPAddress";
    public static final String PROPERTY_MusicPort = "MusicPort";
    public static final String PROPERTY_ParamColors = "ParamColors";
    public static final String PROPERTY_ParamCount = "ParamCount";
    public static final String PROPERTY_ParamFinish = "ParamFinish";
    public static final String PROPERTY_ParamModel = "ParamModel";
    public static final String PROPERTY_Power = "Power";
    public static final String PROPERTY_Rgb = "Rgb";
    public static final String PROPERTY_Sat = "Sat";
    public static final String PROPERTY_SaveState = "SaveState";
    public static final String PROPERTY_onFromPower = "onFromPower";
    private static final String TAG = "Stripe6Service";
    private AbstractDevice mDevice = null;

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe6Service$a */
    class C9546a implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9574m0 f17492a;

        C9546a(Stripe6Service stripe6Service, C9574m0 m0Var) {
            this.f17492a = m0Var;
        }

        public void onFailed(int i, String str) {
            this.f17492a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("ColorMode");
            if (property.isValueValid()) {
                this.f17492a.mo31266a((Long) propertyInfo.getValue("ColorMode"));
                return;
            }
            C9574m0 m0Var = this.f17492a;
            m0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe6Service$a0 */
    class C9547a0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17493a;

        C9547a0(Stripe6Service stripe6Service, CompletionHandler completionHandler) {
            this.f17493a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17493a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17493a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe6Service$a1 */
    public enum C9548a1 {
        undefined,
        on,
        off
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe6Service$b */
    class C9549b implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9594w0 f17498a;

        C9549b(Stripe6Service stripe6Service, C9594w0 w0Var) {
            this.f17498a = w0Var;
        }

        public void onFailed(int i, String str) {
            this.f17498a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Rgb");
            if (property.isValueValid()) {
                this.f17498a.mo31284a((Long) propertyInfo.getValue("Rgb"));
                return;
            }
            C9594w0 w0Var = this.f17498a;
            w0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe6Service$b0 */
    class C9550b0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17499a;

        C9550b0(Stripe6Service stripe6Service, CompletionHandler completionHandler) {
            this.f17499a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17499a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17499a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe6Service$b1 */
    public enum C9551b1 {
        undefined,
        on,
        off
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe6Service$c */
    class C9552c implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9576n0 f17504a;

        C9552c(Stripe6Service stripe6Service, C9576n0 n0Var) {
            this.f17504a = n0Var;
        }

        public void onFailed(int i, String str) {
            this.f17504a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("DelayOff");
            if (property.isValueValid()) {
                this.f17504a.mo31268a((Long) propertyInfo.getValue("DelayOff"));
                return;
            }
            C9576n0 n0Var = this.f17504a;
            n0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe6Service$c0 */
    class C9553c0 implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17505a;

        C9553c0(Stripe6Service stripe6Service, CompletionHandler completionHandler) {
            this.f17505a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17505a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f17505a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe6Service$c1 */
    public interface C9554c1 {
        /* renamed from: a */
        void mo28313a(Long l);

        /* renamed from: b */
        void mo28314b(Long l);

        /* renamed from: c */
        void mo28315c(Long l);

        /* renamed from: d */
        void mo28316d(Long l);

        /* renamed from: e */
        void mo28317e(String str);

        /* renamed from: f */
        void mo28318f(Long l);

        /* renamed from: g */
        void mo28319g(Long l);

        /* renamed from: h */
        void mo28320h(C9551b1 b1Var);

        /* renamed from: i */
        void mo28321i(Long l);

        /* renamed from: j */
        void mo28322j(Long l);

        /* renamed from: k */
        void mo28323k(Long l);

        /* renamed from: l */
        void mo28324l(Long l);

        /* renamed from: n */
        void mo28325n(Long l);

        /* renamed from: o */
        void mo28326o(Long l);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe6Service$d */
    class C9555d implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9598y0 f17506a;

        C9555d(Stripe6Service stripe6Service, C9598y0 y0Var) {
            this.f17506a = y0Var;
        }

        public void onFailed(int i, String str) {
            this.f17506a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("SaveState");
            if (property.isValueValid()) {
                this.f17506a.mo31288a((Long) propertyInfo.getValue("SaveState"));
                return;
            }
            C9598y0 y0Var = this.f17506a;
            y0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe6Service$d0 */
    class C9556d0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9592v0 f17507a;

        C9556d0(Stripe6Service stripe6Service, C9592v0 v0Var) {
            this.f17507a = v0Var;
        }

        public void onFailed(int i, String str) {
            this.f17507a.onFailed(i, str);
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
                com.yeelight.yeelib.device.xiaomi.Stripe6Service$b1 r1 = com.yeelight.yeelib.device.xiaomi.Stripe6Service.C9551b1.valueOf(r1)
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
                java.lang.String r1 = "Hue"
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
                java.lang.String r1 = "Sat"
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
                java.lang.String r1 = "Flowing"
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
                java.lang.String r1 = "ColorMode"
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
                java.lang.String r1 = "Rgb"
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
                java.lang.String r1 = "DelayOff"
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
                java.lang.String r1 = "SaveState"
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
                java.lang.String r1 = "onFromPower"
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
                java.lang.String r1 = "IndicatorOn"
                com.miot.common.property.Property r0 = r0.getProperty(r1)
                boolean r1 = r0.isValueValid()
                if (r1 == 0) goto L_0x012f
                java.lang.Object r0 = r0.getValue()
                r3 = r0
                java.lang.Long r3 = (java.lang.Long) r3
            L_0x012f:
                r0 = r19
                r18 = r3
                com.yeelight.yeelib.device.xiaomi.Stripe6Service$v0 r4 = r0.f17507a
                r4.mo28327a(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.xiaomi.Stripe6Service.C9556d0.onSucceed(com.miot.common.device.invocation.PropertyInfo):void");
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe6Service$e */
    class C9557e implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9578o0 f17508a;

        C9557e(Stripe6Service stripe6Service, C9578o0 o0Var) {
            this.f17508a = o0Var;
        }

        public void onFailed(int i, String str) {
            this.f17508a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("FlowParams");
            if (property.isValueValid()) {
                this.f17508a.onSucceed((String) propertyInfo.getValue("FlowParams"));
                return;
            }
            C9578o0 o0Var = this.f17508a;
            o0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe6Service$e0 */
    class C9558e0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9590u0 f17509a;

        C9558e0(Stripe6Service stripe6Service, C9590u0 u0Var) {
            this.f17509a = u0Var;
        }

        public void onFailed(int i, String str) {
            this.f17509a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Power");
            if (property.isValueValid()) {
                this.f17509a.mo31282a(C9551b1.valueOf((String) propertyInfo.getValue("Power")));
                return;
            }
            C9590u0 u0Var = this.f17509a;
            u0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe6Service$f */
    class C9559f implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9586s0 f17510a;

        C9559f(Stripe6Service stripe6Service, C9586s0 s0Var) {
            this.f17510a = s0Var;
        }

        public void onFailed(int i, String str) {
            this.f17510a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("LanMode");
            if (property.isValueValid()) {
                this.f17510a.mo31278a((Long) propertyInfo.getValue("LanMode"));
                return;
            }
            C9586s0 s0Var = this.f17510a;
            s0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe6Service$f0 */
    class C9560f0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9572l0 f17511a;

        C9560f0(Stripe6Service stripe6Service, C9572l0 l0Var) {
            this.f17511a = l0Var;
        }

        public void onFailed(int i, String str) {
            this.f17511a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Bright");
            if (property.isValueValid()) {
                this.f17511a.mo31264a((Long) propertyInfo.getValue("Bright"));
                return;
            }
            C9572l0 l0Var = this.f17511a;
            l0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe6Service$g */
    class C9561g implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9600z0 f17512a;

        C9561g(Stripe6Service stripe6Service, C9600z0 z0Var) {
            this.f17512a = z0Var;
        }

        public void onFailed(int i, String str) {
            this.f17512a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("onFromPower");
            if (property.isValueValid()) {
                this.f17512a.mo31290a((Long) propertyInfo.getValue("onFromPower"));
                return;
            }
            C9600z0 z0Var = this.f17512a;
            z0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe6Service$g0 */
    class C9562g0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9582q0 f17513a;

        C9562g0(Stripe6Service stripe6Service, C9582q0 q0Var) {
            this.f17513a = q0Var;
        }

        public void onFailed(int i, String str) {
            this.f17513a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Hue");
            if (property.isValueValid()) {
                this.f17513a.mo31274a((Long) propertyInfo.getValue("Hue"));
                return;
            }
            C9582q0 q0Var = this.f17513a;
            q0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe6Service$h */
    class C9563h implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9588t0 f17514a;

        C9563h(Stripe6Service stripe6Service, C9588t0 t0Var) {
            this.f17514a = t0Var;
        }

        public void onFailed(int i, String str) {
            this.f17514a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("MusicEnable");
            if (property.isValueValid()) {
                this.f17514a.mo31280a((Long) propertyInfo.getValue("MusicEnable"));
                return;
            }
            C9588t0 t0Var = this.f17514a;
            t0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe6Service$h0 */
    class C9564h0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9596x0 f17515a;

        C9564h0(Stripe6Service stripe6Service, C9596x0 x0Var) {
            this.f17515a = x0Var;
        }

        public void onFailed(int i, String str) {
            this.f17515a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Sat");
            if (property.isValueValid()) {
                this.f17515a.mo31286a((Long) propertyInfo.getValue("Sat"));
                return;
            }
            C9596x0 x0Var = this.f17515a;
            x0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe6Service$i */
    class C9565i implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9584r0 f17516a;

        C9565i(Stripe6Service stripe6Service, C9584r0 r0Var) {
            this.f17516a = r0Var;
        }

        public void onFailed(int i, String str) {
            this.f17516a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("IndicatorOn");
            if (property.isValueValid()) {
                this.f17516a.mo31276a((Long) propertyInfo.getValue("IndicatorOn"));
                return;
            }
            C9584r0 r0Var = this.f17516a;
            r0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe6Service$i0 */
    class C9566i0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9580p0 f17517a;

        C9566i0(Stripe6Service stripe6Service, C9580p0 p0Var) {
            this.f17517a = p0Var;
        }

        public void onFailed(int i, String str) {
            this.f17517a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Flowing");
            if (property.isValueValid()) {
                this.f17517a.mo31272a((Long) propertyInfo.getValue("Flowing"));
                return;
            }
            C9580p0 p0Var = this.f17517a;
            p0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe6Service$j */
    class C9567j implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17518a;

        C9567j(Stripe6Service stripe6Service, CompletionHandler completionHandler) {
            this.f17518a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17518a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17518a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe6Service$j0 */
    public enum C9568j0 {
        undefined,
        cfg_pomodoro,
        cfg_lan_ctrl,
        cfg_save_state,
        cfg_init_power,
        pseudo_beacon
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe6Service$k */
    class C9569k implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17526a;

        C9569k(Stripe6Service stripe6Service, CompletionHandler completionHandler) {
            this.f17526a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17526a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f17526a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe6Service$k0 */
    public enum C9570k0 {
        undefined,
        smooth,
        sudden
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe6Service$l */
    class C9571l implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17531a;

        C9571l(Stripe6Service stripe6Service, CompletionHandler completionHandler) {
            this.f17531a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17531a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17531a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe6Service$l0 */
    public interface C9572l0 {
        /* renamed from: a */
        void mo31264a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe6Service$m */
    class C9573m implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17532a;

        C9573m(Stripe6Service stripe6Service, CompletionHandler completionHandler) {
            this.f17532a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17532a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17532a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe6Service$m0 */
    public interface C9574m0 {
        /* renamed from: a */
        void mo31266a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe6Service$n */
    class C9575n implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17533a;

        C9575n(Stripe6Service stripe6Service, CompletionHandler completionHandler) {
            this.f17533a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17533a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17533a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe6Service$n0 */
    public interface C9576n0 {
        /* renamed from: a */
        void mo31268a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe6Service$o */
    class C9577o implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17534a;

        C9577o(Stripe6Service stripe6Service, CompletionHandler completionHandler) {
            this.f17534a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17534a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17534a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe6Service$o0 */
    public interface C9578o0 {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe6Service$p */
    class C9579p implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17535a;

        C9579p(Stripe6Service stripe6Service, CompletionHandler completionHandler) {
            this.f17535a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17535a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17535a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe6Service$p0 */
    public interface C9580p0 {
        /* renamed from: a */
        void mo31272a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe6Service$q */
    class C9581q implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17536a;

        C9581q(Stripe6Service stripe6Service, CompletionHandler completionHandler) {
            this.f17536a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17536a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17536a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe6Service$q0 */
    public interface C9582q0 {
        /* renamed from: a */
        void mo31274a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe6Service$r */
    class C9583r implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17537a;

        C9583r(Stripe6Service stripe6Service, CompletionHandler completionHandler) {
            this.f17537a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17537a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17537a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe6Service$r0 */
    public interface C9584r0 {
        /* renamed from: a */
        void mo31276a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe6Service$s */
    class C9585s implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17538a;

        C9585s(Stripe6Service stripe6Service, CompletionHandler completionHandler) {
            this.f17538a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17538a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17538a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe6Service$s0 */
    public interface C9586s0 {
        /* renamed from: a */
        void mo31278a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe6Service$t */
    class C9587t implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17539a;

        C9587t(Stripe6Service stripe6Service, CompletionHandler completionHandler) {
            this.f17539a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17539a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17539a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe6Service$t0 */
    public interface C9588t0 {
        /* renamed from: a */
        void mo31280a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe6Service$u */
    class C9589u implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17540a;

        C9589u(Stripe6Service stripe6Service, CompletionHandler completionHandler) {
            this.f17540a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17540a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17540a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe6Service$u0 */
    public interface C9590u0 {
        /* renamed from: a */
        void mo31282a(C9551b1 b1Var);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe6Service$v */
    class C9591v implements DeviceManipulator.PropertyChangedListener {

        /* renamed from: a */
        final /* synthetic */ C9554c1 f17541a;

        C9591v(Stripe6Service stripe6Service, C9554c1 c1Var) {
            this.f17541a = c1Var;
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
                java.lang.String r8 = "IndicatorOn"
                java.lang.String r9 = "Power"
                java.lang.String r10 = "onFromPower"
                java.lang.String r11 = "Sat"
                java.lang.String r12 = "Rgb"
                java.lang.String r13 = "Hue"
                java.lang.String r14 = "ColorMode"
                java.lang.String r15 = "MusicEnable"
                java.lang.String r0 = "FlowParams"
                java.lang.String r1 = "SaveState"
                switch(r3) {
                    case -2117953292: goto L_0x009b;
                    case -2002016140: goto L_0x0092;
                    case -1787381784: goto L_0x0089;
                    case -310275194: goto L_0x0081;
                    case 72920: goto L_0x0079;
                    case 82093: goto L_0x0071;
                    case 82886: goto L_0x0069;
                    case 35911772: goto L_0x0060;
                    case 77306085: goto L_0x0058;
                    case 335685678: goto L_0x004f;
                    case 880790796: goto L_0x0047;
                    case 898856916: goto L_0x003e;
                    case 1611821756: goto L_0x0034;
                    case 1998035738: goto L_0x002b;
                    default: goto L_0x0029;
                }
            L_0x0029:
                goto L_0x00a4
            L_0x002b:
                boolean r2 = r2.equals(r4)
                if (r2 == 0) goto L_0x00a4
                r2 = 1
                goto L_0x00a5
            L_0x0034:
                boolean r2 = r2.equals(r5)
                if (r2 == 0) goto L_0x00a4
                r2 = 10
                goto L_0x00a5
            L_0x003e:
                boolean r2 = r2.equals(r6)
                if (r2 == 0) goto L_0x00a4
                r2 = 4
                goto L_0x00a5
            L_0x0047:
                boolean r2 = r2.equals(r7)
                if (r2 == 0) goto L_0x00a4
                r2 = 7
                goto L_0x00a5
            L_0x004f:
                boolean r2 = r2.equals(r8)
                if (r2 == 0) goto L_0x00a4
                r2 = 13
                goto L_0x00a5
            L_0x0058:
                boolean r2 = r2.equals(r9)
                if (r2 == 0) goto L_0x00a4
                r2 = 0
                goto L_0x00a5
            L_0x0060:
                boolean r2 = r2.equals(r10)
                if (r2 == 0) goto L_0x00a4
                r2 = 11
                goto L_0x00a5
            L_0x0069:
                boolean r2 = r2.equals(r11)
                if (r2 == 0) goto L_0x00a4
                r2 = 3
                goto L_0x00a5
            L_0x0071:
                boolean r2 = r2.equals(r12)
                if (r2 == 0) goto L_0x00a4
                r2 = 6
                goto L_0x00a5
            L_0x0079:
                boolean r2 = r2.equals(r13)
                if (r2 == 0) goto L_0x00a4
                r2 = 2
                goto L_0x00a5
            L_0x0081:
                boolean r2 = r2.equals(r14)
                if (r2 == 0) goto L_0x00a4
                r2 = 5
                goto L_0x00a5
            L_0x0089:
                boolean r2 = r2.equals(r15)
                if (r2 == 0) goto L_0x00a4
                r2 = 12
                goto L_0x00a5
            L_0x0092:
                boolean r2 = r2.equals(r0)
                if (r2 == 0) goto L_0x00a4
                r2 = 9
                goto L_0x00a5
            L_0x009b:
                boolean r2 = r2.equals(r1)
                if (r2 == 0) goto L_0x00a4
                r2 = 8
                goto L_0x00a5
            L_0x00a4:
                r2 = -1
            L_0x00a5:
                switch(r2) {
                    case 0: goto L_0x0209;
                    case 1: goto L_0x01ef;
                    case 2: goto L_0x01d5;
                    case 3: goto L_0x01bb;
                    case 4: goto L_0x01a0;
                    case 5: goto L_0x0185;
                    case 6: goto L_0x016a;
                    case 7: goto L_0x014f;
                    case 8: goto L_0x0133;
                    case 9: goto L_0x0118;
                    case 10: goto L_0x00fd;
                    case 11: goto L_0x00e2;
                    case 12: goto L_0x00c7;
                    case 13: goto L_0x00ac;
                    default: goto L_0x00a8;
                }
            L_0x00a8:
                r3 = r16
                goto L_0x0226
            L_0x00ac:
                r1 = r17
                com.miot.common.property.Property r0 = r1.getProperty(r8)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x00a8
                java.lang.Object r0 = r1.getValue(r8)
                java.lang.Long r0 = (java.lang.Long) r0
                r3 = r16
                com.yeelight.yeelib.device.xiaomi.Stripe6Service$c1 r1 = r3.f17541a
                r1.mo28321i(r0)
                goto L_0x0226
            L_0x00c7:
                r3 = r16
                r1 = r17
                com.miot.common.property.Property r0 = r1.getProperty(r15)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0226
                java.lang.Object r0 = r1.getValue(r15)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Stripe6Service$c1 r1 = r3.f17541a
                r1.mo28326o(r0)
                goto L_0x0226
            L_0x00e2:
                r3 = r16
                r1 = r17
                com.miot.common.property.Property r0 = r1.getProperty(r10)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0226
                java.lang.Object r0 = r1.getValue(r10)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Stripe6Service$c1 r1 = r3.f17541a
                r1.mo28318f(r0)
                goto L_0x0226
            L_0x00fd:
                r3 = r16
                r1 = r17
                com.miot.common.property.Property r0 = r1.getProperty(r5)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0226
                java.lang.Object r0 = r1.getValue(r5)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Stripe6Service$c1 r1 = r3.f17541a
                r1.mo28319g(r0)
                goto L_0x0226
            L_0x0118:
                r3 = r16
                r1 = r17
                com.miot.common.property.Property r2 = r1.getProperty(r0)
                boolean r2 = r2.isValueValid()
                if (r2 == 0) goto L_0x0226
                java.lang.Object r0 = r1.getValue(r0)
                java.lang.String r0 = (java.lang.String) r0
                com.yeelight.yeelib.device.xiaomi.Stripe6Service$c1 r1 = r3.f17541a
                r1.mo28317e(r0)
                goto L_0x0226
            L_0x0133:
                r3 = r16
                r2 = r1
                r1 = r17
                com.miot.common.property.Property r0 = r1.getProperty(r2)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0226
                java.lang.Object r0 = r1.getValue(r2)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Stripe6Service$c1 r1 = r3.f17541a
                r1.mo28316d(r0)
                goto L_0x0226
            L_0x014f:
                r3 = r16
                r1 = r17
                com.miot.common.property.Property r0 = r1.getProperty(r7)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0226
                java.lang.Object r0 = r1.getValue(r7)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Stripe6Service$c1 r1 = r3.f17541a
                r1.mo28314b(r0)
                goto L_0x0226
            L_0x016a:
                r3 = r16
                r1 = r17
                com.miot.common.property.Property r0 = r1.getProperty(r12)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0226
                java.lang.Object r0 = r1.getValue(r12)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Stripe6Service$c1 r1 = r3.f17541a
                r1.mo28322j(r0)
                goto L_0x0226
            L_0x0185:
                r3 = r16
                r1 = r17
                com.miot.common.property.Property r0 = r1.getProperty(r14)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0226
                java.lang.Object r0 = r1.getValue(r14)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Stripe6Service$c1 r1 = r3.f17541a
                r1.mo28324l(r0)
                goto L_0x0226
            L_0x01a0:
                r3 = r16
                r1 = r17
                com.miot.common.property.Property r0 = r1.getProperty(r6)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0226
                java.lang.Object r0 = r1.getValue(r6)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Stripe6Service$c1 r1 = r3.f17541a
                r1.mo28315c(r0)
                goto L_0x0226
            L_0x01bb:
                r3 = r16
                r1 = r17
                com.miot.common.property.Property r0 = r1.getProperty(r11)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0226
                java.lang.Object r0 = r1.getValue(r11)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Stripe6Service$c1 r1 = r3.f17541a
                r1.mo28323k(r0)
                goto L_0x0226
            L_0x01d5:
                r3 = r16
                r1 = r17
                com.miot.common.property.Property r0 = r1.getProperty(r13)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0226
                java.lang.Object r0 = r1.getValue(r13)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Stripe6Service$c1 r1 = r3.f17541a
                r1.mo28325n(r0)
                goto L_0x0226
            L_0x01ef:
                r3 = r16
                r1 = r17
                com.miot.common.property.Property r0 = r1.getProperty(r4)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0226
                java.lang.Object r0 = r1.getValue(r4)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Stripe6Service$c1 r1 = r3.f17541a
                r1.mo28313a(r0)
                goto L_0x0226
            L_0x0209:
                r3 = r16
                r1 = r17
                com.miot.common.property.Property r0 = r1.getProperty(r9)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0226
                java.lang.Object r0 = r1.getValue(r9)
                java.lang.String r0 = (java.lang.String) r0
                com.yeelight.yeelib.device.xiaomi.Stripe6Service$b1 r0 = com.yeelight.yeelib.device.xiaomi.Stripe6Service.C9551b1.valueOf(r0)
                com.yeelight.yeelib.device.xiaomi.Stripe6Service$c1 r1 = r3.f17541a
                r1.mo28320h(r0)
            L_0x0226:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.xiaomi.Stripe6Service.C9591v.onPropertyChanged(com.miot.common.device.invocation.PropertyInfo, java.lang.String):void");
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe6Service$v0 */
    public interface C9592v0 {
        /* renamed from: a */
        void mo28327a(C9551b1 b1Var, Long l, Long l2, Long l3, Long l4, Long l5, Long l6, Long l7, Long l8, String str, Long l9, Long l10, Long l11, Long l12);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe6Service$w */
    class C9593w implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17542a;

        C9593w(Stripe6Service stripe6Service, CompletionHandler completionHandler) {
            this.f17542a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17542a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17542a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe6Service$w0 */
    public interface C9594w0 {
        /* renamed from: a */
        void mo31284a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe6Service$x */
    class C9595x implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17543a;

        C9595x(Stripe6Service stripe6Service, CompletionHandler completionHandler) {
            this.f17543a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17543a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17543a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe6Service$x0 */
    public interface C9596x0 {
        /* renamed from: a */
        void mo31286a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe6Service$y */
    class C9597y implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17544a;

        C9597y(Stripe6Service stripe6Service, CompletionHandler completionHandler) {
            this.f17544a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17544a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17544a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe6Service$y0 */
    public interface C9598y0 {
        /* renamed from: a */
        void mo31288a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe6Service$z */
    class C9599z implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17545a;

        C9599z(Stripe6Service stripe6Service, CompletionHandler completionHandler) {
            this.f17545a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17545a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17545a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe6Service$z0 */
    public interface C9600z0 {
        /* renamed from: a */
        void mo31290a(Long l);

        void onFailed(int i, String str);
    }

    public Stripe6Service(AbstractDevice abstractDevice) {
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
                MiotManager.getDeviceManipulator().invoke(create, new C9587t(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C9573m(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C9567j(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C9547a0(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getBright(C9572l0 l0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Bright"), new C9560f0(this, l0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getColorMode(C9574m0 m0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "ColorMode"), new C9546a(this, m0Var));
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
                MiotManager.getDeviceManipulator().invoke(create, new C9599z(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getDelayOff(C9576n0 n0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "DelayOff"), new C9552c(this, n0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowParams(C9578o0 o0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "FlowParams"), new C9557e(this, o0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowing(C9580p0 p0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Flowing"), new C9566i0(this, p0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getHue(C9582q0 q0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Hue"), new C9562g0(this, q0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getIndicatorOn(C9584r0 r0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "IndicatorOn"), new C9565i(this, r0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getLanMode(C9586s0 s0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "LanMode"), new C9559f(this, s0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getMusicEnable(C9588t0 t0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "MusicEnable"), new C9563h(this, t0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getPower(C9590u0 u0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Power"), new C9558e0(this, u0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getProperties(C9592v0 v0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            PropertyInfo create = PropertyInfoFactory.create(getService());
            create.addProperty(getService().getProperty("Power"));
            create.addProperty(getService().getProperty("Bright"));
            create.addProperty(getService().getProperty("Hue"));
            create.addProperty(getService().getProperty("Sat"));
            create.addProperty(getService().getProperty("Flowing"));
            create.addProperty(getService().getProperty("ColorMode"));
            create.addProperty(getService().getProperty("Rgb"));
            create.addProperty(getService().getProperty("DelayOff"));
            create.addProperty(getService().getProperty("SaveState"));
            create.addProperty(getService().getProperty("FlowParams"));
            create.addProperty(getService().getProperty("LanMode"));
            create.addProperty(getService().getProperty("onFromPower"));
            create.addProperty(getService().getProperty("MusicEnable"));
            create.addProperty(getService().getProperty("IndicatorOn"));
            MiotManager.getDeviceManipulator().readProperty(create, new C9556d0(this, v0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getRgb(C9594w0 w0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Rgb"), new C9549b(this, w0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getSat(C9596x0 x0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Sat"), new C9564h0(this, x0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getSaveState(C9598y0 y0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "SaveState"), new C9555d(this, y0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getonFromPower(C9600z0 z0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "onFromPower"), new C9561g(this, z0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void openWithMode(C9551b1 b1Var, C9570k0 k0Var, Long l, Long l2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "openWithMode");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("Power", b1Var.toString())) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Effect", k0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Duration", l)) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("Mode", l2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C9579p(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C9575n(this, completionHandler));
                return;
            }
            throw new MiotException("actionInfo is null");
        }
        throw new MiotException("device not configurated connection");
    }

    public void sendCmd(C9568j0 j0Var, String str, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "sendCmd");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("CmdKey", j0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("CmdValue", str)) {
                MiotManager.getDeviceManipulator().invoke(create, new C9593w(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setBright(Long l, C9570k0 k0Var, Long l2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setBright");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("Bright", l)) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Effect", k0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("Duration", l2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C9571l(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C9589u(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C9597y(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setLEDIndicator(C9548a1 a1Var, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setLEDIndicator");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (create.setArgumentValue("IndicatorParams", a1Var.toString())) {
                MiotManager.getDeviceManipulator().invoke(create, new C9595x(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setPower(C9551b1 b1Var, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setPower");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (create.setArgumentValue("Power", b1Var.toString())) {
                MiotManager.getDeviceManipulator().invoke(create, new C9581q(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setRgb(Long l, C9570k0 k0Var, Long l2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setRgb");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("Rgb", l)) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Effect", k0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("Duration", l2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C9583r(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C9577o(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C9550b0(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void subscribeNotifications(CompletionHandler completionHandler, C9554c1 c1Var) {
        if (completionHandler == null) {
            throw new IllegalArgumentException("handler is null");
        } else if (c1Var != null) {
            PropertyInfo create = PropertyInfoFactory.create(getService());
            for (Property next : getService().getProperties()) {
                if (next.getDefinition().isNotifiable()) {
                    create.addProperty(next);
                }
            }
            MiotManager.getDeviceManipulator().addPropertyChangedListener(create, new C9569k(this, completionHandler), new C9591v(this, c1Var));
        } else {
            throw new IllegalArgumentException("listener is null");
        }
    }

    public void toggle(CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "toggle");
            if (create != null) {
                MiotManager.getDeviceManipulator().invoke(create, new C9585s(this, completionHandler));
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
            MiotManager.getDeviceManipulator().removePropertyChangedListener(create, new C9553c0(this, completionHandler));
            return;
        }
        throw new IllegalArgumentException("handler is null");
    }
}
