package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.datatransport.runtime.time.C1354a;
import com.google.auto.value.AutoValue;

@AutoValue
/* renamed from: com.google.android.datatransport.runtime.backends.i */
public abstract class C1322i {
    /* renamed from: a */
    public static C1322i m3475a(Context context, C1354a aVar, C1354a aVar2, String str) {
        return new C1314c(context, aVar, aVar2, str);
    }

    /* renamed from: b */
    public abstract Context mo10219b();

    @NonNull
    /* renamed from: c */
    public abstract String mo10220c();

    /* renamed from: d */
    public abstract C1354a mo10221d();

    /* renamed from: e */
    public abstract C1354a mo10222e();
}
