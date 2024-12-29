package p109w;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.common.api.Status;

@KeepForSdk
/* renamed from: w.a */
public class C3827a {
    @NonNull
    @KeepForSdk
    /* renamed from: a */
    public static ApiException m10925a(@NonNull Status status) {
        return status.mo11811f0() ? new ResolvableApiException(status) : new ApiException(status);
    }
}
