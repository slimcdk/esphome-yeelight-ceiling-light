package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.C0917i;
import java.io.FileDescriptor;
import java.io.PrintWriter;

@KeepForSdk
public class LifecycleCallback {
    @NonNull
    @KeepForSdk

    /* renamed from: a */
    protected final C0788i f572a;

    @KeepForSdk
    protected LifecycleCallback(@NonNull C0788i iVar) {
        this.f572a = iVar;
    }

    @NonNull
    @KeepForSdk
    /* renamed from: c */
    public static C0788i m727c(@NonNull Activity activity) {
        return m728d(new C0783h(activity));
    }

    @NonNull
    @KeepForSdk
    /* renamed from: d */
    protected static C0788i m728d(@NonNull C0783h hVar) {
        if (hVar.mo11976d()) {
            return zzd.m1203x(hVar.mo11974b());
        }
        if (hVar.mo11975c()) {
            return C0819n3.m970d(hVar.mo11973a());
        }
        throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
    }

    @Keep
    private static C0788i getChimeraLifecycleFragmentImpl(C0783h hVar) {
        throw new IllegalStateException("Method not available in SDK.");
    }

    @MainThread
    @KeepForSdk
    /* renamed from: a */
    public void mo11891a(@NonNull String str, @NonNull FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, @NonNull String[] strArr) {
    }

    @NonNull
    @KeepForSdk
    /* renamed from: b */
    public Activity mo11892b() {
        Activity l = this.f572a.mo12000l();
        C0917i.m1419j(l);
        return l;
    }

    @MainThread
    @KeepForSdk
    /* renamed from: e */
    public void mo11893e(int i, int i2, @NonNull Intent intent) {
    }

    @MainThread
    @KeepForSdk
    /* renamed from: f */
    public void mo11894f(@Nullable Bundle bundle) {
    }

    @MainThread
    @KeepForSdk
    /* renamed from: g */
    public void mo11895g() {
    }

    @MainThread
    @KeepForSdk
    /* renamed from: h */
    public void mo11896h() {
    }

    @MainThread
    @KeepForSdk
    /* renamed from: i */
    public void mo11897i(@NonNull Bundle bundle) {
    }

    @MainThread
    @KeepForSdk
    /* renamed from: j */
    public void mo11898j() {
    }

    @MainThread
    @KeepForSdk
    /* renamed from: k */
    public void mo11899k() {
    }
}
