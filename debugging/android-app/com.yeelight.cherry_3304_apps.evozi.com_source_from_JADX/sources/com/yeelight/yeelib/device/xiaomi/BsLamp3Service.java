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

public class BsLamp3Service extends AbstractService {
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
    public static final String PROPERTY_KnockEnable = "KnockEnable";
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
    public static final String PROPERTY_adjustAction = "adjustAction";
    public static final String PROPERTY_adjustProper = "adjustProper";
    private static final String TAG = "BsLamp3Service";
    private AbstractDevice mDevice = null;

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp3Service$a */
    class C7755a implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7800t0 f15731a;

        C7755a(BsLamp3Service bsLamp3Service, C7800t0 t0Var) {
            this.f15731a = t0Var;
        }

        public void onFailed(int i, String str) {
            this.f15731a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Flowing");
            if (property.isValueValid()) {
                this.f15731a.mo29255a((Long) propertyInfo.getValue("Flowing"));
                return;
            }
            C7800t0 t0Var = this.f15731a;
            t0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp3Service$a0 */
    class C7756a0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15732a;

        C7756a0(BsLamp3Service bsLamp3Service, CompletionHandler completionHandler) {
            this.f15732a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15732a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f15732a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp3Service$a1 */
    public interface C7757a1 {
        /* renamed from: a */
        void mo28164a(C7769e1 e1Var, Long l, Long l2, Long l3, Long l4, Long l5, Long l6, Long l7, Long l8, String str, Long l9, Long l10, Long l11, String str2, Long l12);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp3Service$b */
    class C7758b implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7792p0 f15733a;

        C7758b(BsLamp3Service bsLamp3Service, C7792p0 p0Var) {
            this.f15733a = p0Var;
        }

        public void onFailed(int i, String str) {
            this.f15733a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("ColorMode");
            if (property.isValueValid()) {
                this.f15733a.mo29247a((Long) propertyInfo.getValue("ColorMode"));
                return;
            }
            C7792p0 p0Var = this.f15733a;
            p0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp3Service$b0 */
    class C7759b0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15734a;

        C7759b0(BsLamp3Service bsLamp3Service, CompletionHandler completionHandler) {
            this.f15734a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15734a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f15734a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp3Service$b1 */
    public interface C7760b1 {
        /* renamed from: a */
        void mo29239a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp3Service$c */
    class C7761c implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7760b1 f15735a;

        C7761c(BsLamp3Service bsLamp3Service, C7760b1 b1Var) {
            this.f15735a = b1Var;
        }

        public void onFailed(int i, String str) {
            this.f15735a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Rgb");
            if (property.isValueValid()) {
                this.f15735a.mo29239a((Long) propertyInfo.getValue("Rgb"));
                return;
            }
            C7760b1 b1Var = this.f15735a;
            b1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp3Service$c0 */
    class C7762c0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15736a;

        C7762c0(BsLamp3Service bsLamp3Service, CompletionHandler completionHandler) {
            this.f15736a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15736a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f15736a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp3Service$c1 */
    public interface C7763c1 {
        /* renamed from: a */
        void mo29241a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp3Service$d */
    class C7764d implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7796r0 f15737a;

        C7764d(BsLamp3Service bsLamp3Service, C7796r0 r0Var) {
            this.f15737a = r0Var;
        }

        public void onFailed(int i, String str) {
            this.f15737a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("DelayOff");
            if (property.isValueValid()) {
                this.f15737a.mo29251a((Long) propertyInfo.getValue("DelayOff"));
                return;
            }
            C7796r0 r0Var = this.f15737a;
            r0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp3Service$d0 */
    class C7765d0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15738a;

        C7765d0(BsLamp3Service bsLamp3Service, CompletionHandler completionHandler) {
            this.f15738a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15738a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f15738a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp3Service$d1 */
    public interface C7766d1 {
        /* renamed from: a */
        void mo29243a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp3Service$e */
    class C7767e implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7798s0 f15739a;

        C7767e(BsLamp3Service bsLamp3Service, C7798s0 s0Var) {
            this.f15739a = s0Var;
        }

        public void onFailed(int i, String str) {
            this.f15739a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("FlowParams");
            if (property.isValueValid()) {
                this.f15739a.onSucceed((String) propertyInfo.getValue("FlowParams"));
                return;
            }
            C7798s0 s0Var = this.f15739a;
            s0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp3Service$e0 */
    class C7768e0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15740a;

        C7768e0(BsLamp3Service bsLamp3Service, CompletionHandler completionHandler) {
            this.f15740a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15740a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f15740a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp3Service$e1 */
    public enum C7769e1 {
        undefined,
        on,
        off
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp3Service$f */
    class C7770f implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7806w0 f15745a;

        C7770f(BsLamp3Service bsLamp3Service, C7806w0 w0Var) {
            this.f15745a = w0Var;
        }

        public void onFailed(int i, String str) {
            this.f15745a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("LanMode");
            if (property.isValueValid()) {
                this.f15745a.mo29261a((Long) propertyInfo.getValue("LanMode"));
                return;
            }
            C7806w0 w0Var = this.f15745a;
            w0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp3Service$f0 */
    class C7771f0 implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15746a;

        C7771f0(BsLamp3Service bsLamp3Service, CompletionHandler completionHandler) {
            this.f15746a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15746a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f15746a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp3Service$f1 */
    public interface C7772f1 {
        /* renamed from: a */
        void mo28166a(Long l);

        /* renamed from: b */
        void mo28167b(Long l);

        /* renamed from: c */
        void mo28168c(Long l);

        /* renamed from: d */
        void mo28169d(Long l);

        /* renamed from: e */
        void mo28170e(String str);

        /* renamed from: f */
        void mo28171f(Long l);

        /* renamed from: g */
        void mo28172g(Long l);

        /* renamed from: h */
        void mo28173h(Long l);

        /* renamed from: i */
        void mo28174i(String str);

        /* renamed from: j */
        void mo28175j(Long l);

        /* renamed from: k */
        void mo28176k(Long l);

        /* renamed from: l */
        void mo28177l(Long l);

        /* renamed from: m */
        void mo28178m(C7769e1 e1Var);

        /* renamed from: n */
        void mo28179n(Long l);

        /* renamed from: o */
        void mo28180o(Long l);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp3Service$g */
    class C7773g implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7766d1 f15747a;

        C7773g(BsLamp3Service bsLamp3Service, C7766d1 d1Var) {
            this.f15747a = d1Var;
        }

        public void onFailed(int i, String str) {
            this.f15747a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("SaveState");
            if (property.isValueValid()) {
                this.f15747a.mo29243a((Long) propertyInfo.getValue("SaveState"));
                return;
            }
            C7766d1 d1Var = this.f15747a;
            d1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp3Service$g0 */
    class C7774g0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7757a1 f15748a;

        C7774g0(BsLamp3Service bsLamp3Service, C7757a1 a1Var) {
            this.f15748a = a1Var;
        }

        public void onFailed(int i, String str) {
            this.f15748a.onFailed(i, str);
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
                com.yeelight.yeelib.device.xiaomi.BsLamp3Service$e1 r1 = com.yeelight.yeelib.device.xiaomi.BsLamp3Service.C7769e1.valueOf(r1)
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
                java.lang.String r1 = "LanMode"
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
                java.lang.String r1 = "SaveState"
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
                java.lang.String r1 = "MusicEnable"
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
                java.lang.String r1 = "NightTimeInfo"
                com.miot.common.property.Property r1 = r0.getProperty(r1)
                boolean r2 = r1.isValueValid()
                if (r2 == 0) goto L_0x0131
                java.lang.Object r1 = r1.getValue()
                java.lang.String r1 = (java.lang.String) r1
                r18 = r1
                goto L_0x0133
            L_0x0131:
                r18 = r3
            L_0x0133:
                java.lang.String r1 = "KnockEnable"
                com.miot.common.property.Property r0 = r0.getProperty(r1)
                boolean r1 = r0.isValueValid()
                if (r1 == 0) goto L_0x0146
                java.lang.Object r0 = r0.getValue()
                r3 = r0
                java.lang.Long r3 = (java.lang.Long) r3
            L_0x0146:
                r0 = r20
                r19 = r3
                com.yeelight.yeelib.device.xiaomi.BsLamp3Service$a1 r4 = r0.f15748a
                r4.mo28164a(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.xiaomi.BsLamp3Service.C7774g0.onSucceed(com.miot.common.device.invocation.PropertyInfo):void");
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp3Service$h */
    class C7775h implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7808x0 f15749a;

        C7775h(BsLamp3Service bsLamp3Service, C7808x0 x0Var) {
            this.f15749a = x0Var;
        }

        public void onFailed(int i, String str) {
            this.f15749a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("MusicEnable");
            if (property.isValueValid()) {
                this.f15749a.mo29263a((Long) propertyInfo.getValue("MusicEnable"));
                return;
            }
            C7808x0 x0Var = this.f15749a;
            x0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp3Service$h0 */
    class C7776h0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7812z0 f15750a;

        C7776h0(BsLamp3Service bsLamp3Service, C7812z0 z0Var) {
            this.f15750a = z0Var;
        }

        public void onFailed(int i, String str) {
            this.f15750a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Power");
            if (property.isValueValid()) {
                this.f15750a.mo29267a(C7769e1.valueOf((String) propertyInfo.getValue("Power")));
                return;
            }
            C7812z0 z0Var = this.f15750a;
            z0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp3Service$i */
    class C7777i implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7810y0 f15751a;

        C7777i(BsLamp3Service bsLamp3Service, C7810y0 y0Var) {
            this.f15751a = y0Var;
        }

        public void onFailed(int i, String str) {
            this.f15751a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("NightTimeInfo");
            if (property.isValueValid()) {
                this.f15751a.onSucceed((String) propertyInfo.getValue("NightTimeInfo"));
                return;
            }
            C7810y0 y0Var = this.f15751a;
            y0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp3Service$i0 */
    class C7778i0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7790o0 f15752a;

        C7778i0(BsLamp3Service bsLamp3Service, C7790o0 o0Var) {
            this.f15752a = o0Var;
        }

        public void onFailed(int i, String str) {
            this.f15752a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Bright");
            if (property.isValueValid()) {
                this.f15752a.mo29245a((Long) propertyInfo.getValue("Bright"));
                return;
            }
            C7790o0 o0Var = this.f15752a;
            o0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp3Service$j */
    class C7779j implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7804v0 f15753a;

        C7779j(BsLamp3Service bsLamp3Service, C7804v0 v0Var) {
            this.f15753a = v0Var;
        }

        public void onFailed(int i, String str) {
            this.f15753a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty(BsLamp3Service.PROPERTY_KnockEnable);
            if (property.isValueValid()) {
                this.f15753a.mo29259a((Long) propertyInfo.getValue(BsLamp3Service.PROPERTY_KnockEnable));
                return;
            }
            C7804v0 v0Var = this.f15753a;
            v0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp3Service$j0 */
    class C7780j0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7794q0 f15754a;

        C7780j0(BsLamp3Service bsLamp3Service, C7794q0 q0Var) {
            this.f15754a = q0Var;
        }

        public void onFailed(int i, String str) {
            this.f15754a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Ct");
            if (property.isValueValid()) {
                this.f15754a.mo29249a((Long) propertyInfo.getValue("Ct"));
                return;
            }
            C7794q0 q0Var = this.f15754a;
            q0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp3Service$k */
    class C7781k implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15755a;

        C7781k(BsLamp3Service bsLamp3Service, CompletionHandler completionHandler) {
            this.f15755a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15755a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f15755a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp3Service$k0 */
    class C7782k0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7802u0 f15756a;

        C7782k0(BsLamp3Service bsLamp3Service, C7802u0 u0Var) {
            this.f15756a = u0Var;
        }

        public void onFailed(int i, String str) {
            this.f15756a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Hue");
            if (property.isValueValid()) {
                this.f15756a.mo29257a((Long) propertyInfo.getValue("Hue"));
                return;
            }
            C7802u0 u0Var = this.f15756a;
            u0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp3Service$l */
    class C7783l implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15757a;

        C7783l(BsLamp3Service bsLamp3Service, CompletionHandler completionHandler) {
            this.f15757a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15757a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f15757a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp3Service$l0 */
    class C7784l0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7763c1 f15758a;

        C7784l0(BsLamp3Service bsLamp3Service, C7763c1 c1Var) {
            this.f15758a = c1Var;
        }

        public void onFailed(int i, String str) {
            this.f15758a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Sat");
            if (property.isValueValid()) {
                this.f15758a.mo29241a((Long) propertyInfo.getValue("Sat"));
                return;
            }
            C7763c1 c1Var = this.f15758a;
            c1Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp3Service$m */
    class C7785m implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15759a;

        C7785m(BsLamp3Service bsLamp3Service, CompletionHandler completionHandler) {
            this.f15759a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15759a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f15759a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp3Service$m0 */
    public enum C7786m0 {
        undefined,
        cfg_pomodoro,
        cfg_lan_ctrl,
        nighttime,
        pseudo_beacon,
        cfg_init_power,
        cfg_save_state,
        knock_enable
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp3Service$n */
    class C7787n implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15769a;

        C7787n(BsLamp3Service bsLamp3Service, CompletionHandler completionHandler) {
            this.f15769a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15769a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f15769a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp3Service$n0 */
    public enum C7788n0 {
        undefined,
        smooth,
        sudden
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp3Service$o */
    class C7789o implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15774a;

        C7789o(BsLamp3Service bsLamp3Service, CompletionHandler completionHandler) {
            this.f15774a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15774a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f15774a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp3Service$o0 */
    public interface C7790o0 {
        /* renamed from: a */
        void mo29245a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp3Service$p */
    class C7791p implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15775a;

        C7791p(BsLamp3Service bsLamp3Service, CompletionHandler completionHandler) {
            this.f15775a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15775a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f15775a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp3Service$p0 */
    public interface C7792p0 {
        /* renamed from: a */
        void mo29247a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp3Service$q */
    class C7793q implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15776a;

        C7793q(BsLamp3Service bsLamp3Service, CompletionHandler completionHandler) {
            this.f15776a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15776a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f15776a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp3Service$q0 */
    public interface C7794q0 {
        /* renamed from: a */
        void mo29249a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp3Service$r */
    class C7795r implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15777a;

        C7795r(BsLamp3Service bsLamp3Service, CompletionHandler completionHandler) {
            this.f15777a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15777a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f15777a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp3Service$r0 */
    public interface C7796r0 {
        /* renamed from: a */
        void mo29251a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp3Service$s */
    class C7797s implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15778a;

        C7797s(BsLamp3Service bsLamp3Service, CompletionHandler completionHandler) {
            this.f15778a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15778a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f15778a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp3Service$s0 */
    public interface C7798s0 {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp3Service$t */
    class C7799t implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15779a;

        C7799t(BsLamp3Service bsLamp3Service, CompletionHandler completionHandler) {
            this.f15779a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15779a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f15779a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp3Service$t0 */
    public interface C7800t0 {
        /* renamed from: a */
        void mo29255a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp3Service$u */
    class C7801u implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15780a;

        C7801u(BsLamp3Service bsLamp3Service, CompletionHandler completionHandler) {
            this.f15780a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15780a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f15780a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp3Service$u0 */
    public interface C7802u0 {
        /* renamed from: a */
        void mo29257a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp3Service$v */
    class C7803v implements DeviceManipulator.PropertyChangedListener {

        /* renamed from: a */
        final /* synthetic */ C7772f1 f15781a;

        C7803v(BsLamp3Service bsLamp3Service, C7772f1 f1Var) {
            this.f15781a = f1Var;
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
            r15 = r17;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:52:0x00bf, code lost:
            r2 = r18;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:53:0x00c9, code lost:
            if (r2.getProperty(com.yeelight.yeelib.device.xiaomi.BsLamp3Service.PROPERTY_KnockEnable).isValueValid() == false) goto L_0x00bb;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:54:0x00cb, code lost:
            r17.f15781a.mo28171f((java.lang.Long) r2.getValue(com.yeelight.yeelib.device.xiaomi.BsLamp3Service.PROPERTY_KnockEnable));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:55:0x00da, code lost:
            r15 = r17;
            r2 = r18;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:56:0x00e6, code lost:
            if (r2.getProperty("NightTimeInfo").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:57:0x00e8, code lost:
            r15.f15781a.mo28174i((java.lang.String) r2.getValue("NightTimeInfo"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:58:0x00f5, code lost:
            r15 = r17;
            r2 = r18;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:59:0x0101, code lost:
            if (r2.getProperty("MusicEnable").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:60:0x0103, code lost:
            r15.f15781a.mo28180o((java.lang.Long) r2.getValue("MusicEnable"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:61:0x0110, code lost:
            r15 = r17;
            r2 = r18;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:62:0x011c, code lost:
            if (r2.getProperty("SaveState").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:63:0x011e, code lost:
            r15.f15781a.mo28169d((java.lang.Long) r2.getValue("SaveState"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:64:0x012b, code lost:
            r15 = r17;
            r2 = r18;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:65:0x0137, code lost:
            if (r2.getProperty("LanMode").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:66:0x0139, code lost:
            r15.f15781a.mo28172g((java.lang.Long) r2.getValue("LanMode"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:67:0x0146, code lost:
            r15 = r17;
            r2 = r18;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:68:0x0152, code lost:
            if (r2.getProperty(r3).isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:69:0x0154, code lost:
            r15.f15781a.mo28170e((java.lang.String) r2.getValue(r3));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:70:0x0161, code lost:
            r15 = r17;
            r2 = r18;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:71:0x016d, code lost:
            if (r2.getProperty("DelayOff").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:72:0x016f, code lost:
            r15.f15781a.mo28167b((java.lang.Long) r2.getValue("DelayOff"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:73:0x017c, code lost:
            r15 = r17;
            r2 = r18;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:74:0x0188, code lost:
            if (r2.getProperty("Rgb").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:75:0x018a, code lost:
            r15.f15781a.mo28175j((java.lang.Long) r2.getValue("Rgb"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:76:0x0197, code lost:
            r15 = r17;
            r2 = r18;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:77:0x01a3, code lost:
            if (r2.getProperty("ColorMode").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:78:0x01a5, code lost:
            r15.f15781a.mo28177l((java.lang.Long) r2.getValue("ColorMode"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:79:0x01b2, code lost:
            r15 = r17;
            r2 = r18;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:80:0x01be, code lost:
            if (r2.getProperty("Flowing").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:81:0x01c0, code lost:
            r15.f15781a.mo28168c((java.lang.Long) r2.getValue("Flowing"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:82:0x01cd, code lost:
            r15 = r17;
            r2 = r18;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:83:0x01d9, code lost:
            if (r2.getProperty("Sat").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:84:0x01db, code lost:
            r15.f15781a.mo28176k((java.lang.Long) r2.getValue("Sat"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:85:0x01e8, code lost:
            r15 = r17;
            r2 = r18;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:86:0x01f4, code lost:
            if (r2.getProperty("Hue").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:87:0x01f6, code lost:
            r15.f15781a.mo28179n((java.lang.Long) r2.getValue("Hue"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:88:0x0202, code lost:
            r15 = r17;
            r2 = r18;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:89:0x020e, code lost:
            if (r2.getProperty("Ct").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:90:0x0210, code lost:
            r15.f15781a.mo28173h((java.lang.Long) r2.getValue("Ct"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:91:0x021c, code lost:
            r15 = r17;
            r2 = r18;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:92:0x0228, code lost:
            if (r2.getProperty("Bright").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:93:0x022a, code lost:
            r15.f15781a.mo28166a((java.lang.Long) r2.getValue("Bright"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:94:0x0236, code lost:
            r15 = r17;
            r2 = r18;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:95:0x0242, code lost:
            if (r2.getProperty("Power").isValueValid() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:96:0x0244, code lost:
            r15.f15781a.mo28178m(com.yeelight.yeelib.device.xiaomi.BsLamp3Service.C7769e1.valueOf((java.lang.String) r2.getValue("Power")));
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
                java.lang.String r8 = "Power"
                java.lang.String r9 = "Sat"
                java.lang.String r10 = "Rgb"
                java.lang.String r11 = "Hue"
                java.lang.String r12 = "Ct"
                java.lang.String r13 = "ColorMode"
                java.lang.String r14 = "NightTimeInfo"
                java.lang.String r15 = "KnockEnable"
                java.lang.String r0 = "MusicEnable"
                java.lang.String r1 = "FlowParams"
                r16 = r1
                java.lang.String r1 = "SaveState"
                switch(r3) {
                    case -2117953292: goto L_0x00ac;
                    case -2002016140: goto L_0x00a1;
                    case -1787381784: goto L_0x0096;
                    case -1534833833: goto L_0x008d;
                    case -1331143373: goto L_0x0084;
                    case -310275194: goto L_0x007c;
                    case 2193: goto L_0x0074;
                    case 72920: goto L_0x006c;
                    case 82093: goto L_0x0064;
                    case 82886: goto L_0x005c;
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
                r2 = 10
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
                r2 = 4
                goto L_0x009e
            L_0x0064:
                boolean r2 = r2.equals(r10)
                if (r2 == 0) goto L_0x002d
                r2 = 7
                goto L_0x009e
            L_0x006c:
                boolean r2 = r2.equals(r11)
                if (r2 == 0) goto L_0x002d
                r2 = 3
                goto L_0x009e
            L_0x0074:
                boolean r2 = r2.equals(r12)
                if (r2 == 0) goto L_0x002d
                r2 = 2
                goto L_0x009e
            L_0x007c:
                boolean r2 = r2.equals(r13)
                if (r2 == 0) goto L_0x002d
                r2 = 6
                goto L_0x009e
            L_0x0084:
                boolean r2 = r2.equals(r14)
                if (r2 == 0) goto L_0x002d
                r2 = 13
                goto L_0x009e
            L_0x008d:
                boolean r2 = r2.equals(r15)
                if (r2 == 0) goto L_0x002d
                r2 = 14
                goto L_0x009e
            L_0x0096:
                boolean r2 = r2.equals(r0)
                if (r2 == 0) goto L_0x002d
                r2 = 12
            L_0x009e:
                r3 = r16
                goto L_0x00b8
            L_0x00a1:
                r3 = r16
                boolean r2 = r2.equals(r3)
                if (r2 == 0) goto L_0x00b7
                r2 = 9
                goto L_0x00b8
            L_0x00ac:
                r3 = r16
                boolean r2 = r2.equals(r1)
                if (r2 == 0) goto L_0x00b7
                r2 = 11
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
                r15 = r17
                goto L_0x0253
            L_0x00bf:
                r2 = r18
                com.miot.common.property.Property r0 = r2.getProperty(r15)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x00bb
                java.lang.Object r0 = r2.getValue(r15)
                java.lang.Long r0 = (java.lang.Long) r0
                r15 = r17
                com.yeelight.yeelib.device.xiaomi.BsLamp3Service$f1 r1 = r15.f15781a
                r1.mo28171f(r0)
                goto L_0x0253
            L_0x00da:
                r15 = r17
                r2 = r18
                com.miot.common.property.Property r0 = r2.getProperty(r14)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0253
                java.lang.Object r0 = r2.getValue(r14)
                java.lang.String r0 = (java.lang.String) r0
                com.yeelight.yeelib.device.xiaomi.BsLamp3Service$f1 r1 = r15.f15781a
                r1.mo28174i(r0)
                goto L_0x0253
            L_0x00f5:
                r15 = r17
                r2 = r18
                com.miot.common.property.Property r1 = r2.getProperty(r0)
                boolean r1 = r1.isValueValid()
                if (r1 == 0) goto L_0x0253
                java.lang.Object r0 = r2.getValue(r0)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.BsLamp3Service$f1 r1 = r15.f15781a
                r1.mo28180o(r0)
                goto L_0x0253
            L_0x0110:
                r15 = r17
                r2 = r18
                com.miot.common.property.Property r0 = r2.getProperty(r1)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0253
                java.lang.Object r0 = r2.getValue(r1)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.BsLamp3Service$f1 r1 = r15.f15781a
                r1.mo28169d(r0)
                goto L_0x0253
            L_0x012b:
                r15 = r17
                r2 = r18
                com.miot.common.property.Property r0 = r2.getProperty(r5)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0253
                java.lang.Object r0 = r2.getValue(r5)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.BsLamp3Service$f1 r1 = r15.f15781a
                r1.mo28172g(r0)
                goto L_0x0253
            L_0x0146:
                r15 = r17
                r2 = r18
                com.miot.common.property.Property r0 = r2.getProperty(r3)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0253
                java.lang.Object r0 = r2.getValue(r3)
                java.lang.String r0 = (java.lang.String) r0
                com.yeelight.yeelib.device.xiaomi.BsLamp3Service$f1 r1 = r15.f15781a
                r1.mo28170e(r0)
                goto L_0x0253
            L_0x0161:
                r15 = r17
                r2 = r18
                com.miot.common.property.Property r0 = r2.getProperty(r7)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0253
                java.lang.Object r0 = r2.getValue(r7)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.BsLamp3Service$f1 r1 = r15.f15781a
                r1.mo28167b(r0)
                goto L_0x0253
            L_0x017c:
                r15 = r17
                r2 = r18
                com.miot.common.property.Property r0 = r2.getProperty(r10)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0253
                java.lang.Object r0 = r2.getValue(r10)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.BsLamp3Service$f1 r1 = r15.f15781a
                r1.mo28175j(r0)
                goto L_0x0253
            L_0x0197:
                r15 = r17
                r2 = r18
                com.miot.common.property.Property r0 = r2.getProperty(r13)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0253
                java.lang.Object r0 = r2.getValue(r13)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.BsLamp3Service$f1 r1 = r15.f15781a
                r1.mo28177l(r0)
                goto L_0x0253
            L_0x01b2:
                r15 = r17
                r2 = r18
                com.miot.common.property.Property r0 = r2.getProperty(r6)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0253
                java.lang.Object r0 = r2.getValue(r6)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.BsLamp3Service$f1 r1 = r15.f15781a
                r1.mo28168c(r0)
                goto L_0x0253
            L_0x01cd:
                r15 = r17
                r2 = r18
                com.miot.common.property.Property r0 = r2.getProperty(r9)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0253
                java.lang.Object r0 = r2.getValue(r9)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.BsLamp3Service$f1 r1 = r15.f15781a
                r1.mo28176k(r0)
                goto L_0x0253
            L_0x01e8:
                r15 = r17
                r2 = r18
                com.miot.common.property.Property r0 = r2.getProperty(r11)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0253
                java.lang.Object r0 = r2.getValue(r11)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.BsLamp3Service$f1 r1 = r15.f15781a
                r1.mo28179n(r0)
                goto L_0x0253
            L_0x0202:
                r15 = r17
                r2 = r18
                com.miot.common.property.Property r0 = r2.getProperty(r12)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0253
                java.lang.Object r0 = r2.getValue(r12)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.BsLamp3Service$f1 r1 = r15.f15781a
                r1.mo28173h(r0)
                goto L_0x0253
            L_0x021c:
                r15 = r17
                r2 = r18
                com.miot.common.property.Property r0 = r2.getProperty(r4)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0253
                java.lang.Object r0 = r2.getValue(r4)
                java.lang.Long r0 = (java.lang.Long) r0
                com.yeelight.yeelib.device.xiaomi.BsLamp3Service$f1 r1 = r15.f15781a
                r1.mo28166a(r0)
                goto L_0x0253
            L_0x0236:
                r15 = r17
                r2 = r18
                com.miot.common.property.Property r0 = r2.getProperty(r8)
                boolean r0 = r0.isValueValid()
                if (r0 == 0) goto L_0x0253
                java.lang.Object r0 = r2.getValue(r8)
                java.lang.String r0 = (java.lang.String) r0
                com.yeelight.yeelib.device.xiaomi.BsLamp3Service$e1 r0 = com.yeelight.yeelib.device.xiaomi.BsLamp3Service.C7769e1.valueOf(r0)
                com.yeelight.yeelib.device.xiaomi.BsLamp3Service$f1 r1 = r15.f15781a
                r1.mo28178m(r0)
            L_0x0253:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.xiaomi.BsLamp3Service.C7803v.onPropertyChanged(com.miot.common.device.invocation.PropertyInfo, java.lang.String):void");
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp3Service$v0 */
    public interface C7804v0 {
        /* renamed from: a */
        void mo29259a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp3Service$w */
    class C7805w implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15782a;

        C7805w(BsLamp3Service bsLamp3Service, CompletionHandler completionHandler) {
            this.f15782a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15782a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f15782a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp3Service$w0 */
    public interface C7806w0 {
        /* renamed from: a */
        void mo29261a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp3Service$x */
    class C7807x implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15783a;

        C7807x(BsLamp3Service bsLamp3Service, CompletionHandler completionHandler) {
            this.f15783a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15783a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f15783a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp3Service$x0 */
    public interface C7808x0 {
        /* renamed from: a */
        void mo29263a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp3Service$y */
    class C7809y implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15784a;

        C7809y(BsLamp3Service bsLamp3Service, CompletionHandler completionHandler) {
            this.f15784a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15784a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f15784a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp3Service$y0 */
    public interface C7810y0 {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp3Service$z */
    class C7811z implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f15785a;

        C7811z(BsLamp3Service bsLamp3Service, CompletionHandler completionHandler) {
            this.f15785a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f15785a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f15785a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp3Service$z0 */
    public interface C7812z0 {
        /* renamed from: a */
        void mo29267a(C7769e1 e1Var);

        void onFailed(int i, String str);
    }

    public BsLamp3Service(AbstractDevice abstractDevice) {
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
                MiotManager.getDeviceManipulator().invoke(create, new C7801u(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7787n(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7783l(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7765d0(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getBright(C7790o0 o0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Bright"), new C7778i0(this, o0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getColorMode(C7792p0 p0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "ColorMode"), new C7758b(this, p0Var));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7762c0(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getCt(C7794q0 q0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Ct"), new C7780j0(this, q0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getDelayOff(C7796r0 r0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "DelayOff"), new C7764d(this, r0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowParams(C7798s0 s0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "FlowParams"), new C7767e(this, s0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowing(C7800t0 t0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Flowing"), new C7755a(this, t0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getHue(C7802u0 u0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Hue"), new C7782k0(this, u0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getKnockEnable(C7804v0 v0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), PROPERTY_KnockEnable), new C7779j(this, v0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getLanMode(C7806w0 w0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "LanMode"), new C7770f(this, w0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getMusicEnable(C7808x0 x0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "MusicEnable"), new C7775h(this, x0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getNightTimeInfo(C7810y0 y0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "NightTimeInfo"), new C7777i(this, y0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getPower(C7812z0 z0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Power"), new C7776h0(this, z0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getProperties(C7757a1 a1Var) {
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
            create.addProperty(getService().getProperty("LanMode"));
            create.addProperty(getService().getProperty("SaveState"));
            create.addProperty(getService().getProperty("MusicEnable"));
            create.addProperty(getService().getProperty("NightTimeInfo"));
            create.addProperty(getService().getProperty(PROPERTY_KnockEnable));
            MiotManager.getDeviceManipulator().readProperty(create, new C7774g0(this, a1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getRgb(C7760b1 b1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Rgb"), new C7761c(this, b1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getSat(C7763c1 c1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Sat"), new C7784l0(this, c1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getSaveState(C7766d1 d1Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "SaveState"), new C7773g(this, d1Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void openWithMode(C7769e1 e1Var, C7788n0 n0Var, Long l, Long l2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "openWithMode");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("Power", e1Var.toString())) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Effect", n0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Duration", l)) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("Mode", l2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C7793q(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7789o(this, completionHandler));
                return;
            }
            throw new MiotException("actionInfo is null");
        }
        throw new MiotException("device not configurated connection");
    }

    public void sendCmd(C7786m0 m0Var, String str, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "sendCmd");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("CmdKey", m0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("CmdValue", str)) {
                MiotManager.getDeviceManipulator().invoke(create, new C7809y(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setBright(Long l, C7788n0 n0Var, Long l2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setBright");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("Bright", l)) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Effect", n0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("Duration", l2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C7785m(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setCt(Long l, C7788n0 n0Var, Long l2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setCt");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("Ct", l)) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Effect", n0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("Duration", l2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C7759b0(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7805w(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7756a0(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7807x(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setPower(C7769e1 e1Var, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setPower");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (create.setArgumentValue("Power", e1Var.toString())) {
                MiotManager.getDeviceManipulator().invoke(create, new C7795r(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setRgb(Long l, C7788n0 n0Var, Long l2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setRgb");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("Rgb", l)) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Effect", n0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("Duration", l2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C7797s(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7791p(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7811z(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7768e0(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void subscribeNotifications(CompletionHandler completionHandler, C7772f1 f1Var) {
        if (completionHandler == null) {
            throw new IllegalArgumentException("handler is null");
        } else if (f1Var != null) {
            PropertyInfo create = PropertyInfoFactory.create(getService());
            for (Property next : getService().getProperties()) {
                if (next.getDefinition().isNotifiable()) {
                    create.addProperty(next);
                }
            }
            MiotManager.getDeviceManipulator().addPropertyChangedListener(create, new C7781k(this, completionHandler), new C7803v(this, f1Var));
        } else {
            throw new IllegalArgumentException("listener is null");
        }
    }

    public void toggle(CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "toggle");
            if (create != null) {
                MiotManager.getDeviceManipulator().invoke(create, new C7799t(this, completionHandler));
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
            MiotManager.getDeviceManipulator().removePropertyChangedListener(create, new C7771f0(this, completionHandler));
            return;
        }
        throw new IllegalArgumentException("handler is null");
    }
}
