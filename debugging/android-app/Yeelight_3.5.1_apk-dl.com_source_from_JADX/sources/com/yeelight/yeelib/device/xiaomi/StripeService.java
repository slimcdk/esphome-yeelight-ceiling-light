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

public class StripeService extends AbstractService {
    public static final String ACTION_addCron = "addCron";
    public static final String ACTION_delCron = "delCron";
    public static final String ACTION_disableMusic = "disableMusic";
    public static final String ACTION_enableMusic = "enableMusic";
    public static final String ACTION_getCron = "getCron";
    public static final String ACTION_openWithMode = "openWithMode";
    public static final String ACTION_restore = "restore";
    public static final String ACTION_sendCmd = "sendCmd";
    public static final String ACTION_setBright = "setBright";
    public static final String ACTION_setCt = "setCt";
    public static final String ACTION_setDefault = "setDefault";
    public static final String ACTION_setFlowScene = "setFlowScene";
    public static final String ACTION_setLEDIndicator = "setLEDIndicator";
    public static final String ACTION_setPower = "setPower";
    public static final String ACTION_setRgb = "setRgb";
    public static final String ACTION_setScene = "setScene";
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
    public static final String PROPERTY_IndicatorOn = "IndicatorOn";
    public static final String PROPERTY_IndicatorParams = "IndicatorParams";
    public static final String PROPERTY_LanMode = "LanMode";
    public static final String PROPERTY_Mode = "Mode";
    public static final String PROPERTY_MusicEnable = "MusicEnable";
    public static final String PROPERTY_MusicIPAddress = "MusicIPAddress";
    public static final String PROPERTY_MusicPort = "MusicPort";
    public static final String PROPERTY_ParamColors = "ParamColors";
    public static final String PROPERTY_ParamCount = "ParamCount";
    public static final String PROPERTY_ParamFinish = "ParamFinish";
    public static final String PROPERTY_ParamModel = "ParamModel";
    public static final String PROPERTY_Power = "Power";
    public static final String PROPERTY_Rgb = "Rgb";
    public static final String PROPERTY_Sat = "Sat";
    public static final String PROPERTY_SaveState = "SaveState";
    public static final String PROPERTY_onFromPower = "onFromPower";
    private static final String TAG = "StripeService";
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

    public enum IndicatorParams {
        undefined,
        on,
        off
    }

    public enum Power {
        undefined,
        on,
        off
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.StripeService$a */
    class C8095a implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8130q0 f14066a;

        C8095a(StripeService stripeService, C8130q0 q0Var) {
            this.f14066a = q0Var;
        }

