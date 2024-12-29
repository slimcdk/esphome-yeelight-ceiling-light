package com.xiaomi.push;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.C4408b;
import com.xiaomi.push.C4516al;
import com.xiaomi.push.service.C4898ba;

/* renamed from: com.xiaomi.push.dt */
public abstract class C4632dt extends C4516al.C4517a {

    /* renamed from: a */
    protected int f7835a;

    /* renamed from: a */
    protected Context f7836a;

    public C4632dt(Context context, int i) {
        this.f7835a = i;
        this.f7836a = context;
    }

    /* renamed from: a */
    public static void m13344a(Context context, C4768hr hrVar) {
        C4624dm a = C4625dn.mo28915a().mo28915a();
        String a2 = a == null ? "" : a.mo28723a();
        if (!TextUtils.isEmpty(a2) && !TextUtils.isEmpty(hrVar.mo29328a())) {
            m13345a(context, hrVar, a2);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(10:34|35|40|41|(0)|48|49|23|50|51) */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:11|12|13|14|(3:16|17|(2:19|20))|21|22) */
    /* JADX WARNING: Can't wrap try/catch for region: R(8:32|33|56|58|59|60|61|62) */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0098, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x009a, code lost:
        r7 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00ae, code lost:
        throw r6;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:16:0x005b, B:40:0x0084] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0064 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:48:0x0092 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:60:0x00a6 */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0089 A[SYNTHETIC, Splitter:B:43:0x0089] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:48:0x0092=Splitter:B:48:0x0092, B:21:0x0064=Splitter:B:21:0x0064, B:40:0x0084=Splitter:B:40:0x0084, B:60:0x00a6=Splitter:B:60:0x00a6} */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m13345a(android.content.Context r6, com.xiaomi.push.C4768hr r7, java.lang.String r8) {
        /*
            byte[] r7 = com.xiaomi.push.C4797it.m14834a(r7)
            byte[] r7 = com.xiaomi.push.C4627dp.m13335b(r8, r7)
            if (r7 == 0) goto L_0x00af
            int r8 = r7.length
            if (r8 != 0) goto L_0x000f
            goto L_0x00af
        L_0x000f:
            java.lang.Object r8 = com.xiaomi.push.C4628dq.f7828a
            monitor-enter(r8)
            r0 = 0
            java.io.File r1 = new java.io.File     // Catch:{ IOException -> 0x0081, all -> 0x007d }
            java.io.File r2 = r6.getExternalFilesDir(r0)     // Catch:{ IOException -> 0x0081, all -> 0x007d }
            java.lang.String r3 = "push_cdata.lock"
            r1.<init>(r2, r3)     // Catch:{ IOException -> 0x0081, all -> 0x007d }
            com.xiaomi.push.C4506ab.m12830a((java.io.File) r1)     // Catch:{ IOException -> 0x0081, all -> 0x007d }
            java.io.RandomAccessFile r2 = new java.io.RandomAccessFile     // Catch:{ IOException -> 0x0081, all -> 0x007d }
            java.lang.String r3 = "rw"
            r2.<init>(r1, r3)     // Catch:{ IOException -> 0x0081, all -> 0x007d }
            java.nio.channels.FileChannel r1 = r2.getChannel()     // Catch:{ IOException -> 0x007a, all -> 0x0077 }
            java.nio.channels.FileLock r1 = r1.lock()     // Catch:{ IOException -> 0x007a, all -> 0x0077 }
            java.io.File r3 = new java.io.File     // Catch:{ IOException -> 0x0073, all -> 0x006f }
            java.io.File r6 = r6.getExternalFilesDir(r0)     // Catch:{ IOException -> 0x0073, all -> 0x006f }
            java.lang.String r4 = "push_cdata.data"
            r3.<init>(r6, r4)     // Catch:{ IOException -> 0x0073, all -> 0x006f }
            java.io.BufferedOutputStream r6 = new java.io.BufferedOutputStream     // Catch:{ IOException -> 0x0073, all -> 0x006f }
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0073, all -> 0x006f }
            r5 = 1
            r4.<init>(r3, r5)     // Catch:{ IOException -> 0x0073, all -> 0x006f }
            r6.<init>(r4)     // Catch:{ IOException -> 0x0073, all -> 0x006f }
            int r0 = r7.length     // Catch:{ IOException -> 0x006d, all -> 0x006b }
            byte[] r0 = com.xiaomi.push.C4510af.m12848a((int) r0)     // Catch:{ IOException -> 0x006d, all -> 0x006b }
            r6.write(r0)     // Catch:{ IOException -> 0x006d, all -> 0x006b }
            r6.write(r7)     // Catch:{ IOException -> 0x006d, all -> 0x006b }
            r6.flush()     // Catch:{ IOException -> 0x006d, all -> 0x006b }
            r4 = 0
            r3.setLastModified(r4)     // Catch:{ IOException -> 0x006d, all -> 0x006b }
            if (r1 == 0) goto L_0x0064
            boolean r7 = r1.isValid()     // Catch:{ all -> 0x0098 }
            if (r7 == 0) goto L_0x0064
            r1.release()     // Catch:{ IOException -> 0x0064 }
        L_0x0064:
            com.xiaomi.push.C4506ab.m12831a((java.io.Closeable) r6)     // Catch:{ all -> 0x0098 }
        L_0x0067:
            com.xiaomi.push.C4506ab.m12831a((java.io.Closeable) r2)     // Catch:{ all -> 0x0098 }
            goto L_0x0096
        L_0x006b:
            r7 = move-exception
            goto L_0x0071
        L_0x006d:
            r7 = move-exception
            goto L_0x0075
        L_0x006f:
            r7 = move-exception
            r6 = r0
        L_0x0071:
            r0 = r1
            goto L_0x009b
        L_0x0073:
            r7 = move-exception
            r6 = r0
        L_0x0075:
            r0 = r1
            goto L_0x0084
        L_0x0077:
            r7 = move-exception
            r6 = r0
            goto L_0x009b
        L_0x007a:
            r7 = move-exception
            r6 = r0
            goto L_0x0084
        L_0x007d:
            r7 = move-exception
            r6 = r0
            r2 = r6
            goto L_0x009b
        L_0x0081:
            r7 = move-exception
            r6 = r0
            r2 = r6
        L_0x0084:
            r7.printStackTrace()     // Catch:{ all -> 0x009a }
            if (r0 == 0) goto L_0x0092
            boolean r7 = r0.isValid()     // Catch:{ all -> 0x0098 }
            if (r7 == 0) goto L_0x0092
            r0.release()     // Catch:{ IOException -> 0x0092 }
        L_0x0092:
            com.xiaomi.push.C4506ab.m12831a((java.io.Closeable) r6)     // Catch:{ all -> 0x0098 }
            goto L_0x0067
        L_0x0096:
            monitor-exit(r8)     // Catch:{ all -> 0x0098 }
            return
        L_0x0098:
            r6 = move-exception
            goto L_0x00ad
        L_0x009a:
            r7 = move-exception
        L_0x009b:
            if (r0 == 0) goto L_0x00a6
            boolean r1 = r0.isValid()     // Catch:{ all -> 0x0098 }
            if (r1 == 0) goto L_0x00a6
            r0.release()     // Catch:{ IOException -> 0x00a6 }
        L_0x00a6:
            com.xiaomi.push.C4506ab.m12831a((java.io.Closeable) r6)     // Catch:{ all -> 0x0098 }
            com.xiaomi.push.C4506ab.m12831a((java.io.Closeable) r2)     // Catch:{ all -> 0x0098 }
            throw r7     // Catch:{ all -> 0x0098 }
        L_0x00ad:
            monitor-exit(r8)     // Catch:{ all -> 0x0098 }
            throw r6
        L_0x00af:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.C4632dt.m13345a(android.content.Context, com.xiaomi.push.hr, java.lang.String):void");
    }

    /* renamed from: c */
    private String mo28921c() {
        return "dc_job_result_time_" + mo28479a();
    }

    /* renamed from: d */
    private String m13347d() {
        return "dc_job_result_" + mo28479a();
    }

    /* renamed from: a */
    public abstract C4762hl mo28479a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean m13349a() {
        return C4627dp.m13333a(this.f7836a, String.valueOf(mo28479a()), (long) this.f7835a);
    }

    /* renamed from: b */
    public abstract String mo28920b();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean m13351b() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean m13352c() {
        return false;
    }

    public void run() {
        String b = mo28920b();
        if (!TextUtils.isEmpty(b)) {
            if (mo28479a()) {
                C4408b.m12464a("DC run job mutual: " + mo28479a());
                return;
            }
            C4624dm a = C4625dn.mo28915a().mo28915a();
            String a2 = a == null ? "" : a.mo28723a();
            if (!TextUtils.isEmpty(a2) && mo28920b()) {
                if (mo28921c()) {
                    SharedPreferences sharedPreferences = this.f7836a.getSharedPreferences("mipush_extra", 0);
                    if (C4561bp.m13042a(b).equals(sharedPreferences.getString(m13347d(), (String) null))) {
                        long j = sharedPreferences.getLong(mo28921c(), 0);
                        int a3 = C4898ba.m15362a(this.f7836a).mo29988a(C4765ho.DCJobUploadRepeatedInterval.mo29322a(), 604800);
                        if ((System.currentTimeMillis() - j) / 1000 >= ((long) this.f7835a)) {
                            if ((System.currentTimeMillis() - j) / 1000 < ((long) a3)) {
                                b = "same_" + j;
                            }
                        } else {
                            return;
                        }
                    }
                }
                C4768hr hrVar = new C4768hr();
                hrVar.mo29327a(b);
                hrVar.mo29325a(System.currentTimeMillis());
                hrVar.mo29326a(mo28479a());
                m13345a(this.f7836a, hrVar, a2);
            }
        }
    }
}
