package p015c1;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: c1.a */
public final class C0628a<E> implements List<E>, RandomAccess {

    /* renamed from: a */
    private final List<E> f239a;

    private C0628a(List<E> list) {
        this.f239a = Collections.unmodifiableList(list);
    }

    @NonNull
    /* renamed from: b */
    public static <E> C0628a<E> m237b(@NonNull List<E> list) {
        return new C0628a<>(list);
    }

    @NonNull
    /* renamed from: e */
    public static <E> C0628a<E> m238e(E... eArr) {
        return new C0628a<>(Arrays.asList(eArr));
    }

    public void add(int i, @NonNull E e) {
        this.f239a.add(i, e);
    }

    public boolean add(@NonNull E e) {
        return this.f239a.add(e);
    }

    public boolean addAll(int i, @NonNull Collection<? extends E> collection) {
        return this.f239a.addAll(i, collection);
    }

    public boolean addAll(@NonNull Collection<? extends E> collection) {
        return this.f239a.addAll(collection);
    }

    public void clear() {
        this.f239a.clear();
    }

    public boolean contains(@Nullable Object obj) {
        return this.f239a.contains(obj);
    }

    public boolean containsAll(@NonNull Collection<?> collection) {
        return this.f239a.containsAll(collection);
    }

    public boolean equals(@Nullable Object obj) {
        return this.f239a.equals(obj);
    }

    @NonNull
    public E get(int i) {
        return this.f239a.get(i);
    }

    public int hashCode() {
        return this.f239a.hashCode();
    }

    public int indexOf(@Nullable Object obj) {
        return this.f239a.indexOf(obj);
    }

    public boolean isEmpty() {
        return this.f239a.isEmpty();
    }

    @NonNull
    public Iterator<E> iterator() {
        return this.f239a.iterator();
    }

    public int lastIndexOf(@Nullable Object obj) {
        return this.f239a.lastIndexOf(obj);
    }

    @NonNull
    public ListIterator<E> listIterator() {
        return this.f239a.listIterator();
    }

    @NonNull
    public ListIterator<E> listIterator(int i) {
        return this.f239a.listIterator(i);
    }

    public E remove(int i) {
        return this.f239a.remove(i);
    }

    public boolean remove(@Nullable Object obj) {
        return this.f239a.remove(obj);
    }

    public boolean removeAll(@NonNull Collection<?> collection) {
        return this.f239a.removeAll(collection);
    }

    public boolean retainAll(@NonNull Collection<?> collection) {
        return this.f239a.retainAll(collection);
    }

    @NonNull
    public E set(int i, @NonNull E e) {
        return this.f239a.set(i, e);
    }

    public int size() {
        return this.f239a.size();
    }

    @NonNull
    public List<E> subList(int i, int i2) {
        return this.f239a.subList(i, i2);
    }

    @Nullable
    public Object[] toArray() {
        return this.f239a.toArray();
    }

    public <T> T[] toArray(@Nullable T[] tArr) {
        return this.f239a.toArray(tArr);
    }
}
