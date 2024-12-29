package org.eclipse.jetty.util;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.p017ar.schemas.sceneform.ParameterInitDefType;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import p152e6.C9001b;
import p152e6.C9003c;

/* renamed from: org.eclipse.jetty.util.o */
public class C9996o {

    /* renamed from: a */
    private static final C9003c f18437a = C9001b.m21450a(C9996o.class);

    /* renamed from: b */
    private static final HashMap<String, Class<?>> f18438b;

    /* renamed from: c */
    private static final HashMap<Class<?>, String> f18439c;

    /* renamed from: d */
    private static final HashMap<Class<?>, Method> f18440d;

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
        HashMap<String, Class<?>> hashMap = new HashMap<>();
        f18438b = hashMap;
        Class cls10 = Boolean.TYPE;
        hashMap.put(TypedValues.Custom.S_BOOLEAN, cls10);
        hashMap.put("byte", Byte.TYPE);
        hashMap.put("char", Character.TYPE);
        String str = "valueOf";
        hashMap.put("double", Double.TYPE);
        Class cls11 = Float.TYPE;
        hashMap.put(TypedValues.Custom.S_FLOAT, cls11);
        Object obj = TypedValues.Custom.S_FLOAT;
        Class cls12 = Integer.TYPE;
        hashMap.put("int", cls12);
        Class cls13 = Long.TYPE;
        hashMap.put("long", cls13);
        Class cls14 = Short.TYPE;
        Object obj2 = TypedValues.Custom.S_BOOLEAN;
        hashMap.put("short", cls14);
        hashMap.put("void", Void.TYPE);
        hashMap.put("java.lang.Boolean.TYPE", cls10);
        hashMap.put("java.lang.Byte.TYPE", Byte.TYPE);
        hashMap.put("java.lang.Character.TYPE", Character.TYPE);
        hashMap.put("java.lang.Double.TYPE", Double.TYPE);
        hashMap.put("java.lang.Float.TYPE", cls11);
        hashMap.put("java.lang.Integer.TYPE", cls12);
        hashMap.put("java.lang.Long.TYPE", cls13);
        hashMap.put("java.lang.Short.TYPE", Short.TYPE);
        hashMap.put("java.lang.Void.TYPE", Void.TYPE);
        hashMap.put("java.lang.Boolean", cls9);
        hashMap.put("java.lang.Byte", cls8);
        hashMap.put("java.lang.Character", cls);
        hashMap.put("java.lang.Double", cls7);
        hashMap.put("java.lang.Float", cls6);
        hashMap.put("java.lang.Integer", cls5);
        hashMap.put("java.lang.Long", cls4);
        hashMap.put("java.lang.Short", cls3);
        hashMap.put("Boolean", cls9);
        hashMap.put("Byte", cls8);
        hashMap.put("Character", cls);
        hashMap.put("Double", cls7);
        hashMap.put("Float", cls6);
        hashMap.put("Integer", cls5);
        hashMap.put("Long", cls4);
        hashMap.put("Short", cls3);
        Class<Short> cls15 = cls3;
        hashMap.put((Object) null, Void.TYPE);
        hashMap.put(TypedValues.Custom.S_STRING, cls2);
        hashMap.put("String", cls2);
        hashMap.put("java.lang.String", cls2);
        HashMap<Class<?>, String> hashMap2 = new HashMap<>();
        f18439c = hashMap2;
        hashMap2.put(cls10, obj2);
        hashMap2.put(Byte.TYPE, "byte");
        hashMap2.put(Character.TYPE, "char");
        hashMap2.put(Double.TYPE, "double");
        hashMap2.put(cls11, obj);
        hashMap2.put(cls12, "int");
        hashMap2.put(cls13, "long");
        hashMap2.put(Short.TYPE, "short");
        Object obj3 = "void";
        hashMap2.put(Void.TYPE, obj3);
        hashMap2.put(cls9, "java.lang.Boolean");
        hashMap2.put(cls8, "java.lang.Byte");
        hashMap2.put(cls, "java.lang.Character");
        hashMap2.put(cls7, "java.lang.Double");
        hashMap2.put(cls6, "java.lang.Float");
        hashMap2.put(cls5, "java.lang.Integer");
        hashMap2.put(cls4, "java.lang.Long");
        Class<Short> cls16 = cls15;
        hashMap2.put(cls16, "java.lang.Short");
        hashMap2.put((Object) null, obj3);
        hashMap2.put(cls2, "java.lang.String");
        HashMap<Class<?>, Method> hashMap3 = new HashMap<>();
        f18440d = hashMap3;
        try {
            Class[] clsArr = {cls2};
            hashMap3.put(cls10, cls9.getMethod("valueOf", clsArr));
            String str2 = str;
            hashMap3.put(Byte.TYPE, cls8.getMethod(str2, clsArr));
            hashMap3.put(Double.TYPE, cls7.getMethod(str2, clsArr));
            hashMap3.put(cls11, cls6.getMethod(str2, clsArr));
            hashMap3.put(cls12, cls5.getMethod(str2, clsArr));
            hashMap3.put(cls13, cls4.getMethod(str2, clsArr));
            hashMap3.put(Short.TYPE, cls16.getMethod(str2, clsArr));
            hashMap3.put(cls9, cls9.getMethod(str2, clsArr));
            hashMap3.put(cls8, cls8.getMethod(str2, clsArr));
            hashMap3.put(cls7, cls7.getMethod(str2, clsArr));
            hashMap3.put(cls6, cls6.getMethod(str2, clsArr));
            hashMap3.put(cls5, cls5.getMethod(str2, clsArr));
            hashMap3.put(cls4, cls4.getMethod(str2, clsArr));
            hashMap3.put(cls16, cls16.getMethod(str2, clsArr));
        } catch (Exception e) {
            throw new Error(e);
        }
    }

    /* renamed from: a */
    public static <T> List<T> m24714a(T[] tArr) {
        return tArr == null ? Collections.emptyList() : Arrays.asList(tArr);
    }

    /* renamed from: b */
    public static byte m24715b(byte b) {
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
    public static byte[] m24716c(String str, int i) {
        byte[] bArr = new byte[(str.length() / 2)];
        for (int i2 = 0; i2 < str.length(); i2 += 2) {
            bArr[i2 / 2] = (byte) m24717d(str, i2, 2, i);
        }
        return bArr;
    }

    /* renamed from: d */
    public static int m24717d(String str, int i, int i2, int i3) {
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

    /* renamed from: e */
    public static int m24718e(byte[] bArr, int i, int i2, int i3) {
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

    /* renamed from: f */
    public static void m24719f(byte b, Appendable appendable) {
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

    /* renamed from: g */
    public static String m24720g(byte b) {
        return m24721h(new byte[]{b}, 0, 1);
    }

    /* renamed from: h */
    public static String m24721h(byte[] bArr, int i, int i2) {
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

    /* renamed from: i */
    public static String m24722i(byte[] bArr, int i) {
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
