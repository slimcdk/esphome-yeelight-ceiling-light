package com.google.android.gms.common.api.internal;

import android.util.Log;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.google.android.gms.common.C0721a;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C0736d;
import com.google.android.gms.common.internal.C0917i;
import com.xiaomi.mipush.sdk.Constants;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: com.google.android.gms.common.api.internal.x2 */
public final class C0862x2 extends C0762c3 {

    /* renamed from: f */
    private final SparseArray f849f = new SparseArray();

    private C0862x2(C0788i iVar) {
        super(iVar, C0721a.m617p());
        this.f572a.mo11998b("AutoManageHelper", this);
    }

    /* renamed from: t */
    public static C0862x2 m1161t(C0783h hVar) {
        C0788i d = LifecycleCallback.m728d(hVar);
        C0862x2 x2Var = (C0862x2) d.mo11999h("AutoManageHelper", C0862x2.class);
        return x2Var != null ? x2Var : new C0862x2(d);
    }

    @Nullable
    /* renamed from: w */
    private final C0858w2 m1162w(int i) {
        if (this.f849f.size() <= i) {
            return null;
        }
        SparseArray sparseArray = this.f849f;
        return (C0858w2) sparseArray.get(sparseArray.keyAt(i));
    }

    /* renamed from: a */
    public final void mo11891a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        for (int i = 0; i < this.f849f.size(); i++) {
            C0858w2 w = m1162w(i);
            if (w != null) {
                printWriter.append(str).append("GoogleApiClient #").print(w.f839a);
                printWriter.println(Constants.COLON_SEPARATOR);
                w.f840b.mo11862f(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
            }
        }
    }

    /* renamed from: j */
    public final void mo11898j() {
        super.mo11898j();
        boolean z = this.f594b;
        String valueOf = String.valueOf(this.f849f);
        StringBuilder sb = new StringBuilder();
        sb.append("onStart ");
        sb.append(z);
        sb.append(" ");
        sb.append(valueOf);
        if (this.f595c.get() == null) {
            for (int i = 0; i < this.f849f.size(); i++) {
                C0858w2 w = m1162w(i);
                if (w != null) {
                    w.f840b.mo11860d();
                }
            }
        }
    }

    /* renamed from: k */
    public final void mo11899k() {
        super.mo11899k();
        for (int i = 0; i < this.f849f.size(); i++) {
            C0858w2 w = m1162w(i);
            if (w != null) {
                w.f840b.mo11861e();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final void mo11924m(ConnectionResult connectionResult, int i) {
        if (i < 0) {
            Log.wtf("AutoManageHelper", "AutoManageLifecycleHelper received onErrorResolutionFailed callback but no failing client ID is set", new Exception());
            return;
        }
        C0858w2 w2Var = (C0858w2) this.f849f.get(i);
        if (w2Var != null) {
            mo12095v(i);
            C0736d.C0739c cVar = w2Var.f841c;
            if (cVar != null) {
                cVar.mo11972e(connectionResult);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final void mo11925n() {
        for (int i = 0; i < this.f849f.size(); i++) {
            C0858w2 w = m1162w(i);
            if (w != null) {
                w.f840b.mo11860d();
            }
        }
    }

    /* renamed from: u */
    public final void mo12094u(int i, C0736d dVar, @Nullable C0736d.C0739c cVar) {
        C0917i.m1420k(dVar, "GoogleApiClient instance cannot be null");
        boolean z = this.f849f.indexOfKey(i) < 0;
        C0917i.m1424o(z, "Already managing a GoogleApiClient with id " + i);
        C0870z2 z2Var = (C0870z2) this.f595c.get();
        boolean z2 = this.f594b;
        String valueOf = String.valueOf(z2Var);
        StringBuilder sb = new StringBuilder();
        sb.append("starting AutoManage for client ");
        sb.append(i);
        sb.append(" ");
        sb.append(z2);
        sb.append(" ");
        sb.append(valueOf);
        C0858w2 w2Var = new C0858w2(this, i, dVar, cVar);
        dVar.mo11867k(w2Var);
        this.f849f.put(i, w2Var);
        if (this.f594b && z2Var == null) {
            "connecting ".concat(dVar.toString());
            dVar.mo11860d();
        }
    }

    /* renamed from: v */
    public final void mo12095v(int i) {
        C0858w2 w2Var = (C0858w2) this.f849f.get(i);
        this.f849f.remove(i);
        if (w2Var != null) {
            w2Var.f840b.mo11868l(w2Var);
            w2Var.f840b.mo11861e();
        }
    }
}
