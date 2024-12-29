package androidx.constraintlayout.widget;

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
import androidx.appcompat.widget.ActivityChooserView;
import androidx.constraintlayout.solver.Metrics;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.solver.widgets.Guideline;
import androidx.core.internal.view.SupportMenu;
import com.miot.service.common.miotcloud.impl.MiotCloudImpl;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.HashMap;

public class ConstraintLayout extends ViewGroup {
    static final boolean ALLOWS_EMBEDDED = false;
    private static final boolean CACHE_MEASURED_DIMENSION = false;
    private static final boolean DEBUG = false;
    public static final int DESIGN_INFO_ID = 0;
    private static final String TAG = "ConstraintLayout";
    private static final boolean USE_CONSTRAINTS_HELPER = true;
    public static final String VERSION = "ConstraintLayout-1.1.3";
    SparseArray<View> mChildrenByIds = new SparseArray<>();
    private ArrayList<ConstraintHelper> mConstraintHelpers = new ArrayList<>(4);
    private ConstraintSet mConstraintSet = null;
    private int mConstraintSetId = -1;
    private HashMap<String, Integer> mDesignIds = new HashMap<>();
    private boolean mDirtyHierarchy = true;
    private int mLastMeasureHeight = -1;
    int mLastMeasureHeightMode = 0;
    int mLastMeasureHeightSize = -1;
    private int mLastMeasureWidth = -1;
    int mLastMeasureWidthMode = 0;
    int mLastMeasureWidthSize = -1;
    ConstraintWidgetContainer mLayoutWidget = new ConstraintWidgetContainer();
    private int mMaxHeight = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
    private int mMaxWidth = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
    private Metrics mMetrics;
    private int mMinHeight = 0;
    private int mMinWidth = 0;
    private int mOptimizationLevel = 7;
    private final ArrayList<ConstraintWidget> mVariableDimensionsWidgets = new ArrayList<>(100);

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public static final int BASELINE = 5;
        public static final int BOTTOM = 4;
        public static final int CHAIN_PACKED = 2;
        public static final int CHAIN_SPREAD = 0;
        public static final int CHAIN_SPREAD_INSIDE = 1;
        public static final int END = 7;
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
        public int baselineToBaseline = -1;
        public int bottomToBottom = -1;
        public int bottomToTop = -1;
        public float circleAngle = 0.0f;
        public int circleConstraint = -1;
        public int circleRadius = 0;
        public boolean constrainedHeight = false;
        public boolean constrainedWidth = false;
        public String dimensionRatio = null;
        int dimensionRatioSide = 1;
        float dimensionRatioValue = 0.0f;
        public int editorAbsoluteX = -1;
        public int editorAbsoluteY = -1;
        public int endToEnd = -1;
        public int endToStart = -1;
        public int goneBottomMargin = -1;
        public int goneEndMargin = -1;
        public int goneLeftMargin = -1;
        public int goneRightMargin = -1;
        public int goneStartMargin = -1;
        public int goneTopMargin = -1;
        public int guideBegin = -1;
        public int guideEnd = -1;
        public float guidePercent = -1.0f;
        public boolean helped = false;
        public float horizontalBias = 0.5f;
        public int horizontalChainStyle = 0;
        boolean horizontalDimensionFixed = true;
        public float horizontalWeight = -1.0f;
        boolean isGuideline = false;
        boolean isHelper = false;
        boolean isInPlaceholder = false;
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
        int resolveGoneLeftMargin = -1;
        int resolveGoneRightMargin = -1;
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

        private static class Table {
            public static final int ANDROID_ORIENTATION = 1;
            public static final int LAYOUT_CONSTRAINED_HEIGHT = 28;
            public static final int LAYOUT_CONSTRAINED_WIDTH = 27;
            public static final int LAYOUT_CONSTRAINT_BASELINE_CREATOR = 43;
            public static final int LAYOUT_CONSTRAINT_BASELINE_TO_BASELINE_OF = 16;
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
            public static final int LAYOUT_CONSTRAINT_TOP_CREATOR = 40;
            public static final int LAYOUT_CONSTRAINT_TOP_TO_BOTTOM_OF = 13;
            public static final int LAYOUT_CONSTRAINT_TOP_TO_TOP_OF = 12;
            public static final int LAYOUT_CONSTRAINT_VERTICAL_BIAS = 30;
            public static final int LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE = 48;
            public static final int LAYOUT_CONSTRAINT_VERTICAL_WEIGHT = 46;
            public static final int LAYOUT_CONSTRAINT_WIDTH_DEFAULT = 31;
            public static final int LAYOUT_CONSTRAINT_WIDTH_MAX = 34;
            public static final int LAYOUT_CONSTRAINT_WIDTH_MIN = 33;
            public static final int LAYOUT_CONSTRAINT_WIDTH_PERCENT = 35;
            public static final int LAYOUT_EDITOR_ABSOLUTEX = 49;
            public static final int LAYOUT_EDITOR_ABSOLUTEY = 50;
            public static final int LAYOUT_GONE_MARGIN_BOTTOM = 24;
            public static final int LAYOUT_GONE_MARGIN_END = 26;
            public static final int LAYOUT_GONE_MARGIN_LEFT = 21;
            public static final int LAYOUT_GONE_MARGIN_RIGHT = 23;
            public static final int LAYOUT_GONE_MARGIN_START = 25;
            public static final int LAYOUT_GONE_MARGIN_TOP = 22;
            public static final int UNUSED = 0;
            public static final SparseIntArray map;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                map = sparseIntArray;
                sparseIntArray.append(C0140R.styleable.ConstraintLayout_Layout_layout_constraintLeft_toLeftOf, 8);
                map.append(C0140R.styleable.ConstraintLayout_Layout_layout_constraintLeft_toRightOf, 9);
                map.append(C0140R.styleable.ConstraintLayout_Layout_layout_constraintRight_toLeftOf, 10);
                map.append(C0140R.styleable.ConstraintLayout_Layout_layout_constraintRight_toRightOf, 11);
                map.append(C0140R.styleable.ConstraintLayout_Layout_layout_constraintTop_toTopOf, 12);
                map.append(C0140R.styleable.ConstraintLayout_Layout_layout_constraintTop_toBottomOf, 13);
                map.append(C0140R.styleable.ConstraintLayout_Layout_layout_constraintBottom_toTopOf, 14);
                map.append(C0140R.styleable.ConstraintLayout_Layout_layout_constraintBottom_toBottomOf, 15);
                map.append(C0140R.styleable.ConstraintLayout_Layout_layout_constraintBaseline_toBaselineOf, 16);
                map.append(C0140R.styleable.ConstraintLayout_Layout_layout_constraintCircle, 2);
                map.append(C0140R.styleable.ConstraintLayout_Layout_layout_constraintCircleRadius, 3);
                map.append(C0140R.styleable.ConstraintLayout_Layout_layout_constraintCircleAngle, 4);
                map.append(C0140R.styleable.ConstraintLayout_Layout_layout_editor_absoluteX, 49);
                map.append(C0140R.styleable.ConstraintLayout_Layout_layout_editor_absoluteY, 50);
                map.append(C0140R.styleable.ConstraintLayout_Layout_layout_constraintGuide_begin, 5);
                map.append(C0140R.styleable.ConstraintLayout_Layout_layout_constraintGuide_end, 6);
                map.append(C0140R.styleable.ConstraintLayout_Layout_layout_constraintGuide_percent, 7);
                map.append(C0140R.styleable.ConstraintLayout_Layout_android_orientation, 1);
                map.append(C0140R.styleable.ConstraintLayout_Layout_layout_constraintStart_toEndOf, 17);
                map.append(C0140R.styleable.ConstraintLayout_Layout_layout_constraintStart_toStartOf, 18);
                map.append(C0140R.styleable.ConstraintLayout_Layout_layout_constraintEnd_toStartOf, 19);
                map.append(C0140R.styleable.ConstraintLayout_Layout_layout_constraintEnd_toEndOf, 20);
                map.append(C0140R.styleable.ConstraintLayout_Layout_layout_goneMarginLeft, 21);
                map.append(C0140R.styleable.ConstraintLayout_Layout_layout_goneMarginTop, 22);
                map.append(C0140R.styleable.ConstraintLayout_Layout_layout_goneMarginRight, 23);
                map.append(C0140R.styleable.ConstraintLayout_Layout_layout_goneMarginBottom, 24);
                map.append(C0140R.styleable.ConstraintLayout_Layout_layout_goneMarginStart, 25);
                map.append(C0140R.styleable.ConstraintLayout_Layout_layout_goneMarginEnd, 26);
                map.append(C0140R.styleable.ConstraintLayout_Layout_layout_constraintHorizontal_bias, 29);
                map.append(C0140R.styleable.ConstraintLayout_Layout_layout_constraintVertical_bias, 30);
                map.append(C0140R.styleable.ConstraintLayout_Layout_layout_constraintDimensionRatio, 44);
                map.append(C0140R.styleable.ConstraintLayout_Layout_layout_constraintHorizontal_weight, 45);
                map.append(C0140R.styleable.ConstraintLayout_Layout_layout_constraintVertical_weight, 46);
                map.append(C0140R.styleable.ConstraintLayout_Layout_layout_constraintHorizontal_chainStyle, 47);
                map.append(C0140R.styleable.ConstraintLayout_Layout_layout_constraintVertical_chainStyle, 48);
                map.append(C0140R.styleable.ConstraintLayout_Layout_layout_constrainedWidth, 27);
                map.append(C0140R.styleable.ConstraintLayout_Layout_layout_constrainedHeight, 28);
                map.append(C0140R.styleable.ConstraintLayout_Layout_layout_constraintWidth_default, 31);
                map.append(C0140R.styleable.ConstraintLayout_Layout_layout_constraintHeight_default, 32);
                map.append(C0140R.styleable.ConstraintLayout_Layout_layout_constraintWidth_min, 33);
                map.append(C0140R.styleable.ConstraintLayout_Layout_layout_constraintWidth_max, 34);
                map.append(C0140R.styleable.ConstraintLayout_Layout_layout_constraintWidth_percent, 35);
                map.append(C0140R.styleable.ConstraintLayout_Layout_layout_constraintHeight_min, 36);
                map.append(C0140R.styleable.ConstraintLayout_Layout_layout_constraintHeight_max, 37);
                map.append(C0140R.styleable.ConstraintLayout_Layout_layout_constraintHeight_percent, 38);
                map.append(C0140R.styleable.ConstraintLayout_Layout_layout_constraintLeft_creator, 39);
                map.append(C0140R.styleable.ConstraintLayout_Layout_layout_constraintTop_creator, 40);
                map.append(C0140R.styleable.ConstraintLayout_Layout_layout_constraintRight_creator, 41);
                map.append(C0140R.styleable.ConstraintLayout_Layout_layout_constraintBottom_creator, 42);
                map.append(C0140R.styleable.ConstraintLayout_Layout_layout_constraintBaseline_creator, 43);
            }

