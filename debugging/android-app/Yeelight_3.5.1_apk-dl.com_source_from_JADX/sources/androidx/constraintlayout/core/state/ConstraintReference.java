package androidx.constraintlayout.core.state;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.state.State;
import androidx.constraintlayout.core.state.helpers.Facade;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;
import java.util.HashMap;

public class ConstraintReference implements Reference {
    private Object key;
    float mAlpha = Float.NaN;
    Object mBaselineToBaseline = null;
    Object mBaselineToBottom = null;
    Object mBaselineToTop = null;
    protected Object mBottomToBottom = null;
    protected Object mBottomToTop = null;
    private float mCircularAngle;
    Object mCircularConstraint = null;
    private float mCircularDistance;
    private ConstraintWidget mConstraintWidget;
    private HashMap<String, Integer> mCustomColors;
    private HashMap<String, Float> mCustomFloats;
    protected Object mEndToEnd = null;
    protected Object mEndToStart = null;
    Facade mFacade = null;
    float mHorizontalBias = 0.5f;
    int mHorizontalChainStyle = 0;
    float mHorizontalChainWeight = -1.0f;
    Dimension mHorizontalDimension;
    State.Constraint mLast = null;
    protected Object mLeftToLeft = null;
    protected Object mLeftToRight = null;
    int mMarginBaseline = 0;
    int mMarginBaselineGone = 0;
    protected int mMarginBottom = 0;
    protected int mMarginBottomGone = 0;
    protected int mMarginEnd = 0;
    protected int mMarginEndGone = 0;
    protected int mMarginLeft = 0;
    protected int mMarginLeftGone = 0;
    protected int mMarginRight = 0;
    protected int mMarginRightGone = 0;
    protected int mMarginStart = 0;
    protected int mMarginStartGone = 0;
    protected int mMarginTop = 0;
    protected int mMarginTopGone = 0;
    float mPivotX = Float.NaN;
    float mPivotY = Float.NaN;
    protected Object mRightToLeft = null;
    protected Object mRightToRight = null;
    float mRotationX = Float.NaN;
    float mRotationY = Float.NaN;
    float mRotationZ = Float.NaN;
    float mScaleX = Float.NaN;
    float mScaleY = Float.NaN;
    protected Object mStartToEnd = null;
    protected Object mStartToStart = null;
    final State mState;
    String mTag = null;
    protected Object mTopToBottom = null;
    protected Object mTopToTop = null;
    float mTranslationX = Float.NaN;
    float mTranslationY = Float.NaN;
    float mTranslationZ = Float.NaN;
    float mVerticalBias = 0.5f;
    int mVerticalChainStyle = 0;
    float mVerticalChainWeight = -1.0f;
    Dimension mVerticalDimension;
    private Object mView;
    int mVisibility = 0;

