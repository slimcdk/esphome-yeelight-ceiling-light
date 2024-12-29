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

public class Ceiling10Service extends AbstractService {
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
    private static final String TAG = "Ceiling10Service";
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

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$a */
    class C6391a implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6411g1 f12854a;

        C6391a(Ceiling10Service ceiling10Service, C6411g1 g1Var) {
            this.f12854a = g1Var;
        }

        public void onFailed(int i, String str) {
            this.f12854a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Ct");
            if (property.isValueValid()) {
                this.f12854a.mo32287a((Long) propertyInfo.getValue("Ct"));
                return;
            }
            C6411g1 g1Var = this.f12854a;
            g1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$a0 */
    class C6392a0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12855a;

        C6392a0(Ceiling10Service ceiling10Service, CompletionHandler completionHandler) {
            this.f12855a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12855a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12855a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$a1 */
    public interface C6393a1 {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$b */
    class C6394b implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6463z0 f12856a;

        C6394b(Ceiling10Service ceiling10Service, C6463z0 z0Var) {
            this.f12856a = z0Var;
        }

        public void onFailed(int i, String str) {
            this.f12856a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("BgCt");
            if (property.isValueValid()) {
                this.f12856a.mo32338a((Long) propertyInfo.getValue("BgCt"));
                return;
            }
            C6463z0 z0Var = this.f12856a;
            z0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$b0 */
    class C6395b0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12857a;

        C6395b0(Ceiling10Service ceiling10Service, CompletionHandler completionHandler) {
            this.f12857a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12857a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12857a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$b1 */
    public interface C6396b1 {
        /* renamed from: a */
        void mo32277a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$c */
    class C6397c implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6414h1 f12858a;

        C6397c(Ceiling10Service ceiling10Service, C6414h1 h1Var) {
            this.f12858a = h1Var;
        }

        public void onFailed(int i, String str) {
            this.f12858a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("DelayOff");
            if (property.isValueValid()) {
                this.f12858a.mo32289a((Long) propertyInfo.getValue("DelayOff"));
                return;
            }
            C6414h1 h1Var = this.f12858a;
            h1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$c0 */
    class C6398c0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12859a;

        C6398c0(Ceiling10Service ceiling10Service, CompletionHandler completionHandler) {
            this.f12859a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12859a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12859a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$c1 */
    public interface C6399c1 {
        /* renamed from: a */
        void mo32279a(BgPower bgPower);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$d */
    class C6400d implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6417i1 f12860a;

        C6400d(Ceiling10Service ceiling10Service, C6417i1 i1Var) {
            this.f12860a = i1Var;
        }

        public void onFailed(int i, String str) {
            this.f12860a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("FlowParams");
            if (property.isValueValid()) {
                this.f12860a.onSucceed((String) propertyInfo.getValue("FlowParams"));
                return;
            }
            C6417i1 i1Var = this.f12860a;
            i1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$d0 */
    class C6401d0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12861a;

        C6401d0(Ceiling10Service ceiling10Service, CompletionHandler completionHandler) {
            this.f12861a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12861a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12861a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$d1 */
    public interface C6402d1 {
        /* renamed from: a */
        void mo32281a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$e */
    class C6403e implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6393a1 f12862a;

        C6403e(Ceiling10Service ceiling10Service, C6393a1 a1Var) {
            this.f12862a = a1Var;
        }

        public void onFailed(int i, String str) {
            this.f12862a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("BgFlowParams");
            if (property.isValueValid()) {
                this.f12862a.onSucceed((String) propertyInfo.getValue("BgFlowParams"));
                return;
            }
            C6393a1 a1Var = this.f12862a;
            a1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$e0 */
    class C6404e0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12863a;

        C6404e0(Ceiling10Service ceiling10Service, CompletionHandler completionHandler) {
            this.f12863a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12863a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12863a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$e1 */
    public interface C6405e1 {
        /* renamed from: a */
        void mo32283a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$f */
    class C6406f implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6423k1 f12864a;

        C6406f(Ceiling10Service ceiling10Service, C6423k1 k1Var) {
            this.f12864a = k1Var;
        }

        public void onFailed(int i, String str) {
            this.f12864a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("LanMode");
            if (property.isValueValid()) {
                this.f12864a.mo32295a((Long) propertyInfo.getValue("LanMode"));
                return;
            }
            C6423k1 k1Var = this.f12864a;
            k1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$f0 */
    class C6407f0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12865a;

        C6407f0(Ceiling10Service ceiling10Service, CompletionHandler completionHandler) {
            this.f12865a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12865a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12865a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$f1 */
    public interface C6408f1 {
        /* renamed from: a */
        void mo32285a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$g */
    class C6409g implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6444r1 f12866a;

        C6409g(Ceiling10Service ceiling10Service, C6444r1 r1Var) {
            this.f12866a = r1Var;
        }

        public void onFailed(int i, String str) {
            this.f12866a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("SaveState");
            if (property.isValueValid()) {
                this.f12866a.mo32309a((Long) propertyInfo.getValue("SaveState"));
                return;
            }
            C6444r1 r1Var = this.f12866a;
            r1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$g0 */
    class C6410g0 implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12867a;

        C6410g0(Ceiling10Service ceiling10Service, CompletionHandler completionHandler) {
            this.f12867a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12867a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f12867a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$g1 */
    public interface C6411g1 {
        /* renamed from: a */
        void mo32287a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$h */
    class C6412h implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6450t1 f12868a;

        C6412h(Ceiling10Service ceiling10Service, C6450t1 t1Var) {
            this.f12868a = t1Var;
        }

        public void onFailed(int i, String str) {
            this.f12868a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("onFromPower");
            if (property.isValueValid()) {
                this.f12868a.mo32313a((Long) propertyInfo.getValue("onFromPower"));
                return;
            }
            C6450t1 t1Var = this.f12868a;
            t1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$h0 */
    class C6413h0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12869a;

        C6413h0(Ceiling10Service ceiling10Service, CompletionHandler completionHandler) {
            this.f12869a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12869a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12869a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$h1 */
    public interface C6414h1 {
        /* renamed from: a */
        void mo32289a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$i */
    class C6415i implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6432n1 f12870a;

        C6415i(Ceiling10Service ceiling10Service, C6432n1 n1Var) {
            this.f12870a = n1Var;
        }

        public void onFailed(int i, String str) {
            this.f12870a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("NLBright");
            if (property.isValueValid()) {
                this.f12870a.mo32301a((Long) propertyInfo.getValue("NLBright"));
                return;
            }
            C6432n1 n1Var = this.f12870a;
            n1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$i0 */
    class C6416i0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12871a;

        C6416i0(Ceiling10Service ceiling10Service, CompletionHandler completionHandler) {
            this.f12871a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12871a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12871a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$i1 */
    public interface C6417i1 {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$j */
    class C6418j implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6435o1 f12872a;

        C6418j(Ceiling10Service ceiling10Service, C6435o1 o1Var) {
            this.f12872a = o1Var;
        }

        public void onFailed(int i, String str) {
            this.f12872a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("NightTimeInfo");
            if (property.isValueValid()) {
                this.f12872a.onSucceed((String) propertyInfo.getValue("NightTimeInfo"));
                return;
            }
            C6435o1 o1Var = this.f12872a;
            o1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$j0 */
    class C6419j0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12873a;

        C6419j0(Ceiling10Service ceiling10Service, CompletionHandler completionHandler) {
            this.f12873a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12873a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12873a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$j1 */
    public interface C6420j1 {
        /* renamed from: a */
        void mo32293a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$k */
    class C6421k implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12874a;

        C6421k(Ceiling10Service ceiling10Service, CompletionHandler completionHandler) {
            this.f12874a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12874a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f12874a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$k0 */
    class C6422k0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12875a;

        C6422k0(Ceiling10Service ceiling10Service, CompletionHandler completionHandler) {
            this.f12875a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12875a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12875a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$k1 */
    public interface C6423k1 {
        /* renamed from: a */
        void mo32295a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$l */
    class C6424l implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6429m1 f12876a;

        C6424l(Ceiling10Service ceiling10Service, C6429m1 m1Var) {
            this.f12876a = m1Var;
        }

        public void onFailed(int i, String str) {
            this.f12876a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("MiBandSleep");
            if (property.isValueValid()) {
                this.f12876a.mo32299a((Long) propertyInfo.getValue("MiBandSleep"));
                return;
            }
            C6429m1 m1Var = this.f12876a;
            m1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$l0 */
    class C6425l0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12877a;

        C6425l0(Ceiling10Service ceiling10Service, CompletionHandler completionHandler) {
            this.f12877a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12877a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12877a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$l1 */
    public interface C6426l1 {
        /* renamed from: a */
        void mo32297a(MainPower mainPower);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$m */
    class C6427m implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6405e1 f12878a;

        C6427m(Ceiling10Service ceiling10Service, C6405e1 e1Var) {
            this.f12878a = e1Var;
        }

        public void onFailed(int i, String str) {
            this.f12878a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("BgRgb");
            if (property.isValueValid()) {
                this.f12878a.mo32283a((Long) propertyInfo.getValue("BgRgb"));
                return;
            }
            C6405e1 e1Var = this.f12878a;
            e1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$m0 */
    class C6428m0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12879a;

        C6428m0(Ceiling10Service ceiling10Service, CompletionHandler completionHandler) {
            this.f12879a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12879a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12879a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$m1 */
    public interface C6429m1 {
        /* renamed from: a */
        void mo32299a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$n */
    class C6430n implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6420j1 f12880a;

        C6430n(Ceiling10Service ceiling10Service, C6420j1 j1Var) {
            this.f12880a = j1Var;
        }

        public void onFailed(int i, String str) {
            this.f12880a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Flowing");
            if (property.isValueValid()) {
                this.f12880a.mo32293a((Long) propertyInfo.getValue("Flowing"));
                return;
            }
            C6420j1 j1Var = this.f12880a;
            j1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$n0 */
    class C6431n0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12881a;

        C6431n0(Ceiling10Service ceiling10Service, CompletionHandler completionHandler) {
            this.f12881a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12881a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12881a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$n1 */
    public interface C6432n1 {
        /* renamed from: a */
        void mo32301a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$o */
    class C6433o implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6396b1 f12882a;

        C6433o(Ceiling10Service ceiling10Service, C6396b1 b1Var) {
            this.f12882a = b1Var;
        }

        public void onFailed(int i, String str) {
            this.f12882a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("BgFlowing");
            if (property.isValueValid()) {
                this.f12882a.mo32277a((Long) propertyInfo.getValue("BgFlowing"));
                return;
            }
            C6396b1 b1Var = this.f12882a;
            b1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$o0 */
    class C6434o0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12883a;

        C6434o0(Ceiling10Service ceiling10Service, CompletionHandler completionHandler) {
            this.f12883a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12883a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12883a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$o1 */
    public interface C6435o1 {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$p */
    class C6436p implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6402d1 f12884a;

        C6436p(Ceiling10Service ceiling10Service, C6402d1 d1Var) {
            this.f12884a = d1Var;
        }

        public void onFailed(int i, String str) {
            this.f12884a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("BgProact");
            if (property.isValueValid()) {
                this.f12884a.mo32281a((Long) propertyInfo.getValue("BgProact"));
                return;
            }
            C6402d1 d1Var = this.f12884a;
            d1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$p0 */
    class C6437p0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12885a;

        C6437p0(Ceiling10Service ceiling10Service, CompletionHandler completionHandler) {
            this.f12885a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12885a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12885a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$p1 */
    public interface C6438p1 {
        /* renamed from: a */
        void mo32305a(Power power);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$q */
    class C6439q implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6447s1 f12886a;

        C6439q(Ceiling10Service ceiling10Service, C6447s1 s1Var) {
            this.f12886a = s1Var;
        }

        public void onFailed(int i, String str) {
            this.f12886a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("SmartSwitch");
            if (property.isValueValid()) {
                this.f12886a.mo32311a((Long) propertyInfo.getValue("SmartSwitch"));
                return;
            }
            C6447s1 s1Var = this.f12886a;
            s1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$q0 */
    class C6440q0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12887a;

        C6440q0(Ceiling10Service ceiling10Service, CompletionHandler completionHandler) {
            this.f12887a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12887a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12887a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$q1 */
    public interface C6441q1 {
        /* renamed from: a */
        void mo32307a(MainPower mainPower, Power power, BgPower bgPower, Long l, Long l2, Long l3, Long l4, Long l5, String str, String str2, Long l6, Long l7, Long l8, Long l9, String str3, Long l10, Long l11, Long l12, Long l13, Long l14, Long l15);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$r */
    class C6442r implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12888a;

        C6442r(Ceiling10Service ceiling10Service, CompletionHandler completionHandler) {
            this.f12888a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12888a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12888a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$r0 */
    class C6443r0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6441q1 f12889a;

        C6443r0(Ceiling10Service ceiling10Service, C6441q1 q1Var) {
            this.f12889a = q1Var;
        }

        public void onFailed(int i, String str) {
            this.f12889a.onFailed(i, str);
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
                com.yeelight.yeelib.device.xiaomi.Ceiling10Service$MainPower r1 = com.yeelight.yeelib.device.xiaomi.Ceiling10Service.MainPower.valueOf(r1)
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
                com.yeelight.yeelib.device.xiaomi.Ceiling10Service$Power r1 = com.yeelight.yeelib.device.xiaomi.Ceiling10Service.Power.valueOf(r1)
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
                com.yeelight.yeelib.device.xiaomi.Ceiling10Service$BgPower r1 = com.yeelight.yeelib.device.xiaomi.Ceiling10Service.BgPower.valueOf(r1)
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
                com.yeelight.yeelib.device.xiaomi.Ceiling10Service$q1 r4 = r0.f12889a
                r4.mo32307a(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.xiaomi.Ceiling10Service.C6443r0.onSucceed(com.miot.common.device.invocation.PropertyInfo):void");
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$r1 */
    public interface C6444r1 {
        /* renamed from: a */
        void mo32309a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$s */
    class C6445s implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12890a;

        C6445s(Ceiling10Service ceiling10Service, CompletionHandler completionHandler) {
            this.f12890a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12890a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12890a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$s0 */
    class C6446s0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12891a;

        C6446s0(Ceiling10Service ceiling10Service, CompletionHandler completionHandler) {
            this.f12891a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12891a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12891a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$s1 */
    public interface C6447s1 {
        /* renamed from: a */
        void mo32311a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$t */
    class C6448t implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12892a;

        C6448t(Ceiling10Service ceiling10Service, CompletionHandler completionHandler) {
            this.f12892a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12892a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12892a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$t0 */
    class C6449t0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6426l1 f12893a;

        C6449t0(Ceiling10Service ceiling10Service, C6426l1 l1Var) {
            this.f12893a = l1Var;
        }

        public void onFailed(int i, String str) {
            this.f12893a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("MainPower");
            if (property.isValueValid()) {
                this.f12893a.mo32297a(MainPower.valueOf((String) propertyInfo.getValue("MainPower")));
                return;
            }
            C6426l1 l1Var = this.f12893a;
            l1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$t1 */
    public interface C6450t1 {
        /* renamed from: a */
        void mo32313a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$u */
    class C6451u implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12894a;

        C6451u(Ceiling10Service ceiling10Service, CompletionHandler completionHandler) {
            this.f12894a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12894a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12894a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$u0 */
    class C6452u0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6438p1 f12895a;

        C6452u0(Ceiling10Service ceiling10Service, C6438p1 p1Var) {
            this.f12895a = p1Var;
        }

        public void onFailed(int i, String str) {
            this.f12895a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Power");
            if (property.isValueValid()) {
                this.f12895a.mo32305a(Power.valueOf((String) propertyInfo.getValue("Power")));
                return;
            }
            C6438p1 p1Var = this.f12895a;
            p1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$u1 */
    public interface C6453u1 {
        /* renamed from: a */
        void mo32315a(Long l);

        /* renamed from: b */
        void mo32316b(Long l);

        /* renamed from: c */
        void mo32317c(Long l);

        /* renamed from: d */
        void mo32318d(Long l);

        /* renamed from: e */
        void mo32319e(String str);

        /* renamed from: f */
        void mo32320f(Long l);

        /* renamed from: g */
        void mo32321g(Long l);

        /* renamed from: h */
        void mo32322h(Long l);

        /* renamed from: i */
        void mo32323i(String str);

        /* renamed from: j */
        void mo32324j(Long l);

        /* renamed from: k */
        void mo32325k(Long l);

        /* renamed from: l */
        void mo32326l(Long l);

        /* renamed from: m */
        void mo32327m(Long l);

        /* renamed from: n */
        void mo32328n(Long l);

        /* renamed from: o */
        void mo32329o(Long l);

        /* renamed from: q */
        void mo32330q(String str);

        /* renamed from: r */
        void mo32331r(Long l);

        /* renamed from: s */
        void mo32332s(Long l);

        /* renamed from: t */
        void mo32333t(MainPower mainPower);

        /* renamed from: u */
        void mo32334u(Power power);

        /* renamed from: v */
        void mo32335v(BgPower bgPower);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$v */
    class C6454v implements DeviceManipulator.PropertyChangedListener {

        /* renamed from: a */
        final /* synthetic */ C6453u1 f12896a;

        C6454v(Ceiling10Service ceiling10Service, C6453u1 u1Var) {
            this.f12896a = u1Var;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:100:0x0273, code lost:
            if (r2.getProperty("DelayOff").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:101:0x0275, code lost:
            r4.f12896a.mo32316b((java.lang.Long) r2.getValue("DelayOff"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:102:0x0282, code lost:
            r4 = r25;
            r2 = r26;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:103:0x028e, code lost:
            if (r2.getProperty("Power").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:104:0x0290, code lost:
            r4.f12896a.mo32334u(com.yeelight.yeelib.device.xiaomi.Ceiling10Service.Power.valueOf((java.lang.String) r2.getValue("Power")));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:105:0x02a1, code lost:
            r4 = r25;
            r2 = r26;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:106:0x02ad, code lost:
            if (r2.getProperty("BgRgb").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:107:0x02af, code lost:
            r4.f12896a.mo32328n((java.lang.Long) r2.getValue("BgRgb"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:108:0x02bc, code lost:
            r4 = r25;
            r2 = r26;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:109:0x02c8, code lost:
            if (r2.getProperty("onFromPower").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:110:0x02ca, code lost:
            r4.f12896a.mo32320f((java.lang.Long) r2.getValue("onFromPower"));
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
            r4.f12896a.mo32324j((java.lang.Long) r2.getValue(r0));
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
            r4.f12896a.mo32322h((java.lang.Long) r2.getValue(r0));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:117:0x0311, code lost:
            r4 = r25;
            r2 = r26;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:118:0x031d, code lost:
            if (r2.getProperty(r0).isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:119:0x031f, code lost:
            r4.f12896a.mo32327m((java.lang.Long) r2.getValue(r0));
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
            r4.f12896a.mo32325k((java.lang.Long) r2.getValue(r0));
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
            r4.f12896a.mo32323i((java.lang.String) r2.getValue(r0));
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
            r4.f12896a.mo32331r((java.lang.Long) r2.getValue(r0));
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
            r4.f12896a.mo32319e((java.lang.String) r2.getValue(r0));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:132:0x039e, code lost:
            r4 = r25;
            r2 = r26;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:133:0x03aa, code lost:
            if (r2.getProperty(r3).isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:134:0x03ac, code lost:
            r4.f12896a.mo32326l((java.lang.Long) r2.getValue(r3));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:135:0x03b8, code lost:
            r4 = r25;
            r2 = r26;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:136:0x03c4, code lost:
            if (r2.getProperty("SaveState").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:137:0x03c6, code lost:
            r4.f12896a.mo32317c((java.lang.Long) r2.getValue("SaveState"));
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
            r25.f12896a.mo32315a((java.lang.Long) r2.getValue("Bright"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:78:0x01a2, code lost:
            r4 = r25;
            r2 = r26;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:79:0x01ae, code lost:
            if (r2.getProperty("BgFlowParams").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:80:0x01b0, code lost:
            r4.f12896a.mo32330q((java.lang.String) r2.getValue("BgFlowParams"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:81:0x01bd, code lost:
            r4 = r25;
            r2 = r26;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:82:0x01c9, code lost:
            if (r2.getProperty("MainPower").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:83:0x01cb, code lost:
            r4.f12896a.mo32333t(com.yeelight.yeelib.device.xiaomi.Ceiling10Service.MainPower.valueOf((java.lang.String) r2.getValue("MainPower")));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:84:0x01dc, code lost:
            r4 = r25;
            r2 = r26;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:85:0x01e8, code lost:
            if (r2.getProperty("LanMode").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:86:0x01ea, code lost:
            r4.f12896a.mo32321g((java.lang.Long) r2.getValue("LanMode"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:87:0x01f7, code lost:
            r4 = r25;
            r2 = r26;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:88:0x0203, code lost:
            if (r2.getProperty("BgPower").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:89:0x0205, code lost:
            r4.f12896a.mo32335v(com.yeelight.yeelib.device.xiaomi.Ceiling10Service.BgPower.valueOf((java.lang.String) r2.getValue("BgPower")));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:90:0x0216, code lost:
            r4 = r25;
            r2 = r26;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:91:0x0222, code lost:
            if (r2.getProperty("SmartSwitch").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:92:0x0224, code lost:
            r4.f12896a.mo32329o((java.lang.Long) r2.getValue("SmartSwitch"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:93:0x0231, code lost:
            r4 = r25;
            r2 = r26;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:94:0x023d, code lost:
            if (r2.getProperty("BgFlowing").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:95:0x023f, code lost:
            r4.f12896a.mo32332s((java.lang.Long) r2.getValue("BgFlowing"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:96:0x024c, code lost:
            r4 = r25;
            r2 = r26;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:97:0x0258, code lost:
            if (r2.getProperty("Flowing").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:98:0x025a, code lost:
            r4.f12896a.mo32318d((java.lang.Long) r2.getValue("Flowing"));
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
                com.yeelight.yeelib.device.xiaomi.Ceiling10Service$u1 r1 = r4.f12896a
                r1.mo32315a(r0)
                goto L_0x03d1
            L_0x01a2:
                r4 = r25
                r2 = r26
                com.miot.common.property.Property r0 = r2.getProperty(r5)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x03d1
                java.lang.Object r0 = r2.getValue(r5)
                java.lang.String r0 = (java.lang.String) r0
                com.yeelight.yeelib.device.xiaomi.Ceiling10Service$u1 r1 = r4.f12896a
                r1.mo32330q(r0)
                goto L_0x03d1
            L_0x01bd:
                r4 = r25
                r2 = r26
                com.miot.common.property.Property r0 = r2.getProperty(r6)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x03d1
                java.lang.Object r0 = r2.getValue(r6)
                java.lang.String r0 = (java.lang.String) r0
                com.yeelight.yeelib.device.xiaomi.Ceiling10Service$MainPower r0 = com.yeelight.yeelib.device.xiaomi.Ceiling10Service.MainPower.valueOf(r0)
                com.yeelight.yeelib.device.xiaomi.Ceiling10Service$u1 r1 = r4.f12896a
                r1.mo32333t(r0)
                goto L_0x03d1
            L_0x01dc:
                r4 = r25
                r2 = r26
                com.miot.common.property.Property r0 = r2.getProperty(r7)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x03d1
                java.lang.Object r0 = r2.getValue(r7)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Ceiling10Service$u1 r1 = r4.f12896a
                r1.mo32321g(r0)
                goto L_0x03d1
            L_0x01f7:
                r4 = r25
                r2 = r26
                com.miot.common.property.Property r0 = r2.getProperty(r8)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x03d1
                java.lang.Object r0 = r2.getValue(r8)
                java.lang.String r0 = (java.lang.String) r0
                com.yeelight.yeelib.device.xiaomi.Ceiling10Service$BgPower r0 = com.yeelight.yeelib.device.xiaomi.Ceiling10Service.BgPower.valueOf(r0)
                com.yeelight.yeelib.device.xiaomi.Ceiling10Service$u1 r1 = r4.f12896a
                r1.mo32335v(r0)
                goto L_0x03d1
            L_0x0216:
                r4 = r25
                r2 = r26
                com.miot.common.property.Property r0 = r2.getProperty(r9)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x03d1
                java.lang.Object r0 = r2.getValue(r9)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Ceiling10Service$u1 r1 = r4.f12896a
                r1.mo32329o(r0)
                goto L_0x03d1
            L_0x0231:
                r4 = r25
                r2 = r26
                com.miot.common.property.Property r0 = r2.getProperty(r10)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x03d1
                java.lang.Object r0 = r2.getValue(r10)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Ceiling10Service$u1 r1 = r4.f12896a
                r1.mo32332s(r0)
                goto L_0x03d1
            L_0x024c:
                r4 = r25
                r2 = r26
                com.miot.common.property.Property r0 = r2.getProperty(r11)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x03d1
                java.lang.Object r0 = r2.getValue(r11)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Ceiling10Service$u1 r1 = r4.f12896a
                r1.mo32318d(r0)
                goto L_0x03d1
            L_0x0267:
                r4 = r25
                r2 = r26
                com.miot.common.property.Property r0 = r2.getProperty(r12)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x03d1
                java.lang.Object r0 = r2.getValue(r12)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Ceiling10Service$u1 r1 = r4.f12896a
                r1.mo32316b(r0)
                goto L_0x03d1
            L_0x0282:
                r4 = r25
                r2 = r26
                com.miot.common.property.Property r0 = r2.getProperty(r13)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x03d1
                java.lang.Object r0 = r2.getValue(r13)
                java.lang.String r0 = (java.lang.String) r0
                com.yeelight.yeelib.device.xiaomi.Ceiling10Service$Power r0 = com.yeelight.yeelib.device.xiaomi.Ceiling10Service.Power.valueOf(r0)
                com.yeelight.yeelib.device.xiaomi.Ceiling10Service$u1 r1 = r4.f12896a
                r1.mo32334u(r0)
                goto L_0x03d1
            L_0x02a1:
                r4 = r25
                r2 = r26
                com.miot.common.property.Property r0 = r2.getProperty(r14)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x03d1
                java.lang.Object r0 = r2.getValue(r14)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Ceiling10Service$u1 r1 = r4.f12896a
                r1.mo32328n(r0)
                goto L_0x03d1
            L_0x02bc:
                r4 = r25
                r2 = r26
                com.miot.common.property.Property r0 = r2.getProperty(r15)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x03d1
                java.lang.Object r0 = r2.getValue(r15)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Ceiling10Service$u1 r1 = r4.f12896a
                r1.mo32320f(r0)
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
                com.yeelight.yeelib.device.xiaomi.Ceiling10Service$u1 r1 = r4.f12896a
                r1.mo32324j(r0)
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
                com.yeelight.yeelib.device.xiaomi.Ceiling10Service$u1 r1 = r4.f12896a
                r1.mo32322h(r0)
                goto L_0x03d1
            L_0x0311:
                r4 = r25
                r2 = r26
                com.miot.common.property.Property r1 = r2.getProperty(r0)
                boolean r1 = r1.isValueValid()
                if (r1 == 0) goto L_0x03d1
                java.lang.Object r0 = r2.getValue(r0)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Ceiling10Service$u1 r1 = r4.f12896a
                r1.mo32327m(r0)
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
                com.yeelight.yeelib.device.xiaomi.Ceiling10Service$u1 r1 = r4.f12896a
                r1.mo32325k(r0)
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
                com.yeelight.yeelib.device.xiaomi.Ceiling10Service$u1 r1 = r4.f12896a
                r1.mo32323i(r0)
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
                com.yeelight.yeelib.device.xiaomi.Ceiling10Service$u1 r1 = r4.f12896a
                r1.mo32331r(r0)
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
                com.yeelight.yeelib.device.xiaomi.Ceiling10Service$u1 r1 = r4.f12896a
                r1.mo32319e(r0)
                goto L_0x03d1
            L_0x039e:
                r4 = r25
                r2 = r26
                com.miot.common.property.Property r0 = r2.getProperty(r3)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x03d1
                java.lang.Object r0 = r2.getValue(r3)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Ceiling10Service$u1 r1 = r4.f12896a
                r1.mo32326l(r0)
                goto L_0x03d1
            L_0x03b8:
                r4 = r25
                r2 = r26
                com.miot.common.property.Property r0 = r2.getProperty(r1)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x03d1
                java.lang.Object r0 = r2.getValue(r1)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Ceiling10Service$u1 r1 = r4.f12896a
                r1.mo32317c(r0)
            L_0x03d1:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.xiaomi.Ceiling10Service.C6454v.onPropertyChanged(com.miot.common.device.invocation.PropertyInfo, java.lang.String):void");
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$v0 */
    class C6455v0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6399c1 f12897a;

        C6455v0(Ceiling10Service ceiling10Service, C6399c1 c1Var) {
            this.f12897a = c1Var;
        }

        public void onFailed(int i, String str) {
            this.f12897a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("BgPower");
            if (property.isValueValid()) {
                this.f12897a.mo32279a(BgPower.valueOf((String) propertyInfo.getValue("BgPower")));
                return;
            }
            C6399c1 c1Var = this.f12897a;
            c1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$w */
    class C6456w implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12898a;

        C6456w(Ceiling10Service ceiling10Service, CompletionHandler completionHandler) {
            this.f12898a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12898a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12898a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$w0 */
    class C6457w0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6408f1 f12899a;

        C6457w0(Ceiling10Service ceiling10Service, C6408f1 f1Var) {
            this.f12899a = f1Var;
        }

        public void onFailed(int i, String str) {
            this.f12899a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Bright");
            if (property.isValueValid()) {
                this.f12899a.mo32285a((Long) propertyInfo.getValue("Bright"));
                return;
            }
            C6408f1 f1Var = this.f12899a;
            f1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$x */
    class C6458x implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12900a;

        C6458x(Ceiling10Service ceiling10Service, CompletionHandler completionHandler) {
            this.f12900a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12900a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12900a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$x0 */
    class C6459x0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6461y0 f12901a;

        C6459x0(Ceiling10Service ceiling10Service, C6461y0 y0Var) {
            this.f12901a = y0Var;
        }

        public void onFailed(int i, String str) {
            this.f12901a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("BgBright");
            if (property.isValueValid()) {
                this.f12901a.mo32336a((Long) propertyInfo.getValue("BgBright"));
                return;
            }
            C6461y0 y0Var = this.f12901a;
            y0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$y */
    class C6460y implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12902a;

        C6460y(Ceiling10Service ceiling10Service, CompletionHandler completionHandler) {
            this.f12902a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12902a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12902a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$y0 */
    public interface C6461y0 {
        /* renamed from: a */
        void mo32336a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$z */
    class C6462z implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12903a;

        C6462z(Ceiling10Service ceiling10Service, CompletionHandler completionHandler) {
            this.f12903a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12903a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12903a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$z0 */
    public interface C6463z0 {
        /* renamed from: a */
        void mo32338a(Long l);

        void onFailed(int i, String str);
    }

    public Ceiling10Service(AbstractDevice abstractDevice) {
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
                MiotManager.getDeviceManipulator().invoke(create, new C6460y(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6422k0(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getBgBright(C6461y0 y0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "BgBright"), new C6459x0(this, y0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getBgCt(C6463z0 z0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "BgCt"), new C6394b(this, z0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getBgFlowParams(C6393a1 a1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "BgFlowParams"), new C6403e(this, a1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getBgFlowing(C6396b1 b1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "BgFlowing"), new C6433o(this, b1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getBgPower(C6399c1 c1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "BgPower"), new C6455v0(this, c1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getBgProact(C6402d1 d1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "BgProact"), new C6436p(this, d1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getBgRgb(C6405e1 e1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "BgRgb"), new C6427m(this, e1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getBright(C6408f1 f1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Bright"), new C6457w0(this, f1Var));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6446s0(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getCt(C6411g1 g1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Ct"), new C6391a(this, g1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getDelayOff(C6414h1 h1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "DelayOff"), new C6397c(this, h1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowParams(C6417i1 i1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "FlowParams"), new C6400d(this, i1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowing(C6420j1 j1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Flowing"), new C6430n(this, j1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getLanMode(C6423k1 k1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "LanMode"), new C6406f(this, k1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getMainPower(C6426l1 l1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "MainPower"), new C6449t0(this, l1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getMiBandSleep(C6429m1 m1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "MiBandSleep"), new C6424l(this, m1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getNLBright(C6432n1 n1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "NLBright"), new C6415i(this, n1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getNightTimeInfo(C6435o1 o1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "NightTimeInfo"), new C6418j(this, o1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getPower(C6438p1 p1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Power"), new C6452u0(this, p1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getProperties(C6441q1 q1Var) {
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
            MiotManager.getDeviceManipulator().readProperty(create, new C6443r0(this, q1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getSaveState(C6444r1 r1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "SaveState"), new C6409g(this, r1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getSmartSwitch(C6447s1 s1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "SmartSwitch"), new C6439q(this, s1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getonFromPower(C6450t1 t1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "onFromPower"), new C6412h(this, t1Var));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6458x(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6451u(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6425l0(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6395b0(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6416i0(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6462z(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6407f0(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6442r(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6448t(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6419j0(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6445s(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6440q0(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6437p0(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6431n0(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6401d0(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6392a0(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6456w(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6428m0(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6404e0(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6398c0(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6413h0(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void subscribeNotifications(CompletionHandler completionHandler, C6453u1 u1Var) {
        if (completionHandler == null) {
            throw new IllegalArgumentException("handler is null");
        } else if (u1Var != null) {
            PropertyInfo create = PropertyInfoFactory.create(getService());
            for (Property next : getService().getProperties()) {
                if (next.getDefinition().isNotifiable()) {
                    create.addProperty(next);
                }
            }
            MiotManager.getDeviceManipulator().addPropertyChangedListener(create, new C6421k(this, completionHandler), new C6454v(this, u1Var));
        } else {
            throw new IllegalArgumentException("listener is null");
        }
    }

    public void toggle(CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "toggle");
            if (create != null) {
                MiotManager.getDeviceManipulator().invoke(create, new C6434o0(this, completionHandler));
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
            MiotManager.getDeviceManipulator().removePropertyChangedListener(create, new C6410g0(this, completionHandler));
            return;
        }
        throw new IllegalArgumentException("handler is null");
    }
}
