package com.google.p017ar.sceneform.resources;

/* renamed from: com.google.ar.sceneform.resources.SharedReference */
public abstract class SharedReference {
    private int referenceCount = 0;

    private void dispose() {
        if (this.referenceCount <= 0) {
            onDispose();
        }
    }

    /* access modifiers changed from: protected */
    public abstract void onDispose();

    public void release() {
        this.referenceCount--;
        dispose();
    }

    public void retain() {
        this.referenceCount++;
    }
}
