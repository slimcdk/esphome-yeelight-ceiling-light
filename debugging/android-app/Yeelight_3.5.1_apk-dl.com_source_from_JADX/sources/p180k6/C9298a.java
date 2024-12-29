package p180k6;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import org.fourthline.cling.binding.LocalServiceBindingException;
import org.fourthline.cling.binding.annotations.UpnpAction;
import org.fourthline.cling.binding.annotations.UpnpInputArgument;
import org.fourthline.cling.binding.annotations.UpnpOutputArgument;
import org.fourthline.cling.model.C10018f;
import org.fourthline.cling.model.meta.ActionArgument;
import org.fourthline.cling.model.meta.C10066a;
import org.fourthline.cling.model.meta.C10071f;
import org.fourthline.cling.model.types.Datatype;
import org.seamless.util.C10247d;
import p193o6.C9791c;
import p193o6.C9793e;
import p214t6.C10404d;
import p218u6.C10542c;
import p226w6.C11956b;
import p226w6.C11957c;

/* renamed from: k6.a */
public class C9298a {

    /* renamed from: e */
    private static Logger f17221e = Logger.getLogger(C9299b.class.getName());

    /* renamed from: a */
    protected UpnpAction f17222a;

    /* renamed from: b */
    protected Method f17223b;

    /* renamed from: c */
    protected Map<C10071f, C11957c> f17224c;

    /* renamed from: d */
    protected Set<Class> f17225d;

    public C9298a(Method method, Map<C10071f, C11957c> map, Set<Class> set) {
        this.f17222a = (UpnpAction) method.getAnnotation(UpnpAction.class);
        this.f17224c = map;
        this.f17223b = method;
        this.f17225d = set;
    }

