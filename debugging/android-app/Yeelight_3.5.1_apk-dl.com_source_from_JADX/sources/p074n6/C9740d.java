package p074n6;

import androidx.appcompat.widget.ActivityChooserView;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.fourthline.cling.model.UnsupportedDataException;
import org.fourthline.cling.model.gena.CancelReason;
import org.fourthline.cling.model.message.UpnpResponse;
import org.fourthline.cling.model.meta.C10070e;
import org.fourthline.cling.protocol.ProtocolCreationException;
import org.seamless.util.C10243a;
import p200p6.C10275a;
import p200p6.C10276b;
import p200p6.C10277c;
import p214t6.C10404d;
import p214t6.C10409i;

/* renamed from: n6.d */
public abstract class C9740d implements Runnable {

    /* renamed from: e */
    protected static Logger f17570e = Logger.getLogger(C9740d.class.getName());

    /* renamed from: a */
    protected final C10070e f17571a;

    /* renamed from: b */
    protected final Integer f17572b;

    /* renamed from: c */
    private C9739b f17573c;

    /* renamed from: d */
    private C10275a f17574d;

    /* renamed from: n6.d$a */
    class C9741a extends C10276b {
        C9741a(C10404d dVar, Integer num, List list) {
            super(dVar, num, list);
        }

        /* renamed from: O */
        public void mo38935O(CancelReason cancelReason) {
            synchronized (C9740d.this) {
                C9740d.this.mo38932o((C10275a) null);
                C9740d.this.mo38922c(this, cancelReason, (UpnpResponse) null);
            }
        }

        /* renamed from: a */
        public void mo38936a() {
            synchronized (C9740d.this) {
                C9740d.this.mo38932o(this);
                C9740d.this.mo38923f(this);
            }
        }

        /* renamed from: e */
        public void mo38937e() {
            synchronized (C9740d.this) {
                Logger logger = C9740d.f17570e;
                logger.fine("Local service state updated, notifying callback, sequence is: " + mo41772w());
                C9740d.this.mo38924g(this);
                mo41776R();
            }
        }
    }

    /* renamed from: n6.d$b */
    class C9742b extends C10277c {
        C9742b(C10409i iVar, int i) {
            super(iVar, i);
        }

        /* renamed from: O */
        public void mo38938O(CancelReason cancelReason, UpnpResponse upnpResponse) {
            synchronized (C9740d.this) {
                C9740d.this.mo38932o((C10275a) null);
                C9740d.this.mo38922c(this, cancelReason, upnpResponse);
            }
        }

        /* renamed from: Q */
        public void mo38939Q(int i) {
            synchronized (C9740d.this) {
                C9740d.this.mo38925h(this, i);
            }
        }

        /* renamed from: S */
        public void mo38940S(UpnpResponse upnpResponse) {
            synchronized (C9740d.this) {
                C9740d.this.mo38932o((C10275a) null);
                C9740d.this.mo38926i(this, upnpResponse, (Exception) null);
            }
        }

        /* renamed from: V */
        public void mo38941V(UnsupportedDataException unsupportedDataException) {
            synchronized (C9740d.this) {
                C9740d.this.mo38930m(this, unsupportedDataException);
            }
        }

        /* renamed from: a */
        public void mo38936a() {
            synchronized (C9740d.this) {
                C9740d.this.mo38932o(this);
                C9740d.this.mo38923f(this);
            }
        }

        /* renamed from: e */
        public void mo38937e() {
            synchronized (C9740d.this) {
                C9740d.this.mo38924g(this);
            }
        }
    }

    protected C9740d(C10070e eVar, int i) {
        this.f17571a = eVar;
        this.f17572b = Integer.valueOf(i);
    }

    /* renamed from: b */
    public static String m23409b(UpnpResponse upnpResponse, Exception exc) {
        StringBuilder sb;
        if (upnpResponse != null) {
            return "Subscription failed: " + " HTTP response was: " + upnpResponse.mo40421c();
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
    private void m23410d(C10404d dVar) {
        C9741a aVar;
        if (mo38928k().getRegistry().mo24936a(dVar.mo40531d().mo40506p().mo42058b(), false) == null) {
            f17570e.fine("Local device service is currently not registered, failing subscription immediately");
            mo38926i((C10275a) null, (UpnpResponse) null, new IllegalStateException("Local device is not registered"));
            return;
        }
        try {
            aVar = new C9741a(dVar, Integer.valueOf(ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED), Collections.EMPTY_LIST);
            try {
                f17570e.fine("Local device service is currently registered, also registering subscription");
                mo38928k().getRegistry().mo24957t(aVar);
                f17570e.fine("Notifying subscription callback of local subscription availablity");
                aVar.mo41774P();
                f17570e.fine("Simulating first initial event for local subscription callback, sequence: " + aVar.mo41772w());
                mo38924g(aVar);
                aVar.mo41776R();
                f17570e.fine("Starting to monitor state changes of local service");
                aVar.mo41778T();
            } catch (Exception e) {
                e = e;
            }
        } catch (Exception e2) {
            e = e2;
            aVar = null;
            f17570e.fine("Local callback creation failed: " + e.toString());
            f17570e.log(Level.FINE, "Exception root cause: ", C10243a.m25753a(e));
            if (aVar != null) {
                mo38928k().getRegistry().mo24948m(aVar);
            }
            mo38926i(aVar, (UpnpResponse) null, e);
        }
    }

    /* renamed from: e */
    private void m23411e(C10409i iVar) {
        try {
            mo38928k().getProtocolFactory().mo24897c(new C9742b(iVar, this.f17572b.intValue())).run();
        } catch (ProtocolCreationException e) {
            mo38926i(this.f17574d, (UpnpResponse) null, e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo38922c(C10275a aVar, CancelReason cancelReason, UpnpResponse upnpResponse);

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract void mo38923f(C10275a aVar);

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract void mo38924g(C10275a aVar);

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract void mo38925h(C10275a aVar, int i);

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo38926i(C10275a aVar, UpnpResponse upnpResponse, Exception exc) {
        mo38927j(aVar, upnpResponse, exc, m23409b(upnpResponse, exc));
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public abstract void mo38927j(C10275a aVar, UpnpResponse upnpResponse, Exception exc, String str);

    /* renamed from: k */
    public synchronized C9739b mo38928k() {
        return this.f17573c;
    }

    /* renamed from: l */
    public C10070e mo38929l() {
        return this.f17571a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo38930m(C10277c cVar, UnsupportedDataException unsupportedDataException) {
        Logger logger = f17570e;
        logger.info("Invalid event message received, causing: " + unsupportedDataException);
        if (f17570e.isLoggable(Level.FINE)) {
            f17570e.fine("------------------------------------------------------------------------------");
            f17570e.fine(unsupportedDataException.getData() != null ? unsupportedDataException.getData().toString() : "null");
            f17570e.fine("------------------------------------------------------------------------------");
        }
    }

    /* renamed from: n */
    public synchronized void mo38931n(C9739b bVar) {
        this.f17573c = bVar;
    }

    /* renamed from: o */
    public synchronized void mo38932o(C10275a aVar) {
        this.f17574d = aVar;
    }

    public synchronized void run() {
        if (mo38928k() == null) {
            throw new IllegalStateException("Callback must be executed through ControlPoint");
        } else if (mo38929l() instanceof C10404d) {
            m23410d((C10404d) this.f17571a);
        } else if (mo38929l() instanceof C10409i) {
            m23411e((C10409i) this.f17571a);
        }
    }

    public String toString() {
        return "(SubscriptionCallback) " + mo38929l();
    }
}
