package com.squareup.haha.perflib.p147io;

import java.nio.ByteOrder;

/* renamed from: com.squareup.haha.perflib.io.HprofBuffer */
public interface HprofBuffer {
    public static final ByteOrder HPROF_BYTE_ORDER = ByteOrder.BIG_ENDIAN;

    boolean hasRemaining();

    long position();

    void read(byte[] bArr);

    byte readByte();

    char readChar();

    double readDouble();

    float readFloat();

    int readInt();

    long readLong();

    short readShort();

    void readSubSequence(byte[] bArr, int i, int i2);

    long remaining();

    void setPosition(long j);
}
