package com.yeelight.yeelib.pickcolor;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.yeelight.yeelib.R$id;
import java.io.ByteArrayOutputStream;
import java.util.Map;
import p011c.p012a.p053e.C0816c;
import p011c.p012a.p053e.C0818e;
import p011c.p012a.p053e.C0822i;
import p011c.p012a.p053e.C0824k;
import p011c.p012a.p053e.C0826m;
import p011c.p012a.p053e.C0827n;
import p011c.p012a.p053e.p057t.C0848j;

/* renamed from: com.yeelight.yeelib.pickcolor.d */
final class C9918d extends Handler {

    /* renamed from: d */
    private static final String f18074d = C9918d.class.getSimpleName();

    /* renamed from: a */
    private final CaptureActivity f18075a;

    /* renamed from: b */
    private final C0822i f18076b;

    /* renamed from: c */
    private boolean f18077c = true;

    C9918d(CaptureActivity captureActivity, Map<C0818e, Object> map) {
        C0822i iVar = new C0822i();
        this.f18076b = iVar;
        iVar.mo9005d(map);
        this.f18075a = captureActivity;
    }

    /* renamed from: a */
    private static void m24339a(C0824k kVar, Bundle bundle) {
        int[] i = kVar.mo9009i();
        int h = kVar.mo9008h();
        Bitmap createBitmap = Bitmap.createBitmap(i, 0, h, h, kVar.mo9007g(), Bitmap.Config.ARGB_8888);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        createBitmap.compress(Bitmap.CompressFormat.JPEG, 50, byteArrayOutputStream);
        bundle.putByteArray(DecodeThread.BARCODE_BITMAP, byteArrayOutputStream.toByteArray());
        bundle.putFloat(DecodeThread.BARCODE_SCALED_FACTOR, ((float) h) / ((float) kVar.mo8999d()));
    }

    /* renamed from: b */
    private void m24340b(byte[] bArr, int i, int i2) {
        Handler l0 = this.f18075a.mo32024l0();
        if (l0 != null) {
            Message.obtain(l0, R$id.decode_color, i, i2, bArr).sendToTarget();
        }
        long currentTimeMillis = System.currentTimeMillis();
        C0827n nVar = null;
        C0824k a = this.f18075a.mo32023k0().mo32072a(bArr, i, i2);
        if (a != null) {
            try {
                nVar = this.f18076b.mo9004c(new C0816c(new C0848j(a)));
            } catch (C0826m unused) {
            } catch (Throwable th) {
                this.f18076b.reset();
                throw th;
            }
            this.f18076b.reset();
        }
        if (nVar != null) {
            long currentTimeMillis2 = System.currentTimeMillis();
            "Found barcode in " + (currentTimeMillis2 - currentTimeMillis) + " ms";
            if (l0 != null) {
                Message obtain = Message.obtain(l0, R$id.decode_succeeded, nVar);
                Bundle bundle = new Bundle();
                m24339a(a, bundle);
                obtain.setData(bundle);
                obtain.sendToTarget();
            }
        } else if (l0 != null) {
            Message.obtain(l0, R$id.decode_failed).sendToTarget();
        }
    }

    public void handleMessage(Message message) {
        if (this.f18077c) {
            int i = message.what;
            if (i == R$id.decode) {
                m24340b((byte[]) message.obj, message.arg1, message.arg2);
            } else if (i == R$id.quit) {
                this.f18077c = false;
                Looper.myLooper().quit();
            }
        }
    }
}
