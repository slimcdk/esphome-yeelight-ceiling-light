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

public class Lamp7Service extends AbstractService {
    public static final String ACTION_addCron = "addCron";
    public static final String ACTION_delCron = "delCron";
    public static final String ACTION_getCron = "getCron";
    public static final String ACTION_getData = "getData";
    public static final String ACTION_openWithMode = "openWithMode";
    public static final String ACTION_restore = "restore";
    public static final String ACTION_sendCmd = "sendCmd";
    public static final String ACTION_setBright = "setBright";
    public static final String ACTION_setCt = "setCt";
    public static final String ACTION_setDefault = "setDefault";
    public static final String ACTION_setFlowScene = "setFlowScene";
    public static final String ACTION_setPower = "setPower";
    public static final String ACTION_setScene = "setScene";
    public static final String ACTION_setTime = "setTime";
    public static final String ACTION_toggle = "toggle";
    public static final String PROPERTY_Bright = "Bright";
    public static final String PROPERTY_CmdKey = "CmdKey";
    public static final String PROPERTY_CmdResp = "CmdResp";
    public static final String PROPERTY_CmdValue = "CmdValue";
    public static final String PROPERTY_CronType = "CronType";
    public static final String PROPERTY_Ct = "Ct";
    public static final String PROPERTY_DefaultPomodoro = "DefaultPomodoro";
    public static final String PROPERTY_DelayOff = "DelayOff";
    public static final String PROPERTY_Duration = "Duration";
    public static final String PROPERTY_Effect = "Effect";
    public static final String PROPERTY_FlowParams = "FlowParams";
    public static final String PROPERTY_Flowing = "Flowing";
    public static final String PROPERTY_KidMode = "KidMode";
    public static final String PROPERTY_LanMode = "LanMode";
    public static final String PROPERTY_Mode = "Mode";
    public static final String PROPERTY_ParamColors = "ParamColors";
    public static final String PROPERTY_ParamCount = "ParamCount";
    public static final String PROPERTY_ParamFinish = "ParamFinish";
    public static final String PROPERTY_ParamModel = "ParamModel";
    public static final String PROPERTY_PdoKey = "PdoKey";
    public static final String PROPERTY_Power = "Power";
    public static final String PROPERTY_SaveState = "SaveState";
    public static final String PROPERTY_SensorPirEnable = "SensorPirEnable";
    public static final String PROPERTY_onFromPower = "onFromPower";
    private static final String TAG = "Lamp7Service";
    private AbstractDevice mDevice = null;

    public enum CmdKey {
        undefined,
        cfg_pomodoro,
        cfg_lan_ctrl,
        cfg_save_state,
        cfg_shortkey,
        cfg_init_power,
        sensor_pir_enable,
        kid_mode,
        pomodoro
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

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp7Service$a */
    class C7558a implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7579k0 f13682a;

        C7558a(Lamp7Service lamp7Service, C7579k0 k0Var) {
            this.f13682a = k0Var;
        }

