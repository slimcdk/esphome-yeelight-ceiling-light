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

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp7Service$a */
    class C9066a implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9091m0 f17008a;

        C9066a(Lamp7Service lamp7Service, C9091m0 m0Var) {
            this.f17008a = m0Var;
        }

        public void onFailed(int i, String str) {
            this.f17008a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("FlowParams");
            if (property.isValueValid()) {
                this.f17008a.onSucceed((String) propertyInfo.getValue("FlowParams"));
                return;
            }
            C9091m0 m0Var = this.f17008a;
            m0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp7Service$a0 */
    class C9067a0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9099q0 f17009a;

        C9067a0(Lamp7Service lamp7Service, C9099q0 q0Var) {
            this.f17009a = q0Var;
        }

        public void onFailed(int i, String str) {
            this.f17009a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Power");
            if (property.isValueValid()) {
                this.f17009a.mo30753a(C9109v0.valueOf((String) propertyInfo.getValue("Power")));
                return;
            }
            C9099q0 q0Var = this.f17009a;
            q0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp7Service$b */
    class C9068b implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9097p0 f17010a;

        C9068b(Lamp7Service lamp7Service, C9097p0 p0Var) {
            this.f17010a = p0Var;
        }

        public void onFailed(int i, String str) {
            this.f17010a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("LanMode");
            if (property.isValueValid()) {
                this.f17010a.mo30751a((Long) propertyInfo.getValue("LanMode"));
                return;
            }
            C9097p0 p0Var = this.f17010a;
            p0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp7Service$b0 */
    class C9069b0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9081h0 f17011a;

        C9069b0(Lamp7Service lamp7Service, C9081h0 h0Var) {
            this.f17011a = h0Var;
        }

        public void onFailed(int i, String str) {
            this.f17011a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Bright");
            if (property.isValueValid()) {
                this.f17011a.mo30735a((Long) propertyInfo.getValue("Bright"));
                return;
            }
            C9081h0 h0Var = this.f17011a;
            h0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp7Service$c */
    class C9070c implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9103s0 f17012a;

        C9070c(Lamp7Service lamp7Service, C9103s0 s0Var) {
            this.f17012a = s0Var;
        }

        public void onFailed(int i, String str) {
            this.f17012a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("SaveState");
            if (property.isValueValid()) {
                this.f17012a.mo30755a((Long) propertyInfo.getValue("SaveState"));
                return;
            }
            C9103s0 s0Var = this.f17012a;
            s0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp7Service$c0 */
    class C9071c0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9083i0 f17013a;

        C9071c0(Lamp7Service lamp7Service, C9083i0 i0Var) {
            this.f17013a = i0Var;
        }

        public void onFailed(int i, String str) {
            this.f17013a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Ct");
            if (property.isValueValid()) {
                this.f17013a.mo30737a((Long) propertyInfo.getValue("Ct"));
                return;
            }
            C9083i0 i0Var = this.f17013a;
            i0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp7Service$d */
    class C9072d implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9107u0 f17014a;

        C9072d(Lamp7Service lamp7Service, C9107u0 u0Var) {
            this.f17014a = u0Var;
        }

        public void onFailed(int i, String str) {
            this.f17014a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("onFromPower");
            if (property.isValueValid()) {
                this.f17014a.mo30759a((Long) propertyInfo.getValue("onFromPower"));
                return;
            }
            C9107u0 u0Var = this.f17014a;
            u0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp7Service$d0 */
    class C9073d0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9089l0 f17015a;

        C9073d0(Lamp7Service lamp7Service, C9089l0 l0Var) {
            this.f17015a = l0Var;
        }

        public void onFailed(int i, String str) {
            this.f17015a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("DelayOff");
            if (property.isValueValid()) {
                this.f17015a.mo30743a((Long) propertyInfo.getValue("DelayOff"));
                return;
            }
            C9089l0 l0Var = this.f17015a;
            l0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp7Service$e */
    class C9074e implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9093n0 f17016a;

        C9074e(Lamp7Service lamp7Service, C9093n0 n0Var) {
            this.f17016a = n0Var;
        }

        public void onFailed(int i, String str) {
            this.f17016a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Flowing");
            if (property.isValueValid()) {
                this.f17016a.mo30747a((Long) propertyInfo.getValue("Flowing"));
                return;
            }
            C9093n0 n0Var = this.f17016a;
            n0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp7Service$e0 */
    class C9075e0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9095o0 f17017a;

        C9075e0(Lamp7Service lamp7Service, C9095o0 o0Var) {
            this.f17017a = o0Var;
        }

        public void onFailed(int i, String str) {
            this.f17017a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("KidMode");
            if (property.isValueValid()) {
                this.f17017a.mo30749a((Long) propertyInfo.getValue("KidMode"));
                return;
            }
            C9095o0 o0Var = this.f17017a;
            o0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp7Service$f */
    class C9076f implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9105t0 f17018a;

        C9076f(Lamp7Service lamp7Service, C9105t0 t0Var) {
            this.f17018a = t0Var;
        }

        public void onFailed(int i, String str) {
            this.f17018a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty(Lamp7Service.PROPERTY_SensorPirEnable);
            if (property.isValueValid()) {
                this.f17018a.mo30757a((Long) propertyInfo.getValue(Lamp7Service.PROPERTY_SensorPirEnable));
                return;
            }
            C9105t0 t0Var = this.f17018a;
            t0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp7Service$f0 */
    public enum C9077f0 {
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

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp7Service$g */
    class C9078g implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9087k0 f17029a;

        C9078g(Lamp7Service lamp7Service, C9087k0 k0Var) {
            this.f17029a = k0Var;
        }

        public void onFailed(int i, String str) {
            this.f17029a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty(Lamp7Service.PROPERTY_DefaultPomodoro);
            if (property.isValueValid()) {
                this.f17029a.onSucceed((String) propertyInfo.getValue(Lamp7Service.PROPERTY_DefaultPomodoro));
                return;
            }
            C9087k0 k0Var = this.f17029a;
            k0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp7Service$g0 */
    public enum C9079g0 {
        undefined,
        smooth,
        sudden
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp7Service$h */
    class C9080h implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17034a;

        C9080h(Lamp7Service lamp7Service, CompletionHandler completionHandler) {
            this.f17034a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17034a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17034a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp7Service$h0 */
    public interface C9081h0 {
        /* renamed from: a */
        void mo30735a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp7Service$i */
    class C9082i implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17035a;

        C9082i(Lamp7Service lamp7Service, CompletionHandler completionHandler) {
            this.f17035a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17035a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17035a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp7Service$i0 */
    public interface C9083i0 {
        /* renamed from: a */
        void mo30737a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp7Service$j */
    class C9084j implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17036a;

        C9084j(Lamp7Service lamp7Service, CompletionHandler completionHandler) {
            this.f17036a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17036a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17036a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp7Service$j0 */
    public interface C9085j0 {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp7Service$k */
    class C9086k implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17037a;

        C9086k(Lamp7Service lamp7Service, CompletionHandler completionHandler) {
            this.f17037a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17037a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f17037a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp7Service$k0 */
    public interface C9087k0 {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp7Service$l */
    class C9088l implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17038a;

        C9088l(Lamp7Service lamp7Service, CompletionHandler completionHandler) {
            this.f17038a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17038a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17038a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp7Service$l0 */
    public interface C9089l0 {
        /* renamed from: a */
        void mo30743a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp7Service$m */
    class C9090m implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17039a;

        C9090m(Lamp7Service lamp7Service, CompletionHandler completionHandler) {
            this.f17039a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17039a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17039a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp7Service$m0 */
    public interface C9091m0 {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp7Service$n */
    class C9092n implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17040a;

        C9092n(Lamp7Service lamp7Service, CompletionHandler completionHandler) {
            this.f17040a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17040a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17040a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp7Service$n0 */
    public interface C9093n0 {
        /* renamed from: a */
        void mo30747a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp7Service$o */
    class C9094o implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17041a;

        C9094o(Lamp7Service lamp7Service, CompletionHandler completionHandler) {
            this.f17041a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17041a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17041a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp7Service$o0 */
    public interface C9095o0 {
        /* renamed from: a */
        void mo30749a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp7Service$p */
    class C9096p implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17042a;

        C9096p(Lamp7Service lamp7Service, CompletionHandler completionHandler) {
            this.f17042a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17042a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17042a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp7Service$p0 */
    public interface C9097p0 {
        /* renamed from: a */
        void mo30751a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp7Service$q */
    class C9098q implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17043a;

        C9098q(Lamp7Service lamp7Service, CompletionHandler completionHandler) {
            this.f17043a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17043a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17043a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp7Service$q0 */
    public interface C9099q0 {
        /* renamed from: a */
        void mo30753a(C9109v0 v0Var);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp7Service$r */
    class C9100r implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17044a;

        C9100r(Lamp7Service lamp7Service, CompletionHandler completionHandler) {
            this.f17044a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17044a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17044a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp7Service$r0 */
    public interface C9101r0 {
        /* renamed from: a */
        void mo28370a(C9109v0 v0Var, Long l, Long l2, Long l3, Long l4, String str, Long l5, Long l6, Long l7, Long l8, Long l9, String str2);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp7Service$s */
    class C9102s implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17045a;

        C9102s(Lamp7Service lamp7Service, CompletionHandler completionHandler) {
            this.f17045a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17045a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17045a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp7Service$s0 */
    public interface C9103s0 {
        /* renamed from: a */
        void mo30755a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp7Service$t */
    class C9104t implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17046a;

        C9104t(Lamp7Service lamp7Service, CompletionHandler completionHandler) {
            this.f17046a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17046a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17046a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp7Service$t0 */
    public interface C9105t0 {
        /* renamed from: a */
        void mo30757a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp7Service$u */
    class C9106u implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17047a;

        C9106u(Lamp7Service lamp7Service, CompletionHandler completionHandler) {
            this.f17047a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17047a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17047a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp7Service$u0 */
    public interface C9107u0 {
        /* renamed from: a */
        void mo30759a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp7Service$v */
    class C9108v implements DeviceManipulator.PropertyChangedListener {

        /* renamed from: a */
        final /* synthetic */ C9111w0 f17048a;

        C9108v(Lamp7Service lamp7Service, C9111w0 w0Var) {
            this.f17048a = w0Var;
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onPropertyChanged(com.miot.common.device.invocation.PropertyInfo r14, java.lang.String r15) {
            /*
                r13 = this;
                int r0 = r15.hashCode()
                java.lang.String r1 = "Bright"
                java.lang.String r2 = "LanMode"
                java.lang.String r3 = "DefaultPomodoro"
                java.lang.String r4 = "KidMode"
                java.lang.String r5 = "Flowing"
                java.lang.String r6 = "DelayOff"
                java.lang.String r7 = "Power"
                java.lang.String r8 = "onFromPower"
                java.lang.String r9 = "Ct"
                java.lang.String r10 = "FlowParams"
                java.lang.String r11 = "SensorPirEnable"
                java.lang.String r12 = "SaveState"
                switch(r0) {
                    case -2117953292: goto L_0x007e;
                    case -2099609150: goto L_0x0075;
                    case -2002016140: goto L_0x006d;
                    case 2193: goto L_0x0065;
                    case 35911772: goto L_0x005c;
                    case 77306085: goto L_0x0054;
                    case 880790796: goto L_0x004c;
                    case 898856916: goto L_0x0043;
                    case 944116073: goto L_0x003b;
                    case 1582171306: goto L_0x0032;
                    case 1611821756: goto L_0x002a;
                    case 1998035738: goto L_0x0021;
                    default: goto L_0x001f;
                }
            L_0x001f:
                goto L_0x0086
            L_0x0021:
                boolean r15 = r15.equals(r1)
                if (r15 == 0) goto L_0x0086
                r15 = 1
                goto L_0x0087
            L_0x002a:
                boolean r15 = r15.equals(r2)
                if (r15 == 0) goto L_0x0086
                r15 = 6
                goto L_0x0087
            L_0x0032:
                boolean r15 = r15.equals(r3)
                if (r15 == 0) goto L_0x0086
                r15 = 11
                goto L_0x0087
            L_0x003b:
                boolean r15 = r15.equals(r4)
                if (r15 == 0) goto L_0x0086
                r15 = 4
                goto L_0x0087
            L_0x0043:
                boolean r15 = r15.equals(r5)
                if (r15 == 0) goto L_0x0086
                r15 = 9
                goto L_0x0087
            L_0x004c:
                boolean r15 = r15.equals(r6)
                if (r15 == 0) goto L_0x0086
                r15 = 3
                goto L_0x0087
            L_0x0054:
                boolean r15 = r15.equals(r7)
                if (r15 == 0) goto L_0x0086
                r15 = 0
                goto L_0x0087
            L_0x005c:
                boolean r15 = r15.equals(r8)
                if (r15 == 0) goto L_0x0086
                r15 = 8
                goto L_0x0087
            L_0x0065:
                boolean r15 = r15.equals(r9)
                if (r15 == 0) goto L_0x0086
                r15 = 2
                goto L_0x0087
            L_0x006d:
                boolean r15 = r15.equals(r10)
                if (r15 == 0) goto L_0x0086
                r15 = 5
                goto L_0x0087
            L_0x0075:
                boolean r15 = r15.equals(r11)
                if (r15 == 0) goto L_0x0086
                r15 = 10
                goto L_0x0087
            L_0x007e:
                boolean r15 = r15.equals(r12)
                if (r15 == 0) goto L_0x0086
                r15 = 7
                goto L_0x0087
            L_0x0086:
                r15 = -1
            L_0x0087:
                switch(r15) {
                    case 0: goto L_0x0185;
                    case 1: goto L_0x016f;
                    case 2: goto L_0x0159;
                    case 3: goto L_0x0143;
                    case 4: goto L_0x012d;
                    case 5: goto L_0x0116;
                    case 6: goto L_0x00ff;
                    case 7: goto L_0x00e8;
                    case 8: goto L_0x00d1;
                    case 9: goto L_0x00ba;
                    case 10: goto L_0x00a3;
                    case 11: goto L_0x008c;
                    default: goto L_0x008a;
                }
            L_0x008a:
                goto L_0x019e
            L_0x008c:
                com.miot.common.property.Property r15 = r14.getProperty(r3)
                boolean r15 = r15.isValueValid()
                if (r15 == 0) goto L_0x019e
                java.lang.Object r14 = r14.getValue(r3)
                java.lang.String r14 = (java.lang.String) r14
                com.yeelight.yeelib.device.xiaomi.Lamp7Service$w0 r15 = r13.f17048a
                r15.mo28368k(r14)
                goto L_0x019e
            L_0x00a3:
                com.miot.common.property.Property r15 = r14.getProperty(r11)
                boolean r15 = r15.isValueValid()
                if (r15 == 0) goto L_0x019e
                java.lang.Object r14 = r14.getValue(r11)
                java.lang.Long r14 = (java.lang.Long) r14
                com.yeelight.yeelib.device.xiaomi.Lamp7Service$w0 r15 = r13.f17048a
                r15.mo28367j(r14)
                goto L_0x019e
            L_0x00ba:
                com.miot.common.property.Property r15 = r14.getProperty(r5)
                boolean r15 = r15.isValueValid()
                if (r15 == 0) goto L_0x019e
                java.lang.Object r14 = r14.getValue(r5)
                java.lang.Long r14 = (java.lang.Long) r14
                com.yeelight.yeelib.device.xiaomi.Lamp7Service$w0 r15 = r13.f17048a
                r15.mo28360c(r14)
                goto L_0x019e
            L_0x00d1:
                com.miot.common.property.Property r15 = r14.getProperty(r8)
                boolean r15 = r15.isValueValid()
                if (r15 == 0) goto L_0x019e
                java.lang.Object r14 = r14.getValue(r8)
                java.lang.Long r14 = (java.lang.Long) r14
                com.yeelight.yeelib.device.xiaomi.Lamp7Service$w0 r15 = r13.f17048a
                r15.mo28363f(r14)
                goto L_0x019e
            L_0x00e8:
                com.miot.common.property.Property r15 = r14.getProperty(r12)
                boolean r15 = r15.isValueValid()
                if (r15 == 0) goto L_0x019e
                java.lang.Object r14 = r14.getValue(r12)
                java.lang.Long r14 = (java.lang.Long) r14
                com.yeelight.yeelib.device.xiaomi.Lamp7Service$w0 r15 = r13.f17048a
                r15.mo28361d(r14)
                goto L_0x019e
            L_0x00ff:
                com.miot.common.property.Property r15 = r14.getProperty(r2)
                boolean r15 = r15.isValueValid()
                if (r15 == 0) goto L_0x019e
                java.lang.Object r14 = r14.getValue(r2)
                java.lang.Long r14 = (java.lang.Long) r14
                com.yeelight.yeelib.device.xiaomi.Lamp7Service$w0 r15 = r13.f17048a
                r15.mo28364g(r14)
                goto L_0x019e
            L_0x0116:
                com.miot.common.property.Property r15 = r14.getProperty(r10)
                boolean r15 = r15.isValueValid()
                if (r15 == 0) goto L_0x019e
                java.lang.Object r14 = r14.getValue(r10)
                java.lang.String r14 = (java.lang.String) r14
                com.yeelight.yeelib.device.xiaomi.Lamp7Service$w0 r15 = r13.f17048a
                r15.mo28362e(r14)
                goto L_0x019e
            L_0x012d:
                com.miot.common.property.Property r15 = r14.getProperty(r4)
                boolean r15 = r15.isValueValid()
                if (r15 == 0) goto L_0x019e
                java.lang.Object r14 = r14.getValue(r4)
                java.lang.Long r14 = (java.lang.Long) r14
                com.yeelight.yeelib.device.xiaomi.Lamp7Service$w0 r15 = r13.f17048a
                r15.mo28366i(r14)
                goto L_0x019e
            L_0x0143:
                com.miot.common.property.Property r15 = r14.getProperty(r6)
                boolean r15 = r15.isValueValid()
                if (r15 == 0) goto L_0x019e
                java.lang.Object r14 = r14.getValue(r6)
                java.lang.Long r14 = (java.lang.Long) r14
                com.yeelight.yeelib.device.xiaomi.Lamp7Service$w0 r15 = r13.f17048a
                r15.mo28359b(r14)
                goto L_0x019e
            L_0x0159:
                com.miot.common.property.Property r15 = r14.getProperty(r9)
                boolean r15 = r15.isValueValid()
                if (r15 == 0) goto L_0x019e
                java.lang.Object r14 = r14.getValue(r9)
                java.lang.Long r14 = (java.lang.Long) r14
                com.yeelight.yeelib.device.xiaomi.Lamp7Service$w0 r15 = r13.f17048a
                r15.mo28365h(r14)
                goto L_0x019e
            L_0x016f:
                com.miot.common.property.Property r15 = r14.getProperty(r1)
                boolean r15 = r15.isValueValid()
                if (r15 == 0) goto L_0x019e
                java.lang.Object r14 = r14.getValue(r1)
                java.lang.Long r14 = (java.lang.Long) r14
                com.yeelight.yeelib.device.xiaomi.Lamp7Service$w0 r15 = r13.f17048a
                r15.mo28358a(r14)
                goto L_0x019e
            L_0x0185:
                com.miot.common.property.Property r15 = r14.getProperty(r7)
                boolean r15 = r15.isValueValid()
                if (r15 == 0) goto L_0x019e
                java.lang.Object r14 = r14.getValue(r7)
                java.lang.String r14 = (java.lang.String) r14
                com.yeelight.yeelib.device.xiaomi.Lamp7Service$v0 r14 = com.yeelight.yeelib.device.xiaomi.Lamp7Service.C9109v0.valueOf(r14)
                com.yeelight.yeelib.device.xiaomi.Lamp7Service$w0 r15 = r13.f17048a
                r15.mo28369l(r14)
            L_0x019e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.xiaomi.Lamp7Service.C9108v.onPropertyChanged(com.miot.common.device.invocation.PropertyInfo, java.lang.String):void");
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp7Service$v0 */
    public enum C9109v0 {
        undefined,
        on,
        off
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp7Service$w */
    class C9110w implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9085j0 f17053a;

        C9110w(Lamp7Service lamp7Service, C9085j0 j0Var) {
            this.f17053a = j0Var;
        }

        public void onFailed(int i, String str) {
            this.f17053a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            Object argumentValue = actionInfo.getArgumentValue("CmdResp");
            this.f17053a.onSucceed(argumentValue != null ? (String) argumentValue : null);
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp7Service$w0 */
    public interface C9111w0 {
        /* renamed from: a */
        void mo28358a(Long l);

        /* renamed from: b */
        void mo28359b(Long l);

        /* renamed from: c */
        void mo28360c(Long l);

        /* renamed from: d */
        void mo28361d(Long l);

        /* renamed from: e */
        void mo28362e(String str);

        /* renamed from: f */
        void mo28363f(Long l);

        /* renamed from: g */
        void mo28364g(Long l);

        /* renamed from: h */
        void mo28365h(Long l);

        /* renamed from: i */
        void mo28366i(Long l);

        /* renamed from: j */
        void mo28367j(Long l);

        /* renamed from: k */
        void mo28368k(String str);

        /* renamed from: l */
        void mo28369l(C9109v0 v0Var);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp7Service$x */
    class C9112x implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17054a;

        C9112x(Lamp7Service lamp7Service, CompletionHandler completionHandler) {
            this.f17054a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17054a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17054a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp7Service$y */
    class C9113y implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17055a;

        C9113y(Lamp7Service lamp7Service, CompletionHandler completionHandler) {
            this.f17055a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17055a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f17055a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp7Service$z */
    class C9114z implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9101r0 f17056a;

        C9114z(Lamp7Service lamp7Service, C9101r0 r0Var) {
            this.f17056a = r0Var;
        }

        public void onFailed(int i, String str) {
            this.f17056a.onFailed(i, str);
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
                com.yeelight.yeelib.device.xiaomi.Lamp7Service$v0 r1 = com.yeelight.yeelib.device.xiaomi.Lamp7Service.C9109v0.valueOf(r1)
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
                com.yeelight.yeelib.device.xiaomi.Lamp7Service$r0 r4 = r0.f17056a
                r4.mo28370a(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.xiaomi.Lamp7Service.C9114z.onSucceed(com.miot.common.device.invocation.PropertyInfo):void");
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
                MiotManager.getDeviceManipulator().invoke(create, new C9096p(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C9082i(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getBright(C9081h0 h0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Bright"), new C9069b0(this, h0Var));
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
                MiotManager.getDeviceManipulator().invoke(create, new C9106u(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getCt(C9083i0 i0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Ct"), new C9071c0(this, i0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getData(C9077f0 f0Var, String str, C9085j0 j0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "getData");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("CmdKey", f0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("CmdValue", str)) {
                MiotManager.getDeviceManipulator().invoke(create, new C9110w(this, j0Var));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getDefaultPomodoro(C9087k0 k0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), PROPERTY_DefaultPomodoro), new C9078g(this, k0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getDelayOff(C9089l0 l0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "DelayOff"), new C9073d0(this, l0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowParams(C9091m0 m0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "FlowParams"), new C9066a(this, m0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowing(C9093n0 n0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Flowing"), new C9074e(this, n0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getKidMode(C9095o0 o0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "KidMode"), new C9075e0(this, o0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getLanMode(C9097p0 p0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "LanMode"), new C9068b(this, p0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getPower(C9099q0 q0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Power"), new C9067a0(this, q0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getProperties(C9101r0 r0Var) {
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
            MiotManager.getDeviceManipulator().readProperty(create, new C9114z(this, r0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getSaveState(C9103s0 s0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "SaveState"), new C9070c(this, s0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getSensorPirEnable(C9105t0 t0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), PROPERTY_SensorPirEnable), new C9076f(this, t0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getonFromPower(C9107u0 u0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "onFromPower"), new C9072d(this, u0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void openWithMode(C9109v0 v0Var, C9079g0 g0Var, Long l, Long l2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "openWithMode");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("Power", v0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Effect", g0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Duration", l)) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("Mode", l2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C9090m(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C9084j(this, completionHandler));
                return;
            }
            throw new MiotException("actionInfo is null");
        }
        throw new MiotException("device not configurated connection");
    }

    public void sendCmd(C9077f0 f0Var, String str, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "sendCmd");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("CmdKey", f0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("CmdValue", str)) {
                MiotManager.getDeviceManipulator().invoke(create, new C9100r(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setBright(Long l, C9079g0 g0Var, Long l2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setBright");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("Bright", l)) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Effect", g0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("Duration", l2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C9080h(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setCt(Long l, C9079g0 g0Var, Long l2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setCt");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("Ct", l)) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Effect", g0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("Duration", l2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C9104t(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C9098q(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C9102s(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setPower(C9109v0 v0Var, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setPower");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (create.setArgumentValue("Power", v0Var.toString())) {
                MiotManager.getDeviceManipulator().invoke(create, new C9092n(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C9088l(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setTime(C9077f0 f0Var, String str, String str2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), ACTION_setTime);
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("CmdKey", f0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue(PROPERTY_PdoKey, str)) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("CmdValue", str2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C9112x(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void subscribeNotifications(CompletionHandler completionHandler, C9111w0 w0Var) {
        if (completionHandler == null) {
            throw new IllegalArgumentException("handler is null");
        } else if (w0Var != null) {
            PropertyInfo create = PropertyInfoFactory.create(getService());
            for (Property next : getService().getProperties()) {
                if (next.getDefinition().isNotifiable()) {
                    create.addProperty(next);
                }
            }
            MiotManager.getDeviceManipulator().addPropertyChangedListener(create, new C9086k(this, completionHandler), new C9108v(this, w0Var));
        } else {
            throw new IllegalArgumentException("listener is null");
        }
    }

    public void toggle(CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "toggle");
            if (create != null) {
                MiotManager.getDeviceManipulator().invoke(create, new C9094o(this, completionHandler));
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
            MiotManager.getDeviceManipulator().removePropertyChangedListener(create, new C9113y(this, completionHandler));
            return;
        }
        throw new IllegalArgumentException("handler is null");
    }
}
