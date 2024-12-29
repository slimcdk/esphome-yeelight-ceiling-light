package okio;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;

/* renamed from: okio.e */
public interface C9838e extends C9853r, ReadableByteChannel {
    /* renamed from: B0 */
    boolean mo24721B0(long j);

    /* renamed from: F */
    C3564c mo24724F();

    /* renamed from: G0 */
    String mo24725G0();

    /* renamed from: I0 */
    int mo24726I0();

    /* renamed from: K0 */
    byte[] mo24728K0(long j);

    /* renamed from: O */
    byte[] mo24731O();

    /* renamed from: Q */
    boolean mo24734Q();

    /* renamed from: Q0 */
    short mo24735Q0();

    /* renamed from: T0 */
    long mo24737T0(C9852q qVar);

    /* renamed from: Z */
    long mo24739Z();

    /* renamed from: a0 */
    String mo24741a0(long j);

    /* renamed from: a1 */
    void mo24742a1(long j);

    /* renamed from: d1 */
    long mo24748d1(byte b);

    /* renamed from: e1 */
    long mo24749e1();

    /* renamed from: f1 */
    InputStream mo24752f1();

    byte readByte();

    void readFully(byte[] bArr);

    int readInt();

    short readShort();

    void skip(long j);

    /* renamed from: w */
    ByteString mo24789w(long j);
}
