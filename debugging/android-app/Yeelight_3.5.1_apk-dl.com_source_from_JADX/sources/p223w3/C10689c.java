package p223w3;

import android.view.View;
import androidx.core.view.ViewCompat;
import com.miot.service.manager.timer.TimerCodec;
import com.xiaomi.mipush.sdk.Constants;
import com.yeelight.yeelib.device.base.C3012e;
import com.yeelight.yeelib.device.base.DeviceStatusBase;
import com.yeelight.yeelib.interaction.ActionType;
import com.yeelight.yeelib.managers.C8302y;
import com.yeelight.yeelib.models.C8327s;
import com.yeelight.yeelib.service.UpnpDeviceCherry;
import java.util.ArrayList;
import java.util.Map;
import org.fourthline.cling.model.UnsupportedDataException;
import org.fourthline.cling.model.gena.CancelReason;
import org.fourthline.cling.model.message.UpnpResponse;
import org.fourthline.cling.model.meta.C10070e;
import p074n6.C9738a;
import p074n6.C9740d;
import p193o6.C9792d;
import p200p6.C10275a;
import p200p6.C10277c;
import p214t6.C10407g;
import p214t6.C10408h;
import p214t6.C10409i;
import p226w6.C11959d;
import p232y3.C12038c;
import p232y3.C12043g;

/* renamed from: w3.c */
public class C10689c extends C3012e {
    /* access modifiers changed from: private */

    /* renamed from: y */
    public static final String f19916y = "c";

    /* renamed from: x */
    C9740d f19917x;

    /* renamed from: w3.c$a */
    class C10690a extends C9738a {
        C10690a(C10689c cVar, C9792d dVar) {
            super(dVar);
        }

        /* renamed from: d */
        public void mo35278d(C9792d dVar, UpnpResponse upnpResponse, String str) {
            String unused = C10689c.f19916y;
        }

        /* renamed from: g */
        public void mo35279g(C9792d dVar) {
            String unused = C10689c.f19916y;
        }
    }

    /* renamed from: w3.c$b */
    class C10691b extends C9738a {
        C10691b(C10689c cVar, C9792d dVar) {
            super(dVar);
        }

        /* renamed from: d */
        public void mo35278d(C9792d dVar, UpnpResponse upnpResponse, String str) {
            String unused = C10689c.f19916y;
        }

        /* renamed from: g */
        public void mo35279g(C9792d dVar) {
            String unused = C10689c.f19916y;
        }
    }

    /* renamed from: w3.c$c */
    class C10692c extends C9740d {
        C10692c(C10070e eVar, int i) {
            super(eVar, i);
        }

        /* renamed from: c */
        public void mo38922c(C10275a aVar, CancelReason cancelReason, UpnpResponse upnpResponse) {
            String unused = C10689c.f19916y;
        }

        /* renamed from: f */
        public void mo38923f(C10275a aVar) {
            String unused = C10689c.f19916y;
        }

