package com.squareup.leakcanary.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public final class DisplayLeakConnectorView extends View {
    private static final Paint clearPaint = new Paint(1);
    private static final Paint iconPaint = new Paint(1);
    private static final Paint leakPaint = new Paint(1);
    private static final Paint rootPaint = new Paint(1);
    private Bitmap cache;
    private Type type = Type.NODE;

    /* renamed from: com.squareup.leakcanary.internal.DisplayLeakConnectorView$1 */
    static /* synthetic */ class C39591 {

        /* renamed from: $SwitchMap$com$squareup$leakcanary$internal$DisplayLeakConnectorView$Type */
        static final /* synthetic */ int[] f6722xd1df864a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.squareup.leakcanary.internal.DisplayLeakConnectorView$Type[] r0 = com.squareup.leakcanary.internal.DisplayLeakConnectorView.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f6722xd1df864a = r0
                com.squareup.leakcanary.internal.DisplayLeakConnectorView$Type r1 = com.squareup.leakcanary.internal.DisplayLeakConnectorView.Type.NODE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f6722xd1df864a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.squareup.leakcanary.internal.DisplayLeakConnectorView$Type r1 = com.squareup.leakcanary.internal.DisplayLeakConnectorView.Type.START     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.squareup.leakcanary.internal.DisplayLeakConnectorView.C39591.<clinit>():void");
        }
    }

    public enum Type {
        START,
        NODE,
        END
    }

    static {
        iconPaint.setColor(-4539718);
        rootPaint.setColor(-8083771);
        leakPaint.setColor(-5155506);
        clearPaint.setColor(0);
        clearPaint.setXfermode(LeakCanaryUi.CLEAR_XFER_MODE);
    }

    public DisplayLeakConnectorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        Paint paint;
        Paint paint2;
        float f;
        float f2;
        float f3;
        Canvas canvas2;
        int width = getWidth();
        int height = getHeight();
        Bitmap bitmap = this.cache;
        if (!(bitmap == null || (bitmap.getWidth() == width && this.cache.getHeight() == height))) {
            this.cache.recycle();
            this.cache = null;
        }
        if (this.cache == null) {
            this.cache = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            Canvas canvas3 = new Canvas(this.cache);
            float f4 = (float) width;
            float f5 = f4 / 2.0f;
            float f6 = (float) height;
            float f7 = f6 / 2.0f;
            float f8 = f4 / 3.0f;
            float dpToPixel = LeakCanaryUi.dpToPixel(4.0f, getResources());
            iconPaint.setStrokeWidth(dpToPixel);
            rootPaint.setStrokeWidth(dpToPixel);
            int i = C39591.f6722xd1df864a[this.type.ordinal()];
            if (i == 1) {
                f2 = 0.0f;
                paint2 = iconPaint;
                canvas2 = canvas3;
                f3 = f5;
                f = f5;
            } else if (i != 2) {
                canvas3.drawLine(f5, 0.0f, f5, f7, iconPaint);
                paint = leakPaint;
                canvas3.drawCircle(f5, f7, f8, paint);
            } else {
                float f9 = f5 - (dpToPixel / 2.0f);
                canvas3.drawRect(0.0f, 0.0f, f4, f9, rootPaint);
                canvas3.drawCircle(0.0f, f9, f9, clearPaint);
                canvas3.drawCircle(f4, f9, f9, clearPaint);
                canvas2 = canvas3;
                f3 = f5;
                f = f5;
                canvas2.drawLine(f3, 0.0f, f, f7, rootPaint);
                paint2 = iconPaint;
                f2 = f7;
            }
            canvas2.drawLine(f3, f2, f, f6, paint2);
            canvas3.drawCircle(f5, f7, f5, iconPaint);
            paint = clearPaint;
            canvas3.drawCircle(f5, f7, f8, paint);
        }
        canvas.drawBitmap(this.cache, 0.0f, 0.0f, (Paint) null);
    }

    public void setType(Type type2) {
        if (type2 != this.type) {
            this.type = type2;
            Bitmap bitmap = this.cache;
            if (bitmap != null) {
                bitmap.recycle();
                this.cache = null;
            }
            invalidate();
        }
    }
}
