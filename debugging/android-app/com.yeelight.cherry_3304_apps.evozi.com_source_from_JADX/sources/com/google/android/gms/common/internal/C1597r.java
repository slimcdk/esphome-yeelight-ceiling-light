package com.google.android.gms.common.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;

@KeepForSdk
/* renamed from: com.google.android.gms.common.internal.r */
public class C1597r {

    /* renamed from: b */
    private static final C1580k f3076b = new C1580k("LibraryVersion", "");

    /* renamed from: c */
    private static C1597r f3077c = new C1597r();

    /* renamed from: a */
    private ConcurrentHashMap<String, String> f3078a = new ConcurrentHashMap<>();

    @VisibleForTesting
    protected C1597r() {
    }

    @KeepForSdk
    /* renamed from: a */
    public static C1597r m4385a() {
        return f3077c;
    }

    @KeepForSdk
    /* renamed from: b */
    public String mo11270b(@NonNull String str) {
        C1609u.m4472h(str, "Please provide a valid libraryName");
        if (this.f3078a.containsKey(str)) {
            return this.f3078a.get(str);
        }
        Properties properties = new Properties();
        String str2 = null;
        try {
            InputStream resourceAsStream = C1597r.class.getResourceAsStream(String.format("/%s.properties", new Object[]{str}));
            if (resourceAsStream != null) {
                properties.load(resourceAsStream);
                str2 = properties.getProperty("version", (String) null);
                C1580k kVar = f3076b;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12 + String.valueOf(str2).length());
                sb.append(str);
                sb.append(" version is ");
                sb.append(str2);
                kVar.mo11245e("LibraryVersion", sb.toString());
            } else {
                C1580k kVar2 = f3076b;
                String valueOf = String.valueOf(str);
                kVar2.mo11243c("LibraryVersion", valueOf.length() != 0 ? "Failed to get app version for libraryName: ".concat(valueOf) : new String("Failed to get app version for libraryName: "));
            }
        } catch (IOException e) {
            C1580k kVar3 = f3076b;
            String valueOf2 = String.valueOf(str);
            kVar3.mo11244d("LibraryVersion", valueOf2.length() != 0 ? "Failed to get app version for libraryName: ".concat(valueOf2) : new String("Failed to get app version for libraryName: "), e);
        }
        if (str2 == null) {
            f3076b.mo11242b("LibraryVersion", ".properties file is dropped during release process. Failure to read app version isexpected druing Google internal testing where locally-built libraries are used");
            str2 = "UNKNOWN";
        }
        this.f3078a.put(str, str2);
        return str2;
    }
}
