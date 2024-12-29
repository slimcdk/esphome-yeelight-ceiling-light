package org.fourthline.cling.binding.annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import p164h.p165b.p166a.p237f.C11176c;
import p164h.p165b.p166a.p240h.C11216f;
import p164h.p165b.p166a.p240h.p241p.C11231e;
import p164h.p165b.p166a.p240h.p241p.C11233g;
import p164h.p165b.p166a.p240h.p248s.C11320a;
import p164h.p165b.p166a.p240h.p248s.C11321b;
import p164h.p165b.p166a.p240h.p248s.C11328h;
import p164h.p165b.p166a.p240h.p248s.C11336p;
import p164h.p165b.p166a.p240h.p249t.C11343c;
import p164h.p165b.p166a.p240h.p251v.C11352b;
import p164h.p165b.p166a.p240h.p251v.C11353c;
import p164h.p165b.p166a.p240h.p252w.C11374j;
import p164h.p257c.p259b.C11499d;

/* renamed from: org.fourthline.cling.binding.annotations.a */
public class C11734a {

    /* renamed from: e */
    private static Logger f23117e = Logger.getLogger(C11735b.class.getName());

    /* renamed from: a */
    protected UpnpAction f23118a;

    /* renamed from: b */
    protected Method f23119b;

    /* renamed from: c */
    protected Map<C11336p, C11353c> f23120c;

    /* renamed from: d */
    protected Set<Class> f23121d;

    public C11734a(Method method, Map<C11336p, C11353c> map, Set<Class> set) {
        this.f23118a = (UpnpAction) method.getAnnotation(UpnpAction.class);
        this.f23120c = map;
        this.f23119b = method;
        this.f23121d = set;
    }

