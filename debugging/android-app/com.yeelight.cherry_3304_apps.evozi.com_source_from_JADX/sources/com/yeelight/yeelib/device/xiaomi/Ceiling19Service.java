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

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$a */
    class C7947a implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7976j1 f15918a;

        C7947a(Ceiling19Service ceiling19Service, C7976j1 j1Var) {
            this.f15918a = j1Var;
        }

        public void onFailed(int i, String str) {
            this.f15918a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Ct");
            if (property.isValueValid()) {
                this.f15918a.mo29489a((Long) propertyInfo.getValue("Ct"));
                return;
            }
            C7976j1 j1Var = this.f15918a;
            j1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$a0 */
    class C7948a0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15919a;

        C7948a0(Ceiling19Service ceiling19Service, CompletionHandler completionHandler) {
            this.f15919a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15919a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f15919a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$a1 */
    public enum C7949a1 {
        undefined,
        smooth,
        sudden
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$b */
    class C7950b implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7955c1 f15924a;

        C7950b(Ceiling19Service ceiling19Service, C7955c1 c1Var) {
            this.f15924a = c1Var;
        }

        public void onFailed(int i, String str) {
            this.f15924a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("BgCt");
            if (property.isValueValid()) {
                this.f15924a.mo29475a((Long) propertyInfo.getValue("BgCt"));
                return;
            }
            C7955c1 c1Var = this.f15924a;
            c1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$b0 */
    class C7951b0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15925a;

        C7951b0(Ceiling19Service ceiling19Service, CompletionHandler completionHandler) {
            this.f15925a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15925a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f15925a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$b1 */
    public interface C7952b1 {
        /* renamed from: a */
        void mo29473a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$c */
    class C7953c implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7979k1 f15926a;

        C7953c(Ceiling19Service ceiling19Service, C7979k1 k1Var) {
            this.f15926a = k1Var;
        }

        public void onFailed(int i, String str) {
            this.f15926a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("DelayOff");
            if (property.isValueValid()) {
                this.f15926a.mo29491a((Long) propertyInfo.getValue("DelayOff"));
                return;
            }
            C7979k1 k1Var = this.f15926a;
            k1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$c0 */
    class C7954c0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15927a;

        C7954c0(Ceiling19Service ceiling19Service, CompletionHandler completionHandler) {
            this.f15927a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15927a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f15927a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$c1 */
    public interface C7955c1 {
        /* renamed from: a */
        void mo29475a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$d */
    class C7956d implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7982l1 f15928a;

        C7956d(Ceiling19Service ceiling19Service, C7982l1 l1Var) {
            this.f15928a = l1Var;
        }

        public void onFailed(int i, String str) {
            this.f15928a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("FlowParams");
            if (property.isValueValid()) {
                this.f15928a.onSucceed((String) propertyInfo.getValue("FlowParams"));
                return;
            }
            C7982l1 l1Var = this.f15928a;
            l1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$d0 */
    class C7957d0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15929a;

        C7957d0(Ceiling19Service ceiling19Service, CompletionHandler completionHandler) {
            this.f15929a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15929a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f15929a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$d1 */
    public interface C7958d1 {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$e */
    class C7959e implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7958d1 f15930a;

        C7959e(Ceiling19Service ceiling19Service, C7958d1 d1Var) {
            this.f15930a = d1Var;
        }

        public void onFailed(int i, String str) {
            this.f15930a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("BgFlowParams");
            if (property.isValueValid()) {
                this.f15930a.onSucceed((String) propertyInfo.getValue("BgFlowParams"));
                return;
            }
            C7958d1 d1Var = this.f15930a;
            d1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$e0 */
    class C7960e0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15931a;

        C7960e0(Ceiling19Service ceiling19Service, CompletionHandler completionHandler) {
            this.f15931a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15931a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f15931a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$e1 */
    public interface C7961e1 {
        /* renamed from: a */
        void mo29479a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$f */
    class C7962f implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7988n1 f15932a;

        C7962f(Ceiling19Service ceiling19Service, C7988n1 n1Var) {
            this.f15932a = n1Var;
        }

        public void onFailed(int i, String str) {
            this.f15932a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("LanMode");
            if (property.isValueValid()) {
                this.f15932a.mo29497a((Long) propertyInfo.getValue("LanMode"));
                return;
            }
            C7988n1 n1Var = this.f15932a;
            n1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$f0 */
    class C7963f0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15933a;

        C7963f0(Ceiling19Service ceiling19Service, CompletionHandler completionHandler) {
            this.f15933a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15933a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f15933a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$f1 */
    public interface C7964f1 {
        /* renamed from: a */
        void mo29481a(C8020y0 y0Var);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$g */
    class C7965g implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8009u1 f15934a;

        C7965g(Ceiling19Service ceiling19Service, C8009u1 u1Var) {
            this.f15934a = u1Var;
        }

        public void onFailed(int i, String str) {
            this.f15934a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("SaveState");
            if (property.isValueValid()) {
                this.f15934a.mo29509a((Long) propertyInfo.getValue("SaveState"));
                return;
            }
            C8009u1 u1Var = this.f15934a;
            u1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$g0 */
    class C7966g0 implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15935a;

        C7966g0(Ceiling19Service ceiling19Service, CompletionHandler completionHandler) {
            this.f15935a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15935a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f15935a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$g1 */
    public interface C7967g1 {
        /* renamed from: a */
        void mo29483a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$h */
    class C7968h implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8015w1 f15936a;

        C7968h(Ceiling19Service ceiling19Service, C8015w1 w1Var) {
            this.f15936a = w1Var;
        }

        public void onFailed(int i, String str) {
            this.f15936a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("onFromPower");
            if (property.isValueValid()) {
                this.f15936a.mo29513a((Long) propertyInfo.getValue("onFromPower"));
                return;
            }
            C8015w1 w1Var = this.f15936a;
            w1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$h0 */
    class C7969h0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15937a;

        C7969h0(Ceiling19Service ceiling19Service, CompletionHandler completionHandler) {
            this.f15937a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15937a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f15937a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$h1 */
    public interface C7970h1 {
        /* renamed from: a */
        void mo29485a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$i */
    class C7971i implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7997q1 f15938a;

        C7971i(Ceiling19Service ceiling19Service, C7997q1 q1Var) {
            this.f15938a = q1Var;
        }

        public void onFailed(int i, String str) {
            this.f15938a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("NLBright");
            if (property.isValueValid()) {
                this.f15938a.mo29503a((Long) propertyInfo.getValue("NLBright"));
                return;
            }
            C7997q1 q1Var = this.f15938a;
            q1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$i0 */
    class C7972i0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15939a;

        C7972i0(Ceiling19Service ceiling19Service, CompletionHandler completionHandler) {
            this.f15939a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15939a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f15939a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$i1 */
    public interface C7973i1 {
        /* renamed from: a */
        void mo29487a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$j */
    class C7974j implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8000r1 f15940a;

        C7974j(Ceiling19Service ceiling19Service, C8000r1 r1Var) {
            this.f15940a = r1Var;
        }

        public void onFailed(int i, String str) {
            this.f15940a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("NightTimeInfo");
            if (property.isValueValid()) {
                this.f15940a.onSucceed((String) propertyInfo.getValue("NightTimeInfo"));
                return;
            }
            C8000r1 r1Var = this.f15940a;
            r1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$j0 */
    class C7975j0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15941a;

        C7975j0(Ceiling19Service ceiling19Service, CompletionHandler completionHandler) {
            this.f15941a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15941a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f15941a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$j1 */
    public interface C7976j1 {
        /* renamed from: a */
        void mo29489a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$k */
    class C7977k implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15942a;

        C7977k(Ceiling19Service ceiling19Service, CompletionHandler completionHandler) {
            this.f15942a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15942a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f15942a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$k0 */
    class C7978k0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15943a;

        C7978k0(Ceiling19Service ceiling19Service, CompletionHandler completionHandler) {
            this.f15943a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15943a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f15943a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$k1 */
    public interface C7979k1 {
        /* renamed from: a */
        void mo29491a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$l */
    class C7980l implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7994p1 f15944a;

        C7980l(Ceiling19Service ceiling19Service, C7994p1 p1Var) {
            this.f15944a = p1Var;
        }

        public void onFailed(int i, String str) {
            this.f15944a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("MiBandSleep");
            if (property.isValueValid()) {
                this.f15944a.mo29501a((Long) propertyInfo.getValue("MiBandSleep"));
                return;
            }
            C7994p1 p1Var = this.f15944a;
            p1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$l0 */
    class C7981l0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15945a;

        C7981l0(Ceiling19Service ceiling19Service, CompletionHandler completionHandler) {
            this.f15945a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15945a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f15945a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$l1 */
    public interface C7982l1 {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$m */
    class C7983m implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7970h1 f15946a;

        C7983m(Ceiling19Service ceiling19Service, C7970h1 h1Var) {
            this.f15946a = h1Var;
        }

        public void onFailed(int i, String str) {
            this.f15946a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("BgRgb");
            if (property.isValueValid()) {
                this.f15946a.mo29485a((Long) propertyInfo.getValue("BgRgb"));
                return;
            }
            C7970h1 h1Var = this.f15946a;
            h1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$m0 */
    class C7984m0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15947a;

        C7984m0(Ceiling19Service ceiling19Service, CompletionHandler completionHandler) {
            this.f15947a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15947a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f15947a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$m1 */
    public interface C7985m1 {
        /* renamed from: a */
        void mo29495a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$n */
    class C7986n implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7985m1 f15948a;

        C7986n(Ceiling19Service ceiling19Service, C7985m1 m1Var) {
            this.f15948a = m1Var;
        }

        public void onFailed(int i, String str) {
            this.f15948a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Flowing");
            if (property.isValueValid()) {
                this.f15948a.mo29495a((Long) propertyInfo.getValue("Flowing"));
                return;
            }
            C7985m1 m1Var = this.f15948a;
            m1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$n0 */
    class C7987n0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15949a;

        C7987n0(Ceiling19Service ceiling19Service, CompletionHandler completionHandler) {
            this.f15949a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15949a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f15949a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$n1 */
    public interface C7988n1 {
        /* renamed from: a */
        void mo29497a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$o */
    class C7989o implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7961e1 f15950a;

        C7989o(Ceiling19Service ceiling19Service, C7961e1 e1Var) {
            this.f15950a = e1Var;
        }

        public void onFailed(int i, String str) {
            this.f15950a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("BgFlowing");
            if (property.isValueValid()) {
                this.f15950a.mo29479a((Long) propertyInfo.getValue("BgFlowing"));
                return;
            }
            C7961e1 e1Var = this.f15950a;
            e1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$o0 */
    class C7990o0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15951a;

        C7990o0(Ceiling19Service ceiling19Service, CompletionHandler completionHandler) {
            this.f15951a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15951a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f15951a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$o1 */
    public interface C7991o1 {
        /* renamed from: a */
        void mo29499a(C8018x1 x1Var);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$p */
    class C7992p implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7967g1 f15952a;

        C7992p(Ceiling19Service ceiling19Service, C7967g1 g1Var) {
            this.f15952a = g1Var;
        }

        public void onFailed(int i, String str) {
            this.f15952a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("BgProact");
            if (property.isValueValid()) {
                this.f15952a.mo29483a((Long) propertyInfo.getValue("BgProact"));
                return;
            }
            C7967g1 g1Var = this.f15952a;
            g1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$p0 */
    class C7993p0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15953a;

        C7993p0(Ceiling19Service ceiling19Service, CompletionHandler completionHandler) {
            this.f15953a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15953a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f15953a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$p1 */
    public interface C7994p1 {
        /* renamed from: a */
        void mo29501a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$q */
    class C7995q implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8012v1 f15954a;

        C7995q(Ceiling19Service ceiling19Service, C8012v1 v1Var) {
            this.f15954a = v1Var;
        }

        public void onFailed(int i, String str) {
            this.f15954a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("SmartSwitch");
            if (property.isValueValid()) {
                this.f15954a.mo29511a((Long) propertyInfo.getValue("SmartSwitch"));
                return;
            }
            C8012v1 v1Var = this.f15954a;
            v1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$q0 */
    class C7996q0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15955a;

        C7996q0(Ceiling19Service ceiling19Service, CompletionHandler completionHandler) {
            this.f15955a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15955a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f15955a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$q1 */
    public interface C7997q1 {
        /* renamed from: a */
        void mo29503a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$r */
    class C7998r implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15956a;

        C7998r(Ceiling19Service ceiling19Service, CompletionHandler completionHandler) {
            this.f15956a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15956a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f15956a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$r0 */
    class C7999r0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8006t1 f15957a;

        C7999r0(Ceiling19Service ceiling19Service, C8006t1 t1Var) {
            this.f15957a = t1Var;
        }

        public void onFailed(int i, String str) {
            this.f15957a.onFailed(i, str);
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
                com.yeelight.yeelib.device.xiaomi.Ceiling19Service$x1 r1 = com.yeelight.yeelib.device.xiaomi.Ceiling19Service.C8018x1.valueOf(r1)
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
                com.yeelight.yeelib.device.xiaomi.Ceiling19Service$y1 r1 = com.yeelight.yeelib.device.xiaomi.Ceiling19Service.C8021y1.valueOf(r1)
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
                com.yeelight.yeelib.device.xiaomi.Ceiling19Service$y0 r1 = com.yeelight.yeelib.device.xiaomi.Ceiling19Service.C8020y0.valueOf(r1)
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
                com.yeelight.yeelib.device.xiaomi.Ceiling19Service$t1 r4 = r0.f15957a
                r4.mo28331a(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.xiaomi.Ceiling19Service.C7999r0.onSucceed(com.miot.common.device.invocation.PropertyInfo):void");
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$r1 */
    public interface C8000r1 {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$s */
    class C8001s implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15958a;

        C8001s(Ceiling19Service ceiling19Service, CompletionHandler completionHandler) {
            this.f15958a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15958a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f15958a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$s0 */
    class C8002s0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15959a;

        C8002s0(Ceiling19Service ceiling19Service, CompletionHandler completionHandler) {
            this.f15959a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15959a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f15959a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$s1 */
    public interface C8003s1 {
        /* renamed from: a */
        void mo29507a(C8021y1 y1Var);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$t */
    class C8004t implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15960a;

        C8004t(Ceiling19Service ceiling19Service, CompletionHandler completionHandler) {
            this.f15960a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15960a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f15960a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$t0 */
    class C8005t0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7991o1 f15961a;

        C8005t0(Ceiling19Service ceiling19Service, C7991o1 o1Var) {
            this.f15961a = o1Var;
        }

        public void onFailed(int i, String str) {
            this.f15961a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("MainPower");
            if (property.isValueValid()) {
                this.f15961a.mo29499a(C8018x1.valueOf((String) propertyInfo.getValue("MainPower")));
                return;
            }
            C7991o1 o1Var = this.f15961a;
            o1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$t1 */
    public interface C8006t1 {
        /* renamed from: a */
        void mo28331a(C8018x1 x1Var, C8021y1 y1Var, C8020y0 y0Var, Long l, Long l2, Long l3, Long l4, Long l5, String str, String str2, Long l6, Long l7, Long l8, Long l9, String str3, Long l10, Long l11, Long l12, Long l13, Long l14, Long l15);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$u */
    class C8007u implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15962a;

        C8007u(Ceiling19Service ceiling19Service, CompletionHandler completionHandler) {
            this.f15962a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15962a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f15962a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$u0 */
    class C8008u0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8003s1 f15963a;

        C8008u0(Ceiling19Service ceiling19Service, C8003s1 s1Var) {
            this.f15963a = s1Var;
        }

        public void onFailed(int i, String str) {
            this.f15963a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Power");
            if (property.isValueValid()) {
                this.f15963a.mo29507a(C8021y1.valueOf((String) propertyInfo.getValue("Power")));
                return;
            }
            C8003s1 s1Var = this.f15963a;
            s1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$u1 */
    public interface C8009u1 {
        /* renamed from: a */
        void mo29509a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$v */
    class C8010v implements DeviceManipulator.PropertyChangedListener {

        /* renamed from: a */
        final /* synthetic */ C8024z1 f15964a;

        C8010v(Ceiling19Service ceiling19Service, C8024z1 z1Var) {
            this.f15964a = z1Var;
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:100:0x029a, code lost:
            if (r2.getProperty(r6).isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:101:0x029c, code lost:
            r9.f15964a.mo28341i((java.lang.String) r2.getValue(r6));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:102:0x02a9, code lost:
            r9 = r24;
            r2 = r25;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:103:0x02b5, code lost:
            if (r2.getProperty(r3).isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:104:0x02b7, code lost:
            r9.f15964a.mo28343k((java.lang.Long) r2.getValue(r3));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:105:0x02c4, code lost:
            r9 = r24;
            r2 = r25;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:106:0x02d0, code lost:
            if (r2.getProperty("onFromPower").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:107:0x02d2, code lost:
            r9.f15964a.mo28338f((java.lang.Long) r2.getValue("onFromPower"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:108:0x02df, code lost:
            r9 = r24;
            r2 = r25;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:109:0x02eb, code lost:
            if (r2.getProperty("SaveState").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:110:0x02ed, code lost:
            r9.f15964a.mo28336d((java.lang.Long) r2.getValue("SaveState"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:111:0x02fa, code lost:
            r9 = r24;
            r2 = r25;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:112:0x0306, code lost:
            if (r2.getProperty("LanMode").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:113:0x0308, code lost:
            r9.f15964a.mo28339g((java.lang.Long) r2.getValue("LanMode"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:114:0x0315, code lost:
            r9 = r24;
            r2 = r25;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:115:0x0321, code lost:
            if (r2.getProperty("BgFlowParams").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:116:0x0323, code lost:
            r9.f15964a.mo28350r((java.lang.String) r2.getValue("BgFlowParams"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:117:0x0330, code lost:
            r9 = r24;
            r2 = r25;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:118:0x033c, code lost:
            if (r2.getProperty(r8).isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:119:0x033e, code lost:
            r9.f15964a.mo28337e((java.lang.String) r2.getValue(r8));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:120:0x034b, code lost:
            r9 = r24;
            r2 = r25;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:121:0x0357, code lost:
            if (r2.getProperty("DelayOff").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:122:0x0359, code lost:
            r9.f15964a.mo28334b((java.lang.Long) r2.getValue("DelayOff"));
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
            r9.f15964a.mo28342j((java.lang.Long) r2.getValue(r0));
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
            r9.f15964a.mo28340h((java.lang.Long) r2.getValue(r4));
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
            r9.f15964a.mo28344l((java.lang.Long) r2.getValue(r0));
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
            r9.f15964a.mo28333a((java.lang.Long) r2.getValue(r0));
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
            r9.f15964a.mo28349q(com.yeelight.yeelib.device.xiaomi.Ceiling19Service.C8020y0.valueOf((java.lang.String) r2.getValue(r0)));
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
            r9.f15964a.mo28353u(com.yeelight.yeelib.device.xiaomi.Ceiling19Service.C8021y1.valueOf((java.lang.String) r2.getValue(r0)));
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
            r9.f15964a.mo28347o(com.yeelight.yeelib.device.xiaomi.Ceiling19Service.C8018x1.valueOf((java.lang.String) r2.getValue(r0)));
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
            r24.f15964a.mo28348p((java.lang.Long) r2.getValue("SmartSwitch"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:84:0x0207, code lost:
            r9 = r24;
            r2 = r25;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:85:0x0213, code lost:
            if (r2.getProperty(r13).isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:86:0x0215, code lost:
            r9.f15964a.mo28351s((java.lang.Long) r2.getValue(r13));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:87:0x0222, code lost:
            r9 = r24;
            r2 = r25;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:88:0x022e, code lost:
            if (r2.getProperty("BgFlowing").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:89:0x0230, code lost:
            r9.f15964a.mo28352t((java.lang.Long) r2.getValue("BgFlowing"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:90:0x023d, code lost:
            r9 = r24;
            r2 = r25;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:91:0x0249, code lost:
            if (r2.getProperty("Flowing").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:92:0x024b, code lost:
            r9.f15964a.mo28335c((java.lang.Long) r2.getValue("Flowing"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:93:0x0258, code lost:
            r9 = r24;
            r2 = r25;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:94:0x0264, code lost:
            if (r2.getProperty("BgRgb").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:95:0x0266, code lost:
            r9.f15964a.mo28346n((java.lang.Long) r2.getValue("BgRgb"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:96:0x0273, code lost:
            r9 = r24;
            r2 = r25;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:97:0x027f, code lost:
            if (r2.getProperty(r0).isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:98:0x0281, code lost:
            r9.f15964a.mo28345m((java.lang.Long) r2.getValue(r0));
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
                com.yeelight.yeelib.device.xiaomi.Ceiling19Service$z1 r1 = r9.f15964a
                r1.mo28348p(r0)
                goto L_0x0437
            L_0x0207:
                r9 = r24
                r2 = r25
                com.miot.common.property.Property r0 = r2.getProperty(r13)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0437
                java.lang.Object r0 = r2.getValue(r13)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Ceiling19Service$z1 r1 = r9.f15964a
                r1.mo28351s(r0)
                goto L_0x0437
            L_0x0222:
                r9 = r24
                r2 = r25
                com.miot.common.property.Property r0 = r2.getProperty(r10)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0437
                java.lang.Object r0 = r2.getValue(r10)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Ceiling19Service$z1 r1 = r9.f15964a
                r1.mo28352t(r0)
                goto L_0x0437
            L_0x023d:
                r9 = r24
                r2 = r25
                com.miot.common.property.Property r0 = r2.getProperty(r11)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0437
                java.lang.Object r0 = r2.getValue(r11)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Ceiling19Service$z1 r1 = r9.f15964a
                r1.mo28335c(r0)
                goto L_0x0437
            L_0x0258:
                r9 = r24
                r2 = r25
                com.miot.common.property.Property r0 = r2.getProperty(r14)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0437
                java.lang.Object r0 = r2.getValue(r14)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Ceiling19Service$z1 r1 = r9.f15964a
                r1.mo28346n(r0)
                goto L_0x0437
            L_0x0273:
                r9 = r24
                r2 = r25
                com.miot.common.property.Property r1 = r2.getProperty(r0)
                boolean r1 = r1.isValueValid()
                if (r1 == 0) goto L_0x0437
                java.lang.Object r0 = r2.getValue(r0)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Ceiling19Service$z1 r1 = r9.f15964a
                r1.mo28345m(r0)
                goto L_0x0437
            L_0x028e:
                r9 = r24
                r2 = r25
                com.miot.common.property.Property r0 = r2.getProperty(r6)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0437
                java.lang.Object r0 = r2.getValue(r6)
                java.lang.String r0 = (java.lang.String) r0
                com.yeelight.yeelib.device.xiaomi.Ceiling19Service$z1 r1 = r9.f15964a
                r1.mo28341i(r0)
                goto L_0x0437
            L_0x02a9:
                r9 = r24
                r2 = r25
                com.miot.common.property.Property r0 = r2.getProperty(r3)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0437
                java.lang.Object r0 = r2.getValue(r3)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Ceiling19Service$z1 r1 = r9.f15964a
                r1.mo28343k(r0)
                goto L_0x0437
            L_0x02c4:
                r9 = r24
                r2 = r25
                com.miot.common.property.Property r0 = r2.getProperty(r15)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0437
                java.lang.Object r0 = r2.getValue(r15)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Ceiling19Service$z1 r1 = r9.f15964a
                r1.mo28338f(r0)
                goto L_0x0437
            L_0x02df:
                r9 = r24
                r2 = r25
                com.miot.common.property.Property r0 = r2.getProperty(r1)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0437
                java.lang.Object r0 = r2.getValue(r1)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Ceiling19Service$z1 r1 = r9.f15964a
                r1.mo28336d(r0)
                goto L_0x0437
            L_0x02fa:
                r9 = r24
                r2 = r25
                com.miot.common.property.Property r0 = r2.getProperty(r7)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0437
                java.lang.Object r0 = r2.getValue(r7)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Ceiling19Service$z1 r1 = r9.f15964a
                r1.mo28339g(r0)
                goto L_0x0437
            L_0x0315:
                r9 = r24
                r2 = r25
                com.miot.common.property.Property r0 = r2.getProperty(r5)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0437
                java.lang.Object r0 = r2.getValue(r5)
                java.lang.String r0 = (java.lang.String) r0
                com.yeelight.yeelib.device.xiaomi.Ceiling19Service$z1 r1 = r9.f15964a
                r1.mo28350r(r0)
                goto L_0x0437
            L_0x0330:
                r9 = r24
                r2 = r25
                com.miot.common.property.Property r0 = r2.getProperty(r8)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0437
                java.lang.Object r0 = r2.getValue(r8)
                java.lang.String r0 = (java.lang.String) r0
                com.yeelight.yeelib.device.xiaomi.Ceiling19Service$z1 r1 = r9.f15964a
                r1.mo28337e(r0)
                goto L_0x0437
            L_0x034b:
                r9 = r24
                r2 = r25
                com.miot.common.property.Property r0 = r2.getProperty(r12)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0437
                java.lang.Object r0 = r2.getValue(r12)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Ceiling19Service$z1 r1 = r9.f15964a
                r1.mo28334b(r0)
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
                com.yeelight.yeelib.device.xiaomi.Ceiling19Service$z1 r1 = r9.f15964a
                r1.mo28342j(r0)
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
                com.yeelight.yeelib.device.xiaomi.Ceiling19Service$z1 r1 = r9.f15964a
                r1.mo28340h(r0)
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
                com.yeelight.yeelib.device.xiaomi.Ceiling19Service$z1 r1 = r9.f15964a
                r1.mo28344l(r0)
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
                com.yeelight.yeelib.device.xiaomi.Ceiling19Service$z1 r1 = r9.f15964a
                r1.mo28333a(r0)
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
                com.yeelight.yeelib.device.xiaomi.Ceiling19Service$y0 r0 = com.yeelight.yeelib.device.xiaomi.Ceiling19Service.C8020y0.valueOf(r0)
                com.yeelight.yeelib.device.xiaomi.Ceiling19Service$z1 r1 = r9.f15964a
                r1.mo28349q(r0)
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
                com.yeelight.yeelib.device.xiaomi.Ceiling19Service$y1 r0 = com.yeelight.yeelib.device.xiaomi.Ceiling19Service.C8021y1.valueOf(r0)
                com.yeelight.yeelib.device.xiaomi.Ceiling19Service$z1 r1 = r9.f15964a
                r1.mo28353u(r0)
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
                com.yeelight.yeelib.device.xiaomi.Ceiling19Service$x1 r0 = com.yeelight.yeelib.device.xiaomi.Ceiling19Service.C8018x1.valueOf(r0)
                com.yeelight.yeelib.device.xiaomi.Ceiling19Service$z1 r1 = r9.f15964a
                r1.mo28347o(r0)
            L_0x0437:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.xiaomi.Ceiling19Service.C8010v.onPropertyChanged(com.miot.common.device.invocation.PropertyInfo, java.lang.String):void");
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$v0 */
    class C8011v0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7964f1 f15965a;

        C8011v0(Ceiling19Service ceiling19Service, C7964f1 f1Var) {
            this.f15965a = f1Var;
        }

        public void onFailed(int i, String str) {
            this.f15965a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("BgPower");
            if (property.isValueValid()) {
                this.f15965a.mo29481a(C8020y0.valueOf((String) propertyInfo.getValue("BgPower")));
                return;
            }
            C7964f1 f1Var = this.f15965a;
            f1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$v1 */
    public interface C8012v1 {
        /* renamed from: a */
        void mo29511a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$w */
    class C8013w implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15966a;

        C8013w(Ceiling19Service ceiling19Service, CompletionHandler completionHandler) {
            this.f15966a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15966a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f15966a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$w0 */
    class C8014w0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7973i1 f15967a;

        C8014w0(Ceiling19Service ceiling19Service, C7973i1 i1Var) {
            this.f15967a = i1Var;
        }

        public void onFailed(int i, String str) {
            this.f15967a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Bright");
            if (property.isValueValid()) {
                this.f15967a.mo29487a((Long) propertyInfo.getValue("Bright"));
                return;
            }
            C7973i1 i1Var = this.f15967a;
            i1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$w1 */
    public interface C8015w1 {
        /* renamed from: a */
        void mo29513a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$x */
    class C8016x implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15968a;

        C8016x(Ceiling19Service ceiling19Service, CompletionHandler completionHandler) {
            this.f15968a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15968a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f15968a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$x0 */
    class C8017x0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7952b1 f15969a;

        C8017x0(Ceiling19Service ceiling19Service, C7952b1 b1Var) {
            this.f15969a = b1Var;
        }

        public void onFailed(int i, String str) {
            this.f15969a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("BgBright");
            if (property.isValueValid()) {
                this.f15969a.mo29473a((Long) propertyInfo.getValue("BgBright"));
                return;
            }
            C7952b1 b1Var = this.f15969a;
            b1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$x1 */
    public enum C8018x1 {
        undefined,
        on,
        off
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$y */
    class C8019y implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15974a;

        C8019y(Ceiling19Service ceiling19Service, CompletionHandler completionHandler) {
            this.f15974a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15974a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f15974a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$y0 */
    public enum C8020y0 {
        undefined,
        on,
        off
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$y1 */
    public enum C8021y1 {
        undefined,
        on,
        off
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$z */
    class C8022z implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15983a;

        C8022z(Ceiling19Service ceiling19Service, CompletionHandler completionHandler) {
            this.f15983a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15983a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f15983a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$z0 */
    public enum C8023z0 {
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

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling19Service$z1 */
    public interface C8024z1 {
        /* renamed from: a */
        void mo28333a(Long l);

        /* renamed from: b */
        void mo28334b(Long l);

        /* renamed from: c */
        void mo28335c(Long l);

        /* renamed from: d */
        void mo28336d(Long l);

        /* renamed from: e */
        void mo28337e(String str);

        /* renamed from: f */
        void mo28338f(Long l);

        /* renamed from: g */
        void mo28339g(Long l);

        /* renamed from: h */
        void mo28340h(Long l);

        /* renamed from: i */
        void mo28341i(String str);

        /* renamed from: j */
        void mo28342j(Long l);

        /* renamed from: k */
        void mo28343k(Long l);

        /* renamed from: l */
        void mo28344l(Long l);

        /* renamed from: m */
        void mo28345m(Long l);

        /* renamed from: n */
        void mo28346n(Long l);

        /* renamed from: o */
        void mo28347o(C8018x1 x1Var);

        /* renamed from: p */
        void mo28348p(Long l);

        /* renamed from: q */
        void mo28349q(C8020y0 y0Var);

        /* renamed from: r */
        void mo28350r(String str);

        /* renamed from: s */
        void mo28351s(Long l);

        /* renamed from: t */
        void mo28352t(Long l);

        /* renamed from: u */
        void mo28353u(C8021y1 y1Var);
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
                MiotManager.getDeviceManipulator().invoke(create, new C8019y(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7978k0(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getBgBright(C7952b1 b1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "BgBright"), new C8017x0(this, b1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getBgCt(C7955c1 c1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "BgCt"), new C7950b(this, c1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getBgFlowParams(C7958d1 d1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "BgFlowParams"), new C7959e(this, d1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getBgFlowing(C7961e1 e1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "BgFlowing"), new C7989o(this, e1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getBgPower(C7964f1 f1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "BgPower"), new C8011v0(this, f1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getBgProact(C7967g1 g1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "BgProact"), new C7992p(this, g1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getBgRgb(C7970h1 h1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "BgRgb"), new C7983m(this, h1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getBright(C7973i1 i1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Bright"), new C8014w0(this, i1Var));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8002s0(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getCt(C7976j1 j1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Ct"), new C7947a(this, j1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getDelayOff(C7979k1 k1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "DelayOff"), new C7953c(this, k1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowParams(C7982l1 l1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "FlowParams"), new C7956d(this, l1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowing(C7985m1 m1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Flowing"), new C7986n(this, m1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getLanMode(C7988n1 n1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "LanMode"), new C7962f(this, n1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getMainPower(C7991o1 o1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "MainPower"), new C8005t0(this, o1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getMiBandSleep(C7994p1 p1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "MiBandSleep"), new C7980l(this, p1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getNLBright(C7997q1 q1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "NLBright"), new C7971i(this, q1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getNightTimeInfo(C8000r1 r1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "NightTimeInfo"), new C7974j(this, r1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getPower(C8003s1 s1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Power"), new C8008u0(this, s1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getProperties(C8006t1 t1Var) {
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
            MiotManager.getDeviceManipulator().readProperty(create, new C7999r0(this, t1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getSaveState(C8009u1 u1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "SaveState"), new C7965g(this, u1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getSmartSwitch(C8012v1 v1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "SmartSwitch"), new C7995q(this, v1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getonFromPower(C8015w1 w1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "onFromPower"), new C7968h(this, w1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void openBgWithMode(C8020y0 y0Var, C7949a1 a1Var, Long l, Long l2, CompletionHandler completionHandler) {
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
                MiotManager.getDeviceManipulator().invoke(create, new C8016x(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void openWithMode(C8018x1 x1Var, C7949a1 a1Var, Long l, Long l2, CompletionHandler completionHandler) {
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
                MiotManager.getDeviceManipulator().invoke(create, new C8007u(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7981l0(this, completionHandler));
                return;
            }
            throw new MiotException("actionInfo is null");
        }
        throw new MiotException("device not configurated connection");
    }

    public void sendCmd(C8023z0 z0Var, String str, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "sendCmd");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("CmdKey", z0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("CmdValue", str)) {
                MiotManager.getDeviceManipulator().invoke(create, new C7951b0(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setBgBright(Long l, C7949a1 a1Var, Long l2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setBgBright");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("BgBright", l)) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Effect", a1Var.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("Duration", l2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C7972i0(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setBgCt(Long l, C7949a1 a1Var, Long l2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setBgCt");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("BgCt", l)) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Effect", a1Var.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("Duration", l2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C8022z(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7963f0(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setBgPower(C8020y0 y0Var, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setBgPower");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (create.setArgumentValue("BgPower", y0Var.toString())) {
                MiotManager.getDeviceManipulator().invoke(create, new C7998r(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setBgRgb(Long l, C7949a1 a1Var, Long l2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setBgRgb");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("BgRgb", l)) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Effect", a1Var.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("Duration", l2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C8004t(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7975j0(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setBright(Long l, C7949a1 a1Var, Long l2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setBright");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("Bright", l)) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Effect", a1Var.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("Duration", l2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C8001s(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setCt(Long l, C7949a1 a1Var, Long l2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setCt");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("Ct", l)) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Effect", a1Var.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("Duration", l2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C7996q0(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7993p0(this, completionHandler));
                return;
            }
            throw new MiotException("actionInfo is null");
        }
        throw new MiotException("device not configurated connection");
    }

    public void setDevPower(C8021y1 y1Var, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setDevPower");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (create.setArgumentValue("Power", y1Var.toString())) {
                MiotManager.getDeviceManipulator().invoke(create, new C7987n0(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7957d0(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7948a0(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setPower(C8021y1 y1Var, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setPower");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (create.setArgumentValue("Power", y1Var.toString())) {
                MiotManager.getDeviceManipulator().invoke(create, new C8013w(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7984m0(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7960e0(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7954c0(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7969h0(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void subscribeNotifications(CompletionHandler completionHandler, C8024z1 z1Var) {
        if (completionHandler == null) {
            throw new IllegalArgumentException("handler is null");
        } else if (z1Var != null) {
            PropertyInfo create = PropertyInfoFactory.create(getService());
            for (Property next : getService().getProperties()) {
                if (next.getDefinition().isNotifiable()) {
                    create.addProperty(next);
                }
            }
            MiotManager.getDeviceManipulator().addPropertyChangedListener(create, new C7977k(this, completionHandler), new C8010v(this, z1Var));
        } else {
            throw new IllegalArgumentException("listener is null");
        }
    }

    public void toggle(CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "toggle");
            if (create != null) {
                MiotManager.getDeviceManipulator().invoke(create, new C7990o0(this, completionHandler));
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
            MiotManager.getDeviceManipulator().removePropertyChangedListener(create, new C7966g0(this, completionHandler));
            return;
        }
        throw new IllegalArgumentException("handler is null");
    }
}
