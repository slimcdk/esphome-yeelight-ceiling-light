package com.google.p107ar.sceneform.resources;

import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.google.p107ar.sceneform.utilities.Preconditions;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

/* renamed from: com.google.ar.sceneform.resources.ResourceRegistry */
public class ResourceRegistry<T> implements ResourceHolder {
    private static final String TAG = "ResourceRegistry";
    @GuardedBy("lock")
    private final Map<Object, CompletableFuture<T>> futureRegistry = new HashMap();
    private final Object lock = new Object();
    @GuardedBy("lock")
    private final Map<Object, WeakReference<T>> registry = new HashMap();

    public void destroyAllResources() {
        synchronized (this.lock) {
            Iterator<Map.Entry<Object, CompletableFuture<T>>> it = this.futureRegistry.entrySet().iterator();
            while (it.hasNext()) {
                it.remove();
                CompletableFuture completableFuture = (CompletableFuture) it.next().getValue();
                if (!completableFuture.isDone()) {
                    completableFuture.cancel(true);
                }
            }
            this.registry.clear();
        }
    }

    @Nullable
    public CompletableFuture<T> get(Object obj) {
        Preconditions.checkNotNull(obj, "Parameter 'id' was null.");
        synchronized (this.lock) {
            WeakReference weakReference = this.registry.get(obj);
            if (weakReference != null) {
                Object obj2 = weakReference.get();
                if (obj2 != null) {
                    CompletableFuture<T> completedFuture = CompletableFuture.completedFuture(obj2);
                    return completedFuture;
                }
                this.registry.remove(obj);
            }
            CompletableFuture<T> completableFuture = this.futureRegistry.get(obj);
            return completableFuture;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Void lambda$register$0$ResourceRegistry(Object obj, CompletableFuture completableFuture, Object obj2, Throwable th) {
        synchronized (this) {
            synchronized (this.lock) {
                if (this.futureRegistry.get(obj) == completableFuture) {
                    this.futureRegistry.remove(obj);
                    if (th == null) {
                        this.registry.put(obj, new WeakReference(obj2));
                    }
                }
            }
        }
        return null;
    }

    public long reclaimReleasedResources() {
        return 0;
    }

    public void register(Object obj, CompletableFuture<T> completableFuture) {
        Preconditions.checkNotNull(obj, "Parameter 'id' was null.");
        Preconditions.checkNotNull(completableFuture, "Parameter 'futureResource' was null.");
        if (!completableFuture.isDone()) {
            synchronized (this.lock) {
                this.futureRegistry.put(obj, completableFuture);
                this.registry.remove(obj);
            }
            completableFuture.handle(new C2781a(this, obj, completableFuture));
        } else if (!completableFuture.isCompletedExceptionally()) {
            Object checkNotNull = Preconditions.checkNotNull(completableFuture.getNow((Object) null));
            synchronized (this.lock) {
                this.registry.put(obj, new WeakReference(checkNotNull));
                this.futureRegistry.remove(obj);
            }
        }
    }
}
