package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import com.google.android.gms.internal.common.C0999l;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.google.android.gms.common.api.internal.n3 */
public final class C0819n3 extends Fragment implements C0788i {

    /* renamed from: d */
    private static final WeakHashMap f713d = new WeakHashMap();

    /* renamed from: a */
    private final Map f714a = Collections.synchronizedMap(new ArrayMap());
    /* access modifiers changed from: private */

    /* renamed from: b */
    public int f715b = 0;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: c */
    public Bundle f716c;

    /* renamed from: d */
    public static C0819n3 m970d(Activity activity) {
        C0819n3 n3Var;
        WeakHashMap weakHashMap = f713d;
        WeakReference weakReference = (WeakReference) weakHashMap.get(activity);
        if (weakReference != null && (n3Var = (C0819n3) weakReference.get()) != null) {
            return n3Var;
        }
        try {
            C0819n3 n3Var2 = (C0819n3) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
            if (n3Var2 == null || n3Var2.isRemoving()) {
                n3Var2 = new C0819n3();
                activity.getFragmentManager().beginTransaction().add(n3Var2, "LifecycleFragmentImpl").commitAllowingStateLoss();
            }
            weakHashMap.put(activity, new WeakReference(n3Var2));
            return n3Var2;
        } catch (ClassCastException e) {
            throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e);
        }
    }

    /* renamed from: b */
    public final void mo11998b(String str, @NonNull LifecycleCallback lifecycleCallback) {
        if (!this.f714a.containsKey(str)) {
            this.f714a.put(str, lifecycleCallback);
            if (this.f715b > 0) {
                new C0999l(Looper.getMainLooper()).post(new C0814m3(this, lifecycleCallback, str));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("LifecycleCallback with tag " + str + " already added to this fragment.");
    }

    public final void dump(String str, @Nullable FileDescriptor fileDescriptor, PrintWriter printWriter, @Nullable String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback a : this.f714a.values()) {
            a.mo11891a(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Nullable
    /* renamed from: h */
    public final <T extends LifecycleCallback> T mo11999h(String str, Class<T> cls) {
        return (LifecycleCallback) cls.cast(this.f714a.get(str));
    }

    @Nullable
    /* renamed from: l */
    public final Activity mo12000l() {
        return getActivity();
    }

    public final void onActivityResult(int i, int i2, @Nullable Intent intent) {
        super.onActivityResult(i, i2, intent);
        for (LifecycleCallback e : this.f714a.values()) {
            e.mo11893e(i, i2, intent);
        }
    }

    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        this.f715b = 1;
        this.f716c = bundle;
        for (Map.Entry entry : this.f714a.entrySet()) {
            ((LifecycleCallback) entry.getValue()).mo11894f(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f715b = 5;
        for (LifecycleCallback g : this.f714a.values()) {
            g.mo11895g();
        }
    }

    public final void onResume() {
        super.onResume();
        this.f715b = 3;
        for (LifecycleCallback h : this.f714a.values()) {
            h.mo11896h();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle != null) {
            for (Map.Entry entry : this.f714a.entrySet()) {
                Bundle bundle2 = new Bundle();
                ((LifecycleCallback) entry.getValue()).mo11897i(bundle2);
                bundle.putBundle((String) entry.getKey(), bundle2);
            }
        }
    }

    public final void onStart() {
        super.onStart();
        this.f715b = 2;
        for (LifecycleCallback j : this.f714a.values()) {
            j.mo11898j();
        }
    }

    public final void onStop() {
        super.onStop();
        this.f715b = 4;
        for (LifecycleCallback k : this.f714a.values()) {
            k.mo11899k();
        }
    }
}
