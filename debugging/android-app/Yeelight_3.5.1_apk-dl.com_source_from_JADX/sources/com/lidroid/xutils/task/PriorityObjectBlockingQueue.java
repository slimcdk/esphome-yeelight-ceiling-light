package com.lidroid.xutils.task;

import androidx.appcompat.widget.ActivityChooserView;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractQueue;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class PriorityObjectBlockingQueue<E> extends AbstractQueue<E> implements BlockingQueue<E>, Serializable {
    private static final long serialVersionUID = -6903933977591709194L;
    private final int capacity;
    private final AtomicInteger count;
    transient C2695a<E> head;
    private transient C2695a<E> last;
    private final Condition notEmpty;
    private final Condition notFull;
    private final ReentrantLock putLock;
    private final ReentrantLock takeLock;

    /* renamed from: com.lidroid.xutils.task.PriorityObjectBlockingQueue$a */
    private class C2694a implements Iterator<E> {

        /* renamed from: a */
        private C2695a<E> f4673a;

        /* renamed from: b */
        private C2695a<E> f4674b;

        /* renamed from: c */
        private E f4675c;

        C2694a() {
            PriorityObjectBlockingQueue.this.fullyLock();
            try {
                C2695a aVar = PriorityObjectBlockingQueue.this.head.f4679c;
                this.f4673a = aVar;
                if (aVar != null) {
                    this.f4675c = aVar.mo20383b();
                }
            } finally {
                PriorityObjectBlockingQueue.this.fullyUnlock();
            }
        }

        /* renamed from: a */
        private C2695a<E> m7494a(C2695a<E> aVar) {
            C2695a<T> aVar2;
            while (true) {
                aVar2 = aVar.f4679c;
                if (aVar2 == aVar) {
                    return PriorityObjectBlockingQueue.this.head.f4679c;
                }
                if (aVar2 == null || aVar2.mo20383b() != null) {
                    return aVar2;
                }
                aVar = aVar2;
            }
            return aVar2;
        }

        public boolean hasNext() {
            return this.f4673a != null;
        }

        public E next() {
            PriorityObjectBlockingQueue.this.fullyLock();
            try {
                C2695a<E> aVar = this.f4673a;
                if (aVar != null) {
                    E e = this.f4675c;
                    this.f4674b = aVar;
                    C2695a<E> a = m7494a(aVar);
                    this.f4673a = a;
                    this.f4675c = a == null ? null : a.mo20383b();
                    return e;
                }
                throw new NoSuchElementException();
            } finally {
                PriorityObjectBlockingQueue.this.fullyUnlock();
            }
        }

        public void remove() {
            if (this.f4674b != null) {
                PriorityObjectBlockingQueue.this.fullyLock();
                try {
                    C2695a<E> aVar = this.f4674b;
                    this.f4674b = null;
                    C2695a<E> aVar2 = PriorityObjectBlockingQueue.this.head;
                    while (true) {
                        C2695a<E> aVar3 = aVar2;
                        aVar2 = aVar2.f4679c;
                        if (aVar2 != null) {
                            if (aVar2 == aVar) {
                                PriorityObjectBlockingQueue.this.unlink(aVar2, aVar3);
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                } finally {
                    PriorityObjectBlockingQueue.this.fullyUnlock();
                }
            } else {
                throw new IllegalStateException();
            }
        }
    }

    public PriorityObjectBlockingQueue() {
        this((int) ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
    }

    public PriorityObjectBlockingQueue(int i) {
        this.count = new AtomicInteger();
        ReentrantLock reentrantLock = new ReentrantLock();
        this.takeLock = reentrantLock;
        this.notEmpty = reentrantLock.newCondition();
        ReentrantLock reentrantLock2 = new ReentrantLock();
        this.putLock = reentrantLock2;
        this.notFull = reentrantLock2.newCondition();
        if (i > 0) {
            this.capacity = i;
            C2695a<E> aVar = new C2695a<>(null);
            this.head = aVar;
            this.last = aVar;
            return;
        }
        throw new IllegalArgumentException();
    }

    public PriorityObjectBlockingQueue(Collection<? extends E> collection) {
        this((int) ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
        ReentrantLock reentrantLock = this.putLock;
        reentrantLock.lock();
        int i = 0;
        try {
            for (Object next : collection) {
                if (next == null) {
                    throw new NullPointerException();
                } else if (i != this.capacity) {
                    opQueue(new C2695a(next));
                    i++;
                } else {
                    throw new IllegalStateException("Queue full");
                }
            }
            this.count.set(i);
        } finally {
            reentrantLock.unlock();
        }
    }

    private E _dequeue() {
        C2695a<E> aVar = this.head;
        C2695a aVar2 = aVar.f4679c;
        aVar.f4679c = aVar;
        this.head = aVar2;
        E b = aVar2.mo20383b();
        aVar2.mo20384c(null);
        return b;
    }

    private void _enqueue(C2695a<E> aVar) {
        boolean z;
        C2695a aVar2 = this.head;
        while (true) {
            C2695a<T> aVar3 = aVar2.f4679c;
            if (aVar3 == null) {
                z = false;
                break;
            } else if (aVar3.mo20382a().ordinal() > aVar.mo20382a().ordinal()) {
                aVar2.f4679c = aVar;
                aVar.f4679c = aVar3;
                z = true;
                break;
            } else {
                aVar2 = aVar2.f4679c;
            }
        }
        if (!z) {
            this.last.f4679c = aVar;
            this.last = aVar;
        }
    }

    private synchronized E opQueue(C2695a<E> aVar) {
        if (aVar == null) {
            return _dequeue();
        }
        _enqueue(aVar);
        return null;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.count.set(0);
        C2695a<E> aVar = new C2695a<>(null);
        this.head = aVar;
        this.last = aVar;
        while (true) {
            Object readObject = objectInputStream.readObject();
            if (readObject != null) {
                add(readObject);
            } else {
                return;
            }
        }
    }

    private void signalNotEmpty() {
        ReentrantLock reentrantLock = this.takeLock;
        reentrantLock.lock();
        try {
            this.notEmpty.signal();
        } finally {
            reentrantLock.unlock();
        }
    }

    private void signalNotFull() {
        ReentrantLock reentrantLock = this.putLock;
        reentrantLock.lock();
        try {
            this.notFull.signal();
        } finally {
            reentrantLock.unlock();
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        fullyLock();
        try {
            objectOutputStream.defaultWriteObject();
            C2695a aVar = this.head;
            while (true) {
                aVar = aVar.f4679c;
                if (aVar == null) {
                    objectOutputStream.writeObject((Object) null);
                    return;
                }
                objectOutputStream.writeObject(aVar.mo20383b());
            }
        } finally {
            fullyUnlock();
        }
    }

    public void clear() {
        fullyLock();
        try {
            C2695a<E> aVar = this.head;
            while (true) {
                C2695a<T> aVar2 = aVar.f4679c;
                if (aVar2 == null) {
                    break;
                }
                aVar.f4679c = aVar;
                aVar2.mo20384c(null);
                aVar = aVar2;
            }
            this.head = this.last;
            if (this.count.getAndSet(0) == this.capacity) {
                this.notFull.signal();
            }
        } finally {
            fullyUnlock();
        }
    }

    /* JADX INFO: finally extract failed */
    public boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        fullyLock();
        try {
            C2695a aVar = this.head;
            do {
                aVar = aVar.f4679c;
                if (aVar == null) {
                    fullyUnlock();
                    return false;
                }
            } while (!obj.equals(aVar.mo20383b()));
            fullyUnlock();
            return true;
        } catch (Throwable th) {
            fullyUnlock();
            throw th;
        }
    }

    public int drainTo(Collection<? super E> collection) {
        return drainTo(collection, ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
    }

    public int drainTo(Collection<? super E> collection, int i) {
        C2695a<E> aVar;
        int i2;
        Objects.requireNonNull(collection);
        if (collection != this) {
            boolean z = false;
            if (i <= 0) {
                return 0;
            }
            ReentrantLock reentrantLock = this.takeLock;
            reentrantLock.lock();
            try {
                int min = Math.min(i, this.count.get());
                aVar = this.head;
                i2 = 0;
                while (i2 < min) {
                    C2695a<T> aVar2 = aVar.f4679c;
                    collection.add(aVar2.mo20383b());
                    aVar2.mo20384c(null);
                    aVar.f4679c = aVar;
                    i2++;
                    aVar = aVar2;
                }
                if (i2 > 0) {
                    this.head = aVar;
                    if (this.count.getAndAdd(-i2) == this.capacity) {
                        z = true;
                    }
                }
                reentrantLock.unlock();
                if (z) {
                    signalNotFull();
                }
                return min;
            } catch (Throwable th) {
                reentrantLock.unlock();
                if (0 != 0) {
                    signalNotFull();
                }
                throw th;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    /* access modifiers changed from: package-private */
    public void fullyLock() {
        this.putLock.lock();
        this.takeLock.lock();
    }

    /* access modifiers changed from: package-private */
    public void fullyUnlock() {
        this.takeLock.unlock();
        this.putLock.unlock();
    }

    public Iterator<E> iterator() {
        return new C2694a();
    }

    public boolean offer(E e) {
        Objects.requireNonNull(e);
        AtomicInteger atomicInteger = this.count;
        if (atomicInteger.get() == this.capacity) {
            return false;
        }
        int i = -1;
        C2695a aVar = new C2695a(e);
        ReentrantLock reentrantLock = this.putLock;
        reentrantLock.lock();
        try {
            if (atomicInteger.get() < this.capacity) {
                opQueue(aVar);
                i = atomicInteger.getAndIncrement();
                if (i + 1 < this.capacity) {
                    this.notFull.signal();
                }
            }
            if (i == 0) {
                signalNotEmpty();
            }
            return i >= 0;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: finally extract failed */
    public boolean offer(E e, long j, TimeUnit timeUnit) {
        Objects.requireNonNull(e);
        long nanos = timeUnit.toNanos(j);
        ReentrantLock reentrantLock = this.putLock;
        AtomicInteger atomicInteger = this.count;
        reentrantLock.lockInterruptibly();
        while (atomicInteger.get() == this.capacity) {
            try {
                if (nanos <= 0) {
                    reentrantLock.unlock();
                    return false;
                }
                nanos = this.notFull.awaitNanos(nanos);
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        opQueue(new C2695a(e));
        int andIncrement = atomicInteger.getAndIncrement();
        if (andIncrement + 1 < this.capacity) {
            this.notFull.signal();
        }
        reentrantLock.unlock();
        if (andIncrement != 0) {
            return true;
        }
        signalNotEmpty();
        return true;
    }

    public E peek() {
        if (this.count.get() == 0) {
            return null;
        }
        ReentrantLock reentrantLock = this.takeLock;
        reentrantLock.lock();
        try {
            C2695a aVar = this.head.f4679c;
            if (aVar == null) {
                return null;
            }
            E b = aVar.mo20383b();
            reentrantLock.unlock();
            return b;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: finally extract failed */
    public E poll() {
        AtomicInteger atomicInteger = this.count;
        E e = null;
        if (atomicInteger.get() == 0) {
            return null;
        }
        int i = -1;
        ReentrantLock reentrantLock = this.takeLock;
        reentrantLock.lock();
        try {
            if (atomicInteger.get() > 0) {
                e = opQueue((C2695a) null);
                i = atomicInteger.getAndDecrement();
                if (i > 1) {
                    this.notEmpty.signal();
                }
            }
            reentrantLock.unlock();
            if (i == this.capacity) {
                signalNotFull();
            }
            return e;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public E poll(long j, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j);
        AtomicInteger atomicInteger = this.count;
        ReentrantLock reentrantLock = this.takeLock;
        reentrantLock.lockInterruptibly();
        while (atomicInteger.get() == 0) {
            try {
                if (nanos <= 0) {
                    return null;
                }
                nanos = this.notEmpty.awaitNanos(nanos);
            } finally {
                reentrantLock.unlock();
            }
        }
        E opQueue = opQueue((C2695a) null);
        int andDecrement = atomicInteger.getAndDecrement();
        if (andDecrement > 1) {
            this.notEmpty.signal();
        }
        reentrantLock.unlock();
        if (andDecrement == this.capacity) {
            signalNotFull();
        }
        return opQueue;
    }

    public void put(E e) {
        Objects.requireNonNull(e);
        C2695a aVar = new C2695a(e);
        ReentrantLock reentrantLock = this.putLock;
        AtomicInteger atomicInteger = this.count;
        reentrantLock.lockInterruptibly();
        while (atomicInteger.get() == this.capacity) {
            try {
                this.notFull.await();
            } finally {
                reentrantLock.unlock();
            }
        }
        opQueue(aVar);
        int andIncrement = atomicInteger.getAndIncrement();
        if (andIncrement + 1 < this.capacity) {
            this.notFull.signal();
        }
        if (andIncrement == 0) {
            signalNotEmpty();
        }
    }

    public int remainingCapacity() {
        return this.capacity - this.count.get();
    }

    /* JADX INFO: finally extract failed */
    public boolean remove(Object obj) {
        C2695a<E> aVar;
        if (obj == null) {
            return false;
        }
        fullyLock();
        try {
            C2695a<E> aVar2 = this.head;
            do {
                aVar = aVar2;
                aVar2 = aVar2.f4679c;
                if (aVar2 == null) {
                    fullyUnlock();
                    return false;
                }
            } while (!obj.equals(aVar2.mo20383b()));
            unlink(aVar2, aVar);
            fullyUnlock();
            return true;
        } catch (Throwable th) {
            fullyUnlock();
            throw th;
        }
    }

    public int size() {
        return this.count.get();
    }

    /* JADX INFO: finally extract failed */
    public E take() {
        AtomicInteger atomicInteger = this.count;
        ReentrantLock reentrantLock = this.takeLock;
        reentrantLock.lockInterruptibly();
        while (atomicInteger.get() == 0) {
            try {
                this.notEmpty.await();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        E opQueue = opQueue((C2695a) null);
        int andDecrement = atomicInteger.getAndDecrement();
        if (andDecrement > 1) {
            this.notEmpty.signal();
        }
        reentrantLock.unlock();
        if (andDecrement == this.capacity) {
            signalNotFull();
        }
        return opQueue;
    }

    public Object[] toArray() {
        fullyLock();
        try {
            Object[] objArr = new Object[this.count.get()];
            int i = 0;
            C2695a<T> aVar = this.head.f4679c;
            while (aVar != null) {
                int i2 = i + 1;
                objArr[i] = aVar.mo20383b();
                aVar = aVar.f4679c;
                i = i2;
            }
            return objArr;
        } finally {
            fullyUnlock();
        }
    }

    public <T> T[] toArray(T[] tArr) {
        fullyLock();
        try {
            int i = this.count.get();
            if (tArr.length < i) {
                tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), i);
            }
            int i2 = 0;
            C2695a<T> aVar = this.head.f4679c;
            while (aVar != null) {
                int i3 = i2 + 1;
                tArr[i2] = aVar.mo20383b();
                aVar = aVar.f4679c;
                i2 = i3;
            }
            if (tArr.length > i2) {
                tArr[i2] = null;
            }
            return tArr;
        } finally {
            fullyUnlock();
        }
    }

    /* access modifiers changed from: package-private */
    public void unlink(C2695a<E> aVar, C2695a<E> aVar2) {
        aVar.mo20384c(null);
        aVar2.f4679c = aVar.f4679c;
        if (this.last == aVar) {
            this.last = aVar2;
        }
        if (this.count.getAndDecrement() == this.capacity) {
            this.notFull.signal();
        }
    }
}
