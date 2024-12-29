package p229x5;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import p225w5.C11937a;
import p225w5.C11940d;

/* renamed from: x5.c */
public class C11985c extends C11937a implements C11987e {

    /* renamed from: l */
    protected final ByteBuffer f21891l;

    /* renamed from: m */
    private ReadableByteChannel f21892m;

    /* renamed from: n */
    private InputStream f21893n;

    /* renamed from: o */
    private WritableByteChannel f21894o;

    /* renamed from: p */
    private OutputStream f21895p;

    public C11985c(int i) {
        super(2, false);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i);
        this.f21891l = allocateDirect;
        allocateDirect.position(0);
        allocateDirect.limit(allocateDirect.capacity());
    }

    public C11985c(File file) {
        super(1, false);
        this.f21891l = new FileInputStream(file).getChannel().map(FileChannel.MapMode.READ_ONLY, 0, file.length());
        mo42442v0(0);
        mo42430h0((int) file.length());
        this.f21809a = 0;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11985c(ByteBuffer byteBuffer, boolean z) {
        super(z ? 0 : 2, false);
        if (byteBuffer.isDirect()) {
            this.f21891l = byteBuffer;
            mo42442v0(byteBuffer.position());
            mo42430h0(byteBuffer.limit());
            return;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: A0 */
    public ByteBuffer mo42558A0() {
        return this.f21891l;
    }

    /* renamed from: W */
    public byte mo42449W(int i) {
        return this.f21891l.get(i);
    }

    public int capacity() {
        return this.f21891l.capacity();
    }

    /* renamed from: f0 */
    public int mo42426f0(int i, C11940d dVar) {
        if (!mo42415T()) {
            byte[] g0 = dVar.mo42451g0();
            if (g0 != null) {
                return mo42435m(i, g0, dVar.mo42409L0(), dVar.length());
            }
            C11940d F = dVar.mo42406F();
            if (!(F instanceof C11985c)) {
                return super.mo42426f0(i, dVar);
            }
            ByteBuffer byteBuffer = ((C11985c) F).f21891l;
            ByteBuffer byteBuffer2 = this.f21891l;
            if (byteBuffer == byteBuffer2) {
                byteBuffer = byteBuffer2.duplicate();
            }
            try {
                this.f21891l.position(i);
                int remaining = this.f21891l.remaining();
                int length = dVar.length();
                if (length <= remaining) {
                    remaining = length;
                }
                byteBuffer.position(dVar.mo42409L0());
                byteBuffer.limit(dVar.mo42409L0() + remaining);
                this.f21891l.put(byteBuffer);
                return remaining;
            } finally {
                this.f21891l.position(0);
                byteBuffer.limit(byteBuffer.capacity());
                byteBuffer.position(0);
            }
        } else {
            throw new IllegalStateException("READONLY");
        }
    }

    /* renamed from: g0 */
    public byte[] mo42451g0() {
        return null;
    }

    /* renamed from: l */
    public void mo42433l(OutputStream outputStream) {
        int write;
        WritableByteChannel writableByteChannel = this.f21894o;
        if (writableByteChannel == null || !writableByteChannel.isOpen() || outputStream != this.f21895p) {
            this.f21894o = Channels.newChannel(outputStream);
            this.f21895p = outputStream;
        }
        synchronized (this.f21891l) {
            loop0:
            while (true) {
                int i = 0;
                while (true) {
                    try {
                        if (mo42408J0() && this.f21894o.isOpen()) {
                            this.f21891l.position(mo42409L0());
                            this.f21891l.limit(mo42416U0());
                            write = this.f21894o.write(this.f21891l);
                            if (write < 0) {
                                break loop0;
                            } else if (write > 0) {
                                break;
                            } else {
                                int i2 = i + 1;
                                if (i <= 1) {
                                    i = i2;
                                }
                            }
                        }
                    } catch (IOException e) {
                        this.f21894o = null;
                        this.f21895p = null;
                        throw e;
                    } catch (Throwable th) {
                        WritableByteChannel writableByteChannel2 = this.f21894o;
                        if (writableByteChannel2 != null && !writableByteChannel2.isOpen()) {
                            this.f21894o = null;
                            this.f21895p = null;
                        }
                        this.f21891l.position(0);
                        ByteBuffer byteBuffer = this.f21891l;
                        byteBuffer.limit(byteBuffer.capacity());
                        throw th;
                    }
                }
                mo42441u0(write);
            }
            WritableByteChannel writableByteChannel3 = this.f21894o;
            if (writableByteChannel3 != null && !writableByteChannel3.isOpen()) {
                this.f21894o = null;
                this.f21895p = null;
            }
            this.f21891l.position(0);
            ByteBuffer byteBuffer2 = this.f21891l;
            byteBuffer2.limit(byteBuffer2.capacity());
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: m */
    public int mo42435m(int i, byte[] bArr, int i2, int i3) {
        if (mo42415T()) {
            throw new IllegalStateException("READONLY");
        } else if (i < 0) {
            throw new IllegalArgumentException("index<0: " + i + "<0");
        } else if (i + i3 <= capacity() || (i3 = capacity() - i) >= 0) {
            try {
                this.f21891l.position(i);
                int remaining = this.f21891l.remaining();
                if (i3 > remaining) {
                    i3 = remaining;
                }
                if (i3 > 0) {
                    this.f21891l.put(bArr, i2, i3);
                }
                this.f21891l.position(0);
                return i3;
            } catch (Throwable th) {
                this.f21891l.position(0);
                throw th;
            }
        } else {
            throw new IllegalArgumentException("index>capacity(): " + i + ">" + capacity());
        }
    }

    /* renamed from: p0 */
    public void mo42452p0(int i, byte b) {
        if (mo42415T()) {
            throw new IllegalStateException("READONLY");
        } else if (i < 0) {
            throw new IllegalArgumentException("index<0: " + i + "<0");
        } else if (i <= capacity()) {
            this.f21891l.put(i, b);
        } else {
            throw new IllegalArgumentException("index>capacity(): " + i + ">" + capacity());
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: x0 */
    public int mo42453x0(int i, byte[] bArr, int i2, int i3) {
        if ((i + i3 > capacity() && (i3 = capacity() - i) == 0) || i3 < 0) {
            return -1;
        }
        try {
            this.f21891l.position(i);
            this.f21891l.get(bArr, i2, i3);
            this.f21891l.position(0);
            return i3;
        } catch (Throwable th) {
            this.f21891l.position(0);
            throw th;
        }
    }

    /* renamed from: y0 */
    public int mo42444y0(InputStream inputStream, int i) {
        ReadableByteChannel readableByteChannel = this.f21892m;
        if (readableByteChannel == null || !readableByteChannel.isOpen() || inputStream != this.f21893n) {
            this.f21892m = Channels.newChannel(inputStream);
            this.f21893n = inputStream;
        }
        if (i < 0 || i > mo42410M0()) {
            i = mo42410M0();
        }
        int U0 = mo42416U0();
        int i2 = i;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (i3 >= i) {
                break;
            }
            try {
                this.f21891l.position(U0);
                this.f21891l.limit(U0 + i2);
                i5 = this.f21892m.read(this.f21891l);
                if (i5 >= 0) {
                    if (i5 > 0) {
                        U0 += i5;
                        i3 += i5;
                        i2 -= i5;
                        mo42430h0(U0);
                        i4 = 0;
                    } else {
                        int i6 = i4 + 1;
                        if (i4 > 1) {
                            break;
                        }
                        i4 = i6;
                    }
                    if (inputStream.available() <= 0) {
                        break;
                    }
                } else {
                    this.f21892m = null;
                    this.f21893n = inputStream;
                    break;
                }
            } catch (IOException e) {
                this.f21892m = null;
                this.f21893n = inputStream;
                throw e;
            } catch (Throwable th) {
                ReadableByteChannel readableByteChannel2 = this.f21892m;
                if (readableByteChannel2 != null && !readableByteChannel2.isOpen()) {
                    this.f21892m = null;
                    this.f21893n = inputStream;
                }
                this.f21891l.position(0);
                ByteBuffer byteBuffer = this.f21891l;
                byteBuffer.limit(byteBuffer.capacity());
                throw th;
            }
        }
        if (i5 >= 0 || i3 != 0) {
            ReadableByteChannel readableByteChannel3 = this.f21892m;
            if (readableByteChannel3 != null && !readableByteChannel3.isOpen()) {
                this.f21892m = null;
                this.f21893n = inputStream;
            }
            this.f21891l.position(0);
            ByteBuffer byteBuffer2 = this.f21891l;
            byteBuffer2.limit(byteBuffer2.capacity());
            return i3;
        }
        ReadableByteChannel readableByteChannel4 = this.f21892m;
        if (readableByteChannel4 != null && !readableByteChannel4.isOpen()) {
            this.f21892m = null;
            this.f21893n = inputStream;
        }
        this.f21891l.position(0);
        ByteBuffer byteBuffer3 = this.f21891l;
        byteBuffer3.limit(byteBuffer3.capacity());
        return -1;
    }
}
