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

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color4Service$a */
    class C8589a implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8646z0 f16558a;

        C8589a(Color4Service color4Service, C8646z0 z0Var) {
            this.f16558a = z0Var;
        }

        public void onFailed(int i, String str) {
            this.f16558a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Sat");
            if (property.isValueValid()) {
                this.f16558a.mo30228a((Long) propertyInfo.getValue("Sat"));
                return;
            }
            C8646z0 z0Var = this.f16558a;
            z0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color4Service$a0 */
    class C8590a0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16559a;

        C8590a0(Color4Service color4Service, CompletionHandler completionHandler) {
            this.f16559a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16559a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16559a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color4Service$a1 */
    public interface C8591a1 {
        /* renamed from: a */
        void mo30198a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color4Service$b */
    class C8592b implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8632s0 f16560a;

        C8592b(Color4Service color4Service, C8632s0 s0Var) {
            this.f16560a = s0Var;
        }

        public void onFailed(int i, String str) {
            this.f16560a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Flowing");
            if (property.isValueValid()) {
                this.f16560a.mo30216a((Long) propertyInfo.getValue("Flowing"));
                return;
            }
            C8632s0 s0Var = this.f16560a;
            s0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color4Service$b0 */
    class C8593b0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16561a;

        C8593b0(Color4Service color4Service, CompletionHandler completionHandler) {
            this.f16561a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16561a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16561a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color4Service$b1 */
    public interface C8594b1 {
        /* renamed from: a */
        void mo30200a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color4Service$c */
    class C8595c implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8624o0 f16562a;

        C8595c(Color4Service color4Service, C8624o0 o0Var) {
            this.f16562a = o0Var;
        }

        public void onFailed(int i, String str) {
            this.f16562a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("ColorMode");
            if (property.isValueValid()) {
                this.f16562a.mo30208a((Long) propertyInfo.getValue("ColorMode"));
                return;
            }
            C8624o0 o0Var = this.f16562a;
            o0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color4Service$c0 */
    class C8596c0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16563a;

        C8596c0(Color4Service color4Service, CompletionHandler completionHandler) {
            this.f16563a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16563a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16563a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color4Service$c1 */
    public interface C8597c1 {
        /* renamed from: a */
        void mo30202a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color4Service$d */
    class C8598d implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8644y0 f16564a;

        C8598d(Color4Service color4Service, C8644y0 y0Var) {
            this.f16564a = y0Var;
        }

        public void onFailed(int i, String str) {
            this.f16564a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Rgb");
            if (property.isValueValid()) {
                this.f16564a.mo30226a((Long) propertyInfo.getValue("Rgb"));
                return;
            }
            C8644y0 y0Var = this.f16564a;
            y0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color4Service$d0 */
    class C8599d0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16565a;

        C8599d0(Color4Service color4Service, CompletionHandler completionHandler) {
            this.f16565a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16565a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16565a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color4Service$d1 */
    public interface C8600d1 {
        /* renamed from: a */
        void mo30204a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color4Service$e */
    class C8601e implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8628q0 f16566a;

        C8601e(Color4Service color4Service, C8628q0 q0Var) {
            this.f16566a = q0Var;
        }

        public void onFailed(int i, String str) {
            this.f16566a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("DelayOff");
            if (property.isValueValid()) {
                this.f16566a.mo30212a((Long) propertyInfo.getValue("DelayOff"));
                return;
            }
            C8628q0 q0Var = this.f16566a;
            q0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color4Service$e0 */
    class C8602e0 implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16567a;

        C8602e0(Color4Service color4Service, CompletionHandler completionHandler) {
            this.f16567a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16567a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f16567a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color4Service$e1 */
    public enum C8603e1 {
        undefined,
        on,
        off
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color4Service$f */
    class C8604f implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8591a1 f16572a;

        C8604f(Color4Service color4Service, C8591a1 a1Var) {
            this.f16572a = a1Var;
        }

        public void onFailed(int i, String str) {
            this.f16572a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("SaveState");
            if (property.isValueValid()) {
                this.f16572a.mo30198a((Long) propertyInfo.getValue("SaveState"));
                return;
            }
            C8591a1 a1Var = this.f16572a;
            a1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color4Service$f0 */
    class C8605f0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8642x0 f16573a;

        C8605f0(Color4Service color4Service, C8642x0 x0Var) {
            this.f16573a = x0Var;
        }

        public void onFailed(int i, String str) {
            this.f16573a.onFailed(i, str);
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
                com.yeelight.yeelib.device.xiaomi.Color4Service$e1 r1 = com.yeelight.yeelib.device.xiaomi.Color4Service.C8603e1.valueOf(r1)
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
                com.yeelight.yeelib.device.xiaomi.Color4Service$x0 r4 = r0.f16573a
                r4.mo28687a(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.xiaomi.Color4Service.C8605f0.onSucceed(com.miot.common.device.invocation.PropertyInfo):void");
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color4Service$f1 */
    public interface C8606f1 {
        /* renamed from: a */
        void mo28689a(Long l);

        /* renamed from: b */
        void mo28690b(Long l);

        /* renamed from: c */
        void mo28691c(Long l);

        /* renamed from: d */
        void mo28692d(Long l);

        /* renamed from: e */
        void mo28693e(String str);

        /* renamed from: f */
        void mo28694f(Long l);

        /* renamed from: g */
        void mo28695g(Long l);

        /* renamed from: h */
        void mo28696h(Long l);

        /* renamed from: i */
        void mo28697i(C8603e1 e1Var);

        /* renamed from: j */
        void mo28698j(Long l);

        /* renamed from: k */
        void mo28699k(Long l);

        /* renamed from: l */
        void mo28700l(Long l);

        /* renamed from: n */
        void mo28701n(Long l);

        /* renamed from: o */
        void mo28702o(Long l);

        /* renamed from: p */
        void mo28703p(Long l);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color4Service$g */
    class C8607g implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8630r0 f16574a;

        C8607g(Color4Service color4Service, C8630r0 r0Var) {
            this.f16574a = r0Var;
        }

        public void onFailed(int i, String str) {
            this.f16574a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("FlowParams");
            if (property.isValueValid()) {
                this.f16574a.onSucceed((String) propertyInfo.getValue("FlowParams"));
                return;
            }
            C8630r0 r0Var = this.f16574a;
            r0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color4Service$g0 */
    class C8608g0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8640w0 f16575a;

        C8608g0(Color4Service color4Service, C8640w0 w0Var) {
            this.f16575a = w0Var;
        }

        public void onFailed(int i, String str) {
            this.f16575a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Power");
            if (property.isValueValid()) {
                this.f16575a.mo30224a(C8603e1.valueOf((String) propertyInfo.getValue("Power")));
                return;
            }
            C8640w0 w0Var = this.f16575a;
            w0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color4Service$h */
    class C8609h implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8636u0 f16576a;

        C8609h(Color4Service color4Service, C8636u0 u0Var) {
            this.f16576a = u0Var;
        }

        public void onFailed(int i, String str) {
            this.f16576a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("LanMode");
            if (property.isValueValid()) {
                this.f16576a.mo30220a((Long) propertyInfo.getValue("LanMode"));
                return;
            }
            C8636u0 u0Var = this.f16576a;
            u0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color4Service$h0 */
    class C8610h0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8622n0 f16577a;

        C8610h0(Color4Service color4Service, C8622n0 n0Var) {
            this.f16577a = n0Var;
        }

        public void onFailed(int i, String str) {
            this.f16577a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Bright");
            if (property.isValueValid()) {
                this.f16577a.mo30206a((Long) propertyInfo.getValue("Bright"));
                return;
            }
            C8622n0 n0Var = this.f16577a;
            n0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color4Service$i */
    class C8611i implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8600d1 f16578a;

        C8611i(Color4Service color4Service, C8600d1 d1Var) {
            this.f16578a = d1Var;
        }

        public void onFailed(int i, String str) {
            this.f16578a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("onFromPower");
            if (property.isValueValid()) {
                this.f16578a.mo30204a((Long) propertyInfo.getValue("onFromPower"));
                return;
            }
            C8600d1 d1Var = this.f16578a;
            d1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color4Service$i0 */
    class C8612i0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8626p0 f16579a;

        C8612i0(Color4Service color4Service, C8626p0 p0Var) {
            this.f16579a = p0Var;
        }

        public void onFailed(int i, String str) {
            this.f16579a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Ct");
            if (property.isValueValid()) {
                this.f16579a.mo30210a((Long) propertyInfo.getValue("Ct"));
                return;
            }
            C8626p0 p0Var = this.f16579a;
            p0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color4Service$j */
    class C8613j implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8638v0 f16580a;

        C8613j(Color4Service color4Service, C8638v0 v0Var) {
            this.f16580a = v0Var;
        }

        public void onFailed(int i, String str) {
            this.f16580a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("MusicEnable");
            if (property.isValueValid()) {
                this.f16580a.mo30222a((Long) propertyInfo.getValue("MusicEnable"));
                return;
            }
            C8638v0 v0Var = this.f16580a;
            v0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color4Service$j0 */
    class C8614j0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8597c1 f16581a;

        C8614j0(Color4Service color4Service, C8597c1 c1Var) {
            this.f16581a = c1Var;
        }

        public void onFailed(int i, String str) {
            this.f16581a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Temperature");
            if (property.isValueValid()) {
                this.f16581a.mo30202a((Long) propertyInfo.getValue("Temperature"));
                return;
            }
            C8597c1 c1Var = this.f16581a;
            c1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color4Service$k */
    class C8615k implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16582a;

        C8615k(Color4Service color4Service, CompletionHandler completionHandler) {
            this.f16582a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16582a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f16582a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color4Service$k0 */
    class C8616k0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8634t0 f16583a;

        C8616k0(Color4Service color4Service, C8634t0 t0Var) {
            this.f16583a = t0Var;
        }

        public void onFailed(int i, String str) {
            this.f16583a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Hue");
            if (property.isValueValid()) {
                this.f16583a.mo30218a((Long) propertyInfo.getValue("Hue"));
                return;
            }
            C8634t0 t0Var = this.f16583a;
            t0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color4Service$l */
    class C8617l implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8594b1 f16584a;

        C8617l(Color4Service color4Service, C8594b1 b1Var) {
            this.f16584a = b1Var;
        }

        public void onFailed(int i, String str) {
            this.f16584a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("SmartSwitch");
            if (property.isValueValid()) {
                this.f16584a.mo30200a((Long) propertyInfo.getValue("SmartSwitch"));
                return;
            }
            C8594b1 b1Var = this.f16584a;
            b1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color4Service$l0 */
    public enum C8618l0 {
        undefined,
        cfg_pomodoro,
        cfg_lan_ctrl,
        cfg_save_state,
        cfg_init_power,
        cfg_smart_switch
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color4Service$m */
    class C8619m implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16592a;

        C8619m(Color4Service color4Service, CompletionHandler completionHandler) {
            this.f16592a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16592a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16592a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color4Service$m0 */
    public enum C8620m0 {
        undefined,
        smooth,
        sudden
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color4Service$n */
    class C8621n implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16597a;

        C8621n(Color4Service color4Service, CompletionHandler completionHandler) {
            this.f16597a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16597a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16597a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color4Service$n0 */
    public interface C8622n0 {
        /* renamed from: a */
        void mo30206a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color4Service$o */
    class C8623o implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16598a;

        C8623o(Color4Service color4Service, CompletionHandler completionHandler) {
            this.f16598a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16598a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16598a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color4Service$o0 */
    public interface C8624o0 {
        /* renamed from: a */
        void mo30208a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color4Service$p */
    class C8625p implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16599a;

        C8625p(Color4Service color4Service, CompletionHandler completionHandler) {
            this.f16599a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16599a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16599a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color4Service$p0 */
    public interface C8626p0 {
        /* renamed from: a */
        void mo30210a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color4Service$q */
    class C8627q implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16600a;

        C8627q(Color4Service color4Service, CompletionHandler completionHandler) {
            this.f16600a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16600a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16600a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color4Service$q0 */
    public interface C8628q0 {
        /* renamed from: a */
        void mo30212a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color4Service$r */
    class C8629r implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16601a;

        C8629r(Color4Service color4Service, CompletionHandler completionHandler) {
            this.f16601a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16601a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16601a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color4Service$r0 */
    public interface C8630r0 {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color4Service$s */
    class C8631s implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16602a;

        C8631s(Color4Service color4Service, CompletionHandler completionHandler) {
            this.f16602a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16602a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16602a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color4Service$s0 */
    public interface C8632s0 {
        /* renamed from: a */
        void mo30216a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color4Service$t */
    class C8633t implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16603a;

        C8633t(Color4Service color4Service, CompletionHandler completionHandler) {
            this.f16603a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16603a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16603a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color4Service$t0 */
    public interface C8634t0 {
        /* renamed from: a */
        void mo30218a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color4Service$u */
    class C8635u implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16604a;

        C8635u(Color4Service color4Service, CompletionHandler completionHandler) {
            this.f16604a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16604a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16604a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color4Service$u0 */
    public interface C8636u0 {
        /* renamed from: a */
        void mo30220a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color4Service$v */
    class C8637v implements DeviceManipulator.PropertyChangedListener {

        /* renamed from: a */
        final /* synthetic */ C8606f1 f16605a;

        C8637v(Color4Service color4Service, C8606f1 f1Var) {
            this.f16605a = f1Var;
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:100:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:101:?, code lost:
            return;
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
        /* JADX WARNING: Code restructure failed: missing block: B:2:0x002d, code lost:
            r3 = r16;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x009e, code lost:
            r3 = r16;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:0x00b7, code lost:
            r2 = 65535;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:0x00b8, code lost:
            switch(r2) {
                case 0: goto L_0x0236;
                case 1: goto L_0x021c;
                case 2: goto L_0x0202;
                case 3: goto L_0x01e8;
                case 4: goto L_0x01cd;
                case 5: goto L_0x01b2;
                case 6: goto L_0x0197;
                case 7: goto L_0x017c;
                case 8: goto L_0x0161;
                case 9: goto L_0x0146;
                case 10: goto L_0x012b;
                case 11: goto L_0x0110;
                case 12: goto L_0x00f5;
                case 13: goto L_0x00da;
                case 14: goto L_0x00bf;
                default: goto L_0x00bb;
            };
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x00bb, code lost:
            r6 = r17;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:52:0x00bf, code lost:
            r2 = r18;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:53:0x00c9, code lost:
            if (r2.getProperty("SmartSwitch").isValueValid() == false) goto L_0x00bb;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:54:0x00cb, code lost:
            r17.f16605a.mo28703p((java.lang.Long) r2.getValue("SmartSwitch"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:55:0x00da, code lost:
            r6 = r17;
            r2 = r18;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:56:0x00e6, code lost:
            if (r2.getProperty("MusicEnable").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:57:0x00e8, code lost:
            r6.f16605a.mo28702o((java.lang.Long) r2.getValue("MusicEnable"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:58:0x00f5, code lost:
            r6 = r17;
            r2 = r18;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:59:0x0101, code lost:
            if (r2.getProperty("onFromPower").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:60:0x0103, code lost:
            r6.f16605a.mo28694f((java.lang.Long) r2.getValue("onFromPower"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:61:0x0110, code lost:
            r6 = r17;
            r2 = r18;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:62:0x011c, code lost:
            if (r2.getProperty("LanMode").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:63:0x011e, code lost:
            r6.f16605a.mo28695g((java.lang.Long) r2.getValue("LanMode"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:64:0x012b, code lost:
            r6 = r17;
            r2 = r18;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:65:0x0137, code lost:
            if (r2.getProperty(r3).isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:66:0x0139, code lost:
            r6.f16605a.mo28693e((java.lang.String) r2.getValue(r3));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:67:0x0146, code lost:
            r6 = r17;
            r2 = r18;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:68:0x0152, code lost:
            if (r2.getProperty("SaveState").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:69:0x0154, code lost:
            r6.f16605a.mo28692d((java.lang.Long) r2.getValue("SaveState"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:70:0x0161, code lost:
            r6 = r17;
            r2 = r18;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:71:0x016d, code lost:
            if (r2.getProperty("DelayOff").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:72:0x016f, code lost:
            r6.f16605a.mo28690b((java.lang.Long) r2.getValue("DelayOff"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:73:0x017c, code lost:
            r6 = r17;
            r2 = r18;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:74:0x0188, code lost:
            if (r2.getProperty("Rgb").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:75:0x018a, code lost:
            r6.f16605a.mo28698j((java.lang.Long) r2.getValue("Rgb"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:76:0x0197, code lost:
            r6 = r17;
            r2 = r18;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:77:0x01a3, code lost:
            if (r2.getProperty("ColorMode").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:78:0x01a5, code lost:
            r6.f16605a.mo28700l((java.lang.Long) r2.getValue("ColorMode"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:79:0x01b2, code lost:
            r6 = r17;
            r2 = r18;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:80:0x01be, code lost:
            if (r2.getProperty("Flowing").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:81:0x01c0, code lost:
            r6.f16605a.mo28691c((java.lang.Long) r2.getValue("Flowing"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:82:0x01cd, code lost:
            r6 = r17;
            r2 = r18;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:83:0x01d9, code lost:
            if (r2.getProperty("Sat").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:84:0x01db, code lost:
            r6.f16605a.mo28699k((java.lang.Long) r2.getValue("Sat"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:85:0x01e8, code lost:
            r6 = r17;
            r2 = r18;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:86:0x01f4, code lost:
            if (r2.getProperty("Hue").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:87:0x01f6, code lost:
            r6.f16605a.mo28701n((java.lang.Long) r2.getValue("Hue"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:88:0x0202, code lost:
            r6 = r17;
            r2 = r18;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:89:0x020e, code lost:
            if (r2.getProperty("Ct").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:90:0x0210, code lost:
            r6.f16605a.mo28696h((java.lang.Long) r2.getValue("Ct"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:91:0x021c, code lost:
            r6 = r17;
            r2 = r18;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:92:0x0228, code lost:
            if (r2.getProperty("Bright").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:93:0x022a, code lost:
            r6.f16605a.mo28689a((java.lang.Long) r2.getValue("Bright"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:94:0x0236, code lost:
            r6 = r17;
            r2 = r18;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:95:0x0242, code lost:
            if (r2.getProperty("Power").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:96:0x0244, code lost:
            r6.f16605a.mo28697i(com.yeelight.yeelib.device.xiaomi.Color4Service.C8603e1.valueOf((java.lang.String) r2.getValue("Power")));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:97:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:98:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:99:?, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onPropertyChanged(com.miot.common.device.invocation.PropertyInfo r18, java.lang.String r19) {
            /*
                r17 = this;
                r0 = r17
                r1 = r18
                r2 = r19
                int r3 = r19.hashCode()
                java.lang.String r4 = "Bright"
                java.lang.String r5 = "LanMode"
                java.lang.String r6 = "SmartSwitch"
                java.lang.String r7 = "Flowing"
                java.lang.String r8 = "DelayOff"
                java.lang.String r9 = "Power"
                java.lang.String r10 = "onFromPower"
                java.lang.String r11 = "Sat"
                java.lang.String r12 = "Rgb"
                java.lang.String r13 = "Hue"
                java.lang.String r14 = "Ct"
                java.lang.String r15 = "ColorMode"
                java.lang.String r0 = "MusicEnable"
                java.lang.String r1 = "FlowParams"
                r16 = r1
                java.lang.String r1 = "SaveState"
                switch(r3) {
                    case -2117953292: goto L_0x00ac;
                    case -2002016140: goto L_0x00a1;
                    case -1787381784: goto L_0x0096;
                    case -310275194: goto L_0x008e;
                    case 2193: goto L_0x0086;
                    case 72920: goto L_0x007e;
                    case 82093: goto L_0x0076;
                    case 82886: goto L_0x006e;
                    case 35911772: goto L_0x0065;
                    case 77306085: goto L_0x005d;
                    case 880790796: goto L_0x0054;
                    case 898856916: goto L_0x004c;
                    case 1179821629: goto L_0x0043;
                    case 1611821756: goto L_0x003a;
                    case 1998035738: goto L_0x0031;
                    default: goto L_0x002d;
                }
            L_0x002d:
                r3 = r16
                goto L_0x00b7
            L_0x0031:
                boolean r2 = r2.equals(r4)
                if (r2 == 0) goto L_0x002d
                r2 = 1
                goto L_0x009e
            L_0x003a:
                boolean r2 = r2.equals(r5)
                if (r2 == 0) goto L_0x002d
                r2 = 11
                goto L_0x009e
            L_0x0043:
                boolean r2 = r2.equals(r6)
                if (r2 == 0) goto L_0x002d
                r2 = 14
                goto L_0x009e
            L_0x004c:
                boolean r2 = r2.equals(r7)
                if (r2 == 0) goto L_0x002d
                r2 = 5
                goto L_0x009e
            L_0x0054:
                boolean r2 = r2.equals(r8)
                if (r2 == 0) goto L_0x002d
                r2 = 8
                goto L_0x009e
            L_0x005d:
                boolean r2 = r2.equals(r9)
                if (r2 == 0) goto L_0x002d
                r2 = 0
                goto L_0x009e
            L_0x0065:
                boolean r2 = r2.equals(r10)
                if (r2 == 0) goto L_0x002d
                r2 = 12
                goto L_0x009e
            L_0x006e:
                boolean r2 = r2.equals(r11)
                if (r2 == 0) goto L_0x002d
                r2 = 4
                goto L_0x009e
            L_0x0076:
                boolean r2 = r2.equals(r12)
                if (r2 == 0) goto L_0x002d
                r2 = 7
                goto L_0x009e
            L_0x007e:
                boolean r2 = r2.equals(r13)
                if (r2 == 0) goto L_0x002d
                r2 = 3
                goto L_0x009e
            L_0x0086:
                boolean r2 = r2.equals(r14)
                if (r2 == 0) goto L_0x002d
                r2 = 2
                goto L_0x009e
            L_0x008e:
                boolean r2 = r2.equals(r15)
                if (r2 == 0) goto L_0x002d
                r2 = 6
                goto L_0x009e
            L_0x0096:
                boolean r2 = r2.equals(r0)
                if (r2 == 0) goto L_0x002d
                r2 = 13
            L_0x009e:
                r3 = r16
                goto L_0x00b8
            L_0x00a1:
                r3 = r16
                boolean r2 = r2.equals(r3)
                if (r2 == 0) goto L_0x00b7
                r2 = 10
                goto L_0x00b8
            L_0x00ac:
                r3 = r16
                boolean r2 = r2.equals(r1)
                if (r2 == 0) goto L_0x00b7
                r2 = 9
                goto L_0x00b8
            L_0x00b7:
                r2 = -1
            L_0x00b8:
                switch(r2) {
                    case 0: goto L_0x0236;
                    case 1: goto L_0x021c;
                    case 2: goto L_0x0202;
                    case 3: goto L_0x01e8;
                    case 4: goto L_0x01cd;
                    case 5: goto L_0x01b2;
                    case 6: goto L_0x0197;
                    case 7: goto L_0x017c;
                    case 8: goto L_0x0161;
                    case 9: goto L_0x0146;
                    case 10: goto L_0x012b;
                    case 11: goto L_0x0110;
                    case 12: goto L_0x00f5;
                    case 13: goto L_0x00da;
                    case 14: goto L_0x00bf;
                    default: goto L_0x00bb;
                }
            L_0x00bb:
                r6 = r17
                goto L_0x0253
            L_0x00bf:
                r2 = r18
                com.miot.common.property.Property r0 = r2.getProperty(r6)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x00bb
                java.lang.Object r0 = r2.getValue(r6)
                java.lang.Long r0 = (java.lang.Long) r0
                r6 = r17
                com.yeelight.yeelib.device.xiaomi.Color4Service$f1 r1 = r6.f16605a
                r1.mo28703p(r0)
                goto L_0x0253
            L_0x00da:
                r6 = r17
                r2 = r18
                com.miot.common.property.Property r1 = r2.getProperty(r0)
                boolean r1 = r1.isValueValid()
                if (r1 == 0) goto L_0x0253
                java.lang.Object r0 = r2.getValue(r0)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Color4Service$f1 r1 = r6.f16605a
                r1.mo28702o(r0)
                goto L_0x0253
            L_0x00f5:
                r6 = r17
                r2 = r18
                com.miot.common.property.Property r0 = r2.getProperty(r10)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0253
                java.lang.Object r0 = r2.getValue(r10)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Color4Service$f1 r1 = r6.f16605a
                r1.mo28694f(r0)
                goto L_0x0253
            L_0x0110:
                r6 = r17
                r2 = r18
                com.miot.common.property.Property r0 = r2.getProperty(r5)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0253
                java.lang.Object r0 = r2.getValue(r5)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Color4Service$f1 r1 = r6.f16605a
                r1.mo28695g(r0)
                goto L_0x0253
            L_0x012b:
                r6 = r17
                r2 = r18
                com.miot.common.property.Property r0 = r2.getProperty(r3)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0253
                java.lang.Object r0 = r2.getValue(r3)
                java.lang.String r0 = (java.lang.String) r0
                com.yeelight.yeelib.device.xiaomi.Color4Service$f1 r1 = r6.f16605a
                r1.mo28693e(r0)
                goto L_0x0253
            L_0x0146:
                r6 = r17
                r2 = r18
                com.miot.common.property.Property r0 = r2.getProperty(r1)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0253
                java.lang.Object r0 = r2.getValue(r1)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Color4Service$f1 r1 = r6.f16605a
                r1.mo28692d(r0)
                goto L_0x0253
            L_0x0161:
                r6 = r17
                r2 = r18
                com.miot.common.property.Property r0 = r2.getProperty(r8)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0253
                java.lang.Object r0 = r2.getValue(r8)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Color4Service$f1 r1 = r6.f16605a
                r1.mo28690b(r0)
                goto L_0x0253
            L_0x017c:
                r6 = r17
                r2 = r18
                com.miot.common.property.Property r0 = r2.getProperty(r12)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0253
                java.lang.Object r0 = r2.getValue(r12)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Color4Service$f1 r1 = r6.f16605a
                r1.mo28698j(r0)
                goto L_0x0253
            L_0x0197:
                r6 = r17
                r2 = r18
                com.miot.common.property.Property r0 = r2.getProperty(r15)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0253
                java.lang.Object r0 = r2.getValue(r15)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Color4Service$f1 r1 = r6.f16605a
                r1.mo28700l(r0)
                goto L_0x0253
            L_0x01b2:
                r6 = r17
                r2 = r18
                com.miot.common.property.Property r0 = r2.getProperty(r7)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0253
                java.lang.Object r0 = r2.getValue(r7)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Color4Service$f1 r1 = r6.f16605a
                r1.mo28691c(r0)
                goto L_0x0253
            L_0x01cd:
                r6 = r17
                r2 = r18
                com.miot.common.property.Property r0 = r2.getProperty(r11)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0253
                java.lang.Object r0 = r2.getValue(r11)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Color4Service$f1 r1 = r6.f16605a
                r1.mo28699k(r0)
                goto L_0x0253
            L_0x01e8:
                r6 = r17
                r2 = r18
                com.miot.common.property.Property r0 = r2.getProperty(r13)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0253
                java.lang.Object r0 = r2.getValue(r13)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Color4Service$f1 r1 = r6.f16605a
                r1.mo28701n(r0)
                goto L_0x0253
            L_0x0202:
                r6 = r17
                r2 = r18
                com.miot.common.property.Property r0 = r2.getProperty(r14)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0253
                java.lang.Object r0 = r2.getValue(r14)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Color4Service$f1 r1 = r6.f16605a
                r1.mo28696h(r0)
                goto L_0x0253
            L_0x021c:
                r6 = r17
                r2 = r18
                com.miot.common.property.Property r0 = r2.getProperty(r4)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0253
                java.lang.Object r0 = r2.getValue(r4)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Color4Service$f1 r1 = r6.f16605a
                r1.mo28689a(r0)
                goto L_0x0253
            L_0x0236:
                r6 = r17
                r2 = r18
                com.miot.common.property.Property r0 = r2.getProperty(r9)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0253
                java.lang.Object r0 = r2.getValue(r9)
                java.lang.String r0 = (java.lang.String) r0
                com.yeelight.yeelib.device.xiaomi.Color4Service$e1 r0 = com.yeelight.yeelib.device.xiaomi.Color4Service.C8603e1.valueOf(r0)
                com.yeelight.yeelib.device.xiaomi.Color4Service$f1 r1 = r6.f16605a
                r1.mo28697i(r0)
            L_0x0253:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.xiaomi.Color4Service.C8637v.onPropertyChanged(com.miot.common.device.invocation.PropertyInfo, java.lang.String):void");
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color4Service$v0 */
    public interface C8638v0 {
        /* renamed from: a */
        void mo30222a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color4Service$w */
    class C8639w implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16606a;

        C8639w(Color4Service color4Service, CompletionHandler completionHandler) {
            this.f16606a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16606a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16606a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color4Service$w0 */
    public interface C8640w0 {
        /* renamed from: a */
        void mo30224a(C8603e1 e1Var);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color4Service$x */
    class C8641x implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16607a;

        C8641x(Color4Service color4Service, CompletionHandler completionHandler) {
            this.f16607a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16607a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16607a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color4Service$x0 */
    public interface C8642x0 {
        /* renamed from: a */
        void mo28687a(C8603e1 e1Var, Long l, Long l2, Long l3, Long l4, Long l5, Long l6, Long l7, Long l8, Long l9, Long l10, String str, Long l11, Long l12, Long l13, Long l14);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color4Service$y */
    class C8643y implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16608a;

        C8643y(Color4Service color4Service, CompletionHandler completionHandler) {
            this.f16608a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16608a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16608a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color4Service$y0 */
    public interface C8644y0 {
        /* renamed from: a */
        void mo30226a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color4Service$z */
    class C8645z implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16609a;

        C8645z(Color4Service color4Service, CompletionHandler completionHandler) {
            this.f16609a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16609a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16609a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color4Service$z0 */
    public interface C8646z0 {
        /* renamed from: a */
        void mo30228a(Long l);

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
                MiotManager.getDeviceManipulator().invoke(create, new C8639w(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8623o(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8619m(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8596c0(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getBright(C8622n0 n0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Bright"), new C8610h0(this, n0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getColorMode(C8624o0 o0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "ColorMode"), new C8595c(this, o0Var));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8593b0(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getCt(C8626p0 p0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Ct"), new C8612i0(this, p0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getDelayOff(C8628q0 q0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "DelayOff"), new C8601e(this, q0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowParams(C8630r0 r0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "FlowParams"), new C8607g(this, r0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowing(C8632s0 s0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Flowing"), new C8592b(this, s0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getHue(C8634t0 t0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Hue"), new C8616k0(this, t0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getLanMode(C8636u0 u0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "LanMode"), new C8609h(this, u0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getMusicEnable(C8638v0 v0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "MusicEnable"), new C8613j(this, v0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getPower(C8640w0 w0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Power"), new C8608g0(this, w0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getProperties(C8642x0 x0Var) {
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
            MiotManager.getDeviceManipulator().readProperty(create, new C8605f0(this, x0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getRgb(C8644y0 y0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Rgb"), new C8598d(this, y0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getSat(C8646z0 z0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Sat"), new C8589a(this, z0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getSaveState(C8591a1 a1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "SaveState"), new C8604f(this, a1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getSmartSwitch(C8594b1 b1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "SmartSwitch"), new C8617l(this, b1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getTemperature(C8597c1 c1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Temperature"), new C8614j0(this, c1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getonFromPower(C8600d1 d1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "onFromPower"), new C8611i(this, d1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void openWithMode(C8603e1 e1Var, C8620m0 m0Var, Long l, Long l2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "openWithMode");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("Power", e1Var.toString())) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Effect", m0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Duration", l)) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("Mode", l2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C8629r(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8625p(this, completionHandler));
                return;
            }
            throw new MiotException("actionInfo is null");
        }
        throw new MiotException("device not configurated connection");
    }

    public void sendCmd(C8618l0 l0Var, String str, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "sendCmd");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("CmdKey", l0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("CmdValue", str)) {
                MiotManager.getDeviceManipulator().invoke(create, new C8643y(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setBright(Long l, C8620m0 m0Var, Long l2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setBright");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("Bright", l)) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Effect", m0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("Duration", l2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C8621n(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setCt(Long l, C8620m0 m0Var, Long l2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setCt");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("Ct", l)) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Effect", m0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("Duration", l2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C8590a0(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8641x(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8645z(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setPower(C8603e1 e1Var, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setPower");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (create.setArgumentValue("Power", e1Var.toString())) {
                MiotManager.getDeviceManipulator().invoke(create, new C8631s(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setRgb(Long l, C8620m0 m0Var, Long l2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setRgb");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("Rgb", l)) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Effect", m0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("Duration", l2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C8633t(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8627q(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8599d0(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void subscribeNotifications(CompletionHandler completionHandler, C8606f1 f1Var) {
        if (completionHandler == null) {
            throw new IllegalArgumentException("handler is null");
        } else if (f1Var != null) {
            PropertyInfo create = PropertyInfoFactory.create(getService());
            for (Property next : getService().getProperties()) {
                if (next.getDefinition().isNotifiable()) {
                    create.addProperty(next);
                }
            }
            MiotManager.getDeviceManipulator().addPropertyChangedListener(create, new C8615k(this, completionHandler), new C8637v(this, f1Var));
        } else {
            throw new IllegalArgumentException("listener is null");
        }
    }

    public void toggle(CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "toggle");
            if (create != null) {
                MiotManager.getDeviceManipulator().invoke(create, new C8635u(this, completionHandler));
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
            MiotManager.getDeviceManipulator().removePropertyChangedListener(create, new C8602e0(this, completionHandler));
            return;
        }
        throw new IllegalArgumentException("handler is null");
    }
}
