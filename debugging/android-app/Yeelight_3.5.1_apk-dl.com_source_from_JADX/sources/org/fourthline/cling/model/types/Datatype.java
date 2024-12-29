package org.fourthline.cling.model.types;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.net.URI;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public interface Datatype<V> {

    public enum Builtin {
        UI1("ui1", new C10082e0()),
        UI2("ui2", new C10086g0()),
        UI4("ui4", new C10078c0()),
        I1("i1", new C10093n(1)),
        I2("i2", new C10093n(2)),
        I2_SHORT("i2", new C10099t()),
        I4("i4", new C10093n(4)),
        INT("int", new C10093n(4)),
        R4("r4", new C10091l()),
        R8("r8", new C10090k()),
        NUMBER("number", new C10090k()),
        FIXED144("fixed.14.4", new C10090k()),
        FLOAT(TypedValues.Custom.S_FLOAT, new C10090k()),
        CHAR("char", new C10083f()),
        STRING(TypedValues.Custom.S_STRING, new C10101v()),
        DATE("date", new C10088i(new String[]{"yyyy-MM-dd"}, "yyyy-MM-dd")),
        DATETIME("dateTime", new C10088i(new String[]{"yyyy-MM-dd", "yyyy-MM-dd'T'HH:mm:ss"}, "yyyy-MM-dd'T'HH:mm:ss")),
        DATETIME_TZ("dateTime.tz", new C10088i(new String[]{"yyyy-MM-dd", "yyyy-MM-dd'T'HH:mm:ss", "yyyy-MM-dd'T'HH:mm:ssZ"}, "yyyy-MM-dd'T'HH:mm:ssZ")),
        TIME("time", new C10088i(new String[]{"HH:mm:ss"}, "HH:mm:ss")),
        TIME_TZ("time.tz", new C10088i(new String[]{"HH:mm:ssZ", "HH:mm:ss"}, "HH:mm:ssZ")),
        BOOLEAN(TypedValues.Custom.S_BOOLEAN, new C10079d()),
        BIN_BASE64("bin.base64", new C10075b()),
        BIN_HEX("bin.hex", new C10077c()),
        URI("uri", new C10074a0()),
        UUID("uuid", new C10101v());
        
        private static Map<String, Builtin> byName;
        private Datatype datatype;
        private String descriptorName;

        static {
            byName = new HashMap<String, Builtin>() {
                {
                    for (Builtin builtin : Builtin.values()) {
                        String descriptorName = builtin.getDescriptorName();
                        Locale locale = Locale.ROOT;
                        if (!containsKey(descriptorName.toLowerCase(locale))) {
                            put(builtin.getDescriptorName().toLowerCase(locale), builtin);
                        }
                    }
                }
            };
        }

        private <VT> Builtin(String str, C10073a<VT> aVar) {
            aVar.mo40581h(this);
            this.descriptorName = str;
            this.datatype = aVar;
        }

        public static Builtin getByDescriptorName(String str) {
            if (str == null) {
                return null;
            }
            return byName.get(str.toLowerCase(Locale.ROOT));
        }

        public static boolean isNumeric(Builtin builtin) {
            return builtin != null && (builtin.equals(UI1) || builtin.equals(UI2) || builtin.equals(UI4) || builtin.equals(I1) || builtin.equals(I2) || builtin.equals(I4) || builtin.equals(INT));
        }

        public Datatype getDatatype() {
            return this.datatype;
        }

        public String getDescriptorName() {
            return this.descriptorName;
        }
    }

    public enum Default {
        BOOLEAN(Boolean.class, r2),
        BOOLEAN_PRIMITIVE(Boolean.TYPE, r2),
        SHORT(Short.class, r5),
        SHORT_PRIMITIVE(Short.TYPE, r5),
        INTEGER(Integer.class, r9),
        INTEGER_PRIMITIVE(Integer.TYPE, r9),
        UNSIGNED_INTEGER_ONE_BYTE(C10080d0.class, Builtin.UI1),
        UNSIGNED_INTEGER_TWO_BYTES(C10084f0.class, Builtin.UI2),
        UNSIGNED_INTEGER_FOUR_BYTES(C10076b0.class, Builtin.UI4),
        FLOAT(Float.class, r15),
        FLOAT_PRIMITIVE(Float.TYPE, r15),
        DOUBLE(Double.class, r15),
        DOUBLE_PRIMTIIVE(Double.TYPE, r15),
        CHAR(Character.class, r15),
        CHAR_PRIMITIVE(Character.TYPE, r15),
        STRING(String.class, Builtin.STRING),
        CALENDAR(Calendar.class, Builtin.DATETIME),
        BYTES(byte[].class, Builtin.BIN_BASE64),
        URI(URI.class, Builtin.URI);
        
        private Builtin builtinType;
        private Class javaType;

        private Default(Class cls, Builtin builtin) {
            this.javaType = cls;
            this.builtinType = builtin;
        }

        public static Default getByJavaType(Class cls) {
            for (Default defaultR : values()) {
                if (defaultR.getJavaType().equals(cls)) {
                    return defaultR;
                }
            }
            return null;
        }

        public Builtin getBuiltinType() {
            return this.builtinType;
        }

        public Class getJavaType() {
            return this.javaType;
        }

        public String toString() {
            return getJavaType() + " => " + getBuiltinType();
        }
    }

    /* renamed from: a */
    String mo40556a(V v);

    /* renamed from: b */
    boolean mo40557b(Class cls);

    /* renamed from: c */
    boolean mo40558c(V v);

    /* renamed from: d */
    String mo40559d();

    /* renamed from: e */
    Builtin mo40560e();

    /* renamed from: f */
    V mo40561f(String str);
}
