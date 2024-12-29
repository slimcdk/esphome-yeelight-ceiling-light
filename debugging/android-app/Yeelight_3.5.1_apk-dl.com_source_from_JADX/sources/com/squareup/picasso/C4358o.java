package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.widget.ImageView;
import com.squareup.picasso.Picasso;

/* renamed from: com.squareup.picasso.o */
final class C4358o extends BitmapDrawable {

    /* renamed from: h */
    private static final Paint f7229h = new Paint();

    /* renamed from: a */
    private final boolean f7230a;

    /* renamed from: b */
    private final float f7231b;

    /* renamed from: c */
    private final Picasso.LoadedFrom f7232c;

    /* renamed from: d */
    Drawable f7233d;

    /* renamed from: e */
    long f7234e;

    /* renamed from: f */
    boolean f7235f;

    /* renamed from: g */
    int f7236g = 255;

    C4358o(Context context, Bitmap bitmap, Drawable drawable, Picasso.LoadedFrom loadedFrom, boolean z, boolean z2) {
        super(context.getResources(), bitmap);
        this.f7230a = z2;
        this.f7231b = context.getResources().getDisplayMetrics().density;
        this.f7232c = loadedFrom;
        if (loadedFrom != Picasso.LoadedFrom.MEMORY && !z) {
            this.f7233d = drawable;
            this.f7235f = true;
            this.f7234e = SystemClock.uptimeMillis();
        }
    }

    /* renamed from: a */
    private void m12363a(Canvas canvas) {
        Paint paint = f7229h;
        paint.setColor(-1);
        canvas.drawPath(m12364b(new Point(0, 0), (int) (this.f7231b * 16.0f)), paint);
        paint.setColor(this.f7232c.debugColor);
        canvas.drawPath(m12364b(new Point(0, 0), (int) (this.f7231b * 15.0f)), paint);
    }

    /* renamed from: b */
    private static Path m12364b(Point point, int i) {
        Point point2 = new Point(point.x + i, point.y);
        Point point3 = new Point(point.x, point.y + i);
        Path path = new Path();
        path.moveTo((float) point.x, (float) point.y);
        path.lineTo((float) point2.x, (float) point2.y);
        path.lineTo((float) point3.x, (float) point3.y);
        return path;
    }

    /* renamed from: c */
    static void m12365c(ImageView imageView, Context context, Bitmap bitmap, Picasso.LoadedFrom loadedFrom, boolean z, boolean z2) {
        Drawable drawable = imageView.getDrawable();
        if (drawable instanceof AnimationDrawable) {
            ((AnimationDrawable) drawable).stop();
        }
        imageView.setImageDrawable(new C4358o(context, bitmap, drawable, loadedFrom, z, z2));
    }

    /* renamed from: d */
    static void m12366d(ImageView imageView, Drawable drawable) {
        imageView.setImageDrawable(drawable);
        if (imageView.getDrawable() instanceof AnimationDrawable) {
            ((AnimationDrawable) imageView.getDrawable()).start();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void draw(android.graphics.Canvas r5) {
        /*
            r4 = this;
            boolean r0 = r4.f7235f
            if (r0 != 0) goto L_0x0008
        L_0x0004:
            super.draw(r5)
            goto L_0x0041
        L_0x0008:
            long r0 = android.os.SystemClock.uptimeMillis()
            long r2 = r4.f7234e
            long r0 = r0 - r2
            float r0 = (float) r0
            r1 = 1128792064(0x43480000, float:200.0)
            float r0 = r0 / r1
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 < 0) goto L_0x0020
            r0 = 0
            r4.f7235f = r0
            r0 = 0
            r4.f7233d = r0
            goto L_0x0004
        L_0x0020:
            android.graphics.drawable.Drawable r1 = r4.f7233d
            if (r1 == 0) goto L_0x0027
            r1.draw(r5)
        L_0x0027:
            int r1 = r4.f7236g
            float r1 = (float) r1
            float r1 = r1 * r0
            int r0 = (int) r1
            super.setAlpha(r0)
            super.draw(r5)
            int r0 = r4.f7236g
            super.setAlpha(r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 10
            if (r0 > r1) goto L_0x0041
            r4.invalidateSelf()
        L_0x0041:
            boolean r0 = r4.f7230a
            if (r0 == 0) goto L_0x0048
            r4.m12363a(r5)
        L_0x0048:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.C4358o.draw(android.graphics.Canvas):void");
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f7233d;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        super.onBoundsChange(rect);
    }

    public void setAlpha(int i) {
        this.f7236g = i;
        Drawable drawable = this.f7233d;
        if (drawable != null) {
            drawable.setAlpha(i);
        }
        super.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f7233d;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        super.setColorFilter(colorFilter);
    }
}
