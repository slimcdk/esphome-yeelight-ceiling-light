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

public class CtService extends AbstractService {
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
    public static final String PROPERTY_onFromPower = "onFromPower";
    private static final String TAG = "CtService";
    private AbstractDevice mDevice = null;

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtService$a */
    class C8762a implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8783k0 f16713a;

        C8762a(CtService ctService, C8783k0 k0Var) {
            this.f16713a = k0Var;
        }

        public void onFailed(int i, String str) {
            this.f16713a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("SaveState");
            if (property.isValueValid()) {
                this.f16713a.mo30403a((Long) propertyInfo.getValue("SaveState"));
                return;
            }
            C8783k0 k0Var = this.f16713a;
            k0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtService$a0 */
    public enum C8763a0 {
        undefined,
        cfg_pomodoro,
        cfg_lan_ctrl,
        cfg_save_state,
        cfg_init_power
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtService$b */
    class C8764b implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8777h0 f16720a;

        C8764b(CtService ctService, C8777h0 h0Var) {
            this.f16720a = h0Var;
        }

        public void onFailed(int i, String str) {
            this.f16720a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("LanMode");
            if (property.isValueValid()) {
                this.f16720a.mo30399a((Long) propertyInfo.getValue("LanMode"));
                return;
            }
            C8777h0 h0Var = this.f16720a;
            h0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtService$b0 */
    public enum C8765b0 {
        undefined,
        smooth,
        sudden
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtService$c */
    class C8766c implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8785l0 f16725a;

        C8766c(CtService ctService, C8785l0 l0Var) {
            this.f16725a = l0Var;
        }

        public void onFailed(int i, String str) {
            this.f16725a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("onFromPower");
            if (property.isValueValid()) {
                this.f16725a.mo30405a((Long) propertyInfo.getValue("onFromPower"));
                return;
            }
            C8785l0 l0Var = this.f16725a;
            l0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtService$c0 */
    public interface C8767c0 {
        /* renamed from: a */
        void mo30389a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtService$d */
    class C8768d implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8775g0 f16726a;

        C8768d(CtService ctService, C8775g0 g0Var) {
            this.f16726a = g0Var;
        }

        public void onFailed(int i, String str) {
            this.f16726a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Flowing");
            if (property.isValueValid()) {
                this.f16726a.mo30397a((Long) propertyInfo.getValue("Flowing"));
                return;
            }
            C8775g0 g0Var = this.f16726a;
            g0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtService$d0 */
    public interface C8769d0 {
        /* renamed from: a */
        void mo30391a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtService$e */
    class C8770e implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16727a;

        C8770e(CtService ctService, CompletionHandler completionHandler) {
            this.f16727a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16727a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16727a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtService$e0 */
    public interface C8771e0 {
        /* renamed from: a */
        void mo30393a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtService$f */
    class C8772f implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16728a;

        C8772f(CtService ctService, CompletionHandler completionHandler) {
            this.f16728a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16728a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16728a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtService$f0 */
    public interface C8773f0 {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtService$g */
    class C8774g implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16729a;

        C8774g(CtService ctService, CompletionHandler completionHandler) {
            this.f16729a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16729a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16729a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtService$g0 */
    public interface C8775g0 {
        /* renamed from: a */
        void mo30397a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtService$h */
    class C8776h implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16730a;

        C8776h(CtService ctService, CompletionHandler completionHandler) {
            this.f16730a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16730a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16730a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtService$h0 */
    public interface C8777h0 {
        /* renamed from: a */
        void mo30399a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtService$i */
    class C8778i implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16731a;

        C8778i(CtService ctService, CompletionHandler completionHandler) {
            this.f16731a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16731a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16731a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtService$i0 */
    public interface C8779i0 {
        /* renamed from: a */
        void mo30401a(C8787m0 m0Var);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtService$j */
    class C8780j implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16732a;

        C8780j(CtService ctService, CompletionHandler completionHandler) {
            this.f16732a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16732a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16732a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtService$j0 */
    public interface C8781j0 {
        /* renamed from: a */
        void mo28767a(C8787m0 m0Var, Long l, Long l2, String str, Long l3, Long l4, Long l5, Long l6, Long l7);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtService$k */
    class C8782k implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16733a;

        C8782k(CtService ctService, CompletionHandler completionHandler) {
            this.f16733a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16733a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f16733a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtService$k0 */
    public interface C8783k0 {
        /* renamed from: a */
        void mo30403a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtService$l */
    class C8784l implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16734a;

        C8784l(CtService ctService, CompletionHandler completionHandler) {
            this.f16734a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16734a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16734a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtService$l0 */
    public interface C8785l0 {
        /* renamed from: a */
        void mo30405a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtService$m */
    class C8786m implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16735a;

        C8786m(CtService ctService, CompletionHandler completionHandler) {
            this.f16735a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16735a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16735a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtService$m0 */
    public enum C8787m0 {
        undefined,
        on,
        off
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtService$n */
    class C8788n implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16740a;

        C8788n(CtService ctService, CompletionHandler completionHandler) {
            this.f16740a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16740a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16740a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtService$n0 */
    public interface C8789n0 {
        /* renamed from: a */
        void mo28758a(Long l);

        /* renamed from: b */
        void mo28759b(Long l);

        /* renamed from: c */
        void mo28760c(Long l);

        /* renamed from: d */
        void mo28761d(Long l);

        /* renamed from: e */
        void mo28762e(String str);

        /* renamed from: f */
        void mo28763f(Long l);

        /* renamed from: g */
        void mo28764g(Long l);

        /* renamed from: h */
        void mo28765h(Long l);

        /* renamed from: i */
        void mo28766i(C8787m0 m0Var);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtService$o */
    class C8790o implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16741a;

        C8790o(CtService ctService, CompletionHandler completionHandler) {
            this.f16741a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16741a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16741a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtService$p */
    class C8791p implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16742a;

        C8791p(CtService ctService, CompletionHandler completionHandler) {
            this.f16742a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16742a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16742a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtService$q */
    class C8792q implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16743a;

        C8792q(CtService ctService, CompletionHandler completionHandler) {
            this.f16743a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16743a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16743a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtService$r */
    class C8793r implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16744a;

        C8793r(CtService ctService, CompletionHandler completionHandler) {
            this.f16744a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16744a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16744a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtService$s */
    class C8794s implements DeviceManipulator.PropertyChangedListener {

        /* renamed from: a */
        final /* synthetic */ C8789n0 f16745a;

        C8794s(CtService ctService, C8789n0 n0Var) {
            this.f16745a = n0Var;
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
                java.lang.String r7 = "Ct"
                java.lang.String r8 = "FlowParams"
                java.lang.String r9 = "SaveState"
                switch(r0) {
                    case -2117953292: goto L_0x005b;
                    case -2002016140: goto L_0x0053;
                    case 2193: goto L_0x004b;
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
                r12 = 6
                goto L_0x0064
            L_0x002a:
                boolean r12 = r12.equals(r3)
                if (r12 == 0) goto L_0x0063
                r12 = 8
                goto L_0x0064
            L_0x0033:
                boolean r12 = r12.equals(r4)
                if (r12 == 0) goto L_0x0063
                r12 = 4
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
                r12 = 2
                goto L_0x0064
            L_0x0053:
                boolean r12 = r12.equals(r8)
                if (r12 == 0) goto L_0x0063
                r12 = 3
                goto L_0x0064
            L_0x005b:
                boolean r12 = r12.equals(r9)
                if (r12 == 0) goto L_0x0063
                r12 = 5
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
                com.yeelight.yeelib.device.xiaomi.CtService$n0 r12 = r10.f16745a
                r12.mo28760c(r11)
                goto L_0x0136
            L_0x0080:
                com.miot.common.property.Property r12 = r11.getProperty(r6)
                boolean r12 = r12.isValueValid()
                if (r12 == 0) goto L_0x0136
                java.lang.Object r11 = r11.getValue(r6)
                java.lang.Long r11 = (java.lang.Long) r11
                com.yeelight.yeelib.device.xiaomi.CtService$n0 r12 = r10.f16745a
                r12.mo28763f(r11)
                goto L_0x0136
            L_0x0097:
                com.miot.common.property.Property r12 = r11.getProperty(r2)
                boolean r12 = r12.isValueValid()
                if (r12 == 0) goto L_0x0136
                java.lang.Object r11 = r11.getValue(r2)
                java.lang.Long r11 = (java.lang.Long) r11
                com.yeelight.yeelib.device.xiaomi.CtService$n0 r12 = r10.f16745a
                r12.mo28764g(r11)
                goto L_0x0136
            L_0x00ae:
                com.miot.common.property.Property r12 = r11.getProperty(r9)
                boolean r12 = r12.isValueValid()
                if (r12 == 0) goto L_0x0136
                java.lang.Object r11 = r11.getValue(r9)
                java.lang.Long r11 = (java.lang.Long) r11
                com.yeelight.yeelib.device.xiaomi.CtService$n0 r12 = r10.f16745a
                r12.mo28761d(r11)
                goto L_0x0136
            L_0x00c5:
                com.miot.common.property.Property r12 = r11.getProperty(r4)
                boolean r12 = r12.isValueValid()
                if (r12 == 0) goto L_0x0136
                java.lang.Object r11 = r11.getValue(r4)
                java.lang.Long r11 = (java.lang.Long) r11
                com.yeelight.yeelib.device.xiaomi.CtService$n0 r12 = r10.f16745a
                r12.mo28759b(r11)
                goto L_0x0136
            L_0x00db:
                com.miot.common.property.Property r12 = r11.getProperty(r8)
                boolean r12 = r12.isValueValid()
                if (r12 == 0) goto L_0x0136
                java.lang.Object r11 = r11.getValue(r8)
                java.lang.String r11 = (java.lang.String) r11
                com.yeelight.yeelib.device.xiaomi.CtService$n0 r12 = r10.f16745a
                r12.mo28762e(r11)
                goto L_0x0136
            L_0x00f1:
                com.miot.common.property.Property r12 = r11.getProperty(r7)
                boolean r12 = r12.isValueValid()
                if (r12 == 0) goto L_0x0136
                java.lang.Object r11 = r11.getValue(r7)
                java.lang.Long r11 = (java.lang.Long) r11
                com.yeelight.yeelib.device.xiaomi.CtService$n0 r12 = r10.f16745a
                r12.mo28765h(r11)
                goto L_0x0136
            L_0x0107:
                com.miot.common.property.Property r12 = r11.getProperty(r1)
                boolean r12 = r12.isValueValid()
                if (r12 == 0) goto L_0x0136
                java.lang.Object r11 = r11.getValue(r1)
                java.lang.Long r11 = (java.lang.Long) r11
                com.yeelight.yeelib.device.xiaomi.CtService$n0 r12 = r10.f16745a
                r12.mo28758a(r11)
                goto L_0x0136
            L_0x011d:
                com.miot.common.property.Property r12 = r11.getProperty(r5)
                boolean r12 = r12.isValueValid()
                if (r12 == 0) goto L_0x0136
                java.lang.Object r11 = r11.getValue(r5)
                java.lang.String r11 = (java.lang.String) r11
                com.yeelight.yeelib.device.xiaomi.CtService$m0 r11 = com.yeelight.yeelib.device.xiaomi.CtService.C8787m0.valueOf(r11)
                com.yeelight.yeelib.device.xiaomi.CtService$n0 r12 = r10.f16745a
                r12.mo28766i(r11)
            L_0x0136:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.xiaomi.CtService.C8794s.onPropertyChanged(com.miot.common.device.invocation.PropertyInfo, java.lang.String):void");
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtService$t */
    class C8795t implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16746a;

        C8795t(CtService ctService, CompletionHandler completionHandler) {
            this.f16746a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16746a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f16746a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtService$u */
    class C8796u implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8781j0 f16747a;

        C8796u(CtService ctService, C8781j0 j0Var) {
            this.f16747a = j0Var;
        }

        public void onFailed(int i, String str) {
            this.f16747a.onFailed(i, str);
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
                com.yeelight.yeelib.device.xiaomi.CtService$m0 r0 = com.yeelight.yeelib.device.xiaomi.CtService.C8787m0.valueOf(r0)
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
                java.lang.String r0 = "Ct"
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
                java.lang.String r0 = "FlowParams"
                com.miot.common.property.Property r0 = r14.getProperty(r0)
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
                com.miot.common.property.Property r0 = r14.getProperty(r0)
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
                java.lang.String r0 = "LanMode"
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
                com.yeelight.yeelib.device.xiaomi.CtService$j0 r3 = r13.f16747a
                r3.mo28767a(r4, r5, r6, r7, r8, r9, r10, r11, r12)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.xiaomi.CtService.C8796u.onSucceed(com.miot.common.device.invocation.PropertyInfo):void");
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtService$v */
    class C8797v implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8779i0 f16748a;

        C8797v(CtService ctService, C8779i0 i0Var) {
            this.f16748a = i0Var;
        }

        public void onFailed(int i, String str) {
            this.f16748a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Power");
            if (property.isValueValid()) {
                this.f16748a.mo30401a(C8787m0.valueOf((String) propertyInfo.getValue("Power")));
                return;
            }
            C8779i0 i0Var = this.f16748a;
            i0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtService$w */
    class C8798w implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8767c0 f16749a;

        C8798w(CtService ctService, C8767c0 c0Var) {
            this.f16749a = c0Var;
        }

        public void onFailed(int i, String str) {
            this.f16749a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Bright");
            if (property.isValueValid()) {
                this.f16749a.mo30389a((Long) propertyInfo.getValue("Bright"));
                return;
            }
            C8767c0 c0Var = this.f16749a;
            c0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtService$x */
    class C8799x implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8769d0 f16750a;

        C8799x(CtService ctService, C8769d0 d0Var) {
            this.f16750a = d0Var;
        }

        public void onFailed(int i, String str) {
            this.f16750a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Ct");
            if (property.isValueValid()) {
                this.f16750a.mo30391a((Long) propertyInfo.getValue("Ct"));
                return;
            }
            C8769d0 d0Var = this.f16750a;
            d0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtService$y */
    class C8800y implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8773f0 f16751a;

        C8800y(CtService ctService, C8773f0 f0Var) {
            this.f16751a = f0Var;
        }

        public void onFailed(int i, String str) {
            this.f16751a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("FlowParams");
            if (property.isValueValid()) {
                this.f16751a.onSucceed((String) propertyInfo.getValue("FlowParams"));
                return;
            }
            C8773f0 f0Var = this.f16751a;
            f0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtService$z */
    class C8801z implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8771e0 f16752a;

        C8801z(CtService ctService, C8771e0 e0Var) {
            this.f16752a = e0Var;
        }

        public void onFailed(int i, String str) {
            this.f16752a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("DelayOff");
            if (property.isValueValid()) {
                this.f16752a.mo30393a((Long) propertyInfo.getValue("DelayOff"));
                return;
            }
            C8771e0 e0Var = this.f16752a;
            e0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    public CtService(AbstractDevice abstractDevice) {
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
                MiotManager.getDeviceManipulator().invoke(create, new C8786m(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8772f(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getBright(C8767c0 c0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Bright"), new C8798w(this, c0Var));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8793r(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getCt(C8769d0 d0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Ct"), new C8799x(this, d0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getDelayOff(C8771e0 e0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "DelayOff"), new C8801z(this, e0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowParams(C8773f0 f0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "FlowParams"), new C8800y(this, f0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowing(C8775g0 g0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Flowing"), new C8768d(this, g0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getLanMode(C8777h0 h0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "LanMode"), new C8764b(this, h0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getPower(C8779i0 i0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Power"), new C8797v(this, i0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getProperties(C8781j0 j0Var) {
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
            MiotManager.getDeviceManipulator().readProperty(create, new C8796u(this, j0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getSaveState(C8783k0 k0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "SaveState"), new C8762a(this, k0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getonFromPower(C8785l0 l0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "onFromPower"), new C8766c(this, l0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void openWithMode(C8787m0 m0Var, C8765b0 b0Var, Long l, Long l2, CompletionHandler completionHandler) {
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
                MiotManager.getDeviceManipulator().invoke(create, new C8778i(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8774g(this, completionHandler));
                return;
            }
            throw new MiotException("actionInfo is null");
        }
        throw new MiotException("device not configurated connection");
    }

    public void sendCmd(C8763a0 a0Var, String str, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "sendCmd");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("CmdKey", a0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("CmdValue", str)) {
                MiotManager.getDeviceManipulator().invoke(create, new C8790o(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setBright(Long l, C8765b0 b0Var, Long l2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setBright");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("Bright", l)) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Effect", b0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("Duration", l2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C8770e(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setCt(Long l, C8765b0 b0Var, Long l2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setCt");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("Ct", l)) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Effect", b0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("Duration", l2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C8792q(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8788n(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8791p(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setPower(C8787m0 m0Var, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setPower");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (create.setArgumentValue("Power", m0Var.toString())) {
                MiotManager.getDeviceManipulator().invoke(create, new C8780j(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8776h(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void subscribeNotifications(CompletionHandler completionHandler, C8789n0 n0Var) {
        if (completionHandler == null) {
            throw new IllegalArgumentException("handler is null");
        } else if (n0Var != null) {
            PropertyInfo create = PropertyInfoFactory.create(getService());
            for (Property next : getService().getProperties()) {
                if (next.getDefinition().isNotifiable()) {
                    create.addProperty(next);
                }
            }
            MiotManager.getDeviceManipulator().addPropertyChangedListener(create, new C8782k(this, completionHandler), new C8794s(this, n0Var));
        } else {
            throw new IllegalArgumentException("listener is null");
        }
    }

    public void toggle(CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "toggle");
            if (create != null) {
                MiotManager.getDeviceManipulator().invoke(create, new C8784l(this, completionHandler));
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
            MiotManager.getDeviceManipulator().removePropertyChangedListener(create, new C8795t(this, completionHandler));
            return;
        }
        throw new IllegalArgumentException("handler is null");
    }
}
