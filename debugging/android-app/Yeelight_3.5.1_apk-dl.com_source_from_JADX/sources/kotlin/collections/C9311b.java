package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.C9422o;
import kotlin.jvm.internal.C9424q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p129b4.C3989c;

@SinceKotlin(version = "1.1")
/* renamed from: kotlin.collections.b */
public abstract class C9311b<E> extends AbstractCollection<E> implements List<E> {
    @NotNull

    /* renamed from: a */
    public static final C9312a f17241a = new C9312a((C9422o) null);

    /* renamed from: kotlin.collections.b$a */
    public static final class C9312a {
        private C9312a() {
        }

        public /* synthetic */ C9312a(C9422o oVar) {
            this();
        }

        /* renamed from: a */
        public final void mo38014a(int i, int i2) {
            if (i < 0 || i >= i2) {
                throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
            }
        }

        /* renamed from: b */
        public final void mo38015b(int i, int i2) {
            if (i < 0 || i > i2) {
                throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
            }
        }

        /* renamed from: c */
        public final void mo38016c(int i, int i2, int i3) {
            if (i < 0 || i2 > i3) {
                throw new IndexOutOfBoundsException("fromIndex: " + i + ", toIndex: " + i2 + ", size: " + i3);
            } else if (i > i2) {
                throw new IllegalArgumentException("fromIndex: " + i + " > toIndex: " + i2);
            }
        }

        /* renamed from: d */
        public final boolean mo38017d(@NotNull Collection<?> collection, @NotNull Collection<?> collection2) {
            C9424q.m22996e(collection, C3989c.f6735c);
            C9424q.m22996e(collection2, "other");
            if (collection.size() != collection2.size()) {
                return false;
            }
            Iterator<?> it = collection2.iterator();
            for (Object a : collection) {
                if (!C9424q.m22992a(a, it.next())) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: e */
        public final int mo38018e(@NotNull Collection<?> collection) {
            C9424q.m22996e(collection, C3989c.f6735c);
            Iterator<?> it = collection.iterator();
            int i = 1;
            while (it.hasNext()) {
                Object next = it.next();
                i = (i * 31) + (next != null ? next.hashCode() : 0);
            }
            return i;
        }
    }

    /* renamed from: kotlin.collections.b$b */
    private class C9313b implements Iterator<E> {

        /* renamed from: a */
        private int f17242a;

        public C9313b() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final int mo38019a() {
            return this.f17242a;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final void mo38020b(int i) {
            this.f17242a = i;
        }

        public boolean hasNext() {
            return this.f17242a < C9311b.this.size();
        }

        public E next() {
            if (hasNext()) {
                C9311b<E> bVar = C9311b.this;
                int i = this.f17242a;
                this.f17242a = i + 1;
                return bVar.get(i);
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: kotlin.collections.b$c */
    private class C9314c extends C9311b<E>.b implements ListIterator<E> {
        public C9314c(int i) {
            super();
            C9311b.f17241a.mo38015b(i, C9311b.this.size());
            mo38020b(i);
        }

        public void add(E e) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean hasPrevious() {
            return mo38019a() > 0;
        }

        public int nextIndex() {
            return mo38019a();
        }

        public E previous() {
            if (hasPrevious()) {
                C9311b<E> bVar = C9311b.this;
                mo38020b(mo38019a() - 1);
                return bVar.get(mo38019a());
            }
            throw new NoSuchElementException();
        }

        public int previousIndex() {
            return mo38019a() - 1;
        }

        public void set(E e) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: kotlin.collections.b$d */
    private static final class C9315d<E> extends C9311b<E> implements RandomAccess {
        @NotNull

        /* renamed from: b */
        private final C9311b<E> f17245b;

        /* renamed from: c */
        private final int f17246c;

        /* renamed from: d */
        private int f17247d;

        public C9315d(@NotNull C9311b<? extends E> bVar, int i, int i2) {
            C9424q.m22996e(bVar, "list");
            this.f17245b = bVar;
            this.f17246c = i;
            C9311b.f17241a.mo38016c(i, i2, bVar.size());
            this.f17247d = i2 - i;
        }

        /* renamed from: b */
        public int mo37904b() {
            return this.f17247d;
        }

        public E get(int i) {
            C9311b.f17241a.mo38014a(i, this.f17247d);
            return this.f17245b.get(this.f17246c + i);
        }
    }

    protected C9311b() {
    }

    public void add(int i, E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        return f17241a.mo38017d(this, (Collection) obj);
    }

    public abstract E get(int i);

    public int hashCode() {
        return f17241a.mo38018e(this);
    }

    public int indexOf(E e) {
        int i = 0;
        for (Object a : this) {
            if (C9424q.m22992a(a, e)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @NotNull
    public Iterator<E> iterator() {
        return new C9313b();
    }

    public int lastIndexOf(E e) {
        ListIterator listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (C9424q.m22992a(listIterator.previous(), e)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    @NotNull
    public ListIterator<E> listIterator() {
        return new C9314c(0);
    }

    @NotNull
    public ListIterator<E> listIterator(int i) {
        return new C9314c(i);
    }

    public E remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public E set(int i, E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @NotNull
    public List<E> subList(int i, int i2) {
        return new C9315d(this, i, i2);
    }
}
