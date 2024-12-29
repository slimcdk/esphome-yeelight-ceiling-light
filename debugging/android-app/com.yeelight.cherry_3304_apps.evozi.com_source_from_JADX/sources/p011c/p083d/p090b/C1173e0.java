package p011c.p083d.p090b;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.os.StatFs;
import android.provider.Settings;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.concurrent.ThreadFactory;

/* renamed from: c.d.b.e0 */
final class C1173e0 {

    /* renamed from: a */
    static final StringBuilder f1989a = new StringBuilder();

    /* renamed from: c.d.b.e0$a */
    static class C1174a extends Handler {
        C1174a(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            sendMessageDelayed(obtainMessage(), 1000);
        }
    }

    @TargetApi(11)
    /* renamed from: c.d.b.e0$b */
    private static class C1175b {
        /* renamed from: a */
        static int m3034a(ActivityManager activityManager) {
            return activityManager.getLargeMemoryClass();
        }
    }

    @TargetApi(12)
    /* renamed from: c.d.b.e0$c */
    private static class C1176c {
        /* renamed from: a */
        static int m3035a(Bitmap bitmap) {
            return bitmap.getByteCount();
        }
    }

    /* renamed from: c.d.b.e0$d */
    private static class C1177d {
        /* renamed from: a */
        static C1189j m3036a(Context context) {
            return new C1202s(context);
        }
    }

    /* renamed from: c.d.b.e0$e */
    private static class C1178e extends Thread {
        public C1178e(Runnable runnable) {
            super(runnable);
        }

        public void run() {
            Process.setThreadPriority(10);
            super.run();
        }
    }

    /* renamed from: c.d.b.e0$f */
    static class C1179f implements ThreadFactory {
        C1179f() {
        }

        public Thread newThread(Runnable runnable) {
            return new C1178e(runnable);
        }
    }

