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

public class Lamp10Service extends AbstractService {
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
    public static final String PROPERTY_IndicatorEnable = "IndicatorEnable";
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
    public static final String PROPERTY_Temperature = "Temperature";
    public static final String PROPERTY_onFromPower = "onFromPower";
    private static final String TAG = "Lamp10Service";
    private AbstractDevice mDevice = null;

    public enum CmdKey {
        undefined,
        cfg_pomodoro,
        cfg_lan_ctrl,
        cfg_save_state,
        cfg_init_power,
        cfg_indicator,
        nighttime
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

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp10Service$a */
    class C7351a implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7356b1 f13535a;

        C7351a(Lamp10Service lamp10Service, C7356b1 b1Var) {
            this.f13535a = b1Var;
        }

        public void onFailed(int i, String str) {
            this.f13535a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Sat");
            if (property.isValueValid()) {
                this.f13535a.mo33737a((Long) propertyInfo.getValue("Sat"));
                return;
            }
            C7356b1 b1Var = this.f13535a;
            b1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp10Service$a0 */
    class C7352a0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13536a;

        C7352a0(Lamp10Service lamp10Service, CompletionHandler completionHandler) {
            this.f13536a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13536a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13536a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp10Service$a1 */
    public interface C7353a1 {
        /* renamed from: a */
        void mo33735a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp10Service$b */
    class C7354b implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7394s0 f13537a;

        C7354b(Lamp10Service lamp10Service, C7394s0 s0Var) {
            this.f13537a = s0Var;
        }

        public void onFailed(int i, String str) {
            this.f13537a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Flowing");
            if (property.isValueValid()) {
                this.f13537a.mo33771a((Long) propertyInfo.getValue("Flowing"));
                return;
            }
            C7394s0 s0Var = this.f13537a;
            s0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp10Service$b0 */
    class C7355b0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13538a;

        C7355b0(Lamp10Service lamp10Service, CompletionHandler completionHandler) {
            this.f13538a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13538a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13538a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp10Service$b1 */
    public interface C7356b1 {
        /* renamed from: a */
        void mo33737a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp10Service$c */
    class C7357c implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7386o0 f13539a;

        C7357c(Lamp10Service lamp10Service, C7386o0 o0Var) {
            this.f13539a = o0Var;
        }

        public void onFailed(int i, String str) {
            this.f13539a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("ColorMode");
            if (property.isValueValid()) {
                this.f13539a.mo33763a((Long) propertyInfo.getValue("ColorMode"));
                return;
            }
            C7386o0 o0Var = this.f13539a;
            o0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp10Service$c0 */
    class C7358c0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13540a;

        C7358c0(Lamp10Service lamp10Service, CompletionHandler completionHandler) {
            this.f13540a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13540a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13540a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp10Service$c1 */
    public interface C7359c1 {
        /* renamed from: a */
        void mo33739a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp10Service$d */
    class C7360d implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7353a1 f13541a;

        C7360d(Lamp10Service lamp10Service, C7353a1 a1Var) {
            this.f13541a = a1Var;
        }

        public void onFailed(int i, String str) {
            this.f13541a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Rgb");
            if (property.isValueValid()) {
                this.f13541a.mo33735a((Long) propertyInfo.getValue("Rgb"));
                return;
            }
            C7353a1 a1Var = this.f13541a;
            a1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp10Service$d0 */
    class C7361d0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13542a;

        C7361d0(Lamp10Service lamp10Service, CompletionHandler completionHandler) {
            this.f13542a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13542a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13542a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp10Service$d1 */
    public interface C7362d1 {
        /* renamed from: a */
        void mo33741a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp10Service$e */
    class C7363e implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7390q0 f13543a;

        C7363e(Lamp10Service lamp10Service, C7390q0 q0Var) {
            this.f13543a = q0Var;
        }

        public void onFailed(int i, String str) {
            this.f13543a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("DelayOff");
            if (property.isValueValid()) {
                this.f13543a.mo33767a((Long) propertyInfo.getValue("DelayOff"));
                return;
            }
            C7390q0 q0Var = this.f13543a;
            q0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp10Service$e0 */
    class C7364e0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13544a;

        C7364e0(Lamp10Service lamp10Service, CompletionHandler completionHandler) {
            this.f13544a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13544a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13544a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp10Service$e1 */
    public interface C7365e1 {
        /* renamed from: a */
        void mo33743a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp10Service$f */
    class C7366f implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7359c1 f13545a;

        C7366f(Lamp10Service lamp10Service, C7359c1 c1Var) {
            this.f13545a = c1Var;
        }

        public void onFailed(int i, String str) {
            this.f13545a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("SaveState");
            if (property.isValueValid()) {
                this.f13545a.mo33739a((Long) propertyInfo.getValue("SaveState"));
                return;
            }
            C7359c1 c1Var = this.f13545a;
            c1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp10Service$f0 */
    class C7367f0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13546a;

        C7367f0(Lamp10Service lamp10Service, CompletionHandler completionHandler) {
            this.f13546a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13546a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13546a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp10Service$f1 */
    public interface C7368f1 {
        /* renamed from: a */
        void mo33745a(Long l);

        /* renamed from: b */
        void mo33746b(Long l);

        /* renamed from: c */
        void mo33747c(Long l);

        /* renamed from: d */
        void mo33748d(Long l);

        /* renamed from: e */
        void mo33749e(String str);

        /* renamed from: f */
        void mo33750f(Long l);

        /* renamed from: g */
        void mo33751g(Long l);

        /* renamed from: h */
        void mo33752h(Long l);

        /* renamed from: i */
        void mo33753i(String str);

        /* renamed from: j */
        void mo33754j(Long l);

        /* renamed from: k */
        void mo33755k(Long l);

        /* renamed from: l */
        void mo33756l(Long l);

        /* renamed from: m */
        void mo33757m(Long l);

        /* renamed from: n */
        void mo33758n(Long l);

        /* renamed from: o */
        void mo33759o(String str);

        /* renamed from: p */
        void mo33760p(Power power);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp10Service$g */
    class C7369g implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7392r0 f13547a;

        C7369g(Lamp10Service lamp10Service, C7392r0 r0Var) {
            this.f13547a = r0Var;
        }

        public void onFailed(int i, String str) {
            this.f13547a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("FlowParams");
            if (property.isValueValid()) {
                this.f13547a.onSucceed((String) propertyInfo.getValue("FlowParams"));
                return;
            }
            C7392r0 r0Var = this.f13547a;
            r0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp10Service$g0 */
    class C7370g0 implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13548a;

        C7370g0(Lamp10Service lamp10Service, CompletionHandler completionHandler) {
            this.f13548a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13548a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f13548a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp10Service$h */
    class C7371h implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7400v0 f13549a;

        C7371h(Lamp10Service lamp10Service, C7400v0 v0Var) {
            this.f13549a = v0Var;
        }

        public void onFailed(int i, String str) {
            this.f13549a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("LanMode");
            if (property.isValueValid()) {
                this.f13549a.mo33777a((Long) propertyInfo.getValue("LanMode"));
                return;
            }
            C7400v0 v0Var = this.f13549a;
            v0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp10Service$h0 */
    class C7372h0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7408z0 f13550a;

        C7372h0(Lamp10Service lamp10Service, C7408z0 z0Var) {
            this.f13550a = z0Var;
        }

        public void onFailed(int i, String str) {
            this.f13550a.onFailed(i, str);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.String} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onSucceed(com.miot.common.device.invocation.PropertyInfo r23) {
            /*
                r22 = this;
                r0 = r23
                java.lang.String r1 = "Power"
                com.miot.common.property.Property r1 = r0.getProperty(r1)
                boolean r2 = r1.isValueValid()
                r3 = 0
                if (r2 == 0) goto L_0x001b
                java.lang.Object r1 = r1.getValue()
                java.lang.String r1 = (java.lang.String) r1
                com.yeelight.yeelib.device.xiaomi.Lamp10Service$Power r1 = com.yeelight.yeelib.device.xiaomi.Lamp10Service.Power.valueOf(r1)
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
                java.lang.String r1 = "IndicatorEnable"
                com.miot.common.property.Property r1 = r0.getProperty(r1)
                boolean r2 = r1.isValueValid()
                if (r2 == 0) goto L_0x015f
                java.lang.Object r1 = r1.getValue()
                java.lang.String r1 = (java.lang.String) r1
                r20 = r1
                goto L_0x0161
            L_0x015f:
                r20 = r3
            L_0x0161:
                java.lang.String r1 = "NightTimeInfo"
                com.miot.common.property.Property r0 = r0.getProperty(r1)
                boolean r1 = r0.isValueValid()
                if (r1 == 0) goto L_0x0174
                java.lang.Object r0 = r0.getValue()
                r3 = r0
                java.lang.String r3 = (java.lang.String) r3
            L_0x0174:
                r0 = r22
                r21 = r3
                com.yeelight.yeelib.device.xiaomi.Lamp10Service$z0 r4 = r0.f13550a
                r4.mo33785a(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.xiaomi.Lamp10Service.C7372h0.onSucceed(com.miot.common.device.invocation.PropertyInfo):void");
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp10Service$i */
    class C7373i implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7365e1 f13551a;

        C7373i(Lamp10Service lamp10Service, C7365e1 e1Var) {
            this.f13551a = e1Var;
        }

        public void onFailed(int i, String str) {
            this.f13551a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("onFromPower");
            if (property.isValueValid()) {
                this.f13551a.mo33743a((Long) propertyInfo.getValue("onFromPower"));
                return;
            }
            C7365e1 e1Var = this.f13551a;
            e1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp10Service$i0 */
    class C7374i0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7406y0 f13552a;

        C7374i0(Lamp10Service lamp10Service, C7406y0 y0Var) {
            this.f13552a = y0Var;
        }

        public void onFailed(int i, String str) {
            this.f13552a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Power");
            if (property.isValueValid()) {
                this.f13552a.mo33783a(Power.valueOf((String) propertyInfo.getValue("Power")));
                return;
            }
            C7406y0 y0Var = this.f13552a;
            y0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp10Service$j */
    class C7375j implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7402w0 f13553a;

        C7375j(Lamp10Service lamp10Service, C7402w0 w0Var) {
            this.f13553a = w0Var;
        }

        public void onFailed(int i, String str) {
            this.f13553a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("MusicEnable");
            if (property.isValueValid()) {
                this.f13553a.mo33779a((Long) propertyInfo.getValue("MusicEnable"));
                return;
            }
            C7402w0 w0Var = this.f13553a;
            w0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp10Service$j0 */
    class C7376j0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7384n0 f13554a;

        C7376j0(Lamp10Service lamp10Service, C7384n0 n0Var) {
            this.f13554a = n0Var;
        }

        public void onFailed(int i, String str) {
            this.f13554a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Bright");
            if (property.isValueValid()) {
                this.f13554a.mo33761a((Long) propertyInfo.getValue("Bright"));
                return;
            }
            C7384n0 n0Var = this.f13554a;
            n0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp10Service$k */
    class C7377k implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13555a;

        C7377k(Lamp10Service lamp10Service, CompletionHandler completionHandler) {
            this.f13555a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13555a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f13555a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp10Service$k0 */
    class C7378k0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7388p0 f13556a;

        C7378k0(Lamp10Service lamp10Service, C7388p0 p0Var) {
            this.f13556a = p0Var;
        }

        public void onFailed(int i, String str) {
            this.f13556a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Ct");
            if (property.isValueValid()) {
                this.f13556a.mo33765a((Long) propertyInfo.getValue("Ct"));
                return;
            }
            C7388p0 p0Var = this.f13556a;
            p0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp10Service$l */
    class C7379l implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7398u0 f13557a;

        C7379l(Lamp10Service lamp10Service, C7398u0 u0Var) {
            this.f13557a = u0Var;
        }

        public void onFailed(int i, String str) {
            this.f13557a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty(Lamp10Service.PROPERTY_IndicatorEnable);
            if (property.isValueValid()) {
                this.f13557a.onSucceed((String) propertyInfo.getValue(Lamp10Service.PROPERTY_IndicatorEnable));
                return;
            }
            C7398u0 u0Var = this.f13557a;
            u0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp10Service$l0 */
    class C7380l0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7362d1 f13558a;

        C7380l0(Lamp10Service lamp10Service, C7362d1 d1Var) {
            this.f13558a = d1Var;
        }

        public void onFailed(int i, String str) {
            this.f13558a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Temperature");
            if (property.isValueValid()) {
                this.f13558a.mo33741a((Long) propertyInfo.getValue("Temperature"));
                return;
            }
            C7362d1 d1Var = this.f13558a;
            d1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp10Service$m */
    class C7381m implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7404x0 f13559a;

        C7381m(Lamp10Service lamp10Service, C7404x0 x0Var) {
            this.f13559a = x0Var;
        }

        public void onFailed(int i, String str) {
            this.f13559a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("NightTimeInfo");
            if (property.isValueValid()) {
                this.f13559a.onSucceed((String) propertyInfo.getValue("NightTimeInfo"));
                return;
            }
            C7404x0 x0Var = this.f13559a;
            x0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp10Service$m0 */
    class C7382m0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7396t0 f13560a;

        C7382m0(Lamp10Service lamp10Service, C7396t0 t0Var) {
            this.f13560a = t0Var;
        }

        public void onFailed(int i, String str) {
            this.f13560a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Hue");
            if (property.isValueValid()) {
                this.f13560a.mo33773a((Long) propertyInfo.getValue("Hue"));
                return;
            }
            C7396t0 t0Var = this.f13560a;
            t0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp10Service$n */
    class C7383n implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13561a;

        C7383n(Lamp10Service lamp10Service, CompletionHandler completionHandler) {
            this.f13561a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13561a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13561a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp10Service$n0 */
    public interface C7384n0 {
        /* renamed from: a */
        void mo33761a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp10Service$o */
    class C7385o implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13562a;

        C7385o(Lamp10Service lamp10Service, CompletionHandler completionHandler) {
            this.f13562a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13562a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13562a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp10Service$o0 */
    public interface C7386o0 {
        /* renamed from: a */
        void mo33763a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp10Service$p */
    class C7387p implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13563a;

        C7387p(Lamp10Service lamp10Service, CompletionHandler completionHandler) {
            this.f13563a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13563a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13563a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp10Service$p0 */
    public interface C7388p0 {
        /* renamed from: a */
        void mo33765a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp10Service$q */
    class C7389q implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13564a;

        C7389q(Lamp10Service lamp10Service, CompletionHandler completionHandler) {
            this.f13564a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13564a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13564a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp10Service$q0 */
    public interface C7390q0 {
        /* renamed from: a */
        void mo33767a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp10Service$r */
    class C7391r implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13565a;

        C7391r(Lamp10Service lamp10Service, CompletionHandler completionHandler) {
            this.f13565a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13565a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13565a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp10Service$r0 */
    public interface C7392r0 {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp10Service$s */
    class C7393s implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13566a;

        C7393s(Lamp10Service lamp10Service, CompletionHandler completionHandler) {
            this.f13566a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13566a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13566a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp10Service$s0 */
    public interface C7394s0 {
        /* renamed from: a */
        void mo33771a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp10Service$t */
    class C7395t implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13567a;

        C7395t(Lamp10Service lamp10Service, CompletionHandler completionHandler) {
            this.f13567a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13567a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13567a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp10Service$t0 */
    public interface C7396t0 {
        /* renamed from: a */
        void mo33773a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp10Service$u */
    class C7397u implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13568a;

        C7397u(Lamp10Service lamp10Service, CompletionHandler completionHandler) {
            this.f13568a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13568a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13568a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp10Service$u0 */
    public interface C7398u0 {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp10Service$v */
    class C7399v implements DeviceManipulator.PropertyChangedListener {

        /* renamed from: a */
        final /* synthetic */ C7368f1 f13569a;

        C7399v(Lamp10Service lamp10Service, C7368f1 f1Var) {
            this.f13569a = f1Var;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:100:0x029b, code lost:
            if (r2.getProperty("SaveState").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:101:0x029d, code lost:
            r3.f13569a.mo33747c((java.lang.Long) r2.getValue("SaveState"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:102:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:103:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:104:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:105:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:106:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:107:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:108:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:109:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:110:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:111:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:112:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:113:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:114:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:115:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:116:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:117:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:118:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:119:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:120:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:121:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:122:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:123:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:124:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:125:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:126:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:127:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:128:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:129:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:130:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:131:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:132:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:133:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0036, code lost:
            r3 = r16;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0038, code lost:
            r16 = "NightTimeInfo";
            r0 = r17;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:52:0x00ef, code lost:
            switch(r18) {
                case 0: goto L_0x028f;
                case 1: goto L_0x0275;
                case 2: goto L_0x025a;
                case 3: goto L_0x023e;
                case 4: goto L_0x0223;
                case 5: goto L_0x0208;
                case 6: goto L_0x01ed;
                case 7: goto L_0x01d2;
                case 8: goto L_0x01b7;
                case 9: goto L_0x019c;
                case 10: goto L_0x017d;
                case 11: goto L_0x0162;
                case 12: goto L_0x0147;
                case 13: goto L_0x012c;
                case 14: goto L_0x0111;
                case 15: goto L_0x00f6;
                default: goto L_0x00f2;
            };
         */
        /* JADX WARNING: Code restructure failed: missing block: B:53:0x00f2, code lost:
            r3 = r19;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:54:0x00f6, code lost:
            r2 = r20;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:55:0x0100, code lost:
            if (r2.getProperty("Bright").isValueValid() == false) goto L_0x00f2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:56:0x0102, code lost:
            r19.f13569a.mo33745a((java.lang.Long) r2.getValue("Bright"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:57:0x0111, code lost:
            r3 = r19;
            r2 = r20;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:58:0x011d, code lost:
            if (r2.getProperty(com.yeelight.yeelib.device.xiaomi.Lamp10Service.PROPERTY_IndicatorEnable).isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:59:0x011f, code lost:
            r3.f13569a.mo33759o((java.lang.String) r2.getValue(com.yeelight.yeelib.device.xiaomi.Lamp10Service.PROPERTY_IndicatorEnable));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:60:0x012c, code lost:
            r3 = r19;
            r2 = r20;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:61:0x0138, code lost:
            if (r2.getProperty("LanMode").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:62:0x013a, code lost:
            r3.f13569a.mo33751g((java.lang.Long) r2.getValue("LanMode"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:63:0x0147, code lost:
            r3 = r19;
            r2 = r20;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:64:0x0153, code lost:
            if (r2.getProperty("Flowing").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:65:0x0155, code lost:
            r3.f13569a.mo33748d((java.lang.Long) r2.getValue("Flowing"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:66:0x0162, code lost:
            r3 = r19;
            r2 = r20;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:67:0x016e, code lost:
            if (r2.getProperty("DelayOff").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:68:0x0170, code lost:
            r3.f13569a.mo33746b((java.lang.Long) r2.getValue("DelayOff"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:69:0x017d, code lost:
            r3 = r19;
            r2 = r20;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:70:0x0189, code lost:
            if (r2.getProperty("Power").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:71:0x018b, code lost:
            r3.f13569a.mo33760p(com.yeelight.yeelib.device.xiaomi.Lamp10Service.Power.valueOf((java.lang.String) r2.getValue("Power")));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:72:0x019c, code lost:
            r3 = r19;
            r2 = r20;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:73:0x01a8, code lost:
            if (r2.getProperty("onFromPower").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:74:0x01aa, code lost:
            r3.f13569a.mo33750f((java.lang.Long) r2.getValue("onFromPower"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:75:0x01b7, code lost:
            r3 = r19;
            r2 = r20;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:76:0x01c3, code lost:
            if (r2.getProperty("Sat").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:77:0x01c5, code lost:
            r3.f13569a.mo33755k((java.lang.Long) r2.getValue("Sat"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:78:0x01d2, code lost:
            r3 = r19;
            r2 = r20;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:79:0x01de, code lost:
            if (r2.getProperty("Rgb").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:80:0x01e0, code lost:
            r3.f13569a.mo33754j((java.lang.Long) r2.getValue("Rgb"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:81:0x01ed, code lost:
            r3 = r19;
            r2 = r20;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:82:0x01f9, code lost:
            if (r2.getProperty("Hue").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:83:0x01fb, code lost:
            r3.f13569a.mo33758n((java.lang.Long) r2.getValue("Hue"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:84:0x0208, code lost:
            r3 = r19;
            r2 = r20;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:85:0x0214, code lost:
            if (r2.getProperty("Ct").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:86:0x0216, code lost:
            r3.f13569a.mo33752h((java.lang.Long) r2.getValue("Ct"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:87:0x0223, code lost:
            r3 = r19;
            r2 = r20;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:88:0x022f, code lost:
            if (r2.getProperty("ColorMode").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:89:0x0231, code lost:
            r3.f13569a.mo33756l((java.lang.Long) r2.getValue("ColorMode"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:90:0x023e, code lost:
            r3 = r19;
            r2 = r20;
            r0 = r16;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:91:0x024c, code lost:
            if (r2.getProperty(r0).isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:92:0x024e, code lost:
            r3.f13569a.mo33753i((java.lang.String) r2.getValue(r0));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:93:0x025a, code lost:
            r2 = r20;
            r0 = r3;
            r3 = r19;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:94:0x0267, code lost:
            if (r2.getProperty(r0).isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:95:0x0269, code lost:
            r3.f13569a.mo33757m((java.lang.Long) r2.getValue(r0));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:96:0x0275, code lost:
            r3 = r19;
            r2 = r20;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:97:0x0281, code lost:
            if (r2.getProperty(r0).isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:98:0x0283, code lost:
            r3.f13569a.mo33749e((java.lang.String) r2.getValue(r0));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:99:0x028f, code lost:
            r3 = r19;
            r2 = r20;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onPropertyChanged(com.miot.common.device.invocation.PropertyInfo r20, java.lang.String r21) {
            /*
                r19 = this;
                r0 = r19
                r1 = r20
                r2 = r21
                r21.hashCode()
                int r3 = r21.hashCode()
                java.lang.String r4 = "Bright"
                java.lang.String r5 = "IndicatorEnable"
                java.lang.String r6 = "LanMode"
                java.lang.String r7 = "Flowing"
                java.lang.String r8 = "DelayOff"
                java.lang.String r9 = "Power"
                java.lang.String r10 = "onFromPower"
                java.lang.String r11 = "Sat"
                java.lang.String r12 = "Rgb"
                java.lang.String r13 = "Hue"
                java.lang.String r14 = "Ct"
                java.lang.String r15 = "ColorMode"
                java.lang.String r0 = "NightTimeInfo"
                java.lang.String r1 = "MusicEnable"
                r16 = r1
                java.lang.String r1 = "FlowParams"
                r17 = r1
                java.lang.String r1 = "SaveState"
                r18 = -1
                switch(r3) {
                    case -2117953292: goto L_0x00e0;
                    case -2002016140: goto L_0x00d0;
                    case -1787381784: goto L_0x00c2;
                    case -1331143373: goto L_0x00b6;
                    case -310275194: goto L_0x00ac;
                    case 2193: goto L_0x00a2;
                    case 72920: goto L_0x0098;
                    case 82093: goto L_0x008e;
                    case 82886: goto L_0x0084;
                    case 35911772: goto L_0x007a;
                    case 77306085: goto L_0x0070;
                    case 880790796: goto L_0x0066;
                    case 898856916: goto L_0x005c;
                    case 1611821756: goto L_0x0052;
                    case 1750302802: goto L_0x0048;
                    case 1998035738: goto L_0x003e;
                    default: goto L_0x0036;
                }
            L_0x0036:
                r3 = r16
            L_0x0038:
                r16 = r0
                r0 = r17
                goto L_0x00ef
            L_0x003e:
                boolean r2 = r2.equals(r4)
                if (r2 != 0) goto L_0x0045
                goto L_0x0036
            L_0x0045:
                r18 = 15
                goto L_0x0036
            L_0x0048:
                boolean r2 = r2.equals(r5)
                if (r2 != 0) goto L_0x004f
                goto L_0x0036
            L_0x004f:
                r18 = 14
                goto L_0x0036
            L_0x0052:
                boolean r2 = r2.equals(r6)
                if (r2 != 0) goto L_0x0059
                goto L_0x0036
            L_0x0059:
                r18 = 13
                goto L_0x0036
            L_0x005c:
                boolean r2 = r2.equals(r7)
                if (r2 != 0) goto L_0x0063
                goto L_0x0036
            L_0x0063:
                r18 = 12
                goto L_0x0036
            L_0x0066:
                boolean r2 = r2.equals(r8)
                if (r2 != 0) goto L_0x006d
                goto L_0x0036
            L_0x006d:
                r18 = 11
                goto L_0x0036
            L_0x0070:
                boolean r2 = r2.equals(r9)
                if (r2 != 0) goto L_0x0077
                goto L_0x0036
            L_0x0077:
                r18 = 10
                goto L_0x0036
            L_0x007a:
                boolean r2 = r2.equals(r10)
                if (r2 != 0) goto L_0x0081
                goto L_0x0036
            L_0x0081:
                r18 = 9
                goto L_0x0036
            L_0x0084:
                boolean r2 = r2.equals(r11)
                if (r2 != 0) goto L_0x008b
                goto L_0x0036
            L_0x008b:
                r18 = 8
                goto L_0x0036
            L_0x008e:
                boolean r2 = r2.equals(r12)
                if (r2 != 0) goto L_0x0095
                goto L_0x0036
            L_0x0095:
                r18 = 7
                goto L_0x0036
            L_0x0098:
                boolean r2 = r2.equals(r13)
                if (r2 != 0) goto L_0x009f
                goto L_0x0036
            L_0x009f:
                r18 = 6
                goto L_0x0036
            L_0x00a2:
                boolean r2 = r2.equals(r14)
                if (r2 != 0) goto L_0x00a9
                goto L_0x0036
            L_0x00a9:
                r18 = 5
                goto L_0x0036
            L_0x00ac:
                boolean r2 = r2.equals(r15)
                if (r2 != 0) goto L_0x00b3
                goto L_0x0036
            L_0x00b3:
                r18 = 4
                goto L_0x0036
            L_0x00b6:
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L_0x00be
                goto L_0x0036
            L_0x00be:
                r18 = 3
                goto L_0x0036
            L_0x00c2:
                r3 = r16
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L_0x00cc
                goto L_0x0038
            L_0x00cc:
                r18 = 2
                goto L_0x0038
            L_0x00d0:
                r3 = r16
                r16 = r0
                r0 = r17
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L_0x00dd
                goto L_0x00ef
            L_0x00dd:
                r18 = 1
                goto L_0x00ef
            L_0x00e0:
                r3 = r16
                r16 = r0
                r0 = r17
                boolean r2 = r2.equals(r1)
                if (r2 != 0) goto L_0x00ed
                goto L_0x00ef
            L_0x00ed:
                r18 = 0
            L_0x00ef:
                switch(r18) {
                    case 0: goto L_0x028f;
                    case 1: goto L_0x0275;
                    case 2: goto L_0x025a;
                    case 3: goto L_0x023e;
                    case 4: goto L_0x0223;
                    case 5: goto L_0x0208;
                    case 6: goto L_0x01ed;
                    case 7: goto L_0x01d2;
                    case 8: goto L_0x01b7;
                    case 9: goto L_0x019c;
                    case 10: goto L_0x017d;
                    case 11: goto L_0x0162;
                    case 12: goto L_0x0147;
                    case 13: goto L_0x012c;
                    case 14: goto L_0x0111;
                    case 15: goto L_0x00f6;
                    default: goto L_0x00f2;
                }
            L_0x00f2:
                r3 = r19
                goto L_0x02a8
            L_0x00f6:
                r2 = r20
                com.miot.common.property.Property r0 = r2.getProperty(r4)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x00f2
                java.lang.Object r0 = r2.getValue(r4)
                java.lang.Long r0 = (java.lang.Long) r0
                r3 = r19
                com.yeelight.yeelib.device.xiaomi.Lamp10Service$f1 r1 = r3.f13569a
                r1.mo33745a(r0)
                goto L_0x02a8
            L_0x0111:
                r3 = r19
                r2 = r20
                com.miot.common.property.Property r0 = r2.getProperty(r5)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x02a8
                java.lang.Object r0 = r2.getValue(r5)
                java.lang.String r0 = (java.lang.String) r0
                com.yeelight.yeelib.device.xiaomi.Lamp10Service$f1 r1 = r3.f13569a
                r1.mo33759o(r0)
                goto L_0x02a8
            L_0x012c:
                r3 = r19
                r2 = r20
                com.miot.common.property.Property r0 = r2.getProperty(r6)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x02a8
                java.lang.Object r0 = r2.getValue(r6)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Lamp10Service$f1 r1 = r3.f13569a
                r1.mo33751g(r0)
                goto L_0x02a8
            L_0x0147:
                r3 = r19
                r2 = r20
                com.miot.common.property.Property r0 = r2.getProperty(r7)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x02a8
                java.lang.Object r0 = r2.getValue(r7)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Lamp10Service$f1 r1 = r3.f13569a
                r1.mo33748d(r0)
                goto L_0x02a8
            L_0x0162:
                r3 = r19
                r2 = r20
                com.miot.common.property.Property r0 = r2.getProperty(r8)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x02a8
                java.lang.Object r0 = r2.getValue(r8)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Lamp10Service$f1 r1 = r3.f13569a
                r1.mo33746b(r0)
                goto L_0x02a8
            L_0x017d:
                r3 = r19
                r2 = r20
                com.miot.common.property.Property r0 = r2.getProperty(r9)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x02a8
                java.lang.Object r0 = r2.getValue(r9)
                java.lang.String r0 = (java.lang.String) r0
                com.yeelight.yeelib.device.xiaomi.Lamp10Service$Power r0 = com.yeelight.yeelib.device.xiaomi.Lamp10Service.Power.valueOf(r0)
                com.yeelight.yeelib.device.xiaomi.Lamp10Service$f1 r1 = r3.f13569a
                r1.mo33760p(r0)
                goto L_0x02a8
            L_0x019c:
                r3 = r19
                r2 = r20
                com.miot.common.property.Property r0 = r2.getProperty(r10)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x02a8
                java.lang.Object r0 = r2.getValue(r10)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Lamp10Service$f1 r1 = r3.f13569a
                r1.mo33750f(r0)
                goto L_0x02a8
            L_0x01b7:
                r3 = r19
                r2 = r20
                com.miot.common.property.Property r0 = r2.getProperty(r11)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x02a8
                java.lang.Object r0 = r2.getValue(r11)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Lamp10Service$f1 r1 = r3.f13569a
                r1.mo33755k(r0)
                goto L_0x02a8
            L_0x01d2:
                r3 = r19
                r2 = r20
                com.miot.common.property.Property r0 = r2.getProperty(r12)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x02a8
                java.lang.Object r0 = r2.getValue(r12)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Lamp10Service$f1 r1 = r3.f13569a
                r1.mo33754j(r0)
                goto L_0x02a8
            L_0x01ed:
                r3 = r19
                r2 = r20
                com.miot.common.property.Property r0 = r2.getProperty(r13)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x02a8
                java.lang.Object r0 = r2.getValue(r13)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Lamp10Service$f1 r1 = r3.f13569a
                r1.mo33758n(r0)
                goto L_0x02a8
            L_0x0208:
                r3 = r19
                r2 = r20
                com.miot.common.property.Property r0 = r2.getProperty(r14)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x02a8
                java.lang.Object r0 = r2.getValue(r14)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Lamp10Service$f1 r1 = r3.f13569a
                r1.mo33752h(r0)
                goto L_0x02a8
            L_0x0223:
                r3 = r19
                r2 = r20
                com.miot.common.property.Property r0 = r2.getProperty(r15)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x02a8
                java.lang.Object r0 = r2.getValue(r15)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Lamp10Service$f1 r1 = r3.f13569a
                r1.mo33756l(r0)
                goto L_0x02a8
            L_0x023e:
                r3 = r19
                r2 = r20
                r0 = r16
                com.miot.common.property.Property r1 = r2.getProperty(r0)
                boolean r1 = r1.isValueValid()
                if (r1 == 0) goto L_0x02a8
                java.lang.Object r0 = r2.getValue(r0)
                java.lang.String r0 = (java.lang.String) r0
                com.yeelight.yeelib.device.xiaomi.Lamp10Service$f1 r1 = r3.f13569a
                r1.mo33753i(r0)
                goto L_0x02a8
            L_0x025a:
                r2 = r20
                r0 = r3
                r3 = r19
                com.miot.common.property.Property r1 = r2.getProperty(r0)
                boolean r1 = r1.isValueValid()
                if (r1 == 0) goto L_0x02a8
                java.lang.Object r0 = r2.getValue(r0)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Lamp10Service$f1 r1 = r3.f13569a
                r1.mo33757m(r0)
                goto L_0x02a8
            L_0x0275:
                r3 = r19
                r2 = r20
                com.miot.common.property.Property r1 = r2.getProperty(r0)
                boolean r1 = r1.isValueValid()
                if (r1 == 0) goto L_0x02a8
                java.lang.Object r0 = r2.getValue(r0)
                java.lang.String r0 = (java.lang.String) r0
                com.yeelight.yeelib.device.xiaomi.Lamp10Service$f1 r1 = r3.f13569a
                r1.mo33749e(r0)
                goto L_0x02a8
            L_0x028f:
                r3 = r19
                r2 = r20
                com.miot.common.property.Property r0 = r2.getProperty(r1)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x02a8
                java.lang.Object r0 = r2.getValue(r1)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Lamp10Service$f1 r1 = r3.f13569a
                r1.mo33747c(r0)
            L_0x02a8:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.xiaomi.Lamp10Service.C7399v.onPropertyChanged(com.miot.common.device.invocation.PropertyInfo, java.lang.String):void");
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp10Service$v0 */
    public interface C7400v0 {
        /* renamed from: a */
        void mo33777a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp10Service$w */
    class C7401w implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13570a;

        C7401w(Lamp10Service lamp10Service, CompletionHandler completionHandler) {
            this.f13570a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13570a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13570a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp10Service$w0 */
    public interface C7402w0 {
        /* renamed from: a */
        void mo33779a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp10Service$x */
    class C7403x implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13571a;

        C7403x(Lamp10Service lamp10Service, CompletionHandler completionHandler) {
            this.f13571a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13571a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13571a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp10Service$x0 */
    public interface C7404x0 {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp10Service$y */
    class C7405y implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13572a;

        C7405y(Lamp10Service lamp10Service, CompletionHandler completionHandler) {
            this.f13572a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13572a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13572a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp10Service$y0 */
    public interface C7406y0 {
        /* renamed from: a */
        void mo33783a(Power power);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp10Service$z */
    class C7407z implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13573a;

        C7407z(Lamp10Service lamp10Service, CompletionHandler completionHandler) {
            this.f13573a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13573a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13573a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp10Service$z0 */
    public interface C7408z0 {
        /* renamed from: a */
        void mo33785a(Power power, Long l, Long l2, Long l3, Long l4, Long l5, Long l6, Long l7, Long l8, Long l9, Long l10, String str, Long l11, Long l12, Long l13, String str2, String str3);

        void onFailed(int i, String str);
    }

    public Lamp10Service(AbstractDevice abstractDevice) {
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
                MiotManager.getDeviceManipulator().invoke(create, new C7403x(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7387p(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7383n(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7364e0(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getBright(C7384n0 n0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Bright"), new C7376j0(this, n0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getColorMode(C7386o0 o0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "ColorMode"), new C7357c(this, o0Var));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7361d0(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getCt(C7388p0 p0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Ct"), new C7378k0(this, p0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getDelayOff(C7390q0 q0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "DelayOff"), new C7363e(this, q0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowParams(C7392r0 r0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "FlowParams"), new C7369g(this, r0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowing(C7394s0 s0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Flowing"), new C7354b(this, s0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getHue(C7396t0 t0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Hue"), new C7382m0(this, t0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getIndicatorEnable(C7398u0 u0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), PROPERTY_IndicatorEnable), new C7379l(this, u0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getLanMode(C7400v0 v0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "LanMode"), new C7371h(this, v0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getMusicEnable(C7402w0 w0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "MusicEnable"), new C7375j(this, w0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getNightTimeInfo(C7404x0 x0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "NightTimeInfo"), new C7381m(this, x0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getPower(C7406y0 y0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Power"), new C7374i0(this, y0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getProperties(C7408z0 z0Var) {
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
            create.addProperty(getService().getProperty(PROPERTY_IndicatorEnable));
            create.addProperty(getService().getProperty("NightTimeInfo"));
            MiotManager.getDeviceManipulator().readProperty(create, new C7372h0(this, z0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getRgb(C7353a1 a1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Rgb"), new C7360d(this, a1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getSat(C7356b1 b1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Sat"), new C7351a(this, b1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getSaveState(C7359c1 c1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "SaveState"), new C7366f(this, c1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getTemperature(C7362d1 d1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Temperature"), new C7380l0(this, d1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getonFromPower(C7365e1 e1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "onFromPower"), new C7373i(this, e1Var));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7393s(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7389q(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7407z(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7385o(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7358c0(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7405y(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7355b0(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7352a0(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7395t(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7397u(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7391r(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7367f0(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void subscribeNotifications(CompletionHandler completionHandler, C7368f1 f1Var) {
        if (completionHandler == null) {
            throw new IllegalArgumentException("handler is null");
        } else if (f1Var != null) {
            PropertyInfo create = PropertyInfoFactory.create(getService());
            for (Property next : getService().getProperties()) {
                if (next.getDefinition().isNotifiable()) {
                    create.addProperty(next);
                }
            }
            MiotManager.getDeviceManipulator().addPropertyChangedListener(create, new C7377k(this, completionHandler), new C7399v(this, f1Var));
        } else {
            throw new IllegalArgumentException("listener is null");
        }
    }

    public void toggle(CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "toggle");
            if (create != null) {
                MiotManager.getDeviceManipulator().invoke(create, new C7401w(this, completionHandler));
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
            MiotManager.getDeviceManipulator().removePropertyChangedListener(create, new C7370g0(this, completionHandler));
            return;
        }
        throw new IllegalArgumentException("handler is null");
    }
}
