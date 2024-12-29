package androidx.constraintlayout.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.ActivityChooserView;
import androidx.constraintlayout.core.Metrics;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.Guideline;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.ViewCompat;
import com.miot.service.common.miotcloud.impl.MiotCloudImpl;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class ConstraintLayout extends ViewGroup {
    private static final boolean DEBUG = false;
    private static final boolean DEBUG_DRAW_CONSTRAINTS = false;
    public static final int DESIGN_INFO_ID = 0;
    private static final boolean MEASURE = false;
    private static final boolean OPTIMIZE_HEIGHT_CHANGE = false;
    private static final String TAG = "ConstraintLayout";
    private static final boolean USE_CONSTRAINTS_HELPER = true;
    public static final String VERSION = "ConstraintLayout-2.1.4";
    private static SharedValues sSharedValues;
    SparseArray<View> mChildrenByIds = new SparseArray<>();
    /* access modifiers changed from: private */
    public ArrayList<ConstraintHelper> mConstraintHelpers = new ArrayList<>(4);
    protected ConstraintLayoutStates mConstraintLayoutSpec = null;
    private ConstraintSet mConstraintSet = null;
    private int mConstraintSetId = -1;
    private ConstraintsChangedListener mConstraintsChangedListener;
    private HashMap<String, Integer> mDesignIds = new HashMap<>();
    protected boolean mDirtyHierarchy = true;
    private int mLastMeasureHeight = -1;
    int mLastMeasureHeightMode = 0;
    int mLastMeasureHeightSize = -1;
    private int mLastMeasureWidth = -1;
    int mLastMeasureWidthMode = 0;
    int mLastMeasureWidthSize = -1;
    /* access modifiers changed from: protected */
    public ConstraintWidgetContainer mLayoutWidget = new ConstraintWidgetContainer();
    private int mMaxHeight = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
    private int mMaxWidth = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
    Measurer mMeasurer = new Measurer(this);
    private Metrics mMetrics;
    private int mMinHeight = 0;
    private int mMinWidth = 0;
    private int mOnMeasureHeightMeasureSpec = 0;
    private int mOnMeasureWidthMeasureSpec = 0;
    /* access modifiers changed from: private */
    public int mOptimizationLevel = 257;
    private SparseArray<ConstraintWidget> mTempMapIdToWidget = new SparseArray<>();

    /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$1 */
    static /* synthetic */ class C02171 {

        /* renamed from: $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintWidget$DimensionBehaviour */
        static final /* synthetic */ int[] f75x6d00e4a2;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f75x6d00e4a2 = r0
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f75x6d00e4a2     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f75x6d00e4a2     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f75x6d00e4a2     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.C02171.<clinit>():void");
        }
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public static final int BASELINE = 5;
        public static final int BOTTOM = 4;
        public static final int CHAIN_PACKED = 2;
        public static final int CHAIN_SPREAD = 0;
        public static final int CHAIN_SPREAD_INSIDE = 1;
        public static final int CIRCLE = 8;
        public static final int END = 7;
        public static final int GONE_UNSET = Integer.MIN_VALUE;
        public static final int HORIZONTAL = 0;
        public static final int LEFT = 1;
        public static final int MATCH_CONSTRAINT = 0;
        public static final int MATCH_CONSTRAINT_PERCENT = 2;
        public static final int MATCH_CONSTRAINT_SPREAD = 0;
        public static final int MATCH_CONSTRAINT_WRAP = 1;
        public static final int PARENT_ID = 0;
        public static final int RIGHT = 2;
        public static final int START = 6;
        public static final int TOP = 3;
        public static final int UNSET = -1;
        public static final int VERTICAL = 1;
        public static final int WRAP_BEHAVIOR_HORIZONTAL_ONLY = 1;
        public static final int WRAP_BEHAVIOR_INCLUDED = 0;
        public static final int WRAP_BEHAVIOR_SKIPPED = 3;
        public static final int WRAP_BEHAVIOR_VERTICAL_ONLY = 2;
        public int baselineMargin = 0;
        public int baselineToBaseline = -1;
        public int baselineToBottom = -1;
        public int baselineToTop = -1;
        public int bottomToBottom = -1;
        public int bottomToTop = -1;
        public float circleAngle = 0.0f;
        public int circleConstraint = -1;
        public int circleRadius = 0;
        public boolean constrainedHeight = false;
        public boolean constrainedWidth = false;
        public String constraintTag = null;
        public String dimensionRatio = null;
        int dimensionRatioSide = 1;
        float dimensionRatioValue = 0.0f;
        public int editorAbsoluteX = -1;
        public int editorAbsoluteY = -1;
        public int endToEnd = -1;
        public int endToStart = -1;
        public int goneBaselineMargin = Integer.MIN_VALUE;
        public int goneBottomMargin = Integer.MIN_VALUE;
        public int goneEndMargin = Integer.MIN_VALUE;
        public int goneLeftMargin = Integer.MIN_VALUE;
        public int goneRightMargin = Integer.MIN_VALUE;
        public int goneStartMargin = Integer.MIN_VALUE;
        public int goneTopMargin = Integer.MIN_VALUE;
        public int guideBegin = -1;
        public int guideEnd = -1;
        public float guidePercent = -1.0f;
        public boolean guidelineUseRtl = true;
        boolean heightSet = true;
        public boolean helped = false;
        public float horizontalBias = 0.5f;
        public int horizontalChainStyle = 0;
        boolean horizontalDimensionFixed = true;
        public float horizontalWeight = -1.0f;
        boolean isGuideline = false;
        boolean isHelper = false;
        boolean isInPlaceholder = false;
        boolean isVirtualGroup = false;
        public int leftToLeft = -1;
        public int leftToRight = -1;
        public int matchConstraintDefaultHeight = 0;
        public int matchConstraintDefaultWidth = 0;
        public int matchConstraintMaxHeight = 0;
        public int matchConstraintMaxWidth = 0;
        public int matchConstraintMinHeight = 0;
        public int matchConstraintMinWidth = 0;
        public float matchConstraintPercentHeight = 1.0f;
        public float matchConstraintPercentWidth = 1.0f;
        boolean needsBaseline = false;
        public int orientation = -1;
        int resolveGoneLeftMargin = Integer.MIN_VALUE;
        int resolveGoneRightMargin = Integer.MIN_VALUE;
        int resolvedGuideBegin;
        int resolvedGuideEnd;
        float resolvedGuidePercent;
        float resolvedHorizontalBias = 0.5f;
        int resolvedLeftToLeft = -1;
        int resolvedLeftToRight = -1;
        int resolvedRightToLeft = -1;
        int resolvedRightToRight = -1;
        public int rightToLeft = -1;
        public int rightToRight = -1;
        public int startToEnd = -1;
        public int startToStart = -1;
        public int topToBottom = -1;
        public int topToTop = -1;
        public float verticalBias = 0.5f;
        public int verticalChainStyle = 0;
        boolean verticalDimensionFixed = true;
        public float verticalWeight = -1.0f;
        ConstraintWidget widget = new ConstraintWidget();
        boolean widthSet = true;
        public int wrapBehaviorInParent = 0;

        private static class Table {
            public static final int ANDROID_ORIENTATION = 1;
            public static final int GUIDELINE_USE_RTL = 67;
            public static final int LAYOUT_CONSTRAINED_HEIGHT = 28;
            public static final int LAYOUT_CONSTRAINED_WIDTH = 27;
            public static final int LAYOUT_CONSTRAINT_BASELINE_CREATOR = 43;
            public static final int LAYOUT_CONSTRAINT_BASELINE_TO_BASELINE_OF = 16;
            public static final int LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF = 53;
            public static final int LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF = 52;
            public static final int LAYOUT_CONSTRAINT_BOTTOM_CREATOR = 42;
            public static final int LAYOUT_CONSTRAINT_BOTTOM_TO_BOTTOM_OF = 15;
            public static final int LAYOUT_CONSTRAINT_BOTTOM_TO_TOP_OF = 14;
            public static final int LAYOUT_CONSTRAINT_CIRCLE = 2;
            public static final int LAYOUT_CONSTRAINT_CIRCLE_ANGLE = 4;
            public static final int LAYOUT_CONSTRAINT_CIRCLE_RADIUS = 3;
            public static final int LAYOUT_CONSTRAINT_DIMENSION_RATIO = 44;
            public static final int LAYOUT_CONSTRAINT_END_TO_END_OF = 20;
            public static final int LAYOUT_CONSTRAINT_END_TO_START_OF = 19;
            public static final int LAYOUT_CONSTRAINT_GUIDE_BEGIN = 5;
            public static final int LAYOUT_CONSTRAINT_GUIDE_END = 6;
            public static final int LAYOUT_CONSTRAINT_GUIDE_PERCENT = 7;
            public static final int LAYOUT_CONSTRAINT_HEIGHT = 65;
            public static final int LAYOUT_CONSTRAINT_HEIGHT_DEFAULT = 32;
            public static final int LAYOUT_CONSTRAINT_HEIGHT_MAX = 37;
            public static final int LAYOUT_CONSTRAINT_HEIGHT_MIN = 36;
            public static final int LAYOUT_CONSTRAINT_HEIGHT_PERCENT = 38;
            public static final int LAYOUT_CONSTRAINT_HORIZONTAL_BIAS = 29;
            public static final int LAYOUT_CONSTRAINT_HORIZONTAL_CHAINSTYLE = 47;
            public static final int LAYOUT_CONSTRAINT_HORIZONTAL_WEIGHT = 45;
            public static final int LAYOUT_CONSTRAINT_LEFT_CREATOR = 39;
            public static final int LAYOUT_CONSTRAINT_LEFT_TO_LEFT_OF = 8;
            public static final int LAYOUT_CONSTRAINT_LEFT_TO_RIGHT_OF = 9;
            public static final int LAYOUT_CONSTRAINT_RIGHT_CREATOR = 41;
            public static final int LAYOUT_CONSTRAINT_RIGHT_TO_LEFT_OF = 10;
            public static final int LAYOUT_CONSTRAINT_RIGHT_TO_RIGHT_OF = 11;
            public static final int LAYOUT_CONSTRAINT_START_TO_END_OF = 17;
            public static final int LAYOUT_CONSTRAINT_START_TO_START_OF = 18;
            public static final int LAYOUT_CONSTRAINT_TAG = 51;
            public static final int LAYOUT_CONSTRAINT_TOP_CREATOR = 40;
            public static final int LAYOUT_CONSTRAINT_TOP_TO_BOTTOM_OF = 13;
            public static final int LAYOUT_CONSTRAINT_TOP_TO_TOP_OF = 12;
            public static final int LAYOUT_CONSTRAINT_VERTICAL_BIAS = 30;
            public static final int LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE = 48;
            public static final int LAYOUT_CONSTRAINT_VERTICAL_WEIGHT = 46;
            public static final int LAYOUT_CONSTRAINT_WIDTH = 64;
            public static final int LAYOUT_CONSTRAINT_WIDTH_DEFAULT = 31;
            public static final int LAYOUT_CONSTRAINT_WIDTH_MAX = 34;
            public static final int LAYOUT_CONSTRAINT_WIDTH_MIN = 33;
            public static final int LAYOUT_CONSTRAINT_WIDTH_PERCENT = 35;
            public static final int LAYOUT_EDITOR_ABSOLUTEX = 49;
            public static final int LAYOUT_EDITOR_ABSOLUTEY = 50;
            public static final int LAYOUT_GONE_MARGIN_BASELINE = 55;
            public static final int LAYOUT_GONE_MARGIN_BOTTOM = 24;
            public static final int LAYOUT_GONE_MARGIN_END = 26;
            public static final int LAYOUT_GONE_MARGIN_LEFT = 21;
            public static final int LAYOUT_GONE_MARGIN_RIGHT = 23;
            public static final int LAYOUT_GONE_MARGIN_START = 25;
            public static final int LAYOUT_GONE_MARGIN_TOP = 22;
            public static final int LAYOUT_MARGIN_BASELINE = 54;
            public static final int LAYOUT_WRAP_BEHAVIOR_IN_PARENT = 66;
            public static final int UNUSED = 0;
            public static final SparseIntArray map;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                map = sparseIntArray;
                sparseIntArray.append(C0218R.styleable.ConstraintLayout_Layout_layout_constraintWidth, 64);
                sparseIntArray.append(C0218R.styleable.ConstraintLayout_Layout_layout_constraintHeight, 65);
                sparseIntArray.append(C0218R.styleable.ConstraintLayout_Layout_layout_constraintLeft_toLeftOf, 8);
                sparseIntArray.append(C0218R.styleable.ConstraintLayout_Layout_layout_constraintLeft_toRightOf, 9);
                sparseIntArray.append(C0218R.styleable.ConstraintLayout_Layout_layout_constraintRight_toLeftOf, 10);
                sparseIntArray.append(C0218R.styleable.ConstraintLayout_Layout_layout_constraintRight_toRightOf, 11);
                sparseIntArray.append(C0218R.styleable.ConstraintLayout_Layout_layout_constraintTop_toTopOf, 12);
                sparseIntArray.append(C0218R.styleable.ConstraintLayout_Layout_layout_constraintTop_toBottomOf, 13);
                sparseIntArray.append(C0218R.styleable.ConstraintLayout_Layout_layout_constraintBottom_toTopOf, 14);
                sparseIntArray.append(C0218R.styleable.ConstraintLayout_Layout_layout_constraintBottom_toBottomOf, 15);
                sparseIntArray.append(C0218R.styleable.ConstraintLayout_Layout_layout_constraintBaseline_toBaselineOf, 16);
                sparseIntArray.append(C0218R.styleable.ConstraintLayout_Layout_layout_constraintBaseline_toTopOf, 52);
                sparseIntArray.append(C0218R.styleable.ConstraintLayout_Layout_layout_constraintBaseline_toBottomOf, 53);
                sparseIntArray.append(C0218R.styleable.ConstraintLayout_Layout_layout_constraintCircle, 2);
                sparseIntArray.append(C0218R.styleable.ConstraintLayout_Layout_layout_constraintCircleRadius, 3);
                sparseIntArray.append(C0218R.styleable.ConstraintLayout_Layout_layout_constraintCircleAngle, 4);
                sparseIntArray.append(C0218R.styleable.ConstraintLayout_Layout_layout_editor_absoluteX, 49);
                sparseIntArray.append(C0218R.styleable.ConstraintLayout_Layout_layout_editor_absoluteY, 50);
                sparseIntArray.append(C0218R.styleable.ConstraintLayout_Layout_layout_constraintGuide_begin, 5);
                sparseIntArray.append(C0218R.styleable.ConstraintLayout_Layout_layout_constraintGuide_end, 6);
                sparseIntArray.append(C0218R.styleable.ConstraintLayout_Layout_layout_constraintGuide_percent, 7);
                sparseIntArray.append(C0218R.styleable.ConstraintLayout_Layout_guidelineUseRtl, 67);
                sparseIntArray.append(C0218R.styleable.ConstraintLayout_Layout_android_orientation, 1);
                sparseIntArray.append(C0218R.styleable.ConstraintLayout_Layout_layout_constraintStart_toEndOf, 17);
                sparseIntArray.append(C0218R.styleable.ConstraintLayout_Layout_layout_constraintStart_toStartOf, 18);
                sparseIntArray.append(C0218R.styleable.ConstraintLayout_Layout_layout_constraintEnd_toStartOf, 19);
                sparseIntArray.append(C0218R.styleable.ConstraintLayout_Layout_layout_constraintEnd_toEndOf, 20);
                sparseIntArray.append(C0218R.styleable.ConstraintLayout_Layout_layout_goneMarginLeft, 21);
                sparseIntArray.append(C0218R.styleable.ConstraintLayout_Layout_layout_goneMarginTop, 22);
                sparseIntArray.append(C0218R.styleable.ConstraintLayout_Layout_layout_goneMarginRight, 23);
                sparseIntArray.append(C0218R.styleable.ConstraintLayout_Layout_layout_goneMarginBottom, 24);
                sparseIntArray.append(C0218R.styleable.ConstraintLayout_Layout_layout_goneMarginStart, 25);
                sparseIntArray.append(C0218R.styleable.ConstraintLayout_Layout_layout_goneMarginEnd, 26);
                sparseIntArray.append(C0218R.styleable.ConstraintLayout_Layout_layout_goneMarginBaseline, 55);
                sparseIntArray.append(C0218R.styleable.ConstraintLayout_Layout_layout_marginBaseline, 54);
                sparseIntArray.append(C0218R.styleable.ConstraintLayout_Layout_layout_constraintHorizontal_bias, 29);
                sparseIntArray.append(C0218R.styleable.ConstraintLayout_Layout_layout_constraintVertical_bias, 30);
                sparseIntArray.append(C0218R.styleable.ConstraintLayout_Layout_layout_constraintDimensionRatio, 44);
                sparseIntArray.append(C0218R.styleable.ConstraintLayout_Layout_layout_constraintHorizontal_weight, 45);
                sparseIntArray.append(C0218R.styleable.ConstraintLayout_Layout_layout_constraintVertical_weight, 46);
                sparseIntArray.append(C0218R.styleable.ConstraintLayout_Layout_layout_constraintHorizontal_chainStyle, 47);
                sparseIntArray.append(C0218R.styleable.ConstraintLayout_Layout_layout_constraintVertical_chainStyle, 48);
                sparseIntArray.append(C0218R.styleable.ConstraintLayout_Layout_layout_constrainedWidth, 27);
                sparseIntArray.append(C0218R.styleable.ConstraintLayout_Layout_layout_constrainedHeight, 28);
                sparseIntArray.append(C0218R.styleable.ConstraintLayout_Layout_layout_constraintWidth_default, 31);
                sparseIntArray.append(C0218R.styleable.ConstraintLayout_Layout_layout_constraintHeight_default, 32);
                sparseIntArray.append(C0218R.styleable.ConstraintLayout_Layout_layout_constraintWidth_min, 33);
                sparseIntArray.append(C0218R.styleable.ConstraintLayout_Layout_layout_constraintWidth_max, 34);
                sparseIntArray.append(C0218R.styleable.ConstraintLayout_Layout_layout_constraintWidth_percent, 35);
                sparseIntArray.append(C0218R.styleable.ConstraintLayout_Layout_layout_constraintHeight_min, 36);
                sparseIntArray.append(C0218R.styleable.ConstraintLayout_Layout_layout_constraintHeight_max, 37);
                sparseIntArray.append(C0218R.styleable.ConstraintLayout_Layout_layout_constraintHeight_percent, 38);
                sparseIntArray.append(C0218R.styleable.ConstraintLayout_Layout_layout_constraintLeft_creator, 39);
                sparseIntArray.append(C0218R.styleable.ConstraintLayout_Layout_layout_constraintTop_creator, 40);
                sparseIntArray.append(C0218R.styleable.ConstraintLayout_Layout_layout_constraintRight_creator, 41);
                sparseIntArray.append(C0218R.styleable.ConstraintLayout_Layout_layout_constraintBottom_creator, 42);
                sparseIntArray.append(C0218R.styleable.ConstraintLayout_Layout_layout_constraintBaseline_creator, 43);
                sparseIntArray.append(C0218R.styleable.ConstraintLayout_Layout_layout_constraintTag, 51);
                sparseIntArray.append(C0218R.styleable.ConstraintLayout_Layout_layout_wrapBehaviorInParent, 66);
            }

            private Table() {
            }
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0218R.styleable.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                int i2 = Table.map.get(index);
                switch (i2) {
                    case 1:
                        this.orientation = obtainStyledAttributes.getInt(index, this.orientation);
                        break;
                    case 2:
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.circleConstraint);
                        this.circleConstraint = resourceId;
                        if (resourceId != -1) {
                            break;
                        } else {
                            this.circleConstraint = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 3:
                        this.circleRadius = obtainStyledAttributes.getDimensionPixelSize(index, this.circleRadius);
                        break;
                    case 4:
                        float f = obtainStyledAttributes.getFloat(index, this.circleAngle) % 360.0f;
                        this.circleAngle = f;
                        if (f >= 0.0f) {
                            break;
                        } else {
                            this.circleAngle = (360.0f - f) % 360.0f;
                            break;
                        }
                    case 5:
                        this.guideBegin = obtainStyledAttributes.getDimensionPixelOffset(index, this.guideBegin);
                        break;
                    case 6:
                        this.guideEnd = obtainStyledAttributes.getDimensionPixelOffset(index, this.guideEnd);
                        break;
                    case 7:
                        this.guidePercent = obtainStyledAttributes.getFloat(index, this.guidePercent);
                        break;
                    case 8:
                        int resourceId2 = obtainStyledAttributes.getResourceId(index, this.leftToLeft);
                        this.leftToLeft = resourceId2;
                        if (resourceId2 != -1) {
                            break;
                        } else {
                            this.leftToLeft = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 9:
                        int resourceId3 = obtainStyledAttributes.getResourceId(index, this.leftToRight);
                        this.leftToRight = resourceId3;
                        if (resourceId3 != -1) {
                            break;
                        } else {
                            this.leftToRight = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 10:
                        int resourceId4 = obtainStyledAttributes.getResourceId(index, this.rightToLeft);
                        this.rightToLeft = resourceId4;
                        if (resourceId4 != -1) {
                            break;
                        } else {
                            this.rightToLeft = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 11:
                        int resourceId5 = obtainStyledAttributes.getResourceId(index, this.rightToRight);
                        this.rightToRight = resourceId5;
                        if (resourceId5 != -1) {
                            break;
                        } else {
                            this.rightToRight = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 12:
                        int resourceId6 = obtainStyledAttributes.getResourceId(index, this.topToTop);
                        this.topToTop = resourceId6;
                        if (resourceId6 != -1) {
                            break;
                        } else {
                            this.topToTop = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 13:
                        int resourceId7 = obtainStyledAttributes.getResourceId(index, this.topToBottom);
                        this.topToBottom = resourceId7;
                        if (resourceId7 != -1) {
                            break;
                        } else {
                            this.topToBottom = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 14:
                        int resourceId8 = obtainStyledAttributes.getResourceId(index, this.bottomToTop);
                        this.bottomToTop = resourceId8;
                        if (resourceId8 != -1) {
                            break;
                        } else {
                            this.bottomToTop = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 15:
                        int resourceId9 = obtainStyledAttributes.getResourceId(index, this.bottomToBottom);
                        this.bottomToBottom = resourceId9;
                        if (resourceId9 != -1) {
                            break;
                        } else {
                            this.bottomToBottom = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 16:
                        int resourceId10 = obtainStyledAttributes.getResourceId(index, this.baselineToBaseline);
                        this.baselineToBaseline = resourceId10;
                        if (resourceId10 != -1) {
                            break;
                        } else {
                            this.baselineToBaseline = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 17:
                        int resourceId11 = obtainStyledAttributes.getResourceId(index, this.startToEnd);
                        this.startToEnd = resourceId11;
                        if (resourceId11 != -1) {
                            break;
                        } else {
                            this.startToEnd = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 18:
                        int resourceId12 = obtainStyledAttributes.getResourceId(index, this.startToStart);
                        this.startToStart = resourceId12;
                        if (resourceId12 != -1) {
                            break;
                        } else {
                            this.startToStart = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 19:
                        int resourceId13 = obtainStyledAttributes.getResourceId(index, this.endToStart);
                        this.endToStart = resourceId13;
                        if (resourceId13 != -1) {
                            break;
                        } else {
                            this.endToStart = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 20:
                        int resourceId14 = obtainStyledAttributes.getResourceId(index, this.endToEnd);
                        this.endToEnd = resourceId14;
                        if (resourceId14 != -1) {
                            break;
                        } else {
                            this.endToEnd = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 21:
                        this.goneLeftMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.goneLeftMargin);
                        break;
                    case 22:
                        this.goneTopMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.goneTopMargin);
                        break;
                    case 23:
                        this.goneRightMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.goneRightMargin);
                        break;
                    case 24:
                        this.goneBottomMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.goneBottomMargin);
                        break;
                    case 25:
                        this.goneStartMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.goneStartMargin);
                        break;
                    case 26:
                        this.goneEndMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.goneEndMargin);
                        break;
                    case 27:
                        this.constrainedWidth = obtainStyledAttributes.getBoolean(index, this.constrainedWidth);
                        break;
                    case 28:
                        this.constrainedHeight = obtainStyledAttributes.getBoolean(index, this.constrainedHeight);
                        break;
                    case 29:
                        this.horizontalBias = obtainStyledAttributes.getFloat(index, this.horizontalBias);
                        break;
                    case 30:
                        this.verticalBias = obtainStyledAttributes.getFloat(index, this.verticalBias);
                        break;
                    case 31:
                        this.matchConstraintDefaultWidth = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 32:
                        this.matchConstraintDefaultHeight = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 33:
                        try {
                            this.matchConstraintMinWidth = obtainStyledAttributes.getDimensionPixelSize(index, this.matchConstraintMinWidth);
                            break;
                        } catch (Exception unused) {
                            if (obtainStyledAttributes.getInt(index, this.matchConstraintMinWidth) != -2) {
                                break;
                            } else {
                                this.matchConstraintMinWidth = -2;
                                break;
                            }
                        }
                    case 34:
                        try {
                            this.matchConstraintMaxWidth = obtainStyledAttributes.getDimensionPixelSize(index, this.matchConstraintMaxWidth);
                            break;
                        } catch (Exception unused2) {
                            if (obtainStyledAttributes.getInt(index, this.matchConstraintMaxWidth) != -2) {
                                break;
                            } else {
                                this.matchConstraintMaxWidth = -2;
                                break;
                            }
                        }
                    case 35:
                        this.matchConstraintPercentWidth = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.matchConstraintPercentWidth));
                        this.matchConstraintDefaultWidth = 2;
                        break;
                    case 36:
                        try {
                            this.matchConstraintMinHeight = obtainStyledAttributes.getDimensionPixelSize(index, this.matchConstraintMinHeight);
                            break;
                        } catch (Exception unused3) {
                            if (obtainStyledAttributes.getInt(index, this.matchConstraintMinHeight) != -2) {
                                break;
                            } else {
                                this.matchConstraintMinHeight = -2;
                                break;
                            }
                        }
                    case 37:
                        try {
                            this.matchConstraintMaxHeight = obtainStyledAttributes.getDimensionPixelSize(index, this.matchConstraintMaxHeight);
                            break;
                        } catch (Exception unused4) {
                            if (obtainStyledAttributes.getInt(index, this.matchConstraintMaxHeight) != -2) {
                                break;
                            } else {
                                this.matchConstraintMaxHeight = -2;
                                break;
                            }
                        }
                    case 38:
                        this.matchConstraintPercentHeight = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.matchConstraintPercentHeight));
                        this.matchConstraintDefaultHeight = 2;
                        break;
                    default:
                        switch (i2) {
                            case 44:
                                ConstraintSet.parseDimensionRatioString(this, obtainStyledAttributes.getString(index));
                                break;
                            case 45:
                                this.horizontalWeight = obtainStyledAttributes.getFloat(index, this.horizontalWeight);
                                break;
                            case 46:
                                this.verticalWeight = obtainStyledAttributes.getFloat(index, this.verticalWeight);
                                break;
                            case 47:
                                this.horizontalChainStyle = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.verticalChainStyle = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.editorAbsoluteX = obtainStyledAttributes.getDimensionPixelOffset(index, this.editorAbsoluteX);
                                break;
                            case 50:
                                this.editorAbsoluteY = obtainStyledAttributes.getDimensionPixelOffset(index, this.editorAbsoluteY);
                                break;
                            case 51:
                                this.constraintTag = obtainStyledAttributes.getString(index);
                                break;
                            case 52:
                                int resourceId15 = obtainStyledAttributes.getResourceId(index, this.baselineToTop);
                                this.baselineToTop = resourceId15;
                                if (resourceId15 != -1) {
                                    break;
                                } else {
                                    this.baselineToTop = obtainStyledAttributes.getInt(index, -1);
                                    break;
                                }
                            case 53:
                                int resourceId16 = obtainStyledAttributes.getResourceId(index, this.baselineToBottom);
                                this.baselineToBottom = resourceId16;
                                if (resourceId16 != -1) {
                                    break;
                                } else {
                                    this.baselineToBottom = obtainStyledAttributes.getInt(index, -1);
                                    break;
                                }
                            case 54:
                                this.baselineMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.baselineMargin);
                                break;
                            case 55:
                                this.goneBaselineMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.goneBaselineMargin);
                                break;
                            default:
                                switch (i2) {
                                    case 64:
                                        ConstraintSet.parseDimensionConstraints(this, obtainStyledAttributes, index, 0);
                                        this.widthSet = true;
                                        break;
                                    case 65:
                                        ConstraintSet.parseDimensionConstraints(this, obtainStyledAttributes, index, 1);
                                        this.heightSet = true;
                                        break;
                                    case 66:
                                        this.wrapBehaviorInParent = obtainStyledAttributes.getInt(index, this.wrapBehaviorInParent);
                                        break;
                                    case 67:
                                        this.guidelineUseRtl = obtainStyledAttributes.getBoolean(index, this.guidelineUseRtl);
                                        break;
                                }
                        }
                }
            }
            obtainStyledAttributes.recycle();
            validate();
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(LayoutParams layoutParams) {
            super(layoutParams);
            this.guideBegin = layoutParams.guideBegin;
            this.guideEnd = layoutParams.guideEnd;
            this.guidePercent = layoutParams.guidePercent;
            this.guidelineUseRtl = layoutParams.guidelineUseRtl;
            this.leftToLeft = layoutParams.leftToLeft;
            this.leftToRight = layoutParams.leftToRight;
            this.rightToLeft = layoutParams.rightToLeft;
            this.rightToRight = layoutParams.rightToRight;
            this.topToTop = layoutParams.topToTop;
            this.topToBottom = layoutParams.topToBottom;
            this.bottomToTop = layoutParams.bottomToTop;
            this.bottomToBottom = layoutParams.bottomToBottom;
            this.baselineToBaseline = layoutParams.baselineToBaseline;
            this.baselineToTop = layoutParams.baselineToTop;
            this.baselineToBottom = layoutParams.baselineToBottom;
            this.circleConstraint = layoutParams.circleConstraint;
            this.circleRadius = layoutParams.circleRadius;
            this.circleAngle = layoutParams.circleAngle;
            this.startToEnd = layoutParams.startToEnd;
            this.startToStart = layoutParams.startToStart;
            this.endToStart = layoutParams.endToStart;
            this.endToEnd = layoutParams.endToEnd;
            this.goneLeftMargin = layoutParams.goneLeftMargin;
            this.goneTopMargin = layoutParams.goneTopMargin;
            this.goneRightMargin = layoutParams.goneRightMargin;
            this.goneBottomMargin = layoutParams.goneBottomMargin;
            this.goneStartMargin = layoutParams.goneStartMargin;
            this.goneEndMargin = layoutParams.goneEndMargin;
            this.goneBaselineMargin = layoutParams.goneBaselineMargin;
            this.baselineMargin = layoutParams.baselineMargin;
            this.horizontalBias = layoutParams.horizontalBias;
            this.verticalBias = layoutParams.verticalBias;
            this.dimensionRatio = layoutParams.dimensionRatio;
            this.dimensionRatioValue = layoutParams.dimensionRatioValue;
            this.dimensionRatioSide = layoutParams.dimensionRatioSide;
            this.horizontalWeight = layoutParams.horizontalWeight;
            this.verticalWeight = layoutParams.verticalWeight;
            this.horizontalChainStyle = layoutParams.horizontalChainStyle;
            this.verticalChainStyle = layoutParams.verticalChainStyle;
            this.constrainedWidth = layoutParams.constrainedWidth;
            this.constrainedHeight = layoutParams.constrainedHeight;
            this.matchConstraintDefaultWidth = layoutParams.matchConstraintDefaultWidth;
            this.matchConstraintDefaultHeight = layoutParams.matchConstraintDefaultHeight;
            this.matchConstraintMinWidth = layoutParams.matchConstraintMinWidth;
            this.matchConstraintMaxWidth = layoutParams.matchConstraintMaxWidth;
            this.matchConstraintMinHeight = layoutParams.matchConstraintMinHeight;
            this.matchConstraintMaxHeight = layoutParams.matchConstraintMaxHeight;
            this.matchConstraintPercentWidth = layoutParams.matchConstraintPercentWidth;
            this.matchConstraintPercentHeight = layoutParams.matchConstraintPercentHeight;
            this.editorAbsoluteX = layoutParams.editorAbsoluteX;
            this.editorAbsoluteY = layoutParams.editorAbsoluteY;
            this.orientation = layoutParams.orientation;
            this.horizontalDimensionFixed = layoutParams.horizontalDimensionFixed;
            this.verticalDimensionFixed = layoutParams.verticalDimensionFixed;
            this.needsBaseline = layoutParams.needsBaseline;
            this.isGuideline = layoutParams.isGuideline;
            this.resolvedLeftToLeft = layoutParams.resolvedLeftToLeft;
            this.resolvedLeftToRight = layoutParams.resolvedLeftToRight;
            this.resolvedRightToLeft = layoutParams.resolvedRightToLeft;
            this.resolvedRightToRight = layoutParams.resolvedRightToRight;
            this.resolveGoneLeftMargin = layoutParams.resolveGoneLeftMargin;
            this.resolveGoneRightMargin = layoutParams.resolveGoneRightMargin;
            this.resolvedHorizontalBias = layoutParams.resolvedHorizontalBias;
            this.constraintTag = layoutParams.constraintTag;
            this.wrapBehaviorInParent = layoutParams.wrapBehaviorInParent;
            this.widget = layoutParams.widget;
            this.widthSet = layoutParams.widthSet;
            this.heightSet = layoutParams.heightSet;
        }

        public String getConstraintTag() {
            return this.constraintTag;
        }

        public ConstraintWidget getConstraintWidget() {
            return this.widget;
        }

        public void reset() {
            ConstraintWidget constraintWidget = this.widget;
            if (constraintWidget != null) {
                constraintWidget.reset();
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:74:0x00da, code lost:
            if (r1 > 0) goto L_0x00dc;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:80:0x00e9, code lost:
            if (r1 > 0) goto L_0x00dc;
         */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0054  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x005b  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0062  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0068  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x006e  */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x0084  */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x008c  */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x009c  */
        /* JADX WARNING: Removed duplicated region for block: B:70:0x00d0  */
        /* JADX WARNING: Removed duplicated region for block: B:83:0x00f0  */
        /* JADX WARNING: Removed duplicated region for block: B:87:0x00fb  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0041  */
        /* JADX WARNING: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
        @android.annotation.TargetApi(17)
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void resolveLayoutDirection(int r11) {
            /*
                r10 = this;
                int r0 = r10.leftMargin
                int r1 = r10.rightMargin
                int r2 = android.os.Build.VERSION.SDK_INT
                r3 = 0
                r4 = 1
                r5 = 17
                if (r2 < r5) goto L_0x0017
                super.resolveLayoutDirection(r11)
                int r11 = r10.getLayoutDirection()
                if (r4 != r11) goto L_0x0017
                r11 = 1
                goto L_0x0018
            L_0x0017:
                r11 = 0
            L_0x0018:
                r2 = -1
                r10.resolvedRightToLeft = r2
                r10.resolvedRightToRight = r2
                r10.resolvedLeftToLeft = r2
                r10.resolvedLeftToRight = r2
                r10.resolveGoneLeftMargin = r2
                r10.resolveGoneRightMargin = r2
                int r5 = r10.goneLeftMargin
                r10.resolveGoneLeftMargin = r5
                int r5 = r10.goneRightMargin
                r10.resolveGoneRightMargin = r5
                float r5 = r10.horizontalBias
                r10.resolvedHorizontalBias = r5
                int r6 = r10.guideBegin
                r10.resolvedGuideBegin = r6
                int r7 = r10.guideEnd
                r10.resolvedGuideEnd = r7
                float r8 = r10.guidePercent
                r10.resolvedGuidePercent = r8
                r9 = -2147483648(0xffffffff80000000, float:-0.0)
                if (r11 == 0) goto L_0x009c
                int r11 = r10.startToEnd
                if (r11 == r2) goto L_0x0049
                r10.resolvedRightToLeft = r11
            L_0x0047:
                r3 = 1
                goto L_0x0050
            L_0x0049:
                int r11 = r10.startToStart
                if (r11 == r2) goto L_0x0050
                r10.resolvedRightToRight = r11
                goto L_0x0047
            L_0x0050:
                int r11 = r10.endToStart
                if (r11 == r2) goto L_0x0057
                r10.resolvedLeftToRight = r11
                r3 = 1
            L_0x0057:
                int r11 = r10.endToEnd
                if (r11 == r2) goto L_0x005e
                r10.resolvedLeftToLeft = r11
                r3 = 1
            L_0x005e:
                int r11 = r10.goneStartMargin
                if (r11 == r9) goto L_0x0064
                r10.resolveGoneRightMargin = r11
            L_0x0064:
                int r11 = r10.goneEndMargin
                if (r11 == r9) goto L_0x006a
                r10.resolveGoneLeftMargin = r11
            L_0x006a:
                r11 = 1065353216(0x3f800000, float:1.0)
                if (r3 == 0) goto L_0x0072
                float r3 = r11 - r5
                r10.resolvedHorizontalBias = r3
            L_0x0072:
                boolean r3 = r10.isGuideline
                if (r3 == 0) goto L_0x00c0
                int r3 = r10.orientation
                if (r3 != r4) goto L_0x00c0
                boolean r3 = r10.guidelineUseRtl
                if (r3 == 0) goto L_0x00c0
                r3 = -1082130432(0xffffffffbf800000, float:-1.0)
                int r4 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
                if (r4 == 0) goto L_0x008c
                float r11 = r11 - r8
                r10.resolvedGuidePercent = r11
                r10.resolvedGuideBegin = r2
                r10.resolvedGuideEnd = r2
                goto L_0x00c0
            L_0x008c:
                if (r6 == r2) goto L_0x0095
                r10.resolvedGuideEnd = r6
                r10.resolvedGuideBegin = r2
            L_0x0092:
                r10.resolvedGuidePercent = r3
                goto L_0x00c0
            L_0x0095:
                if (r7 == r2) goto L_0x00c0
                r10.resolvedGuideBegin = r7
                r10.resolvedGuideEnd = r2
                goto L_0x0092
            L_0x009c:
                int r11 = r10.startToEnd
                if (r11 == r2) goto L_0x00a2
                r10.resolvedLeftToRight = r11
            L_0x00a2:
                int r11 = r10.startToStart
                if (r11 == r2) goto L_0x00a8
                r10.resolvedLeftToLeft = r11
            L_0x00a8:
                int r11 = r10.endToStart
                if (r11 == r2) goto L_0x00ae
                r10.resolvedRightToLeft = r11
            L_0x00ae:
                int r11 = r10.endToEnd
                if (r11 == r2) goto L_0x00b4
                r10.resolvedRightToRight = r11
            L_0x00b4:
                int r11 = r10.goneStartMargin
                if (r11 == r9) goto L_0x00ba
                r10.resolveGoneLeftMargin = r11
            L_0x00ba:
                int r11 = r10.goneEndMargin
                if (r11 == r9) goto L_0x00c0
                r10.resolveGoneRightMargin = r11
            L_0x00c0:
                int r11 = r10.endToStart
                if (r11 != r2) goto L_0x0108
                int r11 = r10.endToEnd
                if (r11 != r2) goto L_0x0108
                int r11 = r10.startToStart
                if (r11 != r2) goto L_0x0108
                int r11 = r10.startToEnd
                if (r11 != r2) goto L_0x0108
                int r11 = r10.rightToLeft
                if (r11 == r2) goto L_0x00df
                r10.resolvedRightToLeft = r11
                int r11 = r10.rightMargin
                if (r11 > 0) goto L_0x00ec
                if (r1 <= 0) goto L_0x00ec
            L_0x00dc:
                r10.rightMargin = r1
                goto L_0x00ec
            L_0x00df:
                int r11 = r10.rightToRight
                if (r11 == r2) goto L_0x00ec
                r10.resolvedRightToRight = r11
                int r11 = r10.rightMargin
                if (r11 > 0) goto L_0x00ec
                if (r1 <= 0) goto L_0x00ec
                goto L_0x00dc
            L_0x00ec:
                int r11 = r10.leftToLeft
                if (r11 == r2) goto L_0x00fb
                r10.resolvedLeftToLeft = r11
                int r11 = r10.leftMargin
                if (r11 > 0) goto L_0x0108
                if (r0 <= 0) goto L_0x0108
            L_0x00f8:
                r10.leftMargin = r0
                goto L_0x0108
            L_0x00fb:
                int r11 = r10.leftToRight
                if (r11 == r2) goto L_0x0108
                r10.resolvedLeftToRight = r11
                int r11 = r10.leftMargin
                if (r11 > 0) goto L_0x0108
                if (r0 <= 0) goto L_0x0108
                goto L_0x00f8
            L_0x0108:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.LayoutParams.resolveLayoutDirection(int):void");
        }

        public void setWidgetDebugName(String str) {
            this.widget.setDebugName(str);
        }

        public void validate() {
            this.isGuideline = false;
            this.horizontalDimensionFixed = true;
            this.verticalDimensionFixed = true;
            int i = this.width;
            if (i == -2 && this.constrainedWidth) {
                this.horizontalDimensionFixed = false;
                if (this.matchConstraintDefaultWidth == 0) {
                    this.matchConstraintDefaultWidth = 1;
                }
            }
            int i2 = this.height;
            if (i2 == -2 && this.constrainedHeight) {
                this.verticalDimensionFixed = false;
                if (this.matchConstraintDefaultHeight == 0) {
                    this.matchConstraintDefaultHeight = 1;
                }
            }
            if (i == 0 || i == -1) {
                this.horizontalDimensionFixed = false;
                if (i == 0 && this.matchConstraintDefaultWidth == 1) {
                    this.width = -2;
                    this.constrainedWidth = true;
                }
            }
            if (i2 == 0 || i2 == -1) {
                this.verticalDimensionFixed = false;
                if (i2 == 0 && this.matchConstraintDefaultHeight == 1) {
                    this.height = -2;
                    this.constrainedHeight = true;
                }
            }
            if (this.guidePercent != -1.0f || this.guideBegin != -1 || this.guideEnd != -1) {
                this.isGuideline = true;
                this.horizontalDimensionFixed = true;
                this.verticalDimensionFixed = true;
                if (!(this.widget instanceof Guideline)) {
                    this.widget = new Guideline();
                }
                ((Guideline) this.widget).setOrientation(this.orientation);
            }
        }
    }

    class Measurer implements BasicMeasure.Measurer {
        ConstraintLayout layout;
        int layoutHeightSpec;
        int layoutWidthSpec;
        int paddingBottom;
        int paddingHeight;
        int paddingTop;
        int paddingWidth;

        public Measurer(ConstraintLayout constraintLayout) {
            this.layout = constraintLayout;
        }

        private boolean isSimilarSpec(int i, int i2, int i3) {
            if (i == i2) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(i);
            View.MeasureSpec.getSize(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (mode2 == 1073741824) {
                return (mode == Integer.MIN_VALUE || mode == 0) && i3 == size;
            }
            return false;
        }

        public void captureLayoutInfo(int i, int i2, int i3, int i4, int i5, int i6) {
            this.paddingTop = i3;
            this.paddingBottom = i4;
            this.paddingWidth = i5;
            this.paddingHeight = i6;
            this.layoutWidthSpec = i;
            this.layoutHeightSpec = i2;
        }

        public final void didMeasures() {
            int childCount = this.layout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.layout.getChildAt(i);
                if (childAt instanceof Placeholder) {
                    ((Placeholder) childAt).updatePostMeasure(this.layout);
                }
            }
            int size = this.layout.mConstraintHelpers.size();
            if (size > 0) {
                for (int i2 = 0; i2 < size; i2++) {
                    ((ConstraintHelper) this.layout.mConstraintHelpers.get(i2)).updatePostMeasure(this.layout);
                }
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:104:0x0187  */
        /* JADX WARNING: Removed duplicated region for block: B:105:0x0189  */
        /* JADX WARNING: Removed duplicated region for block: B:107:0x018c  */
        /* JADX WARNING: Removed duplicated region for block: B:111:0x01a3  */
        /* JADX WARNING: Removed duplicated region for block: B:112:0x01a5  */
        /* JADX WARNING: Removed duplicated region for block: B:114:0x01a8  */
        /* JADX WARNING: Removed duplicated region for block: B:115:0x01aa  */
        /* JADX WARNING: Removed duplicated region for block: B:120:0x01b4  */
        /* JADX WARNING: Removed duplicated region for block: B:121:0x01b6  */
        /* JADX WARNING: Removed duplicated region for block: B:125:0x01be  */
        /* JADX WARNING: Removed duplicated region for block: B:126:0x01c0  */
        /* JADX WARNING: Removed duplicated region for block: B:131:0x01ca  */
        /* JADX WARNING: Removed duplicated region for block: B:132:0x01cc  */
        /* JADX WARNING: Removed duplicated region for block: B:136:0x01d5  */
        /* JADX WARNING: Removed duplicated region for block: B:137:0x01d7  */
        /* JADX WARNING: Removed duplicated region for block: B:139:0x01da A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:140:0x01db  */
        /* JADX WARNING: Removed duplicated region for block: B:49:0x00b6  */
        @android.annotation.SuppressLint({"WrongCall"})
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void measure(androidx.constraintlayout.core.widgets.ConstraintWidget r18, androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure r19) {
            /*
                r17 = this;
                r0 = r17
                r1 = r18
                r2 = r19
                if (r1 != 0) goto L_0x0009
                return
            L_0x0009:
                int r3 = r18.getVisibility()
                r4 = 8
                r5 = 0
                if (r3 != r4) goto L_0x001f
                boolean r3 = r18.isInPlaceholder()
                if (r3 != 0) goto L_0x001f
                r2.measuredWidth = r5
                r2.measuredHeight = r5
                r2.measuredBaseline = r5
                return
            L_0x001f:
                androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r18.getParent()
                if (r3 != 0) goto L_0x0026
                return
            L_0x0026:
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = r2.horizontalBehavior
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = r2.verticalBehavior
                int r6 = r2.horizontalDimension
                int r7 = r2.verticalDimension
                int r8 = r0.paddingTop
                int r9 = r0.paddingBottom
                int r8 = r8 + r9
                int r9 = r0.paddingWidth
                java.lang.Object r10 = r18.getCompanionWidget()
                android.view.View r10 = (android.view.View) r10
                int[] r11 = androidx.constraintlayout.widget.ConstraintLayout.C02171.f75x6d00e4a2
                int r12 = r3.ordinal()
                r12 = r11[r12]
                r13 = 4
                r14 = 3
                r15 = 2
                r5 = 1
                if (r12 == r5) goto L_0x00a8
                if (r12 == r15) goto L_0x00a0
                if (r12 == r14) goto L_0x0097
                if (r12 == r13) goto L_0x0051
                r6 = 0
                goto L_0x00ae
            L_0x0051:
                int r6 = r0.layoutWidthSpec
                r12 = -2
                int r6 = android.view.ViewGroup.getChildMeasureSpec(r6, r9, r12)
                int r9 = r1.mMatchConstraintDefaultWidth
                if (r9 != r5) goto L_0x005e
                r9 = 1
                goto L_0x005f
            L_0x005e:
                r9 = 0
            L_0x005f:
                int r12 = r2.measureStrategy
                int r13 = androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure.TRY_GIVEN_DIMENSIONS
                if (r12 == r13) goto L_0x0069
                int r13 = androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure.USE_GIVEN_DIMENSIONS
                if (r12 != r13) goto L_0x00ae
            L_0x0069:
                int r12 = r10.getMeasuredHeight()
                int r13 = r18.getHeight()
                if (r12 != r13) goto L_0x0075
                r12 = 1
                goto L_0x0076
            L_0x0075:
                r12 = 0
            L_0x0076:
                int r13 = r2.measureStrategy
                int r14 = androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure.USE_GIVEN_DIMENSIONS
                if (r13 == r14) goto L_0x008f
                if (r9 == 0) goto L_0x008f
                if (r9 == 0) goto L_0x0082
                if (r12 != 0) goto L_0x008f
            L_0x0082:
                boolean r9 = r10 instanceof androidx.constraintlayout.widget.Placeholder
                if (r9 != 0) goto L_0x008f
                boolean r9 = r18.isResolvedHorizontally()
                if (r9 == 0) goto L_0x008d
                goto L_0x008f
            L_0x008d:
                r9 = 0
                goto L_0x0090
            L_0x008f:
                r9 = 1
            L_0x0090:
                if (r9 == 0) goto L_0x00ae
                int r6 = r18.getWidth()
                goto L_0x00a8
            L_0x0097:
                int r6 = r0.layoutWidthSpec
                int r12 = r18.getHorizontalMargin()
                int r9 = r9 + r12
                r12 = -1
                goto L_0x00a3
            L_0x00a0:
                int r6 = r0.layoutWidthSpec
                r12 = -2
            L_0x00a3:
                int r6 = android.view.ViewGroup.getChildMeasureSpec(r6, r9, r12)
                goto L_0x00ae
            L_0x00a8:
                r9 = 1073741824(0x40000000, float:2.0)
                int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r9)
            L_0x00ae:
                int r9 = r4.ordinal()
                r9 = r11[r9]
                if (r9 == r5) goto L_0x0117
                if (r9 == r15) goto L_0x010f
                r7 = 3
                if (r9 == r7) goto L_0x0106
                r7 = 4
                if (r9 == r7) goto L_0x00c0
                r7 = 0
                goto L_0x011d
            L_0x00c0:
                int r7 = r0.layoutHeightSpec
                r9 = -2
                int r7 = android.view.ViewGroup.getChildMeasureSpec(r7, r8, r9)
                int r8 = r1.mMatchConstraintDefaultHeight
                if (r8 != r5) goto L_0x00cd
                r8 = 1
                goto L_0x00ce
            L_0x00cd:
                r8 = 0
            L_0x00ce:
                int r9 = r2.measureStrategy
                int r11 = androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure.TRY_GIVEN_DIMENSIONS
                if (r9 == r11) goto L_0x00d8
                int r11 = androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure.USE_GIVEN_DIMENSIONS
                if (r9 != r11) goto L_0x011d
            L_0x00d8:
                int r9 = r10.getMeasuredWidth()
                int r11 = r18.getWidth()
                if (r9 != r11) goto L_0x00e4
                r9 = 1
                goto L_0x00e5
            L_0x00e4:
                r9 = 0
            L_0x00e5:
                int r11 = r2.measureStrategy
                int r12 = androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure.USE_GIVEN_DIMENSIONS
                if (r11 == r12) goto L_0x00fe
                if (r8 == 0) goto L_0x00fe
                if (r8 == 0) goto L_0x00f1
                if (r9 != 0) goto L_0x00fe
            L_0x00f1:
                boolean r8 = r10 instanceof androidx.constraintlayout.widget.Placeholder
                if (r8 != 0) goto L_0x00fe
                boolean r8 = r18.isResolvedVertically()
                if (r8 == 0) goto L_0x00fc
                goto L_0x00fe
            L_0x00fc:
                r8 = 0
                goto L_0x00ff
            L_0x00fe:
                r8 = 1
            L_0x00ff:
                if (r8 == 0) goto L_0x011d
                int r7 = r18.getHeight()
                goto L_0x0117
            L_0x0106:
                int r7 = r0.layoutHeightSpec
                int r9 = r18.getVerticalMargin()
                int r8 = r8 + r9
                r9 = -1
                goto L_0x0112
            L_0x010f:
                int r7 = r0.layoutHeightSpec
                r9 = -2
            L_0x0112:
                int r7 = android.view.ViewGroup.getChildMeasureSpec(r7, r8, r9)
                goto L_0x011d
            L_0x0117:
                r8 = 1073741824(0x40000000, float:2.0)
                int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r8)
            L_0x011d:
                androidx.constraintlayout.core.widgets.ConstraintWidget r8 = r18.getParent()
                androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r8 = (androidx.constraintlayout.core.widgets.ConstraintWidgetContainer) r8
                if (r8 == 0) goto L_0x019f
                androidx.constraintlayout.widget.ConstraintLayout r9 = androidx.constraintlayout.widget.ConstraintLayout.this
                int r9 = r9.mOptimizationLevel
                r11 = 256(0x100, float:3.59E-43)
                boolean r9 = androidx.constraintlayout.core.widgets.Optimizer.enabled(r9, r11)
                if (r9 == 0) goto L_0x019f
                int r9 = r10.getMeasuredWidth()
                int r11 = r18.getWidth()
                if (r9 != r11) goto L_0x019f
                int r9 = r10.getMeasuredWidth()
                int r11 = r8.getWidth()
                if (r9 >= r11) goto L_0x019f
                int r9 = r10.getMeasuredHeight()
                int r11 = r18.getHeight()
                if (r9 != r11) goto L_0x019f
                int r9 = r10.getMeasuredHeight()
                int r8 = r8.getHeight()
                if (r9 >= r8) goto L_0x019f
                int r8 = r10.getBaseline()
                int r9 = r18.getBaselineDistance()
                if (r8 != r9) goto L_0x019f
                boolean r8 = r18.isMeasureRequested()
                if (r8 != 0) goto L_0x019f
                int r8 = r18.getLastHorizontalMeasureSpec()
                int r9 = r18.getWidth()
                boolean r8 = r0.isSimilarSpec(r8, r6, r9)
                if (r8 == 0) goto L_0x0189
                int r8 = r18.getLastVerticalMeasureSpec()
                int r9 = r18.getHeight()
                boolean r8 = r0.isSimilarSpec(r8, r7, r9)
                if (r8 == 0) goto L_0x0189
                r8 = 1
                goto L_0x018a
            L_0x0189:
                r8 = 0
            L_0x018a:
                if (r8 == 0) goto L_0x019f
                int r3 = r18.getWidth()
                r2.measuredWidth = r3
                int r3 = r18.getHeight()
                r2.measuredHeight = r3
                int r1 = r18.getBaselineDistance()
                r2.measuredBaseline = r1
                return
            L_0x019f:
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r8 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
                if (r3 != r8) goto L_0x01a5
                r9 = 1
                goto L_0x01a6
            L_0x01a5:
                r9 = 0
            L_0x01a6:
                if (r4 != r8) goto L_0x01aa
                r8 = 1
                goto L_0x01ab
            L_0x01aa:
                r8 = 0
            L_0x01ab:
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r11 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT
                if (r4 == r11) goto L_0x01b6
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r12 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
                if (r4 != r12) goto L_0x01b4
                goto L_0x01b6
            L_0x01b4:
                r4 = 0
                goto L_0x01b7
            L_0x01b6:
                r4 = 1
            L_0x01b7:
                if (r3 == r11) goto L_0x01c0
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r11 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
                if (r3 != r11) goto L_0x01be
                goto L_0x01c0
            L_0x01be:
                r3 = 0
                goto L_0x01c1
            L_0x01c0:
                r3 = 1
            L_0x01c1:
                r11 = 0
                if (r9 == 0) goto L_0x01cc
                float r12 = r1.mDimensionRatio
                int r12 = (r12 > r11 ? 1 : (r12 == r11 ? 0 : -1))
                if (r12 <= 0) goto L_0x01cc
                r12 = 1
                goto L_0x01cd
            L_0x01cc:
                r12 = 0
            L_0x01cd:
                if (r8 == 0) goto L_0x01d7
                float r13 = r1.mDimensionRatio
                int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
                if (r11 <= 0) goto L_0x01d7
                r11 = 1
                goto L_0x01d8
            L_0x01d7:
                r11 = 0
            L_0x01d8:
                if (r10 != 0) goto L_0x01db
                return
            L_0x01db:
                android.view.ViewGroup$LayoutParams r13 = r10.getLayoutParams()
                androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r13 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r13
                int r14 = r2.measureStrategy
                int r15 = androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure.TRY_GIVEN_DIMENSIONS
                if (r14 == r15) goto L_0x01fe
                int r15 = androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure.USE_GIVEN_DIMENSIONS
                if (r14 == r15) goto L_0x01fe
                if (r9 == 0) goto L_0x01fe
                int r9 = r1.mMatchConstraintDefaultWidth
                if (r9 != 0) goto L_0x01fe
                if (r8 == 0) goto L_0x01fe
                int r8 = r1.mMatchConstraintDefaultHeight
                if (r8 == 0) goto L_0x01f8
                goto L_0x01fe
            L_0x01f8:
                r0 = -1
                r5 = 0
                r14 = 0
                r15 = 0
                goto L_0x029a
            L_0x01fe:
                boolean r8 = r10 instanceof androidx.constraintlayout.widget.VirtualLayout
                if (r8 == 0) goto L_0x0210
                boolean r8 = r1 instanceof androidx.constraintlayout.core.widgets.VirtualLayout
                if (r8 == 0) goto L_0x0210
                r8 = r1
                androidx.constraintlayout.core.widgets.VirtualLayout r8 = (androidx.constraintlayout.core.widgets.VirtualLayout) r8
                r9 = r10
                androidx.constraintlayout.widget.VirtualLayout r9 = (androidx.constraintlayout.widget.VirtualLayout) r9
                r9.onMeasure(r8, r6, r7)
                goto L_0x0213
            L_0x0210:
                r10.measure(r6, r7)
            L_0x0213:
                r1.setLastMeasureSpec(r6, r7)
                int r8 = r10.getMeasuredWidth()
                int r9 = r10.getMeasuredHeight()
                int r14 = r10.getBaseline()
                int r15 = r1.mMatchConstraintMinWidth
                if (r15 <= 0) goto L_0x022b
                int r15 = java.lang.Math.max(r15, r8)
                goto L_0x022c
            L_0x022b:
                r15 = r8
            L_0x022c:
                int r5 = r1.mMatchConstraintMaxWidth
                if (r5 <= 0) goto L_0x0234
                int r15 = java.lang.Math.min(r5, r15)
            L_0x0234:
                int r5 = r1.mMatchConstraintMinHeight
                if (r5 <= 0) goto L_0x023f
                int r5 = java.lang.Math.max(r5, r9)
                r16 = r6
                goto L_0x0242
            L_0x023f:
                r16 = r6
                r5 = r9
            L_0x0242:
                int r6 = r1.mMatchConstraintMaxHeight
                if (r6 <= 0) goto L_0x024a
                int r5 = java.lang.Math.min(r6, r5)
            L_0x024a:
                androidx.constraintlayout.widget.ConstraintLayout r6 = androidx.constraintlayout.widget.ConstraintLayout.this
                int r6 = r6.mOptimizationLevel
                r0 = 1
                boolean r6 = androidx.constraintlayout.core.widgets.Optimizer.enabled(r6, r0)
                if (r6 != 0) goto L_0x026f
                r0 = 1056964608(0x3f000000, float:0.5)
                if (r12 == 0) goto L_0x0265
                if (r4 == 0) goto L_0x0265
                float r3 = r1.mDimensionRatio
                float r4 = (float) r5
                float r4 = r4 * r3
                float r4 = r4 + r0
                int r15 = (int) r4
                goto L_0x026f
            L_0x0265:
                if (r11 == 0) goto L_0x026f
                if (r3 == 0) goto L_0x026f
                float r3 = r1.mDimensionRatio
                float r4 = (float) r15
                float r4 = r4 / r3
                float r4 = r4 + r0
                int r5 = (int) r4
            L_0x026f:
                if (r8 != r15) goto L_0x0276
                if (r9 == r5) goto L_0x0274
                goto L_0x0276
            L_0x0274:
                r0 = -1
                goto L_0x029a
            L_0x0276:
                r0 = 1073741824(0x40000000, float:2.0)
                if (r8 == r15) goto L_0x027f
                int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r0)
                goto L_0x0281
            L_0x027f:
                r6 = r16
            L_0x0281:
                if (r9 == r5) goto L_0x0287
                int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r0)
            L_0x0287:
                r10.measure(r6, r7)
                r1.setLastMeasureSpec(r6, r7)
                int r15 = r10.getMeasuredWidth()
                int r5 = r10.getMeasuredHeight()
                int r14 = r10.getBaseline()
                goto L_0x0274
            L_0x029a:
                if (r14 == r0) goto L_0x029e
                r0 = 1
                goto L_0x029f
            L_0x029e:
                r0 = 0
            L_0x029f:
                int r3 = r2.horizontalDimension
                if (r15 != r3) goto L_0x02aa
                int r3 = r2.verticalDimension
                if (r5 == r3) goto L_0x02a8
                goto L_0x02aa
            L_0x02a8:
                r3 = 0
                goto L_0x02ab
            L_0x02aa:
                r3 = 1
            L_0x02ab:
                r2.measuredNeedsSolverPass = r3
                boolean r3 = r13.needsBaseline
                if (r3 == 0) goto L_0x02b2
                r0 = 1
            L_0x02b2:
                if (r0 == 0) goto L_0x02c0
                r3 = -1
                if (r14 == r3) goto L_0x02c0
                int r1 = r18.getBaselineDistance()
                if (r1 == r14) goto L_0x02c0
                r1 = 1
                r2.measuredNeedsSolverPass = r1
            L_0x02c0:
                r2.measuredWidth = r15
                r2.measuredHeight = r5
                r2.measuredHasBaseline = r0
                r2.measuredBaseline = r14
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.Measurer.measure(androidx.constraintlayout.core.widgets.ConstraintWidget, androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measure):void");
        }
    }

    public ConstraintLayout(@NonNull Context context) {
        super(context);
        init((AttributeSet) null, 0, 0);
    }

    public ConstraintLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        init(attributeSet, 0, 0);
    }

    public ConstraintLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(attributeSet, i, 0);
    }

    @TargetApi(21)
    public ConstraintLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        init(attributeSet, i, i2);
    }

    private int getPaddingWidth() {
        int i = 0;
        int max = Math.max(0, getPaddingLeft()) + Math.max(0, getPaddingRight());
        if (Build.VERSION.SDK_INT >= 17) {
            i = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        }
        return i > 0 ? i : max;
    }

    public static SharedValues getSharedValues() {
        if (sSharedValues == null) {
            sSharedValues = new SharedValues();
        }
        return sSharedValues;
    }

    private final ConstraintWidget getTargetWidget(int i) {
        if (i == 0) {
            return this.mLayoutWidget;
        }
        View view = this.mChildrenByIds.get(i);
        if (view == null && (view = findViewById(i)) != null && view != this && view.getParent() == this) {
            onViewAdded(view);
        }
        if (view == this) {
            return this.mLayoutWidget;
        }
        if (view == null) {
            return null;
        }
        return ((LayoutParams) view.getLayoutParams()).widget;
    }

    private void init(AttributeSet attributeSet, int i, int i2) {
        this.mLayoutWidget.setCompanionWidget(this);
        this.mLayoutWidget.setMeasurer(this.mMeasurer);
        this.mChildrenByIds.put(getId(), this);
        this.mConstraintSet = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0218R.styleable.ConstraintLayout_Layout, i, i2);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = obtainStyledAttributes.getIndex(i3);
                if (index == C0218R.styleable.ConstraintLayout_Layout_android_minWidth) {
                    this.mMinWidth = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMinWidth);
                } else if (index == C0218R.styleable.ConstraintLayout_Layout_android_minHeight) {
                    this.mMinHeight = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMinHeight);
                } else if (index == C0218R.styleable.ConstraintLayout_Layout_android_maxWidth) {
                    this.mMaxWidth = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMaxWidth);
                } else if (index == C0218R.styleable.ConstraintLayout_Layout_android_maxHeight) {
                    this.mMaxHeight = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMaxHeight);
                } else if (index == C0218R.styleable.ConstraintLayout_Layout_layout_optimizationLevel) {
                    this.mOptimizationLevel = obtainStyledAttributes.getInt(index, this.mOptimizationLevel);
                } else if (index == C0218R.styleable.ConstraintLayout_Layout_layoutDescription) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            parseLayoutDescription(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.mConstraintLayoutSpec = null;
                        }
                    }
                } else if (index == C0218R.styleable.ConstraintLayout_Layout_constraintSet) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        ConstraintSet constraintSet = new ConstraintSet();
                        this.mConstraintSet = constraintSet;
                        constraintSet.load(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.mConstraintSet = null;
                    }
                    this.mConstraintSetId = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.mLayoutWidget.setOptimizationLevel(this.mOptimizationLevel);
    }

    private void markHierarchyDirty() {
        this.mDirtyHierarchy = true;
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
    }

    private void setChildrenConstraints() {
        boolean isInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            ConstraintWidget viewWidget = getViewWidget(getChildAt(i));
            if (viewWidget != null) {
                viewWidget.reset();
            }
        }
        if (isInEditMode) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    setDesignInformation(0, resourceName, Integer.valueOf(childAt.getId()));
                    int indexOf = resourceName.indexOf(47);
                    if (indexOf != -1) {
                        resourceName = resourceName.substring(indexOf + 1);
                    }
                    getTargetWidget(childAt.getId()).setDebugName(resourceName);
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.mConstraintSetId != -1) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt2 = getChildAt(i3);
                if (childAt2.getId() == this.mConstraintSetId && (childAt2 instanceof Constraints)) {
                    this.mConstraintSet = ((Constraints) childAt2).getConstraintSet();
                }
            }
        }
        ConstraintSet constraintSet = this.mConstraintSet;
        if (constraintSet != null) {
            constraintSet.applyToInternal(this, true);
        }
        this.mLayoutWidget.removeAllChildren();
        int size = this.mConstraintHelpers.size();
        if (size > 0) {
            for (int i4 = 0; i4 < size; i4++) {
                this.mConstraintHelpers.get(i4).updatePreLayout(this);
            }
        }
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt3 = getChildAt(i5);
            if (childAt3 instanceof Placeholder) {
                ((Placeholder) childAt3).updatePreLayout(this);
            }
        }
        this.mTempMapIdToWidget.clear();
        this.mTempMapIdToWidget.put(0, this.mLayoutWidget);
        this.mTempMapIdToWidget.put(getId(), this.mLayoutWidget);
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt4 = getChildAt(i6);
            this.mTempMapIdToWidget.put(childAt4.getId(), getViewWidget(childAt4));
        }
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt5 = getChildAt(i7);
            ConstraintWidget viewWidget2 = getViewWidget(childAt5);
            if (viewWidget2 != null) {
                this.mLayoutWidget.add(viewWidget2);
                applyConstraintsFromLayoutParams(isInEditMode, childAt5, viewWidget2, (LayoutParams) childAt5.getLayoutParams(), this.mTempMapIdToWidget);
            }
        }
    }

    private void setWidgetBaseline(ConstraintWidget constraintWidget, LayoutParams layoutParams, SparseArray<ConstraintWidget> sparseArray, int i, ConstraintAnchor.Type type) {
        View view = this.mChildrenByIds.get(i);
        ConstraintWidget constraintWidget2 = sparseArray.get(i);
        if (constraintWidget2 != null && view != null && (view.getLayoutParams() instanceof LayoutParams)) {
            layoutParams.needsBaseline = true;
            ConstraintAnchor.Type type2 = ConstraintAnchor.Type.BASELINE;
            if (type == type2) {
                LayoutParams layoutParams2 = (LayoutParams) view.getLayoutParams();
                layoutParams2.needsBaseline = true;
                layoutParams2.widget.setHasBaseline(true);
            }
            constraintWidget.getAnchor(type2).connect(constraintWidget2.getAnchor(type), layoutParams.baselineMargin, layoutParams.goneBaselineMargin, true);
            constraintWidget.setHasBaseline(true);
            constraintWidget.getAnchor(ConstraintAnchor.Type.TOP).reset();
            constraintWidget.getAnchor(ConstraintAnchor.Type.BOTTOM).reset();
        }
    }

    private boolean updateHierarchy() {
        int childCount = getChildCount();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            } else if (getChildAt(i).isLayoutRequested()) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z) {
            setChildrenConstraints();
        }
        return z;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x01b2  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x010c A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x016b  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0188  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0196  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01a9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void applyConstraintsFromLayoutParams(boolean r17, android.view.View r18, androidx.constraintlayout.core.widgets.ConstraintWidget r19, androidx.constraintlayout.widget.ConstraintLayout.LayoutParams r20, android.util.SparseArray<androidx.constraintlayout.core.widgets.ConstraintWidget> r21) {
        /*
            r16 = this;
            r0 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r20.validate()
            r9 = 0
            r7.helped = r9
            int r1 = r18.getVisibility()
            r6.setVisibility(r1)
            boolean r1 = r7.isInPlaceholder
            if (r1 == 0) goto L_0x0022
            r1 = 1
            r6.setInPlaceholder(r1)
            r1 = 8
            r6.setVisibility(r1)
        L_0x0022:
            r6.setCompanionWidget(r0)
            boolean r1 = r0 instanceof androidx.constraintlayout.widget.ConstraintHelper
            if (r1 == 0) goto L_0x0037
            androidx.constraintlayout.widget.ConstraintHelper r0 = (androidx.constraintlayout.widget.ConstraintHelper) r0
            r10 = r16
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r1 = r10.mLayoutWidget
            boolean r1 = r1.isRtl()
            r0.resolveRtl(r6, r1)
            goto L_0x0039
        L_0x0037:
            r10 = r16
        L_0x0039:
            boolean r0 = r7.isGuideline
            r1 = 17
            r11 = -1
            if (r0 == 0) goto L_0x006c
            r0 = r6
            androidx.constraintlayout.core.widgets.Guideline r0 = (androidx.constraintlayout.core.widgets.Guideline) r0
            int r2 = r7.resolvedGuideBegin
            int r3 = r7.resolvedGuideEnd
            float r4 = r7.resolvedGuidePercent
            int r5 = android.os.Build.VERSION.SDK_INT
            if (r5 >= r1) goto L_0x0053
            int r2 = r7.guideBegin
            int r3 = r7.guideEnd
            float r4 = r7.guidePercent
        L_0x0053:
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 == 0) goto L_0x005e
            r0.setGuidePercent((float) r4)
            goto L_0x0283
        L_0x005e:
            if (r2 == r11) goto L_0x0065
            r0.setGuideBegin(r2)
            goto L_0x0283
        L_0x0065:
            if (r3 == r11) goto L_0x0283
            r0.setGuideEnd(r3)
            goto L_0x0283
        L_0x006c:
            int r0 = r7.resolvedLeftToLeft
            int r2 = r7.resolvedLeftToRight
            int r3 = r7.resolvedRightToLeft
            int r4 = r7.resolvedRightToRight
            int r5 = r7.resolveGoneLeftMargin
            int r12 = r7.resolveGoneRightMargin
            float r13 = r7.resolvedHorizontalBias
            int r14 = android.os.Build.VERSION.SDK_INT
            if (r14 >= r1) goto L_0x00b6
            int r0 = r7.leftToLeft
            int r1 = r7.leftToRight
            int r3 = r7.rightToLeft
            int r4 = r7.rightToRight
            int r2 = r7.goneLeftMargin
            int r5 = r7.goneRightMargin
            float r13 = r7.horizontalBias
            if (r0 != r11) goto L_0x009b
            if (r1 != r11) goto L_0x009b
            int r12 = r7.startToStart
            if (r12 == r11) goto L_0x0096
            r0 = r12
            goto L_0x009b
        L_0x0096:
            int r12 = r7.startToEnd
            if (r12 == r11) goto L_0x009b
            r1 = r12
        L_0x009b:
            if (r3 != r11) goto L_0x00af
            if (r4 != r11) goto L_0x00af
            int r12 = r7.endToStart
            if (r12 == r11) goto L_0x00a4
            goto L_0x00b0
        L_0x00a4:
            int r12 = r7.endToEnd
            if (r12 == r11) goto L_0x00af
            r14 = r5
            r15 = r13
            r5 = r2
            r13 = r12
            r2 = r1
            r12 = r3
            goto L_0x00ba
        L_0x00af:
            r12 = r3
        L_0x00b0:
            r14 = r5
            r15 = r13
            r5 = r2
            r13 = r4
            r2 = r1
            goto L_0x00ba
        L_0x00b6:
            r14 = r12
            r15 = r13
            r12 = r3
            r13 = r4
        L_0x00ba:
            int r1 = r7.circleConstraint
            if (r1 == r11) goto L_0x00cf
            java.lang.Object r0 = r8.get(r1)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r0
            if (r0 == 0) goto L_0x01b5
            float r1 = r7.circleAngle
            int r2 = r7.circleRadius
            r6.connectCircularConstraint(r0, r1, r2)
            goto L_0x01b5
        L_0x00cf:
            if (r0 == r11) goto L_0x00e2
            java.lang.Object r0 = r8.get(r0)
            r2 = r0
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r2
            if (r2 == 0) goto L_0x00f8
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r3 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT
            int r4 = r7.leftMargin
            r0 = r19
            r1 = r3
            goto L_0x00f5
        L_0x00e2:
            if (r2 == r11) goto L_0x00f8
            java.lang.Object r0 = r8.get(r2)
            r2 = r0
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r2
            if (r2 == 0) goto L_0x00f8
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r3 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT
            int r4 = r7.leftMargin
            r0 = r19
        L_0x00f5:
            r0.immediateConnect(r1, r2, r3, r4, r5)
        L_0x00f8:
            if (r12 == r11) goto L_0x010c
            java.lang.Object r0 = r8.get(r12)
            r2 = r0
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r2
            if (r2 == 0) goto L_0x0122
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r3 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT
            int r4 = r7.rightMargin
            r0 = r19
            goto L_0x011e
        L_0x010c:
            if (r13 == r11) goto L_0x0122
            java.lang.Object r0 = r8.get(r13)
            r2 = r0
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r2
            if (r2 == 0) goto L_0x0122
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r3 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT
            int r4 = r7.rightMargin
            r0 = r19
            r1 = r3
        L_0x011e:
            r5 = r14
            r0.immediateConnect(r1, r2, r3, r4, r5)
        L_0x0122:
            int r0 = r7.topToTop
            if (r0 == r11) goto L_0x0139
            java.lang.Object r0 = r8.get(r0)
            r2 = r0
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r2
            if (r2 == 0) goto L_0x0153
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r3 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP
            int r4 = r7.topMargin
            int r5 = r7.goneTopMargin
            r0 = r19
            r1 = r3
            goto L_0x0150
        L_0x0139:
            int r0 = r7.topToBottom
            if (r0 == r11) goto L_0x0153
            java.lang.Object r0 = r8.get(r0)
            r2 = r0
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r2
            if (r2 == 0) goto L_0x0153
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r3 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM
            int r4 = r7.topMargin
            int r5 = r7.goneTopMargin
            r0 = r19
        L_0x0150:
            r0.immediateConnect(r1, r2, r3, r4, r5)
        L_0x0153:
            int r0 = r7.bottomToTop
            if (r0 == r11) goto L_0x016b
            java.lang.Object r0 = r8.get(r0)
            r2 = r0
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r2
            if (r2 == 0) goto L_0x0184
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r3 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP
            int r4 = r7.bottomMargin
            int r5 = r7.goneBottomMargin
            r0 = r19
            goto L_0x0181
        L_0x016b:
            int r0 = r7.bottomToBottom
            if (r0 == r11) goto L_0x0184
            java.lang.Object r0 = r8.get(r0)
            r2 = r0
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r2
            if (r2 == 0) goto L_0x0184
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r3 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM
            int r4 = r7.bottomMargin
            int r5 = r7.goneBottomMargin
            r0 = r19
            r1 = r3
        L_0x0181:
            r0.immediateConnect(r1, r2, r3, r4, r5)
        L_0x0184:
            int r4 = r7.baselineToBaseline
            if (r4 == r11) goto L_0x0196
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r5 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BASELINE
        L_0x018a:
            r0 = r16
            r1 = r19
            r2 = r20
            r3 = r21
            r0.setWidgetBaseline(r1, r2, r3, r4, r5)
            goto L_0x01a4
        L_0x0196:
            int r4 = r7.baselineToTop
            if (r4 == r11) goto L_0x019d
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r5 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP
            goto L_0x018a
        L_0x019d:
            int r4 = r7.baselineToBottom
            if (r4 == r11) goto L_0x01a4
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r5 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM
            goto L_0x018a
        L_0x01a4:
            r0 = 0
            int r1 = (r15 > r0 ? 1 : (r15 == r0 ? 0 : -1))
            if (r1 < 0) goto L_0x01ac
            r6.setHorizontalBiasPercent(r15)
        L_0x01ac:
            float r1 = r7.verticalBias
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x01b5
            r6.setVerticalBiasPercent(r1)
        L_0x01b5:
            if (r17 == 0) goto L_0x01c4
            int r0 = r7.editorAbsoluteX
            if (r0 != r11) goto L_0x01bf
            int r1 = r7.editorAbsoluteY
            if (r1 == r11) goto L_0x01c4
        L_0x01bf:
            int r1 = r7.editorAbsoluteY
            r6.setOrigin(r0, r1)
        L_0x01c4:
            boolean r0 = r7.horizontalDimensionFixed
            r1 = -2
            if (r0 != 0) goto L_0x01f7
            int r0 = r7.width
            if (r0 != r11) goto L_0x01ee
            boolean r0 = r7.constrainedWidth
            if (r0 == 0) goto L_0x01d4
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            goto L_0x01d6
        L_0x01d4:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT
        L_0x01d6:
            r6.setHorizontalDimensionBehaviour(r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r0 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r6.getAnchor(r0)
            int r2 = r7.leftMargin
            r0.mMargin = r2
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r0 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r6.getAnchor(r0)
            int r2 = r7.rightMargin
            r0.mMargin = r2
            goto L_0x020a
        L_0x01ee:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            r6.setHorizontalDimensionBehaviour(r0)
            r6.setWidth(r9)
            goto L_0x020a
        L_0x01f7:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r6.setHorizontalDimensionBehaviour(r0)
            int r0 = r7.width
            r6.setWidth(r0)
            int r0 = r7.width
            if (r0 != r1) goto L_0x020a
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            r6.setHorizontalDimensionBehaviour(r0)
        L_0x020a:
            boolean r0 = r7.verticalDimensionFixed
            if (r0 != 0) goto L_0x023c
            int r0 = r7.height
            if (r0 != r11) goto L_0x0233
            boolean r0 = r7.constrainedHeight
            if (r0 == 0) goto L_0x0219
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            goto L_0x021b
        L_0x0219:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT
        L_0x021b:
            r6.setVerticalDimensionBehaviour(r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r0 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r6.getAnchor(r0)
            int r1 = r7.topMargin
            r0.mMargin = r1
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r0 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r6.getAnchor(r0)
            int r1 = r7.bottomMargin
            r0.mMargin = r1
            goto L_0x024f
        L_0x0233:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            r6.setVerticalDimensionBehaviour(r0)
            r6.setHeight(r9)
            goto L_0x024f
        L_0x023c:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r6.setVerticalDimensionBehaviour(r0)
            int r0 = r7.height
            r6.setHeight(r0)
            int r0 = r7.height
            if (r0 != r1) goto L_0x024f
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            r6.setVerticalDimensionBehaviour(r0)
        L_0x024f:
            java.lang.String r0 = r7.dimensionRatio
            r6.setDimensionRatio(r0)
            float r0 = r7.horizontalWeight
            r6.setHorizontalWeight(r0)
            float r0 = r7.verticalWeight
            r6.setVerticalWeight(r0)
            int r0 = r7.horizontalChainStyle
            r6.setHorizontalChainStyle(r0)
            int r0 = r7.verticalChainStyle
            r6.setVerticalChainStyle(r0)
            int r0 = r7.wrapBehaviorInParent
            r6.setWrapBehaviorInParent(r0)
            int r0 = r7.matchConstraintDefaultWidth
            int r1 = r7.matchConstraintMinWidth
            int r2 = r7.matchConstraintMaxWidth
            float r3 = r7.matchConstraintPercentWidth
            r6.setHorizontalMatchStyle(r0, r1, r2, r3)
            int r0 = r7.matchConstraintDefaultHeight
            int r1 = r7.matchConstraintMinHeight
            int r2 = r7.matchConstraintMaxHeight
            float r3 = r7.matchConstraintPercentHeight
            r6.setVerticalMatchStyle(r0, r1, r2, r3)
        L_0x0283:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.applyConstraintsFromLayoutParams(boolean, android.view.View, androidx.constraintlayout.core.widgets.ConstraintWidget, androidx.constraintlayout.widget.ConstraintLayout$LayoutParams, android.util.SparseArray):void");
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<ConstraintHelper> arrayList = this.mConstraintHelpers;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                this.mConstraintHelpers.get(i).updatePreDraw(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = (float) getWidth();
            float height = (float) getHeight();
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (!(childAt.getVisibility() == 8 || (tag = childAt.getTag()) == null || !(tag instanceof String))) {
                    String[] split = ((String) tag).split(Constants.ACCEPT_TIME_SEPARATOR_SP);
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i3 = (int) ((((float) parseInt) / 1080.0f) * width);
                        int i4 = (int) ((((float) parseInt2) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(SupportMenu.CATEGORY_MASK);
                        float f = (float) i3;
                        float f2 = (float) (i3 + ((int) ((((float) parseInt3) / 1080.0f) * width)));
                        Canvas canvas2 = canvas;
                        float f3 = (float) i4;
                        float f4 = f;
                        float f5 = f;
                        float f6 = f3;
                        Paint paint2 = paint;
                        float f7 = f2;
                        Paint paint3 = paint2;
                        canvas2.drawLine(f4, f6, f7, f3, paint3);
                        float parseInt4 = (float) (i4 + ((int) ((((float) Integer.parseInt(split[3])) / 1920.0f) * height)));
                        float f8 = f2;
                        float f9 = parseInt4;
                        canvas2.drawLine(f8, f6, f7, f9, paint3);
                        float f10 = parseInt4;
                        float f11 = f5;
                        canvas2.drawLine(f8, f10, f11, f9, paint3);
                        float f12 = f5;
                        canvas2.drawLine(f12, f10, f11, f3, paint3);
                        Paint paint4 = paint2;
                        paint4.setColor(-16711936);
                        Paint paint5 = paint4;
                        float f13 = f2;
                        Paint paint6 = paint5;
                        canvas2.drawLine(f12, f3, f13, parseInt4, paint6);
                        canvas2.drawLine(f12, parseInt4, f13, f3, paint6);
                    }
                }
            }
        }
    }

    public void fillMetrics(Metrics metrics) {
        this.mMetrics = metrics;
        this.mLayoutWidget.fillMetrics(metrics);
    }

    public void forceLayout() {
        markHierarchyDirty();
        super.forceLayout();
    }

    /* access modifiers changed from: protected */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public Object getDesignInformation(int i, Object obj) {
        if (i != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap<String, Integer> hashMap = this.mDesignIds;
        if (hashMap == null || !hashMap.containsKey(str)) {
            return null;
        }
        return this.mDesignIds.get(str);
    }

    public int getMaxHeight() {
        return this.mMaxHeight;
    }

    public int getMaxWidth() {
        return this.mMaxWidth;
    }

    public int getMinHeight() {
        return this.mMinHeight;
    }

    public int getMinWidth() {
        return this.mMinWidth;
    }

    public int getOptimizationLevel() {
        return this.mLayoutWidget.getOptimizationLevel();
    }

    public String getSceneString() {
        int id;
        StringBuilder sb = new StringBuilder();
        if (this.mLayoutWidget.stringId == null) {
            int id2 = getId();
            if (id2 != -1) {
                this.mLayoutWidget.stringId = getContext().getResources().getResourceEntryName(id2);
            } else {
                this.mLayoutWidget.stringId = "parent";
            }
        }
        if (this.mLayoutWidget.getDebugName() == null) {
            ConstraintWidgetContainer constraintWidgetContainer = this.mLayoutWidget;
            constraintWidgetContainer.setDebugName(constraintWidgetContainer.stringId);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(" setDebugName ");
            sb2.append(this.mLayoutWidget.getDebugName());
        }
        Iterator<ConstraintWidget> it = this.mLayoutWidget.getChildren().iterator();
        while (it.hasNext()) {
            ConstraintWidget next = it.next();
            View view = (View) next.getCompanionWidget();
            if (view != null) {
                if (next.stringId == null && (id = view.getId()) != -1) {
                    next.stringId = getContext().getResources().getResourceEntryName(id);
                }
                if (next.getDebugName() == null) {
                    next.setDebugName(next.stringId);
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(" setDebugName ");
                    sb3.append(next.getDebugName());
                }
            }
        }
        this.mLayoutWidget.getSceneString(sb);
        return sb.toString();
    }

    public View getViewById(int i) {
        return this.mChildrenByIds.get(i);
    }

    public final ConstraintWidget getViewWidget(View view) {
        if (view == this) {
            return this.mLayoutWidget;
        }
        if (view == null) {
            return null;
        }
        if (!(view.getLayoutParams() instanceof LayoutParams)) {
            view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
            if (!(view.getLayoutParams() instanceof LayoutParams)) {
                return null;
            }
        }
        return ((LayoutParams) view.getLayoutParams()).widget;
    }

    /* access modifiers changed from: protected */
    public boolean isRtl() {
        if (Build.VERSION.SDK_INT < 17) {
            return false;
        }
        return ((getContext().getApplicationInfo().flags & 4194304) != 0) && 1 == getLayoutDirection();
    }

    public void loadLayoutDescription(int i) {
        if (i != 0) {
            try {
                this.mConstraintLayoutSpec = new ConstraintLayoutStates(getContext(), this, i);
                return;
            } catch (Resources.NotFoundException unused) {
            }
        }
        this.mConstraintLayoutSpec = null;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View content;
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            ConstraintWidget constraintWidget = layoutParams.widget;
            if ((childAt.getVisibility() != 8 || layoutParams.isGuideline || layoutParams.isHelper || layoutParams.isVirtualGroup || isInEditMode) && !layoutParams.isInPlaceholder) {
                int x = constraintWidget.getX();
                int y = constraintWidget.getY();
                int width = constraintWidget.getWidth() + x;
                int height = constraintWidget.getHeight() + y;
                childAt.layout(x, y, width, height);
                if ((childAt instanceof Placeholder) && (content = ((Placeholder) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(x, y, width, height);
                }
            }
        }
        int size = this.mConstraintHelpers.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                this.mConstraintHelpers.get(i6).updatePostLayout(this);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (this.mOnMeasureWidthMeasureSpec == i) {
            int i3 = this.mOnMeasureHeightMeasureSpec;
        }
        if (!this.mDirtyHierarchy) {
            int childCount = getChildCount();
            int i4 = 0;
            while (true) {
                if (i4 >= childCount) {
                    break;
                } else if (getChildAt(i4).isLayoutRequested()) {
                    this.mDirtyHierarchy = true;
                    break;
                } else {
                    i4++;
                }
            }
        }
        boolean z = this.mDirtyHierarchy;
        this.mOnMeasureWidthMeasureSpec = i;
        this.mOnMeasureHeightMeasureSpec = i2;
        this.mLayoutWidget.setRtl(isRtl());
        if (this.mDirtyHierarchy) {
            this.mDirtyHierarchy = false;
            if (updateHierarchy()) {
                this.mLayoutWidget.updateHierarchy();
            }
        }
        resolveSystem(this.mLayoutWidget, this.mOptimizationLevel, i, i2);
        resolveMeasuredDimension(i, i2, this.mLayoutWidget.getWidth(), this.mLayoutWidget.getHeight(), this.mLayoutWidget.isWidthMeasuredTooSmall(), this.mLayoutWidget.isHeightMeasuredTooSmall());
    }

    public void onViewAdded(View view) {
        super.onViewAdded(view);
        ConstraintWidget viewWidget = getViewWidget(view);
        if ((view instanceof Guideline) && !(viewWidget instanceof Guideline)) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            Guideline guideline = new Guideline();
            layoutParams.widget = guideline;
            layoutParams.isGuideline = true;
            guideline.setOrientation(layoutParams.orientation);
        }
        if (view instanceof ConstraintHelper) {
            ConstraintHelper constraintHelper = (ConstraintHelper) view;
            constraintHelper.validateParams();
            ((LayoutParams) view.getLayoutParams()).isHelper = true;
            if (!this.mConstraintHelpers.contains(constraintHelper)) {
                this.mConstraintHelpers.add(constraintHelper);
            }
        }
        this.mChildrenByIds.put(view.getId(), view);
        this.mDirtyHierarchy = true;
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.mChildrenByIds.remove(view.getId());
        this.mLayoutWidget.remove(getViewWidget(view));
        this.mConstraintHelpers.remove(view);
        this.mDirtyHierarchy = true;
    }

    /* access modifiers changed from: protected */
    public void parseLayoutDescription(int i) {
        this.mConstraintLayoutSpec = new ConstraintLayoutStates(getContext(), this, i);
    }

    public void requestLayout() {
        markHierarchyDirty();
        super.requestLayout();
    }

    /* access modifiers changed from: protected */
    public void resolveMeasuredDimension(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        Measurer measurer = this.mMeasurer;
        int i5 = measurer.paddingHeight;
        int resolveSizeAndState = ViewGroup.resolveSizeAndState(i3 + measurer.paddingWidth, i, 0);
        int resolveSizeAndState2 = ViewGroup.resolveSizeAndState(i4 + i5, i2, 0);
        int i6 = resolveSizeAndState & ViewCompat.MEASURED_SIZE_MASK;
        int i7 = resolveSizeAndState2 & ViewCompat.MEASURED_SIZE_MASK;
        int min = Math.min(this.mMaxWidth, i6);
        int min2 = Math.min(this.mMaxHeight, i7);
        if (z) {
            min |= 16777216;
        }
        if (z2) {
            min2 |= 16777216;
        }
        setMeasuredDimension(min, min2);
        this.mLastMeasureWidth = min;
        this.mLastMeasureHeight = min2;
    }

    /* access modifiers changed from: protected */
    public void resolveSystem(ConstraintWidgetContainer constraintWidgetContainer, int i, int i2, int i3) {
        int i4;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        int max = Math.max(0, getPaddingTop());
        int max2 = Math.max(0, getPaddingBottom());
        int i5 = max + max2;
        int paddingWidth = getPaddingWidth();
        this.mMeasurer.captureLayoutInfo(i2, i3, max, max2, paddingWidth, i5);
        if (Build.VERSION.SDK_INT >= 17) {
            int max3 = Math.max(0, getPaddingStart());
            int max4 = Math.max(0, getPaddingEnd());
            if (max3 <= 0 && max4 <= 0) {
                max3 = Math.max(0, getPaddingLeft());
            } else if (isRtl()) {
                max3 = max4;
            }
            i4 = max3;
        } else {
            i4 = Math.max(0, getPaddingLeft());
        }
        int i6 = size - paddingWidth;
        int i7 = size2 - i5;
        setSelfDimensionBehaviour(constraintWidgetContainer, mode, i6, mode2, i7);
        constraintWidgetContainer.measure(i, mode, i6, mode2, i7, this.mLastMeasureWidth, this.mLastMeasureHeight, i4, max);
    }

    public void setConstraintSet(ConstraintSet constraintSet) {
        this.mConstraintSet = constraintSet;
    }

    public void setDesignInformation(int i, Object obj, Object obj2) {
        if (i == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.mDesignIds == null) {
                this.mDesignIds = new HashMap<>();
            }
            String str = (String) obj;
            int indexOf = str.indexOf(MiotCloudImpl.COOKIE_PATH);
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.mDesignIds.put(str, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    public void setId(int i) {
        this.mChildrenByIds.remove(getId());
        super.setId(i);
        this.mChildrenByIds.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i != this.mMaxHeight) {
            this.mMaxHeight = i;
            requestLayout();
        }
    }

    public void setMaxWidth(int i) {
        if (i != this.mMaxWidth) {
            this.mMaxWidth = i;
            requestLayout();
        }
    }

    public void setMinHeight(int i) {
        if (i != this.mMinHeight) {
            this.mMinHeight = i;
            requestLayout();
        }
    }

    public void setMinWidth(int i) {
        if (i != this.mMinWidth) {
            this.mMinWidth = i;
            requestLayout();
        }
    }

    public void setOnConstraintsChanged(ConstraintsChangedListener constraintsChangedListener) {
        this.mConstraintsChangedListener = constraintsChangedListener;
        ConstraintLayoutStates constraintLayoutStates = this.mConstraintLayoutSpec;
        if (constraintLayoutStates != null) {
            constraintLayoutStates.setOnConstraintsChanged(constraintsChangedListener);
        }
    }

    public void setOptimizationLevel(int i) {
        this.mOptimizationLevel = i;
        this.mLayoutWidget.setOptimizationLevel(i);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002a, code lost:
        if (r3 == 0) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0044, code lost:
        if (r3 == 0) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0049, code lost:
        if (r3 == 0) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0025, code lost:
        if (r3 == 0) goto L_0x002c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0047  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setSelfDimensionBehaviour(androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r8, int r9, int r10, int r11, int r12) {
        /*
            r7 = this;
            androidx.constraintlayout.widget.ConstraintLayout$Measurer r0 = r7.mMeasurer
            int r1 = r0.paddingHeight
            int r0 = r0.paddingWidth
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            int r3 = r7.getChildCount()
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = 0
            if (r9 == r5) goto L_0x0028
            if (r9 == 0) goto L_0x0023
            if (r9 == r4) goto L_0x001a
            r9 = r2
        L_0x0018:
            r10 = 0
            goto L_0x0032
        L_0x001a:
            int r9 = r7.mMaxWidth
            int r9 = r9 - r0
            int r10 = java.lang.Math.min(r9, r10)
            r9 = r2
            goto L_0x0032
        L_0x0023:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r9 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r3 != 0) goto L_0x0018
            goto L_0x002c
        L_0x0028:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r9 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r3 != 0) goto L_0x0032
        L_0x002c:
            int r10 = r7.mMinWidth
            int r10 = java.lang.Math.max(r6, r10)
        L_0x0032:
            if (r11 == r5) goto L_0x0047
            if (r11 == 0) goto L_0x0042
            if (r11 == r4) goto L_0x003a
        L_0x0038:
            r12 = 0
            goto L_0x0051
        L_0x003a:
            int r11 = r7.mMaxHeight
            int r11 = r11 - r1
            int r12 = java.lang.Math.min(r11, r12)
            goto L_0x0051
        L_0x0042:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r3 != 0) goto L_0x0038
            goto L_0x004b
        L_0x0047:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r3 != 0) goto L_0x0051
        L_0x004b:
            int r11 = r7.mMinHeight
            int r12 = java.lang.Math.max(r6, r11)
        L_0x0051:
            int r11 = r8.getWidth()
            if (r10 != r11) goto L_0x005d
            int r11 = r8.getHeight()
            if (r12 == r11) goto L_0x0060
        L_0x005d:
            r8.invalidateMeasures()
        L_0x0060:
            r8.setX(r6)
            r8.setY(r6)
            int r11 = r7.mMaxWidth
            int r11 = r11 - r0
            r8.setMaxWidth(r11)
            int r11 = r7.mMaxHeight
            int r11 = r11 - r1
            r8.setMaxHeight(r11)
            r8.setMinWidth(r6)
            r8.setMinHeight(r6)
            r8.setHorizontalDimensionBehaviour(r9)
            r8.setWidth(r10)
            r8.setVerticalDimensionBehaviour(r2)
            r8.setHeight(r12)
            int r9 = r7.mMinWidth
            int r9 = r9 - r0
            r8.setMinWidth(r9)
            int r9 = r7.mMinHeight
            int r9 = r9 - r1
            r8.setMinHeight(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.setSelfDimensionBehaviour(androidx.constraintlayout.core.widgets.ConstraintWidgetContainer, int, int, int, int):void");
    }

    public void setState(int i, int i2, int i3) {
        ConstraintLayoutStates constraintLayoutStates = this.mConstraintLayoutSpec;
        if (constraintLayoutStates != null) {
            constraintLayoutStates.updateConstraints(i, (float) i2, (float) i3);
        }
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
