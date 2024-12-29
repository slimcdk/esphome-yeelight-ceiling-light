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

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp15Service$a */
    class C8906a implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8920e1 f16851a;

        C8906a(Lamp15Service lamp15Service, C8920e1 e1Var) {
            this.f16851a = e1Var;
        }

        public void onFailed(int i, String str) {
            this.f16851a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Ct");
            if (property.isValueValid()) {
                this.f16851a.mo30578a((Long) propertyInfo.getValue("Ct"));
                return;
            }
            C8920e1 e1Var = this.f16851a;
            e1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp15Service$a0 */
    class C8907a0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16852a;

        C8907a0(Lamp15Service lamp15Service, CompletionHandler completionHandler) {
            this.f16852a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16852a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16852a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp15Service$a1 */
    public interface C8908a1 {
        /* renamed from: a */
        void mo30570a(C8962t0 t0Var);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp15Service$b */
    class C8909b implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8970x0 f16853a;

        C8909b(Lamp15Service lamp15Service, C8970x0 x0Var) {
            this.f16853a = x0Var;
        }

        public void onFailed(int i, String str) {
            this.f16853a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("BgCt");
            if (property.isValueValid()) {
                this.f16853a.mo30598a((Long) propertyInfo.getValue("BgCt"));
                return;
            }
            C8970x0 x0Var = this.f16853a;
            x0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp15Service$b0 */
    class C8910b0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16854a;

        C8910b0(Lamp15Service lamp15Service, CompletionHandler completionHandler) {
            this.f16854a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16854a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16854a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp15Service$b1 */
    public interface C8911b1 {
        /* renamed from: a */
        void mo30572a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp15Service$c */
    class C8912c implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8923f1 f16855a;

        C8912c(Lamp15Service lamp15Service, C8923f1 f1Var) {
            this.f16855a = f1Var;
        }

        public void onFailed(int i, String str) {
            this.f16855a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("DelayOff");
            if (property.isValueValid()) {
                this.f16855a.mo30580a((Long) propertyInfo.getValue("DelayOff"));
                return;
            }
            C8923f1 f1Var = this.f16855a;
            f1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp15Service$c0 */
    class C8913c0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16856a;

        C8913c0(Lamp15Service lamp15Service, CompletionHandler completionHandler) {
            this.f16856a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16856a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16856a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp15Service$c1 */
    public interface C8914c1 {
        /* renamed from: a */
        void mo30574a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp15Service$d */
    class C8915d implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8926g1 f16857a;

        C8915d(Lamp15Service lamp15Service, C8926g1 g1Var) {
            this.f16857a = g1Var;
        }

        public void onFailed(int i, String str) {
            this.f16857a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("FlowParams");
            if (property.isValueValid()) {
                this.f16857a.onSucceed((String) propertyInfo.getValue("FlowParams"));
                return;
            }
            C8926g1 g1Var = this.f16857a;
            g1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp15Service$d0 */
    class C8916d0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16858a;

        C8916d0(Lamp15Service lamp15Service, CompletionHandler completionHandler) {
            this.f16858a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16858a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16858a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp15Service$d1 */
    public interface C8917d1 {
        /* renamed from: a */
        void mo30576a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp15Service$e */
    class C8918e implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8972y0 f16859a;

        C8918e(Lamp15Service lamp15Service, C8972y0 y0Var) {
            this.f16859a = y0Var;
        }

        public void onFailed(int i, String str) {
            this.f16859a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("BgFlowParams");
            if (property.isValueValid()) {
                this.f16859a.onSucceed((String) propertyInfo.getValue("BgFlowParams"));
                return;
            }
            C8972y0 y0Var = this.f16859a;
            y0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp15Service$e0 */
    class C8919e0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16860a;

        C8919e0(Lamp15Service lamp15Service, CompletionHandler completionHandler) {
            this.f16860a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16860a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16860a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp15Service$e1 */
    public interface C8920e1 {
        /* renamed from: a */
        void mo30578a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp15Service$f */
    class C8921f implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8932i1 f16861a;

        C8921f(Lamp15Service lamp15Service, C8932i1 i1Var) {
            this.f16861a = i1Var;
        }

        public void onFailed(int i, String str) {
            this.f16861a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("LanMode");
            if (property.isValueValid()) {
                this.f16861a.mo30586a((Long) propertyInfo.getValue("LanMode"));
                return;
            }
            C8932i1 i1Var = this.f16861a;
            i1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp15Service$f0 */
    class C8922f0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16862a;

        C8922f0(Lamp15Service lamp15Service, CompletionHandler completionHandler) {
            this.f16862a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16862a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16862a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp15Service$f1 */
    public interface C8923f1 {
        /* renamed from: a */
        void mo30580a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp15Service$g */
    class C8924g implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8944m1 f16863a;

        C8924g(Lamp15Service lamp15Service, C8944m1 m1Var) {
            this.f16863a = m1Var;
        }

        public void onFailed(int i, String str) {
            this.f16863a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("SaveState");
            if (property.isValueValid()) {
                this.f16863a.mo30592a((Long) propertyInfo.getValue("SaveState"));
                return;
            }
            C8944m1 m1Var = this.f16863a;
            m1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp15Service$g0 */
    class C8925g0 implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16864a;

        C8925g0(Lamp15Service lamp15Service, CompletionHandler completionHandler) {
            this.f16864a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16864a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f16864a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp15Service$g1 */
    public interface C8926g1 {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp15Service$h */
    class C8927h implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8947n1 f16865a;

        C8927h(Lamp15Service lamp15Service, C8947n1 n1Var) {
            this.f16865a = n1Var;
        }

        public void onFailed(int i, String str) {
            this.f16865a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("onFromPower");
            if (property.isValueValid()) {
                this.f16865a.mo30594a((Long) propertyInfo.getValue("onFromPower"));
                return;
            }
            C8947n1 n1Var = this.f16865a;
            n1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp15Service$h0 */
    class C8928h0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16866a;

        C8928h0(Lamp15Service lamp15Service, CompletionHandler completionHandler) {
            this.f16866a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16866a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16866a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp15Service$h1 */
    public interface C8929h1 {
        /* renamed from: a */
        void mo30584a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp15Service$i */
    class C8930i implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8914c1 f16867a;

        C8930i(Lamp15Service lamp15Service, C8914c1 c1Var) {
            this.f16867a = c1Var;
        }

        public void onFailed(int i, String str) {
            this.f16867a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("BgRgb");
            if (property.isValueValid()) {
                this.f16867a.mo30574a((Long) propertyInfo.getValue("BgRgb"));
                return;
            }
            C8914c1 c1Var = this.f16867a;
            c1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp15Service$i0 */
    class C8931i0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16868a;

        C8931i0(Lamp15Service lamp15Service, CompletionHandler completionHandler) {
            this.f16868a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16868a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16868a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp15Service$i1 */
    public interface C8932i1 {
        /* renamed from: a */
        void mo30586a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp15Service$j */
    class C8933j implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8929h1 f16869a;

        C8933j(Lamp15Service lamp15Service, C8929h1 h1Var) {
            this.f16869a = h1Var;
        }

        public void onFailed(int i, String str) {
            this.f16869a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Flowing");
            if (property.isValueValid()) {
                this.f16869a.mo30584a((Long) propertyInfo.getValue("Flowing"));
                return;
            }
            C8929h1 h1Var = this.f16869a;
            h1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp15Service$j0 */
    class C8934j0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16870a;

        C8934j0(Lamp15Service lamp15Service, CompletionHandler completionHandler) {
            this.f16870a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16870a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16870a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp15Service$j1 */
    public interface C8935j1 {
        /* renamed from: a */
        void mo30588a(C8950o1 o1Var);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp15Service$k */
    class C8936k implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16871a;

        C8936k(Lamp15Service lamp15Service, CompletionHandler completionHandler) {
            this.f16871a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16871a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f16871a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp15Service$k0 */
    class C8937k0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16872a;

        C8937k0(Lamp15Service lamp15Service, CompletionHandler completionHandler) {
            this.f16872a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16872a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16872a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp15Service$k1 */
    public interface C8938k1 {
        /* renamed from: a */
        void mo30590a(C8953p1 p1Var);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp15Service$l */
    class C8939l implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8974z0 f16873a;

        C8939l(Lamp15Service lamp15Service, C8974z0 z0Var) {
            this.f16873a = z0Var;
        }

        public void onFailed(int i, String str) {
            this.f16873a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("BgFlowing");
            if (property.isValueValid()) {
                this.f16873a.mo30602a((Long) propertyInfo.getValue("BgFlowing"));
                return;
            }
            C8974z0 z0Var = this.f16873a;
            z0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp15Service$l0 */
    class C8940l0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16874a;

        C8940l0(Lamp15Service lamp15Service, CompletionHandler completionHandler) {
            this.f16874a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16874a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16874a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp15Service$l1 */
    public interface C8941l1 {
        /* renamed from: a */
        void mo28292a(C8950o1 o1Var, C8953p1 p1Var, C8962t0 t0Var, Long l, Long l2, Long l3, Long l4, Long l5, String str, String str2, Long l6, Long l7, Long l8, Long l9, Long l10, Long l11, Long l12);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp15Service$m */
    class C8942m implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8911b1 f16875a;

        C8942m(Lamp15Service lamp15Service, C8911b1 b1Var) {
            this.f16875a = b1Var;
        }

        public void onFailed(int i, String str) {
            this.f16875a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("BgProact");
            if (property.isValueValid()) {
                this.f16875a.mo30572a((Long) propertyInfo.getValue("BgProact"));
                return;
            }
            C8911b1 b1Var = this.f16875a;
            b1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp15Service$m0 */
    class C8943m0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16876a;

        C8943m0(Lamp15Service lamp15Service, CompletionHandler completionHandler) {
            this.f16876a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16876a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16876a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp15Service$m1 */
    public interface C8944m1 {
        /* renamed from: a */
        void mo30592a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp15Service$n */
    class C8945n implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16877a;

        C8945n(Lamp15Service lamp15Service, CompletionHandler completionHandler) {
            this.f16877a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16877a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16877a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp15Service$n0 */
    class C8946n0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8941l1 f16878a;

        C8946n0(Lamp15Service lamp15Service, C8941l1 l1Var) {
            this.f16878a = l1Var;
        }

        public void onFailed(int i, String str) {
            this.f16878a.onFailed(i, str);
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
                com.yeelight.yeelib.device.xiaomi.Lamp15Service$o1 r1 = com.yeelight.yeelib.device.xiaomi.Lamp15Service.C8950o1.valueOf(r1)
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
                com.yeelight.yeelib.device.xiaomi.Lamp15Service$p1 r1 = com.yeelight.yeelib.device.xiaomi.Lamp15Service.C8953p1.valueOf(r1)
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
                com.yeelight.yeelib.device.xiaomi.Lamp15Service$t0 r1 = com.yeelight.yeelib.device.xiaomi.Lamp15Service.C8962t0.valueOf(r1)
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
                com.yeelight.yeelib.device.xiaomi.Lamp15Service$l1 r4 = r0.f16878a
                r4.mo28292a(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.xiaomi.Lamp15Service.C8946n0.onSucceed(com.miot.common.device.invocation.PropertyInfo):void");
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp15Service$n1 */
    public interface C8947n1 {
        /* renamed from: a */
        void mo30594a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp15Service$o */
    class C8948o implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16879a;

        C8948o(Lamp15Service lamp15Service, CompletionHandler completionHandler) {
            this.f16879a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16879a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16879a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp15Service$o0 */
    class C8949o0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8935j1 f16880a;

        C8949o0(Lamp15Service lamp15Service, C8935j1 j1Var) {
            this.f16880a = j1Var;
        }

        public void onFailed(int i, String str) {
            this.f16880a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("MainPower");
            if (property.isValueValid()) {
                this.f16880a.mo30588a(C8950o1.valueOf((String) propertyInfo.getValue("MainPower")));
                return;
            }
            C8935j1 j1Var = this.f16880a;
            j1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp15Service$o1 */
    public enum C8950o1 {
        undefined,
        on,
        off
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp15Service$p */
    class C8951p implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16885a;

        C8951p(Lamp15Service lamp15Service, CompletionHandler completionHandler) {
            this.f16885a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16885a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16885a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp15Service$p0 */
    class C8952p0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8938k1 f16886a;

        C8952p0(Lamp15Service lamp15Service, C8938k1 k1Var) {
            this.f16886a = k1Var;
        }

        public void onFailed(int i, String str) {
            this.f16886a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Power");
            if (property.isValueValid()) {
                this.f16886a.mo30590a(C8953p1.valueOf((String) propertyInfo.getValue("Power")));
                return;
            }
            C8938k1 k1Var = this.f16886a;
            k1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp15Service$p1 */
    public enum C8953p1 {
        undefined,
        on,
        off
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp15Service$q */
    class C8954q implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16891a;

        C8954q(Lamp15Service lamp15Service, CompletionHandler completionHandler) {
            this.f16891a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16891a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16891a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp15Service$q0 */
    class C8955q0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8908a1 f16892a;

        C8955q0(Lamp15Service lamp15Service, C8908a1 a1Var) {
            this.f16892a = a1Var;
        }

        public void onFailed(int i, String str) {
            this.f16892a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("BgPower");
            if (property.isValueValid()) {
                this.f16892a.mo30570a(C8962t0.valueOf((String) propertyInfo.getValue("BgPower")));
                return;
            }
            C8908a1 a1Var = this.f16892a;
            a1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp15Service$q1 */
    public interface C8956q1 {
        /* renamed from: a */
        void mo28294a(Long l);

        /* renamed from: b */
        void mo28295b(Long l);

        /* renamed from: c */
        void mo28296c(Long l);

        /* renamed from: d */
        void mo28297d(Long l);

        /* renamed from: e */
        void mo28298e(String str);

        /* renamed from: f */
        void mo28299f(Long l);

        /* renamed from: g */
        void mo28300g(Long l);

        /* renamed from: h */
        void mo28301h(Long l);

        /* renamed from: i */
        void mo28302i(C8962t0 t0Var);

        /* renamed from: j */
        void mo28303j(Long l);

        /* renamed from: k */
        void mo28304k(C8953p1 p1Var);

        /* renamed from: l */
        void mo28305l(Long l);

        /* renamed from: m */
        void mo28306m(C8950o1 o1Var);

        /* renamed from: n */
        void mo28307n(Long l);

        /* renamed from: r */
        void mo28308r(String str);

        /* renamed from: s */
        void mo28309s(Long l);

        /* renamed from: t */
        void mo28310t(Long l);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp15Service$r */
    class C8957r implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16893a;

        C8957r(Lamp15Service lamp15Service, CompletionHandler completionHandler) {
            this.f16893a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16893a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16893a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp15Service$r0 */
    class C8958r0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8917d1 f16894a;

        C8958r0(Lamp15Service lamp15Service, C8917d1 d1Var) {
            this.f16894a = d1Var;
        }

        public void onFailed(int i, String str) {
            this.f16894a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Bright");
            if (property.isValueValid()) {
                this.f16894a.mo30576a((Long) propertyInfo.getValue("Bright"));
                return;
            }
            C8917d1 d1Var = this.f16894a;
            d1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp15Service$s */
    class C8959s implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16895a;

        C8959s(Lamp15Service lamp15Service, CompletionHandler completionHandler) {
            this.f16895a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16895a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16895a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp15Service$s0 */
    class C8960s0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8968w0 f16896a;

        C8960s0(Lamp15Service lamp15Service, C8968w0 w0Var) {
            this.f16896a = w0Var;
        }

        public void onFailed(int i, String str) {
            this.f16896a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("BgBright");
            if (property.isValueValid()) {
                this.f16896a.mo30596a((Long) propertyInfo.getValue("BgBright"));
                return;
            }
            C8968w0 w0Var = this.f16896a;
            w0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp15Service$t */
    class C8961t implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16897a;

        C8961t(Lamp15Service lamp15Service, CompletionHandler completionHandler) {
            this.f16897a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16897a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16897a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp15Service$t0 */
    public enum C8962t0 {
        undefined,
        on,
        off
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp15Service$u */
    class C8963u implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16902a;

        C8963u(Lamp15Service lamp15Service, CompletionHandler completionHandler) {
            this.f16902a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16902a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16902a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp15Service$u0 */
    public enum C8964u0 {
        undefined,
        cfg_pomodoro,
        cfg_lan_ctrl,
        cfg_save_state,
        pseudo_beacon,
        cfg_init_power,
        cfg_bg_proact
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp15Service$v */
    class C8965v implements DeviceManipulator.PropertyChangedListener {

        /* renamed from: a */
        final /* synthetic */ C8956q1 f16911a;

        C8965v(Lamp15Service lamp15Service, C8956q1 q1Var) {
            this.f16911a = q1Var;
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:100:0x0276, code lost:
            r6 = r20;
            r2 = r21;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:101:0x0282, code lost:
            if (r2.getProperty("Bright").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:102:0x0284, code lost:
            r6.f16911a.mo28294a((java.lang.Long) r2.getValue("Bright"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:103:0x0290, code lost:
            r6 = r20;
            r2 = r21;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:104:0x029c, code lost:
            if (r2.getProperty("BgPower").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:105:0x029e, code lost:
            r6.f16911a.mo28302i(com.yeelight.yeelib.device.xiaomi.Lamp15Service.C8962t0.valueOf((java.lang.String) r2.getValue("BgPower")));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:106:0x02ae, code lost:
            r6 = r20;
            r2 = r21;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:107:0x02ba, code lost:
            if (r2.getProperty("Power").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:108:0x02bc, code lost:
            r6.f16911a.mo28304k(com.yeelight.yeelib.device.xiaomi.Lamp15Service.C8953p1.valueOf((java.lang.String) r2.getValue("Power")));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:109:0x02cc, code lost:
            r2 = r21;
            r0 = "MainPower";
            r6 = r20;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:110:0x02d9, code lost:
            if (r2.getProperty(r0).isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:111:0x02db, code lost:
            r6.f16911a.mo28306m(com.yeelight.yeelib.device.xiaomi.Lamp15Service.C8950o1.valueOf((java.lang.String) r2.getValue(r0)));
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
        /* JADX WARNING: Code restructure failed: missing block: B:143:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:144:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:145:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0035, code lost:
            r3 = r18;
            r19 = r16;
            r16 = "Ct";
            r0 = r17;
            r17 = r19;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x00af, code lost:
            r3 = r18;
            r19 = r16;
            r16 = "Ct";
            r0 = r17;
            r17 = r19;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:0x00dc, code lost:
            r17 = r3;
            r3 = r18;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x00e1, code lost:
            r17 = r3;
            r3 = r18;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:58:0x010b, code lost:
            r2 = 65535;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:59:0x010c, code lost:
            switch(r2) {
                case 0: goto L_0x02cc;
                case 1: goto L_0x02ae;
                case 2: goto L_0x0290;
                case 3: goto L_0x0276;
                case 4: goto L_0x025b;
                case 5: goto L_0x023e;
                case 6: goto L_0x0223;
                case 7: goto L_0x0208;
                case 8: goto L_0x01ed;
                case 9: goto L_0x01d2;
                case 10: goto L_0x01b7;
                case 11: goto L_0x019c;
                case 12: goto L_0x0181;
                case 13: goto L_0x0166;
                case 14: goto L_0x014b;
                case 15: goto L_0x0130;
                case 16: goto L_0x0113;
                default: goto L_0x010f;
            };
         */
        /* JADX WARNING: Code restructure failed: missing block: B:60:0x010f, code lost:
            r6 = r20;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:61:0x0113, code lost:
            r2 = r21;
            r6 = r17;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:62:0x011f, code lost:
            if (r2.getProperty(r6).isValueValid() == false) goto L_0x010f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:63:0x0121, code lost:
            r20.f16911a.mo28309s((java.lang.Long) r2.getValue(r6));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:64:0x0130, code lost:
            r6 = r20;
            r2 = r21;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:65:0x013c, code lost:
            if (r2.getProperty("BgFlowing").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:66:0x013e, code lost:
            r6.f16911a.mo28310t((java.lang.Long) r2.getValue("BgFlowing"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:67:0x014b, code lost:
            r6 = r20;
            r2 = r21;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:68:0x0157, code lost:
            if (r2.getProperty("Flowing").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:69:0x0159, code lost:
            r6.f16911a.mo28296c((java.lang.Long) r2.getValue("Flowing"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:70:0x0166, code lost:
            r6 = r20;
            r2 = r21;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:71:0x0172, code lost:
            if (r2.getProperty("BgRgb").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:72:0x0174, code lost:
            r6.f16911a.mo28307n((java.lang.Long) r2.getValue("BgRgb"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:73:0x0181, code lost:
            r6 = r20;
            r2 = r21;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:74:0x018d, code lost:
            if (r2.getProperty("onFromPower").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:75:0x018f, code lost:
            r6.f16911a.mo28299f((java.lang.Long) r2.getValue("onFromPower"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:76:0x019c, code lost:
            r6 = r20;
            r2 = r21;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:77:0x01a8, code lost:
            if (r2.getProperty("SaveState").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:78:0x01aa, code lost:
            r6.f16911a.mo28297d((java.lang.Long) r2.getValue("SaveState"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:79:0x01b7, code lost:
            r6 = r20;
            r2 = r21;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:80:0x01c3, code lost:
            if (r2.getProperty("LanMode").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:81:0x01c5, code lost:
            r6.f16911a.mo28300g((java.lang.Long) r2.getValue("LanMode"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:82:0x01d2, code lost:
            r6 = r20;
            r2 = r21;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:83:0x01de, code lost:
            if (r2.getProperty("BgFlowParams").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:84:0x01e0, code lost:
            r6.f16911a.mo28308r((java.lang.String) r2.getValue("BgFlowParams"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:85:0x01ed, code lost:
            r6 = r20;
            r2 = r21;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:86:0x01f9, code lost:
            if (r2.getProperty(r0).isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:87:0x01fb, code lost:
            r6.f16911a.mo28298e((java.lang.String) r2.getValue(r0));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:88:0x0208, code lost:
            r6 = r20;
            r2 = r21;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:89:0x0214, code lost:
            if (r2.getProperty("DelayOff").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:90:0x0216, code lost:
            r6.f16911a.mo28295b((java.lang.Long) r2.getValue("DelayOff"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:91:0x0223, code lost:
            r6 = r20;
            r2 = r21;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:92:0x022f, code lost:
            if (r2.getProperty("BgCt").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:93:0x0231, code lost:
            r6.f16911a.mo28303j((java.lang.Long) r2.getValue("BgCt"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:94:0x023e, code lost:
            r6 = r20;
            r2 = r21;
            r0 = r16;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:95:0x024c, code lost:
            if (r2.getProperty(r0).isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:96:0x024e, code lost:
            r6.f16911a.mo28301h((java.lang.Long) r2.getValue(r0));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:97:0x025b, code lost:
            r6 = r20;
            r2 = r21;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:98:0x0267, code lost:
            if (r2.getProperty(r3).isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:99:0x0269, code lost:
            r6.f16911a.mo28305l((java.lang.Long) r2.getValue(r3));
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onPropertyChanged(com.miot.common.device.invocation.PropertyInfo r21, java.lang.String r22) {
            /*
                r20 = this;
                r0 = r20
                r1 = r21
                r2 = r22
                int r3 = r22.hashCode()
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
                switch(r3) {
                    case -2117953292: goto L_0x00f8;
                    case -2017000513: goto L_0x00e6;
                    case -2002016140: goto L_0x00ce;
                    case -1616019574: goto L_0x00ba;
                    case 2193: goto L_0x00a8;
                    case 2067382: goto L_0x00a0;
                    case 35911772: goto L_0x0097;
                    case 64102952: goto L_0x008e;
                    case 77306085: goto L_0x0086;
                    case 880790796: goto L_0x007e;
                    case 898856916: goto L_0x0075;
                    case 986784719: goto L_0x006c;
                    case 1471809440: goto L_0x0064;
                    case 1611821756: goto L_0x005b;
                    case 1738956460: goto L_0x0053;
                    case 1820079769: goto L_0x004a;
                    case 1998035738: goto L_0x0041;
                    default: goto L_0x0035;
                }
            L_0x0035:
                r3 = r18
                r19 = r16
                r16 = r0
                r0 = r17
                r17 = r19
                goto L_0x010b
            L_0x0041:
                boolean r2 = r2.equals(r4)
                if (r2 == 0) goto L_0x0035
                r2 = 3
                goto L_0x00af
            L_0x004a:
                boolean r2 = r2.equals(r5)
                if (r2 == 0) goto L_0x0035
                r2 = 9
                goto L_0x00af
            L_0x0053:
                boolean r2 = r2.equals(r6)
                if (r2 == 0) goto L_0x0035
                r2 = 0
                goto L_0x00af
            L_0x005b:
                boolean r2 = r2.equals(r7)
                if (r2 == 0) goto L_0x0035
                r2 = 10
                goto L_0x00af
            L_0x0064:
                boolean r2 = r2.equals(r8)
                if (r2 == 0) goto L_0x0035
                r2 = 2
                goto L_0x00af
            L_0x006c:
                boolean r2 = r2.equals(r9)
                if (r2 == 0) goto L_0x0035
                r2 = 15
                goto L_0x00af
            L_0x0075:
                boolean r2 = r2.equals(r10)
                if (r2 == 0) goto L_0x0035
                r2 = 14
                goto L_0x00af
            L_0x007e:
                boolean r2 = r2.equals(r11)
                if (r2 == 0) goto L_0x0035
                r2 = 7
                goto L_0x00af
            L_0x0086:
                boolean r2 = r2.equals(r12)
                if (r2 == 0) goto L_0x0035
                r2 = 1
                goto L_0x00af
            L_0x008e:
                boolean r2 = r2.equals(r13)
                if (r2 == 0) goto L_0x0035
                r2 = 13
                goto L_0x00af
            L_0x0097:
                boolean r2 = r2.equals(r14)
                if (r2 == 0) goto L_0x0035
                r2 = 12
                goto L_0x00af
            L_0x00a0:
                boolean r2 = r2.equals(r15)
                if (r2 == 0) goto L_0x0035
                r2 = 6
                goto L_0x00af
            L_0x00a8:
                boolean r2 = r2.equals(r0)
                if (r2 == 0) goto L_0x0035
                r2 = 5
            L_0x00af:
                r3 = r18
                r19 = r16
                r16 = r0
                r0 = r17
                r17 = r19
                goto L_0x010c
            L_0x00ba:
                r3 = r16
                boolean r2 = r2.equals(r3)
                if (r2 == 0) goto L_0x00c9
                r2 = 16
                r16 = r0
                r0 = r17
                goto L_0x00dc
            L_0x00c9:
                r16 = r0
                r0 = r17
                goto L_0x00e1
            L_0x00ce:
                r3 = r16
                r16 = r0
                r0 = r17
                boolean r2 = r2.equals(r0)
                if (r2 == 0) goto L_0x00e1
                r2 = 8
            L_0x00dc:
                r17 = r3
                r3 = r18
                goto L_0x010c
            L_0x00e1:
                r17 = r3
                r3 = r18
                goto L_0x010b
            L_0x00e6:
                r3 = r18
                r19 = r16
                r16 = r0
                r0 = r17
                r17 = r19
                boolean r2 = r2.equals(r3)
                if (r2 == 0) goto L_0x010b
                r2 = 4
                goto L_0x010c
            L_0x00f8:
                r3 = r18
                r19 = r16
                r16 = r0
                r0 = r17
                r17 = r19
                boolean r2 = r2.equals(r1)
                if (r2 == 0) goto L_0x010b
                r2 = 11
                goto L_0x010c
            L_0x010b:
                r2 = -1
            L_0x010c:
                switch(r2) {
                    case 0: goto L_0x02cc;
                    case 1: goto L_0x02ae;
                    case 2: goto L_0x0290;
                    case 3: goto L_0x0276;
                    case 4: goto L_0x025b;
                    case 5: goto L_0x023e;
                    case 6: goto L_0x0223;
                    case 7: goto L_0x0208;
                    case 8: goto L_0x01ed;
                    case 9: goto L_0x01d2;
                    case 10: goto L_0x01b7;
                    case 11: goto L_0x019c;
                    case 12: goto L_0x0181;
                    case 13: goto L_0x0166;
                    case 14: goto L_0x014b;
                    case 15: goto L_0x0130;
                    case 16: goto L_0x0113;
                    default: goto L_0x010f;
                }
            L_0x010f:
                r6 = r20
                goto L_0x02ea
            L_0x0113:
                r2 = r21
                r6 = r17
                com.miot.common.property.Property r0 = r2.getProperty(r6)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x010f
                java.lang.Object r0 = r2.getValue(r6)
                java.lang.Long r0 = (java.lang.Long) r0
                r6 = r20
                com.yeelight.yeelib.device.xiaomi.Lamp15Service$q1 r1 = r6.f16911a
                r1.mo28309s(r0)
                goto L_0x02ea
            L_0x0130:
                r6 = r20
                r2 = r21
                com.miot.common.property.Property r0 = r2.getProperty(r9)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x02ea
                java.lang.Object r0 = r2.getValue(r9)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Lamp15Service$q1 r1 = r6.f16911a
                r1.mo28310t(r0)
                goto L_0x02ea
            L_0x014b:
                r6 = r20
                r2 = r21
                com.miot.common.property.Property r0 = r2.getProperty(r10)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x02ea
                java.lang.Object r0 = r2.getValue(r10)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Lamp15Service$q1 r1 = r6.f16911a
                r1.mo28296c(r0)
                goto L_0x02ea
            L_0x0166:
                r6 = r20
                r2 = r21
                com.miot.common.property.Property r0 = r2.getProperty(r13)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x02ea
                java.lang.Object r0 = r2.getValue(r13)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Lamp15Service$q1 r1 = r6.f16911a
                r1.mo28307n(r0)
                goto L_0x02ea
            L_0x0181:
                r6 = r20
                r2 = r21
                com.miot.common.property.Property r0 = r2.getProperty(r14)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x02ea
                java.lang.Object r0 = r2.getValue(r14)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Lamp15Service$q1 r1 = r6.f16911a
                r1.mo28299f(r0)
                goto L_0x02ea
            L_0x019c:
                r6 = r20
                r2 = r21
                com.miot.common.property.Property r0 = r2.getProperty(r1)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x02ea
                java.lang.Object r0 = r2.getValue(r1)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Lamp15Service$q1 r1 = r6.f16911a
                r1.mo28297d(r0)
                goto L_0x02ea
            L_0x01b7:
                r6 = r20
                r2 = r21
                com.miot.common.property.Property r0 = r2.getProperty(r7)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x02ea
                java.lang.Object r0 = r2.getValue(r7)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Lamp15Service$q1 r1 = r6.f16911a
                r1.mo28300g(r0)
                goto L_0x02ea
            L_0x01d2:
                r6 = r20
                r2 = r21
                com.miot.common.property.Property r0 = r2.getProperty(r5)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x02ea
                java.lang.Object r0 = r2.getValue(r5)
                java.lang.String r0 = (java.lang.String) r0
                com.yeelight.yeelib.device.xiaomi.Lamp15Service$q1 r1 = r6.f16911a
                r1.mo28308r(r0)
                goto L_0x02ea
            L_0x01ed:
                r6 = r20
                r2 = r21
                com.miot.common.property.Property r1 = r2.getProperty(r0)
                boolean r1 = r1.isValueValid()
                if (r1 == 0) goto L_0x02ea
                java.lang.Object r0 = r2.getValue(r0)
                java.lang.String r0 = (java.lang.String) r0
                com.yeelight.yeelib.device.xiaomi.Lamp15Service$q1 r1 = r6.f16911a
                r1.mo28298e(r0)
                goto L_0x02ea
            L_0x0208:
                r6 = r20
                r2 = r21
                com.miot.common.property.Property r0 = r2.getProperty(r11)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x02ea
                java.lang.Object r0 = r2.getValue(r11)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Lamp15Service$q1 r1 = r6.f16911a
                r1.mo28295b(r0)
                goto L_0x02ea
            L_0x0223:
                r6 = r20
                r2 = r21
                com.miot.common.property.Property r0 = r2.getProperty(r15)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x02ea
                java.lang.Object r0 = r2.getValue(r15)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Lamp15Service$q1 r1 = r6.f16911a
                r1.mo28303j(r0)
                goto L_0x02ea
            L_0x023e:
                r6 = r20
                r2 = r21
                r0 = r16
                com.miot.common.property.Property r1 = r2.getProperty(r0)
                boolean r1 = r1.isValueValid()
                if (r1 == 0) goto L_0x02ea
                java.lang.Object r0 = r2.getValue(r0)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Lamp15Service$q1 r1 = r6.f16911a
                r1.mo28301h(r0)
                goto L_0x02ea
            L_0x025b:
                r6 = r20
                r2 = r21
                com.miot.common.property.Property r0 = r2.getProperty(r3)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x02ea
                java.lang.Object r0 = r2.getValue(r3)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Lamp15Service$q1 r1 = r6.f16911a
                r1.mo28305l(r0)
                goto L_0x02ea
            L_0x0276:
                r6 = r20
                r2 = r21
                com.miot.common.property.Property r0 = r2.getProperty(r4)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x02ea
                java.lang.Object r0 = r2.getValue(r4)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Lamp15Service$q1 r1 = r6.f16911a
                r1.mo28294a(r0)
                goto L_0x02ea
            L_0x0290:
                r6 = r20
                r2 = r21
                com.miot.common.property.Property r0 = r2.getProperty(r8)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x02ea
                java.lang.Object r0 = r2.getValue(r8)
                java.lang.String r0 = (java.lang.String) r0
                com.yeelight.yeelib.device.xiaomi.Lamp15Service$t0 r0 = com.yeelight.yeelib.device.xiaomi.Lamp15Service.C8962t0.valueOf(r0)
                com.yeelight.yeelib.device.xiaomi.Lamp15Service$q1 r1 = r6.f16911a
                r1.mo28302i(r0)
                goto L_0x02ea
            L_0x02ae:
                r6 = r20
                r2 = r21
                com.miot.common.property.Property r0 = r2.getProperty(r12)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x02ea
                java.lang.Object r0 = r2.getValue(r12)
                java.lang.String r0 = (java.lang.String) r0
                com.yeelight.yeelib.device.xiaomi.Lamp15Service$p1 r0 = com.yeelight.yeelib.device.xiaomi.Lamp15Service.C8953p1.valueOf(r0)
                com.yeelight.yeelib.device.xiaomi.Lamp15Service$q1 r1 = r6.f16911a
                r1.mo28304k(r0)
                goto L_0x02ea
            L_0x02cc:
                r2 = r21
                r0 = r6
                r6 = r20
                com.miot.common.property.Property r1 = r2.getProperty(r0)
                boolean r1 = r1.isValueValid()
                if (r1 == 0) goto L_0x02ea
                java.lang.Object r0 = r2.getValue(r0)
                java.lang.String r0 = (java.lang.String) r0
                com.yeelight.yeelib.device.xiaomi.Lamp15Service$o1 r0 = com.yeelight.yeelib.device.xiaomi.Lamp15Service.C8950o1.valueOf(r0)
                com.yeelight.yeelib.device.xiaomi.Lamp15Service$q1 r1 = r6.f16911a
                r1.mo28306m(r0)
            L_0x02ea:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.xiaomi.Lamp15Service.C8965v.onPropertyChanged(com.miot.common.device.invocation.PropertyInfo, java.lang.String):void");
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp15Service$v0 */
    public enum C8966v0 {
        undefined,
        smooth,
        sudden
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp15Service$w */
    class C8967w implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16916a;

        C8967w(Lamp15Service lamp15Service, CompletionHandler completionHandler) {
            this.f16916a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16916a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16916a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp15Service$w0 */
    public interface C8968w0 {
        /* renamed from: a */
        void mo30596a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp15Service$x */
    class C8969x implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16917a;

        C8969x(Lamp15Service lamp15Service, CompletionHandler completionHandler) {
            this.f16917a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16917a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16917a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp15Service$x0 */
    public interface C8970x0 {
        /* renamed from: a */
        void mo30598a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp15Service$y */
    class C8971y implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16918a;

        C8971y(Lamp15Service lamp15Service, CompletionHandler completionHandler) {
            this.f16918a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16918a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16918a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp15Service$y0 */
    public interface C8972y0 {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp15Service$z */
    class C8973z implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16919a;

        C8973z(Lamp15Service lamp15Service, CompletionHandler completionHandler) {
            this.f16919a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16919a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16919a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp15Service$z0 */
    public interface C8974z0 {
        /* renamed from: a */
        void mo30602a(Long l);

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
                MiotManager.getDeviceManipulator().invoke(create, new C8907a0(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8954q(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getBgBright(C8968w0 w0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "BgBright"), new C8960s0(this, w0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getBgCt(C8970x0 x0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "BgCt"), new C8909b(this, x0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getBgFlowParams(C8972y0 y0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "BgFlowParams"), new C8918e(this, y0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getBgFlowing(C8974z0 z0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "BgFlowing"), new C8939l(this, z0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getBgPower(C8908a1 a1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "BgPower"), new C8955q0(this, a1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getBgProact(C8911b1 b1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "BgProact"), new C8942m(this, b1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getBgRgb(C8914c1 c1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "BgRgb"), new C8930i(this, c1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getBright(C8917d1 d1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Bright"), new C8958r0(this, d1Var));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8937k0(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getCt(C8920e1 e1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Ct"), new C8906a(this, e1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getDelayOff(C8923f1 f1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "DelayOff"), new C8912c(this, f1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowParams(C8926g1 g1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "FlowParams"), new C8915d(this, g1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowing(C8929h1 h1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Flowing"), new C8933j(this, h1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getLanMode(C8932i1 i1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "LanMode"), new C8921f(this, i1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getMainPower(C8935j1 j1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "MainPower"), new C8949o0(this, j1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getPower(C8938k1 k1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Power"), new C8952p0(this, k1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getProperties(C8941l1 l1Var) {
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
            MiotManager.getDeviceManipulator().readProperty(create, new C8946n0(this, l1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getSaveState(C8944m1 m1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "SaveState"), new C8924g(this, m1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getonFromPower(C8947n1 n1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "onFromPower"), new C8927h(this, n1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void openBgWithMode(C8962t0 t0Var, C8966v0 v0Var, Long l, Long l2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "openBgWithMode");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("BgPower", t0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Effect", v0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Duration", l)) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("Mode", l2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C8973z(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void openWithMode(C8950o1 o1Var, C8966v0 v0Var, Long l, Long l2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "openWithMode");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("MainPower", o1Var.toString())) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Effect", v0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Duration", l)) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("Mode", l2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C8967w(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8957r(this, completionHandler));
                return;
            }
            throw new MiotException("actionInfo is null");
        }
        throw new MiotException("device not configurated connection");
    }

    public void sendCmd(C8964u0 u0Var, String str, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "sendCmd");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("CmdKey", u0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("CmdValue", str)) {
                MiotManager.getDeviceManipulator().invoke(create, new C8916d0(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setBgBright(Long l, C8966v0 v0Var, Long l2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setBgBright");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("BgBright", l)) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Effect", v0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("Duration", l2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C8943m0(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setBgCt(Long l, C8966v0 v0Var, Long l2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setBgCt");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("BgCt", l)) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Effect", v0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("Duration", l2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C8913c0(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8934j0(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setBgPower(C8962t0 t0Var, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setBgPower");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (create.setArgumentValue("BgPower", t0Var.toString())) {
                MiotManager.getDeviceManipulator().invoke(create, new C8945n(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setBgRgb(Long l, C8966v0 v0Var, Long l2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setBgRgb");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("BgRgb", l)) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Effect", v0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("Duration", l2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C8963u(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8948o(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setBright(Long l, C8966v0 v0Var, Long l2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setBright");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("Bright", l)) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Effect", v0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("Duration", l2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C8951p(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setCt(Long l, C8966v0 v0Var, Long l2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setCt");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("Ct", l)) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Effect", v0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("Duration", l2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C8931i0(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8910b0(this, completionHandler));
                return;
            }
            throw new MiotException("actionInfo is null");
        }
        throw new MiotException("device not configurated connection");
    }

    public void setDevPower(C8953p1 p1Var, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setDevPower");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (create.setArgumentValue("Power", p1Var.toString())) {
                MiotManager.getDeviceManipulator().invoke(create, new C8961t(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8922f0(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setPower(C8953p1 p1Var, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setPower");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (create.setArgumentValue("Power", p1Var.toString())) {
                MiotManager.getDeviceManipulator().invoke(create, new C8969x(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8959s(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8928h0(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8919e0(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8940l0(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void subscribeNotifications(CompletionHandler completionHandler, C8956q1 q1Var) {
        if (completionHandler == null) {
            throw new IllegalArgumentException("handler is null");
        } else if (q1Var != null) {
            PropertyInfo create = PropertyInfoFactory.create(getService());
            for (Property next : getService().getProperties()) {
                if (next.getDefinition().isNotifiable()) {
                    create.addProperty(next);
                }
            }
            MiotManager.getDeviceManipulator().addPropertyChangedListener(create, new C8936k(this, completionHandler), new C8965v(this, q1Var));
        } else {
            throw new IllegalArgumentException("listener is null");
        }
    }

    public void toggle(CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "toggle");
            if (create != null) {
                MiotManager.getDeviceManipulator().invoke(create, new C8971y(this, completionHandler));
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
            MiotManager.getDeviceManipulator().removePropertyChangedListener(create, new C8925g0(this, completionHandler));
            return;
        }
        throw new IllegalArgumentException("handler is null");
    }
}
