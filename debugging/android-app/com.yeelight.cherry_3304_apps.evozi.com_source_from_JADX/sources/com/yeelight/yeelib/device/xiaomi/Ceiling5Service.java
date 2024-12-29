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

public class Ceiling5Service extends AbstractService {
    public static final String ACTION_addCron = "addCron";
    public static final String ACTION_delCron = "delCron";
    public static final String ACTION_getCron = "getCron";
    public static final String ACTION_openWithMode = "openWithMode";
    public static final String ACTION_restore = "restore";
    public static final String ACTION_sendCmd = "sendCmd";
    public static final String ACTION_setBright = "setBright";
    public static final String ACTION_setCt = "setCt";
    public static final String ACTION_setDefault = "setDefault";
    public static final String ACTION_setFlowScene = "setFlowScene";
    public static final String ACTION_setNLScene = "setNLScene";
    public static final String ACTION_setPower = "setPower";
    public static final String ACTION_setScene = "setScene";
    public static final String ACTION_setadjust = "setadjust";
    public static final String ACTION_toggle = "toggle";
    public static final String PROPERTY_Bright = "Bright";
    public static final String PROPERTY_CmdKey = "CmdKey";
    public static final String PROPERTY_CmdValue = "CmdValue";
    public static final String PROPERTY_CronType = "CronType";
    public static final String PROPERTY_Ct = "Ct";
    public static final String PROPERTY_DelayOff = "DelayOff";
    public static final String PROPERTY_Duration = "Duration";
    public static final String PROPERTY_Effect = "Effect";
    public static final String PROPERTY_FlowParams = "FlowParams";
    public static final String PROPERTY_Flowing = "Flowing";
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
    private static final String TAG = "Ceiling5Service";
    private AbstractDevice mDevice = null;

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling5Service$a */
    class C8199a implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8234r0 f16173a;

        C8199a(Ceiling5Service ceiling5Service, C8234r0 r0Var) {
            this.f16173a = r0Var;
        }

