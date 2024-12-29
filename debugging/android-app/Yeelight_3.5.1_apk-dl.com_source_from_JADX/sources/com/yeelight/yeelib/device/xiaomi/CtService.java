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

public class CtService extends AbstractService {
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
    public static final String PROPERTY_ParamColors = "ParamColors";
    public static final String PROPERTY_ParamCount = "ParamCount";
    public static final String PROPERTY_ParamFinish = "ParamFinish";
    public static final String PROPERTY_ParamModel = "ParamModel";
    public static final String PROPERTY_Power = "Power";
    public static final String PROPERTY_SaveState = "SaveState";
    public static final String PROPERTY_onFromPower = "onFromPower";
    private static final String TAG = "CtService";
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

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtService$a */
    class C7274a implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7291i0 f13479a;

        C7274a(CtService ctService, C7291i0 i0Var) {
            this.f13479a = i0Var;
        }

        public void onFailed(int i, String str) {
            this.f13479a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("SaveState");
            if (property.isValueValid()) {
                this.f13479a.mo33625a((Long) propertyInfo.getValue("SaveState"));
                return;
            }
            C7291i0 i0Var = this.f13479a;
            i0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtService$a0 */
    public interface C7275a0 {
        /* renamed from: a */
        void mo33609a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtService$b */
    class C7276b implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7285f0 f13480a;

        C7276b(CtService ctService, C7285f0 f0Var) {
            this.f13480a = f0Var;
        }

        public void onFailed(int i, String str) {
            this.f13480a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("LanMode");
            if (property.isValueValid()) {
                this.f13480a.mo33619a((Long) propertyInfo.getValue("LanMode"));
                return;
            }
            C7285f0 f0Var = this.f13480a;
            f0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtService$b0 */
    public interface C7277b0 {
        /* renamed from: a */
        void mo33611a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtService$c */
    class C7278c implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7293j0 f13481a;

        C7278c(CtService ctService, C7293j0 j0Var) {
            this.f13481a = j0Var;
        }

        public void onFailed(int i, String str) {
            this.f13481a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("onFromPower");
            if (property.isValueValid()) {
                this.f13481a.mo33627a((Long) propertyInfo.getValue("onFromPower"));
                return;
            }
            C7293j0 j0Var = this.f13481a;
            j0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtService$c0 */
    public interface C7279c0 {
        /* renamed from: a */
        void mo33613a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtService$d */
    class C7280d implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7283e0 f13482a;

        C7280d(CtService ctService, C7283e0 e0Var) {
            this.f13482a = e0Var;
        }

        public void onFailed(int i, String str) {
            this.f13482a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Flowing");
            if (property.isValueValid()) {
                this.f13482a.mo33617a((Long) propertyInfo.getValue("Flowing"));
                return;
            }
            C7283e0 e0Var = this.f13482a;
            e0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtService$d0 */
    public interface C7281d0 {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtService$e */
    class C7282e implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13483a;

        C7282e(CtService ctService, CompletionHandler completionHandler) {
            this.f13483a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13483a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13483a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtService$e0 */
    public interface C7283e0 {
        /* renamed from: a */
        void mo33617a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtService$f */
    class C7284f implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13484a;

        C7284f(CtService ctService, CompletionHandler completionHandler) {
            this.f13484a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13484a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13484a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtService$f0 */
    public interface C7285f0 {
        /* renamed from: a */
        void mo33619a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtService$g */
    class C7286g implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13485a;

        C7286g(CtService ctService, CompletionHandler completionHandler) {
            this.f13485a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13485a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13485a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtService$g0 */
    public interface C7287g0 {
        /* renamed from: a */
        void mo33621a(Power power);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtService$h */
    class C7288h implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13486a;

        C7288h(CtService ctService, CompletionHandler completionHandler) {
            this.f13486a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13486a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13486a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtService$h0 */
    public interface C7289h0 {
        /* renamed from: a */
        void mo33623a(Power power, Long l, Long l2, String str, Long l3, Long l4, Long l5, Long l6, Long l7);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtService$i */
    class C7290i implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13487a;

        C7290i(CtService ctService, CompletionHandler completionHandler) {
            this.f13487a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13487a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13487a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtService$i0 */
    public interface C7291i0 {
        /* renamed from: a */
        void mo33625a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtService$j */
    class C7292j implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13488a;

        C7292j(CtService ctService, CompletionHandler completionHandler) {
            this.f13488a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13488a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13488a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtService$j0 */
    public interface C7293j0 {
        /* renamed from: a */
        void mo33627a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtService$k */
    class C7294k implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13489a;

        C7294k(CtService ctService, CompletionHandler completionHandler) {
            this.f13489a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13489a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f13489a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtService$k0 */
    public interface C7295k0 {
        /* renamed from: a */
        void mo33629a(Long l);

        /* renamed from: b */
        void mo33630b(Long l);

        /* renamed from: c */
        void mo33631c(Long l);

        /* renamed from: d */
        void mo33632d(Long l);

        /* renamed from: e */
        void mo33633e(String str);

        /* renamed from: f */
        void mo33634f(Long l);

        /* renamed from: g */
        void mo33635g(Long l);

        /* renamed from: h */
        void mo33636h(Long l);

        /* renamed from: i */
        void mo33637i(Power power);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtService$l */
    class C7296l implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13490a;

        C7296l(CtService ctService, CompletionHandler completionHandler) {
            this.f13490a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13490a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13490a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtService$m */
    class C7297m implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13491a;

        C7297m(CtService ctService, CompletionHandler completionHandler) {
            this.f13491a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13491a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13491a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtService$n */
    class C7298n implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13492a;

        C7298n(CtService ctService, CompletionHandler completionHandler) {
            this.f13492a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13492a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13492a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtService$o */
    class C7299o implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13493a;

        C7299o(CtService ctService, CompletionHandler completionHandler) {
            this.f13493a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13493a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13493a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtService$p */
    class C7300p implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13494a;

        C7300p(CtService ctService, CompletionHandler completionHandler) {
            this.f13494a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13494a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13494a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtService$q */
    class C7301q implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13495a;

        C7301q(CtService ctService, CompletionHandler completionHandler) {
            this.f13495a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13495a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13495a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtService$r */
    class C7302r implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13496a;

        C7302r(CtService ctService, CompletionHandler completionHandler) {
            this.f13496a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13496a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13496a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtService$s */
    class C7303s implements DeviceManipulator.PropertyChangedListener {

        /* renamed from: a */
        final /* synthetic */ C7295k0 f13497a;

        C7303s(CtService ctService, C7295k0 k0Var) {
            this.f13497a = k0Var;
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
                case 2193:
                    if (str.equals("Ct")) {
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
                        this.f13497a.mo33631c((Long) propertyInfo.getValue("SaveState"));
                        return;
                    }
                    return;
                case 1:
                    if (propertyInfo.getProperty("FlowParams").isValueValid()) {
                        this.f13497a.mo33633e((String) propertyInfo.getValue("FlowParams"));
                        return;
                    }
                    return;
                case 2:
                    if (propertyInfo.getProperty("Ct").isValueValid()) {
                        this.f13497a.mo33636h((Long) propertyInfo.getValue("Ct"));
                        return;
                    }
                    return;
                case 3:
                    if (propertyInfo.getProperty("onFromPower").isValueValid()) {
                        this.f13497a.mo33634f((Long) propertyInfo.getValue("onFromPower"));
                        return;
                    }
                    return;
                case 4:
                    if (propertyInfo.getProperty("Power").isValueValid()) {
                        this.f13497a.mo33637i(Power.valueOf((String) propertyInfo.getValue("Power")));
                        return;
                    }
                    return;
                case 5:
                    if (propertyInfo.getProperty("DelayOff").isValueValid()) {
                        this.f13497a.mo33630b((Long) propertyInfo.getValue("DelayOff"));
                        return;
                    }
                    return;
                case 6:
                    if (propertyInfo.getProperty("Flowing").isValueValid()) {
                        this.f13497a.mo33632d((Long) propertyInfo.getValue("Flowing"));
                        return;
                    }
                    return;
                case 7:
                    if (propertyInfo.getProperty("LanMode").isValueValid()) {
                        this.f13497a.mo33635g((Long) propertyInfo.getValue("LanMode"));
                        return;
                    }
                    return;
                case 8:
                    if (propertyInfo.getProperty("Bright").isValueValid()) {
                        this.f13497a.mo33629a((Long) propertyInfo.getValue("Bright"));
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtService$t */
    class C7304t implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13498a;

        C7304t(CtService ctService, CompletionHandler completionHandler) {
            this.f13498a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13498a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f13498a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtService$u */
    class C7305u implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7289h0 f13499a;

        C7305u(CtService ctService, C7289h0 h0Var) {
            this.f13499a = h0Var;
        }

        public void onFailed(int i, String str) {
            this.f13499a.onFailed(i, str);
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
                com.yeelight.yeelib.device.xiaomi.CtService$Power r0 = com.yeelight.yeelib.device.xiaomi.CtService.Power.valueOf(r0)
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
                java.lang.String r0 = "Ct"
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
                java.lang.String r0 = "FlowParams"
                com.miot.common.property.Property r0 = r14.getProperty(r0)
                boolean r1 = r0.isValueValid()
                if (r1 == 0) goto L_0x0058
                java.lang.Object r0 = r0.getValue()
                java.lang.String r0 = (java.lang.String) r0
                r7 = r0
                goto L_0x0059
            L_0x0058:
                r7 = r2
            L_0x0059:
                java.lang.String r0 = "DelayOff"
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
                java.lang.String r0 = "SaveState"
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
                com.yeelight.yeelib.device.xiaomi.CtService$h0 r3 = r13.f13499a
                r3.mo33623a(r4, r5, r6, r7, r8, r9, r10, r11, r12)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.xiaomi.CtService.C7305u.onSucceed(com.miot.common.device.invocation.PropertyInfo):void");
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtService$v */
    class C7306v implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7287g0 f13500a;

        C7306v(CtService ctService, C7287g0 g0Var) {
            this.f13500a = g0Var;
        }

        public void onFailed(int i, String str) {
            this.f13500a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Power");
            if (property.isValueValid()) {
                this.f13500a.mo33621a(Power.valueOf((String) propertyInfo.getValue("Power")));
                return;
            }
            C7287g0 g0Var = this.f13500a;
            g0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtService$w */
    class C7307w implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7275a0 f13501a;

        C7307w(CtService ctService, C7275a0 a0Var) {
            this.f13501a = a0Var;
        }

        public void onFailed(int i, String str) {
            this.f13501a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Bright");
            if (property.isValueValid()) {
                this.f13501a.mo33609a((Long) propertyInfo.getValue("Bright"));
                return;
            }
            C7275a0 a0Var = this.f13501a;
            a0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtService$x */
    class C7308x implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7277b0 f13502a;

        C7308x(CtService ctService, C7277b0 b0Var) {
            this.f13502a = b0Var;
        }

        public void onFailed(int i, String str) {
            this.f13502a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Ct");
            if (property.isValueValid()) {
                this.f13502a.mo33611a((Long) propertyInfo.getValue("Ct"));
                return;
            }
            C7277b0 b0Var = this.f13502a;
            b0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtService$y */
    class C7309y implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7281d0 f13503a;

        C7309y(CtService ctService, C7281d0 d0Var) {
            this.f13503a = d0Var;
        }

        public void onFailed(int i, String str) {
            this.f13503a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("FlowParams");
            if (property.isValueValid()) {
                this.f13503a.onSucceed((String) propertyInfo.getValue("FlowParams"));
                return;
            }
            C7281d0 d0Var = this.f13503a;
            d0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtService$z */
    class C7310z implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7279c0 f13504a;

        C7310z(CtService ctService, C7279c0 c0Var) {
            this.f13504a = c0Var;
        }

        public void onFailed(int i, String str) {
            this.f13504a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("DelayOff");
            if (property.isValueValid()) {
                this.f13504a.mo33613a((Long) propertyInfo.getValue("DelayOff"));
                return;
            }
            C7279c0 c0Var = this.f13504a;
            c0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    public CtService(AbstractDevice abstractDevice) {
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
                MiotManager.getDeviceManipulator().invoke(create, new C7297m(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7284f(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getBright(C7275a0 a0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Bright"), new C7307w(this, a0Var));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7302r(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getCt(C7277b0 b0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Ct"), new C7308x(this, b0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getDelayOff(C7279c0 c0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "DelayOff"), new C7310z(this, c0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowParams(C7281d0 d0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "FlowParams"), new C7309y(this, d0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowing(C7283e0 e0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Flowing"), new C7280d(this, e0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getLanMode(C7285f0 f0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "LanMode"), new C7276b(this, f0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getPower(C7287g0 g0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Power"), new C7306v(this, g0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getProperties(C7289h0 h0Var) {
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
            MiotManager.getDeviceManipulator().readProperty(create, new C7305u(this, h0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getSaveState(C7291i0 i0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "SaveState"), new C7274a(this, i0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getonFromPower(C7293j0 j0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "onFromPower"), new C7278c(this, j0Var));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7290i(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7286g(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7299o(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7282e(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7301q(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7298n(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7300p(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7292j(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7288h(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void subscribeNotifications(CompletionHandler completionHandler, C7295k0 k0Var) {
        if (completionHandler == null) {
            throw new IllegalArgumentException("handler is null");
        } else if (k0Var != null) {
            PropertyInfo create = PropertyInfoFactory.create(getService());
            for (Property next : getService().getProperties()) {
                if (next.getDefinition().isNotifiable()) {
                    create.addProperty(next);
                }
            }
            MiotManager.getDeviceManipulator().addPropertyChangedListener(create, new C7294k(this, completionHandler), new C7303s(this, k0Var));
        } else {
            throw new IllegalArgumentException("listener is null");
        }
    }

    public void toggle(CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "toggle");
            if (create != null) {
                MiotManager.getDeviceManipulator().invoke(create, new C7296l(this, completionHandler));
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
            MiotManager.getDeviceManipulator().removePropertyChangedListener(create, new C7304t(this, completionHandler));
            return;
        }
        throw new IllegalArgumentException("handler is null");
    }
}
