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

public class Lamp3Service extends AbstractService {
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
    public static final String PROPERTY_KidLock = "KidLock";
    public static final String PROPERTY_LanMode = "LanMode";
    public static final String PROPERTY_Mode = "Mode";
    public static final String PROPERTY_ParamColors = "ParamColors";
    public static final String PROPERTY_ParamCount = "ParamCount";
    public static final String PROPERTY_ParamFinish = "ParamFinish";
    public static final String PROPERTY_ParamModel = "ParamModel";
    public static final String PROPERTY_Power = "Power";
    public static final String PROPERTY_SaveState = "SaveState";
    public static final String PROPERTY_onFromPower = "onFromPower";
    private static final String TAG = "Lamp3Service";
    private AbstractDevice mDevice = null;

    public enum CmdKey {
        undefined,
        cfg_pomodoro,
        cfg_lan_ctrl,
        cfg_save_state,
        cfg_init_power,
        cfg_kid_lock
    }

    public enum Effect {
        undefined,
        smooth,
        sudden
    }

    public enum Power {
        undefined,
        on,
        off
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp3Service$a */
    class C7522a implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7531e0 f13656a;

        C7522a(Lamp3Service lamp3Service, C7531e0 e0Var) {
            this.f13656a = e0Var;
        }

        public void onFailed(int i, String str) {
            this.f13656a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("LanMode");
            if (property.isValueValid()) {
                this.f13656a.mo33991a((Long) propertyInfo.getValue("LanMode"));
                return;
            }
            C7531e0 e0Var = this.f13656a;
            e0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp3Service$a0 */
    public interface C7523a0 {
        /* renamed from: a */
        void mo33983a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp3Service$b */
    class C7524b implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7539i0 f13657a;

        C7524b(Lamp3Service lamp3Service, C7539i0 i0Var) {
            this.f13657a = i0Var;
        }

        public void onFailed(int i, String str) {
            this.f13657a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("onFromPower");
            if (property.isValueValid()) {
                this.f13657a.mo33999a((Long) propertyInfo.getValue("onFromPower"));
                return;
            }
            C7539i0 i0Var = this.f13657a;
            i0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp3Service$b0 */
    public interface C7525b0 {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp3Service$c */
    class C7526c implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7527c0 f13658a;

        C7526c(Lamp3Service lamp3Service, C7527c0 c0Var) {
            this.f13658a = c0Var;
        }

        public void onFailed(int i, String str) {
            this.f13658a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Flowing");
            if (property.isValueValid()) {
                this.f13658a.mo33987a((Long) propertyInfo.getValue("Flowing"));
                return;
            }
            C7527c0 c0Var = this.f13658a;
            c0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp3Service$c0 */
    public interface C7527c0 {
        /* renamed from: a */
        void mo33987a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp3Service$d */
    class C7528d implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7529d0 f13659a;

        C7528d(Lamp3Service lamp3Service, C7529d0 d0Var) {
            this.f13659a = d0Var;
        }

        public void onFailed(int i, String str) {
            this.f13659a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty(Lamp3Service.PROPERTY_KidLock);
            if (property.isValueValid()) {
                this.f13659a.mo33989a((Long) propertyInfo.getValue(Lamp3Service.PROPERTY_KidLock));
                return;
            }
            C7529d0 d0Var = this.f13659a;
            d0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp3Service$d0 */
    public interface C7529d0 {
        /* renamed from: a */
        void mo33989a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp3Service$e */
    class C7530e implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13660a;

        C7530e(Lamp3Service lamp3Service, CompletionHandler completionHandler) {
            this.f13660a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13660a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13660a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp3Service$e0 */
    public interface C7531e0 {
        /* renamed from: a */
        void mo33991a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp3Service$f */
    class C7532f implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13661a;

        C7532f(Lamp3Service lamp3Service, CompletionHandler completionHandler) {
            this.f13661a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13661a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13661a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp3Service$f0 */
    public interface C7533f0 {
        /* renamed from: a */
        void mo33993a(Power power);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp3Service$g */
    class C7534g implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13662a;

        C7534g(Lamp3Service lamp3Service, CompletionHandler completionHandler) {
            this.f13662a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13662a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13662a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp3Service$g0 */
    public interface C7535g0 {
        /* renamed from: a */
        void mo33995a(Power power, Long l, Long l2, Long l3, String str, Long l4, Long l5, Long l6, Long l7);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp3Service$h */
    class C7536h implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13663a;

        C7536h(Lamp3Service lamp3Service, CompletionHandler completionHandler) {
            this.f13663a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13663a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13663a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp3Service$h0 */
    public interface C7537h0 {
        /* renamed from: a */
        void mo33997a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp3Service$i */
    class C7538i implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13664a;

        C7538i(Lamp3Service lamp3Service, CompletionHandler completionHandler) {
            this.f13664a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13664a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13664a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp3Service$i0 */
    public interface C7539i0 {
        /* renamed from: a */
        void mo33999a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp3Service$j */
    class C7540j implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13665a;

        C7540j(Lamp3Service lamp3Service, CompletionHandler completionHandler) {
            this.f13665a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13665a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13665a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp3Service$j0 */
    public interface C7541j0 {
        /* renamed from: a */
        void mo34001a(Long l);

        /* renamed from: b */
        void mo34002b(Long l);

        /* renamed from: c */
        void mo34003c(Long l);

        /* renamed from: d */
        void mo34004d(Long l);

        /* renamed from: e */
        void mo34005e(String str);

        /* renamed from: f */
        void mo34006f(Long l);

        /* renamed from: g */
        void mo34007g(Long l);

        /* renamed from: h */
        void mo34008h(Long l);

        /* renamed from: i */
        void mo34009i(Power power);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp3Service$k */
    class C7542k implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13666a;

        C7542k(Lamp3Service lamp3Service, CompletionHandler completionHandler) {
            this.f13666a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13666a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f13666a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp3Service$l */
    class C7543l implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13667a;

        C7543l(Lamp3Service lamp3Service, CompletionHandler completionHandler) {
            this.f13667a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13667a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13667a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp3Service$m */
    class C7544m implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13668a;

        C7544m(Lamp3Service lamp3Service, CompletionHandler completionHandler) {
            this.f13668a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13668a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13668a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp3Service$n */
    class C7545n implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13669a;

        C7545n(Lamp3Service lamp3Service, CompletionHandler completionHandler) {
            this.f13669a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13669a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13669a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp3Service$o */
    class C7546o implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13670a;

        C7546o(Lamp3Service lamp3Service, CompletionHandler completionHandler) {
            this.f13670a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13670a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13670a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp3Service$p */
    class C7547p implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13671a;

        C7547p(Lamp3Service lamp3Service, CompletionHandler completionHandler) {
            this.f13671a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13671a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13671a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp3Service$q */
    class C7548q implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13672a;

        C7548q(Lamp3Service lamp3Service, CompletionHandler completionHandler) {
            this.f13672a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13672a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13672a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp3Service$r */
    class C7549r implements DeviceManipulator.PropertyChangedListener {

        /* renamed from: a */
        final /* synthetic */ C7541j0 f13673a;

        C7549r(Lamp3Service lamp3Service, C7541j0 j0Var) {
            this.f13673a = j0Var;
        }

        public void onPropertyChanged(PropertyInfo propertyInfo, String str) {
            str.hashCode();
            char c = 65535;
            switch (str.hashCode()) {
                case -2117953292:
                    if (str.equals("SaveState")) {
                        c = 0;
                        break;
                    }
                    break;
                case -2002016140:
                    if (str.equals("FlowParams")) {
                        c = 1;
                        break;
                    }
                    break;
                case 35911772:
                    if (str.equals("onFromPower")) {
                        c = 2;
                        break;
                    }
                    break;
                case 77306085:
                    if (str.equals("Power")) {
                        c = 3;
                        break;
                    }
                    break;
                case 880790796:
                    if (str.equals("DelayOff")) {
                        c = 4;
                        break;
                    }
                    break;
                case 898856916:
                    if (str.equals("Flowing")) {
                        c = 5;
                        break;
                    }
                    break;
                case 944086257:
                    if (str.equals(Lamp3Service.PROPERTY_KidLock)) {
                        c = 6;
                        break;
                    }
                    break;
                case 1611821756:
                    if (str.equals("LanMode")) {
                        c = 7;
                        break;
                    }
                    break;
                case 1998035738:
                    if (str.equals("Bright")) {
                        c = 8;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    if (propertyInfo.getProperty("SaveState").isValueValid()) {
                        this.f13673a.mo34003c((Long) propertyInfo.getValue("SaveState"));
                        return;
                    }
                    return;
                case 1:
                    if (propertyInfo.getProperty("FlowParams").isValueValid()) {
                        this.f13673a.mo34005e((String) propertyInfo.getValue("FlowParams"));
                        return;
                    }
                    return;
                case 2:
                    if (propertyInfo.getProperty("onFromPower").isValueValid()) {
                        this.f13673a.mo34006f((Long) propertyInfo.getValue("onFromPower"));
                        return;
                    }
                    return;
                case 3:
                    if (propertyInfo.getProperty("Power").isValueValid()) {
                        this.f13673a.mo34009i(Power.valueOf((String) propertyInfo.getValue("Power")));
                        return;
                    }
                    return;
                case 4:
                    if (propertyInfo.getProperty("DelayOff").isValueValid()) {
                        this.f13673a.mo34002b((Long) propertyInfo.getValue("DelayOff"));
                        return;
                    }
                    return;
                case 5:
                    if (propertyInfo.getProperty("Flowing").isValueValid()) {
                        this.f13673a.mo34004d((Long) propertyInfo.getValue("Flowing"));
                        return;
                    }
                    return;
                case 6:
                    if (propertyInfo.getProperty(Lamp3Service.PROPERTY_KidLock).isValueValid()) {
                        this.f13673a.mo34008h((Long) propertyInfo.getValue(Lamp3Service.PROPERTY_KidLock));
                        return;
                    }
                    return;
                case 7:
                    if (propertyInfo.getProperty("LanMode").isValueValid()) {
                        this.f13673a.mo34007g((Long) propertyInfo.getValue("LanMode"));
                        return;
                    }
                    return;
                case 8:
                    if (propertyInfo.getProperty("Bright").isValueValid()) {
                        this.f13673a.mo34001a((Long) propertyInfo.getValue("Bright"));
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp3Service$s */
    class C7550s implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13674a;

        C7550s(Lamp3Service lamp3Service, CompletionHandler completionHandler) {
            this.f13674a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13674a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f13674a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp3Service$t */
    class C7551t implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7535g0 f13675a;

        C7551t(Lamp3Service lamp3Service, C7535g0 g0Var) {
            this.f13675a = g0Var;
        }

        public void onFailed(int i, String str) {
            this.f13675a.onFailed(i, str);
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
                com.yeelight.yeelib.device.xiaomi.Lamp3Service$Power r0 = com.yeelight.yeelib.device.xiaomi.Lamp3Service.Power.valueOf(r0)
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
                java.lang.String r0 = "onFromPower"
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
                java.lang.String r0 = "Flowing"
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
                java.lang.String r0 = "KidLock"
                com.miot.common.property.Property r14 = r14.getProperty(r0)
                boolean r0 = r14.isValueValid()
                if (r0 == 0) goto L_0x00c0
                java.lang.Object r14 = r14.getValue()
                r2 = r14
                java.lang.Long r2 = (java.lang.Long) r2
            L_0x00c0:
                r12 = r2
                com.yeelight.yeelib.device.xiaomi.Lamp3Service$g0 r3 = r13.f13675a
                r3.mo33995a(r4, r5, r6, r7, r8, r9, r10, r11, r12)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.xiaomi.Lamp3Service.C7551t.onSucceed(com.miot.common.device.invocation.PropertyInfo):void");
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp3Service$u */
    class C7552u implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7533f0 f13676a;

        C7552u(Lamp3Service lamp3Service, C7533f0 f0Var) {
            this.f13676a = f0Var;
        }

        public void onFailed(int i, String str) {
            this.f13676a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Power");
            if (property.isValueValid()) {
                this.f13676a.mo33993a(Power.valueOf((String) propertyInfo.getValue("Power")));
                return;
            }
            C7533f0 f0Var = this.f13676a;
            f0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp3Service$v */
    class C7553v implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7557z f13677a;

        C7553v(Lamp3Service lamp3Service, C7557z zVar) {
            this.f13677a = zVar;
        }

        public void onFailed(int i, String str) {
            this.f13677a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Bright");
            if (property.isValueValid()) {
                this.f13677a.mo34010a((Long) propertyInfo.getValue("Bright"));
                return;
            }
            C7557z zVar = this.f13677a;
            zVar.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp3Service$w */
    class C7554w implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7523a0 f13678a;

        C7554w(Lamp3Service lamp3Service, C7523a0 a0Var) {
            this.f13678a = a0Var;
        }

        public void onFailed(int i, String str) {
            this.f13678a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("DelayOff");
            if (property.isValueValid()) {
                this.f13678a.mo33983a((Long) propertyInfo.getValue("DelayOff"));
                return;
            }
            C7523a0 a0Var = this.f13678a;
            a0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp3Service$x */
    class C7555x implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7537h0 f13679a;

        C7555x(Lamp3Service lamp3Service, C7537h0 h0Var) {
            this.f13679a = h0Var;
        }

        public void onFailed(int i, String str) {
            this.f13679a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("SaveState");
            if (property.isValueValid()) {
                this.f13679a.mo33997a((Long) propertyInfo.getValue("SaveState"));
                return;
            }
            C7537h0 h0Var = this.f13679a;
            h0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp3Service$y */
    class C7556y implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7525b0 f13680a;

        C7556y(Lamp3Service lamp3Service, C7525b0 b0Var) {
            this.f13680a = b0Var;
        }

        public void onFailed(int i, String str) {
            this.f13680a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("FlowParams");
            if (property.isValueValid()) {
                this.f13680a.onSucceed((String) propertyInfo.getValue("FlowParams"));
                return;
            }
            C7525b0 b0Var = this.f13680a;
            b0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp3Service$z */
    public interface C7557z {
        /* renamed from: a */
        void mo34010a(Long l);

        void onFailed(int i, String str);
    }

    public Lamp3Service(AbstractDevice abstractDevice) {
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
                MiotManager.getDeviceManipulator().invoke(create, new C7547p(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7534g(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getBright(C7557z zVar) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Bright"), new C7553v(this, zVar));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7546o(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getDelayOff(C7523a0 a0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "DelayOff"), new C7554w(this, a0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowParams(C7525b0 b0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "FlowParams"), new C7556y(this, b0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowing(C7527c0 c0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Flowing"), new C7526c(this, c0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getKidLock(C7529d0 d0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), PROPERTY_KidLock), new C7528d(this, d0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getLanMode(C7531e0 e0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "LanMode"), new C7522a(this, e0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getPower(C7533f0 f0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Power"), new C7552u(this, f0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getProperties(C7535g0 g0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            PropertyInfo create = PropertyInfoFactory.create(getService());
            create.addProperty(getService().getProperty("Power"));
            create.addProperty(getService().getProperty("Bright"));
            create.addProperty(getService().getProperty("DelayOff"));
            create.addProperty(getService().getProperty("SaveState"));
            create.addProperty(getService().getProperty("FlowParams"));
            create.addProperty(getService().getProperty("LanMode"));
            create.addProperty(getService().getProperty("onFromPower"));
            create.addProperty(getService().getProperty("Flowing"));
            create.addProperty(getService().getProperty(PROPERTY_KidLock));
            MiotManager.getDeviceManipulator().readProperty(create, new C7551t(this, g0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getSaveState(C7537h0 h0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "SaveState"), new C7555x(this, h0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getonFromPower(C7539i0 i0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "onFromPower"), new C7524b(this, i0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void openWithMode(Power power, Effect effect, Long l, Long l2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "openWithMode");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("Power", power.toString())) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Effect", effect.toString())) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Duration", l)) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("Mode", l2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C7543l(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7536h(this, completionHandler));
                return;
            }
            throw new MiotException("actionInfo is null");
        }
        throw new MiotException("device not configurated connection");
    }

    public void sendCmd(CmdKey cmdKey, String str, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "sendCmd");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("CmdKey", cmdKey.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("CmdValue", str)) {
                MiotManager.getDeviceManipulator().invoke(create, new C7530e(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setBright(Long l, Effect effect, Long l2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setBright");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("Bright", l)) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Effect", effect.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("Duration", l2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C7532f(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7548q(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7538i(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setPower(Power power, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setPower");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (create.setArgumentValue("Power", power.toString())) {
                MiotManager.getDeviceManipulator().invoke(create, new C7544m(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7540j(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void subscribeNotifications(CompletionHandler completionHandler, C7541j0 j0Var) {
        if (completionHandler == null) {
            throw new IllegalArgumentException("handler is null");
        } else if (j0Var != null) {
            PropertyInfo create = PropertyInfoFactory.create(getService());
            for (Property next : getService().getProperties()) {
                if (next.getDefinition().isNotifiable()) {
                    create.addProperty(next);
                }
            }
            MiotManager.getDeviceManipulator().addPropertyChangedListener(create, new C7542k(this, completionHandler), new C7549r(this, j0Var));
        } else {
            throw new IllegalArgumentException("listener is null");
        }
    }

    public void toggle(CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "toggle");
            if (create != null) {
                MiotManager.getDeviceManipulator().invoke(create, new C7545n(this, completionHandler));
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
            MiotManager.getDeviceManipulator().removePropertyChangedListener(create, new C7550s(this, completionHandler));
            return;
        }
        throw new IllegalArgumentException("handler is null");
    }
}
