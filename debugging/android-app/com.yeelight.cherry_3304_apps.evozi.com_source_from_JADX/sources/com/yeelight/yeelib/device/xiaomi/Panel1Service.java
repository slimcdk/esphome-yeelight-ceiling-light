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

public class Panel1Service extends AbstractService {
    public static final String ACTION_addCron = "addCron";
    public static final String ACTION_delCron = "delCron";
    public static final String ACTION_getCron = "getCron";
    public static final String ACTION_openWithMode = "openWithMode";
    public static final String ACTION_restore = "restore";
    public static final String ACTION_sendCmd = "sendCmd";
    public static final String ACTION_setBright = "setBright";
    public static final String ACTION_setDefault = "setDefault";
    public static final String ACTION_setFlowScene = "setFlowScene";
    public static final String ACTION_setPower = "setPower";
    public static final String ACTION_setScene = "setScene";
    public static final String ACTION_setadjust = "setadjust";
    public static final String ACTION_toggle = "toggle";
    public static final String PROPERTY_Bright = "Bright";
    public static final String PROPERTY_CmdKey = "CmdKey";
    public static final String PROPERTY_CmdValue = "CmdValue";
    public static final String PROPERTY_CronType = "CronType";
    public static final String PROPERTY_DelayOff = "DelayOff";
    public static final String PROPERTY_Duration = "Duration";
    public static final String PROPERTY_Effect = "Effect";
    public static final String PROPERTY_FlowParams = "FlowParams";
    public static final String PROPERTY_Flowing = "Flowing";
    public static final String PROPERTY_LanMode = "LanMode";
    public static final String PROPERTY_Mode = "Mode";
    public static final String PROPERTY_NightTimeInfo = "NightTimeInfo";
    public static final String PROPERTY_ParamColors = "ParamColors";
    public static final String PROPERTY_ParamCount = "ParamCount";
    public static final String PROPERTY_ParamFinish = "ParamFinish";
    public static final String PROPERTY_ParamModel = "ParamModel";
    public static final String PROPERTY_Power = "Power";
    public static final String PROPERTY_SaveState = "SaveState";
    public static final String PROPERTY_SmartSwitch = "SmartSwitch";
    public static final String PROPERTY_Temperature = "Temperature";
    public static final String PROPERTY_adjustAction = "adjustAction";
    public static final String PROPERTY_adjustProper = "adjustProper";
    public static final String PROPERTY_onFromPower = "onFromPower";
    private static final String TAG = "Panel1Service";
    private AbstractDevice mDevice = null;

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel1Service$a */
    class C9352a implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9365g0 f17300a;

        C9352a(Panel1Service panel1Service, C9365g0 g0Var) {
            this.f17300a = g0Var;
        }