    /* renamed from: a */
    static long m3010a(File file) {
        long j;
        try {
            StatFs statFs = new StatFs(file.getAbsolutePath());
            j = (((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize())) / 50;
        } catch (IllegalArgumentException unused) {
            j = 5242880;
        }
        return Math.max(Math.min(j, 52428800), 5242880);
    }

    /* renamed from: b */
    static int m3011b(Context context) {
        ActivityManager activityManager = (ActivityManager) m3025p(context, "activity");
        boolean z = (context.getApplicationInfo().flags & 1048576) != 0;
        int memoryClass = activityManager.getMemoryClass();
        if (z && Build.VERSION.SDK_INT >= 11) {
            memoryClass = C1175b.m3034a(activityManager);
        }
        return (memoryClass * 1048576) / 7;
    }

    /* renamed from: c */
    static void m3012c() {
        if (!m3028s()) {
            throw new IllegalStateException("Method call should happen from the main thread.");
        }
    }

    /* renamed from: d */
    static <T> T m3013d(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: e */
    static void m3014e(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: f */
    static File m3015f(Context context) {
        File file = new File(context.getApplicationContext().getCacheDir(), "picasso-cache");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* renamed from: g */
    static C1189j m3016g(Context context) {
        try {
            Class.forName("c.d.a.v");
            return C1177d.m3036a(context);
        } catch (ClassNotFoundException unused) {
            return new C1169d0(context);
        }
    }

    /* renamed from: h */
    static String m3017h(C1216w wVar) {
        String i = m3018i(wVar, f1989a);
        f1989a.setLength(0);
        return i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0091  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.lang.String m3018i(p011c.p083d.p090b.C1216w r4, java.lang.StringBuilder r5) {
        /*
            java.lang.String r0 = r4.f2109f
            r1 = 50
            if (r0 == 0) goto L_0x0014
            int r0 = r0.length()
            int r0 = r0 + r1
            r5.ensureCapacity(r0)
            java.lang.String r0 = r4.f2109f
        L_0x0010:
            r5.append(r0)
            goto L_0x002d
        L_0x0014:
            android.net.Uri r0 = r4.f2107d
            if (r0 == 0) goto L_0x0025
            java.lang.String r0 = r0.toString()
            int r2 = r0.length()
            int r2 = r2 + r1
            r5.ensureCapacity(r2)
            goto L_0x0010
        L_0x0025:
            r5.ensureCapacity(r1)
            int r0 = r4.f2108e
            r5.append(r0)
        L_0x002d:
            r0 = 10
            r5.append(r0)
            float r1 = r4.f2116m
            r2 = 0
            r3 = 120(0x78, float:1.68E-43)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 == 0) goto L_0x005e
            java.lang.String r1 = "rotation:"
            r5.append(r1)
            float r1 = r4.f2116m
            r5.append(r1)
            boolean r1 = r4.f2119p
            if (r1 == 0) goto L_0x005b
            r1 = 64
            r5.append(r1)
            float r1 = r4.f2117n
            r5.append(r1)
            r5.append(r3)
            float r1 = r4.f2118o
            r5.append(r1)
        L_0x005b:
            r5.append(r0)
        L_0x005e:
            boolean r1 = r4.mo10024c()
            if (r1 == 0) goto L_0x0079
            java.lang.String r1 = "resize:"
            r5.append(r1)
            int r1 = r4.f2111h
            r5.append(r1)
            r5.append(r3)
            int r1 = r4.f2112i
            r5.append(r1)
            r5.append(r0)
        L_0x0079:
            boolean r1 = r4.f2113j
            if (r1 == 0) goto L_0x0086
            java.lang.String r1 = "centerCrop"
        L_0x007f:
            r5.append(r1)
            r5.append(r0)
            goto L_0x008d
        L_0x0086:
            boolean r1 = r4.f2114k
            if (r1 == 0) goto L_0x008d
            java.lang.String r1 = "centerInside"
            goto L_0x007f
        L_0x008d:
            java.util.List<c.d.b.c0> r1 = r4.f2110g
            if (r1 == 0) goto L_0x00ad
            r2 = 0
            int r1 = r1.size()
        L_0x0096:
            if (r2 >= r1) goto L_0x00ad
            java.util.List<c.d.b.c0> r3 = r4.f2110g
            java.lang.Object r3 = r3.get(r2)
            c.d.b.c0 r3 = (p011c.p083d.p090b.C1167c0) r3
            java.lang.String r3 = r3.mo9941b()
            r5.append(r3)
            r5.append(r0)
            int r2 = r2 + 1
            goto L_0x0096
        L_0x00ad:
            java.lang.String r4 = r5.toString()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p011c.p083d.p090b.C1173e0.m3018i(c.d.b.w, java.lang.StringBuilder):java.lang.String");
    }

    /* renamed from: j */
    static void m3019j(Looper looper) {
        C1174a aVar = new C1174a(looper);
        aVar.sendMessageDelayed(aVar.obtainMessage(), 1000);
    }

    /* renamed from: k */
    static int m3020k(Bitmap bitmap) {
        int a = Build.VERSION.SDK_INT >= 12 ? C1176c.m3035a(bitmap) : bitmap.getRowBytes() * bitmap.getHeight();
        if (a >= 0) {
            return a;
        }
        throw new IllegalStateException("Negative size: " + bitmap);
    }

    /* renamed from: l */
    static String m3021l(C1160c cVar) {
        return m3022m(cVar, "");
    }

    /* renamed from: m */
    static String m3022m(C1160c cVar, String str) {
        StringBuilder sb = new StringBuilder(str);
        C1153a i = cVar.mo9919i();
        if (i != null) {
            sb.append(i.f1913b.mo10025d());
        }
        List<C1153a> j = cVar.mo9920j();
        if (j != null) {
            int size = j.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (i2 > 0 || i != null) {
                    sb.append(", ");
                }
                sb.append(j.get(i2).f1913b.mo10025d());
            }
        }
        return sb.toString();
    }

    /* renamed from: n */
    static int m3023n(Resources resources, C1216w wVar) {
        Uri uri;
        if (wVar.f2108e != 0 || (uri = wVar.f2107d) == null) {
            return wVar.f2108e;
        }
        String authority = uri.getAuthority();
        if (authority != null) {
            List<String> pathSegments = wVar.f2107d.getPathSegments();
            if (pathSegments == null || pathSegments.isEmpty()) {
                throw new FileNotFoundException("No path segments: " + wVar.f2107d);
            } else if (pathSegments.size() == 1) {
                try {
                    return Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException("Last path segment is not a resource ID: " + wVar.f2107d);
                }
            } else if (pathSegments.size() == 2) {
                return resources.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            } else {
                throw new FileNotFoundException("More than two path segments: " + wVar.f2107d);
            }
        } else {
            throw new FileNotFoundException("No package provided: " + wVar.f2107d);
        }
    }

    /* renamed from: o */
    static Resources m3024o(Context context, C1216w wVar) {
        Uri uri;
        if (wVar.f2108e != 0 || (uri = wVar.f2107d) == null) {
            return context.getResources();
        }
        String authority = uri.getAuthority();
        if (authority != null) {
            try {
                return context.getPackageManager().getResourcesForApplication(authority);
            } catch (PackageManager.NameNotFoundException unused) {
                throw new FileNotFoundException("Unable to obtain resources for package: " + wVar.f2107d);
            }
        } else {
            throw new FileNotFoundException("No package provided: " + wVar.f2107d);
        }
    }

    /* renamed from: p */
    static <T> T m3025p(Context context, String str) {
        return context.getSystemService(str);
    }

    /* renamed from: q */
    static boolean m3026q(Context context, String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }

    /* renamed from: r */
    static boolean m3027r(Context context) {
        try {
            return Settings.System.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0;
        } catch (NullPointerException unused) {
            return false;
        }
    }

    /* renamed from: s */
    static boolean m3028s() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    /* renamed from: t */
    static boolean m3029t(InputStream inputStream) {
        byte[] bArr = new byte[12];
        return inputStream.read(bArr, 0, 12) == 12 && "RIFF".equals(new String(bArr, 0, 4, "US-ASCII")) && "WEBP".equals(new String(bArr, 8, 4, "US-ASCII"));
    }

    /* renamed from: u */
    static void m3030u(String str, String str2, String str3) {
        m3031v(str, str2, str3, "");
    }

    /* renamed from: v */
    static void m3031v(String str, String str2, String str3, String str4) {
        String.format("%1$-11s %2$-12s %3$s %4$s", new Object[]{str, str2, str3, str4});
    }

    /* renamed from: w */
    static boolean m3032w(String str) {
        if (str == null) {
            return false;
        }
        String[] split = str.split(" ", 2);
        if ("CACHE".equals(split[0])) {
            return true;
        }
        if (split.length == 1) {
            return false;
        }
        try {
            return "CONDITIONAL_CACHE".equals(split[0]) && Integer.parseInt(split[1]) == 304;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    /* renamed from: x */
    static byte[] m3033x(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[4096];
        while (true) {
            int read = inputStream.read(bArr);
            if (-1 == read) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }
}
