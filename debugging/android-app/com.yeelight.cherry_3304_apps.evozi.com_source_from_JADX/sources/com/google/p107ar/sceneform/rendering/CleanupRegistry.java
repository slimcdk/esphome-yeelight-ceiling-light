package com.google.p107ar.sceneform.rendering;

import com.google.p107ar.sceneform.resources.ResourceHolder;
import java.lang.ref.ReferenceQueue;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: com.google.ar.sceneform.rendering.CleanupRegistry */
public class CleanupRegistry<T> implements ResourceHolder {
    private final HashSet<C2757k0<T>> cleanupItemHashSet;
    private final ReferenceQueue<T> referenceQueue;

    public CleanupRegistry() {
        this(new HashSet(), new ReferenceQueue());
    }

    public CleanupRegistry(HashSet<C2757k0<T>> hashSet, ReferenceQueue<T> referenceQueue2) {
        this.cleanupItemHashSet = hashSet;
        this.referenceQueue = referenceQueue2;
    }

    public void destroyAllResources() {
        Iterator<C2757k0<T>> it = this.cleanupItemHashSet.iterator();
        while (it.hasNext()) {
            it.remove();
            it.next().mo16286a();
        }
    }

    public long reclaimReleasedResources() {
        while (true) {
            C2757k0 k0Var = (C2757k0) this.referenceQueue.poll();
            if (k0Var == null) {
                return (long) this.cleanupItemHashSet.size();
            }
            if (this.cleanupItemHashSet.contains(k0Var)) {
                k0Var.mo16286a();
                this.cleanupItemHashSet.remove(k0Var);
            }
        }
    }

    public void register(T t, Runnable runnable) {
        this.cleanupItemHashSet.add(new C2757k0(t, this.referenceQueue, runnable));
    }
}
