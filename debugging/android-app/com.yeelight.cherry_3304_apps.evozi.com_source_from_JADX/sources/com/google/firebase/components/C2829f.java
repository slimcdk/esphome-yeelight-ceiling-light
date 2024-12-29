package com.google.firebase.components;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import androidx.annotation.VisibleForTesting;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.firebase.components.f */
public final class C2829f<T> {

    /* renamed from: a */
    private final T f5460a;

    /* renamed from: b */
    private final C2832c<T> f5461b;

    /* renamed from: com.google.firebase.components.f$b */
    private static class C2831b implements C2832c<Context> {

        /* renamed from: a */
        private final Class<? extends Service> f5462a;

        private C2831b(Class<? extends Service> cls) {
            this.f5462a = cls;
        }

        /* renamed from: b */
        private Bundle m8617b(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, this.f5462a), 128);
                if (serviceInfo != null) {
                    return serviceInfo.metaData;
                }
                this.f5462a + " has no service info.";
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        /* renamed from: c */
        public List<String> mo17092a(Context context) {
            Bundle b = m8617b(context);
            if (b == null) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (String str : b.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(b.get(str)) && str.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str.substring(31));
                }
            }
            return arrayList;
        }
    }

    @VisibleForTesting
    /* renamed from: com.google.firebase.components.f$c */
    interface C2832c<T> {
        /* renamed from: a */
        List<String> mo17092a(T t);
    }

    @VisibleForTesting
    C2829f(T t, C2832c<T> cVar) {
        this.f5460a = t;
        this.f5461b = cVar;
    }

    /* renamed from: b */
    public static C2829f<Context> m8614b(Context context, Class<? extends Service> cls) {
        return new C2829f<>(context, new C2831b(cls));
    }

    /* renamed from: c */
    private static List<C2834h> m8615c(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (String next : list) {
            try {
                Class<?> cls = Class.forName(next);
                if (!C2834h.class.isAssignableFrom(cls)) {
                    String.format("Class %s is not an instance of %s", new Object[]{next, "com.google.firebase.components.ComponentRegistrar"});
                } else {
                    arrayList.add((C2834h) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                }
            } catch (ClassNotFoundException unused) {
                String.format("Class %s is not an found.", new Object[]{next});
            } catch (IllegalAccessException unused2) {
                String.format("Could not instantiate %s.", new Object[]{next});
            } catch (InstantiationException unused3) {
                String.format("Could not instantiate %s.", new Object[]{next});
            } catch (NoSuchMethodException unused4) {
                String.format("Could not instantiate %s", new Object[]{next});
            } catch (InvocationTargetException unused5) {
                String.format("Could not instantiate %s", new Object[]{next});
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public List<C2834h> mo17091a() {
        return m8615c(this.f5461b.mo17092a(this.f5460a));
    }
}
