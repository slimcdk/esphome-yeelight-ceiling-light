package com.google.android.gms.common.api.internal;

import android.content.Intent;
import android.os.Bundle;
import androidx.collection.ArrayMap;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;

public final class zzc extends Fragment implements C1441h {

    /* renamed from: d */
    private static WeakHashMap<FragmentActivity, WeakReference<zzc>> f2863d = new WeakHashMap<>();

    /* renamed from: a */
    private Map<String, LifecycleCallback> f2864a = new ArrayMap();

    /* renamed from: b */
    private int f2865b = 0;

    /* renamed from: c */
    private Bundle f2866c;

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback a : this.f2864a.values()) {
            a.mo10857a(str, fileDescriptor, printWriter, strArr);
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        for (LifecycleCallback c : this.f2864a.values()) {
            c.mo10858c(i, i2, intent);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f2865b = 1;
        this.f2866c = bundle;
        for (Map.Entry next : this.f2864a.entrySet()) {
            ((LifecycleCallback) next.getValue()).mo10859d(bundle != null ? bundle.getBundle((String) next.getKey()) : null);
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f2865b = 5;
        for (LifecycleCallback e : this.f2864a.values()) {
            e.mo10860e();
        }
    }

    public final void onResume() {
        super.onResume();
        this.f2865b = 3;
        for (LifecycleCallback f : this.f2864a.values()) {
            f.mo10861f();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle != null) {
            for (Map.Entry next : this.f2864a.entrySet()) {
                Bundle bundle2 = new Bundle();
                ((LifecycleCallback) next.getValue()).mo10862g(bundle2);
                bundle.putBundle((String) next.getKey(), bundle2);
            }
        }
    }

    public final void onStart() {
        super.onStart();
        this.f2865b = 2;
        for (LifecycleCallback h : this.f2864a.values()) {
            h.mo10863h();
        }
    }

    public final void onStop() {
        super.onStop();
        this.f2865b = 4;
        for (LifecycleCallback i : this.f2864a.values()) {
            i.mo10864i();
        }
    }
}
