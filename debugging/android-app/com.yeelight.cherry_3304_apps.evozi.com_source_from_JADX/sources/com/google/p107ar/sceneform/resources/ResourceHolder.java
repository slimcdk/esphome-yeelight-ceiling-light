package com.google.p107ar.sceneform.resources;

/* renamed from: com.google.ar.sceneform.resources.ResourceHolder */
public interface ResourceHolder {
    void destroyAllResources();

    long reclaimReleasedResources();
}
