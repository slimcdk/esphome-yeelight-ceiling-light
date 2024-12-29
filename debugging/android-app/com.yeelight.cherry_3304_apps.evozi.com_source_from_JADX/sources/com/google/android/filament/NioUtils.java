package com.google.android.filament;

import androidx.annotation.NonNull;
import com.google.android.filament.proguard.UsedByNative;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;

@UsedByNative("NioUtils.cpp")
final class NioUtils {

    enum BufferType {
        BYTE,
        CHAR,
        SHORT,
        INT,
        LONG,
        FLOAT,
        DOUBLE
    }

    private NioUtils() {
    }

    @UsedByNative("NioUtils.cpp")
    static Object getBaseArray(@NonNull Buffer buffer) {
        if (buffer.hasArray()) {
            return buffer.array();
        }
        return null;
    }

    @UsedByNative("NioUtils.cpp")
    static int getBaseArrayOffset(@NonNull Buffer buffer, int i) {
        if (buffer.hasArray()) {
            return (buffer.arrayOffset() + buffer.position()) << i;
        }
        return 0;
    }

    @UsedByNative("NioUtils.cpp")
    static long getBasePointer(@NonNull Buffer buffer, long j, int i) {
        if (j != 0) {
            return ((long) (buffer.position() << i)) + j;
        }
        return 0;
    }

    @UsedByNative("NioUtils.cpp")
    static int getBufferType(@NonNull Buffer buffer) {
        return (buffer instanceof ByteBuffer ? BufferType.BYTE : buffer instanceof CharBuffer ? BufferType.CHAR : buffer instanceof ShortBuffer ? BufferType.SHORT : buffer instanceof IntBuffer ? BufferType.INT : buffer instanceof LongBuffer ? BufferType.LONG : buffer instanceof FloatBuffer ? BufferType.FLOAT : BufferType.DOUBLE).ordinal();
    }
}
