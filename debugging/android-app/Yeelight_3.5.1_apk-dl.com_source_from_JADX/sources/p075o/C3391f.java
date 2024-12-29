package p075o;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.Module;
import com.google.android.datatransport.runtime.dagger.Provides;
import javax.inject.Named;

@Module
/* renamed from: o.f */
public abstract class C3391f {
    @Provides
    @Named("SQLITE_DB_NAME")
    /* renamed from: a */
    static String m9270a() {
        return "com.google.android.datatransport.events";
    }

    @Provides
    @Named("PACKAGE_NAME")
    /* renamed from: b */
    static String m9271b(Context context) {
        return context.getPackageName();
    }

    @Provides
    @Named("SCHEMA_VERSION")
    /* renamed from: c */
    static int m9272c() {
        return C3406t0.f5533d;
    }

    @Provides
    /* renamed from: d */
    static C3389e m9273d() {
        return C3389e.f5514a;
    }
}
