package p039h;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import com.xiaomi.mipush.sdk.Constants;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
/* renamed from: h.f */
class C3226f implements C3222b {

    /* renamed from: a */
    private final C3227a f5206a;

    /* renamed from: b */
    private final C3224d f5207b;

    /* renamed from: c */
    private final Map<String, C3229h> f5208c;

    /* renamed from: h.f$a */
    static class C3227a {

        /* renamed from: a */
        private final Context f5209a;

        /* renamed from: b */
        private Map<String, String> f5210b = null;

        C3227a(Context context) {
            this.f5209a = context;
        }

        /* renamed from: a */
        private Map<String, String> m8672a(Context context) {
            Bundle d = m8674d(context);
            if (d == null) {
                return Collections.emptyMap();
            }
            HashMap hashMap = new HashMap();
            for (String str : d.keySet()) {
                Object obj = d.get(str);
                if ((obj instanceof String) && str.startsWith("backend:")) {
                    for (String trim : ((String) obj).split(Constants.ACCEPT_TIME_SEPARATOR_SP, -1)) {
                        String trim2 = trim.trim();
                        if (!trim2.isEmpty()) {
                            hashMap.put(trim2, str.substring(8));
                        }
                    }
                }
            }
            return hashMap;
        }

        /* renamed from: c */
        private Map<String, String> m8673c() {
            if (this.f5210b == null) {
                this.f5210b = m8672a(this.f5209a);
            }
            return this.f5210b;
        }

        /* renamed from: d */
        private static Bundle m8674d(Context context) {
            ServiceInfo serviceInfo;
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null || (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, TransportBackendDiscovery.class), 128)) == null) {
                    return null;
                }
                return serviceInfo.metaData;
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        /* access modifiers changed from: package-private */
        @Nullable
        /* renamed from: b */
        public C3221a mo23782b(String str) {
            String str2 = m8673c().get(str);
            if (str2 == null) {
                return null;
            }
            try {
                return (C3221a) Class.forName(str2).asSubclass(C3221a.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (ClassNotFoundException unused) {
                String.format("Class %s is not found.", new Object[]{str2});
                return null;
            } catch (IllegalAccessException unused2) {
                String.format("Could not instantiate %s.", new Object[]{str2});
                return null;
            } catch (InstantiationException unused3) {
                String.format("Could not instantiate %s.", new Object[]{str2});
                return null;
            } catch (NoSuchMethodException unused4) {
                String.format("Could not instantiate %s", new Object[]{str2});
                return null;
            } catch (InvocationTargetException unused5) {
                String.format("Could not instantiate %s", new Object[]{str2});
                return null;
            }
        }
    }

    @Inject
    C3226f(Context context, C3224d dVar) {
        this(new C3227a(context), dVar);
    }

    C3226f(C3227a aVar, C3224d dVar) {
        this.f5208c = new HashMap();
        this.f5206a = aVar;
        this.f5207b = dVar;
    }

    @Nullable
    public synchronized C3229h get(String str) {
        if (this.f5208c.containsKey(str)) {
            return this.f5208c.get(str);
        }
        C3221a b = this.f5206a.mo23782b(str);
        if (b == null) {
            return null;
        }
        C3229h create = b.create(this.f5207b.mo23780a(str));
        this.f5208c.put(str, create);
        return create;
    }
}
