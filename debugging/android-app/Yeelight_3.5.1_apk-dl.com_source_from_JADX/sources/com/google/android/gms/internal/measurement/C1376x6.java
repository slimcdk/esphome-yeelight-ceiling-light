package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C1376x6;
import com.google.android.gms.internal.measurement.C1391y6;

/* renamed from: com.google.android.gms.internal.measurement.x6 */
public abstract class C1376x6<MessageType extends C1391y6<MessageType, BuilderType>, BuilderType extends C1376x6<MessageType, BuilderType>> implements C1175k9 {
    /* renamed from: B */
    public final /* synthetic */ C1175k9 mo12918B(byte[] bArr) {
        return mo12833h(bArr, 0, bArr.length);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract C1376x6 mo12832g(C1391y6 y6Var);

    /* renamed from: h */
    public abstract C1376x6 mo12833h(byte[] bArr, int i, int i2);

    /* renamed from: i */
    public abstract C1376x6 mo12834i(byte[] bArr, int i, int i2, C1377x7 x7Var);

    /* renamed from: n */
    public final /* bridge */ /* synthetic */ C1175k9 mo12919n(C1191l9 l9Var) {
        if (mo12830a().getClass().isInstance(l9Var)) {
            return mo12832g((C1391y6) l9Var);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    /* renamed from: z0 */
    public final /* synthetic */ C1175k9 mo12920z0(byte[] bArr, C1377x7 x7Var) {
        return mo12834i(bArr, 0, bArr.length, x7Var);
    }
}
