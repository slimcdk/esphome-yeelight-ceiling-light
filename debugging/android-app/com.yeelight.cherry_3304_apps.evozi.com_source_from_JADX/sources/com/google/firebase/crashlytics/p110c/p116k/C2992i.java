package com.google.firebase.crashlytics.p110c.p116k;

import android.content.Context;
import com.google.firebase.crashlytics.p110c.C2857b;
import java.io.File;

/* renamed from: com.google.firebase.crashlytics.c.k.i */
public class C2992i implements C2991h {

    /* renamed from: a */
    private final Context f5821a;

    public C2992i(Context context) {
        this.f5821a = context;
    }

    /* renamed from: a */
    public String mo17357a() {
        return new File(this.f5821a.getFilesDir(), ".com.google.firebase.crashlytics").getPath();
    }

    /* renamed from: b */
    public File mo17358b() {
        return mo17359c(new File(this.f5821a.getFilesDir(), ".com.google.firebase.crashlytics"));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public File mo17359c(File file) {
        if (file == null) {
            C2857b.m8687f().mo17130b("Null File");
            return null;
        } else if (file.exists() || file.mkdirs()) {
            return file;
        } else {
            C2857b.m8687f().mo17136i("Couldn't create file");
            return null;
        }
    }
}
