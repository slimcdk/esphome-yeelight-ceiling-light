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

    public enum CmdKey {
        undefined,
        cfg_pomodoro,
        cfg_kidmode,
        cfg_lan_ctrl,
        cfg_save_state,
        cfg_shortkey,
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

    /* renamed from: com.yeelight.yeelib.device.xiaomi.LampService$a */
    class C7648a implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7675n0 f13745a;

        C7648a(LampService lampService, C7675n0 n0Var) {
            this.f13745a = n0Var;
        }

        public void onFailed(int i, String str) {
            this.f13745a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("PdoBreakTime");
            if (property.isValueValid()) {
                this.f13745a.mo34193a((Long) propertyInfo.getValue("PdoBreakTime"));
                return;
            }
            C7675n0 n0Var = this.f13745a;
            n0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.LampService$a0 */
    class C7649a0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7683r0 f13746a;

        C7649a0(LampService lampService, C7683r0 r0Var) {
            this.f13746a = r0Var;
        }

        public void onFailed(int i, String str) {
            this.f13746a.onFailed(i, str);
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
                com.yeelight.yeelib.device.xiaomi.LampService$Power r1 = com.yeelight.yeelib.device.xiaomi.LampService.Power.valueOf(r1)
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
                com.yeelight.yeelib.device.xiaomi.LampService$r0 r4 = r0.f13746a
                r4.mo34201a(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.xiaomi.LampService.C7649a0.onSucceed(com.miot.common.device.invocation.PropertyInfo):void");
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.LampService$b */
    class C7650b implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7667j0 f13747a;

        C7650b(LampService lampService, C7667j0 j0Var) {
            this.f13747a = j0Var;
        }

        public void onFailed(int i, String str) {
            this.f13747a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("DelayOff");
            if (property.isValueValid()) {
                this.f13747a.mo34185a((Long) propertyInfo.getValue("DelayOff"));
                return;
            }
            C7667j0 j0Var = this.f13747a;
            j0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.LampService$b0 */
    class C7651b0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7681q0 f13748a;

        C7651b0(LampService lampService, C7681q0 q0Var) {
            this.f13748a = q0Var;
        }

        public void onFailed(int i, String str) {
            this.f13748a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Power");
            if (property.isValueValid()) {
                this.f13748a.mo34199a(Power.valueOf((String) propertyInfo.getValue("Power")));
                return;
            }
            C7681q0 q0Var = this.f13748a;
            q0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.LampService$c */
    class C7652c implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7673m0 f13749a;

        C7652c(LampService lampService, C7673m0 m0Var) {
            this.f13749a = m0Var;
        }

        public void onFailed(int i, String str) {
            this.f13749a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("KidMode");
            if (property.isValueValid()) {
                this.f13749a.mo34191a((Long) propertyInfo.getValue("KidMode"));
                return;
            }
            C7673m0 m0Var = this.f13749a;
            m0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.LampService$c0 */
    class C7653c0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7661g0 f13750a;

        C7653c0(LampService lampService, C7661g0 g0Var) {
            this.f13750a = g0Var;
        }

        public void onFailed(int i, String str) {
            this.f13750a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Bright");
            if (property.isValueValid()) {
                this.f13750a.mo34179a((Long) propertyInfo.getValue("Bright"));
                return;
            }
            C7661g0 g0Var = this.f13750a;
            g0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.LampService$d */
    class C7654d implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7669k0 f13751a;

        C7654d(LampService lampService, C7669k0 k0Var) {
            this.f13751a = k0Var;
        }

        public void onFailed(int i, String str) {
            this.f13751a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("FlowParams");
            if (property.isValueValid()) {
                this.f13751a.onSucceed((String) propertyInfo.getValue("FlowParams"));
                return;
            }
            C7669k0 k0Var = this.f13751a;
            k0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.LampService$d0 */
    class C7655d0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7663h0 f13752a;

        C7655d0(LampService lampService, C7663h0 h0Var) {
            this.f13752a = h0Var;
        }

        public void onFailed(int i, String str) {
            this.f13752a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Ct");
            if (property.isValueValid()) {
                this.f13752a.mo34181a((Long) propertyInfo.getValue("Ct"));
                return;
            }
            C7663h0 h0Var = this.f13752a;
            h0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.LampService$e */
    class C7656e implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7685s0 f13753a;

        C7656e(LampService lampService, C7685s0 s0Var) {
            this.f13753a = s0Var;
        }

        public void onFailed(int i, String str) {
            this.f13753a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("SaveState");
            if (property.isValueValid()) {
                this.f13753a.mo34203a((Long) propertyInfo.getValue("SaveState"));
                return;
            }
            C7685s0 s0Var = this.f13753a;
            s0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.LampService$e0 */
    class C7657e0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7677o0 f13754a;

        C7657e0(LampService lampService, C7677o0 o0Var) {
            this.f13754a = o0Var;
        }

        public void onFailed(int i, String str) {
            this.f13754a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("PdoStatus");
            if (property.isValueValid()) {
                this.f13754a.mo34195a((Long) propertyInfo.getValue("PdoStatus"));
                return;
            }
            C7677o0 o0Var = this.f13754a;
            o0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.LampService$f */
    class C7658f implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7691v0 f13755a;

        C7658f(LampService lampService, C7691v0 v0Var) {
            this.f13755a = v0Var;
        }

        public void onFailed(int i, String str) {
            this.f13755a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("onFromPower");
            if (property.isValueValid()) {
                this.f13755a.mo34209a((Long) propertyInfo.getValue("onFromPower"));
                return;
            }
            C7691v0 v0Var = this.f13755a;
            v0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.LampService$f0 */
    class C7659f0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7679p0 f13756a;

        C7659f0(LampService lampService, C7679p0 p0Var) {
            this.f13756a = p0Var;
        }

        public void onFailed(int i, String str) {
            this.f13756a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("PdoWorkTime");
            if (property.isValueValid()) {
                this.f13756a.mo34197a((Long) propertyInfo.getValue("PdoWorkTime"));
                return;
            }
            C7679p0 p0Var = this.f13756a;
            p0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.LampService$g */
    class C7660g implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7687t0 f13757a;

        C7660g(LampService lampService, C7687t0 t0Var) {
            this.f13757a = t0Var;
        }

        public void onFailed(int i, String str) {
            this.f13757a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("ShortKeyAction");
            if (property.isValueValid()) {
                this.f13757a.mo34205a((Long) propertyInfo.getValue("ShortKeyAction"));
                return;
            }
            C7687t0 t0Var = this.f13757a;
            t0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.LampService$g0 */
    public interface C7661g0 {
        /* renamed from: a */
        void mo34179a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.LampService$h */
    class C7662h implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7689u0 f13758a;

        C7662h(LampService lampService, C7689u0 u0Var) {
            this.f13758a = u0Var;
        }

        public void onFailed(int i, String str) {
            this.f13758a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("ShortKeySceneName");
            if (property.isValueValid()) {
                this.f13758a.onSucceed((String) propertyInfo.getValue("ShortKeySceneName"));
                return;
            }
            C7689u0 u0Var = this.f13758a;
            u0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.LampService$h0 */
    public interface C7663h0 {
        /* renamed from: a */
        void mo34181a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.LampService$i */
    class C7664i implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7671l0 f13759a;

        C7664i(LampService lampService, C7671l0 l0Var) {
            this.f13759a = l0Var;
        }

        public void onFailed(int i, String str) {
            this.f13759a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Flowing");
            if (property.isValueValid()) {
                this.f13759a.mo34189a((Long) propertyInfo.getValue("Flowing"));
                return;
            }
            C7671l0 l0Var = this.f13759a;
            l0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.LampService$i0 */
    public interface C7665i0 {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.LampService$j */
    class C7666j implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13760a;

        C7666j(LampService lampService, CompletionHandler completionHandler) {
            this.f13760a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13760a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13760a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.LampService$j0 */
    public interface C7667j0 {
        /* renamed from: a */
        void mo34185a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.LampService$k */
    class C7668k implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13761a;

        C7668k(LampService lampService, CompletionHandler completionHandler) {
            this.f13761a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13761a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f13761a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.LampService$k0 */
    public interface C7669k0 {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.LampService$l */
    class C7670l implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13762a;

        C7670l(LampService lampService, CompletionHandler completionHandler) {
            this.f13762a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13762a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13762a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.LampService$l0 */
    public interface C7671l0 {
        /* renamed from: a */
        void mo34189a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.LampService$m */
    class C7672m implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13763a;

        C7672m(LampService lampService, CompletionHandler completionHandler) {
            this.f13763a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13763a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13763a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.LampService$m0 */
    public interface C7673m0 {
        /* renamed from: a */
        void mo34191a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.LampService$n */
    class C7674n implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13764a;

        C7674n(LampService lampService, CompletionHandler completionHandler) {
            this.f13764a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13764a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13764a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.LampService$n0 */
    public interface C7675n0 {
        /* renamed from: a */
        void mo34193a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.LampService$o */
    class C7676o implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13765a;

        C7676o(LampService lampService, CompletionHandler completionHandler) {
            this.f13765a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13765a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13765a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.LampService$o0 */
    public interface C7677o0 {
        /* renamed from: a */
        void mo34195a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.LampService$p */
    class C7678p implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13766a;

        C7678p(LampService lampService, CompletionHandler completionHandler) {
            this.f13766a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13766a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13766a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.LampService$p0 */
    public interface C7679p0 {
        /* renamed from: a */
        void mo34197a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.LampService$q */
    class C7680q implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13767a;

        C7680q(LampService lampService, CompletionHandler completionHandler) {
            this.f13767a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13767a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13767a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.LampService$q0 */
    public interface C7681q0 {
        /* renamed from: a */
        void mo34199a(Power power);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.LampService$r */
    class C7682r implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13768a;

        C7682r(LampService lampService, CompletionHandler completionHandler) {
            this.f13768a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13768a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13768a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.LampService$r0 */
    public interface C7683r0 {
        /* renamed from: a */
        void mo34201a(Power power, Long l, Long l2, Long l3, Long l4, Long l5, Long l6, Long l7, String str, Long l8, Long l9, Long l10, String str2, Long l11);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.LampService$s */
    class C7684s implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13769a;

        C7684s(LampService lampService, CompletionHandler completionHandler) {
            this.f13769a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13769a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13769a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.LampService$s0 */
    public interface C7685s0 {
        /* renamed from: a */
        void mo34203a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.LampService$t */
    class C7686t implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13770a;

        C7686t(LampService lampService, CompletionHandler completionHandler) {
            this.f13770a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13770a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13770a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.LampService$t0 */
    public interface C7687t0 {
        /* renamed from: a */
        void mo34205a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.LampService$u */
    class C7688u implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13771a;

        C7688u(LampService lampService, CompletionHandler completionHandler) {
            this.f13771a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13771a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13771a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.LampService$u0 */
    public interface C7689u0 {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.LampService$v */
    class C7690v implements DeviceManipulator.PropertyChangedListener {

        /* renamed from: a */
        final /* synthetic */ C7693w0 f13772a;

        C7690v(LampService lampService, C7693w0 w0Var) {
            this.f13772a = w0Var;
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
                case -2096941615:
                    if (str2.equals("PdoBreakTime")) {
                        c = 1;
                        break;
                    }
                    break;
                case -2002016140:
                    if (str2.equals("FlowParams")) {
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
                case 35911772:
                    if (str2.equals("onFromPower")) {
                        c = 4;
                        break;
                    }
                    break;
                case 77306085:
                    if (str2.equals("Power")) {
                        c = 5;
                        break;
                    }
                    break;
                case 880790796:
                    if (str2.equals("DelayOff")) {
                        c = 6;
                        break;
                    }
                    break;
                case 898856916:
                    if (str2.equals("Flowing")) {
                        c = 7;
                        break;
                    }
                    break;
                case 944116073:
                    if (str2.equals("KidMode")) {
                        c = 8;
                        break;
                    }
                    break;
                case 1136799609:
                    if (str2.equals("PdoWorkTime")) {
                        c = 9;
                        break;
                    }
                    break;
                case 1834919085:
                    if (str2.equals("PdoStatus")) {
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
                        this.f13772a.mo34213c((Long) propertyInfo2.getValue("SaveState"));
                        return;
                    }
                    return;
                case 1:
                    if (propertyInfo2.getProperty("PdoBreakTime").isValueValid()) {
                        this.f13772a.mo34220j((Long) propertyInfo2.getValue("PdoBreakTime"));
                        return;
                    }
                    return;
                case 2:
                    if (propertyInfo2.getProperty("FlowParams").isValueValid()) {
                        this.f13772a.mo34215e((String) propertyInfo2.getValue("FlowParams"));
                        return;
                    }
                    return;
                case 3:
                    if (propertyInfo2.getProperty("Ct").isValueValid()) {
                        this.f13772a.mo34218h((Long) propertyInfo2.getValue("Ct"));
                        return;
                    }
                    return;
                case 4:
                    if (propertyInfo2.getProperty("onFromPower").isValueValid()) {
                        this.f13772a.mo34216f((Long) propertyInfo2.getValue("onFromPower"));
                        return;
                    }
                    return;
                case 5:
                    if (propertyInfo2.getProperty("Power").isValueValid()) {
                        this.f13772a.mo34217g(Power.valueOf((String) propertyInfo2.getValue("Power")));
                        return;
                    }
                    return;
                case 6:
                    if (propertyInfo2.getProperty("DelayOff").isValueValid()) {
                        this.f13772a.mo34212b((Long) propertyInfo2.getValue("DelayOff"));
                        return;
                    }
                    return;
                case 7:
                    if (propertyInfo2.getProperty("Flowing").isValueValid()) {
                        this.f13772a.mo34214d((Long) propertyInfo2.getValue("Flowing"));
                        return;
                    }
                    return;
                case 8:
                    if (propertyInfo2.getProperty("KidMode").isValueValid()) {
                        this.f13772a.mo34219i((Long) propertyInfo2.getValue("KidMode"));
                        return;
                    }
                    return;
                case 9:
                    if (propertyInfo2.getProperty("PdoWorkTime").isValueValid()) {
                        this.f13772a.mo34221k((Long) propertyInfo2.getValue("PdoWorkTime"));
                        return;
                    }
                    return;
                case 10:
                    if (propertyInfo2.getProperty("PdoStatus").isValueValid()) {
                        this.f13772a.mo34222l((Long) propertyInfo2.getValue("PdoStatus"));
                        return;
                    }
                    return;
                case 11:
                    if (propertyInfo2.getProperty("Bright").isValueValid()) {
                        this.f13772a.mo34211a((Long) propertyInfo2.getValue("Bright"));
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.LampService$v0 */
    public interface C7691v0 {
        /* renamed from: a */
        void mo34209a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.LampService$w */
    class C7692w implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13773a;

        C7692w(LampService lampService, CompletionHandler completionHandler) {
            this.f13773a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13773a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13773a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.LampService$w0 */
    public interface C7693w0 {
        /* renamed from: a */
        void mo34211a(Long l);

        /* renamed from: b */
        void mo34212b(Long l);

        /* renamed from: c */
        void mo34213c(Long l);

        /* renamed from: d */
        void mo34214d(Long l);

        /* renamed from: e */
        void mo34215e(String str);

        /* renamed from: f */
        void mo34216f(Long l);

        /* renamed from: g */
        void mo34217g(Power power);

        /* renamed from: h */
        void mo34218h(Long l);

        /* renamed from: i */
        void mo34219i(Long l);

        /* renamed from: j */
        void mo34220j(Long l);

        /* renamed from: k */
        void mo34221k(Long l);

        /* renamed from: l */
        void mo34222l(Long l);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.LampService$x */
    class C7694x implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13774a;

        C7694x(LampService lampService, CompletionHandler completionHandler) {
            this.f13774a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13774a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13774a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.LampService$y */
    class C7695y implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7665i0 f13775a;

        C7695y(LampService lampService, C7665i0 i0Var) {
            this.f13775a = i0Var;
        }

        public void onFailed(int i, String str) {
            this.f13775a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            Object argumentValue = actionInfo.getArgumentValue("CmdResp");
            this.f13775a.onSucceed(argumentValue != null ? (String) argumentValue : null);
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.LampService$z */
    class C7696z implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13776a;

        C7696z(LampService lampService, CompletionHandler completionHandler) {
            this.f13776a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13776a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f13776a.onSucceed();
        }
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
                MiotManager.getDeviceManipulator().invoke(create, new C7682r(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7670l(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getBright(C7661g0 g0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Bright"), new C7653c0(this, g0Var));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7694x(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getCt(C7663h0 h0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Ct"), new C7655d0(this, h0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getData(CmdKey cmdKey, String str, C7665i0 i0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "getData");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("CmdKey", cmdKey.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("CmdValue", str)) {
                MiotManager.getDeviceManipulator().invoke(create, new C7695y(this, i0Var));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getDelayOff(C7667j0 j0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "DelayOff"), new C7650b(this, j0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowParams(C7669k0 k0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "FlowParams"), new C7654d(this, k0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowing(C7671l0 l0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Flowing"), new C7664i(this, l0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getKidMode(C7673m0 m0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "KidMode"), new C7652c(this, m0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getPdoBreakTime(C7675n0 n0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "PdoBreakTime"), new C7648a(this, n0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getPdoStatus(C7677o0 o0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "PdoStatus"), new C7657e0(this, o0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getPdoWorkTime(C7679p0 p0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "PdoWorkTime"), new C7659f0(this, p0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getPower(C7681q0 q0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Power"), new C7651b0(this, q0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getProperties(C7683r0 r0Var) {
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
            MiotManager.getDeviceManipulator().readProperty(create, new C7649a0(this, r0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getSaveState(C7685s0 s0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "SaveState"), new C7656e(this, s0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getShortKeyAction(C7687t0 t0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "ShortKeyAction"), new C7660g(this, t0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getShortKeySceneName(C7689u0 u0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "ShortKeySceneName"), new C7662h(this, u0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getonFromPower(C7691v0 v0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "onFromPower"), new C7658f(this, v0Var));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7676o(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7672m(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7686t(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7666j(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7692w(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7684s(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7688u(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7678p(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7674n(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void subscribeNotifications(CompletionHandler completionHandler, C7693w0 w0Var) {
        if (completionHandler == null) {
            throw new IllegalArgumentException("handler is null");
        } else if (w0Var != null) {
            PropertyInfo create = PropertyInfoFactory.create(getService());
            for (Property next : getService().getProperties()) {
                if (next.getDefinition().isNotifiable()) {
                    create.addProperty(next);
                }
            }
            MiotManager.getDeviceManipulator().addPropertyChangedListener(create, new C7668k(this, completionHandler), new C7690v(this, w0Var));
        } else {
            throw new IllegalArgumentException("listener is null");
        }
    }

    public void toggle(CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "toggle");
            if (create != null) {
                MiotManager.getDeviceManipulator().invoke(create, new C7680q(this, completionHandler));
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
            MiotManager.getDeviceManipulator().removePropertyChangedListener(create, new C7696z(this, completionHandler));
            return;
        }
        throw new IllegalArgumentException("handler is null");
    }
}
