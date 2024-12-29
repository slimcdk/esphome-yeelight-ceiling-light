package p168h7;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.List;
import org.slf4j.helpers.C10259a;
import org.slf4j.helpers.C10260b;
import org.slf4j.impl.StaticLoggerBinder;

/* renamed from: h7.c */
public final class C9099c {

    /* renamed from: a */
    static int f16771a;

    /* renamed from: b */
    static int f16772b;

    /* renamed from: c */
    static C10259a f16773c = new C10259a();

    /* renamed from: d */
    private static final String[] f16774d = {"1.5.5", "1.5.6", "1.5.7", "1.5.8", "1.5.9", "1.5.10", "1.5.11"};

    /* renamed from: e */
    private static String f16775e = "org/slf4j/impl/StaticLoggerBinder.class";

    /* renamed from: f */
    static /* synthetic */ Class f16776f;

    /* renamed from: a */
    private static final void m21830a() {
        try {
            m21835f();
            f16771a = 3;
            m21832c();
        } catch (NoClassDefFoundError e) {
            f16771a = 2;
            String message = e.getMessage();
            if (!(message == null || message.indexOf("org/slf4j/impl/StaticLoggerBinder") == -1)) {
                C10260b.m25797a("Failed to load class \"org.slf4j.impl.StaticLoggerBinder\".");
                C10260b.m25797a("See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.");
            }
            throw e;
        } catch (Exception e2) {
            f16771a = 2;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Failed to instantiate logger [");
            stringBuffer.append(m21835f().getLoggerFactoryClassStr());
            stringBuffer.append("]");
            C10260b.m25798b(stringBuffer.toString(), e2);
        }
    }

    /* renamed from: b */
    static /* synthetic */ Class m21831b(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }

    /* renamed from: c */
    private static final void m21832c() {
        List a = f16773c.mo41713a();
        if (a.size() != 0) {
            C10260b.m25797a("The following loggers will not work becasue they were created");
            C10260b.m25797a("during the default configuration phase of the underlying logging system.");
            C10260b.m25797a("See also http://www.slf4j.org/codes.html#substituteLogger");
            for (int i = 0; i < a.size(); i++) {
                C10260b.m25797a((String) a.get(i));
            }
        }
    }

    /* renamed from: d */
    public static C9097a m21833d() {
        if (f16771a == 0) {
            f16771a = 1;
            m21836g();
        }
        int i = f16771a;
        if (i == 1) {
            return f16773c;
        }
        if (i == 2) {
            throw new IllegalStateException("org.slf4j.LoggerFactory could not be successfully initialized. See also http://www.slf4j.org/codes.html#unsuccessfulInit");
        } else if (i == 3) {
            return m21835f().getLoggerFactory();
        } else {
            throw new IllegalStateException("Unreachable code");
        }
    }

    /* renamed from: e */
    public static C9098b m21834e(String str) {
        return m21833d().getLogger(str);
    }

    /* renamed from: f */
    private static final StaticLoggerBinder m21835f() {
        int i = f16772b;
        if (i == 1) {
            return StaticLoggerBinder.SINGLETON;
        }
        if (i == 2) {
            return StaticLoggerBinder.getSingleton();
        }
        try {
            StaticLoggerBinder singleton = StaticLoggerBinder.getSingleton();
            f16772b = 2;
            return singleton;
        } catch (NoSuchMethodError unused) {
            f16772b = 1;
            return StaticLoggerBinder.SINGLETON;
        }
    }

    /* renamed from: g */
    private static final void m21836g() {
        m21830a();
        m21838i();
        m21837h();
    }

    /* renamed from: h */
    private static void m21837h() {
        try {
            Class cls = f16776f;
            if (cls == null) {
                cls = m21831b("org.slf4j.LoggerFactory");
                f16776f = cls;
            }
            ClassLoader classLoader = cls.getClassLoader();
            if (classLoader != null) {
                Enumeration<URL> resources = classLoader.getResources(f16775e);
                ArrayList arrayList = new ArrayList();
                while (resources.hasMoreElements()) {
                    arrayList.add(resources.nextElement());
                }
                if (arrayList.size() > 1) {
                    C10260b.m25797a("Class path contains multiple SLF4J bindings.");
                    for (int i = 0; i < arrayList.size(); i++) {
                        StringBuffer stringBuffer = new StringBuffer();
                        stringBuffer.append("Found binding in [");
                        stringBuffer.append(arrayList.get(i));
                        stringBuffer.append("]");
                        C10260b.m25797a(stringBuffer.toString());
                    }
                    C10260b.m25797a("See http://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
                }
            }
        } catch (IOException e) {
            C10260b.m25798b("Error getting resources from path", e);
        }
    }

    /* renamed from: i */
    private static final void m21838i() {
        String[] strArr;
        try {
            String str = StaticLoggerBinder.REQUESTED_API_VERSION;
            int i = 0;
            boolean z = false;
            while (true) {
                strArr = f16774d;
                if (i >= strArr.length) {
                    break;
                }
                if (str.startsWith(strArr[i])) {
                    z = true;
                }
                i++;
            }
            if (!z) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("The requested version ");
                stringBuffer.append(str);
                stringBuffer.append(" by your slf4j binding is not compatible with ");
                stringBuffer.append(Arrays.asList(strArr).toString());
                C10260b.m25797a(stringBuffer.toString());
                C10260b.m25797a("See http://www.slf4j.org/codes.html#version_mismatch for further details.");
            }
        } catch (NoSuchFieldError unused) {
        } catch (Throwable th) {
            C10260b.m25798b("Unexpected problem occured during version sanity check", th);
        }
    }
}
