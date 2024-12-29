package okio;

import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;

final class SegmentedByteString extends ByteString {
    final transient int[] directory;
    final transient byte[][] segments;

    SegmentedByteString(C3564c cVar, int i) {
        super((byte[]) null);
        C9856t.m23805b(cVar.f5933b, 0, (long) i);
        C3568o oVar = cVar.f5932a;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            int i5 = oVar.f5939c;
            int i6 = oVar.f5938b;
            if (i5 != i6) {
                i3 += i5 - i6;
                i4++;
                oVar = oVar.f5942f;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        this.segments = new byte[i4][];
        this.directory = new int[(i4 * 2)];
        C3568o oVar2 = cVar.f5932a;
        int i7 = 0;
        while (i2 < i) {
            byte[][] bArr = this.segments;
            bArr[i7] = oVar2.f5937a;
            int i8 = oVar2.f5939c;
            int i9 = oVar2.f5938b;
            i2 += i8 - i9;
            if (i2 > i) {
                i2 = i;
            }
            int[] iArr = this.directory;
            iArr[i7] = i2;
            iArr[bArr.length + i7] = i9;
            oVar2.f5940d = true;
            i7++;
            oVar2 = oVar2.f5942f;
        }
    }

    private int segment(int i) {
        int binarySearch = Arrays.binarySearch(this.directory, 0, this.segments.length, i + 1);
        return binarySearch >= 0 ? binarySearch : binarySearch ^ -1;
    }

    private ByteString toByteString() {
        return new ByteString(toByteArray());
    }

    private Object writeReplace() {
        return toByteString();
    }

    public ByteBuffer asByteBuffer() {
        return ByteBuffer.wrap(toByteArray()).asReadOnlyBuffer();
    }

    public String base64() {
        return toByteString().base64();
    }

    public String base64Url() {
        return toByteString().base64Url();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            return byteString.size() == size() && rangeEquals(0, byteString, 0, size());
        }
    }

    public byte getByte(int i) {
        C9856t.m23805b((long) this.directory[this.segments.length - 1], (long) i, 1);
        int segment = segment(i);
        int i2 = segment == 0 ? 0 : this.directory[segment - 1];
        int[] iArr = this.directory;
        byte[][] bArr = this.segments;
        return bArr[segment][(i - i2) + iArr[bArr.length + segment]];
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int length = this.segments.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        while (i2 < length) {
            byte[] bArr = this.segments[i2];
            int[] iArr = this.directory;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            int i7 = (i6 - i3) + i5;
            while (i5 < i7) {
                i4 = (i4 * 31) + bArr[i5];
                i5++;
            }
            i2++;
            i3 = i6;
        }
        this.hashCode = i4;
        return i4;
    }

    public String hex() {
        return toByteString().hex();
    }

    public ByteString hmacSha1(ByteString byteString) {
        return toByteString().hmacSha1(byteString);
    }

    public ByteString hmacSha256(ByteString byteString) {
        return toByteString().hmacSha256(byteString);
    }

    public int indexOf(byte[] bArr, int i) {
        return toByteString().indexOf(bArr, i);
    }

    /* access modifiers changed from: package-private */
    public byte[] internalArray() {
        return toByteArray();
    }

    public int lastIndexOf(byte[] bArr, int i) {
        return toByteString().lastIndexOf(bArr, i);
    }

    public ByteString md5() {
        return toByteString().md5();
    }

    public boolean rangeEquals(int i, ByteString byteString, int i2, int i3) {
        if (i < 0 || i > size() - i3) {
            return false;
        }
        int segment = segment(i);
        while (i3 > 0) {
            int i4 = segment == 0 ? 0 : this.directory[segment - 1];
            int min = Math.min(i3, ((this.directory[segment] - i4) + i4) - i);
            int[] iArr = this.directory;
            byte[][] bArr = this.segments;
            if (!byteString.rangeEquals(i2, bArr[segment], (i - i4) + iArr[bArr.length + segment], min)) {
                return false;
            }
            i += min;
            i2 += min;
            i3 -= min;
            segment++;
        }
        return true;
    }

    public boolean rangeEquals(int i, byte[] bArr, int i2, int i3) {
        if (i < 0 || i > size() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int segment = segment(i);
        while (i3 > 0) {
            int i4 = segment == 0 ? 0 : this.directory[segment - 1];
            int min = Math.min(i3, ((this.directory[segment] - i4) + i4) - i);
            int[] iArr = this.directory;
            byte[][] bArr2 = this.segments;
            if (!C9856t.m23804a(bArr2[segment], (i - i4) + iArr[bArr2.length + segment], bArr, i2, min)) {
                return false;
            }
            i += min;
            i2 += min;
            i3 -= min;
            segment++;
        }
        return true;
    }

    public ByteString sha1() {
        return toByteString().sha1();
    }

    public ByteString sha256() {
        return toByteString().sha256();
    }

    public int size() {
        return this.directory[this.segments.length - 1];
    }

    public String string(Charset charset) {
        return toByteString().string(charset);
    }

    public ByteString substring(int i) {
        return toByteString().substring(i);
    }

    public ByteString substring(int i, int i2) {
        return toByteString().substring(i, i2);
    }

    public ByteString toAsciiLowercase() {
        return toByteString().toAsciiLowercase();
    }

    public ByteString toAsciiUppercase() {
        return toByteString().toAsciiUppercase();
    }

    public byte[] toByteArray() {
        int[] iArr = this.directory;
        byte[][] bArr = this.segments;
        byte[] bArr2 = new byte[iArr[bArr.length - 1]];
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr2 = this.directory;
            int i3 = iArr2[length + i];
            int i4 = iArr2[i];
            System.arraycopy(this.segments[i], i3, bArr2, i2, i4 - i2);
            i++;
            i2 = i4;
        }
        return bArr2;
    }

    public String toString() {
        return toByteString().toString();
    }

    public String utf8() {
        return toByteString().utf8();
    }

    public void write(OutputStream outputStream) {
        if (outputStream != null) {
            int length = this.segments.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                int[] iArr = this.directory;
                int i3 = iArr[length + i];
                int i4 = iArr[i];
                outputStream.write(this.segments[i], i3, i4 - i2);
                i++;
                i2 = i4;
            }
            return;
        }
        throw new IllegalArgumentException("out == null");
    }

    /* access modifiers changed from: package-private */
    public void write(C3564c cVar) {
        int length = this.segments.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.directory;
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            C3568o oVar = new C3568o(this.segments[i], i3, (i3 + i4) - i2, true, false);
            C3568o oVar2 = cVar.f5932a;
            if (oVar2 == null) {
                oVar.f5943g = oVar;
                oVar.f5942f = oVar;
                cVar.f5932a = oVar;
            } else {
                oVar2.f5943g.mo24806c(oVar);
            }
            i++;
            i2 = i4;
        }
        cVar.f5933b += (long) i2;
    }
}
