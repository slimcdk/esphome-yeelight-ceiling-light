package com.google.android.gms.dynamite;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.C0877b;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.C0914h;
import com.google.android.gms.common.internal.C0917i;
import com.google.android.gms.common.util.DynamiteApi;
import com.xiaomi.mipush.sdk.Constants;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import javax.annotation.concurrent.GuardedBy;
import p014c0.C0618g;
import p032f0.C3155a;
import p032f0.C3157b;

@KeepForSdk
public final class DynamiteModule {
    @NonNull
    @KeepForSdk

    /* renamed from: b */
    public static final C0966a f1193b = new C0977i();
    @NonNull
    @KeepForSdk

    /* renamed from: c */
    public static final C0966a f1194c = new C0978j();
    @GuardedBy("DynamiteModule.class")
    @Nullable

    /* renamed from: d */
    private static Boolean f1195d = null;
    @GuardedBy("DynamiteModule.class")
    @Nullable

    /* renamed from: e */
    private static String f1196e = null;
    @GuardedBy("DynamiteModule.class")

    /* renamed from: f */
    private static boolean f1197f = false;
    @GuardedBy("DynamiteModule.class")

    /* renamed from: g */
    private static int f1198g = -1;
    @GuardedBy("DynamiteModule.class")
    @Nullable

    /* renamed from: h */
    private static Boolean f1199h;

    /* renamed from: i */
    private static final ThreadLocal f1200i = new ThreadLocal();

    /* renamed from: j */
    private static final ThreadLocal f1201j = new C0972d();

    /* renamed from: k */
    private static final C0966a.C0967a f1202k = new C0973e();
    @GuardedBy("DynamiteModule.class")
    @Nullable

    /* renamed from: l */
    private static C0985q f1203l;
    @GuardedBy("DynamiteModule.class")
    @Nullable

    /* renamed from: m */
    private static C0986r f1204m;

    /* renamed from: a */
    private final Context f1205a;

    @DynamiteApi
    public static class DynamiteLoaderClassLoader {
        @GuardedBy("DynamiteLoaderClassLoader.class")
        @Nullable
        public static ClassLoader sClassLoader;
    }

    @KeepForSdk
    public static class LoadingException extends Exception {
        /* synthetic */ LoadingException(String str, C0984p pVar) {
            super(str);
        }

        /* synthetic */ LoadingException(String str, Throwable th, C0984p pVar) {
            super(str, th);
        }
    }

    /* renamed from: com.google.android.gms.dynamite.DynamiteModule$a */
    public interface C0966a {

        @KeepForSdk
        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$a$a */
        public interface C0967a {
            /* renamed from: a */
            int mo12443a(@NonNull Context context, @NonNull String str, boolean z);

            /* renamed from: b */
            int mo12444b(@NonNull Context context, @NonNull String str);
        }

        @KeepForSdk
        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$a$b */
        public static class C0968b {
            @KeepForSdk

            /* renamed from: a */
            public int f1206a = 0;
            @KeepForSdk

            /* renamed from: b */
            public int f1207b = 0;
            @KeepForSdk

            /* renamed from: c */
            public int f1208c = 0;
        }

        @NonNull
        @KeepForSdk
        /* renamed from: a */
        C0968b mo12442a(@NonNull Context context, @NonNull String str, @NonNull C0967a aVar);
    }

    static {
        new C0974f();
        new C0975g();
        new C0976h();
        new C0979k();
        new C0980l();
    }

    private DynamiteModule(Context context) {
        C0917i.m1419j(context);
        this.f1205a = context;
    }