    /* renamed from: androidx.constraintlayout.core.state.ConstraintReference$1 */
    static /* synthetic */ class C01731 {
        static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$core$state$State$Constraint;

        /* JADX WARNING: Can't wrap try/catch for region: R(36:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|(3:35|36|38)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(38:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|38) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00cc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                androidx.constraintlayout.core.state.State$Constraint[] r0 = androidx.constraintlayout.core.state.State.Constraint.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$androidx$constraintlayout$core$state$State$Constraint = r0
                androidx.constraintlayout.core.state.State$Constraint r1 = androidx.constraintlayout.core.state.State.Constraint.LEFT_TO_LEFT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$androidx$constraintlayout$core$state$State$Constraint     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.constraintlayout.core.state.State$Constraint r1 = androidx.constraintlayout.core.state.State.Constraint.LEFT_TO_RIGHT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$androidx$constraintlayout$core$state$State$Constraint     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.constraintlayout.core.state.State$Constraint r1 = androidx.constraintlayout.core.state.State.Constraint.RIGHT_TO_LEFT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$androidx$constraintlayout$core$state$State$Constraint     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.constraintlayout.core.state.State$Constraint r1 = androidx.constraintlayout.core.state.State.Constraint.RIGHT_TO_RIGHT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = $SwitchMap$androidx$constraintlayout$core$state$State$Constraint     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.constraintlayout.core.state.State$Constraint r1 = androidx.constraintlayout.core.state.State.Constraint.START_TO_START     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = $SwitchMap$androidx$constraintlayout$core$state$State$Constraint     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.constraintlayout.core.state.State$Constraint r1 = androidx.constraintlayout.core.state.State.Constraint.START_TO_END     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = $SwitchMap$androidx$constraintlayout$core$state$State$Constraint     // Catch:{ NoSuchFieldError -> 0x0054 }
                androidx.constraintlayout.core.state.State$Constraint r1 = androidx.constraintlayout.core.state.State.Constraint.END_TO_START     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = $SwitchMap$androidx$constraintlayout$core$state$State$Constraint     // Catch:{ NoSuchFieldError -> 0x0060 }
                androidx.constraintlayout.core.state.State$Constraint r1 = androidx.constraintlayout.core.state.State.Constraint.END_TO_END     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = $SwitchMap$androidx$constraintlayout$core$state$State$Constraint     // Catch:{ NoSuchFieldError -> 0x006c }
                androidx.constraintlayout.core.state.State$Constraint r1 = androidx.constraintlayout.core.state.State.Constraint.TOP_TO_TOP     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = $SwitchMap$androidx$constraintlayout$core$state$State$Constraint     // Catch:{ NoSuchFieldError -> 0x0078 }
                androidx.constraintlayout.core.state.State$Constraint r1 = androidx.constraintlayout.core.state.State.Constraint.TOP_TO_BOTTOM     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = $SwitchMap$androidx$constraintlayout$core$state$State$Constraint     // Catch:{ NoSuchFieldError -> 0x0084 }
                androidx.constraintlayout.core.state.State$Constraint r1 = androidx.constraintlayout.core.state.State.Constraint.BOTTOM_TO_TOP     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = $SwitchMap$androidx$constraintlayout$core$state$State$Constraint     // Catch:{ NoSuchFieldError -> 0x0090 }
                androidx.constraintlayout.core.state.State$Constraint r1 = androidx.constraintlayout.core.state.State.Constraint.BOTTOM_TO_BOTTOM     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = $SwitchMap$androidx$constraintlayout$core$state$State$Constraint     // Catch:{ NoSuchFieldError -> 0x009c }
                androidx.constraintlayout.core.state.State$Constraint r1 = androidx.constraintlayout.core.state.State.Constraint.BASELINE_TO_BOTTOM     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = $SwitchMap$androidx$constraintlayout$core$state$State$Constraint     // Catch:{ NoSuchFieldError -> 0x00a8 }
                androidx.constraintlayout.core.state.State$Constraint r1 = androidx.constraintlayout.core.state.State.Constraint.BASELINE_TO_TOP     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = $SwitchMap$androidx$constraintlayout$core$state$State$Constraint     // Catch:{ NoSuchFieldError -> 0x00b4 }
                androidx.constraintlayout.core.state.State$Constraint r1 = androidx.constraintlayout.core.state.State.Constraint.BASELINE_TO_BASELINE     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = $SwitchMap$androidx$constraintlayout$core$state$State$Constraint     // Catch:{ NoSuchFieldError -> 0x00c0 }
                androidx.constraintlayout.core.state.State$Constraint r1 = androidx.constraintlayout.core.state.State.Constraint.CIRCULAR_CONSTRAINT     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = $SwitchMap$androidx$constraintlayout$core$state$State$Constraint     // Catch:{ NoSuchFieldError -> 0x00cc }
                androidx.constraintlayout.core.state.State$Constraint r1 = androidx.constraintlayout.core.state.State.Constraint.CENTER_HORIZONTALLY     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                int[] r0 = $SwitchMap$androidx$constraintlayout$core$state$State$Constraint     // Catch:{ NoSuchFieldError -> 0x00d8 }
                androidx.constraintlayout.core.state.State$Constraint r1 = androidx.constraintlayout.core.state.State.Constraint.CENTER_VERTICALLY     // Catch:{ NoSuchFieldError -> 0x00d8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d8 }
                r2 = 18
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00d8 }
            L_0x00d8:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.state.ConstraintReference.C01731.<clinit>():void");
        }
    }

    public interface ConstraintReferenceFactory {
        ConstraintReference create(State state);
    }

    static class IncorrectConstraintException extends Exception {
        private final ArrayList<String> mErrors;

        public IncorrectConstraintException(ArrayList<String> arrayList) {
            this.mErrors = arrayList;
        }

        public ArrayList<String> getErrors() {
            return this.mErrors;
        }

        public String toString() {
            return "IncorrectConstraintException: " + this.mErrors.toString();
        }
    }

    public ConstraintReference(State state) {
        Object obj = Dimension.WRAP_DIMENSION;
        this.mHorizontalDimension = Dimension.Fixed(obj);
        this.mVerticalDimension = Dimension.Fixed(obj);
        this.mCustomColors = new HashMap<>();
        this.mCustomFloats = new HashMap<>();
        this.mState = state;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003c, code lost:
        r0.immediateConnect(r1, r2, r3, r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0050, code lost:
        r8 = r2.getAnchor(r8);
        r0 = r6.mMarginBottom;
        r1 = r6.mMarginBottomGone;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0069, code lost:
        r8 = r2.getAnchor(r8);
        r0 = r6.mMarginTop;
        r1 = r6.mMarginTopGone;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0081, code lost:
        r8 = r2.getAnchor(r8);
        r0 = r6.mMarginEnd;
        r1 = r6.mMarginEndGone;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0099, code lost:
        r8 = r2.getAnchor(r8);
        r0 = r6.mMarginStart;
        r1 = r6.mMarginStartGone;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00b1, code lost:
        r8 = r2.getAnchor(r8);
        r0 = r6.mMarginRight;
        r1 = r6.mMarginRightGone;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00c9, code lost:
        r8 = r2.getAnchor(r8);
        r0 = r6.mMarginLeft;
        r1 = r6.mMarginLeftGone;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00d1, code lost:
        r7.connect(r8, r0, r1, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0037, code lost:
        r4 = r6.mMarginBaseline;
        r5 = r6.mMarginBaselineGone;
        r0 = r7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void applyConnection(androidx.constraintlayout.core.widgets.ConstraintWidget r7, java.lang.Object r8, androidx.constraintlayout.core.state.State.Constraint r9) {
        /*
            r6 = this;
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r6.getTarget(r8)
            if (r2 != 0) goto L_0x0007
            return
        L_0x0007:
            int[] r8 = androidx.constraintlayout.core.state.ConstraintReference.C01731.$SwitchMap$androidx$constraintlayout$core$state$State$Constraint
            int r0 = r9.ordinal()
            r0 = r8[r0]
            int r9 = r9.ordinal()
            r8 = r8[r9]
            r9 = 0
            switch(r8) {
                case 1: goto L_0x00c3;
                case 2: goto L_0x00ba;
                case 3: goto L_0x00a9;
                case 4: goto L_0x00a2;
                case 5: goto L_0x0093;
                case 6: goto L_0x008a;
                case 7: goto L_0x0079;
                case 8: goto L_0x0072;
                case 9: goto L_0x0063;
                case 10: goto L_0x005a;
                case 11: goto L_0x0048;
                case 12: goto L_0x0041;
                case 13: goto L_0x0033;
                case 14: goto L_0x002e;
                case 15: goto L_0x0025;
                case 16: goto L_0x001b;
                default: goto L_0x0019;
            }
        L_0x0019:
            goto L_0x00d4
        L_0x001b:
            float r8 = r6.mCircularAngle
            float r9 = r6.mCircularDistance
            int r9 = (int) r9
            r7.connectCircularConstraint(r2, r8, r9)
            goto L_0x00d4
        L_0x0025:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r3 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BASELINE
            int r4 = r6.mMarginBaseline
            int r5 = r6.mMarginBaselineGone
            r0 = r7
            r1 = r3
            goto L_0x003c
        L_0x002e:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BASELINE
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r3 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP
            goto L_0x0037
        L_0x0033:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BASELINE
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r3 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM
        L_0x0037:
            int r4 = r6.mMarginBaseline
            int r5 = r6.mMarginBaselineGone
            r0 = r7
        L_0x003c:
            r0.immediateConnect(r1, r2, r3, r4, r5)
            goto L_0x00d4
        L_0x0041:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r8 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.core.widgets.ConstraintAnchor r7 = r7.getAnchor(r8)
            goto L_0x0050
        L_0x0048:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r8 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.core.widgets.ConstraintAnchor r7 = r7.getAnchor(r8)
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r8 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP
        L_0x0050:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r2.getAnchor(r8)
            int r0 = r6.mMarginBottom
            int r1 = r6.mMarginBottomGone
            goto L_0x00d1
        L_0x005a:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r8 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP
            androidx.constraintlayout.core.widgets.ConstraintAnchor r7 = r7.getAnchor(r8)
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r8 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM
            goto L_0x0069
        L_0x0063:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r8 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP
            androidx.constraintlayout.core.widgets.ConstraintAnchor r7 = r7.getAnchor(r8)
        L_0x0069:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r2.getAnchor(r8)
            int r0 = r6.mMarginTop
            int r1 = r6.mMarginTopGone
            goto L_0x00d1
        L_0x0072:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r8 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT
            androidx.constraintlayout.core.widgets.ConstraintAnchor r7 = r7.getAnchor(r8)
            goto L_0x0081
        L_0x0079:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r8 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT
            androidx.constraintlayout.core.widgets.ConstraintAnchor r7 = r7.getAnchor(r8)
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r8 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT
        L_0x0081:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r2.getAnchor(r8)
            int r0 = r6.mMarginEnd
            int r1 = r6.mMarginEndGone
            goto L_0x00d1
        L_0x008a:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r8 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT
            androidx.constraintlayout.core.widgets.ConstraintAnchor r7 = r7.getAnchor(r8)
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r8 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT
            goto L_0x0099
        L_0x0093:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r8 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT
            androidx.constraintlayout.core.widgets.ConstraintAnchor r7 = r7.getAnchor(r8)
        L_0x0099:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r2.getAnchor(r8)
            int r0 = r6.mMarginStart
            int r1 = r6.mMarginStartGone
            goto L_0x00d1
        L_0x00a2:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r8 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT
            androidx.constraintlayout.core.widgets.ConstraintAnchor r7 = r7.getAnchor(r8)
            goto L_0x00b1
        L_0x00a9:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r8 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT
            androidx.constraintlayout.core.widgets.ConstraintAnchor r7 = r7.getAnchor(r8)
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r8 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT
        L_0x00b1:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r2.getAnchor(r8)
            int r0 = r6.mMarginRight
            int r1 = r6.mMarginRightGone
            goto L_0x00d1
        L_0x00ba:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r8 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT
            androidx.constraintlayout.core.widgets.ConstraintAnchor r7 = r7.getAnchor(r8)
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r8 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT
            goto L_0x00c9
        L_0x00c3:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r8 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT
            androidx.constraintlayout.core.widgets.ConstraintAnchor r7 = r7.getAnchor(r8)
        L_0x00c9:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r2.getAnchor(r8)
            int r0 = r6.mMarginLeft
            int r1 = r6.mMarginLeftGone
        L_0x00d1:
            r7.connect(r8, r0, r1, r9)
        L_0x00d4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.state.ConstraintReference.applyConnection(androidx.constraintlayout.core.widgets.ConstraintWidget, java.lang.Object, androidx.constraintlayout.core.state.State$Constraint):void");
    }

    private void dereference() {
        this.mLeftToLeft = get(this.mLeftToLeft);
        this.mLeftToRight = get(this.mLeftToRight);
        this.mRightToLeft = get(this.mRightToLeft);
        this.mRightToRight = get(this.mRightToRight);
        this.mStartToStart = get(this.mStartToStart);
        this.mStartToEnd = get(this.mStartToEnd);
        this.mEndToStart = get(this.mEndToStart);
        this.mEndToEnd = get(this.mEndToEnd);
        this.mTopToTop = get(this.mTopToTop);
        this.mTopToBottom = get(this.mTopToBottom);
        this.mBottomToTop = get(this.mBottomToTop);
        this.mBottomToBottom = get(this.mBottomToBottom);
        this.mBaselineToBaseline = get(this.mBaselineToBaseline);
        this.mBaselineToTop = get(this.mBaselineToTop);
        this.mBaselineToBottom = get(this.mBaselineToBottom);
    }

    private Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        return !(obj instanceof ConstraintReference) ? this.mState.reference(obj) : obj;
    }

    private ConstraintWidget getTarget(Object obj) {
        if (obj instanceof Reference) {
            return ((Reference) obj).getConstraintWidget();
        }
        return null;
    }

    public void addCustomColor(String str, int i) {
        this.mCustomColors.put(str, Integer.valueOf(i));
    }

    public void addCustomFloat(String str, float f) {
        if (this.mCustomFloats == null) {
            this.mCustomFloats = new HashMap<>();
        }
        this.mCustomFloats.put(str, Float.valueOf(f));
    }

    public ConstraintReference alpha(float f) {
        this.mAlpha = f;
        return this;
    }

    public void apply() {
        if (this.mConstraintWidget != null) {
            Facade facade = this.mFacade;
            if (facade != null) {
                facade.apply();
            }
            this.mHorizontalDimension.apply(this.mState, this.mConstraintWidget, 0);
            this.mVerticalDimension.apply(this.mState, this.mConstraintWidget, 1);
            dereference();
            applyConnection(this.mConstraintWidget, this.mLeftToLeft, State.Constraint.LEFT_TO_LEFT);
            applyConnection(this.mConstraintWidget, this.mLeftToRight, State.Constraint.LEFT_TO_RIGHT);
            applyConnection(this.mConstraintWidget, this.mRightToLeft, State.Constraint.RIGHT_TO_LEFT);
            applyConnection(this.mConstraintWidget, this.mRightToRight, State.Constraint.RIGHT_TO_RIGHT);
            applyConnection(this.mConstraintWidget, this.mStartToStart, State.Constraint.START_TO_START);
            applyConnection(this.mConstraintWidget, this.mStartToEnd, State.Constraint.START_TO_END);
            applyConnection(this.mConstraintWidget, this.mEndToStart, State.Constraint.END_TO_START);
            applyConnection(this.mConstraintWidget, this.mEndToEnd, State.Constraint.END_TO_END);
            applyConnection(this.mConstraintWidget, this.mTopToTop, State.Constraint.TOP_TO_TOP);
            applyConnection(this.mConstraintWidget, this.mTopToBottom, State.Constraint.TOP_TO_BOTTOM);
            applyConnection(this.mConstraintWidget, this.mBottomToTop, State.Constraint.BOTTOM_TO_TOP);
            applyConnection(this.mConstraintWidget, this.mBottomToBottom, State.Constraint.BOTTOM_TO_BOTTOM);
            applyConnection(this.mConstraintWidget, this.mBaselineToBaseline, State.Constraint.BASELINE_TO_BASELINE);
            applyConnection(this.mConstraintWidget, this.mBaselineToTop, State.Constraint.BASELINE_TO_TOP);
            applyConnection(this.mConstraintWidget, this.mBaselineToBottom, State.Constraint.BASELINE_TO_BOTTOM);
            applyConnection(this.mConstraintWidget, this.mCircularConstraint, State.Constraint.CIRCULAR_CONSTRAINT);
            int i = this.mHorizontalChainStyle;
            if (i != 0) {
                this.mConstraintWidget.setHorizontalChainStyle(i);
            }
            int i2 = this.mVerticalChainStyle;
            if (i2 != 0) {
                this.mConstraintWidget.setVerticalChainStyle(i2);
            }
            float f = this.mHorizontalChainWeight;
            if (f != -1.0f) {
                this.mConstraintWidget.setHorizontalWeight(f);
            }
            float f2 = this.mVerticalChainWeight;
            if (f2 != -1.0f) {
                this.mConstraintWidget.setVerticalWeight(f2);
            }
            this.mConstraintWidget.setHorizontalBiasPercent(this.mHorizontalBias);
            this.mConstraintWidget.setVerticalBiasPercent(this.mVerticalBias);
            ConstraintWidget constraintWidget = this.mConstraintWidget;
            WidgetFrame widgetFrame = constraintWidget.frame;
            widgetFrame.pivotX = this.mPivotX;
            widgetFrame.pivotY = this.mPivotY;
            widgetFrame.rotationX = this.mRotationX;
            widgetFrame.rotationY = this.mRotationY;
            widgetFrame.rotationZ = this.mRotationZ;
            widgetFrame.translationX = this.mTranslationX;
            widgetFrame.translationY = this.mTranslationY;
            widgetFrame.translationZ = this.mTranslationZ;
            widgetFrame.scaleX = this.mScaleX;
            widgetFrame.scaleY = this.mScaleY;
            widgetFrame.alpha = this.mAlpha;
            int i3 = this.mVisibility;
            widgetFrame.visibility = i3;
            constraintWidget.setVisibility(i3);
            HashMap<String, Integer> hashMap = this.mCustomColors;
            if (hashMap != null) {
                for (String next : hashMap.keySet()) {
                    this.mConstraintWidget.frame.setCustomAttribute(next, (int) TypedValues.Custom.TYPE_COLOR, this.mCustomColors.get(next).intValue());
                }
            }
            HashMap<String, Float> hashMap2 = this.mCustomFloats;
            if (hashMap2 != null) {
                for (String next2 : hashMap2.keySet()) {
                    this.mConstraintWidget.frame.setCustomAttribute(next2, (int) TypedValues.Custom.TYPE_FLOAT, this.mCustomFloats.get(next2).floatValue());
                }
            }
        }
    }

    public ConstraintReference baseline() {
        this.mLast = State.Constraint.BASELINE_TO_BASELINE;
        return this;
    }

    public ConstraintReference baselineToBaseline(Object obj) {
        this.mLast = State.Constraint.BASELINE_TO_BASELINE;
        this.mBaselineToBaseline = obj;
        return this;
    }

    public ConstraintReference baselineToBottom(Object obj) {
        this.mLast = State.Constraint.BASELINE_TO_BOTTOM;
        this.mBaselineToBottom = obj;
        return this;
    }

    public ConstraintReference baselineToTop(Object obj) {
        this.mLast = State.Constraint.BASELINE_TO_TOP;
        this.mBaselineToTop = obj;
        return this;
    }

    public ConstraintReference bias(float f) {
        State.Constraint constraint = this.mLast;
        if (constraint == null) {
            return this;
        }
        int i = C01731.$SwitchMap$androidx$constraintlayout$core$state$State$Constraint[constraint.ordinal()];
        if (i != 17) {
            if (i != 18) {
                switch (i) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        break;
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                        break;
                }
            }
            this.mVerticalBias = f;
            return this;
        }
        this.mHorizontalBias = f;
        return this;
    }

    public ConstraintReference bottom() {
        this.mLast = this.mBottomToTop != null ? State.Constraint.BOTTOM_TO_TOP : State.Constraint.BOTTOM_TO_BOTTOM;
        return this;
    }

    public ConstraintReference bottomToBottom(Object obj) {
        this.mLast = State.Constraint.BOTTOM_TO_BOTTOM;
        this.mBottomToBottom = obj;
        return this;
    }

    public ConstraintReference bottomToTop(Object obj) {
        this.mLast = State.Constraint.BOTTOM_TO_TOP;
        this.mBottomToTop = obj;
        return this;
    }

    public ConstraintReference centerHorizontally(Object obj) {
        Object obj2 = get(obj);
        this.mStartToStart = obj2;
        this.mEndToEnd = obj2;
        this.mLast = State.Constraint.CENTER_HORIZONTALLY;
        this.mHorizontalBias = 0.5f;
        return this;
    }

    public ConstraintReference centerVertically(Object obj) {
        Object obj2 = get(obj);
        this.mTopToTop = obj2;
        this.mBottomToBottom = obj2;
        this.mLast = State.Constraint.CENTER_VERTICALLY;
        this.mVerticalBias = 0.5f;
        return this;
    }

    public ConstraintReference circularConstraint(Object obj, float f, float f2) {
        this.mCircularConstraint = get(obj);
        this.mCircularAngle = f;
        this.mCircularDistance = f2;
        this.mLast = State.Constraint.CIRCULAR_CONSTRAINT;
        return this;
    }

    public ConstraintReference clear() {
        State.Constraint constraint = this.mLast;
        if (constraint != null) {
            switch (C01731.$SwitchMap$androidx$constraintlayout$core$state$State$Constraint[constraint.ordinal()]) {
                case 1:
                case 2:
                    this.mLeftToLeft = null;
                    this.mLeftToRight = null;
                    this.mMarginLeft = 0;
                    this.mMarginLeftGone = 0;
                    break;
                case 3:
                case 4:
                    this.mRightToLeft = null;
                    this.mRightToRight = null;
                    this.mMarginRight = 0;
                    this.mMarginRightGone = 0;
                    break;
                case 5:
                case 6:
                    this.mStartToStart = null;
                    this.mStartToEnd = null;
                    this.mMarginStart = 0;
                    this.mMarginStartGone = 0;
                    break;
                case 7:
                case 8:
                    this.mEndToStart = null;
                    this.mEndToEnd = null;
                    this.mMarginEnd = 0;
                    this.mMarginEndGone = 0;
                    break;
                case 9:
                case 10:
                    this.mTopToTop = null;
                    this.mTopToBottom = null;
                    this.mMarginTop = 0;
                    this.mMarginTopGone = 0;
                    break;
                case 11:
                case 12:
                    this.mBottomToTop = null;
                    this.mBottomToBottom = null;
                    this.mMarginBottom = 0;
                    break;
                case 15:
                    this.mBaselineToBaseline = null;
                    break;
                case 16:
                    this.mCircularConstraint = null;
                    break;
            }
        } else {
            this.mLeftToLeft = null;
            this.mLeftToRight = null;
            this.mMarginLeft = 0;
            this.mRightToLeft = null;
            this.mRightToRight = null;
            this.mMarginRight = 0;
            this.mStartToStart = null;
            this.mStartToEnd = null;
            this.mMarginStart = 0;
            this.mEndToStart = null;
            this.mEndToEnd = null;
            this.mMarginEnd = 0;
            this.mTopToTop = null;
            this.mTopToBottom = null;
            this.mMarginTop = 0;
            this.mBottomToTop = null;
            this.mBottomToBottom = null;
            this.mMarginBottom = 0;
            this.mBaselineToBaseline = null;
            this.mCircularConstraint = null;
            this.mHorizontalBias = 0.5f;
            this.mVerticalBias = 0.5f;
            this.mMarginLeftGone = 0;
            this.mMarginRightGone = 0;
            this.mMarginStartGone = 0;
            this.mMarginEndGone = 0;
            this.mMarginTopGone = 0;
        }
        this.mMarginBottomGone = 0;
        return this;
    }

    public ConstraintReference clearHorizontal() {
        start().clear();
        end().clear();
        left().clear();
        right().clear();
        return this;
    }

    public ConstraintReference clearVertical() {
        top().clear();
        baseline().clear();
        bottom().clear();
        return this;
    }

    public ConstraintWidget createConstraintWidget() {
        return new ConstraintWidget(getWidth().getValue(), getHeight().getValue());
    }

    public ConstraintReference end() {
        this.mLast = this.mEndToStart != null ? State.Constraint.END_TO_START : State.Constraint.END_TO_END;
        return this;
    }

    public ConstraintReference endToEnd(Object obj) {
        this.mLast = State.Constraint.END_TO_END;
        this.mEndToEnd = obj;
        return this;
    }

    public ConstraintReference endToStart(Object obj) {
        this.mLast = State.Constraint.END_TO_START;
        this.mEndToStart = obj;
        return this;
    }

    public float getAlpha() {
        return this.mAlpha;
    }

    public ConstraintWidget getConstraintWidget() {
        if (this.mConstraintWidget == null) {
            ConstraintWidget createConstraintWidget = createConstraintWidget();
            this.mConstraintWidget = createConstraintWidget;
            createConstraintWidget.setCompanionWidget(this.mView);
        }
        return this.mConstraintWidget;
    }

    public Facade getFacade() {
        return this.mFacade;
    }

    public Dimension getHeight() {
        return this.mVerticalDimension;
    }

    public int getHorizontalChainStyle() {
        return this.mHorizontalChainStyle;
    }

    public float getHorizontalChainWeight() {
        return this.mHorizontalChainWeight;
    }

    public Object getKey() {
        return this.key;
    }

    public float getPivotX() {
        return this.mPivotX;
    }

    public float getPivotY() {
        return this.mPivotY;
    }

    public float getRotationX() {
        return this.mRotationX;
    }

    public float getRotationY() {
        return this.mRotationY;
    }

    public float getRotationZ() {
        return this.mRotationZ;
    }

    public float getScaleX() {
        return this.mScaleX;
    }

    public float getScaleY() {
        return this.mScaleY;
    }

    public String getTag() {
        return this.mTag;
    }

    public float getTranslationX() {
        return this.mTranslationX;
    }

    public float getTranslationY() {
        return this.mTranslationY;
    }

    public float getTranslationZ() {
        return this.mTranslationZ;
    }

    public int getVerticalChainStyle(int i) {
        return this.mVerticalChainStyle;
    }

    public float getVerticalChainWeight() {
        return this.mVerticalChainWeight;
    }

    public Object getView() {
        return this.mView;
    }

    public Dimension getWidth() {
        return this.mHorizontalDimension;
    }

    public ConstraintReference height(Dimension dimension) {
        return setHeight(dimension);
    }

    public ConstraintReference horizontalBias(float f) {
        this.mHorizontalBias = f;
        return this;
    }

    public ConstraintReference left() {
        this.mLast = this.mLeftToLeft != null ? State.Constraint.LEFT_TO_LEFT : State.Constraint.LEFT_TO_RIGHT;
        return this;
    }

    public ConstraintReference leftToLeft(Object obj) {
        this.mLast = State.Constraint.LEFT_TO_LEFT;
        this.mLeftToLeft = obj;
        return this;
    }

    public ConstraintReference leftToRight(Object obj) {
        this.mLast = State.Constraint.LEFT_TO_RIGHT;
        this.mLeftToRight = obj;
        return this;
    }

    public ConstraintReference margin(int i) {
        State.Constraint constraint = this.mLast;
        if (constraint != null) {
            switch (C01731.$SwitchMap$androidx$constraintlayout$core$state$State$Constraint[constraint.ordinal()]) {
                case 1:
                case 2:
                    this.mMarginLeft = i;
                    break;
                case 3:
                case 4:
                    this.mMarginRight = i;
                    break;
                case 5:
                case 6:
                    this.mMarginStart = i;
                    break;
                case 7:
                case 8:
                    this.mMarginEnd = i;
                    break;
                case 9:
                case 10:
                    this.mMarginTop = i;
                    break;
                case 11:
                case 12:
                    break;
                case 13:
                case 14:
                case 15:
                    this.mMarginBaseline = i;
                    break;
                case 16:
                    this.mCircularDistance = (float) i;
                    break;
            }
        } else {
            this.mMarginLeft = i;
            this.mMarginRight = i;
            this.mMarginStart = i;
            this.mMarginEnd = i;
            this.mMarginTop = i;
        }
        this.mMarginBottom = i;
        return this;
    }

    public ConstraintReference margin(Object obj) {
        return margin(this.mState.convertDimension(obj));
    }

    public ConstraintReference marginGone(int i) {
        State.Constraint constraint = this.mLast;
        if (constraint != null) {
            switch (C01731.$SwitchMap$androidx$constraintlayout$core$state$State$Constraint[constraint.ordinal()]) {
                case 1:
                case 2:
                    this.mMarginLeftGone = i;
                    break;
                case 3:
                case 4:
                    this.mMarginRightGone = i;
                    break;
                case 5:
                case 6:
                    this.mMarginStartGone = i;
                    break;
                case 7:
                case 8:
                    this.mMarginEndGone = i;
                    break;
                case 9:
                case 10:
                    this.mMarginTopGone = i;
                    break;
                case 11:
                case 12:
                    break;
                case 13:
                case 14:
                case 15:
                    this.mMarginBaselineGone = i;
                    break;
            }
        } else {
            this.mMarginLeftGone = i;
            this.mMarginRightGone = i;
            this.mMarginStartGone = i;
            this.mMarginEndGone = i;
            this.mMarginTopGone = i;
        }
        this.mMarginBottomGone = i;
        return this;
    }

    public ConstraintReference marginGone(Object obj) {
        return marginGone(this.mState.convertDimension(obj));
    }

    public ConstraintReference pivotX(float f) {
        this.mPivotX = f;
        return this;
    }

    public ConstraintReference pivotY(float f) {
        this.mPivotY = f;
        return this;
    }

    public ConstraintReference right() {
        this.mLast = this.mRightToLeft != null ? State.Constraint.RIGHT_TO_LEFT : State.Constraint.RIGHT_TO_RIGHT;
        return this;
    }

    public ConstraintReference rightToLeft(Object obj) {
        this.mLast = State.Constraint.RIGHT_TO_LEFT;
        this.mRightToLeft = obj;
        return this;
    }

    public ConstraintReference rightToRight(Object obj) {
        this.mLast = State.Constraint.RIGHT_TO_RIGHT;
        this.mRightToRight = obj;
        return this;
    }

    public ConstraintReference rotationX(float f) {
        this.mRotationX = f;
        return this;
    }

    public ConstraintReference rotationY(float f) {
        this.mRotationY = f;
        return this;
    }

    public ConstraintReference rotationZ(float f) {
        this.mRotationZ = f;
        return this;
    }

    public ConstraintReference scaleX(float f) {
        this.mScaleX = f;
        return this;
    }

    public ConstraintReference scaleY(float f) {
        this.mScaleY = f;
        return this;
    }

    public void setConstraintWidget(ConstraintWidget constraintWidget) {
        if (constraintWidget != null) {
            this.mConstraintWidget = constraintWidget;
            constraintWidget.setCompanionWidget(this.mView);
        }
    }

    public void setFacade(Facade facade) {
        this.mFacade = facade;
        if (facade != null) {
            setConstraintWidget(facade.getConstraintWidget());
        }
    }

    public ConstraintReference setHeight(Dimension dimension) {
        this.mVerticalDimension = dimension;
        return this;
    }

    public void setHorizontalChainStyle(int i) {
        this.mHorizontalChainStyle = i;
    }

    public void setHorizontalChainWeight(float f) {
        this.mHorizontalChainWeight = f;
    }

    public void setKey(Object obj) {
        this.key = obj;
    }

    public void setTag(String str) {
        this.mTag = str;
    }

    public void setVerticalChainStyle(int i) {
        this.mVerticalChainStyle = i;
    }

    public void setVerticalChainWeight(float f) {
        this.mVerticalChainWeight = f;
    }

    public void setView(Object obj) {
        this.mView = obj;
        ConstraintWidget constraintWidget = this.mConstraintWidget;
        if (constraintWidget != null) {
            constraintWidget.setCompanionWidget(obj);
        }
    }

    public ConstraintReference setWidth(Dimension dimension) {
        this.mHorizontalDimension = dimension;
        return this;
    }

    public ConstraintReference start() {
        this.mLast = this.mStartToStart != null ? State.Constraint.START_TO_START : State.Constraint.START_TO_END;
        return this;
    }

    public ConstraintReference startToEnd(Object obj) {
        this.mLast = State.Constraint.START_TO_END;
        this.mStartToEnd = obj;
        return this;
    }

    public ConstraintReference startToStart(Object obj) {
        this.mLast = State.Constraint.START_TO_START;
        this.mStartToStart = obj;
        return this;
    }

    public ConstraintReference top() {
        this.mLast = this.mTopToTop != null ? State.Constraint.TOP_TO_TOP : State.Constraint.TOP_TO_BOTTOM;
        return this;
    }

    public ConstraintReference topToBottom(Object obj) {
        this.mLast = State.Constraint.TOP_TO_BOTTOM;
        this.mTopToBottom = obj;
        return this;
    }

    public ConstraintReference topToTop(Object obj) {
        this.mLast = State.Constraint.TOP_TO_TOP;
        this.mTopToTop = obj;
        return this;
    }

    public ConstraintReference translationX(float f) {
        this.mTranslationX = f;
        return this;
    }

    public ConstraintReference translationY(float f) {
        this.mTranslationY = f;
        return this;
    }

    public ConstraintReference translationZ(float f) {
        this.mTranslationZ = f;
        return this;
    }

    public void validate() {
        ArrayList arrayList = new ArrayList();
        if (!(this.mLeftToLeft == null || this.mLeftToRight == null)) {
            arrayList.add("LeftToLeft and LeftToRight both defined");
        }
        if (!(this.mRightToLeft == null || this.mRightToRight == null)) {
            arrayList.add("RightToLeft and RightToRight both defined");
        }
        if (!(this.mStartToStart == null || this.mStartToEnd == null)) {
            arrayList.add("StartToStart and StartToEnd both defined");
        }
        if (!(this.mEndToStart == null || this.mEndToEnd == null)) {
            arrayList.add("EndToStart and EndToEnd both defined");
        }
        if (!((this.mLeftToLeft == null && this.mLeftToRight == null && this.mRightToLeft == null && this.mRightToRight == null) || (this.mStartToStart == null && this.mStartToEnd == null && this.mEndToStart == null && this.mEndToEnd == null))) {
            arrayList.add("Both left/right and start/end constraints defined");
        }
        if (arrayList.size() > 0) {
            throw new IncorrectConstraintException(arrayList);
        }
    }

    public ConstraintReference verticalBias(float f) {
        this.mVerticalBias = f;
        return this;
    }

    public ConstraintReference visibility(int i) {
        this.mVisibility = i;
        return this;
    }

    public ConstraintReference width(Dimension dimension) {
        return setWidth(dimension);
    }
}
