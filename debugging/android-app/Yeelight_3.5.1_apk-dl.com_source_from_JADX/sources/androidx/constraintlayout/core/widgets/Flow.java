package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;
import java.util.HashMap;

public class Flow extends VirtualLayout {
    public static final int HORIZONTAL_ALIGN_CENTER = 2;
    public static final int HORIZONTAL_ALIGN_END = 1;
    public static final int HORIZONTAL_ALIGN_START = 0;
    public static final int VERTICAL_ALIGN_BASELINE = 3;
    public static final int VERTICAL_ALIGN_BOTTOM = 1;
    public static final int VERTICAL_ALIGN_CENTER = 2;
    public static final int VERTICAL_ALIGN_TOP = 0;
    public static final int WRAP_ALIGNED = 2;
    public static final int WRAP_CHAIN = 1;
    public static final int WRAP_CHAIN_NEW = 3;
    public static final int WRAP_NONE = 0;
    private ConstraintWidget[] mAlignedBiggestElementsInCols = null;
    private ConstraintWidget[] mAlignedBiggestElementsInRows = null;
    private int[] mAlignedDimensions = null;
    private ArrayList<WidgetsList> mChainList = new ArrayList<>();
    /* access modifiers changed from: private */
    public ConstraintWidget[] mDisplayedWidgets;
    /* access modifiers changed from: private */
    public int mDisplayedWidgetsCount = 0;
    /* access modifiers changed from: private */
    public float mFirstHorizontalBias = 0.5f;
    /* access modifiers changed from: private */
    public int mFirstHorizontalStyle = -1;
    /* access modifiers changed from: private */
    public float mFirstVerticalBias = 0.5f;
    /* access modifiers changed from: private */
    public int mFirstVerticalStyle = -1;
    /* access modifiers changed from: private */
    public int mHorizontalAlign = 2;
    /* access modifiers changed from: private */
    public float mHorizontalBias = 0.5f;
    /* access modifiers changed from: private */
    public int mHorizontalGap = 0;
    /* access modifiers changed from: private */
    public int mHorizontalStyle = -1;
    /* access modifiers changed from: private */
    public float mLastHorizontalBias = 0.5f;
    /* access modifiers changed from: private */
    public int mLastHorizontalStyle = -1;
    /* access modifiers changed from: private */
    public float mLastVerticalBias = 0.5f;
    /* access modifiers changed from: private */
    public int mLastVerticalStyle = -1;
    private int mMaxElementsWrap = -1;
    private int mOrientation = 0;
    /* access modifiers changed from: private */
    public int mVerticalAlign = 2;
    /* access modifiers changed from: private */
    public float mVerticalBias = 0.5f;
    /* access modifiers changed from: private */
    public int mVerticalGap = 0;
    /* access modifiers changed from: private */
    public int mVerticalStyle = -1;
    private int mWrapMode = 0;

    private class WidgetsList {
        /* access modifiers changed from: private */
        public ConstraintWidget biggest = null;
        int biggestDimension = 0;
        private ConstraintAnchor mBottom;
        private int mCount = 0;
        private int mHeight = 0;
        private ConstraintAnchor mLeft;
        private int mMax = 0;
        private int mNbMatchConstraintsWidgets = 0;
        private int mOrientation = 0;
        private int mPaddingBottom = 0;
        private int mPaddingLeft = 0;
        private int mPaddingRight = 0;
        private int mPaddingTop = 0;
        private ConstraintAnchor mRight;
        private int mStartIndex = 0;
        private ConstraintAnchor mTop;
        private int mWidth = 0;

        public WidgetsList(int i, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, ConstraintAnchor constraintAnchor3, ConstraintAnchor constraintAnchor4, int i2) {
            this.mOrientation = i;
            this.mLeft = constraintAnchor;
            this.mTop = constraintAnchor2;
            this.mRight = constraintAnchor3;
            this.mBottom = constraintAnchor4;
            this.mPaddingLeft = Flow.this.getPaddingLeft();
            this.mPaddingTop = Flow.this.getPaddingTop();
            this.mPaddingRight = Flow.this.getPaddingRight();
            this.mPaddingBottom = Flow.this.getPaddingBottom();
            this.mMax = i2;
        }

        private void recomputeDimensions() {
            this.mWidth = 0;
            this.mHeight = 0;
            this.biggest = null;
            this.biggestDimension = 0;
            int i = this.mCount;
            int i2 = 0;
            while (i2 < i && this.mStartIndex + i2 < Flow.this.mDisplayedWidgetsCount) {
                ConstraintWidget constraintWidget = Flow.this.mDisplayedWidgets[this.mStartIndex + i2];
                if (this.mOrientation == 0) {
                    int width = constraintWidget.getWidth();
                    int access$000 = Flow.this.mHorizontalGap;
                    if (constraintWidget.getVisibility() == 8) {
                        access$000 = 0;
                    }
                    this.mWidth += width + access$000;
                    int access$300 = Flow.this.getWidgetHeight(constraintWidget, this.mMax);
                    if (this.biggest == null || this.biggestDimension < access$300) {
                        this.biggest = constraintWidget;
                        this.biggestDimension = access$300;
                        this.mHeight = access$300;
                    }
                } else {
                    int access$200 = Flow.this.getWidgetWidth(constraintWidget, this.mMax);
                    int access$3002 = Flow.this.getWidgetHeight(constraintWidget, this.mMax);
                    int access$100 = Flow.this.mVerticalGap;
                    if (constraintWidget.getVisibility() == 8) {
                        access$100 = 0;
                    }
                    this.mHeight += access$3002 + access$100;
                    if (this.biggest == null || this.biggestDimension < access$200) {
                        this.biggest = constraintWidget;
                        this.biggestDimension = access$200;
                        this.mWidth = access$200;
                    }
                }
                i2++;
            }
        }

        public void add(ConstraintWidget constraintWidget) {
            int i = 0;
            if (this.mOrientation == 0) {
                int access$200 = Flow.this.getWidgetWidth(constraintWidget, this.mMax);
                if (constraintWidget.getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    this.mNbMatchConstraintsWidgets++;
                    access$200 = 0;
                }
                int access$000 = Flow.this.mHorizontalGap;
                if (constraintWidget.getVisibility() != 8) {
                    i = access$000;
                }
                this.mWidth += access$200 + i;
                int access$300 = Flow.this.getWidgetHeight(constraintWidget, this.mMax);
                if (this.biggest == null || this.biggestDimension < access$300) {
                    this.biggest = constraintWidget;
                    this.biggestDimension = access$300;
                    this.mHeight = access$300;
                }
            } else {
                int access$2002 = Flow.this.getWidgetWidth(constraintWidget, this.mMax);
                int access$3002 = Flow.this.getWidgetHeight(constraintWidget, this.mMax);
                if (constraintWidget.getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    this.mNbMatchConstraintsWidgets++;
                    access$3002 = 0;
                }
                int access$100 = Flow.this.mVerticalGap;
                if (constraintWidget.getVisibility() != 8) {
                    i = access$100;
                }
                this.mHeight += access$3002 + i;
                if (this.biggest == null || this.biggestDimension < access$2002) {
                    this.biggest = constraintWidget;
                    this.biggestDimension = access$2002;
                    this.mWidth = access$2002;
                }
            }
            this.mCount++;
        }

        public void clear() {
            this.biggestDimension = 0;
            this.biggest = null;
            this.mWidth = 0;
            this.mHeight = 0;
            this.mStartIndex = 0;
            this.mCount = 0;
            this.mNbMatchConstraintsWidgets = 0;
        }

