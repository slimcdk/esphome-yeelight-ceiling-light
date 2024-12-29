package com.yeelight.yeelib.utils;

import android.graphics.Color;
import android.media.audiofx.Visualizer;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

/* renamed from: com.yeelight.yeelib.utils.a0 */
public class C10534a0 extends Thread {

    /* renamed from: a */
    private volatile boolean f20145a = false;

    /* renamed from: b */
    private Handler f20146b;

    /* renamed from: c */
    private double[] f20147c;

    /* renamed from: d */
    private double[] f20148d;

    /* renamed from: e */
    private int f20149e;

    /* renamed from: f */
    private long f20150f;

    /* renamed from: g */
    private int f20151g = 300;

    /* renamed from: h */
    byte[] f20152h;

    /* renamed from: i */
    byte f20153i;

    /* renamed from: j */
    int f20154j;

    /* renamed from: k */
    int f20155k;

    /* renamed from: com.yeelight.yeelib.utils.a0$a */
    class C10535a implements Visualizer.OnDataCaptureListener {
        C10535a() {
        }

        public void onFftDataCapture(Visualizer visualizer, byte[] bArr, int i) {
            "samplingRate: " + i + ", size: " + bArr.length;
            C10534a0.this.mo33363c(bArr, i);
            int length = (bArr.length / 2) + 1;
            byte[] bArr2 = new byte[length];
            bArr2[0] = (byte) Math.abs(bArr[0]);
            int i2 = 1;
            while (true) {
                int i3 = length - 1;
                if (i2 < i3) {
                    int i4 = i2 * 2;
                    bArr2[i2] = (byte) ((int) Math.hypot((double) bArr[i4], (double) bArr[i4 + 1]));
                    i2++;
                } else {
                    bArr2[i3] = (byte) Math.abs(bArr[1]);
                    C10534a0 a0Var = C10534a0.this;
                    a0Var.f20154j = ((i / 1000) * 2) / a0Var.f20155k;
                    "frequency width: " + C10534a0.this.f20154j;
                    "fft[0]: " + bArr2[0];
                    C10534a0 a0Var2 = C10534a0.this;
                    a0Var2.f20153i = bArr2[0];
                    byte[] bArr3 = new byte[i3];
                    a0Var2.f20152h = bArr3;
                    System.arraycopy(bArr2, 1, bArr3, 0, i3);
                    return;
                }
            }
        }

        public void onWaveFormDataCapture(Visualizer visualizer, byte[] bArr, int i) {
        }
    }

    public C10534a0(Handler handler) {
        this.f20146b = handler;
        this.f20155k = Visualizer.getCaptureSizeRange()[1];
        this.f20147c = new double[3];
        double[] dArr = new double[3];
        this.f20148d = dArr;
        dArr[0] = -1.0d;
        dArr[1] = -1.0d;
        dArr[2] = -1.0d;
    }

