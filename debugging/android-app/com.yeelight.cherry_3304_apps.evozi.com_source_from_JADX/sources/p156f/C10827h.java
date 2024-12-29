package p156f;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: f.h */
public final class C10827h {

    /* renamed from: b */
    static final Comparator<String> f20869b = new C10828a();

    /* renamed from: c */
    private static final Map<String, C10827h> f20870c = new LinkedHashMap();

    /* renamed from: d */
    public static final C10827h f20871d = m26957c("SSL_RSA_WITH_3DES_EDE_CBC_SHA", 10);

    /* renamed from: e */
    public static final C10827h f20872e = m26957c("TLS_RSA_WITH_AES_128_CBC_SHA", 47);

    /* renamed from: f */
    public static final C10827h f20873f = m26957c("TLS_RSA_WITH_AES_256_CBC_SHA", 53);

    /* renamed from: g */
    public static final C10827h f20874g = m26957c("TLS_RSA_WITH_AES_128_GCM_SHA256", 156);

    /* renamed from: h */
    public static final C10827h f20875h = m26957c("TLS_RSA_WITH_AES_256_GCM_SHA384", 157);

    /* renamed from: i */
    public static final C10827h f20876i = m26957c("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", 49171);

    /* renamed from: j */
    public static final C10827h f20877j = m26957c("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA", 49172);

    /* renamed from: k */
    public static final C10827h f20878k = m26957c("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", 49195);

    /* renamed from: l */
    public static final C10827h f20879l = m26957c("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", 49196);

    /* renamed from: m */
    public static final C10827h f20880m = m26957c("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", 49199);

    /* renamed from: n */
    public static final C10827h f20881n = m26957c("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", 49200);

