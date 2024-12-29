package com.miot.service.common.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Camera;
import android.graphics.Matrix;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import com.miot.service.C3602R;
import java.util.Timer;
import java.util.TimerTask;

public class AutoTextView extends TextSwitcher implements ViewSwitcher.ViewFactory {
    private static final String TAG = "AutoTextView";
    private Timer mAnimTimer;
    private Context mContext;
    /* access modifiers changed from: private */
    public String mDownText;
    /* access modifiers changed from: private */
    public Handler mHandler;
    /* access modifiers changed from: private */
    public Rotate3dAnimation mInDownAnim;
    /* access modifiers changed from: private */
    public boolean mIsDown;
    private boolean mIsRun;
    /* access modifiers changed from: private */
    public Rotate3dAnimation mOutDownAnim;
    private int mTextColor;
    private float mTextSize;
    /* access modifiers changed from: private */
    public String mUpText;

    private static class Rotate3dAnimation extends Animation {
        private Camera mCamera;
        private float mCenterX;
        private float mCenterY;
        private final float mFromDegrees;
        private final float mToDegrees;
        private final boolean mTurnIn;
        private final boolean mTurnUp;

        public Rotate3dAnimation(float f, float f2, float f3, float f4, boolean z, boolean z2) {
            this.mFromDegrees = f;
            this.mToDegrees = f2;
            this.mCenterY = f3 / 2.0f;
            this.mCenterX = f4 / 2.0f;
            this.mTurnIn = z;
            this.mTurnUp = z2;
        }

        /* access modifiers changed from: protected */
        public void applyTransformation(float f, Transformation transformation) {
            float f2;
            float f3 = this.mFromDegrees;
            float f4 = f3 + ((this.mToDegrees - f3) * f);
            float f5 = this.mCenterX;
            float f6 = this.mCenterY;
            Camera camera = this.mCamera;
            int i = this.mTurnUp ? 1 : -1;
            Matrix matrix = transformation.getMatrix();
            camera.save();
            float f7 = (float) i;
            if (this.mTurnIn) {
                f2 = f7 * this.mCenterY;
                f -= 1.0f;
            } else {
                f2 = f7 * this.mCenterY;
            }
            camera.translate(0.0f, f2 * f, 0.0f);
            camera.rotateX(f4);
            camera.getMatrix(matrix);
            camera.restore();
            matrix.preTranslate(-f5, -f6);
            matrix.postTranslate(f5, f6);
        }

        public void initialize(int i, int i2, int i3, int i4) {
            super.initialize(i, i2, i3, i4);
            this.mCamera = new Camera();
        }
    }

    public AutoTextView(Context context) {
        this(context, (AttributeSet) null);
    }

    public AutoTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mIsDown = false;
        this.mIsRun = false;
        this.mContext = context;
        this.mHandler = new Handler(this.mContext.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3602R.styleable.AutoTextView);
        this.mTextSize = (float) obtainStyledAttributes.getInt(C3602R.styleable.AutoTextView_autoTextSize, 13);
        "mTextSize: " + this.mTextSize;
        this.mTextColor = obtainStyledAttributes.getColor(C3602R.styleable.AutoTextView_autoTextColor, -6710887);
        obtainStyledAttributes.recycle();
        setFactory(this);
    }

    private Rotate3dAnimation createAnim(float f, float f2, float f3, float f4, boolean z, boolean z2) {
        Rotate3dAnimation rotate3dAnimation = new Rotate3dAnimation(f, f2, f3, f4, z, z2);
        rotate3dAnimation.setDuration(1500);
        rotate3dAnimation.setFillAfter(false);
        rotate3dAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
        return rotate3dAnimation;
    }

    public String getDownText() {
        return this.mDownText;
    }

    public String getUpText() {
        return this.mUpText;
    }

    public View makeView() {
        TextView textView = new TextView(this.mContext);
        textView.setGravity(17);
        textView.setTextSize(this.mTextSize);
        textView.setTextColor(this.mTextColor);
        textView.setSingleLine(true);
        return textView;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        float f = (float) i2;
        float f2 = (float) i;
        this.mInDownAnim = createAnim(90.0f, 0.0f, f, f2, true, false);
        this.mOutDownAnim = createAnim(0.0f, -90.0f, f, f2, false, false);
    }

    public void setDownText(String str) {
        this.mDownText = str;
    }

    public void setUpText(String str) {
        this.mUpText = str;
    }

    public void startAnim() {
        if (!this.mIsRun) {
            this.mIsRun = true;
            C36341 r2 = new TimerTask() {
                public void run() {
                    AutoTextView.this.mHandler.post(new Runnable() {
                        public void run() {
                            String str;
                            AutoTextView autoTextView;
                            if (!TextUtils.isEmpty(AutoTextView.this.mDownText) || !TextUtils.isEmpty(AutoTextView.this.mUpText)) {
                                AutoTextView autoTextView2 = AutoTextView.this;
                                autoTextView2.setInAnimation(autoTextView2.mInDownAnim);
                                AutoTextView autoTextView3 = AutoTextView.this;
                                autoTextView3.setOutAnimation(autoTextView3.mOutDownAnim);
                                if (AutoTextView.this.mIsDown) {
                                    boolean unused = AutoTextView.this.mIsDown = false;
                                    autoTextView = AutoTextView.this;
                                    str = autoTextView.mDownText;
                                } else {
                                    boolean unused2 = AutoTextView.this.mIsDown = true;
                                    autoTextView = AutoTextView.this;
                                    str = autoTextView.mUpText;
                                }
                                autoTextView.setText(str);
                            }
                        }
                    });
                }
            };
            Timer timer = new Timer();
            this.mAnimTimer = timer;
            timer.schedule(r2, 0, 4000);
        }
    }

    public void stopAnim() {
        Timer timer = this.mAnimTimer;
        if (timer != null) {
            timer.cancel();
            this.mAnimTimer = null;
        }
        this.mIsRun = false;
    }
}