        /* renamed from: g */
        public void mo38924g(C10275a aVar) {
            String unused = C10689c.f19916y;
            Map C = aVar.mo41764C();
            C11959d dVar = (C11959d) C.get("Power");
            if (dVar != null) {
                String unused2 = C10689c.f19916y;
                StringBuilder sb = new StringBuilder();
                sb.append("SubscriptionCallback, power: ");
                sb.append(dVar.toString());
                if (dVar.toString().equals(TimerCodec.ENABLE)) {
                    C10689c.this.mo23221d0().mo31551M0(true);
                } else {
                    C10689c.this.mo23221d0().mo31551M0(false);
                }
            }
            C11959d dVar2 = (C11959d) C.get("Bright");
            if (dVar2 != null) {
                String unused3 = C10689c.f19916y;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("SubscriptionCallback, bright: ");
                sb2.append(dVar2.toString());
                C10689c.this.mo23221d0().mo31600l0(Long.valueOf(dVar2.toString()).longValue());
            }
            C11959d dVar3 = (C11959d) C.get("Mode");
            if (dVar3 != null && !dVar3.toString().equals(TimerCodec.DISENABLE)) {
                String unused4 = C10689c.f19916y;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("SubscriptionCallback, mode: ");
                sb3.append(dVar3.toString());
                C10689c.this.mo23221d0().mo31531C0(DeviceStatusBase.DeviceMode.valueOf(dVar3.toString()));
            }
            C11959d dVar4 = (C11959d) C.get(UpnpDeviceCherry.sColorChangeEventName);
            if (dVar4 != null) {
                String unused5 = C10689c.f19916y;
                StringBuilder sb4 = new StringBuilder();
                sb4.append("SubscriptionCallback, color: ");
                sb4.append(dVar4.toString());
                C10689c.this.mo23221d0().mo31602m0(Integer.valueOf(dVar4.toString()).intValue());
            }
            C11959d dVar5 = (C11959d) C.get(UpnpDeviceCherry.sColorTempChangeEventName);
            if (dVar5 != null) {
                String unused6 = C10689c.f19916y;
                StringBuilder sb5 = new StringBuilder();
                sb5.append("SubscriptionCallback, colorTemp: ");
                sb5.append(dVar5.toString());
                C10689c.this.mo23221d0().mo31610q0(Integer.valueOf(dVar5.toString()).intValue());
            }
            C11959d dVar6 = (C11959d) C.get(UpnpDeviceCherry.sColorFlowChangeEventName);
            if (dVar6 != null) {
                String unused7 = C10689c.f19916y;
                StringBuilder sb6 = new StringBuilder();
                sb6.append("SubscriptionCallback, colorFlow: ");
                sb6.append(dVar6.toString());
                String[] split = dVar6.toString().split(Constants.ACCEPT_TIME_SEPARATOR_SP);
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < split.length / 4; i++) {
                    int i2 = i * 4;
                    arrayList.add(new C12043g.C12044a(Integer.parseInt(split[i2 + 2]) | ViewCompat.MEASURED_STATE_MASK, Integer.parseInt(split[i2])));
                }
                C10689c.this.mo23221d0().mo31604n0(arrayList);
            }
        }

        /* renamed from: h */
        public void mo38925h(C10275a aVar, int i) {
            String unused = C10689c.f19916y;
        }

        /* access modifiers changed from: protected */
        /* renamed from: j */
        public void mo38927j(C10275a aVar, UpnpResponse upnpResponse, Exception exc, String str) {
            String unused = C10689c.f19916y;
            StringBuilder sb = new StringBuilder();
            sb.append("SubscriptionCallback, failed, msg: ");
            sb.append(str);
        }

