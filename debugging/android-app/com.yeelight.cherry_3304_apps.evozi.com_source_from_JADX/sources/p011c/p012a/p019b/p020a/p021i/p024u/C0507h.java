package p011c.p012a.p019b.p020a.p021i.p024u;

import android.content.Context;
import android.os.Build;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C1329a;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C1335e;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C1337g;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C1353s;
import com.google.android.datatransport.runtime.time.C1354a;
import com.google.android.datatransport.runtime.time.Monotonic;
import dagger.Module;
import dagger.Provides;
import p011c.p012a.p019b.p020a.p021i.p024u.p025j.C0519c;

@Module
/* renamed from: c.a.b.a.i.u.h */
public abstract class C0507h {
    @Provides
    /* renamed from: a */
    static C1353s m176a(Context context, C0519c cVar, C1337g gVar, @Monotonic C1354a aVar) {
        return Build.VERSION.SDK_INT >= 21 ? new C1335e(context, cVar, gVar) : new C1329a(context, cVar, aVar, gVar);
    }
}
