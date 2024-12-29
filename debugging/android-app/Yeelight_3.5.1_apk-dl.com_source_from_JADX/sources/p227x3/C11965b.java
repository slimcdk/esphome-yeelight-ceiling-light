package p227x3;

import com.yeelight.yeelib.managers.C3064h;

/* renamed from: x3.b */
public class C11965b extends C11964a {

    /* renamed from: g */
    private int f21858g = -1;

    /* renamed from: e */
    public int mo42523e() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C11965b)) {
            return false;
        }
        C11965b bVar = (C11965b) obj;
        return bVar.mo42510b() == mo42510b() && bVar.mo42517n() == mo42517n() && bVar.mo42527u() == mo42527u();
    }

    /* renamed from: f */
    public String mo42525f() {
        return "";
    }

    /* renamed from: g */
    public boolean mo42513g() {
        return mo42529w();
    }

    /* renamed from: j */
    public void mo42526j(int i) {
    }

    /* renamed from: u */
    public int mo42527u() {
        return this.f21858g;
    }

    /* renamed from: v */
    public boolean mo42528v() {
        StringBuilder sb = new StringBuilder();
        sb.append("2541 version: ");
        sb.append(this.f21858g);
        C3064h.C3068c cVar = (C3064h.C3068c) C3064h.m7982j().mo23393m("yeelink.light.ble1");
        return (cVar == null || this.f21858g == -1 || cVar.mo23416l() <= this.f21858g) ? false : true;
    }

    /* renamed from: w */
    public boolean mo42529w() {
        return mo42528v() || mo42530x();
    }

    /* renamed from: x */
    public boolean mo42530x() {
        int a;
        StringBuilder sb = new StringBuilder();
        sb.append("mcu version: ");
        sb.append(mo42510b());
        C3064h.C3068c cVar = (C3064h.C3068c) C3064h.m7982j().mo23393m("yeelink.light.ble1");
        if (cVar == null || mo42510b() == -1 || (a = cVar.mo23418a()) <= mo42510b()) {
            return false;
        }
        mo42522s(a);
        return true;
    }

    /* renamed from: y */
    public void mo42531y(int i) {
        this.f21858g = i;
    }
}
