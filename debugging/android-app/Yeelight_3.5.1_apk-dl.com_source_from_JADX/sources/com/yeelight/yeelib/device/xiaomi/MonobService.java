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

public class MonobService extends AbstractService {
    public static final String ACTION_addCron = "addCron";
    public static final String ACTION_delCron = "delCron";
    public static final String ACTION_getCron = "getCron";
    public static final String ACTION_openWithMode = "openWithMode";
    public static final String ACTION_restore = "restore";
    public static final String ACTION_sendCmd = "sendCmd";
    public static final String ACTION_setBright = "setBright";
    public static final String ACTION_setDefault = "setDefault";
    public static final String ACTION_setFlowScene = "setFlowScene";
    public static final String ACTION_setPower = "setPower";
    public static final String ACTION_setScene = "setScene";
    public static final String ACTION_setScene2 = "setScene2";
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
    public static final String PROPERTY_Mode = "Mode";
    public static final String PROPERTY_ParamColors = "ParamColors";
    public static final String PROPERTY_ParamCount = "ParamCount";
    public static final String PROPERTY_ParamFinish = "ParamFinish";
    public static final String PROPERTY_ParamModel = "ParamModel";
    public static final String PROPERTY_Power = "Power";
    public static final String PROPERTY_SaveState = "SaveState";
    public static final String PROPERTY_TransIntervalDflt = "TransIntervalDflt";
    public static final String PROPERTY_onFromPower = "onFromPower";
    private static final String TAG = "MonobService";
    private AbstractDevice mDevice = null;

    public enum CmdKey {
        undefined,
        cfg_pomodoro,
        cfg_lan_ctrl,
        cfg_save_state,
        cfg_init_power,
        trans_default
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

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonobService$a */
    class C7786a implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7795e0 f13844a;

        C7786a(MonobService monobService, C7795e0 e0Var) {
            this.f13844a = e0Var;
        }

