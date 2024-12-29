package com.miot.service.common.widget;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.ActivityChooserView;
import com.miot.service.C3602R;
import java.lang.ref.WeakReference;

public class CustomPullDownRefreshLinearLayout extends LinearLayout {
    private static final int MSG_BUNCING_BACK = 0;
    private final int FRAME_DURATION = 16;
    private final float MAXIMUM_VELOCITY = 1.5f;
    private boolean isDown = false;
    private boolean isDragging = false;
    private Animation mAnimRotate;
    private Animation mAnimRotateBack;
    private ImageView mBkgImgView = null;
    private boolean mCanPullDown = true;
    private boolean mCanRefresh = false;
    private View mContainer = null;
    private int mCurOffsetY = 0;
    private BuncingHandler mHandler = new BuncingHandler(this);
    private View mHeader = null;
    private OnInterceptListener mInterceptListener;
    private boolean mIsRefreshing = false;
    private int mMaxHeaderHeight = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
    private float mMaximumVelocity;
    private int mOriHeight = 0;
    private boolean mPullDownEnabled = true;
    private CharSequence mPullDownToRefreshText;
    private OnRefreshListener mRefreshListener;
    private CharSequence mReleaseText;
    ScrollView mScrollView;
    int mScrollViewID;
    private boolean mShowRefreshProgress = true;
    private float mStartY = 0.0f;
    private int mTriggerRefreshThreshold;

    private static final class BuncingHandler extends Handler {
        private WeakReference<CustomPullDownRefreshLinearLayout> mReference;

        public BuncingHandler(CustomPullDownRefreshLinearLayout customPullDownRefreshLinearLayout) {
            this.mReference = new WeakReference<>(customPullDownRefreshLinearLayout);
        }

        public void handleMessage(Message message) {
            CustomPullDownRefreshLinearLayout customPullDownRefreshLinearLayout = (CustomPullDownRefreshLinearLayout) this.mReference.get();
            if (customPullDownRefreshLinearLayout != null) {
                if (message.what == 0) {
                    customPullDownRefreshLinearLayout.doAnimation();
                }
                super.handleMessage(message);
            }
        }
    }

    public interface OnInterceptListener {
        boolean needInterceptAnimation();

        void onInterceptAnimation();
    }

    public interface OnRefreshListener {
        void startRefresh();
    }

    public CustomPullDownRefreshLinearLayout(Context context) {
        super(context);
        init();
    }