        public void onFailed(int i, String str) {
            this.f17300a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("FlowParams");
            if (property.isValueValid()) {
                this.f17300a.onSucceed((String) propertyInfo.getValue("FlowParams"));
                return;
            }
            C9365g0 g0Var = this.f17300a;
            g0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel1Service$a0 */
    class C9353a0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9363f0 f17301a;

        C9353a0(Panel1Service panel1Service, C9363f0 f0Var) {
            this.f17301a = f0Var;
        }

        public void onFailed(int i, String str) {
            this.f17301a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("DelayOff");
            if (property.isValueValid()) {
                this.f17301a.mo31046a((Long) propertyInfo.getValue("DelayOff"));
                return;
            }
            C9363f0 f0Var = this.f17301a;
            f0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel1Service$b */
    class C9354b implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9369i0 f17302a;

        C9354b(Panel1Service panel1Service, C9369i0 i0Var) {
            this.f17302a = i0Var;
        }

        public void onFailed(int i, String str) {
            this.f17302a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("LanMode");
            if (property.isValueValid()) {
                this.f17302a.mo31052a((Long) propertyInfo.getValue("LanMode"));
                return;
            }
            C9369i0 i0Var = this.f17302a;
            i0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel1Service$b0 */
    class C9355b0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9377m0 f17303a;

        C9355b0(Panel1Service panel1Service, C9377m0 m0Var) {
            this.f17303a = m0Var;
        }

        public void onFailed(int i, String str) {
            this.f17303a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("SaveState");
            if (property.isValueValid()) {
                this.f17303a.mo31058a((Long) propertyInfo.getValue("SaveState"));
                return;
            }
            C9377m0 m0Var = this.f17303a;
            m0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel1Service$c */
    class C9356c implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9383p0 f17304a;

        C9356c(Panel1Service panel1Service, C9383p0 p0Var) {
            this.f17304a = p0Var;
        }

        public void onFailed(int i, String str) {
            this.f17304a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("onFromPower");
            if (property.isValueValid()) {
                this.f17304a.mo31064a((Long) propertyInfo.getValue("onFromPower"));
                return;
            }
            C9383p0 p0Var = this.f17304a;
            p0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel1Service$c0 */
    public enum C9357c0 {
        undefined,
        cfg_pomodoro,
        cfg_lan_ctrl,
        cfg_save_state,
        cfg_init_power,
        cfg_smart_switch,
        nighttime,
        pseudo_beacon
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel1Service$d */
    class C9358d implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9367h0 f17314a;

        C9358d(Panel1Service panel1Service, C9367h0 h0Var) {
            this.f17314a = h0Var;
        }

        public void onFailed(int i, String str) {
            this.f17314a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Flowing");
            if (property.isValueValid()) {
                this.f17314a.mo31050a((Long) propertyInfo.getValue("Flowing"));
                return;
            }
            C9367h0 h0Var = this.f17314a;
            h0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel1Service$d0 */
    public enum C9359d0 {
        undefined,
        smooth,
        sudden
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel1Service$e */
    class C9360e implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9379n0 f17319a;

        C9360e(Panel1Service panel1Service, C9379n0 n0Var) {
            this.f17319a = n0Var;
        }

        public void onFailed(int i, String str) {
            this.f17319a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("SmartSwitch");
            if (property.isValueValid()) {
                this.f17319a.mo31060a((Long) propertyInfo.getValue("SmartSwitch"));
                return;
            }
            C9379n0 n0Var = this.f17319a;
            n0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel1Service$e0 */
    public interface C9361e0 {
        /* renamed from: a */
        void mo31044a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel1Service$f */
    class C9362f implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9371j0 f17320a;

        C9362f(Panel1Service panel1Service, C9371j0 j0Var) {
            this.f17320a = j0Var;
        }

        public void onFailed(int i, String str) {
            this.f17320a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("NightTimeInfo");
            if (property.isValueValid()) {
                this.f17320a.onSucceed((String) propertyInfo.getValue("NightTimeInfo"));
                return;
            }
            C9371j0 j0Var = this.f17320a;
            j0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel1Service$f0 */
    public interface C9363f0 {
        /* renamed from: a */
        void mo31046a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel1Service$g */
    class C9364g implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17321a;

        C9364g(Panel1Service panel1Service, CompletionHandler completionHandler) {
            this.f17321a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17321a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17321a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel1Service$g0 */
    public interface C9365g0 {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel1Service$h */
    class C9366h implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17322a;

        C9366h(Panel1Service panel1Service, CompletionHandler completionHandler) {
            this.f17322a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17322a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17322a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel1Service$h0 */
    public interface C9367h0 {
        /* renamed from: a */
        void mo31050a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel1Service$i */
    class C9368i implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17323a;

        C9368i(Panel1Service panel1Service, CompletionHandler completionHandler) {
            this.f17323a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17323a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17323a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel1Service$i0 */
    public interface C9369i0 {
        /* renamed from: a */
        void mo31052a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel1Service$j */
    class C9370j implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17324a;

        C9370j(Panel1Service panel1Service, CompletionHandler completionHandler) {
            this.f17324a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17324a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17324a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel1Service$j0 */
    public interface C9371j0 {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel1Service$k */
    class C9372k implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17325a;

        C9372k(Panel1Service panel1Service, CompletionHandler completionHandler) {
            this.f17325a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17325a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f17325a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel1Service$k0 */
    public interface C9373k0 {
        /* renamed from: a */
        void mo31056a(C9385q0 q0Var);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel1Service$l */
    class C9374l implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17326a;

        C9374l(Panel1Service panel1Service, CompletionHandler completionHandler) {
            this.f17326a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17326a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17326a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel1Service$l0 */
    public interface C9375l0 {
        /* renamed from: a */
        void mo28863a(C9385q0 q0Var, Long l, Long l2, Long l3, Long l4, String str, Long l5, Long l6, Long l7, Long l8, String str2);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel1Service$m */
    class C9376m implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17327a;

        C9376m(Panel1Service panel1Service, CompletionHandler completionHandler) {
            this.f17327a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17327a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17327a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel1Service$m0 */
    public interface C9377m0 {
        /* renamed from: a */
        void mo31058a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel1Service$n */
    class C9378n implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17328a;

        C9378n(Panel1Service panel1Service, CompletionHandler completionHandler) {
            this.f17328a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17328a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17328a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel1Service$n0 */
    public interface C9379n0 {
        /* renamed from: a */
        void mo31060a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel1Service$o */
    class C9380o implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17329a;

        C9380o(Panel1Service panel1Service, CompletionHandler completionHandler) {
            this.f17329a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17329a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17329a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel1Service$o0 */
    public interface C9381o0 {
        /* renamed from: a */
        void mo31062a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel1Service$p */
    class C9382p implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17330a;

        C9382p(Panel1Service panel1Service, CompletionHandler completionHandler) {
            this.f17330a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17330a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17330a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel1Service$p0 */
    public interface C9383p0 {
        /* renamed from: a */
        void mo31064a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel1Service$q */
    class C9384q implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17331a;

        C9384q(Panel1Service panel1Service, CompletionHandler completionHandler) {
            this.f17331a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17331a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17331a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel1Service$q0 */
    public enum C9385q0 {
        undefined,
        on,
        off
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel1Service$r */
    class C9386r implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17336a;

        C9386r(Panel1Service panel1Service, CompletionHandler completionHandler) {
            this.f17336a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17336a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17336a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel1Service$r0 */
    public interface C9387r0 {
        /* renamed from: a */
        void mo28853a(Long l);

        /* renamed from: b */
        void mo28854b(Long l);

        /* renamed from: c */
        void mo28855c(Long l);

        /* renamed from: d */
        void mo28856d(Long l);

        /* renamed from: e */
        void mo28857e(String str);

        /* renamed from: f */
        void mo28858f(Long l);

        /* renamed from: g */
        void mo28859g(Long l);

        /* renamed from: h */
        void mo28860h(C9385q0 q0Var);

        /* renamed from: i */
        void mo28861i(String str);

        /* renamed from: p */
        void mo28862p(Long l);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel1Service$s */
    class C9388s implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17337a;

        C9388s(Panel1Service panel1Service, CompletionHandler completionHandler) {
            this.f17337a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17337a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17337a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel1Service$t */
    class C9389t implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17338a;

        C9389t(Panel1Service panel1Service, CompletionHandler completionHandler) {
            this.f17338a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17338a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17338a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel1Service$u */
    class C9390u implements DeviceManipulator.PropertyChangedListener {

        /* renamed from: a */
        final /* synthetic */ C9387r0 f17339a;

        C9390u(Panel1Service panel1Service, C9387r0 r0Var) {
            this.f17339a = r0Var;
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onPropertyChanged(com.miot.common.device.invocation.PropertyInfo r12, java.lang.String r13) {
            /*
                r11 = this;
                int r0 = r13.hashCode()
                java.lang.String r1 = "Bright"
                java.lang.String r2 = "LanMode"
                java.lang.String r3 = "SmartSwitch"
                java.lang.String r4 = "Flowing"
                java.lang.String r5 = "DelayOff"
                java.lang.String r6 = "Power"
                java.lang.String r7 = "onFromPower"
                java.lang.String r8 = "NightTimeInfo"
                java.lang.String r9 = "FlowParams"
                java.lang.String r10 = "SaveState"
                switch(r0) {
                    case -2117953292: goto L_0x0066;
                    case -2002016140: goto L_0x005e;
                    case -1331143373: goto L_0x0055;
                    case 35911772: goto L_0x004d;
                    case 77306085: goto L_0x0045;
                    case 880790796: goto L_0x003d;
                    case 898856916: goto L_0x0035;
                    case 1179821629: goto L_0x002c;
                    case 1611821756: goto L_0x0024;
                    case 1998035738: goto L_0x001c;
                    default: goto L_0x001b;
                }
            L_0x001b:
                goto L_0x006e
            L_0x001c:
                boolean r13 = r13.equals(r1)
                if (r13 == 0) goto L_0x006e
                r13 = 1
                goto L_0x006f
            L_0x0024:
                boolean r13 = r13.equals(r2)
                if (r13 == 0) goto L_0x006e
                r13 = 5
                goto L_0x006f
            L_0x002c:
                boolean r13 = r13.equals(r3)
                if (r13 == 0) goto L_0x006e
                r13 = 8
                goto L_0x006f
            L_0x0035:
                boolean r13 = r13.equals(r4)
                if (r13 == 0) goto L_0x006e
                r13 = 7
                goto L_0x006f
            L_0x003d:
                boolean r13 = r13.equals(r5)
                if (r13 == 0) goto L_0x006e
                r13 = 2
                goto L_0x006f
            L_0x0045:
                boolean r13 = r13.equals(r6)
                if (r13 == 0) goto L_0x006e
                r13 = 0
                goto L_0x006f
            L_0x004d:
                boolean r13 = r13.equals(r7)
                if (r13 == 0) goto L_0x006e
                r13 = 6
                goto L_0x006f
            L_0x0055:
                boolean r13 = r13.equals(r8)
                if (r13 == 0) goto L_0x006e
                r13 = 9
                goto L_0x006f
            L_0x005e:
                boolean r13 = r13.equals(r9)
                if (r13 == 0) goto L_0x006e
                r13 = 4
                goto L_0x006f
            L_0x0066:
                boolean r13 = r13.equals(r10)
                if (r13 == 0) goto L_0x006e
                r13 = 3
                goto L_0x006f
            L_0x006e:
                r13 = -1
            L_0x006f:
                switch(r13) {
                    case 0: goto L_0x013f;
                    case 1: goto L_0x0129;
                    case 2: goto L_0x0113;
                    case 3: goto L_0x00fd;
                    case 4: goto L_0x00e7;
                    case 5: goto L_0x00d0;
                    case 6: goto L_0x00b9;
                    case 7: goto L_0x00a2;
                    case 8: goto L_0x008b;
                    case 9: goto L_0x0074;
                    default: goto L_0x0072;
                }
            L_0x0072:
                goto L_0x0158
            L_0x0074:
                com.miot.common.property.Property r13 = r12.getProperty(r8)
                boolean r13 = r13.isValueValid()
                if (r13 == 0) goto L_0x0158
                java.lang.Object r12 = r12.getValue(r8)
                java.lang.String r12 = (java.lang.String) r12
                com.yeelight.yeelib.device.xiaomi.Panel1Service$r0 r13 = r11.f17339a
                r13.mo28861i(r12)
                goto L_0x0158
            L_0x008b:
                com.miot.common.property.Property r13 = r12.getProperty(r3)
                boolean r13 = r13.isValueValid()
                if (r13 == 0) goto L_0x0158
                java.lang.Object r12 = r12.getValue(r3)
                java.lang.Long r12 = (java.lang.Long) r12
                com.yeelight.yeelib.device.xiaomi.Panel1Service$r0 r13 = r11.f17339a
                r13.mo28862p(r12)
                goto L_0x0158
            L_0x00a2:
                com.miot.common.property.Property r13 = r12.getProperty(r4)
                boolean r13 = r13.isValueValid()
                if (r13 == 0) goto L_0x0158
                java.lang.Object r12 = r12.getValue(r4)
                java.lang.Long r12 = (java.lang.Long) r12
                com.yeelight.yeelib.device.xiaomi.Panel1Service$r0 r13 = r11.f17339a
                r13.mo28855c(r12)
                goto L_0x0158
            L_0x00b9:
                com.miot.common.property.Property r13 = r12.getProperty(r7)
                boolean r13 = r13.isValueValid()
                if (r13 == 0) goto L_0x0158
                java.lang.Object r12 = r12.getValue(r7)
                java.lang.Long r12 = (java.lang.Long) r12
                com.yeelight.yeelib.device.xiaomi.Panel1Service$r0 r13 = r11.f17339a
                r13.mo28858f(r12)
                goto L_0x0158
            L_0x00d0:
                com.miot.common.property.Property r13 = r12.getProperty(r2)
                boolean r13 = r13.isValueValid()
                if (r13 == 0) goto L_0x0158
                java.lang.Object r12 = r12.getValue(r2)
                java.lang.Long r12 = (java.lang.Long) r12
                com.yeelight.yeelib.device.xiaomi.Panel1Service$r0 r13 = r11.f17339a
                r13.mo28859g(r12)
                goto L_0x0158
            L_0x00e7:
                com.miot.common.property.Property r13 = r12.getProperty(r9)
                boolean r13 = r13.isValueValid()
                if (r13 == 0) goto L_0x0158
                java.lang.Object r12 = r12.getValue(r9)
                java.lang.String r12 = (java.lang.String) r12
                com.yeelight.yeelib.device.xiaomi.Panel1Service$r0 r13 = r11.f17339a
                r13.mo28857e(r12)
                goto L_0x0158
            L_0x00fd:
                com.miot.common.property.Property r13 = r12.getProperty(r10)
                boolean r13 = r13.isValueValid()
                if (r13 == 0) goto L_0x0158
                java.lang.Object r12 = r12.getValue(r10)
                java.lang.Long r12 = (java.lang.Long) r12
                com.yeelight.yeelib.device.xiaomi.Panel1Service$r0 r13 = r11.f17339a
                r13.mo28856d(r12)
                goto L_0x0158
            L_0x0113:
                com.miot.common.property.Property r13 = r12.getProperty(r5)
                boolean r13 = r13.isValueValid()
                if (r13 == 0) goto L_0x0158
                java.lang.Object r12 = r12.getValue(r5)
                java.lang.Long r12 = (java.lang.Long) r12
                com.yeelight.yeelib.device.xiaomi.Panel1Service$r0 r13 = r11.f17339a
                r13.mo28854b(r12)
                goto L_0x0158
            L_0x0129:
                com.miot.common.property.Property r13 = r12.getProperty(r1)
                boolean r13 = r13.isValueValid()
                if (r13 == 0) goto L_0x0158
                java.lang.Object r12 = r12.getValue(r1)
                java.lang.Long r12 = (java.lang.Long) r12
                com.yeelight.yeelib.device.xiaomi.Panel1Service$r0 r13 = r11.f17339a
                r13.mo28853a(r12)
                goto L_0x0158
            L_0x013f:
                com.miot.common.property.Property r13 = r12.getProperty(r6)
                boolean r13 = r13.isValueValid()
                if (r13 == 0) goto L_0x0158
                java.lang.Object r12 = r12.getValue(r6)
                java.lang.String r12 = (java.lang.String) r12
                com.yeelight.yeelib.device.xiaomi.Panel1Service$q0 r12 = com.yeelight.yeelib.device.xiaomi.Panel1Service.C9385q0.valueOf(r12)
                com.yeelight.yeelib.device.xiaomi.Panel1Service$r0 r13 = r11.f17339a
                r13.mo28860h(r12)
            L_0x0158:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.xiaomi.Panel1Service.C9390u.onPropertyChanged(com.miot.common.device.invocation.PropertyInfo, java.lang.String):void");
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel1Service$v */
    class C9391v implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17340a;

        C9391v(Panel1Service panel1Service, CompletionHandler completionHandler) {
            this.f17340a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17340a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f17340a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel1Service$w */
    class C9392w implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9375l0 f17341a;

        C9392w(Panel1Service panel1Service, C9375l0 l0Var) {
            this.f17341a = l0Var;
        }

        public void onFailed(int i, String str) {
            this.f17341a.onFailed(i, str);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.String} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onSucceed(com.miot.common.device.invocation.PropertyInfo r17) {
            /*
                r16 = this;
                r0 = r17
                java.lang.String r1 = "Power"
                com.miot.common.property.Property r1 = r0.getProperty(r1)
                boolean r2 = r1.isValueValid()
                r3 = 0
                if (r2 == 0) goto L_0x001b
                java.lang.Object r1 = r1.getValue()
                java.lang.String r1 = (java.lang.String) r1
                com.yeelight.yeelib.device.xiaomi.Panel1Service$q0 r1 = com.yeelight.yeelib.device.xiaomi.Panel1Service.C9385q0.valueOf(r1)
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
                java.lang.String r1 = "Temperature"
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
                java.lang.String r1 = "SaveState"
                com.miot.common.property.Property r1 = r0.getProperty(r1)
                boolean r2 = r1.isValueValid()
                if (r2 == 0) goto L_0x006f
                java.lang.Object r1 = r1.getValue()
                java.lang.Long r1 = (java.lang.Long) r1
                r9 = r1
                goto L_0x0070
            L_0x006f:
                r9 = r3
            L_0x0070:
                java.lang.String r1 = "FlowParams"
                com.miot.common.property.Property r1 = r0.getProperty(r1)
                boolean r2 = r1.isValueValid()
                if (r2 == 0) goto L_0x0084
                java.lang.Object r1 = r1.getValue()
                java.lang.String r1 = (java.lang.String) r1
                r10 = r1
                goto L_0x0085
            L_0x0084:
                r10 = r3
            L_0x0085:
                java.lang.String r1 = "LanMode"
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
                java.lang.String r1 = "onFromPower"
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
                java.lang.String r1 = "Flowing"
                com.miot.common.property.Property r1 = r0.getProperty(r1)
                boolean r2 = r1.isValueValid()
                if (r2 == 0) goto L_0x00c3
                java.lang.Object r1 = r1.getValue()
                java.lang.Long r1 = (java.lang.Long) r1
                r13 = r1
                goto L_0x00c4
            L_0x00c3:
                r13 = r3
            L_0x00c4:
                java.lang.String r1 = "SmartSwitch"
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
                java.lang.String r1 = "NightTimeInfo"
                com.miot.common.property.Property r0 = r0.getProperty(r1)
                boolean r1 = r0.isValueValid()
                if (r1 == 0) goto L_0x00ec
                java.lang.Object r0 = r0.getValue()
                r3 = r0
                java.lang.String r3 = (java.lang.String) r3
            L_0x00ec:
                r0 = r16
                r15 = r3
                com.yeelight.yeelib.device.xiaomi.Panel1Service$l0 r4 = r0.f17341a
                r4.mo28863a(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.xiaomi.Panel1Service.C9392w.onSucceed(com.miot.common.device.invocation.PropertyInfo):void");
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel1Service$x */
    class C9393x implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9373k0 f17342a;

        C9393x(Panel1Service panel1Service, C9373k0 k0Var) {
            this.f17342a = k0Var;
        }

        public void onFailed(int i, String str) {
            this.f17342a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Power");
            if (property.isValueValid()) {
                this.f17342a.mo31056a(C9385q0.valueOf((String) propertyInfo.getValue("Power")));
                return;
            }
            C9373k0 k0Var = this.f17342a;
            k0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel1Service$y */
    class C9394y implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9361e0 f17343a;

        C9394y(Panel1Service panel1Service, C9361e0 e0Var) {
            this.f17343a = e0Var;
        }

        public void onFailed(int i, String str) {
            this.f17343a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Bright");
            if (property.isValueValid()) {
                this.f17343a.mo31044a((Long) propertyInfo.getValue("Bright"));
                return;
            }
            C9361e0 e0Var = this.f17343a;
            e0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Panel1Service$z */
    class C9395z implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9381o0 f17344a;

        C9395z(Panel1Service panel1Service, C9381o0 o0Var) {
            this.f17344a = o0Var;
        }

        public void onFailed(int i, String str) {
            this.f17344a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Temperature");
            if (property.isValueValid()) {
                this.f17344a.mo31062a((Long) propertyInfo.getValue("Temperature"));
                return;
            }
            C9381o0 o0Var = this.f17344a;
            o0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    public Panel1Service(AbstractDevice abstractDevice) {
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
                MiotManager.getDeviceManipulator().invoke(create, new C9380o(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C9366h(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getBright(C9361e0 e0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Bright"), new C9394y(this, e0Var));
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
                MiotManager.getDeviceManipulator().invoke(create, new C9389t(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getDelayOff(C9363f0 f0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "DelayOff"), new C9353a0(this, f0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowParams(C9365g0 g0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "FlowParams"), new C9352a(this, g0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowing(C9367h0 h0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Flowing"), new C9358d(this, h0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getLanMode(C9369i0 i0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "LanMode"), new C9354b(this, i0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getNightTimeInfo(C9371j0 j0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "NightTimeInfo"), new C9362f(this, j0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getPower(C9373k0 k0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Power"), new C9393x(this, k0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getProperties(C9375l0 l0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            PropertyInfo create = PropertyInfoFactory.create(getService());
            create.addProperty(getService().getProperty("Power"));
            create.addProperty(getService().getProperty("Bright"));
            create.addProperty(getService().getProperty("Temperature"));
            create.addProperty(getService().getProperty("DelayOff"));
            create.addProperty(getService().getProperty("SaveState"));
            create.addProperty(getService().getProperty("FlowParams"));
            create.addProperty(getService().getProperty("LanMode"));
            create.addProperty(getService().getProperty("onFromPower"));
            create.addProperty(getService().getProperty("Flowing"));
            create.addProperty(getService().getProperty("SmartSwitch"));
            create.addProperty(getService().getProperty("NightTimeInfo"));
            MiotManager.getDeviceManipulator().readProperty(create, new C9392w(this, l0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getSaveState(C9377m0 m0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "SaveState"), new C9355b0(this, m0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getSmartSwitch(C9379n0 n0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "SmartSwitch"), new C9360e(this, n0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getTemperature(C9381o0 o0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Temperature"), new C9395z(this, o0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getonFromPower(C9383p0 p0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "onFromPower"), new C9356c(this, p0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void openWithMode(C9385q0 q0Var, C9359d0 d0Var, Long l, Long l2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "openWithMode");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("Power", q0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Effect", d0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Duration", l)) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("Mode", l2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C9374l(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C9368i(this, completionHandler));
                return;
            }
            throw new MiotException("actionInfo is null");
        }
        throw new MiotException("device not configurated connection");
    }

    public void sendCmd(C9357c0 c0Var, String str, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "sendCmd");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("CmdKey", c0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("CmdValue", str)) {
                MiotManager.getDeviceManipulator().invoke(create, new C9384q(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setBright(Long l, C9359d0 d0Var, Long l2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setBright");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("Bright", l)) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Effect", d0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("Duration", l2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C9364g(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C9382p(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C9388s(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setPower(C9385q0 q0Var, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setPower");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (create.setArgumentValue("Power", q0Var.toString())) {
                MiotManager.getDeviceManipulator().invoke(create, new C9376m(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C9370j(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C9386r(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void subscribeNotifications(CompletionHandler completionHandler, C9387r0 r0Var) {
        if (completionHandler == null) {
            throw new IllegalArgumentException("handler is null");
        } else if (r0Var != null) {
            PropertyInfo create = PropertyInfoFactory.create(getService());
            for (Property next : getService().getProperties()) {
                if (next.getDefinition().isNotifiable()) {
                    create.addProperty(next);
                }
            }
            MiotManager.getDeviceManipulator().addPropertyChangedListener(create, new C9372k(this, completionHandler), new C9390u(this, r0Var));
        } else {
            throw new IllegalArgumentException("listener is null");
        }
    }

    public void toggle(CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "toggle");
            if (create != null) {
                MiotManager.getDeviceManipulator().invoke(create, new C9378n(this, completionHandler));
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
            MiotManager.getDeviceManipulator().removePropertyChangedListener(create, new C9391v(this, completionHandler));
            return;
        }
        throw new IllegalArgumentException("handler is null");
    }
}
