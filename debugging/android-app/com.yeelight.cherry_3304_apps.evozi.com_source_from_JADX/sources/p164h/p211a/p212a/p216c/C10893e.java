package p164h.p211a.p212a.p216c;

import com.miot.service.common.miotcloud.impl.MiotCloudImpl;
import p164h.p211a.p212a.p217d.C10935i;
import p164h.p211a.p212a.p217d.C10937j;
import p164h.p211a.p212a.p228h.p233x.C11145a;

/* renamed from: h.a.a.c.e */
public class C10893e extends C11145a implements C10892d {

    /* renamed from: e */
    private int f21083e = 16384;

    /* renamed from: f */
    private int f21084f = 6144;

    /* renamed from: g */
    private int f21085g = 32768;

    /* renamed from: h */
    private int f21086h = 6144;

    /* renamed from: i */
    private int f21087i = 1024;

    /* renamed from: j */
    private C10935i.C10936a f21088j;

    /* renamed from: k */
    private C10935i.C10936a f21089k;

    /* renamed from: l */
    private C10935i.C10936a f21090l;

    /* renamed from: m */
    private C10935i.C10936a f21091m;

    /* renamed from: n */
    private C10935i f21092n;

    /* renamed from: o */
    private C10935i f21093o;

    public C10893e() {
        C10935i.C10936a aVar = C10935i.C10936a.BYTE_ARRAY;
        this.f21088j = aVar;
        this.f21089k = aVar;
        this.f21090l = aVar;
        this.f21091m = aVar;
    }

    /* renamed from: A0 */
    public void mo34433A0(C10935i.C10936a aVar) {
        this.f21089k = aVar;
    }

    /* renamed from: B0 */
    public void mo34434B0(C10935i.C10936a aVar) {
        this.f21090l = aVar;
    }

    /* renamed from: C0 */
    public void mo34435C0(C10935i.C10936a aVar) {
        this.f21091m = aVar;
    }

    /* renamed from: W */
    public C10935i mo34245W() {
        return this.f21093o;
    }

    /* renamed from: m0 */
    public C10935i mo34261m0() {
        return this.f21092n;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p0 */
    public void mo34262p0() {
        C10935i.C10936a aVar = this.f21089k;
        int i = this.f21084f;
        C10935i.C10936a aVar2 = this.f21088j;
        this.f21092n = C10937j.m27678a(aVar, i, aVar2, this.f21083e, aVar2, mo34437y0());
        C10935i.C10936a aVar3 = this.f21091m;
        int i2 = this.f21086h;
        C10935i.C10936a aVar4 = this.f21090l;
        this.f21093o = C10937j.m27678a(aVar3, i2, aVar4, this.f21085g, aVar4, mo34437y0());
        super.mo34262p0();
    }

    /* access modifiers changed from: protected */
    /* renamed from: q0 */
    public void mo34263q0() {
        this.f21092n = null;
        this.f21093o = null;
    }

    public String toString() {
        return this.f21092n + MiotCloudImpl.COOKIE_PATH + this.f21093o;
    }

    /* renamed from: y0 */
    public int mo34437y0() {
        return this.f21087i;
    }

    /* renamed from: z0 */
    public void mo34438z0(C10935i.C10936a aVar) {
        this.f21088j = aVar;
    }
}
