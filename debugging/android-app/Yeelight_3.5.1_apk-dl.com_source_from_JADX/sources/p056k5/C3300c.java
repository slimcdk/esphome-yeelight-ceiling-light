package p056k5;

import android.support.p004v4.media.session.PlaybackStateCompat;
import androidx.core.location.LocationRequestCompat;
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
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.C3505a0;
import okhttp3.C3518c0;
import okhttp3.C3544s;
import okhttp3.C3546t;
import okhttp3.C3548v;
import okhttp3.internal.http2.C9802a;
import okio.ByteString;
import okio.C3564c;
import okio.C9853r;
import okio.C9854s;

/* renamed from: k5.c */
public final class C3300c {

    /* renamed from: a */
    public static final byte[] f5332a;

    /* renamed from: b */
    public static final String[] f5333b = new String[0];

    /* renamed from: c */
    public static final C3518c0 f5334c;

    /* renamed from: d */
    public static final Charset f5335d = Charset.forName("UTF-8");

    /* renamed from: e */
    public static final TimeZone f5336e = TimeZone.getTimeZone("GMT");

    /* renamed from: f */
    public static final Comparator<String> f5337f = new C3301a();

    /* renamed from: g */
    private static final Method f5338g;

    /* renamed from: h */
    private static final Pattern f5339h = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    /* renamed from: k5.c$a */
    class C3301a implements Comparator<String> {
        C3301a() {
        }

        /* renamed from: a */
        public int compare(String str, String str2) {
            return str.compareTo(str2);
        }
    }

    /* renamed from: k5.c$b */
    class C3302b implements ThreadFactory {

        /* renamed from: a */
        final /* synthetic */ String f5340a;

        /* renamed from: b */
        final /* synthetic */ boolean f5341b;

