package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.google.android.gms.internal.measurement.m2 */
final class C1887m2<T> implements C1854k2<T>, Serializable {

    /* renamed from: a */
    private final C1854k2<T> f3561a;

    /* renamed from: b */
    private volatile transient boolean f3562b;
    @NullableDecl

    /* renamed from: c */
    private transient T f3563c;

    C1887m2(C1854k2<T> k2Var) {
        C1824i2.m5242a(k2Var);
        this.f3561a = k2Var;
    }

    /* renamed from: C */
    public final T mo11429C() {
        if (!this.f3562b) {
            synchronized (this) {
                if (!this.f3562b) {
                    T C = this.f3561a.mo11429C();
                    this.f3563c = C;
                    this.f3562b = true;
                    return C;
                }
            }
        }
        return this.f3563c;
    }

    public final String toString() {
        Object obj;
        if (this.f3562b) {
            String valueOf = String.valueOf(this.f3563c);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
            sb.append("<supplier that returned ");
            sb.append(valueOf);
            sb.append(">");
            obj = sb.toString();
        } else {
            obj = this.f3561a;
        }
        String valueOf2 = String.valueOf(obj);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 19);
        sb2.append("Suppliers.memoize(");
        sb2.append(valueOf2);
        sb2.append(")");
        return sb2.toString();
    }
}
