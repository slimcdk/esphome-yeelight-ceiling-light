package okhttp3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* renamed from: okhttp3.h */
public final class C9799h {

    /* renamed from: b */
    static final Comparator<String> f17672b = new C9800a();

    /* renamed from: c */
    private static final Map<String, C9799h> f17673c = new LinkedHashMap();

    /* renamed from: d */
    public static final C9799h f17674d = m23504c("SSL_RSA_WITH_3DES_EDE_CBC_SHA", 10);

    /* renamed from: e */
    public static final C9799h f17675e = m23504c("TLS_RSA_WITH_AES_128_CBC_SHA", 47);

    /* renamed from: f */
    public static final C9799h f17676f = m23504c("TLS_RSA_WITH_AES_256_CBC_SHA", 53);

    /* renamed from: g */
    public static final C9799h f17677g = m23504c("TLS_RSA_WITH_AES_128_GCM_SHA256", 156);

    /* renamed from: h */
    public static final C9799h f17678h = m23504c("TLS_RSA_WITH_AES_256_GCM_SHA384", 157);

    /* renamed from: i */
    public static final C9799h f17679i = m23504c("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", 49171);

    /* renamed from: j */
    public static final C9799h f17680j = m23504c("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA", 49172);

    /* renamed from: k */
    public static final C9799h f17681k = m23504c("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", 49195);

    /* renamed from: l */
    public static final C9799h f17682l = m23504c("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", 49196);

    /* renamed from: m */
    public static final C9799h f17683m = m23504c("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", 49199);

    /* renamed from: n */
    public static final C9799h f17684n = m23504c("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", 49200);

