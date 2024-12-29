package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.auto.value.AutoValue;
import p083q.C3604a;

@AutoValue
/* renamed from: com.google.android.datatransport.runtime.backends.e */
public abstract class C0687e {
    /* renamed from: a */
    public static C0687e m526a(Context context, C3604a aVar, C3604a aVar2, String str) {
        return new C0684c(context, aVar, aVar2, str);
    }

    /* renamed from: b */
    public abstract Context mo11223b();

    @NonNull
    /* renamed from: c */
    public abstract String mo11224c();

    /* renamed from: d */
    public abstract C3604a mo11225d();

    /* renamed from: e */
    public abstract C3604a mo11226e();
}
