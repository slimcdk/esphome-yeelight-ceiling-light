package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.LinearSystem;
import java.util.ArrayList;

public class Chain {
    private static final boolean DEBUG = false;
    public static final boolean USE_CHAIN_OPTIMIZATION = false;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v0, resolved type: androidx.constraintlayout.core.widgets.ConstraintWidget} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: androidx.constraintlayout.core.SolverVariable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: androidx.constraintlayout.core.SolverVariable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v1, resolved type: androidx.constraintlayout.core.widgets.ConstraintWidget} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: androidx.constraintlayout.core.SolverVariable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v2, resolved type: androidx.constraintlayout.core.widgets.ConstraintWidget} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: androidx.constraintlayout.core.SolverVariable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v3, resolved type: androidx.constraintlayout.core.widgets.ConstraintWidget} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v4, resolved type: androidx.constraintlayout.core.widgets.ConstraintWidget} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v40, resolved type: androidx.constraintlayout.core.SolverVariable} */
    /* JADX WARNING: type inference failed for: r5v10, types: [androidx.constraintlayout.core.SolverVariable] */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        if (r8 == 2) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0042, code lost:
        if (r8 == 2) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0046, code lost:
        r5 = false;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x019c  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x01ca  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x01ce  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x01d8  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0268 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x02c1 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x0330  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x0339  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x034e  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x035e A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x03a5  */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x03ba  */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x03bd  */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x03c3  */
    /* JADX WARNING: Removed duplicated region for block: B:276:0x049d  */
    /* JADX WARNING: Removed duplicated region for block: B:281:0x04d2  */
    /* JADX WARNING: Removed duplicated region for block: B:286:0x04e5 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:291:0x04f1  */
    /* JADX WARNING: Removed duplicated region for block: B:294:0x04fc  */
    /* JADX WARNING: Removed duplicated region for block: B:295:0x04ff  */
    /* JADX WARNING: Removed duplicated region for block: B:298:0x0505  */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x0508  */
    /* JADX WARNING: Removed duplicated region for block: B:301:0x050c  */
    /* JADX WARNING: Removed duplicated region for block: B:306:0x051c  */
    /* JADX WARNING: Removed duplicated region for block: B:308:0x0522 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:318:0x03a7 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:330:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void applyChainConstraints(androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r38, androidx.constraintlayout.core.LinearSystem r39, int r40, int r41, androidx.constraintlayout.core.widgets.ChainHead r42) {
        /*
            r0 = r38
            r9 = r39
            r10 = r40
            r1 = r42
            androidx.constraintlayout.core.widgets.ConstraintWidget r11 = r1.mFirst
            androidx.constraintlayout.core.widgets.ConstraintWidget r12 = r1.mLast
            androidx.constraintlayout.core.widgets.ConstraintWidget r13 = r1.mFirstVisibleWidget
            androidx.constraintlayout.core.widgets.ConstraintWidget r14 = r1.mLastVisibleWidget
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r1.mHead
            float r3 = r1.mTotalWeight
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r4 = r0.mListDimensionBehaviors
            r4 = r4[r10]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r5 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            r7 = 1
            if (r4 != r5) goto L_0x001f
            r4 = 1
            goto L_0x0020
        L_0x001f:
            r4 = 0
        L_0x0020:
            r5 = 2
            if (r10 != 0) goto L_0x0034
            int r8 = r2.mHorizontalChainStyle
            if (r8 != 0) goto L_0x0029
            r15 = 1
            goto L_0x002a
        L_0x0029:
            r15 = 0
        L_0x002a:
            if (r8 != r7) goto L_0x002f
            r16 = 1
            goto L_0x0031
        L_0x002f:
            r16 = 0
        L_0x0031:
            if (r8 != r5) goto L_0x0046
            goto L_0x0044
        L_0x0034:
            int r8 = r2.mVerticalChainStyle
            if (r8 != 0) goto L_0x003a
            r15 = 1
            goto L_0x003b
        L_0x003a:
            r15 = 0
        L_0x003b:
            if (r8 != r7) goto L_0x0040
            r16 = 1
            goto L_0x0042
        L_0x0040:
            r16 = 0
        L_0x0042:
            if (r8 != r5) goto L_0x0046
        L_0x0044:
            r5 = 1
            goto L_0x0047
        L_0x0046:
            r5 = 0
        L_0x0047:
            r7 = r11
            r8 = 0
        L_0x0049:
            r22 = 0
            if (r8 != 0) goto L_0x012e
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r6 = r7.mListAnchors
            r6 = r6[r41]
            if (r5 == 0) goto L_0x0056
            r20 = 1
            goto L_0x0058
        L_0x0056:
            r20 = 4
        L_0x0058:
            int r24 = r6.getMargin()
            r25 = r3
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r3 = r7.mListDimensionBehaviors
            r3 = r3[r10]
            r26 = r8
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r8 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r3 != r8) goto L_0x0072
            int[] r3 = r7.mResolvedMatchConstraintDefault
            r3 = r3[r10]
            if (r3 != 0) goto L_0x0072
            r27 = r15
            r3 = 1
            goto L_0x0075
        L_0x0072:
            r27 = r15
            r3 = 0
        L_0x0075:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r15 = r6.mTarget
            if (r15 == 0) goto L_0x0081
            if (r7 == r11) goto L_0x0081
            int r15 = r15.getMargin()
            int r24 = r24 + r15
        L_0x0081:
            r15 = r24
            if (r5 == 0) goto L_0x008e
            if (r7 == r11) goto L_0x008e
            if (r7 == r13) goto L_0x008e
            r24 = r2
            r20 = 8
            goto L_0x0090
        L_0x008e:
            r24 = r2
        L_0x0090:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r6.mTarget
            r28 = r11
            if (r2 == 0) goto L_0x00c7
            if (r7 != r13) goto L_0x00a1
            androidx.constraintlayout.core.SolverVariable r11 = r6.mSolverVariable
            androidx.constraintlayout.core.SolverVariable r2 = r2.mSolverVariable
            r1 = 6
            r9.addGreaterThan(r11, r2, r15, r1)
            goto L_0x00aa
        L_0x00a1:
            androidx.constraintlayout.core.SolverVariable r1 = r6.mSolverVariable
            androidx.constraintlayout.core.SolverVariable r2 = r2.mSolverVariable
            r11 = 8
            r9.addGreaterThan(r1, r2, r15, r11)
        L_0x00aa:
            if (r3 == 0) goto L_0x00b0
            if (r5 != 0) goto L_0x00b0
            r20 = 5
        L_0x00b0:
            if (r7 != r13) goto L_0x00bc
            if (r5 == 0) goto L_0x00bc
            boolean r1 = r7.isInBarrier(r10)
            if (r1 == 0) goto L_0x00bc
            r1 = 5
            goto L_0x00be
        L_0x00bc:
            r1 = r20
        L_0x00be:
            androidx.constraintlayout.core.SolverVariable r2 = r6.mSolverVariable
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r6.mTarget
            androidx.constraintlayout.core.SolverVariable r3 = r3.mSolverVariable
            r9.addEquality(r2, r3, r15, r1)
        L_0x00c7:
            if (r4 == 0) goto L_0x00fb
            int r1 = r7.getVisibility()
            r2 = 8
            if (r1 == r2) goto L_0x00e9
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r1 = r7.mListDimensionBehaviors
            r1 = r1[r10]
            if (r1 != r8) goto L_0x00e9
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r1 = r7.mListAnchors
            int r2 = r41 + 1
            r2 = r1[r2]
            androidx.constraintlayout.core.SolverVariable r2 = r2.mSolverVariable
            r1 = r1[r41]
            androidx.constraintlayout.core.SolverVariable r1 = r1.mSolverVariable
            r3 = 5
            r6 = 0
            r9.addGreaterThan(r2, r1, r6, r3)
            goto L_0x00ea
        L_0x00e9:
            r6 = 0
        L_0x00ea:
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r1 = r7.mListAnchors
            r1 = r1[r41]
            androidx.constraintlayout.core.SolverVariable r1 = r1.mSolverVariable
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r2 = r0.mListAnchors
            r2 = r2[r41]
            androidx.constraintlayout.core.SolverVariable r2 = r2.mSolverVariable
            r3 = 8
            r9.addGreaterThan(r1, r2, r6, r3)
        L_0x00fb:
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r1 = r7.mListAnchors
            int r2 = r41 + 1
            r1 = r1[r2]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r1.mTarget
            if (r1 == 0) goto L_0x011a
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r1.mOwner
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r2 = r1.mListAnchors
            r3 = r2[r41]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r3.mTarget
            if (r3 == 0) goto L_0x011a
            r2 = r2[r41]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.mTarget
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r2.mOwner
            if (r2 == r7) goto L_0x0118
            goto L_0x011a
        L_0x0118:
            r22 = r1
        L_0x011a:
            if (r22 == 0) goto L_0x0121
            r7 = r22
            r8 = r26
            goto L_0x0122
        L_0x0121:
            r8 = 1
        L_0x0122:
            r1 = r42
            r2 = r24
            r3 = r25
            r15 = r27
            r11 = r28
            goto L_0x0049
        L_0x012e:
            r24 = r2
            r25 = r3
            r28 = r11
            r27 = r15
            if (r14 == 0) goto L_0x0199
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r1 = r12.mListAnchors
            int r2 = r41 + 1
            r1 = r1[r2]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r1.mTarget
            if (r1 == 0) goto L_0x0199
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r1 = r14.mListAnchors
            r1 = r1[r2]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r3 = r14.mListDimensionBehaviors
            r3 = r3[r10]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r3 != r6) goto L_0x0156
            int[] r3 = r14.mResolvedMatchConstraintDefault
            r3 = r3[r10]
            if (r3 != 0) goto L_0x0156
            r3 = 1
            goto L_0x0157
        L_0x0156:
            r3 = 0
        L_0x0157:
            if (r3 == 0) goto L_0x016f
            if (r5 != 0) goto L_0x016f
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r1.mTarget
            androidx.constraintlayout.core.widgets.ConstraintWidget r6 = r3.mOwner
            if (r6 != r0) goto L_0x016f
            androidx.constraintlayout.core.SolverVariable r6 = r1.mSolverVariable
            androidx.constraintlayout.core.SolverVariable r3 = r3.mSolverVariable
            int r7 = r1.getMargin()
            int r7 = -r7
            r8 = 5
            r9.addEquality(r6, r3, r7, r8)
            goto L_0x0185
        L_0x016f:
            r8 = 5
            if (r5 == 0) goto L_0x0185
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r1.mTarget
            androidx.constraintlayout.core.widgets.ConstraintWidget r6 = r3.mOwner
            if (r6 != r0) goto L_0x0185
            androidx.constraintlayout.core.SolverVariable r6 = r1.mSolverVariable
            androidx.constraintlayout.core.SolverVariable r3 = r3.mSolverVariable
            int r7 = r1.getMargin()
            int r7 = -r7
            r11 = 4
            r9.addEquality(r6, r3, r7, r11)
        L_0x0185:
            androidx.constraintlayout.core.SolverVariable r3 = r1.mSolverVariable
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r6 = r12.mListAnchors
            r2 = r6[r2]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.mTarget
            androidx.constraintlayout.core.SolverVariable r2 = r2.mSolverVariable
            int r1 = r1.getMargin()
            int r1 = -r1
            r6 = 6
            r9.addLowerThan(r3, r2, r1, r6)
            goto L_0x019a
        L_0x0199:
            r8 = 5
        L_0x019a:
            if (r4 == 0) goto L_0x01b5
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r0 = r0.mListAnchors
            int r1 = r41 + 1
            r0 = r0[r1]
            androidx.constraintlayout.core.SolverVariable r0 = r0.mSolverVariable
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r2 = r12.mListAnchors
            r3 = r2[r1]
            androidx.constraintlayout.core.SolverVariable r3 = r3.mSolverVariable
            r1 = r2[r1]
            int r1 = r1.getMargin()
            r2 = 8
            r9.addGreaterThan(r0, r3, r1, r2)
        L_0x01b5:
            r0 = r42
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r1 = r0.mWeightedMatchConstraintsWidgets
            if (r1 == 0) goto L_0x0266
            int r2 = r1.size()
            r3 = 1
            if (r2 <= r3) goto L_0x0266
            boolean r4 = r0.mHasUndefinedWeights
            if (r4 == 0) goto L_0x01ce
            boolean r4 = r0.mHasComplexMatchWeights
            if (r4 != 0) goto L_0x01ce
            int r4 = r0.mWidgetsMatchCount
            float r4 = (float) r4
            goto L_0x01d0
        L_0x01ce:
            r4 = r25
        L_0x01d0:
            r6 = 0
            r11 = r22
            r7 = 0
            r30 = 0
        L_0x01d6:
            if (r7 >= r2) goto L_0x0266
            java.lang.Object r15 = r1.get(r7)
            androidx.constraintlayout.core.widgets.ConstraintWidget r15 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r15
            float[] r3 = r15.mWeight
            r3 = r3[r10]
            int r19 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r19 >= 0) goto L_0x0202
            boolean r3 = r0.mHasComplexMatchWeights
            if (r3 == 0) goto L_0x01fd
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r3 = r15.mListAnchors
            int r15 = r41 + 1
            r15 = r3[r15]
            androidx.constraintlayout.core.SolverVariable r15 = r15.mSolverVariable
            r3 = r3[r41]
            androidx.constraintlayout.core.SolverVariable r3 = r3.mSolverVariable
            r6 = 0
            r8 = 4
            r9.addEquality(r15, r3, r6, r8)
            r8 = 0
            goto L_0x0219
        L_0x01fd:
            r8 = 4
            r3 = 1065353216(0x3f800000, float:1.0)
            r6 = 0
            goto L_0x0203
        L_0x0202:
            r8 = 4
        L_0x0203:
            int r19 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r19 != 0) goto L_0x021e
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r3 = r15.mListAnchors
            int r15 = r41 + 1
            r15 = r3[r15]
            androidx.constraintlayout.core.SolverVariable r15 = r15.mSolverVariable
            r3 = r3[r41]
            androidx.constraintlayout.core.SolverVariable r3 = r3.mSolverVariable
            r6 = 8
            r8 = 0
            r9.addEquality(r15, r3, r8, r6)
        L_0x0219:
            r25 = r1
            r18 = r2
            goto L_0x025b
        L_0x021e:
            r8 = 0
            if (r11 == 0) goto L_0x0254
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r6 = r11.mListAnchors
            r11 = r6[r41]
            androidx.constraintlayout.core.SolverVariable r11 = r11.mSolverVariable
            int r18 = r41 + 1
            r6 = r6[r18]
            androidx.constraintlayout.core.SolverVariable r6 = r6.mSolverVariable
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r8 = r15.mListAnchors
            r25 = r1
            r1 = r8[r41]
            androidx.constraintlayout.core.SolverVariable r1 = r1.mSolverVariable
            r8 = r8[r18]
            androidx.constraintlayout.core.SolverVariable r8 = r8.mSolverVariable
            r18 = r2
            androidx.constraintlayout.core.ArrayRow r2 = r39.createRow()
            r29 = r2
            r31 = r4
            r32 = r3
            r33 = r11
            r34 = r6
            r35 = r1
            r36 = r8
            r29.createRowEqualMatchDimensions(r30, r31, r32, r33, r34, r35, r36)
            r9.addConstraint(r2)
            goto L_0x0258
        L_0x0254:
            r25 = r1
            r18 = r2
        L_0x0258:
            r30 = r3
            r11 = r15
        L_0x025b:
            int r7 = r7 + 1
            r2 = r18
            r1 = r25
            r3 = 1
            r6 = 0
            r8 = 5
            goto L_0x01d6
        L_0x0266:
            if (r13 == 0) goto L_0x02bd
            if (r13 == r14) goto L_0x026c
            if (r5 == 0) goto L_0x02bd
        L_0x026c:
            r11 = r28
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r0 = r11.mListAnchors
            r0 = r0[r41]
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r1 = r12.mListAnchors
            int r2 = r41 + 1
            r1 = r1[r2]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.mTarget
            if (r0 == 0) goto L_0x0280
            androidx.constraintlayout.core.SolverVariable r0 = r0.mSolverVariable
            r3 = r0
            goto L_0x0282
        L_0x0280:
            r3 = r22
        L_0x0282:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r1.mTarget
            if (r0 == 0) goto L_0x028a
            androidx.constraintlayout.core.SolverVariable r0 = r0.mSolverVariable
            r5 = r0
            goto L_0x028c
        L_0x028a:
            r5 = r22
        L_0x028c:
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r0 = r13.mListAnchors
            r0 = r0[r41]
            if (r14 == 0) goto L_0x0296
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r1 = r14.mListAnchors
            r1 = r1[r2]
        L_0x0296:
            if (r3 == 0) goto L_0x04e3
            if (r5 == 0) goto L_0x04e3
            r2 = r24
            if (r10 != 0) goto L_0x02a1
            float r2 = r2.mHorizontalBiasPercent
            goto L_0x02a3
        L_0x02a1:
            float r2 = r2.mVerticalBiasPercent
        L_0x02a3:
            r4 = r2
            int r6 = r0.getMargin()
            int r7 = r1.getMargin()
            androidx.constraintlayout.core.SolverVariable r2 = r0.mSolverVariable
            androidx.constraintlayout.core.SolverVariable r8 = r1.mSolverVariable
            r10 = 7
            r0 = r39
            r1 = r2
            r2 = r3
            r3 = r6
            r6 = r8
            r8 = r10
            r0.addCentering(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x04e3
        L_0x02bd:
            r11 = r28
            if (r27 == 0) goto L_0x03ac
            if (r13 == 0) goto L_0x03ac
            int r1 = r0.mWidgetsMatchCount
            if (r1 <= 0) goto L_0x02ce
            int r0 = r0.mWidgetsCount
            if (r0 != r1) goto L_0x02ce
            r17 = 1
            goto L_0x02d0
        L_0x02ce:
            r17 = 0
        L_0x02d0:
            r8 = r13
            r15 = r8
        L_0x02d2:
            if (r15 == 0) goto L_0x04e3
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r0 = r15.mNextChainWidget
            r0 = r0[r10]
            r7 = r0
        L_0x02d9:
            if (r7 == 0) goto L_0x02e8
            int r0 = r7.getVisibility()
            r6 = 8
            if (r0 != r6) goto L_0x02ea
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r0 = r7.mNextChainWidget
            r7 = r0[r10]
            goto L_0x02d9
        L_0x02e8:
            r6 = 8
        L_0x02ea:
            if (r7 != 0) goto L_0x02f5
            if (r15 != r14) goto L_0x02ef
            goto L_0x02f5
        L_0x02ef:
            r20 = r7
        L_0x02f1:
            r18 = r8
            goto L_0x039c
        L_0x02f5:
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r0 = r15.mListAnchors
            r0 = r0[r41]
            androidx.constraintlayout.core.SolverVariable r1 = r0.mSolverVariable
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r0.mTarget
            if (r2 == 0) goto L_0x0302
            androidx.constraintlayout.core.SolverVariable r2 = r2.mSolverVariable
            goto L_0x0304
        L_0x0302:
            r2 = r22
        L_0x0304:
            if (r8 == r15) goto L_0x030f
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r2 = r8.mListAnchors
            int r3 = r41 + 1
            r2 = r2[r3]
        L_0x030c:
            androidx.constraintlayout.core.SolverVariable r2 = r2.mSolverVariable
            goto L_0x0320
        L_0x030f:
            if (r15 != r13) goto L_0x0320
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r2 = r11.mListAnchors
            r3 = r2[r41]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r3.mTarget
            if (r3 == 0) goto L_0x031e
            r2 = r2[r41]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.mTarget
            goto L_0x030c
        L_0x031e:
            r2 = r22
        L_0x0320:
            int r0 = r0.getMargin()
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r3 = r15.mListAnchors
            int r4 = r41 + 1
            r3 = r3[r4]
            int r3 = r3.getMargin()
            if (r7 == 0) goto L_0x0339
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r5 = r7.mListAnchors
            r5 = r5[r41]
        L_0x0334:
            androidx.constraintlayout.core.SolverVariable r6 = r5.mSolverVariable
            r38 = r7
            goto L_0x0346
        L_0x0339:
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r5 = r12.mListAnchors
            r5 = r5[r4]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r5.mTarget
            if (r5 == 0) goto L_0x0342
            goto L_0x0334
        L_0x0342:
            r38 = r7
            r6 = r22
        L_0x0346:
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r7 = r15.mListAnchors
            r7 = r7[r4]
            androidx.constraintlayout.core.SolverVariable r7 = r7.mSolverVariable
            if (r5 == 0) goto L_0x0353
            int r5 = r5.getMargin()
            int r3 = r3 + r5
        L_0x0353:
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r5 = r8.mListAnchors
            r5 = r5[r4]
            int r5 = r5.getMargin()
            int r0 = r0 + r5
            if (r1 == 0) goto L_0x0398
            if (r2 == 0) goto L_0x0398
            if (r6 == 0) goto L_0x0398
            if (r7 == 0) goto L_0x0398
            if (r15 != r13) goto L_0x036e
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r0 = r13.mListAnchors
            r0 = r0[r41]
            int r0 = r0.getMargin()
        L_0x036e:
            r5 = r0
            if (r15 != r14) goto L_0x037c
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r0 = r14.mListAnchors
            r0 = r0[r4]
            int r0 = r0.getMargin()
            r18 = r0
            goto L_0x037e
        L_0x037c:
            r18 = r3
        L_0x037e:
            if (r17 == 0) goto L_0x0383
            r19 = 8
            goto L_0x0385
        L_0x0383:
            r19 = 5
        L_0x0385:
            r4 = 1056964608(0x3f000000, float:0.5)
            r0 = r39
            r3 = r5
            r5 = r6
            r6 = r7
            r20 = r38
            r7 = r18
            r18 = r8
            r8 = r19
            r0.addCentering(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x039c
        L_0x0398:
            r20 = r38
            goto L_0x02f1
        L_0x039c:
            int r0 = r15.getVisibility()
            r8 = 8
            if (r0 == r8) goto L_0x03a5
            goto L_0x03a7
        L_0x03a5:
            r15 = r18
        L_0x03a7:
            r8 = r15
            r15 = r20
            goto L_0x02d2
        L_0x03ac:
            r8 = 8
            if (r16 == 0) goto L_0x04e3
            if (r13 == 0) goto L_0x04e3
            int r1 = r0.mWidgetsMatchCount
            if (r1 <= 0) goto L_0x03bd
            int r0 = r0.mWidgetsCount
            if (r0 != r1) goto L_0x03bd
            r17 = 1
            goto L_0x03bf
        L_0x03bd:
            r17 = 0
        L_0x03bf:
            r7 = r13
            r15 = r7
        L_0x03c1:
            if (r15 == 0) goto L_0x0485
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r0 = r15.mNextChainWidget
            r0 = r0[r10]
        L_0x03c7:
            if (r0 == 0) goto L_0x03d4
            int r1 = r0.getVisibility()
            if (r1 != r8) goto L_0x03d4
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r0 = r0.mNextChainWidget
            r0 = r0[r10]
            goto L_0x03c7
        L_0x03d4:
            if (r15 == r13) goto L_0x046e
            if (r15 == r14) goto L_0x046e
            if (r0 == 0) goto L_0x046e
            if (r0 != r14) goto L_0x03df
            r6 = r22
            goto L_0x03e0
        L_0x03df:
            r6 = r0
        L_0x03e0:
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r0 = r15.mListAnchors
            r0 = r0[r41]
            androidx.constraintlayout.core.SolverVariable r1 = r0.mSolverVariable
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r0.mTarget
            if (r2 == 0) goto L_0x03ec
            androidx.constraintlayout.core.SolverVariable r2 = r2.mSolverVariable
        L_0x03ec:
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r2 = r7.mListAnchors
            int r3 = r41 + 1
            r2 = r2[r3]
            androidx.constraintlayout.core.SolverVariable r2 = r2.mSolverVariable
            int r0 = r0.getMargin()
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r4 = r15.mListAnchors
            r4 = r4[r3]
            int r4 = r4.getMargin()
            if (r6 == 0) goto L_0x0419
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r5 = r6.mListAnchors
            r5 = r5[r41]
            androidx.constraintlayout.core.SolverVariable r8 = r5.mSolverVariable
            r38 = r6
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r5.mTarget
            if (r6 == 0) goto L_0x0411
            androidx.constraintlayout.core.SolverVariable r6 = r6.mSolverVariable
            goto L_0x0413
        L_0x0411:
            r6 = r22
        L_0x0413:
            r37 = r8
            r8 = r6
            r6 = r37
            goto L_0x042c
        L_0x0419:
            r38 = r6
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r5 = r14.mListAnchors
            r5 = r5[r41]
            if (r5 == 0) goto L_0x0424
            androidx.constraintlayout.core.SolverVariable r6 = r5.mSolverVariable
            goto L_0x0426
        L_0x0424:
            r6 = r22
        L_0x0426:
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r8 = r15.mListAnchors
            r8 = r8[r3]
            androidx.constraintlayout.core.SolverVariable r8 = r8.mSolverVariable
        L_0x042c:
            if (r5 == 0) goto L_0x0433
            int r5 = r5.getMargin()
            int r4 = r4 + r5
        L_0x0433:
            r18 = r4
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r4 = r7.mListAnchors
            r3 = r4[r3]
            int r3 = r3.getMargin()
            int r3 = r3 + r0
            if (r17 == 0) goto L_0x0443
            r19 = 8
            goto L_0x0445
        L_0x0443:
            r19 = 4
        L_0x0445:
            if (r1 == 0) goto L_0x0463
            if (r2 == 0) goto L_0x0463
            if (r6 == 0) goto L_0x0463
            if (r8 == 0) goto L_0x0463
            r4 = 1056964608(0x3f000000, float:0.5)
            r0 = r39
            r5 = r6
            r20 = r38
            r21 = 4
            r6 = r8
            r23 = r7
            r7 = r18
            r10 = 8
            r8 = r19
            r0.addCentering(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x046b
        L_0x0463:
            r20 = r38
            r23 = r7
            r10 = 8
            r21 = 4
        L_0x046b:
            r0 = r20
            goto L_0x0474
        L_0x046e:
            r23 = r7
            r10 = 8
            r21 = 4
        L_0x0474:
            int r1 = r15.getVisibility()
            if (r1 == r10) goto L_0x047c
            r7 = r15
            goto L_0x047e
        L_0x047c:
            r7 = r23
        L_0x047e:
            r10 = r40
            r15 = r0
            r8 = 8
            goto L_0x03c1
        L_0x0485:
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r0 = r13.mListAnchors
            r0 = r0[r41]
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r1 = r11.mListAnchors
            r1 = r1[r41]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r1.mTarget
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r2 = r14.mListAnchors
            int r3 = r41 + 1
            r10 = r2[r3]
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r2 = r12.mListAnchors
            r2 = r2[r3]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r2.mTarget
            if (r1 == 0) goto L_0x04d2
            if (r13 == r14) goto L_0x04ac
            androidx.constraintlayout.core.SolverVariable r2 = r0.mSolverVariable
            androidx.constraintlayout.core.SolverVariable r1 = r1.mSolverVariable
            int r0 = r0.getMargin()
            r15 = 5
            r9.addEquality(r2, r1, r0, r15)
            goto L_0x04d3
        L_0x04ac:
            r15 = 5
            if (r11 == 0) goto L_0x04d3
            androidx.constraintlayout.core.SolverVariable r2 = r0.mSolverVariable
            androidx.constraintlayout.core.SolverVariable r3 = r1.mSolverVariable
            int r4 = r0.getMargin()
            r5 = 1056964608(0x3f000000, float:0.5)
            androidx.constraintlayout.core.SolverVariable r6 = r10.mSolverVariable
            androidx.constraintlayout.core.SolverVariable r7 = r11.mSolverVariable
            int r8 = r10.getMargin()
            r17 = 5
            r0 = r39
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r17
            r0.addCentering(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x04d3
        L_0x04d2:
            r15 = 5
        L_0x04d3:
            if (r11 == 0) goto L_0x04e3
            if (r13 == r14) goto L_0x04e3
            androidx.constraintlayout.core.SolverVariable r0 = r10.mSolverVariable
            androidx.constraintlayout.core.SolverVariable r1 = r11.mSolverVariable
            int r2 = r10.getMargin()
            int r2 = -r2
            r9.addEquality(r0, r1, r2, r15)
        L_0x04e3:
            if (r27 != 0) goto L_0x04e7
            if (r16 == 0) goto L_0x0542
        L_0x04e7:
            if (r13 == 0) goto L_0x0542
            if (r13 == r14) goto L_0x0542
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r0 = r13.mListAnchors
            r1 = r0[r41]
            if (r14 != 0) goto L_0x04f2
            r14 = r13
        L_0x04f2:
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r2 = r14.mListAnchors
            int r3 = r41 + 1
            r2 = r2[r3]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r1.mTarget
            if (r4 == 0) goto L_0x04ff
            androidx.constraintlayout.core.SolverVariable r4 = r4.mSolverVariable
            goto L_0x0501
        L_0x04ff:
            r4 = r22
        L_0x0501:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r2.mTarget
            if (r5 == 0) goto L_0x0508
            androidx.constraintlayout.core.SolverVariable r5 = r5.mSolverVariable
            goto L_0x050a
        L_0x0508:
            r5 = r22
        L_0x050a:
            if (r12 == r14) goto L_0x051a
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r5 = r12.mListAnchors
            r5 = r5[r3]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r5.mTarget
            if (r5 == 0) goto L_0x0518
            androidx.constraintlayout.core.SolverVariable r5 = r5.mSolverVariable
            r22 = r5
        L_0x0518:
            r5 = r22
        L_0x051a:
            if (r13 != r14) goto L_0x0520
            r1 = r0[r41]
            r2 = r0[r3]
        L_0x0520:
            if (r4 == 0) goto L_0x0542
            if (r5 == 0) goto L_0x0542
            r6 = 1056964608(0x3f000000, float:0.5)
            int r7 = r1.getMargin()
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r0 = r14.mListAnchors
            r0 = r0[r3]
            int r8 = r0.getMargin()
            androidx.constraintlayout.core.SolverVariable r1 = r1.mSolverVariable
            androidx.constraintlayout.core.SolverVariable r10 = r2.mSolverVariable
            r11 = 5
            r0 = r39
            r2 = r4
            r3 = r7
            r4 = r6
            r6 = r10
            r7 = r8
            r8 = r11
            r0.addCentering(r1, r2, r3, r4, r5, r6, r7, r8)
        L_0x0542:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.Chain.applyChainConstraints(androidx.constraintlayout.core.widgets.ConstraintWidgetContainer, androidx.constraintlayout.core.LinearSystem, int, int, androidx.constraintlayout.core.widgets.ChainHead):void");
    }

    public static void applyChainConstraints(ConstraintWidgetContainer constraintWidgetContainer, LinearSystem linearSystem, ArrayList<ConstraintWidget> arrayList, int i) {
        ChainHead[] chainHeadArr;
        int i2;
        int i3;
        if (i == 0) {
            i3 = constraintWidgetContainer.mHorizontalChainsSize;
            chainHeadArr = constraintWidgetContainer.mHorizontalChainsArray;
            i2 = 0;
        } else {
            int i4 = constraintWidgetContainer.mVerticalChainsSize;
            chainHeadArr = constraintWidgetContainer.mVerticalChainsArray;
            i3 = i4;
            i2 = 2;
        }
        for (int i5 = 0; i5 < i3; i5++) {
            ChainHead chainHead = chainHeadArr[i5];
            chainHead.define();
            if (arrayList == null || arrayList.contains(chainHead.mFirst)) {
                applyChainConstraints(constraintWidgetContainer, linearSystem, i, i2, chainHead);
            }
        }
    }
}
