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

public class Lamp2Service extends AbstractService {
    public static final String ACTION_addCron = "addCron";
    public static final String ACTION_delCron = "delCron";
    public static final String ACTION_getCron = "getCron";
    public static final String ACTION_getData = "getData";
    public static final String ACTION_openWithMode = "openWithMode";
    public static final String ACTION_restore = "restore";
    public static final String ACTION_sendCmd = "sendCmd";
    public static final String ACTION_setBright = "setBright";
    public static final String ACTION_setCt = "setCt";
    public static final String ACTION_setDefault = "setDefault";
    public static final String ACTION_setFlowScene = "setFlowScene";
    public static final String ACTION_setPower = "setPower";
    public static final String ACTION_setScene = "setScene";
    public static final String ACTION_toggle = "toggle";
    public static final String PROPERTY_Bright = "Bright";
    public static final String PROPERTY_CmdKey = "CmdKey";
    public static final String PROPERTY_CmdResp = "CmdResp";
    public static final String PROPERTY_CmdValue = "CmdValue";
    public static final String PROPERTY_CronType = "CronType";
    public static final String PROPERTY_Ct = "Ct";
    public static final String PROPERTY_DelayOff = "DelayOff";
    public static final String PROPERTY_Duration = "Duration";
    public static final String PROPERTY_Effect = "Effect";
    public static final String PROPERTY_FlowParams = "FlowParams";
    public static final String PROPERTY_Flowing = "Flowing";
    public static final String PROPERTY_KidMode = "KidMode";
    public static final String PROPERTY_Mode = "Mode";
    public static final String PROPERTY_ParamColors = "ParamColors";
    public static final String PROPERTY_ParamCount = "ParamCount";
    public static final String PROPERTY_ParamFinish = "ParamFinish";
    public static final String PROPERTY_ParamModel = "ParamModel";
    public static final String PROPERTY_PdoBreakTime = "PdoBreakTime";
    public static final String PROPERTY_PdoStatus = "PdoStatus";
    public static final String PROPERTY_PdoWorkTime = "PdoWorkTime";
    public static final String PROPERTY_Power = "Power";
    public static final String PROPERTY_SaveState = "SaveState";
    public static final String PROPERTY_ShortKeyAction = "ShortKeyAction";
    public static final String PROPERTY_ShortKeySceneName = "ShortKeySceneName";
    public static final String PROPERTY_onFromPower = "onFromPower";
    private static final String TAG = "Lamp2Service";
    private AbstractDevice mDevice = null;

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp2Service$a */
    class C8975a implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9006p0 f16920a;

        C8975a(Lamp2Service lamp2Service, C9006p0 p0Var) {
            this.f16920a = p0Var;
        }

