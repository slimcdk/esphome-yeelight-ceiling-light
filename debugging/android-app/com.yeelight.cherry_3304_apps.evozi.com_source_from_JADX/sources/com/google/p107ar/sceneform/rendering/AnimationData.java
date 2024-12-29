package com.google.p107ar.sceneform.rendering;

import androidx.annotation.Nullable;

/* renamed from: com.google.ar.sceneform.rendering.AnimationData */
public abstract class AnimationData {
    private static Factory factory = makeDefaultFactory();

    /* renamed from: com.google.ar.sceneform.rendering.AnimationData$Factory */
    public static abstract class Factory {
        @Nullable
        public abstract AnimationData create(byte[] bArr, String str);
    }

    /* renamed from: com.google.ar.sceneform.rendering.AnimationData$a */
    class C2693a extends Factory {

        /* renamed from: com.google.ar.sceneform.rendering.AnimationData$a$a */
        class C2694a extends AnimationData {
            C2694a(C2693a aVar) {
            }

            public long getDurationMs() {
                return 0;
            }

            public String getName() {
                return "";
            }
        }

        C2693a() {
        }

        @Nullable
        public AnimationData create(byte[] bArr, String str) {
            return new C2694a(this);
        }
    }

    @Nullable
    public static AnimationData createInstance(byte[] bArr, String str) {
        return factory.create(bArr, str);
    }

    public static Factory makeDefaultFactory() {
        return new C2693a();
    }

    public static void setFactory(Factory factory2) {
        factory = factory2;
    }

    public abstract long getDurationMs();

    public abstract String getName();
}
