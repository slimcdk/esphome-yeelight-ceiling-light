package p011c.p012a.p019b.p020a.p021i.p024u.p025j;

import dagger.Module;
import dagger.Provides;
import javax.inject.Named;

@Module
/* renamed from: c.a.b.a.i.u.j.e */
public abstract class C0524e {
    @Provides
    @Named("SQLITE_DB_NAME")
    /* renamed from: a */
    static String m264a() {
        return "com.google.android.datatransport.events";
    }

    @Provides
    @Named("SCHEMA_VERSION")
    /* renamed from: b */
    static int m265b() {
        return C0531h0.f174c;
    }

    @Provides
    /* renamed from: c */
    static C0521d m266c() {
        return C0521d.f166a;
    }
}
