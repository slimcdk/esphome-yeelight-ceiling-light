package p164h.p211a.p212a.p228h;

import androidx.appcompat.widget.ActivityChooserView;
import java.util.AbstractList;
import java.util.Collection;
import java.util.NoSuchElementException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: h.a.a.h.e */
public class C11117e<E> extends AbstractList<E> implements BlockingQueue<E> {

    /* renamed from: a */
    private final int f21998a;

    /* renamed from: b */
    private final AtomicInteger f21999b = new AtomicInteger();

    /* renamed from: c */
    private final int f22000c;

    /* renamed from: d */
    private volatile int f22001d;

    /* renamed from: e */
    private Object[] f22002e;

    /* renamed from: f */
    private final ReentrantLock f22003f;

    /* renamed from: g */
    private final Condition f22004g;

    /* renamed from: h */
    private int f22005h;

    /* renamed from: i */
    private final ReentrantLock f22006i;

    /* renamed from: j */
    private int f22007j;

    public C11117e(int i, int i2) {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f22003f = reentrantLock;
        this.f22004g = reentrantLock.newCondition();
        this.f22006i = new ReentrantLock();
        Object[] objArr = new Object[i];
        this.f22002e = objArr;
        this.f22001d = objArr.length;
        this.f22000c = i2;
        this.f21998a = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
    }

    /* renamed from: d */
    private boolean m28855d() {
        int i;
        if (this.f22000c <= 0) {
            return false;
        }
        this.f22006i.lock();
        try {
            this.f22003f.lock();
            int i2 = this.f22005h;
            int i3 = this.f22007j;
            Object[] objArr = new Object[(this.f22001d + this.f22000c)];
            if (i2 < i3) {
                i = i3 - i2;
                System.arraycopy(this.f22002e, i2, objArr, 0, i);
            } else {
                if (i2 <= i3) {
                    if (this.f21999b.get() <= 0) {
                        i = 0;
                    }
                }
                int i4 = (this.f22001d + i3) - i2;
                int i5 = this.f22001d - i2;
                System.arraycopy(this.f22002e, i2, objArr, 0, i5);
                System.arraycopy(this.f22002e, 0, objArr, i5, i3);
                i = i4;
            }
            this.f22002e = objArr;
            this.f22001d = objArr.length;
            this.f22005h = 0;
            this.f22007j = i;
            this.f22003f.unlock();
            this.f22006i.unlock();
            return true;
        } catch (Throwable th) {
            this.f22006i.unlock();
            throw th;
        }
    }

    public void add(int i, E e) {
        if (e != null) {
            this.f22006i.lock();
            try {
                this.f22003f.lock();
                if (i >= 0) {
                    if (i <= this.f21999b.get()) {
                        if (i == this.f21999b.get()) {
                            add(e);
                        } else {
                            if (this.f22007j == this.f22005h) {
                                if (!m28855d()) {
                                    throw new IllegalStateException("full");
                                }
                            }
                            int i2 = this.f22005h + i;
                            if (i2 >= this.f22001d) {
                                i2 -= this.f22001d;
                            }
                            this.f21999b.incrementAndGet();
                            int i3 = (this.f22007j + 1) % this.f22001d;
                            this.f22007j = i3;
                            if (i2 < i3) {
                                System.arraycopy(this.f22002e, i2, this.f22002e, i2 + 1, i3 - i2);
                                this.f22002e[i2] = e;
                            } else {
                                if (i3 > 0) {
                                    System.arraycopy(this.f22002e, 0, this.f22002e, 1, i3);
                                    this.f22002e[0] = this.f22002e[this.f22001d - 1];
                                }
                                System.arraycopy(this.f22002e, i2, this.f22002e, i2 + 1, (this.f22001d - i2) - 1);
                                this.f22002e[i2] = e;
                            }
                        }
                        this.f22003f.unlock();
                        this.f22006i.unlock();
                        return;
                    }
                }
                throw new IndexOutOfBoundsException("!(0<" + i + "<=" + this.f21999b + ")");
            } catch (Throwable th) {
                this.f22006i.unlock();
                throw th;
            }
        } else {
            throw null;
        }
    }

    public boolean add(E e) {
        return offer(e);
    }

    /* renamed from: c */
    public int mo35324c() {
        return this.f22001d;
    }

