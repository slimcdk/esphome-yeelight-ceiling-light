package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.C0035R;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.view.TintableBackgroundView;
import androidx.core.view.ViewCompat;

public class AppCompatSpinner extends Spinner implements TintableBackgroundView {
    private static final int[] ATTRS_ANDROID_SPINNERMODE = {16843505};
    private static final int MAX_ITEMS_MEASURED = 15;
    private static final int MODE_DIALOG = 0;
    private static final int MODE_DROPDOWN = 1;
    private static final int MODE_THEME = -1;
    private static final String TAG = "AppCompatSpinner";
    private final AppCompatBackgroundHelper mBackgroundTintHelper;
    int mDropDownWidth;
    private ForwardingListener mForwardingListener;
    DropdownPopup mPopup;
    private final Context mPopupContext;
    private final boolean mPopupSet;
    private SpinnerAdapter mTempAdapter;
    final Rect mTempRect;

    private static class DropDownAdapter implements ListAdapter, SpinnerAdapter {
        private SpinnerAdapter mAdapter;
        private ListAdapter mListAdapter;

        public DropDownAdapter(@Nullable SpinnerAdapter spinnerAdapter, @Nullable Resources.Theme theme) {
            this.mAdapter = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.mListAdapter = (ListAdapter) spinnerAdapter;
            }
            if (theme == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 23 && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                    themedSpinnerAdapter.setDropDownViewTheme(theme);
                }
            } else if (spinnerAdapter instanceof ThemedSpinnerAdapter) {
                ThemedSpinnerAdapter themedSpinnerAdapter2 = (ThemedSpinnerAdapter) spinnerAdapter;
                if (themedSpinnerAdapter2.getDropDownViewTheme() == null) {
                    themedSpinnerAdapter2.setDropDownViewTheme(theme);
                }
            }
        }

        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.mListAdapter;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.mAdapter;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        public View getDropDownView(int i, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.mAdapter;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i, view, viewGroup);
        }

        public Object getItem(int i) {
            SpinnerAdapter spinnerAdapter = this.mAdapter;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i);
        }

        public long getItemId(int i) {
            SpinnerAdapter spinnerAdapter = this.mAdapter;
            if (spinnerAdapter == null) {
                return -1;
            }
            return spinnerAdapter.getItemId(i);
        }

        public int getItemViewType(int i) {
            return 0;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            return getDropDownView(i, view, viewGroup);
        }

        public int getViewTypeCount() {
            return 1;
        }

        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.mAdapter;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        public boolean isEmpty() {
            return getCount() == 0;
        }

        public boolean isEnabled(int i) {
            ListAdapter listAdapter = this.mListAdapter;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i);
            }
            return true;
        }

        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.mAdapter;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.mAdapter;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    private class DropdownPopup extends ListPopupWindow {
        ListAdapter mAdapter;
        private CharSequence mHintText;
        private final Rect mVisibleRect = new Rect();

        public DropdownPopup(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            setAnchorView(AppCompatSpinner.this);
            setModal(true);
            setPromptPosition(0);
            setOnItemClickListener(new AdapterView.OnItemClickListener(AppCompatSpinner.this) {
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                    AppCompatSpinner.this.setSelection(i);
                    if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                        DropdownPopup dropdownPopup = DropdownPopup.this;
                        AppCompatSpinner.this.performItemClick(view, i, dropdownPopup.mAdapter.getItemId(i));
                    }
                    DropdownPopup.this.dismiss();
                }
            });
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x008d  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0095  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void computeContentWidth() {
            /*
                r8 = this;
                android.graphics.drawable.Drawable r0 = r8.getBackground()
                r1 = 0
                if (r0 == 0) goto L_0x0026
                androidx.appcompat.widget.AppCompatSpinner r1 = androidx.appcompat.widget.AppCompatSpinner.this
                android.graphics.Rect r1 = r1.mTempRect
                r0.getPadding(r1)
                androidx.appcompat.widget.AppCompatSpinner r0 = androidx.appcompat.widget.AppCompatSpinner.this
                boolean r0 = androidx.appcompat.widget.ViewUtils.isLayoutRtl(r0)
                if (r0 == 0) goto L_0x001d
                androidx.appcompat.widget.AppCompatSpinner r0 = androidx.appcompat.widget.AppCompatSpinner.this
                android.graphics.Rect r0 = r0.mTempRect
                int r0 = r0.right
                goto L_0x0024
            L_0x001d:
                androidx.appcompat.widget.AppCompatSpinner r0 = androidx.appcompat.widget.AppCompatSpinner.this
                android.graphics.Rect r0 = r0.mTempRect
                int r0 = r0.left
                int r0 = -r0
            L_0x0024:
                r1 = r0
                goto L_0x002e
            L_0x0026:
                androidx.appcompat.widget.AppCompatSpinner r0 = androidx.appcompat.widget.AppCompatSpinner.this
                android.graphics.Rect r0 = r0.mTempRect
                r0.right = r1
                r0.left = r1
            L_0x002e:
                androidx.appcompat.widget.AppCompatSpinner r0 = androidx.appcompat.widget.AppCompatSpinner.this
                int r0 = r0.getPaddingLeft()
                androidx.appcompat.widget.AppCompatSpinner r2 = androidx.appcompat.widget.AppCompatSpinner.this
                int r2 = r2.getPaddingRight()
                androidx.appcompat.widget.AppCompatSpinner r3 = androidx.appcompat.widget.AppCompatSpinner.this
                int r3 = r3.getWidth()
                androidx.appcompat.widget.AppCompatSpinner r4 = androidx.appcompat.widget.AppCompatSpinner.this
                int r5 = r4.mDropDownWidth
                r6 = -2
                if (r5 != r6) goto L_0x0078
                android.widget.ListAdapter r5 = r8.mAdapter
                android.widget.SpinnerAdapter r5 = (android.widget.SpinnerAdapter) r5
                android.graphics.drawable.Drawable r6 = r8.getBackground()
                int r4 = r4.compatMeasureContentWidth(r5, r6)
                androidx.appcompat.widget.AppCompatSpinner r5 = androidx.appcompat.widget.AppCompatSpinner.this
                android.content.Context r5 = r5.getContext()
                android.content.res.Resources r5 = r5.getResources()
                android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
                int r5 = r5.widthPixels
                androidx.appcompat.widget.AppCompatSpinner r6 = androidx.appcompat.widget.AppCompatSpinner.this
                android.graphics.Rect r6 = r6.mTempRect
                int r7 = r6.left
                int r5 = r5 - r7
                int r6 = r6.right
                int r5 = r5 - r6
                if (r4 <= r5) goto L_0x0070
                r4 = r5
            L_0x0070:
                int r5 = r3 - r0
                int r5 = r5 - r2
                int r4 = java.lang.Math.max(r4, r5)
                goto L_0x007e
            L_0x0078:
                r4 = -1
                if (r5 != r4) goto L_0x0082
                int r4 = r3 - r0
                int r4 = r4 - r2
            L_0x007e:
                r8.setContentWidth(r4)
                goto L_0x0085
            L_0x0082:
                r8.setContentWidth(r5)
            L_0x0085:
                androidx.appcompat.widget.AppCompatSpinner r4 = androidx.appcompat.widget.AppCompatSpinner.this
                boolean r4 = androidx.appcompat.widget.ViewUtils.isLayoutRtl(r4)
                if (r4 == 0) goto L_0x0095
                int r3 = r3 - r2
                int r0 = r8.getWidth()
                int r3 = r3 - r0
                int r1 = r1 + r3
                goto L_0x0096
            L_0x0095:
                int r1 = r1 + r0
            L_0x0096:
                r8.setHorizontalOffset(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatSpinner.DropdownPopup.computeContentWidth():void");
        }

        public CharSequence getHintText() {
            return this.mHintText;
        }

        /* access modifiers changed from: package-private */
        public boolean isVisibleToUser(View view) {
            return ViewCompat.isAttachedToWindow(view) && view.getGlobalVisibleRect(this.mVisibleRect);
        }

        public void setAdapter(ListAdapter listAdapter) {
            super.setAdapter(listAdapter);
            this.mAdapter = listAdapter;
        }

        public void setPromptText(CharSequence charSequence) {
            this.mHintText = charSequence;
        }

        public void show() {
            ViewTreeObserver viewTreeObserver;
            boolean isShowing = isShowing();
            computeContentWidth();
            setInputMethodMode(2);
            super.show();
            getListView().setChoiceMode(1);
            setSelection(AppCompatSpinner.this.getSelectedItemPosition());
            if (!isShowing && (viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver()) != null) {
                final C00902 r1 = new ViewTreeObserver.OnGlobalLayoutListener() {
                    public void onGlobalLayout() {
                        DropdownPopup dropdownPopup = DropdownPopup.this;
                        if (!dropdownPopup.isVisibleToUser(AppCompatSpinner.this)) {
                            DropdownPopup.this.dismiss();
                            return;
                        }
                        DropdownPopup.this.computeContentWidth();
                        DropdownPopup.super.show();
                    }
                };
                viewTreeObserver.addOnGlobalLayoutListener(r1);
                setOnDismissListener(new PopupWindow.OnDismissListener() {
                    public void onDismiss() {
                        ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
                        if (viewTreeObserver != null) {
                            viewTreeObserver.removeGlobalOnLayoutListener(r1);
                        }
                    }
                });
            }
        }
    }

    public AppCompatSpinner(Context context) {
        this(context, (AttributeSet) null);
    }

    public AppCompatSpinner(Context context, int i) {
        this(context, (AttributeSet) null, C0035R.attr.spinnerStyle, i);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0035R.attr.spinnerStyle);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, -1);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, attributeSet, i, i2, (Resources.Theme) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0054, code lost:
        if (r10 != null) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0056, code lost:
        r10.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0065, code lost:
        if (r10 != null) goto L_0x0056;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00c1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AppCompatSpinner(android.content.Context r6, android.util.AttributeSet r7, int r8, int r9, android.content.res.Resources.Theme r10) {
        /*
            r5 = this;
            r5.<init>(r6, r7, r8)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r5.mTempRect = r0
            int[] r0 = androidx.appcompat.C0035R.styleable.Spinner
            r1 = 0
            androidx.appcompat.widget.TintTypedArray r0 = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(r6, r7, r0, r8, r1)
            androidx.appcompat.widget.AppCompatBackgroundHelper r2 = new androidx.appcompat.widget.AppCompatBackgroundHelper
            r2.<init>(r5)
            r5.mBackgroundTintHelper = r2
            r2 = 0
            if (r10 == 0) goto L_0x0023
            androidx.appcompat.view.ContextThemeWrapper r3 = new androidx.appcompat.view.ContextThemeWrapper
            r3.<init>((android.content.Context) r6, (android.content.res.Resources.Theme) r10)
        L_0x0020:
            r5.mPopupContext = r3
            goto L_0x003c
        L_0x0023:
            int r10 = androidx.appcompat.C0035R.styleable.Spinner_popupTheme
            int r10 = r0.getResourceId(r10, r1)
            if (r10 == 0) goto L_0x0031
            androidx.appcompat.view.ContextThemeWrapper r3 = new androidx.appcompat.view.ContextThemeWrapper
            r3.<init>((android.content.Context) r6, (int) r10)
            goto L_0x0020
        L_0x0031:
            int r10 = android.os.Build.VERSION.SDK_INT
            r3 = 23
            if (r10 >= r3) goto L_0x0039
            r10 = r6
            goto L_0x003a
        L_0x0039:
            r10 = r2
        L_0x003a:
            r5.mPopupContext = r10
        L_0x003c:
            android.content.Context r10 = r5.mPopupContext
            r3 = 1
            if (r10 == 0) goto L_0x00a0
            r10 = -1
            if (r9 != r10) goto L_0x0068
            int[] r10 = ATTRS_ANDROID_SPINNERMODE     // Catch:{ Exception -> 0x0064, all -> 0x005d }
            android.content.res.TypedArray r10 = r6.obtainStyledAttributes(r7, r10, r8, r1)     // Catch:{ Exception -> 0x0064, all -> 0x005d }
            boolean r4 = r10.hasValue(r1)     // Catch:{ Exception -> 0x0065, all -> 0x005a }
            if (r4 == 0) goto L_0x0054
            int r9 = r10.getInt(r1, r1)     // Catch:{ Exception -> 0x0065, all -> 0x005a }
        L_0x0054:
            if (r10 == 0) goto L_0x0068
        L_0x0056:
            r10.recycle()
            goto L_0x0068
        L_0x005a:
            r6 = move-exception
            r2 = r10
            goto L_0x005e
        L_0x005d:
            r6 = move-exception
        L_0x005e:
            if (r2 == 0) goto L_0x0063
            r2.recycle()
        L_0x0063:
            throw r6
        L_0x0064:
            r10 = r2
        L_0x0065:
            if (r10 == 0) goto L_0x0068
            goto L_0x0056
        L_0x0068:
            if (r9 != r3) goto L_0x00a0
            androidx.appcompat.widget.AppCompatSpinner$DropdownPopup r9 = new androidx.appcompat.widget.AppCompatSpinner$DropdownPopup
            android.content.Context r10 = r5.mPopupContext
            r9.<init>(r10, r7, r8)
            android.content.Context r10 = r5.mPopupContext
            int[] r4 = androidx.appcompat.C0035R.styleable.Spinner
            androidx.appcompat.widget.TintTypedArray r10 = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(r10, r7, r4, r8, r1)
            int r1 = androidx.appcompat.C0035R.styleable.Spinner_android_dropDownWidth
            r4 = -2
            int r1 = r10.getLayoutDimension((int) r1, (int) r4)
            r5.mDropDownWidth = r1
            int r1 = androidx.appcompat.C0035R.styleable.Spinner_android_popupBackground
            android.graphics.drawable.Drawable r1 = r10.getDrawable(r1)
            r9.setBackgroundDrawable(r1)
            int r1 = androidx.appcompat.C0035R.styleable.Spinner_android_prompt
            java.lang.String r1 = r0.getString(r1)
            r9.setPromptText(r1)
            r10.recycle()
            r5.mPopup = r9
            androidx.appcompat.widget.AppCompatSpinner$1 r10 = new androidx.appcompat.widget.AppCompatSpinner$1
            r10.<init>(r5, r9)
            r5.mForwardingListener = r10
        L_0x00a0:
            int r9 = androidx.appcompat.C0035R.styleable.Spinner_android_entries
            java.lang.CharSequence[] r9 = r0.getTextArray(r9)
            if (r9 == 0) goto L_0x00b8
            android.widget.ArrayAdapter r10 = new android.widget.ArrayAdapter
            r1 = 17367048(0x1090008, float:2.5162948E-38)
            r10.<init>(r6, r1, r9)
            int r6 = androidx.appcompat.C0035R.layout.support_simple_spinner_dropdown_item
            r10.setDropDownViewResource(r6)
            r5.setAdapter((android.widget.SpinnerAdapter) r10)
        L_0x00b8:
            r0.recycle()
            r5.mPopupSet = r3
            android.widget.SpinnerAdapter r6 = r5.mTempAdapter
            if (r6 == 0) goto L_0x00c6
            r5.setAdapter((android.widget.SpinnerAdapter) r6)
            r5.mTempAdapter = r2
        L_0x00c6:
            androidx.appcompat.widget.AppCompatBackgroundHelper r6 = r5.mBackgroundTintHelper
            r6.loadFromAttributes(r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatSpinner.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }

    /* access modifiers changed from: package-private */
    public int compatMeasureContentWidth(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i2 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i2;
        }
        drawable.getPadding(this.mTempRect);
        Rect rect = this.mTempRect;
        return i2 + rect.left + rect.right;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.mBackgroundTintHelper;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.applySupportBackgroundTint();
        }
    }

    public int getDropDownHorizontalOffset() {
        DropdownPopup dropdownPopup = this.mPopup;
        if (dropdownPopup != null) {
            return dropdownPopup.getHorizontalOffset();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownHorizontalOffset();
        }
        return 0;
    }

    public int getDropDownVerticalOffset() {
        DropdownPopup dropdownPopup = this.mPopup;
        if (dropdownPopup != null) {
            return dropdownPopup.getVerticalOffset();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownVerticalOffset();
        }
        return 0;
    }

    public int getDropDownWidth() {
        if (this.mPopup != null) {
            return this.mDropDownWidth;
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownWidth();
        }
        return 0;
    }

    public Drawable getPopupBackground() {
        DropdownPopup dropdownPopup = this.mPopup;
        if (dropdownPopup != null) {
            return dropdownPopup.getBackground();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getPopupBackground();
        }
        return null;
    }

    public Context getPopupContext() {
        if (this.mPopup != null) {
            return this.mPopupContext;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            return super.getPopupContext();
        }
        return null;
    }

    public CharSequence getPrompt() {
        DropdownPopup dropdownPopup = this.mPopup;
        return dropdownPopup != null ? dropdownPopup.getHintText() : super.getPrompt();
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public ColorStateList getSupportBackgroundTintList() {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.mBackgroundTintHelper;
        if (appCompatBackgroundHelper != null) {
            return appCompatBackgroundHelper.getSupportBackgroundTintList();
        }
        return null;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.mBackgroundTintHelper;
        if (appCompatBackgroundHelper != null) {
            return appCompatBackgroundHelper.getSupportBackgroundTintMode();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        DropdownPopup dropdownPopup = this.mPopup;
        if (dropdownPopup != null && dropdownPopup.isShowing()) {
            this.mPopup.dismiss();
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.mPopup != null && View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), compatMeasureContentWidth(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        ForwardingListener forwardingListener = this.mForwardingListener;
        if (forwardingListener == null || !forwardingListener.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public boolean performClick() {
        DropdownPopup dropdownPopup = this.mPopup;
        if (dropdownPopup == null) {
            return super.performClick();
        }
        if (dropdownPopup.isShowing()) {
            return true;
        }
        this.mPopup.show();
        return true;
    }

    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.mPopupSet) {
            this.mTempAdapter = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.mPopup != null) {
            Context context = this.mPopupContext;
            if (context == null) {
                context = getContext();
            }
            this.mPopup.setAdapter(new DropDownAdapter(spinnerAdapter, context.getTheme()));
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.mBackgroundTintHelper;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.onSetBackgroundDrawable(drawable);
        }
    }

    public void setBackgroundResource(@DrawableRes int i) {
        super.setBackgroundResource(i);
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.mBackgroundTintHelper;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.onSetBackgroundResource(i);
        }
    }

    public void setDropDownHorizontalOffset(int i) {
        DropdownPopup dropdownPopup = this.mPopup;
        if (dropdownPopup != null) {
            dropdownPopup.setHorizontalOffset(i);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownHorizontalOffset(i);
        }
    }

    public void setDropDownVerticalOffset(int i) {
        DropdownPopup dropdownPopup = this.mPopup;
        if (dropdownPopup != null) {
            dropdownPopup.setVerticalOffset(i);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownVerticalOffset(i);
        }
    }

    public void setDropDownWidth(int i) {
        if (this.mPopup != null) {
            this.mDropDownWidth = i;
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownWidth(i);
        }
    }

    public void setPopupBackgroundDrawable(Drawable drawable) {
        DropdownPopup dropdownPopup = this.mPopup;
        if (dropdownPopup != null) {
            dropdownPopup.setBackgroundDrawable(drawable);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    public void setPopupBackgroundResource(@DrawableRes int i) {
        setPopupBackgroundDrawable(AppCompatResources.getDrawable(getPopupContext(), i));
    }

    public void setPrompt(CharSequence charSequence) {
        DropdownPopup dropdownPopup = this.mPopup;
        if (dropdownPopup != null) {
            dropdownPopup.setPromptText(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.mBackgroundTintHelper;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.setSupportBackgroundTintList(colorStateList);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.mBackgroundTintHelper;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.setSupportBackgroundTintMode(mode);
        }
    }
}
