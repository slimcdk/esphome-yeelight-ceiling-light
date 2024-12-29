package com.xiaomi.mistatistic.sdk.controller;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.xiaomi.mistatistic.sdk.C4094b;
import com.xiaomi.mistatistic.sdk.MiStatInterface;
import com.xiaomi.mistatistic.sdk.controller.C4115d;

/* renamed from: com.xiaomi.mistatistic.sdk.controller.p */
public class C4154p {

    /* renamed from: a */
    private static C4154p f7124a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public boolean f7125b = false;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public int f7126c = 3;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public long f7127d;

    /* renamed from: e */
    private long f7128e;

    /* renamed from: f */
    private Handler f7129f = new Handler(Looper.getMainLooper()) {
        public void handleMessage(Message message) {
            C4115d dVar;
            C4115d.C4118a aVar;
            int i = message.what;
            if (i == 1) {
                dVar = C4115d.m11118a();
                aVar = new C4115d.C4118a() {
                    /* renamed from: a */
                    public void mo22986a() {
                        if (C4154p.this.mo23101e()) {
                            new C4139l().mo23077a();
                        }
                    }
                };
            } else if (i == 2) {
                boolean unused = C4154p.this.f7125b = true;
                dVar = C4115d.m11118a();
                aVar = new C4115d.C4118a() {
                    /* renamed from: a */
                    public void mo22986a() {
                        if (C4154p.this.mo23101e() || C4154p.this.f7126c == 3) {
                            new C4139l().mo23077a();
                        }
                    }
                };
            } else {
                return;
            }
            dVar.mo23037a(aVar);
        }
    };

    private C4154p() {
    }

    /* renamed from: a */
    public static synchronized C4154p m11271a() {
        C4154p pVar;
        synchronized (C4154p.class) {
            if (f7124a == null) {
                f7124a = new C4154p();
            }
            pVar = f7124a;
        }
        return pVar;
    }

    /* renamed from: a */
    public void mo23097a(final int i, final long j) {
        C4115d.m11118a().mo23037a((C4115d.C4118a) new C4115d.C4118a() {
            /* renamed from: a */
            public void mo22986a() {
                long j;
                C4154p pVar;
                int unused = C4154p.this.f7126c = i;
                if (C4154p.this.f7126c == 4) {
                    pVar = C4154p.this;
                    j = j;
                } else {
                    pVar = C4154p.this;
                    j = -1;
                }
                long unused2 = pVar.f7127d = j;
                Context a = C4113c.m11105a();
                C4137k.m11210b(a, "upload_policy", C4154p.this.f7126c);
                if (C4154p.this.f7126c == 4) {
                    C4137k.m11211b(a, "upload_interval", C4154p.this.f7127d);
                    C4115d.m11118a().mo23038a((C4115d.C4118a) new C4115d.C4118a() {
                        /* renamed from: a */
                        public void mo22986a() {
                            if (C4154p.this.mo23101e()) {
                                new C4139l().mo23077a();
                            }
                        }
                    }, C4154p.this.f7127d);
                }
            }
        });
    }

    /* renamed from: b */
    public void mo23098b() {
        C4115d.m11118a().mo23037a((C4115d.C4118a) new C4115d.C4118a() {
            /* renamed from: a */
            public void mo22986a() {
                Context a = C4113c.m11105a();
                int unused = C4154p.this.f7126c = C4137k.m11202a(a, "upload_policy", 4);
                if (C4154p.this.f7126c == 4) {
                    long unused2 = C4154p.this.f7127d = C4137k.m11203a(a, "upload_interval", 180000);
                } else {
                    long unused3 = C4154p.this.f7127d = -1;
                }
            }
        });
        this.f7129f.sendEmptyMessageDelayed(2, 5000);
    }

    /* renamed from: c */
    public void mo23099c() {
        String str;
        try {
            if (!this.f7129f.hasMessages(1)) {
                if (this.f7126c == 4) {
                    this.f7129f.sendEmptyMessageDelayed(1, this.f7127d);
                    str = "onEventRecorded, no MESSAGE_UPLOAD_EVENT, send a msg for UPLOAD_POLICY_INTERVAL " + this.f7127d;
                } else {
                    if (this.f7126c != 0) {
                        if (this.f7126c != 1) {
                            this.f7129f.sendEmptyMessage(1);
                            str = "onEventRecorded, no MESSAGE_UPLOAD_EVENT, send a msg for UPLOAD_POLICY " + this.f7126c;
                        }
                    }
                    this.f7129f.sendEmptyMessageDelayed(1, MiStatInterface.MIN_UPLOAD_INTERVAL);
                    C4130h.m11175a("UPE", "onEventRecorded, no MESSAGE_UPLOAD_EVENT, send a msg for UPLOAD_POLICY %d with delay %dms ", Integer.valueOf(this.f7126c), Long.valueOf(MiStatInterface.MIN_UPLOAD_INTERVAL));
                    return;
                }
                C4130h.m11173a("UPE", str);
            }
        } catch (Exception e) {
            C4130h.m11176a("onEventRecorded exception: ", (Throwable) e);
        }
    }

    /* renamed from: d */
    public void mo23100d() {
        this.f7128e = System.currentTimeMillis();
        C4115d.m11120b().mo23037a((C4115d.C4118a) new C4115d.C4118a() {
            /* renamed from: a */
            public void mo22986a() {
                if (MiStatInterface.isExceptionCatcherEnabled() && !MiStatInterface.shouldExceptionUploadImmediately()) {
                    for (C4094b.C4097a a : C4094b.m11026b()) {
                        C4094b.m11023a(a, false);
                    }
                    C4094b.m11027c();
                }
            }
        });
    }

    /* renamed from: e */
    public boolean mo23101e() {
        if (C4139l.m11222b()) {
            C4130h.m11172a("RemoteDataUploadManager isUploading, should NOT upload now");
            return false;
        }
        int i = this.f7126c;
        if (i == 0) {
            return true;
        }
        if (i != 1) {
            if (i == 2) {
                int d = new C4122f().mo23056d();
                if (!this.f7125b && d < 50) {
                    return false;
                }
                this.f7125b = false;
                return true;
            } else if (i == 4) {
                long currentTimeMillis = System.currentTimeMillis();
                if (!this.f7125b && currentTimeMillis - this.f7128e <= this.f7127d) {
                    return false;
                }
                this.f7125b = false;
                return true;
            }
        } else if (C4132j.m11193a(C4113c.m11105a())) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public long mo23102f() {
        return this.f7127d;
    }

    /* renamed from: g */
    public int mo23103g() {
        return this.f7126c;
    }
}
