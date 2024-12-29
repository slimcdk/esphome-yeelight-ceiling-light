package p011c.p083d.p090b;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import p011c.p083d.p090b.C1200r;

/* renamed from: c.d.b.i */
class C1184i {

    /* renamed from: a */
    final C1187b f1996a;

    /* renamed from: b */
    final Context f1997b;

    /* renamed from: c */
    final ExecutorService f1998c;

    /* renamed from: d */
    final C1189j f1999d;

    /* renamed from: e */
    final Map<String, C1160c> f2000e = new LinkedHashMap();

    /* renamed from: f */
    final Map<Object, C1153a> f2001f = new WeakHashMap();

    /* renamed from: g */
    final Map<Object, C1153a> f2002g = new WeakHashMap();

    /* renamed from: h */
    final Set<Object> f2003h = new HashSet();

    /* renamed from: i */
    final Handler f2004i = new C1185a(this.f1996a.getLooper(), this);

    /* renamed from: j */
    final Handler f2005j;

    /* renamed from: k */
    final C1168d f2006k;

    /* renamed from: l */
    final C1155a0 f2007l;

    /* renamed from: m */
    final List<C1160c> f2008m;

    /* renamed from: n */
    final C1188c f2009n;

    /* renamed from: o */
    final boolean f2010o;

    /* renamed from: p */
    boolean f2011p;

    /* renamed from: c.d.b.i$a */
    private static class C1185a extends Handler {

        /* renamed from: a */
        private final C1184i f2012a;

        /* renamed from: c.d.b.i$a$a */
        class C1186a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ Message f2013a;

            C1186a(C1185a aVar, Message message) {
                this.f2013a = message;
            }

            public void run() {
                throw new AssertionError("Unknown handler message received: " + this.f2013a.what);
            }
        }

        public C1185a(Looper looper, C1184i iVar) {
            super(looper);
            this.f2012a = iVar;
        }

