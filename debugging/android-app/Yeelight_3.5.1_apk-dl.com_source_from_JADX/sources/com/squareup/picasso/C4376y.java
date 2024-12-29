package com.squareup.picasso;

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
import java.util.Objects;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.squareup.picasso.y */
final class C4376y {

    /* renamed from: a */
    static final StringBuilder f7324a = new StringBuilder();

    /* renamed from: com.squareup.picasso.y$a */
    static class C4377a extends Handler {
        C4377a(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            sendMessageDelayed(obtainMessage(), 1000);
        }
    }

    @TargetApi(11)
    /* renamed from: com.squareup.picasso.y$b */
    private static class C4378b {
        /* renamed from: a */
        static int m12451a(ActivityManager activityManager) {
            return activityManager.getLargeMemoryClass();
        }
    }

    @TargetApi(12)
    /* renamed from: com.squareup.picasso.y$c */
    private static class C4379c {
        /* renamed from: a */
        static int m12452a(Bitmap bitmap) {
            return bitmap.getByteCount();
        }
    }

    /* renamed from: com.squareup.picasso.y$d */
    private static class C4380d {
        /* renamed from: a */
        static Downloader m12453a(Context context) {
            return new C4357n(context);
        }
    }

    /* renamed from: com.squareup.picasso.y$e */
    private static class C4381e extends Thread {
        public C4381e(Runnable runnable) {
            super(runnable);
        }

        public void run() {
            Process.setThreadPriority(10);
            super.run();
        }
    }

    /* renamed from: com.squareup.picasso.y$f */
    static class C4382f implements ThreadFactory {
        C4382f() {
        }

        public Thread newThread(Runnable runnable) {
            return new C4381e(runnable);
        }
    }

