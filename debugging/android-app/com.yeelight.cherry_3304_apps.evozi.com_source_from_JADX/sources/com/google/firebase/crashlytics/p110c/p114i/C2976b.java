package com.google.firebase.crashlytics.p110c.p114i;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.p110c.p112g.C2884h;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/* renamed from: com.google.firebase.crashlytics.c.i.b */
public final class C2976b {
    @NonNull
    /* renamed from: a */
    public static byte[] m9146a(@Nullable File file, @NonNull Context context) {
        if (file == null || !file.exists()) {
            return new byte[0];
        }
        BufferedReader bufferedReader = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file));
            try {
                byte[] a = new C2974a(context, new C2979e()).mo17331a(bufferedReader2);
                C2884h.m8809f(bufferedReader2);
                return a;
            } catch (Throwable th) {
                th = th;
                bufferedReader = bufferedReader2;
                C2884h.m8809f(bufferedReader);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            C2884h.m8809f(bufferedReader);
            throw th;
        }
    }
}
