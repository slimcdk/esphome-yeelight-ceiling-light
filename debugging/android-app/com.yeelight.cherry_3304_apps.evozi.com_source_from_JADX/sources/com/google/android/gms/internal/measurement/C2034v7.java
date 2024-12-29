package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.v7 */
public enum C2034v7 {
    DOUBLE(C2081y7.DOUBLE, 1),
    FLOAT(C2081y7.FLOAT, 5),
    INT64(C2081y7.LONG, 0),
    UINT64(C2081y7.LONG, 0),
    INT32(C2081y7.INT, 0),
    FIXED64(C2081y7.LONG, 1),
    FIXED32(C2081y7.INT, 5),
    BOOL(C2081y7.BOOLEAN, 0),
    STRING(C2081y7.STRING, 2),
    GROUP(C2081y7.MESSAGE, 3),
    MESSAGE(C2081y7.MESSAGE, 2),
    BYTES(C2081y7.BYTE_STRING, 2),
    UINT32(C2081y7.INT, 0),
    ENUM(C2081y7.ENUM, 0),
    SFIXED32(C2081y7.INT, 5),
    SFIXED64(C2081y7.LONG, 1),
    SINT32(C2081y7.INT, 0),
    SINT64(C2081y7.LONG, 0);
    

    /* renamed from: a */
    private final C2081y7 f3788a;

    /* renamed from: b */
    private final int f3789b;

    private C2034v7(C2081y7 y7Var, int i) {
        this.f3788a = y7Var;
        this.f3789b = i;
    }

    /* renamed from: a */
    public final C2081y7 mo12160a() {
        return this.f3788a;
    }

    /* renamed from: b */
    public final int mo12161b() {
        return this.f3789b;
    }
}
