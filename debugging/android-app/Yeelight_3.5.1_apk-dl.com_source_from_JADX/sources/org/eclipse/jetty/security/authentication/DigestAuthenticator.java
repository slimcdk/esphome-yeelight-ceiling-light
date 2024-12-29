package org.eclipse.jetty.security.authentication;

import com.miot.service.common.crypto.rc4coder.Coder;
import com.xiaomi.mipush.sdk.Constants;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.eclipse.jetty.util.C9980d;
import org.eclipse.jetty.util.C9996o;
import org.eclipse.jetty.util.security.Constraint;
import org.eclipse.jetty.util.security.Credential;
import p152e6.C9001b;
import p152e6.C9003c;
import p208s4.C10364p;
import p208s4.C10368t;
import p234y5.C12072a;
import p239z5.C12159d;
import p239z5.C12181o;

public class DigestAuthenticator extends C9938e {
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final C9003c f18187h = C9001b.m21450a(DigestAuthenticator.class);

    /* renamed from: d */
    SecureRandom f18188d = new SecureRandom();

    /* renamed from: e */
    private long f18189e = 60000;

    /* renamed from: f */
    private ConcurrentMap<String, C9928a> f18190f = new ConcurrentHashMap();

    /* renamed from: g */
    private Queue<C9928a> f18191g = new ConcurrentLinkedQueue();

    private static class Digest extends Credential {
        private static final long serialVersionUID = -2484639019549527724L;
        String cnonce = "";
        final String method;

        /* renamed from: nc */
        String f18192nc = "";
        String nonce = "";
        String qop = "";
        String realm = "";
        String response = "";
        String uri = "";
        String username = "";

        Digest(String str) {
            this.method = str;
        }

        public boolean check(Object obj) {
            byte[] bArr;
            if (obj instanceof char[]) {
                obj = new String((char[]) obj);
            }
            String obj2 = obj instanceof String ? (String) obj : obj.toString();
            try {
                MessageDigest instance = MessageDigest.getInstance(Coder.KEY_MD5);
                if (obj instanceof Credential.MD5) {
                    bArr = ((Credential.MD5) obj).getDigest();
                } else {
                    instance.update(this.username.getBytes("ISO-8859-1"));
                    instance.update((byte) 58);
                    instance.update(this.realm.getBytes("ISO-8859-1"));
                    instance.update((byte) 58);
                    instance.update(obj2.getBytes("ISO-8859-1"));
                    bArr = instance.digest();
                }
                instance.reset();
                instance.update(this.method.getBytes("ISO-8859-1"));
                instance.update((byte) 58);
                instance.update(this.uri.getBytes("ISO-8859-1"));
                byte[] digest = instance.digest();
                instance.update(C9996o.m24722i(bArr, 16).getBytes("ISO-8859-1"));
                instance.update((byte) 58);
                instance.update(this.nonce.getBytes("ISO-8859-1"));
                instance.update((byte) 58);
                instance.update(this.f18192nc.getBytes("ISO-8859-1"));
                instance.update((byte) 58);
                instance.update(this.cnonce.getBytes("ISO-8859-1"));
                instance.update((byte) 58);
                instance.update(this.qop.getBytes("ISO-8859-1"));
                instance.update((byte) 58);
                instance.update(C9996o.m24722i(digest, 16).getBytes("ISO-8859-1"));
                return C9996o.m24722i(instance.digest(), 16).equalsIgnoreCase(this.response);
            } catch (Exception e) {
                DigestAuthenticator.f18187h.mo36856j(e);
                return false;
            }
        }

        public String toString() {
            return this.username + Constants.ACCEPT_TIME_SEPARATOR_SP + this.response;
        }
    }

    /* renamed from: org.eclipse.jetty.security.authentication.DigestAuthenticator$a */
    private static class C9928a {

        /* renamed from: a */
        final String f18193a;

        /* renamed from: b */
        final long f18194b;

        /* renamed from: c */
        AtomicInteger f18195c = new AtomicInteger();

        public C9928a(String str, long j) {
            this.f18193a = str;
            this.f18194b = j;
        }
    }