        /* JADX WARNING: Removed duplicated region for block: B:140:0x0260  */
        /* JADX WARNING: Removed duplicated region for block: B:57:0x00e1  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void createConstraints(boolean r17, int r18, boolean r19) {
            /*
                r16 = this;
                r0 = r16
                int r1 = r0.mCount
                r2 = 0
                r3 = 0
            L_0x0006:
                if (r3 >= r1) goto L_0x0027
                int r4 = r0.mStartIndex
                int r4 = r4 + r3
                androidx.constraintlayout.core.widgets.Flow r5 = androidx.constraintlayout.core.widgets.Flow.this
                int r5 = r5.mDisplayedWidgetsCount
                if (r4 < r5) goto L_0x0014
                goto L_0x0027
            L_0x0014:
                androidx.constraintlayout.core.widgets.Flow r4 = androidx.constraintlayout.core.widgets.Flow.this
                androidx.constraintlayout.core.widgets.ConstraintWidget[] r4 = r4.mDisplayedWidgets
                int r5 = r0.mStartIndex
                int r5 = r5 + r3
                r4 = r4[r5]
                if (r4 == 0) goto L_0x0024
                r4.resetAnchors()
            L_0x0024:
                int r3 = r3 + 1
                goto L_0x0006
            L_0x0027:
                if (r1 == 0) goto L_0x0351
                androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r0.biggest
                if (r3 != 0) goto L_0x002f
                goto L_0x0351
            L_0x002f:
                if (r19 == 0) goto L_0x0035
                if (r18 != 0) goto L_0x0035
                r4 = 1
                goto L_0x0036
            L_0x0035:
                r4 = 0
            L_0x0036:
                r5 = -1
                r6 = 0
                r7 = -1
                r8 = -1
            L_0x003a:
                if (r6 >= r1) goto L_0x0069
                if (r17 == 0) goto L_0x0042
                int r9 = r1 + -1
                int r9 = r9 - r6
                goto L_0x0043
            L_0x0042:
                r9 = r6
            L_0x0043:
                int r10 = r0.mStartIndex
                int r10 = r10 + r9
                androidx.constraintlayout.core.widgets.Flow r11 = androidx.constraintlayout.core.widgets.Flow.this
                int r11 = r11.mDisplayedWidgetsCount
                if (r10 < r11) goto L_0x004f
                goto L_0x0069
            L_0x004f:
                androidx.constraintlayout.core.widgets.Flow r10 = androidx.constraintlayout.core.widgets.Flow.this
                androidx.constraintlayout.core.widgets.ConstraintWidget[] r10 = r10.mDisplayedWidgets
                int r11 = r0.mStartIndex
                int r11 = r11 + r9
                r9 = r10[r11]
                if (r9 == 0) goto L_0x0066
                int r9 = r9.getVisibility()
                if (r9 != 0) goto L_0x0066
                if (r7 != r5) goto L_0x0065
                r7 = r6
            L_0x0065:
                r8 = r6
            L_0x0066:
                int r6 = r6 + 1
                goto L_0x003a
            L_0x0069:
                r6 = 0
                int r9 = r0.mOrientation
                if (r9 != 0) goto L_0x01fc
                androidx.constraintlayout.core.widgets.ConstraintWidget r9 = r0.biggest
                androidx.constraintlayout.core.widgets.Flow r10 = androidx.constraintlayout.core.widgets.Flow.this
                int r10 = r10.mVerticalStyle
                r9.setVerticalChainStyle(r10)
                int r10 = r0.mPaddingTop
                if (r18 <= 0) goto L_0x0084
                androidx.constraintlayout.core.widgets.Flow r11 = androidx.constraintlayout.core.widgets.Flow.this
                int r11 = r11.mVerticalGap
                int r10 = r10 + r11
            L_0x0084:
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r9.mTop
                androidx.constraintlayout.core.widgets.ConstraintAnchor r12 = r0.mTop
                r11.connect(r12, r10)
                if (r19 == 0) goto L_0x0096
                androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r9.mBottom
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r0.mBottom
                int r12 = r0.mPaddingBottom
                r10.connect(r11, r12)
            L_0x0096:
                if (r18 <= 0) goto L_0x00a3
                androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r0.mTop
                androidx.constraintlayout.core.widgets.ConstraintWidget r10 = r10.mOwner
                androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r10.mBottom
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r9.mTop
                r10.connect(r11, r2)
            L_0x00a3:
                androidx.constraintlayout.core.widgets.Flow r10 = androidx.constraintlayout.core.widgets.Flow.this
                int r10 = r10.mVerticalAlign
                r11 = 3
                if (r10 != r11) goto L_0x00dd
                boolean r10 = r9.hasBaseline()
                if (r10 != 0) goto L_0x00dd
                r10 = 0
            L_0x00b3:
                if (r10 >= r1) goto L_0x00dd
                if (r17 == 0) goto L_0x00bb
                int r12 = r1 + -1
                int r12 = r12 - r10
                goto L_0x00bc
            L_0x00bb:
                r12 = r10
            L_0x00bc:
                int r13 = r0.mStartIndex
                int r13 = r13 + r12
                androidx.constraintlayout.core.widgets.Flow r14 = androidx.constraintlayout.core.widgets.Flow.this
                int r14 = r14.mDisplayedWidgetsCount
                if (r13 < r14) goto L_0x00c8
                goto L_0x00dd
            L_0x00c8:
                androidx.constraintlayout.core.widgets.Flow r13 = androidx.constraintlayout.core.widgets.Flow.this
                androidx.constraintlayout.core.widgets.ConstraintWidget[] r13 = r13.mDisplayedWidgets
                int r14 = r0.mStartIndex
                int r14 = r14 + r12
                r12 = r13[r14]
                boolean r13 = r12.hasBaseline()
                if (r13 == 0) goto L_0x00da
                goto L_0x00de
            L_0x00da:
                int r10 = r10 + 1
                goto L_0x00b3
            L_0x00dd:
                r12 = r9
            L_0x00de:
                r10 = 0
            L_0x00df:
                if (r10 >= r1) goto L_0x0351
                if (r17 == 0) goto L_0x00e7
                int r13 = r1 + -1
                int r13 = r13 - r10
                goto L_0x00e8
            L_0x00e7:
                r13 = r10
            L_0x00e8:
                int r14 = r0.mStartIndex
                int r14 = r14 + r13
                androidx.constraintlayout.core.widgets.Flow r15 = androidx.constraintlayout.core.widgets.Flow.this
                int r15 = r15.mDisplayedWidgetsCount
                if (r14 < r15) goto L_0x00f5
                goto L_0x0351
            L_0x00f5:
                androidx.constraintlayout.core.widgets.Flow r14 = androidx.constraintlayout.core.widgets.Flow.this
                androidx.constraintlayout.core.widgets.ConstraintWidget[] r14 = r14.mDisplayedWidgets
                int r15 = r0.mStartIndex
                int r15 = r15 + r13
                r14 = r14[r15]
                if (r14 != 0) goto L_0x0106
                r14 = r6
            L_0x0103:
                r6 = 3
                goto L_0x01f6
            L_0x0106:
                if (r10 != 0) goto L_0x0111
                androidx.constraintlayout.core.widgets.ConstraintAnchor r15 = r14.mLeft
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r0.mLeft
                int r3 = r0.mPaddingLeft
                r14.connect((androidx.constraintlayout.core.widgets.ConstraintAnchor) r15, (androidx.constraintlayout.core.widgets.ConstraintAnchor) r11, (int) r3)
            L_0x0111:
                if (r13 != 0) goto L_0x016f
                androidx.constraintlayout.core.widgets.Flow r3 = androidx.constraintlayout.core.widgets.Flow.this
                int r3 = r3.mHorizontalStyle
                r11 = 1065353216(0x3f800000, float:1.0)
                androidx.constraintlayout.core.widgets.Flow r13 = androidx.constraintlayout.core.widgets.Flow.this
                float r13 = r13.mHorizontalBias
                if (r17 == 0) goto L_0x0125
                float r13 = r11 - r13
            L_0x0125:
                int r15 = r0.mStartIndex
                if (r15 != 0) goto L_0x0149
                androidx.constraintlayout.core.widgets.Flow r15 = androidx.constraintlayout.core.widgets.Flow.this
                int r15 = r15.mFirstHorizontalStyle
                if (r15 == r5) goto L_0x0149
                androidx.constraintlayout.core.widgets.Flow r3 = androidx.constraintlayout.core.widgets.Flow.this
                int r3 = r3.mFirstHorizontalStyle
                if (r17 == 0) goto L_0x0141
                androidx.constraintlayout.core.widgets.Flow r13 = androidx.constraintlayout.core.widgets.Flow.this
                float r13 = r13.mFirstHorizontalBias
            L_0x013f:
                float r11 = r11 - r13
                goto L_0x0147
            L_0x0141:
                androidx.constraintlayout.core.widgets.Flow r11 = androidx.constraintlayout.core.widgets.Flow.this
                float r11 = r11.mFirstHorizontalBias
            L_0x0147:
                r13 = r11
                goto L_0x0169
            L_0x0149:
                if (r19 == 0) goto L_0x0169
                androidx.constraintlayout.core.widgets.Flow r15 = androidx.constraintlayout.core.widgets.Flow.this
                int r15 = r15.mLastHorizontalStyle
                if (r15 == r5) goto L_0x0169
                androidx.constraintlayout.core.widgets.Flow r3 = androidx.constraintlayout.core.widgets.Flow.this
                int r3 = r3.mLastHorizontalStyle
                if (r17 == 0) goto L_0x0162
                androidx.constraintlayout.core.widgets.Flow r13 = androidx.constraintlayout.core.widgets.Flow.this
                float r13 = r13.mLastHorizontalBias
                goto L_0x013f
            L_0x0162:
                androidx.constraintlayout.core.widgets.Flow r11 = androidx.constraintlayout.core.widgets.Flow.this
                float r11 = r11.mLastHorizontalBias
                goto L_0x0147
            L_0x0169:
                r14.setHorizontalChainStyle(r3)
                r14.setHorizontalBiasPercent(r13)
            L_0x016f:
                int r3 = r1 + -1
                if (r10 != r3) goto L_0x017c
                androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r14.mRight
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r0.mRight
                int r13 = r0.mPaddingRight
                r14.connect((androidx.constraintlayout.core.widgets.ConstraintAnchor) r3, (androidx.constraintlayout.core.widgets.ConstraintAnchor) r11, (int) r13)
            L_0x017c:
                if (r6 == 0) goto L_0x01a7
                androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r14.mLeft
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r6.mRight
                androidx.constraintlayout.core.widgets.Flow r13 = androidx.constraintlayout.core.widgets.Flow.this
                int r13 = r13.mHorizontalGap
                r3.connect(r11, r13)
                if (r10 != r7) goto L_0x0194
                androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r14.mLeft
                int r11 = r0.mPaddingLeft
                r3.setGoneMargin(r11)
            L_0x0194:
                androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r6.mRight
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r14.mLeft
                r3.connect(r11, r2)
                r3 = 1
                int r11 = r8 + 1
                if (r10 != r11) goto L_0x01a7
                androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r6.mRight
                int r6 = r0.mPaddingRight
                r3.setGoneMargin(r6)
            L_0x01a7:
                if (r14 == r9) goto L_0x0103
                androidx.constraintlayout.core.widgets.Flow r3 = androidx.constraintlayout.core.widgets.Flow.this
                int r3 = r3.mVerticalAlign
                r6 = 3
                if (r3 != r6) goto L_0x01c5
                boolean r3 = r12.hasBaseline()
                if (r3 == 0) goto L_0x01c5
                if (r14 == r12) goto L_0x01c5
                boolean r3 = r14.hasBaseline()
                if (r3 == 0) goto L_0x01c5
                androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r14.mBaseline
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r12.mBaseline
                goto L_0x01f3
            L_0x01c5:
                androidx.constraintlayout.core.widgets.Flow r3 = androidx.constraintlayout.core.widgets.Flow.this
                int r3 = r3.mVerticalAlign
                if (r3 == 0) goto L_0x01ef
                r11 = 1
                if (r3 == r11) goto L_0x01ea
                androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r14.mTop
                if (r4 == 0) goto L_0x01e5
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r0.mTop
                int r13 = r0.mPaddingTop
                r3.connect(r11, r13)
                androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r14.mBottom
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r0.mBottom
                int r13 = r0.mPaddingBottom
                r3.connect(r11, r13)
                goto L_0x01f6
            L_0x01e5:
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r9.mTop
                r3.connect(r11, r2)
            L_0x01ea:
                androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r14.mBottom
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r9.mBottom
                goto L_0x01f3
            L_0x01ef:
                androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r14.mTop
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r9.mTop
            L_0x01f3:
                r3.connect(r11, r2)
            L_0x01f6:
                int r10 = r10 + 1
                r6 = r14
                r11 = 3
                goto L_0x00df
            L_0x01fc:
                androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r0.biggest
                androidx.constraintlayout.core.widgets.Flow r9 = androidx.constraintlayout.core.widgets.Flow.this
                int r9 = r9.mHorizontalStyle
                r3.setHorizontalChainStyle(r9)
                int r9 = r0.mPaddingLeft
                if (r18 <= 0) goto L_0x0212
                androidx.constraintlayout.core.widgets.Flow r10 = androidx.constraintlayout.core.widgets.Flow.this
                int r10 = r10.mHorizontalGap
                int r9 = r9 + r10
            L_0x0212:
                if (r17 == 0) goto L_0x0231
                androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r3.mRight
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r0.mRight
                r10.connect(r11, r9)
                if (r19 == 0) goto L_0x0226
                androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r3.mLeft
                androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r0.mLeft
                int r11 = r0.mPaddingRight
                r9.connect(r10, r11)
            L_0x0226:
                if (r18 <= 0) goto L_0x0250
                androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r0.mRight
                androidx.constraintlayout.core.widgets.ConstraintWidget r9 = r9.mOwner
                androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r9.mLeft
                androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r3.mRight
                goto L_0x024d
            L_0x0231:
                androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r3.mLeft
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r0.mLeft
                r10.connect(r11, r9)
                if (r19 == 0) goto L_0x0243
                androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r3.mRight
                androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r0.mRight
                int r11 = r0.mPaddingRight
                r9.connect(r10, r11)
            L_0x0243:
                if (r18 <= 0) goto L_0x0250
                androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r0.mLeft
                androidx.constraintlayout.core.widgets.ConstraintWidget r9 = r9.mOwner
                androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r9.mRight
                androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r3.mLeft
            L_0x024d:
                r9.connect(r10, r2)
            L_0x0250:
                r9 = 0
            L_0x0251:
                if (r9 >= r1) goto L_0x0351
                int r10 = r0.mStartIndex
                int r10 = r10 + r9
                androidx.constraintlayout.core.widgets.Flow r11 = androidx.constraintlayout.core.widgets.Flow.this
                int r11 = r11.mDisplayedWidgetsCount
                if (r10 < r11) goto L_0x0260
                goto L_0x0351
            L_0x0260:
                androidx.constraintlayout.core.widgets.Flow r10 = androidx.constraintlayout.core.widgets.Flow.this
                androidx.constraintlayout.core.widgets.ConstraintWidget[] r10 = r10.mDisplayedWidgets
                int r11 = r0.mStartIndex
                int r11 = r11 + r9
                r10 = r10[r11]
                if (r10 != 0) goto L_0x0270
                r12 = 1
                goto L_0x034d
            L_0x0270:
                if (r9 != 0) goto L_0x02bc
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r10.mTop
                androidx.constraintlayout.core.widgets.ConstraintAnchor r12 = r0.mTop
                int r13 = r0.mPaddingTop
                r10.connect((androidx.constraintlayout.core.widgets.ConstraintAnchor) r11, (androidx.constraintlayout.core.widgets.ConstraintAnchor) r12, (int) r13)
                androidx.constraintlayout.core.widgets.Flow r11 = androidx.constraintlayout.core.widgets.Flow.this
                int r11 = r11.mVerticalStyle
                androidx.constraintlayout.core.widgets.Flow r12 = androidx.constraintlayout.core.widgets.Flow.this
                float r12 = r12.mVerticalBias
                int r13 = r0.mStartIndex
                if (r13 != 0) goto L_0x02a0
                androidx.constraintlayout.core.widgets.Flow r13 = androidx.constraintlayout.core.widgets.Flow.this
                int r13 = r13.mFirstVerticalStyle
                if (r13 == r5) goto L_0x02a0
                androidx.constraintlayout.core.widgets.Flow r11 = androidx.constraintlayout.core.widgets.Flow.this
                int r11 = r11.mFirstVerticalStyle
                androidx.constraintlayout.core.widgets.Flow r12 = androidx.constraintlayout.core.widgets.Flow.this
                float r12 = r12.mFirstVerticalBias
                goto L_0x02b6
            L_0x02a0:
                if (r19 == 0) goto L_0x02b6
                androidx.constraintlayout.core.widgets.Flow r13 = androidx.constraintlayout.core.widgets.Flow.this
                int r13 = r13.mLastVerticalStyle
                if (r13 == r5) goto L_0x02b6
                androidx.constraintlayout.core.widgets.Flow r11 = androidx.constraintlayout.core.widgets.Flow.this
                int r11 = r11.mLastVerticalStyle
                androidx.constraintlayout.core.widgets.Flow r12 = androidx.constraintlayout.core.widgets.Flow.this
                float r12 = r12.mLastVerticalBias
            L_0x02b6:
                r10.setVerticalChainStyle(r11)
                r10.setVerticalBiasPercent(r12)
            L_0x02bc:
                int r11 = r1 + -1
                if (r9 != r11) goto L_0x02c9
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r10.mBottom
                androidx.constraintlayout.core.widgets.ConstraintAnchor r12 = r0.mBottom
                int r13 = r0.mPaddingBottom
                r10.connect((androidx.constraintlayout.core.widgets.ConstraintAnchor) r11, (androidx.constraintlayout.core.widgets.ConstraintAnchor) r12, (int) r13)
            L_0x02c9:
                if (r6 == 0) goto L_0x02f4
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r10.mTop
                androidx.constraintlayout.core.widgets.ConstraintAnchor r12 = r6.mBottom
                androidx.constraintlayout.core.widgets.Flow r13 = androidx.constraintlayout.core.widgets.Flow.this
                int r13 = r13.mVerticalGap
                r11.connect(r12, r13)
                if (r9 != r7) goto L_0x02e1
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r10.mTop
                int r12 = r0.mPaddingTop
                r11.setGoneMargin(r12)
            L_0x02e1:
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r6.mBottom
                androidx.constraintlayout.core.widgets.ConstraintAnchor r12 = r10.mTop
                r11.connect(r12, r2)
                r11 = 1
                int r12 = r8 + 1
                if (r9 != r12) goto L_0x02f4
                androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r6.mBottom
                int r11 = r0.mPaddingBottom
                r6.setGoneMargin(r11)
            L_0x02f4:
                if (r10 == r3) goto L_0x034b
                r6 = 2
                androidx.constraintlayout.core.widgets.Flow r11 = androidx.constraintlayout.core.widgets.Flow.this
                int r11 = r11.mHorizontalAlign
                if (r17 == 0) goto L_0x031c
                if (r11 == 0) goto L_0x0314
                r12 = 1
                if (r11 == r12) goto L_0x030f
                if (r11 == r6) goto L_0x0307
                goto L_0x034b
            L_0x0307:
                androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r10.mLeft
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r3.mLeft
                r6.connect(r11, r2)
                goto L_0x0314
            L_0x030f:
                androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r10.mLeft
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r3.mLeft
                goto L_0x0318
            L_0x0314:
                androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r10.mRight
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r3.mRight
            L_0x0318:
                r6.connect(r11, r2)
                goto L_0x034b
            L_0x031c:
                r12 = 1
                if (r11 == 0) goto L_0x0343
                if (r11 == r12) goto L_0x033e
                if (r11 == r6) goto L_0x0324
                goto L_0x034c
            L_0x0324:
                androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r10.mLeft
                if (r4 == 0) goto L_0x0339
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r0.mLeft
                int r13 = r0.mPaddingLeft
                r6.connect(r11, r13)
                androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r10.mRight
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r0.mRight
                int r13 = r0.mPaddingRight
                r6.connect(r11, r13)
                goto L_0x034c
            L_0x0339:
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r3.mLeft
                r6.connect(r11, r2)
            L_0x033e:
                androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r10.mRight
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r3.mRight
                goto L_0x0347
            L_0x0343:
                androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r10.mLeft
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r3.mLeft
            L_0x0347:
                r6.connect(r11, r2)
                goto L_0x034c
            L_0x034b:
                r12 = 1
            L_0x034c:
                r6 = r10
            L_0x034d:
                int r9 = r9 + 1
                goto L_0x0251
            L_0x0351:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.Flow.WidgetsList.createConstraints(boolean, int, boolean):void");
        }

        public int getHeight() {
            return this.mOrientation == 1 ? this.mHeight - Flow.this.mVerticalGap : this.mHeight;
        }

        public int getWidth() {
            return this.mOrientation == 0 ? this.mWidth - Flow.this.mHorizontalGap : this.mWidth;
        }

        public void measureMatchConstraints(int i) {
            int i2;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour;
            int i3;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2;
            Flow flow;
            int i4 = this.mNbMatchConstraintsWidgets;
            if (i4 != 0) {
                int i5 = this.mCount;
                int i6 = i / i4;
                int i7 = 0;
                while (i7 < i5 && this.mStartIndex + i7 < Flow.this.mDisplayedWidgetsCount) {
                    ConstraintWidget constraintWidget = Flow.this.mDisplayedWidgets[this.mStartIndex + i7];
                    if (this.mOrientation == 0) {
                        if (constraintWidget != null && constraintWidget.getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.mMatchConstraintDefaultWidth == 0) {
                            flow = Flow.this;
                            dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.FIXED;
                            dimensionBehaviour = constraintWidget.getVerticalDimensionBehaviour();
                            i2 = constraintWidget.getHeight();
                            i3 = i6;
                        }
                        i7++;
                    } else {
                        if (constraintWidget != null && constraintWidget.getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.mMatchConstraintDefaultHeight == 0) {
                            flow = Flow.this;
                            dimensionBehaviour2 = constraintWidget.getHorizontalDimensionBehaviour();
                            i3 = constraintWidget.getWidth();
                            dimensionBehaviour = ConstraintWidget.DimensionBehaviour.FIXED;
                            i2 = i6;
                        }
                        i7++;
                    }
                    flow.measure(constraintWidget, dimensionBehaviour2, i3, dimensionBehaviour, i2);
                    i7++;
                }
                recomputeDimensions();
            }
        }

        public void setStartIndex(int i) {
            this.mStartIndex = i;
        }

        public void setup(int i, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, ConstraintAnchor constraintAnchor3, ConstraintAnchor constraintAnchor4, int i2, int i3, int i4, int i5, int i6) {
            this.mOrientation = i;
            this.mLeft = constraintAnchor;
            this.mTop = constraintAnchor2;
            this.mRight = constraintAnchor3;
            this.mBottom = constraintAnchor4;
            this.mPaddingLeft = i2;
            this.mPaddingTop = i3;
            this.mPaddingRight = i4;
            this.mPaddingBottom = i5;
            this.mMax = i6;
        }
    }

    private void createAlignedConstraints(boolean z) {
        ConstraintWidget constraintWidget;
        float f;
        int i;
        if (this.mAlignedDimensions != null && this.mAlignedBiggestElementsInCols != null && this.mAlignedBiggestElementsInRows != null) {
            for (int i2 = 0; i2 < this.mDisplayedWidgetsCount; i2++) {
                this.mDisplayedWidgets[i2].resetAnchors();
            }
            int[] iArr = this.mAlignedDimensions;
            int i3 = iArr[0];
            int i4 = iArr[1];
            ConstraintWidget constraintWidget2 = null;
            float f2 = this.mHorizontalBias;
            int i5 = 0;
            while (i5 < i3) {
                if (z) {
                    i = (i3 - i5) - 1;
                    f = 1.0f - this.mHorizontalBias;
                } else {
                    f = f2;
                    i = i5;
                }
                ConstraintWidget constraintWidget3 = this.mAlignedBiggestElementsInCols[i];
                if (!(constraintWidget3 == null || constraintWidget3.getVisibility() == 8)) {
                    if (i5 == 0) {
                        constraintWidget3.connect(constraintWidget3.mLeft, this.mLeft, getPaddingLeft());
                        constraintWidget3.setHorizontalChainStyle(this.mHorizontalStyle);
                        constraintWidget3.setHorizontalBiasPercent(f);
                    }
                    if (i5 == i3 - 1) {
                        constraintWidget3.connect(constraintWidget3.mRight, this.mRight, getPaddingRight());
                    }
                    if (i5 > 0 && constraintWidget2 != null) {
                        constraintWidget3.connect(constraintWidget3.mLeft, constraintWidget2.mRight, this.mHorizontalGap);
                        constraintWidget2.connect(constraintWidget2.mRight, constraintWidget3.mLeft, 0);
                    }
                    constraintWidget2 = constraintWidget3;
                }
                i5++;
                f2 = f;
            }
            for (int i6 = 0; i6 < i4; i6++) {
                ConstraintWidget constraintWidget4 = this.mAlignedBiggestElementsInRows[i6];
                if (!(constraintWidget4 == null || constraintWidget4.getVisibility() == 8)) {
                    if (i6 == 0) {
                        constraintWidget4.connect(constraintWidget4.mTop, this.mTop, getPaddingTop());
                        constraintWidget4.setVerticalChainStyle(this.mVerticalStyle);
                        constraintWidget4.setVerticalBiasPercent(this.mVerticalBias);
                    }
                    if (i6 == i4 - 1) {
                        constraintWidget4.connect(constraintWidget4.mBottom, this.mBottom, getPaddingBottom());
                    }
                    if (i6 > 0 && constraintWidget2 != null) {
                        constraintWidget4.connect(constraintWidget4.mTop, constraintWidget2.mBottom, this.mVerticalGap);
                        constraintWidget2.connect(constraintWidget2.mBottom, constraintWidget4.mTop, 0);
                    }
                    constraintWidget2 = constraintWidget4;
                }
            }
            for (int i7 = 0; i7 < i3; i7++) {
                for (int i8 = 0; i8 < i4; i8++) {
                    int i9 = (i8 * i3) + i7;
                    if (this.mOrientation == 1) {
                        i9 = (i7 * i4) + i8;
                    }
                    ConstraintWidget[] constraintWidgetArr = this.mDisplayedWidgets;
                    if (!(i9 >= constraintWidgetArr.length || (constraintWidget = constraintWidgetArr[i9]) == null || constraintWidget.getVisibility() == 8)) {
                        ConstraintWidget constraintWidget5 = this.mAlignedBiggestElementsInCols[i7];
                        ConstraintWidget constraintWidget6 = this.mAlignedBiggestElementsInRows[i8];
                        if (constraintWidget != constraintWidget5) {
                            constraintWidget.connect(constraintWidget.mLeft, constraintWidget5.mLeft, 0);
                            constraintWidget.connect(constraintWidget.mRight, constraintWidget5.mRight, 0);
                        }
                        if (constraintWidget != constraintWidget6) {
                            constraintWidget.connect(constraintWidget.mTop, constraintWidget6.mTop, 0);
                            constraintWidget.connect(constraintWidget.mBottom, constraintWidget6.mBottom, 0);
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public final int getWidgetHeight(ConstraintWidget constraintWidget, int i) {
        if (constraintWidget == null) {
            return 0;
        }
        if (constraintWidget.getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            int i2 = constraintWidget.mMatchConstraintDefaultHeight;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (constraintWidget.mMatchConstraintPercentHeight * ((float) i));
                if (i3 != constraintWidget.getHeight()) {
                    constraintWidget.setMeasureRequested(true);
                    measure(constraintWidget, constraintWidget.getHorizontalDimensionBehaviour(), constraintWidget.getWidth(), ConstraintWidget.DimensionBehaviour.FIXED, i3);
                }
                return i3;
            } else if (i2 == 1) {
                return constraintWidget.getHeight();
            } else {
                if (i2 == 3) {
                    return (int) ((((float) constraintWidget.getWidth()) * constraintWidget.mDimensionRatio) + 0.5f);
                }
            }
        }
        return constraintWidget.getHeight();
    }

    /* access modifiers changed from: private */
    public final int getWidgetWidth(ConstraintWidget constraintWidget, int i) {
        if (constraintWidget == null) {
            return 0;
        }
        if (constraintWidget.getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            int i2 = constraintWidget.mMatchConstraintDefaultWidth;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (constraintWidget.mMatchConstraintPercentWidth * ((float) i));
                if (i3 != constraintWidget.getWidth()) {
                    constraintWidget.setMeasureRequested(true);
                    measure(constraintWidget, ConstraintWidget.DimensionBehaviour.FIXED, i3, constraintWidget.getVerticalDimensionBehaviour(), constraintWidget.getHeight());
                }
                return i3;
            } else if (i2 == 1) {
                return constraintWidget.getWidth();
            } else {
                if (i2 == 3) {
                    return (int) ((((float) constraintWidget.getHeight()) * constraintWidget.mDimensionRatio) + 0.5f);
                }
            }
        }
        return constraintWidget.getWidth();
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0129 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0066  */
    private void measureAligned(androidx.constraintlayout.core.widgets.ConstraintWidget[] r17, int r18, int r19, int r20, int[] r21) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            r5 = 0
            int r6 = r0.mMaxElementsWrap
            if (r3 != 0) goto L_0x0030
            if (r6 > 0) goto L_0x002d
            r6 = 0
            r7 = 0
            r8 = 0
        L_0x0014:
            if (r7 >= r2) goto L_0x002d
            if (r7 <= 0) goto L_0x001b
            int r9 = r0.mHorizontalGap
            int r8 = r8 + r9
        L_0x001b:
            r9 = r1[r7]
            if (r9 != 0) goto L_0x0020
            goto L_0x002a
        L_0x0020:
            int r9 = r0.getWidgetWidth(r9, r4)
            int r8 = r8 + r9
            if (r8 <= r4) goto L_0x0028
            goto L_0x002d
        L_0x0028:
            int r6 = r6 + 1
        L_0x002a:
            int r7 = r7 + 1
            goto L_0x0014
        L_0x002d:
            r7 = r6
            r6 = 0
            goto L_0x004f
        L_0x0030:
            if (r6 > 0) goto L_0x004e
            r6 = 0
            r7 = 0
            r8 = 0
        L_0x0035:
            if (r7 >= r2) goto L_0x004e
            if (r7 <= 0) goto L_0x003c
            int r9 = r0.mVerticalGap
            int r8 = r8 + r9
        L_0x003c:
            r9 = r1[r7]
            if (r9 != 0) goto L_0x0041
            goto L_0x004b
        L_0x0041:
            int r9 = r0.getWidgetHeight(r9, r4)
            int r8 = r8 + r9
            if (r8 <= r4) goto L_0x0049
            goto L_0x004e
        L_0x0049:
            int r6 = r6 + 1
        L_0x004b:
            int r7 = r7 + 1
            goto L_0x0035
        L_0x004e:
            r7 = 0
        L_0x004f:
            int[] r8 = r0.mAlignedDimensions
            if (r8 != 0) goto L_0x0058
            r8 = 2
            int[] r8 = new int[r8]
            r0.mAlignedDimensions = r8
        L_0x0058:
            r8 = 1
            if (r6 != 0) goto L_0x005d
            if (r3 == r8) goto L_0x0061
        L_0x005d:
            if (r7 != 0) goto L_0x0063
            if (r3 != 0) goto L_0x0063
        L_0x0061:
            r9 = 1
            goto L_0x0064
        L_0x0063:
            r9 = 0
        L_0x0064:
            if (r9 != 0) goto L_0x0129
            if (r3 != 0) goto L_0x0072
            float r6 = (float) r2
            float r10 = (float) r7
            float r6 = r6 / r10
            double r10 = (double) r6
            double r10 = java.lang.Math.ceil(r10)
            int r6 = (int) r10
            goto L_0x007b
        L_0x0072:
            float r7 = (float) r2
            float r10 = (float) r6
            float r7 = r7 / r10
            double r10 = (double) r7
            double r10 = java.lang.Math.ceil(r10)
            int r7 = (int) r10
        L_0x007b:
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r10 = r0.mAlignedBiggestElementsInCols
            r11 = 0
            if (r10 == 0) goto L_0x0088
            int r12 = r10.length
            if (r12 >= r7) goto L_0x0084
            goto L_0x0088
        L_0x0084:
            java.util.Arrays.fill(r10, r11)
            goto L_0x008c
        L_0x0088:
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r10 = new androidx.constraintlayout.core.widgets.ConstraintWidget[r7]
            r0.mAlignedBiggestElementsInCols = r10
        L_0x008c:
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r10 = r0.mAlignedBiggestElementsInRows
            if (r10 == 0) goto L_0x0098
            int r12 = r10.length
            if (r12 >= r6) goto L_0x0094
            goto L_0x0098
        L_0x0094:
            java.util.Arrays.fill(r10, r11)
            goto L_0x009c
        L_0x0098:
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r10 = new androidx.constraintlayout.core.widgets.ConstraintWidget[r6]
            r0.mAlignedBiggestElementsInRows = r10
        L_0x009c:
            r10 = 0
        L_0x009d:
            if (r10 >= r7) goto L_0x00e5
            r11 = 0
        L_0x00a0:
            if (r11 >= r6) goto L_0x00e2
            int r12 = r11 * r7
            int r12 = r12 + r10
            if (r3 != r8) goto L_0x00aa
            int r12 = r10 * r6
            int r12 = r12 + r11
        L_0x00aa:
            int r13 = r1.length
            if (r12 < r13) goto L_0x00ae
            goto L_0x00df
        L_0x00ae:
            r12 = r1[r12]
            if (r12 != 0) goto L_0x00b3
            goto L_0x00df
        L_0x00b3:
            int r13 = r0.getWidgetWidth(r12, r4)
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r14 = r0.mAlignedBiggestElementsInCols
            r15 = r14[r10]
            if (r15 == 0) goto L_0x00c5
            r14 = r14[r10]
            int r14 = r14.getWidth()
            if (r14 >= r13) goto L_0x00c9
        L_0x00c5:
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r13 = r0.mAlignedBiggestElementsInCols
            r13[r10] = r12
        L_0x00c9:
            int r13 = r0.getWidgetHeight(r12, r4)
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r14 = r0.mAlignedBiggestElementsInRows
            r15 = r14[r11]
            if (r15 == 0) goto L_0x00db
            r14 = r14[r11]
            int r14 = r14.getHeight()
            if (r14 >= r13) goto L_0x00df
        L_0x00db:
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r13 = r0.mAlignedBiggestElementsInRows
            r13[r11] = r12
        L_0x00df:
            int r11 = r11 + 1
            goto L_0x00a0
        L_0x00e2:
            int r10 = r10 + 1
            goto L_0x009d
        L_0x00e5:
            r10 = 0
            r11 = 0
        L_0x00e7:
            if (r10 >= r7) goto L_0x00fc
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r12 = r0.mAlignedBiggestElementsInCols
            r12 = r12[r10]
            if (r12 == 0) goto L_0x00f9
            if (r10 <= 0) goto L_0x00f4
            int r13 = r0.mHorizontalGap
            int r11 = r11 + r13
        L_0x00f4:
            int r12 = r0.getWidgetWidth(r12, r4)
            int r11 = r11 + r12
        L_0x00f9:
            int r10 = r10 + 1
            goto L_0x00e7
        L_0x00fc:
            r10 = 0
            r12 = 0
        L_0x00fe:
            if (r10 >= r6) goto L_0x0113
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r13 = r0.mAlignedBiggestElementsInRows
            r13 = r13[r10]
            if (r13 == 0) goto L_0x0110
            if (r10 <= 0) goto L_0x010b
            int r14 = r0.mVerticalGap
            int r12 = r12 + r14
        L_0x010b:
            int r13 = r0.getWidgetHeight(r13, r4)
            int r12 = r12 + r13
        L_0x0110:
            int r10 = r10 + 1
            goto L_0x00fe
        L_0x0113:
            r21[r5] = r11
            r21[r8] = r12
            if (r3 != 0) goto L_0x0121
            if (r11 <= r4) goto L_0x0061
            if (r7 <= r8) goto L_0x0061
            int r7 = r7 + -1
            goto L_0x0064
        L_0x0121:
            if (r12 <= r4) goto L_0x0061
            if (r6 <= r8) goto L_0x0061
            int r6 = r6 + -1
            goto L_0x0064
        L_0x0129:
            int[] r1 = r0.mAlignedDimensions
            r1[r5] = r7
            r1[r8] = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.Flow.measureAligned(androidx.constraintlayout.core.widgets.ConstraintWidget[], int, int, int, int[]):void");
    }

