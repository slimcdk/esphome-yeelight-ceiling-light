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

public class Ceiling19Service extends AbstractService {
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
    public static final String PROPERTY_SmartSwitch = "SmartSwitch";
    public static final String PROPERTY_adjustAction = "adjustAction";
    public static final String PROPERTY_adjustProper = "adjustProper";
    public static final String PROPERTY_onFromPower = "onFromPower";
    private static final String TAG = "Ceiling19Service";
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
        cfg_smart_switch
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

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$a */
    class C6464a implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6484g1 f12907a;

        C6464a(Ceiling19Service ceiling19Service, C6484g1 g1Var) {
            this.f12907a = g1Var;
        }

        public void onFailed(int i, String str) {
            this.f12907a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Ct");
            if (property.isValueValid()) {
                this.f12907a.mo32401a((Long) propertyInfo.getValue("Ct"));
                return;
            }
            C6484g1 g1Var = this.f12907a;
            g1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$a0 */
    class C6465a0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12908a;

        C6465a0(Ceiling19Service ceiling19Service, CompletionHandler completionHandler) {
            this.f12908a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12908a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12908a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$a1 */
    public interface C6466a1 {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$b */
    class C6467b implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6536z0 f12909a;

        C6467b(Ceiling19Service ceiling19Service, C6536z0 z0Var) {
            this.f12909a = z0Var;
        }

        public void onFailed(int i, String str) {
            this.f12909a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("BgCt");
            if (property.isValueValid()) {
                this.f12909a.mo32452a((Long) propertyInfo.getValue("BgCt"));
                return;
            }
            C6536z0 z0Var = this.f12909a;
            z0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$b0 */
    class C6468b0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12910a;

        C6468b0(Ceiling19Service ceiling19Service, CompletionHandler completionHandler) {
            this.f12910a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12910a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12910a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$b1 */
    public interface C6469b1 {
        /* renamed from: a */
        void mo32391a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$c */
    class C6470c implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6487h1 f12911a;

        C6470c(Ceiling19Service ceiling19Service, C6487h1 h1Var) {
            this.f12911a = h1Var;
        }

        public void onFailed(int i, String str) {
            this.f12911a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("DelayOff");
            if (property.isValueValid()) {
                this.f12911a.mo32403a((Long) propertyInfo.getValue("DelayOff"));
                return;
            }
            C6487h1 h1Var = this.f12911a;
            h1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$c0 */
    class C6471c0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12912a;

        C6471c0(Ceiling19Service ceiling19Service, CompletionHandler completionHandler) {
            this.f12912a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12912a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12912a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$c1 */
    public interface C6472c1 {
        /* renamed from: a */
        void mo32393a(BgPower bgPower);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$d */
    class C6473d implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6490i1 f12913a;

        C6473d(Ceiling19Service ceiling19Service, C6490i1 i1Var) {
            this.f12913a = i1Var;
        }

        public void onFailed(int i, String str) {
            this.f12913a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("FlowParams");
            if (property.isValueValid()) {
                this.f12913a.onSucceed((String) propertyInfo.getValue("FlowParams"));
                return;
            }
            C6490i1 i1Var = this.f12913a;
            i1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$d0 */
    class C6474d0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12914a;

        C6474d0(Ceiling19Service ceiling19Service, CompletionHandler completionHandler) {
            this.f12914a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12914a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12914a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$d1 */
    public interface C6475d1 {
        /* renamed from: a */
        void mo32395a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$e */
    class C6476e implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6466a1 f12915a;

        C6476e(Ceiling19Service ceiling19Service, C6466a1 a1Var) {
            this.f12915a = a1Var;
        }

        public void onFailed(int i, String str) {
            this.f12915a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("BgFlowParams");
            if (property.isValueValid()) {
                this.f12915a.onSucceed((String) propertyInfo.getValue("BgFlowParams"));
                return;
            }
            C6466a1 a1Var = this.f12915a;
            a1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$e0 */
    class C6477e0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12916a;

        C6477e0(Ceiling19Service ceiling19Service, CompletionHandler completionHandler) {
            this.f12916a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12916a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12916a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$e1 */
    public interface C6478e1 {
        /* renamed from: a */
        void mo32397a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$f */
    class C6479f implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6496k1 f12917a;

        C6479f(Ceiling19Service ceiling19Service, C6496k1 k1Var) {
            this.f12917a = k1Var;
        }

        public void onFailed(int i, String str) {
            this.f12917a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("LanMode");
            if (property.isValueValid()) {
                this.f12917a.mo32409a((Long) propertyInfo.getValue("LanMode"));
                return;
            }
            C6496k1 k1Var = this.f12917a;
            k1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$f0 */
    class C6480f0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12918a;

        C6480f0(Ceiling19Service ceiling19Service, CompletionHandler completionHandler) {
            this.f12918a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12918a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12918a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$f1 */
    public interface C6481f1 {
        /* renamed from: a */
        void mo32399a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$g */
    class C6482g implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6517r1 f12919a;

        C6482g(Ceiling19Service ceiling19Service, C6517r1 r1Var) {
            this.f12919a = r1Var;
        }

        public void onFailed(int i, String str) {
            this.f12919a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("SaveState");
            if (property.isValueValid()) {
                this.f12919a.mo32423a((Long) propertyInfo.getValue("SaveState"));
                return;
            }
            C6517r1 r1Var = this.f12919a;
            r1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$g0 */
    class C6483g0 implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12920a;

        C6483g0(Ceiling19Service ceiling19Service, CompletionHandler completionHandler) {
            this.f12920a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12920a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f12920a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$g1 */
    public interface C6484g1 {
        /* renamed from: a */
        void mo32401a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$h */
    class C6485h implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6523t1 f12921a;

        C6485h(Ceiling19Service ceiling19Service, C6523t1 t1Var) {
            this.f12921a = t1Var;
        }

        public void onFailed(int i, String str) {
            this.f12921a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("onFromPower");
            if (property.isValueValid()) {
                this.f12921a.mo32427a((Long) propertyInfo.getValue("onFromPower"));
                return;
            }
            C6523t1 t1Var = this.f12921a;
            t1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$h0 */
    class C6486h0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12922a;

        C6486h0(Ceiling19Service ceiling19Service, CompletionHandler completionHandler) {
            this.f12922a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12922a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12922a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$h1 */
    public interface C6487h1 {
        /* renamed from: a */
        void mo32403a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$i */
    class C6488i implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6505n1 f12923a;

        C6488i(Ceiling19Service ceiling19Service, C6505n1 n1Var) {
            this.f12923a = n1Var;
        }

        public void onFailed(int i, String str) {
            this.f12923a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("NLBright");
            if (property.isValueValid()) {
                this.f12923a.mo32415a((Long) propertyInfo.getValue("NLBright"));
                return;
            }
            C6505n1 n1Var = this.f12923a;
            n1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$i0 */
    class C6489i0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12924a;

        C6489i0(Ceiling19Service ceiling19Service, CompletionHandler completionHandler) {
            this.f12924a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12924a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12924a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$i1 */
    public interface C6490i1 {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$j */
    class C6491j implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6508o1 f12925a;

        C6491j(Ceiling19Service ceiling19Service, C6508o1 o1Var) {
            this.f12925a = o1Var;
        }

        public void onFailed(int i, String str) {
            this.f12925a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("NightTimeInfo");
            if (property.isValueValid()) {
                this.f12925a.onSucceed((String) propertyInfo.getValue("NightTimeInfo"));
                return;
            }
            C6508o1 o1Var = this.f12925a;
            o1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$j0 */
    class C6492j0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12926a;

        C6492j0(Ceiling19Service ceiling19Service, CompletionHandler completionHandler) {
            this.f12926a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12926a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12926a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$j1 */
    public interface C6493j1 {
        /* renamed from: a */
        void mo32407a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$k */
    class C6494k implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12927a;

        C6494k(Ceiling19Service ceiling19Service, CompletionHandler completionHandler) {
            this.f12927a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12927a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f12927a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$k0 */
    class C6495k0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12928a;

        C6495k0(Ceiling19Service ceiling19Service, CompletionHandler completionHandler) {
            this.f12928a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12928a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12928a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$k1 */
    public interface C6496k1 {
        /* renamed from: a */
        void mo32409a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$l */
    class C6497l implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6502m1 f12929a;

        C6497l(Ceiling19Service ceiling19Service, C6502m1 m1Var) {
            this.f12929a = m1Var;
        }

        public void onFailed(int i, String str) {
            this.f12929a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("MiBandSleep");
            if (property.isValueValid()) {
                this.f12929a.mo32413a((Long) propertyInfo.getValue("MiBandSleep"));
                return;
            }
            C6502m1 m1Var = this.f12929a;
            m1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$l0 */
    class C6498l0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12930a;

        C6498l0(Ceiling19Service ceiling19Service, CompletionHandler completionHandler) {
            this.f12930a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12930a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12930a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$l1 */
    public interface C6499l1 {
        /* renamed from: a */
        void mo32411a(MainPower mainPower);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$m */
    class C6500m implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6478e1 f12931a;

        C6500m(Ceiling19Service ceiling19Service, C6478e1 e1Var) {
            this.f12931a = e1Var;
        }

        public void onFailed(int i, String str) {
            this.f12931a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("BgRgb");
            if (property.isValueValid()) {
                this.f12931a.mo32397a((Long) propertyInfo.getValue("BgRgb"));
                return;
            }
            C6478e1 e1Var = this.f12931a;
            e1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$m0 */
    class C6501m0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12932a;

        C6501m0(Ceiling19Service ceiling19Service, CompletionHandler completionHandler) {
            this.f12932a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12932a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12932a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$m1 */
    public interface C6502m1 {
        /* renamed from: a */
        void mo32413a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$n */
    class C6503n implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6493j1 f12933a;

        C6503n(Ceiling19Service ceiling19Service, C6493j1 j1Var) {
            this.f12933a = j1Var;
        }

        public void onFailed(int i, String str) {
            this.f12933a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Flowing");
            if (property.isValueValid()) {
                this.f12933a.mo32407a((Long) propertyInfo.getValue("Flowing"));
                return;
            }
            C6493j1 j1Var = this.f12933a;
            j1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$n0 */
    class C6504n0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12934a;

        C6504n0(Ceiling19Service ceiling19Service, CompletionHandler completionHandler) {
            this.f12934a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12934a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12934a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$n1 */
    public interface C6505n1 {
        /* renamed from: a */
        void mo32415a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$o */
    class C6506o implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6469b1 f12935a;

        C6506o(Ceiling19Service ceiling19Service, C6469b1 b1Var) {
            this.f12935a = b1Var;
        }

        public void onFailed(int i, String str) {
            this.f12935a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("BgFlowing");
            if (property.isValueValid()) {
                this.f12935a.mo32391a((Long) propertyInfo.getValue("BgFlowing"));
                return;
            }
            C6469b1 b1Var = this.f12935a;
            b1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$o0 */
    class C6507o0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12936a;

        C6507o0(Ceiling19Service ceiling19Service, CompletionHandler completionHandler) {
            this.f12936a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12936a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12936a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$o1 */
    public interface C6508o1 {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$p */
    class C6509p implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6475d1 f12937a;

        C6509p(Ceiling19Service ceiling19Service, C6475d1 d1Var) {
            this.f12937a = d1Var;
        }

        public void onFailed(int i, String str) {
            this.f12937a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("BgProact");
            if (property.isValueValid()) {
                this.f12937a.mo32395a((Long) propertyInfo.getValue("BgProact"));
                return;
            }
            C6475d1 d1Var = this.f12937a;
            d1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$p0 */
    class C6510p0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12938a;

        C6510p0(Ceiling19Service ceiling19Service, CompletionHandler completionHandler) {
            this.f12938a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12938a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12938a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$p1 */
    public interface C6511p1 {
        /* renamed from: a */
        void mo32419a(Power power);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$q */
    class C6512q implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6520s1 f12939a;

        C6512q(Ceiling19Service ceiling19Service, C6520s1 s1Var) {
            this.f12939a = s1Var;
        }

        public void onFailed(int i, String str) {
            this.f12939a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("SmartSwitch");
            if (property.isValueValid()) {
                this.f12939a.mo32425a((Long) propertyInfo.getValue("SmartSwitch"));
                return;
            }
            C6520s1 s1Var = this.f12939a;
            s1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$q0 */
    class C6513q0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12940a;

        C6513q0(Ceiling19Service ceiling19Service, CompletionHandler completionHandler) {
            this.f12940a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12940a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12940a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$q1 */
    public interface C6514q1 {
        /* renamed from: a */
        void mo32421a(MainPower mainPower, Power power, BgPower bgPower, Long l, Long l2, Long l3, Long l4, Long l5, String str, String str2, Long l6, Long l7, Long l8, Long l9, String str3, Long l10, Long l11, Long l12, Long l13, Long l14, Long l15);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$r */
    class C6515r implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12941a;

        C6515r(Ceiling19Service ceiling19Service, CompletionHandler completionHandler) {
            this.f12941a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12941a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12941a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$r0 */
    class C6516r0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6514q1 f12942a;

        C6516r0(Ceiling19Service ceiling19Service, C6514q1 q1Var) {
            this.f12942a = q1Var;
        }

        public void onFailed(int i, String str) {
            this.f12942a.onFailed(i, str);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.Long} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onSucceed(com.miot.common.device.invocation.PropertyInfo r27) {
            /*
                r26 = this;
                r0 = r27
                java.lang.String r1 = "MainPower"
                com.miot.common.property.Property r1 = r0.getProperty(r1)
                boolean r2 = r1.isValueValid()
                r3 = 0
                if (r2 == 0) goto L_0x001b
                java.lang.Object r1 = r1.getValue()
                java.lang.String r1 = (java.lang.String) r1
                com.yeelight.yeelib.device.xiaomi.Ceiling19Service$MainPower r1 = com.yeelight.yeelib.device.xiaomi.Ceiling19Service.MainPower.valueOf(r1)
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
                com.yeelight.yeelib.device.xiaomi.Ceiling19Service$Power r1 = com.yeelight.yeelib.device.xiaomi.Ceiling19Service.Power.valueOf(r1)
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
                com.yeelight.yeelib.device.xiaomi.Ceiling19Service$BgPower r1 = com.yeelight.yeelib.device.xiaomi.Ceiling19Service.BgPower.valueOf(r1)
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
                java.lang.String r1 = "SmartSwitch"
                com.miot.common.property.Property r0 = r0.getProperty(r1)
                boolean r1 = r0.isValueValid()
                if (r1 == 0) goto L_0x01d8
                java.lang.Object r0 = r0.getValue()
                r3 = r0
                java.lang.Long r3 = (java.lang.Long) r3
            L_0x01d8:
                r0 = r26
                r25 = r3
                com.yeelight.yeelib.device.xiaomi.Ceiling19Service$q1 r4 = r0.f12942a
                r4.mo32421a(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.xiaomi.Ceiling19Service.C6516r0.onSucceed(com.miot.common.device.invocation.PropertyInfo):void");
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$r1 */
    public interface C6517r1 {
        /* renamed from: a */
        void mo32423a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$s */
    class C6518s implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12943a;

        C6518s(Ceiling19Service ceiling19Service, CompletionHandler completionHandler) {
            this.f12943a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12943a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12943a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$s0 */
    class C6519s0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12944a;

        C6519s0(Ceiling19Service ceiling19Service, CompletionHandler completionHandler) {
            this.f12944a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12944a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12944a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$s1 */
    public interface C6520s1 {
        /* renamed from: a */
        void mo32425a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$t */
    class C6521t implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12945a;

        C6521t(Ceiling19Service ceiling19Service, CompletionHandler completionHandler) {
            this.f12945a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12945a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12945a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$t0 */
    class C6522t0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6499l1 f12946a;

        C6522t0(Ceiling19Service ceiling19Service, C6499l1 l1Var) {
            this.f12946a = l1Var;
        }

        public void onFailed(int i, String str) {
            this.f12946a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("MainPower");
            if (property.isValueValid()) {
                this.f12946a.mo32411a(MainPower.valueOf((String) propertyInfo.getValue("MainPower")));
                return;
            }
            C6499l1 l1Var = this.f12946a;
            l1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$t1 */
    public interface C6523t1 {
        /* renamed from: a */
        void mo32427a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$u */
    class C6524u implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12947a;

        C6524u(Ceiling19Service ceiling19Service, CompletionHandler completionHandler) {
            this.f12947a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12947a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12947a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$u0 */
    class C6525u0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6511p1 f12948a;

        C6525u0(Ceiling19Service ceiling19Service, C6511p1 p1Var) {
            this.f12948a = p1Var;
        }

        public void onFailed(int i, String str) {
            this.f12948a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Power");
            if (property.isValueValid()) {
                this.f12948a.mo32419a(Power.valueOf((String) propertyInfo.getValue("Power")));
                return;
            }
            C6511p1 p1Var = this.f12948a;
            p1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$u1 */
    public interface C6526u1 {
        /* renamed from: a */
        void mo32429a(Long l);

        /* renamed from: b */
        void mo32430b(Long l);

        /* renamed from: c */
        void mo32431c(Long l);

        /* renamed from: d */
        void mo32432d(Long l);

        /* renamed from: e */
        void mo32433e(String str);

        /* renamed from: f */
        void mo32434f(Long l);

        /* renamed from: g */
        void mo32435g(Long l);

        /* renamed from: h */
        void mo32436h(Long l);

        /* renamed from: i */
        void mo32437i(String str);

        /* renamed from: j */
        void mo32438j(Long l);

        /* renamed from: k */
        void mo32439k(Long l);

        /* renamed from: l */
        void mo32440l(Long l);

        /* renamed from: m */
        void mo32441m(Long l);

        /* renamed from: n */
        void mo32442n(Long l);

        /* renamed from: o */
        void mo32443o(Long l);

        /* renamed from: p */
        void mo32444p(MainPower mainPower);

        /* renamed from: q */
        void mo32445q(String str);

        /* renamed from: r */
        void mo32446r(Long l);

        /* renamed from: s */
        void mo32447s(Long l);

        /* renamed from: t */
        void mo32448t(BgPower bgPower);

        /* renamed from: u */
        void mo32449u(Power power);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$v */
    class C6527v implements DeviceManipulator.PropertyChangedListener {

        /* renamed from: a */
        final /* synthetic */ C6526u1 f12949a;

        C6527v(Ceiling19Service ceiling19Service, C6526u1 u1Var) {
            this.f12949a = u1Var;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:100:0x0273, code lost:
            if (r2.getProperty("DelayOff").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:101:0x0275, code lost:
            r4.f12949a.mo32430b((java.lang.Long) r2.getValue("DelayOff"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:102:0x0282, code lost:
            r4 = r25;
            r2 = r26;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:103:0x028e, code lost:
            if (r2.getProperty("Power").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:104:0x0290, code lost:
            r4.f12949a.mo32449u(com.yeelight.yeelib.device.xiaomi.Ceiling19Service.Power.valueOf((java.lang.String) r2.getValue("Power")));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:105:0x02a1, code lost:
            r4 = r25;
            r2 = r26;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:106:0x02ad, code lost:
            if (r2.getProperty("BgRgb").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:107:0x02af, code lost:
            r4.f12949a.mo32442n((java.lang.Long) r2.getValue("BgRgb"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:108:0x02bc, code lost:
            r4 = r25;
            r2 = r26;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:109:0x02c8, code lost:
            if (r2.getProperty("onFromPower").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:110:0x02ca, code lost:
            r4.f12949a.mo32434f((java.lang.Long) r2.getValue("onFromPower"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:111:0x02d7, code lost:
            r4 = r25;
            r2 = r26;
            r0 = r16;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:112:0x02e5, code lost:
            if (r2.getProperty(r0).isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:113:0x02e7, code lost:
            r4.f12949a.mo32438j((java.lang.Long) r2.getValue(r0));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:114:0x02f4, code lost:
            r4 = r25;
            r2 = r26;
            r0 = r17;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:115:0x0302, code lost:
            if (r2.getProperty(r0).isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:116:0x0304, code lost:
            r4.f12949a.mo32436h((java.lang.Long) r2.getValue(r0));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:117:0x0311, code lost:
            r4 = r25;
            r2 = r26;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:118:0x031d, code lost:
            if (r2.getProperty(r0).isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:119:0x031f, code lost:
            r4.f12949a.mo32441m((java.lang.Long) r2.getValue(r0));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:120:0x032c, code lost:
            r4 = r25;
            r2 = r26;
            r0 = r18;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:121:0x033a, code lost:
            if (r2.getProperty(r0).isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:122:0x033c, code lost:
            r4.f12949a.mo32439k((java.lang.Long) r2.getValue(r0));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:123:0x0349, code lost:
            r4 = r25;
            r2 = r26;
            r0 = r19;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:124:0x0357, code lost:
            if (r2.getProperty(r0).isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:125:0x0359, code lost:
            r4.f12949a.mo32437i((java.lang.String) r2.getValue(r0));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:126:0x0366, code lost:
            r4 = r25;
            r2 = r26;
            r0 = r20;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:127:0x0374, code lost:
            if (r2.getProperty(r0).isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:128:0x0376, code lost:
            r4.f12949a.mo32446r((java.lang.Long) r2.getValue(r0));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:129:0x0382, code lost:
            r4 = r25;
            r2 = r26;
            r0 = r21;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:130:0x0390, code lost:
            if (r2.getProperty(r0).isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:131:0x0392, code lost:
            r4.f12949a.mo32433e((java.lang.String) r2.getValue(r0));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:132:0x039e, code lost:
            r4 = r25;
            r2 = r26;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:133:0x03aa, code lost:
            if (r2.getProperty(r3).isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:134:0x03ac, code lost:
            r4.f12949a.mo32440l((java.lang.Long) r2.getValue(r3));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:135:0x03b8, code lost:
            r4 = r25;
            r2 = r26;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:136:0x03c4, code lost:
            if (r2.getProperty("SaveState").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:137:0x03c6, code lost:
            r4.f12949a.mo32431c((java.lang.Long) r2.getValue("SaveState"));
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
        /* JADX WARNING: Code restructure failed: missing block: B:2:0x004a, code lost:
            r3 = r22;
            r24 = r16;
            r16 = "BgCt";
            r0 = r17;
            r17 = r24;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:0x00fb, code lost:
            r17 = r3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:66:0x0156, code lost:
            r3 = r22;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:73:0x0180, code lost:
            switch(r23) {
                case 0: goto L_0x03b8;
                case 1: goto L_0x039e;
                case 2: goto L_0x0382;
                case 3: goto L_0x0366;
                case 4: goto L_0x0349;
                case 5: goto L_0x032c;
                case 6: goto L_0x0311;
                case 7: goto L_0x02f4;
                case 8: goto L_0x02d7;
                case 9: goto L_0x02bc;
                case 10: goto L_0x02a1;
                case 11: goto L_0x0282;
                case 12: goto L_0x0267;
                case 13: goto L_0x024c;
                case 14: goto L_0x0231;
                case 15: goto L_0x0216;
                case 16: goto L_0x01f7;
                case 17: goto L_0x01dc;
                case 18: goto L_0x01bd;
                case 19: goto L_0x01a2;
                case 20: goto L_0x0187;
                default: goto L_0x0183;
            };
         */
        /* JADX WARNING: Code restructure failed: missing block: B:74:0x0183, code lost:
            r4 = r25;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:75:0x0187, code lost:
            r2 = r26;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:76:0x0191, code lost:
            if (r2.getProperty("Bright").isValueValid() == false) goto L_0x0183;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:77:0x0193, code lost:
            r25.f12949a.mo32429a((java.lang.Long) r2.getValue("Bright"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:78:0x01a2, code lost:
            r4 = r25;
            r2 = r26;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:79:0x01ae, code lost:
            if (r2.getProperty("BgFlowParams").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:80:0x01b0, code lost:
            r4.f12949a.mo32445q((java.lang.String) r2.getValue("BgFlowParams"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:81:0x01bd, code lost:
            r4 = r25;
            r2 = r26;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:82:0x01c9, code lost:
            if (r2.getProperty("MainPower").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:83:0x01cb, code lost:
            r4.f12949a.mo32444p(com.yeelight.yeelib.device.xiaomi.Ceiling19Service.MainPower.valueOf((java.lang.String) r2.getValue("MainPower")));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:84:0x01dc, code lost:
            r4 = r25;
            r2 = r26;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:85:0x01e8, code lost:
            if (r2.getProperty("LanMode").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:86:0x01ea, code lost:
            r4.f12949a.mo32435g((java.lang.Long) r2.getValue("LanMode"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:87:0x01f7, code lost:
            r4 = r25;
            r2 = r26;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:88:0x0203, code lost:
            if (r2.getProperty("BgPower").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:89:0x0205, code lost:
            r4.f12949a.mo32448t(com.yeelight.yeelib.device.xiaomi.Ceiling19Service.BgPower.valueOf((java.lang.String) r2.getValue("BgPower")));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:90:0x0216, code lost:
            r4 = r25;
            r2 = r26;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:91:0x0222, code lost:
            if (r2.getProperty("SmartSwitch").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:92:0x0224, code lost:
            r4.f12949a.mo32443o((java.lang.Long) r2.getValue("SmartSwitch"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:93:0x0231, code lost:
            r4 = r25;
            r2 = r26;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:94:0x023d, code lost:
            if (r2.getProperty("BgFlowing").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:95:0x023f, code lost:
            r4.f12949a.mo32447s((java.lang.Long) r2.getValue("BgFlowing"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:96:0x024c, code lost:
            r4 = r25;
            r2 = r26;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:97:0x0258, code lost:
            if (r2.getProperty("Flowing").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:98:0x025a, code lost:
            r4.f12949a.mo32432d((java.lang.Long) r2.getValue("Flowing"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:99:0x0267, code lost:
            r4 = r25;
            r2 = r26;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onPropertyChanged(com.miot.common.device.invocation.PropertyInfo r26, java.lang.String r27) {
            /*
                r25 = this;
                r0 = r25
                r1 = r26
                r2 = r27
                r27.hashCode()
                int r3 = r27.hashCode()
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
                java.lang.String r1 = "NLBright"
                r18 = r1
                java.lang.String r1 = "NightTimeInfo"
                r19 = r1
                java.lang.String r1 = "BgProact"
                r20 = r1
                java.lang.String r1 = "FlowParams"
                r21 = r1
                java.lang.String r1 = "BgBright"
                r22 = r1
                java.lang.String r1 = "SaveState"
                r23 = -1
                switch(r3) {
                    case -2117953292: goto L_0x016d;
                    case -2017000513: goto L_0x0159;
                    case -2002016140: goto L_0x0141;
                    case -1616019574: goto L_0x012b;
                    case -1331143373: goto L_0x0115;
                    case -770908584: goto L_0x00ff;
                    case -80340154: goto L_0x00ec;
                    case 2193: goto L_0x00dc;
                    case 2067382: goto L_0x00d0;
                    case 35911772: goto L_0x00c4;
                    case 64102952: goto L_0x00ba;
                    case 77306085: goto L_0x00b0;
                    case 880790796: goto L_0x00a6;
                    case 898856916: goto L_0x009c;
                    case 986784719: goto L_0x0092;
                    case 1179821629: goto L_0x0088;
                    case 1471809440: goto L_0x007e;
                    case 1611821756: goto L_0x0074;
                    case 1738956460: goto L_0x006a;
                    case 1820079769: goto L_0x0060;
                    case 1998035738: goto L_0x0056;
                    default: goto L_0x004a;
                }
            L_0x004a:
                r3 = r22
                r24 = r16
                r16 = r0
                r0 = r17
                r17 = r24
                goto L_0x0180
            L_0x0056:
                boolean r2 = r2.equals(r4)
                if (r2 != 0) goto L_0x005d
                goto L_0x004a
            L_0x005d:
                r23 = 20
                goto L_0x004a
            L_0x0060:
                boolean r2 = r2.equals(r5)
                if (r2 != 0) goto L_0x0067
                goto L_0x004a
            L_0x0067:
                r23 = 19
                goto L_0x004a
            L_0x006a:
                boolean r2 = r2.equals(r6)
                if (r2 != 0) goto L_0x0071
                goto L_0x004a
            L_0x0071:
                r23 = 18
                goto L_0x004a
            L_0x0074:
                boolean r2 = r2.equals(r7)
                if (r2 != 0) goto L_0x007b
                goto L_0x004a
            L_0x007b:
                r23 = 17
                goto L_0x004a
            L_0x007e:
                boolean r2 = r2.equals(r8)
                if (r2 != 0) goto L_0x0085
                goto L_0x004a
            L_0x0085:
                r23 = 16
                goto L_0x004a
            L_0x0088:
                boolean r2 = r2.equals(r9)
                if (r2 != 0) goto L_0x008f
                goto L_0x004a
            L_0x008f:
                r23 = 15
                goto L_0x004a
            L_0x0092:
                boolean r2 = r2.equals(r10)
                if (r2 != 0) goto L_0x0099
                goto L_0x004a
            L_0x0099:
                r23 = 14
                goto L_0x004a
            L_0x009c:
                boolean r2 = r2.equals(r11)
                if (r2 != 0) goto L_0x00a3
                goto L_0x004a
            L_0x00a3:
                r23 = 13
                goto L_0x004a
            L_0x00a6:
                boolean r2 = r2.equals(r12)
                if (r2 != 0) goto L_0x00ad
                goto L_0x004a
            L_0x00ad:
                r23 = 12
                goto L_0x004a
            L_0x00b0:
                boolean r2 = r2.equals(r13)
                if (r2 != 0) goto L_0x00b7
                goto L_0x004a
            L_0x00b7:
                r23 = 11
                goto L_0x004a
            L_0x00ba:
                boolean r2 = r2.equals(r14)
                if (r2 != 0) goto L_0x00c1
                goto L_0x004a
            L_0x00c1:
                r23 = 10
                goto L_0x004a
            L_0x00c4:
                boolean r2 = r2.equals(r15)
                if (r2 != 0) goto L_0x00cc
                goto L_0x004a
            L_0x00cc:
                r23 = 9
                goto L_0x004a
            L_0x00d0:
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L_0x00d8
                goto L_0x004a
            L_0x00d8:
                r23 = 8
                goto L_0x004a
            L_0x00dc:
                r3 = r16
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L_0x00e5
                goto L_0x00e7
            L_0x00e5:
                r23 = 7
            L_0x00e7:
                r16 = r0
                r0 = r17
                goto L_0x00fb
            L_0x00ec:
                r3 = r16
                r16 = r0
                r0 = r17
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L_0x00f9
                goto L_0x00fb
            L_0x00f9:
                r23 = 6
            L_0x00fb:
                r17 = r3
                goto L_0x0156
            L_0x00ff:
                r3 = r18
                r24 = r16
                r16 = r0
                r0 = r17
                r17 = r24
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L_0x0110
                goto L_0x0112
            L_0x0110:
                r23 = 5
            L_0x0112:
                r18 = r3
                goto L_0x0156
            L_0x0115:
                r3 = r19
                r24 = r16
                r16 = r0
                r0 = r17
                r17 = r24
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L_0x0126
                goto L_0x0128
            L_0x0126:
                r23 = 4
            L_0x0128:
                r19 = r3
                goto L_0x0156
            L_0x012b:
                r3 = r20
                r24 = r16
                r16 = r0
                r0 = r17
                r17 = r24
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L_0x013c
                goto L_0x013e
            L_0x013c:
                r23 = 3
            L_0x013e:
                r20 = r3
                goto L_0x0156
            L_0x0141:
                r3 = r21
                r24 = r16
                r16 = r0
                r0 = r17
                r17 = r24
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L_0x0152
                goto L_0x0154
            L_0x0152:
                r23 = 2
            L_0x0154:
                r21 = r3
            L_0x0156:
                r3 = r22
                goto L_0x0180
            L_0x0159:
                r3 = r22
                r24 = r16
                r16 = r0
                r0 = r17
                r17 = r24
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L_0x016a
                goto L_0x0180
            L_0x016a:
                r23 = 1
                goto L_0x0180
            L_0x016d:
                r3 = r22
                r24 = r16
                r16 = r0
                r0 = r17
                r17 = r24
                boolean r2 = r2.equals(r1)
                if (r2 != 0) goto L_0x017e
                goto L_0x0180
            L_0x017e:
                r23 = 0
            L_0x0180:
                switch(r23) {
                    case 0: goto L_0x03b8;
                    case 1: goto L_0x039e;
                    case 2: goto L_0x0382;
                    case 3: goto L_0x0366;
                    case 4: goto L_0x0349;
                    case 5: goto L_0x032c;
                    case 6: goto L_0x0311;
                    case 7: goto L_0x02f4;
                    case 8: goto L_0x02d7;
                    case 9: goto L_0x02bc;
                    case 10: goto L_0x02a1;
                    case 11: goto L_0x0282;
                    case 12: goto L_0x0267;
                    case 13: goto L_0x024c;
                    case 14: goto L_0x0231;
                    case 15: goto L_0x0216;
                    case 16: goto L_0x01f7;
                    case 17: goto L_0x01dc;
                    case 18: goto L_0x01bd;
                    case 19: goto L_0x01a2;
                    case 20: goto L_0x0187;
                    default: goto L_0x0183;
                }
            L_0x0183:
                r4 = r25
                goto L_0x03d1
            L_0x0187:
                r2 = r26
                com.miot.common.property.Property r0 = r2.getProperty(r4)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0183
                java.lang.Object r0 = r2.getValue(r4)
                java.lang.Long r0 = (java.lang.Long) r0
                r4 = r25
                com.yeelight.yeelib.device.xiaomi.Ceiling19Service$u1 r1 = r4.f12949a
                r1.mo32429a(r0)
                goto L_0x03d1
            L_0x01a2:
                r4 = r25
                r2 = r26
                com.miot.common.property.Property r0 = r2.getProperty(r5)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x03d1
                java.lang.Object r0 = r2.getValue(r5)
                java.lang.String r0 = (java.lang.String) r0
                com.yeelight.yeelib.device.xiaomi.Ceiling19Service$u1 r1 = r4.f12949a
                r1.mo32445q(r0)
                goto L_0x03d1
            L_0x01bd:
                r4 = r25
                r2 = r26
                com.miot.common.property.Property r0 = r2.getProperty(r6)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x03d1
                java.lang.Object r0 = r2.getValue(r6)
                java.lang.String r0 = (java.lang.String) r0
                com.yeelight.yeelib.device.xiaomi.Ceiling19Service$MainPower r0 = com.yeelight.yeelib.device.xiaomi.Ceiling19Service.MainPower.valueOf(r0)
                com.yeelight.yeelib.device.xiaomi.Ceiling19Service$u1 r1 = r4.f12949a
                r1.mo32444p(r0)
                goto L_0x03d1
            L_0x01dc:
                r4 = r25
                r2 = r26
                com.miot.common.property.Property r0 = r2.getProperty(r7)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x03d1
                java.lang.Object r0 = r2.getValue(r7)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Ceiling19Service$u1 r1 = r4.f12949a
                r1.mo32435g(r0)
                goto L_0x03d1
            L_0x01f7:
                r4 = r25
                r2 = r26
                com.miot.common.property.Property r0 = r2.getProperty(r8)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x03d1
                java.lang.Object r0 = r2.getValue(r8)
                java.lang.String r0 = (java.lang.String) r0
                com.yeelight.yeelib.device.xiaomi.Ceiling19Service$BgPower r0 = com.yeelight.yeelib.device.xiaomi.Ceiling19Service.BgPower.valueOf(r0)
                com.yeelight.yeelib.device.xiaomi.Ceiling19Service$u1 r1 = r4.f12949a
                r1.mo32448t(r0)
                goto L_0x03d1
            L_0x0216:
                r4 = r25
                r2 = r26
                com.miot.common.property.Property r0 = r2.getProperty(r9)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x03d1
                java.lang.Object r0 = r2.getValue(r9)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Ceiling19Service$u1 r1 = r4.f12949a
                r1.mo32443o(r0)
                goto L_0x03d1
            L_0x0231:
                r4 = r25
                r2 = r26
                com.miot.common.property.Property r0 = r2.getProperty(r10)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x03d1
                java.lang.Object r0 = r2.getValue(r10)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Ceiling19Service$u1 r1 = r4.f12949a
                r1.mo32447s(r0)
                goto L_0x03d1
            L_0x024c:
                r4 = r25
                r2 = r26
                com.miot.common.property.Property r0 = r2.getProperty(r11)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x03d1
                java.lang.Object r0 = r2.getValue(r11)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Ceiling19Service$u1 r1 = r4.f12949a
                r1.mo32432d(r0)
                goto L_0x03d1
            L_0x0267:
                r4 = r25
                r2 = r26
                com.miot.common.property.Property r0 = r2.getProperty(r12)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x03d1
                java.lang.Object r0 = r2.getValue(r12)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Ceiling19Service$u1 r1 = r4.f12949a
                r1.mo32430b(r0)
                goto L_0x03d1
            L_0x0282:
                r4 = r25
                r2 = r26
                com.miot.common.property.Property r0 = r2.getProperty(r13)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x03d1
                java.lang.Object r0 = r2.getValue(r13)
                java.lang.String r0 = (java.lang.String) r0
                com.yeelight.yeelib.device.xiaomi.Ceiling19Service$Power r0 = com.yeelight.yeelib.device.xiaomi.Ceiling19Service.Power.valueOf(r0)
                com.yeelight.yeelib.device.xiaomi.Ceiling19Service$u1 r1 = r4.f12949a
                r1.mo32449u(r0)
                goto L_0x03d1
            L_0x02a1:
                r4 = r25
                r2 = r26
                com.miot.common.property.Property r0 = r2.getProperty(r14)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x03d1
                java.lang.Object r0 = r2.getValue(r14)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Ceiling19Service$u1 r1 = r4.f12949a
                r1.mo32442n(r0)
                goto L_0x03d1
            L_0x02bc:
                r4 = r25
                r2 = r26
                com.miot.common.property.Property r0 = r2.getProperty(r15)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x03d1
                java.lang.Object r0 = r2.getValue(r15)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Ceiling19Service$u1 r1 = r4.f12949a
                r1.mo32434f(r0)
                goto L_0x03d1
            L_0x02d7:
                r4 = r25
                r2 = r26
                r0 = r16
                com.miot.common.property.Property r1 = r2.getProperty(r0)
                boolean r1 = r1.isValueValid()
                if (r1 == 0) goto L_0x03d1
                java.lang.Object r0 = r2.getValue(r0)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Ceiling19Service$u1 r1 = r4.f12949a
                r1.mo32438j(r0)
                goto L_0x03d1
            L_0x02f4:
                r4 = r25
                r2 = r26
                r0 = r17
                com.miot.common.property.Property r1 = r2.getProperty(r0)
                boolean r1 = r1.isValueValid()
                if (r1 == 0) goto L_0x03d1
                java.lang.Object r0 = r2.getValue(r0)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Ceiling19Service$u1 r1 = r4.f12949a
                r1.mo32436h(r0)
                goto L_0x03d1
            L_0x0311:
                r4 = r25
                r2 = r26
                com.miot.common.property.Property r1 = r2.getProperty(r0)
                boolean r1 = r1.isValueValid()
                if (r1 == 0) goto L_0x03d1
                java.lang.Object r0 = r2.getValue(r0)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Ceiling19Service$u1 r1 = r4.f12949a
                r1.mo32441m(r0)
                goto L_0x03d1
            L_0x032c:
                r4 = r25
                r2 = r26
                r0 = r18
                com.miot.common.property.Property r1 = r2.getProperty(r0)
                boolean r1 = r1.isValueValid()
                if (r1 == 0) goto L_0x03d1
                java.lang.Object r0 = r2.getValue(r0)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Ceiling19Service$u1 r1 = r4.f12949a
                r1.mo32439k(r0)
                goto L_0x03d1
            L_0x0349:
                r4 = r25
                r2 = r26
                r0 = r19
                com.miot.common.property.Property r1 = r2.getProperty(r0)
                boolean r1 = r1.isValueValid()
                if (r1 == 0) goto L_0x03d1
                java.lang.Object r0 = r2.getValue(r0)
                java.lang.String r0 = (java.lang.String) r0
                com.yeelight.yeelib.device.xiaomi.Ceiling19Service$u1 r1 = r4.f12949a
                r1.mo32437i(r0)
                goto L_0x03d1
            L_0x0366:
                r4 = r25
                r2 = r26
                r0 = r20
                com.miot.common.property.Property r1 = r2.getProperty(r0)
                boolean r1 = r1.isValueValid()
                if (r1 == 0) goto L_0x03d1
                java.lang.Object r0 = r2.getValue(r0)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Ceiling19Service$u1 r1 = r4.f12949a
                r1.mo32446r(r0)
                goto L_0x03d1
            L_0x0382:
                r4 = r25
                r2 = r26
                r0 = r21
                com.miot.common.property.Property r1 = r2.getProperty(r0)
                boolean r1 = r1.isValueValid()
                if (r1 == 0) goto L_0x03d1
                java.lang.Object r0 = r2.getValue(r0)
                java.lang.String r0 = (java.lang.String) r0
                com.yeelight.yeelib.device.xiaomi.Ceiling19Service$u1 r1 = r4.f12949a
                r1.mo32433e(r0)
                goto L_0x03d1
            L_0x039e:
                r4 = r25
                r2 = r26
                com.miot.common.property.Property r0 = r2.getProperty(r3)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x03d1
                java.lang.Object r0 = r2.getValue(r3)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Ceiling19Service$u1 r1 = r4.f12949a
                r1.mo32440l(r0)
                goto L_0x03d1
            L_0x03b8:
                r4 = r25
                r2 = r26
                com.miot.common.property.Property r0 = r2.getProperty(r1)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x03d1
                java.lang.Object r0 = r2.getValue(r1)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Ceiling19Service$u1 r1 = r4.f12949a
                r1.mo32431c(r0)
            L_0x03d1:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.xiaomi.Ceiling19Service.C6527v.onPropertyChanged(com.miot.common.device.invocation.PropertyInfo, java.lang.String):void");
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$v0 */
    class C6528v0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6472c1 f12950a;

        C6528v0(Ceiling19Service ceiling19Service, C6472c1 c1Var) {
            this.f12950a = c1Var;
        }

        public void onFailed(int i, String str) {
            this.f12950a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("BgPower");
            if (property.isValueValid()) {
                this.f12950a.mo32393a(BgPower.valueOf((String) propertyInfo.getValue("BgPower")));
                return;
            }
            C6472c1 c1Var = this.f12950a;
            c1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$w */
    class C6529w implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12951a;

        C6529w(Ceiling19Service ceiling19Service, CompletionHandler completionHandler) {
            this.f12951a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12951a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12951a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$w0 */
    class C6530w0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6481f1 f12952a;

        C6530w0(Ceiling19Service ceiling19Service, C6481f1 f1Var) {
            this.f12952a = f1Var;
        }

        public void onFailed(int i, String str) {
            this.f12952a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Bright");
            if (property.isValueValid()) {
                this.f12952a.mo32399a((Long) propertyInfo.getValue("Bright"));
                return;
            }
            C6481f1 f1Var = this.f12952a;
            f1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$x */
    class C6531x implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12953a;

        C6531x(Ceiling19Service ceiling19Service, CompletionHandler completionHandler) {
            this.f12953a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12953a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12953a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$x0 */
    class C6532x0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6534y0 f12954a;

        C6532x0(Ceiling19Service ceiling19Service, C6534y0 y0Var) {
            this.f12954a = y0Var;
        }

        public void onFailed(int i, String str) {
            this.f12954a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("BgBright");
            if (property.isValueValid()) {
                this.f12954a.mo32450a((Long) propertyInfo.getValue("BgBright"));
                return;
            }
            C6534y0 y0Var = this.f12954a;
            y0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$y */
    class C6533y implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12955a;

        C6533y(Ceiling19Service ceiling19Service, CompletionHandler completionHandler) {
            this.f12955a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12955a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12955a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$y0 */
    public interface C6534y0 {
        /* renamed from: a */
        void mo32450a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$z */
    class C6535z implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12956a;

        C6535z(Ceiling19Service ceiling19Service, CompletionHandler completionHandler) {
            this.f12956a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12956a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12956a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$z0 */
    public interface C6536z0 {
        /* renamed from: a */
        void mo32452a(Long l);

        void onFailed(int i, String str);
    }

    public Ceiling19Service(AbstractDevice abstractDevice) {
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
                MiotManager.getDeviceManipulator().invoke(create, new C6533y(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6495k0(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getBgBright(C6534y0 y0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "BgBright"), new C6532x0(this, y0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getBgCt(C6536z0 z0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "BgCt"), new C6467b(this, z0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getBgFlowParams(C6466a1 a1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "BgFlowParams"), new C6476e(this, a1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getBgFlowing(C6469b1 b1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "BgFlowing"), new C6506o(this, b1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getBgPower(C6472c1 c1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "BgPower"), new C6528v0(this, c1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getBgProact(C6475d1 d1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "BgProact"), new C6509p(this, d1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getBgRgb(C6478e1 e1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "BgRgb"), new C6500m(this, e1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getBright(C6481f1 f1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Bright"), new C6530w0(this, f1Var));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6519s0(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getCt(C6484g1 g1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Ct"), new C6464a(this, g1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getDelayOff(C6487h1 h1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "DelayOff"), new C6470c(this, h1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowParams(C6490i1 i1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "FlowParams"), new C6473d(this, i1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowing(C6493j1 j1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Flowing"), new C6503n(this, j1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getLanMode(C6496k1 k1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "LanMode"), new C6479f(this, k1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getMainPower(C6499l1 l1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "MainPower"), new C6522t0(this, l1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getMiBandSleep(C6502m1 m1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "MiBandSleep"), new C6497l(this, m1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getNLBright(C6505n1 n1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "NLBright"), new C6488i(this, n1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getNightTimeInfo(C6508o1 o1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "NightTimeInfo"), new C6491j(this, o1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getPower(C6511p1 p1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Power"), new C6525u0(this, p1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getProperties(C6514q1 q1Var) {
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
            create.addProperty(getService().getProperty("SmartSwitch"));
            MiotManager.getDeviceManipulator().readProperty(create, new C6516r0(this, q1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getSaveState(C6517r1 r1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "SaveState"), new C6482g(this, r1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getSmartSwitch(C6520s1 s1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "SmartSwitch"), new C6512q(this, s1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getonFromPower(C6523t1 t1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "onFromPower"), new C6485h(this, t1Var));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6531x(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6524u(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6498l0(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6468b0(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6489i0(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6535z(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6480f0(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6515r(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6521t(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6492j0(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6518s(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6513q0(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6510p0(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6504n0(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6474d0(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6465a0(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6529w(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6501m0(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6477e0(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6471c0(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6486h0(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void subscribeNotifications(CompletionHandler completionHandler, C6526u1 u1Var) {
        if (completionHandler == null) {
            throw new IllegalArgumentException("handler is null");
        } else if (u1Var != null) {
            PropertyInfo create = PropertyInfoFactory.create(getService());
            for (Property next : getService().getProperties()) {
                if (next.getDefinition().isNotifiable()) {
                    create.addProperty(next);
                }
            }
            MiotManager.getDeviceManipulator().addPropertyChangedListener(create, new C6494k(this, completionHandler), new C6527v(this, u1Var));
        } else {
            throw new IllegalArgumentException("listener is null");
        }
    }

    public void toggle(CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "toggle");
            if (create != null) {
                MiotManager.getDeviceManipulator().invoke(create, new C6507o0(this, completionHandler));
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
            MiotManager.getDeviceManipulator().removePropertyChangedListener(create, new C6483g0(this, completionHandler));
            return;
        }
        throw new IllegalArgumentException("handler is null");
    }
}
