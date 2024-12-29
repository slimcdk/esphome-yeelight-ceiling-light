package p180k6;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.net.URI;
import java.net.URL;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import org.fourthline.cling.binding.LocalServiceBindingException;
import org.fourthline.cling.binding.annotations.UpnpAction;
import org.fourthline.cling.binding.annotations.UpnpService;
import org.fourthline.cling.binding.annotations.UpnpServiceId;
import org.fourthline.cling.binding.annotations.UpnpServiceType;
import org.fourthline.cling.binding.annotations.UpnpStateVariable;
import org.fourthline.cling.binding.annotations.UpnpStateVariables;
import org.fourthline.cling.model.C10023k;
import org.fourthline.cling.model.ValidationException;
import org.fourthline.cling.model.meta.C10066a;
import org.fourthline.cling.model.meta.C10069d;
import org.fourthline.cling.model.meta.C10071f;
import org.fourthline.cling.model.types.C10097r;
import org.fourthline.cling.model.types.C10098s;
import org.fourthline.cling.model.types.C10103x;
import org.fourthline.cling.model.types.C10104y;
import org.fourthline.cling.model.types.csv.CSV;
import org.seamless.util.C10247d;
import p193o6.C9791c;
import p193o6.C9794f;
import p214t6.C10404d;
import p226w6.C11955a;
import p226w6.C11956b;
import p226w6.C11957c;

/* renamed from: k6.b */
public class C9299b {

    /* renamed from: a */
    private static Logger f17226a = Logger.getLogger(C9299b.class.getName());

    /* renamed from: g */
    static String m22780g(String str) {
        if (str.length() >= 1) {
            return str.substring(0, 1).toLowerCase(Locale.ROOT) + str.substring(1);
        }
        throw new IllegalArgumentException("Variable name must be at least 1 character long");
    }

    /* renamed from: h */
    static String m22781h(String str) {
        if (str.length() >= 1) {
            return str.substring(0, 1).toUpperCase(Locale.ROOT) + str.substring(1);
        }
        throw new IllegalArgumentException("Action name must be at least 1 character long");
    }

