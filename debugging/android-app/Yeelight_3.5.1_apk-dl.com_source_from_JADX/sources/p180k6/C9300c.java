package p180k6;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.Set;
import java.util.logging.Logger;
import org.fourthline.cling.binding.LocalServiceBindingException;
import org.fourthline.cling.binding.annotations.UpnpStateVariable;
import org.fourthline.cling.model.C10018f;
import org.fourthline.cling.model.meta.C10071f;
import org.fourthline.cling.model.types.Datatype;
import p176j6.C9214a;
import p176j6.C9215b;
import p214t6.C10410j;
import p214t6.C10411k;
import p214t6.C10412l;
import p226w6.C11957c;

/* renamed from: k6.c */
public class C9300c {

    /* renamed from: e */
    private static Logger f17227e = Logger.getLogger(C9299b.class.getName());

    /* renamed from: a */
    protected UpnpStateVariable f17228a;

    /* renamed from: b */
    protected String f17229b;

    /* renamed from: c */
    protected C11957c f17230c;

    /* renamed from: d */
    protected Set<Class> f17231d;

    public C9300c(UpnpStateVariable upnpStateVariable, String str, C11957c cVar, Set<Class> set) {
        this.f17228a = upnpStateVariable;
        this.f17229b = str;
        this.f17230c = cVar;
        this.f17231d = set;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Datatype mo37849a() {
        Datatype.Builtin byDescriptorName;
        String datatype = mo37857i().datatype();
        if (datatype.length() == 0 && mo37852d() != null) {
            Class<?> a = mo37852d().mo42502a();
            Logger logger = f17227e;
            logger.finer("Using accessor return type as state variable type: " + a);
            if (C10018f.m24805d(mo37859k(), a)) {
                f17227e.finer("Return type is string-convertible, using string datatype");
                byDescriptorName = Datatype.Default.STRING.getBuiltinType();
            } else {
                Datatype.Default byJavaType = Datatype.Default.getByJavaType(a);
                if (byJavaType != null) {
                    Logger logger2 = f17227e;
                    logger2.finer("Return type has default UPnP datatype: " + byJavaType);
                    byDescriptorName = byJavaType.getBuiltinType();
                }
            }
            return byDescriptorName.getDatatype();
        }
        if (datatype.length() == 0 && (mo37857i().allowedValues().length > 0 || mo37857i().allowedValuesEnum() != Void.TYPE)) {
            f17227e.finer("State variable has restricted allowed values, hence using 'string' datatype");
            datatype = TypedValues.Custom.S_STRING;
        }
        if (datatype.length() != 0) {
            Logger logger3 = f17227e;
            logger3.finer("Trying to find built-in UPnP datatype for detected name: " + datatype);
            byDescriptorName = Datatype.Builtin.getByDescriptorName(datatype);
            if (byDescriptorName != null) {
                Logger logger4 = f17227e;
                logger4.finer("Found built-in UPnP datatype: " + byDescriptorName);
                return byDescriptorName.getDatatype();
            }
            throw new LocalServiceBindingException("No built-in UPnP datatype found, using CustomDataType (TODO: NOT IMPLEMENTED)");
        }
        throw new LocalServiceBindingException("Could not detect datatype of state variable: " + mo37858j());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public String mo37850b(Datatype datatype) {
        if (mo37857i().defaultValue().length() == 0) {
            return null;
        }
        try {
            datatype.mo40561f(mo37857i().defaultValue());
            Logger logger = f17227e;
            logger.finer("Found state variable default value: " + mo37857i().defaultValue());
            return mo37857i().defaultValue();
        } catch (Exception e) {
            throw new LocalServiceBindingException("Default value doesn't match datatype of state variable '" + mo37858j() + "': " + e.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public C10071f mo37851c() {
        String[] strArr;
        int i;
        int i2;
        boolean z;
        Class<?> a;
        f17227e.fine("Creating state variable '" + mo37858j() + "' with accessor: " + mo37852d());
        Datatype a2 = mo37849a();
        String b = mo37850b(a2);
        C10410j jVar = null;
        int i3 = 0;
        if (Datatype.Builtin.STRING.equals(a2.mo40560e())) {
            if (mo37857i().allowedValueProvider() != Void.TYPE) {
                strArr = mo37856h();
            } else if (mo37857i().allowedValues().length > 0) {
                strArr = mo37857i().allowedValues();
            } else {
                if (mo37857i().allowedValuesEnum() != Void.TYPE) {
                    a = mo37857i().allowedValuesEnum();
                } else if (mo37852d() == null || !mo37852d().mo42502a().isEnum()) {
                    f17227e.finer("Not restricting allowed values (of string typed state var): " + mo37858j());
                    strArr = null;
                } else {
                    a = mo37852d().mo42502a();
                }
                strArr = mo37855g(a);
            }
            if (!(strArr == null || b == null)) {
                int length = strArr.length;
                int i4 = 0;
                while (true) {
                    if (i4 >= length) {
                        z = false;
                        break;
                    } else if (strArr[i4].equals(b)) {
                        z = true;
                        break;
                    } else {
                        i4++;
                    }
                }
                if (!z) {
                    throw new LocalServiceBindingException("Default value '" + b + "' is not in allowed values of: " + mo37858j());
                }
            }
        } else {
            strArr = null;
        }
        if (Datatype.Builtin.isNumeric(a2.mo40560e())) {
            if (mo37857i().allowedValueRangeProvider() != Void.TYPE) {
                jVar = mo37853e();
            } else if (mo37857i().allowedValueMinimum() > 0 || mo37857i().allowedValueMaximum() > 0) {
                jVar = mo37854f(mo37857i().allowedValueMinimum(), mo37857i().allowedValueMaximum(), mo37857i().allowedValueStep());
            } else {
                f17227e.finer("Not restricting allowed value range (of numeric typed state var): " + mo37858j());
            }
            if (!(b == null || jVar == null)) {
                try {
                    if (!jVar.mo42107d(Long.valueOf(b).longValue())) {
                        throw new LocalServiceBindingException("Default value '" + b + "' is not in allowed range of: " + mo37858j());
                    }
                } catch (Exception unused) {
                    throw new LocalServiceBindingException("Default value '" + b + "' is not numeric (for range checking) of: " + mo37858j());
                }
            }
        }
        boolean sendEvents = mo37857i().sendEvents();
        if (!sendEvents || mo37852d() != null) {
            if (sendEvents) {
                if (mo37857i().eventMaximumRateMilliseconds() > 0) {
                    f17227e.finer("Moderating state variable events using maximum rate (milliseconds): " + mo37857i().eventMaximumRateMilliseconds());
                    i2 = mo37857i().eventMaximumRateMilliseconds();
                } else {
                    i2 = 0;
                }
                if (mo37857i().eventMinimumDelta() <= 0 || !Datatype.Builtin.isNumeric(a2.mo40560e())) {
                    i3 = i2;
                } else {
                    f17227e.finer("Moderating state variable events using minimum delta: " + mo37857i().eventMinimumDelta());
                    int i5 = i2;
                    i = mo37857i().eventMinimumDelta();
                    i3 = i5;
                    return new C10071f(mo37858j(), new C10412l(a2, b, strArr, jVar), new C10411k(sendEvents, i3, i));
                }
            }
            i = 0;
            return new C10071f(mo37858j(), new C10412l(a2, b, strArr, jVar), new C10411k(sendEvents, i3, i));
        }
        throw new LocalServiceBindingException("State variable sends events but has no accessor for field or getter: " + mo37858j());
    }

    /* renamed from: d */
    public C11957c mo37852d() {
        return this.f17230c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public C10410j mo37853e() {
        Class<C9215b> cls = C9215b.class;
        Class allowedValueRangeProvider = mo37857i().allowedValueRangeProvider();
        if (cls.isAssignableFrom(allowedValueRangeProvider)) {
            try {
                C9215b bVar = (C9215b) allowedValueRangeProvider.newInstance();
                return mo37854f(bVar.mo37307b(), bVar.mo37308c(), bVar.mo37306a());
            } catch (Exception e) {
                throw new LocalServiceBindingException("Allowed value range provider can't be instantiated: " + mo37858j(), e);
            }
        } else {
            throw new LocalServiceBindingException("Allowed value range provider is not of type " + cls + ": " + mo37858j());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public C10410j mo37854f(long j, long j2, long j3) {
        if (j2 >= j) {
            return new C10410j(j, j2, j3);
        }
        throw new LocalServiceBindingException("Allowed value range maximum is smaller than minimum: " + mo37858j());
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public String[] mo37855g(Class cls) {
        if (cls.isEnum()) {
            Logger logger = f17227e;
            logger.finer("Restricting allowed values of state variable to Enum: " + mo37858j());
            String[] strArr = new String[cls.getEnumConstants().length];
            int i = 0;
            while (i < cls.getEnumConstants().length) {
                Object obj = cls.getEnumConstants()[i];
                if (obj.toString().length() <= 32) {
                    Logger logger2 = f17227e;
                    logger2.finer("Adding allowed value (converted to string): " + obj.toString());
                    strArr[i] = obj.toString();
                    i++;
                } else {
                    throw new LocalServiceBindingException("Allowed value string (that is, Enum constant name) is longer than 32 characters: " + obj.toString());
                }
            }
            return strArr;
        }
        throw new LocalServiceBindingException("Allowed values type is not an Enum: " + cls);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public String[] mo37856h() {
        Class<C9214a> cls = C9214a.class;
        Class allowedValueProvider = mo37857i().allowedValueProvider();
        if (cls.isAssignableFrom(allowedValueProvider)) {
            try {
                return ((C9214a) allowedValueProvider.newInstance()).mo37305a();
            } catch (Exception e) {
                throw new LocalServiceBindingException("Allowed value provider can't be instantiated: " + mo37858j(), e);
            }
        } else {
            throw new LocalServiceBindingException("Allowed value provider is not of type " + cls + ": " + mo37858j());
        }
    }

    /* renamed from: i */
    public UpnpStateVariable mo37857i() {
        return this.f17228a;
    }

    /* renamed from: j */
    public String mo37858j() {
        return this.f17229b;
    }

    /* renamed from: k */
    public Set<Class> mo37859k() {
        return this.f17231d;
    }
}
