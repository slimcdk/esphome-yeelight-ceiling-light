package p164h.p165b.p166a.p240h.p243r.p247n;

import com.google.android.gms.stats.CodePackage;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Logger;

/* renamed from: h.b.a.h.r.n.f0 */
public abstract class C11296f0<T> {

    /* renamed from: b */
    private static final Logger f22402b = Logger.getLogger(C11296f0.class.getName());

    /* renamed from: a */
    private T f22403a;

    /* renamed from: h.b.a.h.r.n.f0$a */
    public enum C11297a {
        USN("USN", C11294e0.class, C11295f.class, C11317x.class, r5),
        NT("NT", r4, r3, r2, r1, r0, r5, C11309p.class),
        NTS("NTS", C11310q.class),
        HOST("HOST", C11302i.class),
        SERVER("SERVER", C11315v.class),
        f22410h(CodePackage.LOCATION, C11305l.class),
        MAX_AGE("CACHE-CONTROL", C11308o.class),
        USER_AGENT("USER-AGENT", C11300g0.class),
        CONTENT_TYPE("CONTENT-TYPE", C11291d.class),
        MAN("MAN", C11306m.class),
        MX("MX", C11307n.class),
        ST("ST", C11314u.class, r4, r3, r2, r1, r0, r5),
        EXT("EXT", C11299g.class),
        SOAPACTION("SOAPACTION", C11318y.class),
        TIMEOUT("TIMEOUT", C11286a0.class),
        CALLBACK("CALLBACK", C11287b.class),
        SID("SID", C11319z.class),
        SEQ("SEQ", C11301h.class),
        RANGE("RANGE", C11312s.class),
        CONTENT_RANGE("CONTENT-RANGE", C11289c.class),
        PRAGMA("PRAGMA", C11311r.class),
        EXT_IFACE_MAC("X-CLING-IFACE-MAC", C11303j.class),
        EXT_AV_CLIENT_INFO("X-AV-CLIENT-INFO", C11285a.class);
        

        /* renamed from: z */
        private static Map<String, C11297a> f22428z;

        /* renamed from: a */
        private String f22429a;

        /* renamed from: b */
        private Class<? extends C11296f0>[] f22430b;

        /* renamed from: h.b.a.h.r.n.f0$a$a */
        static class C11298a extends HashMap<String, C11297a> {
            C11298a() {
                for (C11297a aVar : C11297a.values()) {
                    put(aVar.mo35849c(), aVar);
                }
            }
        }

        static {
            f22428z = new C11298a();
        }

        @SafeVarargs
        private C11297a(String str, Class<? extends C11296f0>... clsArr) {
            this.f22429a = str;
            this.f22430b = clsArr;
        }

        /* renamed from: a */
        public static C11297a m29511a(String str) {
            if (str == null) {
                return null;
            }
            return f22428z.get(str.toUpperCase(Locale.ROOT));
        }

        /* renamed from: b */
        public Class<? extends C11296f0>[] mo35848b() {
            return this.f22430b;
        }

        /* renamed from: c */
        public String mo35849c() {
            return this.f22429a;
        }

