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

public class MonoService extends AbstractService {
    public static final String ACTION_addCron = "addCron";
    public static final String ACTION_delCron = "delCron";
    public static final String ACTION_getCron = "getCron";
    public static final String ACTION_openWithMode = "openWithMode";
    public static final String ACTION_restore = "restore";
    public static final String ACTION_sendCmd = "sendCmd";
    public static final String ACTION_setBright = "setBright";
    public static final String ACTION_setDefault = "setDefault";
    public static final String ACTION_setFlowScene = "setFlowScene";
    public static final String ACTION_setPower = "setPower";
    public static final String ACTION_setScene = "setScene";
    public static final String ACTION_toggle = "toggle";
    public static final String PROPERTY_Bright = "Bright";
    public static final String PROPERTY_CmdKey = "CmdKey";
    public static final String PROPERTY_CmdValue = "CmdValue";
    public static final String PROPERTY_CronType = "CronType";
    public static final String PROPERTY_DelayOff = "DelayOff";
    public static final String PROPERTY_Duration = "Duration";
    public static final String PROPERTY_Effect = "Effect";
    public static final String PROPERTY_FlowParams = "FlowParams";
    public static final String PROPERTY_Flowing = "Flowing";
    public static final String PROPERTY_LanMode = "LanMode";
    public static final String PROPERTY_Mode = "Mode";
    public static final String PROPERTY_ParamColors = "ParamColors";
    public static final String PROPERTY_ParamCount = "ParamCount";
    public static final String PROPERTY_ParamFinish = "ParamFinish";
    public static final String PROPERTY_ParamModel = "ParamModel";
    public static final String PROPERTY_Power = "Power";
    public static final String PROPERTY_SaveState = "SaveState";
    public static final String PROPERTY_Temperature = "Temperature";
    public static final String PROPERTY_onFromPower = "onFromPower";
    private static final String TAG = "MonoService";
    private AbstractDevice mDevice = null;

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonoService$a */
    class C9273a implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9280d0 f17220a;

        C9273a(MonoService monoService, C9280d0 d0Var) {
            this.f17220a = d0Var;
        }

