package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: com.google.firebase.crashlytics.internal.model.v */
public final class C3165v<E> implements List<E>, RandomAccess {

    /* renamed from: a */
    private final List<E> f6129a;

    private C3165v(List<E> list) {
        this.f6129a = Collections.unmodifiableList(list);
    }

    @NonNull
    /* renamed from: c */
    public static <E> C3165v<E> m9862c(@NonNull List<E> list) {
        return new C3165v<>(list);
    }

    @NonNull
    /* renamed from: d */
    public static <E> C3165v<E> m9863d(E... eArr) {
        return new C3165v<>(Arrays.asList(eArr));
    }

    public void add(int i, @NonNull E e) {
        this.f6129a.add(i, e);
    }

    public boolean add(@NonNull E e) {
        return this.f6129a.add(e);
    }

    public boolean addAll(int i, @NonNull Collection<? extends E> collection) {
        return this.f6129a.addAll(i, collection);
    }

    public boolean addAll(@NonNull Collection<? extends E> collection) {
        return this.f6129a.addAll(collection);
    }

    public void clear() {
        this.f6129a.clear();
    }

    public boolean contains(@Nullable Object obj) {
        return this.f6129a.contains(obj);
    }

    public boolean containsAll(@NonNull Collection<?> collection) {
        return this.f6129a.containsAll(collection);
    }

    public boolean equals(@Nullable Object obj) {
        return this.f6129a.equals(obj);
    }

    @NonNull
    public E get(int i) {
        return this.f6129a.get(i);
    }

    public int hashCode() {
        return this.f6129a.hashCode();
    }

    public int indexOf(@Nullable Object obj) {
        return this.f6129a.indexOf(obj);
    }

    public boolean isEmpty() {
        return this.f6129a.isEmpty();
    }

    @NonNull
    public Iterator<E> iterator() {
        return this.f6129a.iterator();
    }

    public int lastIndexOf(@Nullable Object obj) {
        return this.f6129a.lastIndexOf(obj);
    }

    @NonNull
    public ListIterator<E> listIterator() {
        return this.f6129a.listIterator();
    }

    @NonNull
    public ListIterator<E> listIterator(int i) {
        return this.f6129a.listIterator(i);
    }

    public E remove(int i) {
        return this.f6129a.remove(i);
    }

    public boolean remove(@Nullable Object obj) {
        return this.f6129a.remove(obj);
    }

    public boolean removeAll(@NonNull Collection<?> collection) {
        return this.f6129a.removeAll(collection);
    }

    public boolean retainAll(@NonNull Collection<?> collection) {
        return this.f6129a.retainAll(collection);
    }

    @NonNull
    public E set(int i, @NonNull E e) {
        return this.f6129a.set(i, e);
    }

    public int size() {
        return this.f6129a.size();
    }

    @NonNull
    public List<E> subList(int i, int i2) {
        return this.f6129a.subList(i, i2);
    }

    @Nullable
    public Object[] toArray() {
        return this.f6129a.toArray();
    }

    public <T> T[] toArray(@Nullable T[] tArr) {
        return this.f6129a.toArray(tArr);
    }
}
