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
    public static final String PROPERTY_BleCfg = "BleCfg";
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

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$a */
    class C8395a implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8445o1 f16375a;

        C8395a(CeilingbService ceilingbService, C8445o1 o1Var) {
            this.f16375a = o1Var;
        }

        public void onFailed(int i, String str) {
            this.f16375a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Ct");
            if (property.isValueValid()) {
                this.f16375a.mo30013a((Long) propertyInfo.getValue("Ct"));
                return;
            }
            C8445o1 o1Var = this.f16375a;
            o1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$a0 */
    class C8396a0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16376a;

        C8396a0(CeilingbService ceilingbService, CompletionHandler completionHandler) {
            this.f16376a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16376a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16376a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$a1 */
    class C8397a1 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8442n1 f16377a;

        C8397a1(CeilingbService ceilingbService, C8442n1 n1Var) {
            this.f16377a = n1Var;
        }

        public void onFailed(int i, String str) {
            this.f16377a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Bright");
            if (property.isValueValid()) {
                this.f16377a.mo30011a((Long) propertyInfo.getValue("Bright"));
                return;
            }
            C8442n1 n1Var = this.f16377a;
            n1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$a2 */
    public interface C8398a2 {
        /* renamed from: a */
        void mo29989a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$b */
    class C8399b implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8421g1 f16378a;

        C8399b(CeilingbService ceilingbService, C8421g1 g1Var) {
            this.f16378a = g1Var;
        }

        public void onFailed(int i, String str) {
            this.f16378a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("BgCt");
            if (property.isValueValid()) {
                this.f16378a.mo29997a((Long) propertyInfo.getValue("BgCt"));
                return;
            }
            C8421g1 g1Var = this.f16378a;
            g1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$b0 */
    class C8400b0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16379a;

        C8400b0(CeilingbService ceilingbService, CompletionHandler completionHandler) {
            this.f16379a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16379a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16379a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$b1 */
    class C8401b1 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8417f1 f16380a;

        C8401b1(CeilingbService ceilingbService, C8417f1 f1Var) {
            this.f16380a = f1Var;
        }

        public void onFailed(int i, String str) {
            this.f16380a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("BgBright");
            if (property.isValueValid()) {
                this.f16380a.mo29995a((Long) propertyInfo.getValue("BgBright"));
                return;
            }
            C8417f1 f1Var = this.f16380a;
            f1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$b2 */
    public interface C8402b2 {
        /* renamed from: a */
        void mo29991a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$c */
    class C8403c implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8448p1 f16381a;

        C8403c(CeilingbService ceilingbService, C8448p1 p1Var) {
            this.f16381a = p1Var;
        }

        public void onFailed(int i, String str) {
            this.f16381a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("DelayOff");
            if (property.isValueValid()) {
                this.f16381a.mo30015a((Long) propertyInfo.getValue("DelayOff"));
                return;
            }
            C8448p1 p1Var = this.f16381a;
            p1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$c0 */
    class C8404c0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16382a;

        C8404c0(CeilingbService ceilingbService, CompletionHandler completionHandler) {
            this.f16382a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16382a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16382a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$c1 */
    public enum C8405c1 {
        undefined,
        on,
        off
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$c2 */
    public interface C8406c2 {
        /* renamed from: a */
        void mo29993a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$d */
    class C8407d implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8451q1 f16387a;

        C8407d(CeilingbService ceilingbService, C8451q1 q1Var) {
            this.f16387a = q1Var;
        }

        public void onFailed(int i, String str) {
            this.f16387a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("FlowParams");
            if (property.isValueValid()) {
                this.f16387a.onSucceed((String) propertyInfo.getValue("FlowParams"));
                return;
            }
            C8451q1 q1Var = this.f16387a;
            q1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$d0 */
    class C8408d0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16388a;

        C8408d0(CeilingbService ceilingbService, CompletionHandler completionHandler) {
            this.f16388a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16388a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16388a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$d1 */
    public enum C8409d1 {
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

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$d2 */
    public enum C8410d2 {
        undefined,
        on,
        off
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$e */
    class C8411e implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8424h1 f16407a;

        C8411e(CeilingbService ceilingbService, C8424h1 h1Var) {
            this.f16407a = h1Var;
        }

        public void onFailed(int i, String str) {
            this.f16407a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("BgFlowParams");
            if (property.isValueValid()) {
                this.f16407a.onSucceed((String) propertyInfo.getValue("BgFlowParams"));
                return;
            }
            C8424h1 h1Var = this.f16407a;
            h1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$e0 */
    class C8412e0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16408a;

        C8412e0(CeilingbService ceilingbService, CompletionHandler completionHandler) {
            this.f16408a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16408a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16408a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$e1 */
    public enum C8413e1 {
        undefined,
        smooth,
        sudden
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$e2 */
    public enum C8414e2 {
        undefined,
        on,
        off
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$f */
    class C8415f implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8457s1 f16417a;

        C8415f(CeilingbService ceilingbService, C8457s1 s1Var) {
            this.f16417a = s1Var;
        }

        public void onFailed(int i, String str) {
            this.f16417a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("LanMode");
            if (property.isValueValid()) {
                this.f16417a.mo30021a((Long) propertyInfo.getValue("LanMode"));
                return;
            }
            C8457s1 s1Var = this.f16417a;
            s1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$f0 */
    class C8416f0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16418a;

        C8416f0(CeilingbService ceilingbService, CompletionHandler completionHandler) {
            this.f16418a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16418a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16418a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$f1 */
    public interface C8417f1 {
        /* renamed from: a */
        void mo29995a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$f2 */
    public interface C8418f2 {
        /* renamed from: a */
        void mo28594a(Long l);

        /* renamed from: b */
        void mo28595b(Long l);

        /* renamed from: c */
        void mo28596c(Long l);

        /* renamed from: d */
        void mo28597d(Long l);

        /* renamed from: e */
        void mo28598e(String str);

        /* renamed from: f */
        void mo28599f(Long l);

        /* renamed from: g */
        void mo28600g(Long l);

        /* renamed from: h */
        void mo28601h(Long l);

        /* renamed from: i */
        void mo28602i(String str);

        /* renamed from: j */
        void mo28603j(Long l);

        /* renamed from: k */
        void mo28604k(Long l);

        /* renamed from: l */
        void mo28605l(Long l);

        /* renamed from: m */
        void mo28606m(Long l);

        /* renamed from: n */
        void mo28607n(Long l);

        /* renamed from: o */
        void mo28608o(C8414e2 e2Var);

        /* renamed from: p */
        void mo28609p(Long l);

        /* renamed from: q */
        void mo28610q(Long l);

        /* renamed from: r */
        void mo28611r(String str);

        /* renamed from: s */
        void mo28612s(Long l);

        /* renamed from: t */
        void mo28613t(Long l);

        /* renamed from: u */
        void mo28614u(Long l);

        /* renamed from: v */
        void mo28615v(C8405c1 c1Var);

        /* renamed from: w */
        void mo28616w(C8410d2 d2Var);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$g */
    class C8419g implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8478z1 f16419a;

        C8419g(CeilingbService ceilingbService, C8478z1 z1Var) {
            this.f16419a = z1Var;
        }

        public void onFailed(int i, String str) {
            this.f16419a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("SaveState");
            if (property.isValueValid()) {
                this.f16419a.mo30033a((Long) propertyInfo.getValue("SaveState"));
                return;
            }
            C8478z1 z1Var = this.f16419a;
            z1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$g0 */
    class C8420g0 implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16420a;

        C8420g0(CeilingbService ceilingbService, CompletionHandler completionHandler) {
            this.f16420a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16420a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f16420a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$g1 */
    public interface C8421g1 {
        /* renamed from: a */
        void mo29997a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$h */
    class C8422h implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8402b2 f16421a;

        C8422h(CeilingbService ceilingbService, C8402b2 b2Var) {
            this.f16421a = b2Var;
        }

        public void onFailed(int i, String str) {
            this.f16421a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("TransIntervalDflt");
            if (property.isValueValid()) {
                this.f16421a.mo29991a((Long) propertyInfo.getValue("TransIntervalDflt"));
                return;
            }
            C8402b2 b2Var = this.f16421a;
            b2Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$h0 */
    class C8423h0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16422a;

        C8423h0(CeilingbService ceilingbService, CompletionHandler completionHandler) {
            this.f16422a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16422a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16422a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$h1 */
    public interface C8424h1 {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$i */
    class C8425i implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8406c2 f16423a;

        C8425i(CeilingbService ceilingbService, C8406c2 c2Var) {
            this.f16423a = c2Var;
        }

        public void onFailed(int i, String str) {
            this.f16423a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("onFromPower");
            if (property.isValueValid()) {
                this.f16423a.mo29993a((Long) propertyInfo.getValue("onFromPower"));
                return;
            }
            C8406c2 c2Var = this.f16423a;
            c2Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$i0 */
    class C8426i0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16424a;

        C8426i0(CeilingbService ceilingbService, CompletionHandler completionHandler) {
            this.f16424a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16424a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16424a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$i1 */
    public interface C8427i1 {
        /* renamed from: a */
        void mo30001a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$j */
    class C8428j implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8466v1 f16425a;

        C8428j(CeilingbService ceilingbService, C8466v1 v1Var) {
            this.f16425a = v1Var;
        }

        public void onFailed(int i, String str) {
            this.f16425a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("NLBright");
            if (property.isValueValid()) {
                this.f16425a.mo30027a((Long) propertyInfo.getValue("NLBright"));
                return;
            }
            C8466v1 v1Var = this.f16425a;
            v1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$j0 */
    class C8429j0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16426a;

        C8429j0(CeilingbService ceilingbService, CompletionHandler completionHandler) {
            this.f16426a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16426a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16426a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$j1 */
    public interface C8430j1 {
        /* renamed from: a */
        void mo30003a(C8405c1 c1Var);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$k */
    class C8431k implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16427a;

        C8431k(CeilingbService ceilingbService, CompletionHandler completionHandler) {
            this.f16427a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16427a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f16427a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$k0 */
    class C8432k0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16428a;

        C8432k0(CeilingbService ceilingbService, CompletionHandler completionHandler) {
            this.f16428a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16428a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16428a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$k1 */
    public interface C8433k1 {
        /* renamed from: a */
        void mo30005a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$l */
    class C8434l implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8469w1 f16429a;

        C8434l(CeilingbService ceilingbService, C8469w1 w1Var) {
            this.f16429a = w1Var;
        }

        public void onFailed(int i, String str) {
            this.f16429a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("NightTimeInfo");
            if (property.isValueValid()) {
                this.f16429a.onSucceed((String) propertyInfo.getValue("NightTimeInfo"));
                return;
            }
            C8469w1 w1Var = this.f16429a;
            w1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$l0 */
    class C8435l0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16430a;

        C8435l0(CeilingbService ceilingbService, CompletionHandler completionHandler) {
            this.f16430a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16430a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16430a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$l1 */
    public interface C8436l1 {
        /* renamed from: a */
        void mo30007a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$m */
    class C8437m implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8463u1 f16431a;

        C8437m(CeilingbService ceilingbService, C8463u1 u1Var) {
            this.f16431a = u1Var;
        }

        public void onFailed(int i, String str) {
            this.f16431a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("MiBandSleep");
            if (property.isValueValid()) {
                this.f16431a.mo30025a((Long) propertyInfo.getValue("MiBandSleep"));
                return;
            }
            C8463u1 u1Var = this.f16431a;
            u1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$m0 */
    class C8438m0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16432a;

        C8438m0(CeilingbService ceilingbService, CompletionHandler completionHandler) {
            this.f16432a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16432a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16432a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$m1 */
    public interface C8439m1 {
        /* renamed from: a */
        void mo30009a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$n */
    class C8440n implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8436l1 f16433a;

        C8440n(CeilingbService ceilingbService, C8436l1 l1Var) {
            this.f16433a = l1Var;
        }

        public void onFailed(int i, String str) {
            this.f16433a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("BgRgb");
            if (property.isValueValid()) {
                this.f16433a.mo30007a((Long) propertyInfo.getValue("BgRgb"));
                return;
            }
            C8436l1 l1Var = this.f16433a;
            l1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$n0 */
    class C8441n0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16434a;

        C8441n0(CeilingbService ceilingbService, CompletionHandler completionHandler) {
            this.f16434a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16434a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16434a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$n1 */
    public interface C8442n1 {
        /* renamed from: a */
        void mo30011a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$o */
    class C8443o implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8454r1 f16435a;

        C8443o(CeilingbService ceilingbService, C8454r1 r1Var) {
            this.f16435a = r1Var;
        }

        public void onFailed(int i, String str) {
            this.f16435a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Flowing");
            if (property.isValueValid()) {
                this.f16435a.mo30019a((Long) propertyInfo.getValue("Flowing"));
                return;
            }
            C8454r1 r1Var = this.f16435a;
            r1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$o0 */
    class C8444o0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16436a;

        C8444o0(CeilingbService ceilingbService, CompletionHandler completionHandler) {
            this.f16436a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16436a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16436a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$o1 */
    public interface C8445o1 {
        /* renamed from: a */
        void mo30013a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$p */
    class C8446p implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8427i1 f16437a;

        C8446p(CeilingbService ceilingbService, C8427i1 i1Var) {
            this.f16437a = i1Var;
        }

        public void onFailed(int i, String str) {
            this.f16437a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("BgFlowing");
            if (property.isValueValid()) {
                this.f16437a.mo30001a((Long) propertyInfo.getValue("BgFlowing"));
                return;
            }
            C8427i1 i1Var = this.f16437a;
            i1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$p0 */
    class C8447p0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16438a;

        C8447p0(CeilingbService ceilingbService, CompletionHandler completionHandler) {
            this.f16438a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16438a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16438a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$p1 */
    public interface C8448p1 {
        /* renamed from: a */
        void mo30015a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$q */
    class C8449q implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8433k1 f16439a;

        C8449q(CeilingbService ceilingbService, C8433k1 k1Var) {
            this.f16439a = k1Var;
        }

        public void onFailed(int i, String str) {
            this.f16439a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("BgProact");
            if (property.isValueValid()) {
                this.f16439a.mo30005a((Long) propertyInfo.getValue("BgProact"));
                return;
            }
            C8433k1 k1Var = this.f16439a;
            k1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$q0 */
    class C8450q0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16440a;

        C8450q0(CeilingbService ceilingbService, CompletionHandler completionHandler) {
            this.f16440a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16440a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16440a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$q1 */
    public interface C8451q1 {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$r */
    class C8452r implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8398a2 f16441a;

        C8452r(CeilingbService ceilingbService, C8398a2 a2Var) {
            this.f16441a = a2Var;
        }

        public void onFailed(int i, String str) {
            this.f16441a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("SmartSwitch");
            if (property.isValueValid()) {
                this.f16441a.mo29989a((Long) propertyInfo.getValue("SmartSwitch"));
                return;
            }
            C8398a2 a2Var = this.f16441a;
            a2Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$r0 */
    class C8453r0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8475y1 f16442a;

        C8453r0(CeilingbService ceilingbService, C8475y1 y1Var) {
            this.f16442a = y1Var;
        }

        public void onFailed(int i, String str) {
            this.f16442a.onFailed(i, str);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.Long} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onSucceed(com.miot.common.device.invocation.PropertyInfo r29) {
            /*
                r28 = this;
                r0 = r29
                java.lang.String r1 = "MainPower"
                com.miot.common.property.Property r1 = r0.getProperty(r1)
                boolean r2 = r1.isValueValid()
                r3 = 0
                if (r2 == 0) goto L_0x001b
                java.lang.Object r1 = r1.getValue()
                java.lang.String r1 = (java.lang.String) r1
                com.yeelight.yeelib.device.xiaomi.CeilingbService$d2 r1 = com.yeelight.yeelib.device.xiaomi.CeilingbService.C8410d2.valueOf(r1)
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
                com.yeelight.yeelib.device.xiaomi.CeilingbService$e2 r1 = com.yeelight.yeelib.device.xiaomi.CeilingbService.C8414e2.valueOf(r1)
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
                com.yeelight.yeelib.device.xiaomi.CeilingbService$c1 r1 = com.yeelight.yeelib.device.xiaomi.CeilingbService.C8405c1.valueOf(r1)
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
                com.miot.common.property.Property r1 = r0.getProperty(r1)
                boolean r2 = r1.isValueValid()
                if (r2 == 0) goto L_0x01f1
                java.lang.Object r1 = r1.getValue()
                java.lang.Long r1 = (java.lang.Long) r1
                r26 = r1
                goto L_0x01f3
            L_0x01f1:
                r26 = r3
            L_0x01f3:
                java.lang.String r1 = "BleCfg"
                com.miot.common.property.Property r0 = r0.getProperty(r1)
                boolean r1 = r0.isValueValid()
                if (r1 == 0) goto L_0x0206
                java.lang.Object r0 = r0.getValue()
                r3 = r0
                java.lang.Long r3 = (java.lang.Long) r3
            L_0x0206:
                r0 = r28
                r27 = r3
                com.yeelight.yeelib.device.xiaomi.CeilingbService$y1 r4 = r0.f16442a
                r4.mo28592a(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.xiaomi.CeilingbService.C8453r0.onSucceed(com.miot.common.device.invocation.PropertyInfo):void");
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$r1 */
    public interface C8454r1 {
        /* renamed from: a */
        void mo30019a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$s */
    class C8455s implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8439m1 f16443a;

        C8455s(CeilingbService ceilingbService, C8439m1 m1Var) {
            this.f16443a = m1Var;
        }

        public void onFailed(int i, String str) {
            this.f16443a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty(CeilingbService.PROPERTY_BleCfg);
            if (property.isValueValid()) {
                this.f16443a.mo30009a((Long) propertyInfo.getValue(CeilingbService.PROPERTY_BleCfg));
                return;
            }
            C8439m1 m1Var = this.f16443a;
            m1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$s0 */
    class C8456s0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16444a;

        C8456s0(CeilingbService ceilingbService, CompletionHandler completionHandler) {
            this.f16444a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16444a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16444a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$s1 */
    public interface C8457s1 {
        /* renamed from: a */
        void mo30021a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$t */
    class C8458t implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16445a;

        C8458t(CeilingbService ceilingbService, CompletionHandler completionHandler) {
            this.f16445a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16445a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16445a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$t0 */
    class C8459t0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16446a;

        C8459t0(CeilingbService ceilingbService, CompletionHandler completionHandler) {
            this.f16446a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16446a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16446a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$t1 */
    public interface C8460t1 {
        /* renamed from: a */
        void mo30023a(C8410d2 d2Var);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$u */
    class C8461u implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16447a;

        C8461u(CeilingbService ceilingbService, CompletionHandler completionHandler) {
            this.f16447a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16447a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16447a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$u0 */
    class C8462u0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16448a;

        C8462u0(CeilingbService ceilingbService, CompletionHandler completionHandler) {
            this.f16448a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16448a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16448a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$u1 */
    public interface C8463u1 {
        /* renamed from: a */
        void mo30025a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$v */
    class C8464v implements DeviceManipulator.PropertyChangedListener {

        /* renamed from: a */
        final /* synthetic */ C8418f2 f16449a;

        C8464v(CeilingbService ceilingbService, C8418f2 f2Var) {
            this.f16449a = f2Var;
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:100:0x0281, code lost:
            if (r2.getProperty("BgFlowing").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:101:0x0283, code lost:
            r4.f16449a.mo28613t((java.lang.Long) r2.getValue("BgFlowing"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:102:0x0290, code lost:
            r4 = r25;
            r2 = r26;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:103:0x029c, code lost:
            if (r2.getProperty("Flowing").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:104:0x029e, code lost:
            r4.f16449a.mo28596c((java.lang.Long) r2.getValue("Flowing"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:105:0x02ab, code lost:
            r4 = r25;
            r2 = r26;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:106:0x02b7, code lost:
            if (r2.getProperty("BgRgb").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:107:0x02b9, code lost:
            r4.f16449a.mo28607n((java.lang.Long) r2.getValue("BgRgb"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:108:0x02c6, code lost:
            r4 = r25;
            r2 = r26;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:109:0x02d2, code lost:
            if (r2.getProperty(r0).isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:110:0x02d4, code lost:
            r4.f16449a.mo28606m((java.lang.Long) r2.getValue(r0));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:111:0x02e1, code lost:
            r4 = r25;
            r2 = r26;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:112:0x02ed, code lost:
            if (r2.getProperty(r13).isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:113:0x02ef, code lost:
            r4.f16449a.mo28602i((java.lang.String) r2.getValue(r13));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:114:0x02fc, code lost:
            r4 = r25;
            r2 = r26;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:115:0x0308, code lost:
            if (r2.getProperty(r6).isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:116:0x030a, code lost:
            r4.f16449a.mo28604k((java.lang.Long) r2.getValue(r6));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:117:0x0317, code lost:
            r4 = r25;
            r2 = r26;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:118:0x0323, code lost:
            if (r2.getProperty("onFromPower").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:119:0x0325, code lost:
            r4.f16449a.mo28599f((java.lang.Long) r2.getValue("onFromPower"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:120:0x0332, code lost:
            r4 = r25;
            r2 = r26;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:121:0x033e, code lost:
            if (r2.getProperty(r3).isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:122:0x0340, code lost:
            r4.f16449a.mo28610q((java.lang.Long) r2.getValue(r3));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:123:0x034d, code lost:
            r4 = r25;
            r2 = r26;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:124:0x0359, code lost:
            if (r2.getProperty("SaveState").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:125:0x035b, code lost:
            r4.f16449a.mo28597d((java.lang.Long) r2.getValue("SaveState"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:126:0x0368, code lost:
            r4 = r25;
            r2 = r26;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:127:0x0374, code lost:
            if (r2.getProperty("LanMode").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:128:0x0376, code lost:
            r4.f16449a.mo28600g((java.lang.Long) r2.getValue("LanMode"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:129:0x0383, code lost:
            r4 = r25;
            r2 = r26;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:130:0x038f, code lost:
            if (r2.getProperty("BgFlowParams").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:131:0x0391, code lost:
            r4.f16449a.mo28611r((java.lang.String) r2.getValue("BgFlowParams"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:132:0x039e, code lost:
            r4 = r25;
            r2 = r26;
            r0 = r22;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:133:0x03ac, code lost:
            if (r2.getProperty(r0).isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:134:0x03ae, code lost:
            r4.f16449a.mo28598e((java.lang.String) r2.getValue(r0));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:135:0x03bb, code lost:
            r4 = r25;
            r2 = r26;
            r0 = r21;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:136:0x03c9, code lost:
            if (r2.getProperty(r0).isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:137:0x03cb, code lost:
            r4.f16449a.mo28595b((java.lang.Long) r2.getValue(r0));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:138:0x03d8, code lost:
            r4 = r25;
            r2 = r26;
            r0 = r16;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:139:0x03e6, code lost:
            if (r2.getProperty(r0).isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:140:0x03e8, code lost:
            r4.f16449a.mo28603j((java.lang.Long) r2.getValue(r0));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:141:0x03f5, code lost:
            r4 = r25;
            r2 = r26;
            r12 = r17;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:142:0x0403, code lost:
            if (r2.getProperty(r12).isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:143:0x0405, code lost:
            r4.f16449a.mo28601h((java.lang.Long) r2.getValue(r12));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:144:0x0412, code lost:
            r4 = r25;
            r2 = r26;
            r0 = r12;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:145:0x041f, code lost:
            if (r2.getProperty(r0).isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:146:0x0421, code lost:
            r4.f16449a.mo28605l((java.lang.Long) r2.getValue(r0));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:147:0x042e, code lost:
            r4 = r25;
            r2 = r26;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:148:0x043c, code lost:
            if (r2.getProperty("Bright").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:149:0x043e, code lost:
            r4.f16449a.mo28594a((java.lang.Long) r2.getValue("Bright"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:150:0x044c, code lost:
            r4 = r25;
            r2 = r26;
            r0 = r20;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:151:0x045a, code lost:
            if (r2.getProperty(r0).isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:152:0x045c, code lost:
            r4.f16449a.mo28615v(com.yeelight.yeelib.device.xiaomi.CeilingbService.C8405c1.valueOf((java.lang.String) r2.getValue(r0)));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:153:0x046c, code lost:
            r4 = r25;
            r2 = r26;
            r0 = r19;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:154:0x047a, code lost:
            if (r2.getProperty(r0).isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:155:0x047c, code lost:
            r4.f16449a.mo28608o(com.yeelight.yeelib.device.xiaomi.CeilingbService.C8414e2.valueOf((java.lang.String) r2.getValue(r0)));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:156:0x048c, code lost:
            r4 = r25;
            r2 = r26;
            r0 = r18;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:157:0x049a, code lost:
            if (r2.getProperty(r0).isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:158:0x049c, code lost:
            r4.f16449a.mo28616w(com.yeelight.yeelib.device.xiaomi.CeilingbService.C8410d2.valueOf((java.lang.String) r2.getValue(r0)));
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
        /* JADX WARNING: Code restructure failed: missing block: B:189:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:190:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:191:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:192:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:193:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:194:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:195:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:196:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:197:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:198:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:199:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:200:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:201:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:202:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:203:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:204:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0049, code lost:
            r3 = r18;
            r18 = "MainPower";
            r6 = r19;
            r19 = "Power";
            r13 = r20;
            r20 = "BgPower";
            r8 = r21;
            r21 = "DelayOff";
            r12 = r23;
            r24 = r16;
            r16 = "BgCt";
            r0 = r17;
            r17 = r24;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:0x00e0, code lost:
            r3 = r18;
            r18 = "MainPower";
            r6 = r19;
            r19 = "Power";
            r13 = r20;
            r20 = "BgPower";
            r8 = r21;
            r21 = "DelayOff";
            r12 = r23;
            r24 = r16;
            r16 = "BgCt";
            r0 = r17;
            r17 = r24;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:53:0x011d, code lost:
            r17 = r3;
            r3 = r18;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:54:0x0122, code lost:
            r17 = r3;
            r3 = r18;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:58:0x0139, code lost:
            r18 = "MainPower";
            r6 = r19;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:59:0x013e, code lost:
            r18 = "MainPower";
            r6 = r19;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:63:0x0159, code lost:
            r19 = "Power";
            r13 = r20;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:64:0x015e, code lost:
            r19 = "Power";
            r13 = r20;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:68:0x017d, code lost:
            r20 = "BgPower";
            r8 = r21;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:69:0x0182, code lost:
            r20 = "BgPower";
            r8 = r21;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:73:0x01a5, code lost:
            r21 = "DelayOff";
         */
        /* JADX WARNING: Code restructure failed: missing block: B:74:0x01a8, code lost:
            r21 = "DelayOff";
         */
        /* JADX WARNING: Code restructure failed: missing block: B:78:0x01cf, code lost:
            r12 = r23;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:80:0x01d4, code lost:
            r12 = r23;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:87:0x021c, code lost:
            r2 = 65535;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:88:0x021d, code lost:
            switch(r2) {
                case 0: goto L_0x048c;
                case 1: goto L_0x046c;
                case 2: goto L_0x044c;
                case 3: goto L_0x042e;
                case 4: goto L_0x0412;
                case 5: goto L_0x03f5;
                case 6: goto L_0x03d8;
                case 7: goto L_0x03bb;
                case 8: goto L_0x039e;
                case 9: goto L_0x0383;
                case 10: goto L_0x0368;
                case 11: goto L_0x034d;
                case 12: goto L_0x0332;
                case 13: goto L_0x0317;
                case 14: goto L_0x02fc;
                case 15: goto L_0x02e1;
                case 16: goto L_0x02c6;
                case 17: goto L_0x02ab;
                case 18: goto L_0x0290;
                case 19: goto L_0x0275;
                case 20: goto L_0x025a;
                case 21: goto L_0x023f;
                case 22: goto L_0x0224;
                default: goto L_0x0220;
            };
         */
        /* JADX WARNING: Code restructure failed: missing block: B:89:0x0220, code lost:
            r4 = r25;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:90:0x0224, code lost:
            r2 = r26;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:91:0x022e, code lost:
            if (r2.getProperty(com.yeelight.yeelib.device.xiaomi.CeilingbService.PROPERTY_BleCfg).isValueValid() == false) goto L_0x0220;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:92:0x0230, code lost:
            r25.f16449a.mo28614u((java.lang.Long) r2.getValue(com.yeelight.yeelib.device.xiaomi.CeilingbService.PROPERTY_BleCfg));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:93:0x023f, code lost:
            r4 = r25;
            r2 = r26;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:94:0x024b, code lost:
            if (r2.getProperty("SmartSwitch").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:95:0x024d, code lost:
            r4.f16449a.mo28609p((java.lang.Long) r2.getValue("SmartSwitch"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:96:0x025a, code lost:
            r4 = r25;
            r2 = r26;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:97:0x0266, code lost:
            if (r2.getProperty(r8).isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:98:0x0268, code lost:
            r4.f16449a.mo28612s((java.lang.Long) r2.getValue(r8));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:99:0x0275, code lost:
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
                int r3 = r27.hashCode()
                java.lang.String r4 = "BleCfg"
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
                switch(r3) {
                    case -2117953292: goto L_0x01f9;
                    case -2017000513: goto L_0x01d7;
                    case -2002016140: goto L_0x01ab;
                    case -1616019574: goto L_0x0187;
                    case -1331143373: goto L_0x0163;
                    case -770908584: goto L_0x0143;
                    case -718325097: goto L_0x0127;
                    case -80340154: goto L_0x010f;
                    case 2193: goto L_0x00fc;
                    case 2067382: goto L_0x00d9;
                    case 35911772: goto L_0x00d0;
                    case 64102952: goto L_0x00c7;
                    case 77306085: goto L_0x00bf;
                    case 880790796: goto L_0x00b7;
                    case 898856916: goto L_0x00ae;
                    case 986784719: goto L_0x00a5;
                    case 1179821629: goto L_0x009c;
                    case 1471809440: goto L_0x0094;
                    case 1611821756: goto L_0x008b;
                    case 1738956460: goto L_0x0083;
                    case 1820079769: goto L_0x007a;
                    case 1992340777: goto L_0x0070;
                    case 1998035738: goto L_0x0065;
                    default: goto L_0x0049;
                }
            L_0x0049:
                r3 = r18
                r18 = r6
                r6 = r19
                r19 = r13
                r13 = r20
                r20 = r8
                r8 = r21
                r21 = r12
                r12 = r23
                r24 = r16
                r16 = r0
                r0 = r17
                r17 = r24
                goto L_0x021c
            L_0x0065:
                java.lang.String r3 = "Bright"
                boolean r2 = r2.equals(r3)
                if (r2 == 0) goto L_0x0049
                r2 = 3
                goto L_0x00e0
            L_0x0070:
                boolean r2 = r2.equals(r4)
                if (r2 == 0) goto L_0x0049
                r2 = 22
                goto L_0x00e0
            L_0x007a:
                boolean r2 = r2.equals(r5)
                if (r2 == 0) goto L_0x0049
                r2 = 9
                goto L_0x00e0
            L_0x0083:
                boolean r2 = r2.equals(r6)
                if (r2 == 0) goto L_0x0049
                r2 = 0
                goto L_0x00e0
            L_0x008b:
                boolean r2 = r2.equals(r7)
                if (r2 == 0) goto L_0x0049
                r2 = 10
                goto L_0x00e0
            L_0x0094:
                boolean r2 = r2.equals(r8)
                if (r2 == 0) goto L_0x0049
                r2 = 2
                goto L_0x00e0
            L_0x009c:
                boolean r2 = r2.equals(r9)
                if (r2 == 0) goto L_0x0049
                r2 = 21
                goto L_0x00e0
            L_0x00a5:
                boolean r2 = r2.equals(r10)
                if (r2 == 0) goto L_0x0049
                r2 = 19
                goto L_0x00e0
            L_0x00ae:
                boolean r2 = r2.equals(r11)
                if (r2 == 0) goto L_0x0049
                r2 = 18
                goto L_0x00e0
            L_0x00b7:
                boolean r2 = r2.equals(r12)
                if (r2 == 0) goto L_0x0049
                r2 = 7
                goto L_0x00e0
            L_0x00bf:
                boolean r2 = r2.equals(r13)
                if (r2 == 0) goto L_0x0049
                r2 = 1
                goto L_0x00e0
            L_0x00c7:
                boolean r2 = r2.equals(r14)
                if (r2 == 0) goto L_0x0049
                r2 = 17
                goto L_0x00e0
            L_0x00d0:
                boolean r2 = r2.equals(r15)
                if (r2 == 0) goto L_0x0049
                r2 = 13
                goto L_0x00e0
            L_0x00d9:
                boolean r2 = r2.equals(r0)
                if (r2 == 0) goto L_0x0049
                r2 = 6
            L_0x00e0:
                r3 = r18
                r18 = r6
                r6 = r19
                r19 = r13
                r13 = r20
                r20 = r8
                r8 = r21
                r21 = r12
                r12 = r23
                r24 = r16
                r16 = r0
                r0 = r17
                r17 = r24
                goto L_0x021d
            L_0x00fc:
                r3 = r16
                boolean r2 = r2.equals(r3)
                if (r2 == 0) goto L_0x010a
                r2 = 5
                r16 = r0
                r0 = r17
                goto L_0x011d
            L_0x010a:
                r16 = r0
                r0 = r17
                goto L_0x0122
            L_0x010f:
                r3 = r16
                r16 = r0
                r0 = r17
                boolean r2 = r2.equals(r0)
                if (r2 == 0) goto L_0x0122
                r2 = 16
            L_0x011d:
                r17 = r3
                r3 = r18
                goto L_0x0139
            L_0x0122:
                r17 = r3
                r3 = r18
                goto L_0x013e
            L_0x0127:
                r3 = r18
                r24 = r16
                r16 = r0
                r0 = r17
                r17 = r24
                boolean r2 = r2.equals(r3)
                if (r2 == 0) goto L_0x013e
                r2 = 12
            L_0x0139:
                r18 = r6
                r6 = r19
                goto L_0x0159
            L_0x013e:
                r18 = r6
                r6 = r19
                goto L_0x015e
            L_0x0143:
                r3 = r18
                r18 = r6
                r6 = r19
                r24 = r16
                r16 = r0
                r0 = r17
                r17 = r24
                boolean r2 = r2.equals(r6)
                if (r2 == 0) goto L_0x015e
                r2 = 14
            L_0x0159:
                r19 = r13
                r13 = r20
                goto L_0x017d
            L_0x015e:
                r19 = r13
                r13 = r20
                goto L_0x0182
            L_0x0163:
                r3 = r18
                r18 = r6
                r6 = r19
                r19 = r13
                r13 = r20
                r24 = r16
                r16 = r0
                r0 = r17
                r17 = r24
                boolean r2 = r2.equals(r13)
                if (r2 == 0) goto L_0x0182
                r2 = 15
            L_0x017d:
                r20 = r8
                r8 = r21
                goto L_0x01a5
            L_0x0182:
                r20 = r8
                r8 = r21
                goto L_0x01a8
            L_0x0187:
                r3 = r18
                r18 = r6
                r6 = r19
                r19 = r13
                r13 = r20
                r20 = r8
                r8 = r21
                r24 = r16
                r16 = r0
                r0 = r17
                r17 = r24
                boolean r2 = r2.equals(r8)
                if (r2 == 0) goto L_0x01a8
                r2 = 20
            L_0x01a5:
                r21 = r12
                goto L_0x01cf
            L_0x01a8:
                r21 = r12
                goto L_0x01d4
            L_0x01ab:
                r3 = r18
                r18 = r6
                r6 = r19
                r19 = r13
                r13 = r20
                r20 = r8
                r8 = r21
                r21 = r12
                r12 = r22
                r24 = r16
                r16 = r0
                r0 = r17
                r17 = r24
                boolean r2 = r2.equals(r12)
                if (r2 == 0) goto L_0x01d2
                r2 = 8
                r22 = r12
            L_0x01cf:
                r12 = r23
                goto L_0x021d
            L_0x01d2:
                r22 = r12
            L_0x01d4:
                r12 = r23
                goto L_0x021c
            L_0x01d7:
                r3 = r18
                r18 = r6
                r6 = r19
                r19 = r13
                r13 = r20
                r20 = r8
                r8 = r21
                r21 = r12
                r12 = r23
                r24 = r16
                r16 = r0
                r0 = r17
                r17 = r24
                boolean r2 = r2.equals(r12)
                if (r2 == 0) goto L_0x021c
                r2 = 4
                goto L_0x021d
            L_0x01f9:
                r3 = r18
                r18 = r6
                r6 = r19
                r19 = r13
                r13 = r20
                r20 = r8
                r8 = r21
                r21 = r12
                r12 = r23
                r24 = r16
                r16 = r0
                r0 = r17
                r17 = r24
                boolean r2 = r2.equals(r1)
                if (r2 == 0) goto L_0x021c
                r2 = 11
                goto L_0x021d
            L_0x021c:
                r2 = -1
            L_0x021d:
                switch(r2) {
                    case 0: goto L_0x048c;
                    case 1: goto L_0x046c;
                    case 2: goto L_0x044c;
                    case 3: goto L_0x042e;
                    case 4: goto L_0x0412;
                    case 5: goto L_0x03f5;
                    case 6: goto L_0x03d8;
                    case 7: goto L_0x03bb;
                    case 8: goto L_0x039e;
                    case 9: goto L_0x0383;
                    case 10: goto L_0x0368;
                    case 11: goto L_0x034d;
                    case 12: goto L_0x0332;
                    case 13: goto L_0x0317;
                    case 14: goto L_0x02fc;
                    case 15: goto L_0x02e1;
                    case 16: goto L_0x02c6;
                    case 17: goto L_0x02ab;
                    case 18: goto L_0x0290;
                    case 19: goto L_0x0275;
                    case 20: goto L_0x025a;
                    case 21: goto L_0x023f;
                    case 22: goto L_0x0224;
                    default: goto L_0x0220;
                }
            L_0x0220:
                r4 = r25
                goto L_0x04ab
            L_0x0224:
                r2 = r26
                com.miot.common.property.Property r0 = r2.getProperty(r4)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0220
                java.lang.Object r0 = r2.getValue(r4)
                java.lang.Long r0 = (java.lang.Long) r0
                r4 = r25
                com.yeelight.yeelib.device.xiaomi.CeilingbService$f2 r1 = r4.f16449a
                r1.mo28614u(r0)
                goto L_0x04ab
            L_0x023f:
                r4 = r25
                r2 = r26
                com.miot.common.property.Property r0 = r2.getProperty(r9)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x04ab
                java.lang.Object r0 = r2.getValue(r9)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.CeilingbService$f2 r1 = r4.f16449a
                r1.mo28609p(r0)
                goto L_0x04ab
            L_0x025a:
                r4 = r25
                r2 = r26
                com.miot.common.property.Property r0 = r2.getProperty(r8)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x04ab
                java.lang.Object r0 = r2.getValue(r8)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.CeilingbService$f2 r1 = r4.f16449a
                r1.mo28612s(r0)
                goto L_0x04ab
            L_0x0275:
                r4 = r25
                r2 = r26
                com.miot.common.property.Property r0 = r2.getProperty(r10)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x04ab
                java.lang.Object r0 = r2.getValue(r10)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.CeilingbService$f2 r1 = r4.f16449a
                r1.mo28613t(r0)
                goto L_0x04ab
            L_0x0290:
                r4 = r25
                r2 = r26
                com.miot.common.property.Property r0 = r2.getProperty(r11)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x04ab
                java.lang.Object r0 = r2.getValue(r11)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.CeilingbService$f2 r1 = r4.f16449a
                r1.mo28596c(r0)
                goto L_0x04ab
            L_0x02ab:
                r4 = r25
                r2 = r26
                com.miot.common.property.Property r0 = r2.getProperty(r14)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x04ab
                java.lang.Object r0 = r2.getValue(r14)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.CeilingbService$f2 r1 = r4.f16449a
                r1.mo28607n(r0)
                goto L_0x04ab
            L_0x02c6:
                r4 = r25
                r2 = r26
                com.miot.common.property.Property r1 = r2.getProperty(r0)
                boolean r1 = r1.isValueValid()
                if (r1 == 0) goto L_0x04ab
                java.lang.Object r0 = r2.getValue(r0)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.CeilingbService$f2 r1 = r4.f16449a
                r1.mo28606m(r0)
                goto L_0x04ab
            L_0x02e1:
                r4 = r25
                r2 = r26
                com.miot.common.property.Property r0 = r2.getProperty(r13)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x04ab
                java.lang.Object r0 = r2.getValue(r13)
                java.lang.String r0 = (java.lang.String) r0
                com.yeelight.yeelib.device.xiaomi.CeilingbService$f2 r1 = r4.f16449a
                r1.mo28602i(r0)
                goto L_0x04ab
            L_0x02fc:
                r4 = r25
                r2 = r26
                com.miot.common.property.Property r0 = r2.getProperty(r6)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x04ab
                java.lang.Object r0 = r2.getValue(r6)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.CeilingbService$f2 r1 = r4.f16449a
                r1.mo28604k(r0)
                goto L_0x04ab
            L_0x0317:
                r4 = r25
                r2 = r26
                com.miot.common.property.Property r0 = r2.getProperty(r15)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x04ab
                java.lang.Object r0 = r2.getValue(r15)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.CeilingbService$f2 r1 = r4.f16449a
                r1.mo28599f(r0)
                goto L_0x04ab
            L_0x0332:
                r4 = r25
                r2 = r26
                com.miot.common.property.Property r0 = r2.getProperty(r3)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x04ab
                java.lang.Object r0 = r2.getValue(r3)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.CeilingbService$f2 r1 = r4.f16449a
                r1.mo28610q(r0)
                goto L_0x04ab
            L_0x034d:
                r4 = r25
                r2 = r26
                com.miot.common.property.Property r0 = r2.getProperty(r1)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x04ab
                java.lang.Object r0 = r2.getValue(r1)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.CeilingbService$f2 r1 = r4.f16449a
                r1.mo28597d(r0)
                goto L_0x04ab
            L_0x0368:
                r4 = r25
                r2 = r26
                com.miot.common.property.Property r0 = r2.getProperty(r7)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x04ab
                java.lang.Object r0 = r2.getValue(r7)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.CeilingbService$f2 r1 = r4.f16449a
                r1.mo28600g(r0)
                goto L_0x04ab
            L_0x0383:
                r4 = r25
                r2 = r26
                com.miot.common.property.Property r0 = r2.getProperty(r5)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x04ab
                java.lang.Object r0 = r2.getValue(r5)
                java.lang.String r0 = (java.lang.String) r0
                com.yeelight.yeelib.device.xiaomi.CeilingbService$f2 r1 = r4.f16449a
                r1.mo28611r(r0)
                goto L_0x04ab
            L_0x039e:
                r4 = r25
                r2 = r26
                r0 = r22
                com.miot.common.property.Property r1 = r2.getProperty(r0)
                boolean r1 = r1.isValueValid()
                if (r1 == 0) goto L_0x04ab
                java.lang.Object r0 = r2.getValue(r0)
                java.lang.String r0 = (java.lang.String) r0
                com.yeelight.yeelib.device.xiaomi.CeilingbService$f2 r1 = r4.f16449a
                r1.mo28598e(r0)
                goto L_0x04ab
            L_0x03bb:
                r4 = r25
                r2 = r26
                r0 = r21
                com.miot.common.property.Property r1 = r2.getProperty(r0)
                boolean r1 = r1.isValueValid()
                if (r1 == 0) goto L_0x04ab
                java.lang.Object r0 = r2.getValue(r0)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.CeilingbService$f2 r1 = r4.f16449a
                r1.mo28595b(r0)
                goto L_0x04ab
            L_0x03d8:
                r4 = r25
                r2 = r26
                r0 = r16
                com.miot.common.property.Property r1 = r2.getProperty(r0)
                boolean r1 = r1.isValueValid()
                if (r1 == 0) goto L_0x04ab
                java.lang.Object r0 = r2.getValue(r0)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.CeilingbService$f2 r1 = r4.f16449a
                r1.mo28603j(r0)
                goto L_0x04ab
            L_0x03f5:
                r4 = r25
                r2 = r26
                r12 = r17
                com.miot.common.property.Property r0 = r2.getProperty(r12)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x04ab
                java.lang.Object r0 = r2.getValue(r12)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.CeilingbService$f2 r1 = r4.f16449a
                r1.mo28601h(r0)
                goto L_0x04ab
            L_0x0412:
                r4 = r25
                r2 = r26
                r0 = r12
                com.miot.common.property.Property r1 = r2.getProperty(r0)
                boolean r1 = r1.isValueValid()
                if (r1 == 0) goto L_0x04ab
                java.lang.Object r0 = r2.getValue(r0)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.CeilingbService$f2 r1 = r4.f16449a
                r1.mo28605l(r0)
                goto L_0x04ab
            L_0x042e:
                r4 = r25
                r2 = r26
                java.lang.String r0 = "Bright"
                com.miot.common.property.Property r0 = r2.getProperty(r0)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x04ab
                java.lang.String r0 = "Bright"
                java.lang.Object r0 = r2.getValue(r0)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.CeilingbService$f2 r1 = r4.f16449a
                r1.mo28594a(r0)
                goto L_0x04ab
            L_0x044c:
                r4 = r25
                r2 = r26
                r0 = r20
                com.miot.common.property.Property r1 = r2.getProperty(r0)
                boolean r1 = r1.isValueValid()
                if (r1 == 0) goto L_0x04ab
                java.lang.Object r0 = r2.getValue(r0)
                java.lang.String r0 = (java.lang.String) r0
                com.yeelight.yeelib.device.xiaomi.CeilingbService$c1 r0 = com.yeelight.yeelib.device.xiaomi.CeilingbService.C8405c1.valueOf(r0)
                com.yeelight.yeelib.device.xiaomi.CeilingbService$f2 r1 = r4.f16449a
                r1.mo28615v(r0)
                goto L_0x04ab
            L_0x046c:
                r4 = r25
                r2 = r26
                r0 = r19
                com.miot.common.property.Property r1 = r2.getProperty(r0)
                boolean r1 = r1.isValueValid()
                if (r1 == 0) goto L_0x04ab
                java.lang.Object r0 = r2.getValue(r0)
                java.lang.String r0 = (java.lang.String) r0
                com.yeelight.yeelib.device.xiaomi.CeilingbService$e2 r0 = com.yeelight.yeelib.device.xiaomi.CeilingbService.C8414e2.valueOf(r0)
                com.yeelight.yeelib.device.xiaomi.CeilingbService$f2 r1 = r4.f16449a
                r1.mo28608o(r0)
                goto L_0x04ab
            L_0x048c:
                r4 = r25
                r2 = r26
                r0 = r18
                com.miot.common.property.Property r1 = r2.getProperty(r0)
                boolean r1 = r1.isValueValid()
                if (r1 == 0) goto L_0x04ab
                java.lang.Object r0 = r2.getValue(r0)
                java.lang.String r0 = (java.lang.String) r0
                com.yeelight.yeelib.device.xiaomi.CeilingbService$d2 r0 = com.yeelight.yeelib.device.xiaomi.CeilingbService.C8410d2.valueOf(r0)
                com.yeelight.yeelib.device.xiaomi.CeilingbService$f2 r1 = r4.f16449a
                r1.mo28616w(r0)
            L_0x04ab:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.xiaomi.CeilingbService.C8464v.onPropertyChanged(com.miot.common.device.invocation.PropertyInfo, java.lang.String):void");
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$v0 */
    class C8465v0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16450a;

        C8465v0(CeilingbService ceilingbService, CompletionHandler completionHandler) {
            this.f16450a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16450a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16450a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$v1 */
    public interface C8466v1 {
        /* renamed from: a */
        void mo30027a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$w */
    class C8467w implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16451a;

        C8467w(CeilingbService ceilingbService, CompletionHandler completionHandler) {
            this.f16451a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16451a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16451a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$w0 */
    class C8468w0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16452a;

        C8468w0(CeilingbService ceilingbService, CompletionHandler completionHandler) {
            this.f16452a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16452a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16452a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$w1 */
    public interface C8469w1 {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$x */
    class C8470x implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16453a;

        C8470x(CeilingbService ceilingbService, CompletionHandler completionHandler) {
            this.f16453a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16453a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16453a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$x0 */
    class C8471x0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8460t1 f16454a;

        C8471x0(CeilingbService ceilingbService, C8460t1 t1Var) {
            this.f16454a = t1Var;
        }

        public void onFailed(int i, String str) {
            this.f16454a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("MainPower");
            if (property.isValueValid()) {
                this.f16454a.mo30023a(C8410d2.valueOf((String) propertyInfo.getValue("MainPower")));
                return;
            }
            C8460t1 t1Var = this.f16454a;
            t1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$x1 */
    public interface C8472x1 {
        /* renamed from: a */
        void mo30031a(C8414e2 e2Var);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$y */
    class C8473y implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16455a;

        C8473y(CeilingbService ceilingbService, CompletionHandler completionHandler) {
            this.f16455a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16455a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16455a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$y0 */
    class C8474y0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8472x1 f16456a;

        C8474y0(CeilingbService ceilingbService, C8472x1 x1Var) {
            this.f16456a = x1Var;
        }

        public void onFailed(int i, String str) {
            this.f16456a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Power");
            if (property.isValueValid()) {
                this.f16456a.mo30031a(C8414e2.valueOf((String) propertyInfo.getValue("Power")));
                return;
            }
            C8472x1 x1Var = this.f16456a;
            x1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$y1 */
    public interface C8475y1 {
        /* renamed from: a */
        void mo28592a(C8410d2 d2Var, C8414e2 e2Var, C8405c1 c1Var, Long l, Long l2, Long l3, Long l4, Long l5, String str, String str2, Long l6, Long l7, Long l8, Long l9, Long l10, String str3, Long l11, Long l12, Long l13, Long l14, Long l15, Long l16, Long l17);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$z */
    class C8476z implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16457a;

        C8476z(CeilingbService ceilingbService, CompletionHandler completionHandler) {
            this.f16457a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16457a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16457a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$z0 */
    class C8477z0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8430j1 f16458a;

        C8477z0(CeilingbService ceilingbService, C8430j1 j1Var) {
            this.f16458a = j1Var;
        }

        public void onFailed(int i, String str) {
            this.f16458a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("BgPower");
            if (property.isValueValid()) {
                this.f16458a.mo30003a(C8405c1.valueOf((String) propertyInfo.getValue("BgPower")));
                return;
            }
            C8430j1 j1Var = this.f16458a;
            j1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CeilingbService$z1 */
    public interface C8478z1 {
        /* renamed from: a */
        void mo30033a(Long l);

        void onFailed(int i, String str);
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
                MiotManager.getDeviceManipulator().invoke(create, new C8400b0(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8444o0(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getBgBright(C8417f1 f1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "BgBright"), new C8401b1(this, f1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getBgCt(C8421g1 g1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "BgCt"), new C8399b(this, g1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getBgFlowParams(C8424h1 h1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "BgFlowParams"), new C8411e(this, h1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getBgFlowing(C8427i1 i1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "BgFlowing"), new C8446p(this, i1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getBgPower(C8430j1 j1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "BgPower"), new C8477z0(this, j1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getBgProact(C8433k1 k1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "BgProact"), new C8449q(this, k1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getBgRgb(C8436l1 l1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "BgRgb"), new C8440n(this, l1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getBleCfg(C8439m1 m1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), PROPERTY_BleCfg), new C8455s(this, m1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getBright(C8442n1 n1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Bright"), new C8397a1(this, n1Var));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8468w0(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getCt(C8445o1 o1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Ct"), new C8395a(this, o1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getDelayOff(C8448p1 p1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "DelayOff"), new C8403c(this, p1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowParams(C8451q1 q1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "FlowParams"), new C8407d(this, q1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowing(C8454r1 r1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Flowing"), new C8443o(this, r1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getLanMode(C8457s1 s1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "LanMode"), new C8415f(this, s1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getMainPower(C8460t1 t1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "MainPower"), new C8471x0(this, t1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getMiBandSleep(C8463u1 u1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "MiBandSleep"), new C8437m(this, u1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getNLBright(C8466v1 v1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "NLBright"), new C8428j(this, v1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getNightTimeInfo(C8469w1 w1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "NightTimeInfo"), new C8434l(this, w1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getPower(C8472x1 x1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Power"), new C8474y0(this, x1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getProperties(C8475y1 y1Var) {
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
            create.addProperty(getService().getProperty(PROPERTY_BleCfg));
            MiotManager.getDeviceManipulator().readProperty(create, new C8453r0(this, y1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getSaveState(C8478z1 z1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "SaveState"), new C8419g(this, z1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getSmartSwitch(C8398a2 a2Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "SmartSwitch"), new C8452r(this, a2Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getTransIntervalDflt(C8402b2 b2Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "TransIntervalDflt"), new C8422h(this, b2Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getonFromPower(C8406c2 c2Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "onFromPower"), new C8425i(this, c2Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void openBgWithMode(C8405c1 c1Var, C8413e1 e1Var, Long l, Long l2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "openBgWithMode");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("BgPower", c1Var.toString())) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Effect", e1Var.toString())) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Duration", l)) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("Mode", l2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C8396a0(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void openWithMode(C8410d2 d2Var, C8413e1 e1Var, Long l, Long l2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "openWithMode");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("MainPower", d2Var.toString())) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Effect", e1Var.toString())) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Duration", l)) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("Mode", l2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C8473y(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8447p0(this, completionHandler));
                return;
            }
            throw new MiotException("actionInfo is null");
        }
        throw new MiotException("device not configurated connection");
    }

    public void sendCmd(C8409d1 d1Var, String str, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "sendCmd");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("CmdKey", d1Var.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("CmdValue", str)) {
                MiotManager.getDeviceManipulator().invoke(create, new C8412e0(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8435l0(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8404c0(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8429j0(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setBgPower(C8405c1 c1Var, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setBgPower");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (create.setArgumentValue("BgPower", c1Var.toString())) {
                MiotManager.getDeviceManipulator().invoke(create, new C8458t(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8470x(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8438m0(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8441n0(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8461u(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8465v0(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8462u0(this, completionHandler));
                return;
            }
            throw new MiotException("actionInfo is null");
        }
        throw new MiotException("device not configurated connection");
    }

    public void setDevPower(C8414e2 e2Var, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setDevPower");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (create.setArgumentValue("Power", e2Var.toString())) {
                MiotManager.getDeviceManipulator().invoke(create, new C8456s0(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8423h0(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8408d0(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setPower(C8414e2 e2Var, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setPower");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (create.setArgumentValue("Power", e2Var.toString())) {
                MiotManager.getDeviceManipulator().invoke(create, new C8476z(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8450q0(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8467w(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8426i0(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8416f0(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8432k0(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void subscribeNotifications(CompletionHandler completionHandler, C8418f2 f2Var) {
        if (completionHandler == null) {
            throw new IllegalArgumentException("handler is null");
        } else if (f2Var != null) {
            PropertyInfo create = PropertyInfoFactory.create(getService());
            for (Property next : getService().getProperties()) {
                if (next.getDefinition().isNotifiable()) {
                    create.addProperty(next);
                }
            }
            MiotManager.getDeviceManipulator().addPropertyChangedListener(create, new C8431k(this, completionHandler), new C8464v(this, f2Var));
        } else {
            throw new IllegalArgumentException("listener is null");
        }
    }

    public void toggle(CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "toggle");
            if (create != null) {
                MiotManager.getDeviceManipulator().invoke(create, new C8459t0(this, completionHandler));
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
            MiotManager.getDeviceManipulator().removePropertyChangedListener(create, new C8420g0(this, completionHandler));
            return;
        }
        throw new IllegalArgumentException("handler is null");
    }
}
