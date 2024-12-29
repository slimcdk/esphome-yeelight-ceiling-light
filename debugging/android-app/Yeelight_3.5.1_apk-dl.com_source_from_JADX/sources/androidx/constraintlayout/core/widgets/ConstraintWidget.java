package androidx.constraintlayout.core.widgets;

import androidx.appcompat.widget.ActivityChooserView;
import androidx.constraintlayout.core.Cache;
import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.state.WidgetFrame;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.analyzer.ChainRun;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun;
import androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun;
import androidx.constraintlayout.core.widgets.analyzer.WidgetRun;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.apache.commons.p194io.IOUtils;

public class ConstraintWidget {
    public static final int ANCHOR_BASELINE = 4;
    public static final int ANCHOR_BOTTOM = 3;
    public static final int ANCHOR_LEFT = 0;
    public static final int ANCHOR_RIGHT = 1;
    public static final int ANCHOR_TOP = 2;
    private static final boolean AUTOTAG_CENTER = false;
    public static final int BOTH = 2;
    public static final int CHAIN_PACKED = 2;
    public static final int CHAIN_SPREAD = 0;
    public static final int CHAIN_SPREAD_INSIDE = 1;
    public static float DEFAULT_BIAS = 0.5f;
    static final int DIMENSION_HORIZONTAL = 0;
    static final int DIMENSION_VERTICAL = 1;
    protected static final int DIRECT = 2;
    public static final int GONE = 8;
    public static final int HORIZONTAL = 0;
    public static final int INVISIBLE = 4;
    public static final int MATCH_CONSTRAINT_PERCENT = 2;
    public static final int MATCH_CONSTRAINT_RATIO = 3;
    public static final int MATCH_CONSTRAINT_RATIO_RESOLVED = 4;
    public static final int MATCH_CONSTRAINT_SPREAD = 0;
    public static final int MATCH_CONSTRAINT_WRAP = 1;
    protected static final int SOLVER = 1;
    public static final int UNKNOWN = -1;
    private static final boolean USE_WRAP_DIMENSION_FOR_SPREAD = false;
    public static final int VERTICAL = 1;
    public static final int VISIBLE = 0;
    private static final int WRAP = -2;
    public static final int WRAP_BEHAVIOR_HORIZONTAL_ONLY = 1;
    public static final int WRAP_BEHAVIOR_INCLUDED = 0;
    public static final int WRAP_BEHAVIOR_SKIPPED = 3;
    public static final int WRAP_BEHAVIOR_VERTICAL_ONLY = 2;
    private boolean OPTIMIZE_WRAP;
    private boolean OPTIMIZE_WRAP_ON_RESOLVED;
    public WidgetFrame frame;
    private boolean hasBaseline;
    public ChainRun horizontalChainRun;
    public int horizontalGroup;
    public HorizontalWidgetRun horizontalRun;
    private boolean horizontalSolvingPass;
    private boolean inPlaceholder;
    public boolean[] isTerminalWidget;
    protected ArrayList<ConstraintAnchor> mAnchors;
    private boolean mAnimated;
    public ConstraintAnchor mBaseline;
    int mBaselineDistance;
    public ConstraintAnchor mBottom;
    boolean mBottomHasCentered;
    public ConstraintAnchor mCenter;
    ConstraintAnchor mCenterX;
    ConstraintAnchor mCenterY;
    private float mCircleConstraintAngle;
    private Object mCompanionWidget;
    private int mContainerItemSkip;
    private String mDebugName;
    public float mDimensionRatio;
    protected int mDimensionRatioSide;
    int mDistToBottom;
    int mDistToLeft;
    int mDistToRight;
    int mDistToTop;
    boolean mGroupsToSolver;
    int mHeight;
    private int mHeightOverride;
    float mHorizontalBiasPercent;
    boolean mHorizontalChainFixedPosition;
    int mHorizontalChainStyle;
    ConstraintWidget mHorizontalNextWidget;
    public int mHorizontalResolution;
    boolean mHorizontalWrapVisited;
    private boolean mInVirtualLayout;
    public boolean mIsHeightWrapContent;
    private boolean[] mIsInBarrier;
    public boolean mIsWidthWrapContent;
    private int mLastHorizontalMeasureSpec;
    private int mLastVerticalMeasureSpec;
    public ConstraintAnchor mLeft;
    boolean mLeftHasCentered;
    public ConstraintAnchor[] mListAnchors;
    public DimensionBehaviour[] mListDimensionBehaviors;
    protected ConstraintWidget[] mListNextMatchConstraintsWidget;
    public int mMatchConstraintDefaultHeight;
    public int mMatchConstraintDefaultWidth;
    public int mMatchConstraintMaxHeight;
    public int mMatchConstraintMaxWidth;
    public int mMatchConstraintMinHeight;
    public int mMatchConstraintMinWidth;
    public float mMatchConstraintPercentHeight;
    public float mMatchConstraintPercentWidth;
    private int[] mMaxDimension;
    private boolean mMeasureRequested;
    protected int mMinHeight;
    protected int mMinWidth;
    protected ConstraintWidget[] mNextChainWidget;
    protected int mOffsetX;
    protected int mOffsetY;
    public ConstraintWidget mParent;
    int mRelX;
    int mRelY;
    float mResolvedDimensionRatio;
    int mResolvedDimensionRatioSide;
    boolean mResolvedHasRatio;
    public int[] mResolvedMatchConstraintDefault;
    public ConstraintAnchor mRight;
    boolean mRightHasCentered;
    public ConstraintAnchor mTop;
    boolean mTopHasCentered;
    private String mType;
    float mVerticalBiasPercent;
    boolean mVerticalChainFixedPosition;
    int mVerticalChainStyle;
    ConstraintWidget mVerticalNextWidget;
    public int mVerticalResolution;
    boolean mVerticalWrapVisited;
    private int mVisibility;
    public float[] mWeight;
    int mWidth;
    private int mWidthOverride;
    private int mWrapBehaviorInParent;

    /* renamed from: mX */
    protected int f52mX;

    /* renamed from: mY */
    protected int f53mY;
    public boolean measured;
    private boolean resolvedHorizontal;
    private boolean resolvedVertical;
    public WidgetRun[] run;
    public String stringId;
    public ChainRun verticalChainRun;
    public int verticalGroup;
    public VerticalWidgetRun verticalRun;
    private boolean verticalSolvingPass;

