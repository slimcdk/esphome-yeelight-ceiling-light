package com.google.firebase.iid;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import androidx.annotation.MainThread;
import com.google.android.gms.common.stats.C1640a;
import java.util.ArrayDeque;
import java.util.Queue;
import javax.annotation.concurrent.GuardedBy;
import p011c.p012a.p019b.p028b.p032c.p035c.C0579e;

/* renamed from: com.google.firebase.iid.f */
final class C3219f implements ServiceConnection {
    @GuardedBy("this")

    /* renamed from: a */
    int f6233a;

    /* renamed from: b */
    final Messenger f6234b;

    /* renamed from: c */
    C3239n f6235c;
    @GuardedBy("this")

    /* renamed from: d */
    final Queue<C3243p<?>> f6236d;
    @GuardedBy("this")

    /* renamed from: e */
    final SparseArray<C3243p<?>> f6237e;

    /* renamed from: f */
    final /* synthetic */ C3216e f6238f;

    private C3219f(C3216e eVar) {
        this.f6238f = eVar;
        this.f6233a = 0;
        this.f6234b = new Messenger(new C0579e(Looper.getMainLooper(), new C3228i(this)));
        this.f6236d = new ArrayDeque();
        this.f6237e = new SparseArray<>();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo17820a() {
        this.f6238f.f6227b.execute(new C3231j(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized void mo17821b(int i) {
        C3243p pVar = this.f6237e.get(i);
        if (pVar != null) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("Timing out request: ");
            sb.append(i);
            sb.toString();
            this.f6237e.remove(i);
            pVar.mo17851b(new C3241o(3, "Timed out waiting for response"));
            mo17825f();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final synchronized void mo17822c(int i, String str) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                "Disconnected: ".concat(valueOf);
            } else {
                new String("Disconnected: ");
            }
        }
        int i2 = this.f6233a;
        if (i2 == 0) {
            throw new IllegalStateException();
        } else if (i2 == 1 || i2 == 2) {
            boolean isLoggable = Log.isLoggable("MessengerIpcClient", 2);
            this.f6233a = 4;
            C1640a.m4551b().mo11371c(this.f6238f.f6226a, this);
            C3241o oVar = new C3241o(i, str);
            for (C3243p b : this.f6236d) {
                b.mo17851b(oVar);
            }
            this.f6236d.clear();
            for (int i3 = 0; i3 < this.f6237e.size(); i3++) {
                this.f6237e.valueAt(i3).mo17851b(oVar);
            }
            this.f6237e.clear();
        } else if (i2 == 3) {
            this.f6233a = 4;
        } else if (i2 != 4) {
            int i4 = this.f6233a;
            StringBuilder sb = new StringBuilder(26);
            sb.append("Unknown state: ");
            sb.append(i4);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0046, code lost:
        r5 = r5.getData();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0051, code lost:
        if (r5.getBoolean("unsupported", false) == false) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0053, code lost:
        r1.mo17851b(new com.google.firebase.iid.C3241o(4, "Not supported by GmsCore"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005f, code lost:
        r1.mo17850a(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0062, code lost:
        return true;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo17823d(android.os.Message r5) {
        /*
            r4 = this;
            int r0 = r5.arg1
            java.lang.String r1 = "MessengerIpcClient"
            r2 = 3
            boolean r1 = android.util.Log.isLoggable(r1, r2)
            if (r1 == 0) goto L_0x001d
            r1 = 41
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            java.lang.String r1 = "Received response to request: "
            r2.append(r1)
            r2.append(r0)
            r2.toString()
        L_0x001d:
            monitor-enter(r4)
            android.util.SparseArray<com.google.firebase.iid.p<?>> r1 = r4.f6237e     // Catch:{ all -> 0x0063 }
            java.lang.Object r1 = r1.get(r0)     // Catch:{ all -> 0x0063 }
            com.google.firebase.iid.p r1 = (com.google.firebase.iid.C3243p) r1     // Catch:{ all -> 0x0063 }
            r2 = 1
            if (r1 != 0) goto L_0x003d
            r5 = 50
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0063 }
            r1.<init>(r5)     // Catch:{ all -> 0x0063 }
            java.lang.String r5 = "Received response for unknown request: "
            r1.append(r5)     // Catch:{ all -> 0x0063 }
            r1.append(r0)     // Catch:{ all -> 0x0063 }
            r1.toString()     // Catch:{ all -> 0x0063 }
            monitor-exit(r4)     // Catch:{ all -> 0x0063 }
            return r2
        L_0x003d:
            android.util.SparseArray<com.google.firebase.iid.p<?>> r3 = r4.f6237e     // Catch:{ all -> 0x0063 }
            r3.remove(r0)     // Catch:{ all -> 0x0063 }
            r4.mo17825f()     // Catch:{ all -> 0x0063 }
            monitor-exit(r4)     // Catch:{ all -> 0x0063 }
            android.os.Bundle r5 = r5.getData()
            java.lang.String r0 = "unsupported"
            r3 = 0
            boolean r0 = r5.getBoolean(r0, r3)
            if (r0 == 0) goto L_0x005f
            com.google.firebase.iid.o r5 = new com.google.firebase.iid.o
            r0 = 4
            java.lang.String r3 = "Not supported by GmsCore"
            r5.<init>(r0, r3)
            r1.mo17851b(r5)
            goto L_0x0062
        L_0x005f:
            r1.mo17850a(r5)
        L_0x0062:
            return r2
        L_0x0063:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0063 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.C3219f.mo17823d(android.os.Message):boolean");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002f, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x008d, code lost:
        return true;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo17824e(com.google.firebase.iid.C3243p<?> r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            int r0 = r5.f6233a     // Catch:{ all -> 0x008e }
            r1 = 2
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0041
            if (r0 == r3) goto L_0x003a
            if (r0 == r1) goto L_0x0030
            r6 = 3
            if (r0 == r6) goto L_0x002e
            r6 = 4
            if (r0 != r6) goto L_0x0013
            goto L_0x002e
        L_0x0013:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch:{ all -> 0x008e }
            int r0 = r5.f6233a     // Catch:{ all -> 0x008e }
            r1 = 26
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x008e }
            r2.<init>(r1)     // Catch:{ all -> 0x008e }
            java.lang.String r1 = "Unknown state: "
            r2.append(r1)     // Catch:{ all -> 0x008e }
            r2.append(r0)     // Catch:{ all -> 0x008e }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x008e }
            r6.<init>(r0)     // Catch:{ all -> 0x008e }
            throw r6     // Catch:{ all -> 0x008e }
        L_0x002e:
            monitor-exit(r5)
            return r2
        L_0x0030:
            java.util.Queue<com.google.firebase.iid.p<?>> r0 = r5.f6236d     // Catch:{ all -> 0x008e }
            r0.add(r6)     // Catch:{ all -> 0x008e }
            r5.mo17820a()     // Catch:{ all -> 0x008e }
            monitor-exit(r5)
            return r3
        L_0x003a:
            java.util.Queue<com.google.firebase.iid.p<?>> r0 = r5.f6236d     // Catch:{ all -> 0x008e }
            r0.add(r6)     // Catch:{ all -> 0x008e }
            monitor-exit(r5)
            return r3
        L_0x0041:
            java.util.Queue<com.google.firebase.iid.p<?>> r0 = r5.f6236d     // Catch:{ all -> 0x008e }
            r0.add(r6)     // Catch:{ all -> 0x008e }
            int r6 = r5.f6233a     // Catch:{ all -> 0x008e }
            if (r6 != 0) goto L_0x004c
            r6 = 1
            goto L_0x004d
        L_0x004c:
            r6 = 0
        L_0x004d:
            com.google.android.gms.common.internal.C1609u.m4478n(r6)     // Catch:{ all -> 0x008e }
            java.lang.String r6 = "MessengerIpcClient"
            boolean r6 = android.util.Log.isLoggable(r6, r1)     // Catch:{ all -> 0x008e }
            r5.f6233a = r3     // Catch:{ all -> 0x008e }
            android.content.Intent r6 = new android.content.Intent     // Catch:{ all -> 0x008e }
            java.lang.String r0 = "com.google.android.c2dm.intent.REGISTER"
            r6.<init>(r0)     // Catch:{ all -> 0x008e }
            java.lang.String r0 = "com.google.android.gms"
            r6.setPackage(r0)     // Catch:{ all -> 0x008e }
            com.google.android.gms.common.stats.a r0 = com.google.android.gms.common.stats.C1640a.m4551b()     // Catch:{ all -> 0x008e }
            com.google.firebase.iid.e r1 = r5.f6238f     // Catch:{ all -> 0x008e }
            android.content.Context r1 = r1.f6226a     // Catch:{ all -> 0x008e }
            boolean r6 = r0.mo11370a(r1, r6, r5, r3)     // Catch:{ all -> 0x008e }
            if (r6 != 0) goto L_0x007a
            java.lang.String r6 = "Unable to bind to service"
            r5.mo17822c(r2, r6)     // Catch:{ all -> 0x008e }
            goto L_0x008c
        L_0x007a:
            com.google.firebase.iid.e r6 = r5.f6238f     // Catch:{ all -> 0x008e }
            java.util.concurrent.ScheduledExecutorService r6 = r6.f6227b     // Catch:{ all -> 0x008e }
            com.google.firebase.iid.h r0 = new com.google.firebase.iid.h     // Catch:{ all -> 0x008e }
            r0.<init>(r5)     // Catch:{ all -> 0x008e }
            r1 = 30
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x008e }
            r6.schedule(r0, r1, r4)     // Catch:{ all -> 0x008e }
        L_0x008c:
            monitor-exit(r5)
            return r3
        L_0x008e:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.C3219f.mo17824e(com.google.firebase.iid.p):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final synchronized void mo17825f() {
        if (this.f6233a == 2 && this.f6236d.isEmpty() && this.f6237e.size() == 0) {
            boolean isLoggable = Log.isLoggable("MessengerIpcClient", 2);
            this.f6233a = 3;
            C1640a.m4551b().mo11371c(this.f6238f.f6226a, this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final synchronized void mo17826g() {
        if (this.f6233a == 1) {
            mo17822c(1, "Timed out while binding");
        }
    }

    @MainThread
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        boolean isLoggable = Log.isLoggable("MessengerIpcClient", 2);
        this.f6238f.f6227b.execute(new C3233k(this, iBinder));
    }

    @MainThread
    public final void onServiceDisconnected(ComponentName componentName) {
        boolean isLoggable = Log.isLoggable("MessengerIpcClient", 2);
        this.f6238f.f6227b.execute(new C3237m(this));
    }
}
