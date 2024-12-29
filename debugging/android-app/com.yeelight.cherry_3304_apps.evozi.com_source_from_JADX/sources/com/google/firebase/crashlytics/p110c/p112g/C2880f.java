package com.google.firebase.crashlytics.p110c.p112g;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

/* renamed from: com.google.firebase.crashlytics.c.g.f */
class C2880f implements C2960z {
    @Nullable

    /* renamed from: a */
    private final byte[] f5550a;
    @NonNull

    /* renamed from: b */
    private final String f5551b;
    @NonNull

    /* renamed from: c */
    private final String f5552c;

    C2880f(@NonNull String str, @NonNull String str2, @Nullable byte[] bArr) {
        this.f5551b = str;
        this.f5552c = str2;
        this.f5550a = bArr;
    }

    /* renamed from: d */
    private static /* synthetic */ void m8777d(Throwable th, AutoCloseable autoCloseable) {
        if (th != null) {
            try {
                autoCloseable.close();
            } catch (Throwable unused) {
            }
        } else {
            autoCloseable.close();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0027, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        m8777d(r3, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002b, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x002e, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        m8777d(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0032, code lost:
        throw r3;
     */
    @androidx.annotation.Nullable
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private byte[] m8778e() {
        /*
            r5 = this;
            boolean r0 = r5.m8779f()
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x0033 }
            r0.<init>()     // Catch:{ IOException -> 0x0033 }
            java.util.zip.GZIPOutputStream r2 = new java.util.zip.GZIPOutputStream     // Catch:{ all -> 0x002c }
            r2.<init>(r0)     // Catch:{ all -> 0x002c }
            byte[] r3 = r5.f5550a     // Catch:{ all -> 0x0025 }
            r2.write(r3)     // Catch:{ all -> 0x0025 }
            r2.finish()     // Catch:{ all -> 0x0025 }
            byte[] r3 = r0.toByteArray()     // Catch:{ all -> 0x0025 }
            m8777d(r1, r2)     // Catch:{ all -> 0x002c }
            m8777d(r1, r0)     // Catch:{ IOException -> 0x0033 }
            return r3
        L_0x0025:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0027 }
        L_0x0027:
            r4 = move-exception
            m8777d(r3, r2)     // Catch:{ all -> 0x002c }
            throw r4     // Catch:{ all -> 0x002c }
        L_0x002c:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x002e }
        L_0x002e:
            r3 = move-exception
            m8777d(r2, r0)     // Catch:{ IOException -> 0x0033 }
            throw r3     // Catch:{ IOException -> 0x0033 }
        L_0x0033:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.p110c.p112g.C2880f.m8778e():byte[]");
    }

    /* renamed from: f */
    private boolean m8779f() {
        byte[] bArr = this.f5550a;
        return bArr == null || bArr.length == 0;
    }

    @NonNull
    /* renamed from: a */
    public String mo17178a() {
        return this.f5552c;
    }

    @Nullable
    /* renamed from: b */
    public InputStream mo17179b() {
        if (m8779f()) {
            return null;
        }
        return new ByteArrayInputStream(this.f5550a);
    }

    @Nullable
    /* renamed from: c */
    public CrashlyticsReport.C3050c.C3052b mo17180c() {
        byte[] e = m8778e();
        if (e == null) {
            return null;
        }
        CrashlyticsReport.C3050c.C3052b.C3053a a = CrashlyticsReport.C3050c.C3052b.m9445a();
        a.mo17465b(e);
        a.mo17466c(this.f5551b);
        return a.mo17464a();
    }
}
