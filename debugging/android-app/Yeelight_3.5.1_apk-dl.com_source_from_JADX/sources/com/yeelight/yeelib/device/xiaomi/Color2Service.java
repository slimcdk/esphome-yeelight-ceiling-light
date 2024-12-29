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

public class Color2Service extends AbstractService {
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
    private static final String TAG = "Color2Service";
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

    public enum Power {
        undefined,
        on,
        off
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color2Service$a */
    class C7010a implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7056w0 f13295a;

        C7010a(Color2Service color2Service, C7056w0 w0Var) {
            this.f13295a = w0Var;
        }

        public void onFailed(int i, String str) {
            this.f13295a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Sat");
            if (property.isValueValid()) {
                this.f13295a.mo33253a((Long) propertyInfo.getValue("Sat"));
                return;
            }
            C7056w0 w0Var = this.f13295a;
            w0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color2Service$a0 */
    class C7011a0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13296a;

        C7011a0(Color2Service color2Service, CompletionHandler completionHandler) {
            this.f13296a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13296a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13296a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color2Service$a1 */
    public interface C7012a1 {
        /* renamed from: a */
        void mo33215a(Long l);

        /* renamed from: b */
        void mo33216b(Long l);

        /* renamed from: c */
        void mo33217c(Long l);

        /* renamed from: d */
        void mo33218d(Long l);

        /* renamed from: e */
        void mo33219e(String str);

        /* renamed from: f */
        void mo33220f(Long l);

        /* renamed from: g */
        void mo33221g(Long l);

        /* renamed from: h */
        void mo33222h(Long l);

        /* renamed from: i */
        void mo33223i(Power power);

        /* renamed from: j */
        void mo33224j(Long l);

        /* renamed from: k */
        void mo33225k(Long l);

        /* renamed from: l */
        void mo33226l(Long l);

        /* renamed from: m */
        void mo33227m(Long l);

        /* renamed from: n */
        void mo33228n(Long l);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color2Service$b */
    class C7013b implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7042p0 f13297a;

        C7013b(Color2Service color2Service, C7042p0 p0Var) {
            this.f13297a = p0Var;
        }

        public void onFailed(int i, String str) {
            this.f13297a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Flowing");
            if (property.isValueValid()) {
                this.f13297a.mo33239a((Long) propertyInfo.getValue("Flowing"));
                return;
            }
            C7042p0 p0Var = this.f13297a;
            p0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color2Service$b0 */
    class C7014b0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13298a;

        C7014b0(Color2Service color2Service, CompletionHandler completionHandler) {
            this.f13298a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13298a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13298a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color2Service$c */
    class C7015c implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7034l0 f13299a;

        C7015c(Color2Service color2Service, C7034l0 l0Var) {
            this.f13299a = l0Var;
        }

        public void onFailed(int i, String str) {
            this.f13299a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("ColorMode");
            if (property.isValueValid()) {
                this.f13299a.mo33231a((Long) propertyInfo.getValue("ColorMode"));
                return;
            }
            C7034l0 l0Var = this.f13299a;
            l0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color2Service$c0 */
    class C7016c0 implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13300a;

        C7016c0(Color2Service color2Service, CompletionHandler completionHandler) {
            this.f13300a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13300a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13300a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color2Service$d */
    class C7017d implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7054v0 f13301a;

        C7017d(Color2Service color2Service, C7054v0 v0Var) {
            this.f13301a = v0Var;
        }

        public void onFailed(int i, String str) {
            this.f13301a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Rgb");
            if (property.isValueValid()) {
                this.f13301a.mo33251a((Long) propertyInfo.getValue("Rgb"));
                return;
            }
            C7054v0 v0Var = this.f13301a;
            v0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color2Service$d0 */
    class C7018d0 implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13302a;

        C7018d0(Color2Service color2Service, CompletionHandler completionHandler) {
            this.f13302a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13302a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f13302a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color2Service$e */
    class C7019e implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7038n0 f13303a;

        C7019e(Color2Service color2Service, C7038n0 n0Var) {
            this.f13303a = n0Var;
        }

        public void onFailed(int i, String str) {
            this.f13303a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("DelayOff");
            if (property.isValueValid()) {
                this.f13303a.mo33235a((Long) propertyInfo.getValue("DelayOff"));
                return;
            }
            C7038n0 n0Var = this.f13303a;
            n0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color2Service$e0 */
    class C7020e0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7052u0 f13304a;

        C7020e0(Color2Service color2Service, C7052u0 u0Var) {
            this.f13304a = u0Var;
        }

        public void onFailed(int i, String str) {
            this.f13304a.onFailed(i, str);
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
                com.yeelight.yeelib.device.xiaomi.Color2Service$Power r1 = com.yeelight.yeelib.device.xiaomi.Color2Service.Power.valueOf(r1)
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
                com.yeelight.yeelib.device.xiaomi.Color2Service$u0 r4 = r0.f13304a
                r4.mo33249a(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.xiaomi.Color2Service.C7020e0.onSucceed(com.miot.common.device.invocation.PropertyInfo):void");
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color2Service$f */
    class C7021f implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7058x0 f13305a;

        C7021f(Color2Service color2Service, C7058x0 x0Var) {
            this.f13305a = x0Var;
        }

        public void onFailed(int i, String str) {
            this.f13305a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("SaveState");
            if (property.isValueValid()) {
                this.f13305a.mo33255a((Long) propertyInfo.getValue("SaveState"));
                return;
            }
            C7058x0 x0Var = this.f13305a;
            x0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color2Service$f0 */
    class C7022f0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7050t0 f13306a;

        C7022f0(Color2Service color2Service, C7050t0 t0Var) {
            this.f13306a = t0Var;
        }

        public void onFailed(int i, String str) {
            this.f13306a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Power");
            if (property.isValueValid()) {
                this.f13306a.mo33247a(Power.valueOf((String) propertyInfo.getValue("Power")));
                return;
            }
            C7050t0 t0Var = this.f13306a;
            t0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color2Service$g */
    class C7023g implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7040o0 f13307a;

        C7023g(Color2Service color2Service, C7040o0 o0Var) {
            this.f13307a = o0Var;
        }

        public void onFailed(int i, String str) {
            this.f13307a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("FlowParams");
            if (property.isValueValid()) {
                this.f13307a.onSucceed((String) propertyInfo.getValue("FlowParams"));
                return;
            }
            C7040o0 o0Var = this.f13307a;
            o0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color2Service$g0 */
    class C7024g0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7032k0 f13308a;

        C7024g0(Color2Service color2Service, C7032k0 k0Var) {
            this.f13308a = k0Var;
        }

        public void onFailed(int i, String str) {
            this.f13308a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Bright");
            if (property.isValueValid()) {
                this.f13308a.mo33229a((Long) propertyInfo.getValue("Bright"));
                return;
            }
            C7032k0 k0Var = this.f13308a;
            k0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color2Service$h */
    class C7025h implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7046r0 f13309a;

        C7025h(Color2Service color2Service, C7046r0 r0Var) {
            this.f13309a = r0Var;
        }

        public void onFailed(int i, String str) {
            this.f13309a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("LanMode");
            if (property.isValueValid()) {
                this.f13309a.mo33243a((Long) propertyInfo.getValue("LanMode"));
                return;
            }
            C7046r0 r0Var = this.f13309a;
            r0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color2Service$h0 */
    class C7026h0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7036m0 f13310a;

        C7026h0(Color2Service color2Service, C7036m0 m0Var) {
            this.f13310a = m0Var;
        }

        public void onFailed(int i, String str) {
            this.f13310a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Ct");
            if (property.isValueValid()) {
                this.f13310a.mo33233a((Long) propertyInfo.getValue("Ct"));
                return;
            }
            C7036m0 m0Var = this.f13310a;
            m0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color2Service$i */
    class C7027i implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7062z0 f13311a;

        C7027i(Color2Service color2Service, C7062z0 z0Var) {
            this.f13311a = z0Var;
        }

        public void onFailed(int i, String str) {
            this.f13311a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("onFromPower");
            if (property.isValueValid()) {
                this.f13311a.mo33259a((Long) propertyInfo.getValue("onFromPower"));
                return;
            }
            C7062z0 z0Var = this.f13311a;
            z0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color2Service$i0 */
    class C7028i0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7060y0 f13312a;

        C7028i0(Color2Service color2Service, C7060y0 y0Var) {
            this.f13312a = y0Var;
        }

        public void onFailed(int i, String str) {
            this.f13312a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Temperature");
            if (property.isValueValid()) {
                this.f13312a.mo33257a((Long) propertyInfo.getValue("Temperature"));
                return;
            }
            C7060y0 y0Var = this.f13312a;
            y0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color2Service$j */
    class C7029j implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7048s0 f13313a;

        C7029j(Color2Service color2Service, C7048s0 s0Var) {
            this.f13313a = s0Var;
        }

        public void onFailed(int i, String str) {
            this.f13313a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("MusicEnable");
            if (property.isValueValid()) {
                this.f13313a.mo33245a((Long) propertyInfo.getValue("MusicEnable"));
                return;
            }
            C7048s0 s0Var = this.f13313a;
            s0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color2Service$j0 */
    class C7030j0 implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C7044q0 f13314a;

        C7030j0(Color2Service color2Service, C7044q0 q0Var) {
            this.f13314a = q0Var;
        }

        public void onFailed(int i, String str) {
            this.f13314a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Hue");
            if (property.isValueValid()) {
                this.f13314a.mo33241a((Long) propertyInfo.getValue("Hue"));
                return;
            }
            C7044q0 q0Var = this.f13314a;
            q0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color2Service$k */
    class C7031k implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13315a;

        C7031k(Color2Service color2Service, CompletionHandler completionHandler) {
            this.f13315a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13315a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f13315a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color2Service$k0 */
    public interface C7032k0 {
        /* renamed from: a */
        void mo33229a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color2Service$l */
    class C7033l implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13316a;

        C7033l(Color2Service color2Service, CompletionHandler completionHandler) {
            this.f13316a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13316a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13316a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color2Service$l0 */
    public interface C7034l0 {
        /* renamed from: a */
        void mo33231a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color2Service$m */
    class C7035m implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13317a;

        C7035m(Color2Service color2Service, CompletionHandler completionHandler) {
            this.f13317a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13317a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13317a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color2Service$m0 */
    public interface C7036m0 {
        /* renamed from: a */
        void mo33233a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color2Service$n */
    class C7037n implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13318a;

        C7037n(Color2Service color2Service, CompletionHandler completionHandler) {
            this.f13318a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13318a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13318a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color2Service$n0 */
    public interface C7038n0 {
        /* renamed from: a */
        void mo33235a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color2Service$o */
    class C7039o implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13319a;

        C7039o(Color2Service color2Service, CompletionHandler completionHandler) {
            this.f13319a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13319a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13319a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color2Service$o0 */
    public interface C7040o0 {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color2Service$p */
    class C7041p implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13320a;

        C7041p(Color2Service color2Service, CompletionHandler completionHandler) {
            this.f13320a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13320a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13320a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color2Service$p0 */
    public interface C7042p0 {
        /* renamed from: a */
        void mo33239a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color2Service$q */
    class C7043q implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13321a;

        C7043q(Color2Service color2Service, CompletionHandler completionHandler) {
            this.f13321a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13321a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13321a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color2Service$q0 */
    public interface C7044q0 {
        /* renamed from: a */
        void mo33241a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color2Service$r */
    class C7045r implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13322a;

        C7045r(Color2Service color2Service, CompletionHandler completionHandler) {
            this.f13322a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13322a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13322a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color2Service$r0 */
    public interface C7046r0 {
        /* renamed from: a */
        void mo33243a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color2Service$s */
    class C7047s implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13323a;

        C7047s(Color2Service color2Service, CompletionHandler completionHandler) {
            this.f13323a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13323a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13323a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color2Service$s0 */
    public interface C7048s0 {
        /* renamed from: a */
        void mo33245a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color2Service$t */
    class C7049t implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13324a;

        C7049t(Color2Service color2Service, CompletionHandler completionHandler) {
            this.f13324a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13324a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13324a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color2Service$t0 */
    public interface C7050t0 {
        /* renamed from: a */
        void mo33247a(Power power);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color2Service$u */
    class C7051u implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13325a;

        C7051u(Color2Service color2Service, CompletionHandler completionHandler) {
            this.f13325a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13325a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13325a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color2Service$u0 */
    public interface C7052u0 {
        /* renamed from: a */
        void mo33249a(Power power, Long l, Long l2, Long l3, Long l4, Long l5, Long l6, Long l7, Long l8, Long l9, Long l10, String str, Long l11, Long l12, Long l13);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color2Service$v */
    class C7053v implements DeviceManipulator.PropertyChangedListener {

        /* renamed from: a */
        final /* synthetic */ C7012a1 f13326a;

        C7053v(Color2Service color2Service, C7012a1 a1Var) {
            this.f13326a = a1Var;
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
                case -1787381784:
                    if (str2.equals("MusicEnable")) {
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
                case 35911772:
                    if (str2.equals("onFromPower")) {
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
                case 1611821756:
                    if (str2.equals("LanMode")) {
                        c = 12;
                        break;
                    }
                    break;
                case 1998035738:
                    if (str2.equals("Bright")) {
                        c = 13;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    PropertyInfo propertyInfo3 = propertyInfo;
                    String str3 = "SaveState";
                    if (propertyInfo3.getProperty(str3).isValueValid()) {
                        this.f13326a.mo33217c((Long) propertyInfo3.getValue(str3));
                        return;
                    }
                    return;
                case 1:
                    String str4 = "FlowParams";
                    PropertyInfo propertyInfo4 = propertyInfo;
                    if (propertyInfo4.getProperty(str4).isValueValid()) {
                        this.f13326a.mo33219e((String) propertyInfo4.getValue(str4));
                        return;
                    }
                    return;
                case 2:
                    PropertyInfo propertyInfo5 = propertyInfo;
                    if (propertyInfo5.getProperty("MusicEnable").isValueValid()) {
                        this.f13326a.mo33227m((Long) propertyInfo5.getValue("MusicEnable"));
                        return;
                    }
                    return;
                case 3:
                    PropertyInfo propertyInfo6 = propertyInfo;
                    if (propertyInfo6.getProperty("ColorMode").isValueValid()) {
                        this.f13326a.mo33226l((Long) propertyInfo6.getValue("ColorMode"));
                        return;
                    }
                    return;
                case 4:
                    PropertyInfo propertyInfo7 = propertyInfo;
                    if (propertyInfo7.getProperty("Ct").isValueValid()) {
                        this.f13326a.mo33222h((Long) propertyInfo7.getValue("Ct"));
                        return;
                    }
                    return;
                case 5:
                    PropertyInfo propertyInfo8 = propertyInfo;
                    if (propertyInfo8.getProperty("Hue").isValueValid()) {
                        this.f13326a.mo33228n((Long) propertyInfo8.getValue("Hue"));
                        return;
                    }
                    return;
                case 6:
                    PropertyInfo propertyInfo9 = propertyInfo;
                    if (propertyInfo9.getProperty("Rgb").isValueValid()) {
                        this.f13326a.mo33224j((Long) propertyInfo9.getValue("Rgb"));
                        return;
                    }
                    return;
                case 7:
                    PropertyInfo propertyInfo10 = propertyInfo;
                    if (propertyInfo10.getProperty("Sat").isValueValid()) {
                        this.f13326a.mo33225k((Long) propertyInfo10.getValue("Sat"));
                        return;
                    }
                    return;
                case 8:
                    PropertyInfo propertyInfo11 = propertyInfo;
                    if (propertyInfo11.getProperty("onFromPower").isValueValid()) {
                        this.f13326a.mo33220f((Long) propertyInfo11.getValue("onFromPower"));
                        return;
                    }
                    return;
                case 9:
                    PropertyInfo propertyInfo12 = propertyInfo;
                    if (propertyInfo12.getProperty("Power").isValueValid()) {
                        this.f13326a.mo33223i(Power.valueOf((String) propertyInfo12.getValue("Power")));
                        return;
                    }
                    return;
                case 10:
                    PropertyInfo propertyInfo13 = propertyInfo;
                    if (propertyInfo13.getProperty("DelayOff").isValueValid()) {
                        this.f13326a.mo33216b((Long) propertyInfo13.getValue("DelayOff"));
                        return;
                    }
                    return;
                case 11:
                    PropertyInfo propertyInfo14 = propertyInfo;
                    if (propertyInfo14.getProperty("Flowing").isValueValid()) {
                        this.f13326a.mo33218d((Long) propertyInfo14.getValue("Flowing"));
                        return;
                    }
                    return;
                case 12:
                    PropertyInfo propertyInfo15 = propertyInfo;
                    if (propertyInfo15.getProperty("LanMode").isValueValid()) {
                        this.f13326a.mo33221g((Long) propertyInfo15.getValue("LanMode"));
                        return;
                    }
                    return;
                case 13:
                    PropertyInfo propertyInfo16 = propertyInfo;
                    if (propertyInfo16.getProperty("Bright").isValueValid()) {
                        this.f13326a.mo33215a((Long) propertyInfo16.getValue("Bright"));
                        return;
                    }
                    break;
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color2Service$v0 */
    public interface C7054v0 {
        /* renamed from: a */
        void mo33251a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color2Service$w */
    class C7055w implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13327a;

        C7055w(Color2Service color2Service, CompletionHandler completionHandler) {
            this.f13327a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13327a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13327a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color2Service$w0 */
    public interface C7056w0 {
        /* renamed from: a */
        void mo33253a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color2Service$x */
    class C7057x implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13328a;

        C7057x(Color2Service color2Service, CompletionHandler completionHandler) {
            this.f13328a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13328a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13328a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color2Service$x0 */
    public interface C7058x0 {
        /* renamed from: a */
        void mo33255a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color2Service$y */
    class C7059y implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13329a;

        C7059y(Color2Service color2Service, CompletionHandler completionHandler) {
            this.f13329a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13329a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13329a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color2Service$y0 */
    public interface C7060y0 {
        /* renamed from: a */
        void mo33257a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color2Service$z */
    class C7061z implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f13330a;

        C7061z(Color2Service color2Service, CompletionHandler completionHandler) {
            this.f13330a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f13330a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f13330a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.Color2Service$z0 */
    public interface C7062z0 {
        /* renamed from: a */
        void mo33259a(Long l);

        void onFailed(int i, String str);
    }

    public Color2Service(AbstractDevice abstractDevice) {
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
                MiotManager.getDeviceManipulator().invoke(create, new C7051u(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7037n(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7033l(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7014b0(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getBright(C7032k0 k0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Bright"), new C7024g0(this, k0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getColorMode(C7034l0 l0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "ColorMode"), new C7015c(this, l0Var));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7011a0(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getCt(C7036m0 m0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Ct"), new C7026h0(this, m0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getDelayOff(C7038n0 n0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "DelayOff"), new C7019e(this, n0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowParams(C7040o0 o0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "FlowParams"), new C7023g(this, o0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowing(C7042p0 p0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Flowing"), new C7013b(this, p0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getHue(C7044q0 q0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Hue"), new C7030j0(this, q0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getLanMode(C7046r0 r0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "LanMode"), new C7025h(this, r0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getMusicEnable(C7048s0 s0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "MusicEnable"), new C7029j(this, s0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getPower(C7050t0 t0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Power"), new C7022f0(this, t0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getProperties(C7052u0 u0Var) {
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
            MiotManager.getDeviceManipulator().readProperty(create, new C7020e0(this, u0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getRgb(C7054v0 v0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Rgb"), new C7017d(this, v0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getSat(C7056w0 w0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Sat"), new C7010a(this, w0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getSaveState(C7058x0 x0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "SaveState"), new C7021f(this, x0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getTemperature(C7060y0 y0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Temperature"), new C7028i0(this, y0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getonFromPower(C7062z0 z0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "onFromPower"), new C7027i(this, z0Var));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7043q(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7039o(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7057x(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7035m(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7061z(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7055w(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7059y(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7045r(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7047s(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7041p(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C7016c0(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void subscribeNotifications(CompletionHandler completionHandler, C7012a1 a1Var) {
        if (completionHandler == null) {
            throw new IllegalArgumentException("handler is null");
        } else if (a1Var != null) {
            PropertyInfo create = PropertyInfoFactory.create(getService());
            for (Property next : getService().getProperties()) {
                if (next.getDefinition().isNotifiable()) {
                    create.addProperty(next);
                }
            }
            MiotManager.getDeviceManipulator().addPropertyChangedListener(create, new C7031k(this, completionHandler), new C7053v(this, a1Var));
        } else {
            throw new IllegalArgumentException("listener is null");
        }
    }

    public void toggle(CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "toggle");
            if (create != null) {
                MiotManager.getDeviceManipulator().invoke(create, new C7049t(this, completionHandler));
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
            MiotManager.getDeviceManipulator().removePropertyChangedListener(create, new C7018d0(this, completionHandler));
            return;
        }
        throw new IllegalArgumentException("handler is null");
    }
}
