package p136c6;

import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.C9277a;
import javax.servlet.http.C9282f;
import javax.servlet.http.C9284h;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import p136c6.C4015c;
import p152e6.C9003c;

/* renamed from: c6.a */
public abstract class C4013a implements C4015c.C4018c {

    /* renamed from: n */
    static final C9003c f6784n = C4025g.f6851o;

    /* renamed from: a */
    private final C4015c f6785a;

    /* renamed from: b */
    private final String f6786b;

    /* renamed from: c */
    private final String f6787c;

    /* renamed from: d */
    private final Map<String, Object> f6788d = new HashMap();

    /* renamed from: e */
    private boolean f6789e;

    /* renamed from: f */
    private final long f6790f;

    /* renamed from: g */
    private long f6791g;

    /* renamed from: h */
    private long f6792h;

    /* renamed from: i */
    private long f6793i;

    /* renamed from: j */
    private boolean f6794j;

    /* renamed from: k */
    private boolean f6795k;

    /* renamed from: l */
    private long f6796l;

    /* renamed from: m */
    private int f6797m;

    protected C4013a(C4015c cVar, long j, long j2, String str) {
        this.f6785a = cVar;
        this.f6790f = j;
        this.f6786b = str;
        String m = cVar.f6812j.mo26688m(str, (C9277a) null);
        this.f6787c = m;
        this.f6792h = j2;
        this.f6793i = j2;
        this.f6797m = 1;
        int i = cVar.f6809g;
        this.f6796l = i > 0 ? ((long) i) * 1000 : -1;
        C9003c cVar2 = f6784n;
        if (cVar2.mo36846a()) {
            cVar2.mo36850e("new session " + m + " " + str, new Object[0]);
        }
    }

    protected C4013a(C4015c cVar, C9277a aVar) {
        this.f6785a = cVar;
        long currentTimeMillis = System.currentTimeMillis();
        this.f6790f = currentTimeMillis;
        String k0 = cVar.f6812j.mo26654k0(aVar, currentTimeMillis);
        this.f6786b = k0;
        String m = cVar.f6812j.mo26688m(k0, aVar);
        this.f6787c = m;
        this.f6792h = currentTimeMillis;
        this.f6793i = currentTimeMillis;
        this.f6797m = 1;
        int i = cVar.f6809g;
        this.f6796l = i > 0 ? ((long) i) * 1000 : -1;
        C9003c cVar2 = f6784n;
        if (cVar2.mo36846a()) {
            cVar2.mo36850e("new session & id " + m + " " + k0, new Object[0]);
        }
    }

    /* renamed from: A */
    public void mo26619A(boolean z) {
        this.f6789e = z;
    }

    /* renamed from: B */
    public void mo26620B(int i) {
        this.f6796l = ((long) i) * 1000;
    }

