package com.google.android.datatransport.runtime.backends;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.xiaomi.mipush.sdk.Constants;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
/* renamed from: com.google.android.datatransport.runtime.backends.l */
class C1325l implements C1316e {

    /* renamed from: a */
    private final C1326a f2418a;

    /* renamed from: b */
    private final C1323j f2419b;

    /* renamed from: c */
    private final Map<String, C1328n> f2420c;

    /* renamed from: com.google.android.datatransport.runtime.backends.l$a */
    static class C1326a {

        /* renamed from: a */
        private final Context f2421a;

        /* renamed from: b */
        private Map<String, String> f2422b = null;

        C1326a(Context context) {
            this.f2421a = context;
        }

        /* renamed from: a */
        private Map<String, String> m3484a(Context context) {
            Bundle d = m3486d(context);
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
        private Map<String, String> m3485c() {
            if (this.f2422b == null) {
                this.f2422b = m3484a(this.f2421a);
            }
            return this.f2422b;
        }

        /* renamed from: d */
        private static Bundle m3486d(Context context) {
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
        public C1315d mo10229b(String str) {
            String str2 = m3485c().get(str);
            if (str2 == null) {
                return null;
            }
            try {
                return (C1315d) Class.forName(str2).asSubclass(C1315d.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
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
    C1325l(Context context, C1323j jVar) {
        this(new C1326a(context), jVar);
    }

    C1325l(C1326a aVar, C1323j jVar) {
        this.f2420c = new HashMap();
        this.f2418a = aVar;
        this.f2419b = jVar;
    }

    @Nullable
    /* renamed from: a */
    public synchronized C1328n mo10226a(String str) {
        if (this.f2420c.containsKey(str)) {
            return this.f2420c.get(str);
        }
        C1315d b = this.f2418a.mo10229b(str);
        if (b == null) {
            return null;
        }
        C1328n create = b.create(this.f2419b.mo10227a(str));
        this.f2420c.put(str, create);
        return create;
    }
}
