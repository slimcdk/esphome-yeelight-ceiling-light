package com.google.flatbuffers;

import java.nio.charset.Charset;

/* renamed from: com.google.flatbuffers.a */
final class C2455a extends ThreadLocal<Charset> {
    C2455a() {
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object initialValue() {
        return Charset.forName("UTF-8");
    }
}
