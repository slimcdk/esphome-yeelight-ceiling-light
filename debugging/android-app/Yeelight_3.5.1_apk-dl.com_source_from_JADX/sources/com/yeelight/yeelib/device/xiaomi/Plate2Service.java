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

public class Plate2Service extends AbstractService {
    public static final String ACTION_addCron = "addCron";
    public static final String ACTION_delCron = "delCron";
    public static final String ACTION_getCron = "getCron";
    public static final String ACTION_openWithMode = "openWithMode";
    public static final String ACTION_restore = "restore";
    public static final String ACTION_sendCmd = "sendCmd";
    public static final String ACTION_setBright = "setBright";
    public static final String ACTION_setDefault = "setDefault";
    public static final String ACTION_setPower = "setPower";
    public static final String ACTION_setRgb = "setRgb";
    public static final String ACTION_setScene = "setScene";
    public static final String ACTION_toggle = "toggle";
    public static final String PROPERTY_Bright = "Bright";
    public static final String PROPERTY_CmdKey = "CmdKey";
    public static final String PROPERTY_CmdValue = "CmdValue";
    public static final String PROPERTY_ColorMode = "ColorMode";
    public static final String PROPERTY_CronType = "CronType";
    public static final String PROPERTY_DelayOff = "DelayOff";
    public static final String PROPERTY_Duration = "Duration";
    public static final String PROPERTY_Effect = "Effect";
    public static final String PROPERTY_Hue = "Hue";
    public static final String PROPERTY_LanMode = "LanMode";
    public static final String PROPERTY_Mode = "Mode";
    public static final String PROPERTY_ParamCount = "ParamCount";
    public static final String PROPERTY_ParamFinish = "ParamFinish";
    public static final String PROPERTY_ParamModel = "ParamModel";
    public static final String PROPERTY_Power = "Power";
    public static final String PROPERTY_Rgb = "Rgb";
    public static final String PROPERTY_Sat = "Sat";
    public static final String PROPERTY_SaveState = "SaveState";
    public static final String PROPERTY_Temperature = "Temperature";
    public static final String PROPERTY_onFromPower = "onFromPower";
    private static final String TAG = "Plate2Service";
    private AbstractDevice mDevice = null;

    public enum CmdKey {
        undefined,
        cfg_pomodoro,
        cfg_lan_ctrl,
        cfg_save_state,
        cfg_init_power
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

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Plate2Service$a */
    class C7906a implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7911c0 f13930a;

        C7906a(Plate2Service plate2Service, C7911c0 c0Var) {
            this.f13930a = c0Var;
        }

