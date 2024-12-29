package p164h.p211a.p212a.p228h;

import com.google.p107ar.schemas.sceneform.ParameterInitDefType;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import p164h.p211a.p212a.p228h.p234y.C11156b;

/* renamed from: h.a.a.h.r */
public class C11138r {

    /* renamed from: a */
    private static final HashMap<String, Class<?>> f22067a;

    /* renamed from: b */
    private static final HashMap<Class<?>, String> f22068b;

    /* renamed from: c */
    private static final HashMap<Class<?>, Method> f22069c;

    static {
        Class<Character> cls = Character.class;
        Class<String> cls2 = String.class;
        Class<Short> cls3 = Short.class;
        Class<Long> cls4 = Long.class;
        Class<Integer> cls5 = Integer.class;
        Class<Float> cls6 = Float.class;
        Class<Double> cls7 = Double.class;
        Class<Byte> cls8 = Byte.class;
        Class<Boolean> cls9 = Boolean.class;
        C11156b.m29015a(C11138r.class);
        HashMap<String, Class<?>> hashMap = new HashMap<>();
        f22067a = hashMap;
        hashMap.put("boolean", Boolean.TYPE);
        f22067a.put("byte", Byte.TYPE);
        f22067a.put("char", Character.TYPE);
        f22067a.put("double", Double.TYPE);
        String str = "valueOf";
        f22067a.put("float", Float.TYPE);
        f22067a.put("int", Integer.TYPE);
        f22067a.put("long", Long.TYPE);
        f22067a.put("short", Short.TYPE);
        f22067a.put("void", Void.TYPE);
        f22067a.put("java.lang.Boolean.TYPE", Boolean.TYPE);
        f22067a.put("java.lang.Byte.TYPE", Byte.TYPE);
        f22067a.put("java.lang.Character.TYPE", Character.TYPE);
        f22067a.put("java.lang.Double.TYPE", Double.TYPE);
        f22067a.put("java.lang.Float.TYPE", Float.TYPE);
        f22067a.put("java.lang.Integer.TYPE", Integer.TYPE);
        f22067a.put("java.lang.Long.TYPE", Long.TYPE);
        f22067a.put("java.lang.Short.TYPE", Short.TYPE);
        f22067a.put("java.lang.Void.TYPE", Void.TYPE);
        f22067a.put("java.lang.Boolean", cls9);
        f22067a.put("java.lang.Byte", cls8);
        f22067a.put("java.lang.Character", cls);
        f22067a.put("java.lang.Double", cls7);
        f22067a.put("java.lang.Float", cls6);
        f22067a.put("java.lang.Integer", cls5);
        f22067a.put("java.lang.Long", cls4);
        f22067a.put("java.lang.Short", cls3);
        f22067a.put("Boolean", cls9);
        f22067a.put("Byte", cls8);
        f22067a.put("Character", cls);
        f22067a.put("Double", cls7);
        f22067a.put("Float", cls6);
        f22067a.put("Integer", cls5);
        f22067a.put("Long", cls4);
        f22067a.put("Short", cls3);
        Class<Short> cls10 = cls3;
        f22067a.put((Object) null, Void.TYPE);
        f22067a.put("string", cls2);
        f22067a.put("String", cls2);
        f22067a.put("java.lang.String", cls2);
        HashMap<Class<?>, String> hashMap2 = new HashMap<>();
        f22068b = hashMap2;
        hashMap2.put(Boolean.TYPE, "boolean");
        f22068b.put(Byte.TYPE, "byte");
        f22068b.put(Character.TYPE, "char");
        f22068b.put(Double.TYPE, "double");
        f22068b.put(Float.TYPE, "float");
        f22068b.put(Integer.TYPE, "int");
        f22068b.put(Long.TYPE, "long");
        f22068b.put(Short.TYPE, "short");
        Object obj = "void";
        f22068b.put(Void.TYPE, obj);
        f22068b.put(cls9, "java.lang.Boolean");
        f22068b.put(cls8, "java.lang.Byte");
        f22068b.put(cls, "java.lang.Character");
        f22068b.put(cls7, "java.lang.Double");
        f22068b.put(cls6, "java.lang.Float");
        f22068b.put(cls5, "java.lang.Integer");
        f22068b.put(cls4, "java.lang.Long");
        Class<Short> cls11 = cls10;
        f22068b.put(cls11, "java.lang.Short");
        f22068b.put((Object) null, obj);
        f22068b.put(cls2, "java.lang.String");
        HashMap<Class<?>, Method> hashMap3 = new HashMap<>();
        f22069c = hashMap3;
        try {
            Class[] clsArr = {cls2};
            hashMap3.put(Boolean.TYPE, cls9.getMethod("valueOf", clsArr));
            String str2 = str;
            f22069c.put(Byte.TYPE, cls8.getMethod(str2, clsArr));
            f22069c.put(Double.TYPE, cls7.getMethod(str2, clsArr));
            f22069c.put(Float.TYPE, cls6.getMethod(str2, clsArr));
            f22069c.put(Integer.TYPE, cls5.getMethod(str2, clsArr));
            f22069c.put(Long.TYPE, cls4.getMethod(str2, clsArr));
            f22069c.put(Short.TYPE, cls11.getMethod(str2, clsArr));
            f22069c.put(cls9, cls9.getMethod(str2, clsArr));
            f22069c.put(cls8, cls8.getMethod(str2, clsArr));
            f22069c.put(cls7, cls7.getMethod(str2, clsArr));
            f22069c.put(cls6, cls6.getMethod(str2, clsArr));
            f22069c.put(cls5, cls5.getMethod(str2, clsArr));
            f22069c.put(cls4, cls4.getMethod(str2, clsArr));
            f22069c.put(cls11, cls11.getMethod(str2, clsArr));
        } catch (Exception e) {
            throw new Error(e);
        }
    }

