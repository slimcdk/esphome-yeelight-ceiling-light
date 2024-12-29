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

public class Color4Service extends AbstractService {
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
    public static final String PROPERTY_SmartSwitch = "SmartSwitch";
    public static final String PROPERTY_Temperature = "Temperature";
    public static final String PROPERTY_onFromPower = "onFromPower";
    private static final String TAG = "Color4Service";
    private AbstractDevice mDevice = null;

    public enum CmdKey {
        undefined,
        cfg_pomodoro,
        cfg_lan_ctrl,
        cfg_save_state,
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

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color4Service$a */
    class C7110a implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7160x0 f13365a;

        C7110a(Color4Service color4Service, C7160x0 x0Var) {
            this.f13365a = x0Var;
        }

        public void onFailed(int i, String str) {
            this.f13365a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Sat");
            if (property.isValueValid()) {
                this.f13365a.mo33411a((Long) propertyInfo.getValue("Sat"));
                return;
            }
            C7160x0 x0Var = this.f13365a;
            x0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color4Service$a0 */
    class C7111a0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13366a;

        C7111a0(Color4Service color4Service, CompletionHandler completionHandler) {
            this.f13366a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13366a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13366a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color4Service$a1 */
    public interface C7112a1 {
        /* renamed from: a */
        void mo33368a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color4Service$b */
    class C7113b implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7146q0 f13367a;

        C7113b(Color4Service color4Service, C7146q0 q0Var) {
            this.f13367a = q0Var;
        }

        public void onFailed(int i, String str) {
            this.f13367a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Flowing");
            if (property.isValueValid()) {
                this.f13367a.mo33397a((Long) propertyInfo.getValue("Flowing"));
                return;
            }
            C7146q0 q0Var = this.f13367a;
            q0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color4Service$b0 */
    class C7114b0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13368a;

        C7114b0(Color4Service color4Service, CompletionHandler completionHandler) {
            this.f13368a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13368a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13368a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color4Service$b1 */
    public interface C7115b1 {
        /* renamed from: a */
        void mo33370a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color4Service$c */
    class C7116c implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7138m0 f13369a;

        C7116c(Color4Service color4Service, C7138m0 m0Var) {
            this.f13369a = m0Var;
        }

        public void onFailed(int i, String str) {
            this.f13369a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("ColorMode");
            if (property.isValueValid()) {
                this.f13369a.mo33389a((Long) propertyInfo.getValue("ColorMode"));
                return;
            }
            C7138m0 m0Var = this.f13369a;
            m0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color4Service$c0 */
    class C7117c0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13370a;

        C7117c0(Color4Service color4Service, CompletionHandler completionHandler) {
            this.f13370a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13370a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13370a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color4Service$c1 */
    public interface C7118c1 {
        /* renamed from: a */
        void mo33372a(Long l);

        /* renamed from: b */
        void mo33373b(Long l);

        /* renamed from: c */
        void mo33374c(Long l);

        /* renamed from: d */
        void mo33375d(Long l);

        /* renamed from: e */
        void mo33376e(String str);

        /* renamed from: f */
        void mo33377f(Long l);

        /* renamed from: g */
        void mo33378g(Long l);

        /* renamed from: h */
        void mo33379h(Long l);

        /* renamed from: i */
        void mo33380i(Power power);

        /* renamed from: j */
        void mo33381j(Long l);

        /* renamed from: k */
        void mo33382k(Long l);

        /* renamed from: l */
        void mo33383l(Long l);

        /* renamed from: m */
        void mo33384m(Long l);

        /* renamed from: n */
        void mo33385n(Long l);

        /* renamed from: o */
        void mo33386o(Long l);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color4Service$d */
    class C7119d implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7158w0 f13371a;

        C7119d(Color4Service color4Service, C7158w0 w0Var) {
            this.f13371a = w0Var;
        }

        public void onFailed(int i, String str) {
            this.f13371a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Rgb");
            if (property.isValueValid()) {
                this.f13371a.mo33409a((Long) propertyInfo.getValue("Rgb"));
                return;
            }
            C7158w0 w0Var = this.f13371a;
            w0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color4Service$d0 */
    class C7120d0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13372a;

        C7120d0(Color4Service color4Service, CompletionHandler completionHandler) {
            this.f13372a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13372a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13372a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color4Service$e */
    class C7121e implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7142o0 f13373a;

        C7121e(Color4Service color4Service, C7142o0 o0Var) {
            this.f13373a = o0Var;
        }

        public void onFailed(int i, String str) {
            this.f13373a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("DelayOff");
            if (property.isValueValid()) {
                this.f13373a.mo33393a((Long) propertyInfo.getValue("DelayOff"));
                return;
            }
            C7142o0 o0Var = this.f13373a;
            o0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color4Service$e0 */
    class C7122e0 implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13374a;

        C7122e0(Color4Service color4Service, CompletionHandler completionHandler) {
            this.f13374a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13374a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f13374a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color4Service$f */
    class C7123f implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7162y0 f13375a;

        C7123f(Color4Service color4Service, C7162y0 y0Var) {
            this.f13375a = y0Var;
        }

        public void onFailed(int i, String str) {
            this.f13375a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("SaveState");
            if (property.isValueValid()) {
                this.f13375a.mo33413a((Long) propertyInfo.getValue("SaveState"));
                return;
            }
            C7162y0 y0Var = this.f13375a;
            y0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color4Service$f0 */
    class C7124f0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7156v0 f13376a;

        C7124f0(Color4Service color4Service, C7156v0 v0Var) {
            this.f13376a = v0Var;
        }

        public void onFailed(int i, String str) {
            this.f13376a.onFailed(i, str);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.Long} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onSucceed(com.miot.common.device.invocation.PropertyInfo r22) {
            /*
                r21 = this;
                r0 = r22
                java.lang.String r1 = "Power"
                com.miot.common.property.Property r1 = r0.getProperty(r1)
                boolean r2 = r1.isValueValid()
                r3 = 0
                if (r2 == 0) goto L_0x001b
                java.lang.Object r1 = r1.getValue()
                java.lang.String r1 = (java.lang.String) r1
                com.yeelight.yeelib.device.xiaomi.Color4Service$Power r1 = com.yeelight.yeelib.device.xiaomi.Color4Service.Power.valueOf(r1)
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
                com.miot.common.property.Property r1 = r0.getProperty(r1)
                boolean r2 = r1.isValueValid()
                if (r2 == 0) goto L_0x0148
                java.lang.Object r1 = r1.getValue()
                java.lang.Long r1 = (java.lang.Long) r1
                r19 = r1
                goto L_0x014a
            L_0x0148:
                r19 = r3
            L_0x014a:
                java.lang.String r1 = "SmartSwitch"
                com.miot.common.property.Property r0 = r0.getProperty(r1)
                boolean r1 = r0.isValueValid()
                if (r1 == 0) goto L_0x015d
                java.lang.Object r0 = r0.getValue()
                r3 = r0
                java.lang.Long r3 = (java.lang.Long) r3
            L_0x015d:
                r0 = r21
                r20 = r3
                com.yeelight.yeelib.device.xiaomi.Color4Service$v0 r4 = r0.f13376a
                r4.mo33407a(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.xiaomi.Color4Service.C7124f0.onSucceed(com.miot.common.device.invocation.PropertyInfo):void");
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color4Service$g */
    class C7125g implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7144p0 f13377a;

        C7125g(Color4Service color4Service, C7144p0 p0Var) {
            this.f13377a = p0Var;
        }

        public void onFailed(int i, String str) {
            this.f13377a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("FlowParams");
            if (property.isValueValid()) {
                this.f13377a.onSucceed((String) propertyInfo.getValue("FlowParams"));
                return;
            }
            C7144p0 p0Var = this.f13377a;
            p0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color4Service$g0 */
    class C7126g0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7154u0 f13378a;

        C7126g0(Color4Service color4Service, C7154u0 u0Var) {
            this.f13378a = u0Var;
        }

        public void onFailed(int i, String str) {
            this.f13378a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Power");
            if (property.isValueValid()) {
                this.f13378a.mo33405a(Power.valueOf((String) propertyInfo.getValue("Power")));
                return;
            }
            C7154u0 u0Var = this.f13378a;
            u0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color4Service$h */
    class C7127h implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7150s0 f13379a;

        C7127h(Color4Service color4Service, C7150s0 s0Var) {
            this.f13379a = s0Var;
        }

        public void onFailed(int i, String str) {
            this.f13379a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("LanMode");
            if (property.isValueValid()) {
                this.f13379a.mo33401a((Long) propertyInfo.getValue("LanMode"));
                return;
            }
            C7150s0 s0Var = this.f13379a;
            s0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color4Service$h0 */
    class C7128h0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7136l0 f13380a;

        C7128h0(Color4Service color4Service, C7136l0 l0Var) {
            this.f13380a = l0Var;
        }

        public void onFailed(int i, String str) {
            this.f13380a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Bright");
            if (property.isValueValid()) {
                this.f13380a.mo33387a((Long) propertyInfo.getValue("Bright"));
                return;
            }
            C7136l0 l0Var = this.f13380a;
            l0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color4Service$i */
    class C7129i implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7115b1 f13381a;

        C7129i(Color4Service color4Service, C7115b1 b1Var) {
            this.f13381a = b1Var;
        }

        public void onFailed(int i, String str) {
            this.f13381a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("onFromPower");
            if (property.isValueValid()) {
                this.f13381a.mo33370a((Long) propertyInfo.getValue("onFromPower"));
                return;
            }
            C7115b1 b1Var = this.f13381a;
            b1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color4Service$i0 */
    class C7130i0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7140n0 f13382a;

        C7130i0(Color4Service color4Service, C7140n0 n0Var) {
            this.f13382a = n0Var;
        }

        public void onFailed(int i, String str) {
            this.f13382a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Ct");
            if (property.isValueValid()) {
                this.f13382a.mo33391a((Long) propertyInfo.getValue("Ct"));
                return;
            }
            C7140n0 n0Var = this.f13382a;
            n0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color4Service$j */
    class C7131j implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7152t0 f13383a;

        C7131j(Color4Service color4Service, C7152t0 t0Var) {
            this.f13383a = t0Var;
        }

        public void onFailed(int i, String str) {
            this.f13383a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("MusicEnable");
            if (property.isValueValid()) {
                this.f13383a.mo33403a((Long) propertyInfo.getValue("MusicEnable"));
                return;
            }
            C7152t0 t0Var = this.f13383a;
            t0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color4Service$j0 */
    class C7132j0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7112a1 f13384a;

        C7132j0(Color4Service color4Service, C7112a1 a1Var) {
            this.f13384a = a1Var;
        }

        public void onFailed(int i, String str) {
            this.f13384a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Temperature");
            if (property.isValueValid()) {
                this.f13384a.mo33368a((Long) propertyInfo.getValue("Temperature"));
                return;
            }
            C7112a1 a1Var = this.f13384a;
            a1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color4Service$k */
    class C7133k implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13385a;

        C7133k(Color4Service color4Service, CompletionHandler completionHandler) {
            this.f13385a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13385a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f13385a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color4Service$k0 */
    class C7134k0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7148r0 f13386a;

        C7134k0(Color4Service color4Service, C7148r0 r0Var) {
            this.f13386a = r0Var;
        }

        public void onFailed(int i, String str) {
            this.f13386a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Hue");
            if (property.isValueValid()) {
                this.f13386a.mo33399a((Long) propertyInfo.getValue("Hue"));
                return;
            }
            C7148r0 r0Var = this.f13386a;
            r0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color4Service$l */
    class C7135l implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7164z0 f13387a;

        C7135l(Color4Service color4Service, C7164z0 z0Var) {
            this.f13387a = z0Var;
        }

        public void onFailed(int i, String str) {
            this.f13387a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("SmartSwitch");
            if (property.isValueValid()) {
                this.f13387a.mo33415a((Long) propertyInfo.getValue("SmartSwitch"));
                return;
            }
            C7164z0 z0Var = this.f13387a;
            z0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color4Service$l0 */
    public interface C7136l0 {
        /* renamed from: a */
        void mo33387a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color4Service$m */
    class C7137m implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13388a;

        C7137m(Color4Service color4Service, CompletionHandler completionHandler) {
            this.f13388a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13388a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13388a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color4Service$m0 */
    public interface C7138m0 {
        /* renamed from: a */
        void mo33389a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color4Service$n */
    class C7139n implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13389a;

        C7139n(Color4Service color4Service, CompletionHandler completionHandler) {
            this.f13389a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13389a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13389a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color4Service$n0 */
    public interface C7140n0 {
        /* renamed from: a */
        void mo33391a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color4Service$o */
    class C7141o implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13390a;

        C7141o(Color4Service color4Service, CompletionHandler completionHandler) {
            this.f13390a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13390a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13390a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color4Service$o0 */
    public interface C7142o0 {
        /* renamed from: a */
        void mo33393a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color4Service$p */
    class C7143p implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13391a;

        C7143p(Color4Service color4Service, CompletionHandler completionHandler) {
            this.f13391a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13391a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13391a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color4Service$p0 */
    public interface C7144p0 {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color4Service$q */
    class C7145q implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13392a;

        C7145q(Color4Service color4Service, CompletionHandler completionHandler) {
            this.f13392a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13392a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13392a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color4Service$q0 */
    public interface C7146q0 {
        /* renamed from: a */
        void mo33397a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color4Service$r */
    class C7147r implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13393a;

        C7147r(Color4Service color4Service, CompletionHandler completionHandler) {
            this.f13393a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13393a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13393a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color4Service$r0 */
    public interface C7148r0 {
        /* renamed from: a */
        void mo33399a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color4Service$s */
    class C7149s implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13394a;

        C7149s(Color4Service color4Service, CompletionHandler completionHandler) {
            this.f13394a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13394a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13394a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color4Service$s0 */
    public interface C7150s0 {
        /* renamed from: a */
        void mo33401a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color4Service$t */
    class C7151t implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13395a;

        C7151t(Color4Service color4Service, CompletionHandler completionHandler) {
            this.f13395a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13395a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13395a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color4Service$t0 */
    public interface C7152t0 {
        /* renamed from: a */
        void mo33403a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color4Service$u */
    class C7153u implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13396a;

        C7153u(Color4Service color4Service, CompletionHandler completionHandler) {
            this.f13396a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13396a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13396a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color4Service$u0 */
    public interface C7154u0 {
        /* renamed from: a */
        void mo33405a(Power power);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color4Service$v */
    class C7155v implements DeviceManipulator.PropertyChangedListener {

        /* renamed from: a */
        final /* synthetic */ C7118c1 f13397a;

        C7155v(Color4Service color4Service, C7118c1 c1Var) {
            this.f13397a = c1Var;
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
                case -310275194:
                    if (str3.equals("ColorMode")) {
                        c = 3;
                        break;
                    }
                    break;
                case 2193:
                    if (str3.equals("Ct")) {
                        c = 4;
                        break;
                    }
                    break;
                case 72920:
                    if (str3.equals("Hue")) {
                        c = 5;
                        break;
                    }
                    break;
                case 82093:
                    if (str3.equals("Rgb")) {
                        c = 6;
                        break;
                    }
                    break;
                case 82886:
                    if (str3.equals("Sat")) {
                        c = 7;
                        break;
                    }
                    break;
                case 35911772:
                    if (str3.equals("onFromPower")) {
                        c = 8;
                        break;
                    }
                    break;
                case 77306085:
                    if (str3.equals("Power")) {
                        c = 9;
                        break;
                    }
                    break;
                case 880790796:
                    if (str3.equals("DelayOff")) {
                        c = 10;
                        break;
                    }
                    break;
                case 898856916:
                    if (str3.equals("Flowing")) {
                        c = 11;
                        break;
                    }
                    break;
                case 1179821629:
                    if (str3.equals("SmartSwitch")) {
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
                        this.f13397a.mo33374c((Long) propertyInfo3.getValue("SaveState"));
                        return;
                    }
                    return;
                case 1:
                    PropertyInfo propertyInfo4 = propertyInfo;
                    String str5 = str2;
                    if (propertyInfo4.getProperty(str5).isValueValid()) {
                        this.f13397a.mo33376e((String) propertyInfo4.getValue(str5));
                        return;
                    }
                    return;
                case 2:
                    String str6 = "MusicEnable";
                    PropertyInfo propertyInfo5 = propertyInfo;
                    if (propertyInfo5.getProperty(str6).isValueValid()) {
                        this.f13397a.mo33384m((Long) propertyInfo5.getValue(str6));
                        return;
                    }
                    return;
                case 3:
                    PropertyInfo propertyInfo6 = propertyInfo;
                    if (propertyInfo6.getProperty("ColorMode").isValueValid()) {
                        this.f13397a.mo33383l((Long) propertyInfo6.getValue("ColorMode"));
                        return;
                    }
                    return;
                case 4:
                    PropertyInfo propertyInfo7 = propertyInfo;
                    if (propertyInfo7.getProperty("Ct").isValueValid()) {
                        this.f13397a.mo33379h((Long) propertyInfo7.getValue("Ct"));
                        return;
                    }
                    return;
                case 5:
                    PropertyInfo propertyInfo8 = propertyInfo;
                    if (propertyInfo8.getProperty("Hue").isValueValid()) {
                        this.f13397a.mo33385n((Long) propertyInfo8.getValue("Hue"));
                        return;
                    }
                    return;
                case 6:
                    PropertyInfo propertyInfo9 = propertyInfo;
                    if (propertyInfo9.getProperty("Rgb").isValueValid()) {
                        this.f13397a.mo33381j((Long) propertyInfo9.getValue("Rgb"));
                        return;
                    }
                    return;
                case 7:
                    PropertyInfo propertyInfo10 = propertyInfo;
                    if (propertyInfo10.getProperty("Sat").isValueValid()) {
                        this.f13397a.mo33382k((Long) propertyInfo10.getValue("Sat"));
                        return;
                    }
                    return;
                case 8:
                    PropertyInfo propertyInfo11 = propertyInfo;
                    if (propertyInfo11.getProperty("onFromPower").isValueValid()) {
                        this.f13397a.mo33377f((Long) propertyInfo11.getValue("onFromPower"));
                        return;
                    }
                    return;
                case 9:
                    PropertyInfo propertyInfo12 = propertyInfo;
                    if (propertyInfo12.getProperty("Power").isValueValid()) {
                        this.f13397a.mo33380i(Power.valueOf((String) propertyInfo12.getValue("Power")));
                        return;
                    }
                    return;
                case 10:
                    PropertyInfo propertyInfo13 = propertyInfo;
                    if (propertyInfo13.getProperty("DelayOff").isValueValid()) {
                        this.f13397a.mo33373b((Long) propertyInfo13.getValue("DelayOff"));
                        return;
                    }
                    return;
                case 11:
                    PropertyInfo propertyInfo14 = propertyInfo;
                    if (propertyInfo14.getProperty("Flowing").isValueValid()) {
                        this.f13397a.mo33375d((Long) propertyInfo14.getValue("Flowing"));
                        return;
                    }
                    return;
                case 12:
                    PropertyInfo propertyInfo15 = propertyInfo;
                    if (propertyInfo15.getProperty("SmartSwitch").isValueValid()) {
                        this.f13397a.mo33386o((Long) propertyInfo15.getValue("SmartSwitch"));
                        return;
                    }
                    return;
                case 13:
                    PropertyInfo propertyInfo16 = propertyInfo;
                    if (propertyInfo16.getProperty("LanMode").isValueValid()) {
                        this.f13397a.mo33378g((Long) propertyInfo16.getValue("LanMode"));
                        return;
                    }
                    return;
                case 14:
                    PropertyInfo propertyInfo17 = propertyInfo;
                    if (propertyInfo17.getProperty("Bright").isValueValid()) {
                        this.f13397a.mo33372a((Long) propertyInfo17.getValue("Bright"));
                        return;
                    }
                    break;
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color4Service$v0 */
    public interface C7156v0 {
        /* renamed from: a */
        void mo33407a(Power power, Long l, Long l2, Long l3, Long l4, Long l5, Long l6, Long l7, Long l8, Long l9, Long l10, String str, Long l11, Long l12, Long l13, Long l14);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color4Service$w */
    class C7157w implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13398a;

        C7157w(Color4Service color4Service, CompletionHandler completionHandler) {
            this.f13398a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13398a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13398a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color4Service$w0 */
    public interface C7158w0 {
        /* renamed from: a */
        void mo33409a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color4Service$x */
    class C7159x implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13399a;

        C7159x(Color4Service color4Service, CompletionHandler completionHandler) {
            this.f13399a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13399a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13399a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color4Service$x0 */
    public interface C7160x0 {
        /* renamed from: a */
        void mo33411a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color4Service$y */
    class C7161y implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13400a;

        C7161y(Color4Service color4Service, CompletionHandler completionHandler) {
            this.f13400a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13400a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13400a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color4Service$y0 */
    public interface C7162y0 {
        /* renamed from: a */
        void mo33413a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color4Service$z */
    class C7163z implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13401a;

        C7163z(Color4Service color4Service, CompletionHandler completionHandler) {
            this.f13401a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13401a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13401a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color4Service$z0 */
    public interface C7164z0 {
        /* renamed from: a */
        void mo33415a(Long l);

        void onFailed(int i, String str);
    }

    public Color4Service(AbstractDevice abstractDevice) {
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
                MiotManager.getDeviceManipulator().invoke(create, new C7157w(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7141o(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7137m(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7117c0(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getBright(C7136l0 l0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Bright"), new C7128h0(this, l0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getColorMode(C7138m0 m0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "ColorMode"), new C7116c(this, m0Var));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7114b0(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getCt(C7140n0 n0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Ct"), new C7130i0(this, n0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getDelayOff(C7142o0 o0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "DelayOff"), new C7121e(this, o0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowParams(C7144p0 p0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "FlowParams"), new C7125g(this, p0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowing(C7146q0 q0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Flowing"), new C7113b(this, q0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getHue(C7148r0 r0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Hue"), new C7134k0(this, r0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getLanMode(C7150s0 s0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "LanMode"), new C7127h(this, s0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getMusicEnable(C7152t0 t0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "MusicEnable"), new C7131j(this, t0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getPower(C7154u0 u0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Power"), new C7126g0(this, u0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getProperties(C7156v0 v0Var) {
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
            create.addProperty(getService().getProperty("SmartSwitch"));
            MiotManager.getDeviceManipulator().readProperty(create, new C7124f0(this, v0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getRgb(C7158w0 w0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Rgb"), new C7119d(this, w0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getSat(C7160x0 x0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Sat"), new C7110a(this, x0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getSaveState(C7162y0 y0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "SaveState"), new C7123f(this, y0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getSmartSwitch(C7164z0 z0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "SmartSwitch"), new C7135l(this, z0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getTemperature(C7112a1 a1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Temperature"), new C7132j0(this, a1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getonFromPower(C7115b1 b1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "onFromPower"), new C7129i(this, b1Var));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7147r(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7143p(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7161y(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7139n(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7111a0(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7159x(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7163z(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7149s(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7151t(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7145q(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7120d0(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void subscribeNotifications(CompletionHandler completionHandler, C7118c1 c1Var) {
        if (completionHandler == null) {
            throw new IllegalArgumentException("handler is null");
        } else if (c1Var != null) {
            PropertyInfo create = PropertyInfoFactory.create(getService());
            for (Property next : getService().getProperties()) {
                if (next.getDefinition().isNotifiable()) {
                    create.addProperty(next);
                }
            }
            MiotManager.getDeviceManipulator().addPropertyChangedListener(create, new C7133k(this, completionHandler), new C7155v(this, c1Var));
        } else {
            throw new IllegalArgumentException("listener is null");
        }
    }

    public void toggle(CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "toggle");
            if (create != null) {
                MiotManager.getDeviceManipulator().invoke(create, new C7153u(this, completionHandler));
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
            MiotManager.getDeviceManipulator().removePropertyChangedListener(create, new C7122e0(this, completionHandler));
            return;
        }
        throw new IllegalArgumentException("handler is null");
    }
}
