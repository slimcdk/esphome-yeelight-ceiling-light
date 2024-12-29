package p011c.p012a.p019b.p020a.p021i;

import android.content.Context;
import com.google.android.datatransport.runtime.backends.C1317f;
import com.google.android.datatransport.runtime.time.C1355b;
import dagger.BindsInstance;
import dagger.Component;
import java.io.Closeable;
import javax.inject.Singleton;
import p011c.p012a.p019b.p020a.p021i.p024u.C0505f;
import p011c.p012a.p019b.p020a.p021i.p024u.C0507h;
import p011c.p012a.p019b.p020a.p021i.p024u.p025j.C0519c;
import p011c.p012a.p019b.p020a.p021i.p024u.p025j.C0524e;

@Singleton
@Component(modules = {C1317f.class, C0524e.class, C0483i.class, C0507h.class, C0505f.class, C1355b.class})
/* renamed from: c.a.b.a.i.q */
abstract class C0493q implements Closeable {

    @Component.Builder
    /* renamed from: c.a.b.a.i.q$a */
    interface C0494a {
        @BindsInstance
        /* renamed from: a */
        C0494a mo8447a(Context context);

        C0493q build();
    }

    C0493q() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract C0519c mo8445a();

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract C0492p mo8446b();

    public void close() {
        mo8445a().close();
    }
}
