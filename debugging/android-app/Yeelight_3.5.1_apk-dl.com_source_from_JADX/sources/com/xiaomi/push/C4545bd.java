package com.xiaomi.push;

import android.os.IBinder;
import com.xiaomi.push.C4540bb;

/* renamed from: com.xiaomi.push.bd */
class C4545bd implements Runnable {

    /* renamed from: a */
    final /* synthetic */ IBinder f7634a;

    /* renamed from: a */
    final /* synthetic */ C4540bb.C4542b f7635a;

    C4545bd(C4540bb.C4542b bVar, IBinder iBinder) {
        this.f7635a = bVar;
        this.f7634a = iBinder;
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x009d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00c6 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0073 */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r6 = this;
            r0 = 2
            com.xiaomi.push.bb$b r1 = r6.f7635a     // Catch:{ Exception -> 0x00a1, all -> 0x0077 }
            com.xiaomi.push.bb r1 = com.xiaomi.push.C4540bb.this     // Catch:{ Exception -> 0x00a1, all -> 0x0077 }
            android.content.Context r1 = com.xiaomi.push.C4540bb.m12960a((com.xiaomi.push.C4540bb) r1)     // Catch:{ Exception -> 0x00a1, all -> 0x0077 }
            java.lang.String r1 = r1.getPackageName()     // Catch:{ Exception -> 0x00a1, all -> 0x0077 }
            com.xiaomi.push.bb$b r2 = r6.f7635a     // Catch:{ Exception -> 0x00a1, all -> 0x0077 }
            com.xiaomi.push.bb r2 = com.xiaomi.push.C4540bb.this     // Catch:{ Exception -> 0x00a1, all -> 0x0077 }
            java.lang.String r2 = com.xiaomi.push.C4540bb.m12960a((com.xiaomi.push.C4540bb) r2)     // Catch:{ Exception -> 0x00a1, all -> 0x0077 }
            com.xiaomi.push.bb$a r3 = new com.xiaomi.push.bb$a     // Catch:{ Exception -> 0x00a1, all -> 0x0077 }
            com.xiaomi.push.bb$b r4 = r6.f7635a     // Catch:{ Exception -> 0x00a1, all -> 0x0077 }
            com.xiaomi.push.bb r4 = com.xiaomi.push.C4540bb.this     // Catch:{ Exception -> 0x00a1, all -> 0x0077 }
            r5 = 0
            r3.<init>()     // Catch:{ Exception -> 0x00a1, all -> 0x0077 }
            android.os.IBinder r4 = r6.f7634a     // Catch:{ Exception -> 0x00a1, all -> 0x0077 }
            java.lang.String r5 = "GUID"
            java.lang.String r4 = com.xiaomi.push.C4540bb.C4543c.m12973a(r4, r1, r2, r5)     // Catch:{ Exception -> 0x00a1, all -> 0x0077 }
            r3.f7629a = r4     // Catch:{ Exception -> 0x00a1, all -> 0x0077 }
            android.os.IBinder r4 = r6.f7634a     // Catch:{ Exception -> 0x00a1, all -> 0x0077 }
            java.lang.String r5 = "OUID"
            java.lang.String r4 = com.xiaomi.push.C4540bb.C4543c.m12973a(r4, r1, r2, r5)     // Catch:{ Exception -> 0x00a1, all -> 0x0077 }
            r3.f7630b = r4     // Catch:{ Exception -> 0x00a1, all -> 0x0077 }
            android.os.IBinder r4 = r6.f7634a     // Catch:{ Exception -> 0x00a1, all -> 0x0077 }
            java.lang.String r5 = "DUID"
            java.lang.String r4 = com.xiaomi.push.C4540bb.C4543c.m12973a(r4, r1, r2, r5)     // Catch:{ Exception -> 0x00a1, all -> 0x0077 }
            r3.f7631c = r4     // Catch:{ Exception -> 0x00a1, all -> 0x0077 }
            android.os.IBinder r4 = r6.f7634a     // Catch:{ Exception -> 0x00a1, all -> 0x0077 }
            java.lang.String r5 = "AUID"
            java.lang.String r1 = com.xiaomi.push.C4540bb.C4543c.m12973a(r4, r1, r2, r5)     // Catch:{ Exception -> 0x00a1, all -> 0x0077 }
            r3.f7632d = r1     // Catch:{ Exception -> 0x00a1, all -> 0x0077 }
            com.xiaomi.push.bb$b r1 = r6.f7635a     // Catch:{ Exception -> 0x00a1, all -> 0x0077 }
            com.xiaomi.push.bb r1 = com.xiaomi.push.C4540bb.this     // Catch:{ Exception -> 0x00a1, all -> 0x0077 }
            com.xiaomi.push.C4540bb.C4541a unused = r1.f7626a = r3     // Catch:{ Exception -> 0x00a1, all -> 0x0077 }
            com.xiaomi.push.bb$b r1 = r6.f7635a
            com.xiaomi.push.bb r1 = com.xiaomi.push.C4540bb.this
            com.xiaomi.push.C4540bb.m12960a((com.xiaomi.push.C4540bb) r1)
            com.xiaomi.push.bb$b r1 = r6.f7635a
            com.xiaomi.push.bb r1 = com.xiaomi.push.C4540bb.this
            int unused = r1.f7623a = r0
            com.xiaomi.push.bb$b r0 = r6.f7635a
            com.xiaomi.push.bb r0 = com.xiaomi.push.C4540bb.this
            java.lang.Object r1 = com.xiaomi.push.C4540bb.m12960a((com.xiaomi.push.C4540bb) r0)
            monitor-enter(r1)
            com.xiaomi.push.bb$b r0 = r6.f7635a     // Catch:{ Exception -> 0x0073 }
            com.xiaomi.push.bb r0 = com.xiaomi.push.C4540bb.this     // Catch:{ Exception -> 0x0073 }
            java.lang.Object r0 = com.xiaomi.push.C4540bb.m12960a((com.xiaomi.push.C4540bb) r0)     // Catch:{ Exception -> 0x0073 }
            r0.notifyAll()     // Catch:{ Exception -> 0x0073 }
            goto L_0x0073
        L_0x0071:
            r0 = move-exception
            goto L_0x0075
        L_0x0073:
            monitor-exit(r1)     // Catch:{ all -> 0x0071 }
            goto L_0x00c7
        L_0x0075:
            monitor-exit(r1)     // Catch:{ all -> 0x0071 }
            throw r0
        L_0x0077:
            r1 = move-exception
            com.xiaomi.push.bb$b r2 = r6.f7635a
            com.xiaomi.push.bb r2 = com.xiaomi.push.C4540bb.this
            com.xiaomi.push.C4540bb.m12960a((com.xiaomi.push.C4540bb) r2)
            com.xiaomi.push.bb$b r2 = r6.f7635a
            com.xiaomi.push.bb r2 = com.xiaomi.push.C4540bb.this
            int unused = r2.f7623a = r0
            com.xiaomi.push.bb$b r0 = r6.f7635a
            com.xiaomi.push.bb r0 = com.xiaomi.push.C4540bb.this
            java.lang.Object r2 = com.xiaomi.push.C4540bb.m12960a((com.xiaomi.push.C4540bb) r0)
            monitor-enter(r2)
            com.xiaomi.push.bb$b r0 = r6.f7635a     // Catch:{ Exception -> 0x009d }
            com.xiaomi.push.bb r0 = com.xiaomi.push.C4540bb.this     // Catch:{ Exception -> 0x009d }
            java.lang.Object r0 = com.xiaomi.push.C4540bb.m12960a((com.xiaomi.push.C4540bb) r0)     // Catch:{ Exception -> 0x009d }
            r0.notifyAll()     // Catch:{ Exception -> 0x009d }
            goto L_0x009d
        L_0x009b:
            r0 = move-exception
            goto L_0x009f
        L_0x009d:
            monitor-exit(r2)     // Catch:{ all -> 0x009b }
            throw r1
        L_0x009f:
            monitor-exit(r2)     // Catch:{ all -> 0x009b }
            throw r0
        L_0x00a1:
            com.xiaomi.push.bb$b r1 = r6.f7635a
            com.xiaomi.push.bb r1 = com.xiaomi.push.C4540bb.this
            com.xiaomi.push.C4540bb.m12960a((com.xiaomi.push.C4540bb) r1)
            com.xiaomi.push.bb$b r1 = r6.f7635a
            com.xiaomi.push.bb r1 = com.xiaomi.push.C4540bb.this
            int unused = r1.f7623a = r0
            com.xiaomi.push.bb$b r0 = r6.f7635a
            com.xiaomi.push.bb r0 = com.xiaomi.push.C4540bb.this
            java.lang.Object r0 = com.xiaomi.push.C4540bb.m12960a((com.xiaomi.push.C4540bb) r0)
            monitor-enter(r0)
            com.xiaomi.push.bb$b r1 = r6.f7635a     // Catch:{ Exception -> 0x00c6 }
            com.xiaomi.push.bb r1 = com.xiaomi.push.C4540bb.this     // Catch:{ Exception -> 0x00c6 }
            java.lang.Object r1 = com.xiaomi.push.C4540bb.m12960a((com.xiaomi.push.C4540bb) r1)     // Catch:{ Exception -> 0x00c6 }
            r1.notifyAll()     // Catch:{ Exception -> 0x00c6 }
            goto L_0x00c6
        L_0x00c4:
            r1 = move-exception
            goto L_0x00c8
        L_0x00c6:
            monitor-exit(r0)     // Catch:{ all -> 0x00c4 }
        L_0x00c7:
            return
        L_0x00c8:
            monitor-exit(r0)     // Catch:{ all -> 0x00c4 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.C4545bd.run():void");
    }
}