    /* renamed from: o */
    public static final C10827h f20882o = m26957c("TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52392);

    /* renamed from: p */
    public static final C10827h f20883p = m26957c("TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256", 52393);

    /* renamed from: q */
    public static final C10827h f20884q = m26957c("TLS_AES_128_GCM_SHA256", 4865);

    /* renamed from: r */
    public static final C10827h f20885r = m26957c("TLS_AES_256_GCM_SHA384", 4866);

    /* renamed from: s */
    public static final C10827h f20886s = m26957c("TLS_CHACHA20_POLY1305_SHA256", 4867);

    /* renamed from: t */
    public static final C10827h f20887t = m26957c("TLS_AES_128_CCM_SHA256", 4868);

    /* renamed from: u */
    public static final C10827h f20888u = m26957c("TLS_AES_256_CCM_8_SHA256", 4869);

    /* renamed from: a */
    final String f20889a;

    /* renamed from: f.h$a */
    class C10828a implements Comparator<String> {
        C10828a() {
        }

        /* renamed from: a */
        public int compare(String str, String str2) {
            int min = Math.min(str.length(), str2.length());
            for (int i = 4; i < min; i++) {
                char charAt = str.charAt(i);
                char charAt2 = str2.charAt(i);
                if (charAt != charAt2) {
                    return charAt < charAt2 ? -1 : 1;
                }
            }
            int length = str.length();
            int length2 = str2.length();
            if (length != length2) {
                return length < length2 ? -1 : 1;
            }
            return 0;
        }
    }

    static {
        m26957c("SSL_RSA_WITH_NULL_MD5", 1);
        m26957c("SSL_RSA_WITH_NULL_SHA", 2);
        m26957c("SSL_RSA_EXPORT_WITH_RC4_40_MD5", 3);
        m26957c("SSL_RSA_WITH_RC4_128_MD5", 4);
        m26957c("SSL_RSA_WITH_RC4_128_SHA", 5);
        m26957c("SSL_RSA_EXPORT_WITH_DES40_CBC_SHA", 8);
        m26957c("SSL_RSA_WITH_DES_CBC_SHA", 9);
        m26957c("SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA", 17);
        m26957c("SSL_DHE_DSS_WITH_DES_CBC_SHA", 18);
        m26957c("SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA", 19);
        m26957c("SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA", 20);
        m26957c("SSL_DHE_RSA_WITH_DES_CBC_SHA", 21);
        m26957c("SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA", 22);
        m26957c("SSL_DH_anon_EXPORT_WITH_RC4_40_MD5", 23);
        m26957c("SSL_DH_anon_WITH_RC4_128_MD5", 24);
        m26957c("SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA", 25);
        m26957c("SSL_DH_anon_WITH_DES_CBC_SHA", 26);
        m26957c("SSL_DH_anon_WITH_3DES_EDE_CBC_SHA", 27);
        m26957c("TLS_KRB5_WITH_DES_CBC_SHA", 30);
        m26957c("TLS_KRB5_WITH_3DES_EDE_CBC_SHA", 31);
        m26957c("TLS_KRB5_WITH_RC4_128_SHA", 32);
        m26957c("TLS_KRB5_WITH_DES_CBC_MD5", 34);
        m26957c("TLS_KRB5_WITH_3DES_EDE_CBC_MD5", 35);
        m26957c("TLS_KRB5_WITH_RC4_128_MD5", 36);
        m26957c("TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA", 38);
        m26957c("TLS_KRB5_EXPORT_WITH_RC4_40_SHA", 40);
        m26957c("TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5", 41);
        m26957c("TLS_KRB5_EXPORT_WITH_RC4_40_MD5", 43);
        m26957c("TLS_DHE_DSS_WITH_AES_128_CBC_SHA", 50);
        m26957c("TLS_DHE_RSA_WITH_AES_128_CBC_SHA", 51);
        m26957c("TLS_DH_anon_WITH_AES_128_CBC_SHA", 52);
        m26957c("TLS_DHE_DSS_WITH_AES_256_CBC_SHA", 56);
        m26957c("TLS_DHE_RSA_WITH_AES_256_CBC_SHA", 57);
        m26957c("TLS_DH_anon_WITH_AES_256_CBC_SHA", 58);
        m26957c("TLS_RSA_WITH_NULL_SHA256", 59);
        m26957c("TLS_RSA_WITH_AES_128_CBC_SHA256", 60);
        m26957c("TLS_RSA_WITH_AES_256_CBC_SHA256", 61);
        m26957c("TLS_DHE_DSS_WITH_AES_128_CBC_SHA256", 64);
        m26957c("TLS_RSA_WITH_CAMELLIA_128_CBC_SHA", 65);
        m26957c("TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA", 68);
        m26957c("TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA", 69);
        m26957c("TLS_DHE_RSA_WITH_AES_128_CBC_SHA256", 103);
        m26957c("TLS_DHE_DSS_WITH_AES_256_CBC_SHA256", 106);
        m26957c("TLS_DHE_RSA_WITH_AES_256_CBC_SHA256", 107);
        m26957c("TLS_DH_anon_WITH_AES_128_CBC_SHA256", 108);
        m26957c("TLS_DH_anon_WITH_AES_256_CBC_SHA256", 109);
        m26957c("TLS_RSA_WITH_CAMELLIA_256_CBC_SHA", 132);
        m26957c("TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA", 135);
        m26957c("TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA", 136);
        m26957c("TLS_PSK_WITH_RC4_128_SHA", 138);
        m26957c("TLS_PSK_WITH_3DES_EDE_CBC_SHA", 139);
        m26957c("TLS_PSK_WITH_AES_128_CBC_SHA", 140);
        m26957c("TLS_PSK_WITH_AES_256_CBC_SHA", 141);
        m26957c("TLS_RSA_WITH_SEED_CBC_SHA", 150);
        m26957c("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256", 158);
        m26957c("TLS_DHE_RSA_WITH_AES_256_GCM_SHA384", 159);
        m26957c("TLS_DHE_DSS_WITH_AES_128_GCM_SHA256", 162);
        m26957c("TLS_DHE_DSS_WITH_AES_256_GCM_SHA384", 163);
        m26957c("TLS_DH_anon_WITH_AES_128_GCM_SHA256", 166);
        m26957c("TLS_DH_anon_WITH_AES_256_GCM_SHA384", 167);
        m26957c("TLS_EMPTY_RENEGOTIATION_INFO_SCSV", 255);
        m26957c("TLS_FALLBACK_SCSV", 22016);
        m26957c("TLS_ECDH_ECDSA_WITH_NULL_SHA", 49153);
        m26957c("TLS_ECDH_ECDSA_WITH_RC4_128_SHA", 49154);
        m26957c("TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA", 49155);
        m26957c("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA", 49156);
        m26957c("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA", 49157);
        m26957c("TLS_ECDHE_ECDSA_WITH_NULL_SHA", 49158);
        m26957c("TLS_ECDHE_ECDSA_WITH_RC4_128_SHA", 49159);
        m26957c("TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA", 49160);
        m26957c("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", 49161);
        m26957c("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA", 49162);
        m26957c("TLS_ECDH_RSA_WITH_NULL_SHA", 49163);
        m26957c("TLS_ECDH_RSA_WITH_RC4_128_SHA", 49164);
        m26957c("TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA", 49165);
        m26957c("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA", 49166);
        m26957c("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA", 49167);
        m26957c("TLS_ECDHE_RSA_WITH_NULL_SHA", 49168);
        m26957c("TLS_ECDHE_RSA_WITH_RC4_128_SHA", 49169);
        m26957c("TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA", 49170);
        m26957c("TLS_ECDH_anon_WITH_NULL_SHA", 49173);
        m26957c("TLS_ECDH_anon_WITH_RC4_128_SHA", 49174);
        m26957c("TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA", 49175);
        m26957c("TLS_ECDH_anon_WITH_AES_128_CBC_SHA", 49176);
        m26957c("TLS_ECDH_anon_WITH_AES_256_CBC_SHA", 49177);
        m26957c("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256", 49187);
        m26957c("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384", 49188);
        m26957c("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256", 49189);
        m26957c("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384", 49190);
        m26957c("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256", 49191);
        m26957c("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384", 49192);
        m26957c("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256", 49193);
        m26957c("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384", 49194);
        m26957c("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256", 49197);
        m26957c("TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384", 49198);
        m26957c("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256", 49201);
        m26957c("TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384", 49202);
        m26957c("TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA", 49205);
        m26957c("TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA", 49206);
        m26957c("TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52394);
        m26957c("TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256", 52396);
    }

    private C10827h(String str) {
        if (str != null) {
            this.f20889a = str;
            return;
        }
        throw null;
    }

    /* renamed from: a */
    public static synchronized C10827h m26955a(String str) {
        C10827h hVar;
        synchronized (C10827h.class) {
            hVar = f20870c.get(str);
            if (hVar == null) {
                hVar = f20870c.get(m26958e(str));
                if (hVar == null) {
                    hVar = new C10827h(str);
                }
                f20870c.put(str, hVar);
            }
        }
        return hVar;
    }

    /* renamed from: b */
    static List<C10827h> m26956b(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String a : strArr) {
            arrayList.add(m26955a(a));
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: c */
    private static C10827h m26957c(String str, int i) {
        C10827h hVar = new C10827h(str);
        f20870c.put(str, hVar);
        return hVar;
    }

    /* renamed from: e */
    private static String m26958e(String str) {
        if (str.startsWith("TLS_")) {
            return "SSL_" + str.substring(4);
        } else if (!str.startsWith("SSL_")) {
            return str;
        } else {
            return "TLS_" + str.substring(4);
        }
    }

    /* renamed from: d */
    public String mo34153d() {
        return this.f20889a;
    }

    public String toString() {
        return this.f20889a;
    }
}
