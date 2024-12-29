package p164h.p211a.p212a.p222f.p226y;

import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import p154d.p155b.p204f0.C10709c;
import p154d.p155b.p204f0.C10714h;
import p154d.p155b.p204f0.C10716j;
import p154d.p155b.p204f0.C10717k;
import p154d.p155b.p204f0.C10718l;
import p164h.p211a.p212a.p222f.p226y.C11064c;
import p164h.p211a.p212a.p228h.p234y.C11158c;

/* renamed from: h.a.a.f.y.a */
public abstract class C11062a implements C11064c.C11066b {

    /* renamed from: n */
    static final C11158c f21757n = C11073g.f21823o;

    /* renamed from: a */
    private final C11064c f21758a;

    /* renamed from: b */
    private final String f21759b;

    /* renamed from: c */
    private final String f21760c;

    /* renamed from: d */
    private final Map<String, Object> f21761d = new HashMap();

    /* renamed from: e */
    private boolean f21762e;

    /* renamed from: f */
    private final long f21763f;

    /* renamed from: g */
    private long f21764g;

    /* renamed from: h */
    private long f21765h;

    /* renamed from: i */
    private long f21766i;

    /* renamed from: j */
    private boolean f21767j;

    /* renamed from: k */
    private boolean f21768k;

    /* renamed from: l */
    private long f21769l;

    /* renamed from: m */
    private int f21770m;

    protected C11062a(C11064c cVar, long j, long j2, String str) {
        this.f21758a = cVar;
        this.f21763f = j;
        this.f21759b = str;
        this.f21760c = cVar.f21784j.mo35026l(str, (C10709c) null);
        this.f21765h = j2;
        this.f21766i = j2;
        this.f21770m = 1;
        int i = this.f21758a.f21781g;
        this.f21769l = i > 0 ? ((long) i) * 1000 : -1;
        if (f21757n.mo35485a()) {
            C11158c cVar2 = f21757n;
            cVar2.mo35489e("new session " + this.f21760c + " " + this.f21759b, new Object[0]);
        }
    }

    protected C11062a(C11064c cVar, C10709c cVar2) {
        this.f21758a = cVar;
        long currentTimeMillis = System.currentTimeMillis();
        this.f21763f = currentTimeMillis;
        String h0 = this.f21758a.f21784j.mo35024h0(cVar2, currentTimeMillis);
        this.f21759b = h0;
        this.f21760c = this.f21758a.f21784j.mo35026l(h0, cVar2);
        long j = this.f21763f;
        this.f21765h = j;
        this.f21766i = j;
        this.f21770m = 1;
        int i = this.f21758a.f21781g;
        this.f21769l = i > 0 ? ((long) i) * 1000 : -1;
        if (f21757n.mo35485a()) {
            C11158c cVar3 = f21757n;
            cVar3.mo35489e("new session & id " + this.f21760c + " " + this.f21759b, new Object[0]);
        }
    }

    /* renamed from: A */
    public void mo35103A(boolean z) {
        this.f21762e = z;
    }

    /* renamed from: B */
    public void mo35104B(int i) {
        this.f21769l = ((long) i) * 1000;
    }

