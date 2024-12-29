package org.fourthline.cling.binding.annotations;

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
import p164h.p165b.p166a.p237f.C11176c;
import p164h.p165b.p166a.p240h.C11222l;
import p164h.p165b.p166a.p240h.C11223m;
import p164h.p165b.p166a.p240h.p241p.C11231e;
import p164h.p165b.p166a.p240h.p241p.C11234h;
import p164h.p165b.p166a.p240h.p248s.C11320a;
import p164h.p165b.p166a.p240h.p248s.C11328h;
import p164h.p165b.p166a.p240h.p248s.C11331k;
import p164h.p165b.p166a.p240h.p248s.C11336p;
import p164h.p165b.p166a.p240h.p251v.C11351a;
import p164h.p165b.p166a.p240h.p251v.C11352b;
import p164h.p165b.p166a.p240h.p251v.C11353c;
import p164h.p165b.p166a.p240h.p252w.C11361c0;
import p164h.p165b.p166a.p240h.p252w.C11363d0;
import p164h.p165b.p166a.p240h.p252w.C11396w;
import p164h.p165b.p166a.p240h.p252w.C11397x;
import p164h.p165b.p166a.p240h.p252w.p253n0.C11387a;
import p164h.p257c.p259b.C11499d;

/* renamed from: org.fourthline.cling.binding.annotations.b */
public class C11735b {

    /* renamed from: a */
    private static Logger f23122a = Logger.getLogger(C11735b.class.getName());

    /* renamed from: g */
    static String m30476g(String str) {
        if (str.length() >= 1) {
            return str.substring(0, 1).toLowerCase(Locale.ROOT) + str.substring(1);
        }
        throw new IllegalArgumentException("Variable name must be at least 1 character long");
    }

    /* renamed from: h */
    static String m30477h(String str) {
        if (str.length() >= 1) {
            return str.substring(0, 1).toUpperCase(Locale.ROOT) + str.substring(1);
        }
        throw new IllegalArgumentException("Action name must be at least 1 character long");
    }

