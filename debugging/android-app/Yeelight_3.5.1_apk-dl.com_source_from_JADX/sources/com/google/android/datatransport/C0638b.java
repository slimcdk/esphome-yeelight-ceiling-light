package com.google.android.datatransport;

import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue;

@AutoValue
/* renamed from: com.google.android.datatransport.b */
public abstract class C0638b<T> {
    /* renamed from: d */
    public static <T> C0638b<T> m317d(T t) {
        return new C0637a((Integer) null, t, Priority.HIGHEST);
    }

    @Nullable
    /* renamed from: a */
    public abstract Integer mo11090a();

    /* renamed from: b */
    public abstract T mo11091b();

    /* renamed from: c */
    public abstract Priority mo11092c();
}
