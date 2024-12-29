package org.eclipse.jetty.util;

import androidx.appcompat.widget.ActivityChooserView;
import java.util.AbstractList;
import java.util.Collection;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: org.eclipse.jetty.util.e */
public class C9981e<E> extends AbstractList<E> implements BlockingQueue<E> {

    /* renamed from: a */
    private final int f18380a;

    /* renamed from: b */
    private final AtomicInteger f18381b = new AtomicInteger();

    /* renamed from: c */
    private final int f18382c;

    /* renamed from: d */
    private volatile int f18383d;

    /* renamed from: e */
    private Object[] f18384e;

    /* renamed from: f */
    private final ReentrantLock f18385f;

    /* renamed from: g */
    private final Condition f18386g;

    /* renamed from: h */
    private int f18387h;

    /* renamed from: i */
    private final ReentrantLock f18388i;

    /* renamed from: j */
    private int f18389j;

    public C9981e(int i, int i2) {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f18385f = reentrantLock;
        this.f18386g = reentrantLock.newCondition();
        this.f18388i = new ReentrantLock();
        Object[] objArr = new Object[i];
        this.f18384e = objArr;
        this.f18383d = objArr.length;
        this.f18382c = i2;
        this.f18380a = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
    }

    /* renamed from: e */
    private boolean m24670e() {
        int i;
        if (this.f18382c <= 0) {
            return false;
        }
        this.f18388i.lock();
        try {
            this.f18385f.lock();
            int i2 = this.f18387h;
            int i3 = this.f18389j;
            Object[] objArr = new Object[(this.f18383d + this.f18382c)];
            if (i2 < i3) {
                i = i3 - i2;
                System.arraycopy(this.f18384e, i2, objArr, 0, i);
            } else {
                if (i2 <= i3) {
                    if (this.f18381b.get() <= 0) {
                        i = 0;
                    }
                }
                int i4 = (this.f18383d + i3) - i2;
                int i5 = this.f18383d - i2;
                System.arraycopy(this.f18384e, i2, objArr, 0, i5);
                System.arraycopy(this.f18384e, 0, objArr, i5, i3);
                i = i4;
            }
            this.f18384e = objArr;
            this.f18383d = objArr.length;
            this.f18387h = 0;
            this.f18389j = i;
            this.f18385f.unlock();
            this.f18388i.unlock();
            return true;
        } catch (Throwable th) {
            this.f18388i.unlock();
            throw th;
        }
    }

    public void add(int i, E e) {
        Objects.requireNonNull(e);
        this.f18388i.lock();
        try {
            this.f18385f.lock();
            if (i >= 0) {
                if (i <= this.f18381b.get()) {
                    if (i == this.f18381b.get()) {
                        add(e);
                    } else {
                        if (this.f18389j == this.f18387h) {
                            if (!m24670e()) {
                                throw new IllegalStateException("full");
                            }
                        }
                        int i2 = this.f18387h + i;
                        if (i2 >= this.f18383d) {
                            i2 -= this.f18383d;
                        }
                        this.f18381b.incrementAndGet();
                        int i3 = (this.f18389j + 1) % this.f18383d;
                        this.f18389j = i3;
                        if (i2 < i3) {
                            Object[] objArr = this.f18384e;
                            System.arraycopy(objArr, i2, objArr, i2 + 1, i3 - i2);
                            this.f18384e[i2] = e;
                        } else {
                            if (i3 > 0) {
                                Object[] objArr2 = this.f18384e;
                                System.arraycopy(objArr2, 0, objArr2, 1, i3);
                                Object[] objArr3 = this.f18384e;
                                objArr3[0] = objArr3[this.f18383d - 1];
                            }
                            Object[] objArr4 = this.f18384e;
                            System.arraycopy(objArr4, i2, objArr4, i2 + 1, (this.f18383d - i2) - 1);
                            this.f18384e[i2] = e;
                        }
                    }
                    this.f18385f.unlock();
                    this.f18388i.unlock();
                    return;
                }
            }
            throw new IndexOutOfBoundsException("!(0<" + i + "<=" + this.f18381b + ")");
        } catch (Throwable th) {
            this.f18388i.unlock();
            throw th;
        }
    }

