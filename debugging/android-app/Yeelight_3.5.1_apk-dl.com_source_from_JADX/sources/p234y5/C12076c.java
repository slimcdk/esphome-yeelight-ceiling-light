package p234y5;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import org.eclipse.jetty.http.PathMap;
import org.eclipse.jetty.security.UserDataConstraint;
import org.eclipse.jetty.util.C9996o;
import org.eclipse.jetty.util.StringMap;
import p147d6.C8942b;
import p239z5.C12151b;
import p239z5.C12170f;
import p239z5.C12181o;
import p239z5.C12186q;
import p239z5.C12193w;

/* renamed from: y5.c */
public class C12076c extends C12084k {

    /* renamed from: v */
    private final List<C12075b> f22120v = new CopyOnWriteArrayList();

    /* renamed from: w */
    private final Set<String> f22121w = new CopyOnWriteArraySet();

    /* renamed from: x */
    private final PathMap f22122x = new PathMap();

    /* renamed from: y */
    private boolean f22123y = true;

    /* access modifiers changed from: protected */
    /* renamed from: U0 */
    public boolean mo42748U0(String str, C12181o oVar, C12186q qVar, Object obj) {
        if (obj == null) {
            return true;
        }
        C12081h hVar = (C12081h) obj;
        if (hVar.mo42773g()) {
            return false;
        }
        UserDataConstraint d = hVar.mo42770d();
        if (d == null || d == UserDataConstraint.None) {
            return true;
        }
        C12170f n = C12151b.m31593o().mo42987n();
        if (d == UserDataConstraint.Integral) {
            if (n.mo42954k(oVar)) {
                return true;
            }
            if (n.mo42928T() > 0) {
                String str2 = n.mo42952j0() + "://" + oVar.mo41952q() + Constants.COLON_SEPARATOR + n.mo42928T() + oVar.mo37774w();
                if (oVar.mo37773u() != null) {
                    str2 = str2 + "?" + oVar.mo37773u();
                }
                qVar.mo37798n(0);
                qVar.mo37783q(str2);
            } else {
                qVar.mo37776d(TypedValues.CycleType.TYPE_ALPHA, "!Integral");
            }
            oVar.mo43115o0(true);
            return false;
        } else if (d != UserDataConstraint.Confidential) {
            throw new IllegalArgumentException("Invalid dataConstraint value: " + d);
        } else if (n.mo42920K(oVar)) {
            return true;
        } else {
            if (n.mo42915B() > 0) {
                String str3 = n.mo42926S() + "://" + oVar.mo41952q() + Constants.COLON_SEPARATOR + n.mo42915B() + oVar.mo37774w();
                if (oVar.mo37773u() != null) {
                    str3 = str3 + "?" + oVar.mo37773u();
                }
                qVar.mo37798n(0);
                qVar.mo37783q(str3);
            } else {
                qVar.mo37776d(TypedValues.CycleType.TYPE_ALPHA, "!Confidential");
            }
            oVar.mo43115o0(true);
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: V0 */
    public boolean mo42749V0(String str, C12181o oVar, C12186q qVar, Object obj, C12193w wVar) {
        if (obj == null) {
            return true;
        }
        C12081h hVar = (C12081h) obj;
        if (!hVar.mo42772f()) {
            return true;
        }
        if (hVar.mo42771e() && oVar.mo43067B() != null) {
            return true;
        }
        for (String a : hVar.mo42769c()) {
            if (wVar.mo43186a(a, (C12193w.C12194a) null)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b1 */
    public boolean mo42750b1(C12181o oVar, C12186q qVar, Object obj) {
        if (obj == null) {
            return false;
        }
        return ((C12081h) obj).mo42772f();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d1 */
    public Object mo42751d1(String str, C12181o oVar) {
        Map map = (Map) this.f22122x.match(str);
        if (map == null) {
            return null;
        }
        String l = oVar.mo37767l();
        C12081h hVar = (C12081h) map.get(l);
        if (hVar != null) {
            return hVar;
        }
        ArrayList<C12081h> arrayList = new ArrayList<>();
        C12081h hVar2 = (C12081h) map.get((Object) null);
        if (hVar2 != null) {
            arrayList.add(hVar2);
        }
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null && ((String) entry.getKey()).contains(".omission")) {
                if (!(l + ".omission").equals(entry.getKey())) {
                    arrayList.add(entry.getValue());
                }
            }
        }
        if (arrayList.size() == 1) {
            return (C12081h) arrayList.get(0);
        }
        C12081h hVar3 = new C12081h();
        hVar3.mo42777k(UserDataConstraint.None);
        for (C12081h b : arrayList) {
            hVar3.mo42768b(b);
        }
        return hVar3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f1 */
    public void mo42752f1(C12081h hVar, C12075b bVar) {
        hVar.mo42776j(bVar.mo42744a().isForbidden());
        hVar.mo42777k(UserDataConstraint.get(bVar.mo42744a().getDataConstraint()));
        if (!hVar.mo42773g()) {
            hVar.mo42775i(bVar.mo42744a().getAuthenticate());
            if (!hVar.mo42772f()) {
                return;
            }
            if (!bVar.mo42744a().isAnyRole()) {
                String[] roles = bVar.mo42744a().getRoles();
                int length = roles.length;
                int i = 0;
                while (i < length) {
                    String str = roles[i];
                    if (!this.f22123y || this.f22121w.contains(str)) {
                        hVar.mo42767a(str);
                        i++;
                    } else {
                        throw new IllegalArgumentException("Attempt to use undeclared role: " + str + ", known roles: " + this.f22121w);
                    }
                }
            } else if (this.f22123y) {
                for (String a : this.f22121w) {
                    hVar.mo42767a(a);
                }
            } else {
                hVar.mo42774h(true);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public void mo42753g1(C12075b bVar) {
        Map map = (Map) this.f22122x.get(bVar.mo42747d());
        if (map == null) {
            map = new StringMap();
            this.f22122x.put(bVar.mo42747d(), map);
        }
        C12081h hVar = (C12081h) map.get((Object) null);
        if (hVar != null && hVar.mo42773g()) {
            return;
        }
        if (bVar.mo42746c() == null || bVar.mo42746c().length <= 0) {
            String b = bVar.mo42745b();
            C12081h hVar2 = (C12081h) map.get(b);
            if (hVar2 == null) {
                hVar2 = new C12081h();
                map.put(b, hVar2);
                if (hVar != null) {
                    hVar2.mo42768b(hVar);
                }
            }
            if (!hVar2.mo42773g()) {
                mo42752f1(hVar2, bVar);
                if (hVar2.mo42773g()) {
                    if (b == null) {
                        map.clear();
                        map.put((Object) null, hVar2);
                    }
                } else if (b == null) {
                    for (Map.Entry entry : map.entrySet()) {
                        if (entry.getKey() != null) {
                            ((C12081h) entry.getValue()).mo42768b(hVar2);
                        }
                    }
                }
            }
        } else {
            mo42754h1(bVar, map);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h1 */
    public void mo42754h1(C12075b bVar, Map<String, C12081h> map) {
        for (String str : bVar.mo42746c()) {
            C12081h hVar = map.get(str + ".omission");
            if (hVar == null) {
                hVar = new C12081h();
                map.put(str + ".omission", hVar);
            }
            mo42752f1(hVar, bVar);
        }
    }

    /* renamed from: p0 */
    public void mo26544p0(Appendable appendable, String str) {
        mo36757J0(appendable);
        C8942b.m21357G0(appendable, str, Collections.singleton(mo42738F()), Collections.singleton(mo42741h()), Collections.singleton(mo42783Y0()), Collections.singleton(this.f22121w), this.f22122x.entrySet(), mo36759L0(), C9996o.m24714a(mo39981o()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: u0 */
    public void mo26547u0() {
        this.f22122x.clear();
        List<C12075b> list = this.f22120v;
        if (list != null) {
            for (C12075b g1 : list) {
                mo42753g1(g1);
            }
        }
        super.mo26547u0();
    }

    /* access modifiers changed from: protected */
    /* renamed from: v0 */
    public void mo26548v0() {
        this.f22122x.clear();
        this.f22120v.clear();
        this.f22121w.clear();
        super.mo26548v0();
    }
}
