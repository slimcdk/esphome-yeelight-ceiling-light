package com.google.flatbuffers;

import com.google.flatbuffers.Utf8;
import java.nio.ByteBuffer;

public final class Utf8Safe extends Utf8 {

    /* renamed from: com.google.flatbuffers.Utf8Safe$a */
    static class C2454a extends IllegalArgumentException {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        C2454a(int r3, int r4) {
            /*
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r1 = 54
                r0.<init>(r1)
                java.lang.String r1 = "Unpaired surrogate at index "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r3 = " of "
                r0.append(r3)
                r0.append(r4)
                java.lang.String r3 = r0.toString()
                r2.<init>(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.flatbuffers.Utf8Safe.C2454a.<init>(int, int):void");
        }
    }

    private static int computeEncodedLength(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        while (i < length && charSequence.charAt(i) < 128) {
            i++;
        }
        int i2 = length;
        while (true) {
            if (i < length) {
                char charAt = charSequence.charAt(i);
                if (charAt >= 2048) {
                    i2 += encodedLengthGeneral(charSequence, i);
                    break;
                }
                i2 += (127 - charAt) >>> 31;
                i++;
            } else {
                break;
            }
        }
        if (i2 >= length) {
            return i2;
        }
        StringBuilder sb = new StringBuilder(54);
        sb.append("UTF-8 length does not fit in int: ");
        sb.append(((long) i2) + 4294967296L);
        throw new IllegalArgumentException(sb.toString());
    }

    private static String decodeUtf8Array(byte[] bArr, int i, int i2) {
        if ((i | i2 | ((bArr.length - i) - i2)) >= 0) {
            int i3 = i + i2;
            char[] cArr = new char[i2];
            int i4 = 0;
            while (r12 < i3) {
                byte b = bArr[r12];
                if (!Utf8.C2453a.m6649d(b)) {
                    break;
                }
                i = r12 + 1;
                cArr[i4] = (char) b;
                i4++;
            }
            int i5 = i4;
            while (r12 < i3) {
                int i6 = r12 + 1;
                byte b2 = bArr[r12];
                if (Utf8.C2453a.m6649d(b2)) {
                    int i7 = i5 + 1;
                    cArr[i5] = (char) b2;
                    while (i6 < i3) {
                        byte b3 = bArr[i6];
                        if (!Utf8.C2453a.m6649d(b3)) {
                            break;
                        }
                        i6++;
                        cArr[i7] = (char) b3;
                        i7++;
                    }
                    r12 = i6;
                    i5 = i7;
                } else if (Utf8.C2453a.m6650e(b2)) {
                    if (i6 < i3) {
                        Utf8.C2453a.m6648c(b2, bArr[i6], cArr, i5);
                        r12 = i6 + 1;
                        i5++;
                    } else {
                        throw new IllegalArgumentException("Invalid UTF-8");
                    }
                } else if (Utf8.C2453a.m6651f(b2)) {
                    if (i6 < i3 - 1) {
                        int i8 = i6 + 1;
                        Utf8.C2453a.m6647b(b2, bArr[i6], bArr[i8], cArr, i5);
                        r12 = i8 + 1;
                        i5++;
                    } else {
                        throw new IllegalArgumentException("Invalid UTF-8");
                    }
                } else if (i6 < i3 - 2) {
                    int i9 = i6 + 1;
                    byte b4 = bArr[i6];
                    int i10 = i9 + 1;
                    Utf8.C2453a.m6646a(b2, b4, bArr[i9], bArr[i10], cArr, i5);
                    r12 = i10 + 1;
                    i5 = i5 + 1 + 1;
                } else {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
            }
            return new String(cArr, 0, i5);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)}));
    }

    private static String decodeUtf8Buffer(ByteBuffer byteBuffer, int i, int i2) {
        if ((i | i2 | ((byteBuffer.limit() - i) - i2)) >= 0) {
            int i3 = i + i2;
            char[] cArr = new char[i2];
            int i4 = 0;
            while (r12 < i3) {
                byte b = byteBuffer.get(r12);
                if (!Utf8.C2453a.m6649d(b)) {
                    break;
                }
                i = r12 + 1;
                cArr[i4] = (char) b;
                i4++;
            }
            int i5 = i4;
            while (r12 < i3) {
                int i6 = r12 + 1;
                byte b2 = byteBuffer.get(r12);
                if (Utf8.C2453a.m6649d(b2)) {
                    int i7 = i5 + 1;
                    cArr[i5] = (char) b2;
                    while (i6 < i3) {
                        byte b3 = byteBuffer.get(i6);
                        if (!Utf8.C2453a.m6649d(b3)) {
                            break;
                        }
                        i6++;
                        cArr[i7] = (char) b3;
                        i7++;
                    }
                    r12 = i6;
                    i5 = i7;
                } else if (Utf8.C2453a.m6650e(b2)) {
                    if (i6 < i3) {
                        Utf8.C2453a.m6648c(b2, byteBuffer.get(i6), cArr, i5);
                        r12 = i6 + 1;
                        i5++;
                    } else {
                        throw new IllegalArgumentException("Invalid UTF-8");
                    }
                } else if (Utf8.C2453a.m6651f(b2)) {
                    if (i6 < i3 - 1) {
                        int i8 = i6 + 1;
                        Utf8.C2453a.m6647b(b2, byteBuffer.get(i6), byteBuffer.get(i8), cArr, i5);
                        r12 = i8 + 1;
                        i5++;
                    } else {
                        throw new IllegalArgumentException("Invalid UTF-8");
                    }
                } else if (i6 < i3 - 2) {
                    int i9 = i6 + 1;
                    byte b4 = byteBuffer.get(i6);
                    int i10 = i9 + 1;
                    Utf8.C2453a.m6646a(b2, b4, byteBuffer.get(i9), byteBuffer.get(i10), cArr, i5);
                    r12 = i10 + 1;
                    i5 = i5 + 1 + 1;
                } else {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
            }
            return new String(cArr, 0, i5);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", new Object[]{Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)}));
    }

    private static int encodeUtf8Array(CharSequence charSequence, byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        int i5;
        char charAt;
        int length = charSequence.length();
        int i6 = i2 + i;
        int i7 = 0;
        while (i7 < length && (i5 = i7 + i) < i6 && (charAt = charSequence.charAt(i7)) < 128) {
            bArr[i5] = (byte) charAt;
            i7++;
        }
        if (i7 == length) {
            return i + length;
        }
        int i8 = i + i7;
        while (i7 < length) {
            char charAt2 = charSequence.charAt(i7);
            if (charAt2 < 128 && i8 < i6) {
                i4 = i8 + 1;
                bArr[i8] = (byte) charAt2;
            } else if (charAt2 < 2048 && i8 <= i6 - 2) {
                int i9 = i8 + 1;
                bArr[i8] = (byte) ((charAt2 >>> 6) | 960);
                i8 = i9 + 1;
                bArr[i9] = (byte) ((charAt2 & '?') | 128);
                i7++;
            } else if ((charAt2 < 55296 || 57343 < charAt2) && i8 <= i6 - 3) {
                int i10 = i8 + 1;
                bArr[i8] = (byte) ((charAt2 >>> 12) | 480);
                int i11 = i10 + 1;
                bArr[i10] = (byte) (((charAt2 >>> 6) & 63) | 128);
                i4 = i11 + 1;
                bArr[i11] = (byte) ((charAt2 & '?') | 128);
            } else if (i8 <= i6 - 4) {
                int i12 = i7 + 1;
                if (i12 != charSequence.length()) {
                    char charAt3 = charSequence.charAt(i12);
                    if (Character.isSurrogatePair(charAt2, charAt3)) {
                        int codePoint = Character.toCodePoint(charAt2, charAt3);
                        int i13 = i8 + 1;
                        bArr[i8] = (byte) ((codePoint >>> 18) | 240);
                        int i14 = i13 + 1;
                        bArr[i13] = (byte) (((codePoint >>> 12) & 63) | 128);
                        int i15 = i14 + 1;
                        bArr[i14] = (byte) (((codePoint >>> 6) & 63) | 128);
                        i8 = i15 + 1;
                        bArr[i15] = (byte) ((codePoint & 63) | 128);
                        i7 = i12;
                        i7++;
                    } else {
                        i7 = i12;
                    }
                }
                throw new C2454a(i7 - 1, length);
            } else if (55296 > charAt2 || charAt2 > 57343 || ((i3 = i7 + 1) != charSequence.length() && Character.isSurrogatePair(charAt2, charSequence.charAt(i3)))) {
                StringBuilder sb = new StringBuilder(37);
                sb.append("Failed writing ");
                sb.append(charAt2);
                sb.append(" at index ");
                sb.append(i8);
                throw new ArrayIndexOutOfBoundsException(sb.toString());
            } else {
                throw new C2454a(i7, length);
            }
            i8 = i4;
            i7++;
        }
        return i8;
    }

    private static void encodeUtf8Buffer(CharSequence charSequence, ByteBuffer byteBuffer) {
        int i;
        int length = charSequence.length();
        int position = byteBuffer.position();
        int i2 = 0;
        while (i2 < length) {
            try {
                char charAt = charSequence.charAt(i2);
                if (charAt >= 128) {
                    break;
                }
                byteBuffer.put(position + i2, (byte) charAt);
                i2++;
            } catch (IndexOutOfBoundsException unused) {
                char charAt2 = charSequence.charAt(i2);
                StringBuilder sb = new StringBuilder(37);
                sb.append("Failed writing ");
                sb.append(charAt2);
                sb.append(" at index ");
                sb.append(byteBuffer.position() + Math.max(i2, (position - byteBuffer.position()) + 1));
                throw new ArrayIndexOutOfBoundsException(sb.toString());
            }
        }
        if (i2 == length) {
            byteBuffer.position(position + i2);
            return;
        }
        position += i2;
        while (i2 < length) {
            char charAt3 = charSequence.charAt(i2);
            if (charAt3 < 128) {
                byteBuffer.put(position, (byte) charAt3);
            } else if (charAt3 < 2048) {
                i = position + 1;
                try {
                    byteBuffer.put(position, (byte) ((charAt3 >>> 6) | 192));
                    byteBuffer.put(i, (byte) ((charAt3 & '?') | 128));
                    position = i;
                } catch (IndexOutOfBoundsException unused2) {
                    position = i;
                    char charAt22 = charSequence.charAt(i2);
                    StringBuilder sb2 = new StringBuilder(37);
                    sb2.append("Failed writing ");
                    sb2.append(charAt22);
                    sb2.append(" at index ");
                    sb2.append(byteBuffer.position() + Math.max(i2, (position - byteBuffer.position()) + 1));
                    throw new ArrayIndexOutOfBoundsException(sb2.toString());
                }
            } else if (charAt3 < 55296 || 57343 < charAt3) {
                i = position + 1;
                byteBuffer.put(position, (byte) ((charAt3 >>> 12) | 224));
                position = i + 1;
                byteBuffer.put(i, (byte) (((charAt3 >>> 6) & 63) | 128));
                byteBuffer.put(position, (byte) ((charAt3 & '?') | 128));
            } else {
                int i3 = i2 + 1;
                if (i3 != length) {
                    try {
                        char charAt4 = charSequence.charAt(i3);
                        if (Character.isSurrogatePair(charAt3, charAt4)) {
                            int codePoint = Character.toCodePoint(charAt3, charAt4);
                            int i4 = position + 1;
                            try {
                                byteBuffer.put(position, (byte) ((codePoint >>> 18) | 240));
                                position = i4 + 1;
                                byteBuffer.put(i4, (byte) (((codePoint >>> 12) & 63) | 128));
                                i4 = position + 1;
                                byteBuffer.put(position, (byte) (((codePoint >>> 6) & 63) | 128));
                                byteBuffer.put(i4, (byte) ((codePoint & 63) | 128));
                                position = i4;
                                i2 = i3;
                            } catch (IndexOutOfBoundsException unused3) {
                                position = i4;
                                i2 = i3;
                                char charAt222 = charSequence.charAt(i2);
                                StringBuilder sb22 = new StringBuilder(37);
                                sb22.append("Failed writing ");
                                sb22.append(charAt222);
                                sb22.append(" at index ");
                                sb22.append(byteBuffer.position() + Math.max(i2, (position - byteBuffer.position()) + 1));
                                throw new ArrayIndexOutOfBoundsException(sb22.toString());
                            }
                        } else {
                            i2 = i3;
                        }
                    } catch (IndexOutOfBoundsException unused4) {
                        i2 = i3;
                        char charAt2222 = charSequence.charAt(i2);
                        StringBuilder sb222 = new StringBuilder(37);
                        sb222.append("Failed writing ");
                        sb222.append(charAt2222);
                        sb222.append(" at index ");
                        sb222.append(byteBuffer.position() + Math.max(i2, (position - byteBuffer.position()) + 1));
                        throw new ArrayIndexOutOfBoundsException(sb222.toString());
                    }
                }
                throw new C2454a(i2, length);
            }
            i2++;
            position++;
        }
        byteBuffer.position(position);
    }

    private static int encodedLengthGeneral(CharSequence charSequence, int i) {
        int length = charSequence.length();
        int i2 = 0;
        while (i < length) {
            char charAt = charSequence.charAt(i);
            if (charAt < 2048) {
                i2 += (127 - charAt) >>> 31;
            } else {
                i2 += 2;
                if (55296 <= charAt && charAt <= 57343) {
                    if (Character.codePointAt(charSequence, i) >= 65536) {
                        i++;
                    } else {
                        throw new C2454a(i, length);
                    }
                }
            }
            i++;
        }
        return i2;
    }

    public final String decodeUtf8(ByteBuffer byteBuffer, int i, int i2) {
        return byteBuffer.hasArray() ? decodeUtf8Array(byteBuffer.array(), byteBuffer.arrayOffset() + i, i2) : decodeUtf8Buffer(byteBuffer, i, i2);
    }

    public final void encodeUtf8(CharSequence charSequence, ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            int arrayOffset = byteBuffer.arrayOffset();
            byteBuffer.position(encodeUtf8Array(charSequence, byteBuffer.array(), byteBuffer.position() + arrayOffset, byteBuffer.remaining()) - arrayOffset);
            return;
        }
        encodeUtf8Buffer(charSequence, byteBuffer);
    }

    public final int encodedLength(CharSequence charSequence) {
        return computeEncodedLength(charSequence);
    }
}
