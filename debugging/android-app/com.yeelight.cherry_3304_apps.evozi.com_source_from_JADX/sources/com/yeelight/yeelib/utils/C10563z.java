package com.yeelight.yeelib.utils;

import android.graphics.Color;
import android.media.AudioRecord;
import android.os.Handler;
import android.os.Message;
import java.math.BigDecimal;
import p007b.p008a.p009a.p010a.C0439a;

/* renamed from: com.yeelight.yeelib.utils.z */
public class C10563z extends Thread {

    /* renamed from: a */
    private final C0439a f20184a;

    /* renamed from: b */
    private volatile int f20185b = 0;

    /* renamed from: c */
    private int f20186c = -93;

    /* renamed from: d */
    private volatile boolean f20187d = false;

    /* renamed from: e */
    private Handler f20188e = null;

    /* renamed from: f */
    private double f20189f = 0.0d;

    /* renamed from: g */
    private volatile boolean f20190g = false;

    /* renamed from: h */
    AudioRecord f20191h = null;

    public C10563z(Handler handler) {
        this.f20188e = handler;
        this.f20186c = mo33391c();
        this.f20187d = false;
        this.f20189f = 0.0d;
        this.f20190g = false;
        this.f20185b = AudioRecord.getMinBufferSize(44100, 2, 2);
        this.f20191h = new AudioRecord(1, 44100, 2, 2, this.f20185b * 2);
        this.f20184a = new C0439a(this.f20185b);
    }

    /* renamed from: b */
    private int m25833b(double[] dArr) {
        int length = dArr.length / 7;
        int i = 0;
        int i2 = 0;
        while (i < 7) {
            int i3 = i + 1;
            int i4 = length * i3;
            double d = 0.0d;
            for (int i5 = i * length; i5 < i4; i5++) {
                d += dArr[i5];
            }
            double d2 = (double) length;
            Double.isNaN(d2);
            int i6 = (int) (300.0d - (((d * 1.0d) / d2) * 5000.0d));
            if (i6 > 300) {
                i6 = 300;
            } else if (i6 < 0) {
                i6 = 0;
            }
            i2 += 300 - i6;
            i = i3;
        }
        if (i2 > 1200) {
            return -1;
        }
        float[] fArr = {0.0f, 1.0f, 1.0f};
        fArr[0] = (float) (i2 / 6);
        return Color.HSVToColor(fArr);
    }

    /* renamed from: c */
    public int mo33391c() {
        return -93;
    }

    /* renamed from: d */
    public double mo33392d(double d, int i) {
        try {
            return new BigDecimal(Double.toString(d)).setScale(i, 4).doubleValue();
        } catch (Exception e) {
            e.printStackTrace();
            double d2 = (double) ((int) d);
            Double.isNaN(d2);
            return d2 + 0.0d;
        }
    }

    /* renamed from: e */
    public void mo33393e() {
        if (!this.f20187d) {
            this.f20187d = true;
            start();
        }
    }

    /* renamed from: f */
    public void mo33394f() {
        this.f20187d = false;
    }

    public void run() {
        try {
            this.f20191h.startRecording();
            int i = 0;
            while (this.f20187d) {
                int i2 = this.f20185b;
                short[] sArr = new short[i2];
                double[] dArr = new double[i2];
                this.f20191h.read(sArr, 0, i2);
                double d = 0.0d;
                for (int i3 = 0; i3 < i2 - 1; i3++) {
                    double d2 = (double) (sArr[i3] * sArr[i3]);
                    Double.isNaN(d2);
                    d += d2;
                }
                double d3 = (double) i2;
                Double.isNaN(d3);
                double log10 = Math.log10(Math.sqrt(d / d3) / 2.0E-6d) * 20.0d;
                double d4 = (double) this.f20186c;
                Double.isNaN(d4);
                double d5 = mo33392d(log10 + d4, 2);
                if (this.f20189f < d5) {
                    this.f20189f = d5;
                }
                for (int i4 = 0; i4 < i2; i4++) {
                    double d6 = (double) sArr[i4];
                    Double.isNaN(d6);
                    dArr[i4] = d6 / 32767.0d;
                }
                this.f20184a.mo8321j(dArr);
                if (!this.f20190g) {
                    Message obtainMessage = this.f20188e.obtainMessage(100, Double.valueOf(d5));
                    obtainMessage.arg1 = m25833b(dArr);
                    i++;
                    obtainMessage.arg2 = i;
                    this.f20188e.sendMessage(obtainMessage);
                } else {
                    this.f20188e.sendMessage(this.f20188e.obtainMessage(100, Double.valueOf(this.f20189f)));
                    Thread.sleep(2000);
                    this.f20188e.sendMessage(this.f20188e.obtainMessage(2, Double.valueOf(this.f20189f)));
                    this.f20190g = false;
                }
                Thread.sleep(180);
            }
            if (this.f20191h != null) {
                this.f20191h.stop();
                this.f20191h.release();
                this.f20191h = null;
            }
        } catch (Exception e) {
            e.printStackTrace();
            Handler handler = this.f20188e;
            this.f20188e.sendMessage(handler.obtainMessage(-1, e.getLocalizedMessage() + ""));
        }
    }
}
