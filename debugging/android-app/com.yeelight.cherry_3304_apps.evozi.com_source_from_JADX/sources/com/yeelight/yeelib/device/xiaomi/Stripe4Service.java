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

public class Stripe4Service extends AbstractService {
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
    public static final String ACTION_setPower = "setPower";
    public static final String ACTION_setScene = "setScene";
    public static final String ACTION_toggle = "toggle";
    public static final String PROPERTY_Bright = "Bright";
    public static final String PROPERTY_CmdKey = "CmdKey";
    public static final String PROPERTY_CmdValue = "CmdValue";
    public static final String PROPERTY_CronType = "CronType";
    public static final String PROPERTY_Ct = "Ct";
    public static final String PROPERTY_DelayOff = "DelayOff";
    public static final String PROPERTY_Duration = "Duration";
    public static final String PROPERTY_Effect = "Effect";
    public static final String PROPERTY_FlowCount = "FlowCount";
    public static final String PROPERTY_FlowParams = "FlowParams";
    public static final String PROPERTY_Flowing = "Flowing";
    public static final String PROPERTY_LanMode = "LanMode";
    public static final String PROPERTY_Mode = "Mode";
    public static final String PROPERTY_ParamColors = "ParamColors";
    public static final String PROPERTY_ParamCount = "ParamCount";
    public static final String PROPERTY_ParamFinish = "ParamFinish";
    public static final String PROPERTY_ParamModel = "ParamModel";
    public static final String PROPERTY_Power = "Power";
    public static final String PROPERTY_SaveState = "SaveState";
    public static final String PROPERTY_SmartSwitch = "SmartSwitch";
    public static final String PROPERTY_onFromPower = "onFromPower";
    private static final String TAG = "Stripe4Service";
    private AbstractDevice mDevice = null;

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe4Service$a */
    class C9504a implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9527l0 f17449a;

        C9504a(Stripe4Service stripe4Service, C9527l0 l0Var) {
            this.f17449a = l0Var;
        }

