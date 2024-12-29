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

public class Mono4Service extends AbstractService {
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
    public static final String PROPERTY_SmartSwitch = "SmartSwitch";
    public static final String PROPERTY_Temperature = "Temperature";
    public static final String PROPERTY_onFromPower = "onFromPower";
    private static final String TAG = "Mono4Service";
    private AbstractDevice mDevice = null;

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Mono4Service$a */
    class C9232a implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9241e0 f17179a;

        C9232a(Mono4Service mono4Service, C9241e0 e0Var) {
            this.f17179a = e0Var;
        }

        public void onFailed(int i, String str) {
            this.f17179a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("FlowParams");
            if (property.isValueValid()) {
                this.f17179a.onSucceed((String) propertyInfo.getValue("FlowParams"));
                return;
            }
            C9241e0 e0Var = this.f17179a;
            e0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Mono4Service$a0 */
    public enum C9233a0 {
        undefined,
        cfg_pomodoro,
        cfg_lan_ctrl,
        cfg_save_state,
        cfg_init_power,
        cfg_smart_switch
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Mono4Service$b */
    class C9234b implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9245g0 f17187a;

        C9234b(Mono4Service mono4Service, C9245g0 g0Var) {
            this.f17187a = g0Var;
        }

        public void onFailed(int i, String str) {
            this.f17187a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("LanMode");
            if (property.isValueValid()) {
                this.f17187a.mo30920a((Long) propertyInfo.getValue("LanMode"));
                return;
            }
            C9245g0 g0Var = this.f17187a;
            g0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Mono4Service$b0 */
    public enum C9235b0 {
        undefined,
        smooth,
        sudden
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Mono4Service$c */
    class C9236c implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9257m0 f17192a;

        C9236c(Mono4Service mono4Service, C9257m0 m0Var) {
            this.f17192a = m0Var;
        }

        public void onFailed(int i, String str) {
            this.f17192a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("onFromPower");
            if (property.isValueValid()) {
                this.f17192a.mo30930a((Long) propertyInfo.getValue("onFromPower"));
                return;
            }
            C9257m0 m0Var = this.f17192a;
            m0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Mono4Service$c0 */
    public interface C9237c0 {
        /* renamed from: a */
        void mo30912a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Mono4Service$d */
    class C9238d implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9243f0 f17193a;

        C9238d(Mono4Service mono4Service, C9243f0 f0Var) {
            this.f17193a = f0Var;
        }

        public void onFailed(int i, String str) {
            this.f17193a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Flowing");
            if (property.isValueValid()) {
                this.f17193a.mo30918a((Long) propertyInfo.getValue("Flowing"));
                return;
            }
            C9243f0 f0Var = this.f17193a;
            f0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Mono4Service$d0 */
    public interface C9239d0 {
        /* renamed from: a */
        void mo30914a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Mono4Service$e */
    class C9240e implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9253k0 f17194a;

        C9240e(Mono4Service mono4Service, C9253k0 k0Var) {
            this.f17194a = k0Var;
        }

        public void onFailed(int i, String str) {
            this.f17194a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("SmartSwitch");
            if (property.isValueValid()) {
                this.f17194a.mo30926a((Long) propertyInfo.getValue("SmartSwitch"));
                return;
            }
            C9253k0 k0Var = this.f17194a;
            k0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Mono4Service$e0 */
    public interface C9241e0 {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Mono4Service$f */
    class C9242f implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17195a;

        C9242f(Mono4Service mono4Service, CompletionHandler completionHandler) {
            this.f17195a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17195a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17195a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Mono4Service$f0 */
    public interface C9243f0 {
        /* renamed from: a */
        void mo30918a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Mono4Service$g */
    class C9244g implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17196a;

        C9244g(Mono4Service mono4Service, CompletionHandler completionHandler) {
            this.f17196a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17196a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17196a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Mono4Service$g0 */
    public interface C9245g0 {
        /* renamed from: a */
        void mo30920a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Mono4Service$h */
    class C9246h implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17197a;

        C9246h(Mono4Service mono4Service, CompletionHandler completionHandler) {
            this.f17197a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17197a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17197a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Mono4Service$h0 */
    public interface C9247h0 {
        /* renamed from: a */
        void mo30922a(C9259n0 n0Var);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Mono4Service$i */
    class C9248i implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17198a;

        C9248i(Mono4Service mono4Service, CompletionHandler completionHandler) {
            this.f17198a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17198a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17198a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Mono4Service$i0 */
    public interface C9249i0 {
        /* renamed from: a */
        void mo28754a(C9259n0 n0Var, Long l, Long l2, Long l3, Long l4, String str, Long l5, Long l6, Long l7, Long l8);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Mono4Service$j */
    class C9250j implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17199a;

        C9250j(Mono4Service mono4Service, CompletionHandler completionHandler) {
            this.f17199a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17199a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17199a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Mono4Service$j0 */
    public interface C9251j0 {
        /* renamed from: a */
        void mo30924a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Mono4Service$k */
    class C9252k implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17200a;

        C9252k(Mono4Service mono4Service, CompletionHandler completionHandler) {
            this.f17200a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17200a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f17200a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Mono4Service$k0 */
    public interface C9253k0 {
        /* renamed from: a */
        void mo30926a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Mono4Service$l */
    class C9254l implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17201a;

        C9254l(Mono4Service mono4Service, CompletionHandler completionHandler) {
            this.f17201a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17201a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17201a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Mono4Service$l0 */
    public interface C9255l0 {
        /* renamed from: a */
        void mo30928a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Mono4Service$m */
    class C9256m implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17202a;

        C9256m(Mono4Service mono4Service, CompletionHandler completionHandler) {
            this.f17202a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17202a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17202a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Mono4Service$m0 */
    public interface C9257m0 {
        /* renamed from: a */
        void mo30930a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Mono4Service$n */
    class C9258n implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17203a;

        C9258n(Mono4Service mono4Service, CompletionHandler completionHandler) {
            this.f17203a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17203a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17203a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Mono4Service$n0 */
    public enum C9259n0 {
        undefined,
        on,
        off
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Mono4Service$o */
    class C9260o implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17208a;

        C9260o(Mono4Service mono4Service, CompletionHandler completionHandler) {
            this.f17208a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17208a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17208a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Mono4Service$o0 */
    public interface C9261o0 {
        /* renamed from: a */
        void mo28745a(Long l);

        /* renamed from: b */
        void mo28746b(Long l);

        /* renamed from: c */
        void mo28747c(Long l);

        /* renamed from: d */
        void mo28748d(Long l);

        /* renamed from: e */
        void mo28749e(String str);

        /* renamed from: f */
        void mo28750f(Long l);

        /* renamed from: g */
        void mo28751g(Long l);

        /* renamed from: h */
        void mo28752h(C9259n0 n0Var);

        /* renamed from: p */
        void mo28753p(Long l);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Mono4Service$p */
    class C9262p implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17209a;

        C9262p(Mono4Service mono4Service, CompletionHandler completionHandler) {
            this.f17209a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17209a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17209a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Mono4Service$q */
    class C9263q implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17210a;

        C9263q(Mono4Service mono4Service, CompletionHandler completionHandler) {
            this.f17210a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17210a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17210a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Mono4Service$r */
    class C9264r implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17211a;

        C9264r(Mono4Service mono4Service, CompletionHandler completionHandler) {
            this.f17211a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17211a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17211a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Mono4Service$s */
    class C9265s implements DeviceManipulator.PropertyChangedListener {

        /* renamed from: a */
        final /* synthetic */ C9261o0 f17212a;

        C9265s(Mono4Service mono4Service, C9261o0 o0Var) {
            this.f17212a = o0Var;
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onPropertyChanged(com.miot.common.device.invocation.PropertyInfo r11, java.lang.String r12) {
            /*
                r10 = this;
                int r0 = r12.hashCode()
                java.lang.String r1 = "Bright"
                java.lang.String r2 = "LanMode"
                java.lang.String r3 = "SmartSwitch"
                java.lang.String r4 = "Flowing"
                java.lang.String r5 = "DelayOff"
                java.lang.String r6 = "Power"
                java.lang.String r7 = "onFromPower"
                java.lang.String r8 = "FlowParams"
                java.lang.String r9 = "SaveState"
                switch(r0) {
                    case -2117953292: goto L_0x005b;
                    case -2002016140: goto L_0x0053;
                    case 35911772: goto L_0x004b;
                    case 77306085: goto L_0x0043;
                    case 880790796: goto L_0x003b;
                    case 898856916: goto L_0x0033;
                    case 1179821629: goto L_0x002a;
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
                r12 = 7
                goto L_0x0064
            L_0x003b:
                boolean r12 = r12.equals(r5)
                if (r12 == 0) goto L_0x0063
                r12 = 2
                goto L_0x0064
            L_0x0043:
                boolean r12 = r12.equals(r6)
                if (r12 == 0) goto L_0x0063
                r12 = 0
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
                com.yeelight.yeelib.device.xiaomi.Mono4Service$o0 r12 = r10.f17212a
                r12.mo28753p(r11)
                goto L_0x0136
            L_0x0080:
                com.miot.common.property.Property r12 = r11.getProperty(r4)
                boolean r12 = r12.isValueValid()
                if (r12 == 0) goto L_0x0136
                java.lang.Object r11 = r11.getValue(r4)
                java.lang.Long r11 = (java.lang.Long) r11
                com.yeelight.yeelib.device.xiaomi.Mono4Service$o0 r12 = r10.f17212a
                r12.mo28747c(r11)
                goto L_0x0136
            L_0x0097:
                com.miot.common.property.Property r12 = r11.getProperty(r7)
                boolean r12 = r12.isValueValid()
                if (r12 == 0) goto L_0x0136
                java.lang.Object r11 = r11.getValue(r7)
                java.lang.Long r11 = (java.lang.Long) r11
                com.yeelight.yeelib.device.xiaomi.Mono4Service$o0 r12 = r10.f17212a
                r12.mo28750f(r11)
                goto L_0x0136
            L_0x00ae:
                com.miot.common.property.Property r12 = r11.getProperty(r2)
                boolean r12 = r12.isValueValid()
                if (r12 == 0) goto L_0x0136
                java.lang.Object r11 = r11.getValue(r2)
                java.lang.Long r11 = (java.lang.Long) r11
                com.yeelight.yeelib.device.xiaomi.Mono4Service$o0 r12 = r10.f17212a
                r12.mo28751g(r11)
                goto L_0x0136
            L_0x00c5:
                com.miot.common.property.Property r12 = r11.getProperty(r8)
                boolean r12 = r12.isValueValid()
                if (r12 == 0) goto L_0x0136
                java.lang.Object r11 = r11.getValue(r8)
                java.lang.String r11 = (java.lang.String) r11
                com.yeelight.yeelib.device.xiaomi.Mono4Service$o0 r12 = r10.f17212a
                r12.mo28749e(r11)
                goto L_0x0136
            L_0x00db:
                com.miot.common.property.Property r12 = r11.getProperty(r9)
                boolean r12 = r12.isValueValid()
                if (r12 == 0) goto L_0x0136
                java.lang.Object r11 = r11.getValue(r9)
                java.lang.Long r11 = (java.lang.Long) r11
                com.yeelight.yeelib.device.xiaomi.Mono4Service$o0 r12 = r10.f17212a
                r12.mo28748d(r11)
                goto L_0x0136
            L_0x00f1:
                com.miot.common.property.Property r12 = r11.getProperty(r5)
                boolean r12 = r12.isValueValid()
                if (r12 == 0) goto L_0x0136
                java.lang.Object r11 = r11.getValue(r5)
                java.lang.Long r11 = (java.lang.Long) r11
                com.yeelight.yeelib.device.xiaomi.Mono4Service$o0 r12 = r10.f17212a
                r12.mo28746b(r11)
                goto L_0x0136
            L_0x0107:
                com.miot.common.property.Property r12 = r11.getProperty(r1)
                boolean r12 = r12.isValueValid()
                if (r12 == 0) goto L_0x0136
                java.lang.Object r11 = r11.getValue(r1)
                java.lang.Long r11 = (java.lang.Long) r11
                com.yeelight.yeelib.device.xiaomi.Mono4Service$o0 r12 = r10.f17212a
                r12.mo28745a(r11)
                goto L_0x0136
            L_0x011d:
                com.miot.common.property.Property r12 = r11.getProperty(r6)
                boolean r12 = r12.isValueValid()
                if (r12 == 0) goto L_0x0136
                java.lang.Object r11 = r11.getValue(r6)
                java.lang.String r11 = (java.lang.String) r11
                com.yeelight.yeelib.device.xiaomi.Mono4Service$n0 r11 = com.yeelight.yeelib.device.xiaomi.Mono4Service.C9259n0.valueOf(r11)
                com.yeelight.yeelib.device.xiaomi.Mono4Service$o0 r12 = r10.f17212a
                r12.mo28752h(r11)
            L_0x0136:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.xiaomi.Mono4Service.C9265s.onPropertyChanged(com.miot.common.device.invocation.PropertyInfo, java.lang.String):void");
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Mono4Service$t */
    class C9266t implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17213a;

        C9266t(Mono4Service mono4Service, CompletionHandler completionHandler) {
            this.f17213a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17213a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f17213a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Mono4Service$u */
    class C9267u implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9249i0 f17214a;

        C9267u(Mono4Service mono4Service, C9249i0 i0Var) {
            this.f17214a = i0Var;
        }

        public void onFailed(int i, String str) {
            this.f17214a.onFailed(i, str);
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
                com.yeelight.yeelib.device.xiaomi.Mono4Service$n0 r0 = com.yeelight.yeelib.device.xiaomi.Mono4Service.C9259n0.valueOf(r0)
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
                java.lang.String r0 = "Temperature"
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
                java.lang.String r0 = "DelayOff"
                com.miot.common.property.Property r0 = r15.getProperty(r0)
                boolean r1 = r0.isValueValid()
                if (r1 == 0) goto L_0x0058
                java.lang.Object r0 = r0.getValue()
                java.lang.Long r0 = (java.lang.Long) r0
                r7 = r0
                goto L_0x0059
            L_0x0058:
                r7 = r2
            L_0x0059:
                java.lang.String r0 = "SaveState"
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
                java.lang.String r0 = "FlowParams"
                com.miot.common.property.Property r0 = r15.getProperty(r0)
                boolean r1 = r0.isValueValid()
                if (r1 == 0) goto L_0x0082
                java.lang.Object r0 = r0.getValue()
                java.lang.String r0 = (java.lang.String) r0
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
                com.yeelight.yeelib.device.xiaomi.Mono4Service$i0 r3 = r14.f17214a
                r3.mo28754a(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.xiaomi.Mono4Service.C9267u.onSucceed(com.miot.common.device.invocation.PropertyInfo):void");
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Mono4Service$v */
    class C9268v implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9247h0 f17215a;

        C9268v(Mono4Service mono4Service, C9247h0 h0Var) {
            this.f17215a = h0Var;
        }

        public void onFailed(int i, String str) {
            this.f17215a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Power");
            if (property.isValueValid()) {
                this.f17215a.mo30922a(C9259n0.valueOf((String) propertyInfo.getValue("Power")));
                return;
            }
            C9247h0 h0Var = this.f17215a;
            h0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Mono4Service$w */
    class C9269w implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9237c0 f17216a;

        C9269w(Mono4Service mono4Service, C9237c0 c0Var) {
            this.f17216a = c0Var;
        }

        public void onFailed(int i, String str) {
            this.f17216a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Bright");
            if (property.isValueValid()) {
                this.f17216a.mo30912a((Long) propertyInfo.getValue("Bright"));
                return;
            }
            C9237c0 c0Var = this.f17216a;
            c0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Mono4Service$x */
    class C9270x implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9255l0 f17217a;

        C9270x(Mono4Service mono4Service, C9255l0 l0Var) {
            this.f17217a = l0Var;
        }

        public void onFailed(int i, String str) {
            this.f17217a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Temperature");
            if (property.isValueValid()) {
                this.f17217a.mo30928a((Long) propertyInfo.getValue("Temperature"));
                return;
            }
            C9255l0 l0Var = this.f17217a;
            l0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Mono4Service$y */
    class C9271y implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9239d0 f17218a;

        C9271y(Mono4Service mono4Service, C9239d0 d0Var) {
            this.f17218a = d0Var;
        }

        public void onFailed(int i, String str) {
            this.f17218a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("DelayOff");
            if (property.isValueValid()) {
                this.f17218a.mo30914a((Long) propertyInfo.getValue("DelayOff"));
                return;
            }
            C9239d0 d0Var = this.f17218a;
            d0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Mono4Service$z */
    class C9272z implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9251j0 f17219a;

        C9272z(Mono4Service mono4Service, C9251j0 j0Var) {
            this.f17219a = j0Var;
        }

        public void onFailed(int i, String str) {
            this.f17219a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("SaveState");
            if (property.isValueValid()) {
                this.f17219a.mo30924a((Long) propertyInfo.getValue("SaveState"));
                return;
            }
            C9251j0 j0Var = this.f17219a;
            j0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    public Mono4Service(AbstractDevice abstractDevice) {
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
                MiotManager.getDeviceManipulator().invoke(create, new C9263q(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C9246h(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getBright(C9237c0 c0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Bright"), new C9269w(this, c0Var));
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
                MiotManager.getDeviceManipulator().invoke(create, new C9262p(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getDelayOff(C9239d0 d0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "DelayOff"), new C9271y(this, d0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowParams(C9241e0 e0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "FlowParams"), new C9232a(this, e0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowing(C9243f0 f0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Flowing"), new C9238d(this, f0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getLanMode(C9245g0 g0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "LanMode"), new C9234b(this, g0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getPower(C9247h0 h0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Power"), new C9268v(this, h0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getProperties(C9249i0 i0Var) {
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
            MiotManager.getDeviceManipulator().readProperty(create, new C9267u(this, i0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getSaveState(C9251j0 j0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "SaveState"), new C9272z(this, j0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getSmartSwitch(C9253k0 k0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "SmartSwitch"), new C9240e(this, k0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getTemperature(C9255l0 l0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Temperature"), new C9270x(this, l0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getonFromPower(C9257m0 m0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "onFromPower"), new C9236c(this, m0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void openWithMode(C9259n0 n0Var, C9235b0 b0Var, Long l, Long l2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "openWithMode");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("Power", n0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Effect", b0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Duration", l)) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("Mode", l2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C9256m(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C9248i(this, completionHandler));
                return;
            }
            throw new MiotException("actionInfo is null");
        }
        throw new MiotException("device not configurated connection");
    }

    public void sendCmd(C9233a0 a0Var, String str, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "sendCmd");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("CmdKey", a0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("CmdValue", str)) {
                MiotManager.getDeviceManipulator().invoke(create, new C9242f(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setBright(Long l, C9235b0 b0Var, Long l2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setBright");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("Bright", l)) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Effect", b0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("Duration", l2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C9244g(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C9264r(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C9250j(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setPower(C9259n0 n0Var, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setPower");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (create.setArgumentValue("Power", n0Var.toString())) {
                MiotManager.getDeviceManipulator().invoke(create, new C9258n(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C9254l(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void subscribeNotifications(CompletionHandler completionHandler, C9261o0 o0Var) {
        if (completionHandler == null) {
            throw new IllegalArgumentException("handler is null");
        } else if (o0Var != null) {
            PropertyInfo create = PropertyInfoFactory.create(getService());
            for (Property next : getService().getProperties()) {
                if (next.getDefinition().isNotifiable()) {
                    create.addProperty(next);
                }
            }
            MiotManager.getDeviceManipulator().addPropertyChangedListener(create, new C9252k(this, completionHandler), new C9265s(this, o0Var));
        } else {
            throw new IllegalArgumentException("listener is null");
        }
    }

    public void toggle(CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "toggle");
            if (create != null) {
                MiotManager.getDeviceManipulator().invoke(create, new C9260o(this, completionHandler));
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
            MiotManager.getDeviceManipulator().removePropertyChangedListener(create, new C9266t(this, completionHandler));
            return;
        }
        throw new IllegalArgumentException("handler is null");
    }
}
