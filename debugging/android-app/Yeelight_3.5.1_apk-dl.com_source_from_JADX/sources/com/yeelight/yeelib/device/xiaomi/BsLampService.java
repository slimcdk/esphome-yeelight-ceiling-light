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

public class BsLampService extends AbstractService {
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
    public static final String ACTION_setNLScene = "setNLScene";
    public static final String ACTION_setPower = "setPower";
    public static final String ACTION_setRgb = "setRgb";
    public static final String ACTION_setScene = "setScene";
    public static final String ACTION_setadjust = "setadjust";
    public static final String ACTION_start_cf = "start_cf";
    public static final String ACTION_toggle = "toggle";
    public static final String PROPERTY_Bright = "Bright";
    public static final String PROPERTY_CmdKey = "CmdKey";
    public static final String PROPERTY_CmdValue = "CmdValue";
    public static final String PROPERTY_ColorMode = "ColorMode";
    public static final String PROPERTY_CronType = "CronType";
    public static final String PROPERTY_Ct = "Ct";
    public static final String PROPERTY_DelayOff = "DelayOff";
    public static final String PROPERTY_Duration = "Duration";
    public static final String PROPERTY_Effect = "Effect";
    public static final String PROPERTY_FlowParams = "FlowParams";
    public static final String PROPERTY_Flowing = "Flowing";
    public static final String PROPERTY_Hue = "Hue";
    public static final String PROPERTY_MiBandSleep = "MiBandSleep";
    public static final String PROPERTY_Mode = "Mode";
    public static final String PROPERTY_NightTimeInfo = "NightTimeInfo";
    public static final String PROPERTY_ParamColors = "ParamColors";
    public static final String PROPERTY_ParamCount = "ParamCount";
    public static final String PROPERTY_ParamFinish = "ParamFinish";
    public static final String PROPERTY_ParamModel = "ParamModel";
    public static final String PROPERTY_Power = "Power";
    public static final String PROPERTY_Rgb = "Rgb";
    public static final String PROPERTY_Sat = "Sat";
    public static final String PROPERTY_SaveState = "SaveState";
    public static final String PROPERTY_adjustAction = "adjustAction";
    public static final String PROPERTY_adjustProper = "adjustProper";
    private static final String TAG = "BsLampService";
    private AbstractDevice mDevice = null;

    public enum CmdKey {
        undefined,
        cfg_pomodoro,
        cfg_lan_ctrl,
        nighttime,
        miband_sleep,
        pseudo_beacon,
        cfg_init_power,
        cfg_save_state
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

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLampService$a */
    class C6342a implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6369n0 f12817a;

        C6342a(BsLampService bsLampService, C6369n0 n0Var) {
            this.f12817a = n0Var;
        }

