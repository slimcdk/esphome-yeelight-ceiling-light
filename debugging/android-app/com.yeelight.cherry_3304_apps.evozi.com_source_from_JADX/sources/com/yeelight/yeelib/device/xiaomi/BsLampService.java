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
    public static final String PROPERTY_MusicEnable = "MusicEnable";
    public static final String PROPERTY_MusicIPAddress = "MusicIPAddress";
    public static final String PROPERTY_MusicPort = "MusicPort";
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

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLampService$a */
    class C7813a implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7854s0 f15786a;

        C7813a(BsLampService bsLampService, C7854s0 s0Var) {
            this.f15786a = s0Var;
        }

        public void onFailed(int i, String str) {
            this.f15786a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Flowing");
            if (property.isValueValid()) {
                this.f15786a.mo29319a((Long) propertyInfo.getValue("Flowing"));
                return;
            }
            C7854s0 s0Var = this.f15786a;
            s0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLampService$a0 */
    class C7814a0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15787a;

        C7814a0(BsLampService bsLampService, CompletionHandler completionHandler) {
            this.f15787a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15787a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f15787a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLampService$a1 */
    public interface C7815a1 {
        /* renamed from: a */
        void mo29305a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLampService$b */
    class C7816b implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7846o0 f15788a;

        C7816b(BsLampService bsLampService, C7846o0 o0Var) {
            this.f15788a = o0Var;
        }

        public void onFailed(int i, String str) {
            this.f15788a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("ColorMode");
            if (property.isValueValid()) {
                this.f15788a.mo29311a((Long) propertyInfo.getValue("ColorMode"));
                return;
            }
            C7846o0 o0Var = this.f15788a;
            o0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLampService$b0 */
    class C7817b0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15789a;

        C7817b0(BsLampService bsLampService, CompletionHandler completionHandler) {
            this.f15789a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15789a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f15789a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLampService$b1 */
    public interface C7818b1 {
        /* renamed from: a */
        void mo29307a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLampService$c */
    class C7819c implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7868z0 f15790a;

        C7819c(BsLampService bsLampService, C7868z0 z0Var) {
            this.f15790a = z0Var;
        }

        public void onFailed(int i, String str) {
            this.f15790a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Rgb");
            if (property.isValueValid()) {
                this.f15790a.mo29331a((Long) propertyInfo.getValue("Rgb"));
                return;
            }
            C7868z0 z0Var = this.f15790a;
            z0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLampService$c0 */
    class C7820c0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15791a;

        C7820c0(BsLampService bsLampService, CompletionHandler completionHandler) {
            this.f15791a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15791a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f15791a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLampService$c1 */
    public enum C7821c1 {
        undefined,
        on,
        off
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLampService$d */
    class C7822d implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7850q0 f15796a;

        C7822d(BsLampService bsLampService, C7850q0 q0Var) {
            this.f15796a = q0Var;
        }

        public void onFailed(int i, String str) {
            this.f15796a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("DelayOff");
            if (property.isValueValid()) {
                this.f15796a.mo29315a((Long) propertyInfo.getValue("DelayOff"));
                return;
            }
            C7850q0 q0Var = this.f15796a;
            q0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLampService$d0 */
    class C7823d0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15797a;

        C7823d0(BsLampService bsLampService, CompletionHandler completionHandler) {
            this.f15797a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15797a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f15797a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLampService$d1 */
    public interface C7824d1 {
        /* renamed from: a */
        void mo28213a(Long l);

        /* renamed from: b */
        void mo28214b(Long l);

        /* renamed from: c */
        void mo28215c(Long l);

        /* renamed from: d */
        void mo28216d(Long l);

        /* renamed from: e */
        void mo28217e(String str);

        /* renamed from: f */
        void mo28218f(C7821c1 c1Var);

        /* renamed from: h */
        void mo28219h(Long l);

        /* renamed from: i */
        void mo28220i(String str);

        /* renamed from: j */
        void mo28221j(Long l);

        /* renamed from: k */
        void mo28222k(Long l);

        /* renamed from: l */
        void mo28223l(Long l);

        /* renamed from: m */
        void mo28224m(Long l);

        /* renamed from: n */
        void mo28225n(Long l);

        /* renamed from: o */
        void mo28226o(Long l);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLampService$e */
    class C7825e implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7852r0 f15798a;

        C7825e(BsLampService bsLampService, C7852r0 r0Var) {
            this.f15798a = r0Var;
        }

        public void onFailed(int i, String str) {
            this.f15798a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("FlowParams");
            if (property.isValueValid()) {
                this.f15798a.onSucceed((String) propertyInfo.getValue("FlowParams"));
                return;
            }
            C7852r0 r0Var = this.f15798a;
            r0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLampService$e0 */
    class C7826e0 implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15799a;

        C7826e0(BsLampService bsLampService, CompletionHandler completionHandler) {
            this.f15799a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15799a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f15799a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLampService$f */
    class C7827f implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7818b1 f15800a;

        C7827f(BsLampService bsLampService, C7818b1 b1Var) {
            this.f15800a = b1Var;
        }

        public void onFailed(int i, String str) {
            this.f15800a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("SaveState");
            if (property.isValueValid()) {
                this.f15800a.mo29307a((Long) propertyInfo.getValue("SaveState"));
                return;
            }
            C7818b1 b1Var = this.f15800a;
            b1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLampService$f0 */
    class C7828f0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7866y0 f15801a;

        C7828f0(BsLampService bsLampService, C7866y0 y0Var) {
            this.f15801a = y0Var;
        }

        public void onFailed(int i, String str) {
            this.f15801a.onFailed(i, str);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.Long} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onSucceed(com.miot.common.device.invocation.PropertyInfo r20) {
            /*
                r19 = this;
                r0 = r20
                java.lang.String r1 = "Power"
                com.miot.common.property.Property r1 = r0.getProperty(r1)
                boolean r2 = r1.isValueValid()
                r3 = 0
                if (r2 == 0) goto L_0x001b
                java.lang.Object r1 = r1.getValue()
                java.lang.String r1 = (java.lang.String) r1
                com.yeelight.yeelib.device.xiaomi.BsLampService$c1 r1 = com.yeelight.yeelib.device.xiaomi.BsLampService.C7821c1.valueOf(r1)
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
                java.lang.String r1 = "MusicEnable"
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
                java.lang.String r1 = "NightTimeInfo"
                com.miot.common.property.Property r1 = r0.getProperty(r1)
                boolean r2 = r1.isValueValid()
                if (r2 == 0) goto L_0x011a
                java.lang.Object r1 = r1.getValue()
                java.lang.String r1 = (java.lang.String) r1
                r17 = r1
                goto L_0x011c
            L_0x011a:
                r17 = r3
            L_0x011c:
                java.lang.String r1 = "MiBandSleep"
                com.miot.common.property.Property r0 = r0.getProperty(r1)
                boolean r1 = r0.isValueValid()
                if (r1 == 0) goto L_0x012f
                java.lang.Object r0 = r0.getValue()
                r3 = r0
                java.lang.Long r3 = (java.lang.Long) r3
            L_0x012f:
                r0 = r19
                r18 = r3
                com.yeelight.yeelib.device.xiaomi.BsLampService$y0 r4 = r0.f15801a
                r4.mo28211a(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.xiaomi.BsLampService.C7828f0.onSucceed(com.miot.common.device.invocation.PropertyInfo):void");
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLampService$g */
    class C7829g implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7860v0 f15802a;

        C7829g(BsLampService bsLampService, C7860v0 v0Var) {
            this.f15802a = v0Var;
        }

        public void onFailed(int i, String str) {
            this.f15802a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("MusicEnable");
            if (property.isValueValid()) {
                this.f15802a.mo29325a((Long) propertyInfo.getValue("MusicEnable"));
                return;
            }
            C7860v0 v0Var = this.f15802a;
            v0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLampService$g0 */
    class C7830g0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7864x0 f15803a;

        C7830g0(BsLampService bsLampService, C7864x0 x0Var) {
            this.f15803a = x0Var;
        }

        public void onFailed(int i, String str) {
            this.f15803a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Power");
            if (property.isValueValid()) {
                this.f15803a.mo29329a(C7821c1.valueOf((String) propertyInfo.getValue("Power")));
                return;
            }
            C7864x0 x0Var = this.f15803a;
            x0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLampService$h */
    class C7831h implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7862w0 f15804a;

        C7831h(BsLampService bsLampService, C7862w0 w0Var) {
            this.f15804a = w0Var;
        }

        public void onFailed(int i, String str) {
            this.f15804a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("NightTimeInfo");
            if (property.isValueValid()) {
                this.f15804a.onSucceed((String) propertyInfo.getValue("NightTimeInfo"));
                return;
            }
            C7862w0 w0Var = this.f15804a;
            w0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLampService$h0 */
    class C7832h0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7844n0 f15805a;

        C7832h0(BsLampService bsLampService, C7844n0 n0Var) {
            this.f15805a = n0Var;
        }

        public void onFailed(int i, String str) {
            this.f15805a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Bright");
            if (property.isValueValid()) {
                this.f15805a.mo29309a((Long) propertyInfo.getValue("Bright"));
                return;
            }
            C7844n0 n0Var = this.f15805a;
            n0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLampService$i */
    class C7833i implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7858u0 f15806a;

        C7833i(BsLampService bsLampService, C7858u0 u0Var) {
            this.f15806a = u0Var;
        }

        public void onFailed(int i, String str) {
            this.f15806a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("MiBandSleep");
            if (property.isValueValid()) {
                this.f15806a.mo29323a((Long) propertyInfo.getValue("MiBandSleep"));
                return;
            }
            C7858u0 u0Var = this.f15806a;
            u0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLampService$i0 */
    class C7834i0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7848p0 f15807a;

        C7834i0(BsLampService bsLampService, C7848p0 p0Var) {
            this.f15807a = p0Var;
        }

        public void onFailed(int i, String str) {
            this.f15807a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Ct");
            if (property.isValueValid()) {
                this.f15807a.mo29313a((Long) propertyInfo.getValue("Ct"));
                return;
            }
            C7848p0 p0Var = this.f15807a;
            p0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLampService$j */
    class C7835j implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15808a;

        C7835j(BsLampService bsLampService, CompletionHandler completionHandler) {
            this.f15808a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15808a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f15808a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLampService$j0 */
    class C7836j0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7856t0 f15809a;

        C7836j0(BsLampService bsLampService, C7856t0 t0Var) {
            this.f15809a = t0Var;
        }

        public void onFailed(int i, String str) {
            this.f15809a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Hue");
            if (property.isValueValid()) {
                this.f15809a.mo29321a((Long) propertyInfo.getValue("Hue"));
                return;
            }
            C7856t0 t0Var = this.f15809a;
            t0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLampService$k */
    class C7837k implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15810a;

        C7837k(BsLampService bsLampService, CompletionHandler completionHandler) {
            this.f15810a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15810a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f15810a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLampService$k0 */
    class C7838k0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7815a1 f15811a;

        C7838k0(BsLampService bsLampService, C7815a1 a1Var) {
            this.f15811a = a1Var;
        }

        public void onFailed(int i, String str) {
            this.f15811a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Sat");
            if (property.isValueValid()) {
                this.f15811a.mo29305a((Long) propertyInfo.getValue("Sat"));
                return;
            }
            C7815a1 a1Var = this.f15811a;
            a1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLampService$l */
    class C7839l implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15812a;

        C7839l(BsLampService bsLampService, CompletionHandler completionHandler) {
            this.f15812a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15812a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f15812a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLampService$l0 */
    public enum C7840l0 {
        undefined,
        cfg_pomodoro,
        cfg_lan_ctrl,
        nighttime,
        miband_sleep,
        pseudo_beacon,
        cfg_init_power,
        cfg_save_state
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLampService$m */
    class C7841m implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15822a;

        C7841m(BsLampService bsLampService, CompletionHandler completionHandler) {
            this.f15822a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15822a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f15822a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLampService$m0 */
    public enum C7842m0 {
        undefined,
        smooth,
        sudden
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLampService$n */
    class C7843n implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15827a;

        C7843n(BsLampService bsLampService, CompletionHandler completionHandler) {
            this.f15827a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15827a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f15827a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLampService$n0 */
    public interface C7844n0 {
        /* renamed from: a */
        void mo29309a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLampService$o */
    class C7845o implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15828a;

        C7845o(BsLampService bsLampService, CompletionHandler completionHandler) {
            this.f15828a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15828a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f15828a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLampService$o0 */
    public interface C7846o0 {
        /* renamed from: a */
        void mo29311a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLampService$p */
    class C7847p implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15829a;

        C7847p(BsLampService bsLampService, CompletionHandler completionHandler) {
            this.f15829a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15829a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f15829a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLampService$p0 */
    public interface C7848p0 {
        /* renamed from: a */
        void mo29313a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLampService$q */
    class C7849q implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15830a;

        C7849q(BsLampService bsLampService, CompletionHandler completionHandler) {
            this.f15830a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15830a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f15830a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLampService$q0 */
    public interface C7850q0 {
        /* renamed from: a */
        void mo29315a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLampService$r */
    class C7851r implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15831a;

        C7851r(BsLampService bsLampService, CompletionHandler completionHandler) {
            this.f15831a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15831a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f15831a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLampService$r0 */
    public interface C7852r0 {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLampService$s */
    class C7853s implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15832a;

        C7853s(BsLampService bsLampService, CompletionHandler completionHandler) {
            this.f15832a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15832a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f15832a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLampService$s0 */
    public interface C7854s0 {
        /* renamed from: a */
        void mo29319a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLampService$t */
    class C7855t implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15833a;

        C7855t(BsLampService bsLampService, CompletionHandler completionHandler) {
            this.f15833a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15833a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f15833a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLampService$t0 */
    public interface C7856t0 {
        /* renamed from: a */
        void mo29321a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLampService$u */
    class C7857u implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15834a;

        C7857u(BsLampService bsLampService, CompletionHandler completionHandler) {
            this.f15834a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15834a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f15834a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLampService$u0 */
    public interface C7858u0 {
        /* renamed from: a */
        void mo29323a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLampService$v */
    class C7859v implements DeviceManipulator.PropertyChangedListener {

        /* renamed from: a */
        final /* synthetic */ C7824d1 f15835a;

        C7859v(BsLampService bsLampService, C7824d1 d1Var) {
            this.f15835a = d1Var;
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onPropertyChanged(com.miot.common.device.invocation.PropertyInfo r17, java.lang.String r18) {
            /*
                r16 = this;
                r0 = r16
                r1 = r17
                r2 = r18
                int r3 = r18.hashCode()
                java.lang.String r4 = "Bright"
                java.lang.String r5 = "Flowing"
                java.lang.String r6 = "DelayOff"
                java.lang.String r7 = "Power"
                java.lang.String r8 = "Sat"
                java.lang.String r9 = "Rgb"
                java.lang.String r10 = "Hue"
                java.lang.String r11 = "Ct"
                java.lang.String r12 = "MiBandSleep"
                java.lang.String r13 = "ColorMode"
                java.lang.String r14 = "NightTimeInfo"
                java.lang.String r15 = "MusicEnable"
                java.lang.String r0 = "FlowParams"
                java.lang.String r1 = "SaveState"
                switch(r3) {
                    case -2117953292: goto L_0x009b;
                    case -2002016140: goto L_0x0092;
                    case -1787381784: goto L_0x0089;
                    case -1331143373: goto L_0x0080;
                    case -310275194: goto L_0x0078;
                    case -80340154: goto L_0x006f;
                    case 2193: goto L_0x0067;
                    case 72920: goto L_0x005f;
                    case 82093: goto L_0x0057;
                    case 82886: goto L_0x004f;
                    case 77306085: goto L_0x0047;
                    case 880790796: goto L_0x003d;
                    case 898856916: goto L_0x0034;
                    case 1998035738: goto L_0x002b;
                    default: goto L_0x0029;
                }
            L_0x0029:
                goto L_0x00a4
            L_0x002b:
                boolean r2 = r2.equals(r4)
                if (r2 == 0) goto L_0x00a4
                r2 = 1
                goto L_0x00a5
            L_0x0034:
                boolean r2 = r2.equals(r5)
                if (r2 == 0) goto L_0x00a4
                r2 = 5
                goto L_0x00a5
            L_0x003d:
                boolean r2 = r2.equals(r6)
                if (r2 == 0) goto L_0x00a4
                r2 = 8
                goto L_0x00a5
            L_0x0047:
                boolean r2 = r2.equals(r7)
                if (r2 == 0) goto L_0x00a4
                r2 = 0
                goto L_0x00a5
            L_0x004f:
                boolean r2 = r2.equals(r8)
                if (r2 == 0) goto L_0x00a4
                r2 = 4
                goto L_0x00a5
            L_0x0057:
                boolean r2 = r2.equals(r9)
                if (r2 == 0) goto L_0x00a4
                r2 = 7
                goto L_0x00a5
            L_0x005f:
                boolean r2 = r2.equals(r10)
                if (r2 == 0) goto L_0x00a4
                r2 = 3
                goto L_0x00a5
            L_0x0067:
                boolean r2 = r2.equals(r11)
                if (r2 == 0) goto L_0x00a4
                r2 = 2
                goto L_0x00a5
            L_0x006f:
                boolean r2 = r2.equals(r12)
                if (r2 == 0) goto L_0x00a4
                r2 = 13
                goto L_0x00a5
            L_0x0078:
                boolean r2 = r2.equals(r13)
                if (r2 == 0) goto L_0x00a4
                r2 = 6
                goto L_0x00a5
            L_0x0080:
                boolean r2 = r2.equals(r14)
                if (r2 == 0) goto L_0x00a4
                r2 = 12
                goto L_0x00a5
            L_0x0089:
                boolean r2 = r2.equals(r15)
                if (r2 == 0) goto L_0x00a4
                r2 = 11
                goto L_0x00a5
            L_0x0092:
                boolean r2 = r2.equals(r0)
                if (r2 == 0) goto L_0x00a4
                r2 = 9
                goto L_0x00a5
            L_0x009b:
                boolean r2 = r2.equals(r1)
                if (r2 == 0) goto L_0x00a4
                r2 = 10
                goto L_0x00a5
            L_0x00a4:
                r2 = -1
            L_0x00a5:
                switch(r2) {
                    case 0: goto L_0x0209;
                    case 1: goto L_0x01ef;
                    case 2: goto L_0x01d5;
                    case 3: goto L_0x01bb;
                    case 4: goto L_0x01a0;
                    case 5: goto L_0x0185;
                    case 6: goto L_0x016a;
                    case 7: goto L_0x014f;
                    case 8: goto L_0x0134;
                    case 9: goto L_0x0119;
                    case 10: goto L_0x00fd;
                    case 11: goto L_0x00e2;
                    case 12: goto L_0x00c7;
                    case 13: goto L_0x00ac;
                    default: goto L_0x00a8;
                }
            L_0x00a8:
                r3 = r16
                goto L_0x0226
            L_0x00ac:
                r1 = r17
                com.miot.common.property.Property r0 = r1.getProperty(r12)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x00a8
                java.lang.Object r0 = r1.getValue(r12)
                java.lang.Long r0 = (java.lang.Long) r0
                r3 = r16
                com.yeelight.yeelib.device.xiaomi.BsLampService$d1 r1 = r3.f15835a
                r1.mo28224m(r0)
                goto L_0x0226
            L_0x00c7:
                r3 = r16
                r1 = r17
                com.miot.common.property.Property r0 = r1.getProperty(r14)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0226
                java.lang.Object r0 = r1.getValue(r14)
                java.lang.String r0 = (java.lang.String) r0
                com.yeelight.yeelib.device.xiaomi.BsLampService$d1 r1 = r3.f15835a
                r1.mo28220i(r0)
                goto L_0x0226
            L_0x00e2:
                r3 = r16
                r1 = r17
                com.miot.common.property.Property r0 = r1.getProperty(r15)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0226
                java.lang.Object r0 = r1.getValue(r15)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.BsLampService$d1 r1 = r3.f15835a
                r1.mo28226o(r0)
                goto L_0x0226
            L_0x00fd:
                r3 = r16
                r2 = r1
                r1 = r17
                com.miot.common.property.Property r0 = r1.getProperty(r2)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0226
                java.lang.Object r0 = r1.getValue(r2)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.BsLampService$d1 r1 = r3.f15835a
                r1.mo28216d(r0)
                goto L_0x0226
            L_0x0119:
                r3 = r16
                r1 = r17
                com.miot.common.property.Property r2 = r1.getProperty(r0)
                boolean r2 = r2.isValueValid()
                if (r2 == 0) goto L_0x0226
                java.lang.Object r0 = r1.getValue(r0)
                java.lang.String r0 = (java.lang.String) r0
                com.yeelight.yeelib.device.xiaomi.BsLampService$d1 r1 = r3.f15835a
                r1.mo28217e(r0)
                goto L_0x0226
            L_0x0134:
                r3 = r16
                r1 = r17
                com.miot.common.property.Property r0 = r1.getProperty(r6)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0226
                java.lang.Object r0 = r1.getValue(r6)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.BsLampService$d1 r1 = r3.f15835a
                r1.mo28214b(r0)
                goto L_0x0226
            L_0x014f:
                r3 = r16
                r1 = r17
                com.miot.common.property.Property r0 = r1.getProperty(r9)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0226
                java.lang.Object r0 = r1.getValue(r9)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.BsLampService$d1 r1 = r3.f15835a
                r1.mo28221j(r0)
                goto L_0x0226
            L_0x016a:
                r3 = r16
                r1 = r17
                com.miot.common.property.Property r0 = r1.getProperty(r13)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0226
                java.lang.Object r0 = r1.getValue(r13)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.BsLampService$d1 r1 = r3.f15835a
                r1.mo28223l(r0)
                goto L_0x0226
            L_0x0185:
                r3 = r16
                r1 = r17
                com.miot.common.property.Property r0 = r1.getProperty(r5)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0226
                java.lang.Object r0 = r1.getValue(r5)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.BsLampService$d1 r1 = r3.f15835a
                r1.mo28215c(r0)
                goto L_0x0226
            L_0x01a0:
                r3 = r16
                r1 = r17
                com.miot.common.property.Property r0 = r1.getProperty(r8)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0226
                java.lang.Object r0 = r1.getValue(r8)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.BsLampService$d1 r1 = r3.f15835a
                r1.mo28222k(r0)
                goto L_0x0226
            L_0x01bb:
                r3 = r16
                r1 = r17
                com.miot.common.property.Property r0 = r1.getProperty(r10)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0226
                java.lang.Object r0 = r1.getValue(r10)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.BsLampService$d1 r1 = r3.f15835a
                r1.mo28225n(r0)
                goto L_0x0226
            L_0x01d5:
                r3 = r16
                r1 = r17
                com.miot.common.property.Property r0 = r1.getProperty(r11)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0226
                java.lang.Object r0 = r1.getValue(r11)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.BsLampService$d1 r1 = r3.f15835a
                r1.mo28219h(r0)
                goto L_0x0226
            L_0x01ef:
                r3 = r16
                r1 = r17
                com.miot.common.property.Property r0 = r1.getProperty(r4)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0226
                java.lang.Object r0 = r1.getValue(r4)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.BsLampService$d1 r1 = r3.f15835a
                r1.mo28213a(r0)
                goto L_0x0226
            L_0x0209:
                r3 = r16
                r1 = r17
                com.miot.common.property.Property r0 = r1.getProperty(r7)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0226
                java.lang.Object r0 = r1.getValue(r7)
                java.lang.String r0 = (java.lang.String) r0
                com.yeelight.yeelib.device.xiaomi.BsLampService$c1 r0 = com.yeelight.yeelib.device.xiaomi.BsLampService.C7821c1.valueOf(r0)
                com.yeelight.yeelib.device.xiaomi.BsLampService$d1 r1 = r3.f15835a
                r1.mo28218f(r0)
            L_0x0226:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.xiaomi.BsLampService.C7859v.onPropertyChanged(com.miot.common.device.invocation.PropertyInfo, java.lang.String):void");
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLampService$v0 */
    public interface C7860v0 {
        /* renamed from: a */
        void mo29325a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLampService$w */
    class C7861w implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15836a;

        C7861w(BsLampService bsLampService, CompletionHandler completionHandler) {
            this.f15836a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15836a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f15836a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLampService$w0 */
    public interface C7862w0 {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLampService$x */
    class C7863x implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15837a;

        C7863x(BsLampService bsLampService, CompletionHandler completionHandler) {
            this.f15837a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15837a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f15837a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLampService$x0 */
    public interface C7864x0 {
        /* renamed from: a */
        void mo29329a(C7821c1 c1Var);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLampService$y */
    class C7865y implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15838a;

        C7865y(BsLampService bsLampService, CompletionHandler completionHandler) {
            this.f15838a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15838a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f15838a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLampService$y0 */
    public interface C7866y0 {
        /* renamed from: a */
        void mo28211a(C7821c1 c1Var, Long l, Long l2, Long l3, Long l4, Long l5, Long l6, Long l7, Long l8, String str, Long l9, Long l10, String str2, Long l11);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLampService$z */
    class C7867z implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15839a;

        C7867z(BsLampService bsLampService, CompletionHandler completionHandler) {
            this.f15839a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15839a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f15839a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLampService$z0 */
    public interface C7868z0 {
        /* renamed from: a */
        void mo29331a(Long l);

        void onFailed(int i, String str);
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
                MiotManager.getDeviceManipulator().invoke(create, new C7855t(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7841m(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7835j(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7820c0(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getBright(C7844n0 n0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Bright"), new C7832h0(this, n0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getColorMode(C7846o0 o0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "ColorMode"), new C7816b(this, o0Var));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7817b0(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getCt(C7848p0 p0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Ct"), new C7834i0(this, p0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getDelayOff(C7850q0 q0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "DelayOff"), new C7822d(this, q0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowParams(C7852r0 r0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "FlowParams"), new C7825e(this, r0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowing(C7854s0 s0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Flowing"), new C7813a(this, s0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getHue(C7856t0 t0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Hue"), new C7836j0(this, t0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getMiBandSleep(C7858u0 u0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "MiBandSleep"), new C7833i(this, u0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getMusicEnable(C7860v0 v0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "MusicEnable"), new C7829g(this, v0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getNightTimeInfo(C7862w0 w0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "NightTimeInfo"), new C7831h(this, w0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getPower(C7864x0 x0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Power"), new C7830g0(this, x0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getProperties(C7866y0 y0Var) {
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
            create.addProperty(getService().getProperty("MusicEnable"));
            create.addProperty(getService().getProperty("NightTimeInfo"));
            create.addProperty(getService().getProperty("MiBandSleep"));
            MiotManager.getDeviceManipulator().readProperty(create, new C7828f0(this, y0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getRgb(C7868z0 z0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Rgb"), new C7819c(this, z0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getSat(C7815a1 a1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Sat"), new C7838k0(this, a1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getSaveState(C7818b1 b1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "SaveState"), new C7827f(this, b1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void openWithMode(C7821c1 c1Var, C7842m0 m0Var, Long l, Long l2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "openWithMode");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("Power", c1Var.toString())) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Effect", m0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Duration", l)) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("Mode", l2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C7847p(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7843n(this, completionHandler));
                return;
            }
            throw new MiotException("actionInfo is null");
        }
        throw new MiotException("device not configurated connection");
    }

    public void sendCmd(C7840l0 l0Var, String str, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "sendCmd");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("CmdKey", l0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("CmdValue", str)) {
                MiotManager.getDeviceManipulator().invoke(create, new C7863x(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setBright(Long l, C7842m0 m0Var, Long l2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setBright");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("Bright", l)) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Effect", m0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("Duration", l2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C7839l(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setCt(Long l, C7842m0 m0Var, Long l2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setCt");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("Ct", l)) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Effect", m0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("Duration", l2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C7814a0(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7857u(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7867z(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7861w(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setPower(C7821c1 c1Var, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setPower");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (create.setArgumentValue("Power", c1Var.toString())) {
                MiotManager.getDeviceManipulator().invoke(create, new C7849q(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setRgb(Long l, C7842m0 m0Var, Long l2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setRgb");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("Rgb", l)) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Effect", m0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("Duration", l2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C7851r(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7845o(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7865y(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7823d0(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void subscribeNotifications(CompletionHandler completionHandler, C7824d1 d1Var) {
        if (completionHandler == null) {
            throw new IllegalArgumentException("handler is null");
        } else if (d1Var != null) {
            PropertyInfo create = PropertyInfoFactory.create(getService());
            for (Property next : getService().getProperties()) {
                if (next.getDefinition().isNotifiable()) {
                    create.addProperty(next);
                }
            }
            MiotManager.getDeviceManipulator().addPropertyChangedListener(create, new C7837k(this, completionHandler), new C7859v(this, d1Var));
        } else {
            throw new IllegalArgumentException("listener is null");
        }
    }

    public void toggle(CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "toggle");
            if (create != null) {
                MiotManager.getDeviceManipulator().invoke(create, new C7853s(this, completionHandler));
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
            MiotManager.getDeviceManipulator().removePropertyChangedListener(create, new C7826e0(this, completionHandler));
            return;
        }
        throw new IllegalArgumentException("handler is null");
    }
}
