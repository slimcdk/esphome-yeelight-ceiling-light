package com.google.android.datatransport.runtime.backends;

import androidx.annotation.Nullable;
import com.google.android.datatransport.runtime.backends.C1310a;
import com.google.auto.value.AutoValue;
import p011c.p012a.p019b.p020a.p021i.C0481h;

@AutoValue
/* renamed from: com.google.android.datatransport.runtime.backends.g */
public abstract class C1318g {

    @AutoValue.Builder
    /* renamed from: com.google.android.datatransport.runtime.backends.g$a */
    public static abstract class C1319a {
        /* renamed from: a */
        public abstract C1318g mo10211a();

        /* renamed from: b */
        public abstract C1319a mo10212b(Iterable<C0481h> iterable);

        /* renamed from: c */
        public abstract C1319a mo10213c(@Nullable byte[] bArr);
    }

    /* renamed from: a */
    public static C1319a m3464a() {
        return new C1310a.C1312b();
    }

    /* renamed from: b */
    public abstract Iterable<C0481h> mo10206b();

    @Nullable
    /* renamed from: c */
    public abstract byte[] mo10207c();
}