    public CustomPullDownRefreshLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3602R.styleable.CustomPullDownRefreshLinearLayout);
        this.mScrollViewID = obtainStyledAttributes.getResourceId(C3602R.styleable.CustomPullDownRefreshLinearLayout_scroll_bar_id, 0);
        obtainStyledAttributes.recycle();
        init();
    }

    /* access modifiers changed from: private */
    public void doAnimation() {
        int i;
        ViewGroup.LayoutParams layoutParams = this.mContainer.getLayoutParams();
        if (this.mCurOffsetY >= 0) {
            int i2 = (int) (((float) this.mCurOffsetY) - ((this.mIsRefreshing ? this.mMaximumVelocity : this.mMaximumVelocity / 2.0f) * 16.0f));
            this.mCurOffsetY = i2;
            if (!this.mIsRefreshing || i2 > (i = this.mTriggerRefreshThreshold)) {
                int i3 = this.mCurOffsetY;
                if (i3 <= 0) {
                    this.mCurOffsetY = 0;
                    layoutParams.height = this.mOriHeight + 0;
                    this.mContainer.setLayoutParams(layoutParams);
                    this.mHandler.removeMessages(0);
                    return;
                }
                layoutParams.height = i3 + this.mOriHeight;
                this.mContainer.setLayoutParams(layoutParams);
            } else {
                this.mCurOffsetY = i;
                layoutParams.height = i + this.mOriHeight;
                this.mContainer.setLayoutParams(layoutParams);
                this.mHandler.removeMessages(0);
                return;
            }
        }
        this.mHandler.sendEmptyMessageDelayed(0, 16);
    }

    @SuppressLint({"NewApi"})
    private void init() {
        if (Build.VERSION.SDK_INT >= 14) {
            setOverScrollMode(2);
        }
        if (!isInEditMode()) {
            this.mMaximumVelocity = (getResources().getDisplayMetrics().density * 1.5f) + 0.5f;
            this.mPullDownToRefreshText = getContext().getString(C3602R.string.pull_down_refresh);
            this.mReleaseText = getContext().getString(C3602R.string.release_to_refresh);
            this.mTriggerRefreshThreshold = getResources().getDimensionPixelSize(C3602R.dimen.pull_down_refresh_threshold);
            View inflate = LayoutInflater.from(getContext()).inflate(C3602R.layout.pull_header, (ViewGroup) null);
            this.mHeader = inflate;
            this.mContainer = inflate.findViewById(C3602R.C3604id.pull_header);
            this.mBkgImgView = (ImageView) this.mHeader.findViewById(C3602R.C3604id.img_bkg);
            addView(this.mHeader, 0);
        }
    }

    private void preRefresh() {
        this.mIsRefreshing = true;
        ((TextView) findViewById(C3602R.C3604id.pull_header_txt)).setText(C3602R.string.refreshing);
        if (this.mShowRefreshProgress) {
            findViewById(C3602R.C3604id.pull_header_prog).setVisibility(0);
        }
        View findViewById = findViewById(C3602R.C3604id.pull_header_indc);
        findViewById.clearAnimation();
        findViewById.setVisibility(8);
        ViewGroup.LayoutParams layoutParams = this.mContainer.getLayoutParams();
        if (this.mCurOffsetY == 0) {
            this.mCurOffsetY = getContext().getResources().getDimensionPixelSize(C3602R.dimen.pull_down_header_height);
        }
        layoutParams.height = this.mCurOffsetY + this.mOriHeight;
        this.mContainer.setLayoutParams(layoutParams);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ScrollView scrollView;
        ScrollView scrollView2;
        if (!this.mCanPullDown) {
            return super.dispatchTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    boolean z = this.isDown;
                    if (z) {
                        TextView textView = (TextView) findViewById(C3602R.C3604id.pull_header_txt);
                        ImageView imageView = (ImageView) findViewById(C3602R.C3604id.pull_header_indc);
                        float y = motionEvent.getY();
                        if (y - this.mStartY > 10.0f) {
                            ViewGroup.LayoutParams layoutParams = this.mContainer.getLayoutParams();
                            int i = (int) ((y - this.mStartY) / 2.0f);
                            this.mCurOffsetY = i;
                            int i2 = this.mOriHeight;
                            int i3 = i + i2;
                            int i4 = this.mMaxHeaderHeight;
                            if (i3 < i4) {
                                layoutParams.height = i + i2;
                                this.mContainer.setLayoutParams(layoutParams);
                                if (this.mCurOffsetY >= this.mTriggerRefreshThreshold) {
                                    if (!this.mCanRefresh) {
                                        textView.setText(this.mReleaseText);
                                        if (this.mAnimRotate == null) {
                                            Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), C3602R.anim.rotate_180);
                                            this.mAnimRotate = loadAnimation;
                                            loadAnimation.setFillAfter(true);
                                        }
                                        imageView.startAnimation(this.mAnimRotate);
                                        this.mCanRefresh = true;
                                    }
                                } else if (this.mCanRefresh) {
                                    textView.setText(this.mPullDownToRefreshText);
                                    if (this.mAnimRotateBack == null) {
                                        Animation loadAnimation2 = AnimationUtils.loadAnimation(getContext(), C3602R.anim.rotate_back_180);
                                        this.mAnimRotateBack = loadAnimation2;
                                        loadAnimation2.setFillAfter(true);
                                    }
                                    imageView.startAnimation(this.mAnimRotateBack);
                                    this.mCanRefresh = false;
                                }
                            } else {
                                this.mCurOffsetY = Math.max(0, i4 - i2);
                            }
                            motionEvent.setAction(3);
                            super.dispatchTouchEvent(motionEvent);
                            this.isDragging = true;
                            return true;
                        }
                    } else if (this.mPullDownEnabled && !z && !this.mIsRefreshing && (scrollView2 = this.mScrollView) != null && scrollView2.getScrollY() <= 0 && this.mHeader.getTop() >= 0) {
                        this.isDown = true;
                        this.mStartY = motionEvent.getY();
                        this.mCanRefresh = false;
                    }
                } else if (action == 3) {
                    onViewHide();
                }
            } else if (this.isDown) {
                OnInterceptListener onInterceptListener = this.mInterceptListener;
                if (onInterceptListener == null || !onInterceptListener.needInterceptAnimation()) {
                    this.mHandler.sendEmptyMessage(0);
                    if (this.mCanRefresh) {
                        doRefresh();
                    }
                } else if (this.mCanRefresh) {
                    this.mInterceptListener.onInterceptAnimation();
                } else {
                    this.mHandler.sendEmptyMessage(0);
                }
                this.isDown = false;
            }
            this.isDragging = false;
        } else {
            this.isDragging = false;
            if (this.mPullDownEnabled) {
                this.mCanRefresh = false;
                if (!this.mIsRefreshing && (scrollView = this.mScrollView) != null && scrollView.getScrollY() <= 0) {
                    this.isDown = true;
                    this.mStartY = motionEvent.getY();
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void doRefresh() {
        if (!this.mIsRefreshing && this.mRefreshListener != null) {
            preRefresh();
            this.mRefreshListener.startRefresh();
        }
    }

    public boolean isMoving() {
        return this.isDragging;
    }

    public boolean isRefreshing() {
        return this.mIsRefreshing;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        if (this.mScrollView == null) {
            this.mScrollView = (ScrollView) findViewById(this.mScrollViewID);
        }
    }

    public void onViewHide() {
        if (this.isDown) {
            this.mHandler.sendEmptyMessage(0);
        }
        this.isDown = false;
    }

    public void postRefresh() {
        this.mIsRefreshing = false;
        ((TextView) findViewById(C3602R.C3604id.pull_header_txt)).setText(this.mPullDownToRefreshText);
        findViewById(C3602R.C3604id.pull_header_prog).setVisibility(8);
        View findViewById = findViewById(C3602R.C3604id.pull_header_indc);
        findViewById.clearAnimation();
        findViewById.setVisibility(0);
        ViewGroup.LayoutParams layoutParams = this.mContainer.getLayoutParams();
        layoutParams.height = this.mOriHeight + this.mCurOffsetY;
        this.mContainer.setLayoutParams(layoutParams);
        this.mHandler.sendEmptyMessageDelayed(0, 16);
    }

    public void resume() {
        onViewHide();
        doRefresh();
    }

    public void setCanPullDown(boolean z) {
        this.mCanPullDown = z;
    }

    public void setHeaderBackground(Drawable drawable) {
        ImageView imageView = this.mBkgImgView;
        if (imageView != null) {
            imageView.setImageDrawable(drawable);
            int minimumWidth = drawable.getMinimumWidth();
            int minimumHeight = drawable.getMinimumHeight();
            if (minimumWidth > 0) {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                ((Activity) getContext()).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                int i = (minimumHeight * displayMetrics.widthPixels) / minimumWidth;
                ViewGroup.LayoutParams layoutParams = this.mBkgImgView.getLayoutParams();
                layoutParams.height = i;
                this.mMaxHeaderHeight = i;
                this.mBkgImgView.setLayoutParams(layoutParams);
            }
        }
    }

    public void setIndicatorDrawable(Drawable drawable) {
        ((ImageView) findViewById(C3602R.C3604id.pull_header_indc)).setImageDrawable(drawable);
    }

    public void setInterceptListener(OnInterceptListener onInterceptListener) {
        this.mInterceptListener = onInterceptListener;
    }

    public void setMaxPullDownFromRes(int i) {
        this.mMaxHeaderHeight = getResources().getDimensionPixelSize(i);
    }

    public void setOriHeight(int i) {
        this.mOriHeight = i;
        findViewById(C3602R.C3604id.pull_header).getLayoutParams().height = this.mOriHeight;
        this.mHeader.findViewById(C3602R.C3604id.empty_view).getLayoutParams().height = this.mOriHeight;
    }

    public void setPullDownEnabled(boolean z) {
        this.mPullDownEnabled = z;
    }

    public void setPullDownHeaderVisibility(int i) {
        findViewById(C3602R.C3604id.pull_header_container).setVisibility(i);
    }

    public void setPullDownLine2Text(CharSequence charSequence) {
        TextView textView = (TextView) findViewById(C3602R.C3604id.pull_header_txt_line2);
        if (!TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(0);
            textView.setText(charSequence);
            return;
        }
        textView.setVisibility(8);
    }

    public void setPullDownText(CharSequence charSequence, CharSequence charSequence2) {
        this.mPullDownToRefreshText = charSequence;
        ((TextView) findViewById(C3602R.C3604id.pull_header_txt)).setText(this.mPullDownToRefreshText);
        this.mReleaseText = charSequence2;
    }

    public void setPullDownTextColor(int i) {
        ((TextView) findViewById(C3602R.C3604id.pull_header_txt)).setTextColor(i);
    }

    public void setPullDownTextColorLine2(int i) {
        ((TextView) findViewById(C3602R.C3604id.pull_header_txt_line2)).setTextColor(i);
    }

    public void setPullDownTextSize(int i) {
        ((TextView) findViewById(C3602R.C3604id.pull_header_txt)).setTextSize((float) i);
    }

    public void setRefreshListener(OnRefreshListener onRefreshListener) {
        this.mRefreshListener = onRefreshListener;
    }

    public void setScrollView(ScrollView scrollView) {
        this.mScrollView = scrollView;
    }

    public void setShowRefreshProgress(boolean z) {
        this.mShowRefreshProgress = z;
    }
}