    /* renamed from: a */
    public C11320a mo37272a(Map<C11320a, C11231e> map) {
        String name = mo37278g().name().length() != 0 ? mo37278g().name() : C11735b.m30477h(mo37279h().getName());
        Logger logger = f23117e;
        logger.fine("Creating action and executor: " + name);
        List<C11321b> c = mo37274c();
        Map<C11321b<C11328h>, C11353c> d = mo37275d();
        c.addAll(d.keySet());
        C11320a aVar = new C11320a(name, (C11321b[]) c.toArray(new C11321b[c.size()]));
        map.put(aVar, mo37273b(d));
        return aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C11231e mo37273b(Map<C11321b<C11328h>, C11353c> map) {
        return new C11233g(map, mo37279h());
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public List<C11321b> mo37274c() {
        ArrayList arrayList = new ArrayList();
        Annotation[][] parameterAnnotations = mo37279h().getParameterAnnotations();
        int i = 0;
        for (int i2 = 0; i2 < parameterAnnotations.length; i2++) {
            for (Annotation annotation : parameterAnnotations[i2]) {
                if (annotation instanceof UpnpInputArgument) {
                    UpnpInputArgument upnpInputArgument = (UpnpInputArgument) annotation;
                    i++;
                    String name = upnpInputArgument.name();
                    C11336p f = mo37277f(upnpInputArgument.stateVariable(), name, mo37279h().getName());
                    if (f != null) {
                        mo37283l(f, mo37279h().getParameterTypes()[i2]);
                        arrayList.add(new C11321b(name, upnpInputArgument.aliases(), f.mo35994b(), C11321b.C11322a.IN));
                    } else {
                        throw new C11176c("Could not detected related state variable of argument: " + name);
                    }
                }
            }
        }
        if (i >= mo37279h().getParameterTypes().length || C11343c.class.isAssignableFrom(this.f23119b.getParameterTypes()[this.f23119b.getParameterTypes().length - 1])) {
            return arrayList;
        }
        throw new C11176c("Method has parameters that are not input arguments: " + mo37279h().getName());
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public Map<C11321b<C11328h>, C11353c> mo37275d() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        UpnpAction upnpAction = (UpnpAction) mo37279h().getAnnotation(UpnpAction.class);
        if (upnpAction.out().length == 0) {
            return linkedHashMap;
        }
        int i = 0;
        boolean z = true;
        if (upnpAction.out().length <= 1) {
            z = false;
        }
        UpnpOutputArgument[] out = upnpAction.out();
        int length = out.length;
        while (i < length) {
            UpnpOutputArgument upnpOutputArgument = out[i];
            String name = upnpOutputArgument.name();
            C11336p f = mo37277f(upnpOutputArgument.stateVariable(), name, mo37279h().getName());
            if (f == null && upnpOutputArgument.getterName().length() > 0) {
                f = mo37277f((String) null, (String) null, upnpOutputArgument.getterName());
            }
            if (f != null) {
                C11353c e = mo37276e(f, upnpOutputArgument.getterName(), z);
                Logger logger = f23117e;
                logger.finer("Found related state variable for output argument '" + name + "': " + f);
                linkedHashMap.put(new C11321b(name, f.mo35994b(), C11321b.C11322a.OUT, z ^ true), e);
                i++;
            } else {
                throw new C11176c("Related state variable not found for output argument: " + name);
            }
        }
        return linkedHashMap;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public C11353c mo37276e(C11336p pVar, String str, boolean z) {
        if (mo37279h().getReturnType().equals(Void.TYPE)) {
            if (str == null || str.length() <= 0) {
                Logger logger = f23117e;
                logger.finer("Action method is void, trying to find existing accessor of related: " + pVar);
                return mo37281j().get(pVar);
            }
            Logger logger2 = f23117e;
            logger2.finer("Action method is void, will use getter method named: " + str);
            Method g = C11499d.m30189g(mo37279h().getDeclaringClass(), str);
            if (g != null) {
                mo37283l(pVar, g.getReturnType());
                return new C11352b(g);
            }
            throw new C11176c("Declared getter method '" + str + "' not found on: " + mo37279h().getDeclaringClass());
        } else if (str != null && str.length() > 0) {
            Logger logger3 = f23117e;
            logger3.finer("Action method is not void, will use getter method on returned instance: " + str);
            Method g2 = C11499d.m30189g(mo37279h().getReturnType(), str);
            if (g2 != null) {
                mo37283l(pVar, g2.getReturnType());
                return new C11352b(g2);
            }
            throw new C11176c("Declared getter method '" + str + "' not found on return type: " + mo37279h().getReturnType());
        } else if (z) {
            return null;
        } else {
            Logger logger4 = f23117e;
            logger4.finer("Action method is not void, will use the returned instance: " + mo37279h().getReturnType());
            mo37283l(pVar, mo37279h().getReturnType());
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public C11336p mo37277f(String str, String str2, String str3) {
        String h;
        C11336p i = (str == null || str.length() <= 0) ? null : mo37280i(str);
        if (i == null && str2 != null && str2.length() > 0) {
            String i2 = C11735b.m30478i(str2);
            f23117e.finer("Finding related state variable with argument name (converted to UPnP name): " + i2);
            i = mo37280i(str2);
        }
        if (i == null && str2 != null && str2.length() > 0) {
            String str4 = "A_ARG_TYPE_" + C11735b.m30478i(str2);
            f23117e.finer("Finding related state variable with prefixed argument name (converted to UPnP name): " + str4);
            i = mo37280i(str4);
        }
        if (i != null || str3 == null || str3.length() <= 0 || (h = C11499d.m30190h(str3)) == null) {
            return i;
        }
        f23117e.finer("Finding related state variable with method property name: " + h);
        return mo37280i(C11735b.m30478i(h));
    }

    /* renamed from: g */
    public UpnpAction mo37278g() {
        return this.f23118a;
    }

    /* renamed from: h */
    public Method mo37279h() {
        return this.f23119b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public C11336p mo37280i(String str) {
        for (C11336p next : mo37281j().keySet()) {
            if (next.mo35994b().equals(str)) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: j */
    public Map<C11336p, C11353c> mo37281j() {
        return this.f23120c;
    }

    /* renamed from: k */
    public Set<Class> mo37282k() {
        return this.f23121d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo37283l(C11336p pVar, Class cls) {
        C11374j.C11377b b = C11216f.m29267d(mo37282k(), cls) ? C11374j.C11377b.STRING : C11374j.C11377b.m29816b(cls);
        Logger logger = f23117e;
        logger.finer("Expecting '" + pVar + "' to match default mapping: " + b);
        if (b != null && !pVar.mo35996d().mo36013d().mo36042b(b.mo36081c())) {
            throw new C11176c("State variable '" + pVar + "' datatype can't handle action " + "argument's Java type (change one): " + b.mo36081c());
        } else if (b != null || pVar.mo35996d().mo36013d().mo36045e() == null) {
            f23117e.finer("State variable matches required argument datatype (or can't be validated because it is custom)");
        } else {
            throw new C11176c("State variable '" + pVar + "' should be custom datatype " + "(action argument type is unknown Java type): " + cls.getSimpleName());
        }
    }
}
