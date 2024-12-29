package p164h.p165b.p166a.p240h;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;
import p164h.p165b.p166a.p240h.p248s.C11328h;
import p164h.p165b.p166a.p240h.p248s.C11336p;
import p164h.p165b.p166a.p240h.p251v.C11353c;
import p164h.p165b.p166a.p240h.p251v.C11355d;
import p164h.p257c.p259b.C11495a;
import p164h.p257c.p259b.C11499d;

/* renamed from: h.b.a.h.b */
public class C11211b<T> implements C11220j<T> {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static Logger f22278f = Logger.getLogger(C11211b.class.getName());

    /* renamed from: a */
    protected final C11328h<T> f22279a;

    /* renamed from: b */
    protected final Class<T> f22280b;

    /* renamed from: c */
    protected final ReentrantLock f22281c = new ReentrantLock(true);

    /* renamed from: d */
    protected T f22282d;

    /* renamed from: e */
    protected PropertyChangeSupport f22283e;

    /* renamed from: h.b.a.h.b$a */
    protected class C11212a implements PropertyChangeListener {
        protected C11212a() {
        }

        public void propertyChange(PropertyChangeEvent propertyChangeEvent) {
            Logger e = C11211b.f22278f;
            e.finer("Property change event on local service: " + propertyChangeEvent.getPropertyName());
            if (!propertyChangeEvent.getPropertyName().equals("_EventedStateVariables")) {
                String[] a = C11216f.m29264a(propertyChangeEvent.getPropertyName());
                Logger e2 = C11211b.f22278f;
                e2.fine("Changed variable names: " + Arrays.toString(a));
                try {
                    Collection<C11355d> i = C11211b.this.mo35622i(a);
                    if (!i.isEmpty()) {
                        C11211b.this.mo35615a().firePropertyChange("_EventedStateVariables", (Object) null, i);
                    }
                } catch (Exception e3) {
                    Logger e4 = C11211b.f22278f;
                    Level level = Level.SEVERE;
                    e4.log(level, "Error reading state of service after state variable update event: " + C11495a.m30173a(e3), e3);
                }
            }
        }
    }

    public C11211b(C11328h<T> hVar, Class<T> cls) {
        this.f22279a = hVar;
        this.f22280b = cls;
    }

    /* renamed from: a */
    public PropertyChangeSupport mo35615a() {
        mo35626m();
        try {
            if (this.f22283e == null) {
                mo35625l();
            }
            return this.f22283e;
        } finally {
            mo35628o();
        }
    }

    /* renamed from: b */
    public T mo35616b() {
        mo35626m();
        try {
            if (this.f22282d == null) {
                mo35625l();
            }
            return this.f22282d;
        } finally {
            mo35628o();
        }
    }

    /* renamed from: c */
    public Collection<C11355d> mo35617c() {
        mo35626m();
        try {
            Collection<C11355d> n = mo35627n();
            if (n != null) {
                f22278f.fine("Obtained initial state variable values for event, skipping individual state variable accessors");
                return n;
            }
            ArrayList arrayList = new ArrayList();
            for (C11336p pVar : mo35624k().mo35988i()) {
                if (pVar.mo35993a().mo36009c()) {
                    C11353c o = mo35624k().mo35948o(pVar);
                    if (o != null) {
                        arrayList.add(o.mo36039c(pVar, mo35616b()));
                    } else {
                        throw new IllegalStateException("No accessor for evented state variable");
                    }
                }
            }
            mo35628o();
            return arrayList;
        } finally {
            mo35628o();
        }
    }

    /* renamed from: d */
    public void mo35618d(C11210a<T> aVar) {
        mo35626m();
        try {
            aVar.mo35614a(this);
        } finally {
            mo35628o();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public PropertyChangeListener mo35619f(T t) {
        return new C11212a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public PropertyChangeSupport mo35620g(T t) {
        Method f = C11499d.m30188f(t.getClass(), "propertyChangeSupport");
        if (f == null || !PropertyChangeSupport.class.isAssignableFrom(f.getReturnType())) {
            Logger logger = f22278f;
            logger.fine("Creating new PropertyChangeSupport for service implementation: " + t.getClass().getName());
            return new PropertyChangeSupport(t);
        }
        Logger logger2 = f22278f;
        logger2.fine("Service implementation instance offers PropertyChangeSupport, using that: " + t.getClass().getName());
        return (PropertyChangeSupport) f.invoke(t, new Object[0]);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public T mo35621h() {
        Class<T> cls = this.f22280b;
        if (cls != null) {
            try {
                return cls.getConstructor(new Class[]{C11328h.class}).newInstance(new Object[]{mo35624k()});
            } catch (NoSuchMethodException unused) {
                Logger logger = f22278f;
                logger.fine("Creating new service implementation instance with no-arg constructor: " + this.f22280b.getName());
                return this.f22280b.newInstance();
            }
        } else {
            throw new IllegalStateException("Subclass has to provide service class or override createServiceInstance()");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public Collection<C11355d> mo35622i(String[] strArr) {
        mo35626m();
        try {
            ArrayList arrayList = new ArrayList();
            for (String trim : strArr) {
                String trim2 = trim.trim();
                C11336p h = mo35624k().mo35987h(trim2);
                if (h != null) {
                    if (h.mo35993a().mo36009c()) {
                        C11353c o = mo35624k().mo35948o(h);
                        if (o == null) {
                            f22278f.warning("Ignoring evented state variable without accessor: " + trim2);
                        } else {
                            arrayList.add(o.mo36039c(h, mo35616b()));
                        }
                    }
                }
                f22278f.fine("Ignoring unknown or non-evented state variable: " + trim2);
            }
            return arrayList;
        } finally {
            mo35628o();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public int mo35623j() {
        return 500;
    }

    /* renamed from: k */
    public C11328h<T> mo35624k() {
        return this.f22279a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo35625l() {
        f22278f.fine("No service implementation instance available, initializing...");
        try {
            T h = mo35621h();
            this.f22282d = h;
            PropertyChangeSupport g = mo35620g(h);
            this.f22283e = g;
            g.addPropertyChangeListener(mo35619f(this.f22282d));
        } catch (Exception e) {
            throw new RuntimeException("Could not initialize implementation: " + e, e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo35626m() {
        try {
            if (!this.f22281c.tryLock((long) mo35623j(), TimeUnit.MILLISECONDS)) {
                throw new RuntimeException("Failed to acquire lock in milliseconds: " + mo35623j());
            } else if (f22278f.isLoggable(Level.FINEST)) {
                f22278f.finest("Acquired lock");
            }
        } catch (InterruptedException e) {
            throw new RuntimeException("Failed to acquire lock:" + e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public Collection<C11355d> mo35627n() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo35628o() {
        if (f22278f.isLoggable(Level.FINEST)) {
            f22278f.finest("Releasing lock");
        }
        this.f22281c.unlock();
    }

    public String toString() {
        return "(" + C11211b.class.getSimpleName() + ") Implementation: " + this.f22282d;
    }
}
