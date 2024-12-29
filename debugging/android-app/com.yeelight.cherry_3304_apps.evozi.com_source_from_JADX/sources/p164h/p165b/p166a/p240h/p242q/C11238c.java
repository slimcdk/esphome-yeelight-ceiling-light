package p164h.p165b.p166a.p240h.p242q;

import java.beans.PropertyChangeListener;
import java.net.URL;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import p164h.p165b.p166a.p240h.p248s.C11328h;
import p164h.p165b.p166a.p240h.p248s.C11336p;
import p164h.p165b.p166a.p240h.p251v.C11355d;
import p164h.p165b.p166a.p240h.p252w.C11369g0;
import p164h.p257c.p259b.C11495a;

/* renamed from: h.b.a.h.q.c */
public abstract class C11238c extends C11237b<C11328h> implements PropertyChangeListener {

    /* renamed from: j */
    private static Logger f22341j = Logger.getLogger(C11238c.class.getName());

    /* renamed from: g */
    final List<URL> f22342g;

    /* renamed from: h */
    final Map<String, Long> f22343h = new HashMap();

    /* renamed from: i */
    final Map<String, Long> f22344i = new HashMap();

    public C11238c(C11328h hVar, Integer num, List<URL> list) {
        super(hVar);
        mo35735Y(num);
        f22341j.fine("Reading initial state of local service at subscription time");
        long time = new Date().getTime();
        this.f22340f.clear();
        Collection<C11355d> c = ((C11328h) mo35723N()).mo35950q().mo35617c();
        Logger logger = f22341j;
        logger.finer("Got evented state variable values: " + c.size());
        for (C11355d next : c) {
            this.f22340f.put(next.mo36040d().mo35994b(), next);
            if (f22341j.isLoggable(Level.FINEST)) {
                Logger logger2 = f22341j;
                logger2.finer("Read state variable value '" + next.mo36040d().mo35994b() + "': " + next.toString());
            }
            this.f22343h.put(next.mo36040d().mo35994b(), Long.valueOf(time));
            if (next.mo36040d().mo35997e()) {
                this.f22344i.put(next.mo36040d().mo35994b(), Long.valueOf(next.toString()));
            }
        }
        this.f22336b = "uuid:" + UUID.randomUUID();
        this.f22339e = new C11369g0(0);
        this.f22342g = list;
    }

    /* renamed from: R */
    public synchronized void mo35729R(C11236a aVar) {
        try {
            ((C11328h) mo35723N()).mo35950q().mo35615a().removePropertyChangeListener(this);
        } catch (Exception e) {
            Logger logger = f22341j;
            logger.warning("Removal of local service property change listener failed: " + C11495a.m30173a(e));
        }
        mo35607S(aVar);
    }

    /* renamed from: S */
    public abstract void mo35607S(C11236a aVar);

    /* renamed from: T */
    public synchronized void mo35730T() {
        mo35608a();
    }

    /* renamed from: U */
    public synchronized List<URL> mo35731U() {
        return this.f22342g;
    }

