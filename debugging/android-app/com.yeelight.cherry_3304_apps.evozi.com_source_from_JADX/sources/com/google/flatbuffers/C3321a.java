package com.google.flatbuffers;

import java.nio.charset.Charset;

/* renamed from: com.google.flatbuffers.a */
final class C3321a extends ThreadLocal<Charset> {
    C3321a() {
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object initialValue() {
        return Charset.forName("UTF-8");
    }
}
