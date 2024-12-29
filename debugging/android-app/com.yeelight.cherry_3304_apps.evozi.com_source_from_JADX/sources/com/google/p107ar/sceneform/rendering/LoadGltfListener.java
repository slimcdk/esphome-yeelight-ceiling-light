package com.google.p107ar.sceneform.rendering;

/* renamed from: com.google.ar.sceneform.rendering.LoadGltfListener */
public interface LoadGltfListener {
    void onFinishedLoadingModel(long j);

    void onFinishedReadingFiles(long j);

    void onReadingFilesFailed(Exception exc);
}
