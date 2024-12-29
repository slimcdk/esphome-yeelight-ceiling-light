package com.yeelight.yeelib.p150c.p183m;

import android.view.View;
import androidx.core.view.ViewCompat;
import com.miot.service.manager.timer.TimerCodec;
import com.xiaomi.mipush.sdk.Constants;
import com.yeelight.yeelib.p150c.p151i.C4200i;
import com.yeelight.yeelib.p150c.p151i.C6024e;
import com.yeelight.yeelib.p150c.p184n.C7551c;
import com.yeelight.yeelib.p150c.p184n.C7556g;
import com.yeelight.yeelib.p152f.C9821z;
import com.yeelight.yeelib.p153g.C9856y;
import com.yeelight.yeelib.p185d.C7563a;
import com.yeelight.yeelib.service.UpnpDeviceCherry;
import java.util.ArrayList;
import java.util.Map;
import p164h.p165b.p166a.p167g.C11206a;
import p164h.p165b.p166a.p167g.C11207d;
import p164h.p165b.p166a.p240h.C11221k;
import p164h.p165b.p166a.p240h.p241p.C11232f;
import p164h.p165b.p166a.p240h.p242q.C11236a;
import p164h.p165b.p166a.p240h.p242q.C11237b;
import p164h.p165b.p166a.p240h.p242q.C11239d;
import p164h.p165b.p166a.p240h.p243r.C11252j;
import p164h.p165b.p166a.p240h.p248s.C11332l;
import p164h.p165b.p166a.p240h.p248s.C11333m;
import p164h.p165b.p166a.p240h.p248s.C11334n;
import p164h.p165b.p166a.p240h.p248s.C11335o;
import p164h.p165b.p166a.p240h.p251v.C11355d;

/* renamed from: com.yeelight.yeelib.c.m.c */
public class C6324c extends C4200i {
    /* access modifiers changed from: private */

    /* renamed from: y */
    public static final String f13356y = "c";

    /* renamed from: x */
    C11207d f13357x;

    /* renamed from: com.yeelight.yeelib.c.m.c$a */
    class C6325a extends C11206a {
        C6325a(C6324c cVar, C11232f fVar) {
            super(fVar);
        }

        /* renamed from: d */
        public void mo28122d(C11232f fVar, C11252j jVar, String str) {
            String unused = C6324c.f13356y;
        }

