package com.google.android.gms.internal.measurement;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.google.android.gms.internal.measurement.p2 */
final class C1937p2<T> implements C1854k2<T> {

    /* renamed from: a */
    private volatile C1854k2<T> f3664a;

    /* renamed from: b */
    private volatile boolean f3665b;
    @NullableDecl

    /* renamed from: c */
    private T f3666c;

    C1937p2(C1854k2<T> k2Var) {
        C1824i2.m5242a(k2Var);
        this.f3664a = k2Var;
    }

    /* renamed from: C */
    public final T mo11429C() {
        if (!this.f3665b) {
            synchronized (this) {
                if (!this.f3665b) {
                    T C = this.f3664a.mo11429C();
                    this.f3666c = C;
                    this.f3665b = true;
                    this.f3664a = null;
                    return C;
                }
            }
        }
        return this.f3666c;
    }

    public final String toString() {
        Object obj = this.f3664a;
        if (obj == null) {
            String valueOf = String.valueOf(this.f3666c);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
            sb.append("<supplier that returned ");
            sb.append(valueOf);
            sb.append(">");
            obj = sb.toString();
        }
        String valueOf2 = String.valueOf(obj);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 19);
        sb2.append("Suppliers.memoize(");
        sb2.append(valueOf2);
        sb2.append(")");
        return sb2.toString();
    }
}
