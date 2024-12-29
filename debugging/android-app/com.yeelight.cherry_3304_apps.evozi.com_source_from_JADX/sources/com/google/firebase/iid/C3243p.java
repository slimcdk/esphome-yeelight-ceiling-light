package com.google.firebase.iid;

import android.os.Bundle;
import android.util.Log;
import p011c.p012a.p019b.p028b.p038e.C0620i;

/* renamed from: com.google.firebase.iid.p */
abstract class C3243p<T> {

    /* renamed from: a */
    final int f6272a;

    /* renamed from: b */
    final C0620i<T> f6273b = new C0620i<>();

    /* renamed from: c */
    final int f6274c;

    /* renamed from: d */
    final Bundle f6275d;

    C3243p(int i, int i2, Bundle bundle) {
        this.f6272a = i;
        this.f6274c = i2;
        this.f6275d = bundle;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo17850a(Bundle bundle);

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo17851b(C3241o oVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(oVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14 + String.valueOf(valueOf2).length());
            sb.append("Failing ");
            sb.append(valueOf);
            sb.append(" with ");
            sb.append(valueOf2);
            sb.toString();
        }
        this.f6273b.mo8667b(oVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo17852c(T t) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(t);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 16 + String.valueOf(valueOf2).length());
            sb.append("Finishing ");
            sb.append(valueOf);
            sb.append(" with ");
            sb.append(valueOf2);
            sb.toString();
        }
        this.f6273b.mo8668c(t);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public abstract boolean mo17853d();

    public String toString() {
        int i = this.f6274c;
        int i2 = this.f6272a;
        boolean d = mo17853d();
        StringBuilder sb = new StringBuilder(55);
        sb.append("Request { what=");
        sb.append(i);
        sb.append(" id=");
        sb.append(i2);
        sb.append(" oneWay=");
        sb.append(d);
        sb.append("}");
        return sb.toString();
    }
}
