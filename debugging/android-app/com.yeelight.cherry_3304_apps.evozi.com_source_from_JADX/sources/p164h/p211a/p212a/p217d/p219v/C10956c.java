package p164h.p211a.p212a.p217d.p219v;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import p164h.p211a.p212a.p217d.C10924a;
import p164h.p211a.p212a.p217d.C10929e;

/* renamed from: h.a.a.d.v.c */
public class C10956c extends C10924a implements C10958e {

    /* renamed from: l */
    protected final ByteBuffer f21359l;

    /* renamed from: m */
    private ReadableByteChannel f21360m;

    /* renamed from: n */
    private InputStream f21361n;

    /* renamed from: o */
    private WritableByteChannel f21362o;

    /* renamed from: p */
    private OutputStream f21363p;

    public C10956c(int i) {
        super(2, false);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i);
        this.f21359l = allocateDirect;
        allocateDirect.position(0);
        ByteBuffer byteBuffer = this.f21359l;
        byteBuffer.limit(byteBuffer.capacity());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10956c(ByteBuffer byteBuffer, boolean z) {
        super(z ? 0 : 2, false);
        if (byteBuffer.isDirect()) {
            this.f21359l = byteBuffer;
            mo34592v0(byteBuffer.position());
            mo34575f0(byteBuffer.limit());
            return;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: X */
    public byte mo34606X(int i) {
        return this.f21359l.get(i);
    }

    public int capacity() {
        return this.f21359l.capacity();
    }

    /* renamed from: e0 */
    public byte[] mo34608e0() {
        return null;
    }

    /* renamed from: g */
    public int mo34576g(int i, C10929e eVar) {
        if (!mo34564V()) {
            byte[] e0 = eVar.mo34608e0();
            if (e0 != null) {
                return mo34580h(i, e0, eVar.getIndex(), eVar.length());
            }
            C10929e H = eVar.mo34557H();
            if (!(H instanceof C10956c)) {
                return super.mo34576g(i, eVar);
            }
            ByteBuffer byteBuffer = ((C10956c) H).f21359l;
            ByteBuffer byteBuffer2 = this.f21359l;
            if (byteBuffer == byteBuffer2) {
                byteBuffer = byteBuffer2.duplicate();
            }
            try {
                this.f21359l.position(i);
                int remaining = this.f21359l.remaining();
                int length = eVar.length();
                if (length <= remaining) {
                    remaining = length;
                }
                byteBuffer.position(eVar.getIndex());
                byteBuffer.limit(eVar.getIndex() + remaining);
                this.f21359l.put(byteBuffer);
                return remaining;
            } finally {
                this.f21359l.position(0);
                byteBuffer.limit(byteBuffer.capacity());
                byteBuffer.position(0);
            }
        } else {
            throw new IllegalStateException("READONLY");
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: h */
    public int mo34580h(int i, byte[] bArr, int i2, int i3) {
        if (mo34564V()) {
            throw new IllegalStateException("READONLY");
        } else if (i < 0) {
            throw new IllegalArgumentException("index<0: " + i + "<0");
        } else if (i + i3 <= capacity() || (i3 = capacity() - i) >= 0) {
            try {
                this.f21359l.position(i);
                int remaining = this.f21359l.remaining();
                if (i3 > remaining) {
                    i3 = remaining;
                }
                if (i3 > 0) {
                    this.f21359l.put(bArr, i2, i3);
                }
                this.f21359l.position(0);
                return i3;
            } catch (Throwable th) {
                this.f21359l.position(0);
                throw th;
            }
        } else {
            throw new IllegalArgumentException("index>capacity(): " + i + ">" + capacity());
        }
    }

    /* renamed from: o0 */
    public void mo34609o0(int i, byte b) {
        if (mo34564V()) {
            throw new IllegalStateException("READONLY");
        } else if (i < 0) {
            throw new IllegalArgumentException("index<0: " + i + "<0");
        } else if (i <= capacity()) {
            this.f21359l.put(i, b);
        } else {
            throw new IllegalArgumentException("index>capacity(): " + i + ">" + capacity());
        }
    }

    public void writeTo(OutputStream outputStream) {
        int write;
        WritableByteChannel writableByteChannel = this.f21362o;
        if (writableByteChannel == null || !writableByteChannel.isOpen() || outputStream != this.f21363p) {
            this.f21362o = Channels.newChannel(outputStream);
            this.f21363p = outputStream;
        }
        synchronized (this.f21359l) {
            loop0:
            while (true) {
                int i = 0;
                while (true) {
                    try {
                        if (mo34556F0() && this.f21362o.isOpen()) {
                            this.f21359l.position(getIndex());
                            this.f21359l.limit(mo34562S0());
                            write = this.f21362o.write(this.f21359l);
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
                        this.f21362o = null;
                        this.f21363p = null;
                        throw e;
                    } catch (Throwable th) {
                        if (this.f21362o != null && !this.f21362o.isOpen()) {
                            this.f21362o = null;
                            this.f21363p = null;
                        }
                        this.f21359l.position(0);
                        this.f21359l.limit(this.f21359l.capacity());
                        throw th;
                    }
                }
                mo34591u0(write);
            }
            if (this.f21362o != null && !this.f21362o.isOpen()) {
                this.f21362o = null;
                this.f21363p = null;
            }
            this.f21359l.position(0);
            this.f21359l.limit(this.f21359l.capacity());
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: x0 */
    public int mo34610x0(int i, byte[] bArr, int i2, int i3) {
        if ((i + i3 > capacity() && (i3 = capacity() - i) == 0) || i3 < 0) {
            return -1;
        }
        try {
            this.f21359l.position(i);
            this.f21359l.get(bArr, i2, i3);
            this.f21359l.position(0);
            return i3;
        } catch (Throwable th) {
            this.f21359l.position(0);
            throw th;
        }
    }

    /* renamed from: y0 */
    public int mo34595y0(InputStream inputStream, int i) {
        ReadableByteChannel readableByteChannel = this.f21360m;
        if (readableByteChannel == null || !readableByteChannel.isOpen() || inputStream != this.f21361n) {
            this.f21360m = Channels.newChannel(inputStream);
            this.f21361n = inputStream;
        }
        if (i < 0 || i > mo34558I0()) {
            i = mo34558I0();
        }
        int S0 = mo34562S0();
        int i2 = i;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (i3 >= i) {
                break;
            }
            try {
                this.f21359l.position(S0);
                this.f21359l.limit(S0 + i2);
                i5 = this.f21360m.read(this.f21359l);
                if (i5 >= 0) {
                    if (i5 > 0) {
                        S0 += i5;
                        i3 += i5;
                        i2 -= i5;
                        mo34575f0(S0);
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
                    this.f21360m = null;
                    this.f21361n = inputStream;
                    break;
                }
            } catch (IOException e) {
                this.f21360m = null;
                this.f21361n = inputStream;
                throw e;
            } catch (Throwable th) {
                ReadableByteChannel readableByteChannel2 = this.f21360m;
                if (readableByteChannel2 != null && !readableByteChannel2.isOpen()) {
                    this.f21360m = null;
                    this.f21361n = inputStream;
                }
                this.f21359l.position(0);
                ByteBuffer byteBuffer = this.f21359l;
                byteBuffer.limit(byteBuffer.capacity());
                throw th;
            }
        }
        if (i5 >= 0 || i3 != 0) {
            ReadableByteChannel readableByteChannel3 = this.f21360m;
            if (readableByteChannel3 != null && !readableByteChannel3.isOpen()) {
                this.f21360m = null;
                this.f21361n = inputStream;
            }
            this.f21359l.position(0);
            ByteBuffer byteBuffer2 = this.f21359l;
            byteBuffer2.limit(byteBuffer2.capacity());
            return i3;
        }
        ReadableByteChannel readableByteChannel4 = this.f21360m;
        if (readableByteChannel4 != null && !readableByteChannel4.isOpen()) {
            this.f21360m = null;
            this.f21361n = inputStream;
        }
        this.f21359l.position(0);
        ByteBuffer byteBuffer3 = this.f21359l;
        byteBuffer3.limit(byteBuffer3.capacity());
        return -1;
    }

    /* renamed from: z0 */
    public ByteBuffer mo34672z0() {
        return this.f21359l;
    }
}
