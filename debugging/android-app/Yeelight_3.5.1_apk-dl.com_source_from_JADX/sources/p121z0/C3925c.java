package p121z0;

import android.os.Bundle;
import androidx.annotation.NonNull;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: z0.c */
public class C3925c implements C3924b, C3923a {

    /* renamed from: a */
    private final C3927e f6562a;

    /* renamed from: b */
    private final int f6563b;

    /* renamed from: c */
    private final TimeUnit f6564c;

    /* renamed from: d */
    private final Object f6565d = new Object();

    /* renamed from: e */
    private CountDownLatch f6566e;

    public C3925c(@NonNull C3927e eVar, int i, TimeUnit timeUnit) {
        this.f6562a = eVar;
        this.f6563b = i;
        this.f6564c = timeUnit;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:9|10) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        p118y0.C3916f.m11190f().mo26401d("Interrupted while awaiting app exception callback from Analytics listener.");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x005a */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo26422a(@androidx.annotation.NonNull java.lang.String r5, @androidx.annotation.Nullable android.os.Bundle r6) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f6565d
            monitor-enter(r0)
            y0.f r1 = p118y0.C3916f.m11190f()     // Catch:{ all -> 0x0068 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0068 }
            r2.<init>()     // Catch:{ all -> 0x0068 }
            java.lang.String r3 = "Logging event "
            r2.append(r3)     // Catch:{ all -> 0x0068 }
            r2.append(r5)     // Catch:{ all -> 0x0068 }
            java.lang.String r3 = " to Firebase Analytics with params "
            r2.append(r3)     // Catch:{ all -> 0x0068 }
            r2.append(r6)     // Catch:{ all -> 0x0068 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0068 }
            r1.mo26405i(r2)     // Catch:{ all -> 0x0068 }
            java.util.concurrent.CountDownLatch r1 = new java.util.concurrent.CountDownLatch     // Catch:{ all -> 0x0068 }
            r2 = 1
            r1.<init>(r2)     // Catch:{ all -> 0x0068 }
            r4.f6566e = r1     // Catch:{ all -> 0x0068 }
            z0.e r1 = r4.f6562a     // Catch:{ all -> 0x0068 }
            r1.mo26422a(r5, r6)     // Catch:{ all -> 0x0068 }
            y0.f r5 = p118y0.C3916f.m11190f()     // Catch:{ all -> 0x0068 }
            java.lang.String r6 = "Awaiting app exception callback from Analytics..."
            r5.mo26405i(r6)     // Catch:{ all -> 0x0068 }
            java.util.concurrent.CountDownLatch r5 = r4.f6566e     // Catch:{ InterruptedException -> 0x005a }
            int r6 = r4.f6563b     // Catch:{ InterruptedException -> 0x005a }
            long r1 = (long) r6     // Catch:{ InterruptedException -> 0x005a }
            java.util.concurrent.TimeUnit r6 = r4.f6564c     // Catch:{ InterruptedException -> 0x005a }
            boolean r5 = r5.await(r1, r6)     // Catch:{ InterruptedException -> 0x005a }
            if (r5 == 0) goto L_0x0050
            y0.f r5 = p118y0.C3916f.m11190f()     // Catch:{ InterruptedException -> 0x005a }
            java.lang.String r6 = "App exception callback received from Analytics listener."
            r5.mo26405i(r6)     // Catch:{ InterruptedException -> 0x005a }
            goto L_0x0063
        L_0x0050:
            y0.f r5 = p118y0.C3916f.m11190f()     // Catch:{ InterruptedException -> 0x005a }
            java.lang.String r6 = "Timeout exceeded while awaiting app exception callback from Analytics listener."
            r5.mo26407k(r6)     // Catch:{ InterruptedException -> 0x005a }
            goto L_0x0063
        L_0x005a:
            y0.f r5 = p118y0.C3916f.m11190f()     // Catch:{ all -> 0x0068 }
            java.lang.String r6 = "Interrupted while awaiting app exception callback from Analytics listener."
            r5.mo26401d(r6)     // Catch:{ all -> 0x0068 }
        L_0x0063:
            r5 = 0
            r4.f6566e = r5     // Catch:{ all -> 0x0068 }
            monitor-exit(r0)     // Catch:{ all -> 0x0068 }
            return
        L_0x0068:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0068 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p121z0.C3925c.mo26422a(java.lang.String, android.os.Bundle):void");
    }

    public void onEvent(@NonNull String str, @NonNull Bundle bundle) {
        CountDownLatch countDownLatch = this.f6566e;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }
}
