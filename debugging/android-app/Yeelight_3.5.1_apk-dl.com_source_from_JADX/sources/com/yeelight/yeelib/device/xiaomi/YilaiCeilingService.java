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

public class YilaiCeilingService extends AbstractService {
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
    public static final String PROPERTY_FlowCount = "FlowCount";
    public static final String PROPERTY_FlowParams = "FlowParams";
    public static final String PROPERTY_Flowing = "Flowing";
    public static final String PROPERTY_LanMode = "LanMode";
    public static final String PROPERTY_MiBandSleep = "MiBandSleep";
    public static final String PROPERTY_Mode = "Mode";
    public static final String PROPERTY_NightTimeInfo = "NightTimeInfo";
    public static final String PROPERTY_ParamColors = "ParamColors";
    public static final String PROPERTY_ParamCount = "ParamCount";
    public static final String PROPERTY_ParamFinish = "ParamFinish";
    public static final String PROPERTY_ParamModel = "ParamModel";
    public static final String PROPERTY_Power = "Power";
    public static final String PROPERTY_SaveState = "SaveState";
    public static final String PROPERTY_adjustAction = "adjustAction";
    public static final String PROPERTY_adjustProper = "adjustProper";
    public static final String PROPERTY_onFromPower = "onFromPower";
    private static final String TAG = "YilaiCeilingService";
    private AbstractDevice mDevice = null;

    public enum CmdKey {
        undefined,
        cfg_pomodoro,
        cfg_lan_ctrl,
        cfg_save_state,
        nighttime,
        nightlight,
        miband_sleep,
        pseudo_beacon,
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

    /* renamed from: com.yeelight.yeelib.device.xiaomi.YilaiCeilingService$a */
    class C8202a implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8229n0 f14110a;

        C8202a(YilaiCeilingService yilaiCeilingService, C8229n0 n0Var) {
            this.f14110a = n0Var;
        }

