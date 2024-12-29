package p076o0;

import android.content.Context;
import android.content.IntentFilter;
import androidx.annotation.NonNull;
import androidx.core.util.Preconditions;
import com.google.android.gms.common.api.C0733c;
import com.google.android.gms.common.api.C0736d;
import com.google.android.gms.common.api.internal.C0793j;
import com.google.android.gms.common.api.internal.C0800k;
import com.google.android.gms.common.api.internal.C0820o;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.wearable.MessageClient;
import p065m0.C3339g;
import p109w.C3835e;

/* renamed from: o0.c1 */
public final class C3419c1 extends MessageClient {
    @VisibleForTesting

    /* renamed from: k */
    final C3495y0 f5553k = new C3495y0();

    public C3419c1(@NonNull Context context, @NonNull C0733c.C0734a aVar) {
        super(context, aVar);
    }

    /* renamed from: t */
    private final C3339g<Void> m9431t(MessageClient.C1901a aVar, IntentFilter[] intentFilterArr) {
        C0793j a = C0800k.m916a(aVar, mo11855k(), "MessageListener");
        return mo11851g(C0820o.m974a().mo12051e(a).mo12048b(new C3411a1(aVar, a, intentFilterArr)).mo12050d(new C3415b1(aVar)).mo12049c(24016).mo12047a());
    }

    /* renamed from: q */
    public final C3339g<Void> mo14799q(MessageClient.C1901a aVar) {
        return m9431t(aVar, new IntentFilter[]{C3493x1.m9549a("com.google.android.gms.wearable.MESSAGE_RECEIVED")});
    }

    /* renamed from: r */
    public final C3339g<Boolean> mo14800r(@NonNull MessageClient.C1901a aVar) {
        return mo11852h((C0793j.C0794a) Preconditions.checkNotNull(C0800k.m916a(aVar, mo11855k(), "MessageListener").mo12007b(), "Key must not be null"), 24007);
    }

    /* renamed from: s */
    public final C3339g<Integer> mo14801s(String str, String str2, byte[] bArr) {
        C3495y0 y0Var = this.f5553k;
        C0736d c = mo11847c();
        return C3835e.m10934a(c.mo11863g(new C3489w0(y0Var, c, str, str2, bArr)), C3498z0.f5603a);
    }
}
