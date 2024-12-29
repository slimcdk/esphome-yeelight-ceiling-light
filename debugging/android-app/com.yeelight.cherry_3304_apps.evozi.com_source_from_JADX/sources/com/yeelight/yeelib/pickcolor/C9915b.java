package com.yeelight.yeelib.pickcolor;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.pickcolor.p193g.C9927d;
import java.util.Collection;
import java.util.Map;
import p011c.p012a.p053e.C0814a;
import p011c.p012a.p053e.C0818e;
import p011c.p012a.p053e.C0827n;

/* renamed from: com.yeelight.yeelib.pickcolor.b */
public final class C9915b extends Handler {

    /* renamed from: a */
    private final CaptureActivity f18059a;

    /* renamed from: b */
    private final C9919e f18060b;

    /* renamed from: c */
    private C9916a f18061c = C9916a.SUCCESS;

    /* renamed from: d */
    private final C9927d f18062d;

    /* renamed from: com.yeelight.yeelib.pickcolor.b$a */
    private enum C9916a {
        PREVIEW,
        SUCCESS,
        DONE
    }

    static {
        Class<C9915b> cls = C9915b.class;
    }

    C9915b(CaptureActivity captureActivity, Collection<C0814a> collection, Map<C0818e, ?> map, String str, C9927d dVar) {
        this.f18059a = captureActivity;
        C9919e eVar = new C9919e(captureActivity, collection, map, str, new C9920f(captureActivity.mo32025n0()));
        this.f18060b = eVar;
        eVar.start();
        this.f18062d = dVar;
        dVar.mo32085o();
        m24337b();
    }

    /* renamed from: b */
    private void m24337b() {
        if (this.f18061c == C9916a.SUCCESS) {
            this.f18061c = C9916a.PREVIEW;
            this.f18062d.mo32080j(this.f18060b.mo32058b(), R$id.decode);
            this.f18059a.mo32022j0();
        }
    }

    /* renamed from: a */
    public void mo32055a() {
        this.f18061c = C9916a.DONE;
        this.f18062d.mo32086p();
        Message.obtain(this.f18060b.mo32058b(), R$id.quit).sendToTarget();
        try {
            this.f18060b.join(500);
        } catch (InterruptedException unused) {
        }
        removeMessages(R$id.decode_succeeded);
        removeMessages(R$id.decode_failed);
    }

    public void handleMessage(Message message) {
        int i = message.what;
        if (i == R$id.restart_preview) {
            m24337b();
            return;
        }
        if (i == R$id.decode_color) {
            if (this.f18061c == C9916a.PREVIEW) {
                this.f18059a.mo32026o0((byte[]) message.obj, message.arg1, message.arg2);
            }
            this.f18062d.mo32080j(this.f18060b.mo32058b(), R$id.decode);
        }
        if (i == R$id.decode_succeeded) {
            this.f18061c = C9916a.SUCCESS;
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
            this.f18059a.mo32028p0((C0827n) message.obj, bitmap, f);
        }
        if (i == R$id.decode_failed) {
            this.f18061c = C9916a.PREVIEW;
        } else if (i == R$id.return_scan_result) {
            this.f18059a.setResult(-1, (Intent) message.obj);
            this.f18059a.finish();
        }
    }
}
