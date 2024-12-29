package p164h.p211a.p212a.p222f.p224w;

import com.miot.service.common.miotcloud.impl.MiotCloudImpl;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.p271io.IOUtils;
import p154d.p155b.p204f0.C10709c;
import p154d.p155b.p204f0.C10711e;
import p164h.p211a.p212a.p216c.C10922v;
import p164h.p211a.p212a.p222f.C11015c;
import p164h.p211a.p212a.p222f.C11032i;
import p164h.p211a.p212a.p222f.C11033j;
import p164h.p211a.p212a.p222f.C11037n;
import p164h.p211a.p212a.p228h.C11126j;
import p164h.p211a.p212a.p228h.p234y.C11156b;

/* renamed from: h.a.a.f.w.d */
public class C11055d extends C11057f {

    /* renamed from: m */
    private volatile C10922v f21741m;

    static {
        C11156b.m29015a(C11055d.class);
    }

    public C11055d() {
        super(true);
    }

    /* renamed from: Q0 */
    private String m28502Q0(String str) {
        if (str == null) {
            return null;
        }
        return str.endsWith(".") ? str.substring(0, str.length() - 1) : str;
    }

    /* renamed from: L */
    public void mo34757L(String str, C11037n nVar, C10709c cVar, C10711e eVar) {
        C11052c k;
        C11032i[] n = mo34903n();
        if (n != null && n.length != 0) {
            C11015c y = nVar.mo34982y();
            if (!y.mo34869o() || (k = y.mo34865k()) == null) {
                C10922v vVar = this.f21741m;
                int i = 0;
                if (vVar == null || str == null || !str.startsWith(MiotCloudImpl.COOKIE_PATH)) {
                    while (i < n.length) {
                        n[i].mo34757L(str, nVar, cVar, eVar);
                        if (!nVar.mo34954Z()) {
                            i++;
                        } else {
                            return;
                        }
                    }
                    return;
                }
                Object a = vVar.mo34540a(str);
                for (int i2 = 0; i2 < C11126j.m28890q(a); i2++) {
                    Object value = ((Map.Entry) C11126j.m28884j(a, i2)).getValue();
                    if (value instanceof Map) {
                        Map map = (Map) value;
                        String Q0 = m28502Q0(cVar.mo33972q());
                        Object obj = map.get(Q0);
                        int i3 = 0;
                        while (i3 < C11126j.m28890q(obj)) {
                            ((C11032i) C11126j.m28884j(obj, i3)).mo34757L(str, nVar, cVar, eVar);
                            if (!nVar.mo34954Z()) {
                                i3++;
                            } else {
                                return;
                            }
                        }
                        Object obj2 = map.get("*." + Q0.substring(Q0.indexOf(".") + 1));
                        int i4 = 0;
                        while (i4 < C11126j.m28890q(obj2)) {
                            ((C11032i) C11126j.m28884j(obj2, i4)).mo34757L(str, nVar, cVar, eVar);
                            if (!nVar.mo34954Z()) {
                                i4++;
                            } else {
                                return;
                            }
                        }
                        Object obj3 = map.get("*");
                        int i5 = 0;
                        while (i5 < C11126j.m28890q(obj3)) {
                            ((C11032i) C11126j.m28884j(obj3, i5)).mo34757L(str, nVar, cVar, eVar);
                            if (!nVar.mo34954Z()) {
                                i5++;
                            } else {
                                return;
                            }
                        }
                        continue;
                    } else {
                        int i6 = 0;
                        while (i6 < C11126j.m28890q(value)) {
                            ((C11032i) C11126j.m28884j(value, i6)).mo34757L(str, nVar, cVar, eVar);
                            if (!nVar.mo34954Z()) {
                                i6++;
                            } else {
                                return;
                            }
                        }
                        continue;
                    }
                }
                return;
            }
            k.mo34757L(str, nVar, cVar, eVar);
        }
    }

    /* renamed from: O0 */
    public void mo35086O0(C11032i[] iVarArr) {
        this.f21741m = null;
        super.mo35086O0(iVarArr);
        if (mo35452j0()) {
            mo35087P0();
        }
    }

    /* renamed from: P0 */
    public void mo35087P0() {
        C11032i[] iVarArr;
        Map map;
        C10922v vVar = new C10922v();
        C11032i[] n = mo34903n();
        int i = 0;
        while (n != null && i < n.length) {
            if (n[i] instanceof C11052c) {
                iVarArr = new C11032i[]{n[i]};
            } else if (n[i] instanceof C11033j) {
                iVarArr = ((C11033j) n[i]).mo34902O(C11052c.class);
            } else {
                continue;
                i++;
            }
            for (C11032i iVar : iVarArr) {
                C11052c cVar = (C11052c) iVar;
                String f1 = cVar.mo35062f1();
                if (f1 == null || f1.indexOf(44) >= 0 || f1.startsWith("*")) {
                    throw new IllegalArgumentException("Illegal context spec:" + f1);
                }
                if (!f1.startsWith(MiotCloudImpl.COOKIE_PATH)) {
                    f1 = IOUtils.DIR_SEPARATOR_UNIX + f1;
                }
                if (f1.length() > 1) {
                    if (f1.endsWith(MiotCloudImpl.COOKIE_PATH)) {
                        f1 = f1 + "*";
                    } else if (!f1.endsWith("/*")) {
                        f1 = f1 + "/*";
                    }
                }
                Object obj = vVar.get(f1);
                String[] o1 = cVar.mo35070o1();
                if (o1 != null && o1.length > 0) {
                    if (obj instanceof Map) {
                        map = (Map) obj;
                    } else {
                        HashMap hashMap = new HashMap();
                        hashMap.put("*", obj);
                        vVar.put(f1, hashMap);
                        map = hashMap;
                    }
                    for (String str : o1) {
                        map.put(str, C11126j.m28879b(map.get(str), n[i]));
                    }
                } else if (obj instanceof Map) {
                    Map map2 = (Map) obj;
                    map2.put("*", C11126j.m28879b(map2.get("*"), n[i]));
                } else {
                    vVar.put(f1, C11126j.m28879b(obj, n[i]));
                }
            }
            continue;
            i++;
        }
        this.f21741m = vVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p0 */
    public void mo34262p0() {
        mo35087P0();
        super.mo34262p0();
    }
}
