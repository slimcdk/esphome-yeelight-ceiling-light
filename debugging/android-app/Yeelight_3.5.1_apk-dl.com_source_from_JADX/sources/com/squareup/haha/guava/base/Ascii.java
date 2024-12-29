package com.squareup.haha.guava.base;

import com.squareup.haha.guava.collect.ImmutableList;
import com.squareup.haha.guava.collect.Iterators;
import com.squareup.haha.guava.collect.Lists$RandomAccessReverseList;
import com.squareup.haha.guava.collect.Lists$ReverseList;
import com.squareup.haha.guava.collect.Multiset;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;
import javax.annotation.CheckReturnValue;
import javax.annotation.Nullable;

public class Ascii {
    final String separator;

    Ascii(Ascii ascii) {
        this.separator = ascii.separator;
    }

    /* synthetic */ Ascii(Ascii ascii, byte b) {
        this(ascii);
    }

    public Ascii(String str) {
        this.separator = (String) checkNotNull(str);
    }

    static String badPositionIndex(int i, int i2, String str) {
        if (i < 0) {
            return format("%s (%s) must not be negative", str, Integer.valueOf(i));
        } else if (i2 >= 0) {
            return format("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            throw new IllegalArgumentException("negative size: " + i2);
        }
    }

    public static void checkArgument(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void checkArgument(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(format(str, objArr));
        }
    }

    public static int checkElementIndex(int i, int i2) {
        String str;
        if (i >= 0 && i < i2) {
            return i;
        }
        if (i < 0) {
            str = format("%s (%s) must not be negative", "index", Integer.valueOf(i));
        } else if (i2 < 0) {
            throw new IllegalArgumentException("negative size: " + i2);
        } else {
            str = format("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IndexOutOfBoundsException(str);
    }

    public static int checkNonnegative(int i, String str) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i);
    }

    public static <T> T checkNotNull(T t) {
        Objects.requireNonNull(t);
        return t;
    }

    public static int checkPositionIndex(int i, int i2) {
        if (i >= 0 && i <= i2) {
            return i;
        }
        throw new IndexOutOfBoundsException(badPositionIndex(i, i2, "index"));
    }

    public static void checkPositionIndexes(int i, int i2, int i3) {
        String str;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                str = badPositionIndex(i, i3, "start index");
            } else if (i2 < 0 || i2 > i3) {
                str = badPositionIndex(i2, i3, "end index");
            } else {
                str = format("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(str);
        }
    }

    public static void checkRemove(boolean z) {
        if (!z) {
            throw new IllegalStateException("no calls to next() since the last call to remove()");
        }
    }

    public static void checkState(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    @CheckReturnValue
    public static boolean equal(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static boolean equalsImpl(Set<?> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                return set.size() == set2.size() && set.containsAll(set2);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
    }

    static String format(String str, Object... objArr) {
        int indexOf;
        String valueOf = String.valueOf(str);
        StringBuilder sb = new StringBuilder(valueOf.length() + (objArr.length * 16));
        int i = 0;
        int i2 = 0;
        while (i < objArr.length && (indexOf = valueOf.indexOf("%s", i2)) != -1) {
            sb.append(valueOf.substring(i2, indexOf));
            sb.append(objArr[i]);
            int i3 = i + 1;
            i2 = indexOf + 2;
            i = i3;
        }
        sb.append(valueOf.substring(i2));
        if (i < objArr.length) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb.append(", ");
                sb.append(objArr[i4]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    @Nullable
    public static <T> T getFirst(Iterable<? extends T> iterable, T t) {
        return Iterators.getNext(iterable.iterator(), null);
    }

    public static int hash(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static int hashCodeImpl(Set<?> set) {
        Iterator<?> it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i = ((i + (next != null ? next.hashCode() : 0)) ^ -1) ^ -1;
        }
        return i;
    }

    public static <E> ArrayList<E> newArrayList(Iterator<? extends E> it) {
        ArrayList<E> arrayList = new ArrayList<>();
        Iterators.addAll(arrayList, it);
        return arrayList;
    }

    public static boolean removeAllImpl(Set<?> set, Collection<?> collection) {
        checkNotNull(collection);
        if (collection instanceof Multiset) {
            collection = ((Multiset) collection).elementSet();
        }
        return (!(collection instanceof Set) || collection.size() <= set.size()) ? removeAllImpl(set, collection.iterator()) : Iterators.removeAll(set.iterator(), collection);
    }

    public static boolean removeAllImpl(Set<?> set, Iterator<?> it) {
        boolean z = false;
        while (it.hasNext()) {
            z |= set.remove(it.next());
        }
        return z;
    }

    public static <T> boolean removeIfFromRandomAccessList(List<T> list, Predicate<? super T> predicate) {
        int i = 0;
        int i2 = 0;
        while (i < list.size()) {
            T t = list.get(i);
            if (!predicate.apply(t)) {
                if (i > i2) {
                    try {
                        list.set(i2, t);
                    } catch (UnsupportedOperationException unused) {
                        for (int size = list.size() - 1; size > i; size--) {
                            if (predicate.apply(list.get(size))) {
                                list.remove(size);
                            }
                        }
                        for (int i3 = i - 1; i3 >= i2; i3--) {
                            list.remove(i3);
                        }
                        return true;
                    }
                }
                i2++;
            }
            i++;
        }
        list.subList(i2, list.size()).clear();
        return i != i2;
    }

    public static <T> List<T> reverse(List<T> list) {
        return list instanceof ImmutableList ? ((ImmutableList) list).reverse() : list instanceof Lists$ReverseList ? ((Lists$ReverseList) list).forwardList : list instanceof RandomAccess ? new Lists$RandomAccessReverseList(list) : new Lists$ReverseList(list);
    }

    public <A extends Appendable> A appendTo(A a, Iterator<?> it) {
        checkNotNull(a);
        if (it.hasNext()) {
            while (true) {
                a.append(toString(it.next()));
                if (!it.hasNext()) {
                    break;
                }
                a.append(this.separator);
            }
        }
        return a;
    }

    public StringBuilder appendTo(StringBuilder sb, Iterator<?> it) {
        try {
            appendTo(sb, it);
            return sb;
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public String join(Iterable<?> iterable) {
        return join(iterable.iterator());
    }

    public String join(Iterator<?> it) {
        return appendTo(new StringBuilder(), it).toString();
    }

    /* access modifiers changed from: package-private */
    public CharSequence toString(Object obj) {
        checkNotNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    @CheckReturnValue
    public Ascii useForNull$5f7c8ce0(String str) {
        checkNotNull(str);
        return new Joiner$1(this, this, str);
    }

    @CheckReturnValue
    public Joiner$MapJoiner withKeyValueSeparator(String str) {
        return new Joiner$MapJoiner(this, str, (byte) 0);
    }
}
