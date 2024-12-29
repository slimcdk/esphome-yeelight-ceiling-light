package p011c.p012a.p053e.p073y.p076d;

import p011c.p012a.p053e.p073y.p074b.C0958f;
import p011c.p012a.p053e.p073y.p074b.C0960h;
import p011c.p012a.p053e.p073y.p074b.C0962j;

/* renamed from: c.a.e.y.d.f */
public final class C0980f {

    /* renamed from: a */
    private C0960h f1171a;

    /* renamed from: b */
    private C0958f f1172b;

    /* renamed from: c */
    private C0962j f1173c;

    /* renamed from: d */
    private int f1174d = -1;

    /* renamed from: e */
    private C0975b f1175e;

    /* renamed from: b */
    public static boolean m1853b(int i) {
        return i >= 0 && i < 8;
    }

    /* renamed from: a */
    public C0975b mo9362a() {
        return this.f1175e;
    }

    /* renamed from: c */
    public void mo9363c(C0958f fVar) {
        this.f1172b = fVar;
    }

    /* renamed from: d */
    public void mo9364d(int i) {
        this.f1174d = i;
    }

    /* renamed from: e */
    public void mo9365e(C0975b bVar) {
        this.f1175e = bVar;
    }

    /* renamed from: f */
    public void mo9366f(C0960h hVar) {
        this.f1171a = hVar;
    }

    /* renamed from: g */
    public void mo9367g(C0962j jVar) {
        this.f1173c = jVar;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(200);
        sb.append("<<\n");
        sb.append(" mode: ");
        sb.append(this.f1171a);
        sb.append("\n ecLevel: ");
        sb.append(this.f1172b);
        sb.append("\n version: ");
        sb.append(this.f1173c);
        sb.append("\n maskPattern: ");
        sb.append(this.f1174d);
        if (this.f1175e == null) {
            sb.append("\n matrix: null\n");
        } else {
            sb.append("\n matrix:\n");
            sb.append(this.f1175e);
        }
        sb.append(">>\n");
        return sb.toString();
    }
}
