package androidx.recyclerview.widget;

import android.graphics.PointF;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.ActivityChooserView;
import androidx.recyclerview.widget.RecyclerView;

public class LinearSnapHelper extends SnapHelper {
    private static final float INVALID_DISTANCE = 1.0f;
    @Nullable
    private OrientationHelper mHorizontalHelper;
    @Nullable
    private OrientationHelper mVerticalHelper;

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0034, code lost:
        r12 = java.lang.Math.max(r12.getDecoratedEnd(r3), r12.getDecoratedEnd(r4)) - java.lang.Math.min(r12.getDecoratedStart(r3), r12.getDecoratedStart(r4));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private float computeDistancePerChild(androidx.recyclerview.widget.RecyclerView.LayoutManager r11, androidx.recyclerview.widget.OrientationHelper r12) {
        /*
            r10 = this;
            int r0 = r11.getChildCount()
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r0 != 0) goto L_0x0009
            return r1
        L_0x0009:
            r2 = 0
            r3 = 0
            r4 = 2147483647(0x7fffffff, float:NaN)
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r3
            r5 = 2147483647(0x7fffffff, float:NaN)
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x0016:
            if (r2 >= r0) goto L_0x002f
            android.view.View r7 = r11.getChildAt(r2)
            int r8 = r11.getPosition(r7)
            r9 = -1
            if (r8 != r9) goto L_0x0024
            goto L_0x002c
        L_0x0024:
            if (r8 >= r5) goto L_0x0028
            r3 = r7
            r5 = r8
        L_0x0028:
            if (r8 <= r6) goto L_0x002c
            r4 = r7
            r6 = r8
        L_0x002c:
            int r2 = r2 + 1
            goto L_0x0016
        L_0x002f:
            if (r3 == 0) goto L_0x0059
            if (r4 != 0) goto L_0x0034
            goto L_0x0059
        L_0x0034:
            int r11 = r12.getDecoratedStart(r3)
            int r0 = r12.getDecoratedStart(r4)
            int r11 = java.lang.Math.min(r11, r0)
            int r0 = r12.getDecoratedEnd(r3)
            int r12 = r12.getDecoratedEnd(r4)
            int r12 = java.lang.Math.max(r0, r12)
            int r12 = r12 - r11
            if (r12 != 0) goto L_0x0050
            return r1
        L_0x0050:
            float r11 = (float) r12
            float r11 = r11 * r1
            int r6 = r6 - r5
            int r6 = r6 + 1
            float r12 = (float) r6
            float r11 = r11 / r12
            return r11
        L_0x0059:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearSnapHelper.computeDistancePerChild(androidx.recyclerview.widget.RecyclerView$LayoutManager, androidx.recyclerview.widget.OrientationHelper):float");
    }

    private int distanceToCenter(@NonNull View view, OrientationHelper orientationHelper) {
        return (orientationHelper.getDecoratedStart(view) + (orientationHelper.getDecoratedMeasurement(view) / 2)) - (orientationHelper.getStartAfterPadding() + (orientationHelper.getTotalSpace() / 2));
    }

    private int estimateNextPositionDiffForFling(RecyclerView.LayoutManager layoutManager, OrientationHelper orientationHelper, int i, int i2) {
        int[] calculateScrollDistance = calculateScrollDistance(i, i2);
        float computeDistancePerChild = computeDistancePerChild(layoutManager, orientationHelper);
        if (computeDistancePerChild <= 0.0f) {
            return 0;
        }
        return Math.round(((float) (Math.abs(calculateScrollDistance[0]) > Math.abs(calculateScrollDistance[1]) ? calculateScrollDistance[0] : calculateScrollDistance[1])) / computeDistancePerChild);
    }

    @Nullable
    private View findCenterView(RecyclerView.LayoutManager layoutManager, OrientationHelper orientationHelper) {
        int childCount = layoutManager.getChildCount();
        View view = null;
        if (childCount == 0) {
            return null;
        }
        int startAfterPadding = orientationHelper.getStartAfterPadding() + (orientationHelper.getTotalSpace() / 2);
        int i = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = layoutManager.getChildAt(i2);
            int abs = Math.abs((orientationHelper.getDecoratedStart(childAt) + (orientationHelper.getDecoratedMeasurement(childAt) / 2)) - startAfterPadding);
            if (abs < i) {
                view = childAt;
                i = abs;
            }
        }
        return view;
    }

    @NonNull
    private OrientationHelper getHorizontalHelper(@NonNull RecyclerView.LayoutManager layoutManager) {
        OrientationHelper orientationHelper = this.mHorizontalHelper;
        if (orientationHelper == null || orientationHelper.mLayoutManager != layoutManager) {
            this.mHorizontalHelper = OrientationHelper.createHorizontalHelper(layoutManager);
        }
        return this.mHorizontalHelper;
    }

    @NonNull
    private OrientationHelper getVerticalHelper(@NonNull RecyclerView.LayoutManager layoutManager) {
        OrientationHelper orientationHelper = this.mVerticalHelper;
        if (orientationHelper == null || orientationHelper.mLayoutManager != layoutManager) {
            this.mVerticalHelper = OrientationHelper.createVerticalHelper(layoutManager);
        }
        return this.mVerticalHelper;
    }

    public int[] calculateDistanceToFinalSnap(@NonNull RecyclerView.LayoutManager layoutManager, @NonNull View view) {
        int[] iArr = new int[2];
        if (layoutManager.canScrollHorizontally()) {
            iArr[0] = distanceToCenter(view, getHorizontalHelper(layoutManager));
        } else {
            iArr[0] = 0;
        }
        if (layoutManager.canScrollVertically()) {
            iArr[1] = distanceToCenter(view, getVerticalHelper(layoutManager));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    public View findSnapView(RecyclerView.LayoutManager layoutManager) {
        OrientationHelper horizontalHelper;
        if (layoutManager.canScrollVertically()) {
            horizontalHelper = getVerticalHelper(layoutManager);
        } else if (!layoutManager.canScrollHorizontally()) {
            return null;
        } else {
            horizontalHelper = getHorizontalHelper(layoutManager);
        }
        return findCenterView(layoutManager, horizontalHelper);
    }

    public int findTargetSnapPosition(RecyclerView.LayoutManager layoutManager, int i, int i2) {
        int itemCount;
        View findSnapView;
        int position;
        int i3;
        PointF computeScrollVectorForPosition;
        int i4;
        int i5;
        if (!(layoutManager instanceof RecyclerView.SmoothScroller.ScrollVectorProvider) || (itemCount = layoutManager.getItemCount()) == 0 || (findSnapView = findSnapView(layoutManager)) == null || (position = layoutManager.getPosition(findSnapView)) == -1 || (computeScrollVectorForPosition = ((RecyclerView.SmoothScroller.ScrollVectorProvider) layoutManager).computeScrollVectorForPosition(i3)) == null) {
            return -1;
        }
        int i6 = 0;
        if (layoutManager.canScrollHorizontally()) {
            i4 = estimateNextPositionDiffForFling(layoutManager, getHorizontalHelper(layoutManager), i, 0);
            if (computeScrollVectorForPosition.x < 0.0f) {
                i4 = -i4;
            }
        } else {
            i4 = 0;
        }
        if (layoutManager.canScrollVertically()) {
            i5 = estimateNextPositionDiffForFling(layoutManager, getVerticalHelper(layoutManager), 0, i2);
            if (computeScrollVectorForPosition.y < 0.0f) {
                i5 = -i5;
            }
        } else {
            i5 = 0;
        }
        if (layoutManager.canScrollVertically()) {
            i4 = i5;
        }
        if (i4 == 0) {
            return -1;
        }
        int i7 = position + i4;
        if (i7 >= 0) {
            i6 = i7;
        }
        return i6 >= itemCount ? itemCount - 1 : i6;
    }
}
