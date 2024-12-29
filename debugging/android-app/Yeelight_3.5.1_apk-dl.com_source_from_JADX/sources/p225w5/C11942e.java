package p225w5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.jetty.util.StringMap;
import p225w5.C11940d;
import p225w5.C11946h;

/* renamed from: w5.e */
public class C11942e {

    /* renamed from: a */
    private final HashMap f21822a = new HashMap();

    /* renamed from: b */
    private final StringMap f21823b = new StringMap(true);

    /* renamed from: c */
    private final ArrayList f21824c = new ArrayList();

    /* renamed from: w5.e$a */
    public static class C11943a extends C11946h.C11947a {

        /* renamed from: m */
        private final int f21825m;

        /* renamed from: n */
        private HashMap f21826n = null;

        public C11943a(String str, int i) {
            super(str);
            this.f21825m = i;
        }

        /* renamed from: d */
        public C11943a mo42463d(Object obj) {
            HashMap hashMap = this.f21826n;
            if (hashMap == null) {
                return null;
            }
            return (C11943a) hashMap.get(obj);
        }

        /* renamed from: e */
        public int mo42464e() {
            return this.f21825m;
        }

        /* renamed from: f */
        public void mo42465f(Object obj, C11943a aVar) {
            if (this.f21826n == null) {
                this.f21826n = new HashMap();
            }
            this.f21826n.put(obj, aVar);
        }
    }

    /* renamed from: a */
    public C11943a mo42454a(String str, int i) {
        C11943a aVar = new C11943a(str, i);
        this.f21822a.put(aVar, aVar);
        this.f21823b.put(str, (Object) aVar);
        while (i - this.f21824c.size() >= 0) {
            this.f21824c.add((Object) null);
        }
        if (this.f21824c.get(i) == null) {
            this.f21824c.add(i, aVar);
        }
        return aVar;
    }

    /* renamed from: b */
    public C11943a mo42455b(String str) {
        return (C11943a) this.f21823b.get(str);
    }

    /* renamed from: c */
    public C11943a mo42456c(C11940d dVar) {
        return (C11943a) this.f21822a.get(dVar);
    }

    /* renamed from: d */
    public C11943a mo42457d(byte[] bArr, int i, int i2) {
        Map.Entry bestEntry = this.f21823b.getBestEntry(bArr, i, i2);
        if (bestEntry != null) {
            return (C11943a) bestEntry.getValue();
        }
        return null;
    }

    /* renamed from: e */
    public int mo42458e(String str) {
        C11943a aVar = (C11943a) this.f21823b.get(str);
        if (aVar == null) {
            return -1;
        }
        return aVar.mo42464e();
    }

    /* renamed from: f */
    public int mo42459f(C11940d dVar) {
        if (!(dVar instanceof C11943a) && ((dVar = mo42461h(dVar)) == null || !(dVar instanceof C11943a))) {
            return -1;
        }
        return ((C11943a) dVar).mo42464e();
    }

    /* renamed from: g */
    public C11940d mo42460g(String str) {
        C11943a b = mo42455b(str);
        return b == null ? new C11943a(str, -1) : b;
    }

    /* renamed from: h */
    public C11940d mo42461h(C11940d dVar) {
        if (dVar instanceof C11943a) {
            return dVar;
        }
        C11943a c = mo42456c(dVar);
        return c == null ? dVar instanceof C11940d.C11941a ? dVar : new C11946h.C11947a(dVar.mo42411N(), 0, dVar.length(), 0) : c;
    }

    public String toString() {
        return "CACHE[bufferMap=" + this.f21822a + ",stringMap=" + this.f21823b + ",index=" + this.f21824c + "]";
    }
}
