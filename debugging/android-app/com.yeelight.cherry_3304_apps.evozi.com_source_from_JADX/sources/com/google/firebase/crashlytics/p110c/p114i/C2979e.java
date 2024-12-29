package com.google.firebase.crashlytics.p110c.p114i;

import com.google.firebase.crashlytics.p110c.p112g.C2884h;
import com.google.firebase.crashlytics.p110c.p114i.C2974a;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

/* renamed from: com.google.firebase.crashlytics.c.i.e */
class C2979e implements C2974a.C2975a {
    C2979e() {
    }

    /* renamed from: b */
    private static String m9148b(String str) {
        BufferedInputStream bufferedInputStream = null;
        try {
            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(str));
            try {
                String H = C2884h.m8801H(bufferedInputStream2);
                C2884h.m8809f(bufferedInputStream2);
                return H;
            } catch (Throwable th) {
                th = th;
                bufferedInputStream = bufferedInputStream2;
                C2884h.m8809f(bufferedInputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            C2884h.m8809f(bufferedInputStream);
            throw th;
        }
    }

    /* renamed from: a */
    public String mo17332a(File file) {
        return m9148b(file.getPath());
    }
}
