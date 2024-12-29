package com.xiaomi.push;

import android.annotation.SuppressLint;
import android.content.Context;
import com.xiaomi.channel.commonutils.logger.C4408b;
import com.xiaomi.mipush.sdk.Constants;
import com.xiaomi.push.service.C4916bk;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.xiaomi.push.de */
class C4613de {

    /* renamed from: a */
    private static String f7779a = "/MiPushLog";

    /* renamed from: a */
    private int f7780a;
    @SuppressLint({"SimpleDateFormat"})

    /* renamed from: a */
    private final SimpleDateFormat f7781a = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    /* renamed from: a */
    private ArrayList<File> f7782a = new ArrayList<>();

    /* renamed from: a */
    private boolean f7783a;

    /* renamed from: b */
    private int f7784b = 2097152;

    /* renamed from: b */
    private String f7785b;

    /* renamed from: c */
    private String f7786c;

    C4613de() {
    }

    /* renamed from: a */
    private void m13290a(BufferedReader bufferedReader, BufferedWriter bufferedWriter, Pattern pattern) {
        char[] cArr = new char[4096];
        int read = bufferedReader.read(cArr);
        boolean z = false;
        while (read != -1 && !z) {
            String str = new String(cArr, 0, read);
            Matcher matcher = pattern.matcher(str);
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i >= read || !matcher.find(i)) {
                    break;
                }
                int start = matcher.start();
                String substring = str.substring(start, this.f7785b.length() + start);
                if (this.f7783a) {
                    if (substring.compareTo(this.f7786c) > 0) {
                        read = start;
                        z = true;
                        break;
                    }
                } else if (substring.compareTo(this.f7785b) >= 0) {
                    this.f7783a = true;
                    i2 = start;
                }
                int indexOf = str.indexOf(10, start);
                if (indexOf == -1) {
                    indexOf = this.f7785b.length();
                }
                i = start + indexOf;
            }
            if (this.f7783a) {
                int i3 = read - i2;
                this.f7780a += i3;
                bufferedWriter.write(cArr, i2, i3);
                if (z || this.f7780a > this.f7784b) {
                    return;
                }
            }
            read = bufferedReader.read(cArr);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.io.BufferedWriter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.io.BufferedWriter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.io.BufferedWriter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.io.BufferedWriter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.io.BufferedWriter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.io.BufferedWriter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: java.io.BufferedWriter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: java.io.BufferedWriter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: java.io.BufferedWriter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: java.io.BufferedWriter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: java.io.BufferedWriter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: java.io.BufferedWriter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: java.io.BufferedWriter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v12, resolved type: java.io.BufferedWriter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v13, resolved type: java.io.BufferedWriter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: java.io.BufferedWriter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: java.io.BufferedWriter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v14, resolved type: java.io.BufferedWriter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: java.io.BufferedWriter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v15, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: java.io.BufferedWriter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v22, resolved type: java.io.BufferedWriter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v23, resolved type: java.io.BufferedWriter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v24, resolved type: java.io.BufferedWriter} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void mo28901a(java.io.File r9) {
        /*
            r8 = this;
            java.lang.String r0 = "LOG: filter error = "
            java.lang.String r1 = "\\d{4}-\\d{2}-\\d{2} \\d{2}:\\d{2}:\\d{2}"
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r1)
            r2 = 0
            java.io.BufferedWriter r3 = new java.io.BufferedWriter     // Catch:{ FileNotFoundException -> 0x00d6, IOException -> 0x00c0, all -> 0x00bd }
            java.io.OutputStreamWriter r4 = new java.io.OutputStreamWriter     // Catch:{ FileNotFoundException -> 0x00d6, IOException -> 0x00c0, all -> 0x00bd }
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x00d6, IOException -> 0x00c0, all -> 0x00bd }
            r5.<init>(r9)     // Catch:{ FileNotFoundException -> 0x00d6, IOException -> 0x00c0, all -> 0x00bd }
            r4.<init>(r5)     // Catch:{ FileNotFoundException -> 0x00d6, IOException -> 0x00c0, all -> 0x00bd }
            r3.<init>(r4)     // Catch:{ FileNotFoundException -> 0x00d6, IOException -> 0x00c0, all -> 0x00bd }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x00b9, IOException -> 0x00b5, all -> 0x00b1 }
            r9.<init>()     // Catch:{ FileNotFoundException -> 0x00b9, IOException -> 0x00b5, all -> 0x00b1 }
            java.lang.String r4 = "model :"
            r9.append(r4)     // Catch:{ FileNotFoundException -> 0x00b9, IOException -> 0x00b5, all -> 0x00b1 }
            java.lang.String r4 = android.os.Build.MODEL     // Catch:{ FileNotFoundException -> 0x00b9, IOException -> 0x00b5, all -> 0x00b1 }
            r9.append(r4)     // Catch:{ FileNotFoundException -> 0x00b9, IOException -> 0x00b5, all -> 0x00b1 }
            java.lang.String r4 = "; os :"
            r9.append(r4)     // Catch:{ FileNotFoundException -> 0x00b9, IOException -> 0x00b5, all -> 0x00b1 }
            java.lang.String r4 = android.os.Build.VERSION.INCREMENTAL     // Catch:{ FileNotFoundException -> 0x00b9, IOException -> 0x00b5, all -> 0x00b1 }
            r9.append(r4)     // Catch:{ FileNotFoundException -> 0x00b9, IOException -> 0x00b5, all -> 0x00b1 }
            java.lang.String r4 = "; uid :"
            r9.append(r4)     // Catch:{ FileNotFoundException -> 0x00b9, IOException -> 0x00b5, all -> 0x00b1 }
            java.lang.String r4 = com.xiaomi.push.service.C4929bv.mo30029a()     // Catch:{ FileNotFoundException -> 0x00b9, IOException -> 0x00b5, all -> 0x00b1 }
            r9.append(r4)     // Catch:{ FileNotFoundException -> 0x00b9, IOException -> 0x00b5, all -> 0x00b1 }
            java.lang.String r4 = "; lng :"
            r9.append(r4)     // Catch:{ FileNotFoundException -> 0x00b9, IOException -> 0x00b5, all -> 0x00b1 }
            java.util.Locale r4 = java.util.Locale.getDefault()     // Catch:{ FileNotFoundException -> 0x00b9, IOException -> 0x00b5, all -> 0x00b1 }
            java.lang.String r4 = r4.toString()     // Catch:{ FileNotFoundException -> 0x00b9, IOException -> 0x00b5, all -> 0x00b1 }
            r9.append(r4)     // Catch:{ FileNotFoundException -> 0x00b9, IOException -> 0x00b5, all -> 0x00b1 }
            java.lang.String r4 = "; sdk :"
            r9.append(r4)     // Catch:{ FileNotFoundException -> 0x00b9, IOException -> 0x00b5, all -> 0x00b1 }
            r4 = 48
            r9.append(r4)     // Catch:{ FileNotFoundException -> 0x00b9, IOException -> 0x00b5, all -> 0x00b1 }
            java.lang.String r4 = "; andver :"
            r9.append(r4)     // Catch:{ FileNotFoundException -> 0x00b9, IOException -> 0x00b5, all -> 0x00b1 }
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch:{ FileNotFoundException -> 0x00b9, IOException -> 0x00b5, all -> 0x00b1 }
            r9.append(r4)     // Catch:{ FileNotFoundException -> 0x00b9, IOException -> 0x00b5, all -> 0x00b1 }
            java.lang.String r4 = "\n"
            r9.append(r4)     // Catch:{ FileNotFoundException -> 0x00b9, IOException -> 0x00b5, all -> 0x00b1 }
            java.lang.String r9 = r9.toString()     // Catch:{ FileNotFoundException -> 0x00b9, IOException -> 0x00b5, all -> 0x00b1 }
            r3.write(r9)     // Catch:{ FileNotFoundException -> 0x00b9, IOException -> 0x00b5, all -> 0x00b1 }
            r9 = 0
            r8.f7780a = r9     // Catch:{ FileNotFoundException -> 0x00b9, IOException -> 0x00b5, all -> 0x00b1 }
            java.util.ArrayList<java.io.File> r9 = r8.f7782a     // Catch:{ FileNotFoundException -> 0x00b9, IOException -> 0x00b5, all -> 0x00b1 }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ FileNotFoundException -> 0x00b9, IOException -> 0x00b5, all -> 0x00b1 }
        L_0x0076:
            boolean r4 = r9.hasNext()     // Catch:{ FileNotFoundException -> 0x00b9, IOException -> 0x00b5, all -> 0x00b1 }
            if (r4 == 0) goto L_0x009f
            java.lang.Object r4 = r9.next()     // Catch:{ FileNotFoundException -> 0x00b9, IOException -> 0x00b5, all -> 0x00b1 }
            java.io.File r4 = (java.io.File) r4     // Catch:{ FileNotFoundException -> 0x00b9, IOException -> 0x00b5, all -> 0x00b1 }
            java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch:{ FileNotFoundException -> 0x00b9, IOException -> 0x00b5, all -> 0x00b1 }
            java.io.InputStreamReader r6 = new java.io.InputStreamReader     // Catch:{ FileNotFoundException -> 0x00b9, IOException -> 0x00b5, all -> 0x00b1 }
            java.io.FileInputStream r7 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x00b9, IOException -> 0x00b5, all -> 0x00b1 }
            r7.<init>(r4)     // Catch:{ FileNotFoundException -> 0x00b9, IOException -> 0x00b5, all -> 0x00b1 }
            r6.<init>(r7)     // Catch:{ FileNotFoundException -> 0x00b9, IOException -> 0x00b5, all -> 0x00b1 }
            r5.<init>(r6)     // Catch:{ FileNotFoundException -> 0x00b9, IOException -> 0x00b5, all -> 0x00b1 }
            r8.m13290a(r5, r3, r1)     // Catch:{ FileNotFoundException -> 0x009d, IOException -> 0x009b, all -> 0x0099 }
            r5.close()     // Catch:{ FileNotFoundException -> 0x009d, IOException -> 0x009b, all -> 0x0099 }
            r2 = r5
            goto L_0x0076
        L_0x0099:
            r9 = move-exception
            goto L_0x00b3
        L_0x009b:
            r9 = move-exception
            goto L_0x00b7
        L_0x009d:
            r9 = move-exception
            goto L_0x00bb
        L_0x009f:
            com.xiaomi.push.cv r9 = com.xiaomi.push.C4600cv.mo28881a()     // Catch:{ FileNotFoundException -> 0x00b9, IOException -> 0x00b5, all -> 0x00b1 }
            java.lang.String r9 = r9.mo28886c()     // Catch:{ FileNotFoundException -> 0x00b9, IOException -> 0x00b5, all -> 0x00b1 }
            r3.write(r9)     // Catch:{ FileNotFoundException -> 0x00b9, IOException -> 0x00b5, all -> 0x00b1 }
            com.xiaomi.push.C4506ab.m12831a((java.io.Closeable) r3)
            com.xiaomi.push.C4506ab.m12831a((java.io.Closeable) r2)
            goto L_0x00f4
        L_0x00b1:
            r9 = move-exception
            r5 = r2
        L_0x00b3:
            r2 = r3
            goto L_0x00f6
        L_0x00b5:
            r9 = move-exception
            r5 = r2
        L_0x00b7:
            r2 = r3
            goto L_0x00c2
        L_0x00b9:
            r9 = move-exception
            r5 = r2
        L_0x00bb:
            r2 = r3
            goto L_0x00d8
        L_0x00bd:
            r9 = move-exception
            r5 = r2
            goto L_0x00f6
        L_0x00c0:
            r9 = move-exception
            r5 = r2
        L_0x00c2:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f5 }
            r1.<init>()     // Catch:{ all -> 0x00f5 }
            r1.append(r0)     // Catch:{ all -> 0x00f5 }
            java.lang.String r9 = r9.getMessage()     // Catch:{ all -> 0x00f5 }
            r1.append(r9)     // Catch:{ all -> 0x00f5 }
            java.lang.String r9 = r1.toString()     // Catch:{ all -> 0x00f5 }
            goto L_0x00eb
        L_0x00d6:
            r9 = move-exception
            r5 = r2
        L_0x00d8:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f5 }
            r1.<init>()     // Catch:{ all -> 0x00f5 }
            r1.append(r0)     // Catch:{ all -> 0x00f5 }
            java.lang.String r9 = r9.getMessage()     // Catch:{ all -> 0x00f5 }
            r1.append(r9)     // Catch:{ all -> 0x00f5 }
            java.lang.String r9 = r1.toString()     // Catch:{ all -> 0x00f5 }
        L_0x00eb:
            com.xiaomi.channel.commonutils.logger.C4408b.m12482c(r9)     // Catch:{ all -> 0x00f5 }
            com.xiaomi.push.C4506ab.m12831a((java.io.Closeable) r2)
            com.xiaomi.push.C4506ab.m12831a((java.io.Closeable) r5)
        L_0x00f4:
            return
        L_0x00f5:
            r9 = move-exception
        L_0x00f6:
            com.xiaomi.push.C4506ab.m12831a((java.io.Closeable) r2)
            com.xiaomi.push.C4506ab.m12831a((java.io.Closeable) r5)
            goto L_0x00fe
        L_0x00fd:
            throw r9
        L_0x00fe:
            goto L_0x00fd
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.C4613de.mo28901a(java.io.File):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C4613de m13292a(File file) {
        if (file.exists()) {
            this.f7782a.add(file);
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C4613de mo28902a(Date date, Date date2) {
        String str;
        if (date.after(date2)) {
            this.f7785b = this.f7781a.format(date2);
            str = this.f7781a.format(date);
        } else {
            this.f7785b = this.f7781a.format(date);
            str = this.f7781a.format(date2);
        }
        this.f7786c = str;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public File mo28903a(Context context, Date date, Date date2, File file) {
        File file2;
        File file3;
        if ("com.xiaomi.xmsf".equalsIgnoreCase(context.getPackageName())) {
            file3 = new File(context.getExternalFilesDir((String) null), C4916bk.f9578N);
            if (!file3.exists()) {
                file3 = new File(context.getFilesDir(), C4916bk.f9578N);
            }
            if (!file3.exists()) {
                file3 = context.getFilesDir();
            }
            mo28901a(new File(file3, "xmsf.log.1"));
            file2 = new File(file3, "xmsf.log");
        } else {
            file3 = new File(context.getExternalFilesDir((String) null) + f7779a);
            mo28901a(new File(file3, "log0.txt"));
            file2 = new File(file3, "log1.txt");
        }
        mo28901a(file2);
        if (!file3.isDirectory()) {
            return null;
        }
        File file4 = new File(file, date.getTime() + Constants.ACCEPT_TIME_SEPARATOR_SERVER + date2.getTime() + ".zip");
        if (file4.exists()) {
            return null;
        }
        mo28902a(date, date2);
        long currentTimeMillis = System.currentTimeMillis();
        File file5 = new File(file, "log.txt");
        mo28901a(file5);
        C4408b.m12482c("LOG: filter cost = " + (System.currentTimeMillis() - currentTimeMillis));
        if (file5.exists()) {
            long currentTimeMillis2 = System.currentTimeMillis();
            C4506ab.m12832a(file4, file5);
            C4408b.m12482c("LOG: zip cost = " + (System.currentTimeMillis() - currentTimeMillis2));
            file5.delete();
            if (file4.exists()) {
                return file4;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo28904a(int i) {
        if (i != 0) {
            this.f7784b = i;
        }
    }
}