    /* renamed from: h */
    private int m24343h(Digest digest, C12181o oVar) {
        long V;
        int i;
        synchronized (this) {
            V = oVar.mo43096V() - this.f18189e;
        }
        while (true) {
            C9928a peek = this.f18191g.peek();
            if (peek != null && peek.f18194b < V) {
                this.f18191g.remove(peek);
                this.f18190f.remove(peek.f18193a);
            }
        }
        try {
            C9928a aVar = (C9928a) this.f18190f.get(digest.nonce);
            if (aVar == null) {
                return 0;
            }
            long parseLong = Long.parseLong(digest.f18192nc, 16);
            if (parseLong > 2147483647L) {
                return 0;
            }
            AtomicInteger atomicInteger = aVar.f18195c;
            while (true) {
                i = atomicInteger.get();
                if (aVar.f18195c.compareAndSet(i, (int) parseLong)) {
                    break;
                }
                atomicInteger = aVar.f18195c;
            }
            return parseLong <= ((long) i) ? -1 : 1;
        } catch (Exception e) {
            f18187h.mo36849d(e);
            return -1;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:62:0x00f0 A[Catch:{ IOException -> 0x0142 }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x013f A[Catch:{ IOException -> 0x0142 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p239z5.C12159d mo39889a(p208s4.C10364p r11, p208s4.C10368t r12, boolean r13) {
        /*
            r10 = this;
            if (r13 != 0) goto L_0x0008
            org.eclipse.jetty.security.authentication.c r11 = new org.eclipse.jetty.security.authentication.c
            r11.<init>(r10)
            return r11
        L_0x0008:
            r13 = r11
            javax.servlet.http.a r13 = (javax.servlet.http.C9277a) r13
            javax.servlet.http.c r12 = (javax.servlet.http.C9279c) r12
            java.lang.String r0 = "Authorization"
            java.lang.String r0 = r13.mo37770r(r0)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x00e9
            e6.c r3 = f18187h     // Catch:{ IOException -> 0x0142 }
            boolean r4 = r3.mo36846a()     // Catch:{ IOException -> 0x0142 }
            if (r4 == 0) goto L_0x0035
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0142 }
            r4.<init>()     // Catch:{ IOException -> 0x0142 }
            java.lang.String r5 = "Credentials: "
            r4.append(r5)     // Catch:{ IOException -> 0x0142 }
            r4.append(r0)     // Catch:{ IOException -> 0x0142 }
            java.lang.String r4 = r4.toString()     // Catch:{ IOException -> 0x0142 }
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ IOException -> 0x0142 }
            r3.mo36850e(r4, r5)     // Catch:{ IOException -> 0x0142 }
        L_0x0035:
            org.eclipse.jetty.util.m r3 = new org.eclipse.jetty.util.m     // Catch:{ IOException -> 0x0142 }
            java.lang.String r4 = "=, "
            r3.<init>(r0, r4, r1, r2)     // Catch:{ IOException -> 0x0142 }
            org.eclipse.jetty.security.authentication.DigestAuthenticator$Digest r0 = new org.eclipse.jetty.security.authentication.DigestAuthenticator$Digest     // Catch:{ IOException -> 0x0142 }
            java.lang.String r4 = r13.mo37767l()     // Catch:{ IOException -> 0x0142 }
            r0.<init>(r4)     // Catch:{ IOException -> 0x0142 }
            r4 = 0
            r5 = r4
            r6 = r5
        L_0x0048:
            boolean r7 = r3.hasMoreTokens()     // Catch:{ IOException -> 0x0142 }
            if (r7 == 0) goto L_0x00cb
            java.lang.String r7 = r3.nextToken()     // Catch:{ IOException -> 0x0142 }
            int r8 = r7.length()     // Catch:{ IOException -> 0x0142 }
            if (r8 != r1) goto L_0x005d
            char r8 = r7.charAt(r2)     // Catch:{ IOException -> 0x0142 }
            goto L_0x005e
        L_0x005d:
            r8 = 0
        L_0x005e:
            r9 = 32
            if (r8 == r9) goto L_0x0048
            r9 = 44
            if (r8 == r9) goto L_0x00c8
            r9 = 61
            if (r8 == r9) goto L_0x00c5
            if (r6 == 0) goto L_0x00c6
            java.lang.String r5 = "username"
            boolean r5 = r5.equalsIgnoreCase(r6)     // Catch:{ IOException -> 0x0142 }
            if (r5 == 0) goto L_0x0077
            r0.username = r7     // Catch:{ IOException -> 0x0142 }
            goto L_0x00c3
        L_0x0077:
            java.lang.String r5 = "realm"
            boolean r5 = r5.equalsIgnoreCase(r6)     // Catch:{ IOException -> 0x0142 }
            if (r5 == 0) goto L_0x0082
            r0.realm = r7     // Catch:{ IOException -> 0x0142 }
            goto L_0x00c3
        L_0x0082:
            java.lang.String r5 = "nonce"
            boolean r5 = r5.equalsIgnoreCase(r6)     // Catch:{ IOException -> 0x0142 }
            if (r5 == 0) goto L_0x008d
            r0.nonce = r7     // Catch:{ IOException -> 0x0142 }
            goto L_0x00c3
        L_0x008d:
            java.lang.String r5 = "nc"
            boolean r5 = r5.equalsIgnoreCase(r6)     // Catch:{ IOException -> 0x0142 }
            if (r5 == 0) goto L_0x0098
            r0.f18192nc = r7     // Catch:{ IOException -> 0x0142 }
            goto L_0x00c3
        L_0x0098:
            java.lang.String r5 = "cnonce"
            boolean r5 = r5.equalsIgnoreCase(r6)     // Catch:{ IOException -> 0x0142 }
            if (r5 == 0) goto L_0x00a3
            r0.cnonce = r7     // Catch:{ IOException -> 0x0142 }
            goto L_0x00c3
        L_0x00a3:
            java.lang.String r5 = "qop"
            boolean r5 = r5.equalsIgnoreCase(r6)     // Catch:{ IOException -> 0x0142 }
            if (r5 == 0) goto L_0x00ae
            r0.qop = r7     // Catch:{ IOException -> 0x0142 }
            goto L_0x00c3
        L_0x00ae:
            java.lang.String r5 = "uri"
            boolean r5 = r5.equalsIgnoreCase(r6)     // Catch:{ IOException -> 0x0142 }
            if (r5 == 0) goto L_0x00b9
            r0.uri = r7     // Catch:{ IOException -> 0x0142 }
            goto L_0x00c3
        L_0x00b9:
            java.lang.String r5 = "response"
            boolean r5 = r5.equalsIgnoreCase(r6)     // Catch:{ IOException -> 0x0142 }
            if (r5 == 0) goto L_0x00c3
            r0.response = r7     // Catch:{ IOException -> 0x0142 }
        L_0x00c3:
            r6 = r4
            goto L_0x00c6
        L_0x00c5:
            r6 = r5
        L_0x00c6:
            r5 = r7
            goto L_0x0048
        L_0x00c8:
            r6 = r4
            goto L_0x0048
        L_0x00cb:
            r3 = r13
            z5.o r3 = (p239z5.C12181o) r3     // Catch:{ IOException -> 0x0142 }
            int r3 = r10.m24343h(r0, r3)     // Catch:{ IOException -> 0x0142 }
            if (r3 <= 0) goto L_0x00e6
            java.lang.String r1 = r0.username     // Catch:{ IOException -> 0x0142 }
            z5.w r11 = r10.mo39913e(r1, r0, r11)     // Catch:{ IOException -> 0x0142 }
            if (r11 == 0) goto L_0x00e9
            y5.l r12 = new y5.l     // Catch:{ IOException -> 0x0142 }
            java.lang.String r13 = r10.getAuthMethod()     // Catch:{ IOException -> 0x0142 }
            r12.<init>(r13, r11)     // Catch:{ IOException -> 0x0142 }
            return r12
        L_0x00e6:
            if (r3 != 0) goto L_0x00e9
            goto L_0x00ea
        L_0x00e9:
            r1 = 0
        L_0x00ea:
            boolean r11 = org.eclipse.jetty.security.authentication.C9931c.m24355d(r12)     // Catch:{ IOException -> 0x0142 }
            if (r11 != 0) goto L_0x013f
            java.lang.String r11 = r13.mo37761e()     // Catch:{ IOException -> 0x0142 }
            if (r11 != 0) goto L_0x00f8
            java.lang.String r11 = "/"
        L_0x00f8:
            java.lang.String r0 = "WWW-Authenticate"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0142 }
            r2.<init>()     // Catch:{ IOException -> 0x0142 }
            java.lang.String r3 = "Digest realm=\""
            r2.append(r3)     // Catch:{ IOException -> 0x0142 }
            y5.g r3 = r10.f18214a     // Catch:{ IOException -> 0x0142 }
            java.lang.String r3 = r3.getName()     // Catch:{ IOException -> 0x0142 }
            r2.append(r3)     // Catch:{ IOException -> 0x0142 }
            java.lang.String r3 = "\", domain=\""
            r2.append(r3)     // Catch:{ IOException -> 0x0142 }
            r2.append(r11)     // Catch:{ IOException -> 0x0142 }
            java.lang.String r11 = "\", nonce=\""
            r2.append(r11)     // Catch:{ IOException -> 0x0142 }
            z5.o r13 = (p239z5.C12181o) r13     // Catch:{ IOException -> 0x0142 }
            java.lang.String r11 = r10.mo39893i(r13)     // Catch:{ IOException -> 0x0142 }
            r2.append(r11)     // Catch:{ IOException -> 0x0142 }
            java.lang.String r11 = "\", algorithm=MD5, qop=\"auth\","
            r2.append(r11)     // Catch:{ IOException -> 0x0142 }
            java.lang.String r11 = " stale="
            r2.append(r11)     // Catch:{ IOException -> 0x0142 }
            r2.append(r1)     // Catch:{ IOException -> 0x0142 }
            java.lang.String r11 = r2.toString()     // Catch:{ IOException -> 0x0142 }
            r12.mo37781o(r0, r11)     // Catch:{ IOException -> 0x0142 }
            r11 = 401(0x191, float:5.62E-43)
            r12.mo37778k(r11)     // Catch:{ IOException -> 0x0142 }
            z5.d r11 = p239z5.C12159d.f22394O     // Catch:{ IOException -> 0x0142 }
            return r11
        L_0x013f:
            z5.d r11 = p239z5.C12159d.f22392M     // Catch:{ IOException -> 0x0142 }
            return r11
        L_0x0142:
            r11 = move-exception
            org.eclipse.jetty.security.ServerAuthException r12 = new org.eclipse.jetty.security.ServerAuthException
            r12.<init>((java.lang.Throwable) r11)
            goto L_0x014a
        L_0x0149:
            throw r12
        L_0x014a:
            goto L_0x0149
        */
        throw new UnsupportedOperationException("Method not decompiled: org.eclipse.jetty.security.authentication.DigestAuthenticator.mo39889a(s4.p, s4.t, boolean):z5.d");
    }

    /* renamed from: b */
    public boolean mo39890b(C10364p pVar, C10368t tVar, boolean z, C12159d.C12167h hVar) {
        return true;
    }

    /* renamed from: c */
    public void mo39891c(C12072a.C12073a aVar) {
        super.mo39891c(aVar);
        String initParameter = aVar.getInitParameter("maxNonceAge");
        if (initParameter != null) {
            synchronized (this) {
                this.f18189e = Long.valueOf(initParameter).longValue();
            }
        }
    }

    public String getAuthMethod() {
        return Constraint.__DIGEST_AUTH;
    }

    /* renamed from: i */
    public String mo39893i(C12181o oVar) {
        C9928a aVar;
        do {
            byte[] bArr = new byte[24];
            this.f18188d.nextBytes(bArr);
            aVar = new C9928a(new String(C9980d.m24668d(bArr)), oVar.mo43096V());
        } while (this.f18190f.putIfAbsent(aVar.f18193a, aVar) != null);
        this.f18191g.add(aVar);
        return aVar.f18193a;
    }
}
