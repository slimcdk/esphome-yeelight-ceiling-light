package p148d7;

import java.util.concurrent.Callable;
import java.util.logging.Logger;
import org.fourthline.cling.model.message.C10030d;
import org.fourthline.cling.model.message.C10031e;
import p148d7.C8961k;

/* renamed from: d7.a */
public abstract class C8951a<C extends C8961k, REQUEST> implements C8960j<C> {

    /* renamed from: a */
    private static final Logger f16456a = Logger.getLogger(C8960j.class.getName());

    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x0102 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x012f */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.fourthline.cling.model.message.C10031e mo36781a(org.fourthline.cling.model.message.C10030d r10) {
        /*
            r9 = this;
            java.util.logging.Logger r0 = f16456a
            java.util.logging.Level r1 = java.util.logging.Level.FINE
            boolean r2 = r0.isLoggable(r1)
            if (r2 == 0) goto L_0x001e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Preparing HTTP request: "
            r2.append(r3)
            r2.append(r10)
            java.lang.String r2 = r2.toString()
            r0.fine(r2)
        L_0x001e:
            java.lang.Object r2 = r9.mo26727d(r10)
            r3 = 0
            if (r2 != 0) goto L_0x0026
            return r3
        L_0x0026:
            java.util.concurrent.Callable r4 = r9.mo26726c(r10, r2)
            long r5 = java.lang.System.currentTimeMillis()
            d7.k r7 = r9.getConfiguration()
            java.util.concurrent.ExecutorService r7 = r7.mo36785c()
            java.util.concurrent.Future r4 = r7.submit(r4)
            boolean r1 = r0.isLoggable(r1)     // Catch:{ InterruptedException -> 0x012f, TimeoutException -> 0x0102, ExecutionException -> 0x00d7 }
            if (r1 == 0) goto L_0x0064
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ InterruptedException -> 0x012f, TimeoutException -> 0x0102, ExecutionException -> 0x00d7 }
            r1.<init>()     // Catch:{ InterruptedException -> 0x012f, TimeoutException -> 0x0102, ExecutionException -> 0x00d7 }
            java.lang.String r7 = "Waiting "
            r1.append(r7)     // Catch:{ InterruptedException -> 0x012f, TimeoutException -> 0x0102, ExecutionException -> 0x00d7 }
            d7.k r7 = r9.getConfiguration()     // Catch:{ InterruptedException -> 0x012f, TimeoutException -> 0x0102, ExecutionException -> 0x00d7 }
            int r7 = r7.mo36783a()     // Catch:{ InterruptedException -> 0x012f, TimeoutException -> 0x0102, ExecutionException -> 0x00d7 }
            r1.append(r7)     // Catch:{ InterruptedException -> 0x012f, TimeoutException -> 0x0102, ExecutionException -> 0x00d7 }
            java.lang.String r7 = " seconds for HTTP request to complete: "
            r1.append(r7)     // Catch:{ InterruptedException -> 0x012f, TimeoutException -> 0x0102, ExecutionException -> 0x00d7 }
            r1.append(r10)     // Catch:{ InterruptedException -> 0x012f, TimeoutException -> 0x0102, ExecutionException -> 0x00d7 }
            java.lang.String r1 = r1.toString()     // Catch:{ InterruptedException -> 0x012f, TimeoutException -> 0x0102, ExecutionException -> 0x00d7 }
            r0.fine(r1)     // Catch:{ InterruptedException -> 0x012f, TimeoutException -> 0x0102, ExecutionException -> 0x00d7 }
        L_0x0064:
            d7.k r1 = r9.getConfiguration()     // Catch:{ InterruptedException -> 0x012f, TimeoutException -> 0x0102, ExecutionException -> 0x00d7 }
            int r1 = r1.mo36783a()     // Catch:{ InterruptedException -> 0x012f, TimeoutException -> 0x0102, ExecutionException -> 0x00d7 }
            long r7 = (long) r1     // Catch:{ InterruptedException -> 0x012f, TimeoutException -> 0x0102, ExecutionException -> 0x00d7 }
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x012f, TimeoutException -> 0x0102, ExecutionException -> 0x00d7 }
            java.lang.Object r1 = r4.get(r7, r1)     // Catch:{ InterruptedException -> 0x012f, TimeoutException -> 0x0102, ExecutionException -> 0x00d7 }
            org.fourthline.cling.model.message.e r1 = (org.fourthline.cling.model.message.C10031e) r1     // Catch:{ InterruptedException -> 0x012f, TimeoutException -> 0x0102, ExecutionException -> 0x00d7 }
            long r7 = java.lang.System.currentTimeMillis()     // Catch:{ InterruptedException -> 0x012f, TimeoutException -> 0x0102, ExecutionException -> 0x00d7 }
            long r7 = r7 - r5
            java.util.logging.Level r4 = java.util.logging.Level.FINEST     // Catch:{ InterruptedException -> 0x012f, TimeoutException -> 0x0102, ExecutionException -> 0x00d7 }
            boolean r4 = r0.isLoggable(r4)     // Catch:{ InterruptedException -> 0x012f, TimeoutException -> 0x0102, ExecutionException -> 0x00d7 }
            if (r4 == 0) goto L_0x009e
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ InterruptedException -> 0x012f, TimeoutException -> 0x0102, ExecutionException -> 0x00d7 }
            r4.<init>()     // Catch:{ InterruptedException -> 0x012f, TimeoutException -> 0x0102, ExecutionException -> 0x00d7 }
            java.lang.String r5 = "Got HTTP response in "
            r4.append(r5)     // Catch:{ InterruptedException -> 0x012f, TimeoutException -> 0x0102, ExecutionException -> 0x00d7 }
            r4.append(r7)     // Catch:{ InterruptedException -> 0x012f, TimeoutException -> 0x0102, ExecutionException -> 0x00d7 }
            java.lang.String r5 = "ms: "
            r4.append(r5)     // Catch:{ InterruptedException -> 0x012f, TimeoutException -> 0x0102, ExecutionException -> 0x00d7 }
            r4.append(r10)     // Catch:{ InterruptedException -> 0x012f, TimeoutException -> 0x0102, ExecutionException -> 0x00d7 }
            java.lang.String r4 = r4.toString()     // Catch:{ InterruptedException -> 0x012f, TimeoutException -> 0x0102, ExecutionException -> 0x00d7 }
            r0.finest(r4)     // Catch:{ InterruptedException -> 0x012f, TimeoutException -> 0x0102, ExecutionException -> 0x00d7 }
        L_0x009e:
            d7.k r4 = r9.getConfiguration()     // Catch:{ InterruptedException -> 0x012f, TimeoutException -> 0x0102, ExecutionException -> 0x00d7 }
            int r4 = r4.mo36784b()     // Catch:{ InterruptedException -> 0x012f, TimeoutException -> 0x0102, ExecutionException -> 0x00d7 }
            if (r4 <= 0) goto L_0x00d3
            d7.k r4 = r9.getConfiguration()     // Catch:{ InterruptedException -> 0x012f, TimeoutException -> 0x0102, ExecutionException -> 0x00d7 }
            int r4 = r4.mo36784b()     // Catch:{ InterruptedException -> 0x012f, TimeoutException -> 0x0102, ExecutionException -> 0x00d7 }
            int r4 = r4 * 1000
            long r4 = (long) r4     // Catch:{ InterruptedException -> 0x012f, TimeoutException -> 0x0102, ExecutionException -> 0x00d7 }
            int r6 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x00d3
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ InterruptedException -> 0x012f, TimeoutException -> 0x0102, ExecutionException -> 0x00d7 }
            r4.<init>()     // Catch:{ InterruptedException -> 0x012f, TimeoutException -> 0x0102, ExecutionException -> 0x00d7 }
            java.lang.String r5 = "HTTP request took a long time ("
            r4.append(r5)     // Catch:{ InterruptedException -> 0x012f, TimeoutException -> 0x0102, ExecutionException -> 0x00d7 }
            r4.append(r7)     // Catch:{ InterruptedException -> 0x012f, TimeoutException -> 0x0102, ExecutionException -> 0x00d7 }
            java.lang.String r5 = "ms): "
            r4.append(r5)     // Catch:{ InterruptedException -> 0x012f, TimeoutException -> 0x0102, ExecutionException -> 0x00d7 }
            r4.append(r10)     // Catch:{ InterruptedException -> 0x012f, TimeoutException -> 0x0102, ExecutionException -> 0x00d7 }
            java.lang.String r4 = r4.toString()     // Catch:{ InterruptedException -> 0x012f, TimeoutException -> 0x0102, ExecutionException -> 0x00d7 }
            r0.warning(r4)     // Catch:{ InterruptedException -> 0x012f, TimeoutException -> 0x0102, ExecutionException -> 0x00d7 }
        L_0x00d3:
            r9.mo36782f(r2)
            return r1
        L_0x00d7:
            r0 = move-exception
            java.lang.Throwable r0 = r0.getCause()     // Catch:{ all -> 0x0158 }
            boolean r1 = r9.mo26728e(r0)     // Catch:{ all -> 0x0158 }
            if (r1 != 0) goto L_0x00fe
            java.util.logging.Logger r1 = f16456a     // Catch:{ all -> 0x0158 }
            java.util.logging.Level r4 = java.util.logging.Level.WARNING     // Catch:{ all -> 0x0158 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0158 }
            r5.<init>()     // Catch:{ all -> 0x0158 }
            java.lang.String r6 = "HTTP request failed: "
            r5.append(r6)     // Catch:{ all -> 0x0158 }
            r5.append(r10)     // Catch:{ all -> 0x0158 }
            java.lang.String r10 = r5.toString()     // Catch:{ all -> 0x0158 }
            java.lang.Throwable r0 = org.seamless.util.C10243a.m25753a(r0)     // Catch:{ all -> 0x0158 }
            r1.log(r4, r10, r0)     // Catch:{ all -> 0x0158 }
        L_0x00fe:
            r9.mo36782f(r2)
            return r3
        L_0x0102:
            java.util.logging.Logger r0 = f16456a     // Catch:{ all -> 0x0158 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0158 }
            r1.<init>()     // Catch:{ all -> 0x0158 }
            java.lang.String r4 = "Timeout of "
            r1.append(r4)     // Catch:{ all -> 0x0158 }
            d7.k r4 = r9.getConfiguration()     // Catch:{ all -> 0x0158 }
            int r4 = r4.mo36783a()     // Catch:{ all -> 0x0158 }
            r1.append(r4)     // Catch:{ all -> 0x0158 }
            java.lang.String r4 = " seconds while waiting for HTTP request to complete, aborting: "
            r1.append(r4)     // Catch:{ all -> 0x0158 }
            r1.append(r10)     // Catch:{ all -> 0x0158 }
            java.lang.String r10 = r1.toString()     // Catch:{ all -> 0x0158 }
            r0.info(r10)     // Catch:{ all -> 0x0158 }
            r9.mo26725b(r2)     // Catch:{ all -> 0x0158 }
            r9.mo36782f(r2)
            return r3
        L_0x012f:
            java.util.logging.Logger r0 = f16456a     // Catch:{ all -> 0x0158 }
            java.util.logging.Level r1 = java.util.logging.Level.FINE     // Catch:{ all -> 0x0158 }
            boolean r1 = r0.isLoggable(r1)     // Catch:{ all -> 0x0158 }
            if (r1 == 0) goto L_0x014d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0158 }
            r1.<init>()     // Catch:{ all -> 0x0158 }
            java.lang.String r3 = "Interruption, aborting request: "
            r1.append(r3)     // Catch:{ all -> 0x0158 }
            r1.append(r10)     // Catch:{ all -> 0x0158 }
            java.lang.String r10 = r1.toString()     // Catch:{ all -> 0x0158 }
            r0.fine(r10)     // Catch:{ all -> 0x0158 }
        L_0x014d:
            r9.mo26725b(r2)     // Catch:{ all -> 0x0158 }
            java.lang.InterruptedException r10 = new java.lang.InterruptedException     // Catch:{ all -> 0x0158 }
            java.lang.String r0 = "HTTP request interrupted and aborted"
            r10.<init>(r0)     // Catch:{ all -> 0x0158 }
            throw r10     // Catch:{ all -> 0x0158 }
        L_0x0158:
            r10 = move-exception
            r9.mo36782f(r2)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p148d7.C8951a.mo36781a(org.fourthline.cling.model.message.d):org.fourthline.cling.model.message.e");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo26725b(REQUEST request);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract Callable<C10031e> mo26726c(C10030d dVar, REQUEST request);

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract REQUEST mo26727d(C10030d dVar);

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract boolean mo26728e(Throwable th);

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo36782f(REQUEST request) {
    }
}
