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

public class YilaiCeilingService extends AbstractService {
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
    public static final String PROPERTY_FlowCount = "FlowCount";
    public static final String PROPERTY_FlowParams = "FlowParams";
    public static final String PROPERTY_Flowing = "Flowing";
    public static final String PROPERTY_LanMode = "LanMode";
    public static final String PROPERTY_MiBandSleep = "MiBandSleep";
    public static final String PROPERTY_Mode = "Mode";
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
    private static final String TAG = "YilaiCeilingService";
    private AbstractDevice mDevice = null;

    /* renamed from: com.yeelight.yeelib.device.xiaomi.YilaiCeilingService$a */
    class C9711a implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9742p0 f17611a;

        C9711a(YilaiCeilingService yilaiCeilingService, C9742p0 p0Var) {
            this.f17611a = p0Var;
        }

        public void onFailed(int i, String str) {
            this.f17611a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("SaveState");
            if (property.isValueValid()) {
                this.f17611a.mo31579a((Long) propertyInfo.getValue("SaveState"));
                return;
            }
            C9742p0 p0Var = this.f17611a;
            p0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.YilaiCeilingService$a0 */
    class C9712a0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9724g0 f17612a;

        C9712a0(YilaiCeilingService yilaiCeilingService, C9724g0 g0Var) {
            this.f17612a = g0Var;
        }

        public void onFailed(int i, String str) {
            this.f17612a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Ct");
            if (property.isValueValid()) {
                this.f17612a.mo31563a((Long) propertyInfo.getValue("Ct"));
                return;
            }
            C9724g0 g0Var = this.f17612a;
            g0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.YilaiCeilingService$b */
    class C9713b implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9732k0 f17613a;

        C9713b(YilaiCeilingService yilaiCeilingService, C9732k0 k0Var) {
            this.f17613a = k0Var;
        }

        public void onFailed(int i, String str) {
            this.f17613a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("LanMode");
            if (property.isValueValid()) {
                this.f17613a.mo31571a((Long) propertyInfo.getValue("LanMode"));
                return;
            }
            C9732k0 k0Var = this.f17613a;
            k0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.YilaiCeilingService$b0 */
    class C9714b0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9728i0 f17614a;

        C9714b0(YilaiCeilingService yilaiCeilingService, C9728i0 i0Var) {
            this.f17614a = i0Var;
        }

        public void onFailed(int i, String str) {
            this.f17614a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("FlowParams");
            if (property.isValueValid()) {
                this.f17614a.onSucceed((String) propertyInfo.getValue("FlowParams"));
                return;
            }
            C9728i0 i0Var = this.f17614a;
            i0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.YilaiCeilingService$c */
    class C9715c implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9744q0 f17615a;

        C9715c(YilaiCeilingService yilaiCeilingService, C9744q0 q0Var) {
            this.f17615a = q0Var;
        }

        public void onFailed(int i, String str) {
            this.f17615a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("onFromPower");
            if (property.isValueValid()) {
                this.f17615a.mo31581a((Long) propertyInfo.getValue("onFromPower"));
                return;
            }
            C9744q0 q0Var = this.f17615a;
            q0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.YilaiCeilingService$c0 */
    class C9716c0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9726h0 f17616a;

        C9716c0(YilaiCeilingService yilaiCeilingService, C9726h0 h0Var) {
            this.f17616a = h0Var;
        }

        public void onFailed(int i, String str) {
            this.f17616a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("DelayOff");
            if (property.isValueValid()) {
                this.f17616a.mo31565a((Long) propertyInfo.getValue("DelayOff"));
                return;
            }
            C9726h0 h0Var = this.f17616a;
            h0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.YilaiCeilingService$d */
    class C9717d implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9730j0 f17617a;

        C9717d(YilaiCeilingService yilaiCeilingService, C9730j0 j0Var) {
            this.f17617a = j0Var;
        }

        public void onFailed(int i, String str) {
            this.f17617a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Flowing");
            if (property.isValueValid()) {
                this.f17617a.mo31569a((Long) propertyInfo.getValue("Flowing"));
                return;
            }
            C9730j0 j0Var = this.f17617a;
            j0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.YilaiCeilingService$d0 */
    public enum C9718d0 {
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

    /* renamed from: com.yeelight.yeelib.device.xiaomi.YilaiCeilingService$e */
    class C9719e implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9736m0 f17628a;

        C9719e(YilaiCeilingService yilaiCeilingService, C9736m0 m0Var) {
            this.f17628a = m0Var;
        }

        public void onFailed(int i, String str) {
            this.f17628a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("NightTimeInfo");
            if (property.isValueValid()) {
                this.f17628a.onSucceed((String) propertyInfo.getValue("NightTimeInfo"));
                return;
            }
            C9736m0 m0Var = this.f17628a;
            m0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.YilaiCeilingService$e0 */
    public enum C9720e0 {
        undefined,
        smooth,
        sudden
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.YilaiCeilingService$f */
    class C9721f implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9734l0 f17633a;

        C9721f(YilaiCeilingService yilaiCeilingService, C9734l0 l0Var) {
            this.f17633a = l0Var;
        }

        public void onFailed(int i, String str) {
            this.f17633a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("MiBandSleep");
            if (property.isValueValid()) {
                this.f17633a.mo31573a((Long) propertyInfo.getValue("MiBandSleep"));
                return;
            }
            C9734l0 l0Var = this.f17633a;
            l0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.YilaiCeilingService$f0 */
    public interface C9722f0 {
        /* renamed from: a */
        void mo31561a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.YilaiCeilingService$g */
    class C9723g implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17634a;

        C9723g(YilaiCeilingService yilaiCeilingService, CompletionHandler completionHandler) {
            this.f17634a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17634a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17634a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.YilaiCeilingService$g0 */
    public interface C9724g0 {
        /* renamed from: a */
        void mo31563a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.YilaiCeilingService$h */
    class C9725h implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17635a;

        C9725h(YilaiCeilingService yilaiCeilingService, CompletionHandler completionHandler) {
            this.f17635a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17635a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17635a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.YilaiCeilingService$h0 */
    public interface C9726h0 {
        /* renamed from: a */
        void mo31565a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.YilaiCeilingService$i */
    class C9727i implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17636a;

        C9727i(YilaiCeilingService yilaiCeilingService, CompletionHandler completionHandler) {
            this.f17636a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17636a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17636a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.YilaiCeilingService$i0 */
    public interface C9728i0 {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.YilaiCeilingService$j */
    class C9729j implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17637a;

        C9729j(YilaiCeilingService yilaiCeilingService, CompletionHandler completionHandler) {
            this.f17637a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17637a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17637a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.YilaiCeilingService$j0 */
    public interface C9730j0 {
        /* renamed from: a */
        void mo31569a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.YilaiCeilingService$k */
    class C9731k implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17638a;

        C9731k(YilaiCeilingService yilaiCeilingService, CompletionHandler completionHandler) {
            this.f17638a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17638a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f17638a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.YilaiCeilingService$k0 */
    public interface C9732k0 {
        /* renamed from: a */
        void mo31571a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.YilaiCeilingService$l */
    class C9733l implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17639a;

        C9733l(YilaiCeilingService yilaiCeilingService, CompletionHandler completionHandler) {
            this.f17639a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17639a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17639a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.YilaiCeilingService$l0 */
    public interface C9734l0 {
        /* renamed from: a */
        void mo31573a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.YilaiCeilingService$m */
    class C9735m implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17640a;

        C9735m(YilaiCeilingService yilaiCeilingService, CompletionHandler completionHandler) {
            this.f17640a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17640a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17640a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.YilaiCeilingService$m0 */
    public interface C9736m0 {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.YilaiCeilingService$n */
    class C9737n implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17641a;

        C9737n(YilaiCeilingService yilaiCeilingService, CompletionHandler completionHandler) {
            this.f17641a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17641a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17641a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.YilaiCeilingService$n0 */
    public interface C9738n0 {
        /* renamed from: a */
        void mo31577a(C9746r0 r0Var);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.YilaiCeilingService$o */
    class C9739o implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17642a;

        C9739o(YilaiCeilingService yilaiCeilingService, CompletionHandler completionHandler) {
            this.f17642a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17642a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17642a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.YilaiCeilingService$o0 */
    public interface C9740o0 {
        /* renamed from: a */
        void mo28514a(C9746r0 r0Var, Long l, Long l2, String str, Long l3, Long l4, Long l5, Long l6, Long l7, String str2, Long l8);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.YilaiCeilingService$p */
    class C9741p implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17643a;

        C9741p(YilaiCeilingService yilaiCeilingService, CompletionHandler completionHandler) {
            this.f17643a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17643a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17643a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.YilaiCeilingService$p0 */
    public interface C9742p0 {
        /* renamed from: a */
        void mo31579a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.YilaiCeilingService$q */
    class C9743q implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17644a;

        C9743q(YilaiCeilingService yilaiCeilingService, CompletionHandler completionHandler) {
            this.f17644a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17644a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17644a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.YilaiCeilingService$q0 */
    public interface C9744q0 {
        /* renamed from: a */
        void mo31581a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.YilaiCeilingService$r */
    class C9745r implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17645a;

        C9745r(YilaiCeilingService yilaiCeilingService, CompletionHandler completionHandler) {
            this.f17645a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17645a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17645a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.YilaiCeilingService$r0 */
    public enum C9746r0 {
        undefined,
        on,
        off
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.YilaiCeilingService$s */
    class C9747s implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17650a;

        C9747s(YilaiCeilingService yilaiCeilingService, CompletionHandler completionHandler) {
            this.f17650a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17650a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17650a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.YilaiCeilingService$s0 */
    public interface C9748s0 {
        /* renamed from: a */
        void mo28503a(Long l);

        /* renamed from: b */
        void mo28504b(Long l);

        /* renamed from: c */
        void mo28505c(Long l);

        /* renamed from: d */
        void mo28506d(Long l);

        /* renamed from: e */
        void mo28507e(String str);

        /* renamed from: f */
        void mo28508f(Long l);

        /* renamed from: g */
        void mo28509g(Long l);

        /* renamed from: h */
        void mo28510h(Long l);

        /* renamed from: i */
        void mo28511i(String str);

        /* renamed from: j */
        void mo28512j(C9746r0 r0Var);

        /* renamed from: m */
        void mo28513m(Long l);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.YilaiCeilingService$t */
    class C9749t implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17651a;

        C9749t(YilaiCeilingService yilaiCeilingService, CompletionHandler completionHandler) {
            this.f17651a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17651a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17651a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.YilaiCeilingService$u */
    class C9750u implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17652a;

        C9750u(YilaiCeilingService yilaiCeilingService, CompletionHandler completionHandler) {
            this.f17652a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17652a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17652a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.YilaiCeilingService$v */
    class C9751v implements DeviceManipulator.PropertyChangedListener {

        /* renamed from: a */
        final /* synthetic */ C9748s0 f17653a;

        C9751v(YilaiCeilingService yilaiCeilingService, C9748s0 s0Var) {
            this.f17653a = s0Var;
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onPropertyChanged(com.miot.common.device.invocation.PropertyInfo r13, java.lang.String r14) {
            /*
                r12 = this;
                int r0 = r14.hashCode()
                java.lang.String r1 = "Bright"
                java.lang.String r2 = "LanMode"
                java.lang.String r3 = "Flowing"
                java.lang.String r4 = "DelayOff"
                java.lang.String r5 = "Power"
                java.lang.String r6 = "onFromPower"
                java.lang.String r7 = "Ct"
                java.lang.String r8 = "MiBandSleep"
                java.lang.String r9 = "NightTimeInfo"
                java.lang.String r10 = "FlowParams"
                java.lang.String r11 = "SaveState"
                switch(r0) {
                    case -2117953292: goto L_0x0071;
                    case -2002016140: goto L_0x0069;
                    case -1331143373: goto L_0x0060;
                    case -80340154: goto L_0x0057;
                    case 2193: goto L_0x004f;
                    case 35911772: goto L_0x0047;
                    case 77306085: goto L_0x003f;
                    case 880790796: goto L_0x0037;
                    case 898856916: goto L_0x002e;
                    case 1611821756: goto L_0x0026;
                    case 1998035738: goto L_0x001e;
                    default: goto L_0x001d;
                }
            L_0x001d:
                goto L_0x0079
            L_0x001e:
                boolean r14 = r14.equals(r1)
                if (r14 == 0) goto L_0x0079
                r14 = 1
                goto L_0x007a
            L_0x0026:
                boolean r14 = r14.equals(r2)
                if (r14 == 0) goto L_0x0079
                r14 = 6
                goto L_0x007a
            L_0x002e:
                boolean r14 = r14.equals(r3)
                if (r14 == 0) goto L_0x0079
                r14 = 8
                goto L_0x007a
            L_0x0037:
                boolean r14 = r14.equals(r4)
                if (r14 == 0) goto L_0x0079
                r14 = 4
                goto L_0x007a
            L_0x003f:
                boolean r14 = r14.equals(r5)
                if (r14 == 0) goto L_0x0079
                r14 = 0
                goto L_0x007a
            L_0x0047:
                boolean r14 = r14.equals(r6)
                if (r14 == 0) goto L_0x0079
                r14 = 7
                goto L_0x007a
            L_0x004f:
                boolean r14 = r14.equals(r7)
                if (r14 == 0) goto L_0x0079
                r14 = 2
                goto L_0x007a
            L_0x0057:
                boolean r14 = r14.equals(r8)
                if (r14 == 0) goto L_0x0079
                r14 = 10
                goto L_0x007a
            L_0x0060:
                boolean r14 = r14.equals(r9)
                if (r14 == 0) goto L_0x0079
                r14 = 9
                goto L_0x007a
            L_0x0069:
                boolean r14 = r14.equals(r10)
                if (r14 == 0) goto L_0x0079
                r14 = 3
                goto L_0x007a
            L_0x0071:
                boolean r14 = r14.equals(r11)
                if (r14 == 0) goto L_0x0079
                r14 = 5
                goto L_0x007a
            L_0x0079:
                r14 = -1
            L_0x007a:
                switch(r14) {
                    case 0: goto L_0x0161;
                    case 1: goto L_0x014b;
                    case 2: goto L_0x0135;
                    case 3: goto L_0x011f;
                    case 4: goto L_0x0109;
                    case 5: goto L_0x00f2;
                    case 6: goto L_0x00db;
                    case 7: goto L_0x00c4;
                    case 8: goto L_0x00ad;
                    case 9: goto L_0x0096;
                    case 10: goto L_0x007f;
                    default: goto L_0x007d;
                }
            L_0x007d:
                goto L_0x017a
            L_0x007f:
                com.miot.common.property.Property r14 = r13.getProperty(r8)
                boolean r14 = r14.isValueValid()
                if (r14 == 0) goto L_0x017a
                java.lang.Object r13 = r13.getValue(r8)
                java.lang.Long r13 = (java.lang.Long) r13
                com.yeelight.yeelib.device.xiaomi.YilaiCeilingService$s0 r14 = r12.f17653a
                r14.mo28513m(r13)
                goto L_0x017a
            L_0x0096:
                com.miot.common.property.Property r14 = r13.getProperty(r9)
                boolean r14 = r14.isValueValid()
                if (r14 == 0) goto L_0x017a
                java.lang.Object r13 = r13.getValue(r9)
                java.lang.String r13 = (java.lang.String) r13
                com.yeelight.yeelib.device.xiaomi.YilaiCeilingService$s0 r14 = r12.f17653a
                r14.mo28511i(r13)
                goto L_0x017a
            L_0x00ad:
                com.miot.common.property.Property r14 = r13.getProperty(r3)
                boolean r14 = r14.isValueValid()
                if (r14 == 0) goto L_0x017a
                java.lang.Object r13 = r13.getValue(r3)
                java.lang.Long r13 = (java.lang.Long) r13
                com.yeelight.yeelib.device.xiaomi.YilaiCeilingService$s0 r14 = r12.f17653a
                r14.mo28505c(r13)
                goto L_0x017a
            L_0x00c4:
                com.miot.common.property.Property r14 = r13.getProperty(r6)
                boolean r14 = r14.isValueValid()
                if (r14 == 0) goto L_0x017a
                java.lang.Object r13 = r13.getValue(r6)
                java.lang.Long r13 = (java.lang.Long) r13
                com.yeelight.yeelib.device.xiaomi.YilaiCeilingService$s0 r14 = r12.f17653a
                r14.mo28508f(r13)
                goto L_0x017a
            L_0x00db:
                com.miot.common.property.Property r14 = r13.getProperty(r2)
                boolean r14 = r14.isValueValid()
                if (r14 == 0) goto L_0x017a
                java.lang.Object r13 = r13.getValue(r2)
                java.lang.Long r13 = (java.lang.Long) r13
                com.yeelight.yeelib.device.xiaomi.YilaiCeilingService$s0 r14 = r12.f17653a
                r14.mo28509g(r13)
                goto L_0x017a
            L_0x00f2:
                com.miot.common.property.Property r14 = r13.getProperty(r11)
                boolean r14 = r14.isValueValid()
                if (r14 == 0) goto L_0x017a
                java.lang.Object r13 = r13.getValue(r11)
                java.lang.Long r13 = (java.lang.Long) r13
                com.yeelight.yeelib.device.xiaomi.YilaiCeilingService$s0 r14 = r12.f17653a
                r14.mo28506d(r13)
                goto L_0x017a
            L_0x0109:
                com.miot.common.property.Property r14 = r13.getProperty(r4)
                boolean r14 = r14.isValueValid()
                if (r14 == 0) goto L_0x017a
                java.lang.Object r13 = r13.getValue(r4)
                java.lang.Long r13 = (java.lang.Long) r13
                com.yeelight.yeelib.device.xiaomi.YilaiCeilingService$s0 r14 = r12.f17653a
                r14.mo28504b(r13)
                goto L_0x017a
            L_0x011f:
                com.miot.common.property.Property r14 = r13.getProperty(r10)
                boolean r14 = r14.isValueValid()
                if (r14 == 0) goto L_0x017a
                java.lang.Object r13 = r13.getValue(r10)
                java.lang.String r13 = (java.lang.String) r13
                com.yeelight.yeelib.device.xiaomi.YilaiCeilingService$s0 r14 = r12.f17653a
                r14.mo28507e(r13)
                goto L_0x017a
            L_0x0135:
                com.miot.common.property.Property r14 = r13.getProperty(r7)
                boolean r14 = r14.isValueValid()
                if (r14 == 0) goto L_0x017a
                java.lang.Object r13 = r13.getValue(r7)
                java.lang.Long r13 = (java.lang.Long) r13
                com.yeelight.yeelib.device.xiaomi.YilaiCeilingService$s0 r14 = r12.f17653a
                r14.mo28510h(r13)
                goto L_0x017a
            L_0x014b:
                com.miot.common.property.Property r14 = r13.getProperty(r1)
                boolean r14 = r14.isValueValid()
                if (r14 == 0) goto L_0x017a
                java.lang.Object r13 = r13.getValue(r1)
                java.lang.Long r13 = (java.lang.Long) r13
                com.yeelight.yeelib.device.xiaomi.YilaiCeilingService$s0 r14 = r12.f17653a
                r14.mo28503a(r13)
                goto L_0x017a
            L_0x0161:
                com.miot.common.property.Property r14 = r13.getProperty(r5)
                boolean r14 = r14.isValueValid()
                if (r14 == 0) goto L_0x017a
                java.lang.Object r13 = r13.getValue(r5)
                java.lang.String r13 = (java.lang.String) r13
                com.yeelight.yeelib.device.xiaomi.YilaiCeilingService$r0 r13 = com.yeelight.yeelib.device.xiaomi.YilaiCeilingService.C9746r0.valueOf(r13)
                com.yeelight.yeelib.device.xiaomi.YilaiCeilingService$s0 r14 = r12.f17653a
                r14.mo28512j(r13)
            L_0x017a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.xiaomi.YilaiCeilingService.C9751v.onPropertyChanged(com.miot.common.device.invocation.PropertyInfo, java.lang.String):void");
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.YilaiCeilingService$w */
    class C9752w implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17654a;

        C9752w(YilaiCeilingService yilaiCeilingService, CompletionHandler completionHandler) {
            this.f17654a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17654a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f17654a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.YilaiCeilingService$x */
    class C9753x implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9740o0 f17655a;

        C9753x(YilaiCeilingService yilaiCeilingService, C9740o0 o0Var) {
            this.f17655a = o0Var;
        }

        public void onFailed(int i, String str) {
            this.f17655a.onFailed(i, str);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.Long} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onSucceed(com.miot.common.device.invocation.PropertyInfo r17) {
            /*
                r16 = this;
                r0 = r17
                java.lang.String r1 = "Power"
                com.miot.common.property.Property r1 = r0.getProperty(r1)
                boolean r2 = r1.isValueValid()
                r3 = 0
                if (r2 == 0) goto L_0x001b
                java.lang.Object r1 = r1.getValue()
                java.lang.String r1 = (java.lang.String) r1
                com.yeelight.yeelib.device.xiaomi.YilaiCeilingService$r0 r1 = com.yeelight.yeelib.device.xiaomi.YilaiCeilingService.C9746r0.valueOf(r1)
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
                java.lang.String r1 = "FlowParams"
                com.miot.common.property.Property r1 = r0.getProperty(r1)
                boolean r2 = r1.isValueValid()
                if (r2 == 0) goto L_0x005a
                java.lang.Object r1 = r1.getValue()
                java.lang.String r1 = (java.lang.String) r1
                r8 = r1
                goto L_0x005b
            L_0x005a:
                r8 = r3
            L_0x005b:
                java.lang.String r1 = "DelayOff"
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
                java.lang.String r1 = "SaveState"
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
                java.lang.String r1 = "LanMode"
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
                java.lang.String r1 = "Flowing"
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
                com.miot.common.property.Property r0 = r0.getProperty(r1)
                boolean r1 = r0.isValueValid()
                if (r1 == 0) goto L_0x00ec
                java.lang.Object r0 = r0.getValue()
                r3 = r0
                java.lang.Long r3 = (java.lang.Long) r3
            L_0x00ec:
                r0 = r16
                r15 = r3
                com.yeelight.yeelib.device.xiaomi.YilaiCeilingService$o0 r4 = r0.f17655a
                r4.mo28514a(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.xiaomi.YilaiCeilingService.C9753x.onSucceed(com.miot.common.device.invocation.PropertyInfo):void");
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.YilaiCeilingService$y */
    class C9754y implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9738n0 f17656a;

        C9754y(YilaiCeilingService yilaiCeilingService, C9738n0 n0Var) {
            this.f17656a = n0Var;
        }

        public void onFailed(int i, String str) {
            this.f17656a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Power");
            if (property.isValueValid()) {
                this.f17656a.mo31577a(C9746r0.valueOf((String) propertyInfo.getValue("Power")));
                return;
            }
            C9738n0 n0Var = this.f17656a;
            n0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.YilaiCeilingService$z */
    class C9755z implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9722f0 f17657a;

        C9755z(YilaiCeilingService yilaiCeilingService, C9722f0 f0Var) {
            this.f17657a = f0Var;
        }

        public void onFailed(int i, String str) {
            this.f17657a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Bright");
            if (property.isValueValid()) {
                this.f17657a.mo31561a((Long) propertyInfo.getValue("Bright"));
                return;
            }
            C9722f0 f0Var = this.f17657a;
            f0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    public YilaiCeilingService(AbstractDevice abstractDevice) {
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
                MiotManager.getDeviceManipulator().invoke(create, new C9739o(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C9725h(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getBright(C9722f0 f0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Bright"), new C9755z(this, f0Var));
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
                MiotManager.getDeviceManipulator().invoke(create, new C9750u(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getCt(C9724g0 g0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Ct"), new C9712a0(this, g0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getDelayOff(C9726h0 h0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "DelayOff"), new C9716c0(this, h0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowParams(C9728i0 i0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "FlowParams"), new C9714b0(this, i0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowing(C9730j0 j0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Flowing"), new C9717d(this, j0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getLanMode(C9732k0 k0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "LanMode"), new C9713b(this, k0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getMiBandSleep(C9734l0 l0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "MiBandSleep"), new C9721f(this, l0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getNightTimeInfo(C9736m0 m0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "NightTimeInfo"), new C9719e(this, m0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getPower(C9738n0 n0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Power"), new C9754y(this, n0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getProperties(C9740o0 o0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            PropertyInfo create = PropertyInfoFactory.create(getService());
            create.addProperty(getService().getProperty("Power"));
            create.addProperty(getService().getProperty("Bright"));
            create.addProperty(getService().getProperty("Ct"));
            create.addProperty(getService().getProperty("FlowParams"));
            create.addProperty(getService().getProperty("DelayOff"));
            create.addProperty(getService().getProperty("SaveState"));
            create.addProperty(getService().getProperty("LanMode"));
            create.addProperty(getService().getProperty("onFromPower"));
            create.addProperty(getService().getProperty("Flowing"));
            create.addProperty(getService().getProperty("NightTimeInfo"));
            create.addProperty(getService().getProperty("MiBandSleep"));
            MiotManager.getDeviceManipulator().readProperty(create, new C9753x(this, o0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getSaveState(C9742p0 p0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "SaveState"), new C9711a(this, p0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getonFromPower(C9744q0 q0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "onFromPower"), new C9715c(this, q0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void openWithMode(C9746r0 r0Var, C9720e0 e0Var, Long l, Long l2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "openWithMode");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("Power", r0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Effect", e0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Duration", l)) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("Mode", l2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C9733l(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C9727i(this, completionHandler));
                return;
            }
            throw new MiotException("actionInfo is null");
        }
        throw new MiotException("device not configurated connection");
    }

    public void sendCmd(C9718d0 d0Var, String str, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "sendCmd");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("CmdKey", d0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("CmdValue", str)) {
                MiotManager.getDeviceManipulator().invoke(create, new C9743q(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setBright(Long l, C9720e0 e0Var, Long l2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setBright");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("Bright", l)) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Effect", e0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("Duration", l2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C9723g(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setCt(Long l, C9720e0 e0Var, Long l2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setCt");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("Ct", l)) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Effect", e0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("Duration", l2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C9749t(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C9741p(this, completionHandler));
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
            } else if (!create.setArgumentValue("FlowCount", l)) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("ParamFinish", l2)) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("ParamColors", str2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C9747s(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setPower(C9746r0 r0Var, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setPower");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (create.setArgumentValue("Power", r0Var.toString())) {
                MiotManager.getDeviceManipulator().invoke(create, new C9735m(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C9729j(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C9745r(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void subscribeNotifications(CompletionHandler completionHandler, C9748s0 s0Var) {
        if (completionHandler == null) {
            throw new IllegalArgumentException("handler is null");
        } else if (s0Var != null) {
            PropertyInfo create = PropertyInfoFactory.create(getService());
            for (Property next : getService().getProperties()) {
                if (next.getDefinition().isNotifiable()) {
                    create.addProperty(next);
                }
            }
            MiotManager.getDeviceManipulator().addPropertyChangedListener(create, new C9731k(this, completionHandler), new C9751v(this, s0Var));
        } else {
            throw new IllegalArgumentException("listener is null");
        }
    }

    public void toggle(CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "toggle");
            if (create != null) {
                MiotManager.getDeviceManipulator().invoke(create, new C9737n(this, completionHandler));
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
            MiotManager.getDeviceManipulator().removePropertyChangedListener(create, new C9752w(this, completionHandler));
            return;
        }
        throw new IllegalArgumentException("handler is null");
    }
}
