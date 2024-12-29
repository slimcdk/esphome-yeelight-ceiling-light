package com.xiaomi.push;

import android.content.Context;
import android.content.SharedPreferences;
import com.xiaomi.push.C4498ai;
import com.xiaomi.push.service.C4854ak;
import java.io.File;
import java.util.List;

/* renamed from: com.xiaomi.push.ei */
public class C4629ei extends C4498ai.C4499a {

    /* renamed from: a */
    private Context f8449a;

    /* renamed from: a */
    private SharedPreferences f8450a;

    /* renamed from: a */
    private C4854ak f8451a;

    public C4629ei(Context context) {
        this.f8449a = context;
        this.f8450a = context.getSharedPreferences("mipush_extra", 0);
        this.f8451a = C4854ak.m15568a(context);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(10:48|47|63|65|66|67|68|29|69|70) */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:13|14|(3:15|16|(2:75|18)(2:19|(1:76)(4:30|31|(1:77)(2:33|(2:35|78)(2:36|79))|74)))|(3:22|23|(2:25|26))|27|28) */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:45|46|(0)|57|58|59) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0066 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x009f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:67:0x00b3 */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0096 A[SYNTHETIC, Splitter:B:52:0x0096] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:67:0x00b3=Splitter:B:67:0x00b3, B:27:0x0066=Splitter:B:27:0x0066, B:57:0x009f=Splitter:B:57:0x009f} */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.util.List<com.xiaomi.push.C4747hu> m13825a(java.io.File r11) {
        /*
            r10 = this;
            com.xiaomi.push.dq r0 = com.xiaomi.push.C4610dq.mo24924a()
            com.xiaomi.push.dp r0 = r0.mo24924a()
            if (r0 != 0) goto L_0x000d
            java.lang.String r0 = ""
            goto L_0x0011
        L_0x000d:
            java.lang.String r0 = r0.mo22969a()
        L_0x0011:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r2 = 0
            if (r1 == 0) goto L_0x0019
            return r2
        L_0x0019:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r3 = 4
            byte[] r4 = new byte[r3]
            java.lang.Object r5 = com.xiaomi.push.C4615dv.f8428a
            monitor-enter(r5)
            java.io.File r6 = new java.io.File     // Catch:{ Exception -> 0x00a6, all -> 0x0091 }
            android.content.Context r7 = r10.f8449a     // Catch:{ Exception -> 0x00a6, all -> 0x0091 }
            java.io.File r7 = r7.getExternalFilesDir(r2)     // Catch:{ Exception -> 0x00a6, all -> 0x0091 }
            java.lang.String r8 = "push_cdata.lock"
            r6.<init>(r7, r8)     // Catch:{ Exception -> 0x00a6, all -> 0x0091 }
            com.xiaomi.push.C4942y.m15883a((java.io.File) r6)     // Catch:{ Exception -> 0x00a6, all -> 0x0091 }
            java.io.RandomAccessFile r7 = new java.io.RandomAccessFile     // Catch:{ Exception -> 0x00a6, all -> 0x0091 }
            java.lang.String r8 = "rw"
            r7.<init>(r6, r8)     // Catch:{ Exception -> 0x00a6, all -> 0x0091 }
            java.nio.channels.FileChannel r6 = r7.getChannel()     // Catch:{ Exception -> 0x008f, all -> 0x008c }
            java.nio.channels.FileLock r6 = r6.lock()     // Catch:{ Exception -> 0x008f, all -> 0x008c }
            java.io.FileInputStream r8 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0089, all -> 0x0085 }
            r8.<init>(r11)     // Catch:{ Exception -> 0x0089, all -> 0x0085 }
        L_0x0048:
            int r11 = r8.read(r4)     // Catch:{ Exception -> 0x008a, all -> 0x0083 }
            if (r11 == r3) goto L_0x004f
            goto L_0x005b
        L_0x004f:
            int r11 = com.xiaomi.push.C4492ac.m13260a((byte[]) r4)     // Catch:{ Exception -> 0x008a, all -> 0x0083 }
            byte[] r2 = new byte[r11]     // Catch:{ Exception -> 0x008a, all -> 0x0083 }
            int r9 = r8.read(r2)     // Catch:{ Exception -> 0x008a, all -> 0x0083 }
            if (r9 == r11) goto L_0x006d
        L_0x005b:
            if (r6 == 0) goto L_0x0066
            boolean r11 = r6.isValid()     // Catch:{ all -> 0x00b9 }
            if (r11 == 0) goto L_0x0066
            r6.release()     // Catch:{ IOException -> 0x0066 }
        L_0x0066:
            com.xiaomi.push.C4942y.m15884a((java.io.Closeable) r8)     // Catch:{ all -> 0x00b9 }
        L_0x0069:
            com.xiaomi.push.C4942y.m15884a((java.io.Closeable) r7)     // Catch:{ all -> 0x00b9 }
            goto L_0x00b7
        L_0x006d:
            byte[] r11 = com.xiaomi.push.C4614du.m13763a(r0, r2)     // Catch:{ Exception -> 0x008a, all -> 0x0083 }
            if (r11 == 0) goto L_0x0048
            int r2 = r11.length     // Catch:{ Exception -> 0x008a, all -> 0x0083 }
            if (r2 != 0) goto L_0x0077
            goto L_0x0048
        L_0x0077:
            com.xiaomi.push.hu r2 = new com.xiaomi.push.hu     // Catch:{ Exception -> 0x008a, all -> 0x0083 }
            r2.<init>()     // Catch:{ Exception -> 0x008a, all -> 0x0083 }
            com.xiaomi.push.C4776iw.m15224a(r2, (byte[]) r11)     // Catch:{ Exception -> 0x008a, all -> 0x0083 }
            r1.add(r2)     // Catch:{ Exception -> 0x008a, all -> 0x0083 }
            goto L_0x0048
        L_0x0083:
            r11 = move-exception
            goto L_0x0087
        L_0x0085:
            r11 = move-exception
            r8 = r2
        L_0x0087:
            r2 = r6
            goto L_0x0094
        L_0x0089:
            r8 = r2
        L_0x008a:
            r2 = r6
            goto L_0x00a8
        L_0x008c:
            r11 = move-exception
            r8 = r2
            goto L_0x0094
        L_0x008f:
            r8 = r2
            goto L_0x00a8
        L_0x0091:
            r11 = move-exception
            r7 = r2
            r8 = r7
        L_0x0094:
            if (r2 == 0) goto L_0x009f
            boolean r0 = r2.isValid()     // Catch:{ all -> 0x00b9 }
            if (r0 == 0) goto L_0x009f
            r2.release()     // Catch:{ IOException -> 0x009f }
        L_0x009f:
            com.xiaomi.push.C4942y.m15884a((java.io.Closeable) r8)     // Catch:{ all -> 0x00b9 }
            com.xiaomi.push.C4942y.m15884a((java.io.Closeable) r7)     // Catch:{ all -> 0x00b9 }
            throw r11     // Catch:{ all -> 0x00b9 }
        L_0x00a6:
            r7 = r2
            r8 = r7
        L_0x00a8:
            if (r2 == 0) goto L_0x00b3
            boolean r11 = r2.isValid()     // Catch:{ all -> 0x00b9 }
            if (r11 == 0) goto L_0x00b3
            r2.release()     // Catch:{ IOException -> 0x00b3 }
        L_0x00b3:
            com.xiaomi.push.C4942y.m15884a((java.io.Closeable) r8)     // Catch:{ all -> 0x00b9 }
            goto L_0x0069
        L_0x00b7:
            monitor-exit(r5)     // Catch:{ all -> 0x00b9 }
            return r1
        L_0x00b9:
            r11 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x00b9 }
            goto L_0x00bd
        L_0x00bc:
            throw r11
        L_0x00bd:
            goto L_0x00bc
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.C4629ei.m13825a(java.io.File):java.util.List");
    }

    /* renamed from: a */
    private void mo22734a() {
        SharedPreferences.Editor edit = this.f8450a.edit();
        edit.putLong("last_upload_data_timestamp", System.currentTimeMillis() / 1000);
        edit.commit();
    }

    /* renamed from: a */
    private boolean m13827a() {
        if (C4521az.m13368d(this.f8449a)) {
            return false;
        }
        if (!C4521az.m13370f(this.f8449a) || m13829c()) {
            return (C4521az.m13371g(this.f8449a) && !m13828b()) || C4521az.m13372h(this.f8449a);
        }
        return true;
    }

    /* renamed from: b */
    private boolean m13828b() {
        if (!this.f8451a.mo25911a(C4744hr.Upload3GSwitch.mo25291a(), true)) {
            return false;
        }
        return Math.abs((System.currentTimeMillis() / 1000) - this.f8450a.getLong("last_upload_data_timestamp", -1)) > ((long) Math.max(86400, this.f8451a.mo25906a(C4744hr.Upload3GFrequency.mo25291a(), 432000)));
    }

    /* renamed from: c */
    private boolean m13829c() {
        if (!this.f8451a.mo25911a(C4744hr.Upload4GSwitch.mo25291a(), true)) {
            return false;
        }
        return Math.abs((System.currentTimeMillis() / 1000) - this.f8450a.getLong("last_upload_data_timestamp", -1)) > ((long) Math.max(86400, this.f8451a.mo25906a(C4744hr.Upload4GFrequency.mo25291a(), 259200)));
    }

    /* renamed from: a */
    public int m13830a() {
        return 1;
    }

    public void run() {
        File file = new File(this.f8449a.getExternalFilesDir((String) null), "push_cdata.data");
        if (!C4521az.m13367c(this.f8449a)) {
            if (file.length() > 1863680) {
                file.delete();
            }
        } else if (!mo22734a() && file.exists()) {
            List<C4747hu> a = m13825a(file);
            if (!C4493ad.m13262a(a)) {
                int size = a.size();
                if (size > 4000) {
                    a = a.subList(size - 4000, size);
                }
                C4759if ifVar = new C4759if();
                ifVar.mo25473a(a);
                byte[] a2 = C4942y.m15890a(C4776iw.m15225a(ifVar));
                C4765il ilVar = new C4765il("-1", false);
                ilVar.mo25565c(C4749hw.DataCollection.f9252a);
                ilVar.mo25559a(a2);
                C4609dp a3 = C4610dq.mo24924a().mo24924a();
                if (a3 != null) {
                    a3.mo22970a(ilVar, C4739hm.Notification, (C4752hz) null);
                }
                mo22734a();
            }
            file.delete();
        }
    }
}
