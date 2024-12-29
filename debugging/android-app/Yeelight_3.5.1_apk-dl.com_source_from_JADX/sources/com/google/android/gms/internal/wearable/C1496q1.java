package com.google.android.gms.internal.wearable;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import org.apache.commons.p194io.IOUtils;

/* renamed from: com.google.android.gms.internal.wearable.q1 */
final class C1496q1 {
    /* renamed from: a */
    static String m3727a(C1486o1 o1Var, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        m3729c(o1Var, sb, 0);
        return sb.toString();
    }

    /* renamed from: b */
    static final void m3728b(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object b : (List) obj) {
                m3728b(sb, i, str, b);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry b2 : ((Map) obj).entrySet()) {
                m3728b(sb, i, str, b2);
            }
        } else {
            sb.append(10);
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                sb.append(' ');
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                sb.append(C1477m2.m3618a(zzau.zzm((String) obj)));
                sb.append('\"');
            } else if (obj instanceof zzau) {
                sb.append(": \"");
                sb.append(C1477m2.m3618a((zzau) obj));
                sb.append('\"');
            } else if (obj instanceof C1480n0) {
                sb.append(" {");
                m3729c((C1480n0) obj, sb, i + 2);
                sb.append(IOUtils.LINE_SEPARATOR_UNIX);
                while (i2 < i) {
                    sb.append(' ');
                    i2++;
                }
                sb.append("}");
            } else if (obj instanceof Map.Entry) {
                sb.append(" {");
                Map.Entry entry = (Map.Entry) obj;
                int i4 = i + 2;
                m3728b(sb, i4, "key", entry.getKey());
                m3728b(sb, i4, "value", entry.getValue());
                sb.append(IOUtils.LINE_SEPARATOR_UNIX);
                while (i2 < i) {
                    sb.append(' ');
                    i2++;
                }
                sb.append("}");
            } else {
                sb.append(": ");
                sb.append(obj.toString());
            }
        }
    }

    /* renamed from: c */
    private static void m3729c(C1486o1 o1Var, StringBuilder sb, int i) {
        Object obj;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet<>();
        for (Method method : o1Var.getClass().getDeclaredMethods()) {
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        for (String str : treeSet) {
            String substring = str.startsWith("get") ? str.substring(3) : str;
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List")) {
                String valueOf = String.valueOf(substring.substring(0, 1).toLowerCase());
                String valueOf2 = String.valueOf(substring.substring(1, substring.length() - 4));
                String concat = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
                Method method2 = (Method) hashMap.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    m3728b(sb, i, m3730d(concat), C1480n0.m3622p(method2, o1Var, new Object[0]));
                }
            }
            if (substring.endsWith("Map") && !substring.equals("Map")) {
                String valueOf3 = String.valueOf(substring.substring(0, 1).toLowerCase());
                String valueOf4 = String.valueOf(substring.substring(1, substring.length() - 3));
                String concat2 = valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3);
                Method method3 = (Method) hashMap.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    m3728b(sb, i, m3730d(concat2), C1480n0.m3622p(method3, o1Var, new Object[0]));
                }
            }
            if (((Method) hashMap2.get(substring.length() != 0 ? "set".concat(substring) : new String("set"))) != null) {
                if (substring.endsWith("Bytes")) {
                    String valueOf5 = String.valueOf(substring.substring(0, substring.length() - 5));
                    if (hashMap.containsKey(valueOf5.length() != 0 ? "get".concat(valueOf5) : new String("get"))) {
                    }
                }
                String valueOf6 = String.valueOf(substring.substring(0, 1).toLowerCase());
                String valueOf7 = String.valueOf(substring.substring(1));
                String concat3 = valueOf7.length() != 0 ? valueOf6.concat(valueOf7) : new String(valueOf6);
                Method method4 = (Method) hashMap.get(substring.length() != 0 ? "get".concat(substring) : new String("get"));
                Method method5 = (Method) hashMap.get(substring.length() != 0 ? "has".concat(substring) : new String("has"));
                if (method4 != null) {
                    Object p = C1480n0.m3622p(method4, o1Var, new Object[0]);
                    if (method5 == null) {
                        if (p instanceof Boolean) {
                            if (!((Boolean) p).booleanValue()) {
                            }
                        } else if (p instanceof Integer) {
                            if (((Integer) p).intValue() == 0) {
                            }
                        } else if (p instanceof Float) {
                            if (((Float) p).floatValue() == 0.0f) {
                            }
                        } else if (!(p instanceof Double)) {
                            if (p instanceof String) {
                                obj = "";
                            } else if (p instanceof zzau) {
                                obj = zzau.zzb;
                            } else if (p instanceof C1486o1) {
                                if (p == ((C1486o1) p).mo13680a()) {
                                }
                            } else if ((p instanceof Enum) && ((Enum) p).ordinal() == 0) {
                            }
                            if (p.equals(obj)) {
                            }
                        } else if (((Double) p).doubleValue() == 0.0d) {
                        }
                    } else if (!((Boolean) C1480n0.m3622p(method5, o1Var, new Object[0])).booleanValue()) {
                    }
                    m3728b(sb, i, m3730d(concat3), p);
                }
            }
        }
        if (!(o1Var instanceof C1470l0)) {
            C1487o2 o2Var = ((C1480n0) o1Var).zzc;
            if (o2Var != null) {
                o2Var.mo13746g(sb, i);
                return;
            }
            return;
        }
        C1470l0 l0Var = (C1470l0) o1Var;
        throw null;
    }

    /* renamed from: d */
    private static final String m3730d(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }
}
