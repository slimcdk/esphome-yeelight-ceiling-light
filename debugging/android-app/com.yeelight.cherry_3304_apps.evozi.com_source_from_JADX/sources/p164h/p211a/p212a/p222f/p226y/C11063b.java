package p164h.p211a.p212a.p222f.p226y;

import java.security.SecureRandom;
import java.util.Random;
import p154d.p155b.p204f0.C10709c;
import p164h.p211a.p212a.p222f.C11044s;
import p164h.p211a.p212a.p228h.p233x.C11145a;
import p164h.p211a.p212a.p228h.p234y.C11156b;
import p164h.p211a.p212a.p228h.p234y.C11158c;

/* renamed from: h.a.a.f.y.b */
public abstract class C11063b extends C11145a implements C11044s {

    /* renamed from: h */
    private static final C11158c f21771h = C11156b.m29015a(C11063b.class);

    /* renamed from: e */
    protected Random f21772e;

    /* renamed from: f */
    protected boolean f21773f;

    /* renamed from: g */
    protected String f21774g;

    /* renamed from: h0 */
    public String mo35024h0(C10709c cVar, long j) {
        synchronized (this) {
            if (cVar != null) {
                try {
                    String k = cVar.mo33921k();
                    if (k != null) {
                        String n0 = mo35027n0(k);
                        if (mo35023b0(n0)) {
                            return n0;
                        }
                    }
                    String str = (String) cVar.mo33964a("org.eclipse.jetty.server.newSessionId");
                    if (str != null && mo35023b0(str)) {
                        return str;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            String str2 = null;
            while (true) {
                if (!(str2 == null || str2.length() == 0)) {
                    if (!mo35023b0(str2)) {
                        cVar.mo33965b("org.eclipse.jetty.server.newSessionId", str2);
                        return str2;
                    }
                }
                long hashCode = this.f21773f ? ((((long) hashCode()) ^ Runtime.getRuntime().freeMemory()) ^ ((long) this.f21772e.nextInt())) ^ (((long) cVar.hashCode()) << 32) : this.f21772e.nextLong();
                if (hashCode < 0) {
                    hashCode = -hashCode;
                }
                long hashCode2 = this.f21773f ? (((long) cVar.hashCode()) << 32) ^ ((((long) hashCode()) ^ Runtime.getRuntime().freeMemory()) ^ ((long) this.f21772e.nextInt())) : this.f21772e.nextLong();
                if (hashCode2 < 0) {
                    hashCode2 = -hashCode2;
                }
                str2 = Long.toString(hashCode, 36) + Long.toString(hashCode2, 36);
                if (this.f21774g != null) {
                    str2 = this.f21774g + str2;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: p0 */
    public void mo34262p0() {
        mo35131y0();
    }

    /* access modifiers changed from: protected */
    /* renamed from: q0 */
    public void mo34263q0() {
    }

    /* renamed from: y0 */
    public void mo35131y0() {
        Random random = this.f21772e;
        if (random == null) {
            try {
                this.f21772e = new SecureRandom();
            } catch (Exception e) {
                f21771h.mo35492h("Could not generate SecureRandom for session-id randomness", e);
                this.f21772e = new Random();
                this.f21773f = true;
            }
        } else {
            random.setSeed(((random.nextLong() ^ System.currentTimeMillis()) ^ ((long) hashCode())) ^ Runtime.getRuntime().freeMemory());
        }
    }
}
