package com.google.p019vr.dynamite.client;

import android.content.Context;
import android.os.IBinder;
import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.vr.dynamite.client.d */
final class C2542d {

    /* renamed from: a */
    private Context f4288a;

    /* renamed from: b */
    private ILoadedInstanceCreator f4289b;

    /* renamed from: c */
    private final C2543e f4290c;

    public C2542d(C2543e eVar) {
        this.f4290c = eVar;
    }

    /* renamed from: a */
    private static IBinder m6870a(ClassLoader classLoader, String str) {
        try {
            return (IBinder) classLoader.loadClass(str).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (NoSuchMethodException e) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "No constructor for dynamic class ".concat(valueOf) : new String("No constructor for dynamic class "), e);
        } catch (InvocationTargetException e2) {
            String valueOf2 = String.valueOf(str);
            throw new IllegalStateException(valueOf2.length() != 0 ? "Unable to invoke constructor of dynamic class ".concat(valueOf2) : new String("Unable to invoke constructor of dynamic class "), e2);
        } catch (ClassNotFoundException e3) {
            String valueOf3 = String.valueOf(str);
            throw new IllegalStateException(valueOf3.length() != 0 ? "Unable to find dynamic class ".concat(valueOf3) : new String("Unable to find dynamic class "), e3);
        } catch (InstantiationException e4) {
            String valueOf4 = String.valueOf(str);
            throw new IllegalStateException(valueOf4.length() != 0 ? "Unable to instantiate the remote class ".concat(valueOf4) : new String("Unable to instantiate the remote class "), e4);
        } catch (IllegalAccessException e5) {
            String valueOf5 = String.valueOf(str);
            throw new IllegalStateException(valueOf5.length() != 0 ? "Unable to call the default constructor of ".concat(valueOf5) : new String("Unable to call the default constructor of "), e5);
        }
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.google.p019vr.dynamite.client.ILoadedInstanceCreator mo19439b(android.content.Context r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            com.google.vr.dynamite.client.ILoadedInstanceCreator r0 = r2.f4289b     // Catch:{ all -> 0x0031 }
            if (r0 != 0) goto L_0x002d
            android.content.Context r3 = r2.mo19440c(r3)     // Catch:{ all -> 0x0031 }
            java.lang.ClassLoader r3 = r3.getClassLoader()     // Catch:{ all -> 0x0031 }
            java.lang.String r0 = "com.google.vr.dynamite.LoadedInstanceCreator"
            android.os.IBinder r3 = m6870a(r3, r0)     // Catch:{ all -> 0x0031 }
            if (r3 != 0) goto L_0x0017
            r3 = 0
            goto L_0x002b
        L_0x0017:
            java.lang.String r0 = "com.google.vr.dynamite.client.ILoadedInstanceCreator"
            android.os.IInterface r0 = r3.queryLocalInterface(r0)     // Catch:{ all -> 0x0031 }
            boolean r1 = r0 instanceof com.google.p019vr.dynamite.client.ILoadedInstanceCreator     // Catch:{ all -> 0x0031 }
            if (r1 == 0) goto L_0x0025
            r3 = r0
            com.google.vr.dynamite.client.ILoadedInstanceCreator r3 = (com.google.p019vr.dynamite.client.ILoadedInstanceCreator) r3     // Catch:{ all -> 0x0031 }
            goto L_0x002b
        L_0x0025:
            com.google.vr.dynamite.client.a r0 = new com.google.vr.dynamite.client.a     // Catch:{ all -> 0x0031 }
            r0.<init>(r3)     // Catch:{ all -> 0x0031 }
            r3 = r0
        L_0x002b:
            r2.f4289b = r3     // Catch:{ all -> 0x0031 }
        L_0x002d:
            com.google.vr.dynamite.client.ILoadedInstanceCreator r3 = r2.f4289b     // Catch:{ all -> 0x0031 }
            monitor-exit(r2)
            return r3
        L_0x0031:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.p019vr.dynamite.client.C2542d.mo19439b(android.content.Context):com.google.vr.dynamite.client.ILoadedInstanceCreator");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:4|5|6|7|8) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0013 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized android.content.Context mo19440c(android.content.Context r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            android.content.Context r0 = r2.f4288a     // Catch:{ all -> 0x001e }
            if (r0 != 0) goto L_0x001a
            com.google.vr.dynamite.client.e r0 = r2.f4290c     // Catch:{ NameNotFoundException -> 0x0013 }
            java.lang.String r0 = r0.mo19441a()     // Catch:{ NameNotFoundException -> 0x0013 }
            r1 = 3
            android.content.Context r3 = r3.createPackageContext(r0, r1)     // Catch:{ NameNotFoundException -> 0x0013 }
            r2.f4288a = r3     // Catch:{ NameNotFoundException -> 0x0013 }
            goto L_0x001a
        L_0x0013:
            com.google.vr.dynamite.client.c r3 = new com.google.vr.dynamite.client.c     // Catch:{ all -> 0x001e }
            r0 = 1
            r3.<init>(r0)     // Catch:{ all -> 0x001e }
            throw r3     // Catch:{ all -> 0x001e }
        L_0x001a:
            android.content.Context r3 = r2.f4288a     // Catch:{ all -> 0x001e }
            monitor-exit(r2)
            return r3
        L_0x001e:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.p019vr.dynamite.client.C2542d.mo19440c(android.content.Context):android.content.Context");
    }
}
