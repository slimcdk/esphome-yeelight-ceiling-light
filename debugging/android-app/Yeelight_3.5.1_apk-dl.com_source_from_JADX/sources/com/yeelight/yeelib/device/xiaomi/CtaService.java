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

public class CtaService extends AbstractService {
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
    public static final String ACTION_setScene2 = "setScene2";
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
    public static final String PROPERTY_TransIntervalDflt = "TransIntervalDflt";
    public static final String PROPERTY_onFromPower = "onFromPower";
    private static final String TAG = "CtaService";
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

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtaService$a */
    class C7311a implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7332k0 f13506a;

        C7311a(CtaService ctaService, C7332k0 k0Var) {
            this.f13506a = k0Var;
        }

        public void onFailed(int i, String str) {
            this.f13506a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("SaveState");
            if (property.isValueValid()) {
                this.f13506a.mo33681a((Long) propertyInfo.getValue("SaveState"));
                return;
            }
            C7332k0 k0Var = this.f13506a;
            k0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtaService$a0 */
    class C7312a0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7322f0 f13507a;

        C7312a0(CtaService ctaService, C7322f0 f0Var) {
            this.f13507a = f0Var;
        }

        public void onFailed(int i, String str) {
            this.f13507a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("FlowParams");
            if (property.isValueValid()) {
                this.f13507a.onSucceed((String) propertyInfo.getValue("FlowParams"));
                return;
            }
            C7322f0 f0Var = this.f13507a;
            f0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtaService$b */
    class C7313b implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7326h0 f13508a;

        C7313b(CtaService ctaService, C7326h0 h0Var) {
            this.f13508a = h0Var;
        }

        public void onFailed(int i, String str) {
            this.f13508a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("LanMode");
            if (property.isValueValid()) {
                this.f13508a.mo33675a((Long) propertyInfo.getValue("LanMode"));
                return;
            }
            C7326h0 h0Var = this.f13508a;
            h0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtaService$b0 */
    class C7314b0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7320e0 f13509a;

        C7314b0(CtaService ctaService, C7320e0 e0Var) {
            this.f13509a = e0Var;
        }

        public void onFailed(int i, String str) {
            this.f13509a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("DelayOff");
            if (property.isValueValid()) {
                this.f13509a.mo33669a((Long) propertyInfo.getValue("DelayOff"));
                return;
            }
            C7320e0 e0Var = this.f13509a;
            e0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtaService$c */
    class C7315c implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7334l0 f13510a;

        C7315c(CtaService ctaService, C7334l0 l0Var) {
            this.f13510a = l0Var;
        }

        public void onFailed(int i, String str) {
            this.f13510a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("TransIntervalDflt");
            if (property.isValueValid()) {
                this.f13510a.mo33683a((Long) propertyInfo.getValue("TransIntervalDflt"));
                return;
            }
            C7334l0 l0Var = this.f13510a;
            l0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtaService$c0 */
    public interface C7316c0 {
        /* renamed from: a */
        void mo33665a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtaService$d */
    class C7317d implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7336m0 f13511a;

        C7317d(CtaService ctaService, C7336m0 m0Var) {
            this.f13511a = m0Var;
        }

        public void onFailed(int i, String str) {
            this.f13511a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("onFromPower");
            if (property.isValueValid()) {
                this.f13511a.mo33685a((Long) propertyInfo.getValue("onFromPower"));
                return;
            }
            C7336m0 m0Var = this.f13511a;
            m0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtaService$d0 */
    public interface C7318d0 {
        /* renamed from: a */
        void mo33667a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtaService$e */
    class C7319e implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7324g0 f13512a;

        C7319e(CtaService ctaService, C7324g0 g0Var) {
            this.f13512a = g0Var;
        }

        public void onFailed(int i, String str) {
            this.f13512a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Flowing");
            if (property.isValueValid()) {
                this.f13512a.mo33673a((Long) propertyInfo.getValue("Flowing"));
                return;
            }
            C7324g0 g0Var = this.f13512a;
            g0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtaService$e0 */
    public interface C7320e0 {
        /* renamed from: a */
        void mo33669a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtaService$f */
    class C7321f implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13513a;

        C7321f(CtaService ctaService, CompletionHandler completionHandler) {
            this.f13513a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13513a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13513a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtaService$f0 */
    public interface C7322f0 {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtaService$g */
    class C7323g implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13514a;

        C7323g(CtaService ctaService, CompletionHandler completionHandler) {
            this.f13514a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13514a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13514a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtaService$g0 */
    public interface C7324g0 {
        /* renamed from: a */
        void mo33673a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtaService$h */
    class C7325h implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13515a;

        C7325h(CtaService ctaService, CompletionHandler completionHandler) {
            this.f13515a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13515a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13515a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtaService$h0 */
    public interface C7326h0 {
        /* renamed from: a */
        void mo33675a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtaService$i */
    class C7327i implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13516a;

        C7327i(CtaService ctaService, CompletionHandler completionHandler) {
            this.f13516a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13516a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13516a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtaService$i0 */
    public interface C7328i0 {
        /* renamed from: a */
        void mo33677a(Power power);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtaService$j */
    class C7329j implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13517a;

        C7329j(CtaService ctaService, CompletionHandler completionHandler) {
            this.f13517a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13517a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13517a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtaService$j0 */
    public interface C7330j0 {
        /* renamed from: a */
        void mo33679a(Power power, Long l, Long l2, String str, Long l3, Long l4, Long l5, Long l6, Long l7, Long l8);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtaService$k */
    class C7331k implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13518a;

        C7331k(CtaService ctaService, CompletionHandler completionHandler) {
            this.f13518a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13518a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f13518a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtaService$k0 */
    public interface C7332k0 {
        /* renamed from: a */
        void mo33681a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtaService$l */
    class C7333l implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13519a;

        C7333l(CtaService ctaService, CompletionHandler completionHandler) {
            this.f13519a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13519a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13519a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtaService$l0 */
    public interface C7334l0 {
        /* renamed from: a */
        void mo33683a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtaService$m */
    class C7335m implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13520a;

        C7335m(CtaService ctaService, CompletionHandler completionHandler) {
            this.f13520a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13520a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13520a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtaService$m0 */
    public interface C7336m0 {
        /* renamed from: a */
        void mo33685a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtaService$n */
    class C7337n implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13521a;

        C7337n(CtaService ctaService, CompletionHandler completionHandler) {
            this.f13521a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13521a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13521a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtaService$n0 */
    public interface C7338n0 {
        /* renamed from: a */
        void mo33687a(Long l);

        /* renamed from: b */
        void mo33688b(Long l);

        /* renamed from: c */
        void mo33689c(Long l);

        /* renamed from: d */
        void mo33690d(Long l);

        /* renamed from: e */
        void mo33691e(String str);

        /* renamed from: f */
        void mo33692f(Long l);

        /* renamed from: g */
        void mo33693g(Long l);

        /* renamed from: h */
        void mo33694h(Long l);

        /* renamed from: i */
        void mo33695i(Power power);

        /* renamed from: p */
        void mo33696p(Long l);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtaService$o */
    class C7339o implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13522a;

        C7339o(CtaService ctaService, CompletionHandler completionHandler) {
            this.f13522a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13522a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13522a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtaService$p */
    class C7340p implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13523a;

        C7340p(CtaService ctaService, CompletionHandler completionHandler) {
            this.f13523a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13523a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13523a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtaService$q */
    class C7341q implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13524a;

        C7341q(CtaService ctaService, CompletionHandler completionHandler) {
            this.f13524a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13524a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13524a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtaService$r */
    class C7342r implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13525a;

        C7342r(CtaService ctaService, CompletionHandler completionHandler) {
            this.f13525a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13525a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13525a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtaService$s */
    class C7343s implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13526a;

        C7343s(CtaService ctaService, CompletionHandler completionHandler) {
            this.f13526a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13526a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13526a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtaService$t */
    class C7344t implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13527a;

        C7344t(CtaService ctaService, CompletionHandler completionHandler) {
            this.f13527a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13527a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13527a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtaService$u */
    class C7345u implements DeviceManipulator.PropertyChangedListener {

        /* renamed from: a */
        final /* synthetic */ C7338n0 f13528a;

        C7345u(CtaService ctaService, C7338n0 n0Var) {
            this.f13528a = n0Var;
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
                case 2193:
                    if (str.equals("Ct")) {
                        c = 3;
                        break;
                    }
                    break;
                case 35911772:
                    if (str.equals("onFromPower")) {
                        c = 4;
                        break;
                    }
                    break;
                case 77306085:
                    if (str.equals("Power")) {
                        c = 5;
                        break;
                    }
                    break;
                case 880790796:
                    if (str.equals("DelayOff")) {
                        c = 6;
                        break;
                    }
                    break;
                case 898856916:
                    if (str.equals("Flowing")) {
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
                        this.f13528a.mo33689c((Long) propertyInfo.getValue("SaveState"));
                        return;
                    }
                    return;
                case 1:
                    if (propertyInfo.getProperty("FlowParams").isValueValid()) {
                        this.f13528a.mo33691e((String) propertyInfo.getValue("FlowParams"));
                        return;
                    }
                    return;
                case 2:
                    if (propertyInfo.getProperty("TransIntervalDflt").isValueValid()) {
                        this.f13528a.mo33696p((Long) propertyInfo.getValue("TransIntervalDflt"));
                        return;
                    }
                    return;
                case 3:
                    if (propertyInfo.getProperty("Ct").isValueValid()) {
                        this.f13528a.mo33694h((Long) propertyInfo.getValue("Ct"));
                        return;
                    }
                    return;
                case 4:
                    if (propertyInfo.getProperty("onFromPower").isValueValid()) {
                        this.f13528a.mo33692f((Long) propertyInfo.getValue("onFromPower"));
                        return;
                    }
                    return;
                case 5:
                    if (propertyInfo.getProperty("Power").isValueValid()) {
                        this.f13528a.mo33695i(Power.valueOf((String) propertyInfo.getValue("Power")));
                        return;
                    }
                    return;
                case 6:
                    if (propertyInfo.getProperty("DelayOff").isValueValid()) {
                        this.f13528a.mo33688b((Long) propertyInfo.getValue("DelayOff"));
                        return;
                    }
                    return;
                case 7:
                    if (propertyInfo.getProperty("Flowing").isValueValid()) {
                        this.f13528a.mo33690d((Long) propertyInfo.getValue("Flowing"));
                        return;
                    }
                    return;
                case 8:
                    if (propertyInfo.getProperty("LanMode").isValueValid()) {
                        this.f13528a.mo33693g((Long) propertyInfo.getValue("LanMode"));
                        return;
                    }
                    return;
                case 9:
                    if (propertyInfo.getProperty("Bright").isValueValid()) {
                        this.f13528a.mo33687a((Long) propertyInfo.getValue("Bright"));
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtaService$v */
    class C7346v implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13529a;

        C7346v(CtaService ctaService, CompletionHandler completionHandler) {
            this.f13529a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13529a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f13529a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtaService$w */
    class C7347w implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7330j0 f13530a;

        C7347w(CtaService ctaService, C7330j0 j0Var) {
            this.f13530a = j0Var;
        }

        public void onFailed(int i, String str) {
            this.f13530a.onFailed(i, str);
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
                com.yeelight.yeelib.device.xiaomi.CtaService$Power r0 = com.yeelight.yeelib.device.xiaomi.CtaService.Power.valueOf(r0)
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
                java.lang.String r0 = "TransIntervalDflt"
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
                java.lang.String r0 = "onFromPower"
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
                java.lang.String r0 = "Flowing"
                com.miot.common.property.Property r15 = r15.getProperty(r0)
                boolean r0 = r15.isValueValid()
                if (r0 == 0) goto L_0x00d5
                java.lang.Object r15 = r15.getValue()
                r2 = r15
                java.lang.Long r2 = (java.lang.Long) r2
            L_0x00d5:
                r13 = r2
                com.yeelight.yeelib.device.xiaomi.CtaService$j0 r3 = r14.f13530a
                r3.mo33679a(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.xiaomi.CtaService.C7347w.onSucceed(com.miot.common.device.invocation.PropertyInfo):void");
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtaService$x */
    class C7348x implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7328i0 f13531a;

        C7348x(CtaService ctaService, C7328i0 i0Var) {
            this.f13531a = i0Var;
        }

        public void onFailed(int i, String str) {
            this.f13531a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Power");
            if (property.isValueValid()) {
                this.f13531a.mo33677a(Power.valueOf((String) propertyInfo.getValue("Power")));
                return;
            }
            C7328i0 i0Var = this.f13531a;
            i0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtaService$y */
    class C7349y implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7316c0 f13532a;

        C7349y(CtaService ctaService, C7316c0 c0Var) {
            this.f13532a = c0Var;
        }

        public void onFailed(int i, String str) {
            this.f13532a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Bright");
            if (property.isValueValid()) {
                this.f13532a.mo33665a((Long) propertyInfo.getValue("Bright"));
                return;
            }
            C7316c0 c0Var = this.f13532a;
            c0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtaService$z */
    class C7350z implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7318d0 f13533a;

        C7350z(CtaService ctaService, C7318d0 d0Var) {
            this.f13533a = d0Var;
        }

        public void onFailed(int i, String str) {
            this.f13533a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Ct");
            if (property.isValueValid()) {
                this.f13533a.mo33667a((Long) propertyInfo.getValue("Ct"));
                return;
            }
            C7318d0 d0Var = this.f13533a;
            d0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    public CtaService(AbstractDevice abstractDevice) {
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
                MiotManager.getDeviceManipulator().invoke(create, new C7339o(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7323g(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getBright(C7316c0 c0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Bright"), new C7349y(this, c0Var));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7344t(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getCt(C7318d0 d0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Ct"), new C7350z(this, d0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getDelayOff(C7320e0 e0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "DelayOff"), new C7314b0(this, e0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowParams(C7322f0 f0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "FlowParams"), new C7312a0(this, f0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowing(C7324g0 g0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Flowing"), new C7319e(this, g0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getLanMode(C7326h0 h0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "LanMode"), new C7313b(this, h0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getPower(C7328i0 i0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Power"), new C7348x(this, i0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getProperties(C7330j0 j0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            PropertyInfo create = PropertyInfoFactory.create(getService());
            create.addProperty(getService().getProperty("Power"));
            create.addProperty(getService().getProperty("Bright"));
            create.addProperty(getService().getProperty("Ct"));
            create.addProperty(getService().getProperty("FlowParams"));
            create.addProperty(getService().getProperty("DelayOff"));
            create.addProperty(getService().getProperty("SaveState"));
            create.addProperty(getService().getProperty("LanMode"));
            create.addProperty(getService().getProperty("TransIntervalDflt"));
            create.addProperty(getService().getProperty("onFromPower"));
            create.addProperty(getService().getProperty("Flowing"));
            MiotManager.getDeviceManipulator().readProperty(create, new C7347w(this, j0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getSaveState(C7332k0 k0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "SaveState"), new C7311a(this, k0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getTransIntervalDflt(C7334l0 l0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "TransIntervalDflt"), new C7315c(this, l0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getonFromPower(C7336m0 m0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "onFromPower"), new C7317d(this, m0Var));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7333l(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7325h(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7341q(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7321f(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setCt(Long l, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setCt");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (create.setArgumentValue("Ct", l)) {
                MiotManager.getDeviceManipulator().invoke(create, new C7343s(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7340p(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7342r(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7335m(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7327i(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7329j(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void subscribeNotifications(CompletionHandler completionHandler, C7338n0 n0Var) {
        if (completionHandler == null) {
            throw new IllegalArgumentException("handler is null");
        } else if (n0Var != null) {
            PropertyInfo create = PropertyInfoFactory.create(getService());
            for (Property next : getService().getProperties()) {
                if (next.getDefinition().isNotifiable()) {
                    create.addProperty(next);
                }
            }
            MiotManager.getDeviceManipulator().addPropertyChangedListener(create, new C7331k(this, completionHandler), new C7345u(this, n0Var));
        } else {
            throw new IllegalArgumentException("listener is null");
        }
    }

    public void toggle(CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "toggle");
            if (create != null) {
                MiotManager.getDeviceManipulator().invoke(create, new C7337n(this, completionHandler));
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
            MiotManager.getDeviceManipulator().removePropertyChangedListener(create, new C7346v(this, completionHandler));
            return;
        }
        throw new IllegalArgumentException("handler is null");
    }
}
