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

public class Color2Service extends AbstractService {
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
    private static final String TAG = "Color2Service";
    private AbstractDevice mDevice = null;

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color2Service$a */
    class C8479a implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8532y0 f16459a;

        C8479a(Color2Service color2Service, C8532y0 y0Var) {
            this.f16459a = y0Var;
        }

        public void onFailed(int i, String str) {
            this.f16459a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Sat");
            if (property.isValueValid()) {
                this.f16459a.mo30096a((Long) propertyInfo.getValue("Sat"));
                return;
            }
            C8532y0 y0Var = this.f16459a;
            y0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color2Service$a0 */
    class C8480a0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16460a;

        C8480a0(Color2Service color2Service, CompletionHandler completionHandler) {
            this.f16460a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16460a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16460a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color2Service$a1 */
    public interface C8481a1 {
        /* renamed from: a */
        void mo30070a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color2Service$b */
    class C8482b implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8518r0 f16461a;

        C8482b(Color2Service color2Service, C8518r0 r0Var) {
            this.f16461a = r0Var;
        }

        public void onFailed(int i, String str) {
            this.f16461a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Flowing");
            if (property.isValueValid()) {
                this.f16461a.mo30084a((Long) propertyInfo.getValue("Flowing"));
                return;
            }
            C8518r0 r0Var = this.f16461a;
            r0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color2Service$b0 */
    class C8483b0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16462a;

        C8483b0(Color2Service color2Service, CompletionHandler completionHandler) {
            this.f16462a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16462a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16462a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color2Service$b1 */
    public interface C8484b1 {
        /* renamed from: a */
        void mo30072a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color2Service$c */
    class C8485c implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8510n0 f16463a;

        C8485c(Color2Service color2Service, C8510n0 n0Var) {
            this.f16463a = n0Var;
        }

        public void onFailed(int i, String str) {
            this.f16463a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("ColorMode");
            if (property.isValueValid()) {
                this.f16463a.mo30076a((Long) propertyInfo.getValue("ColorMode"));
                return;
            }
            C8510n0 n0Var = this.f16463a;
            n0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color2Service$c0 */
    class C8486c0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16464a;

        C8486c0(Color2Service color2Service, CompletionHandler completionHandler) {
            this.f16464a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16464a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16464a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color2Service$c1 */
    public enum C8487c1 {
        undefined,
        on,
        off
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color2Service$d */
    class C8488d implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8530x0 f16469a;

        C8488d(Color2Service color2Service, C8530x0 x0Var) {
            this.f16469a = x0Var;
        }

        public void onFailed(int i, String str) {
            this.f16469a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Rgb");
            if (property.isValueValid()) {
                this.f16469a.mo30094a((Long) propertyInfo.getValue("Rgb"));
                return;
            }
            C8530x0 x0Var = this.f16469a;
            x0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color2Service$d0 */
    class C8489d0 implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16470a;

        C8489d0(Color2Service color2Service, CompletionHandler completionHandler) {
            this.f16470a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16470a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f16470a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color2Service$d1 */
    public interface C8490d1 {
        /* renamed from: a */
        void mo28654a(Long l);

        /* renamed from: b */
        void mo28655b(Long l);

        /* renamed from: c */
        void mo28656c(Long l);

        /* renamed from: d */
        void mo28657d(Long l);

        /* renamed from: e */
        void mo28658e(String str);

        /* renamed from: f */
        void mo28659f(Long l);

        /* renamed from: g */
        void mo28660g(Long l);

        /* renamed from: h */
        void mo28661h(Long l);

        /* renamed from: i */
        void mo28662i(C8487c1 c1Var);

        /* renamed from: j */
        void mo28663j(Long l);

        /* renamed from: k */
        void mo28664k(Long l);

        /* renamed from: l */
        void mo28665l(Long l);

        /* renamed from: n */
        void mo28666n(Long l);

        /* renamed from: o */
        void mo28667o(Long l);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color2Service$e */
    class C8491e implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8514p0 f16471a;

        C8491e(Color2Service color2Service, C8514p0 p0Var) {
            this.f16471a = p0Var;
        }

        public void onFailed(int i, String str) {
            this.f16471a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("DelayOff");
            if (property.isValueValid()) {
                this.f16471a.mo30080a((Long) propertyInfo.getValue("DelayOff"));
                return;
            }
            C8514p0 p0Var = this.f16471a;
            p0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color2Service$e0 */
    class C8492e0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8528w0 f16472a;

        C8492e0(Color2Service color2Service, C8528w0 w0Var) {
            this.f16472a = w0Var;
        }

        public void onFailed(int i, String str) {
            this.f16472a.onFailed(i, str);
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
                com.yeelight.yeelib.device.xiaomi.Color2Service$c1 r1 = com.yeelight.yeelib.device.xiaomi.Color2Service.C8487c1.valueOf(r1)
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
                com.yeelight.yeelib.device.xiaomi.Color2Service$w0 r4 = r0.f16472a
                r4.mo28652a(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.xiaomi.Color2Service.C8492e0.onSucceed(com.miot.common.device.invocation.PropertyInfo):void");
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color2Service$f */
    class C8493f implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8534z0 f16473a;

        C8493f(Color2Service color2Service, C8534z0 z0Var) {
            this.f16473a = z0Var;
        }

        public void onFailed(int i, String str) {
            this.f16473a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("SaveState");
            if (property.isValueValid()) {
                this.f16473a.mo30098a((Long) propertyInfo.getValue("SaveState"));
                return;
            }
            C8534z0 z0Var = this.f16473a;
            z0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color2Service$f0 */
    class C8494f0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8526v0 f16474a;

        C8494f0(Color2Service color2Service, C8526v0 v0Var) {
            this.f16474a = v0Var;
        }

        public void onFailed(int i, String str) {
            this.f16474a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Power");
            if (property.isValueValid()) {
                this.f16474a.mo30092a(C8487c1.valueOf((String) propertyInfo.getValue("Power")));
                return;
            }
            C8526v0 v0Var = this.f16474a;
            v0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color2Service$g */
    class C8495g implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8516q0 f16475a;

        C8495g(Color2Service color2Service, C8516q0 q0Var) {
            this.f16475a = q0Var;
        }

        public void onFailed(int i, String str) {
            this.f16475a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("FlowParams");
            if (property.isValueValid()) {
                this.f16475a.onSucceed((String) propertyInfo.getValue("FlowParams"));
                return;
            }
            C8516q0 q0Var = this.f16475a;
            q0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color2Service$g0 */
    class C8496g0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8508m0 f16476a;

        C8496g0(Color2Service color2Service, C8508m0 m0Var) {
            this.f16476a = m0Var;
        }

        public void onFailed(int i, String str) {
            this.f16476a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Bright");
            if (property.isValueValid()) {
                this.f16476a.mo30074a((Long) propertyInfo.getValue("Bright"));
                return;
            }
            C8508m0 m0Var = this.f16476a;
            m0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color2Service$h */
    class C8497h implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8522t0 f16477a;

        C8497h(Color2Service color2Service, C8522t0 t0Var) {
            this.f16477a = t0Var;
        }

        public void onFailed(int i, String str) {
            this.f16477a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("LanMode");
            if (property.isValueValid()) {
                this.f16477a.mo30088a((Long) propertyInfo.getValue("LanMode"));
                return;
            }
            C8522t0 t0Var = this.f16477a;
            t0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color2Service$h0 */
    class C8498h0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8512o0 f16478a;

        C8498h0(Color2Service color2Service, C8512o0 o0Var) {
            this.f16478a = o0Var;
        }

        public void onFailed(int i, String str) {
            this.f16478a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Ct");
            if (property.isValueValid()) {
                this.f16478a.mo30078a((Long) propertyInfo.getValue("Ct"));
                return;
            }
            C8512o0 o0Var = this.f16478a;
            o0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color2Service$i */
    class C8499i implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8484b1 f16479a;

        C8499i(Color2Service color2Service, C8484b1 b1Var) {
            this.f16479a = b1Var;
        }

        public void onFailed(int i, String str) {
            this.f16479a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("onFromPower");
            if (property.isValueValid()) {
                this.f16479a.mo30072a((Long) propertyInfo.getValue("onFromPower"));
                return;
            }
            C8484b1 b1Var = this.f16479a;
            b1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color2Service$i0 */
    class C8500i0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8481a1 f16480a;

        C8500i0(Color2Service color2Service, C8481a1 a1Var) {
            this.f16480a = a1Var;
        }

        public void onFailed(int i, String str) {
            this.f16480a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Temperature");
            if (property.isValueValid()) {
                this.f16480a.mo30070a((Long) propertyInfo.getValue("Temperature"));
                return;
            }
            C8481a1 a1Var = this.f16480a;
            a1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color2Service$j */
    class C8501j implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8524u0 f16481a;

        C8501j(Color2Service color2Service, C8524u0 u0Var) {
            this.f16481a = u0Var;
        }

        public void onFailed(int i, String str) {
            this.f16481a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("MusicEnable");
            if (property.isValueValid()) {
                this.f16481a.mo30090a((Long) propertyInfo.getValue("MusicEnable"));
                return;
            }
            C8524u0 u0Var = this.f16481a;
            u0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color2Service$j0 */
    class C8502j0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8520s0 f16482a;

        C8502j0(Color2Service color2Service, C8520s0 s0Var) {
            this.f16482a = s0Var;
        }

        public void onFailed(int i, String str) {
            this.f16482a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Hue");
            if (property.isValueValid()) {
                this.f16482a.mo30086a((Long) propertyInfo.getValue("Hue"));
                return;
            }
            C8520s0 s0Var = this.f16482a;
            s0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color2Service$k */
    class C8503k implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16483a;

        C8503k(Color2Service color2Service, CompletionHandler completionHandler) {
            this.f16483a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16483a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f16483a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color2Service$k0 */
    public enum C8504k0 {
        undefined,
        cfg_pomodoro,
        cfg_lan_ctrl,
        cfg_save_state,
        cfg_init_power
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color2Service$l */
    class C8505l implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16490a;

        C8505l(Color2Service color2Service, CompletionHandler completionHandler) {
            this.f16490a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16490a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16490a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color2Service$l0 */
    public enum C8506l0 {
        undefined,
        smooth,
        sudden
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color2Service$m */
    class C8507m implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16495a;

        C8507m(Color2Service color2Service, CompletionHandler completionHandler) {
            this.f16495a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16495a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16495a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color2Service$m0 */
    public interface C8508m0 {
        /* renamed from: a */
        void mo30074a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color2Service$n */
    class C8509n implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16496a;

        C8509n(Color2Service color2Service, CompletionHandler completionHandler) {
            this.f16496a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16496a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16496a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color2Service$n0 */
    public interface C8510n0 {
        /* renamed from: a */
        void mo30076a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color2Service$o */
    class C8511o implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16497a;

        C8511o(Color2Service color2Service, CompletionHandler completionHandler) {
            this.f16497a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16497a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16497a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color2Service$o0 */
    public interface C8512o0 {
        /* renamed from: a */
        void mo30078a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color2Service$p */
    class C8513p implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16498a;

        C8513p(Color2Service color2Service, CompletionHandler completionHandler) {
            this.f16498a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16498a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16498a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color2Service$p0 */
    public interface C8514p0 {
        /* renamed from: a */
        void mo30080a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color2Service$q */
    class C8515q implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16499a;

        C8515q(Color2Service color2Service, CompletionHandler completionHandler) {
            this.f16499a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16499a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16499a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color2Service$q0 */
    public interface C8516q0 {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color2Service$r */
    class C8517r implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16500a;

        C8517r(Color2Service color2Service, CompletionHandler completionHandler) {
            this.f16500a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16500a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16500a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color2Service$r0 */
    public interface C8518r0 {
        /* renamed from: a */
        void mo30084a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color2Service$s */
    class C8519s implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16501a;

        C8519s(Color2Service color2Service, CompletionHandler completionHandler) {
            this.f16501a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16501a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16501a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color2Service$s0 */
    public interface C8520s0 {
        /* renamed from: a */
        void mo30086a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color2Service$t */
    class C8521t implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16502a;

        C8521t(Color2Service color2Service, CompletionHandler completionHandler) {
            this.f16502a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16502a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16502a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color2Service$t0 */
    public interface C8522t0 {
        /* renamed from: a */
        void mo30088a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color2Service$u */
    class C8523u implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16503a;

        C8523u(Color2Service color2Service, CompletionHandler completionHandler) {
            this.f16503a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16503a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16503a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color2Service$u0 */
    public interface C8524u0 {
        /* renamed from: a */
        void mo30090a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color2Service$v */
    class C8525v implements DeviceManipulator.PropertyChangedListener {

        /* renamed from: a */
        final /* synthetic */ C8490d1 f16504a;

        C8525v(Color2Service color2Service, C8490d1 d1Var) {
            this.f16504a = d1Var;
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
                java.lang.String r8 = "Power"
                java.lang.String r9 = "onFromPower"
                java.lang.String r10 = "Sat"
                java.lang.String r11 = "Rgb"
                java.lang.String r12 = "Hue"
                java.lang.String r13 = "Ct"
                java.lang.String r14 = "ColorMode"
                java.lang.String r15 = "MusicEnable"
                java.lang.String r0 = "FlowParams"
                java.lang.String r1 = "SaveState"
                switch(r3) {
                    case -2117953292: goto L_0x009b;
                    case -2002016140: goto L_0x0092;
                    case -1787381784: goto L_0x0089;
                    case -310275194: goto L_0x0081;
                    case 2193: goto L_0x0079;
                    case 72920: goto L_0x0071;
                    case 82093: goto L_0x0069;
                    case 82886: goto L_0x0061;
                    case 35911772: goto L_0x0058;
                    case 77306085: goto L_0x0050;
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
                r2 = 11
                goto L_0x00a5
            L_0x003e:
                boolean r2 = r2.equals(r6)
                if (r2 == 0) goto L_0x00a4
                r2 = 5
                goto L_0x00a5
            L_0x0047:
                boolean r2 = r2.equals(r7)
                if (r2 == 0) goto L_0x00a4
                r2 = 8
                goto L_0x00a5
            L_0x0050:
                boolean r2 = r2.equals(r8)
                if (r2 == 0) goto L_0x00a4
                r2 = 0
                goto L_0x00a5
            L_0x0058:
                boolean r2 = r2.equals(r9)
                if (r2 == 0) goto L_0x00a4
                r2 = 12
                goto L_0x00a5
            L_0x0061:
                boolean r2 = r2.equals(r10)
                if (r2 == 0) goto L_0x00a4
                r2 = 4
                goto L_0x00a5
            L_0x0069:
                boolean r2 = r2.equals(r11)
                if (r2 == 0) goto L_0x00a4
                r2 = 7
                goto L_0x00a5
            L_0x0071:
                boolean r2 = r2.equals(r12)
                if (r2 == 0) goto L_0x00a4
                r2 = 3
                goto L_0x00a5
            L_0x0079:
                boolean r2 = r2.equals(r13)
                if (r2 == 0) goto L_0x00a4
                r2 = 2
                goto L_0x00a5
            L_0x0081:
                boolean r2 = r2.equals(r14)
                if (r2 == 0) goto L_0x00a4
                r2 = 6
                goto L_0x00a5
            L_0x0089:
                boolean r2 = r2.equals(r15)
                if (r2 == 0) goto L_0x00a4
                r2 = 13
                goto L_0x00a5
            L_0x0092:
                boolean r2 = r2.equals(r0)
                if (r2 == 0) goto L_0x00a4
                r2 = 10
                goto L_0x00a5
            L_0x009b:
                boolean r2 = r2.equals(r1)
                if (r2 == 0) goto L_0x00a4
                r2 = 9
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
                    case 8: goto L_0x0134;
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
                com.miot.common.property.Property r0 = r1.getProperty(r15)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x00a8
                java.lang.Object r0 = r1.getValue(r15)
                java.lang.Long r0 = (java.lang.Long) r0
                r3 = r16
                com.yeelight.yeelib.device.xiaomi.Color2Service$d1 r1 = r3.f16504a
                r1.mo28667o(r0)
                goto L_0x0226
            L_0x00c7:
                r3 = r16
                r1 = r17
                com.miot.common.property.Property r0 = r1.getProperty(r9)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0226
                java.lang.Object r0 = r1.getValue(r9)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Color2Service$d1 r1 = r3.f16504a
                r1.mo28659f(r0)
                goto L_0x0226
            L_0x00e2:
                r3 = r16
                r1 = r17
                com.miot.common.property.Property r0 = r1.getProperty(r5)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0226
                java.lang.Object r0 = r1.getValue(r5)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Color2Service$d1 r1 = r3.f16504a
                r1.mo28660g(r0)
                goto L_0x0226
            L_0x00fd:
                r3 = r16
                r1 = r17
                com.miot.common.property.Property r2 = r1.getProperty(r0)
                boolean r2 = r2.isValueValid()
                if (r2 == 0) goto L_0x0226
                java.lang.Object r0 = r1.getValue(r0)
                java.lang.String r0 = (java.lang.String) r0
                com.yeelight.yeelib.device.xiaomi.Color2Service$d1 r1 = r3.f16504a
                r1.mo28658e(r0)
                goto L_0x0226
            L_0x0118:
                r3 = r16
                r2 = r1
                r1 = r17
                com.miot.common.property.Property r0 = r1.getProperty(r2)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0226
                java.lang.Object r0 = r1.getValue(r2)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Color2Service$d1 r1 = r3.f16504a
                r1.mo28657d(r0)
                goto L_0x0226
            L_0x0134:
                r3 = r16
                r1 = r17
                com.miot.common.property.Property r0 = r1.getProperty(r7)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0226
                java.lang.Object r0 = r1.getValue(r7)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Color2Service$d1 r1 = r3.f16504a
                r1.mo28655b(r0)
                goto L_0x0226
            L_0x014f:
                r3 = r16
                r1 = r17
                com.miot.common.property.Property r0 = r1.getProperty(r11)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0226
                java.lang.Object r0 = r1.getValue(r11)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Color2Service$d1 r1 = r3.f16504a
                r1.mo28663j(r0)
                goto L_0x0226
            L_0x016a:
                r3 = r16
                r1 = r17
                com.miot.common.property.Property r0 = r1.getProperty(r14)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0226
                java.lang.Object r0 = r1.getValue(r14)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Color2Service$d1 r1 = r3.f16504a
                r1.mo28665l(r0)
                goto L_0x0226
            L_0x0185:
                r3 = r16
                r1 = r17
                com.miot.common.property.Property r0 = r1.getProperty(r6)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0226
                java.lang.Object r0 = r1.getValue(r6)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Color2Service$d1 r1 = r3.f16504a
                r1.mo28656c(r0)
                goto L_0x0226
            L_0x01a0:
                r3 = r16
                r1 = r17
                com.miot.common.property.Property r0 = r1.getProperty(r10)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0226
                java.lang.Object r0 = r1.getValue(r10)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Color2Service$d1 r1 = r3.f16504a
                r1.mo28664k(r0)
                goto L_0x0226
            L_0x01bb:
                r3 = r16
                r1 = r17
                com.miot.common.property.Property r0 = r1.getProperty(r12)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0226
                java.lang.Object r0 = r1.getValue(r12)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Color2Service$d1 r1 = r3.f16504a
                r1.mo28666n(r0)
                goto L_0x0226
            L_0x01d5:
                r3 = r16
                r1 = r17
                com.miot.common.property.Property r0 = r1.getProperty(r13)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0226
                java.lang.Object r0 = r1.getValue(r13)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Color2Service$d1 r1 = r3.f16504a
                r1.mo28661h(r0)
                goto L_0x0226
            L_0x01ef:
                r3 = r16
                r1 = r17
                com.miot.common.property.Property r0 = r1.getProperty(r4)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0226
                java.lang.Object r0 = r1.getValue(r4)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Color2Service$d1 r1 = r3.f16504a
                r1.mo28654a(r0)
                goto L_0x0226
            L_0x0209:
                r3 = r16
                r1 = r17
                com.miot.common.property.Property r0 = r1.getProperty(r8)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0226
                java.lang.Object r0 = r1.getValue(r8)
                java.lang.String r0 = (java.lang.String) r0
                com.yeelight.yeelib.device.xiaomi.Color2Service$c1 r0 = com.yeelight.yeelib.device.xiaomi.Color2Service.C8487c1.valueOf(r0)
                com.yeelight.yeelib.device.xiaomi.Color2Service$d1 r1 = r3.f16504a
                r1.mo28662i(r0)
            L_0x0226:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.xiaomi.Color2Service.C8525v.onPropertyChanged(com.miot.common.device.invocation.PropertyInfo, java.lang.String):void");
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color2Service$v0 */
    public interface C8526v0 {
        /* renamed from: a */
        void mo30092a(C8487c1 c1Var);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color2Service$w */
    class C8527w implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16505a;

        C8527w(Color2Service color2Service, CompletionHandler completionHandler) {
            this.f16505a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16505a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16505a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color2Service$w0 */
    public interface C8528w0 {
        /* renamed from: a */
        void mo28652a(C8487c1 c1Var, Long l, Long l2, Long l3, Long l4, Long l5, Long l6, Long l7, Long l8, Long l9, Long l10, String str, Long l11, Long l12, Long l13);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color2Service$x */
    class C8529x implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16506a;

        C8529x(Color2Service color2Service, CompletionHandler completionHandler) {
            this.f16506a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16506a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16506a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color2Service$x0 */
    public interface C8530x0 {
        /* renamed from: a */
        void mo30094a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color2Service$y */
    class C8531y implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16507a;

        C8531y(Color2Service color2Service, CompletionHandler completionHandler) {
            this.f16507a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16507a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16507a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color2Service$y0 */
    public interface C8532y0 {
        /* renamed from: a */
        void mo30096a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color2Service$z */
    class C8533z implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16508a;

        C8533z(Color2Service color2Service, CompletionHandler completionHandler) {
            this.f16508a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16508a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16508a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color2Service$z0 */
    public interface C8534z0 {
        /* renamed from: a */
        void mo30098a(Long l);

        void onFailed(int i, String str);
    }

    public Color2Service(AbstractDevice abstractDevice) {
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
                MiotManager.getDeviceManipulator().invoke(create, new C8523u(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8509n(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8505l(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8483b0(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getBright(C8508m0 m0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Bright"), new C8496g0(this, m0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getColorMode(C8510n0 n0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "ColorMode"), new C8485c(this, n0Var));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8480a0(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getCt(C8512o0 o0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Ct"), new C8498h0(this, o0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getDelayOff(C8514p0 p0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "DelayOff"), new C8491e(this, p0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowParams(C8516q0 q0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "FlowParams"), new C8495g(this, q0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowing(C8518r0 r0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Flowing"), new C8482b(this, r0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getHue(C8520s0 s0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Hue"), new C8502j0(this, s0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getLanMode(C8522t0 t0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "LanMode"), new C8497h(this, t0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getMusicEnable(C8524u0 u0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "MusicEnable"), new C8501j(this, u0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getPower(C8526v0 v0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Power"), new C8494f0(this, v0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getProperties(C8528w0 w0Var) {
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
            MiotManager.getDeviceManipulator().readProperty(create, new C8492e0(this, w0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getRgb(C8530x0 x0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Rgb"), new C8488d(this, x0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getSat(C8532y0 y0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Sat"), new C8479a(this, y0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getSaveState(C8534z0 z0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "SaveState"), new C8493f(this, z0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getTemperature(C8481a1 a1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Temperature"), new C8500i0(this, a1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getonFromPower(C8484b1 b1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "onFromPower"), new C8499i(this, b1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void openWithMode(C8487c1 c1Var, C8506l0 l0Var, Long l, Long l2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "openWithMode");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("Power", c1Var.toString())) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Effect", l0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Duration", l)) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("Mode", l2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C8515q(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8511o(this, completionHandler));
                return;
            }
            throw new MiotException("actionInfo is null");
        }
        throw new MiotException("device not configurated connection");
    }

    public void sendCmd(C8504k0 k0Var, String str, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "sendCmd");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("CmdKey", k0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("CmdValue", str)) {
                MiotManager.getDeviceManipulator().invoke(create, new C8529x(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setBright(Long l, C8506l0 l0Var, Long l2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setBright");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("Bright", l)) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Effect", l0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("Duration", l2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C8507m(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setCt(Long l, C8506l0 l0Var, Long l2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setCt");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("Ct", l)) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Effect", l0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("Duration", l2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C8533z(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8527w(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8531y(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setPower(C8487c1 c1Var, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setPower");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (create.setArgumentValue("Power", c1Var.toString())) {
                MiotManager.getDeviceManipulator().invoke(create, new C8517r(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setRgb(Long l, C8506l0 l0Var, Long l2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setRgb");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("Rgb", l)) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Effect", l0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("Duration", l2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C8519s(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8513p(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8486c0(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void subscribeNotifications(CompletionHandler completionHandler, C8490d1 d1Var) {
        if (completionHandler == null) {
            throw new IllegalArgumentException("handler is null");
        } else if (d1Var != null) {
            PropertyInfo create = PropertyInfoFactory.create(getService());
            for (Property next : getService().getProperties()) {
                if (next.getDefinition().isNotifiable()) {
                    create.addProperty(next);
                }
            }
            MiotManager.getDeviceManipulator().addPropertyChangedListener(create, new C8503k(this, completionHandler), new C8525v(this, d1Var));
        } else {
            throw new IllegalArgumentException("listener is null");
        }
    }

    public void toggle(CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "toggle");
            if (create != null) {
                MiotManager.getDeviceManipulator().invoke(create, new C8521t(this, completionHandler));
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
            MiotManager.getDeviceManipulator().removePropertyChangedListener(create, new C8489d0(this, completionHandler));
            return;
        }
        throw new IllegalArgumentException("handler is null");
    }
}
