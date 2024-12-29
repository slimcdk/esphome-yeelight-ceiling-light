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

public class ColorService extends AbstractService {
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
    public static final String PROPERTY_Ct = "Ct";
    public static final String PROPERTY_DelayOff = "DelayOff";
    public static final String PROPERTY_Duration = "Duration";
    public static final String PROPERTY_Effect = "Effect";
    public static final String PROPERTY_FlowParams = "FlowParams";
    public static final String PROPERTY_Flowing = "Flowing";
    public static final String PROPERTY_Hue = "Hue";
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
    public static final String PROPERTY_Temperature = "Temperature";
    public static final String PROPERTY_onFromPower = "onFromPower";
    private static final String TAG = "ColorService";
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

    public enum Power {
        undefined,
        on,
        off
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorService$a */
    class C7165a implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7211w0 f13403a;

        C7165a(ColorService colorService, C7211w0 w0Var) {
            this.f13403a = w0Var;
        }

        public void onFailed(int i, String str) {
            this.f13403a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Sat");
            if (property.isValueValid()) {
                this.f13403a.mo33490a((Long) propertyInfo.getValue("Sat"));
                return;
            }
            C7211w0 w0Var = this.f13403a;
            w0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorService$a0 */
    class C7166a0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13404a;

        C7166a0(ColorService colorService, CompletionHandler completionHandler) {
            this.f13404a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13404a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13404a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorService$a1 */
    public interface C7167a1 {
        /* renamed from: a */
        void mo33452a(Long l);

        /* renamed from: b */
        void mo33453b(Long l);

        /* renamed from: c */
        void mo33454c(Long l);

        /* renamed from: d */
        void mo33455d(Long l);

        /* renamed from: e */
        void mo33456e(String str);

        /* renamed from: f */
        void mo33457f(Long l);

        /* renamed from: g */
        void mo33458g(Long l);

        /* renamed from: h */
        void mo33459h(Long l);

        /* renamed from: i */
        void mo33460i(Power power);

        /* renamed from: j */
        void mo33461j(Long l);

        /* renamed from: k */
        void mo33462k(Long l);

        /* renamed from: l */
        void mo33463l(Long l);

        /* renamed from: m */
        void mo33464m(Long l);

        /* renamed from: n */
        void mo33465n(Long l);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorService$b */
    class C7168b implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7197p0 f13405a;

        C7168b(ColorService colorService, C7197p0 p0Var) {
            this.f13405a = p0Var;
        }

        public void onFailed(int i, String str) {
            this.f13405a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Flowing");
            if (property.isValueValid()) {
                this.f13405a.mo33476a((Long) propertyInfo.getValue("Flowing"));
                return;
            }
            C7197p0 p0Var = this.f13405a;
            p0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorService$b0 */
    class C7169b0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13406a;

        C7169b0(ColorService colorService, CompletionHandler completionHandler) {
            this.f13406a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13406a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13406a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorService$c */
    class C7170c implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7189l0 f13407a;

        C7170c(ColorService colorService, C7189l0 l0Var) {
            this.f13407a = l0Var;
        }

        public void onFailed(int i, String str) {
            this.f13407a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("ColorMode");
            if (property.isValueValid()) {
                this.f13407a.mo33468a((Long) propertyInfo.getValue("ColorMode"));
                return;
            }
            C7189l0 l0Var = this.f13407a;
            l0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorService$c0 */
    class C7171c0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13408a;

        C7171c0(ColorService colorService, CompletionHandler completionHandler) {
            this.f13408a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13408a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13408a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorService$d */
    class C7172d implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7209v0 f13409a;

        C7172d(ColorService colorService, C7209v0 v0Var) {
            this.f13409a = v0Var;
        }

        public void onFailed(int i, String str) {
            this.f13409a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Rgb");
            if (property.isValueValid()) {
                this.f13409a.mo33488a((Long) propertyInfo.getValue("Rgb"));
                return;
            }
            C7209v0 v0Var = this.f13409a;
            v0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorService$d0 */
    class C7173d0 implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13410a;

        C7173d0(ColorService colorService, CompletionHandler completionHandler) {
            this.f13410a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13410a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f13410a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorService$e */
    class C7174e implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7193n0 f13411a;

        C7174e(ColorService colorService, C7193n0 n0Var) {
            this.f13411a = n0Var;
        }

        public void onFailed(int i, String str) {
            this.f13411a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("DelayOff");
            if (property.isValueValid()) {
                this.f13411a.mo33472a((Long) propertyInfo.getValue("DelayOff"));
                return;
            }
            C7193n0 n0Var = this.f13411a;
            n0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorService$e0 */
    class C7175e0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7207u0 f13412a;

        C7175e0(ColorService colorService, C7207u0 u0Var) {
            this.f13412a = u0Var;
        }

        public void onFailed(int i, String str) {
            this.f13412a.onFailed(i, str);
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
                com.yeelight.yeelib.device.xiaomi.ColorService$Power r1 = com.yeelight.yeelib.device.xiaomi.ColorService.Power.valueOf(r1)
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
                java.lang.String r1 = "Temperature"
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
                java.lang.String r1 = "Hue"
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
                java.lang.String r1 = "Sat"
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
                java.lang.String r1 = "Flowing"
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
                java.lang.String r1 = "ColorMode"
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
                java.lang.String r1 = "Rgb"
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
                java.lang.String r1 = "DelayOff"
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
                java.lang.String r1 = "FlowParams"
                com.miot.common.property.Property r1 = r0.getProperty(r1)
                boolean r2 = r1.isValueValid()
                if (r2 == 0) goto L_0x0103
                java.lang.Object r1 = r1.getValue()
                java.lang.String r1 = (java.lang.String) r1
                r16 = r1
                goto L_0x0105
            L_0x0103:
                r16 = r3
            L_0x0105:
                java.lang.String r1 = "LanMode"
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
                java.lang.String r1 = "onFromPower"
                com.miot.common.property.Property r1 = r0.getProperty(r1)
                boolean r2 = r1.isValueValid()
                if (r2 == 0) goto L_0x0131
                java.lang.Object r1 = r1.getValue()
                java.lang.Long r1 = (java.lang.Long) r1
                r18 = r1
                goto L_0x0133
            L_0x0131:
                r18 = r3
            L_0x0133:
                java.lang.String r1 = "MusicEnable"
                com.miot.common.property.Property r0 = r0.getProperty(r1)
                boolean r1 = r0.isValueValid()
                if (r1 == 0) goto L_0x0146
                java.lang.Object r0 = r0.getValue()
                r3 = r0
                java.lang.Long r3 = (java.lang.Long) r3
            L_0x0146:
                r0 = r20
                r19 = r3
                com.yeelight.yeelib.device.xiaomi.ColorService$u0 r4 = r0.f13412a
                r4.mo33486a(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.xiaomi.ColorService.C7175e0.onSucceed(com.miot.common.device.invocation.PropertyInfo):void");
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorService$f */
    class C7176f implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7213x0 f13413a;

        C7176f(ColorService colorService, C7213x0 x0Var) {
            this.f13413a = x0Var;
        }

        public void onFailed(int i, String str) {
            this.f13413a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("SaveState");
            if (property.isValueValid()) {
                this.f13413a.mo33492a((Long) propertyInfo.getValue("SaveState"));
                return;
            }
            C7213x0 x0Var = this.f13413a;
            x0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorService$f0 */
    class C7177f0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7205t0 f13414a;

        C7177f0(ColorService colorService, C7205t0 t0Var) {
            this.f13414a = t0Var;
        }

        public void onFailed(int i, String str) {
            this.f13414a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Power");
            if (property.isValueValid()) {
                this.f13414a.mo33484a(Power.valueOf((String) propertyInfo.getValue("Power")));
                return;
            }
            C7205t0 t0Var = this.f13414a;
            t0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorService$g */
    class C7178g implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7195o0 f13415a;

        C7178g(ColorService colorService, C7195o0 o0Var) {
            this.f13415a = o0Var;
        }

        public void onFailed(int i, String str) {
            this.f13415a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("FlowParams");
            if (property.isValueValid()) {
                this.f13415a.onSucceed((String) propertyInfo.getValue("FlowParams"));
                return;
            }
            C7195o0 o0Var = this.f13415a;
            o0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorService$g0 */
    class C7179g0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7187k0 f13416a;

        C7179g0(ColorService colorService, C7187k0 k0Var) {
            this.f13416a = k0Var;
        }

        public void onFailed(int i, String str) {
            this.f13416a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Bright");
            if (property.isValueValid()) {
                this.f13416a.mo33466a((Long) propertyInfo.getValue("Bright"));
                return;
            }
            C7187k0 k0Var = this.f13416a;
            k0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorService$h */
    class C7180h implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7201r0 f13417a;

        C7180h(ColorService colorService, C7201r0 r0Var) {
            this.f13417a = r0Var;
        }

        public void onFailed(int i, String str) {
            this.f13417a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("LanMode");
            if (property.isValueValid()) {
                this.f13417a.mo33480a((Long) propertyInfo.getValue("LanMode"));
                return;
            }
            C7201r0 r0Var = this.f13417a;
            r0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorService$h0 */
    class C7181h0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7191m0 f13418a;

        C7181h0(ColorService colorService, C7191m0 m0Var) {
            this.f13418a = m0Var;
        }

        public void onFailed(int i, String str) {
            this.f13418a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Ct");
            if (property.isValueValid()) {
                this.f13418a.mo33470a((Long) propertyInfo.getValue("Ct"));
                return;
            }
            C7191m0 m0Var = this.f13418a;
            m0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorService$i */
    class C7182i implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7217z0 f13419a;

        C7182i(ColorService colorService, C7217z0 z0Var) {
            this.f13419a = z0Var;
        }

        public void onFailed(int i, String str) {
            this.f13419a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("onFromPower");
            if (property.isValueValid()) {
                this.f13419a.mo33496a((Long) propertyInfo.getValue("onFromPower"));
                return;
            }
            C7217z0 z0Var = this.f13419a;
            z0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorService$i0 */
    class C7183i0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7215y0 f13420a;

        C7183i0(ColorService colorService, C7215y0 y0Var) {
            this.f13420a = y0Var;
        }

        public void onFailed(int i, String str) {
            this.f13420a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Temperature");
            if (property.isValueValid()) {
                this.f13420a.mo33494a((Long) propertyInfo.getValue("Temperature"));
                return;
            }
            C7215y0 y0Var = this.f13420a;
            y0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorService$j */
    class C7184j implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7203s0 f13421a;

        C7184j(ColorService colorService, C7203s0 s0Var) {
            this.f13421a = s0Var;
        }

        public void onFailed(int i, String str) {
            this.f13421a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("MusicEnable");
            if (property.isValueValid()) {
                this.f13421a.mo33482a((Long) propertyInfo.getValue("MusicEnable"));
                return;
            }
            C7203s0 s0Var = this.f13421a;
            s0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorService$j0 */
    class C7185j0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7199q0 f13422a;

        C7185j0(ColorService colorService, C7199q0 q0Var) {
            this.f13422a = q0Var;
        }

        public void onFailed(int i, String str) {
            this.f13422a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Hue");
            if (property.isValueValid()) {
                this.f13422a.mo33478a((Long) propertyInfo.getValue("Hue"));
                return;
            }
            C7199q0 q0Var = this.f13422a;
            q0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorService$k */
    class C7186k implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13423a;

        C7186k(ColorService colorService, CompletionHandler completionHandler) {
            this.f13423a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13423a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f13423a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorService$k0 */
    public interface C7187k0 {
        /* renamed from: a */
        void mo33466a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorService$l */
    class C7188l implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13424a;

        C7188l(ColorService colorService, CompletionHandler completionHandler) {
            this.f13424a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13424a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13424a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorService$l0 */
    public interface C7189l0 {
        /* renamed from: a */
        void mo33468a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorService$m */
    class C7190m implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13425a;

        C7190m(ColorService colorService, CompletionHandler completionHandler) {
            this.f13425a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13425a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13425a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorService$m0 */
    public interface C7191m0 {
        /* renamed from: a */
        void mo33470a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorService$n */
    class C7192n implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13426a;

        C7192n(ColorService colorService, CompletionHandler completionHandler) {
            this.f13426a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13426a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13426a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorService$n0 */
    public interface C7193n0 {
        /* renamed from: a */
        void mo33472a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorService$o */
    class C7194o implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13427a;

        C7194o(ColorService colorService, CompletionHandler completionHandler) {
            this.f13427a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13427a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13427a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorService$o0 */
    public interface C7195o0 {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorService$p */
    class C7196p implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13428a;

        C7196p(ColorService colorService, CompletionHandler completionHandler) {
            this.f13428a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13428a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13428a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorService$p0 */
    public interface C7197p0 {
        /* renamed from: a */
        void mo33476a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorService$q */
    class C7198q implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13429a;

        C7198q(ColorService colorService, CompletionHandler completionHandler) {
            this.f13429a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13429a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13429a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorService$q0 */
    public interface C7199q0 {
        /* renamed from: a */
        void mo33478a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorService$r */
    class C7200r implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13430a;

        C7200r(ColorService colorService, CompletionHandler completionHandler) {
            this.f13430a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13430a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13430a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorService$r0 */
    public interface C7201r0 {
        /* renamed from: a */
        void mo33480a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorService$s */
    class C7202s implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13431a;

        C7202s(ColorService colorService, CompletionHandler completionHandler) {
            this.f13431a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13431a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13431a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorService$s0 */
    public interface C7203s0 {
        /* renamed from: a */
        void mo33482a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorService$t */
    class C7204t implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13432a;

        C7204t(ColorService colorService, CompletionHandler completionHandler) {
            this.f13432a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13432a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13432a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorService$t0 */
    public interface C7205t0 {
        /* renamed from: a */
        void mo33484a(Power power);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorService$u */
    class C7206u implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13433a;

        C7206u(ColorService colorService, CompletionHandler completionHandler) {
            this.f13433a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13433a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13433a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorService$u0 */
    public interface C7207u0 {
        /* renamed from: a */
        void mo33486a(Power power, Long l, Long l2, Long l3, Long l4, Long l5, Long l6, Long l7, Long l8, Long l9, Long l10, String str, Long l11, Long l12, Long l13);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorService$v */
    class C7208v implements DeviceManipulator.PropertyChangedListener {

        /* renamed from: a */
        final /* synthetic */ C7167a1 f13434a;

        C7208v(ColorService colorService, C7167a1 a1Var) {
            this.f13434a = a1Var;
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
                case 2193:
                    if (str2.equals("Ct")) {
                        c = 4;
                        break;
                    }
                    break;
                case 72920:
                    if (str2.equals("Hue")) {
                        c = 5;
                        break;
                    }
                    break;
                case 82093:
                    if (str2.equals("Rgb")) {
                        c = 6;
                        break;
                    }
                    break;
                case 82886:
                    if (str2.equals("Sat")) {
                        c = 7;
                        break;
                    }
                    break;
                case 35911772:
                    if (str2.equals("onFromPower")) {
                        c = 8;
                        break;
                    }
                    break;
                case 77306085:
                    if (str2.equals("Power")) {
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
                        this.f13434a.mo33454c((Long) propertyInfo3.getValue(str3));
                        return;
                    }
                    return;
                case 1:
                    String str4 = "FlowParams";
                    PropertyInfo propertyInfo4 = propertyInfo;
                    if (propertyInfo4.getProperty(str4).isValueValid()) {
                        this.f13434a.mo33456e((String) propertyInfo4.getValue(str4));
                        return;
                    }
                    return;
                case 2:
                    PropertyInfo propertyInfo5 = propertyInfo;
                    if (propertyInfo5.getProperty("MusicEnable").isValueValid()) {
                        this.f13434a.mo33464m((Long) propertyInfo5.getValue("MusicEnable"));
                        return;
                    }
                    return;
                case 3:
                    PropertyInfo propertyInfo6 = propertyInfo;
                    if (propertyInfo6.getProperty("ColorMode").isValueValid()) {
                        this.f13434a.mo33463l((Long) propertyInfo6.getValue("ColorMode"));
                        return;
                    }
                    return;
                case 4:
                    PropertyInfo propertyInfo7 = propertyInfo;
                    if (propertyInfo7.getProperty("Ct").isValueValid()) {
                        this.f13434a.mo33459h((Long) propertyInfo7.getValue("Ct"));
                        return;
                    }
                    return;
                case 5:
                    PropertyInfo propertyInfo8 = propertyInfo;
                    if (propertyInfo8.getProperty("Hue").isValueValid()) {
                        this.f13434a.mo33465n((Long) propertyInfo8.getValue("Hue"));
                        return;
                    }
                    return;
                case 6:
                    PropertyInfo propertyInfo9 = propertyInfo;
                    if (propertyInfo9.getProperty("Rgb").isValueValid()) {
                        this.f13434a.mo33461j((Long) propertyInfo9.getValue("Rgb"));
                        return;
                    }
                    return;
                case 7:
                    PropertyInfo propertyInfo10 = propertyInfo;
                    if (propertyInfo10.getProperty("Sat").isValueValid()) {
                        this.f13434a.mo33462k((Long) propertyInfo10.getValue("Sat"));
                        return;
                    }
                    return;
                case 8:
                    PropertyInfo propertyInfo11 = propertyInfo;
                    if (propertyInfo11.getProperty("onFromPower").isValueValid()) {
                        this.f13434a.mo33457f((Long) propertyInfo11.getValue("onFromPower"));
                        return;
                    }
                    return;
                case 9:
                    PropertyInfo propertyInfo12 = propertyInfo;
                    if (propertyInfo12.getProperty("Power").isValueValid()) {
                        this.f13434a.mo33460i(Power.valueOf((String) propertyInfo12.getValue("Power")));
                        return;
                    }
                    return;
                case 10:
                    PropertyInfo propertyInfo13 = propertyInfo;
                    if (propertyInfo13.getProperty("DelayOff").isValueValid()) {
                        this.f13434a.mo33453b((Long) propertyInfo13.getValue("DelayOff"));
                        return;
                    }
                    return;
                case 11:
                    PropertyInfo propertyInfo14 = propertyInfo;
                    if (propertyInfo14.getProperty("Flowing").isValueValid()) {
                        this.f13434a.mo33455d((Long) propertyInfo14.getValue("Flowing"));
                        return;
                    }
                    return;
                case 12:
                    PropertyInfo propertyInfo15 = propertyInfo;
                    if (propertyInfo15.getProperty("LanMode").isValueValid()) {
                        this.f13434a.mo33458g((Long) propertyInfo15.getValue("LanMode"));
                        return;
                    }
                    return;
                case 13:
                    PropertyInfo propertyInfo16 = propertyInfo;
                    if (propertyInfo16.getProperty("Bright").isValueValid()) {
                        this.f13434a.mo33452a((Long) propertyInfo16.getValue("Bright"));
                        return;
                    }
                    break;
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorService$v0 */
    public interface C7209v0 {
        /* renamed from: a */
        void mo33488a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorService$w */
    class C7210w implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13435a;

        C7210w(ColorService colorService, CompletionHandler completionHandler) {
            this.f13435a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13435a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13435a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorService$w0 */
    public interface C7211w0 {
        /* renamed from: a */
        void mo33490a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorService$x */
    class C7212x implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13436a;

        C7212x(ColorService colorService, CompletionHandler completionHandler) {
            this.f13436a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13436a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13436a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorService$x0 */
    public interface C7213x0 {
        /* renamed from: a */
        void mo33492a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorService$y */
    class C7214y implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13437a;

        C7214y(ColorService colorService, CompletionHandler completionHandler) {
            this.f13437a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13437a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13437a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorService$y0 */
    public interface C7215y0 {
        /* renamed from: a */
        void mo33494a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorService$z */
    class C7216z implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13438a;

        C7216z(ColorService colorService, CompletionHandler completionHandler) {
            this.f13438a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13438a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13438a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorService$z0 */
    public interface C7217z0 {
        /* renamed from: a */
        void mo33496a(Long l);

        void onFailed(int i, String str);
    }

    public ColorService(AbstractDevice abstractDevice) {
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
                MiotManager.getDeviceManipulator().invoke(create, new C7206u(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7192n(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7188l(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7169b0(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getBright(C7187k0 k0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Bright"), new C7179g0(this, k0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getColorMode(C7189l0 l0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "ColorMode"), new C7170c(this, l0Var));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7166a0(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getCt(C7191m0 m0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Ct"), new C7181h0(this, m0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getDelayOff(C7193n0 n0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "DelayOff"), new C7174e(this, n0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowParams(C7195o0 o0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "FlowParams"), new C7178g(this, o0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowing(C7197p0 p0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Flowing"), new C7168b(this, p0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getHue(C7199q0 q0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Hue"), new C7185j0(this, q0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getLanMode(C7201r0 r0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "LanMode"), new C7180h(this, r0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getMusicEnable(C7203s0 s0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "MusicEnable"), new C7184j(this, s0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getPower(C7205t0 t0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Power"), new C7177f0(this, t0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getProperties(C7207u0 u0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            PropertyInfo create = PropertyInfoFactory.create(getService());
            create.addProperty(getService().getProperty("Power"));
            create.addProperty(getService().getProperty("Bright"));
            create.addProperty(getService().getProperty("Ct"));
            create.addProperty(getService().getProperty("Temperature"));
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
            MiotManager.getDeviceManipulator().readProperty(create, new C7175e0(this, u0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getRgb(C7209v0 v0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Rgb"), new C7172d(this, v0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getSat(C7211w0 w0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Sat"), new C7165a(this, w0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getSaveState(C7213x0 x0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "SaveState"), new C7176f(this, x0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getTemperature(C7215y0 y0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Temperature"), new C7183i0(this, y0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getonFromPower(C7217z0 z0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "onFromPower"), new C7182i(this, z0Var));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7198q(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7194o(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7212x(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7190m(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7216z(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7210w(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7214y(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7200r(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7202s(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7196p(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7171c0(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void subscribeNotifications(CompletionHandler completionHandler, C7167a1 a1Var) {
        if (completionHandler == null) {
            throw new IllegalArgumentException("handler is null");
        } else if (a1Var != null) {
            PropertyInfo create = PropertyInfoFactory.create(getService());
            for (Property next : getService().getProperties()) {
                if (next.getDefinition().isNotifiable()) {
                    create.addProperty(next);
                }
            }
            MiotManager.getDeviceManipulator().addPropertyChangedListener(create, new C7186k(this, completionHandler), new C7208v(this, a1Var));
        } else {
            throw new IllegalArgumentException("listener is null");
        }
    }

    public void toggle(CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "toggle");
            if (create != null) {
                MiotManager.getDeviceManipulator().invoke(create, new C7204t(this, completionHandler));
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
            MiotManager.getDeviceManipulator().removePropertyChangedListener(create, new C7173d0(this, completionHandler));
            return;
        }
        throw new IllegalArgumentException("handler is null");
    }
}
