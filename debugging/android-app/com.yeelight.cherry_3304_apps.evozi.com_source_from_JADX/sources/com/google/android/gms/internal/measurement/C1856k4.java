package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C2076y3;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.measurement.k4 */
abstract class C1856k4<T extends C2076y3> {

    /* renamed from: a */
    private static final Logger f3514a = Logger.getLogger(C2028v3.class.getName());

    /* renamed from: b */
    private static String f3515b = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";

    C1856k4() {
    }

    /* renamed from: b */
    static <T extends C2076y3> T m5307b(Class<T> cls) {
        String str;
        Class<C1856k4> cls2 = C1856k4.class;
        ClassLoader classLoader = cls2.getClassLoader();
        if (cls.equals(C2076y3.class)) {
            str = f3515b;
        } else if (cls.getPackage().equals(cls2.getPackage())) {
            str = String.format("%s.BlazeGenerated%sLoader", new Object[]{cls.getPackage().getName(), cls.getSimpleName()});
        } else {
            throw new IllegalArgumentException(cls.getName());
        }
        try {
            return (C2076y3) cls.cast(((C1856k4) Class.forName(str, true, classLoader).getConstructor(new Class[0]).newInstance(new Object[0])).mo11771a());
        } catch (NoSuchMethodException e) {
            throw new IllegalStateException(e);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        } catch (IllegalAccessException e3) {
            throw new IllegalStateException(e3);
        } catch (InvocationTargetException e4) {
            throw new IllegalStateException(e4);
        } catch (ClassNotFoundException unused) {
            Iterator<S> it = ServiceLoader.load(cls2, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    arrayList.add(cls.cast(((C1856k4) it.next()).mo11771a()));
                } catch (ServiceConfigurationError e5) {
                    ServiceConfigurationError serviceConfigurationError = e5;
                    Logger logger = f3514a;
                    Level level = Level.SEVERE;
                    String valueOf = String.valueOf(cls.getSimpleName());
                    logger.logp(level, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", valueOf.length() != 0 ? "Unable to load ".concat(valueOf) : new String("Unable to load "), serviceConfigurationError);
                }
            }
            if (arrayList.size() == 1) {
                return (C2076y3) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (C2076y3) cls.getMethod("combine", new Class[]{Collection.class}).invoke((Object) null, new Object[]{arrayList});
            } catch (NoSuchMethodException e6) {
                throw new IllegalStateException(e6);
            } catch (IllegalAccessException e7) {
                throw new IllegalStateException(e7);
            } catch (InvocationTargetException e8) {
                throw new IllegalStateException(e8);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo11771a();
}
