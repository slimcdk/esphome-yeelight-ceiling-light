package p124a4;

import android.hardware.Camera;
import android.os.AsyncTask;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: a4.a */
final class C3963a implements Camera.AutoFocusCallback {

    /* renamed from: f */
    private static final String f6690f = C3963a.class.getSimpleName();

    /* renamed from: g */
    private static final Collection<String> f6691g;

    /* renamed from: a */
    private boolean f6692a;

    /* renamed from: b */
    private boolean f6693b;

    /* renamed from: c */
    private final boolean f6694c;

    /* renamed from: d */
    private final Camera f6695d;

    /* renamed from: e */
    private AsyncTask<?, ?, ?> f6696e;

    /* renamed from: a4.a$b */
    private final class C3965b extends AsyncTask<Object, Object, Object> {
        private C3965b() {
        }

        /* access modifiers changed from: protected */
        public Object doInBackground(Object... objArr) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException unused) {
            }
            C3963a.this.mo26493c();
            return null;
        }
    }

    static {
        ArrayList arrayList = new ArrayList(2);
        f6691g = arrayList;
        arrayList.add("auto");
        arrayList.add("macro");
    }

    C3963a(Camera camera) {
        this.f6695d = camera;
        String focusMode = camera.getParameters().getFocusMode();
        boolean contains = f6691g.contains(focusMode);
        this.f6694c = contains;
        StringBuilder sb = new StringBuilder();
        sb.append("Current focus mode '");
        sb.append(focusMode);
        sb.append("'; use auto focus? ");
        sb.append(contains);
        mo26493c();
    }

    /* renamed from: a */
    private synchronized void m11431a() {
        if (!this.f6692a && this.f6696e == null) {
            C3965b bVar = new C3965b();
            try {
                bVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Object[0]);
                this.f6696e = bVar;
            } catch (RejectedExecutionException unused) {
            }
        }
    }

    /* renamed from: b */
    private synchronized void m11432b() {
        AsyncTask<?, ?, ?> asyncTask = this.f6696e;
        if (asyncTask != null) {
            if (asyncTask.getStatus() != AsyncTask.Status.FINISHED) {
                this.f6696e.cancel(true);
            }
            this.f6696e = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:8|9|10|11) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0019 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo26493c() {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.f6694c     // Catch:{ all -> 0x001e }
            if (r0 == 0) goto L_0x001c
            r0 = 0
            r1.f6696e = r0     // Catch:{ all -> 0x001e }
            boolean r0 = r1.f6692a     // Catch:{ all -> 0x001e }
            if (r0 != 0) goto L_0x001c
            boolean r0 = r1.f6693b     // Catch:{ all -> 0x001e }
            if (r0 != 0) goto L_0x001c
            android.hardware.Camera r0 = r1.f6695d     // Catch:{ RuntimeException -> 0x0019 }
            r0.autoFocus(r1)     // Catch:{ RuntimeException -> 0x0019 }
            r0 = 1
            r1.f6693b = r0     // Catch:{ RuntimeException -> 0x0019 }
            goto L_0x001c
        L_0x0019:
            r1.m11431a()     // Catch:{ all -> 0x001e }
        L_0x001c:
            monitor-exit(r1)
            return
        L_0x001e:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p124a4.C3963a.mo26493c():void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public synchronized void mo26494d() {
        this.f6692a = true;
        if (this.f6694c) {
            m11432b();
            try {
                this.f6695d.cancelAutoFocus();
            } catch (RuntimeException unused) {
            }
        }
    }

    public synchronized void onAutoFocus(boolean z, Camera camera) {
        this.f6693b = false;
        m11431a();
    }
}
