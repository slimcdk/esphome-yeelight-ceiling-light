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

public class Lamp10Service extends AbstractService {
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
    public static final String PROPERTY_IndicatorEnable = "IndicatorEnable";
    public static final String PROPERTY_LanMode = "LanMode";
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
    public static final String PROPERTY_Temperature = "Temperature";
    public static final String PROPERTY_onFromPower = "onFromPower";
    private static final String TAG = "Lamp10Service";
    private AbstractDevice mDevice = null;

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp10Service$a */
    class C8845a implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8856d1 f16796a;

        C8845a(Lamp10Service lamp10Service, C8856d1 d1Var) {
            this.f16796a = d1Var;
        }

        public void onFailed(int i, String str) {
            this.f16796a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Sat");
            if (property.isValueValid()) {
                this.f16796a.mo30496a((Long) propertyInfo.getValue("Sat"));
                return;
            }
            C8856d1 d1Var = this.f16796a;
            d1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp10Service$a0 */
    class C8846a0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16797a;

        C8846a0(Lamp10Service lamp10Service, CompletionHandler completionHandler) {
            this.f16797a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16797a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16797a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp10Service$a1 */
    public interface C8847a1 {
        /* renamed from: a */
        void mo30492a(C8868h1 h1Var);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp10Service$b */
    class C8848b implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8895u0 f16798a;

        C8848b(Lamp10Service lamp10Service, C8895u0 u0Var) {
            this.f16798a = u0Var;
        }

        public void onFailed(int i, String str) {
            this.f16798a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Flowing");
            if (property.isValueValid()) {
                this.f16798a.mo30514a((Long) propertyInfo.getValue("Flowing"));
                return;
            }
            C8895u0 u0Var = this.f16798a;
            u0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp10Service$b0 */
    class C8849b0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16799a;

        C8849b0(Lamp10Service lamp10Service, CompletionHandler completionHandler) {
            this.f16799a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16799a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16799a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp10Service$b1 */
    public interface C8850b1 {
        /* renamed from: a */
        void mo28229a(C8868h1 h1Var, Long l, Long l2, Long l3, Long l4, Long l5, Long l6, Long l7, Long l8, Long l9, Long l10, String str, Long l11, Long l12, Long l13, String str2, String str3);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp10Service$c */
    class C8851c implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8887q0 f16800a;

        C8851c(Lamp10Service lamp10Service, C8887q0 q0Var) {
            this.f16800a = q0Var;
        }

        public void onFailed(int i, String str) {
            this.f16800a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("ColorMode");
            if (property.isValueValid()) {
                this.f16800a.mo30506a((Long) propertyInfo.getValue("ColorMode"));
                return;
            }
            C8887q0 q0Var = this.f16800a;
            q0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp10Service$c0 */
    class C8852c0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16801a;

        C8852c0(Lamp10Service lamp10Service, CompletionHandler completionHandler) {
            this.f16801a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16801a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16801a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp10Service$c1 */
    public interface C8853c1 {
        /* renamed from: a */
        void mo30494a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp10Service$d */
    class C8854d implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8853c1 f16802a;

        C8854d(Lamp10Service lamp10Service, C8853c1 c1Var) {
            this.f16802a = c1Var;
        }

        public void onFailed(int i, String str) {
            this.f16802a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Rgb");
            if (property.isValueValid()) {
                this.f16802a.mo30494a((Long) propertyInfo.getValue("Rgb"));
                return;
            }
            C8853c1 c1Var = this.f16802a;
            c1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp10Service$d0 */
    class C8855d0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16803a;

        C8855d0(Lamp10Service lamp10Service, CompletionHandler completionHandler) {
            this.f16803a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16803a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16803a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp10Service$d1 */
    public interface C8856d1 {
        /* renamed from: a */
        void mo30496a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp10Service$e */
    class C8857e implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8891s0 f16804a;

        C8857e(Lamp10Service lamp10Service, C8891s0 s0Var) {
            this.f16804a = s0Var;
        }

        public void onFailed(int i, String str) {
            this.f16804a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("DelayOff");
            if (property.isValueValid()) {
                this.f16804a.mo30510a((Long) propertyInfo.getValue("DelayOff"));
                return;
            }
            C8891s0 s0Var = this.f16804a;
            s0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp10Service$e0 */
    class C8858e0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16805a;

        C8858e0(Lamp10Service lamp10Service, CompletionHandler completionHandler) {
            this.f16805a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16805a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16805a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp10Service$e1 */
    public interface C8859e1 {
        /* renamed from: a */
        void mo30498a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp10Service$f */
    class C8860f implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8859e1 f16806a;

        C8860f(Lamp10Service lamp10Service, C8859e1 e1Var) {
            this.f16806a = e1Var;
        }

        public void onFailed(int i, String str) {
            this.f16806a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("SaveState");
            if (property.isValueValid()) {
                this.f16806a.mo30498a((Long) propertyInfo.getValue("SaveState"));
                return;
            }
            C8859e1 e1Var = this.f16806a;
            e1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp10Service$f0 */
    class C8861f0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16807a;

        C8861f0(Lamp10Service lamp10Service, CompletionHandler completionHandler) {
            this.f16807a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16807a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16807a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp10Service$f1 */
    public interface C8862f1 {
        /* renamed from: a */
        void mo30500a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp10Service$g */
    class C8863g implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8893t0 f16808a;

        C8863g(Lamp10Service lamp10Service, C8893t0 t0Var) {
            this.f16808a = t0Var;
        }

        public void onFailed(int i, String str) {
            this.f16808a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("FlowParams");
            if (property.isValueValid()) {
                this.f16808a.onSucceed((String) propertyInfo.getValue("FlowParams"));
                return;
            }
            C8893t0 t0Var = this.f16808a;
            t0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp10Service$g0 */
    class C8864g0 implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16809a;

        C8864g0(Lamp10Service lamp10Service, CompletionHandler completionHandler) {
            this.f16809a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16809a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f16809a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp10Service$g1 */
    public interface C8865g1 {
        /* renamed from: a */
        void mo30502a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp10Service$h */
    class C8866h implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8901x0 f16810a;

        C8866h(Lamp10Service lamp10Service, C8901x0 x0Var) {
            this.f16810a = x0Var;
        }

        public void onFailed(int i, String str) {
            this.f16810a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("LanMode");
            if (property.isValueValid()) {
                this.f16810a.mo30520a((Long) propertyInfo.getValue("LanMode"));
                return;
            }
            C8901x0 x0Var = this.f16810a;
            x0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp10Service$h0 */
    class C8867h0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8850b1 f16811a;

        C8867h0(Lamp10Service lamp10Service, C8850b1 b1Var) {
            this.f16811a = b1Var;
        }

        public void onFailed(int i, String str) {
            this.f16811a.onFailed(i, str);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.String} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onSucceed(com.miot.common.device.invocation.PropertyInfo r23) {
            /*
                r22 = this;
                r0 = r23
                java.lang.String r1 = "Power"
                com.miot.common.property.Property r1 = r0.getProperty(r1)
                boolean r2 = r1.isValueValid()
                r3 = 0
                if (r2 == 0) goto L_0x001b
                java.lang.Object r1 = r1.getValue()
                java.lang.String r1 = (java.lang.String) r1
                com.yeelight.yeelib.device.xiaomi.Lamp10Service$h1 r1 = com.yeelight.yeelib.device.xiaomi.Lamp10Service.C8868h1.valueOf(r1)
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
                com.miot.common.property.Property r1 = r0.getProperty(r1)
                boolean r2 = r1.isValueValid()
                if (r2 == 0) goto L_0x0148
                java.lang.Object r1 = r1.getValue()
                java.lang.Long r1 = (java.lang.Long) r1
                r19 = r1
                goto L_0x014a
            L_0x0148:
                r19 = r3
            L_0x014a:
                java.lang.String r1 = "IndicatorEnable"
                com.miot.common.property.Property r1 = r0.getProperty(r1)
                boolean r2 = r1.isValueValid()
                if (r2 == 0) goto L_0x015f
                java.lang.Object r1 = r1.getValue()
                java.lang.String r1 = (java.lang.String) r1
                r20 = r1
                goto L_0x0161
            L_0x015f:
                r20 = r3
            L_0x0161:
                java.lang.String r1 = "NightTimeInfo"
                com.miot.common.property.Property r0 = r0.getProperty(r1)
                boolean r1 = r0.isValueValid()
                if (r1 == 0) goto L_0x0174
                java.lang.Object r0 = r0.getValue()
                r3 = r0
                java.lang.String r3 = (java.lang.String) r3
            L_0x0174:
                r0 = r22
                r21 = r3
                com.yeelight.yeelib.device.xiaomi.Lamp10Service$b1 r4 = r0.f16811a
                r4.mo28229a(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.xiaomi.Lamp10Service.C8867h0.onSucceed(com.miot.common.device.invocation.PropertyInfo):void");
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp10Service$h1 */
    public enum C8868h1 {
        undefined,
        on,
        off
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp10Service$i */
    class C8869i implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8865g1 f16816a;

        C8869i(Lamp10Service lamp10Service, C8865g1 g1Var) {
            this.f16816a = g1Var;
        }

        public void onFailed(int i, String str) {
            this.f16816a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("onFromPower");
            if (property.isValueValid()) {
                this.f16816a.mo30502a((Long) propertyInfo.getValue("onFromPower"));
                return;
            }
            C8865g1 g1Var = this.f16816a;
            g1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp10Service$i0 */
    class C8870i0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8847a1 f16817a;

        C8870i0(Lamp10Service lamp10Service, C8847a1 a1Var) {
            this.f16817a = a1Var;
        }

        public void onFailed(int i, String str) {
            this.f16817a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Power");
            if (property.isValueValid()) {
                this.f16817a.mo30492a(C8868h1.valueOf((String) propertyInfo.getValue("Power")));
                return;
            }
            C8847a1 a1Var = this.f16817a;
            a1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp10Service$i1 */
    public interface C8871i1 {
        /* renamed from: a */
        void mo28231a(Long l);

        /* renamed from: b */
        void mo28232b(Long l);

        /* renamed from: c */
        void mo28233c(Long l);

        /* renamed from: d */
        void mo28234d(Long l);

        /* renamed from: e */
        void mo28235e(String str);

        /* renamed from: f */
        void mo28236f(Long l);

        /* renamed from: g */
        void mo28237g(Long l);

        /* renamed from: h */
        void mo28238h(Long l);

        /* renamed from: i */
        void mo28239i(String str);

        /* renamed from: j */
        void mo28240j(Long l);

        /* renamed from: k */
        void mo28241k(Long l);

        /* renamed from: l */
        void mo28242l(Long l);

        /* renamed from: m */
        void mo28243m(String str);

        /* renamed from: n */
        void mo28244n(Long l);

        /* renamed from: o */
        void mo28245o(Long l);

        /* renamed from: p */
        void mo28246p(C8868h1 h1Var);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp10Service$j */
    class C8872j implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8903y0 f16818a;

        C8872j(Lamp10Service lamp10Service, C8903y0 y0Var) {
            this.f16818a = y0Var;
        }

        public void onFailed(int i, String str) {
            this.f16818a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("MusicEnable");
            if (property.isValueValid()) {
                this.f16818a.mo30522a((Long) propertyInfo.getValue("MusicEnable"));
                return;
            }
            C8903y0 y0Var = this.f16818a;
            y0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp10Service$j0 */
    class C8873j0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8885p0 f16819a;

        C8873j0(Lamp10Service lamp10Service, C8885p0 p0Var) {
            this.f16819a = p0Var;
        }

        public void onFailed(int i, String str) {
            this.f16819a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Bright");
            if (property.isValueValid()) {
                this.f16819a.mo30504a((Long) propertyInfo.getValue("Bright"));
                return;
            }
            C8885p0 p0Var = this.f16819a;
            p0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp10Service$k */
    class C8874k implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16820a;

        C8874k(Lamp10Service lamp10Service, CompletionHandler completionHandler) {
            this.f16820a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16820a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f16820a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp10Service$k0 */
    class C8875k0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8889r0 f16821a;

        C8875k0(Lamp10Service lamp10Service, C8889r0 r0Var) {
            this.f16821a = r0Var;
        }

        public void onFailed(int i, String str) {
            this.f16821a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Ct");
            if (property.isValueValid()) {
                this.f16821a.mo30508a((Long) propertyInfo.getValue("Ct"));
                return;
            }
            C8889r0 r0Var = this.f16821a;
            r0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp10Service$l */
    class C8876l implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8899w0 f16822a;

        C8876l(Lamp10Service lamp10Service, C8899w0 w0Var) {
            this.f16822a = w0Var;
        }

        public void onFailed(int i, String str) {
            this.f16822a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty(Lamp10Service.PROPERTY_IndicatorEnable);
            if (property.isValueValid()) {
                this.f16822a.onSucceed((String) propertyInfo.getValue(Lamp10Service.PROPERTY_IndicatorEnable));
                return;
            }
            C8899w0 w0Var = this.f16822a;
            w0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp10Service$l0 */
    class C8877l0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8862f1 f16823a;

        C8877l0(Lamp10Service lamp10Service, C8862f1 f1Var) {
            this.f16823a = f1Var;
        }

        public void onFailed(int i, String str) {
            this.f16823a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Temperature");
            if (property.isValueValid()) {
                this.f16823a.mo30500a((Long) propertyInfo.getValue("Temperature"));
                return;
            }
            C8862f1 f1Var = this.f16823a;
            f1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp10Service$m */
    class C8878m implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8905z0 f16824a;

        C8878m(Lamp10Service lamp10Service, C8905z0 z0Var) {
            this.f16824a = z0Var;
        }

        public void onFailed(int i, String str) {
            this.f16824a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("NightTimeInfo");
            if (property.isValueValid()) {
                this.f16824a.onSucceed((String) propertyInfo.getValue("NightTimeInfo"));
                return;
            }
            C8905z0 z0Var = this.f16824a;
            z0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp10Service$m0 */
    class C8879m0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8897v0 f16825a;

        C8879m0(Lamp10Service lamp10Service, C8897v0 v0Var) {
            this.f16825a = v0Var;
        }

        public void onFailed(int i, String str) {
            this.f16825a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Hue");
            if (property.isValueValid()) {
                this.f16825a.mo30516a((Long) propertyInfo.getValue("Hue"));
                return;
            }
            C8897v0 v0Var = this.f16825a;
            v0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp10Service$n */
    class C8880n implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16826a;

        C8880n(Lamp10Service lamp10Service, CompletionHandler completionHandler) {
            this.f16826a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16826a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16826a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp10Service$n0 */
    public enum C8881n0 {
        undefined,
        cfg_pomodoro,
        cfg_lan_ctrl,
        cfg_save_state,
        cfg_init_power,
        cfg_indicator,
        nighttime
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp10Service$o */
    class C8882o implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16835a;

        C8882o(Lamp10Service lamp10Service, CompletionHandler completionHandler) {
            this.f16835a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16835a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16835a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp10Service$o0 */
    public enum C8883o0 {
        undefined,
        smooth,
        sudden
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp10Service$p */
    class C8884p implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16840a;

        C8884p(Lamp10Service lamp10Service, CompletionHandler completionHandler) {
            this.f16840a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16840a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16840a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp10Service$p0 */
    public interface C8885p0 {
        /* renamed from: a */
        void mo30504a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp10Service$q */
    class C8886q implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16841a;

        C8886q(Lamp10Service lamp10Service, CompletionHandler completionHandler) {
            this.f16841a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16841a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16841a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp10Service$q0 */
    public interface C8887q0 {
        /* renamed from: a */
        void mo30506a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp10Service$r */
    class C8888r implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16842a;

        C8888r(Lamp10Service lamp10Service, CompletionHandler completionHandler) {
            this.f16842a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16842a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16842a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp10Service$r0 */
    public interface C8889r0 {
        /* renamed from: a */
        void mo30508a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp10Service$s */
    class C8890s implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16843a;

        C8890s(Lamp10Service lamp10Service, CompletionHandler completionHandler) {
            this.f16843a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16843a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16843a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp10Service$s0 */
    public interface C8891s0 {
        /* renamed from: a */
        void mo30510a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp10Service$t */
    class C8892t implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16844a;

        C8892t(Lamp10Service lamp10Service, CompletionHandler completionHandler) {
            this.f16844a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16844a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16844a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp10Service$t0 */
    public interface C8893t0 {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp10Service$u */
    class C8894u implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16845a;

        C8894u(Lamp10Service lamp10Service, CompletionHandler completionHandler) {
            this.f16845a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16845a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16845a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp10Service$u0 */
    public interface C8895u0 {
        /* renamed from: a */
        void mo30514a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp10Service$v */
    class C8896v implements DeviceManipulator.PropertyChangedListener {

        /* renamed from: a */
        final /* synthetic */ C8871i1 f16846a;

        C8896v(Lamp10Service lamp10Service, C8871i1 i1Var) {
            this.f16846a = i1Var;
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:100:0x025a, code lost:
            if (r2.getProperty("Bright").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:101:0x025c, code lost:
            r0.f16846a.mo28231a((java.lang.Long) r2.getValue("Bright"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:102:0x0268, code lost:
            r0 = r18;
            r2 = r19;
            r1 = "Power";
         */
        /* JADX WARNING: Code restructure failed: missing block: B:103:0x0275, code lost:
            if (r2.getProperty(r1).isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:104:0x0277, code lost:
            r0.f16846a.mo28246p(com.yeelight.yeelib.device.xiaomi.Lamp10Service.C8868h1.valueOf((java.lang.String) r2.getValue(r1)));
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
        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0031, code lost:
            r3 = r17;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:0x00b1, code lost:
            r3 = r17;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:53:0x00ce, code lost:
            r2 = 65535;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:54:0x00cf, code lost:
            switch(r2) {
                case 0: goto L_0x0268;
                case 1: goto L_0x024e;
                case 2: goto L_0x0233;
                case 3: goto L_0x0219;
                case 4: goto L_0x01ff;
                case 5: goto L_0x01e5;
                case 6: goto L_0x01cb;
                case 7: goto L_0x01b0;
                case 8: goto L_0x0195;
                case 9: goto L_0x017a;
                case 10: goto L_0x015f;
                case 11: goto L_0x0144;
                case 12: goto L_0x0129;
                case 13: goto L_0x010c;
                case 14: goto L_0x00f1;
                case 15: goto L_0x00d6;
                default: goto L_0x00d2;
            };
         */
        /* JADX WARNING: Code restructure failed: missing block: B:55:0x00d2, code lost:
            r0 = r18;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:56:0x00d6, code lost:
            r2 = r19;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:57:0x00e0, code lost:
            if (r2.getProperty("NightTimeInfo").isValueValid() == false) goto L_0x00d2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:58:0x00e2, code lost:
            r4 = r18;
            r4.f16846a.mo28239i((java.lang.String) r2.getValue("NightTimeInfo"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:59:0x00f1, code lost:
            r4 = r18;
            r2 = r19;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:60:0x00fd, code lost:
            if (r2.getProperty(com.yeelight.yeelib.device.xiaomi.Lamp10Service.PROPERTY_IndicatorEnable).isValueValid() == false) goto L_0x024c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:61:0x00ff, code lost:
            r4.f16846a.mo28243m((java.lang.String) r2.getValue(com.yeelight.yeelib.device.xiaomi.Lamp10Service.PROPERTY_IndicatorEnable));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:62:0x010c, code lost:
            r4 = r18;
            r2 = r19;
            r9 = r16;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:63:0x011a, code lost:
            if (r2.getProperty(r9).isValueValid() == false) goto L_0x024c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:64:0x011c, code lost:
            r4.f16846a.mo28245o((java.lang.Long) r2.getValue(r9));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:65:0x0129, code lost:
            r4 = r18;
            r2 = r19;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:66:0x0135, code lost:
            if (r2.getProperty("onFromPower").isValueValid() == false) goto L_0x024c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:67:0x0137, code lost:
            r4.f16846a.mo28236f((java.lang.Long) r2.getValue("onFromPower"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:68:0x0144, code lost:
            r4 = r18;
            r2 = r19;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:69:0x0150, code lost:
            if (r2.getProperty("LanMode").isValueValid() == false) goto L_0x024c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:70:0x0152, code lost:
            r4.f16846a.mo28237g((java.lang.Long) r2.getValue("LanMode"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:71:0x015f, code lost:
            r4 = r18;
            r2 = r19;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:72:0x016b, code lost:
            if (r2.getProperty(r3).isValueValid() == false) goto L_0x024c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:73:0x016d, code lost:
            r4.f16846a.mo28235e((java.lang.String) r2.getValue(r3));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:74:0x017a, code lost:
            r4 = r18;
            r2 = r19;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:75:0x0186, code lost:
            if (r2.getProperty("SaveState").isValueValid() == false) goto L_0x024c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:76:0x0188, code lost:
            r4.f16846a.mo28234d((java.lang.Long) r2.getValue("SaveState"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:77:0x0195, code lost:
            r4 = r18;
            r2 = r19;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:78:0x01a1, code lost:
            if (r2.getProperty("DelayOff").isValueValid() == false) goto L_0x024c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:79:0x01a3, code lost:
            r4.f16846a.mo28232b((java.lang.Long) r2.getValue("DelayOff"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:80:0x01b0, code lost:
            r4 = r18;
            r2 = r19;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:81:0x01bc, code lost:
            if (r2.getProperty("Rgb").isValueValid() == false) goto L_0x024c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:82:0x01be, code lost:
            r4.f16846a.mo28240j((java.lang.Long) r2.getValue("Rgb"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:83:0x01cb, code lost:
            r4 = r18;
            r2 = r19;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:84:0x01d7, code lost:
            if (r2.getProperty("ColorMode").isValueValid() == false) goto L_0x024c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:85:0x01d9, code lost:
            r4.f16846a.mo28242l((java.lang.Long) r2.getValue("ColorMode"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:86:0x01e5, code lost:
            r4 = r18;
            r2 = r19;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:87:0x01f1, code lost:
            if (r2.getProperty("Flowing").isValueValid() == false) goto L_0x024c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:88:0x01f3, code lost:
            r4.f16846a.mo28233c((java.lang.Long) r2.getValue("Flowing"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:89:0x01ff, code lost:
            r4 = r18;
            r2 = r19;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:90:0x020b, code lost:
            if (r2.getProperty("Sat").isValueValid() == false) goto L_0x024c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:91:0x020d, code lost:
            r4.f16846a.mo28241k((java.lang.Long) r2.getValue("Sat"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:92:0x0219, code lost:
            r4 = r18;
            r2 = r19;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:93:0x0225, code lost:
            if (r2.getProperty("Hue").isValueValid() == false) goto L_0x024c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:94:0x0227, code lost:
            r4.f16846a.mo28244n((java.lang.Long) r2.getValue("Hue"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:95:0x0233, code lost:
            r4 = r18;
            r2 = r19;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:96:0x023f, code lost:
            if (r2.getProperty("Ct").isValueValid() == false) goto L_0x024c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:97:0x0241, code lost:
            r4.f16846a.mo28238h((java.lang.Long) r2.getValue("Ct"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:98:0x024c, code lost:
            r0 = r4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:99:0x024e, code lost:
            r0 = r18;
            r2 = r19;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onPropertyChanged(com.miot.common.device.invocation.PropertyInfo r19, java.lang.String r20) {
            /*
                r18 = this;
                r0 = r18
                r1 = r19
                r2 = r20
                int r3 = r20.hashCode()
                java.lang.String r4 = "Bright"
                java.lang.String r5 = "IndicatorEnable"
                java.lang.String r6 = "LanMode"
                java.lang.String r7 = "Flowing"
                java.lang.String r8 = "DelayOff"
                java.lang.String r9 = "Power"
                java.lang.String r10 = "onFromPower"
                java.lang.String r11 = "Sat"
                java.lang.String r12 = "Rgb"
                java.lang.String r13 = "Hue"
                java.lang.String r14 = "Ct"
                java.lang.String r15 = "ColorMode"
                java.lang.String r0 = "NightTimeInfo"
                java.lang.String r1 = "MusicEnable"
                r16 = r1
                java.lang.String r1 = "FlowParams"
                r17 = r1
                java.lang.String r1 = "SaveState"
                switch(r3) {
                    case -2117953292: goto L_0x00c3;
                    case -2002016140: goto L_0x00b8;
                    case -1787381784: goto L_0x00a5;
                    case -1331143373: goto L_0x009c;
                    case -310275194: goto L_0x0094;
                    case 2193: goto L_0x008c;
                    case 72920: goto L_0x0084;
                    case 82093: goto L_0x007c;
                    case 82886: goto L_0x0074;
                    case 35911772: goto L_0x006b;
                    case 77306085: goto L_0x0063;
                    case 880790796: goto L_0x005a;
                    case 898856916: goto L_0x0052;
                    case 1611821756: goto L_0x0048;
                    case 1750302802: goto L_0x003e;
                    case 1998035738: goto L_0x0035;
                    default: goto L_0x0031;
                }
            L_0x0031:
                r3 = r17
                goto L_0x00ce
            L_0x0035:
                boolean r2 = r2.equals(r4)
                if (r2 == 0) goto L_0x0031
                r2 = 1
                goto L_0x00b1
            L_0x003e:
                boolean r2 = r2.equals(r5)
                if (r2 == 0) goto L_0x0031
                r2 = 14
                goto L_0x00b1
            L_0x0048:
                boolean r2 = r2.equals(r6)
                if (r2 == 0) goto L_0x0031
                r2 = 11
                goto L_0x00b1
            L_0x0052:
                boolean r2 = r2.equals(r7)
                if (r2 == 0) goto L_0x0031
                r2 = 5
                goto L_0x00b1
            L_0x005a:
                boolean r2 = r2.equals(r8)
                if (r2 == 0) goto L_0x0031
                r2 = 8
                goto L_0x00b1
            L_0x0063:
                boolean r2 = r2.equals(r9)
                if (r2 == 0) goto L_0x0031
                r2 = 0
                goto L_0x00b1
            L_0x006b:
                boolean r2 = r2.equals(r10)
                if (r2 == 0) goto L_0x0031
                r2 = 12
                goto L_0x00b1
            L_0x0074:
                boolean r2 = r2.equals(r11)
                if (r2 == 0) goto L_0x0031
                r2 = 4
                goto L_0x00b1
            L_0x007c:
                boolean r2 = r2.equals(r12)
                if (r2 == 0) goto L_0x0031
                r2 = 7
                goto L_0x00b1
            L_0x0084:
                boolean r2 = r2.equals(r13)
                if (r2 == 0) goto L_0x0031
                r2 = 3
                goto L_0x00b1
            L_0x008c:
                boolean r2 = r2.equals(r14)
                if (r2 == 0) goto L_0x0031
                r2 = 2
                goto L_0x00b1
            L_0x0094:
                boolean r2 = r2.equals(r15)
                if (r2 == 0) goto L_0x0031
                r2 = 6
                goto L_0x00b1
            L_0x009c:
                boolean r2 = r2.equals(r0)
                if (r2 == 0) goto L_0x0031
                r2 = 15
                goto L_0x00b1
            L_0x00a5:
                r3 = r16
                boolean r2 = r2.equals(r3)
                if (r2 == 0) goto L_0x00b4
                r2 = 13
                r16 = r3
            L_0x00b1:
                r3 = r17
                goto L_0x00cf
            L_0x00b4:
                r16 = r3
                goto L_0x0031
            L_0x00b8:
                r3 = r17
                boolean r2 = r2.equals(r3)
                if (r2 == 0) goto L_0x00ce
                r2 = 10
                goto L_0x00cf
            L_0x00c3:
                r3 = r17
                boolean r2 = r2.equals(r1)
                if (r2 == 0) goto L_0x00ce
                r2 = 9
                goto L_0x00cf
            L_0x00ce:
                r2 = -1
            L_0x00cf:
                switch(r2) {
                    case 0: goto L_0x0268;
                    case 1: goto L_0x024e;
                    case 2: goto L_0x0233;
                    case 3: goto L_0x0219;
                    case 4: goto L_0x01ff;
                    case 5: goto L_0x01e5;
                    case 6: goto L_0x01cb;
                    case 7: goto L_0x01b0;
                    case 8: goto L_0x0195;
                    case 9: goto L_0x017a;
                    case 10: goto L_0x015f;
                    case 11: goto L_0x0144;
                    case 12: goto L_0x0129;
                    case 13: goto L_0x010c;
                    case 14: goto L_0x00f1;
                    case 15: goto L_0x00d6;
                    default: goto L_0x00d2;
                }
            L_0x00d2:
                r0 = r18
                goto L_0x0286
            L_0x00d6:
                r2 = r19
                com.miot.common.property.Property r1 = r2.getProperty(r0)
                boolean r1 = r1.isValueValid()
                if (r1 == 0) goto L_0x00d2
                java.lang.Object r0 = r2.getValue(r0)
                java.lang.String r0 = (java.lang.String) r0
                r4 = r18
                com.yeelight.yeelib.device.xiaomi.Lamp10Service$i1 r1 = r4.f16846a
                r1.mo28239i(r0)
                goto L_0x024c
            L_0x00f1:
                r4 = r18
                r2 = r19
                com.miot.common.property.Property r0 = r2.getProperty(r5)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x024c
                java.lang.Object r0 = r2.getValue(r5)
                java.lang.String r0 = (java.lang.String) r0
                com.yeelight.yeelib.device.xiaomi.Lamp10Service$i1 r1 = r4.f16846a
                r1.mo28243m(r0)
                goto L_0x024c
            L_0x010c:
                r4 = r18
                r2 = r19
                r9 = r16
                com.miot.common.property.Property r0 = r2.getProperty(r9)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x024c
                java.lang.Object r0 = r2.getValue(r9)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Lamp10Service$i1 r1 = r4.f16846a
                r1.mo28245o(r0)
                goto L_0x024c
            L_0x0129:
                r4 = r18
                r2 = r19
                com.miot.common.property.Property r0 = r2.getProperty(r10)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x024c
                java.lang.Object r0 = r2.getValue(r10)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Lamp10Service$i1 r1 = r4.f16846a
                r1.mo28236f(r0)
                goto L_0x024c
            L_0x0144:
                r4 = r18
                r2 = r19
                com.miot.common.property.Property r0 = r2.getProperty(r6)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x024c
                java.lang.Object r0 = r2.getValue(r6)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Lamp10Service$i1 r1 = r4.f16846a
                r1.mo28237g(r0)
                goto L_0x024c
            L_0x015f:
                r4 = r18
                r2 = r19
                com.miot.common.property.Property r0 = r2.getProperty(r3)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x024c
                java.lang.Object r0 = r2.getValue(r3)
                java.lang.String r0 = (java.lang.String) r0
                com.yeelight.yeelib.device.xiaomi.Lamp10Service$i1 r1 = r4.f16846a
                r1.mo28235e(r0)
                goto L_0x024c
            L_0x017a:
                r4 = r18
                r2 = r19
                com.miot.common.property.Property r0 = r2.getProperty(r1)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x024c
                java.lang.Object r0 = r2.getValue(r1)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Lamp10Service$i1 r1 = r4.f16846a
                r1.mo28234d(r0)
                goto L_0x024c
            L_0x0195:
                r4 = r18
                r2 = r19
                com.miot.common.property.Property r0 = r2.getProperty(r8)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x024c
                java.lang.Object r0 = r2.getValue(r8)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Lamp10Service$i1 r1 = r4.f16846a
                r1.mo28232b(r0)
                goto L_0x024c
            L_0x01b0:
                r4 = r18
                r2 = r19
                com.miot.common.property.Property r0 = r2.getProperty(r12)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x024c
                java.lang.Object r0 = r2.getValue(r12)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Lamp10Service$i1 r1 = r4.f16846a
                r1.mo28240j(r0)
                goto L_0x024c
            L_0x01cb:
                r4 = r18
                r2 = r19
                com.miot.common.property.Property r0 = r2.getProperty(r15)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x024c
                java.lang.Object r0 = r2.getValue(r15)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Lamp10Service$i1 r1 = r4.f16846a
                r1.mo28242l(r0)
                goto L_0x024c
            L_0x01e5:
                r4 = r18
                r2 = r19
                com.miot.common.property.Property r0 = r2.getProperty(r7)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x024c
                java.lang.Object r0 = r2.getValue(r7)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Lamp10Service$i1 r1 = r4.f16846a
                r1.mo28233c(r0)
                goto L_0x024c
            L_0x01ff:
                r4 = r18
                r2 = r19
                com.miot.common.property.Property r0 = r2.getProperty(r11)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x024c
                java.lang.Object r0 = r2.getValue(r11)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Lamp10Service$i1 r1 = r4.f16846a
                r1.mo28241k(r0)
                goto L_0x024c
            L_0x0219:
                r4 = r18
                r2 = r19
                com.miot.common.property.Property r0 = r2.getProperty(r13)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x024c
                java.lang.Object r0 = r2.getValue(r13)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Lamp10Service$i1 r1 = r4.f16846a
                r1.mo28244n(r0)
                goto L_0x024c
            L_0x0233:
                r4 = r18
                r2 = r19
                com.miot.common.property.Property r0 = r2.getProperty(r14)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x024c
                java.lang.Object r0 = r2.getValue(r14)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.Lamp10Service$i1 r1 = r4.f16846a
                r1.mo28238h(r0)
            L_0x024c:
                r0 = r4
                goto L_0x0286
            L_0x024e:
                r0 = r18
                r2 = r19
                com.miot.common.property.Property r1 = r2.getProperty(r4)
                boolean r1 = r1.isValueValid()
                if (r1 == 0) goto L_0x0286
                java.lang.Object r1 = r2.getValue(r4)
                java.lang.Long r1 = (java.lang.Long) r1
                com.yeelight.yeelib.device.xiaomi.Lamp10Service$i1 r2 = r0.f16846a
                r2.mo28231a(r1)
                goto L_0x0286
            L_0x0268:
                r0 = r18
                r2 = r19
                r1 = r9
                com.miot.common.property.Property r3 = r2.getProperty(r1)
                boolean r3 = r3.isValueValid()
                if (r3 == 0) goto L_0x0286
                java.lang.Object r1 = r2.getValue(r1)
                java.lang.String r1 = (java.lang.String) r1
                com.yeelight.yeelib.device.xiaomi.Lamp10Service$h1 r1 = com.yeelight.yeelib.device.xiaomi.Lamp10Service.C8868h1.valueOf(r1)
                com.yeelight.yeelib.device.xiaomi.Lamp10Service$i1 r2 = r0.f16846a
                r2.mo28246p(r1)
            L_0x0286:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.xiaomi.Lamp10Service.C8896v.onPropertyChanged(com.miot.common.device.invocation.PropertyInfo, java.lang.String):void");
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp10Service$v0 */
    public interface C8897v0 {
        /* renamed from: a */
        void mo30516a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp10Service$w */
    class C8898w implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16847a;

        C8898w(Lamp10Service lamp10Service, CompletionHandler completionHandler) {
            this.f16847a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16847a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16847a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp10Service$w0 */
    public interface C8899w0 {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp10Service$x */
    class C8900x implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16848a;

        C8900x(Lamp10Service lamp10Service, CompletionHandler completionHandler) {
            this.f16848a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16848a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16848a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp10Service$x0 */
    public interface C8901x0 {
        /* renamed from: a */
        void mo30520a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp10Service$y */
    class C8902y implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16849a;

        C8902y(Lamp10Service lamp10Service, CompletionHandler completionHandler) {
            this.f16849a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16849a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16849a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp10Service$y0 */
    public interface C8903y0 {
        /* renamed from: a */
        void mo30522a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp10Service$z */
    class C8904z implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16850a;

        C8904z(Lamp10Service lamp10Service, CompletionHandler completionHandler) {
            this.f16850a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16850a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16850a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Lamp10Service$z0 */
    public interface C8905z0 {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    public Lamp10Service(AbstractDevice abstractDevice) {
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
                MiotManager.getDeviceManipulator().invoke(create, new C8900x(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8884p(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8880n(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8858e0(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getBright(C8885p0 p0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Bright"), new C8873j0(this, p0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getColorMode(C8887q0 q0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "ColorMode"), new C8851c(this, q0Var));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8855d0(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getCt(C8889r0 r0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Ct"), new C8875k0(this, r0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getDelayOff(C8891s0 s0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "DelayOff"), new C8857e(this, s0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowParams(C8893t0 t0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "FlowParams"), new C8863g(this, t0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowing(C8895u0 u0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Flowing"), new C8848b(this, u0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getHue(C8897v0 v0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Hue"), new C8879m0(this, v0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getIndicatorEnable(C8899w0 w0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), PROPERTY_IndicatorEnable), new C8876l(this, w0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getLanMode(C8901x0 x0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "LanMode"), new C8866h(this, x0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getMusicEnable(C8903y0 y0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "MusicEnable"), new C8872j(this, y0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getNightTimeInfo(C8905z0 z0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "NightTimeInfo"), new C8878m(this, z0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getPower(C8847a1 a1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Power"), new C8870i0(this, a1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getProperties(C8850b1 b1Var) {
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
            create.addProperty(getService().getProperty(PROPERTY_IndicatorEnable));
            create.addProperty(getService().getProperty("NightTimeInfo"));
            MiotManager.getDeviceManipulator().readProperty(create, new C8867h0(this, b1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getRgb(C8853c1 c1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Rgb"), new C8854d(this, c1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getSat(C8856d1 d1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Sat"), new C8845a(this, d1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getSaveState(C8859e1 e1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "SaveState"), new C8860f(this, e1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getTemperature(C8862f1 f1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Temperature"), new C8877l0(this, f1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getonFromPower(C8865g1 g1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "onFromPower"), new C8869i(this, g1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void openWithMode(C8868h1 h1Var, C8883o0 o0Var, Long l, Long l2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "openWithMode");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("Power", h1Var.toString())) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Effect", o0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Duration", l)) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("Mode", l2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C8890s(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8886q(this, completionHandler));
                return;
            }
            throw new MiotException("actionInfo is null");
        }
        throw new MiotException("device not configurated connection");
    }

    public void sendCmd(C8881n0 n0Var, String str, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "sendCmd");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("CmdKey", n0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("CmdValue", str)) {
                MiotManager.getDeviceManipulator().invoke(create, new C8904z(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setBright(Long l, C8883o0 o0Var, Long l2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setBright");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("Bright", l)) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Effect", o0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("Duration", l2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C8882o(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setCt(Long l, C8883o0 o0Var, Long l2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setCt");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("Ct", l)) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Effect", o0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("Duration", l2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C8852c0(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8902y(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8849b0(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8846a0(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setPower(C8868h1 h1Var, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setPower");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (create.setArgumentValue("Power", h1Var.toString())) {
                MiotManager.getDeviceManipulator().invoke(create, new C8892t(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setRgb(Long l, C8883o0 o0Var, Long l2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setRgb");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("Rgb", l)) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Effect", o0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("Duration", l2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C8894u(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8888r(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8861f0(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void subscribeNotifications(CompletionHandler completionHandler, C8871i1 i1Var) {
        if (completionHandler == null) {
            throw new IllegalArgumentException("handler is null");
        } else if (i1Var != null) {
            PropertyInfo create = PropertyInfoFactory.create(getService());
            for (Property next : getService().getProperties()) {
                if (next.getDefinition().isNotifiable()) {
                    create.addProperty(next);
                }
            }
            MiotManager.getDeviceManipulator().addPropertyChangedListener(create, new C8874k(this, completionHandler), new C8896v(this, i1Var));
        } else {
            throw new IllegalArgumentException("listener is null");
        }
    }

    public void toggle(CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "toggle");
            if (create != null) {
                MiotManager.getDeviceManipulator().invoke(create, new C8898w(this, completionHandler));
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
            MiotManager.getDeviceManipulator().removePropertyChangedListener(create, new C8864g0(this, completionHandler));
            return;
        }
        throw new IllegalArgumentException("handler is null");
    }
}