    private void measureChainWrap(ConstraintWidget[] constraintWidgetArr, int i, int i2, int i3, int[] iArr) {
        ConstraintAnchor constraintAnchor;
        int i4;
        int i5;
        int i6;
        ConstraintAnchor constraintAnchor2;
        int i7;
        int i8;
        int i9;
        int i10 = i;
        int i11 = i3;
        if (i10 != 0) {
            this.mChainList.clear();
            WidgetsList widgetsList = new WidgetsList(i2, this.mLeft, this.mTop, this.mRight, this.mBottom, i3);
            this.mChainList.add(widgetsList);
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            if (i2 == 0) {
                while (i14 < i10) {
                    ConstraintWidget constraintWidget = constraintWidgetArr[i14];
                    int widgetWidth = getWidgetWidth(constraintWidget, i11);
                    if (constraintWidget.getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        i12++;
                    }
                    int i15 = i12;
                    boolean z = (i13 == i11 || (this.mHorizontalGap + i13) + widgetWidth > i11) && widgetsList.biggest != null;
                    if (!z && i14 > 0 && (i9 = this.mMaxElementsWrap) > 0 && i14 % i9 == 0) {
                        z = true;
                    }
                    if (z) {
                        widgetsList = new WidgetsList(i2, this.mLeft, this.mTop, this.mRight, this.mBottom, i3);
                        widgetsList.setStartIndex(i14);
                        this.mChainList.add(widgetsList);
                    } else if (i14 > 0) {
                        i13 += this.mHorizontalGap + widgetWidth;
                        widgetsList.add(constraintWidget);
                        i14++;
                        i12 = i15;
                    }
                    i13 = widgetWidth;
                    widgetsList.add(constraintWidget);
                    i14++;
                    i12 = i15;
                }
            } else {
                while (i14 < i10) {
                    ConstraintWidget constraintWidget2 = constraintWidgetArr[i14];
                    int widgetHeight = getWidgetHeight(constraintWidget2, i11);
                    if (constraintWidget2.getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        i12++;
                    }
                    int i16 = i12;
                    boolean z2 = (i13 == i11 || (this.mVerticalGap + i13) + widgetHeight > i11) && widgetsList.biggest != null;
                    if (!z2 && i14 > 0 && (i8 = this.mMaxElementsWrap) > 0 && i14 % i8 == 0) {
                        z2 = true;
                    }
                    if (z2) {
                        widgetsList = new WidgetsList(i2, this.mLeft, this.mTop, this.mRight, this.mBottom, i3);
                        widgetsList.setStartIndex(i14);
                        this.mChainList.add(widgetsList);
                    } else if (i14 > 0) {
                        i7 = i13 + this.mVerticalGap + widgetHeight;
                        widgetsList.add(constraintWidget2);
                        i14++;
                        i12 = i16;
                    }
                    i7 = widgetHeight;
                    widgetsList.add(constraintWidget2);
                    i14++;
                    i12 = i16;
                }
            }
            int size = this.mChainList.size();
            ConstraintAnchor constraintAnchor3 = this.mLeft;
            ConstraintAnchor constraintAnchor4 = this.mTop;
            ConstraintAnchor constraintAnchor5 = this.mRight;
            ConstraintAnchor constraintAnchor6 = this.mBottom;
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int paddingRight = getPaddingRight();
            int paddingBottom = getPaddingBottom();
            ConstraintWidget.DimensionBehaviour horizontalDimensionBehaviour = getHorizontalDimensionBehaviour();
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            boolean z3 = horizontalDimensionBehaviour == dimensionBehaviour || getVerticalDimensionBehaviour() == dimensionBehaviour;
            if (i12 > 0 && z3) {
                for (int i17 = 0; i17 < size; i17++) {
                    WidgetsList widgetsList2 = this.mChainList.get(i17);
                    widgetsList2.measureMatchConstraints(i11 - (i2 == 0 ? widgetsList2.getWidth() : widgetsList2.getHeight()));
                }
            }
            int i18 = paddingTop;
            int i19 = paddingRight;
            int i20 = 0;
            int i21 = 0;
            int i22 = 0;
            int i23 = paddingLeft;
            ConstraintAnchor constraintAnchor7 = constraintAnchor4;
            ConstraintAnchor constraintAnchor8 = constraintAnchor3;
            int i24 = paddingBottom;
            while (i22 < size) {
                WidgetsList widgetsList3 = this.mChainList.get(i22);
                if (i2 == 0) {
                    if (i22 < size - 1) {
                        constraintAnchor2 = this.mChainList.get(i22 + 1).biggest.mTop;
                        i6 = 0;
                    } else {
                        constraintAnchor2 = this.mBottom;
                        i6 = getPaddingBottom();
                    }
                    ConstraintAnchor constraintAnchor9 = widgetsList3.biggest.mBottom;
                    ConstraintAnchor constraintAnchor10 = constraintAnchor8;
                    ConstraintAnchor constraintAnchor11 = constraintAnchor8;
                    int i25 = i20;
                    ConstraintAnchor constraintAnchor12 = constraintAnchor7;
                    int i26 = i21;
                    ConstraintAnchor constraintAnchor13 = constraintAnchor5;
                    ConstraintAnchor constraintAnchor14 = constraintAnchor5;
                    i4 = i22;
                    widgetsList3.setup(i2, constraintAnchor10, constraintAnchor12, constraintAnchor13, constraintAnchor2, i23, i18, i19, i6, i3);
                    int max = Math.max(i26, widgetsList3.getWidth());
                    i20 = i25 + widgetsList3.getHeight();
                    if (i4 > 0) {
                        i20 += this.mVerticalGap;
                    }
                    constraintAnchor8 = constraintAnchor11;
                    i21 = max;
                    constraintAnchor7 = constraintAnchor9;
                    i18 = 0;
                    constraintAnchor = constraintAnchor14;
                    int i27 = i6;
                    constraintAnchor6 = constraintAnchor2;
                    i24 = i27;
                } else {
                    ConstraintAnchor constraintAnchor15 = constraintAnchor8;
                    int i28 = i20;
                    int i29 = i21;
                    i4 = i22;
                    if (i4 < size - 1) {
                        constraintAnchor = this.mChainList.get(i4 + 1).biggest.mLeft;
                        i5 = 0;
                    } else {
                        constraintAnchor = this.mRight;
                        i5 = getPaddingRight();
                    }
                    ConstraintAnchor constraintAnchor16 = widgetsList3.biggest.mRight;
                    widgetsList3.setup(i2, constraintAnchor15, constraintAnchor7, constraintAnchor, constraintAnchor6, i23, i18, i5, i24, i3);
                    i21 = i29 + widgetsList3.getWidth();
                    int max2 = Math.max(i28, widgetsList3.getHeight());
                    if (i4 > 0) {
                        i21 += this.mHorizontalGap;
                    }
                    i20 = max2;
                    i19 = i5;
                    constraintAnchor8 = constraintAnchor16;
                    i23 = 0;
                }
                i22 = i4 + 1;
                int i30 = i3;
                constraintAnchor5 = constraintAnchor;
            }
            iArr[0] = i21;
            iArr[1] = i20;
        }
    }

