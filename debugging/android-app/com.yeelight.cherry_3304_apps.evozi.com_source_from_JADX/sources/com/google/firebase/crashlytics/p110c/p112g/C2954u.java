package com.google.firebase.crashlytics.p110c.p112g;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/* renamed from: com.google.firebase.crashlytics.c.g.u */
class C2954u implements C2960z {
    @NonNull

    /* renamed from: a */
    private final File f5741a;
    @NonNull

    /* renamed from: b */
    private final String f5742b;
    @NonNull

    /* renamed from: c */
    private final String f5743c;

    C2954u(@NonNull String str, @NonNull String str2, @NonNull File file) {
        this.f5742b = str;
        this.f5743c = str2;
        this.f5741a = file;
    }

    /* renamed from: d */
    private static /* synthetic */ void m9050d(Throwable th, AutoCloseable autoCloseable) {
        if (th != null) {
            try {
                autoCloseable.close();
            } catch (Throwable unused) {
            }
        } else {
            autoCloseable.close();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002c, code lost:
        r4.finish();
        r0 = r3.toByteArray();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        m9050d((java.lang.Throwable) null, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        m9050d((java.lang.Throwable) null, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0039, code lost:
        if (r2 == null) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        m9050d((java.lang.Throwable) null, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x003e, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0041, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        m9050d(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0045, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0048, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        m9050d(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x004c, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x004f, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0050, code lost:
        if (r2 != null) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        m9050d(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0055, code lost:
        throw r3;
     */
    @androidx.annotation.Nullable
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private byte[] m9051e() {
        /*
            r7 = this;
            r0 = 8192(0x2000, float:1.14794E-41)
            byte[] r0 = new byte[r0]
            r1 = 0
            java.io.InputStream r2 = r7.mo17179b()     // Catch:{ IOException -> 0x0056 }
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x004d }
            r3.<init>()     // Catch:{ all -> 0x004d }
            java.util.zip.GZIPOutputStream r4 = new java.util.zip.GZIPOutputStream     // Catch:{ all -> 0x0046 }
            r4.<init>(r3)     // Catch:{ all -> 0x0046 }
            if (r2 != 0) goto L_0x0021
            m9050d(r1, r4)     // Catch:{ all -> 0x0046 }
            m9050d(r1, r3)     // Catch:{ all -> 0x004d }
            if (r2 == 0) goto L_0x0020
            m9050d(r1, r2)     // Catch:{ IOException -> 0x0056 }
        L_0x0020:
            return r1
        L_0x0021:
            int r5 = r2.read(r0)     // Catch:{ all -> 0x003f }
            if (r5 <= 0) goto L_0x002c
            r6 = 0
            r4.write(r0, r6, r5)     // Catch:{ all -> 0x003f }
            goto L_0x0021
        L_0x002c:
            r4.finish()     // Catch:{ all -> 0x003f }
            byte[] r0 = r3.toByteArray()     // Catch:{ all -> 0x003f }
            m9050d(r1, r4)     // Catch:{ all -> 0x0046 }
            m9050d(r1, r3)     // Catch:{ all -> 0x004d }
            if (r2 == 0) goto L_0x003e
            m9050d(r1, r2)     // Catch:{ IOException -> 0x0056 }
        L_0x003e:
            return r0
        L_0x003f:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0041 }
        L_0x0041:
            r5 = move-exception
            m9050d(r0, r4)     // Catch:{ all -> 0x0046 }
            throw r5     // Catch:{ all -> 0x0046 }
        L_0x0046:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0048 }
        L_0x0048:
            r4 = move-exception
            m9050d(r0, r3)     // Catch:{ all -> 0x004d }
            throw r4     // Catch:{ all -> 0x004d }
        L_0x004d:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x004f }
        L_0x004f:
            r3 = move-exception
            if (r2 == 0) goto L_0x0055
            m9050d(r0, r2)     // Catch:{ IOException -> 0x0056 }
        L_0x0055:
            throw r3     // Catch:{ IOException -> 0x0056 }
        L_0x0056:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.p110c.p112g.C2954u.m9051e():byte[]");
    }

    @NonNull
    /* renamed from: a */
    public String mo17178a() {
        return this.f5743c;
    }

    @Nullable
    /* renamed from: b */
    public InputStream mo17179b() {
        if (this.f5741a.exists() && this.f5741a.isFile()) {
            try {
                return new FileInputStream(this.f5741a);
            } catch (FileNotFoundException unused) {
            }
        }
        return null;
    }

    @Nullable
    /* renamed from: c */
    public CrashlyticsReport.C3050c.C3052b mo17180c() {
        byte[] e = m9051e();
        if (e == null) {
            return null;
        }
        CrashlyticsReport.C3050c.C3052b.C3053a a = CrashlyticsReport.C3050c.C3052b.m9445a();
        a.mo17465b(e);
        a.mo17466c(this.f5742b);
        return a.mo17464a();
    }
}
