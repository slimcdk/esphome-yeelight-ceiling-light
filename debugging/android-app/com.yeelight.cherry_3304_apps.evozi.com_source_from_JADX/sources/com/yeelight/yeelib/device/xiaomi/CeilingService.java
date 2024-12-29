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

public class CeilingService extends AbstractService {
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
    private static final String TAG = "CeilingService";
    private AbstractDevice mDevice = null;

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingService$a */
    class C8347a implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8372m0 f16326a;

        C8347a(CeilingService ceilingService, C8372m0 m0Var) {
            this.f16326a = m0Var;
        }

        public void onFailed(int i, String str) {
            this.f16326a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("LanMode");
            if (property.isValueValid()) {
                this.f16326a.mo29922a((Long) propertyInfo.getValue("LanMode"));
                return;
            }
            C8372m0 m0Var = this.f16326a;
            m0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingService$a0 */
    class C8348a0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8380q0 f16327a;

        C8348a0(CeilingService ceilingService, C8380q0 q0Var) {
            this.f16327a = q0Var;
        }

        public void onFailed(int i, String str) {
            this.f16327a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Power");
            if (property.isValueValid()) {
                this.f16327a.mo29930a(C8388u0.valueOf((String) propertyInfo.getValue("Power")));
                return;
            }
            C8380q0 q0Var = this.f16327a;
            q0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingService$b */
    class C8349b implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8384s0 f16328a;

        C8349b(CeilingService ceilingService, C8384s0 s0Var) {
            this.f16328a = s0Var;
        }

        public void onFailed(int i, String str) {
            this.f16328a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("SaveState");
            if (property.isValueValid()) {
                this.f16328a.mo29932a((Long) propertyInfo.getValue("SaveState"));
                return;
            }
            C8384s0 s0Var = this.f16328a;
            s0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingService$b0 */
    class C8350b0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8362h0 f16329a;

        C8350b0(CeilingService ceilingService, C8362h0 h0Var) {
            this.f16329a = h0Var;
        }

        public void onFailed(int i, String str) {
            this.f16329a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Bright");
            if (property.isValueValid()) {
                this.f16329a.mo29912a((Long) propertyInfo.getValue("Bright"));
                return;
            }
            C8362h0 h0Var = this.f16329a;
            h0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingService$c */
    class C8351c implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8386t0 f16330a;

        C8351c(CeilingService ceilingService, C8386t0 t0Var) {
            this.f16330a = t0Var;
        }

        public void onFailed(int i, String str) {
            this.f16330a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("onFromPower");
            if (property.isValueValid()) {
                this.f16330a.mo29934a((Long) propertyInfo.getValue("onFromPower"));
                return;
            }
            C8386t0 t0Var = this.f16330a;
            t0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingService$c0 */
    class C8352c0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8364i0 f16331a;

        C8352c0(CeilingService ceilingService, C8364i0 i0Var) {
            this.f16331a = i0Var;
        }

        public void onFailed(int i, String str) {
            this.f16331a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Ct");
            if (property.isValueValid()) {
                this.f16331a.mo29914a((Long) propertyInfo.getValue("Ct"));
                return;
            }
            C8364i0 i0Var = this.f16331a;
            i0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingService$d */
    class C8353d implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8376o0 f16332a;

        C8353d(CeilingService ceilingService, C8376o0 o0Var) {
            this.f16332a = o0Var;
        }

        public void onFailed(int i, String str) {
            this.f16332a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("NLBright");
            if (property.isValueValid()) {
                this.f16332a.mo29926a((Long) propertyInfo.getValue("NLBright"));
                return;
            }
            C8376o0 o0Var = this.f16332a;
            o0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingService$d0 */
    class C8354d0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8366j0 f16333a;

        C8354d0(CeilingService ceilingService, C8366j0 j0Var) {
            this.f16333a = j0Var;
        }

        public void onFailed(int i, String str) {
            this.f16333a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("DelayOff");
            if (property.isValueValid()) {
                this.f16333a.mo29916a((Long) propertyInfo.getValue("DelayOff"));
                return;
            }
            C8366j0 j0Var = this.f16333a;
            j0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingService$e */
    class C8355e implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8378p0 f16334a;

        C8355e(CeilingService ceilingService, C8378p0 p0Var) {
            this.f16334a = p0Var;
        }

        public void onFailed(int i, String str) {
            this.f16334a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("NightTimeInfo");
            if (property.isValueValid()) {
                this.f16334a.onSucceed((String) propertyInfo.getValue("NightTimeInfo"));
                return;
            }
            C8378p0 p0Var = this.f16334a;
            p0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingService$e0 */
    class C8356e0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8368k0 f16335a;

        C8356e0(CeilingService ceilingService, C8368k0 k0Var) {
            this.f16335a = k0Var;
        }

        public void onFailed(int i, String str) {
            this.f16335a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("FlowParams");
            if (property.isValueValid()) {
                this.f16335a.onSucceed((String) propertyInfo.getValue("FlowParams"));
                return;
            }
            C8368k0 k0Var = this.f16335a;
            k0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingService$f */
    class C8357f implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8374n0 f16336a;

        C8357f(CeilingService ceilingService, C8374n0 n0Var) {
            this.f16336a = n0Var;
        }

        public void onFailed(int i, String str) {
            this.f16336a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("MiBandSleep");
            if (property.isValueValid()) {
                this.f16336a.mo29924a((Long) propertyInfo.getValue("MiBandSleep"));
                return;
            }
            C8374n0 n0Var = this.f16336a;
            n0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingService$f0 */
    public enum C8358f0 {
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

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingService$g */
    class C8359g implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8370l0 f16347a;

        C8359g(CeilingService ceilingService, C8370l0 l0Var) {
            this.f16347a = l0Var;
        }

        public void onFailed(int i, String str) {
            this.f16347a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Flowing");
            if (property.isValueValid()) {
                this.f16347a.mo29920a((Long) propertyInfo.getValue("Flowing"));
                return;
            }
            C8370l0 l0Var = this.f16347a;
            l0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingService$g0 */
    public enum C8360g0 {
        undefined,
        smooth,
        sudden
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingService$h */
    class C8361h implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16352a;

        C8361h(CeilingService ceilingService, CompletionHandler completionHandler) {
            this.f16352a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16352a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16352a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingService$h0 */
    public interface C8362h0 {
        /* renamed from: a */
        void mo29912a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingService$i */
    class C8363i implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16353a;

        C8363i(CeilingService ceilingService, CompletionHandler completionHandler) {
            this.f16353a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16353a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16353a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingService$i0 */
    public interface C8364i0 {
        /* renamed from: a */
        void mo29914a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingService$j */
    class C8365j implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16354a;

        C8365j(CeilingService ceilingService, CompletionHandler completionHandler) {
            this.f16354a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16354a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16354a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingService$j0 */
    public interface C8366j0 {
        /* renamed from: a */
        void mo29916a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingService$k */
    class C8367k implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16355a;

        C8367k(CeilingService ceilingService, CompletionHandler completionHandler) {
            this.f16355a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16355a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f16355a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingService$k0 */
    public interface C8368k0 {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingService$l */
    class C8369l implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16356a;

        C8369l(CeilingService ceilingService, CompletionHandler completionHandler) {
            this.f16356a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16356a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16356a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingService$l0 */
    public interface C8370l0 {
        /* renamed from: a */
        void mo29920a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingService$m */
    class C8371m implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16357a;

        C8371m(CeilingService ceilingService, CompletionHandler completionHandler) {
            this.f16357a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16357a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16357a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingService$m0 */
    public interface C8372m0 {
        /* renamed from: a */
        void mo29922a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingService$n */
    class C8373n implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16358a;

        C8373n(CeilingService ceilingService, CompletionHandler completionHandler) {
            this.f16358a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16358a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16358a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingService$n0 */
    public interface C8374n0 {
        /* renamed from: a */
        void mo29924a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingService$o */
    class C8375o implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16359a;

        C8375o(CeilingService ceilingService, CompletionHandler completionHandler) {
            this.f16359a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16359a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16359a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingService$o0 */
    public interface C8376o0 {
        /* renamed from: a */
        void mo29926a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingService$p */
    class C8377p implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16360a;

        C8377p(CeilingService ceilingService, CompletionHandler completionHandler) {
            this.f16360a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16360a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16360a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingService$p0 */
    public interface C8378p0 {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingService$q */
    class C8379q implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16361a;

        C8379q(CeilingService ceilingService, CompletionHandler completionHandler) {
            this.f16361a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16361a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16361a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingService$q0 */
    public interface C8380q0 {
        /* renamed from: a */
        void mo29930a(C8388u0 u0Var);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingService$r */
    class C8381r implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16362a;

        C8381r(CeilingService ceilingService, CompletionHandler completionHandler) {
            this.f16362a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16362a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16362a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingService$r0 */
    public interface C8382r0 {
        /* renamed from: a */
        void mo28580a(C8388u0 u0Var, Long l, Long l2, Long l3, String str, Long l4, Long l5, Long l6, Long l7, String str2, Long l8, Long l9);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingService$s */
    class C8383s implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16363a;

        C8383s(CeilingService ceilingService, CompletionHandler completionHandler) {
            this.f16363a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16363a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16363a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingService$s0 */
    public interface C8384s0 {
        /* renamed from: a */
        void mo29932a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingService$t */
    class C8385t implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16364a;

        C8385t(CeilingService ceilingService, CompletionHandler completionHandler) {
            this.f16364a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16364a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16364a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingService$t0 */
    public interface C8386t0 {
        /* renamed from: a */
        void mo29934a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingService$u */
    class C8387u implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16365a;

        C8387u(CeilingService ceilingService, CompletionHandler completionHandler) {
            this.f16365a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16365a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16365a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingService$u0 */
    public enum C8388u0 {
        undefined,
        on,
        off
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingService$v */
    class C8389v implements DeviceManipulator.PropertyChangedListener {

        /* renamed from: a */
        final /* synthetic */ C8390v0 f16370a;

        C8389v(CeilingService ceilingService, C8390v0 v0Var) {
            this.f16370a = v0Var;
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
                com.yeelight.yeelib.device.xiaomi.CeilingService$v0 r15 = r13.f16370a
                r15.mo28570c(r14)
                goto L_0x019e
            L_0x00a3:
                com.miot.common.property.Property r15 = r14.getProperty(r8)
                boolean r15 = r15.isValueValid()
                if (r15 == 0) goto L_0x019e
                java.lang.Object r14 = r14.getValue(r8)
                java.lang.Long r14 = (java.lang.Long) r14
                com.yeelight.yeelib.device.xiaomi.CeilingService$v0 r15 = r13.f16370a
                r15.mo28579m(r14)
                goto L_0x019e
            L_0x00ba:
                com.miot.common.property.Property r15 = r14.getProperty(r10)
                boolean r15 = r15.isValueValid()
                if (r15 == 0) goto L_0x019e
                java.lang.Object r14 = r14.getValue(r10)
                java.lang.String r14 = (java.lang.String) r14
                com.yeelight.yeelib.device.xiaomi.CeilingService$v0 r15 = r13.f16370a
                r15.mo28576i(r14)
                goto L_0x019e
            L_0x00d1:
                com.miot.common.property.Property r15 = r14.getProperty(r9)
                boolean r15 = r15.isValueValid()
                if (r15 == 0) goto L_0x019e
                java.lang.Object r14 = r14.getValue(r9)
                java.lang.Long r14 = (java.lang.Long) r14
                com.yeelight.yeelib.device.xiaomi.CeilingService$v0 r15 = r13.f16370a
                r15.mo28578k(r14)
                goto L_0x019e
            L_0x00e8:
                com.miot.common.property.Property r15 = r14.getProperty(r6)
                boolean r15 = r15.isValueValid()
                if (r15 == 0) goto L_0x019e
                java.lang.Object r14 = r14.getValue(r6)
                java.lang.Long r14 = (java.lang.Long) r14
                com.yeelight.yeelib.device.xiaomi.CeilingService$v0 r15 = r13.f16370a
                r15.mo28573f(r14)
                goto L_0x019e
            L_0x00ff:
                com.miot.common.property.Property r15 = r14.getProperty(r12)
                boolean r15 = r15.isValueValid()
                if (r15 == 0) goto L_0x019e
                java.lang.Object r14 = r14.getValue(r12)
                java.lang.Long r14 = (java.lang.Long) r14
                com.yeelight.yeelib.device.xiaomi.CeilingService$v0 r15 = r13.f16370a
                r15.mo28571d(r14)
                goto L_0x019e
            L_0x0116:
                com.miot.common.property.Property r15 = r14.getProperty(r2)
                boolean r15 = r15.isValueValid()
                if (r15 == 0) goto L_0x019e
                java.lang.Object r14 = r14.getValue(r2)
                java.lang.Long r14 = (java.lang.Long) r14
                com.yeelight.yeelib.device.xiaomi.CeilingService$v0 r15 = r13.f16370a
                r15.mo28574g(r14)
                goto L_0x019e
            L_0x012d:
                com.miot.common.property.Property r15 = r14.getProperty(r11)
                boolean r15 = r15.isValueValid()
                if (r15 == 0) goto L_0x019e
                java.lang.Object r14 = r14.getValue(r11)
                java.lang.String r14 = (java.lang.String) r14
                com.yeelight.yeelib.device.xiaomi.CeilingService$v0 r15 = r13.f16370a
                r15.mo28572e(r14)
                goto L_0x019e
            L_0x0143:
                com.miot.common.property.Property r15 = r14.getProperty(r4)
                boolean r15 = r15.isValueValid()
                if (r15 == 0) goto L_0x019e
                java.lang.Object r14 = r14.getValue(r4)
                java.lang.Long r14 = (java.lang.Long) r14
                com.yeelight.yeelib.device.xiaomi.CeilingService$v0 r15 = r13.f16370a
                r15.mo28569b(r14)
                goto L_0x019e
            L_0x0159:
                com.miot.common.property.Property r15 = r14.getProperty(r7)
                boolean r15 = r15.isValueValid()
                if (r15 == 0) goto L_0x019e
                java.lang.Object r14 = r14.getValue(r7)
                java.lang.Long r14 = (java.lang.Long) r14
                com.yeelight.yeelib.device.xiaomi.CeilingService$v0 r15 = r13.f16370a
                r15.mo28575h(r14)
                goto L_0x019e
            L_0x016f:
                com.miot.common.property.Property r15 = r14.getProperty(r1)
                boolean r15 = r15.isValueValid()
                if (r15 == 0) goto L_0x019e
                java.lang.Object r14 = r14.getValue(r1)
                java.lang.Long r14 = (java.lang.Long) r14
                com.yeelight.yeelib.device.xiaomi.CeilingService$v0 r15 = r13.f16370a
                r15.mo28568a(r14)
                goto L_0x019e
            L_0x0185:
                com.miot.common.property.Property r15 = r14.getProperty(r5)
                boolean r15 = r15.isValueValid()
                if (r15 == 0) goto L_0x019e
                java.lang.Object r14 = r14.getValue(r5)
                java.lang.String r14 = (java.lang.String) r14
                com.yeelight.yeelib.device.xiaomi.CeilingService$u0 r14 = com.yeelight.yeelib.device.xiaomi.CeilingService.C8388u0.valueOf(r14)
                com.yeelight.yeelib.device.xiaomi.CeilingService$v0 r15 = r13.f16370a
                r15.mo28577j(r14)
            L_0x019e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.xiaomi.CeilingService.C8389v.onPropertyChanged(com.miot.common.device.invocation.PropertyInfo, java.lang.String):void");
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingService$v0 */
    public interface C8390v0 {
        /* renamed from: a */
        void mo28568a(Long l);

        /* renamed from: b */
        void mo28569b(Long l);

        /* renamed from: c */
        void mo28570c(Long l);

        /* renamed from: d */
        void mo28571d(Long l);

        /* renamed from: e */
        void mo28572e(String str);

        /* renamed from: f */
        void mo28573f(Long l);

        /* renamed from: g */
        void mo28574g(Long l);

        /* renamed from: h */
        void mo28575h(Long l);

        /* renamed from: i */
        void mo28576i(String str);

        /* renamed from: j */
        void mo28577j(C8388u0 u0Var);

        /* renamed from: k */
        void mo28578k(Long l);

        /* renamed from: m */
        void mo28579m(Long l);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingService$w */
    class C8391w implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16371a;

        C8391w(CeilingService ceilingService, CompletionHandler completionHandler) {
            this.f16371a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16371a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16371a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingService$x */
    class C8392x implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16372a;

        C8392x(CeilingService ceilingService, CompletionHandler completionHandler) {
            this.f16372a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16372a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16372a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingService$y */
    class C8393y implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16373a;

        C8393y(CeilingService ceilingService, CompletionHandler completionHandler) {
            this.f16373a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16373a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f16373a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingService$z */
    class C8394z implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8382r0 f16374a;

        C8394z(CeilingService ceilingService, C8382r0 r0Var) {
            this.f16374a = r0Var;
        }

        public void onFailed(int i, String str) {
            this.f16374a.onFailed(i, str);
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
                com.yeelight.yeelib.device.xiaomi.CeilingService$u0 r1 = com.yeelight.yeelib.device.xiaomi.CeilingService.C8388u0.valueOf(r1)
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
                com.yeelight.yeelib.device.xiaomi.CeilingService$r0 r4 = r0.f16374a
                r4.mo28580a(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.xiaomi.CeilingService.C8394z.onSucceed(com.miot.common.device.invocation.PropertyInfo):void");
        }
    }

    public CeilingService(AbstractDevice abstractDevice) {
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
                MiotManager.getDeviceManipulator().invoke(create, new C8377p(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8363i(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getBright(C8362h0 h0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Bright"), new C8350b0(this, h0Var));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8392x(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getCt(C8364i0 i0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Ct"), new C8352c0(this, i0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getDelayOff(C8366j0 j0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "DelayOff"), new C8354d0(this, j0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowParams(C8368k0 k0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "FlowParams"), new C8356e0(this, k0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowing(C8370l0 l0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Flowing"), new C8359g(this, l0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getLanMode(C8372m0 m0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "LanMode"), new C8347a(this, m0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getMiBandSleep(C8374n0 n0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "MiBandSleep"), new C8357f(this, n0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getNLBright(C8376o0 o0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "NLBright"), new C8353d(this, o0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getNightTimeInfo(C8378p0 p0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "NightTimeInfo"), new C8355e(this, p0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getPower(C8380q0 q0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Power"), new C8348a0(this, q0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getProperties(C8382r0 r0Var) {
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
            MiotManager.getDeviceManipulator().readProperty(create, new C8394z(this, r0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getSaveState(C8384s0 s0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "SaveState"), new C8349b(this, s0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getonFromPower(C8386t0 t0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "onFromPower"), new C8351c(this, t0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void openWithMode(C8388u0 u0Var, C8360g0 g0Var, Long l, Long l2, CompletionHandler completionHandler) {
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
                MiotManager.getDeviceManipulator().invoke(create, new C8371m(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8365j(this, completionHandler));
                return;
            }
            throw new MiotException("actionInfo is null");
        }
        throw new MiotException("device not configurated connection");
    }

    public void sendCmd(C8358f0 f0Var, String str, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "sendCmd");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("CmdKey", f0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("CmdValue", str)) {
                MiotManager.getDeviceManipulator().invoke(create, new C8383s(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setBright(Long l, C8360g0 g0Var, Long l2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setBright");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("Bright", l)) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Effect", g0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("Duration", l2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C8361h(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setCt(Long l, C8360g0 g0Var, Long l2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setCt");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("Ct", l)) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Effect", g0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("Duration", l2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C8391w(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8379q(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8387u(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8381r(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setPower(C8388u0 u0Var, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setPower");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (create.setArgumentValue("Power", u0Var.toString())) {
                MiotManager.getDeviceManipulator().invoke(create, new C8373n(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8369l(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8385t(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void subscribeNotifications(CompletionHandler completionHandler, C8390v0 v0Var) {
        if (completionHandler == null) {
            throw new IllegalArgumentException("handler is null");
        } else if (v0Var != null) {
            PropertyInfo create = PropertyInfoFactory.create(getService());
            for (Property next : getService().getProperties()) {
                if (next.getDefinition().isNotifiable()) {
                    create.addProperty(next);
                }
            }
            MiotManager.getDeviceManipulator().addPropertyChangedListener(create, new C8367k(this, completionHandler), new C8389v(this, v0Var));
        } else {
            throw new IllegalArgumentException("listener is null");
        }
    }

    public void toggle(CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "toggle");
            if (create != null) {
                MiotManager.getDeviceManipulator().invoke(create, new C8375o(this, completionHandler));
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
            MiotManager.getDeviceManipulator().removePropertyChangedListener(create, new C8393y(this, completionHandler));
            return;
        }
        throw new IllegalArgumentException("handler is null");
    }
}
