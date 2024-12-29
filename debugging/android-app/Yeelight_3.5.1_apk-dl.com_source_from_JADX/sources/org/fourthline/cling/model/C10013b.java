package org.fourthline.cling.model;

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
import org.fourthline.cling.model.meta.C10071f;
import org.seamless.util.C10243a;
import org.seamless.util.C10247d;
import p214t6.C10404d;
import p226w6.C11957c;
import p226w6.C11959d;

/* renamed from: org.fourthline.cling.model.b */
public class C10013b<T> implements C10022j<T> {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static Logger f18476f = Logger.getLogger(C10013b.class.getName());

    /* renamed from: a */
    protected final C10404d<T> f18477a;

    /* renamed from: b */
    protected final Class<T> f18478b;

    /* renamed from: c */
    protected final ReentrantLock f18479c = new ReentrantLock(true);

    /* renamed from: d */
    protected T f18480d;

    /* renamed from: e */
    protected PropertyChangeSupport f18481e;

    /* renamed from: org.fourthline.cling.model.b$a */
    protected class C10014a implements PropertyChangeListener {
        protected C10014a() {
        }

        public void propertyChange(PropertyChangeEvent propertyChangeEvent) {
            Logger e = C10013b.f18476f;
            e.finer("Property change event on local service: " + propertyChangeEvent.getPropertyName());
            if (!propertyChangeEvent.getPropertyName().equals("_EventedStateVariables")) {
                String[] a = C10018f.m24802a(propertyChangeEvent.getPropertyName());
                Logger e2 = C10013b.f18476f;
                e2.fine("Changed variable names: " + Arrays.toString(a));
                try {
                    Collection<C11959d> i = C10013b.this.mo40327i(a);
                    if (!i.isEmpty()) {
                        C10013b.this.mo40320a().firePropertyChange("_EventedStateVariables", (Object) null, i);
                    }
                } catch (Exception e3) {
                    Logger e4 = C10013b.f18476f;
                    Level level = Level.SEVERE;
                    e4.log(level, "Error reading state of service after state variable update event: " + C10243a.m25753a(e3), e3);
                }
            }
        }
    }

    public C10013b(C10404d<T> dVar, Class<T> cls) {
        this.f18477a = dVar;
        this.f18478b = cls;
    }

    /* renamed from: a */
    public PropertyChangeSupport mo40320a() {
        mo40331m();
        try {
            if (this.f18481e == null) {
                mo40330l();
            }
            return this.f18481e;
        } finally {
            mo40333o();
        }
    }

    /* renamed from: b */
    public T mo40321b() {
        mo40331m();
        try {
            if (this.f18480d == null) {
                mo40330l();
            }
            return this.f18480d;
        } finally {
            mo40333o();
        }
    }

    /* renamed from: c */
    public Collection<C11959d> mo40322c() {
        mo40331m();
        try {
            Collection<C11959d> n = mo40332n();
            if (n != null) {
                f18476f.fine("Obtained initial state variable values for event, skipping individual state variable accessors");
                return n;
            }
            ArrayList arrayList = new ArrayList();
            for (C10071f fVar : mo40329k().mo40536i()) {
                if (fVar.mo40542a().mo42112c()) {
                    C11957c o = mo40329k().mo42073o(fVar);
                    if (o != null) {
                        arrayList.add(o.mo42507c(fVar, mo40321b()));
                    } else {
                        throw new IllegalStateException("No accessor for evented state variable");
                    }
                }
            }
            mo40333o();
            return arrayList;
        } finally {
            mo40333o();
        }
    }

    /* renamed from: d */
    public void mo40323d(C10012a<T> aVar) {
        mo40331m();
        try {
            aVar.mo38964a(this);
        } finally {
            mo40333o();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public PropertyChangeListener mo40324f(T t) {
        return new C10014a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public PropertyChangeSupport mo40325g(T t) {
        Method f = C10247d.m25768f(t.getClass(), "propertyChangeSupport");
        if (f == null || !PropertyChangeSupport.class.isAssignableFrom(f.getReturnType())) {
            Logger logger = f18476f;
            logger.fine("Creating new PropertyChangeSupport for service implementation: " + t.getClass().getName());
            return new PropertyChangeSupport(t);
        }
        Logger logger2 = f18476f;
        logger2.fine("Service implementation instance offers PropertyChangeSupport, using that: " + t.getClass().getName());
        return (PropertyChangeSupport) f.invoke(t, new Object[0]);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public T mo40326h() {
        Class<T> cls = this.f18478b;
        if (cls != null) {
            try {
                return cls.getConstructor(new Class[]{C10404d.class}).newInstance(new Object[]{mo40329k()});
            } catch (NoSuchMethodException unused) {
                Logger logger = f18476f;
                logger.fine("Creating new service implementation instance with no-arg constructor: " + this.f18478b.getName());
                return this.f18478b.newInstance();
            }
        } else {
            throw new IllegalStateException("Subclass has to provide service class or override createServiceInstance()");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public Collection<C11959d> mo40327i(String[] strArr) {
        mo40331m();
        try {
            ArrayList arrayList = new ArrayList();
            for (String trim : strArr) {
                String trim2 = trim.trim();
                C10071f h = mo40329k().mo40535h(trim2);
                if (h != null) {
                    if (h.mo40542a().mo42112c()) {
                        C11957c o = mo40329k().mo42073o(h);
                        if (o == null) {
                            f18476f.warning("Ignoring evented state variable without accessor: " + trim2);
                        } else {
                            arrayList.add(o.mo42507c(h, mo40321b()));
                        }
                    }
                }
                f18476f.fine("Ignoring unknown or non-evented state variable: " + trim2);
            }
            return arrayList;
        } finally {
            mo40333o();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public int mo40328j() {
        return 500;
    }

    /* renamed from: k */
    public C10404d<T> mo40329k() {
        return this.f18477a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo40330l() {
        f18476f.fine("No service implementation instance available, initializing...");
        try {
            T h = mo40326h();
            this.f18480d = h;
            PropertyChangeSupport g = mo40325g(h);
            this.f18481e = g;
            g.addPropertyChangeListener(mo40324f(this.f18480d));
        } catch (Exception e) {
            throw new RuntimeException("Could not initialize implementation: " + e, e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo40331m() {
        try {
            if (!this.f18479c.tryLock((long) mo40328j(), TimeUnit.MILLISECONDS)) {
                throw new RuntimeException("Failed to acquire lock in milliseconds: " + mo40328j());
            } else if (f18476f.isLoggable(Level.FINEST)) {
                f18476f.finest("Acquired lock");
            }
        } catch (InterruptedException e) {
            throw new RuntimeException("Failed to acquire lock:" + e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public Collection<C11959d> mo40332n() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo40333o() {
        if (f18476f.isLoggable(Level.FINEST)) {
            f18476f.finest("Releasing lock");
        }
        this.f18479c.unlock();
    }

    public String toString() {
        return "(" + C10013b.class.getSimpleName() + ") Implementation: " + this.f18480d;
    }
}
