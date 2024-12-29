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

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$a */
    class C8123a implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8149i1 f16097a;

        C8123a(Ceiling4Service ceiling4Service, C8149i1 i1Var) {
            this.f16097a = i1Var;
        }

        public void onFailed(int i, String str) {
            this.f16097a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Ct");
            if (property.isValueValid()) {
                this.f16097a.mo29690a((Long) propertyInfo.getValue("Ct"));
                return;
            }
            C8149i1 i1Var = this.f16097a;
            i1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$a0 */
    class C8124a0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16098a;

        C8124a0(Ceiling4Service ceiling4Service, CompletionHandler completionHandler) {
            this.f16098a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16098a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16098a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$a1 */
    public interface C8125a1 {
        /* renamed from: a */
        void mo29674a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$b */
    class C8126b implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8128b1 f16099a;

        C8126b(Ceiling4Service ceiling4Service, C8128b1 b1Var) {
            this.f16099a = b1Var;
        }

        public void onFailed(int i, String str) {
            this.f16099a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("BgCt");
            if (property.isValueValid()) {
                this.f16099a.mo29676a((Long) propertyInfo.getValue("BgCt"));
                return;
            }
            C8128b1 b1Var = this.f16099a;
            b1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$b0 */
    class C8127b0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16100a;

        C8127b0(Ceiling4Service ceiling4Service, CompletionHandler completionHandler) {
            this.f16100a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16100a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16100a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$b1 */
    public interface C8128b1 {
        /* renamed from: a */
        void mo29676a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$c */
    class C8129c implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8152j1 f16101a;

        C8129c(Ceiling4Service ceiling4Service, C8152j1 j1Var) {
            this.f16101a = j1Var;
        }

        public void onFailed(int i, String str) {
            this.f16101a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("DelayOff");
            if (property.isValueValid()) {
                this.f16101a.mo29692a((Long) propertyInfo.getValue("DelayOff"));
                return;
            }
            C8152j1 j1Var = this.f16101a;
            j1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$c0 */
    class C8130c0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16102a;

        C8130c0(Ceiling4Service ceiling4Service, CompletionHandler completionHandler) {
            this.f16102a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16102a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16102a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$c1 */
    public interface C8131c1 {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$d */
    class C8132d implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8155k1 f16103a;

        C8132d(Ceiling4Service ceiling4Service, C8155k1 k1Var) {
            this.f16103a = k1Var;
        }

        public void onFailed(int i, String str) {
            this.f16103a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("FlowParams");
            if (property.isValueValid()) {
                this.f16103a.onSucceed((String) propertyInfo.getValue("FlowParams"));
                return;
            }
            C8155k1 k1Var = this.f16103a;
            k1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$d0 */
    class C8133d0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16104a;

        C8133d0(Ceiling4Service ceiling4Service, CompletionHandler completionHandler) {
            this.f16104a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16104a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16104a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$d1 */
    public interface C8134d1 {
        /* renamed from: a */
        void mo29680a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$e */
    class C8135e implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8131c1 f16105a;

        C8135e(Ceiling4Service ceiling4Service, C8131c1 c1Var) {
            this.f16105a = c1Var;
        }

        public void onFailed(int i, String str) {
            this.f16105a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("BgFlowParams");
            if (property.isValueValid()) {
                this.f16105a.onSucceed((String) propertyInfo.getValue("BgFlowParams"));
                return;
            }
            C8131c1 c1Var = this.f16105a;
            c1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$e0 */
    class C8136e0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16106a;

        C8136e0(Ceiling4Service ceiling4Service, CompletionHandler completionHandler) {
            this.f16106a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16106a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16106a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$e1 */
    public interface C8137e1 {
        /* renamed from: a */
        void mo29682a(C8193x0 x0Var);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$f */
    class C8138f implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8161m1 f16107a;

        C8138f(Ceiling4Service ceiling4Service, C8161m1 m1Var) {
            this.f16107a = m1Var;
        }

        public void onFailed(int i, String str) {
            this.f16107a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("LanMode");
            if (property.isValueValid()) {
                this.f16107a.mo29698a((Long) propertyInfo.getValue("LanMode"));
                return;
            }
            C8161m1 m1Var = this.f16107a;
            m1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$f0 */
    class C8139f0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16108a;

        C8139f0(Ceiling4Service ceiling4Service, CompletionHandler completionHandler) {
            this.f16108a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16108a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16108a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$f1 */
    public interface C8140f1 {
        /* renamed from: a */
        void mo29684a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$g */
    class C8141g implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8182t1 f16109a;

        C8141g(Ceiling4Service ceiling4Service, C8182t1 t1Var) {
            this.f16109a = t1Var;
        }

        public void onFailed(int i, String str) {
            this.f16109a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("SaveState");
            if (property.isValueValid()) {
                this.f16109a.mo29710a((Long) propertyInfo.getValue("SaveState"));
                return;
            }
            C8182t1 t1Var = this.f16109a;
            t1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$g0 */
    class C8142g0 implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16110a;

        C8142g0(Ceiling4Service ceiling4Service, CompletionHandler completionHandler) {
            this.f16110a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16110a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f16110a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$g1 */
    public interface C8143g1 {
        /* renamed from: a */
        void mo29686a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$h */
    class C8144h implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8185u1 f16111a;

        C8144h(Ceiling4Service ceiling4Service, C8185u1 u1Var) {
            this.f16111a = u1Var;
        }

        public void onFailed(int i, String str) {
            this.f16111a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("onFromPower");
            if (property.isValueValid()) {
                this.f16111a.mo29712a((Long) propertyInfo.getValue("onFromPower"));
                return;
            }
            C8185u1 u1Var = this.f16111a;
            u1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$h0 */
    class C8145h0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16112a;

        C8145h0(Ceiling4Service ceiling4Service, CompletionHandler completionHandler) {
            this.f16112a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16112a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16112a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$h1 */
    public interface C8146h1 {
        /* renamed from: a */
        void mo29688a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$i */
    class C8147i implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8170p1 f16113a;

        C8147i(Ceiling4Service ceiling4Service, C8170p1 p1Var) {
            this.f16113a = p1Var;
        }

        public void onFailed(int i, String str) {
            this.f16113a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("NLBright");
            if (property.isValueValid()) {
                this.f16113a.mo29704a((Long) propertyInfo.getValue("NLBright"));
                return;
            }
            C8170p1 p1Var = this.f16113a;
            p1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$i0 */
    class C8148i0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16114a;

        C8148i0(Ceiling4Service ceiling4Service, CompletionHandler completionHandler) {
            this.f16114a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16114a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16114a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$i1 */
    public interface C8149i1 {
        /* renamed from: a */
        void mo29690a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$j */
    class C8150j implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8173q1 f16115a;

        C8150j(Ceiling4Service ceiling4Service, C8173q1 q1Var) {
            this.f16115a = q1Var;
        }

        public void onFailed(int i, String str) {
            this.f16115a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("NightTimeInfo");
            if (property.isValueValid()) {
                this.f16115a.onSucceed((String) propertyInfo.getValue("NightTimeInfo"));
                return;
            }
            C8173q1 q1Var = this.f16115a;
            q1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$j0 */
    class C8151j0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16116a;

        C8151j0(Ceiling4Service ceiling4Service, CompletionHandler completionHandler) {
            this.f16116a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16116a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16116a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$j1 */
    public interface C8152j1 {
        /* renamed from: a */
        void mo29692a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$k */
    class C8153k implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16117a;

        C8153k(Ceiling4Service ceiling4Service, CompletionHandler completionHandler) {
            this.f16117a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16117a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f16117a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$k0 */
    class C8154k0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16118a;

        C8154k0(Ceiling4Service ceiling4Service, CompletionHandler completionHandler) {
            this.f16118a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16118a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16118a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$k1 */
    public interface C8155k1 {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$l */
    class C8156l implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8167o1 f16119a;

        C8156l(Ceiling4Service ceiling4Service, C8167o1 o1Var) {
            this.f16119a = o1Var;
        }

        public void onFailed(int i, String str) {
            this.f16119a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("MiBandSleep");
            if (property.isValueValid()) {
                this.f16119a.mo29702a((Long) propertyInfo.getValue("MiBandSleep"));
                return;
            }
            C8167o1 o1Var = this.f16119a;
            o1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$l0 */
    class C8157l0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16120a;

        C8157l0(Ceiling4Service ceiling4Service, CompletionHandler completionHandler) {
            this.f16120a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16120a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16120a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$l1 */
    public interface C8158l1 {
        /* renamed from: a */
        void mo29696a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$m */
    class C8159m implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8143g1 f16121a;

        C8159m(Ceiling4Service ceiling4Service, C8143g1 g1Var) {
            this.f16121a = g1Var;
        }

        public void onFailed(int i, String str) {
            this.f16121a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("BgRgb");
            if (property.isValueValid()) {
                this.f16121a.mo29686a((Long) propertyInfo.getValue("BgRgb"));
                return;
            }
            C8143g1 g1Var = this.f16121a;
            g1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$m0 */
    class C8160m0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16122a;

        C8160m0(Ceiling4Service ceiling4Service, CompletionHandler completionHandler) {
            this.f16122a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16122a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16122a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$m1 */
    public interface C8161m1 {
        /* renamed from: a */
        void mo29698a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$n */
    class C8162n implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8158l1 f16123a;

        C8162n(Ceiling4Service ceiling4Service, C8158l1 l1Var) {
            this.f16123a = l1Var;
        }

        public void onFailed(int i, String str) {
            this.f16123a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Flowing");
            if (property.isValueValid()) {
                this.f16123a.mo29696a((Long) propertyInfo.getValue("Flowing"));
                return;
            }
            C8158l1 l1Var = this.f16123a;
            l1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$n0 */
    class C8163n0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16124a;

        C8163n0(Ceiling4Service ceiling4Service, CompletionHandler completionHandler) {
            this.f16124a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16124a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16124a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$n1 */
    public interface C8164n1 {
        /* renamed from: a */
        void mo29700a(C8188v1 v1Var);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$o */
    class C8165o implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8134d1 f16125a;

        C8165o(Ceiling4Service ceiling4Service, C8134d1 d1Var) {
            this.f16125a = d1Var;
        }

        public void onFailed(int i, String str) {
            this.f16125a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("BgFlowing");
            if (property.isValueValid()) {
                this.f16125a.mo29680a((Long) propertyInfo.getValue("BgFlowing"));
                return;
            }
            C8134d1 d1Var = this.f16125a;
            d1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$o0 */
    class C8166o0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16126a;

        C8166o0(Ceiling4Service ceiling4Service, CompletionHandler completionHandler) {
            this.f16126a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16126a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16126a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$o1 */
    public interface C8167o1 {
        /* renamed from: a */
        void mo29702a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$p */
    class C8168p implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8140f1 f16127a;

        C8168p(Ceiling4Service ceiling4Service, C8140f1 f1Var) {
            this.f16127a = f1Var;
        }

        public void onFailed(int i, String str) {
            this.f16127a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("BgProact");
            if (property.isValueValid()) {
                this.f16127a.mo29684a((Long) propertyInfo.getValue("BgProact"));
                return;
            }
            C8140f1 f1Var = this.f16127a;
            f1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$p0 */
    class C8169p0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16128a;

        C8169p0(Ceiling4Service ceiling4Service, CompletionHandler completionHandler) {
            this.f16128a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16128a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16128a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$p1 */
    public interface C8170p1 {
        /* renamed from: a */
        void mo29704a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$q */
    class C8171q implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16129a;

        C8171q(Ceiling4Service ceiling4Service, CompletionHandler completionHandler) {
            this.f16129a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16129a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16129a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$q0 */
    class C8172q0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16130a;

        C8172q0(Ceiling4Service ceiling4Service, CompletionHandler completionHandler) {
            this.f16130a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16130a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16130a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$q1 */
    public interface C8173q1 {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$r */
    class C8174r implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16131a;

        C8174r(Ceiling4Service ceiling4Service, CompletionHandler completionHandler) {
            this.f16131a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16131a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16131a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$r0 */
    class C8175r0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8179s1 f16132a;

        C8175r0(Ceiling4Service ceiling4Service, C8179s1 s1Var) {
            this.f16132a = s1Var;
        }

        public void onFailed(int i, String str) {
            this.f16132a.onFailed(i, str);
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
                com.yeelight.yeelib.device.xiaomi.Ceiling4Service$v1 r1 = com.yeelight.yeelib.device.xiaomi.Ceiling4Service.C8188v1.valueOf(r1)
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
                com.yeelight.yeelib.device.xiaomi.Ceiling4Service$w1 r1 = com.yeelight.yeelib.device.xiaomi.Ceiling4Service.C8191w1.valueOf(r1)
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
                com.yeelight.yeelib.device.xiaomi.Ceiling4Service$x0 r1 = com.yeelight.yeelib.device.xiaomi.Ceiling4Service.C8193x0.valueOf(r1)
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
                com.yeelight.yeelib.device.xiaomi.Ceiling4Service$s1 r4 = r0.f16132a
                r4.mo28479a(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.xiaomi.Ceiling4Service.C8175r0.onSucceed(com.miot.common.device.invocation.PropertyInfo):void");
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$r1 */
    public interface C8176r1 {
        /* renamed from: a */
        void mo29708a(C8191w1 w1Var);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$s */
    class C8177s implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16133a;

        C8177s(Ceiling4Service ceiling4Service, CompletionHandler completionHandler) {
            this.f16133a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16133a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16133a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$s0 */
    class C8178s0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8164n1 f16134a;

        C8178s0(Ceiling4Service ceiling4Service, C8164n1 n1Var) {
            this.f16134a = n1Var;
        }

        public void onFailed(int i, String str) {
            this.f16134a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("MainPower");
            if (property.isValueValid()) {
                this.f16134a.mo29700a(C8188v1.valueOf((String) propertyInfo.getValue("MainPower")));
                return;
            }
            C8164n1 n1Var = this.f16134a;
            n1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$s1 */
    public interface C8179s1 {
        /* renamed from: a */
        void mo28479a(C8188v1 v1Var, C8191w1 w1Var, C8193x0 x0Var, Long l, Long l2, Long l3, Long l4, Long l5, String str, String str2, Long l6, Long l7, Long l8, Long l9, String str3, Long l10, Long l11, Long l12, Long l13, Long l14);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$t */
    class C8180t implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16135a;

        C8180t(Ceiling4Service ceiling4Service, CompletionHandler completionHandler) {
            this.f16135a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16135a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16135a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$t0 */
    class C8181t0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8176r1 f16136a;

        C8181t0(Ceiling4Service ceiling4Service, C8176r1 r1Var) {
            this.f16136a = r1Var;
        }

        public void onFailed(int i, String str) {
            this.f16136a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Power");
            if (property.isValueValid()) {
                this.f16136a.mo29708a(C8191w1.valueOf((String) propertyInfo.getValue("Power")));
                return;
            }
            C8176r1 r1Var = this.f16136a;
            r1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$t1 */
    public interface C8182t1 {
        /* renamed from: a */
        void mo29710a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$u */
    class C8183u implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16137a;

        C8183u(Ceiling4Service ceiling4Service, CompletionHandler completionHandler) {
            this.f16137a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16137a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16137a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$u0 */
    class C8184u0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8137e1 f16138a;

        C8184u0(Ceiling4Service ceiling4Service, C8137e1 e1Var) {
            this.f16138a = e1Var;
        }

        public void onFailed(int i, String str) {
            this.f16138a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("BgPower");
            if (property.isValueValid()) {
                this.f16138a.mo29682a(C8193x0.valueOf((String) propertyInfo.getValue("BgPower")));
                return;
            }
            C8137e1 e1Var = this.f16138a;
            e1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$u1 */
    public interface C8185u1 {
        /* renamed from: a */
        void mo29712a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$v */
    class C8186v implements DeviceManipulator.PropertyChangedListener {

        /* renamed from: a */
        final /* synthetic */ C8194x1 f16139a;

        C8186v(Ceiling4Service ceiling4Service, C8194x1 x1Var) {
            this.f16139a = x1Var;
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:100:0x028a, code lost:
            r6 = r23;
            r2 = r24;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:101:0x0296, code lost:
            if (r2.getProperty("SaveState").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:102:0x0298, code lost:
            r6.f16139a.mo28484d((java.lang.Long) r2.getValue("SaveState"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:103:0x02a5, code lost:
            r6 = r23;
            r2 = r24;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:104:0x02b1, code lost:
            if (r2.getProperty("LanMode").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:105:0x02b3, code lost:
            r6.f16139a.mo28487g((java.lang.Long) r2.getValue("LanMode"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:106:0x02c0, code lost:
            r6 = r23;
            r2 = r24;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:107:0x02cc, code lost:
            if (r2.getProperty("BgFlowParams").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:108:0x02ce, code lost:
            r6.f16139a.mo28498r((java.lang.String) r2.getValue("BgFlowParams"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:109:0x02db, code lost:
            r6 = r23;
            r2 = r24;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:110:0x02e7, code lost:
            if (r2.getProperty(r12).isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:111:0x02e9, code lost:
            r6.f16139a.mo28485e((java.lang.String) r2.getValue(r12));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:112:0x02f6, code lost:
            r6 = r23;
            r2 = r24;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:113:0x0302, code lost:
            if (r2.getProperty("DelayOff").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:114:0x0304, code lost:
            r6.f16139a.mo28482b((java.lang.Long) r2.getValue("DelayOff"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:115:0x0311, code lost:
            r6 = r23;
            r2 = r24;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:116:0x031d, code lost:
            if (r2.getProperty("BgCt").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:117:0x031f, code lost:
            r6.f16139a.mo28490j((java.lang.Long) r2.getValue("BgCt"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:118:0x032c, code lost:
            r6 = r23;
            r2 = r24;
            r0 = r16;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:119:0x033a, code lost:
            if (r2.getProperty(r0).isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:120:0x033c, code lost:
            r6.f16139a.mo28488h((java.lang.Long) r2.getValue(r0));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:121:0x0349, code lost:
            r6 = r23;
            r2 = r24;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:122:0x0355, code lost:
            if (r2.getProperty(r8).isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:123:0x0357, code lost:
            r6.f16139a.mo28492l((java.lang.Long) r2.getValue(r8));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:124:0x0364, code lost:
            r6 = r23;
            r2 = r24;
            r0 = "Bright";
         */
        /* JADX WARNING: Code restructure failed: missing block: B:125:0x0371, code lost:
            if (r2.getProperty(r0).isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:126:0x0373, code lost:
            r6.f16139a.mo28481a((java.lang.Long) r2.getValue(r0));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:127:0x037f, code lost:
            r6 = r23;
            r2 = r24;
            r0 = r20;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:128:0x038d, code lost:
            if (r2.getProperty(r0).isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:129:0x038f, code lost:
            r6.f16139a.mo28497q(com.yeelight.yeelib.device.xiaomi.Ceiling4Service.C8193x0.valueOf((java.lang.String) r2.getValue(r0)));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:130:0x039f, code lost:
            r6 = r23;
            r2 = r24;
            r0 = r19;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:131:0x03ad, code lost:
            if (r2.getProperty(r0).isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:132:0x03af, code lost:
            r6.f16139a.mo28495o(com.yeelight.yeelib.device.xiaomi.Ceiling4Service.C8191w1.valueOf((java.lang.String) r2.getValue(r0)));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:133:0x03bf, code lost:
            r6 = r23;
            r2 = r24;
            r0 = r18;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:134:0x03cd, code lost:
            if (r2.getProperty(r0).isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:135:0x03cf, code lost:
            r6.f16139a.mo28496p(com.yeelight.yeelib.device.xiaomi.Ceiling4Service.C8188v1.valueOf((java.lang.String) r2.getValue(r0)));
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
        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0041, code lost:
            r3 = r18;
            r18 = "MainPower";
            r6 = r19;
            r19 = "Power";
            r12 = r20;
            r20 = "BgPower";
            r8 = r21;
            r22 = r16;
            r16 = "Ct";
            r0 = r17;
            r17 = r22;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x00c7, code lost:
            r3 = r18;
            r18 = "MainPower";
            r6 = r19;
            r19 = "Power";
            r12 = r20;
            r20 = "BgPower";
            r8 = r21;
            r22 = r16;
            r16 = "Ct";
            r0 = r17;
            r17 = r22;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:0x0101, code lost:
            r17 = r3;
            r3 = r18;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x0106, code lost:
            r17 = r3;
            r3 = r18;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:55:0x011d, code lost:
            r18 = "MainPower";
            r6 = r19;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:56:0x0122, code lost:
            r18 = "MainPower";
            r6 = r19;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:60:0x013d, code lost:
            r19 = "Power";
            r12 = r20;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:61:0x0142, code lost:
            r19 = "Power";
            r12 = r20;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:65:0x0161, code lost:
            r20 = "BgPower";
            r8 = r21;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:66:0x0166, code lost:
            r20 = "BgPower";
            r8 = r21;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:73:0x01a8, code lost:
            r2 = 65535;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:74:0x01a9, code lost:
            switch(r2) {
                case 0: goto L_0x03bf;
                case 1: goto L_0x039f;
                case 2: goto L_0x037f;
                case 3: goto L_0x0364;
                case 4: goto L_0x0349;
                case 5: goto L_0x032c;
                case 6: goto L_0x0311;
                case 7: goto L_0x02f6;
                case 8: goto L_0x02db;
                case 9: goto L_0x02c0;
                case 10: goto L_0x02a5;
                case 11: goto L_0x028a;
                case 12: goto L_0x026f;
                case 13: goto L_0x0254;
                case 14: goto L_0x0239;
                case 15: goto L_0x021c;
                case 16: goto L_0x0201;
                case 17: goto L_0x01e6;
                case 18: goto L_0x01cb;
                case 19: goto L_0x01b0;
                default: goto L_0x01ac;
            };
         */
        /* JADX WARNING: Code restructure failed: missing block: B:75:0x01ac, code lost:
            r6 = r23;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:76:0x01b0, code lost:
            r2 = r24;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:77:0x01ba, code lost:
            if (r2.getProperty(r6).isValueValid() == false) goto L_0x01ac;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:78:0x01bc, code lost:
            r23.f16139a.mo28499s((java.lang.Long) r2.getValue(r6));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:79:0x01cb, code lost:
            r6 = r23;
            r2 = r24;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:80:0x01d7, code lost:
            if (r2.getProperty("BgFlowing").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:81:0x01d9, code lost:
            r6.f16139a.mo28500t((java.lang.Long) r2.getValue("BgFlowing"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:82:0x01e6, code lost:
            r6 = r23;
            r2 = r24;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:83:0x01f2, code lost:
            if (r2.getProperty("Flowing").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:84:0x01f4, code lost:
            r6.f16139a.mo28483c((java.lang.Long) r2.getValue("Flowing"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:85:0x0201, code lost:
            r6 = r23;
            r2 = r24;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:86:0x020d, code lost:
            if (r2.getProperty("BgRgb").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:87:0x020f, code lost:
            r6.f16139a.mo28494n((java.lang.Long) r2.getValue("BgRgb"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:88:0x021c, code lost:
            r6 = r23;
            r2 = r24;
            r4 = r17;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:89:0x022a, code lost:
            if (r2.getProperty(r4).isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:90:0x022c, code lost:
            r6.f16139a.mo28493m((java.lang.Long) r2.getValue(r4));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:91:0x0239, code lost:
            r6 = r23;
            r2 = r24;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:92:0x0245, code lost:
            if (r2.getProperty(r3).isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:93:0x0247, code lost:
            r6.f16139a.mo28489i((java.lang.String) r2.getValue(r3));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:94:0x0254, code lost:
            r6 = r23;
            r2 = r24;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:95:0x0260, code lost:
            if (r2.getProperty(r0).isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:96:0x0262, code lost:
            r6.f16139a.mo28491k((java.lang.Long) r2.getValue(r0));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:97:0x026f, code lost:
            r6 = r23;
            r2 = r24;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:98:0x027b, code lost:
            if (r2.getProperty("onFromPower").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:99:0x027d, code lost:
            r6.f16139a.mo28486f((java.lang.Long) r2.getValue("onFromPower"));
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onPropertyChanged(com.miot.common.device.invocation.PropertyInfo r24, java.lang.String r25) {
            /*
                r23 = this;
                r0 = r23
                r1 = r24
                r2 = r25
                int r3 = r25.hashCode()
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
                switch(r3) {
                    case -2117953292: goto L_0x0189;
                    case -2017000513: goto L_0x016b;
                    case -2002016140: goto L_0x0147;
                    case -1616019574: goto L_0x0127;
                    case -1331143373: goto L_0x010b;
                    case -770908584: goto L_0x00f3;
                    case -80340154: goto L_0x00df;
                    case 2193: goto L_0x00c0;
                    case 2067382: goto L_0x00b8;
                    case 35911772: goto L_0x00af;
                    case 64102952: goto L_0x00a6;
                    case 77306085: goto L_0x009e;
                    case 880790796: goto L_0x0096;
                    case 898856916: goto L_0x008d;
                    case 986784719: goto L_0x0084;
                    case 1471809440: goto L_0x007c;
                    case 1611821756: goto L_0x0073;
                    case 1738956460: goto L_0x006b;
                    case 1820079769: goto L_0x0062;
                    case 1998035738: goto L_0x0059;
                    default: goto L_0x0041;
                }
            L_0x0041:
                r3 = r18
                r18 = r6
                r6 = r19
                r19 = r12
                r12 = r20
                r20 = r8
                r8 = r21
                r22 = r16
                r16 = r0
                r0 = r17
                r17 = r22
                goto L_0x01a8
            L_0x0059:
                boolean r2 = r2.equals(r4)
                if (r2 == 0) goto L_0x0041
                r2 = 3
                goto L_0x00c7
            L_0x0062:
                boolean r2 = r2.equals(r5)
                if (r2 == 0) goto L_0x0041
                r2 = 9
                goto L_0x00c7
            L_0x006b:
                boolean r2 = r2.equals(r6)
                if (r2 == 0) goto L_0x0041
                r2 = 0
                goto L_0x00c7
            L_0x0073:
                boolean r2 = r2.equals(r7)
                if (r2 == 0) goto L_0x0041
                r2 = 10
                goto L_0x00c7
            L_0x007c:
                boolean r2 = r2.equals(r8)
                if (r2 == 0) goto L_0x0041
                r2 = 2
                goto L_0x00c7
            L_0x0084:
                boolean r2 = r2.equals(r9)
                if (r2 == 0) goto L_0x0041
                r2 = 18
                goto L_0x00c7
            L_0x008d:
                boolean r2 = r2.equals(r10)
                if (r2 == 0) goto L_0x0041
                r2 = 17
                goto L_0x00c7
            L_0x0096:
                boolean r2 = r2.equals(r11)
                if (r2 == 0) goto L_0x0041
                r2 = 7
                goto L_0x00c7
            L_0x009e:
                boolean r2 = r2.equals(r12)
                if (r2 == 0) goto L_0x0041
                r2 = 1
                goto L_0x00c7
            L_0x00a6:
                boolean r2 = r2.equals(r13)
                if (r2 == 0) goto L_0x0041
                r2 = 16
                goto L_0x00c7
            L_0x00af:
                boolean r2 = r2.equals(r14)
                if (r2 == 0) goto L_0x0041
                r2 = 12
                goto L_0x00c7
            L_0x00b8:
                boolean r2 = r2.equals(r15)
                if (r2 == 0) goto L_0x0041
                r2 = 6
                goto L_0x00c7
            L_0x00c0:
                boolean r2 = r2.equals(r0)
                if (r2 == 0) goto L_0x0041
                r2 = 5
            L_0x00c7:
                r3 = r18
                r18 = r6
                r6 = r19
                r19 = r12
                r12 = r20
                r20 = r8
                r8 = r21
                r22 = r16
                r16 = r0
                r0 = r17
                r17 = r22
                goto L_0x01a9
            L_0x00df:
                r3 = r16
                boolean r2 = r2.equals(r3)
                if (r2 == 0) goto L_0x00ee
                r2 = 15
                r16 = r0
                r0 = r17
                goto L_0x0101
            L_0x00ee:
                r16 = r0
                r0 = r17
                goto L_0x0106
            L_0x00f3:
                r3 = r16
                r16 = r0
                r0 = r17
                boolean r2 = r2.equals(r0)
                if (r2 == 0) goto L_0x0106
                r2 = 13
            L_0x0101:
                r17 = r3
                r3 = r18
                goto L_0x011d
            L_0x0106:
                r17 = r3
                r3 = r18
                goto L_0x0122
            L_0x010b:
                r3 = r18
                r22 = r16
                r16 = r0
                r0 = r17
                r17 = r22
                boolean r2 = r2.equals(r3)
                if (r2 == 0) goto L_0x0122
                r2 = 14
            L_0x011d:
                r18 = r6
                r6 = r19
                goto L_0x013d
            L_0x0122:
                r18 = r6
                r6 = r19
                goto L_0x0142
            L_0x0127:
                r3 = r18
                r18 = r6
                r6 = r19
                r22 = r16
                r16 = r0
                r0 = r17
                r17 = r22
                boolean r2 = r2.equals(r6)
                if (r2 == 0) goto L_0x0142
                r2 = 19
            L_0x013d:
                r19 = r12
                r12 = r20
                goto L_0x0161
            L_0x0142:
                r19 = r12
                r12 = r20
                goto L_0x0166
            L_0x0147:
                r3 = r18
                r18 = r6
                r6 = r19
                r19 = r12
                r12 = r20
                r22 = r16
                r16 = r0
                r0 = r17
                r17 = r22
                boolean r2 = r2.equals(r12)
                if (r2 == 0) goto L_0x0166
                r2 = 8
            L_0x0161:
                r20 = r8
                r8 = r21
                goto L_0x01a9
            L_0x0166:
                r20 = r8
                r8 = r21
                goto L_0x01a8
            L_0x016b:
                r3 = r18
                r18 = r6
                r6 = r19
                r19 = r12
                r12 = r20
                r20 = r8
                r8 = r21
                r22 = r16
                r16 = r0
                r0 = r17
                r17 = r22
                boolean r2 = r2.equals(r8)
                if (r2 == 0) goto L_0x01a8
                r2 = 4
                goto L_0x01a9
            L_0x0189:
                r3 = r18
                r18 = r6
                r6 = r19
                r19 = r12
                r12 = r20
                r20 = r8
                r8 = r21
                r22 = r16
                r16 = r0
                r0 = r17
                r17 = r22
                boolean r2 = r2.equals(r1)
                if (r2 == 0) goto L_0x01a8
                r2 = 11
                goto L_0x01a9
            L_0x01a8:
                r2 = -1
            L_0x01a9:
                switch(r2) {
                    case 0: goto L_0x03bf;
                    case 1: goto L_0x039f;
                    case 2: goto L_0x037f;
                    case 3: goto L_0x0364;
                    case 4: goto L_0x0349;
                    case 5: goto L_0x032c;
                    case 6: goto L_0x0311;
                    case 7: goto L_0x02f6;
                    case 8: goto L_0x02db;
                    case 9: goto L_0x02c0;
                    case 10: goto L_0x02a5;
                    case 11: goto L_0x028a;
                    case 12: goto L_0x026f;
                    case 13: goto L_0x0254;
                    case 14: goto L_0x0239;
                    case 15: goto L_0x021c;
                    case 16: goto L_0x0201;
                    case 17: goto L_0x01e6;
                    case 18: goto L_0x01cb;
                    case 19: goto L_0x01b0;
                    default: goto L_0x01ac;
                }
            L_0x01ac:
                r6 = r23
                goto L_0x03de
            L_0x01b0:
                r2 = r24
                com.miot.common.property.Property r0 = r2.getProperty(r6)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x01ac
                java.lang.Object r0 = r2.getValue(r6)
                java.lang.Long r0 = (java.lang.Long) r0
                r6 = r23
                com.yeelight.yeelib.device.xiaomi.Ceiling4Service$x1 r1 = r6.f16139a
                r1.mo28499s(r0)
                goto L_0x03de
            L_0x01cb:
                r6 = r23
                r2 = r24
                com.miot.common.property.Property r0 = r2.getProperty(r9)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x03de
                java.lang.Object r0 = r2.getValue(r9)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Ceiling4Service$x1 r1 = r6.f16139a
                r1.mo28500t(r0)
                goto L_0x03de
            L_0x01e6:
                r6 = r23
                r2 = r24
                com.miot.common.property.Property r0 = r2.getProperty(r10)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x03de
                java.lang.Object r0 = r2.getValue(r10)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Ceiling4Service$x1 r1 = r6.f16139a
                r1.mo28483c(r0)
                goto L_0x03de
            L_0x0201:
                r6 = r23
                r2 = r24
                com.miot.common.property.Property r0 = r2.getProperty(r13)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x03de
                java.lang.Object r0 = r2.getValue(r13)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Ceiling4Service$x1 r1 = r6.f16139a
                r1.mo28494n(r0)
                goto L_0x03de
            L_0x021c:
                r6 = r23
                r2 = r24
                r4 = r17
                com.miot.common.property.Property r0 = r2.getProperty(r4)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x03de
                java.lang.Object r0 = r2.getValue(r4)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Ceiling4Service$x1 r1 = r6.f16139a
                r1.mo28493m(r0)
                goto L_0x03de
            L_0x0239:
                r6 = r23
                r2 = r24
                com.miot.common.property.Property r0 = r2.getProperty(r3)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x03de
                java.lang.Object r0 = r2.getValue(r3)
                java.lang.String r0 = (java.lang.String) r0
                com.yeelight.yeelib.device.xiaomi.Ceiling4Service$x1 r1 = r6.f16139a
                r1.mo28489i(r0)
                goto L_0x03de
            L_0x0254:
                r6 = r23
                r2 = r24
                com.miot.common.property.Property r1 = r2.getProperty(r0)
                boolean r1 = r1.isValueValid()
                if (r1 == 0) goto L_0x03de
                java.lang.Object r0 = r2.getValue(r0)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Ceiling4Service$x1 r1 = r6.f16139a
                r1.mo28491k(r0)
                goto L_0x03de
            L_0x026f:
                r6 = r23
                r2 = r24
                com.miot.common.property.Property r0 = r2.getProperty(r14)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x03de
                java.lang.Object r0 = r2.getValue(r14)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Ceiling4Service$x1 r1 = r6.f16139a
                r1.mo28486f(r0)
                goto L_0x03de
            L_0x028a:
                r6 = r23
                r2 = r24
                com.miot.common.property.Property r0 = r2.getProperty(r1)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x03de
                java.lang.Object r0 = r2.getValue(r1)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Ceiling4Service$x1 r1 = r6.f16139a
                r1.mo28484d(r0)
                goto L_0x03de
            L_0x02a5:
                r6 = r23
                r2 = r24
                com.miot.common.property.Property r0 = r2.getProperty(r7)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x03de
                java.lang.Object r0 = r2.getValue(r7)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Ceiling4Service$x1 r1 = r6.f16139a
                r1.mo28487g(r0)
                goto L_0x03de
            L_0x02c0:
                r6 = r23
                r2 = r24
                com.miot.common.property.Property r0 = r2.getProperty(r5)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x03de
                java.lang.Object r0 = r2.getValue(r5)
                java.lang.String r0 = (java.lang.String) r0
                com.yeelight.yeelib.device.xiaomi.Ceiling4Service$x1 r1 = r6.f16139a
                r1.mo28498r(r0)
                goto L_0x03de
            L_0x02db:
                r6 = r23
                r2 = r24
                com.miot.common.property.Property r0 = r2.getProperty(r12)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x03de
                java.lang.Object r0 = r2.getValue(r12)
                java.lang.String r0 = (java.lang.String) r0
                com.yeelight.yeelib.device.xiaomi.Ceiling4Service$x1 r1 = r6.f16139a
                r1.mo28485e(r0)
                goto L_0x03de
            L_0x02f6:
                r6 = r23
                r2 = r24
                com.miot.common.property.Property r0 = r2.getProperty(r11)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x03de
                java.lang.Object r0 = r2.getValue(r11)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Ceiling4Service$x1 r1 = r6.f16139a
                r1.mo28482b(r0)
                goto L_0x03de
            L_0x0311:
                r6 = r23
                r2 = r24
                com.miot.common.property.Property r0 = r2.getProperty(r15)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x03de
                java.lang.Object r0 = r2.getValue(r15)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Ceiling4Service$x1 r1 = r6.f16139a
                r1.mo28490j(r0)
                goto L_0x03de
            L_0x032c:
                r6 = r23
                r2 = r24
                r0 = r16
                com.miot.common.property.Property r1 = r2.getProperty(r0)
                boolean r1 = r1.isValueValid()
                if (r1 == 0) goto L_0x03de
                java.lang.Object r0 = r2.getValue(r0)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Ceiling4Service$x1 r1 = r6.f16139a
                r1.mo28488h(r0)
                goto L_0x03de
            L_0x0349:
                r6 = r23
                r2 = r24
                com.miot.common.property.Property r0 = r2.getProperty(r8)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x03de
                java.lang.Object r0 = r2.getValue(r8)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Ceiling4Service$x1 r1 = r6.f16139a
                r1.mo28492l(r0)
                goto L_0x03de
            L_0x0364:
                r6 = r23
                r2 = r24
                r0 = r4
                com.miot.common.property.Property r1 = r2.getProperty(r0)
                boolean r1 = r1.isValueValid()
                if (r1 == 0) goto L_0x03de
                java.lang.Object r0 = r2.getValue(r0)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Ceiling4Service$x1 r1 = r6.f16139a
                r1.mo28481a(r0)
                goto L_0x03de
            L_0x037f:
                r6 = r23
                r2 = r24
                r0 = r20
                com.miot.common.property.Property r1 = r2.getProperty(r0)
                boolean r1 = r1.isValueValid()
                if (r1 == 0) goto L_0x03de
                java.lang.Object r0 = r2.getValue(r0)
                java.lang.String r0 = (java.lang.String) r0
                com.yeelight.yeelib.device.xiaomi.Ceiling4Service$x0 r0 = com.yeelight.yeelib.device.xiaomi.Ceiling4Service.C8193x0.valueOf(r0)
                com.yeelight.yeelib.device.xiaomi.Ceiling4Service$x1 r1 = r6.f16139a
                r1.mo28497q(r0)
                goto L_0x03de
            L_0x039f:
                r6 = r23
                r2 = r24
                r0 = r19
                com.miot.common.property.Property r1 = r2.getProperty(r0)
                boolean r1 = r1.isValueValid()
                if (r1 == 0) goto L_0x03de
                java.lang.Object r0 = r2.getValue(r0)
                java.lang.String r0 = (java.lang.String) r0
                com.yeelight.yeelib.device.xiaomi.Ceiling4Service$w1 r0 = com.yeelight.yeelib.device.xiaomi.Ceiling4Service.C8191w1.valueOf(r0)
                com.yeelight.yeelib.device.xiaomi.Ceiling4Service$x1 r1 = r6.f16139a
                r1.mo28495o(r0)
                goto L_0x03de
            L_0x03bf:
                r6 = r23
                r2 = r24
                r0 = r18
                com.miot.common.property.Property r1 = r2.getProperty(r0)
                boolean r1 = r1.isValueValid()
                if (r1 == 0) goto L_0x03de
                java.lang.Object r0 = r2.getValue(r0)
                java.lang.String r0 = (java.lang.String) r0
                com.yeelight.yeelib.device.xiaomi.Ceiling4Service$v1 r0 = com.yeelight.yeelib.device.xiaomi.Ceiling4Service.C8188v1.valueOf(r0)
                com.yeelight.yeelib.device.xiaomi.Ceiling4Service$x1 r1 = r6.f16139a
                r1.mo28496p(r0)
            L_0x03de:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.xiaomi.Ceiling4Service.C8186v.onPropertyChanged(com.miot.common.device.invocation.PropertyInfo, java.lang.String):void");
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$v0 */
    class C8187v0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8146h1 f16140a;

        C8187v0(Ceiling4Service ceiling4Service, C8146h1 h1Var) {
            this.f16140a = h1Var;
        }

        public void onFailed(int i, String str) {
            this.f16140a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Bright");
            if (property.isValueValid()) {
                this.f16140a.mo29688a((Long) propertyInfo.getValue("Bright"));
                return;
            }
            C8146h1 h1Var = this.f16140a;
            h1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$v1 */
    public enum C8188v1 {
        undefined,
        on,
        off
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$w */
    class C8189w implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16145a;

        C8189w(Ceiling4Service ceiling4Service, CompletionHandler completionHandler) {
            this.f16145a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16145a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16145a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$w0 */
    class C8190w0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8125a1 f16146a;

        C8190w0(Ceiling4Service ceiling4Service, C8125a1 a1Var) {
            this.f16146a = a1Var;
        }

        public void onFailed(int i, String str) {
            this.f16146a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("BgBright");
            if (property.isValueValid()) {
                this.f16146a.mo29674a((Long) propertyInfo.getValue("BgBright"));
                return;
            }
            C8125a1 a1Var = this.f16146a;
            a1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$w1 */
    public enum C8191w1 {
        undefined,
        on,
        off
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$x */
    class C8192x implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16151a;

        C8192x(Ceiling4Service ceiling4Service, CompletionHandler completionHandler) {
            this.f16151a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16151a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16151a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$x0 */
    public enum C8193x0 {
        undefined,
        on,
        off
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$x1 */
    public interface C8194x1 {
        /* renamed from: a */
        void mo28481a(Long l);

        /* renamed from: b */
        void mo28482b(Long l);

        /* renamed from: c */
        void mo28483c(Long l);

        /* renamed from: d */
        void mo28484d(Long l);

        /* renamed from: e */
        void mo28485e(String str);

        /* renamed from: f */
        void mo28486f(Long l);

        /* renamed from: g */
        void mo28487g(Long l);

        /* renamed from: h */
        void mo28488h(Long l);

        /* renamed from: i */
        void mo28489i(String str);

        /* renamed from: j */
        void mo28490j(Long l);

        /* renamed from: k */
        void mo28491k(Long l);

        /* renamed from: l */
        void mo28492l(Long l);

        /* renamed from: m */
        void mo28493m(Long l);

        /* renamed from: n */
        void mo28494n(Long l);

        /* renamed from: o */
        void mo28495o(C8191w1 w1Var);

        /* renamed from: p */
        void mo28496p(C8188v1 v1Var);

        /* renamed from: q */
        void mo28497q(C8193x0 x0Var);

        /* renamed from: r */
        void mo28498r(String str);

        /* renamed from: s */
        void mo28499s(Long l);

        /* renamed from: t */
        void mo28500t(Long l);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$y */
    class C8195y implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16156a;

        C8195y(Ceiling4Service ceiling4Service, CompletionHandler completionHandler) {
            this.f16156a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16156a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16156a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$y0 */
    public enum C8196y0 {
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

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$z */
    class C8197z implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16168a;

        C8197z(Ceiling4Service ceiling4Service, CompletionHandler completionHandler) {
            this.f16168a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16168a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16168a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling4Service$z0 */
    public enum C8198z0 {
        undefined,
        smooth,
        sudden
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
                MiotManager.getDeviceManipulator().invoke(create, new C8192x(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8151j0(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getBgBright(C8125a1 a1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "BgBright"), new C8190w0(this, a1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getBgCt(C8128b1 b1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "BgCt"), new C8126b(this, b1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getBgFlowParams(C8131c1 c1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "BgFlowParams"), new C8135e(this, c1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getBgFlowing(C8134d1 d1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "BgFlowing"), new C8165o(this, d1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getBgPower(C8137e1 e1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "BgPower"), new C8184u0(this, e1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getBgProact(C8140f1 f1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "BgProact"), new C8168p(this, f1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getBgRgb(C8143g1 g1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "BgRgb"), new C8159m(this, g1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getBright(C8146h1 h1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Bright"), new C8187v0(this, h1Var));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8172q0(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getCt(C8149i1 i1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Ct"), new C8123a(this, i1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getDelayOff(C8152j1 j1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "DelayOff"), new C8129c(this, j1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowParams(C8155k1 k1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "FlowParams"), new C8132d(this, k1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowing(C8158l1 l1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Flowing"), new C8162n(this, l1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getLanMode(C8161m1 m1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "LanMode"), new C8138f(this, m1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getMainPower(C8164n1 n1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "MainPower"), new C8178s0(this, n1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getMiBandSleep(C8167o1 o1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "MiBandSleep"), new C8156l(this, o1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getNLBright(C8170p1 p1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "NLBright"), new C8147i(this, p1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getNightTimeInfo(C8173q1 q1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "NightTimeInfo"), new C8150j(this, q1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getPower(C8176r1 r1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Power"), new C8181t0(this, r1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getProperties(C8179s1 s1Var) {
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
            MiotManager.getDeviceManipulator().readProperty(create, new C8175r0(this, s1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getSaveState(C8182t1 t1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "SaveState"), new C8141g(this, t1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getonFromPower(C8185u1 u1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "onFromPower"), new C8144h(this, u1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void openBgWithMode(C8193x0 x0Var, C8198z0 z0Var, Long l, Long l2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "openBgWithMode");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("BgPower", x0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Effect", z0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Duration", l)) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("Mode", l2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C8189w(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void openWithMode(C8188v1 v1Var, C8198z0 z0Var, Long l, Long l2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "openWithMode");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("MainPower", v1Var.toString())) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Effect", z0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Duration", l)) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("Mode", l2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C8180t(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8154k0(this, completionHandler));
                return;
            }
            throw new MiotException("actionInfo is null");
        }
        throw new MiotException("device not configurated connection");
    }

    public void sendCmd(C8196y0 y0Var, String str, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "sendCmd");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("CmdKey", y0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("CmdValue", str)) {
                MiotManager.getDeviceManipulator().invoke(create, new C8124a0(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setBgBright(Long l, C8198z0 z0Var, Long l2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setBgBright");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("BgBright", l)) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Effect", z0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("Duration", l2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C8145h0(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setBgCt(Long l, C8198z0 z0Var, Long l2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setBgCt");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("BgCt", l)) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Effect", z0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("Duration", l2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C8195y(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8136e0(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setBgPower(C8193x0 x0Var, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setBgPower");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (create.setArgumentValue("BgPower", x0Var.toString())) {
                MiotManager.getDeviceManipulator().invoke(create, new C8171q(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setBgRgb(Long l, C8198z0 z0Var, Long l2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setBgRgb");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("BgRgb", l)) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Effect", z0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("Duration", l2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C8177s(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8148i0(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setBright(Long l, C8198z0 z0Var, Long l2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setBright");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("Bright", l)) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Effect", z0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("Duration", l2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C8174r(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setCt(Long l, C8198z0 z0Var, Long l2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setCt");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("Ct", l)) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Effect", z0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("Duration", l2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C8169p0(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8166o0(this, completionHandler));
                return;
            }
            throw new MiotException("actionInfo is null");
        }
        throw new MiotException("device not configurated connection");
    }

    public void setDevPower(C8191w1 w1Var, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setDevPower");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (create.setArgumentValue("Power", w1Var.toString())) {
                MiotManager.getDeviceManipulator().invoke(create, new C8160m0(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8130c0(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8197z(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setPower(C8191w1 w1Var, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setPower");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (create.setArgumentValue("Power", w1Var.toString())) {
                MiotManager.getDeviceManipulator().invoke(create, new C8183u(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8157l0(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8133d0(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8127b0(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8139f0(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void subscribeNotifications(CompletionHandler completionHandler, C8194x1 x1Var) {
        if (completionHandler == null) {
            throw new IllegalArgumentException("handler is null");
        } else if (x1Var != null) {
            PropertyInfo create = PropertyInfoFactory.create(getService());
            for (Property next : getService().getProperties()) {
                if (next.getDefinition().isNotifiable()) {
                    create.addProperty(next);
                }
            }
            MiotManager.getDeviceManipulator().addPropertyChangedListener(create, new C8153k(this, completionHandler), new C8186v(this, x1Var));
        } else {
            throw new IllegalArgumentException("listener is null");
        }
    }

    public void toggle(CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "toggle");
            if (create != null) {
                MiotManager.getDeviceManipulator().invoke(create, new C8163n0(this, completionHandler));
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
            MiotManager.getDeviceManipulator().removePropertyChangedListener(create, new C8142g0(this, completionHandler));
            return;
        }
        throw new IllegalArgumentException("handler is null");
    }
}
