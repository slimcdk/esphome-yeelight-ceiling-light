package com.yeelight.yeelib.pickcolor;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.zxing.C2546b;
import com.google.zxing.C2550d;
import com.google.zxing.C2561e;
import com.google.zxing.C2563g;
import com.google.zxing.DecodeHintType;
import com.google.zxing.ReaderException;
import com.yeelight.yeelib.R$id;
import java.io.ByteArrayOutputStream;
import java.util.Map;
import p026d2.C3134g;

/* renamed from: com.yeelight.yeelib.pickcolor.c */
final class C8342c extends Handler {

    /* renamed from: d */
    private static final String f14403d = C8342c.class.getSimpleName();

    /* renamed from: a */
    private final CaptureActivity f14404a;

    /* renamed from: b */
    private final C2550d f14405b;

    /* renamed from: c */
    private boolean f14406c = true;

    C8342c(CaptureActivity captureActivity, Map<DecodeHintType, Object> map) {
        C2550d dVar = new C2550d();
        this.f14405b = dVar;
        dVar.mo19509d(map);
        this.f14404a = captureActivity;
    }

    /* renamed from: a */
    private static void m19930a(C2561e eVar, Bundle bundle) {
        int[] i = eVar.mo19536i();
        int h = eVar.mo19535h();
        Bitmap createBitmap = Bitmap.createBitmap(i, 0, h, h, eVar.mo19534g(), Bitmap.Config.ARGB_8888);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        createBitmap.compress(Bitmap.CompressFormat.JPEG, 50, byteArrayOutputStream);
        bundle.putByteArray(DecodeThread.BARCODE_BITMAP, byteArrayOutputStream.toByteArray());
        bundle.putFloat(DecodeThread.BARCODE_SCALED_FACTOR, ((float) h) / ((float) eVar.mo19464d()));
    }

    /* renamed from: b */
    private void m19931b(byte[] bArr, int i, int i2) {
        Handler k0 = this.f14404a.mo35494k0();
        if (k0 != null) {
            Message.obtain(k0, R$id.decode_color, i, i2, bArr).sendToTarget();
        }
        long currentTimeMillis = System.currentTimeMillis();
        C2563g gVar = null;
        C2561e a = this.f14404a.mo35493j0().mo26505a(bArr, i, i2);
        if (a != null) {
            try {
                gVar = this.f14405b.mo19508c(new C2546b(new C3134g(a)));
            } catch (ReaderException unused) {
            } catch (Throwable th) {
                this.f14405b.reset();
                throw th;
            }
            this.f14405b.reset();
        }
        if (gVar != null) {
            long currentTimeMillis2 = System.currentTimeMillis();
            StringBuilder sb = new StringBuilder();
            sb.append("Found barcode in ");
            sb.append(currentTimeMillis2 - currentTimeMillis);
            sb.append(" ms");
            if (k0 != null) {
                Message obtain = Message.obtain(k0, R$id.decode_succeeded, gVar);
                Bundle bundle = new Bundle();
                m19930a(a, bundle);
                obtain.setData(bundle);
                obtain.sendToTarget();
            }
        } else if (k0 != null) {
            Message.obtain(k0, R$id.decode_failed).sendToTarget();
        }
    }

    public void handleMessage(Message message) {
        if (this.f14406c) {
            int i = message.what;
            if (i == R$id.decode) {
                m19931b((byte[]) message.obj, message.arg1, message.arg2);
            } else if (i == R$id.quit) {
                this.f14406c = false;
                Looper.myLooper().quit();
            }
        }
    }
}
