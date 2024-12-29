package com.google.firebase.iid;

import android.os.IBinder;

/* renamed from: com.google.firebase.iid.k */
final /* synthetic */ class C3233k implements Runnable {

    /* renamed from: a */
    private final C3219f f6252a;

    /* renamed from: b */
    private final IBinder f6253b;

    C3233k(C3219f fVar, IBinder iBinder) {
        this.f6252a = fVar;
        this.f6253b = iBinder;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x001e, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0020, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0021, code lost:
        r0.mo17822c(0, r1.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0029, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x002b, code lost:
        throw r1;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:5:0x000a, B:9:0x000f] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r4 = this;
            com.google.firebase.iid.f r0 = r4.f6252a
            android.os.IBinder r1 = r4.f6253b
            monitor-enter(r0)
            r2 = 0
            if (r1 != 0) goto L_0x000f
            java.lang.String r1 = "Null service connection"
            r0.mo17822c(r2, r1)     // Catch:{ all -> 0x001e }
            monitor-exit(r0)     // Catch:{ all -> 0x001e }
            return
        L_0x000f:
            com.google.firebase.iid.n r3 = new com.google.firebase.iid.n     // Catch:{ RemoteException -> 0x0020 }
            r3.<init>(r1)     // Catch:{ RemoteException -> 0x0020 }
            r0.f6235c = r3     // Catch:{ RemoteException -> 0x0020 }
            r1 = 2
            r0.f6233a = r1     // Catch:{ all -> 0x001e }
            r0.mo17820a()     // Catch:{ all -> 0x001e }
            monitor-exit(r0)     // Catch:{ all -> 0x001e }
            return
        L_0x001e:
            r1 = move-exception
            goto L_0x002a
        L_0x0020:
            r1 = move-exception
            java.lang.String r1 = r1.getMessage()     // Catch:{ all -> 0x001e }
            r0.mo17822c(r2, r1)     // Catch:{ all -> 0x001e }
            monitor-exit(r0)     // Catch:{ all -> 0x001e }
            return
        L_0x002a:
            monitor-exit(r0)     // Catch:{ all -> 0x001e }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.C3233k.run():void");
    }
}
