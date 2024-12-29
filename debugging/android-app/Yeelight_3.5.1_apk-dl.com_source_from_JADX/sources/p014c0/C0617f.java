package p014c0;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@KeepForSdk
/* renamed from: c0.f */
public final class C0617f {
    @NonNull
    @KeepForSdk
    @Deprecated
    /* renamed from: a */
    public static <T> List<T> m204a() {
        return Collections.emptyList();
    }

    @NonNull
    @KeepForSdk
    @Deprecated
    /* renamed from: b */
    public static <T> List<T> m205b(@NonNull T t) {
        return Collections.singletonList(t);
    }

    @NonNull
    @KeepForSdk
    @Deprecated
    /* renamed from: c */
    public static <T> List<T> m206c(@NonNull T... tArr) {
        int length = tArr.length;
        return length != 0 ? length != 1 ? Collections.unmodifiableList(Arrays.asList(tArr)) : m205b(tArr[0]) : m204a();
    }
}
