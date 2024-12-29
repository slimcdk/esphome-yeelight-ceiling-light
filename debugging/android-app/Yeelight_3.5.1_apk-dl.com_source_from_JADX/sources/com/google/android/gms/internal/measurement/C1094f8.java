package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.f8 */
final class C1094f8 implements C1159j9 {

    /* renamed from: a */
    private static final C1094f8 f1326a = new C1094f8();

    private C1094f8() {
    }

    /* renamed from: c */
    public static C1094f8 m1949c() {
        return f1326a;
    }

    /* renamed from: a */
    public final C1143i9 mo12583a(Class cls) {
        Class<C1174k8> cls2 = C1174k8.class;
        if (cls2.isAssignableFrom(cls)) {
            try {
                return (C1143i9) C1174k8.m2146m(cls.asSubclass(cls2)).mo12569w(3, (Object) null, (Object) null);
            } catch (Exception e) {
                throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
            }
        } else {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
    }

    /* renamed from: b */
    public final boolean mo12584b(Class cls) {
        return C1174k8.class.isAssignableFrom(cls);
    }
}