        public void onFailed(int i, String str) {
            this.f12817a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Flowing");
            if (property.isValueValid()) {
                this.f12817a.mo32195a((Long) propertyInfo.getValue("Flowing"));
                return;
            }
            C6369n0 n0Var = this.f12817a;
            n0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLampService$a0 */
    class C6343a0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12818a;

        C6343a0(BsLampService bsLampService, CompletionHandler completionHandler) {
            this.f12818a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12818a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12818a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLampService$b */
    class C6344b implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6361j0 f12819a;

        C6344b(BsLampService bsLampService, C6361j0 j0Var) {
            this.f12819a = j0Var;
        }

        public void onFailed(int i, String str) {
            this.f12819a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("ColorMode");
            if (property.isValueValid()) {
                this.f12819a.mo32187a((Long) propertyInfo.getValue("ColorMode"));
                return;
            }
            C6361j0 j0Var = this.f12819a;
            j0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLampService$b0 */
    class C6345b0 implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12820a;

        C6345b0(BsLampService bsLampService, CompletionHandler completionHandler) {
            this.f12820a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12820a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f12820a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLampService$c */
    class C6346c implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6381t0 f12821a;

        C6346c(BsLampService bsLampService, C6381t0 t0Var) {
            this.f12821a = t0Var;
        }

        public void onFailed(int i, String str) {
            this.f12821a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Rgb");
            if (property.isValueValid()) {
                this.f12821a.mo32207a((Long) propertyInfo.getValue("Rgb"));
                return;
            }
            C6381t0 t0Var = this.f12821a;
            t0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLampService$c0 */
    class C6347c0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6379s0 f12822a;

        C6347c0(BsLampService bsLampService, C6379s0 s0Var) {
            this.f12822a = s0Var;
        }

        public void onFailed(int i, String str) {
            this.f12822a.onFailed(i, str);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.Long} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onSucceed(com.miot.common.device.invocation.PropertyInfo r19) {
            /*
                r18 = this;
                r0 = r19
                java.lang.String r1 = "Power"
                com.miot.common.property.Property r1 = r0.getProperty(r1)
                boolean r2 = r1.isValueValid()
                r3 = 0
                if (r2 == 0) goto L_0x001b
                java.lang.Object r1 = r1.getValue()
                java.lang.String r1 = (java.lang.String) r1
                com.yeelight.yeelib.device.xiaomi.BsLampService$Power r1 = com.yeelight.yeelib.device.xiaomi.BsLampService.Power.valueOf(r1)
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
                java.lang.String r1 = "Flowing"
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
                java.lang.String r1 = "ColorMode"
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
                java.lang.String r1 = "Rgb"
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
                java.lang.String r1 = "DelayOff"
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
                java.lang.String r1 = "FlowParams"
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
                java.lang.String r1 = "SaveState"
                com.miot.common.property.Property r1 = r0.getProperty(r1)
                boolean r2 = r1.isValueValid()
                if (r2 == 0) goto L_0x00ed
                java.lang.Object r1 = r1.getValue()
                java.lang.Long r1 = (java.lang.Long) r1
                r15 = r1
                goto L_0x00ee
            L_0x00ed:
                r15 = r3
            L_0x00ee:
                java.lang.String r1 = "NightTimeInfo"
                com.miot.common.property.Property r1 = r0.getProperty(r1)
                boolean r2 = r1.isValueValid()
                if (r2 == 0) goto L_0x0103
                java.lang.Object r1 = r1.getValue()
                java.lang.String r1 = (java.lang.String) r1
                r16 = r1
                goto L_0x0105
            L_0x0103:
                r16 = r3
            L_0x0105:
                java.lang.String r1 = "MiBandSleep"
                com.miot.common.property.Property r0 = r0.getProperty(r1)
                boolean r1 = r0.isValueValid()
                if (r1 == 0) goto L_0x0118
                java.lang.Object r0 = r0.getValue()
                r3 = r0
                java.lang.Long r3 = (java.lang.Long) r3
            L_0x0118:
                r0 = r18
                r17 = r3
                com.yeelight.yeelib.device.xiaomi.BsLampService$s0 r4 = r0.f12822a
                r4.mo32205a(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.xiaomi.BsLampService.C6347c0.onSucceed(com.miot.common.device.invocation.PropertyInfo):void");
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLampService$d */
    class C6348d implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6365l0 f12823a;

        C6348d(BsLampService bsLampService, C6365l0 l0Var) {
            this.f12823a = l0Var;
        }

        public void onFailed(int i, String str) {
            this.f12823a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("DelayOff");
            if (property.isValueValid()) {
                this.f12823a.mo32191a((Long) propertyInfo.getValue("DelayOff"));
                return;
            }
            C6365l0 l0Var = this.f12823a;
            l0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLampService$d0 */
    class C6349d0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6377r0 f12824a;

        C6349d0(BsLampService bsLampService, C6377r0 r0Var) {
            this.f12824a = r0Var;
        }

        public void onFailed(int i, String str) {
            this.f12824a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Power");
            if (property.isValueValid()) {
                this.f12824a.mo32203a(Power.valueOf((String) propertyInfo.getValue("Power")));
                return;
            }
            C6377r0 r0Var = this.f12824a;
            r0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLampService$e */
    class C6350e implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6367m0 f12825a;

        C6350e(BsLampService bsLampService, C6367m0 m0Var) {
            this.f12825a = m0Var;
        }

        public void onFailed(int i, String str) {
            this.f12825a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("FlowParams");
            if (property.isValueValid()) {
                this.f12825a.onSucceed((String) propertyInfo.getValue("FlowParams"));
                return;
            }
            C6367m0 m0Var = this.f12825a;
            m0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLampService$e0 */
    class C6351e0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6359i0 f12826a;

        C6351e0(BsLampService bsLampService, C6359i0 i0Var) {
            this.f12826a = i0Var;
        }

        public void onFailed(int i, String str) {
            this.f12826a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Bright");
            if (property.isValueValid()) {
                this.f12826a.mo32185a((Long) propertyInfo.getValue("Bright"));
                return;
            }
            C6359i0 i0Var = this.f12826a;
            i0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLampService$f */
    class C6352f implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6385v0 f12827a;

        C6352f(BsLampService bsLampService, C6385v0 v0Var) {
            this.f12827a = v0Var;
        }

        public void onFailed(int i, String str) {
            this.f12827a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("SaveState");
            if (property.isValueValid()) {
                this.f12827a.mo32211a((Long) propertyInfo.getValue("SaveState"));
                return;
            }
            C6385v0 v0Var = this.f12827a;
            v0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLampService$f0 */
    class C6353f0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6363k0 f12828a;

        C6353f0(BsLampService bsLampService, C6363k0 k0Var) {
            this.f12828a = k0Var;
        }

        public void onFailed(int i, String str) {
            this.f12828a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Ct");
            if (property.isValueValid()) {
                this.f12828a.mo32189a((Long) propertyInfo.getValue("Ct"));
                return;
            }
            C6363k0 k0Var = this.f12828a;
            k0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLampService$g */
    class C6354g implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6375q0 f12829a;

        C6354g(BsLampService bsLampService, C6375q0 q0Var) {
            this.f12829a = q0Var;
        }

        public void onFailed(int i, String str) {
            this.f12829a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("NightTimeInfo");
            if (property.isValueValid()) {
                this.f12829a.onSucceed((String) propertyInfo.getValue("NightTimeInfo"));
                return;
            }
            C6375q0 q0Var = this.f12829a;
            q0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLampService$g0 */
    class C6355g0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6371o0 f12830a;

        C6355g0(BsLampService bsLampService, C6371o0 o0Var) {
            this.f12830a = o0Var;
        }

        public void onFailed(int i, String str) {
            this.f12830a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Hue");
            if (property.isValueValid()) {
                this.f12830a.mo32197a((Long) propertyInfo.getValue("Hue"));
                return;
            }
            C6371o0 o0Var = this.f12830a;
            o0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLampService$h */
    class C6356h implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6373p0 f12831a;

        C6356h(BsLampService bsLampService, C6373p0 p0Var) {
            this.f12831a = p0Var;
        }

        public void onFailed(int i, String str) {
            this.f12831a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("MiBandSleep");
            if (property.isValueValid()) {
                this.f12831a.mo32199a((Long) propertyInfo.getValue("MiBandSleep"));
                return;
            }
            C6373p0 p0Var = this.f12831a;
            p0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLampService$h0 */
    class C6357h0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6383u0 f12832a;

        C6357h0(BsLampService bsLampService, C6383u0 u0Var) {
            this.f12832a = u0Var;
        }

        public void onFailed(int i, String str) {
            this.f12832a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Sat");
            if (property.isValueValid()) {
                this.f12832a.mo32209a((Long) propertyInfo.getValue("Sat"));
                return;
            }
            C6383u0 u0Var = this.f12832a;
            u0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLampService$i */
    class C6358i implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12833a;

        C6358i(BsLampService bsLampService, CompletionHandler completionHandler) {
            this.f12833a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12833a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12833a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLampService$i0 */
    public interface C6359i0 {
        /* renamed from: a */
        void mo32185a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLampService$j */
    class C6360j implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12834a;

        C6360j(BsLampService bsLampService, CompletionHandler completionHandler) {
            this.f12834a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12834a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12834a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLampService$j0 */
    public interface C6361j0 {
        /* renamed from: a */
        void mo32187a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLampService$k */
    class C6362k implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12835a;

        C6362k(BsLampService bsLampService, CompletionHandler completionHandler) {
            this.f12835a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12835a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f12835a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLampService$k0 */
    public interface C6363k0 {
        /* renamed from: a */
        void mo32189a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLampService$l */
    class C6364l implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12836a;

        C6364l(BsLampService bsLampService, CompletionHandler completionHandler) {
            this.f12836a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12836a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12836a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLampService$l0 */
    public interface C6365l0 {
        /* renamed from: a */
        void mo32191a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLampService$m */
    class C6366m implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12837a;

        C6366m(BsLampService bsLampService, CompletionHandler completionHandler) {
            this.f12837a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12837a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12837a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLampService$m0 */
    public interface C6367m0 {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLampService$n */
    class C6368n implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12838a;

        C6368n(BsLampService bsLampService, CompletionHandler completionHandler) {
            this.f12838a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12838a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12838a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLampService$n0 */
    public interface C6369n0 {
        /* renamed from: a */
        void mo32195a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLampService$o */
    class C6370o implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12839a;

        C6370o(BsLampService bsLampService, CompletionHandler completionHandler) {
            this.f12839a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12839a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12839a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLampService$o0 */
    public interface C6371o0 {
        /* renamed from: a */
        void mo32197a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLampService$p */
    class C6372p implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12840a;

        C6372p(BsLampService bsLampService, CompletionHandler completionHandler) {
            this.f12840a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12840a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12840a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLampService$p0 */
    public interface C6373p0 {
        /* renamed from: a */
        void mo32199a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLampService$q */
    class C6374q implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12841a;

        C6374q(BsLampService bsLampService, CompletionHandler completionHandler) {
            this.f12841a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12841a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12841a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLampService$q0 */
    public interface C6375q0 {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLampService$r */
    class C6376r implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12842a;

        C6376r(BsLampService bsLampService, CompletionHandler completionHandler) {
            this.f12842a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12842a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12842a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLampService$r0 */
    public interface C6377r0 {
        /* renamed from: a */
        void mo32203a(Power power);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLampService$s */
    class C6378s implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12843a;

        C6378s(BsLampService bsLampService, CompletionHandler completionHandler) {
            this.f12843a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12843a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12843a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLampService$s0 */
    public interface C6379s0 {
        /* renamed from: a */
        void mo32205a(Power power, Long l, Long l2, Long l3, Long l4, Long l5, Long l6, Long l7, Long l8, String str, Long l9, String str2, Long l10);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLampService$t */
    class C6380t implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12844a;

        C6380t(BsLampService bsLampService, CompletionHandler completionHandler) {
            this.f12844a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12844a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12844a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLampService$t0 */
    public interface C6381t0 {
        /* renamed from: a */
        void mo32207a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLampService$u */
    class C6382u implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12845a;

        C6382u(BsLampService bsLampService, CompletionHandler completionHandler) {
            this.f12845a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12845a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12845a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLampService$u0 */
    public interface C6383u0 {
        /* renamed from: a */
        void mo32209a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLampService$v */
    class C6384v implements DeviceManipulator.PropertyChangedListener {

        /* renamed from: a */
        final /* synthetic */ C6387w0 f12846a;

        C6384v(BsLampService bsLampService, C6387w0 w0Var) {
            this.f12846a = w0Var;
        }

        public void onPropertyChanged(PropertyInfo propertyInfo, String str) {
            PropertyInfo propertyInfo2 = propertyInfo;
            String str2 = str;
            str.hashCode();
            char c = 65535;
            switch (str.hashCode()) {
                case -2117953292:
                    if (str2.equals("SaveState")) {
                        c = 0;
                        break;
                    }
                    break;
                case -2002016140:
                    if (str2.equals("FlowParams")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1331143373:
                    if (str2.equals("NightTimeInfo")) {
                        c = 2;
                        break;
                    }
                    break;
                case -310275194:
                    if (str2.equals("ColorMode")) {
                        c = 3;
                        break;
                    }
                    break;
                case -80340154:
                    if (str2.equals("MiBandSleep")) {
                        c = 4;
                        break;
                    }
                    break;
                case 2193:
                    if (str2.equals("Ct")) {
                        c = 5;
                        break;
                    }
                    break;
                case 72920:
                    if (str2.equals("Hue")) {
                        c = 6;
                        break;
                    }
                    break;
                case 82093:
                    if (str2.equals("Rgb")) {
                        c = 7;
                        break;
                    }
                    break;
                case 82886:
                    if (str2.equals("Sat")) {
                        c = 8;
                        break;
                    }
                    break;
                case 77306085:
                    if (str2.equals("Power")) {
                        c = 9;
                        break;
                    }
                    break;
                case 880790796:
                    if (str2.equals("DelayOff")) {
                        c = 10;
                        break;
                    }
                    break;
                case 898856916:
                    if (str2.equals("Flowing")) {
                        c = 11;
                        break;
                    }
                    break;
                case 1998035738:
                    if (str2.equals("Bright")) {
                        c = 12;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    if (propertyInfo2.getProperty("SaveState").isValueValid()) {
                        this.f12846a.mo32215c((Long) propertyInfo2.getValue("SaveState"));
                        return;
                    }
                    return;
                case 1:
                    if (propertyInfo2.getProperty("FlowParams").isValueValid()) {
                        this.f12846a.mo32217e((String) propertyInfo2.getValue("FlowParams"));
                        return;
                    }
                    return;
                case 2:
                    if (propertyInfo2.getProperty("NightTimeInfo").isValueValid()) {
                        this.f12846a.mo32220i((String) propertyInfo2.getValue("NightTimeInfo"));
                        return;
                    }
                    return;
                case 3:
                    if (propertyInfo2.getProperty("ColorMode").isValueValid()) {
                        this.f12846a.mo32223l((Long) propertyInfo2.getValue("ColorMode"));
                        return;
                    }
                    return;
                case 4:
                    if (propertyInfo2.getProperty("MiBandSleep").isValueValid()) {
                        this.f12846a.mo32224m((Long) propertyInfo2.getValue("MiBandSleep"));
                        return;
                    }
                    return;
                case 5:
                    if (propertyInfo2.getProperty("Ct").isValueValid()) {
                        this.f12846a.mo32219h((Long) propertyInfo2.getValue("Ct"));
                        return;
                    }
                    return;
                case 6:
                    if (propertyInfo2.getProperty("Hue").isValueValid()) {
                        this.f12846a.mo32225n((Long) propertyInfo2.getValue("Hue"));
                        return;
                    }
                    return;
                case 7:
                    if (propertyInfo2.getProperty("Rgb").isValueValid()) {
                        this.f12846a.mo32221j((Long) propertyInfo2.getValue("Rgb"));
                        return;
                    }
                    return;
                case 8:
                    if (propertyInfo2.getProperty("Sat").isValueValid()) {
                        this.f12846a.mo32222k((Long) propertyInfo2.getValue("Sat"));
                        return;
                    }
                    return;
                case 9:
                    if (propertyInfo2.getProperty("Power").isValueValid()) {
                        this.f12846a.mo32218f(Power.valueOf((String) propertyInfo2.getValue("Power")));
                        return;
                    }
                    return;
                case 10:
                    if (propertyInfo2.getProperty("DelayOff").isValueValid()) {
                        this.f12846a.mo32214b((Long) propertyInfo2.getValue("DelayOff"));
                        return;
                    }
                    return;
                case 11:
                    if (propertyInfo2.getProperty("Flowing").isValueValid()) {
                        this.f12846a.mo32216d((Long) propertyInfo2.getValue("Flowing"));
                        return;
                    }
                    return;
                case 12:
                    if (propertyInfo2.getProperty("Bright").isValueValid()) {
                        this.f12846a.mo32213a((Long) propertyInfo2.getValue("Bright"));
                        return;
                    }
                    break;
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLampService$v0 */
    public interface C6385v0 {
        /* renamed from: a */
        void mo32211a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLampService$w */
    class C6386w implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12847a;

        C6386w(BsLampService bsLampService, CompletionHandler completionHandler) {
            this.f12847a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12847a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12847a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLampService$w0 */
    public interface C6387w0 {
        /* renamed from: a */
        void mo32213a(Long l);

        /* renamed from: b */
        void mo32214b(Long l);

        /* renamed from: c */
        void mo32215c(Long l);

        /* renamed from: d */
        void mo32216d(Long l);

        /* renamed from: e */
        void mo32217e(String str);

        /* renamed from: f */
        void mo32218f(Power power);

        /* renamed from: h */
        void mo32219h(Long l);

        /* renamed from: i */
        void mo32220i(String str);

        /* renamed from: j */
        void mo32221j(Long l);

        /* renamed from: k */
        void mo32222k(Long l);

        /* renamed from: l */
        void mo32223l(Long l);

        /* renamed from: m */
        void mo32224m(Long l);

        /* renamed from: n */
        void mo32225n(Long l);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLampService$x */
    class C6388x implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12848a;

        C6388x(BsLampService bsLampService, CompletionHandler completionHandler) {
            this.f12848a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12848a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12848a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLampService$y */
    class C6389y implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12849a;

        C6389y(BsLampService bsLampService, CompletionHandler completionHandler) {
            this.f12849a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12849a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12849a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLampService$z */
    class C6390z implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12850a;

        C6390z(BsLampService bsLampService, CompletionHandler completionHandler) {
            this.f12850a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12850a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12850a.onSucceed();
        }
    }

    public BsLampService(AbstractDevice abstractDevice) {
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
                MiotManager.getDeviceManipulator().invoke(create, new C6376r(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6360j(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getBright(C6359i0 i0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Bright"), new C6351e0(this, i0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getColorMode(C6361j0 j0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "ColorMode"), new C6344b(this, j0Var));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6390z(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getCt(C6363k0 k0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Ct"), new C6353f0(this, k0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getDelayOff(C6365l0 l0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "DelayOff"), new C6348d(this, l0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowParams(C6367m0 m0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "FlowParams"), new C6350e(this, m0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowing(C6369n0 n0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Flowing"), new C6342a(this, n0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getHue(C6371o0 o0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Hue"), new C6355g0(this, o0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getMiBandSleep(C6373p0 p0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "MiBandSleep"), new C6356h(this, p0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getNightTimeInfo(C6375q0 q0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "NightTimeInfo"), new C6354g(this, q0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getPower(C6377r0 r0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Power"), new C6349d0(this, r0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getProperties(C6379s0 s0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            PropertyInfo create = PropertyInfoFactory.create(getService());
            create.addProperty(getService().getProperty("Power"));
            create.addProperty(getService().getProperty("Bright"));
            create.addProperty(getService().getProperty("Ct"));
            create.addProperty(getService().getProperty("Hue"));
            create.addProperty(getService().getProperty("Sat"));
            create.addProperty(getService().getProperty("Flowing"));
            create.addProperty(getService().getProperty("ColorMode"));
            create.addProperty(getService().getProperty("Rgb"));
            create.addProperty(getService().getProperty("DelayOff"));
            create.addProperty(getService().getProperty("FlowParams"));
            create.addProperty(getService().getProperty("SaveState"));
            create.addProperty(getService().getProperty("NightTimeInfo"));
            create.addProperty(getService().getProperty("MiBandSleep"));
            MiotManager.getDeviceManipulator().readProperty(create, new C6347c0(this, s0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getRgb(C6381t0 t0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Rgb"), new C6346c(this, t0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getSat(C6383u0 u0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Sat"), new C6357h0(this, u0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getSaveState(C6385v0 v0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "SaveState"), new C6352f(this, v0Var));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6368n(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6364l(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6382u(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6358i(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6389y(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6378s(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6388x(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setNLScene(String str, Long l, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setNLScene");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("ParamModel", str)) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("ParamFinish", l)) {
                MiotManager.getDeviceManipulator().invoke(create, new C6380t(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6370o(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6372p(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6366m(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6386w(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void start_cf(Long l, Long l2, String str, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "start_cf");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("ParamCount", l)) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("ParamFinish", l2)) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("ParamColors", str)) {
                MiotManager.getDeviceManipulator().invoke(create, new C6343a0(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void subscribeNotifications(CompletionHandler completionHandler, C6387w0 w0Var) {
        if (completionHandler == null) {
            throw new IllegalArgumentException("handler is null");
        } else if (w0Var != null) {
            PropertyInfo create = PropertyInfoFactory.create(getService());
            for (Property next : getService().getProperties()) {
                if (next.getDefinition().isNotifiable()) {
                    create.addProperty(next);
                }
            }
            MiotManager.getDeviceManipulator().addPropertyChangedListener(create, new C6362k(this, completionHandler), new C6384v(this, w0Var));
        } else {
            throw new IllegalArgumentException("listener is null");
        }
    }

    public void toggle(CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "toggle");
            if (create != null) {
                MiotManager.getDeviceManipulator().invoke(create, new C6374q(this, completionHandler));
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
            MiotManager.getDeviceManipulator().removePropertyChangedListener(create, new C6345b0(this, completionHandler));
            return;
        }
        throw new IllegalArgumentException("handler is null");
    }
}
