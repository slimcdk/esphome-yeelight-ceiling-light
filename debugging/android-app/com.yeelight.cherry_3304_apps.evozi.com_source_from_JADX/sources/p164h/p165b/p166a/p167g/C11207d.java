package p164h.p165b.p166a.p167g;

import androidx.appcompat.widget.ActivityChooserView;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import p164h.p165b.p166a.p168i.C11400a;
import p164h.p165b.p166a.p240h.C11221k;
import p164h.p165b.p166a.p240h.p242q.C11236a;
import p164h.p165b.p166a.p240h.p242q.C11237b;
import p164h.p165b.p166a.p240h.p242q.C11238c;
import p164h.p165b.p166a.p240h.p242q.C11239d;
import p164h.p165b.p166a.p240h.p243r.C11252j;
import p164h.p165b.p166a.p240h.p248s.C11328h;
import p164h.p165b.p166a.p240h.p248s.C11334n;
import p164h.p165b.p166a.p240h.p248s.C11335o;
import p164h.p257c.p259b.C11495a;

/* renamed from: h.b.a.g.d */
public abstract class C11207d implements Runnable {

    /* renamed from: e */
    protected static Logger f22271e = Logger.getLogger(C11207d.class.getName());

    /* renamed from: a */
    protected final C11335o f22272a;

    /* renamed from: b */
    protected final Integer f22273b;

    /* renamed from: c */
    private C4427b f22274c;

    /* renamed from: d */
    private C11237b f22275d;

    /* renamed from: h.b.a.g.d$a */
    class C11208a extends C11238c {
        C11208a(C11328h hVar, Integer num, List list) {
            super(hVar, num, list);
        }

        /* renamed from: S */
        public void mo35607S(C11236a aVar) {
            synchronized (C11207d.this) {
                C11207d.this.mo35604o((C11237b) null);
                C11207d.this.mo28124c(this, aVar, (C11252j) null);
            }
        }

        /* renamed from: a */
        public void mo35608a() {
            synchronized (C11207d.this) {
                C11207d.this.mo35604o(this);
                C11207d.this.mo28125f(this);
            }
        }

        /* renamed from: c */
        public void mo35609c() {
            synchronized (C11207d.this) {
                Logger logger = C11207d.f22271e;
                logger.fine("Local service state updated, notifying callback, sequence is: " + mo35720C());
                C11207d.this.mo28126g(this);
                mo35732V();
            }
        }
    }

    /* renamed from: h.b.a.g.d$b */
    class C11209b extends C11239d {
        C11209b(C11334n nVar, int i) {
            super(nVar, i);
        }

        /* renamed from: S */
        public void mo35610S(C11236a aVar, C11252j jVar) {
            synchronized (C11207d.this) {
                C11207d.this.mo35604o((C11237b) null);
                C11207d.this.mo28124c(this, aVar, jVar);
            }
        }

        /* renamed from: U */
        public void mo35611U(int i) {
            synchronized (C11207d.this) {
                C11207d.this.mo28127h(this, i);
            }
        }

        /* renamed from: W */
        public void mo35612W(C11252j jVar) {
            synchronized (C11207d.this) {
                C11207d.this.mo35604o((C11237b) null);
                C11207d.this.mo35600i(this, jVar, (Exception) null);
            }
        }

        /* renamed from: Z */
        public void mo35613Z(C11221k kVar) {
            synchronized (C11207d.this) {
                C11207d.this.mo28129m(this, kVar);
            }
        }

        /* renamed from: a */
        public void mo35608a() {
            synchronized (C11207d.this) {
                C11207d.this.mo35604o(this);
                C11207d.this.mo28125f(this);
            }
        }

        /* renamed from: c */
        public void mo35609c() {
            synchronized (C11207d.this) {
                C11207d.this.mo28126g(this);
            }
        }
    }

    protected C11207d(C11335o oVar, int i) {
        this.f22272a = oVar;
        this.f22273b = Integer.valueOf(i);
    }

