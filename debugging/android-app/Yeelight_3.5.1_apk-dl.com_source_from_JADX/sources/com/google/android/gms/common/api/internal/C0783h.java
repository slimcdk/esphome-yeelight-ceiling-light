package com.google.android.gms.common.api.internal;

import android.app.Activity;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.C0917i;

@KeepForSdk
/* renamed from: com.google.android.gms.common.api.internal.h */
public class C0783h {

    /* renamed from: a */
    private final Object f642a;

    public C0783h(@NonNull Activity activity) {
        C0917i.m1420k(activity, "Activity must not be null");
        this.f642a = activity;
    }

    @NonNull
    /* renamed from: a */
    public final Activity mo11973a() {
        return (Activity) this.f642a;
    }

    @NonNull
    /* renamed from: b */
    public final FragmentActivity mo11974b() {
        return (FragmentActivity) this.f642a;
    }

    /* renamed from: c */
    public final boolean mo11975c() {
        return this.f642a instanceof Activity;
    }

    /* renamed from: d */
    public final boolean mo11976d() {
        return this.f642a instanceof FragmentActivity;
    }
}
