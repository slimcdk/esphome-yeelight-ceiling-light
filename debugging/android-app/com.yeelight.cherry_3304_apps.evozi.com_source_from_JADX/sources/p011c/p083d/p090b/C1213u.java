package p011c.p083d.p090b;

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
import p011c.p083d.p090b.C1203t;

/* renamed from: c.d.b.u */
final class C1213u extends BitmapDrawable {

    /* renamed from: h */
    private static final Paint f2094h = new Paint();

    /* renamed from: a */
    private final boolean f2095a;

    /* renamed from: b */
    private final float f2096b;

    /* renamed from: c */
    private final C1203t.C1209e f2097c;

    /* renamed from: d */
    Drawable f2098d;

    /* renamed from: e */
    long f2099e;

    /* renamed from: f */
    boolean f2100f;

    /* renamed from: g */
    int f2101g = 255;

    C1213u(Context context, Bitmap bitmap, Drawable drawable, C1203t.C1209e eVar, boolean z, boolean z2) {
        super(context.getResources(), bitmap);
        this.f2095a = z2;
        this.f2096b = context.getResources().getDisplayMetrics().density;
        this.f2097c = eVar;
        if (eVar != C1203t.C1209e.MEMORY && !z) {
            this.f2098d = drawable;
            this.f2100f = true;
            this.f2099e = SystemClock.uptimeMillis();
        }
    }

    /* renamed from: a */
    private void m3122a(Canvas canvas) {
        f2094h.setColor(-1);
        canvas.drawPath(m3123b(new Point(0, 0), (int) (this.f2096b * 16.0f)), f2094h);
        f2094h.setColor(this.f2097c.f2088a);
        canvas.drawPath(m3123b(new Point(0, 0), (int) (this.f2096b * 15.0f)), f2094h);
    }

    /* renamed from: b */
    private static Path m3123b(Point point, int i) {
        Point point2 = new Point(point.x + i, point.y);
        Point point3 = new Point(point.x, point.y + i);
        Path path = new Path();
        path.moveTo((float) point.x, (float) point.y);
        path.lineTo((float) point2.x, (float) point2.y);
        path.lineTo((float) point3.x, (float) point3.y);
        return path;
    }

    /* renamed from: c */
    static void m3124c(ImageView imageView, Context context, Bitmap bitmap, C1203t.C1209e eVar, boolean z, boolean z2) {
        Drawable drawable = imageView.getDrawable();
        if (drawable instanceof AnimationDrawable) {
            ((AnimationDrawable) drawable).stop();
        }
        imageView.setImageDrawable(new C1213u(context, bitmap, drawable, eVar, z, z2));
    }

    /* renamed from: d */
    static void m3125d(ImageView imageView, Drawable drawable) {
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
            boolean r0 = r4.f2100f
            if (r0 != 0) goto L_0x0008
        L_0x0004:
            super.draw(r5)
            goto L_0x0041
        L_0x0008:
            long r0 = android.os.SystemClock.uptimeMillis()
            long r2 = r4.f2099e
            long r0 = r0 - r2
            float r0 = (float) r0
            r1 = 1128792064(0x43480000, float:200.0)
            float r0 = r0 / r1
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 < 0) goto L_0x0020
            r0 = 0
            r4.f2100f = r0
            r0 = 0
            r4.f2098d = r0
            goto L_0x0004
        L_0x0020:
            android.graphics.drawable.Drawable r1 = r4.f2098d
            if (r1 == 0) goto L_0x0027
            r1.draw(r5)
        L_0x0027:
            int r1 = r4.f2101g
            float r1 = (float) r1
            float r1 = r1 * r0
            int r0 = (int) r1
            super.setAlpha(r0)
            super.draw(r5)
            int r0 = r4.f2101g
            super.setAlpha(r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 10
            if (r0 > r1) goto L_0x0041
            r4.invalidateSelf()
        L_0x0041:
            boolean r0 = r4.f2095a
            if (r0 == 0) goto L_0x0048
            r4.m3122a(r5)
        L_0x0048:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p011c.p083d.p090b.C1213u.draw(android.graphics.Canvas):void");
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f2098d;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        super.onBoundsChange(rect);
    }

    public void setAlpha(int i) {
        this.f2101g = i;
        Drawable drawable = this.f2098d;
        if (drawable != null) {
            drawable.setAlpha(i);
        }
        super.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f2098d;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        super.setColorFilter(colorFilter);
    }
}
