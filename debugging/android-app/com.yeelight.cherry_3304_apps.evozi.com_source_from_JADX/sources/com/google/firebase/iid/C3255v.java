package com.google.firebase.iid;

import android.util.Pair;
import androidx.collection.ArrayMap;
import java.util.Map;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;
import p011c.p012a.p019b.p028b.p038e.C0619h;

/* renamed from: com.google.firebase.iid.v */
final class C3255v {

    /* renamed from: a */
    private final Executor f6292a;
    @GuardedBy("this")

    /* renamed from: b */
    private final Map<Pair<String, String>, C0619h<C3204a>> f6293b = new ArrayMap();

    C3255v(Executor executor) {
        this.f6292a = executor;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ C0619h mo17863a(Pair pair, C0619h hVar) {
        synchronized (this) {
            this.f6293b.remove(pair);
        }
        return hVar;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0038, code lost:
        return r3;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized p011c.p012a.p019b.p028b.p038e.C0619h<com.google.firebase.iid.C3204a> mo17864b(java.lang.String r3, java.lang.String r4, com.google.firebase.iid.C3259x r5) {
        /*
            r2 = this;
            monitor-enter(r2)
            android.util.Pair r0 = new android.util.Pair     // Catch:{ all -> 0x0075 }
            r0.<init>(r3, r4)     // Catch:{ all -> 0x0075 }
            java.util.Map<android.util.Pair<java.lang.String, java.lang.String>, c.a.b.b.e.h<com.google.firebase.iid.a>> r3 = r2.f6293b     // Catch:{ all -> 0x0075 }
            java.lang.Object r3 = r3.get(r0)     // Catch:{ all -> 0x0075 }
            c.a.b.b.e.h r3 = (p011c.p012a.p019b.p028b.p038e.C0619h) r3     // Catch:{ all -> 0x0075 }
            r4 = 3
            if (r3 == 0) goto L_0x0039
            java.lang.String r5 = "FirebaseInstanceId"
            boolean r4 = android.util.Log.isLoggable(r5, r4)     // Catch:{ all -> 0x0075 }
            if (r4 == 0) goto L_0x0037
            java.lang.String r4 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0075 }
            java.lang.String r5 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x0075 }
            int r5 = r5.length()     // Catch:{ all -> 0x0075 }
            int r5 = r5 + 29
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0075 }
            r0.<init>(r5)     // Catch:{ all -> 0x0075 }
            java.lang.String r5 = "Joining ongoing request for: "
            r0.append(r5)     // Catch:{ all -> 0x0075 }
            r0.append(r4)     // Catch:{ all -> 0x0075 }
            r0.toString()     // Catch:{ all -> 0x0075 }
        L_0x0037:
            monitor-exit(r2)
            return r3
        L_0x0039:
            java.lang.String r3 = "FirebaseInstanceId"
            boolean r3 = android.util.Log.isLoggable(r3, r4)     // Catch:{ all -> 0x0075 }
            if (r3 == 0) goto L_0x005f
            java.lang.String r3 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0075 }
            java.lang.String r4 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x0075 }
            int r4 = r4.length()     // Catch:{ all -> 0x0075 }
            int r4 = r4 + 24
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0075 }
            r1.<init>(r4)     // Catch:{ all -> 0x0075 }
            java.lang.String r4 = "Making new request for: "
            r1.append(r4)     // Catch:{ all -> 0x0075 }
            r1.append(r3)     // Catch:{ all -> 0x0075 }
            r1.toString()     // Catch:{ all -> 0x0075 }
        L_0x005f:
            c.a.b.b.e.h r3 = r5.mo17867C()     // Catch:{ all -> 0x0075 }
            java.util.concurrent.Executor r4 = r2.f6292a     // Catch:{ all -> 0x0075 }
            com.google.firebase.iid.u r5 = new com.google.firebase.iid.u     // Catch:{ all -> 0x0075 }
            r5.<init>(r2, r0)     // Catch:{ all -> 0x0075 }
            c.a.b.b.e.h r3 = r3.mo8648i(r4, r5)     // Catch:{ all -> 0x0075 }
            java.util.Map<android.util.Pair<java.lang.String, java.lang.String>, c.a.b.b.e.h<com.google.firebase.iid.a>> r4 = r2.f6293b     // Catch:{ all -> 0x0075 }
            r4.put(r0, r3)     // Catch:{ all -> 0x0075 }
            monitor-exit(r2)
            return r3
        L_0x0075:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.C3255v.mo17864b(java.lang.String, java.lang.String, com.google.firebase.iid.x):c.a.b.b.e.h");
    }
}
