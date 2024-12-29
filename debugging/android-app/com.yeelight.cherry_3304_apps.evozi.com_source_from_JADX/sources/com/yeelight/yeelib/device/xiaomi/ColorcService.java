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

public class ColorcService extends AbstractService {
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
    public static final String ACTION_setScene2 = "setScene2";
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
    public static final String PROPERTY_TransIntervalDflt = "TransIntervalDflt";
    public static final String PROPERTY_onFromPower = "onFromPower";
    private static final String TAG = "ColorcService";
    private AbstractDevice mDevice = null;

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorcService$a */
    class C8703a implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8705a1 f16660a;

        C8703a(ColorcService colorcService, C8705a1 a1Var) {
            this.f16660a = a1Var;
        }

        public void onFailed(int i, String str) {
            this.f16660a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Sat");
            if (property.isValueValid()) {
                this.f16660a.mo30332a((Long) propertyInfo.getValue("Sat"));
                return;
            }
            C8705a1 a1Var = this.f16660a;
            a1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorcService$a0 */
    class C8704a0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16661a;

        C8704a0(ColorcService colorcService, CompletionHandler completionHandler) {
            this.f16661a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16661a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16661a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorcService$a1 */
    public interface C8705a1 {
        /* renamed from: a */
        void mo30332a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorcService$b */
    class C8706b implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8749t0 f16662a;

        C8706b(ColorcService colorcService, C8749t0 t0Var) {
            this.f16662a = t0Var;
        }

        public void onFailed(int i, String str) {
            this.f16662a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Flowing");
            if (property.isValueValid()) {
                this.f16662a.mo30352a((Long) propertyInfo.getValue("Flowing"));
                return;
            }
            C8749t0 t0Var = this.f16662a;
            t0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorcService$b0 */
    class C8707b0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16663a;

        C8707b0(ColorcService colorcService, CompletionHandler completionHandler) {
            this.f16663a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16663a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16663a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorcService$b1 */
    public interface C8708b1 {
        /* renamed from: a */
        void mo30334a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorcService$c */
    class C8709c implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8741p0 f16664a;

        C8709c(ColorcService colorcService, C8741p0 p0Var) {
            this.f16664a = p0Var;
        }

        public void onFailed(int i, String str) {
            this.f16664a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("ColorMode");
            if (property.isValueValid()) {
                this.f16664a.mo30344a((Long) propertyInfo.getValue("ColorMode"));
                return;
            }
            C8741p0 p0Var = this.f16664a;
            p0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorcService$c0 */
    class C8710c0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16665a;

        C8710c0(ColorcService colorcService, CompletionHandler completionHandler) {
            this.f16665a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16665a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16665a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorcService$c1 */
    public interface C8711c1 {
        /* renamed from: a */
        void mo30336a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorcService$d */
    class C8712d implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8761z0 f16666a;

        C8712d(ColorcService colorcService, C8761z0 z0Var) {
            this.f16666a = z0Var;
        }

        public void onFailed(int i, String str) {
            this.f16666a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Rgb");
            if (property.isValueValid()) {
                this.f16666a.mo30362a((Long) propertyInfo.getValue("Rgb"));
                return;
            }
            C8761z0 z0Var = this.f16666a;
            z0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorcService$d0 */
    class C8713d0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16667a;

        C8713d0(ColorcService colorcService, CompletionHandler completionHandler) {
            this.f16667a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16667a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16667a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorcService$d1 */
    public interface C8714d1 {
        /* renamed from: a */
        void mo30338a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorcService$e */
    class C8715e implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8745r0 f16668a;

        C8715e(ColorcService colorcService, C8745r0 r0Var) {
            this.f16668a = r0Var;
        }

        public void onFailed(int i, String str) {
            this.f16668a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("DelayOff");
            if (property.isValueValid()) {
                this.f16668a.mo30348a((Long) propertyInfo.getValue("DelayOff"));
                return;
            }
            C8745r0 r0Var = this.f16668a;
            r0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorcService$e0 */
    class C8716e0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16669a;

        C8716e0(ColorcService colorcService, CompletionHandler completionHandler) {
            this.f16669a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16669a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16669a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorcService$e1 */
    public interface C8717e1 {
        /* renamed from: a */
        void mo30340a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorcService$f */
    class C8718f implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8708b1 f16670a;

        C8718f(ColorcService colorcService, C8708b1 b1Var) {
            this.f16670a = b1Var;
        }

        public void onFailed(int i, String str) {
            this.f16670a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("SaveState");
            if (property.isValueValid()) {
                this.f16670a.mo30334a((Long) propertyInfo.getValue("SaveState"));
                return;
            }
            C8708b1 b1Var = this.f16670a;
            b1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorcService$f0 */
    class C8719f0 implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16671a;

        C8719f0(ColorcService colorcService, CompletionHandler completionHandler) {
            this.f16671a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16671a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f16671a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorcService$f1 */
    public enum C8720f1 {
        undefined,
        on,
        off
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorcService$g */
    class C8721g implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8747s0 f16676a;

        C8721g(ColorcService colorcService, C8747s0 s0Var) {
            this.f16676a = s0Var;
        }

        public void onFailed(int i, String str) {
            this.f16676a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("FlowParams");
            if (property.isValueValid()) {
                this.f16676a.onSucceed((String) propertyInfo.getValue("FlowParams"));
                return;
            }
            C8747s0 s0Var = this.f16676a;
            s0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorcService$g0 */
    class C8722g0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8759y0 f16677a;

        C8722g0(ColorcService colorcService, C8759y0 y0Var) {
            this.f16677a = y0Var;
        }

        public void onFailed(int i, String str) {
            this.f16677a.onFailed(i, str);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.Long} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onSucceed(com.miot.common.device.invocation.PropertyInfo r22) {
            /*
                r21 = this;
                r0 = r22
                java.lang.String r1 = "Power"
                com.miot.common.property.Property r1 = r0.getProperty(r1)
                boolean r2 = r1.isValueValid()
                r3 = 0
                if (r2 == 0) goto L_0x001b
                java.lang.Object r1 = r1.getValue()
                java.lang.String r1 = (java.lang.String) r1
                com.yeelight.yeelib.device.xiaomi.ColorcService$f1 r1 = com.yeelight.yeelib.device.xiaomi.ColorcService.C8720f1.valueOf(r1)
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
                java.lang.String r1 = "TransIntervalDflt"
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
                java.lang.String r1 = "MusicEnable"
                com.miot.common.property.Property r0 = r0.getProperty(r1)
                boolean r1 = r0.isValueValid()
                if (r1 == 0) goto L_0x015d
                java.lang.Object r0 = r0.getValue()
                r3 = r0
                java.lang.Long r3 = (java.lang.Long) r3
            L_0x015d:
                r0 = r21
                r20 = r3
                com.yeelight.yeelib.device.xiaomi.ColorcService$y0 r4 = r0.f16677a
                r4.mo28726a(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.xiaomi.ColorcService.C8722g0.onSucceed(com.miot.common.device.invocation.PropertyInfo):void");
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorcService$g1 */
    public interface C8723g1 {
        /* renamed from: a */
        void mo28728a(Long l);

        /* renamed from: b */
        void mo28729b(Long l);

        /* renamed from: c */
        void mo28730c(Long l);

        /* renamed from: d */
        void mo28731d(Long l);

        /* renamed from: e */
        void mo28732e(String str);

        /* renamed from: f */
        void mo28733f(Long l);

        /* renamed from: g */
        void mo28734g(Long l);

        /* renamed from: h */
        void mo28735h(Long l);

        /* renamed from: i */
        void mo28736i(C8720f1 f1Var);

        /* renamed from: j */
        void mo28737j(Long l);

        /* renamed from: k */
        void mo28738k(Long l);

        /* renamed from: l */
        void mo28739l(Long l);

        /* renamed from: n */
        void mo28740n(Long l);

        /* renamed from: o */
        void mo28741o(Long l);

        /* renamed from: q */
        void mo28742q(Long l);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorcService$h */
    class C8724h implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8753v0 f16678a;

        C8724h(ColorcService colorcService, C8753v0 v0Var) {
            this.f16678a = v0Var;
        }

        public void onFailed(int i, String str) {
            this.f16678a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("LanMode");
            if (property.isValueValid()) {
                this.f16678a.mo30356a((Long) propertyInfo.getValue("LanMode"));
                return;
            }
            C8753v0 v0Var = this.f16678a;
            v0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorcService$h0 */
    class C8725h0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8757x0 f16679a;

        C8725h0(ColorcService colorcService, C8757x0 x0Var) {
            this.f16679a = x0Var;
        }

        public void onFailed(int i, String str) {
            this.f16679a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Power");
            if (property.isValueValid()) {
                this.f16679a.mo30360a(C8720f1.valueOf((String) propertyInfo.getValue("Power")));
                return;
            }
            C8757x0 x0Var = this.f16679a;
            x0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorcService$i */
    class C8726i implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8717e1 f16680a;

        C8726i(ColorcService colorcService, C8717e1 e1Var) {
            this.f16680a = e1Var;
        }

        public void onFailed(int i, String str) {
            this.f16680a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("onFromPower");
            if (property.isValueValid()) {
                this.f16680a.mo30340a((Long) propertyInfo.getValue("onFromPower"));
                return;
            }
            C8717e1 e1Var = this.f16680a;
            e1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorcService$i0 */
    class C8727i0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8739o0 f16681a;

        C8727i0(ColorcService colorcService, C8739o0 o0Var) {
            this.f16681a = o0Var;
        }

        public void onFailed(int i, String str) {
            this.f16681a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Bright");
            if (property.isValueValid()) {
                this.f16681a.mo30342a((Long) propertyInfo.getValue("Bright"));
                return;
            }
            C8739o0 o0Var = this.f16681a;
            o0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorcService$j */
    class C8728j implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8714d1 f16682a;

        C8728j(ColorcService colorcService, C8714d1 d1Var) {
            this.f16682a = d1Var;
        }

        public void onFailed(int i, String str) {
            this.f16682a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("TransIntervalDflt");
            if (property.isValueValid()) {
                this.f16682a.mo30338a((Long) propertyInfo.getValue("TransIntervalDflt"));
                return;
            }
            C8714d1 d1Var = this.f16682a;
            d1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorcService$j0 */
    class C8729j0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8743q0 f16683a;

        C8729j0(ColorcService colorcService, C8743q0 q0Var) {
            this.f16683a = q0Var;
        }

        public void onFailed(int i, String str) {
            this.f16683a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Ct");
            if (property.isValueValid()) {
                this.f16683a.mo30346a((Long) propertyInfo.getValue("Ct"));
                return;
            }
            C8743q0 q0Var = this.f16683a;
            q0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorcService$k */
    class C8730k implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16684a;

        C8730k(ColorcService colorcService, CompletionHandler completionHandler) {
            this.f16684a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16684a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f16684a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorcService$k0 */
    class C8731k0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8711c1 f16685a;

        C8731k0(ColorcService colorcService, C8711c1 c1Var) {
            this.f16685a = c1Var;
        }

        public void onFailed(int i, String str) {
            this.f16685a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Temperature");
            if (property.isValueValid()) {
                this.f16685a.mo30336a((Long) propertyInfo.getValue("Temperature"));
                return;
            }
            C8711c1 c1Var = this.f16685a;
            c1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorcService$l */
    class C8732l implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8755w0 f16686a;

        C8732l(ColorcService colorcService, C8755w0 w0Var) {
            this.f16686a = w0Var;
        }

        public void onFailed(int i, String str) {
            this.f16686a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("MusicEnable");
            if (property.isValueValid()) {
                this.f16686a.mo30358a((Long) propertyInfo.getValue("MusicEnable"));
                return;
            }
            C8755w0 w0Var = this.f16686a;
            w0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorcService$l0 */
    class C8733l0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8751u0 f16687a;

        C8733l0(ColorcService colorcService, C8751u0 u0Var) {
            this.f16687a = u0Var;
        }

        public void onFailed(int i, String str) {
            this.f16687a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Hue");
            if (property.isValueValid()) {
                this.f16687a.mo30354a((Long) propertyInfo.getValue("Hue"));
                return;
            }
            C8751u0 u0Var = this.f16687a;
            u0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorcService$m */
    class C8734m implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16688a;

        C8734m(ColorcService colorcService, CompletionHandler completionHandler) {
            this.f16688a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16688a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16688a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorcService$m0 */
    public enum C8735m0 {
        undefined,
        cfg_pomodoro,
        cfg_lan_ctrl,
        cfg_save_state,
        cfg_init_power,
        trans_default
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorcService$n */
    class C8736n implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16696a;

        C8736n(ColorcService colorcService, CompletionHandler completionHandler) {
            this.f16696a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16696a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16696a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorcService$n0 */
    public enum C8737n0 {
        undefined,
        smooth,
        sudden
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorcService$o */
    class C8738o implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16701a;

        C8738o(ColorcService colorcService, CompletionHandler completionHandler) {
            this.f16701a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16701a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16701a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorcService$o0 */
    public interface C8739o0 {
        /* renamed from: a */
        void mo30342a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorcService$p */
    class C8740p implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16702a;

        C8740p(ColorcService colorcService, CompletionHandler completionHandler) {
            this.f16702a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16702a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16702a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorcService$p0 */
    public interface C8741p0 {
        /* renamed from: a */
        void mo30344a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorcService$q */
    class C8742q implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16703a;

        C8742q(ColorcService colorcService, CompletionHandler completionHandler) {
            this.f16703a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16703a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16703a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorcService$q0 */
    public interface C8743q0 {
        /* renamed from: a */
        void mo30346a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorcService$r */
    class C8744r implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16704a;

        C8744r(ColorcService colorcService, CompletionHandler completionHandler) {
            this.f16704a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16704a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16704a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorcService$r0 */
    public interface C8745r0 {
        /* renamed from: a */
        void mo30348a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorcService$s */
    class C8746s implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16705a;

        C8746s(ColorcService colorcService, CompletionHandler completionHandler) {
            this.f16705a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16705a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16705a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorcService$s0 */
    public interface C8747s0 {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorcService$t */
    class C8748t implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16706a;

        C8748t(ColorcService colorcService, CompletionHandler completionHandler) {
            this.f16706a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16706a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16706a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorcService$t0 */
    public interface C8749t0 {
        /* renamed from: a */
        void mo30352a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorcService$u */
    class C8750u implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16707a;

        C8750u(ColorcService colorcService, CompletionHandler completionHandler) {
            this.f16707a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16707a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16707a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorcService$u0 */
    public interface C8751u0 {
        /* renamed from: a */
        void mo30354a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorcService$v */
    class C8752v implements DeviceManipulator.PropertyChangedListener {

        /* renamed from: a */
        final /* synthetic */ C8723g1 f16708a;

        C8752v(ColorcService colorcService, C8723g1 g1Var) {
            this.f16708a = g1Var;
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:100:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:101:?, code lost:
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
                case 0: goto L_0x0235;
                case 1: goto L_0x021a;
                case 2: goto L_0x0200;
                case 3: goto L_0x01e6;
                case 4: goto L_0x01cc;
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
            r0 = r17;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:52:0x00bf, code lost:
            r2 = r18;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:53:0x00c9, code lost:
            if (r2.getProperty("MusicEnable").isValueValid() == false) goto L_0x00bb;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:54:0x00cb, code lost:
            r8 = r17;
            r8.f16708a.mo28741o((java.lang.Long) r2.getValue("MusicEnable"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:55:0x00da, code lost:
            r8 = r17;
            r2 = r18;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:56:0x00e6, code lost:
            if (r2.getProperty("TransIntervalDflt").isValueValid() == false) goto L_0x0233;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:57:0x00e8, code lost:
            r8.f16708a.mo28742q((java.lang.Long) r2.getValue("TransIntervalDflt"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:58:0x00f5, code lost:
            r8 = r17;
            r2 = r18;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:59:0x0101, code lost:
            if (r2.getProperty("onFromPower").isValueValid() == false) goto L_0x0233;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:60:0x0103, code lost:
            r8.f16708a.mo28733f((java.lang.Long) r2.getValue("onFromPower"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:61:0x0110, code lost:
            r8 = r17;
            r2 = r18;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:62:0x011c, code lost:
            if (r2.getProperty("LanMode").isValueValid() == false) goto L_0x0233;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:63:0x011e, code lost:
            r8.f16708a.mo28734g((java.lang.Long) r2.getValue("LanMode"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:64:0x012b, code lost:
            r8 = r17;
            r2 = r18;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:65:0x0137, code lost:
            if (r2.getProperty(r3).isValueValid() == false) goto L_0x0233;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:66:0x0139, code lost:
            r8.f16708a.mo28732e((java.lang.String) r2.getValue(r3));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:67:0x0146, code lost:
            r8 = r17;
            r2 = r18;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:68:0x0152, code lost:
            if (r2.getProperty("SaveState").isValueValid() == false) goto L_0x0233;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:69:0x0154, code lost:
            r8.f16708a.mo28731d((java.lang.Long) r2.getValue("SaveState"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:70:0x0161, code lost:
            r8 = r17;
            r2 = r18;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:71:0x016d, code lost:
            if (r2.getProperty("DelayOff").isValueValid() == false) goto L_0x0233;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:72:0x016f, code lost:
            r8.f16708a.mo28729b((java.lang.Long) r2.getValue("DelayOff"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:73:0x017c, code lost:
            r8 = r17;
            r2 = r18;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:74:0x0188, code lost:
            if (r2.getProperty("Rgb").isValueValid() == false) goto L_0x0233;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:75:0x018a, code lost:
            r8.f16708a.mo28737j((java.lang.Long) r2.getValue("Rgb"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:76:0x0197, code lost:
            r8 = r17;
            r2 = r18;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:77:0x01a3, code lost:
            if (r2.getProperty("ColorMode").isValueValid() == false) goto L_0x0233;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:78:0x01a5, code lost:
            r8.f16708a.mo28739l((java.lang.Long) r2.getValue("ColorMode"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:79:0x01b2, code lost:
            r8 = r17;
            r2 = r18;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:80:0x01be, code lost:
            if (r2.getProperty("Flowing").isValueValid() == false) goto L_0x0233;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:81:0x01c0, code lost:
            r8.f16708a.mo28730c((java.lang.Long) r2.getValue("Flowing"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:82:0x01cc, code lost:
            r8 = r17;
            r2 = r18;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:83:0x01d8, code lost:
            if (r2.getProperty("Sat").isValueValid() == false) goto L_0x0233;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:84:0x01da, code lost:
            r8.f16708a.mo28738k((java.lang.Long) r2.getValue("Sat"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:85:0x01e6, code lost:
            r8 = r17;
            r2 = r18;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:86:0x01f2, code lost:
            if (r2.getProperty("Hue").isValueValid() == false) goto L_0x0233;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:87:0x01f4, code lost:
            r8.f16708a.mo28740n((java.lang.Long) r2.getValue("Hue"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:88:0x0200, code lost:
            r8 = r17;
            r2 = r18;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:89:0x020c, code lost:
            if (r2.getProperty("Ct").isValueValid() == false) goto L_0x0233;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:90:0x020e, code lost:
            r8.f16708a.mo28735h((java.lang.Long) r2.getValue("Ct"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:91:0x021a, code lost:
            r8 = r17;
            r2 = r18;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:92:0x0226, code lost:
            if (r2.getProperty("Bright").isValueValid() == false) goto L_0x0233;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:93:0x0228, code lost:
            r8.f16708a.mo28728a((java.lang.Long) r2.getValue("Bright"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:94:0x0233, code lost:
            r0 = r8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:95:0x0235, code lost:
            r0 = r17;
            r2 = r18;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:96:0x0241, code lost:
            if (r2.getProperty("Power").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:97:0x0243, code lost:
            r0.f16708a.mo28736i(com.yeelight.yeelib.device.xiaomi.ColorcService.C8720f1.valueOf((java.lang.String) r2.getValue("Power")));
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
                java.lang.String r8 = "Power"
                java.lang.String r9 = "onFromPower"
                java.lang.String r10 = "Sat"
                java.lang.String r11 = "Rgb"
                java.lang.String r12 = "Hue"
                java.lang.String r13 = "Ct"
                java.lang.String r14 = "ColorMode"
                java.lang.String r15 = "TransIntervalDflt"
                java.lang.String r0 = "MusicEnable"
                java.lang.String r1 = "FlowParams"
                r16 = r1
                java.lang.String r1 = "SaveState"
                switch(r3) {
                    case -2117953292: goto L_0x00ac;
                    case -2002016140: goto L_0x00a1;
                    case -1787381784: goto L_0x0096;
                    case -718325097: goto L_0x008d;
                    case -310275194: goto L_0x0085;
                    case 2193: goto L_0x007d;
                    case 72920: goto L_0x0075;
                    case 82093: goto L_0x006d;
                    case 82886: goto L_0x0065;
                    case 35911772: goto L_0x005c;
                    case 77306085: goto L_0x0054;
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
                r2 = 0
                goto L_0x009e
            L_0x005c:
                boolean r2 = r2.equals(r9)
                if (r2 == 0) goto L_0x002d
                r2 = 12
                goto L_0x009e
            L_0x0065:
                boolean r2 = r2.equals(r10)
                if (r2 == 0) goto L_0x002d
                r2 = 4
                goto L_0x009e
            L_0x006d:
                boolean r2 = r2.equals(r11)
                if (r2 == 0) goto L_0x002d
                r2 = 7
                goto L_0x009e
            L_0x0075:
                boolean r2 = r2.equals(r12)
                if (r2 == 0) goto L_0x002d
                r2 = 3
                goto L_0x009e
            L_0x007d:
                boolean r2 = r2.equals(r13)
                if (r2 == 0) goto L_0x002d
                r2 = 2
                goto L_0x009e
            L_0x0085:
                boolean r2 = r2.equals(r14)
                if (r2 == 0) goto L_0x002d
                r2 = 6
                goto L_0x009e
            L_0x008d:
                boolean r2 = r2.equals(r15)
                if (r2 == 0) goto L_0x002d
                r2 = 13
                goto L_0x009e
            L_0x0096:
                boolean r2 = r2.equals(r0)
                if (r2 == 0) goto L_0x002d
                r2 = 14
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
                    case 0: goto L_0x0235;
                    case 1: goto L_0x021a;
                    case 2: goto L_0x0200;
                    case 3: goto L_0x01e6;
                    case 4: goto L_0x01cc;
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
                r0 = r17
                goto L_0x0252
            L_0x00bf:
                r2 = r18
                com.miot.common.property.Property r1 = r2.getProperty(r0)
                boolean r1 = r1.isValueValid()
                if (r1 == 0) goto L_0x00bb
                java.lang.Object r0 = r2.getValue(r0)
                java.lang.Long r0 = (java.lang.Long) r0
                r8 = r17
                com.yeelight.yeelib.device.xiaomi.ColorcService$g1 r1 = r8.f16708a
                r1.mo28741o(r0)
                goto L_0x0233
            L_0x00da:
                r8 = r17
                r2 = r18
                com.miot.common.property.Property r0 = r2.getProperty(r15)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0233
                java.lang.Object r0 = r2.getValue(r15)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.ColorcService$g1 r1 = r8.f16708a
                r1.mo28742q(r0)
                goto L_0x0233
            L_0x00f5:
                r8 = r17
                r2 = r18
                com.miot.common.property.Property r0 = r2.getProperty(r9)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0233
                java.lang.Object r0 = r2.getValue(r9)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.ColorcService$g1 r1 = r8.f16708a
                r1.mo28733f(r0)
                goto L_0x0233
            L_0x0110:
                r8 = r17
                r2 = r18
                com.miot.common.property.Property r0 = r2.getProperty(r5)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0233
                java.lang.Object r0 = r2.getValue(r5)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.ColorcService$g1 r1 = r8.f16708a
                r1.mo28734g(r0)
                goto L_0x0233
            L_0x012b:
                r8 = r17
                r2 = r18
                com.miot.common.property.Property r0 = r2.getProperty(r3)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0233
                java.lang.Object r0 = r2.getValue(r3)
                java.lang.String r0 = (java.lang.String) r0
                com.yeelight.yeelib.device.xiaomi.ColorcService$g1 r1 = r8.f16708a
                r1.mo28732e(r0)
                goto L_0x0233
            L_0x0146:
                r8 = r17
                r2 = r18
                com.miot.common.property.Property r0 = r2.getProperty(r1)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0233
                java.lang.Object r0 = r2.getValue(r1)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.ColorcService$g1 r1 = r8.f16708a
                r1.mo28731d(r0)
                goto L_0x0233
            L_0x0161:
                r8 = r17
                r2 = r18
                com.miot.common.property.Property r0 = r2.getProperty(r7)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0233
                java.lang.Object r0 = r2.getValue(r7)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.ColorcService$g1 r1 = r8.f16708a
                r1.mo28729b(r0)
                goto L_0x0233
            L_0x017c:
                r8 = r17
                r2 = r18
                com.miot.common.property.Property r0 = r2.getProperty(r11)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0233
                java.lang.Object r0 = r2.getValue(r11)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.ColorcService$g1 r1 = r8.f16708a
                r1.mo28737j(r0)
                goto L_0x0233
            L_0x0197:
                r8 = r17
                r2 = r18
                com.miot.common.property.Property r0 = r2.getProperty(r14)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0233
                java.lang.Object r0 = r2.getValue(r14)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.ColorcService$g1 r1 = r8.f16708a
                r1.mo28739l(r0)
                goto L_0x0233
            L_0x01b2:
                r8 = r17
                r2 = r18
                com.miot.common.property.Property r0 = r2.getProperty(r6)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0233
                java.lang.Object r0 = r2.getValue(r6)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.ColorcService$g1 r1 = r8.f16708a
                r1.mo28730c(r0)
                goto L_0x0233
            L_0x01cc:
                r8 = r17
                r2 = r18
                com.miot.common.property.Property r0 = r2.getProperty(r10)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0233
                java.lang.Object r0 = r2.getValue(r10)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.ColorcService$g1 r1 = r8.f16708a
                r1.mo28738k(r0)
                goto L_0x0233
            L_0x01e6:
                r8 = r17
                r2 = r18
                com.miot.common.property.Property r0 = r2.getProperty(r12)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0233
                java.lang.Object r0 = r2.getValue(r12)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.ColorcService$g1 r1 = r8.f16708a
                r1.mo28740n(r0)
                goto L_0x0233
            L_0x0200:
                r8 = r17
                r2 = r18
                com.miot.common.property.Property r0 = r2.getProperty(r13)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0233
                java.lang.Object r0 = r2.getValue(r13)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.ColorcService$g1 r1 = r8.f16708a
                r1.mo28735h(r0)
                goto L_0x0233
            L_0x021a:
                r8 = r17
                r2 = r18
                com.miot.common.property.Property r0 = r2.getProperty(r4)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0233
                java.lang.Object r0 = r2.getValue(r4)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.ColorcService$g1 r1 = r8.f16708a
                r1.mo28728a(r0)
            L_0x0233:
                r0 = r8
                goto L_0x0252
            L_0x0235:
                r0 = r17
                r2 = r18
                com.miot.common.property.Property r1 = r2.getProperty(r8)
                boolean r1 = r1.isValueValid()
                if (r1 == 0) goto L_0x0252
                java.lang.Object r1 = r2.getValue(r8)
                java.lang.String r1 = (java.lang.String) r1
                com.yeelight.yeelib.device.xiaomi.ColorcService$f1 r1 = com.yeelight.yeelib.device.xiaomi.ColorcService.C8720f1.valueOf(r1)
                com.yeelight.yeelib.device.xiaomi.ColorcService$g1 r2 = r0.f16708a
                r2.mo28736i(r1)
            L_0x0252:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.xiaomi.ColorcService.C8752v.onPropertyChanged(com.miot.common.device.invocation.PropertyInfo, java.lang.String):void");
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorcService$v0 */
    public interface C8753v0 {
        /* renamed from: a */
        void mo30356a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorcService$w */
    class C8754w implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16709a;

        C8754w(ColorcService colorcService, CompletionHandler completionHandler) {
            this.f16709a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16709a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16709a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorcService$w0 */
    public interface C8755w0 {
        /* renamed from: a */
        void mo30358a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorcService$x */
    class C8756x implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16710a;

        C8756x(ColorcService colorcService, CompletionHandler completionHandler) {
            this.f16710a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16710a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16710a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorcService$x0 */
    public interface C8757x0 {
        /* renamed from: a */
        void mo30360a(C8720f1 f1Var);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorcService$y */
    class C8758y implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16711a;

        C8758y(ColorcService colorcService, CompletionHandler completionHandler) {
            this.f16711a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16711a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16711a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorcService$y0 */
    public interface C8759y0 {
        /* renamed from: a */
        void mo28726a(C8720f1 f1Var, Long l, Long l2, Long l3, Long l4, Long l5, Long l6, Long l7, Long l8, Long l9, Long l10, String str, Long l11, Long l12, Long l13, Long l14);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorcService$z */
    class C8760z implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f16712a;

        C8760z(ColorcService colorcService, CompletionHandler completionHandler) {
            this.f16712a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f16712a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f16712a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.ColorcService$z0 */
    public interface C8761z0 {
        /* renamed from: a */
        void mo30362a(Long l);

        void onFailed(int i, String str);
    }

    public ColorcService(AbstractDevice abstractDevice) {
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
                MiotManager.getDeviceManipulator().invoke(create, new C8756x(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8738o(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8734m(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8713d0(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getBright(C8739o0 o0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Bright"), new C8727i0(this, o0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getColorMode(C8741p0 p0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "ColorMode"), new C8709c(this, p0Var));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8710c0(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getCt(C8743q0 q0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Ct"), new C8729j0(this, q0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getDelayOff(C8745r0 r0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "DelayOff"), new C8715e(this, r0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowParams(C8747s0 s0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "FlowParams"), new C8721g(this, s0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowing(C8749t0 t0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Flowing"), new C8706b(this, t0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getHue(C8751u0 u0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Hue"), new C8733l0(this, u0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getLanMode(C8753v0 v0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "LanMode"), new C8724h(this, v0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getMusicEnable(C8755w0 w0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "MusicEnable"), new C8732l(this, w0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getPower(C8757x0 x0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Power"), new C8725h0(this, x0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getProperties(C8759y0 y0Var) {
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
            create.addProperty(getService().getProperty("TransIntervalDflt"));
            create.addProperty(getService().getProperty("MusicEnable"));
            MiotManager.getDeviceManipulator().readProperty(create, new C8722g0(this, y0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getRgb(C8761z0 z0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Rgb"), new C8712d(this, z0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getSat(C8705a1 a1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Sat"), new C8703a(this, a1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getSaveState(C8708b1 b1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "SaveState"), new C8718f(this, b1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getTemperature(C8711c1 c1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Temperature"), new C8731k0(this, c1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getTransIntervalDflt(C8714d1 d1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "TransIntervalDflt"), new C8728j(this, d1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getonFromPower(C8717e1 e1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "onFromPower"), new C8726i(this, e1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void openWithMode(C8720f1 f1Var, C8737n0 n0Var, Long l, Long l2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "openWithMode");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("Power", f1Var.toString())) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Effect", n0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Duration", l)) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("Mode", l2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C8746s(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8740p(this, completionHandler));
                return;
            }
            throw new MiotException("actionInfo is null");
        }
        throw new MiotException("device not configurated connection");
    }

    public void sendCmd(C8735m0 m0Var, String str, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "sendCmd");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("CmdKey", m0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("CmdValue", str)) {
                MiotManager.getDeviceManipulator().invoke(create, new C8760z(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setBright(Long l, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setBright");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (create.setArgumentValue("Bright", l)) {
                MiotManager.getDeviceManipulator().invoke(create, new C8736n(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setCt(Long l, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setCt");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (create.setArgumentValue("Ct", l)) {
                MiotManager.getDeviceManipulator().invoke(create, new C8707b0(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8758y(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8704a0(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setPower(C8720f1 f1Var, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setPower");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (create.setArgumentValue("Power", f1Var.toString())) {
                MiotManager.getDeviceManipulator().invoke(create, new C8748t(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setRgb(Long l, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setRgb");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (create.setArgumentValue("Rgb", l)) {
                MiotManager.getDeviceManipulator().invoke(create, new C8750u(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8742q(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setScene2(String str, Long l, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setScene2");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("ParamModel", str)) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("ParamCount", l)) {
                MiotManager.getDeviceManipulator().invoke(create, new C8744r(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C8716e0(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void subscribeNotifications(CompletionHandler completionHandler, C8723g1 g1Var) {
        if (completionHandler == null) {
            throw new IllegalArgumentException("handler is null");
        } else if (g1Var != null) {
            PropertyInfo create = PropertyInfoFactory.create(getService());
            for (Property next : getService().getProperties()) {
                if (next.getDefinition().isNotifiable()) {
                    create.addProperty(next);
                }
            }
            MiotManager.getDeviceManipulator().addPropertyChangedListener(create, new C8730k(this, completionHandler), new C8752v(this, g1Var));
        } else {
            throw new IllegalArgumentException("listener is null");
        }
    }

    public void toggle(CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "toggle");
            if (create != null) {
                MiotManager.getDeviceManipulator().invoke(create, new C8754w(this, completionHandler));
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
            MiotManager.getDeviceManipulator().removePropertyChangedListener(create, new C8719f0(this, completionHandler));
            return;
        }
        throw new IllegalArgumentException("handler is null");
    }
}
