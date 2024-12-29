package com.yeelight.yeelib.p152f;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import com.yeelight.yeelib.data.DeviceDataProvider;
import com.yeelight.yeelib.p150c.p183m.C6324c;
import com.yeelight.yeelib.p152f.C9784e;
import com.yeelight.yeelib.service.UpnpDeviceCherry;
import com.yeelight.yeelib.utils.C4308b;
import java.util.ArrayList;
import java.util.List;
import org.fourthline.cling.binding.annotations.C11735b;
import p164h.p165b.p166a.p167g.C11206a;
import p164h.p165b.p166a.p167g.C11207d;
import p164h.p165b.p166a.p169j.C11435a;
import p164h.p165b.p166a.p169j.C4432d;
import p164h.p165b.p166a.p236e.C11170c;
import p164h.p165b.p166a.p240h.C11211b;
import p164h.p165b.p166a.p240h.p241p.C11232f;
import p164h.p165b.p166a.p240h.p243r.C11252j;
import p164h.p165b.p166a.p240h.p243r.p247n.C11290c0;
import p164h.p165b.p166a.p240h.p248s.C11324d;
import p164h.p165b.p166a.p240h.p248s.C11325e;
import p164h.p165b.p166a.p240h.p248s.C11327g;
import p164h.p165b.p166a.p240h.p248s.C11328h;
import p164h.p165b.p166a.p240h.p248s.C11329i;
import p164h.p165b.p166a.p240h.p248s.C11330j;
import p164h.p165b.p166a.p240h.p248s.C11332l;
import p164h.p165b.p166a.p240h.p248s.C11333m;
import p164h.p165b.p166a.p240h.p248s.C11334n;
import p164h.p165b.p166a.p240h.p252w.C11359b0;
import p164h.p165b.p166a.p240h.p252w.C11363d0;
import p164h.p165b.p166a.p240h.p252w.C11365e0;

/* renamed from: com.yeelight.yeelib.f.z */
public class C9821z implements C9784e.C4213a {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final String f17770f = "z";

    /* renamed from: g */
    public static final C11329i f17771g = new C11329i("Yeelight");

    /* renamed from: h */
    private static C9821z f17772h = null;

    /* renamed from: a */
    public C11170c f17773a = null;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C9826d f17774b = new C9826d(this);

    /* renamed from: c */
    private C9824c f17775c = new C9824c(this, (C9822a) null);
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f17776d = false;

    /* renamed from: e */
    private ServiceConnection f17777e = new C9822a();

    /* renamed from: com.yeelight.yeelib.f.z$a */
    class C9822a implements ServiceConnection {
        C9822a() {
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            String unused = C9821z.f17770f;
            C11170c cVar = (C11170c) iBinder;
            C9821z.this.f17773a = cVar;
            cVar.getRegistry().mo24429t(C9821z.this.f17774b);
            boolean unused2 = C9821z.this.f17776d = true;
            if (C9784e.m23711b().mo31629e()) {
                C9821z.this.mo31706l();
            }
        }

        public void onServiceDisconnected(ComponentName componentName) {
            String unused = C9821z.f17770f;
            C9821z zVar = C9821z.this;
            zVar.f17773a = null;
            boolean unused2 = zVar.f17776d = false;
        }
    }

    /* renamed from: com.yeelight.yeelib.f.z$b */
    class C9823b extends C11206a {
        C9823b(C9821z zVar, C11232f fVar) {
            super(fVar);
        }

        /* renamed from: d */
        public void mo28122d(C11232f fVar, C11252j jVar, String str) {
            String unused = C9821z.f17770f;
        }

        /* renamed from: g */
        public void mo28123g(C11232f fVar) {
            String unused = C9821z.f17770f;
        }
    }

    /* renamed from: com.yeelight.yeelib.f.z$c */
    private class C9824c extends Thread {

        /* renamed from: a */
        Handler f17779a;

        /* renamed from: b */
        private List<Message> f17780b;

        /* renamed from: com.yeelight.yeelib.f.z$c$a */
        class C9825a extends Handler {
            C9825a() {
            }

            public void handleMessage(Message message) {
                int i = message.what;
                if (i != 1) {
                    if (i == 2) {
                        String unused = C9821z.f17770f;
                        C11170c cVar = C9821z.this.f17773a;
                        if (cVar != null && !cVar.getRegistry().mo24434y()) {
                            String unused2 = C9821z.f17770f;
                            C9821z.this.f17773a.getRegistry().pause();
                        }
                    }
                } else if (C9821z.this.f17773a != null) {
                    String unused3 = C9821z.f17770f;
                    boolean y = C9821z.this.f17773a.getRegistry().mo24434y();
                    String unused4 = C9821z.f17770f;
                    if (y) {
                        C9821z.this.f17773a.getRegistry().mo24414g();
                        return;
                    }
                    C9821z.this.f17773a.getControlPoint().mo24374c(new C11290c0(new C11363d0(UpnpDeviceCherry.sUpnpDeviceCherryServiceID)));
                }
            }
        }

        private C9824c() {
            this.f17780b = new ArrayList();
        }

        /* synthetic */ C9824c(C9821z zVar, C9822a aVar) {
            this();
        }

        /* renamed from: b */
        public void mo31710b(int i) {
            Handler handler = this.f17779a;
            if (handler == null) {
                Message message = new Message();
                message.what = i;
                synchronized (this.f17780b) {
                    this.f17780b.add(message);
                }
                return;
            }
            handler.sendEmptyMessage(i);
        }

