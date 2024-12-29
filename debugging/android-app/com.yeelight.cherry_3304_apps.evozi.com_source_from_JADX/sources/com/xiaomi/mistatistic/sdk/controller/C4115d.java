package com.xiaomi.mistatistic.sdk.controller;

import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.xiaomi.mistatistic.sdk.controller.d */
public class C4115d {

    /* renamed from: a */
    private static C4115d f7045a;

    /* renamed from: b */
    private static C4115d f7046b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public volatile Handler f7047c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public ArrayList<C4118a> f7048d = new ArrayList<>();

    /* renamed from: com.xiaomi.mistatistic.sdk.controller.d$a */
    public interface C4118a {
        /* renamed from: a */
        void mo22986a();
    }

    /* renamed from: com.xiaomi.mistatistic.sdk.controller.d$b */
    private class C4119b extends HandlerThread {
        public C4119b(String str) {
            super(str);
        }

        /* access modifiers changed from: protected */
        public void onLooperPrepared() {
            ArrayList arrayList;
            Handler unused = C4115d.this.f7047c = new Handler();
            synchronized (C4115d.this.f7048d) {
                if (!C4115d.this.f7048d.isEmpty()) {
                    arrayList = (ArrayList) C4115d.this.f7048d.clone();
                    String valueOf = String.valueOf(C4115d.this.f7048d.size());
                    C4115d.this.f7048d.clear();
                    C4130h.m11172a("mPendingJob(cnt=" + valueOf + ") not empty, clone a job list and clear original list");
                } else {
                    arrayList = null;
                }
            }
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C4118a aVar = (C4118a) it.next();
                    try {
                        C4130h.m11172a("execute a pending job");
                        aVar.mo22986a();
                    } catch (Exception e) {
                        C4130h.m11176a("error while executing job.", (Throwable) e);
                    }
                }
            }
            super.onLooperPrepared();
        }
    }

    private C4115d(String str) {
        new C4119b(str).start();
    }

    /* renamed from: a */
    public static synchronized C4115d m11118a() {
        C4115d dVar;
        synchronized (C4115d.class) {
            if (f7045a == null) {
                f7045a = new C4115d("local_job_dispatcher");
            }
            dVar = f7045a;
        }
        return dVar;
    }

    /* renamed from: b */
    public static synchronized C4115d m11120b() {
        C4115d dVar;
        synchronized (C4115d.class) {
            if (f7046b == null) {
                f7046b = new C4115d("remote_job_dispatcher");
            }
            dVar = f7046b;
        }
        return dVar;
    }

    /* renamed from: a */
    public void mo23037a(final C4118a aVar) {
        synchronized (this.f7048d) {
            if (this.f7047c == null) {
                C4130h.m11172a("AsyncJobDispatcher.mHander is null, add job to pending queue");
                this.f7048d.add(aVar);
            } else {
                this.f7047c.post(new Runnable() {
                    public void run() {
                        try {
                            aVar.mo22986a();
                        } catch (Exception e) {
                            C4130h.m11176a("error while executing job.", (Throwable) e);
                        }
                    }
                });
            }
        }
    }

    /* renamed from: a */
    public void mo23038a(final C4118a aVar, final long j) {
        if (this.f7047c != null) {
            this.f7047c.postDelayed(new Runnable() {
                public void run() {
                    try {
                        C4130h.m11172a("AsyncJobDispatcher run a job with delay " + String.valueOf(j));
                        aVar.mo22986a();
                    } catch (Exception e) {
                        C4130h.m11176a("error while executing job.", (Throwable) e);
                    }
                }
            }, j);
        } else {
            C4130h.m11176a("drop the job as handler is not ready.", (Throwable) null);
        }
    }
}
