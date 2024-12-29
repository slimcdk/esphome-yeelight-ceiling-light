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

public class CeilingbService extends AbstractService {
    public static final String ACTION_addCron = "addCron";
    public static final String ACTION_delCron = "delCron";
    public static final String ACTION_getCron = "getCron";
    public static final String ACTION_openBgWithMode = "openBgWithMode";
    public static final String ACTION_openWithMode = "openWithMode";
    public static final String ACTION_restore = "restore";
    public static final String ACTION_sendCmd = "sendCmd";
    public static final String ACTION_setBgBright = "setBgBright";
    public static final String ACTION_setBgCt = "setBgCt";
    public static final String ACTION_setBgFlowScene = "setBgFlowScene";
    public static final String ACTION_setBgPower = "setBgPower";
    public static final String ACTION_setBgRgb = "setBgRgb";
    public static final String ACTION_setBgScene = "setBgScene";
    public static final String ACTION_setBgScene2 = "setBgScene2";
    public static final String ACTION_setBright = "setBright";
    public static final String ACTION_setCt = "setCt";
    public static final String ACTION_setDefault = "setDefault";
    public static final String ACTION_setDevPower = "setDevPower";
    public static final String ACTION_setFlowScene = "setFlowScene";
    public static final String ACTION_setNLScene = "setNLScene";
    public static final String ACTION_setPower = "setPower";
    public static final String ACTION_setScene = "setScene";
    public static final String ACTION_setScene2 = "setScene2";
    public static final String ACTION_setSceneBundle = "setSceneBundle";
    public static final String ACTION_setadjust = "setadjust";
    public static final String ACTION_start_cf = "start_cf";
    public static final String ACTION_toggle = "toggle";
    public static final String PROPERTY_BgBright = "BgBright";
    public static final String PROPERTY_BgCt = "BgCt";
    public static final String PROPERTY_BgFlowParams = "BgFlowParams";
    public static final String PROPERTY_BgFlowing = "BgFlowing";
    public static final String PROPERTY_BgPower = "BgPower";
    public static final String PROPERTY_BgProact = "BgProact";
    public static final String PROPERTY_BgRgb = "BgRgb";
    public static final String PROPERTY_Bright = "Bright";
    public static final String PROPERTY_BundleItem1 = "BundleItem1";
    public static final String PROPERTY_BundleItem2 = "BundleItem2";
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
    public static final String PROPERTY_MainPower = "MainPower";
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
    public static final String PROPERTY_SmartSwitch = "SmartSwitch";
    public static final String PROPERTY_TransIntervalDflt = "TransIntervalDflt";
    public static final String PROPERTY_adjustAction = "adjustAction";
    public static final String PROPERTY_adjustProper = "adjustProper";
    public static final String PROPERTY_onFromPower = "onFromPower";
    private static final String TAG = "CeilingbService";
    private AbstractDevice mDevice = null;

    public enum BgPower {
        undefined,
        on,
        off
    }

    public enum CmdKey {
        undefined,
        cfg_pomodoro,
        cfg_lan_ctrl,
        cfg_save_state,
        nighttime,
        nightlight,
        miband_sleep,
        pseudo_beacon,
        cfg_init_power,
        cfg_bg_proact,
        cfg_smart_switch,
        trans_default,
        cfg_ble_ctrl
    }

    public enum Effect {
        undefined,
        smooth,
        sudden
    }

    public enum MainPower {
        undefined,
        on,
        off
    }

    public enum Power {
        undefined,
        on,
        off
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$a */
    class C6933a implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6962j1 f13241a;

        C6933a(CeilingbService ceilingbService, C6962j1 j1Var) {
            this.f13241a = j1Var;
        }

