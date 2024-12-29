package org.fourthline.cling.binding.annotations;

import java.util.Set;
import java.util.logging.Logger;
import p164h.p165b.p166a.p237f.C11174a;
import p164h.p165b.p166a.p237f.C11175b;
import p164h.p165b.p166a.p237f.C11176c;
import p164h.p165b.p166a.p240h.C11216f;
import p164h.p165b.p166a.p240h.p248s.C11336p;
import p164h.p165b.p166a.p240h.p248s.C11337q;
import p164h.p165b.p166a.p240h.p248s.C11338r;
import p164h.p165b.p166a.p240h.p248s.C11339s;
import p164h.p165b.p166a.p240h.p251v.C11353c;
import p164h.p165b.p166a.p240h.p252w.C11374j;

/* renamed from: org.fourthline.cling.binding.annotations.c */
public class C11736c {

    /* renamed from: e */
    private static Logger f23123e = Logger.getLogger(C11735b.class.getName());

    /* renamed from: a */
    protected UpnpStateVariable f23124a;

    /* renamed from: b */
    protected String f23125b;

    /* renamed from: c */
    protected C11353c f23126c;

    /* renamed from: d */
    protected Set<Class> f23127d;

    public C11736c(UpnpStateVariable upnpStateVariable, String str, C11353c cVar, Set<Class> set) {
        this.f23124a = upnpStateVariable;
        this.f23125b = str;
        this.f23126c = cVar;
        this.f23127d = set;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C11374j mo37290a() {
        C11374j.C11375a a;
        String datatype = mo37298i().datatype();
        if (datatype.length() == 0 && mo37293d() != null) {
            Class<?> a2 = mo37293d().mo36034a();
            Logger logger = f23123e;
            logger.finer("Using accessor return type as state variable type: " + a2);
            if (C11216f.m29267d(mo37300k(), a2)) {
                f23123e.finer("Return type is string-convertible, using string datatype");
                a = C11374j.C11377b.STRING.mo36080a();
            } else {
                C11374j.C11377b b = C11374j.C11377b.m29816b(a2);
                if (b != null) {
                    Logger logger2 = f23123e;
                    logger2.finer("Return type has default UPnP datatype: " + b);
                    a = b.mo36080a();
                }
            }
            return a.mo36078b();
        }
        if ((datatype == null || datatype.length() == 0) && (mo37298i().allowedValues().length > 0 || mo37298i().allowedValuesEnum() != Void.TYPE)) {
            f23123e.finer("State variable has restricted allowed values, hence using 'string' datatype");
            datatype = "string";
        }
        if (datatype == null || datatype.length() == 0) {
            throw new C11176c("Could not detect datatype of state variable: " + mo37299j());
        }
        Logger logger3 = f23123e;
        logger3.finer("Trying to find built-in UPnP datatype for detected name: " + datatype);
        a = C11374j.C11375a.m29812a(datatype);
        if (a != null) {
            Logger logger4 = f23123e;
            logger4.finer("Found built-in UPnP datatype: " + a);
            return a.mo36078b();
        }
        throw new C11176c("No built-in UPnP datatype found, using CustomDataType (TODO: NOT IMPLEMENTED)");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public String mo37291b(C11374j jVar) {
        if (mo37298i().defaultValue().length() == 0) {
            return null;
        }
        try {
            jVar.mo36049f(mo37298i().defaultValue());
            Logger logger = f23123e;
            logger.finer("Found state variable default value: " + mo37298i().defaultValue());
            return mo37298i().defaultValue();
        } catch (Exception e) {
            throw new C11176c("Default value doesn't match datatype of state variable '" + mo37299j() + "': " + e.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public C11336p mo37292c() {
        String[] strArr;
        int i;
        int i2;
        boolean z;
        Class<?> a;
        f23123e.fine("Creating state variable '" + mo37299j() + "' with accessor: " + mo37293d());
        C11374j a2 = mo37290a();
        String b = mo37291b(a2);
        C11337q qVar = null;
        int i3 = 0;
        if (C11374j.C11375a.STRING.equals(a2.mo36045e())) {
            if (mo37298i().allowedValueProvider() != Void.TYPE) {
                strArr = mo37297h();
            } else if (mo37298i().allowedValues().length > 0) {
                strArr = mo37298i().allowedValues();
            } else {
                if (mo37298i().allowedValuesEnum() != Void.TYPE) {
                    a = mo37298i().allowedValuesEnum();
                } else if (mo37293d() == null || !mo37293d().mo36034a().isEnum()) {
                    f23123e.finer("Not restricting allowed values (of string typed state var): " + mo37299j());
                    strArr = null;
                } else {
                    a = mo37293d().mo36034a();
                }
                strArr = mo37296g(a);
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
                    throw new C11176c("Default value '" + b + "' is not in allowed values of: " + mo37299j());
                }
            }
        } else {
            strArr = null;
        }
        if (C11374j.C11375a.m29813d(a2.mo36045e())) {
            if (mo37298i().allowedValueRangeProvider() != Void.TYPE) {
                qVar = mo37294e();
            } else if (mo37298i().allowedValueMinimum() > 0 || mo37298i().allowedValueMaximum() > 0) {
                qVar = mo37295f(mo37298i().allowedValueMinimum(), mo37298i().allowedValueMaximum(), mo37298i().allowedValueStep());
            } else {
                f23123e.finer("Not restricting allowed value range (of numeric typed state var): " + mo37299j());
            }
            if (!(b == null || qVar == null)) {
                try {
                    if (!qVar.mo36004d(Long.valueOf(b).longValue())) {
                        throw new C11176c("Default value '" + b + "' is not in allowed range of: " + mo37299j());
                    }
                } catch (Exception unused) {
                    throw new C11176c("Default value '" + b + "' is not numeric (for range checking) of: " + mo37299j());
                }
            }
        }
        boolean sendEvents = mo37298i().sendEvents();
        if (!sendEvents || mo37293d() != null) {
            if (sendEvents) {
                if (mo37298i().eventMaximumRateMilliseconds() > 0) {
                    f23123e.finer("Moderating state variable events using maximum rate (milliseconds): " + mo37298i().eventMaximumRateMilliseconds());
                    i2 = mo37298i().eventMaximumRateMilliseconds();
                } else {
                    i2 = 0;
                }
                if (mo37298i().eventMinimumDelta() <= 0 || !C11374j.C11375a.m29813d(a2.mo36045e())) {
                    i3 = i2;
                } else {
                    f23123e.finer("Moderating state variable events using minimum delta: " + mo37298i().eventMinimumDelta());
                    int i5 = i2;
                    i = mo37298i().eventMinimumDelta();
                    i3 = i5;
                    return new C11336p(mo37299j(), new C11339s(a2, b, strArr, qVar), new C11338r(sendEvents, i3, i));
                }
            }
            i = 0;
            return new C11336p(mo37299j(), new C11339s(a2, b, strArr, qVar), new C11338r(sendEvents, i3, i));
        }
        throw new C11176c("State variable sends events but has no accessor for field or getter: " + mo37299j());
    }

    /* renamed from: d */
    public C11353c mo37293d() {
        return this.f23126c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public C11337q mo37294e() {
        Class<C11175b> cls = C11175b.class;
        Class allowedValueRangeProvider = mo37298i().allowedValueRangeProvider();
        if (cls.isAssignableFrom(allowedValueRangeProvider)) {
            try {
                C11175b bVar = (C11175b) allowedValueRangeProvider.newInstance();
                return mo37295f(bVar.mo35530b(), bVar.mo35531c(), bVar.mo35529a());
            } catch (Exception e) {
                throw new C11176c("Allowed value range provider can't be instantiated: " + mo37299j(), e);
            }
        } else {
            throw new C11176c("Allowed value range provider is not of type " + cls + ": " + mo37299j());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public C11337q mo37295f(long j, long j2, long j3) {
        if (j2 >= j) {
            return new C11337q(j, j2, j3);
        }
        throw new C11176c("Allowed value range maximum is smaller than minimum: " + mo37299j());
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public String[] mo37296g(Class cls) {
        if (cls.isEnum()) {
            Logger logger = f23123e;
            logger.finer("Restricting allowed values of state variable to Enum: " + mo37299j());
            String[] strArr = new String[cls.getEnumConstants().length];
            int i = 0;
            while (i < cls.getEnumConstants().length) {
                Object obj = cls.getEnumConstants()[i];
                if (obj.toString().length() <= 32) {
                    Logger logger2 = f23123e;
                    logger2.finer("Adding allowed value (converted to string): " + obj.toString());
                    strArr[i] = obj.toString();
                    i++;
                } else {
                    throw new C11176c("Allowed value string (that is, Enum constant name) is longer than 32 characters: " + obj.toString());
                }
            }
            return strArr;
        }
        throw new C11176c("Allowed values type is not an Enum: " + cls);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public String[] mo37297h() {
        Class<C11174a> cls = C11174a.class;
        Class allowedValueProvider = mo37298i().allowedValueProvider();
        if (cls.isAssignableFrom(allowedValueProvider)) {
            try {
                return ((C11174a) allowedValueProvider.newInstance()).mo35528a();
            } catch (Exception e) {
                throw new C11176c("Allowed value provider can't be instantiated: " + mo37299j(), e);
            }
        } else {
            throw new C11176c("Allowed value provider is not of type " + cls + ": " + mo37299j());
        }
    }

    /* renamed from: i */
    public UpnpStateVariable mo37298i() {
        return this.f23124a;
    }

    /* renamed from: j */
    public String mo37299j() {
        return this.f23125b;
    }

    /* renamed from: k */
    public Set<Class> mo37300k() {
        return this.f23127d;
    }
}
