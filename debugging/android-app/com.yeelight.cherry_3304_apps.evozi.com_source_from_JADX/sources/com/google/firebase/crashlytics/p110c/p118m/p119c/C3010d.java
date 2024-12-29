package com.google.firebase.crashlytics.p110c.p118m.p119c;

import com.google.firebase.crashlytics.p110c.C2857b;
import com.google.firebase.crashlytics.p110c.p118m.p119c.C3008c;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.firebase.crashlytics.c.m.c.d */
public class C3010d implements C3008c {

    /* renamed from: a */
    private final File f5854a;

    /* renamed from: b */
    private final File[] f5855b;

    /* renamed from: c */
    private final Map<String, String> f5856c;

    public C3010d(File file) {
        this(file, Collections.emptyMap());
    }

    public C3010d(File file, Map<String, String> map) {
        this.f5854a = file;
        this.f5855b = new File[]{file};
        this.f5856c = new HashMap(map);
    }

    /* renamed from: a */
    public Map<String, String> mo17400a() {
        return Collections.unmodifiableMap(this.f5856c);
    }

    /* renamed from: b */
    public String mo17401b() {
        String e = mo17404e();
        return e.substring(0, e.lastIndexOf(46));
    }

    /* renamed from: c */
    public File mo17402c() {
        return this.f5854a;
    }

    /* renamed from: d */
    public File[] mo17403d() {
        return this.f5855b;
    }

    /* renamed from: e */
    public String mo17404e() {
        return mo17402c().getName();
    }

    public C3008c.C3009a getType() {
        return C3008c.C3009a.JAVA;
    }

    public void remove() {
        C2857b f = C2857b.m8687f();
        f.mo17130b("Removing report at " + this.f5854a.getPath());
        this.f5854a.delete();
    }
}
