package com.google.android.gms.internal.wearable;

import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.wearable.Asset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.TreeSet;
import p069n0.C3362h;

@VisibleForTesting
/* renamed from: com.google.android.gms.internal.wearable.h3 */
public final class C1453h3 {
    /* renamed from: a */
    public static C1448g3 m3548a(C3362h hVar) {
        ArrayList arrayList = new ArrayList();
        C1463j3 y = C1508s3.m3797y();
        TreeSet treeSet = new TreeSet(hVar.mo24115c());
        ArrayList arrayList2 = new ArrayList();
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Object a = hVar.mo24113a(str);
            C1468k3 y2 = C1503r3.m3743y();
            y2.mo13701p(str);
            y2.mo13702q(m3550c(arrayList, a));
            arrayList2.add((C1503r3) y2.mo13685k());
        }
        y.mo13670p(arrayList2);
        return new C1448g3((C1508s3) y.mo13685k(), arrayList);
    }

    /* renamed from: b */
    public static C3362h m3549b(C1448g3 g3Var) {
        C3362h hVar = new C3362h();
        for (C1503r3 next : g3Var.f1780a.mo13797w()) {
            m3551d(g3Var.f1781b, hVar, next.mo13790w(), next.mo13791x());
        }
        return hVar;
    }

    /* renamed from: c */
    private static C1498q3 m3550c(List<Asset> list, Object obj) {
        C1473l3 y = C1498q3.m3734y();
        zzr zzr = zzr.BYTE_ARRAY;
        y.mo13706p(zzr);
        if (obj == null) {
            y.mo13706p(zzr.NULL_VALUE);
        } else {
            C1488o3 U = C1493p3.m3696U();
            if (obj instanceof String) {
                y.mo13706p(zzr.STRING);
                U.mo13756q((String) obj);
            } else if (obj instanceof Integer) {
                y.mo13706p(zzr.INT);
                U.mo13760u(((Integer) obj).intValue());
            } else if (obj instanceof Long) {
                y.mo13706p(zzr.LONG);
                U.mo13759t(((Long) obj).longValue());
            } else if (obj instanceof Double) {
                y.mo13706p(zzr.DOUBLE);
                U.mo13757r(((Double) obj).doubleValue());
            } else if (obj instanceof Float) {
                y.mo13706p(zzr.FLOAT);
                U.mo13758s(((Float) obj).floatValue());
            } else if (obj instanceof Boolean) {
                y.mo13706p(zzr.BOOLEAN);
                U.mo13762x(((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                y.mo13706p(zzr.BYTE);
                U.mo13761w(((Byte) obj).byteValue());
            } else if (obj instanceof byte[]) {
                y.mo13706p(zzr);
                U.mo13755p(zzau.zzl((byte[]) obj));
            } else if (obj instanceof String[]) {
                y.mo13706p(zzr.STRING_ARRAY);
                U.mo13751D(Arrays.asList((String[]) obj));
            } else if (obj instanceof long[]) {
                y.mo13706p(zzr.LONG_ARRAY);
                U.mo13752E(C1429d.m3499a((long[]) obj));
            } else if (obj instanceof float[]) {
                y.mo13706p(zzr.FLOAT_ARRAY);
                U.mo13753L(C1419b.m3429a((float[]) obj));
            } else if (obj instanceof Asset) {
                y.mo13706p(zzr.ASSET_INDEX);
                list.add((Asset) obj);
                U.mo13754M((long) (list.size() - 1));
            } else {
                int i = 0;
                if (obj instanceof C3362h) {
                    y.mo13706p(zzr.DATA_BUNDLE);
                    C3362h hVar = (C3362h) obj;
                    TreeSet treeSet = new TreeSet(hVar.mo24115c());
                    C1503r3[] r3VarArr = new C1503r3[treeSet.size()];
                    Iterator it = treeSet.iterator();
                    while (it.hasNext()) {
                        String str = (String) it.next();
                        C1468k3 y2 = C1503r3.m3743y();
                        y2.mo13701p(str);
                        y2.mo13702q(m3550c(list, hVar.mo24113a(str)));
                        r3VarArr[i] = (C1503r3) y2.mo13685k();
                        i++;
                    }
                    U.mo13763y(Arrays.asList(r3VarArr));
                } else if (obj instanceof ArrayList) {
                    y.mo13706p(zzr.ARRAY_LIST);
                    ArrayList arrayList = (ArrayList) obj;
                    zzr zzr2 = zzr.NULL_VALUE;
                    int size = arrayList.size();
                    Object obj2 = null;
                    while (i < size) {
                        Object obj3 = arrayList.get(i);
                        C1498q3 c = m3550c(list, obj3);
                        zzr w = c.mo13788w();
                        zzr zzr3 = zzr.NULL_VALUE;
                        if (w == zzr3 || c.mo13788w() == zzr.STRING || c.mo13788w() == zzr.INT || c.mo13788w() == zzr.DATA_BUNDLE) {
                            if (zzr2 == zzr3 && c.mo13788w() != zzr3) {
                                zzr2 = c.mo13788w();
                                obj2 = obj3;
                            } else if (c.mo13788w() != zzr2) {
                                String valueOf = String.valueOf(obj2.getClass());
                                String valueOf2 = String.valueOf(obj3.getClass());
                                StringBuilder sb = new StringBuilder(valueOf.length() + 80 + valueOf2.length());
                                sb.append("ArrayList elements must all be of the sameclass, but this one contains a ");
                                sb.append(valueOf);
                                sb.append(" and a ");
                                sb.append(valueOf2);
                                throw new IllegalArgumentException(sb.toString());
                            }
                            U.mo13750C(c);
                            i++;
                        } else {
                            String valueOf3 = String.valueOf(obj3.getClass());
                            StringBuilder sb2 = new StringBuilder(valueOf3.length() + 130);
                            sb2.append("The only ArrayList element types supported by DataBundleUtil are String, Integer, Bundle, and null, but this ArrayList contains a ");
                            sb2.append(valueOf3);
                            throw new IllegalArgumentException(sb2.toString());
                        }
                    }
                } else {
                    String simpleName = obj.getClass().getSimpleName();
                    throw new RuntimeException(simpleName.length() != 0 ? "newFieldValueFromValue: unexpected value ".concat(simpleName) : new String("newFieldValueFromValue: unexpected value "));
                }
            }
            y.mo13707q(U);
        }
        return (C1498q3) y.mo13685k();
    }

    /* renamed from: d */
    private static void m3551d(List<Asset> list, C3362h hVar, String str, C1498q3 q3Var) {
        Object valueOf;
        zzr w = q3Var.mo13788w();
        zzr zzr = zzr.NULL_VALUE;
        if (w == zzr) {
            hVar.mo24132r(str, (String) null);
            return;
        }
        C1493p3 x = q3Var.mo13789x();
        if (w == zzr.BYTE_ARRAY) {
            hVar.mo24121h(str, x.mo13764D().zzn());
            return;
        }
        int i = 0;
        if (w == zzr.STRING_ARRAY) {
            hVar.mo24133s(str, (String[]) x.mo13775Q().toArray(new String[0]));
        } else if (w == zzr.LONG_ARRAY) {
            Object[] array = x.mo13776R().toArray();
            int length = array.length;
            long[] jArr = new long[length];
            while (i < length) {
                Object obj = array[i];
                Objects.requireNonNull(obj);
                jArr[i] = ((Number) obj).longValue();
                i++;
            }
            hVar.mo24131q(str, jArr);
        } else if (w == zzr.FLOAT_ARRAY) {
            Object[] array2 = x.mo13777S().toArray();
            int length2 = array2.length;
            float[] fArr = new float[length2];
            while (i < length2) {
                Object obj2 = array2[i];
                Objects.requireNonNull(obj2);
                fArr[i] = ((Number) obj2).floatValue();
                i++;
            }
            hVar.mo24127m(str, fArr);
        } else if (w == zzr.STRING) {
            hVar.mo24132r(str, x.mo13765E());
        } else if (w == zzr.DOUBLE) {
            hVar.mo24125k(str, x.mo13766F());
        } else if (w == zzr.FLOAT) {
            hVar.mo24126l(str, x.mo13767H());
        } else if (w == zzr.LONG) {
            hVar.mo24130p(str, x.mo13768I());
        } else if (w == zzr.INT) {
            hVar.mo24128n(str, x.mo13769J());
        } else if (w == zzr.BYTE) {
            hVar.mo24120g(str, (byte) x.mo13770L());
        } else if (w == zzr.BOOLEAN) {
            hVar.mo24119f(str, x.mo13771M());
        } else if (w == zzr.ASSET_INDEX) {
            hVar.mo24117e(str, list.get((int) x.mo13778T()));
        } else if (w == zzr.DATA_BUNDLE) {
            C3362h hVar2 = new C3362h();
            for (C1503r3 next : x.mo13772N()) {
                m3551d(list, hVar2, next.mo13790w(), next.mo13791x());
            }
            hVar.mo24123i(str, hVar2);
        } else if (w == zzr.ARRAY_LIST) {
            for (C1498q3 next2 : x.mo13773O()) {
                zzr zzr2 = zzr.NULL_VALUE;
                if (zzr == zzr2) {
                    if (next2.mo13788w() == zzr.DATA_BUNDLE || next2.mo13788w() == zzr.STRING || next2.mo13788w() == zzr.INT) {
                        zzr = next2.mo13788w();
                    } else if (next2.mo13788w() != zzr2) {
                        String valueOf2 = String.valueOf(next2.mo13788w());
                        StringBuilder sb = new StringBuilder(valueOf2.length() + 37 + String.valueOf(str).length());
                        sb.append("Unexpected TypedValue type: ");
                        sb.append(valueOf2);
                        sb.append(" for key ");
                        sb.append(str);
                        throw new IllegalArgumentException(sb.toString());
                    }
                } else if (next2.mo13788w() != zzr) {
                    String valueOf3 = String.valueOf(zzr);
                    String valueOf4 = String.valueOf(next2.mo13788w());
                    int length3 = String.valueOf(str).length();
                    StringBuilder sb2 = new StringBuilder(length3 + 104 + valueOf3.length() + valueOf4.length());
                    sb2.append("The ArrayList elements should all be the same type, but ArrayList with key ");
                    sb2.append(str);
                    sb2.append(" contains items of type ");
                    sb2.append(valueOf3);
                    sb2.append(" and ");
                    sb2.append(valueOf4);
                    throw new IllegalArgumentException(sb2.toString());
                }
            }
            ArrayList arrayList = new ArrayList(x.mo13774P());
            for (C1498q3 next3 : x.mo13773O()) {
                if (next3.mo13788w() == zzr.NULL_VALUE) {
                    arrayList.add((Object) null);
                } else if (zzr == zzr.DATA_BUNDLE) {
                    C3362h hVar3 = new C3362h();
                    for (C1503r3 next4 : next3.mo13789x().mo13772N()) {
                        m3551d(list, hVar3, next4.mo13790w(), next4.mo13791x());
                    }
                    arrayList.add(hVar3);
                } else {
                    if (zzr == zzr.STRING) {
                        valueOf = next3.mo13789x().mo13765E();
                    } else if (zzr == zzr.INT) {
                        valueOf = Integer.valueOf(next3.mo13789x().mo13769J());
                    } else {
                        String valueOf5 = String.valueOf(zzr);
                        StringBuilder sb3 = new StringBuilder(valueOf5.length() + 28);
                        sb3.append("Unexpected typeOfArrayList: ");
                        sb3.append(valueOf5);
                        throw new IllegalArgumentException(sb3.toString());
                    }
                    arrayList.add(valueOf);
                }
            }
            if (zzr == zzr.NULL_VALUE) {
                hVar.mo24134t(str, arrayList);
            } else if (zzr == zzr.DATA_BUNDLE) {
                hVar.mo24124j(str, arrayList);
            } else if (zzr == zzr.STRING) {
                hVar.mo24134t(str, arrayList);
            } else if (zzr == zzr.INT) {
                hVar.mo24129o(str, arrayList);
            } else {
                String valueOf6 = String.valueOf(zzr);
                StringBuilder sb4 = new StringBuilder(valueOf6.length() + 28);
                sb4.append("Unexpected typeOfArrayList: ");
                sb4.append(valueOf6);
                throw new IllegalStateException(sb4.toString());
            }
        } else {
            String valueOf7 = String.valueOf(w);
            StringBuilder sb5 = new StringBuilder(valueOf7.length() + 32);
            sb5.append("populateBundle: unexpected type ");
            sb5.append(valueOf7);
            throw new RuntimeException(sb5.toString());
        }
    }
}