    @KeepForSdk
    /* renamed from: a */
    public static int m1604a(@NonNull Context context, @NonNull String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            Class<?> loadClass = classLoader.loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (C0914h.m1402a(declaredField.get((Object) null), str)) {
                return declaredField2.getInt((Object) null);
            }
            String valueOf = String.valueOf(declaredField.get((Object) null));
            StringBuilder sb = new StringBuilder();
            sb.append("Module descriptor id '");
            sb.append(valueOf);
            sb.append("' didn't match expected id '");
            sb.append(str);
            sb.append("'");
            return 0;
        } catch (ClassNotFoundException unused) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Local module descriptor class for ");
            sb2.append(str);
            sb2.append(" not found.");
            return 0;
        } catch (Exception e) {
            "Failed to load module descriptor class: ".concat(String.valueOf(e.getMessage()));
            return 0;
        }
    }

    @KeepForSdk
    /* renamed from: b */
    public static int m1605b(@NonNull Context context, @NonNull String str) {
        return m1607e(context, str, false);
    }

    @NonNull
    @KeepForSdk
    /* renamed from: d */
    public static DynamiteModule m1606d(@NonNull Context context, @NonNull C0966a aVar, @NonNull String str) {
        int i;
        ThreadLocal threadLocal;
        Boolean bool;
        DynamiteModule dynamiteModule;
        C3155a aVar2;
        C0986r rVar;
        Boolean valueOf;
        Context context2 = context;
        C0966a aVar3 = aVar;
        String str2 = str;
        Class<DynamiteModule> cls = DynamiteModule.class;
        ThreadLocal threadLocal2 = f1200i;
        C0982n nVar = (C0982n) threadLocal2.get();
        C0982n nVar2 = new C0982n((C0981m) null);
        threadLocal2.set(nVar2);
        ThreadLocal threadLocal3 = f1201j;
        long longValue = ((Long) threadLocal3.get()).longValue();
        try {
            threadLocal3.set(Long.valueOf(SystemClock.elapsedRealtime()));
            C0966a.C0968b a = aVar3.mo12442a(context2, str2, f1202k);
            int i2 = a.f1206a;
            int i3 = a.f1207b;
            StringBuilder sb = new StringBuilder();
            sb.append("Considering local module ");
            sb.append(str2);
            sb.append(Constants.COLON_SEPARATOR);
            sb.append(i2);
            sb.append(" and remote module ");
            sb.append(str2);
            sb.append(Constants.COLON_SEPARATOR);
            sb.append(i3);
            int i4 = a.f1208c;
            if (i4 != 0) {
                if (i4 == -1) {
                    if (a.f1206a != 0) {
                        i4 = -1;
                    }
                }
                if (!(i4 == 1 && a.f1207b == 0)) {
                    if (i4 == -1) {
                        DynamiteModule g = m1609g(context2, str2);
                        if (longValue == 0) {
                            threadLocal3.remove();
                        } else {
                            threadLocal3.set(Long.valueOf(longValue));
                        }
                        Cursor cursor = nVar2.f1211a;
                        if (cursor != null) {
                            cursor.close();
                        }
                        threadLocal2.set(nVar);
                        return g;
                    } else if (i4 == 1) {
                        try {
                            int i5 = a.f1207b;
                            try {
                                synchronized (cls) {
                                    if (m1612j(context)) {
                                        bool = f1195d;
                                    } else {
                                        throw new LoadingException("Remote loading disabled", (C0984p) null);
                                    }
                                }
                                if (bool != null) {
                                    if (bool.booleanValue()) {
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append("Selected remote version of ");
                                        sb2.append(str2);
                                        sb2.append(", version >= ");
                                        sb2.append(i5);
                                        synchronized (cls) {
                                            rVar = f1204m;
                                        }
                                        if (rVar != null) {
                                            C0982n nVar3 = (C0982n) threadLocal2.get();
                                            if (nVar3 == null || nVar3.f1211a == null) {
                                                throw new LoadingException("No result cursor", (C0984p) null);
                                            }
                                            Context applicationContext = context.getApplicationContext();
                                            Cursor cursor2 = nVar3.f1211a;
                                            C3157b.m8427T(null);
                                            synchronized (cls) {
                                                valueOf = Boolean.valueOf(f1198g >= 2);
                                            }
                                            Context context3 = (Context) C3157b.m8428f(valueOf.booleanValue() ? rVar.mo12455T(C3157b.m8427T(applicationContext), str2, i5, C3157b.m8427T(cursor2)) : rVar.mo12456f(C3157b.m8427T(applicationContext), str2, i5, C3157b.m8427T(cursor2)));
                                            if (context3 != null) {
                                                dynamiteModule = new DynamiteModule(context3);
                                            } else {
                                                throw new LoadingException("Failed to get module context", (C0984p) null);
                                            }
                                        } else {
                                            throw new LoadingException("DynamiteLoaderV2 was not cached.", (C0984p) null);
                                        }
                                    } else {
                                        StringBuilder sb3 = new StringBuilder();
                                        sb3.append("Selected remote version of ");
                                        sb3.append(str2);
                                        sb3.append(", version >= ");
                                        sb3.append(i5);
                                        C0985q k = m1613k(context);
                                        if (k != null) {
                                            int f = k.mo12454f();
                                            if (f >= 3) {
                                                C0982n nVar4 = (C0982n) threadLocal2.get();
                                                if (nVar4 != null) {
                                                    aVar2 = k.mo12450F0(C3157b.m8427T(context), str2, i5, C3157b.m8427T(nVar4.f1211a));
                                                } else {
                                                    throw new LoadingException("No cached result cursor holder", (C0984p) null);
                                                }
                                            } else {
                                                aVar2 = f == 2 ? k.mo12451G0(C3157b.m8427T(context), str2, i5) : k.mo12449E0(C3157b.m8427T(context), str2, i5);
                                            }
                                            Object f2 = C3157b.m8428f(aVar2);
                                            if (f2 != null) {
                                                dynamiteModule = new DynamiteModule((Context) f2);
                                            } else {
                                                throw new LoadingException("Failed to load remote module.", (C0984p) null);
                                            }
                                        } else {
                                            throw new LoadingException("Failed to create IDynamiteLoader.", (C0984p) null);
                                        }
                                    }
                                    if (longValue == 0) {
                                        threadLocal3.remove();
                                    } else {
                                        threadLocal3.set(Long.valueOf(longValue));
                                    }
                                    Cursor cursor3 = nVar2.f1211a;
                                    if (cursor3 != null) {
                                        cursor3.close();
                                    }
                                    threadLocal2.set(nVar);
                                    return dynamiteModule;
                                }
                                throw new LoadingException("Failed to determine which loading route to use.", (C0984p) null);
                            } catch (RemoteException e) {
                                throw new LoadingException("Failed to load remote module.", e, (C0984p) null);
                            } catch (LoadingException e2) {
                                throw e2;
                            } catch (Throwable th) {
                                C0618g.m207a(context2, th);
                                throw new LoadingException("Failed to load remote module.", th, (C0984p) null);
                            }
                        } catch (LoadingException e3) {
                            String message = e3.getMessage();
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append("Failed to load remote module: ");
                            sb4.append(message);
                            int i6 = a.f1206a;
                            if (i6 != 0) {
                                if (aVar.mo12442a(context2, str2, new C0983o(i6, 0)).f1208c == -1) {
                                    DynamiteModule g2 = m1609g(context2, str2);
                                    if (i != 0) {
                                        threadLocal.set(Long.valueOf(longValue));
                                    }
                                    return g2;
                                }
                            }
                            throw new LoadingException("Remote load failed. No local fallback found.", e3, (C0984p) null);
                        }
                    } else {
                        throw new LoadingException("VersionPolicy returned invalid code:" + i4, (C0984p) null);
                    }
                }
            }
            int i7 = a.f1206a;
            int i8 = a.f1207b;
            throw new LoadingException("No acceptable module " + str2 + " found. Local version is " + i7 + " and remote version is " + i8 + ".", (C0984p) null);
        } finally {
            i = (longValue > 0 ? 1 : (longValue == 0 ? 0 : -1));
            threadLocal = f1201j;
            if (i == 0) {
                threadLocal.remove();
            } else {
                threadLocal.set(Long.valueOf(longValue));
            }
            Cursor cursor4 = nVar2.f1211a;
            if (cursor4 != null) {
                cursor4.close();
            }
            f1200i.set(nVar);
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:31:0x0056=Splitter:B:31:0x0056, B:50:0x009a=Splitter:B:50:0x009a, B:17:0x003b=Splitter:B:17:0x003b} */
    /* renamed from: e */
    public static int m1607e(@androidx.annotation.NonNull android.content.Context r10, @androidx.annotation.NonNull java.lang.String r11, boolean r12) {
        /*
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r0 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r0)     // Catch:{ all -> 0x018f }
            java.lang.Boolean r1 = f1195d     // Catch:{ all -> 0x018c }
            r2 = 0
            r3 = 0
            if (r1 != 0) goto L_0x00cc
            android.content.Context r1 = r10.getApplicationContext()     // Catch:{ ClassNotFoundException -> 0x00b6, IllegalAccessException -> 0x00b4, NoSuchFieldException -> 0x00b2 }
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x00b6, IllegalAccessException -> 0x00b4, NoSuchFieldException -> 0x00b2 }
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader> r4 = com.google.android.gms.dynamite.DynamiteModule.DynamiteLoaderClassLoader.class
            java.lang.String r4 = r4.getName()     // Catch:{ ClassNotFoundException -> 0x00b6, IllegalAccessException -> 0x00b4, NoSuchFieldException -> 0x00b2 }
            java.lang.Class r1 = r1.loadClass(r4)     // Catch:{ ClassNotFoundException -> 0x00b6, IllegalAccessException -> 0x00b4, NoSuchFieldException -> 0x00b2 }
            java.lang.String r4 = "sClassLoader"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r4)     // Catch:{ ClassNotFoundException -> 0x00b6, IllegalAccessException -> 0x00b4, NoSuchFieldException -> 0x00b2 }
            java.lang.Class r4 = r1.getDeclaringClass()     // Catch:{ ClassNotFoundException -> 0x00b6, IllegalAccessException -> 0x00b4, NoSuchFieldException -> 0x00b2 }
            monitor-enter(r4)     // Catch:{ ClassNotFoundException -> 0x00b6, IllegalAccessException -> 0x00b4, NoSuchFieldException -> 0x00b2 }
            java.lang.Object r5 = r1.get(r2)     // Catch:{ all -> 0x00af }
            java.lang.ClassLoader r5 = (java.lang.ClassLoader) r5     // Catch:{ all -> 0x00af }
            java.lang.ClassLoader r6 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x00af }
            if (r5 != r6) goto L_0x0036
        L_0x0032:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x00af }
            goto L_0x00ad
        L_0x0036:
            if (r5 == 0) goto L_0x003f
            m1610h(r5)     // Catch:{ LoadingException -> 0x003b }
        L_0x003b:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x00af }
            goto L_0x00ad
        L_0x003f:
            boolean r5 = m1612j(r10)     // Catch:{ all -> 0x00af }
            if (r5 != 0) goto L_0x0048
            monitor-exit(r4)     // Catch:{ all -> 0x00af }
            monitor-exit(r0)     // Catch:{ all -> 0x018c }
            return r3
        L_0x0048:
            boolean r5 = f1197f     // Catch:{ all -> 0x00af }
            if (r5 != 0) goto L_0x00a5
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x00af }
            boolean r6 = r5.equals(r2)     // Catch:{ all -> 0x00af }
            if (r6 == 0) goto L_0x0055
            goto L_0x00a5
        L_0x0055:
            r6 = 1
            int r6 = m1608f(r10, r11, r12, r6)     // Catch:{ LoadingException -> 0x009d }
            java.lang.String r7 = f1196e     // Catch:{ LoadingException -> 0x009d }
            if (r7 == 0) goto L_0x009a
            boolean r7 = r7.isEmpty()     // Catch:{ LoadingException -> 0x009d }
            if (r7 == 0) goto L_0x0065
            goto L_0x009a
        L_0x0065:
            java.lang.ClassLoader r7 = com.google.android.gms.dynamite.C0970b.m1618a()     // Catch:{ LoadingException -> 0x009d }
            if (r7 == 0) goto L_0x006c
            goto L_0x008f
        L_0x006c:
            int r7 = android.os.Build.VERSION.SDK_INT     // Catch:{ LoadingException -> 0x009d }
            r8 = 29
            if (r7 < r8) goto L_0x0081
            dalvik.system.DelegateLastClassLoader r7 = new dalvik.system.DelegateLastClassLoader     // Catch:{ LoadingException -> 0x009d }
            java.lang.String r8 = f1196e     // Catch:{ LoadingException -> 0x009d }
            com.google.android.gms.common.internal.C0917i.m1419j(r8)     // Catch:{ LoadingException -> 0x009d }
            java.lang.ClassLoader r9 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ LoadingException -> 0x009d }
            r7.<init>(r8, r9)     // Catch:{ LoadingException -> 0x009d }
            goto L_0x008f
        L_0x0081:
            com.google.android.gms.dynamite.c r7 = new com.google.android.gms.dynamite.c     // Catch:{ LoadingException -> 0x009d }
            java.lang.String r8 = f1196e     // Catch:{ LoadingException -> 0x009d }
            com.google.android.gms.common.internal.C0917i.m1419j(r8)     // Catch:{ LoadingException -> 0x009d }
            java.lang.ClassLoader r9 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ LoadingException -> 0x009d }
            r7.<init>(r8, r9)     // Catch:{ LoadingException -> 0x009d }
        L_0x008f:
            m1610h(r7)     // Catch:{ LoadingException -> 0x009d }
            r1.set(r2, r7)     // Catch:{ LoadingException -> 0x009d }
            f1195d = r5     // Catch:{ LoadingException -> 0x009d }
            monitor-exit(r4)     // Catch:{ all -> 0x00af }
            monitor-exit(r0)     // Catch:{ all -> 0x018c }
            return r6
        L_0x009a:
            monitor-exit(r4)     // Catch:{ all -> 0x00af }
            monitor-exit(r0)     // Catch:{ all -> 0x018c }
            return r6
        L_0x009d:
            java.lang.ClassLoader r5 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x00af }
            r1.set(r2, r5)     // Catch:{ all -> 0x00af }
            goto L_0x0032
        L_0x00a5:
            java.lang.ClassLoader r5 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x00af }
            r1.set(r2, r5)     // Catch:{ all -> 0x00af }
            goto L_0x0032
        L_0x00ad:
            monitor-exit(r4)     // Catch:{ all -> 0x00af }
            goto L_0x00ca
        L_0x00af:
            r1 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00af }
            throw r1     // Catch:{ ClassNotFoundException -> 0x00b6, IllegalAccessException -> 0x00b4, NoSuchFieldException -> 0x00b2 }
        L_0x00b2:
            r1 = move-exception
            goto L_0x00b7
        L_0x00b4:
            r1 = move-exception
            goto L_0x00b7
        L_0x00b6:
            r1 = move-exception
        L_0x00b7:
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x018c }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x018c }
            r4.<init>()     // Catch:{ all -> 0x018c }
            java.lang.String r5 = "Failed to load module via V2: "
            r4.append(r5)     // Catch:{ all -> 0x018c }
            r4.append(r1)     // Catch:{ all -> 0x018c }
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x018c }
        L_0x00ca:
            f1195d = r1     // Catch:{ all -> 0x018c }
        L_0x00cc:
            monitor-exit(r0)     // Catch:{ all -> 0x018c }
            boolean r0 = r1.booleanValue()     // Catch:{ all -> 0x018f }
            if (r0 == 0) goto L_0x00eb
            int r10 = m1608f(r10, r11, r12, r3)     // Catch:{ LoadingException -> 0x00d8 }
            return r10
        L_0x00d8:
            r11 = move-exception
            java.lang.String r11 = r11.getMessage()     // Catch:{ all -> 0x018f }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x018f }
            r12.<init>()     // Catch:{ all -> 0x018f }
            java.lang.String r0 = "Failed to retrieve remote module version: "
            r12.append(r0)     // Catch:{ all -> 0x018f }
            r12.append(r11)     // Catch:{ all -> 0x018f }
            return r3
        L_0x00eb:
            com.google.android.gms.dynamite.q r4 = m1613k(r10)     // Catch:{ all -> 0x018f }
            if (r4 != 0) goto L_0x00f3
            goto L_0x0183
        L_0x00f3:
            int r0 = r4.mo12454f()     // Catch:{ RemoteException -> 0x016b }
            r1 = 3
            if (r0 < r1) goto L_0x0154
            java.lang.ThreadLocal r0 = f1200i     // Catch:{ RemoteException -> 0x016b }
            java.lang.Object r0 = r0.get()     // Catch:{ RemoteException -> 0x016b }
            com.google.android.gms.dynamite.n r0 = (com.google.android.gms.dynamite.C0982n) r0     // Catch:{ RemoteException -> 0x016b }
            if (r0 == 0) goto L_0x010e
            android.database.Cursor r0 = r0.f1211a     // Catch:{ RemoteException -> 0x016b }
            if (r0 == 0) goto L_0x010e
            int r3 = r0.getInt(r3)     // Catch:{ RemoteException -> 0x016b }
            goto L_0x0183
        L_0x010e:
            f0.a r5 = p032f0.C3157b.m8427T(r10)     // Catch:{ RemoteException -> 0x016b }
            java.lang.ThreadLocal r0 = f1201j     // Catch:{ RemoteException -> 0x016b }
            java.lang.Object r0 = r0.get()     // Catch:{ RemoteException -> 0x016b }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ RemoteException -> 0x016b }
            long r8 = r0.longValue()     // Catch:{ RemoteException -> 0x016b }
            r6 = r11
            r7 = r12
            f0.a r11 = r4.mo12452H0(r5, r6, r7, r8)     // Catch:{ RemoteException -> 0x016b }
            java.lang.Object r11 = p032f0.C3157b.m8428f(r11)     // Catch:{ RemoteException -> 0x016b }
            android.database.Cursor r11 = (android.database.Cursor) r11     // Catch:{ RemoteException -> 0x016b }
            if (r11 == 0) goto L_0x014e
            boolean r12 = r11.moveToFirst()     // Catch:{ RemoteException -> 0x014b, all -> 0x0148 }
            if (r12 != 0) goto L_0x0133
            goto L_0x014e
        L_0x0133:
            int r12 = r11.getInt(r3)     // Catch:{ RemoteException -> 0x014b, all -> 0x0148 }
            if (r12 <= 0) goto L_0x0140
            boolean r0 = m1611i(r11)     // Catch:{ RemoteException -> 0x014b, all -> 0x0148 }
            if (r0 == 0) goto L_0x0140
            goto L_0x0141
        L_0x0140:
            r2 = r11
        L_0x0141:
            if (r2 == 0) goto L_0x0146
            r2.close()     // Catch:{ all -> 0x018f }
        L_0x0146:
            r3 = r12
            goto L_0x0183
        L_0x0148:
            r12 = move-exception
            r2 = r11
            goto L_0x0186
        L_0x014b:
            r12 = move-exception
            r2 = r11
            goto L_0x016d
        L_0x014e:
            if (r11 == 0) goto L_0x0183
            r11.close()     // Catch:{ all -> 0x018f }
            goto L_0x0183
        L_0x0154:
            r1 = 2
            if (r0 != r1) goto L_0x0160
            f0.a r0 = p032f0.C3157b.m8427T(r10)     // Catch:{ RemoteException -> 0x016b }
            int r3 = r4.mo12448D0(r0, r11, r12)     // Catch:{ RemoteException -> 0x016b }
            goto L_0x0183
        L_0x0160:
            f0.a r0 = p032f0.C3157b.m8427T(r10)     // Catch:{ RemoteException -> 0x016b }
            int r3 = r4.mo12453T(r0, r11, r12)     // Catch:{ RemoteException -> 0x016b }
            goto L_0x0183
        L_0x0169:
            r12 = r11
            goto L_0x0186
        L_0x016b:
            r11 = move-exception
            r12 = r11
        L_0x016d:
            java.lang.String r11 = r12.getMessage()     // Catch:{ all -> 0x0184 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x0184 }
            r12.<init>()     // Catch:{ all -> 0x0184 }
            java.lang.String r0 = "Failed to retrieve remote module version: "
            r12.append(r0)     // Catch:{ all -> 0x0184 }
            r12.append(r11)     // Catch:{ all -> 0x0184 }
            if (r2 == 0) goto L_0x0183
            r2.close()     // Catch:{ all -> 0x018f }
        L_0x0183:
            return r3
        L_0x0184:
            r11 = move-exception
            goto L_0x0169
        L_0x0186:
            if (r2 == 0) goto L_0x018b
            r2.close()     // Catch:{ all -> 0x018f }
        L_0x018b:
            throw r12     // Catch:{ all -> 0x018f }
        L_0x018c:
            r11 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x018c }
            throw r11     // Catch:{ all -> 0x018f }
        L_0x018f:
            r11 = move-exception
            p014c0.C0618g.m207a(r10, r11)
            goto L_0x0195
        L_0x0194:
            throw r11
        L_0x0195:
            goto L_0x0194
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.m1607e(android.content.Context, java.lang.String, boolean):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:55:0x00b5 A[Catch:{ all -> 0x00be }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b6 A[Catch:{ all -> 0x00be }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00c2  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m1608f(android.content.Context r10, java.lang.String r11, boolean r12, boolean r13) {
        /*
            r0 = 0
            java.lang.ThreadLocal r1 = f1201j     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            java.lang.Object r1 = r1.get()     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            long r1 = r1.longValue()     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            android.content.ContentResolver r3 = r10.getContentResolver()     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            java.lang.String r10 = "api_force_staging"
            java.lang.String r4 = "api"
            r9 = 1
            if (r9 == r12) goto L_0x0019
            r10 = r4
        L_0x0019:
            android.net.Uri$Builder r12 = new android.net.Uri$Builder     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            r12.<init>()     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            java.lang.String r4 = "content"
            android.net.Uri$Builder r12 = r12.scheme(r4)     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            java.lang.String r4 = "com.google.android.gms.chimera"
            android.net.Uri$Builder r12 = r12.authority(r4)     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            android.net.Uri$Builder r10 = r12.path(r10)     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            android.net.Uri$Builder r10 = r10.appendPath(r11)     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            java.lang.String r11 = "requestStartTime"
            java.lang.String r12 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            android.net.Uri$Builder r10 = r10.appendQueryParameter(r11, r12)     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            android.net.Uri r4 = r10.build()     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r10 = r3.query(r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            if (r10 == 0) goto L_0x00a3
            boolean r11 = r10.moveToFirst()     // Catch:{ Exception -> 0x009b }
            if (r11 == 0) goto L_0x00a3
            r11 = 0
            int r12 = r10.getInt(r11)     // Catch:{ Exception -> 0x009b }
            if (r12 <= 0) goto L_0x008e
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r1 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r1)     // Catch:{ Exception -> 0x009b }
            r2 = 2
            java.lang.String r2 = r10.getString(r2)     // Catch:{ all -> 0x008b }
            f1196e = r2     // Catch:{ all -> 0x008b }
            java.lang.String r2 = "loaderVersion"
            int r2 = r10.getColumnIndex(r2)     // Catch:{ all -> 0x008b }
            if (r2 < 0) goto L_0x006f
            int r2 = r10.getInt(r2)     // Catch:{ all -> 0x008b }
            f1198g = r2     // Catch:{ all -> 0x008b }
        L_0x006f:
            java.lang.String r2 = "disableStandaloneDynamiteLoader2"
            int r2 = r10.getColumnIndex(r2)     // Catch:{ all -> 0x008b }
            if (r2 < 0) goto L_0x0082
            int r2 = r10.getInt(r2)     // Catch:{ all -> 0x008b }
            if (r2 == 0) goto L_0x007e
            goto L_0x007f
        L_0x007e:
            r9 = 0
        L_0x007f:
            f1197f = r9     // Catch:{ all -> 0x008b }
            r11 = r9
        L_0x0082:
            monitor-exit(r1)     // Catch:{ all -> 0x008b }
            boolean r1 = m1611i(r10)     // Catch:{ Exception -> 0x009b }
            if (r1 == 0) goto L_0x008e
            r10 = r0
            goto L_0x008e
        L_0x008b:
            r11 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x008b }
            throw r11     // Catch:{ Exception -> 0x009b }
        L_0x008e:
            if (r13 == 0) goto L_0x009d
            if (r11 != 0) goto L_0x0093
            goto L_0x009d
        L_0x0093:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r11 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ Exception -> 0x009b }
            java.lang.String r12 = "forcing fallback to container DynamiteLoader impl"
            r11.<init>(r12, r0)     // Catch:{ Exception -> 0x009b }
            throw r11     // Catch:{ Exception -> 0x009b }
        L_0x009b:
            r11 = move-exception
            goto L_0x00b1
        L_0x009d:
            if (r10 == 0) goto L_0x00a2
            r10.close()
        L_0x00a2:
            return r12
        L_0x00a3:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r11 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ Exception -> 0x009b }
            java.lang.String r12 = "Failed to connect to dynamite module ContentResolver."
            r11.<init>(r12, r0)     // Catch:{ Exception -> 0x009b }
            throw r11     // Catch:{ Exception -> 0x009b }
        L_0x00ab:
            r10 = move-exception
            r11 = r10
            goto L_0x00c0
        L_0x00ae:
            r10 = move-exception
            r11 = r10
            r10 = r0
        L_0x00b1:
            boolean r12 = r11 instanceof com.google.android.gms.dynamite.DynamiteModule.LoadingException     // Catch:{ all -> 0x00be }
            if (r12 == 0) goto L_0x00b6
            throw r11     // Catch:{ all -> 0x00be }
        L_0x00b6:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r12 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ all -> 0x00be }
            java.lang.String r13 = "V2 version check failed"
            r12.<init>(r13, r11, r0)     // Catch:{ all -> 0x00be }
            throw r12     // Catch:{ all -> 0x00be }
        L_0x00be:
            r11 = move-exception
            r0 = r10
        L_0x00c0:
            if (r0 == 0) goto L_0x00c5
            r0.close()
        L_0x00c5:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.m1608f(android.content.Context, java.lang.String, boolean, boolean):int");
    }

    /* renamed from: g */
    private static DynamiteModule m1609g(Context context, String str) {
        "Selected local version of ".concat(String.valueOf(str));
        return new DynamiteModule(context.getApplicationContext());
    }

    @GuardedBy("DynamiteModule.class")
    /* renamed from: h */
    private static void m1610h(ClassLoader classLoader) {
        C0986r rVar;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                rVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                rVar = queryLocalInterface instanceof C0986r ? (C0986r) queryLocalInterface : new C0986r(iBinder);
            }
            f1204m = rVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            throw new LoadingException("Failed to instantiate dynamite loader", e, (C0984p) null);
        }
    }

    /* renamed from: i */
    private static boolean m1611i(Cursor cursor) {
        C0982n nVar = (C0982n) f1200i.get();
        if (nVar == null || nVar.f1211a != null) {
            return false;
        }
        nVar.f1211a = cursor;
        return true;
    }

    @GuardedBy("DynamiteModule.class")
    /* renamed from: j */
    private static boolean m1612j(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals((Object) null) || bool.equals(f1199h)) {
            return true;
        }
        boolean z = false;
        if (f1199h == null) {
            ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 0);
            if (C0877b.m1212h().mo11774j(context, 10000000) == 0 && resolveContentProvider != null && "com.google.android.gms".equals(resolveContentProvider.packageName)) {
                z = true;
            }
            Boolean valueOf = Boolean.valueOf(z);
            f1199h = valueOf;
            z = valueOf.booleanValue();
            if (z && resolveContentProvider != null && (applicationInfo = resolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                f1197f = true;
            }
        }
        return z;
    }

    @Nullable
    /* renamed from: k */
    private static C0985q m1613k(Context context) {
        C0985q qVar;
        synchronized (DynamiteModule.class) {
            C0985q qVar2 = f1203l;
            if (qVar2 != null) {
                return qVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    qVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    qVar = queryLocalInterface instanceof C0985q ? (C0985q) queryLocalInterface : new C0985q(iBinder);
                }
                if (qVar != null) {
                    f1203l = qVar;
                    return qVar;
                }
            } catch (Exception e) {
                String message = e.getMessage();
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to load IDynamiteLoader from GmsCore: ");
                sb.append(message);
            }
        }
        return null;
    }

    @NonNull
    @KeepForSdk
    /* renamed from: c */
    public IBinder mo12441c(@NonNull String str) {
        try {
            return (IBinder) this.f1205a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            throw new LoadingException("Failed to instantiate module class: ".concat(String.valueOf(str)), e, (C0984p) null);
        }
    }
}
