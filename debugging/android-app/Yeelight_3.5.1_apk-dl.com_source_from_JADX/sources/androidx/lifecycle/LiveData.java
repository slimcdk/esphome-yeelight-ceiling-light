package androidx.lifecycle;

import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.arch.core.executor.ArchTaskExecutor;
import androidx.arch.core.internal.SafeIterableMap;
import androidx.lifecycle.Lifecycle;
import java.util.Iterator;
import java.util.Map;

public abstract class LiveData<T> {
    static final Object NOT_SET = new Object();
    static final int START_VERSION = -1;
    int mActiveCount = 0;
    private volatile Object mData;
    final Object mDataLock = new Object();
    private boolean mDispatchInvalidated;
    private boolean mDispatchingValue;
    private SafeIterableMap<Observer<? super T>, LiveData<T>.ObserverWrapper> mObservers = new SafeIterableMap<>();
    volatile Object mPendingData;
    private final Runnable mPostValueRunnable;
    private int mVersion;

    private class AlwaysActiveObserver extends LiveData<T>.ObserverWrapper {
        AlwaysActiveObserver(Observer<? super T> observer) {
            super(observer);
        }

        /* access modifiers changed from: package-private */
        public boolean shouldBeActive() {
            return true;
        }
    }

    class LifecycleBoundObserver extends LiveData<T>.ObserverWrapper implements GenericLifecycleObserver {
        @NonNull
        final LifecycleOwner mOwner;

        LifecycleBoundObserver(@NonNull LifecycleOwner lifecycleOwner, Observer<? super T> observer) {
            super(observer);
            this.mOwner = lifecycleOwner;
        }

        /* access modifiers changed from: package-private */
        public void detachObserver() {
            this.mOwner.getLifecycle().removeObserver(this);
        }

        /* access modifiers changed from: package-private */
        public boolean isAttachedTo(LifecycleOwner lifecycleOwner) {
            return this.mOwner == lifecycleOwner;
        }

        public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            if (this.mOwner.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
                LiveData.this.removeObserver(this.mObserver);
            } else {
                activeStateChanged(shouldBeActive());
            }
        }

