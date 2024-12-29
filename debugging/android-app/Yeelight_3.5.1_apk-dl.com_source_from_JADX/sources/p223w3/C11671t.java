package p223w3;

import androidx.core.view.ViewCompat;
import com.miot.api.CompletionHandler;
import com.miot.common.abstractdevice.AbstractDevice;
import com.miot.common.device.Device;
import com.miot.common.exception.MiotException;
import com.miot.service.manager.timer.TimerCodec;
import com.xiaomi.mipush.sdk.Constants;
import com.yeelight.yeelib.R$drawable;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.device.WifiDeviceBase;
import com.yeelight.yeelib.device.base.DeviceStatusBase;
import com.yeelight.yeelib.device.xiaomi.Color3Service;
import com.yeelight.yeelib.device.xiaomi.YeelightColor3Device;
import com.yeelight.yeelib.interaction.ActionType;
import com.yeelight.yeelib.interaction.DeviceEvent;
import com.yeelight.yeelib.managers.C3108x;
import com.yeelight.yeelib.models.C8308a;
import com.yeelight.yeelib.models.C8327s;
import com.yeelight.yeelib.utils.AppUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import p051j4.C3278f;
import p232y3.C12041e;
import p232y3.C12043g;
import p232y3.C12048k;

/* renamed from: w3.t */
public class C11671t extends WifiDeviceBase {

    /* renamed from: C */
    public static final String f21438C = "t";

    /* renamed from: A */
    CompletionHandler f21439A = new C11685n(this);

    /* renamed from: B */
    Color3Service.C7104u0 f21440B = new C11686o();

    /* renamed from: z */
    CompletionHandler f21441z = new C11684m(this);

    /* renamed from: w3.t$a */
    class C11672a implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f21442a;

