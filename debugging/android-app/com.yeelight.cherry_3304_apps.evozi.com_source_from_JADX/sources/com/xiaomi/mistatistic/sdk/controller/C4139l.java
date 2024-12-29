package com.xiaomi.mistatistic.sdk.controller;

import android.app.ActivityManager;
import android.os.Build;
import android.text.TextUtils;
import com.xiaomi.mipush.sdk.Constants;
import com.xiaomi.mistatistic.sdk.CustomSettings;
import com.xiaomi.mistatistic.sdk.controller.C4115d;
import com.xiaomi.mistatistic.sdk.controller.asyncjobs.C4106b;
import com.xiaomi.mistatistic.sdk.controller.asyncjobs.C4109c;
import com.xiaomi.mistatistic.sdk.data.C4172h;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.xiaomi.mistatistic.sdk.controller.l */
public class C4139l {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static AtomicBoolean f7089a = new AtomicBoolean(false);

    /* renamed from: com.xiaomi.mistatistic.sdk.controller.l$a */
    public class C4144a implements C4115d.C4118a {
        public C4144a() {
        }

        /* renamed from: a */
        public void mo22986a() {
            C4139l.this.mo23078a(false);
        }
    }

    /* renamed from: a */
    public static void m11216a(long j) {
        long currentTimeMillis = System.currentTimeMillis() + j;
        C4137k.m11211b(C4113c.m11105a(), "next_upload_ts", currentTimeMillis);
        C4130h.m11175a("RDUM", "update next upload time to %d according to server delay %dms", Long.valueOf(currentTimeMillis), Long.valueOf(j));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m11217a(long j, long j2) {
        final long j3 = j;
        final long j4 = j2;
        C4115d.m11118a().mo23037a((C4115d.C4118a) new C4115d.C4118a() {
            /* renamed from: a */
            public void mo22986a() {
                try {
                    new C4122f().mo23045a(j3, j4);
                } catch (Throwable th) {
                    C4130h.m11174a("RDUM", "doDeleting exception: ", th);
                }
                C4139l.f7089a.set(false);
                C4130h.m11173a("RDUM", "delete done, set Uploading " + C4139l.f7089a.get());
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m11221a(String str, long j, long j2, int i) {
        final long j3 = j;
        final long j4 = j2;
        C4115d.m11120b().mo23037a((C4115d.C4118a) new C4109c(str, new C4109c.C4111a() {
            /* renamed from: a */
            public void mo23034a(boolean z) {
                if (z) {
                    C4139l.this.m11217a(j3, j4);
                    return;
                }
                C4139l.f7089a.set(false);
                C4130h.m11173a("RDUM", "upload failed, set Uploading " + C4139l.f7089a.get());
            }
        }, i));
    }

    /* renamed from: b */
    public static boolean m11222b() {
        return f7089a.get();
    }

    /* renamed from: c */
    public static boolean m11223c() {
        return System.currentTimeMillis() > C4137k.m11203a(C4113c.m11105a(), "next_upload_ts", 0);
    }

    /* renamed from: e */
    private void m11225e() {
        C4115d.m11118a().mo23037a((C4115d.C4118a) new C4106b(C4154p.m11271a().mo23102f(), new C4106b.C4107a() {
            /* renamed from: a */
            public void mo23033a(String str, long j, long j2, int i) {
                if (!TextUtils.isEmpty(str)) {
                    C4139l.this.m11221a(str, j, j2, i);
                    return;
                }
                C4139l.f7089a.set(false);
                C4130h.m11173a("RDUM", "packing completed with empty data, set Uploading " + C4139l.f7089a.get());
            }
        }));
    }

    /* renamed from: f */
    private void m11226f() {
        C4115d.m11118a().mo23037a((C4115d.C4118a) new C4115d.C4118a() {
            /* renamed from: a */
            public void mo22986a() {
                C4139l.this.m11227g();
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m11227g() {
        try {
            if (CustomSettings.isUploadForegroundPackageEnabled() && Build.VERSION.SDK_INT <= 21) {
                ArrayList arrayList = new ArrayList();
                List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) C4113c.m11105a().getSystemService("activity")).getRunningAppProcesses();
                if (runningAppProcesses != null) {
                    for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
                        if (next.importance == 100) {
                            arrayList.add(next.processName);
                        }
                    }
                    LocalEventRecorder.insertEvent(new C4172h("mistat_basic", "foreground_package", TextUtils.join(Constants.ACCEPT_TIME_SEPARATOR_SP, arrayList)));
                }
            }
        } catch (Throwable th) {
            C4130h.m11176a("", th);
        }
    }

    /* renamed from: a */
    public void mo23077a() {
        mo23078a(true);
    }

    /* renamed from: a */
    public void mo23078a(boolean z) {
        if (!CustomSettings.isDataUploadingEnabled()) {
            C4130h.m11176a("upload is disabled.", (Throwable) null);
            return;
        }
        C4130h.m11172a("trigger upload job with retry: " + z);
        if (f7089a.compareAndSet(false, true)) {
            C4130h.m11183d("upload job start, set Uploading " + f7089a.get());
            if (m11223c()) {
                m11226f();
                m11225e();
                C4154p.m11271a().mo23100d();
                return;
            }
            f7089a.set(false);
            C4130h.m11183d("upload is not allowed by the server. set Uploading " + f7089a.get());
        } else if (z) {
            C4130h.m11172a(String.format("sUploading %s, trigger uploading job with delay %d", new Object[]{Boolean.valueOf(f7089a.get()), 10000L}));
            C4115d.m11118a().mo23038a((C4115d.C4118a) new C4144a(), 10000);
        }
    }
}