    /* renamed from: i */
    static String m30478i(String str) {
        if (str.length() >= 1) {
            return str.substring(0, 1).toUpperCase(Locale.ROOT) + str.substring(1);
        }
        throw new IllegalArgumentException("Variable name must be at least 1 character long");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo37284a(C11320a aVar) {
        return false;
    }

    /* renamed from: b */
    public C11328h mo37285b(Class<?> cls) {
        Logger logger = f23122a;
        logger.fine("Reading and binding annotations of service implementation class: " + cls);
        if (cls.isAnnotationPresent(UpnpService.class)) {
            UpnpService upnpService = (UpnpService) cls.getAnnotation(UpnpService.class);
            UpnpServiceId serviceId = upnpService.serviceId();
            UpnpServiceType serviceType = upnpService.serviceType();
            return mo37286c(cls, serviceId.namespace().equals("upnp-org") ? new C11361c0(serviceId.value()) : new C11396w(serviceId.namespace(), serviceId.value()), serviceType.namespace().equals("schemas-upnp-org") ? new C11363d0(serviceType.value(), serviceType.version()) : new C11397x(serviceType.namespace(), serviceType.value(), serviceType.version()), upnpService.supportsQueryStateVariables(), mo37289f(upnpService.stringConvertibleTypes()));
        }
        throw new C11176c("Given class is not an @UpnpService");
    }

    /* renamed from: c */
    public C11328h mo37286c(Class<?> cls, C11396w wVar, C11397x xVar, boolean z, Set<Class> set) {
        Map<C11336p, C11353c> e = mo37288e(cls, set);
        Map<C11320a, C11231e> d = mo37287d(cls, e, set);
        if (z) {
            d.put(new C11331k(), new C11234h());
        }
        try {
            return new C11328h(xVar, wVar, d, e, set, z);
        } catch (C11223m e2) {
            Logger logger = f23122a;
            logger.severe("Could not validate device model: " + e2.toString());
            for (C11222l lVar : e2.mo35687a()) {
                f23122a.severe(lVar.toString());
            }
            throw new C11176c("Validation of model failed, check the log");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public Map<C11320a, C11231e> mo37287d(Class<?> cls, Map<C11336p, C11353c> map, Set<Class> set) {
        HashMap hashMap = new HashMap();
        for (Method aVar : C11499d.m30191i(cls, UpnpAction.class)) {
            C11320a a = new C11734a(aVar, map, set).mo37272a(hashMap);
            if (mo37284a(a)) {
                hashMap.remove(a);
            }
        }
        return hashMap;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public Map<C11336p, C11353c> mo37288e(Class<?> cls, Set<Class> set) {
        HashMap hashMap = new HashMap();
        if (cls.isAnnotationPresent(UpnpStateVariables.class)) {
            UpnpStateVariables upnpStateVariables = (UpnpStateVariables) cls.getAnnotation(UpnpStateVariables.class);
            UpnpStateVariable[] value = upnpStateVariables.value();
            int length = value.length;
            int i = 0;
            while (i < length) {
                UpnpStateVariable upnpStateVariable = value[i];
                if (upnpStateVariable.name().length() != 0) {
                    String g = m30476g(upnpStateVariable.name());
                    Method f = C11499d.m30188f(cls, g);
                    Field d = C11499d.m30186d(cls, g);
                    C11353c cVar = null;
                    if (f != null && d != null) {
                        cVar = upnpStateVariables.preferFields() ? new C11351a(d) : new C11352b(f);
                    } else if (d != null) {
                        cVar = new C11351a(d);
                    } else if (f != null) {
                        cVar = new C11352b(f);
                    } else {
                        Logger logger = f23122a;
                        logger.finer("No field or getter found for state variable, skipping accessor: " + upnpStateVariable.name());
                    }
                    hashMap.put(new C11736c(upnpStateVariable, upnpStateVariable.name(), cVar, set).mo37292c(), cVar);
                    i++;
                } else {
                    throw new C11176c("Class-level @UpnpStateVariable name attribute value required");
                }
            }
        }
        for (Field next : C11499d.m30187e(cls, UpnpStateVariable.class)) {
            UpnpStateVariable upnpStateVariable2 = (UpnpStateVariable) next.getAnnotation(UpnpStateVariable.class);
            C11351a aVar = new C11351a(next);
            hashMap.put(new C11736c(upnpStateVariable2, upnpStateVariable2.name().length() == 0 ? m30478i(next.getName()) : upnpStateVariable2.name(), aVar, set).mo37292c(), aVar);
        }
        for (Method next2 : C11499d.m30191i(cls, UpnpStateVariable.class)) {
            String h = C11499d.m30190h(next2.getName());
            if (h == null) {
                throw new C11176c("Annotated method is not a getter method (: " + next2);
            } else if (next2.getParameterTypes().length <= 0) {
                UpnpStateVariable upnpStateVariable3 = (UpnpStateVariable) next2.getAnnotation(UpnpStateVariable.class);
                C11352b bVar = new C11352b(next2);
                hashMap.put(new C11736c(upnpStateVariable3, upnpStateVariable3.name().length() == 0 ? m30478i(h) : upnpStateVariable3.name(), bVar, set).mo37292c(), bVar);
            } else {
                throw new C11176c("Getter method defined as @UpnpStateVariable can not have parameters: " + next2);
            }
        }
        return hashMap;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public Set<Class> mo37289f(Class[] clsArr) {
        int length = clsArr.length;
        int i = 0;
        while (i < length) {
            Class cls = clsArr[i];
            if (Modifier.isPublic(cls.getModifiers())) {
                try {
                    cls.getConstructor(new Class[]{String.class});
                    i++;
                } catch (NoSuchMethodException unused) {
                    throw new C11176c("Declared string-convertible type needs a public single-argument String constructor: " + cls);
                }
            } else {
                throw new C11176c("Declared string-convertible type must be public: " + cls);
            }
        }
        HashSet hashSet = new HashSet(Arrays.asList(clsArr));
        hashSet.add(URI.class);
        hashSet.add(URL.class);
        hashSet.add(C11387a.class);
        return hashSet;
    }
}