        public void onFailed(int i, String str) {
            this.f13682a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("FlowParams");
            if (property.isValueValid()) {
                this.f13682a.onSucceed((String) propertyInfo.getValue("FlowParams"));
                return;
            }
            C7579k0 k0Var = this.f13682a;
            k0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp7Service$a0 */
    class C7559a0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7587o0 f13683a;

        C7559a0(Lamp7Service lamp7Service, C7587o0 o0Var) {
            this.f13683a = o0Var;
        }

        public void onFailed(int i, String str) {
            this.f13683a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Power");
            if (property.isValueValid()) {
                this.f13683a.mo34060a(Power.valueOf((String) propertyInfo.getValue("Power")));
                return;
            }
            C7587o0 o0Var = this.f13683a;
            o0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp7Service$b */
    class C7560b implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7585n0 f13684a;

        C7560b(Lamp7Service lamp7Service, C7585n0 n0Var) {
            this.f13684a = n0Var;
        }

        public void onFailed(int i, String str) {
            this.f13684a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("LanMode");
            if (property.isValueValid()) {
                this.f13684a.mo34058a((Long) propertyInfo.getValue("LanMode"));
                return;
            }
            C7585n0 n0Var = this.f13684a;
            n0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp7Service$b0 */
    class C7561b0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7569f0 f13685a;

        C7561b0(Lamp7Service lamp7Service, C7569f0 f0Var) {
            this.f13685a = f0Var;
        }

        public void onFailed(int i, String str) {
            this.f13685a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Bright");
            if (property.isValueValid()) {
                this.f13685a.mo34042a((Long) propertyInfo.getValue("Bright"));
                return;
            }
            C7569f0 f0Var = this.f13685a;
            f0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp7Service$c */
    class C7562c implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7591q0 f13686a;

        C7562c(Lamp7Service lamp7Service, C7591q0 q0Var) {
            this.f13686a = q0Var;
        }

        public void onFailed(int i, String str) {
            this.f13686a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("SaveState");
            if (property.isValueValid()) {
                this.f13686a.mo34064a((Long) propertyInfo.getValue("SaveState"));
                return;
            }
            C7591q0 q0Var = this.f13686a;
            q0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp7Service$c0 */
    class C7563c0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7571g0 f13687a;

        C7563c0(Lamp7Service lamp7Service, C7571g0 g0Var) {
            this.f13687a = g0Var;
        }

        public void onFailed(int i, String str) {
            this.f13687a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Ct");
            if (property.isValueValid()) {
                this.f13687a.mo34044a((Long) propertyInfo.getValue("Ct"));
                return;
            }
            C7571g0 g0Var = this.f13687a;
            g0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp7Service$d */
    class C7564d implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7595s0 f13688a;

        C7564d(Lamp7Service lamp7Service, C7595s0 s0Var) {
            this.f13688a = s0Var;
        }

        public void onFailed(int i, String str) {
            this.f13688a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("onFromPower");
            if (property.isValueValid()) {
                this.f13688a.mo34068a((Long) propertyInfo.getValue("onFromPower"));
                return;
            }
            C7595s0 s0Var = this.f13688a;
            s0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp7Service$d0 */
    class C7565d0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7577j0 f13689a;

        C7565d0(Lamp7Service lamp7Service, C7577j0 j0Var) {
            this.f13689a = j0Var;
        }

        public void onFailed(int i, String str) {
            this.f13689a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("DelayOff");
            if (property.isValueValid()) {
                this.f13689a.mo34050a((Long) propertyInfo.getValue("DelayOff"));
                return;
            }
            C7577j0 j0Var = this.f13689a;
            j0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp7Service$e */
    class C7566e implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7581l0 f13690a;

        C7566e(Lamp7Service lamp7Service, C7581l0 l0Var) {
            this.f13690a = l0Var;
        }

        public void onFailed(int i, String str) {
            this.f13690a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Flowing");
            if (property.isValueValid()) {
                this.f13690a.mo34054a((Long) propertyInfo.getValue("Flowing"));
                return;
            }
            C7581l0 l0Var = this.f13690a;
            l0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp7Service$e0 */
    class C7567e0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7583m0 f13691a;

        C7567e0(Lamp7Service lamp7Service, C7583m0 m0Var) {
            this.f13691a = m0Var;
        }

        public void onFailed(int i, String str) {
            this.f13691a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("KidMode");
            if (property.isValueValid()) {
                this.f13691a.mo34056a((Long) propertyInfo.getValue("KidMode"));
                return;
            }
            C7583m0 m0Var = this.f13691a;
            m0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp7Service$f */
    class C7568f implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7593r0 f13692a;

        C7568f(Lamp7Service lamp7Service, C7593r0 r0Var) {
            this.f13692a = r0Var;
        }

        public void onFailed(int i, String str) {
            this.f13692a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty(Lamp7Service.PROPERTY_SensorPirEnable);
            if (property.isValueValid()) {
                this.f13692a.mo34066a((Long) propertyInfo.getValue(Lamp7Service.PROPERTY_SensorPirEnable));
                return;
            }
            C7593r0 r0Var = this.f13692a;
            r0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp7Service$f0 */
    public interface C7569f0 {
        /* renamed from: a */
        void mo34042a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp7Service$g */
    class C7570g implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7575i0 f13693a;

        C7570g(Lamp7Service lamp7Service, C7575i0 i0Var) {
            this.f13693a = i0Var;
        }

        public void onFailed(int i, String str) {
            this.f13693a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty(Lamp7Service.PROPERTY_DefaultPomodoro);
            if (property.isValueValid()) {
                this.f13693a.onSucceed((String) propertyInfo.getValue(Lamp7Service.PROPERTY_DefaultPomodoro));
                return;
            }
            C7575i0 i0Var = this.f13693a;
            i0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp7Service$g0 */
    public interface C7571g0 {
        /* renamed from: a */
        void mo34044a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp7Service$h */
    class C7572h implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13694a;

        C7572h(Lamp7Service lamp7Service, CompletionHandler completionHandler) {
            this.f13694a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13694a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13694a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp7Service$h0 */
    public interface C7573h0 {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp7Service$i */
    class C7574i implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13695a;

        C7574i(Lamp7Service lamp7Service, CompletionHandler completionHandler) {
            this.f13695a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13695a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13695a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp7Service$i0 */
    public interface C7575i0 {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp7Service$j */
    class C7576j implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13696a;

        C7576j(Lamp7Service lamp7Service, CompletionHandler completionHandler) {
            this.f13696a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13696a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13696a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp7Service$j0 */
    public interface C7577j0 {
        /* renamed from: a */
        void mo34050a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp7Service$k */
    class C7578k implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13697a;

        C7578k(Lamp7Service lamp7Service, CompletionHandler completionHandler) {
            this.f13697a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13697a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f13697a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp7Service$k0 */
    public interface C7579k0 {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp7Service$l */
    class C7580l implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13698a;

        C7580l(Lamp7Service lamp7Service, CompletionHandler completionHandler) {
            this.f13698a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13698a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13698a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp7Service$l0 */
    public interface C7581l0 {
        /* renamed from: a */
        void mo34054a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp7Service$m */
    class C7582m implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13699a;

        C7582m(Lamp7Service lamp7Service, CompletionHandler completionHandler) {
            this.f13699a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13699a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13699a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp7Service$m0 */
    public interface C7583m0 {
        /* renamed from: a */
        void mo34056a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp7Service$n */
    class C7584n implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13700a;

        C7584n(Lamp7Service lamp7Service, CompletionHandler completionHandler) {
            this.f13700a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13700a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13700a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp7Service$n0 */
    public interface C7585n0 {
        /* renamed from: a */
        void mo34058a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp7Service$o */
    class C7586o implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13701a;

        C7586o(Lamp7Service lamp7Service, CompletionHandler completionHandler) {
            this.f13701a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13701a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13701a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp7Service$o0 */
    public interface C7587o0 {
        /* renamed from: a */
        void mo34060a(Power power);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp7Service$p */
    class C7588p implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13702a;

        C7588p(Lamp7Service lamp7Service, CompletionHandler completionHandler) {
            this.f13702a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13702a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13702a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp7Service$p0 */
    public interface C7589p0 {
        /* renamed from: a */
        void mo34062a(Power power, Long l, Long l2, Long l3, Long l4, String str, Long l5, Long l6, Long l7, Long l8, Long l9, String str2);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp7Service$q */
    class C7590q implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13703a;

        C7590q(Lamp7Service lamp7Service, CompletionHandler completionHandler) {
            this.f13703a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13703a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13703a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp7Service$q0 */
    public interface C7591q0 {
        /* renamed from: a */
        void mo34064a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp7Service$r */
    class C7592r implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13704a;

        C7592r(Lamp7Service lamp7Service, CompletionHandler completionHandler) {
            this.f13704a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13704a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13704a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp7Service$r0 */
    public interface C7593r0 {
        /* renamed from: a */
        void mo34066a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp7Service$s */
    class C7594s implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13705a;

        C7594s(Lamp7Service lamp7Service, CompletionHandler completionHandler) {
            this.f13705a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13705a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13705a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp7Service$s0 */
    public interface C7595s0 {
        /* renamed from: a */
        void mo34068a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp7Service$t */
    class C7596t implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13706a;

        C7596t(Lamp7Service lamp7Service, CompletionHandler completionHandler) {
            this.f13706a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13706a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13706a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp7Service$t0 */
    public interface C7597t0 {
        /* renamed from: a */
        void mo34070a(Long l);

        /* renamed from: b */
        void mo34071b(Long l);

        /* renamed from: c */
        void mo34072c(Long l);

        /* renamed from: d */
        void mo34073d(Long l);

        /* renamed from: e */
        void mo34074e(String str);

        /* renamed from: f */
        void mo34075f(Long l);

        /* renamed from: g */
        void mo34076g(Long l);

        /* renamed from: h */
        void mo34077h(Long l);

        /* renamed from: i */
        void mo34078i(Long l);

        /* renamed from: j */
        void mo34079j(Long l);

        /* renamed from: k */
        void mo34080k(String str);

        /* renamed from: l */
        void mo34081l(Power power);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp7Service$u */
    class C7598u implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13707a;

        C7598u(Lamp7Service lamp7Service, CompletionHandler completionHandler) {
            this.f13707a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13707a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13707a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp7Service$v */
    class C7599v implements DeviceManipulator.PropertyChangedListener {

        /* renamed from: a */
        final /* synthetic */ C7597t0 f13708a;

        C7599v(Lamp7Service lamp7Service, C7597t0 t0Var) {
            this.f13708a = t0Var;
        }

        public void onPropertyChanged(PropertyInfo propertyInfo, String str) {
            PropertyInfo propertyInfo2 = propertyInfo;
            String str2 = str;
            str.hashCode();
            char c = 65535;
            switch (str.hashCode()) {
                case -2117953292:
                    if (str2.equals("SaveState")) {
                        c = 0;
                        break;
                    }
                    break;
                case -2099609150:
                    if (str2.equals(Lamp7Service.PROPERTY_SensorPirEnable)) {
                        c = 1;
                        break;
                    }
                    break;
                case -2002016140:
                    if (str2.equals("FlowParams")) {
                        c = 2;
                        break;
                    }
                    break;
                case 2193:
                    if (str2.equals("Ct")) {
                        c = 3;
                        break;
                    }
                    break;
                case 35911772:
                    if (str2.equals("onFromPower")) {
                        c = 4;
                        break;
                    }
                    break;
                case 77306085:
                    if (str2.equals("Power")) {
                        c = 5;
                        break;
                    }
                    break;
                case 880790796:
                    if (str2.equals("DelayOff")) {
                        c = 6;
                        break;
                    }
                    break;
                case 898856916:
                    if (str2.equals("Flowing")) {
                        c = 7;
                        break;
                    }
                    break;
                case 944116073:
                    if (str2.equals("KidMode")) {
                        c = 8;
                        break;
                    }
                    break;
                case 1582171306:
                    if (str2.equals(Lamp7Service.PROPERTY_DefaultPomodoro)) {
                        c = 9;
                        break;
                    }
                    break;
                case 1611821756:
                    if (str2.equals("LanMode")) {
                        c = 10;
                        break;
                    }
                    break;
                case 1998035738:
                    if (str2.equals("Bright")) {
                        c = 11;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    if (propertyInfo2.getProperty("SaveState").isValueValid()) {
                        this.f13708a.mo34072c((Long) propertyInfo2.getValue("SaveState"));
                        return;
                    }
                    return;
                case 1:
                    if (propertyInfo2.getProperty(Lamp7Service.PROPERTY_SensorPirEnable).isValueValid()) {
                        this.f13708a.mo34079j((Long) propertyInfo2.getValue(Lamp7Service.PROPERTY_SensorPirEnable));
                        return;
                    }
                    return;
                case 2:
                    if (propertyInfo2.getProperty("FlowParams").isValueValid()) {
                        this.f13708a.mo34074e((String) propertyInfo2.getValue("FlowParams"));
                        return;
                    }
                    return;
                case 3:
                    if (propertyInfo2.getProperty("Ct").isValueValid()) {
                        this.f13708a.mo34077h((Long) propertyInfo2.getValue("Ct"));
                        return;
                    }
                    return;
                case 4:
                    if (propertyInfo2.getProperty("onFromPower").isValueValid()) {
                        this.f13708a.mo34075f((Long) propertyInfo2.getValue("onFromPower"));
                        return;
                    }
                    return;
                case 5:
                    if (propertyInfo2.getProperty("Power").isValueValid()) {
                        this.f13708a.mo34081l(Power.valueOf((String) propertyInfo2.getValue("Power")));
                        return;
                    }
                    return;
                case 6:
                    if (propertyInfo2.getProperty("DelayOff").isValueValid()) {
                        this.f13708a.mo34071b((Long) propertyInfo2.getValue("DelayOff"));
                        return;
                    }
                    return;
                case 7:
                    if (propertyInfo2.getProperty("Flowing").isValueValid()) {
                        this.f13708a.mo34073d((Long) propertyInfo2.getValue("Flowing"));
                        return;
                    }
                    return;
                case 8:
                    if (propertyInfo2.getProperty("KidMode").isValueValid()) {
                        this.f13708a.mo34078i((Long) propertyInfo2.getValue("KidMode"));
                        return;
                    }
                    return;
                case 9:
                    if (propertyInfo2.getProperty(Lamp7Service.PROPERTY_DefaultPomodoro).isValueValid()) {
                        this.f13708a.mo34080k((String) propertyInfo2.getValue(Lamp7Service.PROPERTY_DefaultPomodoro));
                        return;
                    }
                    return;
                case 10:
                    if (propertyInfo2.getProperty("LanMode").isValueValid()) {
                        this.f13708a.mo34076g((Long) propertyInfo2.getValue("LanMode"));
                        return;
                    }
                    return;
                case 11:
                    if (propertyInfo2.getProperty("Bright").isValueValid()) {
                        this.f13708a.mo34070a((Long) propertyInfo2.getValue("Bright"));
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp7Service$w */
    class C7600w implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7573h0 f13709a;

        C7600w(Lamp7Service lamp7Service, C7573h0 h0Var) {
            this.f13709a = h0Var;
        }

        public void onFailed(int i, String str) {
            this.f13709a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            Object argumentValue = actionInfo.getArgumentValue("CmdResp");
            this.f13709a.onSucceed(argumentValue != null ? (String) argumentValue : null);
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp7Service$x */
    class C7601x implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13710a;

        C7601x(Lamp7Service lamp7Service, CompletionHandler completionHandler) {
            this.f13710a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13710a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13710a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp7Service$y */
    class C7602y implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13711a;

        C7602y(Lamp7Service lamp7Service, CompletionHandler completionHandler) {
            this.f13711a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13711a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f13711a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp7Service$z */
    class C7603z implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7589p0 f13712a;

        C7603z(Lamp7Service lamp7Service, C7589p0 p0Var) {
            this.f13712a = p0Var;
        }

        public void onFailed(int i, String str) {
            this.f13712a.onFailed(i, str);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.String} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onSucceed(com.miot.common.device.invocation.PropertyInfo r18) {
            /*
                r17 = this;
                r0 = r18
                java.lang.String r1 = "Power"
                com.miot.common.property.Property r1 = r0.getProperty(r1)
                boolean r2 = r1.isValueValid()
                r3 = 0
                if (r2 == 0) goto L_0x001b
                java.lang.Object r1 = r1.getValue()
                java.lang.String r1 = (java.lang.String) r1
                com.yeelight.yeelib.device.xiaomi.Lamp7Service$Power r1 = com.yeelight.yeelib.device.xiaomi.Lamp7Service.Power.valueOf(r1)
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
                java.lang.String r1 = "KidMode"
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
                java.lang.String r1 = "SaveState"
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
                java.lang.String r1 = "onFromPower"
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
                java.lang.String r1 = "Flowing"
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
                java.lang.String r1 = "SensorPirEnable"
                com.miot.common.property.Property r1 = r0.getProperty(r1)
                boolean r2 = r1.isValueValid()
                if (r2 == 0) goto L_0x00ed
                java.lang.Object r1 = r1.getValue()
                java.lang.Long r1 = (java.lang.Long) r1
                r15 = r1
                goto L_0x00ee
            L_0x00ed:
                r15 = r3
            L_0x00ee:
                java.lang.String r1 = "DefaultPomodoro"
                com.miot.common.property.Property r0 = r0.getProperty(r1)
                boolean r1 = r0.isValueValid()
                if (r1 == 0) goto L_0x0101
                java.lang.Object r0 = r0.getValue()
                r3 = r0
                java.lang.String r3 = (java.lang.String) r3
            L_0x0101:
                r0 = r17
                r16 = r3
                com.yeelight.yeelib.device.xiaomi.Lamp7Service$p0 r4 = r0.f13712a
                r4.mo34062a(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.xiaomi.Lamp7Service.C7603z.onSucceed(com.miot.common.device.invocation.PropertyInfo):void");
        }
    }

    public Lamp7Service(AbstractDevice abstractDevice) {
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
                MiotManager.getDeviceManipulator().invoke(create, new C7588p(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7574i(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getBright(C7569f0 f0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Bright"), new C7561b0(this, f0Var));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7598u(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getCt(C7571g0 g0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Ct"), new C7563c0(this, g0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getData(CmdKey cmdKey, String str, C7573h0 h0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "getData");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("CmdKey", cmdKey.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("CmdValue", str)) {
                MiotManager.getDeviceManipulator().invoke(create, new C7600w(this, h0Var));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getDefaultPomodoro(C7575i0 i0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), PROPERTY_DefaultPomodoro), new C7570g(this, i0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getDelayOff(C7577j0 j0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "DelayOff"), new C7565d0(this, j0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowParams(C7579k0 k0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "FlowParams"), new C7558a(this, k0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowing(C7581l0 l0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Flowing"), new C7566e(this, l0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getKidMode(C7583m0 m0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "KidMode"), new C7567e0(this, m0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getLanMode(C7585n0 n0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "LanMode"), new C7560b(this, n0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getPower(C7587o0 o0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Power"), new C7559a0(this, o0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getProperties(C7589p0 p0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            PropertyInfo create = PropertyInfoFactory.create(getService());
            create.addProperty(getService().getProperty("Power"));
            create.addProperty(getService().getProperty("Bright"));
            create.addProperty(getService().getProperty("Ct"));
            create.addProperty(getService().getProperty("DelayOff"));
            create.addProperty(getService().getProperty("KidMode"));
            create.addProperty(getService().getProperty("FlowParams"));
            create.addProperty(getService().getProperty("LanMode"));
            create.addProperty(getService().getProperty("SaveState"));
            create.addProperty(getService().getProperty("onFromPower"));
            create.addProperty(getService().getProperty("Flowing"));
            create.addProperty(getService().getProperty(PROPERTY_SensorPirEnable));
            create.addProperty(getService().getProperty(PROPERTY_DefaultPomodoro));
            MiotManager.getDeviceManipulator().readProperty(create, new C7603z(this, p0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getSaveState(C7591q0 q0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "SaveState"), new C7562c(this, q0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getSensorPirEnable(C7593r0 r0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), PROPERTY_SensorPirEnable), new C7568f(this, r0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getonFromPower(C7595s0 s0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "onFromPower"), new C7564d(this, s0Var));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7582m(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7576j(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7592r(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7572h(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7596t(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7590q(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7594s(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7584n(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7580l(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setTime(CmdKey cmdKey, String str, String str2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), ACTION_setTime);
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("CmdKey", cmdKey.toString())) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue(PROPERTY_PdoKey, str)) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("CmdValue", str2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C7601x(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void subscribeNotifications(CompletionHandler completionHandler, C7597t0 t0Var) {
        if (completionHandler == null) {
            throw new IllegalArgumentException("handler is null");
        } else if (t0Var != null) {
            PropertyInfo create = PropertyInfoFactory.create(getService());
            for (Property next : getService().getProperties()) {
                if (next.getDefinition().isNotifiable()) {
                    create.addProperty(next);
                }
            }
            MiotManager.getDeviceManipulator().addPropertyChangedListener(create, new C7578k(this, completionHandler), new C7599v(this, t0Var));
        } else {
            throw new IllegalArgumentException("listener is null");
        }
    }

    public void toggle(CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "toggle");
            if (create != null) {
                MiotManager.getDeviceManipulator().invoke(create, new C7586o(this, completionHandler));
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
            MiotManager.getDeviceManipulator().removePropertyChangedListener(create, new C7602y(this, completionHandler));
            return;
        }
        throw new IllegalArgumentException("handler is null");
    }
}
