package com.google.p017ar.sceneform;

import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.google.p017ar.sceneform.utilities.AndroidPreconditions;
import com.google.p017ar.sceneform.utilities.Preconditions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/* renamed from: com.google.ar.sceneform.NodeParent */
public class NodeParent {
    private final ArrayList<Node> children;
    private boolean isIterableChildrenDirty;
    private final ArrayList<Node> iterableChildren = new ArrayList<>();
    private int iteratingCounter;
    private final List<Node> unmodifiableChildren;

    public NodeParent() {
        ArrayList<Node> arrayList = new ArrayList<>();
        this.children = arrayList;
        this.unmodifiableChildren = Collections.unmodifiableList(arrayList);
    }

    private ArrayList<Node> getIterableChildren() {
        if (this.isIterableChildrenDirty && !isIterating()) {
            this.iterableChildren.clear();
            this.iterableChildren.addAll(this.children);
            this.isIterableChildrenDirty = false;
        }
        return this.iterableChildren;
    }

    private boolean isIterating() {
        return this.iteratingCounter > 0;
    }

    static final /* synthetic */ boolean lambda$findByName$0$NodeParent(int i, String str, Node node) {
        String name = node.getName();
        if (node.getNameHash() == 0 || node.getNameHash() != i) {
            return name != null && name.equals(str);
        }
        return true;
    }

    private void startIterating() {
        this.iteratingCounter++;
    }

    private void stopIterating() {
        int i = this.iteratingCounter - 1;
        this.iteratingCounter = i;
        if (i < 0) {
            throw new AssertionError("stopIteration was called without calling startIteration.");
        }
    }

    public final void addChild(Node node) {
        Preconditions.checkNotNull(node, "Parameter \"child\" was null.");
        AndroidPreconditions.checkUiThread();
        if (node.parent != this) {
            StringBuilder sb = new StringBuilder();
            if (canAddChild(node, sb)) {
                onAddChild(node);
                return;
            }
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public void callOnHierarchy(Consumer<Node> consumer) {
        Preconditions.checkNotNull(consumer, "Parameter \"consumer\" was null.");
        ArrayList<Node> iterableChildren2 = getIterableChildren();
        startIterating();
        for (int i = 0; i < iterableChildren2.size(); i++) {
            iterableChildren2.get(i).callOnHierarchy(consumer);
        }
        stopIterating();
    }

    /* access modifiers changed from: protected */
    public boolean canAddChild(Node node, StringBuilder sb) {
        Preconditions.checkNotNull(node, "Parameter \"child\" was null.");
        Preconditions.checkNotNull(sb, "Parameter \"failureReason\" was null.");
        if (node != this) {
            return true;
        }
        sb.append("Cannot add child: Cannot make a node a child of itself.");
        return false;
    }

    @Nullable
    public Node findByName(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        return findInHierarchy(new C2072h(str.hashCode(), str));
    }

    @Nullable
    public Node findInHierarchy(Predicate<Node> predicate) {
        Preconditions.checkNotNull(predicate, "Parameter \"condition\" was null.");
        ArrayList<Node> iterableChildren2 = getIterableChildren();
        startIterating();
        Node node = null;
        int i = 0;
        while (i < iterableChildren2.size() && (node = iterableChildren2.get(i).findInHierarchy(predicate)) == null) {
            i++;
        }
        stopIterating();
        return node;
    }

    public final List<Node> getChildren() {
        return this.unmodifiableChildren;
    }

    /* access modifiers changed from: protected */
    @CallSuper
    public void onAddChild(Node node) {
        Preconditions.checkNotNull(node, "Parameter \"child\" was null.");
        NodeParent nodeParent = node.getNodeParent();
        if (nodeParent != null) {
            nodeParent.removeChild(node);
        }
        this.children.add(node);
        node.parent = this;
        this.isIterableChildrenDirty = true;
    }

    /* access modifiers changed from: protected */
    @CallSuper
    public void onRemoveChild(Node node) {
        Preconditions.checkNotNull(node, "Parameter \"child\" was null.");
        this.children.remove(node);
        node.parent = null;
        this.isIterableChildrenDirty = true;
    }

    public final void removeChild(Node node) {
        Preconditions.checkNotNull(node, "Parameter \"child\" was null.");
        AndroidPreconditions.checkUiThread();
        if (this.children.contains(node)) {
            onRemoveChild(node);
        }
    }
}
