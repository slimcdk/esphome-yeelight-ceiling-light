package p035g;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.BindsInstance;
import com.google.android.datatransport.runtime.dagger.Component;
import java.io.Closeable;
import javax.inject.Singleton;
import p039h.C3223c;
import p064m.C3329f;
import p064m.C3331h;
import p075o.C3388d;
import p075o.C3391f;
import p083q.C3605b;

@Singleton
@Component(modules = {C3223c.class, C3391f.class, C3190j.class, C3331h.class, C3329f.class, C3605b.class})
/* renamed from: g.t */
abstract class C3204t implements Closeable {

    @Component.Builder
    /* renamed from: g.t$a */
    interface C3205a {
        @BindsInstance
        /* renamed from: a */
        C3205a mo23742a(Context context);

        C3204t build();
    }

    C3204t() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract C3388d mo23740a();

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract C3203s mo23741c();

    public void close() {
        mo23740a().close();
    }
}
