package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.g4 */
public enum C1795g4 {
    DOUBLE(0, C1826i4.SCALAR, C2078y4.DOUBLE),
    FLOAT(1, C1826i4.SCALAR, C2078y4.FLOAT),
    INT64(2, C1826i4.SCALAR, C2078y4.LONG),
    UINT64(3, C1826i4.SCALAR, C2078y4.LONG),
    INT32(4, C1826i4.SCALAR, C2078y4.INT),
    FIXED64(5, C1826i4.SCALAR, C2078y4.LONG),
    FIXED32(6, C1826i4.SCALAR, C2078y4.INT),
    BOOL(7, C1826i4.SCALAR, C2078y4.BOOLEAN),
    STRING(8, C1826i4.SCALAR, C2078y4.STRING),
    MESSAGE(9, C1826i4.SCALAR, C2078y4.MESSAGE),
    BYTES(10, C1826i4.SCALAR, C2078y4.BYTE_STRING),
    UINT32(11, C1826i4.SCALAR, C2078y4.INT),
    ENUM(12, C1826i4.SCALAR, C2078y4.ENUM),
    SFIXED32(13, C1826i4.SCALAR, C2078y4.INT),
    SFIXED64(14, C1826i4.SCALAR, C2078y4.LONG),
    SINT32(15, C1826i4.SCALAR, C2078y4.INT),
    SINT64(16, C1826i4.SCALAR, C2078y4.LONG),
    GROUP(17, C1826i4.SCALAR, C2078y4.MESSAGE),
    DOUBLE_LIST(18, C1826i4.VECTOR, C2078y4.DOUBLE),
    FLOAT_LIST(19, C1826i4.VECTOR, C2078y4.FLOAT),
    INT64_LIST(20, C1826i4.VECTOR, C2078y4.LONG),
    UINT64_LIST(21, C1826i4.VECTOR, C2078y4.LONG),
    INT32_LIST(22, C1826i4.VECTOR, C2078y4.INT),
    FIXED64_LIST(23, C1826i4.VECTOR, C2078y4.LONG),
    FIXED32_LIST(24, C1826i4.VECTOR, C2078y4.INT),
    BOOL_LIST(25, C1826i4.VECTOR, C2078y4.BOOLEAN),
    STRING_LIST(26, C1826i4.VECTOR, C2078y4.STRING),
    MESSAGE_LIST(27, C1826i4.VECTOR, C2078y4.MESSAGE),
    BYTES_LIST(28, C1826i4.VECTOR, C2078y4.BYTE_STRING),
    UINT32_LIST(29, C1826i4.VECTOR, C2078y4.INT),
    ENUM_LIST(30, C1826i4.VECTOR, C2078y4.ENUM),
    SFIXED32_LIST(31, C1826i4.VECTOR, C2078y4.INT),
    SFIXED64_LIST(32, C1826i4.VECTOR, C2078y4.LONG),
    SINT32_LIST(33, C1826i4.VECTOR, C2078y4.INT),
    SINT64_LIST(34, C1826i4.VECTOR, C2078y4.LONG),
    DOUBLE_LIST_PACKED(35, C1826i4.PACKED_VECTOR, C2078y4.DOUBLE),
    FLOAT_LIST_PACKED(36, C1826i4.PACKED_VECTOR, C2078y4.FLOAT),
    INT64_LIST_PACKED(37, C1826i4.PACKED_VECTOR, C2078y4.LONG),
    UINT64_LIST_PACKED(38, C1826i4.PACKED_VECTOR, C2078y4.LONG),
    INT32_LIST_PACKED(39, C1826i4.PACKED_VECTOR, C2078y4.INT),
    FIXED64_LIST_PACKED(40, C1826i4.PACKED_VECTOR, C2078y4.LONG),
    FIXED32_LIST_PACKED(41, C1826i4.PACKED_VECTOR, C2078y4.INT),
    BOOL_LIST_PACKED(42, C1826i4.PACKED_VECTOR, C2078y4.BOOLEAN),
    UINT32_LIST_PACKED(43, C1826i4.PACKED_VECTOR, C2078y4.INT),
    ENUM_LIST_PACKED(44, C1826i4.PACKED_VECTOR, C2078y4.ENUM),
    SFIXED32_LIST_PACKED(45, C1826i4.PACKED_VECTOR, C2078y4.INT),
    SFIXED64_LIST_PACKED(46, C1826i4.PACKED_VECTOR, C2078y4.LONG),
    SINT32_LIST_PACKED(47, C1826i4.PACKED_VECTOR, C2078y4.INT),
    SINT64_LIST_PACKED(48, C1826i4.PACKED_VECTOR, C2078y4.LONG),
    GROUP_LIST(49, C1826i4.VECTOR, C2078y4.MESSAGE),
    MAP(50, C1826i4.MAP, C2078y4.VOID);
    

    /* renamed from: e0 */
    private static final C1795g4[] f3402e0 = null;

    /* renamed from: a */
    private final int f3425a;

    static {
        int i;
        C1795g4[] values = values();
        f3402e0 = new C1795g4[values.length];
        for (C1795g4 g4Var : values) {
            f3402e0[g4Var.f3425a] = g4Var;
        }
    }

    private C1795g4(int i, C1826i4 i4Var, C2078y4 y4Var) {
        int i2;
        this.f3425a = i;
        int i3 = C1842j4.f3499a[i4Var.ordinal()];
        if (i3 == 1 || i3 == 2) {
            y4Var.mo12326a();
        }
        if (i4Var == C1826i4.SCALAR && (i2 = C1842j4.f3500b[y4Var.ordinal()]) != 1 && i2 != 2) {
        }
    }

    /* renamed from: C */
    public final int mo11680C() {
        return this.f3425a;
    }
}