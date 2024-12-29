package com.squareup.picasso;

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
import com.squareup.picasso.NetworkRequestHandler;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;

/* renamed from: com.squareup.picasso.i */
class C4348i {

    /* renamed from: a */
    final C4351b f7196a;

    /* renamed from: b */
    final Context f7197b;

    /* renamed from: c */
    final ExecutorService f7198c;

    /* renamed from: d */
    final Downloader f7199d;

    /* renamed from: e */
    final Map<String, C4335c> f7200e = new LinkedHashMap();

    /* renamed from: f */
    final Map<Object, C4332a> f7201f = new WeakHashMap();

    /* renamed from: g */
    final Map<Object, C4332a> f7202g = new WeakHashMap();

    /* renamed from: h */
    final Set<Object> f7203h = new HashSet();

    /* renamed from: i */
    final Handler f7204i;

    /* renamed from: j */
    final Handler f7205j;

    /* renamed from: k */
    final C4342d f7206k;

    /* renamed from: l */
    final C4368u f7207l;

    /* renamed from: m */
    final List<C4335c> f7208m;

    /* renamed from: n */
    final C4352c f7209n;

    /* renamed from: o */
    final boolean f7210o;

    /* renamed from: p */
    boolean f7211p;

    /* renamed from: com.squareup.picasso.i$a */
    private static class C4349a extends Handler {

        /* renamed from: a */
        private final C4348i f7212a;

        /* renamed from: com.squareup.picasso.i$a$a */
        class C4350a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ Message f7213a;

            C4350a(C4349a aVar, Message message) {
                this.f7213a = message;
            }

            public void run() {
                throw new AssertionError("Unknown handler message received: " + this.f7213a.what);
            }
        }

        public C4349a(Looper looper, C4348i iVar) {
            super(looper);
            this.f7212a = iVar;
        }

