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

public class BhfLightService extends AbstractService {
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
    public static final String ACTION_setNLScene = "setNLScene";
    public static final String ACTION_setPower = "setPower";
    public static final String ACTION_setScene = "setScene";
    public static final String ACTION_setadjust = "setadjust";
    public static final String ACTION_toggle = "toggle";
    public static final String PROPERTY_Bright = "Bright";
    public static final String PROPERTY_CmdKey = "CmdKey";
    public static final String PROPERTY_CmdValue = "CmdValue";
    public static final String PROPERTY_CronType = "CronType";
    public static final String PROPERTY_Ct = "Ct";
    public static final String PROPERTY_DelayOff = "DelayOff";
    public static final String PROPERTY_Duration = "Duration";
    public static final String PROPERTY_Effect = "Effect";
    public static final String PROPERTY_FlowParams = "FlowParams";
    public static final String PROPERTY_Flowing = "Flowing";
    public static final String PROPERTY_LanMode = "LanMode";
    public static final String PROPERTY_MiBandSleep = "MiBandSleep";
    public static final String PROPERTY_Mode = "Mode";
    public static final String PROPERTY_NLBright = "NLBright";
    public static final String PROPERTY_NightTimeInfo = "NightTimeInfo";
    public static final String PROPERTY_ParamColors = "ParamColors";
    public static final String PROPERTY_ParamCount = "ParamCount";
    public static final String PROPERTY_ParamFinish = "ParamFinish";
    public static final String PROPERTY_ParamModel = "ParamModel";
    public static final String PROPERTY_Power = "Power";
    public static final String PROPERTY_SaveState = "SaveState";
    public static final String PROPERTY_adjustAction = "adjustAction";
    public static final String PROPERTY_adjustProper = "adjustProper";
    public static final String PROPERTY_onFromPower = "onFromPower";
    private static final String TAG = "BhfLightService";
    private AbstractDevice mDevice = null;

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BhfLightService$a */
    class C7653a implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7678m0 f15630a;

        C7653a(BhfLightService bhfLightService, C7678m0 m0Var) {
            this.f15630a = m0Var;
        }