    public boolean add(E e) {
        return offer(e);
    }

    /* renamed from: b */
    public int mo40211b() {
        return this.f18383d;
    }

    public void clear() {
        this.f18388i.lock();
        try {
            this.f18385f.lock();
            this.f18387h = 0;
            this.f18389j = 0;
            this.f18381b.set(0);
            this.f18385f.unlock();
            this.f18388i.unlock();
        } catch (Throwable th) {
            this.f18388i.unlock();
            throw th;
        }
    }

    public int drainTo(Collection<? super E> collection) {
        throw new UnsupportedOperationException();
    }

    public int drainTo(Collection<? super E> collection, int i) {
        throw new UnsupportedOperationException();
    }

    public E element() {
        E peek = peek();
        if (peek != null) {
            return peek;
        }
        throw new NoSuchElementException();
    }

    public E get(int i) {
        this.f18388i.lock();
        try {
            this.f18385f.lock();
            if (i >= 0) {
                if (i < this.f18381b.get()) {
                    int i2 = this.f18387h + i;
                    if (i2 >= this.f18383d) {
                        i2 -= this.f18383d;
                    }
                    E e = this.f18384e[i2];
                    this.f18385f.unlock();
                    this.f18388i.unlock();
                    return e;
                }
            }
            throw new IndexOutOfBoundsException("!(0<" + i + "<=" + this.f18381b + ")");
        } catch (Throwable th) {
            this.f18388i.unlock();
            throw th;
        }
    }

    public boolean isEmpty() {
        return this.f18381b.get() == 0;
    }

    public boolean offer(E e) {
        Objects.requireNonNull(e);
        this.f18388i.lock();
        try {
            boolean z = false;
            if (this.f18381b.get() < this.f18380a) {
                if (this.f18381b.get() == this.f18383d) {
                    this.f18385f.lock();
                    if (!m24670e()) {
                        this.f18385f.unlock();
                    } else {
                        this.f18385f.unlock();
                    }
                }
                Object[] objArr = this.f18384e;
                int i = this.f18389j;
                objArr[i] = e;
                this.f18389j = (i + 1) % this.f18383d;
                if (this.f18381b.getAndIncrement() == 0) {
                    z = true;
                }
                this.f18388i.unlock();
                if (z) {
                    this.f18385f.lock();
                    try {
                        this.f18386g.signal();
                    } finally {
                        this.f18385f.unlock();
                    }
                }
                return true;
            }
            this.f18388i.unlock();
            return false;
        } catch (Throwable th) {
            this.f18388i.unlock();
            throw th;
        }
    }

    public boolean offer(E e, long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public E peek() {
        E e = null;
        if (this.f18381b.get() == 0) {
            return null;
        }
        this.f18385f.lock();
        try {
            if (this.f18381b.get() > 0) {
                e = this.f18384e[this.f18387h];
            }
            return e;
        } finally {
            this.f18385f.unlock();
        }
    }

    public E poll() {
        E e = null;
        if (this.f18381b.get() == 0) {
            return null;
        }
        this.f18385f.lock();
        try {
            if (this.f18381b.get() > 0) {
                int i = this.f18387h;
                E[] eArr = this.f18384e;
                E e2 = eArr[i];
                eArr[i] = null;
                this.f18387h = (i + 1) % this.f18383d;
                if (this.f18381b.decrementAndGet() > 0) {
                    this.f18386g.signal();
                }
                e = e2;
            }
            return e;
        } finally {
            this.f18385f.unlock();
        }
    }

    public E poll(long j, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j);
        this.f18385f.lockInterruptibly();
        while (this.f18381b.get() == 0) {
            try {
                if (nanos <= 0) {
                    this.f18385f.unlock();
                    return null;
                }
                nanos = this.f18386g.awaitNanos(nanos);
            } catch (InterruptedException e) {
                this.f18386g.signal();
                throw e;
            } catch (Throwable th) {
                this.f18385f.unlock();
                throw th;
            }
        }
        E[] eArr = this.f18384e;
        int i = this.f18387h;
        E e2 = eArr[i];
        eArr[i] = null;
        this.f18387h = (i + 1) % this.f18383d;
        if (this.f18381b.decrementAndGet() > 0) {
            this.f18386g.signal();
        }
        this.f18385f.unlock();
        return e2;
    }

