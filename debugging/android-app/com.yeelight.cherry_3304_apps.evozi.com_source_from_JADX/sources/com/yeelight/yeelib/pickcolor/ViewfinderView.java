package com.yeelight.yeelib.pickcolor;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import com.yeelight.yeelib.R$dimen;
import com.yeelight.yeelib.p194ui.view.C10497c;
import com.yeelight.yeelib.pickcolor.p193g.C9927d;

public class ViewfinderView extends RelativeLayout {

    /* renamed from: a */
    private C9927d f18042a;

    /* renamed from: b */
    private final Paint f18043b = new Paint(1);

    /* renamed from: c */
    private final int f18044c = Color.parseColor("#00000000");

    /* renamed from: d */
    private final int f18045d = Color.parseColor("#ff000000");
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final int f18046e;

    /* renamed from: f */
    private final int f18047f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final int f18048g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final int f18049h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C10497c f18050i;

    /* renamed from: j */
    private Bitmap f18051j;

    /* renamed from: k */
    private Matrix f18052k;

    /* renamed from: l */
    private Rect f18053l;

    /* renamed from: m */
    private Rect f18054m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public C9913c f18055n;

    /* renamed from: o */
    private boolean f18056o;

    /* renamed from: com.yeelight.yeelib.pickcolor.ViewfinderView$b */
    private class C9912b implements View.OnTouchListener {
        private C9912b() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent == null) {
                return false;
            }
            int action = motionEvent.getAction();
            if (action == 0 || action == 1 || action == 2) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                float width = x - ((float) (ViewfinderView.this.f18050i.getWidth() / 2));
                float height = y - ((float) ViewfinderView.this.f18050i.getHeight());
                if (width < ((float) ViewfinderView.this.f18048g)) {
                    width = (float) ViewfinderView.this.f18048g;
                }
                if (width > ((float) ((ViewfinderView.this.getPreviewWidth() - (ViewfinderView.this.f18050i.getWidth() / 2)) - ViewfinderView.this.f18049h))) {
                    width = (float) ((ViewfinderView.this.getPreviewWidth() - (ViewfinderView.this.f18050i.getWidth() / 2)) - ViewfinderView.this.f18049h);
                }
                if (height < ((float) ViewfinderView.this.f18046e)) {
                    height = (float) ViewfinderView.this.f18046e;
                }
                if (height > ((float) ViewfinderView.this.getPreviewHeight())) {
                    height = (float) ViewfinderView.this.getPreviewHeight();
                }
                ViewfinderView.this.f18050i.setX(width);
                ViewfinderView.this.f18050i.setY(height);
                int e = ViewfinderView.this.getColorFromBitmap();
                ViewfinderView.this.f18050i.setColor(e);
                String format = String.format("R:%03d  G:%03d  B:%03d", new Object[]{Integer.valueOf(Color.red(e)), Integer.valueOf(Color.green(e)), Integer.valueOf(Color.blue(e))});
                if (ViewfinderView.this.f18055n != null) {
                    ViewfinderView.this.f18055n.mo32029s(format);
                }
            }
            return true;
        }
    }

    /* renamed from: com.yeelight.yeelib.pickcolor.ViewfinderView$c */
    public interface C9913c {
        /* renamed from: s */
        void mo32029s(String str);
    }

    public ViewfinderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setWillNotDraw(false);
        Resources resources = context.getResources();
        this.f18046e = resources.getDimensionPixelSize(R$dimen.capture_bg_margin_top);
        this.f18047f = resources.getDimensionPixelSize(R$dimen.capture_bg_margin_bottom);
        this.f18048g = resources.getDimensionPixelSize(R$dimen.capture_bg_margin_left);
        this.f18049h = resources.getDimensionPixelSize(R$dimen.capture_bg_margin_right);
        C10497c cVar = new C10497c(context);
        this.f18050i = cVar;
        cVar.setCapture(true);
        this.f18052k = new Matrix();
        this.f18056o = true;
        this.f18050i.setCapture(true);
        addView(this.f18050i);
    }

    /* access modifiers changed from: private */
    public int getColorFromBitmap() {
        if (this.f18051j == null) {
            return 0;
        }
        int x = (int) ((((this.f18050i.getX() - ((float) this.f18048g)) + ((float) (this.f18050i.getWidth() / 2))) * ((float) this.f18051j.getWidth())) / ((float) getPreviewWidth()));
        int y = (int) ((((this.f18050i.getY() - ((float) this.f18046e)) + ((float) this.f18050i.getHeight())) * ((float) this.f18051j.getHeight())) / ((float) getPreviewHeight()));
        if (x < 1) {
            x = 1;
        }
        if (y < 1) {
            y = 1;
        }
        if (x > this.f18051j.getWidth() - 1) {
            x = this.f18051j.getWidth() - 1;
        }
        if (y > this.f18051j.getHeight() - 1) {
            y = this.f18051j.getHeight() - 1;
        }
        return this.f18051j.getPixel(x, y);
    }

    /* renamed from: i */
    private void m24329i() {
        int width = getWidth() - this.f18050i.getWidth();
        int i = this.f18048g;
        float f = (((float) ((width - i) - i)) / 2.0f) + ((float) i);
        int height = getHeight() - this.f18050i.getHeight();
        int i2 = this.f18046e;
        float f2 = (((float) ((height - i2) - this.f18047f)) / 2.0f) + ((float) i2);
        this.f18050i.setX(f);
        this.f18050i.setY(f2);
    }

    /* renamed from: g */
    public void mo32039g() {
        invalidate();
    }

    public int getPreviewHeight() {
        int height = (getHeight() - this.f18046e) - this.f18047f;
        if (height > 0) {
            return height;
        }
        return 0;
    }

    public int getPreviewWidth() {
        int width = (getWidth() - this.f18048g) - this.f18049h;
        if (width > 0) {
            return width;
        }
        return 0;
    }

    public int getSelectColor() {
        return this.f18050i.getColor();
    }

    /* renamed from: h */
    public boolean mo32043h() {
        return this.f18056o;
    }

    /* renamed from: j */
    public void mo32044j(C9913c cVar) {
        this.f18055n = cVar;
    }

    /* renamed from: k */
    public void mo32045k() {
        this.f18056o = true;
        this.f18051j = null;
        this.f18050i.setVisibility(8);
        this.f18050i.setCapture(true);
        this.f18050i.setVisibility(0);
        setOnTouchListener((View.OnTouchListener) null);
        m24329i();
        invalidate();
    }

    /* renamed from: l */
    public void mo32046l() {
        if (this.f18055n != null) {
            this.f18055n = null;
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f18042a != null) {
            int width = getWidth();
            int height = getHeight();
            if (this.f18056o) {
                Rect e = this.f18042a.mo32075e();
                Rect f = this.f18042a.mo32076f();
                if (e != null && f != null) {
                    this.f18043b.setColor(this.f18044c);
                    this.f18043b.setStyle(Paint.Style.FILL);
                    float f2 = (float) width;
                    canvas.drawRect(0.0f, 0.0f, f2, (float) e.top, this.f18043b);
                    canvas.drawRect(0.0f, (float) e.top, (float) e.left, (float) (e.bottom + 1), this.f18043b);
                    Canvas canvas2 = canvas;
                    float f3 = f2;
                    canvas2.drawRect((float) (e.right + 1), (float) e.top, f3, (float) (e.bottom + 1), this.f18043b);
                    canvas2.drawRect(0.0f, (float) (e.bottom + 1), f3, (float) height, this.f18043b);
                } else {
                    return;
                }
            }
            this.f18043b.setColor(this.f18045d);
            this.f18043b.setStyle(Paint.Style.FILL);
            float f4 = (float) width;
            canvas.drawRect(0.0f, 0.0f, f4, (float) this.f18046e, this.f18043b);
            canvas.drawRect(0.0f, (float) this.f18046e, (float) this.f18048g, (float) (height - this.f18047f), this.f18043b);
            Canvas canvas3 = canvas;
            float f5 = f4;
            canvas3.drawRect((float) (width - this.f18049h), (float) this.f18046e, f5, (float) (height - this.f18047f), this.f18043b);
            canvas3.drawRect(0.0f, (float) (height - this.f18047f), f5, (float) height, this.f18043b);
            if (!this.f18056o) {
                this.f18052k.reset();
                this.f18052k.setScale(((float) getPreviewWidth()) / ((float) this.f18051j.getWidth()), ((float) getPreviewHeight()) / ((float) this.f18051j.getHeight()));
                canvas.drawBitmap(this.f18051j, this.f18053l, this.f18054m, this.f18043b);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m24329i();
    }

    public void setBitmap(Bitmap bitmap) {
        this.f18051j = bitmap;
        this.f18056o = false;
        this.f18053l = new Rect(0, 0, this.f18051j.getWidth(), this.f18051j.getHeight());
        this.f18054m = new Rect(this.f18048g, this.f18046e, getPreviewWidth() + this.f18048g + 5, getPreviewHeight() + this.f18046e);
        this.f18050i.setVisibility(8);
        this.f18050i.setSelected(true);
        this.f18050i.setVisibility(0);
        this.f18050i.setColor(getColorFromBitmap());
        setOnTouchListener(new C9912b());
        m24329i();
        invalidate();
    }

    public void setCameraManager(C9927d dVar) {
        this.f18042a = dVar;
    }

    public void setSelectColor(int i) {
        if (this.f18056o) {
            this.f18050i.setColor(i);
        }
    }
}
