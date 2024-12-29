package com.google.p107ar.core;

import android.media.ImageReader;

/* renamed from: com.google.ar.core.m */
final /* synthetic */ class C2651m implements ImageReader.OnImageAvailableListener {

    /* renamed from: a */
    static final ImageReader.OnImageAvailableListener f5121a = new C2651m();

    private C2651m() {
    }

    public final void onImageAvailable(ImageReader imageReader) {
        SharedCamera.lambda$setDummyOnImageAvailableListener$0$SharedCamera(imageReader);
    }
}
