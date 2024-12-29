package p051j4;

import android.graphics.Color;
import android.media.AudioRecord;
import android.os.Handler;
import android.os.Message;
import java.math.BigDecimal;
import p013c.C0610a;

/* renamed from: j4.y */
public class C9209y extends Thread {

    /* renamed from: a */
    private final C0610a f17027a;

    /* renamed from: b */
    private volatile int f17028b = 0;

    /* renamed from: c */
    private int f17029c = -93;

    /* renamed from: d */
    private volatile boolean f17030d = false;

    /* renamed from: e */
    private Handler f17031e = null;

    /* renamed from: f */
    private double f17032f = 0.0d;

    /* renamed from: g */
    private volatile boolean f17033g = false;

    /* renamed from: h */
    AudioRecord f17034h = null;

    public C9209y(Handler handler) {
        this.f17031e = handler;
        this.f17029c = mo37290c();
        this.f17030d = false;
        this.f17032f = 0.0d;
        this.f17033g = false;
        this.f17028b = AudioRecord.getMinBufferSize(44100, 2, 2);
        this.f17034h = new AudioRecord(1, 44100, 2, 2, this.f17028b * 2);
        this.f17027a = new C0610a(this.f17028b);
    }

    /* renamed from: b */
    private int m22218b(double[] dArr) {
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
    public int mo37290c() {
        return -93;
    }

    /* renamed from: d */
    public double mo37291d(double d, int i) {
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
    public void mo37292e() {
        if (!this.f17030d) {
            this.f17030d = true;
            start();
        }
    }

    /* renamed from: f */
    public void mo37293f() {
        this.f17030d = false;
    }

    public void run() {
        try {
            this.f17034h.startRecording();
            int i = 0;
            while (this.f17030d) {
                int i2 = this.f17028b;
                short[] sArr = new short[i2];
                double[] dArr = new double[i2];
                this.f17034h.read(sArr, 0, i2);
                double d = 0.0d;
                for (int i3 = 0; i3 < i2 - 1; i3++) {
                    double d2 = (double) (sArr[i3] * sArr[i3]);
                    Double.isNaN(d2);
                    d += d2;
                }
                double d3 = (double) i2;
                Double.isNaN(d3);
                double log10 = Math.log10(Math.sqrt(d / d3) / 2.0E-6d) * 20.0d;
                double d4 = (double) this.f17029c;
                Double.isNaN(d4);
                double d5 = mo37291d(log10 + d4, 2);
                if (this.f17032f < d5) {
                    this.f17032f = d5;
                }
                for (int i4 = 0; i4 < i2; i4++) {
                    double d6 = (double) sArr[i4];
                    Double.isNaN(d6);
                    dArr[i4] = d6 / 32767.0d;
                }
                this.f17027a.mo11019j(dArr);
                if (!this.f17033g) {
                    Message obtainMessage = this.f17031e.obtainMessage(100, Double.valueOf(d5));
                    obtainMessage.arg1 = m22218b(dArr);
                    i++;
                    obtainMessage.arg2 = i;
                    this.f17031e.sendMessage(obtainMessage);
                } else {
                    this.f17031e.sendMessage(this.f17031e.obtainMessage(100, Double.valueOf(this.f17032f)));
                    Thread.sleep(2000);
                    this.f17031e.sendMessage(this.f17031e.obtainMessage(2, Double.valueOf(this.f17032f)));
                    this.f17033g = false;
                }
                Thread.sleep(180);
            }
            AudioRecord audioRecord = this.f17034h;
            if (audioRecord != null) {
                audioRecord.stop();
                this.f17034h.release();
                this.f17034h = null;
            }
        } catch (Exception e) {
            e.printStackTrace();
            Handler handler = this.f17031e;
            this.f17031e.sendMessage(handler.obtainMessage(-1, e.getLocalizedMessage() + ""));
        }
    }
}
