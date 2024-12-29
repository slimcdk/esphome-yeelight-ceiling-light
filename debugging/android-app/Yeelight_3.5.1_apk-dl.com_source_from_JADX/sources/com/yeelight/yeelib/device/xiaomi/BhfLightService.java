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

public class BhfLightService extends AbstractService {
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
    public static final String ACTION_setNLScene = "setNLScene";
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
    private static final String TAG = "BhfLightService";
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

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BhfLightService$a */
    class C6195a implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6216k0 f12712a;

        C6195a(BhfLightService bhfLightService, C6216k0 k0Var) {
            this.f12712a = k0Var;
        }

        public void onFailed(int i, String str) {
            this.f12712a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("LanMode");
            if (property.isValueValid()) {
                this.f12712a.mo31970a((Long) propertyInfo.getValue("LanMode"));
                return;
            }
            C6216k0 k0Var = this.f12712a;
            k0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BhfLightService$a0 */
    class C6196a0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6224o0 f12713a;

        C6196a0(BhfLightService bhfLightService, C6224o0 o0Var) {
            this.f12713a = o0Var;
        }

        public void onFailed(int i, String str) {
            this.f12713a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Power");
            if (property.isValueValid()) {
                this.f12713a.mo31978a(Power.valueOf((String) propertyInfo.getValue("Power")));
                return;
            }
            C6224o0 o0Var = this.f12713a;
            o0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BhfLightService$b */
    class C6197b implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6228q0 f12714a;

        C6197b(BhfLightService bhfLightService, C6228q0 q0Var) {
            this.f12714a = q0Var;
        }

        public void onFailed(int i, String str) {
            this.f12714a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("SaveState");
            if (property.isValueValid()) {
                this.f12714a.mo31982a((Long) propertyInfo.getValue("SaveState"));
                return;
            }
            C6228q0 q0Var = this.f12714a;
            q0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BhfLightService$b0 */
    class C6198b0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6206f0 f12715a;

        C6198b0(BhfLightService bhfLightService, C6206f0 f0Var) {
            this.f12715a = f0Var;
        }

        public void onFailed(int i, String str) {
            this.f12715a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Bright");
            if (property.isValueValid()) {
                this.f12715a.mo31960a((Long) propertyInfo.getValue("Bright"));
                return;
            }
            C6206f0 f0Var = this.f12715a;
            f0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BhfLightService$c */
    class C6199c implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6230r0 f12716a;

        C6199c(BhfLightService bhfLightService, C6230r0 r0Var) {
            this.f12716a = r0Var;
        }

        public void onFailed(int i, String str) {
            this.f12716a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("onFromPower");
            if (property.isValueValid()) {
                this.f12716a.mo31984a((Long) propertyInfo.getValue("onFromPower"));
                return;
            }
            C6230r0 r0Var = this.f12716a;
            r0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BhfLightService$c0 */
    class C6200c0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6208g0 f12717a;

        C6200c0(BhfLightService bhfLightService, C6208g0 g0Var) {
            this.f12717a = g0Var;
        }

        public void onFailed(int i, String str) {
            this.f12717a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Ct");
            if (property.isValueValid()) {
                this.f12717a.mo31962a((Long) propertyInfo.getValue("Ct"));
                return;
            }
            C6208g0 g0Var = this.f12717a;
            g0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BhfLightService$d */
    class C6201d implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6220m0 f12718a;

        C6201d(BhfLightService bhfLightService, C6220m0 m0Var) {
            this.f12718a = m0Var;
        }

        public void onFailed(int i, String str) {
            this.f12718a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("NLBright");
            if (property.isValueValid()) {
                this.f12718a.mo31974a((Long) propertyInfo.getValue("NLBright"));
                return;
            }
            C6220m0 m0Var = this.f12718a;
            m0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BhfLightService$d0 */
    class C6202d0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6210h0 f12719a;

        C6202d0(BhfLightService bhfLightService, C6210h0 h0Var) {
            this.f12719a = h0Var;
        }

        public void onFailed(int i, String str) {
            this.f12719a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("DelayOff");
            if (property.isValueValid()) {
                this.f12719a.mo31964a((Long) propertyInfo.getValue("DelayOff"));
                return;
            }
            C6210h0 h0Var = this.f12719a;
            h0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BhfLightService$e */
    class C6203e implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6222n0 f12720a;

        C6203e(BhfLightService bhfLightService, C6222n0 n0Var) {
            this.f12720a = n0Var;
        }

        public void onFailed(int i, String str) {
            this.f12720a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("NightTimeInfo");
            if (property.isValueValid()) {
                this.f12720a.onSucceed((String) propertyInfo.getValue("NightTimeInfo"));
                return;
            }
            C6222n0 n0Var = this.f12720a;
            n0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BhfLightService$e0 */
    class C6204e0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6212i0 f12721a;

        C6204e0(BhfLightService bhfLightService, C6212i0 i0Var) {
            this.f12721a = i0Var;
        }

        public void onFailed(int i, String str) {
            this.f12721a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("FlowParams");
            if (property.isValueValid()) {
                this.f12721a.onSucceed((String) propertyInfo.getValue("FlowParams"));
                return;
            }
            C6212i0 i0Var = this.f12721a;
            i0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BhfLightService$f */
    class C6205f implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6218l0 f12722a;

        C6205f(BhfLightService bhfLightService, C6218l0 l0Var) {
            this.f12722a = l0Var;
        }

        public void onFailed(int i, String str) {
            this.f12722a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("MiBandSleep");
            if (property.isValueValid()) {
                this.f12722a.mo31972a((Long) propertyInfo.getValue("MiBandSleep"));
                return;
            }
            C6218l0 l0Var = this.f12722a;
            l0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BhfLightService$f0 */
    public interface C6206f0 {
        /* renamed from: a */
        void mo31960a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BhfLightService$g */
    class C6207g implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6214j0 f12723a;

        C6207g(BhfLightService bhfLightService, C6214j0 j0Var) {
            this.f12723a = j0Var;
        }

        public void onFailed(int i, String str) {
            this.f12723a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Flowing");
            if (property.isValueValid()) {
                this.f12723a.mo31968a((Long) propertyInfo.getValue("Flowing"));
                return;
            }
            C6214j0 j0Var = this.f12723a;
            j0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BhfLightService$g0 */
    public interface C6208g0 {
        /* renamed from: a */
        void mo31962a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BhfLightService$h */
    class C6209h implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12724a;

        C6209h(BhfLightService bhfLightService, CompletionHandler completionHandler) {
            this.f12724a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12724a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12724a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BhfLightService$h0 */
    public interface C6210h0 {
        /* renamed from: a */
        void mo31964a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BhfLightService$i */
    class C6211i implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12725a;

        C6211i(BhfLightService bhfLightService, CompletionHandler completionHandler) {
            this.f12725a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12725a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12725a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BhfLightService$i0 */
    public interface C6212i0 {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BhfLightService$j */
    class C6213j implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12726a;

        C6213j(BhfLightService bhfLightService, CompletionHandler completionHandler) {
            this.f12726a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12726a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12726a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BhfLightService$j0 */
    public interface C6214j0 {
        /* renamed from: a */
        void mo31968a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BhfLightService$k */
    class C6215k implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12727a;

        C6215k(BhfLightService bhfLightService, CompletionHandler completionHandler) {
            this.f12727a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12727a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f12727a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BhfLightService$k0 */
    public interface C6216k0 {
        /* renamed from: a */
        void mo31970a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BhfLightService$l */
    class C6217l implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12728a;

        C6217l(BhfLightService bhfLightService, CompletionHandler completionHandler) {
            this.f12728a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12728a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12728a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BhfLightService$l0 */
    public interface C6218l0 {
        /* renamed from: a */
        void mo31972a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BhfLightService$m */
    class C6219m implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12729a;

        C6219m(BhfLightService bhfLightService, CompletionHandler completionHandler) {
            this.f12729a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12729a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12729a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BhfLightService$m0 */
    public interface C6220m0 {
        /* renamed from: a */
        void mo31974a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BhfLightService$n */
    class C6221n implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12730a;

        C6221n(BhfLightService bhfLightService, CompletionHandler completionHandler) {
            this.f12730a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12730a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12730a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BhfLightService$n0 */
    public interface C6222n0 {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BhfLightService$o */
    class C6223o implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12731a;

        C6223o(BhfLightService bhfLightService, CompletionHandler completionHandler) {
            this.f12731a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12731a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12731a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BhfLightService$o0 */
    public interface C6224o0 {
        /* renamed from: a */
        void mo31978a(Power power);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BhfLightService$p */
    class C6225p implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12732a;

        C6225p(BhfLightService bhfLightService, CompletionHandler completionHandler) {
            this.f12732a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12732a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12732a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BhfLightService$p0 */
    public interface C6226p0 {
        /* renamed from: a */
        void mo31980a(Power power, Long l, Long l2, Long l3, String str, Long l4, Long l5, Long l6, Long l7, String str2, Long l8, Long l9);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BhfLightService$q */
    class C6227q implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12733a;

        C6227q(BhfLightService bhfLightService, CompletionHandler completionHandler) {
            this.f12733a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12733a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12733a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BhfLightService$q0 */
    public interface C6228q0 {
        /* renamed from: a */
        void mo31982a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BhfLightService$r */
    class C6229r implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12734a;

        C6229r(BhfLightService bhfLightService, CompletionHandler completionHandler) {
            this.f12734a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12734a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12734a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BhfLightService$r0 */
    public interface C6230r0 {
        /* renamed from: a */
        void mo31984a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BhfLightService$s */
    class C6231s implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12735a;

        C6231s(BhfLightService bhfLightService, CompletionHandler completionHandler) {
            this.f12735a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12735a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12735a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BhfLightService$s0 */
    public interface C6232s0 {
        /* renamed from: a */
        void mo31986a(Long l);

        /* renamed from: b */
        void mo31987b(Long l);

        /* renamed from: c */
        void mo31988c(Long l);

        /* renamed from: d */
        void mo31989d(Long l);

        /* renamed from: e */
        void mo31990e(String str);

        /* renamed from: f */
        void mo31991f(Long l);

        /* renamed from: g */
        void mo31992g(Long l);

        /* renamed from: h */
        void mo31993h(Long l);

        /* renamed from: i */
        void mo31994i(String str);

        /* renamed from: k */
        void mo31995k(Long l);

        /* renamed from: m */
        void mo31996m(Long l);

        /* renamed from: n */
        void mo31997n(Power power);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BhfLightService$t */
    class C6233t implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12736a;

        C6233t(BhfLightService bhfLightService, CompletionHandler completionHandler) {
            this.f12736a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12736a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12736a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BhfLightService$u */
    class C6234u implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12737a;

        C6234u(BhfLightService bhfLightService, CompletionHandler completionHandler) {
            this.f12737a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12737a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12737a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BhfLightService$v */
    class C6235v implements DeviceManipulator.PropertyChangedListener {

        /* renamed from: a */
        final /* synthetic */ C6232s0 f12738a;

        C6235v(BhfLightService bhfLightService, C6232s0 s0Var) {
            this.f12738a = s0Var;
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
                case -2002016140:
                    if (str2.equals("FlowParams")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1331143373:
                    if (str2.equals("NightTimeInfo")) {
                        c = 2;
                        break;
                    }
                    break;
                case -770908584:
                    if (str2.equals("NLBright")) {
                        c = 3;
                        break;
                    }
                    break;
                case -80340154:
                    if (str2.equals("MiBandSleep")) {
                        c = 4;
                        break;
                    }
                    break;
                case 2193:
                    if (str2.equals("Ct")) {
                        c = 5;
                        break;
                    }
                    break;
                case 35911772:
                    if (str2.equals("onFromPower")) {
                        c = 6;
                        break;
                    }
                    break;
                case 77306085:
                    if (str2.equals("Power")) {
                        c = 7;
                        break;
                    }
                    break;
                case 880790796:
                    if (str2.equals("DelayOff")) {
                        c = 8;
                        break;
                    }
                    break;
                case 898856916:
                    if (str2.equals("Flowing")) {
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
                        this.f12738a.mo31988c((Long) propertyInfo2.getValue("SaveState"));
                        return;
                    }
                    return;
                case 1:
                    if (propertyInfo2.getProperty("FlowParams").isValueValid()) {
                        this.f12738a.mo31990e((String) propertyInfo2.getValue("FlowParams"));
                        return;
                    }
                    return;
                case 2:
                    if (propertyInfo2.getProperty("NightTimeInfo").isValueValid()) {
                        this.f12738a.mo31994i((String) propertyInfo2.getValue("NightTimeInfo"));
                        return;
                    }
                    return;
                case 3:
                    if (propertyInfo2.getProperty("NLBright").isValueValid()) {
                        this.f12738a.mo31995k((Long) propertyInfo2.getValue("NLBright"));
                        return;
                    }
                    return;
                case 4:
                    if (propertyInfo2.getProperty("MiBandSleep").isValueValid()) {
                        this.f12738a.mo31996m((Long) propertyInfo2.getValue("MiBandSleep"));
                        return;
                    }
                    return;
                case 5:
                    if (propertyInfo2.getProperty("Ct").isValueValid()) {
                        this.f12738a.mo31993h((Long) propertyInfo2.getValue("Ct"));
                        return;
                    }
                    return;
                case 6:
                    if (propertyInfo2.getProperty("onFromPower").isValueValid()) {
                        this.f12738a.mo31991f((Long) propertyInfo2.getValue("onFromPower"));
                        return;
                    }
                    return;
                case 7:
                    if (propertyInfo2.getProperty("Power").isValueValid()) {
                        this.f12738a.mo31997n(Power.valueOf((String) propertyInfo2.getValue("Power")));
                        return;
                    }
                    return;
                case 8:
                    if (propertyInfo2.getProperty("DelayOff").isValueValid()) {
                        this.f12738a.mo31987b((Long) propertyInfo2.getValue("DelayOff"));
                        return;
                    }
                    return;
                case 9:
                    if (propertyInfo2.getProperty("Flowing").isValueValid()) {
                        this.f12738a.mo31989d((Long) propertyInfo2.getValue("Flowing"));
                        return;
                    }
                    return;
                case 10:
                    if (propertyInfo2.getProperty("LanMode").isValueValid()) {
                        this.f12738a.mo31992g((Long) propertyInfo2.getValue("LanMode"));
                        return;
                    }
                    return;
                case 11:
                    if (propertyInfo2.getProperty("Bright").isValueValid()) {
                        this.f12738a.mo31986a((Long) propertyInfo2.getValue("Bright"));
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BhfLightService$w */
    class C6236w implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12739a;

        C6236w(BhfLightService bhfLightService, CompletionHandler completionHandler) {
            this.f12739a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12739a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12739a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BhfLightService$x */
    class C6237x implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12740a;

        C6237x(BhfLightService bhfLightService, CompletionHandler completionHandler) {
            this.f12740a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12740a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12740a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BhfLightService$y */
    class C6238y implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12741a;

        C6238y(BhfLightService bhfLightService, CompletionHandler completionHandler) {
            this.f12741a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12741a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f12741a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BhfLightService$z */
    class C6239z implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6226p0 f12742a;

        C6239z(BhfLightService bhfLightService, C6226p0 p0Var) {
            this.f12742a = p0Var;
        }

        public void onFailed(int i, String str) {
            this.f12742a.onFailed(i, str);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.Long} */
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
                com.yeelight.yeelib.device.xiaomi.BhfLightService$Power r1 = com.yeelight.yeelib.device.xiaomi.BhfLightService.Power.valueOf(r1)
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
                java.lang.String r1 = "FlowParams"
                com.miot.common.property.Property r1 = r0.getProperty(r1)
                boolean r2 = r1.isValueValid()
                if (r2 == 0) goto L_0x006f
                java.lang.Object r1 = r1.getValue()
                java.lang.String r1 = (java.lang.String) r1
                r9 = r1
                goto L_0x0070
            L_0x006f:
                r9 = r3
            L_0x0070:
                java.lang.String r1 = "LanMode"
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
                java.lang.String r1 = "SaveState"
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
                java.lang.String r1 = "NLBright"
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
                java.lang.String r1 = "NightTimeInfo"
                com.miot.common.property.Property r1 = r0.getProperty(r1)
                boolean r2 = r1.isValueValid()
                if (r2 == 0) goto L_0x00d8
                java.lang.Object r1 = r1.getValue()
                java.lang.String r1 = (java.lang.String) r1
                r14 = r1
                goto L_0x00d9
            L_0x00d8:
                r14 = r3
            L_0x00d9:
                java.lang.String r1 = "MiBandSleep"
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
                java.lang.String r1 = "Flowing"
                com.miot.common.property.Property r0 = r0.getProperty(r1)
                boolean r1 = r0.isValueValid()
                if (r1 == 0) goto L_0x0101
                java.lang.Object r0 = r0.getValue()
                r3 = r0
                java.lang.Long r3 = (java.lang.Long) r3
            L_0x0101:
                r0 = r17
                r16 = r3
                com.yeelight.yeelib.device.xiaomi.BhfLightService$p0 r4 = r0.f12742a
                r4.mo31980a(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.xiaomi.BhfLightService.C6239z.onSucceed(com.miot.common.device.invocation.PropertyInfo):void");
        }
    }

    public BhfLightService(AbstractDevice abstractDevice) {
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
                MiotManager.getDeviceManipulator().invoke(create, new C6225p(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6211i(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getBright(C6206f0 f0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Bright"), new C6198b0(this, f0Var));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6237x(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getCt(C6208g0 g0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Ct"), new C6200c0(this, g0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getDelayOff(C6210h0 h0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "DelayOff"), new C6202d0(this, h0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowParams(C6212i0 i0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "FlowParams"), new C6204e0(this, i0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowing(C6214j0 j0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Flowing"), new C6207g(this, j0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getLanMode(C6216k0 k0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "LanMode"), new C6195a(this, k0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getMiBandSleep(C6218l0 l0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "MiBandSleep"), new C6205f(this, l0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getNLBright(C6220m0 m0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "NLBright"), new C6201d(this, m0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getNightTimeInfo(C6222n0 n0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "NightTimeInfo"), new C6203e(this, n0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getPower(C6224o0 o0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Power"), new C6196a0(this, o0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getProperties(C6226p0 p0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            PropertyInfo create = PropertyInfoFactory.create(getService());
            create.addProperty(getService().getProperty("Power"));
            create.addProperty(getService().getProperty("Bright"));
            create.addProperty(getService().getProperty("Ct"));
            create.addProperty(getService().getProperty("DelayOff"));
            create.addProperty(getService().getProperty("FlowParams"));
            create.addProperty(getService().getProperty("LanMode"));
            create.addProperty(getService().getProperty("SaveState"));
            create.addProperty(getService().getProperty("onFromPower"));
            create.addProperty(getService().getProperty("NLBright"));
            create.addProperty(getService().getProperty("NightTimeInfo"));
            create.addProperty(getService().getProperty("MiBandSleep"));
            create.addProperty(getService().getProperty("Flowing"));
            MiotManager.getDeviceManipulator().readProperty(create, new C6239z(this, p0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getSaveState(C6228q0 q0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "SaveState"), new C6197b(this, q0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getonFromPower(C6230r0 r0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "onFromPower"), new C6199c(this, r0Var));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6219m(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6213j(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6231s(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6209h(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6236w(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6227q(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6234u(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6229r(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6221n(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6217l(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6233t(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void subscribeNotifications(CompletionHandler completionHandler, C6232s0 s0Var) {
        if (completionHandler == null) {
            throw new IllegalArgumentException("handler is null");
        } else if (s0Var != null) {
            PropertyInfo create = PropertyInfoFactory.create(getService());
            for (Property next : getService().getProperties()) {
                if (next.getDefinition().isNotifiable()) {
                    create.addProperty(next);
                }
            }
            MiotManager.getDeviceManipulator().addPropertyChangedListener(create, new C6215k(this, completionHandler), new C6235v(this, s0Var));
        } else {
            throw new IllegalArgumentException("listener is null");
        }
    }

    public void toggle(CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "toggle");
            if (create != null) {
                MiotManager.getDeviceManipulator().invoke(create, new C6223o(this, completionHandler));
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
            MiotManager.getDeviceManipulator().removePropertyChangedListener(create, new C6238y(this, completionHandler));
            return;
        }
        throw new IllegalArgumentException("handler is null");
    }
}