    private void measureChainWrap_new(ConstraintWidget[] constraintWidgetArr, int i, int i2, int i3, int[] iArr) {
        ConstraintAnchor constraintAnchor;
        int i4;
        int i5;
        int i6;
        ConstraintAnchor constraintAnchor2;
        int i7;
        int i8;
        int i9;
        int i10 = i;
        int i11 = i3;
        if (i10 != 0) {
            this.mChainList.clear();
            WidgetsList widgetsList = new WidgetsList(i2, this.mLeft, this.mTop, this.mRight, this.mBottom, i3);
            this.mChainList.add(widgetsList);
            int i12 = 0;
            int i13 = 0;
            if (i2 == 0) {
                int i14 = 0;
                int i15 = 0;
                while (i15 < i10) {
                    int i16 = i12 + 1;
                    ConstraintWidget constraintWidget = constraintWidgetArr[i15];
                    int widgetWidth = getWidgetWidth(constraintWidget, i11);
                    if (constraintWidget.getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        i13++;
                    }
                    int i17 = i13;
                    boolean z = (i14 == i11 || (this.mHorizontalGap + i14) + widgetWidth > i11) && widgetsList.biggest != null;
                    if (!z && i15 > 0 && (i9 = this.mMaxElementsWrap) > 0 && i16 > i9) {
                        z = true;
                    }
                    if (z) {
                        widgetsList = new WidgetsList(i2, this.mLeft, this.mTop, this.mRight, this.mBottom, i3);
                        widgetsList.setStartIndex(i15);
                        this.mChainList.add(widgetsList);
                        i12 = i16;
                        i14 = widgetWidth;
                    } else {
                        i14 = i15 > 0 ? i14 + this.mHorizontalGap + widgetWidth : widgetWidth;
                        i12 = 0;
                    }
                    widgetsList.add(constraintWidget);
                    i15++;
                    i13 = i17;
                }
            } else {
                int i18 = 0;
                while (i18 < i10) {
                    ConstraintWidget constraintWidget2 = constraintWidgetArr[i18];
                    int widgetHeight = getWidgetHeight(constraintWidget2, i11);
                    if (constraintWidget2.getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        i13++;
                    }
                    int i19 = i13;
                    boolean z2 = (i12 == i11 || (this.mVerticalGap + i12) + widgetHeight > i11) && widgetsList.biggest != null;
                    if (!z2 && i18 > 0 && (i8 = this.mMaxElementsWrap) > 0 && i8 < 0) {
                        z2 = true;
                    }
                    if (z2) {
                        widgetsList = new WidgetsList(i2, this.mLeft, this.mTop, this.mRight, this.mBottom, i3);
                        widgetsList.setStartIndex(i18);
                        this.mChainList.add(widgetsList);
                    } else if (i18 > 0) {
                        i7 = i12 + this.mVerticalGap + widgetHeight;
                        widgetsList.add(constraintWidget2);
                        i18++;
                        i13 = i19;
                    }
                    i7 = widgetHeight;
                    widgetsList.add(constraintWidget2);
                    i18++;
                    i13 = i19;
                }
            }
            int size = this.mChainList.size();
            ConstraintAnchor constraintAnchor3 = this.mLeft;
            ConstraintAnchor constraintAnchor4 = this.mTop;
            ConstraintAnchor constraintAnchor5 = this.mRight;
            ConstraintAnchor constraintAnchor6 = this.mBottom;
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int paddingRight = getPaddingRight();
            int paddingBottom = getPaddingBottom();
            ConstraintWidget.DimensionBehaviour horizontalDimensionBehaviour = getHorizontalDimensionBehaviour();
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            boolean z3 = horizontalDimensionBehaviour == dimensionBehaviour || getVerticalDimensionBehaviour() == dimensionBehaviour;
            if (i13 > 0 && z3) {
                for (int i20 = 0; i20 < size; i20++) {
                    WidgetsList widgetsList2 = this.mChainList.get(i20);
                    widgetsList2.measureMatchConstraints(i11 - (i2 == 0 ? widgetsList2.getWidth() : widgetsList2.getHeight()));
                }
            }
            int i21 = paddingTop;
            int i22 = paddingRight;
            int i23 = 0;
            int i24 = 0;
            int i25 = 0;
            int i26 = paddingLeft;
            ConstraintAnchor constraintAnchor7 = constraintAnchor4;
            ConstraintAnchor constraintAnchor8 = constraintAnchor3;
            int i27 = paddingBottom;
            while (i25 < size) {
                WidgetsList widgetsList3 = this.mChainList.get(i25);
                if (i2 == 0) {
                    if (i25 < size - 1) {
                        constraintAnchor2 = this.mChainList.get(i25 + 1).biggest.mTop;
                        i6 = 0;
                    } else {
                        constraintAnchor2 = this.mBottom;
                        i6 = getPaddingBottom();
                    }
                    ConstraintAnchor constraintAnchor9 = widgetsList3.biggest.mBottom;
                    ConstraintAnchor constraintAnchor10 = constraintAnchor8;
                    ConstraintAnchor constraintAnchor11 = constraintAnchor8;
                    int i28 = i23;
                    ConstraintAnchor constraintAnchor12 = constraintAnchor7;
                    int i29 = i24;
                    ConstraintAnchor constraintAnchor13 = constraintAnchor5;
                    ConstraintAnchor constraintAnchor14 = constraintAnchor5;
                    i4 = i25;
                    widgetsList3.setup(i2, constraintAnchor10, constraintAnchor12, constraintAnchor13, constraintAnchor2, i26, i21, i22, i6, i3);
                    int max = Math.max(i29, widgetsList3.getWidth());
                    i23 = i28 + widgetsList3.getHeight();
                    if (i4 > 0) {
                        i23 += this.mVerticalGap;
                    }
                    constraintAnchor8 = constraintAnchor11;
                    i24 = max;
                    constraintAnchor7 = constraintAnchor9;
                    i21 = 0;
                    constraintAnchor = constraintAnchor14;
                    int i30 = i6;
                    constraintAnchor6 = constraintAnchor2;
                    i27 = i30;
                } else {
                    ConstraintAnchor constraintAnchor15 = constraintAnchor8;
                    int i31 = i23;
                    int i32 = i24;
                    i4 = i25;
                    if (i4 < size - 1) {
                        constraintAnchor = this.mChainList.get(i4 + 1).biggest.mLeft;
                        i5 = 0;
                    } else {
                        constraintAnchor = this.mRight;
                        i5 = getPaddingRight();
                    }
                    ConstraintAnchor constraintAnchor16 = widgetsList3.biggest.mRight;
                    widgetsList3.setup(i2, constraintAnchor15, constraintAnchor7, constraintAnchor, constraintAnchor6, i26, i21, i5, i27, i3);
                    i24 = i32 + widgetsList3.getWidth();
                    int max2 = Math.max(i31, widgetsList3.getHeight());
                    if (i4 > 0) {
                        i24 += this.mHorizontalGap;
                    }
                    i23 = max2;
                    i22 = i5;
                    constraintAnchor8 = constraintAnchor16;
                    i26 = 0;
                }
                i25 = i4 + 1;
                int i33 = i3;
                constraintAnchor5 = constraintAnchor;
            }
            iArr[0] = i24;
            iArr[1] = i23;
        }
    }

