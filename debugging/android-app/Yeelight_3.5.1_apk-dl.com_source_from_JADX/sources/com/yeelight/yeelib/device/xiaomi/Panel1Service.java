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

public class Panel1Service extends AbstractService {
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
    public static final String PROPERTY_Mode = "Mode";
    public static final String PROPERTY_NightTimeInfo = "NightTimeInfo";
    public static final String PROPERTY_ParamColors = "ParamColors";
    public static final String PROPERTY_ParamCount = "ParamCount";
    public static final String PROPERTY_ParamFinish = "ParamFinish";
    public static final String PROPERTY_ParamModel = "ParamModel";
    public static final String PROPERTY_Power = "Power";
    public static final String PROPERTY_SaveState = "SaveState";
    public static final String PROPERTY_SmartSwitch = "SmartSwitch";
    public static final String PROPERTY_Temperature = "Temperature";
    public static final String PROPERTY_adjustAction = "adjustAction";
    public static final String PROPERTY_adjustProper = "adjustProper";
    public static final String PROPERTY_onFromPower = "onFromPower";
    private static final String TAG = "Panel1Service";
    private AbstractDevice mDevice = null;

    public enum CmdKey {
        undefined,
        cfg_pomodoro,
        cfg_lan_ctrl,
        cfg_save_state,
        cfg_init_power,
        cfg_smart_switch,
        nighttime,
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

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel1Service$a */
    class C7823a implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7832e0 f13871a;

        C7823a(Panel1Service panel1Service, C7832e0 e0Var) {
            this.f13871a = e0Var;
        }