        public void handleMessage(Message message) {
            boolean z = false;
            switch (message.what) {
                case 1:
                    this.f2012a.mo9974v((C1153a) message.obj);
                    return;
                case 2:
                    this.f2012a.mo9967o((C1153a) message.obj);
                    return;
                case 4:
                    this.f2012a.mo9968p((C1160c) message.obj);
                    return;
                case 5:
                    this.f2012a.mo9973u((C1160c) message.obj);
                    return;
                case 6:
                    this.f2012a.mo9969q((C1160c) message.obj, false);
                    return;
                case 7:
                    this.f2012a.mo9966n();
                    return;
                case 9:
                    this.f2012a.mo9970r((NetworkInfo) message.obj);
                    return;
                case 10:
                    C1184i iVar = this.f2012a;
                    if (message.arg1 == 1) {
                        z = true;
                    }
                    iVar.mo9965m(z);
                    return;
                case 11:
                    this.f2012a.mo9971s(message.obj);
                    return;
                case 12:
                    this.f2012a.mo9972t(message.obj);
                    return;
                default:
                    C1203t.f2054p.post(new C1186a(this, message));
                    return;
            }
        }
    }

    /* renamed from: c.d.b.i$b */
    static class C1187b extends HandlerThread {
        C1187b() {
            super("Picasso-Dispatcher", 10);
        }
    }

    /* renamed from: c.d.b.i$c */
    static class C1188c extends BroadcastReceiver {

        /* renamed from: a */
        private final C1184i f2014a;

        C1188c(C1184i iVar) {
            this.f2014a = iVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo9978a() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.AIRPLANE_MODE");
            if (this.f2014a.f2010o) {
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            }
            this.f2014a.f1997b.registerReceiver(this, intentFilter);
        }

        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                String action = intent.getAction();
                if ("android.intent.action.AIRPLANE_MODE".equals(action)) {
                    if (intent.hasExtra("state")) {
                        this.f2014a.mo9958b(intent.getBooleanExtra("state", false));
                    }
                } else if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
                    this.f2014a.mo9962f(((ConnectivityManager) C1173e0.m3025p(context, "connectivity")).getActiveNetworkInfo());
                }
            }
        }
    }

    C1184i(Context context, ExecutorService executorService, Handler handler, C1189j jVar, C1168d dVar, C1155a0 a0Var) {
        C1187b bVar = new C1187b();
        this.f1996a = bVar;
        bVar.start();
        C1173e0.m3019j(this.f1996a.getLooper());
        this.f1997b = context;
        this.f1998c = executorService;
        this.f1999d = jVar;
        this.f2005j = handler;
        this.f2006k = dVar;
        this.f2007l = a0Var;
        this.f2008m = new ArrayList(4);
        this.f2011p = C1173e0.m3027r(this.f1997b);
        this.f2010o = C1173e0.m3026q(context, "android.permission.ACCESS_NETWORK_STATE");
        C1188c cVar = new C1188c(this);
        this.f2009n = cVar;
        cVar.mo9978a();
    }

    /* renamed from: a */
    private void m3045a(C1160c cVar) {
        if (!cVar.mo9931t()) {
            this.f2008m.add(cVar);
            if (!this.f2004i.hasMessages(7)) {
                this.f2004i.sendEmptyMessageDelayed(7, 200);
            }
        }
    }

    /* renamed from: i */
    private void m3046i() {
        if (!this.f2001f.isEmpty()) {
            Iterator<C1153a> it = this.f2001f.values().iterator();
            while (it.hasNext()) {
                C1153a next = it.next();
                it.remove();
                if (next.mo9892g().f2069n) {
                    C1173e0.m3030u("Dispatcher", "replaying", next.mo9894i().mo10025d());
                }
                mo9975w(next, false);
            }
        }
    }

    /* renamed from: j */
    private void m3047j(List<C1160c> list) {
        if (list != null && !list.isEmpty() && list.get(0).mo9926p().f2069n) {
            StringBuilder sb = new StringBuilder();
            for (C1160c next : list) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(C1173e0.m3021l(next));
            }
            C1173e0.m3030u("Dispatcher", "delivered", sb.toString());
        }
    }

    /* renamed from: k */
    private void m3048k(C1153a aVar) {
        Object k = aVar.mo9896k();
        if (k != null) {
            aVar.f1922k = true;
            this.f2001f.put(k, aVar);
        }
    }

    /* renamed from: l */
    private void m3049l(C1160c cVar) {
        C1153a i = cVar.mo9919i();
        if (i != null) {
            m3048k(i);
        }
        List<C1153a> j = cVar.mo9920j();
        if (j != null) {
            int size = j.size();
            for (int i2 = 0; i2 < size; i2++) {
                m3048k(j.get(i2));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo9958b(boolean z) {
        Handler handler = this.f2004i;
        handler.sendMessage(handler.obtainMessage(10, z ? 1 : 0, 0));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo9959c(C1153a aVar) {
        Handler handler = this.f2004i;
        handler.sendMessage(handler.obtainMessage(2, aVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo9960d(C1160c cVar) {
        Handler handler = this.f2004i;
        handler.sendMessage(handler.obtainMessage(4, cVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo9961e(C1160c cVar) {
        Handler handler = this.f2004i;
        handler.sendMessage(handler.obtainMessage(6, cVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo9962f(NetworkInfo networkInfo) {
        Handler handler = this.f2004i;
        handler.sendMessage(handler.obtainMessage(9, networkInfo));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo9963g(C1160c cVar) {
        Handler handler = this.f2004i;
        handler.sendMessageDelayed(handler.obtainMessage(5, cVar), 500);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo9964h(C1153a aVar) {
        Handler handler = this.f2004i;
        handler.sendMessage(handler.obtainMessage(1, aVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo9965m(boolean z) {
        this.f2011p = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo9966n() {
        ArrayList arrayList = new ArrayList(this.f2008m);
        this.f2008m.clear();
        Handler handler = this.f2005j;
        handler.sendMessage(handler.obtainMessage(8, arrayList));
        m3047j(arrayList);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo9967o(C1153a aVar) {
        String d = aVar.mo9889d();
        C1160c cVar = this.f2000e.get(d);
        if (cVar != null) {
            cVar.mo9918g(aVar);
            if (cVar.mo9917d()) {
                this.f2000e.remove(d);
                if (aVar.mo9892g().f2069n) {
                    C1173e0.m3030u("Dispatcher", "canceled", aVar.mo9894i().mo10025d());
                }
            }
        }
        if (this.f2003h.contains(aVar.mo9895j())) {
            this.f2002g.remove(aVar.mo9896k());
            if (aVar.mo9892g().f2069n) {
                C1173e0.m3031v("Dispatcher", "canceled", aVar.mo9894i().mo10025d(), "because paused request got canceled");
            }
        }
        C1153a remove = this.f2001f.remove(aVar.mo9896k());
        if (remove != null && remove.mo9892g().f2069n) {
            C1173e0.m3031v("Dispatcher", "canceled", remove.mo9894i().mo10025d(), "from replaying");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo9968p(C1160c cVar) {
        if (C1198p.m3092b(cVar.mo9925o())) {
            this.f2006k.mo9944c(cVar.mo9923m(), cVar.mo9928r());
        }
        this.f2000e.remove(cVar.mo9923m());
        m3045a(cVar);
        if (cVar.mo9926p().f2069n) {
            C1173e0.m3031v("Dispatcher", "batched", C1173e0.m3021l(cVar), "for completion");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo9969q(C1160c cVar, boolean z) {
        if (cVar.mo9926p().f2069n) {
            String l = C1173e0.m3021l(cVar);
            StringBuilder sb = new StringBuilder();
            sb.append("for error");
            sb.append(z ? " (will replay)" : "");
            C1173e0.m3031v("Dispatcher", "batched", l, sb.toString());
        }
        this.f2000e.remove(cVar.mo9923m());
        m3045a(cVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo9970r(NetworkInfo networkInfo) {
        ExecutorService executorService = this.f1998c;
        if (executorService instanceof C1214v) {
            ((C1214v) executorService).mo10018a(networkInfo);
        }
        if (networkInfo != null && networkInfo.isConnected()) {
            m3046i();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo9971s(Object obj) {
        if (this.f2003h.add(obj)) {
            Iterator<C1160c> it = this.f2000e.values().iterator();
            while (it.hasNext()) {
                C1160c next = it.next();
                boolean z = next.mo9926p().f2069n;
                C1153a i = next.mo9919i();
                List<C1153a> j = next.mo9920j();
                boolean z2 = j != null && !j.isEmpty();
                if (i != null || z2) {
                    if (i != null && i.mo9895j().equals(obj)) {
                        next.mo9918g(i);
                        this.f2002g.put(i.mo9896k(), i);
                        if (z) {
                            C1173e0.m3031v("Dispatcher", "paused", i.f1913b.mo10025d(), "because tag '" + obj + "' was paused");
                        }
                    }
                    if (z2) {
                        for (int size = j.size() - 1; size >= 0; size--) {
                            C1153a aVar = j.get(size);
                            if (aVar.mo9895j().equals(obj)) {
                                next.mo9918g(aVar);
                                this.f2002g.put(aVar.mo9896k(), aVar);
                                if (z) {
                                    C1173e0.m3031v("Dispatcher", "paused", aVar.f1913b.mo10025d(), "because tag '" + obj + "' was paused");
                                }
                            }
                        }
                    }
                    if (next.mo9917d()) {
                        it.remove();
                        if (z) {
                            C1173e0.m3031v("Dispatcher", "canceled", C1173e0.m3021l(next), "all actions paused");
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo9972t(Object obj) {
        if (this.f2003h.remove(obj)) {
            ArrayList arrayList = null;
            Iterator<C1153a> it = this.f2002g.values().iterator();
            while (it.hasNext()) {
                C1153a next = it.next();
                if (next.mo9895j().equals(obj)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(next);
                    it.remove();
                }
            }
            if (arrayList != null) {
                Handler handler = this.f2005j;
                handler.sendMessage(handler.obtainMessage(13, arrayList));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo9973u(C1160c cVar) {
        if (!cVar.mo9931t()) {
            boolean z = false;
            if (this.f1998c.isShutdown()) {
                mo9969q(cVar, false);
                return;
            }
            NetworkInfo networkInfo = null;
            if (this.f2010o) {
                networkInfo = ((ConnectivityManager) C1173e0.m3025p(this.f1997b, "connectivity")).getActiveNetworkInfo();
            }
            boolean z2 = networkInfo != null && networkInfo.isConnected();
            boolean v = cVar.mo9932v(this.f2011p, networkInfo);
            boolean w = cVar.mo9933w();
            if (!v) {
                if (this.f2010o && w) {
                    z = true;
                }
                mo9969q(cVar, z);
                if (z) {
                    m3049l(cVar);
                }
            } else if (!this.f2010o || z2) {
                if (cVar.mo9926p().f2069n) {
                    C1173e0.m3030u("Dispatcher", "retrying", C1173e0.m3021l(cVar));
                }
                if (cVar.mo9922l() instanceof C1200r.C1201a) {
                    cVar.f1969i |= C1199q.NO_CACHE.f2050a;
                }
                cVar.f1974n = this.f1998c.submit(cVar);
            } else {
                mo9969q(cVar, w);
                if (w) {
                    m3049l(cVar);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void mo9974v(C1153a aVar) {
        mo9975w(aVar, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public void mo9975w(C1153a aVar, boolean z) {
        if (this.f2003h.contains(aVar.mo9895j())) {
            this.f2002g.put(aVar.mo9896k(), aVar);
            if (aVar.mo9892g().f2069n) {
                String d = aVar.f1913b.mo10025d();
                C1173e0.m3031v("Dispatcher", "paused", d, "because tag '" + aVar.mo9895j() + "' is paused");
                return;
            }
            return;
        }
        C1160c cVar = this.f2000e.get(aVar.mo9889d());
        if (cVar != null) {
            cVar.mo9916c(aVar);
        } else if (!this.f1998c.isShutdown()) {
            C1160c h = C1160c.m2974h(aVar.mo9892g(), this, this.f2006k, this.f2007l, aVar);
            h.f1974n = this.f1998c.submit(h);
            this.f2000e.put(aVar.mo9889d(), h);
            if (z) {
                this.f2001f.remove(aVar.mo9896k());
            }
            if (aVar.mo9892g().f2069n) {
                C1173e0.m3030u("Dispatcher", "enqueued", aVar.f1913b.mo10025d());
            }
        } else if (aVar.mo9892g().f2069n) {
            C1173e0.m3031v("Dispatcher", "ignored", aVar.f1913b.mo10025d(), "because shut down");
        }
    }
}
