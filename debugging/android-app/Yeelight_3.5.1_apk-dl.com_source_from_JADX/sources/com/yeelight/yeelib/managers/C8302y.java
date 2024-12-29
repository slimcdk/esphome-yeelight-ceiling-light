package com.yeelight.yeelib.managers;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import com.yeelight.yeelib.data.DeviceDataProvider;
import com.yeelight.yeelib.managers.C8272e;
import com.yeelight.yeelib.service.UpnpDeviceCherry;
import com.yeelight.yeelib.utils.AppUtils;
import java.util.ArrayList;
import java.util.List;
import org.fourthline.cling.android.C10006c;
import org.fourthline.cling.model.C10013b;
import org.fourthline.cling.model.message.UpnpResponse;
import org.fourthline.cling.model.message.header.C10038b0;
import org.fourthline.cling.model.types.C10102w;
import org.fourthline.cling.model.types.C10104y;
import org.fourthline.cling.model.types.C10105z;
import p074n6.C9738a;
import p074n6.C9740d;
import p127a7.C3982a;
import p127a7.C3983b;
import p180k6.C9299b;
import p193o6.C9792d;
import p214t6.C10401a;
import p214t6.C10402b;
import p214t6.C10403c;
import p214t6.C10404d;
import p214t6.C10405e;
import p214t6.C10406f;
import p214t6.C10407g;
import p214t6.C10408h;
import p214t6.C10409i;
import p223w3.C10689c;

/* renamed from: com.yeelight.yeelib.managers.y */
public class C8302y implements C8272e.C3063a {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final String f14250f = "y";

    /* renamed from: g */
    public static final C10405e f14251g = new C10405e("Yeelight");

    /* renamed from: h */
    private static C8302y f14252h = null;

    /* renamed from: a */
    public C10006c f14253a = null;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C8307d f14254b = new C8307d(this);

    /* renamed from: c */
    private C8305c f14255c = new C8305c(this, (C8303a) null);
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f14256d = false;

    /* renamed from: e */
    private ServiceConnection f14257e = new C8303a();

    /* renamed from: com.yeelight.yeelib.managers.y$a */
    class C8303a implements ServiceConnection {
        C8303a() {
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            String unused = C8302y.f14250f;
            C10006c cVar = (C10006c) iBinder;
            C8302y.this.f14253a = cVar;
            cVar.getRegistry().mo24958u(C8302y.this.f14254b);
            boolean unused2 = C8302y.this.f14256d = true;
            if (C8272e.m19511b().mo35205e()) {
                C8302y.this.mo35274l();
            }
        }

        public void onServiceDisconnected(ComponentName componentName) {
            String unused = C8302y.f14250f;
            C8302y yVar = C8302y.this;
            yVar.f14253a = null;
            boolean unused2 = yVar.f14256d = false;
        }
    }

    /* renamed from: com.yeelight.yeelib.managers.y$b */
    class C8304b extends C9738a {
        C8304b(C8302y yVar, C9792d dVar) {
            super(dVar);
        }

        /* renamed from: d */
        public void mo35278d(C9792d dVar, UpnpResponse upnpResponse, String str) {
            String unused = C8302y.f14250f;
        }

        /* renamed from: g */
        public void mo35279g(C9792d dVar) {
            String unused = C8302y.f14250f;
        }
    }

    /* renamed from: com.yeelight.yeelib.managers.y$c */
    private class C8305c extends Thread {

        /* renamed from: a */
        Handler f14259a;

        /* renamed from: b */
        private List<Message> f14260b;

        /* renamed from: com.yeelight.yeelib.managers.y$c$a */
        class C8306a extends Handler {
            C8306a() {
            }

            public void handleMessage(Message message) {
                int i = message.what;
                if (i != 1) {
                    if (i == 2) {
                        String unused = C8302y.f14250f;
                        C10006c cVar = C8302y.this.f14253a;
                        if (cVar != null && !cVar.getRegistry().mo24960w()) {
                            String unused2 = C8302y.f14250f;
                            C8302y.this.f14253a.getRegistry().pause();
                        }
                    }
                } else if (C8302y.this.f14253a != null) {
                    String unused3 = C8302y.f14250f;
                    boolean w = C8302y.this.f14253a.getRegistry().mo24960w();
                    String unused4 = C8302y.f14250f;
                    if (w) {
                        C8302y.this.f14253a.getRegistry().mo24942g();
                        return;
                    }
                    C8302y.this.f14253a.getControlPoint().mo24153c(new C10038b0(new C10104y(UpnpDeviceCherry.sUpnpDeviceCherryServiceID)));
                }
            }
        }

        private C8305c() {
            this.f14260b = new ArrayList();
        }

        /* synthetic */ C8305c(C8302y yVar, C8303a aVar) {
            this();
        }

        /* renamed from: b */
        public void mo35280b(int i) {
            Handler handler = this.f14259a;
            if (handler == null) {
                Message message = new Message();
                message.what = i;
                synchronized (this.f14260b) {
                    this.f14260b.add(message);
                }
                return;
            }
            handler.sendEmptyMessage(i);
        }

        public void run() {
            Looper.prepare();
            this.f14259a = new C8306a();
            synchronized (this.f14260b) {
                for (Message sendMessageDelayed : this.f14260b) {
                    this.f14259a.sendMessageDelayed(sendMessageDelayed, 500);
                }
                this.f14260b.clear();
            }
            Looper.loop();
        }
    }

    /* renamed from: com.yeelight.yeelib.managers.y$d */
    protected class C8307d extends C3982a {
        protected C8307d(C8302y yVar) {
        }