    /* renamed from: i */
    static String m22782i(String str) {
        if (str.length() >= 1) {
            return str.substring(0, 1).toUpperCase(Locale.ROOT) + str.substring(1);
        }
        throw new IllegalArgumentException("Variable name must be at least 1 character long");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo37843a(C10066a aVar) {
        return false;
    }

    /* renamed from: b */
    public C10404d mo37844b(Class<?> cls) {
        Logger logger = f17226a;
        logger.fine("Reading and binding annotations of service implementation class: " + cls);
        if (cls.isAnnotationPresent(UpnpService.class)) {
            UpnpService upnpService = (UpnpService) cls.getAnnotation(UpnpService.class);
            UpnpServiceId serviceId = upnpService.serviceId();
            UpnpServiceType serviceType = upnpService.serviceType();
            return mo37845c(cls, serviceId.namespace().equals("upnp-org") ? new C10103x(serviceId.value()) : new C10097r(serviceId.namespace(), serviceId.value()), serviceType.namespace().equals("schemas-upnp-org") ? new C10104y(serviceType.value(), serviceType.version()) : new C10098s(serviceType.namespace(), serviceType.value(), serviceType.version()), upnpService.supportsQueryStateVariables(), mo37848f(upnpService.stringConvertibleTypes()));
        }
        throw new LocalServiceBindingException("Given class is not an @UpnpService");
    }

    /* renamed from: c */
    public C10404d mo37845c(Class<?> cls, C10097r rVar, C10098s sVar, boolean z, Set<Class> set) {
        Map<C10071f, C11957c> e = mo37847e(cls, set);
        Map<C10066a, C9791c> d = mo37846d(cls, e, set);
        if (z) {
            d.put(new C10069d(), new C9794f());
        }
        try {
            return new C10404d(sVar, rVar, d, e, set, z);
        } catch (ValidationException e2) {
            Logger logger = f17226a;
            logger.severe("Could not validate device model: " + e2.toString());
            for (C10023k kVar : e2.getErrors()) {
                f17226a.severe(kVar.toString());
            }
            throw new LocalServiceBindingException("Validation of model failed, check the log");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public Map<C10066a, C9791c> mo37846d(Class<?> cls, Map<C10071f, C11957c> map, Set<Class> set) {
        HashMap hashMap = new HashMap();
        for (Method aVar : C10247d.m25771i(cls, UpnpAction.class)) {
            C10066a a = new C9298a(aVar, map, set).mo37831a(hashMap);
            if (mo37843a(a)) {
                hashMap.remove(a);
            }
        }
        return hashMap;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public Map<C10071f, C11957c> mo37847e(Class<?> cls, Set<Class> set) {
        HashMap hashMap = new HashMap();
        if (cls.isAnnotationPresent(UpnpStateVariables.class)) {
            UpnpStateVariables upnpStateVariables = (UpnpStateVariables) cls.getAnnotation(UpnpStateVariables.class);
            UpnpStateVariable[] value = upnpStateVariables.value();
            int length = value.length;
            int i = 0;
            while (i < length) {
                UpnpStateVariable upnpStateVariable = value[i];
                if (upnpStateVariable.name().length() != 0) {
                    String g = m22780g(upnpStateVariable.name());
                    Method f = C10247d.m25768f(cls, g);
                    Field d = C10247d.m25766d(cls, g);
                    C11957c cVar = null;
                    if (f != null && d != null) {
                        cVar = upnpStateVariables.preferFields() ? new C11955a(d) : new C11956b(f);
                    } else if (d != null) {
                        cVar = new C11955a(d);
                    } else if (f != null) {
                        cVar = new C11956b(f);
                    } else {
                        Logger logger = f17226a;
                        logger.finer("No field or getter found for state variable, skipping accessor: " + upnpStateVariable.name());
                    }
                    hashMap.put(new C9300c(upnpStateVariable, upnpStateVariable.name(), cVar, set).mo37851c(), cVar);
                    i++;
                } else {
                    throw new LocalServiceBindingException("Class-level @UpnpStateVariable name attribute value required");
                }
            }
        }
        for (Field next : C10247d.m25767e(cls, UpnpStateVariable.class)) {
            UpnpStateVariable upnpStateVariable2 = (UpnpStateVariable) next.getAnnotation(UpnpStateVariable.class);
            C11955a aVar = new C11955a(next);
            hashMap.put(new C9300c(upnpStateVariable2, upnpStateVariable2.name().length() == 0 ? m22782i(next.getName()) : upnpStateVariable2.name(), aVar, set).mo37851c(), aVar);
        }
        for (Method next2 : C10247d.m25771i(cls, UpnpStateVariable.class)) {
            String h = C10247d.m25770h(next2.getName());
            if (h == null) {
                throw new LocalServiceBindingException("Annotated method is not a getter method (: " + next2);
            } else if (next2.getParameterTypes().length <= 0) {
                UpnpStateVariable upnpStateVariable3 = (UpnpStateVariable) next2.getAnnotation(UpnpStateVariable.class);
                C11956b bVar = new C11956b(next2);
                hashMap.put(new C9300c(upnpStateVariable3, upnpStateVariable3.name().length() == 0 ? m22782i(h) : upnpStateVariable3.name(), bVar, set).mo37851c(), bVar);
            } else {
                throw new LocalServiceBindingException("Getter method defined as @UpnpStateVariable can not have parameters: " + next2);
            }
        }
        return hashMap;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public Set<Class> mo37848f(Class[] clsArr) {
        int length = clsArr.length;
        int i = 0;
        while (i < length) {
            Class cls = clsArr[i];
            if (Modifier.isPublic(cls.getModifiers())) {
                try {
                    cls.getConstructor(new Class[]{String.class});
                    i++;
                } catch (NoSuchMethodException unused) {
                    throw new LocalServiceBindingException("Declared string-convertible type needs a public single-argument String constructor: " + cls);
                }
            } else {
                throw new LocalServiceBindingException("Declared string-convertible type must be public: " + cls);
            }
        }
        HashSet hashSet = new HashSet(Arrays.asList(clsArr));
        hashSet.add(URI.class);
        hashSet.add(URL.class);
        hashSet.add(CSV.class);
        return hashSet;
    }
}