    /* renamed from: o */
    public static final C9799h f17685o = m23504c("TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52392);

    /* renamed from: p */
    public static final C9799h f17686p = m23504c("TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256", 52393);

    /* renamed from: q */
    public static final C9799h f17687q = m23504c("TLS_AES_128_GCM_SHA256", 4865);

    /* renamed from: r */
    public static final C9799h f17688r = m23504c("TLS_AES_256_GCM_SHA384", 4866);

    /* renamed from: s */
    public static final C9799h f17689s = m23504c("TLS_CHACHA20_POLY1305_SHA256", 4867);

    /* renamed from: t */
    public static final C9799h f17690t = m23504c("TLS_AES_128_CCM_SHA256", 4868);

    /* renamed from: u */
    public static final C9799h f17691u = m23504c("TLS_AES_256_CCM_8_SHA256", 4869);

    /* renamed from: a */
    final String f17692a;

    /* renamed from: okhttp3.h$a */
    class C9800a implements Comparator<String> {
        C9800a() {
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
        m23504c("SSL_RSA_WITH_NULL_MD5", 1);
        m23504c("SSL_RSA_WITH_NULL_SHA", 2);
        m23504c("SSL_RSA_EXPORT_WITH_RC4_40_MD5", 3);
        m23504c("SSL_RSA_WITH_RC4_128_MD5", 4);
        m23504c("SSL_RSA_WITH_RC4_128_SHA", 5);
        m23504c("SSL_RSA_EXPORT_WITH_DES40_CBC_SHA", 8);
        m23504c("SSL_RSA_WITH_DES_CBC_SHA", 9);
        m23504c("SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA", 17);
        m23504c("SSL_DHE_DSS_WITH_DES_CBC_SHA", 18);
        m23504c("SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA", 19);
        m23504c("SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA", 20);
        m23504c("SSL_DHE_RSA_WITH_DES_CBC_SHA", 21);
        m23504c("SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA", 22);
        m23504c("SSL_DH_anon_EXPORT_WITH_RC4_40_MD5", 23);
        m23504c("SSL_DH_anon_WITH_RC4_128_MD5", 24);
        m23504c("SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA", 25);
        m23504c("SSL_DH_anon_WITH_DES_CBC_SHA", 26);
        m23504c("SSL_DH_anon_WITH_3DES_EDE_CBC_SHA", 27);
        m23504c("TLS_KRB5_WITH_DES_CBC_SHA", 30);
        m23504c("TLS_KRB5_WITH_3DES_EDE_CBC_SHA", 31);
        m23504c("TLS_KRB5_WITH_RC4_128_SHA", 32);
        m23504c("TLS_KRB5_WITH_DES_CBC_MD5", 34);
        m23504c("TLS_KRB5_WITH_3DES_EDE_CBC_MD5", 35);
        m23504c("TLS_KRB5_WITH_RC4_128_MD5", 36);
        m23504c("TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA", 38);
        m23504c("TLS_KRB5_EXPORT_WITH_RC4_40_SHA", 40);
        m23504c("TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5", 41);
        m23504c("TLS_KRB5_EXPORT_WITH_RC4_40_MD5", 43);
        m23504c("TLS_DHE_DSS_WITH_AES_128_CBC_SHA", 50);
        m23504c("TLS_DHE_RSA_WITH_AES_128_CBC_SHA", 51);
        m23504c("TLS_DH_anon_WITH_AES_128_CBC_SHA", 52);
        m23504c("TLS_DHE_DSS_WITH_AES_256_CBC_SHA", 56);
        m23504c("TLS_DHE_RSA_WITH_AES_256_CBC_SHA", 57);
        m23504c("TLS_DH_anon_WITH_AES_256_CBC_SHA", 58);
        m23504c("TLS_RSA_WITH_NULL_SHA256", 59);
        m23504c("TLS_RSA_WITH_AES_128_CBC_SHA256", 60);
        m23504c("TLS_RSA_WITH_AES_256_CBC_SHA256", 61);
        m23504c("TLS_DHE_DSS_WITH_AES_128_CBC_SHA256", 64);
        m23504c("TLS_RSA_WITH_CAMELLIA_128_CBC_SHA", 65);
        m23504c("TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA", 68);
        m23504c("TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA", 69);
        m23504c("TLS_DHE_RSA_WITH_AES_128_CBC_SHA256", 103);
        m23504c("TLS_DHE_DSS_WITH_AES_256_CBC_SHA256", 106);
        m23504c("TLS_DHE_RSA_WITH_AES_256_CBC_SHA256", 107);
        m23504c("TLS_DH_anon_WITH_AES_128_CBC_SHA256", 108);
        m23504c("TLS_DH_anon_WITH_AES_256_CBC_SHA256", 109);
        m23504c("TLS_RSA_WITH_CAMELLIA_256_CBC_SHA", 132);
        m23504c("TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA", 135);
        m23504c("TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA", 136);
        m23504c("TLS_PSK_WITH_RC4_128_SHA", 138);
        m23504c("TLS_PSK_WITH_3DES_EDE_CBC_SHA", 139);
        m23504c("TLS_PSK_WITH_AES_128_CBC_SHA", 140);
        m23504c("TLS_PSK_WITH_AES_256_CBC_SHA", 141);
        m23504c("TLS_RSA_WITH_SEED_CBC_SHA", 150);
        m23504c("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256", 158);
        m23504c("TLS_DHE_RSA_WITH_AES_256_GCM_SHA384", 159);
        m23504c("TLS_DHE_DSS_WITH_AES_128_GCM_SHA256", 162);
        m23504c("TLS_DHE_DSS_WITH_AES_256_GCM_SHA384", 163);
        m23504c("TLS_DH_anon_WITH_AES_128_GCM_SHA256", 166);
        m23504c("TLS_DH_anon_WITH_AES_256_GCM_SHA384", 167);
        m23504c("TLS_EMPTY_RENEGOTIATION_INFO_SCSV", 255);
        m23504c("TLS_FALLBACK_SCSV", 22016);
        m23504c("TLS_ECDH_ECDSA_WITH_NULL_SHA", 49153);
        m23504c("TLS_ECDH_ECDSA_WITH_RC4_128_SHA", 49154);
        m23504c("TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA", 49155);
        m23504c("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA", 49156);
        m23504c("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA", 49157);
        m23504c("TLS_ECDHE_ECDSA_WITH_NULL_SHA", 49158);
        m23504c("TLS_ECDHE_ECDSA_WITH_RC4_128_SHA", 49159);
        m23504c("TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA", 49160);
        m23504c("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", 49161);
        m23504c("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA", 49162);
        m23504c("TLS_ECDH_RSA_WITH_NULL_SHA", 49163);
        m23504c("TLS_ECDH_RSA_WITH_RC4_128_SHA", 49164);
        m23504c("TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA", 49165);
        m23504c("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA", 49166);
        m23504c("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA", 49167);
        m23504c("TLS_ECDHE_RSA_WITH_NULL_SHA", 49168);
        m23504c("TLS_ECDHE_RSA_WITH_RC4_128_SHA", 49169);
        m23504c("TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA", 49170);
        m23504c("TLS_ECDH_anon_WITH_NULL_SHA", 49173);
        m23504c("TLS_ECDH_anon_WITH_RC4_128_SHA", 49174);
        m23504c("TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA", 49175);
        m23504c("TLS_ECDH_anon_WITH_AES_128_CBC_SHA", 49176);
        m23504c("TLS_ECDH_anon_WITH_AES_256_CBC_SHA", 49177);
        m23504c("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256", 49187);
        m23504c("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384", 49188);
        m23504c("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256", 49189);
        m23504c("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384", 49190);
        m23504c("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256", 49191);
        m23504c("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384", 49192);
        m23504c("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256", 49193);
        m23504c("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384", 49194);
        m23504c("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256", 49197);
        m23504c("TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384", 49198);
        m23504c("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256", 49201);
        m23504c("TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384", 49202);
        m23504c("TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA", 49205);
        m23504c("TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA", 49206);
        m23504c("TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52394);
        m23504c("TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256", 52396);
    }

    private C9799h(String str) {
        Objects.requireNonNull(str);
        this.f17692a = str;
    }

    /* renamed from: a */
    public static synchronized C9799h m23502a(String str) {
        C9799h hVar;
        synchronized (C9799h.class) {
            Map<String, C9799h> map = f17673c;
            hVar = map.get(str);
            if (hVar == null) {
                hVar = map.get(m23505e(str));
                if (hVar == null) {
                    hVar = new C9799h(str);
                }
                map.put(str, hVar);
            }
        }
        return hVar;
    }

    /* renamed from: b */
    static List<C9799h> m23503b(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String a : strArr) {
            arrayList.add(m23502a(a));
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: c */
    private static C9799h m23504c(String str, int i) {
        C9799h hVar = new C9799h(str);
        f17673c.put(str, hVar);
        return hVar;
    }

    /* renamed from: e */
    private static String m23505e(String str) {
        if (str.startsWith("TLS_")) {
            return "SSL_" + str.substring(4);
        } else if (!str.startsWith("SSL_")) {
            return str;
        } else {
            return "TLS_" + str.substring(4);
        }
    }

    /* renamed from: d */
    public String mo38989d() {
        return this.f17692a;
    }

    public String toString() {
        return this.f17692a;
    }
}
