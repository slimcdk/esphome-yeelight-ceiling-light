package p164h.p165b.p166a.p240h.p252w;

import com.yeelight.yeelib.p150c.p183m.C6842i1;
import java.net.URI;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: h.b.a.h.w.j */
public interface C11374j<V> {

    /* renamed from: h.b.a.h.w.j$a */
    public enum C11375a {
        UI1("ui1", new C11378j0()),
        UI2("ui2", new C11382l0()),
        UI4("ui4", new C11371h0()),
        I1(C6842i1.f14155G, new C11390q(1)),
        I2("i2", new C11390q(2)),
        I2_SHORT("i2", new C11398y()),
        I4("i4", new C11390q(4)),
        INT("int", new C11390q(4)),
        R4("r4", new C11388o()),
        R8("r8", new C11383m()),
        NUMBER("number", new C11383m()),
        FIXED144("fixed.14.4", new C11383m()),
        FLOAT("float", new C11383m()),
        CHAR("char", new C11366f()),
        STRING("string", new C11357a0()),
        DATE("date", new C11379k(new String[]{"yyyy-MM-dd"}, "yyyy-MM-dd")),
        DATETIME("dateTime", new C11379k(new String[]{"yyyy-MM-dd", "yyyy-MM-dd'T'HH:mm:ss"}, "yyyy-MM-dd'T'HH:mm:ss")),
        DATETIME_TZ("dateTime.tz", new C11379k(new String[]{"yyyy-MM-dd", "yyyy-MM-dd'T'HH:mm:ss", "yyyy-MM-dd'T'HH:mm:ssZ"}, "yyyy-MM-dd'T'HH:mm:ssZ")),
        TIME("time", new C11379k(new String[]{"HH:mm:ss"}, "HH:mm:ss")),
        TIME_TZ("time.tz", new C11379k(new String[]{"HH:mm:ssZ", "HH:mm:ss"}, "HH:mm:ssZ")),
        BOOLEAN("boolean", new C11362d()),
        BIN_BASE64("bin.base64", new C11358b()),
        BIN_HEX("bin.hex", new C11360c()),
        URI("uri", new C11367f0()),
        UUID("uuid", new C11357a0());
        

        /* renamed from: B */
        private static Map<String, C11375a> f22555B;

        /* renamed from: a */
        private String f22581a;

        /* renamed from: b */
        private C11374j f22582b;

        /* renamed from: h.b.a.h.w.j$a$a */
        static class C11376a extends HashMap<String, C11375a> {
            C11376a() {
                for (C11375a aVar : C11375a.values()) {
                    if (!containsKey(aVar.mo36079c().toLowerCase(Locale.ROOT))) {
                        put(aVar.mo36079c().toLowerCase(Locale.ROOT), aVar);
                    }
                }
            }
        }

        static {
            f22555B = new C11376a();
        }

        private <VT> C11375a(String str, C11356a<VT> aVar) {
            aVar.mo36047h(this);
            this.f22581a = str;
            this.f22582b = aVar;
        }

        /* renamed from: a */
        public static C11375a m29812a(String str) {
            if (str == null) {
                return null;
            }
            return f22555B.get(str.toLowerCase(Locale.ROOT));
        }

        /* renamed from: d */
        public static boolean m29813d(C11375a aVar) {
            return aVar != null && (aVar.equals(UI1) || aVar.equals(UI2) || aVar.equals(UI4) || aVar.equals(I1) || aVar.equals(I2) || aVar.equals(I4) || aVar.equals(INT));
        }

        /* renamed from: b */
        public C11374j mo36078b() {
            return this.f22582b;
        }

        /* renamed from: c */
        public String mo36079c() {
            return this.f22581a;
        }
    }

    /* renamed from: h.b.a.h.w.j$b */
    public enum C11377b {
        BOOLEAN(Boolean.class, C11375a.BOOLEAN),
        BOOLEAN_PRIMITIVE(Boolean.TYPE, C11375a.BOOLEAN),
        SHORT(Short.class, C11375a.I2_SHORT),
        SHORT_PRIMITIVE(Short.TYPE, C11375a.I2_SHORT),
        INTEGER(Integer.class, C11375a.I4),
        INTEGER_PRIMITIVE(Integer.TYPE, C11375a.I4),
        UNSIGNED_INTEGER_ONE_BYTE(C11373i0.class, C11375a.UI1),
        UNSIGNED_INTEGER_TWO_BYTES(C11380k0.class, C11375a.UI2),
        UNSIGNED_INTEGER_FOUR_BYTES(C11369g0.class, C11375a.UI4),
        FLOAT(Float.class, C11375a.R4),
        FLOAT_PRIMITIVE(Float.TYPE, C11375a.R4),
        DOUBLE(Double.class, C11375a.FLOAT),
        DOUBLE_PRIMTIIVE(Double.TYPE, C11375a.FLOAT),
        CHAR(Character.class, C11375a.CHAR),
        CHAR_PRIMITIVE(Character.TYPE, C11375a.CHAR),
        STRING(String.class, C11375a.STRING),
        CALENDAR(Calendar.class, C11375a.DATETIME),
        BYTES(byte[].class, C11375a.BIN_BASE64),
        URI(URI.class, C11375a.URI);
        

        /* renamed from: a */
        private Class f22603a;

        /* renamed from: b */
        private C11375a f22604b;

        private C11377b(Class cls, C11375a aVar) {
            this.f22603a = cls;
            this.f22604b = aVar;
        }

        /* renamed from: b */
        public static C11377b m29816b(Class cls) {
            for (C11377b bVar : values()) {
                if (bVar.mo36081c().equals(cls)) {
                    return bVar;
                }
            }
            return null;
        }

        /* renamed from: a */
        public C11375a mo36080a() {
            return this.f22604b;
        }

        /* renamed from: c */
        public Class mo36081c() {
            return this.f22603a;
        }

        public String toString() {
            return mo36081c() + " => " + mo36080a();
        }
    }

    /* renamed from: a */
    String mo36041a(V v);

    /* renamed from: b */
    boolean mo36042b(Class cls);

    /* renamed from: c */
    boolean mo36043c(V v);

    /* renamed from: d */
    String mo36044d();

    /* renamed from: e */
    C11375a mo36045e();

    /* renamed from: f */
    V mo36049f(String str);
}