        public void onFailed(int i, String str) {
            this.f15630a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("LanMode");
            if (property.isValueValid()) {
                this.f15630a.mo29127a((Long) propertyInfo.getValue("LanMode"));
                return;
            }
            C7678m0 m0Var = this.f15630a;
            m0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BhfLightService$a0 */
    class C7654a0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7686q0 f15631a;

        C7654a0(BhfLightService bhfLightService, C7686q0 q0Var) {
            this.f15631a = q0Var;
        }

        public void onFailed(int i, String str) {
            this.f15631a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Power");
            if (property.isValueValid()) {
                this.f15631a.mo29135a(C7694u0.valueOf((String) propertyInfo.getValue("Power")));
                return;
            }
            C7686q0 q0Var = this.f15631a;
            q0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BhfLightService$b */
    class C7655b implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7690s0 f15632a;

        C7655b(BhfLightService bhfLightService, C7690s0 s0Var) {
            this.f15632a = s0Var;
        }

        public void onFailed(int i, String str) {
            this.f15632a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("SaveState");
            if (property.isValueValid()) {
                this.f15632a.mo29137a((Long) propertyInfo.getValue("SaveState"));
                return;
            }
            C7690s0 s0Var = this.f15632a;
            s0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BhfLightService$b0 */
    class C7656b0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7668h0 f15633a;

        C7656b0(BhfLightService bhfLightService, C7668h0 h0Var) {
            this.f15633a = h0Var;
        }

        public void onFailed(int i, String str) {
            this.f15633a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Bright");
            if (property.isValueValid()) {
                this.f15633a.mo29117a((Long) propertyInfo.getValue("Bright"));
                return;
            }
            C7668h0 h0Var = this.f15633a;
            h0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BhfLightService$c */
    class C7657c implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7692t0 f15634a;

        C7657c(BhfLightService bhfLightService, C7692t0 t0Var) {
            this.f15634a = t0Var;
        }

        public void onFailed(int i, String str) {
            this.f15634a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("onFromPower");
            if (property.isValueValid()) {
                this.f15634a.mo29139a((Long) propertyInfo.getValue("onFromPower"));
                return;
            }
            C7692t0 t0Var = this.f15634a;
            t0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BhfLightService$c0 */
    class C7658c0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7670i0 f15635a;

        C7658c0(BhfLightService bhfLightService, C7670i0 i0Var) {
            this.f15635a = i0Var;
        }

        public void onFailed(int i, String str) {
            this.f15635a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Ct");
            if (property.isValueValid()) {
                this.f15635a.mo29119a((Long) propertyInfo.getValue("Ct"));
                return;
            }
            C7670i0 i0Var = this.f15635a;
            i0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BhfLightService$d */
    class C7659d implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7682o0 f15636a;

        C7659d(BhfLightService bhfLightService, C7682o0 o0Var) {
            this.f15636a = o0Var;
        }

        public void onFailed(int i, String str) {
            this.f15636a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("NLBright");
            if (property.isValueValid()) {
                this.f15636a.mo29131a((Long) propertyInfo.getValue("NLBright"));
                return;
            }
            C7682o0 o0Var = this.f15636a;
            o0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BhfLightService$d0 */
    class C7660d0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7672j0 f15637a;

        C7660d0(BhfLightService bhfLightService, C7672j0 j0Var) {
            this.f15637a = j0Var;
        }

        public void onFailed(int i, String str) {
            this.f15637a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("DelayOff");
            if (property.isValueValid()) {
                this.f15637a.mo29121a((Long) propertyInfo.getValue("DelayOff"));
                return;
            }
            C7672j0 j0Var = this.f15637a;
            j0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BhfLightService$e */
    class C7661e implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7684p0 f15638a;

        C7661e(BhfLightService bhfLightService, C7684p0 p0Var) {
            this.f15638a = p0Var;
        }

        public void onFailed(int i, String str) {
            this.f15638a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("NightTimeInfo");
            if (property.isValueValid()) {
                this.f15638a.onSucceed((String) propertyInfo.getValue("NightTimeInfo"));
                return;
            }
            C7684p0 p0Var = this.f15638a;
            p0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BhfLightService$e0 */
    class C7662e0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7674k0 f15639a;

        C7662e0(BhfLightService bhfLightService, C7674k0 k0Var) {
            this.f15639a = k0Var;
        }

        public void onFailed(int i, String str) {
            this.f15639a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("FlowParams");
            if (property.isValueValid()) {
                this.f15639a.onSucceed((String) propertyInfo.getValue("FlowParams"));
                return;
            }
            C7674k0 k0Var = this.f15639a;
            k0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BhfLightService$f */
    class C7663f implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7680n0 f15640a;

        C7663f(BhfLightService bhfLightService, C7680n0 n0Var) {
            this.f15640a = n0Var;
        }

        public void onFailed(int i, String str) {
            this.f15640a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("MiBandSleep");
            if (property.isValueValid()) {
                this.f15640a.mo29129a((Long) propertyInfo.getValue("MiBandSleep"));
                return;
            }
            C7680n0 n0Var = this.f15640a;
            n0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BhfLightService$f0 */
    public enum C7664f0 {
        undefined,
        cfg_pomodoro,
        cfg_lan_ctrl,
        cfg_save_state,
        nighttime,
        nightlight,
        miband_sleep,
        pseudo_beacon,
        cfg_init_power
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BhfLightService$g */
    class C7665g implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7676l0 f15651a;

        C7665g(BhfLightService bhfLightService, C7676l0 l0Var) {
            this.f15651a = l0Var;
        }

        public void onFailed(int i, String str) {
            this.f15651a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Flowing");
            if (property.isValueValid()) {
                this.f15651a.mo29125a((Long) propertyInfo.getValue("Flowing"));
                return;
            }
            C7676l0 l0Var = this.f15651a;
            l0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BhfLightService$g0 */
    public enum C7666g0 {
        undefined,
        smooth,
        sudden
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BhfLightService$h */
    class C7667h implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15656a;

        C7667h(BhfLightService bhfLightService, CompletionHandler completionHandler) {
            this.f15656a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15656a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f15656a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BhfLightService$h0 */
    public interface C7668h0 {
        /* renamed from: a */
        void mo29117a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BhfLightService$i */
    class C7669i implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15657a;

        C7669i(BhfLightService bhfLightService, CompletionHandler completionHandler) {
            this.f15657a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15657a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f15657a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BhfLightService$i0 */
    public interface C7670i0 {
        /* renamed from: a */
        void mo29119a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BhfLightService$j */
    class C7671j implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15658a;

        C7671j(BhfLightService bhfLightService, CompletionHandler completionHandler) {
            this.f15658a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15658a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f15658a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BhfLightService$j0 */
    public interface C7672j0 {
        /* renamed from: a */
        void mo29121a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BhfLightService$k */
    class C7673k implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15659a;

        C7673k(BhfLightService bhfLightService, CompletionHandler completionHandler) {
            this.f15659a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15659a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f15659a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BhfLightService$k0 */
    public interface C7674k0 {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BhfLightService$l */
    class C7675l implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15660a;

        C7675l(BhfLightService bhfLightService, CompletionHandler completionHandler) {
            this.f15660a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15660a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f15660a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BhfLightService$l0 */
    public interface C7676l0 {
        /* renamed from: a */
        void mo29125a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BhfLightService$m */
    class C7677m implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15661a;

        C7677m(BhfLightService bhfLightService, CompletionHandler completionHandler) {
            this.f15661a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15661a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f15661a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BhfLightService$m0 */
    public interface C7678m0 {
        /* renamed from: a */
        void mo29127a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BhfLightService$n */
    class C7679n implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15662a;

        C7679n(BhfLightService bhfLightService, CompletionHandler completionHandler) {
            this.f15662a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15662a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f15662a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BhfLightService$n0 */
    public interface C7680n0 {
        /* renamed from: a */
        void mo29129a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BhfLightService$o */
    class C7681o implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15663a;

        C7681o(BhfLightService bhfLightService, CompletionHandler completionHandler) {
            this.f15663a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15663a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f15663a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BhfLightService$o0 */
    public interface C7682o0 {
        /* renamed from: a */
        void mo29131a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BhfLightService$p */
    class C7683p implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15664a;

        C7683p(BhfLightService bhfLightService, CompletionHandler completionHandler) {
            this.f15664a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15664a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f15664a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BhfLightService$p0 */
    public interface C7684p0 {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BhfLightService$q */
    class C7685q implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15665a;

        C7685q(BhfLightService bhfLightService, CompletionHandler completionHandler) {
            this.f15665a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15665a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f15665a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BhfLightService$q0 */
    public interface C7686q0 {
        /* renamed from: a */
        void mo29135a(C7694u0 u0Var);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BhfLightService$r */
    class C7687r implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15666a;

        C7687r(BhfLightService bhfLightService, CompletionHandler completionHandler) {
            this.f15666a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15666a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f15666a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BhfLightService$r0 */
    public interface C7688r0 {
        /* renamed from: a */
        void mo28099a(C7694u0 u0Var, Long l, Long l2, Long l3, String str, Long l4, Long l5, Long l6, Long l7, String str2, Long l8, Long l9);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BhfLightService$s */
    class C7689s implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15667a;

        C7689s(BhfLightService bhfLightService, CompletionHandler completionHandler) {
            this.f15667a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15667a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f15667a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BhfLightService$s0 */
    public interface C7690s0 {
        /* renamed from: a */
        void mo29137a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BhfLightService$t */
    class C7691t implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15668a;

        C7691t(BhfLightService bhfLightService, CompletionHandler completionHandler) {
            this.f15668a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15668a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f15668a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BhfLightService$t0 */
    public interface C7692t0 {
        /* renamed from: a */
        void mo29139a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BhfLightService$u */
    class C7693u implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15669a;

        C7693u(BhfLightService bhfLightService, CompletionHandler completionHandler) {
            this.f15669a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15669a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f15669a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BhfLightService$u0 */
    public enum C7694u0 {
        undefined,
        on,
        off
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BhfLightService$v */
    class C7695v implements DeviceManipulator.PropertyChangedListener {

        /* renamed from: a */
        final /* synthetic */ C7696v0 f15674a;

        C7695v(BhfLightService bhfLightService, C7696v0 v0Var) {
            this.f15674a = v0Var;
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onPropertyChanged(com.miot.common.device.invocation.PropertyInfo r14, java.lang.String r15) {
            /*
                r13 = this;
                int r0 = r15.hashCode()
                java.lang.String r1 = "Bright"
                java.lang.String r2 = "LanMode"
                java.lang.String r3 = "Flowing"
                java.lang.String r4 = "DelayOff"
                java.lang.String r5 = "Power"
                java.lang.String r6 = "onFromPower"
                java.lang.String r7 = "Ct"
                java.lang.String r8 = "MiBandSleep"
                java.lang.String r9 = "NLBright"
                java.lang.String r10 = "NightTimeInfo"
                java.lang.String r11 = "FlowParams"
                java.lang.String r12 = "SaveState"
                switch(r0) {
                    case -2117953292: goto L_0x007e;
                    case -2002016140: goto L_0x0076;
                    case -1331143373: goto L_0x006d;
                    case -770908584: goto L_0x0064;
                    case -80340154: goto L_0x005b;
                    case 2193: goto L_0x0053;
                    case 35911772: goto L_0x004b;
                    case 77306085: goto L_0x0043;
                    case 880790796: goto L_0x003b;
                    case 898856916: goto L_0x0032;
                    case 1611821756: goto L_0x002a;
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
                r15 = 5
                goto L_0x0087
            L_0x0032:
                boolean r15 = r15.equals(r3)
                if (r15 == 0) goto L_0x0086
                r15 = 11
                goto L_0x0087
            L_0x003b:
                boolean r15 = r15.equals(r4)
                if (r15 == 0) goto L_0x0086
                r15 = 3
                goto L_0x0087
            L_0x0043:
                boolean r15 = r15.equals(r5)
                if (r15 == 0) goto L_0x0086
                r15 = 0
                goto L_0x0087
            L_0x004b:
                boolean r15 = r15.equals(r6)
                if (r15 == 0) goto L_0x0086
                r15 = 7
                goto L_0x0087
            L_0x0053:
                boolean r15 = r15.equals(r7)
                if (r15 == 0) goto L_0x0086
                r15 = 2
                goto L_0x0087
            L_0x005b:
                boolean r15 = r15.equals(r8)
                if (r15 == 0) goto L_0x0086
                r15 = 10
                goto L_0x0087
            L_0x0064:
                boolean r15 = r15.equals(r9)
                if (r15 == 0) goto L_0x0086
                r15 = 8
                goto L_0x0087
            L_0x006d:
                boolean r15 = r15.equals(r10)
                if (r15 == 0) goto L_0x0086
                r15 = 9
                goto L_0x0087
            L_0x0076:
                boolean r15 = r15.equals(r11)
                if (r15 == 0) goto L_0x0086
                r15 = 4
                goto L_0x0087
            L_0x007e:
                boolean r15 = r15.equals(r12)
                if (r15 == 0) goto L_0x0086
                r15 = 6
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
                com.miot.common.property.Property r15 = r14.getProperty(r3)
                boolean r15 = r15.isValueValid()
                if (r15 == 0) goto L_0x019e
                java.lang.Object r14 = r14.getValue(r3)
                java.lang.Long r14 = (java.lang.Long) r14
                com.yeelight.yeelib.device.xiaomi.BhfLightService$v0 r15 = r13.f15674a
                r15.mo28089c(r14)
                goto L_0x019e
            L_0x00a3:
                com.miot.common.property.Property r15 = r14.getProperty(r8)
                boolean r15 = r15.isValueValid()
                if (r15 == 0) goto L_0x019e
                java.lang.Object r14 = r14.getValue(r8)
                java.lang.Long r14 = (java.lang.Long) r14
                com.yeelight.yeelib.device.xiaomi.BhfLightService$v0 r15 = r13.f15674a
                r15.mo28097m(r14)
                goto L_0x019e
            L_0x00ba:
                com.miot.common.property.Property r15 = r14.getProperty(r10)
                boolean r15 = r15.isValueValid()
                if (r15 == 0) goto L_0x019e
                java.lang.Object r14 = r14.getValue(r10)
                java.lang.String r14 = (java.lang.String) r14
                com.yeelight.yeelib.device.xiaomi.BhfLightService$v0 r15 = r13.f15674a
                r15.mo28095i(r14)
                goto L_0x019e
            L_0x00d1:
                com.miot.common.property.Property r15 = r14.getProperty(r9)
                boolean r15 = r15.isValueValid()
                if (r15 == 0) goto L_0x019e
                java.lang.Object r14 = r14.getValue(r9)
                java.lang.Long r14 = (java.lang.Long) r14
                com.yeelight.yeelib.device.xiaomi.BhfLightService$v0 r15 = r13.f15674a
                r15.mo28096k(r14)
                goto L_0x019e
            L_0x00e8:
                com.miot.common.property.Property r15 = r14.getProperty(r6)
                boolean r15 = r15.isValueValid()
                if (r15 == 0) goto L_0x019e
                java.lang.Object r14 = r14.getValue(r6)
                java.lang.Long r14 = (java.lang.Long) r14
                com.yeelight.yeelib.device.xiaomi.BhfLightService$v0 r15 = r13.f15674a
                r15.mo28092f(r14)
                goto L_0x019e
            L_0x00ff:
                com.miot.common.property.Property r15 = r14.getProperty(r12)
                boolean r15 = r15.isValueValid()
                if (r15 == 0) goto L_0x019e
                java.lang.Object r14 = r14.getValue(r12)
                java.lang.Long r14 = (java.lang.Long) r14
                com.yeelight.yeelib.device.xiaomi.BhfLightService$v0 r15 = r13.f15674a
                r15.mo28090d(r14)
                goto L_0x019e
            L_0x0116:
                com.miot.common.property.Property r15 = r14.getProperty(r2)
                boolean r15 = r15.isValueValid()
                if (r15 == 0) goto L_0x019e
                java.lang.Object r14 = r14.getValue(r2)
                java.lang.Long r14 = (java.lang.Long) r14
                com.yeelight.yeelib.device.xiaomi.BhfLightService$v0 r15 = r13.f15674a
                r15.mo28093g(r14)
                goto L_0x019e
            L_0x012d:
                com.miot.common.property.Property r15 = r14.getProperty(r11)
                boolean r15 = r15.isValueValid()
                if (r15 == 0) goto L_0x019e
                java.lang.Object r14 = r14.getValue(r11)
                java.lang.String r14 = (java.lang.String) r14
                com.yeelight.yeelib.device.xiaomi.BhfLightService$v0 r15 = r13.f15674a
                r15.mo28091e(r14)
                goto L_0x019e
            L_0x0143:
                com.miot.common.property.Property r15 = r14.getProperty(r4)
                boolean r15 = r15.isValueValid()
                if (r15 == 0) goto L_0x019e
                java.lang.Object r14 = r14.getValue(r4)
                java.lang.Long r14 = (java.lang.Long) r14
                com.yeelight.yeelib.device.xiaomi.BhfLightService$v0 r15 = r13.f15674a
                r15.mo28088b(r14)
                goto L_0x019e
            L_0x0159:
                com.miot.common.property.Property r15 = r14.getProperty(r7)
                boolean r15 = r15.isValueValid()
                if (r15 == 0) goto L_0x019e
                java.lang.Object r14 = r14.getValue(r7)
                java.lang.Long r14 = (java.lang.Long) r14
                com.yeelight.yeelib.device.xiaomi.BhfLightService$v0 r15 = r13.f15674a
                r15.mo28094h(r14)
                goto L_0x019e
            L_0x016f:
                com.miot.common.property.Property r15 = r14.getProperty(r1)
                boolean r15 = r15.isValueValid()
                if (r15 == 0) goto L_0x019e
                java.lang.Object r14 = r14.getValue(r1)
                java.lang.Long r14 = (java.lang.Long) r14
                com.yeelight.yeelib.device.xiaomi.BhfLightService$v0 r15 = r13.f15674a
                r15.mo28087a(r14)
                goto L_0x019e
            L_0x0185:
                com.miot.common.property.Property r15 = r14.getProperty(r5)
                boolean r15 = r15.isValueValid()
                if (r15 == 0) goto L_0x019e
                java.lang.Object r14 = r14.getValue(r5)
                java.lang.String r14 = (java.lang.String) r14
                com.yeelight.yeelib.device.xiaomi.BhfLightService$u0 r14 = com.yeelight.yeelib.device.xiaomi.BhfLightService.C7694u0.valueOf(r14)
                com.yeelight.yeelib.device.xiaomi.BhfLightService$v0 r15 = r13.f15674a
                r15.mo28098n(r14)
            L_0x019e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.xiaomi.BhfLightService.C7695v.onPropertyChanged(com.miot.common.device.invocation.PropertyInfo, java.lang.String):void");
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BhfLightService$v0 */
    public interface C7696v0 {
        /* renamed from: a */
        void mo28087a(Long l);

        /* renamed from: b */
        void mo28088b(Long l);

        /* renamed from: c */
        void mo28089c(Long l);

        /* renamed from: d */
        void mo28090d(Long l);

        /* renamed from: e */
        void mo28091e(String str);

        /* renamed from: f */
        void mo28092f(Long l);

        /* renamed from: g */
        void mo28093g(Long l);

        /* renamed from: h */
        void mo28094h(Long l);

        /* renamed from: i */
        void mo28095i(String str);

        /* renamed from: k */
        void mo28096k(Long l);

        /* renamed from: m */
        void mo28097m(Long l);

        /* renamed from: n */
        void mo28098n(C7694u0 u0Var);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BhfLightService$w */
    class C7697w implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15675a;

        C7697w(BhfLightService bhfLightService, CompletionHandler completionHandler) {
            this.f15675a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15675a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f15675a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BhfLightService$x */
    class C7698x implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15676a;

        C7698x(BhfLightService bhfLightService, CompletionHandler completionHandler) {
            this.f15676a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15676a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f15676a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BhfLightService$y */
    class C7699y implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15677a;

        C7699y(BhfLightService bhfLightService, CompletionHandler completionHandler) {
            this.f15677a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15677a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f15677a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BhfLightService$z */
    class C7700z implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7688r0 f15678a;

        C7700z(BhfLightService bhfLightService, C7688r0 r0Var) {
            this.f15678a = r0Var;
        }

        public void onFailed(int i, String str) {
            this.f15678a.onFailed(i, str);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.Long} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onSucceed(com.miot.common.device.invocation.PropertyInfo r18) {
            /*
                r17 = this;
                r0 = r18
                java.lang.String r1 = "Power"
                com.miot.common.property.Property r1 = r0.getProperty(r1)
                boolean r2 = r1.isValueValid()
                r3 = 0
                if (r2 == 0) goto L_0x001b
                java.lang.Object r1 = r1.getValue()
                java.lang.String r1 = (java.lang.String) r1
                com.yeelight.yeelib.device.xiaomi.BhfLightService$u0 r1 = com.yeelight.yeelib.device.xiaomi.BhfLightService.C7694u0.valueOf(r1)
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
                java.lang.String r1 = "DelayOff"
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
                java.lang.String r1 = "FlowParams"
                com.miot.common.property.Property r1 = r0.getProperty(r1)
                boolean r2 = r1.isValueValid()
                if (r2 == 0) goto L_0x006f
                java.lang.Object r1 = r1.getValue()
                java.lang.String r1 = (java.lang.String) r1
                r9 = r1
                goto L_0x0070
            L_0x006f:
                r9 = r3
            L_0x0070:
                java.lang.String r1 = "LanMode"
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
                java.lang.String r1 = "SaveState"
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
                java.lang.String r1 = "onFromPower"
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
                java.lang.String r1 = "NLBright"
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
                java.lang.String r1 = "NightTimeInfo"
                com.miot.common.property.Property r1 = r0.getProperty(r1)
                boolean r2 = r1.isValueValid()
                if (r2 == 0) goto L_0x00d8
                java.lang.Object r1 = r1.getValue()
                java.lang.String r1 = (java.lang.String) r1
                r14 = r1
                goto L_0x00d9
            L_0x00d8:
                r14 = r3
            L_0x00d9:
                java.lang.String r1 = "MiBandSleep"
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
                java.lang.String r1 = "Flowing"
                com.miot.common.property.Property r0 = r0.getProperty(r1)
                boolean r1 = r0.isValueValid()
                if (r1 == 0) goto L_0x0101
                java.lang.Object r0 = r0.getValue()
                r3 = r0
                java.lang.Long r3 = (java.lang.Long) r3
            L_0x0101:
                r0 = r17
                r16 = r3
                com.yeelight.yeelib.device.xiaomi.BhfLightService$r0 r4 = r0.f15678a
                r4.mo28099a(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.xiaomi.BhfLightService.C7700z.onSucceed(com.miot.common.device.invocation.PropertyInfo):void");
        }
    }

    public BhfLightService(AbstractDevice abstractDevice) {
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
                MiotManager.getDeviceManipulator().invoke(create, new C7683p(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7669i(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getBright(C7668h0 h0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Bright"), new C7656b0(this, h0Var));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7698x(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getCt(C7670i0 i0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Ct"), new C7658c0(this, i0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getDelayOff(C7672j0 j0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "DelayOff"), new C7660d0(this, j0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowParams(C7674k0 k0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "FlowParams"), new C7662e0(this, k0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowing(C7676l0 l0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Flowing"), new C7665g(this, l0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getLanMode(C7678m0 m0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "LanMode"), new C7653a(this, m0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getMiBandSleep(C7680n0 n0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "MiBandSleep"), new C7663f(this, n0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getNLBright(C7682o0 o0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "NLBright"), new C7659d(this, o0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getNightTimeInfo(C7684p0 p0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "NightTimeInfo"), new C7661e(this, p0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getPower(C7686q0 q0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Power"), new C7654a0(this, q0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getProperties(C7688r0 r0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            PropertyInfo create = PropertyInfoFactory.create(getService());
            create.addProperty(getService().getProperty("Power"));
            create.addProperty(getService().getProperty("Bright"));
            create.addProperty(getService().getProperty("Ct"));
            create.addProperty(getService().getProperty("DelayOff"));
            create.addProperty(getService().getProperty("FlowParams"));
            create.addProperty(getService().getProperty("LanMode"));
            create.addProperty(getService().getProperty("SaveState"));
            create.addProperty(getService().getProperty("onFromPower"));
            create.addProperty(getService().getProperty("NLBright"));
            create.addProperty(getService().getProperty("NightTimeInfo"));
            create.addProperty(getService().getProperty("MiBandSleep"));
            create.addProperty(getService().getProperty("Flowing"));
            MiotManager.getDeviceManipulator().readProperty(create, new C7700z(this, r0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getSaveState(C7690s0 s0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "SaveState"), new C7655b(this, s0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getonFromPower(C7692t0 t0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "onFromPower"), new C7657c(this, t0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void openWithMode(C7694u0 u0Var, C7666g0 g0Var, Long l, Long l2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "openWithMode");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("Power", u0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Effect", g0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Duration", l)) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("Mode", l2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C7677m(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7671j(this, completionHandler));
                return;
            }
            throw new MiotException("actionInfo is null");
        }
        throw new MiotException("device not configurated connection");
    }

    public void sendCmd(C7664f0 f0Var, String str, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "sendCmd");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("CmdKey", f0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("CmdValue", str)) {
                MiotManager.getDeviceManipulator().invoke(create, new C7689s(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setBright(Long l, C7666g0 g0Var, Long l2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setBright");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("Bright", l)) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Effect", g0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("Duration", l2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C7667h(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setCt(Long l, C7666g0 g0Var, Long l2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setCt");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("Ct", l)) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Effect", g0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("Duration", l2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C7697w(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7685q(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7693u(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7687r(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setPower(C7694u0 u0Var, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setPower");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (create.setArgumentValue("Power", u0Var.toString())) {
                MiotManager.getDeviceManipulator().invoke(create, new C7679n(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7675l(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setadjust(String str, String str2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setadjust");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("adjustAction", str)) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("adjustProper", str2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C7691t(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void subscribeNotifications(CompletionHandler completionHandler, C7696v0 v0Var) {
        if (completionHandler == null) {
            throw new IllegalArgumentException("handler is null");
        } else if (v0Var != null) {
            PropertyInfo create = PropertyInfoFactory.create(getService());
            for (Property next : getService().getProperties()) {
                if (next.getDefinition().isNotifiable()) {
                    create.addProperty(next);
                }
            }
            MiotManager.getDeviceManipulator().addPropertyChangedListener(create, new C7673k(this, completionHandler), new C7695v(this, v0Var));
        } else {
            throw new IllegalArgumentException("listener is null");
        }
    }

    public void toggle(CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "toggle");
            if (create != null) {
                MiotManager.getDeviceManipulator().invoke(create, new C7681o(this, completionHandler));
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
            MiotManager.getDeviceManipulator().removePropertyChangedListener(create, new C7699y(this, completionHandler));
            return;
        }
        throw new IllegalArgumentException("handler is null");
    }
}
