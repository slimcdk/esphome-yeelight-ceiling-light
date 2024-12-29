package p163g;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* renamed from: g.e */
public interface C4410e extends C4416t, ReadableByteChannel {
    /* renamed from: B */
    long mo24202B();

    /* renamed from: C0 */
    String mo24203C0();

    /* renamed from: E */
    String mo24205E(long j);

    /* renamed from: E0 */
    int mo24206E0();

    /* renamed from: H */
    C4406c mo24208H();

    /* renamed from: H0 */
    byte[] mo24209H0(long j);

    /* renamed from: N0 */
    short mo24213N0();

    /* renamed from: R0 */
    long mo24216R0(C4415s sVar);

    /* renamed from: X0 */
    void mo24218X0(long j);

    /* renamed from: b1 */
    long mo24224b1(byte b);

    /* renamed from: c1 */
    long mo24225c1();

    /* renamed from: d1 */
    InputStream mo24229d1();

    /* renamed from: h0 */
    boolean mo24234h0(long j, C4411f fVar);

    /* renamed from: i0 */
    String mo24237i0(Charset charset);

    /* renamed from: p */
    C4411f mo24250p(long j);

    byte readByte();

    void readFully(byte[] bArr);

    int readInt();

    short readShort();

    void skip(long j);

    /* renamed from: v */
    byte[] mo24270v();

    /* renamed from: x */
    boolean mo24274x();
}