        public void onFailed(int i, String str) {
            this.f16173a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("SaveState");
            if (property.isValueValid()) {
                this.f16173a.mo29762a((Long) propertyInfo.getValue("SaveState"));
                return;
            }
            C8234r0 r0Var = this.f16173a;
            r0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling5Service$a0 */
    class C8200a0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8230p0 f16174a;

        C8200a0(Ceiling5Service ceiling5Service, C8230p0 p0Var) {
            this.f16174a = p0Var;
        }

        public void onFailed(int i, String str) {
            this.f16174a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Power");
            if (property.isValueValid()) {
                this.f16174a.mo29760a(C8240u0.valueOf((String) propertyInfo.getValue("Power")));
                return;
            }
            C8230p0 p0Var = this.f16174a;
            p0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling5Service$b */
    class C8201b implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8238t0 f16175a;

        C8201b(Ceiling5Service ceiling5Service, C8238t0 t0Var) {
            this.f16175a = t0Var;
        }

        public void onFailed(int i, String str) {
            this.f16175a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("onFromPower");
            if (property.isValueValid()) {
                this.f16175a.mo29766a((Long) propertyInfo.getValue("onFromPower"));
                return;
            }
            C8238t0 t0Var = this.f16175a;
            t0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling5Service$b0 */
    class C8202b0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8214h0 f16176a;

        C8202b0(Ceiling5Service ceiling5Service, C8214h0 h0Var) {
            this.f16176a = h0Var;
        }

        public void onFailed(int i, String str) {
            this.f16176a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Bright");
            if (property.isValueValid()) {
                this.f16176a.mo29744a((Long) propertyInfo.getValue("Bright"));
                return;
            }
            C8214h0 h0Var = this.f16176a;
            h0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling5Service$c */
    class C8203c implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8226n0 f16177a;

        C8203c(Ceiling5Service ceiling5Service, C8226n0 n0Var) {
            this.f16177a = n0Var;
        }

        public void onFailed(int i, String str) {
            this.f16177a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("NLBright");
            if (property.isValueValid()) {
                this.f16177a.mo29756a((Long) propertyInfo.getValue("NLBright"));
                return;
            }
            C8226n0 n0Var = this.f16177a;
            n0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling5Service$c0 */
    class C8204c0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8216i0 f16178a;

        C8204c0(Ceiling5Service ceiling5Service, C8216i0 i0Var) {
            this.f16178a = i0Var;
        }

        public void onFailed(int i, String str) {
            this.f16178a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Ct");
            if (property.isValueValid()) {
                this.f16178a.mo29746a((Long) propertyInfo.getValue("Ct"));
                return;
            }
            C8216i0 i0Var = this.f16178a;
            i0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling5Service$d */
    class C8205d implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8228o0 f16179a;

        C8205d(Ceiling5Service ceiling5Service, C8228o0 o0Var) {
            this.f16179a = o0Var;
        }

        public void onFailed(int i, String str) {
            this.f16179a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("NightTimeInfo");
            if (property.isValueValid()) {
                this.f16179a.onSucceed((String) propertyInfo.getValue("NightTimeInfo"));
                return;
            }
            C8228o0 o0Var = this.f16179a;
            o0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling5Service$d0 */
    class C8206d0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8218j0 f16180a;

        C8206d0(Ceiling5Service ceiling5Service, C8218j0 j0Var) {
            this.f16180a = j0Var;
        }

        public void onFailed(int i, String str) {
            this.f16180a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("DelayOff");
            if (property.isValueValid()) {
                this.f16180a.mo29748a((Long) propertyInfo.getValue("DelayOff"));
                return;
            }
            C8218j0 j0Var = this.f16180a;
            j0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling5Service$e */
    class C8207e implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8224m0 f16181a;

        C8207e(Ceiling5Service ceiling5Service, C8224m0 m0Var) {
            this.f16181a = m0Var;
        }

        public void onFailed(int i, String str) {
            this.f16181a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("MiBandSleep");
            if (property.isValueValid()) {
                this.f16181a.mo29754a((Long) propertyInfo.getValue("MiBandSleep"));
                return;
            }
            C8224m0 m0Var = this.f16181a;
            m0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling5Service$e0 */
    class C8208e0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8220k0 f16182a;

        C8208e0(Ceiling5Service ceiling5Service, C8220k0 k0Var) {
            this.f16182a = k0Var;
        }

        public void onFailed(int i, String str) {
            this.f16182a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("FlowParams");
            if (property.isValueValid()) {
                this.f16182a.onSucceed((String) propertyInfo.getValue("FlowParams"));
                return;
            }
            C8220k0 k0Var = this.f16182a;
            k0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling5Service$f */
    class C8209f implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8222l0 f16183a;

        C8209f(Ceiling5Service ceiling5Service, C8222l0 l0Var) {
            this.f16183a = l0Var;
        }

        public void onFailed(int i, String str) {
            this.f16183a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Flowing");
            if (property.isValueValid()) {
                this.f16183a.mo29752a((Long) propertyInfo.getValue("Flowing"));
                return;
            }
            C8222l0 l0Var = this.f16183a;
            l0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling5Service$f0 */
    public enum C8210f0 {
        undefined,
        cfg_pomodoro,
        cfg_lan_ctrl,
        cfg_save_state,
        nighttime,
        nightlight,
        miband_sleep,
        pseudo_beacon,
        cfg_init_power,
        cfg_smart_switch
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling5Service$g */
    class C8211g implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8236s0 f16195a;

        C8211g(Ceiling5Service ceiling5Service, C8236s0 s0Var) {
            this.f16195a = s0Var;
        }

        public void onFailed(int i, String str) {
            this.f16195a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("SmartSwitch");
            if (property.isValueValid()) {
                this.f16195a.mo29764a((Long) propertyInfo.getValue("SmartSwitch"));
                return;
            }
            C8236s0 s0Var = this.f16195a;
            s0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling5Service$g0 */
    public enum C8212g0 {
        undefined,
        smooth,
        sudden
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling5Service$h */
    class C8213h implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16200a;

        C8213h(Ceiling5Service ceiling5Service, CompletionHandler completionHandler) {
            this.f16200a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16200a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16200a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling5Service$h0 */
    public interface C8214h0 {
        /* renamed from: a */
        void mo29744a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling5Service$i */
    class C8215i implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16201a;

        C8215i(Ceiling5Service ceiling5Service, CompletionHandler completionHandler) {
            this.f16201a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16201a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16201a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling5Service$i0 */
    public interface C8216i0 {
        /* renamed from: a */
        void mo29746a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling5Service$j */
    class C8217j implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16202a;

        C8217j(Ceiling5Service ceiling5Service, CompletionHandler completionHandler) {
            this.f16202a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16202a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16202a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling5Service$j0 */
    public interface C8218j0 {
        /* renamed from: a */
        void mo29748a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling5Service$k */
    class C8219k implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16203a;

        C8219k(Ceiling5Service ceiling5Service, CompletionHandler completionHandler) {
            this.f16203a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16203a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f16203a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling5Service$k0 */
    public interface C8220k0 {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling5Service$l */
    class C8221l implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16204a;

        C8221l(Ceiling5Service ceiling5Service, CompletionHandler completionHandler) {
            this.f16204a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16204a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16204a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling5Service$l0 */
    public interface C8222l0 {
        /* renamed from: a */
        void mo29752a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling5Service$m */
    class C8223m implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16205a;

        C8223m(Ceiling5Service ceiling5Service, CompletionHandler completionHandler) {
            this.f16205a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16205a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16205a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling5Service$m0 */
    public interface C8224m0 {
        /* renamed from: a */
        void mo29754a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling5Service$n */
    class C8225n implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16206a;

        C8225n(Ceiling5Service ceiling5Service, CompletionHandler completionHandler) {
            this.f16206a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16206a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16206a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling5Service$n0 */
    public interface C8226n0 {
        /* renamed from: a */
        void mo29756a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling5Service$o */
    class C8227o implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16207a;

        C8227o(Ceiling5Service ceiling5Service, CompletionHandler completionHandler) {
            this.f16207a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16207a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16207a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling5Service$o0 */
    public interface C8228o0 {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling5Service$p */
    class C8229p implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16208a;

        C8229p(Ceiling5Service ceiling5Service, CompletionHandler completionHandler) {
            this.f16208a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16208a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16208a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling5Service$p0 */
    public interface C8230p0 {
        /* renamed from: a */
        void mo29760a(C8240u0 u0Var);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling5Service$q */
    class C8231q implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16209a;

        C8231q(Ceiling5Service ceiling5Service, CompletionHandler completionHandler) {
            this.f16209a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16209a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16209a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling5Service$q0 */
    public interface C8232q0 {
        /* renamed from: a */
        void mo28530a(C8240u0 u0Var, Long l, Long l2, Long l3, String str, Long l4, Long l5, Long l6, String str2, Long l7, Long l8, Long l9);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling5Service$r */
    class C8233r implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16210a;

        C8233r(Ceiling5Service ceiling5Service, CompletionHandler completionHandler) {
            this.f16210a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16210a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16210a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling5Service$r0 */
    public interface C8234r0 {
        /* renamed from: a */
        void mo29762a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling5Service$s */
    class C8235s implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16211a;

        C8235s(Ceiling5Service ceiling5Service, CompletionHandler completionHandler) {
            this.f16211a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16211a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16211a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling5Service$s0 */
    public interface C8236s0 {
        /* renamed from: a */
        void mo29764a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling5Service$t */
    class C8237t implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16212a;

        C8237t(Ceiling5Service ceiling5Service, CompletionHandler completionHandler) {
            this.f16212a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16212a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16212a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling5Service$t0 */
    public interface C8238t0 {
        /* renamed from: a */
        void mo29766a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling5Service$u */
    class C8239u implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16213a;

        C8239u(Ceiling5Service ceiling5Service, CompletionHandler completionHandler) {
            this.f16213a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16213a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16213a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling5Service$u0 */
    public enum C8240u0 {
        undefined,
        on,
        off
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling5Service$v */
    class C8241v implements DeviceManipulator.PropertyChangedListener {

        /* renamed from: a */
        final /* synthetic */ C8242v0 f16218a;

        C8241v(Ceiling5Service ceiling5Service, C8242v0 v0Var) {
            this.f16218a = v0Var;
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onPropertyChanged(com.miot.common.device.invocation.PropertyInfo r14, java.lang.String r15) {
            /*
                r13 = this;
                int r0 = r15.hashCode()
                java.lang.String r1 = "Bright"
                java.lang.String r2 = "SmartSwitch"
                java.lang.String r3 = "Flowing"
                java.lang.String r4 = "DelayOff"
                java.lang.String r5 = "Power"
                java.lang.String r6 = "onFromPower"
                java.lang.String r7 = "Ct"
                java.lang.String r8 = "MiBandSleep"
                java.lang.String r9 = "NLBright"
                java.lang.String r10 = "NightTimeInfo"
                java.lang.String r11 = "FlowParams"
                java.lang.String r12 = "SaveState"
                switch(r0) {
                    case -2117953292: goto L_0x007e;
                    case -2002016140: goto L_0x0076;
                    case -1331143373: goto L_0x006d;
                    case -770908584: goto L_0x0065;
                    case -80340154: goto L_0x005c;
                    case 2193: goto L_0x0054;
                    case 35911772: goto L_0x004c;
                    case 77306085: goto L_0x0044;
                    case 880790796: goto L_0x003c;
                    case 898856916: goto L_0x0033;
                    case 1179821629: goto L_0x002a;
                    case 1998035738: goto L_0x0021;
                    default: goto L_0x001f;
                }
            L_0x001f:
                goto L_0x0086
            L_0x0021:
                boolean r15 = r15.equals(r1)
                if (r15 == 0) goto L_0x0086
                r15 = 1
                goto L_0x0087
            L_0x002a:
                boolean r15 = r15.equals(r2)
                if (r15 == 0) goto L_0x0086
                r15 = 11
                goto L_0x0087
            L_0x0033:
                boolean r15 = r15.equals(r3)
                if (r15 == 0) goto L_0x0086
                r15 = 10
                goto L_0x0087
            L_0x003c:
                boolean r15 = r15.equals(r4)
                if (r15 == 0) goto L_0x0086
                r15 = 3
                goto L_0x0087
            L_0x0044:
                boolean r15 = r15.equals(r5)
                if (r15 == 0) goto L_0x0086
                r15 = 0
                goto L_0x0087
            L_0x004c:
                boolean r15 = r15.equals(r6)
                if (r15 == 0) goto L_0x0086
                r15 = 6
                goto L_0x0087
            L_0x0054:
                boolean r15 = r15.equals(r7)
                if (r15 == 0) goto L_0x0086
                r15 = 2
                goto L_0x0087
            L_0x005c:
                boolean r15 = r15.equals(r8)
                if (r15 == 0) goto L_0x0086
                r15 = 9
                goto L_0x0087
            L_0x0065:
                boolean r15 = r15.equals(r9)
                if (r15 == 0) goto L_0x0086
                r15 = 7
                goto L_0x0087
            L_0x006d:
                boolean r15 = r15.equals(r10)
                if (r15 == 0) goto L_0x0086
                r15 = 8
                goto L_0x0087
            L_0x0076:
                boolean r15 = r15.equals(r11)
                if (r15 == 0) goto L_0x0086
                r15 = 4
                goto L_0x0087
            L_0x007e:
                boolean r15 = r15.equals(r12)
                if (r15 == 0) goto L_0x0086
                r15 = 5
                goto L_0x0087
            L_0x0086:
                r15 = -1
            L_0x0087:
                switch(r15) {
                    case 0: goto L_0x0185;
                    case 1: goto L_0x016f;
                    case 2: goto L_0x0159;
                    case 3: goto L_0x0143;
                    case 4: goto L_0x012d;
                    case 5: goto L_0x0116;
                    case 6: goto L_0x00ff;
                    case 7: goto L_0x00e8;
                    case 8: goto L_0x00d1;
                    case 9: goto L_0x00ba;
                    case 10: goto L_0x00a3;
                    case 11: goto L_0x008c;
                    default: goto L_0x008a;
                }
            L_0x008a:
                goto L_0x019e
            L_0x008c:
                com.miot.common.property.Property r15 = r14.getProperty(r2)
                boolean r15 = r15.isValueValid()
                if (r15 == 0) goto L_0x019e
                java.lang.Object r14 = r14.getValue(r2)
                java.lang.Long r14 = (java.lang.Long) r14
                com.yeelight.yeelib.device.xiaomi.Ceiling5Service$v0 r15 = r13.f16218a
                r15.mo28529p(r14)
                goto L_0x019e
            L_0x00a3:
                com.miot.common.property.Property r15 = r14.getProperty(r3)
                boolean r15 = r15.isValueValid()
                if (r15 == 0) goto L_0x019e
                java.lang.Object r14 = r14.getValue(r3)
                java.lang.Long r14 = (java.lang.Long) r14
                com.yeelight.yeelib.device.xiaomi.Ceiling5Service$v0 r15 = r13.f16218a
                r15.mo28520c(r14)
                goto L_0x019e
            L_0x00ba:
                com.miot.common.property.Property r15 = r14.getProperty(r8)
                boolean r15 = r15.isValueValid()
                if (r15 == 0) goto L_0x019e
                java.lang.Object r14 = r14.getValue(r8)
                java.lang.Long r14 = (java.lang.Long) r14
                com.yeelight.yeelib.device.xiaomi.Ceiling5Service$v0 r15 = r13.f16218a
                r15.mo28528m(r14)
                goto L_0x019e
            L_0x00d1:
                com.miot.common.property.Property r15 = r14.getProperty(r10)
                boolean r15 = r15.isValueValid()
                if (r15 == 0) goto L_0x019e
                java.lang.Object r14 = r14.getValue(r10)
                java.lang.String r14 = (java.lang.String) r14
                com.yeelight.yeelib.device.xiaomi.Ceiling5Service$v0 r15 = r13.f16218a
                r15.mo28526i(r14)
                goto L_0x019e
            L_0x00e8:
                com.miot.common.property.Property r15 = r14.getProperty(r9)
                boolean r15 = r15.isValueValid()
                if (r15 == 0) goto L_0x019e
                java.lang.Object r14 = r14.getValue(r9)
                java.lang.Long r14 = (java.lang.Long) r14
                com.yeelight.yeelib.device.xiaomi.Ceiling5Service$v0 r15 = r13.f16218a
                r15.mo28527k(r14)
                goto L_0x019e
            L_0x00ff:
                com.miot.common.property.Property r15 = r14.getProperty(r6)
                boolean r15 = r15.isValueValid()
                if (r15 == 0) goto L_0x019e
                java.lang.Object r14 = r14.getValue(r6)
                java.lang.Long r14 = (java.lang.Long) r14
                com.yeelight.yeelib.device.xiaomi.Ceiling5Service$v0 r15 = r13.f16218a
                r15.mo28523f(r14)
                goto L_0x019e
            L_0x0116:
                com.miot.common.property.Property r15 = r14.getProperty(r12)
                boolean r15 = r15.isValueValid()
                if (r15 == 0) goto L_0x019e
                java.lang.Object r14 = r14.getValue(r12)
                java.lang.Long r14 = (java.lang.Long) r14
                com.yeelight.yeelib.device.xiaomi.Ceiling5Service$v0 r15 = r13.f16218a
                r15.mo28521d(r14)
                goto L_0x019e
            L_0x012d:
                com.miot.common.property.Property r15 = r14.getProperty(r11)
                boolean r15 = r15.isValueValid()
                if (r15 == 0) goto L_0x019e
                java.lang.Object r14 = r14.getValue(r11)
                java.lang.String r14 = (java.lang.String) r14
                com.yeelight.yeelib.device.xiaomi.Ceiling5Service$v0 r15 = r13.f16218a
                r15.mo28522e(r14)
                goto L_0x019e
            L_0x0143:
                com.miot.common.property.Property r15 = r14.getProperty(r4)
                boolean r15 = r15.isValueValid()
                if (r15 == 0) goto L_0x019e
                java.lang.Object r14 = r14.getValue(r4)
                java.lang.Long r14 = (java.lang.Long) r14
                com.yeelight.yeelib.device.xiaomi.Ceiling5Service$v0 r15 = r13.f16218a
                r15.mo28519b(r14)
                goto L_0x019e
            L_0x0159:
                com.miot.common.property.Property r15 = r14.getProperty(r7)
                boolean r15 = r15.isValueValid()
                if (r15 == 0) goto L_0x019e
                java.lang.Object r14 = r14.getValue(r7)
                java.lang.Long r14 = (java.lang.Long) r14
                com.yeelight.yeelib.device.xiaomi.Ceiling5Service$v0 r15 = r13.f16218a
                r15.mo28525h(r14)
                goto L_0x019e
            L_0x016f:
                com.miot.common.property.Property r15 = r14.getProperty(r1)
                boolean r15 = r15.isValueValid()
                if (r15 == 0) goto L_0x019e
                java.lang.Object r14 = r14.getValue(r1)
                java.lang.Long r14 = (java.lang.Long) r14
                com.yeelight.yeelib.device.xiaomi.Ceiling5Service$v0 r15 = r13.f16218a
                r15.mo28518a(r14)
                goto L_0x019e
            L_0x0185:
                com.miot.common.property.Property r15 = r14.getProperty(r5)
                boolean r15 = r15.isValueValid()
                if (r15 == 0) goto L_0x019e
                java.lang.Object r14 = r14.getValue(r5)
                java.lang.String r14 = (java.lang.String) r14
                com.yeelight.yeelib.device.xiaomi.Ceiling5Service$u0 r14 = com.yeelight.yeelib.device.xiaomi.Ceiling5Service.C8240u0.valueOf(r14)
                com.yeelight.yeelib.device.xiaomi.Ceiling5Service$v0 r15 = r13.f16218a
                r15.mo28524g(r14)
            L_0x019e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.xiaomi.Ceiling5Service.C8241v.onPropertyChanged(com.miot.common.device.invocation.PropertyInfo, java.lang.String):void");
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling5Service$v0 */
    public interface C8242v0 {
        /* renamed from: a */
        void mo28518a(Long l);

        /* renamed from: b */
        void mo28519b(Long l);

        /* renamed from: c */
        void mo28520c(Long l);

        /* renamed from: d */
        void mo28521d(Long l);

        /* renamed from: e */
        void mo28522e(String str);

        /* renamed from: f */
        void mo28523f(Long l);

        /* renamed from: g */
        void mo28524g(C8240u0 u0Var);

        /* renamed from: h */
        void mo28525h(Long l);

        /* renamed from: i */
        void mo28526i(String str);

        /* renamed from: k */
        void mo28527k(Long l);

        /* renamed from: m */
        void mo28528m(Long l);

        /* renamed from: p */
        void mo28529p(Long l);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling5Service$w */
    class C8243w implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16219a;

        C8243w(Ceiling5Service ceiling5Service, CompletionHandler completionHandler) {
            this.f16219a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16219a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16219a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling5Service$x */
    class C8244x implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16220a;

        C8244x(Ceiling5Service ceiling5Service, CompletionHandler completionHandler) {
            this.f16220a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16220a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16220a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling5Service$y */
    class C8245y implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16221a;

        C8245y(Ceiling5Service ceiling5Service, CompletionHandler completionHandler) {
            this.f16221a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16221a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f16221a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Ceiling5Service$z */
    class C8246z implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8232q0 f16222a;

        C8246z(Ceiling5Service ceiling5Service, C8232q0 q0Var) {
            this.f16222a = q0Var;
        }

        public void onFailed(int i, String str) {
            this.f16222a.onFailed(i, str);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.Long} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onSucceed(com.miot.common.device.invocation.PropertyInfo r18) {
            /*
                r17 = this;
                r0 = r18
                java.lang.String r1 = "Power"
                com.miot.common.property.Property r1 = r0.getProperty(r1)
                boolean r2 = r1.isValueValid()
                r3 = 0
                if (r2 == 0) goto L_0x001b
                java.lang.Object r1 = r1.getValue()
                java.lang.String r1 = (java.lang.String) r1
                com.yeelight.yeelib.device.xiaomi.Ceiling5Service$u0 r1 = com.yeelight.yeelib.device.xiaomi.Ceiling5Service.C8240u0.valueOf(r1)
                r5 = r1
                goto L_0x001c
            L_0x001b:
                r5 = r3
            L_0x001c:
                java.lang.String r1 = "Bright"
                com.miot.common.property.Property r1 = r0.getProperty(r1)
                boolean r2 = r1.isValueValid()
                if (r2 == 0) goto L_0x0030
                java.lang.Object r1 = r1.getValue()
                java.lang.Long r1 = (java.lang.Long) r1
                r6 = r1
                goto L_0x0031
            L_0x0030:
                r6 = r3
            L_0x0031:
                java.lang.String r1 = "Ct"
                com.miot.common.property.Property r1 = r0.getProperty(r1)
                boolean r2 = r1.isValueValid()
                if (r2 == 0) goto L_0x0045
                java.lang.Object r1 = r1.getValue()
                java.lang.Long r1 = (java.lang.Long) r1
                r7 = r1
                goto L_0x0046
            L_0x0045:
                r7 = r3
            L_0x0046:
                java.lang.String r1 = "DelayOff"
                com.miot.common.property.Property r1 = r0.getProperty(r1)
                boolean r2 = r1.isValueValid()
                if (r2 == 0) goto L_0x005a
                java.lang.Object r1 = r1.getValue()
                java.lang.Long r1 = (java.lang.Long) r1
                r8 = r1
                goto L_0x005b
            L_0x005a:
                r8 = r3
            L_0x005b:
                java.lang.String r1 = "FlowParams"
                com.miot.common.property.Property r1 = r0.getProperty(r1)
                boolean r2 = r1.isValueValid()
                if (r2 == 0) goto L_0x006f
                java.lang.Object r1 = r1.getValue()
                java.lang.String r1 = (java.lang.String) r1
                r9 = r1
                goto L_0x0070
            L_0x006f:
                r9 = r3
            L_0x0070:
                java.lang.String r1 = "SaveState"
                com.miot.common.property.Property r1 = r0.getProperty(r1)
                boolean r2 = r1.isValueValid()
                if (r2 == 0) goto L_0x0084
                java.lang.Object r1 = r1.getValue()
                java.lang.Long r1 = (java.lang.Long) r1
                r10 = r1
                goto L_0x0085
            L_0x0084:
                r10 = r3
            L_0x0085:
                java.lang.String r1 = "onFromPower"
                com.miot.common.property.Property r1 = r0.getProperty(r1)
                boolean r2 = r1.isValueValid()
                if (r2 == 0) goto L_0x0099
                java.lang.Object r1 = r1.getValue()
                java.lang.Long r1 = (java.lang.Long) r1
                r11 = r1
                goto L_0x009a
            L_0x0099:
                r11 = r3
            L_0x009a:
                java.lang.String r1 = "NLBright"
                com.miot.common.property.Property r1 = r0.getProperty(r1)
                boolean r2 = r1.isValueValid()
                if (r2 == 0) goto L_0x00ae
                java.lang.Object r1 = r1.getValue()
                java.lang.Long r1 = (java.lang.Long) r1
                r12 = r1
                goto L_0x00af
            L_0x00ae:
                r12 = r3
            L_0x00af:
                java.lang.String r1 = "NightTimeInfo"
                com.miot.common.property.Property r1 = r0.getProperty(r1)
                boolean r2 = r1.isValueValid()
                if (r2 == 0) goto L_0x00c3
                java.lang.Object r1 = r1.getValue()
                java.lang.String r1 = (java.lang.String) r1
                r13 = r1
                goto L_0x00c4
            L_0x00c3:
                r13 = r3
            L_0x00c4:
                java.lang.String r1 = "MiBandSleep"
                com.miot.common.property.Property r1 = r0.getProperty(r1)
                boolean r2 = r1.isValueValid()
                if (r2 == 0) goto L_0x00d8
                java.lang.Object r1 = r1.getValue()
                java.lang.Long r1 = (java.lang.Long) r1
                r14 = r1
                goto L_0x00d9
            L_0x00d8:
                r14 = r3
            L_0x00d9:
                java.lang.String r1 = "Flowing"
                com.miot.common.property.Property r1 = r0.getProperty(r1)
                boolean r2 = r1.isValueValid()
                if (r2 == 0) goto L_0x00ed
                java.lang.Object r1 = r1.getValue()
                java.lang.Long r1 = (java.lang.Long) r1
                r15 = r1
                goto L_0x00ee
            L_0x00ed:
                r15 = r3
            L_0x00ee:
                java.lang.String r1 = "SmartSwitch"
                com.miot.common.property.Property r0 = r0.getProperty(r1)
                boolean r1 = r0.isValueValid()
                if (r1 == 0) goto L_0x0101
                java.lang.Object r0 = r0.getValue()
                r3 = r0
                java.lang.Long r3 = (java.lang.Long) r3
            L_0x0101:
                r0 = r17
                r16 = r3
                com.yeelight.yeelib.device.xiaomi.Ceiling5Service$q0 r4 = r0.f16222a
                r4.mo28530a(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.xiaomi.Ceiling5Service.C8246z.onSucceed(com.miot.common.device.invocation.PropertyInfo):void");
        }
    }

    public Ceiling5Service(AbstractDevice abstractDevice) {
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
                MiotManager.getDeviceManipulator().invoke(create, new C8229p(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8215i(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getBright(C8214h0 h0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Bright"), new C8202b0(this, h0Var));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8244x(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getCt(C8216i0 i0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Ct"), new C8204c0(this, i0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getDelayOff(C8218j0 j0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "DelayOff"), new C8206d0(this, j0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowParams(C8220k0 k0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "FlowParams"), new C8208e0(this, k0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowing(C8222l0 l0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Flowing"), new C8209f(this, l0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getMiBandSleep(C8224m0 m0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "MiBandSleep"), new C8207e(this, m0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getNLBright(C8226n0 n0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "NLBright"), new C8203c(this, n0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getNightTimeInfo(C8228o0 o0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "NightTimeInfo"), new C8205d(this, o0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getPower(C8230p0 p0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Power"), new C8200a0(this, p0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getProperties(C8232q0 q0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            PropertyInfo create = PropertyInfoFactory.create(getService());
            create.addProperty(getService().getProperty("Power"));
            create.addProperty(getService().getProperty("Bright"));
            create.addProperty(getService().getProperty("Ct"));
            create.addProperty(getService().getProperty("DelayOff"));
            create.addProperty(getService().getProperty("FlowParams"));
            create.addProperty(getService().getProperty("SaveState"));
            create.addProperty(getService().getProperty("onFromPower"));
            create.addProperty(getService().getProperty("NLBright"));
            create.addProperty(getService().getProperty("NightTimeInfo"));
            create.addProperty(getService().getProperty("MiBandSleep"));
            create.addProperty(getService().getProperty("Flowing"));
            create.addProperty(getService().getProperty("SmartSwitch"));
            MiotManager.getDeviceManipulator().readProperty(create, new C8246z(this, q0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getSaveState(C8234r0 r0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "SaveState"), new C8199a(this, r0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getSmartSwitch(C8236s0 s0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "SmartSwitch"), new C8211g(this, s0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getonFromPower(C8238t0 t0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "onFromPower"), new C8201b(this, t0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void openWithMode(C8240u0 u0Var, C8212g0 g0Var, Long l, Long l2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "openWithMode");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("Power", u0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Effect", g0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Duration", l)) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("Mode", l2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C8223m(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8217j(this, completionHandler));
                return;
            }
            throw new MiotException("actionInfo is null");
        }
        throw new MiotException("device not configurated connection");
    }

    public void sendCmd(C8210f0 f0Var, String str, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "sendCmd");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("CmdKey", f0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("CmdValue", str)) {
                MiotManager.getDeviceManipulator().invoke(create, new C8235s(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setBright(Long l, C8212g0 g0Var, Long l2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setBright");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("Bright", l)) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Effect", g0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("Duration", l2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C8213h(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setCt(Long l, C8212g0 g0Var, Long l2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setCt");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("Ct", l)) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Effect", g0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("Duration", l2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C8243w(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8231q(this, completionHandler));
                return;
            }
            throw new MiotException("actionInfo is null");
        }
        throw new MiotException("device not configurated connection");
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
                MiotManager.getDeviceManipulator().invoke(create, new C8239u(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8233r(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setPower(C8240u0 u0Var, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setPower");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (create.setArgumentValue("Power", u0Var.toString())) {
                MiotManager.getDeviceManipulator().invoke(create, new C8225n(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8221l(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8237t(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void subscribeNotifications(CompletionHandler completionHandler, C8242v0 v0Var) {
        if (completionHandler == null) {
            throw new IllegalArgumentException("handler is null");
        } else if (v0Var != null) {
            PropertyInfo create = PropertyInfoFactory.create(getService());
            for (Property next : getService().getProperties()) {
                if (next.getDefinition().isNotifiable()) {
                    create.addProperty(next);
                }
            }
            MiotManager.getDeviceManipulator().addPropertyChangedListener(create, new C8219k(this, completionHandler), new C8241v(this, v0Var));
        } else {
            throw new IllegalArgumentException("listener is null");
        }
    }

    public void toggle(CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "toggle");
            if (create != null) {
                MiotManager.getDeviceManipulator().invoke(create, new C8227o(this, completionHandler));
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
            MiotManager.getDeviceManipulator().removePropertyChangedListener(create, new C8245y(this, completionHandler));
            return;
        }
        throw new IllegalArgumentException("handler is null");
    }
}