        C3302b(String str, boolean z) {
            this.f5340a = str;
            this.f5341b = z;
        }

        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, this.f5340a);
            thread.setDaemon(this.f5341b);
            return thread;
        }
    }

    static {
        byte[] bArr = new byte[0];
        f5332a = bArr;
        Method method = null;
        f5334c = C3518c0.m9641i((C3548v) null, bArr);
        C3505a0.m9571d((C3548v) null, bArr);
        ByteString.decodeHex("efbbbf");
        ByteString.decodeHex("feff");
        ByteString.decodeHex("fffe");
        ByteString.decodeHex("0000ffff");
        ByteString.decodeHex("ffff0000");
        Charset.forName("ISO-8859-1");
        Charset.forName("UTF-16BE");
        Charset.forName("UTF-16LE");
        Charset.forName("UTF-32BE");
        Charset.forName("UTF-32LE");
        try {
            method = Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class});
        } catch (Exception unused) {
        }
        f5338g = method;
    }

    /* renamed from: A */
    public static boolean m8907A(Comparator<String> comparator, String[] strArr, String[] strArr2) {
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

    /* renamed from: B */
    public static X509TrustManager m8908B() {
        try {
            TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            instance.init((KeyStore) null);
            TrustManager[] trustManagers = instance.getTrustManagers();
            if (trustManagers.length == 1 && (trustManagers[0] instanceof X509TrustManager)) {
                return (X509TrustManager) trustManagers[0];
            }
            throw new IllegalStateException("Unexpected default trust managers:" + Arrays.toString(trustManagers));
        } catch (GeneralSecurityException e) {
            throw m8917b("No System TLS", e);
        }
    }

    /* renamed from: C */
    public static boolean m8909C(C9853r rVar, int i, TimeUnit timeUnit) {
        long nanoTime = System.nanoTime();
        long c = rVar.mo24479j().mo39089e() ? rVar.mo24479j().mo39087c() - nanoTime : Long.MAX_VALUE;
        rVar.mo24479j().mo39088d(Math.min(c, timeUnit.toNanos((long) i)) + nanoTime);
        try {
            C3564c cVar = new C3564c();
            while (rVar.mo24477R0(cVar, PlaybackStateCompat.ACTION_PLAY_FROM_URI) != -1) {
                cVar.clear();
            }
            int i2 = (c > LocationRequestCompat.PASSIVE_INTERVAL ? 1 : (c == LocationRequestCompat.PASSIVE_INTERVAL ? 0 : -1));
            C9854s j = rVar.mo24479j();
            if (i2 == 0) {
                j.mo39085a();
            } else {
                j.mo39088d(nanoTime + c);
            }
            return true;
        } catch (InterruptedIOException unused) {
            int i3 = (c > LocationRequestCompat.PASSIVE_INTERVAL ? 1 : (c == LocationRequestCompat.PASSIVE_INTERVAL ? 0 : -1));
            C9854s j2 = rVar.mo24479j();
            if (i3 == 0) {
                j2.mo39085a();
            } else {
                j2.mo39088d(nanoTime + c);
            }
            return false;
        } catch (Throwable th) {
            int i4 = (c > LocationRequestCompat.PASSIVE_INTERVAL ? 1 : (c == LocationRequestCompat.PASSIVE_INTERVAL ? 0 : -1));
            C9854s j3 = rVar.mo24479j();
            if (i4 == 0) {
                j3.mo39085a();
            } else {
                j3.mo39088d(nanoTime + c);
            }
            throw th;
        }
    }

    /* renamed from: D */
    public static int m8910D(String str, int i, int i2) {
        while (i < i2) {
            char charAt = str.charAt(i);
            if (charAt != 9 && charAt != 10 && charAt != 12 && charAt != 13 && charAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: E */
    public static int m8911E(String str, int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            char charAt = str.charAt(i3);
            if (charAt != 9 && charAt != 10 && charAt != 12 && charAt != 13 && charAt != ' ') {
                return i3 + 1;
            }
        }
        return i;
    }

    /* renamed from: F */
    public static ThreadFactory m8912F(String str, boolean z) {
        return new C3302b(str, z);
    }

    /* renamed from: G */
    public static C3544s m8913G(List<C9802a> list) {
        C3544s.C3545a aVar = new C3544s.C3545a();
        for (C9802a next : list) {
            C3299a.f5331a.mo23925b(aVar, next.f17699a.utf8(), next.f17700b.utf8());
        }
        return aVar.mo24556d();
    }

    /* renamed from: H */
    public static String m8914H(String str, int i, int i2) {
        int D = m8910D(str, i, i2);
        return str.substring(D, m8911E(str, D, i2));
    }

    /* renamed from: I */
    public static boolean m8915I(String str) {
        return f5339h.matcher(str).matches();
    }

    /* renamed from: a */
    public static void m8916a(Throwable th, Throwable th2) {
        Method method = f5338g;
        if (method != null) {
            try {
                method.invoke(th, new Object[]{th2});
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
    }

    /* renamed from: b */
    public static AssertionError m8917b(String str, Exception exc) {
        AssertionError assertionError = new AssertionError(str);
        try {
            assertionError.initCause(exc);
        } catch (IllegalStateException unused) {
        }
        return assertionError;
    }

    /* renamed from: c */
    public static String m8918c(String str) {
        if (str.contains(Constants.COLON_SEPARATOR)) {
            InetAddress l = (!str.startsWith("[") || !str.endsWith("]")) ? m8927l(str, 0, str.length()) : m8927l(str, 1, str.length() - 1);
            if (l == null) {
                return null;
            }
            byte[] address = l.getAddress();
            if (address.length == 16) {
                return m8939x(address);
            }
            throw new AssertionError("Invalid IPv6 address: '" + str + "'");
        }
        try {
            String lowerCase = IDN.toASCII(str).toLowerCase(Locale.US);
            if (!lowerCase.isEmpty() && !m8924i(lowerCase)) {
                return lowerCase;
            }
            return null;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* renamed from: d */
    public static int m8919d(String str, long j, TimeUnit timeUnit) {
        if (j >= 0) {
            Objects.requireNonNull(timeUnit, "unit == null");
            long millis = timeUnit.toMillis(j);
            if (millis > 2147483647L) {
                throw new IllegalArgumentException(str + " too large.");
            } else if (millis != 0 || j <= 0) {
                return (int) millis;
            } else {
                throw new IllegalArgumentException(str + " too small.");
            }
        } else {
            throw new IllegalArgumentException(str + " < 0");
        }
    }

    /* renamed from: e */
    public static void m8920e(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    /* renamed from: f */
    public static void m8921f(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: g */
    public static void m8922g(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (AssertionError e) {
                if (!m8941z(e)) {
                    throw e;
                }
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: h */
    public static String[] m8923h(String[] strArr, String str) {
        int length = strArr.length + 1;
        String[] strArr2 = new String[length];
        System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
        strArr2[length - 1] = str;
        return strArr2;
    }

    /* renamed from: i */
    private static boolean m8924i(String str) {
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt <= 31 || charAt >= 127 || " #%/:?@[\\]".indexOf(charAt) != -1) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: j */
    public static int m8925j(char c) {
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

    /* renamed from: k */
    private static boolean m8926k(String str, int i, int i2, byte[] bArr, int i3) {
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
    /* renamed from: l */
    private static InetAddress m8927l(String str, int i, int i2) {
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
                        } else if (!str.regionMatches(i, ".", 0, 1) || !m8926k(str, i5, i2, bArr, i3 - 2)) {
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
                    int j = m8925j(str.charAt(i));
                    if (j == -1) {
                        break;
                    }
                    i7 = (i7 << 4) + j;
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

    /* renamed from: m */
    public static int m8928m(String str, int i, int i2, char c) {
        while (i < i2) {
            if (str.charAt(i) == c) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: n */
    public static int m8929n(String str, int i, int i2, String str2) {
        while (i < i2) {
            if (str2.indexOf(str.charAt(i)) != -1) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: o */
    public static boolean m8930o(C9853r rVar, int i, TimeUnit timeUnit) {
        try {
            return m8909C(rVar, i, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: p */
    public static boolean m8931p(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: q */
    public static String m8932q(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    /* renamed from: r */
    public static String m8933r(C3546t tVar, boolean z) {
        String str;
        if (tVar.mo24573m().contains(Constants.COLON_SEPARATOR)) {
            str = "[" + tVar.mo24573m() + "]";
        } else {
            str = tVar.mo24573m();
        }
        if (!z && tVar.mo24579z() == C3546t.m9822e(tVar.mo24563E())) {
            return str;
        }
        return str + Constants.COLON_SEPARATOR + tVar.mo24579z();
    }

    /* renamed from: s */
    public static <T> List<T> m8934s(List<T> list) {
        return Collections.unmodifiableList(new ArrayList(list));
    }

    /* renamed from: t */
    public static <T> List<T> m8935t(T... tArr) {
        return Collections.unmodifiableList(Arrays.asList((Object[]) tArr.clone()));
    }

    /* renamed from: u */
    public static <K, V> Map<K, V> m8936u(Map<K, V> map) {
        return map.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(new LinkedHashMap(map));
    }

    /* renamed from: v */
    public static int m8937v(Comparator<String> comparator, String[] strArr, String str) {
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            if (comparator.compare(strArr[i], str) == 0) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: w */
    public static int m8938w(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt <= 31 || charAt >= 127) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: x */
    private static String m8939x(byte[] bArr) {
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
        C3564c cVar = new C3564c();
        while (i < bArr.length) {
            if (i == i2) {
                cVar.mo24736R(58);
                i += i4;
                if (i == 16) {
                    cVar.mo24736R(58);
                }
            } else {
                if (i > 0) {
                    cVar.mo24736R(58);
                }
                cVar.mo24784t0((long) (((bArr[i] & 255) << 8) | (bArr[i + 1] & 255)));
                i += 2;
            }
        }
        return cVar.mo24722D();
    }

    /* renamed from: y */
    public static String[] m8940y(Comparator<? super String> comparator, String[] strArr, String[] strArr2) {
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

    /* renamed from: z */
    public static boolean m8941z(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }
}