        public void onFailed(int i, String str) {
            this.f13871a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("FlowParams");
            if (property.isValueValid()) {
                this.f13871a.onSucceed((String) propertyInfo.getValue("FlowParams"));
                return;
            }
            C7832e0 e0Var = this.f13871a;
            e0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel1Service$a0 */
    class C7824a0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7830d0 f13872a;

        C7824a0(Panel1Service panel1Service, C7830d0 d0Var) {
            this.f13872a = d0Var;
        }

        public void onFailed(int i, String str) {
            this.f13872a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("DelayOff");
            if (property.isValueValid()) {
                this.f13872a.mo34432a((Long) propertyInfo.getValue("DelayOff"));
                return;
            }
            C7830d0 d0Var = this.f13872a;
            d0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel1Service$b */
    class C7825b implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7836g0 f13873a;

        C7825b(Panel1Service panel1Service, C7836g0 g0Var) {
            this.f13873a = g0Var;
        }

        public void onFailed(int i, String str) {
            this.f13873a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("LanMode");
            if (property.isValueValid()) {
                this.f13873a.mo34438a((Long) propertyInfo.getValue("LanMode"));
                return;
            }
            C7836g0 g0Var = this.f13873a;
            g0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel1Service$b0 */
    class C7826b0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7844k0 f13874a;

        C7826b0(Panel1Service panel1Service, C7844k0 k0Var) {
            this.f13874a = k0Var;
        }

        public void onFailed(int i, String str) {
            this.f13874a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("SaveState");
            if (property.isValueValid()) {
                this.f13874a.mo34446a((Long) propertyInfo.getValue("SaveState"));
                return;
            }
            C7844k0 k0Var = this.f13874a;
            k0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel1Service$c */
    class C7827c implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7850n0 f13875a;

        C7827c(Panel1Service panel1Service, C7850n0 n0Var) {
            this.f13875a = n0Var;
        }

        public void onFailed(int i, String str) {
            this.f13875a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("onFromPower");
            if (property.isValueValid()) {
                this.f13875a.mo34452a((Long) propertyInfo.getValue("onFromPower"));
                return;
            }
            C7850n0 n0Var = this.f13875a;
            n0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel1Service$c0 */
    public interface C7828c0 {
        /* renamed from: a */
        void mo34430a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel1Service$d */
    class C7829d implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7834f0 f13876a;

        C7829d(Panel1Service panel1Service, C7834f0 f0Var) {
            this.f13876a = f0Var;
        }

        public void onFailed(int i, String str) {
            this.f13876a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Flowing");
            if (property.isValueValid()) {
                this.f13876a.mo34436a((Long) propertyInfo.getValue("Flowing"));
                return;
            }
            C7834f0 f0Var = this.f13876a;
            f0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel1Service$d0 */
    public interface C7830d0 {
        /* renamed from: a */
        void mo34432a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel1Service$e */
    class C7831e implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7846l0 f13877a;

        C7831e(Panel1Service panel1Service, C7846l0 l0Var) {
            this.f13877a = l0Var;
        }

        public void onFailed(int i, String str) {
            this.f13877a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("SmartSwitch");
            if (property.isValueValid()) {
                this.f13877a.mo34448a((Long) propertyInfo.getValue("SmartSwitch"));
                return;
            }
            C7846l0 l0Var = this.f13877a;
            l0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel1Service$e0 */
    public interface C7832e0 {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel1Service$f */
    class C7833f implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7838h0 f13878a;

        C7833f(Panel1Service panel1Service, C7838h0 h0Var) {
            this.f13878a = h0Var;
        }

        public void onFailed(int i, String str) {
            this.f13878a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("NightTimeInfo");
            if (property.isValueValid()) {
                this.f13878a.onSucceed((String) propertyInfo.getValue("NightTimeInfo"));
                return;
            }
            C7838h0 h0Var = this.f13878a;
            h0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel1Service$f0 */
    public interface C7834f0 {
        /* renamed from: a */
        void mo34436a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel1Service$g */
    class C7835g implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13879a;

        C7835g(Panel1Service panel1Service, CompletionHandler completionHandler) {
            this.f13879a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13879a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13879a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel1Service$g0 */
    public interface C7836g0 {
        /* renamed from: a */
        void mo34438a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel1Service$h */
    class C7837h implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13880a;

        C7837h(Panel1Service panel1Service, CompletionHandler completionHandler) {
            this.f13880a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13880a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13880a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel1Service$h0 */
    public interface C7838h0 {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel1Service$i */
    class C7839i implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13881a;

        C7839i(Panel1Service panel1Service, CompletionHandler completionHandler) {
            this.f13881a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13881a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13881a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel1Service$i0 */
    public interface C7840i0 {
        /* renamed from: a */
        void mo34442a(Power power);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel1Service$j */
    class C7841j implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13882a;

        C7841j(Panel1Service panel1Service, CompletionHandler completionHandler) {
            this.f13882a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13882a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13882a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel1Service$j0 */
    public interface C7842j0 {
        /* renamed from: a */
        void mo34444a(Power power, Long l, Long l2, Long l3, Long l4, String str, Long l5, Long l6, Long l7, Long l8, String str2);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel1Service$k */
    class C7843k implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13883a;

        C7843k(Panel1Service panel1Service, CompletionHandler completionHandler) {
            this.f13883a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13883a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f13883a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel1Service$k0 */
    public interface C7844k0 {
        /* renamed from: a */
        void mo34446a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel1Service$l */
    class C7845l implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13884a;

        C7845l(Panel1Service panel1Service, CompletionHandler completionHandler) {
            this.f13884a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13884a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13884a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel1Service$l0 */
    public interface C7846l0 {
        /* renamed from: a */
        void mo34448a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel1Service$m */
    class C7847m implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13885a;

        C7847m(Panel1Service panel1Service, CompletionHandler completionHandler) {
            this.f13885a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13885a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13885a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel1Service$m0 */
    public interface C7848m0 {
        /* renamed from: a */
        void mo34450a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel1Service$n */
    class C7849n implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13886a;

        C7849n(Panel1Service panel1Service, CompletionHandler completionHandler) {
            this.f13886a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13886a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13886a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel1Service$n0 */
    public interface C7850n0 {
        /* renamed from: a */
        void mo34452a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel1Service$o */
    class C7851o implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13887a;

        C7851o(Panel1Service panel1Service, CompletionHandler completionHandler) {
            this.f13887a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13887a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13887a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel1Service$o0 */
    public interface C7852o0 {
        /* renamed from: a */
        void mo34454a(Long l);

        /* renamed from: b */
        void mo34455b(Long l);

        /* renamed from: c */
        void mo34456c(Long l);

        /* renamed from: d */
        void mo34457d(Long l);

        /* renamed from: e */
        void mo34458e(String str);

        /* renamed from: f */
        void mo34459f(Long l);

        /* renamed from: g */
        void mo34460g(Long l);

        /* renamed from: h */
        void mo34461h(Power power);

        /* renamed from: i */
        void mo34462i(String str);

        /* renamed from: o */
        void mo34463o(Long l);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel1Service$p */
    class C7853p implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13888a;

        C7853p(Panel1Service panel1Service, CompletionHandler completionHandler) {
            this.f13888a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13888a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13888a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel1Service$q */
    class C7854q implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13889a;

        C7854q(Panel1Service panel1Service, CompletionHandler completionHandler) {
            this.f13889a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13889a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13889a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel1Service$r */
    class C7855r implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13890a;

        C7855r(Panel1Service panel1Service, CompletionHandler completionHandler) {
            this.f13890a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13890a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13890a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel1Service$s */
    class C7856s implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13891a;

        C7856s(Panel1Service panel1Service, CompletionHandler completionHandler) {
            this.f13891a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13891a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13891a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel1Service$t */
    class C7857t implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13892a;

        C7857t(Panel1Service panel1Service, CompletionHandler completionHandler) {
            this.f13892a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13892a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13892a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel1Service$u */
    class C7858u implements DeviceManipulator.PropertyChangedListener {

        /* renamed from: a */
        final /* synthetic */ C7852o0 f13893a;

        C7858u(Panel1Service panel1Service, C7852o0 o0Var) {
            this.f13893a = o0Var;
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
                case -1331143373:
                    if (str.equals("NightTimeInfo")) {
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
                        this.f13893a.mo34456c((Long) propertyInfo.getValue("SaveState"));
                        return;
                    }
                    return;
                case 1:
                    if (propertyInfo.getProperty("FlowParams").isValueValid()) {
                        this.f13893a.mo34458e((String) propertyInfo.getValue("FlowParams"));
                        return;
                    }
                    return;
                case 2:
                    if (propertyInfo.getProperty("NightTimeInfo").isValueValid()) {
                        this.f13893a.mo34462i((String) propertyInfo.getValue("NightTimeInfo"));
                        return;
                    }
                    return;
                case 3:
                    if (propertyInfo.getProperty("onFromPower").isValueValid()) {
                        this.f13893a.mo34459f((Long) propertyInfo.getValue("onFromPower"));
                        return;
                    }
                    return;
                case 4:
                    if (propertyInfo.getProperty("Power").isValueValid()) {
                        this.f13893a.mo34461h(Power.valueOf((String) propertyInfo.getValue("Power")));
                        return;
                    }
                    return;
                case 5:
                    if (propertyInfo.getProperty("DelayOff").isValueValid()) {
                        this.f13893a.mo34455b((Long) propertyInfo.getValue("DelayOff"));
                        return;
                    }
                    return;
                case 6:
                    if (propertyInfo.getProperty("Flowing").isValueValid()) {
                        this.f13893a.mo34457d((Long) propertyInfo.getValue("Flowing"));
                        return;
                    }
                    return;
                case 7:
                    if (propertyInfo.getProperty("SmartSwitch").isValueValid()) {
                        this.f13893a.mo34463o((Long) propertyInfo.getValue("SmartSwitch"));
                        return;
                    }
                    return;
                case 8:
                    if (propertyInfo.getProperty("LanMode").isValueValid()) {
                        this.f13893a.mo34460g((Long) propertyInfo.getValue("LanMode"));
                        return;
                    }
                    return;
                case 9:
                    if (propertyInfo.getProperty("Bright").isValueValid()) {
                        this.f13893a.mo34454a((Long) propertyInfo.getValue("Bright"));
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel1Service$v */
    class C7859v implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13894a;

        C7859v(Panel1Service panel1Service, CompletionHandler completionHandler) {
            this.f13894a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13894a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f13894a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel1Service$w */
    class C7860w implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7842j0 f13895a;

        C7860w(Panel1Service panel1Service, C7842j0 j0Var) {
            this.f13895a = j0Var;
        }

        public void onFailed(int i, String str) {
            this.f13895a.onFailed(i, str);
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
                com.yeelight.yeelib.device.xiaomi.Panel1Service$Power r1 = com.yeelight.yeelib.device.xiaomi.Panel1Service.Power.valueOf(r1)
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
                java.lang.String r1 = "Temperature"
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
                java.lang.String r1 = "SaveState"
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
                java.lang.String r1 = "FlowParams"
                com.miot.common.property.Property r1 = r0.getProperty(r1)
                boolean r2 = r1.isValueValid()
                if (r2 == 0) goto L_0x0084
                java.lang.Object r1 = r1.getValue()
                java.lang.String r1 = (java.lang.String) r1
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
                com.yeelight.yeelib.device.xiaomi.Panel1Service$j0 r4 = r0.f13895a
                r4.mo34444a(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.xiaomi.Panel1Service.C7860w.onSucceed(com.miot.common.device.invocation.PropertyInfo):void");
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel1Service$x */
    class C7861x implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7840i0 f13896a;

        C7861x(Panel1Service panel1Service, C7840i0 i0Var) {
            this.f13896a = i0Var;
        }

        public void onFailed(int i, String str) {
            this.f13896a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Power");
            if (property.isValueValid()) {
                this.f13896a.mo34442a(Power.valueOf((String) propertyInfo.getValue("Power")));
                return;
            }
            C7840i0 i0Var = this.f13896a;
            i0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel1Service$y */
    class C7862y implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7828c0 f13897a;

        C7862y(Panel1Service panel1Service, C7828c0 c0Var) {
            this.f13897a = c0Var;
        }

        public void onFailed(int i, String str) {
            this.f13897a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Bright");
            if (property.isValueValid()) {
                this.f13897a.mo34430a((Long) propertyInfo.getValue("Bright"));
                return;
            }
            C7828c0 c0Var = this.f13897a;
            c0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel1Service$z */
    class C7863z implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7848m0 f13898a;

        C7863z(Panel1Service panel1Service, C7848m0 m0Var) {
            this.f13898a = m0Var;
        }

        public void onFailed(int i, String str) {
            this.f13898a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Temperature");
            if (property.isValueValid()) {
                this.f13898a.mo34450a((Long) propertyInfo.getValue("Temperature"));
                return;
            }
            C7848m0 m0Var = this.f13898a;
            m0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    public Panel1Service(AbstractDevice abstractDevice) {
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
                MiotManager.getDeviceManipulator().invoke(create, new C7851o(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7837h(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getBright(C7828c0 c0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Bright"), new C7862y(this, c0Var));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7857t(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getDelayOff(C7830d0 d0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "DelayOff"), new C7824a0(this, d0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowParams(C7832e0 e0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "FlowParams"), new C7823a(this, e0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowing(C7834f0 f0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Flowing"), new C7829d(this, f0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getLanMode(C7836g0 g0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "LanMode"), new C7825b(this, g0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getNightTimeInfo(C7838h0 h0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "NightTimeInfo"), new C7833f(this, h0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getPower(C7840i0 i0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Power"), new C7861x(this, i0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getProperties(C7842j0 j0Var) {
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
            create.addProperty(getService().getProperty("SmartSwitch"));
            create.addProperty(getService().getProperty("NightTimeInfo"));
            MiotManager.getDeviceManipulator().readProperty(create, new C7860w(this, j0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getSaveState(C7844k0 k0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "SaveState"), new C7826b0(this, k0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getSmartSwitch(C7846l0 l0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "SmartSwitch"), new C7831e(this, l0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getTemperature(C7848m0 m0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Temperature"), new C7863z(this, m0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getonFromPower(C7850n0 n0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "onFromPower"), new C7827c(this, n0Var));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7845l(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7839i(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7854q(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7835g(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7853p(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7856s(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7847m(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7841j(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7855r(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void subscribeNotifications(CompletionHandler completionHandler, C7852o0 o0Var) {
        if (completionHandler == null) {
            throw new IllegalArgumentException("handler is null");
        } else if (o0Var != null) {
            PropertyInfo create = PropertyInfoFactory.create(getService());
            for (Property next : getService().getProperties()) {
                if (next.getDefinition().isNotifiable()) {
                    create.addProperty(next);
                }
            }
            MiotManager.getDeviceManipulator().addPropertyChangedListener(create, new C7843k(this, completionHandler), new C7858u(this, o0Var));
        } else {
            throw new IllegalArgumentException("listener is null");
        }
    }

    public void toggle(CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "toggle");
            if (create != null) {
                MiotManager.getDeviceManipulator().invoke(create, new C7849n(this, completionHandler));
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
            MiotManager.getDeviceManipulator().removePropertyChangedListener(create, new C7859v(this, completionHandler));
            return;
        }
        throw new IllegalArgumentException("handler is null");
    }
}
