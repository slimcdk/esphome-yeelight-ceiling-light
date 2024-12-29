package com.google.p017ar.core;

import android.media.ImageReader;

/* renamed from: com.google.ar.core.m */
final /* synthetic */ class C2043m implements ImageReader.OnImageAvailableListener {

    /* renamed from: a */
    static final ImageReader.OnImageAvailableListener f3200a = new C2043m();

    private C2043m() {
    }

    public final void onImageAvailable(ImageReader imageReader) {
        SharedCamera.lambda$setDummyOnImageAvailableListener$0$SharedCamera(imageReader);
    }
}
