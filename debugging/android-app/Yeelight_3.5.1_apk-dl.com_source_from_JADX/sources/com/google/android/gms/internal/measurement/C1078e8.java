package com.google.android.gms.internal.measurement;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.measurement.e8 */
abstract class C1078e8 {

    /* renamed from: a */
    private static final Logger f1300a = Logger.getLogger(C1301s7.class.getName());

    /* renamed from: b */
    private static final String f1301b = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";

    C1078e8() {
    }

    /* renamed from: b */
    static C1377x7 m1894b(Class cls) {
        String str;
        Class<C1078e8> cls2 = C1078e8.class;
        ClassLoader classLoader = cls2.getClassLoader();
        if (cls.equals(C1377x7.class)) {
            str = f1301b;
        } else if (cls.getPackage().equals(cls2.getPackage())) {
            str = String.format("%s.BlazeGenerated%sLoader", new Object[]{cls.getPackage().getName(), cls.getSimpleName()});
        } else {
            throw new IllegalArgumentException(cls.getName());
        }
        try {
            return (C1377x7) cls.cast(((C1078e8) Class.forName(str, true, classLoader).getConstructor(new Class[0]).newInstance(new Object[0])).mo12744a());
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
                    arrayList.add(cls.cast(((C1078e8) it.next()).mo12744a()));
                } catch (ServiceConfigurationError e5) {
                    f1300a.logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(cls.getSimpleName()), e5);
                }
            }
            if (arrayList.size() == 1) {
                return (C1377x7) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (C1377x7) cls.getMethod("combine", new Class[]{Collection.class}).invoke((Object) null, new Object[]{arrayList});
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
    public abstract C1377x7 mo12744a();
}
