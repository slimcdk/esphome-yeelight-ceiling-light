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

    public enum CmdKey {
        undefined,
        cfg_pomodoro,
        cfg_lan_ctrl,
        cfg_save_state,
        cfg_init_power,
        cfg_smart_switch
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

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Mono4Service$a */
    class C7712a implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7717c0 f13791a;

        C7712a(Mono4Service mono4Service, C7717c0 c0Var) {
            this.f13791a = c0Var;
        }

        public void onFailed(int i, String str) {
            this.f13791a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("FlowParams");
            if (property.isValueValid()) {
                this.f13791a.onSucceed((String) propertyInfo.getValue("FlowParams"));
                return;
            }
            C7717c0 c0Var = this.f13791a;
            c0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Mono4Service$a0 */
    public interface C7713a0 {
        /* renamed from: a */
        void mo34266a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Mono4Service$b */
    class C7714b implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7721e0 f13792a;

        C7714b(Mono4Service mono4Service, C7721e0 e0Var) {
            this.f13792a = e0Var;
        }

        public void onFailed(int i, String str) {
            this.f13792a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("LanMode");
            if (property.isValueValid()) {
                this.f13792a.mo34274a((Long) propertyInfo.getValue("LanMode"));
                return;
            }
            C7721e0 e0Var = this.f13792a;
            e0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Mono4Service$b0 */
    public interface C7715b0 {
        /* renamed from: a */
        void mo34268a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Mono4Service$c */
    class C7716c implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7733k0 f13793a;

        C7716c(Mono4Service mono4Service, C7733k0 k0Var) {
            this.f13793a = k0Var;
        }

        public void onFailed(int i, String str) {
            this.f13793a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("onFromPower");
            if (property.isValueValid()) {
                this.f13793a.mo34286a((Long) propertyInfo.getValue("onFromPower"));
                return;
            }
            C7733k0 k0Var = this.f13793a;
            k0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Mono4Service$c0 */
    public interface C7717c0 {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Mono4Service$d */
    class C7718d implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7719d0 f13794a;

        C7718d(Mono4Service mono4Service, C7719d0 d0Var) {
            this.f13794a = d0Var;
        }

        public void onFailed(int i, String str) {
            this.f13794a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Flowing");
            if (property.isValueValid()) {
                this.f13794a.mo34272a((Long) propertyInfo.getValue("Flowing"));
                return;
            }
            C7719d0 d0Var = this.f13794a;
            d0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Mono4Service$d0 */
    public interface C7719d0 {
        /* renamed from: a */
        void mo34272a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Mono4Service$e */
    class C7720e implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7729i0 f13795a;

        C7720e(Mono4Service mono4Service, C7729i0 i0Var) {
            this.f13795a = i0Var;
        }

        public void onFailed(int i, String str) {
            this.f13795a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("SmartSwitch");
            if (property.isValueValid()) {
                this.f13795a.mo34282a((Long) propertyInfo.getValue("SmartSwitch"));
                return;
            }
            C7729i0 i0Var = this.f13795a;
            i0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Mono4Service$e0 */
    public interface C7721e0 {
        /* renamed from: a */
        void mo34274a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Mono4Service$f */
    class C7722f implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13796a;

        C7722f(Mono4Service mono4Service, CompletionHandler completionHandler) {
            this.f13796a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13796a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13796a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Mono4Service$f0 */
    public interface C7723f0 {
        /* renamed from: a */
        void mo34276a(Power power);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Mono4Service$g */
    class C7724g implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13797a;

        C7724g(Mono4Service mono4Service, CompletionHandler completionHandler) {
            this.f13797a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13797a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13797a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Mono4Service$g0 */
    public interface C7725g0 {
        /* renamed from: a */
        void mo34278a(Power power, Long l, Long l2, Long l3, Long l4, String str, Long l5, Long l6, Long l7, Long l8);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Mono4Service$h */
    class C7726h implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13798a;

        C7726h(Mono4Service mono4Service, CompletionHandler completionHandler) {
            this.f13798a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13798a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13798a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Mono4Service$h0 */
    public interface C7727h0 {
        /* renamed from: a */
        void mo34280a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Mono4Service$i */
    class C7728i implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13799a;

        C7728i(Mono4Service mono4Service, CompletionHandler completionHandler) {
            this.f13799a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13799a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13799a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Mono4Service$i0 */
    public interface C7729i0 {
        /* renamed from: a */
        void mo34282a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Mono4Service$j */
    class C7730j implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13800a;

        C7730j(Mono4Service mono4Service, CompletionHandler completionHandler) {
            this.f13800a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13800a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13800a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Mono4Service$j0 */
    public interface C7731j0 {
        /* renamed from: a */
        void mo34284a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Mono4Service$k */
    class C7732k implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13801a;

        C7732k(Mono4Service mono4Service, CompletionHandler completionHandler) {
            this.f13801a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13801a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f13801a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Mono4Service$k0 */
    public interface C7733k0 {
        /* renamed from: a */
        void mo34286a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Mono4Service$l */
    class C7734l implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13802a;

        C7734l(Mono4Service mono4Service, CompletionHandler completionHandler) {
            this.f13802a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13802a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13802a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Mono4Service$l0 */
    public interface C7735l0 {
        /* renamed from: a */
        void mo34288a(Long l);

        /* renamed from: b */
        void mo34289b(Long l);

        /* renamed from: c */
        void mo34290c(Long l);

        /* renamed from: d */
        void mo34291d(Long l);

        /* renamed from: e */
        void mo34292e(String str);

        /* renamed from: f */
        void mo34293f(Long l);

        /* renamed from: g */
        void mo34294g(Long l);

        /* renamed from: h */
        void mo34295h(Power power);

        /* renamed from: o */
        void mo34296o(Long l);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Mono4Service$m */
    class C7736m implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13803a;

        C7736m(Mono4Service mono4Service, CompletionHandler completionHandler) {
            this.f13803a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13803a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13803a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Mono4Service$n */
    class C7737n implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13804a;

        C7737n(Mono4Service mono4Service, CompletionHandler completionHandler) {
            this.f13804a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13804a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13804a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Mono4Service$o */
    class C7738o implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13805a;

        C7738o(Mono4Service mono4Service, CompletionHandler completionHandler) {
            this.f13805a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13805a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13805a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Mono4Service$p */
    class C7739p implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13806a;

        C7739p(Mono4Service mono4Service, CompletionHandler completionHandler) {
            this.f13806a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13806a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13806a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Mono4Service$q */
    class C7740q implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13807a;

        C7740q(Mono4Service mono4Service, CompletionHandler completionHandler) {
            this.f13807a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13807a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13807a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Mono4Service$r */
    class C7741r implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13808a;

        C7741r(Mono4Service mono4Service, CompletionHandler completionHandler) {
            this.f13808a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13808a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13808a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Mono4Service$s */
    class C7742s implements DeviceManipulator.PropertyChangedListener {

        /* renamed from: a */
        final /* synthetic */ C7735l0 f13809a;

        C7742s(Mono4Service mono4Service, C7735l0 l0Var) {
            this.f13809a = l0Var;
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
                case 1179821629:
                    if (str.equals("SmartSwitch")) {
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
                        this.f13809a.mo34290c((Long) propertyInfo.getValue("SaveState"));
                        return;
                    }
                    return;
                case 1:
                    if (propertyInfo.getProperty("FlowParams").isValueValid()) {
                        this.f13809a.mo34292e((String) propertyInfo.getValue("FlowParams"));
                        return;
                    }
                    return;
                case 2:
                    if (propertyInfo.getProperty("onFromPower").isValueValid()) {
                        this.f13809a.mo34293f((Long) propertyInfo.getValue("onFromPower"));
                        return;
                    }
                    return;
                case 3:
                    if (propertyInfo.getProperty("Power").isValueValid()) {
                        this.f13809a.mo34295h(Power.valueOf((String) propertyInfo.getValue("Power")));
                        return;
                    }
                    return;
                case 4:
                    if (propertyInfo.getProperty("DelayOff").isValueValid()) {
                        this.f13809a.mo34289b((Long) propertyInfo.getValue("DelayOff"));
                        return;
                    }
                    return;
                case 5:
                    if (propertyInfo.getProperty("Flowing").isValueValid()) {
                        this.f13809a.mo34291d((Long) propertyInfo.getValue("Flowing"));
                        return;
                    }
                    return;
                case 6:
                    if (propertyInfo.getProperty("SmartSwitch").isValueValid()) {
                        this.f13809a.mo34296o((Long) propertyInfo.getValue("SmartSwitch"));
                        return;
                    }
                    return;
                case 7:
                    if (propertyInfo.getProperty("LanMode").isValueValid()) {
                        this.f13809a.mo34294g((Long) propertyInfo.getValue("LanMode"));
                        return;
                    }
                    return;
                case 8:
                    if (propertyInfo.getProperty("Bright").isValueValid()) {
                        this.f13809a.mo34288a((Long) propertyInfo.getValue("Bright"));
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Mono4Service$t */
    class C7743t implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13810a;

        C7743t(Mono4Service mono4Service, CompletionHandler completionHandler) {
            this.f13810a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13810a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f13810a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Mono4Service$u */
    class C7744u implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7725g0 f13811a;

        C7744u(Mono4Service mono4Service, C7725g0 g0Var) {
            this.f13811a = g0Var;
        }

        public void onFailed(int i, String str) {
            this.f13811a.onFailed(i, str);
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
                com.yeelight.yeelib.device.xiaomi.Mono4Service$Power r0 = com.yeelight.yeelib.device.xiaomi.Mono4Service.Power.valueOf(r0)
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
                com.yeelight.yeelib.device.xiaomi.Mono4Service$g0 r3 = r14.f13811a
                r3.mo34278a(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.xiaomi.Mono4Service.C7744u.onSucceed(com.miot.common.device.invocation.PropertyInfo):void");
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Mono4Service$v */
    class C7745v implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7723f0 f13812a;

        C7745v(Mono4Service mono4Service, C7723f0 f0Var) {
            this.f13812a = f0Var;
        }

        public void onFailed(int i, String str) {
            this.f13812a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Power");
            if (property.isValueValid()) {
                this.f13812a.mo34276a(Power.valueOf((String) propertyInfo.getValue("Power")));
                return;
            }
            C7723f0 f0Var = this.f13812a;
            f0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Mono4Service$w */
    class C7746w implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7713a0 f13813a;

        C7746w(Mono4Service mono4Service, C7713a0 a0Var) {
            this.f13813a = a0Var;
        }

        public void onFailed(int i, String str) {
            this.f13813a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Bright");
            if (property.isValueValid()) {
                this.f13813a.mo34266a((Long) propertyInfo.getValue("Bright"));
                return;
            }
            C7713a0 a0Var = this.f13813a;
            a0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Mono4Service$x */
    class C7747x implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7731j0 f13814a;

        C7747x(Mono4Service mono4Service, C7731j0 j0Var) {
            this.f13814a = j0Var;
        }

        public void onFailed(int i, String str) {
            this.f13814a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Temperature");
            if (property.isValueValid()) {
                this.f13814a.mo34284a((Long) propertyInfo.getValue("Temperature"));
                return;
            }
            C7731j0 j0Var = this.f13814a;
            j0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Mono4Service$y */
    class C7748y implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7715b0 f13815a;

        C7748y(Mono4Service mono4Service, C7715b0 b0Var) {
            this.f13815a = b0Var;
        }

        public void onFailed(int i, String str) {
            this.f13815a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("DelayOff");
            if (property.isValueValid()) {
                this.f13815a.mo34268a((Long) propertyInfo.getValue("DelayOff"));
                return;
            }
            C7715b0 b0Var = this.f13815a;
            b0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Mono4Service$z */
    class C7749z implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7727h0 f13816a;

        C7749z(Mono4Service mono4Service, C7727h0 h0Var) {
            this.f13816a = h0Var;
        }

        public void onFailed(int i, String str) {
            this.f13816a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("SaveState");
            if (property.isValueValid()) {
                this.f13816a.mo34280a((Long) propertyInfo.getValue("SaveState"));
                return;
            }
            C7727h0 h0Var = this.f13816a;
            h0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
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
                MiotManager.getDeviceManipulator().invoke(create, new C7740q(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7726h(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getBright(C7713a0 a0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Bright"), new C7746w(this, a0Var));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7739p(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getDelayOff(C7715b0 b0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "DelayOff"), new C7748y(this, b0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowParams(C7717c0 c0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "FlowParams"), new C7712a(this, c0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowing(C7719d0 d0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Flowing"), new C7718d(this, d0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getLanMode(C7721e0 e0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "LanMode"), new C7714b(this, e0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getPower(C7723f0 f0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Power"), new C7745v(this, f0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getProperties(C7725g0 g0Var) {
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
            MiotManager.getDeviceManipulator().readProperty(create, new C7744u(this, g0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getSaveState(C7727h0 h0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "SaveState"), new C7749z(this, h0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getSmartSwitch(C7729i0 i0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "SmartSwitch"), new C7720e(this, i0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getTemperature(C7731j0 j0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Temperature"), new C7747x(this, j0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getonFromPower(C7733k0 k0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "onFromPower"), new C7716c(this, k0Var));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7736m(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7728i(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7722f(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7724g(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7741r(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7730j(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7737n(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7734l(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void subscribeNotifications(CompletionHandler completionHandler, C7735l0 l0Var) {
        if (completionHandler == null) {
            throw new IllegalArgumentException("handler is null");
        } else if (l0Var != null) {
            PropertyInfo create = PropertyInfoFactory.create(getService());
            for (Property next : getService().getProperties()) {
                if (next.getDefinition().isNotifiable()) {
                    create.addProperty(next);
                }
            }
            MiotManager.getDeviceManipulator().addPropertyChangedListener(create, new C7732k(this, completionHandler), new C7742s(this, l0Var));
        } else {
            throw new IllegalArgumentException("listener is null");
        }
    }

    public void toggle(CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "toggle");
            if (create != null) {
                MiotManager.getDeviceManipulator().invoke(create, new C7738o(this, completionHandler));
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
            MiotManager.getDeviceManipulator().removePropertyChangedListener(create, new C7743t(this, completionHandler));
            return;
        }
        throw new IllegalArgumentException("handler is null");
    }
}