        public void handleMessage(Message message) {
            boolean z = false;
            switch (message.what) {
                case 1:
                    this.f7212a.mo28184v((C4332a) message.obj);
                    return;
                case 2:
                    this.f7212a.mo28177o((C4332a) message.obj);
                    return;
                case 4:
                    this.f7212a.mo28178p((C4335c) message.obj);
                    return;
                case 5:
                    this.f7212a.mo28183u((C4335c) message.obj);
                    return;
                case 6:
                    this.f7212a.mo28179q((C4335c) message.obj, false);
                    return;
                case 7:
                    this.f7212a.mo28176n();
                    return;
                case 9:
                    this.f7212a.mo28180r((NetworkInfo) message.obj);
                    return;
                case 10:
                    C4348i iVar = this.f7212a;
                    if (message.arg1 == 1) {
                        z = true;
                    }
                    iVar.mo28175m(z);
                    return;
                case 11:
                    this.f7212a.mo28181s(message.obj);
                    return;
                case 12:
                    this.f7212a.mo28182t(message.obj);
                    return;
                default:
                    Picasso.f7116p.post(new C4350a(this, message));
                    return;
            }
        }
    }

    /* renamed from: com.squareup.picasso.i$b */
    static class C4351b extends HandlerThread {
        C4351b() {
            super("Picasso-Dispatcher", 10);
        }
    }

    /* renamed from: com.squareup.picasso.i$c */
    static class C4352c extends BroadcastReceiver {

        /* renamed from: a */
        private final C4348i f7214a;

        C4352c(C4348i iVar) {
            this.f7214a = iVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo28188a() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.AIRPLANE_MODE");
            if (this.f7214a.f7210o) {
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            }
            this.f7214a.f7197b.registerReceiver(this, intentFilter);
        }

        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                String action = intent.getAction();
                if ("android.intent.action.AIRPLANE_MODE".equals(action)) {
                    if (intent.hasExtra("state")) {
                        this.f7214a.mo28168b(intent.getBooleanExtra("state", false));
                    }
                } else if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
                    this.f7214a.mo28172f(((ConnectivityManager) C4376y.m12442p(context, "connectivity")).getActiveNetworkInfo());
                }
            }
        }
    }

    C4348i(Context context, ExecutorService executorService, Handler handler, Downloader downloader, C4342d dVar, C4368u uVar) {
        C4351b bVar = new C4351b();
        this.f7196a = bVar;
        bVar.start();
        C4376y.m12436j(bVar.getLooper());
        this.f7197b = context;
        this.f7198c = executorService;
        this.f7204i = new C4349a(bVar.getLooper(), this);
        this.f7199d = downloader;
        this.f7205j = handler;
        this.f7206k = dVar;
        this.f7207l = uVar;
        this.f7208m = new ArrayList(4);
        this.f7211p = C4376y.m12444r(context);
        this.f7210o = C4376y.m12443q(context, "android.permission.ACCESS_NETWORK_STATE");
        C4352c cVar = new C4352c(this);
        this.f7209n = cVar;
        cVar.mo28188a();
    }

    /* renamed from: a */
    private void m12324a(C4335c cVar) {
        if (!cVar.mo28150u()) {
            this.f7208m.add(cVar);
            if (!this.f7204i.hasMessages(7)) {
                this.f7204i.sendEmptyMessageDelayed(7, 200);
            }
        }
    }

    /* renamed from: i */
    private void m12325i() {
        if (!this.f7201f.isEmpty()) {
            Iterator<C4332a> it = this.f7201f.values().iterator();
            while (it.hasNext()) {
                C4332a next = it.next();
                it.remove();
                if (next.mo28128g().f7131n) {
                    C4376y.m12447u("Dispatcher", "replaying", next.mo28130i().mo28212d());
                }
                mo28185w(next, false);
            }
        }
    }

    /* renamed from: j */
    private void m12326j(List<C4335c> list) {
        if (list != null && !list.isEmpty() && list.get(0).mo28145q().f7131n) {
            StringBuilder sb = new StringBuilder();
            for (C4335c next : list) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(C4376y.m12438l(next));
            }
            C4376y.m12447u("Dispatcher", "delivered", sb.toString());
        }
    }

    /* renamed from: k */
    private void m12327k(C4332a aVar) {
        Object k = aVar.mo28132k();
        if (k != null) {
            aVar.f7157k = true;
            this.f7201f.put(k, aVar);
        }
    }

    /* renamed from: l */
    private void m12328l(C4335c cVar) {
        C4332a i = cVar.mo28138i();
        if (i != null) {
            m12327k(i);
        }
        List<C4332a> j = cVar.mo28139j();
        if (j != null) {
            int size = j.size();
            for (int i2 = 0; i2 < size; i2++) {
                m12327k(j.get(i2));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo28168b(boolean z) {
        Handler handler = this.f7204i;
        handler.sendMessage(handler.obtainMessage(10, z ? 1 : 0, 0));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo28169c(C4332a aVar) {
        Handler handler = this.f7204i;
        handler.sendMessage(handler.obtainMessage(2, aVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo28170d(C4335c cVar) {
        Handler handler = this.f7204i;
        handler.sendMessage(handler.obtainMessage(4, cVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo28171e(C4335c cVar) {
        Handler handler = this.f7204i;
        handler.sendMessage(handler.obtainMessage(6, cVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo28172f(NetworkInfo networkInfo) {
        Handler handler = this.f7204i;
        handler.sendMessage(handler.obtainMessage(9, networkInfo));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo28173g(C4335c cVar) {
        Handler handler = this.f7204i;
        handler.sendMessageDelayed(handler.obtainMessage(5, cVar), 500);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo28174h(C4332a aVar) {
        Handler handler = this.f7204i;
        handler.sendMessage(handler.obtainMessage(1, aVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo28175m(boolean z) {
        this.f7211p = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo28176n() {
        ArrayList arrayList = new ArrayList(this.f7208m);
        this.f7208m.clear();
        Handler handler = this.f7205j;
        handler.sendMessage(handler.obtainMessage(8, arrayList));
        m12326j(arrayList);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo28177o(C4332a aVar) {
        String d = aVar.mo28125d();
        C4335c cVar = this.f7200e.get(d);
        if (cVar != null) {
            cVar.mo28137g(aVar);
            if (cVar.mo28136d()) {
                this.f7200e.remove(d);
                if (aVar.mo28128g().f7131n) {
                    C4376y.m12447u("Dispatcher", "canceled", aVar.mo28130i().mo28212d());
                }
            }
        }
        if (this.f7203h.contains(aVar.mo28131j())) {
            this.f7202g.remove(aVar.mo28132k());
            if (aVar.mo28128g().f7131n) {
                C4376y.m12448v("Dispatcher", "canceled", aVar.mo28130i().mo28212d(), "because paused request got canceled");
            }
        }
        C4332a remove = this.f7201f.remove(aVar.mo28132k());
        if (remove != null && remove.mo28128g().f7131n) {
            C4376y.m12448v("Dispatcher", "canceled", remove.mo28130i().mo28212d(), "from replaying");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo28178p(C4335c cVar) {
        if (MemoryPolicy.shouldWriteToMemoryCache(cVar.mo28144o())) {
            this.f7206k.mo28160b(cVar.mo28142m(), cVar.mo28148s());
        }
        this.f7200e.remove(cVar.mo28142m());
        m12324a(cVar);
        if (cVar.mo28145q().f7131n) {
            C4376y.m12448v("Dispatcher", "batched", C4376y.m12438l(cVar), "for completion");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo28179q(C4335c cVar, boolean z) {
        if (cVar.mo28145q().f7131n) {
            String l = C4376y.m12438l(cVar);
            StringBuilder sb = new StringBuilder();
            sb.append("for error");
            sb.append(z ? " (will replay)" : "");
            C4376y.m12448v("Dispatcher", "batched", l, sb.toString());
        }
        this.f7200e.remove(cVar.mo28142m());
        m12324a(cVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo28180r(NetworkInfo networkInfo) {
        ExecutorService executorService = this.f7198c;
        if (executorService instanceof C4359p) {
            ((C4359p) executorService).mo28205a(networkInfo);
        }
        if (networkInfo != null && networkInfo.isConnected()) {
            m12325i();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo28181s(Object obj) {
        if (this.f7203h.add(obj)) {
            Iterator<C4335c> it = this.f7200e.values().iterator();
            while (it.hasNext()) {
                C4335c next = it.next();
                boolean z = next.mo28145q().f7131n;
                C4332a i = next.mo28138i();
                List<C4332a> j = next.mo28139j();
                boolean z2 = j != null && !j.isEmpty();
                if (i != null || z2) {
                    if (i != null && i.mo28131j().equals(obj)) {
                        next.mo28137g(i);
                        this.f7202g.put(i.mo28132k(), i);
                        if (z) {
                            C4376y.m12448v("Dispatcher", "paused", i.f7148b.mo28212d(), "because tag '" + obj + "' was paused");
                        }
                    }
                    if (z2) {
                        for (int size = j.size() - 1; size >= 0; size--) {
                            C4332a aVar = j.get(size);
                            if (aVar.mo28131j().equals(obj)) {
                                next.mo28137g(aVar);
                                this.f7202g.put(aVar.mo28132k(), aVar);
                                if (z) {
                                    C4376y.m12448v("Dispatcher", "paused", aVar.f7148b.mo28212d(), "because tag '" + obj + "' was paused");
                                }
                            }
                        }
                    }
                    if (next.mo28136d()) {
                        it.remove();
                        if (z) {
                            C4376y.m12448v("Dispatcher", "canceled", C4376y.m12438l(next), "all actions paused");
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo28182t(Object obj) {
        if (this.f7203h.remove(obj)) {
            ArrayList arrayList = null;
            Iterator<C4332a> it = this.f7202g.values().iterator();
            while (it.hasNext()) {
                C4332a next = it.next();
                if (next.mo28131j().equals(obj)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(next);
                    it.remove();
                }
            }
            if (arrayList != null) {
                Handler handler = this.f7205j;
                handler.sendMessage(handler.obtainMessage(13, arrayList));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo28183u(C4335c cVar) {
        if (!cVar.mo28150u()) {
            boolean z = false;
            if (this.f7198c.isShutdown()) {
                mo28179q(cVar, false);
                return;
            }
            NetworkInfo networkInfo = null;
            if (this.f7210o) {
                networkInfo = ((ConnectivityManager) C4376y.m12442p(this.f7197b, "connectivity")).getActiveNetworkInfo();
            }
            boolean z2 = networkInfo != null && networkInfo.isConnected();
            boolean x = cVar.mo28151x(this.f7211p, networkInfo);
            boolean y = cVar.mo28152y();
            if (!x) {
                if (this.f7210o && y) {
                    z = true;
                }
                mo28179q(cVar, z);
                if (z) {
                    m12328l(cVar);
                }
            } else if (!this.f7210o || z2) {
                if (cVar.mo28145q().f7131n) {
                    C4376y.m12447u("Dispatcher", "retrying", C4376y.m12438l(cVar));
                }
                if (cVar.mo28141l() instanceof NetworkRequestHandler.ContentLengthException) {
                    cVar.f7174i |= NetworkPolicy.NO_CACHE.index;
                }
                cVar.f7179n = this.f7198c.submit(cVar);
            } else {
                mo28179q(cVar, y);
                if (y) {
                    m12328l(cVar);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void mo28184v(C4332a aVar) {
        mo28185w(aVar, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public void mo28185w(C4332a aVar, boolean z) {
        if (this.f7203h.contains(aVar.mo28131j())) {
            this.f7202g.put(aVar.mo28132k(), aVar);
            if (aVar.mo28128g().f7131n) {
                String d = aVar.f7148b.mo28212d();
                C4376y.m12448v("Dispatcher", "paused", d, "because tag '" + aVar.mo28131j() + "' is paused");
                return;
            }
            return;
        }
        C4335c cVar = this.f7200e.get(aVar.mo28125d());
        if (cVar != null) {
            cVar.mo28135c(aVar);
        } else if (!this.f7198c.isShutdown()) {
            C4335c h = C4335c.m12289h(aVar.mo28128g(), this, this.f7206k, this.f7207l, aVar);
            h.f7179n = this.f7198c.submit(h);
            this.f7200e.put(aVar.mo28125d(), h);
            if (z) {
                this.f7201f.remove(aVar.mo28132k());
            }
            if (aVar.mo28128g().f7131n) {
                C4376y.m12447u("Dispatcher", "enqueued", aVar.f7148b.mo28212d());
            }
        } else if (aVar.mo28128g().f7131n) {
            C4376y.m12448v("Dispatcher", "ignored", aVar.f7148b.mo28212d(), "because shut down");
        }
    }
}