        public void onFailed(int i, String str) {
            this.f13844a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("LanMode");
            if (property.isValueValid()) {
                this.f13844a.mo34382a((Long) propertyInfo.getValue("LanMode"));
                return;
            }
            C7795e0 e0Var = this.f13844a;
            e0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonobService$a0 */
    public interface C7787a0 {
        /* renamed from: a */
        void mo34374a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonobService$b */
    class C7788b implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7803i0 f13845a;

        C7788b(MonobService monobService, C7803i0 i0Var) {
            this.f13845a = i0Var;
        }

        public void onFailed(int i, String str) {
            this.f13845a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("TransIntervalDflt");
            if (property.isValueValid()) {
                this.f13845a.mo34390a((Long) propertyInfo.getValue("TransIntervalDflt"));
                return;
            }
            C7803i0 i0Var = this.f13845a;
            i0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonobService$b0 */
    public interface C7789b0 {
        /* renamed from: a */
        void mo34376a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonobService$c */
    class C7790c implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7805j0 f13846a;

        C7790c(MonobService monobService, C7805j0 j0Var) {
            this.f13846a = j0Var;
        }

        public void onFailed(int i, String str) {
            this.f13846a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("onFromPower");
            if (property.isValueValid()) {
                this.f13846a.mo34392a((Long) propertyInfo.getValue("onFromPower"));
                return;
            }
            C7805j0 j0Var = this.f13846a;
            j0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonobService$c0 */
    public interface C7791c0 {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonobService$d */
    class C7792d implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7793d0 f13847a;

        C7792d(MonobService monobService, C7793d0 d0Var) {
            this.f13847a = d0Var;
        }

        public void onFailed(int i, String str) {
            this.f13847a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Flowing");
            if (property.isValueValid()) {
                this.f13847a.mo34380a((Long) propertyInfo.getValue("Flowing"));
                return;
            }
            C7793d0 d0Var = this.f13847a;
            d0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonobService$d0 */
    public interface C7793d0 {
        /* renamed from: a */
        void mo34380a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonobService$e */
    class C7794e implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13848a;

        C7794e(MonobService monobService, CompletionHandler completionHandler) {
            this.f13848a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13848a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13848a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonobService$e0 */
    public interface C7795e0 {
        /* renamed from: a */
        void mo34382a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonobService$f */
    class C7796f implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13849a;

        C7796f(MonobService monobService, CompletionHandler completionHandler) {
            this.f13849a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13849a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13849a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonobService$f0 */
    public interface C7797f0 {
        /* renamed from: a */
        void mo34384a(Power power);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonobService$g */
    class C7798g implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13850a;

        C7798g(MonobService monobService, CompletionHandler completionHandler) {
            this.f13850a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13850a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13850a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonobService$g0 */
    public interface C7799g0 {
        /* renamed from: a */
        void mo34386a(Power power, Long l, Long l2, Long l3, String str, Long l4, Long l5, Long l6, Long l7);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonobService$h */
    class C7800h implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13851a;

        C7800h(MonobService monobService, CompletionHandler completionHandler) {
            this.f13851a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13851a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13851a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonobService$h0 */
    public interface C7801h0 {
        /* renamed from: a */
        void mo34388a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonobService$i */
    class C7802i implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13852a;

        C7802i(MonobService monobService, CompletionHandler completionHandler) {
            this.f13852a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13852a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13852a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonobService$i0 */
    public interface C7803i0 {
        /* renamed from: a */
        void mo34390a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonobService$j */
    class C7804j implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13853a;

        C7804j(MonobService monobService, CompletionHandler completionHandler) {
            this.f13853a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13853a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13853a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonobService$j0 */
    public interface C7805j0 {
        /* renamed from: a */
        void mo34392a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonobService$k */
    class C7806k implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13854a;

        C7806k(MonobService monobService, CompletionHandler completionHandler) {
            this.f13854a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13854a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f13854a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonobService$k0 */
    public interface C7807k0 {
        /* renamed from: a */
        void mo34394a(Long l);

        /* renamed from: b */
        void mo34395b(Long l);

        /* renamed from: c */
        void mo34396c(Long l);

        /* renamed from: d */
        void mo34397d(Long l);

        /* renamed from: e */
        void mo34398e(String str);

        /* renamed from: f */
        void mo34399f(Long l);

        /* renamed from: g */
        void mo34400g(Long l);

        /* renamed from: h */
        void mo34401h(Power power);

        /* renamed from: p */
        void mo34402p(Long l);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonobService$l */
    class C7808l implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13855a;

        C7808l(MonobService monobService, CompletionHandler completionHandler) {
            this.f13855a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13855a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13855a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonobService$m */
    class C7809m implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13856a;

        C7809m(MonobService monobService, CompletionHandler completionHandler) {
            this.f13856a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13856a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13856a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonobService$n */
    class C7810n implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13857a;

        C7810n(MonobService monobService, CompletionHandler completionHandler) {
            this.f13857a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13857a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13857a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonobService$o */
    class C7811o implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13858a;

        C7811o(MonobService monobService, CompletionHandler completionHandler) {
            this.f13858a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13858a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13858a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonobService$p */
    class C7812p implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13859a;

        C7812p(MonobService monobService, CompletionHandler completionHandler) {
            this.f13859a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13859a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13859a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonobService$q */
    class C7813q implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13860a;

        C7813q(MonobService monobService, CompletionHandler completionHandler) {
            this.f13860a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13860a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13860a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonobService$r */
    class C7814r implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13861a;

        C7814r(MonobService monobService, CompletionHandler completionHandler) {
            this.f13861a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13861a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13861a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonobService$s */
    class C7815s implements DeviceManipulator.PropertyChangedListener {

        /* renamed from: a */
        final /* synthetic */ C7807k0 f13862a;

        C7815s(MonobService monobService, C7807k0 k0Var) {
            this.f13862a = k0Var;
        }

        public void onPropertyChanged(PropertyInfo propertyInfo, String str) {
            str.hashCode();
            char c = 65535;
            switch (str.hashCode()) {
                case -2117953292:
                    if (str.equals("SaveState")) {
                        c = 0;
                        break;
                    }
                    break;
                case -2002016140:
                    if (str.equals("FlowParams")) {
                        c = 1;
                        break;
                    }
                    break;
                case -718325097:
                    if (str.equals("TransIntervalDflt")) {
                        c = 2;
                        break;
                    }
                    break;
                case 35911772:
                    if (str.equals("onFromPower")) {
                        c = 3;
                        break;
                    }
                    break;
                case 77306085:
                    if (str.equals("Power")) {
                        c = 4;
                        break;
                    }
                    break;
                case 880790796:
                    if (str.equals("DelayOff")) {
                        c = 5;
                        break;
                    }
                    break;
                case 898856916:
                    if (str.equals("Flowing")) {
                        c = 6;
                        break;
                    }
                    break;
                case 1611821756:
                    if (str.equals("LanMode")) {
                        c = 7;
                        break;
                    }
                    break;
                case 1998035738:
                    if (str.equals("Bright")) {
                        c = 8;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    if (propertyInfo.getProperty("SaveState").isValueValid()) {
                        this.f13862a.mo34396c((Long) propertyInfo.getValue("SaveState"));
                        return;
                    }
                    return;
                case 1:
                    if (propertyInfo.getProperty("FlowParams").isValueValid()) {
                        this.f13862a.mo34398e((String) propertyInfo.getValue("FlowParams"));
                        return;
                    }
                    return;
                case 2:
                    if (propertyInfo.getProperty("TransIntervalDflt").isValueValid()) {
                        this.f13862a.mo34402p((Long) propertyInfo.getValue("TransIntervalDflt"));
                        return;
                    }
                    return;
                case 3:
                    if (propertyInfo.getProperty("onFromPower").isValueValid()) {
                        this.f13862a.mo34399f((Long) propertyInfo.getValue("onFromPower"));
                        return;
                    }
                    return;
                case 4:
                    if (propertyInfo.getProperty("Power").isValueValid()) {
                        this.f13862a.mo34401h(Power.valueOf((String) propertyInfo.getValue("Power")));
                        return;
                    }
                    return;
                case 5:
                    if (propertyInfo.getProperty("DelayOff").isValueValid()) {
                        this.f13862a.mo34395b((Long) propertyInfo.getValue("DelayOff"));
                        return;
                    }
                    return;
                case 6:
                    if (propertyInfo.getProperty("Flowing").isValueValid()) {
                        this.f13862a.mo34397d((Long) propertyInfo.getValue("Flowing"));
                        return;
                    }
                    return;
                case 7:
                    if (propertyInfo.getProperty("LanMode").isValueValid()) {
                        this.f13862a.mo34400g((Long) propertyInfo.getValue("LanMode"));
                        return;
                    }
                    return;
                case 8:
                    if (propertyInfo.getProperty("Bright").isValueValid()) {
                        this.f13862a.mo34394a((Long) propertyInfo.getValue("Bright"));
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonobService$t */
    class C7816t implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13863a;

        C7816t(MonobService monobService, CompletionHandler completionHandler) {
            this.f13863a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13863a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f13863a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonobService$u */
    class C7817u implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7799g0 f13864a;

        C7817u(MonobService monobService, C7799g0 g0Var) {
            this.f13864a = g0Var;
        }

        public void onFailed(int i, String str) {
            this.f13864a.onFailed(i, str);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v2, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.Long} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onSucceed(com.miot.common.device.invocation.PropertyInfo r14) {
            /*
                r13 = this;
                java.lang.String r0 = "Power"
                com.miot.common.property.Property r0 = r14.getProperty(r0)
                boolean r1 = r0.isValueValid()
                r2 = 0
                if (r1 == 0) goto L_0x0019
                java.lang.Object r0 = r0.getValue()
                java.lang.String r0 = (java.lang.String) r0
                com.yeelight.yeelib.device.xiaomi.MonobService$Power r0 = com.yeelight.yeelib.device.xiaomi.MonobService.Power.valueOf(r0)
                r4 = r0
                goto L_0x001a
            L_0x0019:
                r4 = r2
            L_0x001a:
                java.lang.String r0 = "Bright"
                com.miot.common.property.Property r0 = r14.getProperty(r0)
                boolean r1 = r0.isValueValid()
                if (r1 == 0) goto L_0x002e
                java.lang.Object r0 = r0.getValue()
                java.lang.Long r0 = (java.lang.Long) r0
                r5 = r0
                goto L_0x002f
            L_0x002e:
                r5 = r2
            L_0x002f:
                java.lang.String r0 = "DelayOff"
                com.miot.common.property.Property r0 = r14.getProperty(r0)
                boolean r1 = r0.isValueValid()
                if (r1 == 0) goto L_0x0043
                java.lang.Object r0 = r0.getValue()
                java.lang.Long r0 = (java.lang.Long) r0
                r6 = r0
                goto L_0x0044
            L_0x0043:
                r6 = r2
            L_0x0044:
                java.lang.String r0 = "SaveState"
                com.miot.common.property.Property r0 = r14.getProperty(r0)
                boolean r1 = r0.isValueValid()
                if (r1 == 0) goto L_0x0058
                java.lang.Object r0 = r0.getValue()
                java.lang.Long r0 = (java.lang.Long) r0
                r7 = r0
                goto L_0x0059
            L_0x0058:
                r7 = r2
            L_0x0059:
                java.lang.String r0 = "FlowParams"
                com.miot.common.property.Property r0 = r14.getProperty(r0)
                boolean r1 = r0.isValueValid()
                if (r1 == 0) goto L_0x006d
                java.lang.Object r0 = r0.getValue()
                java.lang.String r0 = (java.lang.String) r0
                r8 = r0
                goto L_0x006e
            L_0x006d:
                r8 = r2
            L_0x006e:
                java.lang.String r0 = "LanMode"
                com.miot.common.property.Property r0 = r14.getProperty(r0)
                boolean r1 = r0.isValueValid()
                if (r1 == 0) goto L_0x0082
                java.lang.Object r0 = r0.getValue()
                java.lang.Long r0 = (java.lang.Long) r0
                r9 = r0
                goto L_0x0083
            L_0x0082:
                r9 = r2
            L_0x0083:
                java.lang.String r0 = "TransIntervalDflt"
                com.miot.common.property.Property r0 = r14.getProperty(r0)
                boolean r1 = r0.isValueValid()
                if (r1 == 0) goto L_0x0097
                java.lang.Object r0 = r0.getValue()
                java.lang.Long r0 = (java.lang.Long) r0
                r10 = r0
                goto L_0x0098
            L_0x0097:
                r10 = r2
            L_0x0098:
                java.lang.String r0 = "onFromPower"
                com.miot.common.property.Property r0 = r14.getProperty(r0)
                boolean r1 = r0.isValueValid()
                if (r1 == 0) goto L_0x00ac
                java.lang.Object r0 = r0.getValue()
                java.lang.Long r0 = (java.lang.Long) r0
                r11 = r0
                goto L_0x00ad
            L_0x00ac:
                r11 = r2
            L_0x00ad:
                java.lang.String r0 = "Flowing"
                com.miot.common.property.Property r14 = r14.getProperty(r0)
                boolean r0 = r14.isValueValid()
                if (r0 == 0) goto L_0x00c0
                java.lang.Object r14 = r14.getValue()
                r2 = r14
                java.lang.Long r2 = (java.lang.Long) r2
            L_0x00c0:
                r12 = r2
                com.yeelight.yeelib.device.xiaomi.MonobService$g0 r3 = r13.f13864a
                r3.mo34386a(r4, r5, r6, r7, r8, r9, r10, r11, r12)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.xiaomi.MonobService.C7817u.onSucceed(com.miot.common.device.invocation.PropertyInfo):void");
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonobService$v */
    class C7818v implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7797f0 f13865a;

        C7818v(MonobService monobService, C7797f0 f0Var) {
            this.f13865a = f0Var;
        }

        public void onFailed(int i, String str) {
            this.f13865a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Power");
            if (property.isValueValid()) {
                this.f13865a.mo34384a(Power.valueOf((String) propertyInfo.getValue("Power")));
                return;
            }
            C7797f0 f0Var = this.f13865a;
            f0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonobService$w */
    class C7819w implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7787a0 f13866a;

        C7819w(MonobService monobService, C7787a0 a0Var) {
            this.f13866a = a0Var;
        }

        public void onFailed(int i, String str) {
            this.f13866a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Bright");
            if (property.isValueValid()) {
                this.f13866a.mo34374a((Long) propertyInfo.getValue("Bright"));
                return;
            }
            C7787a0 a0Var = this.f13866a;
            a0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonobService$x */
    class C7820x implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7789b0 f13867a;

        C7820x(MonobService monobService, C7789b0 b0Var) {
            this.f13867a = b0Var;
        }

        public void onFailed(int i, String str) {
            this.f13867a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("DelayOff");
            if (property.isValueValid()) {
                this.f13867a.mo34376a((Long) propertyInfo.getValue("DelayOff"));
                return;
            }
            C7789b0 b0Var = this.f13867a;
            b0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonobService$y */
    class C7821y implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7801h0 f13868a;

        C7821y(MonobService monobService, C7801h0 h0Var) {
            this.f13868a = h0Var;
        }

        public void onFailed(int i, String str) {
            this.f13868a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("SaveState");
            if (property.isValueValid()) {
                this.f13868a.mo34388a((Long) propertyInfo.getValue("SaveState"));
                return;
            }
            C7801h0 h0Var = this.f13868a;
            h0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonobService$z */
    class C7822z implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7791c0 f13869a;

        C7822z(MonobService monobService, C7791c0 c0Var) {
            this.f13869a = c0Var;
        }

        public void onFailed(int i, String str) {
            this.f13869a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("FlowParams");
            if (property.isValueValid()) {
                this.f13869a.onSucceed((String) propertyInfo.getValue("FlowParams"));
                return;
            }
            C7791c0 c0Var = this.f13869a;
            c0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    public MonobService(AbstractDevice abstractDevice) {
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
                MiotManager.getDeviceManipulator().invoke(create, new C7810n(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7796f(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getBright(C7787a0 a0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Bright"), new C7819w(this, a0Var));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7814r(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getDelayOff(C7789b0 b0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "DelayOff"), new C7820x(this, b0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowParams(C7791c0 c0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "FlowParams"), new C7822z(this, c0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowing(C7793d0 d0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Flowing"), new C7792d(this, d0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getLanMode(C7795e0 e0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "LanMode"), new C7786a(this, e0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getPower(C7797f0 f0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Power"), new C7818v(this, f0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getProperties(C7799g0 g0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            PropertyInfo create = PropertyInfoFactory.create(getService());
            create.addProperty(getService().getProperty("Power"));
            create.addProperty(getService().getProperty("Bright"));
            create.addProperty(getService().getProperty("DelayOff"));
            create.addProperty(getService().getProperty("SaveState"));
            create.addProperty(getService().getProperty("FlowParams"));
            create.addProperty(getService().getProperty("LanMode"));
            create.addProperty(getService().getProperty("TransIntervalDflt"));
            create.addProperty(getService().getProperty("onFromPower"));
            create.addProperty(getService().getProperty("Flowing"));
            MiotManager.getDeviceManipulator().readProperty(create, new C7817u(this, g0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getSaveState(C7801h0 h0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "SaveState"), new C7821y(this, h0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getTransIntervalDflt(C7803i0 i0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "TransIntervalDflt"), new C7788b(this, i0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getonFromPower(C7805j0 j0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "onFromPower"), new C7790c(this, j0Var));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7804j(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7798g(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7812p(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setBright(Long l, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setBright");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (create.setArgumentValue("Bright", l)) {
                MiotManager.getDeviceManipulator().invoke(create, new C7794e(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7811o(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7813q(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7808l(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7800h(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setScene2(String str, Long l, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setScene2");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("ParamModel", str)) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("ParamCount", l)) {
                MiotManager.getDeviceManipulator().invoke(create, new C7802i(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void subscribeNotifications(CompletionHandler completionHandler, C7807k0 k0Var) {
        if (completionHandler == null) {
            throw new IllegalArgumentException("handler is null");
        } else if (k0Var != null) {
            PropertyInfo create = PropertyInfoFactory.create(getService());
            for (Property next : getService().getProperties()) {
                if (next.getDefinition().isNotifiable()) {
                    create.addProperty(next);
                }
            }
            MiotManager.getDeviceManipulator().addPropertyChangedListener(create, new C7806k(this, completionHandler), new C7815s(this, k0Var));
        } else {
            throw new IllegalArgumentException("listener is null");
        }
    }

    public void toggle(CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "toggle");
            if (create != null) {
                MiotManager.getDeviceManipulator().invoke(create, new C7809m(this, completionHandler));
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
            MiotManager.getDeviceManipulator().removePropertyChangedListener(create, new C7816t(this, completionHandler));
            return;
        }
        throw new IllegalArgumentException("handler is null");
    }
}
