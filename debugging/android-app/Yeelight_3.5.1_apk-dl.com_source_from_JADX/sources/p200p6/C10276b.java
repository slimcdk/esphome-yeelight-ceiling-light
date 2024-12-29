package p200p6;

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
import org.fourthline.cling.model.gena.CancelReason;
import org.fourthline.cling.model.meta.C10071f;
import org.fourthline.cling.model.types.C10076b0;
import org.seamless.util.C10243a;
import p214t6.C10404d;
import p226w6.C11959d;

/* renamed from: p6.b */
public abstract class C10276b extends C10275a<C10404d> implements PropertyChangeListener {

    /* renamed from: j */
    private static Logger f19357j = Logger.getLogger(C10276b.class.getName());

    /* renamed from: g */
    final List<URL> f19358g;

    /* renamed from: h */
    final Map<String, Long> f19359h = new HashMap();

    /* renamed from: i */
    final Map<String, Long> f19360i = new HashMap();

    public C10276b(C10404d dVar, Integer num, List<URL> list) {
        super(dVar);
        mo41779U(num);
        f19357j.fine("Reading initial state of local service at subscription time");
        long time = new Date().getTime();
        this.f19356f.clear();
        Collection<C11959d> c = ((C10404d) mo41766J()).mo42075q().mo40322c();
        Logger logger = f19357j;
        logger.finer("Got evented state variable values: " + c.size());
        for (C11959d next : c) {
            this.f19356f.put(next.mo42508d().mo40543b(), next);
            if (f19357j.isLoggable(Level.FINEST)) {
                Logger logger2 = f19357j;
                logger2.finer("Read state variable value '" + next.mo42508d().mo40543b() + "': " + next.toString());
            }
            this.f19359h.put(next.mo42508d().mo40543b(), Long.valueOf(time));
            if (next.mo42508d().mo40546e()) {
                this.f19360i.put(next.mo42508d().mo40543b(), Long.valueOf(next.toString()));
            }
        }
        this.f19352b = "uuid:" + UUID.randomUUID();
        this.f19355e = new C10076b0(0);
        this.f19358g = list;
    }

    /* renamed from: N */
    public synchronized void mo41773N(CancelReason cancelReason) {
        try {
            ((C10404d) mo41766J()).mo42075q().mo40320a().removePropertyChangeListener(this);
        } catch (Exception e) {
            Logger logger = f19357j;
            logger.warning("Removal of local service property change listener failed: " + C10243a.m25753a(e));
        }
        mo38935O(cancelReason);
    }

    /* renamed from: O */
    public abstract void mo38935O(CancelReason cancelReason);

    /* renamed from: P */
    public synchronized void mo41774P() {
        mo38936a();
    }

    /* renamed from: Q */
    public synchronized List<URL> mo41775Q() {
        return this.f19358g;
    }