    /* renamed from: a */
    public C10066a mo37831a(Map<C10066a, C9791c> map) {
        String name = mo37837g().name().length() != 0 ? mo37837g().name() : C9299b.m22781h(mo37838h().getName());
        Logger logger = f17221e;
        logger.fine("Creating action and executor: " + name);
        List<ActionArgument> c = mo37833c();
        Map<ActionArgument<C10404d>, C11957c> d = mo37834d();
        c.addAll(d.keySet());
        C10066a aVar = new C10066a(name, (ActionArgument[]) c.toArray(new ActionArgument[c.size()]));
        map.put(aVar, mo37832b(d));
        return aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C9791c mo37832b(Map<ActionArgument<C10404d>, C11957c> map) {
        return new C9793e(map, mo37838h());
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public List<ActionArgument> mo37833c() {
        ArrayList arrayList = new ArrayList();
        Annotation[][] parameterAnnotations = mo37838h().getParameterAnnotations();
        int i = 0;
        for (int i2 = 0; i2 < parameterAnnotations.length; i2++) {
            for (Annotation annotation : parameterAnnotations[i2]) {
                if (annotation instanceof UpnpInputArgument) {
                    UpnpInputArgument upnpInputArgument = (UpnpInputArgument) annotation;
                    i++;
                    String name = upnpInputArgument.name();
                    C10071f f = mo37836f(upnpInputArgument.stateVariable(), name, mo37838h().getName());
                    if (f != null) {
                        mo37842l(f, mo37838h().getParameterTypes()[i2]);
                        arrayList.add(new ActionArgument(name, upnpInputArgument.aliases(), f.mo40543b(), ActionArgument.Direction.IN));
                    } else {
                        throw new LocalServiceBindingException("Could not detected related state variable of argument: " + name);
                    }
                }
            }
        }
        if (i >= mo37838h().getParameterTypes().length || C10542c.class.isAssignableFrom(this.f17223b.getParameterTypes()[this.f17223b.getParameterTypes().length - 1])) {
            return arrayList;
        }
        throw new LocalServiceBindingException("Method has parameters that are not input arguments: " + mo37838h().getName());
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public Map<ActionArgument<C10404d>, C11957c> mo37834d() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        UpnpAction upnpAction = (UpnpAction) mo37838h().getAnnotation(UpnpAction.class);
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
            C10071f f = mo37836f(upnpOutputArgument.stateVariable(), name, mo37838h().getName());
            if (f == null && upnpOutputArgument.getterName().length() > 0) {
                f = mo37836f((String) null, (String) null, upnpOutputArgument.getterName());
            }
            if (f != null) {
                C11957c e = mo37835e(f, upnpOutputArgument.getterName(), z);
                Logger logger = f17221e;
                logger.finer("Found related state variable for output argument '" + name + "': " + f);
                linkedHashMap.put(new ActionArgument(name, f.mo40543b(), ActionArgument.Direction.OUT, z ^ true), e);
                i++;
            } else {
                throw new LocalServiceBindingException("Related state variable not found for output argument: " + name);
            }
        }
        return linkedHashMap;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public C11957c mo37835e(C10071f fVar, String str, boolean z) {
        if (mo37838h().getReturnType().equals(Void.TYPE)) {
            if (str == null || str.length() <= 0) {
                Logger logger = f17221e;
                logger.finer("Action method is void, trying to find existing accessor of related: " + fVar);
                return mo37840j().get(fVar);
            }
            Logger logger2 = f17221e;
            logger2.finer("Action method is void, will use getter method named: " + str);
            Method g = C10247d.m25769g(mo37838h().getDeclaringClass(), str);
            if (g != null) {
                mo37842l(fVar, g.getReturnType());
                return new C11956b(g);
            }
            throw new LocalServiceBindingException("Declared getter method '" + str + "' not found on: " + mo37838h().getDeclaringClass());
        } else if (str != null && str.length() > 0) {
            Logger logger3 = f17221e;
            logger3.finer("Action method is not void, will use getter method on returned instance: " + str);
            Method g2 = C10247d.m25769g(mo37838h().getReturnType(), str);
            if (g2 != null) {
                mo37842l(fVar, g2.getReturnType());
                return new C11956b(g2);
            }
            throw new LocalServiceBindingException("Declared getter method '" + str + "' not found on return type: " + mo37838h().getReturnType());
        } else if (z) {
            return null;
        } else {
            Logger logger4 = f17221e;
            logger4.finer("Action method is not void, will use the returned instance: " + mo37838h().getReturnType());
            mo37842l(fVar, mo37838h().getReturnType());
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public C10071f mo37836f(String str, String str2, String str3) {
        String h;
        C10071f i = (str == null || str.length() <= 0) ? null : mo37839i(str);
        if (i == null && str2 != null && str2.length() > 0) {
            String i2 = C9299b.m22782i(str2);
            f17221e.finer("Finding related state variable with argument name (converted to UPnP name): " + i2);
            i = mo37839i(str2);
        }
        if (i == null && str2 != null && str2.length() > 0) {
            String str4 = "A_ARG_TYPE_" + C9299b.m22782i(str2);
            f17221e.finer("Finding related state variable with prefixed argument name (converted to UPnP name): " + str4);
            i = mo37839i(str4);
        }
        if (i != null || str3 == null || str3.length() <= 0 || (h = C10247d.m25770h(str3)) == null) {
            return i;
        }
        f17221e.finer("Finding related state variable with method property name: " + h);
        return mo37839i(C9299b.m22782i(h));
    }

    /* renamed from: g */
    public UpnpAction mo37837g() {
        return this.f17222a;
    }

    /* renamed from: h */
    public Method mo37838h() {
        return this.f17223b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public C10071f mo37839i(String str) {
        for (C10071f next : mo37840j().keySet()) {
            if (next.mo40543b().equals(str)) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: j */
    public Map<C10071f, C11957c> mo37840j() {
        return this.f17224c;
    }

    /* renamed from: k */
    public Set<Class> mo37841k() {
        return this.f17225d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo37842l(C10071f fVar, Class cls) {
        Datatype.Default byJavaType = C10018f.m24805d(mo37841k(), cls) ? Datatype.Default.STRING : Datatype.Default.getByJavaType(cls);
        Logger logger = f17221e;
        logger.finer("Expecting '" + fVar + "' to match default mapping: " + byJavaType);
        if (byJavaType != null && !fVar.mo40545d().mo42116d().mo40557b(byJavaType.getJavaType())) {
            throw new LocalServiceBindingException("State variable '" + fVar + "' datatype can't handle action " + "argument's Java type (change one): " + byJavaType.getJavaType());
        } else if (byJavaType != null || fVar.mo40545d().mo42116d().mo40560e() == null) {
            f17221e.finer("State variable matches required argument datatype (or can't be validated because it is custom)");
        } else {
            throw new LocalServiceBindingException("State variable '" + fVar + "' should be custom datatype " + "(action argument type is unknown Java type): " + cls.getSimpleName());
        }
    }
}
