package com.yeelight.yeelib.p150c.p184n;

import android.graphics.Color;
import androidx.core.internal.view.SupportMenu;
import com.yeelight.yeelib.p150c.p151i.C6024e;
import com.yeelight.yeelib.p153g.C9827a;
import com.yeelight.yeelib.utils.C10542f;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yeelight.yeelib.c.n.g */
public class C7556g {

    /* renamed from: a */
    private boolean f15213a;

    /* renamed from: b */
    private C6024e.C6028d f15214b;

    /* renamed from: c */
    private int f15215c;

    /* renamed from: d */
    private int f15216d;

    /* renamed from: e */
    private int f15217e;

    /* renamed from: f */
    private int f15218f;

    /* renamed from: g */
    private boolean f15219g;

    /* renamed from: h */
    private int f15220h;

    /* renamed from: i */
    private List<C7557a> f15221i;

    /* renamed from: j */
    private C9827a f15222j;

    /* renamed from: k */
    private C9827a f15223k;

    /* renamed from: l */
    private int f15224l;

    /* renamed from: m */
    private int f15225m;

    /* renamed from: com.yeelight.yeelib.c.n.g$a */
    public static class C7557a {

        /* renamed from: a */
        int f15226a;

        /* renamed from: b */
        int f15227b;

        public C7557a(int i, int i2) {
            this.f15226a = i;
            this.f15227b = i2;
        }

        /* renamed from: a */
        public int mo28914a() {
            return this.f15226a;
        }

        /* renamed from: b */
        public int mo28915b() {
            return this.f15227b;
        }

        /* renamed from: c */
        public void mo28916c(int i) {
            this.f15226a = i;
        }

        /* renamed from: d */
        public void mo28917d(int i) {
            this.f15227b = i;
        }
    }

    public C7556g(boolean z, C6024e.C6028d dVar, int i, int i2, int i3) {
        this(z, dVar, i, i2, i3, 0, 0);
    }

    public C7556g(boolean z, C6024e.C6028d dVar, int i, int i2, int i3, int i4, int i5) {
        this.f15220h = 0;
        this.f15221i = new ArrayList();
        this.f15223k = C9827a.m23896e();
        i = (i < 0 || i > 100) ? 100 : i;
        i2 = (i2 < 1700 || i2 > 6500) ? 4000 : i2;
        this.f15213a = z;
        this.f15214b = dVar;
        this.f15215c = i;
        this.f15217e = i2;
        this.f15218f = i3;
        this.f15224l = i4;
        this.f15225m = i5;
    }

    /* renamed from: f */
    public static C7556g m22261f() {
        return new C7556g(false, C6024e.C6028d.DEVICE_MODE_SUNSHINE, 100, 4000, SupportMenu.CATEGORY_MASK);
    }

    /* renamed from: A */
    public void mo28887A(int i) {
        this.f15225m = i;
    }

    /* renamed from: a */
    public int mo28888a() {
        return this.f15215c;
    }

    /* renamed from: b */
    public int mo28889b() {
        if (this.f15214b != C6024e.C6028d.DEVICE_MODE_COLOR_HSV) {
            return this.f15218f;
        }
        return Color.HSVToColor(new float[]{(float) this.f15224l, (float) this.f15225m, C10542f.m25732a(this.f15215c)});
    }

    /* renamed from: c */
    public List<C7557a> mo28890c() {
        return this.f15221i;
    }

    /* renamed from: d */
    public C9827a mo28891d() {
        return this.f15223k;
    }

    /* renamed from: e */
    public int mo28892e() {
        return this.f15217e;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C7556g)) {
            return false;
        }
        C7556g gVar = (C7556g) obj;
        if (mo28897j() != gVar.mo28897j() || Math.abs(mo28888a() - gVar.mo28888a()) > 3 || Math.abs(mo28892e() - gVar.mo28892e()) > 3) {
            return false;
        }
        if ((mo28901n() && !gVar.mo28901n()) || (!mo28901n() && gVar.mo28901n())) {
            return false;
        }
        if ((mo28900m() && !gVar.mo28900m()) || ((!mo28900m() && gVar.mo28900m()) || mo28890c().size() != gVar.mo28890c().size())) {
            return false;
        }
        for (int i = 0; i < mo28890c().size(); i++) {
            if (mo28890c().get(i).mo28914a() != gVar.mo28890c().get(i).mo28914a() || mo28890c().get(i).mo28915b() != gVar.mo28890c().get(i).mo28915b()) {
                return false;
            }
        }
        return this.f15218f == 0 || mo28889b() == gVar.mo28889b();
    }

    /* renamed from: g */
    public C9827a mo28894g() {
        return this.f15222j;
    }

    /* renamed from: h */
    public int mo28895h() {
        return this.f15224l;
    }

    /* renamed from: i */
    public int mo28896i() {
        return this.f15220h;
    }

    /* renamed from: j */
    public C6024e.C6028d mo28897j() {
        return this.f15214b;
    }

    /* renamed from: k */
    public int mo28898k() {
        return this.f15216d;
    }

    /* renamed from: l */
    public int mo28899l() {
        return this.f15225m;
    }

    /* renamed from: m */
    public boolean mo28900m() {
        return this.f15219g;
    }

    /* renamed from: n */
    public boolean mo28901n() {
        return this.f15213a;
    }

    /* renamed from: o */
    public void mo28902o(int i) {
        this.f15215c = i;
    }

    /* renamed from: p */
    public void mo28903p(int i) {
        this.f15218f = i;
    }

    /* renamed from: q */
    public void mo28904q(List<C7557a> list) {
        this.f15221i.clear();
        this.f15221i.addAll(list);
    }

    /* renamed from: r */
    public void mo28905r(C9827a aVar) {
        this.f15223k = aVar;
    }

    /* renamed from: s */
    public void mo28906s(int i) {
        this.f15217e = i;
    }

    /* renamed from: t */
    public void mo28907t(C9827a aVar) {
        this.f15222j = aVar;
    }

    /* renamed from: u */
    public void mo28908u(boolean z) {
        this.f15219g = z;
    }

    /* renamed from: v */
    public void mo28909v(int i) {
        this.f15224l = i;
    }

    /* renamed from: w */
    public void mo28910w(int i) {
        this.f15220h = i;
    }

    /* renamed from: x */
    public void mo28911x(C6024e.C6028d dVar) {
        this.f15214b = dVar;
    }

    /* renamed from: y */
    public void mo28912y(int i) {
        this.f15216d = i;
    }

    /* renamed from: z */
    public void mo28913z(boolean z) {
        this.f15213a = z;
    }
}