    /* renamed from: R */
    public synchronized void mo41776R() {
        this.f19355e.mo40573d(true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: S */
    public synchronized Set<String> mo41777S(long j, Collection<C11959d> collection) {
        HashSet hashSet;
        Logger logger;
        String str;
        hashSet = new HashSet();
        for (C11959d next : collection) {
            C10071f d = next.mo42508d();
            String b = next.mo42508d().mo40543b();
            if (d.mo40542a().mo42110a() == 0 && d.mo40542a().mo42111b() == 0) {
                logger = f19357j;
                str = "Variable is not moderated: " + d;
            } else if (!this.f19359h.containsKey(b)) {
                logger = f19357j;
                str = "Variable is moderated but was never sent before: " + d;
            } else {
                if (d.mo40542a().mo42110a() > 0 && j <= this.f19359h.get(b).longValue() + ((long) d.mo40542a().mo42110a())) {
                    f19357j.finer("Excluding state variable with maximum rate: " + d);
                } else if (d.mo40546e() && this.f19360i.get(b) != null) {
                    long longValue = Long.valueOf(this.f19360i.get(b).longValue()).longValue();
                    long longValue2 = Long.valueOf(next.toString()).longValue();
                    long b2 = (long) d.mo40542a().mo42111b();
                    if (longValue2 > longValue && longValue2 - longValue < b2) {
                        f19357j.finer("Excluding state variable with minimum delta: " + d);
                    } else if (longValue2 < longValue && longValue - longValue2 < b2) {
                        f19357j.finer("Excluding state variable with minimum delta: " + d);
                    }
                }
                hashSet.add(b);
            }
            logger.finer(str);
        }
        return hashSet;
    }

    /* renamed from: T */
    public synchronized void mo41778T() {
        ((C10404d) mo41766J()).mo42075q().mo40320a().addPropertyChangeListener(this);
    }

    /* renamed from: U */
    public synchronized void mo41779U(Integer num) {
        int intValue = num == null ? 1800 : num.intValue();
        this.f19353c = intValue;
        mo41768L(intValue);
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
            java.util.logging.Logger r0 = f19357j     // Catch:{ all -> 0x00da }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00da }
            r1.<init>()     // Catch:{ all -> 0x00da }
            java.lang.String r2 = "Eventing triggered, getting state for subscription: "
            r1.append(r2)     // Catch:{ all -> 0x00da }
            java.lang.String r2 = r8.mo41767K()     // Catch:{ all -> 0x00da }
            r1.append(r2)     // Catch:{ all -> 0x00da }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00da }
            r0.fine(r1)     // Catch:{ all -> 0x00da }
            java.util.Date r0 = new java.util.Date     // Catch:{ all -> 0x00da }
            r0.<init>()     // Catch:{ all -> 0x00da }
            long r0 = r0.getTime()     // Catch:{ all -> 0x00da }
            java.lang.Object r9 = r9.getNewValue()     // Catch:{ all -> 0x00da }
            java.util.Collection r9 = (java.util.Collection) r9     // Catch:{ all -> 0x00da }
            java.util.Set r2 = r8.mo41777S(r0, r9)     // Catch:{ all -> 0x00da }
            java.util.Map<java.lang.String, w6.d<S>> r3 = r8.f19356f     // Catch:{ all -> 0x00da }
            r3.clear()     // Catch:{ all -> 0x00da }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x00da }
        L_0x0045:
            boolean r3 = r9.hasNext()     // Catch:{ all -> 0x00da }
            if (r3 == 0) goto L_0x00af
            java.lang.Object r3 = r9.next()     // Catch:{ all -> 0x00da }
            w6.d r3 = (p226w6.C11959d) r3     // Catch:{ all -> 0x00da }
            org.fourthline.cling.model.meta.f r4 = r3.mo42508d()     // Catch:{ all -> 0x00da }
            java.lang.String r4 = r4.mo40543b()     // Catch:{ all -> 0x00da }
            boolean r5 = r2.contains(r4)     // Catch:{ all -> 0x00da }
            if (r5 != 0) goto L_0x0045
            java.util.logging.Logger r5 = f19357j     // Catch:{ all -> 0x00da }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x00da }
            r6.<init>()     // Catch:{ all -> 0x00da }
            java.lang.String r7 = "Adding state variable value to current values of event: "
            r6.append(r7)     // Catch:{ all -> 0x00da }
            org.fourthline.cling.model.meta.f r7 = r3.mo42508d()     // Catch:{ all -> 0x00da }
            r6.append(r7)     // Catch:{ all -> 0x00da }
            java.lang.String r7 = " = "
            r6.append(r7)     // Catch:{ all -> 0x00da }
            r6.append(r3)     // Catch:{ all -> 0x00da }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x00da }
            r5.fine(r6)     // Catch:{ all -> 0x00da }
            java.util.Map<java.lang.String, w6.d<S>> r5 = r8.f19356f     // Catch:{ all -> 0x00da }
            org.fourthline.cling.model.meta.f r6 = r3.mo42508d()     // Catch:{ all -> 0x00da }
            java.lang.String r6 = r6.mo40543b()     // Catch:{ all -> 0x00da }
            r5.put(r6, r3)     // Catch:{ all -> 0x00da }
            java.util.Map<java.lang.String, java.lang.Long> r5 = r8.f19359h     // Catch:{ all -> 0x00da }
            java.lang.Long r6 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00da }
            r5.put(r4, r6)     // Catch:{ all -> 0x00da }
            org.fourthline.cling.model.meta.f r5 = r3.mo42508d()     // Catch:{ all -> 0x00da }
            boolean r5 = r5.mo40546e()     // Catch:{ all -> 0x00da }
            if (r5 == 0) goto L_0x0045
            java.util.Map<java.lang.String, java.lang.Long> r5 = r8.f19360i     // Catch:{ all -> 0x00da }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x00da }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x00da }
            r5.put(r4, r3)     // Catch:{ all -> 0x00da }
            goto L_0x0045
        L_0x00af:
            java.util.Map<java.lang.String, w6.d<S>> r9 = r8.f19356f     // Catch:{ all -> 0x00da }
            int r9 = r9.size()     // Catch:{ all -> 0x00da }
            if (r9 <= 0) goto L_0x00d1
            java.util.logging.Logger r9 = f19357j     // Catch:{ all -> 0x00da }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00da }
            r0.<init>()     // Catch:{ all -> 0x00da }
            java.lang.String r1 = "Propagating new state variable values to subscription: "
            r0.append(r1)     // Catch:{ all -> 0x00da }
            r0.append(r8)     // Catch:{ all -> 0x00da }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00da }
            r9.fine(r0)     // Catch:{ all -> 0x00da }
            r8.mo38937e()     // Catch:{ all -> 0x00da }
            goto L_0x00d8
        L_0x00d1:
            java.util.logging.Logger r9 = f19357j     // Catch:{ all -> 0x00da }
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
        throw new UnsupportedOperationException("Method not decompiled: p200p6.C10276b.propertyChange(java.beans.PropertyChangeEvent):void");
    }
}
