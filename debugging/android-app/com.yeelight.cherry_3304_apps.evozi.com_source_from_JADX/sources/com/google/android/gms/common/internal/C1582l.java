package com.google.android.gms.common.internal;

import android.content.Context;
import android.util.SparseIntArray;
import androidx.annotation.NonNull;
import com.google.android.gms.common.C1520d;
import com.google.android.gms.common.api.C1382a;

/* renamed from: com.google.android.gms.common.internal.l */
public class C1582l {

    /* renamed from: a */
    private final SparseIntArray f3061a = new SparseIntArray();

    /* renamed from: b */
    private C1520d f3062b;

    public C1582l(@NonNull C1520d dVar) {
        C1609u.m4475k(dVar);
        this.f3062b = dVar;
    }

    /* renamed from: a */
    public void mo11247a() {
        this.f3061a.clear();
    }

    /* renamed from: b */
    public int mo11248b(@NonNull Context context, @NonNull C1382a.C1390f fVar) {
        C1609u.m4475k(context);
        C1609u.m4475k(fVar);
        int i = 0;
        if (!fVar.mo10799m()) {
            return 0;
        }
        int n = fVar.mo10800n();
        int i2 = this.f3061a.get(n, -1);
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        while (true) {
            if (i3 >= this.f3061a.size()) {
                i = i2;
                break;
            }
            int keyAt = this.f3061a.keyAt(i3);
            if (keyAt > n && this.f3061a.get(keyAt) == 0) {
                break;
            }
            i3++;
        }
        if (i == -1) {
            i = this.f3062b.mo11045j(context, n);
        }
        this.f3061a.put(n, i);
        return i;
    }
}
