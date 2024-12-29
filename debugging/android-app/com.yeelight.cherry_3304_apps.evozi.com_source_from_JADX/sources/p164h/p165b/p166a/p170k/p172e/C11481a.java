package p164h.p165b.p166a.p170k.p172e;

import java.util.concurrent.Callable;
import java.util.logging.Logger;
import p164h.p165b.p166a.p170k.p172e.C11491m;
import p164h.p165b.p166a.p240h.p243r.C11243d;
import p164h.p165b.p166a.p240h.p243r.C11244e;

/* renamed from: h.b.a.k.e.a */
public abstract class C11481a<C extends C11491m, REQUEST> implements C11490l<C> {

    /* renamed from: a */
    private static final Logger f22841a = Logger.getLogger(C11490l.class.getName());

    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0113 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0140 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p164h.p165b.p166a.p240h.p243r.C11244e mo36334a(p164h.p165b.p166a.p240h.p243r.C11243d r9) {
        /*
            r8 = this;
            java.util.logging.Logger r0 = f22841a
            java.util.logging.Level r1 = java.util.logging.Level.FINE
            boolean r0 = r0.isLoggable(r1)
            if (r0 == 0) goto L_0x0020
            java.util.logging.Logger r0 = f22841a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Preparing HTTP request: "
            r1.append(r2)
            r1.append(r9)
            java.lang.String r1 = r1.toString()
            r0.fine(r1)
        L_0x0020:
            java.lang.Object r0 = r8.mo36355d(r9)
            r1 = 0
            if (r0 != 0) goto L_0x0028
            return r1
        L_0x0028:
            java.util.concurrent.Callable r2 = r8.mo36354c(r9, r0)
            long r3 = java.lang.System.currentTimeMillis()
            h.b.a.k.e.m r5 = r8.getConfiguration()
            java.util.concurrent.ExecutorService r5 = r5.mo36372c()
            java.util.concurrent.Future r2 = r5.submit(r2)
            java.util.logging.Logger r5 = f22841a     // Catch:{ InterruptedException -> 0x0140, TimeoutException -> 0x0113, ExecutionException -> 0x00e8 }
            java.util.logging.Level r6 = java.util.logging.Level.FINE     // Catch:{ InterruptedException -> 0x0140, TimeoutException -> 0x0113, ExecutionException -> 0x00e8 }
            boolean r5 = r5.isLoggable(r6)     // Catch:{ InterruptedException -> 0x0140, TimeoutException -> 0x0113, ExecutionException -> 0x00e8 }
            if (r5 == 0) goto L_0x006c
            java.util.logging.Logger r5 = f22841a     // Catch:{ InterruptedException -> 0x0140, TimeoutException -> 0x0113, ExecutionException -> 0x00e8 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ InterruptedException -> 0x0140, TimeoutException -> 0x0113, ExecutionException -> 0x00e8 }
            r6.<init>()     // Catch:{ InterruptedException -> 0x0140, TimeoutException -> 0x0113, ExecutionException -> 0x00e8 }
            java.lang.String r7 = "Waiting "
            r6.append(r7)     // Catch:{ InterruptedException -> 0x0140, TimeoutException -> 0x0113, ExecutionException -> 0x00e8 }
            h.b.a.k.e.m r7 = r8.getConfiguration()     // Catch:{ InterruptedException -> 0x0140, TimeoutException -> 0x0113, ExecutionException -> 0x00e8 }
            int r7 = r7.mo36370a()     // Catch:{ InterruptedException -> 0x0140, TimeoutException -> 0x0113, ExecutionException -> 0x00e8 }
            r6.append(r7)     // Catch:{ InterruptedException -> 0x0140, TimeoutException -> 0x0113, ExecutionException -> 0x00e8 }
            java.lang.String r7 = " seconds for HTTP request to complete: "
            r6.append(r7)     // Catch:{ InterruptedException -> 0x0140, TimeoutException -> 0x0113, ExecutionException -> 0x00e8 }
            r6.append(r9)     // Catch:{ InterruptedException -> 0x0140, TimeoutException -> 0x0113, ExecutionException -> 0x00e8 }
            java.lang.String r6 = r6.toString()     // Catch:{ InterruptedException -> 0x0140, TimeoutException -> 0x0113, ExecutionException -> 0x00e8 }
            r5.fine(r6)     // Catch:{ InterruptedException -> 0x0140, TimeoutException -> 0x0113, ExecutionException -> 0x00e8 }
        L_0x006c:
            h.b.a.k.e.m r5 = r8.getConfiguration()     // Catch:{ InterruptedException -> 0x0140, TimeoutException -> 0x0113, ExecutionException -> 0x00e8 }
            int r5 = r5.mo36370a()     // Catch:{ InterruptedException -> 0x0140, TimeoutException -> 0x0113, ExecutionException -> 0x00e8 }
            long r5 = (long) r5     // Catch:{ InterruptedException -> 0x0140, TimeoutException -> 0x0113, ExecutionException -> 0x00e8 }
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x0140, TimeoutException -> 0x0113, ExecutionException -> 0x00e8 }
            java.lang.Object r2 = r2.get(r5, r7)     // Catch:{ InterruptedException -> 0x0140, TimeoutException -> 0x0113, ExecutionException -> 0x00e8 }
            h.b.a.h.r.e r2 = (p164h.p165b.p166a.p240h.p243r.C11244e) r2     // Catch:{ InterruptedException -> 0x0140, TimeoutException -> 0x0113, ExecutionException -> 0x00e8 }
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ InterruptedException -> 0x0140, TimeoutException -> 0x0113, ExecutionException -> 0x00e8 }
            long r5 = r5 - r3
            java.util.logging.Logger r3 = f22841a     // Catch:{ InterruptedException -> 0x0140, TimeoutException -> 0x0113, ExecutionException -> 0x00e8 }
            java.util.logging.Level r4 = java.util.logging.Level.FINEST     // Catch:{ InterruptedException -> 0x0140, TimeoutException -> 0x0113, ExecutionException -> 0x00e8 }
            boolean r3 = r3.isLoggable(r4)     // Catch:{ InterruptedException -> 0x0140, TimeoutException -> 0x0113, ExecutionException -> 0x00e8 }
            if (r3 == 0) goto L_0x00aa
            java.util.logging.Logger r3 = f22841a     // Catch:{ InterruptedException -> 0x0140, TimeoutException -> 0x0113, ExecutionException -> 0x00e8 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ InterruptedException -> 0x0140, TimeoutException -> 0x0113, ExecutionException -> 0x00e8 }
            r4.<init>()     // Catch:{ InterruptedException -> 0x0140, TimeoutException -> 0x0113, ExecutionException -> 0x00e8 }
            java.lang.String r7 = "Got HTTP response in "
            r4.append(r7)     // Catch:{ InterruptedException -> 0x0140, TimeoutException -> 0x0113, ExecutionException -> 0x00e8 }
            r4.append(r5)     // Catch:{ InterruptedException -> 0x0140, TimeoutException -> 0x0113, ExecutionException -> 0x00e8 }
            java.lang.String r7 = "ms: "
            r4.append(r7)     // Catch:{ InterruptedException -> 0x0140, TimeoutException -> 0x0113, ExecutionException -> 0x00e8 }
            r4.append(r9)     // Catch:{ InterruptedException -> 0x0140, TimeoutException -> 0x0113, ExecutionException -> 0x00e8 }
            java.lang.String r4 = r4.toString()     // Catch:{ InterruptedException -> 0x0140, TimeoutException -> 0x0113, ExecutionException -> 0x00e8 }
            r3.finest(r4)     // Catch:{ InterruptedException -> 0x0140, TimeoutException -> 0x0113, ExecutionException -> 0x00e8 }
        L_0x00aa:
            h.b.a.k.e.m r3 = r8.getConfiguration()     // Catch:{ InterruptedException -> 0x0140, TimeoutException -> 0x0113, ExecutionException -> 0x00e8 }
            int r3 = r3.mo36371b()     // Catch:{ InterruptedException -> 0x0140, TimeoutException -> 0x0113, ExecutionException -> 0x00e8 }
            if (r3 <= 0) goto L_0x00e1
            h.b.a.k.e.m r3 = r8.getConfiguration()     // Catch:{ InterruptedException -> 0x0140, TimeoutException -> 0x0113, ExecutionException -> 0x00e8 }
            int r3 = r3.mo36371b()     // Catch:{ InterruptedException -> 0x0140, TimeoutException -> 0x0113, ExecutionException -> 0x00e8 }
            int r3 = r3 * 1000
            long r3 = (long) r3     // Catch:{ InterruptedException -> 0x0140, TimeoutException -> 0x0113, ExecutionException -> 0x00e8 }
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 <= 0) goto L_0x00e1
            java.util.logging.Logger r3 = f22841a     // Catch:{ InterruptedException -> 0x0140, TimeoutException -> 0x0113, ExecutionException -> 0x00e8 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ InterruptedException -> 0x0140, TimeoutException -> 0x0113, ExecutionException -> 0x00e8 }
            r4.<init>()     // Catch:{ InterruptedException -> 0x0140, TimeoutException -> 0x0113, ExecutionException -> 0x00e8 }
            java.lang.String r7 = "HTTP request took a long time ("
            r4.append(r7)     // Catch:{ InterruptedException -> 0x0140, TimeoutException -> 0x0113, ExecutionException -> 0x00e8 }
            r4.append(r5)     // Catch:{ InterruptedException -> 0x0140, TimeoutException -> 0x0113, ExecutionException -> 0x00e8 }
            java.lang.String r5 = "ms): "
            r4.append(r5)     // Catch:{ InterruptedException -> 0x0140, TimeoutException -> 0x0113, ExecutionException -> 0x00e8 }
            r4.append(r9)     // Catch:{ InterruptedException -> 0x0140, TimeoutException -> 0x0113, ExecutionException -> 0x00e8 }
            java.lang.String r4 = r4.toString()     // Catch:{ InterruptedException -> 0x0140, TimeoutException -> 0x0113, ExecutionException -> 0x00e8 }
            r3.warning(r4)     // Catch:{ InterruptedException -> 0x0140, TimeoutException -> 0x0113, ExecutionException -> 0x00e8 }
        L_0x00e1:
            r8.mo36369f(r0)
            return r2
        L_0x00e5:
            r9 = move-exception
            goto L_0x016b
        L_0x00e8:
            r2 = move-exception
            java.lang.Throwable r2 = r2.getCause()     // Catch:{ all -> 0x00e5 }
            boolean r3 = r8.mo36356e(r2)     // Catch:{ all -> 0x00e5 }
            if (r3 != 0) goto L_0x010f
            java.util.logging.Logger r3 = f22841a     // Catch:{ all -> 0x00e5 }
            java.util.logging.Level r4 = java.util.logging.Level.WARNING     // Catch:{ all -> 0x00e5 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e5 }
            r5.<init>()     // Catch:{ all -> 0x00e5 }
            java.lang.String r6 = "HTTP request failed: "
            r5.append(r6)     // Catch:{ all -> 0x00e5 }
            r5.append(r9)     // Catch:{ all -> 0x00e5 }
            java.lang.String r9 = r5.toString()     // Catch:{ all -> 0x00e5 }
            java.lang.Throwable r2 = p164h.p257c.p259b.C11495a.m30173a(r2)     // Catch:{ all -> 0x00e5 }
            r3.log(r4, r9, r2)     // Catch:{ all -> 0x00e5 }
        L_0x010f:
            r8.mo36369f(r0)
            return r1
        L_0x0113:
            java.util.logging.Logger r2 = f22841a     // Catch:{ all -> 0x00e5 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e5 }
            r3.<init>()     // Catch:{ all -> 0x00e5 }
            java.lang.String r4 = "Timeout of "
            r3.append(r4)     // Catch:{ all -> 0x00e5 }
            h.b.a.k.e.m r4 = r8.getConfiguration()     // Catch:{ all -> 0x00e5 }
            int r4 = r4.mo36370a()     // Catch:{ all -> 0x00e5 }
            r3.append(r4)     // Catch:{ all -> 0x00e5 }
            java.lang.String r4 = " seconds while waiting for HTTP request to complete, aborting: "
            r3.append(r4)     // Catch:{ all -> 0x00e5 }
            r3.append(r9)     // Catch:{ all -> 0x00e5 }
            java.lang.String r9 = r3.toString()     // Catch:{ all -> 0x00e5 }
            r2.info(r9)     // Catch:{ all -> 0x00e5 }
            r8.mo36353b(r0)     // Catch:{ all -> 0x00e5 }
            r8.mo36369f(r0)
            return r1
        L_0x0140:
            java.util.logging.Logger r1 = f22841a     // Catch:{ all -> 0x00e5 }
            java.util.logging.Level r2 = java.util.logging.Level.FINE     // Catch:{ all -> 0x00e5 }
            boolean r1 = r1.isLoggable(r2)     // Catch:{ all -> 0x00e5 }
            if (r1 == 0) goto L_0x0160
            java.util.logging.Logger r1 = f22841a     // Catch:{ all -> 0x00e5 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e5 }
            r2.<init>()     // Catch:{ all -> 0x00e5 }
            java.lang.String r3 = "Interruption, aborting request: "
            r2.append(r3)     // Catch:{ all -> 0x00e5 }
            r2.append(r9)     // Catch:{ all -> 0x00e5 }
            java.lang.String r9 = r2.toString()     // Catch:{ all -> 0x00e5 }
            r1.fine(r9)     // Catch:{ all -> 0x00e5 }
        L_0x0160:
            r8.mo36353b(r0)     // Catch:{ all -> 0x00e5 }
            java.lang.InterruptedException r9 = new java.lang.InterruptedException     // Catch:{ all -> 0x00e5 }
            java.lang.String r1 = "HTTP request interrupted and aborted"
            r9.<init>(r1)     // Catch:{ all -> 0x00e5 }
            throw r9     // Catch:{ all -> 0x00e5 }
        L_0x016b:
            r8.mo36369f(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p164h.p165b.p166a.p170k.p172e.C11481a.mo36334a(h.b.a.h.r.d):h.b.a.h.r.e");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo36353b(REQUEST request);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract Callable<C11244e> mo36354c(C11243d dVar, REQUEST request);

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract REQUEST mo36355d(C11243d dVar);

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract boolean mo36356e(Throwable th);

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo36369f(REQUEST request) {
    }
}
