package com.google.p107ar.sceneform.utilities;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;

/* renamed from: com.google.ar.sceneform.utilities.MovingAverageMillisecondsTracker */
public class MovingAverageMillisecondsTracker {
    private static final double NANOSECONDS_TO_MILLISECONDS = 1.0E-6d;
    private long beginSampleTimestampNano;
    private final Clock clock;
    @Nullable
    private MovingAverage movingAverage;
    private final double weight;

    /* renamed from: com.google.ar.sceneform.utilities.MovingAverageMillisecondsTracker$Clock */
    interface Clock {
        /* renamed from: a */
        long mo16340a();
    }

    /* renamed from: com.google.ar.sceneform.utilities.MovingAverageMillisecondsTracker$a */
    private static class C2783a implements Clock {
        private C2783a() {
        }

        /* synthetic */ C2783a(byte b) {
            this();
        }

        /* renamed from: a */
        public final long mo16340a() {
            return System.nanoTime();
        }
    }

    public MovingAverageMillisecondsTracker() {
        this(0.8999999761581421d);
    }

    public MovingAverageMillisecondsTracker(double d) {
        this.weight = d;
        this.clock = new C2783a((byte) 0);
    }

    @VisibleForTesting
    public MovingAverageMillisecondsTracker(Clock clock2) {
        this(clock2, 0.8999999761581421d);
    }

    @VisibleForTesting
    public MovingAverageMillisecondsTracker(Clock clock2, double d) {
        this.weight = d;
        this.clock = clock2;
    }

    public void beginSample() {
        this.beginSampleTimestampNano = this.clock.mo16340a();
    }

    public void endSample() {
        double a = (double) (this.clock.mo16340a() - this.beginSampleTimestampNano);
        Double.isNaN(a);
        double d = a * NANOSECONDS_TO_MILLISECONDS;
        MovingAverage movingAverage2 = this.movingAverage;
        if (movingAverage2 == null) {
            this.movingAverage = new MovingAverage(d, this.weight);
        } else {
            movingAverage2.addSample(d);
        }
    }

    public double getAverage() {
        MovingAverage movingAverage2 = this.movingAverage;
        if (movingAverage2 != null) {
            return movingAverage2.getAverage();
        }
        return 0.0d;
    }
}
