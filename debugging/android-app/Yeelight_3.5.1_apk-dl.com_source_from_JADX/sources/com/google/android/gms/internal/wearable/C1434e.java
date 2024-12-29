package com.google.android.gms.internal.wearable;

import com.google.android.gms.internal.wearable.C1434e;
import com.google.android.gms.internal.wearable.C1439f;

/* renamed from: com.google.android.gms.internal.wearable.e */
public abstract class C1434e<MessageType extends C1439f<MessageType, BuilderType>, BuilderType extends C1434e<MessageType, BuilderType>> implements C1481n1 {
    /* renamed from: A */
    public final /* bridge */ /* synthetic */ C1481n1 mo13600A(C1486o1 o1Var) {
        if (mo13680a().getClass().isInstance(o1Var)) {
            return mo13601f((C1439f) o1Var);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract BuilderType mo13601f(MessageType messagetype);
}
