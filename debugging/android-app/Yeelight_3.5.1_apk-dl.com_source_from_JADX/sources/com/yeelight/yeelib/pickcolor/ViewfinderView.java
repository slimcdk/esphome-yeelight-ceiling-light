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
import com.yeelight.yeelib.p142ui.view.C8873b;
import p124a4.C3969d;

public class ViewfinderView extends RelativeLayout {

    /* renamed from: a */
    private C3969d f14379a;

    /* renamed from: b */
    private final Paint f14380b = new Paint(1);

    /* renamed from: c */
    private final int f14381c = Color.parseColor("#00000000");

    /* renamed from: d */
    private final int f14382d = Color.parseColor("#ff000000");
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final int f14383e;

    /* renamed from: f */
    private final int f14384f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final int f14385g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final int f14386h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C8873b f14387i;

    /* renamed from: j */
    private Bitmap f14388j;

    /* renamed from: k */
    private Matrix f14389k;

    /* renamed from: l */
    private Rect f14390l;

    /* renamed from: m */
    private Rect f14391m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public C8339c f14392n;

    /* renamed from: o */
    private boolean f14393o;

    /* renamed from: com.yeelight.yeelib.pickcolor.ViewfinderView$b */
    private class C8338b implements View.OnTouchListener {
        private C8338b() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent == null) {
                return false;
            }
            int action = motionEvent.getAction();
            if (action == 0 || action == 1 || action == 2) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                float width = x - ((float) (ViewfinderView.this.f14387i.getWidth() / 2));
                float height = y - ((float) ViewfinderView.this.f14387i.getHeight());
                if (width < ((float) ViewfinderView.this.f14385g)) {
                    width = (float) ViewfinderView.this.f14385g;
                }
                if (width > ((float) ((ViewfinderView.this.getPreviewWidth() - (ViewfinderView.this.f14387i.getWidth() / 2)) - ViewfinderView.this.f14386h))) {
                    width = (float) ((ViewfinderView.this.getPreviewWidth() - (ViewfinderView.this.f14387i.getWidth() / 2)) - ViewfinderView.this.f14386h);
                }
                if (height < ((float) ViewfinderView.this.f14383e)) {
                    height = (float) ViewfinderView.this.f14383e;
                }
                if (height > ((float) ViewfinderView.this.getPreviewHeight())) {
                    height = (float) ViewfinderView.this.getPreviewHeight();
                }
                ViewfinderView.this.f14387i.setX(width);
                ViewfinderView.this.f14387i.setY(height);
                int e = ViewfinderView.this.getColorFromBitmap();
                ViewfinderView.this.f14387i.setColor(e);
                String format = String.format("R:%03d  G:%03d  B:%03d", new Object[]{Integer.valueOf(Color.red(e)), Integer.valueOf(Color.green(e)), Integer.valueOf(Color.blue(e))});
                if (ViewfinderView.this.f14392n != null) {
                    ViewfinderView.this.f14392n.mo35499s(format);
                }
            }
            return true;
        }
    }

    /* renamed from: com.yeelight.yeelib.pickcolor.ViewfinderView$c */
    public interface C8339c {
        /* renamed from: s */
        void mo35499s(String str);
    }

    public ViewfinderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setWillNotDraw(false);
        Resources resources = context.getResources();
        this.f14383e = resources.getDimensionPixelSize(R$dimen.capture_bg_margin_top);
        this.f14384f = resources.getDimensionPixelSize(R$dimen.capture_bg_margin_bottom);
        this.f14385g = resources.getDimensionPixelSize(R$dimen.capture_bg_margin_left);
        this.f14386h = resources.getDimensionPixelSize(R$dimen.capture_bg_margin_right);
        C8873b bVar = new C8873b(context);
        this.f14387i = bVar;
        bVar.setCapture(true);
        this.f14389k = new Matrix();
        this.f14393o = true;
        this.f14387i.setCapture(true);
        addView(this.f14387i);
    }

    /* access modifiers changed from: private */
    public int getColorFromBitmap() {
        if (this.f14388j == null) {
            return 0;
        }
        int x = (int) ((((this.f14387i.getX() - ((float) this.f14385g)) + ((float) (this.f14387i.getWidth() / 2))) * ((float) this.f14388j.getWidth())) / ((float) getPreviewWidth()));
        int y = (int) ((((this.f14387i.getY() - ((float) this.f14383e)) + ((float) this.f14387i.getHeight())) * ((float) this.f14388j.getHeight())) / ((float) getPreviewHeight()));
        if (x < 1) {
            x = 1;
        }
        if (y < 1) {
            y = 1;
        }
        if (x > this.f14388j.getWidth() - 1) {
            x = this.f14388j.getWidth() - 1;
        }
        if (y > this.f14388j.getHeight() - 1) {
            y = this.f14388j.getHeight() - 1;
        }
        return this.f14388j.getPixel(x, y);
    }

    /* renamed from: i */
    private void m19922i() {
        int width = getWidth() - this.f14387i.getWidth();
        int i = this.f14385g;
        float f = (((float) ((width - i) - i)) / 2.0f) + ((float) i);
        int height = getHeight() - this.f14387i.getHeight();
        int i2 = this.f14383e;
        float f2 = (((float) ((height - i2) - this.f14384f)) / 2.0f) + ((float) i2);
        this.f14387i.setX(f);
        this.f14387i.setY(f2);
    }

    /* renamed from: g */
    public void mo35511g() {
        invalidate();
    }

    public int getPreviewHeight() {
        int height = (getHeight() - this.f14383e) - this.f14384f;
        if (height > 0) {
            return height;
        }
        return 0;
    }

    public int getPreviewWidth() {
        int width = (getWidth() - this.f14385g) - this.f14386h;
        if (width > 0) {
            return width;
        }
        return 0;
    }

    public int getSelectColor() {
        return this.f14387i.getColor();
    }

    /* renamed from: h */
    public boolean mo35515h() {
        return this.f14393o;
    }

    /* renamed from: j */
    public void mo35516j(C8339c cVar) {
        this.f14392n = cVar;
    }

    /* renamed from: k */
    public void mo35517k() {
        this.f14393o = true;
        this.f14388j = null;
        this.f14387i.setVisibility(8);
        this.f14387i.setCapture(true);
        this.f14387i.setVisibility(0);
        setOnTouchListener((View.OnTouchListener) null);
        m19922i();
        invalidate();
    }

    /* renamed from: l */
    public void mo35518l() {
        if (this.f14392n != null) {
            this.f14392n = null;
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f14379a != null) {
            int width = getWidth();
            int height = getHeight();
            if (this.f14393o) {
                Rect e = this.f14379a.mo26508e();
                Rect f = this.f14379a.mo26509f();
                if (e != null && f != null) {
                    this.f14380b.setColor(this.f14381c);
                    this.f14380b.setStyle(Paint.Style.FILL);
                    float f2 = (float) width;
                    canvas.drawRect(0.0f, 0.0f, f2, (float) e.top, this.f14380b);
                    canvas.drawRect(0.0f, (float) e.top, (float) e.left, (float) (e.bottom + 1), this.f14380b);
                    Canvas canvas2 = canvas;
                    float f3 = f2;
                    canvas2.drawRect((float) (e.right + 1), (float) e.top, f3, (float) (e.bottom + 1), this.f14380b);
                    canvas2.drawRect(0.0f, (float) (e.bottom + 1), f3, (float) height, this.f14380b);
                } else {
                    return;
                }
            }
            this.f14380b.setColor(this.f14382d);
            this.f14380b.setStyle(Paint.Style.FILL);
            float f4 = (float) width;
            canvas.drawRect(0.0f, 0.0f, f4, (float) this.f14383e, this.f14380b);
            canvas.drawRect(0.0f, (float) this.f14383e, (float) this.f14385g, (float) (height - this.f14384f), this.f14380b);
            Canvas canvas3 = canvas;
            float f5 = f4;
            canvas3.drawRect((float) (width - this.f14386h), (float) this.f14383e, f5, (float) (height - this.f14384f), this.f14380b);
            canvas3.drawRect(0.0f, (float) (height - this.f14384f), f5, (float) height, this.f14380b);
            if (!this.f14393o) {
                this.f14389k.reset();
                this.f14389k.setScale(((float) getPreviewWidth()) / ((float) this.f14388j.getWidth()), ((float) getPreviewHeight()) / ((float) this.f14388j.getHeight()));
                canvas.drawBitmap(this.f14388j, this.f14390l, this.f14391m, this.f14380b);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m19922i();
    }

    public void setBitmap(Bitmap bitmap) {
        this.f14388j = bitmap;
        this.f14393o = false;
        this.f14390l = new Rect(0, 0, this.f14388j.getWidth(), this.f14388j.getHeight());
        this.f14391m = new Rect(this.f14385g, this.f14383e, getPreviewWidth() + this.f14385g + 5, getPreviewHeight() + this.f14383e);
        this.f14387i.setVisibility(8);
        this.f14387i.setSelected(true);
        this.f14387i.setVisibility(0);
        this.f14387i.setColor(getColorFromBitmap());
        setOnTouchListener(new C8338b());
        m19922i();
        invalidate();
    }

    public void setCameraManager(C3969d dVar) {
        this.f14379a = dVar;
    }

    public void setSelectColor(int i) {
        if (this.f14393o) {
            this.f14387i.setColor(i);
        }
    }
}
