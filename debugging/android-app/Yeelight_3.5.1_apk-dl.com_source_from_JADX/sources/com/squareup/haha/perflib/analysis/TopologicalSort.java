package com.squareup.haha.perflib.analysis;

import com.squareup.haha.guava.base.Ascii;
import com.squareup.haha.guava.collect.ImmutableList;
import com.squareup.haha.guava.collect.UnmodifiableIterator;
import com.squareup.haha.perflib.Instance;
import com.squareup.haha.perflib.NonRecursiveVisitor;
import com.squareup.haha.perflib.RootObj;
import com.squareup.haha.perflib.Snapshot;
import com.squareup.haha.trove.TLongHashSet;
import java.util.ArrayList;
import java.util.List;

public class TopologicalSort {

    static class TopologicalSortVisitor extends NonRecursiveVisitor {
        private final List<Instance> mPostorder;
        private final TLongHashSet mVisited;

        private TopologicalSortVisitor() {
            this.mVisited = new TLongHashSet();
            this.mPostorder = new ArrayList();
        }

        public void doVisit(Iterable<? extends Instance> iterable) {
            for (Instance accept : iterable) {
                accept.accept(this);
            }
            while (!this.mStack.isEmpty()) {
                Instance peek = this.mStack.peek();
                if (this.mSeen.add(peek.getId())) {
                    peek.accept(this);
                } else {
                    this.mStack.pop();
                    if (this.mVisited.add(peek.getId())) {
                        this.mPostorder.add(peek);
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        public ImmutableList<Instance> getOrderedInstances() {
            return ImmutableList.copyOf(Ascii.reverse(this.mPostorder));
        }

        public void visitLater(Instance instance, Instance instance2) {
            if (!this.mSeen.contains(instance2.getId())) {
                this.mStack.push(instance2);
            }
        }
    }

    public static ImmutableList<Instance> compute(Iterable<RootObj> iterable) {
        TopologicalSortVisitor topologicalSortVisitor = new TopologicalSortVisitor();
        topologicalSortVisitor.doVisit(iterable);
        ImmutableList<Instance> orderedInstances = topologicalSortVisitor.getOrderedInstances();
        int i = 0;
        Snapshot.SENTINEL_ROOT.setTopologicalOrder(0);
        UnmodifiableIterator<Instance> it = orderedInstances.iterator();
        while (it.hasNext()) {
            i++;
            it.next().setTopologicalOrder(i);
        }
        return orderedInstances;
    }
}
