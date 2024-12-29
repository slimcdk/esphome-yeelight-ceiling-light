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

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel3Service$a */
    class C7864a implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7889m0 f13900a;

        C7864a(Panel3Service panel3Service, C7889m0 m0Var) {
            this.f13900a = m0Var;
        }

        public void onFailed(int i, String str) {
            this.f13900a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("SaveState");
            if (property.isValueValid()) {
                this.f13900a.mo34510a((Long) propertyInfo.getValue("SaveState"));
                return;
            }
            C7889m0 m0Var = this.f13900a;
            m0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel3Service$a0 */
    class C7865a0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7873e0 f13901a;

        C7865a0(Panel3Service panel3Service, C7873e0 e0Var) {
            this.f13901a = e0Var;
        }

        public void onFailed(int i, String str) {
            this.f13901a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Ct");
            if (property.isValueValid()) {
                this.f13901a.mo34494a((Long) propertyInfo.getValue("Ct"));
                return;
            }
            C7873e0 e0Var = this.f13901a;
            e0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel3Service$b */
    class C7866b implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7881i0 f13902a;

        C7866b(Panel3Service panel3Service, C7881i0 i0Var) {
            this.f13902a = i0Var;
        }

        public void onFailed(int i, String str) {
            this.f13902a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("LanMode");
            if (property.isValueValid()) {
                this.f13902a.mo34502a((Long) propertyInfo.getValue("LanMode"));
                return;
            }
            C7881i0 i0Var = this.f13902a;
            i0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel3Service$b0 */
    class C7867b0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7877g0 f13903a;

        C7867b0(Panel3Service panel3Service, C7877g0 g0Var) {
            this.f13903a = g0Var;
        }

        public void onFailed(int i, String str) {
            this.f13903a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("FlowParams");
            if (property.isValueValid()) {
                this.f13903a.onSucceed((String) propertyInfo.getValue("FlowParams"));
                return;
            }
            C7877g0 g0Var = this.f13903a;
            g0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel3Service$c */
    class C7868c implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7893o0 f13904a;

        C7868c(Panel3Service panel3Service, C7893o0 o0Var) {
            this.f13904a = o0Var;
        }

        public void onFailed(int i, String str) {
            this.f13904a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("onFromPower");
            if (property.isValueValid()) {
                this.f13904a.mo34514a((Long) propertyInfo.getValue("onFromPower"));
                return;
            }
            C7893o0 o0Var = this.f13904a;
            o0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel3Service$c0 */
    class C7869c0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7875f0 f13905a;

        C7869c0(Panel3Service panel3Service, C7875f0 f0Var) {
            this.f13905a = f0Var;
        }

        public void onFailed(int i, String str) {
            this.f13905a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("DelayOff");
            if (property.isValueValid()) {
                this.f13905a.mo34496a((Long) propertyInfo.getValue("DelayOff"));
                return;
            }
            C7875f0 f0Var = this.f13905a;
            f0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel3Service$d */
    class C7870d implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7879h0 f13906a;

        C7870d(Panel3Service panel3Service, C7879h0 h0Var) {
            this.f13906a = h0Var;
        }

        public void onFailed(int i, String str) {
            this.f13906a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Flowing");
            if (property.isValueValid()) {
                this.f13906a.mo34500a((Long) propertyInfo.getValue("Flowing"));
                return;
            }
            C7879h0 h0Var = this.f13906a;
            h0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel3Service$d0 */
    public interface C7871d0 {
        /* renamed from: a */
        void mo34492a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel3Service$e */
    class C7872e implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7891n0 f13907a;

        C7872e(Panel3Service panel3Service, C7891n0 n0Var) {
            this.f13907a = n0Var;
        }

        public void onFailed(int i, String str) {
            this.f13907a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("SmartSwitch");
            if (property.isValueValid()) {
                this.f13907a.mo34512a((Long) propertyInfo.getValue("SmartSwitch"));
                return;
            }
            C7891n0 n0Var = this.f13907a;
            n0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel3Service$e0 */
    public interface C7873e0 {
        /* renamed from: a */
        void mo34494a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel3Service$f */
    class C7874f implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7883j0 f13908a;

        C7874f(Panel3Service panel3Service, C7883j0 j0Var) {
            this.f13908a = j0Var;
        }

        public void onFailed(int i, String str) {
            this.f13908a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("NightTimeInfo");
            if (property.isValueValid()) {
                this.f13908a.onSucceed((String) propertyInfo.getValue("NightTimeInfo"));
                return;
            }
            C7883j0 j0Var = this.f13908a;
            j0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel3Service$f0 */
    public interface C7875f0 {
        /* renamed from: a */
        void mo34496a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel3Service$g */
    class C7876g implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13909a;

        C7876g(Panel3Service panel3Service, CompletionHandler completionHandler) {
            this.f13909a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13909a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13909a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel3Service$g0 */
    public interface C7877g0 {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel3Service$h */
    class C7878h implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13910a;

        C7878h(Panel3Service panel3Service, CompletionHandler completionHandler) {
            this.f13910a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13910a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13910a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel3Service$h0 */
    public interface C7879h0 {
        /* renamed from: a */
        void mo34500a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel3Service$i */
    class C7880i implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13911a;

        C7880i(Panel3Service panel3Service, CompletionHandler completionHandler) {
            this.f13911a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13911a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13911a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel3Service$i0 */
    public interface C7881i0 {
        /* renamed from: a */
        void mo34502a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel3Service$j */
    class C7882j implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13912a;

        C7882j(Panel3Service panel3Service, CompletionHandler completionHandler) {
            this.f13912a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13912a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13912a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel3Service$j0 */
    public interface C7883j0 {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel3Service$k */
    class C7884k implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13913a;

        C7884k(Panel3Service panel3Service, CompletionHandler completionHandler) {
            this.f13913a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13913a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f13913a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel3Service$k0 */
    public interface C7885k0 {
        /* renamed from: a */
        void mo34506a(Power power);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel3Service$l */
    class C7886l implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13914a;

        C7886l(Panel3Service panel3Service, CompletionHandler completionHandler) {
            this.f13914a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13914a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13914a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel3Service$l0 */
    public interface C7887l0 {
        /* renamed from: a */
        void mo34508a(Power power, Long l, Long l2, String str, Long l3, Long l4, Long l5, Long l6, Long l7, Long l8, String str2);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel3Service$m */
    class C7888m implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13915a;

        C7888m(Panel3Service panel3Service, CompletionHandler completionHandler) {
            this.f13915a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13915a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13915a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel3Service$m0 */
    public interface C7889m0 {
        /* renamed from: a */
        void mo34510a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel3Service$n */
    class C7890n implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13916a;

        C7890n(Panel3Service panel3Service, CompletionHandler completionHandler) {
            this.f13916a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13916a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13916a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel3Service$n0 */
    public interface C7891n0 {
        /* renamed from: a */
        void mo34512a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel3Service$o */
    class C7892o implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13917a;

        C7892o(Panel3Service panel3Service, CompletionHandler completionHandler) {
            this.f13917a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13917a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13917a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel3Service$o0 */
    public interface C7893o0 {
        /* renamed from: a */
        void mo34514a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel3Service$p */
    class C7894p implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13918a;

        C7894p(Panel3Service panel3Service, CompletionHandler completionHandler) {
            this.f13918a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13918a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13918a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel3Service$p0 */
    public interface C7895p0 {
        /* renamed from: a */
        void mo34516a(Long l);

        /* renamed from: b */
        void mo34517b(Long l);

        /* renamed from: c */
        void mo34518c(Long l);

        /* renamed from: d */
        void mo34519d(Long l);

        /* renamed from: e */
        void mo34520e(String str);

        /* renamed from: f */
        void mo34521f(Long l);

        /* renamed from: g */
        void mo34522g(Long l);

        /* renamed from: h */
        void mo34523h(Long l);

        /* renamed from: i */
        void mo34524i(String str);

        /* renamed from: j */
        void mo34525j(Power power);

        /* renamed from: o */
        void mo34526o(Long l);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel3Service$q */
    class C7896q implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13919a;

        C7896q(Panel3Service panel3Service, CompletionHandler completionHandler) {
            this.f13919a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13919a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13919a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel3Service$r */
    class C7897r implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13920a;

        C7897r(Panel3Service panel3Service, CompletionHandler completionHandler) {
            this.f13920a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13920a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13920a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel3Service$s */
    class C7898s implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13921a;

        C7898s(Panel3Service panel3Service, CompletionHandler completionHandler) {
            this.f13921a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13921a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13921a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel3Service$t */
    class C7899t implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13922a;

        C7899t(Panel3Service panel3Service, CompletionHandler completionHandler) {
            this.f13922a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13922a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13922a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel3Service$u */
    class C7900u implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13923a;

        C7900u(Panel3Service panel3Service, CompletionHandler completionHandler) {
            this.f13923a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13923a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13923a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel3Service$v */
    class C7901v implements DeviceManipulator.PropertyChangedListener {

        /* renamed from: a */
        final /* synthetic */ C7895p0 f13924a;

        C7901v(Panel3Service panel3Service, C7895p0 p0Var) {
            this.f13924a = p0Var;
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
                case 1179821629:
                    if (str.equals("SmartSwitch")) {
                        c = 8;
                        break;
                    }
                    break;
                case 1611821756:
                    if (str.equals("LanMode")) {
                        c = 9;
                        break;
                    }
                    break;
                case 1998035738:
                    if (str.equals("Bright")) {
                        c = 10;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    if (propertyInfo.getProperty("SaveState").isValueValid()) {
                        this.f13924a.mo34518c((Long) propertyInfo.getValue("SaveState"));
                        return;
                    }
                    return;
                case 1:
                    if (propertyInfo.getProperty("FlowParams").isValueValid()) {
                        this.f13924a.mo34520e((String) propertyInfo.getValue("FlowParams"));
                        return;
                    }
                    return;
                case 2:
                    if (propertyInfo.getProperty("NightTimeInfo").isValueValid()) {
                        this.f13924a.mo34524i((String) propertyInfo.getValue("NightTimeInfo"));
                        return;
                    }
                    return;
                case 3:
                    if (propertyInfo.getProperty("Ct").isValueValid()) {
                        this.f13924a.mo34523h((Long) propertyInfo.getValue("Ct"));
                        return;
                    }
                    return;
                case 4:
                    if (propertyInfo.getProperty("onFromPower").isValueValid()) {
                        this.f13924a.mo34521f((Long) propertyInfo.getValue("onFromPower"));
                        return;
                    }
                    return;
                case 5:
                    if (propertyInfo.getProperty("Power").isValueValid()) {
                        this.f13924a.mo34525j(Power.valueOf((String) propertyInfo.getValue("Power")));
                        return;
                    }
                    return;
                case 6:
                    if (propertyInfo.getProperty("DelayOff").isValueValid()) {
                        this.f13924a.mo34517b((Long) propertyInfo.getValue("DelayOff"));
                        return;
                    }
                    return;
                case 7:
                    if (propertyInfo.getProperty("Flowing").isValueValid()) {
                        this.f13924a.mo34519d((Long) propertyInfo.getValue("Flowing"));
                        return;
                    }
                    return;
                case 8:
                    if (propertyInfo.getProperty("SmartSwitch").isValueValid()) {
                        this.f13924a.mo34526o((Long) propertyInfo.getValue("SmartSwitch"));
                        return;
                    }
                    return;
                case 9:
                    if (propertyInfo.getProperty("LanMode").isValueValid()) {
                        this.f13924a.mo34522g((Long) propertyInfo.getValue("LanMode"));
                        return;
                    }
                    return;
                case 10:
                    if (propertyInfo.getProperty("Bright").isValueValid()) {
                        this.f13924a.mo34516a((Long) propertyInfo.getValue("Bright"));
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel3Service$w */
    class C7902w implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13925a;

        C7902w(Panel3Service panel3Service, CompletionHandler completionHandler) {
            this.f13925a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13925a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f13925a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel3Service$x */
    class C7903x implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7887l0 f13926a;

        C7903x(Panel3Service panel3Service, C7887l0 l0Var) {
            this.f13926a = l0Var;
        }

        public void onFailed(int i, String str) {
            this.f13926a.onFailed(i, str);
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
                com.yeelight.yeelib.device.xiaomi.Panel3Service$Power r1 = com.yeelight.yeelib.device.xiaomi.Panel3Service.Power.valueOf(r1)
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
                com.yeelight.yeelib.device.xiaomi.Panel3Service$l0 r4 = r0.f13926a
                r4.mo34508a(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.xiaomi.Panel3Service.C7903x.onSucceed(com.miot.common.device.invocation.PropertyInfo):void");
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel3Service$y */
    class C7904y implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7885k0 f13927a;

        C7904y(Panel3Service panel3Service, C7885k0 k0Var) {
            this.f13927a = k0Var;
        }

        public void onFailed(int i, String str) {
            this.f13927a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Power");
            if (property.isValueValid()) {
                this.f13927a.mo34506a(Power.valueOf((String) propertyInfo.getValue("Power")));
                return;
            }
            C7885k0 k0Var = this.f13927a;
            k0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel3Service$z */
    class C7905z implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7871d0 f13928a;

        C7905z(Panel3Service panel3Service, C7871d0 d0Var) {
            this.f13928a = d0Var;
        }

        public void onFailed(int i, String str) {
            this.f13928a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Bright");
            if (property.isValueValid()) {
                this.f13928a.mo34492a((Long) propertyInfo.getValue("Bright"));
                return;
            }
            C7871d0 d0Var = this.f13928a;
            d0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
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
                MiotManager.getDeviceManipulator().invoke(create, new C7892o(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7878h(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getBright(C7871d0 d0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Bright"), new C7905z(this, d0Var));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7900u(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getCt(C7873e0 e0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Ct"), new C7865a0(this, e0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getDelayOff(C7875f0 f0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "DelayOff"), new C7869c0(this, f0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowParams(C7877g0 g0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "FlowParams"), new C7867b0(this, g0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowing(C7879h0 h0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Flowing"), new C7870d(this, h0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getLanMode(C7881i0 i0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "LanMode"), new C7866b(this, i0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getNightTimeInfo(C7883j0 j0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "NightTimeInfo"), new C7874f(this, j0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getPower(C7885k0 k0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Power"), new C7904y(this, k0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getProperties(C7887l0 l0Var) {
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
            MiotManager.getDeviceManipulator().readProperty(create, new C7903x(this, l0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getSaveState(C7889m0 m0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "SaveState"), new C7864a(this, m0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getSmartSwitch(C7891n0 n0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "SmartSwitch"), new C7872e(this, n0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getonFromPower(C7893o0 o0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "onFromPower"), new C7868c(this, o0Var));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7886l(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7880i(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7896q(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7876g(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7899t(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7894p(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7898s(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7888m(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7882j(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7897r(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void subscribeNotifications(CompletionHandler completionHandler, C7895p0 p0Var) {
        if (completionHandler == null) {
            throw new IllegalArgumentException("handler is null");
        } else if (p0Var != null) {
            PropertyInfo create = PropertyInfoFactory.create(getService());
            for (Property next : getService().getProperties()) {
                if (next.getDefinition().isNotifiable()) {
                    create.addProperty(next);
                }
            }
            MiotManager.getDeviceManipulator().addPropertyChangedListener(create, new C7884k(this, completionHandler), new C7901v(this, p0Var));
        } else {
            throw new IllegalArgumentException("listener is null");
        }
    }

    public void toggle(CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "toggle");
            if (create != null) {
                MiotManager.getDeviceManipulator().invoke(create, new C7890n(this, completionHandler));
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
            MiotManager.getDeviceManipulator().removePropertyChangedListener(create, new C7902w(this, completionHandler));
            return;
        }
        throw new IllegalArgumentException("handler is null");
    }
}
