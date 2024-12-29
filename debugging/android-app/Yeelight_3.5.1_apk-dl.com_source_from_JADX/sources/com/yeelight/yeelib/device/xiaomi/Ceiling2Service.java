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

    public enum CmdKey {
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

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling2Service$a */
    class C6587a implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6614n0 f12993a;

        C6587a(Ceiling2Service ceiling2Service, C6614n0 n0Var) {
            this.f12993a = n0Var;
        }

        public void onFailed(int i, String str) {
            this.f12993a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("SaveState");
            if (property.isValueValid()) {
                this.f12993a.mo32579a((Long) propertyInfo.getValue("SaveState"));
                return;
            }
            C6614n0 n0Var = this.f12993a;
            n0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling2Service$a0 */
    class C6588a0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6596e0 f12994a;

        C6588a0(Ceiling2Service ceiling2Service, C6596e0 e0Var) {
            this.f12994a = e0Var;
        }

        public void onFailed(int i, String str) {
            this.f12994a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("DelayOff");
            if (property.isValueValid()) {
                this.f12994a.mo32561a((Long) propertyInfo.getValue("DelayOff"));
                return;
            }
            C6596e0 e0Var = this.f12994a;
            e0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling2Service$b */
    class C6589b implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6616o0 f12995a;

        C6589b(Ceiling2Service ceiling2Service, C6616o0 o0Var) {
            this.f12995a = o0Var;
        }

        public void onFailed(int i, String str) {
            this.f12995a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("onFromPower");
            if (property.isValueValid()) {
                this.f12995a.mo32581a((Long) propertyInfo.getValue("onFromPower"));
                return;
            }
            C6616o0 o0Var = this.f12995a;
            o0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling2Service$b0 */
    class C6590b0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6598f0 f12996a;

        C6590b0(Ceiling2Service ceiling2Service, C6598f0 f0Var) {
            this.f12996a = f0Var;
        }

        public void onFailed(int i, String str) {
            this.f12996a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("FlowParams");
            if (property.isValueValid()) {
                this.f12996a.onSucceed((String) propertyInfo.getValue("FlowParams"));
                return;
            }
            C6598f0 f0Var = this.f12996a;
            f0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling2Service$c */
    class C6591c implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6606j0 f12997a;

        C6591c(Ceiling2Service ceiling2Service, C6606j0 j0Var) {
            this.f12997a = j0Var;
        }

        public void onFailed(int i, String str) {
            this.f12997a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("NLBright");
            if (property.isValueValid()) {
                this.f12997a.mo32571a((Long) propertyInfo.getValue("NLBright"));
                return;
            }
            C6606j0 j0Var = this.f12997a;
            j0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling2Service$c0 */
    class C6592c0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6602h0 f12998a;

        C6592c0(Ceiling2Service ceiling2Service, C6602h0 h0Var) {
            this.f12998a = h0Var;
        }

        public void onFailed(int i, String str) {
            this.f12998a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("LanMode");
            if (property.isValueValid()) {
                this.f12998a.mo32567a((Long) propertyInfo.getValue("LanMode"));
                return;
            }
            C6602h0 h0Var = this.f12998a;
            h0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling2Service$d */
    class C6593d implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6608k0 f12999a;

        C6593d(Ceiling2Service ceiling2Service, C6608k0 k0Var) {
            this.f12999a = k0Var;
        }

        public void onFailed(int i, String str) {
            this.f12999a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("NightTimeInfo");
            if (property.isValueValid()) {
                this.f12999a.onSucceed((String) propertyInfo.getValue("NightTimeInfo"));
                return;
            }
            C6608k0 k0Var = this.f12999a;
            k0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling2Service$d0 */
    public interface C6594d0 {
        /* renamed from: a */
        void mo32559a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling2Service$e */
    class C6595e implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6604i0 f13000a;

        C6595e(Ceiling2Service ceiling2Service, C6604i0 i0Var) {
            this.f13000a = i0Var;
        }

        public void onFailed(int i, String str) {
            this.f13000a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("MiBandSleep");
            if (property.isValueValid()) {
                this.f13000a.mo32569a((Long) propertyInfo.getValue("MiBandSleep"));
                return;
            }
            C6604i0 i0Var = this.f13000a;
            i0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling2Service$e0 */
    public interface C6596e0 {
        /* renamed from: a */
        void mo32561a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling2Service$f */
    class C6597f implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6600g0 f13001a;

        C6597f(Ceiling2Service ceiling2Service, C6600g0 g0Var) {
            this.f13001a = g0Var;
        }

        public void onFailed(int i, String str) {
            this.f13001a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Flowing");
            if (property.isValueValid()) {
                this.f13001a.mo32565a((Long) propertyInfo.getValue("Flowing"));
                return;
            }
            C6600g0 g0Var = this.f13001a;
            g0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling2Service$f0 */
    public interface C6598f0 {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling2Service$g */
    class C6599g implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13002a;

        C6599g(Ceiling2Service ceiling2Service, CompletionHandler completionHandler) {
            this.f13002a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13002a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13002a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling2Service$g0 */
    public interface C6600g0 {
        /* renamed from: a */
        void mo32565a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling2Service$h */
    class C6601h implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13003a;

        C6601h(Ceiling2Service ceiling2Service, CompletionHandler completionHandler) {
            this.f13003a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13003a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13003a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling2Service$h0 */
    public interface C6602h0 {
        /* renamed from: a */
        void mo32567a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling2Service$i */
    class C6603i implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13004a;

        C6603i(Ceiling2Service ceiling2Service, CompletionHandler completionHandler) {
            this.f13004a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13004a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13004a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling2Service$i0 */
    public interface C6604i0 {
        /* renamed from: a */
        void mo32569a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling2Service$j */
    class C6605j implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13005a;

        C6605j(Ceiling2Service ceiling2Service, CompletionHandler completionHandler) {
            this.f13005a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13005a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13005a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling2Service$j0 */
    public interface C6606j0 {
        /* renamed from: a */
        void mo32571a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling2Service$k */
    class C6607k implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13006a;

        C6607k(Ceiling2Service ceiling2Service, CompletionHandler completionHandler) {
            this.f13006a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13006a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f13006a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling2Service$k0 */
    public interface C6608k0 {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling2Service$l */
    class C6609l implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13007a;

        C6609l(Ceiling2Service ceiling2Service, CompletionHandler completionHandler) {
            this.f13007a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13007a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13007a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling2Service$l0 */
    public interface C6610l0 {
        /* renamed from: a */
        void mo32575a(Power power);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling2Service$m */
    class C6611m implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13008a;

        C6611m(Ceiling2Service ceiling2Service, CompletionHandler completionHandler) {
            this.f13008a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13008a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13008a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling2Service$m0 */
    public interface C6612m0 {
        /* renamed from: a */
        void mo32577a(Power power, Long l, Long l2, String str, Long l3, Long l4, Long l5, Long l6, String str2, Long l7, Long l8);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling2Service$n */
    class C6613n implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13009a;

        C6613n(Ceiling2Service ceiling2Service, CompletionHandler completionHandler) {
            this.f13009a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13009a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13009a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling2Service$n0 */
    public interface C6614n0 {
        /* renamed from: a */
        void mo32579a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling2Service$o */
    class C6615o implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13010a;

        C6615o(Ceiling2Service ceiling2Service, CompletionHandler completionHandler) {
            this.f13010a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13010a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13010a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling2Service$o0 */
    public interface C6616o0 {
        /* renamed from: a */
        void mo32581a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling2Service$p */
    class C6617p implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13011a;

        C6617p(Ceiling2Service ceiling2Service, CompletionHandler completionHandler) {
            this.f13011a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13011a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13011a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling2Service$p0 */
    public interface C6618p0 {
        /* renamed from: a */
        void mo32583a(Long l);

        /* renamed from: b */
        void mo32584b(Long l);

        /* renamed from: c */
        void mo32585c(Long l);

        /* renamed from: d */
        void mo32586d(Long l);

        /* renamed from: e */
        void mo32587e(String str);

        /* renamed from: f */
        void mo32588f(Long l);

        /* renamed from: g */
        void mo32589g(Long l);

        /* renamed from: h */
        void mo32590h(Power power);

        /* renamed from: i */
        void mo32591i(String str);

        /* renamed from: k */
        void mo32592k(Long l);

        /* renamed from: m */
        void mo32593m(Long l);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling2Service$q */
    class C6619q implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13012a;

        C6619q(Ceiling2Service ceiling2Service, CompletionHandler completionHandler) {
            this.f13012a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13012a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13012a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling2Service$r */
    class C6620r implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13013a;

        C6620r(Ceiling2Service ceiling2Service, CompletionHandler completionHandler) {
            this.f13013a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13013a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13013a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling2Service$s */
    class C6621s implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13014a;

        C6621s(Ceiling2Service ceiling2Service, CompletionHandler completionHandler) {
            this.f13014a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13014a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13014a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling2Service$t */
    class C6622t implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13015a;

        C6622t(Ceiling2Service ceiling2Service, CompletionHandler completionHandler) {
            this.f13015a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13015a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13015a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling2Service$u */
    class C6623u implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13016a;

        C6623u(Ceiling2Service ceiling2Service, CompletionHandler completionHandler) {
            this.f13016a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13016a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13016a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling2Service$v */
    class C6624v implements DeviceManipulator.PropertyChangedListener {

        /* renamed from: a */
        final /* synthetic */ C6618p0 f13017a;

        C6624v(Ceiling2Service ceiling2Service, C6618p0 p0Var) {
            this.f13017a = p0Var;
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
                case -770908584:
                    if (str.equals("NLBright")) {
                        c = 3;
                        break;
                    }
                    break;
                case -80340154:
                    if (str.equals("MiBandSleep")) {
                        c = 4;
                        break;
                    }
                    break;
                case 35911772:
                    if (str.equals("onFromPower")) {
                        c = 5;
                        break;
                    }
                    break;
                case 77306085:
                    if (str.equals("Power")) {
                        c = 6;
                        break;
                    }
                    break;
                case 880790796:
                    if (str.equals("DelayOff")) {
                        c = 7;
                        break;
                    }
                    break;
                case 898856916:
                    if (str.equals("Flowing")) {
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
                        this.f13017a.mo32585c((Long) propertyInfo.getValue("SaveState"));
                        return;
                    }
                    return;
                case 1:
                    if (propertyInfo.getProperty("FlowParams").isValueValid()) {
                        this.f13017a.mo32587e((String) propertyInfo.getValue("FlowParams"));
                        return;
                    }
                    return;
                case 2:
                    if (propertyInfo.getProperty("NightTimeInfo").isValueValid()) {
                        this.f13017a.mo32591i((String) propertyInfo.getValue("NightTimeInfo"));
                        return;
                    }
                    return;
                case 3:
                    if (propertyInfo.getProperty("NLBright").isValueValid()) {
                        this.f13017a.mo32592k((Long) propertyInfo.getValue("NLBright"));
                        return;
                    }
                    return;
                case 4:
                    if (propertyInfo.getProperty("MiBandSleep").isValueValid()) {
                        this.f13017a.mo32593m((Long) propertyInfo.getValue("MiBandSleep"));
                        return;
                    }
                    return;
                case 5:
                    if (propertyInfo.getProperty("onFromPower").isValueValid()) {
                        this.f13017a.mo32588f((Long) propertyInfo.getValue("onFromPower"));
                        return;
                    }
                    return;
                case 6:
                    if (propertyInfo.getProperty("Power").isValueValid()) {
                        this.f13017a.mo32590h(Power.valueOf((String) propertyInfo.getValue("Power")));
                        return;
                    }
                    return;
                case 7:
                    if (propertyInfo.getProperty("DelayOff").isValueValid()) {
                        this.f13017a.mo32584b((Long) propertyInfo.getValue("DelayOff"));
                        return;
                    }
                    return;
                case 8:
                    if (propertyInfo.getProperty("Flowing").isValueValid()) {
                        this.f13017a.mo32586d((Long) propertyInfo.getValue("Flowing"));
                        return;
                    }
                    return;
                case 9:
                    if (propertyInfo.getProperty("LanMode").isValueValid()) {
                        this.f13017a.mo32589g((Long) propertyInfo.getValue("LanMode"));
                        return;
                    }
                    return;
                case 10:
                    if (propertyInfo.getProperty("Bright").isValueValid()) {
                        this.f13017a.mo32583a((Long) propertyInfo.getValue("Bright"));
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling2Service$w */
    class C6625w implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13018a;

        C6625w(Ceiling2Service ceiling2Service, CompletionHandler completionHandler) {
            this.f13018a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13018a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f13018a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling2Service$x */
    class C6626x implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6612m0 f13019a;

        C6626x(Ceiling2Service ceiling2Service, C6612m0 m0Var) {
            this.f13019a = m0Var;
        }

        public void onFailed(int i, String str) {
            this.f13019a.onFailed(i, str);
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
                com.yeelight.yeelib.device.xiaomi.Ceiling2Service$Power r1 = com.yeelight.yeelib.device.xiaomi.Ceiling2Service.Power.valueOf(r1)
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
                com.yeelight.yeelib.device.xiaomi.Ceiling2Service$m0 r4 = r0.f13019a
                r4.mo32577a(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.xiaomi.Ceiling2Service.C6626x.onSucceed(com.miot.common.device.invocation.PropertyInfo):void");
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling2Service$y */
    class C6627y implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6610l0 f13020a;

        C6627y(Ceiling2Service ceiling2Service, C6610l0 l0Var) {
            this.f13020a = l0Var;
        }

        public void onFailed(int i, String str) {
            this.f13020a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Power");
            if (property.isValueValid()) {
                this.f13020a.mo32575a(Power.valueOf((String) propertyInfo.getValue("Power")));
                return;
            }
            C6610l0 l0Var = this.f13020a;
            l0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling2Service$z */
    class C6628z implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6594d0 f13021a;

        C6628z(Ceiling2Service ceiling2Service, C6594d0 d0Var) {
            this.f13021a = d0Var;
        }

        public void onFailed(int i, String str) {
            this.f13021a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Bright");
            if (property.isValueValid()) {
                this.f13021a.mo32559a((Long) propertyInfo.getValue("Bright"));
                return;
            }
            C6594d0 d0Var = this.f13021a;
            d0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
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
                MiotManager.getDeviceManipulator().invoke(create, new C6615o(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6601h(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getBright(C6594d0 d0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Bright"), new C6628z(this, d0Var));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6623u(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getDelayOff(C6596e0 e0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "DelayOff"), new C6588a0(this, e0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowParams(C6598f0 f0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "FlowParams"), new C6590b0(this, f0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowing(C6600g0 g0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Flowing"), new C6597f(this, g0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getLanMode(C6602h0 h0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "LanMode"), new C6592c0(this, h0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getMiBandSleep(C6604i0 i0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "MiBandSleep"), new C6595e(this, i0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getNLBright(C6606j0 j0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "NLBright"), new C6591c(this, j0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getNightTimeInfo(C6608k0 k0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "NightTimeInfo"), new C6593d(this, k0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getPower(C6610l0 l0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Power"), new C6627y(this, l0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getProperties(C6612m0 m0Var) {
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
            MiotManager.getDeviceManipulator().readProperty(create, new C6626x(this, m0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getSaveState(C6614n0 n0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "SaveState"), new C6587a(this, n0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getonFromPower(C6616o0 o0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "onFromPower"), new C6589b(this, o0Var));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6609l(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6603i(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6620r(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6599g(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6617p(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6622t(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6619q(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6611m(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6605j(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6621s(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void subscribeNotifications(CompletionHandler completionHandler, C6618p0 p0Var) {
        if (completionHandler == null) {
            throw new IllegalArgumentException("handler is null");
        } else if (p0Var != null) {
            PropertyInfo create = PropertyInfoFactory.create(getService());
            for (Property next : getService().getProperties()) {
                if (next.getDefinition().isNotifiable()) {
                    create.addProperty(next);
                }
            }
            MiotManager.getDeviceManipulator().addPropertyChangedListener(create, new C6607k(this, completionHandler), new C6624v(this, p0Var));
        } else {
            throw new IllegalArgumentException("listener is null");
        }
    }

    public void toggle(CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "toggle");
            if (create != null) {
                MiotManager.getDeviceManipulator().invoke(create, new C6613n(this, completionHandler));
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
            MiotManager.getDeviceManipulator().removePropertyChangedListener(create, new C6625w(this, completionHandler));
            return;
        }
        throw new IllegalArgumentException("handler is null");
    }
}
