package p087r;

import android.util.SparseArray;
import androidx.annotation.NonNull;
import com.google.android.datatransport.Priority;
import java.util.HashMap;

/* renamed from: r.a */
public final class C3621a {

    /* renamed from: a */
    private static SparseArray<Priority> f6029a = new SparseArray<>();

    /* renamed from: b */
    private static HashMap<Priority, Integer> f6030b;

    static {
        HashMap<Priority, Integer> hashMap = new HashMap<>();
        f6030b = hashMap;
        hashMap.put(Priority.DEFAULT, 0);
        f6030b.put(Priority.VERY_LOW, 1);
        f6030b.put(Priority.HIGHEST, 2);
        for (Priority next : f6030b.keySet()) {
            f6029a.append(f6030b.get(next).intValue(), next);
        }
    }

    /* renamed from: a */
    public static int m10301a(@NonNull Priority priority) {
        Integer num = f6030b.get(priority);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + priority);
    }

    @NonNull
    /* renamed from: b */
    public static Priority m10302b(int i) {
        Priority priority = f6029a.get(i);
        if (priority != null) {
            return priority;
        }
        throw new IllegalArgumentException("Unknown Priority for value " + i);
    }
}
