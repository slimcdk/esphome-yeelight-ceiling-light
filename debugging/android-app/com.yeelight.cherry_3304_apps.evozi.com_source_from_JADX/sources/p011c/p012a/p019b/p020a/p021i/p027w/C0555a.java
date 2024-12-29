package p011c.p012a.p019b.p020a.p021i.p027w;

import android.util.SparseArray;
import androidx.annotation.NonNull;
import java.util.EnumMap;
import p011c.p012a.p019b.p020a.C0461d;

/* renamed from: c.a.b.a.i.w.a */
public final class C0555a {

    /* renamed from: a */
    private static SparseArray<C0461d> f208a = new SparseArray<>();

    /* renamed from: b */
    private static EnumMap<C0461d, Integer> f209b;

    static {
        EnumMap<C0461d, Integer> enumMap = new EnumMap<>(C0461d.class);
        f209b = enumMap;
        enumMap.put(C0461d.DEFAULT, 0);
        f209b.put(C0461d.VERY_LOW, 1);
        f209b.put(C0461d.HIGHEST, 2);
        for (C0461d next : f209b.keySet()) {
            f208a.append(f209b.get(next).intValue(), next);
        }
    }

    /* renamed from: a */
    public static int m316a(@NonNull C0461d dVar) {
        Integer num = f209b.get(dVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + dVar);
    }

    @NonNull
    /* renamed from: b */
    public static C0461d m317b(int i) {
        C0461d dVar = f208a.get(i);
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException("Unknown Priority for value " + i);
    }
}
