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

public class Lamp9Service extends AbstractService {
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
    public static final String ACTION_setNLScene = "setNLScene";
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
    public static final String PROPERTY_LanMode = "LanMode";
    public static final String PROPERTY_Mode = "Mode";
    public static final String PROPERTY_NLBright = "NLBright";
    public static final String PROPERTY_NightTimeInfo = "NightTimeInfo";
    public static final String PROPERTY_ParamColors = "ParamColors";
    public static final String PROPERTY_ParamCount = "ParamCount";
    public static final String PROPERTY_ParamFinish = "ParamFinish";
    public static final String PROPERTY_ParamModel = "ParamModel";
    public static final String PROPERTY_Power = "Power";
    public static final String PROPERTY_SaveState = "SaveState";
    public static final String PROPERTY_onFromPower = "onFromPower";
    private static final String TAG = "Lamp9Service";
    private AbstractDevice mDevice = null;

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp9Service$a */
    class C9115a implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9140m0 f17057a;

        C9115a(Lamp9Service lamp9Service, C9140m0 m0Var) {
            this.f17057a = m0Var;
        }

        public void onFailed(int i, String str) {
            this.f17057a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("LanMode");
            if (property.isValueValid()) {
                this.f17057a.mo30802a((Long) propertyInfo.getValue("LanMode"));
                return;
            }
            C9140m0 m0Var = this.f17057a;
            m0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp9Service$a0 */
    class C9116a0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9128g0 f17058a;

        C9116a0(Lamp9Service lamp9Service, C9128g0 g0Var) {
            this.f17058a = g0Var;
        }

        public void onFailed(int i, String str) {
            this.f17058a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Bright");
            if (property.isValueValid()) {
                this.f17058a.mo30790a((Long) propertyInfo.getValue("Bright"));
                return;
            }
            C9128g0 g0Var = this.f17058a;
            g0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp9Service$b */
    class C9117b implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9150r0 f17059a;

        C9117b(Lamp9Service lamp9Service, C9150r0 r0Var) {
            this.f17059a = r0Var;
        }

        public void onFailed(int i, String str) {
            this.f17059a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("SaveState");
            if (property.isValueValid()) {
                this.f17059a.mo30810a((Long) propertyInfo.getValue("SaveState"));
                return;
            }
            C9150r0 r0Var = this.f17059a;
            r0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp9Service$b0 */
    class C9118b0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9130h0 f17060a;

        C9118b0(Lamp9Service lamp9Service, C9130h0 h0Var) {
            this.f17060a = h0Var;
        }

        public void onFailed(int i, String str) {
            this.f17060a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Ct");
            if (property.isValueValid()) {
                this.f17060a.mo30792a((Long) propertyInfo.getValue("Ct"));
                return;
            }
            C9130h0 h0Var = this.f17060a;
            h0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp9Service$c */
    class C9119c implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9152s0 f17061a;

        C9119c(Lamp9Service lamp9Service, C9152s0 s0Var) {
            this.f17061a = s0Var;
        }

        public void onFailed(int i, String str) {
            this.f17061a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("onFromPower");
            if (property.isValueValid()) {
                this.f17061a.mo30812a((Long) propertyInfo.getValue("onFromPower"));
                return;
            }
            C9152s0 s0Var = this.f17061a;
            s0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp9Service$c0 */
    class C9120c0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9134j0 f17062a;

        C9120c0(Lamp9Service lamp9Service, C9134j0 j0Var) {
            this.f17062a = j0Var;
        }

        public void onFailed(int i, String str) {
            this.f17062a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("DelayOff");
            if (property.isValueValid()) {
                this.f17062a.mo30796a((Long) propertyInfo.getValue("DelayOff"));
                return;
            }
            C9134j0 j0Var = this.f17062a;
            j0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp9Service$d */
    class C9121d implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9138l0 f17063a;

        C9121d(Lamp9Service lamp9Service, C9138l0 l0Var) {
            this.f17063a = l0Var;
        }

        public void onFailed(int i, String str) {
            this.f17063a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Flowing");
            if (property.isValueValid()) {
                this.f17063a.mo30800a((Long) propertyInfo.getValue("Flowing"));
                return;
            }
            C9138l0 l0Var = this.f17063a;
            l0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp9Service$d0 */
    class C9122d0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9136k0 f17064a;

        C9122d0(Lamp9Service lamp9Service, C9136k0 k0Var) {
            this.f17064a = k0Var;
        }

        public void onFailed(int i, String str) {
            this.f17064a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("FlowParams");
            if (property.isValueValid()) {
                this.f17064a.onSucceed((String) propertyInfo.getValue("FlowParams"));
                return;
            }
            C9136k0 k0Var = this.f17064a;
            k0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp9Service$e */
    class C9123e implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9144o0 f17065a;

        C9123e(Lamp9Service lamp9Service, C9144o0 o0Var) {
            this.f17065a = o0Var;
        }

        public void onFailed(int i, String str) {
            this.f17065a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("NightTimeInfo");
            if (property.isValueValid()) {
                this.f17065a.onSucceed((String) propertyInfo.getValue("NightTimeInfo"));
                return;
            }
            C9144o0 o0Var = this.f17065a;
            o0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp9Service$e0 */
    public enum C9124e0 {
        undefined,
        cfg_pomodoro,
        cfg_kidmode,
        cfg_lan_ctrl,
        cfg_save_state,
        cfg_shortkey,
        cfg_init_power,
        nighttime
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp9Service$f */
    class C9125f implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9142n0 f17075a;

        C9125f(Lamp9Service lamp9Service, C9142n0 n0Var) {
            this.f17075a = n0Var;
        }

        public void onFailed(int i, String str) {
            this.f17075a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("NLBright");
            if (property.isValueValid()) {
                this.f17075a.mo30804a((Long) propertyInfo.getValue("NLBright"));
                return;
            }
            C9142n0 n0Var = this.f17075a;
            n0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp9Service$f0 */
    public enum C9126f0 {
        undefined,
        smooth,
        sudden
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp9Service$g */
    class C9127g implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17080a;

        C9127g(Lamp9Service lamp9Service, CompletionHandler completionHandler) {
            this.f17080a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17080a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17080a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp9Service$g0 */
    public interface C9128g0 {
        /* renamed from: a */
        void mo30790a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp9Service$h */
    class C9129h implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17081a;

        C9129h(Lamp9Service lamp9Service, CompletionHandler completionHandler) {
            this.f17081a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17081a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17081a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp9Service$h0 */
    public interface C9130h0 {
        /* renamed from: a */
        void mo30792a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp9Service$i */
    class C9131i implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17082a;

        C9131i(Lamp9Service lamp9Service, CompletionHandler completionHandler) {
            this.f17082a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17082a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17082a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp9Service$i0 */
    public interface C9132i0 {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp9Service$j */
    class C9133j implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17083a;

        C9133j(Lamp9Service lamp9Service, CompletionHandler completionHandler) {
            this.f17083a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17083a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17083a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp9Service$j0 */
    public interface C9134j0 {
        /* renamed from: a */
        void mo30796a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp9Service$k */
    class C9135k implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17084a;

        C9135k(Lamp9Service lamp9Service, CompletionHandler completionHandler) {
            this.f17084a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17084a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f17084a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp9Service$k0 */
    public interface C9136k0 {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp9Service$l */
    class C9137l implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17085a;

        C9137l(Lamp9Service lamp9Service, CompletionHandler completionHandler) {
            this.f17085a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17085a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17085a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp9Service$l0 */
    public interface C9138l0 {
        /* renamed from: a */
        void mo30800a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp9Service$m */
    class C9139m implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17086a;

        C9139m(Lamp9Service lamp9Service, CompletionHandler completionHandler) {
            this.f17086a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17086a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17086a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp9Service$m0 */
    public interface C9140m0 {
        /* renamed from: a */
        void mo30802a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp9Service$n */
    class C9141n implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17087a;

        C9141n(Lamp9Service lamp9Service, CompletionHandler completionHandler) {
            this.f17087a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17087a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17087a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp9Service$n0 */
    public interface C9142n0 {
        /* renamed from: a */
        void mo30804a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp9Service$o */
    class C9143o implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17088a;

        C9143o(Lamp9Service lamp9Service, CompletionHandler completionHandler) {
            this.f17088a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17088a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17088a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp9Service$o0 */
    public interface C9144o0 {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp9Service$p */
    class C9145p implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17089a;

        C9145p(Lamp9Service lamp9Service, CompletionHandler completionHandler) {
            this.f17089a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17089a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17089a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp9Service$p0 */
    public interface C9146p0 {
        /* renamed from: a */
        void mo30808a(C9154t0 t0Var);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp9Service$q */
    class C9147q implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17090a;

        C9147q(Lamp9Service lamp9Service, CompletionHandler completionHandler) {
            this.f17090a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17090a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17090a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp9Service$q0 */
    public interface C9148q0 {
        /* renamed from: a */
        void mo28422a(C9154t0 t0Var, Long l, Long l2, Long l3, String str, Long l4, Long l5, Long l6, Long l7, String str2, Long l8);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp9Service$r */
    class C9149r implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17091a;

        C9149r(Lamp9Service lamp9Service, CompletionHandler completionHandler) {
            this.f17091a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17091a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17091a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp9Service$r0 */
    public interface C9150r0 {
        /* renamed from: a */
        void mo30810a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp9Service$s */
    class C9151s implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17092a;

        C9151s(Lamp9Service lamp9Service, CompletionHandler completionHandler) {
            this.f17092a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17092a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17092a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp9Service$s0 */
    public interface C9152s0 {
        /* renamed from: a */
        void mo30812a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp9Service$t */
    class C9153t implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17093a;

        C9153t(Lamp9Service lamp9Service, CompletionHandler completionHandler) {
            this.f17093a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17093a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17093a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp9Service$t0 */
    public enum C9154t0 {
        undefined,
        on,
        off
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp9Service$u */
    class C9155u implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17098a;

        C9155u(Lamp9Service lamp9Service, CompletionHandler completionHandler) {
            this.f17098a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17098a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17098a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp9Service$u0 */
    public interface C9156u0 {
        /* renamed from: a */
        void mo28411a(Long l);

        /* renamed from: b */
        void mo28412b(Long l);

        /* renamed from: c */
        void mo28413c(Long l);

        /* renamed from: d */
        void mo28414d(Long l);

        /* renamed from: e */
        void mo28415e(String str);

        /* renamed from: f */
        void mo28416f(Long l);

        /* renamed from: g */
        void mo28417g(Long l);

        /* renamed from: h */
        void mo28418h(Long l);

        /* renamed from: i */
        void mo28419i(String str);

        /* renamed from: j */
        void mo28420j(C9154t0 t0Var);

        /* renamed from: k */
        void mo28421k(Long l);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp9Service$v */
    class C9157v implements DeviceManipulator.PropertyChangedListener {

        /* renamed from: a */
        final /* synthetic */ C9156u0 f17099a;

        C9157v(Lamp9Service lamp9Service, C9156u0 u0Var) {
            this.f17099a = u0Var;
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
                java.lang.String r8 = "NLBright"
                java.lang.String r9 = "NightTimeInfo"
                java.lang.String r10 = "FlowParams"
                java.lang.String r11 = "SaveState"
                switch(r0) {
                    case -2117953292: goto L_0x0071;
                    case -2002016140: goto L_0x0069;
                    case -1331143373: goto L_0x0060;
                    case -770908584: goto L_0x0057;
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
                r14 = 5
                goto L_0x007a
            L_0x002e:
                boolean r14 = r14.equals(r3)
                if (r14 == 0) goto L_0x0079
                r14 = 8
                goto L_0x007a
            L_0x0037:
                boolean r14 = r14.equals(r4)
                if (r14 == 0) goto L_0x0079
                r14 = 3
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
                r14 = 4
                goto L_0x007a
            L_0x0071:
                boolean r14 = r14.equals(r11)
                if (r14 == 0) goto L_0x0079
                r14 = 6
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
                com.yeelight.yeelib.device.xiaomi.Lamp9Service$u0 r14 = r12.f17099a
                r14.mo28421k(r13)
                goto L_0x017a
            L_0x0096:
                com.miot.common.property.Property r14 = r13.getProperty(r9)
                boolean r14 = r14.isValueValid()
                if (r14 == 0) goto L_0x017a
                java.lang.Object r13 = r13.getValue(r9)
                java.lang.String r13 = (java.lang.String) r13
                com.yeelight.yeelib.device.xiaomi.Lamp9Service$u0 r14 = r12.f17099a
                r14.mo28419i(r13)
                goto L_0x017a
            L_0x00ad:
                com.miot.common.property.Property r14 = r13.getProperty(r3)
                boolean r14 = r14.isValueValid()
                if (r14 == 0) goto L_0x017a
                java.lang.Object r13 = r13.getValue(r3)
                java.lang.Long r13 = (java.lang.Long) r13
                com.yeelight.yeelib.device.xiaomi.Lamp9Service$u0 r14 = r12.f17099a
                r14.mo28413c(r13)
                goto L_0x017a
            L_0x00c4:
                com.miot.common.property.Property r14 = r13.getProperty(r6)
                boolean r14 = r14.isValueValid()
                if (r14 == 0) goto L_0x017a
                java.lang.Object r13 = r13.getValue(r6)
                java.lang.Long r13 = (java.lang.Long) r13
                com.yeelight.yeelib.device.xiaomi.Lamp9Service$u0 r14 = r12.f17099a
                r14.mo28416f(r13)
                goto L_0x017a
            L_0x00db:
                com.miot.common.property.Property r14 = r13.getProperty(r11)
                boolean r14 = r14.isValueValid()
                if (r14 == 0) goto L_0x017a
                java.lang.Object r13 = r13.getValue(r11)
                java.lang.Long r13 = (java.lang.Long) r13
                com.yeelight.yeelib.device.xiaomi.Lamp9Service$u0 r14 = r12.f17099a
                r14.mo28414d(r13)
                goto L_0x017a
            L_0x00f2:
                com.miot.common.property.Property r14 = r13.getProperty(r2)
                boolean r14 = r14.isValueValid()
                if (r14 == 0) goto L_0x017a
                java.lang.Object r13 = r13.getValue(r2)
                java.lang.Long r13 = (java.lang.Long) r13
                com.yeelight.yeelib.device.xiaomi.Lamp9Service$u0 r14 = r12.f17099a
                r14.mo28417g(r13)
                goto L_0x017a
            L_0x0109:
                com.miot.common.property.Property r14 = r13.getProperty(r10)
                boolean r14 = r14.isValueValid()
                if (r14 == 0) goto L_0x017a
                java.lang.Object r13 = r13.getValue(r10)
                java.lang.String r13 = (java.lang.String) r13
                com.yeelight.yeelib.device.xiaomi.Lamp9Service$u0 r14 = r12.f17099a
                r14.mo28415e(r13)
                goto L_0x017a
            L_0x011f:
                com.miot.common.property.Property r14 = r13.getProperty(r4)
                boolean r14 = r14.isValueValid()
                if (r14 == 0) goto L_0x017a
                java.lang.Object r13 = r13.getValue(r4)
                java.lang.Long r13 = (java.lang.Long) r13
                com.yeelight.yeelib.device.xiaomi.Lamp9Service$u0 r14 = r12.f17099a
                r14.mo28412b(r13)
                goto L_0x017a
            L_0x0135:
                com.miot.common.property.Property r14 = r13.getProperty(r7)
                boolean r14 = r14.isValueValid()
                if (r14 == 0) goto L_0x017a
                java.lang.Object r13 = r13.getValue(r7)
                java.lang.Long r13 = (java.lang.Long) r13
                com.yeelight.yeelib.device.xiaomi.Lamp9Service$u0 r14 = r12.f17099a
                r14.mo28418h(r13)
                goto L_0x017a
            L_0x014b:
                com.miot.common.property.Property r14 = r13.getProperty(r1)
                boolean r14 = r14.isValueValid()
                if (r14 == 0) goto L_0x017a
                java.lang.Object r13 = r13.getValue(r1)
                java.lang.Long r13 = (java.lang.Long) r13
                com.yeelight.yeelib.device.xiaomi.Lamp9Service$u0 r14 = r12.f17099a
                r14.mo28411a(r13)
                goto L_0x017a
            L_0x0161:
                com.miot.common.property.Property r14 = r13.getProperty(r5)
                boolean r14 = r14.isValueValid()
                if (r14 == 0) goto L_0x017a
                java.lang.Object r13 = r13.getValue(r5)
                java.lang.String r13 = (java.lang.String) r13
                com.yeelight.yeelib.device.xiaomi.Lamp9Service$t0 r13 = com.yeelight.yeelib.device.xiaomi.Lamp9Service.C9154t0.valueOf(r13)
                com.yeelight.yeelib.device.xiaomi.Lamp9Service$u0 r14 = r12.f17099a
                r14.mo28420j(r13)
            L_0x017a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.xiaomi.Lamp9Service.C9157v.onPropertyChanged(com.miot.common.device.invocation.PropertyInfo, java.lang.String):void");
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp9Service$w */
    class C9158w implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9132i0 f17100a;

        C9158w(Lamp9Service lamp9Service, C9132i0 i0Var) {
            this.f17100a = i0Var;
        }

        public void onFailed(int i, String str) {
            this.f17100a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            Object argumentValue = actionInfo.getArgumentValue("CmdResp");
            this.f17100a.onSucceed(argumentValue != null ? (String) argumentValue : null);
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp9Service$x */
    class C9159x implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17101a;

        C9159x(Lamp9Service lamp9Service, CompletionHandler completionHandler) {
            this.f17101a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17101a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f17101a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp9Service$y */
    class C9160y implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9148q0 f17102a;

        C9160y(Lamp9Service lamp9Service, C9148q0 q0Var) {
            this.f17102a = q0Var;
        }

        public void onFailed(int i, String str) {
            this.f17102a.onFailed(i, str);
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
                com.yeelight.yeelib.device.xiaomi.Lamp9Service$t0 r1 = com.yeelight.yeelib.device.xiaomi.Lamp9Service.C9154t0.valueOf(r1)
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
                java.lang.String r1 = "NLBright"
                com.miot.common.property.Property r0 = r0.getProperty(r1)
                boolean r1 = r0.isValueValid()
                if (r1 == 0) goto L_0x00ec
                java.lang.Object r0 = r0.getValue()
                r3 = r0
                java.lang.Long r3 = (java.lang.Long) r3
            L_0x00ec:
                r0 = r16
                r15 = r3
                com.yeelight.yeelib.device.xiaomi.Lamp9Service$q0 r4 = r0.f17102a
                r4.mo28422a(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.xiaomi.Lamp9Service.C9160y.onSucceed(com.miot.common.device.invocation.PropertyInfo):void");
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp9Service$z */
    class C9161z implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9146p0 f17103a;

        C9161z(Lamp9Service lamp9Service, C9146p0 p0Var) {
            this.f17103a = p0Var;
        }

        public void onFailed(int i, String str) {
            this.f17103a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Power");
            if (property.isValueValid()) {
                this.f17103a.mo30808a(C9154t0.valueOf((String) propertyInfo.getValue("Power")));
                return;
            }
            C9146p0 p0Var = this.f17103a;
            p0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    public Lamp9Service(AbstractDevice abstractDevice) {
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
                MiotManager.getDeviceManipulator().invoke(create, new C9143o(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C9129h(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getBright(C9128g0 g0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Bright"), new C9116a0(this, g0Var));
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
                MiotManager.getDeviceManipulator().invoke(create, new C9155u(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getCt(C9130h0 h0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Ct"), new C9118b0(this, h0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getData(C9124e0 e0Var, String str, C9132i0 i0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "getData");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("CmdKey", e0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("CmdValue", str)) {
                MiotManager.getDeviceManipulator().invoke(create, new C9158w(this, i0Var));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getDelayOff(C9134j0 j0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "DelayOff"), new C9120c0(this, j0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowParams(C9136k0 k0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "FlowParams"), new C9122d0(this, k0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowing(C9138l0 l0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Flowing"), new C9121d(this, l0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getLanMode(C9140m0 m0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "LanMode"), new C9115a(this, m0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getNLBright(C9142n0 n0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "NLBright"), new C9125f(this, n0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getNightTimeInfo(C9144o0 o0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "NightTimeInfo"), new C9123e(this, o0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getPower(C9146p0 p0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Power"), new C9161z(this, p0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getProperties(C9148q0 q0Var) {
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
            create.addProperty(getService().getProperty("Flowing"));
            create.addProperty(getService().getProperty("NightTimeInfo"));
            create.addProperty(getService().getProperty("NLBright"));
            MiotManager.getDeviceManipulator().readProperty(create, new C9160y(this, q0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getSaveState(C9150r0 r0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "SaveState"), new C9117b(this, r0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getonFromPower(C9152s0 s0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "onFromPower"), new C9119c(this, s0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void openWithMode(C9154t0 t0Var, C9126f0 f0Var, Long l, Long l2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "openWithMode");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("Power", t0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Effect", f0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Duration", l)) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("Mode", l2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C9137l(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C9131i(this, completionHandler));
                return;
            }
            throw new MiotException("actionInfo is null");
        }
        throw new MiotException("device not configurated connection");
    }

    public void sendCmd(C9124e0 e0Var, String str, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "sendCmd");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("CmdKey", e0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("CmdValue", str)) {
                MiotManager.getDeviceManipulator().invoke(create, new C9147q(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setBright(Long l, C9126f0 f0Var, Long l2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setBright");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("Bright", l)) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Effect", f0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("Duration", l2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C9127g(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setCt(Long l, C9126f0 f0Var, Long l2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setCt");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("Ct", l)) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Effect", f0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("Duration", l2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C9153t(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C9145p(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C9151s(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C9149r(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setPower(C9154t0 t0Var, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setPower");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (create.setArgumentValue("Power", t0Var.toString())) {
                MiotManager.getDeviceManipulator().invoke(create, new C9139m(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C9133j(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void subscribeNotifications(CompletionHandler completionHandler, C9156u0 u0Var) {
        if (completionHandler == null) {
            throw new IllegalArgumentException("handler is null");
        } else if (u0Var != null) {
            PropertyInfo create = PropertyInfoFactory.create(getService());
            for (Property next : getService().getProperties()) {
                if (next.getDefinition().isNotifiable()) {
                    create.addProperty(next);
                }
            }
            MiotManager.getDeviceManipulator().addPropertyChangedListener(create, new C9135k(this, completionHandler), new C9157v(this, u0Var));
        } else {
            throw new IllegalArgumentException("listener is null");
        }
    }

    public void toggle(CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "toggle");
            if (create != null) {
                MiotManager.getDeviceManipulator().invoke(create, new C9141n(this, completionHandler));
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
            MiotManager.getDeviceManipulator().removePropertyChangedListener(create, new C9159x(this, completionHandler));
            return;
        }
        throw new IllegalArgumentException("handler is null");
    }
}
