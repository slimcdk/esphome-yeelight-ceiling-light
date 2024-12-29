package p076o0;

import android.content.Context;
import android.content.IntentFilter;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.C0733c;
import com.google.android.gms.common.api.internal.C0793j;
import com.google.android.gms.common.api.internal.C0800k;
import com.google.android.gms.common.api.internal.C0820o;
import com.google.android.gms.common.internal.C0917i;
import com.google.android.gms.wearable.DataClient;
import p065m0.C3339g;

/* renamed from: o0.r */
public final class C3473r extends DataClient {
    public C3473r(@NonNull Context context, @NonNull C0733c.C0734a aVar) {
        super(context, aVar);
        new C3464o();
    }

    /* renamed from: s */
    private final C3339g<Void> m9504s(DataClient.C1900a aVar, IntentFilter[] intentFilterArr) {
        C0793j a = C0800k.m916a(aVar, mo11855k(), "DataListener");
        return mo11851g(C0820o.m974a().mo12051e(a).mo12048b(new C3470q(aVar, a, intentFilterArr)).mo12050d(new C3467p(aVar)).mo12049c(24015).mo12047a());
    }

    /* renamed from: q */
    public final C3339g<Void> mo14797q(@NonNull DataClient.C1900a aVar) {
        return m9504s(aVar, new IntentFilter[]{C3493x1.m9549a("com.google.android.gms.wearable.DATA_CHANGED")});
    }

    /* renamed from: r */
    public final C3339g<Boolean> mo14798r(@NonNull DataClient.C1900a aVar) {
        return mo11852h((C0793j.C0794a) C0917i.m1420k(C0800k.m916a(aVar, mo11855k(), "DataListener").mo12007b(), "Key must not be null"), 24005);
    }
}
