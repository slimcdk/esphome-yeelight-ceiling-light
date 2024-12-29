package com.squareup.haha.perflib.analysis;

import com.squareup.haha.perflib.Instance;
import com.squareup.haha.perflib.NonRecursiveVisitor;
import java.util.Comparator;
import java.util.PriorityQueue;

public class ShortestDistanceVisitor extends NonRecursiveVisitor {
    private Instance mPreviousInstance = null;
    private PriorityQueue<Instance> mPriorityQueue = new PriorityQueue<>(1024, new Comparator<Instance>() {
        public int compare(Instance instance, Instance instance2) {
            return instance.getDistanceToGcRoot() - instance2.getDistanceToGcRoot();
        }
    });
    private int mVisitDistance = 0;

    public void doVisit(Iterable<? extends Instance> iterable) {
        for (Instance accept : iterable) {
            accept.accept(this);
        }
        while (!this.mPriorityQueue.isEmpty()) {
            Instance poll = this.mPriorityQueue.poll();
            this.mVisitDistance = poll.getDistanceToGcRoot() + 1;
            this.mPreviousInstance = poll;
            poll.accept(this);
        }
    }

    public void visitLater(Instance instance, Instance instance2) {
        if (this.mVisitDistance >= instance2.getDistanceToGcRoot()) {
            return;
        }
        if (instance == null || instance2.getSoftReferences() == null || !instance2.getSoftReferences().contains(instance) || instance2.getIsSoftReference()) {
            instance2.setDistanceToGcRoot(this.mVisitDistance);
            instance2.setNextInstanceToGcRoot(this.mPreviousInstance);
            this.mPriorityQueue.add(instance2);
        }
    }
}
