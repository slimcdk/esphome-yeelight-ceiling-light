package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.annotation.RestrictTo;
import androidx.appcompat.C0035R;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
class TooltipPopup {
    private static final String TAG = "TooltipPopup";
    private final View mContentView;
    private final Context mContext;
    private final WindowManager.LayoutParams mLayoutParams = new WindowManager.LayoutParams();
    private final TextView mMessageView;
    private final int[] mTmpAnchorPos = new int[2];
    private final int[] mTmpAppPos = new int[2];
    private final Rect mTmpDisplayFrame = new Rect();

    TooltipPopup(Context context) {
        this.mContext = context;
        View inflate = LayoutInflater.from(context).inflate(C0035R.layout.abc_tooltip, (ViewGroup) null);
        this.mContentView = inflate;
        this.mMessageView = (TextView) inflate.findViewById(C0035R.C0037id.message);
        this.mLayoutParams.setTitle(TooltipPopup.class.getSimpleName());
        this.mLayoutParams.packageName = this.mContext.getPackageName();
        WindowManager.LayoutParams layoutParams = this.mLayoutParams;
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = C0035R.style.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
    }

    private void computePosition(View view, int i, int i2, boolean z, WindowManager.LayoutParams layoutParams) {
        int i3;
        int i4;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.mContext.getResources().getDimensionPixelOffset(C0035R.dimen.tooltip_precise_anchor_threshold);
        if (view.getWidth() < dimensionPixelOffset) {
            i = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.mContext.getResources().getDimensionPixelOffset(C0035R.dimen.tooltip_precise_anchor_extra_offset);
            i4 = i2 + dimensionPixelOffset2;
            i3 = i2 - dimensionPixelOffset2;
        } else {
            i4 = view.getHeight();
            i3 = 0;
        }
        layoutParams.gravity = 49;
        int dimensionPixelOffset3 = this.mContext.getResources().getDimensionPixelOffset(z ? C0035R.dimen.tooltip_y_offset_touch : C0035R.dimen.tooltip_y_offset_non_touch);
        View appRootView = getAppRootView(view);
        if (appRootView != null) {
            appRootView.getWindowVisibleDisplayFrame(this.mTmpDisplayFrame);
            Rect rect = this.mTmpDisplayFrame;
            if (rect.left < 0 && rect.top < 0) {
                Resources resources = this.mContext.getResources();
                int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                this.mTmpDisplayFrame.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
            }
            appRootView.getLocationOnScreen(this.mTmpAppPos);
            view.getLocationOnScreen(this.mTmpAnchorPos);
            int[] iArr = this.mTmpAnchorPos;
            int i5 = iArr[0];
            int[] iArr2 = this.mTmpAppPos;
            iArr[0] = i5 - iArr2[0];
            iArr[1] = iArr[1] - iArr2[1];
            layoutParams.x = (iArr[0] + i) - (appRootView.getWidth() / 2);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            this.mContentView.measure(makeMeasureSpec, makeMeasureSpec);
            int measuredHeight = this.mContentView.getMeasuredHeight();
            int[] iArr3 = this.mTmpAnchorPos;
            int i6 = ((iArr3[1] + i3) - dimensionPixelOffset3) - measuredHeight;
            int i7 = iArr3[1] + i4 + dimensionPixelOffset3;
            if (!z ? measuredHeight + i7 > this.mTmpDisplayFrame.height() : i6 >= 0) {
                layoutParams.y = i6;
            } else {
                layoutParams.y = i7;
            }
        }
    }

    private static View getAppRootView(View view) {
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if ((layoutParams instanceof WindowManager.LayoutParams) && ((WindowManager.LayoutParams) layoutParams).type == 2) {
            return rootView;
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return ((Activity) context).getWindow().getDecorView();
            }
        }
        return rootView;
    }

    /* access modifiers changed from: package-private */
    public void hide() {
        if (isShowing()) {
            ((WindowManager) this.mContext.getSystemService("window")).removeView(this.mContentView);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean isShowing() {
        return this.mContentView.getParent() != null;
    }

    /* access modifiers changed from: package-private */
    public void show(View view, int i, int i2, boolean z, CharSequence charSequence) {
        if (isShowing()) {
            hide();
        }
        this.mMessageView.setText(charSequence);
        computePosition(view, i, i2, z, this.mLayoutParams);
        ((WindowManager) this.mContext.getSystemService("window")).addView(this.mContentView, this.mLayoutParams);
    }
}