        public void onFailed(int i, String str) {
            this.f14066a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Flowing");
            if (property.isValueValid()) {
                this.f14066a.mo34873a((Long) propertyInfo.getValue("Flowing"));
                return;
            }
            C8130q0 q0Var = this.f14066a;
            q0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.StripeService$a0 */
    class C8096a0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f14067a;

        C8096a0(StripeService stripeService, CompletionHandler completionHandler) {
            this.f14067a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f14067a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f14067a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.StripeService$a1 */
    public interface C8097a1 {
        /* renamed from: a */
        void mo34846a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.StripeService$b */
    class C8098b implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8122m0 f14068a;

        C8098b(StripeService stripeService, C8122m0 m0Var) {
            this.f14068a = m0Var;
        }

        public void onFailed(int i, String str) {
            this.f14068a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("ColorMode");
            if (property.isValueValid()) {
                this.f14068a.mo34865a((Long) propertyInfo.getValue("ColorMode"));
                return;
            }
            C8122m0 m0Var = this.f14068a;
            m0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.StripeService$b0 */
    class C8099b0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f14069a;

        C8099b0(StripeService stripeService, CompletionHandler completionHandler) {
            this.f14069a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f14069a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f14069a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.StripeService$b1 */
    public interface C8100b1 {
        /* renamed from: a */
        void mo34848a(Long l);

        /* renamed from: b */
        void mo34849b(Long l);

        /* renamed from: c */
        void mo34850c(Long l);

        /* renamed from: d */
        void mo34851d(Long l);

        /* renamed from: e */
        void mo34852e(String str);

        /* renamed from: f */
        void mo34853f(Long l);

        /* renamed from: g */
        void mo34854g(Long l);

        /* renamed from: h */
        void mo34855h(Long l);

        /* renamed from: i */
        void mo34856i(Long l);

        /* renamed from: j */
        void mo34857j(Long l);

        /* renamed from: k */
        void mo34858k(Long l);

        /* renamed from: l */
        void mo34859l(Long l);

        /* renamed from: m */
        void mo34860m(Long l);

        /* renamed from: n */
        void mo34861n(Long l);

        /* renamed from: o */
        void mo34862o(Power power);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.StripeService$c */
    class C8101c implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8144x0 f14070a;

        C8101c(StripeService stripeService, C8144x0 x0Var) {
            this.f14070a = x0Var;
        }

        public void onFailed(int i, String str) {
            this.f14070a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Rgb");
            if (property.isValueValid()) {
                this.f14070a.mo34887a((Long) propertyInfo.getValue("Rgb"));
                return;
            }
            C8144x0 x0Var = this.f14070a;
            x0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.StripeService$c0 */
    class C8102c0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f14071a;

        C8102c0(StripeService stripeService, CompletionHandler completionHandler) {
            this.f14071a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f14071a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f14071a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.StripeService$d */
    class C8103d implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8126o0 f14072a;

        C8103d(StripeService stripeService, C8126o0 o0Var) {
            this.f14072a = o0Var;
        }

        public void onFailed(int i, String str) {
            this.f14072a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("DelayOff");
            if (property.isValueValid()) {
                this.f14072a.mo34869a((Long) propertyInfo.getValue("DelayOff"));
                return;
            }
            C8126o0 o0Var = this.f14072a;
            o0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.StripeService$d0 */
    class C8104d0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f14073a;

        C8104d0(StripeService stripeService, CompletionHandler completionHandler) {
            this.f14073a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f14073a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f14073a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.StripeService$e */
    class C8105e implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8148z0 f14074a;

        C8105e(StripeService stripeService, C8148z0 z0Var) {
            this.f14074a = z0Var;
        }

        public void onFailed(int i, String str) {
            this.f14074a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("SaveState");
            if (property.isValueValid()) {
                this.f14074a.mo34891a((Long) propertyInfo.getValue("SaveState"));
                return;
            }
            C8148z0 z0Var = this.f14074a;
            z0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.StripeService$e0 */
    class C8106e0 implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f14075a;

        C8106e0(StripeService stripeService, CompletionHandler completionHandler) {
            this.f14075a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f14075a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f14075a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.StripeService$f */
    class C8107f implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8128p0 f14076a;

        C8107f(StripeService stripeService, C8128p0 p0Var) {
            this.f14076a = p0Var;
        }

        public void onFailed(int i, String str) {
            this.f14076a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("FlowParams");
            if (property.isValueValid()) {
                this.f14076a.onSucceed((String) propertyInfo.getValue("FlowParams"));
                return;
            }
            C8128p0 p0Var = this.f14076a;
            p0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.StripeService$f0 */
    class C8108f0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8142w0 f14077a;

        C8108f0(StripeService stripeService, C8142w0 w0Var) {
            this.f14077a = w0Var;
        }

        public void onFailed(int i, String str) {
            this.f14077a.onFailed(i, str);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.Long} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onSucceed(com.miot.common.device.invocation.PropertyInfo r21) {
            /*
                r20 = this;
                r0 = r21
                java.lang.String r1 = "Power"
                com.miot.common.property.Property r1 = r0.getProperty(r1)
                boolean r2 = r1.isValueValid()
                r3 = 0
                if (r2 == 0) goto L_0x001b
                java.lang.Object r1 = r1.getValue()
                java.lang.String r1 = (java.lang.String) r1
                com.yeelight.yeelib.device.xiaomi.StripeService$Power r1 = com.yeelight.yeelib.device.xiaomi.StripeService.Power.valueOf(r1)
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
                java.lang.String r1 = "SaveState"
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
                java.lang.String r1 = "FlowParams"
                com.miot.common.property.Property r1 = r0.getProperty(r1)
                boolean r2 = r1.isValueValid()
                if (r2 == 0) goto L_0x00ed
                java.lang.Object r1 = r1.getValue()
                java.lang.String r1 = (java.lang.String) r1
                r15 = r1
                goto L_0x00ee
            L_0x00ed:
                r15 = r3
            L_0x00ee:
                java.lang.String r1 = "LanMode"
                com.miot.common.property.Property r1 = r0.getProperty(r1)
                boolean r2 = r1.isValueValid()
                if (r2 == 0) goto L_0x0103
                java.lang.Object r1 = r1.getValue()
                java.lang.Long r1 = (java.lang.Long) r1
                r16 = r1
                goto L_0x0105
            L_0x0103:
                r16 = r3
            L_0x0105:
                java.lang.String r1 = "onFromPower"
                com.miot.common.property.Property r1 = r0.getProperty(r1)
                boolean r2 = r1.isValueValid()
                if (r2 == 0) goto L_0x011a
                java.lang.Object r1 = r1.getValue()
                java.lang.Long r1 = (java.lang.Long) r1
                r17 = r1
                goto L_0x011c
            L_0x011a:
                r17 = r3
            L_0x011c:
                java.lang.String r1 = "MusicEnable"
                com.miot.common.property.Property r1 = r0.getProperty(r1)
                boolean r2 = r1.isValueValid()
                if (r2 == 0) goto L_0x0131
                java.lang.Object r1 = r1.getValue()
                java.lang.Long r1 = (java.lang.Long) r1
                r18 = r1
                goto L_0x0133
            L_0x0131:
                r18 = r3
            L_0x0133:
                java.lang.String r1 = "IndicatorOn"
                com.miot.common.property.Property r0 = r0.getProperty(r1)
                boolean r1 = r0.isValueValid()
                if (r1 == 0) goto L_0x0146
                java.lang.Object r0 = r0.getValue()
                r3 = r0
                java.lang.Long r3 = (java.lang.Long) r3
            L_0x0146:
                r0 = r20
                r19 = r3
                com.yeelight.yeelib.device.xiaomi.StripeService$w0 r4 = r0.f14077a
                r4.mo34885a(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.xiaomi.StripeService.C8108f0.onSucceed(com.miot.common.device.invocation.PropertyInfo):void");
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.StripeService$g */
    class C8109g implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8136t0 f14078a;

        C8109g(StripeService stripeService, C8136t0 t0Var) {
            this.f14078a = t0Var;
        }

        public void onFailed(int i, String str) {
            this.f14078a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("LanMode");
            if (property.isValueValid()) {
                this.f14078a.mo34879a((Long) propertyInfo.getValue("LanMode"));
                return;
            }
            C8136t0 t0Var = this.f14078a;
            t0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.StripeService$g0 */
    class C8110g0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8140v0 f14079a;

        C8110g0(StripeService stripeService, C8140v0 v0Var) {
            this.f14079a = v0Var;
        }

        public void onFailed(int i, String str) {
            this.f14079a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Power");
            if (property.isValueValid()) {
                this.f14079a.mo34883a(Power.valueOf((String) propertyInfo.getValue("Power")));
                return;
            }
            C8140v0 v0Var = this.f14079a;
            v0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.StripeService$h */
    class C8111h implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8097a1 f14080a;

        C8111h(StripeService stripeService, C8097a1 a1Var) {
            this.f14080a = a1Var;
        }

        public void onFailed(int i, String str) {
            this.f14080a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("onFromPower");
            if (property.isValueValid()) {
                this.f14080a.mo34846a((Long) propertyInfo.getValue("onFromPower"));
                return;
            }
            C8097a1 a1Var = this.f14080a;
            a1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.StripeService$h0 */
    class C8112h0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8120l0 f14081a;

        C8112h0(StripeService stripeService, C8120l0 l0Var) {
            this.f14081a = l0Var;
        }

        public void onFailed(int i, String str) {
            this.f14081a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Bright");
            if (property.isValueValid()) {
                this.f14081a.mo34863a((Long) propertyInfo.getValue("Bright"));
                return;
            }
            C8120l0 l0Var = this.f14081a;
            l0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.StripeService$i */
    class C8113i implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8138u0 f14082a;

        C8113i(StripeService stripeService, C8138u0 u0Var) {
            this.f14082a = u0Var;
        }

        public void onFailed(int i, String str) {
            this.f14082a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("MusicEnable");
            if (property.isValueValid()) {
                this.f14082a.mo34881a((Long) propertyInfo.getValue("MusicEnable"));
                return;
            }
            C8138u0 u0Var = this.f14082a;
            u0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.StripeService$i0 */
    class C8114i0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8124n0 f14083a;

        C8114i0(StripeService stripeService, C8124n0 n0Var) {
            this.f14083a = n0Var;
        }

        public void onFailed(int i, String str) {
            this.f14083a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Ct");
            if (property.isValueValid()) {
                this.f14083a.mo34867a((Long) propertyInfo.getValue("Ct"));
                return;
            }
            C8124n0 n0Var = this.f14083a;
            n0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.StripeService$j */
    class C8115j implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8134s0 f14084a;

        C8115j(StripeService stripeService, C8134s0 s0Var) {
            this.f14084a = s0Var;
        }

        public void onFailed(int i, String str) {
            this.f14084a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("IndicatorOn");
            if (property.isValueValid()) {
                this.f14084a.mo34877a((Long) propertyInfo.getValue("IndicatorOn"));
                return;
            }
            C8134s0 s0Var = this.f14084a;
            s0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.StripeService$j0 */
    class C8116j0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8132r0 f14085a;

        C8116j0(StripeService stripeService, C8132r0 r0Var) {
            this.f14085a = r0Var;
        }

        public void onFailed(int i, String str) {
            this.f14085a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Hue");
            if (property.isValueValid()) {
                this.f14085a.mo34875a((Long) propertyInfo.getValue("Hue"));
                return;
            }
            C8132r0 r0Var = this.f14085a;
            r0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.StripeService$k */
    class C8117k implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f14086a;

        C8117k(StripeService stripeService, CompletionHandler completionHandler) {
            this.f14086a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f14086a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f14086a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.StripeService$k0 */
    class C8118k0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8146y0 f14087a;

        C8118k0(StripeService stripeService, C8146y0 y0Var) {
            this.f14087a = y0Var;
        }

        public void onFailed(int i, String str) {
            this.f14087a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Sat");
            if (property.isValueValid()) {
                this.f14087a.mo34889a((Long) propertyInfo.getValue("Sat"));
                return;
            }
            C8146y0 y0Var = this.f14087a;
            y0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.StripeService$l */
    class C8119l implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f14088a;

        C8119l(StripeService stripeService, CompletionHandler completionHandler) {
            this.f14088a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f14088a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f14088a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.StripeService$l0 */
    public interface C8120l0 {
        /* renamed from: a */
        void mo34863a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.StripeService$m */
    class C8121m implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f14089a;

        C8121m(StripeService stripeService, CompletionHandler completionHandler) {
            this.f14089a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f14089a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f14089a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.StripeService$m0 */
    public interface C8122m0 {
        /* renamed from: a */
        void mo34865a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.StripeService$n */
    class C8123n implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f14090a;

        C8123n(StripeService stripeService, CompletionHandler completionHandler) {
            this.f14090a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f14090a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f14090a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.StripeService$n0 */
    public interface C8124n0 {
        /* renamed from: a */
        void mo34867a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.StripeService$o */
    class C8125o implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f14091a;

        C8125o(StripeService stripeService, CompletionHandler completionHandler) {
            this.f14091a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f14091a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f14091a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.StripeService$o0 */
    public interface C8126o0 {
        /* renamed from: a */
        void mo34869a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.StripeService$p */
    class C8127p implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f14092a;

        C8127p(StripeService stripeService, CompletionHandler completionHandler) {
            this.f14092a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f14092a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f14092a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.StripeService$p0 */
    public interface C8128p0 {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.StripeService$q */
    class C8129q implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f14093a;

        C8129q(StripeService stripeService, CompletionHandler completionHandler) {
            this.f14093a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f14093a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f14093a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.StripeService$q0 */
    public interface C8130q0 {
        /* renamed from: a */
        void mo34873a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.StripeService$r */
    class C8131r implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f14094a;

        C8131r(StripeService stripeService, CompletionHandler completionHandler) {
            this.f14094a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f14094a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f14094a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.StripeService$r0 */
    public interface C8132r0 {
        /* renamed from: a */
        void mo34875a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.StripeService$s */
    class C8133s implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f14095a;

        C8133s(StripeService stripeService, CompletionHandler completionHandler) {
            this.f14095a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f14095a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f14095a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.StripeService$s0 */
    public interface C8134s0 {
        /* renamed from: a */
        void mo34877a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.StripeService$t */
    class C8135t implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f14096a;

        C8135t(StripeService stripeService, CompletionHandler completionHandler) {
            this.f14096a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f14096a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f14096a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.StripeService$t0 */
    public interface C8136t0 {
        /* renamed from: a */
        void mo34879a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.StripeService$u */
    class C8137u implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f14097a;

        C8137u(StripeService stripeService, CompletionHandler completionHandler) {
            this.f14097a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f14097a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f14097a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.StripeService$u0 */
    public interface C8138u0 {
        /* renamed from: a */
        void mo34881a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.StripeService$v */
    class C8139v implements DeviceManipulator.PropertyChangedListener {

        /* renamed from: a */
        final /* synthetic */ C8100b1 f14098a;

        C8139v(StripeService stripeService, C8100b1 b1Var) {
            this.f14098a = b1Var;
        }

        public void onPropertyChanged(PropertyInfo propertyInfo, String str) {
            String str2;
            PropertyInfo propertyInfo2 = propertyInfo;
            String str3 = str;
            str.hashCode();
            String str4 = "FlowParams";
            char c = 65535;
            switch (str.hashCode()) {
                case -2117953292:
                    str2 = str4;
                    if (str3.equals("SaveState")) {
                        c = 0;
                        break;
                    }
                    break;
                case -2002016140:
                    str2 = str4;
                    if (str3.equals(str2)) {
                        c = 1;
                        break;
                    }
                    break;
                case -1787381784:
                    if (str3.equals("MusicEnable")) {
                        c = 2;
                        break;
                    }
                    break;
                case -310275194:
                    if (str3.equals("ColorMode")) {
                        c = 3;
                        break;
                    }
                    break;
                case 2193:
                    if (str3.equals("Ct")) {
                        c = 4;
                        break;
                    }
                    break;
                case 72920:
                    if (str3.equals("Hue")) {
                        c = 5;
                        break;
                    }
                    break;
                case 82093:
                    if (str3.equals("Rgb")) {
                        c = 6;
                        break;
                    }
                    break;
                case 82886:
                    if (str3.equals("Sat")) {
                        c = 7;
                        break;
                    }
                    break;
                case 35911772:
                    if (str3.equals("onFromPower")) {
                        c = 8;
                        break;
                    }
                    break;
                case 77306085:
                    if (str3.equals("Power")) {
                        c = 9;
                        break;
                    }
                    break;
                case 335685678:
                    if (str3.equals("IndicatorOn")) {
                        c = 10;
                        break;
                    }
                    break;
                case 880790796:
                    if (str3.equals("DelayOff")) {
                        c = 11;
                        break;
                    }
                    break;
                case 898856916:
                    if (str3.equals("Flowing")) {
                        c = 12;
                        break;
                    }
                    break;
                case 1611821756:
                    if (str3.equals("LanMode")) {
                        c = 13;
                        break;
                    }
                    break;
                case 1998035738:
                    if (str3.equals("Bright")) {
                        c = 14;
                        break;
                    }
                    break;
            }
            str2 = str4;
            switch (c) {
                case 0:
                    PropertyInfo propertyInfo3 = propertyInfo;
                    if (propertyInfo3.getProperty("SaveState").isValueValid()) {
                        this.f14098a.mo34850c((Long) propertyInfo3.getValue("SaveState"));
                        return;
                    }
                    return;
                case 1:
                    PropertyInfo propertyInfo4 = propertyInfo;
                    String str5 = str2;
                    if (propertyInfo4.getProperty(str5).isValueValid()) {
                        this.f14098a.mo34852e((String) propertyInfo4.getValue(str5));
                        return;
                    }
                    return;
                case 2:
                    String str6 = "MusicEnable";
                    PropertyInfo propertyInfo5 = propertyInfo;
                    if (propertyInfo5.getProperty(str6).isValueValid()) {
                        this.f14098a.mo34860m((Long) propertyInfo5.getValue(str6));
                        return;
                    }
                    return;
                case 3:
                    PropertyInfo propertyInfo6 = propertyInfo;
                    if (propertyInfo6.getProperty("ColorMode").isValueValid()) {
                        this.f14098a.mo34859l((Long) propertyInfo6.getValue("ColorMode"));
                        return;
                    }
                    return;
                case 4:
                    PropertyInfo propertyInfo7 = propertyInfo;
                    if (propertyInfo7.getProperty("Ct").isValueValid()) {
                        this.f14098a.mo34855h((Long) propertyInfo7.getValue("Ct"));
                        return;
                    }
                    return;
                case 5:
                    PropertyInfo propertyInfo8 = propertyInfo;
                    if (propertyInfo8.getProperty("Hue").isValueValid()) {
                        this.f14098a.mo34861n((Long) propertyInfo8.getValue("Hue"));
                        return;
                    }
                    return;
                case 6:
                    PropertyInfo propertyInfo9 = propertyInfo;
                    if (propertyInfo9.getProperty("Rgb").isValueValid()) {
                        this.f14098a.mo34857j((Long) propertyInfo9.getValue("Rgb"));
                        return;
                    }
                    return;
                case 7:
                    PropertyInfo propertyInfo10 = propertyInfo;
                    if (propertyInfo10.getProperty("Sat").isValueValid()) {
                        this.f14098a.mo34858k((Long) propertyInfo10.getValue("Sat"));
                        return;
                    }
                    return;
                case 8:
                    PropertyInfo propertyInfo11 = propertyInfo;
                    if (propertyInfo11.getProperty("onFromPower").isValueValid()) {
                        this.f14098a.mo34853f((Long) propertyInfo11.getValue("onFromPower"));
                        return;
                    }
                    return;
                case 9:
                    PropertyInfo propertyInfo12 = propertyInfo;
                    if (propertyInfo12.getProperty("Power").isValueValid()) {
                        this.f14098a.mo34862o(Power.valueOf((String) propertyInfo12.getValue("Power")));
                        return;
                    }
                    return;
                case 10:
                    PropertyInfo propertyInfo13 = propertyInfo;
                    if (propertyInfo13.getProperty("IndicatorOn").isValueValid()) {
                        this.f14098a.mo34856i((Long) propertyInfo13.getValue("IndicatorOn"));
                        return;
                    }
                    return;
                case 11:
                    PropertyInfo propertyInfo14 = propertyInfo;
                    if (propertyInfo14.getProperty("DelayOff").isValueValid()) {
                        this.f14098a.mo34849b((Long) propertyInfo14.getValue("DelayOff"));
                        return;
                    }
                    return;
                case 12:
                    PropertyInfo propertyInfo15 = propertyInfo;
                    if (propertyInfo15.getProperty("Flowing").isValueValid()) {
                        this.f14098a.mo34851d((Long) propertyInfo15.getValue("Flowing"));
                        return;
                    }
                    return;
                case 13:
                    PropertyInfo propertyInfo16 = propertyInfo;
                    if (propertyInfo16.getProperty("LanMode").isValueValid()) {
                        this.f14098a.mo34854g((Long) propertyInfo16.getValue("LanMode"));
                        return;
                    }
                    return;
                case 14:
                    PropertyInfo propertyInfo17 = propertyInfo;
                    if (propertyInfo17.getProperty("Bright").isValueValid()) {
                        this.f14098a.mo34848a((Long) propertyInfo17.getValue("Bright"));
                        return;
                    }
                    break;
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.StripeService$v0 */
    public interface C8140v0 {
        /* renamed from: a */
        void mo34883a(Power power);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.StripeService$w */
    class C8141w implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f14099a;

        C8141w(StripeService stripeService, CompletionHandler completionHandler) {
            this.f14099a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f14099a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f14099a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.StripeService$w0 */
    public interface C8142w0 {
        /* renamed from: a */
        void mo34885a(Power power, Long l, Long l2, Long l3, Long l4, Long l5, Long l6, Long l7, Long l8, Long l9, String str, Long l10, Long l11, Long l12, Long l13);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.StripeService$x */
    class C8143x implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f14100a;

        C8143x(StripeService stripeService, CompletionHandler completionHandler) {
            this.f14100a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f14100a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f14100a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.StripeService$x0 */
    public interface C8144x0 {
        /* renamed from: a */
        void mo34887a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.StripeService$y */
    class C8145y implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f14101a;

        C8145y(StripeService stripeService, CompletionHandler completionHandler) {
            this.f14101a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f14101a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f14101a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.StripeService$y0 */
    public interface C8146y0 {
        /* renamed from: a */
        void mo34889a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.StripeService$z */
    class C8147z implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f14102a;

        C8147z(StripeService stripeService, CompletionHandler completionHandler) {
            this.f14102a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f14102a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f14102a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.StripeService$z0 */
    public interface C8148z0 {
        /* renamed from: a */
        void mo34891a(Long l);

        void onFailed(int i, String str);
    }

    public StripeService(AbstractDevice abstractDevice) {
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
                MiotManager.getDeviceManipulator().invoke(create, new C8137u(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8123n(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void disableMusic(Long l, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "disableMusic");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (create.setArgumentValue("MusicEnable", l)) {
                MiotManager.getDeviceManipulator().invoke(create, new C8119l(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void enableMusic(Long l, String str, Long l2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "enableMusic");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("MusicEnable", l)) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("MusicIPAddress", str)) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("MusicPort", l2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C8102c0(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getBright(C8120l0 l0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Bright"), new C8112h0(this, l0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getColorMode(C8122m0 m0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "ColorMode"), new C8098b(this, m0Var));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8099b0(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getCt(C8124n0 n0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Ct"), new C8114i0(this, n0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getDelayOff(C8126o0 o0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "DelayOff"), new C8103d(this, o0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowParams(C8128p0 p0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "FlowParams"), new C8107f(this, p0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowing(C8130q0 q0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Flowing"), new C8095a(this, q0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getHue(C8132r0 r0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Hue"), new C8116j0(this, r0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getIndicatorOn(C8134s0 s0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "IndicatorOn"), new C8115j(this, s0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getLanMode(C8136t0 t0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "LanMode"), new C8109g(this, t0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getMusicEnable(C8138u0 u0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "MusicEnable"), new C8113i(this, u0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getPower(C8140v0 v0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Power"), new C8110g0(this, v0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getProperties(C8142w0 w0Var) {
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
            create.addProperty(getService().getProperty("SaveState"));
            create.addProperty(getService().getProperty("FlowParams"));
            create.addProperty(getService().getProperty("LanMode"));
            create.addProperty(getService().getProperty("onFromPower"));
            create.addProperty(getService().getProperty("MusicEnable"));
            create.addProperty(getService().getProperty("IndicatorOn"));
            MiotManager.getDeviceManipulator().readProperty(create, new C8108f0(this, w0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getRgb(C8144x0 x0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Rgb"), new C8101c(this, x0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getSat(C8146y0 y0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Sat"), new C8118k0(this, y0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getSaveState(C8148z0 z0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "SaveState"), new C8105e(this, z0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getonFromPower(C8097a1 a1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "onFromPower"), new C8111h(this, a1Var));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8129q(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8125o(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8143x(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8121m(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8096a0(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8141w(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8147z(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setLEDIndicator(IndicatorParams indicatorParams, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setLEDIndicator");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (create.setArgumentValue("IndicatorParams", indicatorParams.toString())) {
                MiotManager.getDeviceManipulator().invoke(create, new C8145y(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8131r(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8133s(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8127p(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8104d0(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void subscribeNotifications(CompletionHandler completionHandler, C8100b1 b1Var) {
        if (completionHandler == null) {
            throw new IllegalArgumentException("handler is null");
        } else if (b1Var != null) {
            PropertyInfo create = PropertyInfoFactory.create(getService());
            for (Property next : getService().getProperties()) {
                if (next.getDefinition().isNotifiable()) {
                    create.addProperty(next);
                }
            }
            MiotManager.getDeviceManipulator().addPropertyChangedListener(create, new C8117k(this, completionHandler), new C8139v(this, b1Var));
        } else {
            throw new IllegalArgumentException("listener is null");
        }
    }

    public void toggle(CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "toggle");
            if (create != null) {
                MiotManager.getDeviceManipulator().invoke(create, new C8135t(this, completionHandler));
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
            MiotManager.getDeviceManipulator().removePropertyChangedListener(create, new C8106e0(this, completionHandler));
            return;
        }
        throw new IllegalArgumentException("handler is null");
    }
}
