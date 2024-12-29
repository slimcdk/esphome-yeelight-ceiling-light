package p231y2;

import android.support.p004v4.media.session.PlaybackStateCompat;
import androidx.core.location.LocationRequestCompat;
import com.miot.service.common.crypto.rc4coder.Coder;
import com.squareup.okhttp.C4302q;
import com.xiaomi.mipush.sdk.Constants;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.net.Socket;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import okio.ByteString;
import okio.C3564c;
import okio.C9853r;
import okio.C9854s;

/* renamed from: y2.k */
public final class C12033k {

    /* renamed from: a */
    public static final byte[] f22065a = new byte[0];

    /* renamed from: b */
    public static final String[] f22066b = new String[0];

    /* renamed from: c */
    public static final Charset f22067c = Charset.forName("UTF-8");

    /* renamed from: y2.k$a */
    static class C12034a implements ThreadFactory {

        /* renamed from: a */
        final /* synthetic */ String f22068a;

        /* renamed from: b */
        final /* synthetic */ boolean f22069b;

        C12034a(String str, boolean z) {
            this.f22068a = str;
            this.f22069b = z;
        }

        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, this.f22068a);
            thread.setDaemon(this.f22069b);
            return thread;
        }
    }

    /* renamed from: a */
    public static void m31041a(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    /* renamed from: b */
    public static void m31042b(Closeable closeable, Closeable closeable2) {
        try {
            closeable.close();
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            closeable2.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        if (th != null) {
            if (th instanceof IOException) {
                throw ((IOException) th);
            } else if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            } else if (th instanceof Error) {
                throw th;
            } else {
                throw new AssertionError(th);
            }
        }
    }

    /* renamed from: c */
    public static void m31043c(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: d */
    public static void m31044d(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (AssertionError e) {
                if (!m31053m(e)) {
                    throw e;
                }
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: e */
    public static boolean m31045e(C9853r rVar, int i, TimeUnit timeUnit) {
        try {
            return m31056p(rVar, i, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: f */
    public static boolean m31046f(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: g */
    public static String m31047g(C4302q qVar) {
        if (qVar.mo27945A() == C4302q.m12011i(qVar.mo27948E())) {
            return qVar.mo27959q();
        }
        return qVar.mo27959q() + Constants.COLON_SEPARATOR + qVar.mo27945A();
    }

    /* renamed from: h */
    public static <T> List<T> m31048h(List<T> list) {
        return Collections.unmodifiableList(new ArrayList(list));
    }

    /* renamed from: i */
    public static <T> List<T> m31049i(T... tArr) {
        return Collections.unmodifiableList(Arrays.asList((Object[]) tArr.clone()));
    }

    /* renamed from: j */
    public static <K, V> Map<K, V> m31050j(Map<K, V> map) {
        return Collections.unmodifiableMap(new LinkedHashMap(map));
    }

    /* renamed from: k */
    private static <T> List<T> m31051k(T[] tArr, T[] tArr2) {
        ArrayList arrayList = new ArrayList();
        for (T t : tArr) {
            int length = tArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                T t2 = tArr2[i];
                if (t.equals(t2)) {
                    arrayList.add(t2);
                    break;
                }
                i++;
            }
        }
        return arrayList;
    }

    /* renamed from: l */
    public static <T> T[] m31052l(Class<T> cls, T[] tArr, T[] tArr2) {
        List k = m31051k(tArr, tArr2);
        return k.toArray((Object[]) Array.newInstance(cls, k.size()));
    }

    /* renamed from: m */
    public static boolean m31053m(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    /* renamed from: n */
    public static String m31054n(String str) {
        try {
            return ByteString.m9966of(MessageDigest.getInstance(Coder.KEY_MD5).digest(str.getBytes("UTF-8"))).hex();
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: o */
    public static ByteString m31055o(ByteString byteString) {
        try {
            return ByteString.m9966of(MessageDigest.getInstance("SHA-1").digest(byteString.toByteArray()));
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: p */
    public static boolean m31056p(C9853r rVar, int i, TimeUnit timeUnit) {
        long nanoTime = System.nanoTime();
        long c = rVar.mo24479j().mo39089e() ? rVar.mo24479j().mo39087c() - nanoTime : Long.MAX_VALUE;
        rVar.mo24479j().mo39088d(Math.min(c, timeUnit.toNanos((long) i)) + nanoTime);
        try {
            C3564c cVar = new C3564c();
            while (rVar.mo24477R0(cVar, PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH) != -1) {
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

    /* renamed from: q */
    public static ThreadFactory m31057q(String str, boolean z) {
        return new C12034a(str, z);
    }
}
