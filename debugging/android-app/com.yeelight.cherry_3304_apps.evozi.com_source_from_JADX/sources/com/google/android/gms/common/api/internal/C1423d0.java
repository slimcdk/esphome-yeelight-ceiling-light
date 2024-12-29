package com.google.android.gms.common.api.internal;

import androidx.annotation.WorkerThread;
import com.google.android.gms.common.api.C1382a;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.common.api.internal.d0 */
final class C1423d0 extends C1442h0 {

    /* renamed from: b */
    private final ArrayList<C1382a.C1390f> f2625b;

    /* renamed from: c */
    private final /* synthetic */ C1498x f2626c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1423d0(C1498x xVar, ArrayList<C1382a.C1390f> arrayList) {
        super(xVar, (C1501y) null);
        this.f2626c = xVar;
        this.f2625b = arrayList;
    }

    @WorkerThread
    /* renamed from: b */
    public final void mo10865b() {
        this.f2626c.f2829a.f2797n.f2722q = this.f2626c.m4061r();
        ArrayList<C1382a.C1390f> arrayList = this.f2625b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            C1382a.C1390f fVar = arrayList.get(i);
            i++;
            fVar.mo10792d(this.f2626c.f2843o, this.f2626c.f2829a.f2797n.f2722q);
        }
    }
}
