package com.google.p107ar.sceneform.utilities;

/* renamed from: com.google.ar.sceneform.utilities.MovingAverage */
public class MovingAverage {
    public static final double DEFAULT_WEIGHT = 0.8999999761581421d;
    private double average;
    private final double weight;

    public MovingAverage(double d) {
        this(d, 0.8999999761581421d);
    }

    public MovingAverage(double d, double d2) {
        this.average = d;
        this.weight = d2;
    }

    public void addSample(double d) {
        double d2 = this.weight;
        this.average = (this.average * d2) + ((1.0d - d2) * d);
    }

    public double getAverage() {
        return this.average;
    }
}
