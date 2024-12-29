package p164h.p211a.p212a.p217d.p219v;

import java.nio.ByteBuffer;
import p164h.p211a.p212a.p217d.C10938k;

/* renamed from: h.a.a.d.v.d */
public class C10957d extends C10938k implements C10958e {

    /* renamed from: m */
    protected final ByteBuffer f21364m;

    public C10957d(int i) {
        super(i, 2, false);
        ByteBuffer wrap = ByteBuffer.wrap(this.f21323l);
        this.f21364m = wrap;
        wrap.position(0);
        ByteBuffer byteBuffer = this.f21364m;
        byteBuffer.limit(byteBuffer.capacity());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10957d(ByteBuffer byteBuffer, boolean z) {
        super(byteBuffer.array(), 0, 0, z ? 0 : 2, false);
        if (!byteBuffer.isDirect()) {
            this.f21364m = byteBuffer;
            this.f21292c = byteBuffer.position();
            this.f21293d = byteBuffer.limit();
            byteBuffer.position(0);
            byteBuffer.limit(byteBuffer.capacity());
            return;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: z0 */
    public ByteBuffer mo34672z0() {
        return this.f21364m;
    }
}
