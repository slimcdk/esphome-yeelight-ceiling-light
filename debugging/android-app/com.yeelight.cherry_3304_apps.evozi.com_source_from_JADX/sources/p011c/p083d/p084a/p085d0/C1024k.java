package p011c.p083d.p084a.p085d0;

import android.support.p002v4.media.session.PlaybackStateCompat;
import com.miot.service.common.crypto.rc4coder.Coder;
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
import p011c.p083d.p084a.C1133r;
import p163g.C4406c;
import p163g.C4411f;
import p163g.C4416t;
import p163g.C4417u;

/* renamed from: c.d.a.d0.k */
public final class C1024k {

    /* renamed from: a */
    public static final byte[] f1343a = new byte[0];

    /* renamed from: b */
    public static final String[] f1344b = new String[0];

    /* renamed from: c */
    public static final Charset f1345c = Charset.forName("UTF-8");

    /* renamed from: c.d.a.d0.k$a */
    static class C1025a implements ThreadFactory {

        /* renamed from: a */
        final /* synthetic */ String f1346a;

        /* renamed from: b */
        final /* synthetic */ boolean f1347b;

        C1025a(String str, boolean z) {
            this.f1346a = str;
            this.f1347b = z;
        }

        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, this.f1346a);
            thread.setDaemon(this.f1347b);
            return thread;
        }
    }

    /* renamed from: a */
    public static void m2090a(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    /* renamed from: b */
    public static void m2091b(Closeable closeable, Closeable closeable2) {
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
    public static void m2092c(Closeable closeable) {
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
    public static void m2093d(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (AssertionError e) {
                if (!m2102m(e)) {
                    throw e;
                }
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: e */
    public static boolean m2094e(C4416t tVar, int i, TimeUnit timeUnit) {
        try {
            return m2105p(tVar, i, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: f */
    public static boolean m2095f(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: g */
    public static String m2096g(C1133r rVar) {
        if (rVar.mo9758A() == C1133r.m2731i(rVar.mo9761E())) {
            return rVar.mo9772q();
        }
        return rVar.mo9772q() + Constants.COLON_SEPARATOR + rVar.mo9758A();
    }

    /* renamed from: h */
    public static <T> List<T> m2097h(List<T> list) {
        return Collections.unmodifiableList(new ArrayList(list));
    }

    /* renamed from: i */
    public static <T> List<T> m2098i(T... tArr) {
        return Collections.unmodifiableList(Arrays.asList((Object[]) tArr.clone()));
    }

    /* renamed from: j */
    public static <K, V> Map<K, V> m2099j(Map<K, V> map) {
        return Collections.unmodifiableMap(new LinkedHashMap(map));
    }

    /* renamed from: k */
    private static <T> List<T> m2100k(T[] tArr, T[] tArr2) {
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
    public static <T> T[] m2101l(Class<T> cls, T[] tArr, T[] tArr2) {
        List k = m2100k(tArr, tArr2);
        return k.toArray((Object[]) Array.newInstance(cls, k.size()));
    }

    /* renamed from: m */
    public static boolean m2102m(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    /* renamed from: n */
    public static String m2103n(String str) {
        try {
            return C4411f.m12869l(MessageDigest.getInstance(Coder.KEY_MD5).digest(str.getBytes("UTF-8"))).mo24291j();
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: o */
    public static C4411f m2104o(C4411f fVar) {
        try {
            return C4411f.m12869l(MessageDigest.getInstance("SHA-1").digest(fVar.mo24302u()));
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: p */
    public static boolean m2105p(C4416t tVar, int i, TimeUnit timeUnit) {
        long nanoTime = System.nanoTime();
        long c = tVar.mo9542f().mo24315e() ? tVar.mo9542f().mo24313c() - nanoTime : Long.MAX_VALUE;
        tVar.mo9542f().mo24314d(Math.min(c, timeUnit.toNanos((long) i)) + nanoTime);
        try {
            C4406c cVar = new C4406c();
            while (tVar.mo9541P0(cVar, PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH) != -1) {
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

    /* renamed from: q */
    public static ThreadFactory m2106q(String str, boolean z) {
        return new C1025a(str, z);
    }
}
