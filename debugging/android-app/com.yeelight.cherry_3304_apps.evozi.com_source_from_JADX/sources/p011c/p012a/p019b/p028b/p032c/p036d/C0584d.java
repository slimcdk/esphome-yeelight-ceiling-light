package p011c.p012a.p019b.p028b.p032c.p036d;

import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.C2425h;
import com.miot.service.connection.wifi.step.SmartConfigStep;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

@VisibleForTesting
/* renamed from: c.a.b.b.c.d.d */
public final class C0584d {
    /* renamed from: a */
    public static C0585e m361a(C2425h hVar) {
        C0586f fVar = new C0586f();
        ArrayList arrayList = new ArrayList();
        TreeSet treeSet = new TreeSet(hVar.mo13233c());
        C0587g[] gVarArr = new C0587g[treeSet.size()];
        Iterator it = treeSet.iterator();
        int i = 0;
        while (it.hasNext()) {
            String str = (String) it.next();
            Object a = hVar.mo13231a(str);
            gVarArr[i] = new C0587g();
            gVarArr[i].f239c = str;
            gVarArr[i].f240d = m362b(arrayList, a);
            i++;
        }
        fVar.f237c = gVarArr;
        return new C0585e(fVar, arrayList);
    }

    /* renamed from: b */
    private static C0588h m362b(List<Asset> list, Object obj) {
        int i;
        C0588h hVar = new C0588h();
        if (obj == null) {
            hVar.f242c = 14;
            return hVar;
        }
        C0589i iVar = new C0589i();
        hVar.f243d = iVar;
        if (obj instanceof String) {
            hVar.f242c = 2;
            iVar.f245d = (String) obj;
        } else if (obj instanceof Integer) {
            hVar.f242c = 6;
            iVar.f249h = ((Integer) obj).intValue();
        } else if (obj instanceof Long) {
            hVar.f242c = 5;
            iVar.f248g = ((Long) obj).longValue();
        } else if (obj instanceof Double) {
            hVar.f242c = 3;
            iVar.f246e = ((Double) obj).doubleValue();
        } else if (obj instanceof Float) {
            hVar.f242c = 4;
            iVar.f247f = ((Float) obj).floatValue();
        } else if (obj instanceof Boolean) {
            hVar.f242c = 8;
            iVar.f251j = ((Boolean) obj).booleanValue();
        } else if (obj instanceof Byte) {
            hVar.f242c = 7;
            iVar.f250i = ((Byte) obj).byteValue();
        } else if (obj instanceof byte[]) {
            hVar.f242c = 1;
            iVar.f244c = (byte[]) obj;
        } else if (obj instanceof String[]) {
            hVar.f242c = 11;
            iVar.f254m = (String[]) obj;
        } else if (obj instanceof long[]) {
            hVar.f242c = 12;
            iVar.f255n = (long[]) obj;
        } else if (obj instanceof float[]) {
            hVar.f242c = 15;
            iVar.f256o = (float[]) obj;
        } else if (obj instanceof Asset) {
            hVar.f242c = 13;
            list.add((Asset) obj);
            iVar.f257p = (long) (list.size() - 1);
        } else {
            int i2 = 0;
            if (obj instanceof C2425h) {
                hVar.f242c = 9;
                C2425h hVar2 = (C2425h) obj;
                TreeSet treeSet = new TreeSet(hVar2.mo13233c());
                C0587g[] gVarArr = new C0587g[treeSet.size()];
                Iterator it = treeSet.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    gVarArr[i2] = new C0587g();
                    gVarArr[i2].f239c = str;
                    gVarArr[i2].f240d = m362b(list, hVar2.mo13231a(str));
                    i2++;
                }
                hVar.f243d.f252k = gVarArr;
            } else if (obj instanceof ArrayList) {
                hVar.f242c = 10;
                ArrayList arrayList = (ArrayList) obj;
                C0588h[] hVarArr = new C0588h[arrayList.size()];
                Object obj2 = null;
                int size = arrayList.size();
                int i3 = 14;
                while (i2 < size) {
                    Object obj3 = arrayList.get(i2);
                    C0588h b = m362b(list, obj3);
                    int i4 = b.f242c;
                    if (i4 == 14 || i4 == 2 || i4 == 6 || i4 == 9) {
                        if (i3 == 14 && (i = b.f242c) != 14) {
                            obj2 = obj3;
                            i3 = i;
                        } else if (b.f242c != i3) {
                            String valueOf = String.valueOf(obj2.getClass());
                            String valueOf2 = String.valueOf(obj3.getClass());
                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 80 + String.valueOf(valueOf2).length());
                            sb.append("ArrayList elements must all be of the sameclass, but this one contains a ");
                            sb.append(valueOf);
                            sb.append(" and a ");
                            sb.append(valueOf2);
                            throw new IllegalArgumentException(sb.toString());
                        }
                        hVarArr[i2] = b;
                        i2++;
                    } else {
                        String valueOf3 = String.valueOf(obj3.getClass());
                        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf3).length() + 130);
                        sb2.append("The only ArrayList element types supported by DataBundleUtil are String, Integer, Bundle, and null, but this ArrayList contains a ");
                        sb2.append(valueOf3);
                        throw new IllegalArgumentException(sb2.toString());
                    }
                }
                hVar.f243d.f253l = hVarArr;
            } else {
                String valueOf4 = String.valueOf(obj.getClass().getSimpleName());
                throw new RuntimeException(valueOf4.length() != 0 ? "newFieldValueFromValue: unexpected value ".concat(valueOf4) : new String("newFieldValueFromValue: unexpected value "));
            }
        }
        return hVar;
    }

    /* renamed from: c */
    public static C2425h m363c(C0585e eVar) {
        C2425h hVar = new C2425h();
        for (C0587g gVar : eVar.f235a.f237c) {
            m364d(eVar.f236b, hVar, gVar.f239c, gVar.f240d);
        }
        return hVar;
    }

    /* renamed from: d */
    private static void m364d(List<Asset> list, C2425h hVar, String str, C0588h hVar2) {
        List<Asset> list2 = list;
        C2425h hVar3 = hVar;
        String str2 = str;
        C0588h hVar4 = hVar2;
        int i = hVar4.f242c;
        Object obj = null;
        int i2 = 14;
        if (i == 14) {
            hVar3.mo13250r(str2, (String) null);
            return;
        }
        C0589i iVar = hVar4.f243d;
        if (i == 1) {
            hVar3.mo13239h(str2, iVar.f244c);
        } else if (i == 11) {
            hVar3.mo13251s(str2, iVar.f254m);
        } else if (i == 12) {
            hVar3.mo13249q(str2, iVar.f255n);
        } else if (i == 15) {
            hVar3.mo13245m(str2, iVar.f256o);
        } else if (i == 2) {
            hVar3.mo13250r(str2, iVar.f245d);
        } else if (i == 3) {
            hVar3.mo13243k(str2, iVar.f246e);
        } else if (i == 4) {
            hVar3.mo13244l(str2, iVar.f247f);
        } else if (i == 5) {
            hVar3.mo13248p(str2, iVar.f248g);
        } else if (i == 6) {
            hVar3.mo13246n(str2, iVar.f249h);
        } else if (i == 7) {
            hVar3.mo13238g(str2, (byte) iVar.f250i);
        } else if (i == 8) {
            hVar3.mo13237f(str2, iVar.f251j);
        } else if (i != 13) {
            int i3 = 9;
            if (i == 9) {
                C2425h hVar5 = new C2425h();
                for (C0587g gVar : iVar.f252k) {
                    m364d(list2, hVar5, gVar.f239c, gVar.f240d);
                }
                hVar3.mo13241i(str2, hVar5);
            } else if (i == 10) {
                int i4 = 14;
                for (C0588h hVar6 : iVar.f253l) {
                    int i5 = hVar6.f242c;
                    if (i4 == 14) {
                        if (i5 == 9 || i5 == 2 || i5 == 6) {
                            i4 = hVar6.f242c;
                        } else if (i5 != 14) {
                            int i6 = hVar6.f242c;
                            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 48);
                            sb.append("Unexpected TypedValue type: ");
                            sb.append(i6);
                            sb.append(" for key ");
                            sb.append(str2);
                            throw new IllegalArgumentException(sb.toString());
                        }
                    } else if (i5 != i4) {
                        int i7 = hVar6.f242c;
                        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + SmartConfigStep.MSG_RESEND_LAP_BIND_DEVICE);
                        sb2.append("The ArrayList elements should all be the same type, but ArrayList with key ");
                        sb2.append(str2);
                        sb2.append(" contains items of type ");
                        sb2.append(i4);
                        sb2.append(" and ");
                        sb2.append(i7);
                        throw new IllegalArgumentException(sb2.toString());
                    }
                }
                ArrayList arrayList = new ArrayList(iVar.f253l.length);
                C0588h[] hVarArr = iVar.f253l;
                int length = hVarArr.length;
                int i8 = 0;
                while (i8 < length) {
                    C0588h hVar7 = hVarArr[i8];
                    if (hVar7.f242c != i2) {
                        if (i4 == i3) {
                            C2425h hVar8 = new C2425h();
                            for (C0587g gVar2 : hVar7.f243d.f252k) {
                                m364d(list2, hVar8, gVar2.f239c, gVar2.f240d);
                            }
                            arrayList.add(hVar8);
                            i8++;
                            obj = null;
                            i2 = 14;
                            i3 = 9;
                        } else if (i4 == 2) {
                            obj = hVar7.f243d.f245d;
                        } else if (i4 == 6) {
                            obj = Integer.valueOf(hVar7.f243d.f249h);
                        } else {
                            StringBuilder sb3 = new StringBuilder(39);
                            sb3.append("Unexpected typeOfArrayList: ");
                            sb3.append(i4);
                            throw new IllegalArgumentException(sb3.toString());
                        }
                    }
                    arrayList.add(obj);
                    i8++;
                    obj = null;
                    i2 = 14;
                    i3 = 9;
                }
                if (i4 == 14) {
                    hVar3.mo13252t(str2, arrayList);
                } else if (i4 == 9) {
                    hVar3.mo13242j(str2, arrayList);
                } else if (i4 == 2) {
                    hVar3.mo13252t(str2, arrayList);
                } else if (i4 == 6) {
                    hVar3.mo13247o(str2, arrayList);
                } else {
                    StringBuilder sb4 = new StringBuilder(39);
                    sb4.append("Unexpected typeOfArrayList: ");
                    sb4.append(i4);
                    throw new IllegalStateException(sb4.toString());
                }
            } else {
                StringBuilder sb5 = new StringBuilder(43);
                sb5.append("populateBundle: unexpected type ");
                sb5.append(i);
                throw new RuntimeException(sb5.toString());
            }
        } else if (list2 == null) {
            String valueOf = String.valueOf(str);
            throw new RuntimeException(valueOf.length() != 0 ? "populateBundle: unexpected type for: ".concat(valueOf) : new String("populateBundle: unexpected type for: "));
        } else {
            hVar3.mo13235e(str2, list2.get((int) iVar.f257p));
        }
    }
}