    public void put(E e) {
        if (!add(e)) {
            throw new IllegalStateException("full");
        }
    }

    public int remainingCapacity() {
        this.f18388i.lock();
        try {
            this.f18385f.lock();
            int b = mo40211b() - size();
            this.f18385f.unlock();
            this.f18388i.unlock();
            return b;
        } catch (Throwable th) {
            this.f18388i.unlock();
            throw th;
        }
    }

    public E remove() {
        E poll = poll();
        if (poll != null) {
            return poll;
        }
        throw new NoSuchElementException();
    }

    public E remove(int i) {
        int i2;
        AtomicInteger atomicInteger;
        this.f18388i.lock();
        try {
            this.f18385f.lock();
            if (i >= 0) {
                if (i < this.f18381b.get()) {
                    int i3 = this.f18387h + i;
                    if (i3 >= this.f18383d) {
                        i3 -= this.f18383d;
                    }
                    E[] eArr = this.f18384e;
                    E e = eArr[i3];
                    int i4 = this.f18389j;
                    if (i3 < i4) {
                        System.arraycopy(eArr, i3 + 1, eArr, i3, i4 - i3);
                        this.f18389j--;
                        atomicInteger = this.f18381b;
                    } else {
                        System.arraycopy(eArr, i3 + 1, eArr, i3, (this.f18383d - i3) - 1);
                        if (this.f18389j > 0) {
                            Object[] objArr = this.f18384e;
                            int i5 = this.f18383d;
                            Object[] objArr2 = this.f18384e;
                            objArr[i5] = objArr2[0];
                            System.arraycopy(objArr2, 1, objArr2, 0, this.f18389j - 1);
                            i2 = this.f18389j;
                        } else {
                            i2 = this.f18383d;
                        }
                        this.f18389j = i2 - 1;
                        atomicInteger = this.f18381b;
                    }
                    atomicInteger.decrementAndGet();
                    this.f18385f.unlock();
                    this.f18388i.unlock();
                    return e;
                }
            }
            throw new IndexOutOfBoundsException("!(0<" + i + "<=" + this.f18381b + ")");
        } catch (Throwable th) {
            this.f18388i.unlock();
            throw th;
        }
    }

    public E set(int i, E e) {
        Objects.requireNonNull(e);
        this.f18388i.lock();
        try {
            this.f18385f.lock();
            if (i >= 0) {
                if (i < this.f18381b.get()) {
                    int i2 = this.f18387h + i;
                    if (i2 >= this.f18383d) {
                        i2 -= this.f18383d;
                    }
                    E[] eArr = this.f18384e;
                    E e2 = eArr[i2];
                    eArr[i2] = e;
                    this.f18385f.unlock();
                    this.f18388i.unlock();
                    return e2;
                }
            }
            throw new IndexOutOfBoundsException("!(0<" + i + "<=" + this.f18381b + ")");
        } catch (Throwable th) {
            this.f18388i.unlock();
            throw th;
        }
    }

    public int size() {
        return this.f18381b.get();
    }

    public E take() {
        this.f18385f.lockInterruptibly();
        while (this.f18381b.get() == 0) {
            try {
                this.f18386g.await();
            } catch (InterruptedException e) {
                this.f18386g.signal();
                throw e;
            } catch (Throwable th) {
                this.f18385f.unlock();
                throw th;
            }
        }
        int i = this.f18387h;
        E[] eArr = this.f18384e;
        E e2 = eArr[i];
        eArr[i] = null;
        this.f18387h = (i + 1) % this.f18383d;
        if (this.f18381b.decrementAndGet() > 0) {
            this.f18386g.signal();
        }
        this.f18385f.unlock();
        return e2;
    }
}
