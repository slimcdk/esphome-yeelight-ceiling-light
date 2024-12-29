package p136c6;

import java.security.SecureRandom;
import java.util.Random;
import javax.servlet.http.C9277a;
import p147d6.C8941a;
import p152e6.C9001b;
import p152e6.C9003c;
import p239z5.C12191u;

/* renamed from: c6.b */
public abstract class C4014b extends C8941a implements C12191u {

    /* renamed from: h */
    private static final C9003c f6798h = C9001b.m21450a(C4014b.class);

    /* renamed from: e */
    protected Random f6799e;

    /* renamed from: f */
    protected boolean f6800f;

    /* renamed from: g */
    protected String f6801g;

    /* renamed from: D0 */
    public void mo26653D0() {
        Random random = this.f6799e;
        if (random == null) {
            try {
                this.f6799e = new SecureRandom();
            } catch (Exception e) {
                f6798h.mo36852g("Could not generate SecureRandom for session-id randomness", e);
                this.f6799e = new Random();
                this.f6800f = true;
            }
        } else {
            random.setSeed(((random.nextLong() ^ System.currentTimeMillis()) ^ ((long) hashCode())) ^ Runtime.getRuntime().freeMemory());
        }
    }

    /* renamed from: k0 */
    public String mo26654k0(C9277a aVar, long j) {
        synchronized (this) {
            if (aVar != null) {
                try {
                    String j2 = aVar.mo37765j();
                    if (j2 != null) {
                        String s0 = mo26689s0(j2);
                        if (mo26686d0(s0)) {
                            return s0;
                        }
                    }
                    String str = (String) aVar.mo40040a("org.eclipse.jetty.server.newSessionId");
                    if (str != null && mo26686d0(str)) {
                        return str;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            String str2 = null;
            while (true) {
                if (!(str2 == null || str2.length() == 0)) {
                    if (!mo26686d0(str2)) {
                        aVar.mo41944b("org.eclipse.jetty.server.newSessionId", str2);
                        return str2;
                    }
                }
                long hashCode = this.f6800f ? ((((long) hashCode()) ^ Runtime.getRuntime().freeMemory()) ^ ((long) this.f6799e.nextInt())) ^ (((long) aVar.hashCode()) << 32) : this.f6799e.nextLong();
                if (hashCode < 0) {
                    hashCode = -hashCode;
                }
                long hashCode2 = this.f6800f ? (((long) aVar.hashCode()) << 32) ^ ((((long) hashCode()) ^ Runtime.getRuntime().freeMemory()) ^ ((long) this.f6799e.nextInt())) : this.f6799e.nextLong();
                if (hashCode2 < 0) {
                    hashCode2 = -hashCode2;
                }
                str2 = Long.toString(hashCode, 36) + Long.toString(hashCode2, 36);
                if (this.f6801g != null) {
                    str2 = this.f6801g + str2;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u0 */
    public void mo26547u0() {
        mo26653D0();
    }

    /* access modifiers changed from: protected */
    /* renamed from: v0 */
    public void mo26548v0() {
    }
}
