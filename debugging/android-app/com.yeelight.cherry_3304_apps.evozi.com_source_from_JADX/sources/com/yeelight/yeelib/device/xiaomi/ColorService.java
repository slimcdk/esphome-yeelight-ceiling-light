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

public class ColorService extends AbstractService {
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
    public static final String PROPERTY_Temperature = "Temperature";
    public static final String PROPERTY_onFromPower = "onFromPower";
    private static final String TAG = "ColorService";
    private AbstractDevice mDevice = null;

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorService$a */
    class C8647a implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8700y0 f16610a;

        C8647a(ColorService colorService, C8700y0 y0Var) {
            this.f16610a = y0Var;
        }

        public void onFailed(int i, String str) {
            this.f16610a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Sat");
            if (property.isValueValid()) {
                this.f16610a.mo30291a((Long) propertyInfo.getValue("Sat"));
                return;
            }
            C8700y0 y0Var = this.f16610a;
            y0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorService$a0 */
    class C8648a0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16611a;

        C8648a0(ColorService colorService, CompletionHandler completionHandler) {
            this.f16611a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16611a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16611a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorService$a1 */
    public interface C8649a1 {
        /* renamed from: a */
        void mo30265a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorService$b */
    class C8650b implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8686r0 f16612a;

        C8650b(ColorService colorService, C8686r0 r0Var) {
            this.f16612a = r0Var;
        }

        public void onFailed(int i, String str) {
            this.f16612a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Flowing");
            if (property.isValueValid()) {
                this.f16612a.mo30279a((Long) propertyInfo.getValue("Flowing"));
                return;
            }
            C8686r0 r0Var = this.f16612a;
            r0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorService$b0 */
    class C8651b0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16613a;

        C8651b0(ColorService colorService, CompletionHandler completionHandler) {
            this.f16613a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16613a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16613a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorService$b1 */
    public interface C8652b1 {
        /* renamed from: a */
        void mo30267a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorService$c */
    class C8653c implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8678n0 f16614a;

        C8653c(ColorService colorService, C8678n0 n0Var) {
            this.f16614a = n0Var;
        }

        public void onFailed(int i, String str) {
            this.f16614a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("ColorMode");
            if (property.isValueValid()) {
                this.f16614a.mo30271a((Long) propertyInfo.getValue("ColorMode"));
                return;
            }
            C8678n0 n0Var = this.f16614a;
            n0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorService$c0 */
    class C8654c0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16615a;

        C8654c0(ColorService colorService, CompletionHandler completionHandler) {
            this.f16615a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16615a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16615a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorService$c1 */
    public enum C8655c1 {
        undefined,
        on,
        off
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorService$d */
    class C8656d implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8698x0 f16620a;

        C8656d(ColorService colorService, C8698x0 x0Var) {
            this.f16620a = x0Var;
        }

        public void onFailed(int i, String str) {
            this.f16620a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Rgb");
            if (property.isValueValid()) {
                this.f16620a.mo30289a((Long) propertyInfo.getValue("Rgb"));
                return;
            }
            C8698x0 x0Var = this.f16620a;
            x0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorService$d0 */
    class C8657d0 implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16621a;

        C8657d0(ColorService colorService, CompletionHandler completionHandler) {
            this.f16621a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16621a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f16621a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorService$d1 */
    public interface C8658d1 {
        /* renamed from: a */
        void mo28709a(Long l);

        /* renamed from: b */
        void mo28710b(Long l);

        /* renamed from: c */
        void mo28711c(Long l);

        /* renamed from: d */
        void mo28712d(Long l);

        /* renamed from: e */
        void mo28713e(String str);

        /* renamed from: f */
        void mo28714f(Long l);

        /* renamed from: g */
        void mo28715g(Long l);

        /* renamed from: h */
        void mo28716h(Long l);

        /* renamed from: i */
        void mo28717i(C8655c1 c1Var);

        /* renamed from: j */
        void mo28718j(Long l);

        /* renamed from: k */
        void mo28719k(Long l);

        /* renamed from: l */
        void mo28720l(Long l);

        /* renamed from: n */
        void mo28721n(Long l);

        /* renamed from: o */
        void mo28722o(Long l);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorService$e */
    class C8659e implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8682p0 f16622a;

        C8659e(ColorService colorService, C8682p0 p0Var) {
            this.f16622a = p0Var;
        }

        public void onFailed(int i, String str) {
            this.f16622a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("DelayOff");
            if (property.isValueValid()) {
                this.f16622a.mo30275a((Long) propertyInfo.getValue("DelayOff"));
                return;
            }
            C8682p0 p0Var = this.f16622a;
            p0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorService$e0 */
    class C8660e0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8696w0 f16623a;

        C8660e0(ColorService colorService, C8696w0 w0Var) {
            this.f16623a = w0Var;
        }

        public void onFailed(int i, String str) {
            this.f16623a.onFailed(i, str);
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
                com.yeelight.yeelib.device.xiaomi.ColorService$c1 r1 = com.yeelight.yeelib.device.xiaomi.ColorService.C8655c1.valueOf(r1)
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
                java.lang.String r1 = "Temperature"
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
                java.lang.String r1 = "Hue"
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
                java.lang.String r1 = "Sat"
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
                java.lang.String r1 = "Flowing"
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
                java.lang.String r1 = "ColorMode"
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
                java.lang.String r1 = "Rgb"
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
                java.lang.String r1 = "DelayOff"
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
                java.lang.String r1 = "FlowParams"
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
                java.lang.String r1 = "LanMode"
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
                java.lang.String r1 = "onFromPower"
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
                java.lang.String r1 = "MusicEnable"
                com.miot.common.property.Property r0 = r0.getProperty(r1)
                boolean r1 = r0.isValueValid()
                if (r1 == 0) goto L_0x0146
                java.lang.Object r0 = r0.getValue()
                r3 = r0
                java.lang.Long r3 = (java.lang.Long) r3
            L_0x0146:
                r0 = r20
                r19 = r3
                com.yeelight.yeelib.device.xiaomi.ColorService$w0 r4 = r0.f16623a
                r4.mo28707a(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.xiaomi.ColorService.C8660e0.onSucceed(com.miot.common.device.invocation.PropertyInfo):void");
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorService$f */
    class C8661f implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8702z0 f16624a;

        C8661f(ColorService colorService, C8702z0 z0Var) {
            this.f16624a = z0Var;
        }

        public void onFailed(int i, String str) {
            this.f16624a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("SaveState");
            if (property.isValueValid()) {
                this.f16624a.mo30293a((Long) propertyInfo.getValue("SaveState"));
                return;
            }
            C8702z0 z0Var = this.f16624a;
            z0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorService$f0 */
    class C8662f0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8694v0 f16625a;

        C8662f0(ColorService colorService, C8694v0 v0Var) {
            this.f16625a = v0Var;
        }

        public void onFailed(int i, String str) {
            this.f16625a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Power");
            if (property.isValueValid()) {
                this.f16625a.mo30287a(C8655c1.valueOf((String) propertyInfo.getValue("Power")));
                return;
            }
            C8694v0 v0Var = this.f16625a;
            v0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorService$g */
    class C8663g implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8684q0 f16626a;

        C8663g(ColorService colorService, C8684q0 q0Var) {
            this.f16626a = q0Var;
        }

        public void onFailed(int i, String str) {
            this.f16626a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("FlowParams");
            if (property.isValueValid()) {
                this.f16626a.onSucceed((String) propertyInfo.getValue("FlowParams"));
                return;
            }
            C8684q0 q0Var = this.f16626a;
            q0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorService$g0 */
    class C8664g0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8676m0 f16627a;

        C8664g0(ColorService colorService, C8676m0 m0Var) {
            this.f16627a = m0Var;
        }

        public void onFailed(int i, String str) {
            this.f16627a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Bright");
            if (property.isValueValid()) {
                this.f16627a.mo30269a((Long) propertyInfo.getValue("Bright"));
                return;
            }
            C8676m0 m0Var = this.f16627a;
            m0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorService$h */
    class C8665h implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8690t0 f16628a;

        C8665h(ColorService colorService, C8690t0 t0Var) {
            this.f16628a = t0Var;
        }

        public void onFailed(int i, String str) {
            this.f16628a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("LanMode");
            if (property.isValueValid()) {
                this.f16628a.mo30283a((Long) propertyInfo.getValue("LanMode"));
                return;
            }
            C8690t0 t0Var = this.f16628a;
            t0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorService$h0 */
    class C8666h0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8680o0 f16629a;

        C8666h0(ColorService colorService, C8680o0 o0Var) {
            this.f16629a = o0Var;
        }

        public void onFailed(int i, String str) {
            this.f16629a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Ct");
            if (property.isValueValid()) {
                this.f16629a.mo30273a((Long) propertyInfo.getValue("Ct"));
                return;
            }
            C8680o0 o0Var = this.f16629a;
            o0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorService$i */
    class C8667i implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8652b1 f16630a;

        C8667i(ColorService colorService, C8652b1 b1Var) {
            this.f16630a = b1Var;
        }

        public void onFailed(int i, String str) {
            this.f16630a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("onFromPower");
            if (property.isValueValid()) {
                this.f16630a.mo30267a((Long) propertyInfo.getValue("onFromPower"));
                return;
            }
            C8652b1 b1Var = this.f16630a;
            b1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorService$i0 */
    class C8668i0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8649a1 f16631a;

        C8668i0(ColorService colorService, C8649a1 a1Var) {
            this.f16631a = a1Var;
        }

        public void onFailed(int i, String str) {
            this.f16631a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Temperature");
            if (property.isValueValid()) {
                this.f16631a.mo30265a((Long) propertyInfo.getValue("Temperature"));
                return;
            }
            C8649a1 a1Var = this.f16631a;
            a1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorService$j */
    class C8669j implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8692u0 f16632a;

        C8669j(ColorService colorService, C8692u0 u0Var) {
            this.f16632a = u0Var;
        }

        public void onFailed(int i, String str) {
            this.f16632a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("MusicEnable");
            if (property.isValueValid()) {
                this.f16632a.mo30285a((Long) propertyInfo.getValue("MusicEnable"));
                return;
            }
            C8692u0 u0Var = this.f16632a;
            u0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorService$j0 */
    class C8670j0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8688s0 f16633a;

        C8670j0(ColorService colorService, C8688s0 s0Var) {
            this.f16633a = s0Var;
        }

        public void onFailed(int i, String str) {
            this.f16633a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Hue");
            if (property.isValueValid()) {
                this.f16633a.mo30281a((Long) propertyInfo.getValue("Hue"));
                return;
            }
            C8688s0 s0Var = this.f16633a;
            s0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorService$k */
    class C8671k implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16634a;

        C8671k(ColorService colorService, CompletionHandler completionHandler) {
            this.f16634a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16634a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f16634a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorService$k0 */
    public enum C8672k0 {
        undefined,
        cfg_pomodoro,
        cfg_lan_ctrl,
        cfg_save_state,
        cfg_init_power
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorService$l */
    class C8673l implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16641a;

        C8673l(ColorService colorService, CompletionHandler completionHandler) {
            this.f16641a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16641a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16641a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorService$l0 */
    public enum C8674l0 {
        undefined,
        smooth,
        sudden
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorService$m */
    class C8675m implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16646a;

        C8675m(ColorService colorService, CompletionHandler completionHandler) {
            this.f16646a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16646a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16646a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorService$m0 */
    public interface C8676m0 {
        /* renamed from: a */
        void mo30269a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorService$n */
    class C8677n implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16647a;

        C8677n(ColorService colorService, CompletionHandler completionHandler) {
            this.f16647a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16647a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16647a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorService$n0 */
    public interface C8678n0 {
        /* renamed from: a */
        void mo30271a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorService$o */
    class C8679o implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16648a;

        C8679o(ColorService colorService, CompletionHandler completionHandler) {
            this.f16648a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16648a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16648a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorService$o0 */
    public interface C8680o0 {
        /* renamed from: a */
        void mo30273a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorService$p */
    class C8681p implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16649a;

        C8681p(ColorService colorService, CompletionHandler completionHandler) {
            this.f16649a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16649a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16649a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorService$p0 */
    public interface C8682p0 {
        /* renamed from: a */
        void mo30275a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorService$q */
    class C8683q implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16650a;

        C8683q(ColorService colorService, CompletionHandler completionHandler) {
            this.f16650a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16650a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16650a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorService$q0 */
    public interface C8684q0 {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorService$r */
    class C8685r implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16651a;

        C8685r(ColorService colorService, CompletionHandler completionHandler) {
            this.f16651a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16651a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16651a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorService$r0 */
    public interface C8686r0 {
        /* renamed from: a */
        void mo30279a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorService$s */
    class C8687s implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16652a;

        C8687s(ColorService colorService, CompletionHandler completionHandler) {
            this.f16652a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16652a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16652a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorService$s0 */
    public interface C8688s0 {
        /* renamed from: a */
        void mo30281a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorService$t */
    class C8689t implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16653a;

        C8689t(ColorService colorService, CompletionHandler completionHandler) {
            this.f16653a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16653a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16653a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorService$t0 */
    public interface C8690t0 {
        /* renamed from: a */
        void mo30283a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorService$u */
    class C8691u implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16654a;

        C8691u(ColorService colorService, CompletionHandler completionHandler) {
            this.f16654a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16654a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16654a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorService$u0 */
    public interface C8692u0 {
        /* renamed from: a */
        void mo30285a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorService$v */
    class C8693v implements DeviceManipulator.PropertyChangedListener {

        /* renamed from: a */
        final /* synthetic */ C8658d1 f16655a;

        C8693v(ColorService colorService, C8658d1 d1Var) {
            this.f16655a = d1Var;
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
                java.lang.String r5 = "LanMode"
                java.lang.String r6 = "Flowing"
                java.lang.String r7 = "DelayOff"
                java.lang.String r8 = "Power"
                java.lang.String r9 = "onFromPower"
                java.lang.String r10 = "Sat"
                java.lang.String r11 = "Rgb"
                java.lang.String r12 = "Hue"
                java.lang.String r13 = "Ct"
                java.lang.String r14 = "ColorMode"
                java.lang.String r15 = "MusicEnable"
                java.lang.String r0 = "FlowParams"
                java.lang.String r1 = "SaveState"
                switch(r3) {
                    case -2117953292: goto L_0x009b;
                    case -2002016140: goto L_0x0092;
                    case -1787381784: goto L_0x0089;
                    case -310275194: goto L_0x0081;
                    case 2193: goto L_0x0079;
                    case 72920: goto L_0x0071;
                    case 82093: goto L_0x0069;
                    case 82886: goto L_0x0061;
                    case 35911772: goto L_0x0058;
                    case 77306085: goto L_0x0050;
                    case 880790796: goto L_0x0047;
                    case 898856916: goto L_0x003e;
                    case 1611821756: goto L_0x0034;
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
                r2 = 11
                goto L_0x00a5
            L_0x003e:
                boolean r2 = r2.equals(r6)
                if (r2 == 0) goto L_0x00a4
                r2 = 5
                goto L_0x00a5
            L_0x0047:
                boolean r2 = r2.equals(r7)
                if (r2 == 0) goto L_0x00a4
                r2 = 8
                goto L_0x00a5
            L_0x0050:
                boolean r2 = r2.equals(r8)
                if (r2 == 0) goto L_0x00a4
                r2 = 0
                goto L_0x00a5
            L_0x0058:
                boolean r2 = r2.equals(r9)
                if (r2 == 0) goto L_0x00a4
                r2 = 12
                goto L_0x00a5
            L_0x0061:
                boolean r2 = r2.equals(r10)
                if (r2 == 0) goto L_0x00a4
                r2 = 4
                goto L_0x00a5
            L_0x0069:
                boolean r2 = r2.equals(r11)
                if (r2 == 0) goto L_0x00a4
                r2 = 7
                goto L_0x00a5
            L_0x0071:
                boolean r2 = r2.equals(r12)
                if (r2 == 0) goto L_0x00a4
                r2 = 3
                goto L_0x00a5
            L_0x0079:
                boolean r2 = r2.equals(r13)
                if (r2 == 0) goto L_0x00a4
                r2 = 2
                goto L_0x00a5
            L_0x0081:
                boolean r2 = r2.equals(r14)
                if (r2 == 0) goto L_0x00a4
                r2 = 6
                goto L_0x00a5
            L_0x0089:
                boolean r2 = r2.equals(r15)
                if (r2 == 0) goto L_0x00a4
                r2 = 13
                goto L_0x00a5
            L_0x0092:
                boolean r2 = r2.equals(r0)
                if (r2 == 0) goto L_0x00a4
                r2 = 10
                goto L_0x00a5
            L_0x009b:
                boolean r2 = r2.equals(r1)
                if (r2 == 0) goto L_0x00a4
                r2 = 9
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
                    case 9: goto L_0x0118;
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
                com.miot.common.property.Property r0 = r1.getProperty(r15)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x00a8
                java.lang.Object r0 = r1.getValue(r15)
                java.lang.Long r0 = (java.lang.Long) r0
                r3 = r16
                com.yeelight.yeelib.device.xiaomi.ColorService$d1 r1 = r3.f16655a
                r1.mo28722o(r0)
                goto L_0x0226
            L_0x00c7:
                r3 = r16
                r1 = r17
                com.miot.common.property.Property r0 = r1.getProperty(r9)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0226
                java.lang.Object r0 = r1.getValue(r9)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.ColorService$d1 r1 = r3.f16655a
                r1.mo28714f(r0)
                goto L_0x0226
            L_0x00e2:
                r3 = r16
                r1 = r17
                com.miot.common.property.Property r0 = r1.getProperty(r5)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0226
                java.lang.Object r0 = r1.getValue(r5)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.ColorService$d1 r1 = r3.f16655a
                r1.mo28715g(r0)
                goto L_0x0226
            L_0x00fd:
                r3 = r16
                r1 = r17
                com.miot.common.property.Property r2 = r1.getProperty(r0)
                boolean r2 = r2.isValueValid()
                if (r2 == 0) goto L_0x0226
                java.lang.Object r0 = r1.getValue(r0)
                java.lang.String r0 = (java.lang.String) r0
                com.yeelight.yeelib.device.xiaomi.ColorService$d1 r1 = r3.f16655a
                r1.mo28713e(r0)
                goto L_0x0226
            L_0x0118:
                r3 = r16
                r2 = r1
                r1 = r17
                com.miot.common.property.Property r0 = r1.getProperty(r2)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0226
                java.lang.Object r0 = r1.getValue(r2)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.ColorService$d1 r1 = r3.f16655a
                r1.mo28712d(r0)
                goto L_0x0226
            L_0x0134:
                r3 = r16
                r1 = r17
                com.miot.common.property.Property r0 = r1.getProperty(r7)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0226
                java.lang.Object r0 = r1.getValue(r7)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.ColorService$d1 r1 = r3.f16655a
                r1.mo28710b(r0)
                goto L_0x0226
            L_0x014f:
                r3 = r16
                r1 = r17
                com.miot.common.property.Property r0 = r1.getProperty(r11)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0226
                java.lang.Object r0 = r1.getValue(r11)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.ColorService$d1 r1 = r3.f16655a
                r1.mo28718j(r0)
                goto L_0x0226
            L_0x016a:
                r3 = r16
                r1 = r17
                com.miot.common.property.Property r0 = r1.getProperty(r14)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0226
                java.lang.Object r0 = r1.getValue(r14)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.ColorService$d1 r1 = r3.f16655a
                r1.mo28720l(r0)
                goto L_0x0226
            L_0x0185:
                r3 = r16
                r1 = r17
                com.miot.common.property.Property r0 = r1.getProperty(r6)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0226
                java.lang.Object r0 = r1.getValue(r6)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.ColorService$d1 r1 = r3.f16655a
                r1.mo28711c(r0)
                goto L_0x0226
            L_0x01a0:
                r3 = r16
                r1 = r17
                com.miot.common.property.Property r0 = r1.getProperty(r10)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0226
                java.lang.Object r0 = r1.getValue(r10)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.ColorService$d1 r1 = r3.f16655a
                r1.mo28719k(r0)
                goto L_0x0226
            L_0x01bb:
                r3 = r16
                r1 = r17
                com.miot.common.property.Property r0 = r1.getProperty(r12)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0226
                java.lang.Object r0 = r1.getValue(r12)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.ColorService$d1 r1 = r3.f16655a
                r1.mo28721n(r0)
                goto L_0x0226
            L_0x01d5:
                r3 = r16
                r1 = r17
                com.miot.common.property.Property r0 = r1.getProperty(r13)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0226
                java.lang.Object r0 = r1.getValue(r13)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.ColorService$d1 r1 = r3.f16655a
                r1.mo28716h(r0)
                goto L_0x0226
            L_0x01ef:
                r3 = r16
                r1 = r17
                com.miot.common.property.Property r0 = r1.getProperty(r4)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0226
                java.lang.Object r0 = r1.getValue(r4)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.ColorService$d1 r1 = r3.f16655a
                r1.mo28709a(r0)
                goto L_0x0226
            L_0x0209:
                r3 = r16
                r1 = r17
                com.miot.common.property.Property r0 = r1.getProperty(r8)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0226
                java.lang.Object r0 = r1.getValue(r8)
                java.lang.String r0 = (java.lang.String) r0
                com.yeelight.yeelib.device.xiaomi.ColorService$c1 r0 = com.yeelight.yeelib.device.xiaomi.ColorService.C8655c1.valueOf(r0)
                com.yeelight.yeelib.device.xiaomi.ColorService$d1 r1 = r3.f16655a
                r1.mo28717i(r0)
            L_0x0226:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.xiaomi.ColorService.C8693v.onPropertyChanged(com.miot.common.device.invocation.PropertyInfo, java.lang.String):void");
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorService$v0 */
    public interface C8694v0 {
        /* renamed from: a */
        void mo30287a(C8655c1 c1Var);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorService$w */
    class C8695w implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16656a;

        C8695w(ColorService colorService, CompletionHandler completionHandler) {
            this.f16656a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16656a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16656a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorService$w0 */
    public interface C8696w0 {
        /* renamed from: a */
        void mo28707a(C8655c1 c1Var, Long l, Long l2, Long l3, Long l4, Long l5, Long l6, Long l7, Long l8, Long l9, Long l10, String str, Long l11, Long l12, Long l13);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorService$x */
    class C8697x implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16657a;

        C8697x(ColorService colorService, CompletionHandler completionHandler) {
            this.f16657a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16657a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16657a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorService$x0 */
    public interface C8698x0 {
        /* renamed from: a */
        void mo30289a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorService$y */
    class C8699y implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16658a;

        C8699y(ColorService colorService, CompletionHandler completionHandler) {
            this.f16658a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16658a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16658a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorService$y0 */
    public interface C8700y0 {
        /* renamed from: a */
        void mo30291a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorService$z */
    class C8701z implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16659a;

        C8701z(ColorService colorService, CompletionHandler completionHandler) {
            this.f16659a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16659a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16659a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorService$z0 */
    public interface C8702z0 {
        /* renamed from: a */
        void mo30293a(Long l);

        void onFailed(int i, String str);
    }

    public ColorService(AbstractDevice abstractDevice) {
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
                MiotManager.getDeviceManipulator().invoke(create, new C8691u(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8677n(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8673l(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8651b0(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getBright(C8676m0 m0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Bright"), new C8664g0(this, m0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getColorMode(C8678n0 n0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "ColorMode"), new C8653c(this, n0Var));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8648a0(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getCt(C8680o0 o0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Ct"), new C8666h0(this, o0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getDelayOff(C8682p0 p0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "DelayOff"), new C8659e(this, p0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowParams(C8684q0 q0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "FlowParams"), new C8663g(this, q0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowing(C8686r0 r0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Flowing"), new C8650b(this, r0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getHue(C8688s0 s0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Hue"), new C8670j0(this, s0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getLanMode(C8690t0 t0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "LanMode"), new C8665h(this, t0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getMusicEnable(C8692u0 u0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "MusicEnable"), new C8669j(this, u0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getPower(C8694v0 v0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Power"), new C8662f0(this, v0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getProperties(C8696w0 w0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            PropertyInfo create = PropertyInfoFactory.create(getService());
            create.addProperty(getService().getProperty("Power"));
            create.addProperty(getService().getProperty("Bright"));
            create.addProperty(getService().getProperty("Ct"));
            create.addProperty(getService().getProperty("Temperature"));
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
            MiotManager.getDeviceManipulator().readProperty(create, new C8660e0(this, w0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getRgb(C8698x0 x0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Rgb"), new C8656d(this, x0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getSat(C8700y0 y0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Sat"), new C8647a(this, y0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getSaveState(C8702z0 z0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "SaveState"), new C8661f(this, z0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getTemperature(C8649a1 a1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Temperature"), new C8668i0(this, a1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getonFromPower(C8652b1 b1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "onFromPower"), new C8667i(this, b1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void openWithMode(C8655c1 c1Var, C8674l0 l0Var, Long l, Long l2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "openWithMode");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("Power", c1Var.toString())) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Effect", l0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Duration", l)) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("Mode", l2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C8683q(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8679o(this, completionHandler));
                return;
            }
            throw new MiotException("actionInfo is null");
        }
        throw new MiotException("device not configurated connection");
    }

    public void sendCmd(C8672k0 k0Var, String str, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "sendCmd");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("CmdKey", k0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("CmdValue", str)) {
                MiotManager.getDeviceManipulator().invoke(create, new C8697x(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setBright(Long l, C8674l0 l0Var, Long l2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setBright");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("Bright", l)) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Effect", l0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("Duration", l2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C8675m(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setCt(Long l, C8674l0 l0Var, Long l2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setCt");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("Ct", l)) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Effect", l0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("Duration", l2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C8701z(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8695w(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8699y(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setPower(C8655c1 c1Var, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setPower");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (create.setArgumentValue("Power", c1Var.toString())) {
                MiotManager.getDeviceManipulator().invoke(create, new C8685r(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setRgb(Long l, C8674l0 l0Var, Long l2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setRgb");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("Rgb", l)) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Effect", l0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("Duration", l2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C8687s(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8681p(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8654c0(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void subscribeNotifications(CompletionHandler completionHandler, C8658d1 d1Var) {
        if (completionHandler == null) {
            throw new IllegalArgumentException("handler is null");
        } else if (d1Var != null) {
            PropertyInfo create = PropertyInfoFactory.create(getService());
            for (Property next : getService().getProperties()) {
                if (next.getDefinition().isNotifiable()) {
                    create.addProperty(next);
                }
            }
            MiotManager.getDeviceManipulator().addPropertyChangedListener(create, new C8671k(this, completionHandler), new C8693v(this, d1Var));
        } else {
            throw new IllegalArgumentException("listener is null");
        }
    }

    public void toggle(CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "toggle");
            if (create != null) {
                MiotManager.getDeviceManipulator().invoke(create, new C8689t(this, completionHandler));
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
            MiotManager.getDeviceManipulator().removePropertyChangedListener(create, new C8657d0(this, completionHandler));
            return;
        }
        throw new IllegalArgumentException("handler is null");
    }
}
