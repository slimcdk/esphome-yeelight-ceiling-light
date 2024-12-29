package p164h.p211a.p212a.p217d.p219v;

import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;
import p164h.p211a.p212a.p217d.C10924a;
import p164h.p211a.p212a.p217d.C10929e;

/* renamed from: h.a.a.d.v.f */
public class C10959f extends C10924a implements C10929e {

    /* renamed from: l */
    final RandomAccessFile f21365l;

    /* renamed from: m */
    final FileChannel f21366m;

    /* renamed from: n */
    final int f21367n;

    static {
        Class<C10959f> cls = C10959f.class;
    }

    /* renamed from: X */
    public byte mo34606X(int i) {
        byte readByte;
        synchronized (this.f21365l) {
            try {
                this.f21365l.seek((long) i);
                readByte = this.f21365l.readByte();
            } catch (Exception e) {
                throw new RuntimeException(e);
            } catch (Throwable th) {
                throw th;
            }
        }
        return readByte;
    }

    public int capacity() {
        return this.f21367n;
    }

    public void clear() {
        try {
            synchronized (this.f21365l) {
                super.clear();
                this.f21365l.setLength(0);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: d */
    public int mo34673d(WritableByteChannel writableByteChannel, int i, int i2) {
        int transferTo;
        synchronized (this.f21365l) {
            transferTo = (int) this.f21366m.transferTo((long) i, (long) i2, writableByteChannel);
        }
        return transferTo;
    }

    /* renamed from: e0 */
    public byte[] mo34608e0() {
        return null;
    }

    /* renamed from: h */
    public int mo34580h(int i, byte[] bArr, int i2, int i3) {
        synchronized (this.f21365l) {
            try {
                this.f21365l.seek((long) i);
                this.f21365l.write(bArr, i2, i3);
            } catch (Exception e) {
                throw new RuntimeException(e);
            } catch (Throwable th) {
                throw th;
            }
        }
        return i3;
    }

    /* renamed from: o0 */
    public void mo34609o0(int i, byte b) {
        synchronized (this.f21365l) {
            try {
                this.f21365l.seek((long) i);
                this.f21365l.writeByte(b);
            } catch (Exception e) {
                throw new RuntimeException(e);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public byte peek() {
        byte readByte;
        synchronized (this.f21365l) {
            try {
                if (((long) this.f21292c) != this.f21365l.getFilePointer()) {
                    this.f21365l.seek((long) this.f21292c);
                }
                readByte = this.f21365l.readByte();
            } catch (Exception e) {
                throw new RuntimeException(e);
            } catch (Throwable th) {
                throw th;
            }
        }
        return readByte;
    }

    /* renamed from: x0 */
    public int mo34610x0(int i, byte[] bArr, int i2, int i3) {
        int read;
        synchronized (this.f21365l) {
            try {
                this.f21365l.seek((long) i);
                read = this.f21365l.read(bArr, i2, i3);
            } catch (Exception e) {
                throw new RuntimeException(e);
            } catch (Throwable th) {
                throw th;
            }
        }
        return read;
    }
}
