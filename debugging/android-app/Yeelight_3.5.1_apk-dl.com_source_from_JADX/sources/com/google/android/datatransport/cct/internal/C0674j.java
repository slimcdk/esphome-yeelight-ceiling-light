package com.google.android.datatransport.cct.internal;

import androidx.annotation.NonNull;
import com.google.auto.value.AutoValue;
import com.google.firebase.encoders.annotations.Encodable;
import java.util.List;
import p049j1.C3264a;
import p061l1.C3310d;

@AutoValue
@Encodable
/* renamed from: com.google.android.datatransport.cct.internal.j */
public abstract class C0674j {
    @NonNull
    /* renamed from: a */
    public static C0674j m461a(@NonNull List<C0677l> list) {
        return new C0660d(list);
    }

    @NonNull
    /* renamed from: b */
    public static C3264a m462b() {
        return new C3310d().mo24014j(C0650b.f322a).mo24015k(true).mo24013i();
    }

    @NonNull
    @Encodable.Field(name = "logRequest")
    /* renamed from: c */
    public abstract List<C0677l> mo11157c();
}
