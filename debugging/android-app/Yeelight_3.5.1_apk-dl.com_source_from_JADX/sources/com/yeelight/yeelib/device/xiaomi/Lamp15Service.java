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

public class Lamp15Service extends AbstractService {
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
    public static final String PROPERTY_Mode = "Mode";
    public static final String PROPERTY_ParamColors = "ParamColors";
    public static final String PROPERTY_ParamCount = "ParamCount";
    public static final String PROPERTY_ParamFinish = "ParamFinish";
    public static final String PROPERTY_ParamModel = "ParamModel";
    public static final String PROPERTY_Power = "Power";
    public static final String PROPERTY_SaveState = "SaveState";
    public static final String PROPERTY_adjustAction = "adjustAction";
    public static final String PROPERTY_adjustProper = "adjustProper";
    public static final String PROPERTY_onFromPower = "onFromPower";
    private static final String TAG = "Lamp15Service";
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

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp15Service$a */
    class C7409a implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7414b1 f13577a;

        C7409a(Lamp15Service lamp15Service, C7414b1 b1Var) {
            this.f13577a = b1Var;
        }

        public void onFailed(int i, String str) {
            this.f13577a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Ct");
            if (property.isValueValid()) {
                this.f13577a.mo33833a((Long) propertyInfo.getValue("Ct"));
                return;
            }
            C7414b1 b1Var = this.f13577a;
            b1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp15Service$a0 */
    class C7410a0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13578a;

        C7410a0(Lamp15Service lamp15Service, CompletionHandler completionHandler) {
            this.f13578a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13578a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13578a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp15Service$a1 */
    public interface C7411a1 {
        /* renamed from: a */
        void mo33831a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp15Service$b */
    class C7412b implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7462u0 f13579a;

        C7412b(Lamp15Service lamp15Service, C7462u0 u0Var) {
            this.f13579a = u0Var;
        }

        public void onFailed(int i, String str) {
            this.f13579a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("BgCt");
            if (property.isValueValid()) {
                this.f13579a.mo33872a((Long) propertyInfo.getValue("BgCt"));
                return;
            }
            C7462u0 u0Var = this.f13579a;
            u0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp15Service$b0 */
    class C7413b0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13580a;

        C7413b0(Lamp15Service lamp15Service, CompletionHandler completionHandler) {
            this.f13580a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13580a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13580a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp15Service$b1 */
    public interface C7414b1 {
        /* renamed from: a */
        void mo33833a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp15Service$c */
    class C7415c implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7417c1 f13581a;

        C7415c(Lamp15Service lamp15Service, C7417c1 c1Var) {
            this.f13581a = c1Var;
        }

        public void onFailed(int i, String str) {
            this.f13581a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("DelayOff");
            if (property.isValueValid()) {
                this.f13581a.mo33835a((Long) propertyInfo.getValue("DelayOff"));
                return;
            }
            C7417c1 c1Var = this.f13581a;
            c1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp15Service$c0 */
    class C7416c0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13582a;

        C7416c0(Lamp15Service lamp15Service, CompletionHandler completionHandler) {
            this.f13582a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13582a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13582a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp15Service$c1 */
    public interface C7417c1 {
        /* renamed from: a */
        void mo33835a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp15Service$d */
    class C7418d implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7420d1 f13583a;

        C7418d(Lamp15Service lamp15Service, C7420d1 d1Var) {
            this.f13583a = d1Var;
        }

        public void onFailed(int i, String str) {
            this.f13583a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("FlowParams");
            if (property.isValueValid()) {
                this.f13583a.onSucceed((String) propertyInfo.getValue("FlowParams"));
                return;
            }
            C7420d1 d1Var = this.f13583a;
            d1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp15Service$d0 */
    class C7419d0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13584a;

        C7419d0(Lamp15Service lamp15Service, CompletionHandler completionHandler) {
            this.f13584a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13584a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13584a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp15Service$d1 */
    public interface C7420d1 {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp15Service$e */
    class C7421e implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7464v0 f13585a;

        C7421e(Lamp15Service lamp15Service, C7464v0 v0Var) {
            this.f13585a = v0Var;
        }

        public void onFailed(int i, String str) {
            this.f13585a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("BgFlowParams");
            if (property.isValueValid()) {
                this.f13585a.onSucceed((String) propertyInfo.getValue("BgFlowParams"));
                return;
            }
            C7464v0 v0Var = this.f13585a;
            v0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp15Service$e0 */
    class C7422e0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13586a;

        C7422e0(Lamp15Service lamp15Service, CompletionHandler completionHandler) {
            this.f13586a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13586a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13586a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp15Service$e1 */
    public interface C7423e1 {
        /* renamed from: a */
        void mo33839a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp15Service$f */
    class C7424f implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7426f1 f13587a;

        C7424f(Lamp15Service lamp15Service, C7426f1 f1Var) {
            this.f13587a = f1Var;
        }

        public void onFailed(int i, String str) {
            this.f13587a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("LanMode");
            if (property.isValueValid()) {
                this.f13587a.mo33841a((Long) propertyInfo.getValue("LanMode"));
                return;
            }
            C7426f1 f1Var = this.f13587a;
            f1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp15Service$f0 */
    class C7425f0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13588a;

        C7425f0(Lamp15Service lamp15Service, CompletionHandler completionHandler) {
            this.f13588a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13588a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13588a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp15Service$f1 */
    public interface C7426f1 {
        /* renamed from: a */
        void mo33841a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp15Service$g */
    class C7427g implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7438j1 f13589a;

        C7427g(Lamp15Service lamp15Service, C7438j1 j1Var) {
            this.f13589a = j1Var;
        }

        public void onFailed(int i, String str) {
            this.f13589a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("SaveState");
            if (property.isValueValid()) {
                this.f13589a.mo33849a((Long) propertyInfo.getValue("SaveState"));
                return;
            }
            C7438j1 j1Var = this.f13589a;
            j1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp15Service$g0 */
    class C7428g0 implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13590a;

        C7428g0(Lamp15Service lamp15Service, CompletionHandler completionHandler) {
            this.f13590a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13590a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f13590a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp15Service$g1 */
    public interface C7429g1 {
        /* renamed from: a */
        void mo33843a(MainPower mainPower);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp15Service$h */
    class C7430h implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7441k1 f13591a;

        C7430h(Lamp15Service lamp15Service, C7441k1 k1Var) {
            this.f13591a = k1Var;
        }

        public void onFailed(int i, String str) {
            this.f13591a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("onFromPower");
            if (property.isValueValid()) {
                this.f13591a.mo33851a((Long) propertyInfo.getValue("onFromPower"));
                return;
            }
            C7441k1 k1Var = this.f13591a;
            k1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp15Service$h0 */
    class C7431h0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13592a;

        C7431h0(Lamp15Service lamp15Service, CompletionHandler completionHandler) {
            this.f13592a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13592a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13592a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp15Service$h1 */
    public interface C7432h1 {
        /* renamed from: a */
        void mo33845a(Power power);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp15Service$i */
    class C7433i implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7472z0 f13593a;

        C7433i(Lamp15Service lamp15Service, C7472z0 z0Var) {
            this.f13593a = z0Var;
        }

        public void onFailed(int i, String str) {
            this.f13593a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("BgRgb");
            if (property.isValueValid()) {
                this.f13593a.mo33882a((Long) propertyInfo.getValue("BgRgb"));
                return;
            }
            C7472z0 z0Var = this.f13593a;
            z0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp15Service$i0 */
    class C7434i0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13594a;

        C7434i0(Lamp15Service lamp15Service, CompletionHandler completionHandler) {
            this.f13594a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13594a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13594a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp15Service$i1 */
    public interface C7435i1 {
        /* renamed from: a */
        void mo33847a(MainPower mainPower, Power power, BgPower bgPower, Long l, Long l2, Long l3, Long l4, Long l5, String str, String str2, Long l6, Long l7, Long l8, Long l9, Long l10, Long l11, Long l12);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp15Service$j */
    class C7436j implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7423e1 f13595a;

        C7436j(Lamp15Service lamp15Service, C7423e1 e1Var) {
            this.f13595a = e1Var;
        }

        public void onFailed(int i, String str) {
            this.f13595a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Flowing");
            if (property.isValueValid()) {
                this.f13595a.mo33839a((Long) propertyInfo.getValue("Flowing"));
                return;
            }
            C7423e1 e1Var = this.f13595a;
            e1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp15Service$j0 */
    class C7437j0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13596a;

        C7437j0(Lamp15Service lamp15Service, CompletionHandler completionHandler) {
            this.f13596a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13596a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13596a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp15Service$j1 */
    public interface C7438j1 {
        /* renamed from: a */
        void mo33849a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp15Service$k */
    class C7439k implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13597a;

        C7439k(Lamp15Service lamp15Service, CompletionHandler completionHandler) {
            this.f13597a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13597a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f13597a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp15Service$k0 */
    class C7440k0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13598a;

        C7440k0(Lamp15Service lamp15Service, CompletionHandler completionHandler) {
            this.f13598a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13598a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13598a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp15Service$k1 */
    public interface C7441k1 {
        /* renamed from: a */
        void mo33851a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp15Service$l */
    class C7442l implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7466w0 f13599a;

        C7442l(Lamp15Service lamp15Service, C7466w0 w0Var) {
            this.f13599a = w0Var;
        }

        public void onFailed(int i, String str) {
            this.f13599a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("BgFlowing");
            if (property.isValueValid()) {
                this.f13599a.mo33876a((Long) propertyInfo.getValue("BgFlowing"));
                return;
            }
            C7466w0 w0Var = this.f13599a;
            w0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp15Service$l0 */
    class C7443l0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13600a;

        C7443l0(Lamp15Service lamp15Service, CompletionHandler completionHandler) {
            this.f13600a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13600a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13600a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp15Service$l1 */
    public interface C7444l1 {
        /* renamed from: a */
        void mo33853a(Long l);

        /* renamed from: b */
        void mo33854b(Long l);

        /* renamed from: c */
        void mo33855c(Long l);

        /* renamed from: d */
        void mo33856d(Long l);

        /* renamed from: e */
        void mo33857e(String str);

        /* renamed from: f */
        void mo33858f(Long l);

        /* renamed from: g */
        void mo33859g(Long l);

        /* renamed from: h */
        void mo33860h(Long l);

        /* renamed from: i */
        void mo33861i(BgPower bgPower);

        /* renamed from: j */
        void mo33862j(Long l);

        /* renamed from: k */
        void mo33863k(Power power);

        /* renamed from: l */
        void mo33864l(Long l);

        /* renamed from: m */
        void mo33865m(MainPower mainPower);

        /* renamed from: n */
        void mo33866n(Long l);

        /* renamed from: q */
        void mo33867q(String str);

        /* renamed from: r */
        void mo33868r(Long l);

        /* renamed from: s */
        void mo33869s(Long l);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp15Service$m */
    class C7445m implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7470y0 f13601a;

        C7445m(Lamp15Service lamp15Service, C7470y0 y0Var) {
            this.f13601a = y0Var;
        }

        public void onFailed(int i, String str) {
            this.f13601a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("BgProact");
            if (property.isValueValid()) {
                this.f13601a.mo33880a((Long) propertyInfo.getValue("BgProact"));
                return;
            }
            C7470y0 y0Var = this.f13601a;
            y0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp15Service$m0 */
    class C7446m0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13602a;

        C7446m0(Lamp15Service lamp15Service, CompletionHandler completionHandler) {
            this.f13602a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13602a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13602a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp15Service$n */
    class C7447n implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13603a;

        C7447n(Lamp15Service lamp15Service, CompletionHandler completionHandler) {
            this.f13603a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13603a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13603a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp15Service$n0 */
    class C7448n0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7435i1 f13604a;

        C7448n0(Lamp15Service lamp15Service, C7435i1 i1Var) {
            this.f13604a = i1Var;
        }

        public void onFailed(int i, String str) {
            this.f13604a.onFailed(i, str);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.Long} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onSucceed(com.miot.common.device.invocation.PropertyInfo r23) {
            /*
                r22 = this;
                r0 = r23
                java.lang.String r1 = "MainPower"
                com.miot.common.property.Property r1 = r0.getProperty(r1)
                boolean r2 = r1.isValueValid()
                r3 = 0
                if (r2 == 0) goto L_0x001b
                java.lang.Object r1 = r1.getValue()
                java.lang.String r1 = (java.lang.String) r1
                com.yeelight.yeelib.device.xiaomi.Lamp15Service$MainPower r1 = com.yeelight.yeelib.device.xiaomi.Lamp15Service.MainPower.valueOf(r1)
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
                com.yeelight.yeelib.device.xiaomi.Lamp15Service$Power r1 = com.yeelight.yeelib.device.xiaomi.Lamp15Service.Power.valueOf(r1)
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
                com.yeelight.yeelib.device.xiaomi.Lamp15Service$BgPower r1 = com.yeelight.yeelib.device.xiaomi.Lamp15Service.BgPower.valueOf(r1)
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
                java.lang.String r1 = "BgRgb"
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
                java.lang.String r1 = "Flowing"
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
                java.lang.String r1 = "BgFlowing"
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
                java.lang.String r1 = "BgProact"
                com.miot.common.property.Property r0 = r0.getProperty(r1)
                boolean r1 = r0.isValueValid()
                if (r1 == 0) goto L_0x017c
                java.lang.Object r0 = r0.getValue()
                r3 = r0
                java.lang.Long r3 = (java.lang.Long) r3
            L_0x017c:
                r0 = r22
                r21 = r3
                com.yeelight.yeelib.device.xiaomi.Lamp15Service$i1 r4 = r0.f13604a
                r4.mo33847a(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.xiaomi.Lamp15Service.C7448n0.onSucceed(com.miot.common.device.invocation.PropertyInfo):void");
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp15Service$o */
    class C7449o implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13605a;

        C7449o(Lamp15Service lamp15Service, CompletionHandler completionHandler) {
            this.f13605a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13605a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13605a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp15Service$o0 */
    class C7450o0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7429g1 f13606a;

        C7450o0(Lamp15Service lamp15Service, C7429g1 g1Var) {
            this.f13606a = g1Var;
        }

        public void onFailed(int i, String str) {
            this.f13606a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("MainPower");
            if (property.isValueValid()) {
                this.f13606a.mo33843a(MainPower.valueOf((String) propertyInfo.getValue("MainPower")));
                return;
            }
            C7429g1 g1Var = this.f13606a;
            g1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp15Service$p */
    class C7451p implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13607a;

        C7451p(Lamp15Service lamp15Service, CompletionHandler completionHandler) {
            this.f13607a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13607a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13607a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp15Service$p0 */
    class C7452p0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7432h1 f13608a;

        C7452p0(Lamp15Service lamp15Service, C7432h1 h1Var) {
            this.f13608a = h1Var;
        }

        public void onFailed(int i, String str) {
            this.f13608a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Power");
            if (property.isValueValid()) {
                this.f13608a.mo33845a(Power.valueOf((String) propertyInfo.getValue("Power")));
                return;
            }
            C7432h1 h1Var = this.f13608a;
            h1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp15Service$q */
    class C7453q implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13609a;

        C7453q(Lamp15Service lamp15Service, CompletionHandler completionHandler) {
            this.f13609a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13609a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13609a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp15Service$q0 */
    class C7454q0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7468x0 f13610a;

        C7454q0(Lamp15Service lamp15Service, C7468x0 x0Var) {
            this.f13610a = x0Var;
        }

        public void onFailed(int i, String str) {
            this.f13610a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("BgPower");
            if (property.isValueValid()) {
                this.f13610a.mo33878a(BgPower.valueOf((String) propertyInfo.getValue("BgPower")));
                return;
            }
            C7468x0 x0Var = this.f13610a;
            x0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp15Service$r */
    class C7455r implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13611a;

        C7455r(Lamp15Service lamp15Service, CompletionHandler completionHandler) {
            this.f13611a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13611a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13611a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp15Service$r0 */
    class C7456r0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7411a1 f13612a;

        C7456r0(Lamp15Service lamp15Service, C7411a1 a1Var) {
            this.f13612a = a1Var;
        }

        public void onFailed(int i, String str) {
            this.f13612a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Bright");
            if (property.isValueValid()) {
                this.f13612a.mo33831a((Long) propertyInfo.getValue("Bright"));
                return;
            }
            C7411a1 a1Var = this.f13612a;
            a1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp15Service$s */
    class C7457s implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13613a;

        C7457s(Lamp15Service lamp15Service, CompletionHandler completionHandler) {
            this.f13613a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13613a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13613a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp15Service$s0 */
    class C7458s0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7460t0 f13614a;

        C7458s0(Lamp15Service lamp15Service, C7460t0 t0Var) {
            this.f13614a = t0Var;
        }

        public void onFailed(int i, String str) {
            this.f13614a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("BgBright");
            if (property.isValueValid()) {
                this.f13614a.mo33870a((Long) propertyInfo.getValue("BgBright"));
                return;
            }
            C7460t0 t0Var = this.f13614a;
            t0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp15Service$t */
    class C7459t implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13615a;

        C7459t(Lamp15Service lamp15Service, CompletionHandler completionHandler) {
            this.f13615a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13615a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13615a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp15Service$t0 */
    public interface C7460t0 {
        /* renamed from: a */
        void mo33870a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp15Service$u */
    class C7461u implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13616a;

        C7461u(Lamp15Service lamp15Service, CompletionHandler completionHandler) {
            this.f13616a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13616a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13616a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp15Service$u0 */
    public interface C7462u0 {
        /* renamed from: a */
        void mo33872a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp15Service$v */
    class C7463v implements DeviceManipulator.PropertyChangedListener {

        /* renamed from: a */
        final /* synthetic */ C7444l1 f13617a;

        C7463v(Lamp15Service lamp15Service, C7444l1 l1Var) {
            this.f13617a = l1Var;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:100:0x02a6, code lost:
            r4 = r21;
            r2 = r22;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:101:0x02b2, code lost:
            if (r2.getProperty(r0).isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:102:0x02b4, code lost:
            r4.f13617a.mo33857e((java.lang.String) r2.getValue(r0));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:103:0x02c0, code lost:
            r4 = r21;
            r2 = r22;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:104:0x02cc, code lost:
            if (r2.getProperty(r3).isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:105:0x02ce, code lost:
            r4.f13617a.mo33864l((java.lang.Long) r2.getValue(r3));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:106:0x02da, code lost:
            r4 = r21;
            r2 = r22;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:107:0x02e6, code lost:
            if (r2.getProperty("SaveState").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:108:0x02e8, code lost:
            r4.f13617a.mo33855c((java.lang.Long) r2.getValue("SaveState"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:109:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:110:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:111:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:112:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:113:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:114:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:115:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:116:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:117:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:118:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:119:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:120:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:121:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:122:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:123:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:124:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:125:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:126:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:127:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:128:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:129:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:130:?, code lost:
            return;
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
        /* JADX WARNING: Code restructure failed: missing block: B:2:0x003a, code lost:
            r3 = r18;
            r20 = r16;
            r16 = "Ct";
            r0 = r17;
            r17 = r20;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:0x00eb, code lost:
            r17 = r3;
            r3 = r18;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:56:0x0117, code lost:
            switch(r19) {
                case 0: goto L_0x02da;
                case 1: goto L_0x02c0;
                case 2: goto L_0x02a6;
                case 3: goto L_0x028a;
                case 4: goto L_0x026e;
                case 5: goto L_0x0253;
                case 6: goto L_0x0238;
                case 7: goto L_0x021d;
                case 8: goto L_0x01fe;
                case 9: goto L_0x01e3;
                case 10: goto L_0x01c8;
                case 11: goto L_0x01ad;
                case 12: goto L_0x018e;
                case 13: goto L_0x0173;
                case 14: goto L_0x0154;
                case 15: goto L_0x0139;
                case 16: goto L_0x011e;
                default: goto L_0x011a;
            };
         */
        /* JADX WARNING: Code restructure failed: missing block: B:57:0x011a, code lost:
            r4 = r21;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:58:0x011e, code lost:
            r2 = r22;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:59:0x0128, code lost:
            if (r2.getProperty("Bright").isValueValid() == false) goto L_0x011a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:60:0x012a, code lost:
            r21.f13617a.mo33853a((java.lang.Long) r2.getValue("Bright"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:61:0x0139, code lost:
            r4 = r21;
            r2 = r22;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:62:0x0145, code lost:
            if (r2.getProperty("BgFlowParams").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:63:0x0147, code lost:
            r4.f13617a.mo33867q((java.lang.String) r2.getValue("BgFlowParams"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:64:0x0154, code lost:
            r4 = r21;
            r2 = r22;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:65:0x0160, code lost:
            if (r2.getProperty("MainPower").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:66:0x0162, code lost:
            r4.f13617a.mo33865m(com.yeelight.yeelib.device.xiaomi.Lamp15Service.MainPower.valueOf((java.lang.String) r2.getValue("MainPower")));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:67:0x0173, code lost:
            r4 = r21;
            r2 = r22;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:68:0x017f, code lost:
            if (r2.getProperty("LanMode").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:69:0x0181, code lost:
            r4.f13617a.mo33859g((java.lang.Long) r2.getValue("LanMode"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:70:0x018e, code lost:
            r4 = r21;
            r2 = r22;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:71:0x019a, code lost:
            if (r2.getProperty("BgPower").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:72:0x019c, code lost:
            r4.f13617a.mo33861i(com.yeelight.yeelib.device.xiaomi.Lamp15Service.BgPower.valueOf((java.lang.String) r2.getValue("BgPower")));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:73:0x01ad, code lost:
            r4 = r21;
            r2 = r22;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:74:0x01b9, code lost:
            if (r2.getProperty("BgFlowing").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:75:0x01bb, code lost:
            r4.f13617a.mo33869s((java.lang.Long) r2.getValue("BgFlowing"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:76:0x01c8, code lost:
            r4 = r21;
            r2 = r22;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:77:0x01d4, code lost:
            if (r2.getProperty("Flowing").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:78:0x01d6, code lost:
            r4.f13617a.mo33856d((java.lang.Long) r2.getValue("Flowing"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:79:0x01e3, code lost:
            r4 = r21;
            r2 = r22;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:80:0x01ef, code lost:
            if (r2.getProperty("DelayOff").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:81:0x01f1, code lost:
            r4.f13617a.mo33854b((java.lang.Long) r2.getValue("DelayOff"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:82:0x01fe, code lost:
            r4 = r21;
            r2 = r22;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:83:0x020a, code lost:
            if (r2.getProperty("Power").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:84:0x020c, code lost:
            r4.f13617a.mo33863k(com.yeelight.yeelib.device.xiaomi.Lamp15Service.Power.valueOf((java.lang.String) r2.getValue("Power")));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:85:0x021d, code lost:
            r4 = r21;
            r2 = r22;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:86:0x0229, code lost:
            if (r2.getProperty("BgRgb").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:87:0x022b, code lost:
            r4.f13617a.mo33866n((java.lang.Long) r2.getValue("BgRgb"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:88:0x0238, code lost:
            r4 = r21;
            r2 = r22;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:89:0x0244, code lost:
            if (r2.getProperty("onFromPower").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:90:0x0246, code lost:
            r4.f13617a.mo33858f((java.lang.Long) r2.getValue("onFromPower"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:91:0x0253, code lost:
            r4 = r21;
            r2 = r22;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:92:0x025f, code lost:
            if (r2.getProperty("BgCt").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:93:0x0261, code lost:
            r4.f13617a.mo33862j((java.lang.Long) r2.getValue("BgCt"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:94:0x026e, code lost:
            r4 = r21;
            r2 = r22;
            r0 = r16;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:95:0x027c, code lost:
            if (r2.getProperty(r0).isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:96:0x027e, code lost:
            r4.f13617a.mo33860h((java.lang.Long) r2.getValue(r0));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:97:0x028a, code lost:
            r4 = r21;
            r2 = r22;
            r0 = r17;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:98:0x0298, code lost:
            if (r2.getProperty(r0).isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:99:0x029a, code lost:
            r4.f13617a.mo33868r((java.lang.Long) r2.getValue(r0));
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onPropertyChanged(com.miot.common.device.invocation.PropertyInfo r22, java.lang.String r23) {
            /*
                r21 = this;
                r0 = r21
                r1 = r22
                r2 = r23
                r23.hashCode()
                int r3 = r23.hashCode()
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
                java.lang.String r1 = "BgProact"
                r16 = r1
                java.lang.String r1 = "FlowParams"
                r17 = r1
                java.lang.String r1 = "BgBright"
                r18 = r1
                java.lang.String r1 = "SaveState"
                r19 = -1
                switch(r3) {
                    case -2117953292: goto L_0x0104;
                    case -2017000513: goto L_0x00f0;
                    case -2002016140: goto L_0x00dc;
                    case -1616019574: goto L_0x00cc;
                    case 2193: goto L_0x00c0;
                    case 2067382: goto L_0x00b4;
                    case 35911772: goto L_0x00aa;
                    case 64102952: goto L_0x00a0;
                    case 77306085: goto L_0x0096;
                    case 880790796: goto L_0x008c;
                    case 898856916: goto L_0x0082;
                    case 986784719: goto L_0x0078;
                    case 1471809440: goto L_0x006e;
                    case 1611821756: goto L_0x0064;
                    case 1738956460: goto L_0x005a;
                    case 1820079769: goto L_0x0050;
                    case 1998035738: goto L_0x0046;
                    default: goto L_0x003a;
                }
            L_0x003a:
                r3 = r18
                r20 = r16
                r16 = r0
                r0 = r17
                r17 = r20
                goto L_0x0117
            L_0x0046:
                boolean r2 = r2.equals(r4)
                if (r2 != 0) goto L_0x004d
                goto L_0x003a
            L_0x004d:
                r19 = 16
                goto L_0x003a
            L_0x0050:
                boolean r2 = r2.equals(r5)
                if (r2 != 0) goto L_0x0057
                goto L_0x003a
            L_0x0057:
                r19 = 15
                goto L_0x003a
            L_0x005a:
                boolean r2 = r2.equals(r6)
                if (r2 != 0) goto L_0x0061
                goto L_0x003a
            L_0x0061:
                r19 = 14
                goto L_0x003a
            L_0x0064:
                boolean r2 = r2.equals(r7)
                if (r2 != 0) goto L_0x006b
                goto L_0x003a
            L_0x006b:
                r19 = 13
                goto L_0x003a
            L_0x006e:
                boolean r2 = r2.equals(r8)
                if (r2 != 0) goto L_0x0075
                goto L_0x003a
            L_0x0075:
                r19 = 12
                goto L_0x003a
            L_0x0078:
                boolean r2 = r2.equals(r9)
                if (r2 != 0) goto L_0x007f
                goto L_0x003a
            L_0x007f:
                r19 = 11
                goto L_0x003a
            L_0x0082:
                boolean r2 = r2.equals(r10)
                if (r2 != 0) goto L_0x0089
                goto L_0x003a
            L_0x0089:
                r19 = 10
                goto L_0x003a
            L_0x008c:
                boolean r2 = r2.equals(r11)
                if (r2 != 0) goto L_0x0093
                goto L_0x003a
            L_0x0093:
                r19 = 9
                goto L_0x003a
            L_0x0096:
                boolean r2 = r2.equals(r12)
                if (r2 != 0) goto L_0x009d
                goto L_0x003a
            L_0x009d:
                r19 = 8
                goto L_0x003a
            L_0x00a0:
                boolean r2 = r2.equals(r13)
                if (r2 != 0) goto L_0x00a7
                goto L_0x003a
            L_0x00a7:
                r19 = 7
                goto L_0x003a
            L_0x00aa:
                boolean r2 = r2.equals(r14)
                if (r2 != 0) goto L_0x00b1
                goto L_0x003a
            L_0x00b1:
                r19 = 6
                goto L_0x003a
            L_0x00b4:
                boolean r2 = r2.equals(r15)
                if (r2 != 0) goto L_0x00bc
                goto L_0x003a
            L_0x00bc:
                r19 = 5
                goto L_0x003a
            L_0x00c0:
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L_0x00c8
                goto L_0x003a
            L_0x00c8:
                r19 = 4
                goto L_0x003a
            L_0x00cc:
                r3 = r16
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L_0x00d5
                goto L_0x00d7
            L_0x00d5:
                r19 = 3
            L_0x00d7:
                r16 = r0
                r0 = r17
                goto L_0x00eb
            L_0x00dc:
                r3 = r16
                r16 = r0
                r0 = r17
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L_0x00e9
                goto L_0x00eb
            L_0x00e9:
                r19 = 2
            L_0x00eb:
                r17 = r3
                r3 = r18
                goto L_0x0117
            L_0x00f0:
                r3 = r18
                r20 = r16
                r16 = r0
                r0 = r17
                r17 = r20
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L_0x0101
                goto L_0x0117
            L_0x0101:
                r19 = 1
                goto L_0x0117
            L_0x0104:
                r3 = r18
                r20 = r16
                r16 = r0
                r0 = r17
                r17 = r20
                boolean r2 = r2.equals(r1)
                if (r2 != 0) goto L_0x0115
                goto L_0x0117
            L_0x0115:
                r19 = 0
            L_0x0117:
                switch(r19) {
                    case 0: goto L_0x02da;
                    case 1: goto L_0x02c0;
                    case 2: goto L_0x02a6;
                    case 3: goto L_0x028a;
                    case 4: goto L_0x026e;
                    case 5: goto L_0x0253;
                    case 6: goto L_0x0238;
                    case 7: goto L_0x021d;
                    case 8: goto L_0x01fe;
                    case 9: goto L_0x01e3;
                    case 10: goto L_0x01c8;
                    case 11: goto L_0x01ad;
                    case 12: goto L_0x018e;
                    case 13: goto L_0x0173;
                    case 14: goto L_0x0154;
                    case 15: goto L_0x0139;
                    case 16: goto L_0x011e;
                    default: goto L_0x011a;
                }
            L_0x011a:
                r4 = r21
                goto L_0x02f3
            L_0x011e:
                r2 = r22
                com.miot.common.property.Property r0 = r2.getProperty(r4)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x011a
                java.lang.Object r0 = r2.getValue(r4)
                java.lang.Long r0 = (java.lang.Long) r0
                r4 = r21
                com.yeelight.yeelib.device.xiaomi.Lamp15Service$l1 r1 = r4.f13617a
                r1.mo33853a(r0)
                goto L_0x02f3
            L_0x0139:
                r4 = r21
                r2 = r22
                com.miot.common.property.Property r0 = r2.getProperty(r5)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x02f3
                java.lang.Object r0 = r2.getValue(r5)
                java.lang.String r0 = (java.lang.String) r0
                com.yeelight.yeelib.device.xiaomi.Lamp15Service$l1 r1 = r4.f13617a
                r1.mo33867q(r0)
                goto L_0x02f3
            L_0x0154:
                r4 = r21
                r2 = r22
                com.miot.common.property.Property r0 = r2.getProperty(r6)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x02f3
                java.lang.Object r0 = r2.getValue(r6)
                java.lang.String r0 = (java.lang.String) r0
                com.yeelight.yeelib.device.xiaomi.Lamp15Service$MainPower r0 = com.yeelight.yeelib.device.xiaomi.Lamp15Service.MainPower.valueOf(r0)
                com.yeelight.yeelib.device.xiaomi.Lamp15Service$l1 r1 = r4.f13617a
                r1.mo33865m(r0)
                goto L_0x02f3
            L_0x0173:
                r4 = r21
                r2 = r22
                com.miot.common.property.Property r0 = r2.getProperty(r7)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x02f3
                java.lang.Object r0 = r2.getValue(r7)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Lamp15Service$l1 r1 = r4.f13617a
                r1.mo33859g(r0)
                goto L_0x02f3
            L_0x018e:
                r4 = r21
                r2 = r22
                com.miot.common.property.Property r0 = r2.getProperty(r8)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x02f3
                java.lang.Object r0 = r2.getValue(r8)
                java.lang.String r0 = (java.lang.String) r0
                com.yeelight.yeelib.device.xiaomi.Lamp15Service$BgPower r0 = com.yeelight.yeelib.device.xiaomi.Lamp15Service.BgPower.valueOf(r0)
                com.yeelight.yeelib.device.xiaomi.Lamp15Service$l1 r1 = r4.f13617a
                r1.mo33861i(r0)
                goto L_0x02f3
            L_0x01ad:
                r4 = r21
                r2 = r22
                com.miot.common.property.Property r0 = r2.getProperty(r9)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x02f3
                java.lang.Object r0 = r2.getValue(r9)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Lamp15Service$l1 r1 = r4.f13617a
                r1.mo33869s(r0)
                goto L_0x02f3
            L_0x01c8:
                r4 = r21
                r2 = r22
                com.miot.common.property.Property r0 = r2.getProperty(r10)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x02f3
                java.lang.Object r0 = r2.getValue(r10)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Lamp15Service$l1 r1 = r4.f13617a
                r1.mo33856d(r0)
                goto L_0x02f3
            L_0x01e3:
                r4 = r21
                r2 = r22
                com.miot.common.property.Property r0 = r2.getProperty(r11)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x02f3
                java.lang.Object r0 = r2.getValue(r11)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Lamp15Service$l1 r1 = r4.f13617a
                r1.mo33854b(r0)
                goto L_0x02f3
            L_0x01fe:
                r4 = r21
                r2 = r22
                com.miot.common.property.Property r0 = r2.getProperty(r12)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x02f3
                java.lang.Object r0 = r2.getValue(r12)
                java.lang.String r0 = (java.lang.String) r0
                com.yeelight.yeelib.device.xiaomi.Lamp15Service$Power r0 = com.yeelight.yeelib.device.xiaomi.Lamp15Service.Power.valueOf(r0)
                com.yeelight.yeelib.device.xiaomi.Lamp15Service$l1 r1 = r4.f13617a
                r1.mo33863k(r0)
                goto L_0x02f3
            L_0x021d:
                r4 = r21
                r2 = r22
                com.miot.common.property.Property r0 = r2.getProperty(r13)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x02f3
                java.lang.Object r0 = r2.getValue(r13)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Lamp15Service$l1 r1 = r4.f13617a
                r1.mo33866n(r0)
                goto L_0x02f3
            L_0x0238:
                r4 = r21
                r2 = r22
                com.miot.common.property.Property r0 = r2.getProperty(r14)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x02f3
                java.lang.Object r0 = r2.getValue(r14)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Lamp15Service$l1 r1 = r4.f13617a
                r1.mo33858f(r0)
                goto L_0x02f3
            L_0x0253:
                r4 = r21
                r2 = r22
                com.miot.common.property.Property r0 = r2.getProperty(r15)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x02f3
                java.lang.Object r0 = r2.getValue(r15)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Lamp15Service$l1 r1 = r4.f13617a
                r1.mo33862j(r0)
                goto L_0x02f3
            L_0x026e:
                r4 = r21
                r2 = r22
                r0 = r16
                com.miot.common.property.Property r1 = r2.getProperty(r0)
                boolean r1 = r1.isValueValid()
                if (r1 == 0) goto L_0x02f3
                java.lang.Object r0 = r2.getValue(r0)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Lamp15Service$l1 r1 = r4.f13617a
                r1.mo33860h(r0)
                goto L_0x02f3
            L_0x028a:
                r4 = r21
                r2 = r22
                r0 = r17
                com.miot.common.property.Property r1 = r2.getProperty(r0)
                boolean r1 = r1.isValueValid()
                if (r1 == 0) goto L_0x02f3
                java.lang.Object r0 = r2.getValue(r0)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Lamp15Service$l1 r1 = r4.f13617a
                r1.mo33868r(r0)
                goto L_0x02f3
            L_0x02a6:
                r4 = r21
                r2 = r22
                com.miot.common.property.Property r1 = r2.getProperty(r0)
                boolean r1 = r1.isValueValid()
                if (r1 == 0) goto L_0x02f3
                java.lang.Object r0 = r2.getValue(r0)
                java.lang.String r0 = (java.lang.String) r0
                com.yeelight.yeelib.device.xiaomi.Lamp15Service$l1 r1 = r4.f13617a
                r1.mo33857e(r0)
                goto L_0x02f3
            L_0x02c0:
                r4 = r21
                r2 = r22
                com.miot.common.property.Property r0 = r2.getProperty(r3)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x02f3
                java.lang.Object r0 = r2.getValue(r3)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Lamp15Service$l1 r1 = r4.f13617a
                r1.mo33864l(r0)
                goto L_0x02f3
            L_0x02da:
                r4 = r21
                r2 = r22
                com.miot.common.property.Property r0 = r2.getProperty(r1)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x02f3
                java.lang.Object r0 = r2.getValue(r1)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Lamp15Service$l1 r1 = r4.f13617a
                r1.mo33855c(r0)
            L_0x02f3:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.xiaomi.Lamp15Service.C7463v.onPropertyChanged(com.miot.common.device.invocation.PropertyInfo, java.lang.String):void");
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp15Service$v0 */
    public interface C7464v0 {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp15Service$w */
    class C7465w implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13618a;

        C7465w(Lamp15Service lamp15Service, CompletionHandler completionHandler) {
            this.f13618a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13618a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13618a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp15Service$w0 */
    public interface C7466w0 {
        /* renamed from: a */
        void mo33876a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp15Service$x */
    class C7467x implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13619a;

        C7467x(Lamp15Service lamp15Service, CompletionHandler completionHandler) {
            this.f13619a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13619a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13619a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp15Service$x0 */
    public interface C7468x0 {
        /* renamed from: a */
        void mo33878a(BgPower bgPower);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp15Service$y */
    class C7469y implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13620a;

        C7469y(Lamp15Service lamp15Service, CompletionHandler completionHandler) {
            this.f13620a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13620a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13620a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp15Service$y0 */
    public interface C7470y0 {
        /* renamed from: a */
        void mo33880a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp15Service$z */
    class C7471z implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13621a;

        C7471z(Lamp15Service lamp15Service, CompletionHandler completionHandler) {
            this.f13621a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13621a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13621a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp15Service$z0 */
    public interface C7472z0 {
        /* renamed from: a */
        void mo33882a(Long l);

        void onFailed(int i, String str);
    }

    public Lamp15Service(AbstractDevice abstractDevice) {
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
                MiotManager.getDeviceManipulator().invoke(create, new C7410a0(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7453q(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getBgBright(C7460t0 t0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "BgBright"), new C7458s0(this, t0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getBgCt(C7462u0 u0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "BgCt"), new C7412b(this, u0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getBgFlowParams(C7464v0 v0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "BgFlowParams"), new C7421e(this, v0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getBgFlowing(C7466w0 w0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "BgFlowing"), new C7442l(this, w0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getBgPower(C7468x0 x0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "BgPower"), new C7454q0(this, x0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getBgProact(C7470y0 y0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "BgProact"), new C7445m(this, y0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getBgRgb(C7472z0 z0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "BgRgb"), new C7433i(this, z0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getBright(C7411a1 a1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Bright"), new C7456r0(this, a1Var));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7440k0(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getCt(C7414b1 b1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Ct"), new C7409a(this, b1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getDelayOff(C7417c1 c1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "DelayOff"), new C7415c(this, c1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowParams(C7420d1 d1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "FlowParams"), new C7418d(this, d1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowing(C7423e1 e1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Flowing"), new C7436j(this, e1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getLanMode(C7426f1 f1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "LanMode"), new C7424f(this, f1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getMainPower(C7429g1 g1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "MainPower"), new C7450o0(this, g1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getPower(C7432h1 h1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Power"), new C7452p0(this, h1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getProperties(C7435i1 i1Var) {
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
            create.addProperty(getService().getProperty("BgRgb"));
            create.addProperty(getService().getProperty("Flowing"));
            create.addProperty(getService().getProperty("BgFlowing"));
            create.addProperty(getService().getProperty("BgProact"));
            MiotManager.getDeviceManipulator().readProperty(create, new C7448n0(this, i1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getSaveState(C7438j1 j1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "SaveState"), new C7427g(this, j1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getonFromPower(C7441k1 k1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "onFromPower"), new C7430h(this, k1Var));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7471z(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7465w(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7455r(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7419d0(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7446m0(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7416c0(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7437j0(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7447n(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7461u(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7449o(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7451p(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7434i0(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7413b0(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7459t(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7425f0(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7467x(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7457s(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7431h0(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7422e0(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7443l0(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void subscribeNotifications(CompletionHandler completionHandler, C7444l1 l1Var) {
        if (completionHandler == null) {
            throw new IllegalArgumentException("handler is null");
        } else if (l1Var != null) {
            PropertyInfo create = PropertyInfoFactory.create(getService());
            for (Property next : getService().getProperties()) {
                if (next.getDefinition().isNotifiable()) {
                    create.addProperty(next);
                }
            }
            MiotManager.getDeviceManipulator().addPropertyChangedListener(create, new C7439k(this, completionHandler), new C7463v(this, l1Var));
        } else {
            throw new IllegalArgumentException("listener is null");
        }
    }

    public void toggle(CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "toggle");
            if (create != null) {
                MiotManager.getDeviceManipulator().invoke(create, new C7469y(this, completionHandler));
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
            MiotManager.getDeviceManipulator().removePropertyChangedListener(create, new C7428g0(this, completionHandler));
            return;
        }
        throw new IllegalArgumentException("handler is null");
    }
}
