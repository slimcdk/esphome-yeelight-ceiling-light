package p076o0;

import android.content.Context;
import android.content.IntentFilter;
import android.net.Uri;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.C0733c;
import com.google.android.gms.common.api.internal.C0793j;
import com.google.android.gms.common.api.internal.C0800k;
import com.google.android.gms.common.api.internal.C0820o;
import com.google.android.gms.common.internal.C0895b;
import com.google.android.gms.common.internal.C0917i;
import com.google.android.gms.wearable.CapabilityClient;
import p065m0.C3339g;

/* renamed from: o0.d */
public final class C3421d extends CapabilityClient {
    public C3421d(@NonNull Context context, @NonNull C0733c.C0734a aVar) {
        super(context, aVar);
        new C3460m2();
    }

    /* renamed from: r */
    private final C3339g<Void> m9436r(C0793j<CapabilityClient.C1898a> jVar, CapabilityClient.C1898a aVar, IntentFilter[] intentFilterArr) {
        return mo11851g(C0820o.m974a().mo12051e(jVar).mo12048b(new C3413b(aVar, jVar, intentFilterArr)).mo12050d(new C3417c(aVar)).mo12049c(24013).mo12047a());
    }

    /* renamed from: q */
    public final C3339g<Void> mo14788q(@NonNull CapabilityClient.C1898a aVar, @NonNull Uri uri, int i) {
        boolean z;
        C0895b.m1290d(aVar, "listener must not be null");
        C0895b.m1290d(uri, "uri must not be null");
        if (i != 0) {
            if (i == 1) {
                i = 1;
            } else {
                z = false;
                C0917i.m1411b(z, "invalid filter type");
                IntentFilter b = C3493x1.m9550b("com.google.android.gms.wearable.CAPABILITY_CHANGED", uri, i);
                return m9436r(C0800k.m916a(aVar, mo11855k(), "CapabilityListener"), aVar, new IntentFilter[]{b});
            }
        }
        z = true;
        C0917i.m1411b(z, "invalid filter type");
        IntentFilter b2 = C3493x1.m9550b("com.google.android.gms.wearable.CAPABILITY_CHANGED", uri, i);
        return m9436r(C0800k.m916a(aVar, mo11855k(), "CapabilityListener"), aVar, new IntentFilter[]{b2});
    }
}
