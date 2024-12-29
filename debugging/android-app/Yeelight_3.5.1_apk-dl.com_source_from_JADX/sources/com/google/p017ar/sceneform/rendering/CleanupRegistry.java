package com.google.p017ar.sceneform.rendering;

import com.google.p017ar.sceneform.resources.ResourceHolder;
import java.lang.ref.ReferenceQueue;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: com.google.ar.sceneform.rendering.CleanupRegistry */
public class CleanupRegistry<T> implements ResourceHolder {
    private final HashSet<C2125c<T>> cleanupItemHashSet;
    private final ReferenceQueue<T> referenceQueue;

    public CleanupRegistry() {
        this(new HashSet(), new ReferenceQueue());
    }

    public CleanupRegistry(HashSet<C2125c<T>> hashSet, ReferenceQueue<T> referenceQueue2) {
        this.cleanupItemHashSet = hashSet;
        this.referenceQueue = referenceQueue2;
    }

    public void destroyAllResources() {
        Iterator<C2125c<T>> it = this.cleanupItemHashSet.iterator();
        while (it.hasNext()) {
            it.remove();
            it.next().mo17709a();
        }
    }

    public long reclaimReleasedResources() {
        while (true) {
            C2125c cVar = (C2125c) this.referenceQueue.poll();
            if (cVar == null) {
                return (long) this.cleanupItemHashSet.size();
            }
            if (this.cleanupItemHashSet.contains(cVar)) {
                cVar.mo17709a();
                this.cleanupItemHashSet.remove(cVar);
            }
        }
    }

    public void register(T t, Runnable runnable) {
        this.cleanupItemHashSet.add(new C2125c(t, this.referenceQueue, runnable));
    }
}
