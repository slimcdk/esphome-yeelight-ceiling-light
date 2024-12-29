package com.google.android.datatransport.runtime.backends;

import androidx.annotation.Nullable;
import com.google.android.datatransport.runtime.backends.C0680a;
import com.google.auto.value.AutoValue;
import p035g.C3188i;

@AutoValue
/* renamed from: com.google.android.datatransport.runtime.backends.d */
public abstract class C0685d {

    @AutoValue.Builder
    /* renamed from: com.google.android.datatransport.runtime.backends.d$a */
    public static abstract class C0686a {
        /* renamed from: a */
        public abstract C0685d mo11217a();

        /* renamed from: b */
        public abstract C0686a mo11218b(Iterable<C3188i> iterable);

        /* renamed from: c */
        public abstract C0686a mo11219c(@Nullable byte[] bArr);
    }

    /* renamed from: a */
    public static C0686a m520a() {
        return new C0680a.C0682b();
    }

    /* renamed from: b */
    public abstract Iterable<C3188i> mo11212b();

    @Nullable
    /* renamed from: c */
    public abstract byte[] mo11213c();
}