    private void measureNoWrap(ConstraintWidget[] constraintWidgetArr, int i, int i2, int i3, int[] iArr) {
        WidgetsList widgetsList;
        int i4 = i;
        if (i4 != 0) {
            if (this.mChainList.size() == 0) {
                widgetsList = new WidgetsList(i2, this.mLeft, this.mTop, this.mRight, this.mBottom, i3);
                this.mChainList.add(widgetsList);
            } else {
                WidgetsList widgetsList2 = this.mChainList.get(0);
                widgetsList2.clear();
                widgetsList = widgetsList2;
                int i5 = i2;
                widgetsList.setup(i5, this.mLeft, this.mTop, this.mRight, this.mBottom, getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom(), i3);
            }
            for (int i6 = 0; i6 < i4; i6++) {
                widgetsList.add(constraintWidgetArr[i6]);
            }
            iArr[0] = widgetsList.getWidth();
            iArr[1] = widgetsList.getHeight();
        }
    }

    public void addToSolver(LinearSystem linearSystem, boolean z) {
        super.addToSolver(linearSystem, z);
        boolean z2 = getParent() != null && ((ConstraintWidgetContainer) getParent()).isRtl();
        int i = this.mWrapMode;
        if (i != 0) {
            if (i == 1) {
                int size = this.mChainList.size();
                int i2 = 0;
                while (i2 < size) {
                    this.mChainList.get(i2).createConstraints(z2, i2, i2 == size + -1);
                    i2++;
                }
            } else if (i == 2) {
                createAlignedConstraints(z2);
            } else if (i == 3) {
                int size2 = this.mChainList.size();
                int i3 = 0;
                while (i3 < size2) {
                    this.mChainList.get(i3).createConstraints(z2, i3, i3 == size2 + -1);
                    i3++;
                }
            }
        } else if (this.mChainList.size() > 0) {
            this.mChainList.get(0).createConstraints(z2, 0, true);
        }
        needsCallbackFromSolver(false);
    }

