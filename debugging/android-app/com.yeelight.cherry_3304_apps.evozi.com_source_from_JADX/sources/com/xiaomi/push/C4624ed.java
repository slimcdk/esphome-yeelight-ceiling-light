package com.xiaomi.push;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.C3989b;
import com.xiaomi.push.C4498ai;

/* renamed from: com.xiaomi.push.ed */
public abstract class C4624ed extends C4498ai.C4499a {

    /* renamed from: a */
    protected int f8437a;

    /* renamed from: a */
    protected Context f8438a;

    public C4624ed(Context context, int i) {
        this.f8437a = i;
        this.f8438a = context;
    }

    /* renamed from: a */
    public static void m13797a(Context context, C4747hu huVar) {
        C4609dp a = C4610dq.mo24924a().mo24924a();
        String a2 = a == null ? "" : a.mo22969a();
        if (!TextUtils.isEmpty(a2) && !TextUtils.isEmpty(huVar.mo25297a())) {
            m13798a(context, huVar, a2);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(10:34|35|40|41|(0)|48|49|23|50|51) */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:13|14|(3:16|17|(2:19|20))|21|22) */
    /* JADX WARNING: Can't wrap try/catch for region: R(8:32|33|56|58|59|60|61|62) */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0093, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0095, code lost:
        r7 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00a9, code lost:
        throw r6;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:16:0x0056, B:40:0x007f] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x005f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:48:0x008d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:60:0x00a1 */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0084 A[SYNTHETIC, Splitter:B:43:0x0084] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:60:0x00a1=Splitter:B:60:0x00a1, B:48:0x008d=Splitter:B:48:0x008d, B:21:0x005f=Splitter:B:21:0x005f, B:40:0x007f=Splitter:B:40:0x007f} */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m13798a(android.content.Context r6, com.xiaomi.push.C4747hu r7, java.lang.String r8) {
        /*
            byte[] r7 = com.xiaomi.push.C4776iw.m15225a(r7)
            byte[] r7 = com.xiaomi.push.C4614du.m13764b(r8, r7)
            if (r7 == 0) goto L_0x00aa
            int r8 = r7.length
            if (r8 != 0) goto L_0x000f
            goto L_0x00aa
        L_0x000f:
            java.lang.Object r8 = com.xiaomi.push.C4615dv.f8428a
            monitor-enter(r8)
            r0 = 0
            java.io.File r1 = new java.io.File     // Catch:{ IOException -> 0x007c, all -> 0x0078 }
            java.io.File r2 = r6.getExternalFilesDir(r0)     // Catch:{ IOException -> 0x007c, all -> 0x0078 }
            java.lang.String r3 = "push_cdata.lock"
            r1.<init>(r2, r3)     // Catch:{ IOException -> 0x007c, all -> 0x0078 }
            com.xiaomi.push.C4942y.m15883a((java.io.File) r1)     // Catch:{ IOException -> 0x007c, all -> 0x0078 }
            java.io.RandomAccessFile r2 = new java.io.RandomAccessFile     // Catch:{ IOException -> 0x007c, all -> 0x0078 }
            java.lang.String r3 = "rw"
            r2.<init>(r1, r3)     // Catch:{ IOException -> 0x007c, all -> 0x0078 }
            java.nio.channels.FileChannel r1 = r2.getChannel()     // Catch:{ IOException -> 0x0075, all -> 0x0072 }
            java.nio.channels.FileLock r1 = r1.lock()     // Catch:{ IOException -> 0x0075, all -> 0x0072 }
            java.io.File r3 = new java.io.File     // Catch:{ IOException -> 0x006e, all -> 0x006a }
            java.io.File r6 = r6.getExternalFilesDir(r0)     // Catch:{ IOException -> 0x006e, all -> 0x006a }
            java.lang.String r4 = "push_cdata.data"
            r3.<init>(r6, r4)     // Catch:{ IOException -> 0x006e, all -> 0x006a }
            java.io.BufferedOutputStream r6 = new java.io.BufferedOutputStream     // Catch:{ IOException -> 0x006e, all -> 0x006a }
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x006e, all -> 0x006a }
            r5 = 1
            r4.<init>(r3, r5)     // Catch:{ IOException -> 0x006e, all -> 0x006a }
            r6.<init>(r4)     // Catch:{ IOException -> 0x006e, all -> 0x006a }
            int r0 = r7.length     // Catch:{ IOException -> 0x0068, all -> 0x0066 }
            byte[] r0 = com.xiaomi.push.C4492ac.m13261a((int) r0)     // Catch:{ IOException -> 0x0068, all -> 0x0066 }
            r6.write(r0)     // Catch:{ IOException -> 0x0068, all -> 0x0066 }
            r6.write(r7)     // Catch:{ IOException -> 0x0068, all -> 0x0066 }
            r6.flush()     // Catch:{ IOException -> 0x0068, all -> 0x0066 }
            if (r1 == 0) goto L_0x005f
            boolean r7 = r1.isValid()     // Catch:{ all -> 0x0093 }
            if (r7 == 0) goto L_0x005f
            r1.release()     // Catch:{ IOException -> 0x005f }
        L_0x005f:
            com.xiaomi.push.C4942y.m15884a((java.io.Closeable) r6)     // Catch:{ all -> 0x0093 }
        L_0x0062:
            com.xiaomi.push.C4942y.m15884a((java.io.Closeable) r2)     // Catch:{ all -> 0x0093 }
            goto L_0x0091
        L_0x0066:
            r7 = move-exception
            goto L_0x006c
        L_0x0068:
            r7 = move-exception
            goto L_0x0070
        L_0x006a:
            r7 = move-exception
            r6 = r0
        L_0x006c:
            r0 = r1
            goto L_0x0096
        L_0x006e:
            r7 = move-exception
            r6 = r0
        L_0x0070:
            r0 = r1
            goto L_0x007f
        L_0x0072:
            r7 = move-exception
            r6 = r0
            goto L_0x0096
        L_0x0075:
            r7 = move-exception
            r6 = r0
            goto L_0x007f
        L_0x0078:
            r7 = move-exception
            r6 = r0
            r2 = r6
            goto L_0x0096
        L_0x007c:
            r7 = move-exception
            r6 = r0
            r2 = r6
        L_0x007f:
            r7.printStackTrace()     // Catch:{ all -> 0x0095 }
            if (r0 == 0) goto L_0x008d
            boolean r7 = r0.isValid()     // Catch:{ all -> 0x0093 }
            if (r7 == 0) goto L_0x008d
            r0.release()     // Catch:{ IOException -> 0x008d }
        L_0x008d:
            com.xiaomi.push.C4942y.m15884a((java.io.Closeable) r6)     // Catch:{ all -> 0x0093 }
            goto L_0x0062
        L_0x0091:
            monitor-exit(r8)     // Catch:{ all -> 0x0093 }
            return
        L_0x0093:
            r6 = move-exception
            goto L_0x00a8
        L_0x0095:
            r7 = move-exception
        L_0x0096:
            if (r0 == 0) goto L_0x00a1
            boolean r1 = r0.isValid()     // Catch:{ all -> 0x0093 }
            if (r1 == 0) goto L_0x00a1
            r0.release()     // Catch:{ IOException -> 0x00a1 }
        L_0x00a1:
            com.xiaomi.push.C4942y.m15884a((java.io.Closeable) r6)     // Catch:{ all -> 0x0093 }
            com.xiaomi.push.C4942y.m15884a((java.io.Closeable) r2)     // Catch:{ all -> 0x0093 }
            throw r7     // Catch:{ all -> 0x0093 }
        L_0x00a8:
            monitor-exit(r8)     // Catch:{ all -> 0x0093 }
            throw r6
        L_0x00aa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.C4624ed.m13798a(android.content.Context, com.xiaomi.push.hu, java.lang.String):void");
    }

    /* renamed from: a */
    public abstract C4741ho mo22734a();

    /* renamed from: a */
    public abstract String m13800a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean m13801a() {
        return C4614du.m13762a(this.f8438a, String.valueOf(mo22734a()), (long) this.f8437a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo24937b() {
        return true;
    }

    public void run() {
        if (mo22734a()) {
            C3989b.m10669a("DC run job mutual: " + mo22734a());
            return;
        }
        C4609dp a = C4610dq.mo24924a().mo24924a();
        String a2 = a == null ? "" : a.mo22969a();
        if (!TextUtils.isEmpty(a2) && mo24937b()) {
            String a3 = mo22734a();
            if (!TextUtils.isEmpty(a3)) {
                C4747hu huVar = new C4747hu();
                huVar.mo25296a(a3);
                huVar.mo25294a(System.currentTimeMillis());
                huVar.mo25295a(mo22734a());
                m13798a(this.f8438a, huVar, a2);
            }
        }
    }
}
