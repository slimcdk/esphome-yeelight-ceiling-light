package com.google.android.gms.internal.common;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import com.google.errorprone.annotations.InlineMe;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.RandomAccess;
import javax.annotation.CheckForNull;
import org.jspecify.nullness.NullMarked;

@NullMarked
public abstract class zzag extends zzac implements List, RandomAccess {
    private static final C0995h zza = new C0992e(zzai.zza, 0);

    zzag() {
    }

    static zzag zzi(Object[] objArr, int i) {
        return i == 0 ? zzai.zza : new zzai(objArr, i);
    }

    public static zzag zzj(Iterable iterable) {
        Objects.requireNonNull(iterable);
        if (iterable instanceof Collection) {
            return zzk((Collection) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return zzai.zza;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return zzm(next);
        }
        C0991d dVar = new C0991d(4);
        dVar.mo12461c(next);
        dVar.mo12462d(it);
        dVar.f1217c = true;
        return zzi(dVar.f1215a, dVar.f1216b);
    }

    public static zzag zzk(Collection collection) {
        if (collection instanceof zzac) {
            zzag zzd = ((zzac) collection).zzd();
            if (!zzd.zzf()) {
                return zzd;
            }
            Object[] array = zzd.toArray();
            return zzi(array, array.length);
        }
        Object[] array2 = collection.toArray();
        int length = array2.length;
        C0993f.m1650a(array2, length);
        return zzi(array2, length);
    }

    public static zzag zzl() {
        return zzai.zza;
    }

    public static zzag zzm(Object obj) {
        Object[] objArr = {obj};
        C0993f.m1650a(objArr, 1);
        return zzi(objArr, 1);
    }

    public static zzag zzn(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        C0993f.m1650a(objArr, 2);
        return zzi(objArr, 2);
    }

    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final boolean contains(@CheckForNull Object obj) {
        return indexOf(obj) >= 0;
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    int i = 0;
                    while (i < size) {
                        if (C1001n.m1658a(get(i), list.get(i))) {
                            i++;
                        }
                    }
                    return true;
                }
                Iterator it = iterator();
                Iterator it2 = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it2.hasNext()) {
                            if (!C1001n.m1658a(it.next(), it2.next())) {
                                break;
                            }
                        } else {
                            break;
                        }
                    } else if (!it2.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    public final int indexOf(@CheckForNull Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    public final int lastIndexOf(@CheckForNull Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public int zza(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i2] = get(i2);
        }
        return size;
    }

    @InlineMe(replacement = "this")
    @Deprecated
    public final zzag zzd() {
        return this;
    }

    public final C0994g zze() {
        return listIterator(0);
    }

    /* renamed from: zzh */
    public zzag subList(int i, int i2) {
        C1002o.m1661c(i, i2, size());
        int i3 = i2 - i;
        return i3 == size() ? this : i3 == 0 ? zzai.zza : new zzaf(this, i, i3);
    }

    /* renamed from: zzo */
    public final C0995h listIterator(int i) {
        C1002o.m1660b(i, size(), "index");
        return isEmpty() ? zza : new C0992e(this, i);
    }
}
