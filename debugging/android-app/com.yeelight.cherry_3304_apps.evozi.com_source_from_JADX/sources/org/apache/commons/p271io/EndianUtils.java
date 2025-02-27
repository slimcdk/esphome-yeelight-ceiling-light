package org.apache.commons.p271io;

import com.google.p107ar.schemas.sceneform.ParameterInitDefType;
import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: org.apache.commons.io.EndianUtils */
public class EndianUtils {
    private static int read(InputStream inputStream) {
        int read = inputStream.read();
        if (-1 != read) {
            return read;
        }
        throw new EOFException("Unexpected EOF reached");
    }

    public static double readSwappedDouble(InputStream inputStream) {
        return Double.longBitsToDouble(readSwappedLong(inputStream));
    }

    public static double readSwappedDouble(byte[] bArr, int i) {
        return Double.longBitsToDouble(readSwappedLong(bArr, i));
    }

    public static float readSwappedFloat(InputStream inputStream) {
        return Float.intBitsToFloat(readSwappedInteger(inputStream));
    }

    public static float readSwappedFloat(byte[] bArr, int i) {
        return Float.intBitsToFloat(readSwappedInteger(bArr, i));
    }

    public static int readSwappedInteger(InputStream inputStream) {
        return ((read(inputStream) & 255) << 0) + ((read(inputStream) & 255) << 8) + ((read(inputStream) & 255) << 16) + ((read(inputStream) & 255) << 24);
    }

    public static int readSwappedInteger(byte[] bArr, int i) {
        return ((bArr[i + 0] & 255) << 0) + ((bArr[i + 1] & 255) << 8) + ((bArr[i + 2] & 255) << ParameterInitDefType.ExternalSamplerInit) + ((bArr[i + 3] & 255) << 24);
    }

    public static long readSwappedLong(InputStream inputStream) {
        byte[] bArr = new byte[8];
        for (int i = 0; i < 8; i++) {
            bArr[i] = (byte) read(inputStream);
        }
        return readSwappedLong(bArr, 0);
    }

    public static long readSwappedLong(byte[] bArr, int i) {
        return (((long) (((((bArr[i + 4] & 255) << 0) + ((bArr[i + 5] & 255) << 8)) + ((bArr[i + 6] & 255) << ParameterInitDefType.ExternalSamplerInit)) + ((bArr[i + 7] & 255) << 24))) << 32) + (((long) (((bArr[i + 0] & 255) << 0) + ((bArr[i + 1] & 255) << 8) + ((bArr[i + 2] & 255) << ParameterInitDefType.ExternalSamplerInit) + ((bArr[i + 3] & 255) << 24))) & 4294967295L);
    }

    public static short readSwappedShort(InputStream inputStream) {
        return (short) (((read(inputStream) & 255) << 0) + ((read(inputStream) & 255) << 8));
    }

    public static short readSwappedShort(byte[] bArr, int i) {
        return (short) (((bArr[i + 0] & 255) << 0) + ((bArr[i + 1] & 255) << 8));
    }

    public static long readSwappedUnsignedInteger(InputStream inputStream) {
        return (((long) (read(inputStream) & 255)) << 24) + (((long) (((read(inputStream) & 255) << 0) + ((read(inputStream) & 255) << 8) + ((read(inputStream) & 255) << 16))) & 4294967295L);
    }

    public static long readSwappedUnsignedInteger(byte[] bArr, int i) {
        return (((long) (bArr[i + 3] & 255)) << 24) + (((long) (((bArr[i + 0] & 255) << 0) + ((bArr[i + 1] & 255) << 8) + ((bArr[i + 2] & 255) << ParameterInitDefType.ExternalSamplerInit))) & 4294967295L);
    }

    public static int readSwappedUnsignedShort(InputStream inputStream) {
        return ((read(inputStream) & 255) << 0) + ((read(inputStream) & 255) << 8);
    }

    public static int readSwappedUnsignedShort(byte[] bArr, int i) {
        return ((bArr[i + 0] & 255) << 0) + ((bArr[i + 1] & 255) << 8);
    }

