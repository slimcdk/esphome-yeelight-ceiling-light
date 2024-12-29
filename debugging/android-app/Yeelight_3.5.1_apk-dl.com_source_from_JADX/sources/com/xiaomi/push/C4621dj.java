package com.xiaomi.push;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import android.util.Pair;
import com.xiaomi.channel.commonutils.logger.LoggerInterface;
import com.xiaomi.mipush.sdk.Constants;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.xiaomi.push.dj */
public class C4621dj implements LoggerInterface {

    /* renamed from: a */
    private static volatile C4621dj f7812a;

    /* renamed from: a */
    public static String f7813a = "/MiPushLog";

    /* renamed from: a */
    private static final SimpleDateFormat f7814a = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss aaa");

    /* renamed from: a */
    private static List<Pair<String, Throwable>> f7815a = Collections.synchronizedList(new ArrayList());

    /* renamed from: a */
    private Context f7816a;

    /* renamed from: a */
    private Handler f7817a;

    /* renamed from: b */
    private String f7818b;

    /* renamed from: c */
    private String f7819c = "";

    private C4621dj(Context context) {
        this.f7816a = context;
        if (context.getApplicationContext() != null) {
            this.f7816a = context.getApplicationContext();
        }
        this.f7818b = this.f7816a.getPackageName() + Constants.ACCEPT_TIME_SEPARATOR_SERVER + Process.myPid();
        HandlerThread handlerThread = new HandlerThread("Log2FileHandlerThread");
        handlerThread.start();
        this.f7817a = new Handler(handlerThread.getLooper());
    }