        public void onFailed(int i, String str) {
            this.f13241a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Ct");
            if (property.isValueValid()) {
                this.f13241a.mo33128a((Long) propertyInfo.getValue("Ct"));
                return;
            }
            C6962j1 j1Var = this.f13241a;
            j1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$a0 */
    class C6934a0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13242a;

        C6934a0(CeilingbService ceilingbService, CompletionHandler completionHandler) {
            this.f13242a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13242a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13242a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$a1 */
    class C6935a1 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6938b1 f13243a;

        C6935a1(CeilingbService ceilingbService, C6938b1 b1Var) {
            this.f13243a = b1Var;
        }

        public void onFailed(int i, String str) {
            this.f13243a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("BgBright");
            if (property.isValueValid()) {
                this.f13243a.mo33112a((Long) propertyInfo.getValue("BgBright"));
                return;
            }
            C6938b1 b1Var = this.f13243a;
            b1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$b */
    class C6936b implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6941c1 f13244a;

        C6936b(CeilingbService ceilingbService, C6941c1 c1Var) {
            this.f13244a = c1Var;
        }

        public void onFailed(int i, String str) {
            this.f13244a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("BgCt");
            if (property.isValueValid()) {
                this.f13244a.mo33114a((Long) propertyInfo.getValue("BgCt"));
                return;
            }
            C6941c1 c1Var = this.f13244a;
            c1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$b0 */
    class C6937b0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13245a;

        C6937b0(CeilingbService ceilingbService, CompletionHandler completionHandler) {
            this.f13245a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13245a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13245a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$b1 */
    public interface C6938b1 {
        /* renamed from: a */
        void mo33112a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$c */
    class C6939c implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6965k1 f13246a;

        C6939c(CeilingbService ceilingbService, C6965k1 k1Var) {
            this.f13246a = k1Var;
        }

        public void onFailed(int i, String str) {
            this.f13246a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("DelayOff");
            if (property.isValueValid()) {
                this.f13246a.mo33130a((Long) propertyInfo.getValue("DelayOff"));
                return;
            }
            C6965k1 k1Var = this.f13246a;
            k1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$c0 */
    class C6940c0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13247a;

        C6940c0(CeilingbService ceilingbService, CompletionHandler completionHandler) {
            this.f13247a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13247a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13247a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$c1 */
    public interface C6941c1 {
        /* renamed from: a */
        void mo33114a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$d */
    class C6942d implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6968l1 f13248a;

        C6942d(CeilingbService ceilingbService, C6968l1 l1Var) {
            this.f13248a = l1Var;
        }

        public void onFailed(int i, String str) {
            this.f13248a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("FlowParams");
            if (property.isValueValid()) {
                this.f13248a.onSucceed((String) propertyInfo.getValue("FlowParams"));
                return;
            }
            C6968l1 l1Var = this.f13248a;
            l1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$d0 */
    class C6943d0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13249a;

        C6943d0(CeilingbService ceilingbService, CompletionHandler completionHandler) {
            this.f13249a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13249a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13249a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$d1 */
    public interface C6944d1 {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$e */
    class C6945e implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6944d1 f13250a;

        C6945e(CeilingbService ceilingbService, C6944d1 d1Var) {
            this.f13250a = d1Var;
        }

        public void onFailed(int i, String str) {
            this.f13250a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("BgFlowParams");
            if (property.isValueValid()) {
                this.f13250a.onSucceed((String) propertyInfo.getValue("BgFlowParams"));
                return;
            }
            C6944d1 d1Var = this.f13250a;
            d1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$e0 */
    class C6946e0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13251a;

        C6946e0(CeilingbService ceilingbService, CompletionHandler completionHandler) {
            this.f13251a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13251a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13251a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$e1 */
    public interface C6947e1 {
        /* renamed from: a */
        void mo33118a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$f */
    class C6948f implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6974n1 f13252a;

        C6948f(CeilingbService ceilingbService, C6974n1 n1Var) {
            this.f13252a = n1Var;
        }

        public void onFailed(int i, String str) {
            this.f13252a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("LanMode");
            if (property.isValueValid()) {
                this.f13252a.mo33136a((Long) propertyInfo.getValue("LanMode"));
                return;
            }
            C6974n1 n1Var = this.f13252a;
            n1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$f0 */
    class C6949f0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13253a;

        C6949f0(CeilingbService ceilingbService, CompletionHandler completionHandler) {
            this.f13253a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13253a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13253a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$f1 */
    public interface C6950f1 {
        /* renamed from: a */
        void mo33120a(BgPower bgPower);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$g */
    class C6951g implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6995u1 f13254a;

        C6951g(CeilingbService ceilingbService, C6995u1 u1Var) {
            this.f13254a = u1Var;
        }

        public void onFailed(int i, String str) {
            this.f13254a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("SaveState");
            if (property.isValueValid()) {
                this.f13254a.mo33150a((Long) propertyInfo.getValue("SaveState"));
                return;
            }
            C6995u1 u1Var = this.f13254a;
            u1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$g0 */
    class C6952g0 implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13255a;

        C6952g0(CeilingbService ceilingbService, CompletionHandler completionHandler) {
            this.f13255a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13255a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f13255a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$g1 */
    public interface C6953g1 {
        /* renamed from: a */
        void mo33122a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$h */
    class C6954h implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7001w1 f13256a;

        C6954h(CeilingbService ceilingbService, C7001w1 w1Var) {
            this.f13256a = w1Var;
        }

        public void onFailed(int i, String str) {
            this.f13256a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("TransIntervalDflt");
            if (property.isValueValid()) {
                this.f13256a.mo33154a((Long) propertyInfo.getValue("TransIntervalDflt"));
                return;
            }
            C7001w1 w1Var = this.f13256a;
            w1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$h0 */
    class C6955h0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13257a;

        C6955h0(CeilingbService ceilingbService, CompletionHandler completionHandler) {
            this.f13257a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13257a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13257a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$h1 */
    public interface C6956h1 {
        /* renamed from: a */
        void mo33124a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$i */
    class C6957i implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7004x1 f13258a;

        C6957i(CeilingbService ceilingbService, C7004x1 x1Var) {
            this.f13258a = x1Var;
        }

        public void onFailed(int i, String str) {
            this.f13258a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("onFromPower");
            if (property.isValueValid()) {
                this.f13258a.mo33156a((Long) propertyInfo.getValue("onFromPower"));
                return;
            }
            C7004x1 x1Var = this.f13258a;
            x1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$i0 */
    class C6958i0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13259a;

        C6958i0(CeilingbService ceilingbService, CompletionHandler completionHandler) {
            this.f13259a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13259a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13259a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$i1 */
    public interface C6959i1 {
        /* renamed from: a */
        void mo33126a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$j */
    class C6960j implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6983q1 f13260a;

        C6960j(CeilingbService ceilingbService, C6983q1 q1Var) {
            this.f13260a = q1Var;
        }

        public void onFailed(int i, String str) {
            this.f13260a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("NLBright");
            if (property.isValueValid()) {
                this.f13260a.mo33142a((Long) propertyInfo.getValue("NLBright"));
                return;
            }
            C6983q1 q1Var = this.f13260a;
            q1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$j0 */
    class C6961j0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13261a;

        C6961j0(CeilingbService ceilingbService, CompletionHandler completionHandler) {
            this.f13261a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13261a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13261a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$j1 */
    public interface C6962j1 {
        /* renamed from: a */
        void mo33128a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$k */
    class C6963k implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13262a;

        C6963k(CeilingbService ceilingbService, CompletionHandler completionHandler) {
            this.f13262a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13262a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f13262a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$k0 */
    class C6964k0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13263a;

        C6964k0(CeilingbService ceilingbService, CompletionHandler completionHandler) {
            this.f13263a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13263a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13263a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$k1 */
    public interface C6965k1 {
        /* renamed from: a */
        void mo33130a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$l */
    class C6966l implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6986r1 f13264a;

        C6966l(CeilingbService ceilingbService, C6986r1 r1Var) {
            this.f13264a = r1Var;
        }

        public void onFailed(int i, String str) {
            this.f13264a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("NightTimeInfo");
            if (property.isValueValid()) {
                this.f13264a.onSucceed((String) propertyInfo.getValue("NightTimeInfo"));
                return;
            }
            C6986r1 r1Var = this.f13264a;
            r1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$l0 */
    class C6967l0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13265a;

        C6967l0(CeilingbService ceilingbService, CompletionHandler completionHandler) {
            this.f13265a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13265a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13265a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$l1 */
    public interface C6968l1 {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$m */
    class C6969m implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6980p1 f13266a;

        C6969m(CeilingbService ceilingbService, C6980p1 p1Var) {
            this.f13266a = p1Var;
        }

        public void onFailed(int i, String str) {
            this.f13266a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("MiBandSleep");
            if (property.isValueValid()) {
                this.f13266a.mo33140a((Long) propertyInfo.getValue("MiBandSleep"));
                return;
            }
            C6980p1 p1Var = this.f13266a;
            p1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$m0 */
    class C6970m0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13267a;

        C6970m0(CeilingbService ceilingbService, CompletionHandler completionHandler) {
            this.f13267a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13267a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13267a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$m1 */
    public interface C6971m1 {
        /* renamed from: a */
        void mo33134a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$n */
    class C6972n implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6956h1 f13268a;

        C6972n(CeilingbService ceilingbService, C6956h1 h1Var) {
            this.f13268a = h1Var;
        }

        public void onFailed(int i, String str) {
            this.f13268a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("BgRgb");
            if (property.isValueValid()) {
                this.f13268a.mo33124a((Long) propertyInfo.getValue("BgRgb"));
                return;
            }
            C6956h1 h1Var = this.f13268a;
            h1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$n0 */
    class C6973n0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13269a;

        C6973n0(CeilingbService ceilingbService, CompletionHandler completionHandler) {
            this.f13269a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13269a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13269a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$n1 */
    public interface C6974n1 {
        /* renamed from: a */
        void mo33136a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$o */
    class C6975o implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6971m1 f13270a;

        C6975o(CeilingbService ceilingbService, C6971m1 m1Var) {
            this.f13270a = m1Var;
        }

        public void onFailed(int i, String str) {
            this.f13270a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Flowing");
            if (property.isValueValid()) {
                this.f13270a.mo33134a((Long) propertyInfo.getValue("Flowing"));
                return;
            }
            C6971m1 m1Var = this.f13270a;
            m1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$o0 */
    class C6976o0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13271a;

        C6976o0(CeilingbService ceilingbService, CompletionHandler completionHandler) {
            this.f13271a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13271a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13271a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$o1 */
    public interface C6977o1 {
        /* renamed from: a */
        void mo33138a(MainPower mainPower);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$p */
    class C6978p implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6947e1 f13272a;

        C6978p(CeilingbService ceilingbService, C6947e1 e1Var) {
            this.f13272a = e1Var;
        }

        public void onFailed(int i, String str) {
            this.f13272a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("BgFlowing");
            if (property.isValueValid()) {
                this.f13272a.mo33118a((Long) propertyInfo.getValue("BgFlowing"));
                return;
            }
            C6947e1 e1Var = this.f13272a;
            e1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$p0 */
    class C6979p0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13273a;

        C6979p0(CeilingbService ceilingbService, CompletionHandler completionHandler) {
            this.f13273a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13273a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13273a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$p1 */
    public interface C6980p1 {
        /* renamed from: a */
        void mo33140a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$q */
    class C6981q implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6953g1 f13274a;

        C6981q(CeilingbService ceilingbService, C6953g1 g1Var) {
            this.f13274a = g1Var;
        }

        public void onFailed(int i, String str) {
            this.f13274a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("BgProact");
            if (property.isValueValid()) {
                this.f13274a.mo33122a((Long) propertyInfo.getValue("BgProact"));
                return;
            }
            C6953g1 g1Var = this.f13274a;
            g1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$q0 */
    class C6982q0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13275a;

        C6982q0(CeilingbService ceilingbService, CompletionHandler completionHandler) {
            this.f13275a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13275a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13275a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$q1 */
    public interface C6983q1 {
        /* renamed from: a */
        void mo33142a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$r */
    class C6984r implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6998v1 f13276a;

        C6984r(CeilingbService ceilingbService, C6998v1 v1Var) {
            this.f13276a = v1Var;
        }

        public void onFailed(int i, String str) {
            this.f13276a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("SmartSwitch");
            if (property.isValueValid()) {
                this.f13276a.mo33152a((Long) propertyInfo.getValue("SmartSwitch"));
                return;
            }
            C6998v1 v1Var = this.f13276a;
            v1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$r0 */
    class C6985r0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6992t1 f13277a;

        C6985r0(CeilingbService ceilingbService, C6992t1 t1Var) {
            this.f13277a = t1Var;
        }

        public void onFailed(int i, String str) {
            this.f13277a.onFailed(i, str);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.Long} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onSucceed(com.miot.common.device.invocation.PropertyInfo r28) {
            /*
                r27 = this;
                r0 = r28
                java.lang.String r1 = "MainPower"
                com.miot.common.property.Property r1 = r0.getProperty(r1)
                boolean r2 = r1.isValueValid()
                r3 = 0
                if (r2 == 0) goto L_0x001b
                java.lang.Object r1 = r1.getValue()
                java.lang.String r1 = (java.lang.String) r1
                com.yeelight.yeelib.device.xiaomi.CeilingbService$MainPower r1 = com.yeelight.yeelib.device.xiaomi.CeilingbService.MainPower.valueOf(r1)
                r5 = r1
                goto L_0x001c
            L_0x001b:
                r5 = r3
            L_0x001c:
                java.lang.String r1 = "Power"
                com.miot.common.property.Property r1 = r0.getProperty(r1)
                boolean r2 = r1.isValueValid()
                if (r2 == 0) goto L_0x0034
                java.lang.Object r1 = r1.getValue()
                java.lang.String r1 = (java.lang.String) r1
                com.yeelight.yeelib.device.xiaomi.CeilingbService$Power r1 = com.yeelight.yeelib.device.xiaomi.CeilingbService.Power.valueOf(r1)
                r6 = r1
                goto L_0x0035
            L_0x0034:
                r6 = r3
            L_0x0035:
                java.lang.String r1 = "BgPower"
                com.miot.common.property.Property r1 = r0.getProperty(r1)
                boolean r2 = r1.isValueValid()
                if (r2 == 0) goto L_0x004d
                java.lang.Object r1 = r1.getValue()
                java.lang.String r1 = (java.lang.String) r1
                com.yeelight.yeelib.device.xiaomi.CeilingbService$BgPower r1 = com.yeelight.yeelib.device.xiaomi.CeilingbService.BgPower.valueOf(r1)
                r7 = r1
                goto L_0x004e
            L_0x004d:
                r7 = r3
            L_0x004e:
                java.lang.String r1 = "Bright"
                com.miot.common.property.Property r1 = r0.getProperty(r1)
                boolean r2 = r1.isValueValid()
                if (r2 == 0) goto L_0x0062
                java.lang.Object r1 = r1.getValue()
                java.lang.Long r1 = (java.lang.Long) r1
                r8 = r1
                goto L_0x0063
            L_0x0062:
                r8 = r3
            L_0x0063:
                java.lang.String r1 = "BgBright"
                com.miot.common.property.Property r1 = r0.getProperty(r1)
                boolean r2 = r1.isValueValid()
                if (r2 == 0) goto L_0x0077
                java.lang.Object r1 = r1.getValue()
                java.lang.Long r1 = (java.lang.Long) r1
                r9 = r1
                goto L_0x0078
            L_0x0077:
                r9 = r3
            L_0x0078:
                java.lang.String r1 = "Ct"
                com.miot.common.property.Property r1 = r0.getProperty(r1)
                boolean r2 = r1.isValueValid()
                if (r2 == 0) goto L_0x008c
                java.lang.Object r1 = r1.getValue()
                java.lang.Long r1 = (java.lang.Long) r1
                r10 = r1
                goto L_0x008d
            L_0x008c:
                r10 = r3
            L_0x008d:
                java.lang.String r1 = "BgCt"
                com.miot.common.property.Property r1 = r0.getProperty(r1)
                boolean r2 = r1.isValueValid()
                if (r2 == 0) goto L_0x00a1
                java.lang.Object r1 = r1.getValue()
                java.lang.Long r1 = (java.lang.Long) r1
                r11 = r1
                goto L_0x00a2
            L_0x00a1:
                r11 = r3
            L_0x00a2:
                java.lang.String r1 = "DelayOff"
                com.miot.common.property.Property r1 = r0.getProperty(r1)
                boolean r2 = r1.isValueValid()
                if (r2 == 0) goto L_0x00b6
                java.lang.Object r1 = r1.getValue()
                java.lang.Long r1 = (java.lang.Long) r1
                r12 = r1
                goto L_0x00b7
            L_0x00b6:
                r12 = r3
            L_0x00b7:
                java.lang.String r1 = "FlowParams"
                com.miot.common.property.Property r1 = r0.getProperty(r1)
                boolean r2 = r1.isValueValid()
                if (r2 == 0) goto L_0x00cb
                java.lang.Object r1 = r1.getValue()
                java.lang.String r1 = (java.lang.String) r1
                r13 = r1
                goto L_0x00cc
            L_0x00cb:
                r13 = r3
            L_0x00cc:
                java.lang.String r1 = "BgFlowParams"
                com.miot.common.property.Property r1 = r0.getProperty(r1)
                boolean r2 = r1.isValueValid()
                if (r2 == 0) goto L_0x00e0
                java.lang.Object r1 = r1.getValue()
                java.lang.String r1 = (java.lang.String) r1
                r14 = r1
                goto L_0x00e1
            L_0x00e0:
                r14 = r3
            L_0x00e1:
                java.lang.String r1 = "LanMode"
                com.miot.common.property.Property r1 = r0.getProperty(r1)
                boolean r2 = r1.isValueValid()
                if (r2 == 0) goto L_0x00f5
                java.lang.Object r1 = r1.getValue()
                java.lang.Long r1 = (java.lang.Long) r1
                r15 = r1
                goto L_0x00f6
            L_0x00f5:
                r15 = r3
            L_0x00f6:
                java.lang.String r1 = "SaveState"
                com.miot.common.property.Property r1 = r0.getProperty(r1)
                boolean r2 = r1.isValueValid()
                if (r2 == 0) goto L_0x010b
                java.lang.Object r1 = r1.getValue()
                java.lang.Long r1 = (java.lang.Long) r1
                r16 = r1
                goto L_0x010d
            L_0x010b:
                r16 = r3
            L_0x010d:
                java.lang.String r1 = "TransIntervalDflt"
                com.miot.common.property.Property r1 = r0.getProperty(r1)
                boolean r2 = r1.isValueValid()
                if (r2 == 0) goto L_0x0122
                java.lang.Object r1 = r1.getValue()
                java.lang.Long r1 = (java.lang.Long) r1
                r17 = r1
                goto L_0x0124
            L_0x0122:
                r17 = r3
            L_0x0124:
                java.lang.String r1 = "onFromPower"
                com.miot.common.property.Property r1 = r0.getProperty(r1)
                boolean r2 = r1.isValueValid()
                if (r2 == 0) goto L_0x0139
                java.lang.Object r1 = r1.getValue()
                java.lang.Long r1 = (java.lang.Long) r1
                r18 = r1
                goto L_0x013b
            L_0x0139:
                r18 = r3
            L_0x013b:
                java.lang.String r1 = "NLBright"
                com.miot.common.property.Property r1 = r0.getProperty(r1)
                boolean r2 = r1.isValueValid()
                if (r2 == 0) goto L_0x0150
                java.lang.Object r1 = r1.getValue()
                java.lang.Long r1 = (java.lang.Long) r1
                r19 = r1
                goto L_0x0152
            L_0x0150:
                r19 = r3
            L_0x0152:
                java.lang.String r1 = "NightTimeInfo"
                com.miot.common.property.Property r1 = r0.getProperty(r1)
                boolean r2 = r1.isValueValid()
                if (r2 == 0) goto L_0x0167
                java.lang.Object r1 = r1.getValue()
                java.lang.String r1 = (java.lang.String) r1
                r20 = r1
                goto L_0x0169
            L_0x0167:
                r20 = r3
            L_0x0169:
                java.lang.String r1 = "MiBandSleep"
                com.miot.common.property.Property r1 = r0.getProperty(r1)
                boolean r2 = r1.isValueValid()
                if (r2 == 0) goto L_0x017e
                java.lang.Object r1 = r1.getValue()
                java.lang.Long r1 = (java.lang.Long) r1
                r21 = r1
                goto L_0x0180
            L_0x017e:
                r21 = r3
            L_0x0180:
                java.lang.String r1 = "BgRgb"
                com.miot.common.property.Property r1 = r0.getProperty(r1)
                boolean r2 = r1.isValueValid()
                if (r2 == 0) goto L_0x0195
                java.lang.Object r1 = r1.getValue()
                java.lang.Long r1 = (java.lang.Long) r1
                r22 = r1
                goto L_0x0197
            L_0x0195:
                r22 = r3
            L_0x0197:
                java.lang.String r1 = "Flowing"
                com.miot.common.property.Property r1 = r0.getProperty(r1)
                boolean r2 = r1.isValueValid()
                if (r2 == 0) goto L_0x01ac
                java.lang.Object r1 = r1.getValue()
                java.lang.Long r1 = (java.lang.Long) r1
                r23 = r1
                goto L_0x01ae
            L_0x01ac:
                r23 = r3
            L_0x01ae:
                java.lang.String r1 = "BgFlowing"
                com.miot.common.property.Property r1 = r0.getProperty(r1)
                boolean r2 = r1.isValueValid()
                if (r2 == 0) goto L_0x01c3
                java.lang.Object r1 = r1.getValue()
                java.lang.Long r1 = (java.lang.Long) r1
                r24 = r1
                goto L_0x01c5
            L_0x01c3:
                r24 = r3
            L_0x01c5:
                java.lang.String r1 = "BgProact"
                com.miot.common.property.Property r1 = r0.getProperty(r1)
                boolean r2 = r1.isValueValid()
                if (r2 == 0) goto L_0x01da
                java.lang.Object r1 = r1.getValue()
                java.lang.Long r1 = (java.lang.Long) r1
                r25 = r1
                goto L_0x01dc
            L_0x01da:
                r25 = r3
            L_0x01dc:
                java.lang.String r1 = "SmartSwitch"
                com.miot.common.property.Property r0 = r0.getProperty(r1)
                boolean r1 = r0.isValueValid()
                if (r1 == 0) goto L_0x01ef
                java.lang.Object r0 = r0.getValue()
                r3 = r0
                java.lang.Long r3 = (java.lang.Long) r3
            L_0x01ef:
                r0 = r27
                r26 = r3
                com.yeelight.yeelib.device.xiaomi.CeilingbService$t1 r4 = r0.f13277a
                r4.mo33148a(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.xiaomi.CeilingbService.C6985r0.onSucceed(com.miot.common.device.invocation.PropertyInfo):void");
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$r1 */
    public interface C6986r1 {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$s */
    class C6987s implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13278a;

        C6987s(CeilingbService ceilingbService, CompletionHandler completionHandler) {
            this.f13278a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13278a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13278a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$s0 */
    class C6988s0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13279a;

        C6988s0(CeilingbService ceilingbService, CompletionHandler completionHandler) {
            this.f13279a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13279a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13279a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$s1 */
    public interface C6989s1 {
        /* renamed from: a */
        void mo33146a(Power power);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$t */
    class C6990t implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13280a;

        C6990t(CeilingbService ceilingbService, CompletionHandler completionHandler) {
            this.f13280a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13280a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13280a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$t0 */
    class C6991t0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13281a;

        C6991t0(CeilingbService ceilingbService, CompletionHandler completionHandler) {
            this.f13281a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13281a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13281a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$t1 */
    public interface C6992t1 {
        /* renamed from: a */
        void mo33148a(MainPower mainPower, Power power, BgPower bgPower, Long l, Long l2, Long l3, Long l4, Long l5, String str, String str2, Long l6, Long l7, Long l8, Long l9, Long l10, String str3, Long l11, Long l12, Long l13, Long l14, Long l15, Long l16);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$u */
    class C6993u implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13282a;

        C6993u(CeilingbService ceilingbService, CompletionHandler completionHandler) {
            this.f13282a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13282a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13282a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$u0 */
    class C6994u0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13283a;

        C6994u0(CeilingbService ceilingbService, CompletionHandler completionHandler) {
            this.f13283a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13283a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13283a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$u1 */
    public interface C6995u1 {
        /* renamed from: a */
        void mo33150a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$v */
    class C6996v implements DeviceManipulator.PropertyChangedListener {

        /* renamed from: a */
        final /* synthetic */ C7007y1 f13284a;

        C6996v(CeilingbService ceilingbService, C7007y1 y1Var) {
            this.f13284a = y1Var;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:100:0x0267, code lost:
            r4 = r26;
            r2 = r27;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:101:0x0273, code lost:
            if (r2.getProperty("Flowing").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:102:0x0275, code lost:
            r4.f13284a.mo33161d((java.lang.Long) r2.getValue("Flowing"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:103:0x0282, code lost:
            r4 = r26;
            r2 = r27;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:104:0x028e, code lost:
            if (r2.getProperty("DelayOff").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:105:0x0290, code lost:
            r4.f13284a.mo33159b((java.lang.Long) r2.getValue("DelayOff"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:106:0x029d, code lost:
            r4 = r26;
            r2 = r27;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:107:0x02a9, code lost:
            if (r2.getProperty("Power").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:108:0x02ab, code lost:
            r4.f13284a.mo33177t(com.yeelight.yeelib.device.xiaomi.CeilingbService.Power.valueOf((java.lang.String) r2.getValue("Power")));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:109:0x02bc, code lost:
            r4 = r26;
            r2 = r27;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:110:0x02c8, code lost:
            if (r2.getProperty("BgRgb").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:111:0x02ca, code lost:
            r4.f13284a.mo33171n((java.lang.Long) r2.getValue("BgRgb"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:112:0x02d7, code lost:
            r4 = r26;
            r2 = r27;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:113:0x02e3, code lost:
            if (r2.getProperty("onFromPower").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:114:0x02e5, code lost:
            r4.f13284a.mo33163f((java.lang.Long) r2.getValue("onFromPower"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:115:0x02f2, code lost:
            r4 = r26;
            r2 = r27;
            r0 = r16;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:116:0x0300, code lost:
            if (r2.getProperty(r0).isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:117:0x0302, code lost:
            r4.f13284a.mo33167j((java.lang.Long) r2.getValue(r0));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:118:0x030f, code lost:
            r4 = r26;
            r2 = r27;
            r0 = r17;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:119:0x031d, code lost:
            if (r2.getProperty(r0).isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:120:0x031f, code lost:
            r4.f13284a.mo33165h((java.lang.Long) r2.getValue(r0));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:121:0x032c, code lost:
            r4 = r26;
            r2 = r27;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:122:0x0338, code lost:
            if (r2.getProperty(r0).isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:123:0x033a, code lost:
            r4.f13284a.mo33170m((java.lang.Long) r2.getValue(r0));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:124:0x0347, code lost:
            r4 = r26;
            r2 = r27;
            r0 = r18;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:125:0x0355, code lost:
            if (r2.getProperty(r0).isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:126:0x0357, code lost:
            r4.f13284a.mo33173p((java.lang.Long) r2.getValue(r0));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:127:0x0364, code lost:
            r4 = r26;
            r2 = r27;
            r0 = r19;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:128:0x0372, code lost:
            if (r2.getProperty(r0).isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:129:0x0374, code lost:
            r4.f13284a.mo33168k((java.lang.Long) r2.getValue(r0));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:130:0x0381, code lost:
            r4 = r26;
            r2 = r27;
            r0 = r20;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:131:0x038f, code lost:
            if (r2.getProperty(r0).isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:132:0x0391, code lost:
            r4.f13284a.mo33166i((java.lang.String) r2.getValue(r0));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:133:0x039e, code lost:
            r4 = r26;
            r2 = r27;
            r0 = r21;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:134:0x03ac, code lost:
            if (r2.getProperty(r0).isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:135:0x03ae, code lost:
            r4.f13284a.mo33175r((java.lang.Long) r2.getValue(r0));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:136:0x03ba, code lost:
            r4 = r26;
            r2 = r27;
            r0 = r22;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:137:0x03c8, code lost:
            if (r2.getProperty(r0).isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:138:0x03ca, code lost:
            r4.f13284a.mo33162e((java.lang.String) r2.getValue(r0));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:139:0x03d6, code lost:
            r4 = r26;
            r2 = r27;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:140:0x03e2, code lost:
            if (r2.getProperty(r3).isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:141:0x03e4, code lost:
            r4.f13284a.mo33169l((java.lang.Long) r2.getValue(r3));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:142:0x03f0, code lost:
            r4 = r26;
            r2 = r27;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:143:0x03fc, code lost:
            if (r2.getProperty("SaveState").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:144:0x03fe, code lost:
            r4.f13284a.mo33160c((java.lang.Long) r2.getValue("SaveState"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:145:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:146:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:147:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:148:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:149:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:150:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:151:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:152:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:153:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:154:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:155:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:156:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:157:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:158:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:159:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:160:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:161:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:162:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:163:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:164:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:165:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:166:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:167:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:168:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:169:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:170:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:171:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:172:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:173:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:174:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:175:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:176:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:177:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:178:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:179:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:180:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:181:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:182:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:183:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:184:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:185:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:186:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:187:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:188:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:2:0x004e, code lost:
            r3 = r23;
            r25 = r16;
            r16 = "BgCt";
            r0 = r17;
            r17 = r25;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:0x00ff, code lost:
            r17 = r3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:70:0x0171, code lost:
            r3 = r23;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:77:0x019b, code lost:
            switch(r24) {
                case 0: goto L_0x03f0;
                case 1: goto L_0x03d6;
                case 2: goto L_0x03ba;
                case 3: goto L_0x039e;
                case 4: goto L_0x0381;
                case 5: goto L_0x0364;
                case 6: goto L_0x0347;
                case 7: goto L_0x032c;
                case 8: goto L_0x030f;
                case 9: goto L_0x02f2;
                case 10: goto L_0x02d7;
                case 11: goto L_0x02bc;
                case 12: goto L_0x029d;
                case 13: goto L_0x0282;
                case 14: goto L_0x0267;
                case 15: goto L_0x024c;
                case 16: goto L_0x0231;
                case 17: goto L_0x0212;
                case 18: goto L_0x01f7;
                case 19: goto L_0x01d8;
                case 20: goto L_0x01bd;
                case 21: goto L_0x01a2;
                default: goto L_0x019e;
            };
         */
        /* JADX WARNING: Code restructure failed: missing block: B:78:0x019e, code lost:
            r4 = r26;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:79:0x01a2, code lost:
            r2 = r27;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:80:0x01ac, code lost:
            if (r2.getProperty("Bright").isValueValid() == false) goto L_0x019e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:81:0x01ae, code lost:
            r26.f13284a.mo33158a((java.lang.Long) r2.getValue("Bright"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:82:0x01bd, code lost:
            r4 = r26;
            r2 = r27;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:83:0x01c9, code lost:
            if (r2.getProperty("BgFlowParams").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:84:0x01cb, code lost:
            r4.f13284a.mo33174q((java.lang.String) r2.getValue("BgFlowParams"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:85:0x01d8, code lost:
            r4 = r26;
            r2 = r27;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:86:0x01e4, code lost:
            if (r2.getProperty("MainPower").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:87:0x01e6, code lost:
            r4.f13284a.mo33179v(com.yeelight.yeelib.device.xiaomi.CeilingbService.MainPower.valueOf((java.lang.String) r2.getValue("MainPower")));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:88:0x01f7, code lost:
            r4 = r26;
            r2 = r27;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:89:0x0203, code lost:
            if (r2.getProperty("LanMode").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:90:0x0205, code lost:
            r4.f13284a.mo33164g((java.lang.Long) r2.getValue("LanMode"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:91:0x0212, code lost:
            r4 = r26;
            r2 = r27;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:92:0x021e, code lost:
            if (r2.getProperty("BgPower").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:93:0x0220, code lost:
            r4.f13284a.mo33178u(com.yeelight.yeelib.device.xiaomi.CeilingbService.BgPower.valueOf((java.lang.String) r2.getValue("BgPower")));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:94:0x0231, code lost:
            r4 = r26;
            r2 = r27;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:95:0x023d, code lost:
            if (r2.getProperty("SmartSwitch").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:96:0x023f, code lost:
            r4.f13284a.mo33172o((java.lang.Long) r2.getValue("SmartSwitch"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:97:0x024c, code lost:
            r4 = r26;
            r2 = r27;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:98:0x0258, code lost:
            if (r2.getProperty("BgFlowing").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:99:0x025a, code lost:
            r4.f13284a.mo33176s((java.lang.Long) r2.getValue("BgFlowing"));
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onPropertyChanged(com.miot.common.device.invocation.PropertyInfo r27, java.lang.String r28) {
            /*
                r26 = this;
                r0 = r26
                r1 = r27
                r2 = r28
                r28.hashCode()
                int r3 = r28.hashCode()
                java.lang.String r4 = "Bright"
                java.lang.String r5 = "BgFlowParams"
                java.lang.String r6 = "MainPower"
                java.lang.String r7 = "LanMode"
                java.lang.String r8 = "BgPower"
                java.lang.String r9 = "SmartSwitch"
                java.lang.String r10 = "BgFlowing"
                java.lang.String r11 = "Flowing"
                java.lang.String r12 = "DelayOff"
                java.lang.String r13 = "Power"
                java.lang.String r14 = "BgRgb"
                java.lang.String r15 = "onFromPower"
                java.lang.String r0 = "BgCt"
                java.lang.String r1 = "Ct"
                r16 = r1
                java.lang.String r1 = "MiBandSleep"
                r17 = r1
                java.lang.String r1 = "TransIntervalDflt"
                r18 = r1
                java.lang.String r1 = "NLBright"
                r19 = r1
                java.lang.String r1 = "NightTimeInfo"
                r20 = r1
                java.lang.String r1 = "BgProact"
                r21 = r1
                java.lang.String r1 = "FlowParams"
                r22 = r1
                java.lang.String r1 = "BgBright"
                r23 = r1
                java.lang.String r1 = "SaveState"
                r24 = -1
                switch(r3) {
                    case -2117953292: goto L_0x0188;
                    case -2017000513: goto L_0x0174;
                    case -2002016140: goto L_0x015c;
                    case -1616019574: goto L_0x0146;
                    case -1331143373: goto L_0x0130;
                    case -770908584: goto L_0x011a;
                    case -718325097: goto L_0x0103;
                    case -80340154: goto L_0x00f0;
                    case 2193: goto L_0x00e0;
                    case 2067382: goto L_0x00d4;
                    case 35911772: goto L_0x00c8;
                    case 64102952: goto L_0x00be;
                    case 77306085: goto L_0x00b4;
                    case 880790796: goto L_0x00aa;
                    case 898856916: goto L_0x00a0;
                    case 986784719: goto L_0x0096;
                    case 1179821629: goto L_0x008c;
                    case 1471809440: goto L_0x0082;
                    case 1611821756: goto L_0x0078;
                    case 1738956460: goto L_0x006e;
                    case 1820079769: goto L_0x0064;
                    case 1998035738: goto L_0x005a;
                    default: goto L_0x004e;
                }
            L_0x004e:
                r3 = r23
                r25 = r16
                r16 = r0
                r0 = r17
                r17 = r25
                goto L_0x019b
            L_0x005a:
                boolean r2 = r2.equals(r4)
                if (r2 != 0) goto L_0x0061
                goto L_0x004e
            L_0x0061:
                r24 = 21
                goto L_0x004e
            L_0x0064:
                boolean r2 = r2.equals(r5)
                if (r2 != 0) goto L_0x006b
                goto L_0x004e
            L_0x006b:
                r24 = 20
                goto L_0x004e
            L_0x006e:
                boolean r2 = r2.equals(r6)
                if (r2 != 0) goto L_0x0075
                goto L_0x004e
            L_0x0075:
                r24 = 19
                goto L_0x004e
            L_0x0078:
                boolean r2 = r2.equals(r7)
                if (r2 != 0) goto L_0x007f
                goto L_0x004e
            L_0x007f:
                r24 = 18
                goto L_0x004e
            L_0x0082:
                boolean r2 = r2.equals(r8)
                if (r2 != 0) goto L_0x0089
                goto L_0x004e
            L_0x0089:
                r24 = 17
                goto L_0x004e
            L_0x008c:
                boolean r2 = r2.equals(r9)
                if (r2 != 0) goto L_0x0093
                goto L_0x004e
            L_0x0093:
                r24 = 16
                goto L_0x004e
            L_0x0096:
                boolean r2 = r2.equals(r10)
                if (r2 != 0) goto L_0x009d
                goto L_0x004e
            L_0x009d:
                r24 = 15
                goto L_0x004e
            L_0x00a0:
                boolean r2 = r2.equals(r11)
                if (r2 != 0) goto L_0x00a7
                goto L_0x004e
            L_0x00a7:
                r24 = 14
                goto L_0x004e
            L_0x00aa:
                boolean r2 = r2.equals(r12)
                if (r2 != 0) goto L_0x00b1
                goto L_0x004e
            L_0x00b1:
                r24 = 13
                goto L_0x004e
            L_0x00b4:
                boolean r2 = r2.equals(r13)
                if (r2 != 0) goto L_0x00bb
                goto L_0x004e
            L_0x00bb:
                r24 = 12
                goto L_0x004e
            L_0x00be:
                boolean r2 = r2.equals(r14)
                if (r2 != 0) goto L_0x00c5
                goto L_0x004e
            L_0x00c5:
                r24 = 11
                goto L_0x004e
            L_0x00c8:
                boolean r2 = r2.equals(r15)
                if (r2 != 0) goto L_0x00d0
                goto L_0x004e
            L_0x00d0:
                r24 = 10
                goto L_0x004e
            L_0x00d4:
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L_0x00dc
                goto L_0x004e
            L_0x00dc:
                r24 = 9
                goto L_0x004e
            L_0x00e0:
                r3 = r16
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L_0x00e9
                goto L_0x00eb
            L_0x00e9:
                r24 = 8
            L_0x00eb:
                r16 = r0
                r0 = r17
                goto L_0x00ff
            L_0x00f0:
                r3 = r16
                r16 = r0
                r0 = r17
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L_0x00fd
                goto L_0x00ff
            L_0x00fd:
                r24 = 7
            L_0x00ff:
                r17 = r3
                goto L_0x0171
            L_0x0103:
                r3 = r18
                r25 = r16
                r16 = r0
                r0 = r17
                r17 = r25
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L_0x0114
                goto L_0x0116
            L_0x0114:
                r24 = 6
            L_0x0116:
                r18 = r3
                goto L_0x0171
            L_0x011a:
                r3 = r19
                r25 = r16
                r16 = r0
                r0 = r17
                r17 = r25
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L_0x012b
                goto L_0x012d
            L_0x012b:
                r24 = 5
            L_0x012d:
                r19 = r3
                goto L_0x0171
            L_0x0130:
                r3 = r20
                r25 = r16
                r16 = r0
                r0 = r17
                r17 = r25
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L_0x0141
                goto L_0x0143
            L_0x0141:
                r24 = 4
            L_0x0143:
                r20 = r3
                goto L_0x0171
            L_0x0146:
                r3 = r21
                r25 = r16
                r16 = r0
                r0 = r17
                r17 = r25
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L_0x0157
                goto L_0x0159
            L_0x0157:
                r24 = 3
            L_0x0159:
                r21 = r3
                goto L_0x0171
            L_0x015c:
                r3 = r22
                r25 = r16
                r16 = r0
                r0 = r17
                r17 = r25
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L_0x016d
                goto L_0x016f
            L_0x016d:
                r24 = 2
            L_0x016f:
                r22 = r3
            L_0x0171:
                r3 = r23
                goto L_0x019b
            L_0x0174:
                r3 = r23
                r25 = r16
                r16 = r0
                r0 = r17
                r17 = r25
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L_0x0185
                goto L_0x019b
            L_0x0185:
                r24 = 1
                goto L_0x019b
            L_0x0188:
                r3 = r23
                r25 = r16
                r16 = r0
                r0 = r17
                r17 = r25
                boolean r2 = r2.equals(r1)
                if (r2 != 0) goto L_0x0199
                goto L_0x019b
            L_0x0199:
                r24 = 0
            L_0x019b:
                switch(r24) {
                    case 0: goto L_0x03f0;
                    case 1: goto L_0x03d6;
                    case 2: goto L_0x03ba;
                    case 3: goto L_0x039e;
                    case 4: goto L_0x0381;
                    case 5: goto L_0x0364;
                    case 6: goto L_0x0347;
                    case 7: goto L_0x032c;
                    case 8: goto L_0x030f;
                    case 9: goto L_0x02f2;
                    case 10: goto L_0x02d7;
                    case 11: goto L_0x02bc;
                    case 12: goto L_0x029d;
                    case 13: goto L_0x0282;
                    case 14: goto L_0x0267;
                    case 15: goto L_0x024c;
                    case 16: goto L_0x0231;
                    case 17: goto L_0x0212;
                    case 18: goto L_0x01f7;
                    case 19: goto L_0x01d8;
                    case 20: goto L_0x01bd;
                    case 21: goto L_0x01a2;
                    default: goto L_0x019e;
                }
            L_0x019e:
                r4 = r26
                goto L_0x0409
            L_0x01a2:
                r2 = r27
                com.miot.common.property.Property r0 = r2.getProperty(r4)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x019e
                java.lang.Object r0 = r2.getValue(r4)
                java.lang.Long r0 = (java.lang.Long) r0
                r4 = r26
                com.yeelight.yeelib.device.xiaomi.CeilingbService$y1 r1 = r4.f13284a
                r1.mo33158a(r0)
                goto L_0x0409
            L_0x01bd:
                r4 = r26
                r2 = r27
                com.miot.common.property.Property r0 = r2.getProperty(r5)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0409
                java.lang.Object r0 = r2.getValue(r5)
                java.lang.String r0 = (java.lang.String) r0
                com.yeelight.yeelib.device.xiaomi.CeilingbService$y1 r1 = r4.f13284a
                r1.mo33174q(r0)
                goto L_0x0409
            L_0x01d8:
                r4 = r26
                r2 = r27
                com.miot.common.property.Property r0 = r2.getProperty(r6)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0409
                java.lang.Object r0 = r2.getValue(r6)
                java.lang.String r0 = (java.lang.String) r0
                com.yeelight.yeelib.device.xiaomi.CeilingbService$MainPower r0 = com.yeelight.yeelib.device.xiaomi.CeilingbService.MainPower.valueOf(r0)
                com.yeelight.yeelib.device.xiaomi.CeilingbService$y1 r1 = r4.f13284a
                r1.mo33179v(r0)
                goto L_0x0409
            L_0x01f7:
                r4 = r26
                r2 = r27
                com.miot.common.property.Property r0 = r2.getProperty(r7)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0409
                java.lang.Object r0 = r2.getValue(r7)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.CeilingbService$y1 r1 = r4.f13284a
                r1.mo33164g(r0)
                goto L_0x0409
            L_0x0212:
                r4 = r26
                r2 = r27
                com.miot.common.property.Property r0 = r2.getProperty(r8)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0409
                java.lang.Object r0 = r2.getValue(r8)
                java.lang.String r0 = (java.lang.String) r0
                com.yeelight.yeelib.device.xiaomi.CeilingbService$BgPower r0 = com.yeelight.yeelib.device.xiaomi.CeilingbService.BgPower.valueOf(r0)
                com.yeelight.yeelib.device.xiaomi.CeilingbService$y1 r1 = r4.f13284a
                r1.mo33178u(r0)
                goto L_0x0409
            L_0x0231:
                r4 = r26
                r2 = r27
                com.miot.common.property.Property r0 = r2.getProperty(r9)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0409
                java.lang.Object r0 = r2.getValue(r9)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.CeilingbService$y1 r1 = r4.f13284a
                r1.mo33172o(r0)
                goto L_0x0409
            L_0x024c:
                r4 = r26
                r2 = r27
                com.miot.common.property.Property r0 = r2.getProperty(r10)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0409
                java.lang.Object r0 = r2.getValue(r10)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.CeilingbService$y1 r1 = r4.f13284a
                r1.mo33176s(r0)
                goto L_0x0409
            L_0x0267:
                r4 = r26
                r2 = r27
                com.miot.common.property.Property r0 = r2.getProperty(r11)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0409
                java.lang.Object r0 = r2.getValue(r11)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.CeilingbService$y1 r1 = r4.f13284a
                r1.mo33161d(r0)
                goto L_0x0409
            L_0x0282:
                r4 = r26
                r2 = r27
                com.miot.common.property.Property r0 = r2.getProperty(r12)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0409
                java.lang.Object r0 = r2.getValue(r12)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.CeilingbService$y1 r1 = r4.f13284a
                r1.mo33159b(r0)
                goto L_0x0409
            L_0x029d:
                r4 = r26
                r2 = r27
                com.miot.common.property.Property r0 = r2.getProperty(r13)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0409
                java.lang.Object r0 = r2.getValue(r13)
                java.lang.String r0 = (java.lang.String) r0
                com.yeelight.yeelib.device.xiaomi.CeilingbService$Power r0 = com.yeelight.yeelib.device.xiaomi.CeilingbService.Power.valueOf(r0)
                com.yeelight.yeelib.device.xiaomi.CeilingbService$y1 r1 = r4.f13284a
                r1.mo33177t(r0)
                goto L_0x0409
            L_0x02bc:
                r4 = r26
                r2 = r27
                com.miot.common.property.Property r0 = r2.getProperty(r14)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0409
                java.lang.Object r0 = r2.getValue(r14)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.CeilingbService$y1 r1 = r4.f13284a
                r1.mo33171n(r0)
                goto L_0x0409
            L_0x02d7:
                r4 = r26
                r2 = r27
                com.miot.common.property.Property r0 = r2.getProperty(r15)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0409
                java.lang.Object r0 = r2.getValue(r15)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.CeilingbService$y1 r1 = r4.f13284a
                r1.mo33163f(r0)
                goto L_0x0409
            L_0x02f2:
                r4 = r26
                r2 = r27
                r0 = r16
                com.miot.common.property.Property r1 = r2.getProperty(r0)
                boolean r1 = r1.isValueValid()
                if (r1 == 0) goto L_0x0409
                java.lang.Object r0 = r2.getValue(r0)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.CeilingbService$y1 r1 = r4.f13284a
                r1.mo33167j(r0)
                goto L_0x0409
            L_0x030f:
                r4 = r26
                r2 = r27
                r0 = r17
                com.miot.common.property.Property r1 = r2.getProperty(r0)
                boolean r1 = r1.isValueValid()
                if (r1 == 0) goto L_0x0409
                java.lang.Object r0 = r2.getValue(r0)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.CeilingbService$y1 r1 = r4.f13284a
                r1.mo33165h(r0)
                goto L_0x0409
            L_0x032c:
                r4 = r26
                r2 = r27
                com.miot.common.property.Property r1 = r2.getProperty(r0)
                boolean r1 = r1.isValueValid()
                if (r1 == 0) goto L_0x0409
                java.lang.Object r0 = r2.getValue(r0)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.CeilingbService$y1 r1 = r4.f13284a
                r1.mo33170m(r0)
                goto L_0x0409
            L_0x0347:
                r4 = r26
                r2 = r27
                r0 = r18
                com.miot.common.property.Property r1 = r2.getProperty(r0)
                boolean r1 = r1.isValueValid()
                if (r1 == 0) goto L_0x0409
                java.lang.Object r0 = r2.getValue(r0)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.CeilingbService$y1 r1 = r4.f13284a
                r1.mo33173p(r0)
                goto L_0x0409
            L_0x0364:
                r4 = r26
                r2 = r27
                r0 = r19
                com.miot.common.property.Property r1 = r2.getProperty(r0)
                boolean r1 = r1.isValueValid()
                if (r1 == 0) goto L_0x0409
                java.lang.Object r0 = r2.getValue(r0)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.CeilingbService$y1 r1 = r4.f13284a
                r1.mo33168k(r0)
                goto L_0x0409
            L_0x0381:
                r4 = r26
                r2 = r27
                r0 = r20
                com.miot.common.property.Property r1 = r2.getProperty(r0)
                boolean r1 = r1.isValueValid()
                if (r1 == 0) goto L_0x0409
                java.lang.Object r0 = r2.getValue(r0)
                java.lang.String r0 = (java.lang.String) r0
                com.yeelight.yeelib.device.xiaomi.CeilingbService$y1 r1 = r4.f13284a
                r1.mo33166i(r0)
                goto L_0x0409
            L_0x039e:
                r4 = r26
                r2 = r27
                r0 = r21
                com.miot.common.property.Property r1 = r2.getProperty(r0)
                boolean r1 = r1.isValueValid()
                if (r1 == 0) goto L_0x0409
                java.lang.Object r0 = r2.getValue(r0)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.CeilingbService$y1 r1 = r4.f13284a
                r1.mo33175r(r0)
                goto L_0x0409
            L_0x03ba:
                r4 = r26
                r2 = r27
                r0 = r22
                com.miot.common.property.Property r1 = r2.getProperty(r0)
                boolean r1 = r1.isValueValid()
                if (r1 == 0) goto L_0x0409
                java.lang.Object r0 = r2.getValue(r0)
                java.lang.String r0 = (java.lang.String) r0
                com.yeelight.yeelib.device.xiaomi.CeilingbService$y1 r1 = r4.f13284a
                r1.mo33162e(r0)
                goto L_0x0409
            L_0x03d6:
                r4 = r26
                r2 = r27
                com.miot.common.property.Property r0 = r2.getProperty(r3)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0409
                java.lang.Object r0 = r2.getValue(r3)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.CeilingbService$y1 r1 = r4.f13284a
                r1.mo33169l(r0)
                goto L_0x0409
            L_0x03f0:
                r4 = r26
                r2 = r27
                com.miot.common.property.Property r0 = r2.getProperty(r1)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0409
                java.lang.Object r0 = r2.getValue(r1)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.CeilingbService$y1 r1 = r4.f13284a
                r1.mo33160c(r0)
            L_0x0409:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.xiaomi.CeilingbService.C6996v.onPropertyChanged(com.miot.common.device.invocation.PropertyInfo, java.lang.String):void");
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$v0 */
    class C6997v0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13285a;

        C6997v0(CeilingbService ceilingbService, CompletionHandler completionHandler) {
            this.f13285a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13285a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13285a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$v1 */
    public interface C6998v1 {
        /* renamed from: a */
        void mo33152a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$w */
    class C6999w implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13286a;

        C6999w(CeilingbService ceilingbService, CompletionHandler completionHandler) {
            this.f13286a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13286a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13286a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$w0 */
    class C7000w0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6977o1 f13287a;

        C7000w0(CeilingbService ceilingbService, C6977o1 o1Var) {
            this.f13287a = o1Var;
        }

        public void onFailed(int i, String str) {
            this.f13287a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("MainPower");
            if (property.isValueValid()) {
                this.f13287a.mo33138a(MainPower.valueOf((String) propertyInfo.getValue("MainPower")));
                return;
            }
            C6977o1 o1Var = this.f13287a;
            o1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$w1 */
    public interface C7001w1 {
        /* renamed from: a */
        void mo33154a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$x */
    class C7002x implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13288a;

        C7002x(CeilingbService ceilingbService, CompletionHandler completionHandler) {
            this.f13288a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13288a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13288a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$x0 */
    class C7003x0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6989s1 f13289a;

        C7003x0(CeilingbService ceilingbService, C6989s1 s1Var) {
            this.f13289a = s1Var;
        }

        public void onFailed(int i, String str) {
            this.f13289a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Power");
            if (property.isValueValid()) {
                this.f13289a.mo33146a(Power.valueOf((String) propertyInfo.getValue("Power")));
                return;
            }
            C6989s1 s1Var = this.f13289a;
            s1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$x1 */
    public interface C7004x1 {
        /* renamed from: a */
        void mo33156a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$y */
    class C7005y implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13290a;

        C7005y(CeilingbService ceilingbService, CompletionHandler completionHandler) {
            this.f13290a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13290a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13290a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$y0 */
    class C7006y0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6950f1 f13291a;

        C7006y0(CeilingbService ceilingbService, C6950f1 f1Var) {
            this.f13291a = f1Var;
        }

        public void onFailed(int i, String str) {
            this.f13291a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("BgPower");
            if (property.isValueValid()) {
                this.f13291a.mo33120a(BgPower.valueOf((String) propertyInfo.getValue("BgPower")));
                return;
            }
            C6950f1 f1Var = this.f13291a;
            f1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$y1 */
    public interface C7007y1 {
        /* renamed from: a */
        void mo33158a(Long l);

        /* renamed from: b */
        void mo33159b(Long l);

        /* renamed from: c */
        void mo33160c(Long l);

        /* renamed from: d */
        void mo33161d(Long l);

        /* renamed from: e */
        void mo33162e(String str);

        /* renamed from: f */
        void mo33163f(Long l);

        /* renamed from: g */
        void mo33164g(Long l);

        /* renamed from: h */
        void mo33165h(Long l);

        /* renamed from: i */
        void mo33166i(String str);

        /* renamed from: j */
        void mo33167j(Long l);

        /* renamed from: k */
        void mo33168k(Long l);

        /* renamed from: l */
        void mo33169l(Long l);

        /* renamed from: m */
        void mo33170m(Long l);

        /* renamed from: n */
        void mo33171n(Long l);

        /* renamed from: o */
        void mo33172o(Long l);

        /* renamed from: p */
        void mo33173p(Long l);

        /* renamed from: q */
        void mo33174q(String str);

        /* renamed from: r */
        void mo33175r(Long l);

        /* renamed from: s */
        void mo33176s(Long l);

        /* renamed from: t */
        void mo33177t(Power power);

        /* renamed from: u */
        void mo33178u(BgPower bgPower);

        /* renamed from: v */
        void mo33179v(MainPower mainPower);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$z */
    class C7008z implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13292a;

        C7008z(CeilingbService ceilingbService, CompletionHandler completionHandler) {
            this.f13292a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13292a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13292a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$z0 */
    class C7009z0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6959i1 f13293a;

        C7009z0(CeilingbService ceilingbService, C6959i1 i1Var) {
            this.f13293a = i1Var;
        }

        public void onFailed(int i, String str) {
            this.f13293a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Bright");
            if (property.isValueValid()) {
                this.f13293a.mo33126a((Long) propertyInfo.getValue("Bright"));
                return;
            }
            C6959i1 i1Var = this.f13293a;
            i1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    public CeilingbService(AbstractDevice abstractDevice) {
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
                MiotManager.getDeviceManipulator().invoke(create, new C6934a0(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6973n0(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getBgBright(C6938b1 b1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "BgBright"), new C6935a1(this, b1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getBgCt(C6941c1 c1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "BgCt"), new C6936b(this, c1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getBgFlowParams(C6944d1 d1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "BgFlowParams"), new C6945e(this, d1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getBgFlowing(C6947e1 e1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "BgFlowing"), new C6978p(this, e1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getBgPower(C6950f1 f1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "BgPower"), new C7006y0(this, f1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getBgProact(C6953g1 g1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "BgProact"), new C6981q(this, g1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getBgRgb(C6956h1 h1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "BgRgb"), new C6972n(this, h1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getBright(C6959i1 i1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Bright"), new C7009z0(this, i1Var));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6997v0(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getCt(C6962j1 j1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Ct"), new C6933a(this, j1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getDelayOff(C6965k1 k1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "DelayOff"), new C6939c(this, k1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowParams(C6968l1 l1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "FlowParams"), new C6942d(this, l1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowing(C6971m1 m1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Flowing"), new C6975o(this, m1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getLanMode(C6974n1 n1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "LanMode"), new C6948f(this, n1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getMainPower(C6977o1 o1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "MainPower"), new C7000w0(this, o1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getMiBandSleep(C6980p1 p1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "MiBandSleep"), new C6969m(this, p1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getNLBright(C6983q1 q1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "NLBright"), new C6960j(this, q1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getNightTimeInfo(C6986r1 r1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "NightTimeInfo"), new C6966l(this, r1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getPower(C6989s1 s1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Power"), new C7003x0(this, s1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getProperties(C6992t1 t1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            PropertyInfo create = PropertyInfoFactory.create(getService());
            create.addProperty(getService().getProperty("MainPower"));
            create.addProperty(getService().getProperty("Power"));
            create.addProperty(getService().getProperty("BgPower"));
            create.addProperty(getService().getProperty("Bright"));
            create.addProperty(getService().getProperty("BgBright"));
            create.addProperty(getService().getProperty("Ct"));
            create.addProperty(getService().getProperty("BgCt"));
            create.addProperty(getService().getProperty("DelayOff"));
            create.addProperty(getService().getProperty("FlowParams"));
            create.addProperty(getService().getProperty("BgFlowParams"));
            create.addProperty(getService().getProperty("LanMode"));
            create.addProperty(getService().getProperty("SaveState"));
            create.addProperty(getService().getProperty("TransIntervalDflt"));
            create.addProperty(getService().getProperty("onFromPower"));
            create.addProperty(getService().getProperty("NLBright"));
            create.addProperty(getService().getProperty("NightTimeInfo"));
            create.addProperty(getService().getProperty("MiBandSleep"));
            create.addProperty(getService().getProperty("BgRgb"));
            create.addProperty(getService().getProperty("Flowing"));
            create.addProperty(getService().getProperty("BgFlowing"));
            create.addProperty(getService().getProperty("BgProact"));
            create.addProperty(getService().getProperty("SmartSwitch"));
            MiotManager.getDeviceManipulator().readProperty(create, new C6985r0(this, t1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getSaveState(C6995u1 u1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "SaveState"), new C6951g(this, u1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getSmartSwitch(C6998v1 v1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "SmartSwitch"), new C6984r(this, v1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getTransIntervalDflt(C7001w1 w1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "TransIntervalDflt"), new C6954h(this, w1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getonFromPower(C7004x1 x1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "onFromPower"), new C6957i(this, x1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void openBgWithMode(BgPower bgPower, Effect effect, Long l, Long l2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "openBgWithMode");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("BgPower", bgPower.toString())) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Effect", effect.toString())) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Duration", l)) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("Mode", l2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C7008z(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void openWithMode(MainPower mainPower, Effect effect, Long l, Long l2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "openWithMode");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("MainPower", mainPower.toString())) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Effect", effect.toString())) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Duration", l)) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("Mode", l2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C7002x(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6976o0(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6943d0(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setBgBright(Long l, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setBgBright");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (create.setArgumentValue("BgBright", l)) {
                MiotManager.getDeviceManipulator().invoke(create, new C6964k0(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setBgCt(Long l, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setBgCt");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (create.setArgumentValue("BgCt", l)) {
                MiotManager.getDeviceManipulator().invoke(create, new C6937b0(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setBgFlowScene(String str, Long l, Long l2, String str2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setBgFlowScene");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("ParamModel", str)) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("ParamCount", l)) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("ParamFinish", l2)) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("ParamColors", str2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C6958i0(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setBgPower(BgPower bgPower, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setBgPower");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (create.setArgumentValue("BgPower", bgPower.toString())) {
                MiotManager.getDeviceManipulator().invoke(create, new C6987s(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setBgRgb(Long l, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setBgRgb");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (create.setArgumentValue("BgRgb", l)) {
                MiotManager.getDeviceManipulator().invoke(create, new C6999w(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setBgScene(String str, Long l, Long l2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setBgScene");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("ParamModel", str)) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("ParamCount", l)) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("ParamFinish", l2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C6967l0(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setBgScene2(String str, Long l, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), ACTION_setBgScene2);
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("ParamModel", str)) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("ParamCount", l)) {
                MiotManager.getDeviceManipulator().invoke(create, new C6970m0(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6990t(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6994u0(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6991t0(this, completionHandler));
                return;
            }
            throw new MiotException("actionInfo is null");
        }
        throw new MiotException("device not configurated connection");
    }

    public void setDevPower(Power power, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setDevPower");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (create.setArgumentValue("Power", power.toString())) {
                MiotManager.getDeviceManipulator().invoke(create, new C6982q0(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
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
                MiotManager.getDeviceManipulator().invoke(create, new C6949f0(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6940c0(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7005y(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6979p0(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6993u(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setSceneBundle(String str, String str2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setSceneBundle");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("BundleItem1", str)) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("BundleItem2", str2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C6955h0(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6946e0(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void start_cf(Long l, Long l2, String str, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "start_cf");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("ParamCount", l)) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("ParamFinish", l2)) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("ParamColors", str)) {
                MiotManager.getDeviceManipulator().invoke(create, new C6961j0(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void subscribeNotifications(CompletionHandler completionHandler, C7007y1 y1Var) {
        if (completionHandler == null) {
            throw new IllegalArgumentException("handler is null");
        } else if (y1Var != null) {
            PropertyInfo create = PropertyInfoFactory.create(getService());
            for (Property next : getService().getProperties()) {
                if (next.getDefinition().isNotifiable()) {
                    create.addProperty(next);
                }
            }
            MiotManager.getDeviceManipulator().addPropertyChangedListener(create, new C6963k(this, completionHandler), new C6996v(this, y1Var));
        } else {
            throw new IllegalArgumentException("listener is null");
        }
    }

    public void toggle(CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "toggle");
            if (create != null) {
                MiotManager.getDeviceManipulator().invoke(create, new C6988s0(this, completionHandler));
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
            MiotManager.getDeviceManipulator().removePropertyChangedListener(create, new C6952g0(this, completionHandler));
            return;
        }
        throw new IllegalArgumentException("handler is null");
    }
}