        /* renamed from: d */
        public boolean mo35850d(Class<? extends C11296f0> cls) {
            for (Class isAssignableFrom : mo35848b()) {
                if (isAssignableFrom.isAssignableFrom(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0042, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0043, code lost:
        r4 = r2;
        r2 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0072, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0073, code lost:
        f22402b.finest("Invalid header value for tested type: " + r3.getSimpleName() + " - " + r2.getMessage());
        r2 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0072 A[ExcHandler: k (r2v3 'e' h.b.a.h.r.n.k A[CUSTOM_DECLARE]), Splitter:B:5:0x0012] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p164h.p165b.p166a.p240h.p243r.p247n.C11296f0 m29506c(p164h.p165b.p166a.p240h.p243r.p247n.C11296f0.C11297a r7, java.lang.String r8) {
        /*
            r0 = 0
            r1 = 0
            r2 = r0
        L_0x0003:
            java.lang.Class[] r3 = r7.mo35848b()
            int r3 = r3.length
            if (r1 >= r3) goto L_0x009e
            if (r2 != 0) goto L_0x009e
            java.lang.Class[] r3 = r7.mo35848b()
            r3 = r3[r1]
            java.util.logging.Logger r4 = f22402b     // Catch:{ k -> 0x0072, Exception -> 0x0042 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ k -> 0x0072, Exception -> 0x0042 }
            r5.<init>()     // Catch:{ k -> 0x0072, Exception -> 0x0042 }
            java.lang.String r6 = "Trying to parse '"
            r5.append(r6)     // Catch:{ k -> 0x0072, Exception -> 0x0042 }
            r5.append(r7)     // Catch:{ k -> 0x0072, Exception -> 0x0042 }
            java.lang.String r6 = "' with class: "
            r5.append(r6)     // Catch:{ k -> 0x0072, Exception -> 0x0042 }
            java.lang.String r6 = r3.getSimpleName()     // Catch:{ k -> 0x0072, Exception -> 0x0042 }
            r5.append(r6)     // Catch:{ k -> 0x0072, Exception -> 0x0042 }
            java.lang.String r5 = r5.toString()     // Catch:{ k -> 0x0072, Exception -> 0x0042 }
            r4.finest(r5)     // Catch:{ k -> 0x0072, Exception -> 0x0042 }
            java.lang.Object r4 = r3.newInstance()     // Catch:{ k -> 0x0072, Exception -> 0x0042 }
            h.b.a.h.r.n.f0 r4 = (p164h.p165b.p166a.p240h.p243r.p247n.C11296f0) r4     // Catch:{ k -> 0x0072, Exception -> 0x0042 }
            if (r8 == 0) goto L_0x0070
            r4.mo35842d(r8)     // Catch:{ k -> 0x0072, Exception -> 0x0040 }
            goto L_0x0070
        L_0x0040:
            r2 = move-exception
            goto L_0x0045
        L_0x0042:
            r3 = move-exception
            r4 = r2
            r2 = r3
        L_0x0045:
            java.util.logging.Logger r3 = f22402b
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Error instantiating header of type '"
            r5.append(r6)
            r5.append(r7)
            java.lang.String r6 = "' with value: "
            r5.append(r6)
            r5.append(r8)
            java.lang.String r5 = r5.toString()
            r3.severe(r5)
            java.util.logging.Logger r3 = f22402b
            java.util.logging.Level r5 = java.util.logging.Level.SEVERE
            java.lang.Throwable r2 = p164h.p257c.p259b.C11495a.m30173a(r2)
            java.lang.String r6 = "Exception root cause: "
            r3.log(r5, r6, r2)
        L_0x0070:
            r2 = r4
            goto L_0x009a
        L_0x0072:
            r2 = move-exception
            java.util.logging.Logger r4 = f22402b
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Invalid header value for tested type: "
            r5.append(r6)
            java.lang.String r3 = r3.getSimpleName()
            r5.append(r3)
            java.lang.String r3 = " - "
            r5.append(r3)
            java.lang.String r2 = r2.getMessage()
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            r4.finest(r2)
            r2 = r0
        L_0x009a:
            int r1 = r1 + 1
            goto L_0x0003
        L_0x009e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p164h.p165b.p166a.p240h.p243r.p247n.C11296f0.m29506c(h.b.a.h.r.n.f0$a, java.lang.String):h.b.a.h.r.n.f0");
    }

    /* renamed from: a */
    public abstract String mo35841a();

    /* renamed from: b */
    public T mo35845b() {
        return this.f22403a;
    }

    /* renamed from: d */
    public abstract void mo35842d(String str);

    /* renamed from: e */
    public void mo35846e(T t) {
        this.f22403a = t;
    }

    public String toString() {
        return "(" + getClass().getSimpleName() + ") '" + mo35845b() + "'";
    }
}