        /* access modifiers changed from: protected */
        /* renamed from: m */
        public void mo38930m(C10277c cVar, UnsupportedDataException unsupportedDataException) {
            String unused = C10689c.f19916y;
        }
    }

    /* renamed from: w3.c$d */
    class C10693d extends C9738a {
        C10693d(C10689c cVar, C9792d dVar) {
            super(dVar);
        }

        /* renamed from: d */
        public void mo35278d(C9792d dVar, UpnpResponse upnpResponse, String str) {
            String unused = C10689c.f19916y;
        }

        /* renamed from: g */
        public void mo35279g(C9792d dVar) {
            String unused = C10689c.f19916y;
        }
    }

    /* renamed from: w3.c$e */
    class C10694e extends C9738a {
        C10694e(C10689c cVar, C9792d dVar) {
            super(dVar);
        }

        /* renamed from: d */
        public void mo35278d(C9792d dVar, UpnpResponse upnpResponse, String str) {
            String unused = C10689c.f19916y;
        }

        /* renamed from: g */
        public void mo35279g(C9792d dVar) {
            String unused = C10689c.f19916y;
        }
    }

    /* renamed from: w3.c$f */
    class C10695f extends C9738a {
        C10695f(C10689c cVar, C9792d dVar) {
            super(dVar);
        }

        /* renamed from: d */
        public void mo35278d(C9792d dVar, UpnpResponse upnpResponse, String str) {
            String unused = C10689c.f19916y;
        }

        /* renamed from: g */
        public void mo35279g(C9792d dVar) {
            String unused = C10689c.f19916y;
        }
    }

    /* renamed from: w3.c$g */
    class C10696g extends C9738a {
        C10696g(C10689c cVar, C9792d dVar) {
            super(dVar);
        }

        /* renamed from: d */
        public void mo35278d(C9792d dVar, UpnpResponse upnpResponse, String str) {
            String unused = C10689c.f19916y;
        }

        /* renamed from: g */
        public void mo35279g(C9792d dVar) {
            String unused = C10689c.f19916y;
        }
    }

    /* renamed from: w3.c$h */
    class C10697h extends C9738a {
        C10697h(C10689c cVar, C9792d dVar) {
            super(dVar);
        }

        /* renamed from: d */
        public void mo35278d(C9792d dVar, UpnpResponse upnpResponse, String str) {
            String unused = C10689c.f19916y;
        }

        /* renamed from: g */
        public void mo35279g(C9792d dVar) {
            String unused = C10689c.f19916y;
        }
    }

    /* renamed from: w3.c$i */
    class C10698i extends C9738a {
        C10698i(C10689c cVar, C9792d dVar) {
            super(dVar);
        }

        /* renamed from: d */
        public void mo35278d(C9792d dVar, UpnpResponse upnpResponse, String str) {
            String unused = C10689c.f19916y;
        }

        /* renamed from: g */
        public void mo35279g(C9792d dVar) {
            String unused = C10689c.f19916y;
        }
    }

    /* renamed from: w3.c$j */
    class C10699j extends C9738a {
        C10699j(C10689c cVar, C9792d dVar) {
            super(dVar);
        }

        /* renamed from: d */
        public void mo35278d(C9792d dVar, UpnpResponse upnpResponse, String str) {
            String unused = C10689c.f19916y;
        }

        /* renamed from: g */
        public void mo35279g(C9792d dVar) {
            String unused = C10689c.f19916y;
        }
    }

    /* renamed from: w3.c$k */
    class C10700k extends C9738a {
        C10700k(C10689c cVar, C9792d dVar) {
            super(dVar);
        }

        /* renamed from: d */
        public void mo35278d(C9792d dVar, UpnpResponse upnpResponse, String str) {
            String unused = C10689c.f19916y;
        }

        /* renamed from: g */
        public void mo35279g(C9792d dVar) {
            String unused = C10689c.f19916y;
        }
    }

    public C10689c(C10407g gVar) {
        super(((C10408h) gVar.mo40506p()).mo42058b().mo40661a(), "yeelink.light.ble1", new C12038c("UpnpDevice"));
        for (C10409i iVar : gVar.mo40509s()) {
            StringBuilder sb = new StringBuilder();
            sb.append("remoteDeviceAdded, service type: ");
            sb.append(iVar.mo40533f().mo40638a());
            if (iVar.mo40533f().mo40638a().equals(UpnpDeviceCherry.sUpnpDeviceCherryServiceID)) {
                mo42235D1(iVar);
                return;
            }
        }
    }

    /* renamed from: A */
    public int mo23113A() {
        return 0;
    }

    /* renamed from: A1 */
    public boolean mo23114A1() {
        C10409i g = C8302y.m19662f().mo35271g(this.f4753r);
        if (g == null) {
            return false;
        }
        C9792d dVar = new C9792d(g.mo40528a(UpnpDeviceCherry.sSetToggleActionName));
        dVar.mo38977k(UpnpDeviceCherry.sToggleInputArgument, TimerCodec.ENABLE);
        C8302y.m19662f().mo35269d(new C10695f(this, dVar));
        return true;
    }

    /* renamed from: D1 */
    public void mo42235D1(C10409i iVar) {
        if (iVar != null) {
            this.f19917x = new C10692c(iVar, 600);
            C8302y.m19662f().mo35270e(this.f19917x);
        }
    }

    /* renamed from: F */
    public int mo23116F() {
        return 0;
    }

    /* renamed from: H */
    public int mo23119H() {
        return 0;
    }

    /* renamed from: U0 */
    public boolean mo23131U0() {
        return false;
    }

    /* renamed from: Y0 */
    public boolean mo23137Y0() {
        return false;
    }

    /* renamed from: b1 */
    public boolean mo23140b1() {
        C10409i g = C8302y.m19662f().mo35271g(this.f4753r);
        if (g == null) {
            return false;
        }
        C9792d dVar = new C9792d(g.mo40528a(UpnpDeviceCherry.sSetPowerActionName));
        dVar.mo38977k(UpnpDeviceCherry.sPowerInputArgument, TimerCodec.DISENABLE);
        C8302y.m19662f().mo35269d(new C10694e(this, dVar));
        return true;
    }

    /* renamed from: c1 */
    public boolean mo23141c1() {
        return false;
    }

    /* renamed from: f1 */
    public boolean mo23142f1(boolean z) {
        return false;
    }

    /* renamed from: g0 */
    public int mo23143g0() {
        return 0;
    }

    /* renamed from: i1 */
    public String mo23144i1() {
        return this.f4736a;
    }

    /* renamed from: k0 */
    public boolean mo23145k0() {
        return false;
    }

    /* renamed from: k1 */
    public boolean mo23146k1() {
        return mo23221d0().mo31584d0();
    }

    /* renamed from: l0 */
    public boolean mo23147l0() {
        return false;
    }

    /* renamed from: l1 */
    public boolean mo23148l1() {
        C10409i g = C8302y.m19662f().mo35271g(this.f4753r);
        if (g == null) {
            return false;
        }
        C9792d dVar = new C9792d(g.mo40528a(UpnpDeviceCherry.sSetPowerActionName));
        dVar.mo38977k(UpnpDeviceCherry.sPowerInputArgument, TimerCodec.ENABLE);
        C8302y.m19662f().mo35269d(new C10693d(this, dVar));
        return true;
    }

    /* renamed from: m0 */
    public boolean mo23149m0() {
        return false;
    }

    /* renamed from: m1 */
    public boolean mo23150m1(int i) {
        return false;
    }

    /* renamed from: n */
    public void mo23151n() {
    }

    /* renamed from: o1 */
    public boolean mo23152o1(DeviceStatusBase.DeviceMode deviceMode) {
        C10409i g = C8302y.m19662f().mo35271g(this.f4753r);
        if (g == null) {
            return false;
        }
        C9792d dVar = new C9792d(g.mo40528a(UpnpDeviceCherry.sSetSaveModeActionName));
        dVar.mo38977k(UpnpDeviceCherry.sSaveModeInputArgument, deviceMode.name());
        C8302y.m19662f().mo35269d(new C10691b(this, dVar));
        return true;
    }

    /* renamed from: p0 */
    public boolean mo23153p0() {
        return false;
    }

    /* renamed from: p1 */
    public boolean mo23154p1(long j) {
        mo23221d0().mo31600l0(j);
        C10409i g = C8302y.m19662f().mo35271g(this.f4753r);
        if (g == null) {
            return false;
        }
        C9792d dVar = new C9792d(g.mo40528a(UpnpDeviceCherry.sSetBrightActionName));
        dVar.mo38977k(UpnpDeviceCherry.sBrightInputArgument, String.valueOf(j));
        C8302y.m19662f().mo35269d(new C10696g(this, dVar));
        return true;
    }

    /* renamed from: q1 */
    public boolean mo23155q1(int i) {
        mo23221d0().mo31602m0(i);
        C10409i g = C8302y.m19662f().mo35271g(this.f4753r);
        if (g == null) {
            return false;
        }
        C9792d dVar = new C9792d(g.mo40528a(UpnpDeviceCherry.sSetColorActionName));
        dVar.mo38977k(UpnpDeviceCherry.sColorInputArgument, String.valueOf(i));
        C8302y.m19662f().mo35269d(new C10698i(this, dVar));
        return true;
    }

    /* renamed from: r */
    public void mo23156r() {
    }

    /* renamed from: r1 */
    public boolean mo23157r1(int i, int[] iArr, int i2) {
        C10409i g = C8302y.m19662f().mo35271g(this.f4753r);
        if (g == null) {
            return false;
        }
        String str = "";
        for (int i3 : iArr) {
            str = ((((str + i) + ",1") + Constants.ACCEPT_TIME_SEPARATOR_SP + i3) + Constants.ACCEPT_TIME_SEPARATOR_SP + i2) + Constants.ACCEPT_TIME_SEPARATOR_SP;
        }
        String substring = str.substring(0, str.length() - 1);
        StringBuilder sb = new StringBuilder();
        sb.append("setColorFlow, color flow string: ");
        sb.append(substring);
        C9792d dVar = new C9792d(g.mo40528a(UpnpDeviceCherry.sSetColorFlowActionName));
        dVar.mo38977k(UpnpDeviceCherry.sColorFlowInputArgument, substring);
        C8302y.m19662f().mo35269d(new C10699j(this, dVar));
        return true;
    }

    /* renamed from: s */
    public boolean mo23158s(ActionType actionType) {
        return false;
    }

    /* renamed from: s1 */
    public boolean mo23159s1(int i) {
        mo23221d0().mo31610q0(i);
        C10409i g = C8302y.m19662f().mo35271g(this.f4753r);
        if (g == null) {
            return false;
        }
        C9792d dVar = new C9792d(g.mo40528a(UpnpDeviceCherry.sSetColorTempActionName));
        dVar.mo38977k(UpnpDeviceCherry.sColorTempInputArgument, String.valueOf(i));
        C8302y.m19662f().mo35269d(new C10697h(this, dVar));
        return true;
    }

    /* renamed from: u0 */
    public void mo23161u0(View view) {
    }

    /* renamed from: u1 */
    public boolean mo23162u1(int i) {
        return false;
    }

    /* renamed from: w0 */
    public boolean mo23164w0(String str) {
        return false;
    }

    /* renamed from: w1 */
    public boolean mo23165w1(DeviceStatusBase.DeviceMode deviceMode) {
        C10409i g = C8302y.m19662f().mo35271g(this.f4753r);
        if (g == null) {
            return false;
        }
        C9792d dVar = new C9792d(g.mo40528a(UpnpDeviceCherry.sSetModeActionName));
        dVar.mo38977k(UpnpDeviceCherry.sModeInputArgument, deviceMode.name());
        C8302y.m19662f().mo35269d(new C10690a(this, dVar));
        return true;
    }

    /* renamed from: x */
    public boolean mo23166x(int i, Object obj) {
        return false;
    }

    /* renamed from: x1 */
    public boolean mo23168x1(C8327s sVar) {
        C10409i g = C8302y.m19662f().mo35271g(this.f4753r);
        if (g == null) {
            return false;
        }
        C9792d dVar = new C9792d(g.mo40528a(UpnpDeviceCherry.sSetSceneActionName));
        dVar.mo38977k(UpnpDeviceCherry.sSceneInputArgument, sVar.toString());
        C8302y.m19662f().mo35269d(new C10700k(this, dVar));
        return true;
    }

    /* renamed from: y0 */
    public void mo23169y0() {
    }

    /* renamed from: z */
    public String[] mo23170z() {
        return new String[0];
    }
}
