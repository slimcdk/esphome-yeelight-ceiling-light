package com.google.firebase.crashlytics.p110c.p118m.p119c;

import com.google.firebase.crashlytics.p110c.C2857b;
import com.google.firebase.crashlytics.p110c.p118m.p119c.C3008c;
import java.io.File;
import java.util.Map;

/* renamed from: com.google.firebase.crashlytics.c.m.c.b */
public class C3007b implements C3008c {

    /* renamed from: a */
    private final File f5850a;

    public C3007b(File file) {
        this.f5850a = file;
    }

    /* renamed from: a */
    public Map<String, String> mo17400a() {
        return null;
    }

    /* renamed from: b */
    public String mo17401b() {
        return this.f5850a.getName();
    }

    /* renamed from: c */
    public File mo17402c() {
        return null;
    }

    /* renamed from: d */
    public File[] mo17403d() {
        return this.f5850a.listFiles();
    }

    /* renamed from: e */
    public String mo17404e() {
        return null;
    }

    public C3008c.C3009a getType() {
        return C3008c.C3009a.NATIVE;
    }

    public void remove() {
        for (File file : mo17403d()) {
            C2857b.m8687f().mo17130b("Removing native report file at " + file.getPath());
            file.delete();
        }
        C2857b.m8687f().mo17130b("Removing native report directory at " + this.f5850a);
        this.f5850a.delete();
    }
}
