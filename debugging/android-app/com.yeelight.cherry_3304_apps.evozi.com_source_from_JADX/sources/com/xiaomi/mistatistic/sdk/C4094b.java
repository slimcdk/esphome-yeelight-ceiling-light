package com.xiaomi.mistatistic.sdk;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.StrictMode;
import com.miot.service.connection.wifi.SmartConfigDataProvider;
import com.xiaomi.mipush.sdk.Constants;
import com.xiaomi.mistatistic.sdk.controller.C4113c;
import com.xiaomi.mistatistic.sdk.controller.C4120e;
import com.xiaomi.mistatistic.sdk.controller.C4130h;
import com.xiaomi.mistatistic.sdk.controller.C4132j;
import com.xiaomi.mistatistic.sdk.controller.C4137k;
import com.xiaomi.mistatistic.sdk.controller.C4149n;
import com.xiaomi.mistatistic.sdk.controller.asyncjobs.C4105a;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.io.StringWriter;
import java.lang.Thread;
import java.util.TreeMap;

/* renamed from: com.xiaomi.mistatistic.sdk.b */
public class C4094b implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    private static int f6994a = 1;

    /* renamed from: b */
    private static boolean f6995b = false;

    /* renamed from: c */
    private final Thread.UncaughtExceptionHandler f6996c;

    /* renamed from: com.xiaomi.mistatistic.sdk.b$a */
    public static class C4097a implements Serializable {

        /* renamed from: a */
        public Throwable f6999a;

        /* renamed from: b */
        public String f7000b;

        /* renamed from: c */
        public String f7001c;

        /* renamed from: d */
        public String f7002d;

        /* renamed from: e */
        public String f7003e;

        public C4097a() {
            this.f6999a = null;
            this.f7000b = C4113c.m11112e();
            this.f7001c = C4113c.m11111d();
            this.f7002d = C4113c.m11113f();
            this.f7003e = null;
        }

        public C4097a(Throwable th) {
            this.f6999a = th;
            this.f7000b = C4113c.m11112e();
            this.f7001c = C4113c.m11111d();
            this.f7002d = C4113c.m11113f();
            this.f7003e = String.valueOf(System.currentTimeMillis());
        }
    }

    public C4094b() {
        this.f6996c = null;
    }

    public C4094b(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f6996c = uncaughtExceptionHandler;
    }

    /* renamed from: a */
    public static void m11022a(int i) {
        f6994a = i;
    }

    /* renamed from: a */
    public static void m11023a(C4097a aVar, boolean z) {
        Throwable th;
        C4130h.m11172a("uploadException, isManually:" + z);
        if (f6995b) {
            if (aVar == null || (th = aVar.f6999a) == null) {
                throw new IllegalArgumentException("the throwable is null.");
            } else if (th.getStackTrace() != null && aVar.f6999a.getStackTrace().length != 0) {
                if (!BuildSetting.isUploadDebugLogEnable(C4113c.m11105a())) {
                    C4130h.m11183d("not allowed to upload debug or exception log");
                    return;
                }
                StringWriter stringWriter = new StringWriter();
                aVar.f6999a.printStackTrace(new PrintWriter(stringWriter));
                String obj = stringWriter.toString();
                C4130h.m11177b("exception callstack:" + obj);
                final TreeMap treeMap = new TreeMap();
                treeMap.put(Constants.APP_ID, C4113c.m11108b());
                treeMap.put("app_key", C4113c.m11110c());
                treeMap.put("device_uuid", new C4120e().mo23042a());
                treeMap.put("device_os", "Android " + Build.VERSION.SDK_INT);
                treeMap.put(SmartConfigDataProvider.KEY_DEVICE_MODEL, Build.MODEL);
                treeMap.put(Constants.EXTRA_KEY_APP_VERSION, aVar.f7000b);
                treeMap.put("app_channel", aVar.f7001c);
                treeMap.put("app_start_time", aVar.f7002d);
                treeMap.put("app_crash_time", aVar.f7003e);
                treeMap.put("crash_exception_type", aVar.f6999a.getClass().getName() + Constants.COLON_SEPARATOR + aVar.f6999a.getMessage());
                treeMap.put("crash_exception_desc", aVar.f6999a instanceof OutOfMemoryError ? "OutOfMemoryError" : obj);
                treeMap.put("crash_callstack", obj);
                if (z) {
                    treeMap.put("manual", "true");
                }
                C4149n.f7112b.execute(new Runnable() {
                    public void run() {
                        try {
                            C4132j.m11190a(BuildSetting.isTest() ? "http://10.99.168.145:8097/micrash" : "https://data.mistat.xiaomi.com/micrash", treeMap, new C4132j.C4136b() {
                                /* renamed from: a */
                                public void mo23019a(String str) {
                                    C4130h.m11172a("upload exception result: " + str);
                                }
                            });
                        } catch (IOException e) {
                            C4130h.m11176a("Error to upload the exception ", (Throwable) e);
                        }
                    }
                });
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0043 A[SYNTHETIC, Splitter:B:22:0x0043] */
    /* JADX WARNING: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m11024a(java.lang.Throwable r4) {
        /*
            java.util.ArrayList r0 = m11026b()
            com.xiaomi.mistatistic.sdk.b$a r1 = new com.xiaomi.mistatistic.sdk.b$a
            r1.<init>(r4)
            r0.add(r1)
            int r4 = r0.size()
            r1 = 0
            r2 = 5
            if (r4 <= r2) goto L_0x0017
            r0.remove(r1)
        L_0x0017:
            r4 = 0
            android.content.Context r2 = com.xiaomi.mistatistic.sdk.controller.C4113c.m11105a()     // Catch:{ IOException -> 0x0034, all -> 0x0030 }
            java.lang.String r3 = ".exceptiondetail"
            java.io.FileOutputStream r1 = r2.openFileOutput(r3, r1)     // Catch:{ IOException -> 0x0034, all -> 0x0030 }
            java.io.ObjectOutputStream r2 = new java.io.ObjectOutputStream     // Catch:{ IOException -> 0x0034, all -> 0x0030 }
            r2.<init>(r1)     // Catch:{ IOException -> 0x0034, all -> 0x0030 }
            r2.writeObject(r0)     // Catch:{ IOException -> 0x002e }
        L_0x002a:
            r2.close()     // Catch:{ IOException -> 0x003f }
            goto L_0x003f
        L_0x002e:
            r4 = move-exception
            goto L_0x0037
        L_0x0030:
            r0 = move-exception
            r2 = r4
            r4 = r0
            goto L_0x0041
        L_0x0034:
            r0 = move-exception
            r2 = r4
            r4 = r0
        L_0x0037:
            java.lang.String r0 = ""
            com.xiaomi.mistatistic.sdk.controller.C4130h.m11176a((java.lang.String) r0, (java.lang.Throwable) r4)     // Catch:{ all -> 0x0040 }
            if (r2 == 0) goto L_0x003f
            goto L_0x002a
        L_0x003f:
            return
        L_0x0040:
            r4 = move-exception
        L_0x0041:
            if (r2 == 0) goto L_0x0046
            r2.close()     // Catch:{ IOException -> 0x0046 }
        L_0x0046:
            goto L_0x0048
        L_0x0047:
            throw r4
        L_0x0048:
            goto L_0x0047
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.mistatistic.sdk.C4094b.m11024a(java.lang.Throwable):void");
    }

    /* renamed from: a */
    public static void m11025a(boolean z) {
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        if (!(defaultUncaughtExceptionHandler instanceof C4094b)) {
            if (z) {
                defaultUncaughtExceptionHandler = null;
            }
            Thread.setDefaultUncaughtExceptionHandler(new C4094b(defaultUncaughtExceptionHandler));
            f6995b = true;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0047 A[SYNTHETIC, Splitter:B:24:0x0047] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0056 A[SYNTHETIC, Splitter:B:33:0x0056] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.ArrayList<com.xiaomi.mistatistic.sdk.C4094b.C4097a> m11026b() {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            android.content.Context r2 = com.xiaomi.mistatistic.sdk.controller.C4113c.m11105a()     // Catch:{ Exception -> 0x003b, all -> 0x0039 }
            java.io.File r2 = r2.getFilesDir()     // Catch:{ Exception -> 0x003b, all -> 0x0039 }
            if (r2 == 0) goto L_0x0032
            java.io.File r3 = new java.io.File     // Catch:{ Exception -> 0x003b, all -> 0x0039 }
            java.lang.String r4 = ".exceptiondetail"
            r3.<init>(r2, r4)     // Catch:{ Exception -> 0x003b, all -> 0x0039 }
            boolean r2 = r3.isFile()     // Catch:{ Exception -> 0x003b, all -> 0x0039 }
            if (r2 == 0) goto L_0x0032
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream     // Catch:{ Exception -> 0x003b, all -> 0x0039 }
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ Exception -> 0x003b, all -> 0x0039 }
            r4.<init>(r3)     // Catch:{ Exception -> 0x003b, all -> 0x0039 }
            r2.<init>(r4)     // Catch:{ Exception -> 0x003b, all -> 0x0039 }
            java.lang.Object r1 = r2.readObject()     // Catch:{ Exception -> 0x0030 }
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch:{ Exception -> 0x0030 }
            r0 = r1
            r1 = r2
            goto L_0x0032
        L_0x0030:
            r1 = move-exception
            goto L_0x003f
        L_0x0032:
            if (r1 == 0) goto L_0x0037
            r1.close()     // Catch:{ IOException -> 0x0037 }
        L_0x0037:
            r1 = 0
            goto L_0x004c
        L_0x0039:
            r0 = move-exception
            goto L_0x0054
        L_0x003b:
            r2 = move-exception
            r5 = r2
            r2 = r1
            r1 = r5
        L_0x003f:
            java.lang.String r3 = ""
            com.xiaomi.mistatistic.sdk.controller.C4130h.m11176a((java.lang.String) r3, (java.lang.Throwable) r1)     // Catch:{ all -> 0x0052 }
            r1 = 1
            if (r2 == 0) goto L_0x004c
            r2.close()     // Catch:{ IOException -> 0x004b }
            goto L_0x004c
        L_0x004b:
        L_0x004c:
            if (r1 == 0) goto L_0x0051
            m11027c()
        L_0x0051:
            return r0
        L_0x0052:
            r0 = move-exception
            r1 = r2
        L_0x0054:
            if (r1 == 0) goto L_0x0059
            r1.close()     // Catch:{ IOException -> 0x0059 }
        L_0x0059:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.mistatistic.sdk.C4094b.m11026b():java.util.ArrayList");
    }

    /* renamed from: c */
    public static void m11027c() {
        new File(C4113c.m11105a().getFilesDir(), ".exceptiondetail").delete();
    }

    /* renamed from: d */
    public static int m11028d() {
        return f6994a;
    }

    /* renamed from: a */
    public void mo23015a(Thread thread, Throwable th) {
        C4130h.m11172a("uncaughtExceptionManually...");
        if (Build.VERSION.SDK_INT >= 9) {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().build());
        }
        if (!MiStatInterface.shouldExceptionUploadImmediately()) {
            m11024a(th);
        } else if (!mo23016a()) {
            m11023a(new C4097a(th), true);
        } else {
            C4130h.m11172a("crazy crash, skip the crash");
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f6996c;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }

    /* renamed from: a */
    public boolean mo23016a() {
        int i = ((System.currentTimeMillis() - C4137k.m11203a(C4113c.m11105a(), "crash_time", 0)) > Constants.ASSEMBLE_PUSH_NETWORK_INTERVAL ? 1 : ((System.currentTimeMillis() - C4137k.m11203a(C4113c.m11105a(), "crash_time", 0)) == Constants.ASSEMBLE_PUSH_NETWORK_INTERVAL ? 0 : -1));
        Context a = C4113c.m11105a();
        if (i > 0) {
            C4137k.m11210b(a, "crash_count", 1);
            C4137k.m11211b(C4113c.m11105a(), "crash_time", System.currentTimeMillis());
        } else {
            int a2 = C4137k.m11202a(a, "crash_count", 0);
            if (a2 == 0) {
                C4137k.m11211b(C4113c.m11105a(), "crash_time", System.currentTimeMillis());
            }
            int i2 = a2 + 1;
            C4137k.m11210b(C4113c.m11105a(), "crash_count", i2);
            if (i2 > 10) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"NewApi"})
    public void uncaughtException(Thread thread, Throwable th) {
        C4130h.m11172a("uncaughtException...");
        if (Build.VERSION.SDK_INT >= 9) {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().build());
        }
        C4105a.m11074b();
        if (!MiStatInterface.shouldExceptionUploadImmediately()) {
            m11024a(th);
        } else if (!mo23016a()) {
            m11023a(new C4097a(th), false);
        } else {
            C4130h.m11172a("crazy crash...");
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f6996c;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }
}
