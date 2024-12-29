package com.google.p107ar.schemas.sceneform;

import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.google.ar.schemas.sceneform.CompiledMaterialDef */
public final class CompiledMaterialDef extends Table {
    public static void addCompiledMaterial(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addOffset(0, i, 0);
    }

    public static void addCompressedMaterial(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addOffset(3, i, 0);
    }

    public static void addDecl(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addOffset(2, i, 0);
    }

    public static void addSha1sum(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addOffset(1, i, 0);
    }

    public static int createCompiledMaterialDef(FlatBufferBuilder flatBufferBuilder, int i, int i2, int i3, int i4) {
        flatBufferBuilder.startObject(4);
        addCompressedMaterial(flatBufferBuilder, i4);
        addDecl(flatBufferBuilder, i3);
        addSha1sum(flatBufferBuilder, i2);
        addCompiledMaterial(flatBufferBuilder, i);
        return endCompiledMaterialDef(flatBufferBuilder);
    }

    public static int createCompiledMaterialVector(FlatBufferBuilder flatBufferBuilder, byte[] bArr) {
        flatBufferBuilder.startVector(1, bArr.length, 1);
        for (int length = bArr.length - 1; length >= 0; length--) {
            flatBufferBuilder.addByte(bArr[length]);
        }
        return flatBufferBuilder.endVector();
    }

    public static int endCompiledMaterialDef(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endObject();
    }

    public static CompiledMaterialDef getRootAsCompiledMaterialDef(ByteBuffer byteBuffer) {
        return getRootAsCompiledMaterialDef(byteBuffer, new CompiledMaterialDef());
    }

    public static CompiledMaterialDef getRootAsCompiledMaterialDef(ByteBuffer byteBuffer, CompiledMaterialDef compiledMaterialDef) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return compiledMaterialDef.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static void startCompiledMaterialDef(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startObject(4);
    }

    public static void startCompiledMaterialVector(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.startVector(1, i, 1);
    }

    public final CompiledMaterialDef __assign(int i, ByteBuffer byteBuffer) {
        __init(i, byteBuffer);
        return this;
    }

    public final void __init(int i, ByteBuffer byteBuffer) {
        this.bb_pos = i;
        this.f6424bb = byteBuffer;
        int i2 = i - byteBuffer.getInt(i);
        this.vtable_start = i2;
        this.vtable_size = this.f6424bb.getShort(i2);
    }

    public final int compiledMaterial(int i) {
        int __offset = __offset(4);
        if (__offset != 0) {
            return this.f6424bb.get(__vector(__offset) + i) & 255;
        }
        return 0;
    }

    public final ByteBuffer compiledMaterialAsByteBuffer() {
        return __vector_as_bytebuffer(4, 1);
    }

    public final ByteBuffer compiledMaterialInByteBuffer(ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 4, 1);
    }

    public final int compiledMaterialLength() {
        int __offset = __offset(4);
        if (__offset != 0) {
            return __vector_len(__offset);
        }
        return 0;
    }

    public final String compressedMaterial() {
        int __offset = __offset(10);
        if (__offset != 0) {
            return __string(__offset + this.bb_pos);
        }
        return null;
    }

    public final ByteBuffer compressedMaterialAsByteBuffer() {
        return __vector_as_bytebuffer(10, 1);
    }

    public final ByteBuffer compressedMaterialInByteBuffer(ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 10, 1);
    }

    public final CompiledMaterialDeclDef decl() {
        return decl(new CompiledMaterialDeclDef());
    }

    public final CompiledMaterialDeclDef decl(CompiledMaterialDeclDef compiledMaterialDeclDef) {
        int __offset = __offset(8);
        if (__offset != 0) {
            return compiledMaterialDeclDef.__assign(__indirect(__offset + this.bb_pos), this.f6424bb);
        }
        return null;
    }

    public final String sha1sum() {
        int __offset = __offset(6);
        if (__offset != 0) {
            return __string(__offset + this.bb_pos);
        }
        return null;
    }

    public final ByteBuffer sha1sumAsByteBuffer() {
        return __vector_as_bytebuffer(6, 1);
    }

    public final ByteBuffer sha1sumInByteBuffer(ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 6, 1);
    }
}
