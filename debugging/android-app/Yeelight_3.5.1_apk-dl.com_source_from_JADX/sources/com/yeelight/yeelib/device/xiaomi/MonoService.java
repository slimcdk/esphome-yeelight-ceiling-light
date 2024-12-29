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

public class MonoService extends AbstractService {
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
    public static final String PROPERTY_Temperature = "Temperature";
    public static final String PROPERTY_onFromPower = "onFromPower";
    private static final String TAG = "MonoService";
    private AbstractDevice mDevice = null;

    public enum CmdKey {
        undefined,
        cfg_pomodoro,
        cfg_lan_ctrl,
        cfg_save_state,
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

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonoService$a */
    class C7750a implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7753b0 f13818a;

        C7750a(MonoService monoService, C7753b0 b0Var) {
            this.f13818a = b0Var;
        }

        public void onFailed(int i, String str) {
            this.f13818a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("FlowParams");
            if (property.isValueValid()) {
                this.f13818a.onSucceed((String) propertyInfo.getValue("FlowParams"));
                return;
            }
            C7753b0 b0Var = this.f13818a;
            b0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonoService$a0 */
    public interface C7751a0 {
        /* renamed from: a */
        void mo34321a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonoService$b */
    class C7752b implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7757d0 f13819a;

        C7752b(MonoService monoService, C7757d0 d0Var) {
            this.f13819a = d0Var;
        }

        public void onFailed(int i, String str) {
            this.f13819a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("LanMode");
            if (property.isValueValid()) {
                this.f13819a.mo34327a((Long) propertyInfo.getValue("LanMode"));
                return;
            }
            C7757d0 d0Var = this.f13819a;
            d0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonoService$b0 */
    public interface C7753b0 {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonoService$c */
    class C7754c implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7767i0 f13820a;

        C7754c(MonoService monoService, C7767i0 i0Var) {
            this.f13820a = i0Var;
        }

        public void onFailed(int i, String str) {
            this.f13820a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("onFromPower");
            if (property.isValueValid()) {
                this.f13820a.mo34337a((Long) propertyInfo.getValue("onFromPower"));
                return;
            }
            C7767i0 i0Var = this.f13820a;
            i0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonoService$c0 */
    public interface C7755c0 {
        /* renamed from: a */
        void mo34325a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonoService$d */
    class C7756d implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7755c0 f13821a;

        C7756d(MonoService monoService, C7755c0 c0Var) {
            this.f13821a = c0Var;
        }

        public void onFailed(int i, String str) {
            this.f13821a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Flowing");
            if (property.isValueValid()) {
                this.f13821a.mo34325a((Long) propertyInfo.getValue("Flowing"));
                return;
            }
            C7755c0 c0Var = this.f13821a;
            c0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonoService$d0 */
    public interface C7757d0 {
        /* renamed from: a */
        void mo34327a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonoService$e */
    class C7758e implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13822a;

        C7758e(MonoService monoService, CompletionHandler completionHandler) {
            this.f13822a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13822a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13822a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonoService$e0 */
    public interface C7759e0 {
        /* renamed from: a */
        void mo34329a(Power power);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonoService$f */
    class C7760f implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13823a;

        C7760f(MonoService monoService, CompletionHandler completionHandler) {
            this.f13823a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13823a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13823a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonoService$f0 */
    public interface C7761f0 {
        /* renamed from: a */
        void mo34331a(Power power, Long l, Long l2, Long l3, Long l4, String str, Long l5, Long l6, Long l7);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonoService$g */
    class C7762g implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13824a;

        C7762g(MonoService monoService, CompletionHandler completionHandler) {
            this.f13824a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13824a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13824a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonoService$g0 */
    public interface C7763g0 {
        /* renamed from: a */
        void mo34333a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonoService$h */
    class C7764h implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13825a;

        C7764h(MonoService monoService, CompletionHandler completionHandler) {
            this.f13825a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13825a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13825a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonoService$h0 */
    public interface C7765h0 {
        /* renamed from: a */
        void mo34335a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonoService$i */
    class C7766i implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13826a;

        C7766i(MonoService monoService, CompletionHandler completionHandler) {
            this.f13826a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13826a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13826a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonoService$i0 */
    public interface C7767i0 {
        /* renamed from: a */
        void mo34337a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonoService$j */
    class C7768j implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13827a;

        C7768j(MonoService monoService, CompletionHandler completionHandler) {
            this.f13827a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13827a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13827a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonoService$j0 */
    public interface C7769j0 {
        /* renamed from: a */
        void mo34339a(Long l);

        /* renamed from: b */
        void mo34340b(Long l);

        /* renamed from: c */
        void mo34341c(Long l);

        /* renamed from: d */
        void mo34342d(Long l);

        /* renamed from: e */
        void mo34343e(String str);

        /* renamed from: f */
        void mo34344f(Long l);

        /* renamed from: g */
        void mo34345g(Long l);

        /* renamed from: h */
        void mo34346h(Power power);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonoService$k */
    class C7770k implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13828a;

        C7770k(MonoService monoService, CompletionHandler completionHandler) {
            this.f13828a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13828a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f13828a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonoService$l */
    class C7771l implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13829a;

        C7771l(MonoService monoService, CompletionHandler completionHandler) {
            this.f13829a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13829a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13829a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonoService$m */
    class C7772m implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13830a;

        C7772m(MonoService monoService, CompletionHandler completionHandler) {
            this.f13830a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13830a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13830a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonoService$n */
    class C7773n implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13831a;

        C7773n(MonoService monoService, CompletionHandler completionHandler) {
            this.f13831a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13831a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13831a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonoService$o */
    class C7774o implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13832a;

        C7774o(MonoService monoService, CompletionHandler completionHandler) {
            this.f13832a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13832a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13832a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonoService$p */
    class C7775p implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13833a;

        C7775p(MonoService monoService, CompletionHandler completionHandler) {
            this.f13833a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13833a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13833a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonoService$q */
    class C7776q implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13834a;

        C7776q(MonoService monoService, CompletionHandler completionHandler) {
            this.f13834a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13834a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13834a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonoService$r */
    class C7777r implements DeviceManipulator.PropertyChangedListener {

        /* renamed from: a */
        final /* synthetic */ C7769j0 f13835a;

        C7777r(MonoService monoService, C7769j0 j0Var) {
            this.f13835a = j0Var;
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
                case 35911772:
                    if (str.equals("onFromPower")) {
                        c = 2;
                        break;
                    }
                    break;
                case 77306085:
                    if (str.equals("Power")) {
                        c = 3;
                        break;
                    }
                    break;
                case 880790796:
                    if (str.equals("DelayOff")) {
                        c = 4;
                        break;
                    }
                    break;
                case 898856916:
                    if (str.equals("Flowing")) {
                        c = 5;
                        break;
                    }
                    break;
                case 1611821756:
                    if (str.equals("LanMode")) {
                        c = 6;
                        break;
                    }
                    break;
                case 1998035738:
                    if (str.equals("Bright")) {
                        c = 7;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    if (propertyInfo.getProperty("SaveState").isValueValid()) {
                        this.f13835a.mo34341c((Long) propertyInfo.getValue("SaveState"));
                        return;
                    }
                    return;
                case 1:
                    if (propertyInfo.getProperty("FlowParams").isValueValid()) {
                        this.f13835a.mo34343e((String) propertyInfo.getValue("FlowParams"));
                        return;
                    }
                    return;
                case 2:
                    if (propertyInfo.getProperty("onFromPower").isValueValid()) {
                        this.f13835a.mo34344f((Long) propertyInfo.getValue("onFromPower"));
                        return;
                    }
                    return;
                case 3:
                    if (propertyInfo.getProperty("Power").isValueValid()) {
                        this.f13835a.mo34346h(Power.valueOf((String) propertyInfo.getValue("Power")));
                        return;
                    }
                    return;
                case 4:
                    if (propertyInfo.getProperty("DelayOff").isValueValid()) {
                        this.f13835a.mo34340b((Long) propertyInfo.getValue("DelayOff"));
                        return;
                    }
                    return;
                case 5:
                    if (propertyInfo.getProperty("Flowing").isValueValid()) {
                        this.f13835a.mo34342d((Long) propertyInfo.getValue("Flowing"));
                        return;
                    }
                    return;
                case 6:
                    if (propertyInfo.getProperty("LanMode").isValueValid()) {
                        this.f13835a.mo34345g((Long) propertyInfo.getValue("LanMode"));
                        return;
                    }
                    return;
                case 7:
                    if (propertyInfo.getProperty("Bright").isValueValid()) {
                        this.f13835a.mo34339a((Long) propertyInfo.getValue("Bright"));
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonoService$s */
    class C7778s implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13836a;

        C7778s(MonoService monoService, CompletionHandler completionHandler) {
            this.f13836a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13836a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f13836a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonoService$t */
    class C7779t implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7761f0 f13837a;

        C7779t(MonoService monoService, C7761f0 f0Var) {
            this.f13837a = f0Var;
        }

        public void onFailed(int i, String str) {
            this.f13837a.onFailed(i, str);
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
                com.yeelight.yeelib.device.xiaomi.MonoService$Power r0 = com.yeelight.yeelib.device.xiaomi.MonoService.Power.valueOf(r0)
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
                java.lang.String r0 = "Temperature"
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
                java.lang.String r0 = "DelayOff"
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
                java.lang.String r0 = "SaveState"
                com.miot.common.property.Property r0 = r14.getProperty(r0)
                boolean r1 = r0.isValueValid()
                if (r1 == 0) goto L_0x006d
                java.lang.Object r0 = r0.getValue()
                java.lang.Long r0 = (java.lang.Long) r0
                r8 = r0
                goto L_0x006e
            L_0x006d:
                r8 = r2
            L_0x006e:
                java.lang.String r0 = "FlowParams"
                com.miot.common.property.Property r0 = r14.getProperty(r0)
                boolean r1 = r0.isValueValid()
                if (r1 == 0) goto L_0x0082
                java.lang.Object r0 = r0.getValue()
                java.lang.String r0 = (java.lang.String) r0
                r9 = r0
                goto L_0x0083
            L_0x0082:
                r9 = r2
            L_0x0083:
                java.lang.String r0 = "LanMode"
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
                com.yeelight.yeelib.device.xiaomi.MonoService$f0 r3 = r13.f13837a
                r3.mo34331a(r4, r5, r6, r7, r8, r9, r10, r11, r12)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.xiaomi.MonoService.C7779t.onSucceed(com.miot.common.device.invocation.PropertyInfo):void");
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonoService$u */
    class C7780u implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7759e0 f13838a;

        C7780u(MonoService monoService, C7759e0 e0Var) {
            this.f13838a = e0Var;
        }

        public void onFailed(int i, String str) {
            this.f13838a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Power");
            if (property.isValueValid()) {
                this.f13838a.mo34329a(Power.valueOf((String) propertyInfo.getValue("Power")));
                return;
            }
            C7759e0 e0Var = this.f13838a;
            e0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonoService$v */
    class C7781v implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7785z f13839a;

        C7781v(MonoService monoService, C7785z zVar) {
            this.f13839a = zVar;
        }

        public void onFailed(int i, String str) {
            this.f13839a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Bright");
            if (property.isValueValid()) {
                this.f13839a.mo34347a((Long) propertyInfo.getValue("Bright"));
                return;
            }
            C7785z zVar = this.f13839a;
            zVar.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonoService$w */
    class C7782w implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7765h0 f13840a;

        C7782w(MonoService monoService, C7765h0 h0Var) {
            this.f13840a = h0Var;
        }

        public void onFailed(int i, String str) {
            this.f13840a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Temperature");
            if (property.isValueValid()) {
                this.f13840a.mo34335a((Long) propertyInfo.getValue("Temperature"));
                return;
            }
            C7765h0 h0Var = this.f13840a;
            h0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonoService$x */
    class C7783x implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7751a0 f13841a;

        C7783x(MonoService monoService, C7751a0 a0Var) {
            this.f13841a = a0Var;
        }

        public void onFailed(int i, String str) {
            this.f13841a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("DelayOff");
            if (property.isValueValid()) {
                this.f13841a.mo34321a((Long) propertyInfo.getValue("DelayOff"));
                return;
            }
            C7751a0 a0Var = this.f13841a;
            a0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonoService$y */
    class C7784y implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7763g0 f13842a;

        C7784y(MonoService monoService, C7763g0 g0Var) {
            this.f13842a = g0Var;
        }

        public void onFailed(int i, String str) {
            this.f13842a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("SaveState");
            if (property.isValueValid()) {
                this.f13842a.mo34333a((Long) propertyInfo.getValue("SaveState"));
                return;
            }
            C7763g0 g0Var = this.f13842a;
            g0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonoService$z */
    public interface C7785z {
        /* renamed from: a */
        void mo34347a(Long l);

        void onFailed(int i, String str);
    }

    public MonoService(AbstractDevice abstractDevice) {
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
                MiotManager.getDeviceManipulator().invoke(create, new C7775p(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7762g(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getBright(C7785z zVar) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Bright"), new C7781v(this, zVar));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7774o(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getDelayOff(C7751a0 a0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "DelayOff"), new C7783x(this, a0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowParams(C7753b0 b0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "FlowParams"), new C7750a(this, b0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowing(C7755c0 c0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Flowing"), new C7756d(this, c0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getLanMode(C7757d0 d0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "LanMode"), new C7752b(this, d0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getPower(C7759e0 e0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Power"), new C7780u(this, e0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getProperties(C7761f0 f0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            PropertyInfo create = PropertyInfoFactory.create(getService());
            create.addProperty(getService().getProperty("Power"));
            create.addProperty(getService().getProperty("Bright"));
            create.addProperty(getService().getProperty("Temperature"));
            create.addProperty(getService().getProperty("DelayOff"));
            create.addProperty(getService().getProperty("SaveState"));
            create.addProperty(getService().getProperty("FlowParams"));
            create.addProperty(getService().getProperty("LanMode"));
            create.addProperty(getService().getProperty("onFromPower"));
            create.addProperty(getService().getProperty("Flowing"));
            MiotManager.getDeviceManipulator().readProperty(create, new C7779t(this, f0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getSaveState(C7763g0 g0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "SaveState"), new C7784y(this, g0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getTemperature(C7765h0 h0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Temperature"), new C7782w(this, h0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getonFromPower(C7767i0 i0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "onFromPower"), new C7754c(this, i0Var));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7771l(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7764h(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7758e(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7760f(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7776q(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7766i(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7772m(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7768j(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void subscribeNotifications(CompletionHandler completionHandler, C7769j0 j0Var) {
        if (completionHandler == null) {
            throw new IllegalArgumentException("handler is null");
        } else if (j0Var != null) {
            PropertyInfo create = PropertyInfoFactory.create(getService());
            for (Property next : getService().getProperties()) {
                if (next.getDefinition().isNotifiable()) {
                    create.addProperty(next);
                }
            }
            MiotManager.getDeviceManipulator().addPropertyChangedListener(create, new C7770k(this, completionHandler), new C7777r(this, j0Var));
        } else {
            throw new IllegalArgumentException("listener is null");
        }
    }

    public void toggle(CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "toggle");
            if (create != null) {
                MiotManager.getDeviceManipulator().invoke(create, new C7773n(this, completionHandler));
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
            MiotManager.getDeviceManipulator().removePropertyChangedListener(create, new C7778s(this, completionHandler));
            return;
        }
        throw new IllegalArgumentException("handler is null");
    }
}
