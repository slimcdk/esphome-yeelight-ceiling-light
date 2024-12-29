package p229x5;

import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;
import p225w5.C11937a;

/* renamed from: x5.f */
public class C11988f extends C11937a {

    /* renamed from: l */
    final RandomAccessFile f21897l;

    /* renamed from: m */
    final FileChannel f21898m;

    /* renamed from: n */
    final int f21899n;

    static {
        Class<C11988f> cls = C11988f.class;
    }

    /* renamed from: W */
    public byte mo42449W(int i) {
        byte readByte;
        synchronized (this.f21897l) {
            try {
                this.f21897l.seek((long) i);
                readByte = this.f21897l.readByte();
            } catch (Exception e) {
                throw new RuntimeException(e);
            } catch (Throwable th) {
                throw th;
            }
        }
        return readByte;
    }

    public int capacity() {
        return this.f21899n;
    }

    public void clear() {
        try {
            synchronized (this.f21897l) {
                super.clear();
                this.f21897l.setLength(0);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: d */
    public int mo42559d(WritableByteChannel writableByteChannel, int i, int i2) {
        int transferTo;
        synchronized (this.f21897l) {
            transferTo = (int) this.f21898m.transferTo((long) i, (long) i2, writableByteChannel);
        }
        return transferTo;
    }

    /* renamed from: g0 */
    public byte[] mo42451g0() {
        return null;
    }

    /* renamed from: m */
    public int mo42435m(int i, byte[] bArr, int i2, int i3) {
        synchronized (this.f21897l) {
            try {
                this.f21897l.seek((long) i);
                this.f21897l.write(bArr, i2, i3);
            } catch (Exception e) {
                throw new RuntimeException(e);
            } catch (Throwable th) {
                throw th;
            }
        }
        return i3;
    }

    /* renamed from: p0 */
    public void mo42452p0(int i, byte b) {
        synchronized (this.f21897l) {
            try {
                this.f21897l.seek((long) i);
                this.f21897l.writeByte(b);
            } catch (Exception e) {
                throw new RuntimeException(e);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public byte peek() {
        byte readByte;
        synchronized (this.f21897l) {
            try {
                if (((long) this.f21811c) != this.f21897l.getFilePointer()) {
                    this.f21897l.seek((long) this.f21811c);
                }
                readByte = this.f21897l.readByte();
            } catch (Exception e) {
                throw new RuntimeException(e);
            } catch (Throwable th) {
                throw th;
            }
        }
        return readByte;
    }

    /* renamed from: x0 */
    public int mo42453x0(int i, byte[] bArr, int i2, int i3) {
        int read;
        synchronized (this.f21897l) {
            try {
                this.f21897l.seek((long) i);
                read = this.f21897l.read(bArr, i2, i3);
            } catch (Exception e) {
                throw new RuntimeException(e);
            } catch (Throwable th) {
                throw th;
            }
        }
        return read;
    }
}
