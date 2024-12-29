package p229x5;

import java.nio.ByteBuffer;
import p225w5.C11946h;

/* renamed from: x5.d */
public class C11986d extends C11946h implements C11987e {

    /* renamed from: m */
    protected final ByteBuffer f21896m;

    public C11986d(int i) {
        super(i, 2, false);
        ByteBuffer wrap = ByteBuffer.wrap(this.f21832l);
        this.f21896m = wrap;
        wrap.position(0);
        wrap.limit(wrap.capacity());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11986d(ByteBuffer byteBuffer, boolean z) {
        super(byteBuffer.array(), 0, 0, z ? 0 : 2, false);
        if (!byteBuffer.isDirect()) {
            this.f21896m = byteBuffer;
            this.f21811c = byteBuffer.position();
            this.f21812d = byteBuffer.limit();
            byteBuffer.position(0);
            byteBuffer.limit(byteBuffer.capacity());
            return;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: A0 */
    public ByteBuffer mo42558A0() {
        return this.f21896m;
    }
}
