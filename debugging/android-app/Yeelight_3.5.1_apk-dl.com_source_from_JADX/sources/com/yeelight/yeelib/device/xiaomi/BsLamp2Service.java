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

public class BsLamp2Service extends AbstractService {
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
    private static final String TAG = "BsLamp2Service";
    private AbstractDevice mDevice = null;

    public enum CmdKey {
        undefined,
        cfg_pomodoro,
        cfg_lan_ctrl,
        nighttime,
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

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp2Service$a */
    class C6240a implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6265m0 f12744a;

        C6240a(BsLamp2Service bsLamp2Service, C6265m0 m0Var) {
            this.f12744a = m0Var;
        }

        public void onFailed(int i, String str) {
            this.f12744a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Flowing");
            if (property.isValueValid()) {
                this.f12744a.mo32040a((Long) propertyInfo.getValue("Flowing"));
                return;
            }
            C6265m0 m0Var = this.f12744a;
            m0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp2Service$a0 */
    class C6241a0 implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12745a;

        C6241a0(BsLamp2Service bsLamp2Service, CompletionHandler completionHandler) {
            this.f12745a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12745a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f12745a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp2Service$b */
    class C6242b implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6257i0 f12746a;

        C6242b(BsLamp2Service bsLamp2Service, C6257i0 i0Var) {
            this.f12746a = i0Var;
        }

        public void onFailed(int i, String str) {
            this.f12746a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("ColorMode");
            if (property.isValueValid()) {
                this.f12746a.mo32032a((Long) propertyInfo.getValue("ColorMode"));
                return;
            }
            C6257i0 i0Var = this.f12746a;
            i0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp2Service$b0 */
    class C6243b0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6273q0 f12747a;

        C6243b0(BsLamp2Service bsLamp2Service, C6273q0 q0Var) {
            this.f12747a = q0Var;
        }

        public void onFailed(int i, String str) {
            this.f12747a.onFailed(i, str);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.String} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onSucceed(com.miot.common.device.invocation.PropertyInfo r18) {
            /*
                r17 = this;
                r0 = r18
                java.lang.String r1 = "Power"
                com.miot.common.property.Property r1 = r0.getProperty(r1)
                boolean r2 = r1.isValueValid()
                r3 = 0
                if (r2 == 0) goto L_0x001b
                java.lang.Object r1 = r1.getValue()
                java.lang.String r1 = (java.lang.String) r1
                com.yeelight.yeelib.device.xiaomi.BsLamp2Service$Power r1 = com.yeelight.yeelib.device.xiaomi.BsLamp2Service.Power.valueOf(r1)
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
                com.miot.common.property.Property r0 = r0.getProperty(r1)
                boolean r1 = r0.isValueValid()
                if (r1 == 0) goto L_0x0101
                java.lang.Object r0 = r0.getValue()
                r3 = r0
                java.lang.String r3 = (java.lang.String) r3
            L_0x0101:
                r0 = r17
                r16 = r3
                com.yeelight.yeelib.device.xiaomi.BsLamp2Service$q0 r4 = r0.f12747a
                r4.mo32048a(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.xiaomi.BsLamp2Service.C6243b0.onSucceed(com.miot.common.device.invocation.PropertyInfo):void");
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp2Service$c */
    class C6244c implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6275r0 f12748a;

        C6244c(BsLamp2Service bsLamp2Service, C6275r0 r0Var) {
            this.f12748a = r0Var;
        }

        public void onFailed(int i, String str) {
            this.f12748a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Rgb");
            if (property.isValueValid()) {
                this.f12748a.mo32050a((Long) propertyInfo.getValue("Rgb"));
                return;
            }
            C6275r0 r0Var = this.f12748a;
            r0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp2Service$c0 */
    class C6245c0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6271p0 f12749a;

        C6245c0(BsLamp2Service bsLamp2Service, C6271p0 p0Var) {
            this.f12749a = p0Var;
        }

        public void onFailed(int i, String str) {
            this.f12749a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Power");
            if (property.isValueValid()) {
                this.f12749a.mo32046a(Power.valueOf((String) propertyInfo.getValue("Power")));
                return;
            }
            C6271p0 p0Var = this.f12749a;
            p0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp2Service$d */
    class C6246d implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6261k0 f12750a;

        C6246d(BsLamp2Service bsLamp2Service, C6261k0 k0Var) {
            this.f12750a = k0Var;
        }

        public void onFailed(int i, String str) {
            this.f12750a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("DelayOff");
            if (property.isValueValid()) {
                this.f12750a.mo32036a((Long) propertyInfo.getValue("DelayOff"));
                return;
            }
            C6261k0 k0Var = this.f12750a;
            k0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp2Service$d0 */
    class C6247d0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6255h0 f12751a;

        C6247d0(BsLamp2Service bsLamp2Service, C6255h0 h0Var) {
            this.f12751a = h0Var;
        }

        public void onFailed(int i, String str) {
            this.f12751a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Bright");
            if (property.isValueValid()) {
                this.f12751a.mo32030a((Long) propertyInfo.getValue("Bright"));
                return;
            }
            C6255h0 h0Var = this.f12751a;
            h0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp2Service$e */
    class C6248e implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6263l0 f12752a;

        C6248e(BsLamp2Service bsLamp2Service, C6263l0 l0Var) {
            this.f12752a = l0Var;
        }

        public void onFailed(int i, String str) {
            this.f12752a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("FlowParams");
            if (property.isValueValid()) {
                this.f12752a.onSucceed((String) propertyInfo.getValue("FlowParams"));
                return;
            }
            C6263l0 l0Var = this.f12752a;
            l0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp2Service$e0 */
    class C6249e0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6259j0 f12753a;

        C6249e0(BsLamp2Service bsLamp2Service, C6259j0 j0Var) {
            this.f12753a = j0Var;
        }

        public void onFailed(int i, String str) {
            this.f12753a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Ct");
            if (property.isValueValid()) {
                this.f12753a.mo32034a((Long) propertyInfo.getValue("Ct"));
                return;
            }
            C6259j0 j0Var = this.f12753a;
            j0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp2Service$f */
    class C6250f implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6279t0 f12754a;

        C6250f(BsLamp2Service bsLamp2Service, C6279t0 t0Var) {
            this.f12754a = t0Var;
        }

        public void onFailed(int i, String str) {
            this.f12754a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("SaveState");
            if (property.isValueValid()) {
                this.f12754a.mo32054a((Long) propertyInfo.getValue("SaveState"));
                return;
            }
            C6279t0 t0Var = this.f12754a;
            t0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp2Service$f0 */
    class C6251f0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6267n0 f12755a;

        C6251f0(BsLamp2Service bsLamp2Service, C6267n0 n0Var) {
            this.f12755a = n0Var;
        }

        public void onFailed(int i, String str) {
            this.f12755a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Hue");
            if (property.isValueValid()) {
                this.f12755a.mo32042a((Long) propertyInfo.getValue("Hue"));
                return;
            }
            C6267n0 n0Var = this.f12755a;
            n0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp2Service$g */
    class C6252g implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6269o0 f12756a;

        C6252g(BsLamp2Service bsLamp2Service, C6269o0 o0Var) {
            this.f12756a = o0Var;
        }

        public void onFailed(int i, String str) {
            this.f12756a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("NightTimeInfo");
            if (property.isValueValid()) {
                this.f12756a.onSucceed((String) propertyInfo.getValue("NightTimeInfo"));
                return;
            }
            C6269o0 o0Var = this.f12756a;
            o0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp2Service$g0 */
    class C6253g0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C6277s0 f12757a;

        C6253g0(BsLamp2Service bsLamp2Service, C6277s0 s0Var) {
            this.f12757a = s0Var;
        }

        public void onFailed(int i, String str) {
            this.f12757a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Sat");
            if (property.isValueValid()) {
                this.f12757a.mo32052a((Long) propertyInfo.getValue("Sat"));
                return;
            }
            C6277s0 s0Var = this.f12757a;
            s0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp2Service$h */
    class C6254h implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12758a;

        C6254h(BsLamp2Service bsLamp2Service, CompletionHandler completionHandler) {
            this.f12758a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12758a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12758a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp2Service$h0 */
    public interface C6255h0 {
        /* renamed from: a */
        void mo32030a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp2Service$i */
    class C6256i implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12759a;

        C6256i(BsLamp2Service bsLamp2Service, CompletionHandler completionHandler) {
            this.f12759a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12759a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12759a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp2Service$i0 */
    public interface C6257i0 {
        /* renamed from: a */
        void mo32032a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp2Service$j */
    class C6258j implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12760a;

        C6258j(BsLamp2Service bsLamp2Service, CompletionHandler completionHandler) {
            this.f12760a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12760a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12760a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp2Service$j0 */
    public interface C6259j0 {
        /* renamed from: a */
        void mo32034a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp2Service$k */
    class C6260k implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12761a;

        C6260k(BsLamp2Service bsLamp2Service, CompletionHandler completionHandler) {
            this.f12761a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12761a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f12761a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp2Service$k0 */
    public interface C6261k0 {
        /* renamed from: a */
        void mo32036a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp2Service$l */
    class C6262l implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12762a;

        C6262l(BsLamp2Service bsLamp2Service, CompletionHandler completionHandler) {
            this.f12762a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12762a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12762a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp2Service$l0 */
    public interface C6263l0 {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp2Service$m */
    class C6264m implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12763a;

        C6264m(BsLamp2Service bsLamp2Service, CompletionHandler completionHandler) {
            this.f12763a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12763a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12763a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp2Service$m0 */
    public interface C6265m0 {
        /* renamed from: a */
        void mo32040a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp2Service$n */
    class C6266n implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12764a;

        C6266n(BsLamp2Service bsLamp2Service, CompletionHandler completionHandler) {
            this.f12764a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12764a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12764a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp2Service$n0 */
    public interface C6267n0 {
        /* renamed from: a */
        void mo32042a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp2Service$o */
    class C6268o implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12765a;

        C6268o(BsLamp2Service bsLamp2Service, CompletionHandler completionHandler) {
            this.f12765a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12765a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12765a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp2Service$o0 */
    public interface C6269o0 {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp2Service$p */
    class C6270p implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12766a;

        C6270p(BsLamp2Service bsLamp2Service, CompletionHandler completionHandler) {
            this.f12766a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12766a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12766a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp2Service$p0 */
    public interface C6271p0 {
        /* renamed from: a */
        void mo32046a(Power power);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp2Service$q */
    class C6272q implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12767a;

        C6272q(BsLamp2Service bsLamp2Service, CompletionHandler completionHandler) {
            this.f12767a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12767a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12767a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp2Service$q0 */
    public interface C6273q0 {
        /* renamed from: a */
        void mo32048a(Power power, Long l, Long l2, Long l3, Long l4, Long l5, Long l6, Long l7, Long l8, String str, Long l9, String str2);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp2Service$r */
    class C6274r implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12768a;

        C6274r(BsLamp2Service bsLamp2Service, CompletionHandler completionHandler) {
            this.f12768a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12768a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12768a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp2Service$r0 */
    public interface C6275r0 {
        /* renamed from: a */
        void mo32050a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp2Service$s */
    class C6276s implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12769a;

        C6276s(BsLamp2Service bsLamp2Service, CompletionHandler completionHandler) {
            this.f12769a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12769a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12769a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp2Service$s0 */
    public interface C6277s0 {
        /* renamed from: a */
        void mo32052a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp2Service$t */
    class C6278t implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12770a;

        C6278t(BsLamp2Service bsLamp2Service, CompletionHandler completionHandler) {
            this.f12770a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12770a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12770a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp2Service$t0 */
    public interface C6279t0 {
        /* renamed from: a */
        void mo32054a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp2Service$u */
    class C6280u implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12771a;

        C6280u(BsLamp2Service bsLamp2Service, CompletionHandler completionHandler) {
            this.f12771a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12771a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12771a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp2Service$u0 */
    public interface C6281u0 {
        /* renamed from: a */
        void mo32056a(Long l);

        /* renamed from: b */
        void mo32057b(Long l);

        /* renamed from: c */
        void mo32058c(Long l);

        /* renamed from: d */
        void mo32059d(Long l);

        /* renamed from: e */
        void mo32060e(String str);

        /* renamed from: h */
        void mo32061h(Long l);

        /* renamed from: i */
        void mo32062i(String str);

        /* renamed from: j */
        void mo32063j(Long l);

        /* renamed from: k */
        void mo32064k(Long l);

        /* renamed from: l */
        void mo32065l(Long l);

        /* renamed from: n */
        void mo32066n(Long l);

        /* renamed from: o */
        void mo32067o(Power power);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp2Service$v */
    class C6282v implements DeviceManipulator.PropertyChangedListener {

        /* renamed from: a */
        final /* synthetic */ C6281u0 f12772a;

        C6282v(BsLamp2Service bsLamp2Service, C6281u0 u0Var) {
            this.f12772a = u0Var;
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
                case 2193:
                    if (str2.equals("Ct")) {
                        c = 4;
                        break;
                    }
                    break;
                case 72920:
                    if (str2.equals("Hue")) {
                        c = 5;
                        break;
                    }
                    break;
                case 82093:
                    if (str2.equals("Rgb")) {
                        c = 6;
                        break;
                    }
                    break;
                case 82886:
                    if (str2.equals("Sat")) {
                        c = 7;
                        break;
                    }
                    break;
                case 77306085:
                    if (str2.equals("Power")) {
                        c = 8;
                        break;
                    }
                    break;
                case 880790796:
                    if (str2.equals("DelayOff")) {
                        c = 9;
                        break;
                    }
                    break;
                case 898856916:
                    if (str2.equals("Flowing")) {
                        c = 10;
                        break;
                    }
                    break;
                case 1998035738:
                    if (str2.equals("Bright")) {
                        c = 11;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    if (propertyInfo2.getProperty("SaveState").isValueValid()) {
                        this.f12772a.mo32058c((Long) propertyInfo2.getValue("SaveState"));
                        return;
                    }
                    return;
                case 1:
                    if (propertyInfo2.getProperty("FlowParams").isValueValid()) {
                        this.f12772a.mo32060e((String) propertyInfo2.getValue("FlowParams"));
                        return;
                    }
                    return;
                case 2:
                    if (propertyInfo2.getProperty("NightTimeInfo").isValueValid()) {
                        this.f12772a.mo32062i((String) propertyInfo2.getValue("NightTimeInfo"));
                        return;
                    }
                    return;
                case 3:
                    if (propertyInfo2.getProperty("ColorMode").isValueValid()) {
                        this.f12772a.mo32065l((Long) propertyInfo2.getValue("ColorMode"));
                        return;
                    }
                    return;
                case 4:
                    if (propertyInfo2.getProperty("Ct").isValueValid()) {
                        this.f12772a.mo32061h((Long) propertyInfo2.getValue("Ct"));
                        return;
                    }
                    return;
                case 5:
                    if (propertyInfo2.getProperty("Hue").isValueValid()) {
                        this.f12772a.mo32066n((Long) propertyInfo2.getValue("Hue"));
                        return;
                    }
                    return;
                case 6:
                    if (propertyInfo2.getProperty("Rgb").isValueValid()) {
                        this.f12772a.mo32063j((Long) propertyInfo2.getValue("Rgb"));
                        return;
                    }
                    return;
                case 7:
                    if (propertyInfo2.getProperty("Sat").isValueValid()) {
                        this.f12772a.mo32064k((Long) propertyInfo2.getValue("Sat"));
                        return;
                    }
                    return;
                case 8:
                    if (propertyInfo2.getProperty("Power").isValueValid()) {
                        this.f12772a.mo32067o(Power.valueOf((String) propertyInfo2.getValue("Power")));
                        return;
                    }
                    return;
                case 9:
                    if (propertyInfo2.getProperty("DelayOff").isValueValid()) {
                        this.f12772a.mo32057b((Long) propertyInfo2.getValue("DelayOff"));
                        return;
                    }
                    return;
                case 10:
                    if (propertyInfo2.getProperty("Flowing").isValueValid()) {
                        this.f12772a.mo32059d((Long) propertyInfo2.getValue("Flowing"));
                        return;
                    }
                    return;
                case 11:
                    if (propertyInfo2.getProperty("Bright").isValueValid()) {
                        this.f12772a.mo32056a((Long) propertyInfo2.getValue("Bright"));
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp2Service$w */
    class C6283w implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12773a;

        C6283w(BsLamp2Service bsLamp2Service, CompletionHandler completionHandler) {
            this.f12773a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12773a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12773a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp2Service$x */
    class C6284x implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12774a;

        C6284x(BsLamp2Service bsLamp2Service, CompletionHandler completionHandler) {
            this.f12774a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12774a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12774a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp2Service$y */
    class C6285y implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12775a;

        C6285y(BsLamp2Service bsLamp2Service, CompletionHandler completionHandler) {
            this.f12775a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12775a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12775a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.BsLamp2Service$z */
    class C6286z implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f12776a;

        C6286z(BsLamp2Service bsLamp2Service, CompletionHandler completionHandler) {
            this.f12776a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f12776a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f12776a.onSucceed();
        }
    }

    public BsLamp2Service(AbstractDevice abstractDevice) {
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
                MiotManager.getDeviceManipulator().invoke(create, new C6272q(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6256i(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getBright(C6255h0 h0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Bright"), new C6247d0(this, h0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getColorMode(C6257i0 i0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "ColorMode"), new C6242b(this, i0Var));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6285y(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getCt(C6259j0 j0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Ct"), new C6249e0(this, j0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getDelayOff(C6261k0 k0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "DelayOff"), new C6246d(this, k0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowParams(C6263l0 l0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "FlowParams"), new C6248e(this, l0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowing(C6265m0 m0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Flowing"), new C6240a(this, m0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getHue(C6267n0 n0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Hue"), new C6251f0(this, n0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getNightTimeInfo(C6269o0 o0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "NightTimeInfo"), new C6252g(this, o0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getPower(C6271p0 p0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Power"), new C6245c0(this, p0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getProperties(C6273q0 q0Var) {
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
            MiotManager.getDeviceManipulator().readProperty(create, new C6243b0(this, q0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getRgb(C6275r0 r0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Rgb"), new C6244c(this, r0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getSat(C6277s0 s0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Sat"), new C6253g0(this, s0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getSaveState(C6279t0 t0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "SaveState"), new C6250f(this, t0Var));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6264m(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6258j(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6278t(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6254h(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6284x(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6274r(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6283w(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6276s(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6266n(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6268o(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6262l(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6280u(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C6286z(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void subscribeNotifications(CompletionHandler completionHandler, C6281u0 u0Var) {
        if (completionHandler == null) {
            throw new IllegalArgumentException("handler is null");
        } else if (u0Var != null) {
            PropertyInfo create = PropertyInfoFactory.create(getService());
            for (Property next : getService().getProperties()) {
                if (next.getDefinition().isNotifiable()) {
                    create.addProperty(next);
                }
            }
            MiotManager.getDeviceManipulator().addPropertyChangedListener(create, new C6260k(this, completionHandler), new C6282v(this, u0Var));
        } else {
            throw new IllegalArgumentException("listener is null");
        }
    }

    public void toggle(CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "toggle");
            if (create != null) {
                MiotManager.getDeviceManipulator().invoke(create, new C6270p(this, completionHandler));
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
            MiotManager.getDeviceManipulator().removePropertyChangedListener(create, new C6241a0(this, completionHandler));
            return;
        }
        throw new IllegalArgumentException("handler is null");
    }
}
