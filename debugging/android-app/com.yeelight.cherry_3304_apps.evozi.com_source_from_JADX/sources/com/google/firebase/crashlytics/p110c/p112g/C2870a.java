package com.google.firebase.crashlytics.p110c.p112g;

import com.google.firebase.crashlytics.p110c.p115j.C2980a;
import com.google.firebase.crashlytics.p110c.p115j.C2981b;
import com.google.firebase.crashlytics.p110c.p115j.C2982c;
import java.util.Collections;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: com.google.firebase.crashlytics.c.g.a */
public abstract class C2870a {

    /* renamed from: e */
    private static final Pattern f5527e = Pattern.compile("http(s?)://[^\\/]+", 2);

    /* renamed from: a */
    private final String f5528a;

    /* renamed from: b */
    private final C2982c f5529b;

    /* renamed from: c */
    private final C2980a f5530c;

    /* renamed from: d */
    private final String f5531d;

    public C2870a(String str, String str2, C2982c cVar, C2980a aVar) {
        if (str2 == null) {
            throw new IllegalArgumentException("url must not be null.");
        } else if (cVar != null) {
            this.f5531d = str;
            this.f5528a = m8743f(str2);
            this.f5529b = cVar;
            this.f5530c = aVar;
        } else {
            throw new IllegalArgumentException("requestFactory must not be null.");
        }
    }

    /* renamed from: f */
    private String m8743f(String str) {
        return !C2884h.m8797D(this.f5531d) ? f5527e.matcher(str).replaceFirst(this.f5531d) : str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public C2981b mo17156c() {
        return mo17157d(Collections.emptyMap());
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C2981b mo17157d(Map<String, String> map) {
        C2981b a = this.f5529b.mo17339a(this.f5530c, mo17158e(), map);
        a.mo17334d("User-Agent", "Crashlytics Android SDK/" + C2935k.m8990i());
        a.mo17334d("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public String mo17158e() {
        return this.f5528a;
    }
}
