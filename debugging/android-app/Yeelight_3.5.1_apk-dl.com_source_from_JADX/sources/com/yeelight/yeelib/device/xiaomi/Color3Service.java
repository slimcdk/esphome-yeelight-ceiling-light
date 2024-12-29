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

public class Color3Service extends AbstractService {
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
    public static final String PROPERTY_Mode = "Mode";
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
    private static final String TAG = "Color3Service";
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

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color3Service$a */
    class C7063a implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7096q0 f13332a;

        C7063a(Color3Service color3Service, C7096q0 q0Var) {
            this.f13332a = q0Var;
        }

        public void onFailed(int i, String str) {
            this.f13332a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Sat");
            if (property.isValueValid()) {
                this.f13332a.mo33312a((Long) propertyInfo.getValue("Sat"));
                return;
            }
            C7096q0 q0Var = this.f13332a;
            q0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color3Service$a0 */
    class C7064a0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7092o0 f13333a;

        C7064a0(Color3Service color3Service, C7092o0 o0Var) {
            this.f13333a = o0Var;
        }

        public void onFailed(int i, String str) {
            this.f13333a.onFailed(i, str);
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
                com.yeelight.yeelib.device.xiaomi.Color3Service$Power r1 = com.yeelight.yeelib.device.xiaomi.Color3Service.Power.valueOf(r1)
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
                java.lang.String r1 = "onFromPower"
                com.miot.common.property.Property r0 = r0.getProperty(r1)
                boolean r1 = r0.isValueValid()
                if (r1 == 0) goto L_0x0118
                java.lang.Object r0 = r0.getValue()
                r3 = r0
                java.lang.Long r3 = (java.lang.Long) r3
            L_0x0118:
                r0 = r18
                r17 = r3
                com.yeelight.yeelib.device.xiaomi.Color3Service$o0 r4 = r0.f13333a
                r4.mo33308a(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.xiaomi.Color3Service.C7064a0.onSucceed(com.miot.common.device.invocation.PropertyInfo):void");
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color3Service$b */
    class C7065b implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7086l0 f13334a;

        C7065b(Color3Service color3Service, C7086l0 l0Var) {
            this.f13334a = l0Var;
        }

        public void onFailed(int i, String str) {
            this.f13334a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Flowing");
            if (property.isValueValid()) {
                this.f13334a.mo33302a((Long) propertyInfo.getValue("Flowing"));
                return;
            }
            C7086l0 l0Var = this.f13334a;
            l0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color3Service$b0 */
    class C7066b0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7090n0 f13335a;

        C7066b0(Color3Service color3Service, C7090n0 n0Var) {
            this.f13335a = n0Var;
        }

        public void onFailed(int i, String str) {
            this.f13335a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Power");
            if (property.isValueValid()) {
                this.f13335a.mo33306a(Power.valueOf((String) propertyInfo.getValue("Power")));
                return;
            }
            C7090n0 n0Var = this.f13335a;
            n0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color3Service$c */
    class C7067c implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7078h0 f13336a;

        C7067c(Color3Service color3Service, C7078h0 h0Var) {
            this.f13336a = h0Var;
        }

        public void onFailed(int i, String str) {
            this.f13336a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("ColorMode");
            if (property.isValueValid()) {
                this.f13336a.mo33294a((Long) propertyInfo.getValue("ColorMode"));
                return;
            }
            C7078h0 h0Var = this.f13336a;
            h0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color3Service$c0 */
    class C7068c0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7076g0 f13337a;

        C7068c0(Color3Service color3Service, C7076g0 g0Var) {
            this.f13337a = g0Var;
        }

        public void onFailed(int i, String str) {
            this.f13337a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Bright");
            if (property.isValueValid()) {
                this.f13337a.mo33292a((Long) propertyInfo.getValue("Bright"));
                return;
            }
            C7076g0 g0Var = this.f13337a;
            g0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color3Service$d */
    class C7069d implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7094p0 f13338a;

        C7069d(Color3Service color3Service, C7094p0 p0Var) {
            this.f13338a = p0Var;
        }

        public void onFailed(int i, String str) {
            this.f13338a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Rgb");
            if (property.isValueValid()) {
                this.f13338a.mo33310a((Long) propertyInfo.getValue("Rgb"));
                return;
            }
            C7094p0 p0Var = this.f13338a;
            p0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color3Service$d0 */
    class C7070d0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7080i0 f13339a;

        C7070d0(Color3Service color3Service, C7080i0 i0Var) {
            this.f13339a = i0Var;
        }

        public void onFailed(int i, String str) {
            this.f13339a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Ct");
            if (property.isValueValid()) {
                this.f13339a.mo33296a((Long) propertyInfo.getValue("Ct"));
                return;
            }
            C7080i0 i0Var = this.f13339a;
            i0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color3Service$e */
    class C7071e implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7082j0 f13340a;

        C7071e(Color3Service color3Service, C7082j0 j0Var) {
            this.f13340a = j0Var;
        }

        public void onFailed(int i, String str) {
            this.f13340a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("DelayOff");
            if (property.isValueValid()) {
                this.f13340a.mo33298a((Long) propertyInfo.getValue("DelayOff"));
                return;
            }
            C7082j0 j0Var = this.f13340a;
            j0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color3Service$e0 */
    class C7072e0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7100s0 f13341a;

        C7072e0(Color3Service color3Service, C7100s0 s0Var) {
            this.f13341a = s0Var;
        }

        public void onFailed(int i, String str) {
            this.f13341a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Temperature");
            if (property.isValueValid()) {
                this.f13341a.mo33316a((Long) propertyInfo.getValue("Temperature"));
                return;
            }
            C7100s0 s0Var = this.f13341a;
            s0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color3Service$f */
    class C7073f implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7098r0 f13342a;

        C7073f(Color3Service color3Service, C7098r0 r0Var) {
            this.f13342a = r0Var;
        }

        public void onFailed(int i, String str) {
            this.f13342a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("SaveState");
            if (property.isValueValid()) {
                this.f13342a.mo33314a((Long) propertyInfo.getValue("SaveState"));
                return;
            }
            C7098r0 r0Var = this.f13342a;
            r0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color3Service$f0 */
    class C7074f0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7088m0 f13343a;

        C7074f0(Color3Service color3Service, C7088m0 m0Var) {
            this.f13343a = m0Var;
        }

        public void onFailed(int i, String str) {
            this.f13343a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Hue");
            if (property.isValueValid()) {
                this.f13343a.mo33304a((Long) propertyInfo.getValue("Hue"));
                return;
            }
            C7088m0 m0Var = this.f13343a;
            m0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color3Service$g */
    class C7075g implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7084k0 f13344a;

        C7075g(Color3Service color3Service, C7084k0 k0Var) {
            this.f13344a = k0Var;
        }

        public void onFailed(int i, String str) {
            this.f13344a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("FlowParams");
            if (property.isValueValid()) {
                this.f13344a.onSucceed((String) propertyInfo.getValue("FlowParams"));
                return;
            }
            C7084k0 k0Var = this.f13344a;
            k0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color3Service$g0 */
    public interface C7076g0 {
        /* renamed from: a */
        void mo33292a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color3Service$h */
    class C7077h implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7102t0 f13345a;

        C7077h(Color3Service color3Service, C7102t0 t0Var) {
            this.f13345a = t0Var;
        }

        public void onFailed(int i, String str) {
            this.f13345a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("onFromPower");
            if (property.isValueValid()) {
                this.f13345a.mo33318a((Long) propertyInfo.getValue("onFromPower"));
                return;
            }
            C7102t0 t0Var = this.f13345a;
            t0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color3Service$h0 */
    public interface C7078h0 {
        /* renamed from: a */
        void mo33294a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color3Service$i */
    class C7079i implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13346a;

        C7079i(Color3Service color3Service, CompletionHandler completionHandler) {
            this.f13346a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13346a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13346a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color3Service$i0 */
    public interface C7080i0 {
        /* renamed from: a */
        void mo33296a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color3Service$j */
    class C7081j implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13347a;

        C7081j(Color3Service color3Service, CompletionHandler completionHandler) {
            this.f13347a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13347a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13347a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color3Service$j0 */
    public interface C7082j0 {
        /* renamed from: a */
        void mo33298a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color3Service$k */
    class C7083k implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13348a;

        C7083k(Color3Service color3Service, CompletionHandler completionHandler) {
            this.f13348a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13348a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f13348a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color3Service$k0 */
    public interface C7084k0 {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color3Service$l */
    class C7085l implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13349a;

        C7085l(Color3Service color3Service, CompletionHandler completionHandler) {
            this.f13349a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13349a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13349a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color3Service$l0 */
    public interface C7086l0 {
        /* renamed from: a */
        void mo33302a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color3Service$m */
    class C7087m implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13350a;

        C7087m(Color3Service color3Service, CompletionHandler completionHandler) {
            this.f13350a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13350a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13350a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color3Service$m0 */
    public interface C7088m0 {
        /* renamed from: a */
        void mo33304a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color3Service$n */
    class C7089n implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13351a;

        C7089n(Color3Service color3Service, CompletionHandler completionHandler) {
            this.f13351a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13351a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13351a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color3Service$n0 */
    public interface C7090n0 {
        /* renamed from: a */
        void mo33306a(Power power);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color3Service$o */
    class C7091o implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13352a;

        C7091o(Color3Service color3Service, CompletionHandler completionHandler) {
            this.f13352a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13352a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13352a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color3Service$o0 */
    public interface C7092o0 {
        /* renamed from: a */
        void mo33308a(Power power, Long l, Long l2, Long l3, Long l4, Long l5, Long l6, Long l7, Long l8, Long l9, Long l10, String str, Long l11);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color3Service$p */
    class C7093p implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13353a;

        C7093p(Color3Service color3Service, CompletionHandler completionHandler) {
            this.f13353a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13353a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13353a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color3Service$p0 */
    public interface C7094p0 {
        /* renamed from: a */
        void mo33310a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color3Service$q */
    class C7095q implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13354a;

        C7095q(Color3Service color3Service, CompletionHandler completionHandler) {
            this.f13354a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13354a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13354a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color3Service$q0 */
    public interface C7096q0 {
        /* renamed from: a */
        void mo33312a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color3Service$r */
    class C7097r implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13355a;

        C7097r(Color3Service color3Service, CompletionHandler completionHandler) {
            this.f13355a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13355a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13355a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color3Service$r0 */
    public interface C7098r0 {
        /* renamed from: a */
        void mo33314a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color3Service$s */
    class C7099s implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13356a;

        C7099s(Color3Service color3Service, CompletionHandler completionHandler) {
            this.f13356a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13356a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13356a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color3Service$s0 */
    public interface C7100s0 {
        /* renamed from: a */
        void mo33316a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color3Service$t */
    class C7101t implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13357a;

        C7101t(Color3Service color3Service, CompletionHandler completionHandler) {
            this.f13357a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13357a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13357a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color3Service$t0 */
    public interface C7102t0 {
        /* renamed from: a */
        void mo33318a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color3Service$u */
    class C7103u implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13358a;

        C7103u(Color3Service color3Service, CompletionHandler completionHandler) {
            this.f13358a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13358a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13358a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color3Service$u0 */
    public interface C7104u0 {
        /* renamed from: a */
        void mo33320a(Long l);

        /* renamed from: b */
        void mo33321b(Long l);

        /* renamed from: c */
        void mo33322c(Long l);

        /* renamed from: d */
        void mo33323d(Long l);

        /* renamed from: e */
        void mo33324e(String str);

        /* renamed from: f */
        void mo33325f(Long l);

        /* renamed from: g */
        void mo33326g(Power power);

        /* renamed from: h */
        void mo33327h(Long l);

        /* renamed from: j */
        void mo33328j(Long l);

        /* renamed from: k */
        void mo33329k(Long l);

        /* renamed from: l */
        void mo33330l(Long l);

        /* renamed from: n */
        void mo33331n(Long l);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color3Service$v */
    class C7105v implements DeviceManipulator.PropertyChangedListener {

        /* renamed from: a */
        final /* synthetic */ C7104u0 f13359a;

        C7105v(Color3Service color3Service, C7104u0 u0Var) {
            this.f13359a = u0Var;
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
                case -310275194:
                    if (str2.equals("ColorMode")) {
                        c = 2;
                        break;
                    }
                    break;
                case 2193:
                    if (str2.equals("Ct")) {
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
                case 880790796:
                    if (str2.equals("DelayOff")) {
                        c = 9;
                        break;
                    }
                    break;
                case 898856916:
                    if (str2.equals("Flowing")) {
                        c = 10;
                        break;
                    }
                    break;
                case 1998035738:
                    if (str2.equals("Bright")) {
                        c = 11;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    if (propertyInfo2.getProperty("SaveState").isValueValid()) {
                        this.f13359a.mo33322c((Long) propertyInfo2.getValue("SaveState"));
                        return;
                    }
                    return;
                case 1:
                    if (propertyInfo2.getProperty("FlowParams").isValueValid()) {
                        this.f13359a.mo33324e((String) propertyInfo2.getValue("FlowParams"));
                        return;
                    }
                    return;
                case 2:
                    if (propertyInfo2.getProperty("ColorMode").isValueValid()) {
                        this.f13359a.mo33330l((Long) propertyInfo2.getValue("ColorMode"));
                        return;
                    }
                    return;
                case 3:
                    if (propertyInfo2.getProperty("Ct").isValueValid()) {
                        this.f13359a.mo33327h((Long) propertyInfo2.getValue("Ct"));
                        return;
                    }
                    return;
                case 4:
                    if (propertyInfo2.getProperty("Hue").isValueValid()) {
                        this.f13359a.mo33331n((Long) propertyInfo2.getValue("Hue"));
                        return;
                    }
                    return;
                case 5:
                    if (propertyInfo2.getProperty("Rgb").isValueValid()) {
                        this.f13359a.mo33328j((Long) propertyInfo2.getValue("Rgb"));
                        return;
                    }
                    return;
                case 6:
                    if (propertyInfo2.getProperty("Sat").isValueValid()) {
                        this.f13359a.mo33329k((Long) propertyInfo2.getValue("Sat"));
                        return;
                    }
                    return;
                case 7:
                    if (propertyInfo2.getProperty("onFromPower").isValueValid()) {
                        this.f13359a.mo33325f((Long) propertyInfo2.getValue("onFromPower"));
                        return;
                    }
                    return;
                case 8:
                    if (propertyInfo2.getProperty("Power").isValueValid()) {
                        this.f13359a.mo33326g(Power.valueOf((String) propertyInfo2.getValue("Power")));
                        return;
                    }
                    return;
                case 9:
                    if (propertyInfo2.getProperty("DelayOff").isValueValid()) {
                        this.f13359a.mo33321b((Long) propertyInfo2.getValue("DelayOff"));
                        return;
                    }
                    return;
                case 10:
                    if (propertyInfo2.getProperty("Flowing").isValueValid()) {
                        this.f13359a.mo33323d((Long) propertyInfo2.getValue("Flowing"));
                        return;
                    }
                    return;
                case 11:
                    if (propertyInfo2.getProperty("Bright").isValueValid()) {
                        this.f13359a.mo33320a((Long) propertyInfo2.getValue("Bright"));
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color3Service$w */
    class C7106w implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13360a;

        C7106w(Color3Service color3Service, CompletionHandler completionHandler) {
            this.f13360a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13360a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13360a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color3Service$x */
    class C7107x implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13361a;

        C7107x(Color3Service color3Service, CompletionHandler completionHandler) {
            this.f13361a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13361a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13361a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color3Service$y */
    class C7108y implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13362a;

        C7108y(Color3Service color3Service, CompletionHandler completionHandler) {
            this.f13362a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13362a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13362a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color3Service$z */
    class C7109z implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13363a;

        C7109z(Color3Service color3Service, CompletionHandler completionHandler) {
            this.f13363a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13363a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f13363a.onSucceed();
        }
    }

    public Color3Service(AbstractDevice abstractDevice) {
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
                MiotManager.getDeviceManipulator().invoke(create, new C7097r(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7081j(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getBright(C7076g0 g0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Bright"), new C7068c0(this, g0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getColorMode(C7078h0 h0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "ColorMode"), new C7067c(this, h0Var));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7107x(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getCt(C7080i0 i0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Ct"), new C7070d0(this, i0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getDelayOff(C7082j0 j0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "DelayOff"), new C7071e(this, j0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowParams(C7084k0 k0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "FlowParams"), new C7075g(this, k0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowing(C7086l0 l0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Flowing"), new C7065b(this, l0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getHue(C7088m0 m0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Hue"), new C7074f0(this, m0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getPower(C7090n0 n0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Power"), new C7066b0(this, n0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getProperties(C7092o0 o0Var) {
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
            create.addProperty(getService().getProperty("onFromPower"));
            MiotManager.getDeviceManipulator().readProperty(create, new C7064a0(this, o0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getRgb(C7094p0 p0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Rgb"), new C7069d(this, p0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getSat(C7096q0 q0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Sat"), new C7063a(this, q0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getSaveState(C7098r0 r0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "SaveState"), new C7073f(this, r0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getTemperature(C7100s0 s0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Temperature"), new C7072e0(this, s0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getonFromPower(C7102t0 t0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "onFromPower"), new C7077h(this, t0Var));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7089n(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7085l(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7101t(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7079i(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7106w(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7099s(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7103u(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7091o(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7093p(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7087m(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7108y(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void subscribeNotifications(CompletionHandler completionHandler, C7104u0 u0Var) {
        if (completionHandler == null) {
            throw new IllegalArgumentException("handler is null");
        } else if (u0Var != null) {
            PropertyInfo create = PropertyInfoFactory.create(getService());
            for (Property next : getService().getProperties()) {
                if (next.getDefinition().isNotifiable()) {
                    create.addProperty(next);
                }
            }
            MiotManager.getDeviceManipulator().addPropertyChangedListener(create, new C7083k(this, completionHandler), new C7105v(this, u0Var));
        } else {
            throw new IllegalArgumentException("listener is null");
        }
    }

    public void toggle(CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "toggle");
            if (create != null) {
                MiotManager.getDeviceManipulator().invoke(create, new C7095q(this, completionHandler));
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
            MiotManager.getDeviceManipulator().removePropertyChangedListener(create, new C7109z(this, completionHandler));
            return;
        }
        throw new IllegalArgumentException("handler is null");
    }
}
