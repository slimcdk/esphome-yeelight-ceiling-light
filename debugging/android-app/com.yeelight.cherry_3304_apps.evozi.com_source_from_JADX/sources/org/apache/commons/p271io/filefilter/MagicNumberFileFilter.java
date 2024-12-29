package org.apache.commons.p271io.filefilter;

import com.xiaomi.mipush.sdk.Constants;
import com.yeelight.yeelib.p150c.p183m.C7200r;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.Serializable;
import java.util.Arrays;
import org.apache.commons.p271io.IOUtils;

/* renamed from: org.apache.commons.io.filefilter.MagicNumberFileFilter */
public class MagicNumberFileFilter extends AbstractFileFilter implements Serializable {
    private static final long serialVersionUID = -547733176983104172L;
    private final long byteOffset;
    private final byte[] magicNumbers;

    public MagicNumberFileFilter(String str) {
        this(str, 0);
    }

    public MagicNumberFileFilter(String str, long j) {
        if (str == null) {
            throw new IllegalArgumentException("The magic number cannot be null");
        } else if (str.length() == 0) {
            throw new IllegalArgumentException("The magic number must contain at least one byte");
        } else if (j >= 0) {
            this.magicNumbers = str.getBytes();
            this.byteOffset = j;
        } else {
            throw new IllegalArgumentException("The offset cannot be negative");
        }
    }

    public MagicNumberFileFilter(byte[] bArr) {
        this(bArr, 0);
    }

    public MagicNumberFileFilter(byte[] bArr, long j) {
        if (bArr == null) {
            throw new IllegalArgumentException("The magic number cannot be null");
        } else if (bArr.length == 0) {
            throw new IllegalArgumentException("The magic number must contain at least one byte");
        } else if (j >= 0) {
            byte[] bArr2 = new byte[bArr.length];
            this.magicNumbers = bArr2;
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            this.byteOffset = j;
        } else {
            throw new IllegalArgumentException("The offset cannot be negative");
        }
    }

    public boolean accept(File file) {
        if (file != null && file.isFile() && file.canRead()) {
            RandomAccessFile randomAccessFile = null;
            try {
                byte[] bArr = new byte[this.magicNumbers.length];
                RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, C7200r.f14712G);
                try {
                    randomAccessFile2.seek(this.byteOffset);
                    if (randomAccessFile2.read(bArr) != this.magicNumbers.length) {
                        IOUtils.closeQuietly((Closeable) randomAccessFile2);
                        return false;
                    }
                    boolean equals = Arrays.equals(this.magicNumbers, bArr);
                    IOUtils.closeQuietly((Closeable) randomAccessFile2);
                    return equals;
                } catch (IOException unused) {
                    randomAccessFile = randomAccessFile2;
                    IOUtils.closeQuietly((Closeable) randomAccessFile);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    randomAccessFile = randomAccessFile2;
                    IOUtils.closeQuietly((Closeable) randomAccessFile);
                    throw th;
                }
            } catch (IOException unused2) {
                IOUtils.closeQuietly((Closeable) randomAccessFile);
                return false;
            } catch (Throwable th2) {
                th = th2;
                IOUtils.closeQuietly((Closeable) randomAccessFile);
                throw th;
            }
        }
        return false;
    }

    public String toString() {
        return super.toString() + "(" + new String(this.magicNumbers) + Constants.ACCEPT_TIME_SEPARATOR_SP + this.byteOffset + ")";
    }
}
