package com.xiaomi.account.auth;

import android.os.Looper;
import com.xiaomi.account.openauth.XiaomiOAuthFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

public class XiaomiOAuthFutureImpl<V> extends FutureTask<V> implements XiaomiOAuthFuture<V> {
    private static final long DEFAULT_TIMEOUT_MINUTE = 10;

    public XiaomiOAuthFutureImpl(Callable<V> callable) {
        super(callable);
    }

    private void ensureNotOnMainThread() {
        Looper myLooper = Looper.myLooper();
        if (myLooper != null && myLooper == Looper.getMainLooper()) {
            throw new IllegalStateException("calling this from your main thread can lead to deadlock");
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x0059 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private V internalGetResult(java.lang.Long r4, java.util.concurrent.TimeUnit r5) {
        /*
            r3 = this;
            boolean r0 = r3.isDone()
            if (r0 != 0) goto L_0x0009
            r3.ensureNotOnMainThread()
        L_0x0009:
            r0 = 1
            if (r4 != 0) goto L_0x0014
            java.lang.Object r4 = r3.get()     // Catch:{ CancellationException -> 0x0059, InterruptedException | TimeoutException -> 0x0050, ExecutionException -> 0x0022 }
            r3.cancel(r0)
            return r4
        L_0x0014:
            long r1 = r4.longValue()     // Catch:{ CancellationException -> 0x0059, InterruptedException | TimeoutException -> 0x0050, ExecutionException -> 0x0022 }
            java.lang.Object r4 = r3.get(r1, r5)     // Catch:{ CancellationException -> 0x0059, InterruptedException | TimeoutException -> 0x0050, ExecutionException -> 0x0022 }
            r3.cancel(r0)
            return r4
        L_0x0020:
            r4 = move-exception
            goto L_0x005f
        L_0x0022:
            r4 = move-exception
            java.lang.Throwable r4 = r4.getCause()     // Catch:{ all -> 0x0020 }
            boolean r5 = r4 instanceof java.io.IOException     // Catch:{ all -> 0x0020 }
            if (r5 != 0) goto L_0x004d
            boolean r5 = r4 instanceof java.lang.RuntimeException     // Catch:{ all -> 0x0020 }
            if (r5 != 0) goto L_0x004a
            boolean r5 = r4 instanceof java.lang.Error     // Catch:{ all -> 0x0020 }
            if (r5 != 0) goto L_0x0047
            boolean r5 = r4 instanceof com.xiaomi.account.openauth.XMAuthericationException     // Catch:{ all -> 0x0020 }
            if (r5 != 0) goto L_0x0044
            boolean r5 = r4 instanceof android.accounts.OperationCanceledException     // Catch:{ all -> 0x0020 }
            if (r5 == 0) goto L_0x003e
            android.accounts.OperationCanceledException r4 = (android.accounts.OperationCanceledException) r4     // Catch:{ all -> 0x0020 }
            throw r4     // Catch:{ all -> 0x0020 }
        L_0x003e:
            com.xiaomi.account.openauth.XMAuthericationException r5 = new com.xiaomi.account.openauth.XMAuthericationException     // Catch:{ all -> 0x0020 }
            r5.<init>((java.lang.Throwable) r4)     // Catch:{ all -> 0x0020 }
            throw r5     // Catch:{ all -> 0x0020 }
        L_0x0044:
            com.xiaomi.account.openauth.XMAuthericationException r4 = (com.xiaomi.account.openauth.XMAuthericationException) r4     // Catch:{ all -> 0x0020 }
            throw r4     // Catch:{ all -> 0x0020 }
        L_0x0047:
            java.lang.Error r4 = (java.lang.Error) r4     // Catch:{ all -> 0x0020 }
            throw r4     // Catch:{ all -> 0x0020 }
        L_0x004a:
            java.lang.RuntimeException r4 = (java.lang.RuntimeException) r4     // Catch:{ all -> 0x0020 }
            throw r4     // Catch:{ all -> 0x0020 }
        L_0x004d:
            java.io.IOException r4 = (java.io.IOException) r4     // Catch:{ all -> 0x0020 }
            throw r4     // Catch:{ all -> 0x0020 }
        L_0x0050:
            r3.cancel(r0)
            android.accounts.OperationCanceledException r4 = new android.accounts.OperationCanceledException
            r4.<init>()
            throw r4
        L_0x0059:
            android.accounts.OperationCanceledException r4 = new android.accounts.OperationCanceledException     // Catch:{ all -> 0x0020 }
            r4.<init>()     // Catch:{ all -> 0x0020 }
            throw r4     // Catch:{ all -> 0x0020 }
        L_0x005f:
            r3.cancel(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.account.auth.XiaomiOAuthFutureImpl.internalGetResult(java.lang.Long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    public V getResult() {
        return internalGetResult(Long.valueOf(DEFAULT_TIMEOUT_MINUTE), TimeUnit.MINUTES);
    }

    public V getResult(long j, TimeUnit timeUnit) {
        return internalGetResult(Long.valueOf(j), timeUnit);
    }
}
