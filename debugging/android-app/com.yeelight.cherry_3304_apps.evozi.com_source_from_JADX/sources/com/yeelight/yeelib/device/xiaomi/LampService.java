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

public class LampService extends AbstractService {
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
    private static final String TAG = "LampService";
    private AbstractDevice mDevice = null;

    /* renamed from: com.yeelight.yeelib.device.xiaomi.LampService$a */
    class C9162a implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9193p0 f17104a;

        C9162a(LampService lampService, C9193p0 p0Var) {
            this.f17104a = p0Var;
        }

        public void onFailed(int i, String str) {
            this.f17104a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("PdoBreakTime");
            if (property.isValueValid()) {
                this.f17104a.mo30857a((Long) propertyInfo.getValue("PdoBreakTime"));
                return;
            }
            C9193p0 p0Var = this.f17104a;
            p0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.LampService$a0 */
    class C9163a0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9201t0 f17105a;

        C9163a0(LampService lampService, C9201t0 t0Var) {
            this.f17105a = t0Var;
        }

        public void onFailed(int i, String str) {
            this.f17105a.onFailed(i, str);
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
                com.yeelight.yeelib.device.xiaomi.LampService$y0 r1 = com.yeelight.yeelib.device.xiaomi.LampService.C9211y0.valueOf(r1)
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
                com.yeelight.yeelib.device.xiaomi.LampService$t0 r4 = r0.f17105a
                r4.mo28469a(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.xiaomi.LampService.C9163a0.onSucceed(com.miot.common.device.invocation.PropertyInfo):void");
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.LampService$b */
    class C9164b implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9185l0 f17106a;

        C9164b(LampService lampService, C9185l0 l0Var) {
            this.f17106a = l0Var;
        }

        public void onFailed(int i, String str) {
            this.f17106a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("DelayOff");
            if (property.isValueValid()) {
                this.f17106a.mo30849a((Long) propertyInfo.getValue("DelayOff"));
                return;
            }
            C9185l0 l0Var = this.f17106a;
            l0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.LampService$b0 */
    class C9165b0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9199s0 f17107a;

        C9165b0(LampService lampService, C9199s0 s0Var) {
            this.f17107a = s0Var;
        }

        public void onFailed(int i, String str) {
            this.f17107a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Power");
            if (property.isValueValid()) {
                this.f17107a.mo30863a(C9211y0.valueOf((String) propertyInfo.getValue("Power")));
                return;
            }
            C9199s0 s0Var = this.f17107a;
            s0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.LampService$c */
    class C9166c implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9191o0 f17108a;

        C9166c(LampService lampService, C9191o0 o0Var) {
            this.f17108a = o0Var;
        }

        public void onFailed(int i, String str) {
            this.f17108a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("KidMode");
            if (property.isValueValid()) {
                this.f17108a.mo30855a((Long) propertyInfo.getValue("KidMode"));
                return;
            }
            C9191o0 o0Var = this.f17108a;
            o0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.LampService$c0 */
    class C9167c0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9179i0 f17109a;

        C9167c0(LampService lampService, C9179i0 i0Var) {
            this.f17109a = i0Var;
        }

        public void onFailed(int i, String str) {
            this.f17109a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Bright");
            if (property.isValueValid()) {
                this.f17109a.mo30845a((Long) propertyInfo.getValue("Bright"));
                return;
            }
            C9179i0 i0Var = this.f17109a;
            i0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.LampService$d */
    class C9168d implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9187m0 f17110a;

        C9168d(LampService lampService, C9187m0 m0Var) {
            this.f17110a = m0Var;
        }

        public void onFailed(int i, String str) {
            this.f17110a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("FlowParams");
            if (property.isValueValid()) {
                this.f17110a.onSucceed((String) propertyInfo.getValue("FlowParams"));
                return;
            }
            C9187m0 m0Var = this.f17110a;
            m0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.LampService$d0 */
    class C9169d0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9181j0 f17111a;

        C9169d0(LampService lampService, C9181j0 j0Var) {
            this.f17111a = j0Var;
        }

        public void onFailed(int i, String str) {
            this.f17111a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Ct");
            if (property.isValueValid()) {
                this.f17111a.mo30847a((Long) propertyInfo.getValue("Ct"));
                return;
            }
            C9181j0 j0Var = this.f17111a;
            j0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.LampService$e */
    class C9170e implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9203u0 f17112a;

        C9170e(LampService lampService, C9203u0 u0Var) {
            this.f17112a = u0Var;
        }

        public void onFailed(int i, String str) {
            this.f17112a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("SaveState");
            if (property.isValueValid()) {
                this.f17112a.mo30865a((Long) propertyInfo.getValue("SaveState"));
                return;
            }
            C9203u0 u0Var = this.f17112a;
            u0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.LampService$e0 */
    class C9171e0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9195q0 f17113a;

        C9171e0(LampService lampService, C9195q0 q0Var) {
            this.f17113a = q0Var;
        }

        public void onFailed(int i, String str) {
            this.f17113a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("PdoStatus");
            if (property.isValueValid()) {
                this.f17113a.mo30859a((Long) propertyInfo.getValue("PdoStatus"));
                return;
            }
            C9195q0 q0Var = this.f17113a;
            q0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.LampService$f */
    class C9172f implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9209x0 f17114a;

        C9172f(LampService lampService, C9209x0 x0Var) {
            this.f17114a = x0Var;
        }

        public void onFailed(int i, String str) {
            this.f17114a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("onFromPower");
            if (property.isValueValid()) {
                this.f17114a.mo30871a((Long) propertyInfo.getValue("onFromPower"));
                return;
            }
            C9209x0 x0Var = this.f17114a;
            x0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.LampService$f0 */
    class C9173f0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9197r0 f17115a;

        C9173f0(LampService lampService, C9197r0 r0Var) {
            this.f17115a = r0Var;
        }

        public void onFailed(int i, String str) {
            this.f17115a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("PdoWorkTime");
            if (property.isValueValid()) {
                this.f17115a.mo30861a((Long) propertyInfo.getValue("PdoWorkTime"));
                return;
            }
            C9197r0 r0Var = this.f17115a;
            r0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.LampService$g */
    class C9174g implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9205v0 f17116a;

        C9174g(LampService lampService, C9205v0 v0Var) {
            this.f17116a = v0Var;
        }

        public void onFailed(int i, String str) {
            this.f17116a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("ShortKeyAction");
            if (property.isValueValid()) {
                this.f17116a.mo30867a((Long) propertyInfo.getValue("ShortKeyAction"));
                return;
            }
            C9205v0 v0Var = this.f17116a;
            v0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.LampService$g0 */
    public enum C9175g0 {
        undefined,
        cfg_pomodoro,
        cfg_kidmode,
        cfg_lan_ctrl,
        cfg_save_state,
        cfg_shortkey,
        cfg_init_power
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.LampService$h */
    class C9176h implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9207w0 f17125a;

        C9176h(LampService lampService, C9207w0 w0Var) {
            this.f17125a = w0Var;
        }

        public void onFailed(int i, String str) {
            this.f17125a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("ShortKeySceneName");
            if (property.isValueValid()) {
                this.f17125a.onSucceed((String) propertyInfo.getValue("ShortKeySceneName"));
                return;
            }
            C9207w0 w0Var = this.f17125a;
            w0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.LampService$h0 */
    public enum C9177h0 {
        undefined,
        smooth,
        sudden
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.LampService$i */
    class C9178i implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9189n0 f17130a;

        C9178i(LampService lampService, C9189n0 n0Var) {
            this.f17130a = n0Var;
        }

        public void onFailed(int i, String str) {
            this.f17130a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Flowing");
            if (property.isValueValid()) {
                this.f17130a.mo30853a((Long) propertyInfo.getValue("Flowing"));
                return;
            }
            C9189n0 n0Var = this.f17130a;
            n0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.LampService$i0 */
    public interface C9179i0 {
        /* renamed from: a */
        void mo30845a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.LampService$j */
    class C9180j implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17131a;

        C9180j(LampService lampService, CompletionHandler completionHandler) {
            this.f17131a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17131a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17131a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.LampService$j0 */
    public interface C9181j0 {
        /* renamed from: a */
        void mo30847a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.LampService$k */
    class C9182k implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17132a;

        C9182k(LampService lampService, CompletionHandler completionHandler) {
            this.f17132a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17132a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f17132a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.LampService$k0 */
    public interface C9183k0 {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.LampService$l */
    class C9184l implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17133a;

        C9184l(LampService lampService, CompletionHandler completionHandler) {
            this.f17133a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17133a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17133a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.LampService$l0 */
    public interface C9185l0 {
        /* renamed from: a */
        void mo30849a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.LampService$m */
    class C9186m implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17134a;

        C9186m(LampService lampService, CompletionHandler completionHandler) {
            this.f17134a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17134a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17134a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.LampService$m0 */
    public interface C9187m0 {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.LampService$n */
    class C9188n implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17135a;

        C9188n(LampService lampService, CompletionHandler completionHandler) {
            this.f17135a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17135a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17135a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.LampService$n0 */
    public interface C9189n0 {
        /* renamed from: a */
        void mo30853a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.LampService$o */
    class C9190o implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17136a;

        C9190o(LampService lampService, CompletionHandler completionHandler) {
            this.f17136a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17136a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17136a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.LampService$o0 */
    public interface C9191o0 {
        /* renamed from: a */
        void mo30855a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.LampService$p */
    class C9192p implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17137a;

        C9192p(LampService lampService, CompletionHandler completionHandler) {
            this.f17137a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17137a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17137a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.LampService$p0 */
    public interface C9193p0 {
        /* renamed from: a */
        void mo30857a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.LampService$q */
    class C9194q implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17138a;

        C9194q(LampService lampService, CompletionHandler completionHandler) {
            this.f17138a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17138a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17138a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.LampService$q0 */
    public interface C9195q0 {
        /* renamed from: a */
        void mo30859a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.LampService$r */
    class C9196r implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17139a;

        C9196r(LampService lampService, CompletionHandler completionHandler) {
            this.f17139a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17139a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17139a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.LampService$r0 */
    public interface C9197r0 {
        /* renamed from: a */
        void mo30861a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.LampService$s */
    class C9198s implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17140a;

        C9198s(LampService lampService, CompletionHandler completionHandler) {
            this.f17140a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17140a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17140a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.LampService$s0 */
    public interface C9199s0 {
        /* renamed from: a */
        void mo30863a(C9211y0 y0Var);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.LampService$t */
    class C9200t implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17141a;

        C9200t(LampService lampService, CompletionHandler completionHandler) {
            this.f17141a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17141a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17141a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.LampService$t0 */
    public interface C9201t0 {
        /* renamed from: a */
        void mo28469a(C9211y0 y0Var, Long l, Long l2, Long l3, Long l4, Long l5, Long l6, Long l7, String str, Long l8, Long l9, Long l10, String str2, Long l11);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.LampService$u */
    class C9202u implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17142a;

        C9202u(LampService lampService, CompletionHandler completionHandler) {
            this.f17142a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17142a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17142a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.LampService$u0 */
    public interface C9203u0 {
        /* renamed from: a */
        void mo30865a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.LampService$v */
    class C9204v implements DeviceManipulator.PropertyChangedListener {

        /* renamed from: a */
        final /* synthetic */ C9213z0 f17143a;

        C9204v(LampService lampService, C9213z0 z0Var) {
            this.f17143a = z0Var;
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
                com.yeelight.yeelib.device.xiaomi.LampService$z0 r15 = r13.f17143a
                r15.mo28459c(r14)
                goto L_0x019e
            L_0x00a3:
                com.miot.common.property.Property r15 = r14.getProperty(r8)
                boolean r15 = r15.isValueValid()
                if (r15 == 0) goto L_0x019e
                java.lang.Object r14 = r14.getValue(r8)
                java.lang.Long r14 = (java.lang.Long) r14
                com.yeelight.yeelib.device.xiaomi.LampService$z0 r15 = r13.f17143a
                r15.mo28462f(r14)
                goto L_0x019e
            L_0x00ba:
                com.miot.common.property.Property r15 = r14.getProperty(r12)
                boolean r15 = r15.isValueValid()
                if (r15 == 0) goto L_0x019e
                java.lang.Object r14 = r14.getValue(r12)
                java.lang.Long r14 = (java.lang.Long) r14
                com.yeelight.yeelib.device.xiaomi.LampService$z0 r15 = r13.f17143a
                r15.mo28460d(r14)
                goto L_0x019e
            L_0x00d1:
                com.miot.common.property.Property r15 = r14.getProperty(r10)
                boolean r15 = r15.isValueValid()
                if (r15 == 0) goto L_0x019e
                java.lang.Object r14 = r14.getValue(r10)
                java.lang.String r14 = (java.lang.String) r14
                com.yeelight.yeelib.device.xiaomi.LampService$z0 r15 = r13.f17143a
                r15.mo28461e(r14)
                goto L_0x019e
            L_0x00e8:
                com.miot.common.property.Property r15 = r14.getProperty(r4)
                boolean r15 = r15.isValueValid()
                if (r15 == 0) goto L_0x019e
                java.lang.Object r14 = r14.getValue(r4)
                java.lang.Long r14 = (java.lang.Long) r14
                com.yeelight.yeelib.device.xiaomi.LampService$z0 r15 = r13.f17143a
                r15.mo28465i(r14)
                goto L_0x019e
            L_0x00ff:
                com.miot.common.property.Property r15 = r14.getProperty(r6)
                boolean r15 = r15.isValueValid()
                if (r15 == 0) goto L_0x019e
                java.lang.Object r14 = r14.getValue(r6)
                java.lang.Long r14 = (java.lang.Long) r14
                com.yeelight.yeelib.device.xiaomi.LampService$z0 r15 = r13.f17143a
                r15.mo28458b(r14)
                goto L_0x019e
            L_0x0116:
                com.miot.common.property.Property r15 = r14.getProperty(r11)
                boolean r15 = r15.isValueValid()
                if (r15 == 0) goto L_0x019e
                java.lang.Object r14 = r14.getValue(r11)
                java.lang.Long r14 = (java.lang.Long) r14
                com.yeelight.yeelib.device.xiaomi.LampService$z0 r15 = r13.f17143a
                r15.mo28466j(r14)
                goto L_0x019e
            L_0x012d:
                com.miot.common.property.Property r15 = r14.getProperty(r3)
                boolean r15 = r15.isValueValid()
                if (r15 == 0) goto L_0x019e
                java.lang.Object r14 = r14.getValue(r3)
                java.lang.Long r14 = (java.lang.Long) r14
                com.yeelight.yeelib.device.xiaomi.LampService$z0 r15 = r13.f17143a
                r15.mo28467k(r14)
                goto L_0x019e
            L_0x0143:
                com.miot.common.property.Property r15 = r14.getProperty(r2)
                boolean r15 = r15.isValueValid()
                if (r15 == 0) goto L_0x019e
                java.lang.Object r14 = r14.getValue(r2)
                java.lang.Long r14 = (java.lang.Long) r14
                com.yeelight.yeelib.device.xiaomi.LampService$z0 r15 = r13.f17143a
                r15.mo28468l(r14)
                goto L_0x019e
            L_0x0159:
                com.miot.common.property.Property r15 = r14.getProperty(r9)
                boolean r15 = r15.isValueValid()
                if (r15 == 0) goto L_0x019e
                java.lang.Object r14 = r14.getValue(r9)
                java.lang.Long r14 = (java.lang.Long) r14
                com.yeelight.yeelib.device.xiaomi.LampService$z0 r15 = r13.f17143a
                r15.mo28464h(r14)
                goto L_0x019e
            L_0x016f:
                com.miot.common.property.Property r15 = r14.getProperty(r1)
                boolean r15 = r15.isValueValid()
                if (r15 == 0) goto L_0x019e
                java.lang.Object r14 = r14.getValue(r1)
                java.lang.Long r14 = (java.lang.Long) r14
                com.yeelight.yeelib.device.xiaomi.LampService$z0 r15 = r13.f17143a
                r15.mo28457a(r14)
                goto L_0x019e
            L_0x0185:
                com.miot.common.property.Property r15 = r14.getProperty(r7)
                boolean r15 = r15.isValueValid()
                if (r15 == 0) goto L_0x019e
                java.lang.Object r14 = r14.getValue(r7)
                java.lang.String r14 = (java.lang.String) r14
                com.yeelight.yeelib.device.xiaomi.LampService$y0 r14 = com.yeelight.yeelib.device.xiaomi.LampService.C9211y0.valueOf(r14)
                com.yeelight.yeelib.device.xiaomi.LampService$z0 r15 = r13.f17143a
                r15.mo28463g(r14)
            L_0x019e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.xiaomi.LampService.C9204v.onPropertyChanged(com.miot.common.device.invocation.PropertyInfo, java.lang.String):void");
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.LampService$v0 */
    public interface C9205v0 {
        /* renamed from: a */
        void mo30867a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.LampService$w */
    class C9206w implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17144a;

        C9206w(LampService lampService, CompletionHandler completionHandler) {
            this.f17144a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17144a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17144a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.LampService$w0 */
    public interface C9207w0 {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.LampService$x */
    class C9208x implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17145a;

        C9208x(LampService lampService, CompletionHandler completionHandler) {
            this.f17145a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17145a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17145a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.LampService$x0 */
    public interface C9209x0 {
        /* renamed from: a */
        void mo30871a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.LampService$y */
    class C9210y implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9183k0 f17146a;

        C9210y(LampService lampService, C9183k0 k0Var) {
            this.f17146a = k0Var;
        }

        public void onFailed(int i, String str) {
            this.f17146a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            Object argumentValue = actionInfo.getArgumentValue("CmdResp");
            this.f17146a.onSucceed(argumentValue != null ? (String) argumentValue : null);
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.LampService$y0 */
    public enum C9211y0 {
        undefined,
        on,
        off
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.LampService$z */
    class C9212z implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17151a;

        C9212z(LampService lampService, CompletionHandler completionHandler) {
            this.f17151a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17151a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f17151a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.LampService$z0 */
    public interface C9213z0 {
        /* renamed from: a */
        void mo28457a(Long l);

        /* renamed from: b */
        void mo28458b(Long l);

        /* renamed from: c */
        void mo28459c(Long l);

        /* renamed from: d */
        void mo28460d(Long l);

        /* renamed from: e */
        void mo28461e(String str);

        /* renamed from: f */
        void mo28462f(Long l);

        /* renamed from: g */
        void mo28463g(C9211y0 y0Var);

        /* renamed from: h */
        void mo28464h(Long l);

        /* renamed from: i */
        void mo28465i(Long l);

        /* renamed from: j */
        void mo28466j(Long l);

        /* renamed from: k */
        void mo28467k(Long l);

        /* renamed from: l */
        void mo28468l(Long l);
    }

    public LampService(AbstractDevice abstractDevice) {
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
                MiotManager.getDeviceManipulator().invoke(create, new C9196r(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C9184l(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getBright(C9179i0 i0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Bright"), new C9167c0(this, i0Var));
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
                MiotManager.getDeviceManipulator().invoke(create, new C9208x(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getCt(C9181j0 j0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Ct"), new C9169d0(this, j0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getData(C9175g0 g0Var, String str, C9183k0 k0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "getData");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("CmdKey", g0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("CmdValue", str)) {
                MiotManager.getDeviceManipulator().invoke(create, new C9210y(this, k0Var));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getDelayOff(C9185l0 l0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "DelayOff"), new C9164b(this, l0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowParams(C9187m0 m0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "FlowParams"), new C9168d(this, m0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowing(C9189n0 n0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Flowing"), new C9178i(this, n0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getKidMode(C9191o0 o0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "KidMode"), new C9166c(this, o0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getPdoBreakTime(C9193p0 p0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "PdoBreakTime"), new C9162a(this, p0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getPdoStatus(C9195q0 q0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "PdoStatus"), new C9171e0(this, q0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getPdoWorkTime(C9197r0 r0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "PdoWorkTime"), new C9173f0(this, r0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getPower(C9199s0 s0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Power"), new C9165b0(this, s0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getProperties(C9201t0 t0Var) {
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
            MiotManager.getDeviceManipulator().readProperty(create, new C9163a0(this, t0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getSaveState(C9203u0 u0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "SaveState"), new C9170e(this, u0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getShortKeyAction(C9205v0 v0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "ShortKeyAction"), new C9174g(this, v0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getShortKeySceneName(C9207w0 w0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "ShortKeySceneName"), new C9176h(this, w0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getonFromPower(C9209x0 x0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "onFromPower"), new C9172f(this, x0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void openWithMode(C9211y0 y0Var, C9177h0 h0Var, Long l, Long l2, CompletionHandler completionHandler) {
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
                MiotManager.getDeviceManipulator().invoke(create, new C9190o(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C9186m(this, completionHandler));
                return;
            }
            throw new MiotException("actionInfo is null");
        }
        throw new MiotException("device not configurated connection");
    }

    public void sendCmd(C9175g0 g0Var, String str, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "sendCmd");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("CmdKey", g0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("CmdValue", str)) {
                MiotManager.getDeviceManipulator().invoke(create, new C9200t(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setBright(Long l, C9177h0 h0Var, Long l2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setBright");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("Bright", l)) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Effect", h0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("Duration", l2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C9180j(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setCt(Long l, C9177h0 h0Var, Long l2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setCt");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("Ct", l)) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Effect", h0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("Duration", l2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C9206w(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C9198s(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C9202u(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setPower(C9211y0 y0Var, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setPower");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (create.setArgumentValue("Power", y0Var.toString())) {
                MiotManager.getDeviceManipulator().invoke(create, new C9192p(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C9188n(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void subscribeNotifications(CompletionHandler completionHandler, C9213z0 z0Var) {
        if (completionHandler == null) {
            throw new IllegalArgumentException("handler is null");
        } else if (z0Var != null) {
            PropertyInfo create = PropertyInfoFactory.create(getService());
            for (Property next : getService().getProperties()) {
                if (next.getDefinition().isNotifiable()) {
                    create.addProperty(next);
                }
            }
            MiotManager.getDeviceManipulator().addPropertyChangedListener(create, new C9182k(this, completionHandler), new C9204v(this, z0Var));
        } else {
            throw new IllegalArgumentException("listener is null");
        }
    }

    public void toggle(CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "toggle");
            if (create != null) {
                MiotManager.getDeviceManipulator().invoke(create, new C9194q(this, completionHandler));
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
            MiotManager.getDeviceManipulator().removePropertyChangedListener(create, new C9212z(this, completionHandler));
            return;
        }
        throw new IllegalArgumentException("handler is null");
    }
}
