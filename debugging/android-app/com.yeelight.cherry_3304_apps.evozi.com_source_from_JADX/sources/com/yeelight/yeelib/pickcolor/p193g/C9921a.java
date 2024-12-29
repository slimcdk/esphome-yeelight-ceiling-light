package com.yeelight.yeelib.pickcolor.p193g;

import android.hardware.Camera;
import android.os.AsyncTask;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: com.yeelight.yeelib.pickcolor.g.a */
final class C9921a implements Camera.AutoFocusCallback {

    /* renamed from: f */
    private static final String f18082f = C9921a.class.getSimpleName();

    /* renamed from: g */
    private static final Collection<String> f18083g;

    /* renamed from: a */
    private boolean f18084a;

    /* renamed from: b */
    private boolean f18085b;

    /* renamed from: c */
    private final boolean f18086c;

    /* renamed from: d */
    private final Camera f18087d;

    /* renamed from: e */
    private AsyncTask<?, ?, ?> f18088e;

    /* renamed from: com.yeelight.yeelib.pickcolor.g.a$b */
    private final class C9923b extends AsyncTask<Object, Object, Object> {
        private C9923b() {
        }

        /* access modifiers changed from: protected */
        public Object doInBackground(Object... objArr) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException unused) {
            }
            C9921a.this.mo32060c();
            return null;
        }
    }

    static {
        ArrayList arrayList = new ArrayList(2);
        f18083g = arrayList;
        arrayList.add("auto");
        f18083g.add("macro");
    }

    C9921a(Camera camera) {
        this.f18087d = camera;
        String focusMode = camera.getParameters().getFocusMode();
        this.f18086c = f18083g.contains(focusMode);
        "Current focus mode '" + focusMode + "'; use auto focus? " + this.f18086c;
        mo32060c();
    }

    /* renamed from: a */
    private synchronized void m24342a() {
        if (!this.f18084a && this.f18088e == null) {
            C9923b bVar = new C9923b();
            try {
                bVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Object[0]);
                this.f18088e = bVar;
            } catch (RejectedExecutionException unused) {
            }
        }
    }

    /* renamed from: b */
    private synchronized void m24343b() {
        if (this.f18088e != null) {
            if (this.f18088e.getStatus() != AsyncTask.Status.FINISHED) {
                this.f18088e.cancel(true);
            }
            this.f18088e = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:8|9|10|11) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0019 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo32060c() {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.f18086c     // Catch:{ all -> 0x001e }
            if (r0 == 0) goto L_0x001c
            r0 = 0
            r1.f18088e = r0     // Catch:{ all -> 0x001e }
            boolean r0 = r1.f18084a     // Catch:{ all -> 0x001e }
            if (r0 != 0) goto L_0x001c
            boolean r0 = r1.f18085b     // Catch:{ all -> 0x001e }
            if (r0 != 0) goto L_0x001c
            android.hardware.Camera r0 = r1.f18087d     // Catch:{ RuntimeException -> 0x0019 }
            r0.autoFocus(r1)     // Catch:{ RuntimeException -> 0x0019 }
            r0 = 1
            r1.f18085b = r0     // Catch:{ RuntimeException -> 0x0019 }
            goto L_0x001c
        L_0x0019:
            r1.m24342a()     // Catch:{ all -> 0x001e }
        L_0x001c:
            monitor-exit(r1)
            return
        L_0x001e:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.pickcolor.p193g.C9921a.mo32060c():void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public synchronized void mo32061d() {
        this.f18084a = true;
        if (this.f18086c) {
            m24343b();
            try {
                this.f18087d.cancelAutoFocus();
            } catch (RuntimeException unused) {
            }
        }
    }

    public synchronized void onAutoFocus(boolean z, Camera camera) {
        this.f18085b = false;
        m24342a();
    }
}
