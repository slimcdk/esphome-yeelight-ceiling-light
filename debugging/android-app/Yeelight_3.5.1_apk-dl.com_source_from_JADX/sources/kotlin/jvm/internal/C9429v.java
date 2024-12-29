package kotlin.jvm.internal;

import kotlin.C9303a;
import p233y4.C12049a;
import p233y4.C12050b;
import p233y4.C12051c;
import p233y4.C12052d;
import p233y4.C12053e;
import p233y4.C12054f;
import p233y4.C12055g;
import p233y4.C12056h;
import p233y4.C12057i;
import p233y4.C12058j;
import p233y4.C12059k;
import p233y4.C12060l;
import p233y4.C12061m;
import p233y4.C12062n;
import p233y4.C12063o;
import p233y4.C12064p;
import p233y4.C12065q;
import p233y4.C12066r;
import p233y4.C12067s;
import p233y4.C12068t;
import p233y4.C12069u;
import p233y4.C12070v;
import p233y4.C12071w;

/* renamed from: kotlin.jvm.internal.v */
public class C9429v {
    /* renamed from: a */
    public static Object m23034a(Object obj, int i) {
        if (obj != null && !m23036c(obj, i)) {
            m23039f(obj, "kotlin.jvm.functions.Function" + i);
        }
        return obj;
    }

    /* renamed from: b */
    public static int m23035b(Object obj) {
        if (obj instanceof C9423p) {
            return ((C9423p) obj).getArity();
        }
        if (obj instanceof C12049a) {
            return 0;
        }
        if (obj instanceof C12060l) {
            return 1;
        }
        if (obj instanceof C12064p) {
            return 2;
        }
        if (obj instanceof C12065q) {
            return 3;
        }
        if (obj instanceof C12066r) {
            return 4;
        }
        if (obj instanceof C12067s) {
            return 5;
        }
        if (obj instanceof C12068t) {
            return 6;
        }
        if (obj instanceof C12069u) {
            return 7;
        }
        if (obj instanceof C12070v) {
            return 8;
        }
        if (obj instanceof C12071w) {
            return 9;
        }
        if (obj instanceof C12050b) {
            return 10;
        }
        if (obj instanceof C12051c) {
            return 11;
        }
        if (obj instanceof C12052d) {
            return 12;
        }
        if (obj instanceof C12053e) {
            return 13;
        }
        if (obj instanceof C12054f) {
            return 14;
        }
        if (obj instanceof C12055g) {
            return 15;
        }
        if (obj instanceof C12056h) {
            return 16;
        }
        if (obj instanceof C12057i) {
            return 17;
        }
        if (obj instanceof C12058j) {
            return 18;
        }
        if (obj instanceof C12059k) {
            return 19;
        }
        if (obj instanceof C12061m) {
            return 20;
        }
        if (obj instanceof C12062n) {
            return 21;
        }
        return obj instanceof C12063o ? 22 : -1;
    }

    /* renamed from: c */
    public static boolean m23036c(Object obj, int i) {
        return (obj instanceof C9303a) && m23035b(obj) == i;
    }

    /* renamed from: d */
    private static <T extends Throwable> T m23037d(T t) {
        return C9424q.m23002k(t, C9429v.class.getName());
    }

    /* renamed from: e */
    public static ClassCastException m23038e(ClassCastException classCastException) {
        throw ((ClassCastException) m23037d(classCastException));
    }

    /* renamed from: f */
    public static void m23039f(Object obj, String str) {
        String name = obj == null ? "null" : obj.getClass().getName();
        m23040g(name + " cannot be cast to " + str);
    }

    /* renamed from: g */
    public static void m23040g(String str) {
        throw m23038e(new ClassCastException(str));
    }
}
