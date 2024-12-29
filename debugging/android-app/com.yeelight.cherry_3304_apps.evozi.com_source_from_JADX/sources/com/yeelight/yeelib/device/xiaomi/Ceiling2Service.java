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

public class Ceiling2Service extends AbstractService {
    public static final String ACTION_addCron = "addCron";
    public static final String ACTION_delCron = "delCron";
    public static final String ACTION_getCron = "getCron";
    public static final String ACTION_openWithMode = "openWithMode";
    public static final String ACTION_restore = "restore";
    public static final String ACTION_sendCmd = "sendCmd";
    public static final String ACTION_setBright = "setBright";
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
    private static final String TAG = "Ceiling2Service";
    private AbstractDevice mDevice = null;

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling2Service$a */
    class C8078a implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8109p0 f16050a;

        C8078a(Ceiling2Service ceiling2Service, C8109p0 p0Var) {
            this.f16050a = p0Var;
        }

        public void onFailed(int i, String str) {
            this.f16050a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("SaveState");
            if (property.isValueValid()) {
                this.f16050a.mo29622a((Long) propertyInfo.getValue("SaveState"));
                return;
            }
            C8109p0 p0Var = this.f16050a;
            p0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling2Service$a0 */
    class C8079a0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8091g0 f16051a;

        C8079a0(Ceiling2Service ceiling2Service, C8091g0 g0Var) {
            this.f16051a = g0Var;
        }

        public void onFailed(int i, String str) {
            this.f16051a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("DelayOff");
            if (property.isValueValid()) {
                this.f16051a.mo29606a((Long) propertyInfo.getValue("DelayOff"));
                return;
            }
            C8091g0 g0Var = this.f16051a;
            g0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling2Service$b */
    class C8080b implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8111q0 f16052a;

        C8080b(Ceiling2Service ceiling2Service, C8111q0 q0Var) {
            this.f16052a = q0Var;
        }

        public void onFailed(int i, String str) {
            this.f16052a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("onFromPower");
            if (property.isValueValid()) {
                this.f16052a.mo29624a((Long) propertyInfo.getValue("onFromPower"));
                return;
            }
            C8111q0 q0Var = this.f16052a;
            q0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling2Service$b0 */
    class C8081b0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8093h0 f16053a;

        C8081b0(Ceiling2Service ceiling2Service, C8093h0 h0Var) {
            this.f16053a = h0Var;
        }

        public void onFailed(int i, String str) {
            this.f16053a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("FlowParams");
            if (property.isValueValid()) {
                this.f16053a.onSucceed((String) propertyInfo.getValue("FlowParams"));
                return;
            }
            C8093h0 h0Var = this.f16053a;
            h0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling2Service$c */
    class C8082c implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8101l0 f16054a;

        C8082c(Ceiling2Service ceiling2Service, C8101l0 l0Var) {
            this.f16054a = l0Var;
        }

        public void onFailed(int i, String str) {
            this.f16054a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("NLBright");
            if (property.isValueValid()) {
                this.f16054a.mo29616a((Long) propertyInfo.getValue("NLBright"));
                return;
            }
            C8101l0 l0Var = this.f16054a;
            l0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling2Service$c0 */
    class C8083c0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8097j0 f16055a;

        C8083c0(Ceiling2Service ceiling2Service, C8097j0 j0Var) {
            this.f16055a = j0Var;
        }

        public void onFailed(int i, String str) {
            this.f16055a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("LanMode");
            if (property.isValueValid()) {
                this.f16055a.mo29612a((Long) propertyInfo.getValue("LanMode"));
                return;
            }
            C8097j0 j0Var = this.f16055a;
            j0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling2Service$d */
    class C8084d implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8103m0 f16056a;

        C8084d(Ceiling2Service ceiling2Service, C8103m0 m0Var) {
            this.f16056a = m0Var;
        }

        public void onFailed(int i, String str) {
            this.f16056a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("NightTimeInfo");
            if (property.isValueValid()) {
                this.f16056a.onSucceed((String) propertyInfo.getValue("NightTimeInfo"));
                return;
            }
            C8103m0 m0Var = this.f16056a;
            m0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling2Service$d0 */
    public enum C8085d0 {
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

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling2Service$e */
    class C8086e implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8099k0 f16067a;

        C8086e(Ceiling2Service ceiling2Service, C8099k0 k0Var) {
            this.f16067a = k0Var;
        }

        public void onFailed(int i, String str) {
            this.f16067a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("MiBandSleep");
            if (property.isValueValid()) {
                this.f16067a.mo29614a((Long) propertyInfo.getValue("MiBandSleep"));
                return;
            }
            C8099k0 k0Var = this.f16067a;
            k0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling2Service$e0 */
    public enum C8087e0 {
        undefined,
        smooth,
        sudden
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling2Service$f */
    class C8088f implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8095i0 f16072a;

        C8088f(Ceiling2Service ceiling2Service, C8095i0 i0Var) {
            this.f16072a = i0Var;
        }

        public void onFailed(int i, String str) {
            this.f16072a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Flowing");
            if (property.isValueValid()) {
                this.f16072a.mo29610a((Long) propertyInfo.getValue("Flowing"));
                return;
            }
            C8095i0 i0Var = this.f16072a;
            i0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling2Service$f0 */
    public interface C8089f0 {
        /* renamed from: a */
        void mo29604a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling2Service$g */
    class C8090g implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16073a;

        C8090g(Ceiling2Service ceiling2Service, CompletionHandler completionHandler) {
            this.f16073a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16073a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16073a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling2Service$g0 */
    public interface C8091g0 {
        /* renamed from: a */
        void mo29606a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling2Service$h */
    class C8092h implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16074a;

        C8092h(Ceiling2Service ceiling2Service, CompletionHandler completionHandler) {
            this.f16074a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16074a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16074a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling2Service$h0 */
    public interface C8093h0 {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling2Service$i */
    class C8094i implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16075a;

        C8094i(Ceiling2Service ceiling2Service, CompletionHandler completionHandler) {
            this.f16075a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16075a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16075a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling2Service$i0 */
    public interface C8095i0 {
        /* renamed from: a */
        void mo29610a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling2Service$j */
    class C8096j implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16076a;

        C8096j(Ceiling2Service ceiling2Service, CompletionHandler completionHandler) {
            this.f16076a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16076a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16076a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling2Service$j0 */
    public interface C8097j0 {
        /* renamed from: a */
        void mo29612a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling2Service$k */
    class C8098k implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16077a;

        C8098k(Ceiling2Service ceiling2Service, CompletionHandler completionHandler) {
            this.f16077a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16077a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f16077a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling2Service$k0 */
    public interface C8099k0 {
        /* renamed from: a */
        void mo29614a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling2Service$l */
    class C8100l implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16078a;

        C8100l(Ceiling2Service ceiling2Service, CompletionHandler completionHandler) {
            this.f16078a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16078a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16078a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling2Service$l0 */
    public interface C8101l0 {
        /* renamed from: a */
        void mo29616a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling2Service$m */
    class C8102m implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16079a;

        C8102m(Ceiling2Service ceiling2Service, CompletionHandler completionHandler) {
            this.f16079a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16079a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16079a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling2Service$m0 */
    public interface C8103m0 {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling2Service$n */
    class C8104n implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16080a;

        C8104n(Ceiling2Service ceiling2Service, CompletionHandler completionHandler) {
            this.f16080a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16080a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16080a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling2Service$n0 */
    public interface C8105n0 {
        /* renamed from: a */
        void mo29620a(C8113r0 r0Var);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling2Service$o */
    class C8106o implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16081a;

        C8106o(Ceiling2Service ceiling2Service, CompletionHandler completionHandler) {
            this.f16081a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16081a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16081a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling2Service$o0 */
    public interface C8107o0 {
        /* renamed from: a */
        void mo28451a(C8113r0 r0Var, Long l, Long l2, String str, Long l3, Long l4, Long l5, Long l6, String str2, Long l7, Long l8);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling2Service$p */
    class C8108p implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16082a;

        C8108p(Ceiling2Service ceiling2Service, CompletionHandler completionHandler) {
            this.f16082a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16082a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16082a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling2Service$p0 */
    public interface C8109p0 {
        /* renamed from: a */
        void mo29622a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling2Service$q */
    class C8110q implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16083a;

        C8110q(Ceiling2Service ceiling2Service, CompletionHandler completionHandler) {
            this.f16083a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16083a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16083a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling2Service$q0 */
    public interface C8111q0 {
        /* renamed from: a */
        void mo29624a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling2Service$r */
    class C8112r implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16084a;

        C8112r(Ceiling2Service ceiling2Service, CompletionHandler completionHandler) {
            this.f16084a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16084a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16084a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling2Service$r0 */
    public enum C8113r0 {
        undefined,
        on,
        off
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling2Service$s */
    class C8114s implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16089a;

        C8114s(Ceiling2Service ceiling2Service, CompletionHandler completionHandler) {
            this.f16089a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16089a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16089a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling2Service$s0 */
    public interface C8115s0 {
        /* renamed from: a */
        void mo28440a(Long l);

        /* renamed from: b */
        void mo28441b(Long l);

        /* renamed from: c */
        void mo28442c(Long l);

        /* renamed from: d */
        void mo28443d(Long l);

        /* renamed from: e */
        void mo28444e(String str);

        /* renamed from: f */
        void mo28445f(Long l);

        /* renamed from: g */
        void mo28446g(Long l);

        /* renamed from: h */
        void mo28447h(C8113r0 r0Var);

        /* renamed from: i */
        void mo28448i(String str);

        /* renamed from: k */
        void mo28449k(Long l);

        /* renamed from: m */
        void mo28450m(Long l);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling2Service$t */
    class C8116t implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16090a;

        C8116t(Ceiling2Service ceiling2Service, CompletionHandler completionHandler) {
            this.f16090a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16090a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16090a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling2Service$u */
    class C8117u implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16091a;

        C8117u(Ceiling2Service ceiling2Service, CompletionHandler completionHandler) {
            this.f16091a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16091a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16091a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling2Service$v */
    class C8118v implements DeviceManipulator.PropertyChangedListener {

        /* renamed from: a */
        final /* synthetic */ C8115s0 f16092a;

        C8118v(Ceiling2Service ceiling2Service, C8115s0 s0Var) {
            this.f16092a = s0Var;
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
                java.lang.String r7 = "MiBandSleep"
                java.lang.String r8 = "NLBright"
                java.lang.String r9 = "NightTimeInfo"
                java.lang.String r10 = "FlowParams"
                java.lang.String r11 = "SaveState"
                switch(r0) {
                    case -2117953292: goto L_0x0071;
                    case -2002016140: goto L_0x0069;
                    case -1331143373: goto L_0x0060;
                    case -770908584: goto L_0x0058;
                    case -80340154: goto L_0x004f;
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
                r14 = 4
                goto L_0x007a
            L_0x002e:
                boolean r14 = r14.equals(r3)
                if (r14 == 0) goto L_0x0079
                r14 = 10
                goto L_0x007a
            L_0x0037:
                boolean r14 = r14.equals(r4)
                if (r14 == 0) goto L_0x0079
                r14 = 2
                goto L_0x007a
            L_0x003f:
                boolean r14 = r14.equals(r5)
                if (r14 == 0) goto L_0x0079
                r14 = 0
                goto L_0x007a
            L_0x0047:
                boolean r14 = r14.equals(r6)
                if (r14 == 0) goto L_0x0079
                r14 = 6
                goto L_0x007a
            L_0x004f:
                boolean r14 = r14.equals(r7)
                if (r14 == 0) goto L_0x0079
                r14 = 9
                goto L_0x007a
            L_0x0058:
                boolean r14 = r14.equals(r8)
                if (r14 == 0) goto L_0x0079
                r14 = 7
                goto L_0x007a
            L_0x0060:
                boolean r14 = r14.equals(r9)
                if (r14 == 0) goto L_0x0079
                r14 = 8
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
                com.miot.common.property.Property r14 = r13.getProperty(r3)
                boolean r14 = r14.isValueValid()
                if (r14 == 0) goto L_0x017a
                java.lang.Object r13 = r13.getValue(r3)
                java.lang.Long r13 = (java.lang.Long) r13
                com.yeelight.yeelib.device.xiaomi.Ceiling2Service$s0 r14 = r12.f16092a
                r14.mo28442c(r13)
                goto L_0x017a
            L_0x0096:
                com.miot.common.property.Property r14 = r13.getProperty(r7)
                boolean r14 = r14.isValueValid()
                if (r14 == 0) goto L_0x017a
                java.lang.Object r13 = r13.getValue(r7)
                java.lang.Long r13 = (java.lang.Long) r13
                com.yeelight.yeelib.device.xiaomi.Ceiling2Service$s0 r14 = r12.f16092a
                r14.mo28450m(r13)
                goto L_0x017a
            L_0x00ad:
                com.miot.common.property.Property r14 = r13.getProperty(r9)
                boolean r14 = r14.isValueValid()
                if (r14 == 0) goto L_0x017a
                java.lang.Object r13 = r13.getValue(r9)
                java.lang.String r13 = (java.lang.String) r13
                com.yeelight.yeelib.device.xiaomi.Ceiling2Service$s0 r14 = r12.f16092a
                r14.mo28448i(r13)
                goto L_0x017a
            L_0x00c4:
                com.miot.common.property.Property r14 = r13.getProperty(r8)
                boolean r14 = r14.isValueValid()
                if (r14 == 0) goto L_0x017a
                java.lang.Object r13 = r13.getValue(r8)
                java.lang.Long r13 = (java.lang.Long) r13
                com.yeelight.yeelib.device.xiaomi.Ceiling2Service$s0 r14 = r12.f16092a
                r14.mo28449k(r13)
                goto L_0x017a
            L_0x00db:
                com.miot.common.property.Property r14 = r13.getProperty(r6)
                boolean r14 = r14.isValueValid()
                if (r14 == 0) goto L_0x017a
                java.lang.Object r13 = r13.getValue(r6)
                java.lang.Long r13 = (java.lang.Long) r13
                com.yeelight.yeelib.device.xiaomi.Ceiling2Service$s0 r14 = r12.f16092a
                r14.mo28445f(r13)
                goto L_0x017a
            L_0x00f2:
                com.miot.common.property.Property r14 = r13.getProperty(r11)
                boolean r14 = r14.isValueValid()
                if (r14 == 0) goto L_0x017a
                java.lang.Object r13 = r13.getValue(r11)
                java.lang.Long r13 = (java.lang.Long) r13
                com.yeelight.yeelib.device.xiaomi.Ceiling2Service$s0 r14 = r12.f16092a
                r14.mo28443d(r13)
                goto L_0x017a
            L_0x0109:
                com.miot.common.property.Property r14 = r13.getProperty(r2)
                boolean r14 = r14.isValueValid()
                if (r14 == 0) goto L_0x017a
                java.lang.Object r13 = r13.getValue(r2)
                java.lang.Long r13 = (java.lang.Long) r13
                com.yeelight.yeelib.device.xiaomi.Ceiling2Service$s0 r14 = r12.f16092a
                r14.mo28446g(r13)
                goto L_0x017a
            L_0x011f:
                com.miot.common.property.Property r14 = r13.getProperty(r10)
                boolean r14 = r14.isValueValid()
                if (r14 == 0) goto L_0x017a
                java.lang.Object r13 = r13.getValue(r10)
                java.lang.String r13 = (java.lang.String) r13
                com.yeelight.yeelib.device.xiaomi.Ceiling2Service$s0 r14 = r12.f16092a
                r14.mo28444e(r13)
                goto L_0x017a
            L_0x0135:
                com.miot.common.property.Property r14 = r13.getProperty(r4)
                boolean r14 = r14.isValueValid()
                if (r14 == 0) goto L_0x017a
                java.lang.Object r13 = r13.getValue(r4)
                java.lang.Long r13 = (java.lang.Long) r13
                com.yeelight.yeelib.device.xiaomi.Ceiling2Service$s0 r14 = r12.f16092a
                r14.mo28441b(r13)
                goto L_0x017a
            L_0x014b:
                com.miot.common.property.Property r14 = r13.getProperty(r1)
                boolean r14 = r14.isValueValid()
                if (r14 == 0) goto L_0x017a
                java.lang.Object r13 = r13.getValue(r1)
                java.lang.Long r13 = (java.lang.Long) r13
                com.yeelight.yeelib.device.xiaomi.Ceiling2Service$s0 r14 = r12.f16092a
                r14.mo28440a(r13)
                goto L_0x017a
            L_0x0161:
                com.miot.common.property.Property r14 = r13.getProperty(r5)
                boolean r14 = r14.isValueValid()
                if (r14 == 0) goto L_0x017a
                java.lang.Object r13 = r13.getValue(r5)
                java.lang.String r13 = (java.lang.String) r13
                com.yeelight.yeelib.device.xiaomi.Ceiling2Service$r0 r13 = com.yeelight.yeelib.device.xiaomi.Ceiling2Service.C8113r0.valueOf(r13)
                com.yeelight.yeelib.device.xiaomi.Ceiling2Service$s0 r14 = r12.f16092a
                r14.mo28447h(r13)
            L_0x017a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.xiaomi.Ceiling2Service.C8118v.onPropertyChanged(com.miot.common.device.invocation.PropertyInfo, java.lang.String):void");
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling2Service$w */
    class C8119w implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16093a;

        C8119w(Ceiling2Service ceiling2Service, CompletionHandler completionHandler) {
            this.f16093a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16093a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f16093a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling2Service$x */
    class C8120x implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8107o0 f16094a;

        C8120x(Ceiling2Service ceiling2Service, C8107o0 o0Var) {
            this.f16094a = o0Var;
        }

        public void onFailed(int i, String str) {
            this.f16094a.onFailed(i, str);
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
                com.yeelight.yeelib.device.xiaomi.Ceiling2Service$r0 r1 = com.yeelight.yeelib.device.xiaomi.Ceiling2Service.C8113r0.valueOf(r1)
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
                java.lang.String r1 = "DelayOff"
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
                java.lang.String r1 = "LanMode"
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
                java.lang.String r1 = "onFromPower"
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
                java.lang.String r1 = "NLBright"
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
                java.lang.String r1 = "NightTimeInfo"
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
                java.lang.String r1 = "MiBandSleep"
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
                java.lang.String r1 = "Flowing"
                com.miot.common.property.Property r0 = r0.getProperty(r1)
                boolean r1 = r0.isValueValid()
                if (r1 == 0) goto L_0x00ec
                java.lang.Object r0 = r0.getValue()
                r3 = r0
                java.lang.Long r3 = (java.lang.Long) r3
            L_0x00ec:
                r0 = r16
                r15 = r3
                com.yeelight.yeelib.device.xiaomi.Ceiling2Service$o0 r4 = r0.f16094a
                r4.mo28451a(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.xiaomi.Ceiling2Service.C8120x.onSucceed(com.miot.common.device.invocation.PropertyInfo):void");
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling2Service$y */
    class C8121y implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8105n0 f16095a;

        C8121y(Ceiling2Service ceiling2Service, C8105n0 n0Var) {
            this.f16095a = n0Var;
        }

        public void onFailed(int i, String str) {
            this.f16095a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Power");
            if (property.isValueValid()) {
                this.f16095a.mo29620a(C8113r0.valueOf((String) propertyInfo.getValue("Power")));
                return;
            }
            C8105n0 n0Var = this.f16095a;
            n0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling2Service$z */
    class C8122z implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8089f0 f16096a;

        C8122z(Ceiling2Service ceiling2Service, C8089f0 f0Var) {
            this.f16096a = f0Var;
        }

        public void onFailed(int i, String str) {
            this.f16096a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Bright");
            if (property.isValueValid()) {
                this.f16096a.mo29604a((Long) propertyInfo.getValue("Bright"));
                return;
            }
            C8089f0 f0Var = this.f16096a;
            f0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    public Ceiling2Service(AbstractDevice abstractDevice) {
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
                MiotManager.getDeviceManipulator().invoke(create, new C8106o(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8092h(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getBright(C8089f0 f0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Bright"), new C8122z(this, f0Var));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8117u(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getDelayOff(C8091g0 g0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "DelayOff"), new C8079a0(this, g0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowParams(C8093h0 h0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "FlowParams"), new C8081b0(this, h0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowing(C8095i0 i0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Flowing"), new C8088f(this, i0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getLanMode(C8097j0 j0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "LanMode"), new C8083c0(this, j0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getMiBandSleep(C8099k0 k0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "MiBandSleep"), new C8086e(this, k0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getNLBright(C8101l0 l0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "NLBright"), new C8082c(this, l0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getNightTimeInfo(C8103m0 m0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "NightTimeInfo"), new C8084d(this, m0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getPower(C8105n0 n0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Power"), new C8121y(this, n0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getProperties(C8107o0 o0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            PropertyInfo create = PropertyInfoFactory.create(getService());
            create.addProperty(getService().getProperty("Power"));
            create.addProperty(getService().getProperty("Bright"));
            create.addProperty(getService().getProperty("DelayOff"));
            create.addProperty(getService().getProperty("FlowParams"));
            create.addProperty(getService().getProperty("LanMode"));
            create.addProperty(getService().getProperty("SaveState"));
            create.addProperty(getService().getProperty("onFromPower"));
            create.addProperty(getService().getProperty("NLBright"));
            create.addProperty(getService().getProperty("NightTimeInfo"));
            create.addProperty(getService().getProperty("MiBandSleep"));
            create.addProperty(getService().getProperty("Flowing"));
            MiotManager.getDeviceManipulator().readProperty(create, new C8120x(this, o0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getSaveState(C8109p0 p0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "SaveState"), new C8078a(this, p0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getonFromPower(C8111q0 q0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "onFromPower"), new C8080b(this, q0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void openWithMode(C8113r0 r0Var, C8087e0 e0Var, Long l, Long l2, CompletionHandler completionHandler) {
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
                MiotManager.getDeviceManipulator().invoke(create, new C8100l(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8094i(this, completionHandler));
                return;
            }
            throw new MiotException("actionInfo is null");
        }
        throw new MiotException("device not configurated connection");
    }

    public void sendCmd(C8085d0 d0Var, String str, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "sendCmd");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("CmdKey", d0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("CmdValue", str)) {
                MiotManager.getDeviceManipulator().invoke(create, new C8112r(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setBright(Long l, C8087e0 e0Var, Long l2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setBright");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("Bright", l)) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Effect", e0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("Duration", l2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C8090g(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8108p(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8116t(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8110q(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setPower(C8113r0 r0Var, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setPower");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (create.setArgumentValue("Power", r0Var.toString())) {
                MiotManager.getDeviceManipulator().invoke(create, new C8102m(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8096j(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8114s(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void subscribeNotifications(CompletionHandler completionHandler, C8115s0 s0Var) {
        if (completionHandler == null) {
            throw new IllegalArgumentException("handler is null");
        } else if (s0Var != null) {
            PropertyInfo create = PropertyInfoFactory.create(getService());
            for (Property next : getService().getProperties()) {
                if (next.getDefinition().isNotifiable()) {
                    create.addProperty(next);
                }
            }
            MiotManager.getDeviceManipulator().addPropertyChangedListener(create, new C8098k(this, completionHandler), new C8118v(this, s0Var));
        } else {
            throw new IllegalArgumentException("listener is null");
        }
    }

    public void toggle(CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "toggle");
            if (create != null) {
                MiotManager.getDeviceManipulator().invoke(create, new C8104n(this, completionHandler));
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
            MiotManager.getDeviceManipulator().removePropertyChangedListener(create, new C8119w(this, completionHandler));
            return;
        }
        throw new IllegalArgumentException("handler is null");
    }
}