            private Table() {
            }
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            int i;
            float parseFloat;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0140R.styleable.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                int i3 = Table.map.get(index);
                switch (i3) {
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
                        break;
                    default:
                        switch (i3) {
                            case 44:
                                String string = obtainStyledAttributes.getString(index);
                                this.dimensionRatio = string;
                                this.dimensionRatioValue = Float.NaN;
                                this.dimensionRatioSide = -1;
                                if (string == null) {
                                    break;
                                } else {
                                    int length = string.length();
                                    int indexOf = this.dimensionRatio.indexOf(44);
                                    if (indexOf <= 0 || indexOf >= length - 1) {
                                        i = 0;
                                    } else {
                                        String substring = this.dimensionRatio.substring(0, indexOf);
                                        if (substring.equalsIgnoreCase("W")) {
                                            this.dimensionRatioSide = 0;
                                        } else if (substring.equalsIgnoreCase("H")) {
                                            this.dimensionRatioSide = 1;
                                        }
                                        i = indexOf + 1;
                                    }
                                    int indexOf2 = this.dimensionRatio.indexOf(58);
                                    if (indexOf2 >= 0 && indexOf2 < length - 1) {
                                        String substring2 = this.dimensionRatio.substring(i, indexOf2);
                                        String substring3 = this.dimensionRatio.substring(indexOf2 + 1);
                                        if (substring2.length() > 0 && substring3.length() > 0) {
                                            try {
                                                float parseFloat2 = Float.parseFloat(substring2);
                                                float parseFloat3 = Float.parseFloat(substring3);
                                                parseFloat = (parseFloat2 > 0.0f && parseFloat3 > 0.0f) ? this.dimensionRatioSide == 1 ? Math.abs(parseFloat3 / parseFloat2) : Math.abs(parseFloat2 / parseFloat3) : parseFloat;
                                            } catch (NumberFormatException unused5) {
                                                break;
                                            }
                                        }
                                    } else {
                                        String substring4 = this.dimensionRatio.substring(i);
                                        if (substring4.length() <= 0) {
                                            break;
                                        } else {
                                            parseFloat = Float.parseFloat(substring4);
                                        }
                                    }
                                    this.dimensionRatioValue = parseFloat;
                                    break;
                                }
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
            this.leftToLeft = layoutParams.leftToLeft;
            this.leftToRight = layoutParams.leftToRight;
            this.rightToLeft = layoutParams.rightToLeft;
            this.rightToRight = layoutParams.rightToRight;
            this.topToTop = layoutParams.topToTop;
            this.topToBottom = layoutParams.topToBottom;
            this.bottomToTop = layoutParams.bottomToTop;
            this.bottomToBottom = layoutParams.bottomToBottom;
            this.baselineToBaseline = layoutParams.baselineToBaseline;
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
            this.widget = layoutParams.widget;
        }

        public void reset() {
            ConstraintWidget constraintWidget = this.widget;
            if (constraintWidget != null) {
                constraintWidget.reset();
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:71:0x00d6, code lost:
            if (r1 > 0) goto L_0x00d8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:77:0x00e5, code lost:
            if (r1 > 0) goto L_0x00d8;
         */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x004c  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0053  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x005a  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0060  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0066  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x007c  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x0084  */
        /* JADX WARNING: Removed duplicated region for block: B:80:0x00ec  */
        /* JADX WARNING: Removed duplicated region for block: B:84:0x00f7  */
        @android.annotation.TargetApi(17)
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void resolveLayoutDirection(int r7) {
            /*
                r6 = this;
                int r0 = r6.leftMargin
                int r1 = r6.rightMargin
                super.resolveLayoutDirection(r7)
                r7 = -1
                r6.resolvedRightToLeft = r7
                r6.resolvedRightToRight = r7
                r6.resolvedLeftToLeft = r7
                r6.resolvedLeftToRight = r7
                r6.resolveGoneLeftMargin = r7
                r6.resolveGoneRightMargin = r7
                int r2 = r6.goneLeftMargin
                r6.resolveGoneLeftMargin = r2
                int r2 = r6.goneRightMargin
                r6.resolveGoneRightMargin = r2
                float r2 = r6.horizontalBias
                r6.resolvedHorizontalBias = r2
                int r2 = r6.guideBegin
                r6.resolvedGuideBegin = r2
                int r2 = r6.guideEnd
                r6.resolvedGuideEnd = r2
                float r2 = r6.guidePercent
                r6.resolvedGuidePercent = r2
                int r2 = r6.getLayoutDirection()
                r3 = 0
                r4 = 1
                if (r4 != r2) goto L_0x0036
                r2 = 1
                goto L_0x0037
            L_0x0036:
                r2 = 0
            L_0x0037:
                if (r2 == 0) goto L_0x0098
                int r2 = r6.startToEnd
                if (r2 == r7) goto L_0x0041
                r6.resolvedRightToLeft = r2
            L_0x003f:
                r3 = 1
                goto L_0x0048
            L_0x0041:
                int r2 = r6.startToStart
                if (r2 == r7) goto L_0x0048
                r6.resolvedRightToRight = r2
                goto L_0x003f
            L_0x0048:
                int r2 = r6.endToStart
                if (r2 == r7) goto L_0x004f
                r6.resolvedLeftToRight = r2
                r3 = 1
            L_0x004f:
                int r2 = r6.endToEnd
                if (r2 == r7) goto L_0x0056
                r6.resolvedLeftToLeft = r2
                r3 = 1
            L_0x0056:
                int r2 = r6.goneStartMargin
                if (r2 == r7) goto L_0x005c
                r6.resolveGoneRightMargin = r2
            L_0x005c:
                int r2 = r6.goneEndMargin
                if (r2 == r7) goto L_0x0062
                r6.resolveGoneLeftMargin = r2
            L_0x0062:
                r2 = 1065353216(0x3f800000, float:1.0)
                if (r3 == 0) goto L_0x006c
                float r3 = r6.horizontalBias
                float r3 = r2 - r3
                r6.resolvedHorizontalBias = r3
            L_0x006c:
                boolean r3 = r6.isGuideline
                if (r3 == 0) goto L_0x00bc
                int r3 = r6.orientation
                if (r3 != r4) goto L_0x00bc
                float r3 = r6.guidePercent
                r4 = -1082130432(0xffffffffbf800000, float:-1.0)
                int r5 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
                if (r5 == 0) goto L_0x0084
                float r2 = r2 - r3
                r6.resolvedGuidePercent = r2
                r6.resolvedGuideBegin = r7
                r6.resolvedGuideEnd = r7
                goto L_0x00bc
            L_0x0084:
                int r2 = r6.guideBegin
                if (r2 == r7) goto L_0x008f
                r6.resolvedGuideEnd = r2
                r6.resolvedGuideBegin = r7
            L_0x008c:
                r6.resolvedGuidePercent = r4
                goto L_0x00bc
            L_0x008f:
                int r2 = r6.guideEnd
                if (r2 == r7) goto L_0x00bc
                r6.resolvedGuideBegin = r2
                r6.resolvedGuideEnd = r7
                goto L_0x008c
            L_0x0098:
                int r2 = r6.startToEnd
                if (r2 == r7) goto L_0x009e
                r6.resolvedLeftToRight = r2
            L_0x009e:
                int r2 = r6.startToStart
                if (r2 == r7) goto L_0x00a4
                r6.resolvedLeftToLeft = r2
            L_0x00a4:
                int r2 = r6.endToStart
                if (r2 == r7) goto L_0x00aa
                r6.resolvedRightToLeft = r2
            L_0x00aa:
                int r2 = r6.endToEnd
                if (r2 == r7) goto L_0x00b0
                r6.resolvedRightToRight = r2
            L_0x00b0:
                int r2 = r6.goneStartMargin
                if (r2 == r7) goto L_0x00b6
                r6.resolveGoneLeftMargin = r2
            L_0x00b6:
                int r2 = r6.goneEndMargin
                if (r2 == r7) goto L_0x00bc
                r6.resolveGoneRightMargin = r2
            L_0x00bc:
                int r2 = r6.endToStart
                if (r2 != r7) goto L_0x0104
                int r2 = r6.endToEnd
                if (r2 != r7) goto L_0x0104
                int r2 = r6.startToStart
                if (r2 != r7) goto L_0x0104
                int r2 = r6.startToEnd
                if (r2 != r7) goto L_0x0104
                int r2 = r6.rightToLeft
                if (r2 == r7) goto L_0x00db
                r6.resolvedRightToLeft = r2
                int r2 = r6.rightMargin
                if (r2 > 0) goto L_0x00e8
                if (r1 <= 0) goto L_0x00e8
            L_0x00d8:
                r6.rightMargin = r1
                goto L_0x00e8
            L_0x00db:
                int r2 = r6.rightToRight
                if (r2 == r7) goto L_0x00e8
                r6.resolvedRightToRight = r2
                int r2 = r6.rightMargin
                if (r2 > 0) goto L_0x00e8
                if (r1 <= 0) goto L_0x00e8
                goto L_0x00d8
            L_0x00e8:
                int r1 = r6.leftToLeft
                if (r1 == r7) goto L_0x00f7
                r6.resolvedLeftToLeft = r1
                int r7 = r6.leftMargin
                if (r7 > 0) goto L_0x0104
                if (r0 <= 0) goto L_0x0104
            L_0x00f4:
                r6.leftMargin = r0
                goto L_0x0104
            L_0x00f7:
                int r1 = r6.leftToRight
                if (r1 == r7) goto L_0x0104
                r6.resolvedLeftToRight = r1
                int r7 = r6.leftMargin
                if (r7 > 0) goto L_0x0104
                if (r0 <= 0) goto L_0x0104
                goto L_0x00f4
            L_0x0104:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.LayoutParams.resolveLayoutDirection(int):void");
        }

        public void validate() {
            this.isGuideline = false;
            this.horizontalDimensionFixed = true;
            this.verticalDimensionFixed = true;
            if (this.width == -2 && this.constrainedWidth) {
                this.horizontalDimensionFixed = false;
                this.matchConstraintDefaultWidth = 1;
            }
            if (this.height == -2 && this.constrainedHeight) {
                this.verticalDimensionFixed = false;
                this.matchConstraintDefaultHeight = 1;
            }
            int i = this.width;
            if (i == 0 || i == -1) {
                this.horizontalDimensionFixed = false;
                if (this.width == 0 && this.matchConstraintDefaultWidth == 1) {
                    this.width = -2;
                    this.constrainedWidth = true;
                }
            }
            int i2 = this.height;
            if (i2 == 0 || i2 == -1) {
                this.verticalDimensionFixed = false;
                if (this.height == 0 && this.matchConstraintDefaultHeight == 1) {
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

    public ConstraintLayout(Context context) {
        super(context);
        init((AttributeSet) null);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(attributeSet);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(attributeSet);
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

    private void init(AttributeSet attributeSet) {
        this.mLayoutWidget.setCompanionWidget(this);
        this.mChildrenByIds.put(getId(), this);
        this.mConstraintSet = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0140R.styleable.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0140R.styleable.ConstraintLayout_Layout_android_minWidth) {
                    this.mMinWidth = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMinWidth);
                } else if (index == C0140R.styleable.ConstraintLayout_Layout_android_minHeight) {
                    this.mMinHeight = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMinHeight);
                } else if (index == C0140R.styleable.ConstraintLayout_Layout_android_maxWidth) {
                    this.mMaxWidth = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMaxWidth);
                } else if (index == C0140R.styleable.ConstraintLayout_Layout_android_maxHeight) {
                    this.mMaxHeight = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMaxHeight);
                } else if (index == C0140R.styleable.ConstraintLayout_Layout_layout_optimizationLevel) {
                    this.mOptimizationLevel = obtainStyledAttributes.getInt(index, this.mOptimizationLevel);
                } else if (index == C0140R.styleable.ConstraintLayout_Layout_constraintSet) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        ConstraintSet constraintSet = new ConstraintSet();
                        this.mConstraintSet = constraintSet;
                        constraintSet.load(getContext(), resourceId);
                    } catch (Resources.NotFoundException unused) {
                        this.mConstraintSet = null;
                    }
                    this.mConstraintSetId = resourceId;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.mLayoutWidget.setOptimizationLevel(this.mOptimizationLevel);
    }

    private void internalMeasureChildren(int i, int i2) {
        boolean z;
        boolean z2;
        int baseline;
        int i3;
        int i4;
        int i5 = i;
        int i6 = i2;
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                ConstraintWidget constraintWidget = layoutParams.widget;
                if (!layoutParams.isGuideline && !layoutParams.isHelper) {
                    constraintWidget.setVisibility(childAt.getVisibility());
                    int i8 = layoutParams.width;
                    int i9 = layoutParams.height;
                    boolean z3 = layoutParams.horizontalDimensionFixed;
                    if (z3 || layoutParams.verticalDimensionFixed || (!z3 && layoutParams.matchConstraintDefaultWidth == 1) || layoutParams.width == -1 || (!layoutParams.verticalDimensionFixed && (layoutParams.matchConstraintDefaultHeight == 1 || layoutParams.height == -1))) {
                        if (i8 == 0) {
                            i3 = ViewGroup.getChildMeasureSpec(i5, paddingLeft, -2);
                            z2 = true;
                        } else if (i8 == -1) {
                            i3 = ViewGroup.getChildMeasureSpec(i5, paddingLeft, -1);
                            z2 = false;
                        } else {
                            z2 = i8 == -2;
                            i3 = ViewGroup.getChildMeasureSpec(i5, paddingLeft, i8);
                        }
                        if (i9 == 0) {
                            i4 = ViewGroup.getChildMeasureSpec(i6, paddingTop, -2);
                            z = true;
                        } else if (i9 == -1) {
                            i4 = ViewGroup.getChildMeasureSpec(i6, paddingTop, -1);
                            z = false;
                        } else {
                            z = i9 == -2;
                            i4 = ViewGroup.getChildMeasureSpec(i6, paddingTop, i9);
                        }
                        childAt.measure(i3, i4);
                        Metrics metrics = this.mMetrics;
                        if (metrics != null) {
                            metrics.measures++;
                        }
                        constraintWidget.setWidthWrapContent(i8 == -2);
                        constraintWidget.setHeightWrapContent(i9 == -2);
                        i8 = childAt.getMeasuredWidth();
                        i9 = childAt.getMeasuredHeight();
                    } else {
                        z2 = false;
                        z = false;
                    }
                    constraintWidget.setWidth(i8);
                    constraintWidget.setHeight(i9);
                    if (z2) {
                        constraintWidget.setWrapWidth(i8);
                    }
                    if (z) {
                        constraintWidget.setWrapHeight(i9);
                    }
                    if (layoutParams.needsBaseline && (baseline = childAt.getBaseline()) != -1) {
                        constraintWidget.setBaselineDistance(baseline);
                    }
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:108:0x0209  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0242  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0266  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x026f  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0274  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0276  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x027c  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x027e  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0292  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0297  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x029c  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x02a4  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x02ad  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x02b5  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x02c2  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x02cd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void internalMeasureDimensions(int r24, int r25) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r25
            int r3 = r23.getPaddingTop()
            int r4 = r23.getPaddingBottom()
            int r3 = r3 + r4
            int r4 = r23.getPaddingLeft()
            int r5 = r23.getPaddingRight()
            int r4 = r4 + r5
            int r5 = r23.getChildCount()
            r7 = 0
        L_0x001d:
            r8 = 1
            r10 = 8
            r12 = -2
            if (r7 >= r5) goto L_0x00dc
            android.view.View r14 = r0.getChildAt(r7)
            int r15 = r14.getVisibility()
            if (r15 != r10) goto L_0x0030
            goto L_0x00d4
        L_0x0030:
            android.view.ViewGroup$LayoutParams r10 = r14.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r10 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r10
            androidx.constraintlayout.solver.widgets.ConstraintWidget r15 = r10.widget
            boolean r6 = r10.isGuideline
            if (r6 != 0) goto L_0x00d4
            boolean r6 = r10.isHelper
            if (r6 == 0) goto L_0x0042
            goto L_0x00d4
        L_0x0042:
            int r6 = r14.getVisibility()
            r15.setVisibility(r6)
            int r6 = r10.width
            int r13 = r10.height
            if (r6 == 0) goto L_0x00c4
            if (r13 != 0) goto L_0x0053
            goto L_0x00c4
        L_0x0053:
            if (r6 != r12) goto L_0x0058
            r16 = 1
            goto L_0x005a
        L_0x0058:
            r16 = 0
        L_0x005a:
            int r11 = android.view.ViewGroup.getChildMeasureSpec(r1, r4, r6)
            if (r13 != r12) goto L_0x0063
            r17 = 1
            goto L_0x0065
        L_0x0063:
            r17 = 0
        L_0x0065:
            int r12 = android.view.ViewGroup.getChildMeasureSpec(r2, r3, r13)
            r14.measure(r11, r12)
            androidx.constraintlayout.solver.Metrics r11 = r0.mMetrics
            r12 = r3
            if (r11 == 0) goto L_0x0076
            long r2 = r11.measures
            long r2 = r2 + r8
            r11.measures = r2
        L_0x0076:
            r2 = -2
            if (r6 != r2) goto L_0x007b
            r3 = 1
            goto L_0x007c
        L_0x007b:
            r3 = 0
        L_0x007c:
            r15.setWidthWrapContent(r3)
            if (r13 != r2) goto L_0x0083
            r13 = 1
            goto L_0x0084
        L_0x0083:
            r13 = 0
        L_0x0084:
            r15.setHeightWrapContent(r13)
            int r2 = r14.getMeasuredWidth()
            int r3 = r14.getMeasuredHeight()
            r15.setWidth(r2)
            r15.setHeight(r3)
            if (r16 == 0) goto L_0x009a
            r15.setWrapWidth(r2)
        L_0x009a:
            if (r17 == 0) goto L_0x009f
            r15.setWrapHeight(r3)
        L_0x009f:
            boolean r6 = r10.needsBaseline
            if (r6 == 0) goto L_0x00ad
            int r6 = r14.getBaseline()
            r8 = -1
            if (r6 == r8) goto L_0x00ad
            r15.setBaselineDistance(r6)
        L_0x00ad:
            boolean r6 = r10.horizontalDimensionFixed
            if (r6 == 0) goto L_0x00d5
            boolean r6 = r10.verticalDimensionFixed
            if (r6 == 0) goto L_0x00d5
            androidx.constraintlayout.solver.widgets.ResolutionDimension r6 = r15.getResolutionWidth()
            r6.resolve(r2)
            androidx.constraintlayout.solver.widgets.ResolutionDimension r2 = r15.getResolutionHeight()
            r2.resolve(r3)
            goto L_0x00d5
        L_0x00c4:
            r12 = r3
            androidx.constraintlayout.solver.widgets.ResolutionDimension r2 = r15.getResolutionWidth()
            r2.invalidate()
            androidx.constraintlayout.solver.widgets.ResolutionDimension r2 = r15.getResolutionHeight()
            r2.invalidate()
            goto L_0x00d5
        L_0x00d4:
            r12 = r3
        L_0x00d5:
            int r7 = r7 + 1
            r2 = r25
            r3 = r12
            goto L_0x001d
        L_0x00dc:
            r12 = r3
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r2 = r0.mLayoutWidget
            r2.solveGraph()
            r2 = 0
        L_0x00e3:
            if (r2 >= r5) goto L_0x02e6
            android.view.View r3 = r0.getChildAt(r2)
            int r6 = r3.getVisibility()
            if (r6 != r10) goto L_0x00f1
            goto L_0x02cf
        L_0x00f1:
            android.view.ViewGroup$LayoutParams r6 = r3.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r6 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r6
            androidx.constraintlayout.solver.widgets.ConstraintWidget r7 = r6.widget
            boolean r11 = r6.isGuideline
            if (r11 != 0) goto L_0x02cf
            boolean r11 = r6.isHelper
            if (r11 == 0) goto L_0x0103
            goto L_0x02cf
        L_0x0103:
            int r11 = r3.getVisibility()
            r7.setVisibility(r11)
            int r11 = r6.width
            int r13 = r6.height
            if (r11 == 0) goto L_0x0114
            if (r13 == 0) goto L_0x0114
            goto L_0x02cf
        L_0x0114:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r14 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.LEFT
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r14 = r7.getAnchor(r14)
            androidx.constraintlayout.solver.widgets.ResolutionAnchor r14 = r14.getResolutionNode()
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r15 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r15 = r7.getAnchor(r15)
            androidx.constraintlayout.solver.widgets.ResolutionAnchor r15 = r15.getResolutionNode()
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r10 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.LEFT
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r10 = r7.getAnchor(r10)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r10 = r10.getTarget()
            if (r10 == 0) goto L_0x0142
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r10 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r10 = r7.getAnchor(r10)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r10 = r10.getTarget()
            if (r10 == 0) goto L_0x0142
            r10 = 1
            goto L_0x0143
        L_0x0142:
            r10 = 0
        L_0x0143:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r8 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.TOP
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r8 = r7.getAnchor(r8)
            androidx.constraintlayout.solver.widgets.ResolutionAnchor r8 = r8.getResolutionNode()
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r9 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r7.getAnchor(r9)
            androidx.constraintlayout.solver.widgets.ResolutionAnchor r9 = r9.getResolutionNode()
            r17 = r5
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r5 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.TOP
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r5 = r7.getAnchor(r5)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r5 = r5.getTarget()
            if (r5 == 0) goto L_0x0173
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r5 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r5 = r7.getAnchor(r5)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r5 = r5.getTarget()
            if (r5 == 0) goto L_0x0173
            r5 = 1
            goto L_0x0174
        L_0x0173:
            r5 = 0
        L_0x0174:
            if (r11 != 0) goto L_0x0187
            if (r13 != 0) goto L_0x0187
            if (r10 == 0) goto L_0x0187
            if (r5 == 0) goto L_0x0187
            r5 = r25
            r6 = r0
            r20 = r2
            r2 = -1
            r8 = -2
            r18 = 1
            goto L_0x02da
        L_0x0187:
            r20 = r2
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r2 = r0.mLayoutWidget
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r2 = r2.getHorizontalDimensionBehaviour()
            r21 = r6
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r2 == r6) goto L_0x0197
            r2 = 1
            goto L_0x0198
        L_0x0197:
            r2 = 0
        L_0x0198:
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r6 = r0.mLayoutWidget
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r6 = r6.getVerticalDimensionBehaviour()
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r0 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r6 == r0) goto L_0x01a4
            r0 = 1
            goto L_0x01a5
        L_0x01a4:
            r0 = 0
        L_0x01a5:
            if (r2 != 0) goto L_0x01ae
            androidx.constraintlayout.solver.widgets.ResolutionDimension r6 = r7.getResolutionWidth()
            r6.invalidate()
        L_0x01ae:
            if (r0 != 0) goto L_0x01b7
            androidx.constraintlayout.solver.widgets.ResolutionDimension r6 = r7.getResolutionHeight()
            r6.invalidate()
        L_0x01b7:
            if (r11 != 0) goto L_0x01ee
            if (r2 == 0) goto L_0x01e5
            boolean r6 = r7.isSpreadWidth()
            if (r6 == 0) goto L_0x01e5
            if (r10 == 0) goto L_0x01e5
            boolean r6 = r14.isResolved()
            if (r6 == 0) goto L_0x01e5
            boolean r6 = r15.isResolved()
            if (r6 == 0) goto L_0x01e5
            float r6 = r15.getResolvedValue()
            float r10 = r14.getResolvedValue()
            float r6 = r6 - r10
            int r11 = (int) r6
            androidx.constraintlayout.solver.widgets.ResolutionDimension r6 = r7.getResolutionWidth()
            r6.resolve(r11)
            int r6 = android.view.ViewGroup.getChildMeasureSpec(r1, r4, r11)
            goto L_0x01f7
        L_0x01e5:
            r6 = -2
            int r2 = android.view.ViewGroup.getChildMeasureSpec(r1, r4, r6)
            r6 = r2
            r2 = 0
            r10 = 1
            goto L_0x0207
        L_0x01ee:
            r6 = -2
            r10 = -1
            if (r11 != r10) goto L_0x01f9
            int r14 = android.view.ViewGroup.getChildMeasureSpec(r1, r4, r10)
            r6 = r14
        L_0x01f7:
            r10 = 0
            goto L_0x0207
        L_0x01f9:
            if (r11 != r6) goto L_0x01fd
            r6 = 1
            goto L_0x01fe
        L_0x01fd:
            r6 = 0
        L_0x01fe:
            int r10 = android.view.ViewGroup.getChildMeasureSpec(r1, r4, r11)
            r22 = r10
            r10 = r6
            r6 = r22
        L_0x0207:
            if (r13 != 0) goto L_0x0242
            if (r0 == 0) goto L_0x0237
            boolean r14 = r7.isSpreadHeight()
            if (r14 == 0) goto L_0x0237
            if (r5 == 0) goto L_0x0237
            boolean r5 = r8.isResolved()
            if (r5 == 0) goto L_0x0237
            boolean r5 = r9.isResolved()
            if (r5 == 0) goto L_0x0237
            float r5 = r9.getResolvedValue()
            float r8 = r8.getResolvedValue()
            float r5 = r5 - r8
            int r13 = (int) r5
            androidx.constraintlayout.solver.widgets.ResolutionDimension r5 = r7.getResolutionHeight()
            r5.resolve(r13)
            r5 = r25
            int r8 = android.view.ViewGroup.getChildMeasureSpec(r5, r12, r13)
            goto L_0x024d
        L_0x0237:
            r5 = r25
            r8 = -2
            int r0 = android.view.ViewGroup.getChildMeasureSpec(r5, r12, r8)
            r8 = r0
            r0 = 0
            r9 = 1
            goto L_0x025d
        L_0x0242:
            r5 = r25
            r8 = -2
            r9 = -1
            if (r13 != r9) goto L_0x024f
            int r14 = android.view.ViewGroup.getChildMeasureSpec(r5, r12, r9)
            r8 = r14
        L_0x024d:
            r9 = 0
            goto L_0x025d
        L_0x024f:
            if (r13 != r8) goto L_0x0253
            r8 = 1
            goto L_0x0254
        L_0x0253:
            r8 = 0
        L_0x0254:
            int r9 = android.view.ViewGroup.getChildMeasureSpec(r5, r12, r13)
            r22 = r9
            r9 = r8
            r8 = r22
        L_0x025d:
            r3.measure(r6, r8)
            r6 = r23
            androidx.constraintlayout.solver.Metrics r8 = r6.mMetrics
            if (r8 == 0) goto L_0x026f
            long r14 = r8.measures
            r18 = 1
            long r14 = r14 + r18
            r8.measures = r14
            goto L_0x0271
        L_0x026f:
            r18 = 1
        L_0x0271:
            r8 = -2
            if (r11 != r8) goto L_0x0276
            r11 = 1
            goto L_0x0277
        L_0x0276:
            r11 = 0
        L_0x0277:
            r7.setWidthWrapContent(r11)
            if (r13 != r8) goto L_0x027e
            r11 = 1
            goto L_0x027f
        L_0x027e:
            r11 = 0
        L_0x027f:
            r7.setHeightWrapContent(r11)
            int r11 = r3.getMeasuredWidth()
            int r13 = r3.getMeasuredHeight()
            r7.setWidth(r11)
            r7.setHeight(r13)
            if (r10 == 0) goto L_0x0295
            r7.setWrapWidth(r11)
        L_0x0295:
            if (r9 == 0) goto L_0x029a
            r7.setWrapHeight(r13)
        L_0x029a:
            if (r2 == 0) goto L_0x02a4
            androidx.constraintlayout.solver.widgets.ResolutionDimension r2 = r7.getResolutionWidth()
            r2.resolve(r11)
            goto L_0x02ab
        L_0x02a4:
            androidx.constraintlayout.solver.widgets.ResolutionDimension r2 = r7.getResolutionWidth()
            r2.remove()
        L_0x02ab:
            if (r0 == 0) goto L_0x02b5
            androidx.constraintlayout.solver.widgets.ResolutionDimension r0 = r7.getResolutionHeight()
            r0.resolve(r13)
            goto L_0x02bc
        L_0x02b5:
            androidx.constraintlayout.solver.widgets.ResolutionDimension r0 = r7.getResolutionHeight()
            r0.remove()
        L_0x02bc:
            r0 = r21
            boolean r0 = r0.needsBaseline
            if (r0 == 0) goto L_0x02cd
            int r0 = r3.getBaseline()
            r2 = -1
            if (r0 == r2) goto L_0x02da
            r7.setBaselineDistance(r0)
            goto L_0x02da
        L_0x02cd:
            r2 = -1
            goto L_0x02da
        L_0x02cf:
            r6 = r0
            r20 = r2
            r17 = r5
            r18 = r8
            r2 = -1
            r8 = -2
            r5 = r25
        L_0x02da:
            int r0 = r20 + 1
            r2 = r0
            r0 = r6
            r5 = r17
            r8 = r18
            r10 = 8
            goto L_0x00e3
        L_0x02e6:
            r6 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.internalMeasureDimensions(int, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:118:0x01d6, code lost:
        if (r11 != -1) goto L_0x01da;
     */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x01e3  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x01e7  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0203  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0212  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x023d  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x024b A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0262  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0271  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x028b  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x029b  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x02b4  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x0336  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x035b  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x0369  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x0392  */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x03a1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void setChildrenConstraints() {
        /*
            r26 = this;
            r0 = r26
            boolean r1 = r26.isInEditMode()
            int r2 = r26.getChildCount()
            r3 = 0
            r4 = -1
            if (r1 == 0) goto L_0x0048
            r5 = 0
        L_0x000f:
            if (r5 >= r2) goto L_0x0048
            android.view.View r6 = r0.getChildAt(r5)
            android.content.res.Resources r7 = r26.getResources()     // Catch:{ NotFoundException -> 0x0045 }
            int r8 = r6.getId()     // Catch:{ NotFoundException -> 0x0045 }
            java.lang.String r7 = r7.getResourceName(r8)     // Catch:{ NotFoundException -> 0x0045 }
            int r8 = r6.getId()     // Catch:{ NotFoundException -> 0x0045 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ NotFoundException -> 0x0045 }
            r0.setDesignInformation(r3, r7, r8)     // Catch:{ NotFoundException -> 0x0045 }
            r8 = 47
            int r8 = r7.indexOf(r8)     // Catch:{ NotFoundException -> 0x0045 }
            if (r8 == r4) goto L_0x003a
            int r8 = r8 + 1
            java.lang.String r7 = r7.substring(r8)     // Catch:{ NotFoundException -> 0x0045 }
        L_0x003a:
            int r6 = r6.getId()     // Catch:{ NotFoundException -> 0x0045 }
            androidx.constraintlayout.solver.widgets.ConstraintWidget r6 = r0.getTargetWidget(r6)     // Catch:{ NotFoundException -> 0x0045 }
            r6.setDebugName(r7)     // Catch:{ NotFoundException -> 0x0045 }
        L_0x0045:
            int r5 = r5 + 1
            goto L_0x000f
        L_0x0048:
            r5 = 0
        L_0x0049:
            if (r5 >= r2) goto L_0x005c
            android.view.View r6 = r0.getChildAt(r5)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r6 = r0.getViewWidget(r6)
            if (r6 != 0) goto L_0x0056
            goto L_0x0059
        L_0x0056:
            r6.reset()
        L_0x0059:
            int r5 = r5 + 1
            goto L_0x0049
        L_0x005c:
            int r5 = r0.mConstraintSetId
            if (r5 == r4) goto L_0x007e
            r5 = 0
        L_0x0061:
            if (r5 >= r2) goto L_0x007e
            android.view.View r6 = r0.getChildAt(r5)
            int r7 = r6.getId()
            int r8 = r0.mConstraintSetId
            if (r7 != r8) goto L_0x007b
            boolean r7 = r6 instanceof androidx.constraintlayout.widget.Constraints
            if (r7 == 0) goto L_0x007b
            androidx.constraintlayout.widget.Constraints r6 = (androidx.constraintlayout.widget.Constraints) r6
            androidx.constraintlayout.widget.ConstraintSet r6 = r6.getConstraintSet()
            r0.mConstraintSet = r6
        L_0x007b:
            int r5 = r5 + 1
            goto L_0x0061
        L_0x007e:
            androidx.constraintlayout.widget.ConstraintSet r5 = r0.mConstraintSet
            if (r5 == 0) goto L_0x0085
            r5.applyToInternal(r0)
        L_0x0085:
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r5 = r0.mLayoutWidget
            r5.removeAllChildren()
            java.util.ArrayList<androidx.constraintlayout.widget.ConstraintHelper> r5 = r0.mConstraintHelpers
            int r5 = r5.size()
            if (r5 <= 0) goto L_0x00a3
            r6 = 0
        L_0x0093:
            if (r6 >= r5) goto L_0x00a3
            java.util.ArrayList<androidx.constraintlayout.widget.ConstraintHelper> r7 = r0.mConstraintHelpers
            java.lang.Object r7 = r7.get(r6)
            androidx.constraintlayout.widget.ConstraintHelper r7 = (androidx.constraintlayout.widget.ConstraintHelper) r7
            r7.updatePreLayout(r0)
            int r6 = r6 + 1
            goto L_0x0093
        L_0x00a3:
            r5 = 0
        L_0x00a4:
            if (r5 >= r2) goto L_0x00b6
            android.view.View r6 = r0.getChildAt(r5)
            boolean r7 = r6 instanceof androidx.constraintlayout.widget.Placeholder
            if (r7 == 0) goto L_0x00b3
            androidx.constraintlayout.widget.Placeholder r6 = (androidx.constraintlayout.widget.Placeholder) r6
            r6.updatePreLayout(r0)
        L_0x00b3:
            int r5 = r5 + 1
            goto L_0x00a4
        L_0x00b6:
            r5 = 0
        L_0x00b7:
            if (r5 >= r2) goto L_0x03d2
            android.view.View r6 = r0.getChildAt(r5)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r13 = r0.getViewWidget(r6)
            if (r13 != 0) goto L_0x00c5
            goto L_0x03ce
        L_0x00c5:
            android.view.ViewGroup$LayoutParams r7 = r6.getLayoutParams()
            r14 = r7
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r14 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r14
            r14.validate()
            boolean r7 = r14.helped
            if (r7 == 0) goto L_0x00d6
            r14.helped = r3
            goto L_0x0108
        L_0x00d6:
            if (r1 == 0) goto L_0x0108
            android.content.res.Resources r7 = r26.getResources()     // Catch:{ NotFoundException -> 0x0107 }
            int r8 = r6.getId()     // Catch:{ NotFoundException -> 0x0107 }
            java.lang.String r7 = r7.getResourceName(r8)     // Catch:{ NotFoundException -> 0x0107 }
            int r8 = r6.getId()     // Catch:{ NotFoundException -> 0x0107 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ NotFoundException -> 0x0107 }
            r0.setDesignInformation(r3, r7, r8)     // Catch:{ NotFoundException -> 0x0107 }
            java.lang.String r8 = "id/"
            int r8 = r7.indexOf(r8)     // Catch:{ NotFoundException -> 0x0107 }
            int r8 = r8 + 3
            java.lang.String r7 = r7.substring(r8)     // Catch:{ NotFoundException -> 0x0107 }
            int r8 = r6.getId()     // Catch:{ NotFoundException -> 0x0107 }
            androidx.constraintlayout.solver.widgets.ConstraintWidget r8 = r0.getTargetWidget(r8)     // Catch:{ NotFoundException -> 0x0107 }
            r8.setDebugName(r7)     // Catch:{ NotFoundException -> 0x0107 }
            goto L_0x0108
        L_0x0107:
        L_0x0108:
            int r7 = r6.getVisibility()
            r13.setVisibility(r7)
            boolean r7 = r14.isInPlaceholder
            if (r7 == 0) goto L_0x0118
            r7 = 8
            r13.setVisibility(r7)
        L_0x0118:
            r13.setCompanionWidget(r6)
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r6 = r0.mLayoutWidget
            r6.add((androidx.constraintlayout.solver.widgets.ConstraintWidget) r13)
            boolean r6 = r14.verticalDimensionFixed
            if (r6 == 0) goto L_0x0128
            boolean r6 = r14.horizontalDimensionFixed
            if (r6 != 0) goto L_0x012d
        L_0x0128:
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.ConstraintWidget> r6 = r0.mVariableDimensionsWidgets
            r6.add(r13)
        L_0x012d:
            boolean r6 = r14.isGuideline
            r7 = 17
            if (r6 == 0) goto L_0x015e
            androidx.constraintlayout.solver.widgets.Guideline r13 = (androidx.constraintlayout.solver.widgets.Guideline) r13
            int r6 = r14.resolvedGuideBegin
            int r8 = r14.resolvedGuideEnd
            float r9 = r14.resolvedGuidePercent
            int r10 = android.os.Build.VERSION.SDK_INT
            if (r10 >= r7) goto L_0x0145
            int r6 = r14.guideBegin
            int r8 = r14.guideEnd
            float r9 = r14.guidePercent
        L_0x0145:
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r7 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r7 == 0) goto L_0x0150
            r13.setGuidePercent((float) r9)
            goto L_0x03ce
        L_0x0150:
            if (r6 == r4) goto L_0x0157
            r13.setGuideBegin(r6)
            goto L_0x03ce
        L_0x0157:
            if (r8 == r4) goto L_0x03ce
            r13.setGuideEnd(r8)
            goto L_0x03ce
        L_0x015e:
            int r6 = r14.leftToLeft
            if (r6 != r4) goto L_0x01a6
            int r6 = r14.leftToRight
            if (r6 != r4) goto L_0x01a6
            int r6 = r14.rightToLeft
            if (r6 != r4) goto L_0x01a6
            int r6 = r14.rightToRight
            if (r6 != r4) goto L_0x01a6
            int r6 = r14.startToStart
            if (r6 != r4) goto L_0x01a6
            int r6 = r14.startToEnd
            if (r6 != r4) goto L_0x01a6
            int r6 = r14.endToStart
            if (r6 != r4) goto L_0x01a6
            int r6 = r14.endToEnd
            if (r6 != r4) goto L_0x01a6
            int r6 = r14.topToTop
            if (r6 != r4) goto L_0x01a6
            int r6 = r14.topToBottom
            if (r6 != r4) goto L_0x01a6
            int r6 = r14.bottomToTop
            if (r6 != r4) goto L_0x01a6
            int r6 = r14.bottomToBottom
            if (r6 != r4) goto L_0x01a6
            int r6 = r14.baselineToBaseline
            if (r6 != r4) goto L_0x01a6
            int r6 = r14.editorAbsoluteX
            if (r6 != r4) goto L_0x01a6
            int r6 = r14.editorAbsoluteY
            if (r6 != r4) goto L_0x01a6
            int r6 = r14.circleConstraint
            if (r6 != r4) goto L_0x01a6
            int r6 = r14.width
            if (r6 == r4) goto L_0x01a6
            int r6 = r14.height
            if (r6 != r4) goto L_0x03ce
        L_0x01a6:
            int r6 = r14.resolvedLeftToLeft
            int r8 = r14.resolvedLeftToRight
            int r9 = r14.resolvedRightToLeft
            int r10 = r14.resolvedRightToRight
            int r11 = r14.resolveGoneLeftMargin
            int r12 = r14.resolveGoneRightMargin
            float r15 = r14.resolvedHorizontalBias
            int r3 = android.os.Build.VERSION.SDK_INT
            if (r3 >= r7) goto L_0x01f9
            int r3 = r14.leftToLeft
            int r6 = r14.leftToRight
            int r9 = r14.rightToLeft
            int r10 = r14.rightToRight
            int r7 = r14.goneLeftMargin
            int r8 = r14.goneRightMargin
            float r15 = r14.horizontalBias
            if (r3 != r4) goto L_0x01d9
            if (r6 != r4) goto L_0x01d9
            int r11 = r14.startToStart
            if (r11 == r4) goto L_0x01d4
            r25 = r11
            r11 = r6
            r6 = r25
            goto L_0x01db
        L_0x01d4:
            int r11 = r14.startToEnd
            if (r11 == r4) goto L_0x01d9
            goto L_0x01da
        L_0x01d9:
            r11 = r6
        L_0x01da:
            r6 = r3
        L_0x01db:
            if (r9 != r4) goto L_0x01f3
            if (r10 != r4) goto L_0x01f3
            int r3 = r14.endToStart
            if (r3 == r4) goto L_0x01e7
            r12 = r7
            r16 = r8
            goto L_0x01f7
        L_0x01e7:
            int r3 = r14.endToEnd
            if (r3 == r4) goto L_0x01f3
            r12 = r7
            r16 = r8
            r8 = r11
            r11 = r15
            r15 = r3
            r3 = r9
            goto L_0x01ff
        L_0x01f3:
            r12 = r7
            r16 = r8
            r3 = r9
        L_0x01f7:
            r8 = r11
            goto L_0x01fd
        L_0x01f9:
            r3 = r9
            r16 = r12
            r12 = r11
        L_0x01fd:
            r11 = r15
            r15 = r10
        L_0x01ff:
            int r7 = r14.circleConstraint
            if (r7 == r4) goto L_0x0212
            androidx.constraintlayout.solver.widgets.ConstraintWidget r3 = r0.getTargetWidget(r7)
            if (r3 == 0) goto L_0x0321
            float r6 = r14.circleAngle
            int r7 = r14.circleRadius
            r13.connectCircularConstraint(r3, r6, r7)
            goto L_0x0321
        L_0x0212:
            if (r6 == r4) goto L_0x0227
            androidx.constraintlayout.solver.widgets.ConstraintWidget r9 = r0.getTargetWidget(r6)
            if (r9 == 0) goto L_0x0224
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r10 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.LEFT
            int r6 = r14.leftMargin
            r7 = r13
            r8 = r10
            r17 = r11
            r11 = r6
            goto L_0x0238
        L_0x0224:
            r17 = r11
            goto L_0x023b
        L_0x0227:
            r17 = r11
            if (r8 == r4) goto L_0x023b
            androidx.constraintlayout.solver.widgets.ConstraintWidget r9 = r0.getTargetWidget(r8)
            if (r9 == 0) goto L_0x023b
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r8 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.LEFT
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r10 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT
            int r11 = r14.leftMargin
            r7 = r13
        L_0x0238:
            r7.immediateConnect(r8, r9, r10, r11, r12)
        L_0x023b:
            if (r3 == r4) goto L_0x024b
            androidx.constraintlayout.solver.widgets.ConstraintWidget r9 = r0.getTargetWidget(r3)
            if (r9 == 0) goto L_0x025e
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r8 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r10 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.LEFT
            int r11 = r14.rightMargin
            r7 = r13
            goto L_0x0259
        L_0x024b:
            if (r15 == r4) goto L_0x025e
            androidx.constraintlayout.solver.widgets.ConstraintWidget r9 = r0.getTargetWidget(r15)
            if (r9 == 0) goto L_0x025e
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r10 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT
            int r11 = r14.rightMargin
            r7 = r13
            r8 = r10
        L_0x0259:
            r12 = r16
            r7.immediateConnect(r8, r9, r10, r11, r12)
        L_0x025e:
            int r3 = r14.topToTop
            if (r3 == r4) goto L_0x0271
            androidx.constraintlayout.solver.widgets.ConstraintWidget r9 = r0.getTargetWidget(r3)
            if (r9 == 0) goto L_0x0287
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r10 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.TOP
            int r11 = r14.topMargin
            int r12 = r14.goneTopMargin
            r7 = r13
            r8 = r10
            goto L_0x0284
        L_0x0271:
            int r3 = r14.topToBottom
            if (r3 == r4) goto L_0x0287
            androidx.constraintlayout.solver.widgets.ConstraintWidget r9 = r0.getTargetWidget(r3)
            if (r9 == 0) goto L_0x0287
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r8 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.TOP
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r10 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM
            int r11 = r14.topMargin
            int r12 = r14.goneTopMargin
            r7 = r13
        L_0x0284:
            r7.immediateConnect(r8, r9, r10, r11, r12)
        L_0x0287:
            int r3 = r14.bottomToTop
            if (r3 == r4) goto L_0x029b
            androidx.constraintlayout.solver.widgets.ConstraintWidget r9 = r0.getTargetWidget(r3)
            if (r9 == 0) goto L_0x02b0
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r8 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r10 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.TOP
            int r11 = r14.bottomMargin
            int r12 = r14.goneBottomMargin
            r7 = r13
            goto L_0x02ad
        L_0x029b:
            int r3 = r14.bottomToBottom
            if (r3 == r4) goto L_0x02b0
            androidx.constraintlayout.solver.widgets.ConstraintWidget r9 = r0.getTargetWidget(r3)
            if (r9 == 0) goto L_0x02b0
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r10 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM
            int r11 = r14.bottomMargin
            int r12 = r14.goneBottomMargin
            r7 = r13
            r8 = r10
        L_0x02ad:
            r7.immediateConnect(r8, r9, r10, r11, r12)
        L_0x02b0:
            int r3 = r14.baselineToBaseline
            if (r3 == r4) goto L_0x0304
            android.util.SparseArray<android.view.View> r6 = r0.mChildrenByIds
            java.lang.Object r3 = r6.get(r3)
            android.view.View r3 = (android.view.View) r3
            int r6 = r14.baselineToBaseline
            androidx.constraintlayout.solver.widgets.ConstraintWidget r6 = r0.getTargetWidget(r6)
            if (r6 == 0) goto L_0x0304
            if (r3 == 0) goto L_0x0304
            android.view.ViewGroup$LayoutParams r7 = r3.getLayoutParams()
            boolean r7 = r7 instanceof androidx.constraintlayout.widget.ConstraintLayout.LayoutParams
            if (r7 == 0) goto L_0x0304
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r3 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r3
            r7 = 1
            r14.needsBaseline = r7
            r3.needsBaseline = r7
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r3 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BASELINE
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r18 = r13.getAnchor(r3)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r3 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BASELINE
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r19 = r6.getAnchor(r3)
            r20 = 0
            r21 = -1
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Strength r22 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Strength.STRONG
            r23 = 0
            r24 = 1
            r18.connect(r19, r20, r21, r22, r23, r24)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r3 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.TOP
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r13.getAnchor(r3)
            r3.reset()
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r3 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r13.getAnchor(r3)
            r3.reset()
        L_0x0304:
            r3 = 1056964608(0x3f000000, float:0.5)
            r6 = 0
            r15 = r17
            int r7 = (r15 > r6 ? 1 : (r15 == r6 ? 0 : -1))
            if (r7 < 0) goto L_0x0314
            int r7 = (r15 > r3 ? 1 : (r15 == r3 ? 0 : -1))
            if (r7 == 0) goto L_0x0314
            r13.setHorizontalBiasPercent(r15)
        L_0x0314:
            float r7 = r14.verticalBias
            int r6 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
            if (r6 < 0) goto L_0x0321
            int r3 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r3 == 0) goto L_0x0321
            r13.setVerticalBiasPercent(r7)
        L_0x0321:
            if (r1 == 0) goto L_0x0332
            int r3 = r14.editorAbsoluteX
            if (r3 != r4) goto L_0x032b
            int r3 = r14.editorAbsoluteY
            if (r3 == r4) goto L_0x0332
        L_0x032b:
            int r3 = r14.editorAbsoluteX
            int r6 = r14.editorAbsoluteY
            r13.setOrigin(r3, r6)
        L_0x0332:
            boolean r3 = r14.horizontalDimensionFixed
            if (r3 != 0) goto L_0x035b
            int r3 = r14.width
            if (r3 != r4) goto L_0x0354
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT
            r13.setHorizontalDimensionBehaviour(r3)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r3 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.LEFT
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r13.getAnchor(r3)
            int r6 = r14.leftMargin
            r3.mMargin = r6
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r3 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r13.getAnchor(r3)
            int r6 = r14.rightMargin
            r3.mMargin = r6
            goto L_0x0365
        L_0x0354:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            r13.setHorizontalDimensionBehaviour(r3)
            r3 = 0
            goto L_0x0362
        L_0x035b:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r13.setHorizontalDimensionBehaviour(r3)
            int r3 = r14.width
        L_0x0362:
            r13.setWidth(r3)
        L_0x0365:
            boolean r3 = r14.verticalDimensionFixed
            if (r3 != 0) goto L_0x0392
            int r3 = r14.height
            if (r3 != r4) goto L_0x0388
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT
            r13.setVerticalDimensionBehaviour(r3)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r3 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.TOP
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r13.getAnchor(r3)
            int r6 = r14.topMargin
            r3.mMargin = r6
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r3 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r13.getAnchor(r3)
            int r6 = r14.bottomMargin
            r3.mMargin = r6
            r3 = 0
            goto L_0x039d
        L_0x0388:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            r13.setVerticalDimensionBehaviour(r3)
            r3 = 0
            r13.setHeight(r3)
            goto L_0x039d
        L_0x0392:
            r3 = 0
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r13.setVerticalDimensionBehaviour(r6)
            int r6 = r14.height
            r13.setHeight(r6)
        L_0x039d:
            java.lang.String r6 = r14.dimensionRatio
            if (r6 == 0) goto L_0x03a4
            r13.setDimensionRatio(r6)
        L_0x03a4:
            float r6 = r14.horizontalWeight
            r13.setHorizontalWeight(r6)
            float r6 = r14.verticalWeight
            r13.setVerticalWeight(r6)
            int r6 = r14.horizontalChainStyle
            r13.setHorizontalChainStyle(r6)
            int r6 = r14.verticalChainStyle
            r13.setVerticalChainStyle(r6)
            int r6 = r14.matchConstraintDefaultWidth
            int r7 = r14.matchConstraintMinWidth
            int r8 = r14.matchConstraintMaxWidth
            float r9 = r14.matchConstraintPercentWidth
            r13.setHorizontalMatchStyle(r6, r7, r8, r9)
            int r6 = r14.matchConstraintDefaultHeight
            int r7 = r14.matchConstraintMinHeight
            int r8 = r14.matchConstraintMaxHeight
            float r9 = r14.matchConstraintPercentHeight
            r13.setVerticalMatchStyle(r6, r7, r8, r9)
        L_0x03ce:
            int r5 = r5 + 1
            goto L_0x00b7
        L_0x03d2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.setChildrenConstraints():void");
    }

    private void setSelfDimensionBehaviour(int i, int i2) {
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        int i3;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.FIXED;
        getLayoutParams();
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            } else if (mode != 1073741824) {
                dimensionBehaviour = dimensionBehaviour2;
            } else {
                i3 = Math.min(this.mMaxWidth, size) - paddingLeft;
                dimensionBehaviour = dimensionBehaviour2;
            }
            i3 = 0;
        } else {
            i3 = size;
            dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        }
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 == 0) {
                dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            } else if (mode2 == 1073741824) {
                size2 = Math.min(this.mMaxHeight, size2) - paddingTop;
            }
            size2 = 0;
        } else {
            dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        }
        this.mLayoutWidget.setMinWidth(0);
        this.mLayoutWidget.setMinHeight(0);
        this.mLayoutWidget.setHorizontalDimensionBehaviour(dimensionBehaviour);
        this.mLayoutWidget.setWidth(i3);
        this.mLayoutWidget.setVerticalDimensionBehaviour(dimensionBehaviour2);
        this.mLayoutWidget.setHeight(size2);
        this.mLayoutWidget.setMinWidth((this.mMinWidth - getPaddingLeft()) - getPaddingRight());
        this.mLayoutWidget.setMinHeight((this.mMinHeight - getPaddingTop()) - getPaddingBottom());
    }

    private void updateHierarchy() {
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
            this.mVariableDimensionsWidgets.clear();
            setChildrenConstraints();
        }
    }

    private void updatePostMeasures() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof Placeholder) {
                ((Placeholder) childAt).updatePostMeasure(this);
            }
        }
        int size = this.mConstraintHelpers.size();
        if (size > 0) {
            for (int i2 = 0; i2 < size; i2++) {
                this.mConstraintHelpers.get(i2).updatePostMeasure(this);
            }
        }
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (Build.VERSION.SDK_INT < 14) {
            onViewAdded(view);
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public void dispatchDraw(Canvas canvas) {
        Object tag;
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = (float) getWidth();
            float height = (float) getHeight();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                if (!(childAt.getVisibility() == 8 || (tag = childAt.getTag()) == null || !(tag instanceof String))) {
                    String[] split = ((String) tag).split(Constants.ACCEPT_TIME_SEPARATOR_SP);
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i2 = (int) ((((float) parseInt) / 1080.0f) * width);
                        int i3 = (int) ((((float) parseInt2) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(SupportMenu.CATEGORY_MASK);
                        float f = (float) i2;
                        float f2 = (float) (i2 + ((int) ((((float) parseInt3) / 1080.0f) * width)));
                        Canvas canvas2 = canvas;
                        float f3 = (float) i3;
                        float f4 = f;
                        float f5 = f;
                        float f6 = f3;
                        Paint paint2 = paint;
                        float f7 = f2;
                        Paint paint3 = paint2;
                        canvas2.drawLine(f4, f6, f7, f3, paint3);
                        float parseInt4 = (float) (i3 + ((int) ((((float) Integer.parseInt(split[3])) / 1920.0f) * height)));
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
        return ((LayoutParams) view.getLayoutParams()).widget;
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
            if ((childAt.getVisibility() != 8 || layoutParams.isGuideline || layoutParams.isHelper || isInEditMode) && !layoutParams.isInPlaceholder) {
                int drawX = constraintWidget.getDrawX();
                int drawY = constraintWidget.getDrawY();
                int width = constraintWidget.getWidth() + drawX;
                int height = constraintWidget.getHeight() + drawY;
                childAt.layout(drawX, drawY, width, height);
                if ((childAt instanceof Placeholder) && (content = ((Placeholder) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(drawX, drawY, width, height);
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
    /* JADX WARNING: Removed duplicated region for block: B:173:0x0360  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x0376  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x03af  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x013b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r24, int r25) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r25
            java.lang.System.currentTimeMillis()
            int r3 = android.view.View.MeasureSpec.getMode(r24)
            int r4 = android.view.View.MeasureSpec.getSize(r24)
            int r5 = android.view.View.MeasureSpec.getMode(r25)
            int r6 = android.view.View.MeasureSpec.getSize(r25)
            int r7 = r23.getPaddingLeft()
            int r8 = r23.getPaddingTop()
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r9 = r0.mLayoutWidget
            r9.setX(r7)
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r9 = r0.mLayoutWidget
            r9.setY(r8)
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r9 = r0.mLayoutWidget
            int r10 = r0.mMaxWidth
            r9.setMaxWidth(r10)
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r9 = r0.mLayoutWidget
            int r10 = r0.mMaxHeight
            r9.setMaxHeight(r10)
            int r9 = android.os.Build.VERSION.SDK_INT
            r10 = 0
            r11 = 1
            r12 = 17
            if (r9 < r12) goto L_0x004f
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r9 = r0.mLayoutWidget
            int r12 = r23.getLayoutDirection()
            if (r12 != r11) goto L_0x004b
            r12 = 1
            goto L_0x004c
        L_0x004b:
            r12 = 0
        L_0x004c:
            r9.setRtl(r12)
        L_0x004f:
            r23.setSelfDimensionBehaviour(r24, r25)
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r9 = r0.mLayoutWidget
            int r9 = r9.getWidth()
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r12 = r0.mLayoutWidget
            int r12 = r12.getHeight()
            boolean r13 = r0.mDirtyHierarchy
            if (r13 == 0) goto L_0x0069
            r0.mDirtyHierarchy = r10
            r23.updateHierarchy()
            r13 = 1
            goto L_0x006a
        L_0x0069:
            r13 = 0
        L_0x006a:
            int r14 = r0.mOptimizationLevel
            r15 = 8
            r14 = r14 & r15
            if (r14 != r15) goto L_0x0073
            r14 = 1
            goto L_0x0074
        L_0x0073:
            r14 = 0
        L_0x0074:
            if (r14 == 0) goto L_0x0084
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r15 = r0.mLayoutWidget
            r15.preOptimize()
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r15 = r0.mLayoutWidget
            r15.optimizeForDimensions(r9, r12)
            r23.internalMeasureDimensions(r24, r25)
            goto L_0x0087
        L_0x0084:
            r23.internalMeasureChildren(r24, r25)
        L_0x0087:
            r23.updatePostMeasures()
            int r15 = r23.getChildCount()
            if (r15 <= 0) goto L_0x0097
            if (r13 == 0) goto L_0x0097
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r13 = r0.mLayoutWidget
            androidx.constraintlayout.solver.widgets.Analyzer.determineGroups(r13)
        L_0x0097:
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r13 = r0.mLayoutWidget
            boolean r15 = r13.mGroupsWrapOptimized
            if (r15 == 0) goto L_0x00c9
            boolean r15 = r13.mHorizontalWrapOptimized
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r15 == 0) goto L_0x00b3
            if (r3 != r11) goto L_0x00b3
            int r15 = r13.mWrapFixedWidth
            if (r15 >= r4) goto L_0x00ac
            r13.setWidth(r15)
        L_0x00ac:
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r13 = r0.mLayoutWidget
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r15 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r13.setHorizontalDimensionBehaviour(r15)
        L_0x00b3:
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r13 = r0.mLayoutWidget
            boolean r15 = r13.mVerticalWrapOptimized
            if (r15 == 0) goto L_0x00c9
            if (r5 != r11) goto L_0x00c9
            int r11 = r13.mWrapFixedHeight
            if (r11 >= r6) goto L_0x00c2
            r13.setHeight(r11)
        L_0x00c2:
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r11 = r0.mLayoutWidget
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r13 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r11.setVerticalDimensionBehaviour(r13)
        L_0x00c9:
            int r11 = r0.mOptimizationLevel
            r13 = 32
            r11 = r11 & r13
            r15 = 1073741824(0x40000000, float:2.0)
            if (r11 != r13) goto L_0x011d
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r11 = r0.mLayoutWidget
            int r11 = r11.getWidth()
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r13 = r0.mLayoutWidget
            int r13 = r13.getHeight()
            int r10 = r0.mLastMeasureWidth
            if (r10 == r11) goto L_0x00ec
            if (r3 != r15) goto L_0x00ec
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r3 = r0.mLayoutWidget
            java.util.List<androidx.constraintlayout.solver.widgets.ConstraintWidgetGroup> r3 = r3.mWidgetGroups
            r10 = 0
            androidx.constraintlayout.solver.widgets.Analyzer.setPosition(r3, r10, r11)
        L_0x00ec:
            int r3 = r0.mLastMeasureHeight
            if (r3 == r13) goto L_0x00fa
            if (r5 != r15) goto L_0x00fa
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r3 = r0.mLayoutWidget
            java.util.List<androidx.constraintlayout.solver.widgets.ConstraintWidgetGroup> r3 = r3.mWidgetGroups
            r5 = 1
            androidx.constraintlayout.solver.widgets.Analyzer.setPosition(r3, r5, r13)
        L_0x00fa:
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r3 = r0.mLayoutWidget
            boolean r5 = r3.mHorizontalWrapOptimized
            if (r5 == 0) goto L_0x010b
            int r5 = r3.mWrapFixedWidth
            if (r5 <= r4) goto L_0x010b
            java.util.List<androidx.constraintlayout.solver.widgets.ConstraintWidgetGroup> r3 = r3.mWidgetGroups
            r10 = 0
            androidx.constraintlayout.solver.widgets.Analyzer.setPosition(r3, r10, r4)
            goto L_0x010c
        L_0x010b:
            r10 = 0
        L_0x010c:
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r3 = r0.mLayoutWidget
            boolean r4 = r3.mVerticalWrapOptimized
            if (r4 == 0) goto L_0x011d
            int r4 = r3.mWrapFixedHeight
            if (r4 <= r6) goto L_0x011d
            java.util.List<androidx.constraintlayout.solver.widgets.ConstraintWidgetGroup> r3 = r3.mWidgetGroups
            r4 = 1
            androidx.constraintlayout.solver.widgets.Analyzer.setPosition(r3, r4, r6)
            goto L_0x011e
        L_0x011d:
            r4 = 1
        L_0x011e:
            int r3 = r23.getChildCount()
            if (r3 <= 0) goto L_0x0129
            java.lang.String r3 = "First pass"
            r0.solveLinearSystem(r3)
        L_0x0129:
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.ConstraintWidget> r3 = r0.mVariableDimensionsWidgets
            int r3 = r3.size()
            int r5 = r23.getPaddingBottom()
            int r8 = r8 + r5
            int r5 = r23.getPaddingRight()
            int r7 = r7 + r5
            if (r3 <= 0) goto L_0x0360
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r6 = r0.mLayoutWidget
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r6 = r6.getHorizontalDimensionBehaviour()
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r11 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r6 != r11) goto L_0x0147
            r6 = 1
            goto L_0x0148
        L_0x0147:
            r6 = 0
        L_0x0148:
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r11 = r0.mLayoutWidget
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r11 = r11.getVerticalDimensionBehaviour()
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r13 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r11 != r13) goto L_0x0154
            r11 = 1
            goto L_0x0155
        L_0x0154:
            r11 = 0
        L_0x0155:
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r13 = r0.mLayoutWidget
            int r13 = r13.getWidth()
            int r4 = r0.mMinWidth
            int r4 = java.lang.Math.max(r13, r4)
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r13 = r0.mLayoutWidget
            int r13 = r13.getHeight()
            int r10 = r0.mMinHeight
            int r10 = java.lang.Math.max(r13, r10)
            r5 = r10
            r10 = 0
            r13 = 0
            r16 = 0
        L_0x0172:
            r17 = 1
            if (r10 >= r3) goto L_0x02b8
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.ConstraintWidget> r15 = r0.mVariableDimensionsWidgets
            java.lang.Object r15 = r15.get(r10)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r15 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r15
            java.lang.Object r19 = r15.getCompanionWidget()
            r20 = r3
            r3 = r19
            android.view.View r3 = (android.view.View) r3
            if (r3 != 0) goto L_0x0190
            r19 = r9
            r21 = r12
            goto L_0x02a0
        L_0x0190:
            android.view.ViewGroup$LayoutParams r19 = r3.getLayoutParams()
            r21 = r12
            r12 = r19
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r12 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r12
            r19 = r9
            boolean r9 = r12.isHelper
            if (r9 != 0) goto L_0x02a0
            boolean r9 = r12.isGuideline
            if (r9 == 0) goto L_0x01a6
            goto L_0x02a0
        L_0x01a6:
            int r9 = r3.getVisibility()
            r22 = r13
            r13 = 8
            if (r9 != r13) goto L_0x01b2
        L_0x01b0:
            goto L_0x02a2
        L_0x01b2:
            if (r14 == 0) goto L_0x01c9
            androidx.constraintlayout.solver.widgets.ResolutionDimension r9 = r15.getResolutionWidth()
            boolean r9 = r9.isResolved()
            if (r9 == 0) goto L_0x01c9
            androidx.constraintlayout.solver.widgets.ResolutionDimension r9 = r15.getResolutionHeight()
            boolean r9 = r9.isResolved()
            if (r9 == 0) goto L_0x01c9
            goto L_0x01b0
        L_0x01c9:
            int r9 = r12.width
            r13 = -2
            if (r9 != r13) goto L_0x01d7
            boolean r13 = r12.horizontalDimensionFixed
            if (r13 == 0) goto L_0x01d7
            int r9 = android.view.ViewGroup.getChildMeasureSpec(r1, r7, r9)
            goto L_0x01e1
        L_0x01d7:
            int r9 = r15.getWidth()
            r13 = 1073741824(0x40000000, float:2.0)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r13)
        L_0x01e1:
            int r13 = r12.height
            r1 = -2
            if (r13 != r1) goto L_0x01ef
            boolean r1 = r12.verticalDimensionFixed
            if (r1 == 0) goto L_0x01ef
            int r1 = android.view.ViewGroup.getChildMeasureSpec(r2, r8, r13)
            goto L_0x01f9
        L_0x01ef:
            int r1 = r15.getHeight()
            r13 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r13)
        L_0x01f9:
            r3.measure(r9, r1)
            androidx.constraintlayout.solver.Metrics r1 = r0.mMetrics
            r13 = r8
            if (r1 == 0) goto L_0x0207
            long r8 = r1.additionalMeasures
            long r8 = r8 + r17
            r1.additionalMeasures = r8
        L_0x0207:
            int r1 = r3.getMeasuredWidth()
            int r8 = r3.getMeasuredHeight()
            int r9 = r15.getWidth()
            if (r1 == r9) goto L_0x023e
            r15.setWidth(r1)
            if (r14 == 0) goto L_0x0221
            androidx.constraintlayout.solver.widgets.ResolutionDimension r9 = r15.getResolutionWidth()
            r9.resolve(r1)
        L_0x0221:
            if (r6 == 0) goto L_0x023c
            int r1 = r15.getRight()
            if (r1 <= r4) goto L_0x023c
            int r1 = r15.getRight()
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r9 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r15.getAnchor(r9)
            int r9 = r9.getMargin()
            int r1 = r1 + r9
            int r4 = java.lang.Math.max(r4, r1)
        L_0x023c:
            r22 = 1
        L_0x023e:
            int r1 = r15.getHeight()
            if (r8 == r1) goto L_0x026f
            r15.setHeight(r8)
            if (r14 == 0) goto L_0x0250
            androidx.constraintlayout.solver.widgets.ResolutionDimension r1 = r15.getResolutionHeight()
            r1.resolve(r8)
        L_0x0250:
            if (r11 == 0) goto L_0x026c
            int r1 = r15.getBottom()
            if (r1 <= r5) goto L_0x026c
            int r1 = r15.getBottom()
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r8 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r8 = r15.getAnchor(r8)
            int r8 = r8.getMargin()
            int r1 = r1 + r8
            int r1 = java.lang.Math.max(r5, r1)
            r5 = r1
        L_0x026c:
            r1 = r5
            r5 = 1
            goto L_0x0272
        L_0x026f:
            r1 = r5
            r5 = r22
        L_0x0272:
            boolean r8 = r12.needsBaseline
            if (r8 == 0) goto L_0x0287
            int r8 = r3.getBaseline()
            r9 = -1
            if (r8 == r9) goto L_0x0287
            int r9 = r15.getBaselineDistance()
            if (r8 == r9) goto L_0x0287
            r15.setBaselineDistance(r8)
            r5 = 1
        L_0x0287:
            int r8 = android.os.Build.VERSION.SDK_INT
            r9 = 11
            if (r8 < r9) goto L_0x029a
            int r3 = r3.getMeasuredState()
            r8 = r16
            int r3 = android.view.ViewGroup.combineMeasuredStates(r8, r3)
            r16 = r3
            goto L_0x029c
        L_0x029a:
            r8 = r16
        L_0x029c:
            r22 = r5
            r5 = r1
            goto L_0x02a7
        L_0x02a0:
            r22 = r13
        L_0x02a2:
            r13 = r8
            r8 = r16
            r16 = r8
        L_0x02a7:
            int r10 = r10 + 1
            r1 = r24
            r8 = r13
            r9 = r19
            r3 = r20
            r12 = r21
            r13 = r22
            r15 = 1073741824(0x40000000, float:2.0)
            goto L_0x0172
        L_0x02b8:
            r20 = r3
            r19 = r9
            r21 = r12
            r22 = r13
            r13 = r8
            r8 = r16
            if (r22 == 0) goto L_0x0306
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r1 = r0.mLayoutWidget
            r3 = r19
            r1.setWidth(r3)
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r1 = r0.mLayoutWidget
            r3 = r21
            r1.setHeight(r3)
            if (r14 == 0) goto L_0x02da
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r1 = r0.mLayoutWidget
            r1.solveGraph()
        L_0x02da:
            java.lang.String r1 = "2nd pass"
            r0.solveLinearSystem(r1)
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r1 = r0.mLayoutWidget
            int r1 = r1.getWidth()
            if (r1 >= r4) goto L_0x02ee
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r1 = r0.mLayoutWidget
            r1.setWidth(r4)
            r10 = 1
            goto L_0x02ef
        L_0x02ee:
            r10 = 0
        L_0x02ef:
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r1 = r0.mLayoutWidget
            int r1 = r1.getHeight()
            if (r1 >= r5) goto L_0x02fe
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r1 = r0.mLayoutWidget
            r1.setHeight(r5)
            r11 = 1
            goto L_0x02ff
        L_0x02fe:
            r11 = r10
        L_0x02ff:
            if (r11 == 0) goto L_0x0306
            java.lang.String r1 = "3rd pass"
            r0.solveLinearSystem(r1)
        L_0x0306:
            r1 = r20
            r10 = 0
        L_0x0309:
            if (r10 >= r1) goto L_0x035e
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.ConstraintWidget> r3 = r0.mVariableDimensionsWidgets
            java.lang.Object r3 = r3.get(r10)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r3 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r3
            java.lang.Object r4 = r3.getCompanionWidget()
            android.view.View r4 = (android.view.View) r4
            if (r4 != 0) goto L_0x0320
        L_0x031b:
            r6 = 8
        L_0x031d:
            r9 = 1073741824(0x40000000, float:2.0)
            goto L_0x035b
        L_0x0320:
            int r5 = r4.getMeasuredWidth()
            int r6 = r3.getWidth()
            if (r5 != r6) goto L_0x0334
            int r5 = r4.getMeasuredHeight()
            int r6 = r3.getHeight()
            if (r5 == r6) goto L_0x031b
        L_0x0334:
            int r5 = r3.getVisibility()
            r6 = 8
            if (r5 == r6) goto L_0x031d
            int r5 = r3.getWidth()
            r9 = 1073741824(0x40000000, float:2.0)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r9)
            int r3 = r3.getHeight()
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r9)
            r4.measure(r5, r3)
            androidx.constraintlayout.solver.Metrics r3 = r0.mMetrics
            if (r3 == 0) goto L_0x035b
            long r4 = r3.additionalMeasures
            long r4 = r4 + r17
            r3.additionalMeasures = r4
        L_0x035b:
            int r10 = r10 + 1
            goto L_0x0309
        L_0x035e:
            r10 = r8
            goto L_0x0362
        L_0x0360:
            r13 = r8
            r10 = 0
        L_0x0362:
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r1 = r0.mLayoutWidget
            int r1 = r1.getWidth()
            int r1 = r1 + r7
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r3 = r0.mLayoutWidget
            int r3 = r3.getHeight()
            int r3 = r3 + r13
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 11
            if (r4 < r5) goto L_0x03af
            r4 = r24
            int r1 = android.view.ViewGroup.resolveSizeAndState(r1, r4, r10)
            int r4 = r10 << 16
            int r2 = android.view.ViewGroup.resolveSizeAndState(r3, r2, r4)
            r3 = 16777215(0xffffff, float:2.3509886E-38)
            r1 = r1 & r3
            r2 = r2 & r3
            int r3 = r0.mMaxWidth
            int r1 = java.lang.Math.min(r3, r1)
            int r3 = r0.mMaxHeight
            int r2 = java.lang.Math.min(r3, r2)
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r3 = r0.mLayoutWidget
            boolean r3 = r3.isWidthMeasuredTooSmall()
            r4 = 16777216(0x1000000, float:2.3509887E-38)
            if (r3 == 0) goto L_0x039e
            r1 = r1 | r4
        L_0x039e:
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r3 = r0.mLayoutWidget
            boolean r3 = r3.isHeightMeasuredTooSmall()
            if (r3 == 0) goto L_0x03a7
            r2 = r2 | r4
        L_0x03a7:
            r0.setMeasuredDimension(r1, r2)
            r0.mLastMeasureWidth = r1
            r0.mLastMeasureHeight = r2
            goto L_0x03b6
        L_0x03af:
            r0.setMeasuredDimension(r1, r3)
            r0.mLastMeasureWidth = r1
            r0.mLastMeasureHeight = r3
        L_0x03b6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.onMeasure(int, int):void");
    }

    public void onViewAdded(View view) {
        if (Build.VERSION.SDK_INT >= 14) {
            super.onViewAdded(view);
        }
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
        if (Build.VERSION.SDK_INT >= 14) {
            super.onViewRemoved(view);
        }
        this.mChildrenByIds.remove(view.getId());
        ConstraintWidget viewWidget = getViewWidget(view);
        this.mLayoutWidget.remove(viewWidget);
        this.mConstraintHelpers.remove(view);
        this.mVariableDimensionsWidgets.remove(viewWidget);
        this.mDirtyHierarchy = true;
    }

    public void removeView(View view) {
        super.removeView(view);
        if (Build.VERSION.SDK_INT < 14) {
            onViewRemoved(view);
        }
    }

    public void requestLayout() {
        super.requestLayout();
        this.mDirtyHierarchy = true;
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
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

    public void setOptimizationLevel(int i) {
        this.mLayoutWidget.setOptimizationLevel(i);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* access modifiers changed from: protected */
    public void solveLinearSystem(String str) {
        this.mLayoutWidget.layout();
        Metrics metrics = this.mMetrics;
        if (metrics != null) {
            metrics.resolutions++;
        }
    }
}