    /* renamed from: a */
    public static C4621dj m13319a(Context context) {
        if (f7812a == null) {
            synchronized (C4621dj.class) {
                if (f7812a == null) {
                    f7812a = new C4621dj(context);
                }
            }
        }
        return f7812a;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:14|(1:18)|19|(11:20|21|22|23|(6:27|28|(3:30|31|92)(1:93)|32|25|24)|91|33|34|35|(3:37|(1:41)|42)|(2:46|47))|48|49|96) */
    /* JADX WARNING: Code restructure failed: missing block: B:94:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:48:0x011d */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0132 A[SYNTHETIC, Splitter:B:62:0x0132] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0146 A[SYNTHETIC, Splitter:B:72:0x0146] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x014e A[SYNTHETIC, Splitter:B:80:0x014e] */
    /* JADX WARNING: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m13323a() {
        /*
            r10 = this;
            java.lang.String r0 = "log1.txt"
            r1 = 0
            java.lang.String r2 = r10.f7819c     // Catch:{ Exception -> 0x014a, all -> 0x012d }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x014a, all -> 0x012d }
            if (r2 == 0) goto L_0x002a
            android.content.Context r2 = r10.f7816a     // Catch:{ Exception -> 0x014a, all -> 0x012d }
            java.io.File r2 = r2.getExternalFilesDir(r1)     // Catch:{ Exception -> 0x014a, all -> 0x012d }
            if (r2 == 0) goto L_0x002a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x014a, all -> 0x012d }
            r3.<init>()     // Catch:{ Exception -> 0x014a, all -> 0x012d }
            java.lang.String r2 = r2.getAbsolutePath()     // Catch:{ Exception -> 0x014a, all -> 0x012d }
            r3.append(r2)     // Catch:{ Exception -> 0x014a, all -> 0x012d }
            java.lang.String r2 = ""
            r3.append(r2)     // Catch:{ Exception -> 0x014a, all -> 0x012d }
            java.lang.String r2 = r3.toString()     // Catch:{ Exception -> 0x014a, all -> 0x012d }
            r10.f7819c = r2     // Catch:{ Exception -> 0x014a, all -> 0x012d }
        L_0x002a:
            java.io.File r2 = new java.io.File     // Catch:{ Exception -> 0x014a, all -> 0x012d }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x014a, all -> 0x012d }
            r3.<init>()     // Catch:{ Exception -> 0x014a, all -> 0x012d }
            java.lang.String r4 = r10.f7819c     // Catch:{ Exception -> 0x014a, all -> 0x012d }
            r3.append(r4)     // Catch:{ Exception -> 0x014a, all -> 0x012d }
            java.lang.String r4 = f7813a     // Catch:{ Exception -> 0x014a, all -> 0x012d }
            r3.append(r4)     // Catch:{ Exception -> 0x014a, all -> 0x012d }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x014a, all -> 0x012d }
            r2.<init>(r3)     // Catch:{ Exception -> 0x014a, all -> 0x012d }
            boolean r3 = r2.exists()     // Catch:{ Exception -> 0x014a, all -> 0x012d }
            if (r3 == 0) goto L_0x004e
            boolean r3 = r2.isDirectory()     // Catch:{ Exception -> 0x014a, all -> 0x012d }
            if (r3 != 0) goto L_0x0055
        L_0x004e:
            boolean r3 = r2.mkdirs()     // Catch:{ Exception -> 0x014a, all -> 0x012d }
            if (r3 != 0) goto L_0x0055
            return
        L_0x0055:
            java.io.File r3 = new java.io.File     // Catch:{ Exception -> 0x014a, all -> 0x012d }
            java.lang.String r4 = "log.lock"
            r3.<init>(r2, r4)     // Catch:{ Exception -> 0x014a, all -> 0x012d }
            boolean r4 = r3.exists()     // Catch:{ Exception -> 0x014a, all -> 0x012d }
            if (r4 == 0) goto L_0x0068
            boolean r4 = r3.isDirectory()     // Catch:{ Exception -> 0x014a, all -> 0x012d }
            if (r4 == 0) goto L_0x006b
        L_0x0068:
            r3.createNewFile()     // Catch:{ Exception -> 0x014a, all -> 0x012d }
        L_0x006b:
            java.io.RandomAccessFile r4 = new java.io.RandomAccessFile     // Catch:{ Exception -> 0x014a, all -> 0x012d }
            java.lang.String r5 = "rw"
            r4.<init>(r3, r5)     // Catch:{ Exception -> 0x014a, all -> 0x012d }
            java.nio.channels.FileChannel r3 = r4.getChannel()     // Catch:{ Exception -> 0x012b, all -> 0x0128 }
            java.nio.channels.FileLock r3 = r3.lock()     // Catch:{ Exception -> 0x012b, all -> 0x0128 }
            java.io.BufferedWriter r5 = new java.io.BufferedWriter     // Catch:{ Exception -> 0x014c, all -> 0x0126 }
            java.io.OutputStreamWriter r6 = new java.io.OutputStreamWriter     // Catch:{ Exception -> 0x014c, all -> 0x0126 }
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x014c, all -> 0x0126 }
            java.io.File r8 = new java.io.File     // Catch:{ Exception -> 0x014c, all -> 0x0126 }
            r8.<init>(r2, r0)     // Catch:{ Exception -> 0x014c, all -> 0x0126 }
            r9 = 1
            r7.<init>(r8, r9)     // Catch:{ Exception -> 0x014c, all -> 0x0126 }
            r6.<init>(r7)     // Catch:{ Exception -> 0x014c, all -> 0x0126 }
            r5.<init>(r6)     // Catch:{ Exception -> 0x014c, all -> 0x0126 }
        L_0x008f:
            java.util.List<android.util.Pair<java.lang.String, java.lang.Throwable>> r6 = f7815a     // Catch:{ Exception -> 0x0124, all -> 0x0121 }
            boolean r6 = r6.isEmpty()     // Catch:{ Exception -> 0x0124, all -> 0x0121 }
            if (r6 != 0) goto L_0x00e3
            java.util.List<android.util.Pair<java.lang.String, java.lang.Throwable>> r6 = f7815a     // Catch:{ Exception -> 0x0124, all -> 0x0121 }
            r7 = 0
            java.lang.Object r6 = r6.remove(r7)     // Catch:{ Exception -> 0x0124, all -> 0x0121 }
            android.util.Pair r6 = (android.util.Pair) r6     // Catch:{ Exception -> 0x0124, all -> 0x0121 }
            java.lang.Object r7 = r6.first     // Catch:{ Exception -> 0x0124, all -> 0x0121 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ Exception -> 0x0124, all -> 0x0121 }
            java.lang.Object r8 = r6.second     // Catch:{ Exception -> 0x0124, all -> 0x0121 }
            java.lang.String r9 = "\n"
            if (r8 == 0) goto L_0x00d0
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0124, all -> 0x0121 }
            r8.<init>()     // Catch:{ Exception -> 0x0124, all -> 0x0121 }
            r8.append(r7)     // Catch:{ Exception -> 0x0124, all -> 0x0121 }
            r8.append(r9)     // Catch:{ Exception -> 0x0124, all -> 0x0121 }
            java.lang.String r7 = r8.toString()     // Catch:{ Exception -> 0x0124, all -> 0x0121 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0124, all -> 0x0121 }
            r8.<init>()     // Catch:{ Exception -> 0x0124, all -> 0x0121 }
            r8.append(r7)     // Catch:{ Exception -> 0x0124, all -> 0x0121 }
            java.lang.Object r6 = r6.second     // Catch:{ Exception -> 0x0124, all -> 0x0121 }
            java.lang.Throwable r6 = (java.lang.Throwable) r6     // Catch:{ Exception -> 0x0124, all -> 0x0121 }
            java.lang.String r6 = android.util.Log.getStackTraceString(r6)     // Catch:{ Exception -> 0x0124, all -> 0x0121 }
            r8.append(r6)     // Catch:{ Exception -> 0x0124, all -> 0x0121 }
            java.lang.String r7 = r8.toString()     // Catch:{ Exception -> 0x0124, all -> 0x0121 }
        L_0x00d0:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0124, all -> 0x0121 }
            r6.<init>()     // Catch:{ Exception -> 0x0124, all -> 0x0121 }
            r6.append(r7)     // Catch:{ Exception -> 0x0124, all -> 0x0121 }
            r6.append(r9)     // Catch:{ Exception -> 0x0124, all -> 0x0121 }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x0124, all -> 0x0121 }
            r5.write(r6)     // Catch:{ Exception -> 0x0124, all -> 0x0121 }
            goto L_0x008f
        L_0x00e3:
            r5.flush()     // Catch:{ Exception -> 0x0124, all -> 0x0121 }
            r5.close()     // Catch:{ Exception -> 0x0124, all -> 0x0121 }
            java.io.File r5 = new java.io.File     // Catch:{ Exception -> 0x014c, all -> 0x0126 }
            r5.<init>(r2, r0)     // Catch:{ Exception -> 0x014c, all -> 0x0126 }
            long r6 = r5.length()     // Catch:{ Exception -> 0x014c, all -> 0x0126 }
            r8 = 1048576(0x100000, double:5.180654E-318)
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 < 0) goto L_0x0112
            java.io.File r0 = new java.io.File     // Catch:{ Exception -> 0x014c, all -> 0x0126 }
            java.lang.String r6 = "log0.txt"
            r0.<init>(r2, r6)     // Catch:{ Exception -> 0x014c, all -> 0x0126 }
            boolean r2 = r0.exists()     // Catch:{ Exception -> 0x014c, all -> 0x0126 }
            if (r2 == 0) goto L_0x010f
            boolean r2 = r0.isFile()     // Catch:{ Exception -> 0x014c, all -> 0x0126 }
            if (r2 == 0) goto L_0x010f
            r0.delete()     // Catch:{ Exception -> 0x014c, all -> 0x0126 }
        L_0x010f:
            r5.renameTo(r0)     // Catch:{ Exception -> 0x014c, all -> 0x0126 }
        L_0x0112:
            if (r3 == 0) goto L_0x011d
            boolean r0 = r3.isValid()
            if (r0 == 0) goto L_0x011d
            r3.release()     // Catch:{ IOException -> 0x011d }
        L_0x011d:
            r4.close()     // Catch:{ IOException -> 0x0163 }
            goto L_0x0163
        L_0x0121:
            r0 = move-exception
            r1 = r5
            goto L_0x0130
        L_0x0124:
            r1 = r5
            goto L_0x014c
        L_0x0126:
            r0 = move-exception
            goto L_0x0130
        L_0x0128:
            r0 = move-exception
            r3 = r1
            goto L_0x0130
        L_0x012b:
            r3 = r1
            goto L_0x014c
        L_0x012d:
            r0 = move-exception
            r3 = r1
            r4 = r3
        L_0x0130:
            if (r1 == 0) goto L_0x0137
            r1.close()     // Catch:{ IOException -> 0x0136 }
            goto L_0x0137
        L_0x0136:
        L_0x0137:
            if (r3 == 0) goto L_0x0144
            boolean r1 = r3.isValid()
            if (r1 == 0) goto L_0x0144
            r3.release()     // Catch:{ IOException -> 0x0143 }
            goto L_0x0144
        L_0x0143:
        L_0x0144:
            if (r4 == 0) goto L_0x0149
            r4.close()     // Catch:{ IOException -> 0x0149 }
        L_0x0149:
            throw r0
        L_0x014a:
            r3 = r1
            r4 = r3
        L_0x014c:
            if (r1 == 0) goto L_0x0153
            r1.close()     // Catch:{ IOException -> 0x0152 }
            goto L_0x0153
        L_0x0152:
        L_0x0153:
            if (r3 == 0) goto L_0x0160
            boolean r0 = r3.isValid()
            if (r0 == 0) goto L_0x0160
            r3.release()     // Catch:{ IOException -> 0x015f }
            goto L_0x0160
        L_0x015f:
        L_0x0160:
            if (r4 == 0) goto L_0x0163
            goto L_0x011d
        L_0x0163:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.C4621dj.m13323a():void");
    }

    public final void log(String str) {
        log(str, (Throwable) null);
    }

    public final void log(String str, Throwable th) {
        this.f7817a.post(new C4622dk(this, str, th));
    }

    public final void setTag(String str) {
        this.f7818b = str;
    }
}