    /* renamed from: b */
    private int m25657b(byte[] bArr, int i) {
        "fWidth: " + i;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i2 < bArr.length) {
            i3 += bArr[i2];
            int i7 = i2 + 1;
            int i8 = i7 * i;
            if (i8 < 200) {
                i6 += bArr[i2];
            } else if (i8 < 1000) {
                i5 += bArr[i2];
            } else if (i8 < 4000) {
                i4 += bArr[i2];
            }
            i2 = i7;
        }
        if (i3 == 0) {
            return -1;
        }
        int rgb = Color.rgb((i6 * 255) / i3, (i5 * 255) / i3, (i4 * 255) / i3);
        "get color: " + rgb;
        return rgb;
    }

    /* renamed from: d */
    private void m25658d() {
        this.f20151g = 50;
    }

    /* renamed from: e */
    private void m25659e() {
        this.f20151g = 200;
    }

    /* renamed from: f */
    private void m25660f() {
        this.f20151g = 100;
    }

    /* renamed from: c */
    public void mo33363c(byte[] bArr, int i) {
        byte[] bArr2 = bArr;
        int i2 = i;
        int abs = Math.abs(bArr2[0]) + 0;
        double d = (double) (this.f20155k / 2);
        int i3 = i2 / 2000;
        double d2 = (double) (1 * i2);
        Double.isNaN(d2);
        Double.isNaN(d);
        double d3 = d2 / d;
        int i4 = 2;
        while (d3 < 300.0d) {
            double d4 = (double) abs;
            int i5 = i4 + 1;
            double sqrt = Math.sqrt((double) (bArr2[i4] * bArr2[i4] * bArr2[i5] * bArr2[i5]));
            Double.isNaN(d4);
            abs = (int) (d4 + sqrt);
            i4 += 2;
            double d5 = (double) ((i4 / 2) * i2);
            Double.isNaN(d5);
            Double.isNaN(d);
            d3 = d5 / d;
        }
        double d6 = (double) abs;
        double d7 = (double) i4;
        Double.isNaN(d7);
        Double.isNaN(d6);
        double d8 = d6 / ((d7 * 1.0d) / 2.0d);
        double[] dArr = this.f20147c;
        dArr[0] = dArr[0] + d8;
        double[] dArr2 = this.f20148d;
        if (d8 > dArr2[0] && dArr2[0] > 0.0d) {
            m25659e();
        }
        int i6 = 0;
        while (d3 < 2500.0d) {
            double d9 = (double) i6;
            int i7 = i4 + 1;
            double sqrt2 = Math.sqrt((double) (bArr2[i4] * bArr2[i4] * bArr2[i7] * bArr2[i7]));
            Double.isNaN(d9);
            i6 = (int) (d9 + sqrt2);
            i4 += 2;
            double d10 = (double) ((i4 / 2) * i2);
            Double.isNaN(d10);
            Double.isNaN(d);
            d3 = d10 / d;
        }
        double d11 = (double) i6;
        double d12 = (double) i4;
        Double.isNaN(d12);
        Double.isNaN(d11);
        double d13 = d11 / ((d12 * 1.0d) / 2.0d);
        double[] dArr3 = this.f20147c;
        dArr3[1] = dArr3[1] + d13;
        double[] dArr4 = this.f20148d;
        if (d13 > dArr4[1] && dArr4[1] > 0.0d) {
            m25660f();
        }
        int abs2 = Math.abs(bArr2[1]);
        while (d3 < 5000.0d && i4 < bArr2.length) {
            double d14 = (double) abs2;
            int i8 = i4 + 1;
            double sqrt3 = Math.sqrt((double) (bArr2[i4] * bArr2[i4] * bArr2[i8] * bArr2[i8]));
            Double.isNaN(d14);
            abs2 = (int) (d14 + sqrt3);
            i4 += 2;
            double d15 = (double) ((i4 / 2) * i2);
            Double.isNaN(d15);
            Double.isNaN(d);
            d3 = d15 / d;
        }
        double d16 = (double) abs2;
        double d17 = (double) i4;
        Double.isNaN(d17);
        Double.isNaN(d16);
        double d18 = d16 / ((d17 * 1.0d) / 2.0d);
        double[] dArr5 = this.f20147c;
        dArr5[2] = dArr5[2] + d18;
        double[] dArr6 = this.f20148d;
        if (d18 > dArr6[2] && dArr6[2] > 0.0d) {
            m25658d();
        }
        this.f20149e++;
        if (System.currentTimeMillis() - this.f20150f > 1000) {
            double[] dArr7 = this.f20148d;
            double[] dArr8 = this.f20147c;
            double d19 = dArr8[0];
            int i9 = this.f20149e;
            double d20 = (double) i9;
            Double.isNaN(d20);
            dArr7[0] = d19 / d20;
            double d21 = dArr8[1];
            double d22 = (double) i9;
            Double.isNaN(d22);
            dArr7[1] = d21 / d22;
            double d23 = dArr8[2];
            double d24 = (double) i9;
            Double.isNaN(d24);
            dArr7[2] = d23 / d24;
            this.f20149e = 0;
            dArr8[0] = 0.0d;
            dArr8[1] = 0.0d;
            dArr8[2] = 0.0d;
            this.f20150f = System.currentTimeMillis();
        }
    }

    /* renamed from: g */
    public void mo33364g() {
        if (!this.f20145a) {
            this.f20145a = true;
            start();
        }
    }

    /* renamed from: h */
    public void mo33365h() {
        this.f20145a = false;
    }

    public void run() {
        Visualizer visualizer = new Visualizer(0);
        try {
            visualizer.setCaptureSize(this.f20155k);
            visualizer.setDataCaptureListener(new C10535a(), Visualizer.getMaxCaptureRate() / 2, false, true);
            visualizer.setEnabled(true);
            int i = 0;
            while (this.f20145a) {
                if (this.f20152h != null) {
                    Message obtainMessage = this.f20146b.obtainMessage(200);
                    Bundle bundle = new Bundle();
                    bundle.putInt("base_mag", this.f20153i);
                    bundle.putInt("beats", this.f20151g);
                    i++;
                    bundle.putInt("index", i);
                    bundle.putInt("color", m25657b(this.f20152h, this.f20154j));
                    obtainMessage.setData(bundle);
                    this.f20146b.sendMessage(obtainMessage);
                }
                Thread.sleep((long) this.f20151g);
            }
        } catch (Exception e) {
            e.printStackTrace();
            Handler handler = this.f20146b;
            this.f20146b.sendMessage(handler.obtainMessage(-1, e.getLocalizedMessage() + ""));
        } catch (Throwable th) {
            visualizer.setEnabled(false);
            visualizer.release();
            throw th;
        }
        visualizer.setEnabled(false);
        visualizer.release();
    }
}
