package p164h.p165b.p166a.p240h.p242q;

import java.util.LinkedHashMap;
import java.util.Map;
import p164h.p165b.p166a.p240h.p248s.C11335o;
import p164h.p165b.p166a.p240h.p251v.C11355d;
import p164h.p165b.p166a.p240h.p252w.C11369g0;

/* renamed from: h.b.a.h.q.b */
public abstract class C11237b<S extends C11335o> {

    /* renamed from: a */
    protected S f22335a;

    /* renamed from: b */
    protected String f22336b;

    /* renamed from: c */
    protected int f22337c;

    /* renamed from: d */
    protected int f22338d;

    /* renamed from: e */
    protected C11369g0 f22339e;

    /* renamed from: f */
    protected Map<String, C11355d<S>> f22340f;

    protected C11237b(S s) {
        this.f22337c = 1800;
        this.f22340f = new LinkedHashMap();
        this.f22335a = s;
    }

    public C11237b(S s, int i) {
        this(s);
        this.f22337c = i;
    }

    /* renamed from: C */
    public synchronized C11369g0 mo35720C() {
        return this.f22339e;
    }

    /* renamed from: J */
    public synchronized Map<String, C11355d<S>> mo35721J() {
        return this.f22340f;
    }

    /* renamed from: M */
    public synchronized int mo35722M() {
        return this.f22337c;
    }

    /* renamed from: N */
    public synchronized S mo35723N() {
        return this.f22335a;
    }

    /* renamed from: O */
    public synchronized String mo35724O() {
        return this.f22336b;
    }

    /* renamed from: P */
    public synchronized void mo35725P(int i) {
        this.f22338d = i;
    }

    /* renamed from: Q */
    public synchronized void mo35726Q(String str) {
        this.f22336b = str;
    }

    /* renamed from: a */
    public abstract void mo35608a();

    /* renamed from: c */
    public abstract void mo35609c();

    /* renamed from: g */
    public synchronized int mo35727g() {
        return this.f22338d;
    }

    public String toString() {
        return "(GENASubscription, SID: " + mo35724O() + ", SEQUENCE: " + mo35720C() + ")";
    }
}
