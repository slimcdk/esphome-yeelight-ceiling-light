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

public class Ceiling4Service extends AbstractService {
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
    public static final String ACTION_setBright = "setBright";
    public static final String ACTION_setCt = "setCt";
    public static final String ACTION_setDefault = "setDefault";
    public static final String ACTION_setDevPower = "setDevPower";
    public static final String ACTION_setFlowScene = "setFlowScene";
    public static final String ACTION_setNLScene = "setNLScene";
    public static final String ACTION_setPower = "setPower";
    public static final String ACTION_setScene = "setScene";
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
    public static final String PROPERTY_adjustAction = "adjustAction";
    public static final String PROPERTY_adjustProper = "adjustProper";
    public static final String PROPERTY_onFromPower = "onFromPower";
    private static final String TAG = "Ceiling4Service";
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
        cfg_bg_proact
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

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$a */
    class C6678a implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6695f1 f13059a;

        C6678a(Ceiling4Service ceiling4Service, C6695f1 f1Var) {
            this.f13059a = f1Var;
        }

        public void onFailed(int i, String str) {
            this.f13059a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Ct");
            if (property.isValueValid()) {
                this.f13059a.mo32728a((Long) propertyInfo.getValue("Ct"));
                return;
            }
            C6695f1 f1Var = this.f13059a;
            f1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$a0 */
    class C6679a0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13060a;

        C6679a0(Ceiling4Service ceiling4Service, CompletionHandler completionHandler) {
            this.f13060a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13060a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13060a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$a1 */
    public interface C6680a1 {
        /* renamed from: a */
        void mo32718a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$b */
    class C6681b implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6746y0 f13061a;

        C6681b(Ceiling4Service ceiling4Service, C6746y0 y0Var) {
            this.f13061a = y0Var;
        }

        public void onFailed(int i, String str) {
            this.f13061a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("BgCt");
            if (property.isValueValid()) {
                this.f13061a.mo32776a((Long) propertyInfo.getValue("BgCt"));
                return;
            }
            C6746y0 y0Var = this.f13061a;
            y0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$b0 */
    class C6682b0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13062a;

        C6682b0(Ceiling4Service ceiling4Service, CompletionHandler completionHandler) {
            this.f13062a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13062a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13062a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$b1 */
    public interface C6683b1 {
        /* renamed from: a */
        void mo32720a(BgPower bgPower);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$c */
    class C6684c implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6698g1 f13063a;

        C6684c(Ceiling4Service ceiling4Service, C6698g1 g1Var) {
            this.f13063a = g1Var;
        }

        public void onFailed(int i, String str) {
            this.f13063a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("DelayOff");
            if (property.isValueValid()) {
                this.f13063a.mo32730a((Long) propertyInfo.getValue("DelayOff"));
                return;
            }
            C6698g1 g1Var = this.f13063a;
            g1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$c0 */
    class C6685c0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13064a;

        C6685c0(Ceiling4Service ceiling4Service, CompletionHandler completionHandler) {
            this.f13064a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13064a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13064a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$c1 */
    public interface C6686c1 {
        /* renamed from: a */
        void mo32722a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$d */
    class C6687d implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6701h1 f13065a;

        C6687d(Ceiling4Service ceiling4Service, C6701h1 h1Var) {
            this.f13065a = h1Var;
        }

        public void onFailed(int i, String str) {
            this.f13065a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("FlowParams");
            if (property.isValueValid()) {
                this.f13065a.onSucceed((String) propertyInfo.getValue("FlowParams"));
                return;
            }
            C6701h1 h1Var = this.f13065a;
            h1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$d0 */
    class C6688d0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13066a;

        C6688d0(Ceiling4Service ceiling4Service, CompletionHandler completionHandler) {
            this.f13066a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13066a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13066a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$d1 */
    public interface C6689d1 {
        /* renamed from: a */
        void mo32724a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$e */
    class C6690e implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6748z0 f13067a;

        C6690e(Ceiling4Service ceiling4Service, C6748z0 z0Var) {
            this.f13067a = z0Var;
        }

        public void onFailed(int i, String str) {
            this.f13067a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("BgFlowParams");
            if (property.isValueValid()) {
                this.f13067a.onSucceed((String) propertyInfo.getValue("BgFlowParams"));
                return;
            }
            C6748z0 z0Var = this.f13067a;
            z0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$e0 */
    class C6691e0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13068a;

        C6691e0(Ceiling4Service ceiling4Service, CompletionHandler completionHandler) {
            this.f13068a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13068a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13068a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$e1 */
    public interface C6692e1 {
        /* renamed from: a */
        void mo32726a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$f */
    class C6693f implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6707j1 f13069a;

        C6693f(Ceiling4Service ceiling4Service, C6707j1 j1Var) {
            this.f13069a = j1Var;
        }

        public void onFailed(int i, String str) {
            this.f13069a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("LanMode");
            if (property.isValueValid()) {
                this.f13069a.mo32736a((Long) propertyInfo.getValue("LanMode"));
                return;
            }
            C6707j1 j1Var = this.f13069a;
            j1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$f0 */
    class C6694f0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13070a;

        C6694f0(Ceiling4Service ceiling4Service, CompletionHandler completionHandler) {
            this.f13070a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13070a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13070a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$f1 */
    public interface C6695f1 {
        /* renamed from: a */
        void mo32728a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$g */
    class C6696g implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6728q1 f13071a;

        C6696g(Ceiling4Service ceiling4Service, C6728q1 q1Var) {
            this.f13071a = q1Var;
        }

        public void onFailed(int i, String str) {
            this.f13071a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("SaveState");
            if (property.isValueValid()) {
                this.f13071a.mo32750a((Long) propertyInfo.getValue("SaveState"));
                return;
            }
            C6728q1 q1Var = this.f13071a;
            q1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$g0 */
    class C6697g0 implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13072a;

        C6697g0(Ceiling4Service ceiling4Service, CompletionHandler completionHandler) {
            this.f13072a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13072a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f13072a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$g1 */
    public interface C6698g1 {
        /* renamed from: a */
        void mo32730a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$h */
    class C6699h implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6731r1 f13073a;

        C6699h(Ceiling4Service ceiling4Service, C6731r1 r1Var) {
            this.f13073a = r1Var;
        }

        public void onFailed(int i, String str) {
            this.f13073a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("onFromPower");
            if (property.isValueValid()) {
                this.f13073a.mo32752a((Long) propertyInfo.getValue("onFromPower"));
                return;
            }
            C6731r1 r1Var = this.f13073a;
            r1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$h0 */
    class C6700h0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13074a;

        C6700h0(Ceiling4Service ceiling4Service, CompletionHandler completionHandler) {
            this.f13074a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13074a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13074a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$h1 */
    public interface C6701h1 {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$i */
    class C6702i implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6716m1 f13075a;

        C6702i(Ceiling4Service ceiling4Service, C6716m1 m1Var) {
            this.f13075a = m1Var;
        }

        public void onFailed(int i, String str) {
            this.f13075a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("NLBright");
            if (property.isValueValid()) {
                this.f13075a.mo32742a((Long) propertyInfo.getValue("NLBright"));
                return;
            }
            C6716m1 m1Var = this.f13075a;
            m1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$i0 */
    class C6703i0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13076a;

        C6703i0(Ceiling4Service ceiling4Service, CompletionHandler completionHandler) {
            this.f13076a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13076a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13076a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$i1 */
    public interface C6704i1 {
        /* renamed from: a */
        void mo32734a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$j */
    class C6705j implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6719n1 f13077a;

        C6705j(Ceiling4Service ceiling4Service, C6719n1 n1Var) {
            this.f13077a = n1Var;
        }

        public void onFailed(int i, String str) {
            this.f13077a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("NightTimeInfo");
            if (property.isValueValid()) {
                this.f13077a.onSucceed((String) propertyInfo.getValue("NightTimeInfo"));
                return;
            }
            C6719n1 n1Var = this.f13077a;
            n1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$j0 */
    class C6706j0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13078a;

        C6706j0(Ceiling4Service ceiling4Service, CompletionHandler completionHandler) {
            this.f13078a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13078a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13078a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$j1 */
    public interface C6707j1 {
        /* renamed from: a */
        void mo32736a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$k */
    class C6708k implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13079a;

        C6708k(Ceiling4Service ceiling4Service, CompletionHandler completionHandler) {
            this.f13079a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13079a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f13079a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$k0 */
    class C6709k0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13080a;

        C6709k0(Ceiling4Service ceiling4Service, CompletionHandler completionHandler) {
            this.f13080a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13080a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13080a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$k1 */
    public interface C6710k1 {
        /* renamed from: a */
        void mo32738a(MainPower mainPower);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$l */
    class C6711l implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6713l1 f13081a;

        C6711l(Ceiling4Service ceiling4Service, C6713l1 l1Var) {
            this.f13081a = l1Var;
        }

        public void onFailed(int i, String str) {
            this.f13081a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("MiBandSleep");
            if (property.isValueValid()) {
                this.f13081a.mo32740a((Long) propertyInfo.getValue("MiBandSleep"));
                return;
            }
            C6713l1 l1Var = this.f13081a;
            l1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$l0 */
    class C6712l0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13082a;

        C6712l0(Ceiling4Service ceiling4Service, CompletionHandler completionHandler) {
            this.f13082a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13082a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13082a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$l1 */
    public interface C6713l1 {
        /* renamed from: a */
        void mo32740a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$m */
    class C6714m implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6689d1 f13083a;

        C6714m(Ceiling4Service ceiling4Service, C6689d1 d1Var) {
            this.f13083a = d1Var;
        }

        public void onFailed(int i, String str) {
            this.f13083a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("BgRgb");
            if (property.isValueValid()) {
                this.f13083a.mo32724a((Long) propertyInfo.getValue("BgRgb"));
                return;
            }
            C6689d1 d1Var = this.f13083a;
            d1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$m0 */
    class C6715m0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13084a;

        C6715m0(Ceiling4Service ceiling4Service, CompletionHandler completionHandler) {
            this.f13084a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13084a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13084a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$m1 */
    public interface C6716m1 {
        /* renamed from: a */
        void mo32742a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$n */
    class C6717n implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6704i1 f13085a;

        C6717n(Ceiling4Service ceiling4Service, C6704i1 i1Var) {
            this.f13085a = i1Var;
        }

        public void onFailed(int i, String str) {
            this.f13085a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Flowing");
            if (property.isValueValid()) {
                this.f13085a.mo32734a((Long) propertyInfo.getValue("Flowing"));
                return;
            }
            C6704i1 i1Var = this.f13085a;
            i1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$n0 */
    class C6718n0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13086a;

        C6718n0(Ceiling4Service ceiling4Service, CompletionHandler completionHandler) {
            this.f13086a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13086a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13086a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$n1 */
    public interface C6719n1 {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$o */
    class C6720o implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6680a1 f13087a;

        C6720o(Ceiling4Service ceiling4Service, C6680a1 a1Var) {
            this.f13087a = a1Var;
        }

        public void onFailed(int i, String str) {
            this.f13087a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("BgFlowing");
            if (property.isValueValid()) {
                this.f13087a.mo32718a((Long) propertyInfo.getValue("BgFlowing"));
                return;
            }
            C6680a1 a1Var = this.f13087a;
            a1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$o0 */
    class C6721o0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13088a;

        C6721o0(Ceiling4Service ceiling4Service, CompletionHandler completionHandler) {
            this.f13088a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13088a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13088a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$o1 */
    public interface C6722o1 {
        /* renamed from: a */
        void mo32746a(Power power);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$p */
    class C6723p implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6686c1 f13089a;

        C6723p(Ceiling4Service ceiling4Service, C6686c1 c1Var) {
            this.f13089a = c1Var;
        }

        public void onFailed(int i, String str) {
            this.f13089a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("BgProact");
            if (property.isValueValid()) {
                this.f13089a.mo32722a((Long) propertyInfo.getValue("BgProact"));
                return;
            }
            C6686c1 c1Var = this.f13089a;
            c1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$p0 */
    class C6724p0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13090a;

        C6724p0(Ceiling4Service ceiling4Service, CompletionHandler completionHandler) {
            this.f13090a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13090a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13090a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$p1 */
    public interface C6725p1 {
        /* renamed from: a */
        void mo32748a(MainPower mainPower, Power power, BgPower bgPower, Long l, Long l2, Long l3, Long l4, Long l5, String str, String str2, Long l6, Long l7, Long l8, Long l9, String str3, Long l10, Long l11, Long l12, Long l13, Long l14);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$q */
    class C6726q implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13091a;

        C6726q(Ceiling4Service ceiling4Service, CompletionHandler completionHandler) {
            this.f13091a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13091a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13091a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$q0 */
    class C6727q0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13092a;

        C6727q0(Ceiling4Service ceiling4Service, CompletionHandler completionHandler) {
            this.f13092a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13092a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13092a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$q1 */
    public interface C6728q1 {
        /* renamed from: a */
        void mo32750a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$r */
    class C6729r implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13093a;

        C6729r(Ceiling4Service ceiling4Service, CompletionHandler completionHandler) {
            this.f13093a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13093a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13093a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$r0 */
    class C6730r0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6725p1 f13094a;

        C6730r0(Ceiling4Service ceiling4Service, C6725p1 p1Var) {
            this.f13094a = p1Var;
        }

        public void onFailed(int i, String str) {
            this.f13094a.onFailed(i, str);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.Long} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onSucceed(com.miot.common.device.invocation.PropertyInfo r26) {
            /*
                r25 = this;
                r0 = r26
                java.lang.String r1 = "MainPower"
                com.miot.common.property.Property r1 = r0.getProperty(r1)
                boolean r2 = r1.isValueValid()
                r3 = 0
                if (r2 == 0) goto L_0x001b
                java.lang.Object r1 = r1.getValue()
                java.lang.String r1 = (java.lang.String) r1
                com.yeelight.yeelib.device.xiaomi.Ceiling4Service$MainPower r1 = com.yeelight.yeelib.device.xiaomi.Ceiling4Service.MainPower.valueOf(r1)
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
                com.yeelight.yeelib.device.xiaomi.Ceiling4Service$Power r1 = com.yeelight.yeelib.device.xiaomi.Ceiling4Service.Power.valueOf(r1)
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
                com.yeelight.yeelib.device.xiaomi.Ceiling4Service$BgPower r1 = com.yeelight.yeelib.device.xiaomi.Ceiling4Service.BgPower.valueOf(r1)
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
                java.lang.String r1 = "onFromPower"
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
                java.lang.String r1 = "NLBright"
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
                java.lang.String r1 = "NightTimeInfo"
                com.miot.common.property.Property r1 = r0.getProperty(r1)
                boolean r2 = r1.isValueValid()
                if (r2 == 0) goto L_0x0150
                java.lang.Object r1 = r1.getValue()
                java.lang.String r1 = (java.lang.String) r1
                r19 = r1
                goto L_0x0152
            L_0x0150:
                r19 = r3
            L_0x0152:
                java.lang.String r1 = "MiBandSleep"
                com.miot.common.property.Property r1 = r0.getProperty(r1)
                boolean r2 = r1.isValueValid()
                if (r2 == 0) goto L_0x0167
                java.lang.Object r1 = r1.getValue()
                java.lang.Long r1 = (java.lang.Long) r1
                r20 = r1
                goto L_0x0169
            L_0x0167:
                r20 = r3
            L_0x0169:
                java.lang.String r1 = "BgRgb"
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
                java.lang.String r1 = "Flowing"
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
                java.lang.String r1 = "BgFlowing"
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
                java.lang.String r1 = "BgProact"
                com.miot.common.property.Property r0 = r0.getProperty(r1)
                boolean r1 = r0.isValueValid()
                if (r1 == 0) goto L_0x01c1
                java.lang.Object r0 = r0.getValue()
                r3 = r0
                java.lang.Long r3 = (java.lang.Long) r3
            L_0x01c1:
                r0 = r25
                r24 = r3
                com.yeelight.yeelib.device.xiaomi.Ceiling4Service$p1 r4 = r0.f13094a
                r4.mo32748a(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.xiaomi.Ceiling4Service.C6730r0.onSucceed(com.miot.common.device.invocation.PropertyInfo):void");
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$r1 */
    public interface C6731r1 {
        /* renamed from: a */
        void mo32752a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$s */
    class C6732s implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13095a;

        C6732s(Ceiling4Service ceiling4Service, CompletionHandler completionHandler) {
            this.f13095a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13095a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13095a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$s0 */
    class C6733s0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6710k1 f13096a;

        C6733s0(Ceiling4Service ceiling4Service, C6710k1 k1Var) {
            this.f13096a = k1Var;
        }

        public void onFailed(int i, String str) {
            this.f13096a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("MainPower");
            if (property.isValueValid()) {
                this.f13096a.mo32738a(MainPower.valueOf((String) propertyInfo.getValue("MainPower")));
                return;
            }
            C6710k1 k1Var = this.f13096a;
            k1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$s1 */
    public interface C6734s1 {
        /* renamed from: a */
        void mo32754a(Long l);

        /* renamed from: b */
        void mo32755b(Long l);

        /* renamed from: c */
        void mo32756c(Long l);

        /* renamed from: d */
        void mo32757d(Long l);

        /* renamed from: e */
        void mo32758e(String str);

        /* renamed from: f */
        void mo32759f(Long l);

        /* renamed from: g */
        void mo32760g(Long l);

        /* renamed from: h */
        void mo32761h(Long l);

        /* renamed from: i */
        void mo32762i(String str);

        /* renamed from: j */
        void mo32763j(Long l);

        /* renamed from: k */
        void mo32764k(Long l);

        /* renamed from: l */
        void mo32765l(Long l);

        /* renamed from: m */
        void mo32766m(Long l);

        /* renamed from: n */
        void mo32767n(Long l);

        /* renamed from: o */
        void mo32768o(Power power);

        /* renamed from: p */
        void mo32769p(MainPower mainPower);

        /* renamed from: q */
        void mo32770q(String str);

        /* renamed from: r */
        void mo32771r(Long l);

        /* renamed from: s */
        void mo32772s(Long l);

        /* renamed from: t */
        void mo32773t(BgPower bgPower);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$t */
    class C6735t implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13097a;

        C6735t(Ceiling4Service ceiling4Service, CompletionHandler completionHandler) {
            this.f13097a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13097a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13097a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$t0 */
    class C6736t0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6722o1 f13098a;

        C6736t0(Ceiling4Service ceiling4Service, C6722o1 o1Var) {
            this.f13098a = o1Var;
        }

        public void onFailed(int i, String str) {
            this.f13098a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Power");
            if (property.isValueValid()) {
                this.f13098a.mo32746a(Power.valueOf((String) propertyInfo.getValue("Power")));
                return;
            }
            C6722o1 o1Var = this.f13098a;
            o1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$u */
    class C6737u implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13099a;

        C6737u(Ceiling4Service ceiling4Service, CompletionHandler completionHandler) {
            this.f13099a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13099a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13099a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$u0 */
    class C6738u0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6683b1 f13100a;

        C6738u0(Ceiling4Service ceiling4Service, C6683b1 b1Var) {
            this.f13100a = b1Var;
        }

        public void onFailed(int i, String str) {
            this.f13100a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("BgPower");
            if (property.isValueValid()) {
                this.f13100a.mo32720a(BgPower.valueOf((String) propertyInfo.getValue("BgPower")));
                return;
            }
            C6683b1 b1Var = this.f13100a;
            b1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$v */
    class C6739v implements DeviceManipulator.PropertyChangedListener {

        /* renamed from: a */
        final /* synthetic */ C6734s1 f13101a;

        C6739v(Ceiling4Service ceiling4Service, C6734s1 s1Var) {
            this.f13101a = s1Var;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:100:0x0279, code lost:
            r4.f13101a.mo32767n((java.lang.Long) r2.getValue("BgRgb"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:101:0x0286, code lost:
            r4 = r24;
            r2 = r25;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:102:0x0292, code lost:
            if (r2.getProperty("onFromPower").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:103:0x0294, code lost:
            r4.f13101a.mo32759f((java.lang.Long) r2.getValue("onFromPower"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:104:0x02a1, code lost:
            r4 = r24;
            r2 = r25;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:105:0x02ad, code lost:
            if (r2.getProperty("BgCt").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:106:0x02af, code lost:
            r4.f13101a.mo32763j((java.lang.Long) r2.getValue("BgCt"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:107:0x02bc, code lost:
            r4 = r24;
            r2 = r25;
            r0 = r16;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:108:0x02ca, code lost:
            if (r2.getProperty(r0).isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:109:0x02cc, code lost:
            r4.f13101a.mo32761h((java.lang.Long) r2.getValue(r0));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:110:0x02d9, code lost:
            r4 = r24;
            r2 = r25;
            r0 = r17;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:111:0x02e7, code lost:
            if (r2.getProperty(r0).isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:112:0x02e9, code lost:
            r4.f13101a.mo32766m((java.lang.Long) r2.getValue(r0));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:113:0x02f6, code lost:
            r4 = r24;
            r2 = r25;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:114:0x0302, code lost:
            if (r2.getProperty(r0).isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:115:0x0304, code lost:
            r4.f13101a.mo32764k((java.lang.Long) r2.getValue(r0));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:116:0x0311, code lost:
            r4 = r24;
            r2 = r25;
            r0 = r18;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:117:0x031f, code lost:
            if (r2.getProperty(r0).isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:118:0x0321, code lost:
            r4.f13101a.mo32762i((java.lang.String) r2.getValue(r0));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:119:0x032e, code lost:
            r4 = r24;
            r2 = r25;
            r0 = r19;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:120:0x033c, code lost:
            if (r2.getProperty(r0).isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:121:0x033e, code lost:
            r4.f13101a.mo32771r((java.lang.Long) r2.getValue(r0));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:122:0x034a, code lost:
            r4 = r24;
            r2 = r25;
            r0 = r20;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:123:0x0358, code lost:
            if (r2.getProperty(r0).isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:124:0x035a, code lost:
            r4.f13101a.mo32758e((java.lang.String) r2.getValue(r0));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:125:0x0366, code lost:
            r4 = r24;
            r2 = r25;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:126:0x0372, code lost:
            if (r2.getProperty(r3).isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:127:0x0374, code lost:
            r4.f13101a.mo32765l((java.lang.Long) r2.getValue(r3));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:128:0x0380, code lost:
            r4 = r24;
            r2 = r25;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:129:0x038c, code lost:
            if (r2.getProperty("SaveState").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:130:0x038e, code lost:
            r4.f13101a.mo32756c((java.lang.Long) r2.getValue("SaveState"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:131:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:132:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:133:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:134:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:135:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:136:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:137:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:138:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:139:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:140:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:141:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:142:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:143:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:144:?, code lost:
            return;
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
        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0046, code lost:
            r3 = r21;
            r23 = r16;
            r16 = "Ct";
            r0 = r17;
            r17 = r23;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:0x00f7, code lost:
            r17 = r3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:62:0x013b, code lost:
            r3 = r21;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:69:0x0165, code lost:
            switch(r22) {
                case 0: goto L_0x0380;
                case 1: goto L_0x0366;
                case 2: goto L_0x034a;
                case 3: goto L_0x032e;
                case 4: goto L_0x0311;
                case 5: goto L_0x02f6;
                case 6: goto L_0x02d9;
                case 7: goto L_0x02bc;
                case 8: goto L_0x02a1;
                case 9: goto L_0x0286;
                case 10: goto L_0x026b;
                case 11: goto L_0x024c;
                case 12: goto L_0x0231;
                case 13: goto L_0x0216;
                case 14: goto L_0x01fb;
                case 15: goto L_0x01dc;
                case 16: goto L_0x01c1;
                case 17: goto L_0x01a2;
                case 18: goto L_0x0187;
                case 19: goto L_0x016c;
                default: goto L_0x0168;
            };
         */
        /* JADX WARNING: Code restructure failed: missing block: B:70:0x0168, code lost:
            r4 = r24;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:71:0x016c, code lost:
            r2 = r25;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:72:0x0176, code lost:
            if (r2.getProperty("Bright").isValueValid() == false) goto L_0x0168;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:73:0x0178, code lost:
            r24.f13101a.mo32754a((java.lang.Long) r2.getValue("Bright"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:74:0x0187, code lost:
            r4 = r24;
            r2 = r25;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:75:0x0193, code lost:
            if (r2.getProperty("BgFlowParams").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:76:0x0195, code lost:
            r4.f13101a.mo32770q((java.lang.String) r2.getValue("BgFlowParams"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:77:0x01a2, code lost:
            r4 = r24;
            r2 = r25;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:78:0x01ae, code lost:
            if (r2.getProperty("MainPower").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:79:0x01b0, code lost:
            r4.f13101a.mo32769p(com.yeelight.yeelib.device.xiaomi.Ceiling4Service.MainPower.valueOf((java.lang.String) r2.getValue("MainPower")));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:80:0x01c1, code lost:
            r4 = r24;
            r2 = r25;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:81:0x01cd, code lost:
            if (r2.getProperty("LanMode").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:82:0x01cf, code lost:
            r4.f13101a.mo32760g((java.lang.Long) r2.getValue("LanMode"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:83:0x01dc, code lost:
            r4 = r24;
            r2 = r25;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:84:0x01e8, code lost:
            if (r2.getProperty("BgPower").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:85:0x01ea, code lost:
            r4.f13101a.mo32773t(com.yeelight.yeelib.device.xiaomi.Ceiling4Service.BgPower.valueOf((java.lang.String) r2.getValue("BgPower")));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:86:0x01fb, code lost:
            r4 = r24;
            r2 = r25;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:87:0x0207, code lost:
            if (r2.getProperty("BgFlowing").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:88:0x0209, code lost:
            r4.f13101a.mo32772s((java.lang.Long) r2.getValue("BgFlowing"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:89:0x0216, code lost:
            r4 = r24;
            r2 = r25;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:90:0x0222, code lost:
            if (r2.getProperty("Flowing").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:91:0x0224, code lost:
            r4.f13101a.mo32757d((java.lang.Long) r2.getValue("Flowing"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:92:0x0231, code lost:
            r4 = r24;
            r2 = r25;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:93:0x023d, code lost:
            if (r2.getProperty("DelayOff").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:94:0x023f, code lost:
            r4.f13101a.mo32755b((java.lang.Long) r2.getValue("DelayOff"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:95:0x024c, code lost:
            r4 = r24;
            r2 = r25;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:96:0x0258, code lost:
            if (r2.getProperty("Power").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:97:0x025a, code lost:
            r4.f13101a.mo32768o(com.yeelight.yeelib.device.xiaomi.Ceiling4Service.Power.valueOf((java.lang.String) r2.getValue("Power")));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:98:0x026b, code lost:
            r4 = r24;
            r2 = r25;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:99:0x0277, code lost:
            if (r2.getProperty("BgRgb").isValueValid() == false) goto L_?;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onPropertyChanged(com.miot.common.device.invocation.PropertyInfo r25, java.lang.String r26) {
            /*
                r24 = this;
                r0 = r24
                r1 = r25
                r2 = r26
                r26.hashCode()
                int r3 = r26.hashCode()
                java.lang.String r4 = "Bright"
                java.lang.String r5 = "BgFlowParams"
                java.lang.String r6 = "MainPower"
                java.lang.String r7 = "LanMode"
                java.lang.String r8 = "BgPower"
                java.lang.String r9 = "BgFlowing"
                java.lang.String r10 = "Flowing"
                java.lang.String r11 = "DelayOff"
                java.lang.String r12 = "Power"
                java.lang.String r13 = "BgRgb"
                java.lang.String r14 = "onFromPower"
                java.lang.String r15 = "BgCt"
                java.lang.String r0 = "Ct"
                java.lang.String r1 = "MiBandSleep"
                r16 = r1
                java.lang.String r1 = "NLBright"
                r17 = r1
                java.lang.String r1 = "NightTimeInfo"
                r18 = r1
                java.lang.String r1 = "BgProact"
                r19 = r1
                java.lang.String r1 = "FlowParams"
                r20 = r1
                java.lang.String r1 = "BgBright"
                r21 = r1
                java.lang.String r1 = "SaveState"
                r22 = -1
                switch(r3) {
                    case -2117953292: goto L_0x0152;
                    case -2017000513: goto L_0x013e;
                    case -2002016140: goto L_0x0126;
                    case -1616019574: goto L_0x0110;
                    case -1331143373: goto L_0x00fa;
                    case -770908584: goto L_0x00e8;
                    case -80340154: goto L_0x00d8;
                    case 2193: goto L_0x00cc;
                    case 2067382: goto L_0x00c0;
                    case 35911772: goto L_0x00b6;
                    case 64102952: goto L_0x00ac;
                    case 77306085: goto L_0x00a2;
                    case 880790796: goto L_0x0098;
                    case 898856916: goto L_0x008e;
                    case 986784719: goto L_0x0084;
                    case 1471809440: goto L_0x007a;
                    case 1611821756: goto L_0x0070;
                    case 1738956460: goto L_0x0066;
                    case 1820079769: goto L_0x005c;
                    case 1998035738: goto L_0x0052;
                    default: goto L_0x0046;
                }
            L_0x0046:
                r3 = r21
                r23 = r16
                r16 = r0
                r0 = r17
                r17 = r23
                goto L_0x0165
            L_0x0052:
                boolean r2 = r2.equals(r4)
                if (r2 != 0) goto L_0x0059
                goto L_0x0046
            L_0x0059:
                r22 = 19
                goto L_0x0046
            L_0x005c:
                boolean r2 = r2.equals(r5)
                if (r2 != 0) goto L_0x0063
                goto L_0x0046
            L_0x0063:
                r22 = 18
                goto L_0x0046
            L_0x0066:
                boolean r2 = r2.equals(r6)
                if (r2 != 0) goto L_0x006d
                goto L_0x0046
            L_0x006d:
                r22 = 17
                goto L_0x0046
            L_0x0070:
                boolean r2 = r2.equals(r7)
                if (r2 != 0) goto L_0x0077
                goto L_0x0046
            L_0x0077:
                r22 = 16
                goto L_0x0046
            L_0x007a:
                boolean r2 = r2.equals(r8)
                if (r2 != 0) goto L_0x0081
                goto L_0x0046
            L_0x0081:
                r22 = 15
                goto L_0x0046
            L_0x0084:
                boolean r2 = r2.equals(r9)
                if (r2 != 0) goto L_0x008b
                goto L_0x0046
            L_0x008b:
                r22 = 14
                goto L_0x0046
            L_0x008e:
                boolean r2 = r2.equals(r10)
                if (r2 != 0) goto L_0x0095
                goto L_0x0046
            L_0x0095:
                r22 = 13
                goto L_0x0046
            L_0x0098:
                boolean r2 = r2.equals(r11)
                if (r2 != 0) goto L_0x009f
                goto L_0x0046
            L_0x009f:
                r22 = 12
                goto L_0x0046
            L_0x00a2:
                boolean r2 = r2.equals(r12)
                if (r2 != 0) goto L_0x00a9
                goto L_0x0046
            L_0x00a9:
                r22 = 11
                goto L_0x0046
            L_0x00ac:
                boolean r2 = r2.equals(r13)
                if (r2 != 0) goto L_0x00b3
                goto L_0x0046
            L_0x00b3:
                r22 = 10
                goto L_0x0046
            L_0x00b6:
                boolean r2 = r2.equals(r14)
                if (r2 != 0) goto L_0x00bd
                goto L_0x0046
            L_0x00bd:
                r22 = 9
                goto L_0x0046
            L_0x00c0:
                boolean r2 = r2.equals(r15)
                if (r2 != 0) goto L_0x00c8
                goto L_0x0046
            L_0x00c8:
                r22 = 8
                goto L_0x0046
            L_0x00cc:
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L_0x00d4
                goto L_0x0046
            L_0x00d4:
                r22 = 7
                goto L_0x0046
            L_0x00d8:
                r3 = r16
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L_0x00e1
                goto L_0x00e3
            L_0x00e1:
                r22 = 6
            L_0x00e3:
                r16 = r0
                r0 = r17
                goto L_0x00f7
            L_0x00e8:
                r3 = r16
                r16 = r0
                r0 = r17
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L_0x00f5
                goto L_0x00f7
            L_0x00f5:
                r22 = 5
            L_0x00f7:
                r17 = r3
                goto L_0x013b
            L_0x00fa:
                r3 = r18
                r23 = r16
                r16 = r0
                r0 = r17
                r17 = r23
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L_0x010b
                goto L_0x010d
            L_0x010b:
                r22 = 4
            L_0x010d:
                r18 = r3
                goto L_0x013b
            L_0x0110:
                r3 = r19
                r23 = r16
                r16 = r0
                r0 = r17
                r17 = r23
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L_0x0121
                goto L_0x0123
            L_0x0121:
                r22 = 3
            L_0x0123:
                r19 = r3
                goto L_0x013b
            L_0x0126:
                r3 = r20
                r23 = r16
                r16 = r0
                r0 = r17
                r17 = r23
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L_0x0137
                goto L_0x0139
            L_0x0137:
                r22 = 2
            L_0x0139:
                r20 = r3
            L_0x013b:
                r3 = r21
                goto L_0x0165
            L_0x013e:
                r3 = r21
                r23 = r16
                r16 = r0
                r0 = r17
                r17 = r23
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L_0x014f
                goto L_0x0165
            L_0x014f:
                r22 = 1
                goto L_0x0165
            L_0x0152:
                r3 = r21
                r23 = r16
                r16 = r0
                r0 = r17
                r17 = r23
                boolean r2 = r2.equals(r1)
                if (r2 != 0) goto L_0x0163
                goto L_0x0165
            L_0x0163:
                r22 = 0
            L_0x0165:
                switch(r22) {
                    case 0: goto L_0x0380;
                    case 1: goto L_0x0366;
                    case 2: goto L_0x034a;
                    case 3: goto L_0x032e;
                    case 4: goto L_0x0311;
                    case 5: goto L_0x02f6;
                    case 6: goto L_0x02d9;
                    case 7: goto L_0x02bc;
                    case 8: goto L_0x02a1;
                    case 9: goto L_0x0286;
                    case 10: goto L_0x026b;
                    case 11: goto L_0x024c;
                    case 12: goto L_0x0231;
                    case 13: goto L_0x0216;
                    case 14: goto L_0x01fb;
                    case 15: goto L_0x01dc;
                    case 16: goto L_0x01c1;
                    case 17: goto L_0x01a2;
                    case 18: goto L_0x0187;
                    case 19: goto L_0x016c;
                    default: goto L_0x0168;
                }
            L_0x0168:
                r4 = r24
                goto L_0x0399
            L_0x016c:
                r2 = r25
                com.miot.common.property.Property r0 = r2.getProperty(r4)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0168
                java.lang.Object r0 = r2.getValue(r4)
                java.lang.Long r0 = (java.lang.Long) r0
                r4 = r24
                com.yeelight.yeelib.device.xiaomi.Ceiling4Service$s1 r1 = r4.f13101a
                r1.mo32754a(r0)
                goto L_0x0399
            L_0x0187:
                r4 = r24
                r2 = r25
                com.miot.common.property.Property r0 = r2.getProperty(r5)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0399
                java.lang.Object r0 = r2.getValue(r5)
                java.lang.String r0 = (java.lang.String) r0
                com.yeelight.yeelib.device.xiaomi.Ceiling4Service$s1 r1 = r4.f13101a
                r1.mo32770q(r0)
                goto L_0x0399
            L_0x01a2:
                r4 = r24
                r2 = r25
                com.miot.common.property.Property r0 = r2.getProperty(r6)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0399
                java.lang.Object r0 = r2.getValue(r6)
                java.lang.String r0 = (java.lang.String) r0
                com.yeelight.yeelib.device.xiaomi.Ceiling4Service$MainPower r0 = com.yeelight.yeelib.device.xiaomi.Ceiling4Service.MainPower.valueOf(r0)
                com.yeelight.yeelib.device.xiaomi.Ceiling4Service$s1 r1 = r4.f13101a
                r1.mo32769p(r0)
                goto L_0x0399
            L_0x01c1:
                r4 = r24
                r2 = r25
                com.miot.common.property.Property r0 = r2.getProperty(r7)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0399
                java.lang.Object r0 = r2.getValue(r7)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Ceiling4Service$s1 r1 = r4.f13101a
                r1.mo32760g(r0)
                goto L_0x0399
            L_0x01dc:
                r4 = r24
                r2 = r25
                com.miot.common.property.Property r0 = r2.getProperty(r8)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0399
                java.lang.Object r0 = r2.getValue(r8)
                java.lang.String r0 = (java.lang.String) r0
                com.yeelight.yeelib.device.xiaomi.Ceiling4Service$BgPower r0 = com.yeelight.yeelib.device.xiaomi.Ceiling4Service.BgPower.valueOf(r0)
                com.yeelight.yeelib.device.xiaomi.Ceiling4Service$s1 r1 = r4.f13101a
                r1.mo32773t(r0)
                goto L_0x0399
            L_0x01fb:
                r4 = r24
                r2 = r25
                com.miot.common.property.Property r0 = r2.getProperty(r9)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0399
                java.lang.Object r0 = r2.getValue(r9)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Ceiling4Service$s1 r1 = r4.f13101a
                r1.mo32772s(r0)
                goto L_0x0399
            L_0x0216:
                r4 = r24
                r2 = r25
                com.miot.common.property.Property r0 = r2.getProperty(r10)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0399
                java.lang.Object r0 = r2.getValue(r10)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Ceiling4Service$s1 r1 = r4.f13101a
                r1.mo32757d(r0)
                goto L_0x0399
            L_0x0231:
                r4 = r24
                r2 = r25
                com.miot.common.property.Property r0 = r2.getProperty(r11)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0399
                java.lang.Object r0 = r2.getValue(r11)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Ceiling4Service$s1 r1 = r4.f13101a
                r1.mo32755b(r0)
                goto L_0x0399
            L_0x024c:
                r4 = r24
                r2 = r25
                com.miot.common.property.Property r0 = r2.getProperty(r12)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0399
                java.lang.Object r0 = r2.getValue(r12)
                java.lang.String r0 = (java.lang.String) r0
                com.yeelight.yeelib.device.xiaomi.Ceiling4Service$Power r0 = com.yeelight.yeelib.device.xiaomi.Ceiling4Service.Power.valueOf(r0)
                com.yeelight.yeelib.device.xiaomi.Ceiling4Service$s1 r1 = r4.f13101a
                r1.mo32768o(r0)
                goto L_0x0399
            L_0x026b:
                r4 = r24
                r2 = r25
                com.miot.common.property.Property r0 = r2.getProperty(r13)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0399
                java.lang.Object r0 = r2.getValue(r13)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Ceiling4Service$s1 r1 = r4.f13101a
                r1.mo32767n(r0)
                goto L_0x0399
            L_0x0286:
                r4 = r24
                r2 = r25
                com.miot.common.property.Property r0 = r2.getProperty(r14)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0399
                java.lang.Object r0 = r2.getValue(r14)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Ceiling4Service$s1 r1 = r4.f13101a
                r1.mo32759f(r0)
                goto L_0x0399
            L_0x02a1:
                r4 = r24
                r2 = r25
                com.miot.common.property.Property r0 = r2.getProperty(r15)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0399
                java.lang.Object r0 = r2.getValue(r15)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Ceiling4Service$s1 r1 = r4.f13101a
                r1.mo32763j(r0)
                goto L_0x0399
            L_0x02bc:
                r4 = r24
                r2 = r25
                r0 = r16
                com.miot.common.property.Property r1 = r2.getProperty(r0)
                boolean r1 = r1.isValueValid()
                if (r1 == 0) goto L_0x0399
                java.lang.Object r0 = r2.getValue(r0)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Ceiling4Service$s1 r1 = r4.f13101a
                r1.mo32761h(r0)
                goto L_0x0399
            L_0x02d9:
                r4 = r24
                r2 = r25
                r0 = r17
                com.miot.common.property.Property r1 = r2.getProperty(r0)
                boolean r1 = r1.isValueValid()
                if (r1 == 0) goto L_0x0399
                java.lang.Object r0 = r2.getValue(r0)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Ceiling4Service$s1 r1 = r4.f13101a
                r1.mo32766m(r0)
                goto L_0x0399
            L_0x02f6:
                r4 = r24
                r2 = r25
                com.miot.common.property.Property r1 = r2.getProperty(r0)
                boolean r1 = r1.isValueValid()
                if (r1 == 0) goto L_0x0399
                java.lang.Object r0 = r2.getValue(r0)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Ceiling4Service$s1 r1 = r4.f13101a
                r1.mo32764k(r0)
                goto L_0x0399
            L_0x0311:
                r4 = r24
                r2 = r25
                r0 = r18
                com.miot.common.property.Property r1 = r2.getProperty(r0)
                boolean r1 = r1.isValueValid()
                if (r1 == 0) goto L_0x0399
                java.lang.Object r0 = r2.getValue(r0)
                java.lang.String r0 = (java.lang.String) r0
                com.yeelight.yeelib.device.xiaomi.Ceiling4Service$s1 r1 = r4.f13101a
                r1.mo32762i(r0)
                goto L_0x0399
            L_0x032e:
                r4 = r24
                r2 = r25
                r0 = r19
                com.miot.common.property.Property r1 = r2.getProperty(r0)
                boolean r1 = r1.isValueValid()
                if (r1 == 0) goto L_0x0399
                java.lang.Object r0 = r2.getValue(r0)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Ceiling4Service$s1 r1 = r4.f13101a
                r1.mo32771r(r0)
                goto L_0x0399
            L_0x034a:
                r4 = r24
                r2 = r25
                r0 = r20
                com.miot.common.property.Property r1 = r2.getProperty(r0)
                boolean r1 = r1.isValueValid()
                if (r1 == 0) goto L_0x0399
                java.lang.Object r0 = r2.getValue(r0)
                java.lang.String r0 = (java.lang.String) r0
                com.yeelight.yeelib.device.xiaomi.Ceiling4Service$s1 r1 = r4.f13101a
                r1.mo32758e(r0)
                goto L_0x0399
            L_0x0366:
                r4 = r24
                r2 = r25
                com.miot.common.property.Property r0 = r2.getProperty(r3)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0399
                java.lang.Object r0 = r2.getValue(r3)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Ceiling4Service$s1 r1 = r4.f13101a
                r1.mo32765l(r0)
                goto L_0x0399
            L_0x0380:
                r4 = r24
                r2 = r25
                com.miot.common.property.Property r0 = r2.getProperty(r1)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0399
                java.lang.Object r0 = r2.getValue(r1)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Ceiling4Service$s1 r1 = r4.f13101a
                r1.mo32756c(r0)
            L_0x0399:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.xiaomi.Ceiling4Service.C6739v.onPropertyChanged(com.miot.common.device.invocation.PropertyInfo, java.lang.String):void");
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$v0 */
    class C6740v0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6692e1 f13102a;

        C6740v0(Ceiling4Service ceiling4Service, C6692e1 e1Var) {
            this.f13102a = e1Var;
        }

        public void onFailed(int i, String str) {
            this.f13102a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Bright");
            if (property.isValueValid()) {
                this.f13102a.mo32726a((Long) propertyInfo.getValue("Bright"));
                return;
            }
            C6692e1 e1Var = this.f13102a;
            e1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$w */
    class C6741w implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13103a;

        C6741w(Ceiling4Service ceiling4Service, CompletionHandler completionHandler) {
            this.f13103a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13103a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13103a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$w0 */
    class C6742w0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6744x0 f13104a;

        C6742w0(Ceiling4Service ceiling4Service, C6744x0 x0Var) {
            this.f13104a = x0Var;
        }

        public void onFailed(int i, String str) {
            this.f13104a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("BgBright");
            if (property.isValueValid()) {
                this.f13104a.mo32774a((Long) propertyInfo.getValue("BgBright"));
                return;
            }
            C6744x0 x0Var = this.f13104a;
            x0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$x */
    class C6743x implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13105a;

        C6743x(Ceiling4Service ceiling4Service, CompletionHandler completionHandler) {
            this.f13105a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13105a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13105a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$x0 */
    public interface C6744x0 {
        /* renamed from: a */
        void mo32774a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$y */
    class C6745y implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13106a;

        C6745y(Ceiling4Service ceiling4Service, CompletionHandler completionHandler) {
            this.f13106a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13106a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13106a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$y0 */
    public interface C6746y0 {
        /* renamed from: a */
        void mo32776a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$z */
    class C6747z implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13107a;

        C6747z(Ceiling4Service ceiling4Service, CompletionHandler completionHandler) {
            this.f13107a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13107a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13107a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$z0 */
    public interface C6748z0 {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    public Ceiling4Service(AbstractDevice abstractDevice) {
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
                MiotManager.getDeviceManipulator().invoke(create, new C6743x(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6706j0(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getBgBright(C6744x0 x0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "BgBright"), new C6742w0(this, x0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getBgCt(C6746y0 y0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "BgCt"), new C6681b(this, y0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getBgFlowParams(C6748z0 z0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "BgFlowParams"), new C6690e(this, z0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getBgFlowing(C6680a1 a1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "BgFlowing"), new C6720o(this, a1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getBgPower(C6683b1 b1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "BgPower"), new C6738u0(this, b1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getBgProact(C6686c1 c1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "BgProact"), new C6723p(this, c1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getBgRgb(C6689d1 d1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "BgRgb"), new C6714m(this, d1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getBright(C6692e1 e1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Bright"), new C6740v0(this, e1Var));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6727q0(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getCt(C6695f1 f1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Ct"), new C6678a(this, f1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getDelayOff(C6698g1 g1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "DelayOff"), new C6684c(this, g1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowParams(C6701h1 h1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "FlowParams"), new C6687d(this, h1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowing(C6704i1 i1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Flowing"), new C6717n(this, i1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getLanMode(C6707j1 j1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "LanMode"), new C6693f(this, j1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getMainPower(C6710k1 k1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "MainPower"), new C6733s0(this, k1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getMiBandSleep(C6713l1 l1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "MiBandSleep"), new C6711l(this, l1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getNLBright(C6716m1 m1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "NLBright"), new C6702i(this, m1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getNightTimeInfo(C6719n1 n1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "NightTimeInfo"), new C6705j(this, n1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getPower(C6722o1 o1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Power"), new C6736t0(this, o1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getProperties(C6725p1 p1Var) {
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
            create.addProperty(getService().getProperty("onFromPower"));
            create.addProperty(getService().getProperty("NLBright"));
            create.addProperty(getService().getProperty("NightTimeInfo"));
            create.addProperty(getService().getProperty("MiBandSleep"));
            create.addProperty(getService().getProperty("BgRgb"));
            create.addProperty(getService().getProperty("Flowing"));
            create.addProperty(getService().getProperty("BgFlowing"));
            create.addProperty(getService().getProperty("BgProact"));
            MiotManager.getDeviceManipulator().readProperty(create, new C6730r0(this, p1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getSaveState(C6728q1 q1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "SaveState"), new C6696g(this, q1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getonFromPower(C6731r1 r1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "onFromPower"), new C6699h(this, r1Var));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6741w(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6735t(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6709k0(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6679a0(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setBgBright(Long l, Effect effect, Long l2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setBgBright");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("BgBright", l)) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Effect", effect.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("Duration", l2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C6700h0(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setBgCt(Long l, Effect effect, Long l2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setBgCt");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("BgCt", l)) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Effect", effect.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("Duration", l2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C6745y(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6691e0(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6726q(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setBgRgb(Long l, Effect effect, Long l2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setBgRgb");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("BgRgb", l)) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Effect", effect.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("Duration", l2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C6732s(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6703i0(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6729r(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6724p0(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6721o0(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6715m0(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6685c0(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6747z(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6737u(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6712l0(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6688d0(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6682b0(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6694f0(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void subscribeNotifications(CompletionHandler completionHandler, C6734s1 s1Var) {
        if (completionHandler == null) {
            throw new IllegalArgumentException("handler is null");
        } else if (s1Var != null) {
            PropertyInfo create = PropertyInfoFactory.create(getService());
            for (Property next : getService().getProperties()) {
                if (next.getDefinition().isNotifiable()) {
                    create.addProperty(next);
                }
            }
            MiotManager.getDeviceManipulator().addPropertyChangedListener(create, new C6708k(this, completionHandler), new C6739v(this, s1Var));
        } else {
            throw new IllegalArgumentException("listener is null");
        }
    }

    public void toggle(CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "toggle");
            if (create != null) {
                MiotManager.getDeviceManipulator().invoke(create, new C6718n0(this, completionHandler));
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
            MiotManager.getDeviceManipulator().removePropertyChangedListener(create, new C6697g0(this, completionHandler));
            return;
        }
        throw new IllegalArgumentException("handler is null");
    }
}
