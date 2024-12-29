package com.google.firebase.crashlytics.p110c.p112g;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.zip.GZIPOutputStream;

/* renamed from: com.google.firebase.crashlytics.c.g.a0 */
class C2871a0 {
    /* renamed from: a */
    private static void m8747a(@Nullable InputStream inputStream, @NonNull File file) {
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
                            C2884h.m8809f(gZIPOutputStream2);
                            return;
                        }
                    } catch (Throwable th) {
                        th = th;
                        gZIPOutputStream = gZIPOutputStream2;
                        C2884h.m8809f(gZIPOutputStream);
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                C2884h.m8809f(gZIPOutputStream);
                throw th;
            }
        }
    }

    /* renamed from: b */
    static void m8748b(File file, List<C2960z> list) {
        for (C2960z next : list) {
            InputStream inputStream = null;
            try {
                inputStream = next.mo17179b();
                if (inputStream != null) {
                    m8747a(inputStream, new File(file, next.mo17178a()));
                }
            } catch (IOException unused) {
            } catch (Throwable th) {
                C2884h.m8809f(inputStream);
                throw th;
            }
            C2884h.m8809f(inputStream);
        }
    }
}
