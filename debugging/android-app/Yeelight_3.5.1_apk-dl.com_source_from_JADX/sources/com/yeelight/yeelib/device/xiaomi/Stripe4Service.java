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

public class Stripe4Service extends AbstractService {
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
    public static final String PROPERTY_SmartSwitch = "SmartSwitch";
    public static final String PROPERTY_onFromPower = "onFromPower";
    private static final String TAG = "Stripe4Service";
    private AbstractDevice mDevice = null;

    public enum CmdKey {
        undefined,
        cfg_pomodoro,
        cfg_lan_ctrl,
        cfg_save_state,
        cfg_init_power,
        cfg_smart_switch,
        pseudo_beacon
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

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe4Service$a */
    class C8005a implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8024j0 f14000a;

        C8005a(Stripe4Service stripe4Service, C8024j0 j0Var) {
            this.f14000a = j0Var;
        }

        public void onFailed(int i, String str) {
            this.f14000a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("SaveState");
            if (property.isValueValid()) {
                this.f14000a.mo34716a((Long) propertyInfo.getValue("SaveState"));
                return;
            }
            C8024j0 j0Var = this.f14000a;
            j0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe4Service$a0 */
    class C8006a0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8012d0 f14001a;

        C8006a0(Stripe4Service stripe4Service, C8012d0 d0Var) {
            this.f14001a = d0Var;
        }

        public void onFailed(int i, String str) {
            this.f14001a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("DelayOff");
            if (property.isValueValid()) {
                this.f14001a.mo34704a((Long) propertyInfo.getValue("DelayOff"));
                return;
            }
            C8012d0 d0Var = this.f14001a;
            d0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe4Service$b */
    class C8007b implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8018g0 f14002a;

        C8007b(Stripe4Service stripe4Service, C8018g0 g0Var) {
            this.f14002a = g0Var;
        }

        public void onFailed(int i, String str) {
            this.f14002a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("LanMode");
            if (property.isValueValid()) {
                this.f14002a.mo34710a((Long) propertyInfo.getValue("LanMode"));
                return;
            }
            C8018g0 g0Var = this.f14002a;
            g0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe4Service$b0 */
    public interface C8008b0 {
        /* renamed from: a */
        void mo34700a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe4Service$c */
    class C8009c implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8028l0 f14003a;

        C8009c(Stripe4Service stripe4Service, C8028l0 l0Var) {
            this.f14003a = l0Var;
        }

        public void onFailed(int i, String str) {
            this.f14003a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("onFromPower");
            if (property.isValueValid()) {
                this.f14003a.mo34720a((Long) propertyInfo.getValue("onFromPower"));
                return;
            }
            C8028l0 l0Var = this.f14003a;
            l0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe4Service$c0 */
    public interface C8010c0 {
        /* renamed from: a */
        void mo34702a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe4Service$d */
    class C8011d implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8016f0 f14004a;

        C8011d(Stripe4Service stripe4Service, C8016f0 f0Var) {
            this.f14004a = f0Var;
        }

        public void onFailed(int i, String str) {
            this.f14004a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Flowing");
            if (property.isValueValid()) {
                this.f14004a.mo34708a((Long) propertyInfo.getValue("Flowing"));
                return;
            }
            C8016f0 f0Var = this.f14004a;
            f0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe4Service$d0 */
    public interface C8012d0 {
        /* renamed from: a */
        void mo34704a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe4Service$e */
    class C8013e implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8026k0 f14005a;

        C8013e(Stripe4Service stripe4Service, C8026k0 k0Var) {
            this.f14005a = k0Var;
        }

        public void onFailed(int i, String str) {
            this.f14005a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("SmartSwitch");
            if (property.isValueValid()) {
                this.f14005a.mo34718a((Long) propertyInfo.getValue("SmartSwitch"));
                return;
            }
            C8026k0 k0Var = this.f14005a;
            k0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe4Service$e0 */
    public interface C8014e0 {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe4Service$f */
    class C8015f implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f14006a;

        C8015f(Stripe4Service stripe4Service, CompletionHandler completionHandler) {
            this.f14006a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f14006a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f14006a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe4Service$f0 */
    public interface C8016f0 {
        /* renamed from: a */
        void mo34708a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe4Service$g */
    class C8017g implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f14007a;

        C8017g(Stripe4Service stripe4Service, CompletionHandler completionHandler) {
            this.f14007a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f14007a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f14007a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe4Service$g0 */
    public interface C8018g0 {
        /* renamed from: a */
        void mo34710a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe4Service$h */
    class C8019h implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f14008a;

        C8019h(Stripe4Service stripe4Service, CompletionHandler completionHandler) {
            this.f14008a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f14008a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f14008a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe4Service$h0 */
    public interface C8020h0 {
        /* renamed from: a */
        void mo34712a(Power power);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe4Service$i */
    class C8021i implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f14009a;

        C8021i(Stripe4Service stripe4Service, CompletionHandler completionHandler) {
            this.f14009a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f14009a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f14009a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe4Service$i0 */
    public interface C8022i0 {
        /* renamed from: a */
        void mo34714a(Power power, Long l, Long l2, String str, Long l3, Long l4, Long l5, Long l6, Long l7, Long l8);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe4Service$j */
    class C8023j implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f14010a;

        C8023j(Stripe4Service stripe4Service, CompletionHandler completionHandler) {
            this.f14010a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f14010a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f14010a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe4Service$j0 */
    public interface C8024j0 {
        /* renamed from: a */
        void mo34716a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe4Service$k */
    class C8025k implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f14011a;

        C8025k(Stripe4Service stripe4Service, CompletionHandler completionHandler) {
            this.f14011a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f14011a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f14011a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe4Service$k0 */
    public interface C8026k0 {
        /* renamed from: a */
        void mo34718a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe4Service$l */
    class C8027l implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f14012a;

        C8027l(Stripe4Service stripe4Service, CompletionHandler completionHandler) {
            this.f14012a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f14012a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f14012a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe4Service$l0 */
    public interface C8028l0 {
        /* renamed from: a */
        void mo34720a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe4Service$m */
    class C8029m implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f14013a;

        C8029m(Stripe4Service stripe4Service, CompletionHandler completionHandler) {
            this.f14013a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f14013a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f14013a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe4Service$m0 */
    public interface C8030m0 {
        /* renamed from: a */
        void mo34722a(Long l);

        /* renamed from: b */
        void mo34723b(Long l);

        /* renamed from: c */
        void mo34724c(Long l);

        /* renamed from: d */
        void mo34725d(Long l);

        /* renamed from: e */
        void mo34726e(String str);

        /* renamed from: f */
        void mo34727f(Long l);

        /* renamed from: g */
        void mo34728g(Long l);

        /* renamed from: h */
        void mo34729h(Long l);

        /* renamed from: i */
        void mo34730i(Power power);

        /* renamed from: o */
        void mo34731o(Long l);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe4Service$n */
    class C8031n implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f14014a;

        C8031n(Stripe4Service stripe4Service, CompletionHandler completionHandler) {
            this.f14014a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f14014a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f14014a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe4Service$o */
    class C8032o implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f14015a;

        C8032o(Stripe4Service stripe4Service, CompletionHandler completionHandler) {
            this.f14015a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f14015a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f14015a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe4Service$p */
    class C8033p implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f14016a;

        C8033p(Stripe4Service stripe4Service, CompletionHandler completionHandler) {
            this.f14016a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f14016a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f14016a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe4Service$q */
    class C8034q implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f14017a;

        C8034q(Stripe4Service stripe4Service, CompletionHandler completionHandler) {
            this.f14017a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f14017a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f14017a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe4Service$r */
    class C8035r implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f14018a;

        C8035r(Stripe4Service stripe4Service, CompletionHandler completionHandler) {
            this.f14018a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f14018a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f14018a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe4Service$s */
    class C8036s implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f14019a;

        C8036s(Stripe4Service stripe4Service, CompletionHandler completionHandler) {
            this.f14019a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f14019a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f14019a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe4Service$t */
    class C8037t implements DeviceManipulator.PropertyChangedListener {

        /* renamed from: a */
        final /* synthetic */ C8030m0 f14020a;

        C8037t(Stripe4Service stripe4Service, C8030m0 m0Var) {
            this.f14020a = m0Var;
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
                case 1179821629:
                    if (str.equals("SmartSwitch")) {
                        c = 7;
                        break;
                    }
                    break;
                case 1611821756:
                    if (str.equals("LanMode")) {
                        c = 8;
                        break;
                    }
                    break;
                case 1998035738:
                    if (str.equals("Bright")) {
                        c = 9;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    if (propertyInfo.getProperty("SaveState").isValueValid()) {
                        this.f14020a.mo34724c((Long) propertyInfo.getValue("SaveState"));
                        return;
                    }
                    return;
                case 1:
                    if (propertyInfo.getProperty("FlowParams").isValueValid()) {
                        this.f14020a.mo34726e((String) propertyInfo.getValue("FlowParams"));
                        return;
                    }
                    return;
                case 2:
                    if (propertyInfo.getProperty("Ct").isValueValid()) {
                        this.f14020a.mo34729h((Long) propertyInfo.getValue("Ct"));
                        return;
                    }
                    return;
                case 3:
                    if (propertyInfo.getProperty("onFromPower").isValueValid()) {
                        this.f14020a.mo34727f((Long) propertyInfo.getValue("onFromPower"));
                        return;
                    }
                    return;
                case 4:
                    if (propertyInfo.getProperty("Power").isValueValid()) {
                        this.f14020a.mo34730i(Power.valueOf((String) propertyInfo.getValue("Power")));
                        return;
                    }
                    return;
                case 5:
                    if (propertyInfo.getProperty("DelayOff").isValueValid()) {
                        this.f14020a.mo34723b((Long) propertyInfo.getValue("DelayOff"));
                        return;
                    }
                    return;
                case 6:
                    if (propertyInfo.getProperty("Flowing").isValueValid()) {
                        this.f14020a.mo34725d((Long) propertyInfo.getValue("Flowing"));
                        return;
                    }
                    return;
                case 7:
                    if (propertyInfo.getProperty("SmartSwitch").isValueValid()) {
                        this.f14020a.mo34731o((Long) propertyInfo.getValue("SmartSwitch"));
                        return;
                    }
                    return;
                case 8:
                    if (propertyInfo.getProperty("LanMode").isValueValid()) {
                        this.f14020a.mo34728g((Long) propertyInfo.getValue("LanMode"));
                        return;
                    }
                    return;
                case 9:
                    if (propertyInfo.getProperty("Bright").isValueValid()) {
                        this.f14020a.mo34722a((Long) propertyInfo.getValue("Bright"));
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe4Service$u */
    class C8038u implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f14021a;

        C8038u(Stripe4Service stripe4Service, CompletionHandler completionHandler) {
            this.f14021a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f14021a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f14021a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe4Service$v */
    class C8039v implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8022i0 f14022a;

        C8039v(Stripe4Service stripe4Service, C8022i0 i0Var) {
            this.f14022a = i0Var;
        }

        public void onFailed(int i, String str) {
            this.f14022a.onFailed(i, str);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v2, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.Long} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onSucceed(com.miot.common.device.invocation.PropertyInfo r15) {
            /*
                r14 = this;
                java.lang.String r0 = "Power"
                com.miot.common.property.Property r0 = r15.getProperty(r0)
                boolean r1 = r0.isValueValid()
                r2 = 0
                if (r1 == 0) goto L_0x0019
                java.lang.Object r0 = r0.getValue()
                java.lang.String r0 = (java.lang.String) r0
                com.yeelight.yeelib.device.xiaomi.Stripe4Service$Power r0 = com.yeelight.yeelib.device.xiaomi.Stripe4Service.Power.valueOf(r0)
                r4 = r0
                goto L_0x001a
            L_0x0019:
                r4 = r2
            L_0x001a:
                java.lang.String r0 = "Bright"
                com.miot.common.property.Property r0 = r15.getProperty(r0)
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
                com.miot.common.property.Property r0 = r15.getProperty(r0)
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
                com.miot.common.property.Property r0 = r15.getProperty(r0)
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
                com.miot.common.property.Property r0 = r15.getProperty(r0)
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
                com.miot.common.property.Property r0 = r15.getProperty(r0)
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
                com.miot.common.property.Property r0 = r15.getProperty(r0)
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
                com.miot.common.property.Property r0 = r15.getProperty(r0)
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
                com.miot.common.property.Property r0 = r15.getProperty(r0)
                boolean r1 = r0.isValueValid()
                if (r1 == 0) goto L_0x00c1
                java.lang.Object r0 = r0.getValue()
                java.lang.Long r0 = (java.lang.Long) r0
                r12 = r0
                goto L_0x00c2
            L_0x00c1:
                r12 = r2
            L_0x00c2:
                java.lang.String r0 = "SmartSwitch"
                com.miot.common.property.Property r15 = r15.getProperty(r0)
                boolean r0 = r15.isValueValid()
                if (r0 == 0) goto L_0x00d5
                java.lang.Object r15 = r15.getValue()
                r2 = r15
                java.lang.Long r2 = (java.lang.Long) r2
            L_0x00d5:
                r13 = r2
                com.yeelight.yeelib.device.xiaomi.Stripe4Service$i0 r3 = r14.f14022a
                r3.mo34714a(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.xiaomi.Stripe4Service.C8039v.onSucceed(com.miot.common.device.invocation.PropertyInfo):void");
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe4Service$w */
    class C8040w implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8020h0 f14023a;

        C8040w(Stripe4Service stripe4Service, C8020h0 h0Var) {
            this.f14023a = h0Var;
        }

        public void onFailed(int i, String str) {
            this.f14023a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Power");
            if (property.isValueValid()) {
                this.f14023a.mo34712a(Power.valueOf((String) propertyInfo.getValue("Power")));
                return;
            }
            C8020h0 h0Var = this.f14023a;
            h0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe4Service$x */
    class C8041x implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8008b0 f14024a;

        C8041x(Stripe4Service stripe4Service, C8008b0 b0Var) {
            this.f14024a = b0Var;
        }

        public void onFailed(int i, String str) {
            this.f14024a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Bright");
            if (property.isValueValid()) {
                this.f14024a.mo34700a((Long) propertyInfo.getValue("Bright"));
                return;
            }
            C8008b0 b0Var = this.f14024a;
            b0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe4Service$y */
    class C8042y implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8010c0 f14025a;

        C8042y(Stripe4Service stripe4Service, C8010c0 c0Var) {
            this.f14025a = c0Var;
        }

        public void onFailed(int i, String str) {
            this.f14025a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Ct");
            if (property.isValueValid()) {
                this.f14025a.mo34702a((Long) propertyInfo.getValue("Ct"));
                return;
            }
            C8010c0 c0Var = this.f14025a;
            c0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe4Service$z */
    class C8043z implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8014e0 f14026a;

        C8043z(Stripe4Service stripe4Service, C8014e0 e0Var) {
            this.f14026a = e0Var;
        }

        public void onFailed(int i, String str) {
            this.f14026a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("FlowParams");
            if (property.isValueValid()) {
                this.f14026a.onSucceed((String) propertyInfo.getValue("FlowParams"));
                return;
            }
            C8014e0 e0Var = this.f14026a;
            e0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    public Stripe4Service(AbstractDevice abstractDevice) {
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
                MiotManager.getDeviceManipulator().invoke(create, new C8031n(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8017g(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getBright(C8008b0 b0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Bright"), new C8041x(this, b0Var));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8036s(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getCt(C8010c0 c0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Ct"), new C8042y(this, c0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getDelayOff(C8012d0 d0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "DelayOff"), new C8006a0(this, d0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowParams(C8014e0 e0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "FlowParams"), new C8043z(this, e0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowing(C8016f0 f0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Flowing"), new C8011d(this, f0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getLanMode(C8018g0 g0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "LanMode"), new C8007b(this, g0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getPower(C8020h0 h0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Power"), new C8040w(this, h0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getProperties(C8022i0 i0Var) {
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
            MiotManager.getDeviceManipulator().readProperty(create, new C8039v(this, i0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getSaveState(C8024j0 j0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "SaveState"), new C8005a(this, j0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getSmartSwitch(C8026k0 k0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "SmartSwitch"), new C8013e(this, k0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getonFromPower(C8028l0 l0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "onFromPower"), new C8009c(this, l0Var));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8023j(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8019h(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8033p(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8015f(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8035r(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8032o(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8034q(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8027l(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8021i(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void subscribeNotifications(CompletionHandler completionHandler, C8030m0 m0Var) {
        if (completionHandler == null) {
            throw new IllegalArgumentException("handler is null");
        } else if (m0Var != null) {
            PropertyInfo create = PropertyInfoFactory.create(getService());
            for (Property next : getService().getProperties()) {
                if (next.getDefinition().isNotifiable()) {
                    create.addProperty(next);
                }
            }
            MiotManager.getDeviceManipulator().addPropertyChangedListener(create, new C8025k(this, completionHandler), new C8037t(this, m0Var));
        } else {
            throw new IllegalArgumentException("listener is null");
        }
    }

    public void toggle(CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "toggle");
            if (create != null) {
                MiotManager.getDeviceManipulator().invoke(create, new C8029m(this, completionHandler));
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
            MiotManager.getDeviceManipulator().removePropertyChangedListener(create, new C8038u(this, completionHandler));
            return;
        }
        throw new IllegalArgumentException("handler is null");
    }
}
