package com.google.firebase.crashlytics.p110c.p112g;

import com.google.firebase.crashlytics.p110c.C2857b;
import com.google.firebase.crashlytics.p110c.p116k.C2991h;
import java.io.File;
import java.io.IOException;

/* renamed from: com.google.firebase.crashlytics.c.g.l */
class C2941l {

    /* renamed from: a */
    private final String f5705a;

    /* renamed from: b */
    private final C2991h f5706b;

    public C2941l(String str, C2991h hVar) {
        this.f5705a = str;
        this.f5706b = hVar;
    }

    /* renamed from: b */
    private File m9005b() {
        return new File(this.f5706b.mo17358b(), this.f5705a);
    }

    /* renamed from: a */
    public boolean mo17280a() {
        try {
            return m9005b().createNewFile();
        } catch (IOException e) {
            C2857b f = C2857b.m8687f();
            f.mo17133e("Error creating marker: " + this.f5705a, e);
            return false;
        }
    }

    /* renamed from: c */
    public boolean mo17281c() {
        return m9005b().exists();
    }

    /* renamed from: d */
    public boolean mo17282d() {
        return m9005b().delete();
    }
}
