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

    /* renamed from: com.yeelight.yeelib.device.xiaomi.StripeService$a */
    class C9601a implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9644s0 f17546a;

        C9601a(StripeService stripeService, C9644s0 s0Var) {
            this.f17546a = s0Var;
        }

        public void onFailed(int i, String str) {
            this.f17546a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Flowing");
            if (property.isValueValid()) {
                this.f17546a.mo31344a((Long) propertyInfo.getValue("Flowing"));
                return;
            }
            C9644s0 s0Var = this.f17546a;
            s0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.StripeService$a0 */
    class C9602a0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17547a;

        C9602a0(StripeService stripeService, CompletionHandler completionHandler) {
            this.f17547a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17547a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17547a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.StripeService$a1 */
    public interface C9603a1 {
        /* renamed from: a */
        void mo31328a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.StripeService$b */
    class C9604b implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9636o0 f17548a;

        C9604b(StripeService stripeService, C9636o0 o0Var) {
            this.f17548a = o0Var;
        }

        public void onFailed(int i, String str) {
            this.f17548a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("ColorMode");
            if (property.isValueValid()) {
                this.f17548a.mo31336a((Long) propertyInfo.getValue("ColorMode"));
                return;
            }
            C9636o0 o0Var = this.f17548a;
            o0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.StripeService$b0 */
    class C9605b0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17549a;

        C9605b0(StripeService stripeService, CompletionHandler completionHandler) {
            this.f17549a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17549a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17549a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.StripeService$b1 */
    public interface C9606b1 {
        /* renamed from: a */
        void mo31330a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.StripeService$c */
    class C9607c implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9658z0 f17550a;

        C9607c(StripeService stripeService, C9658z0 z0Var) {
            this.f17550a = z0Var;
        }

        public void onFailed(int i, String str) {
            this.f17550a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Rgb");
            if (property.isValueValid()) {
                this.f17550a.mo31356a((Long) propertyInfo.getValue("Rgb"));
                return;
            }
            C9658z0 z0Var = this.f17550a;
            z0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.StripeService$c0 */
    class C9608c0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17551a;

        C9608c0(StripeService stripeService, CompletionHandler completionHandler) {
            this.f17551a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17551a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17551a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.StripeService$c1 */
    public interface C9609c1 {
        /* renamed from: a */
        void mo31332a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.StripeService$d */
    class C9610d implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9640q0 f17552a;

        C9610d(StripeService stripeService, C9640q0 q0Var) {
            this.f17552a = q0Var;
        }

        public void onFailed(int i, String str) {
            this.f17552a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("DelayOff");
            if (property.isValueValid()) {
                this.f17552a.mo31340a((Long) propertyInfo.getValue("DelayOff"));
                return;
            }
            C9640q0 q0Var = this.f17552a;
            q0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.StripeService$d0 */
    class C9611d0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17553a;

        C9611d0(StripeService stripeService, CompletionHandler completionHandler) {
            this.f17553a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17553a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17553a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.StripeService$d1 */
    public enum C9612d1 {
        undefined,
        on,
        off
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.StripeService$e */
    class C9613e implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9606b1 f17558a;

        C9613e(StripeService stripeService, C9606b1 b1Var) {
            this.f17558a = b1Var;
        }

        public void onFailed(int i, String str) {
            this.f17558a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("SaveState");
            if (property.isValueValid()) {
                this.f17558a.mo31330a((Long) propertyInfo.getValue("SaveState"));
                return;
            }
            C9606b1 b1Var = this.f17558a;
            b1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.StripeService$e0 */
    class C9614e0 implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17559a;

        C9614e0(StripeService stripeService, CompletionHandler completionHandler) {
            this.f17559a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17559a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f17559a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.StripeService$e1 */
    public enum C9615e1 {
        undefined,
        on,
        off
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.StripeService$f */
    class C9616f implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9642r0 f17564a;

        C9616f(StripeService stripeService, C9642r0 r0Var) {
            this.f17564a = r0Var;
        }

        public void onFailed(int i, String str) {
            this.f17564a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("FlowParams");
            if (property.isValueValid()) {
                this.f17564a.onSucceed((String) propertyInfo.getValue("FlowParams"));
                return;
            }
            C9642r0 r0Var = this.f17564a;
            r0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.StripeService$f0 */
    class C9617f0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9656y0 f17565a;

        C9617f0(StripeService stripeService, C9656y0 y0Var) {
            this.f17565a = y0Var;
        }

        public void onFailed(int i, String str) {
            this.f17565a.onFailed(i, str);
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
                com.yeelight.yeelib.device.xiaomi.StripeService$e1 r1 = com.yeelight.yeelib.device.xiaomi.StripeService.C9615e1.valueOf(r1)
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
                com.yeelight.yeelib.device.xiaomi.StripeService$y0 r4 = r0.f17565a
                r4.mo28374a(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.xiaomi.StripeService.C9617f0.onSucceed(com.miot.common.device.invocation.PropertyInfo):void");
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.StripeService$f1 */
    public interface C9618f1 {
        /* renamed from: a */
        void mo28376a(Long l);

        /* renamed from: b */
        void mo28377b(Long l);

        /* renamed from: c */
        void mo28378c(Long l);

        /* renamed from: d */
        void mo28379d(Long l);

        /* renamed from: e */
        void mo28380e(String str);

        /* renamed from: f */
        void mo28381f(Long l);

        /* renamed from: g */
        void mo28382g(Long l);

        /* renamed from: h */
        void mo28383h(Long l);

        /* renamed from: i */
        void mo28384i(Long l);

        /* renamed from: j */
        void mo28385j(Long l);

        /* renamed from: k */
        void mo28386k(Long l);

        /* renamed from: l */
        void mo28387l(Long l);

        /* renamed from: m */
        void mo28388m(C9615e1 e1Var);

        /* renamed from: n */
        void mo28389n(Long l);

        /* renamed from: o */
        void mo28390o(Long l);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.StripeService$g */
    class C9619g implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9650v0 f17566a;

        C9619g(StripeService stripeService, C9650v0 v0Var) {
            this.f17566a = v0Var;
        }

        public void onFailed(int i, String str) {
            this.f17566a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("LanMode");
            if (property.isValueValid()) {
                this.f17566a.mo31350a((Long) propertyInfo.getValue("LanMode"));
                return;
            }
            C9650v0 v0Var = this.f17566a;
            v0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.StripeService$g0 */
    class C9620g0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9654x0 f17567a;

        C9620g0(StripeService stripeService, C9654x0 x0Var) {
            this.f17567a = x0Var;
        }

        public void onFailed(int i, String str) {
            this.f17567a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Power");
            if (property.isValueValid()) {
                this.f17567a.mo31354a(C9615e1.valueOf((String) propertyInfo.getValue("Power")));
                return;
            }
            C9654x0 x0Var = this.f17567a;
            x0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.StripeService$h */
    class C9621h implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9609c1 f17568a;

        C9621h(StripeService stripeService, C9609c1 c1Var) {
            this.f17568a = c1Var;
        }

        public void onFailed(int i, String str) {
            this.f17568a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("onFromPower");
            if (property.isValueValid()) {
                this.f17568a.mo31332a((Long) propertyInfo.getValue("onFromPower"));
                return;
            }
            C9609c1 c1Var = this.f17568a;
            c1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.StripeService$h0 */
    class C9622h0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9634n0 f17569a;

        C9622h0(StripeService stripeService, C9634n0 n0Var) {
            this.f17569a = n0Var;
        }

        public void onFailed(int i, String str) {
            this.f17569a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Bright");
            if (property.isValueValid()) {
                this.f17569a.mo31334a((Long) propertyInfo.getValue("Bright"));
                return;
            }
            C9634n0 n0Var = this.f17569a;
            n0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.StripeService$i */
    class C9623i implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9652w0 f17570a;

        C9623i(StripeService stripeService, C9652w0 w0Var) {
            this.f17570a = w0Var;
        }

        public void onFailed(int i, String str) {
            this.f17570a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("MusicEnable");
            if (property.isValueValid()) {
                this.f17570a.mo31352a((Long) propertyInfo.getValue("MusicEnable"));
                return;
            }
            C9652w0 w0Var = this.f17570a;
            w0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.StripeService$i0 */
    class C9624i0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9638p0 f17571a;

        C9624i0(StripeService stripeService, C9638p0 p0Var) {
            this.f17571a = p0Var;
        }

        public void onFailed(int i, String str) {
            this.f17571a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Ct");
            if (property.isValueValid()) {
                this.f17571a.mo31338a((Long) propertyInfo.getValue("Ct"));
                return;
            }
            C9638p0 p0Var = this.f17571a;
            p0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.StripeService$j */
    class C9625j implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9648u0 f17572a;

        C9625j(StripeService stripeService, C9648u0 u0Var) {
            this.f17572a = u0Var;
        }

        public void onFailed(int i, String str) {
            this.f17572a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("IndicatorOn");
            if (property.isValueValid()) {
                this.f17572a.mo31348a((Long) propertyInfo.getValue("IndicatorOn"));
                return;
            }
            C9648u0 u0Var = this.f17572a;
            u0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.StripeService$j0 */
    class C9626j0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9646t0 f17573a;

        C9626j0(StripeService stripeService, C9646t0 t0Var) {
            this.f17573a = t0Var;
        }

        public void onFailed(int i, String str) {
            this.f17573a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Hue");
            if (property.isValueValid()) {
                this.f17573a.mo31346a((Long) propertyInfo.getValue("Hue"));
                return;
            }
            C9646t0 t0Var = this.f17573a;
            t0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.StripeService$k */
    class C9627k implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17574a;

        C9627k(StripeService stripeService, CompletionHandler completionHandler) {
            this.f17574a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17574a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f17574a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.StripeService$k0 */
    class C9628k0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9603a1 f17575a;

        C9628k0(StripeService stripeService, C9603a1 a1Var) {
            this.f17575a = a1Var;
        }

        public void onFailed(int i, String str) {
            this.f17575a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Sat");
            if (property.isValueValid()) {
                this.f17575a.mo31328a((Long) propertyInfo.getValue("Sat"));
                return;
            }
            C9603a1 a1Var = this.f17575a;
            a1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.StripeService$l */
    class C9629l implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17576a;

        C9629l(StripeService stripeService, CompletionHandler completionHandler) {
            this.f17576a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17576a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17576a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.StripeService$l0 */
    public enum C9630l0 {
        undefined,
        cfg_pomodoro,
        cfg_lan_ctrl,
        cfg_save_state,
        cfg_init_power
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.StripeService$m */
    class C9631m implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17583a;

        C9631m(StripeService stripeService, CompletionHandler completionHandler) {
            this.f17583a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17583a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17583a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.StripeService$m0 */
    public enum C9632m0 {
        undefined,
        smooth,
        sudden
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.StripeService$n */
    class C9633n implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17588a;

        C9633n(StripeService stripeService, CompletionHandler completionHandler) {
            this.f17588a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17588a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17588a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.StripeService$n0 */
    public interface C9634n0 {
        /* renamed from: a */
        void mo31334a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.StripeService$o */
    class C9635o implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17589a;

        C9635o(StripeService stripeService, CompletionHandler completionHandler) {
            this.f17589a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17589a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17589a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.StripeService$o0 */
    public interface C9636o0 {
        /* renamed from: a */
        void mo31336a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.StripeService$p */
    class C9637p implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17590a;

        C9637p(StripeService stripeService, CompletionHandler completionHandler) {
            this.f17590a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17590a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17590a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.StripeService$p0 */
    public interface C9638p0 {
        /* renamed from: a */
        void mo31338a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.StripeService$q */
    class C9639q implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17591a;

        C9639q(StripeService stripeService, CompletionHandler completionHandler) {
            this.f17591a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17591a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17591a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.StripeService$q0 */
    public interface C9640q0 {
        /* renamed from: a */
        void mo31340a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.StripeService$r */
    class C9641r implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17592a;

        C9641r(StripeService stripeService, CompletionHandler completionHandler) {
            this.f17592a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17592a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17592a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.StripeService$r0 */
    public interface C9642r0 {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.StripeService$s */
    class C9643s implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17593a;

        C9643s(StripeService stripeService, CompletionHandler completionHandler) {
            this.f17593a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17593a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17593a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.StripeService$s0 */
    public interface C9644s0 {
        /* renamed from: a */
        void mo31344a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.StripeService$t */
    class C9645t implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17594a;

        C9645t(StripeService stripeService, CompletionHandler completionHandler) {
            this.f17594a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17594a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17594a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.StripeService$t0 */
    public interface C9646t0 {
        /* renamed from: a */
        void mo31346a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.StripeService$u */
    class C9647u implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17595a;

        C9647u(StripeService stripeService, CompletionHandler completionHandler) {
            this.f17595a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17595a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17595a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.StripeService$u0 */
    public interface C9648u0 {
        /* renamed from: a */
        void mo31348a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.StripeService$v */
    class C9649v implements DeviceManipulator.PropertyChangedListener {

        /* renamed from: a */
        final /* synthetic */ C9618f1 f17596a;

        C9649v(StripeService stripeService, C9618f1 f1Var) {
            this.f17596a = f1Var;
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:100:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:101:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:102:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:103:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:104:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:105:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:106:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:107:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:108:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:109:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:110:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:111:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:112:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:113:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:114:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:115:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:116:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:117:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:118:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:119:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:120:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:121:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:122:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:123:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:124:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:125:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:126:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:2:0x002d, code lost:
            r3 = r16;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x009e, code lost:
            r3 = r16;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:0x00b7, code lost:
            r2 = 65535;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:0x00b8, code lost:
            switch(r2) {
                case 0: goto L_0x0236;
                case 1: goto L_0x021c;
                case 2: goto L_0x0202;
                case 3: goto L_0x01e8;
                case 4: goto L_0x01cd;
                case 5: goto L_0x01b2;
                case 6: goto L_0x0197;
                case 7: goto L_0x017c;
                case 8: goto L_0x0161;
                case 9: goto L_0x0146;
                case 10: goto L_0x012b;
                case 11: goto L_0x0110;
                case 12: goto L_0x00f5;
                case 13: goto L_0x00da;
                case 14: goto L_0x00bf;
                default: goto L_0x00bb;
            };
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x00bb, code lost:
            r8 = r17;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:52:0x00bf, code lost:
            r2 = r18;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:53:0x00c9, code lost:
            if (r2.getProperty("IndicatorOn").isValueValid() == false) goto L_0x00bb;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:54:0x00cb, code lost:
            r17.f17596a.mo28384i((java.lang.Long) r2.getValue("IndicatorOn"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:55:0x00da, code lost:
            r8 = r17;
            r2 = r18;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:56:0x00e6, code lost:
            if (r2.getProperty("MusicEnable").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:57:0x00e8, code lost:
            r8.f17596a.mo28390o((java.lang.Long) r2.getValue("MusicEnable"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:58:0x00f5, code lost:
            r8 = r17;
            r2 = r18;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:59:0x0101, code lost:
            if (r2.getProperty("onFromPower").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:60:0x0103, code lost:
            r8.f17596a.mo28381f((java.lang.Long) r2.getValue("onFromPower"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:61:0x0110, code lost:
            r8 = r17;
            r2 = r18;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:62:0x011c, code lost:
            if (r2.getProperty("LanMode").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:63:0x011e, code lost:
            r8.f17596a.mo28382g((java.lang.Long) r2.getValue("LanMode"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:64:0x012b, code lost:
            r8 = r17;
            r2 = r18;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:65:0x0137, code lost:
            if (r2.getProperty(r3).isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:66:0x0139, code lost:
            r8.f17596a.mo28380e((java.lang.String) r2.getValue(r3));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:67:0x0146, code lost:
            r8 = r17;
            r2 = r18;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:68:0x0152, code lost:
            if (r2.getProperty("SaveState").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:69:0x0154, code lost:
            r8.f17596a.mo28379d((java.lang.Long) r2.getValue("SaveState"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:70:0x0161, code lost:
            r8 = r17;
            r2 = r18;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:71:0x016d, code lost:
            if (r2.getProperty("DelayOff").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:72:0x016f, code lost:
            r8.f17596a.mo28377b((java.lang.Long) r2.getValue("DelayOff"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:73:0x017c, code lost:
            r8 = r17;
            r2 = r18;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:74:0x0188, code lost:
            if (r2.getProperty("Rgb").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:75:0x018a, code lost:
            r8.f17596a.mo28385j((java.lang.Long) r2.getValue("Rgb"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:76:0x0197, code lost:
            r8 = r17;
            r2 = r18;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:77:0x01a3, code lost:
            if (r2.getProperty("ColorMode").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:78:0x01a5, code lost:
            r8.f17596a.mo28387l((java.lang.Long) r2.getValue("ColorMode"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:79:0x01b2, code lost:
            r8 = r17;
            r2 = r18;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:80:0x01be, code lost:
            if (r2.getProperty("Flowing").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:81:0x01c0, code lost:
            r8.f17596a.mo28378c((java.lang.Long) r2.getValue("Flowing"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:82:0x01cd, code lost:
            r8 = r17;
            r2 = r18;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:83:0x01d9, code lost:
            if (r2.getProperty("Sat").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:84:0x01db, code lost:
            r8.f17596a.mo28386k((java.lang.Long) r2.getValue("Sat"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:85:0x01e8, code lost:
            r8 = r17;
            r2 = r18;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:86:0x01f4, code lost:
            if (r2.getProperty("Hue").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:87:0x01f6, code lost:
            r8.f17596a.mo28389n((java.lang.Long) r2.getValue("Hue"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:88:0x0202, code lost:
            r8 = r17;
            r2 = r18;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:89:0x020e, code lost:
            if (r2.getProperty("Ct").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:90:0x0210, code lost:
            r8.f17596a.mo28383h((java.lang.Long) r2.getValue("Ct"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:91:0x021c, code lost:
            r8 = r17;
            r2 = r18;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:92:0x0228, code lost:
            if (r2.getProperty("Bright").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:93:0x022a, code lost:
            r8.f17596a.mo28376a((java.lang.Long) r2.getValue("Bright"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:94:0x0236, code lost:
            r8 = r17;
            r2 = r18;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:95:0x0242, code lost:
            if (r2.getProperty("Power").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:96:0x0244, code lost:
            r8.f17596a.mo28388m(com.yeelight.yeelib.device.xiaomi.StripeService.C9615e1.valueOf((java.lang.String) r2.getValue("Power")));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:97:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:98:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:99:?, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onPropertyChanged(com.miot.common.device.invocation.PropertyInfo r18, java.lang.String r19) {
            /*
                r17 = this;
                r0 = r17
                r1 = r18
                r2 = r19
                int r3 = r19.hashCode()
                java.lang.String r4 = "Bright"
                java.lang.String r5 = "LanMode"
                java.lang.String r6 = "Flowing"
                java.lang.String r7 = "DelayOff"
                java.lang.String r8 = "IndicatorOn"
                java.lang.String r9 = "Power"
                java.lang.String r10 = "onFromPower"
                java.lang.String r11 = "Sat"
                java.lang.String r12 = "Rgb"
                java.lang.String r13 = "Hue"
                java.lang.String r14 = "Ct"
                java.lang.String r15 = "ColorMode"
                java.lang.String r0 = "MusicEnable"
                java.lang.String r1 = "FlowParams"
                r16 = r1
                java.lang.String r1 = "SaveState"
                switch(r3) {
                    case -2117953292: goto L_0x00ac;
                    case -2002016140: goto L_0x00a1;
                    case -1787381784: goto L_0x0096;
                    case -310275194: goto L_0x008e;
                    case 2193: goto L_0x0086;
                    case 72920: goto L_0x007e;
                    case 82093: goto L_0x0076;
                    case 82886: goto L_0x006e;
                    case 35911772: goto L_0x0065;
                    case 77306085: goto L_0x005d;
                    case 335685678: goto L_0x0054;
                    case 880790796: goto L_0x004b;
                    case 898856916: goto L_0x0043;
                    case 1611821756: goto L_0x003a;
                    case 1998035738: goto L_0x0031;
                    default: goto L_0x002d;
                }
            L_0x002d:
                r3 = r16
                goto L_0x00b7
            L_0x0031:
                boolean r2 = r2.equals(r4)
                if (r2 == 0) goto L_0x002d
                r2 = 1
                goto L_0x009e
            L_0x003a:
                boolean r2 = r2.equals(r5)
                if (r2 == 0) goto L_0x002d
                r2 = 11
                goto L_0x009e
            L_0x0043:
                boolean r2 = r2.equals(r6)
                if (r2 == 0) goto L_0x002d
                r2 = 5
                goto L_0x009e
            L_0x004b:
                boolean r2 = r2.equals(r7)
                if (r2 == 0) goto L_0x002d
                r2 = 8
                goto L_0x009e
            L_0x0054:
                boolean r2 = r2.equals(r8)
                if (r2 == 0) goto L_0x002d
                r2 = 14
                goto L_0x009e
            L_0x005d:
                boolean r2 = r2.equals(r9)
                if (r2 == 0) goto L_0x002d
                r2 = 0
                goto L_0x009e
            L_0x0065:
                boolean r2 = r2.equals(r10)
                if (r2 == 0) goto L_0x002d
                r2 = 12
                goto L_0x009e
            L_0x006e:
                boolean r2 = r2.equals(r11)
                if (r2 == 0) goto L_0x002d
                r2 = 4
                goto L_0x009e
            L_0x0076:
                boolean r2 = r2.equals(r12)
                if (r2 == 0) goto L_0x002d
                r2 = 7
                goto L_0x009e
            L_0x007e:
                boolean r2 = r2.equals(r13)
                if (r2 == 0) goto L_0x002d
                r2 = 3
                goto L_0x009e
            L_0x0086:
                boolean r2 = r2.equals(r14)
                if (r2 == 0) goto L_0x002d
                r2 = 2
                goto L_0x009e
            L_0x008e:
                boolean r2 = r2.equals(r15)
                if (r2 == 0) goto L_0x002d
                r2 = 6
                goto L_0x009e
            L_0x0096:
                boolean r2 = r2.equals(r0)
                if (r2 == 0) goto L_0x002d
                r2 = 13
            L_0x009e:
                r3 = r16
                goto L_0x00b8
            L_0x00a1:
                r3 = r16
                boolean r2 = r2.equals(r3)
                if (r2 == 0) goto L_0x00b7
                r2 = 10
                goto L_0x00b8
            L_0x00ac:
                r3 = r16
                boolean r2 = r2.equals(r1)
                if (r2 == 0) goto L_0x00b7
                r2 = 9
                goto L_0x00b8
            L_0x00b7:
                r2 = -1
            L_0x00b8:
                switch(r2) {
                    case 0: goto L_0x0236;
                    case 1: goto L_0x021c;
                    case 2: goto L_0x0202;
                    case 3: goto L_0x01e8;
                    case 4: goto L_0x01cd;
                    case 5: goto L_0x01b2;
                    case 6: goto L_0x0197;
                    case 7: goto L_0x017c;
                    case 8: goto L_0x0161;
                    case 9: goto L_0x0146;
                    case 10: goto L_0x012b;
                    case 11: goto L_0x0110;
                    case 12: goto L_0x00f5;
                    case 13: goto L_0x00da;
                    case 14: goto L_0x00bf;
                    default: goto L_0x00bb;
                }
            L_0x00bb:
                r8 = r17
                goto L_0x0253
            L_0x00bf:
                r2 = r18
                com.miot.common.property.Property r0 = r2.getProperty(r8)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x00bb
                java.lang.Object r0 = r2.getValue(r8)
                java.lang.Long r0 = (java.lang.Long) r0
                r8 = r17
                com.yeelight.yeelib.device.xiaomi.StripeService$f1 r1 = r8.f17596a
                r1.mo28384i(r0)
                goto L_0x0253
            L_0x00da:
                r8 = r17
                r2 = r18
                com.miot.common.property.Property r1 = r2.getProperty(r0)
                boolean r1 = r1.isValueValid()
                if (r1 == 0) goto L_0x0253
                java.lang.Object r0 = r2.getValue(r0)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.StripeService$f1 r1 = r8.f17596a
                r1.mo28390o(r0)
                goto L_0x0253
            L_0x00f5:
                r8 = r17
                r2 = r18
                com.miot.common.property.Property r0 = r2.getProperty(r10)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0253
                java.lang.Object r0 = r2.getValue(r10)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.StripeService$f1 r1 = r8.f17596a
                r1.mo28381f(r0)
                goto L_0x0253
            L_0x0110:
                r8 = r17
                r2 = r18
                com.miot.common.property.Property r0 = r2.getProperty(r5)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0253
                java.lang.Object r0 = r2.getValue(r5)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.StripeService$f1 r1 = r8.f17596a
                r1.mo28382g(r0)
                goto L_0x0253
            L_0x012b:
                r8 = r17
                r2 = r18
                com.miot.common.property.Property r0 = r2.getProperty(r3)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0253
                java.lang.Object r0 = r2.getValue(r3)
                java.lang.String r0 = (java.lang.String) r0
                com.yeelight.yeelib.device.xiaomi.StripeService$f1 r1 = r8.f17596a
                r1.mo28380e(r0)
                goto L_0x0253
            L_0x0146:
                r8 = r17
                r2 = r18
                com.miot.common.property.Property r0 = r2.getProperty(r1)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0253
                java.lang.Object r0 = r2.getValue(r1)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.StripeService$f1 r1 = r8.f17596a
                r1.mo28379d(r0)
                goto L_0x0253
            L_0x0161:
                r8 = r17
                r2 = r18
                com.miot.common.property.Property r0 = r2.getProperty(r7)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0253
                java.lang.Object r0 = r2.getValue(r7)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.StripeService$f1 r1 = r8.f17596a
                r1.mo28377b(r0)
                goto L_0x0253
            L_0x017c:
                r8 = r17
                r2 = r18
                com.miot.common.property.Property r0 = r2.getProperty(r12)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0253
                java.lang.Object r0 = r2.getValue(r12)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.StripeService$f1 r1 = r8.f17596a
                r1.mo28385j(r0)
                goto L_0x0253
            L_0x0197:
                r8 = r17
                r2 = r18
                com.miot.common.property.Property r0 = r2.getProperty(r15)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0253
                java.lang.Object r0 = r2.getValue(r15)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.StripeService$f1 r1 = r8.f17596a
                r1.mo28387l(r0)
                goto L_0x0253
            L_0x01b2:
                r8 = r17
                r2 = r18
                com.miot.common.property.Property r0 = r2.getProperty(r6)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0253
                java.lang.Object r0 = r2.getValue(r6)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.StripeService$f1 r1 = r8.f17596a
                r1.mo28378c(r0)
                goto L_0x0253
            L_0x01cd:
                r8 = r17
                r2 = r18
                com.miot.common.property.Property r0 = r2.getProperty(r11)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0253
                java.lang.Object r0 = r2.getValue(r11)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.StripeService$f1 r1 = r8.f17596a
                r1.mo28386k(r0)
                goto L_0x0253
            L_0x01e8:
                r8 = r17
                r2 = r18
                com.miot.common.property.Property r0 = r2.getProperty(r13)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0253
                java.lang.Object r0 = r2.getValue(r13)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.StripeService$f1 r1 = r8.f17596a
                r1.mo28389n(r0)
                goto L_0x0253
            L_0x0202:
                r8 = r17
                r2 = r18
                com.miot.common.property.Property r0 = r2.getProperty(r14)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0253
                java.lang.Object r0 = r2.getValue(r14)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.StripeService$f1 r1 = r8.f17596a
                r1.mo28383h(r0)
                goto L_0x0253
            L_0x021c:
                r8 = r17
                r2 = r18
                com.miot.common.property.Property r0 = r2.getProperty(r4)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0253
                java.lang.Object r0 = r2.getValue(r4)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.StripeService$f1 r1 = r8.f17596a
                r1.mo28376a(r0)
                goto L_0x0253
            L_0x0236:
                r8 = r17
                r2 = r18
                com.miot.common.property.Property r0 = r2.getProperty(r9)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0253
                java.lang.Object r0 = r2.getValue(r9)
                java.lang.String r0 = (java.lang.String) r0
                com.yeelight.yeelib.device.xiaomi.StripeService$e1 r0 = com.yeelight.yeelib.device.xiaomi.StripeService.C9615e1.valueOf(r0)
                com.yeelight.yeelib.device.xiaomi.StripeService$f1 r1 = r8.f17596a
                r1.mo28388m(r0)
            L_0x0253:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.xiaomi.StripeService.C9649v.onPropertyChanged(com.miot.common.device.invocation.PropertyInfo, java.lang.String):void");
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.StripeService$v0 */
    public interface C9650v0 {
        /* renamed from: a */
        void mo31350a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.StripeService$w */
    class C9651w implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17597a;

        C9651w(StripeService stripeService, CompletionHandler completionHandler) {
            this.f17597a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17597a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17597a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.StripeService$w0 */
    public interface C9652w0 {
        /* renamed from: a */
        void mo31352a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.StripeService$x */
    class C9653x implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17598a;

        C9653x(StripeService stripeService, CompletionHandler completionHandler) {
            this.f17598a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17598a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17598a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.StripeService$x0 */
    public interface C9654x0 {
        /* renamed from: a */
        void mo31354a(C9615e1 e1Var);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.StripeService$y */
    class C9655y implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17599a;

        C9655y(StripeService stripeService, CompletionHandler completionHandler) {
            this.f17599a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17599a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17599a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.StripeService$y0 */
    public interface C9656y0 {
        /* renamed from: a */
        void mo28374a(C9615e1 e1Var, Long l, Long l2, Long l3, Long l4, Long l5, Long l6, Long l7, Long l8, Long l9, String str, Long l10, Long l11, Long l12, Long l13);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.StripeService$z */
    class C9657z implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17600a;

        C9657z(StripeService stripeService, CompletionHandler completionHandler) {
            this.f17600a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17600a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17600a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.StripeService$z0 */
    public interface C9658z0 {
        /* renamed from: a */
        void mo31356a(Long l);

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
                MiotManager.getDeviceManipulator().invoke(create, new C9647u(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C9633n(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C9629l(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C9608c0(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getBright(C9634n0 n0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Bright"), new C9622h0(this, n0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getColorMode(C9636o0 o0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "ColorMode"), new C9604b(this, o0Var));
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
                MiotManager.getDeviceManipulator().invoke(create, new C9605b0(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getCt(C9638p0 p0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Ct"), new C9624i0(this, p0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getDelayOff(C9640q0 q0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "DelayOff"), new C9610d(this, q0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowParams(C9642r0 r0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "FlowParams"), new C9616f(this, r0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowing(C9644s0 s0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Flowing"), new C9601a(this, s0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getHue(C9646t0 t0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Hue"), new C9626j0(this, t0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getIndicatorOn(C9648u0 u0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "IndicatorOn"), new C9625j(this, u0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getLanMode(C9650v0 v0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "LanMode"), new C9619g(this, v0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getMusicEnable(C9652w0 w0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "MusicEnable"), new C9623i(this, w0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getPower(C9654x0 x0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Power"), new C9620g0(this, x0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getProperties(C9656y0 y0Var) {
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
            MiotManager.getDeviceManipulator().readProperty(create, new C9617f0(this, y0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getRgb(C9658z0 z0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Rgb"), new C9607c(this, z0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getSat(C9603a1 a1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Sat"), new C9628k0(this, a1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getSaveState(C9606b1 b1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "SaveState"), new C9613e(this, b1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getonFromPower(C9609c1 c1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "onFromPower"), new C9621h(this, c1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void openWithMode(C9615e1 e1Var, C9632m0 m0Var, Long l, Long l2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "openWithMode");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("Power", e1Var.toString())) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Effect", m0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Duration", l)) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("Mode", l2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C9639q(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C9635o(this, completionHandler));
                return;
            }
            throw new MiotException("actionInfo is null");
        }
        throw new MiotException("device not configurated connection");
    }

    public void sendCmd(C9630l0 l0Var, String str, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "sendCmd");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("CmdKey", l0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("CmdValue", str)) {
                MiotManager.getDeviceManipulator().invoke(create, new C9653x(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setBright(Long l, C9632m0 m0Var, Long l2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setBright");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("Bright", l)) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Effect", m0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("Duration", l2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C9631m(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setCt(Long l, C9632m0 m0Var, Long l2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setCt");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("Ct", l)) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Effect", m0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("Duration", l2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C9602a0(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C9651w(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C9657z(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setLEDIndicator(C9612d1 d1Var, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setLEDIndicator");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (create.setArgumentValue("IndicatorParams", d1Var.toString())) {
                MiotManager.getDeviceManipulator().invoke(create, new C9655y(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setPower(C9615e1 e1Var, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setPower");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (create.setArgumentValue("Power", e1Var.toString())) {
                MiotManager.getDeviceManipulator().invoke(create, new C9641r(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setRgb(Long l, C9632m0 m0Var, Long l2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setRgb");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("Rgb", l)) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Effect", m0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("Duration", l2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C9643s(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C9637p(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C9611d0(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void subscribeNotifications(CompletionHandler completionHandler, C9618f1 f1Var) {
        if (completionHandler == null) {
            throw new IllegalArgumentException("handler is null");
        } else if (f1Var != null) {
            PropertyInfo create = PropertyInfoFactory.create(getService());
            for (Property next : getService().getProperties()) {
                if (next.getDefinition().isNotifiable()) {
                    create.addProperty(next);
                }
            }
            MiotManager.getDeviceManipulator().addPropertyChangedListener(create, new C9627k(this, completionHandler), new C9649v(this, f1Var));
        } else {
            throw new IllegalArgumentException("listener is null");
        }
    }

    public void toggle(CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "toggle");
            if (create != null) {
                MiotManager.getDeviceManipulator().invoke(create, new C9645t(this, completionHandler));
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
            MiotManager.getDeviceManipulator().removePropertyChangedListener(create, new C9614e0(this, completionHandler));
            return;
        }
        throw new IllegalArgumentException("handler is null");
    }
}
