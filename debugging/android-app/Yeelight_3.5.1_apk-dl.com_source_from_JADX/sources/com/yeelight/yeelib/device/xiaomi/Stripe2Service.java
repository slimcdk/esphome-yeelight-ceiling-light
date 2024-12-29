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

    public enum CmdKey {
        undefined,
        cfg_pomodoro,
        cfg_lan_ctrl,
        cfg_save_state,
        cfg_init_power
    }

    public enum Effect {
        undefined,
        smooth,
        sudden
    }

    public enum IndicatorParams {
        undefined,
        on,
        off
    }

    public enum Power {
        undefined,
        on,
        off
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe2Service$a */
    class C7954a implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7975k0 f13964a;

        C7954a(Stripe2Service stripe2Service, C7975k0 k0Var) {
            this.f13964a = k0Var;
        }

        public void onFailed(int i, String str) {
            this.f13964a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("ColorMode");
            if (property.isValueValid()) {
                this.f13964a.mo34632a((Long) propertyInfo.getValue("ColorMode"));
                return;
            }
            C7975k0 k0Var = this.f13964a;
            k0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe2Service$a0 */
    class C7955a0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13965a;

        C7955a0(Stripe2Service stripe2Service, CompletionHandler completionHandler) {
            this.f13965a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13965a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13965a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe2Service$b */
    class C7956b implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7995u0 f13966a;

        C7956b(Stripe2Service stripe2Service, C7995u0 u0Var) {
            this.f13966a = u0Var;
        }

        public void onFailed(int i, String str) {
            this.f13966a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Rgb");
            if (property.isValueValid()) {
                this.f13966a.mo34652a((Long) propertyInfo.getValue("Rgb"));
                return;
            }
            C7995u0 u0Var = this.f13966a;
            u0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe2Service$b0 */
    class C7957b0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13967a;

        C7957b0(Stripe2Service stripe2Service, CompletionHandler completionHandler) {
            this.f13967a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13967a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13967a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe2Service$c */
    class C7958c implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7977l0 f13968a;

        C7958c(Stripe2Service stripe2Service, C7977l0 l0Var) {
            this.f13968a = l0Var;
        }

        public void onFailed(int i, String str) {
            this.f13968a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("DelayOff");
            if (property.isValueValid()) {
                this.f13968a.mo34634a((Long) propertyInfo.getValue("DelayOff"));
                return;
            }
            C7977l0 l0Var = this.f13968a;
            l0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe2Service$c0 */
    class C7959c0 implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13969a;

        C7959c0(Stripe2Service stripe2Service, CompletionHandler completionHandler) {
            this.f13969a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13969a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f13969a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe2Service$d */
    class C7960d implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7999w0 f13970a;

        C7960d(Stripe2Service stripe2Service, C7999w0 w0Var) {
            this.f13970a = w0Var;
        }

        public void onFailed(int i, String str) {
            this.f13970a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("SaveState");
            if (property.isValueValid()) {
                this.f13970a.mo34656a((Long) propertyInfo.getValue("SaveState"));
                return;
            }
            C7999w0 w0Var = this.f13970a;
            w0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe2Service$d0 */
    class C7961d0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7993t0 f13971a;

        C7961d0(Stripe2Service stripe2Service, C7993t0 t0Var) {
            this.f13971a = t0Var;
        }

        public void onFailed(int i, String str) {
            this.f13971a.onFailed(i, str);
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
                com.yeelight.yeelib.device.xiaomi.Stripe2Service$Power r1 = com.yeelight.yeelib.device.xiaomi.Stripe2Service.Power.valueOf(r1)
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
                com.yeelight.yeelib.device.xiaomi.Stripe2Service$t0 r4 = r0.f13971a
                r4.mo34650a(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.xiaomi.Stripe2Service.C7961d0.onSucceed(com.miot.common.device.invocation.PropertyInfo):void");
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe2Service$e */
    class C7962e implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7979m0 f13972a;

        C7962e(Stripe2Service stripe2Service, C7979m0 m0Var) {
            this.f13972a = m0Var;
        }

        public void onFailed(int i, String str) {
            this.f13972a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("FlowParams");
            if (property.isValueValid()) {
                this.f13972a.onSucceed((String) propertyInfo.getValue("FlowParams"));
                return;
            }
            C7979m0 m0Var = this.f13972a;
            m0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe2Service$e0 */
    class C7963e0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7991s0 f13973a;

        C7963e0(Stripe2Service stripe2Service, C7991s0 s0Var) {
            this.f13973a = s0Var;
        }

        public void onFailed(int i, String str) {
            this.f13973a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Power");
            if (property.isValueValid()) {
                this.f13973a.mo34648a(Power.valueOf((String) propertyInfo.getValue("Power")));
                return;
            }
            C7991s0 s0Var = this.f13973a;
            s0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe2Service$f */
    class C7964f implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7987q0 f13974a;

        C7964f(Stripe2Service stripe2Service, C7987q0 q0Var) {
            this.f13974a = q0Var;
        }

        public void onFailed(int i, String str) {
            this.f13974a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("LanMode");
            if (property.isValueValid()) {
                this.f13974a.mo34644a((Long) propertyInfo.getValue("LanMode"));
                return;
            }
            C7987q0 q0Var = this.f13974a;
            q0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe2Service$f0 */
    class C7965f0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7973j0 f13975a;

        C7965f0(Stripe2Service stripe2Service, C7973j0 j0Var) {
            this.f13975a = j0Var;
        }

        public void onFailed(int i, String str) {
            this.f13975a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Bright");
            if (property.isValueValid()) {
                this.f13975a.mo34630a((Long) propertyInfo.getValue("Bright"));
                return;
            }
            C7973j0 j0Var = this.f13975a;
            j0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe2Service$g */
    class C7966g implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8001x0 f13976a;

        C7966g(Stripe2Service stripe2Service, C8001x0 x0Var) {
            this.f13976a = x0Var;
        }

        public void onFailed(int i, String str) {
            this.f13976a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("onFromPower");
            if (property.isValueValid()) {
                this.f13976a.mo34658a((Long) propertyInfo.getValue("onFromPower"));
                return;
            }
            C8001x0 x0Var = this.f13976a;
            x0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe2Service$g0 */
    class C7967g0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7983o0 f13977a;

        C7967g0(Stripe2Service stripe2Service, C7983o0 o0Var) {
            this.f13977a = o0Var;
        }

        public void onFailed(int i, String str) {
            this.f13977a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Hue");
            if (property.isValueValid()) {
                this.f13977a.mo34640a((Long) propertyInfo.getValue("Hue"));
                return;
            }
            C7983o0 o0Var = this.f13977a;
            o0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe2Service$h */
    class C7968h implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7989r0 f13978a;

        C7968h(Stripe2Service stripe2Service, C7989r0 r0Var) {
            this.f13978a = r0Var;
        }

        public void onFailed(int i, String str) {
            this.f13978a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("MusicEnable");
            if (property.isValueValid()) {
                this.f13978a.mo34646a((Long) propertyInfo.getValue("MusicEnable"));
                return;
            }
            C7989r0 r0Var = this.f13978a;
            r0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe2Service$h0 */
    class C7969h0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7997v0 f13979a;

        C7969h0(Stripe2Service stripe2Service, C7997v0 v0Var) {
            this.f13979a = v0Var;
        }

        public void onFailed(int i, String str) {
            this.f13979a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Sat");
            if (property.isValueValid()) {
                this.f13979a.mo34654a((Long) propertyInfo.getValue("Sat"));
                return;
            }
            C7997v0 v0Var = this.f13979a;
            v0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe2Service$i */
    class C7970i implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7985p0 f13980a;

        C7970i(Stripe2Service stripe2Service, C7985p0 p0Var) {
            this.f13980a = p0Var;
        }

        public void onFailed(int i, String str) {
            this.f13980a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("IndicatorOn");
            if (property.isValueValid()) {
                this.f13980a.mo34642a((Long) propertyInfo.getValue("IndicatorOn"));
                return;
            }
            C7985p0 p0Var = this.f13980a;
            p0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe2Service$i0 */
    class C7971i0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7981n0 f13981a;

        C7971i0(Stripe2Service stripe2Service, C7981n0 n0Var) {
            this.f13981a = n0Var;
        }

        public void onFailed(int i, String str) {
            this.f13981a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Flowing");
            if (property.isValueValid()) {
                this.f13981a.mo34638a((Long) propertyInfo.getValue("Flowing"));
                return;
            }
            C7981n0 n0Var = this.f13981a;
            n0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe2Service$j */
    class C7972j implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13982a;

        C7972j(Stripe2Service stripe2Service, CompletionHandler completionHandler) {
            this.f13982a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13982a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13982a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe2Service$j0 */
    public interface C7973j0 {
        /* renamed from: a */
        void mo34630a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe2Service$k */
    class C7974k implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13983a;

        C7974k(Stripe2Service stripe2Service, CompletionHandler completionHandler) {
            this.f13983a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13983a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f13983a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe2Service$k0 */
    public interface C7975k0 {
        /* renamed from: a */
        void mo34632a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe2Service$l */
    class C7976l implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13984a;

        C7976l(Stripe2Service stripe2Service, CompletionHandler completionHandler) {
            this.f13984a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13984a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13984a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe2Service$l0 */
    public interface C7977l0 {
        /* renamed from: a */
        void mo34634a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe2Service$m */
    class C7978m implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13985a;

        C7978m(Stripe2Service stripe2Service, CompletionHandler completionHandler) {
            this.f13985a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13985a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13985a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe2Service$m0 */
    public interface C7979m0 {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe2Service$n */
    class C7980n implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13986a;

        C7980n(Stripe2Service stripe2Service, CompletionHandler completionHandler) {
            this.f13986a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13986a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13986a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe2Service$n0 */
    public interface C7981n0 {
        /* renamed from: a */
        void mo34638a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe2Service$o */
    class C7982o implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13987a;

        C7982o(Stripe2Service stripe2Service, CompletionHandler completionHandler) {
            this.f13987a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13987a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13987a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe2Service$o0 */
    public interface C7983o0 {
        /* renamed from: a */
        void mo34640a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe2Service$p */
    class C7984p implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13988a;

        C7984p(Stripe2Service stripe2Service, CompletionHandler completionHandler) {
            this.f13988a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13988a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13988a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe2Service$p0 */
    public interface C7985p0 {
        /* renamed from: a */
        void mo34642a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe2Service$q */
    class C7986q implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13989a;

        C7986q(Stripe2Service stripe2Service, CompletionHandler completionHandler) {
            this.f13989a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13989a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13989a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe2Service$q0 */
    public interface C7987q0 {
        /* renamed from: a */
        void mo34644a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe2Service$r */
    class C7988r implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13990a;

        C7988r(Stripe2Service stripe2Service, CompletionHandler completionHandler) {
            this.f13990a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13990a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13990a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe2Service$r0 */
    public interface C7989r0 {
        /* renamed from: a */
        void mo34646a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe2Service$s */
    class C7990s implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13991a;

        C7990s(Stripe2Service stripe2Service, CompletionHandler completionHandler) {
            this.f13991a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13991a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13991a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe2Service$s0 */
    public interface C7991s0 {
        /* renamed from: a */
        void mo34648a(Power power);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe2Service$t */
    class C7992t implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13992a;

        C7992t(Stripe2Service stripe2Service, CompletionHandler completionHandler) {
            this.f13992a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13992a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13992a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe2Service$t0 */
    public interface C7993t0 {
        /* renamed from: a */
        void mo34650a(Power power, Long l, Long l2, Long l3, Long l4, Long l5, Long l6, Long l7, Long l8, String str, Long l9, Long l10, Long l11, Long l12);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe2Service$u */
    class C7994u implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13993a;

        C7994u(Stripe2Service stripe2Service, CompletionHandler completionHandler) {
            this.f13993a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13993a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13993a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe2Service$u0 */
    public interface C7995u0 {
        /* renamed from: a */
        void mo34652a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe2Service$v */
    class C7996v implements DeviceManipulator.PropertyChangedListener {

        /* renamed from: a */
        final /* synthetic */ C8003y0 f13994a;

        C7996v(Stripe2Service stripe2Service, C8003y0 y0Var) {
            this.f13994a = y0Var;
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
                case -1787381784:
                    if (str2.equals("MusicEnable")) {
                        c = 2;
                        break;
                    }
                    break;
                case -310275194:
                    if (str2.equals("ColorMode")) {
                        c = 3;
                        break;
                    }
                    break;
                case 72920:
                    if (str2.equals("Hue")) {
                        c = 4;
                        break;
                    }
                    break;
                case 82093:
                    if (str2.equals("Rgb")) {
                        c = 5;
                        break;
                    }
                    break;
                case 82886:
                    if (str2.equals("Sat")) {
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
                case 335685678:
                    if (str2.equals("IndicatorOn")) {
                        c = 9;
                        break;
                    }
                    break;
                case 880790796:
                    if (str2.equals("DelayOff")) {
                        c = 10;
                        break;
                    }
                    break;
                case 898856916:
                    if (str2.equals("Flowing")) {
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
                        this.f13994a.mo34662c((Long) propertyInfo3.getValue(str3));
                        return;
                    }
                    return;
                case 1:
                    String str4 = "FlowParams";
                    PropertyInfo propertyInfo4 = propertyInfo;
                    if (propertyInfo4.getProperty(str4).isValueValid()) {
                        this.f13994a.mo34664e((String) propertyInfo4.getValue(str4));
                        return;
                    }
                    return;
                case 2:
                    PropertyInfo propertyInfo5 = propertyInfo;
                    if (propertyInfo5.getProperty("MusicEnable").isValueValid()) {
                        this.f13994a.mo34671m((Long) propertyInfo5.getValue("MusicEnable"));
                        return;
                    }
                    return;
                case 3:
                    PropertyInfo propertyInfo6 = propertyInfo;
                    if (propertyInfo6.getProperty("ColorMode").isValueValid()) {
                        this.f13994a.mo34670l((Long) propertyInfo6.getValue("ColorMode"));
                        return;
                    }
                    return;
                case 4:
                    PropertyInfo propertyInfo7 = propertyInfo;
                    if (propertyInfo7.getProperty("Hue").isValueValid()) {
                        this.f13994a.mo34672n((Long) propertyInfo7.getValue("Hue"));
                        return;
                    }
                    return;
                case 5:
                    PropertyInfo propertyInfo8 = propertyInfo;
                    if (propertyInfo8.getProperty("Rgb").isValueValid()) {
                        this.f13994a.mo34668j((Long) propertyInfo8.getValue("Rgb"));
                        return;
                    }
                    return;
                case 6:
                    PropertyInfo propertyInfo9 = propertyInfo;
                    if (propertyInfo9.getProperty("Sat").isValueValid()) {
                        this.f13994a.mo34669k((Long) propertyInfo9.getValue("Sat"));
                        return;
                    }
                    return;
                case 7:
                    PropertyInfo propertyInfo10 = propertyInfo;
                    if (propertyInfo10.getProperty("onFromPower").isValueValid()) {
                        this.f13994a.mo34665f((Long) propertyInfo10.getValue("onFromPower"));
                        return;
                    }
                    return;
                case 8:
                    PropertyInfo propertyInfo11 = propertyInfo;
                    if (propertyInfo11.getProperty("Power").isValueValid()) {
                        this.f13994a.mo34673o(Power.valueOf((String) propertyInfo11.getValue("Power")));
                        return;
                    }
                    return;
                case 9:
                    PropertyInfo propertyInfo12 = propertyInfo;
                    if (propertyInfo12.getProperty("IndicatorOn").isValueValid()) {
                        this.f13994a.mo34667i((Long) propertyInfo12.getValue("IndicatorOn"));
                        return;
                    }
                    return;
                case 10:
                    PropertyInfo propertyInfo13 = propertyInfo;
                    if (propertyInfo13.getProperty("DelayOff").isValueValid()) {
                        this.f13994a.mo34661b((Long) propertyInfo13.getValue("DelayOff"));
                        return;
                    }
                    return;
                case 11:
                    PropertyInfo propertyInfo14 = propertyInfo;
                    if (propertyInfo14.getProperty("Flowing").isValueValid()) {
                        this.f13994a.mo34663d((Long) propertyInfo14.getValue("Flowing"));
                        return;
                    }
                    return;
                case 12:
                    PropertyInfo propertyInfo15 = propertyInfo;
                    if (propertyInfo15.getProperty("LanMode").isValueValid()) {
                        this.f13994a.mo34666g((Long) propertyInfo15.getValue("LanMode"));
                        return;
                    }
                    return;
                case 13:
                    PropertyInfo propertyInfo16 = propertyInfo;
                    if (propertyInfo16.getProperty("Bright").isValueValid()) {
                        this.f13994a.mo34660a((Long) propertyInfo16.getValue("Bright"));
                        return;
                    }
                    break;
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe2Service$v0 */
    public interface C7997v0 {
        /* renamed from: a */
        void mo34654a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe2Service$w */
    class C7998w implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13995a;

        C7998w(Stripe2Service stripe2Service, CompletionHandler completionHandler) {
            this.f13995a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13995a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13995a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe2Service$w0 */
    public interface C7999w0 {
        /* renamed from: a */
        void mo34656a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe2Service$x */
    class C8000x implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13996a;

        C8000x(Stripe2Service stripe2Service, CompletionHandler completionHandler) {
            this.f13996a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13996a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13996a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe2Service$x0 */
    public interface C8001x0 {
        /* renamed from: a */
        void mo34658a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe2Service$y */
    class C8002y implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13997a;

        C8002y(Stripe2Service stripe2Service, CompletionHandler completionHandler) {
            this.f13997a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13997a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13997a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe2Service$y0 */
    public interface C8003y0 {
        /* renamed from: a */
        void mo34660a(Long l);

        /* renamed from: b */
        void mo34661b(Long l);

        /* renamed from: c */
        void mo34662c(Long l);

        /* renamed from: d */
        void mo34663d(Long l);

        /* renamed from: e */
        void mo34664e(String str);

        /* renamed from: f */
        void mo34665f(Long l);

        /* renamed from: g */
        void mo34666g(Long l);

        /* renamed from: i */
        void mo34667i(Long l);

        /* renamed from: j */
        void mo34668j(Long l);

        /* renamed from: k */
        void mo34669k(Long l);

        /* renamed from: l */
        void mo34670l(Long l);

        /* renamed from: m */
        void mo34671m(Long l);

        /* renamed from: n */
        void mo34672n(Long l);

        /* renamed from: o */
        void mo34673o(Power power);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe2Service$z */
    class C8004z implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13998a;

        C8004z(Stripe2Service stripe2Service, CompletionHandler completionHandler) {
            this.f13998a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13998a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13998a.onSucceed();
        }
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
                MiotManager.getDeviceManipulator().invoke(create, new C7992t(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7978m(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7972j(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7955a0(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getBright(C7973j0 j0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Bright"), new C7965f0(this, j0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getColorMode(C7975k0 k0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "ColorMode"), new C7954a(this, k0Var));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8004z(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getDelayOff(C7977l0 l0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "DelayOff"), new C7958c(this, l0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowParams(C7979m0 m0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "FlowParams"), new C7962e(this, m0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowing(C7981n0 n0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Flowing"), new C7971i0(this, n0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getHue(C7983o0 o0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Hue"), new C7967g0(this, o0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getIndicatorOn(C7985p0 p0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "IndicatorOn"), new C7970i(this, p0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getLanMode(C7987q0 q0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "LanMode"), new C7964f(this, q0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getMusicEnable(C7989r0 r0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "MusicEnable"), new C7968h(this, r0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getPower(C7991s0 s0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Power"), new C7963e0(this, s0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getProperties(C7993t0 t0Var) {
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
            MiotManager.getDeviceManipulator().readProperty(create, new C7961d0(this, t0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getRgb(C7995u0 u0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Rgb"), new C7956b(this, u0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getSat(C7997v0 v0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Sat"), new C7969h0(this, v0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getSaveState(C7999w0 w0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "SaveState"), new C7960d(this, w0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getonFromPower(C8001x0 x0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "onFromPower"), new C7966g(this, x0Var));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7984p(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7980n(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7998w(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7976l(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7994u(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8002y(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setLEDIndicator(IndicatorParams indicatorParams, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setLEDIndicator");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (create.setArgumentValue("IndicatorParams", indicatorParams.toString())) {
                MiotManager.getDeviceManipulator().invoke(create, new C8000x(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7986q(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7988r(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7982o(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7957b0(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void subscribeNotifications(CompletionHandler completionHandler, C8003y0 y0Var) {
        if (completionHandler == null) {
            throw new IllegalArgumentException("handler is null");
        } else if (y0Var != null) {
            PropertyInfo create = PropertyInfoFactory.create(getService());
            for (Property next : getService().getProperties()) {
                if (next.getDefinition().isNotifiable()) {
                    create.addProperty(next);
                }
            }
            MiotManager.getDeviceManipulator().addPropertyChangedListener(create, new C7974k(this, completionHandler), new C7996v(this, y0Var));
        } else {
            throw new IllegalArgumentException("listener is null");
        }
    }

    public void toggle(CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "toggle");
            if (create != null) {
                MiotManager.getDeviceManipulator().invoke(create, new C7990s(this, completionHandler));
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
            MiotManager.getDeviceManipulator().removePropertyChangedListener(create, new C7959c0(this, completionHandler));
            return;
        }
        throw new IllegalArgumentException("handler is null");
    }
}
