package com.xiaomi.push;

import android.content.Context;
import android.util.Pair;
import com.xiaomi.channel.commonutils.logger.LoggerInterface;
import com.xiaomi.push.C4503al;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/* renamed from: com.xiaomi.push.dm */
public class C4606dm implements LoggerInterface {

    /* renamed from: a */
    private static C4503al f8412a = new C4503al(true);

    /* renamed from: a */
    public static String f8413a = "/MiPushLog";

    /* renamed from: a */
    private static final SimpleDateFormat f8414a = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss aaa");

    /* renamed from: a */
    private static List<Pair<String, Throwable>> f8415a = Collections.synchronizedList(new ArrayList());

    /* renamed from: a */
    private Context f8416a;

    /* renamed from: b */
    private String f8417b;

    /* renamed from: c */
    private String f8418c = "";

    public C4606dm(Context context) {
        this.f8416a = context;
        if (context.getApplicationContext() != null) {
            this.f8416a = context.getApplicationContext();
        }
        this.f8417b = this.f8416a.getPackageName();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.io.BufferedWriter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.nio.channels.FileLock} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.io.BufferedWriter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.nio.channels.FileLock} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: java.io.RandomAccessFile} */
    /* JADX WARNING: type inference failed for: r1v0, types: [java.io.BufferedWriter, java.lang.String] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:14|(1:18)|19|(12:20|21|22|23|(6:27|28|(3:30|31|96)(1:97)|32|25|24)|95|33|34|35|(3:37|(1:41)|42)|(2:44|45)|(2:50|51))|52|53|100) */
    /* JADX WARNING: Code restructure failed: missing block: B:98:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:52:0x0124 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0139 A[SYNTHETIC, Splitter:B:66:0x0139] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x014d A[SYNTHETIC, Splitter:B:76:0x014d] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0155 A[SYNTHETIC, Splitter:B:84:0x0155] */
    /* JADX WARNING: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m13745a() {
        /*
            r10 = this;
            java.lang.String r0 = "log1.txt"
            r1 = 0
            java.lang.String r2 = r10.f8418c     // Catch:{ Exception -> 0x0151, all -> 0x0134 }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x0151, all -> 0x0134 }
            if (r2 == 0) goto L_0x002a
            android.content.Context r2 = r10.f8416a     // Catch:{ Exception -> 0x0151, all -> 0x0134 }
            java.io.File r2 = r2.getExternalFilesDir(r1)     // Catch:{ Exception -> 0x0151, all -> 0x0134 }
            if (r2 == 0) goto L_0x002a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0151, all -> 0x0134 }
            r3.<init>()     // Catch:{ Exception -> 0x0151, all -> 0x0134 }
            java.lang.String r2 = r2.getAbsolutePath()     // Catch:{ Exception -> 0x0151, all -> 0x0134 }
            r3.append(r2)     // Catch:{ Exception -> 0x0151, all -> 0x0134 }
            java.lang.String r2 = ""
            r3.append(r2)     // Catch:{ Exception -> 0x0151, all -> 0x0134 }
            java.lang.String r2 = r3.toString()     // Catch:{ Exception -> 0x0151, all -> 0x0134 }
            r10.f8418c = r2     // Catch:{ Exception -> 0x0151, all -> 0x0134 }
        L_0x002a:
            java.io.File r2 = new java.io.File     // Catch:{ Exception -> 0x0151, all -> 0x0134 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0151, all -> 0x0134 }
            r3.<init>()     // Catch:{ Exception -> 0x0151, all -> 0x0134 }
            java.lang.String r4 = r10.f8418c     // Catch:{ Exception -> 0x0151, all -> 0x0134 }
            r3.append(r4)     // Catch:{ Exception -> 0x0151, all -> 0x0134 }
            java.lang.String r4 = f8413a     // Catch:{ Exception -> 0x0151, all -> 0x0134 }
            r3.append(r4)     // Catch:{ Exception -> 0x0151, all -> 0x0134 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0151, all -> 0x0134 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x0151, all -> 0x0134 }
            boolean r3 = r2.exists()     // Catch:{ Exception -> 0x0151, all -> 0x0134 }
            if (r3 == 0) goto L_0x004e
            boolean r3 = r2.isDirectory()     // Catch:{ Exception -> 0x0151, all -> 0x0134 }
            if (r3 != 0) goto L_0x0055
        L_0x004e:
            boolean r3 = r2.mkdirs()     // Catch:{ Exception -> 0x0151, all -> 0x0134 }
            if (r3 != 0) goto L_0x0055
            return
        L_0x0055:
            java.io.File r3 = new java.io.File     // Catch:{ Exception -> 0x0151, all -> 0x0134 }
            java.lang.String r4 = "log.lock"
            r3.<init>(r2, r4)     // Catch:{ Exception -> 0x0151, all -> 0x0134 }
            boolean r4 = r3.exists()     // Catch:{ Exception -> 0x0151, all -> 0x0134 }
            if (r4 == 0) goto L_0x0068
            boolean r4 = r3.isDirectory()     // Catch:{ Exception -> 0x0151, all -> 0x0134 }
            if (r4 == 0) goto L_0x006b
        L_0x0068:
            r3.createNewFile()     // Catch:{ Exception -> 0x0151, all -> 0x0134 }
        L_0x006b:
            java.io.RandomAccessFile r4 = new java.io.RandomAccessFile     // Catch:{ Exception -> 0x0151, all -> 0x0134 }
            java.lang.String r5 = "rw"
            r4.<init>(r3, r5)     // Catch:{ Exception -> 0x0151, all -> 0x0134 }
            java.nio.channels.FileChannel r3 = r4.getChannel()     // Catch:{ Exception -> 0x0132, all -> 0x012f }
            java.nio.channels.FileLock r3 = r3.lock()     // Catch:{ Exception -> 0x0132, all -> 0x012f }
            java.io.BufferedWriter r5 = new java.io.BufferedWriter     // Catch:{ Exception -> 0x0153, all -> 0x012d }
            java.io.OutputStreamWriter r6 = new java.io.OutputStreamWriter     // Catch:{ Exception -> 0x0153, all -> 0x012d }
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0153, all -> 0x012d }
            java.io.File r8 = new java.io.File     // Catch:{ Exception -> 0x0153, all -> 0x012d }
            r8.<init>(r2, r0)     // Catch:{ Exception -> 0x0153, all -> 0x012d }
            r9 = 1
            r7.<init>(r8, r9)     // Catch:{ Exception -> 0x0153, all -> 0x012d }
            r6.<init>(r7)     // Catch:{ Exception -> 0x0153, all -> 0x012d }
            r5.<init>(r6)     // Catch:{ Exception -> 0x0153, all -> 0x012d }
        L_0x008f:
            java.util.List<android.util.Pair<java.lang.String, java.lang.Throwable>> r6 = f8415a     // Catch:{ Exception -> 0x012b, all -> 0x0128 }
            boolean r6 = r6.isEmpty()     // Catch:{ Exception -> 0x012b, all -> 0x0128 }
            if (r6 != 0) goto L_0x00e3
            java.util.List<android.util.Pair<java.lang.String, java.lang.Throwable>> r6 = f8415a     // Catch:{ Exception -> 0x012b, all -> 0x0128 }
            r7 = 0
            java.lang.Object r6 = r6.remove(r7)     // Catch:{ Exception -> 0x012b, all -> 0x0128 }
            android.util.Pair r6 = (android.util.Pair) r6     // Catch:{ Exception -> 0x012b, all -> 0x0128 }
            java.lang.Object r7 = r6.first     // Catch:{ Exception -> 0x012b, all -> 0x0128 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ Exception -> 0x012b, all -> 0x0128 }
            java.lang.Object r8 = r6.second     // Catch:{ Exception -> 0x012b, all -> 0x0128 }
            java.lang.String r9 = "\n"
            if (r8 == 0) goto L_0x00d0
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x012b, all -> 0x0128 }
            r8.<init>()     // Catch:{ Exception -> 0x012b, all -> 0x0128 }
            r8.append(r7)     // Catch:{ Exception -> 0x012b, all -> 0x0128 }
            r8.append(r9)     // Catch:{ Exception -> 0x012b, all -> 0x0128 }
            java.lang.String r7 = r8.toString()     // Catch:{ Exception -> 0x012b, all -> 0x0128 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x012b, all -> 0x0128 }
            r8.<init>()     // Catch:{ Exception -> 0x012b, all -> 0x0128 }
            r8.append(r7)     // Catch:{ Exception -> 0x012b, all -> 0x0128 }
            java.lang.Object r6 = r6.second     // Catch:{ Exception -> 0x012b, all -> 0x0128 }
            java.lang.Throwable r6 = (java.lang.Throwable) r6     // Catch:{ Exception -> 0x012b, all -> 0x0128 }
            java.lang.String r6 = android.util.Log.getStackTraceString(r6)     // Catch:{ Exception -> 0x012b, all -> 0x0128 }
            r8.append(r6)     // Catch:{ Exception -> 0x012b, all -> 0x0128 }
            java.lang.String r7 = r8.toString()     // Catch:{ Exception -> 0x012b, all -> 0x0128 }
        L_0x00d0:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x012b, all -> 0x0128 }
            r6.<init>()     // Catch:{ Exception -> 0x012b, all -> 0x0128 }
            r6.append(r7)     // Catch:{ Exception -> 0x012b, all -> 0x0128 }
            r6.append(r9)     // Catch:{ Exception -> 0x012b, all -> 0x0128 }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x012b, all -> 0x0128 }
            r5.write(r6)     // Catch:{ Exception -> 0x012b, all -> 0x0128 }
            goto L_0x008f
        L_0x00e3:
            r5.flush()     // Catch:{ Exception -> 0x012b, all -> 0x0128 }
            r5.close()     // Catch:{ Exception -> 0x012b, all -> 0x0128 }
            java.io.File r5 = new java.io.File     // Catch:{ Exception -> 0x0153, all -> 0x012d }
            r5.<init>(r2, r0)     // Catch:{ Exception -> 0x0153, all -> 0x012d }
            long r6 = r5.length()     // Catch:{ Exception -> 0x0153, all -> 0x012d }
            r8 = 1048576(0x100000, double:5.180654E-318)
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 < 0) goto L_0x0112
            java.io.File r0 = new java.io.File     // Catch:{ Exception -> 0x0153, all -> 0x012d }
            java.lang.String r6 = "log0.txt"
            r0.<init>(r2, r6)     // Catch:{ Exception -> 0x0153, all -> 0x012d }
            boolean r2 = r0.exists()     // Catch:{ Exception -> 0x0153, all -> 0x012d }
            if (r2 == 0) goto L_0x010f
            boolean r2 = r0.isFile()     // Catch:{ Exception -> 0x0153, all -> 0x012d }
            if (r2 == 0) goto L_0x010f
            r0.delete()     // Catch:{ Exception -> 0x0153, all -> 0x012d }
        L_0x010f:
            r5.renameTo(r0)     // Catch:{ Exception -> 0x0153, all -> 0x012d }
        L_0x0112:
            if (r1 == 0) goto L_0x0119
            r1.close()     // Catch:{ IOException -> 0x0118 }
            goto L_0x0119
        L_0x0118:
        L_0x0119:
            if (r3 == 0) goto L_0x0124
            boolean r0 = r3.isValid()
            if (r0 == 0) goto L_0x0124
            r3.release()     // Catch:{ IOException -> 0x0124 }
        L_0x0124:
            r4.close()     // Catch:{ IOException -> 0x016a }
            goto L_0x016a
        L_0x0128:
            r0 = move-exception
            r1 = r5
            goto L_0x0137
        L_0x012b:
            r1 = r5
            goto L_0x0153
        L_0x012d:
            r0 = move-exception
            goto L_0x0137
        L_0x012f:
            r0 = move-exception
            r3 = r1
            goto L_0x0137
        L_0x0132:
            r3 = r1
            goto L_0x0153
        L_0x0134:
            r0 = move-exception
            r3 = r1
            r4 = r3
        L_0x0137:
            if (r1 == 0) goto L_0x013e
            r1.close()     // Catch:{ IOException -> 0x013d }
            goto L_0x013e
        L_0x013d:
        L_0x013e:
            if (r3 == 0) goto L_0x014b
            boolean r1 = r3.isValid()
            if (r1 == 0) goto L_0x014b
            r3.release()     // Catch:{ IOException -> 0x014a }
            goto L_0x014b
        L_0x014a:
        L_0x014b:
            if (r4 == 0) goto L_0x0150
            r4.close()     // Catch:{ IOException -> 0x0150 }
        L_0x0150:
            throw r0
        L_0x0151:
            r3 = r1
            r4 = r3
        L_0x0153:
            if (r1 == 0) goto L_0x015a
            r1.close()     // Catch:{ IOException -> 0x0159 }
            goto L_0x015a
        L_0x0159:
        L_0x015a:
            if (r3 == 0) goto L_0x0167
            boolean r0 = r3.isValid()
            if (r0 == 0) goto L_0x0167
            r3.release()     // Catch:{ IOException -> 0x0166 }
            goto L_0x0167
        L_0x0166:
        L_0x0167:
            if (r4 == 0) goto L_0x016a
            goto L_0x0124
        L_0x016a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.C4606dm.m13745a():void");
    }

    public final void log(String str) {
        log(str, (Throwable) null);
    }

    public final void log(String str, Throwable th) {
        f8415a.add(new Pair(String.format("%1$s %2$s %3$s ", new Object[]{f8414a.format(new Date()), this.f8417b, str}), th));
        f8412a.mo24735a((C4503al.C4505b) new C4607dn(this));
    }

    public final void setTag(String str) {
        this.f8417b = str;
    }
}
