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

public class Stripe2Service extends AbstractService {
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
    private static final String TAG = "Stripe2Service";
    private AbstractDevice mDevice = null;

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe2Service$a */
    class C9449a implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9477m0 f17396a;

        C9449a(Stripe2Service stripe2Service, C9477m0 m0Var) {
            this.f17396a = m0Var;
        }

        public void onFailed(int i, String str) {
            this.f17396a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("ColorMode");
            if (property.isValueValid()) {
                this.f17396a.mo31158a((Long) propertyInfo.getValue("ColorMode"));
                return;
            }
            C9477m0 m0Var = this.f17396a;
            m0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe2Service$a0 */
    class C9450a0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17397a;

        C9450a0(Stripe2Service stripe2Service, CompletionHandler completionHandler) {
            this.f17397a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17397a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17397a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe2Service$a1 */
    public enum C9451a1 {
        undefined,
        on,
        off
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe2Service$b */
    class C9452b implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9497w0 f17402a;

        C9452b(Stripe2Service stripe2Service, C9497w0 w0Var) {
            this.f17402a = w0Var;
        }

        public void onFailed(int i, String str) {
            this.f17402a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Rgb");
            if (property.isValueValid()) {
                this.f17402a.mo31176a((Long) propertyInfo.getValue("Rgb"));
                return;
            }
            C9497w0 w0Var = this.f17402a;
            w0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe2Service$b0 */
    class C9453b0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17403a;

        C9453b0(Stripe2Service stripe2Service, CompletionHandler completionHandler) {
            this.f17403a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17403a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17403a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe2Service$b1 */
    public enum C9454b1 {
        undefined,
        on,
        off
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe2Service$c */
    class C9455c implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9479n0 f17408a;

        C9455c(Stripe2Service stripe2Service, C9479n0 n0Var) {
            this.f17408a = n0Var;
        }

        public void onFailed(int i, String str) {
            this.f17408a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("DelayOff");
            if (property.isValueValid()) {
                this.f17408a.mo31160a((Long) propertyInfo.getValue("DelayOff"));
                return;
            }
            C9479n0 n0Var = this.f17408a;
            n0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe2Service$c0 */
    class C9456c0 implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17409a;

        C9456c0(Stripe2Service stripe2Service, CompletionHandler completionHandler) {
            this.f17409a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17409a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f17409a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe2Service$c1 */
    public interface C9457c1 {
        /* renamed from: a */
        void mo28251a(Long l);

        /* renamed from: b */
        void mo28252b(Long l);

        /* renamed from: c */
        void mo28253c(Long l);

        /* renamed from: d */
        void mo28254d(Long l);

        /* renamed from: e */
        void mo28255e(String str);

        /* renamed from: f */
        void mo28256f(Long l);

        /* renamed from: g */
        void mo28257g(Long l);

        /* renamed from: i */
        void mo28258i(Long l);

        /* renamed from: j */
        void mo28259j(Long l);

        /* renamed from: k */
        void mo28260k(Long l);

        /* renamed from: l */
        void mo28261l(Long l);

        /* renamed from: m */
        void mo28262m(C9454b1 b1Var);

        /* renamed from: n */
        void mo28263n(Long l);

        /* renamed from: o */
        void mo28264o(Long l);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe2Service$d */
    class C9458d implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9501y0 f17410a;

        C9458d(Stripe2Service stripe2Service, C9501y0 y0Var) {
            this.f17410a = y0Var;
        }

        public void onFailed(int i, String str) {
            this.f17410a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("SaveState");
            if (property.isValueValid()) {
                this.f17410a.mo31180a((Long) propertyInfo.getValue("SaveState"));
                return;
            }
            C9501y0 y0Var = this.f17410a;
            y0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe2Service$d0 */
    class C9459d0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9495v0 f17411a;

        C9459d0(Stripe2Service stripe2Service, C9495v0 v0Var) {
            this.f17411a = v0Var;
        }

        public void onFailed(int i, String str) {
            this.f17411a.onFailed(i, str);
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
                com.yeelight.yeelib.device.xiaomi.Stripe2Service$b1 r1 = com.yeelight.yeelib.device.xiaomi.Stripe2Service.C9454b1.valueOf(r1)
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
                com.yeelight.yeelib.device.xiaomi.Stripe2Service$v0 r4 = r0.f17411a
                r4.mo28249a(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.xiaomi.Stripe2Service.C9459d0.onSucceed(com.miot.common.device.invocation.PropertyInfo):void");
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe2Service$e */
    class C9460e implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9481o0 f17412a;

        C9460e(Stripe2Service stripe2Service, C9481o0 o0Var) {
            this.f17412a = o0Var;
        }

        public void onFailed(int i, String str) {
            this.f17412a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("FlowParams");
            if (property.isValueValid()) {
                this.f17412a.onSucceed((String) propertyInfo.getValue("FlowParams"));
                return;
            }
            C9481o0 o0Var = this.f17412a;
            o0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe2Service$e0 */
    class C9461e0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9493u0 f17413a;

        C9461e0(Stripe2Service stripe2Service, C9493u0 u0Var) {
            this.f17413a = u0Var;
        }

        public void onFailed(int i, String str) {
            this.f17413a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Power");
            if (property.isValueValid()) {
                this.f17413a.mo31174a(C9454b1.valueOf((String) propertyInfo.getValue("Power")));
                return;
            }
            C9493u0 u0Var = this.f17413a;
            u0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe2Service$f */
    class C9462f implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9489s0 f17414a;

        C9462f(Stripe2Service stripe2Service, C9489s0 s0Var) {
            this.f17414a = s0Var;
        }

        public void onFailed(int i, String str) {
            this.f17414a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("LanMode");
            if (property.isValueValid()) {
                this.f17414a.mo31170a((Long) propertyInfo.getValue("LanMode"));
                return;
            }
            C9489s0 s0Var = this.f17414a;
            s0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe2Service$f0 */
    class C9463f0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9475l0 f17415a;

        C9463f0(Stripe2Service stripe2Service, C9475l0 l0Var) {
            this.f17415a = l0Var;
        }

        public void onFailed(int i, String str) {
            this.f17415a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Bright");
            if (property.isValueValid()) {
                this.f17415a.mo31156a((Long) propertyInfo.getValue("Bright"));
                return;
            }
            C9475l0 l0Var = this.f17415a;
            l0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe2Service$g */
    class C9464g implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9503z0 f17416a;

        C9464g(Stripe2Service stripe2Service, C9503z0 z0Var) {
            this.f17416a = z0Var;
        }

        public void onFailed(int i, String str) {
            this.f17416a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("onFromPower");
            if (property.isValueValid()) {
                this.f17416a.mo31182a((Long) propertyInfo.getValue("onFromPower"));
                return;
            }
            C9503z0 z0Var = this.f17416a;
            z0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe2Service$g0 */
    class C9465g0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9485q0 f17417a;

        C9465g0(Stripe2Service stripe2Service, C9485q0 q0Var) {
            this.f17417a = q0Var;
        }

        public void onFailed(int i, String str) {
            this.f17417a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Hue");
            if (property.isValueValid()) {
                this.f17417a.mo31166a((Long) propertyInfo.getValue("Hue"));
                return;
            }
            C9485q0 q0Var = this.f17417a;
            q0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe2Service$h */
    class C9466h implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9491t0 f17418a;

        C9466h(Stripe2Service stripe2Service, C9491t0 t0Var) {
            this.f17418a = t0Var;
        }

        public void onFailed(int i, String str) {
            this.f17418a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("MusicEnable");
            if (property.isValueValid()) {
                this.f17418a.mo31172a((Long) propertyInfo.getValue("MusicEnable"));
                return;
            }
            C9491t0 t0Var = this.f17418a;
            t0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe2Service$h0 */
    class C9467h0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9499x0 f17419a;

        C9467h0(Stripe2Service stripe2Service, C9499x0 x0Var) {
            this.f17419a = x0Var;
        }

        public void onFailed(int i, String str) {
            this.f17419a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Sat");
            if (property.isValueValid()) {
                this.f17419a.mo31178a((Long) propertyInfo.getValue("Sat"));
                return;
            }
            C9499x0 x0Var = this.f17419a;
            x0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe2Service$i */
    class C9468i implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9487r0 f17420a;

        C9468i(Stripe2Service stripe2Service, C9487r0 r0Var) {
            this.f17420a = r0Var;
        }

        public void onFailed(int i, String str) {
            this.f17420a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("IndicatorOn");
            if (property.isValueValid()) {
                this.f17420a.mo31168a((Long) propertyInfo.getValue("IndicatorOn"));
                return;
            }
            C9487r0 r0Var = this.f17420a;
            r0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe2Service$i0 */
    class C9469i0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9483p0 f17421a;

        C9469i0(Stripe2Service stripe2Service, C9483p0 p0Var) {
            this.f17421a = p0Var;
        }

        public void onFailed(int i, String str) {
            this.f17421a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Flowing");
            if (property.isValueValid()) {
                this.f17421a.mo31164a((Long) propertyInfo.getValue("Flowing"));
                return;
            }
            C9483p0 p0Var = this.f17421a;
            p0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe2Service$j */
    class C9470j implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17422a;

        C9470j(Stripe2Service stripe2Service, CompletionHandler completionHandler) {
            this.f17422a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17422a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17422a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe2Service$j0 */
    public enum C9471j0 {
        undefined,
        cfg_pomodoro,
        cfg_lan_ctrl,
        cfg_save_state,
        cfg_init_power
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe2Service$k */
    class C9472k implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17429a;

        C9472k(Stripe2Service stripe2Service, CompletionHandler completionHandler) {
            this.f17429a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17429a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f17429a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe2Service$k0 */
    public enum C9473k0 {
        undefined,
        smooth,
        sudden
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe2Service$l */
    class C9474l implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17434a;

        C9474l(Stripe2Service stripe2Service, CompletionHandler completionHandler) {
            this.f17434a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17434a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17434a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe2Service$l0 */
    public interface C9475l0 {
        /* renamed from: a */
        void mo31156a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe2Service$m */
    class C9476m implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17435a;

        C9476m(Stripe2Service stripe2Service, CompletionHandler completionHandler) {
            this.f17435a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17435a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17435a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe2Service$m0 */
    public interface C9477m0 {
        /* renamed from: a */
        void mo31158a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe2Service$n */
    class C9478n implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17436a;

        C9478n(Stripe2Service stripe2Service, CompletionHandler completionHandler) {
            this.f17436a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17436a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17436a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe2Service$n0 */
    public interface C9479n0 {
        /* renamed from: a */
        void mo31160a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe2Service$o */
    class C9480o implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17437a;

        C9480o(Stripe2Service stripe2Service, CompletionHandler completionHandler) {
            this.f17437a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17437a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17437a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe2Service$o0 */
    public interface C9481o0 {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe2Service$p */
    class C9482p implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17438a;

        C9482p(Stripe2Service stripe2Service, CompletionHandler completionHandler) {
            this.f17438a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17438a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17438a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe2Service$p0 */
    public interface C9483p0 {
        /* renamed from: a */
        void mo31164a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe2Service$q */
    class C9484q implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17439a;

        C9484q(Stripe2Service stripe2Service, CompletionHandler completionHandler) {
            this.f17439a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17439a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17439a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe2Service$q0 */
    public interface C9485q0 {
        /* renamed from: a */
        void mo31166a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe2Service$r */
    class C9486r implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17440a;

        C9486r(Stripe2Service stripe2Service, CompletionHandler completionHandler) {
            this.f17440a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17440a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17440a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe2Service$r0 */
    public interface C9487r0 {
        /* renamed from: a */
        void mo31168a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe2Service$s */
    class C9488s implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17441a;

        C9488s(Stripe2Service stripe2Service, CompletionHandler completionHandler) {
            this.f17441a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17441a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17441a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe2Service$s0 */
    public interface C9489s0 {
        /* renamed from: a */
        void mo31170a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe2Service$t */
    class C9490t implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17442a;

        C9490t(Stripe2Service stripe2Service, CompletionHandler completionHandler) {
            this.f17442a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17442a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17442a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe2Service$t0 */
    public interface C9491t0 {
        /* renamed from: a */
        void mo31172a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe2Service$u */
    class C9492u implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17443a;

        C9492u(Stripe2Service stripe2Service, CompletionHandler completionHandler) {
            this.f17443a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17443a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17443a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe2Service$u0 */
    public interface C9493u0 {
        /* renamed from: a */
        void mo31174a(C9454b1 b1Var);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe2Service$v */
    class C9494v implements DeviceManipulator.PropertyChangedListener {

        /* renamed from: a */
        final /* synthetic */ C9457c1 f17444a;

        C9494v(Stripe2Service stripe2Service, C9457c1 c1Var) {
            this.f17444a = c1Var;
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
                com.yeelight.yeelib.device.xiaomi.Stripe2Service$c1 r1 = r3.f17444a
                r1.mo28258i(r0)
                goto L_0x0226
            L_0x00c7:
                r3 = r16
                r1 = r17
                com.miot.common.property.Property r0 = r1.getProperty(r15)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0226
                java.lang.Object r0 = r1.getValue(r15)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Stripe2Service$c1 r1 = r3.f17444a
                r1.mo28264o(r0)
                goto L_0x0226
            L_0x00e2:
                r3 = r16
                r1 = r17
                com.miot.common.property.Property r0 = r1.getProperty(r10)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0226
                java.lang.Object r0 = r1.getValue(r10)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Stripe2Service$c1 r1 = r3.f17444a
                r1.mo28256f(r0)
                goto L_0x0226
            L_0x00fd:
                r3 = r16
                r1 = r17
                com.miot.common.property.Property r0 = r1.getProperty(r5)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0226
                java.lang.Object r0 = r1.getValue(r5)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Stripe2Service$c1 r1 = r3.f17444a
                r1.mo28257g(r0)
                goto L_0x0226
            L_0x0118:
                r3 = r16
                r1 = r17
                com.miot.common.property.Property r2 = r1.getProperty(r0)
                boolean r2 = r2.isValueValid()
                if (r2 == 0) goto L_0x0226
                java.lang.Object r0 = r1.getValue(r0)
                java.lang.String r0 = (java.lang.String) r0
                com.yeelight.yeelib.device.xiaomi.Stripe2Service$c1 r1 = r3.f17444a
                r1.mo28255e(r0)
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
                com.yeelight.yeelib.device.xiaomi.Stripe2Service$c1 r1 = r3.f17444a
                r1.mo28254d(r0)
                goto L_0x0226
            L_0x014f:
                r3 = r16
                r1 = r17
                com.miot.common.property.Property r0 = r1.getProperty(r7)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0226
                java.lang.Object r0 = r1.getValue(r7)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Stripe2Service$c1 r1 = r3.f17444a
                r1.mo28252b(r0)
                goto L_0x0226
            L_0x016a:
                r3 = r16
                r1 = r17
                com.miot.common.property.Property r0 = r1.getProperty(r12)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0226
                java.lang.Object r0 = r1.getValue(r12)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Stripe2Service$c1 r1 = r3.f17444a
                r1.mo28259j(r0)
                goto L_0x0226
            L_0x0185:
                r3 = r16
                r1 = r17
                com.miot.common.property.Property r0 = r1.getProperty(r14)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0226
                java.lang.Object r0 = r1.getValue(r14)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Stripe2Service$c1 r1 = r3.f17444a
                r1.mo28261l(r0)
                goto L_0x0226
            L_0x01a0:
                r3 = r16
                r1 = r17
                com.miot.common.property.Property r0 = r1.getProperty(r6)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0226
                java.lang.Object r0 = r1.getValue(r6)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Stripe2Service$c1 r1 = r3.f17444a
                r1.mo28253c(r0)
                goto L_0x0226
            L_0x01bb:
                r3 = r16
                r1 = r17
                com.miot.common.property.Property r0 = r1.getProperty(r11)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0226
                java.lang.Object r0 = r1.getValue(r11)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Stripe2Service$c1 r1 = r3.f17444a
                r1.mo28260k(r0)
                goto L_0x0226
            L_0x01d5:
                r3 = r16
                r1 = r17
                com.miot.common.property.Property r0 = r1.getProperty(r13)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0226
                java.lang.Object r0 = r1.getValue(r13)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Stripe2Service$c1 r1 = r3.f17444a
                r1.mo28263n(r0)
                goto L_0x0226
            L_0x01ef:
                r3 = r16
                r1 = r17
                com.miot.common.property.Property r0 = r1.getProperty(r4)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0226
                java.lang.Object r0 = r1.getValue(r4)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Stripe2Service$c1 r1 = r3.f17444a
                r1.mo28251a(r0)
                goto L_0x0226
            L_0x0209:
                r3 = r16
                r1 = r17
                com.miot.common.property.Property r0 = r1.getProperty(r9)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0226
                java.lang.Object r0 = r1.getValue(r9)
                java.lang.String r0 = (java.lang.String) r0
                com.yeelight.yeelib.device.xiaomi.Stripe2Service$b1 r0 = com.yeelight.yeelib.device.xiaomi.Stripe2Service.C9454b1.valueOf(r0)
                com.yeelight.yeelib.device.xiaomi.Stripe2Service$c1 r1 = r3.f17444a
                r1.mo28262m(r0)
            L_0x0226:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.xiaomi.Stripe2Service.C9494v.onPropertyChanged(com.miot.common.device.invocation.PropertyInfo, java.lang.String):void");
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe2Service$v0 */
    public interface C9495v0 {
        /* renamed from: a */
        void mo28249a(C9454b1 b1Var, Long l, Long l2, Long l3, Long l4, Long l5, Long l6, Long l7, Long l8, String str, Long l9, Long l10, Long l11, Long l12);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe2Service$w */
    class C9496w implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17445a;

        C9496w(Stripe2Service stripe2Service, CompletionHandler completionHandler) {
            this.f17445a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17445a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17445a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe2Service$w0 */
    public interface C9497w0 {
        /* renamed from: a */
        void mo31176a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe2Service$x */
    class C9498x implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17446a;

        C9498x(Stripe2Service stripe2Service, CompletionHandler completionHandler) {
            this.f17446a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17446a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17446a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe2Service$x0 */
    public interface C9499x0 {
        /* renamed from: a */
        void mo31178a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe2Service$y */
    class C9500y implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17447a;

        C9500y(Stripe2Service stripe2Service, CompletionHandler completionHandler) {
            this.f17447a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17447a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17447a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe2Service$y0 */
    public interface C9501y0 {
        /* renamed from: a */
        void mo31180a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe2Service$z */
    class C9502z implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17448a;

        C9502z(Stripe2Service stripe2Service, CompletionHandler completionHandler) {
            this.f17448a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17448a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17448a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe2Service$z0 */
    public interface C9503z0 {
        /* renamed from: a */
        void mo31182a(Long l);

        void onFailed(int i, String str);
    }

    public Stripe2Service(AbstractDevice abstractDevice) {
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
                MiotManager.getDeviceManipulator().invoke(create, new C9490t(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C9476m(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C9470j(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C9450a0(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getBright(C9475l0 l0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Bright"), new C9463f0(this, l0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getColorMode(C9477m0 m0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "ColorMode"), new C9449a(this, m0Var));
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
                MiotManager.getDeviceManipulator().invoke(create, new C9502z(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getDelayOff(C9479n0 n0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "DelayOff"), new C9455c(this, n0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowParams(C9481o0 o0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "FlowParams"), new C9460e(this, o0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowing(C9483p0 p0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Flowing"), new C9469i0(this, p0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getHue(C9485q0 q0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Hue"), new C9465g0(this, q0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getIndicatorOn(C9487r0 r0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "IndicatorOn"), new C9468i(this, r0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getLanMode(C9489s0 s0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "LanMode"), new C9462f(this, s0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getMusicEnable(C9491t0 t0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "MusicEnable"), new C9466h(this, t0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getPower(C9493u0 u0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Power"), new C9461e0(this, u0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getProperties(C9495v0 v0Var) {
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
            MiotManager.getDeviceManipulator().readProperty(create, new C9459d0(this, v0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getRgb(C9497w0 w0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Rgb"), new C9452b(this, w0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getSat(C9499x0 x0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Sat"), new C9467h0(this, x0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getSaveState(C9501y0 y0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "SaveState"), new C9458d(this, y0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getonFromPower(C9503z0 z0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "onFromPower"), new C9464g(this, z0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void openWithMode(C9454b1 b1Var, C9473k0 k0Var, Long l, Long l2, CompletionHandler completionHandler) {
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
                MiotManager.getDeviceManipulator().invoke(create, new C9482p(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C9478n(this, completionHandler));
                return;
            }
            throw new MiotException("actionInfo is null");
        }
        throw new MiotException("device not configurated connection");
    }

    public void sendCmd(C9471j0 j0Var, String str, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "sendCmd");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("CmdKey", j0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("CmdValue", str)) {
                MiotManager.getDeviceManipulator().invoke(create, new C9496w(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setBright(Long l, C9473k0 k0Var, Long l2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setBright");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("Bright", l)) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Effect", k0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("Duration", l2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C9474l(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C9492u(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C9500y(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setLEDIndicator(C9451a1 a1Var, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setLEDIndicator");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (create.setArgumentValue("IndicatorParams", a1Var.toString())) {
                MiotManager.getDeviceManipulator().invoke(create, new C9498x(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setPower(C9454b1 b1Var, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setPower");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (create.setArgumentValue("Power", b1Var.toString())) {
                MiotManager.getDeviceManipulator().invoke(create, new C9484q(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setRgb(Long l, C9473k0 k0Var, Long l2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setRgb");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("Rgb", l)) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Effect", k0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("Duration", l2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C9486r(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C9480o(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C9453b0(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void subscribeNotifications(CompletionHandler completionHandler, C9457c1 c1Var) {
        if (completionHandler == null) {
            throw new IllegalArgumentException("handler is null");
        } else if (c1Var != null) {
            PropertyInfo create = PropertyInfoFactory.create(getService());
            for (Property next : getService().getProperties()) {
                if (next.getDefinition().isNotifiable()) {
                    create.addProperty(next);
                }
            }
            MiotManager.getDeviceManipulator().addPropertyChangedListener(create, new C9472k(this, completionHandler), new C9494v(this, c1Var));
        } else {
            throw new IllegalArgumentException("listener is null");
        }
    }

    public void toggle(CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "toggle");
            if (create != null) {
                MiotManager.getDeviceManipulator().invoke(create, new C9488s(this, completionHandler));
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
            MiotManager.getDeviceManipulator().removePropertyChangedListener(create, new C9456c0(this, completionHandler));
            return;
        }
        throw new IllegalArgumentException("handler is null");
    }
}
