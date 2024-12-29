package com.miot.service.common.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.Transformation;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.internal.view.SupportMenu;

public class PieProgressBar extends ImageView {
    private PorterDuffXfermode mMode = new PorterDuffXfermode(PorterDuff.Mode.SRC_IN);
    private boolean mOri = true;
    private RectF mOval;
    private float mPercent = 0.0f;
    private PieProgressBarAnim mProgressBarAnim;
    private Bitmap mProgressBmp;
    private PieProgressTxtAnim mProgressTxtAnim;
    /* access modifiers changed from: private */
    public TextView mTxtView = null;
    private Paint mXferPaint;

    public class PieProgressBarAnim extends Animation {
        private int mFromPercent = 0;
        private int mLastPercent = 0;
        private int mToPercent = 0;

        public PieProgressBarAnim() {
        }

        /* access modifiers changed from: protected */
        public void applyTransformation(float f, Transformation transformation) {
            super.applyTransformation(f, transformation);
            int i = this.mFromPercent;
            int i2 = (int) (((float) i) + (((float) (this.mToPercent - i)) * f));
            if (this.mLastPercent != i2) {
                this.mLastPercent = i2;
                PieProgressBar.this.setPercent((float) i2);
            }
        }

        public void setFromPercent(int i) {
            if (i < 1) {
                i = 1;
            } else if (i > 100) {
                i = 100;
            }
            this.mFromPercent = i;
            this.mLastPercent = i;
            PieProgressBar.this.setPercent((float) i);
        }

        public void setToPercent(int i) {
            if (i < 1) {
                i = 1;
            } else if (i > 100) {
                i = 100;
            }
            this.mToPercent = i;
        }
    }

    public class PieProgressTxtAnim extends Animation {
        private int mFromPercent = 0;
        private int mLastPercent = 0;
        private int mToPercent = 0;

        public PieProgressTxtAnim() {
        }

        /* access modifiers changed from: protected */
        public void applyTransformation(float f, Transformation transformation) {
            super.applyTransformation(f, transformation);
            int i = this.mFromPercent;
            int i2 = (int) (((float) i) + (((float) (this.mToPercent - i)) * f));
            if (this.mLastPercent != i2) {
                this.mLastPercent = i2;
                if (PieProgressBar.this.mTxtView != null) {
                    TextView access$000 = PieProgressBar.this.mTxtView;
                    access$000.setText(i2 + "%");
                }
            }
        }

        public void setFromPercent(int i) {
            if (i < 1) {
                i = 1;
            } else if (i > 100) {
                i = 100;
            }
            this.mFromPercent = i;
            this.mLastPercent = i;
        }

        public void setToPercent(int i) {
            if (i < 1) {
                i = 1;
            } else if (i > 100) {
                i = 100;
            }
            this.mToPercent = i;
        }
    }

    public PieProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint(1);
        this.mXferPaint = paint;
        paint.setStyle(Paint.Style.FILL);
        this.mXferPaint.setColor(SupportMenu.CATEGORY_MASK);
        this.mXferPaint.setXfermode(this.mMode);
        RectF rectF = new RectF();
        this.mOval = rectF;
        rectF.left = 0.0f;
        rectF.top = 0.0f;
        this.mProgressBmp = ((BitmapDrawable) getDrawable()).getBitmap();
        this.mProgressBarAnim = new PieProgressBarAnim();
        this.mProgressTxtAnim = new PieProgressTxtAnim();
    }

    public float getPercent() {
        return this.mPercent;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            super.onDraw(canvas);
            return;
        }
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, (float) (getWidth() + 0), (float) (getHeight() + 0), (Paint) null, 31);
        this.mOval.right = (float) getWidth();
        this.mOval.bottom = (float) getHeight();
        this.mXferPaint.setXfermode((Xfermode) null);
        canvas.drawArc(this.mOval, -90.0f, (this.mPercent * (this.mOri ? 360.0f : -360.0f)) / 100.0f, true, this.mXferPaint);
        this.mXferPaint.setXfermode(this.mMode);
        canvas.drawBitmap(this.mProgressBmp, new Rect(0, 0, this.mProgressBmp.getWidth(), this.mProgressBmp.getHeight()), new RectF(0.0f, 0.0f, (float) getWidth(), (float) getHeight()), this.mXferPaint);
        canvas.restoreToCount(saveLayer);
    }

    public void setDuration(long j) {
        this.mProgressBarAnim.setDuration(j);
        this.mProgressTxtAnim.setDuration((j * 1) / 2);
    }

    public void setFromPercent(int i) {
        this.mProgressBarAnim.setFromPercent(i);
        this.mProgressTxtAnim.setFromPercent(i);
    }

    public void setInterpolator(Context context, int i) {
        this.mProgressBarAnim.setInterpolator(context, i);
    }

    public void setInterpolator(Interpolator interpolator) {
        this.mProgressBarAnim.setInterpolator(interpolator);
    }

    public void setOri(boolean z) {
        this.mOri = z;
    }

    public void setPercent(float f) {
        if (f < 1.0f) {
            f = 1.0f;
        } else if (f > 100.0f) {
            f = 100.0f;
        }
        this.mPercent = f;
        TextView textView = this.mTxtView;
        if (textView != null) {
            textView.setText(((int) this.mPercent) + "%");
        }
        invalidate();
    }

    public void setPercentView(TextView textView) {
        if (textView != null) {
            this.mTxtView = textView;
            textView.setText("1%");
        }
    }

    public void setToPercent(int i) {
        this.mProgressBarAnim.setToPercent(i);
        this.mProgressTxtAnim.setToPercent(i);
    }

    public void startPercentAnim() {
        startAnimation(this.mProgressBarAnim);
        TextView textView = this.mTxtView;
        if (textView != null) {
            textView.startAnimation(this.mProgressTxtAnim);
        }
    }
}
