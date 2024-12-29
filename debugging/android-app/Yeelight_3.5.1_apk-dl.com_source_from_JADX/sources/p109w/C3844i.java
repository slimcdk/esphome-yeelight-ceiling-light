package p109w;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.C0722a;
import com.google.android.gms.common.internal.C0914h;

@KeepForSdk
/* renamed from: w.i */
public class C3844i implements C0722a.C0726d {
    @NonNull

    /* renamed from: b */
    public static final C3844i f6465b = m10946a().mo26321a();
    @Nullable

    /* renamed from: a */
    private final String f6466a;

    @KeepForSdk
    /* renamed from: w.i$a */
    public static class C3845a {
        @Nullable

        /* renamed from: a */
        private String f6467a;

        /* synthetic */ C3845a(C3851l lVar) {
        }

        @NonNull
        @KeepForSdk
        /* renamed from: a */
        public C3844i mo26321a() {
            return new C3844i(this.f6467a, (C3853m) null);
        }
    }

    /* synthetic */ C3844i(String str, C3853m mVar) {
        this.f6466a = str;
    }

    @NonNull
    @KeepForSdk
    /* renamed from: a */
    public static C3845a m10946a() {
        return new C3845a((C3851l) null);
    }

    @NonNull
    /* renamed from: b */
    public final Bundle mo26318b() {
        Bundle bundle = new Bundle();
        String str = this.f6466a;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3844i)) {
            return false;
        }
        return C0914h.m1402a(this.f6466a, ((C3844i) obj).f6466a);
    }

    public final int hashCode() {
        return C0914h.m1403b(this.f6466a);
    }
}