        public void onFailed(int i, String str) {
            this.f16920a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("PdoBreakTime");
            if (property.isValueValid()) {
                this.f16920a.mo30647a((Long) propertyInfo.getValue("PdoBreakTime"));
                return;
            }
            C9006p0 p0Var = this.f16920a;
            p0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp2Service$a0 */
    class C8976a0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9014t0 f16921a;

        C8976a0(Lamp2Service lamp2Service, C9014t0 t0Var) {
            this.f16921a = t0Var;
        }

        public void onFailed(int i, String str) {
            this.f16921a.onFailed(i, str);
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
                com.yeelight.yeelib.device.xiaomi.Lamp2Service$y0 r1 = com.yeelight.yeelib.device.xiaomi.Lamp2Service.C9024y0.valueOf(r1)
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
                java.lang.String r1 = "PdoStatus"
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
                java.lang.String r1 = "PdoWorkTime"
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
                java.lang.String r1 = "PdoBreakTime"
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
                java.lang.String r1 = "DelayOff"
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
                java.lang.String r1 = "KidMode"
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
                java.lang.String r1 = "FlowParams"
                com.miot.common.property.Property r1 = r0.getProperty(r1)
                boolean r2 = r1.isValueValid()
                if (r2 == 0) goto L_0x00c3
                java.lang.Object r1 = r1.getValue()
                java.lang.String r1 = (java.lang.String) r1
                r13 = r1
                goto L_0x00c4
            L_0x00c3:
                r13 = r3
            L_0x00c4:
                java.lang.String r1 = "SaveState"
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
                java.lang.String r1 = "onFromPower"
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
                java.lang.String r1 = "ShortKeyAction"
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
                java.lang.String r1 = "ShortKeySceneName"
                com.miot.common.property.Property r1 = r0.getProperty(r1)
                boolean r2 = r1.isValueValid()
                if (r2 == 0) goto L_0x011a
                java.lang.Object r1 = r1.getValue()
                java.lang.String r1 = (java.lang.String) r1
                r17 = r1
                goto L_0x011c
            L_0x011a:
                r17 = r3
            L_0x011c:
                java.lang.String r1 = "Flowing"
                com.miot.common.property.Property r0 = r0.getProperty(r1)
                boolean r1 = r0.isValueValid()
                if (r1 == 0) goto L_0x012f
                java.lang.Object r0 = r0.getValue()
                r3 = r0
                java.lang.Long r3 = (java.lang.Long) r3
            L_0x012f:
                r0 = r19
                r18 = r3
                com.yeelight.yeelib.device.xiaomi.Lamp2Service$t0 r4 = r0.f16921a
                r4.mo28847a(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.xiaomi.Lamp2Service.C8976a0.onSucceed(com.miot.common.device.invocation.PropertyInfo):void");
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp2Service$b */
    class C8977b implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8998l0 f16922a;

        C8977b(Lamp2Service lamp2Service, C8998l0 l0Var) {
            this.f16922a = l0Var;
        }

        public void onFailed(int i, String str) {
            this.f16922a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("DelayOff");
            if (property.isValueValid()) {
                this.f16922a.mo30639a((Long) propertyInfo.getValue("DelayOff"));
                return;
            }
            C8998l0 l0Var = this.f16922a;
            l0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp2Service$b0 */
    class C8978b0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9012s0 f16923a;

        C8978b0(Lamp2Service lamp2Service, C9012s0 s0Var) {
            this.f16923a = s0Var;
        }

        public void onFailed(int i, String str) {
            this.f16923a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Power");
            if (property.isValueValid()) {
                this.f16923a.mo30653a(C9024y0.valueOf((String) propertyInfo.getValue("Power")));
                return;
            }
            C9012s0 s0Var = this.f16923a;
            s0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp2Service$c */
    class C8979c implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9004o0 f16924a;

        C8979c(Lamp2Service lamp2Service, C9004o0 o0Var) {
            this.f16924a = o0Var;
        }

        public void onFailed(int i, String str) {
            this.f16924a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("KidMode");
            if (property.isValueValid()) {
                this.f16924a.mo30645a((Long) propertyInfo.getValue("KidMode"));
                return;
            }
            C9004o0 o0Var = this.f16924a;
            o0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp2Service$c0 */
    class C8980c0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8992i0 f16925a;

        C8980c0(Lamp2Service lamp2Service, C8992i0 i0Var) {
            this.f16925a = i0Var;
        }

        public void onFailed(int i, String str) {
            this.f16925a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Bright");
            if (property.isValueValid()) {
                this.f16925a.mo30635a((Long) propertyInfo.getValue("Bright"));
                return;
            }
            C8992i0 i0Var = this.f16925a;
            i0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp2Service$d */
    class C8981d implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9000m0 f16926a;

        C8981d(Lamp2Service lamp2Service, C9000m0 m0Var) {
            this.f16926a = m0Var;
        }

        public void onFailed(int i, String str) {
            this.f16926a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("FlowParams");
            if (property.isValueValid()) {
                this.f16926a.onSucceed((String) propertyInfo.getValue("FlowParams"));
                return;
            }
            C9000m0 m0Var = this.f16926a;
            m0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp2Service$d0 */
    class C8982d0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8994j0 f16927a;

        C8982d0(Lamp2Service lamp2Service, C8994j0 j0Var) {
            this.f16927a = j0Var;
        }

        public void onFailed(int i, String str) {
            this.f16927a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Ct");
            if (property.isValueValid()) {
                this.f16927a.mo30637a((Long) propertyInfo.getValue("Ct"));
                return;
            }
            C8994j0 j0Var = this.f16927a;
            j0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp2Service$e */
    class C8983e implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9016u0 f16928a;

        C8983e(Lamp2Service lamp2Service, C9016u0 u0Var) {
            this.f16928a = u0Var;
        }

        public void onFailed(int i, String str) {
            this.f16928a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("SaveState");
            if (property.isValueValid()) {
                this.f16928a.mo30655a((Long) propertyInfo.getValue("SaveState"));
                return;
            }
            C9016u0 u0Var = this.f16928a;
            u0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp2Service$e0 */
    class C8984e0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9008q0 f16929a;

        C8984e0(Lamp2Service lamp2Service, C9008q0 q0Var) {
            this.f16929a = q0Var;
        }

        public void onFailed(int i, String str) {
            this.f16929a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("PdoStatus");
            if (property.isValueValid()) {
                this.f16929a.mo30649a((Long) propertyInfo.getValue("PdoStatus"));
                return;
            }
            C9008q0 q0Var = this.f16929a;
            q0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp2Service$f */
    class C8985f implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9022x0 f16930a;

        C8985f(Lamp2Service lamp2Service, C9022x0 x0Var) {
            this.f16930a = x0Var;
        }

        public void onFailed(int i, String str) {
            this.f16930a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("onFromPower");
            if (property.isValueValid()) {
                this.f16930a.mo30661a((Long) propertyInfo.getValue("onFromPower"));
                return;
            }
            C9022x0 x0Var = this.f16930a;
            x0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp2Service$f0 */
    class C8986f0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9010r0 f16931a;

        C8986f0(Lamp2Service lamp2Service, C9010r0 r0Var) {
            this.f16931a = r0Var;
        }

        public void onFailed(int i, String str) {
            this.f16931a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("PdoWorkTime");
            if (property.isValueValid()) {
                this.f16931a.mo30651a((Long) propertyInfo.getValue("PdoWorkTime"));
                return;
            }
            C9010r0 r0Var = this.f16931a;
            r0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp2Service$g */
    class C8987g implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9018v0 f16932a;

        C8987g(Lamp2Service lamp2Service, C9018v0 v0Var) {
            this.f16932a = v0Var;
        }

        public void onFailed(int i, String str) {
            this.f16932a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("ShortKeyAction");
            if (property.isValueValid()) {
                this.f16932a.mo30657a((Long) propertyInfo.getValue("ShortKeyAction"));
                return;
            }
            C9018v0 v0Var = this.f16932a;
            v0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp2Service$g0 */
    public enum C8988g0 {
        undefined,
        cfg_pomodoro,
        cfg_kidmode,
        cfg_lan_ctrl,
        cfg_save_state,
        cfg_shortkey,
        cfg_init_power
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp2Service$h */
    class C8989h implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9020w0 f16941a;

        C8989h(Lamp2Service lamp2Service, C9020w0 w0Var) {
            this.f16941a = w0Var;
        }

        public void onFailed(int i, String str) {
            this.f16941a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("ShortKeySceneName");
            if (property.isValueValid()) {
                this.f16941a.onSucceed((String) propertyInfo.getValue("ShortKeySceneName"));
                return;
            }
            C9020w0 w0Var = this.f16941a;
            w0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp2Service$h0 */
    public enum C8990h0 {
        undefined,
        smooth,
        sudden
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp2Service$i */
    class C8991i implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9002n0 f16946a;

        C8991i(Lamp2Service lamp2Service, C9002n0 n0Var) {
            this.f16946a = n0Var;
        }

        public void onFailed(int i, String str) {
            this.f16946a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Flowing");
            if (property.isValueValid()) {
                this.f16946a.mo30643a((Long) propertyInfo.getValue("Flowing"));
                return;
            }
            C9002n0 n0Var = this.f16946a;
            n0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp2Service$i0 */
    public interface C8992i0 {
        /* renamed from: a */
        void mo30635a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp2Service$j */
    class C8993j implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16947a;

        C8993j(Lamp2Service lamp2Service, CompletionHandler completionHandler) {
            this.f16947a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16947a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16947a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp2Service$j0 */
    public interface C8994j0 {
        /* renamed from: a */
        void mo30637a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp2Service$k */
    class C8995k implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16948a;

        C8995k(Lamp2Service lamp2Service, CompletionHandler completionHandler) {
            this.f16948a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16948a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f16948a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp2Service$k0 */
    public interface C8996k0 {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp2Service$l */
    class C8997l implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16949a;

        C8997l(Lamp2Service lamp2Service, CompletionHandler completionHandler) {
            this.f16949a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16949a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16949a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp2Service$l0 */
    public interface C8998l0 {
        /* renamed from: a */
        void mo30639a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp2Service$m */
    class C8999m implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16950a;

        C8999m(Lamp2Service lamp2Service, CompletionHandler completionHandler) {
            this.f16950a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16950a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16950a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp2Service$m0 */
    public interface C9000m0 {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp2Service$n */
    class C9001n implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16951a;

        C9001n(Lamp2Service lamp2Service, CompletionHandler completionHandler) {
            this.f16951a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16951a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16951a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp2Service$n0 */
    public interface C9002n0 {
        /* renamed from: a */
        void mo30643a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp2Service$o */
    class C9003o implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16952a;

        C9003o(Lamp2Service lamp2Service, CompletionHandler completionHandler) {
            this.f16952a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16952a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16952a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp2Service$o0 */
    public interface C9004o0 {
        /* renamed from: a */
        void mo30645a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp2Service$p */
    class C9005p implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16953a;

        C9005p(Lamp2Service lamp2Service, CompletionHandler completionHandler) {
            this.f16953a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16953a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16953a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp2Service$p0 */
    public interface C9006p0 {
        /* renamed from: a */
        void mo30647a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp2Service$q */
    class C9007q implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16954a;

        C9007q(Lamp2Service lamp2Service, CompletionHandler completionHandler) {
            this.f16954a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16954a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16954a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp2Service$q0 */
    public interface C9008q0 {
        /* renamed from: a */
        void mo30649a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp2Service$r */
    class C9009r implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16955a;

        C9009r(Lamp2Service lamp2Service, CompletionHandler completionHandler) {
            this.f16955a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16955a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16955a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp2Service$r0 */
    public interface C9010r0 {
        /* renamed from: a */
        void mo30651a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp2Service$s */
    class C9011s implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16956a;

        C9011s(Lamp2Service lamp2Service, CompletionHandler completionHandler) {
            this.f16956a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16956a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16956a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp2Service$s0 */
    public interface C9012s0 {
        /* renamed from: a */
        void mo30653a(C9024y0 y0Var);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp2Service$t */
    class C9013t implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16957a;

        C9013t(Lamp2Service lamp2Service, CompletionHandler completionHandler) {
            this.f16957a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16957a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16957a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp2Service$t0 */
    public interface C9014t0 {
        /* renamed from: a */
        void mo28847a(C9024y0 y0Var, Long l, Long l2, Long l3, Long l4, Long l5, Long l6, Long l7, String str, Long l8, Long l9, Long l10, String str2, Long l11);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp2Service$u */
    class C9015u implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16958a;

        C9015u(Lamp2Service lamp2Service, CompletionHandler completionHandler) {
            this.f16958a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16958a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16958a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp2Service$u0 */
    public interface C9016u0 {
        /* renamed from: a */
        void mo30655a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp2Service$v */
    class C9017v implements DeviceManipulator.PropertyChangedListener {

        /* renamed from: a */
        final /* synthetic */ C9026z0 f16959a;

        C9017v(Lamp2Service lamp2Service, C9026z0 z0Var) {
            this.f16959a = z0Var;
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onPropertyChanged(com.miot.common.device.invocation.PropertyInfo r14, java.lang.String r15) {
            /*
                r13 = this;
                int r0 = r15.hashCode()
                java.lang.String r1 = "Bright"
                java.lang.String r2 = "PdoStatus"
                java.lang.String r3 = "PdoWorkTime"
                java.lang.String r4 = "KidMode"
                java.lang.String r5 = "Flowing"
                java.lang.String r6 = "DelayOff"
                java.lang.String r7 = "Power"
                java.lang.String r8 = "onFromPower"
                java.lang.String r9 = "Ct"
                java.lang.String r10 = "FlowParams"
                java.lang.String r11 = "PdoBreakTime"
                java.lang.String r12 = "SaveState"
                switch(r0) {
                    case -2117953292: goto L_0x007d;
                    case -2096941615: goto L_0x0075;
                    case -2002016140: goto L_0x006c;
                    case 2193: goto L_0x0064;
                    case 35911772: goto L_0x005b;
                    case 77306085: goto L_0x0053;
                    case 880790796: goto L_0x004b;
                    case 898856916: goto L_0x0042;
                    case 944116073: goto L_0x003a;
                    case 1136799609: goto L_0x0032;
                    case 1834919085: goto L_0x002a;
                    case 1998035738: goto L_0x0021;
                    default: goto L_0x001f;
                }
            L_0x001f:
                goto L_0x0086
            L_0x0021:
                boolean r15 = r15.equals(r1)
                if (r15 == 0) goto L_0x0086
                r15 = 1
                goto L_0x0087
            L_0x002a:
                boolean r15 = r15.equals(r2)
                if (r15 == 0) goto L_0x0086
                r15 = 3
                goto L_0x0087
            L_0x0032:
                boolean r15 = r15.equals(r3)
                if (r15 == 0) goto L_0x0086
                r15 = 4
                goto L_0x0087
            L_0x003a:
                boolean r15 = r15.equals(r4)
                if (r15 == 0) goto L_0x0086
                r15 = 7
                goto L_0x0087
            L_0x0042:
                boolean r15 = r15.equals(r5)
                if (r15 == 0) goto L_0x0086
                r15 = 11
                goto L_0x0087
            L_0x004b:
                boolean r15 = r15.equals(r6)
                if (r15 == 0) goto L_0x0086
                r15 = 6
                goto L_0x0087
            L_0x0053:
                boolean r15 = r15.equals(r7)
                if (r15 == 0) goto L_0x0086
                r15 = 0
                goto L_0x0087
            L_0x005b:
                boolean r15 = r15.equals(r8)
                if (r15 == 0) goto L_0x0086
                r15 = 10
                goto L_0x0087
            L_0x0064:
                boolean r15 = r15.equals(r9)
                if (r15 == 0) goto L_0x0086
                r15 = 2
                goto L_0x0087
            L_0x006c:
                boolean r15 = r15.equals(r10)
                if (r15 == 0) goto L_0x0086
                r15 = 8
                goto L_0x0087
            L_0x0075:
                boolean r15 = r15.equals(r11)
                if (r15 == 0) goto L_0x0086
                r15 = 5
                goto L_0x0087
            L_0x007d:
                boolean r15 = r15.equals(r12)
                if (r15 == 0) goto L_0x0086
                r15 = 9
                goto L_0x0087
            L_0x0086:
                r15 = -1
            L_0x0087:
                switch(r15) {
                    case 0: goto L_0x0185;
                    case 1: goto L_0x016f;
                    case 2: goto L_0x0159;
                    case 3: goto L_0x0143;
                    case 4: goto L_0x012d;
                    case 5: goto L_0x0116;
                    case 6: goto L_0x00ff;
                    case 7: goto L_0x00e8;
                    case 8: goto L_0x00d1;
                    case 9: goto L_0x00ba;
                    case 10: goto L_0x00a3;
                    case 11: goto L_0x008c;
                    default: goto L_0x008a;
                }
            L_0x008a:
                goto L_0x019e
            L_0x008c:
                com.miot.common.property.Property r15 = r14.getProperty(r5)
                boolean r15 = r15.isValueValid()
                if (r15 == 0) goto L_0x019e
                java.lang.Object r14 = r14.getValue(r5)
                java.lang.Long r14 = (java.lang.Long) r14
                com.yeelight.yeelib.device.xiaomi.Lamp2Service$z0 r15 = r13.f16959a
                r15.mo28837c(r14)
                goto L_0x019e
            L_0x00a3:
                com.miot.common.property.Property r15 = r14.getProperty(r8)
                boolean r15 = r15.isValueValid()
                if (r15 == 0) goto L_0x019e
                java.lang.Object r14 = r14.getValue(r8)
                java.lang.Long r14 = (java.lang.Long) r14
                com.yeelight.yeelib.device.xiaomi.Lamp2Service$z0 r15 = r13.f16959a
                r15.mo28840f(r14)
                goto L_0x019e
            L_0x00ba:
                com.miot.common.property.Property r15 = r14.getProperty(r12)
                boolean r15 = r15.isValueValid()
                if (r15 == 0) goto L_0x019e
                java.lang.Object r14 = r14.getValue(r12)
                java.lang.Long r14 = (java.lang.Long) r14
                com.yeelight.yeelib.device.xiaomi.Lamp2Service$z0 r15 = r13.f16959a
                r15.mo28838d(r14)
                goto L_0x019e
            L_0x00d1:
                com.miot.common.property.Property r15 = r14.getProperty(r10)
                boolean r15 = r15.isValueValid()
                if (r15 == 0) goto L_0x019e
                java.lang.Object r14 = r14.getValue(r10)
                java.lang.String r14 = (java.lang.String) r14
                com.yeelight.yeelib.device.xiaomi.Lamp2Service$z0 r15 = r13.f16959a
                r15.mo28839e(r14)
                goto L_0x019e
            L_0x00e8:
                com.miot.common.property.Property r15 = r14.getProperty(r4)
                boolean r15 = r15.isValueValid()
                if (r15 == 0) goto L_0x019e
                java.lang.Object r14 = r14.getValue(r4)
                java.lang.Long r14 = (java.lang.Long) r14
                com.yeelight.yeelib.device.xiaomi.Lamp2Service$z0 r15 = r13.f16959a
                r15.mo28842i(r14)
                goto L_0x019e
            L_0x00ff:
                com.miot.common.property.Property r15 = r14.getProperty(r6)
                boolean r15 = r15.isValueValid()
                if (r15 == 0) goto L_0x019e
                java.lang.Object r14 = r14.getValue(r6)
                java.lang.Long r14 = (java.lang.Long) r14
                com.yeelight.yeelib.device.xiaomi.Lamp2Service$z0 r15 = r13.f16959a
                r15.mo28836b(r14)
                goto L_0x019e
            L_0x0116:
                com.miot.common.property.Property r15 = r14.getProperty(r11)
                boolean r15 = r15.isValueValid()
                if (r15 == 0) goto L_0x019e
                java.lang.Object r14 = r14.getValue(r11)
                java.lang.Long r14 = (java.lang.Long) r14
                com.yeelight.yeelib.device.xiaomi.Lamp2Service$z0 r15 = r13.f16959a
                r15.mo28843j(r14)
                goto L_0x019e
            L_0x012d:
                com.miot.common.property.Property r15 = r14.getProperty(r3)
                boolean r15 = r15.isValueValid()
                if (r15 == 0) goto L_0x019e
                java.lang.Object r14 = r14.getValue(r3)
                java.lang.Long r14 = (java.lang.Long) r14
                com.yeelight.yeelib.device.xiaomi.Lamp2Service$z0 r15 = r13.f16959a
                r15.mo28844k(r14)
                goto L_0x019e
            L_0x0143:
                com.miot.common.property.Property r15 = r14.getProperty(r2)
                boolean r15 = r15.isValueValid()
                if (r15 == 0) goto L_0x019e
                java.lang.Object r14 = r14.getValue(r2)
                java.lang.Long r14 = (java.lang.Long) r14
                com.yeelight.yeelib.device.xiaomi.Lamp2Service$z0 r15 = r13.f16959a
                r15.mo28845l(r14)
                goto L_0x019e
            L_0x0159:
                com.miot.common.property.Property r15 = r14.getProperty(r9)
                boolean r15 = r15.isValueValid()
                if (r15 == 0) goto L_0x019e
                java.lang.Object r14 = r14.getValue(r9)
                java.lang.Long r14 = (java.lang.Long) r14
                com.yeelight.yeelib.device.xiaomi.Lamp2Service$z0 r15 = r13.f16959a
                r15.mo28841h(r14)
                goto L_0x019e
            L_0x016f:
                com.miot.common.property.Property r15 = r14.getProperty(r1)
                boolean r15 = r15.isValueValid()
                if (r15 == 0) goto L_0x019e
                java.lang.Object r14 = r14.getValue(r1)
                java.lang.Long r14 = (java.lang.Long) r14
                com.yeelight.yeelib.device.xiaomi.Lamp2Service$z0 r15 = r13.f16959a
                r15.mo28835a(r14)
                goto L_0x019e
            L_0x0185:
                com.miot.common.property.Property r15 = r14.getProperty(r7)
                boolean r15 = r15.isValueValid()
                if (r15 == 0) goto L_0x019e
                java.lang.Object r14 = r14.getValue(r7)
                java.lang.String r14 = (java.lang.String) r14
                com.yeelight.yeelib.device.xiaomi.Lamp2Service$y0 r14 = com.yeelight.yeelib.device.xiaomi.Lamp2Service.C9024y0.valueOf(r14)
                com.yeelight.yeelib.device.xiaomi.Lamp2Service$z0 r15 = r13.f16959a
                r15.mo28846m(r14)
            L_0x019e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.xiaomi.Lamp2Service.C9017v.onPropertyChanged(com.miot.common.device.invocation.PropertyInfo, java.lang.String):void");
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp2Service$v0 */
    public interface C9018v0 {
        /* renamed from: a */
        void mo30657a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp2Service$w */
    class C9019w implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16960a;

        C9019w(Lamp2Service lamp2Service, CompletionHandler completionHandler) {
            this.f16960a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16960a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16960a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp2Service$w0 */
    public interface C9020w0 {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp2Service$x */
    class C9021x implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16961a;

        C9021x(Lamp2Service lamp2Service, CompletionHandler completionHandler) {
            this.f16961a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16961a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16961a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp2Service$x0 */
    public interface C9022x0 {
        /* renamed from: a */
        void mo30661a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp2Service$y */
    class C9023y implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8996k0 f16962a;

        C9023y(Lamp2Service lamp2Service, C8996k0 k0Var) {
            this.f16962a = k0Var;
        }

        public void onFailed(int i, String str) {
            this.f16962a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            Object argumentValue = actionInfo.getArgumentValue("CmdResp");
            this.f16962a.onSucceed(argumentValue != null ? (String) argumentValue : null);
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp2Service$y0 */
    public enum C9024y0 {
        undefined,
        on,
        off
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp2Service$z */
    class C9025z implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16967a;

        C9025z(Lamp2Service lamp2Service, CompletionHandler completionHandler) {
            this.f16967a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16967a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f16967a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp2Service$z0 */
    public interface C9026z0 {
        /* renamed from: a */
        void mo28835a(Long l);

        /* renamed from: b */
        void mo28836b(Long l);

        /* renamed from: c */
        void mo28837c(Long l);

        /* renamed from: d */
        void mo28838d(Long l);

        /* renamed from: e */
        void mo28839e(String str);

        /* renamed from: f */
        void mo28840f(Long l);

        /* renamed from: h */
        void mo28841h(Long l);

        /* renamed from: i */
        void mo28842i(Long l);

        /* renamed from: j */
        void mo28843j(Long l);

        /* renamed from: k */
        void mo28844k(Long l);

        /* renamed from: l */
        void mo28845l(Long l);

        /* renamed from: m */
        void mo28846m(C9024y0 y0Var);
    }

    public Lamp2Service(AbstractDevice abstractDevice) {
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
                MiotManager.getDeviceManipulator().invoke(create, new C9009r(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8997l(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getBright(C8992i0 i0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Bright"), new C8980c0(this, i0Var));
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
                MiotManager.getDeviceManipulator().invoke(create, new C9021x(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getCt(C8994j0 j0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Ct"), new C8982d0(this, j0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getData(C8988g0 g0Var, String str, C8996k0 k0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "getData");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("CmdKey", g0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("CmdValue", str)) {
                MiotManager.getDeviceManipulator().invoke(create, new C9023y(this, k0Var));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getDelayOff(C8998l0 l0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "DelayOff"), new C8977b(this, l0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowParams(C9000m0 m0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "FlowParams"), new C8981d(this, m0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowing(C9002n0 n0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Flowing"), new C8991i(this, n0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getKidMode(C9004o0 o0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "KidMode"), new C8979c(this, o0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getPdoBreakTime(C9006p0 p0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "PdoBreakTime"), new C8975a(this, p0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getPdoStatus(C9008q0 q0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "PdoStatus"), new C8984e0(this, q0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getPdoWorkTime(C9010r0 r0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "PdoWorkTime"), new C8986f0(this, r0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getPower(C9012s0 s0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Power"), new C8978b0(this, s0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getProperties(C9014t0 t0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            PropertyInfo create = PropertyInfoFactory.create(getService());
            create.addProperty(getService().getProperty("Power"));
            create.addProperty(getService().getProperty("Bright"));
            create.addProperty(getService().getProperty("Ct"));
            create.addProperty(getService().getProperty("PdoStatus"));
            create.addProperty(getService().getProperty("PdoWorkTime"));
            create.addProperty(getService().getProperty("PdoBreakTime"));
            create.addProperty(getService().getProperty("DelayOff"));
            create.addProperty(getService().getProperty("KidMode"));
            create.addProperty(getService().getProperty("FlowParams"));
            create.addProperty(getService().getProperty("SaveState"));
            create.addProperty(getService().getProperty("onFromPower"));
            create.addProperty(getService().getProperty("ShortKeyAction"));
            create.addProperty(getService().getProperty("ShortKeySceneName"));
            create.addProperty(getService().getProperty("Flowing"));
            MiotManager.getDeviceManipulator().readProperty(create, new C8976a0(this, t0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getSaveState(C9016u0 u0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "SaveState"), new C8983e(this, u0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getShortKeyAction(C9018v0 v0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "ShortKeyAction"), new C8987g(this, v0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getShortKeySceneName(C9020w0 w0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "ShortKeySceneName"), new C8989h(this, w0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getonFromPower(C9022x0 x0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "onFromPower"), new C8985f(this, x0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void openWithMode(C9024y0 y0Var, C8990h0 h0Var, Long l, Long l2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "openWithMode");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("Power", y0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Effect", h0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Duration", l)) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("Mode", l2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C9003o(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8999m(this, completionHandler));
                return;
            }
            throw new MiotException("actionInfo is null");
        }
        throw new MiotException("device not configurated connection");
    }

    public void sendCmd(C8988g0 g0Var, String str, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "sendCmd");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("CmdKey", g0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("CmdValue", str)) {
                MiotManager.getDeviceManipulator().invoke(create, new C9013t(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setBright(Long l, C8990h0 h0Var, Long l2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setBright");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("Bright", l)) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Effect", h0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("Duration", l2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C8993j(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setCt(Long l, C8990h0 h0Var, Long l2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setCt");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("Ct", l)) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Effect", h0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("Duration", l2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C9019w(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C9011s(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C9015u(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setPower(C9024y0 y0Var, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setPower");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (create.setArgumentValue("Power", y0Var.toString())) {
                MiotManager.getDeviceManipulator().invoke(create, new C9005p(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C9001n(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void subscribeNotifications(CompletionHandler completionHandler, C9026z0 z0Var) {
        if (completionHandler == null) {
            throw new IllegalArgumentException("handler is null");
        } else if (z0Var != null) {
            PropertyInfo create = PropertyInfoFactory.create(getService());
            for (Property next : getService().getProperties()) {
                if (next.getDefinition().isNotifiable()) {
                    create.addProperty(next);
                }
            }
            MiotManager.getDeviceManipulator().addPropertyChangedListener(create, new C8995k(this, completionHandler), new C9017v(this, z0Var));
        } else {
            throw new IllegalArgumentException("listener is null");
        }
    }

    public void toggle(CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "toggle");
            if (create != null) {
                MiotManager.getDeviceManipulator().invoke(create, new C9007q(this, completionHandler));
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
            MiotManager.getDeviceManipulator().removePropertyChangedListener(create, new C9025z(this, completionHandler));
            return;
        }
        throw new IllegalArgumentException("handler is null");
    }
}
