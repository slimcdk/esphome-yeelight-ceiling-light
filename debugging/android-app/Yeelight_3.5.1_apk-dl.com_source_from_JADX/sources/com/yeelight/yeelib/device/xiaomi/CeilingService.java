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

    public enum CmdKey {
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

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingService$a */
    class C6888a implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6909k0 f13207a;

        C6888a(CeilingService ceilingService, C6909k0 k0Var) {
            this.f13207a = k0Var;
        }

        public void onFailed(int i, String str) {
            this.f13207a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("LanMode");
            if (property.isValueValid()) {
                this.f13207a.mo33032a((Long) propertyInfo.getValue("LanMode"));
                return;
            }
            C6909k0 k0Var = this.f13207a;
            k0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingService$a0 */
    class C6889a0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6917o0 f13208a;

        C6889a0(CeilingService ceilingService, C6917o0 o0Var) {
            this.f13208a = o0Var;
        }

        public void onFailed(int i, String str) {
            this.f13208a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Power");
            if (property.isValueValid()) {
                this.f13208a.mo33040a(Power.valueOf((String) propertyInfo.getValue("Power")));
                return;
            }
            C6917o0 o0Var = this.f13208a;
            o0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingService$b */
    class C6890b implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6921q0 f13209a;

        C6890b(CeilingService ceilingService, C6921q0 q0Var) {
            this.f13209a = q0Var;
        }

        public void onFailed(int i, String str) {
            this.f13209a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("SaveState");
            if (property.isValueValid()) {
                this.f13209a.mo33044a((Long) propertyInfo.getValue("SaveState"));
                return;
            }
            C6921q0 q0Var = this.f13209a;
            q0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingService$b0 */
    class C6891b0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6899f0 f13210a;

        C6891b0(CeilingService ceilingService, C6899f0 f0Var) {
            this.f13210a = f0Var;
        }

        public void onFailed(int i, String str) {
            this.f13210a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Bright");
            if (property.isValueValid()) {
                this.f13210a.mo33022a((Long) propertyInfo.getValue("Bright"));
                return;
            }
            C6899f0 f0Var = this.f13210a;
            f0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingService$c */
    class C6892c implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6923r0 f13211a;

        C6892c(CeilingService ceilingService, C6923r0 r0Var) {
            this.f13211a = r0Var;
        }

        public void onFailed(int i, String str) {
            this.f13211a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("onFromPower");
            if (property.isValueValid()) {
                this.f13211a.mo33046a((Long) propertyInfo.getValue("onFromPower"));
                return;
            }
            C6923r0 r0Var = this.f13211a;
            r0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingService$c0 */
    class C6893c0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6901g0 f13212a;

        C6893c0(CeilingService ceilingService, C6901g0 g0Var) {
            this.f13212a = g0Var;
        }

        public void onFailed(int i, String str) {
            this.f13212a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Ct");
            if (property.isValueValid()) {
                this.f13212a.mo33024a((Long) propertyInfo.getValue("Ct"));
                return;
            }
            C6901g0 g0Var = this.f13212a;
            g0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingService$d */
    class C6894d implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6913m0 f13213a;

        C6894d(CeilingService ceilingService, C6913m0 m0Var) {
            this.f13213a = m0Var;
        }

        public void onFailed(int i, String str) {
            this.f13213a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("NLBright");
            if (property.isValueValid()) {
                this.f13213a.mo33036a((Long) propertyInfo.getValue("NLBright"));
                return;
            }
            C6913m0 m0Var = this.f13213a;
            m0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingService$d0 */
    class C6895d0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6903h0 f13214a;

        C6895d0(CeilingService ceilingService, C6903h0 h0Var) {
            this.f13214a = h0Var;
        }

        public void onFailed(int i, String str) {
            this.f13214a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("DelayOff");
            if (property.isValueValid()) {
                this.f13214a.mo33026a((Long) propertyInfo.getValue("DelayOff"));
                return;
            }
            C6903h0 h0Var = this.f13214a;
            h0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingService$e */
    class C6896e implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6915n0 f13215a;

        C6896e(CeilingService ceilingService, C6915n0 n0Var) {
            this.f13215a = n0Var;
        }

        public void onFailed(int i, String str) {
            this.f13215a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("NightTimeInfo");
            if (property.isValueValid()) {
                this.f13215a.onSucceed((String) propertyInfo.getValue("NightTimeInfo"));
                return;
            }
            C6915n0 n0Var = this.f13215a;
            n0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingService$e0 */
    class C6897e0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6905i0 f13216a;

        C6897e0(CeilingService ceilingService, C6905i0 i0Var) {
            this.f13216a = i0Var;
        }

        public void onFailed(int i, String str) {
            this.f13216a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("FlowParams");
            if (property.isValueValid()) {
                this.f13216a.onSucceed((String) propertyInfo.getValue("FlowParams"));
                return;
            }
            C6905i0 i0Var = this.f13216a;
            i0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingService$f */
    class C6898f implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6911l0 f13217a;

        C6898f(CeilingService ceilingService, C6911l0 l0Var) {
            this.f13217a = l0Var;
        }

        public void onFailed(int i, String str) {
            this.f13217a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("MiBandSleep");
            if (property.isValueValid()) {
                this.f13217a.mo33034a((Long) propertyInfo.getValue("MiBandSleep"));
                return;
            }
            C6911l0 l0Var = this.f13217a;
            l0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingService$f0 */
    public interface C6899f0 {
        /* renamed from: a */
        void mo33022a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingService$g */
    class C6900g implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6907j0 f13218a;

        C6900g(CeilingService ceilingService, C6907j0 j0Var) {
            this.f13218a = j0Var;
        }

        public void onFailed(int i, String str) {
            this.f13218a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Flowing");
            if (property.isValueValid()) {
                this.f13218a.mo33030a((Long) propertyInfo.getValue("Flowing"));
                return;
            }
            C6907j0 j0Var = this.f13218a;
            j0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingService$g0 */
    public interface C6901g0 {
        /* renamed from: a */
        void mo33024a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingService$h */
    class C6902h implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13219a;

        C6902h(CeilingService ceilingService, CompletionHandler completionHandler) {
            this.f13219a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13219a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13219a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingService$h0 */
    public interface C6903h0 {
        /* renamed from: a */
        void mo33026a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingService$i */
    class C6904i implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13220a;

        C6904i(CeilingService ceilingService, CompletionHandler completionHandler) {
            this.f13220a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13220a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13220a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingService$i0 */
    public interface C6905i0 {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingService$j */
    class C6906j implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13221a;

        C6906j(CeilingService ceilingService, CompletionHandler completionHandler) {
            this.f13221a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13221a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13221a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingService$j0 */
    public interface C6907j0 {
        /* renamed from: a */
        void mo33030a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingService$k */
    class C6908k implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13222a;

        C6908k(CeilingService ceilingService, CompletionHandler completionHandler) {
            this.f13222a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13222a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f13222a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingService$k0 */
    public interface C6909k0 {
        /* renamed from: a */
        void mo33032a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingService$l */
    class C6910l implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13223a;

        C6910l(CeilingService ceilingService, CompletionHandler completionHandler) {
            this.f13223a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13223a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13223a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingService$l0 */
    public interface C6911l0 {
        /* renamed from: a */
        void mo33034a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingService$m */
    class C6912m implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13224a;

        C6912m(CeilingService ceilingService, CompletionHandler completionHandler) {
            this.f13224a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13224a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13224a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingService$m0 */
    public interface C6913m0 {
        /* renamed from: a */
        void mo33036a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingService$n */
    class C6914n implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13225a;

        C6914n(CeilingService ceilingService, CompletionHandler completionHandler) {
            this.f13225a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13225a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13225a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingService$n0 */
    public interface C6915n0 {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingService$o */
    class C6916o implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13226a;

        C6916o(CeilingService ceilingService, CompletionHandler completionHandler) {
            this.f13226a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13226a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13226a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingService$o0 */
    public interface C6917o0 {
        /* renamed from: a */
        void mo33040a(Power power);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingService$p */
    class C6918p implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13227a;

        C6918p(CeilingService ceilingService, CompletionHandler completionHandler) {
            this.f13227a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13227a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13227a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingService$p0 */
    public interface C6919p0 {
        /* renamed from: a */
        void mo33042a(Power power, Long l, Long l2, Long l3, String str, Long l4, Long l5, Long l6, Long l7, String str2, Long l8, Long l9);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingService$q */
    class C6920q implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13228a;

        C6920q(CeilingService ceilingService, CompletionHandler completionHandler) {
            this.f13228a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13228a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13228a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingService$q0 */
    public interface C6921q0 {
        /* renamed from: a */
        void mo33044a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingService$r */
    class C6922r implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13229a;

        C6922r(CeilingService ceilingService, CompletionHandler completionHandler) {
            this.f13229a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13229a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13229a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingService$r0 */
    public interface C6923r0 {
        /* renamed from: a */
        void mo33046a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingService$s */
    class C6924s implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13230a;

        C6924s(CeilingService ceilingService, CompletionHandler completionHandler) {
            this.f13230a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13230a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13230a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingService$s0 */
    public interface C6925s0 {
        /* renamed from: a */
        void mo33048a(Long l);

        /* renamed from: b */
        void mo33049b(Long l);

        /* renamed from: c */
        void mo33050c(Long l);

        /* renamed from: d */
        void mo33051d(Long l);

        /* renamed from: e */
        void mo33052e(String str);

        /* renamed from: f */
        void mo33053f(Long l);

        /* renamed from: g */
        void mo33054g(Long l);

        /* renamed from: h */
        void mo33055h(Long l);

        /* renamed from: i */
        void mo33056i(String str);

        /* renamed from: j */
        void mo33057j(Power power);

        /* renamed from: k */
        void mo33058k(Long l);

        /* renamed from: m */
        void mo33059m(Long l);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingService$t */
    class C6926t implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13231a;

        C6926t(CeilingService ceilingService, CompletionHandler completionHandler) {
            this.f13231a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13231a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13231a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingService$u */
    class C6927u implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13232a;

        C6927u(CeilingService ceilingService, CompletionHandler completionHandler) {
            this.f13232a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13232a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13232a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingService$v */
    class C6928v implements DeviceManipulator.PropertyChangedListener {

        /* renamed from: a */
        final /* synthetic */ C6925s0 f13233a;

        C6928v(CeilingService ceilingService, C6925s0 s0Var) {
            this.f13233a = s0Var;
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
                case -1331143373:
                    if (str2.equals("NightTimeInfo")) {
                        c = 2;
                        break;
                    }
                    break;
                case -770908584:
                    if (str2.equals("NLBright")) {
                        c = 3;
                        break;
                    }
                    break;
                case -80340154:
                    if (str2.equals("MiBandSleep")) {
                        c = 4;
                        break;
                    }
                    break;
                case 2193:
                    if (str2.equals("Ct")) {
                        c = 5;
                        break;
                    }
                    break;
                case 35911772:
                    if (str2.equals("onFromPower")) {
                        c = 6;
                        break;
                    }
                    break;
                case 77306085:
                    if (str2.equals("Power")) {
                        c = 7;
                        break;
                    }
                    break;
                case 880790796:
                    if (str2.equals("DelayOff")) {
                        c = 8;
                        break;
                    }
                    break;
                case 898856916:
                    if (str2.equals("Flowing")) {
                        c = 9;
                        break;
                    }
                    break;
                case 1611821756:
                    if (str2.equals("LanMode")) {
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
                        this.f13233a.mo33050c((Long) propertyInfo2.getValue("SaveState"));
                        return;
                    }
                    return;
                case 1:
                    if (propertyInfo2.getProperty("FlowParams").isValueValid()) {
                        this.f13233a.mo33052e((String) propertyInfo2.getValue("FlowParams"));
                        return;
                    }
                    return;
                case 2:
                    if (propertyInfo2.getProperty("NightTimeInfo").isValueValid()) {
                        this.f13233a.mo33056i((String) propertyInfo2.getValue("NightTimeInfo"));
                        return;
                    }
                    return;
                case 3:
                    if (propertyInfo2.getProperty("NLBright").isValueValid()) {
                        this.f13233a.mo33058k((Long) propertyInfo2.getValue("NLBright"));
                        return;
                    }
                    return;
                case 4:
                    if (propertyInfo2.getProperty("MiBandSleep").isValueValid()) {
                        this.f13233a.mo33059m((Long) propertyInfo2.getValue("MiBandSleep"));
                        return;
                    }
                    return;
                case 5:
                    if (propertyInfo2.getProperty("Ct").isValueValid()) {
                        this.f13233a.mo33055h((Long) propertyInfo2.getValue("Ct"));
                        return;
                    }
                    return;
                case 6:
                    if (propertyInfo2.getProperty("onFromPower").isValueValid()) {
                        this.f13233a.mo33053f((Long) propertyInfo2.getValue("onFromPower"));
                        return;
                    }
                    return;
                case 7:
                    if (propertyInfo2.getProperty("Power").isValueValid()) {
                        this.f13233a.mo33057j(Power.valueOf((String) propertyInfo2.getValue("Power")));
                        return;
                    }
                    return;
                case 8:
                    if (propertyInfo2.getProperty("DelayOff").isValueValid()) {
                        this.f13233a.mo33049b((Long) propertyInfo2.getValue("DelayOff"));
                        return;
                    }
                    return;
                case 9:
                    if (propertyInfo2.getProperty("Flowing").isValueValid()) {
                        this.f13233a.mo33051d((Long) propertyInfo2.getValue("Flowing"));
                        return;
                    }
                    return;
                case 10:
                    if (propertyInfo2.getProperty("LanMode").isValueValid()) {
                        this.f13233a.mo33054g((Long) propertyInfo2.getValue("LanMode"));
                        return;
                    }
                    return;
                case 11:
                    if (propertyInfo2.getProperty("Bright").isValueValid()) {
                        this.f13233a.mo33048a((Long) propertyInfo2.getValue("Bright"));
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingService$w */
    class C6929w implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13234a;

        C6929w(CeilingService ceilingService, CompletionHandler completionHandler) {
            this.f13234a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13234a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13234a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingService$x */
    class C6930x implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13235a;

        C6930x(CeilingService ceilingService, CompletionHandler completionHandler) {
            this.f13235a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13235a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13235a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingService$y */
    class C6931y implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13236a;

        C6931y(CeilingService ceilingService, CompletionHandler completionHandler) {
            this.f13236a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13236a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f13236a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingService$z */
    class C6932z implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6919p0 f13237a;

        C6932z(CeilingService ceilingService, C6919p0 p0Var) {
            this.f13237a = p0Var;
        }

        public void onFailed(int i, String str) {
            this.f13237a.onFailed(i, str);
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
                com.yeelight.yeelib.device.xiaomi.CeilingService$Power r1 = com.yeelight.yeelib.device.xiaomi.CeilingService.Power.valueOf(r1)
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
                com.yeelight.yeelib.device.xiaomi.CeilingService$p0 r4 = r0.f13237a
                r4.mo33042a(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.xiaomi.CeilingService.C6932z.onSucceed(com.miot.common.device.invocation.PropertyInfo):void");
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
                MiotManager.getDeviceManipulator().invoke(create, new C6918p(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6904i(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getBright(C6899f0 f0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Bright"), new C6891b0(this, f0Var));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6930x(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getCt(C6901g0 g0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Ct"), new C6893c0(this, g0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getDelayOff(C6903h0 h0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "DelayOff"), new C6895d0(this, h0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowParams(C6905i0 i0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "FlowParams"), new C6897e0(this, i0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowing(C6907j0 j0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Flowing"), new C6900g(this, j0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getLanMode(C6909k0 k0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "LanMode"), new C6888a(this, k0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getMiBandSleep(C6911l0 l0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "MiBandSleep"), new C6898f(this, l0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getNLBright(C6913m0 m0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "NLBright"), new C6894d(this, m0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getNightTimeInfo(C6915n0 n0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "NightTimeInfo"), new C6896e(this, n0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getPower(C6917o0 o0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Power"), new C6889a0(this, o0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getProperties(C6919p0 p0Var) {
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
            MiotManager.getDeviceManipulator().readProperty(create, new C6932z(this, p0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getSaveState(C6921q0 q0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "SaveState"), new C6890b(this, q0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getonFromPower(C6923r0 r0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "onFromPower"), new C6892c(this, r0Var));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6912m(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6906j(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6924s(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6902h(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6929w(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6920q(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6927u(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6922r(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6914n(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6910l(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6926t(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void subscribeNotifications(CompletionHandler completionHandler, C6925s0 s0Var) {
        if (completionHandler == null) {
            throw new IllegalArgumentException("handler is null");
        } else if (s0Var != null) {
            PropertyInfo create = PropertyInfoFactory.create(getService());
            for (Property next : getService().getProperties()) {
                if (next.getDefinition().isNotifiable()) {
                    create.addProperty(next);
                }
            }
            MiotManager.getDeviceManipulator().addPropertyChangedListener(create, new C6908k(this, completionHandler), new C6928v(this, s0Var));
        } else {
            throw new IllegalArgumentException("listener is null");
        }
    }

    public void toggle(CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "toggle");
            if (create != null) {
                MiotManager.getDeviceManipulator().invoke(create, new C6916o(this, completionHandler));
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
            MiotManager.getDeviceManipulator().removePropertyChangedListener(create, new C6931y(this, completionHandler));
            return;
        }
        throw new IllegalArgumentException("handler is null");
    }
}
