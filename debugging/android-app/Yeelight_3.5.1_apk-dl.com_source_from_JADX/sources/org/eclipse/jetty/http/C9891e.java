package org.eclipse.jetty.http;

import com.miot.service.common.miotcloud.impl.MiotCloudImpl;
import org.eclipse.jetty.p195io.Buffers;
import org.eclipse.jetty.p195io.C9920b;
import p147d6.C8941a;

/* renamed from: org.eclipse.jetty.http.e */
public class C9891e extends C8941a implements C9890d {

    /* renamed from: e */
    private int f18010e = 16384;

    /* renamed from: f */
    private int f18011f = 6144;

    /* renamed from: g */
    private int f18012g = 32768;

    /* renamed from: h */
    private int f18013h = 6144;

    /* renamed from: i */
    private int f18014i = 1024;

    /* renamed from: j */
    private Buffers.Type f18015j;

    /* renamed from: k */
    private Buffers.Type f18016k;

    /* renamed from: l */
    private Buffers.Type f18017l;

    /* renamed from: m */
    private Buffers.Type f18018m;

    /* renamed from: n */
    private Buffers f18019n;

    /* renamed from: o */
    private Buffers f18020o;

    public C9891e() {
        Buffers.Type type = Buffers.Type.BYTE_ARRAY;
        this.f18015j = type;
        this.f18016k = type;
        this.f18017l = type;
        this.f18018m = type;
    }

    /* renamed from: D0 */
    public int mo39754D0() {
        return this.f18014i;
    }

    /* renamed from: E0 */
    public void mo39755E0(Buffers.Type type) {
        this.f18015j = type;
    }

    /* renamed from: F0 */
    public void mo39756F0(Buffers.Type type) {
        this.f18016k = type;
    }

    /* renamed from: G0 */
    public void mo39757G0(Buffers.Type type) {
        this.f18017l = type;
    }

    /* renamed from: H0 */
    public void mo39758H0(Buffers.Type type) {
        this.f18018m = type;
    }

    /* renamed from: X */
    public Buffers mo39572X() {
        return this.f18020o;
    }

    /* renamed from: r0 */
    public Buffers mo39592r0() {
        return this.f18019n;
    }

    public String toString() {
        return this.f18019n + MiotCloudImpl.COOKIE_PATH + this.f18020o;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u0 */
    public void mo26547u0() {
        Buffers.Type type = this.f18016k;
        int i = this.f18011f;
        Buffers.Type type2 = this.f18015j;
        this.f18019n = C9920b.m24301a(type, i, type2, this.f18010e, type2, mo39754D0());
        Buffers.Type type3 = this.f18018m;
        int i2 = this.f18013h;
        Buffers.Type type4 = this.f18017l;
        this.f18020o = C9920b.m24301a(type3, i2, type4, this.f18012g, type4, mo39754D0());
        super.mo26547u0();
    }

    /* access modifiers changed from: protected */
    /* renamed from: v0 */
    public void mo26548v0() {
        this.f18019n = null;
        this.f18020o = null;
    }
}