    public void clear() {
        this.f22006i.lock();
        try {
            this.f22003f.lock();
            this.f22005h = 0;
            this.f22007j = 0;
            this.f21999b.set(0);
            this.f22003f.unlock();
            this.f22006i.unlock();
        } catch (Throwable th) {
            this.f22006i.unlock();
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
        this.f22006i.lock();
        try {
            this.f22003f.lock();
            if (i >= 0) {
                if (i < this.f21999b.get()) {
                    int i2 = this.f22005h + i;
                    if (i2 >= this.f22001d) {
                        i2 -= this.f22001d;
                    }
                    E e = this.f22002e[i2];
                    this.f22003f.unlock();
                    this.f22006i.unlock();
                    return e;
                }
            }
            throw new IndexOutOfBoundsException("!(0<" + i + "<=" + this.f21999b + ")");
        } catch (Throwable th) {
            this.f22006i.unlock();
            throw th;
        }
    }

    public boolean isEmpty() {
        return this.f21999b.get() == 0;
    }

    public boolean offer(E e) {
        if (e != null) {
            this.f22006i.lock();
            try {
                boolean z = false;
                if (this.f21999b.get() < this.f21998a) {
                    if (this.f21999b.get() == this.f22001d) {
                        this.f22003f.lock();
                        if (!m28855d()) {
                            this.f22003f.unlock();
                        } else {
                            this.f22003f.unlock();
                        }
                    }
                    this.f22002e[this.f22007j] = e;
                    this.f22007j = (this.f22007j + 1) % this.f22001d;
                    if (this.f21999b.getAndIncrement() == 0) {
                        z = true;
                    }
                    this.f22006i.unlock();
                    if (z) {
                        this.f22003f.lock();
                        try {
                            this.f22004g.signal();
                        } finally {
                            this.f22003f.unlock();
                        }
                    }
                    return true;
                }
                this.f22006i.unlock();
                return false;
            } catch (Throwable th) {
                this.f22006i.unlock();
                throw th;
            }
        } else {
            throw null;
        }
    }

    public boolean offer(E e, long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public E peek() {
        E e = null;
        if (this.f21999b.get() == 0) {
            return null;
        }
        this.f22003f.lock();
        try {
            if (this.f21999b.get() > 0) {
                e = this.f22002e[this.f22005h];
            }
            return e;
        } finally {
            this.f22003f.unlock();
        }
    }

    public E poll() {
        E e = null;
        if (this.f21999b.get() == 0) {
            return null;
        }
        this.f22003f.lock();
        try {
            if (this.f21999b.get() > 0) {
                int i = this.f22005h;
                E e2 = this.f22002e[i];
                this.f22002e[i] = null;
                this.f22005h = (i + 1) % this.f22001d;
                if (this.f21999b.decrementAndGet() > 0) {
                    this.f22004g.signal();
                }
                e = e2;
            }
            return e;
        } finally {
            this.f22003f.unlock();
        }
    }

    public E poll(long j, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j);
        this.f22003f.lockInterruptibly();
        while (this.f21999b.get() == 0) {
            try {
                if (nanos <= 0) {
                    this.f22003f.unlock();
                    return null;
                }
                nanos = this.f22004g.awaitNanos(nanos);
            } catch (InterruptedException e) {
                this.f22004g.signal();
                throw e;
            } catch (Throwable th) {
                this.f22003f.unlock();
                throw th;
            }
        }
        E e2 = this.f22002e[this.f22005h];
        this.f22002e[this.f22005h] = null;
        this.f22005h = (this.f22005h + 1) % this.f22001d;
        if (this.f21999b.decrementAndGet() > 0) {
            this.f22004g.signal();
        }
        this.f22003f.unlock();
        return e2;
    }

    public void put(E e) {
        if (!add(e)) {
            throw new IllegalStateException("full");
        }
    }

    public int remainingCapacity() {
        this.f22006i.lock();
        try {
            this.f22003f.lock();
            int c = mo35324c() - size();
            this.f22003f.unlock();
            this.f22006i.unlock();
            return c;
        } catch (Throwable th) {
            this.f22006i.unlock();
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
        this.f22006i.lock();
        try {
            this.f22003f.lock();
            if (i >= 0) {
                if (i < this.f21999b.get()) {
                    int i3 = this.f22005h + i;
                    if (i3 >= this.f22001d) {
                        i3 -= this.f22001d;
                    }
                    E e = this.f22002e[i3];
                    if (i3 < this.f22007j) {
                        System.arraycopy(this.f22002e, i3 + 1, this.f22002e, i3, this.f22007j - i3);
                        this.f22007j--;
                        atomicInteger = this.f21999b;
                    } else {
                        System.arraycopy(this.f22002e, i3 + 1, this.f22002e, i3, (this.f22001d - i3) - 1);
                        if (this.f22007j > 0) {
                            this.f22002e[this.f22001d] = this.f22002e[0];
                            System.arraycopy(this.f22002e, 1, this.f22002e, 0, this.f22007j - 1);
                            i2 = this.f22007j;
                        } else {
                            i2 = this.f22001d;
                        }
                        this.f22007j = i2 - 1;
                        atomicInteger = this.f21999b;
                    }
                    atomicInteger.decrementAndGet();
                    this.f22003f.unlock();
                    this.f22006i.unlock();
                    return e;
                }
            }
            throw new IndexOutOfBoundsException("!(0<" + i + "<=" + this.f21999b + ")");
        } catch (Throwable th) {
            this.f22006i.unlock();
            throw th;
        }
    }

    public E set(int i, E e) {
        if (e != null) {
            this.f22006i.lock();
            try {
                this.f22003f.lock();
                if (i >= 0) {
                    if (i < this.f21999b.get()) {
                        int i2 = this.f22005h + i;
                        if (i2 >= this.f22001d) {
                            i2 -= this.f22001d;
                        }
                        E e2 = this.f22002e[i2];
                        this.f22002e[i2] = e;
                        this.f22003f.unlock();
                        this.f22006i.unlock();
                        return e2;
                    }
                }
                throw new IndexOutOfBoundsException("!(0<" + i + "<=" + this.f21999b + ")");
            } catch (Throwable th) {
                this.f22006i.unlock();
                throw th;
            }
        } else {
            throw null;
        }
    }

    public int size() {
        return this.f21999b.get();
    }

    public E take() {
        this.f22003f.lockInterruptibly();
        while (this.f21999b.get() == 0) {
            try {
                this.f22004g.await();
            } catch (InterruptedException e) {
                this.f22004g.signal();
                throw e;
            } catch (Throwable th) {
                this.f22003f.unlock();
                throw th;
            }
        }
        int i = this.f22005h;
        E e2 = this.f22002e[i];
        this.f22002e[i] = null;
        this.f22005h = (i + 1) % this.f22001d;
        if (this.f21999b.decrementAndGet() > 0) {
            this.f22004g.signal();
        }
        this.f22003f.unlock();
        return e2;
    }
}
