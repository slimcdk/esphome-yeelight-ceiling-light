package p164h.p211a.p212a.p217d;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p164h.p211a.p212a.p217d.C10929e;
import p164h.p211a.p212a.p217d.C10938k;
import p164h.p211a.p212a.p228h.C11133p;

/* renamed from: h.a.a.d.f */
public class C10931f {

    /* renamed from: a */
    private final HashMap f21309a = new HashMap();

    /* renamed from: b */
    private final C11133p f21310b = new C11133p(true);

    /* renamed from: c */
    private final ArrayList f21311c = new ArrayList();

    /* renamed from: h.a.a.d.f$a */
    public static class C10932a extends C10938k.C10939a {

        /* renamed from: m */
        private final int f21312m;

        /* renamed from: n */
        private HashMap f21313n = null;

        public C10932a(String str, int i) {
            super(str);
            this.f21312m = i;
        }

        /* renamed from: d */
        public C10932a mo34620d(Object obj) {
            HashMap hashMap = this.f21313n;
            if (hashMap == null) {
                return null;
            }
            return (C10932a) hashMap.get(obj);
        }

        /* renamed from: e */
        public int mo34621e() {
            return this.f21312m;
        }

        /* renamed from: f */
        public void mo34622f(Object obj, C10932a aVar) {
            if (this.f21313n == null) {
                this.f21313n = new HashMap();
            }
            this.f21313n.put(obj, aVar);
        }
    }

    /* renamed from: a */
    public C10932a mo34611a(String str, int i) {
        C10932a aVar = new C10932a(str, i);
        this.f21309a.put(aVar, aVar);
        this.f21310b.mo35419d(str, aVar);
        while (i - this.f21311c.size() >= 0) {
            this.f21311c.add((Object) null);
        }
        if (this.f21311c.get(i) == null) {
            this.f21311c.add(i, aVar);
        }
        return aVar;
    }

    /* renamed from: b */
    public C10932a mo34612b(String str) {
        return (C10932a) this.f21310b.mo35414a(str);
    }

    /* renamed from: c */
    public C10932a mo34613c(C10929e eVar) {
        return (C10932a) this.f21309a.get(eVar);
    }

    /* renamed from: d */
    public C10932a mo34614d(byte[] bArr, int i, int i2) {
        Map.Entry b = this.f21310b.mo35415b(bArr, i, i2);
        if (b != null) {
            return (C10932a) b.getValue();
        }
        return null;
    }

    /* renamed from: e */
    public int mo34615e(String str) {
        C10932a aVar = (C10932a) this.f21310b.mo35414a(str);
        if (aVar == null) {
            return -1;
        }
        return aVar.mo34621e();
    }

    /* renamed from: f */
    public int mo34616f(C10929e eVar) {
        if (!(eVar instanceof C10932a) && ((eVar = mo34618h(eVar)) == null || !(eVar instanceof C10932a))) {
            return -1;
        }
        return ((C10932a) eVar).mo34621e();
    }

    /* renamed from: g */
    public C10929e mo34617g(String str) {
        C10932a b = mo34612b(str);
        return b == null ? new C10932a(str, -1) : b;
    }

    /* renamed from: h */
    public C10929e mo34618h(C10929e eVar) {
        if (eVar instanceof C10932a) {
            return eVar;
        }
        C10932a c = mo34613c(eVar);
        return c == null ? eVar instanceof C10929e.C10930a ? eVar : new C10938k.C10939a(eVar.mo34561R(), 0, eVar.length(), 0) : c;
    }

    public String toString() {
        return "CACHE[bufferMap=" + this.f21309a + ",stringMap=" + this.f21310b + ",index=" + this.f21311c + "]";
    }
}