        /* access modifiers changed from: package-private */
        public boolean shouldBeActive() {
            return this.mOwner.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.STARTED);
        }
    }

    private abstract class ObserverWrapper {
        boolean mActive;
        int mLastVersion = -1;
        final Observer<? super T> mObserver;

        ObserverWrapper(Observer<? super T> observer) {
            this.mObserver = observer;
        }

        /* access modifiers changed from: package-private */
        public void activeStateChanged(boolean z) {
            if (z != this.mActive) {
                this.mActive = z;
                LiveData liveData = LiveData.this;
                int i = liveData.mActiveCount;
                int i2 = 1;
                boolean z2 = i == 0;
                if (!z) {
                    i2 = -1;
                }
                liveData.mActiveCount = i + i2;
                if (z2 && z) {
                    liveData.onActive();
                }
                LiveData liveData2 = LiveData.this;
                if (liveData2.mActiveCount == 0 && !this.mActive) {
                    liveData2.onInactive();
                }
                if (this.mActive) {
                    LiveData.this.dispatchingValue(this);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void detachObserver() {
        }

        /* access modifiers changed from: package-private */
        public boolean isAttachedTo(LifecycleOwner lifecycleOwner) {
            return false;
        }

        /* access modifiers changed from: package-private */
        public abstract boolean shouldBeActive();
    }

    public LiveData() {
        Object obj = NOT_SET;
        this.mData = obj;
        this.mPendingData = obj;
        this.mVersion = -1;
        this.mPostValueRunnable = new Runnable() {
            public void run() {
                Object obj;
                synchronized (LiveData.this.mDataLock) {
                    obj = LiveData.this.mPendingData;
                    LiveData.this.mPendingData = LiveData.NOT_SET;
                }
                LiveData.this.setValue(obj);
            }
        };
    }

    private static void assertMainThread(String str) {
        if (!ArchTaskExecutor.getInstance().isMainThread()) {
            throw new IllegalStateException("Cannot invoke " + str + " on a background" + " thread");
        }
    }

    private void considerNotify(LiveData<T>.ObserverWrapper observerWrapper) {
        if (observerWrapper.mActive) {
            if (!observerWrapper.shouldBeActive()) {
                observerWrapper.activeStateChanged(false);
                return;
            }
            int i = observerWrapper.mLastVersion;
            int i2 = this.mVersion;
            if (i < i2) {
                observerWrapper.mLastVersion = i2;
                observerWrapper.mObserver.onChanged(this.mData);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void dispatchingValue(@Nullable LiveData<T>.ObserverWrapper observerWrapper) {
        if (this.mDispatchingValue) {
            this.mDispatchInvalidated = true;
            return;
        }
        this.mDispatchingValue = true;
        do {
            this.mDispatchInvalidated = false;
            if (observerWrapper == null) {
                SafeIterableMap<K, V>.IteratorWithAdditions iteratorWithAdditions = this.mObservers.iteratorWithAdditions();
                while (iteratorWithAdditions.hasNext()) {
                    considerNotify((ObserverWrapper) ((Map.Entry) iteratorWithAdditions.next()).getValue());
                    if (this.mDispatchInvalidated) {
                        break;
                    }
                }
            } else {
                considerNotify(observerWrapper);
                observerWrapper = null;
            }
        } while (this.mDispatchInvalidated);
        this.mDispatchingValue = false;
    }

    @Nullable
    public T getValue() {
        T t = this.mData;
        if (t != NOT_SET) {
            return t;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public int getVersion() {
        return this.mVersion;
    }

    public boolean hasActiveObservers() {
        return this.mActiveCount > 0;
    }

    public boolean hasObservers() {
        return this.mObservers.size() > 0;
    }

    @MainThread
    public void observe(@NonNull LifecycleOwner lifecycleOwner, @NonNull Observer<? super T> observer) {
        assertMainThread("observe");
        if (lifecycleOwner.getLifecycle().getCurrentState() != Lifecycle.State.DESTROYED) {
            LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(lifecycleOwner, observer);
            ObserverWrapper putIfAbsent = this.mObservers.putIfAbsent(observer, lifecycleBoundObserver);
            if (putIfAbsent != null && !putIfAbsent.isAttachedTo(lifecycleOwner)) {
                throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
            } else if (putIfAbsent == null) {
                lifecycleOwner.getLifecycle().addObserver(lifecycleBoundObserver);
            }
        }
    }

    @MainThread
    public void observeForever(@NonNull Observer<? super T> observer) {
        assertMainThread("observeForever");
        AlwaysActiveObserver alwaysActiveObserver = new AlwaysActiveObserver(observer);
        ObserverWrapper putIfAbsent = this.mObservers.putIfAbsent(observer, alwaysActiveObserver);
        if (putIfAbsent != null && (putIfAbsent instanceof LifecycleBoundObserver)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        } else if (putIfAbsent == null) {
            alwaysActiveObserver.activeStateChanged(true);
        }
    }

    /* access modifiers changed from: protected */
    public void onActive() {
    }

    /* access modifiers changed from: protected */
    public void onInactive() {
    }

    /* access modifiers changed from: protected */
    public void postValue(T t) {
        boolean z;
        synchronized (this.mDataLock) {
            z = this.mPendingData == NOT_SET;
            this.mPendingData = t;
        }
        if (z) {
            ArchTaskExecutor.getInstance().postToMainThread(this.mPostValueRunnable);
        }
    }

    @MainThread
    public void removeObserver(@NonNull Observer<? super T> observer) {
        assertMainThread("removeObserver");
        ObserverWrapper remove = this.mObservers.remove(observer);
        if (remove != null) {
            remove.detachObserver();
            remove.activeStateChanged(false);
        }
    }

    @MainThread
    public void removeObservers(@NonNull LifecycleOwner lifecycleOwner) {
        assertMainThread("removeObservers");
        Iterator<Map.Entry<Observer<? super T>, LiveData<T>.ObserverWrapper>> it = this.mObservers.iterator();
        while (it.hasNext()) {
            Map.Entry next = it.next();
            if (((ObserverWrapper) next.getValue()).isAttachedTo(lifecycleOwner)) {
                removeObserver((Observer) next.getKey());
            }
        }
    }

    /* access modifiers changed from: protected */
    @MainThread
    public void setValue(T t) {
        assertMainThread("setValue");
        this.mVersion++;
        this.mData = t;
        dispatchingValue((LiveData<T>.ObserverWrapper) null);
    }
}
