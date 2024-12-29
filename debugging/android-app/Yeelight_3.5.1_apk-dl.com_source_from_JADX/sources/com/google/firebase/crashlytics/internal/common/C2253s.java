package com.google.firebase.crashlytics.internal.common;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;

/* renamed from: com.google.firebase.crashlytics.internal.common.s */
class C2253s implements C2257w {
    @NonNull

    /* renamed from: a */
    private final File f3644a;
    @NonNull

    /* renamed from: b */
    private final String f3645b;
    @NonNull

    /* renamed from: c */
    private final String f3646c;

    C2253s(@NonNull String str, @NonNull String str2, @NonNull File file) {
        this.f3645b = str;
        this.f3646c = str2;
        this.f3644a = file;
    }

    @Nullable
    /* renamed from: d */
    private byte[] m5764d() {
        GZIPOutputStream gZIPOutputStream;
        byte[] bArr = new byte[8192];
        try {
            InputStream b = mo18536b();
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                    if (b == null) {
                        gZIPOutputStream.close();
                        byteArrayOutputStream.close();
                        if (b != null) {
                            b.close();
                        }
                        return null;
                    }
                    while (true) {
                        int read = b.read(bArr);
                        if (read > 0) {
                            gZIPOutputStream.write(bArr, 0, read);
                        } else {
                            gZIPOutputStream.finish();
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            gZIPOutputStream.close();
                            byteArrayOutputStream.close();
                            b.close();
                            return byteArray;
                        }
                    }
                } catch (Throwable th) {
                    byteArrayOutputStream.close();
                    throw th;
                }
                throw th;
            } catch (Throwable th2) {
                if (b != null) {
                    b.close();
                }
                throw th2;
            }
        } catch (IOException unused) {
            return null;
        } catch (Throwable th3) {
            th2.addSuppressed(th3);
        }
    }

    @NonNull
    /* renamed from: a */
    public String mo18535a() {
        return this.f3646c;
    }

    @Nullable
    /* renamed from: b */
    public InputStream mo18536b() {
        if (this.f3644a.exists() && this.f3644a.isFile()) {
            try {
                return new FileInputStream(this.f3644a);
            } catch (FileNotFoundException unused) {
            }
        }
        return null;
    }

    @Nullable
    /* renamed from: c */
    public CrashlyticsReport.C2266d.C2268b mo18537c() {
        byte[] d = m5764d();
        if (d != null) {
            return CrashlyticsReport.C2266d.C2268b.m5845a().mo18673b(d).mo18674c(this.f3645b).mo18672a();
        }
        return null;
    }
}
