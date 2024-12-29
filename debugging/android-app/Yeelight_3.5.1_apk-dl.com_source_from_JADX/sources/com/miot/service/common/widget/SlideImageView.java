package com.miot.service.common.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.miot.common.utils.DisplayUtils;

public class SlideImageView extends ImageView {
    private static final int MSG_REFRESH = 100;
    private static final int MSG_REFRESH_ONCE = 101;
    private static final int SLIDE_SPEED = 5;
    private Paint mBlackPaint;
    private int mCurrentBlack = 0;
    /* access modifiers changed from: private */
    public Handler mHandler = new Handler() {
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 100) {
                SlideImageView.this.invalidate();
                SlideImageView.this.mHandler.sendEmptyMessageDelayed(100, 300);
            } else if (i == 101) {
                SlideImageView.this.invalidate();
            }
        }
    };
    private Paint mNormalPaint;
    private float[] mPointXs = new float[6];

    public SlideImageView(Context context) {
        super(context);
        init();
    }

    public SlideImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public SlideImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }

    /* access modifiers changed from: package-private */
    public void init() {
        Paint paint = new Paint(5);
        this.mNormalPaint = paint;
        paint.setColor(-3421237);
        Paint paint2 = new Paint(5);
        this.mBlackPaint = paint2;
        paint2.setColor(-7368817);
        for (int i = 0; i < 6; i++) {
            float[] fArr = this.mPointXs;
            if (i == 0) {
                fArr[i] = 20.5f;
            } else {
                fArr[i] = fArr[i - 1] + 7.0f;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        Paint paint;
        float f;
        float f2;
        float f3;
        super.onDraw(canvas);
        for (int i = 0; i < 6; i++) {
            if (i == this.mCurrentBlack) {
                f3 = (float) DisplayUtils.dip2px(getContext(), this.mPointXs[i]);
                f = (float) DisplayUtils.dip2px(getContext(), 1.5f);
                f2 = (float) DisplayUtils.dip2px(getContext(), 1.5f);
                paint = this.mBlackPaint;
            } else {
                f3 = (float) DisplayUtils.dip2px(getContext(), this.mPointXs[i]);
                f = (float) DisplayUtils.dip2px(getContext(), 1.5f);
                f2 = (float) DisplayUtils.dip2px(getContext(), 1.5f);
                paint = this.mNormalPaint;
            }
            canvas.drawCircle(f3, f, f2, paint);
        }
        int i2 = this.mCurrentBlack + 1;
        this.mCurrentBlack = i2;
        this.mCurrentBlack = i2 % 6;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(DisplayUtils.dip2px(getContext(), 68.0f), DisplayUtils.dip2px(getContext(), 3.0f));
    }

    public void startConnection() {
        this.mHandler.sendEmptyMessage(100);
    }

    public void stopConnection() {
        this.mHandler.removeMessages(100);
    }
}
