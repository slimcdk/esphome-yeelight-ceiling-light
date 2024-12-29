package com.xiaomi.push;

import android.content.Context;
import android.content.SharedPreferences;
import com.miot.service.manager.timer.TimerCodec;
import com.xiaomi.push.C4516al;
import com.xiaomi.push.service.C4898ba;
import java.io.File;
import java.util.List;

/* renamed from: com.xiaomi.push.dv */
public class C4634dv extends C4516al.C4517a {

    /* renamed from: a */
    private Context f7837a;

    /* renamed from: a */
    private SharedPreferences f7838a;

    /* renamed from: a */
    private C4898ba f7839a;

    public C4634dv(Context context) {
        this.f7837a = context;
        this.f7838a = context.getSharedPreferences("mipush_extra", 0);
        this.f7839a = C4898ba.m15362a(context);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(10:48|47|63|65|66|67|68|29|69|70) */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:13|14|(3:15|16|(2:75|18)(2:19|(1:76)(4:30|31|(1:77)(2:33|(2:35|78)(2:36|79))|74)))|(3:22|23|(2:25|26))|27|28) */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:45|46|(0)|57|58|59) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0066 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x00a2 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:67:0x00b6 */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0099 A[SYNTHETIC, Splitter:B:52:0x0099] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:57:0x00a2=Splitter:B:57:0x00a2, B:27:0x0066=Splitter:B:27:0x0066, B:67:0x00b6=Splitter:B:67:0x00b6} */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.util.List<com.xiaomi.push.C4768hr> m13356a(java.io.File r11) {
        /*
            r10 = this;
            com.xiaomi.push.dn r0 = com.xiaomi.push.C4625dn.mo28915a()
            com.xiaomi.push.dm r0 = r0.mo28915a()
            if (r0 != 0) goto L_0x000d
            java.lang.String r0 = ""
            goto L_0x0011
        L_0x000d:
            java.lang.String r0 = r0.mo28723a()
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
            java.lang.Object r5 = com.xiaomi.push.C4628dq.f7828a
            monitor-enter(r5)
            java.io.File r6 = new java.io.File     // Catch:{ Exception -> 0x00a9, all -> 0x0094 }
            android.content.Context r7 = r10.f7837a     // Catch:{ Exception -> 0x00a9, all -> 0x0094 }
            java.io.File r7 = r7.getExternalFilesDir(r2)     // Catch:{ Exception -> 0x00a9, all -> 0x0094 }
            java.lang.String r8 = "push_cdata.lock"
            r6.<init>(r7, r8)     // Catch:{ Exception -> 0x00a9, all -> 0x0094 }
            com.xiaomi.push.C4506ab.m12830a((java.io.File) r6)     // Catch:{ Exception -> 0x00a9, all -> 0x0094 }
            java.io.RandomAccessFile r7 = new java.io.RandomAccessFile     // Catch:{ Exception -> 0x00a9, all -> 0x0094 }
            java.lang.String r8 = "rw"
            r7.<init>(r6, r8)     // Catch:{ Exception -> 0x00a9, all -> 0x0094 }
            java.nio.channels.FileChannel r6 = r7.getChannel()     // Catch:{ Exception -> 0x0092, all -> 0x008f }
            java.nio.channels.FileLock r6 = r6.lock()     // Catch:{ Exception -> 0x0092, all -> 0x008f }
            java.io.FileInputStream r8 = new java.io.FileInputStream     // Catch:{ Exception -> 0x008c, all -> 0x0088 }
            r8.<init>(r11)     // Catch:{ Exception -> 0x008c, all -> 0x0088 }
        L_0x0048:
            int r11 = r8.read(r4)     // Catch:{ Exception -> 0x008d, all -> 0x0086 }
            if (r11 == r3) goto L_0x004f
            goto L_0x005b
        L_0x004f:
            int r11 = com.xiaomi.push.C4510af.m12847a((byte[]) r4)     // Catch:{ Exception -> 0x008d, all -> 0x0086 }
            byte[] r2 = new byte[r11]     // Catch:{ Exception -> 0x008d, all -> 0x0086 }
            int r9 = r8.read(r2)     // Catch:{ Exception -> 0x008d, all -> 0x0086 }
            if (r9 == r11) goto L_0x006d
        L_0x005b:
            if (r6 == 0) goto L_0x0066
            boolean r11 = r6.isValid()     // Catch:{ all -> 0x00bc }
            if (r11 == 0) goto L_0x0066
            r6.release()     // Catch:{ IOException -> 0x0066 }
        L_0x0066:
            com.xiaomi.push.C4506ab.m12831a((java.io.Closeable) r8)     // Catch:{ all -> 0x00bc }
        L_0x0069:
            com.xiaomi.push.C4506ab.m12831a((java.io.Closeable) r7)     // Catch:{ all -> 0x00bc }
            goto L_0x00ba
        L_0x006d:
            byte[] r11 = com.xiaomi.push.C4627dp.m13334a(r0, r2)     // Catch:{ Exception -> 0x008d, all -> 0x0086 }
            if (r11 == 0) goto L_0x0048
            int r2 = r11.length     // Catch:{ Exception -> 0x008d, all -> 0x0086 }
            if (r2 != 0) goto L_0x0077
            goto L_0x0048
        L_0x0077:
            com.xiaomi.push.hr r2 = new com.xiaomi.push.hr     // Catch:{ Exception -> 0x008d, all -> 0x0086 }
            r2.<init>()     // Catch:{ Exception -> 0x008d, all -> 0x0086 }
            com.xiaomi.push.C4797it.m14833a(r2, (byte[]) r11)     // Catch:{ Exception -> 0x008d, all -> 0x0086 }
            r1.add(r2)     // Catch:{ Exception -> 0x008d, all -> 0x0086 }
            r10.m13358a((com.xiaomi.push.C4768hr) r2)     // Catch:{ Exception -> 0x008d, all -> 0x0086 }
            goto L_0x0048
        L_0x0086:
            r11 = move-exception
            goto L_0x008a
        L_0x0088:
            r11 = move-exception
            r8 = r2
        L_0x008a:
            r2 = r6
            goto L_0x0097
        L_0x008c:
            r8 = r2
        L_0x008d:
            r2 = r6
            goto L_0x00ab
        L_0x008f:
            r11 = move-exception
            r8 = r2
            goto L_0x0097
        L_0x0092:
            r8 = r2
            goto L_0x00ab
        L_0x0094:
            r11 = move-exception
            r7 = r2
            r8 = r7
        L_0x0097:
            if (r2 == 0) goto L_0x00a2
            boolean r0 = r2.isValid()     // Catch:{ all -> 0x00bc }
            if (r0 == 0) goto L_0x00a2
            r2.release()     // Catch:{ IOException -> 0x00a2 }
        L_0x00a2:
            com.xiaomi.push.C4506ab.m12831a((java.io.Closeable) r8)     // Catch:{ all -> 0x00bc }
            com.xiaomi.push.C4506ab.m12831a((java.io.Closeable) r7)     // Catch:{ all -> 0x00bc }
            throw r11     // Catch:{ all -> 0x00bc }
        L_0x00a9:
            r7 = r2
            r8 = r7
        L_0x00ab:
            if (r2 == 0) goto L_0x00b6
            boolean r11 = r2.isValid()     // Catch:{ all -> 0x00bc }
            if (r11 == 0) goto L_0x00b6
            r2.release()     // Catch:{ IOException -> 0x00b6 }
        L_0x00b6:
            com.xiaomi.push.C4506ab.m12831a((java.io.Closeable) r8)     // Catch:{ all -> 0x00bc }
            goto L_0x0069
        L_0x00ba:
            monitor-exit(r5)     // Catch:{ all -> 0x00bc }
            return r1
        L_0x00bc:
            r11 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x00bc }
            goto L_0x00c0
        L_0x00bf:
            throw r11
        L_0x00c0:
            goto L_0x00bf
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.C4634dv.m13356a(java.io.File):java.util.List");
    }

    /* renamed from: a */
    private void mo28479a() {
        SharedPreferences.Editor edit = this.f7838a.edit();
        edit.putLong("last_upload_data_timestamp", System.currentTimeMillis() / 1000);
        edit.commit();
    }

    /* renamed from: a */
    private void m13358a(C4768hr hrVar) {
        if (hrVar.f8647a == C4762hl.AppInstallList && !hrVar.f8648a.startsWith("same_")) {
            SharedPreferences.Editor edit = this.f7838a.edit();
            edit.putLong("dc_job_result_time_4", hrVar.f8646a);
            edit.putString("dc_job_result_4", C4561bp.m13042a(hrVar.f8648a));
            edit.commit();
        }
    }

    /* renamed from: a */
    private boolean m13359a() {
        if (C4551bj.m13003e(this.f7837a)) {
            return false;
        }
        if ((C4551bj.m13005g(this.f7837a) || C4551bj.m13004f(this.f7837a)) && !m13361c()) {
            return true;
        }
        return (C4551bj.m13006h(this.f7837a) && !m13360b()) || C4551bj.m13007i(this.f7837a);
    }

    /* renamed from: b */
    private boolean m13360b() {
        if (!this.f7839a.mo29996a(C4765ho.Upload3GSwitch.mo29322a(), true)) {
            return false;
        }
        return Math.abs((System.currentTimeMillis() / 1000) - this.f7838a.getLong("last_upload_data_timestamp", -1)) > ((long) Math.max(86400, this.f7839a.mo29988a(C4765ho.Upload3GFrequency.mo29322a(), 432000)));
    }

    /* renamed from: c */
    private boolean m13361c() {
        if (!this.f7839a.mo29996a(C4765ho.Upload4GSwitch.mo29322a(), true)) {
            return false;
        }
        return Math.abs((System.currentTimeMillis() / 1000) - this.f7838a.getLong("last_upload_data_timestamp", -1)) > ((long) Math.max(86400, this.f7839a.mo29988a(C4765ho.Upload4GFrequency.mo29322a(), 259200)));
    }

    /* renamed from: a */
    public String m13362a() {
        return TimerCodec.ENABLE;
    }

    public void run() {
        File file = new File(this.f7837a.getExternalFilesDir((String) null), "push_cdata.data");
        if (!C4551bj.m13002d(this.f7837a)) {
            if (file.length() > 1863680) {
                file.delete();
            }
        } else if (!mo28479a() && file.exists()) {
            List<C4768hr> a = m13356a(file);
            if (!C4511ag.m12849a(a)) {
                int size = a.size();
                if (size > 4000) {
                    a = a.subList(size - 4000, size);
                }
                C4780ic icVar = new C4780ic();
                icVar.mo29511a(a);
                byte[] a2 = C4506ab.m12836a(C4797it.m14834a(icVar));
                C4786ii iiVar = new C4786ii("-1", false);
                iiVar.mo29602c(C4770ht.DataCollection.f8718a);
                iiVar.mo29597a(a2);
                C4624dm a3 = C4625dn.mo28915a().mo28915a();
                if (a3 != null) {
                    a3.mo28724a(iiVar, C4760hj.Notification, (C4773hw) null);
                }
                mo28479a();
            }
            file.delete();
        }
    }
}
