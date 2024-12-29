package com.google.p139vr.dynamite.client;

import android.content.Context;
import android.util.ArrayMap;
import dalvik.system.DexClassLoader;

@UsedByNative
/* renamed from: com.google.vr.dynamite.client.DynamiteClient */
public final class DynamiteClient {

    /* renamed from: a */
    private static final ArrayMap<C3328e, C3327d> f6427a = new ArrayMap<>();

    private DynamiteClient() {
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:36|37|38|39) */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        r6 = java.lang.String.valueOf(r1);
        r9 = new java.lang.StringBuilder(java.lang.String.valueOf(r6).length() + 54);
        r9.append("Failed to load native library ");
        r9.append(r6);
        r9.append(" from remote package:\n  ");
        r9.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00e5, code lost:
        return -1;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:36:0x00c1 */
    @com.google.p139vr.dynamite.client.UsedByNative
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized int checkVersion(android.content.Context r6, java.lang.String r7, java.lang.String r8, java.lang.String r9) {
        /*
            java.lang.Class<com.google.vr.dynamite.client.DynamiteClient> r0 = com.google.p139vr.dynamite.client.DynamiteClient.class
            monitor-enter(r0)
            r1 = 0
            if (r9 == 0) goto L_0x0057
            boolean r2 = r9.isEmpty()     // Catch:{ all -> 0x0054 }
            if (r2 == 0) goto L_0x000d
            goto L_0x0057
        L_0x000d:
            java.lang.String r2 = "(\\d+)\\.(\\d+)\\.(\\d+)"
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)     // Catch:{ all -> 0x0054 }
            java.util.regex.Matcher r2 = r2.matcher(r9)     // Catch:{ all -> 0x0054 }
            boolean r3 = r2.matches()     // Catch:{ all -> 0x0054 }
            if (r3 != 0) goto L_0x0033
            java.lang.String r2 = "Failed to parse version from: "
            java.lang.String r3 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x0054 }
            int r4 = r3.length()     // Catch:{ all -> 0x0054 }
            if (r4 == 0) goto L_0x002d
            r2.concat(r3)     // Catch:{ all -> 0x0054 }
            goto L_0x0057
        L_0x002d:
            java.lang.String r3 = new java.lang.String     // Catch:{ all -> 0x0054 }
            r3.<init>(r2)     // Catch:{ all -> 0x0054 }
            goto L_0x0057
        L_0x0033:
            com.google.vr.dynamite.client.f r1 = new com.google.vr.dynamite.client.f     // Catch:{ all -> 0x0054 }
            r3 = 1
            java.lang.String r3 = r2.group(r3)     // Catch:{ all -> 0x0054 }
            int r3 = java.lang.Integer.parseInt(r3)     // Catch:{ all -> 0x0054 }
            r4 = 2
            java.lang.String r4 = r2.group(r4)     // Catch:{ all -> 0x0054 }
            int r4 = java.lang.Integer.parseInt(r4)     // Catch:{ all -> 0x0054 }
            r5 = 3
            java.lang.String r2 = r2.group(r5)     // Catch:{ all -> 0x0054 }
            int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ all -> 0x0054 }
            r1.<init>(r3, r4, r2)     // Catch:{ all -> 0x0054 }
            goto L_0x0057
        L_0x0054:
            r6 = move-exception
            goto L_0x00e6
        L_0x0057:
            if (r1 != 0) goto L_0x0076
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0054 }
            java.lang.String r7 = "Improperly formatted minVersion string: "
            java.lang.String r8 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x0054 }
            int r9 = r8.length()     // Catch:{ all -> 0x0054 }
            if (r9 == 0) goto L_0x006c
            java.lang.String r7 = r7.concat(r8)     // Catch:{ all -> 0x0054 }
            goto L_0x0072
        L_0x006c:
            java.lang.String r8 = new java.lang.String     // Catch:{ all -> 0x0054 }
            r8.<init>(r7)     // Catch:{ all -> 0x0054 }
            r7 = r8
        L_0x0072:
            r6.<init>(r7)     // Catch:{ all -> 0x0054 }
            throw r6     // Catch:{ all -> 0x0054 }
        L_0x0076:
            com.google.vr.dynamite.client.e r1 = new com.google.vr.dynamite.client.e     // Catch:{ all -> 0x0054 }
            r1.<init>(r7, r8)     // Catch:{ all -> 0x0054 }
            com.google.vr.dynamite.client.d r7 = getRemoteLibraryLoaderFromInfo(r1)     // Catch:{ all -> 0x0054 }
            r8 = -1
            android.content.Context r2 = r7.mo18069c(r6)     // Catch:{ RemoteException | c | IllegalArgumentException | IllegalStateException | SecurityException | UnsatisfiedLinkError -> 0x00c1 }
            com.google.vr.dynamite.client.ILoadedInstanceCreator r7 = r7.mo18068b(r6)     // Catch:{ RemoteException | c | IllegalArgumentException | IllegalStateException | SecurityException | UnsatisfiedLinkError -> 0x00c1 }
            com.google.vr.dynamite.client.IObjectWrapper r2 = com.google.p139vr.dynamite.client.ObjectWrapper.m10322c(r2)     // Catch:{ RemoteException | c | IllegalArgumentException | IllegalStateException | SecurityException | UnsatisfiedLinkError -> 0x00c1 }
            com.google.vr.dynamite.client.IObjectWrapper r6 = com.google.p139vr.dynamite.client.ObjectWrapper.m10322c(r6)     // Catch:{ RemoteException | c | IllegalArgumentException | IllegalStateException | SecurityException | UnsatisfiedLinkError -> 0x00c1 }
            com.google.vr.dynamite.client.INativeLibraryLoader r6 = r7.newNativeLibraryLoader(r2, r6)     // Catch:{ RemoteException | c | IllegalArgumentException | IllegalStateException | SecurityException | UnsatisfiedLinkError -> 0x00c1 }
            if (r6 != 0) goto L_0x00bb
            java.lang.String r6 = java.lang.String.valueOf(r1)     // Catch:{ RemoteException | c | IllegalArgumentException | IllegalStateException | SecurityException | UnsatisfiedLinkError -> 0x00c1 }
            java.lang.String r7 = java.lang.String.valueOf(r6)     // Catch:{ RemoteException | c | IllegalArgumentException | IllegalStateException | SecurityException | UnsatisfiedLinkError -> 0x00c1 }
            int r7 = r7.length()     // Catch:{ RemoteException | c | IllegalArgumentException | IllegalStateException | SecurityException | UnsatisfiedLinkError -> 0x00c1 }
            int r7 = r7 + 72
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ RemoteException | c | IllegalArgumentException | IllegalStateException | SecurityException | UnsatisfiedLinkError -> 0x00c1 }
            r9.<init>(r7)     // Catch:{ RemoteException | c | IllegalArgumentException | IllegalStateException | SecurityException | UnsatisfiedLinkError -> 0x00c1 }
            java.lang.String r7 = "Failed to load native library "
            r9.append(r7)     // Catch:{ RemoteException | c | IllegalArgumentException | IllegalStateException | SecurityException | UnsatisfiedLinkError -> 0x00c1 }
            r9.append(r6)     // Catch:{ RemoteException | c | IllegalArgumentException | IllegalStateException | SecurityException | UnsatisfiedLinkError -> 0x00c1 }
            java.lang.String r6 = " from remote package: no loader available."
            r9.append(r6)     // Catch:{ RemoteException | c | IllegalArgumentException | IllegalStateException | SecurityException | UnsatisfiedLinkError -> 0x00c1 }
            r9.toString()     // Catch:{ RemoteException | c | IllegalArgumentException | IllegalStateException | SecurityException | UnsatisfiedLinkError -> 0x00c1 }
            monitor-exit(r0)
            return r8
        L_0x00bb:
            int r6 = r6.checkVersion(r9)     // Catch:{ RemoteException | c | IllegalArgumentException | IllegalStateException | SecurityException | UnsatisfiedLinkError -> 0x00c1 }
            monitor-exit(r0)
            return r6
        L_0x00c1:
            java.lang.String r6 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x0054 }
            java.lang.String r7 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x0054 }
            int r7 = r7.length()     // Catch:{ all -> 0x0054 }
            int r7 = r7 + 54
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x0054 }
            r9.<init>(r7)     // Catch:{ all -> 0x0054 }
            java.lang.String r7 = "Failed to load native library "
            r9.append(r7)     // Catch:{ all -> 0x0054 }
            r9.append(r6)     // Catch:{ all -> 0x0054 }
            java.lang.String r6 = " from remote package:\n  "
            r9.append(r6)     // Catch:{ all -> 0x0054 }
            r9.toString()     // Catch:{ all -> 0x0054 }
            monitor-exit(r0)
            return r8
        L_0x00e6:
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.p139vr.dynamite.client.DynamiteClient.checkVersion(android.content.Context, java.lang.String, java.lang.String, java.lang.String):int");
    }

    @UsedByNative
    public static synchronized ClassLoader getRemoteClassLoader(Context context, String str, String str2) {
        synchronized (DynamiteClient.class) {
            Context remoteContext = getRemoteContext(context, str, str2);
            if (remoteContext == null) {
                return null;
            }
            ClassLoader classLoader = remoteContext.getClassLoader();
            return classLoader;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:8|9|10|11|12) */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0037, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        r2 = java.lang.String.valueOf(r1);
        r4 = new java.lang.StringBuilder(java.lang.String.valueOf(r2).length() + 52);
        r4.append("Failed to get remote Context");
        r4.append(r2);
        r4.append(" from remote package:\n  ");
        r4.toString();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0012 */
    @com.google.p139vr.dynamite.client.UsedByNative
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized android.content.Context getRemoteContext(android.content.Context r2, java.lang.String r3, java.lang.String r4) {
        /*
            java.lang.Class<com.google.vr.dynamite.client.DynamiteClient> r0 = com.google.p139vr.dynamite.client.DynamiteClient.class
            monitor-enter(r0)
            com.google.vr.dynamite.client.e r1 = new com.google.vr.dynamite.client.e     // Catch:{ all -> 0x0038 }
            r1.<init>(r3, r4)     // Catch:{ all -> 0x0038 }
            com.google.vr.dynamite.client.d r3 = getRemoteLibraryLoaderFromInfo(r1)     // Catch:{ all -> 0x0038 }
            android.content.Context r2 = r3.mo18069c(r2)     // Catch:{ c -> 0x0012 }
            monitor-exit(r0)
            return r2
        L_0x0012:
            java.lang.String r2 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x0038 }
            java.lang.String r3 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x0038 }
            int r3 = r3.length()     // Catch:{ all -> 0x0038 }
            int r3 = r3 + 52
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0038 }
            r4.<init>(r3)     // Catch:{ all -> 0x0038 }
            java.lang.String r3 = "Failed to get remote Context"
            r4.append(r3)     // Catch:{ all -> 0x0038 }
            r4.append(r2)     // Catch:{ all -> 0x0038 }
            java.lang.String r2 = " from remote package:\n  "
            r4.append(r2)     // Catch:{ all -> 0x0038 }
            r4.toString()     // Catch:{ all -> 0x0038 }
            r2 = 0
            monitor-exit(r0)
            return r2
        L_0x0038:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.p139vr.dynamite.client.DynamiteClient.getRemoteContext(android.content.Context, java.lang.String, java.lang.String):android.content.Context");
    }

    @UsedByNative
    public static synchronized ClassLoader getRemoteDexClassLoader(Context context, String str) {
        synchronized (DynamiteClient.class) {
            Context remoteContext = getRemoteContext(context, str, (String) null);
            if (remoteContext == null) {
                return null;
            }
            try {
                DexClassLoader dexClassLoader = new DexClassLoader(remoteContext.getPackageCodePath(), context.getCodeCacheDir().getAbsolutePath(), remoteContext.getApplicationInfo().nativeLibraryDir, context.getClassLoader());
                return dexClassLoader;
            } catch (RuntimeException unused) {
                return null;
            }
        }
    }

    @UsedByNative
    private static synchronized C3327d getRemoteLibraryLoaderFromInfo(C3328e eVar) {
        C3327d dVar;
        synchronized (DynamiteClient.class) {
            dVar = f6427a.get(eVar);
            if (dVar == null) {
                dVar = new C3327d(eVar);
                f6427a.put(eVar, dVar);
            }
        }
        return dVar;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:15|16|17|18) */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r5 = java.lang.String.valueOf(r1);
        r7 = new java.lang.StringBuilder(java.lang.String.valueOf(r5).length() + 54);
        r7.append("Failed to load native library ");
        r7.append(r5);
        r7.append(" from remote package:\n  ");
        r7.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0073, code lost:
        return 0;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x004f */
    @com.google.p139vr.dynamite.client.UsedByNative
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized long loadNativeRemoteLibrary(android.content.Context r5, java.lang.String r6, java.lang.String r7) {
        /*
            java.lang.Class<com.google.vr.dynamite.client.DynamiteClient> r0 = com.google.p139vr.dynamite.client.DynamiteClient.class
            monitor-enter(r0)
            com.google.vr.dynamite.client.e r1 = new com.google.vr.dynamite.client.e     // Catch:{ all -> 0x0074 }
            r1.<init>(r6, r7)     // Catch:{ all -> 0x0074 }
            com.google.vr.dynamite.client.d r6 = getRemoteLibraryLoaderFromInfo(r1)     // Catch:{ all -> 0x0074 }
            r2 = 0
            android.content.Context r4 = r6.mo18069c(r5)     // Catch:{ RemoteException | c | IllegalArgumentException | IllegalStateException | SecurityException | UnsatisfiedLinkError -> 0x004f }
            com.google.vr.dynamite.client.ILoadedInstanceCreator r6 = r6.mo18068b(r5)     // Catch:{ RemoteException | c | IllegalArgumentException | IllegalStateException | SecurityException | UnsatisfiedLinkError -> 0x004f }
            com.google.vr.dynamite.client.IObjectWrapper r4 = com.google.p139vr.dynamite.client.ObjectWrapper.m10322c(r4)     // Catch:{ RemoteException | c | IllegalArgumentException | IllegalStateException | SecurityException | UnsatisfiedLinkError -> 0x004f }
            com.google.vr.dynamite.client.IObjectWrapper r5 = com.google.p139vr.dynamite.client.ObjectWrapper.m10322c(r5)     // Catch:{ RemoteException | c | IllegalArgumentException | IllegalStateException | SecurityException | UnsatisfiedLinkError -> 0x004f }
            com.google.vr.dynamite.client.INativeLibraryLoader r5 = r6.newNativeLibraryLoader(r4, r5)     // Catch:{ RemoteException | c | IllegalArgumentException | IllegalStateException | SecurityException | UnsatisfiedLinkError -> 0x004f }
            if (r5 != 0) goto L_0x0049
            java.lang.String r5 = java.lang.String.valueOf(r1)     // Catch:{ RemoteException | c | IllegalArgumentException | IllegalStateException | SecurityException | UnsatisfiedLinkError -> 0x004f }
            java.lang.String r6 = java.lang.String.valueOf(r5)     // Catch:{ RemoteException | c | IllegalArgumentException | IllegalStateException | SecurityException | UnsatisfiedLinkError -> 0x004f }
            int r6 = r6.length()     // Catch:{ RemoteException | c | IllegalArgumentException | IllegalStateException | SecurityException | UnsatisfiedLinkError -> 0x004f }
            int r6 = r6 + 72
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ RemoteException | c | IllegalArgumentException | IllegalStateException | SecurityException | UnsatisfiedLinkError -> 0x004f }
            r7.<init>(r6)     // Catch:{ RemoteException | c | IllegalArgumentException | IllegalStateException | SecurityException | UnsatisfiedLinkError -> 0x004f }
            java.lang.String r6 = "Failed to load native library "
            r7.append(r6)     // Catch:{ RemoteException | c | IllegalArgumentException | IllegalStateException | SecurityException | UnsatisfiedLinkError -> 0x004f }
            r7.append(r5)     // Catch:{ RemoteException | c | IllegalArgumentException | IllegalStateException | SecurityException | UnsatisfiedLinkError -> 0x004f }
            java.lang.String r5 = " from remote package: no loader available."
            r7.append(r5)     // Catch:{ RemoteException | c | IllegalArgumentException | IllegalStateException | SecurityException | UnsatisfiedLinkError -> 0x004f }
            r7.toString()     // Catch:{ RemoteException | c | IllegalArgumentException | IllegalStateException | SecurityException | UnsatisfiedLinkError -> 0x004f }
            monitor-exit(r0)
            return r2
        L_0x0049:
            long r5 = r5.initializeAndLoadNativeLibrary(r7)     // Catch:{ RemoteException | c | IllegalArgumentException | IllegalStateException | SecurityException | UnsatisfiedLinkError -> 0x004f }
            monitor-exit(r0)
            return r5
        L_0x004f:
            java.lang.String r5 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x0074 }
            java.lang.String r6 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x0074 }
            int r6 = r6.length()     // Catch:{ all -> 0x0074 }
            int r6 = r6 + 54
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0074 }
            r7.<init>(r6)     // Catch:{ all -> 0x0074 }
            java.lang.String r6 = "Failed to load native library "
            r7.append(r6)     // Catch:{ all -> 0x0074 }
            r7.append(r5)     // Catch:{ all -> 0x0074 }
            java.lang.String r5 = " from remote package:\n  "
            r7.append(r5)     // Catch:{ all -> 0x0074 }
            r7.toString()     // Catch:{ all -> 0x0074 }
            monitor-exit(r0)
            return r2
        L_0x0074:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.p139vr.dynamite.client.DynamiteClient.loadNativeRemoteLibrary(android.content.Context, java.lang.String, java.lang.String):long");
    }
}
