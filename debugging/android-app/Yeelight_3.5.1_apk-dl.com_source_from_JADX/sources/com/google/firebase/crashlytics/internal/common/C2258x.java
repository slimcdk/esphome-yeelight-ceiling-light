package com.google.firebase.crashlytics.internal.common;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.zip.GZIPOutputStream;

/* renamed from: com.google.firebase.crashlytics.internal.common.x */
class C2258x {
    /* renamed from: a */
    private static void m5787a(@Nullable InputStream inputStream, @NonNull File file) {
        if (inputStream != null) {
            byte[] bArr = new byte[8192];
            GZIPOutputStream gZIPOutputStream = null;
            try {
                GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(new FileOutputStream(file));
                while (true) {
                    try {
                        int read = inputStream.read(bArr);
                        if (read > 0) {
                            gZIPOutputStream2.write(bArr, 0, read);
                        } else {
                            gZIPOutputStream2.finish();
                            CommonUtils.m5537f(gZIPOutputStream2);
                            return;
                        }
                    } catch (Throwable th) {
                        th = th;
                        gZIPOutputStream = gZIPOutputStream2;
                        CommonUtils.m5537f(gZIPOutputStream);
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                CommonUtils.m5537f(gZIPOutputStream);
                throw th;
            }
        }
    }

    /* renamed from: b */
    static void m5788b(File file, List<C2257w> list) {
        for (C2257w next : list) {
            InputStream inputStream = null;
            try {
                inputStream = next.mo18536b();
                if (inputStream != null) {
                    m5787a(inputStream, new File(file, next.mo18535a()));
                }
            } catch (IOException unused) {
            } catch (Throwable th) {
                CommonUtils.m5537f(inputStream);
                throw th;
            }
            CommonUtils.m5537f(inputStream);
        }
    }
}