    /* renamed from: a */
    public static <T> List<T> m28927a(T[] tArr) {
        return tArr == null ? Collections.emptyList() : Arrays.asList(tArr);
    }

    /* renamed from: b */
    public static byte m28928b(byte b) {
        int i;
        if (b < 48 || b > 57) {
            byte b2 = 97;
            if (b < 97 || b > 102) {
                b2 = 65;
                if (b < 65 || b > 70) {
                    throw new IllegalArgumentException("!hex:" + Integer.toHexString(b & 255));
                }
            }
            i = (b - b2) + 10;
        } else {
            i = b - 48;
        }
        return (byte) i;
    }

    /* renamed from: c */
    public static int m28929c(String str, int i, int i2, int i3) {
        int i4;
        if (i2 < 0) {
            i2 = str.length() - i;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            char charAt = str.charAt(i + i6);
            int i7 = charAt - '0';
            if ((i7 < 0 || i7 >= i3 || i7 >= 10) && ((i4 = charAt + 10) - 65 < 10 || i7 >= i3)) {
                i7 = i4 - 97;
            }
            if (i7 < 0 || i7 >= i3) {
                throw new NumberFormatException(str.substring(i, i2 + i));
            }
            i5 = (i5 * i3) + i7;
        }
        return i5;
    }

    /* renamed from: d */
    public static int m28930d(byte[] bArr, int i, int i2, int i3) {
        int i4;
        if (i2 < 0) {
            i2 = bArr.length - i;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            char c = (char) (bArr[i + i6] & 255);
            int i7 = c - '0';
            if ((i7 < 0 || i7 >= i3 || i7 >= 10) && ((i4 = c + 10) - 65 < 10 || i7 >= i3)) {
                i7 = i4 - 97;
            }
            if (i7 < 0 || i7 >= i3) {
                throw new NumberFormatException(new String(bArr, i, i2));
            }
            i5 = (i5 * i3) + i7;
        }
        return i5;
    }

    /* renamed from: e */
    public static void m28931e(byte b, Appendable appendable) {
        byte b2 = b & 255;
        try {
            int i = ((b2 / ParameterInitDefType.ExternalSamplerInit) % 16) + 48;
            if (i > 57) {
                i = ((i - 48) - 10) + 65;
            }
            appendable.append((char) i);
            int i2 = (b2 % ParameterInitDefType.ExternalSamplerInit) + 48;
            if (i2 > 57) {
                i2 = ((i2 - 48) - 10) + 65;
            }
            appendable.append((char) i2);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: f */
    public static String m28932f(byte b) {
        return m28933g(new byte[]{b}, 0, 1);
    }

    /* renamed from: g */
    public static String m28933g(byte[] bArr, int i, int i2) {
        StringBuilder sb = new StringBuilder();
        for (int i3 = i; i3 < i + i2; i3++) {
            byte b = bArr[i3] & 255;
            int i4 = ((b / ParameterInitDefType.ExternalSamplerInit) % 16) + 48;
            if (i4 > 57) {
                i4 = ((i4 - 48) - 10) + 65;
            }
            sb.append((char) i4);
            int i5 = (b % ParameterInitDefType.ExternalSamplerInit) + 48;
            if (i5 > 57) {
                i5 = ((i5 - 48) - 10) + 97;
            }
            sb.append((char) i5);
        }
        return sb.toString();
    }

    /* renamed from: h */
    public static String m28934h(byte[] bArr, int i) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            byte b2 = b & 255;
            int i2 = ((b2 / i) % i) + 48;
            if (i2 > 57) {
                i2 = ((i2 - 48) - 10) + 97;
            }
            sb.append((char) i2);
            int i3 = (b2 % i) + 48;
            if (i3 > 57) {
                i3 = ((i3 - 48) - 10) + 97;
            }
            sb.append((char) i3);
        }
        return sb.toString();
    }
}
