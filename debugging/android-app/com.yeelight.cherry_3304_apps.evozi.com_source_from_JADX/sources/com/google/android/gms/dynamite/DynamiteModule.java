package com.google.android.gms.dynamite;

import android.content.Context;
import android.database.Cursor;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.C1609u;
import com.google.android.gms.common.util.C1653g;
import com.google.android.gms.common.util.DynamiteApi;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import javax.annotation.concurrent.GuardedBy;
import p011c.p012a.p019b.p028b.p031b.C0561a;
import p011c.p012a.p019b.p028b.p031b.C0564b;

@KeepForSdk
public final class DynamiteModule {
    @GuardedBy("DynamiteModule.class")

    /* renamed from: b */
    private static Boolean f3203b = null;
    @GuardedBy("DynamiteModule.class")

    /* renamed from: c */
    private static C1686f f3204c = null;
    @GuardedBy("DynamiteModule.class")

    /* renamed from: d */
    private static C1688h f3205d = null;
    @GuardedBy("DynamiteModule.class")

    /* renamed from: e */
    private static String f3206e = null;
    @GuardedBy("DynamiteModule.class")

    /* renamed from: f */
    private static int f3207f = -1;

    /* renamed from: g */
    private static final ThreadLocal<C1679c> f3208g = new ThreadLocal<>();

    /* renamed from: h */
    private static final C1676b.C1677a f3209h = new C1681a();
    @KeepForSdk

    /* renamed from: i */
    public static final C1676b f3210i = new C1682b();
    @KeepForSdk

    /* renamed from: j */
    public static final C1676b f3211j = new C1683c();
    @KeepForSdk

    /* renamed from: k */
    public static final C1676b f3212k = new C1684d();

    /* renamed from: a */
    private final Context f3213a;

    @DynamiteApi
    public static class DynamiteLoaderClassLoader {
        @GuardedBy("DynamiteLoaderClassLoader.class")
        public static ClassLoader sClassLoader;
    }

    @KeepForSdk
    /* renamed from: com.google.android.gms.dynamite.DynamiteModule$a */
    public static class C1675a extends Exception {
        private C1675a(String str) {
            super(str);
        }

        /* synthetic */ C1675a(String str, C1681a aVar) {
            this(str);
        }

        private C1675a(String str, Throwable th) {
            super(str, th);
        }

        /* synthetic */ C1675a(String str, Throwable th, C1681a aVar) {
            this(str, th);
        }
    }

    /* renamed from: com.google.android.gms.dynamite.DynamiteModule$b */
    public interface C1676b {

        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$b$a */
        public interface C1677a {
            /* renamed from: a */
            int mo11390a(Context context, String str);

            /* renamed from: b */
            int mo11391b(Context context, String str, boolean z);
        }

        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$b$b */
        public static class C1678b {

            /* renamed from: a */
            public int f3214a = 0;

            /* renamed from: b */
            public int f3215b = 0;

            /* renamed from: c */
            public int f3216c = 0;
        }

        /* renamed from: a */
        C1678b mo11389a(Context context, String str, C1677a aVar);
    }

    /* renamed from: com.google.android.gms.dynamite.DynamiteModule$c */
    private static class C1679c {

        /* renamed from: a */
        public Cursor f3217a;

        private C1679c() {
        }

        /* synthetic */ C1679c(C1681a aVar) {
            this();
        }
    }

    /* renamed from: com.google.android.gms.dynamite.DynamiteModule$d */
    private static class C1680d implements C1676b.C1677a {

        /* renamed from: a */
        private final int f3218a;

        public C1680d(int i, int i2) {
            this.f3218a = i;
        }

        /* renamed from: a */
        public final int mo11390a(Context context, String str) {
            return this.f3218a;
        }

        /* renamed from: b */
        public final int mo11391b(Context context, String str, boolean z) {
            return 0;
        }
    }

    private DynamiteModule(Context context) {
        C1609u.m4475k(context);
        this.f3213a = context;
    }

