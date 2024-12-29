package com.yeelight.yeelib.p150c.p183m;

import android.view.View;
import com.miot.api.CompletionHandler;
import com.miot.common.abstractdevice.AbstractDevice;
import com.miot.common.device.Device;
import com.miot.common.exception.MiotException;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.device.xiaomi.MonoService;
import com.yeelight.yeelib.device.xiaomi.RemoteControlService;
import com.yeelight.yeelib.device.xiaomi.YeelightRemoteControl;
import com.yeelight.yeelib.p150c.C6006h;
import com.yeelight.yeelib.p152f.C4297y;
import com.yeelight.yeelib.p153g.C9856y;
import com.yeelight.yeelib.utils.C4308b;

/* renamed from: com.yeelight.yeelib.c.m.c1 */
public class C6357c1 extends C6006h {

    /* renamed from: G */
    public static final String f13398G = C7403w0.class.getSimpleName();

    /* renamed from: A */
    CompletionHandler f13399A = new C6360c(this);

    /* renamed from: B */
    RemoteControlService.C9448h f13400B = new C6361d(this);

    /* renamed from: z */
    CompletionHandler f13401z = new C6359b(this);

    /* renamed from: com.yeelight.yeelib.c.m.c1$a */
    class C6358a implements RemoteControlService.C9447g {
        C6358a(C6357c1 c1Var) {
        }

        /* renamed from: a */
        public void mo28133a(Long l) {
            "batteryStatus: " + l;
        }

        public void onFailed(int i, String str) {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.c1$b */
    class C6359b implements CompletionHandler {
        C6359b(C6357c1 c1Var) {
        }

        public void onFailed(int i, String str) {
            "unsubscribe: onFailed, desc: " + str;
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.c1$c */
    class C6360c implements CompletionHandler {
        C6360c(C6357c1 c1Var) {
        }

        public void onFailed(int i, String str) {
            "subscribe: onFailed, desc: " + str;
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.c1$d */
    class C6361d implements RemoteControlService.C9448h {
        C6361d(C6357c1 c1Var) {
        }

        /* renamed from: a */
        public void mo28135a(Long l) {
            "onBatteryStatusChanged, batteryStatus: " + l;
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.c1$e */
    class C6362e implements C6006h.C6016j {
        C6362e(C6357c1 c1Var) {
        }

        /* renamed from: a */
        public void mo27583a(Long l) {
        }

        /* renamed from: h */
        public void mo27584h(Long l) {
        }

        /* renamed from: j */
        public void mo27585j(Long l) {
        }

        /* renamed from: k */
        public void mo27586k(Long l) {
        }

        /* renamed from: l */
        public void mo27587l(Long l) {
        }

        /* renamed from: m */
        public void mo27588m(C6006h.C6015i iVar) {
        }
    }

    public C6357c1(String str, String str2, Device.Ownership ownership) {
        super(str, str2, "yeelink.controller.v1", ownership);
    }

    /* renamed from: A1 */
    public boolean mo23300A1() {
        return false;
    }

    /* renamed from: C1 */
    public boolean mo27557C1() {
        return false;
    }

    /* renamed from: E1 */
    public boolean mo27559E1(String str, int i) {
        return false;
    }

    /* renamed from: F */
    public int mo23303F() {
        return 0;
    }

    /* renamed from: H */
    public int mo23306H() {
        return 0;
    }

    /* renamed from: K1 */
    public void mo27565K1() {
        this.f12723x = new C6362e(this);
    }

    /* renamed from: M0 */
    public void mo23383M0(AbstractDevice abstractDevice) {
        super.mo23383M0(abstractDevice);
        if (abstractDevice.isOnline()) {
            mo27575U1();
        } else {
            mo27576V1();
        }
    }

    /* renamed from: M1 */
    public boolean mo27567M1(boolean z) {
        return false;
    }

    /* renamed from: R1 */
    public boolean mo27572R1(int i) {
        return false;
    }

    /* renamed from: S1 */
    public boolean mo27573S1(boolean z) {
        return false;
    }

    /* renamed from: U */
    public String mo23397U() {
        String U = super.mo23397U();
        return (U == null || U.isEmpty()) ? C4297y.f7456e.getResources().getString(R$string.yeelight_device_name_mono) : U;
    }

    /* renamed from: U1 */
    public boolean mo27575U1() {
        return mo28132Y1(this.f13399A, this.f13400B);
    }

    /* renamed from: V1 */
    public boolean mo27576V1() {
        return mo27577W1(this.f13401z);
    }

    /* renamed from: W1 */
    public boolean mo27577W1(Object obj) {
        if (!(obj instanceof CompletionHandler)) {
            C4308b.m12139r(f13398G, "Invalid handler!");
        }
        if (this.f7251n == null) {
            return true;
        }
        try {
            mo27560F1().unsubscribeNotifications((CompletionHandler) obj);
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: X1 */
    public RemoteControlService mo27560F1() {
        return ((YeelightRemoteControl) this.f7251n).mDeviceService;
    }

    /* renamed from: Y1 */
    public boolean mo28132Y1(Object obj, Object obj2) {
        if ((mo23393S().getOwnership() != Device.Ownership.MINE && mo23393S().getOwnership() != Device.Ownership.OTHERS) || mo23335m0()) {
            return false;
        }
        if (!(obj2 instanceof MonoService.C9298m0)) {
            C4308b.m12139r(f13398G, "Invalid handler or listener!");
        }
        try {
            mo27560F1().subscribeNotifications((CompletionHandler) obj, (RemoteControlService.C9448h) obj2);
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: b1 */
    public boolean mo23326b1() {
        return false;
    }

    /* renamed from: c1 */
    public boolean mo23327c1() {
        return false;
    }

    /* renamed from: l1 */
    public boolean mo23334l1() {
        return false;
    }

    /* renamed from: m1 */
    public boolean mo23336m1(int i) {
        return false;
    }

    /* renamed from: p1 */
    public boolean mo23340p1(long j) {
        return false;
    }

    /* renamed from: q1 */
    public boolean mo23341q1(int i) {
        return false;
    }

    /* renamed from: r1 */
    public boolean mo23343r1(int i, int[] iArr, int i2) {
        return false;
    }

    /* renamed from: s1 */
    public boolean mo23345s1(int i) {
        return false;
    }

    /* renamed from: t1 */
    public boolean mo23346t1() {
        return false;
    }

    /* renamed from: u0 */
    public void mo23347u0(View view) {
    }

    /* renamed from: u1 */
    public boolean mo23348u1(int i) {
        return false;
    }

    /* renamed from: v0 */
    public void mo23349v0() {
        super.mo23349v0();
        mo27577W1(this.f13401z);
    }

    /* renamed from: v1 */
    public boolean mo23350v1(boolean z) {
        return false;
    }

    /* renamed from: w0 */
    public boolean mo23351w0(String str) {
        return false;
    }

    /* renamed from: x */
    public boolean mo23353x(int i, Object obj) {
        boolean x = super.mo23353x(i, obj);
        if (i == 5) {
            mo23356y0();
        } else if (i == 7) {
            mo23317U0();
        }
        return x;
    }

    /* renamed from: x0 */
    public boolean mo23354x0() {
        if (this.f7251n.getOwnership() != Device.Ownership.MINE && this.f7251n.getOwnership() != Device.Ownership.OTHERS) {
            return true;
        }
        try {
            mo27560F1().getProperties(new C6358a(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: x1 */
    public boolean mo23355x1(C9856y yVar) {
        return false;
    }

    /* renamed from: z */
    public String[] mo23357z() {
        return new String[0];
    }
}