        /* renamed from: a */
        public void mo26556a(C3983b bVar, C10403c cVar) {
            String unused = C8302y.f14250f;
        }

        /* renamed from: b */
        public void mo26557b(C3983b bVar, C10407g gVar) {
            String unused = C8302y.f14250f;
        }

        /* renamed from: c */
        public void mo26558c(C3983b bVar, C10403c cVar) {
            String unused = C8302y.f14250f;
        }

        /* renamed from: d */
        public void mo26559d(C3983b bVar, C10407g gVar) {
            String unused = C8302y.f14250f;
            StringBuilder sb = new StringBuilder();
            sb.append("remoteDeviceAdded, device id: ");
            sb.append(((C10408h) gVar.mo40506p()).mo42058b().mo40661a());
            sb.append(", device type: ");
            sb.append(gVar.mo40510t().mo40611b());
            if (gVar.mo40510t().mo40611b().equals(UpnpDeviceCherry.sUpnpDeviceCherryUDADeviceType)) {
                YeelightDeviceManager.m7800o0().mo23275Q(new C10689c(gVar));
            }
        }

        /* renamed from: g */
        public void mo26560g(C3983b bVar, C10407g gVar, Exception exc) {
            String unused = C8302y.f14250f;
        }

        /* renamed from: i */
        public void mo26561i(C3983b bVar, C10407g gVar) {
            String unused = C8302y.f14250f;
            StringBuilder sb = new StringBuilder();
            sb.append("remoteDeviceRemoved, device id: ");
            sb.append(((C10408h) gVar.mo40506p()).mo42058b().mo40661a());
            sb.append(", device type: ");
            sb.append(gVar.mo40510t().mo40611b());
            if (gVar.mo40510t().mo40611b().equals(UpnpDeviceCherry.sUpnpDeviceCherryUDADeviceType)) {
                YeelightDeviceManager.m7800o0().mo23317u1(((C10408h) gVar.mo40506p()).mo42058b().mo40661a());
            }
        }
    }

    static {
        new C10105z(AppUtils.m8281b());
    }

    private C8302y() {
        this.f14255c.start();
        C8272e.m19511b().mo35210j(this);
    }

    /* renamed from: f */
    public static C8302y m19662f() {
        if (f14252h == null) {
            f14252h = new C8302y();
        }
        return f14252h;
    }

    /* renamed from: I */
    public void mo23265I() {
        mo35275m();
    }

    /* renamed from: d */
    public void mo35269d(C9738a aVar) {
        this.f14253a.getControlPoint().mo24152b(aVar);
    }

    /* renamed from: e */
    public void mo35270e(C9740d dVar) {
        this.f14253a.getControlPoint().mo24151a(dVar);
    }

    /* renamed from: g */
    public C10409i mo35271g(String str) {
        for (C10407g next : this.f14253a.getRegistry().mo24944i()) {
            if (next.mo40510t().mo40611b().equals(UpnpDeviceCherry.sUpnpDeviceCherryUDADeviceType) && ((C10408h) next.mo40506p()).mo42058b().mo40661a().equals(str)) {
                C10409i[] J = next.mo40509s();
                if (J.length <= 0) {
                    return null;
                }
                C10409i iVar = J[0];
                if (iVar.mo40533f().mo40638a().equals(UpnpDeviceCherry.sUpnpDeviceCherryServiceID)) {
                    return iVar;
                }
                return null;
            }
        }
        return null;
    }

    /* renamed from: h */
    public void mo35272h(String str) {
        Class<UpnpDeviceCherry> cls = UpnpDeviceCherry.class;
        if (this.f14256d) {
            C10402b bVar = new C10402b(new C10105z(str));
            C10102w wVar = new C10102w(UpnpDeviceCherry.sUpnpDeviceCherryUDADeviceType, 1);
            C10401a aVar = new C10401a("Yeelight Cherry Contorl Via Upnp", f14251g, new C10406f("YeelightCherryControl", "Cherry Upnp Device", "v1"));
            C10404d b = new C9299b().mo37844b(cls);
            b.mo42080v(new C10013b(b, cls));
            C10404d[] dVarArr = {b};
            StringBuilder sb = new StringBuilder();
            sb.append("notifyBleDeviceConnected, add local device: ");
            sb.append(str);
            try {
                this.f14253a.getRegistry().mo24922G(new C10403c(bVar, wVar, aVar, dVarArr));
                C9792d dVar = new C9792d(b.mo40528a("SetDeviceId"));
                dVar.mo38977k("NewDeviceIdValue", str);
                this.f14253a.getControlPoint().mo24152b(new C8304b(this, dVar));
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: i */
    public void mo23294i(int i) {
    }

    /* renamed from: j */
    public void mo23296j() {
    }

    /* renamed from: k */
    public void mo35273k(String str) {
        C10403c a;
        if (this.f14256d && (a = this.f14253a.getRegistry().mo24936a(new C10105z(str), true)) != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("notifyBleDeviceDisconnected, remove local device: ");
            sb.append(str);
            this.f14253a.getRegistry().mo24940e(a);
        }
    }

    /* renamed from: l */
    public void mo35274l() {
        this.f14255c.mo35280b(1);
    }

    /* renamed from: m */
    public void mo35275m() {
        if (this.f14253a != null) {
            this.f14253a.getRegistry().mo24923H();
            this.f14253a.getRegistry().mo24918C();
            C3108x.f4951e.unbindService(this.f14257e);
            this.f14253a = null;
            this.f14256d = false;
            DeviceDataProvider.m17611X();
        }
    }

    /* renamed from: v */
    public void mo23318v() {
    }
}
