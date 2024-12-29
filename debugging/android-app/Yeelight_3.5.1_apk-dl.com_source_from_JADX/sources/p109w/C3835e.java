package p109w;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.C0741f;
import com.google.android.gms.common.api.C0744h;
import com.google.android.gms.tasks.C1872a;
import p065m0.C3339g;

@KeepForSdk
/* renamed from: w.e */
public class C3835e {

    /* renamed from: a */
    private static final C3863w f6453a = new C3861u();

    @KeepForSdk
    /* renamed from: w.e$a */
    public interface C3836a<R extends C0744h, T> {
        @KeepForSdk
        @Nullable
        /* renamed from: a */
        T mo24272a(@NonNull R r);
    }

    @NonNull
    @KeepForSdk
    /* renamed from: a */
    public static <R extends C0744h, T> C3339g<T> m10934a(@NonNull C0741f<R> fVar, @NonNull C3836a<R, T> aVar) {
        C3863w wVar = f6453a;
        C1872a aVar2 = new C1872a();
        fVar.mo11875b(new C3862v(fVar, aVar2, aVar, wVar));
        return aVar2.mo14736a();
    }
}
