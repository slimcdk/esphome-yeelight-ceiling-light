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

public class Panel3Service extends AbstractService {
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
    public static final String PROPERTY_Mode = "Mode";
    public static final String PROPERTY_NightTimeInfo = "NightTimeInfo";
    public static final String PROPERTY_ParamColors = "ParamColors";
    public static final String PROPERTY_ParamCount = "ParamCount";
    public static final String PROPERTY_ParamFinish = "ParamFinish";
    public static final String PROPERTY_ParamModel = "ParamModel";
    public static final String PROPERTY_Power = "Power";
    public static final String PROPERTY_SaveState = "SaveState";
    public static final String PROPERTY_SmartSwitch = "SmartSwitch";
    public static final String PROPERTY_adjustAction = "adjustAction";
    public static final String PROPERTY_adjustProper = "adjustProper";
    public static final String PROPERTY_onFromPower = "onFromPower";
    private static final String TAG = "Panel3Service";
    private AbstractDevice mDevice = null;

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel3Service$a */
    class C9396a implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9425o0 f17345a;

        C9396a(Panel3Service panel3Service, C9425o0 o0Var) {
            this.f17345a = o0Var;
        }

        public void onFailed(int i, String str) {
            this.f17345a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("SaveState");
            if (property.isValueValid()) {
                this.f17345a.mo31110a((Long) propertyInfo.getValue("SaveState"));
                return;
            }
            C9425o0 o0Var = this.f17345a;
            o0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel3Service$a0 */
    class C9397a0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9409g0 f17346a;

        C9397a0(Panel3Service panel3Service, C9409g0 g0Var) {
            this.f17346a = g0Var;
        }

        public void onFailed(int i, String str) {
            this.f17346a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Ct");
            if (property.isValueValid()) {
                this.f17346a.mo31096a((Long) propertyInfo.getValue("Ct"));
                return;
            }
            C9409g0 g0Var = this.f17346a;
            g0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel3Service$b */
    class C9398b implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9417k0 f17347a;

        C9398b(Panel3Service panel3Service, C9417k0 k0Var) {
            this.f17347a = k0Var;
        }

        public void onFailed(int i, String str) {
            this.f17347a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("LanMode");
            if (property.isValueValid()) {
                this.f17347a.mo31104a((Long) propertyInfo.getValue("LanMode"));
                return;
            }
            C9417k0 k0Var = this.f17347a;
            k0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel3Service$b0 */
    class C9399b0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9413i0 f17348a;

        C9399b0(Panel3Service panel3Service, C9413i0 i0Var) {
            this.f17348a = i0Var;
        }

        public void onFailed(int i, String str) {
            this.f17348a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("FlowParams");
            if (property.isValueValid()) {
                this.f17348a.onSucceed((String) propertyInfo.getValue("FlowParams"));
                return;
            }
            C9413i0 i0Var = this.f17348a;
            i0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel3Service$c */
    class C9400c implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9429q0 f17349a;

        C9400c(Panel3Service panel3Service, C9429q0 q0Var) {
            this.f17349a = q0Var;
        }

        public void onFailed(int i, String str) {
            this.f17349a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("onFromPower");
            if (property.isValueValid()) {
                this.f17349a.mo31114a((Long) propertyInfo.getValue("onFromPower"));
                return;
            }
            C9429q0 q0Var = this.f17349a;
            q0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel3Service$c0 */
    class C9401c0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9411h0 f17350a;

        C9401c0(Panel3Service panel3Service, C9411h0 h0Var) {
            this.f17350a = h0Var;
        }

        public void onFailed(int i, String str) {
            this.f17350a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("DelayOff");
            if (property.isValueValid()) {
                this.f17350a.mo31098a((Long) propertyInfo.getValue("DelayOff"));
                return;
            }
            C9411h0 h0Var = this.f17350a;
            h0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel3Service$d */
    class C9402d implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9415j0 f17351a;

        C9402d(Panel3Service panel3Service, C9415j0 j0Var) {
            this.f17351a = j0Var;
        }

        public void onFailed(int i, String str) {
            this.f17351a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Flowing");
            if (property.isValueValid()) {
                this.f17351a.mo31102a((Long) propertyInfo.getValue("Flowing"));
                return;
            }
            C9415j0 j0Var = this.f17351a;
            j0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel3Service$d0 */
    public enum C9403d0 {
        undefined,
        cfg_pomodoro,
        cfg_lan_ctrl,
        cfg_save_state,
        cfg_init_power,
        cfg_smart_switch,
        nighttime,
        pseudo_beacon
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel3Service$e */
    class C9404e implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9427p0 f17361a;

        C9404e(Panel3Service panel3Service, C9427p0 p0Var) {
            this.f17361a = p0Var;
        }

        public void onFailed(int i, String str) {
            this.f17361a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("SmartSwitch");
            if (property.isValueValid()) {
                this.f17361a.mo31112a((Long) propertyInfo.getValue("SmartSwitch"));
                return;
            }
            C9427p0 p0Var = this.f17361a;
            p0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel3Service$e0 */
    public enum C9405e0 {
        undefined,
        smooth,
        sudden
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel3Service$f */
    class C9406f implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9419l0 f17366a;

        C9406f(Panel3Service panel3Service, C9419l0 l0Var) {
            this.f17366a = l0Var;
        }

        public void onFailed(int i, String str) {
            this.f17366a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("NightTimeInfo");
            if (property.isValueValid()) {
                this.f17366a.onSucceed((String) propertyInfo.getValue("NightTimeInfo"));
                return;
            }
            C9419l0 l0Var = this.f17366a;
            l0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel3Service$f0 */
    public interface C9407f0 {
        /* renamed from: a */
        void mo31094a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel3Service$g */
    class C9408g implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17367a;

        C9408g(Panel3Service panel3Service, CompletionHandler completionHandler) {
            this.f17367a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17367a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17367a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel3Service$g0 */
    public interface C9409g0 {
        /* renamed from: a */
        void mo31096a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel3Service$h */
    class C9410h implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17368a;

        C9410h(Panel3Service panel3Service, CompletionHandler completionHandler) {
            this.f17368a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17368a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17368a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel3Service$h0 */
    public interface C9411h0 {
        /* renamed from: a */
        void mo31098a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel3Service$i */
    class C9412i implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17369a;

        C9412i(Panel3Service panel3Service, CompletionHandler completionHandler) {
            this.f17369a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17369a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17369a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel3Service$i0 */
    public interface C9413i0 {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel3Service$j */
    class C9414j implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17370a;

        C9414j(Panel3Service panel3Service, CompletionHandler completionHandler) {
            this.f17370a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17370a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17370a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel3Service$j0 */
    public interface C9415j0 {
        /* renamed from: a */
        void mo31102a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel3Service$k */
    class C9416k implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17371a;

        C9416k(Panel3Service panel3Service, CompletionHandler completionHandler) {
            this.f17371a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17371a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f17371a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel3Service$k0 */
    public interface C9417k0 {
        /* renamed from: a */
        void mo31104a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel3Service$l */
    class C9418l implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17372a;

        C9418l(Panel3Service panel3Service, CompletionHandler completionHandler) {
            this.f17372a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17372a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17372a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel3Service$l0 */
    public interface C9419l0 {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel3Service$m */
    class C9420m implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17373a;

        C9420m(Panel3Service panel3Service, CompletionHandler completionHandler) {
            this.f17373a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17373a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17373a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel3Service$m0 */
    public interface C9421m0 {
        /* renamed from: a */
        void mo31108a(C9431r0 r0Var);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel3Service$n */
    class C9422n implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17374a;

        C9422n(Panel3Service panel3Service, CompletionHandler completionHandler) {
            this.f17374a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17374a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17374a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel3Service$n0 */
    public interface C9423n0 {
        /* renamed from: a */
        void mo28115a(C9431r0 r0Var, Long l, Long l2, String str, Long l3, Long l4, Long l5, Long l6, Long l7, Long l8, String str2);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel3Service$o */
    class C9424o implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17375a;

        C9424o(Panel3Service panel3Service, CompletionHandler completionHandler) {
            this.f17375a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17375a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17375a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel3Service$o0 */
    public interface C9425o0 {
        /* renamed from: a */
        void mo31110a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel3Service$p */
    class C9426p implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17376a;

        C9426p(Panel3Service panel3Service, CompletionHandler completionHandler) {
            this.f17376a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17376a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17376a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel3Service$p0 */
    public interface C9427p0 {
        /* renamed from: a */
        void mo31112a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel3Service$q */
    class C9428q implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17377a;

        C9428q(Panel3Service panel3Service, CompletionHandler completionHandler) {
            this.f17377a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17377a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17377a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel3Service$q0 */
    public interface C9429q0 {
        /* renamed from: a */
        void mo31114a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel3Service$r */
    class C9430r implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17378a;

        C9430r(Panel3Service panel3Service, CompletionHandler completionHandler) {
            this.f17378a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17378a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17378a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel3Service$r0 */
    public enum C9431r0 {
        undefined,
        on,
        off
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel3Service$s */
    class C9432s implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17383a;

        C9432s(Panel3Service panel3Service, CompletionHandler completionHandler) {
            this.f17383a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17383a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17383a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel3Service$s0 */
    public interface C9433s0 {
        /* renamed from: a */
        void mo28104a(Long l);

        /* renamed from: b */
        void mo28105b(Long l);

        /* renamed from: c */
        void mo28106c(Long l);

        /* renamed from: d */
        void mo28107d(Long l);

        /* renamed from: e */
        void mo28108e(String str);

        /* renamed from: f */
        void mo28109f(Long l);

        /* renamed from: g */
        void mo28110g(Long l);

        /* renamed from: h */
        void mo28111h(Long l);

        /* renamed from: i */
        void mo28112i(String str);

        /* renamed from: j */
        void mo28113j(C9431r0 r0Var);

        /* renamed from: p */
        void mo28114p(Long l);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel3Service$t */
    class C9434t implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17384a;

        C9434t(Panel3Service panel3Service, CompletionHandler completionHandler) {
            this.f17384a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17384a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17384a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel3Service$u */
    class C9435u implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17385a;

        C9435u(Panel3Service panel3Service, CompletionHandler completionHandler) {
            this.f17385a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17385a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17385a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel3Service$v */
    class C9436v implements DeviceManipulator.PropertyChangedListener {

        /* renamed from: a */
        final /* synthetic */ C9433s0 f17386a;

        C9436v(Panel3Service panel3Service, C9433s0 s0Var) {
            this.f17386a = s0Var;
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onPropertyChanged(com.miot.common.device.invocation.PropertyInfo r13, java.lang.String r14) {
            /*
                r12 = this;
                int r0 = r14.hashCode()
                java.lang.String r1 = "Bright"
                java.lang.String r2 = "LanMode"
                java.lang.String r3 = "SmartSwitch"
                java.lang.String r4 = "Flowing"
                java.lang.String r5 = "DelayOff"
                java.lang.String r6 = "Power"
                java.lang.String r7 = "onFromPower"
                java.lang.String r8 = "Ct"
                java.lang.String r9 = "NightTimeInfo"
                java.lang.String r10 = "FlowParams"
                java.lang.String r11 = "SaveState"
                switch(r0) {
                    case -2117953292: goto L_0x0071;
                    case -2002016140: goto L_0x0069;
                    case -1331143373: goto L_0x0060;
                    case 2193: goto L_0x0058;
                    case 35911772: goto L_0x0050;
                    case 77306085: goto L_0x0048;
                    case 880790796: goto L_0x0040;
                    case 898856916: goto L_0x0037;
                    case 1179821629: goto L_0x002e;
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
                r14 = 9
                goto L_0x007a
            L_0x0037:
                boolean r14 = r14.equals(r4)
                if (r14 == 0) goto L_0x0079
                r14 = 8
                goto L_0x007a
            L_0x0040:
                boolean r14 = r14.equals(r5)
                if (r14 == 0) goto L_0x0079
                r14 = 4
                goto L_0x007a
            L_0x0048:
                boolean r14 = r14.equals(r6)
                if (r14 == 0) goto L_0x0079
                r14 = 0
                goto L_0x007a
            L_0x0050:
                boolean r14 = r14.equals(r7)
                if (r14 == 0) goto L_0x0079
                r14 = 7
                goto L_0x007a
            L_0x0058:
                boolean r14 = r14.equals(r8)
                if (r14 == 0) goto L_0x0079
                r14 = 2
                goto L_0x007a
            L_0x0060:
                boolean r14 = r14.equals(r9)
                if (r14 == 0) goto L_0x0079
                r14 = 10
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
                com.miot.common.property.Property r14 = r13.getProperty(r9)
                boolean r14 = r14.isValueValid()
                if (r14 == 0) goto L_0x017a
                java.lang.Object r13 = r13.getValue(r9)
                java.lang.String r13 = (java.lang.String) r13
                com.yeelight.yeelib.device.xiaomi.Panel3Service$s0 r14 = r12.f17386a
                r14.mo28112i(r13)
                goto L_0x017a
            L_0x0096:
                com.miot.common.property.Property r14 = r13.getProperty(r3)
                boolean r14 = r14.isValueValid()
                if (r14 == 0) goto L_0x017a
                java.lang.Object r13 = r13.getValue(r3)
                java.lang.Long r13 = (java.lang.Long) r13
                com.yeelight.yeelib.device.xiaomi.Panel3Service$s0 r14 = r12.f17386a
                r14.mo28114p(r13)
                goto L_0x017a
            L_0x00ad:
                com.miot.common.property.Property r14 = r13.getProperty(r4)
                boolean r14 = r14.isValueValid()
                if (r14 == 0) goto L_0x017a
                java.lang.Object r13 = r13.getValue(r4)
                java.lang.Long r13 = (java.lang.Long) r13
                com.yeelight.yeelib.device.xiaomi.Panel3Service$s0 r14 = r12.f17386a
                r14.mo28106c(r13)
                goto L_0x017a
            L_0x00c4:
                com.miot.common.property.Property r14 = r13.getProperty(r7)
                boolean r14 = r14.isValueValid()
                if (r14 == 0) goto L_0x017a
                java.lang.Object r13 = r13.getValue(r7)
                java.lang.Long r13 = (java.lang.Long) r13
                com.yeelight.yeelib.device.xiaomi.Panel3Service$s0 r14 = r12.f17386a
                r14.mo28109f(r13)
                goto L_0x017a
            L_0x00db:
                com.miot.common.property.Property r14 = r13.getProperty(r2)
                boolean r14 = r14.isValueValid()
                if (r14 == 0) goto L_0x017a
                java.lang.Object r13 = r13.getValue(r2)
                java.lang.Long r13 = (java.lang.Long) r13
                com.yeelight.yeelib.device.xiaomi.Panel3Service$s0 r14 = r12.f17386a
                r14.mo28110g(r13)
                goto L_0x017a
            L_0x00f2:
                com.miot.common.property.Property r14 = r13.getProperty(r11)
                boolean r14 = r14.isValueValid()
                if (r14 == 0) goto L_0x017a
                java.lang.Object r13 = r13.getValue(r11)
                java.lang.Long r13 = (java.lang.Long) r13
                com.yeelight.yeelib.device.xiaomi.Panel3Service$s0 r14 = r12.f17386a
                r14.mo28107d(r13)
                goto L_0x017a
            L_0x0109:
                com.miot.common.property.Property r14 = r13.getProperty(r5)
                boolean r14 = r14.isValueValid()
                if (r14 == 0) goto L_0x017a
                java.lang.Object r13 = r13.getValue(r5)
                java.lang.Long r13 = (java.lang.Long) r13
                com.yeelight.yeelib.device.xiaomi.Panel3Service$s0 r14 = r12.f17386a
                r14.mo28105b(r13)
                goto L_0x017a
            L_0x011f:
                com.miot.common.property.Property r14 = r13.getProperty(r10)
                boolean r14 = r14.isValueValid()
                if (r14 == 0) goto L_0x017a
                java.lang.Object r13 = r13.getValue(r10)
                java.lang.String r13 = (java.lang.String) r13
                com.yeelight.yeelib.device.xiaomi.Panel3Service$s0 r14 = r12.f17386a
                r14.mo28108e(r13)
                goto L_0x017a
            L_0x0135:
                com.miot.common.property.Property r14 = r13.getProperty(r8)
                boolean r14 = r14.isValueValid()
                if (r14 == 0) goto L_0x017a
                java.lang.Object r13 = r13.getValue(r8)
                java.lang.Long r13 = (java.lang.Long) r13
                com.yeelight.yeelib.device.xiaomi.Panel3Service$s0 r14 = r12.f17386a
                r14.mo28111h(r13)
                goto L_0x017a
            L_0x014b:
                com.miot.common.property.Property r14 = r13.getProperty(r1)
                boolean r14 = r14.isValueValid()
                if (r14 == 0) goto L_0x017a
                java.lang.Object r13 = r13.getValue(r1)
                java.lang.Long r13 = (java.lang.Long) r13
                com.yeelight.yeelib.device.xiaomi.Panel3Service$s0 r14 = r12.f17386a
                r14.mo28104a(r13)
                goto L_0x017a
            L_0x0161:
                com.miot.common.property.Property r14 = r13.getProperty(r6)
                boolean r14 = r14.isValueValid()
                if (r14 == 0) goto L_0x017a
                java.lang.Object r13 = r13.getValue(r6)
                java.lang.String r13 = (java.lang.String) r13
                com.yeelight.yeelib.device.xiaomi.Panel3Service$r0 r13 = com.yeelight.yeelib.device.xiaomi.Panel3Service.C9431r0.valueOf(r13)
                com.yeelight.yeelib.device.xiaomi.Panel3Service$s0 r14 = r12.f17386a
                r14.mo28113j(r13)
            L_0x017a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.xiaomi.Panel3Service.C9436v.onPropertyChanged(com.miot.common.device.invocation.PropertyInfo, java.lang.String):void");
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel3Service$w */
    class C9437w implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17387a;

        C9437w(Panel3Service panel3Service, CompletionHandler completionHandler) {
            this.f17387a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17387a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f17387a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel3Service$x */
    class C9438x implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9423n0 f17388a;

        C9438x(Panel3Service panel3Service, C9423n0 n0Var) {
            this.f17388a = n0Var;
        }

        public void onFailed(int i, String str) {
            this.f17388a.onFailed(i, str);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.String} */
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
                com.yeelight.yeelib.device.xiaomi.Panel3Service$r0 r1 = com.yeelight.yeelib.device.xiaomi.Panel3Service.C9431r0.valueOf(r1)
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
                java.lang.String r1 = "SmartSwitch"
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
                java.lang.String r1 = "NightTimeInfo"
                com.miot.common.property.Property r0 = r0.getProperty(r1)
                boolean r1 = r0.isValueValid()
                if (r1 == 0) goto L_0x00ec
                java.lang.Object r0 = r0.getValue()
                r3 = r0
                java.lang.String r3 = (java.lang.String) r3
            L_0x00ec:
                r0 = r16
                r15 = r3
                com.yeelight.yeelib.device.xiaomi.Panel3Service$n0 r4 = r0.f17388a
                r4.mo28115a(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.xiaomi.Panel3Service.C9438x.onSucceed(com.miot.common.device.invocation.PropertyInfo):void");
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel3Service$y */
    class C9439y implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9421m0 f17389a;

        C9439y(Panel3Service panel3Service, C9421m0 m0Var) {
            this.f17389a = m0Var;
        }

        public void onFailed(int i, String str) {
            this.f17389a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Power");
            if (property.isValueValid()) {
                this.f17389a.mo31108a(C9431r0.valueOf((String) propertyInfo.getValue("Power")));
                return;
            }
            C9421m0 m0Var = this.f17389a;
            m0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel3Service$z */
    class C9440z implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9407f0 f17390a;

        C9440z(Panel3Service panel3Service, C9407f0 f0Var) {
            this.f17390a = f0Var;
        }

        public void onFailed(int i, String str) {
            this.f17390a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Bright");
            if (property.isValueValid()) {
                this.f17390a.mo31094a((Long) propertyInfo.getValue("Bright"));
                return;
            }
            C9407f0 f0Var = this.f17390a;
            f0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    public Panel3Service(AbstractDevice abstractDevice) {
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
                MiotManager.getDeviceManipulator().invoke(create, new C9424o(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C9410h(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getBright(C9407f0 f0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Bright"), new C9440z(this, f0Var));
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
                MiotManager.getDeviceManipulator().invoke(create, new C9435u(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getCt(C9409g0 g0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Ct"), new C9397a0(this, g0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getDelayOff(C9411h0 h0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "DelayOff"), new C9401c0(this, h0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowParams(C9413i0 i0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "FlowParams"), new C9399b0(this, i0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowing(C9415j0 j0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Flowing"), new C9402d(this, j0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getLanMode(C9417k0 k0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "LanMode"), new C9398b(this, k0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getNightTimeInfo(C9419l0 l0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "NightTimeInfo"), new C9406f(this, l0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getPower(C9421m0 m0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Power"), new C9439y(this, m0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getProperties(C9423n0 n0Var) {
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
            create.addProperty(getService().getProperty("SmartSwitch"));
            create.addProperty(getService().getProperty("NightTimeInfo"));
            MiotManager.getDeviceManipulator().readProperty(create, new C9438x(this, n0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getSaveState(C9425o0 o0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "SaveState"), new C9396a(this, o0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getSmartSwitch(C9427p0 p0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "SmartSwitch"), new C9404e(this, p0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getonFromPower(C9429q0 q0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "onFromPower"), new C9400c(this, q0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void openWithMode(C9431r0 r0Var, C9405e0 e0Var, Long l, Long l2, CompletionHandler completionHandler) {
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
                MiotManager.getDeviceManipulator().invoke(create, new C9418l(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C9412i(this, completionHandler));
                return;
            }
            throw new MiotException("actionInfo is null");
        }
        throw new MiotException("device not configurated connection");
    }

    public void sendCmd(C9403d0 d0Var, String str, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "sendCmd");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("CmdKey", d0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("CmdValue", str)) {
                MiotManager.getDeviceManipulator().invoke(create, new C9428q(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setBright(Long l, C9405e0 e0Var, Long l2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setBright");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("Bright", l)) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Effect", e0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("Duration", l2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C9408g(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setCt(Long l, C9405e0 e0Var, Long l2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setCt");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("Ct", l)) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Effect", e0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("Duration", l2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C9434t(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C9426p(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C9432s(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setPower(C9431r0 r0Var, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setPower");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (create.setArgumentValue("Power", r0Var.toString())) {
                MiotManager.getDeviceManipulator().invoke(create, new C9420m(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C9414j(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C9430r(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void subscribeNotifications(CompletionHandler completionHandler, C9433s0 s0Var) {
        if (completionHandler == null) {
            throw new IllegalArgumentException("handler is null");
        } else if (s0Var != null) {
            PropertyInfo create = PropertyInfoFactory.create(getService());
            for (Property next : getService().getProperties()) {
                if (next.getDefinition().isNotifiable()) {
                    create.addProperty(next);
                }
            }
            MiotManager.getDeviceManipulator().addPropertyChangedListener(create, new C9416k(this, completionHandler), new C9436v(this, s0Var));
        } else {
            throw new IllegalArgumentException("listener is null");
        }
    }

    public void toggle(CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "toggle");
            if (create != null) {
                MiotManager.getDeviceManipulator().invoke(create, new C9422n(this, completionHandler));
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
            MiotManager.getDeviceManipulator().removePropertyChangedListener(create, new C9437w(this, completionHandler));
            return;
        }
        throw new IllegalArgumentException("handler is null");
    }
}