        public void onFailed(int i, String str) {
            this.f17220a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("FlowParams");
            if (property.isValueValid()) {
                this.f17220a.onSucceed((String) propertyInfo.getValue("FlowParams"));
                return;
            }
            C9280d0 d0Var = this.f17220a;
            d0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonoService$a0 */
    public enum C9274a0 {
        undefined,
        smooth,
        sudden
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonoService$b */
    class C9275b implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9284f0 f17225a;

        C9275b(MonoService monoService, C9284f0 f0Var) {
            this.f17225a = f0Var;
        }

        public void onFailed(int i, String str) {
            this.f17225a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("LanMode");
            if (property.isValueValid()) {
                this.f17225a.mo30964a((Long) propertyInfo.getValue("LanMode"));
                return;
            }
            C9284f0 f0Var = this.f17225a;
            f0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonoService$b0 */
    public interface C9276b0 {
        /* renamed from: a */
        void mo30956a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonoService$c */
    class C9277c implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9294k0 f17226a;

        C9277c(MonoService monoService, C9294k0 k0Var) {
            this.f17226a = k0Var;
        }

        public void onFailed(int i, String str) {
            this.f17226a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("onFromPower");
            if (property.isValueValid()) {
                this.f17226a.mo30972a((Long) propertyInfo.getValue("onFromPower"));
                return;
            }
            C9294k0 k0Var = this.f17226a;
            k0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonoService$c0 */
    public interface C9278c0 {
        /* renamed from: a */
        void mo30958a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonoService$d */
    class C9279d implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9282e0 f17227a;

        C9279d(MonoService monoService, C9282e0 e0Var) {
            this.f17227a = e0Var;
        }

        public void onFailed(int i, String str) {
            this.f17227a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Flowing");
            if (property.isValueValid()) {
                this.f17227a.mo30962a((Long) propertyInfo.getValue("Flowing"));
                return;
            }
            C9282e0 e0Var = this.f17227a;
            e0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonoService$d0 */
    public interface C9280d0 {
        void onFailed(int i, String str);

        void onSucceed(String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonoService$e */
    class C9281e implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17228a;

        C9281e(MonoService monoService, CompletionHandler completionHandler) {
            this.f17228a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17228a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17228a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonoService$e0 */
    public interface C9282e0 {
        /* renamed from: a */
        void mo30962a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonoService$f */
    class C9283f implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17229a;

        C9283f(MonoService monoService, CompletionHandler completionHandler) {
            this.f17229a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17229a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17229a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonoService$f0 */
    public interface C9284f0 {
        /* renamed from: a */
        void mo30964a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonoService$g */
    class C9285g implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17230a;

        C9285g(MonoService monoService, CompletionHandler completionHandler) {
            this.f17230a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17230a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17230a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonoService$g0 */
    public interface C9286g0 {
        /* renamed from: a */
        void mo30966a(C9296l0 l0Var);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonoService$h */
    class C9287h implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17231a;

        C9287h(MonoService monoService, CompletionHandler completionHandler) {
            this.f17231a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17231a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17231a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonoService$h0 */
    public interface C9288h0 {
        /* renamed from: a */
        void mo28779a(C9296l0 l0Var, Long l, Long l2, Long l3, Long l4, String str, Long l5, Long l6, Long l7);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonoService$i */
    class C9289i implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17232a;

        C9289i(MonoService monoService, CompletionHandler completionHandler) {
            this.f17232a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17232a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17232a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonoService$i0 */
    public interface C9290i0 {
        /* renamed from: a */
        void mo30968a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonoService$j */
    class C9291j implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17233a;

        C9291j(MonoService monoService, CompletionHandler completionHandler) {
            this.f17233a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17233a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17233a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonoService$j0 */
    public interface C9292j0 {
        /* renamed from: a */
        void mo30970a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonoService$k */
    class C9293k implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17234a;

        C9293k(MonoService monoService, CompletionHandler completionHandler) {
            this.f17234a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17234a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f17234a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonoService$k0 */
    public interface C9294k0 {
        /* renamed from: a */
        void mo30972a(Long l);

        void onFailed(int i, String str);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonoService$l */
    class C9295l implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17235a;

        C9295l(MonoService monoService, CompletionHandler completionHandler) {
            this.f17235a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17235a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17235a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonoService$l0 */
    public enum C9296l0 {
        undefined,
        on,
        off
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonoService$m */
    class C9297m implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17240a;

        C9297m(MonoService monoService, CompletionHandler completionHandler) {
            this.f17240a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17240a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17240a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonoService$m0 */
    public interface C9298m0 {
        /* renamed from: a */
        void mo28771a(Long l);

        /* renamed from: b */
        void mo28772b(Long l);

        /* renamed from: c */
        void mo28773c(Long l);

        /* renamed from: d */
        void mo28774d(Long l);

        /* renamed from: e */
        void mo28775e(String str);

        /* renamed from: f */
        void mo28776f(Long l);

        /* renamed from: g */
        void mo28777g(Long l);

        /* renamed from: h */
        void mo28778h(C9296l0 l0Var);
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonoService$n */
    class C9299n implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17241a;

        C9299n(MonoService monoService, CompletionHandler completionHandler) {
            this.f17241a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17241a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17241a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonoService$o */
    class C9300o implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17242a;

        C9300o(MonoService monoService, CompletionHandler completionHandler) {
            this.f17242a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17242a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17242a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonoService$p */
    class C9301p implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17243a;

        C9301p(MonoService monoService, CompletionHandler completionHandler) {
            this.f17243a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17243a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17243a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonoService$q */
    class C9302q implements DeviceManipulator.InvokeCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17244a;

        C9302q(MonoService monoService, CompletionHandler completionHandler) {
            this.f17244a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17244a.onFailed(i, str);
        }

        public void onSucceed(ActionInfo actionInfo) {
            this.f17244a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonoService$r */
    class C9303r implements DeviceManipulator.PropertyChangedListener {

        /* renamed from: a */
        final /* synthetic */ C9298m0 f17245a;

        C9303r(MonoService monoService, C9298m0 m0Var) {
            this.f17245a = m0Var;
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onPropertyChanged(com.miot.common.device.invocation.PropertyInfo r10, java.lang.String r11) {
            /*
                r9 = this;
                int r0 = r11.hashCode()
                java.lang.String r1 = "Bright"
                java.lang.String r2 = "LanMode"
                java.lang.String r3 = "Flowing"
                java.lang.String r4 = "DelayOff"
                java.lang.String r5 = "Power"
                java.lang.String r6 = "onFromPower"
                java.lang.String r7 = "FlowParams"
                java.lang.String r8 = "SaveState"
                switch(r0) {
                    case -2117953292: goto L_0x0050;
                    case -2002016140: goto L_0x0048;
                    case 35911772: goto L_0x0040;
                    case 77306085: goto L_0x0038;
                    case 880790796: goto L_0x0030;
                    case 898856916: goto L_0x0028;
                    case 1611821756: goto L_0x0020;
                    case 1998035738: goto L_0x0018;
                    default: goto L_0x0017;
                }
            L_0x0017:
                goto L_0x0058
            L_0x0018:
                boolean r11 = r11.equals(r1)
                if (r11 == 0) goto L_0x0058
                r11 = 1
                goto L_0x0059
            L_0x0020:
                boolean r11 = r11.equals(r2)
                if (r11 == 0) goto L_0x0058
                r11 = 5
                goto L_0x0059
            L_0x0028:
                boolean r11 = r11.equals(r3)
                if (r11 == 0) goto L_0x0058
                r11 = 7
                goto L_0x0059
            L_0x0030:
                boolean r11 = r11.equals(r4)
                if (r11 == 0) goto L_0x0058
                r11 = 2
                goto L_0x0059
            L_0x0038:
                boolean r11 = r11.equals(r5)
                if (r11 == 0) goto L_0x0058
                r11 = 0
                goto L_0x0059
            L_0x0040:
                boolean r11 = r11.equals(r6)
                if (r11 == 0) goto L_0x0058
                r11 = 6
                goto L_0x0059
            L_0x0048:
                boolean r11 = r11.equals(r7)
                if (r11 == 0) goto L_0x0058
                r11 = 4
                goto L_0x0059
            L_0x0050:
                boolean r11 = r11.equals(r8)
                if (r11 == 0) goto L_0x0058
                r11 = 3
                goto L_0x0059
            L_0x0058:
                r11 = -1
            L_0x0059:
                switch(r11) {
                    case 0: goto L_0x00fb;
                    case 1: goto L_0x00e5;
                    case 2: goto L_0x00cf;
                    case 3: goto L_0x00b9;
                    case 4: goto L_0x00a3;
                    case 5: goto L_0x008c;
                    case 6: goto L_0x0075;
                    case 7: goto L_0x005e;
                    default: goto L_0x005c;
                }
            L_0x005c:
                goto L_0x0114
            L_0x005e:
                com.miot.common.property.Property r11 = r10.getProperty(r3)
                boolean r11 = r11.isValueValid()
                if (r11 == 0) goto L_0x0114
                java.lang.Object r10 = r10.getValue(r3)
                java.lang.Long r10 = (java.lang.Long) r10
                com.yeelight.yeelib.device.xiaomi.MonoService$m0 r11 = r9.f17245a
                r11.mo28773c(r10)
                goto L_0x0114
            L_0x0075:
                com.miot.common.property.Property r11 = r10.getProperty(r6)
                boolean r11 = r11.isValueValid()
                if (r11 == 0) goto L_0x0114
                java.lang.Object r10 = r10.getValue(r6)
                java.lang.Long r10 = (java.lang.Long) r10
                com.yeelight.yeelib.device.xiaomi.MonoService$m0 r11 = r9.f17245a
                r11.mo28776f(r10)
                goto L_0x0114
            L_0x008c:
                com.miot.common.property.Property r11 = r10.getProperty(r2)
                boolean r11 = r11.isValueValid()
                if (r11 == 0) goto L_0x0114
                java.lang.Object r10 = r10.getValue(r2)
                java.lang.Long r10 = (java.lang.Long) r10
                com.yeelight.yeelib.device.xiaomi.MonoService$m0 r11 = r9.f17245a
                r11.mo28777g(r10)
                goto L_0x0114
            L_0x00a3:
                com.miot.common.property.Property r11 = r10.getProperty(r7)
                boolean r11 = r11.isValueValid()
                if (r11 == 0) goto L_0x0114
                java.lang.Object r10 = r10.getValue(r7)
                java.lang.String r10 = (java.lang.String) r10
                com.yeelight.yeelib.device.xiaomi.MonoService$m0 r11 = r9.f17245a
                r11.mo28775e(r10)
                goto L_0x0114
            L_0x00b9:
                com.miot.common.property.Property r11 = r10.getProperty(r8)
                boolean r11 = r11.isValueValid()
                if (r11 == 0) goto L_0x0114
                java.lang.Object r10 = r10.getValue(r8)
                java.lang.Long r10 = (java.lang.Long) r10
                com.yeelight.yeelib.device.xiaomi.MonoService$m0 r11 = r9.f17245a
                r11.mo28774d(r10)
                goto L_0x0114
            L_0x00cf:
                com.miot.common.property.Property r11 = r10.getProperty(r4)
                boolean r11 = r11.isValueValid()
                if (r11 == 0) goto L_0x0114
                java.lang.Object r10 = r10.getValue(r4)
                java.lang.Long r10 = (java.lang.Long) r10
                com.yeelight.yeelib.device.xiaomi.MonoService$m0 r11 = r9.f17245a
                r11.mo28772b(r10)
                goto L_0x0114
            L_0x00e5:
                com.miot.common.property.Property r11 = r10.getProperty(r1)
                boolean r11 = r11.isValueValid()
                if (r11 == 0) goto L_0x0114
                java.lang.Object r10 = r10.getValue(r1)
                java.lang.Long r10 = (java.lang.Long) r10
                com.yeelight.yeelib.device.xiaomi.MonoService$m0 r11 = r9.f17245a
                r11.mo28771a(r10)
                goto L_0x0114
            L_0x00fb:
                com.miot.common.property.Property r11 = r10.getProperty(r5)
                boolean r11 = r11.isValueValid()
                if (r11 == 0) goto L_0x0114
                java.lang.Object r10 = r10.getValue(r5)
                java.lang.String r10 = (java.lang.String) r10
                com.yeelight.yeelib.device.xiaomi.MonoService$l0 r10 = com.yeelight.yeelib.device.xiaomi.MonoService.C9296l0.valueOf(r10)
                com.yeelight.yeelib.device.xiaomi.MonoService$m0 r11 = r9.f17245a
                r11.mo28778h(r10)
            L_0x0114:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.xiaomi.MonoService.C9303r.onPropertyChanged(com.miot.common.device.invocation.PropertyInfo, java.lang.String):void");
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonoService$s */
    class C9304s implements DeviceManipulator.CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ CompletionHandler f17246a;

        C9304s(MonoService monoService, CompletionHandler completionHandler) {
            this.f17246a = completionHandler;
        }

        public void onFailed(int i, String str) {
            this.f17246a.onFailed(i, str);
        }

        public void onSucceed() {
            this.f17246a.onSucceed();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonoService$t */
    class C9305t implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9288h0 f17247a;

        C9305t(MonoService monoService, C9288h0 h0Var) {
            this.f17247a = h0Var;
        }

        public void onFailed(int i, String str) {
            this.f17247a.onFailed(i, str);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v2, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.Long} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onSucceed(com.miot.common.device.invocation.PropertyInfo r14) {
            /*
                r13 = this;
                java.lang.String r0 = "Power"
                com.miot.common.property.Property r0 = r14.getProperty(r0)
                boolean r1 = r0.isValueValid()
                r2 = 0
                if (r1 == 0) goto L_0x0019
                java.lang.Object r0 = r0.getValue()
                java.lang.String r0 = (java.lang.String) r0
                com.yeelight.yeelib.device.xiaomi.MonoService$l0 r0 = com.yeelight.yeelib.device.xiaomi.MonoService.C9296l0.valueOf(r0)
                r4 = r0
                goto L_0x001a
            L_0x0019:
                r4 = r2
            L_0x001a:
                java.lang.String r0 = "Bright"
                com.miot.common.property.Property r0 = r14.getProperty(r0)
                boolean r1 = r0.isValueValid()
                if (r1 == 0) goto L_0x002e
                java.lang.Object r0 = r0.getValue()
                java.lang.Long r0 = (java.lang.Long) r0
                r5 = r0
                goto L_0x002f
            L_0x002e:
                r5 = r2
            L_0x002f:
                java.lang.String r0 = "Temperature"
                com.miot.common.property.Property r0 = r14.getProperty(r0)
                boolean r1 = r0.isValueValid()
                if (r1 == 0) goto L_0x0043
                java.lang.Object r0 = r0.getValue()
                java.lang.Long r0 = (java.lang.Long) r0
                r6 = r0
                goto L_0x0044
            L_0x0043:
                r6 = r2
            L_0x0044:
                java.lang.String r0 = "DelayOff"
                com.miot.common.property.Property r0 = r14.getProperty(r0)
                boolean r1 = r0.isValueValid()
                if (r1 == 0) goto L_0x0058
                java.lang.Object r0 = r0.getValue()
                java.lang.Long r0 = (java.lang.Long) r0
                r7 = r0
                goto L_0x0059
            L_0x0058:
                r7 = r2
            L_0x0059:
                java.lang.String r0 = "SaveState"
                com.miot.common.property.Property r0 = r14.getProperty(r0)
                boolean r1 = r0.isValueValid()
                if (r1 == 0) goto L_0x006d
                java.lang.Object r0 = r0.getValue()
                java.lang.Long r0 = (java.lang.Long) r0
                r8 = r0
                goto L_0x006e
            L_0x006d:
                r8 = r2
            L_0x006e:
                java.lang.String r0 = "FlowParams"
                com.miot.common.property.Property r0 = r14.getProperty(r0)
                boolean r1 = r0.isValueValid()
                if (r1 == 0) goto L_0x0082
                java.lang.Object r0 = r0.getValue()
                java.lang.String r0 = (java.lang.String) r0
                r9 = r0
                goto L_0x0083
            L_0x0082:
                r9 = r2
            L_0x0083:
                java.lang.String r0 = "LanMode"
                com.miot.common.property.Property r0 = r14.getProperty(r0)
                boolean r1 = r0.isValueValid()
                if (r1 == 0) goto L_0x0097
                java.lang.Object r0 = r0.getValue()
                java.lang.Long r0 = (java.lang.Long) r0
                r10 = r0
                goto L_0x0098
            L_0x0097:
                r10 = r2
            L_0x0098:
                java.lang.String r0 = "onFromPower"
                com.miot.common.property.Property r0 = r14.getProperty(r0)
                boolean r1 = r0.isValueValid()
                if (r1 == 0) goto L_0x00ac
                java.lang.Object r0 = r0.getValue()
                java.lang.Long r0 = (java.lang.Long) r0
                r11 = r0
                goto L_0x00ad
            L_0x00ac:
                r11 = r2
            L_0x00ad:
                java.lang.String r0 = "Flowing"
                com.miot.common.property.Property r14 = r14.getProperty(r0)
                boolean r0 = r14.isValueValid()
                if (r0 == 0) goto L_0x00c0
                java.lang.Object r14 = r14.getValue()
                r2 = r14
                java.lang.Long r2 = (java.lang.Long) r2
            L_0x00c0:
                r12 = r2
                com.yeelight.yeelib.device.xiaomi.MonoService$h0 r3 = r13.f17247a
                r3.mo28779a(r4, r5, r6, r7, r8, r9, r10, r11, r12)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.xiaomi.MonoService.C9305t.onSucceed(com.miot.common.device.invocation.PropertyInfo):void");
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonoService$u */
    class C9306u implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9286g0 f17248a;

        C9306u(MonoService monoService, C9286g0 g0Var) {
            this.f17248a = g0Var;
        }

        public void onFailed(int i, String str) {
            this.f17248a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Power");
            if (property.isValueValid()) {
                this.f17248a.mo30966a(C9296l0.valueOf((String) propertyInfo.getValue("Power")));
                return;
            }
            C9286g0 g0Var = this.f17248a;
            g0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonoService$v */
    class C9307v implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9276b0 f17249a;

        C9307v(MonoService monoService, C9276b0 b0Var) {
            this.f17249a = b0Var;
        }

        public void onFailed(int i, String str) {
            this.f17249a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Bright");
            if (property.isValueValid()) {
                this.f17249a.mo30956a((Long) propertyInfo.getValue("Bright"));
                return;
            }
            C9276b0 b0Var = this.f17249a;
            b0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonoService$w */
    class C9308w implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9292j0 f17250a;

        C9308w(MonoService monoService, C9292j0 j0Var) {
            this.f17250a = j0Var;
        }

        public void onFailed(int i, String str) {
            this.f17250a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("Temperature");
            if (property.isValueValid()) {
                this.f17250a.mo30970a((Long) propertyInfo.getValue("Temperature"));
                return;
            }
            C9292j0 j0Var = this.f17250a;
            j0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonoService$x */
    class C9309x implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9278c0 f17251a;

        C9309x(MonoService monoService, C9278c0 c0Var) {
            this.f17251a = c0Var;
        }

        public void onFailed(int i, String str) {
            this.f17251a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("DelayOff");
            if (property.isValueValid()) {
                this.f17251a.mo30958a((Long) propertyInfo.getValue("DelayOff"));
                return;
            }
            C9278c0 c0Var = this.f17251a;
            c0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonoService$y */
    class C9310y implements DeviceManipulator.ReadPropertyCompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C9290i0 f17252a;

        C9310y(MonoService monoService, C9290i0 i0Var) {
            this.f17252a = i0Var;
        }

        public void onFailed(int i, String str) {
            this.f17252a.onFailed(i, str);
        }

        public void onSucceed(PropertyInfo propertyInfo) {
            Property property = propertyInfo.getProperty("SaveState");
            if (property.isValueValid()) {
                this.f17252a.mo30968a((Long) propertyInfo.getValue("SaveState"));
                return;
            }
            C9290i0 i0Var = this.f17252a;
            i0Var.onFailed(ReturnCode.E_INVALID_DATA, "device response valid: " + property.getValue());
        }
    }

    /* renamed from: com.yeelight.yeelib.device.xiaomi.MonoService$z */
    public enum C9311z {
        undefined,
        cfg_pomodoro,
        cfg_lan_ctrl,
        cfg_save_state,
        cfg_init_power
    }

    public MonoService(AbstractDevice abstractDevice) {
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
                MiotManager.getDeviceManipulator().invoke(create, new C9301p(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C9285g(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getBright(C9276b0 b0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Bright"), new C9307v(this, b0Var));
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
                MiotManager.getDeviceManipulator().invoke(create, new C9300o(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void getDelayOff(C9278c0 c0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "DelayOff"), new C9309x(this, c0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowParams(C9280d0 d0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "FlowParams"), new C9273a(this, d0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getFlowing(C9282e0 e0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Flowing"), new C9279d(this, e0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getLanMode(C9284f0 f0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "LanMode"), new C9275b(this, f0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getPower(C9286g0 g0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Power"), new C9306u(this, g0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getProperties(C9288h0 h0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            PropertyInfo create = PropertyInfoFactory.create(getService());
            create.addProperty(getService().getProperty("Power"));
            create.addProperty(getService().getProperty("Bright"));
            create.addProperty(getService().getProperty("Temperature"));
            create.addProperty(getService().getProperty("DelayOff"));
            create.addProperty(getService().getProperty("SaveState"));
            create.addProperty(getService().getProperty("FlowParams"));
            create.addProperty(getService().getProperty("LanMode"));
            create.addProperty(getService().getProperty("onFromPower"));
            create.addProperty(getService().getProperty("Flowing"));
            MiotManager.getDeviceManipulator().readProperty(create, new C9305t(this, h0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getSaveState(C9290i0 i0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "SaveState"), new C9310y(this, i0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getTemperature(C9292j0 j0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "Temperature"), new C9308w(this, j0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void getonFromPower(C9294k0 k0Var) {
        if (this.mDevice.isConnectionEstablished()) {
            MiotManager.getDeviceManipulator().readProperty(PropertyInfoFactory.create(getService(), "onFromPower"), new C9277c(this, k0Var));
            return;
        }
        throw new MiotException("device not configurated connection");
    }

    public void openWithMode(C9296l0 l0Var, C9274a0 a0Var, Long l, Long l2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "openWithMode");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("Power", l0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Effect", a0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Duration", l)) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("Mode", l2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C9295l(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C9287h(this, completionHandler));
                return;
            }
            throw new MiotException("actionInfo is null");
        }
        throw new MiotException("device not configurated connection");
    }

    public void sendCmd(C9311z zVar, String str, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "sendCmd");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("CmdKey", zVar.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("CmdValue", str)) {
                MiotManager.getDeviceManipulator().invoke(create, new C9281e(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setBright(Long l, C9274a0 a0Var, Long l2, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setBright");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (!create.setArgumentValue("Bright", l)) {
                throw new MiotException("invalid value");
            } else if (!create.setArgumentValue("Effect", a0Var.toString())) {
                throw new MiotException("invalid value");
            } else if (create.setArgumentValue("Duration", l2)) {
                MiotManager.getDeviceManipulator().invoke(create, new C9283f(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C9302q(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C9289i(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void setPower(C9296l0 l0Var, CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "setPower");
            if (create == null) {
                throw new MiotException("actionInfo is null");
            } else if (create.setArgumentValue("Power", l0Var.toString())) {
                MiotManager.getDeviceManipulator().invoke(create, new C9297m(this, completionHandler));
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
                MiotManager.getDeviceManipulator().invoke(create, new C9291j(this, completionHandler));
            } else {
                throw new MiotException("invalid value");
            }
        } else {
            throw new MiotException("device not configurated connection");
        }
    }

    public void subscribeNotifications(CompletionHandler completionHandler, C9298m0 m0Var) {
        if (completionHandler == null) {
            throw new IllegalArgumentException("handler is null");
        } else if (m0Var != null) {
            PropertyInfo create = PropertyInfoFactory.create(getService());
            for (Property next : getService().getProperties()) {
                if (next.getDefinition().isNotifiable()) {
                    create.addProperty(next);
                }
            }
            MiotManager.getDeviceManipulator().addPropertyChangedListener(create, new C9293k(this, completionHandler), new C9303r(this, m0Var));
        } else {
            throw new IllegalArgumentException("listener is null");
        }
    }

    public void toggle(CompletionHandler completionHandler) {
        if (this.mDevice.isConnectionEstablished()) {
            ActionInfo create = ActionInfoFactory.create(getService(), "toggle");
            if (create != null) {
                MiotManager.getDeviceManipulator().invoke(create, new C9299n(this, completionHandler));
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
            MiotManager.getDeviceManipulator().removePropertyChangedListener(create, new C9304s(this, completionHandler));
            return;
        }
        throw new IllegalArgumentException("handler is null");
    }
}