        public void run() {
            Looper.prepare();
            this.f17779a = new C9825a();
            synchronized (this.f17780b) {
                for (Message sendMessageDelayed : this.f17780b) {
                    this.f17779a.sendMessageDelayed(sendMessageDelayed, 500);
                }
                this.f17780b.clear();
            }
            Looper.loop();
        }
    }

    /* renamed from: com.yeelight.yeelib.f.z$d */
    protected class C9826d extends C11435a {
        protected C9826d(C9821z zVar) {
        }

        /* renamed from: c */
        public void mo31713c(C4432d dVar, C11327g gVar) {
            String unused = C9821z.f17770f;
        }

        /* renamed from: d */
        public void mo31714d(C4432d dVar, C11327g gVar) {
            String unused = C9821z.f17770f;
        }

        /* renamed from: e */
        public void mo31715e(C4432d dVar, C11332l lVar) {
            String unused = C9821z.f17770f;
            "remoteDeviceRemoved, device id: " + ((C11333m) lVar.mo35899p()).mo35922b().mo36059a() + ", device type: " + lVar.mo35903t().mo36090b();
            if (lVar.mo35903t().mo36090b().equals(UpnpDeviceCherry.sUpnpDeviceCherryUDADeviceType)) {
                C4257w.m11947l0().mo23684q1(((C11333m) lVar.mo35899p()).mo35922b().mo36059a());
            }
        }

        /* renamed from: f */
        public void mo31716f(C4432d dVar, C11332l lVar, Exception exc) {
            String unused = C9821z.f17770f;
        }

        /* renamed from: g */
        public void mo31717g(C4432d dVar, C11332l lVar) {
            String unused = C9821z.f17770f;
        }

        /* renamed from: i */
        public void mo31718i(C4432d dVar, C11332l lVar) {
            String unused = C9821z.f17770f;
            "remoteDeviceAdded, device id: " + ((C11333m) lVar.mo35899p()).mo35922b().mo36059a() + ", device type: " + lVar.mo35903t().mo36090b();
            if (lVar.mo35903t().mo36090b().equals(UpnpDeviceCherry.sUpnpDeviceCherryUDADeviceType)) {
                C4257w.m11947l0().mo23652P(new C6324c(lVar));
            }
        }
    }

    static {
        C4308b.m12123b();
    }

    private C9821z() {
        this.f17775c.start();
        C9784e.m23711b().mo31634j(this);
    }

    /* renamed from: f */
    public static C9821z m23873f() {
        if (f17772h == null) {
            f17772h = new C9821z();
        }
        return f17772h;
    }

    /* renamed from: I */
    public void mo23487I() {
        mo31707m();
    }

    /* renamed from: d */
    public void mo31701d(C11206a aVar) {
        this.f17773a.getControlPoint().mo24372a(aVar);
    }

    /* renamed from: e */
    public void mo31702e(C11207d dVar) {
        this.f17773a.getControlPoint().mo24373b(dVar);
    }

    /* renamed from: g */
    public C11334n mo31703g(String str) {
        for (C11332l next : this.f17773a.getRegistry().mo24416i()) {
            if (next.mo35903t().mo36090b().equals(UpnpDeviceCherry.sUpnpDeviceCherryUDADeviceType) && ((C11333m) next.mo35899p()).mo35922b().mo36059a().equals(str)) {
                C11334n[] J = next.mo35902s();
                if (J.length <= 0) {
                    return null;
                }
                C11334n nVar = J[0];
                if (nVar.mo35985f().mo36132a().equals(UpnpDeviceCherry.sUpnpDeviceCherryServiceID)) {
                    return nVar;
                }
                return null;
            }
        }
        return null;
    }

    /* renamed from: h */
    public void mo23488h(int i) {
    }

    /* renamed from: i */
    public void mo31704i(String str) {
        Class<UpnpDeviceCherry> cls = UpnpDeviceCherry.class;
        if (this.f17776d) {
            C11325e eVar = new C11325e(new C11365e0(str));
            C11359b0 b0Var = new C11359b0(UpnpDeviceCherry.sUpnpDeviceCherryUDADeviceType, 1);
            C11324d dVar = new C11324d("Yeelight Cherry Contorl Via Upnp", f17771g, new C11330j("YeelightCherryControl", "Cherry Upnp Device", "v1"));
            C11328h b = new C11735b().mo37285b(cls);
            b.mo35956v(new C11211b(b, cls));
            "notifyBleDeviceConnected, add local device: " + str;
            try {
                this.f17773a.getRegistry().mo24409b(new C11327g(eVar, b0Var, dVar, new C11328h[]{b}));
                C11232f fVar = new C11232f(b.mo35980a("SetDeviceId"));
                fVar.mo35710k("NewDeviceIdValue", str);
                this.f17773a.getControlPoint().mo24372a(new C9823b(this, fVar));
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: j */
    public void mo23489j() {
    }

    /* renamed from: k */
    public void mo31705k(String str) {
        C11327g a;
        if (this.f17776d && (a = this.f17773a.getRegistry().mo24408a(new C11365e0(str), true)) != null) {
            "notifyBleDeviceDisconnected, remove local device: " + str;
            this.f17773a.getRegistry().mo24402C(a);
        }
    }

    /* renamed from: l */
    public void mo31706l() {
        this.f17775c.mo31710b(1);
    }

    /* renamed from: m */
    public void mo31707m() {
        if (this.f17773a != null) {
            this.f17773a.getRegistry().mo24407H();
            this.f17773a.getRegistry().mo24404E();
            C4297y.f7456e.unbindService(this.f17777e);
            this.f17773a = null;
            this.f17776d = false;
            DeviceDataProvider.m22389X();
        }
    }

    /* renamed from: v */
    public void mo23490v() {
    }
}
