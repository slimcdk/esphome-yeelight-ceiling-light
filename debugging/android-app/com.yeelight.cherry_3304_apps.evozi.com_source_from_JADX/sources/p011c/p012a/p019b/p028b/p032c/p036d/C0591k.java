package p011c.p012a.p019b.p028b.p032c.p036d;

import com.miot.service.connection.wifi.step.SmartConfigStep;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;

/* renamed from: c.a.b.b.c.d.k */
public final class C0591k {

    /* renamed from: a */
    private final ByteBuffer f267a;

    private C0591k(ByteBuffer byteBuffer) {
        this.f267a = byteBuffer;
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    }

    private C0591k(byte[] bArr, int i, int i2) {
        this(ByteBuffer.wrap(bArr, i, i2));
    }

    /* renamed from: a */
    private static int m402a(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i2);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                int length2 = charSequence.length();
                while (i2 < length2) {
                    char charAt2 = charSequence.charAt(i2);
                    if (charAt2 < 2048) {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i2) >= 65536) {
                                i2++;
                            } else {
                                StringBuilder sb = new StringBuilder(39);
                                sb.append("Unpaired surrogate at index ");
                                sb.append(i2);
                                throw new IllegalArgumentException(sb.toString());
                            }
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        StringBuilder sb2 = new StringBuilder(54);
        sb2.append("UTF-8 length does not fit in int: ");
        sb2.append(((long) i3) + 4294967296L);
        throw new IllegalArgumentException(sb2.toString());
    }

    /* renamed from: g */
    private final void m403g(long j) {
        while ((-128 & j) != 0) {
            m413u((((int) j) & SmartConfigStep.MSG_BLE_NOTIFY_TIME_OUT) | 128);
            j >>>= 7;
        }
        m413u((int) j);
    }

    /* renamed from: h */
    private static void m404h(CharSequence charSequence, ByteBuffer byteBuffer) {
        int i;
        int i2;
        int i3;
        char charAt;
        if (!byteBuffer.isReadOnly()) {
            int i4 = 0;
            if (byteBuffer.hasArray()) {
                try {
                    byte[] array = byteBuffer.array();
                    int arrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
                    int remaining = byteBuffer.remaining();
                    int length = charSequence.length();
                    int i5 = remaining + arrayOffset;
                    while (i4 < length) {
                        int i6 = i4 + arrayOffset;
                        if (i6 >= i5 || (charAt = charSequence.charAt(i4)) >= 128) {
                            break;
                        }
                        array[i6] = (byte) charAt;
                        i4++;
                    }
                    if (i4 == length) {
                        i2 = arrayOffset + length;
                    } else {
                        i2 = arrayOffset + i4;
                        while (i4 < length) {
                            char charAt2 = charSequence.charAt(i4);
                            if (charAt2 < 128 && i2 < i5) {
                                i3 = i2 + 1;
                                array[i2] = (byte) charAt2;
                            } else if (charAt2 < 2048 && i2 <= i5 - 2) {
                                int i7 = i2 + 1;
                                array[i2] = (byte) ((charAt2 >>> 6) | 960);
                                i2 = i7 + 1;
                                array[i7] = (byte) ((charAt2 & '?') | 128);
                                i4++;
                            } else if ((charAt2 < 55296 || 57343 < charAt2) && i2 <= i5 - 3) {
                                int i8 = i2 + 1;
                                array[i2] = (byte) ((charAt2 >>> 12) | 480);
                                int i9 = i8 + 1;
                                array[i8] = (byte) (((charAt2 >>> 6) & 63) | 128);
                                i3 = i9 + 1;
                                array[i9] = (byte) ((charAt2 & '?') | 128);
                            } else if (i2 <= i5 - 4) {
                                int i10 = i4 + 1;
                                if (i10 != charSequence.length()) {
                                    char charAt3 = charSequence.charAt(i10);
                                    if (Character.isSurrogatePair(charAt2, charAt3)) {
                                        int codePoint = Character.toCodePoint(charAt2, charAt3);
                                        int i11 = i2 + 1;
                                        array[i2] = (byte) ((codePoint >>> 18) | 240);
                                        int i12 = i11 + 1;
                                        array[i11] = (byte) (((codePoint >>> 12) & 63) | 128);
                                        int i13 = i12 + 1;
                                        array[i12] = (byte) (((codePoint >>> 6) & 63) | 128);
                                        i2 = i13 + 1;
                                        array[i13] = (byte) ((codePoint & 63) | 128);
                                        i4 = i10;
                                        i4++;
                                    } else {
                                        i4 = i10;
                                    }
                                }
                                StringBuilder sb = new StringBuilder(39);
                                sb.append("Unpaired surrogate at index ");
                                sb.append(i4 - 1);
                                throw new IllegalArgumentException(sb.toString());
                            } else {
                                StringBuilder sb2 = new StringBuilder(37);
                                sb2.append("Failed writing ");
                                sb2.append(charAt2);
                                sb2.append(" at index ");
                                sb2.append(i2);
                                throw new ArrayIndexOutOfBoundsException(sb2.toString());
                            }
                            i2 = i3;
                            i4++;
                        }
                    }
                    byteBuffer.position(i2 - byteBuffer.arrayOffset());
                } catch (ArrayIndexOutOfBoundsException e) {
                    BufferOverflowException bufferOverflowException = new BufferOverflowException();
                    bufferOverflowException.initCause(e);
                    throw bufferOverflowException;
                }
            } else {
                int length2 = charSequence.length();
                while (i4 < length2) {
                    char charAt4 = charSequence.charAt(i4);
                    if (charAt4 >= 128) {
                        if (charAt4 < 2048) {
                            i = (charAt4 >>> 6) | 960;
                        } else if (charAt4 < 55296 || 57343 < charAt4) {
                            byteBuffer.put((byte) ((charAt4 >>> 12) | 480));
                            i = ((charAt4 >>> 6) & 63) | 128;
                        } else {
                            int i14 = i4 + 1;
                            if (i14 != charSequence.length()) {
                                char charAt5 = charSequence.charAt(i14);
                                if (Character.isSurrogatePair(charAt4, charAt5)) {
                                    int codePoint2 = Character.toCodePoint(charAt4, charAt5);
                                    byteBuffer.put((byte) ((codePoint2 >>> 18) | 240));
                                    byteBuffer.put((byte) (((codePoint2 >>> 12) & 63) | 128));
                                    byteBuffer.put((byte) (((codePoint2 >>> 6) & 63) | 128));
                                    byteBuffer.put((byte) ((codePoint2 & 63) | 128));
                                    i4 = i14;
                                    i4++;
                                } else {
                                    i4 = i14;
                                }
                            }
                            StringBuilder sb3 = new StringBuilder(39);
                            sb3.append("Unpaired surrogate at index ");
                            sb3.append(i4 - 1);
                            throw new IllegalArgumentException(sb3.toString());
                        }
                        byteBuffer.put((byte) i);
                        charAt4 = (charAt4 & '?') | 128;
                    }
                    byteBuffer.put((byte) charAt4);
                    i4++;
                }
            }
        } else {
            throw new ReadOnlyBufferException();
        }
    }

    /* renamed from: i */
    public static int m405i(int i, long j) {
        return m414v(i) + ((-128 & j) == 0 ? 1 : (-16384 & j) == 0 ? 2 : (-2097152 & j) == 0 ? 3 : (-268435456 & j) == 0 ? 4 : (-34359738368L & j) == 0 ? 5 : (-4398046511104L & j) == 0 ? 6 : (-562949953421312L & j) == 0 ? 7 : (-72057594037927936L & j) == 0 ? 8 : (j & Long.MIN_VALUE) == 0 ? 9 : 10);
    }

    /* renamed from: j */
    public static int m406j(int i, C0599s sVar) {
        int v = m414v(i);
        int g = sVar.mo8617g();
        return v + m415x(g) + g;
    }

    /* renamed from: k */
    public static int m407k(int i, String str) {
        return m414v(i) + m411s(str);
    }

    /* renamed from: l */
    public static C0591k m408l(byte[] bArr) {
        return m409m(bArr, 0, bArr.length);
    }

    /* renamed from: m */
    public static C0591k m409m(byte[] bArr, int i, int i2) {
        return new C0591k(bArr, 0, i2);
    }

    /* renamed from: q */
    public static int m410q(int i, int i2) {
        return m414v(i) + m412t(i2);
    }

    /* renamed from: s */
    public static int m411s(String str) {
        int a = m402a(str);
        return m415x(a) + a;
    }

    /* renamed from: t */
    public static int m412t(int i) {
        if (i >= 0) {
            return m415x(i);
        }
        return 10;
    }

    /* renamed from: u */
    private final void m413u(int i) {
        byte b = (byte) i;
        if (this.f267a.hasRemaining()) {
            this.f267a.put(b);
            return;
        }
        throw new C0592l(this.f267a.position(), this.f267a.limit());
    }

    /* renamed from: v */
    public static int m414v(int i) {
        return m415x(i << 3);
    }

    /* renamed from: x */
    public static int m415x(int i) {
        if ((i & -128) == 0) {
            return 1;
        }
        if ((i & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i) == 0) {
            return 3;
        }
        return (i & -268435456) == 0 ? 4 : 5;
    }

    /* renamed from: y */
    public static int m416y(int i) {
        return (i >> 31) ^ (i << 1);
    }

    /* renamed from: b */
    public final void mo8589b(byte b) {
        if (this.f267a.hasRemaining()) {
            this.f267a.put(b);
            return;
        }
        throw new C0592l(this.f267a.position(), this.f267a.limit());
    }

    /* renamed from: c */
    public final void mo8590c(int i, float f) {
        mo8597r(i, 5);
        int floatToIntBits = Float.floatToIntBits(f);
        if (this.f267a.remaining() >= 4) {
            this.f267a.putInt(floatToIntBits);
            return;
        }
        throw new C0592l(this.f267a.position(), this.f267a.limit());
    }

    /* renamed from: d */
    public final void mo8591d(int i, long j) {
        mo8597r(i, 0);
        m403g(j);
    }

    /* renamed from: e */
    public final void mo8592e(int i, C0599s sVar) {
        mo8597r(i, 2);
        if (sVar.f279a < 0) {
            sVar.mo8617g();
        }
        mo8598w(sVar.f279a);
        sVar.mo8562c(this);
    }

    /* renamed from: f */
    public final void mo8593f(int i, String str) {
        mo8597r(i, 2);
        try {
            int x = m415x(str.length());
            if (x == m415x(str.length() * 3)) {
                int position = this.f267a.position();
                if (this.f267a.remaining() >= x) {
                    this.f267a.position(position + x);
                    m404h(str, this.f267a);
                    int position2 = this.f267a.position();
                    this.f267a.position(position);
                    mo8598w((position2 - position) - x);
                    this.f267a.position(position2);
                    return;
                }
                throw new C0592l(position + x, this.f267a.limit());
            }
            mo8598w(m402a(str));
            m404h(str, this.f267a);
        } catch (BufferOverflowException e) {
            C0592l lVar = new C0592l(this.f267a.position(), this.f267a.limit());
            lVar.initCause(e);
            throw lVar;
        }
    }

    /* renamed from: n */
    public final void mo8594n(long j) {
        if (this.f267a.remaining() >= 8) {
            this.f267a.putLong(j);
            return;
        }
        throw new C0592l(this.f267a.position(), this.f267a.limit());
    }

    /* renamed from: o */
    public final void mo8595o(byte[] bArr) {
        int length = bArr.length;
        if (this.f267a.remaining() >= length) {
            this.f267a.put(bArr, 0, length);
            return;
        }
        throw new C0592l(this.f267a.position(), this.f267a.limit());
    }

    /* renamed from: p */
    public final void mo8596p(int i, int i2) {
        mo8597r(i, 0);
        if (i2 >= 0) {
            mo8598w(i2);
        } else {
            m403g((long) i2);
        }
    }

    /* renamed from: r */
    public final void mo8597r(int i, int i2) {
        mo8598w((i << 3) | i2);
    }

    /* renamed from: w */
    public final void mo8598w(int i) {
        while ((i & -128) != 0) {
            m413u((i & SmartConfigStep.MSG_BLE_NOTIFY_TIME_OUT) | 128);
            i >>>= 7;
        }
        m413u(i);
    }

    /* renamed from: z */
    public final void mo8599z() {
        if (this.f267a.remaining() != 0) {
            throw new IllegalStateException(String.format("Did not write as much data as expected, %s bytes remaining.", new Object[]{Integer.valueOf(this.f267a.remaining())}));
        }
    }
}
