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
    private static final String TAG = "Color3Service";
    private AbstractDevice mDevice = null;

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color3Service$a */
    class C8535a implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8582w0 f16509a;

        C8535a(Color3Service color3Service, C8582w0 w0Var) {
            this.f16509a = w0Var;
        }

        public void onFailed(int i, String str) {
            this.f16509a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Sat");
            if (property.isValueValid()) {
                this.f16509a.mo30154a((Long) propertyInfo.getValue("Sat"));
                return;
            }
            C8582w0 w0Var = this.f16509a;
            w0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color3Service$a0 */
    class C8536a0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16510a;

        C8536a0(Color3Service color3Service, CompletionHandler completionHandler) {
            this.f16510a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16510a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16510a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color3Service$a1 */
    public enum C8537a1 {
        undefined,
        on,
        off
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color3Service$b */
    class C8538b implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8570q0 f16515a;

        C8538b(Color3Service color3Service, C8570q0 q0Var) {
            this.f16515a = q0Var;
        }

        public void onFailed(int i, String str) {
            this.f16515a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Flowing");
            if (property.isValueValid()) {
                this.f16515a.mo30144a((Long) propertyInfo.getValue("Flowing"));
                return;
            }
            C8570q0 q0Var = this.f16515a;
            q0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color3Service$b0 */
    class C8539b0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16516a;

        C8539b0(Color3Service color3Service, CompletionHandler completionHandler) {
            this.f16516a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16516a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16516a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color3Service$b1 */
    public interface C8540b1 {
        /* renamed from: a */
        void mo28672a(Long l);

        /* renamed from: b */
        void mo28673b(Long l);

        /* renamed from: c */
        void mo28674c(Long l);

        /* renamed from: d */
        void mo28675d(Long l);

        /* renamed from: e */
        void mo28676e(String str);

        /* renamed from: f */
        void mo28677f(Long l);

        /* renamed from: g */
        void mo28678g(C8537a1 a1Var);

        /* renamed from: h */
        void mo28679h(Long l);

        /* renamed from: j */
        void mo28680j(Long l);

        /* renamed from: k */
        void mo28681k(Long l);

        /* renamed from: l */
        void mo28682l(Long l);

        /* renamed from: n */
        void mo28683n(Long l);

        /* renamed from: o */
        void mo28684o(Long l);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color3Service$c */
    class C8541c implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8562m0 f16517a;

        C8541c(Color3Service color3Service, C8562m0 m0Var) {
            this.f16517a = m0Var;
        }

        public void onFailed(int i, String str) {
            this.f16517a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("ColorMode");
            if (property.isValueValid()) {
                this.f16517a.mo30136a((Long) propertyInfo.getValue("ColorMode"));
                return;
            }
            C8562m0 m0Var = this.f16517a;
            m0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color3Service$c0 */
    class C8542c0 implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16518a;

        C8542c0(Color3Service color3Service, CompletionHandler completionHandler) {
            this.f16518a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16518a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f16518a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color3Service$d */
    class C8543d implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8580v0 f16519a;

        C8543d(Color3Service color3Service, C8580v0 v0Var) {
            this.f16519a = v0Var;
        }

        public void onFailed(int i, String str) {
            this.f16519a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Rgb");
            if (property.isValueValid()) {
                this.f16519a.mo30152a((Long) propertyInfo.getValue("Rgb"));
                return;
            }
            C8580v0 v0Var = this.f16519a;
            v0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color3Service$d0 */
    class C8544d0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8578u0 f16520a;

        C8544d0(Color3Service color3Service, C8578u0 u0Var) {
            this.f16520a = u0Var;
        }

        public void onFailed(int i, String str) {
            this.f16520a.onFailed(i, str);
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
                com.yeelight.yeelib.device.xiaomi.Color3Service$a1 r1 = com.yeelight.yeelib.device.xiaomi.Color3Service.C8537a1.valueOf(r1)
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
                java.lang.String r1 = "MusicEnable"
                com.miot.common.property.Property r0 = r0.getProperty(r1)
                boolean r1 = r0.isValueValid()
                if (r1 == 0) goto L_0x012f
                java.lang.Object r0 = r0.getValue()
                r3 = r0
                java.lang.Long r3 = (java.lang.Long) r3
            L_0x012f:
                r0 = r19
                r18 = r3
                com.yeelight.yeelib.device.xiaomi.Color3Service$u0 r4 = r0.f16520a
                r4.mo28670a(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.xiaomi.Color3Service.C8544d0.onSucceed(com.miot.common.device.invocation.PropertyInfo):void");
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color3Service$e */
    class C8545e implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8566o0 f16521a;

        C8545e(Color3Service color3Service, C8566o0 o0Var) {
            this.f16521a = o0Var;
        }

        public void onFailed(int i, String str) {
            this.f16521a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("DelayOff");
            if (property.isValueValid()) {
                this.f16521a.mo30140a((Long) propertyInfo.getValue("DelayOff"));
                return;
            }
            C8566o0 o0Var = this.f16521a;
            o0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color3Service$e0 */
    class C8546e0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8576t0 f16522a;

        C8546e0(Color3Service color3Service, C8576t0 t0Var) {
            this.f16522a = t0Var;
        }

        public void onFailed(int i, String str) {
            this.f16522a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Power");
            if (property.isValueValid()) {
                this.f16522a.mo30150a(C8537a1.valueOf((String) propertyInfo.getValue("Power")));
                return;
            }
            C8576t0 t0Var = this.f16522a;
            t0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color3Service$f */
    class C8547f implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8584x0 f16523a;

        C8547f(Color3Service color3Service, C8584x0 x0Var) {
            this.f16523a = x0Var;
        }

        public void onFailed(int i, String str) {
            this.f16523a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("SaveState");
            if (property.isValueValid()) {
                this.f16523a.mo30156a((Long) propertyInfo.getValue("SaveState"));
                return;
            }
            C8584x0 x0Var = this.f16523a;
            x0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color3Service$f0 */
    class C8548f0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8560l0 f16524a;

        C8548f0(Color3Service color3Service, C8560l0 l0Var) {
            this.f16524a = l0Var;
        }

        public void onFailed(int i, String str) {
            this.f16524a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Bright");
            if (property.isValueValid()) {
                this.f16524a.mo30134a((Long) propertyInfo.getValue("Bright"));
                return;
            }
            C8560l0 l0Var = this.f16524a;
            l0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color3Service$g */
    class C8549g implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8568p0 f16525a;

        C8549g(Color3Service color3Service, C8568p0 p0Var) {
            this.f16525a = p0Var;
        }

        public void onFailed(int i, String str) {
            this.f16525a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("FlowParams");
            if (property.isValueValid()) {
                this.f16525a.onSucceed((String) propertyInfo.getValue("FlowParams"));
                return;
            }
            C8568p0 p0Var = this.f16525a;
            p0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color3Service$g0 */
    class C8550g0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8564n0 f16526a;

        C8550g0(Color3Service color3Service, C8564n0 n0Var) {
            this.f16526a = n0Var;
        }

        public void onFailed(int i, String str) {
            this.f16526a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Ct");
            if (property.isValueValid()) {
                this.f16526a.mo30138a((Long) propertyInfo.getValue("Ct"));
                return;
            }
            C8564n0 n0Var = this.f16526a;
            n0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color3Service$h */
    class C8551h implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8588z0 f16527a;

        C8551h(Color3Service color3Service, C8588z0 z0Var) {
            this.f16527a = z0Var;
        }

        public void onFailed(int i, String str) {
            this.f16527a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("onFromPower");
            if (property.isValueValid()) {
                this.f16527a.mo30160a((Long) propertyInfo.getValue("onFromPower"));
                return;
            }
            C8588z0 z0Var = this.f16527a;
            z0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color3Service$h0 */
    class C8552h0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8586y0 f16528a;

        C8552h0(Color3Service color3Service, C8586y0 y0Var) {
            this.f16528a = y0Var;
        }

        public void onFailed(int i, String str) {
            this.f16528a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Temperature");
            if (property.isValueValid()) {
                this.f16528a.mo30158a((Long) propertyInfo.getValue("Temperature"));
                return;
            }
            C8586y0 y0Var = this.f16528a;
            y0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color3Service$i */
    class C8553i implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8574s0 f16529a;

        C8553i(Color3Service color3Service, C8574s0 s0Var) {
            this.f16529a = s0Var;
        }

        public void onFailed(int i, String str) {
            this.f16529a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("MusicEnable");
            if (property.isValueValid()) {
                this.f16529a.mo30148a((Long) propertyInfo.getValue("MusicEnable"));
                return;
            }
            C8574s0 s0Var = this.f16529a;
            s0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color3Service$i0 */
    class C8554i0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8572r0 f16530a;

        C8554i0(Color3Service color3Service, C8572r0 r0Var) {
            this.f16530a = r0Var;
        }

        public void onFailed(int i, String str) {
            this.f16530a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Hue");
            if (property.isValueValid()) {
                this.f16530a.mo30146a((Long) propertyInfo.getValue("Hue"));
                return;
            }
            C8572r0 r0Var = this.f16530a;
            r0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color3Service$j */
    class C8555j implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16531a;

        C8555j(Color3Service color3Service, CompletionHandler completionHandler) {
            this.f16531a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16531a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16531a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color3Service$j0 */
    public enum C8556j0 {
        undefined,
        cfg_pomodoro,
        cfg_lan_ctrl,
        cfg_save_state,
        cfg_init_power
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color3Service$k */
    class C8557k implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16538a;

        C8557k(Color3Service color3Service, CompletionHandler completionHandler) {
            this.f16538a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16538a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f16538a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color3Service$k0 */
    public enum C8558k0 {
        undefined,
        smooth,
        sudden
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color3Service$l */
    class C8559l implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16543a;

        C8559l(Color3Service color3Service, CompletionHandler completionHandler) {
            this.f16543a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16543a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16543a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color3Service$l0 */
    public interface C8560l0 {
        /* renamed from: a */
        void mo30134a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color3Service$m */
    class C8561m implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16544a;

        C8561m(Color3Service color3Service, CompletionHandler completionHandler) {
            this.f16544a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16544a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16544a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color3Service$m0 */
    public interface C8562m0 {
        /* renamed from: a */
        void mo30136a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color3Service$n */
    class C8563n implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16545a;

        C8563n(Color3Service color3Service, CompletionHandler completionHandler) {
            this.f16545a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16545a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16545a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color3Service$n0 */
    public interface C8564n0 {
        /* renamed from: a */
        void mo30138a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color3Service$o */
    class C8565o implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16546a;

        C8565o(Color3Service color3Service, CompletionHandler completionHandler) {
            this.f16546a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16546a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16546a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color3Service$o0 */
    public interface C8566o0 {
        /* renamed from: a */
        void mo30140a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color3Service$p */
    class C8567p implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16547a;

        C8567p(Color3Service color3Service, CompletionHandler completionHandler) {
            this.f16547a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16547a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16547a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color3Service$p0 */
    public interface C8568p0 {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color3Service$q */
    class C8569q implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16548a;

        C8569q(Color3Service color3Service, CompletionHandler completionHandler) {
            this.f16548a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16548a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16548a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color3Service$q0 */
    public interface C8570q0 {
        /* renamed from: a */
        void mo30144a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color3Service$r */
    class C8571r implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16549a;

        C8571r(Color3Service color3Service, CompletionHandler completionHandler) {
            this.f16549a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16549a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16549a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color3Service$r0 */
    public interface C8572r0 {
        /* renamed from: a */
        void mo30146a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color3Service$s */
    class C8573s implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16550a;

        C8573s(Color3Service color3Service, CompletionHandler completionHandler) {
            this.f16550a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16550a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16550a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color3Service$s0 */
    public interface C8574s0 {
        /* renamed from: a */
        void mo30148a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color3Service$t */
    class C8575t implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16551a;

        C8575t(Color3Service color3Service, CompletionHandler completionHandler) {
            this.f16551a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16551a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16551a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color3Service$t0 */
    public interface C8576t0 {
        /* renamed from: a */
        void mo30150a(C8537a1 a1Var);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color3Service$u */
    class C8577u implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16552a;

        C8577u(Color3Service color3Service, CompletionHandler completionHandler) {
            this.f16552a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16552a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16552a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color3Service$u0 */
    public interface C8578u0 {
        /* renamed from: a */
        void mo28670a(C8537a1 a1Var, Long l, Long l2, Long l3, Long l4, Long l5, Long l6, Long l7, Long l8, Long l9, Long l10, String str, Long l11, Long l12);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color3Service$v */
    class C8579v implements DeviceManipulator.PropertyChangedListener {

        /* renamed from: a */
        final /* synthetic */ C8540b1 f16553a;

        C8579v(Color3Service color3Service, C8540b1 b1Var) {
            this.f16553a = b1Var;
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
                java.lang.String r5 = "Flowing"
                java.lang.String r6 = "DelayOff"
                java.lang.String r7 = "Power"
                java.lang.String r8 = "onFromPower"
                java.lang.String r9 = "Sat"
                java.lang.String r10 = "Rgb"
                java.lang.String r11 = "Hue"
                java.lang.String r12 = "Ct"
                java.lang.String r13 = "ColorMode"
                java.lang.String r14 = "MusicEnable"
                java.lang.String r15 = "FlowParams"
                java.lang.String r0 = "SaveState"
                switch(r3) {
                    case -2117953292: goto L_0x008f;
                    case -2002016140: goto L_0x0086;
                    case -1787381784: goto L_0x007d;
                    case -310275194: goto L_0x0075;
                    case 2193: goto L_0x006d;
                    case 72920: goto L_0x0065;
                    case 82093: goto L_0x005d;
                    case 82886: goto L_0x0055;
                    case 35911772: goto L_0x004c;
                    case 77306085: goto L_0x0044;
                    case 880790796: goto L_0x003b;
                    case 898856916: goto L_0x0032;
                    case 1998035738: goto L_0x0029;
                    default: goto L_0x0027;
                }
            L_0x0027:
                goto L_0x0098
            L_0x0029:
                boolean r2 = r2.equals(r4)
                if (r2 == 0) goto L_0x0098
                r2 = 1
                goto L_0x0099
            L_0x0032:
                boolean r2 = r2.equals(r5)
                if (r2 == 0) goto L_0x0098
                r2 = 5
                goto L_0x0099
            L_0x003b:
                boolean r2 = r2.equals(r6)
                if (r2 == 0) goto L_0x0098
                r2 = 8
                goto L_0x0099
            L_0x0044:
                boolean r2 = r2.equals(r7)
                if (r2 == 0) goto L_0x0098
                r2 = 0
                goto L_0x0099
            L_0x004c:
                boolean r2 = r2.equals(r8)
                if (r2 == 0) goto L_0x0098
                r2 = 11
                goto L_0x0099
            L_0x0055:
                boolean r2 = r2.equals(r9)
                if (r2 == 0) goto L_0x0098
                r2 = 4
                goto L_0x0099
            L_0x005d:
                boolean r2 = r2.equals(r10)
                if (r2 == 0) goto L_0x0098
                r2 = 7
                goto L_0x0099
            L_0x0065:
                boolean r2 = r2.equals(r11)
                if (r2 == 0) goto L_0x0098
                r2 = 3
                goto L_0x0099
            L_0x006d:
                boolean r2 = r2.equals(r12)
                if (r2 == 0) goto L_0x0098
                r2 = 2
                goto L_0x0099
            L_0x0075:
                boolean r2 = r2.equals(r13)
                if (r2 == 0) goto L_0x0098
                r2 = 6
                goto L_0x0099
            L_0x007d:
                boolean r2 = r2.equals(r14)
                if (r2 == 0) goto L_0x0098
                r2 = 12
                goto L_0x0099
            L_0x0086:
                boolean r2 = r2.equals(r15)
                if (r2 == 0) goto L_0x0098
                r2 = 10
                goto L_0x0099
            L_0x008f:
                boolean r2 = r2.equals(r0)
                if (r2 == 0) goto L_0x0098
                r2 = 9
                goto L_0x0099
            L_0x0098:
                r2 = -1
            L_0x0099:
                switch(r2) {
                    case 0: goto L_0x01c8;
                    case 1: goto L_0x01b0;
                    case 2: goto L_0x0198;
                    case 3: goto L_0x0180;
                    case 4: goto L_0x0168;
                    case 5: goto L_0x014f;
                    case 6: goto L_0x0136;
                    case 7: goto L_0x011d;
                    case 8: goto L_0x0104;
                    case 9: goto L_0x00eb;
                    case 10: goto L_0x00d2;
                    case 11: goto L_0x00b9;
                    case 12: goto L_0x00a0;
                    default: goto L_0x009c;
                }
            L_0x009c:
                r2 = r16
                goto L_0x01e3
            L_0x00a0:
                com.miot.common.property.Property r0 = r1.getProperty(r14)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x009c
                java.lang.Object r0 = r1.getValue(r14)
                java.lang.Long r0 = (java.lang.Long) r0
                r2 = r16
                com.yeelight.yeelib.device.xiaomi.Color3Service$b1 r1 = r2.f16553a
                r1.mo28684o(r0)
                goto L_0x01e3
            L_0x00b9:
                r2 = r16
                com.miot.common.property.Property r0 = r1.getProperty(r8)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x01e3
                java.lang.Object r0 = r1.getValue(r8)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Color3Service$b1 r1 = r2.f16553a
                r1.mo28677f(r0)
                goto L_0x01e3
            L_0x00d2:
                r2 = r16
                com.miot.common.property.Property r0 = r1.getProperty(r15)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x01e3
                java.lang.Object r0 = r1.getValue(r15)
                java.lang.String r0 = (java.lang.String) r0
                com.yeelight.yeelib.device.xiaomi.Color3Service$b1 r1 = r2.f16553a
                r1.mo28676e(r0)
                goto L_0x01e3
            L_0x00eb:
                r2 = r16
                com.miot.common.property.Property r3 = r1.getProperty(r0)
                boolean r3 = r3.isValueValid()
                if (r3 == 0) goto L_0x01e3
                java.lang.Object r0 = r1.getValue(r0)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Color3Service$b1 r1 = r2.f16553a
                r1.mo28675d(r0)
                goto L_0x01e3
            L_0x0104:
                r2 = r16
                com.miot.common.property.Property r0 = r1.getProperty(r6)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x01e3
                java.lang.Object r0 = r1.getValue(r6)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Color3Service$b1 r1 = r2.f16553a
                r1.mo28673b(r0)
                goto L_0x01e3
            L_0x011d:
                r2 = r16
                com.miot.common.property.Property r0 = r1.getProperty(r10)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x01e3
                java.lang.Object r0 = r1.getValue(r10)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Color3Service$b1 r1 = r2.f16553a
                r1.mo28680j(r0)
                goto L_0x01e3
            L_0x0136:
                r2 = r16
                com.miot.common.property.Property r0 = r1.getProperty(r13)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x01e3
                java.lang.Object r0 = r1.getValue(r13)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Color3Service$b1 r1 = r2.f16553a
                r1.mo28682l(r0)
                goto L_0x01e3
            L_0x014f:
                r2 = r16
                com.miot.common.property.Property r0 = r1.getProperty(r5)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x01e3
                java.lang.Object r0 = r1.getValue(r5)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Color3Service$b1 r1 = r2.f16553a
                r1.mo28674c(r0)
                goto L_0x01e3
            L_0x0168:
                r2 = r16
                com.miot.common.property.Property r0 = r1.getProperty(r9)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x01e3
                java.lang.Object r0 = r1.getValue(r9)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Color3Service$b1 r1 = r2.f16553a
                r1.mo28681k(r0)
                goto L_0x01e3
            L_0x0180:
                r2 = r16
                com.miot.common.property.Property r0 = r1.getProperty(r11)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x01e3
                java.lang.Object r0 = r1.getValue(r11)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Color3Service$b1 r1 = r2.f16553a
                r1.mo28683n(r0)
                goto L_0x01e3
            L_0x0198:
                r2 = r16
                com.miot.common.property.Property r0 = r1.getProperty(r12)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x01e3
                java.lang.Object r0 = r1.getValue(r12)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Color3Service$b1 r1 = r2.f16553a
                r1.mo28679h(r0)
                goto L_0x01e3
            L_0x01b0:
                r2 = r16
                com.miot.common.property.Property r0 = r1.getProperty(r4)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x01e3
                java.lang.Object r0 = r1.getValue(r4)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Color3Service$b1 r1 = r2.f16553a
                r1.mo28672a(r0)
                goto L_0x01e3
            L_0x01c8:
                r2 = r16
                com.miot.common.property.Property r0 = r1.getProperty(r7)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x01e3
                java.lang.Object r0 = r1.getValue(r7)
                java.lang.String r0 = (java.lang.String) r0
                com.yeelight.yeelib.device.xiaomi.Color3Service$a1 r0 = com.yeelight.yeelib.device.xiaomi.Color3Service.C8537a1.valueOf(r0)
                com.yeelight.yeelib.device.xiaomi.Color3Service$b1 r1 = r2.f16553a
                r1.mo28678g(r0)
            L_0x01e3:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.xiaomi.Color3Service.C8579v.onPropertyChanged(com.miot.common.device.invocation.PropertyInfo, java.lang.String):void");
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color3Service$v0 */
    public interface C8580v0 {
        /* renamed from: a */
        void mo30152a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color3Service$w */
    class C8581w implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16554a;

        C8581w(Color3Service color3Service, CompletionHandler completionHandler) {
            this.f16554a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16554a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16554a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color3Service$w0 */
    public interface C8582w0 {
        /* renamed from: a */
        void mo30154a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color3Service$x */
    class C8583x implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16555a;

        C8583x(Color3Service color3Service, CompletionHandler completionHandler) {
            this.f16555a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16555a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16555a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color3Service$x0 */
    public interface C8584x0 {
        /* renamed from: a */
        void mo30156a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color3Service$y */
    class C8585y implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16556a;

        C8585y(Color3Service color3Service, CompletionHandler completionHandler) {
            this.f16556a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16556a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16556a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color3Service$y0 */
    public interface C8586y0 {
        /* renamed from: a */
        void mo30158a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color3Service$z */
    class C8587z implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16557a;

        C8587z(Color3Service color3Service, CompletionHandler completionHandler) {
            this.f16557a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16557a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16557a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color3Service$z0 */
    public interface C8588z0 {
        /* renamed from: a */
        void mo30160a(Long l);

        void onFailed(int i, String str);
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
                MiotManager.getDeviceManipulator().invoke(create, new C8575t(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8561m(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8555j(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8536a0(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getBright(C8560l0 l0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Bright"), new C8548f0(this, l0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getColorMode(C8562m0 m0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "ColorMode"), new C8541c(this, m0Var));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8587z(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getCt(C8564n0 n0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Ct"), new C8550g0(this, n0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getDelayOff(C8566o0 o0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "DelayOff"), new C8545e(this, o0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowParams(C8568p0 p0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "FlowParams"), new C8549g(this, p0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowing(C8570q0 q0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Flowing"), new C8538b(this, q0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getHue(C8572r0 r0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Hue"), new C8554i0(this, r0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getMusicEnable(C8574s0 s0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "MusicEnable"), new C8553i(this, s0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getPower(C8576t0 t0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Power"), new C8546e0(this, t0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getProperties(C8578u0 u0Var) {
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
            create.addProperty(getService().getProperty("MusicEnable"));
            MiotManager.getDeviceManipulator().readProperty(create, new C8544d0(this, u0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getRgb(C8580v0 v0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Rgb"), new C8543d(this, v0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getSat(C8582w0 w0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Sat"), new C8535a(this, w0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getSaveState(C8584x0 x0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "SaveState"), new C8547f(this, x0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getTemperature(C8586y0 y0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Temperature"), new C8552h0(this, y0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getonFromPower(C8588z0 z0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "onFromPower"), new C8551h(this, z0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void openWithMode(C8537a1 a1Var, C8558k0 k0Var, Long l, Long l2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "openWithMode");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("Power", a1Var.toString())) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Effect", k0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Duration", l)) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("Mode", l2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C8567p(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8563n(this, completionHandler));
                return;
            }
            throw new MiotException("actionInfo is null");
        }
        throw new MiotException("device not configurated connection");
    }

    public void sendCmd(C8556j0 j0Var, String str, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "sendCmd");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("CmdKey", j0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("CmdValue", str)) {
                MiotManager.getDeviceManipulator().invoke(create, new C8581w(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setBright(Long l, C8558k0 k0Var, Long l2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setBright");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("Bright", l)) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Effect", k0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("Duration", l2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C8559l(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setCt(Long l, C8558k0 k0Var, Long l2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setCt");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("Ct", l)) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Effect", k0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("Duration", l2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C8585y(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8577u(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8583x(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setPower(C8537a1 a1Var, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setPower");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (create.setArgumentValue("Power", a1Var.toString())) {
                MiotManager.getDeviceManipulator().invoke(create, new C8569q(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setRgb(Long l, C8558k0 k0Var, Long l2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setRgb");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("Rgb", l)) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Effect", k0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("Duration", l2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C8571r(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8565o(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8539b0(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void subscribeNotifications(CompletionHandler completionHandler, C8540b1 b1Var) {
        if (completionHandler == null) {
            throw new IllegalArgumentException("handler is null");
        } else if (b1Var != null) {
            PropertyInfo create = PropertyInfoFactory.create(getService());
            for (Property next : getService().getProperties()) {
                if (next.getDefinition().isNotifiable()) {
                    create.addProperty(next);
                }
            }
            MiotManager.getDeviceManipulator().addPropertyChangedListener(create, new C8557k(this, completionHandler), new C8579v(this, b1Var));
        } else {
            throw new IllegalArgumentException("listener is null");
        }
    }

    public void toggle(CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "toggle");
            if (create != null) {
                MiotManager.getDeviceManipulator().invoke(create, new C8573s(this, completionHandler));
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
            MiotManager.getDeviceManipulator().removePropertyChangedListener(create, new C8542c0(this, completionHandler));
            return;
        }
        throw new IllegalArgumentException("handler is null");
    }
}
