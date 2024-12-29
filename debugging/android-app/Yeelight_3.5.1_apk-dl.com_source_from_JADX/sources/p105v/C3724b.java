package p105v;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.C0743g;
import java.io.Closeable;

/* renamed from: v.b */
public interface C3724b<T> extends Iterable<T>, C0743g, Closeable {
    @NonNull
    T get(int i);

    int getCount();
}