    public static double swapDouble(double d) {
        return Double.longBitsToDouble(swapLong(Double.doubleToLongBits(d)));
    }

    public static float swapFloat(float f) {
        return Float.intBitsToFloat(swapInteger(Float.floatToIntBits(f)));
    }

    public static int swapInteger(int i) {
        return (((i >> 0) & 255) << 24) + (((i >> 8) & 255) << 16) + (((i >> 16) & 255) << 8) + (((i >> 24) & 255) << 0);
    }

    public static long swapLong(long j) {
        return (((j >> 0) & 255) << 56) + (((j >> 8) & 255) << 48) + (((j >> 16) & 255) << 40) + (((j >> 24) & 255) << 32) + (((j >> 32) & 255) << 24) + (((j >> 40) & 255) << 16) + (((j >> 48) & 255) << 8) + (((j >> 56) & 255) << 0);
    }

    public static short swapShort(short s) {
        return (short) ((((s >> 0) & 255) << 8) + (((s >> 8) & 255) << 0));
    }

    public static void writeSwappedDouble(OutputStream outputStream, double d) {
        writeSwappedLong(outputStream, Double.doubleToLongBits(d));
    }

    public static void writeSwappedDouble(byte[] bArr, int i, double d) {
        writeSwappedLong(bArr, i, Double.doubleToLongBits(d));
    }

    public static void writeSwappedFloat(OutputStream outputStream, float f) {
        writeSwappedInteger(outputStream, Float.floatToIntBits(f));
    }

    public static void writeSwappedFloat(byte[] bArr, int i, float f) {
        writeSwappedInteger(bArr, i, Float.floatToIntBits(f));
    }

    public static void writeSwappedInteger(OutputStream outputStream, int i) {
        outputStream.write((byte) ((i >> 0) & 255));
        outputStream.write((byte) ((i >> 8) & 255));
        outputStream.write((byte) ((i >> 16) & 255));
        outputStream.write((byte) ((i >> 24) & 255));
    }

    public static void writeSwappedInteger(byte[] bArr, int i, int i2) {
        bArr[i + 0] = (byte) ((i2 >> 0) & 255);
        bArr[i + 1] = (byte) ((i2 >> 8) & 255);
        bArr[i + 2] = (byte) ((i2 >> 16) & 255);
        bArr[i + 3] = (byte) ((i2 >> 24) & 255);
    }

    public static void writeSwappedLong(OutputStream outputStream, long j) {
        outputStream.write((byte) ((int) ((j >> 0) & 255)));
        outputStream.write((byte) ((int) ((j >> 8) & 255)));
        outputStream.write((byte) ((int) ((j >> 16) & 255)));
        outputStream.write((byte) ((int) ((j >> 24) & 255)));
        outputStream.write((byte) ((int) ((j >> 32) & 255)));
        outputStream.write((byte) ((int) ((j >> 40) & 255)));
        outputStream.write((byte) ((int) ((j >> 48) & 255)));
        outputStream.write((byte) ((int) ((j >> 56) & 255)));
    }

    public static void writeSwappedLong(byte[] bArr, int i, long j) {
        bArr[i + 0] = (byte) ((int) ((j >> 0) & 255));
        bArr[i + 1] = (byte) ((int) ((j >> 8) & 255));
        bArr[i + 2] = (byte) ((int) ((j >> 16) & 255));
        bArr[i + 3] = (byte) ((int) ((j >> 24) & 255));
        bArr[i + 4] = (byte) ((int) ((j >> 32) & 255));
        bArr[i + 5] = (byte) ((int) ((j >> 40) & 255));
        bArr[i + 6] = (byte) ((int) ((j >> 48) & 255));
        bArr[i + 7] = (byte) ((int) ((j >> 56) & 255));
    }

    public static void writeSwappedShort(OutputStream outputStream, short s) {
        outputStream.write((byte) ((s >> 0) & 255));
        outputStream.write((byte) ((s >> 8) & 255));
    }

    public static void writeSwappedShort(byte[] bArr, int i, short s) {
        bArr[i + 0] = (byte) ((s >> 0) & 255);
        bArr[i + 1] = (byte) ((s >> 8) & 255);
    }
}
