package p156f.p157g0;

import android.support.p002v4.media.session.PlaybackStateCompat;
import com.xiaomi.mipush.sdk.Constants;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.IDN;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import p156f.C4322b0;
import p156f.C4336d0;
import p156f.C4388s;
import p156f.C4390t;
import p156f.C4392v;
import p156f.p157g0.p161i.C10787c;
import p163g.C4406c;
import p163g.C4410e;
import p163g.C4411f;
import p163g.C4416t;
import p163g.C4417u;

/* renamed from: f.g0.c */
public final class C4345c {

    /* renamed from: a */
    public static final byte[] f7640a;

    /* renamed from: b */
    public static final String[] f7641b = new String[0];

    /* renamed from: c */
    public static final C4336d0 f7642c;

    /* renamed from: d */
    private static final C4411f f7643d = C4411f.m12865e("efbbbf");

    /* renamed from: e */
    private static final C4411f f7644e = C4411f.m12865e("feff");

    /* renamed from: f */
    private static final C4411f f7645f = C4411f.m12865e("fffe");

    /* renamed from: g */
    private static final C4411f f7646g = C4411f.m12865e("0000ffff");

    /* renamed from: h */
    private static final C4411f f7647h = C4411f.m12865e("ffff0000");

    /* renamed from: i */
    public static final Charset f7648i = Charset.forName("UTF-8");

    /* renamed from: j */
    private static final Charset f7649j = Charset.forName("UTF-16BE");

    /* renamed from: k */
    private static final Charset f7650k = Charset.forName("UTF-16LE");

    /* renamed from: l */
    private static final Charset f7651l = Charset.forName("UTF-32BE");

    /* renamed from: m */
    private static final Charset f7652m = Charset.forName("UTF-32LE");

    /* renamed from: n */
    public static final TimeZone f7653n = TimeZone.getTimeZone("GMT");

    /* renamed from: o */
    public static final Comparator<String> f7654o = new C4346a();

    /* renamed from: p */
    private static final Method f7655p;

    /* renamed from: q */
    private static final Pattern f7656q = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    /* renamed from: f.g0.c$a */
    class C4346a implements Comparator<String> {
        C4346a() {
        }

        /* renamed from: a */
        public int compare(String str, String str2) {
            return str.compareTo(str2);
        }
    }

    /* renamed from: f.g0.c$b */
    class C4347b implements ThreadFactory {

        /* renamed from: a */
        final /* synthetic */ String f7657a;

        /* renamed from: b */
        final /* synthetic */ boolean f7658b;