        public void onFailed(int i, String str) {
            this.f14110a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("SaveState");
            if (property.isValueValid()) {
                this.f14110a.mo35127a((Long) propertyInfo.getValue("SaveState"));
                return;
            }
            C8229n0 n0Var = this.f14110a;
            n0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.YilaiCeilingService$a0 */
    class C8203a0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8211e0 f14111a;

        C8203a0(YilaiCeilingService yilaiCeilingService, C8211e0 e0Var) {
            this.f14111a = e0Var;
        }

        public void onFailed(int i, String str) {
            this.f14111a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Ct");
            if (property.isValueValid()) {
                this.f14111a.mo35109a((Long) propertyInfo.getValue("Ct"));
                return;
            }
            C8211e0 e0Var = this.f14111a;
            e0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.YilaiCeilingService$b */
    class C8204b implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8219i0 f14112a;

        C8204b(YilaiCeilingService yilaiCeilingService, C8219i0 i0Var) {
            this.f14112a = i0Var;
        }

        public void onFailed(int i, String str) {
            this.f14112a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("LanMode");
            if (property.isValueValid()) {
                this.f14112a.mo35117a((Long) propertyInfo.getValue("LanMode"));
                return;
            }
            C8219i0 i0Var = this.f14112a;
            i0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.YilaiCeilingService$b0 */
    class C8205b0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8215g0 f14113a;

        C8205b0(YilaiCeilingService yilaiCeilingService, C8215g0 g0Var) {
            this.f14113a = g0Var;
        }

        public void onFailed(int i, String str) {
            this.f14113a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("FlowParams");
            if (property.isValueValid()) {
                this.f14113a.onSucceed((String) propertyInfo.getValue("FlowParams"));
                return;
            }
            C8215g0 g0Var = this.f14113a;
            g0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.YilaiCeilingService$c */
    class C8206c implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8231o0 f14114a;

        C8206c(YilaiCeilingService yilaiCeilingService, C8231o0 o0Var) {
            this.f14114a = o0Var;
        }

        public void onFailed(int i, String str) {
            this.f14114a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("onFromPower");
            if (property.isValueValid()) {
                this.f14114a.mo35129a((Long) propertyInfo.getValue("onFromPower"));
                return;
            }
            C8231o0 o0Var = this.f14114a;
            o0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.YilaiCeilingService$c0 */
    class C8207c0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8213f0 f14115a;

        C8207c0(YilaiCeilingService yilaiCeilingService, C8213f0 f0Var) {
            this.f14115a = f0Var;
        }

        public void onFailed(int i, String str) {
            this.f14115a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("DelayOff");
            if (property.isValueValid()) {
                this.f14115a.mo35111a((Long) propertyInfo.getValue("DelayOff"));
                return;
            }
            C8213f0 f0Var = this.f14115a;
            f0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.YilaiCeilingService$d */
    class C8208d implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8217h0 f14116a;

        C8208d(YilaiCeilingService yilaiCeilingService, C8217h0 h0Var) {
            this.f14116a = h0Var;
        }

        public void onFailed(int i, String str) {
            this.f14116a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Flowing");
            if (property.isValueValid()) {
                this.f14116a.mo35115a((Long) propertyInfo.getValue("Flowing"));
                return;
            }
            C8217h0 h0Var = this.f14116a;
            h0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.YilaiCeilingService$d0 */
    public interface C8209d0 {
        /* renamed from: a */
        void mo35107a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.YilaiCeilingService$e */
    class C8210e implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8223k0 f14117a;

        C8210e(YilaiCeilingService yilaiCeilingService, C8223k0 k0Var) {
            this.f14117a = k0Var;
        }

        public void onFailed(int i, String str) {
            this.f14117a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("NightTimeInfo");
            if (property.isValueValid()) {
                this.f14117a.onSucceed((String) propertyInfo.getValue("NightTimeInfo"));
                return;
            }
            C8223k0 k0Var = this.f14117a;
            k0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.YilaiCeilingService$e0 */
    public interface C8211e0 {
        /* renamed from: a */
        void mo35109a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.YilaiCeilingService$f */
    class C8212f implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8221j0 f14118a;

        C8212f(YilaiCeilingService yilaiCeilingService, C8221j0 j0Var) {
            this.f14118a = j0Var;
        }

        public void onFailed(int i, String str) {
            this.f14118a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("MiBandSleep");
            if (property.isValueValid()) {
                this.f14118a.mo35119a((Long) propertyInfo.getValue("MiBandSleep"));
                return;
            }
            C8221j0 j0Var = this.f14118a;
            j0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.YilaiCeilingService$f0 */
    public interface C8213f0 {
        /* renamed from: a */
        void mo35111a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.YilaiCeilingService$g */
    class C8214g implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f14119a;

        C8214g(YilaiCeilingService yilaiCeilingService, CompletionHandler completionHandler) {
            this.f14119a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f14119a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f14119a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.YilaiCeilingService$g0 */
    public interface C8215g0 {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.YilaiCeilingService$h */
    class C8216h implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f14120a;

        C8216h(YilaiCeilingService yilaiCeilingService, CompletionHandler completionHandler) {
            this.f14120a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f14120a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f14120a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.YilaiCeilingService$h0 */
    public interface C8217h0 {
        /* renamed from: a */
        void mo35115a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.YilaiCeilingService$i */
    class C8218i implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f14121a;

        C8218i(YilaiCeilingService yilaiCeilingService, CompletionHandler completionHandler) {
            this.f14121a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f14121a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f14121a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.YilaiCeilingService$i0 */
    public interface C8219i0 {
        /* renamed from: a */
        void mo35117a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.YilaiCeilingService$j */
    class C8220j implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f14122a;

        C8220j(YilaiCeilingService yilaiCeilingService, CompletionHandler completionHandler) {
            this.f14122a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f14122a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f14122a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.YilaiCeilingService$j0 */
    public interface C8221j0 {
        /* renamed from: a */
        void mo35119a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.YilaiCeilingService$k */
    class C8222k implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f14123a;

        C8222k(YilaiCeilingService yilaiCeilingService, CompletionHandler completionHandler) {
            this.f14123a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f14123a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f14123a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.YilaiCeilingService$k0 */
    public interface C8223k0 {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.YilaiCeilingService$l */
    class C8224l implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f14124a;

        C8224l(YilaiCeilingService yilaiCeilingService, CompletionHandler completionHandler) {
            this.f14124a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f14124a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f14124a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.YilaiCeilingService$l0 */
    public interface C8225l0 {
        /* renamed from: a */
        void mo35123a(Power power);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.YilaiCeilingService$m */
    class C8226m implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f14125a;

        C8226m(YilaiCeilingService yilaiCeilingService, CompletionHandler completionHandler) {
            this.f14125a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f14125a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f14125a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.YilaiCeilingService$m0 */
    public interface C8227m0 {
        /* renamed from: a */
        void mo35125a(Power power, Long l, Long l2, String str, Long l3, Long l4, Long l5, Long l6, Long l7, String str2, Long l8);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.YilaiCeilingService$n */
    class C8228n implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f14126a;

        C8228n(YilaiCeilingService yilaiCeilingService, CompletionHandler completionHandler) {
            this.f14126a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f14126a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f14126a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.YilaiCeilingService$n0 */
    public interface C8229n0 {
        /* renamed from: a */
        void mo35127a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.YilaiCeilingService$o */
    class C8230o implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f14127a;

        C8230o(YilaiCeilingService yilaiCeilingService, CompletionHandler completionHandler) {
            this.f14127a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f14127a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f14127a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.YilaiCeilingService$o0 */
    public interface C8231o0 {
        /* renamed from: a */
        void mo35129a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.YilaiCeilingService$p */
    class C8232p implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f14128a;

        C8232p(YilaiCeilingService yilaiCeilingService, CompletionHandler completionHandler) {
            this.f14128a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f14128a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f14128a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.YilaiCeilingService$p0 */
    public interface C8233p0 {
        /* renamed from: a */
        void mo35131a(Long l);

        /* renamed from: b */
        void mo35132b(Long l);

        /* renamed from: c */
        void mo35133c(Long l);

        /* renamed from: d */
        void mo35134d(Long l);

        /* renamed from: e */
        void mo35135e(String str);

        /* renamed from: f */
        void mo35136f(Long l);

        /* renamed from: g */
        void mo35137g(Long l);

        /* renamed from: h */
        void mo35138h(Long l);

        /* renamed from: i */
        void mo35139i(String str);

        /* renamed from: j */
        void mo35140j(Power power);

        /* renamed from: m */
        void mo35141m(Long l);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.YilaiCeilingService$q */
    class C8234q implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f14129a;

        C8234q(YilaiCeilingService yilaiCeilingService, CompletionHandler completionHandler) {
            this.f14129a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f14129a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f14129a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.YilaiCeilingService$r */
    class C8235r implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f14130a;

        C8235r(YilaiCeilingService yilaiCeilingService, CompletionHandler completionHandler) {
            this.f14130a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f14130a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f14130a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.YilaiCeilingService$s */
    class C8236s implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f14131a;

        C8236s(YilaiCeilingService yilaiCeilingService, CompletionHandler completionHandler) {
            this.f14131a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f14131a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f14131a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.YilaiCeilingService$t */
    class C8237t implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f14132a;

        C8237t(YilaiCeilingService yilaiCeilingService, CompletionHandler completionHandler) {
            this.f14132a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f14132a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f14132a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.YilaiCeilingService$u */
    class C8238u implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f14133a;

        C8238u(YilaiCeilingService yilaiCeilingService, CompletionHandler completionHandler) {
            this.f14133a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f14133a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f14133a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.YilaiCeilingService$v */
    class C8239v implements DeviceManipulator.PropertyChangedListener {

        /* renamed from: a */
        final /* synthetic */ C8233p0 f14134a;

        C8239v(YilaiCeilingService yilaiCeilingService, C8233p0 p0Var) {
            this.f14134a = p0Var;
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
                case -1331143373:
                    if (str.equals("NightTimeInfo")) {
                        c = 2;
                        break;
                    }
                    break;
                case -80340154:
                    if (str.equals("MiBandSleep")) {
                        c = 3;
                        break;
                    }
                    break;
                case 2193:
                    if (str.equals("Ct")) {
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
                case 898856916:
                    if (str.equals("Flowing")) {
                        c = 8;
                        break;
                    }
                    break;
                case 1611821756:
                    if (str.equals("LanMode")) {
                        c = 9;
                        break;
                    }
                    break;
                case 1998035738:
                    if (str.equals("Bright")) {
                        c = 10;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    if (propertyInfo.getProperty("SaveState").isValueValid()) {
                        this.f14134a.mo35133c((Long) propertyInfo.getValue("SaveState"));
                        return;
                    }
                    return;
                case 1:
                    if (propertyInfo.getProperty("FlowParams").isValueValid()) {
                        this.f14134a.mo35135e((String) propertyInfo.getValue("FlowParams"));
                        return;
                    }
                    return;
                case 2:
                    if (propertyInfo.getProperty("NightTimeInfo").isValueValid()) {
                        this.f14134a.mo35139i((String) propertyInfo.getValue("NightTimeInfo"));
                        return;
                    }
                    return;
                case 3:
                    if (propertyInfo.getProperty("MiBandSleep").isValueValid()) {
                        this.f14134a.mo35141m((Long) propertyInfo.getValue("MiBandSleep"));
                        return;
                    }
                    return;
                case 4:
                    if (propertyInfo.getProperty("Ct").isValueValid()) {
                        this.f14134a.mo35138h((Long) propertyInfo.getValue("Ct"));
                        return;
                    }
                    return;
                case 5:
                    if (propertyInfo.getProperty("onFromPower").isValueValid()) {
                        this.f14134a.mo35136f((Long) propertyInfo.getValue("onFromPower"));
                        return;
                    }
                    return;
                case 6:
                    if (propertyInfo.getProperty("Power").isValueValid()) {
                        this.f14134a.mo35140j(Power.valueOf((String) propertyInfo.getValue("Power")));
                        return;
                    }
                    return;
                case 7:
                    if (propertyInfo.getProperty("DelayOff").isValueValid()) {
                        this.f14134a.mo35132b((Long) propertyInfo.getValue("DelayOff"));
                        return;
                    }
                    return;
                case 8:
                    if (propertyInfo.getProperty("Flowing").isValueValid()) {
                        this.f14134a.mo35134d((Long) propertyInfo.getValue("Flowing"));
                        return;
                    }
                    return;
                case 9:
                    if (propertyInfo.getProperty("LanMode").isValueValid()) {
                        this.f14134a.mo35137g((Long) propertyInfo.getValue("LanMode"));
                        return;
                    }
                    return;
                case 10:
                    if (propertyInfo.getProperty("Bright").isValueValid()) {
                        this.f14134a.mo35131a((Long) propertyInfo.getValue("Bright"));
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.YilaiCeilingService$w */
    class C8240w implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f14135a;

        C8240w(YilaiCeilingService yilaiCeilingService, CompletionHandler completionHandler) {
            this.f14135a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f14135a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f14135a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.YilaiCeilingService$x */
    class C8241x implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8227m0 f14136a;

        C8241x(YilaiCeilingService yilaiCeilingService, C8227m0 m0Var) {
            this.f14136a = m0Var;
        }

        public void onFailed(int i, String str) {
            this.f14136a.onFailed(i, str);
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
                com.yeelight.yeelib.device.xiaomi.YilaiCeilingService$Power r1 = com.yeelight.yeelib.device.xiaomi.YilaiCeilingService.Power.valueOf(r1)
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
                java.lang.String r1 = "FlowParams"
                com.miot.common.property.Property r1 = r0.getProperty(r1)
                boolean r2 = r1.isValueValid()
                if (r2 == 0) goto L_0x005a
                java.lang.Object r1 = r1.getValue()
                java.lang.String r1 = (java.lang.String) r1
                r8 = r1
                goto L_0x005b
            L_0x005a:
                r8 = r3
            L_0x005b:
                java.lang.String r1 = "DelayOff"
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
                java.lang.String r1 = "NightTimeInfo"
                com.miot.common.property.Property r1 = r0.getProperty(r1)
                boolean r2 = r1.isValueValid()
                if (r2 == 0) goto L_0x00d8
                java.lang.Object r1 = r1.getValue()
                java.lang.String r1 = (java.lang.String) r1
                r14 = r1
                goto L_0x00d9
            L_0x00d8:
                r14 = r3
            L_0x00d9:
                java.lang.String r1 = "MiBandSleep"
                com.miot.common.property.Property r0 = r0.getProperty(r1)
                boolean r1 = r0.isValueValid()
                if (r1 == 0) goto L_0x00ec
                java.lang.Object r0 = r0.getValue()
                r3 = r0
                java.lang.Long r3 = (java.lang.Long) r3
            L_0x00ec:
                r0 = r16
                r15 = r3
                com.yeelight.yeelib.device.xiaomi.YilaiCeilingService$m0 r4 = r0.f14136a
                r4.mo35125a(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.xiaomi.YilaiCeilingService.C8241x.onSucceed(com.miot.common.device.invocation.PropertyInfo):void");
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.YilaiCeilingService$y */
    class C8242y implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8225l0 f14137a;

        C8242y(YilaiCeilingService yilaiCeilingService, C8225l0 l0Var) {
            this.f14137a = l0Var;
        }

        public void onFailed(int i, String str) {
            this.f14137a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Power");
            if (property.isValueValid()) {
                this.f14137a.mo35123a(Power.valueOf((String) propertyInfo.getValue("Power")));
                return;
            }
            C8225l0 l0Var = this.f14137a;
            l0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.YilaiCeilingService$z */
    class C8243z implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8209d0 f14138a;

        C8243z(YilaiCeilingService yilaiCeilingService, C8209d0 d0Var) {
            this.f14138a = d0Var;
        }

        public void onFailed(int i, String str) {
            this.f14138a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Bright");
            if (property.isValueValid()) {
                this.f14138a.mo35107a((Long) propertyInfo.getValue("Bright"));
                return;
            }
            C8209d0 d0Var = this.f14138a;
            d0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    public YilaiCeilingService(AbstractDevice abstractDevice) {
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
                MiotManager.getDeviceManipulator().invoke(create, new C8230o(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8216h(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getBright(C8209d0 d0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Bright"), new C8243z(this, d0Var));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8238u(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getCt(C8211e0 e0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Ct"), new C8203a0(this, e0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getDelayOff(C8213f0 f0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "DelayOff"), new C8207c0(this, f0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowParams(C8215g0 g0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "FlowParams"), new C8205b0(this, g0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowing(C8217h0 h0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Flowing"), new C8208d(this, h0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getLanMode(C8219i0 i0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "LanMode"), new C8204b(this, i0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getMiBandSleep(C8221j0 j0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "MiBandSleep"), new C8212f(this, j0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getNightTimeInfo(C8223k0 k0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "NightTimeInfo"), new C8210e(this, k0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getPower(C8225l0 l0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Power"), new C8242y(this, l0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getProperties(C8227m0 m0Var) {
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
            create.addProperty(getService().getProperty("NightTimeInfo"));
            create.addProperty(getService().getProperty("MiBandSleep"));
            MiotManager.getDeviceManipulator().readProperty(create, new C8241x(this, m0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getSaveState(C8229n0 n0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "SaveState"), new C8202a(this, n0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getonFromPower(C8231o0 o0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "onFromPower"), new C8206c(this, o0Var));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8224l(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8218i(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8234q(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8214g(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setCt(Long l, Effect effect, Long l2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setCt");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("Ct", l)) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Effect", effect.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("Duration", l2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C8237t(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8232p(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8236s(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8226m(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8220j(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8235r(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void subscribeNotifications(CompletionHandler completionHandler, C8233p0 p0Var) {
        if (completionHandler == null) {
            throw new IllegalArgumentException("handler is null");
        } else if (p0Var != null) {
            PropertyInfo create = PropertyInfoFactory.create(getService());
            for (Property next : getService().getProperties()) {
                if (next.getDefinition().isNotifiable()) {
                    create.addProperty(next);
                }
            }
            MiotManager.getDeviceManipulator().addPropertyChangedListener(create, new C8222k(this, completionHandler), new C8239v(this, p0Var));
        } else {
            throw new IllegalArgumentException("listener is null");
        }
    }

    public void toggle(CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "toggle");
            if (create != null) {
                MiotManager.getDeviceManipulator().invoke(create, new C8228n(this, completionHandler));
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
            MiotManager.getDeviceManipulator().removePropertyChangedListener(create, new C8240w(this, completionHandler));
            return;
        }
        throw new IllegalArgumentException("handler is null");
    }
}
