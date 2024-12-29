package com.google.android.gms.internal.measurement;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import org.apache.commons.p194io.IOUtils;

/* renamed from: com.google.android.gms.internal.measurement.n9 */
final class C1223n9 {
    /* renamed from: a */
    static String m2324a(C1191l9 l9Var, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        m2327d(l9Var, sb, 0);
        return sb.toString();
    }

    /* renamed from: b */
    static final void m2325b(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object b : (List) obj) {
                m2325b(sb, i, str, b);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry b2 : ((Map) obj).entrySet()) {
                m2325b(sb, i, str, b2);
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
                sb.append(C1208ma.m2276a(zzjb.zzm((String) obj)));
                sb.append('\"');
            } else if (obj instanceof zzjb) {
                sb.append(": \"");
                sb.append(C1208ma.m2276a((zzjb) obj));
                sb.append('\"');
            } else if (obj instanceof C1174k8) {
                sb.append(" {");
                m2327d((C1174k8) obj, sb, i + 2);
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
                m2325b(sb, i4, "key", entry.getKey());
                m2325b(sb, i4, "value", entry.getValue());
                sb.append(IOUtils.LINE_SEPARATOR_UNIX);
                while (i2 < i) {
                    sb.append(' ');
                    i2++;
                }
                sb.append("}");
            } else {
                sb.append(": ");
                sb.append(obj);
            }
        }
    }

    /* renamed from: c */
    private static final String m2326c(String str) {
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

    /* renamed from: d */
    private static void m2327d(C1191l9 l9Var, StringBuilder sb, int i) {
        Object obj;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet<>();
        for (Method method : l9Var.getClass().getDeclaredMethods()) {
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
                String concat = String.valueOf(substring.substring(0, 1).toLowerCase()).concat(String.valueOf(substring.substring(1, substring.length() - 4)));
                Method method2 = (Method) hashMap.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    m2325b(sb, i, m2326c(concat), C1174k8.m2152t(method2, l9Var, new Object[0]));
                }
            }
            if (substring.endsWith("Map") && !substring.equals("Map")) {
                String concat2 = String.valueOf(substring.substring(0, 1).toLowerCase()).concat(String.valueOf(substring.substring(1, substring.length() - 3)));
                Method method3 = (Method) hashMap.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    m2325b(sb, i, m2326c(concat2), C1174k8.m2152t(method3, l9Var, new Object[0]));
                }
            }
            if (((Method) hashMap2.get("set".concat(substring))) != null && (!substring.endsWith("Bytes") || !hashMap.containsKey("get".concat(String.valueOf(substring.substring(0, substring.length() - 5)))))) {
                String concat3 = String.valueOf(substring.substring(0, 1).toLowerCase()).concat(String.valueOf(substring.substring(1)));
                Method method4 = (Method) hashMap.get("get".concat(substring));
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object t = C1174k8.m2152t(method4, l9Var, new Object[0]);
                    if (method5 == null) {
                        if (t instanceof Boolean) {
                            if (!((Boolean) t).booleanValue()) {
                            }
                        } else if (t instanceof Integer) {
                            if (((Integer) t).intValue() == 0) {
                            }
                        } else if (t instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) t).floatValue()) == 0) {
                            }
                        } else if (!(t instanceof Double)) {
                            if (t instanceof String) {
                                obj = "";
                            } else if (t instanceof zzjb) {
                                obj = zzjb.zzb;
                            } else if (t instanceof C1191l9) {
                                if (t == ((C1191l9) t).mo12830a()) {
                                }
                            } else if ((t instanceof Enum) && ((Enum) t).ordinal() == 0) {
                            }
                            if (t.equals(obj)) {
                            }
                        } else if (Double.doubleToRawLongBits(((Double) t).doubleValue()) == 0) {
                        }
                    } else if (!((Boolean) C1174k8.m2152t(method5, l9Var, new Object[0])).booleanValue()) {
                    }
                    m2325b(sb, i, m2326c(concat3), t);
                }
            }
        }
        if (!(l9Var instanceof C1126h8)) {
            C1240oa oaVar = ((C1174k8) l9Var).zzc;
            if (oaVar != null) {
                oaVar.mo13054g(sb, i);
                return;
            }
            return;
        }
        C1126h8 h8Var = (C1126h8) l9Var;
        throw null;
    }
}
