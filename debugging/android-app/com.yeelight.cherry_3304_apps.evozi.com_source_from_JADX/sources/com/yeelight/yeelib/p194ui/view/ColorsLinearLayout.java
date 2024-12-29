package com.yeelight.yeelib.p194ui.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import androidx.core.view.ViewCompat;

/* renamed from: com.yeelight.yeelib.ui.view.ColorsLinearLayout */
public class ColorsLinearLayout extends LinearLayout {

    /* renamed from: a */
    Paint f19415a = new Paint();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public LinearGradient f19416b;

    /* renamed from: com.yeelight.yeelib.ui.view.ColorsLinearLayout$a */
    class C10414a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ int f19417a;

        C10414a(int i) {
            this.f19417a = i;
        }

        public void onGlobalLayout() {
            ColorsLinearLayout.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            LinearGradient unused = ColorsLinearLayout.this.f19416b = new LinearGradient(0.0f, 0.0f, (float) ColorsLinearLayout.this.getWidth(), (float) ColorsLinearLayout.this.getHeight(), Color.argb(200, Color.red(this.f19417a), Color.green(this.f19417a), Color.blue(this.f19417a)), ViewCompat.MEASURED_STATE_MASK, Shader.TileMode.MIRROR);
            ColorsLinearLayout.this.invalidate();
        }
    }

    public ColorsLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        this.f19415a.setAntiAlias(true);
        this.f19415a.setStyle(Paint.Style.FILL);
        this.f19415a.setShader(this.f19416b);
        canvas.drawRect(-1.0f, -1.0f, (float) (getWidth() + 1), (float) (getHeight() + 1), this.f19415a);
        super.onDraw(canvas);
    }

    public void setColor(int i) {
        setWillNotDraw(false);
        this.f19416b = new LinearGradient(0.0f, 0.0f, (float) getWidth(), (float) getHeight(), Color.argb(200, Color.red(i), Color.green(i), Color.blue(i)), ViewCompat.MEASURED_STATE_MASK, Shader.TileMode.MIRROR);
        invalidate();
        if (getWidth() == 0) {
            getViewTreeObserver().addOnGlobalLayoutListener(new C10414a(i));
        }
    }

    public void setColor(int[] iArr) {
        int[] iArr2;
        setWillNotDraw(false);
        if (iArr == null) {
            iArr = new int[]{-1, 16777215};
        } else if (iArr.length == 1) {
            int i = iArr[0];
            iArr2 = new int[]{-16777216 | i, i & ViewCompat.MEASURED_SIZE_MASK};
            this.f19416b = new LinearGradient(0.0f, 0.0f, (float) getWidth(), (float) getHeight(), iArr2, (float[]) null, Shader.TileMode.MIRROR);
            invalidate();
        }
        iArr2 = iArr;
        this.f19416b = new LinearGradient(0.0f, 0.0f, (float) getWidth(), (float) getHeight(), iArr2, (float[]) null, Shader.TileMode.MIRROR);
        invalidate();
    }
}
