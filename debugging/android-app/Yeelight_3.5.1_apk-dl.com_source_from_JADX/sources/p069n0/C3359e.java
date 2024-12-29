package p069n0;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.C0744h;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import p076o0.C3476s;
import p105v.C3727e;

/* renamed from: n0.e */
public class C3359e extends C3727e<C3358d> implements C0744h {

    /* renamed from: d */
    private final Status f5477d;

    public C3359e(@RecentlyNonNull DataHolder dataHolder) {
        super(dataHolder);
        this.f5477d = new Status(dataHolder.mo12129d0());
    }

    @RecentlyNonNull
    /* renamed from: N */
    public Status mo11805N() {
        return this.f5477d;
    }

    /* access modifiers changed from: protected */
    @RecentlyNonNull
    /* renamed from: v */
    public final /* bridge */ /* synthetic */ Object mo24111v(int i, int i2) {
        return new C3476s(this.f6251a, i, i2);
    }

    /* access modifiers changed from: protected */
    @RecentlyNonNull
    /* renamed from: z */
    public final String mo24112z() {
        return "path";
    }
}
