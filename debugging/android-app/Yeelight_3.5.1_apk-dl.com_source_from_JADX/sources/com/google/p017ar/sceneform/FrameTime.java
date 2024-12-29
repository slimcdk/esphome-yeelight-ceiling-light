package com.google.p017ar.sceneform;

import java.util.concurrent.TimeUnit;

/* renamed from: com.google.ar.sceneform.FrameTime */
public class FrameTime {
    private static final float NANOSECONDS_TO_SECONDS = 1.0E-9f;
    private long deltaNanoseconds = 0;
    private long lastNanoTime = 0;

    FrameTime() {
    }

    public float getDeltaSeconds() {
        return ((float) this.deltaNanoseconds) * NANOSECONDS_TO_SECONDS;
    }

    public long getDeltaTime(TimeUnit timeUnit) {
        return timeUnit.convert(this.deltaNanoseconds, TimeUnit.NANOSECONDS);
    }

    public float getStartSeconds() {
        return ((float) this.lastNanoTime) * NANOSECONDS_TO_SECONDS;
    }

    public long getStartTime(TimeUnit timeUnit) {
        return timeUnit.convert(this.lastNanoTime, TimeUnit.NANOSECONDS);
    }

    /* access modifiers changed from: package-private */
    public void update(long j) {
        this.deltaNanoseconds = j - this.lastNanoTime;
        this.lastNanoTime = j;
    }
}
