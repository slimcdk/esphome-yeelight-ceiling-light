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

public class ColorcService extends AbstractService {
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
    public static final String ACTION_setScene2 = "setScene2";
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
    public static final String PROPERTY_TransIntervalDflt = "TransIntervalDflt";
    public static final String PROPERTY_onFromPower = "onFromPower";
    private static final String TAG = "ColorcService";
    private AbstractDevice mDevice = null;

    public enum CmdKey {
        undefined,
        cfg_pomodoro,
        cfg_lan_ctrl,
        cfg_save_state,
        cfg_init_power,
        trans_default
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

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorcService$a */
    class C7218a implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7271y0 f13440a;

        C7218a(ColorcService colorcService, C7271y0 y0Var) {
            this.f13440a = y0Var;
        }

        public void onFailed(int i, String str) {
            this.f13440a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Sat");
            if (property.isValueValid()) {
                this.f13440a.mo33580a((Long) propertyInfo.getValue("Sat"));
                return;
            }
            C7271y0 y0Var = this.f13440a;
            y0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorcService$a0 */
    class C7219a0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13441a;

        C7219a0(ColorcService colorcService, CompletionHandler completionHandler) {
            this.f13441a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13441a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13441a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorcService$a1 */
    public interface C7220a1 {
        /* renamed from: a */
        void mo33535a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorcService$b */
    class C7221b implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7257r0 f13442a;

        C7221b(ColorcService colorcService, C7257r0 r0Var) {
            this.f13442a = r0Var;
        }

        public void onFailed(int i, String str) {
            this.f13442a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Flowing");
            if (property.isValueValid()) {
                this.f13442a.mo33566a((Long) propertyInfo.getValue("Flowing"));
                return;
            }
            C7257r0 r0Var = this.f13442a;
            r0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorcService$b0 */
    class C7222b0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13443a;

        C7222b0(ColorcService colorcService, CompletionHandler completionHandler) {
            this.f13443a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13443a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13443a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorcService$b1 */
    public interface C7223b1 {
        /* renamed from: a */
        void mo33537a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorcService$c */
    class C7224c implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7249n0 f13444a;

        C7224c(ColorcService colorcService, C7249n0 n0Var) {
            this.f13444a = n0Var;
        }

        public void onFailed(int i, String str) {
            this.f13444a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("ColorMode");
            if (property.isValueValid()) {
                this.f13444a.mo33558a((Long) propertyInfo.getValue("ColorMode"));
                return;
            }
            C7249n0 n0Var = this.f13444a;
            n0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorcService$c0 */
    class C7225c0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13445a;

        C7225c0(ColorcService colorcService, CompletionHandler completionHandler) {
            this.f13445a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13445a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13445a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorcService$c1 */
    public interface C7226c1 {
        /* renamed from: a */
        void mo33539a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorcService$d */
    class C7227d implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7269x0 f13446a;

        C7227d(ColorcService colorcService, C7269x0 x0Var) {
            this.f13446a = x0Var;
        }

        public void onFailed(int i, String str) {
            this.f13446a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Rgb");
            if (property.isValueValid()) {
                this.f13446a.mo33578a((Long) propertyInfo.getValue("Rgb"));
                return;
            }
            C7269x0 x0Var = this.f13446a;
            x0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorcService$d0 */
    class C7228d0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13447a;

        C7228d0(ColorcService colorcService, CompletionHandler completionHandler) {
            this.f13447a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13447a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13447a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorcService$d1 */
    public interface C7229d1 {
        /* renamed from: a */
        void mo33541a(Long l);

        /* renamed from: b */
        void mo33542b(Long l);

        /* renamed from: c */
        void mo33543c(Long l);

        /* renamed from: d */
        void mo33544d(Long l);

        /* renamed from: e */
        void mo33545e(String str);

        /* renamed from: f */
        void mo33546f(Long l);

        /* renamed from: g */
        void mo33547g(Long l);

        /* renamed from: h */
        void mo33548h(Long l);

        /* renamed from: i */
        void mo33549i(Power power);

        /* renamed from: j */
        void mo33550j(Long l);

        /* renamed from: k */
        void mo33551k(Long l);

        /* renamed from: l */
        void mo33552l(Long l);

        /* renamed from: m */
        void mo33553m(Long l);

        /* renamed from: n */
        void mo33554n(Long l);

        /* renamed from: p */
        void mo33555p(Long l);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorcService$e */
    class C7230e implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7253p0 f13448a;

        C7230e(ColorcService colorcService, C7253p0 p0Var) {
            this.f13448a = p0Var;
        }

        public void onFailed(int i, String str) {
            this.f13448a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("DelayOff");
            if (property.isValueValid()) {
                this.f13448a.mo33562a((Long) propertyInfo.getValue("DelayOff"));
                return;
            }
            C7253p0 p0Var = this.f13448a;
            p0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorcService$e0 */
    class C7231e0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13449a;

        C7231e0(ColorcService colorcService, CompletionHandler completionHandler) {
            this.f13449a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13449a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13449a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorcService$f */
    class C7232f implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7273z0 f13450a;

        C7232f(ColorcService colorcService, C7273z0 z0Var) {
            this.f13450a = z0Var;
        }

        public void onFailed(int i, String str) {
            this.f13450a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("SaveState");
            if (property.isValueValid()) {
                this.f13450a.mo33582a((Long) propertyInfo.getValue("SaveState"));
                return;
            }
            C7273z0 z0Var = this.f13450a;
            z0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorcService$f0 */
    class C7233f0 implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13451a;

        C7233f0(ColorcService colorcService, CompletionHandler completionHandler) {
            this.f13451a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13451a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f13451a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorcService$g */
    class C7234g implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7255q0 f13452a;

        C7234g(ColorcService colorcService, C7255q0 q0Var) {
            this.f13452a = q0Var;
        }

        public void onFailed(int i, String str) {
            this.f13452a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("FlowParams");
            if (property.isValueValid()) {
                this.f13452a.onSucceed((String) propertyInfo.getValue("FlowParams"));
                return;
            }
            C7255q0 q0Var = this.f13452a;
            q0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorcService$g0 */
    class C7235g0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7267w0 f13453a;

        C7235g0(ColorcService colorcService, C7267w0 w0Var) {
            this.f13453a = w0Var;
        }

        public void onFailed(int i, String str) {
            this.f13453a.onFailed(i, str);
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
                com.yeelight.yeelib.device.xiaomi.ColorcService$Power r1 = com.yeelight.yeelib.device.xiaomi.ColorcService.Power.valueOf(r1)
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
                java.lang.String r1 = "TransIntervalDflt"
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
                java.lang.String r1 = "MusicEnable"
                com.miot.common.property.Property r0 = r0.getProperty(r1)
                boolean r1 = r0.isValueValid()
                if (r1 == 0) goto L_0x015d
                java.lang.Object r0 = r0.getValue()
                r3 = r0
                java.lang.Long r3 = (java.lang.Long) r3
            L_0x015d:
                r0 = r21
                r20 = r3
                com.yeelight.yeelib.device.xiaomi.ColorcService$w0 r4 = r0.f13453a
                r4.mo33576a(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.xiaomi.ColorcService.C7235g0.onSucceed(com.miot.common.device.invocation.PropertyInfo):void");
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorcService$h */
    class C7236h implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7261t0 f13454a;

        C7236h(ColorcService colorcService, C7261t0 t0Var) {
            this.f13454a = t0Var;
        }

        public void onFailed(int i, String str) {
            this.f13454a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("LanMode");
            if (property.isValueValid()) {
                this.f13454a.mo33570a((Long) propertyInfo.getValue("LanMode"));
                return;
            }
            C7261t0 t0Var = this.f13454a;
            t0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorcService$h0 */
    class C7237h0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7265v0 f13455a;

        C7237h0(ColorcService colorcService, C7265v0 v0Var) {
            this.f13455a = v0Var;
        }

        public void onFailed(int i, String str) {
            this.f13455a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Power");
            if (property.isValueValid()) {
                this.f13455a.mo33574a(Power.valueOf((String) propertyInfo.getValue("Power")));
                return;
            }
            C7265v0 v0Var = this.f13455a;
            v0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorcService$i */
    class C7238i implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7226c1 f13456a;

        C7238i(ColorcService colorcService, C7226c1 c1Var) {
            this.f13456a = c1Var;
        }

        public void onFailed(int i, String str) {
            this.f13456a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("onFromPower");
            if (property.isValueValid()) {
                this.f13456a.mo33539a((Long) propertyInfo.getValue("onFromPower"));
                return;
            }
            C7226c1 c1Var = this.f13456a;
            c1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorcService$i0 */
    class C7239i0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7247m0 f13457a;

        C7239i0(ColorcService colorcService, C7247m0 m0Var) {
            this.f13457a = m0Var;
        }

        public void onFailed(int i, String str) {
            this.f13457a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Bright");
            if (property.isValueValid()) {
                this.f13457a.mo33556a((Long) propertyInfo.getValue("Bright"));
                return;
            }
            C7247m0 m0Var = this.f13457a;
            m0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorcService$j */
    class C7240j implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7223b1 f13458a;

        C7240j(ColorcService colorcService, C7223b1 b1Var) {
            this.f13458a = b1Var;
        }

        public void onFailed(int i, String str) {
            this.f13458a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("TransIntervalDflt");
            if (property.isValueValid()) {
                this.f13458a.mo33537a((Long) propertyInfo.getValue("TransIntervalDflt"));
                return;
            }
            C7223b1 b1Var = this.f13458a;
            b1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorcService$j0 */
    class C7241j0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7251o0 f13459a;

        C7241j0(ColorcService colorcService, C7251o0 o0Var) {
            this.f13459a = o0Var;
        }

        public void onFailed(int i, String str) {
            this.f13459a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Ct");
            if (property.isValueValid()) {
                this.f13459a.mo33560a((Long) propertyInfo.getValue("Ct"));
                return;
            }
            C7251o0 o0Var = this.f13459a;
            o0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorcService$k */
    class C7242k implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13460a;

        C7242k(ColorcService colorcService, CompletionHandler completionHandler) {
            this.f13460a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13460a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f13460a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorcService$k0 */
    class C7243k0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7220a1 f13461a;

        C7243k0(ColorcService colorcService, C7220a1 a1Var) {
            this.f13461a = a1Var;
        }

        public void onFailed(int i, String str) {
            this.f13461a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Temperature");
            if (property.isValueValid()) {
                this.f13461a.mo33535a((Long) propertyInfo.getValue("Temperature"));
                return;
            }
            C7220a1 a1Var = this.f13461a;
            a1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorcService$l */
    class C7244l implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7263u0 f13462a;

        C7244l(ColorcService colorcService, C7263u0 u0Var) {
            this.f13462a = u0Var;
        }

        public void onFailed(int i, String str) {
            this.f13462a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("MusicEnable");
            if (property.isValueValid()) {
                this.f13462a.mo33572a((Long) propertyInfo.getValue("MusicEnable"));
                return;
            }
            C7263u0 u0Var = this.f13462a;
            u0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorcService$l0 */
    class C7245l0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7259s0 f13463a;

        C7245l0(ColorcService colorcService, C7259s0 s0Var) {
            this.f13463a = s0Var;
        }

        public void onFailed(int i, String str) {
            this.f13463a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Hue");
            if (property.isValueValid()) {
                this.f13463a.mo33568a((Long) propertyInfo.getValue("Hue"));
                return;
            }
            C7259s0 s0Var = this.f13463a;
            s0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorcService$m */
    class C7246m implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13464a;

        C7246m(ColorcService colorcService, CompletionHandler completionHandler) {
            this.f13464a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13464a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13464a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorcService$m0 */
    public interface C7247m0 {
        /* renamed from: a */
        void mo33556a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorcService$n */
    class C7248n implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13465a;

        C7248n(ColorcService colorcService, CompletionHandler completionHandler) {
            this.f13465a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13465a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13465a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorcService$n0 */
    public interface C7249n0 {
        /* renamed from: a */
        void mo33558a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorcService$o */
    class C7250o implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13466a;

        C7250o(ColorcService colorcService, CompletionHandler completionHandler) {
            this.f13466a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13466a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13466a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorcService$o0 */
    public interface C7251o0 {
        /* renamed from: a */
        void mo33560a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorcService$p */
    class C7252p implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13467a;

        C7252p(ColorcService colorcService, CompletionHandler completionHandler) {
            this.f13467a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13467a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13467a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorcService$p0 */
    public interface C7253p0 {
        /* renamed from: a */
        void mo33562a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorcService$q */
    class C7254q implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13468a;

        C7254q(ColorcService colorcService, CompletionHandler completionHandler) {
            this.f13468a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13468a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13468a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorcService$q0 */
    public interface C7255q0 {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorcService$r */
    class C7256r implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13469a;

        C7256r(ColorcService colorcService, CompletionHandler completionHandler) {
            this.f13469a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13469a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13469a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorcService$r0 */
    public interface C7257r0 {
        /* renamed from: a */
        void mo33566a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorcService$s */
    class C7258s implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13470a;

        C7258s(ColorcService colorcService, CompletionHandler completionHandler) {
            this.f13470a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13470a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13470a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorcService$s0 */
    public interface C7259s0 {
        /* renamed from: a */
        void mo33568a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorcService$t */
    class C7260t implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13471a;

        C7260t(ColorcService colorcService, CompletionHandler completionHandler) {
            this.f13471a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13471a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13471a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorcService$t0 */
    public interface C7261t0 {
        /* renamed from: a */
        void mo33570a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorcService$u */
    class C7262u implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13472a;

        C7262u(ColorcService colorcService, CompletionHandler completionHandler) {
            this.f13472a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13472a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13472a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorcService$u0 */
    public interface C7263u0 {
        /* renamed from: a */
        void mo33572a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorcService$v */
    class C7264v implements DeviceManipulator.PropertyChangedListener {

        /* renamed from: a */
        final /* synthetic */ C7229d1 f13473a;

        C7264v(ColorcService colorcService, C7229d1 d1Var) {
            this.f13473a = d1Var;
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
                case -718325097:
                    if (str3.equals("TransIntervalDflt")) {
                        c = 3;
                        break;
                    }
                    break;
                case -310275194:
                    if (str3.equals("ColorMode")) {
                        c = 4;
                        break;
                    }
                    break;
                case 2193:
                    if (str3.equals("Ct")) {
                        c = 5;
                        break;
                    }
                    break;
                case 72920:
                    if (str3.equals("Hue")) {
                        c = 6;
                        break;
                    }
                    break;
                case 82093:
                    if (str3.equals("Rgb")) {
                        c = 7;
                        break;
                    }
                    break;
                case 82886:
                    if (str3.equals("Sat")) {
                        c = 8;
                        break;
                    }
                    break;
                case 35911772:
                    if (str3.equals("onFromPower")) {
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
                        this.f13473a.mo33543c((Long) propertyInfo3.getValue("SaveState"));
                        return;
                    }
                    return;
                case 1:
                    PropertyInfo propertyInfo4 = propertyInfo;
                    String str5 = str2;
                    if (propertyInfo4.getProperty(str5).isValueValid()) {
                        this.f13473a.mo33545e((String) propertyInfo4.getValue(str5));
                        return;
                    }
                    return;
                case 2:
                    String str6 = "MusicEnable";
                    PropertyInfo propertyInfo5 = propertyInfo;
                    if (propertyInfo5.getProperty(str6).isValueValid()) {
                        this.f13473a.mo33553m((Long) propertyInfo5.getValue(str6));
                        return;
                    }
                    return;
                case 3:
                    PropertyInfo propertyInfo6 = propertyInfo;
                    if (propertyInfo6.getProperty("TransIntervalDflt").isValueValid()) {
                        this.f13473a.mo33555p((Long) propertyInfo6.getValue("TransIntervalDflt"));
                        return;
                    }
                    return;
                case 4:
                    PropertyInfo propertyInfo7 = propertyInfo;
                    if (propertyInfo7.getProperty("ColorMode").isValueValid()) {
                        this.f13473a.mo33552l((Long) propertyInfo7.getValue("ColorMode"));
                        return;
                    }
                    return;
                case 5:
                    PropertyInfo propertyInfo8 = propertyInfo;
                    if (propertyInfo8.getProperty("Ct").isValueValid()) {
                        this.f13473a.mo33548h((Long) propertyInfo8.getValue("Ct"));
                        return;
                    }
                    return;
                case 6:
                    PropertyInfo propertyInfo9 = propertyInfo;
                    if (propertyInfo9.getProperty("Hue").isValueValid()) {
                        this.f13473a.mo33554n((Long) propertyInfo9.getValue("Hue"));
                        return;
                    }
                    return;
                case 7:
                    PropertyInfo propertyInfo10 = propertyInfo;
                    if (propertyInfo10.getProperty("Rgb").isValueValid()) {
                        this.f13473a.mo33550j((Long) propertyInfo10.getValue("Rgb"));
                        return;
                    }
                    return;
                case 8:
                    PropertyInfo propertyInfo11 = propertyInfo;
                    if (propertyInfo11.getProperty("Sat").isValueValid()) {
                        this.f13473a.mo33551k((Long) propertyInfo11.getValue("Sat"));
                        return;
                    }
                    return;
                case 9:
                    PropertyInfo propertyInfo12 = propertyInfo;
                    if (propertyInfo12.getProperty("onFromPower").isValueValid()) {
                        this.f13473a.mo33546f((Long) propertyInfo12.getValue("onFromPower"));
                        return;
                    }
                    return;
                case 10:
                    PropertyInfo propertyInfo13 = propertyInfo;
                    if (propertyInfo13.getProperty("Power").isValueValid()) {
                        this.f13473a.mo33549i(Power.valueOf((String) propertyInfo13.getValue("Power")));
                        return;
                    }
                    return;
                case 11:
                    PropertyInfo propertyInfo14 = propertyInfo;
                    if (propertyInfo14.getProperty("DelayOff").isValueValid()) {
                        this.f13473a.mo33542b((Long) propertyInfo14.getValue("DelayOff"));
                        return;
                    }
                    return;
                case 12:
                    PropertyInfo propertyInfo15 = propertyInfo;
                    if (propertyInfo15.getProperty("Flowing").isValueValid()) {
                        this.f13473a.mo33544d((Long) propertyInfo15.getValue("Flowing"));
                        return;
                    }
                    return;
                case 13:
                    PropertyInfo propertyInfo16 = propertyInfo;
                    if (propertyInfo16.getProperty("LanMode").isValueValid()) {
                        this.f13473a.mo33547g((Long) propertyInfo16.getValue("LanMode"));
                        return;
                    }
                    return;
                case 14:
                    PropertyInfo propertyInfo17 = propertyInfo;
                    if (propertyInfo17.getProperty("Bright").isValueValid()) {
                        this.f13473a.mo33541a((Long) propertyInfo17.getValue("Bright"));
                        return;
                    }
                    break;
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorcService$v0 */
    public interface C7265v0 {
        /* renamed from: a */
        void mo33574a(Power power);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorcService$w */
    class C7266w implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13474a;

        C7266w(ColorcService colorcService, CompletionHandler completionHandler) {
            this.f13474a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13474a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13474a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorcService$w0 */
    public interface C7267w0 {
        /* renamed from: a */
        void mo33576a(Power power, Long l, Long l2, Long l3, Long l4, Long l5, Long l6, Long l7, Long l8, Long l9, Long l10, String str, Long l11, Long l12, Long l13, Long l14);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorcService$x */
    class C7268x implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13475a;

        C7268x(ColorcService colorcService, CompletionHandler completionHandler) {
            this.f13475a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13475a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13475a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorcService$x0 */
    public interface C7269x0 {
        /* renamed from: a */
        void mo33578a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorcService$y */
    class C7270y implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13476a;

        C7270y(ColorcService colorcService, CompletionHandler completionHandler) {
            this.f13476a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13476a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13476a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorcService$y0 */
    public interface C7271y0 {
        /* renamed from: a */
        void mo33580a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorcService$z */
    class C7272z implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13477a;

        C7272z(ColorcService colorcService, CompletionHandler completionHandler) {
            this.f13477a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13477a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13477a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorcService$z0 */
    public interface C7273z0 {
        /* renamed from: a */
        void mo33582a(Long l);

        void onFailed(int i, String str);
    }

    public ColorcService(AbstractDevice abstractDevice) {
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
                MiotManager.getDeviceManipulator().invoke(create, new C7268x(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7250o(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7246m(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7228d0(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getBright(C7247m0 m0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Bright"), new C7239i0(this, m0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getColorMode(C7249n0 n0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "ColorMode"), new C7224c(this, n0Var));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7225c0(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getCt(C7251o0 o0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Ct"), new C7241j0(this, o0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getDelayOff(C7253p0 p0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "DelayOff"), new C7230e(this, p0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowParams(C7255q0 q0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "FlowParams"), new C7234g(this, q0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowing(C7257r0 r0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Flowing"), new C7221b(this, r0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getHue(C7259s0 s0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Hue"), new C7245l0(this, s0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getLanMode(C7261t0 t0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "LanMode"), new C7236h(this, t0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getMusicEnable(C7263u0 u0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "MusicEnable"), new C7244l(this, u0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getPower(C7265v0 v0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Power"), new C7237h0(this, v0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getProperties(C7267w0 w0Var) {
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
            create.addProperty(getService().getProperty("TransIntervalDflt"));
            create.addProperty(getService().getProperty("MusicEnable"));
            MiotManager.getDeviceManipulator().readProperty(create, new C7235g0(this, w0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getRgb(C7269x0 x0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Rgb"), new C7227d(this, x0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getSat(C7271y0 y0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Sat"), new C7218a(this, y0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getSaveState(C7273z0 z0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "SaveState"), new C7232f(this, z0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getTemperature(C7220a1 a1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Temperature"), new C7243k0(this, a1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getTransIntervalDflt(C7223b1 b1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "TransIntervalDflt"), new C7240j(this, b1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getonFromPower(C7226c1 c1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "onFromPower"), new C7238i(this, c1Var));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7258s(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7252p(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7272z(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setBright(Long l, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setBright");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (create.setArgumentValue("Bright", l)) {
                MiotManager.getDeviceManipulator().invoke(create, new C7248n(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setCt(Long l, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setCt");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (create.setArgumentValue("Ct", l)) {
                MiotManager.getDeviceManipulator().invoke(create, new C7222b0(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7270y(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7219a0(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7260t(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setRgb(Long l, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setRgb");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (create.setArgumentValue("Rgb", l)) {
                MiotManager.getDeviceManipulator().invoke(create, new C7262u(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7254q(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setScene2(String str, Long l, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setScene2");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("ParamModel", str)) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("ParamCount", l)) {
                MiotManager.getDeviceManipulator().invoke(create, new C7256r(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7231e0(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void subscribeNotifications(CompletionHandler completionHandler, C7229d1 d1Var) {
        if (completionHandler == null) {
            throw new IllegalArgumentException("handler is null");
        } else if (d1Var != null) {
            PropertyInfo create = PropertyInfoFactory.create(getService());
            for (Property next : getService().getProperties()) {
                if (next.getDefinition().isNotifiable()) {
                    create.addProperty(next);
                }
            }
            MiotManager.getDeviceManipulator().addPropertyChangedListener(create, new C7242k(this, completionHandler), new C7264v(this, d1Var));
        } else {
            throw new IllegalArgumentException("listener is null");
        }
    }

    public void toggle(CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "toggle");
            if (create != null) {
                MiotManager.getDeviceManipulator().invoke(create, new C7266w(this, completionHandler));
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
            MiotManager.getDeviceManipulator().removePropertyChangedListener(create, new C7233f0(this, completionHandler));
            return;
        }
        throw new IllegalArgumentException("handler is null");
    }
}
