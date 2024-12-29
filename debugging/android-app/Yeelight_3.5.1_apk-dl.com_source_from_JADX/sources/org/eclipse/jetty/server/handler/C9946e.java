package org.eclipse.jetty.server.handler;

import com.miot.service.common.miotcloud.impl.MiotCloudImpl;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.C9277a;
import javax.servlet.http.C9279c;
import org.apache.commons.p194io.IOUtils;
import org.eclipse.jetty.http.PathMap;
import org.eclipse.jetty.util.LazyList;
import p152e6.C9001b;
import p152e6.C9003c;
import p239z5.C12156c;
import p239z5.C12175i;
import p239z5.C12176j;
import p239z5.C12181o;

/* renamed from: org.eclipse.jetty.server.handler.e */
public class C9946e extends C9948g {

    /* renamed from: n */
    private static final C9003c f18254n = C9001b.m21450a(C9946e.class);

    /* renamed from: m */
    private volatile PathMap f18255m;

    public C9946e() {
        super(true);
    }

    /* renamed from: V0 */
    private String m24466V0(String str) {
        if (str == null) {
            return null;
        }
        return str.endsWith(".") ? str.substring(0, str.length() - 1) : str;
    }

    /* renamed from: T0 */
    public void mo39970T0(C12175i[] iVarArr) {
        this.f18255m = null;
        super.mo39970T0(iVarArr);
        if (mo36748n0()) {
            mo39971U0();
        }
    }

    /* renamed from: U0 */
    public void mo39971U0() {
        C12175i[] iVarArr;
        Map map;
        PathMap pathMap = new PathMap();
        C12175i[] o = mo39981o();
        int i = 0;
        while (o != null && i < o.length) {
            if (o[i] instanceof C9943d) {
                iVarArr = new C12175i[]{o[i]};
            } else if (o[i] instanceof C12176j) {
                iVarArr = ((C12176j) o[i]).mo39921P(C9943d.class);
            } else {
                continue;
                i++;
            }
            for (C12175i iVar : iVarArr) {
                C9943d dVar = (C9943d) iVar;
                String l1 = dVar.mo39942l1();
                if (l1 == null || l1.indexOf(44) >= 0 || l1.startsWith("*")) {
                    throw new IllegalArgumentException("Illegal context spec:" + l1);
                }
                if (!l1.startsWith(MiotCloudImpl.COOKIE_PATH)) {
                    l1 = IOUtils.DIR_SEPARATOR_UNIX + l1;
                }
                if (l1.length() > 1) {
                    if (l1.endsWith(MiotCloudImpl.COOKIE_PATH)) {
                        l1 = l1 + "*";
                    } else if (!l1.endsWith("/*")) {
                        l1 = l1 + "/*";
                    }
                }
                Object obj = pathMap.get(l1);
                String[] w1 = dVar.mo39953w1();
                if (w1 != null && w1.length > 0) {
                    if (obj instanceof Map) {
                        map = (Map) obj;
                    } else {
                        HashMap hashMap = new HashMap();
                        hashMap.put("*", obj);
                        pathMap.put(l1, hashMap);
                        map = hashMap;
                    }
                    for (String str : w1) {
                        map.put(str, LazyList.add(map.get(str), o[i]));
                    }
                } else if (obj instanceof Map) {
                    Map map2 = (Map) obj;
                    map2.put("*", LazyList.add(map2.get("*"), o[i]));
                } else {
                    pathMap.put(l1, LazyList.add(obj, o[i]));
                }
            }
            continue;
            i++;
        }
        this.f18255m = pathMap;
    }

    /* renamed from: q */
    public void mo39972q(String str, C12181o oVar, C9277a aVar, C9279c cVar) {
        C9943d n;
        C12175i[] o = mo39981o();
        if (o != null && o.length != 0) {
            C12156c z = oVar.mo43129z();
            if (!z.mo43018r() || (n = z.mo43014n()) == null) {
                PathMap pathMap = this.f18255m;
                int i = 0;
                if (pathMap == null || str == null || !str.startsWith(MiotCloudImpl.COOKIE_PATH)) {
                    while (i < o.length) {
                        o[i].mo39972q(str, oVar, aVar, cVar);
                        if (!oVar.mo43100Z()) {
                            i++;
                        } else {
                            return;
                        }
                    }
                    return;
                }
                Object lazyMatches = pathMap.getLazyMatches(str);
                for (int i2 = 0; i2 < LazyList.size(lazyMatches); i2++) {
                    Object value = ((Map.Entry) LazyList.get(lazyMatches, i2)).getValue();
                    if (value instanceof Map) {
                        Map map = (Map) value;
                        String V0 = m24466V0(aVar.mo41952q());
                        Object obj = map.get(V0);
                        int i3 = 0;
                        while (i3 < LazyList.size(obj)) {
                            ((C12175i) LazyList.get(obj, i3)).mo39972q(str, oVar, aVar, cVar);
                            if (!oVar.mo43100Z()) {
                                i3++;
                            } else {
                                return;
                            }
                        }
                        Object obj2 = map.get("*." + V0.substring(V0.indexOf(".") + 1));
                        int i4 = 0;
                        while (i4 < LazyList.size(obj2)) {
                            ((C12175i) LazyList.get(obj2, i4)).mo39972q(str, oVar, aVar, cVar);
                            if (!oVar.mo43100Z()) {
                                i4++;
                            } else {
                                return;
                            }
                        }
                        Object obj3 = map.get("*");
                        int i5 = 0;
                        while (i5 < LazyList.size(obj3)) {
                            ((C12175i) LazyList.get(obj3, i5)).mo39972q(str, oVar, aVar, cVar);
                            if (!oVar.mo43100Z()) {
                                i5++;
                            } else {
                                return;
                            }
                        }
                        continue;
                    } else {
                        int i6 = 0;
                        while (i6 < LazyList.size(value)) {
                            ((C12175i) LazyList.get(value, i6)).mo39972q(str, oVar, aVar, cVar);
                            if (!oVar.mo43100Z()) {
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
            n.mo39972q(str, oVar, aVar, cVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u0 */
    public void mo26547u0() {
        mo39971U0();
        super.mo26547u0();
    }
}
