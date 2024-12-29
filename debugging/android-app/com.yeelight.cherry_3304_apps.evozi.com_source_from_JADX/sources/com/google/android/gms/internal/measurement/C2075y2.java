package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C2044w2;
import com.google.android.gms.internal.measurement.C2075y2;

/* renamed from: com.google.android.gms.internal.measurement.y2 */
public abstract class C2075y2<MessageType extends C2044w2<MessageType, BuilderType>, BuilderType extends C2075y2<MessageType, BuilderType>> implements C2047w5 {
    /* renamed from: G0 */
    public final /* synthetic */ C2047w5 mo12178G0(C2062x5 x5Var) {
        if (mo11841d().getClass().isInstance(x5Var)) {
            mo11854k((C2044w2) x5Var);
            return this;
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    /* renamed from: S */
    public final /* synthetic */ C2047w5 mo12179S(byte[] bArr, C2076y3 y3Var) {
        mo11856m(bArr, 0, bArr.length, y3Var);
        return this;
    }

    /* renamed from: a0 */
    public final /* synthetic */ C2047w5 mo12180a0(byte[] bArr) {
        mo11855l(bArr, 0, bArr.length);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public abstract BuilderType mo11854k(MessageType messagetype);

    /* renamed from: l */
    public abstract BuilderType mo11855l(byte[] bArr, int i, int i2);

    /* renamed from: m */
    public abstract BuilderType mo11856m(byte[] bArr, int i, int i2, C2076y3 y3Var);
}