    /* renamed from: V */
    public synchronized void mo35732V() {
        this.f22339e.mo36100d(true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: W */
    public synchronized Set<String> mo35733W(long j, Collection<C11355d> collection) {
        HashSet hashSet;
        Logger logger;
        String str;
        hashSet = new HashSet();
        for (C11355d next : collection) {
            C11336p d = next.mo36040d();
            String b = next.mo36040d().mo35994b();
            if (d.mo35993a().mo36007a() == 0 && d.mo35993a().mo36008b() == 0) {
                logger = f22341j;
                str = "Variable is not moderated: " + d;
            } else if (!this.f22343h.containsKey(b)) {
                logger = f22341j;
                str = "Variable is moderated but was never sent before: " + d;
            } else {
                if (d.mo35993a().mo36007a() > 0 && j <= this.f22343h.get(b).longValue() + ((long) d.mo35993a().mo36007a())) {
                    f22341j.finer("Excluding state variable with maximum rate: " + d);
                } else if (d.mo35997e() && this.f22344i.get(b) != null) {
                    long longValue = Long.valueOf(this.f22344i.get(b).longValue()).longValue();
                    long longValue2 = Long.valueOf(next.toString()).longValue();
                    long b2 = (long) d.mo35993a().mo36008b();
                    if (longValue2 > longValue && longValue2 - longValue < b2) {
                        f22341j.finer("Excluding state variable with minimum delta: " + d);
                    } else if (longValue2 < longValue && longValue - longValue2 < b2) {
                        f22341j.finer("Excluding state variable with minimum delta: " + d);
                    }
                }
                hashSet.add(b);
            }
            logger.finer(str);
        }
        return hashSet;
    }

    /* renamed from: X */
    public synchronized void mo35734X() {
        ((C11328h) mo35723N()).mo35950q().mo35615a().addPropertyChangeListener(this);
    }

    /* renamed from: Y */
    public synchronized void mo35735Y(Integer num) {
        int intValue = num == null ? 1800 : num.intValue();
        this.f22337c = intValue;
        mo35725P(intValue);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00d9, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void propertyChange(java.beans.PropertyChangeEvent r9) {
        /*
            r8 = this;
            monitor-enter(r8)
            java.lang.String r0 = r9.getPropertyName()     // Catch:{ all -> 0x00da }
            java.lang.String r1 = "_EventedStateVariables"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x00da }
            if (r0 != 0) goto L_0x000f
            monitor-exit(r8)
            return
        L_0x000f:
            java.util.logging.Logger r0 = f22341j     // Catch:{ all -> 0x00da }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00da }
            r1.<init>()     // Catch:{ all -> 0x00da }
            java.lang.String r2 = "Eventing triggered, getting state for subscription: "
            r1.append(r2)     // Catch:{ all -> 0x00da }
            java.lang.String r2 = r8.mo35724O()     // Catch:{ all -> 0x00da }
            r1.append(r2)     // Catch:{ all -> 0x00da }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00da }
            r0.fine(r1)     // Catch:{ all -> 0x00da }
            java.util.Date r0 = new java.util.Date     // Catch:{ all -> 0x00da }
            r0.<init>()     // Catch:{ all -> 0x00da }
            long r0 = r0.getTime()     // Catch:{ all -> 0x00da }
            java.lang.Object r9 = r9.getNewValue()     // Catch:{ all -> 0x00da }
            java.util.Collection r9 = (java.util.Collection) r9     // Catch:{ all -> 0x00da }
            java.util.Set r2 = r8.mo35733W(r0, r9)     // Catch:{ all -> 0x00da }
            java.util.Map<java.lang.String, h.b.a.h.v.d<S>> r3 = r8.f22340f     // Catch:{ all -> 0x00da }
            r3.clear()     // Catch:{ all -> 0x00da }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x00da }
        L_0x0045:
            boolean r3 = r9.hasNext()     // Catch:{ all -> 0x00da }
            if (r3 == 0) goto L_0x00af
            java.lang.Object r3 = r9.next()     // Catch:{ all -> 0x00da }
            h.b.a.h.v.d r3 = (p164h.p165b.p166a.p240h.p251v.C11355d) r3     // Catch:{ all -> 0x00da }
            h.b.a.h.s.p r4 = r3.mo36040d()     // Catch:{ all -> 0x00da }
            java.lang.String r4 = r4.mo35994b()     // Catch:{ all -> 0x00da }
            boolean r5 = r2.contains(r4)     // Catch:{ all -> 0x00da }
            if (r5 != 0) goto L_0x0045
            java.util.logging.Logger r5 = f22341j     // Catch:{ all -> 0x00da }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x00da }
            r6.<init>()     // Catch:{ all -> 0x00da }
            java.lang.String r7 = "Adding state variable value to current values of event: "
            r6.append(r7)     // Catch:{ all -> 0x00da }
            h.b.a.h.s.p r7 = r3.mo36040d()     // Catch:{ all -> 0x00da }
            r6.append(r7)     // Catch:{ all -> 0x00da }
            java.lang.String r7 = " = "
            r6.append(r7)     // Catch:{ all -> 0x00da }
            r6.append(r3)     // Catch:{ all -> 0x00da }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x00da }
            r5.fine(r6)     // Catch:{ all -> 0x00da }
            java.util.Map<java.lang.String, h.b.a.h.v.d<S>> r5 = r8.f22340f     // Catch:{ all -> 0x00da }
            h.b.a.h.s.p r6 = r3.mo36040d()     // Catch:{ all -> 0x00da }
            java.lang.String r6 = r6.mo35994b()     // Catch:{ all -> 0x00da }
            r5.put(r6, r3)     // Catch:{ all -> 0x00da }
            java.util.Map<java.lang.String, java.lang.Long> r5 = r8.f22343h     // Catch:{ all -> 0x00da }
            java.lang.Long r6 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00da }
            r5.put(r4, r6)     // Catch:{ all -> 0x00da }
            h.b.a.h.s.p r5 = r3.mo36040d()     // Catch:{ all -> 0x00da }
            boolean r5 = r5.mo35997e()     // Catch:{ all -> 0x00da }
            if (r5 == 0) goto L_0x0045
            java.util.Map<java.lang.String, java.lang.Long> r5 = r8.f22344i     // Catch:{ all -> 0x00da }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x00da }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x00da }
            r5.put(r4, r3)     // Catch:{ all -> 0x00da }
            goto L_0x0045
        L_0x00af:
            java.util.Map<java.lang.String, h.b.a.h.v.d<S>> r9 = r8.f22340f     // Catch:{ all -> 0x00da }
            int r9 = r9.size()     // Catch:{ all -> 0x00da }
            if (r9 <= 0) goto L_0x00d1
            java.util.logging.Logger r9 = f22341j     // Catch:{ all -> 0x00da }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00da }
            r0.<init>()     // Catch:{ all -> 0x00da }
            java.lang.String r1 = "Propagating new state variable values to subscription: "
            r0.append(r1)     // Catch:{ all -> 0x00da }
            r0.append(r8)     // Catch:{ all -> 0x00da }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00da }
            r9.fine(r0)     // Catch:{ all -> 0x00da }
            r8.mo35609c()     // Catch:{ all -> 0x00da }
            goto L_0x00d8
        L_0x00d1:
            java.util.logging.Logger r9 = f22341j     // Catch:{ all -> 0x00da }
            java.lang.String r0 = "No state variable values for event (all moderated out?), not triggering event"
            r9.fine(r0)     // Catch:{ all -> 0x00da }
        L_0x00d8:
            monitor-exit(r8)
            return
        L_0x00da:
            r9 = move-exception
            monitor-exit(r8)
            goto L_0x00de
        L_0x00dd:
            throw r9
        L_0x00de:
            goto L_0x00dd
        */
        throw new UnsupportedOperationException("Method not decompiled: p164h.p165b.p166a.p240h.p242q.C11238c.propertyChange(java.beans.PropertyChangeEvent):void");
    }
}