        public void onFailed(int i, String str) {
            this.f13930a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("ColorMode");
            if (property.isValueValid()) {
                this.f13930a.mo34555a((Long) propertyInfo.getValue("ColorMode"));
                return;
            }
            C7911c0 c0Var = this.f13930a;
            c0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Plate2Service$a0 */
    class C7907a0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7925j0 f13931a;

        C7907a0(Plate2Service plate2Service, C7925j0 j0Var) {
            this.f13931a = j0Var;
        }

        public void onFailed(int i, String str) {
            this.f13931a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Sat");
            if (property.isValueValid()) {
                this.f13931a.mo34569a((Long) propertyInfo.getValue("Sat"));
                return;
            }
            C7925j0 j0Var = this.f13931a;
            j0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Plate2Service$b */
    class C7908b implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7923i0 f13932a;

        C7908b(Plate2Service plate2Service, C7923i0 i0Var) {
            this.f13932a = i0Var;
        }

        public void onFailed(int i, String str) {
            this.f13932a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Rgb");
            if (property.isValueValid()) {
                this.f13932a.mo34567a((Long) propertyInfo.getValue("Rgb"));
                return;
            }
            C7923i0 i0Var = this.f13932a;
            i0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Plate2Service$b0 */
    public interface C7909b0 {
        /* renamed from: a */
        void mo34553a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Plate2Service$c */
    class C7910c implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7913d0 f13933a;

        C7910c(Plate2Service plate2Service, C7913d0 d0Var) {
            this.f13933a = d0Var;
        }

        public void onFailed(int i, String str) {
            this.f13933a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("DelayOff");
            if (property.isValueValid()) {
                this.f13933a.mo34557a((Long) propertyInfo.getValue("DelayOff"));
                return;
            }
            C7913d0 d0Var = this.f13933a;
            d0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Plate2Service$c0 */
    public interface C7911c0 {
        /* renamed from: a */
        void mo34555a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Plate2Service$d */
    class C7912d implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7927k0 f13934a;

        C7912d(Plate2Service plate2Service, C7927k0 k0Var) {
            this.f13934a = k0Var;
        }

        public void onFailed(int i, String str) {
            this.f13934a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("SaveState");
            if (property.isValueValid()) {
                this.f13934a.mo34571a((Long) propertyInfo.getValue("SaveState"));
                return;
            }
            C7927k0 k0Var = this.f13934a;
            k0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Plate2Service$d0 */
    public interface C7913d0 {
        /* renamed from: a */
        void mo34557a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Plate2Service$e */
    class C7914e implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7917f0 f13935a;

        C7914e(Plate2Service plate2Service, C7917f0 f0Var) {
            this.f13935a = f0Var;
        }

        public void onFailed(int i, String str) {
            this.f13935a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("LanMode");
            if (property.isValueValid()) {
                this.f13935a.mo34561a((Long) propertyInfo.getValue("LanMode"));
                return;
            }
            C7917f0 f0Var = this.f13935a;
            f0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Plate2Service$e0 */
    public interface C7915e0 {
        /* renamed from: a */
        void mo34559a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Plate2Service$f */
    class C7916f implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7931m0 f13936a;

        C7916f(Plate2Service plate2Service, C7931m0 m0Var) {
            this.f13936a = m0Var;
        }

        public void onFailed(int i, String str) {
            this.f13936a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("onFromPower");
            if (property.isValueValid()) {
                this.f13936a.mo34575a((Long) propertyInfo.getValue("onFromPower"));
                return;
            }
            C7931m0 m0Var = this.f13936a;
            m0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Plate2Service$f0 */
    public interface C7917f0 {
        /* renamed from: a */
        void mo34561a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Plate2Service$g */
    class C7918g implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13937a;

        C7918g(Plate2Service plate2Service, CompletionHandler completionHandler) {
            this.f13937a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13937a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13937a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Plate2Service$g0 */
    public interface C7919g0 {
        /* renamed from: a */
        void mo34563a(Power power);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Plate2Service$h */
    class C7920h implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13938a;

        C7920h(Plate2Service plate2Service, CompletionHandler completionHandler) {
            this.f13938a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13938a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13938a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Plate2Service$h0 */
    public interface C7921h0 {
        /* renamed from: a */
        void mo34565a(Power power, Long l, Long l2, Long l3, Long l4, Long l5, Long l6, Long l7, Long l8, Long l9, Long l10);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Plate2Service$i */
    class C7922i implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13939a;

        C7922i(Plate2Service plate2Service, CompletionHandler completionHandler) {
            this.f13939a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13939a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13939a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Plate2Service$i0 */
    public interface C7923i0 {
        /* renamed from: a */
        void mo34567a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Plate2Service$j */
    class C7924j implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13940a;

        C7924j(Plate2Service plate2Service, CompletionHandler completionHandler) {
            this.f13940a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13940a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13940a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Plate2Service$j0 */
    public interface C7925j0 {
        /* renamed from: a */
        void mo34569a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Plate2Service$k */
    class C7926k implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13941a;

        C7926k(Plate2Service plate2Service, CompletionHandler completionHandler) {
            this.f13941a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13941a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f13941a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Plate2Service$k0 */
    public interface C7927k0 {
        /* renamed from: a */
        void mo34571a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Plate2Service$l */
    class C7928l implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13942a;

        C7928l(Plate2Service plate2Service, CompletionHandler completionHandler) {
            this.f13942a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13942a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13942a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Plate2Service$l0 */
    public interface C7929l0 {
        /* renamed from: a */
        void mo34573a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Plate2Service$m */
    class C7930m implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13943a;

        C7930m(Plate2Service plate2Service, CompletionHandler completionHandler) {
            this.f13943a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13943a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13943a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Plate2Service$m0 */
    public interface C7931m0 {
        /* renamed from: a */
        void mo34575a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Plate2Service$n */
    class C7932n implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13944a;

        C7932n(Plate2Service plate2Service, CompletionHandler completionHandler) {
            this.f13944a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13944a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13944a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Plate2Service$n0 */
    public interface C7933n0 {
        /* renamed from: a */
        void mo34577a(Long l);

        /* renamed from: b */
        void mo34578b(Long l);

        /* renamed from: c */
        void mo34579c(Long l);

        /* renamed from: d */
        void mo34580d(Power power);

        /* renamed from: f */
        void mo34581f(Long l);

        /* renamed from: g */
        void mo34582g(Long l);

        /* renamed from: j */
        void mo34583j(Long l);

        /* renamed from: k */
        void mo34584k(Long l);

        /* renamed from: l */
        void mo34585l(Long l);

        /* renamed from: n */
        void mo34586n(Long l);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Plate2Service$o */
    class C7934o implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13945a;

        C7934o(Plate2Service plate2Service, CompletionHandler completionHandler) {
            this.f13945a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13945a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13945a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Plate2Service$p */
    class C7935p implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13946a;

        C7935p(Plate2Service plate2Service, CompletionHandler completionHandler) {
            this.f13946a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13946a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13946a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Plate2Service$q */
    class C7936q implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13947a;

        C7936q(Plate2Service plate2Service, CompletionHandler completionHandler) {
            this.f13947a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13947a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13947a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Plate2Service$r */
    class C7937r implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13948a;

        C7937r(Plate2Service plate2Service, CompletionHandler completionHandler) {
            this.f13948a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13948a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13948a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Plate2Service$s */
    class C7938s implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13949a;

        C7938s(Plate2Service plate2Service, CompletionHandler completionHandler) {
            this.f13949a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13949a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13949a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Plate2Service$t */
    class C7939t implements DeviceManipulator.PropertyChangedListener {

        /* renamed from: a */
        final /* synthetic */ C7933n0 f13950a;

        C7939t(Plate2Service plate2Service, C7933n0 n0Var) {
            this.f13950a = n0Var;
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
                case -310275194:
                    if (str.equals("ColorMode")) {
                        c = 1;
                        break;
                    }
                    break;
                case 72920:
                    if (str.equals("Hue")) {
                        c = 2;
                        break;
                    }
                    break;
                case 82093:
                    if (str.equals("Rgb")) {
                        c = 3;
                        break;
                    }
                    break;
                case 82886:
                    if (str.equals("Sat")) {
                        c = 4;
                        break;
                    }
                    break;
                case 35911772:
                    if (str.equals("onFromPower")) {
                        c = 5;
                        break;
                    }
                    break;
                case 77306085:
                    if (str.equals("Power")) {
                        c = 6;
                        break;
                    }
                    break;
                case 880790796:
                    if (str.equals("DelayOff")) {
                        c = 7;
                        break;
                    }
                    break;
                case 1611821756:
                    if (str.equals("LanMode")) {
                        c = 8;
                        break;
                    }
                    break;
                case 1998035738:
                    if (str.equals("Bright")) {
                        c = 9;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    if (propertyInfo.getProperty("SaveState").isValueValid()) {
                        this.f13950a.mo34579c((Long) propertyInfo.getValue("SaveState"));
                        return;
                    }
                    return;
                case 1:
                    if (propertyInfo.getProperty("ColorMode").isValueValid()) {
                        this.f13950a.mo34585l((Long) propertyInfo.getValue("ColorMode"));
                        return;
                    }
                    return;
                case 2:
                    if (propertyInfo.getProperty("Hue").isValueValid()) {
                        this.f13950a.mo34586n((Long) propertyInfo.getValue("Hue"));
                        return;
                    }
                    return;
                case 3:
                    if (propertyInfo.getProperty("Rgb").isValueValid()) {
                        this.f13950a.mo34583j((Long) propertyInfo.getValue("Rgb"));
                        return;
                    }
                    return;
                case 4:
                    if (propertyInfo.getProperty("Sat").isValueValid()) {
                        this.f13950a.mo34584k((Long) propertyInfo.getValue("Sat"));
                        return;
                    }
                    return;
                case 5:
                    if (propertyInfo.getProperty("onFromPower").isValueValid()) {
                        this.f13950a.mo34581f((Long) propertyInfo.getValue("onFromPower"));
                        return;
                    }
                    return;
                case 6:
                    if (propertyInfo.getProperty("Power").isValueValid()) {
                        this.f13950a.mo34580d(Power.valueOf((String) propertyInfo.getValue("Power")));
                        return;
                    }
                    return;
                case 7:
                    if (propertyInfo.getProperty("DelayOff").isValueValid()) {
                        this.f13950a.mo34578b((Long) propertyInfo.getValue("DelayOff"));
                        return;
                    }
                    return;
                case 8:
                    if (propertyInfo.getProperty("LanMode").isValueValid()) {
                        this.f13950a.mo34582g((Long) propertyInfo.getValue("LanMode"));
                        return;
                    }
                    return;
                case 9:
                    if (propertyInfo.getProperty("Bright").isValueValid()) {
                        this.f13950a.mo34577a((Long) propertyInfo.getValue("Bright"));
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Plate2Service$u */
    class C7940u implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13951a;

        C7940u(Plate2Service plate2Service, CompletionHandler completionHandler) {
            this.f13951a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13951a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f13951a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Plate2Service$v */
    class C7941v implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7921h0 f13952a;

        C7941v(Plate2Service plate2Service, C7921h0 h0Var) {
            this.f13952a = h0Var;
        }

        public void onFailed(int i, String str) {
            this.f13952a.onFailed(i, str);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.Long} */
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
                com.yeelight.yeelib.device.xiaomi.Plate2Service$Power r1 = com.yeelight.yeelib.device.xiaomi.Plate2Service.Power.valueOf(r1)
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
                java.lang.String r1 = "Hue"
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
                java.lang.String r1 = "Sat"
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
                java.lang.String r1 = "ColorMode"
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
                java.lang.String r1 = "Rgb"
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
                java.lang.String r1 = "DelayOff"
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
                java.lang.String r1 = "SaveState"
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
                java.lang.String r1 = "LanMode"
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
                java.lang.String r1 = "onFromPower"
                com.miot.common.property.Property r0 = r0.getProperty(r1)
                boolean r1 = r0.isValueValid()
                if (r1 == 0) goto L_0x00ec
                java.lang.Object r0 = r0.getValue()
                r3 = r0
                java.lang.Long r3 = (java.lang.Long) r3
            L_0x00ec:
                r0 = r16
                r15 = r3
                com.yeelight.yeelib.device.xiaomi.Plate2Service$h0 r4 = r0.f13952a
                r4.mo34565a(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.xiaomi.Plate2Service.C7941v.onSucceed(com.miot.common.device.invocation.PropertyInfo):void");
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Plate2Service$w */
    class C7942w implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7919g0 f13953a;

        C7942w(Plate2Service plate2Service, C7919g0 g0Var) {
            this.f13953a = g0Var;
        }

        public void onFailed(int i, String str) {
            this.f13953a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Power");
            if (property.isValueValid()) {
                this.f13953a.mo34563a(Power.valueOf((String) propertyInfo.getValue("Power")));
                return;
            }
            C7919g0 g0Var = this.f13953a;
            g0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Plate2Service$x */
    class C7943x implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7909b0 f13954a;

        C7943x(Plate2Service plate2Service, C7909b0 b0Var) {
            this.f13954a = b0Var;
        }

        public void onFailed(int i, String str) {
            this.f13954a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Bright");
            if (property.isValueValid()) {
                this.f13954a.mo34553a((Long) propertyInfo.getValue("Bright"));
                return;
            }
            C7909b0 b0Var = this.f13954a;
            b0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Plate2Service$y */
    class C7944y implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7929l0 f13955a;

        C7944y(Plate2Service plate2Service, C7929l0 l0Var) {
            this.f13955a = l0Var;
        }

        public void onFailed(int i, String str) {
            this.f13955a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Temperature");
            if (property.isValueValid()) {
                this.f13955a.mo34573a((Long) propertyInfo.getValue("Temperature"));
                return;
            }
            C7929l0 l0Var = this.f13955a;
            l0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Plate2Service$z */
    class C7945z implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7915e0 f13956a;

        C7945z(Plate2Service plate2Service, C7915e0 e0Var) {
            this.f13956a = e0Var;
        }

        public void onFailed(int i, String str) {
            this.f13956a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Hue");
            if (property.isValueValid()) {
                this.f13956a.mo34559a((Long) propertyInfo.getValue("Hue"));
                return;
            }
            C7915e0 e0Var = this.f13956a;
            e0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    public Plate2Service(AbstractDevice abstractDevice) {
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
                MiotManager.getDeviceManipulator().invoke(create, new C7937r(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7922i(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getBright(C7909b0 b0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Bright"), new C7943x(this, b0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getColorMode(C7911c0 c0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "ColorMode"), new C7906a(this, c0Var));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7936q(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getDelayOff(C7913d0 d0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "DelayOff"), new C7910c(this, d0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getHue(C7915e0 e0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Hue"), new C7945z(this, e0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getLanMode(C7917f0 f0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "LanMode"), new C7914e(this, f0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getPower(C7919g0 g0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Power"), new C7942w(this, g0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getProperties(C7921h0 h0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            PropertyInfo create = PropertyInfoFactory.create(getService());
            create.addProperty(getService().getProperty("Power"));
            create.addProperty(getService().getProperty("Bright"));
            create.addProperty(getService().getProperty("Temperature"));
            create.addProperty(getService().getProperty("Hue"));
            create.addProperty(getService().getProperty("Sat"));
            create.addProperty(getService().getProperty("ColorMode"));
            create.addProperty(getService().getProperty("Rgb"));
            create.addProperty(getService().getProperty("DelayOff"));
            create.addProperty(getService().getProperty("SaveState"));
            create.addProperty(getService().getProperty("LanMode"));
            create.addProperty(getService().getProperty("onFromPower"));
            MiotManager.getDeviceManipulator().readProperty(create, new C7941v(this, h0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getRgb(C7923i0 i0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Rgb"), new C7908b(this, i0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getSat(C7925j0 j0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Sat"), new C7907a0(this, j0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getSaveState(C7927k0 k0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "SaveState"), new C7912d(this, k0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getTemperature(C7929l0 l0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Temperature"), new C7944y(this, l0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getonFromPower(C7931m0 m0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "onFromPower"), new C7916f(this, m0Var));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7930m(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7924j(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7918g(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7920h(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7938s(this, completionHandler));
                return;
            }
            throw new MiotException("actionInfo is null");
        }
        throw new MiotException("device not configurated connection");
    }

    public void setPower(Power power, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setPower");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (create.setArgumentValue("Power", power.toString())) {
                MiotManager.getDeviceManipulator().invoke(create, new C7932n(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setRgb(Long l, Effect effect, Long l2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setRgb");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("Rgb", l)) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Effect", effect.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("Duration", l2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C7934o(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7928l(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void subscribeNotifications(CompletionHandler completionHandler, C7933n0 n0Var) {
        if (completionHandler == null) {
            throw new IllegalArgumentException("handler is null");
        } else if (n0Var != null) {
            PropertyInfo create = PropertyInfoFactory.create(getService());
            for (Property next : getService().getProperties()) {
                if (next.getDefinition().isNotifiable()) {
                    create.addProperty(next);
                }
            }
            MiotManager.getDeviceManipulator().addPropertyChangedListener(create, new C7926k(this, completionHandler), new C7939t(this, n0Var));
        } else {
            throw new IllegalArgumentException("listener is null");
        }
    }

    public void toggle(CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "toggle");
            if (create != null) {
                MiotManager.getDeviceManipulator().invoke(create, new C7935p(this, completionHandler));
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
            MiotManager.getDeviceManipulator().removePropertyChangedListener(create, new C7940u(this, completionHandler));
            return;
        }
        throw new IllegalArgumentException("handler is null");
    }
}