    /* renamed from: C */
    public void mo35105C(int i) {
        synchronized (this) {
            this.f21770m = i;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public void mo35106D() {
        this.f21758a.mo35140I0(this, true);
        synchronized (this) {
            if (!this.f21767j) {
                if (this.f21770m <= 0) {
                    mo35118o();
                } else {
                    this.f21768k = true;
                }
            }
        }
    }

    /* renamed from: E */
    public void mo35107E(String str, Object obj) {
        if (obj != null && (obj instanceof C10717k)) {
            ((C10717k) obj).mo33950B(new C10716j(this, str));
        }
    }

    /* renamed from: F */
    public void mo35108F() {
        synchronized (this) {
            C10718l lVar = new C10718l(this);
            for (Object next : this.f21761d.values()) {
                if (next instanceof C10714h) {
                    ((C10714h) next).mo33944D(lVar);
                }
            }
        }
    }

    /* renamed from: a */
    public Object mo33938a(String str) {
        Object obj;
        synchronized (this) {
            mo35112i();
            obj = this.f21761d.get(str);
        }
        return obj;
    }

    /* renamed from: b */
    public void mo33939b(String str, Object obj) {
        Object p;
        synchronized (this) {
            mo35112i();
            p = mo35119p(str, obj);
        }
        if (obj == null || !obj.equals(p)) {
            if (p != null) {
                mo35107E(str, p);
            }
            if (obj != null) {
                mo35111h(str, obj);
            }
            this.f21758a.mo35132A0(this, str, p, obj);
        }
    }

    /* renamed from: c */
    public C11062a mo35109c() {
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo35110d(long j) {
        synchronized (this) {
            if (this.f21767j) {
                return false;
            }
            long j2 = this.f21765h;
            this.f21766i = j2;
            this.f21765h = j;
            if (this.f21769l <= 0 || j2 <= 0 || j2 + this.f21769l >= j) {
                this.f21770m++;
                return true;
            }
            mo33941f();
            return false;
        }
    }

    /* renamed from: e */
    public void mo33940e(String str) {
        mo33939b(str, (Object) null);
    }

    /* renamed from: f */
    public void mo33941f() {
        this.f21758a.mo35140I0(this, true);
        mo35118o();
    }

    /* renamed from: g */
    public Enumeration<String> mo33942g() {
        Enumeration<String> enumeration;
        synchronized (this) {
            mo35112i();
            enumeration = Collections.enumeration(this.f21761d == null ? Collections.EMPTY_LIST : new ArrayList(this.f21761d.keySet()));
        }
        return enumeration;
    }

    public String getId() {
        return this.f21758a.f21798x ? this.f21760c : this.f21759b;
    }

    /* renamed from: h */
    public void mo35111h(String str, Object obj) {
        if (obj != null && (obj instanceof C10717k)) {
            ((C10717k) obj).mo33951w(new C10716j(this, str));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo35112i() {
        if (this.f21767j) {
            throw new IllegalStateException();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x003f, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0041, code lost:
        r0.clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        return;
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo35113j() {
        /*
            r5 = this;
        L_0x0000:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r5.f21761d
            if (r0 == 0) goto L_0x003d
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x003d
            monitor-enter(r5)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x003a }
            java.util.Map<java.lang.String, java.lang.Object> r1 = r5.f21761d     // Catch:{ all -> 0x003a }
            java.util.Set r1 = r1.keySet()     // Catch:{ all -> 0x003a }
            r0.<init>(r1)     // Catch:{ all -> 0x003a }
            monitor-exit(r5)     // Catch:{ all -> 0x003a }
            java.util.Iterator r0 = r0.iterator()
        L_0x001b:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0000
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            monitor-enter(r5)
            r2 = 0
            java.lang.Object r3 = r5.mo35119p(r1, r2)     // Catch:{ all -> 0x0037 }
            monitor-exit(r5)     // Catch:{ all -> 0x0037 }
            r5.mo35107E(r1, r3)
            h.a.a.f.y.c r4 = r5.f21758a
            r4.mo35132A0(r5, r1, r3, r2)
            goto L_0x001b
        L_0x0037:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0037 }
            throw r0
        L_0x003a:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x003a }
            throw r0
        L_0x003d:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r5.f21761d
            if (r0 == 0) goto L_0x0044
            r0.clear()
        L_0x0044:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p164h.p211a.p212a.p222f.p226y.C11062a.mo35113j():void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo35114k() {
        synchronized (this) {
            int i = this.f21770m - 1;
            this.f21770m = i;
            if (this.f21768k && i <= 0) {
                mo35118o();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo35115l() {
        synchronized (this) {
            this.f21764g = this.f21765h;
        }
    }

    /* renamed from: m */
    public void mo35116m() {
        synchronized (this) {
            C10718l lVar = new C10718l(this);
            for (Object next : this.f21761d.values()) {
                if (next instanceof C10714h) {
                    ((C10714h) next).mo33945s(lVar);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public Object mo35117n(String str) {
        return this.f21761d.get(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo35118o() {
        try {
            f21757n.mo35489e("invalidate {}", this.f21759b);
            if (mo35130z()) {
                mo35113j();
            }
            synchronized (this) {
                this.f21767j = true;
            }
        } catch (Throwable th) {
            synchronized (this) {
                this.f21767j = true;
                throw th;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public Object mo35119p(String str, Object obj) {
        return obj == null ? this.f21761d.remove(str) : this.f21761d.put(str, obj);
    }

    /* renamed from: q */
    public long mo35120q() {
        long j;
        synchronized (this) {
            j = this.f21765h;
        }
        return j;
    }

    /* renamed from: r */
    public int mo35121r() {
        int size;
        synchronized (this) {
            mo35112i();
            size = this.f21761d.size();
        }
        return size;
    }

    /* renamed from: s */
    public String mo35122s() {
        return this.f21759b;
    }

    /* renamed from: t */
    public long mo35123t() {
        return this.f21764g;
    }

    public String toString() {
        return getClass().getName() + Constants.COLON_SEPARATOR + getId() + "@" + hashCode();
    }

    /* renamed from: u */
    public long mo35125u() {
        return this.f21763f;
    }

    /* renamed from: v */
    public int mo35126v() {
        mo35112i();
        return (int) (this.f21769l / 1000);
    }

    /* renamed from: w */
    public String mo35127w() {
        return this.f21760c;
    }

    /* renamed from: x */
    public int mo35128x() {
        int i;
        synchronized (this) {
            i = this.f21770m;
        }
        return i;
    }

    /* renamed from: y */
    public boolean mo35129y() {
        return this.f21762e;
    }

    /* renamed from: z */
    public boolean mo35130z() {
        return !this.f21767j;
    }
}
