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

public class MonobService extends AbstractService {
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
    public static final String ACTION_setScene2 = "setScene2";
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
    public static final String PROPERTY_ParamColors = "ParamColors";
    public static final String PROPERTY_ParamCount = "ParamCount";
    public static final String PROPERTY_ParamFinish = "ParamFinish";
    public static final String PROPERTY_ParamModel = "ParamModel";
    public static final String PROPERTY_Power = "Power";
    public static final String PROPERTY_SaveState = "SaveState";
    public static final String PROPERTY_TransIntervalDflt = "TransIntervalDflt";
    public static final String PROPERTY_onFromPower = "onFromPower";
    private static final String TAG = "MonobService";
    private AbstractDevice mDevice = null;

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonobService$a */
    class C9312a implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9325g0 f17259a;

        C9312a(MonobService monobService, C9325g0 g0Var) {
            this.f17259a = g0Var;
        }

        public void onFailed(int i, String str) {
            this.f17259a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("LanMode");
            if (property.isValueValid()) {
                this.f17259a.mo31007a((Long) propertyInfo.getValue("LanMode"));
                return;
            }
            C9325g0 g0Var = this.f17259a;
            g0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonobService$a0 */
    public enum C9313a0 {
        undefined,
        cfg_pomodoro,
        cfg_lan_ctrl,
        cfg_save_state,
        cfg_init_power,
        trans_default
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonobService$b */
    class C9314b implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9333k0 f17267a;

        C9314b(MonobService monobService, C9333k0 k0Var) {
            this.f17267a = k0Var;
        }

        public void onFailed(int i, String str) {
            this.f17267a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("TransIntervalDflt");
            if (property.isValueValid()) {
                this.f17267a.mo31013a((Long) propertyInfo.getValue("TransIntervalDflt"));
                return;
            }
            C9333k0 k0Var = this.f17267a;
            k0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonobService$b0 */
    public enum C9315b0 {
        undefined,
        smooth,
        sudden
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonobService$c */
    class C9316c implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9335l0 f17272a;

        C9316c(MonobService monobService, C9335l0 l0Var) {
            this.f17272a = l0Var;
        }

        public void onFailed(int i, String str) {
            this.f17272a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("onFromPower");
            if (property.isValueValid()) {
                this.f17272a.mo31015a((Long) propertyInfo.getValue("onFromPower"));
                return;
            }
            C9335l0 l0Var = this.f17272a;
            l0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonobService$c0 */
    public interface C9317c0 {
        /* renamed from: a */
        void mo30999a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonobService$d */
    class C9318d implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9323f0 f17273a;

        C9318d(MonobService monobService, C9323f0 f0Var) {
            this.f17273a = f0Var;
        }

        public void onFailed(int i, String str) {
            this.f17273a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Flowing");
            if (property.isValueValid()) {
                this.f17273a.mo31005a((Long) propertyInfo.getValue("Flowing"));
                return;
            }
            C9323f0 f0Var = this.f17273a;
            f0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonobService$d0 */
    public interface C9319d0 {
        /* renamed from: a */
        void mo31001a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonobService$e */
    class C9320e implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17274a;

        C9320e(MonobService monobService, CompletionHandler completionHandler) {
            this.f17274a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17274a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17274a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonobService$e0 */
    public interface C9321e0 {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonobService$f */
    class C9322f implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17275a;

        C9322f(MonobService monobService, CompletionHandler completionHandler) {
            this.f17275a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17275a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17275a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonobService$f0 */
    public interface C9323f0 {
        /* renamed from: a */
        void mo31005a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonobService$g */
    class C9324g implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17276a;

        C9324g(MonobService monobService, CompletionHandler completionHandler) {
            this.f17276a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17276a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17276a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonobService$g0 */
    public interface C9325g0 {
        /* renamed from: a */
        void mo31007a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonobService$h */
    class C9326h implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17277a;

        C9326h(MonobService monobService, CompletionHandler completionHandler) {
            this.f17277a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17277a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17277a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonobService$h0 */
    public interface C9327h0 {
        /* renamed from: a */
        void mo31009a(C9337m0 m0Var);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonobService$i */
    class C9328i implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17278a;

        C9328i(MonobService monobService, CompletionHandler completionHandler) {
            this.f17278a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17278a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17278a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonobService$i0 */
    public interface C9329i0 {
        /* renamed from: a */
        void mo28806a(C9337m0 m0Var, Long l, Long l2, Long l3, String str, Long l4, Long l5, Long l6, Long l7);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonobService$j */
    class C9330j implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17279a;

        C9330j(MonobService monobService, CompletionHandler completionHandler) {
            this.f17279a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17279a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17279a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonobService$j0 */
    public interface C9331j0 {
        /* renamed from: a */
        void mo31011a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonobService$k */
    class C9332k implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17280a;

        C9332k(MonobService monobService, CompletionHandler completionHandler) {
            this.f17280a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17280a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f17280a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonobService$k0 */
    public interface C9333k0 {
        /* renamed from: a */
        void mo31013a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonobService$l */
    class C9334l implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17281a;

        C9334l(MonobService monobService, CompletionHandler completionHandler) {
            this.f17281a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17281a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17281a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonobService$l0 */
    public interface C9335l0 {
        /* renamed from: a */
        void mo31015a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonobService$m */
    class C9336m implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17282a;

        C9336m(MonobService monobService, CompletionHandler completionHandler) {
            this.f17282a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17282a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17282a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonobService$m0 */
    public enum C9337m0 {
        undefined,
        on,
        off
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonobService$n */
    class C9338n implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17287a;

        C9338n(MonobService monobService, CompletionHandler completionHandler) {
            this.f17287a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17287a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17287a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonobService$n0 */
    public interface C9339n0 {
        /* renamed from: a */
        void mo28797a(Long l);

        /* renamed from: b */
        void mo28798b(Long l);

        /* renamed from: c */
        void mo28799c(Long l);

        /* renamed from: d */
        void mo28800d(Long l);

        /* renamed from: e */
        void mo28801e(String str);

        /* renamed from: f */
        void mo28802f(Long l);

        /* renamed from: g */
        void mo28803g(Long l);

        /* renamed from: h */
        void mo28804h(C9337m0 m0Var);

        /* renamed from: q */
        void mo28805q(Long l);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonobService$o */
    class C9340o implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17288a;

        C9340o(MonobService monobService, CompletionHandler completionHandler) {
            this.f17288a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17288a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17288a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonobService$p */
    class C9341p implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17289a;

        C9341p(MonobService monobService, CompletionHandler completionHandler) {
            this.f17289a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17289a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17289a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonobService$q */
    class C9342q implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17290a;

        C9342q(MonobService monobService, CompletionHandler completionHandler) {
            this.f17290a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17290a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17290a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonobService$r */
    class C9343r implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17291a;

        C9343r(MonobService monobService, CompletionHandler completionHandler) {
            this.f17291a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17291a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17291a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonobService$s */
    class C9344s implements DeviceManipulator.PropertyChangedListener {

        /* renamed from: a */
        final /* synthetic */ C9339n0 f17292a;

        C9344s(MonobService monobService, C9339n0 n0Var) {
            this.f17292a = n0Var;
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onPropertyChanged(com.miot.common.device.invocation.PropertyInfo r11, java.lang.String r12) {
            /*
                r10 = this;
                int r0 = r12.hashCode()
                java.lang.String r1 = "Bright"
                java.lang.String r2 = "LanMode"
                java.lang.String r3 = "Flowing"
                java.lang.String r4 = "DelayOff"
                java.lang.String r5 = "Power"
                java.lang.String r6 = "onFromPower"
                java.lang.String r7 = "TransIntervalDflt"
                java.lang.String r8 = "FlowParams"
                java.lang.String r9 = "SaveState"
                switch(r0) {
                    case -2117953292: goto L_0x005b;
                    case -2002016140: goto L_0x0053;
                    case -718325097: goto L_0x004b;
                    case 35911772: goto L_0x0043;
                    case 77306085: goto L_0x003b;
                    case 880790796: goto L_0x0033;
                    case 898856916: goto L_0x002a;
                    case 1611821756: goto L_0x0022;
                    case 1998035738: goto L_0x001a;
                    default: goto L_0x0019;
                }
            L_0x0019:
                goto L_0x0063
            L_0x001a:
                boolean r12 = r12.equals(r1)
                if (r12 == 0) goto L_0x0063
                r12 = 1
                goto L_0x0064
            L_0x0022:
                boolean r12 = r12.equals(r2)
                if (r12 == 0) goto L_0x0063
                r12 = 5
                goto L_0x0064
            L_0x002a:
                boolean r12 = r12.equals(r3)
                if (r12 == 0) goto L_0x0063
                r12 = 8
                goto L_0x0064
            L_0x0033:
                boolean r12 = r12.equals(r4)
                if (r12 == 0) goto L_0x0063
                r12 = 2
                goto L_0x0064
            L_0x003b:
                boolean r12 = r12.equals(r5)
                if (r12 == 0) goto L_0x0063
                r12 = 0
                goto L_0x0064
            L_0x0043:
                boolean r12 = r12.equals(r6)
                if (r12 == 0) goto L_0x0063
                r12 = 7
                goto L_0x0064
            L_0x004b:
                boolean r12 = r12.equals(r7)
                if (r12 == 0) goto L_0x0063
                r12 = 6
                goto L_0x0064
            L_0x0053:
                boolean r12 = r12.equals(r8)
                if (r12 == 0) goto L_0x0063
                r12 = 4
                goto L_0x0064
            L_0x005b:
                boolean r12 = r12.equals(r9)
                if (r12 == 0) goto L_0x0063
                r12 = 3
                goto L_0x0064
            L_0x0063:
                r12 = -1
            L_0x0064:
                switch(r12) {
                    case 0: goto L_0x011d;
                    case 1: goto L_0x0107;
                    case 2: goto L_0x00f1;
                    case 3: goto L_0x00db;
                    case 4: goto L_0x00c5;
                    case 5: goto L_0x00ae;
                    case 6: goto L_0x0097;
                    case 7: goto L_0x0080;
                    case 8: goto L_0x0069;
                    default: goto L_0x0067;
                }
            L_0x0067:
                goto L_0x0136
            L_0x0069:
                com.miot.common.property.Property r12 = r11.getProperty(r3)
                boolean r12 = r12.isValueValid()
                if (r12 == 0) goto L_0x0136
                java.lang.Object r11 = r11.getValue(r3)
                java.lang.Long r11 = (java.lang.Long) r11
                com.yeelight.yeelib.device.xiaomi.MonobService$n0 r12 = r10.f17292a
                r12.mo28799c(r11)
                goto L_0x0136
            L_0x0080:
                com.miot.common.property.Property r12 = r11.getProperty(r6)
                boolean r12 = r12.isValueValid()
                if (r12 == 0) goto L_0x0136
                java.lang.Object r11 = r11.getValue(r6)
                java.lang.Long r11 = (java.lang.Long) r11
                com.yeelight.yeelib.device.xiaomi.MonobService$n0 r12 = r10.f17292a
                r12.mo28802f(r11)
                goto L_0x0136
            L_0x0097:
                com.miot.common.property.Property r12 = r11.getProperty(r7)
                boolean r12 = r12.isValueValid()
                if (r12 == 0) goto L_0x0136
                java.lang.Object r11 = r11.getValue(r7)
                java.lang.Long r11 = (java.lang.Long) r11
                com.yeelight.yeelib.device.xiaomi.MonobService$n0 r12 = r10.f17292a
                r12.mo28805q(r11)
                goto L_0x0136
            L_0x00ae:
                com.miot.common.property.Property r12 = r11.getProperty(r2)
                boolean r12 = r12.isValueValid()
                if (r12 == 0) goto L_0x0136
                java.lang.Object r11 = r11.getValue(r2)
                java.lang.Long r11 = (java.lang.Long) r11
                com.yeelight.yeelib.device.xiaomi.MonobService$n0 r12 = r10.f17292a
                r12.mo28803g(r11)
                goto L_0x0136
            L_0x00c5:
                com.miot.common.property.Property r12 = r11.getProperty(r8)
                boolean r12 = r12.isValueValid()
                if (r12 == 0) goto L_0x0136
                java.lang.Object r11 = r11.getValue(r8)
                java.lang.String r11 = (java.lang.String) r11
                com.yeelight.yeelib.device.xiaomi.MonobService$n0 r12 = r10.f17292a
                r12.mo28801e(r11)
                goto L_0x0136
            L_0x00db:
                com.miot.common.property.Property r12 = r11.getProperty(r9)
                boolean r12 = r12.isValueValid()
                if (r12 == 0) goto L_0x0136
                java.lang.Object r11 = r11.getValue(r9)
                java.lang.Long r11 = (java.lang.Long) r11
                com.yeelight.yeelib.device.xiaomi.MonobService$n0 r12 = r10.f17292a
                r12.mo28800d(r11)
                goto L_0x0136
            L_0x00f1:
                com.miot.common.property.Property r12 = r11.getProperty(r4)
                boolean r12 = r12.isValueValid()
                if (r12 == 0) goto L_0x0136
                java.lang.Object r11 = r11.getValue(r4)
                java.lang.Long r11 = (java.lang.Long) r11
                com.yeelight.yeelib.device.xiaomi.MonobService$n0 r12 = r10.f17292a
                r12.mo28798b(r11)
                goto L_0x0136
            L_0x0107:
                com.miot.common.property.Property r12 = r11.getProperty(r1)
                boolean r12 = r12.isValueValid()
                if (r12 == 0) goto L_0x0136
                java.lang.Object r11 = r11.getValue(r1)
                java.lang.Long r11 = (java.lang.Long) r11
                com.yeelight.yeelib.device.xiaomi.MonobService$n0 r12 = r10.f17292a
                r12.mo28797a(r11)
                goto L_0x0136
            L_0x011d:
                com.miot.common.property.Property r12 = r11.getProperty(r5)
                boolean r12 = r12.isValueValid()
                if (r12 == 0) goto L_0x0136
                java.lang.Object r11 = r11.getValue(r5)
                java.lang.String r11 = (java.lang.String) r11
                com.yeelight.yeelib.device.xiaomi.MonobService$m0 r11 = com.yeelight.yeelib.device.xiaomi.MonobService.C9337m0.valueOf(r11)
                com.yeelight.yeelib.device.xiaomi.MonobService$n0 r12 = r10.f17292a
                r12.mo28804h(r11)
            L_0x0136:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.xiaomi.MonobService.C9344s.onPropertyChanged(com.miot.common.device.invocation.PropertyInfo, java.lang.String):void");
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonobService$t */
    class C9345t implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17293a;

        C9345t(MonobService monobService, CompletionHandler completionHandler) {
            this.f17293a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17293a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f17293a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonobService$u */
    class C9346u implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9329i0 f17294a;

        C9346u(MonobService monobService, C9329i0 i0Var) {
            this.f17294a = i0Var;
        }

        public void onFailed(int i, String str) {
            this.f17294a.onFailed(i, str);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v2, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.Long} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onSucceed(com.miot.common.device.invocation.PropertyInfo r14) {
            /*
                r13 = this;
                java.lang.String r0 = "Power"
                com.miot.common.property.Property r0 = r14.getProperty(r0)
                boolean r1 = r0.isValueValid()
                r2 = 0
                if (r1 == 0) goto L_0x0019
                java.lang.Object r0 = r0.getValue()
                java.lang.String r0 = (java.lang.String) r0
                com.yeelight.yeelib.device.xiaomi.MonobService$m0 r0 = com.yeelight.yeelib.device.xiaomi.MonobService.C9337m0.valueOf(r0)
                r4 = r0
                goto L_0x001a
            L_0x0019:
                r4 = r2
            L_0x001a:
                java.lang.String r0 = "Bright"
                com.miot.common.property.Property r0 = r14.getProperty(r0)
                boolean r1 = r0.isValueValid()
                if (r1 == 0) goto L_0x002e
                java.lang.Object r0 = r0.getValue()
                java.lang.Long r0 = (java.lang.Long) r0
                r5 = r0
                goto L_0x002f
            L_0x002e:
                r5 = r2
            L_0x002f:
                java.lang.String r0 = "DelayOff"
                com.miot.common.property.Property r0 = r14.getProperty(r0)
                boolean r1 = r0.isValueValid()
                if (r1 == 0) goto L_0x0043
                java.lang.Object r0 = r0.getValue()
                java.lang.Long r0 = (java.lang.Long) r0
                r6 = r0
                goto L_0x0044
            L_0x0043:
                r6 = r2
            L_0x0044:
                java.lang.String r0 = "SaveState"
                com.miot.common.property.Property r0 = r14.getProperty(r0)
                boolean r1 = r0.isValueValid()
                if (r1 == 0) goto L_0x0058
                java.lang.Object r0 = r0.getValue()
                java.lang.Long r0 = (java.lang.Long) r0
                r7 = r0
                goto L_0x0059
            L_0x0058:
                r7 = r2
            L_0x0059:
                java.lang.String r0 = "FlowParams"
                com.miot.common.property.Property r0 = r14.getProperty(r0)
                boolean r1 = r0.isValueValid()
                if (r1 == 0) goto L_0x006d
                java.lang.Object r0 = r0.getValue()
                java.lang.String r0 = (java.lang.String) r0
                r8 = r0
                goto L_0x006e
            L_0x006d:
                r8 = r2
            L_0x006e:
                java.lang.String r0 = "LanMode"
                com.miot.common.property.Property r0 = r14.getProperty(r0)
                boolean r1 = r0.isValueValid()
                if (r1 == 0) goto L_0x0082
                java.lang.Object r0 = r0.getValue()
                java.lang.Long r0 = (java.lang.Long) r0
                r9 = r0
                goto L_0x0083
            L_0x0082:
                r9 = r2
            L_0x0083:
                java.lang.String r0 = "TransIntervalDflt"
                com.miot.common.property.Property r0 = r14.getProperty(r0)
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
                com.miot.common.property.Property r0 = r14.getProperty(r0)
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
                com.miot.common.property.Property r14 = r14.getProperty(r0)
                boolean r0 = r14.isValueValid()
                if (r0 == 0) goto L_0x00c0
                java.lang.Object r14 = r14.getValue()
                r2 = r14
                java.lang.Long r2 = (java.lang.Long) r2
            L_0x00c0:
                r12 = r2
                com.yeelight.yeelib.device.xiaomi.MonobService$i0 r3 = r13.f17294a
                r3.mo28806a(r4, r5, r6, r7, r8, r9, r10, r11, r12)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.xiaomi.MonobService.C9346u.onSucceed(com.miot.common.device.invocation.PropertyInfo):void");
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonobService$v */
    class C9347v implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9327h0 f17295a;

        C9347v(MonobService monobService, C9327h0 h0Var) {
            this.f17295a = h0Var;
        }

        public void onFailed(int i, String str) {
            this.f17295a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Power");
            if (property.isValueValid()) {
                this.f17295a.mo31009a(C9337m0.valueOf((String) propertyInfo.getValue("Power")));
                return;
            }
            C9327h0 h0Var = this.f17295a;
            h0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonobService$w */
    class C9348w implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9317c0 f17296a;

        C9348w(MonobService monobService, C9317c0 c0Var) {
            this.f17296a = c0Var;
        }

        public void onFailed(int i, String str) {
            this.f17296a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Bright");
            if (property.isValueValid()) {
                this.f17296a.mo30999a((Long) propertyInfo.getValue("Bright"));
                return;
            }
            C9317c0 c0Var = this.f17296a;
            c0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonobService$x */
    class C9349x implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9319d0 f17297a;

        C9349x(MonobService monobService, C9319d0 d0Var) {
            this.f17297a = d0Var;
        }

        public void onFailed(int i, String str) {
            this.f17297a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("DelayOff");
            if (property.isValueValid()) {
                this.f17297a.mo31001a((Long) propertyInfo.getValue("DelayOff"));
                return;
            }
            C9319d0 d0Var = this.f17297a;
            d0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonobService$y */
    class C9350y implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9331j0 f17298a;

        C9350y(MonobService monobService, C9331j0 j0Var) {
            this.f17298a = j0Var;
        }

        public void onFailed(int i, String str) {
            this.f17298a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("SaveState");
            if (property.isValueValid()) {
                this.f17298a.mo31011a((Long) propertyInfo.getValue("SaveState"));
                return;
            }
            C9331j0 j0Var = this.f17298a;
            j0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonobService$z */
    class C9351z implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9321e0 f17299a;

        C9351z(MonobService monobService, C9321e0 e0Var) {
            this.f17299a = e0Var;
        }

        public void onFailed(int i, String str) {
            this.f17299a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("FlowParams");
            if (property.isValueValid()) {
                this.f17299a.onSucceed((String) propertyInfo.getValue("FlowParams"));
                return;
            }
            C9321e0 e0Var = this.f17299a;
            e0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    public MonobService(AbstractDevice abstractDevice) {
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
                MiotManager.getDeviceManipulator().invoke(create, new C9338n(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C9322f(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getBright(C9317c0 c0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Bright"), new C9348w(this, c0Var));
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
                MiotManager.getDeviceManipulator().invoke(create, new C9343r(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getDelayOff(C9319d0 d0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "DelayOff"), new C9349x(this, d0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowParams(C9321e0 e0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "FlowParams"), new C9351z(this, e0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowing(C9323f0 f0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Flowing"), new C9318d(this, f0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getLanMode(C9325g0 g0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "LanMode"), new C9312a(this, g0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getPower(C9327h0 h0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Power"), new C9347v(this, h0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getProperties(C9329i0 i0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            PropertyInfo create = PropertyInfoFactory.create(getService());
            create.addProperty(getService().getProperty("Power"));
            create.addProperty(getService().getProperty("Bright"));
            create.addProperty(getService().getProperty("DelayOff"));
            create.addProperty(getService().getProperty("SaveState"));
            create.addProperty(getService().getProperty("FlowParams"));
            create.addProperty(getService().getProperty("LanMode"));
            create.addProperty(getService().getProperty("TransIntervalDflt"));
            create.addProperty(getService().getProperty("onFromPower"));
            create.addProperty(getService().getProperty("Flowing"));
            MiotManager.getDeviceManipulator().readProperty(create, new C9346u(this, i0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getSaveState(C9331j0 j0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "SaveState"), new C9350y(this, j0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getTransIntervalDflt(C9333k0 k0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "TransIntervalDflt"), new C9314b(this, k0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getonFromPower(C9335l0 l0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "onFromPower"), new C9316c(this, l0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void openWithMode(C9337m0 m0Var, C9315b0 b0Var, Long l, Long l2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "openWithMode");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("Power", m0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Effect", b0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Duration", l)) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("Mode", l2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C9330j(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C9324g(this, completionHandler));
                return;
            }
            throw new MiotException("actionInfo is null");
        }
        throw new MiotException("device not configurated connection");
    }

    public void sendCmd(C9313a0 a0Var, String str, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "sendCmd");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("CmdKey", a0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("CmdValue", str)) {
                MiotManager.getDeviceManipulator().invoke(create, new C9341p(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C9320e(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C9340o(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C9342q(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setPower(C9337m0 m0Var, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setPower");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (create.setArgumentValue("Power", m0Var.toString())) {
                MiotManager.getDeviceManipulator().invoke(create, new C9334l(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C9326h(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C9328i(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void subscribeNotifications(CompletionHandler completionHandler, C9339n0 n0Var) {
        if (completionHandler == null) {
            throw new IllegalArgumentException("handler is null");
        } else if (n0Var != null) {
            PropertyInfo create = PropertyInfoFactory.create(getService());
            for (Property next : getService().getProperties()) {
                if (next.getDefinition().isNotifiable()) {
                    create.addProperty(next);
                }
            }
            MiotManager.getDeviceManipulator().addPropertyChangedListener(create, new C9332k(this, completionHandler), new C9344s(this, n0Var));
        } else {
            throw new IllegalArgumentException("listener is null");
        }
    }

    public void toggle(CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "toggle");
            if (create != null) {
                MiotManager.getDeviceManipulator().invoke(create, new C9336m(this, completionHandler));
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
            MiotManager.getDeviceManipulator().removePropertyChangedListener(create, new C9345t(this, completionHandler));
            return;
        }
        throw new IllegalArgumentException("handler is null");
    }
}
