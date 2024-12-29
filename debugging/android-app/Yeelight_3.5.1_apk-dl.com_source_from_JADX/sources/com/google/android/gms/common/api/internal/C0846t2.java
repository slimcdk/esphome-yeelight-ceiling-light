package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.C1872a;

/* renamed from: com.google.android.gms.common.api.internal.t2 */
public final class C0846t2 extends C0832q1 {

    /* renamed from: b */
    private final C0838s f785b;

    /* renamed from: c */
    private final C1872a f786c;

    /* renamed from: d */
    private final C0834r f787d;

    public C0846t2(int i, C0838s sVar, C1872a aVar, C0834r rVar) {
        super(i);
        this.f786c = aVar;
        this.f785b = sVar;
        this.f787d = rVar;
        if (i == 2 && sVar.mo12072c()) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    /* renamed from: a */
    public final void mo12035a(@NonNull Status status) {
        this.f786c.mo14739d(this.f787d.mo11900a(status));
    }

    /* renamed from: b */
    public final void mo12036b(@NonNull Exception exc) {
        this.f786c.mo14739d(exc);
    }

    /* renamed from: c */
    public final void mo12037c(C0785h1 h1Var) {
        try {
            this.f785b.mo12017b(h1Var.mo11994v(), this.f786c);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            mo12035a(C0854v2.m1136e(e2));
        } catch (RuntimeException e3) {
            this.f786c.mo14739d(e3);
        }
    }

    /* renamed from: d */
    public final void mo12071d(@NonNull C0859x xVar, boolean z) {
        xVar.mo12089d(this.f786c, z);
    }

    /* renamed from: f */
    public final boolean mo12060f(C0785h1 h1Var) {
        return this.f785b.mo12072c();
    }

    @Nullable
    /* renamed from: g */
    public final Feature[] mo12061g(C0785h1 h1Var) {
        return this.f785b.mo12074e();
    }
}
