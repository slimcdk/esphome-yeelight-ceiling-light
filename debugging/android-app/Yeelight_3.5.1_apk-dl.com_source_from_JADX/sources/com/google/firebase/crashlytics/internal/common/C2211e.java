package com.google.firebase.crashlytics.internal.common;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;

/* renamed from: com.google.firebase.crashlytics.internal.common.e */
class C2211e implements C2257w {
    @Nullable

    /* renamed from: a */
    private final byte[] f3533a;
    @NonNull

    /* renamed from: b */
    private final String f3534b;
    @NonNull

    /* renamed from: c */
    private final String f3535c;

    C2211e(@NonNull String str, @NonNull String str2, @Nullable byte[] bArr) {
        this.f3534b = str;
        this.f3535c = str2;
        this.f3533a = bArr;
    }

    @Nullable
    /* renamed from: d */
    private byte[] m5594d() {
        GZIPOutputStream gZIPOutputStream;
        if (m5595e()) {
            return null;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                gZIPOutputStream.write(this.f3533a);
                gZIPOutputStream.finish();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                gZIPOutputStream.close();
                byteArrayOutputStream.close();
                return byteArray;
            } catch (Throwable th) {
                byteArrayOutputStream.close();
                throw th;
            }
        } catch (IOException unused) {
            return null;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
    }

    /* renamed from: e */
    private boolean m5595e() {
        byte[] bArr = this.f3533a;
        return bArr == null || bArr.length == 0;
    }

    @NonNull
    /* renamed from: a */
    public String mo18535a() {
        return this.f3535c;
    }

    @Nullable
    /* renamed from: b */
    public InputStream mo18536b() {
        if (m5595e()) {
            return null;
        }
        return new ByteArrayInputStream(this.f3533a);
    }

    @Nullable
    /* renamed from: c */
    public CrashlyticsReport.C2266d.C2268b mo18537c() {
        byte[] d = m5594d();
        if (d == null) {
            return null;
        }
        return CrashlyticsReport.C2266d.C2268b.m5845a().mo18673b(d).mo18674c(this.f3534b).mo18672a();
    }
}
