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

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$a */
    class C7869a implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7898j1 f15840a;

        C7869a(Ceiling10Service ceiling10Service, C7898j1 j1Var) {
            this.f15840a = j1Var;
        }

        public void onFailed(int i, String str) {
            this.f15840a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Ct");
            if (property.isValueValid()) {
                this.f15840a.mo29398a((Long) propertyInfo.getValue("Ct"));
                return;
            }
            C7898j1 j1Var = this.f15840a;
            j1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$a0 */
    class C7870a0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15841a;

        C7870a0(Ceiling10Service ceiling10Service, CompletionHandler completionHandler) {
            this.f15841a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15841a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f15841a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$a1 */
    public enum C7871a1 {
        undefined,
        smooth,
        sudden
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$b */
    class C7872b implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7877c1 f15846a;

        C7872b(Ceiling10Service ceiling10Service, C7877c1 c1Var) {
            this.f15846a = c1Var;
        }

        public void onFailed(int i, String str) {
            this.f15846a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("BgCt");
            if (property.isValueValid()) {
                this.f15846a.mo29384a((Long) propertyInfo.getValue("BgCt"));
                return;
            }
            C7877c1 c1Var = this.f15846a;
            c1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$b0 */
    class C7873b0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15847a;

        C7873b0(Ceiling10Service ceiling10Service, CompletionHandler completionHandler) {
            this.f15847a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15847a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f15847a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$b1 */
    public interface C7874b1 {
        /* renamed from: a */
        void mo29382a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$c */
    class C7875c implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7901k1 f15848a;

        C7875c(Ceiling10Service ceiling10Service, C7901k1 k1Var) {
            this.f15848a = k1Var;
        }

        public void onFailed(int i, String str) {
            this.f15848a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("DelayOff");
            if (property.isValueValid()) {
                this.f15848a.mo29400a((Long) propertyInfo.getValue("DelayOff"));
                return;
            }
            C7901k1 k1Var = this.f15848a;
            k1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$c0 */
    class C7876c0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15849a;

        C7876c0(Ceiling10Service ceiling10Service, CompletionHandler completionHandler) {
            this.f15849a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15849a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f15849a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$c1 */
    public interface C7877c1 {
        /* renamed from: a */
        void mo29384a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$d */
    class C7878d implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7904l1 f15850a;

        C7878d(Ceiling10Service ceiling10Service, C7904l1 l1Var) {
            this.f15850a = l1Var;
        }

        public void onFailed(int i, String str) {
            this.f15850a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("FlowParams");
            if (property.isValueValid()) {
                this.f15850a.onSucceed((String) propertyInfo.getValue("FlowParams"));
                return;
            }
            C7904l1 l1Var = this.f15850a;
            l1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$d0 */
    class C7879d0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15851a;

        C7879d0(Ceiling10Service ceiling10Service, CompletionHandler completionHandler) {
            this.f15851a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15851a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f15851a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$d1 */
    public interface C7880d1 {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$e */
    class C7881e implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7880d1 f15852a;

        C7881e(Ceiling10Service ceiling10Service, C7880d1 d1Var) {
            this.f15852a = d1Var;
        }

        public void onFailed(int i, String str) {
            this.f15852a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("BgFlowParams");
            if (property.isValueValid()) {
                this.f15852a.onSucceed((String) propertyInfo.getValue("BgFlowParams"));
                return;
            }
            C7880d1 d1Var = this.f15852a;
            d1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$e0 */
    class C7882e0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15853a;

        C7882e0(Ceiling10Service ceiling10Service, CompletionHandler completionHandler) {
            this.f15853a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15853a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f15853a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$e1 */
    public interface C7883e1 {
        /* renamed from: a */
        void mo29388a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$f */
    class C7884f implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7910n1 f15854a;

        C7884f(Ceiling10Service ceiling10Service, C7910n1 n1Var) {
            this.f15854a = n1Var;
        }

        public void onFailed(int i, String str) {
            this.f15854a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("LanMode");
            if (property.isValueValid()) {
                this.f15854a.mo29406a((Long) propertyInfo.getValue("LanMode"));
                return;
            }
            C7910n1 n1Var = this.f15854a;
            n1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$f0 */
    class C7885f0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15855a;

        C7885f0(Ceiling10Service ceiling10Service, CompletionHandler completionHandler) {
            this.f15855a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15855a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f15855a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$f1 */
    public interface C7886f1 {
        /* renamed from: a */
        void mo29390a(C7942y0 y0Var);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$g */
    class C7887g implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7931u1 f15856a;

        C7887g(Ceiling10Service ceiling10Service, C7931u1 u1Var) {
            this.f15856a = u1Var;
        }

        public void onFailed(int i, String str) {
            this.f15856a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("SaveState");
            if (property.isValueValid()) {
                this.f15856a.mo29418a((Long) propertyInfo.getValue("SaveState"));
                return;
            }
            C7931u1 u1Var = this.f15856a;
            u1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$g0 */
    class C7888g0 implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15857a;

        C7888g0(Ceiling10Service ceiling10Service, CompletionHandler completionHandler) {
            this.f15857a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15857a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f15857a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$g1 */
    public interface C7889g1 {
        /* renamed from: a */
        void mo29392a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$h */
    class C7890h implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7937w1 f15858a;

        C7890h(Ceiling10Service ceiling10Service, C7937w1 w1Var) {
            this.f15858a = w1Var;
        }

        public void onFailed(int i, String str) {
            this.f15858a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("onFromPower");
            if (property.isValueValid()) {
                this.f15858a.mo29422a((Long) propertyInfo.getValue("onFromPower"));
                return;
            }
            C7937w1 w1Var = this.f15858a;
            w1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$h0 */
    class C7891h0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15859a;

        C7891h0(Ceiling10Service ceiling10Service, CompletionHandler completionHandler) {
            this.f15859a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15859a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f15859a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$h1 */
    public interface C7892h1 {
        /* renamed from: a */
        void mo29394a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$i */
    class C7893i implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7919q1 f15860a;

        C7893i(Ceiling10Service ceiling10Service, C7919q1 q1Var) {
            this.f15860a = q1Var;
        }

        public void onFailed(int i, String str) {
            this.f15860a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("NLBright");
            if (property.isValueValid()) {
                this.f15860a.mo29412a((Long) propertyInfo.getValue("NLBright"));
                return;
            }
            C7919q1 q1Var = this.f15860a;
            q1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$i0 */
    class C7894i0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15861a;

        C7894i0(Ceiling10Service ceiling10Service, CompletionHandler completionHandler) {
            this.f15861a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15861a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f15861a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$i1 */
    public interface C7895i1 {
        /* renamed from: a */
        void mo29396a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$j */
    class C7896j implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7922r1 f15862a;

        C7896j(Ceiling10Service ceiling10Service, C7922r1 r1Var) {
            this.f15862a = r1Var;
        }

        public void onFailed(int i, String str) {
            this.f15862a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("NightTimeInfo");
            if (property.isValueValid()) {
                this.f15862a.onSucceed((String) propertyInfo.getValue("NightTimeInfo"));
                return;
            }
            C7922r1 r1Var = this.f15862a;
            r1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$j0 */
    class C7897j0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15863a;

        C7897j0(Ceiling10Service ceiling10Service, CompletionHandler completionHandler) {
            this.f15863a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15863a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f15863a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$j1 */
    public interface C7898j1 {
        /* renamed from: a */
        void mo29398a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$k */
    class C7899k implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15864a;

        C7899k(Ceiling10Service ceiling10Service, CompletionHandler completionHandler) {
            this.f15864a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15864a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f15864a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$k0 */
    class C7900k0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15865a;

        C7900k0(Ceiling10Service ceiling10Service, CompletionHandler completionHandler) {
            this.f15865a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15865a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f15865a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$k1 */
    public interface C7901k1 {
        /* renamed from: a */
        void mo29400a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$l */
    class C7902l implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7916p1 f15866a;

        C7902l(Ceiling10Service ceiling10Service, C7916p1 p1Var) {
            this.f15866a = p1Var;
        }

        public void onFailed(int i, String str) {
            this.f15866a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("MiBandSleep");
            if (property.isValueValid()) {
                this.f15866a.mo29410a((Long) propertyInfo.getValue("MiBandSleep"));
                return;
            }
            C7916p1 p1Var = this.f15866a;
            p1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$l0 */
    class C7903l0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15867a;

        C7903l0(Ceiling10Service ceiling10Service, CompletionHandler completionHandler) {
            this.f15867a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15867a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f15867a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$l1 */
    public interface C7904l1 {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$m */
    class C7905m implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7892h1 f15868a;

        C7905m(Ceiling10Service ceiling10Service, C7892h1 h1Var) {
            this.f15868a = h1Var;
        }

        public void onFailed(int i, String str) {
            this.f15868a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("BgRgb");
            if (property.isValueValid()) {
                this.f15868a.mo29394a((Long) propertyInfo.getValue("BgRgb"));
                return;
            }
            C7892h1 h1Var = this.f15868a;
            h1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$m0 */
    class C7906m0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15869a;

        C7906m0(Ceiling10Service ceiling10Service, CompletionHandler completionHandler) {
            this.f15869a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15869a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f15869a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$m1 */
    public interface C7907m1 {
        /* renamed from: a */
        void mo29404a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$n */
    class C7908n implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7907m1 f15870a;

        C7908n(Ceiling10Service ceiling10Service, C7907m1 m1Var) {
            this.f15870a = m1Var;
        }

        public void onFailed(int i, String str) {
            this.f15870a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Flowing");
            if (property.isValueValid()) {
                this.f15870a.mo29404a((Long) propertyInfo.getValue("Flowing"));
                return;
            }
            C7907m1 m1Var = this.f15870a;
            m1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$n0 */
    class C7909n0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15871a;

        C7909n0(Ceiling10Service ceiling10Service, CompletionHandler completionHandler) {
            this.f15871a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15871a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f15871a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$n1 */
    public interface C7910n1 {
        /* renamed from: a */
        void mo29406a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$o */
    class C7911o implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7883e1 f15872a;

        C7911o(Ceiling10Service ceiling10Service, C7883e1 e1Var) {
            this.f15872a = e1Var;
        }

        public void onFailed(int i, String str) {
            this.f15872a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("BgFlowing");
            if (property.isValueValid()) {
                this.f15872a.mo29388a((Long) propertyInfo.getValue("BgFlowing"));
                return;
            }
            C7883e1 e1Var = this.f15872a;
            e1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$o0 */
    class C7912o0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15873a;

        C7912o0(Ceiling10Service ceiling10Service, CompletionHandler completionHandler) {
            this.f15873a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15873a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f15873a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$o1 */
    public interface C7913o1 {
        /* renamed from: a */
        void mo29408a(C7940x1 x1Var);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$p */
    class C7914p implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7889g1 f15874a;

        C7914p(Ceiling10Service ceiling10Service, C7889g1 g1Var) {
            this.f15874a = g1Var;
        }

        public void onFailed(int i, String str) {
            this.f15874a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("BgProact");
            if (property.isValueValid()) {
                this.f15874a.mo29392a((Long) propertyInfo.getValue("BgProact"));
                return;
            }
            C7889g1 g1Var = this.f15874a;
            g1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$p0 */
    class C7915p0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15875a;

        C7915p0(Ceiling10Service ceiling10Service, CompletionHandler completionHandler) {
            this.f15875a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15875a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f15875a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$p1 */
    public interface C7916p1 {
        /* renamed from: a */
        void mo29410a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$q */
    class C7917q implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7934v1 f15876a;

        C7917q(Ceiling10Service ceiling10Service, C7934v1 v1Var) {
            this.f15876a = v1Var;
        }

        public void onFailed(int i, String str) {
            this.f15876a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("SmartSwitch");
            if (property.isValueValid()) {
                this.f15876a.mo29420a((Long) propertyInfo.getValue("SmartSwitch"));
                return;
            }
            C7934v1 v1Var = this.f15876a;
            v1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$q0 */
    class C7918q0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15877a;

        C7918q0(Ceiling10Service ceiling10Service, CompletionHandler completionHandler) {
            this.f15877a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15877a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f15877a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$q1 */
    public interface C7919q1 {
        /* renamed from: a */
        void mo29412a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$r */
    class C7920r implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15878a;

        C7920r(Ceiling10Service ceiling10Service, CompletionHandler completionHandler) {
            this.f15878a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15878a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f15878a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$r0 */
    class C7921r0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7928t1 f15879a;

        C7921r0(Ceiling10Service ceiling10Service, C7928t1 t1Var) {
            this.f15879a = t1Var;
        }

        public void onFailed(int i, String str) {
            this.f15879a.onFailed(i, str);
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
                com.yeelight.yeelib.device.xiaomi.Ceiling10Service$x1 r1 = com.yeelight.yeelib.device.xiaomi.Ceiling10Service.C7940x1.valueOf(r1)
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
                com.yeelight.yeelib.device.xiaomi.Ceiling10Service$y1 r1 = com.yeelight.yeelib.device.xiaomi.Ceiling10Service.C7943y1.valueOf(r1)
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
                com.yeelight.yeelib.device.xiaomi.Ceiling10Service$y0 r1 = com.yeelight.yeelib.device.xiaomi.Ceiling10Service.C7942y0.valueOf(r1)
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
                com.yeelight.yeelib.device.xiaomi.Ceiling10Service$t1 r4 = r0.f15879a
                r4.mo28267a(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.xiaomi.Ceiling10Service.C7921r0.onSucceed(com.miot.common.device.invocation.PropertyInfo):void");
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$r1 */
    public interface C7922r1 {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$s */
    class C7923s implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15880a;

        C7923s(Ceiling10Service ceiling10Service, CompletionHandler completionHandler) {
            this.f15880a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15880a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f15880a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$s0 */
    class C7924s0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15881a;

        C7924s0(Ceiling10Service ceiling10Service, CompletionHandler completionHandler) {
            this.f15881a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15881a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f15881a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$s1 */
    public interface C7925s1 {
        /* renamed from: a */
        void mo29416a(C7943y1 y1Var);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$t */
    class C7926t implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15882a;

        C7926t(Ceiling10Service ceiling10Service, CompletionHandler completionHandler) {
            this.f15882a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15882a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f15882a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$t0 */
    class C7927t0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7913o1 f15883a;

        C7927t0(Ceiling10Service ceiling10Service, C7913o1 o1Var) {
            this.f15883a = o1Var;
        }

        public void onFailed(int i, String str) {
            this.f15883a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("MainPower");
            if (property.isValueValid()) {
                this.f15883a.mo29408a(C7940x1.valueOf((String) propertyInfo.getValue("MainPower")));
                return;
            }
            C7913o1 o1Var = this.f15883a;
            o1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$t1 */
    public interface C7928t1 {
        /* renamed from: a */
        void mo28267a(C7940x1 x1Var, C7943y1 y1Var, C7942y0 y0Var, Long l, Long l2, Long l3, Long l4, Long l5, String str, String str2, Long l6, Long l7, Long l8, Long l9, String str3, Long l10, Long l11, Long l12, Long l13, Long l14, Long l15);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$u */
    class C7929u implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15884a;

        C7929u(Ceiling10Service ceiling10Service, CompletionHandler completionHandler) {
            this.f15884a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15884a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f15884a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$u0 */
    class C7930u0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7925s1 f15885a;

        C7930u0(Ceiling10Service ceiling10Service, C7925s1 s1Var) {
            this.f15885a = s1Var;
        }

        public void onFailed(int i, String str) {
            this.f15885a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Power");
            if (property.isValueValid()) {
                this.f15885a.mo29416a(C7943y1.valueOf((String) propertyInfo.getValue("Power")));
                return;
            }
            C7925s1 s1Var = this.f15885a;
            s1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$u1 */
    public interface C7931u1 {
        /* renamed from: a */
        void mo29418a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$v */
    class C7932v implements DeviceManipulator.PropertyChangedListener {

        /* renamed from: a */
        final /* synthetic */ C7946z1 f15886a;

        C7932v(Ceiling10Service ceiling10Service, C7946z1 z1Var) {
            this.f15886a = z1Var;
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:100:0x029a, code lost:
            if (r2.getProperty(r6).isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:101:0x029c, code lost:
            r9.f15886a.mo28277i((java.lang.String) r2.getValue(r6));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:102:0x02a9, code lost:
            r9 = r24;
            r2 = r25;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:103:0x02b5, code lost:
            if (r2.getProperty(r3).isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:104:0x02b7, code lost:
            r9.f15886a.mo28279k((java.lang.Long) r2.getValue(r3));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:105:0x02c4, code lost:
            r9 = r24;
            r2 = r25;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:106:0x02d0, code lost:
            if (r2.getProperty("onFromPower").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:107:0x02d2, code lost:
            r9.f15886a.mo28274f((java.lang.Long) r2.getValue("onFromPower"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:108:0x02df, code lost:
            r9 = r24;
            r2 = r25;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:109:0x02eb, code lost:
            if (r2.getProperty("SaveState").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:110:0x02ed, code lost:
            r9.f15886a.mo28272d((java.lang.Long) r2.getValue("SaveState"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:111:0x02fa, code lost:
            r9 = r24;
            r2 = r25;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:112:0x0306, code lost:
            if (r2.getProperty("LanMode").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:113:0x0308, code lost:
            r9.f15886a.mo28275g((java.lang.Long) r2.getValue("LanMode"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:114:0x0315, code lost:
            r9 = r24;
            r2 = r25;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:115:0x0321, code lost:
            if (r2.getProperty("BgFlowParams").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:116:0x0323, code lost:
            r9.f15886a.mo28284r((java.lang.String) r2.getValue("BgFlowParams"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:117:0x0330, code lost:
            r9 = r24;
            r2 = r25;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:118:0x033c, code lost:
            if (r2.getProperty(r8).isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:119:0x033e, code lost:
            r9.f15886a.mo28273e((java.lang.String) r2.getValue(r8));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:120:0x034b, code lost:
            r9 = r24;
            r2 = r25;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:121:0x0357, code lost:
            if (r2.getProperty("DelayOff").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:122:0x0359, code lost:
            r9.f15886a.mo28270b((java.lang.Long) r2.getValue("DelayOff"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:123:0x0366, code lost:
            r9 = r24;
            r2 = r25;
            r0 = r16;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:124:0x0374, code lost:
            if (r2.getProperty(r0).isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:125:0x0376, code lost:
            r9.f15886a.mo28278j((java.lang.Long) r2.getValue(r0));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:126:0x0383, code lost:
            r9 = r24;
            r2 = r25;
            r4 = r17;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:127:0x0391, code lost:
            if (r2.getProperty(r4).isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:128:0x0393, code lost:
            r9.f15886a.mo28276h((java.lang.Long) r2.getValue(r4));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:129:0x03a0, code lost:
            r9 = r24;
            r2 = r25;
            r0 = r4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:130:0x03ad, code lost:
            if (r2.getProperty(r0).isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:131:0x03af, code lost:
            r9.f15886a.mo28280l((java.lang.Long) r2.getValue(r0));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:132:0x03bc, code lost:
            r9 = r24;
            r2 = r25;
            r0 = r21;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:133:0x03ca, code lost:
            if (r2.getProperty(r0).isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:134:0x03cc, code lost:
            r9.f15886a.mo28269a((java.lang.Long) r2.getValue(r0));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:135:0x03d8, code lost:
            r9 = r24;
            r2 = r25;
            r0 = r20;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:136:0x03e6, code lost:
            if (r2.getProperty(r0).isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:137:0x03e8, code lost:
            r9.f15886a.mo28289w(com.yeelight.yeelib.device.xiaomi.Ceiling10Service.C7942y0.valueOf((java.lang.String) r2.getValue(r0)));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:138:0x03f8, code lost:
            r9 = r24;
            r2 = r25;
            r0 = r19;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:139:0x0406, code lost:
            if (r2.getProperty(r0).isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:140:0x0408, code lost:
            r9.f15886a.mo28288v(com.yeelight.yeelib.device.xiaomi.Ceiling10Service.C7943y1.valueOf((java.lang.String) r2.getValue(r0)));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:141:0x0418, code lost:
            r9 = r24;
            r2 = r25;
            r0 = r18;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:142:0x0426, code lost:
            if (r2.getProperty(r0).isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:143:0x0428, code lost:
            r9.f15886a.mo28287u(com.yeelight.yeelib.device.xiaomi.Ceiling10Service.C7940x1.valueOf((java.lang.String) r2.getValue(r0)));
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
        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0045, code lost:
            r3 = r18;
            r18 = "MainPower";
            r6 = r19;
            r19 = "Power";
            r13 = r20;
            r20 = "BgPower";
            r8 = r21;
            r21 = "Bright";
            r4 = r22;
            r23 = r16;
            r16 = "BgCt";
            r0 = r17;
            r17 = r23;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x00d0, code lost:
            r3 = r18;
            r18 = "MainPower";
            r6 = r19;
            r19 = "Power";
            r13 = r20;
            r20 = "BgPower";
            r8 = r21;
            r21 = "Bright";
            r4 = r22;
            r23 = r16;
            r16 = "BgCt";
            r0 = r17;
            r17 = r23;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:0x010d, code lost:
            r17 = r3;
            r3 = r18;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x0112, code lost:
            r17 = r3;
            r3 = r18;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:55:0x0129, code lost:
            r18 = "MainPower";
            r6 = r19;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:56:0x012e, code lost:
            r18 = "MainPower";
            r6 = r19;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:60:0x0149, code lost:
            r19 = "Power";
            r13 = r20;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:61:0x014e, code lost:
            r19 = "Power";
            r13 = r20;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:65:0x016d, code lost:
            r20 = "BgPower";
            r8 = r21;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:66:0x0172, code lost:
            r20 = "BgPower";
            r8 = r21;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:70:0x0195, code lost:
            r21 = "Bright";
            r4 = r22;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:71:0x019a, code lost:
            r21 = "Bright";
            r4 = r22;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:78:0x01e4, code lost:
            r2 = 65535;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:79:0x01e5, code lost:
            switch(r2) {
                case 0: goto L_0x0418;
                case 1: goto L_0x03f8;
                case 2: goto L_0x03d8;
                case 3: goto L_0x03bc;
                case 4: goto L_0x03a0;
                case 5: goto L_0x0383;
                case 6: goto L_0x0366;
                case 7: goto L_0x034b;
                case 8: goto L_0x0330;
                case 9: goto L_0x0315;
                case 10: goto L_0x02fa;
                case 11: goto L_0x02df;
                case 12: goto L_0x02c4;
                case 13: goto L_0x02a9;
                case 14: goto L_0x028e;
                case 15: goto L_0x0273;
                case 16: goto L_0x0258;
                case 17: goto L_0x023d;
                case 18: goto L_0x0222;
                case 19: goto L_0x0207;
                case 20: goto L_0x01ec;
                default: goto L_0x01e8;
            };
         */
        /* JADX WARNING: Code restructure failed: missing block: B:80:0x01e8, code lost:
            r9 = r24;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:81:0x01ec, code lost:
            r2 = r25;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:82:0x01f6, code lost:
            if (r2.getProperty("SmartSwitch").isValueValid() == false) goto L_0x01e8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:83:0x01f8, code lost:
            r24.f15886a.mo28283p((java.lang.Long) r2.getValue("SmartSwitch"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:84:0x0207, code lost:
            r9 = r24;
            r2 = r25;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:85:0x0213, code lost:
            if (r2.getProperty(r13).isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:86:0x0215, code lost:
            r9.f15886a.mo28285s((java.lang.Long) r2.getValue(r13));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:87:0x0222, code lost:
            r9 = r24;
            r2 = r25;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:88:0x022e, code lost:
            if (r2.getProperty("BgFlowing").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:89:0x0230, code lost:
            r9.f15886a.mo28286t((java.lang.Long) r2.getValue("BgFlowing"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:90:0x023d, code lost:
            r9 = r24;
            r2 = r25;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:91:0x0249, code lost:
            if (r2.getProperty("Flowing").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:92:0x024b, code lost:
            r9.f15886a.mo28271c((java.lang.Long) r2.getValue("Flowing"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:93:0x0258, code lost:
            r9 = r24;
            r2 = r25;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:94:0x0264, code lost:
            if (r2.getProperty("BgRgb").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:95:0x0266, code lost:
            r9.f15886a.mo28282n((java.lang.Long) r2.getValue("BgRgb"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:96:0x0273, code lost:
            r9 = r24;
            r2 = r25;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:97:0x027f, code lost:
            if (r2.getProperty(r0).isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:98:0x0281, code lost:
            r9.f15886a.mo28281m((java.lang.Long) r2.getValue(r0));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:99:0x028e, code lost:
            r9 = r24;
            r2 = r25;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onPropertyChanged(com.miot.common.device.invocation.PropertyInfo r25, java.lang.String r26) {
            /*
                r24 = this;
                r0 = r24
                r1 = r25
                r2 = r26
                int r3 = r26.hashCode()
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
                switch(r3) {
                    case -2117953292: goto L_0x01c1;
                    case -2017000513: goto L_0x019f;
                    case -2002016140: goto L_0x0177;
                    case -1616019574: goto L_0x0153;
                    case -1331143373: goto L_0x0133;
                    case -770908584: goto L_0x0117;
                    case -80340154: goto L_0x00ff;
                    case 2193: goto L_0x00ec;
                    case 2067382: goto L_0x00c9;
                    case 35911772: goto L_0x00c0;
                    case 64102952: goto L_0x00b7;
                    case 77306085: goto L_0x00af;
                    case 880790796: goto L_0x00a7;
                    case 898856916: goto L_0x009e;
                    case 986784719: goto L_0x0095;
                    case 1179821629: goto L_0x008c;
                    case 1471809440: goto L_0x0084;
                    case 1611821756: goto L_0x007b;
                    case 1738956460: goto L_0x0073;
                    case 1820079769: goto L_0x006a;
                    case 1998035738: goto L_0x0061;
                    default: goto L_0x0045;
                }
            L_0x0045:
                r3 = r18
                r18 = r6
                r6 = r19
                r19 = r13
                r13 = r20
                r20 = r8
                r8 = r21
                r21 = r4
                r4 = r22
                r23 = r16
                r16 = r0
                r0 = r17
                r17 = r23
                goto L_0x01e4
            L_0x0061:
                boolean r2 = r2.equals(r4)
                if (r2 == 0) goto L_0x0045
                r2 = 3
                goto L_0x00d0
            L_0x006a:
                boolean r2 = r2.equals(r5)
                if (r2 == 0) goto L_0x0045
                r2 = 9
                goto L_0x00d0
            L_0x0073:
                boolean r2 = r2.equals(r6)
                if (r2 == 0) goto L_0x0045
                r2 = 0
                goto L_0x00d0
            L_0x007b:
                boolean r2 = r2.equals(r7)
                if (r2 == 0) goto L_0x0045
                r2 = 10
                goto L_0x00d0
            L_0x0084:
                boolean r2 = r2.equals(r8)
                if (r2 == 0) goto L_0x0045
                r2 = 2
                goto L_0x00d0
            L_0x008c:
                boolean r2 = r2.equals(r9)
                if (r2 == 0) goto L_0x0045
                r2 = 20
                goto L_0x00d0
            L_0x0095:
                boolean r2 = r2.equals(r10)
                if (r2 == 0) goto L_0x0045
                r2 = 18
                goto L_0x00d0
            L_0x009e:
                boolean r2 = r2.equals(r11)
                if (r2 == 0) goto L_0x0045
                r2 = 17
                goto L_0x00d0
            L_0x00a7:
                boolean r2 = r2.equals(r12)
                if (r2 == 0) goto L_0x0045
                r2 = 7
                goto L_0x00d0
            L_0x00af:
                boolean r2 = r2.equals(r13)
                if (r2 == 0) goto L_0x0045
                r2 = 1
                goto L_0x00d0
            L_0x00b7:
                boolean r2 = r2.equals(r14)
                if (r2 == 0) goto L_0x0045
                r2 = 16
                goto L_0x00d0
            L_0x00c0:
                boolean r2 = r2.equals(r15)
                if (r2 == 0) goto L_0x0045
                r2 = 12
                goto L_0x00d0
            L_0x00c9:
                boolean r2 = r2.equals(r0)
                if (r2 == 0) goto L_0x0045
                r2 = 6
            L_0x00d0:
                r3 = r18
                r18 = r6
                r6 = r19
                r19 = r13
                r13 = r20
                r20 = r8
                r8 = r21
                r21 = r4
                r4 = r22
                r23 = r16
                r16 = r0
                r0 = r17
                r17 = r23
                goto L_0x01e5
            L_0x00ec:
                r3 = r16
                boolean r2 = r2.equals(r3)
                if (r2 == 0) goto L_0x00fa
                r2 = 5
                r16 = r0
                r0 = r17
                goto L_0x010d
            L_0x00fa:
                r16 = r0
                r0 = r17
                goto L_0x0112
            L_0x00ff:
                r3 = r16
                r16 = r0
                r0 = r17
                boolean r2 = r2.equals(r0)
                if (r2 == 0) goto L_0x0112
                r2 = 15
            L_0x010d:
                r17 = r3
                r3 = r18
                goto L_0x0129
            L_0x0112:
                r17 = r3
                r3 = r18
                goto L_0x012e
            L_0x0117:
                r3 = r18
                r23 = r16
                r16 = r0
                r0 = r17
                r17 = r23
                boolean r2 = r2.equals(r3)
                if (r2 == 0) goto L_0x012e
                r2 = 13
            L_0x0129:
                r18 = r6
                r6 = r19
                goto L_0x0149
            L_0x012e:
                r18 = r6
                r6 = r19
                goto L_0x014e
            L_0x0133:
                r3 = r18
                r18 = r6
                r6 = r19
                r23 = r16
                r16 = r0
                r0 = r17
                r17 = r23
                boolean r2 = r2.equals(r6)
                if (r2 == 0) goto L_0x014e
                r2 = 14
            L_0x0149:
                r19 = r13
                r13 = r20
                goto L_0x016d
            L_0x014e:
                r19 = r13
                r13 = r20
                goto L_0x0172
            L_0x0153:
                r3 = r18
                r18 = r6
                r6 = r19
                r19 = r13
                r13 = r20
                r23 = r16
                r16 = r0
                r0 = r17
                r17 = r23
                boolean r2 = r2.equals(r13)
                if (r2 == 0) goto L_0x0172
                r2 = 19
            L_0x016d:
                r20 = r8
                r8 = r21
                goto L_0x0195
            L_0x0172:
                r20 = r8
                r8 = r21
                goto L_0x019a
            L_0x0177:
                r3 = r18
                r18 = r6
                r6 = r19
                r19 = r13
                r13 = r20
                r20 = r8
                r8 = r21
                r23 = r16
                r16 = r0
                r0 = r17
                r17 = r23
                boolean r2 = r2.equals(r8)
                if (r2 == 0) goto L_0x019a
                r2 = 8
            L_0x0195:
                r21 = r4
                r4 = r22
                goto L_0x01e5
            L_0x019a:
                r21 = r4
                r4 = r22
                goto L_0x01e4
            L_0x019f:
                r3 = r18
                r18 = r6
                r6 = r19
                r19 = r13
                r13 = r20
                r20 = r8
                r8 = r21
                r21 = r4
                r4 = r22
                r23 = r16
                r16 = r0
                r0 = r17
                r17 = r23
                boolean r2 = r2.equals(r4)
                if (r2 == 0) goto L_0x01e4
                r2 = 4
                goto L_0x01e5
            L_0x01c1:
                r3 = r18
                r18 = r6
                r6 = r19
                r19 = r13
                r13 = r20
                r20 = r8
                r8 = r21
                r21 = r4
                r4 = r22
                r23 = r16
                r16 = r0
                r0 = r17
                r17 = r23
                boolean r2 = r2.equals(r1)
                if (r2 == 0) goto L_0x01e4
                r2 = 11
                goto L_0x01e5
            L_0x01e4:
                r2 = -1
            L_0x01e5:
                switch(r2) {
                    case 0: goto L_0x0418;
                    case 1: goto L_0x03f8;
                    case 2: goto L_0x03d8;
                    case 3: goto L_0x03bc;
                    case 4: goto L_0x03a0;
                    case 5: goto L_0x0383;
                    case 6: goto L_0x0366;
                    case 7: goto L_0x034b;
                    case 8: goto L_0x0330;
                    case 9: goto L_0x0315;
                    case 10: goto L_0x02fa;
                    case 11: goto L_0x02df;
                    case 12: goto L_0x02c4;
                    case 13: goto L_0x02a9;
                    case 14: goto L_0x028e;
                    case 15: goto L_0x0273;
                    case 16: goto L_0x0258;
                    case 17: goto L_0x023d;
                    case 18: goto L_0x0222;
                    case 19: goto L_0x0207;
                    case 20: goto L_0x01ec;
                    default: goto L_0x01e8;
                }
            L_0x01e8:
                r9 = r24
                goto L_0x0437
            L_0x01ec:
                r2 = r25
                com.miot.common.property.Property r0 = r2.getProperty(r9)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x01e8
                java.lang.Object r0 = r2.getValue(r9)
                java.lang.Long r0 = (java.lang.Long) r0
                r9 = r24
                com.yeelight.yeelib.device.xiaomi.Ceiling10Service$z1 r1 = r9.f15886a
                r1.mo28283p(r0)
                goto L_0x0437
            L_0x0207:
                r9 = r24
                r2 = r25
                com.miot.common.property.Property r0 = r2.getProperty(r13)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0437
                java.lang.Object r0 = r2.getValue(r13)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Ceiling10Service$z1 r1 = r9.f15886a
                r1.mo28285s(r0)
                goto L_0x0437
            L_0x0222:
                r9 = r24
                r2 = r25
                com.miot.common.property.Property r0 = r2.getProperty(r10)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0437
                java.lang.Object r0 = r2.getValue(r10)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Ceiling10Service$z1 r1 = r9.f15886a
                r1.mo28286t(r0)
                goto L_0x0437
            L_0x023d:
                r9 = r24
                r2 = r25
                com.miot.common.property.Property r0 = r2.getProperty(r11)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0437
                java.lang.Object r0 = r2.getValue(r11)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Ceiling10Service$z1 r1 = r9.f15886a
                r1.mo28271c(r0)
                goto L_0x0437
            L_0x0258:
                r9 = r24
                r2 = r25
                com.miot.common.property.Property r0 = r2.getProperty(r14)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0437
                java.lang.Object r0 = r2.getValue(r14)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Ceiling10Service$z1 r1 = r9.f15886a
                r1.mo28282n(r0)
                goto L_0x0437
            L_0x0273:
                r9 = r24
                r2 = r25
                com.miot.common.property.Property r1 = r2.getProperty(r0)
                boolean r1 = r1.isValueValid()
                if (r1 == 0) goto L_0x0437
                java.lang.Object r0 = r2.getValue(r0)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Ceiling10Service$z1 r1 = r9.f15886a
                r1.mo28281m(r0)
                goto L_0x0437
            L_0x028e:
                r9 = r24
                r2 = r25
                com.miot.common.property.Property r0 = r2.getProperty(r6)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0437
                java.lang.Object r0 = r2.getValue(r6)
                java.lang.String r0 = (java.lang.String) r0
                com.yeelight.yeelib.device.xiaomi.Ceiling10Service$z1 r1 = r9.f15886a
                r1.mo28277i(r0)
                goto L_0x0437
            L_0x02a9:
                r9 = r24
                r2 = r25
                com.miot.common.property.Property r0 = r2.getProperty(r3)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0437
                java.lang.Object r0 = r2.getValue(r3)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Ceiling10Service$z1 r1 = r9.f15886a
                r1.mo28279k(r0)
                goto L_0x0437
            L_0x02c4:
                r9 = r24
                r2 = r25
                com.miot.common.property.Property r0 = r2.getProperty(r15)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0437
                java.lang.Object r0 = r2.getValue(r15)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Ceiling10Service$z1 r1 = r9.f15886a
                r1.mo28274f(r0)
                goto L_0x0437
            L_0x02df:
                r9 = r24
                r2 = r25
                com.miot.common.property.Property r0 = r2.getProperty(r1)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0437
                java.lang.Object r0 = r2.getValue(r1)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Ceiling10Service$z1 r1 = r9.f15886a
                r1.mo28272d(r0)
                goto L_0x0437
            L_0x02fa:
                r9 = r24
                r2 = r25
                com.miot.common.property.Property r0 = r2.getProperty(r7)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0437
                java.lang.Object r0 = r2.getValue(r7)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Ceiling10Service$z1 r1 = r9.f15886a
                r1.mo28275g(r0)
                goto L_0x0437
            L_0x0315:
                r9 = r24
                r2 = r25
                com.miot.common.property.Property r0 = r2.getProperty(r5)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0437
                java.lang.Object r0 = r2.getValue(r5)
                java.lang.String r0 = (java.lang.String) r0
                com.yeelight.yeelib.device.xiaomi.Ceiling10Service$z1 r1 = r9.f15886a
                r1.mo28284r(r0)
                goto L_0x0437
            L_0x0330:
                r9 = r24
                r2 = r25
                com.miot.common.property.Property r0 = r2.getProperty(r8)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0437
                java.lang.Object r0 = r2.getValue(r8)
                java.lang.String r0 = (java.lang.String) r0
                com.yeelight.yeelib.device.xiaomi.Ceiling10Service$z1 r1 = r9.f15886a
                r1.mo28273e(r0)
                goto L_0x0437
            L_0x034b:
                r9 = r24
                r2 = r25
                com.miot.common.property.Property r0 = r2.getProperty(r12)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0437
                java.lang.Object r0 = r2.getValue(r12)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Ceiling10Service$z1 r1 = r9.f15886a
                r1.mo28270b(r0)
                goto L_0x0437
            L_0x0366:
                r9 = r24
                r2 = r25
                r0 = r16
                com.miot.common.property.Property r1 = r2.getProperty(r0)
                boolean r1 = r1.isValueValid()
                if (r1 == 0) goto L_0x0437
                java.lang.Object r0 = r2.getValue(r0)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Ceiling10Service$z1 r1 = r9.f15886a
                r1.mo28278j(r0)
                goto L_0x0437
            L_0x0383:
                r9 = r24
                r2 = r25
                r4 = r17
                com.miot.common.property.Property r0 = r2.getProperty(r4)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0437
                java.lang.Object r0 = r2.getValue(r4)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Ceiling10Service$z1 r1 = r9.f15886a
                r1.mo28276h(r0)
                goto L_0x0437
            L_0x03a0:
                r9 = r24
                r2 = r25
                r0 = r4
                com.miot.common.property.Property r1 = r2.getProperty(r0)
                boolean r1 = r1.isValueValid()
                if (r1 == 0) goto L_0x0437
                java.lang.Object r0 = r2.getValue(r0)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Ceiling10Service$z1 r1 = r9.f15886a
                r1.mo28280l(r0)
                goto L_0x0437
            L_0x03bc:
                r9 = r24
                r2 = r25
                r0 = r21
                com.miot.common.property.Property r1 = r2.getProperty(r0)
                boolean r1 = r1.isValueValid()
                if (r1 == 0) goto L_0x0437
                java.lang.Object r0 = r2.getValue(r0)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Ceiling10Service$z1 r1 = r9.f15886a
                r1.mo28269a(r0)
                goto L_0x0437
            L_0x03d8:
                r9 = r24
                r2 = r25
                r0 = r20
                com.miot.common.property.Property r1 = r2.getProperty(r0)
                boolean r1 = r1.isValueValid()
                if (r1 == 0) goto L_0x0437
                java.lang.Object r0 = r2.getValue(r0)
                java.lang.String r0 = (java.lang.String) r0
                com.yeelight.yeelib.device.xiaomi.Ceiling10Service$y0 r0 = com.yeelight.yeelib.device.xiaomi.Ceiling10Service.C7942y0.valueOf(r0)
                com.yeelight.yeelib.device.xiaomi.Ceiling10Service$z1 r1 = r9.f15886a
                r1.mo28289w(r0)
                goto L_0x0437
            L_0x03f8:
                r9 = r24
                r2 = r25
                r0 = r19
                com.miot.common.property.Property r1 = r2.getProperty(r0)
                boolean r1 = r1.isValueValid()
                if (r1 == 0) goto L_0x0437
                java.lang.Object r0 = r2.getValue(r0)
                java.lang.String r0 = (java.lang.String) r0
                com.yeelight.yeelib.device.xiaomi.Ceiling10Service$y1 r0 = com.yeelight.yeelib.device.xiaomi.Ceiling10Service.C7943y1.valueOf(r0)
                com.yeelight.yeelib.device.xiaomi.Ceiling10Service$z1 r1 = r9.f15886a
                r1.mo28288v(r0)
                goto L_0x0437
            L_0x0418:
                r9 = r24
                r2 = r25
                r0 = r18
                com.miot.common.property.Property r1 = r2.getProperty(r0)
                boolean r1 = r1.isValueValid()
                if (r1 == 0) goto L_0x0437
                java.lang.Object r0 = r2.getValue(r0)
                java.lang.String r0 = (java.lang.String) r0
                com.yeelight.yeelib.device.xiaomi.Ceiling10Service$x1 r0 = com.yeelight.yeelib.device.xiaomi.Ceiling10Service.C7940x1.valueOf(r0)
                com.yeelight.yeelib.device.xiaomi.Ceiling10Service$z1 r1 = r9.f15886a
                r1.mo28287u(r0)
            L_0x0437:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.xiaomi.Ceiling10Service.C7932v.onPropertyChanged(com.miot.common.device.invocation.PropertyInfo, java.lang.String):void");
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$v0 */
    class C7933v0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7886f1 f15887a;

        C7933v0(Ceiling10Service ceiling10Service, C7886f1 f1Var) {
            this.f15887a = f1Var;
        }

        public void onFailed(int i, String str) {
            this.f15887a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("BgPower");
            if (property.isValueValid()) {
                this.f15887a.mo29390a(C7942y0.valueOf((String) propertyInfo.getValue("BgPower")));
                return;
            }
            C7886f1 f1Var = this.f15887a;
            f1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$v1 */
    public interface C7934v1 {
        /* renamed from: a */
        void mo29420a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$w */
    class C7935w implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15888a;

        C7935w(Ceiling10Service ceiling10Service, CompletionHandler completionHandler) {
            this.f15888a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15888a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f15888a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$w0 */
    class C7936w0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7895i1 f15889a;

        C7936w0(Ceiling10Service ceiling10Service, C7895i1 i1Var) {
            this.f15889a = i1Var;
        }

        public void onFailed(int i, String str) {
            this.f15889a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Bright");
            if (property.isValueValid()) {
                this.f15889a.mo29396a((Long) propertyInfo.getValue("Bright"));
                return;
            }
            C7895i1 i1Var = this.f15889a;
            i1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$w1 */
    public interface C7937w1 {
        /* renamed from: a */
        void mo29422a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$x */
    class C7938x implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15890a;

        C7938x(Ceiling10Service ceiling10Service, CompletionHandler completionHandler) {
            this.f15890a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15890a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f15890a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$x0 */
    class C7939x0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7874b1 f15891a;

        C7939x0(Ceiling10Service ceiling10Service, C7874b1 b1Var) {
            this.f15891a = b1Var;
        }

        public void onFailed(int i, String str) {
            this.f15891a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("BgBright");
            if (property.isValueValid()) {
                this.f15891a.mo29382a((Long) propertyInfo.getValue("BgBright"));
                return;
            }
            C7874b1 b1Var = this.f15891a;
            b1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$x1 */
    public enum C7940x1 {
        undefined,
        on,
        off
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$y */
    class C7941y implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15896a;

        C7941y(Ceiling10Service ceiling10Service, CompletionHandler completionHandler) {
            this.f15896a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15896a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f15896a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$y0 */
    public enum C7942y0 {
        undefined,
        on,
        off
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$y1 */
    public enum C7943y1 {
        undefined,
        on,
        off
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$z */
    class C7944z implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15905a;

        C7944z(Ceiling10Service ceiling10Service, CompletionHandler completionHandler) {
            this.f15905a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15905a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f15905a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$z0 */
    public enum C7945z0 {
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

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling10Service$z1 */
    public interface C7946z1 {
        /* renamed from: a */
        void mo28269a(Long l);

        /* renamed from: b */
        void mo28270b(Long l);

        /* renamed from: c */
        void mo28271c(Long l);

        /* renamed from: d */
        void mo28272d(Long l);

        /* renamed from: e */
        void mo28273e(String str);

        /* renamed from: f */
        void mo28274f(Long l);

        /* renamed from: g */
        void mo28275g(Long l);

        /* renamed from: h */
        void mo28276h(Long l);

        /* renamed from: i */
        void mo28277i(String str);

        /* renamed from: j */
        void mo28278j(Long l);

        /* renamed from: k */
        void mo28279k(Long l);

        /* renamed from: l */
        void mo28280l(Long l);

        /* renamed from: m */
        void mo28281m(Long l);

        /* renamed from: n */
        void mo28282n(Long l);

        /* renamed from: p */
        void mo28283p(Long l);

        /* renamed from: r */
        void mo28284r(String str);

        /* renamed from: s */
        void mo28285s(Long l);

        /* renamed from: t */
        void mo28286t(Long l);

        /* renamed from: u */
        void mo28287u(C7940x1 x1Var);

        /* renamed from: v */
        void mo28288v(C7943y1 y1Var);

        /* renamed from: w */
        void mo28289w(C7942y0 y0Var);
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
                MiotManager.getDeviceManipulator().invoke(create, new C7941y(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7900k0(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getBgBright(C7874b1 b1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "BgBright"), new C7939x0(this, b1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getBgCt(C7877c1 c1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "BgCt"), new C7872b(this, c1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getBgFlowParams(C7880d1 d1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "BgFlowParams"), new C7881e(this, d1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getBgFlowing(C7883e1 e1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "BgFlowing"), new C7911o(this, e1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getBgPower(C7886f1 f1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "BgPower"), new C7933v0(this, f1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getBgProact(C7889g1 g1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "BgProact"), new C7914p(this, g1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getBgRgb(C7892h1 h1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "BgRgb"), new C7905m(this, h1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getBright(C7895i1 i1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Bright"), new C7936w0(this, i1Var));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7924s0(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getCt(C7898j1 j1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Ct"), new C7869a(this, j1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getDelayOff(C7901k1 k1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "DelayOff"), new C7875c(this, k1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowParams(C7904l1 l1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "FlowParams"), new C7878d(this, l1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowing(C7907m1 m1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Flowing"), new C7908n(this, m1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getLanMode(C7910n1 n1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "LanMode"), new C7884f(this, n1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getMainPower(C7913o1 o1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "MainPower"), new C7927t0(this, o1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getMiBandSleep(C7916p1 p1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "MiBandSleep"), new C7902l(this, p1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getNLBright(C7919q1 q1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "NLBright"), new C7893i(this, q1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getNightTimeInfo(C7922r1 r1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "NightTimeInfo"), new C7896j(this, r1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getPower(C7925s1 s1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Power"), new C7930u0(this, s1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getProperties(C7928t1 t1Var) {
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
            MiotManager.getDeviceManipulator().readProperty(create, new C7921r0(this, t1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getSaveState(C7931u1 u1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "SaveState"), new C7887g(this, u1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getSmartSwitch(C7934v1 v1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "SmartSwitch"), new C7917q(this, v1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getonFromPower(C7937w1 w1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "onFromPower"), new C7890h(this, w1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void openBgWithMode(C7942y0 y0Var, C7871a1 a1Var, Long l, Long l2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "openBgWithMode");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("BgPower", y0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Effect", a1Var.toString())) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Duration", l)) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("Mode", l2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C7938x(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void openWithMode(C7940x1 x1Var, C7871a1 a1Var, Long l, Long l2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "openWithMode");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("MainPower", x1Var.toString())) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Effect", a1Var.toString())) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Duration", l)) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("Mode", l2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C7929u(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7903l0(this, completionHandler));
                return;
            }
            throw new MiotException("actionInfo is null");
        }
        throw new MiotException("device not configurated connection");
    }

    public void sendCmd(C7945z0 z0Var, String str, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "sendCmd");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("CmdKey", z0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("CmdValue", str)) {
                MiotManager.getDeviceManipulator().invoke(create, new C7873b0(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setBgBright(Long l, C7871a1 a1Var, Long l2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setBgBright");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("BgBright", l)) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Effect", a1Var.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("Duration", l2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C7894i0(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setBgCt(Long l, C7871a1 a1Var, Long l2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setBgCt");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("BgCt", l)) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Effect", a1Var.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("Duration", l2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C7944z(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7885f0(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setBgPower(C7942y0 y0Var, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setBgPower");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (create.setArgumentValue("BgPower", y0Var.toString())) {
                MiotManager.getDeviceManipulator().invoke(create, new C7920r(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setBgRgb(Long l, C7871a1 a1Var, Long l2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setBgRgb");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("BgRgb", l)) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Effect", a1Var.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("Duration", l2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C7926t(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7897j0(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setBright(Long l, C7871a1 a1Var, Long l2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setBright");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("Bright", l)) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Effect", a1Var.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("Duration", l2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C7923s(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setCt(Long l, C7871a1 a1Var, Long l2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setCt");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("Ct", l)) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Effect", a1Var.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("Duration", l2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C7918q0(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7915p0(this, completionHandler));
                return;
            }
            throw new MiotException("actionInfo is null");
        }
        throw new MiotException("device not configurated connection");
    }

    public void setDevPower(C7943y1 y1Var, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setDevPower");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (create.setArgumentValue("Power", y1Var.toString())) {
                MiotManager.getDeviceManipulator().invoke(create, new C7909n0(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7879d0(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7870a0(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setPower(C7943y1 y1Var, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setPower");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (create.setArgumentValue("Power", y1Var.toString())) {
                MiotManager.getDeviceManipulator().invoke(create, new C7935w(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7906m0(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7882e0(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7876c0(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7891h0(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void subscribeNotifications(CompletionHandler completionHandler, C7946z1 z1Var) {
        if (completionHandler == null) {
            throw new IllegalArgumentException("handler is null");
        } else if (z1Var != null) {
            PropertyInfo create = PropertyInfoFactory.create(getService());
            for (Property next : getService().getProperties()) {
                if (next.getDefinition().isNotifiable()) {
                    create.addProperty(next);
                }
            }
            MiotManager.getDeviceManipulator().addPropertyChangedListener(create, new C7899k(this, completionHandler), new C7932v(this, z1Var));
        } else {
            throw new IllegalArgumentException("listener is null");
        }
    }

    public void toggle(CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "toggle");
            if (create != null) {
                MiotManager.getDeviceManipulator().invoke(create, new C7912o0(this, completionHandler));
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
            MiotManager.getDeviceManipulator().removePropertyChangedListener(create, new C7888g0(this, completionHandler));
            return;
        }
        throw new IllegalArgumentException("handler is null");
    }
}
