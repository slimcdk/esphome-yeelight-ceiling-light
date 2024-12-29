package com.google.p017ar.sceneform.rendering;

import android.animation.TimeInterpolator;
import androidx.annotation.Nullable;

/* renamed from: com.google.ar.sceneform.rendering.AnimatorImpl */
public class AnimatorImpl {
    private static Factory factory = makeDefaultFactory();

    /* renamed from: com.google.ar.sceneform.rendering.AnimatorImpl$Factory */
    public static abstract class Factory {
        @Nullable
        public abstract AnimatorImpl create(@Nullable AnimationData animationData, @Nullable ModelRenderable modelRenderable);

        public abstract AnimatorImpl create(AnimatorImpl animatorImpl);
    }

    /* renamed from: com.google.ar.sceneform.rendering.AnimatorImpl$a */
    class C2081a extends Factory {
        C2081a() {
        }

        @Nullable
        public AnimatorImpl create(@Nullable AnimationData animationData, @Nullable ModelRenderable modelRenderable) {
            return new AnimatorImpl();
        }

        public AnimatorImpl create(AnimatorImpl animatorImpl) {
            return new AnimatorImpl();
        }
    }

    protected AnimatorImpl() {
    }

    public static AnimatorImpl createInstance(AnimationData animationData, ModelRenderable modelRenderable) {
        return factory.create(animationData, modelRenderable);
    }

    public static AnimatorImpl createInstance(AnimatorImpl animatorImpl) {
        return factory.create(animatorImpl);
    }

    public static Factory makeDefaultFactory() {
        return new C2081a();
    }

    public static void setFactory(Factory factory2) {
        factory = factory2;
    }

    public void cancel() {
    }

    public void end() {
    }

    @Nullable
    public AnimationData getAnimationData() {
        return null;
    }

    public long getDurationMs() {
        return 0;
    }

    public String getName() {
        return "";
    }

    public int getRepeatCount() {
        return 0;
    }

    public long getStartDelayMs() {
        return 0;
    }

    @Nullable
    public ModelRenderable getTarget() {
        return null;
    }

    /* access modifiers changed from: protected */
    @Nullable
    public SkeletonRig getTargetSkeletonRig() {
        ModelRenderable target = getTarget();
        if (target != null) {
            return target.getSkeletonRig();
        }
        return null;
    }

    public long getTotalDurationMs() {
        return 0;
    }

    public boolean isRunning() {
        return false;
    }

    public boolean isStarted() {
        return false;
    }

    public void pause() {
    }

    public void resume() {
    }

    public void setDurationMs(long j) {
    }

    public void setInterpolator(TimeInterpolator timeInterpolator) {
    }

    public void setRepeatCount(int i) {
    }

    public void setStartDelayMs(long j) {
    }

    public void setTarget(@Nullable ModelRenderable modelRenderable) {
    }

    public void start() {
    }
}