    /* renamed from: a */
    static long m12427a(File file) {
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
    static int m12428b(Context context) {
        ActivityManager activityManager = (ActivityManager) m12442p(context, "activity");
        boolean z = (context.getApplicationInfo().flags & 1048576) != 0;
        int memoryClass = activityManager.getMemoryClass();
        if (z && Build.VERSION.SDK_INT >= 11) {
            memoryClass = C4378b.m12451a(activityManager);
        }
        return (memoryClass * 1048576) / 7;
    }

    /* renamed from: c */
    static void m12429c() {
        if (!m12445s()) {
            throw new IllegalStateException("Method call should happen from the main thread.");
        }
    }

    /* renamed from: d */
    static <T> T m12430d(T t, String str) {
        Objects.requireNonNull(t, str);
        return t;
    }

    /* renamed from: e */
    static void m12431e(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: f */
    static File m12432f(Context context) {
        File file = new File(context.getApplicationContext().getCacheDir(), "picasso-cache");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* renamed from: g */
    static Downloader m12433g(Context context) {
        try {
            Class.forName("com.squareup.okhttp.u");
            return C4380d.m12453a(context);
        } catch (ClassNotFoundException unused) {
            return new C4373x(context);
        }
    }

    /* renamed from: h */
    static String m12434h(C4361q qVar) {
        StringBuilder sb = f7324a;
        String i = m12435i(qVar, sb);
        sb.setLength(0);
        return i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0091  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.lang.String m12435i(com.squareup.picasso.C4361q r4, java.lang.StringBuilder r5) {
        /*
            java.lang.String r0 = r4.f7244f
            r1 = 50
            if (r0 == 0) goto L_0x0014
            int r0 = r0.length()
            int r0 = r0 + r1
            r5.ensureCapacity(r0)
            java.lang.String r0 = r4.f7244f
        L_0x0010:
            r5.append(r0)
            goto L_0x002d
        L_0x0014:
            android.net.Uri r0 = r4.f7242d
            if (r0 == 0) goto L_0x0025
            java.lang.String r0 = r0.toString()
            int r2 = r0.length()
            int r2 = r2 + r1
            r5.ensureCapacity(r2)
            goto L_0x0010
        L_0x0025:
            r5.ensureCapacity(r1)
            int r0 = r4.f7243e
            r5.append(r0)
        L_0x002d:
            r0 = 10
            r5.append(r0)
            float r1 = r4.f7251m
            r2 = 0
            r3 = 120(0x78, float:1.68E-43)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 == 0) goto L_0x005e
            java.lang.String r1 = "rotation:"
            r5.append(r1)
            float r1 = r4.f7251m
            r5.append(r1)
            boolean r1 = r4.f7254p
            if (r1 == 0) goto L_0x005b
            r1 = 64
            r5.append(r1)
            float r1 = r4.f7252n
            r5.append(r1)
            r5.append(r3)
            float r1 = r4.f7253o
            r5.append(r1)
        L_0x005b:
            r5.append(r0)
        L_0x005e:
            boolean r1 = r4.mo28211c()
            if (r1 == 0) goto L_0x0079
            java.lang.String r1 = "resize:"
            r5.append(r1)
            int r1 = r4.f7246h
            r5.append(r1)
            r5.append(r3)
            int r1 = r4.f7247i
            r5.append(r1)
            r5.append(r0)
        L_0x0079:
            boolean r1 = r4.f7248j
            if (r1 == 0) goto L_0x0086
            java.lang.String r1 = "centerCrop"
        L_0x007f:
            r5.append(r1)
            r5.append(r0)
            goto L_0x008d
        L_0x0086:
            boolean r1 = r4.f7249k
            if (r1 == 0) goto L_0x008d
            java.lang.String r1 = "centerInside"
            goto L_0x007f
        L_0x008d:
            java.util.List<com.squareup.picasso.w> r1 = r4.f7245g
            if (r1 == 0) goto L_0x00ad
            r2 = 0
            int r1 = r1.size()
        L_0x0096:
            if (r2 >= r1) goto L_0x00ad
            java.util.List<com.squareup.picasso.w> r3 = r4.f7245g
            java.lang.Object r3 = r3.get(r2)
            com.squareup.picasso.w r3 = (com.squareup.picasso.C4372w) r3
            java.lang.String r3 = r3.mo28248b()
            r5.append(r3)
            r5.append(r0)
            int r2 = r2 + 1
            goto L_0x0096
        L_0x00ad:
            java.lang.String r4 = r5.toString()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.C4376y.m12435i(com.squareup.picasso.q, java.lang.StringBuilder):java.lang.String");
    }

    /* renamed from: j */
    static void m12436j(Looper looper) {
        C4377a aVar = new C4377a(looper);
        aVar.sendMessageDelayed(aVar.obtainMessage(), 1000);
    }

    /* renamed from: k */
    static int m12437k(Bitmap bitmap) {
        int a = Build.VERSION.SDK_INT >= 12 ? C4379c.m12452a(bitmap) : bitmap.getRowBytes() * bitmap.getHeight();
        if (a >= 0) {
            return a;
        }
        throw new IllegalStateException("Negative size: " + bitmap);
    }

    /* renamed from: l */
    static String m12438l(C4335c cVar) {
        return m12439m(cVar, "");
    }

    /* renamed from: m */
    static String m12439m(C4335c cVar, String str) {
        StringBuilder sb = new StringBuilder(str);
        C4332a i = cVar.mo28138i();
        if (i != null) {
            sb.append(i.f7148b.mo28212d());
        }
        List<C4332a> j = cVar.mo28139j();
        if (j != null) {
            int size = j.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (i2 > 0 || i != null) {
                    sb.append(", ");
                }
                sb.append(j.get(i2).f7148b.mo28212d());
            }
        }
        return sb.toString();
    }

    /* renamed from: n */
    static int m12440n(Resources resources, C4361q qVar) {
        Uri uri;
        int i = qVar.f7243e;
        if (i != 0 || (uri = qVar.f7242d) == null) {
            return i;
        }
        String authority = uri.getAuthority();
        if (authority != null) {
            List<String> pathSegments = qVar.f7242d.getPathSegments();
            if (pathSegments == null || pathSegments.isEmpty()) {
                throw new FileNotFoundException("No path segments: " + qVar.f7242d);
            } else if (pathSegments.size() == 1) {
                try {
                    return Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException("Last path segment is not a resource ID: " + qVar.f7242d);
                }
            } else if (pathSegments.size() == 2) {
                return resources.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            } else {
                throw new FileNotFoundException("More than two path segments: " + qVar.f7242d);
            }
        } else {
            throw new FileNotFoundException("No package provided: " + qVar.f7242d);
        }
    }

    /* renamed from: o */
    static Resources m12441o(Context context, C4361q qVar) {
        Uri uri;
        if (qVar.f7243e != 0 || (uri = qVar.f7242d) == null) {
            return context.getResources();
        }
        String authority = uri.getAuthority();
        if (authority != null) {
            try {
                return context.getPackageManager().getResourcesForApplication(authority);
            } catch (PackageManager.NameNotFoundException unused) {
                throw new FileNotFoundException("Unable to obtain resources for package: " + qVar.f7242d);
            }
        } else {
            throw new FileNotFoundException("No package provided: " + qVar.f7242d);
        }
    }

    /* renamed from: p */
    static <T> T m12442p(Context context, String str) {
        return context.getSystemService(str);
    }

    /* renamed from: q */
    static boolean m12443q(Context context, String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }

    /* renamed from: r */
    static boolean m12444r(Context context) {
        try {
            return Settings.System.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0;
        } catch (NullPointerException unused) {
            return false;
        }
    }

    /* renamed from: s */
    static boolean m12445s() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    /* renamed from: t */
    static boolean m12446t(InputStream inputStream) {
        byte[] bArr = new byte[12];
        return inputStream.read(bArr, 0, 12) == 12 && "RIFF".equals(new String(bArr, 0, 4, "US-ASCII")) && "WEBP".equals(new String(bArr, 8, 4, "US-ASCII"));
    }

    /* renamed from: u */
    static void m12447u(String str, String str2, String str3) {
        m12448v(str, str2, str3, "");
    }

    /* renamed from: v */
    static void m12448v(String str, String str2, String str3, String str4) {
        String.format("%1$-11s %2$-12s %3$s %4$s", new Object[]{str, str2, str3, str4});
    }

    /* renamed from: w */
    static boolean m12449w(String str) {
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
    static byte[] m12450x(InputStream inputStream) {
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
