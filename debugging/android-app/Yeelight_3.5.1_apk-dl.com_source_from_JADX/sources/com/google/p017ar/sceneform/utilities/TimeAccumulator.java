package com.google.p017ar.sceneform.utilities;

/* renamed from: com.google.ar.sceneform.utilities.TimeAccumulator */
public class TimeAccumulator {
    private long elapsedTimeMs;
    private long startSampleTimeMs;

    public void beginSample() {
        this.startSampleTimeMs = System.currentTimeMillis();
    }

    public void endSample() {
        this.elapsedTimeMs += System.currentTimeMillis() - this.startSampleTimeMs;
    }

    public long getElapsedTimeMs() {
        return this.elapsedTimeMs;
    }
}
