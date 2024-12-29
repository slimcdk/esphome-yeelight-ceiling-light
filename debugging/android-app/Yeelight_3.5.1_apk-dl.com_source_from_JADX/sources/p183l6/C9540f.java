package p183l6;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import org.fourthline.cling.model.meta.C10066a;
import org.fourthline.cling.model.meta.C10067b;
import org.fourthline.cling.model.meta.C10070e;
import org.fourthline.cling.model.meta.C10071f;
import org.fourthline.cling.model.types.C10097r;
import org.fourthline.cling.model.types.C10098s;

/* renamed from: l6.f */
public class C9540f {

    /* renamed from: a */
    public C10098s f17402a;

    /* renamed from: b */
    public C10097r f17403b;

    /* renamed from: c */
    public URI f17404c;

    /* renamed from: d */
    public URI f17405d;

    /* renamed from: e */
    public URI f17406e;

    /* renamed from: f */
    public List<C9535a> f17407f = new ArrayList();

    /* renamed from: g */
    public List<C9541g> f17408g = new ArrayList();

    /* renamed from: a */
    public C10070e mo38505a(C10067b bVar) {
        return bVar.mo40484B(this.f17402a, this.f17403b, this.f17404c, this.f17405d, this.f17406e, mo38506b(), mo38507c());
    }

    /* renamed from: b */
    public C10066a[] mo38506b() {
        C10066a[] aVarArr = new C10066a[this.f17407f.size()];
        int i = 0;
        for (C9535a a : this.f17407f) {
            aVarArr[i] = a.mo38494a();
            i++;
        }
        return aVarArr;
    }

    /* renamed from: c */
    public C10071f[] mo38507c() {
        C10071f[] fVarArr = new C10071f[this.f17408g.size()];
        int i = 0;
        for (C9541g a : this.f17408g) {
            fVarArr[i] = a.mo38508a();
            i++;
        }
        return fVarArr;
    }
}