        /* renamed from: g */
        public void mo28123g(C11232f fVar) {
            String unused = C6324c.f13356y;
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.c$b */
    class C6326b extends C11206a {
        C6326b(C6324c cVar, C11232f fVar) {
            super(fVar);
        }

        /* renamed from: d */
        public void mo28122d(C11232f fVar, C11252j jVar, String str) {
            String unused = C6324c.f13356y;
        }

        /* renamed from: g */
        public void mo28123g(C11232f fVar) {
            String unused = C6324c.f13356y;
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.c$c */
    class C6327c extends C11207d {
        C6327c(C11335o oVar, int i) {
            super(oVar, i);
        }

        /* renamed from: c */
        public void mo28124c(C11237b bVar, C11236a aVar, C11252j jVar) {
            String unused = C6324c.f13356y;
        }

        /* renamed from: f */
        public void mo28125f(C11237b bVar) {
            String unused = C6324c.f13356y;
        }

        /* renamed from: g */
        public void mo28126g(C11237b bVar) {
            String unused = C6324c.f13356y;
            Map J = bVar.mo35721J();
            C11355d dVar = (C11355d) J.get("Power");
            if (dVar != null) {
                String unused2 = C6324c.f13356y;
                "SubscriptionCallback, power: " + dVar.toString();
                if (dVar.toString().equals(TimerCodec.ENABLE)) {
                    C6324c.this.mo23408d0().mo27648K0(true);
                } else {
                    C6324c.this.mo23408d0().mo27648K0(false);
                }
            }
            C11355d dVar2 = (C11355d) J.get("Bright");
            if (dVar2 != null) {
                String unused3 = C6324c.f13356y;
                "SubscriptionCallback, bright: " + dVar2.toString();
                C6324c.this.mo23408d0().mo27697k0(Long.valueOf(dVar2.toString()).longValue());
            }
            C11355d dVar3 = (C11355d) J.get("Mode");
            if (dVar3 != null && !dVar3.toString().equals(TimerCodec.DISENABLE)) {
                String unused4 = C6324c.f13356y;
                "SubscriptionCallback, mode: " + dVar3.toString();
                C6324c.this.mo23408d0().mo27630B0(C6024e.C6028d.valueOf(dVar3.toString()));
            }
            C11355d dVar4 = (C11355d) J.get(UpnpDeviceCherry.sColorChangeEventName);
            if (dVar4 != null) {
                String unused5 = C6324c.f13356y;
                "SubscriptionCallback, color: " + dVar4.toString();
                C6324c.this.mo23408d0().mo27699l0(Integer.valueOf(dVar4.toString()).intValue());
            }
            C11355d dVar5 = (C11355d) J.get(UpnpDeviceCherry.sColorTempChangeEventName);
            if (dVar5 != null) {
                String unused6 = C6324c.f13356y;
                "SubscriptionCallback, colorTemp: " + dVar5.toString();
                C6324c.this.mo23408d0().mo27707p0(Integer.valueOf(dVar5.toString()).intValue());
            }
            C11355d dVar6 = (C11355d) J.get(UpnpDeviceCherry.sColorFlowChangeEventName);
            if (dVar6 != null) {
                String unused7 = C6324c.f13356y;
                "SubscriptionCallback, colorFlow: " + dVar6.toString();
                String[] split = dVar6.toString().split(Constants.ACCEPT_TIME_SEPARATOR_SP);
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < split.length / 4; i++) {
                    int i2 = i * 4;
                    arrayList.add(new C7556g.C7557a(Integer.parseInt(split[i2 + 2]) | ViewCompat.MEASURED_STATE_MASK, Integer.parseInt(split[i2])));
                }
                C6324c.this.mo23408d0().mo27701m0(arrayList);
            }
        }

        /* renamed from: h */
        public void mo28127h(C11237b bVar, int i) {
            String unused = C6324c.f13356y;
        }

        /* access modifiers changed from: protected */
        /* renamed from: j */
        public void mo28128j(C11237b bVar, C11252j jVar, Exception exc, String str) {
            String unused = C6324c.f13356y;
            "SubscriptionCallback, failed, msg: " + str;
        }

        /* access modifiers changed from: protected */
        /* renamed from: m */
        public void mo28129m(C11239d dVar, C11221k kVar) {
            String unused = C6324c.f13356y;
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.c$d */
    class C6328d extends C11206a {
        C6328d(C6324c cVar, C11232f fVar) {
            super(fVar);
        }

        /* renamed from: d */
        public void mo28122d(C11232f fVar, C11252j jVar, String str) {
            String unused = C6324c.f13356y;
        }

        /* renamed from: g */
        public void mo28123g(C11232f fVar) {
            String unused = C6324c.f13356y;
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.c$e */
    class C6329e extends C11206a {
        C6329e(C6324c cVar, C11232f fVar) {
            super(fVar);
        }

        /* renamed from: d */
        public void mo28122d(C11232f fVar, C11252j jVar, String str) {
            String unused = C6324c.f13356y;
        }

        /* renamed from: g */
        public void mo28123g(C11232f fVar) {
            String unused = C6324c.f13356y;
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.c$f */
    class C6330f extends C11206a {
        C6330f(C6324c cVar, C11232f fVar) {
            super(fVar);
        }

        /* renamed from: d */
        public void mo28122d(C11232f fVar, C11252j jVar, String str) {
            String unused = C6324c.f13356y;
        }

        /* renamed from: g */
        public void mo28123g(C11232f fVar) {
            String unused = C6324c.f13356y;
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.c$g */
    class C6331g extends C11206a {
        C6331g(C6324c cVar, C11232f fVar) {
            super(fVar);
        }

        /* renamed from: d */
        public void mo28122d(C11232f fVar, C11252j jVar, String str) {
            String unused = C6324c.f13356y;
        }

        /* renamed from: g */
        public void mo28123g(C11232f fVar) {
            String unused = C6324c.f13356y;
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.c$h */
    class C6332h extends C11206a {
        C6332h(C6324c cVar, C11232f fVar) {
            super(fVar);
        }

        /* renamed from: d */
        public void mo28122d(C11232f fVar, C11252j jVar, String str) {
            String unused = C6324c.f13356y;
        }

        /* renamed from: g */
        public void mo28123g(C11232f fVar) {
            String unused = C6324c.f13356y;
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.c$i */
    class C6333i extends C11206a {
        C6333i(C6324c cVar, C11232f fVar) {
            super(fVar);
        }

        /* renamed from: d */
        public void mo28122d(C11232f fVar, C11252j jVar, String str) {
            String unused = C6324c.f13356y;
        }

        /* renamed from: g */
        public void mo28123g(C11232f fVar) {
            String unused = C6324c.f13356y;
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.c$j */
    class C6334j extends C11206a {
        C6334j(C6324c cVar, C11232f fVar) {
            super(fVar);
        }

        /* renamed from: d */
        public void mo28122d(C11232f fVar, C11252j jVar, String str) {
            String unused = C6324c.f13356y;
        }

        /* renamed from: g */
        public void mo28123g(C11232f fVar) {
            String unused = C6324c.f13356y;
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.c$k */
    class C6335k extends C11206a {
        C6335k(C6324c cVar, C11232f fVar) {
            super(fVar);
        }

        /* renamed from: d */
        public void mo28122d(C11232f fVar, C11252j jVar, String str) {
            String unused = C6324c.f13356y;
        }

        /* renamed from: g */
        public void mo28123g(C11232f fVar) {
            String unused = C6324c.f13356y;
        }
    }

    public C6324c(C11332l lVar) {
        super(((C11333m) lVar.mo35899p()).mo35922b().mo36059a(), "yeelink.light.ble1", new C7551c("UpnpDevice"));
        for (C11334n nVar : lVar.mo35902s()) {
            "remoteDeviceAdded, service type: " + nVar.mo35985f().mo36132a();
            if (nVar.mo35985f().mo36132a().equals(UpnpDeviceCherry.sUpnpDeviceCherryServiceID)) {
                mo28121D1(nVar);
                return;
            }
        }
    }

    /* renamed from: A */
    public int mo23299A() {
        return 0;
    }

    /* renamed from: A1 */
    public boolean mo23300A1() {
        C11334n g = C9821z.m23873f().mo31703g(this.f7255r);
        if (g == null) {
            return false;
        }
        C11232f fVar = new C11232f(g.mo35980a(UpnpDeviceCherry.sSetToggleActionName));
        fVar.mo35710k(UpnpDeviceCherry.sToggleInputArgument, TimerCodec.ENABLE);
        C9821z.m23873f().mo31701d(new C6330f(this, fVar));
        return true;
    }

    /* renamed from: D1 */
    public void mo28121D1(C11334n nVar) {
        if (nVar != null) {
            this.f13357x = new C6327c(nVar, 600);
            C9821z.m23873f().mo31702e(this.f13357x);
        }
    }

    /* renamed from: F */
    public int mo23303F() {
        return 0;
    }

    /* renamed from: H */
    public int mo23306H() {
        return 0;
    }

    /* renamed from: U0 */
    public boolean mo23317U0() {
        return false;
    }

    /* renamed from: Y0 */
    public boolean mo23323Y0() {
        return false;
    }

    /* renamed from: b1 */
    public boolean mo23326b1() {
        C11334n g = C9821z.m23873f().mo31703g(this.f7255r);
        if (g == null) {
            return false;
        }
        C11232f fVar = new C11232f(g.mo35980a(UpnpDeviceCherry.sSetPowerActionName));
        fVar.mo35710k(UpnpDeviceCherry.sPowerInputArgument, TimerCodec.DISENABLE);
        C9821z.m23873f().mo31701d(new C6329e(this, fVar));
        return true;
    }

    /* renamed from: c1 */
    public boolean mo23327c1() {
        return false;
    }

    /* renamed from: f1 */
    public boolean mo23328f1(boolean z) {
        return false;
    }

    /* renamed from: g0 */
    public int mo23329g0() {
        return 0;
    }

    /* renamed from: i1 */
    public String mo23330i1() {
        return this.f7238a;
    }

    /* renamed from: k0 */
    public boolean mo23331k0() {
        return false;
    }

    /* renamed from: k1 */
    public boolean mo23332k1() {
        return mo23408d0().mo27681c0();
    }

    /* renamed from: l0 */
    public boolean mo23333l0() {
        return false;
    }

    /* renamed from: l1 */
    public boolean mo23334l1() {
        C11334n g = C9821z.m23873f().mo31703g(this.f7255r);
        if (g == null) {
            return false;
        }
        C11232f fVar = new C11232f(g.mo35980a(UpnpDeviceCherry.sSetPowerActionName));
        fVar.mo35710k(UpnpDeviceCherry.sPowerInputArgument, TimerCodec.ENABLE);
        C9821z.m23873f().mo31701d(new C6328d(this, fVar));
        return true;
    }

    /* renamed from: m0 */
    public boolean mo23335m0() {
        return false;
    }

    /* renamed from: m1 */
    public boolean mo23336m1(int i) {
        return false;
    }

    /* renamed from: n */
    public void mo23337n() {
    }

    /* renamed from: o1 */
    public boolean mo23338o1(C6024e.C6028d dVar) {
        C11334n g = C9821z.m23873f().mo31703g(this.f7255r);
        if (g == null) {
            return false;
        }
        C11232f fVar = new C11232f(g.mo35980a(UpnpDeviceCherry.sSetSaveModeActionName));
        fVar.mo35710k(UpnpDeviceCherry.sSaveModeInputArgument, dVar.name());
        C9821z.m23873f().mo31701d(new C6326b(this, fVar));
        return true;
    }

    /* renamed from: p0 */
    public boolean mo23339p0() {
        return false;
    }

    /* renamed from: p1 */
    public boolean mo23340p1(long j) {
        mo23408d0().mo27697k0(j);
        C11334n g = C9821z.m23873f().mo31703g(this.f7255r);
        if (g == null) {
            return false;
        }
        C11232f fVar = new C11232f(g.mo35980a(UpnpDeviceCherry.sSetBrightActionName));
        fVar.mo35710k(UpnpDeviceCherry.sBrightInputArgument, String.valueOf(j));
        C9821z.m23873f().mo31701d(new C6331g(this, fVar));
        return true;
    }

    /* renamed from: q1 */
    public boolean mo23341q1(int i) {
        mo23408d0().mo27699l0(i);
        C11334n g = C9821z.m23873f().mo31703g(this.f7255r);
        if (g == null) {
            return false;
        }
        C11232f fVar = new C11232f(g.mo35980a(UpnpDeviceCherry.sSetColorActionName));
        fVar.mo35710k(UpnpDeviceCherry.sColorInputArgument, String.valueOf(i));
        C9821z.m23873f().mo31701d(new C6333i(this, fVar));
        return true;
    }

    /* renamed from: r */
    public void mo23342r() {
    }

    /* renamed from: r1 */
    public boolean mo23343r1(int i, int[] iArr, int i2) {
        C11334n g = C9821z.m23873f().mo31703g(this.f7255r);
        if (g == null) {
            return false;
        }
        String str = "";
        for (int i3 : iArr) {
            str = ((((str + i) + ",1") + Constants.ACCEPT_TIME_SEPARATOR_SP + i3) + Constants.ACCEPT_TIME_SEPARATOR_SP + i2) + Constants.ACCEPT_TIME_SEPARATOR_SP;
        }
        String substring = str.substring(0, str.length() - 1);
        "setColorFlow, color flow string: " + substring;
        C11232f fVar = new C11232f(g.mo35980a(UpnpDeviceCherry.sSetColorFlowActionName));
        fVar.mo35710k(UpnpDeviceCherry.sColorFlowInputArgument, substring);
        C9821z.m23873f().mo31701d(new C6334j(this, fVar));
        return true;
    }

    /* renamed from: s */
    public boolean mo23344s(C7563a aVar) {
        return false;
    }

    /* renamed from: s1 */
    public boolean mo23345s1(int i) {
        mo23408d0().mo27707p0(i);
        C11334n g = C9821z.m23873f().mo31703g(this.f7255r);
        if (g == null) {
            return false;
        }
        C11232f fVar = new C11232f(g.mo35980a(UpnpDeviceCherry.sSetColorTempActionName));
        fVar.mo35710k(UpnpDeviceCherry.sColorTempInputArgument, String.valueOf(i));
        C9821z.m23873f().mo31701d(new C6332h(this, fVar));
        return true;
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

    /* renamed from: v1 */
    public boolean mo23350v1(boolean z) {
        return false;
    }

    /* renamed from: w0 */
    public boolean mo23351w0(String str) {
        return false;
    }

    /* renamed from: w1 */
    public boolean mo23352w1(C6024e.C6028d dVar) {
        C11334n g = C9821z.m23873f().mo31703g(this.f7255r);
        if (g == null) {
            return false;
        }
        C11232f fVar = new C11232f(g.mo35980a(UpnpDeviceCherry.sSetModeActionName));
        fVar.mo35710k(UpnpDeviceCherry.sModeInputArgument, dVar.name());
        C9821z.m23873f().mo31701d(new C6325a(this, fVar));
        return true;
    }

    /* renamed from: x */
    public boolean mo23353x(int i, Object obj) {
        return false;
    }

    /* renamed from: x0 */
    public boolean mo23354x0() {
        return false;
    }

    /* renamed from: x1 */
    public boolean mo23355x1(C9856y yVar) {
        C11334n g = C9821z.m23873f().mo31703g(this.f7255r);
        if (g == null) {
            return false;
        }
        C11232f fVar = new C11232f(g.mo35980a(UpnpDeviceCherry.sSetSceneActionName));
        fVar.mo35710k(UpnpDeviceCherry.sSceneInputArgument, yVar.toString());
        C9821z.m23873f().mo31701d(new C6335k(this, fVar));
        return true;
    }

    /* renamed from: y0 */
    public void mo23356y0() {
    }

    /* renamed from: z */
    public String[] mo23357z() {
        return new String[0];
    }
}