    public void copy(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> hashMap) {
        super.copy(constraintWidget, hashMap);
        Flow flow = (Flow) constraintWidget;
        this.mHorizontalStyle = flow.mHorizontalStyle;
        this.mVerticalStyle = flow.mVerticalStyle;
        this.mFirstHorizontalStyle = flow.mFirstHorizontalStyle;
        this.mFirstVerticalStyle = flow.mFirstVerticalStyle;
        this.mLastHorizontalStyle = flow.mLastHorizontalStyle;
        this.mLastVerticalStyle = flow.mLastVerticalStyle;
        this.mHorizontalBias = flow.mHorizontalBias;
        this.mVerticalBias = flow.mVerticalBias;
        this.mFirstHorizontalBias = flow.mFirstHorizontalBias;
        this.mFirstVerticalBias = flow.mFirstVerticalBias;
        this.mLastHorizontalBias = flow.mLastHorizontalBias;
        this.mLastVerticalBias = flow.mLastVerticalBias;
        this.mHorizontalGap = flow.mHorizontalGap;
        this.mVerticalGap = flow.mVerticalGap;
        this.mHorizontalAlign = flow.mHorizontalAlign;
        this.mVerticalAlign = flow.mVerticalAlign;
        this.mWrapMode = flow.mWrapMode;
        this.mMaxElementsWrap = flow.mMaxElementsWrap;
        this.mOrientation = flow.mOrientation;
    }

