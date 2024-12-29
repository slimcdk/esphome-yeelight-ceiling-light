package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.y4 */
public enum C2078y4 {
    VOID(Void.class, Void.class, (Class<?>) null),
    INT(Integer.TYPE, Integer.class, 0),
    LONG(Long.TYPE, Long.class, 0L),
    FLOAT(Float.TYPE, Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.TYPE, Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.TYPE, Boolean.class, Boolean.FALSE),
    STRING(String.class, String.class, ""),
    BYTE_STRING(C1779f3.class, C1779f3.class, C1779f3.f3341b),
    ENUM(Integer.TYPE, Integer.class, (Class<?>) null),
    MESSAGE(Object.class, Object.class, (Class<?>) null);
    

    /* renamed from: a */
    private final Class<?> f3841a;

    /* renamed from: b */
    private final Object f3842b;

    private C2078y4(Class<?> cls, Class<?> cls2, Object obj) {
        this.f3841a = cls2;
        this.f3842b = obj;
    }

    /* renamed from: a */
    public final Class<?> mo12326a() {
        return this.f3841a;
    }
}
