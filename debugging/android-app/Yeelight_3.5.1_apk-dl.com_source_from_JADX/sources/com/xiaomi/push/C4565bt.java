package com.xiaomi.push;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import com.miot.bluetooth.channel.packet.Packet;
import com.xiaomi.channel.commonutils.logger.C4408b;
import com.xiaomi.clientreport.manager.C4412a;
import com.xiaomi.mipush.sdk.Constants;
import java.io.File;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.xiaomi.push.bt */
public class C4565bt {
    /* renamed from: a */
    public static String m13061a() {
        return Build.VERSION.RELEASE + Constants.ACCEPT_TIME_SEPARATOR_SERVER + Build.VERSION.INCREMENTAL;
    }

    /* renamed from: a */
    public static String m13062a(Context context) {
        String a = C4568bw.m13070a(context).mo28790a("sp_client_report_status", "sp_client_report_key", "");
        if (!TextUtils.isEmpty(a)) {
            return a;
        }
        String a2 = C4561bp.m13041a(20);
        C4568bw.m13070a(context).mo28790a("sp_client_report_status", "sp_client_report_key", a2);
        return a2;
    }

    /* renamed from: a */
    public static void m13063a(Context context, String str) {
        Intent intent = new Intent("com.xiaomi.xmsf.push.XMSF_UPLOAD_ACTIVE");
        intent.putExtra("pkgname", context.getPackageName());
        intent.putExtra("category", "category_client_report_data");
        intent.putExtra("name", "quality_support");
        intent.putExtra(Packet.DATA, str);
        context.sendBroadcast(intent, "com.xiaomi.xmsf.permission.USE_XMSF_UPLOAD");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00e4, code lost:
        if (r7 == null) goto L_0x00e9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0104  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m13064a(android.content.Context r11, java.lang.String r12, java.lang.String r13) {
        /*
            java.io.File r13 = r11.getExternalFilesDir(r13)
            if (r13 == 0) goto L_0x0124
            boolean r0 = r13.exists()
            if (r0 != 0) goto L_0x000f
            r13.mkdirs()
        L_0x000f:
            java.io.File r11 = r11.getExternalFilesDir(r12)
            if (r11 == 0) goto L_0x0124
            boolean r12 = r11.exists()
            if (r12 != 0) goto L_0x001f
            r11.mkdirs()
            return
        L_0x001f:
            com.xiaomi.push.bu r12 = new com.xiaomi.push.bu
            r12.<init>()
            java.io.File[] r11 = r11.listFiles(r12)
            if (r11 == 0) goto L_0x0124
            int r12 = r11.length
            if (r12 > 0) goto L_0x002f
            goto L_0x0124
        L_0x002f:
            long r0 = java.lang.System.currentTimeMillis()
            int r12 = r11.length
            r2 = 0
            r3 = 0
            r4 = r3
            r5 = r4
        L_0x0038:
            if (r2 >= r12) goto L_0x0124
            r6 = r11[r2]
            if (r6 == 0) goto L_0x0108
            java.lang.String r7 = r6.getAbsolutePath()     // Catch:{ Exception -> 0x00ca, all -> 0x00c8 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ Exception -> 0x00ca, all -> 0x00c8 }
            if (r7 == 0) goto L_0x004a
            goto L_0x0108
        L_0x004a:
            java.io.File r7 = new java.io.File     // Catch:{ Exception -> 0x00ca, all -> 0x00c8 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00ca, all -> 0x00c8 }
            r8.<init>()     // Catch:{ Exception -> 0x00ca, all -> 0x00c8 }
            java.lang.String r9 = r6.getAbsolutePath()     // Catch:{ Exception -> 0x00ca, all -> 0x00c8 }
            r8.append(r9)     // Catch:{ Exception -> 0x00ca, all -> 0x00c8 }
            java.lang.String r9 = ".lock"
            r8.append(r9)     // Catch:{ Exception -> 0x00ca, all -> 0x00c8 }
            java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x00ca, all -> 0x00c8 }
            r7.<init>(r8)     // Catch:{ Exception -> 0x00ca, all -> 0x00c8 }
            com.xiaomi.push.C4506ab.m12830a((java.io.File) r7)     // Catch:{ Exception -> 0x00c3, all -> 0x00c1 }
            java.io.RandomAccessFile r5 = new java.io.RandomAccessFile     // Catch:{ Exception -> 0x00c3, all -> 0x00c1 }
            java.lang.String r8 = "rw"
            r5.<init>(r7, r8)     // Catch:{ Exception -> 0x00c3, all -> 0x00c1 }
            java.nio.channels.FileChannel r4 = r5.getChannel()     // Catch:{ Exception -> 0x00bf }
            java.nio.channels.FileLock r3 = r4.lock()     // Catch:{ Exception -> 0x00bf }
            java.lang.String r4 = r13.getAbsolutePath()     // Catch:{ Exception -> 0x00bf }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00bf }
            r8.<init>()     // Catch:{ Exception -> 0x00bf }
            r8.append(r4)     // Catch:{ Exception -> 0x00bf }
            java.lang.String r4 = java.io.File.separator     // Catch:{ Exception -> 0x00bf }
            r8.append(r4)     // Catch:{ Exception -> 0x00bf }
            java.lang.String r4 = r6.getName()     // Catch:{ Exception -> 0x00bf }
            r8.append(r4)     // Catch:{ Exception -> 0x00bf }
            r8.append(r0)     // Catch:{ Exception -> 0x00bf }
            java.lang.String r4 = r8.toString()     // Catch:{ Exception -> 0x00bf }
            java.io.File r8 = new java.io.File     // Catch:{ Exception -> 0x00bf }
            r8.<init>(r4)     // Catch:{ Exception -> 0x00bf }
            com.xiaomi.push.C4506ab.m12837b(r6, r8)     // Catch:{ IOException -> 0x009e }
            goto L_0x00a8
        L_0x009e:
            r4 = move-exception
            r4.printStackTrace()     // Catch:{ Exception -> 0x00bf }
            r6.delete()     // Catch:{ Exception -> 0x00bf }
            r8.delete()     // Catch:{ Exception -> 0x00bf }
        L_0x00a8:
            r6.delete()     // Catch:{ Exception -> 0x00bf }
            if (r3 == 0) goto L_0x00bb
            boolean r4 = r3.isValid()
            if (r4 == 0) goto L_0x00bb
            r3.release()     // Catch:{ IOException -> 0x00b7 }
            goto L_0x00bb
        L_0x00b7:
            r4 = move-exception
            com.xiaomi.channel.commonutils.logger.C4408b.m12478a((java.lang.Throwable) r4)
        L_0x00bb:
            com.xiaomi.push.C4506ab.m12831a((java.io.Closeable) r5)
            goto L_0x00e6
        L_0x00bf:
            r4 = move-exception
            goto L_0x00ce
        L_0x00c1:
            r11 = move-exception
            goto L_0x00ee
        L_0x00c3:
            r5 = move-exception
            r10 = r5
            r5 = r4
            r4 = r10
            goto L_0x00ce
        L_0x00c8:
            r11 = move-exception
            goto L_0x00ef
        L_0x00ca:
            r6 = move-exception
            r7 = r5
            r5 = r4
            r4 = r6
        L_0x00ce:
            com.xiaomi.channel.commonutils.logger.C4408b.m12478a((java.lang.Throwable) r4)     // Catch:{ all -> 0x00ec }
            if (r3 == 0) goto L_0x00e1
            boolean r4 = r3.isValid()
            if (r4 == 0) goto L_0x00e1
            r3.release()     // Catch:{ IOException -> 0x00dd }
            goto L_0x00e1
        L_0x00dd:
            r4 = move-exception
            com.xiaomi.channel.commonutils.logger.C4408b.m12478a((java.lang.Throwable) r4)
        L_0x00e1:
            com.xiaomi.push.C4506ab.m12831a((java.io.Closeable) r5)
            if (r7 == 0) goto L_0x00e9
        L_0x00e6:
            r7.delete()
        L_0x00e9:
            r4 = r5
            r5 = r7
            goto L_0x0120
        L_0x00ec:
            r11 = move-exception
            r4 = r5
        L_0x00ee:
            r5 = r7
        L_0x00ef:
            if (r3 == 0) goto L_0x00ff
            boolean r12 = r3.isValid()
            if (r12 == 0) goto L_0x00ff
            r3.release()     // Catch:{ IOException -> 0x00fb }
            goto L_0x00ff
        L_0x00fb:
            r12 = move-exception
            com.xiaomi.channel.commonutils.logger.C4408b.m12478a((java.lang.Throwable) r12)
        L_0x00ff:
            com.xiaomi.push.C4506ab.m12831a((java.io.Closeable) r4)
            if (r5 == 0) goto L_0x0107
            r5.delete()
        L_0x0107:
            throw r11
        L_0x0108:
            if (r3 == 0) goto L_0x0118
            boolean r6 = r3.isValid()
            if (r6 == 0) goto L_0x0118
            r3.release()     // Catch:{ IOException -> 0x0114 }
            goto L_0x0118
        L_0x0114:
            r6 = move-exception
            com.xiaomi.channel.commonutils.logger.C4408b.m12478a((java.lang.Throwable) r6)
        L_0x0118:
            com.xiaomi.push.C4506ab.m12831a((java.io.Closeable) r4)
            if (r5 == 0) goto L_0x0120
            r5.delete()
        L_0x0120:
            int r2 = r2 + 1
            goto L_0x0038
        L_0x0124:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.C4565bt.m13064a(android.content.Context, java.lang.String, java.lang.String):void");
    }

    /* renamed from: a */
    public static void m13065a(Context context, List<String> list) {
        if (list != null && list.size() > 0 && m13062a(context)) {
            for (String next : list) {
                if (!TextUtils.isEmpty(next)) {
                    m13063a(context, next);
                }
            }
        }
    }

    /* renamed from: a */
    public static boolean m13066a(Context context) {
        try {
            return context.getApplicationContext().getPackageManager().getPackageInfo("com.xiaomi.xmsf", 0).versionCode >= 108;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m13067a(Context context, String str) {
        File file = new File(str);
        long maxFileLength = C4412a.m12487a(context).mo28468a().getMaxFileLength();
        if (file.exists()) {
            try {
                if (file.length() > maxFileLength) {
                    return false;
                }
            } catch (Exception e) {
                C4408b.m12478a((Throwable) e);
                return false;
            }
        } else {
            C4506ab.m12830a(file);
        }
        return true;
    }

    @TargetApi(9)
    /* renamed from: a */
    public static byte[] m13068a(String str) {
        byte[] copyOf = Arrays.copyOf(C4558bm.m13029a(str), 16);
        copyOf[0] = 68;
        copyOf[15] = 84;
        return copyOf;
    }

    /* renamed from: a */
    public static File[] m13069a(Context context, String str) {
        File externalFilesDir = context.getExternalFilesDir(str);
        if (externalFilesDir != null) {
            return externalFilesDir.listFiles(new C4567bv());
        }
        return null;
    }
}
