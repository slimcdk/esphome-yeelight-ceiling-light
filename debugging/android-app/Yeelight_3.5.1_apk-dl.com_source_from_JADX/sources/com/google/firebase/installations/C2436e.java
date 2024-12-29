package com.google.firebase.installations;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.installations.local.C2440b;
import com.xiaomi.mipush.sdk.Constants;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import p095s1.C3684a;
import p095s1.C3685b;

/* renamed from: com.google.firebase.installations.e */
public final class C2436e {

    /* renamed from: b */
    public static final long f4109b = TimeUnit.HOURS.toSeconds(1);

    /* renamed from: c */
    private static final Pattern f4110c = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* renamed from: d */
    private static C2436e f4111d;

    /* renamed from: a */
    private final C3684a f4112a;

    private C2436e(C3684a aVar) {
        this.f4112a = aVar;
    }

    /* renamed from: c */
    public static C2436e m6526c() {
        return m6527d(C3685b.m10529b());
    }

    /* renamed from: d */
    public static C2436e m6527d(C3684a aVar) {
        if (f4111d == null) {
            f4111d = new C2436e(aVar);
        }
        return f4111d;
    }

    /* renamed from: g */
    static boolean m6528g(@Nullable String str) {
        return f4110c.matcher(str).matches();
    }

    /* renamed from: h */
    static boolean m6529h(@Nullable String str) {
        return str.contains(Constants.COLON_SEPARATOR);
    }

    /* renamed from: a */
    public long mo19060a() {
        return this.f4112a.mo26092a();
    }

    /* renamed from: b */
    public long mo19061b() {
        return TimeUnit.MILLISECONDS.toSeconds(mo19060a());
    }

    /* renamed from: e */
    public long mo19062e() {
        return (long) (Math.random() * 1000.0d);
    }

    /* renamed from: f */
    public boolean mo19063f(@NonNull C2440b bVar) {
        return TextUtils.isEmpty(bVar.mo19066b()) || bVar.mo19073h() + bVar.mo19067c() < mo19061b() + f4109b;
    }
}
