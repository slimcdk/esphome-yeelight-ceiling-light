package com.google.firebase.crashlytics.p110c.p112g;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.p110c.C2857b;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.firebase.crashlytics.c.g.g0 */
public class C2883g0 {

    /* renamed from: a */
    private String f5555a = null;

    /* renamed from: b */
    private final ConcurrentHashMap<String, String> f5556b = new ConcurrentHashMap<>();

    /* renamed from: c */
    private static String m8789c(String str) {
        if (str == null) {
            return str;
        }
        String trim = str.trim();
        return trim.length() > 1024 ? trim.substring(0, 1024) : trim;
    }

    @NonNull
    /* renamed from: a */
    public Map<String, String> mo17183a() {
        return Collections.unmodifiableMap(this.f5556b);
    }

    @Nullable
    /* renamed from: b */
    public String mo17184b() {
        return this.f5555a;
    }

    /* renamed from: d */
    public void mo17185d(String str, String str2) {
        if (str != null) {
            String c = m8789c(str);
            if (this.f5556b.size() < 64 || this.f5556b.containsKey(c)) {
                this.f5556b.put(c, str2 == null ? "" : m8789c(str2));
            } else {
                C2857b.m8687f().mo17130b("Exceeded maximum number of custom attributes (64)");
            }
        } else {
            throw new IllegalArgumentException("Custom attribute key must not be null.");
        }
    }

    /* renamed from: e */
    public void mo17186e(String str) {
        this.f5555a = m8789c(str);
    }
}
