package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.C0722a;
import com.google.android.gms.common.api.C0722a.C0726d;
import com.google.android.gms.common.internal.C0914h;

@KeepForSdk
/* renamed from: com.google.android.gms.common.api.internal.b */
public final class C0752b<O extends C0722a.C0726d> {

    /* renamed from: a */
    private final int f578a;

    /* renamed from: b */
    private final C0722a f579b;
    @Nullable

    /* renamed from: c */
    private final C0722a.C0726d f580c;
    @Nullable

    /* renamed from: d */
    private final String f581d;

    private C0752b(C0722a aVar, @Nullable C0722a.C0726d dVar, @Nullable String str) {
        this.f579b = aVar;
        this.f580c = dVar;
        this.f581d = str;
        this.f578a = C0914h.m1403b(aVar, dVar, str);
    }

    @NonNull
    @KeepForSdk
    /* renamed from: a */
    public static <O extends C0722a.C0726d> C0752b<O> m748a(@NonNull C0722a<O> aVar, @Nullable O o, @Nullable String str) {
        return new C0752b<>(aVar, o, str);
    }

    @NonNull
    /* renamed from: b */
    public final String mo11903b() {
        return this.f579b.mo11822d();
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0752b)) {
            return false;
        }
        C0752b bVar = (C0752b) obj;
        return C0914h.m1402a(this.f579b, bVar.f579b) && C0914h.m1402a(this.f580c, bVar.f580c) && C0914h.m1402a(this.f581d, bVar.f581d);
    }

    public final int hashCode() {
        return this.f578a;
    }
}
