package com.google.flatbuffers;

import java.nio.ByteBuffer;
import java.util.Comparator;

/* renamed from: com.google.flatbuffers.b */
final class C3322b implements Comparator<Integer> {

    /* renamed from: a */
    private final /* synthetic */ ByteBuffer f6425a;

    /* renamed from: b */
    private final /* synthetic */ Table f6426b;

    C3322b(Table table, ByteBuffer byteBuffer) {
        this.f6426b = table;
        this.f6425a = byteBuffer;
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        return this.f6426b.keysCompare((Integer) obj, (Integer) obj2, this.f6425a);
    }
}
