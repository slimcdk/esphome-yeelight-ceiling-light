package com.yeelight.yeelib.pickcolor;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.C2563g;
import com.google.zxing.DecodeHintType;
import com.yeelight.yeelib.R$id;
import java.util.Collection;
import java.util.Map;
import p124a4.C3969d;

public final class CaptureActivityHandler extends Handler {

    /* renamed from: a */
    private final CaptureActivity f14375a;

    /* renamed from: b */
    private final C8343d f14376b;

    /* renamed from: c */
    private State f14377c = State.SUCCESS;

    /* renamed from: d */
    private final C3969d f14378d;

    private enum State {
        PREVIEW,
        SUCCESS,
        DONE
    }

    static {
        Class<CaptureActivityHandler> cls = CaptureActivityHandler.class;
    }

    CaptureActivityHandler(CaptureActivity captureActivity, Collection<BarcodeFormat> collection, Map<DecodeHintType, ?> map, String str, C3969d dVar) {
        this.f14375a = captureActivity;
        C8343d dVar2 = new C8343d(captureActivity, collection, map, str, new C8344e(captureActivity.mo35495m0()));
        this.f14376b = dVar2;
        dVar2.start();
        this.f14378d = dVar;
        dVar.mo26518o();
        m19914b();
    }

    /* renamed from: b */
    private void m19914b() {
        if (this.f14377c == State.SUCCESS) {
            this.f14377c = State.PREVIEW;
            this.f14378d.mo26513j(this.f14376b.mo35528b(), R$id.decode);
            this.f14375a.mo35492i0();
        }
    }

    /* renamed from: a */
    public void mo35509a() {
        this.f14377c = State.DONE;
        this.f14378d.mo26519p();
        Message.obtain(this.f14376b.mo35528b(), R$id.quit).sendToTarget();
        try {
            this.f14376b.join(500);
        } catch (InterruptedException unused) {
        }
        removeMessages(R$id.decode_succeeded);
        removeMessages(R$id.decode_failed);
    }

    public void handleMessage(Message message) {
        int i = message.what;
        if (i == R$id.restart_preview) {
            m19914b();
            return;
        }
        if (i == R$id.decode_color) {
            if (this.f14377c == State.PREVIEW) {
                this.f14375a.mo35496n0((byte[]) message.obj, message.arg1, message.arg2);
            }
            this.f14378d.mo26513j(this.f14376b.mo35528b(), R$id.decode);
        }
        if (i == R$id.decode_succeeded) {
            this.f14377c = State.SUCCESS;
            Bundle data = message.getData();
            float f = 1.0f;
            Bitmap bitmap = null;
            if (data != null) {
                byte[] byteArray = data.getByteArray(DecodeThread.BARCODE_BITMAP);
                if (byteArray != null) {
                    bitmap = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, (BitmapFactory.Options) null).copy(Bitmap.Config.ARGB_8888, true);
                }
                f = data.getFloat(DecodeThread.BARCODE_SCALED_FACTOR);
            }
            this.f14375a.mo35497o0((C2563g) message.obj, bitmap, f);
        }
        if (i == R$id.decode_failed) {
            this.f14377c = State.PREVIEW;
        } else if (i == R$id.return_scan_result) {
            this.f14375a.setResult(-1, (Intent) message.obj);
            this.f14375a.finish();
        }
    }
}
