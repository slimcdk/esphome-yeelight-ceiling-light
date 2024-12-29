package com.squareup.leakcanary.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public final class DisplayLeakConnectorView extends View {
    private static final Paint clearPaint;
    private static final Paint iconPaint;
    private static final Paint leakPaint;
    private static final Paint rootPaint;
    private Bitmap cache;
    private Type type = Type.NODE;

    /* renamed from: com.squareup.leakcanary.internal.DisplayLeakConnectorView$1 */
    static /* synthetic */ class C42661 {

        /* renamed from: $SwitchMap$com$squareup$leakcanary$internal$DisplayLeakConnectorView$Type */
        static final /* synthetic */ int[] f6877xd1df864a;

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
                f6877xd1df864a = r0
                com.squareup.leakcanary.internal.DisplayLeakConnectorView$Type r1 = com.squareup.leakcanary.internal.DisplayLeakConnectorView.Type.NODE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f6877xd1df864a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.squareup.leakcanary.internal.DisplayLeakConnectorView$Type r1 = com.squareup.leakcanary.internal.DisplayLeakConnectorView.Type.START     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.squareup.leakcanary.internal.DisplayLeakConnectorView.C42661.<clinit>():void");
        }
    }

    public enum Type {
        START,
        NODE,
        END
    }

    static {
        Paint paint = new Paint(1);
        iconPaint = paint;
        Paint paint2 = new Paint(1);
        rootPaint = paint2;
        Paint paint3 = new Paint(1);
        leakPaint = paint3;
        Paint paint4 = new Paint(1);
        clearPaint = paint4;
        paint.setColor(-4539718);
        paint2.setColor(-8083771);
        paint3.setColor(-5155506);
        paint4.setColor(0);
        paint4.setXfermode(LeakCanaryUi.CLEAR_XFER_MODE);
    }

    public DisplayLeakConnectorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        Paint paint;
        int width = getWidth();
        int height = getHeight();
        Bitmap bitmap = this.cache;
        if (!(bitmap == null || (bitmap.getWidth() == width && this.cache.getHeight() == height))) {
            this.cache.recycle();
            this.cache = null;
        }
        if (this.cache == null) {
            this.cache = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(this.cache);
            float f = (float) width;
            float f2 = f / 2.0f;
            float f3 = (float) height;
            float f4 = f3 / 2.0f;
            float f5 = f / 3.0f;
            float dpToPixel = LeakCanaryUi.dpToPixel(4.0f, getResources());
            Paint paint2 = iconPaint;
            paint2.setStrokeWidth(dpToPixel);
            Paint paint3 = rootPaint;
            paint3.setStrokeWidth(dpToPixel);
            int i = C42661.f6877xd1df864a[this.type.ordinal()];
            if (i == 1) {
                canvas2.drawLine(f2, 0.0f, f2, f3, paint2);
                canvas2.drawCircle(f2, f4, f2, paint2);
                paint = clearPaint;
            } else if (i != 2) {
                canvas2.drawLine(f2, 0.0f, f2, f4, paint2);
                paint = leakPaint;
            } else {
                float f6 = f2 - (dpToPixel / 2.0f);
                Paint paint4 = paint3;
                canvas2.drawRect(0.0f, 0.0f, f, f6, paint3);
                Paint paint5 = clearPaint;
                float f7 = f6;
                canvas2.drawCircle(0.0f, f7, f7, paint5);
                canvas2.drawCircle(f, f7, f7, paint5);
                Canvas canvas3 = canvas2;
                float f8 = f2;
                float f9 = f2;
                paint = paint5;
                canvas3.drawLine(f8, 0.0f, f9, f4, paint4);
                canvas3.drawLine(f8, f4, f9, f3, paint2);
                canvas2.drawCircle(f2, f4, f2, paint2);
            }
            canvas2.drawCircle(f2, f4, f5, paint);
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
