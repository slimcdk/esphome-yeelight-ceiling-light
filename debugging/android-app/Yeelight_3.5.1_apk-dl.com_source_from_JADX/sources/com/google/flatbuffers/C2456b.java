package com.google.flatbuffers;

import java.nio.ByteBuffer;
import java.util.Comparator;

/* renamed from: com.google.flatbuffers.b */
final class C2456b implements Comparator<Integer> {

    /* renamed from: a */
    private final /* synthetic */ ByteBuffer f4161a;

    /* renamed from: b */
    private final /* synthetic */ Table f4162b;

    C2456b(Table table, ByteBuffer byteBuffer) {
        this.f4162b = table;
        this.f4161a = byteBuffer;
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        return this.f4162b.keysCompare((Integer) obj, (Integer) obj2, this.f4161a);
    }
}