    /* renamed from: C */
    public void mo26621C(int i) {
        synchronized (this) {
            this.f6797m = i;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public void mo26622D() {
        this.f6785a.mo26666N0(this, true);
        synchronized (this) {
            if (!this.f6794j) {
                if (this.f6797m <= 0) {
                    mo26640o();
                } else {
                    this.f6795k = true;
                }
            }
        }
    }

    /* renamed from: E */
    public void mo26623E(String str, Object obj) {
        if (obj != null && (obj instanceof C9284h)) {
            ((C9284h) obj).valueUnbound(new HttpSessionBindingEvent(this, str));
        }
    }

    /* renamed from: F */
    public void mo26624F() {
        synchronized (this) {
            HttpSessionEvent httpSessionEvent = new HttpSessionEvent(this);
            for (Object next : this.f6788d.values()) {
                if (next instanceof C9282f) {
                    ((C9282f) next).sessionWillPassivate(httpSessionEvent);
                }
            }
        }
    }

    /* renamed from: a */
    public Object mo26625a(String str) {
        Object obj;
        synchronized (this) {
            mo26634i();
            obj = this.f6788d.get(str);
        }
        return obj;
    }

    /* renamed from: b */
    public void mo26626b(String str, Object obj) {
        Object p;
        synchronized (this) {
            mo26634i();
            p = mo26641p(str, obj);
        }
        if (obj == null || !obj.equals(p)) {
            if (p != null) {
                mo26623E(str, p);
            }
            if (obj != null) {
                mo26633h(str, obj);
            }
            this.f6785a.mo26658F0(this, str, p, obj);
        }
    }

    /* renamed from: c */
    public C4013a mo26627c() {
        return this;
    }

    /* renamed from: d */
    public void mo26628d(String str) {
        mo26626b(str, (Object) null);
    }

    /* renamed from: e */
    public void mo26629e() {
        this.f6785a.mo26666N0(this, true);
        mo26640o();
    }

    /* renamed from: f */
    public Enumeration<String> mo26630f() {
        Enumeration<String> enumeration;
        synchronized (this) {
            mo26634i();
            enumeration = Collections.enumeration(this.f6788d == null ? Collections.EMPTY_LIST : new ArrayList(this.f6788d.keySet()));
        }
        return enumeration;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public boolean mo26631g(long j) {
        synchronized (this) {
            if (this.f6794j) {
                return false;
            }
            long j2 = this.f6792h;
            this.f6793i = j2;
            this.f6792h = j;
            long j3 = this.f6796l;
            if (j3 <= 0 || j2 <= 0 || j2 + j3 >= j) {
                this.f6797m++;
                return true;
            }
            mo26629e();
            return false;
        }
    }

    public String getId() {
        return this.f6785a.f6826x ? this.f6787c : this.f6786b;
    }

    /* renamed from: h */
    public void mo26633h(String str, Object obj) {
        if (obj != null && (obj instanceof C9284h)) {
            ((C9284h) obj).valueBound(new HttpSessionBindingEvent(this, str));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo26634i() {
        if (this.f6794j) {
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
    public void mo26635j() {
        /*
            r5 = this;
        L_0x0000:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r5.f6788d
            if (r0 == 0) goto L_0x003d
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x003d
            monitor-enter(r5)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x003a }
            java.util.Map<java.lang.String, java.lang.Object> r1 = r5.f6788d     // Catch:{ all -> 0x003a }
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
            java.lang.Object r3 = r5.mo26641p(r1, r2)     // Catch:{ all -> 0x0037 }
            monitor-exit(r5)     // Catch:{ all -> 0x0037 }
            r5.mo26623E(r1, r3)
            c6.c r4 = r5.f6785a
            r4.mo26658F0(r5, r1, r3, r2)
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
            java.util.Map<java.lang.String, java.lang.Object> r0 = r5.f6788d
            if (r0 == 0) goto L_0x0044
            r0.clear()
        L_0x0044:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p136c6.C4013a.mo26635j():void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo26636k() {
        synchronized (this) {
            int i = this.f6797m - 1;
            this.f6797m = i;
            if (this.f6795k && i <= 0) {
                mo26640o();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo26637l() {
        synchronized (this) {
            this.f6791g = this.f6792h;
        }
    }

    /* renamed from: m */
    public void mo26638m() {
        synchronized (this) {
            HttpSessionEvent httpSessionEvent = new HttpSessionEvent(this);
            for (Object next : this.f6788d.values()) {
                if (next instanceof C9282f) {
                    ((C9282f) next).sessionDidActivate(httpSessionEvent);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public Object mo26639n(String str) {
        return this.f6788d.get(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo26640o() {
        try {
            f6784n.mo36850e("invalidate {}", this.f6786b);
            if (mo26652z()) {
                mo26635j();
            }
            synchronized (this) {
                this.f6794j = true;
            }
        } catch (Throwable th) {
            synchronized (this) {
                this.f6794j = true;
                throw th;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public Object mo26641p(String str, Object obj) {
        return obj == null ? this.f6788d.remove(str) : this.f6788d.put(str, obj);
    }

    /* renamed from: q */
    public long mo26642q() {
        long j;
        synchronized (this) {
            j = this.f6792h;
        }
        return j;
    }

    /* renamed from: r */
    public int mo26643r() {
        int size;
        synchronized (this) {
            mo26634i();
            size = this.f6788d.size();
        }
        return size;
    }

    /* renamed from: s */
    public String mo26644s() {
        return this.f6786b;
    }

    /* renamed from: t */
    public long mo26645t() {
        return this.f6791g;
    }

    public String toString() {
        return getClass().getName() + Constants.COLON_SEPARATOR + getId() + "@" + hashCode();
    }

    /* renamed from: u */
    public long mo26647u() {
        return this.f6790f;
    }

    /* renamed from: v */
    public int mo26648v() {
        mo26634i();
        return (int) (this.f6796l / 1000);
    }

    /* renamed from: w */
    public String mo26649w() {
        return this.f6787c;
    }

    /* renamed from: x */
    public int mo26650x() {
        int i;
        synchronized (this) {
            i = this.f6797m;
        }
        return i;
    }

    /* renamed from: y */
    public boolean mo26651y() {
        return this.f6789e;
    }

    /* renamed from: z */
    public boolean mo26652z() {
        return !this.f6794j;
    }
}
