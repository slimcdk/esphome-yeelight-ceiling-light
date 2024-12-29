package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.u2 */
final class C2012u2 extends C1951q2 {

    /* renamed from: a */
    private final C1997t2 f3739a = new C1997t2();

    C2012u2() {
    }

    /* renamed from: a */
    public final void mo11952a(Throwable th, Throwable th2) {
        if (th2 == th) {
            throw new IllegalArgumentException("Self suppression is not allowed.", th2);
        } else if (th2 != null) {
            this.f3739a.mo12090a(th, true).add(th2);
        } else {
            throw new NullPointerException("The suppressed exception cannot be null.");
        }
    }
}