        public void onFailed(int i, String str) {
            this.f17449a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("SaveState");
            if (property.isValueValid()) {
                this.f17449a.mo31224a((Long) propertyInfo.getValue("SaveState"));
                return;
            }
            C9527l0 l0Var = this.f17449a;
            l0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe4Service$a0 */
    class C9505a0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9515f0 f17450a;

        C9505a0(Stripe4Service stripe4Service, C9515f0 f0Var) {
            this.f17450a = f0Var;
        }

        public void onFailed(int i, String str) {
            this.f17450a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("DelayOff");
            if (property.isValueValid()) {
                this.f17450a.mo31214a((Long) propertyInfo.getValue("DelayOff"));
                return;
            }
            C9515f0 f0Var = this.f17450a;
            f0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe4Service$b */
    class C9506b implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9521i0 f17451a;

        C9506b(Stripe4Service stripe4Service, C9521i0 i0Var) {
            this.f17451a = i0Var;
        }

        public void onFailed(int i, String str) {
            this.f17451a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("LanMode");
            if (property.isValueValid()) {
                this.f17451a.mo31220a((Long) propertyInfo.getValue("LanMode"));
                return;
            }
            C9521i0 i0Var = this.f17451a;
            i0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe4Service$b0 */
    public enum C9507b0 {
        undefined,
        cfg_pomodoro,
        cfg_lan_ctrl,
        cfg_save_state,
        cfg_init_power,
        cfg_smart_switch,
        pseudo_beacon
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe4Service$c */
    class C9508c implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9531n0 f17460a;

        C9508c(Stripe4Service stripe4Service, C9531n0 n0Var) {
            this.f17460a = n0Var;
        }

        public void onFailed(int i, String str) {
            this.f17460a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("onFromPower");
            if (property.isValueValid()) {
                this.f17460a.mo31228a((Long) propertyInfo.getValue("onFromPower"));
                return;
            }
            C9531n0 n0Var = this.f17460a;
            n0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe4Service$c0 */
    public enum C9509c0 {
        undefined,
        smooth,
        sudden
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe4Service$d */
    class C9510d implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9519h0 f17465a;

        C9510d(Stripe4Service stripe4Service, C9519h0 h0Var) {
            this.f17465a = h0Var;
        }

        public void onFailed(int i, String str) {
            this.f17465a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Flowing");
            if (property.isValueValid()) {
                this.f17465a.mo31218a((Long) propertyInfo.getValue("Flowing"));
                return;
            }
            C9519h0 h0Var = this.f17465a;
            h0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe4Service$d0 */
    public interface C9511d0 {
        /* renamed from: a */
        void mo31210a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe4Service$e */
    class C9512e implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9529m0 f17466a;

        C9512e(Stripe4Service stripe4Service, C9529m0 m0Var) {
            this.f17466a = m0Var;
        }

        public void onFailed(int i, String str) {
            this.f17466a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("SmartSwitch");
            if (property.isValueValid()) {
                this.f17466a.mo31226a((Long) propertyInfo.getValue("SmartSwitch"));
                return;
            }
            C9529m0 m0Var = this.f17466a;
            m0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe4Service$e0 */
    public interface C9513e0 {
        /* renamed from: a */
        void mo31212a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe4Service$f */
    class C9514f implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17467a;

        C9514f(Stripe4Service stripe4Service, CompletionHandler completionHandler) {
            this.f17467a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17467a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17467a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe4Service$f0 */
    public interface C9515f0 {
        /* renamed from: a */
        void mo31214a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe4Service$g */
    class C9516g implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17468a;

        C9516g(Stripe4Service stripe4Service, CompletionHandler completionHandler) {
            this.f17468a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17468a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17468a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe4Service$g0 */
    public interface C9517g0 {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe4Service$h */
    class C9518h implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17469a;

        C9518h(Stripe4Service stripe4Service, CompletionHandler completionHandler) {
            this.f17469a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17469a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17469a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe4Service$h0 */
    public interface C9519h0 {
        /* renamed from: a */
        void mo31218a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe4Service$i */
    class C9520i implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17470a;

        C9520i(Stripe4Service stripe4Service, CompletionHandler completionHandler) {
            this.f17470a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17470a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17470a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe4Service$i0 */
    public interface C9521i0 {
        /* renamed from: a */
        void mo31220a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe4Service$j */
    class C9522j implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17471a;

        C9522j(Stripe4Service stripe4Service, CompletionHandler completionHandler) {
            this.f17471a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17471a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17471a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe4Service$j0 */
    public interface C9523j0 {
        /* renamed from: a */
        void mo31222a(C9533o0 o0Var);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe4Service$k */
    class C9524k implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17472a;

        C9524k(Stripe4Service stripe4Service, CompletionHandler completionHandler) {
            this.f17472a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17472a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f17472a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe4Service$k0 */
    public interface C9525k0 {
        /* renamed from: a */
        void mo28436a(C9533o0 o0Var, Long l, Long l2, String str, Long l3, Long l4, Long l5, Long l6, Long l7, Long l8);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe4Service$l */
    class C9526l implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17473a;

        C9526l(Stripe4Service stripe4Service, CompletionHandler completionHandler) {
            this.f17473a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17473a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17473a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe4Service$l0 */
    public interface C9527l0 {
        /* renamed from: a */
        void mo31224a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe4Service$m */
    class C9528m implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17474a;

        C9528m(Stripe4Service stripe4Service, CompletionHandler completionHandler) {
            this.f17474a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17474a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17474a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe4Service$m0 */
    public interface C9529m0 {
        /* renamed from: a */
        void mo31226a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe4Service$n */
    class C9530n implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17475a;

        C9530n(Stripe4Service stripe4Service, CompletionHandler completionHandler) {
            this.f17475a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17475a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17475a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe4Service$n0 */
    public interface C9531n0 {
        /* renamed from: a */
        void mo31228a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe4Service$o */
    class C9532o implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17476a;

        C9532o(Stripe4Service stripe4Service, CompletionHandler completionHandler) {
            this.f17476a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17476a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17476a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe4Service$o0 */
    public enum C9533o0 {
        undefined,
        on,
        off
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe4Service$p */
    class C9534p implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17481a;

        C9534p(Stripe4Service stripe4Service, CompletionHandler completionHandler) {
            this.f17481a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17481a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17481a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe4Service$p0 */
    public interface C9535p0 {
        /* renamed from: a */
        void mo28426a(Long l);

        /* renamed from: b */
        void mo28427b(Long l);

        /* renamed from: c */
        void mo28428c(Long l);

        /* renamed from: d */
        void mo28429d(Long l);

        /* renamed from: e */
        void mo28430e(String str);

        /* renamed from: f */
        void mo28431f(Long l);

        /* renamed from: g */
        void mo28432g(Long l);

        /* renamed from: h */
        void mo28433h(Long l);

        /* renamed from: i */
        void mo28434i(C9533o0 o0Var);

        /* renamed from: p */
        void mo28435p(Long l);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe4Service$q */
    class C9536q implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17482a;

        C9536q(Stripe4Service stripe4Service, CompletionHandler completionHandler) {
            this.f17482a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17482a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17482a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe4Service$r */
    class C9537r implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17483a;

        C9537r(Stripe4Service stripe4Service, CompletionHandler completionHandler) {
            this.f17483a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17483a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17483a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe4Service$s */
    class C9538s implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17484a;

        C9538s(Stripe4Service stripe4Service, CompletionHandler completionHandler) {
            this.f17484a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17484a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17484a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe4Service$t */
    class C9539t implements DeviceManipulator.PropertyChangedListener {

        /* renamed from: a */
        final /* synthetic */ C9535p0 f17485a;

        C9539t(Stripe4Service stripe4Service, C9535p0 p0Var) {
            this.f17485a = p0Var;
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
                java.lang.String r8 = "Ct"
                java.lang.String r9 = "FlowParams"
                java.lang.String r10 = "SaveState"
                switch(r0) {
                    case -2117953292: goto L_0x0066;
                    case -2002016140: goto L_0x005e;
                    case 2193: goto L_0x0056;
                    case 35911772: goto L_0x004e;
                    case 77306085: goto L_0x0046;
                    case 880790796: goto L_0x003e;
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
                r13 = 6
                goto L_0x006f
            L_0x002c:
                boolean r13 = r13.equals(r3)
                if (r13 == 0) goto L_0x006e
                r13 = 9
                goto L_0x006f
            L_0x0035:
                boolean r13 = r13.equals(r4)
                if (r13 == 0) goto L_0x006e
                r13 = 8
                goto L_0x006f
            L_0x003e:
                boolean r13 = r13.equals(r5)
                if (r13 == 0) goto L_0x006e
                r13 = 4
                goto L_0x006f
            L_0x0046:
                boolean r13 = r13.equals(r6)
                if (r13 == 0) goto L_0x006e
                r13 = 0
                goto L_0x006f
            L_0x004e:
                boolean r13 = r13.equals(r7)
                if (r13 == 0) goto L_0x006e
                r13 = 7
                goto L_0x006f
            L_0x0056:
                boolean r13 = r13.equals(r8)
                if (r13 == 0) goto L_0x006e
                r13 = 2
                goto L_0x006f
            L_0x005e:
                boolean r13 = r13.equals(r9)
                if (r13 == 0) goto L_0x006e
                r13 = 3
                goto L_0x006f
            L_0x0066:
                boolean r13 = r13.equals(r10)
                if (r13 == 0) goto L_0x006e
                r13 = 5
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
                com.miot.common.property.Property r13 = r12.getProperty(r3)
                boolean r13 = r13.isValueValid()
                if (r13 == 0) goto L_0x0158
                java.lang.Object r12 = r12.getValue(r3)
                java.lang.Long r12 = (java.lang.Long) r12
                com.yeelight.yeelib.device.xiaomi.Stripe4Service$p0 r13 = r11.f17485a
                r13.mo28435p(r12)
                goto L_0x0158
            L_0x008b:
                com.miot.common.property.Property r13 = r12.getProperty(r4)
                boolean r13 = r13.isValueValid()
                if (r13 == 0) goto L_0x0158
                java.lang.Object r12 = r12.getValue(r4)
                java.lang.Long r12 = (java.lang.Long) r12
                com.yeelight.yeelib.device.xiaomi.Stripe4Service$p0 r13 = r11.f17485a
                r13.mo28428c(r12)
                goto L_0x0158
            L_0x00a2:
                com.miot.common.property.Property r13 = r12.getProperty(r7)
                boolean r13 = r13.isValueValid()
                if (r13 == 0) goto L_0x0158
                java.lang.Object r12 = r12.getValue(r7)
                java.lang.Long r12 = (java.lang.Long) r12
                com.yeelight.yeelib.device.xiaomi.Stripe4Service$p0 r13 = r11.f17485a
                r13.mo28431f(r12)
                goto L_0x0158
            L_0x00b9:
                com.miot.common.property.Property r13 = r12.getProperty(r2)
                boolean r13 = r13.isValueValid()
                if (r13 == 0) goto L_0x0158
                java.lang.Object r12 = r12.getValue(r2)
                java.lang.Long r12 = (java.lang.Long) r12
                com.yeelight.yeelib.device.xiaomi.Stripe4Service$p0 r13 = r11.f17485a
                r13.mo28432g(r12)
                goto L_0x0158
            L_0x00d0:
                com.miot.common.property.Property r13 = r12.getProperty(r10)
                boolean r13 = r13.isValueValid()
                if (r13 == 0) goto L_0x0158
                java.lang.Object r12 = r12.getValue(r10)
                java.lang.Long r12 = (java.lang.Long) r12
                com.yeelight.yeelib.device.xiaomi.Stripe4Service$p0 r13 = r11.f17485a
                r13.mo28429d(r12)
                goto L_0x0158
            L_0x00e7:
                com.miot.common.property.Property r13 = r12.getProperty(r5)
                boolean r13 = r13.isValueValid()
                if (r13 == 0) goto L_0x0158
                java.lang.Object r12 = r12.getValue(r5)
                java.lang.Long r12 = (java.lang.Long) r12
                com.yeelight.yeelib.device.xiaomi.Stripe4Service$p0 r13 = r11.f17485a
                r13.mo28427b(r12)
                goto L_0x0158
            L_0x00fd:
                com.miot.common.property.Property r13 = r12.getProperty(r9)
                boolean r13 = r13.isValueValid()
                if (r13 == 0) goto L_0x0158
                java.lang.Object r12 = r12.getValue(r9)
                java.lang.String r12 = (java.lang.String) r12
                com.yeelight.yeelib.device.xiaomi.Stripe4Service$p0 r13 = r11.f17485a
                r13.mo28430e(r12)
                goto L_0x0158
            L_0x0113:
                com.miot.common.property.Property r13 = r12.getProperty(r8)
                boolean r13 = r13.isValueValid()
                if (r13 == 0) goto L_0x0158
                java.lang.Object r12 = r12.getValue(r8)
                java.lang.Long r12 = (java.lang.Long) r12
                com.yeelight.yeelib.device.xiaomi.Stripe4Service$p0 r13 = r11.f17485a
                r13.mo28433h(r12)
                goto L_0x0158
            L_0x0129:
                com.miot.common.property.Property r13 = r12.getProperty(r1)
                boolean r13 = r13.isValueValid()
                if (r13 == 0) goto L_0x0158
                java.lang.Object r12 = r12.getValue(r1)
                java.lang.Long r12 = (java.lang.Long) r12
                com.yeelight.yeelib.device.xiaomi.Stripe4Service$p0 r13 = r11.f17485a
                r13.mo28426a(r12)
                goto L_0x0158
            L_0x013f:
                com.miot.common.property.Property r13 = r12.getProperty(r6)
                boolean r13 = r13.isValueValid()
                if (r13 == 0) goto L_0x0158
                java.lang.Object r12 = r12.getValue(r6)
                java.lang.String r12 = (java.lang.String) r12
                com.yeelight.yeelib.device.xiaomi.Stripe4Service$o0 r12 = com.yeelight.yeelib.device.xiaomi.Stripe4Service.C9533o0.valueOf(r12)
                com.yeelight.yeelib.device.xiaomi.Stripe4Service$p0 r13 = r11.f17485a
                r13.mo28434i(r12)
            L_0x0158:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.xiaomi.Stripe4Service.C9539t.onPropertyChanged(com.miot.common.device.invocation.PropertyInfo, java.lang.String):void");
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe4Service$u */
    class C9540u implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17486a;

        C9540u(Stripe4Service stripe4Service, CompletionHandler completionHandler) {
            this.f17486a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17486a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f17486a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe4Service$v */
    class C9541v implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9525k0 f17487a;

        C9541v(Stripe4Service stripe4Service, C9525k0 k0Var) {
            this.f17487a = k0Var;
        }

        public void onFailed(int i, String str) {
            this.f17487a.onFailed(i, str);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v2, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.Long} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onSucceed(com.miot.common.device.invocation.PropertyInfo r15) {
            /*
                r14 = this;
                java.lang.String r0 = "Power"
                com.miot.common.property.Property r0 = r15.getProperty(r0)
                boolean r1 = r0.isValueValid()
                r2 = 0
                if (r1 == 0) goto L_0x0019
                java.lang.Object r0 = r0.getValue()
                java.lang.String r0 = (java.lang.String) r0
                com.yeelight.yeelib.device.xiaomi.Stripe4Service$o0 r0 = com.yeelight.yeelib.device.xiaomi.Stripe4Service.C9533o0.valueOf(r0)
                r4 = r0
                goto L_0x001a
            L_0x0019:
                r4 = r2
            L_0x001a:
                java.lang.String r0 = "Bright"
                com.miot.common.property.Property r0 = r15.getProperty(r0)
                boolean r1 = r0.isValueValid()
                if (r1 == 0) goto L_0x002e
                java.lang.Object r0 = r0.getValue()
                java.lang.Long r0 = (java.lang.Long) r0
                r5 = r0
                goto L_0x002f
            L_0x002e:
                r5 = r2
            L_0x002f:
                java.lang.String r0 = "Ct"
                com.miot.common.property.Property r0 = r15.getProperty(r0)
                boolean r1 = r0.isValueValid()
                if (r1 == 0) goto L_0x0043
                java.lang.Object r0 = r0.getValue()
                java.lang.Long r0 = (java.lang.Long) r0
                r6 = r0
                goto L_0x0044
            L_0x0043:
                r6 = r2
            L_0x0044:
                java.lang.String r0 = "FlowParams"
                com.miot.common.property.Property r0 = r15.getProperty(r0)
                boolean r1 = r0.isValueValid()
                if (r1 == 0) goto L_0x0058
                java.lang.Object r0 = r0.getValue()
                java.lang.String r0 = (java.lang.String) r0
                r7 = r0
                goto L_0x0059
            L_0x0058:
                r7 = r2
            L_0x0059:
                java.lang.String r0 = "DelayOff"
                com.miot.common.property.Property r0 = r15.getProperty(r0)
                boolean r1 = r0.isValueValid()
                if (r1 == 0) goto L_0x006d
                java.lang.Object r0 = r0.getValue()
                java.lang.Long r0 = (java.lang.Long) r0
                r8 = r0
                goto L_0x006e
            L_0x006d:
                r8 = r2
            L_0x006e:
                java.lang.String r0 = "SaveState"
                com.miot.common.property.Property r0 = r15.getProperty(r0)
                boolean r1 = r0.isValueValid()
                if (r1 == 0) goto L_0x0082
                java.lang.Object r0 = r0.getValue()
                java.lang.Long r0 = (java.lang.Long) r0
                r9 = r0
                goto L_0x0083
            L_0x0082:
                r9 = r2
            L_0x0083:
                java.lang.String r0 = "LanMode"
                com.miot.common.property.Property r0 = r15.getProperty(r0)
                boolean r1 = r0.isValueValid()
                if (r1 == 0) goto L_0x0097
                java.lang.Object r0 = r0.getValue()
                java.lang.Long r0 = (java.lang.Long) r0
                r10 = r0
                goto L_0x0098
            L_0x0097:
                r10 = r2
            L_0x0098:
                java.lang.String r0 = "onFromPower"
                com.miot.common.property.Property r0 = r15.getProperty(r0)
                boolean r1 = r0.isValueValid()
                if (r1 == 0) goto L_0x00ac
                java.lang.Object r0 = r0.getValue()
                java.lang.Long r0 = (java.lang.Long) r0
                r11 = r0
                goto L_0x00ad
            L_0x00ac:
                r11 = r2
            L_0x00ad:
                java.lang.String r0 = "Flowing"
                com.miot.common.property.Property r0 = r15.getProperty(r0)
                boolean r1 = r0.isValueValid()
                if (r1 == 0) goto L_0x00c1
                java.lang.Object r0 = r0.getValue()
                java.lang.Long r0 = (java.lang.Long) r0
                r12 = r0
                goto L_0x00c2
            L_0x00c1:
                r12 = r2
            L_0x00c2:
                java.lang.String r0 = "SmartSwitch"
                com.miot.common.property.Property r15 = r15.getProperty(r0)
                boolean r0 = r15.isValueValid()
                if (r0 == 0) goto L_0x00d5
                java.lang.Object r15 = r15.getValue()
                r2 = r15
                java.lang.Long r2 = (java.lang.Long) r2
            L_0x00d5:
                r13 = r2
                com.yeelight.yeelib.device.xiaomi.Stripe4Service$k0 r3 = r14.f17487a
                r3.mo28436a(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.xiaomi.Stripe4Service.C9541v.onSucceed(com.miot.common.device.invocation.PropertyInfo):void");
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe4Service$w */
    class C9542w implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9523j0 f17488a;

        C9542w(Stripe4Service stripe4Service, C9523j0 j0Var) {
            this.f17488a = j0Var;
        }

        public void onFailed(int i, String str) {
            this.f17488a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Power");
            if (property.isValueValid()) {
                this.f17488a.mo31222a(C9533o0.valueOf((String) propertyInfo.getValue("Power")));
                return;
            }
            C9523j0 j0Var = this.f17488a;
            j0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe4Service$x */
    class C9543x implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9511d0 f17489a;

        C9543x(Stripe4Service stripe4Service, C9511d0 d0Var) {
            this.f17489a = d0Var;
        }

        public void onFailed(int i, String str) {
            this.f17489a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Bright");
            if (property.isValueValid()) {
                this.f17489a.mo31210a((Long) propertyInfo.getValue("Bright"));
                return;
            }
            C9511d0 d0Var = this.f17489a;
            d0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe4Service$y */
    class C9544y implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9513e0 f17490a;

        C9544y(Stripe4Service stripe4Service, C9513e0 e0Var) {
            this.f17490a = e0Var;
        }

        public void onFailed(int i, String str) {
            this.f17490a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Ct");
            if (property.isValueValid()) {
                this.f17490a.mo31212a((Long) propertyInfo.getValue("Ct"));
                return;
            }
            C9513e0 e0Var = this.f17490a;
            e0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Stripe4Service$z */
    class C9545z implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9517g0 f17491a;

        C9545z(Stripe4Service stripe4Service, C9517g0 g0Var) {
            this.f17491a = g0Var;
        }

        public void onFailed(int i, String str) {
            this.f17491a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("FlowParams");
            if (property.isValueValid()) {
                this.f17491a.onSucceed((String) propertyInfo.getValue("FlowParams"));
                return;
            }
            C9517g0 g0Var = this.f17491a;
            g0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    public Stripe4Service(AbstractDevice abstractDevice) {
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
                MiotManager.getDeviceManipulator().invoke(create, new C9530n(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C9516g(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getBright(C9511d0 d0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Bright"), new C9543x(this, d0Var));
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
                MiotManager.getDeviceManipulator().invoke(create, new C9538s(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getCt(C9513e0 e0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Ct"), new C9544y(this, e0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getDelayOff(C9515f0 f0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "DelayOff"), new C9505a0(this, f0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowParams(C9517g0 g0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "FlowParams"), new C9545z(this, g0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowing(C9519h0 h0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Flowing"), new C9510d(this, h0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getLanMode(C9521i0 i0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "LanMode"), new C9506b(this, i0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getPower(C9523j0 j0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Power"), new C9542w(this, j0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getProperties(C9525k0 k0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            PropertyInfo create = PropertyInfoFactory.create(getService());
            create.addProperty(getService().getProperty("Power"));
            create.addProperty(getService().getProperty("Bright"));
            create.addProperty(getService().getProperty("Ct"));
            create.addProperty(getService().getProperty("FlowParams"));
            create.addProperty(getService().getProperty("DelayOff"));
            create.addProperty(getService().getProperty("SaveState"));
            create.addProperty(getService().getProperty("LanMode"));
            create.addProperty(getService().getProperty("onFromPower"));
            create.addProperty(getService().getProperty("Flowing"));
            create.addProperty(getService().getProperty("SmartSwitch"));
            MiotManager.getDeviceManipulator().readProperty(create, new C9541v(this, k0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getSaveState(C9527l0 l0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "SaveState"), new C9504a(this, l0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getSmartSwitch(C9529m0 m0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "SmartSwitch"), new C9512e(this, m0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getonFromPower(C9531n0 n0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "onFromPower"), new C9508c(this, n0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void openWithMode(C9533o0 o0Var, C9509c0 c0Var, Long l, Long l2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "openWithMode");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("Power", o0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Effect", c0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Duration", l)) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("Mode", l2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C9522j(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C9518h(this, completionHandler));
                return;
            }
            throw new MiotException("actionInfo is null");
        }
        throw new MiotException("device not configurated connection");
    }

    public void sendCmd(C9507b0 b0Var, String str, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "sendCmd");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("CmdKey", b0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("CmdValue", str)) {
                MiotManager.getDeviceManipulator().invoke(create, new C9534p(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setBright(Long l, C9509c0 c0Var, Long l2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setBright");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("Bright", l)) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Effect", c0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("Duration", l2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C9514f(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setCt(Long l, C9509c0 c0Var, Long l2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setCt");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("Ct", l)) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Effect", c0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("Duration", l2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C9537r(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C9532o(this, completionHandler));
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
            } else if (!create.setArgumentValue("FlowCount", l)) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("ParamFinish", l2)) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("ParamColors", str2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C9536q(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setPower(C9533o0 o0Var, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setPower");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (create.setArgumentValue("Power", o0Var.toString())) {
                MiotManager.getDeviceManipulator().invoke(create, new C9526l(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C9520i(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void subscribeNotifications(CompletionHandler completionHandler, C9535p0 p0Var) {
        if (completionHandler == null) {
            throw new IllegalArgumentException("handler is null");
        } else if (p0Var != null) {
            PropertyInfo create = PropertyInfoFactory.create(getService());
            for (Property next : getService().getProperties()) {
                if (next.getDefinition().isNotifiable()) {
                    create.addProperty(next);
                }
            }
            MiotManager.getDeviceManipulator().addPropertyChangedListener(create, new C9524k(this, completionHandler), new C9539t(this, p0Var));
        } else {
            throw new IllegalArgumentException("listener is null");
        }
    }

    public void toggle(CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "toggle");
            if (create != null) {
                MiotManager.getDeviceManipulator().invoke(create, new C9528m(this, completionHandler));
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
            MiotManager.getDeviceManipulator().removePropertyChangedListener(create, new C9540u(this, completionHandler));
            return;
        }
        throw new IllegalArgumentException("handler is null");
    }
}