    /* renamed from: b */
    public static String m29213b(C11252j jVar, Exception exc) {
        StringBuilder sb;
        if (jVar != null) {
            return "Subscription failed: " + " HTTP response was: " + jVar.mo35795c();
        }
        if (exc != null) {
            sb.append("Subscription failed: ");
            sb.append(" Exception occured: ");
            sb.append(exc);
        } else {
            sb = new StringBuilder();
            sb.append("Subscription failed: ");
            sb.append(" No response received.");
        }
        return sb.toString();
    }

    /* renamed from: d */
    private void m29214d(C11328h hVar) {
        C11208a aVar;
        if (mo35601k().getRegistry().mo24408a(hVar.mo35983d().mo35899p().mo35922b(), false) == null) {
            f22271e.fine("Local device service is currently not registered, failing subscription immediately");
            mo35600i((C11237b) null, (C11252j) null, new IllegalStateException("Local device is not registered"));
            return;
        }
        try {
            aVar = new C11208a(hVar, Integer.valueOf(ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED), Collections.EMPTY_LIST);
            try {
                f22271e.fine("Local device service is currently registered, also registering subscription");
                mo35601k().getRegistry().mo24410c(aVar);
                f22271e.fine("Notifying subscription callback of local subscription availablity");
                aVar.mo35730T();
                f22271e.fine("Simulating first initial event for local subscription callback, sequence: " + aVar.mo35720C());
                mo28126g(aVar);
                aVar.mo35732V();
                f22271e.fine("Starting to monitor state changes of local service");
                aVar.mo35734X();
            } catch (Exception e) {
                e = e;
            }
        } catch (Exception e2) {
            e = e2;
            aVar = null;
            f22271e.fine("Local callback creation failed: " + e.toString());
            f22271e.log(Level.FINE, "Exception root cause: ", C11495a.m30173a(e));
            if (aVar != null) {
                mo35601k().getRegistry().mo24433x(aVar);
            }
            mo35600i(aVar, (C11252j) null, e);
        }
    }

    /* renamed from: e */
    private void m29215e(C11334n nVar) {
        try {
            mo35601k().getProtocolFactory().mo24387i(new C11209b(nVar, this.f22273b.intValue())).run();
        } catch (C11400a e) {
            mo35600i(this.f22275d, (C11252j) null, e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo28124c(C11237b bVar, C11236a aVar, C11252j jVar);

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract void mo28125f(C11237b bVar);

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract void mo28126g(C11237b bVar);

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract void mo28127h(C11237b bVar, int i);

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo35600i(C11237b bVar, C11252j jVar, Exception exc) {
        mo28128j(bVar, jVar, exc, m29213b(jVar, exc));
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public abstract void mo28128j(C11237b bVar, C11252j jVar, Exception exc, String str);

    /* renamed from: k */
    public synchronized C4427b mo35601k() {
        return this.f22274c;
    }

    /* renamed from: l */
    public C11335o mo35602l() {
        return this.f22272a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo28129m(C11239d dVar, C11221k kVar) {
        Logger logger = f22271e;
        logger.info("Invalid event message received, causing: " + kVar);
        if (f22271e.isLoggable(Level.FINE)) {
            f22271e.fine("------------------------------------------------------------------------------");
            f22271e.fine(kVar.mo35683a() != null ? kVar.mo35683a().toString() : "null");
            f22271e.fine("------------------------------------------------------------------------------");
        }
    }

    /* renamed from: n */
    public synchronized void mo35603n(C4427b bVar) {
        this.f22274c = bVar;
    }

    /* renamed from: o */
    public synchronized void mo35604o(C11237b bVar) {
        this.f22275d = bVar;
    }

    public synchronized void run() {
        if (mo35601k() == null) {
            throw new IllegalStateException("Callback must be executed through ControlPoint");
        } else if (mo35602l() instanceof C11328h) {
            m29214d((C11328h) this.f22272a);
        } else if (mo35602l() instanceof C11334n) {
            m29215e((C11334n) this.f22272a);
        }
    }

    public String toString() {
        return "(SubscriptionCallback) " + mo35602l();
    }
}