        C4347b(String str, boolean z) {
            this.f7657a = str;
            this.f7658b = z;
        }

        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, this.f7657a);
            thread.setDaemon(this.f7658b);
            return thread;
        }
    }

    static {
        byte[] bArr = new byte[0];
        f7640a = bArr;
        Method method = null;
        f7642c = C4336d0.m12307n((C4392v) null, bArr);
        C4322b0.m12220e((C4392v) null, f7640a);
        Charset.forName("ISO-8859-1");
        try {
            method = Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class});
        } catch (Exception unused) {
        }
        f7655p = method;
    }

    /* renamed from: A */
    public static boolean m12344A(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    /* renamed from: B */
    public static boolean m12345B(Comparator<String> comparator, String[] strArr, String[] strArr2) {
        if (!(strArr == null || strArr2 == null || strArr.length == 0 || strArr2.length == 0)) {
            for (String str : strArr) {
                for (String compare : strArr2) {
                    if (comparator.compare(str, compare) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: C */
    public static X509TrustManager m12346C() {
        try {
            TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            instance.init((KeyStore) null);
            TrustManager[] trustManagers = instance.getTrustManagers();
            if (trustManagers.length == 1 && (trustManagers[0] instanceof X509TrustManager)) {
                return (X509TrustManager) trustManagers[0];
            }
            throw new IllegalStateException("Unexpected default trust managers:" + Arrays.toString(trustManagers));
        } catch (GeneralSecurityException e) {
            throw m12355b("No System TLS", e);
        }
    }

    /* renamed from: D */
    public static boolean m12347D(C4416t tVar, int i, TimeUnit timeUnit) {
        long nanoTime = System.nanoTime();
        long c = tVar.mo9542f().mo24315e() ? tVar.mo9542f().mo24313c() - nanoTime : Long.MAX_VALUE;
        tVar.mo9542f().mo24314d(Math.min(c, timeUnit.toNanos((long) i)) + nanoTime);
        try {
            C4406c cVar = new C4406c();
            while (tVar.mo9541P0(cVar, PlaybackStateCompat.ACTION_PLAY_FROM_URI) != -1) {
                cVar.clear();
            }
            int i2 = (c > Long.MAX_VALUE ? 1 : (c == Long.MAX_VALUE ? 0 : -1));
            C4417u f = tVar.mo9542f();
            if (i2 == 0) {
                f.mo24311a();
            } else {
                f.mo24314d(nanoTime + c);
            }
            return true;
        } catch (InterruptedIOException unused) {
            int i3 = (c > Long.MAX_VALUE ? 1 : (c == Long.MAX_VALUE ? 0 : -1));
            C4417u f2 = tVar.mo9542f();
            if (i3 == 0) {
                f2.mo24311a();
            } else {
                f2.mo24314d(nanoTime + c);
            }
            return false;
        } catch (Throwable th) {
            int i4 = (c > Long.MAX_VALUE ? 1 : (c == Long.MAX_VALUE ? 0 : -1));
            C4417u f3 = tVar.mo9542f();
            if (i4 == 0) {
                f3.mo24311a();
            } else {
                f3.mo24314d(nanoTime + c);
            }
            throw th;
        }
    }

    /* renamed from: E */
    public static int m12348E(String str, int i, int i2) {
        while (i < i2) {
            char charAt = str.charAt(i);
            if (charAt != 9 && charAt != 10 && charAt != 12 && charAt != 13 && charAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: F */
    public static int m12349F(String str, int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            char charAt = str.charAt(i3);
            if (charAt != 9 && charAt != 10 && charAt != 12 && charAt != 13 && charAt != ' ') {
                return i3 + 1;
            }
        }
        return i;
    }

    /* renamed from: G */
    public static ThreadFactory m12350G(String str, boolean z) {
        return new C4347b(str, z);
    }

    /* renamed from: H */
    public static C4388s m12351H(List<C10787c> list) {
        C4388s.C4389a aVar = new C4388s.C4389a();
        for (C10787c next : list) {
            C4344a.f7639a.mo23926b(aVar, next.f20736a.mo24303v(), next.f20737b.mo24303v());
        }
        return aVar.mo24097d();
    }

    /* renamed from: I */
    public static String m12352I(String str, int i, int i2) {
        int E = m12348E(str, i, i2);
        return str.substring(E, m12349F(str, E, i2));
    }

    /* renamed from: J */
    public static boolean m12353J(String str) {
        return f7656q.matcher(str).matches();
    }

    /* renamed from: a */
    public static void m12354a(Throwable th, Throwable th2) {
        Method method = f7655p;
        if (method != null) {
            try {
                method.invoke(th, new Object[]{th2});
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
    }

    /* renamed from: b */
    public static AssertionError m12355b(String str, Exception exc) {
        AssertionError assertionError = new AssertionError(str);
        try {
            assertionError.initCause(exc);
        } catch (IllegalStateException unused) {
        }
        return assertionError;
    }

    /* renamed from: c */
    public static Charset m12356c(C4410e eVar, Charset charset) {
        if (eVar.mo24234h0(0, f7643d)) {
            eVar.skip((long) f7643d.mo24297q());
            return f7648i;
        } else if (eVar.mo24234h0(0, f7644e)) {
            eVar.skip((long) f7644e.mo24297q());
            return f7649j;
        } else if (eVar.mo24234h0(0, f7645f)) {
            eVar.skip((long) f7645f.mo24297q());
            return f7650k;
        } else if (eVar.mo24234h0(0, f7646g)) {
            eVar.skip((long) f7646g.mo24297q());
            return f7651l;
        } else if (!eVar.mo24234h0(0, f7647h)) {
            return charset;
        } else {
            eVar.skip((long) f7647h.mo24297q());
            return f7652m;
        }
    }

    /* renamed from: d */
    public static String m12357d(String str) {
        if (str.contains(Constants.COLON_SEPARATOR)) {
            InetAddress m = (!str.startsWith("[") || !str.endsWith("]")) ? m12366m(str, 0, str.length()) : m12366m(str, 1, str.length() - 1);
            if (m == null) {
                return null;
            }
            byte[] address = m.getAddress();
            if (address.length == 16) {
                return m12378y(address);
            }
            throw new AssertionError("Invalid IPv6 address: '" + str + "'");
        }
        try {
            String lowerCase = IDN.toASCII(str).toLowerCase(Locale.US);
            if (!lowerCase.isEmpty() && !m12363j(lowerCase)) {
                return lowerCase;
            }
            return null;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* renamed from: e */
    public static int m12358e(String str, long j, TimeUnit timeUnit) {
        if (j < 0) {
            throw new IllegalArgumentException(str + " < 0");
        } else if (timeUnit != null) {
            long millis = timeUnit.toMillis(j);
            if (millis > 2147483647L) {
                throw new IllegalArgumentException(str + " too large.");
            } else if (millis != 0 || j <= 0) {
                return (int) millis;
            } else {
                throw new IllegalArgumentException(str + " too small.");
            }
        } else {
            throw new NullPointerException("unit == null");
        }
    }

    /* renamed from: f */
    public static void m12359f(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    /* renamed from: g */
    public static void m12360g(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: h */
    public static void m12361h(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (AssertionError e) {
                if (!m12344A(e)) {
                    throw e;
                }
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: i */
    public static String[] m12362i(String[] strArr, String str) {
        int length = strArr.length + 1;
        String[] strArr2 = new String[length];
        System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
        strArr2[length - 1] = str;
        return strArr2;
    }

    /* renamed from: j */
    private static boolean m12363j(String str) {
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt <= 31 || charAt >= 127 || " #%/:?@[\\]".indexOf(charAt) != -1) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    public static int m12364k(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        char c2 = 'a';
        if (c < 'a' || c > 'f') {
            c2 = 'A';
            if (c < 'A' || c > 'F') {
                return -1;
            }
        }
        return (c - c2) + 10;
    }

    /* renamed from: l */
    private static boolean m12365l(String str, int i, int i2, byte[] bArr, int i3) {
        int i4 = i3;
        while (i < i2) {
            if (i4 == bArr.length) {
                return false;
            }
            if (i4 != i3) {
                if (str.charAt(i) != '.') {
                    return false;
                }
                i++;
            }
            int i5 = i;
            int i6 = 0;
            while (i5 < i2) {
                char charAt = str.charAt(i5);
                if (charAt < '0' || charAt > '9') {
                    break;
                } else if ((i6 == 0 && i != i5) || (i6 = ((i6 * 10) + charAt) - 48) > 255) {
                    return false;
                } else {
                    i5++;
                }
            }
            if (i5 - i == 0) {
                return false;
            }
            bArr[i4] = (byte) i6;
            i4++;
            i = i5;
        }
        return i4 == i3 + 4;
    }

    @Nullable
    /* renamed from: m */
    private static InetAddress m12366m(String str, int i, int i2) {
        byte[] bArr = new byte[16];
        int i3 = 0;
        int i4 = -1;
        int i5 = -1;
        while (true) {
            if (i >= i2) {
                break;
            } else if (i3 == 16) {
                return null;
            } else {
                int i6 = i + 2;
                if (i6 > i2 || !str.regionMatches(i, "::", 0, 2)) {
                    if (i3 != 0) {
                        if (str.regionMatches(i, Constants.COLON_SEPARATOR, 0, 1)) {
                            i++;
                        } else if (!str.regionMatches(i, ".", 0, 1) || !m12365l(str, i5, i2, bArr, i3 - 2)) {
                            return null;
                        } else {
                            i3 += 2;
                        }
                    }
                    i5 = i;
                } else if (i4 != -1) {
                    return null;
                } else {
                    i3 += 2;
                    i4 = i3;
                    if (i6 == i2) {
                        break;
                    }
                    i5 = i6;
                }
                i = i5;
                int i7 = 0;
                while (i < i2) {
                    int k = m12364k(str.charAt(i));
                    if (k == -1) {
                        break;
                    }
                    i7 = (i7 << 4) + k;
                    i++;
                }
                int i8 = i - i5;
                if (i8 == 0 || i8 > 4) {
                    return null;
                }
                int i9 = i3 + 1;
                bArr[i3] = (byte) ((i7 >>> 8) & 255);
                i3 = i9 + 1;
                bArr[i9] = (byte) (i7 & 255);
            }
        }
        if (i3 != 16) {
            if (i4 == -1) {
                return null;
            }
            int i10 = i3 - i4;
            System.arraycopy(bArr, i4, bArr, 16 - i10, i10);
            Arrays.fill(bArr, i4, (16 - i3) + i4, (byte) 0);
        }
        try {
            return InetAddress.getByAddress(bArr);
        } catch (UnknownHostException unused) {
            throw new AssertionError();
        }
    }

    /* renamed from: n */
    public static int m12367n(String str, int i, int i2, char c) {
        while (i < i2) {
            if (str.charAt(i) == c) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: o */
    public static int m12368o(String str, int i, int i2, String str2) {
        while (i < i2) {
            if (str2.indexOf(str.charAt(i)) != -1) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: p */
    public static boolean m12369p(C4416t tVar, int i, TimeUnit timeUnit) {
        try {
            return m12347D(tVar, i, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: q */
    public static boolean m12370q(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: r */
    public static String m12371r(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    /* renamed from: s */
    public static String m12372s(C4390t tVar, boolean z) {
        String str;
        if (tVar.mo24114m().contains(Constants.COLON_SEPARATOR)) {
            str = "[" + tVar.mo24114m() + "]";
        } else {
            str = tVar.mo24114m();
        }
        if (!z && tVar.mo24120z() == C4390t.m12621e(tVar.mo24104E())) {
            return str;
        }
        return str + Constants.COLON_SEPARATOR + tVar.mo24120z();
    }

    /* renamed from: t */
    public static <T> List<T> m12373t(List<T> list) {
        return Collections.unmodifiableList(new ArrayList(list));
    }

    /* renamed from: u */
    public static <T> List<T> m12374u(T... tArr) {
        return Collections.unmodifiableList(Arrays.asList((Object[]) tArr.clone()));
    }

    /* renamed from: v */
    public static <K, V> Map<K, V> m12375v(Map<K, V> map) {
        return map.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(new LinkedHashMap(map));
    }

    /* renamed from: w */
    public static int m12376w(Comparator<String> comparator, String[] strArr, String str) {
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            if (comparator.compare(strArr[i], str) == 0) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: x */
    public static int m12377x(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt <= 31 || charAt >= 127) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: y */
    private static String m12378y(byte[] bArr) {
        int i = 0;
        int i2 = -1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < bArr.length) {
            int i5 = i3;
            while (i5 < 16 && bArr[i5] == 0 && bArr[i5 + 1] == 0) {
                i5 += 2;
            }
            int i6 = i5 - i3;
            if (i6 > i4 && i6 >= 4) {
                i2 = i3;
                i4 = i6;
            }
            i3 = i5 + 2;
        }
        C4406c cVar = new C4406c();
        while (i < bArr.length) {
            if (i == i2) {
                cVar.mo24247n1(58);
                i += i4;
                if (i == 16) {
                    cVar.mo24247n1(58);
                }
            } else {
                if (i > 0) {
                    cVar.mo24247n1(58);
                }
                cVar.mo24251p1((long) (((bArr[i] & 255) << 8) | (bArr[i + 1] & 255)));
                i += 2;
            }
        }
        return cVar.mo24228d0();
    }

    /* renamed from: z */
    public static String[] m12379z(Comparator<? super String> comparator, String[] strArr, String[] strArr2) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (comparator.compare(str, strArr2[i]) == 0) {
                    arrayList.add(str);
                    break;
                } else {
                    i++;
                }
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }
}