        C11672a(C8327s sVar) {
            this.f21442a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11671t.this.mo23221d0().mo31557P0(this.f21442a);
        }
    }

    /* renamed from: w3.t$b */
    class C11673b implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f21444a;

        C11673b(C8327s sVar) {
            this.f21444a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11671t.this.mo23221d0().mo31557P0(this.f21444a);
        }
    }

    /* renamed from: w3.t$c */
    class C11674c implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f21446a;

        C11674c(C8327s sVar) {
            this.f21446a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11671t.this.mo23221d0().mo31557P0(this.f21446a);
        }
    }

    /* renamed from: w3.t$d */
    class C11675d implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f21448a;

        C11675d(C8327s sVar) {
            this.f21448a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11671t.this.mo23221d0().mo31557P0(this.f21448a);
        }
    }

    /* renamed from: w3.t$e */
    class C11676e implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f21450a;

        C11676e(C8327s sVar) {
            this.f21450a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11671t.this.mo23221d0().mo31557P0(this.f21450a);
        }
    }

    /* renamed from: w3.t$f */
    class C11677f implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f21452a;

        C11677f(C8327s sVar) {
            this.f21452a = sVar;
        }

        public void onFailed(int i, String str) {
            String.format("setScene --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11671t.this.mo23221d0().mo31557P0(this.f21452a);
        }
    }

    /* renamed from: w3.t$g */
    class C11678g implements CompletionHandler {
        C11678g(C11671t tVar) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.t$h */
    class C11679h implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f21454a;

        C11679h(boolean z) {
            this.f21454a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11671t.this.mo23221d0().mo31555O0(this.f21454a);
        }
    }

    /* renamed from: w3.t$i */
    class C11680i implements CompletionHandler {
        C11680i(C11671t tVar) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.t$j */
    class C11681j implements CompletionHandler {
        C11681j() {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11671t.this.mo23221d0().mo31573X0(-1);
        }
    }

    /* renamed from: w3.t$k */
    class C11682k implements Color3Service.C7092o0 {
        C11682k() {
        }

        /* renamed from: a */
        public void mo33308a(Color3Service.Power power, Long l, Long l2, Long l3, Long l4, Long l5, Long l6, Long l7, Long l8, Long l9, Long l10, String str, Long l11) {
            StringBuilder sb = new StringBuilder();
            sb.append("power: ");
            sb.append(power.name());
            StringBuilder sb2 = new StringBuilder();
            sb2.append("bright: ");
            sb2.append(l);
            StringBuilder sb3 = new StringBuilder();
            sb3.append("ct: ");
            Long l12 = l2;
            sb3.append(l12);
            StringBuilder sb4 = new StringBuilder();
            sb4.append("temperature: ");
            Long l13 = l3;
            sb4.append(l13);
            StringBuilder sb5 = new StringBuilder();
            sb5.append("mode: ");
            Long l14 = l7;
            sb5.append(l14);
            StringBuilder sb6 = new StringBuilder();
            sb6.append("rgb: ");
            Long l15 = l8;
            sb6.append(l15);
            StringBuilder sb7 = new StringBuilder();
            sb7.append("flowing: ");
            Long l16 = l6;
            sb7.append(l16);
            StringBuilder sb8 = new StringBuilder();
            sb8.append("hue: ");
            Long l17 = l4;
            sb8.append(l17);
            StringBuilder sb9 = new StringBuilder();
            sb9.append("sat: ");
            Long l18 = l5;
            sb9.append(l18);
            StringBuilder sb10 = new StringBuilder();
            sb10.append("delayoff: ");
            Long l19 = l9;
            sb10.append(l19);
            StringBuilder sb11 = new StringBuilder();
            sb11.append("saveState: ");
            Long l20 = l10;
            sb11.append(l20);
            StringBuilder sb12 = new StringBuilder();
            sb12.append("flowParams: ");
            String str2 = str;
            sb12.append(str2);
            StringBuilder sb13 = new StringBuilder();
            sb13.append("onFromPower: ");
            Long l21 = l11;
            sb13.append(l21);
            C11671t.this.m29783Z1(power, l, l12, l13, l17, l18, l16, l14, l15, l19, l20, str2, l21);
        }

        public void onFailed(int i, String str) {
            String.format("getProp --> Failed, error code: %d , description: %s", new Object[]{Integer.valueOf(i), str});
        }
    }

    /* renamed from: w3.t$l */
    class C11683l implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f21458a;

        C11683l(int i) {
            this.f21458a = i;
        }

        public void onFailed(int i, String str) {
            String.format("openWithMode --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11671t.this.mo23221d0().mo31551M0(true);
            C11671t tVar = C11671t.this;
            tVar.mo23165w1(tVar.mo23247j1(this.f21458a));
        }
    }

    /* renamed from: w3.t$m */
    class C11684m implements CompletionHandler {
        C11684m(C11671t tVar) {
        }

        public void onFailed(int i, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("unsubscribe: onFailed, desc: ");
            sb.append(str);
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.t$n */
    class C11685n implements CompletionHandler {
        C11685n(C11671t tVar) {
        }

        public void onFailed(int i, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("subscribe: onFailed, error: ");
            sb.append(i);
            sb.append(", desc: ");
            sb.append(str);
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.t$o */
    class C11686o implements Color3Service.C7104u0 {
        C11686o() {
        }

        /* renamed from: a */
        public void mo33320a(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onBrightChanged: ");
            sb.append(l);
            C11671t.this.mo23221d0().mo31600l0(l.longValue());
        }

        /* renamed from: b */
        public void mo33321b(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onDelayOffChanged: ");
            sb.append(String.valueOf(l));
            if (l == null) {
                return;
            }
            if (C11671t.this.mo23221d0().mo31611r(2) == null) {
                C11671t.this.mo23221d0().mo31577a(new C12041e(l.intValue(), l.intValue()));
            } else {
                C11671t.this.mo23221d0().mo31573X0(l.intValue());
            }
        }

        /* renamed from: c */
        public void mo33322c(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onSaveStateChanged: ");
            sb.append(l);
            C11671t.this.mo23221d0().mo31555O0(l.longValue() == 1);
        }

        /* renamed from: d */
        public void mo33323d(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onFlowingChanged: ");
            sb.append(l);
            int i = (l.longValue() > 0 ? 1 : (l.longValue() == 0 ? 0 : -1));
            DeviceStatusBase d0 = C11671t.this.mo23221d0();
            if (i != 0) {
                d0.mo31531C0(DeviceStatusBase.DeviceMode.DEVICE_MODE_FLOW);
            } else if (d0.mo31627z() == DeviceStatusBase.DeviceMode.DEVICE_MODE_FLOW) {
                ((C12048k) C11671t.this.mo23221d0()).mo42736b1();
            }
            C11671t.this.mo23221d0().mo31618u0(l.longValue() != 0);
        }

        /* renamed from: e */
        public void mo33324e(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("onFlowParamsChanged: ");
            sb.append(str);
            if (!str.isEmpty()) {
                C11671t.this.mo23221d0().mo31616t0(C8308a.m19688b(str));
            }
        }

        /* renamed from: f */
        public void mo33325f(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onOnFromPowerChanged: ");
            sb.append(l);
            C11671t.this.mo23221d0().mo31547K0(l.intValue());
        }

        /* renamed from: g */
        public void mo33326g(Color3Service.Power power) {
            DeviceStatusBase deviceStatusBase;
            StringBuilder sb = new StringBuilder();
            sb.append("onPowerChanged: ");
            sb.append(power.name());
            int i = C11690s.f21466a[power.ordinal()];
            boolean z = true;
            if (i == 1) {
                deviceStatusBase = C11671t.this.mo23221d0();
            } else if (i == 2) {
                deviceStatusBase = C11671t.this.mo23221d0();
                z = false;
            } else {
                return;
            }
            deviceStatusBase.mo31551M0(z);
        }

        /* renamed from: h */
        public void mo33327h(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onCtScaleChanged: ");
            sb.append(l);
            C11671t.this.mo23221d0().mo31610q0(l.intValue());
        }

        /* renamed from: j */
        public void mo33328j(Long l) {
            StringBuilder sb = new StringBuilder();
            sb.append("onRgbChanged: ");
            sb.append(l);
            C11671t.this.mo23221d0().mo31602m0(l.intValue());
        }

        /* renamed from: k */
        public void mo33329k(Long l) {
            C11671t.this.mo23221d0().mo31608p0((long) l.intValue());
        }

        /* renamed from: l */
        public void mo33330l(Long l) {
            DeviceStatusBase d0;
            DeviceStatusBase.DeviceMode deviceMode;
            StringBuilder sb = new StringBuilder();
            sb.append("onColorModeChanged: ");
            sb.append(l);
            if (l.longValue() == 1) {
                d0 = C11671t.this.mo23221d0();
                deviceMode = DeviceStatusBase.DeviceMode.DEVICE_MODE_COLOR;
            } else if (l.longValue() == 2) {
                d0 = C11671t.this.mo23221d0();
                deviceMode = DeviceStatusBase.DeviceMode.DEVICE_MODE_SUNSHINE;
            } else if (l.longValue() == 3) {
                d0 = C11671t.this.mo23221d0();
                deviceMode = DeviceStatusBase.DeviceMode.DEVICE_MODE_COLOR_HSV;
            } else {
                return;
            }
            d0.mo31531C0(deviceMode);
        }

        /* renamed from: n */
        public void mo33331n(Long l) {
            C11671t.this.mo23221d0().mo31606o0((long) l.intValue());
        }
    }

    /* renamed from: w3.t$p */
    class C11687p implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f21461a;

        C11687p(boolean z) {
            this.f21461a = z;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11671t.this.mo23221d0().mo31583d(this.f21461a);
        }
    }

    /* renamed from: w3.t$q */
    class C11688q implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f21463a;

        C11688q(int i) {
            this.f21463a = i;
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11671t.this.mo23221d0().mo31547K0(this.f21463a);
        }
    }

    /* renamed from: w3.t$r */
    class C11689r implements WifiDeviceBase.C6080i {
        C11689r() {
        }

        /* renamed from: a */
        public void mo31500a(Long l) {
            C11671t.this.f21440B.mo33320a(l);
        }

        /* renamed from: h */
        public void mo31501h(Long l) {
            C11671t.this.f21440B.mo33327h(l);
        }

        /* renamed from: j */
        public void mo31502j(Long l) {
            C11671t.this.f21440B.mo33328j(l);
        }

        /* renamed from: k */
        public void mo31503k(Long l) {
        }

        /* renamed from: l */
        public void mo31504l(Long l) {
            C11671t.this.f21440B.mo33330l(l);
        }

        /* renamed from: m */
        public void mo31505m(WifiDeviceBase.Power power) {
            C11671t.this.f21440B.mo33326g(Color3Service.Power.valueOf(power.toString()));
        }
    }

    /* renamed from: w3.t$s */
    static /* synthetic */ class C11690s {

        /* renamed from: a */
        static final /* synthetic */ int[] f21466a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.yeelight.yeelib.device.xiaomi.Color3Service$Power[] r0 = com.yeelight.yeelib.device.xiaomi.Color3Service.Power.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f21466a = r0
                com.yeelight.yeelib.device.xiaomi.Color3Service$Power r1 = com.yeelight.yeelib.device.xiaomi.Color3Service.Power.on     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f21466a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.yeelight.yeelib.device.xiaomi.Color3Service$Power r1 = com.yeelight.yeelib.device.xiaomi.Color3Service.Power.off     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p223w3.C11671t.C11690s.<clinit>():void");
        }
    }

    /* renamed from: w3.t$t */
    class C11691t implements CompletionHandler {
        C11691t() {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11671t.this.mo23221d0().mo31551M0(true);
        }
    }

    /* renamed from: w3.t$u */
    class C11692u implements CompletionHandler {
        C11692u() {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
            C11671t.this.mo23221d0().mo31551M0(false);
        }
    }

    /* renamed from: w3.t$v */
    class C11693v implements CompletionHandler {
        C11693v() {
        }

        public void onFailed(int i, String str) {
            String.format("ColorDevice.toggle --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11671t.this.mo23221d0().mo31567U0();
        }
    }

    /* renamed from: w3.t$w */
    class C11694w implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ long f21470a;

        C11694w(long j) {
            this.f21470a = j;
        }

        public void onFailed(int i, String str) {
            String.format("setBright --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11671t.this.mo23221d0().mo31600l0(this.f21470a);
        }
    }

    /* renamed from: w3.t$x */
    class C11695x implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f21472a;

        C11695x(int i) {
            this.f21472a = i;
        }

        public void onFailed(int i, String str) {
            String.format("setCt --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11671t.this.mo23221d0().mo31610q0(this.f21472a);
        }
    }

    /* renamed from: w3.t$y */
    class C11696y implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int f21474a;

        C11696y(int i) {
            this.f21474a = i;
        }

        public void onFailed(int i, String str) {
            String.format("setColor --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            C11671t.this.mo23221d0().mo31602m0(this.f21474a);
        }
    }

    /* renamed from: w3.t$z */
    class C11697z implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ int[] f21476a;

        /* renamed from: b */
        final /* synthetic */ int f21477b;

        C11697z(int[] iArr, int i) {
            this.f21476a = iArr;
            this.f21477b = i;
        }

        public void onFailed(int i, String str) {
            String.format("setColorFlow --> Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed() {
            ArrayList arrayList = new ArrayList();
            for (int aVar : this.f21476a) {
                arrayList.add(new C12043g.C12044a(aVar, this.f21477b));
            }
            C11671t.this.mo23221d0().mo31604n0(arrayList);
        }
    }

    public C11671t(String str, String str2, String str3, Device.Ownership ownership) {
        super(str, str2, str3, ownership);
        DeviceEvent deviceEvent = DeviceEvent.DEVICE_EVENT_OPEN;
        DeviceEvent deviceEvent2 = DeviceEvent.DEVICE_EVENT_CLOSE;
        DeviceEvent deviceEvent3 = DeviceEvent.DEVICE_EVENT_BRIGHT_CHANGE;
        ActionType actionType = ActionType.ON;
        ActionType actionType2 = ActionType.OFF;
        ActionType actionType3 = ActionType.BRIGHT;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* renamed from: Z1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m29783Z1(com.yeelight.yeelib.device.xiaomi.Color3Service.Power r11, java.lang.Long r12, java.lang.Long r13, java.lang.Long r14, java.lang.Long r15, java.lang.Long r16, java.lang.Long r17, java.lang.Long r18, java.lang.Long r19, java.lang.Long r20, java.lang.Long r21, java.lang.String r22, java.lang.Long r23) {
        /*
            r10 = this;
            r0 = r11
            r1 = 2
            r2 = 1
            if (r17 == 0) goto L_0x0015
            int r3 = r17.intValue()
            if (r3 != r2) goto L_0x0015
            com.yeelight.yeelib.device.base.DeviceStatusBase r3 = r10.mo23221d0()
            com.yeelight.yeelib.device.base.DeviceStatusBase$DeviceMode r4 = com.yeelight.yeelib.device.base.DeviceStatusBase.DeviceMode.DEVICE_MODE_FLOW
        L_0x0011:
            r3.mo31531C0(r4)
            goto L_0x0030
        L_0x0015:
            if (r18 == 0) goto L_0x0030
            com.yeelight.yeelib.device.base.DeviceStatusBase r3 = r10.mo23221d0()
            int r4 = r18.intValue()
            if (r4 != r2) goto L_0x0024
            com.yeelight.yeelib.device.base.DeviceStatusBase$DeviceMode r4 = com.yeelight.yeelib.device.base.DeviceStatusBase.DeviceMode.DEVICE_MODE_COLOR
            goto L_0x0011
        L_0x0024:
            int r4 = r18.intValue()
            if (r4 != r1) goto L_0x002d
            com.yeelight.yeelib.device.base.DeviceStatusBase$DeviceMode r4 = com.yeelight.yeelib.device.base.DeviceStatusBase.DeviceMode.DEVICE_MODE_SUNSHINE
            goto L_0x0011
        L_0x002d:
            com.yeelight.yeelib.device.base.DeviceStatusBase$DeviceMode r4 = com.yeelight.yeelib.device.base.DeviceStatusBase.DeviceMode.DEVICE_MODE_COLOR_HSV
            goto L_0x0011
        L_0x0030:
            r3 = 0
            if (r17 == 0) goto L_0x0047
            com.yeelight.yeelib.device.base.DeviceStatusBase r4 = r10.mo23221d0()
            long r5 = r17.longValue()
            r7 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 == 0) goto L_0x0043
            r5 = 1
            goto L_0x0044
        L_0x0043:
            r5 = 0
        L_0x0044:
            r4.mo31618u0(r5)
        L_0x0047:
            if (r23 == 0) goto L_0x0054
            com.yeelight.yeelib.device.base.DeviceStatusBase r4 = r10.mo23221d0()
            int r5 = r23.intValue()
            r4.mo31547K0(r5)
        L_0x0054:
            if (r19 == 0) goto L_0x0061
            com.yeelight.yeelib.device.base.DeviceStatusBase r4 = r10.mo23221d0()
            int r5 = r19.intValue()
            r4.mo31602m0(r5)
        L_0x0061:
            if (r12 == 0) goto L_0x006e
            com.yeelight.yeelib.device.base.DeviceStatusBase r4 = r10.mo23221d0()
            long r5 = r12.longValue()
            r4.mo31600l0(r5)
        L_0x006e:
            if (r13 == 0) goto L_0x007b
            com.yeelight.yeelib.device.base.DeviceStatusBase r4 = r10.mo23221d0()
            int r5 = r13.intValue()
            r4.mo31610q0(r5)
        L_0x007b:
            if (r14 == 0) goto L_0x0088
            com.yeelight.yeelib.device.base.DeviceStatusBase r4 = r10.mo23221d0()
            int r5 = r14.intValue()
            r4.mo31561R0(r5)
        L_0x0088:
            if (r0 == 0) goto L_0x0098
            com.yeelight.yeelib.device.base.DeviceStatusBase r4 = r10.mo23221d0()
            com.yeelight.yeelib.device.xiaomi.Color3Service$Power r5 = com.yeelight.yeelib.device.xiaomi.Color3Service.Power.on
            if (r0 != r5) goto L_0x0094
            r0 = 1
            goto L_0x0095
        L_0x0094:
            r0 = 0
        L_0x0095:
            r4.mo31551M0(r0)
        L_0x0098:
            if (r15 == 0) goto L_0x00a5
            com.yeelight.yeelib.device.base.DeviceStatusBase r0 = r10.mo23221d0()
            long r4 = r15.longValue()
            r0.mo31606o0(r4)
        L_0x00a5:
            if (r16 == 0) goto L_0x00b2
            com.yeelight.yeelib.device.base.DeviceStatusBase r0 = r10.mo23221d0()
            long r4 = r16.longValue()
            r0.mo31608p0(r4)
        L_0x00b2:
            if (r20 == 0) goto L_0x00e2
            com.yeelight.yeelib.device.base.DeviceStatusBase r0 = r10.mo23221d0()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r0 = r0.mo31611r(r1)
            if (r0 != 0) goto L_0x00d7
            com.yeelight.yeelib.device.base.DeviceStatusBase r0 = r10.mo23221d0()
            y3.e r1 = new y3.e
            int r4 = r20.intValue()
            int r5 = r20.intValue()
            r1.<init>(r4, r5)
            r0.mo31577a(r1)
            goto L_0x00e2
        L_0x00d7:
            com.yeelight.yeelib.device.base.DeviceStatusBase r0 = r10.mo23221d0()
            int r1 = r20.intValue()
            r0.mo31573X0(r1)
        L_0x00e2:
            com.yeelight.yeelib.device.base.DeviceStatusBase r0 = r10.mo23221d0()
            if (r21 == 0) goto L_0x00f3
            long r4 = r21.longValue()
            r6 = 1
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 != 0) goto L_0x00f3
            goto L_0x00f4
        L_0x00f3:
            r2 = 0
        L_0x00f4:
            r0.mo31555O0(r2)
            boolean r0 = r22.isEmpty()
            if (r0 != 0) goto L_0x0108
            com.yeelight.yeelib.device.base.DeviceStatusBase r0 = r10.mo23221d0()
            com.yeelight.yeelib.models.a r1 = com.yeelight.yeelib.models.C8308a.m19688b(r22)
            r0.mo31616t0(r1)
        L_0x0108:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p223w3.C11671t.m29783Z1(com.yeelight.yeelib.device.xiaomi.Color3Service$Power, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.String, java.lang.Long):void");
    }

    /* renamed from: A1 */
    public boolean mo23114A1() {
        if (super.mo23114A1()) {
            return true;
        }
        try {
            mo31477F1().toggle(new C11693v());
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: C1 */
    public boolean mo31474C1() {
        return false;
    }

    /* renamed from: E1 */
    public boolean mo31476E1(String str, int i) {
        return false;
    }

    /* renamed from: F */
    public int mo23116F() {
        if (mo23208T() == null) {
            return R$drawable.icon_yeelight_device_badge_wonder_small;
        }
        String T = mo23208T();
        T.hashCode();
        return !T.equals("yeelink.light.color3") ? R$drawable.icon_yeelight_device_badge_wonder_small : R$drawable.icon_yeelight_device_badge_color3_small;
    }

    /* renamed from: H */
    public int mo23119H() {
        if (mo23208T() == null) {
            return R$drawable.icon_yeelight_device_badge_wonder_big;
        }
        String T = mo23208T();
        T.hashCode();
        return !T.equals("yeelink.light.color3") ? R$drawable.icon_yeelight_device_badge_wonder_big : R$drawable.icon_yeelight_device_badge_color3_big;
    }

    /* renamed from: K1 */
    public void mo31482K1() {
        this.f12430x = new C11689r();
    }

    /* renamed from: M0 */
    public void mo23196M0(AbstractDevice abstractDevice) {
        super.mo23196M0(abstractDevice);
        if (abstractDevice.isOnline()) {
            mo31492U1();
        } else {
            mo31493V1();
        }
    }

    /* renamed from: M1 */
    public boolean mo31484M1(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("setGeekMode --> Invoke, enable : ");
        sb.append(z);
        try {
            mo31477F1().sendCmd(Color3Service.CmdKey.cfg_lan_ctrl, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C11687p(z));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: R1 */
    public boolean mo31489R1(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("setOnFromPower --> Invoke, value : ");
        sb.append(i);
        try {
            mo31477F1().sendCmd(Color3Service.CmdKey.cfg_init_power, String.valueOf(i), new C11688q(i));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: S1 */
    public boolean mo31490S1(boolean z) {
        try {
            mo31477F1().sendCmd(Color3Service.CmdKey.cfg_save_state, z ? TimerCodec.ENABLE : TimerCodec.DISENABLE, new C11679h(z));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: U */
    public String mo23210U() {
        String U = super.mo23210U();
        return (U == null || U.isEmpty()) ? C3108x.f4951e.getResources().getString(R$string.yeelight_device_name_color) : super.mo23210U();
    }

    /* renamed from: U1 */
    public boolean mo31492U1() {
        return mo42373a2(this.f21439A, this.f21440B);
    }

    /* renamed from: V1 */
    public boolean mo31493V1() {
        return mo31494W1(this.f21441z);
    }

    /* renamed from: W1 */
    public boolean mo31494W1(Object obj) {
        if (!(obj instanceof CompletionHandler)) {
            AppUtils.m8300u(f21438C, "Invalid handler!");
        }
        if (this.f4749n == null) {
            return true;
        }
        try {
            mo31477F1().unsubscribeNotifications((CompletionHandler) obj);
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: Y1 */
    public Color3Service mo31477F1() {
        AbstractDevice abstractDevice = this.f4749n;
        if (abstractDevice == null) {
            return null;
        }
        return ((YeelightColor3Device) abstractDevice).mDeviceService;
    }

    /* renamed from: a2 */
    public boolean mo42373a2(Object obj, Object obj2) {
        if ((mo23206S().getOwnership() != Device.Ownership.MINE && mo23206S().getOwnership() != Device.Ownership.OTHERS) || mo23149m0()) {
            return false;
        }
        if (!(obj2 instanceof Color3Service.C7104u0)) {
            AppUtils.m8300u(f21438C, "Invalid handler or listener!");
        }
        try {
            mo31477F1().subscribeNotifications((CompletionHandler) obj, (Color3Service.C7104u0) obj2);
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: b1 */
    public boolean mo23140b1() {
        if (super.mo23140b1()) {
            return true;
        }
        try {
            mo31477F1().setPower(Color3Service.Power.off, new C11692u());
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: c1 */
    public boolean mo23141c1() {
        try {
            mo31477F1().delCron(0L, new C11681j());
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: l1 */
    public boolean mo23148l1() {
        if (super.mo23148l1()) {
            return true;
        }
        try {
            mo31477F1().setPower(Color3Service.Power.on, new C11691t());
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: m1 */
    public boolean mo23150m1(int i) {
        boolean z = true;
        if (super.mo23150m1(i)) {
            return true;
        }
        if (mo31477F1() == null) {
            String str = f21438C;
            StringBuilder sb = new StringBuilder();
            sb.append("AbstractService is null! Device: ");
            sb.append(mo23185G());
            sb.append(", mi device is null? ");
            if (mo23206S() != null) {
                z = false;
            }
            sb.append(z);
            C3278f.m8797b(new AppUtils.SuicideException(str, sb.toString()));
            return false;
        }
        try {
            mo31477F1().openWithMode(Color3Service.Power.on, Color3Service.Effect.smooth, 500L, Long.valueOf((long) i), new C11683l(i));
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: p1 */
    public boolean mo23154p1(long j) {
        if (super.mo23154p1(j)) {
            return true;
        }
        try {
            mo31477F1().setBright(Long.valueOf(j), Color3Service.Effect.smooth, 500L, new C11694w(j));
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: q1 */
    public boolean mo23155q1(int i) {
        int i2 = i & ViewCompat.MEASURED_SIZE_MASK;
        if (super.mo23155q1(i2)) {
            return true;
        }
        try {
            mo31477F1().setRgb(Long.valueOf((long) i2), Color3Service.Effect.smooth, 500L, new C11696y(i2));
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: r1 */
    public boolean mo23157r1(int i, int[] iArr, int i2) {
        if (i < 50) {
            i = 50;
        }
        if (i > 3600000) {
            i = 3600000;
        }
        StringBuilder sb = new StringBuilder();
        for (int i3 = 0; i3 < iArr.length; i3++) {
            if (i3 != 0) {
                sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            }
            sb.append(i);
            sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            sb.append(1);
            sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            sb.append(iArr[i3] & ViewCompat.MEASURED_SIZE_MASK);
            sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            sb.append(i2);
        }
        try {
            mo31477F1().start_cf(0L, 0L, sb.toString(), new C11697z(iArr, i));
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: s1 */
    public boolean mo23159s1(int i) {
        if (super.mo23159s1(i)) {
            return true;
        }
        try {
            mo31477F1().setCt(Long.valueOf((long) i), Color3Service.Effect.smooth, 500L, new C11695x(i));
        } catch (MiotException e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: t1 */
    public boolean mo23160t1() {
        try {
            mo31477F1().setDefault(new C11678g(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: u1 */
    public boolean mo23162u1(int i) {
        try {
            mo31477F1().addCron(0L, Long.valueOf((long) i), new C11680i(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: v0 */
    public void mo23163v0() {
        super.mo23163v0();
        mo31494W1(this.f21441z);
    }

    /* renamed from: v1 */
    public boolean mo23249v1(boolean z) {
        return false;
    }

    /* renamed from: w0 */
    public boolean mo23164w0(String str) {
        String str2 = str;
        try {
            JSONArray jSONArray = new JSONArray(str2);
            if (jSONArray.length() != 13) {
                AppUtils.m8300u("BATCH_RPC", "ColorDevice, Invalid length of batch rpc result: " + str2);
            }
            m29783Z1(Color3Service.Power.valueOf(jSONArray.getString(0)), Long.valueOf(jSONArray.getLong(1)), Long.valueOf(jSONArray.getLong(2)), Long.valueOf(jSONArray.getLong(3)), Long.valueOf(jSONArray.getLong(4)), Long.valueOf(jSONArray.getLong(5)), Long.valueOf(jSONArray.getLong(6)), Long.valueOf(jSONArray.getLong(7)), Long.valueOf(jSONArray.getLong(8)), Long.valueOf(jSONArray.getLong(9)), Long.valueOf(jSONArray.getLong(10)), jSONArray.getString(11), Long.valueOf(jSONArray.getLong(12)));
            return true;
        } catch (JSONException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: x */
    public boolean mo23166x(int i, Object obj) {
        boolean x = super.mo23166x(i, obj);
        if (i == 5) {
            mo23169y0();
        } else if (i == 7) {
            mo23131U0();
        } else if (i == 10) {
            C12041e eVar = (C12041e) obj;
            mo23162u1(eVar.mo42678b());
            mo23221d0().mo31577a(eVar);
        } else if (i == 14) {
            mo23141c1();
        }
        return x;
    }

    /* renamed from: x0 */
    public boolean mo23167x0() {
        if (super.mo23167x0()) {
            return true;
        }
        if (this.f4749n.getOwnership() == Device.Ownership.MINE || this.f4749n.getOwnership() == Device.Ownership.OTHERS) {
            try {
                mo31477F1().getProperties(new C11682k());
            } catch (MiotException e) {
                e.printStackTrace();
            }
        }
        return true;
    }

    /* renamed from: x1 */
    public boolean mo23168x1(C8327s sVar) {
        boolean z = true;
        if (super.mo23168x1(sVar)) {
            return true;
        }
        if (mo31477F1() == null) {
            String str = f21438C;
            StringBuilder sb = new StringBuilder();
            sb.append("AbstractService is null! Device: ");
            sb.append(mo23185G());
            sb.append(", mi device is null? ");
            if (mo23206S() != null) {
                z = false;
            }
            sb.append(z);
            C3278f.m8797b(new AppUtils.SuicideException(str, sb.toString()));
            return false;
        } else if (sVar.mo35455v()) {
            try {
                mo31477F1().setFlowScene("cf", Long.valueOf((long) sVar.mo35436c().mo35339i()), Long.valueOf((long) sVar.mo35436c().mo35336f().ordinal()), sVar.mo35436c().mo35337g(), new C11672a(sVar));
            } catch (MiotException e) {
                e.printStackTrace();
            }
            return true;
        } else if (sVar.mo35423H()) {
            try {
                mo31477F1().setScene("off", 0L, 0L, new C11673b(sVar));
            } catch (MiotException e2) {
                e2.printStackTrace();
            }
            return true;
        } else if (sVar.mo35458y()) {
            try {
                mo31477F1().setScene("bright", Long.valueOf((long) sVar.mo35439f()), 500L, new C11674c(sVar));
            } catch (MiotException e3) {
                e3.printStackTrace();
            }
            return true;
        } else if (sVar.mo35419D()) {
            try {
                mo31477F1().setScene("ct", Long.valueOf((long) sVar.mo35441h()), Long.valueOf((long) sVar.mo35439f()), new C11675d(sVar));
            } catch (MiotException e4) {
                e4.printStackTrace();
            }
            return true;
        } else if (sVar.mo35417B()) {
            try {
                mo31477F1().setScene("color", Long.valueOf((long) (sVar.mo35440g() & ViewCompat.MEASURED_SIZE_MASK)), Long.valueOf((long) sVar.mo35439f()), new C11676e(sVar));
            } catch (MiotException e5) {
                e5.printStackTrace();
            }
            return true;
        } else if (sVar.mo35456w()) {
            try {
                mo31477F1().setFlowScene("cf", Long.valueOf((long) sVar.mo35444k()), Long.valueOf((long) sVar.mo35445l()), sVar.mo35447n(), new C11677f(sVar));
            } catch (MiotException e6) {
                e6.printStackTrace();
            }
            return true;
        } else {
            String str2 = f21438C;
            AppUtils.m8300u(str2, "invalid scene mode: " + sVar.mo35449p());
            return false;
        }
    }

    /* renamed from: z */
    public String[] mo23170z() {
        return new String[]{mo31477F1().getService().getProperty("Power").getInternalName(), mo31477F1().getService().getProperty("Bright").getInternalName(), mo31477F1().getService().getProperty("Ct").getInternalName(), mo31477F1().getService().getProperty("Temperature").getInternalName(), mo31477F1().getService().getProperty("Hue").getInternalName(), mo31477F1().getService().getProperty("Sat").getInternalName(), mo31477F1().getService().getProperty("Flowing").getInternalName(), mo31477F1().getService().getProperty("ColorMode").getInternalName(), mo31477F1().getService().getProperty("Rgb").getInternalName(), mo31477F1().getService().getProperty("DelayOff").getInternalName(), mo31477F1().getService().getProperty("SaveState").getInternalName(), mo31477F1().getService().getProperty("FlowParams").getInternalName(), mo31477F1().getService().getProperty("onFromPower").getInternalName()};
    }
}
