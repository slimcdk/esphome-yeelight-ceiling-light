package p110w0;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.firebase.components.InvalidRegistrarException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p077o1.C3502b;

/* renamed from: w0.g */
public final class C3874g<T> {

    /* renamed from: a */
    private final T f6500a;

    /* renamed from: b */
    private final C3877c<T> f6501b;

    /* renamed from: w0.g$b */
    private static class C3876b implements C3877c<Context> {

        /* renamed from: a */
        private final Class<? extends Service> f6502a;

        private C3876b(Class<? extends Service> cls) {
            this.f6502a = cls;
        }

        /* renamed from: b */
        private Bundle m11014b(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, this.f6502a), 128);
                if (serviceInfo != null) {
                    return serviceInfo.metaData;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(this.f6502a);
                sb.append(" has no service info.");
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        /* renamed from: c */
        public List<String> mo26351a(Context context) {
            Bundle b = m11014b(context);
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
    /* renamed from: w0.g$c */
    interface C3877c<T> {
        /* renamed from: a */
        List<String> mo26351a(T t);
    }

    @VisibleForTesting
    C3874g(T t, C3877c<T> cVar) {
        this.f6500a = t;
        this.f6501b = cVar;
    }

    /* renamed from: c */
    public static C3874g<Context> m11010c(Context context, Class<? extends Service> cls) {
        return new C3874g<>(context, new C3876b(cls));
    }

    /* access modifiers changed from: private */
    @Nullable
    /* renamed from: d */
    public static C3879i m11011d(String str) {
        try {
            Class<?> cls = Class.forName(str);
            if (C3879i.class.isAssignableFrom(cls)) {
                return (C3879i) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            }
            throw new InvalidRegistrarException(String.format("Class %s is not an instance of %s", new Object[]{str, "com.google.firebase.components.ComponentRegistrar"}));
        } catch (ClassNotFoundException unused) {
            String.format("Class %s is not an found.", new Object[]{str});
            return null;
        } catch (IllegalAccessException e) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s.", new Object[]{str}), e);
        } catch (InstantiationException e2) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s.", new Object[]{str}), e2);
        } catch (NoSuchMethodException e3) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s", new Object[]{str}), e3);
        } catch (InvocationTargetException e4) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s", new Object[]{str}), e4);
        }
    }

    /* renamed from: b */
    public List<C3502b<C3879i>> mo26350b() {
        ArrayList arrayList = new ArrayList();
        for (String fVar : this.f6501b.mo26351a(this.f6500a)) {
            arrayList.add(new C10556f(fVar));
        }
        return arrayList;
    }
}
