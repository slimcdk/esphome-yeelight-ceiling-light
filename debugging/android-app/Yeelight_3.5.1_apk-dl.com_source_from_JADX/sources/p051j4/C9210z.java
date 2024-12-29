package p051j4;

import android.graphics.Color;
import android.media.audiofx.Visualizer;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

/* renamed from: j4.z */
public class C9210z extends Thread {

    /* renamed from: a */
    private volatile boolean f17035a = false;

    /* renamed from: b */
    private Handler f17036b;

    /* renamed from: c */
    private double[] f17037c;

    /* renamed from: d */
    private double[] f17038d;

    /* renamed from: e */
    private int f17039e;

    /* renamed from: f */
    private long f17040f;

    /* renamed from: g */
    private int f17041g = 300;

    /* renamed from: h */
    byte[] f17042h;

    /* renamed from: i */
    byte f17043i;

    /* renamed from: j */
    int f17044j;

    /* renamed from: k */
    int f17045k;

    /* renamed from: j4.z$a */
    class C9211a implements Visualizer.OnDataCaptureListener {
        C9211a() {
        }

        public void onFftDataCapture(Visualizer visualizer, byte[] bArr, int i) {
            StringBuilder sb = new StringBuilder();
            sb.append("samplingRate: ");
            sb.append(i);
            sb.append(", size: ");
            sb.append(bArr.length);
            C9210z.this.mo37295c(bArr, i);
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
                    C9210z zVar = C9210z.this;
                    zVar.f17044j = ((i / 1000) * 2) / zVar.f17045k;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("frequency width: ");
                    sb2.append(C9210z.this.f17044j);
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("fft[0]: ");
                    sb3.append(bArr2[0]);
                    C9210z zVar2 = C9210z.this;
                    zVar2.f17043i = bArr2[0];
                    byte[] bArr3 = new byte[i3];
                    zVar2.f17042h = bArr3;
                    System.arraycopy(bArr2, 1, bArr3, 0, i3);
                    return;
                }
            }
        }

        public void onWaveFormDataCapture(Visualizer visualizer, byte[] bArr, int i) {
        }
    }

    public C9210z(Handler handler) {
        this.f17036b = handler;
        this.f17045k = Visualizer.getCaptureSizeRange()[1];
        this.f17037c = new double[3];
        double[] dArr = new double[3];
        this.f17038d = dArr;
        dArr[0] = -1.0d;
        dArr[1] = -1.0d;
        dArr[2] = -1.0d;
    }

    /* renamed from: b */
    private int m22223b(byte[] bArr, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("fWidth: ");
        sb.append(i);
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
        int i9 = (i6 * 255) / i3;
        int rgb = Color.rgb(i9, (i5 * 255) / i3, (i4 * 255) / i3);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("get color: ");
        sb2.append(rgb);
        return rgb;
    }

    /* renamed from: d */
    private void m22224d() {
        this.f17041g = 50;
    }

    /* renamed from: e */
    private void m22225e() {
        this.f17041g = 200;
    }

    /* renamed from: f */
    private void m22226f() {
        this.f17041g = 100;
    }

    /* renamed from: c */
    public void mo37295c(byte[] bArr, int i) {
        byte[] bArr2 = bArr;
        int i2 = i;
        int abs = Math.abs(bArr2[0]) + 0;
        double d = (double) (this.f17045k / 2);
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
        double[] dArr = this.f17037c;
        dArr[0] = dArr[0] + d8;
        double[] dArr2 = this.f17038d;
        if (d8 > dArr2[0] && dArr2[0] > 0.0d) {
            m22225e();
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
        double[] dArr3 = this.f17037c;
        dArr3[1] = dArr3[1] + d13;
        double[] dArr4 = this.f17038d;
        if (d13 > dArr4[1] && dArr4[1] > 0.0d) {
            m22226f();
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
        double[] dArr5 = this.f17037c;
        dArr5[2] = dArr5[2] + d18;
        double[] dArr6 = this.f17038d;
        if (d18 > dArr6[2] && dArr6[2] > 0.0d) {
            m22224d();
        }
        this.f17039e++;
        if (System.currentTimeMillis() - this.f17040f > 1000) {
            double[] dArr7 = this.f17038d;
            double[] dArr8 = this.f17037c;
            double d19 = dArr8[0];
            int i9 = this.f17039e;
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
            this.f17039e = 0;
            dArr8[0] = 0.0d;
            dArr8[1] = 0.0d;
            dArr8[2] = 0.0d;
            this.f17040f = System.currentTimeMillis();
        }
    }

    /* renamed from: g */
    public void mo37296g() {
        if (!this.f17035a) {
            this.f17035a = true;
            start();
        }
    }

    /* renamed from: h */
    public void mo37297h() {
        this.f17035a = false;
    }

    public void run() {
        Visualizer visualizer = new Visualizer(0);
        try {
            visualizer.setCaptureSize(this.f17045k);
            visualizer.setDataCaptureListener(new C9211a(), Visualizer.getMaxCaptureRate() / 2, false, true);
            visualizer.setEnabled(true);
            int i = 0;
            while (this.f17035a) {
                if (this.f17042h != null) {
                    Message obtainMessage = this.f17036b.obtainMessage(200);
                    Bundle bundle = new Bundle();
                    bundle.putInt("base_mag", this.f17043i);
                    bundle.putInt("beats", this.f17041g);
                    i++;
                    bundle.putInt("index", i);
                    bundle.putInt("color", m22223b(this.f17042h, this.f17044j));
                    obtainMessage.setData(bundle);
                    this.f17036b.sendMessage(obtainMessage);
                }
                Thread.sleep((long) this.f17041g);
            }
        } catch (Exception e) {
            e.printStackTrace();
            Handler handler = this.f17036b;
            this.f17036b.sendMessage(handler.obtainMessage(-1, e.getLocalizedMessage() + ""));
        } catch (Throwable th) {
            visualizer.setEnabled(false);
            visualizer.release();
            throw th;
        }
        visualizer.setEnabled(false);
        visualizer.release();
    }
}
