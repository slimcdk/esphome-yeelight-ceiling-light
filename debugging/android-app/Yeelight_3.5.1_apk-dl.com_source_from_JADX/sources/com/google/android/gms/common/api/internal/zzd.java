package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.internal.common.C0999l;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;

public final class zzd extends Fragment implements C0788i {

    /* renamed from: d */
    private static final WeakHashMap f880d = new WeakHashMap();

    /* renamed from: a */
    private final Map f881a = Collections.synchronizedMap(new ArrayMap());
    /* access modifiers changed from: private */

    /* renamed from: b */
    public int f882b = 0;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: c */
    public Bundle f883c;

    /* renamed from: x */
    public static zzd m1203x(FragmentActivity fragmentActivity) {
        zzd zzd;
        WeakHashMap weakHashMap = f880d;
        WeakReference weakReference = (WeakReference) weakHashMap.get(fragmentActivity);
        if (weakReference != null && (zzd = (zzd) weakReference.get()) != null) {
            return zzd;
        }
        try {
            zzd zzd2 = (zzd) fragmentActivity.getSupportFragmentManager().findFragmentByTag("SupportLifecycleFragmentImpl");
            if (zzd2 == null || zzd2.isRemoving()) {
                zzd2 = new zzd();
                fragmentActivity.getSupportFragmentManager().beginTransaction().add((Fragment) zzd2, "SupportLifecycleFragmentImpl").commitAllowingStateLoss();
            }
            weakHashMap.put(fragmentActivity, new WeakReference(zzd2));
            return zzd2;
        } catch (ClassCastException e) {
            throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e);
        }
    }

    /* renamed from: b */
    public final void mo11998b(String str, @NonNull LifecycleCallback lifecycleCallback) {
        if (!this.f881a.containsKey(str)) {
            this.f881a.put(str, lifecycleCallback);
            if (this.f882b > 0) {
                new C0999l(Looper.getMainLooper()).post(new C0825o3(this, lifecycleCallback, str));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("LifecycleCallback with tag " + str + " already added to this fragment.");
    }

    public final void dump(String str, @Nullable FileDescriptor fileDescriptor, PrintWriter printWriter, @Nullable String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback a : this.f881a.values()) {
            a.mo11891a(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Nullable
    /* renamed from: h */
    public final <T extends LifecycleCallback> T mo11999h(String str, Class<T> cls) {
        return (LifecycleCallback) cls.cast(this.f881a.get(str));
    }

    @Nullable
    /* renamed from: l */
    public final /* synthetic */ Activity mo12000l() {
        return getActivity();
    }

    public final void onActivityResult(int i, int i2, @Nullable Intent intent) {
        super.onActivityResult(i, i2, intent);
        for (LifecycleCallback e : this.f881a.values()) {
            e.mo11893e(i, i2, intent);
        }
    }

    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        this.f882b = 1;
        this.f883c = bundle;
        for (Map.Entry entry : this.f881a.entrySet()) {
            ((LifecycleCallback) entry.getValue()).mo11894f(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f882b = 5;
        for (LifecycleCallback g : this.f881a.values()) {
            g.mo11895g();
        }
    }

    public final void onResume() {
        super.onResume();
        this.f882b = 3;
        for (LifecycleCallback h : this.f881a.values()) {
            h.mo11896h();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle != null) {
            for (Map.Entry entry : this.f881a.entrySet()) {
                Bundle bundle2 = new Bundle();
                ((LifecycleCallback) entry.getValue()).mo11897i(bundle2);
                bundle.putBundle((String) entry.getKey(), bundle2);
            }
        }
    }

    public final void onStart() {
        super.onStart();
        this.f882b = 2;
        for (LifecycleCallback j : this.f881a.values()) {
            j.mo11898j();
        }
    }

    public final void onStop() {
        super.onStop();
        this.f882b = 4;
        for (LifecycleCallback k : this.f881a.values()) {
            k.mo11899k();
        }
    }
}