    public float getMaxElementsWrap() {
        return (float) this.mMaxElementsWrap;
    }

    /* JADX WARNING: type inference failed for: r11v2 */
    /* JADX WARNING: type inference failed for: r11v10 */
    /* JADX WARNING: type inference failed for: r11v19 */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0047, code lost:
        if (r6.mVerticalStyle == -1) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0052, code lost:
        if (r6.mVerticalStyle == -1) goto L_0x0054;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0112  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void measure(int r19, int r20, int r21, int r22) {
        /*
            r18 = this;
            r6 = r18
            r7 = r19
            r8 = r20
            r9 = r21
            r10 = r22
            int r0 = r6.mWidgetsCount
            r11 = 0
            if (r0 <= 0) goto L_0x001c
            boolean r0 = r18.measureChildren()
            if (r0 != 0) goto L_0x001c
            r6.setMeasure(r11, r11)
            r6.needsCallbackFromSolver(r11)
            return
        L_0x001c:
            int r12 = r18.getPaddingLeft()
            int r13 = r18.getPaddingRight()
            int r14 = r18.getPaddingTop()
            int r15 = r18.getPaddingBottom()
            r0 = 2
            int[] r5 = new int[r0]
            int r1 = r8 - r12
            int r1 = r1 - r13
            int r2 = r6.mOrientation
            r4 = 1
            if (r2 != r4) goto L_0x003a
            int r1 = r10 - r14
            int r1 = r1 - r15
        L_0x003a:
            r16 = r1
            r1 = -1
            if (r2 != 0) goto L_0x004a
            int r2 = r6.mHorizontalStyle
            if (r2 != r1) goto L_0x0045
            r6.mHorizontalStyle = r11
        L_0x0045:
            int r2 = r6.mVerticalStyle
            if (r2 != r1) goto L_0x0056
            goto L_0x0054
        L_0x004a:
            int r2 = r6.mHorizontalStyle
            if (r2 != r1) goto L_0x0050
            r6.mHorizontalStyle = r11
        L_0x0050:
            int r2 = r6.mVerticalStyle
            if (r2 != r1) goto L_0x0056
        L_0x0054:
            r6.mVerticalStyle = r11
        L_0x0056:
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r1 = r6.mWidgets
            r2 = 0
            r3 = 0
        L_0x005a:
            int r11 = r6.mWidgetsCount
            r0 = 8
            if (r2 >= r11) goto L_0x0070
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r11 = r6.mWidgets
            r11 = r11[r2]
            int r11 = r11.getVisibility()
            if (r11 != r0) goto L_0x006c
            int r3 = r3 + 1
        L_0x006c:
            int r2 = r2 + 1
            r0 = 2
            goto L_0x005a
        L_0x0070:
            if (r3 <= 0) goto L_0x008f
            int r11 = r11 - r3
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r1 = new androidx.constraintlayout.core.widgets.ConstraintWidget[r11]
            r2 = 0
            r3 = 0
        L_0x0077:
            int r11 = r6.mWidgetsCount
            if (r2 >= r11) goto L_0x008d
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r11 = r6.mWidgets
            r11 = r11[r2]
            int r4 = r11.getVisibility()
            if (r4 == r0) goto L_0x0089
            r1[r3] = r11
            int r3 = r3 + 1
        L_0x0089:
            int r2 = r2 + 1
            r4 = 1
            goto L_0x0077
        L_0x008d:
            r2 = r3
            goto L_0x0090
        L_0x008f:
            r2 = r11
        L_0x0090:
            r6.mDisplayedWidgets = r1
            r6.mDisplayedWidgetsCount = r2
            int r0 = r6.mWrapMode
            if (r0 == 0) goto L_0x00cd
            r4 = 1
            if (r0 == r4) goto L_0x00c0
            r3 = 2
            if (r0 == r3) goto L_0x00b3
            r3 = 3
            if (r0 == r3) goto L_0x00a6
            r17 = r5
            r0 = 0
            r11 = 1
            goto L_0x00da
        L_0x00a6:
            int r3 = r6.mOrientation
            r0 = r18
            r11 = 1
            r4 = r16
            r17 = r5
            r0.measureChainWrap_new(r1, r2, r3, r4, r5)
            goto L_0x00d9
        L_0x00b3:
            r17 = r5
            r11 = 1
            int r3 = r6.mOrientation
            r0 = r18
            r4 = r16
            r0.measureAligned(r1, r2, r3, r4, r5)
            goto L_0x00d9
        L_0x00c0:
            r17 = r5
            r11 = 1
            int r3 = r6.mOrientation
            r0 = r18
            r4 = r16
            r0.measureChainWrap(r1, r2, r3, r4, r5)
            goto L_0x00d9
        L_0x00cd:
            r17 = r5
            r11 = 1
            int r3 = r6.mOrientation
            r0 = r18
            r4 = r16
            r0.measureNoWrap(r1, r2, r3, r4, r5)
        L_0x00d9:
            r0 = 0
        L_0x00da:
            r1 = r17[r0]
            int r1 = r1 + r12
            int r1 = r1 + r13
            r2 = r17[r11]
            int r2 = r2 + r14
            int r2 = r2 + r15
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = 1073741824(0x40000000, float:2.0)
            if (r7 != r4) goto L_0x00ea
            r1 = r8
            goto L_0x00f5
        L_0x00ea:
            if (r7 != r3) goto L_0x00f1
            int r1 = java.lang.Math.min(r1, r8)
            goto L_0x00f5
        L_0x00f1:
            if (r7 != 0) goto L_0x00f4
            goto L_0x00f5
        L_0x00f4:
            r1 = 0
        L_0x00f5:
            if (r9 != r4) goto L_0x00f9
            r2 = r10
            goto L_0x0104
        L_0x00f9:
            if (r9 != r3) goto L_0x0100
            int r2 = java.lang.Math.min(r2, r10)
            goto L_0x0104
        L_0x0100:
            if (r9 != 0) goto L_0x0103
            goto L_0x0104
        L_0x0103:
            r2 = 0
        L_0x0104:
            r6.setMeasure(r1, r2)
            r6.setWidth(r1)
            r6.setHeight(r2)
            int r1 = r6.mWidgetsCount
            if (r1 <= 0) goto L_0x0112
            goto L_0x0113
        L_0x0112:
            r11 = 0
        L_0x0113:
            r6.needsCallbackFromSolver(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.Flow.measure(int, int, int, int):void");
    }

    public void setFirstHorizontalBias(float f) {
        this.mFirstHorizontalBias = f;
    }

    public void setFirstHorizontalStyle(int i) {
        this.mFirstHorizontalStyle = i;
    }

    public void setFirstVerticalBias(float f) {
        this.mFirstVerticalBias = f;
    }

    public void setFirstVerticalStyle(int i) {
        this.mFirstVerticalStyle = i;
    }

    public void setHorizontalAlign(int i) {
        this.mHorizontalAlign = i;
    }

    public void setHorizontalBias(float f) {
        this.mHorizontalBias = f;
    }

    public void setHorizontalGap(int i) {
        this.mHorizontalGap = i;
    }

    public void setHorizontalStyle(int i) {
        this.mHorizontalStyle = i;
    }

    public void setLastHorizontalBias(float f) {
        this.mLastHorizontalBias = f;
    }

    public void setLastHorizontalStyle(int i) {
        this.mLastHorizontalStyle = i;
    }

    public void setLastVerticalBias(float f) {
        this.mLastVerticalBias = f;
    }

    public void setLastVerticalStyle(int i) {
        this.mLastVerticalStyle = i;
    }

    public void setMaxElementsWrap(int i) {
        this.mMaxElementsWrap = i;
    }

    public void setOrientation(int i) {
        this.mOrientation = i;
    }

    public void setVerticalAlign(int i) {
        this.mVerticalAlign = i;
    }

    public void setVerticalBias(float f) {
        this.mVerticalBias = f;
    }

    public void setVerticalGap(int i) {
        this.mVerticalGap = i;
    }

    public void setVerticalStyle(int i) {
        this.mVerticalStyle = i;
    }

    public void setWrapMode(int i) {
        this.mWrapMode = i;
    }
}