    @KeepForSdk
    /* renamed from: a */
    public static int m4644a(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 61);
            sb.append("com.google.android.gms.dynamite.descriptors.");
            sb.append(str);
            sb.append(".ModuleDescriptor");
            Class<?> loadClass = classLoader.loadClass(sb.toString());
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (declaredField.get((Object) null).equals(str)) {
                return declaredField2.getInt((Object) null);
            }
            String valueOf = String.valueOf(declaredField.get((Object) null));
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 51 + String.valueOf(str).length());
            sb2.append("Module descriptor id '");
            sb2.append(valueOf);
            sb2.append("' didn't match expected id '");
            sb2.append(str);
            sb2.append("'");
            sb2.toString();
            return 0;
        } catch (ClassNotFoundException unused) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 45);
            sb3.append("Local module descriptor class for ");
            sb3.append(str);
            sb3.append(" not found.");
            sb3.toString();
            return 0;
        } catch (Exception e) {
            String valueOf2 = String.valueOf(e.getMessage());
            if (valueOf2.length() != 0) {
                "Failed to load module descriptor class: ".concat(valueOf2);
            } else {
                new String("Failed to load module descriptor class: ");
            }
            return 0;
        }
    }

    @KeepForSdk
    /* renamed from: b */
    public static int m4645b(Context context, String str) {
        return m4647e(context, str, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0076, code lost:
        if (r10 != null) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008d, code lost:
        if (r10 != null) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c4, code lost:
        if (r10 != null) goto L_0x0078;
     */
    @com.google.android.gms.common.annotation.KeepForSdk
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.dynamite.DynamiteModule m4646d(android.content.Context r9, com.google.android.gms.dynamite.DynamiteModule.C1676b r10, java.lang.String r11) {
        /*
            java.lang.String r0 = ":"
            java.lang.ThreadLocal<com.google.android.gms.dynamite.DynamiteModule$c> r1 = f3208g
            java.lang.Object r1 = r1.get()
            com.google.android.gms.dynamite.DynamiteModule$c r1 = (com.google.android.gms.dynamite.DynamiteModule.C1679c) r1
            com.google.android.gms.dynamite.DynamiteModule$c r2 = new com.google.android.gms.dynamite.DynamiteModule$c
            r3 = 0
            r2.<init>(r3)
            java.lang.ThreadLocal<com.google.android.gms.dynamite.DynamiteModule$c> r4 = f3208g
            r4.set(r2)
            com.google.android.gms.dynamite.DynamiteModule$b$a r4 = f3209h     // Catch:{ all -> 0x0114 }
            com.google.android.gms.dynamite.DynamiteModule$b$b r4 = r10.mo11389a(r9, r11, r4)     // Catch:{ all -> 0x0114 }
            int r5 = r4.f3214a     // Catch:{ all -> 0x0114 }
            int r6 = r4.f3215b     // Catch:{ all -> 0x0114 }
            java.lang.String r7 = java.lang.String.valueOf(r11)     // Catch:{ all -> 0x0114 }
            int r7 = r7.length()     // Catch:{ all -> 0x0114 }
            int r7 = r7 + 68
            java.lang.String r8 = java.lang.String.valueOf(r11)     // Catch:{ all -> 0x0114 }
            int r8 = r8.length()     // Catch:{ all -> 0x0114 }
            int r7 = r7 + r8
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0114 }
            r8.<init>(r7)     // Catch:{ all -> 0x0114 }
            java.lang.String r7 = "Considering local module "
            r8.append(r7)     // Catch:{ all -> 0x0114 }
            r8.append(r11)     // Catch:{ all -> 0x0114 }
            r8.append(r0)     // Catch:{ all -> 0x0114 }
            r8.append(r5)     // Catch:{ all -> 0x0114 }
            java.lang.String r5 = " and remote module "
            r8.append(r5)     // Catch:{ all -> 0x0114 }
            r8.append(r11)     // Catch:{ all -> 0x0114 }
            r8.append(r0)     // Catch:{ all -> 0x0114 }
            r8.append(r6)     // Catch:{ all -> 0x0114 }
            r8.toString()     // Catch:{ all -> 0x0114 }
            int r0 = r4.f3216c     // Catch:{ all -> 0x0114 }
            if (r0 == 0) goto L_0x00ea
            int r0 = r4.f3216c     // Catch:{ all -> 0x0114 }
            r5 = -1
            if (r0 != r5) goto L_0x0063
            int r0 = r4.f3214a     // Catch:{ all -> 0x0114 }
            if (r0 == 0) goto L_0x00ea
        L_0x0063:
            int r0 = r4.f3216c     // Catch:{ all -> 0x0114 }
            r6 = 1
            if (r0 != r6) goto L_0x006c
            int r0 = r4.f3215b     // Catch:{ all -> 0x0114 }
            if (r0 == 0) goto L_0x00ea
        L_0x006c:
            int r0 = r4.f3216c     // Catch:{ all -> 0x0114 }
            if (r0 != r5) goto L_0x0081
            com.google.android.gms.dynamite.DynamiteModule r9 = m4654l(r9, r11)     // Catch:{ all -> 0x0114 }
            android.database.Cursor r10 = r2.f3217a
            if (r10 == 0) goto L_0x007b
        L_0x0078:
            r10.close()
        L_0x007b:
            java.lang.ThreadLocal<com.google.android.gms.dynamite.DynamiteModule$c> r10 = f3208g
            r10.set(r1)
            return r9
        L_0x0081:
            int r0 = r4.f3216c     // Catch:{ all -> 0x0114 }
            if (r0 != r6) goto L_0x00cf
            int r0 = r4.f3215b     // Catch:{ a -> 0x0090 }
            com.google.android.gms.dynamite.DynamiteModule r9 = m4648f(r9, r11, r0)     // Catch:{ a -> 0x0090 }
            android.database.Cursor r10 = r2.f3217a
            if (r10 == 0) goto L_0x007b
            goto L_0x0078
        L_0x0090:
            r0 = move-exception
            java.lang.String r6 = "Failed to load remote module: "
            java.lang.String r7 = r0.getMessage()     // Catch:{ all -> 0x0114 }
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x0114 }
            int r8 = r7.length()     // Catch:{ all -> 0x0114 }
            if (r8 == 0) goto L_0x00a5
            r6.concat(r7)     // Catch:{ all -> 0x0114 }
            goto L_0x00aa
        L_0x00a5:
            java.lang.String r7 = new java.lang.String     // Catch:{ all -> 0x0114 }
            r7.<init>(r6)     // Catch:{ all -> 0x0114 }
        L_0x00aa:
            int r6 = r4.f3214a     // Catch:{ all -> 0x0114 }
            if (r6 == 0) goto L_0x00c7
            com.google.android.gms.dynamite.DynamiteModule$d r6 = new com.google.android.gms.dynamite.DynamiteModule$d     // Catch:{ all -> 0x0114 }
            int r4 = r4.f3214a     // Catch:{ all -> 0x0114 }
            r7 = 0
            r6.<init>(r4, r7)     // Catch:{ all -> 0x0114 }
            com.google.android.gms.dynamite.DynamiteModule$b$b r10 = r10.mo11389a(r9, r11, r6)     // Catch:{ all -> 0x0114 }
            int r10 = r10.f3216c     // Catch:{ all -> 0x0114 }
            if (r10 != r5) goto L_0x00c7
            com.google.android.gms.dynamite.DynamiteModule r9 = m4654l(r9, r11)     // Catch:{ all -> 0x0114 }
            android.database.Cursor r10 = r2.f3217a
            if (r10 == 0) goto L_0x007b
            goto L_0x0078
        L_0x00c7:
            com.google.android.gms.dynamite.DynamiteModule$a r9 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ all -> 0x0114 }
            java.lang.String r10 = "Remote load failed. No local fallback found."
            r9.<init>(r10, r0, r3)     // Catch:{ all -> 0x0114 }
            throw r9     // Catch:{ all -> 0x0114 }
        L_0x00cf:
            com.google.android.gms.dynamite.DynamiteModule$a r9 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ all -> 0x0114 }
            int r10 = r4.f3216c     // Catch:{ all -> 0x0114 }
            r11 = 47
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0114 }
            r0.<init>(r11)     // Catch:{ all -> 0x0114 }
            java.lang.String r11 = "VersionPolicy returned invalid code:"
            r0.append(r11)     // Catch:{ all -> 0x0114 }
            r0.append(r10)     // Catch:{ all -> 0x0114 }
            java.lang.String r10 = r0.toString()     // Catch:{ all -> 0x0114 }
            r9.<init>((java.lang.String) r10, (com.google.android.gms.dynamite.C1681a) r3)     // Catch:{ all -> 0x0114 }
            throw r9     // Catch:{ all -> 0x0114 }
        L_0x00ea:
            com.google.android.gms.dynamite.DynamiteModule$a r9 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ all -> 0x0114 }
            int r10 = r4.f3214a     // Catch:{ all -> 0x0114 }
            int r11 = r4.f3215b     // Catch:{ all -> 0x0114 }
            r0 = 91
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0114 }
            r4.<init>(r0)     // Catch:{ all -> 0x0114 }
            java.lang.String r0 = "No acceptable module found. Local version is "
            r4.append(r0)     // Catch:{ all -> 0x0114 }
            r4.append(r10)     // Catch:{ all -> 0x0114 }
            java.lang.String r10 = " and remote version is "
            r4.append(r10)     // Catch:{ all -> 0x0114 }
            r4.append(r11)     // Catch:{ all -> 0x0114 }
            java.lang.String r10 = "."
            r4.append(r10)     // Catch:{ all -> 0x0114 }
            java.lang.String r10 = r4.toString()     // Catch:{ all -> 0x0114 }
            r9.<init>((java.lang.String) r10, (com.google.android.gms.dynamite.C1681a) r3)     // Catch:{ all -> 0x0114 }
            throw r9     // Catch:{ all -> 0x0114 }
        L_0x0114:
            r9 = move-exception
            android.database.Cursor r10 = r2.f3217a
            if (r10 == 0) goto L_0x011c
            r10.close()
        L_0x011c:
            java.lang.ThreadLocal<com.google.android.gms.dynamite.DynamiteModule$c> r10 = f3208g
            r10.set(r1)
            goto L_0x0123
        L_0x0122:
            throw r9
        L_0x0123:
            goto L_0x0122
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.m4646d(android.content.Context, com.google.android.gms.dynamite.DynamiteModule$b, java.lang.String):com.google.android.gms.dynamite.DynamiteModule");
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
    /* JADX WARNING: Unknown top exception splitter block from list: {B:23:0x0050=Splitter:B:23:0x0050, B:18:0x0035=Splitter:B:18:0x0035, B:35:0x0079=Splitter:B:35:0x0079} */
    /* renamed from: e */
    public static int m4647e(android.content.Context r8, java.lang.String r9, boolean r10) {
        /*
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r0 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r0)     // Catch:{ all -> 0x00e1 }
            java.lang.Boolean r1 = f3203b     // Catch:{ all -> 0x00de }
            if (r1 != 0) goto L_0x00b1
            android.content.Context r1 = r8.getApplicationContext()     // Catch:{ ClassNotFoundException -> 0x008e, IllegalAccessException -> 0x008c, NoSuchFieldException -> 0x008a }
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x008e, IllegalAccessException -> 0x008c, NoSuchFieldException -> 0x008a }
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader> r2 = com.google.android.gms.dynamite.DynamiteModule.DynamiteLoaderClassLoader.class
            java.lang.String r2 = r2.getName()     // Catch:{ ClassNotFoundException -> 0x008e, IllegalAccessException -> 0x008c, NoSuchFieldException -> 0x008a }
            java.lang.Class r1 = r1.loadClass(r2)     // Catch:{ ClassNotFoundException -> 0x008e, IllegalAccessException -> 0x008c, NoSuchFieldException -> 0x008a }
            java.lang.String r2 = "sClassLoader"
            java.lang.reflect.Field r2 = r1.getDeclaredField(r2)     // Catch:{ ClassNotFoundException -> 0x008e, IllegalAccessException -> 0x008c, NoSuchFieldException -> 0x008a }
            monitor-enter(r1)     // Catch:{ ClassNotFoundException -> 0x008e, IllegalAccessException -> 0x008c, NoSuchFieldException -> 0x008a }
            r3 = 0
            java.lang.Object r4 = r2.get(r3)     // Catch:{ all -> 0x0087 }
            java.lang.ClassLoader r4 = (java.lang.ClassLoader) r4     // Catch:{ all -> 0x0087 }
            if (r4 == 0) goto L_0x0038
            java.lang.ClassLoader r2 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x0087 }
            if (r4 != r2) goto L_0x0032
        L_0x002f:
            java.lang.Boolean r2 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0087 }
            goto L_0x0084
        L_0x0032:
            m4649g(r4)     // Catch:{ a -> 0x0035 }
        L_0x0035:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0087 }
            goto L_0x0084
        L_0x0038:
            java.lang.String r4 = "com.google.android.gms"
            android.content.Context r5 = r8.getApplicationContext()     // Catch:{ all -> 0x0087 }
            java.lang.String r5 = r5.getPackageName()     // Catch:{ all -> 0x0087 }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x0087 }
            if (r4 == 0) goto L_0x0050
            java.lang.ClassLoader r4 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x0087 }
            r2.set(r3, r4)     // Catch:{ all -> 0x0087 }
            goto L_0x002f
        L_0x0050:
            int r4 = m4653k(r8, r9, r10)     // Catch:{ a -> 0x007c }
            java.lang.String r5 = f3206e     // Catch:{ a -> 0x007c }
            if (r5 == 0) goto L_0x0079
            java.lang.String r5 = f3206e     // Catch:{ a -> 0x007c }
            boolean r5 = r5.isEmpty()     // Catch:{ a -> 0x007c }
            if (r5 == 0) goto L_0x0061
            goto L_0x0079
        L_0x0061:
            com.google.android.gms.dynamite.e r5 = new com.google.android.gms.dynamite.e     // Catch:{ a -> 0x007c }
            java.lang.String r6 = f3206e     // Catch:{ a -> 0x007c }
            java.lang.ClassLoader r7 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ a -> 0x007c }
            r5.<init>(r6, r7)     // Catch:{ a -> 0x007c }
            m4649g(r5)     // Catch:{ a -> 0x007c }
            r2.set(r3, r5)     // Catch:{ a -> 0x007c }
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch:{ a -> 0x007c }
            f3203b = r5     // Catch:{ a -> 0x007c }
            monitor-exit(r1)     // Catch:{ all -> 0x0087 }
            monitor-exit(r0)     // Catch:{ all -> 0x00de }
            return r4
        L_0x0079:
            monitor-exit(r1)     // Catch:{ all -> 0x0087 }
            monitor-exit(r0)     // Catch:{ all -> 0x00de }
            return r4
        L_0x007c:
            java.lang.ClassLoader r4 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x0087 }
            r2.set(r3, r4)     // Catch:{ all -> 0x0087 }
            goto L_0x002f
        L_0x0084:
            monitor-exit(r1)     // Catch:{ all -> 0x0087 }
            r1 = r2
            goto L_0x00af
        L_0x0087:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0087 }
            throw r2     // Catch:{ ClassNotFoundException -> 0x008e, IllegalAccessException -> 0x008c, NoSuchFieldException -> 0x008a }
        L_0x008a:
            r1 = move-exception
            goto L_0x008f
        L_0x008c:
            r1 = move-exception
            goto L_0x008f
        L_0x008e:
            r1 = move-exception
        L_0x008f:
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x00de }
            java.lang.String r2 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x00de }
            int r2 = r2.length()     // Catch:{ all -> 0x00de }
            int r2 = r2 + 30
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00de }
            r3.<init>(r2)     // Catch:{ all -> 0x00de }
            java.lang.String r2 = "Failed to load module via V2: "
            r3.append(r2)     // Catch:{ all -> 0x00de }
            r3.append(r1)     // Catch:{ all -> 0x00de }
            r3.toString()     // Catch:{ all -> 0x00de }
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x00de }
        L_0x00af:
            f3203b = r1     // Catch:{ all -> 0x00de }
        L_0x00b1:
            monitor-exit(r0)     // Catch:{ all -> 0x00de }
            boolean r0 = r1.booleanValue()     // Catch:{ all -> 0x00e1 }
            if (r0 == 0) goto L_0x00d9
            int r8 = m4653k(r8, r9, r10)     // Catch:{ a -> 0x00bd }
            return r8
        L_0x00bd:
            r9 = move-exception
            java.lang.String r10 = "Failed to retrieve remote module version: "
            java.lang.String r9 = r9.getMessage()     // Catch:{ all -> 0x00e1 }
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x00e1 }
            int r0 = r9.length()     // Catch:{ all -> 0x00e1 }
            if (r0 == 0) goto L_0x00d2
            r10.concat(r9)     // Catch:{ all -> 0x00e1 }
            goto L_0x00d7
        L_0x00d2:
            java.lang.String r9 = new java.lang.String     // Catch:{ all -> 0x00e1 }
            r9.<init>(r10)     // Catch:{ all -> 0x00e1 }
        L_0x00d7:
            r8 = 0
            return r8
        L_0x00d9:
            int r8 = m4651i(r8, r9, r10)     // Catch:{ all -> 0x00e1 }
            return r8
        L_0x00de:
            r9 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00de }
            throw r9     // Catch:{ all -> 0x00e1 }
        L_0x00e1:
            r9 = move-exception
            com.google.android.gms.common.util.C1653g.m4585a(r8, r9)
            goto L_0x00e7
        L_0x00e6:
            throw r9
        L_0x00e7:
            goto L_0x00e6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.m4647e(android.content.Context, java.lang.String, boolean):int");
    }

    /* renamed from: f */
    private static DynamiteModule m4648f(Context context, String str, int i) {
        Boolean bool;
        try {
            synchronized (DynamiteModule.class) {
                bool = f3203b;
            }
            if (bool == null) {
                throw new C1675a("Failed to determine which loading route to use.", (C1681a) null);
            } else if (bool.booleanValue()) {
                return m4652j(context, str, i);
            } else {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51);
                sb.append("Selected remote version of ");
                sb.append(str);
                sb.append(", version >= ");
                sb.append(i);
                sb.toString();
                C1686f m = m4655m(context);
                if (m != null) {
                    C0561a y0 = m.mo11393J0() >= 2 ? m.mo11397y0(C0564b.m335f(context), str, i) : m.mo11394P(C0564b.m335f(context), str, i);
                    if (C0564b.m334e(y0) != null) {
                        return new DynamiteModule((Context) C0564b.m334e(y0));
                    }
                    throw new C1675a("Failed to load remote module.", (C1681a) null);
                }
                throw new C1675a("Failed to create IDynamiteLoader.", (C1681a) null);
            }
        } catch (RemoteException e) {
            throw new C1675a("Failed to load remote module.", e, (C1681a) null);
        } catch (C1675a e2) {
            throw e2;
        } catch (Throwable th) {
            C1653g.m4585a(context, th);
            throw new C1675a("Failed to load remote module.", th, (C1681a) null);
        }
    }

    @GuardedBy("DynamiteModule.class")
    /* renamed from: g */
    private static void m4649g(ClassLoader classLoader) {
        C1688h hVar;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                hVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                hVar = queryLocalInterface instanceof C1688h ? (C1688h) queryLocalInterface : new C1689i(iBinder);
            }
            f3205d = hVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            throw new C1675a("Failed to instantiate dynamite loader", e, (C1681a) null);
        }
    }

    /* renamed from: h */
    private static Boolean m4650h() {
        Boolean valueOf;
        synchronized (DynamiteModule.class) {
            valueOf = Boolean.valueOf(f3207f >= 2);
        }
        return valueOf;
    }

    /* renamed from: i */
    private static int m4651i(Context context, String str, boolean z) {
        C1686f m = m4655m(context);
        if (m == null) {
            return 0;
        }
        try {
            return m.mo11393J0() >= 2 ? m.mo11395j0(C0564b.m335f(context), str, z) : m.mo11396t0(C0564b.m335f(context), str, z);
        } catch (RemoteException e) {
            String valueOf = String.valueOf(e.getMessage());
            if (valueOf.length() != 0) {
                "Failed to retrieve remote module version: ".concat(valueOf);
            } else {
                new String("Failed to retrieve remote module version: ");
            }
            return 0;
        }
    }

    /* renamed from: j */
    private static DynamiteModule m4652j(Context context, String str, int i) {
        C1688h hVar;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51);
        sb.append("Selected remote version of ");
        sb.append(str);
        sb.append(", version >= ");
        sb.append(i);
        sb.toString();
        synchronized (DynamiteModule.class) {
            hVar = f3205d;
        }
        if (hVar != null) {
            C1679c cVar = f3208g.get();
            if (cVar == null || cVar.f3217a == null) {
                throw new C1675a("No result cursor", (C1681a) null);
            }
            Context applicationContext = context.getApplicationContext();
            Cursor cursor = cVar.f3217a;
            C0564b.m335f(null);
            boolean booleanValue = m4650h().booleanValue();
            C0561a f = C0564b.m335f(applicationContext);
            C0561a f2 = C0564b.m335f(cursor);
            Context context2 = (Context) C0564b.m334e(booleanValue ? hVar.mo11399u(f, str, i, f2) : hVar.mo11398s(f, str, i, f2));
            if (context2 != null) {
                return new DynamiteModule(context2);
            }
            throw new C1675a("Failed to get module context", (C1681a) null);
        }
        throw new C1675a("DynamiteLoaderV2 was not cached.", (C1681a) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00a9  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m4653k(android.content.Context r8, java.lang.String r9, boolean r10) {
        /*
            r0 = 0
            android.content.ContentResolver r1 = r8.getContentResolver()     // Catch:{ Exception -> 0x0096, all -> 0x0094 }
            if (r10 == 0) goto L_0x000a
            java.lang.String r8 = "api_force_staging"
            goto L_0x000c
        L_0x000a:
            java.lang.String r8 = "api"
        L_0x000c:
            int r10 = r8.length()     // Catch:{ Exception -> 0x0096, all -> 0x0094 }
            int r10 = r10 + 42
            java.lang.String r2 = java.lang.String.valueOf(r9)     // Catch:{ Exception -> 0x0096, all -> 0x0094 }
            int r2 = r2.length()     // Catch:{ Exception -> 0x0096, all -> 0x0094 }
            int r10 = r10 + r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0096, all -> 0x0094 }
            r2.<init>(r10)     // Catch:{ Exception -> 0x0096, all -> 0x0094 }
            java.lang.String r10 = "content://com.google.android.gms.chimera/"
            r2.append(r10)     // Catch:{ Exception -> 0x0096, all -> 0x0094 }
            r2.append(r8)     // Catch:{ Exception -> 0x0096, all -> 0x0094 }
            java.lang.String r8 = "/"
            r2.append(r8)     // Catch:{ Exception -> 0x0096, all -> 0x0094 }
            r2.append(r9)     // Catch:{ Exception -> 0x0096, all -> 0x0094 }
            java.lang.String r8 = r2.toString()     // Catch:{ Exception -> 0x0096, all -> 0x0094 }
            android.net.Uri r2 = android.net.Uri.parse(r8)     // Catch:{ Exception -> 0x0096, all -> 0x0094 }
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            android.database.Cursor r8 = r1.query(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x0096, all -> 0x0094 }
            if (r8 == 0) goto L_0x008c
            boolean r9 = r8.moveToFirst()     // Catch:{ Exception -> 0x0087, all -> 0x0083 }
            if (r9 == 0) goto L_0x008c
            r9 = 0
            int r9 = r8.getInt(r9)     // Catch:{ Exception -> 0x0087, all -> 0x0083 }
            if (r9 <= 0) goto L_0x007c
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r10 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r10)     // Catch:{ Exception -> 0x0087, all -> 0x0083 }
            r1 = 2
            java.lang.String r1 = r8.getString(r1)     // Catch:{ all -> 0x0079 }
            f3206e = r1     // Catch:{ all -> 0x0079 }
            java.lang.String r1 = "loaderVersion"
            int r1 = r8.getColumnIndex(r1)     // Catch:{ all -> 0x0079 }
            if (r1 < 0) goto L_0x0067
            int r1 = r8.getInt(r1)     // Catch:{ all -> 0x0079 }
            f3207f = r1     // Catch:{ all -> 0x0079 }
        L_0x0067:
            monitor-exit(r10)     // Catch:{ all -> 0x0079 }
            java.lang.ThreadLocal<com.google.android.gms.dynamite.DynamiteModule$c> r10 = f3208g     // Catch:{ Exception -> 0x0087, all -> 0x0083 }
            java.lang.Object r10 = r10.get()     // Catch:{ Exception -> 0x0087, all -> 0x0083 }
            com.google.android.gms.dynamite.DynamiteModule$c r10 = (com.google.android.gms.dynamite.DynamiteModule.C1679c) r10     // Catch:{ Exception -> 0x0087, all -> 0x0083 }
            if (r10 == 0) goto L_0x007c
            android.database.Cursor r1 = r10.f3217a     // Catch:{ Exception -> 0x0087, all -> 0x0083 }
            if (r1 != 0) goto L_0x007c
            r10.f3217a = r8     // Catch:{ Exception -> 0x0087, all -> 0x0083 }
            goto L_0x007d
        L_0x0079:
            r9 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0079 }
            throw r9     // Catch:{ Exception -> 0x0087, all -> 0x0083 }
        L_0x007c:
            r0 = r8
        L_0x007d:
            if (r0 == 0) goto L_0x0082
            r0.close()
        L_0x0082:
            return r9
        L_0x0083:
            r9 = move-exception
            r0 = r8
            r8 = r9
            goto L_0x00a7
        L_0x0087:
            r9 = move-exception
            r7 = r9
            r9 = r8
            r8 = r7
            goto L_0x0098
        L_0x008c:
            com.google.android.gms.dynamite.DynamiteModule$a r9 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ Exception -> 0x0087, all -> 0x0083 }
            java.lang.String r10 = "Failed to connect to dynamite module ContentResolver."
            r9.<init>((java.lang.String) r10, (com.google.android.gms.dynamite.C1681a) r0)     // Catch:{ Exception -> 0x0087, all -> 0x0083 }
            throw r9     // Catch:{ Exception -> 0x0087, all -> 0x0083 }
        L_0x0094:
            r8 = move-exception
            goto L_0x00a7
        L_0x0096:
            r8 = move-exception
            r9 = r0
        L_0x0098:
            boolean r10 = r8 instanceof com.google.android.gms.dynamite.DynamiteModule.C1675a     // Catch:{ all -> 0x00a5 }
            if (r10 == 0) goto L_0x009d
            throw r8     // Catch:{ all -> 0x00a5 }
        L_0x009d:
            com.google.android.gms.dynamite.DynamiteModule$a r10 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ all -> 0x00a5 }
            java.lang.String r1 = "V2 version check failed"
            r10.<init>(r1, r8, r0)     // Catch:{ all -> 0x00a5 }
            throw r10     // Catch:{ all -> 0x00a5 }
        L_0x00a5:
            r8 = move-exception
            r0 = r9
        L_0x00a7:
            if (r0 == 0) goto L_0x00ac
            r0.close()
        L_0x00ac:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.m4653k(android.content.Context, java.lang.String, boolean):int");
    }

    /* renamed from: l */
    private static DynamiteModule m4654l(Context context, String str) {
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            "Selected local version of ".concat(valueOf);
        } else {
            new String("Selected local version of ");
        }
        return new DynamiteModule(context.getApplicationContext());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0066, code lost:
        return null;
     */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.android.gms.dynamite.C1686f m4655m(android.content.Context r4) {
        /*
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r0 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r0)
            com.google.android.gms.dynamite.f r1 = f3204c     // Catch:{ all -> 0x0067 }
            if (r1 == 0) goto L_0x000b
            com.google.android.gms.dynamite.f r4 = f3204c     // Catch:{ all -> 0x0067 }
            monitor-exit(r0)     // Catch:{ all -> 0x0067 }
            return r4
        L_0x000b:
            com.google.android.gms.common.d r1 = com.google.android.gms.common.C1520d.m4113h()     // Catch:{ all -> 0x0067 }
            int r1 = r1.mo11044i(r4)     // Catch:{ all -> 0x0067 }
            r2 = 0
            if (r1 == 0) goto L_0x0018
            monitor-exit(r0)     // Catch:{ all -> 0x0067 }
            return r2
        L_0x0018:
            java.lang.String r1 = "com.google.android.gms"
            r3 = 3
            android.content.Context r4 = r4.createPackageContext(r1, r3)     // Catch:{ Exception -> 0x004b }
            java.lang.ClassLoader r4 = r4.getClassLoader()     // Catch:{ Exception -> 0x004b }
            java.lang.String r1 = "com.google.android.gms.chimera.container.DynamiteLoaderImpl"
            java.lang.Class r4 = r4.loadClass(r1)     // Catch:{ Exception -> 0x004b }
            java.lang.Object r4 = r4.newInstance()     // Catch:{ Exception -> 0x004b }
            android.os.IBinder r4 = (android.os.IBinder) r4     // Catch:{ Exception -> 0x004b }
            if (r4 != 0) goto L_0x0033
            r1 = r2
            goto L_0x0045
        L_0x0033:
            java.lang.String r1 = "com.google.android.gms.dynamite.IDynamiteLoader"
            android.os.IInterface r1 = r4.queryLocalInterface(r1)     // Catch:{ Exception -> 0x004b }
            boolean r3 = r1 instanceof com.google.android.gms.dynamite.C1686f     // Catch:{ Exception -> 0x004b }
            if (r3 == 0) goto L_0x0040
            com.google.android.gms.dynamite.f r1 = (com.google.android.gms.dynamite.C1686f) r1     // Catch:{ Exception -> 0x004b }
            goto L_0x0045
        L_0x0040:
            com.google.android.gms.dynamite.g r1 = new com.google.android.gms.dynamite.g     // Catch:{ Exception -> 0x004b }
            r1.<init>(r4)     // Catch:{ Exception -> 0x004b }
        L_0x0045:
            if (r1 == 0) goto L_0x0065
            f3204c = r1     // Catch:{ Exception -> 0x004b }
            monitor-exit(r0)     // Catch:{ all -> 0x0067 }
            return r1
        L_0x004b:
            r4 = move-exception
            java.lang.String r1 = "Failed to load IDynamiteLoader from GmsCore: "
            java.lang.String r4 = r4.getMessage()     // Catch:{ all -> 0x0067 }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x0067 }
            int r3 = r4.length()     // Catch:{ all -> 0x0067 }
            if (r3 == 0) goto L_0x0060
            r1.concat(r4)     // Catch:{ all -> 0x0067 }
            goto L_0x0065
        L_0x0060:
            java.lang.String r4 = new java.lang.String     // Catch:{ all -> 0x0067 }
            r4.<init>(r1)     // Catch:{ all -> 0x0067 }
        L_0x0065:
            monitor-exit(r0)     // Catch:{ all -> 0x0067 }
            return r2
        L_0x0067:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0067 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.m4655m(android.content.Context):com.google.android.gms.dynamite.f");
    }

    @KeepForSdk
    /* renamed from: c */
    public final IBinder mo11388c(String str) {
        try {
            return (IBinder) this.f3213a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            String valueOf = String.valueOf(str);
            throw new C1675a(valueOf.length() != 0 ? "Failed to instantiate module class: ".concat(valueOf) : new String("Failed to instantiate module class: "), e, (C1681a) null);
        }
    }
}
