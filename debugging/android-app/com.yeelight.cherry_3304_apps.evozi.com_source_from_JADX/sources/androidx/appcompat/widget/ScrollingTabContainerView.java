package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.RestrictTo;
import androidx.appcompat.C0035R;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.view.ActionBarPolicy;
import androidx.appcompat.widget.LinearLayoutCompat;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class ScrollingTabContainerView extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {
    private static final int FADE_DURATION = 200;
    private static final String TAG = "ScrollingTabContainerView";
    private static final Interpolator sAlphaInterpolator = new DecelerateInterpolator();
    private boolean mAllowCollapse;
    private int mContentHeight;
    int mMaxTabWidth;
    private int mSelectedTabIndex;
    int mStackedTabMaxWidth;
    private TabClickListener mTabClickListener;
    LinearLayoutCompat mTabLayout;
    Runnable mTabSelector;
    private Spinner mTabSpinner;
    protected final VisibilityAnimListener mVisAnimListener = new VisibilityAnimListener();
    protected ViewPropertyAnimator mVisibilityAnim;

    private class TabAdapter extends BaseAdapter {
        TabAdapter() {
        }

        public int getCount() {
            return ScrollingTabContainerView.this.mTabLayout.getChildCount();
        }

        public Object getItem(int i) {
            return ((TabView) ScrollingTabContainerView.this.mTabLayout.getChildAt(i)).getTab();
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                return ScrollingTabContainerView.this.createTabView((ActionBar.Tab) getItem(i), true);
            }
            ((TabView) view).bindTab((ActionBar.Tab) getItem(i));
            return view;
        }
    }

    private class TabClickListener implements View.OnClickListener {
        TabClickListener() {
        }

        public void onClick(View view) {
            ((TabView) view).getTab().select();
            int childCount = ScrollingTabContainerView.this.mTabLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = ScrollingTabContainerView.this.mTabLayout.getChildAt(i);
                childAt.setSelected(childAt == view);
            }
        }
    }

    private class TabView extends LinearLayout {
        private final int[] BG_ATTRS;
        private View mCustomView;
        private ImageView mIconView;
        private ActionBar.Tab mTab;
        private TextView mTextView;

        public TabView(Context context, ActionBar.Tab tab, boolean z) {
            super(context, (AttributeSet) null, C0035R.attr.actionBarTabStyle);
            int[] iArr = {16842964};
            this.BG_ATTRS = iArr;
            this.mTab = tab;
            TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, (AttributeSet) null, iArr, C0035R.attr.actionBarTabStyle, 0);
            if (obtainStyledAttributes.hasValue(0)) {
                setBackgroundDrawable(obtainStyledAttributes.getDrawable(0));
            }
            obtainStyledAttributes.recycle();
            if (z) {
                setGravity(8388627);
            }
            update();
        }

        public void bindTab(ActionBar.Tab tab) {
            this.mTab = tab;
            update();
        }

        public ActionBar.Tab getTab() {
            return this.mTab;
        }

        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName(ActionBar.Tab.class.getName());
        }

        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(ActionBar.Tab.class.getName());
        }

        public void onMeasure(int i, int i2) {
            int i3;
            super.onMeasure(i, i2);
            if (ScrollingTabContainerView.this.mMaxTabWidth > 0 && getMeasuredWidth() > (i3 = ScrollingTabContainerView.this.mMaxTabWidth)) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
            }
        }

        public void setSelected(boolean z) {
            boolean z2 = isSelected() != z;
            super.setSelected(z);
            if (z2 && z) {
                sendAccessibilityEvent(4);
            }
        }

        public void update() {
            ActionBar.Tab tab = this.mTab;
            View customView = tab.getCustomView();
            CharSequence charSequence = null;
            if (customView != null) {
                ViewParent parent = customView.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(customView);
                    }
                    addView(customView);
                }
                this.mCustomView = customView;
                TextView textView = this.mTextView;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.mIconView;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.mIconView.setImageDrawable((Drawable) null);
                    return;
                }
                return;
            }
            View view = this.mCustomView;
            if (view != null) {
                removeView(view);
                this.mCustomView = null;
            }
            Drawable icon = tab.getIcon();
            CharSequence text = tab.getText();
            if (icon != null) {
                if (this.mIconView == null) {
                    AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    appCompatImageView.setLayoutParams(layoutParams);
                    addView(appCompatImageView, 0);
                    this.mIconView = appCompatImageView;
                }
                this.mIconView.setImageDrawable(icon);
                this.mIconView.setVisibility(0);
            } else {
                ImageView imageView2 = this.mIconView;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.mIconView.setImageDrawable((Drawable) null);
                }
            }
            boolean z = !TextUtils.isEmpty(text);
            if (z) {
                if (this.mTextView == null) {
                    AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), (AttributeSet) null, C0035R.attr.actionBarTabTextStyle);
                    appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    appCompatTextView.setLayoutParams(layoutParams2);
                    addView(appCompatTextView);
                    this.mTextView = appCompatTextView;
                }
                this.mTextView.setText(text);
                this.mTextView.setVisibility(0);
            } else {
                TextView textView2 = this.mTextView;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    this.mTextView.setText((CharSequence) null);
                }
            }
            ImageView imageView3 = this.mIconView;
            if (imageView3 != null) {
                imageView3.setContentDescription(tab.getContentDescription());
            }
            if (!z) {
                charSequence = tab.getContentDescription();
            }
            TooltipCompat.setTooltipText(this, charSequence);
        }
    }

    protected class VisibilityAnimListener extends AnimatorListenerAdapter {
        private boolean mCanceled = false;
        private int mFinalVisibility;

        protected VisibilityAnimListener() {
        }

        public void onAnimationCancel(Animator animator) {
            this.mCanceled = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.mCanceled) {
                ScrollingTabContainerView scrollingTabContainerView = ScrollingTabContainerView.this;
                scrollingTabContainerView.mVisibilityAnim = null;
                scrollingTabContainerView.setVisibility(this.mFinalVisibility);
            }
        }

        public void onAnimationStart(Animator animator) {
            ScrollingTabContainerView.this.setVisibility(0);
            this.mCanceled = false;
        }

        public VisibilityAnimListener withFinalVisibility(ViewPropertyAnimator viewPropertyAnimator, int i) {
            this.mFinalVisibility = i;
            ScrollingTabContainerView.this.mVisibilityAnim = viewPropertyAnimator;
            return this;
        }
    }

    public ScrollingTabContainerView(Context context) {
        super(context);
        setHorizontalScrollBarEnabled(false);
        ActionBarPolicy actionBarPolicy = ActionBarPolicy.get(context);
        setContentHeight(actionBarPolicy.getTabContainerHeight());
        this.mStackedTabMaxWidth = actionBarPolicy.getStackedTabMaxWidth();
        LinearLayoutCompat createTabLayout = createTabLayout();
        this.mTabLayout = createTabLayout;
        addView(createTabLayout, new ViewGroup.LayoutParams(-2, -1));
    }

    private Spinner createSpinner() {
        AppCompatSpinner appCompatSpinner = new AppCompatSpinner(getContext(), (AttributeSet) null, C0035R.attr.actionDropDownStyle);
        appCompatSpinner.setLayoutParams(new LinearLayoutCompat.LayoutParams(-2, -1));
        appCompatSpinner.setOnItemSelectedListener(this);
        return appCompatSpinner;
    }

    private LinearLayoutCompat createTabLayout() {
        LinearLayoutCompat linearLayoutCompat = new LinearLayoutCompat(getContext(), (AttributeSet) null, C0035R.attr.actionBarTabBarStyle);
        linearLayoutCompat.setMeasureWithLargestChildEnabled(true);
        linearLayoutCompat.setGravity(17);
        linearLayoutCompat.setLayoutParams(new LinearLayoutCompat.LayoutParams(-2, -1));
        return linearLayoutCompat;
    }

    private boolean isCollapsed() {
        Spinner spinner = this.mTabSpinner;
        return spinner != null && spinner.getParent() == this;
    }

    private void performCollapse() {
        if (!isCollapsed()) {
            if (this.mTabSpinner == null) {
                this.mTabSpinner = createSpinner();
            }
            removeView(this.mTabLayout);
            addView(this.mTabSpinner, new ViewGroup.LayoutParams(-2, -1));
            if (this.mTabSpinner.getAdapter() == null) {
                this.mTabSpinner.setAdapter(new TabAdapter());
            }
            Runnable runnable = this.mTabSelector;
            if (runnable != null) {
                removeCallbacks(runnable);
                this.mTabSelector = null;
            }
            this.mTabSpinner.setSelection(this.mSelectedTabIndex);
        }
    }

    private boolean performExpand() {
        if (!isCollapsed()) {
            return false;
        }
        removeView(this.mTabSpinner);
        addView(this.mTabLayout, new ViewGroup.LayoutParams(-2, -1));
        setTabSelected(this.mTabSpinner.getSelectedItemPosition());
        return false;
    }

    public void addTab(ActionBar.Tab tab, int i, boolean z) {
        TabView createTabView = createTabView(tab, false);
        this.mTabLayout.addView(createTabView, i, new LinearLayoutCompat.LayoutParams(0, -1, 1.0f));
        Spinner spinner = this.mTabSpinner;
        if (spinner != null) {
            ((TabAdapter) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (z) {
            createTabView.setSelected(true);
        }
        if (this.mAllowCollapse) {
            requestLayout();
        }
    }

    public void addTab(ActionBar.Tab tab, boolean z) {
        TabView createTabView = createTabView(tab, false);
        this.mTabLayout.addView(createTabView, new LinearLayoutCompat.LayoutParams(0, -1, 1.0f));
        Spinner spinner = this.mTabSpinner;
        if (spinner != null) {
            ((TabAdapter) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (z) {
            createTabView.setSelected(true);
        }
        if (this.mAllowCollapse) {
            requestLayout();
        }
    }

    public void animateToTab(int i) {
        final View childAt = this.mTabLayout.getChildAt(i);
        Runnable runnable = this.mTabSelector;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        C00991 r0 = new Runnable() {
            public void run() {
                ScrollingTabContainerView.this.smoothScrollTo(childAt.getLeft() - ((ScrollingTabContainerView.this.getWidth() - childAt.getWidth()) / 2), 0);
                ScrollingTabContainerView.this.mTabSelector = null;
            }
        };
        this.mTabSelector = r0;
        post(r0);
    }

    public void animateToVisibility(int i) {
        ViewPropertyAnimator viewPropertyAnimator;
        ViewPropertyAnimator viewPropertyAnimator2 = this.mVisibilityAnim;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
        }
        if (i == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            viewPropertyAnimator = animate().alpha(1.0f);
        } else {
            viewPropertyAnimator = animate().alpha(0.0f);
        }
        viewPropertyAnimator.setDuration(200);
        viewPropertyAnimator.setInterpolator(sAlphaInterpolator);
        viewPropertyAnimator.setListener(this.mVisAnimListener.withFinalVisibility(viewPropertyAnimator, i));
        viewPropertyAnimator.start();
    }

    /* access modifiers changed from: package-private */
    public TabView createTabView(ActionBar.Tab tab, boolean z) {
        TabView tabView = new TabView(getContext(), tab, z);
        if (z) {
            tabView.setBackgroundDrawable((Drawable) null);
            tabView.setLayoutParams(new AbsListView.LayoutParams(-1, this.mContentHeight));
        } else {
            tabView.setFocusable(true);
            if (this.mTabClickListener == null) {
                this.mTabClickListener = new TabClickListener();
            }
            tabView.setOnClickListener(this.mTabClickListener);
        }
        return tabView;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.mTabSelector;
        if (runnable != null) {
            post(runnable);
        }
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ActionBarPolicy actionBarPolicy = ActionBarPolicy.get(getContext());
        setContentHeight(actionBarPolicy.getTabContainerHeight());
        this.mStackedTabMaxWidth = actionBarPolicy.getStackedTabMaxWidth();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.mTabSelector;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        ((TabView) view).getTab().select();
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int mode = View.MeasureSpec.getMode(i);
        boolean z = true;
        boolean z2 = mode == 1073741824;
        setFillViewport(z2);
        int childCount = this.mTabLayout.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            i3 = -1;
        } else {
            if (childCount > 2) {
                this.mMaxTabWidth = (int) (((float) View.MeasureSpec.getSize(i)) * 0.4f);
            } else {
                this.mMaxTabWidth = View.MeasureSpec.getSize(i) / 2;
            }
            i3 = Math.min(this.mMaxTabWidth, this.mStackedTabMaxWidth);
        }
        this.mMaxTabWidth = i3;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.mContentHeight, 1073741824);
        if (z2 || !this.mAllowCollapse) {
            z = false;
        }
        if (z) {
            this.mTabLayout.measure(0, makeMeasureSpec);
            if (this.mTabLayout.getMeasuredWidth() > View.MeasureSpec.getSize(i)) {
                performCollapse();
                int measuredWidth = getMeasuredWidth();
                super.onMeasure(i, makeMeasureSpec);
                int measuredWidth2 = getMeasuredWidth();
                if (z2 && measuredWidth != measuredWidth2) {
                    setTabSelected(this.mSelectedTabIndex);
                    return;
                }
            }
        }
        performExpand();
        int measuredWidth3 = getMeasuredWidth();
        super.onMeasure(i, makeMeasureSpec);
        int measuredWidth22 = getMeasuredWidth();
        if (z2) {
        }
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void removeAllTabs() {
        this.mTabLayout.removeAllViews();
        Spinner spinner = this.mTabSpinner;
        if (spinner != null) {
            ((TabAdapter) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (this.mAllowCollapse) {
            requestLayout();
        }
    }

    public void removeTabAt(int i) {
        this.mTabLayout.removeViewAt(i);
        Spinner spinner = this.mTabSpinner;
        if (spinner != null) {
            ((TabAdapter) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (this.mAllowCollapse) {
            requestLayout();
        }
    }

    public void setAllowCollapse(boolean z) {
        this.mAllowCollapse = z;
    }

    public void setContentHeight(int i) {
        this.mContentHeight = i;
        requestLayout();
    }

    public void setTabSelected(int i) {
        this.mSelectedTabIndex = i;
        int childCount = this.mTabLayout.getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = this.mTabLayout.getChildAt(i2);
            boolean z = i2 == i;
            childAt.setSelected(z);
            if (z) {
                animateToTab(i);
            }
            i2++;
        }
        Spinner spinner = this.mTabSpinner;
        if (spinner != null && i >= 0) {
            spinner.setSelection(i);
        }
    }

    public void updateTab(int i) {
        ((TabView) this.mTabLayout.getChildAt(i)).update();
        Spinner spinner = this.mTabSpinner;
        if (spinner != null) {
            ((TabAdapter) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (this.mAllowCollapse) {
            requestLayout();
        }
    }
}