    /* renamed from: androidx.constraintlayout.core.widgets.ConstraintWidget$1 */
    static /* synthetic */ class C01871 {

        /* renamed from: $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type */
        static final /* synthetic */ int[] f54x6930e354;

        /* renamed from: $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintWidget$DimensionBehaviour */
        static final /* synthetic */ int[] f55x6d00e4a2;

        /* JADX WARNING: Can't wrap try/catch for region: R(29:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(31:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(32:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0058 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0062 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x006d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0083 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x008f */
        static {
            /*
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f55x6d00e4a2 = r0
                r1 = 1
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f55x6d00e4a2     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f55x6d00e4a2     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f55x6d00e4a2     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r5 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type[] r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f54x6930e354 = r4
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r5 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r1 = f54x6930e354     // Catch:{ NoSuchFieldError -> 0x004e }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP     // Catch:{ NoSuchFieldError -> 0x004e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r0 = f54x6930e354     // Catch:{ NoSuchFieldError -> 0x0058 }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                int[] r0 = f54x6930e354     // Catch:{ NoSuchFieldError -> 0x0062 }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                int[] r0 = f54x6930e354     // Catch:{ NoSuchFieldError -> 0x006d }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BASELINE     // Catch:{ NoSuchFieldError -> 0x006d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006d }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006d }
            L_0x006d:
                int[] r0 = f54x6930e354     // Catch:{ NoSuchFieldError -> 0x0078 }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f54x6930e354     // Catch:{ NoSuchFieldError -> 0x0083 }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_X     // Catch:{ NoSuchFieldError -> 0x0083 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0083 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0083 }
            L_0x0083:
                int[] r0 = f54x6930e354     // Catch:{ NoSuchFieldError -> 0x008f }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_Y     // Catch:{ NoSuchFieldError -> 0x008f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008f }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x008f }
            L_0x008f:
                int[] r0 = f54x6930e354     // Catch:{ NoSuchFieldError -> 0x009b }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.NONE     // Catch:{ NoSuchFieldError -> 0x009b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009b }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009b }
            L_0x009b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.ConstraintWidget.C01871.<clinit>():void");
        }
    }

    public enum DimensionBehaviour {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    public ConstraintWidget() {
        this.measured = false;
        this.run = new WidgetRun[2];
        this.horizontalRun = null;
        this.verticalRun = null;
        this.isTerminalWidget = new boolean[]{true, true};
        this.mResolvedHasRatio = false;
        this.mMeasureRequested = true;
        this.OPTIMIZE_WRAP = false;
        this.OPTIMIZE_WRAP_ON_RESOLVED = true;
        this.mWidthOverride = -1;
        this.mHeightOverride = -1;
        this.frame = new WidgetFrame(this);
        this.resolvedHorizontal = false;
        this.resolvedVertical = false;
        this.horizontalSolvingPass = false;
        this.verticalSolvingPass = false;
        this.mHorizontalResolution = -1;
        this.mVerticalResolution = -1;
        this.mWrapBehaviorInParent = 0;
        this.mMatchConstraintDefaultWidth = 0;
        this.mMatchConstraintDefaultHeight = 0;
        this.mResolvedMatchConstraintDefault = new int[2];
        this.mMatchConstraintMinWidth = 0;
        this.mMatchConstraintMaxWidth = 0;
        this.mMatchConstraintPercentWidth = 1.0f;
        this.mMatchConstraintMinHeight = 0;
        this.mMatchConstraintMaxHeight = 0;
        this.mMatchConstraintPercentHeight = 1.0f;
        this.mResolvedDimensionRatioSide = -1;
        this.mResolvedDimensionRatio = 1.0f;
        this.mMaxDimension = new int[]{ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED};
        this.mCircleConstraintAngle = 0.0f;
        this.hasBaseline = false;
        this.mInVirtualLayout = false;
        this.mLastHorizontalMeasureSpec = 0;
        this.mLastVerticalMeasureSpec = 0;
        this.mLeft = new ConstraintAnchor(this, ConstraintAnchor.Type.LEFT);
        this.mTop = new ConstraintAnchor(this, ConstraintAnchor.Type.TOP);
        this.mRight = new ConstraintAnchor(this, ConstraintAnchor.Type.RIGHT);
        this.mBottom = new ConstraintAnchor(this, ConstraintAnchor.Type.BOTTOM);
        this.mBaseline = new ConstraintAnchor(this, ConstraintAnchor.Type.BASELINE);
        this.mCenterX = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_X);
        this.mCenterY = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_Y);
        ConstraintAnchor constraintAnchor = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER);
        this.mCenter = constraintAnchor;
        this.mListAnchors = new ConstraintAnchor[]{this.mLeft, this.mRight, this.mTop, this.mBottom, this.mBaseline, constraintAnchor};
        this.mAnchors = new ArrayList<>();
        this.mIsInBarrier = new boolean[2];
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.FIXED;
        this.mListDimensionBehaviors = new DimensionBehaviour[]{dimensionBehaviour, dimensionBehaviour};
        this.mParent = null;
        this.mWidth = 0;
        this.mHeight = 0;
        this.mDimensionRatio = 0.0f;
        this.mDimensionRatioSide = -1;
        this.f52mX = 0;
        this.f53mY = 0;
        this.mRelX = 0;
        this.mRelY = 0;
        this.mOffsetX = 0;
        this.mOffsetY = 0;
        this.mBaselineDistance = 0;
        float f = DEFAULT_BIAS;
        this.mHorizontalBiasPercent = f;
        this.mVerticalBiasPercent = f;
        this.mContainerItemSkip = 0;
        this.mVisibility = 0;
        this.mAnimated = false;
        this.mDebugName = null;
        this.mType = null;
        this.mGroupsToSolver = false;
        this.mHorizontalChainStyle = 0;
        this.mVerticalChainStyle = 0;
        this.mWeight = new float[]{-1.0f, -1.0f};
        this.mListNextMatchConstraintsWidget = new ConstraintWidget[]{null, null};
        this.mNextChainWidget = new ConstraintWidget[]{null, null};
        this.mHorizontalNextWidget = null;
        this.mVerticalNextWidget = null;
        this.horizontalGroup = -1;
        this.verticalGroup = -1;
        addAnchors();
    }

    public ConstraintWidget(int i, int i2) {
        this(0, 0, i, i2);
    }

    public ConstraintWidget(int i, int i2, int i3, int i4) {
        this.measured = false;
        this.run = new WidgetRun[2];
        this.horizontalRun = null;
        this.verticalRun = null;
        this.isTerminalWidget = new boolean[]{true, true};
        this.mResolvedHasRatio = false;
        this.mMeasureRequested = true;
        this.OPTIMIZE_WRAP = false;
        this.OPTIMIZE_WRAP_ON_RESOLVED = true;
        this.mWidthOverride = -1;
        this.mHeightOverride = -1;
        this.frame = new WidgetFrame(this);
        this.resolvedHorizontal = false;
        this.resolvedVertical = false;
        this.horizontalSolvingPass = false;
        this.verticalSolvingPass = false;
        this.mHorizontalResolution = -1;
        this.mVerticalResolution = -1;
        this.mWrapBehaviorInParent = 0;
        this.mMatchConstraintDefaultWidth = 0;
        this.mMatchConstraintDefaultHeight = 0;
        this.mResolvedMatchConstraintDefault = new int[2];
        this.mMatchConstraintMinWidth = 0;
        this.mMatchConstraintMaxWidth = 0;
        this.mMatchConstraintPercentWidth = 1.0f;
        this.mMatchConstraintMinHeight = 0;
        this.mMatchConstraintMaxHeight = 0;
        this.mMatchConstraintPercentHeight = 1.0f;
        this.mResolvedDimensionRatioSide = -1;
        this.mResolvedDimensionRatio = 1.0f;
        this.mMaxDimension = new int[]{ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED};
        this.mCircleConstraintAngle = 0.0f;
        this.hasBaseline = false;
        this.mInVirtualLayout = false;
        this.mLastHorizontalMeasureSpec = 0;
        this.mLastVerticalMeasureSpec = 0;
        this.mLeft = new ConstraintAnchor(this, ConstraintAnchor.Type.LEFT);
        this.mTop = new ConstraintAnchor(this, ConstraintAnchor.Type.TOP);
        this.mRight = new ConstraintAnchor(this, ConstraintAnchor.Type.RIGHT);
        this.mBottom = new ConstraintAnchor(this, ConstraintAnchor.Type.BOTTOM);
        this.mBaseline = new ConstraintAnchor(this, ConstraintAnchor.Type.BASELINE);
        this.mCenterX = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_X);
        this.mCenterY = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_Y);
        ConstraintAnchor constraintAnchor = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER);
        this.mCenter = constraintAnchor;
        this.mListAnchors = new ConstraintAnchor[]{this.mLeft, this.mRight, this.mTop, this.mBottom, this.mBaseline, constraintAnchor};
        this.mAnchors = new ArrayList<>();
        this.mIsInBarrier = new boolean[2];
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.FIXED;
        this.mListDimensionBehaviors = new DimensionBehaviour[]{dimensionBehaviour, dimensionBehaviour};
        this.mParent = null;
        this.mWidth = 0;
        this.mHeight = 0;
        this.mDimensionRatio = 0.0f;
        this.mDimensionRatioSide = -1;
        this.f52mX = 0;
        this.f53mY = 0;
        this.mRelX = 0;
        this.mRelY = 0;
        this.mOffsetX = 0;
        this.mOffsetY = 0;
        this.mBaselineDistance = 0;
        float f = DEFAULT_BIAS;
        this.mHorizontalBiasPercent = f;
        this.mVerticalBiasPercent = f;
        this.mContainerItemSkip = 0;
        this.mVisibility = 0;
        this.mAnimated = false;
        this.mDebugName = null;
        this.mType = null;
        this.mGroupsToSolver = false;
        this.mHorizontalChainStyle = 0;
        this.mVerticalChainStyle = 0;
        this.mWeight = new float[]{-1.0f, -1.0f};
        this.mListNextMatchConstraintsWidget = new ConstraintWidget[]{null, null};
        this.mNextChainWidget = new ConstraintWidget[]{null, null};
        this.mHorizontalNextWidget = null;
        this.mVerticalNextWidget = null;
        this.horizontalGroup = -1;
        this.verticalGroup = -1;
        this.f52mX = i;
        this.f53mY = i2;
        this.mWidth = i3;
        this.mHeight = i4;
        addAnchors();
    }

    public ConstraintWidget(String str) {
        this.measured = false;
        this.run = new WidgetRun[2];
        this.horizontalRun = null;
        this.verticalRun = null;
        this.isTerminalWidget = new boolean[]{true, true};
        this.mResolvedHasRatio = false;
        this.mMeasureRequested = true;
        this.OPTIMIZE_WRAP = false;
        this.OPTIMIZE_WRAP_ON_RESOLVED = true;
        this.mWidthOverride = -1;
        this.mHeightOverride = -1;
        this.frame = new WidgetFrame(this);
        this.resolvedHorizontal = false;
        this.resolvedVertical = false;
        this.horizontalSolvingPass = false;
        this.verticalSolvingPass = false;
        this.mHorizontalResolution = -1;
        this.mVerticalResolution = -1;
        this.mWrapBehaviorInParent = 0;
        this.mMatchConstraintDefaultWidth = 0;
        this.mMatchConstraintDefaultHeight = 0;
        this.mResolvedMatchConstraintDefault = new int[2];
        this.mMatchConstraintMinWidth = 0;
        this.mMatchConstraintMaxWidth = 0;
        this.mMatchConstraintPercentWidth = 1.0f;
        this.mMatchConstraintMinHeight = 0;
        this.mMatchConstraintMaxHeight = 0;
        this.mMatchConstraintPercentHeight = 1.0f;
        this.mResolvedDimensionRatioSide = -1;
        this.mResolvedDimensionRatio = 1.0f;
        this.mMaxDimension = new int[]{ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED};
        this.mCircleConstraintAngle = 0.0f;
        this.hasBaseline = false;
        this.mInVirtualLayout = false;
        this.mLastHorizontalMeasureSpec = 0;
        this.mLastVerticalMeasureSpec = 0;
        this.mLeft = new ConstraintAnchor(this, ConstraintAnchor.Type.LEFT);
        this.mTop = new ConstraintAnchor(this, ConstraintAnchor.Type.TOP);
        this.mRight = new ConstraintAnchor(this, ConstraintAnchor.Type.RIGHT);
        this.mBottom = new ConstraintAnchor(this, ConstraintAnchor.Type.BOTTOM);
        this.mBaseline = new ConstraintAnchor(this, ConstraintAnchor.Type.BASELINE);
        this.mCenterX = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_X);
        this.mCenterY = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_Y);
        ConstraintAnchor constraintAnchor = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER);
        this.mCenter = constraintAnchor;
        this.mListAnchors = new ConstraintAnchor[]{this.mLeft, this.mRight, this.mTop, this.mBottom, this.mBaseline, constraintAnchor};
        this.mAnchors = new ArrayList<>();
        this.mIsInBarrier = new boolean[2];
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.FIXED;
        this.mListDimensionBehaviors = new DimensionBehaviour[]{dimensionBehaviour, dimensionBehaviour};
        this.mParent = null;
        this.mWidth = 0;
        this.mHeight = 0;
        this.mDimensionRatio = 0.0f;
        this.mDimensionRatioSide = -1;
        this.f52mX = 0;
        this.f53mY = 0;
        this.mRelX = 0;
        this.mRelY = 0;
        this.mOffsetX = 0;
        this.mOffsetY = 0;
        this.mBaselineDistance = 0;
        float f = DEFAULT_BIAS;
        this.mHorizontalBiasPercent = f;
        this.mVerticalBiasPercent = f;
        this.mContainerItemSkip = 0;
        this.mVisibility = 0;
        this.mAnimated = false;
        this.mDebugName = null;
        this.mType = null;
        this.mGroupsToSolver = false;
        this.mHorizontalChainStyle = 0;
        this.mVerticalChainStyle = 0;
        this.mWeight = new float[]{-1.0f, -1.0f};
        this.mListNextMatchConstraintsWidget = new ConstraintWidget[]{null, null};
        this.mNextChainWidget = new ConstraintWidget[]{null, null};
        this.mHorizontalNextWidget = null;
        this.mVerticalNextWidget = null;
        this.horizontalGroup = -1;
        this.verticalGroup = -1;
        addAnchors();
        setDebugName(str);
    }

    public ConstraintWidget(String str, int i, int i2) {
        this(i, i2);
        setDebugName(str);
    }

    public ConstraintWidget(String str, int i, int i2, int i3, int i4) {
        this(i, i2, i3, i4);
        setDebugName(str);
    }

    private void addAnchors() {
        this.mAnchors.add(this.mLeft);
        this.mAnchors.add(this.mTop);
        this.mAnchors.add(this.mRight);
        this.mAnchors.add(this.mBottom);
        this.mAnchors.add(this.mCenterX);
        this.mAnchors.add(this.mCenterY);
        this.mAnchors.add(this.mCenter);
        this.mAnchors.add(this.mBaseline);
    }

    /* JADX WARNING: Removed duplicated region for block: B:110:0x01da  */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x038f A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x039c  */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x03e0  */
    /* JADX WARNING: Removed duplicated region for block: B:247:0x03f6 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x03f7  */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x0437 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:301:0x0480  */
    /* JADX WARNING: Removed duplicated region for block: B:321:0x04b8 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:338:0x04e8  */
    /* JADX WARNING: Removed duplicated region for block: B:340:0x04f4 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:369:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:373:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00eb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void applyConstraints(androidx.constraintlayout.core.LinearSystem r32, boolean r33, boolean r34, boolean r35, boolean r36, androidx.constraintlayout.core.SolverVariable r37, androidx.constraintlayout.core.SolverVariable r38, androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour r39, boolean r40, androidx.constraintlayout.core.widgets.ConstraintAnchor r41, androidx.constraintlayout.core.widgets.ConstraintAnchor r42, int r43, int r44, int r45, int r46, float r47, boolean r48, boolean r49, boolean r50, boolean r51, boolean r52, int r53, int r54, int r55, int r56, float r57, boolean r58) {
        /*
            r31 = this;
            r0 = r31
            r10 = r32
            r11 = r37
            r12 = r38
            r13 = r41
            r14 = r42
            r15 = r45
            r1 = r46
            r2 = r54
            r3 = r55
            r4 = r56
            androidx.constraintlayout.core.SolverVariable r9 = r10.createObjectVariable(r13)
            androidx.constraintlayout.core.SolverVariable r8 = r10.createObjectVariable(r14)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r41.getTarget()
            androidx.constraintlayout.core.SolverVariable r7 = r10.createObjectVariable(r5)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r42.getTarget()
            androidx.constraintlayout.core.SolverVariable r6 = r10.createObjectVariable(r5)
            androidx.constraintlayout.core.Metrics r5 = androidx.constraintlayout.core.LinearSystem.getMetrics()
            if (r5 == 0) goto L_0x0040
            androidx.constraintlayout.core.Metrics r5 = androidx.constraintlayout.core.LinearSystem.getMetrics()
            long r11 = r5.nonresolvedWidgets
            r16 = 1
            long r11 = r11 + r16
            r5.nonresolvedWidgets = r11
        L_0x0040:
            boolean r11 = r41.isConnected()
            boolean r12 = r42.isConnected()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r0.mCenter
            boolean r16 = r5.isConnected()
            if (r12 == 0) goto L_0x0053
            int r5 = r11 + 1
            goto L_0x0054
        L_0x0053:
            r5 = r11
        L_0x0054:
            if (r16 == 0) goto L_0x0058
            int r5 = r5 + 1
        L_0x0058:
            if (r48 == 0) goto L_0x005d
            r18 = 3
            goto L_0x005f
        L_0x005d:
            r18 = r53
        L_0x005f:
            int[] r17 = androidx.constraintlayout.core.widgets.ConstraintWidget.C01871.f55x6d00e4a2
            int r19 = r39.ordinal()
            r2 = r17[r19]
            r14 = 1
            if (r2 == r14) goto L_0x0073
            r14 = 2
            if (r2 == r14) goto L_0x0073
            r14 = 3
            if (r2 == r14) goto L_0x0073
            r14 = 4
            if (r2 == r14) goto L_0x0078
        L_0x0073:
            r2 = r18
        L_0x0075:
            r18 = 0
            goto L_0x007e
        L_0x0078:
            r2 = r18
            if (r2 == r14) goto L_0x0075
            r18 = 1
        L_0x007e:
            int r14 = r0.mWidthOverride
            r13 = -1
            if (r14 == r13) goto L_0x008c
            if (r33 == 0) goto L_0x008c
            r0.mWidthOverride = r13
            r21 = r6
            r18 = 0
            goto L_0x0090
        L_0x008c:
            r14 = r44
            r21 = r6
        L_0x0090:
            int r6 = r0.mHeightOverride
            if (r6 == r13) goto L_0x009b
            if (r33 != 0) goto L_0x009b
            r0.mHeightOverride = r13
            r14 = r6
            r18 = 0
        L_0x009b:
            int r6 = r0.mVisibility
            r13 = 8
            if (r6 != r13) goto L_0x00a4
            r14 = 0
            r18 = 0
        L_0x00a4:
            if (r58 == 0) goto L_0x00bd
            if (r11 != 0) goto L_0x00b2
            if (r12 != 0) goto L_0x00b2
            if (r16 != 0) goto L_0x00b2
            r6 = r43
            r10.addEquality(r9, r6)
            goto L_0x00bd
        L_0x00b2:
            if (r11 == 0) goto L_0x00bd
            if (r12 != 0) goto L_0x00bd
            int r6 = r41.getMargin()
            r10.addEquality(r9, r7, r6, r13)
        L_0x00bd:
            if (r18 != 0) goto L_0x00eb
            if (r40 == 0) goto L_0x00d6
            r6 = 3
            r13 = 0
            r10.addEquality(r8, r9, r13, r6)
            r6 = 8
            if (r15 <= 0) goto L_0x00cd
            r10.addGreaterThan(r8, r9, r15, r6)
        L_0x00cd:
            r14 = 2147483647(0x7fffffff, float:NaN)
            if (r1 >= r14) goto L_0x00dc
            r10.addLowerThan(r8, r9, r1, r6)
            goto L_0x00dc
        L_0x00d6:
            r6 = 8
            r13 = 0
            r10.addEquality(r8, r9, r14, r6)
        L_0x00dc:
            r1 = r4
            r40 = r5
            r13 = r7
            r15 = r8
            r23 = r18
            r14 = r21
            r18 = r36
        L_0x00e7:
            r21 = r3
            goto L_0x01d8
        L_0x00eb:
            r1 = 2
            r13 = 0
            if (r5 == r1) goto L_0x0111
            if (r48 != 0) goto L_0x0111
            r1 = 1
            if (r2 == r1) goto L_0x00f6
            if (r2 != 0) goto L_0x0111
        L_0x00f6:
            int r1 = java.lang.Math.max(r3, r14)
            if (r4 <= 0) goto L_0x0100
            int r1 = java.lang.Math.min(r4, r1)
        L_0x0100:
            r6 = 8
            r10.addEquality(r8, r9, r1, r6)
            r18 = r36
            r1 = r4
            r40 = r5
            r13 = r7
            r15 = r8
            r14 = r21
            r23 = 0
            goto L_0x00e7
        L_0x0111:
            r1 = -2
            if (r3 != r1) goto L_0x0116
            r6 = r14
            goto L_0x0117
        L_0x0116:
            r6 = r3
        L_0x0117:
            if (r4 != r1) goto L_0x011b
            r1 = r14
            goto L_0x011c
        L_0x011b:
            r1 = r4
        L_0x011c:
            if (r14 <= 0) goto L_0x0122
            r3 = 1
            if (r2 == r3) goto L_0x0122
            r14 = 0
        L_0x0122:
            if (r6 <= 0) goto L_0x012d
            r3 = 8
            r10.addGreaterThan(r8, r9, r6, r3)
            int r14 = java.lang.Math.max(r14, r6)
        L_0x012d:
            if (r1 <= 0) goto L_0x0146
            if (r34 == 0) goto L_0x0136
            r3 = 1
            if (r2 != r3) goto L_0x0136
            r3 = 0
            goto L_0x0137
        L_0x0136:
            r3 = 1
        L_0x0137:
            if (r3 == 0) goto L_0x013f
            r3 = 8
            r10.addLowerThan(r8, r9, r1, r3)
            goto L_0x0141
        L_0x013f:
            r3 = 8
        L_0x0141:
            int r14 = java.lang.Math.min(r14, r1)
            goto L_0x0148
        L_0x0146:
            r3 = 8
        L_0x0148:
            r4 = 1
            if (r2 != r4) goto L_0x0167
            if (r34 == 0) goto L_0x0152
            r10.addEquality(r8, r9, r14, r3)
            r4 = 5
            goto L_0x0159
        L_0x0152:
            r4 = 5
            r10.addEquality(r8, r9, r14, r4)
            r10.addLowerThan(r8, r9, r14, r3)
        L_0x0159:
            r40 = r5
            r13 = r7
            r15 = r8
            r23 = r18
            r14 = r21
            r18 = r36
            r21 = r6
            goto L_0x01d8
        L_0x0167:
            r4 = 5
            r14 = 2
            if (r2 != r14) goto L_0x01cc
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r3 = r41.getType()
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP
            if (r3 == r4) goto L_0x018d
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r3 = r41.getType()
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r13 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM
            if (r3 != r13) goto L_0x017c
            goto L_0x018d
        L_0x017c:
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r0.mParent
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r3.getAnchor(r4)
            androidx.constraintlayout.core.SolverVariable r3 = r10.createObjectVariable(r3)
            androidx.constraintlayout.core.widgets.ConstraintWidget r4 = r0.mParent
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r13 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT
            goto L_0x019b
        L_0x018d:
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r0.mParent
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r3.getAnchor(r4)
            androidx.constraintlayout.core.SolverVariable r3 = r10.createObjectVariable(r3)
            androidx.constraintlayout.core.widgets.ConstraintWidget r4 = r0.mParent
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r13 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM
        L_0x019b:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r4.getAnchor(r13)
            androidx.constraintlayout.core.SolverVariable r4 = r10.createObjectVariable(r4)
            r23 = r3
            r13 = r4
            androidx.constraintlayout.core.ArrayRow r3 = r32.createRow()
            r24 = 5
            r4 = r8
            r14 = r5
            r5 = r9
            r40 = r14
            r14 = r21
            r21 = r6
            r6 = r13
            r13 = r7
            r7 = r23
            r15 = r8
            r8 = r57
            androidx.constraintlayout.core.ArrayRow r3 = r3.createRowDimensionRatio(r4, r5, r6, r7, r8)
            r10.addConstraint(r3)
            if (r34 == 0) goto L_0x01c7
            r18 = 0
        L_0x01c7:
            r23 = r18
            r18 = r36
            goto L_0x01d8
        L_0x01cc:
            r40 = r5
            r13 = r7
            r15 = r8
            r14 = r21
            r21 = r6
            r23 = r18
            r18 = 1
        L_0x01d8:
            if (r58 == 0) goto L_0x04e8
            if (r50 == 0) goto L_0x01e8
            r1 = r37
            r4 = r38
            r5 = r40
            r2 = r15
            r3 = 0
            r6 = 2
            r15 = r9
            goto L_0x04f2
        L_0x01e8:
            if (r11 != 0) goto L_0x01f0
            if (r12 != 0) goto L_0x01f0
            if (r16 != 0) goto L_0x01f0
            goto L_0x04b0
        L_0x01f0:
            if (r11 == 0) goto L_0x020c
            if (r12 != 0) goto L_0x020c
            r7 = r41
            r8 = 0
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r7.mTarget
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r1.mOwner
            if (r34 == 0) goto L_0x0204
            boolean r1 = r1 instanceof androidx.constraintlayout.core.widgets.Barrier
            if (r1 == 0) goto L_0x0204
            r13 = 8
            goto L_0x0205
        L_0x0204:
            r13 = 5
        L_0x0205:
            r22 = r34
            r6 = r13
            r2 = r15
            r3 = 0
            goto L_0x04b6
        L_0x020c:
            r7 = r41
            r8 = 0
            if (r11 != 0) goto L_0x0242
            if (r12 == 0) goto L_0x0242
            int r1 = r42.getMargin()
            int r1 = -r1
            r2 = 8
            r10.addEquality(r15, r14, r1, r2)
            if (r34 == 0) goto L_0x04b0
            boolean r1 = r0.OPTIMIZE_WRAP
            if (r1 == 0) goto L_0x0239
            boolean r1 = r9.isFinalValue
            if (r1 == 0) goto L_0x0239
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r0.mParent
            if (r1 == 0) goto L_0x0239
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r1 = (androidx.constraintlayout.core.widgets.ConstraintWidgetContainer) r1
            if (r33 == 0) goto L_0x0234
            r1.addHorizontalWrapMinVariable(r7)
            goto L_0x04b0
        L_0x0234:
            r1.addVerticalWrapMinVariable(r7)
            goto L_0x04b0
        L_0x0239:
            r6 = r37
            r1 = 5
            r10.addGreaterThan(r9, r6, r8, r1)
            r2 = r15
            goto L_0x04b2
        L_0x0242:
            r6 = r37
            if (r11 == 0) goto L_0x04b0
            if (r12 == 0) goto L_0x04b0
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r7.mTarget
            androidx.constraintlayout.core.widgets.ConstraintWidget r11 = r3.mOwner
            r12 = r42
            r3 = 2
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r12.mTarget
            androidx.constraintlayout.core.widgets.ConstraintWidget r5 = r4.mOwner
            androidx.constraintlayout.core.widgets.ConstraintWidget r4 = r31.getParent()
            r16 = 6
            if (r23 == 0) goto L_0x0343
            if (r2 != 0) goto L_0x02af
            if (r1 != 0) goto L_0x0286
            if (r21 != 0) goto L_0x0286
            boolean r1 = r13.isFinalValue
            if (r1 == 0) goto L_0x027b
            boolean r1 = r14.isFinalValue
            if (r1 == 0) goto L_0x027b
            int r1 = r41.getMargin()
            r2 = 8
            r10.addEquality(r9, r13, r1, r2)
            int r1 = r42.getMargin()
            int r1 = -r1
            r10.addEquality(r15, r14, r1, r2)
            return
        L_0x027b:
            r1 = 8
            r3 = 8
            r19 = 0
            r22 = 1
            r24 = 0
            goto L_0x028e
        L_0x0286:
            r1 = 5
            r3 = 5
            r19 = 1
            r22 = 0
            r24 = 1
        L_0x028e:
            boolean r8 = r11 instanceof androidx.constraintlayout.core.widgets.Barrier
            if (r8 != 0) goto L_0x02a3
            boolean r8 = r5 instanceof androidx.constraintlayout.core.widgets.Barrier
            if (r8 == 0) goto L_0x0297
            goto L_0x02a3
        L_0x0297:
            r8 = r38
            r25 = r22
            r22 = r19
            r19 = r3
        L_0x029f:
            r3 = r1
            r1 = 6
            goto L_0x038d
        L_0x02a3:
            r8 = r38
            r3 = r1
            r25 = r22
            r1 = 6
            r22 = r19
            r19 = 4
            goto L_0x038d
        L_0x02af:
            if (r2 != r3) goto L_0x02c6
            boolean r1 = r11 instanceof androidx.constraintlayout.core.widgets.Barrier
            if (r1 != 0) goto L_0x02c2
            boolean r1 = r5 instanceof androidx.constraintlayout.core.widgets.Barrier
            if (r1 == 0) goto L_0x02ba
            goto L_0x02c2
        L_0x02ba:
            r8 = r38
            r1 = 6
            r3 = 5
            r19 = 5
            goto L_0x0387
        L_0x02c2:
            r8 = r38
            goto L_0x0383
        L_0x02c6:
            r8 = 1
            if (r2 != r8) goto L_0x02d0
            r8 = r38
            r1 = 6
            r3 = 8
            goto L_0x0385
        L_0x02d0:
            r8 = 3
            if (r2 != r8) goto L_0x0338
            int r8 = r0.mResolvedDimensionRatioSide
            r3 = -1
            if (r8 != r3) goto L_0x02f0
            r8 = r38
            if (r51 == 0) goto L_0x02e2
            if (r34 == 0) goto L_0x02e0
            r1 = 5
            goto L_0x02e4
        L_0x02e0:
            r1 = 4
            goto L_0x02e4
        L_0x02e2:
            r1 = 8
        L_0x02e4:
            r3 = 8
        L_0x02e6:
            r19 = 5
        L_0x02e8:
            r22 = 1
            r24 = 1
            r25 = 1
            goto L_0x038d
        L_0x02f0:
            if (r48 == 0) goto L_0x0311
            r3 = r54
            r8 = 2
            if (r3 == r8) goto L_0x02fd
            r1 = 1
            if (r3 != r1) goto L_0x02fb
            goto L_0x02fd
        L_0x02fb:
            r1 = 0
            goto L_0x02fe
        L_0x02fd:
            r1 = 1
        L_0x02fe:
            if (r1 != 0) goto L_0x0304
            r1 = 8
            r3 = 5
            goto L_0x0306
        L_0x0304:
            r1 = 5
            r3 = 4
        L_0x0306:
            r8 = r38
            r19 = r3
            r22 = 1
            r24 = 1
            r25 = 1
            goto L_0x029f
        L_0x0311:
            if (r1 <= 0) goto L_0x0318
            r8 = r38
            r1 = 6
            r3 = 5
            goto L_0x02e6
        L_0x0318:
            if (r1 != 0) goto L_0x0331
            if (r21 != 0) goto L_0x0331
            if (r51 != 0) goto L_0x0325
            r8 = r38
            r1 = 6
            r3 = 5
            r19 = 8
            goto L_0x02e8
        L_0x0325:
            if (r11 == r4) goto L_0x032b
            if (r5 == r4) goto L_0x032b
            r1 = 4
            goto L_0x032c
        L_0x032b:
            r1 = 5
        L_0x032c:
            r8 = r38
            r3 = r1
            r1 = 6
            goto L_0x0335
        L_0x0331:
            r8 = r38
            r1 = 6
            r3 = 5
        L_0x0335:
            r19 = 4
            goto L_0x02e8
        L_0x0338:
            r8 = r38
            r1 = 6
            r3 = 5
            r19 = 4
            r22 = 0
            r24 = 0
            goto L_0x038b
        L_0x0343:
            boolean r1 = r13.isFinalValue
            if (r1 == 0) goto L_0x02c2
            boolean r1 = r14.isFinalValue
            if (r1 == 0) goto L_0x02c2
            int r1 = r41.getMargin()
            int r2 = r42.getMargin()
            r3 = 8
            r48 = r32
            r49 = r9
            r50 = r13
            r51 = r1
            r52 = r47
            r53 = r14
            r54 = r15
            r55 = r2
            r56 = r3
            r48.addCentering(r49, r50, r51, r52, r53, r54, r55, r56)
            if (r34 == 0) goto L_0x0382
            if (r18 == 0) goto L_0x0382
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r12.mTarget
            if (r1 == 0) goto L_0x0379
            int r13 = r42.getMargin()
            r8 = r38
            goto L_0x037c
        L_0x0379:
            r8 = r38
            r13 = 0
        L_0x037c:
            if (r14 == r8) goto L_0x0382
            r1 = 5
            r10.addGreaterThan(r8, r15, r13, r1)
        L_0x0382:
            return
        L_0x0383:
            r1 = 6
            r3 = 5
        L_0x0385:
            r19 = 4
        L_0x0387:
            r22 = 1
            r24 = 1
        L_0x038b:
            r25 = 0
        L_0x038d:
            if (r24 == 0) goto L_0x0398
            if (r13 != r14) goto L_0x0398
            if (r11 == r4) goto L_0x0398
            r24 = 0
            r26 = 0
            goto L_0x039a
        L_0x0398:
            r26 = 1
        L_0x039a:
            if (r22 == 0) goto L_0x03e0
            if (r23 != 0) goto L_0x03af
            if (r49 != 0) goto L_0x03af
            if (r51 != 0) goto L_0x03af
            if (r13 != r6) goto L_0x03af
            if (r14 != r8) goto L_0x03af
            r22 = 0
            r26 = 8
            r27 = 8
            r28 = 0
            goto L_0x03b7
        L_0x03af:
            r22 = r34
            r27 = r1
            r28 = r26
            r26 = r3
        L_0x03b7:
            int r29 = r41.getMargin()
            int r30 = r42.getMargin()
            r1 = r32
            r3 = r2
            r2 = r9
            r12 = r3
            r3 = r13
            r39 = r12
            r12 = r4
            r4 = r29
            r29 = r12
            r12 = r5
            r5 = r47
            r6 = r14
            r7 = r15
            r8 = r30
            r20 = r15
            r15 = r9
            r9 = r27
            r1.addCentering(r2, r3, r4, r5, r6, r7, r8, r9)
            r3 = r26
            r26 = r28
            goto L_0x03ea
        L_0x03e0:
            r39 = r2
            r29 = r4
            r12 = r5
            r20 = r15
            r15 = r9
            r22 = r34
        L_0x03ea:
            int r1 = r0.mVisibility
            r2 = 8
            if (r1 != r2) goto L_0x03f7
            boolean r1 = r42.hasDependents()
            if (r1 != 0) goto L_0x03f7
            return
        L_0x03f7:
            if (r24 == 0) goto L_0x041a
            if (r22 == 0) goto L_0x0408
            if (r13 == r14) goto L_0x0408
            if (r23 != 0) goto L_0x0408
            boolean r1 = r11 instanceof androidx.constraintlayout.core.widgets.Barrier
            if (r1 != 0) goto L_0x0407
            boolean r1 = r12 instanceof androidx.constraintlayout.core.widgets.Barrier
            if (r1 == 0) goto L_0x0408
        L_0x0407:
            r3 = 6
        L_0x0408:
            int r1 = r41.getMargin()
            r10.addGreaterThan(r15, r13, r1, r3)
            int r1 = r42.getMargin()
            int r1 = -r1
            r2 = r20
            r10.addLowerThan(r2, r14, r1, r3)
            goto L_0x041c
        L_0x041a:
            r2 = r20
        L_0x041c:
            if (r22 == 0) goto L_0x0431
            if (r52 == 0) goto L_0x0431
            boolean r1 = r11 instanceof androidx.constraintlayout.core.widgets.Barrier
            if (r1 != 0) goto L_0x0431
            boolean r1 = r12 instanceof androidx.constraintlayout.core.widgets.Barrier
            if (r1 != 0) goto L_0x0431
            r1 = r29
            if (r12 == r1) goto L_0x0433
            r3 = 6
            r4 = 6
            r26 = 1
            goto L_0x0435
        L_0x0431:
            r1 = r29
        L_0x0433:
            r4 = r19
        L_0x0435:
            if (r26 == 0) goto L_0x047e
            if (r25 == 0) goto L_0x045e
            if (r51 == 0) goto L_0x043d
            if (r35 == 0) goto L_0x045e
        L_0x043d:
            if (r11 == r1) goto L_0x0444
            if (r12 != r1) goto L_0x0442
            goto L_0x0444
        L_0x0442:
            r6 = r4
            goto L_0x0445
        L_0x0444:
            r6 = 6
        L_0x0445:
            boolean r5 = r11 instanceof androidx.constraintlayout.core.widgets.Guideline
            if (r5 != 0) goto L_0x044d
            boolean r5 = r12 instanceof androidx.constraintlayout.core.widgets.Guideline
            if (r5 == 0) goto L_0x044e
        L_0x044d:
            r6 = 5
        L_0x044e:
            boolean r5 = r11 instanceof androidx.constraintlayout.core.widgets.Barrier
            if (r5 != 0) goto L_0x0456
            boolean r5 = r12 instanceof androidx.constraintlayout.core.widgets.Barrier
            if (r5 == 0) goto L_0x0457
        L_0x0456:
            r6 = 5
        L_0x0457:
            if (r51 == 0) goto L_0x045a
            r6 = 5
        L_0x045a:
            int r4 = java.lang.Math.max(r6, r4)
        L_0x045e:
            if (r22 == 0) goto L_0x046f
            int r3 = java.lang.Math.min(r3, r4)
            if (r48 == 0) goto L_0x046e
            if (r51 != 0) goto L_0x046e
            if (r11 == r1) goto L_0x046c
            if (r12 != r1) goto L_0x046e
        L_0x046c:
            r4 = 4
            goto L_0x046f
        L_0x046e:
            r4 = r3
        L_0x046f:
            int r1 = r41.getMargin()
            r10.addEquality(r15, r13, r1, r4)
            int r1 = r42.getMargin()
            int r1 = -r1
            r10.addEquality(r2, r14, r1, r4)
        L_0x047e:
            if (r22 == 0) goto L_0x0490
            r1 = r37
            if (r1 != r13) goto L_0x0489
            int r3 = r41.getMargin()
            goto L_0x048a
        L_0x0489:
            r3 = 0
        L_0x048a:
            if (r13 == r1) goto L_0x0490
            r4 = 5
            r10.addGreaterThan(r15, r1, r3, r4)
        L_0x0490:
            if (r22 == 0) goto L_0x04ad
            if (r23 == 0) goto L_0x04ad
            if (r45 != 0) goto L_0x04ad
            if (r21 != 0) goto L_0x04ad
            if (r23 == 0) goto L_0x04a7
            r1 = r39
            r3 = 3
            if (r1 != r3) goto L_0x04a7
            r1 = 8
            r3 = 0
            r10.addGreaterThan(r2, r15, r3, r1)
            r1 = 5
            goto L_0x04b5
        L_0x04a7:
            r3 = 0
            r1 = 5
            r10.addGreaterThan(r2, r15, r3, r1)
            goto L_0x04b5
        L_0x04ad:
            r1 = 5
            r3 = 0
            goto L_0x04b5
        L_0x04b0:
            r2 = r15
            r1 = 5
        L_0x04b2:
            r3 = 0
            r22 = r34
        L_0x04b5:
            r6 = 5
        L_0x04b6:
            if (r22 == 0) goto L_0x04e7
            if (r18 == 0) goto L_0x04e7
            r1 = r42
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r1.mTarget
            if (r4 == 0) goto L_0x04c7
            int r13 = r42.getMargin()
            r4 = r38
            goto L_0x04ca
        L_0x04c7:
            r4 = r38
            r13 = 0
        L_0x04ca:
            if (r14 == r4) goto L_0x04e7
            boolean r3 = r0.OPTIMIZE_WRAP
            if (r3 == 0) goto L_0x04e4
            boolean r3 = r2.isFinalValue
            if (r3 == 0) goto L_0x04e4
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r0.mParent
            if (r3 == 0) goto L_0x04e4
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r3 = (androidx.constraintlayout.core.widgets.ConstraintWidgetContainer) r3
            if (r33 == 0) goto L_0x04e0
            r3.addHorizontalWrapMaxVariable(r1)
            goto L_0x04e3
        L_0x04e0:
            r3.addVerticalWrapMaxVariable(r1)
        L_0x04e3:
            return
        L_0x04e4:
            r10.addGreaterThan(r4, r2, r13, r6)
        L_0x04e7:
            return
        L_0x04e8:
            r1 = r37
            r4 = r38
            r2 = r15
            r3 = 0
            r15 = r9
            r5 = r40
            r6 = 2
        L_0x04f2:
            if (r5 >= r6) goto L_0x0533
            if (r34 == 0) goto L_0x0533
            if (r18 == 0) goto L_0x0533
            r5 = 8
            r10.addGreaterThan(r15, r1, r3, r5)
            if (r33 != 0) goto L_0x0508
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r0.mBaseline
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r1.mTarget
            if (r1 != 0) goto L_0x0506
            goto L_0x0508
        L_0x0506:
            r13 = 0
            goto L_0x0509
        L_0x0508:
            r13 = 1
        L_0x0509:
            if (r33 != 0) goto L_0x052b
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r0.mBaseline
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r1.mTarget
            if (r1 == 0) goto L_0x052b
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r1.mOwner
            float r5 = r1.mDimensionRatio
            r6 = 0
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 == 0) goto L_0x0529
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r1 = r1.mListDimensionBehaviors
            r5 = r1[r3]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r5 != r6) goto L_0x0529
            r5 = 1
            r1 = r1[r5]
            if (r1 != r6) goto L_0x0529
            r14 = 1
            goto L_0x052c
        L_0x0529:
            r14 = 0
            goto L_0x052c
        L_0x052b:
            r14 = r13
        L_0x052c:
            if (r14 == 0) goto L_0x0533
            r1 = 8
            r10.addGreaterThan(r4, r2, r3, r1)
        L_0x0533:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.ConstraintWidget.applyConstraints(androidx.constraintlayout.core.LinearSystem, boolean, boolean, boolean, boolean, androidx.constraintlayout.core.SolverVariable, androidx.constraintlayout.core.SolverVariable, androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour, boolean, androidx.constraintlayout.core.widgets.ConstraintAnchor, androidx.constraintlayout.core.widgets.ConstraintAnchor, int, int, int, int, float, boolean, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    private void getSceneString(StringBuilder sb, String str, int i, int i2, int i3, int i4, int i5, int i6, float f, float f2) {
        sb.append(str);
        sb.append(" :  {\n");
        serializeAttribute(sb, "      size", i, 0);
        serializeAttribute(sb, "      min", i2, 0);
        serializeAttribute(sb, "      max", i3, (int) ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
        serializeAttribute(sb, "      matchMin", i5, 0);
        serializeAttribute(sb, "      matchDef", i6, 0);
        serializeAttribute(sb, "      matchPercent", f, 1.0f);
        sb.append("    },\n");
    }

    private void getSceneString(StringBuilder sb, String str, ConstraintAnchor constraintAnchor) {
        if (constraintAnchor.mTarget != null) {
            sb.append("    ");
            sb.append(str);
            sb.append(" : [ '");
            sb.append(constraintAnchor.mTarget);
            sb.append("'");
            if (!(constraintAnchor.mGoneMargin == Integer.MIN_VALUE && constraintAnchor.mMargin == 0)) {
                sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                sb.append(constraintAnchor.mMargin);
                if (constraintAnchor.mGoneMargin != Integer.MIN_VALUE) {
                    sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                    sb.append(constraintAnchor.mGoneMargin);
                    sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                }
            }
            sb.append(" ] ,\n");
        }
    }

    private boolean isChainHead(int i) {
        int i2 = i * 2;
        ConstraintAnchor[] constraintAnchorArr = this.mListAnchors;
        if (!(constraintAnchorArr[i2].mTarget == null || constraintAnchorArr[i2].mTarget.mTarget == constraintAnchorArr[i2])) {
            int i3 = i2 + 1;
            return constraintAnchorArr[i3].mTarget != null && constraintAnchorArr[i3].mTarget.mTarget == constraintAnchorArr[i3];
        }
    }

    private void serializeAnchor(StringBuilder sb, String str, ConstraintAnchor constraintAnchor) {
        if (constraintAnchor.mTarget != null) {
            sb.append(str);
            sb.append(" : [ '");
            sb.append(constraintAnchor.mTarget);
            sb.append("',");
            sb.append(constraintAnchor.mMargin);
            sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            sb.append(constraintAnchor.mGoneMargin);
            sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            sb.append(" ] ,\n");
        }
    }

    private void serializeAttribute(StringBuilder sb, String str, float f, float f2) {
        if (f != f2) {
            sb.append(str);
            sb.append(" :   ");
            sb.append(f);
            sb.append(",\n");
        }
    }

    private void serializeAttribute(StringBuilder sb, String str, int i, int i2) {
        if (i != i2) {
            sb.append(str);
            sb.append(" :   ");
            sb.append(i);
            sb.append(",\n");
        }
    }

    private void serializeCircle(StringBuilder sb, ConstraintAnchor constraintAnchor, float f) {
        if (constraintAnchor.mTarget != null) {
            sb.append("circle : [ '");
            sb.append(constraintAnchor.mTarget);
            sb.append("',");
            sb.append(constraintAnchor.mMargin);
            sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            sb.append(f);
            sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            sb.append(" ] ,\n");
        }
    }

    private void serializeDimensionRatio(StringBuilder sb, String str, float f, int i) {
        if (f != 0.0f) {
            sb.append(str);
            sb.append(" :  [");
            sb.append(f);
            sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            sb.append(i);
            sb.append("");
            sb.append("],\n");
        }
    }

    private void serializeSize(StringBuilder sb, String str, int i, int i2, int i3, int i4, int i5, int i6, float f, float f2) {
        sb.append(str);
        sb.append(" :  {\n");
        serializeAttribute(sb, "size", i, Integer.MIN_VALUE);
        serializeAttribute(sb, "min", i2, 0);
        serializeAttribute(sb, "max", i3, (int) ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
        serializeAttribute(sb, "matchMin", i5, 0);
        serializeAttribute(sb, "matchDef", i6, 0);
        serializeAttribute(sb, "matchPercent", i6, 1);
        sb.append("},\n");
    }

    public void addChildrenToSolverByDependency(ConstraintWidgetContainer constraintWidgetContainer, LinearSystem linearSystem, HashSet<ConstraintWidget> hashSet, int i, boolean z) {
        if (z) {
            if (hashSet.contains(this)) {
                Optimizer.checkMatchParent(constraintWidgetContainer, linearSystem, this);
                hashSet.remove(this);
                addToSolver(linearSystem, constraintWidgetContainer.optimizeFor(64));
            } else {
                return;
            }
        }
        if (i == 0) {
            HashSet<ConstraintAnchor> dependents = this.mLeft.getDependents();
            if (dependents != null) {
                Iterator<ConstraintAnchor> it = dependents.iterator();
                while (it.hasNext()) {
                    it.next().mOwner.addChildrenToSolverByDependency(constraintWidgetContainer, linearSystem, hashSet, i, true);
                }
            }
            HashSet<ConstraintAnchor> dependents2 = this.mRight.getDependents();
            if (dependents2 != null) {
                Iterator<ConstraintAnchor> it2 = dependents2.iterator();
                while (it2.hasNext()) {
                    it2.next().mOwner.addChildrenToSolverByDependency(constraintWidgetContainer, linearSystem, hashSet, i, true);
                }
                return;
            }
            return;
        }
        HashSet<ConstraintAnchor> dependents3 = this.mTop.getDependents();
        if (dependents3 != null) {
            Iterator<ConstraintAnchor> it3 = dependents3.iterator();
            while (it3.hasNext()) {
                it3.next().mOwner.addChildrenToSolverByDependency(constraintWidgetContainer, linearSystem, hashSet, i, true);
            }
        }
        HashSet<ConstraintAnchor> dependents4 = this.mBottom.getDependents();
        if (dependents4 != null) {
            Iterator<ConstraintAnchor> it4 = dependents4.iterator();
            while (it4.hasNext()) {
                it4.next().mOwner.addChildrenToSolverByDependency(constraintWidgetContainer, linearSystem, hashSet, i, true);
            }
        }
        HashSet<ConstraintAnchor> dependents5 = this.mBaseline.getDependents();
        if (dependents5 != null) {
            Iterator<ConstraintAnchor> it5 = dependents5.iterator();
            while (it5.hasNext()) {
                it5.next().mOwner.addChildrenToSolverByDependency(constraintWidgetContainer, linearSystem, hashSet, i, true);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean addFirst() {
        return (this instanceof VirtualLayout) || (this instanceof Guideline);
    }

    /* JADX WARNING: Removed duplicated region for block: B:190:0x02f4  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x02fe  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x0303  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x031c  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x031e  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x0321  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x0324  */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x0356  */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x03a0  */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x0463  */
    /* JADX WARNING: Removed duplicated region for block: B:265:0x04c7  */
    /* JADX WARNING: Removed duplicated region for block: B:269:0x04db  */
    /* JADX WARNING: Removed duplicated region for block: B:270:0x04dd  */
    /* JADX WARNING: Removed duplicated region for block: B:274:0x04e4  */
    /* JADX WARNING: Removed duplicated region for block: B:308:0x0578  */
    /* JADX WARNING: Removed duplicated region for block: B:309:0x057b  */
    /* JADX WARNING: Removed duplicated region for block: B:311:0x05bb  */
    /* JADX WARNING: Removed duplicated region for block: B:313:0x05c1  */
    /* JADX WARNING: Removed duplicated region for block: B:318:0x05e7  */
    /* JADX WARNING: Removed duplicated region for block: B:321:0x05f1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void addToSolver(androidx.constraintlayout.core.LinearSystem r54, boolean r55) {
        /*
            r53 = this;
            r15 = r53
            r14 = r54
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r15.mLeft
            androidx.constraintlayout.core.SolverVariable r13 = r14.createObjectVariable(r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r15.mRight
            androidx.constraintlayout.core.SolverVariable r12 = r14.createObjectVariable(r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r15.mTop
            androidx.constraintlayout.core.SolverVariable r11 = r14.createObjectVariable(r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r15.mBottom
            androidx.constraintlayout.core.SolverVariable r10 = r14.createObjectVariable(r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r15.mBaseline
            androidx.constraintlayout.core.SolverVariable r9 = r14.createObjectVariable(r0)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.mParent
            r8 = 2
            r1 = 3
            r7 = 1
            r6 = 0
            if (r0 == 0) goto L_0x0054
            if (r0 == 0) goto L_0x0036
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r2 = r0.mListDimensionBehaviors
            r2 = r2[r6]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r2 != r3) goto L_0x0036
            r2 = 1
            goto L_0x0037
        L_0x0036:
            r2 = 0
        L_0x0037:
            if (r0 == 0) goto L_0x0043
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r0.mListDimensionBehaviors
            r0 = r0[r7]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r0 != r3) goto L_0x0043
            r0 = 1
            goto L_0x0044
        L_0x0043:
            r0 = 0
        L_0x0044:
            int r3 = r15.mWrapBehaviorInParent
            if (r3 == r7) goto L_0x0052
            if (r3 == r8) goto L_0x004f
            if (r3 == r1) goto L_0x0054
            r5 = r0
            r4 = r2
            goto L_0x0056
        L_0x004f:
            r5 = r0
            r4 = 0
            goto L_0x0056
        L_0x0052:
            r4 = r2
            goto L_0x0055
        L_0x0054:
            r4 = 0
        L_0x0055:
            r5 = 0
        L_0x0056:
            int r0 = r15.mVisibility
            r3 = 8
            if (r0 != r3) goto L_0x0071
            boolean r0 = r15.mAnimated
            if (r0 != 0) goto L_0x0071
            boolean r0 = r53.hasDependencies()
            if (r0 != 0) goto L_0x0071
            boolean[] r0 = r15.mIsInBarrier
            boolean r2 = r0[r6]
            if (r2 != 0) goto L_0x0071
            boolean r0 = r0[r7]
            if (r0 != 0) goto L_0x0071
            return
        L_0x0071:
            boolean r0 = r15.resolvedHorizontal
            r2 = 5
            if (r0 != 0) goto L_0x007a
            boolean r8 = r15.resolvedVertical
            if (r8 == 0) goto L_0x00f7
        L_0x007a:
            if (r0 == 0) goto L_0x00a9
            int r0 = r15.f52mX
            r14.addEquality(r13, r0)
            int r0 = r15.f52mX
            int r8 = r15.mWidth
            int r0 = r0 + r8
            r14.addEquality(r12, r0)
            if (r4 == 0) goto L_0x00a9
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.mParent
            if (r0 == 0) goto L_0x00a9
            boolean r8 = r15.OPTIMIZE_WRAP_ON_RESOLVED
            if (r8 == 0) goto L_0x00a0
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r0 = (androidx.constraintlayout.core.widgets.ConstraintWidgetContainer) r0
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r15.mLeft
            r0.addHorizontalWrapMinVariable(r8)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r15.mRight
            r0.addHorizontalWrapMaxVariable(r8)
            goto L_0x00a9
        L_0x00a0:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.mRight
            androidx.constraintlayout.core.SolverVariable r0 = r14.createObjectVariable(r0)
            r14.addGreaterThan(r0, r12, r6, r2)
        L_0x00a9:
            boolean r0 = r15.resolvedVertical
            if (r0 == 0) goto L_0x00ea
            int r0 = r15.f53mY
            r14.addEquality(r11, r0)
            int r0 = r15.f53mY
            int r8 = r15.mHeight
            int r0 = r0 + r8
            r14.addEquality(r10, r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r15.mBaseline
            boolean r0 = r0.hasDependents()
            if (r0 == 0) goto L_0x00ca
            int r0 = r15.f53mY
            int r8 = r15.mBaselineDistance
            int r0 = r0 + r8
            r14.addEquality(r9, r0)
        L_0x00ca:
            if (r5 == 0) goto L_0x00ea
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.mParent
            if (r0 == 0) goto L_0x00ea
            boolean r8 = r15.OPTIMIZE_WRAP_ON_RESOLVED
            if (r8 == 0) goto L_0x00e1
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r0 = (androidx.constraintlayout.core.widgets.ConstraintWidgetContainer) r0
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r15.mTop
            r0.addVerticalWrapMinVariable(r8)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r15.mBottom
            r0.addVerticalWrapMaxVariable(r8)
            goto L_0x00ea
        L_0x00e1:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.mBottom
            androidx.constraintlayout.core.SolverVariable r0 = r14.createObjectVariable(r0)
            r14.addGreaterThan(r0, r10, r6, r2)
        L_0x00ea:
            boolean r0 = r15.resolvedHorizontal
            if (r0 == 0) goto L_0x00f7
            boolean r0 = r15.resolvedVertical
            if (r0 == 0) goto L_0x00f7
            r15.resolvedHorizontal = r6
            r15.resolvedVertical = r6
            return
        L_0x00f7:
            androidx.constraintlayout.core.Metrics r0 = androidx.constraintlayout.core.LinearSystem.sMetrics
            r17 = 1
            if (r0 == 0) goto L_0x0103
            long r1 = r0.widgets
            long r1 = r1 + r17
            r0.widgets = r1
        L_0x0103:
            if (r55 == 0) goto L_0x0192
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r1 = r15.horizontalRun
            if (r1 == 0) goto L_0x0192
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r2 = r15.verticalRun
            if (r2 == 0) goto L_0x0192
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r8 = r1.start
            boolean r7 = r8.resolved
            if (r7 == 0) goto L_0x0192
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r1.end
            boolean r1 = r1.resolved
            if (r1 == 0) goto L_0x0192
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r2.start
            boolean r1 = r1.resolved
            if (r1 == 0) goto L_0x0192
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r2.end
            boolean r1 = r1.resolved
            if (r1 == 0) goto L_0x0192
            if (r0 == 0) goto L_0x012d
            long r1 = r0.graphSolved
            long r1 = r1 + r17
            r0.graphSolved = r1
        L_0x012d:
            int r0 = r8.value
            r14.addEquality(r13, r0)
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r0 = r15.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.end
            int r0 = r0.value
            r14.addEquality(r12, r0)
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r0 = r15.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.start
            int r0 = r0.value
            r14.addEquality(r11, r0)
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r0 = r15.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.end
            int r0 = r0.value
            r14.addEquality(r10, r0)
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r0 = r15.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.baseline
            int r0 = r0.value
            r14.addEquality(r9, r0)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.mParent
            if (r0 == 0) goto L_0x018d
            if (r4 == 0) goto L_0x0173
            boolean[] r0 = r15.isTerminalWidget
            boolean r0 = r0[r6]
            if (r0 == 0) goto L_0x0173
            boolean r0 = r53.isInHorizontalChain()
            if (r0 != 0) goto L_0x0173
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.mParent
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.mRight
            androidx.constraintlayout.core.SolverVariable r0 = r14.createObjectVariable(r0)
            r14.addGreaterThan(r0, r12, r6, r3)
        L_0x0173:
            if (r5 == 0) goto L_0x018d
            boolean[] r0 = r15.isTerminalWidget
            r1 = 1
            boolean r0 = r0[r1]
            if (r0 == 0) goto L_0x018d
            boolean r0 = r53.isInVerticalChain()
            if (r0 != 0) goto L_0x018d
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.mParent
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.mBottom
            androidx.constraintlayout.core.SolverVariable r0 = r14.createObjectVariable(r0)
            r14.addGreaterThan(r0, r10, r6, r3)
        L_0x018d:
            r15.resolvedHorizontal = r6
            r15.resolvedVertical = r6
            return
        L_0x0192:
            if (r0 == 0) goto L_0x019a
            long r1 = r0.linearSolved
            long r1 = r1 + r17
            r0.linearSolved = r1
        L_0x019a:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.mParent
            if (r0 == 0) goto L_0x020e
            boolean r0 = r15.isChainHead(r6)
            if (r0 == 0) goto L_0x01ad
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.mParent
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r0 = (androidx.constraintlayout.core.widgets.ConstraintWidgetContainer) r0
            r0.addChain(r15, r6)
            r0 = 1
            goto L_0x01b1
        L_0x01ad:
            boolean r0 = r53.isInHorizontalChain()
        L_0x01b1:
            r1 = 1
            boolean r2 = r15.isChainHead(r1)
            if (r2 == 0) goto L_0x01c1
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r15.mParent
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r2 = (androidx.constraintlayout.core.widgets.ConstraintWidgetContainer) r2
            r2.addChain(r15, r1)
            r1 = 1
            goto L_0x01c5
        L_0x01c1:
            boolean r1 = r53.isInVerticalChain()
        L_0x01c5:
            if (r0 != 0) goto L_0x01e5
            if (r4 == 0) goto L_0x01e5
            int r2 = r15.mVisibility
            if (r2 == r3) goto L_0x01e5
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r15.mLeft
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.mTarget
            if (r2 != 0) goto L_0x01e5
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r15.mRight
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.mTarget
            if (r2 != 0) goto L_0x01e5
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r15.mParent
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.mRight
            androidx.constraintlayout.core.SolverVariable r2 = r14.createObjectVariable(r2)
            r7 = 1
            r14.addGreaterThan(r2, r12, r6, r7)
        L_0x01e5:
            if (r1 != 0) goto L_0x0209
            if (r5 == 0) goto L_0x0209
            int r2 = r15.mVisibility
            if (r2 == r3) goto L_0x0209
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r15.mTop
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.mTarget
            if (r2 != 0) goto L_0x0209
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r15.mBottom
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.mTarget
            if (r2 != 0) goto L_0x0209
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r15.mBaseline
            if (r2 != 0) goto L_0x0209
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r15.mParent
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.mBottom
            androidx.constraintlayout.core.SolverVariable r2 = r14.createObjectVariable(r2)
            r7 = 1
            r14.addGreaterThan(r2, r10, r6, r7)
        L_0x0209:
            r29 = r0
            r28 = r1
            goto L_0x0212
        L_0x020e:
            r28 = 0
            r29 = 0
        L_0x0212:
            int r0 = r15.mWidth
            int r1 = r15.mMinWidth
            if (r0 >= r1) goto L_0x0219
            goto L_0x021a
        L_0x0219:
            r1 = r0
        L_0x021a:
            int r2 = r15.mHeight
            int r7 = r15.mMinHeight
            if (r2 >= r7) goto L_0x0221
            goto L_0x0222
        L_0x0221:
            r7 = r2
        L_0x0222:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r8 = r15.mListDimensionBehaviors
            r3 = r8[r6]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            r22 = r1
            if (r3 == r6) goto L_0x022e
            r3 = 1
            goto L_0x022f
        L_0x022e:
            r3 = 0
        L_0x022f:
            r21 = 1
            r1 = r8[r21]
            r23 = r7
            if (r1 == r6) goto L_0x0239
            r1 = 1
            goto L_0x023a
        L_0x0239:
            r1 = 0
        L_0x023a:
            int r7 = r15.mDimensionRatioSide
            r15.mResolvedDimensionRatioSide = r7
            r27 = r9
            float r9 = r15.mDimensionRatio
            r15.mResolvedDimensionRatio = r9
            r30 = r10
            int r10 = r15.mMatchConstraintDefaultWidth
            r31 = r11
            int r11 = r15.mMatchConstraintDefaultHeight
            r24 = 0
            r25 = 4
            r32 = r12
            int r24 = (r9 > r24 ? 1 : (r9 == r24 ? 0 : -1))
            if (r24 <= 0) goto L_0x02dd
            int r12 = r15.mVisibility
            r33 = r13
            r13 = 8
            if (r12 == r13) goto L_0x02df
            r12 = 0
            r13 = r8[r12]
            if (r13 != r6) goto L_0x0266
            if (r10 != 0) goto L_0x0266
            r10 = 3
        L_0x0266:
            r12 = 1
            r13 = r8[r12]
            if (r13 != r6) goto L_0x026e
            if (r11 != 0) goto L_0x026e
            r11 = 3
        L_0x026e:
            r13 = 0
            r14 = r8[r13]
            if (r14 != r6) goto L_0x0280
            r13 = r8[r12]
            if (r13 != r6) goto L_0x0280
            r12 = 3
            if (r10 != r12) goto L_0x0281
            if (r11 != r12) goto L_0x0281
            r15.setupDimensionRatio(r4, r5, r3, r1)
            goto L_0x02d2
        L_0x0280:
            r12 = 3
        L_0x0281:
            r1 = 0
            r3 = r8[r1]
            if (r3 != r6) goto L_0x02a5
            if (r10 != r12) goto L_0x02a5
            r3 = r8
            r15.mResolvedDimensionRatioSide = r1
            float r0 = (float) r2
            float r9 = r9 * r0
            int r1 = (int) r9
            r2 = 1
            r0 = r3[r2]
            if (r0 == r6) goto L_0x029d
            r35 = r11
            r34 = r23
            r0 = 0
            r14 = 0
            r36 = 4
            goto L_0x02e9
        L_0x029d:
            r36 = r10
            r35 = r11
            r34 = r23
            r0 = 0
            goto L_0x02db
        L_0x02a5:
            r3 = r8
            r2 = 1
            r1 = r3[r2]
            if (r1 != r6) goto L_0x02d2
            r1 = 3
            if (r11 != r1) goto L_0x02d2
            r15.mResolvedDimensionRatioSide = r2
            r1 = -1
            if (r7 != r1) goto L_0x02b8
            r1 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 / r9
            r15.mResolvedDimensionRatio = r1
        L_0x02b8:
            float r1 = r15.mResolvedDimensionRatio
            float r0 = (float) r0
            float r1 = r1 * r0
            int r7 = (int) r1
            r0 = 0
            r1 = r3[r0]
            r34 = r7
            r36 = r10
            if (r1 == r6) goto L_0x02cd
            r1 = r22
            r14 = 0
            r35 = 4
            goto L_0x02e9
        L_0x02cd:
            r35 = r11
            r1 = r22
            goto L_0x02db
        L_0x02d2:
            r0 = 0
            r36 = r10
            r35 = r11
            r1 = r22
            r34 = r23
        L_0x02db:
            r14 = 1
            goto L_0x02e9
        L_0x02dd:
            r33 = r13
        L_0x02df:
            r0 = 0
            r36 = r10
            r35 = r11
            r1 = r22
            r34 = r23
            r14 = 0
        L_0x02e9:
            int[] r2 = r15.mResolvedMatchConstraintDefault
            r2[r0] = r36
            r0 = 1
            r2[r0] = r35
            r15.mResolvedHasRatio = r14
            if (r14 == 0) goto L_0x02fe
            int r0 = r15.mResolvedDimensionRatioSide
            r2 = -1
            if (r0 == 0) goto L_0x02fb
            if (r0 != r2) goto L_0x02ff
        L_0x02fb:
            r20 = 1
            goto L_0x0301
        L_0x02fe:
            r2 = -1
        L_0x02ff:
            r20 = 0
        L_0x0301:
            if (r14 == 0) goto L_0x030d
            int r0 = r15.mResolvedDimensionRatioSide
            r3 = 1
            if (r0 == r3) goto L_0x030a
            if (r0 != r2) goto L_0x030d
        L_0x030a:
            r37 = 1
            goto L_0x030f
        L_0x030d:
            r37 = 0
        L_0x030f:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r15.mListDimensionBehaviors
            r2 = 0
            r0 = r0[r2]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r13 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r0 != r13) goto L_0x031e
            boolean r0 = r15 instanceof androidx.constraintlayout.core.widgets.ConstraintWidgetContainer
            if (r0 == 0) goto L_0x031e
            r9 = 1
            goto L_0x031f
        L_0x031e:
            r9 = 0
        L_0x031f:
            if (r9 == 0) goto L_0x0324
            r22 = 0
            goto L_0x0326
        L_0x0324:
            r22 = r1
        L_0x0326:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r15.mCenter
            boolean r0 = r0.isConnected()
            r1 = 1
            r38 = r0 ^ 1
            boolean[] r0 = r15.mIsInBarrier
            r2 = 0
            boolean r23 = r0[r2]
            boolean r39 = r0[r1]
            int r0 = r15.mHorizontalResolution
            r40 = 0
            r8 = 2
            if (r0 == r8) goto L_0x044d
            boolean r0 = r15.resolvedHorizontal
            if (r0 != 0) goto L_0x044d
            if (r55 == 0) goto L_0x03a4
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r0 = r15.horizontalRun
            if (r0 == 0) goto L_0x03a4
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r0.start
            boolean r2 = r1.resolved
            if (r2 == 0) goto L_0x03a4
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.end
            boolean r0 = r0.resolved
            if (r0 != 0) goto L_0x0354
            goto L_0x03a4
        L_0x0354:
            if (r55 == 0) goto L_0x03a0
            int r0 = r1.value
            r12 = r54
            r11 = r33
            r12.addEquality(r11, r0)
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r0 = r15.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.end
            int r0 = r0.value
            r10 = r32
            r12.addEquality(r10, r0)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.mParent
            if (r0 == 0) goto L_0x038a
            if (r4 == 0) goto L_0x038a
            boolean[] r0 = r15.isTerminalWidget
            r1 = 0
            boolean r0 = r0[r1]
            if (r0 == 0) goto L_0x038a
            boolean r0 = r53.isInHorizontalChain()
            if (r0 != 0) goto L_0x038a
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.mParent
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.mRight
            androidx.constraintlayout.core.SolverVariable r0 = r12.createObjectVariable(r0)
            r3 = 8
            r12.addGreaterThan(r0, r10, r1, r3)
        L_0x038a:
            r43 = r4
            r47 = r5
            r48 = r6
            r52 = r13
            r32 = r14
            r49 = r27
            r50 = r30
            r51 = r31
            r30 = r10
            r31 = r11
            goto L_0x0461
        L_0x03a0:
            r12 = r54
            goto L_0x044d
        L_0x03a4:
            r12 = r54
            r10 = r32
            r11 = r33
            r3 = 8
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.mParent
            if (r0 == 0) goto L_0x03b8
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.mRight
            androidx.constraintlayout.core.SolverVariable r0 = r12.createObjectVariable(r0)
            r7 = r0
            goto L_0x03ba
        L_0x03b8:
            r7 = r40
        L_0x03ba:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.mParent
            if (r0 == 0) goto L_0x03c7
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.mLeft
            androidx.constraintlayout.core.SolverVariable r0 = r12.createObjectVariable(r0)
            r16 = r0
            goto L_0x03c9
        L_0x03c7:
            r16 = r40
        L_0x03c9:
            boolean[] r0 = r15.isTerminalWidget
            r17 = 0
            boolean r18 = r0[r17]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r15.mListDimensionBehaviors
            r32 = r0[r17]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r15.mLeft
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r15.mRight
            r41 = r2
            int r2 = r15.f52mX
            r42 = r2
            int r2 = r15.mMinWidth
            int[] r3 = r15.mMaxDimension
            r44 = r3[r17]
            float r3 = r15.mHorizontalBiasPercent
            r21 = 1
            r0 = r0[r21]
            if (r0 != r6) goto L_0x03ee
            r45 = 1
            goto L_0x03f0
        L_0x03ee:
            r45 = 0
        L_0x03f0:
            int r0 = r15.mMatchConstraintMinWidth
            r24 = r0
            int r0 = r15.mMatchConstraintMaxWidth
            r25 = r0
            float r0 = r15.mMatchConstraintPercentWidth
            r26 = r0
            r0 = r53
            r46 = r1
            r1 = r54
            r19 = r41
            r33 = r42
            r41 = r2
            r2 = 1
            r42 = r3
            r3 = r4
            r43 = r4
            r4 = r5
            r47 = r5
            r5 = r18
            r48 = r6
            r6 = r16
            r8 = r32
            r49 = r27
            r16 = r10
            r50 = r30
            r10 = r46
            r17 = r11
            r51 = r31
            r11 = r19
            r30 = r16
            r12 = r33
            r52 = r13
            r31 = r17
            r13 = r22
            r32 = r14
            r14 = r41
            r15 = r44
            r16 = r42
            r17 = r20
            r18 = r45
            r19 = r29
            r20 = r28
            r21 = r23
            r22 = r36
            r23 = r35
            r27 = r38
            r0.applyConstraints(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            goto L_0x0461
        L_0x044d:
            r43 = r4
            r47 = r5
            r48 = r6
            r52 = r13
            r49 = r27
            r50 = r30
            r51 = r31
            r30 = r32
            r31 = r33
            r32 = r14
        L_0x0461:
            if (r55 == 0) goto L_0x04c7
            r15 = r53
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r0 = r15.verticalRun
            if (r0 == 0) goto L_0x04ba
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r0.start
            boolean r2 = r1.resolved
            if (r2 == 0) goto L_0x04ba
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.end
            boolean r0 = r0.resolved
            if (r0 == 0) goto L_0x04ba
            int r0 = r1.value
            r14 = r54
            r13 = r51
            r14.addEquality(r13, r0)
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r0 = r15.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.end
            int r0 = r0.value
            r12 = r50
            r14.addEquality(r12, r0)
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r0 = r15.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.baseline
            int r0 = r0.value
            r1 = r49
            r14.addEquality(r1, r0)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.mParent
            if (r0 == 0) goto L_0x04b4
            if (r28 != 0) goto L_0x04b4
            if (r47 == 0) goto L_0x04b4
            boolean[] r2 = r15.isTerminalWidget
            r11 = 1
            boolean r2 = r2[r11]
            if (r2 == 0) goto L_0x04b0
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.mBottom
            androidx.constraintlayout.core.SolverVariable r0 = r14.createObjectVariable(r0)
            r2 = 8
            r10 = 0
            r14.addGreaterThan(r0, r12, r10, r2)
            goto L_0x04b8
        L_0x04b0:
            r2 = 8
            r10 = 0
            goto L_0x04b8
        L_0x04b4:
            r2 = 8
            r10 = 0
            r11 = 1
        L_0x04b8:
            r7 = 0
            goto L_0x04d6
        L_0x04ba:
            r14 = r54
            r1 = r49
            r12 = r50
            r13 = r51
            r2 = 8
            r10 = 0
            r11 = 1
            goto L_0x04d5
        L_0x04c7:
            r2 = 8
            r10 = 0
            r11 = 1
            r15 = r53
            r14 = r54
            r1 = r49
            r12 = r50
            r13 = r51
        L_0x04d5:
            r7 = 1
        L_0x04d6:
            int r0 = r15.mVerticalResolution
            r3 = 2
            if (r0 != r3) goto L_0x04dd
            r6 = 0
            goto L_0x04de
        L_0x04dd:
            r6 = r7
        L_0x04de:
            if (r6 == 0) goto L_0x05bb
            boolean r0 = r15.resolvedVertical
            if (r0 != 0) goto L_0x05bb
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r15.mListDimensionBehaviors
            r0 = r0[r11]
            r3 = r52
            if (r0 != r3) goto L_0x04f2
            boolean r0 = r15 instanceof androidx.constraintlayout.core.widgets.ConstraintWidgetContainer
            if (r0 == 0) goto L_0x04f2
            r9 = 1
            goto L_0x04f3
        L_0x04f2:
            r9 = 0
        L_0x04f3:
            if (r9 == 0) goto L_0x04f7
            r34 = 0
        L_0x04f7:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.mParent
            if (r0 == 0) goto L_0x0503
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.mBottom
            androidx.constraintlayout.core.SolverVariable r0 = r14.createObjectVariable(r0)
            r7 = r0
            goto L_0x0505
        L_0x0503:
            r7 = r40
        L_0x0505:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.mParent
            if (r0 == 0) goto L_0x0511
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.mTop
            androidx.constraintlayout.core.SolverVariable r0 = r14.createObjectVariable(r0)
            r6 = r0
            goto L_0x0513
        L_0x0511:
            r6 = r40
        L_0x0513:
            int r0 = r15.mBaselineDistance
            if (r0 > 0) goto L_0x051b
            int r0 = r15.mVisibility
            if (r0 != r2) goto L_0x0558
        L_0x051b:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r15.mBaseline
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r0.mTarget
            if (r3 == 0) goto L_0x0548
            int r0 = r53.getBaselineDistance()
            r14.addEquality(r1, r13, r0, r2)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r15.mBaseline
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.mTarget
            androidx.constraintlayout.core.SolverVariable r0 = r14.createObjectVariable(r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r15.mBaseline
            int r3 = r3.getMargin()
            r14.addEquality(r1, r0, r3, r2)
            if (r47 == 0) goto L_0x0545
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r15.mBottom
            androidx.constraintlayout.core.SolverVariable r0 = r14.createObjectVariable(r0)
            r1 = 5
            r14.addGreaterThan(r7, r0, r10, r1)
        L_0x0545:
            r27 = 0
            goto L_0x055a
        L_0x0548:
            int r3 = r15.mVisibility
            if (r3 != r2) goto L_0x0551
            int r0 = r0.getMargin()
            goto L_0x0555
        L_0x0551:
            int r0 = r53.getBaselineDistance()
        L_0x0555:
            r14.addEquality(r1, r13, r0, r2)
        L_0x0558:
            r27 = r38
        L_0x055a:
            boolean[] r0 = r15.isTerminalWidget
            boolean r5 = r0[r11]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r15.mListDimensionBehaviors
            r8 = r0[r11]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r15.mTop
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r15.mBottom
            int r1 = r15.f53mY
            int r2 = r15.mMinHeight
            int[] r10 = r15.mMaxDimension
            r16 = r10[r11]
            float r10 = r15.mVerticalBiasPercent
            r17 = 0
            r0 = r0[r17]
            r11 = r48
            if (r0 != r11) goto L_0x057b
            r18 = 1
            goto L_0x057d
        L_0x057b:
            r18 = 0
        L_0x057d:
            int r0 = r15.mMatchConstraintMinHeight
            r24 = r0
            int r0 = r15.mMatchConstraintMaxHeight
            r25 = r0
            float r0 = r15.mMatchConstraintPercentHeight
            r26 = r0
            r0 = r53
            r19 = r1
            r1 = r54
            r20 = r2
            r2 = 0
            r11 = r3
            r3 = r47
            r21 = r4
            r4 = r43
            r17 = r10
            r10 = r21
            r33 = r12
            r12 = r19
            r38 = r13
            r13 = r34
            r14 = r20
            r15 = r16
            r16 = r17
            r17 = r37
            r19 = r28
            r20 = r29
            r21 = r39
            r22 = r35
            r23 = r36
            r0.applyConstraints(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            goto L_0x05bf
        L_0x05bb:
            r33 = r12
            r38 = r13
        L_0x05bf:
            if (r32 == 0) goto L_0x05e7
            r6 = 8
            r7 = r53
            int r0 = r7.mResolvedDimensionRatioSide
            r1 = 1
            float r5 = r7.mResolvedDimensionRatio
            if (r0 != r1) goto L_0x05d7
            r0 = r54
            r1 = r33
            r2 = r38
            r3 = r30
            r4 = r31
            goto L_0x05e3
        L_0x05d7:
            r6 = 8
            r0 = r54
            r1 = r30
            r2 = r31
            r3 = r33
            r4 = r38
        L_0x05e3:
            r0.addRatio(r1, r2, r3, r4, r5, r6)
            goto L_0x05e9
        L_0x05e7:
            r7 = r53
        L_0x05e9:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r7.mCenter
            boolean r0 = r0.isConnected()
            if (r0 == 0) goto L_0x0611
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r7.mCenter
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.getTarget()
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r0.getOwner()
            float r1 = r7.mCircleConstraintAngle
            r2 = 1119092736(0x42b40000, float:90.0)
            float r1 = r1 + r2
            double r1 = (double) r1
            double r1 = java.lang.Math.toRadians(r1)
            float r1 = (float) r1
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r7.mCenter
            int r2 = r2.getMargin()
            r3 = r54
            r3.addCenterPoint(r7, r0, r1, r2)
        L_0x0611:
            r0 = 0
            r7.resolvedHorizontal = r0
            r7.resolvedVertical = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.ConstraintWidget.addToSolver(androidx.constraintlayout.core.LinearSystem, boolean):void");
    }

    public boolean allowedInBarrier() {
        return this.mVisibility != 8;
    }

    public void connect(ConstraintAnchor.Type type, ConstraintWidget constraintWidget, ConstraintAnchor.Type type2) {
        connect(type, constraintWidget, type2, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0159, code lost:
        if (r11 != null) goto L_0x018f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x018a, code lost:
        if (r11.isConnected() != false) goto L_0x018c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01b9, code lost:
        if (r11.isConnected() != false) goto L_0x018c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void connect(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type r9, androidx.constraintlayout.core.widgets.ConstraintWidget r10, androidx.constraintlayout.core.widgets.ConstraintAnchor.Type r11, int r12) {
        /*
            r8 = this;
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r0 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER
            r1 = 0
            if (r9 != r0) goto L_0x009d
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r9 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT
            if (r11 != r0) goto L_0x0074
            androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r8.getAnchor(r9)
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r12 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r8.getAnchor(r12)
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r3 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r8.getAnchor(r3)
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r5 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r8.getAnchor(r5)
            r7 = 1
            if (r11 == 0) goto L_0x0028
            boolean r11 = r11.isConnected()
            if (r11 != 0) goto L_0x0030
        L_0x0028:
            if (r2 == 0) goto L_0x0032
            boolean r11 = r2.isConnected()
            if (r11 == 0) goto L_0x0032
        L_0x0030:
            r9 = 0
            goto L_0x0039
        L_0x0032:
            r8.connect(r9, r10, r9, r1)
            r8.connect(r12, r10, r12, r1)
            r9 = 1
        L_0x0039:
            if (r4 == 0) goto L_0x0041
            boolean r11 = r4.isConnected()
            if (r11 != 0) goto L_0x0049
        L_0x0041:
            if (r6 == 0) goto L_0x004b
            boolean r11 = r6.isConnected()
            if (r11 == 0) goto L_0x004b
        L_0x0049:
            r7 = 0
            goto L_0x0051
        L_0x004b:
            r8.connect(r3, r10, r3, r1)
            r8.connect(r5, r10, r5, r1)
        L_0x0051:
            if (r9 == 0) goto L_0x005e
            if (r7 == 0) goto L_0x005e
            androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r8.getAnchor(r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r10.getAnchor(r0)
            goto L_0x00c1
        L_0x005e:
            if (r9 == 0) goto L_0x006f
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r9 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_X
        L_0x0062:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r8.getAnchor(r9)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r10.getAnchor(r9)
            r11.connect(r9, r1)
            goto L_0x01bf
        L_0x006f:
            if (r7 == 0) goto L_0x01bf
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r9 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_Y
            goto L_0x0062
        L_0x0074:
            if (r11 == r9) goto L_0x008c
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r12 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT
            if (r11 != r12) goto L_0x007b
            goto L_0x008c
        L_0x007b:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r9 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP
            if (r11 == r9) goto L_0x0083
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r12 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM
            if (r11 != r12) goto L_0x01bf
        L_0x0083:
            r8.connect(r9, r10, r11, r1)
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r9 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM
            r8.connect(r9, r10, r11, r1)
            goto L_0x0094
        L_0x008c:
            r8.connect(r9, r10, r11, r1)
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r9 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT
            r8.connect(r9, r10, r11, r1)     // Catch:{ all -> 0x01c0 }
        L_0x0094:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r8.getAnchor(r0)
        L_0x0098:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r10.getAnchor(r11)
            goto L_0x00c1
        L_0x009d:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r2 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_X
            if (r9 != r2) goto L_0x00c6
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r3 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT
            if (r11 == r3) goto L_0x00a9
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT
            if (r11 != r4) goto L_0x00c6
        L_0x00a9:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r8.getAnchor(r3)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r10.getAnchor(r11)
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r11 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT
            androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r8.getAnchor(r11)
            r9.connect(r10, r1)
            r11.connect(r10, r1)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r8.getAnchor(r2)
        L_0x00c1:
            r9.connect(r10, r1)
            goto L_0x01bf
        L_0x00c6:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r3 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_Y
            if (r9 != r3) goto L_0x00ef
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP
            if (r11 == r4) goto L_0x00d2
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r5 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM
            if (r11 != r5) goto L_0x00ef
        L_0x00d2:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r10.getAnchor(r11)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r8.getAnchor(r4)
            r10.connect(r9, r1)
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r10 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r8.getAnchor(r10)
            r10.connect(r9, r1)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r8.getAnchor(r3)
            r10.connect(r9, r1)
            goto L_0x01bf
        L_0x00ef:
            if (r9 != r2) goto L_0x0112
            if (r11 != r2) goto L_0x0112
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r9 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT
            androidx.constraintlayout.core.widgets.ConstraintAnchor r12 = r8.getAnchor(r9)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r10.getAnchor(r9)
            r12.connect(r9, r1)
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r9 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT
            androidx.constraintlayout.core.widgets.ConstraintAnchor r12 = r8.getAnchor(r9)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r10.getAnchor(r9)
            r12.connect(r9, r1)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r8.getAnchor(r2)
            goto L_0x0098
        L_0x0112:
            if (r9 != r3) goto L_0x0136
            if (r11 != r3) goto L_0x0136
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r9 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP
            androidx.constraintlayout.core.widgets.ConstraintAnchor r12 = r8.getAnchor(r9)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r10.getAnchor(r9)
            r12.connect(r9, r1)
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r9 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.core.widgets.ConstraintAnchor r12 = r8.getAnchor(r9)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r10.getAnchor(r9)
            r12.connect(r9, r1)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r8.getAnchor(r3)
            goto L_0x0098
        L_0x0136:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r8.getAnchor(r9)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r10.getAnchor(r11)
            boolean r11 = r1.isValidConnection(r10)
            if (r11 == 0) goto L_0x01bf
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r11 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BASELINE
            if (r9 != r11) goto L_0x015c
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r9 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP
            androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r8.getAnchor(r9)
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r11 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r8.getAnchor(r11)
            if (r9 == 0) goto L_0x0159
            r9.reset()
        L_0x0159:
            if (r11 == 0) goto L_0x01bc
            goto L_0x018f
        L_0x015c:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP
            if (r9 == r4) goto L_0x0193
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM
            if (r9 != r4) goto L_0x0165
            goto L_0x0193
        L_0x0165:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r11 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT
            if (r9 == r11) goto L_0x016d
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r11 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT
            if (r9 != r11) goto L_0x01bc
        L_0x016d:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r8.getAnchor(r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r11.getTarget()
            if (r0 == r10) goto L_0x017a
            r11.reset()
        L_0x017a:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r8.getAnchor(r9)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r9.getOpposite()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r8.getAnchor(r2)
            boolean r0 = r11.isConnected()
            if (r0 == 0) goto L_0x01bc
        L_0x018c:
            r9.reset()
        L_0x018f:
            r11.reset()
            goto L_0x01bc
        L_0x0193:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r8.getAnchor(r11)
            if (r11 == 0) goto L_0x019c
            r11.reset()
        L_0x019c:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r8.getAnchor(r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r11.getTarget()
            if (r0 == r10) goto L_0x01a9
            r11.reset()
        L_0x01a9:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r8.getAnchor(r9)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r9.getOpposite()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r8.getAnchor(r3)
            boolean r0 = r11.isConnected()
            if (r0 == 0) goto L_0x01bc
            goto L_0x018c
        L_0x01bc:
            r1.connect(r10, r12)
        L_0x01bf:
            return
        L_0x01c0:
            r9 = move-exception
            goto L_0x01c3
        L_0x01c2:
            throw r9
        L_0x01c3:
            goto L_0x01c2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.ConstraintWidget.connect(androidx.constraintlayout.core.widgets.ConstraintAnchor$Type, androidx.constraintlayout.core.widgets.ConstraintWidget, androidx.constraintlayout.core.widgets.ConstraintAnchor$Type, int):void");
    }

    public void connect(ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, int i) {
        if (constraintAnchor.getOwner() == this) {
            connect(constraintAnchor.getType(), constraintAnchor2.getOwner(), constraintAnchor2.getType(), i);
        }
    }

    public void connectCircularConstraint(ConstraintWidget constraintWidget, float f, int i) {
        ConstraintAnchor.Type type = ConstraintAnchor.Type.CENTER;
        immediateConnect(type, constraintWidget, type, i, 0);
        this.mCircleConstraintAngle = f;
    }

    public void copy(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> hashMap) {
        this.mHorizontalResolution = constraintWidget.mHorizontalResolution;
        this.mVerticalResolution = constraintWidget.mVerticalResolution;
        this.mMatchConstraintDefaultWidth = constraintWidget.mMatchConstraintDefaultWidth;
        this.mMatchConstraintDefaultHeight = constraintWidget.mMatchConstraintDefaultHeight;
        int[] iArr = this.mResolvedMatchConstraintDefault;
        int[] iArr2 = constraintWidget.mResolvedMatchConstraintDefault;
        iArr[0] = iArr2[0];
        iArr[1] = iArr2[1];
        this.mMatchConstraintMinWidth = constraintWidget.mMatchConstraintMinWidth;
        this.mMatchConstraintMaxWidth = constraintWidget.mMatchConstraintMaxWidth;
        this.mMatchConstraintMinHeight = constraintWidget.mMatchConstraintMinHeight;
        this.mMatchConstraintMaxHeight = constraintWidget.mMatchConstraintMaxHeight;
        this.mMatchConstraintPercentHeight = constraintWidget.mMatchConstraintPercentHeight;
        this.mIsWidthWrapContent = constraintWidget.mIsWidthWrapContent;
        this.mIsHeightWrapContent = constraintWidget.mIsHeightWrapContent;
        this.mResolvedDimensionRatioSide = constraintWidget.mResolvedDimensionRatioSide;
        this.mResolvedDimensionRatio = constraintWidget.mResolvedDimensionRatio;
        int[] iArr3 = constraintWidget.mMaxDimension;
        this.mMaxDimension = Arrays.copyOf(iArr3, iArr3.length);
        this.mCircleConstraintAngle = constraintWidget.mCircleConstraintAngle;
        this.hasBaseline = constraintWidget.hasBaseline;
        this.inPlaceholder = constraintWidget.inPlaceholder;
        this.mLeft.reset();
        this.mTop.reset();
        this.mRight.reset();
        this.mBottom.reset();
        this.mBaseline.reset();
        this.mCenterX.reset();
        this.mCenterY.reset();
        this.mCenter.reset();
        this.mListDimensionBehaviors = (DimensionBehaviour[]) Arrays.copyOf(this.mListDimensionBehaviors, 2);
        ConstraintWidget constraintWidget2 = null;
        this.mParent = this.mParent == null ? null : hashMap.get(constraintWidget.mParent);
        this.mWidth = constraintWidget.mWidth;
        this.mHeight = constraintWidget.mHeight;
        this.mDimensionRatio = constraintWidget.mDimensionRatio;
        this.mDimensionRatioSide = constraintWidget.mDimensionRatioSide;
        this.f52mX = constraintWidget.f52mX;
        this.f53mY = constraintWidget.f53mY;
        this.mRelX = constraintWidget.mRelX;
        this.mRelY = constraintWidget.mRelY;
        this.mOffsetX = constraintWidget.mOffsetX;
        this.mOffsetY = constraintWidget.mOffsetY;
        this.mBaselineDistance = constraintWidget.mBaselineDistance;
        this.mMinWidth = constraintWidget.mMinWidth;
        this.mMinHeight = constraintWidget.mMinHeight;
        this.mHorizontalBiasPercent = constraintWidget.mHorizontalBiasPercent;
        this.mVerticalBiasPercent = constraintWidget.mVerticalBiasPercent;
        this.mCompanionWidget = constraintWidget.mCompanionWidget;
        this.mContainerItemSkip = constraintWidget.mContainerItemSkip;
        this.mVisibility = constraintWidget.mVisibility;
        this.mAnimated = constraintWidget.mAnimated;
        this.mDebugName = constraintWidget.mDebugName;
        this.mType = constraintWidget.mType;
        this.mDistToTop = constraintWidget.mDistToTop;
        this.mDistToLeft = constraintWidget.mDistToLeft;
        this.mDistToRight = constraintWidget.mDistToRight;
        this.mDistToBottom = constraintWidget.mDistToBottom;
        this.mLeftHasCentered = constraintWidget.mLeftHasCentered;
        this.mRightHasCentered = constraintWidget.mRightHasCentered;
        this.mTopHasCentered = constraintWidget.mTopHasCentered;
        this.mBottomHasCentered = constraintWidget.mBottomHasCentered;
        this.mHorizontalWrapVisited = constraintWidget.mHorizontalWrapVisited;
        this.mVerticalWrapVisited = constraintWidget.mVerticalWrapVisited;
        this.mHorizontalChainStyle = constraintWidget.mHorizontalChainStyle;
        this.mVerticalChainStyle = constraintWidget.mVerticalChainStyle;
        this.mHorizontalChainFixedPosition = constraintWidget.mHorizontalChainFixedPosition;
        this.mVerticalChainFixedPosition = constraintWidget.mVerticalChainFixedPosition;
        float[] fArr = this.mWeight;
        float[] fArr2 = constraintWidget.mWeight;
        fArr[0] = fArr2[0];
        fArr[1] = fArr2[1];
        ConstraintWidget[] constraintWidgetArr = this.mListNextMatchConstraintsWidget;
        ConstraintWidget[] constraintWidgetArr2 = constraintWidget.mListNextMatchConstraintsWidget;
        constraintWidgetArr[0] = constraintWidgetArr2[0];
        constraintWidgetArr[1] = constraintWidgetArr2[1];
        ConstraintWidget[] constraintWidgetArr3 = this.mNextChainWidget;
        ConstraintWidget[] constraintWidgetArr4 = constraintWidget.mNextChainWidget;
        constraintWidgetArr3[0] = constraintWidgetArr4[0];
        constraintWidgetArr3[1] = constraintWidgetArr4[1];
        ConstraintWidget constraintWidget3 = constraintWidget.mHorizontalNextWidget;
        this.mHorizontalNextWidget = constraintWidget3 == null ? null : hashMap.get(constraintWidget3);
        ConstraintWidget constraintWidget4 = constraintWidget.mVerticalNextWidget;
        if (constraintWidget4 != null) {
            constraintWidget2 = hashMap.get(constraintWidget4);
        }
        this.mVerticalNextWidget = constraintWidget2;
    }

    public void createObjectVariables(LinearSystem linearSystem) {
        linearSystem.createObjectVariable(this.mLeft);
        linearSystem.createObjectVariable(this.mTop);
        linearSystem.createObjectVariable(this.mRight);
        linearSystem.createObjectVariable(this.mBottom);
        if (this.mBaselineDistance > 0) {
            linearSystem.createObjectVariable(this.mBaseline);
        }
    }

    public void ensureMeasureRequested() {
        this.mMeasureRequested = true;
    }

    public void ensureWidgetRuns() {
        if (this.horizontalRun == null) {
            this.horizontalRun = new HorizontalWidgetRun(this);
        }
        if (this.verticalRun == null) {
            this.verticalRun = new VerticalWidgetRun(this);
        }
    }

    public ConstraintAnchor getAnchor(ConstraintAnchor.Type type) {
        switch (C01871.f54x6930e354[type.ordinal()]) {
            case 1:
                return this.mLeft;
            case 2:
                return this.mTop;
            case 3:
                return this.mRight;
            case 4:
                return this.mBottom;
            case 5:
                return this.mBaseline;
            case 6:
                return this.mCenter;
            case 7:
                return this.mCenterX;
            case 8:
                return this.mCenterY;
            case 9:
                return null;
            default:
                throw new AssertionError(type.name());
        }
    }

    public ArrayList<ConstraintAnchor> getAnchors() {
        return this.mAnchors;
    }

    public int getBaselineDistance() {
        return this.mBaselineDistance;
    }

    public float getBiasPercent(int i) {
        if (i == 0) {
            return this.mHorizontalBiasPercent;
        }
        if (i == 1) {
            return this.mVerticalBiasPercent;
        }
        return -1.0f;
    }

    public int getBottom() {
        return getY() + this.mHeight;
    }

    public Object getCompanionWidget() {
        return this.mCompanionWidget;
    }

    public int getContainerItemSkip() {
        return this.mContainerItemSkip;
    }

    public String getDebugName() {
        return this.mDebugName;
    }

    public DimensionBehaviour getDimensionBehaviour(int i) {
        if (i == 0) {
            return getHorizontalDimensionBehaviour();
        }
        if (i == 1) {
            return getVerticalDimensionBehaviour();
        }
        return null;
    }

    public float getDimensionRatio() {
        return this.mDimensionRatio;
    }

    public int getDimensionRatioSide() {
        return this.mDimensionRatioSide;
    }

    public boolean getHasBaseline() {
        return this.hasBaseline;
    }

    public int getHeight() {
        if (this.mVisibility == 8) {
            return 0;
        }
        return this.mHeight;
    }

    public float getHorizontalBiasPercent() {
        return this.mHorizontalBiasPercent;
    }

    public ConstraintWidget getHorizontalChainControlWidget() {
        if (!isInHorizontalChain()) {
            return null;
        }
        ConstraintWidget constraintWidget = this;
        ConstraintWidget constraintWidget2 = null;
        while (constraintWidget2 == null && constraintWidget != null) {
            ConstraintAnchor anchor = constraintWidget.getAnchor(ConstraintAnchor.Type.LEFT);
            ConstraintAnchor target = anchor == null ? null : anchor.getTarget();
            ConstraintWidget owner = target == null ? null : target.getOwner();
            if (owner == getParent()) {
                return constraintWidget;
            }
            ConstraintAnchor target2 = owner == null ? null : owner.getAnchor(ConstraintAnchor.Type.RIGHT).getTarget();
            if (target2 == null || target2.getOwner() == constraintWidget) {
                constraintWidget = owner;
            } else {
                constraintWidget2 = constraintWidget;
            }
        }
        return constraintWidget2;
    }

    public int getHorizontalChainStyle() {
        return this.mHorizontalChainStyle;
    }

    public DimensionBehaviour getHorizontalDimensionBehaviour() {
        return this.mListDimensionBehaviors[0];
    }

    public int getHorizontalMargin() {
        ConstraintAnchor constraintAnchor = this.mLeft;
        int i = 0;
        if (constraintAnchor != null) {
            i = 0 + constraintAnchor.mMargin;
        }
        ConstraintAnchor constraintAnchor2 = this.mRight;
        return constraintAnchor2 != null ? i + constraintAnchor2.mMargin : i;
    }

    public int getLastHorizontalMeasureSpec() {
        return this.mLastHorizontalMeasureSpec;
    }

    public int getLastVerticalMeasureSpec() {
        return this.mLastVerticalMeasureSpec;
    }

    public int getLeft() {
        return getX();
    }

    public int getLength(int i) {
        if (i == 0) {
            return getWidth();
        }
        if (i == 1) {
            return getHeight();
        }
        return 0;
    }

    public int getMaxHeight() {
        return this.mMaxDimension[1];
    }

    public int getMaxWidth() {
        return this.mMaxDimension[0];
    }

    public int getMinHeight() {
        return this.mMinHeight;
    }

    public int getMinWidth() {
        return this.mMinWidth;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        r3 = r2.mBottom;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.constraintlayout.core.widgets.ConstraintWidget getNextChainMember(int r3) {
        /*
            r2 = this;
            if (r3 != 0) goto L_0x000f
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r2.mRight
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r3.mTarget
            if (r0 == 0) goto L_0x001f
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r0.mTarget
            if (r1 != r3) goto L_0x001f
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r0.mOwner
            return r3
        L_0x000f:
            r0 = 1
            if (r3 != r0) goto L_0x001f
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r2.mBottom
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r3.mTarget
            if (r0 == 0) goto L_0x001f
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r0.mTarget
            if (r1 != r3) goto L_0x001f
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r0.mOwner
            return r3
        L_0x001f:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.ConstraintWidget.getNextChainMember(int):androidx.constraintlayout.core.widgets.ConstraintWidget");
    }

    public int getOptimizerWrapHeight() {
        int i;
        int i2 = this.mHeight;
        if (this.mListDimensionBehaviors[1] != DimensionBehaviour.MATCH_CONSTRAINT) {
            return i2;
        }
        if (this.mMatchConstraintDefaultHeight == 1) {
            i = Math.max(this.mMatchConstraintMinHeight, i2);
        } else {
            i = this.mMatchConstraintMinHeight;
            if (i > 0) {
                this.mHeight = i;
            } else {
                i = 0;
            }
        }
        int i3 = this.mMatchConstraintMaxHeight;
        return (i3 <= 0 || i3 >= i) ? i : i3;
    }

    public int getOptimizerWrapWidth() {
        int i;
        int i2 = this.mWidth;
        if (this.mListDimensionBehaviors[0] != DimensionBehaviour.MATCH_CONSTRAINT) {
            return i2;
        }
        if (this.mMatchConstraintDefaultWidth == 1) {
            i = Math.max(this.mMatchConstraintMinWidth, i2);
        } else {
            i = this.mMatchConstraintMinWidth;
            if (i > 0) {
                this.mWidth = i;
            } else {
                i = 0;
            }
        }
        int i3 = this.mMatchConstraintMaxWidth;
        return (i3 <= 0 || i3 >= i) ? i : i3;
    }

    public ConstraintWidget getParent() {
        return this.mParent;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        r3 = r2.mTop;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.constraintlayout.core.widgets.ConstraintWidget getPreviousChainMember(int r3) {
        /*
            r2 = this;
            if (r3 != 0) goto L_0x000f
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r2.mLeft
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r3.mTarget
            if (r0 == 0) goto L_0x001f
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r0.mTarget
            if (r1 != r3) goto L_0x001f
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r0.mOwner
            return r3
        L_0x000f:
            r0 = 1
            if (r3 != r0) goto L_0x001f
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r2.mTop
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r3.mTarget
            if (r0 == 0) goto L_0x001f
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r0.mTarget
            if (r1 != r3) goto L_0x001f
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r0.mOwner
            return r3
        L_0x001f:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.ConstraintWidget.getPreviousChainMember(int):androidx.constraintlayout.core.widgets.ConstraintWidget");
    }

    /* access modifiers changed from: package-private */
    public int getRelativePositioning(int i) {
        if (i == 0) {
            return this.mRelX;
        }
        if (i == 1) {
            return this.mRelY;
        }
        return 0;
    }

    public int getRight() {
        return getX() + this.mWidth;
    }

    /* access modifiers changed from: protected */
    public int getRootX() {
        return this.f52mX + this.mOffsetX;
    }

    /* access modifiers changed from: protected */
    public int getRootY() {
        return this.f53mY + this.mOffsetY;
    }

    public WidgetRun getRun(int i) {
        if (i == 0) {
            return this.horizontalRun;
        }
        if (i == 1) {
            return this.verticalRun;
        }
        return null;
    }

    public void getSceneString(StringBuilder sb) {
        sb.append("  " + this.stringId + ":{\n");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("    actualWidth:");
        sb2.append(this.mWidth);
        sb.append(sb2.toString());
        sb.append(IOUtils.LINE_SEPARATOR_UNIX);
        sb.append("    actualHeight:" + this.mHeight);
        sb.append(IOUtils.LINE_SEPARATOR_UNIX);
        sb.append("    actualLeft:" + this.f52mX);
        sb.append(IOUtils.LINE_SEPARATOR_UNIX);
        sb.append("    actualTop:" + this.f53mY);
        sb.append(IOUtils.LINE_SEPARATOR_UNIX);
        getSceneString(sb, "left", this.mLeft);
        getSceneString(sb, "top", this.mTop);
        getSceneString(sb, "right", this.mRight);
        getSceneString(sb, "bottom", this.mBottom);
        getSceneString(sb, "baseline", this.mBaseline);
        getSceneString(sb, "centerX", this.mCenterX);
        getSceneString(sb, "centerY", this.mCenterY);
        getSceneString(sb, "    width", this.mWidth, this.mMinWidth, this.mMaxDimension[0], this.mWidthOverride, this.mMatchConstraintMinWidth, this.mMatchConstraintDefaultWidth, this.mMatchConstraintPercentWidth, this.mWeight[0]);
        getSceneString(sb, "    height", this.mHeight, this.mMinHeight, this.mMaxDimension[1], this.mHeightOverride, this.mMatchConstraintMinHeight, this.mMatchConstraintDefaultHeight, this.mMatchConstraintPercentHeight, this.mWeight[1]);
        serializeDimensionRatio(sb, "    dimensionRatio", this.mDimensionRatio, this.mDimensionRatioSide);
        serializeAttribute(sb, "    horizontalBias", this.mHorizontalBiasPercent, DEFAULT_BIAS);
        serializeAttribute(sb, "    verticalBias", this.mVerticalBiasPercent, DEFAULT_BIAS);
        serializeAttribute(sb, "    horizontalChainStyle", this.mHorizontalChainStyle, 0);
        serializeAttribute(sb, "    verticalChainStyle", this.mVerticalChainStyle, 0);
        sb.append("  }");
    }

    public int getTop() {
        return getY();
    }

    public String getType() {
        return this.mType;
    }

    public float getVerticalBiasPercent() {
        return this.mVerticalBiasPercent;
    }

    public ConstraintWidget getVerticalChainControlWidget() {
        if (!isInVerticalChain()) {
            return null;
        }
        ConstraintWidget constraintWidget = this;
        ConstraintWidget constraintWidget2 = null;
        while (constraintWidget2 == null && constraintWidget != null) {
            ConstraintAnchor anchor = constraintWidget.getAnchor(ConstraintAnchor.Type.TOP);
            ConstraintAnchor target = anchor == null ? null : anchor.getTarget();
            ConstraintWidget owner = target == null ? null : target.getOwner();
            if (owner == getParent()) {
                return constraintWidget;
            }
            ConstraintAnchor target2 = owner == null ? null : owner.getAnchor(ConstraintAnchor.Type.BOTTOM).getTarget();
            if (target2 == null || target2.getOwner() == constraintWidget) {
                constraintWidget = owner;
            } else {
                constraintWidget2 = constraintWidget;
            }
        }
        return constraintWidget2;
    }

    public int getVerticalChainStyle() {
        return this.mVerticalChainStyle;
    }

    public DimensionBehaviour getVerticalDimensionBehaviour() {
        return this.mListDimensionBehaviors[1];
    }

    public int getVerticalMargin() {
        int i = 0;
        if (this.mLeft != null) {
            i = 0 + this.mTop.mMargin;
        }
        return this.mRight != null ? i + this.mBottom.mMargin : i;
    }

    public int getVisibility() {
        return this.mVisibility;
    }

    public int getWidth() {
        if (this.mVisibility == 8) {
            return 0;
        }
        return this.mWidth;
    }

    public int getWrapBehaviorInParent() {
        return this.mWrapBehaviorInParent;
    }

    public int getX() {
        ConstraintWidget constraintWidget = this.mParent;
        return (constraintWidget == null || !(constraintWidget instanceof ConstraintWidgetContainer)) ? this.f52mX : ((ConstraintWidgetContainer) constraintWidget).mPaddingLeft + this.f52mX;
    }

    public int getY() {
        ConstraintWidget constraintWidget = this.mParent;
        return (constraintWidget == null || !(constraintWidget instanceof ConstraintWidgetContainer)) ? this.f53mY : ((ConstraintWidgetContainer) constraintWidget).mPaddingTop + this.f53mY;
    }

    public boolean hasBaseline() {
        return this.hasBaseline;
    }

    public boolean hasDanglingDimension(int i) {
        if (i == 0) {
            return (this.mLeft.mTarget != null ? 1 : 0) + (this.mRight.mTarget != null ? 1 : 0) < 2;
        }
        return ((this.mTop.mTarget != null ? 1 : 0) + (this.mBottom.mTarget != null ? 1 : 0)) + (this.mBaseline.mTarget != null ? 1 : 0) < 2;
    }

    public boolean hasDependencies() {
        int size = this.mAnchors.size();
        for (int i = 0; i < size; i++) {
            if (this.mAnchors.get(i).hasDependents()) {
                return true;
            }
        }
        return false;
    }

    public boolean hasDimensionOverride() {
        return (this.mWidthOverride == -1 && this.mHeightOverride == -1) ? false : true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        r5 = r4.mRight.mTarget;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean hasResolvedTargets(int r5, int r6) {
        /*
            r4 = this;
            r0 = 1
            r1 = 0
            if (r5 != 0) goto L_0x0040
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r4.mLeft
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r5.mTarget
            if (r5 == 0) goto L_0x007c
            boolean r5 = r5.hasFinalValue()
            if (r5 == 0) goto L_0x007c
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r4.mRight
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r5.mTarget
            if (r5 == 0) goto L_0x007c
            boolean r5 = r5.hasFinalValue()
            if (r5 == 0) goto L_0x007c
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r4.mRight
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r5.mTarget
            int r5 = r5.getFinalValue()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r4.mRight
            int r2 = r2.getMargin()
            int r5 = r5 - r2
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r4.mLeft
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.mTarget
            int r2 = r2.getFinalValue()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r4.mLeft
            int r3 = r3.getMargin()
            int r2 = r2 + r3
            int r5 = r5 - r2
            if (r5 < r6) goto L_0x003e
            goto L_0x003f
        L_0x003e:
            r0 = 0
        L_0x003f:
            return r0
        L_0x0040:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r4.mTop
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r5.mTarget
            if (r5 == 0) goto L_0x007c
            boolean r5 = r5.hasFinalValue()
            if (r5 == 0) goto L_0x007c
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r4.mBottom
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r5.mTarget
            if (r5 == 0) goto L_0x007c
            boolean r5 = r5.hasFinalValue()
            if (r5 == 0) goto L_0x007c
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r4.mBottom
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r5.mTarget
            int r5 = r5.getFinalValue()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r4.mBottom
            int r2 = r2.getMargin()
            int r5 = r5 - r2
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r4.mTop
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.mTarget
            int r2 = r2.getFinalValue()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r4.mTop
            int r3 = r3.getMargin()
            int r2 = r2 + r3
            int r5 = r5 - r2
            if (r5 < r6) goto L_0x007a
            goto L_0x007b
        L_0x007a:
            r0 = 0
        L_0x007b:
            return r0
        L_0x007c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.ConstraintWidget.hasResolvedTargets(int, int):boolean");
    }

    public void immediateConnect(ConstraintAnchor.Type type, ConstraintWidget constraintWidget, ConstraintAnchor.Type type2, int i, int i2) {
        getAnchor(type).connect(constraintWidget.getAnchor(type2), i, i2, true);
    }

    public boolean isAnimated() {
        return this.mAnimated;
    }

    public boolean isHeightWrapContent() {
        return this.mIsHeightWrapContent;
    }

    public boolean isHorizontalSolvingPassDone() {
        return this.horizontalSolvingPass;
    }

    public boolean isInBarrier(int i) {
        return this.mIsInBarrier[i];
    }

    public boolean isInHorizontalChain() {
        ConstraintAnchor constraintAnchor = this.mLeft;
        ConstraintAnchor constraintAnchor2 = constraintAnchor.mTarget;
        if (constraintAnchor2 != null && constraintAnchor2.mTarget == constraintAnchor) {
            return true;
        }
        ConstraintAnchor constraintAnchor3 = this.mRight;
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.mTarget;
        return constraintAnchor4 != null && constraintAnchor4.mTarget == constraintAnchor3;
    }

    public boolean isInPlaceholder() {
        return this.inPlaceholder;
    }

    public boolean isInVerticalChain() {
        ConstraintAnchor constraintAnchor = this.mTop;
        ConstraintAnchor constraintAnchor2 = constraintAnchor.mTarget;
        if (constraintAnchor2 != null && constraintAnchor2.mTarget == constraintAnchor) {
            return true;
        }
        ConstraintAnchor constraintAnchor3 = this.mBottom;
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.mTarget;
        return constraintAnchor4 != null && constraintAnchor4.mTarget == constraintAnchor3;
    }

    public boolean isInVirtualLayout() {
        return this.mInVirtualLayout;
    }

    public boolean isMeasureRequested() {
        return this.mMeasureRequested && this.mVisibility != 8;
    }

    public boolean isResolvedHorizontally() {
        return this.resolvedHorizontal || (this.mLeft.hasFinalValue() && this.mRight.hasFinalValue());
    }

    public boolean isResolvedVertically() {
        return this.resolvedVertical || (this.mTop.hasFinalValue() && this.mBottom.hasFinalValue());
    }

    public boolean isRoot() {
        return this.mParent == null;
    }

    public boolean isSpreadHeight() {
        return this.mMatchConstraintDefaultHeight == 0 && this.mDimensionRatio == 0.0f && this.mMatchConstraintMinHeight == 0 && this.mMatchConstraintMaxHeight == 0 && this.mListDimensionBehaviors[1] == DimensionBehaviour.MATCH_CONSTRAINT;
    }

    public boolean isSpreadWidth() {
        return this.mMatchConstraintDefaultWidth == 0 && this.mDimensionRatio == 0.0f && this.mMatchConstraintMinWidth == 0 && this.mMatchConstraintMaxWidth == 0 && this.mListDimensionBehaviors[0] == DimensionBehaviour.MATCH_CONSTRAINT;
    }

    public boolean isVerticalSolvingPassDone() {
        return this.verticalSolvingPass;
    }

    public boolean isWidthWrapContent() {
        return this.mIsWidthWrapContent;
    }

    public void markHorizontalSolvingPassDone() {
        this.horizontalSolvingPass = true;
    }

    public void markVerticalSolvingPassDone() {
        this.verticalSolvingPass = true;
    }

    public boolean oppositeDimensionDependsOn(int i) {
        char c = i == 0 ? (char) 1 : 0;
        DimensionBehaviour[] dimensionBehaviourArr = this.mListDimensionBehaviors;
        DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[i];
        DimensionBehaviour dimensionBehaviour2 = dimensionBehaviourArr[c];
        DimensionBehaviour dimensionBehaviour3 = DimensionBehaviour.MATCH_CONSTRAINT;
        return dimensionBehaviour == dimensionBehaviour3 && dimensionBehaviour2 == dimensionBehaviour3;
    }

    public boolean oppositeDimensionsTied() {
        DimensionBehaviour[] dimensionBehaviourArr = this.mListDimensionBehaviors;
        DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
        DimensionBehaviour dimensionBehaviour2 = DimensionBehaviour.MATCH_CONSTRAINT;
        return dimensionBehaviour == dimensionBehaviour2 && dimensionBehaviourArr[1] == dimensionBehaviour2;
    }

    public void reset() {
        this.mLeft.reset();
        this.mTop.reset();
        this.mRight.reset();
        this.mBottom.reset();
        this.mBaseline.reset();
        this.mCenterX.reset();
        this.mCenterY.reset();
        this.mCenter.reset();
        this.mParent = null;
        this.mCircleConstraintAngle = 0.0f;
        this.mWidth = 0;
        this.mHeight = 0;
        this.mDimensionRatio = 0.0f;
        this.mDimensionRatioSide = -1;
        this.f52mX = 0;
        this.f53mY = 0;
        this.mOffsetX = 0;
        this.mOffsetY = 0;
        this.mBaselineDistance = 0;
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        float f = DEFAULT_BIAS;
        this.mHorizontalBiasPercent = f;
        this.mVerticalBiasPercent = f;
        DimensionBehaviour[] dimensionBehaviourArr = this.mListDimensionBehaviors;
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.FIXED;
        dimensionBehaviourArr[0] = dimensionBehaviour;
        dimensionBehaviourArr[1] = dimensionBehaviour;
        this.mCompanionWidget = null;
        this.mContainerItemSkip = 0;
        this.mVisibility = 0;
        this.mType = null;
        this.mHorizontalWrapVisited = false;
        this.mVerticalWrapVisited = false;
        this.mHorizontalChainStyle = 0;
        this.mVerticalChainStyle = 0;
        this.mHorizontalChainFixedPosition = false;
        this.mVerticalChainFixedPosition = false;
        float[] fArr = this.mWeight;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.mHorizontalResolution = -1;
        this.mVerticalResolution = -1;
        int[] iArr = this.mMaxDimension;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.mMatchConstraintDefaultWidth = 0;
        this.mMatchConstraintDefaultHeight = 0;
        this.mMatchConstraintPercentWidth = 1.0f;
        this.mMatchConstraintPercentHeight = 1.0f;
        this.mMatchConstraintMaxWidth = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.mMatchConstraintMaxHeight = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.mMatchConstraintMinWidth = 0;
        this.mMatchConstraintMinHeight = 0;
        this.mResolvedHasRatio = false;
        this.mResolvedDimensionRatioSide = -1;
        this.mResolvedDimensionRatio = 1.0f;
        this.mGroupsToSolver = false;
        boolean[] zArr = this.isTerminalWidget;
        zArr[0] = true;
        zArr[1] = true;
        this.mInVirtualLayout = false;
        boolean[] zArr2 = this.mIsInBarrier;
        zArr2[0] = false;
        zArr2[1] = false;
        this.mMeasureRequested = true;
        int[] iArr2 = this.mResolvedMatchConstraintDefault;
        iArr2[0] = 0;
        iArr2[1] = 0;
        this.mWidthOverride = -1;
        this.mHeightOverride = -1;
    }

    public void resetAllConstraints() {
        resetAnchors();
        setVerticalBiasPercent(DEFAULT_BIAS);
        setHorizontalBiasPercent(DEFAULT_BIAS);
    }

    public void resetAnchor(ConstraintAnchor constraintAnchor) {
        if (getParent() == null || !(getParent() instanceof ConstraintWidgetContainer) || !((ConstraintWidgetContainer) getParent()).handlesInternalConstraints()) {
            ConstraintAnchor anchor = getAnchor(ConstraintAnchor.Type.LEFT);
            ConstraintAnchor anchor2 = getAnchor(ConstraintAnchor.Type.RIGHT);
            ConstraintAnchor anchor3 = getAnchor(ConstraintAnchor.Type.TOP);
            ConstraintAnchor anchor4 = getAnchor(ConstraintAnchor.Type.BOTTOM);
            ConstraintAnchor anchor5 = getAnchor(ConstraintAnchor.Type.CENTER);
            ConstraintAnchor anchor6 = getAnchor(ConstraintAnchor.Type.CENTER_X);
            ConstraintAnchor anchor7 = getAnchor(ConstraintAnchor.Type.CENTER_Y);
            if (constraintAnchor == anchor5) {
                if (anchor.isConnected() && anchor2.isConnected() && anchor.getTarget() == anchor2.getTarget()) {
                    anchor.reset();
                    anchor2.reset();
                }
                if (anchor3.isConnected() && anchor4.isConnected() && anchor3.getTarget() == anchor4.getTarget()) {
                    anchor3.reset();
                    anchor4.reset();
                }
                this.mHorizontalBiasPercent = 0.5f;
            } else {
                if (constraintAnchor == anchor6) {
                    if (anchor.isConnected() && anchor2.isConnected() && anchor.getTarget().getOwner() == anchor2.getTarget().getOwner()) {
                        anchor.reset();
                        anchor2.reset();
                    }
                    this.mHorizontalBiasPercent = 0.5f;
                } else if (constraintAnchor == anchor7) {
                    if (anchor3.isConnected() && anchor4.isConnected() && anchor3.getTarget().getOwner() == anchor4.getTarget().getOwner()) {
                        anchor3.reset();
                        anchor4.reset();
                    }
                } else if (constraintAnchor == anchor || constraintAnchor == anchor2 ? !(!anchor.isConnected() || anchor.getTarget() != anchor2.getTarget()) : (constraintAnchor == anchor3 || constraintAnchor == anchor4) && anchor3.isConnected() && anchor3.getTarget() == anchor4.getTarget()) {
                    anchor5.reset();
                }
                constraintAnchor.reset();
            }
            this.mVerticalBiasPercent = 0.5f;
            constraintAnchor.reset();
        }
    }

    public void resetAnchors() {
        ConstraintWidget parent = getParent();
        if (parent == null || !(parent instanceof ConstraintWidgetContainer) || !((ConstraintWidgetContainer) getParent()).handlesInternalConstraints()) {
            int size = this.mAnchors.size();
            for (int i = 0; i < size; i++) {
                this.mAnchors.get(i).reset();
            }
        }
    }

    public void resetFinalResolution() {
        this.resolvedHorizontal = false;
        this.resolvedVertical = false;
        this.horizontalSolvingPass = false;
        this.verticalSolvingPass = false;
        int size = this.mAnchors.size();
        for (int i = 0; i < size; i++) {
            this.mAnchors.get(i).resetFinalResolution();
        }
    }

    public void resetSolverVariables(Cache cache) {
        this.mLeft.resetSolverVariable(cache);
        this.mTop.resetSolverVariable(cache);
        this.mRight.resetSolverVariable(cache);
        this.mBottom.resetSolverVariable(cache);
        this.mBaseline.resetSolverVariable(cache);
        this.mCenter.resetSolverVariable(cache);
        this.mCenterX.resetSolverVariable(cache);
        this.mCenterY.resetSolverVariable(cache);
    }

    public void resetSolvingPassFlag() {
        this.horizontalSolvingPass = false;
        this.verticalSolvingPass = false;
    }

    public StringBuilder serialize(StringBuilder sb) {
        sb.append("{\n");
        serializeAnchor(sb, "left", this.mLeft);
        serializeAnchor(sb, "top", this.mTop);
        serializeAnchor(sb, "right", this.mRight);
        serializeAnchor(sb, "bottom", this.mBottom);
        serializeAnchor(sb, "baseline", this.mBaseline);
        serializeAnchor(sb, "centerX", this.mCenterX);
        serializeAnchor(sb, "centerY", this.mCenterY);
        serializeCircle(sb, this.mCenter, this.mCircleConstraintAngle);
        serializeSize(sb, "width", this.mWidth, this.mMinWidth, this.mMaxDimension[0], this.mWidthOverride, this.mMatchConstraintMinWidth, this.mMatchConstraintDefaultWidth, this.mMatchConstraintPercentWidth, this.mWeight[0]);
        serializeSize(sb, "height", this.mHeight, this.mMinHeight, this.mMaxDimension[1], this.mHeightOverride, this.mMatchConstraintMinHeight, this.mMatchConstraintDefaultHeight, this.mMatchConstraintPercentHeight, this.mWeight[1]);
        serializeDimensionRatio(sb, "dimensionRatio", this.mDimensionRatio, this.mDimensionRatioSide);
        serializeAttribute(sb, "horizontalBias", this.mHorizontalBiasPercent, DEFAULT_BIAS);
        serializeAttribute(sb, "verticalBias", this.mVerticalBiasPercent, DEFAULT_BIAS);
        sb.append("}\n");
        return sb;
    }

    public void setAnimated(boolean z) {
        this.mAnimated = z;
    }

    public void setBaselineDistance(int i) {
        this.mBaselineDistance = i;
        this.hasBaseline = i > 0;
    }

    public void setCompanionWidget(Object obj) {
        this.mCompanionWidget = obj;
    }

    public void setContainerItemSkip(int i) {
        if (i < 0) {
            i = 0;
        }
        this.mContainerItemSkip = i;
    }

    public void setDebugName(String str) {
        this.mDebugName = str;
    }

    public void setDebugSolverName(LinearSystem linearSystem, String str) {
        this.mDebugName = str;
        SolverVariable createObjectVariable = linearSystem.createObjectVariable(this.mLeft);
        SolverVariable createObjectVariable2 = linearSystem.createObjectVariable(this.mTop);
        SolverVariable createObjectVariable3 = linearSystem.createObjectVariable(this.mRight);
        SolverVariable createObjectVariable4 = linearSystem.createObjectVariable(this.mBottom);
        createObjectVariable.setName(str + ".left");
        createObjectVariable2.setName(str + ".top");
        createObjectVariable3.setName(str + ".right");
        createObjectVariable4.setName(str + ".bottom");
        SolverVariable createObjectVariable5 = linearSystem.createObjectVariable(this.mBaseline);
        createObjectVariable5.setName(str + ".baseline");
    }

    public void setDimension(int i, int i2) {
        this.mWidth = i;
        int i3 = this.mMinWidth;
        if (i < i3) {
            this.mWidth = i3;
        }
        this.mHeight = i2;
        int i4 = this.mMinHeight;
        if (i2 < i4) {
            this.mHeight = i4;
        }
    }

    public void setDimensionRatio(float f, int i) {
        this.mDimensionRatio = f;
        this.mDimensionRatioSide = i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setDimensionRatio(java.lang.String r9) {
        /*
            r8 = this;
            r0 = 0
            if (r9 == 0) goto L_0x008e
            int r1 = r9.length()
            if (r1 != 0) goto L_0x000b
            goto L_0x008e
        L_0x000b:
            r1 = -1
            int r2 = r9.length()
            r3 = 44
            int r3 = r9.indexOf(r3)
            r4 = 0
            r5 = 1
            if (r3 <= 0) goto L_0x0037
            int r6 = r2 + -1
            if (r3 >= r6) goto L_0x0037
            java.lang.String r6 = r9.substring(r4, r3)
            java.lang.String r7 = "W"
            boolean r7 = r6.equalsIgnoreCase(r7)
            if (r7 == 0) goto L_0x002c
            r1 = 0
            goto L_0x0035
        L_0x002c:
            java.lang.String r4 = "H"
            boolean r4 = r6.equalsIgnoreCase(r4)
            if (r4 == 0) goto L_0x0035
            r1 = 1
        L_0x0035:
            int r4 = r3 + 1
        L_0x0037:
            r3 = 58
            int r3 = r9.indexOf(r3)
            if (r3 < 0) goto L_0x0075
            int r2 = r2 - r5
            if (r3 >= r2) goto L_0x0075
            java.lang.String r2 = r9.substring(r4, r3)
            int r3 = r3 + r5
            java.lang.String r9 = r9.substring(r3)
            int r3 = r2.length()
            if (r3 <= 0) goto L_0x0084
            int r3 = r9.length()
            if (r3 <= 0) goto L_0x0084
            float r2 = java.lang.Float.parseFloat(r2)     // Catch:{ NumberFormatException -> 0x0084 }
            float r9 = java.lang.Float.parseFloat(r9)     // Catch:{ NumberFormatException -> 0x0084 }
            int r3 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r3 <= 0) goto L_0x0084
            int r3 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r3 <= 0) goto L_0x0084
            if (r1 != r5) goto L_0x006f
            float r9 = r9 / r2
            float r9 = java.lang.Math.abs(r9)     // Catch:{ NumberFormatException -> 0x0084 }
            goto L_0x0085
        L_0x006f:
            float r2 = r2 / r9
            float r9 = java.lang.Math.abs(r2)     // Catch:{ NumberFormatException -> 0x0084 }
            goto L_0x0085
        L_0x0075:
            java.lang.String r9 = r9.substring(r4)
            int r2 = r9.length()
            if (r2 <= 0) goto L_0x0084
            float r9 = java.lang.Float.parseFloat(r9)     // Catch:{ NumberFormatException -> 0x0084 }
            goto L_0x0085
        L_0x0084:
            r9 = 0
        L_0x0085:
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x008d
            r8.mDimensionRatio = r9
            r8.mDimensionRatioSide = r1
        L_0x008d:
            return
        L_0x008e:
            r8.mDimensionRatio = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.ConstraintWidget.setDimensionRatio(java.lang.String):void");
    }

    public void setFinalBaseline(int i) {
        if (this.hasBaseline) {
            int i2 = i - this.mBaselineDistance;
            int i3 = this.mHeight + i2;
            this.f53mY = i2;
            this.mTop.setFinalValue(i2);
            this.mBottom.setFinalValue(i3);
            this.mBaseline.setFinalValue(i);
            this.resolvedVertical = true;
        }
    }

    public void setFinalFrame(int i, int i2, int i3, int i4, int i5, int i6) {
        setFrame(i, i2, i3, i4);
        setBaselineDistance(i5);
        if (i6 == 0) {
            this.resolvedHorizontal = true;
        } else {
            if (i6 == 1) {
                this.resolvedHorizontal = false;
            } else if (i6 == 2) {
                this.resolvedHorizontal = true;
            } else {
                this.resolvedHorizontal = false;
            }
            this.resolvedVertical = true;
            return;
        }
        this.resolvedVertical = false;
    }

    public void setFinalHorizontal(int i, int i2) {
        if (!this.resolvedHorizontal) {
            this.mLeft.setFinalValue(i);
            this.mRight.setFinalValue(i2);
            this.f52mX = i;
            this.mWidth = i2 - i;
            this.resolvedHorizontal = true;
        }
    }

    public void setFinalLeft(int i) {
        this.mLeft.setFinalValue(i);
        this.f52mX = i;
    }

    public void setFinalTop(int i) {
        this.mTop.setFinalValue(i);
        this.f53mY = i;
    }

    public void setFinalVertical(int i, int i2) {
        if (!this.resolvedVertical) {
            this.mTop.setFinalValue(i);
            this.mBottom.setFinalValue(i2);
            this.f53mY = i;
            this.mHeight = i2 - i;
            if (this.hasBaseline) {
                this.mBaseline.setFinalValue(i + this.mBaselineDistance);
            }
            this.resolvedVertical = true;
        }
    }

    public void setFrame(int i, int i2, int i3) {
        if (i3 == 0) {
            setHorizontalDimension(i, i2);
        } else if (i3 == 1) {
            setVerticalDimension(i, i2);
        }
    }

    public void setFrame(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7 = i3 - i;
        int i8 = i4 - i2;
        this.f52mX = i;
        this.f53mY = i2;
        if (this.mVisibility == 8) {
            this.mWidth = 0;
            this.mHeight = 0;
            return;
        }
        DimensionBehaviour[] dimensionBehaviourArr = this.mListDimensionBehaviors;
        DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
        DimensionBehaviour dimensionBehaviour2 = DimensionBehaviour.FIXED;
        if (dimensionBehaviour == dimensionBehaviour2 && i7 < (i6 = this.mWidth)) {
            i7 = i6;
        }
        if (dimensionBehaviourArr[1] == dimensionBehaviour2 && i8 < (i5 = this.mHeight)) {
            i8 = i5;
        }
        this.mWidth = i7;
        this.mHeight = i8;
        int i9 = this.mMinHeight;
        if (i8 < i9) {
            this.mHeight = i9;
        }
        int i10 = this.mMinWidth;
        if (i7 < i10) {
            this.mWidth = i10;
        }
        int i11 = this.mMatchConstraintMaxWidth;
        if (i11 > 0 && dimensionBehaviourArr[0] == DimensionBehaviour.MATCH_CONSTRAINT) {
            this.mWidth = Math.min(this.mWidth, i11);
        }
        int i12 = this.mMatchConstraintMaxHeight;
        if (i12 > 0 && this.mListDimensionBehaviors[1] == DimensionBehaviour.MATCH_CONSTRAINT) {
            this.mHeight = Math.min(this.mHeight, i12);
        }
        int i13 = this.mWidth;
        if (i7 != i13) {
            this.mWidthOverride = i13;
        }
        int i14 = this.mHeight;
        if (i8 != i14) {
            this.mHeightOverride = i14;
        }
    }

    public void setGoneMargin(ConstraintAnchor.Type type, int i) {
        ConstraintAnchor constraintAnchor;
        int i2 = C01871.f54x6930e354[type.ordinal()];
        if (i2 == 1) {
            constraintAnchor = this.mLeft;
        } else if (i2 == 2) {
            constraintAnchor = this.mTop;
        } else if (i2 == 3) {
            constraintAnchor = this.mRight;
        } else if (i2 == 4) {
            constraintAnchor = this.mBottom;
        } else if (i2 == 5) {
            constraintAnchor = this.mBaseline;
        } else {
            return;
        }
        constraintAnchor.mGoneMargin = i;
    }

    public void setHasBaseline(boolean z) {
        this.hasBaseline = z;
    }

    public void setHeight(int i) {
        this.mHeight = i;
        int i2 = this.mMinHeight;
        if (i < i2) {
            this.mHeight = i2;
        }
    }

    public void setHeightWrapContent(boolean z) {
        this.mIsHeightWrapContent = z;
    }

    public void setHorizontalBiasPercent(float f) {
        this.mHorizontalBiasPercent = f;
    }

    public void setHorizontalChainStyle(int i) {
        this.mHorizontalChainStyle = i;
    }

    public void setHorizontalDimension(int i, int i2) {
        this.f52mX = i;
        int i3 = i2 - i;
        this.mWidth = i3;
        int i4 = this.mMinWidth;
        if (i3 < i4) {
            this.mWidth = i4;
        }
    }

    public void setHorizontalDimensionBehaviour(DimensionBehaviour dimensionBehaviour) {
        this.mListDimensionBehaviors[0] = dimensionBehaviour;
    }

    public void setHorizontalMatchStyle(int i, int i2, int i3, float f) {
        this.mMatchConstraintDefaultWidth = i;
        this.mMatchConstraintMinWidth = i2;
        if (i3 == Integer.MAX_VALUE) {
            i3 = 0;
        }
        this.mMatchConstraintMaxWidth = i3;
        this.mMatchConstraintPercentWidth = f;
        if (f > 0.0f && f < 1.0f && i == 0) {
            this.mMatchConstraintDefaultWidth = 2;
        }
    }

    public void setHorizontalWeight(float f) {
        this.mWeight[0] = f;
    }

    /* access modifiers changed from: protected */
    public void setInBarrier(int i, boolean z) {
        this.mIsInBarrier[i] = z;
    }

    public void setInPlaceholder(boolean z) {
        this.inPlaceholder = z;
    }

    public void setInVirtualLayout(boolean z) {
        this.mInVirtualLayout = z;
    }

    public void setLastMeasureSpec(int i, int i2) {
        this.mLastHorizontalMeasureSpec = i;
        this.mLastVerticalMeasureSpec = i2;
        setMeasureRequested(false);
    }

    public void setLength(int i, int i2) {
        if (i2 == 0) {
            setWidth(i);
        } else if (i2 == 1) {
            setHeight(i);
        }
    }

    public void setMaxHeight(int i) {
        this.mMaxDimension[1] = i;
    }

    public void setMaxWidth(int i) {
        this.mMaxDimension[0] = i;
    }

    public void setMeasureRequested(boolean z) {
        this.mMeasureRequested = z;
    }

    public void setMinHeight(int i) {
        if (i < 0) {
            i = 0;
        }
        this.mMinHeight = i;
    }

    public void setMinWidth(int i) {
        if (i < 0) {
            i = 0;
        }
        this.mMinWidth = i;
    }

    public void setOffset(int i, int i2) {
        this.mOffsetX = i;
        this.mOffsetY = i2;
    }

    public void setOrigin(int i, int i2) {
        this.f52mX = i;
        this.f53mY = i2;
    }

    public void setParent(ConstraintWidget constraintWidget) {
        this.mParent = constraintWidget;
    }

    /* access modifiers changed from: package-private */
    public void setRelativePositioning(int i, int i2) {
        if (i2 == 0) {
            this.mRelX = i;
        } else if (i2 == 1) {
            this.mRelY = i;
        }
    }

    public void setType(String str) {
        this.mType = str;
    }

    public void setVerticalBiasPercent(float f) {
        this.mVerticalBiasPercent = f;
    }

    public void setVerticalChainStyle(int i) {
        this.mVerticalChainStyle = i;
    }

    public void setVerticalDimension(int i, int i2) {
        this.f53mY = i;
        int i3 = i2 - i;
        this.mHeight = i3;
        int i4 = this.mMinHeight;
        if (i3 < i4) {
            this.mHeight = i4;
        }
    }

    public void setVerticalDimensionBehaviour(DimensionBehaviour dimensionBehaviour) {
        this.mListDimensionBehaviors[1] = dimensionBehaviour;
    }

    public void setVerticalMatchStyle(int i, int i2, int i3, float f) {
        this.mMatchConstraintDefaultHeight = i;
        this.mMatchConstraintMinHeight = i2;
        if (i3 == Integer.MAX_VALUE) {
            i3 = 0;
        }
        this.mMatchConstraintMaxHeight = i3;
        this.mMatchConstraintPercentHeight = f;
        if (f > 0.0f && f < 1.0f && i == 0) {
            this.mMatchConstraintDefaultHeight = 2;
        }
    }

    public void setVerticalWeight(float f) {
        this.mWeight[1] = f;
    }

    public void setVisibility(int i) {
        this.mVisibility = i;
    }

    public void setWidth(int i) {
        this.mWidth = i;
        int i2 = this.mMinWidth;
        if (i < i2) {
            this.mWidth = i2;
        }
    }

    public void setWidthWrapContent(boolean z) {
        this.mIsWidthWrapContent = z;
    }

    public void setWrapBehaviorInParent(int i) {
        if (i >= 0 && i <= 3) {
            this.mWrapBehaviorInParent = i;
        }
    }

    public void setX(int i) {
        this.f52mX = i;
    }

    public void setY(int i) {
        this.f53mY = i;
    }

    public void setupDimensionRatio(boolean z, boolean z2, boolean z3, boolean z4) {
        if (this.mResolvedDimensionRatioSide == -1) {
            if (z3 && !z4) {
                this.mResolvedDimensionRatioSide = 0;
            } else if (!z3 && z4) {
                this.mResolvedDimensionRatioSide = 1;
                if (this.mDimensionRatioSide == -1) {
                    this.mResolvedDimensionRatio = 1.0f / this.mResolvedDimensionRatio;
                }
            }
        }
        if (this.mResolvedDimensionRatioSide == 0 && (!this.mTop.isConnected() || !this.mBottom.isConnected())) {
            this.mResolvedDimensionRatioSide = 1;
        } else if (this.mResolvedDimensionRatioSide == 1 && (!this.mLeft.isConnected() || !this.mRight.isConnected())) {
            this.mResolvedDimensionRatioSide = 0;
        }
        if (this.mResolvedDimensionRatioSide == -1 && (!this.mTop.isConnected() || !this.mBottom.isConnected() || !this.mLeft.isConnected() || !this.mRight.isConnected())) {
            if (this.mTop.isConnected() && this.mBottom.isConnected()) {
                this.mResolvedDimensionRatioSide = 0;
            } else if (this.mLeft.isConnected() && this.mRight.isConnected()) {
                this.mResolvedDimensionRatio = 1.0f / this.mResolvedDimensionRatio;
                this.mResolvedDimensionRatioSide = 1;
            }
        }
        if (this.mResolvedDimensionRatioSide == -1) {
            int i = this.mMatchConstraintMinWidth;
            if (i > 0 && this.mMatchConstraintMinHeight == 0) {
                this.mResolvedDimensionRatioSide = 0;
            } else if (i == 0 && this.mMatchConstraintMinHeight > 0) {
                this.mResolvedDimensionRatio = 1.0f / this.mResolvedDimensionRatio;
                this.mResolvedDimensionRatioSide = 1;
            }
        }
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (this.mType != null) {
            str = "type: " + this.mType + " ";
        } else {
            str = str2;
        }
        sb.append(str);
        if (this.mDebugName != null) {
            str2 = "id: " + this.mDebugName + " ";
        }
        sb.append(str2);
        sb.append("(");
        sb.append(this.f52mX);
        sb.append(", ");
        sb.append(this.f53mY);
        sb.append(") - (");
        sb.append(this.mWidth);
        sb.append(" x ");
        sb.append(this.mHeight);
        sb.append(")");
        return sb.toString();
    }

    public void updateFromRuns(boolean z, boolean z2) {
        int i;
        int i2;
        boolean isResolved = z & this.horizontalRun.isResolved();
        boolean isResolved2 = z2 & this.verticalRun.isResolved();
        HorizontalWidgetRun horizontalWidgetRun = this.horizontalRun;
        int i3 = horizontalWidgetRun.start.value;
        VerticalWidgetRun verticalWidgetRun = this.verticalRun;
        int i4 = verticalWidgetRun.start.value;
        int i5 = horizontalWidgetRun.end.value;
        int i6 = verticalWidgetRun.end.value;
        int i7 = i6 - i4;
        if (i5 - i3 < 0 || i7 < 0 || i3 == Integer.MIN_VALUE || i3 == Integer.MAX_VALUE || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE) {
            i5 = 0;
            i3 = 0;
            i6 = 0;
            i4 = 0;
        }
        int i8 = i5 - i3;
        int i9 = i6 - i4;
        if (isResolved) {
            this.f52mX = i3;
        }
        if (isResolved2) {
            this.f53mY = i4;
        }
        if (this.mVisibility == 8) {
            this.mWidth = 0;
            this.mHeight = 0;
            return;
        }
        if (isResolved) {
            if (this.mListDimensionBehaviors[0] == DimensionBehaviour.FIXED && i8 < (i2 = this.mWidth)) {
                i8 = i2;
            }
            this.mWidth = i8;
            int i10 = this.mMinWidth;
            if (i8 < i10) {
                this.mWidth = i10;
            }
        }
        if (isResolved2) {
            if (this.mListDimensionBehaviors[1] == DimensionBehaviour.FIXED && i9 < (i = this.mHeight)) {
                i9 = i;
            }
            this.mHeight = i9;
            int i11 = this.mMinHeight;
            if (i9 < i11) {
                this.mHeight = i11;
            }
        }
    }

    public void updateFromSolver(LinearSystem linearSystem, boolean z) {
        VerticalWidgetRun verticalWidgetRun;
        HorizontalWidgetRun horizontalWidgetRun;
        int objectVariableValue = linearSystem.getObjectVariableValue(this.mLeft);
        int objectVariableValue2 = linearSystem.getObjectVariableValue(this.mTop);
        int objectVariableValue3 = linearSystem.getObjectVariableValue(this.mRight);
        int objectVariableValue4 = linearSystem.getObjectVariableValue(this.mBottom);
        if (z && (horizontalWidgetRun = this.horizontalRun) != null) {
            DependencyNode dependencyNode = horizontalWidgetRun.start;
            if (dependencyNode.resolved) {
                DependencyNode dependencyNode2 = horizontalWidgetRun.end;
                if (dependencyNode2.resolved) {
                    objectVariableValue = dependencyNode.value;
                    objectVariableValue3 = dependencyNode2.value;
                }
            }
        }
        if (z && (verticalWidgetRun = this.verticalRun) != null) {
            DependencyNode dependencyNode3 = verticalWidgetRun.start;
            if (dependencyNode3.resolved) {
                DependencyNode dependencyNode4 = verticalWidgetRun.end;
                if (dependencyNode4.resolved) {
                    objectVariableValue2 = dependencyNode3.value;
                    objectVariableValue4 = dependencyNode4.value;
                }
            }
        }
        int i = objectVariableValue4 - objectVariableValue2;
        if (objectVariableValue3 - objectVariableValue < 0 || i < 0 || objectVariableValue == Integer.MIN_VALUE || objectVariableValue == Integer.MAX_VALUE || objectVariableValue2 == Integer.MIN_VALUE || objectVariableValue2 == Integer.MAX_VALUE || objectVariableValue3 == Integer.MIN_VALUE || objectVariableValue3 == Integer.MAX_VALUE || objectVariableValue4 == Integer.MIN_VALUE || objectVariableValue4 == Integer.MAX_VALUE) {
            objectVariableValue4 = 0;
            objectVariableValue = 0;
            objectVariableValue2 = 0;
            objectVariableValue3 = 0;
        }
        setFrame(objectVariableValue, objectVariableValue2, objectVariableValue3, objectVariableValue4);
    }
}
