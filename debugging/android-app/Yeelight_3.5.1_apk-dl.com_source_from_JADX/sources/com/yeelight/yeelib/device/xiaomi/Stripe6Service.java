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

    public enum CmdKey {
        undefined,
        cfg_pomodoro,
        cfg_lan_ctrl,
        cfg_save_state,
        cfg_init_power,
        pseudo_beacon
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

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe6Service$a */
    class C8044a implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8065k0 f14029a;

        C8044a(Stripe6Service stripe6Service, C8065k0 k0Var) {
            this.f14029a = k0Var;
        }

        public void onFailed(int i, String str) {
            this.f14029a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("ColorMode");
            if (property.isValueValid()) {
                this.f14029a.mo34768a((Long) propertyInfo.getValue("ColorMode"));
                return;
            }
            C8065k0 k0Var = this.f14029a;
            k0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe6Service$a0 */
    class C8045a0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f14030a;

        C8045a0(Stripe6Service stripe6Service, CompletionHandler completionHandler) {
            this.f14030a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f14030a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f14030a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe6Service$b */
    class C8046b implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8085u0 f14031a;

        C8046b(Stripe6Service stripe6Service, C8085u0 u0Var) {
            this.f14031a = u0Var;
        }

        public void onFailed(int i, String str) {
            this.f14031a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Rgb");
            if (property.isValueValid()) {
                this.f14031a.mo34788a((Long) propertyInfo.getValue("Rgb"));
                return;
            }
            C8085u0 u0Var = this.f14031a;
            u0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe6Service$b0 */
    class C8047b0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f14032a;

        C8047b0(Stripe6Service stripe6Service, CompletionHandler completionHandler) {
            this.f14032a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f14032a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f14032a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe6Service$c */
    class C8048c implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8067l0 f14033a;

        C8048c(Stripe6Service stripe6Service, C8067l0 l0Var) {
            this.f14033a = l0Var;
        }

        public void onFailed(int i, String str) {
            this.f14033a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("DelayOff");
            if (property.isValueValid()) {
                this.f14033a.mo34770a((Long) propertyInfo.getValue("DelayOff"));
                return;
            }
            C8067l0 l0Var = this.f14033a;
            l0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe6Service$c0 */
    class C8049c0 implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f14034a;

        C8049c0(Stripe6Service stripe6Service, CompletionHandler completionHandler) {
            this.f14034a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f14034a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f14034a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe6Service$d */
    class C8050d implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8089w0 f14035a;

        C8050d(Stripe6Service stripe6Service, C8089w0 w0Var) {
            this.f14035a = w0Var;
        }

        public void onFailed(int i, String str) {
            this.f14035a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("SaveState");
            if (property.isValueValid()) {
                this.f14035a.mo34792a((Long) propertyInfo.getValue("SaveState"));
                return;
            }
            C8089w0 w0Var = this.f14035a;
            w0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe6Service$d0 */
    class C8051d0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8083t0 f14036a;

        C8051d0(Stripe6Service stripe6Service, C8083t0 t0Var) {
            this.f14036a = t0Var;
        }

        public void onFailed(int i, String str) {
            this.f14036a.onFailed(i, str);
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
                com.yeelight.yeelib.device.xiaomi.Stripe6Service$Power r1 = com.yeelight.yeelib.device.xiaomi.Stripe6Service.Power.valueOf(r1)
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
                com.yeelight.yeelib.device.xiaomi.Stripe6Service$t0 r4 = r0.f14036a
                r4.mo34786a(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.xiaomi.Stripe6Service.C8051d0.onSucceed(com.miot.common.device.invocation.PropertyInfo):void");
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe6Service$e */
    class C8052e implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8069m0 f14037a;

        C8052e(Stripe6Service stripe6Service, C8069m0 m0Var) {
            this.f14037a = m0Var;
        }

        public void onFailed(int i, String str) {
            this.f14037a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("FlowParams");
            if (property.isValueValid()) {
                this.f14037a.onSucceed((String) propertyInfo.getValue("FlowParams"));
                return;
            }
            C8069m0 m0Var = this.f14037a;
            m0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe6Service$e0 */
    class C8053e0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8081s0 f14038a;

        C8053e0(Stripe6Service stripe6Service, C8081s0 s0Var) {
            this.f14038a = s0Var;
        }

        public void onFailed(int i, String str) {
            this.f14038a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Power");
            if (property.isValueValid()) {
                this.f14038a.mo34784a(Power.valueOf((String) propertyInfo.getValue("Power")));
                return;
            }
            C8081s0 s0Var = this.f14038a;
            s0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe6Service$f */
    class C8054f implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8077q0 f14039a;

        C8054f(Stripe6Service stripe6Service, C8077q0 q0Var) {
            this.f14039a = q0Var;
        }

        public void onFailed(int i, String str) {
            this.f14039a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("LanMode");
            if (property.isValueValid()) {
                this.f14039a.mo34780a((Long) propertyInfo.getValue("LanMode"));
                return;
            }
            C8077q0 q0Var = this.f14039a;
            q0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe6Service$f0 */
    class C8055f0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8063j0 f14040a;

        C8055f0(Stripe6Service stripe6Service, C8063j0 j0Var) {
            this.f14040a = j0Var;
        }

        public void onFailed(int i, String str) {
            this.f14040a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Bright");
            if (property.isValueValid()) {
                this.f14040a.mo34766a((Long) propertyInfo.getValue("Bright"));
                return;
            }
            C8063j0 j0Var = this.f14040a;
            j0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe6Service$g */
    class C8056g implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8091x0 f14041a;

        C8056g(Stripe6Service stripe6Service, C8091x0 x0Var) {
            this.f14041a = x0Var;
        }

        public void onFailed(int i, String str) {
            this.f14041a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("onFromPower");
            if (property.isValueValid()) {
                this.f14041a.mo34794a((Long) propertyInfo.getValue("onFromPower"));
                return;
            }
            C8091x0 x0Var = this.f14041a;
            x0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe6Service$g0 */
    class C8057g0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8073o0 f14042a;

        C8057g0(Stripe6Service stripe6Service, C8073o0 o0Var) {
            this.f14042a = o0Var;
        }

        public void onFailed(int i, String str) {
            this.f14042a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Hue");
            if (property.isValueValid()) {
                this.f14042a.mo34776a((Long) propertyInfo.getValue("Hue"));
                return;
            }
            C8073o0 o0Var = this.f14042a;
            o0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe6Service$h */
    class C8058h implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8079r0 f14043a;

        C8058h(Stripe6Service stripe6Service, C8079r0 r0Var) {
            this.f14043a = r0Var;
        }

        public void onFailed(int i, String str) {
            this.f14043a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("MusicEnable");
            if (property.isValueValid()) {
                this.f14043a.mo34782a((Long) propertyInfo.getValue("MusicEnable"));
                return;
            }
            C8079r0 r0Var = this.f14043a;
            r0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe6Service$h0 */
    class C8059h0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8087v0 f14044a;

        C8059h0(Stripe6Service stripe6Service, C8087v0 v0Var) {
            this.f14044a = v0Var;
        }

        public void onFailed(int i, String str) {
            this.f14044a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Sat");
            if (property.isValueValid()) {
                this.f14044a.mo34790a((Long) propertyInfo.getValue("Sat"));
                return;
            }
            C8087v0 v0Var = this.f14044a;
            v0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe6Service$i */
    class C8060i implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8075p0 f14045a;

        C8060i(Stripe6Service stripe6Service, C8075p0 p0Var) {
            this.f14045a = p0Var;
        }

        public void onFailed(int i, String str) {
            this.f14045a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("IndicatorOn");
            if (property.isValueValid()) {
                this.f14045a.mo34778a((Long) propertyInfo.getValue("IndicatorOn"));
                return;
            }
            C8075p0 p0Var = this.f14045a;
            p0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe6Service$i0 */
    class C8061i0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8071n0 f14046a;

        C8061i0(Stripe6Service stripe6Service, C8071n0 n0Var) {
            this.f14046a = n0Var;
        }

        public void onFailed(int i, String str) {
            this.f14046a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Flowing");
            if (property.isValueValid()) {
                this.f14046a.mo34774a((Long) propertyInfo.getValue("Flowing"));
                return;
            }
            C8071n0 n0Var = this.f14046a;
            n0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe6Service$j */
    class C8062j implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f14047a;

        C8062j(Stripe6Service stripe6Service, CompletionHandler completionHandler) {
            this.f14047a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f14047a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f14047a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe6Service$j0 */
    public interface C8063j0 {
        /* renamed from: a */
        void mo34766a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe6Service$k */
    class C8064k implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f14048a;

        C8064k(Stripe6Service stripe6Service, CompletionHandler completionHandler) {
            this.f14048a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f14048a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f14048a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe6Service$k0 */
    public interface C8065k0 {
        /* renamed from: a */
        void mo34768a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe6Service$l */
    class C8066l implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f14049a;

        C8066l(Stripe6Service stripe6Service, CompletionHandler completionHandler) {
            this.f14049a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f14049a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f14049a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe6Service$l0 */
    public interface C8067l0 {
        /* renamed from: a */
        void mo34770a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe6Service$m */
    class C8068m implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f14050a;

        C8068m(Stripe6Service stripe6Service, CompletionHandler completionHandler) {
            this.f14050a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f14050a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f14050a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe6Service$m0 */
    public interface C8069m0 {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe6Service$n */
    class C8070n implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f14051a;

        C8070n(Stripe6Service stripe6Service, CompletionHandler completionHandler) {
            this.f14051a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f14051a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f14051a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe6Service$n0 */
    public interface C8071n0 {
        /* renamed from: a */
        void mo34774a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe6Service$o */
    class C8072o implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f14052a;

        C8072o(Stripe6Service stripe6Service, CompletionHandler completionHandler) {
            this.f14052a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f14052a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f14052a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe6Service$o0 */
    public interface C8073o0 {
        /* renamed from: a */
        void mo34776a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe6Service$p */
    class C8074p implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f14053a;

        C8074p(Stripe6Service stripe6Service, CompletionHandler completionHandler) {
            this.f14053a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f14053a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f14053a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe6Service$p0 */
    public interface C8075p0 {
        /* renamed from: a */
        void mo34778a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe6Service$q */
    class C8076q implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f14054a;

        C8076q(Stripe6Service stripe6Service, CompletionHandler completionHandler) {
            this.f14054a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f14054a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f14054a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe6Service$q0 */
    public interface C8077q0 {
        /* renamed from: a */
        void mo34780a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe6Service$r */
    class C8078r implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f14055a;

        C8078r(Stripe6Service stripe6Service, CompletionHandler completionHandler) {
            this.f14055a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f14055a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f14055a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe6Service$r0 */
    public interface C8079r0 {
        /* renamed from: a */
        void mo34782a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe6Service$s */
    class C8080s implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f14056a;

        C8080s(Stripe6Service stripe6Service, CompletionHandler completionHandler) {
            this.f14056a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f14056a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f14056a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe6Service$s0 */
    public interface C8081s0 {
        /* renamed from: a */
        void mo34784a(Power power);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe6Service$t */
    class C8082t implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f14057a;

        C8082t(Stripe6Service stripe6Service, CompletionHandler completionHandler) {
            this.f14057a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f14057a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f14057a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe6Service$t0 */
    public interface C8083t0 {
        /* renamed from: a */
        void mo34786a(Power power, Long l, Long l2, Long l3, Long l4, Long l5, Long l6, Long l7, Long l8, String str, Long l9, Long l10, Long l11, Long l12);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe6Service$u */
    class C8084u implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f14058a;

        C8084u(Stripe6Service stripe6Service, CompletionHandler completionHandler) {
            this.f14058a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f14058a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f14058a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe6Service$u0 */
    public interface C8085u0 {
        /* renamed from: a */
        void mo34788a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe6Service$v */
    class C8086v implements DeviceManipulator.PropertyChangedListener {

        /* renamed from: a */
        final /* synthetic */ C8093y0 f14059a;

        C8086v(Stripe6Service stripe6Service, C8093y0 y0Var) {
            this.f14059a = y0Var;
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
                        this.f14059a.mo34798c((Long) propertyInfo3.getValue(str3));
                        return;
                    }
                    return;
                case 1:
                    String str4 = "FlowParams";
                    PropertyInfo propertyInfo4 = propertyInfo;
                    if (propertyInfo4.getProperty(str4).isValueValid()) {
                        this.f14059a.mo34800e((String) propertyInfo4.getValue(str4));
                        return;
                    }
                    return;
                case 2:
                    PropertyInfo propertyInfo5 = propertyInfo;
                    if (propertyInfo5.getProperty("MusicEnable").isValueValid()) {
                        this.f14059a.mo34808m((Long) propertyInfo5.getValue("MusicEnable"));
                        return;
                    }
                    return;
                case 3:
                    PropertyInfo propertyInfo6 = propertyInfo;
                    if (propertyInfo6.getProperty("ColorMode").isValueValid()) {
                        this.f14059a.mo34807l((Long) propertyInfo6.getValue("ColorMode"));
                        return;
                    }
                    return;
                case 4:
                    PropertyInfo propertyInfo7 = propertyInfo;
                    if (propertyInfo7.getProperty("Hue").isValueValid()) {
                        this.f14059a.mo34809n((Long) propertyInfo7.getValue("Hue"));
                        return;
                    }
                    return;
                case 5:
                    PropertyInfo propertyInfo8 = propertyInfo;
                    if (propertyInfo8.getProperty("Rgb").isValueValid()) {
                        this.f14059a.mo34805j((Long) propertyInfo8.getValue("Rgb"));
                        return;
                    }
                    return;
                case 6:
                    PropertyInfo propertyInfo9 = propertyInfo;
                    if (propertyInfo9.getProperty("Sat").isValueValid()) {
                        this.f14059a.mo34806k((Long) propertyInfo9.getValue("Sat"));
                        return;
                    }
                    return;
                case 7:
                    PropertyInfo propertyInfo10 = propertyInfo;
                    if (propertyInfo10.getProperty("onFromPower").isValueValid()) {
                        this.f14059a.mo34801f((Long) propertyInfo10.getValue("onFromPower"));
                        return;
                    }
                    return;
                case 8:
                    PropertyInfo propertyInfo11 = propertyInfo;
                    if (propertyInfo11.getProperty("Power").isValueValid()) {
                        this.f14059a.mo34803h(Power.valueOf((String) propertyInfo11.getValue("Power")));
                        return;
                    }
                    return;
                case 9:
                    PropertyInfo propertyInfo12 = propertyInfo;
                    if (propertyInfo12.getProperty("IndicatorOn").isValueValid()) {
                        this.f14059a.mo34804i((Long) propertyInfo12.getValue("IndicatorOn"));
                        return;
                    }
                    return;
                case 10:
                    PropertyInfo propertyInfo13 = propertyInfo;
                    if (propertyInfo13.getProperty("DelayOff").isValueValid()) {
                        this.f14059a.mo34797b((Long) propertyInfo13.getValue("DelayOff"));
                        return;
                    }
                    return;
                case 11:
                    PropertyInfo propertyInfo14 = propertyInfo;
                    if (propertyInfo14.getProperty("Flowing").isValueValid()) {
                        this.f14059a.mo34799d((Long) propertyInfo14.getValue("Flowing"));
                        return;
                    }
                    return;
                case 12:
                    PropertyInfo propertyInfo15 = propertyInfo;
                    if (propertyInfo15.getProperty("LanMode").isValueValid()) {
                        this.f14059a.mo34802g((Long) propertyInfo15.getValue("LanMode"));
                        return;
                    }
                    return;
                case 13:
                    PropertyInfo propertyInfo16 = propertyInfo;
                    if (propertyInfo16.getProperty("Bright").isValueValid()) {
                        this.f14059a.mo34796a((Long) propertyInfo16.getValue("Bright"));
                        return;
                    }
                    break;
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe6Service$v0 */
    public interface C8087v0 {
        /* renamed from: a */
        void mo34790a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe6Service$w */
    class C8088w implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f14060a;

        C8088w(Stripe6Service stripe6Service, CompletionHandler completionHandler) {
            this.f14060a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f14060a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f14060a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe6Service$w0 */
    public interface C8089w0 {
        /* renamed from: a */
        void mo34792a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe6Service$x */
    class C8090x implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f14061a;

        C8090x(Stripe6Service stripe6Service, CompletionHandler completionHandler) {
            this.f14061a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f14061a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f14061a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe6Service$x0 */
    public interface C8091x0 {
        /* renamed from: a */
        void mo34794a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe6Service$y */
    class C8092y implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f14062a;

        C8092y(Stripe6Service stripe6Service, CompletionHandler completionHandler) {
            this.f14062a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f14062a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f14062a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe6Service$y0 */
    public interface C8093y0 {
        /* renamed from: a */
        void mo34796a(Long l);

        /* renamed from: b */
        void mo34797b(Long l);

        /* renamed from: c */
        void mo34798c(Long l);

        /* renamed from: d */
        void mo34799d(Long l);

        /* renamed from: e */
        void mo34800e(String str);

        /* renamed from: f */
        void mo34801f(Long l);

        /* renamed from: g */
        void mo34802g(Long l);

        /* renamed from: h */
        void mo34803h(Power power);

        /* renamed from: i */
        void mo34804i(Long l);

        /* renamed from: j */
        void mo34805j(Long l);

        /* renamed from: k */
        void mo34806k(Long l);

        /* renamed from: l */
        void mo34807l(Long l);

        /* renamed from: m */
        void mo34808m(Long l);

        /* renamed from: n */
        void mo34809n(Long l);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe6Service$z */
    class C8094z implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f14063a;

        C8094z(Stripe6Service stripe6Service, CompletionHandler completionHandler) {
            this.f14063a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f14063a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f14063a.onSucceed();
        }
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
                MiotManager.getDeviceManipulator().invoke(create, new C8082t(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8068m(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8062j(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8045a0(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getBright(C8063j0 j0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Bright"), new C8055f0(this, j0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getColorMode(C8065k0 k0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "ColorMode"), new C8044a(this, k0Var));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8094z(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getDelayOff(C8067l0 l0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "DelayOff"), new C8048c(this, l0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowParams(C8069m0 m0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "FlowParams"), new C8052e(this, m0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowing(C8071n0 n0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Flowing"), new C8061i0(this, n0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getHue(C8073o0 o0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Hue"), new C8057g0(this, o0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getIndicatorOn(C8075p0 p0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "IndicatorOn"), new C8060i(this, p0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getLanMode(C8077q0 q0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "LanMode"), new C8054f(this, q0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getMusicEnable(C8079r0 r0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "MusicEnable"), new C8058h(this, r0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getPower(C8081s0 s0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Power"), new C8053e0(this, s0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getProperties(C8083t0 t0Var) {
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
            MiotManager.getDeviceManipulator().readProperty(create, new C8051d0(this, t0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getRgb(C8085u0 u0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Rgb"), new C8046b(this, u0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getSat(C8087v0 v0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Sat"), new C8059h0(this, v0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getSaveState(C8089w0 w0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "SaveState"), new C8050d(this, w0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getonFromPower(C8091x0 x0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "onFromPower"), new C8056g(this, x0Var));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8074p(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8070n(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8088w(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8066l(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8084u(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8092y(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8090x(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8076q(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8078r(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8072o(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8047b0(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void subscribeNotifications(CompletionHandler completionHandler, C8093y0 y0Var) {
        if (completionHandler == null) {
            throw new IllegalArgumentException("handler is null");
        } else if (y0Var != null) {
            PropertyInfo create = PropertyInfoFactory.create(getService());
            for (Property next : getService().getProperties()) {
                if (next.getDefinition().isNotifiable()) {
                    create.addProperty(next);
                }
            }
            MiotManager.getDeviceManipulator().addPropertyChangedListener(create, new C8064k(this, completionHandler), new C8086v(this, y0Var));
        } else {
            throw new IllegalArgumentException("listener is null");
        }
    }

    public void toggle(CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "toggle");
            if (create != null) {
                MiotManager.getDeviceManipulator().invoke(create, new C8080s(this, completionHandler));
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
            MiotManager.getDeviceManipulator().removePropertyChangedListener(create, new C8049c0(this, completionHandler));
            return;
        }
        throw new IllegalArgumentException("handler is null");
    }
}
