package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p065m0.C3339g;

/* renamed from: com.google.android.gms.tasks.a */
public class C1872a<TResult> {

    /* renamed from: a */
    private final C1896y f2905a = new C1896y();

    @NonNull
    /* renamed from: a */
    public C3339g<TResult> mo14736a() {
        return this.f2905a;
    }

    /* renamed from: b */
    public void mo14737b(@NonNull Exception exc) {
        this.f2905a.mo14774q(exc);
    }

    /* renamed from: c */
    public void mo14738c(@Nullable TResult tresult) {
        this.f2905a.mo14775r(tresult);
    }

    /* renamed from: d */
    public boolean mo14739d(@NonNull Exception exc) {
        return this.f2905a.mo14777t(exc);
    }

    /* renamed from: e */
    public boolean mo14740e(@Nullable TResult tresult) {
        return this.f2905a.mo14778u(tresult);
    }
}
