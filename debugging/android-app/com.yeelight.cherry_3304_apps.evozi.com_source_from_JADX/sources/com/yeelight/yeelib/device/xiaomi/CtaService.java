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

public class CtaService extends AbstractService {
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
    public static final String ACTION_setScene2 = "setScene2";
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
    public static final String PROPERTY_TransIntervalDflt = "TransIntervalDflt";
    public static final String PROPERTY_onFromPower = "onFromPower";
    private static final String TAG = "CtaService";
    private AbstractDevice mDevice = null;

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtaService$a */
    class C8802a implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8827m0 f16753a;

        C8802a(CtaService ctaService, C8827m0 m0Var) {
            this.f16753a = m0Var;
        }

        public void onFailed(int i, String str) {
            this.f16753a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("SaveState");
            if (property.isValueValid()) {
                this.f16753a.mo30448a((Long) propertyInfo.getValue("SaveState"));
                return;
            }
            C8827m0 m0Var = this.f16753a;
            m0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtaService$a0 */
    class C8803a0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8817h0 f16754a;

        C8803a0(CtaService ctaService, C8817h0 h0Var) {
            this.f16754a = h0Var;
        }

        public void onFailed(int i, String str) {
            this.f16754a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("FlowParams");
            if (property.isValueValid()) {
                this.f16754a.onSucceed((String) propertyInfo.getValue("FlowParams"));
                return;
            }
            C8817h0 h0Var = this.f16754a;
            h0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtaService$b */
    class C8804b implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8821j0 f16755a;

        C8804b(CtaService ctaService, C8821j0 j0Var) {
            this.f16755a = j0Var;
        }

        public void onFailed(int i, String str) {
            this.f16755a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("LanMode");
            if (property.isValueValid()) {
                this.f16755a.mo30444a((Long) propertyInfo.getValue("LanMode"));
                return;
            }
            C8821j0 j0Var = this.f16755a;
            j0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtaService$b0 */
    class C8805b0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8815g0 f16756a;

        C8805b0(CtaService ctaService, C8815g0 g0Var) {
            this.f16756a = g0Var;
        }

        public void onFailed(int i, String str) {
            this.f16756a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("DelayOff");
            if (property.isValueValid()) {
                this.f16756a.mo30438a((Long) propertyInfo.getValue("DelayOff"));
                return;
            }
            C8815g0 g0Var = this.f16756a;
            g0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtaService$c */
    class C8806c implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8829n0 f16757a;

        C8806c(CtaService ctaService, C8829n0 n0Var) {
            this.f16757a = n0Var;
        }

        public void onFailed(int i, String str) {
            this.f16757a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("TransIntervalDflt");
            if (property.isValueValid()) {
                this.f16757a.mo30450a((Long) propertyInfo.getValue("TransIntervalDflt"));
                return;
            }
            C8829n0 n0Var = this.f16757a;
            n0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtaService$c0 */
    public enum C8807c0 {
        undefined,
        cfg_pomodoro,
        cfg_lan_ctrl,
        cfg_save_state,
        cfg_init_power,
        trans_default
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtaService$d */
    class C8808d implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8831o0 f16765a;

        C8808d(CtaService ctaService, C8831o0 o0Var) {
            this.f16765a = o0Var;
        }

        public void onFailed(int i, String str) {
            this.f16765a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("onFromPower");
            if (property.isValueValid()) {
                this.f16765a.mo30452a((Long) propertyInfo.getValue("onFromPower"));
                return;
            }
            C8831o0 o0Var = this.f16765a;
            o0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtaService$d0 */
    public enum C8809d0 {
        undefined,
        smooth,
        sudden
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtaService$e */
    class C8810e implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8819i0 f16770a;

        C8810e(CtaService ctaService, C8819i0 i0Var) {
            this.f16770a = i0Var;
        }

        public void onFailed(int i, String str) {
            this.f16770a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Flowing");
            if (property.isValueValid()) {
                this.f16770a.mo30442a((Long) propertyInfo.getValue("Flowing"));
                return;
            }
            C8819i0 i0Var = this.f16770a;
            i0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtaService$e0 */
    public interface C8811e0 {
        /* renamed from: a */
        void mo30434a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtaService$f */
    class C8812f implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16771a;

        C8812f(CtaService ctaService, CompletionHandler completionHandler) {
            this.f16771a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16771a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16771a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtaService$f0 */
    public interface C8813f0 {
        /* renamed from: a */
        void mo30436a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtaService$g */
    class C8814g implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16772a;

        C8814g(CtaService ctaService, CompletionHandler completionHandler) {
            this.f16772a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16772a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16772a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtaService$g0 */
    public interface C8815g0 {
        /* renamed from: a */
        void mo30438a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtaService$h */
    class C8816h implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16773a;

        C8816h(CtaService ctaService, CompletionHandler completionHandler) {
            this.f16773a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16773a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16773a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtaService$h0 */
    public interface C8817h0 {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtaService$i */
    class C8818i implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16774a;

        C8818i(CtaService ctaService, CompletionHandler completionHandler) {
            this.f16774a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16774a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16774a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtaService$i0 */
    public interface C8819i0 {
        /* renamed from: a */
        void mo30442a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtaService$j */
    class C8820j implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16775a;

        C8820j(CtaService ctaService, CompletionHandler completionHandler) {
            this.f16775a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16775a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16775a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtaService$j0 */
    public interface C8821j0 {
        /* renamed from: a */
        void mo30444a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtaService$k */
    class C8822k implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16776a;

        C8822k(CtaService ctaService, CompletionHandler completionHandler) {
            this.f16776a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16776a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f16776a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtaService$k0 */
    public interface C8823k0 {
        /* renamed from: a */
        void mo30446a(C8833p0 p0Var);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtaService$l */
    class C8824l implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16777a;

        C8824l(CtaService ctaService, CompletionHandler completionHandler) {
            this.f16777a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16777a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16777a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtaService$l0 */
    public interface C8825l0 {
        /* renamed from: a */
        void mo28793a(C8833p0 p0Var, Long l, Long l2, String str, Long l3, Long l4, Long l5, Long l6, Long l7, Long l8);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtaService$m */
    class C8826m implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16778a;

        C8826m(CtaService ctaService, CompletionHandler completionHandler) {
            this.f16778a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16778a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16778a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtaService$m0 */
    public interface C8827m0 {
        /* renamed from: a */
        void mo30448a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtaService$n */
    class C8828n implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16779a;

        C8828n(CtaService ctaService, CompletionHandler completionHandler) {
            this.f16779a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16779a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16779a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtaService$n0 */
    public interface C8829n0 {
        /* renamed from: a */
        void mo30450a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtaService$o */
    class C8830o implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16780a;

        C8830o(CtaService ctaService, CompletionHandler completionHandler) {
            this.f16780a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16780a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16780a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtaService$o0 */
    public interface C8831o0 {
        /* renamed from: a */
        void mo30452a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtaService$p */
    class C8832p implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16781a;

        C8832p(CtaService ctaService, CompletionHandler completionHandler) {
            this.f16781a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16781a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16781a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtaService$p0 */
    public enum C8833p0 {
        undefined,
        on,
        off
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtaService$q */
    class C8834q implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16786a;

        C8834q(CtaService ctaService, CompletionHandler completionHandler) {
            this.f16786a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16786a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16786a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtaService$q0 */
    public interface C8835q0 {
        /* renamed from: a */
        void mo28783a(Long l);

        /* renamed from: b */
        void mo28784b(Long l);

        /* renamed from: c */
        void mo28785c(Long l);

        /* renamed from: d */
        void mo28786d(Long l);

        /* renamed from: e */
        void mo28787e(String str);

        /* renamed from: f */
        void mo28788f(Long l);

        /* renamed from: g */
        void mo28789g(Long l);

        /* renamed from: h */
        void mo28790h(Long l);

        /* renamed from: i */
        void mo28791i(C8833p0 p0Var);

        /* renamed from: q */
        void mo28792q(Long l);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtaService$r */
    class C8836r implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16787a;

        C8836r(CtaService ctaService, CompletionHandler completionHandler) {
            this.f16787a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16787a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16787a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtaService$s */
    class C8837s implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16788a;

        C8837s(CtaService ctaService, CompletionHandler completionHandler) {
            this.f16788a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16788a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16788a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtaService$t */
    class C8838t implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16789a;

        C8838t(CtaService ctaService, CompletionHandler completionHandler) {
            this.f16789a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16789a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16789a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtaService$u */
    class C8839u implements DeviceManipulator.PropertyChangedListener {

        /* renamed from: a */
        final /* synthetic */ C8835q0 f16790a;

        C8839u(CtaService ctaService, C8835q0 q0Var) {
            this.f16790a = q0Var;
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onPropertyChanged(com.miot.common.device.invocation.PropertyInfo r12, java.lang.String r13) {
            /*
                r11 = this;
                int r0 = r13.hashCode()
                java.lang.String r1 = "Bright"
                java.lang.String r2 = "LanMode"
                java.lang.String r3 = "Flowing"
                java.lang.String r4 = "DelayOff"
                java.lang.String r5 = "Power"
                java.lang.String r6 = "onFromPower"
                java.lang.String r7 = "Ct"
                java.lang.String r8 = "TransIntervalDflt"
                java.lang.String r9 = "FlowParams"
                java.lang.String r10 = "SaveState"
                switch(r0) {
                    case -2117953292: goto L_0x0066;
                    case -2002016140: goto L_0x005e;
                    case -718325097: goto L_0x0056;
                    case 2193: goto L_0x004e;
                    case 35911772: goto L_0x0045;
                    case 77306085: goto L_0x003d;
                    case 880790796: goto L_0x0035;
                    case 898856916: goto L_0x002c;
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
                r13 = 4
                goto L_0x006f
            L_0x003d:
                boolean r13 = r13.equals(r5)
                if (r13 == 0) goto L_0x006e
                r13 = 0
                goto L_0x006f
            L_0x0045:
                boolean r13 = r13.equals(r6)
                if (r13 == 0) goto L_0x006e
                r13 = 8
                goto L_0x006f
            L_0x004e:
                boolean r13 = r13.equals(r7)
                if (r13 == 0) goto L_0x006e
                r13 = 2
                goto L_0x006f
            L_0x0056:
                boolean r13 = r13.equals(r8)
                if (r13 == 0) goto L_0x006e
                r13 = 7
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
                com.yeelight.yeelib.device.xiaomi.CtaService$q0 r13 = r11.f16790a
                r13.mo28785c(r12)
                goto L_0x0158
            L_0x008b:
                com.miot.common.property.Property r13 = r12.getProperty(r6)
                boolean r13 = r13.isValueValid()
                if (r13 == 0) goto L_0x0158
                java.lang.Object r12 = r12.getValue(r6)
                java.lang.Long r12 = (java.lang.Long) r12
                com.yeelight.yeelib.device.xiaomi.CtaService$q0 r13 = r11.f16790a
                r13.mo28788f(r12)
                goto L_0x0158
            L_0x00a2:
                com.miot.common.property.Property r13 = r12.getProperty(r8)
                boolean r13 = r13.isValueValid()
                if (r13 == 0) goto L_0x0158
                java.lang.Object r12 = r12.getValue(r8)
                java.lang.Long r12 = (java.lang.Long) r12
                com.yeelight.yeelib.device.xiaomi.CtaService$q0 r13 = r11.f16790a
                r13.mo28792q(r12)
                goto L_0x0158
            L_0x00b9:
                com.miot.common.property.Property r13 = r12.getProperty(r2)
                boolean r13 = r13.isValueValid()
                if (r13 == 0) goto L_0x0158
                java.lang.Object r12 = r12.getValue(r2)
                java.lang.Long r12 = (java.lang.Long) r12
                com.yeelight.yeelib.device.xiaomi.CtaService$q0 r13 = r11.f16790a
                r13.mo28789g(r12)
                goto L_0x0158
            L_0x00d0:
                com.miot.common.property.Property r13 = r12.getProperty(r10)
                boolean r13 = r13.isValueValid()
                if (r13 == 0) goto L_0x0158
                java.lang.Object r12 = r12.getValue(r10)
                java.lang.Long r12 = (java.lang.Long) r12
                com.yeelight.yeelib.device.xiaomi.CtaService$q0 r13 = r11.f16790a
                r13.mo28786d(r12)
                goto L_0x0158
            L_0x00e7:
                com.miot.common.property.Property r13 = r12.getProperty(r4)
                boolean r13 = r13.isValueValid()
                if (r13 == 0) goto L_0x0158
                java.lang.Object r12 = r12.getValue(r4)
                java.lang.Long r12 = (java.lang.Long) r12
                com.yeelight.yeelib.device.xiaomi.CtaService$q0 r13 = r11.f16790a
                r13.mo28784b(r12)
                goto L_0x0158
            L_0x00fd:
                com.miot.common.property.Property r13 = r12.getProperty(r9)
                boolean r13 = r13.isValueValid()
                if (r13 == 0) goto L_0x0158
                java.lang.Object r12 = r12.getValue(r9)
                java.lang.String r12 = (java.lang.String) r12
                com.yeelight.yeelib.device.xiaomi.CtaService$q0 r13 = r11.f16790a
                r13.mo28787e(r12)
                goto L_0x0158
            L_0x0113:
                com.miot.common.property.Property r13 = r12.getProperty(r7)
                boolean r13 = r13.isValueValid()
                if (r13 == 0) goto L_0x0158
                java.lang.Object r12 = r12.getValue(r7)
                java.lang.Long r12 = (java.lang.Long) r12
                com.yeelight.yeelib.device.xiaomi.CtaService$q0 r13 = r11.f16790a
                r13.mo28790h(r12)
                goto L_0x0158
            L_0x0129:
                com.miot.common.property.Property r13 = r12.getProperty(r1)
                boolean r13 = r13.isValueValid()
                if (r13 == 0) goto L_0x0158
                java.lang.Object r12 = r12.getValue(r1)
                java.lang.Long r12 = (java.lang.Long) r12
                com.yeelight.yeelib.device.xiaomi.CtaService$q0 r13 = r11.f16790a
                r13.mo28783a(r12)
                goto L_0x0158
            L_0x013f:
                com.miot.common.property.Property r13 = r12.getProperty(r5)
                boolean r13 = r13.isValueValid()
                if (r13 == 0) goto L_0x0158
                java.lang.Object r12 = r12.getValue(r5)
                java.lang.String r12 = (java.lang.String) r12
                com.yeelight.yeelib.device.xiaomi.CtaService$p0 r12 = com.yeelight.yeelib.device.xiaomi.CtaService.C8833p0.valueOf(r12)
                com.yeelight.yeelib.device.xiaomi.CtaService$q0 r13 = r11.f16790a
                r13.mo28791i(r12)
            L_0x0158:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.xiaomi.CtaService.C8839u.onPropertyChanged(com.miot.common.device.invocation.PropertyInfo, java.lang.String):void");
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtaService$v */
    class C8840v implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16791a;

        C8840v(CtaService ctaService, CompletionHandler completionHandler) {
            this.f16791a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16791a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f16791a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtaService$w */
    class C8841w implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8825l0 f16792a;

        C8841w(CtaService ctaService, C8825l0 l0Var) {
            this.f16792a = l0Var;
        }

        public void onFailed(int i, String str) {
            this.f16792a.onFailed(i, str);
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
                com.yeelight.yeelib.device.xiaomi.CtaService$p0 r0 = com.yeelight.yeelib.device.xiaomi.CtaService.C8833p0.valueOf(r0)
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
                java.lang.String r0 = "TransIntervalDflt"
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
                java.lang.String r0 = "onFromPower"
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
                java.lang.String r0 = "Flowing"
                com.miot.common.property.Property r15 = r15.getProperty(r0)
                boolean r0 = r15.isValueValid()
                if (r0 == 0) goto L_0x00d5
                java.lang.Object r15 = r15.getValue()
                r2 = r15
                java.lang.Long r2 = (java.lang.Long) r2
            L_0x00d5:
                r13 = r2
                com.yeelight.yeelib.device.xiaomi.CtaService$l0 r3 = r14.f16792a
                r3.mo28793a(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.xiaomi.CtaService.C8841w.onSucceed(com.miot.common.device.invocation.PropertyInfo):void");
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtaService$x */
    class C8842x implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8823k0 f16793a;

        C8842x(CtaService ctaService, C8823k0 k0Var) {
            this.f16793a = k0Var;
        }

        public void onFailed(int i, String str) {
            this.f16793a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Power");
            if (property.isValueValid()) {
                this.f16793a.mo30446a(C8833p0.valueOf((String) propertyInfo.getValue("Power")));
                return;
            }
            C8823k0 k0Var = this.f16793a;
            k0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtaService$y */
    class C8843y implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8811e0 f16794a;

        C8843y(CtaService ctaService, C8811e0 e0Var) {
            this.f16794a = e0Var;
        }

        public void onFailed(int i, String str) {
            this.f16794a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Bright");
            if (property.isValueValid()) {
                this.f16794a.mo30434a((Long) propertyInfo.getValue("Bright"));
                return;
            }
            C8811e0 e0Var = this.f16794a;
            e0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.CtaService$z */
    class C8844z implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8813f0 f16795a;

        C8844z(CtaService ctaService, C8813f0 f0Var) {
            this.f16795a = f0Var;
        }

        public void onFailed(int i, String str) {
            this.f16795a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Ct");
            if (property.isValueValid()) {
                this.f16795a.mo30436a((Long) propertyInfo.getValue("Ct"));
                return;
            }
            C8813f0 f0Var = this.f16795a;
            f0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    public CtaService(AbstractDevice abstractDevice) {
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
                MiotManager.getDeviceManipulator().invoke(create, new C8830o(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8814g(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getBright(C8811e0 e0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Bright"), new C8843y(this, e0Var));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8838t(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getCt(C8813f0 f0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Ct"), new C8844z(this, f0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getDelayOff(C8815g0 g0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "DelayOff"), new C8805b0(this, g0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowParams(C8817h0 h0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "FlowParams"), new C8803a0(this, h0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowing(C8819i0 i0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Flowing"), new C8810e(this, i0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getLanMode(C8821j0 j0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "LanMode"), new C8804b(this, j0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getPower(C8823k0 k0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Power"), new C8842x(this, k0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getProperties(C8825l0 l0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            PropertyInfo create = PropertyInfoFactory.create(getService());
            create.addProperty(getService().getProperty("Power"));
            create.addProperty(getService().getProperty("Bright"));
            create.addProperty(getService().getProperty("Ct"));
            create.addProperty(getService().getProperty("FlowParams"));
            create.addProperty(getService().getProperty("DelayOff"));
            create.addProperty(getService().getProperty("SaveState"));
            create.addProperty(getService().getProperty("LanMode"));
            create.addProperty(getService().getProperty("TransIntervalDflt"));
            create.addProperty(getService().getProperty("onFromPower"));
            create.addProperty(getService().getProperty("Flowing"));
            MiotManager.getDeviceManipulator().readProperty(create, new C8841w(this, l0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getSaveState(C8827m0 m0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "SaveState"), new C8802a(this, m0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getTransIntervalDflt(C8829n0 n0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "TransIntervalDflt"), new C8806c(this, n0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getonFromPower(C8831o0 o0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "onFromPower"), new C8808d(this, o0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void openWithMode(C8833p0 p0Var, C8809d0 d0Var, Long l, Long l2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "openWithMode");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("Power", p0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Effect", d0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Duration", l)) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("Mode", l2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C8824l(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8816h(this, completionHandler));
                return;
            }
            throw new MiotException("actionInfo is null");
        }
        throw new MiotException("device not configurated connection");
    }

    public void sendCmd(C8807c0 c0Var, String str, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "sendCmd");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("CmdKey", c0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("CmdValue", str)) {
                MiotManager.getDeviceManipulator().invoke(create, new C8834q(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8812f(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setCt(Long l, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setCt");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (create.setArgumentValue("Ct", l)) {
                MiotManager.getDeviceManipulator().invoke(create, new C8837s(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8832p(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8836r(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setPower(C8833p0 p0Var, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setPower");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (create.setArgumentValue("Power", p0Var.toString())) {
                MiotManager.getDeviceManipulator().invoke(create, new C8826m(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8818i(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8820j(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void subscribeNotifications(CompletionHandler completionHandler, C8835q0 q0Var) {
        if (completionHandler == null) {
            throw new IllegalArgumentException("handler is null");
        } else if (q0Var != null) {
            PropertyInfo create = PropertyInfoFactory.create(getService());
            for (Property next : getService().getProperties()) {
                if (next.getDefinition().isNotifiable()) {
                    create.addProperty(next);
                }
            }
            MiotManager.getDeviceManipulator().addPropertyChangedListener(create, new C8822k(this, completionHandler), new C8839u(this, q0Var));
        } else {
            throw new IllegalArgumentException("listener is null");
        }
    }

    public void toggle(CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "toggle");
            if (create != null) {
                MiotManager.getDeviceManipulator().invoke(create, new C8828n(this, completionHandler));
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
            MiotManager.getDeviceManipulator().removePropertyChangedListener(create, new C8840v(this, completionHandler));
            return;
        }
        throw new IllegalArgumentException("handler is null");
    }
}
