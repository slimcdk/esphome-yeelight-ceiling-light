package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.LinearSystem;

class Chain {
    private static final boolean DEBUG = false;

    Chain() {
    }

    static void applyChainConstraints(ConstraintWidgetContainer constraintWidgetContainer, LinearSystem linearSystem, int i) {
        ChainHead[] chainHeadArr;
        int i2;
        int i3;
        if (i == 0) {
            int i4 = constraintWidgetContainer.mHorizontalChainsSize;
            chainHeadArr = constraintWidgetContainer.mHorizontalChainsArray;
            i2 = i4;
            i3 = 0;
        } else {
            i3 = 2;
            i2 = constraintWidgetContainer.mVerticalChainsSize;
            chainHeadArr = constraintWidgetContainer.mVerticalChainsArray;
        }
        for (int i5 = 0; i5 < i2; i5++) {
            ChainHead chainHead = chainHeadArr[i5];
            chainHead.define();
            if (!constraintWidgetContainer.optimizeFor(4) || !Optimizer.applyChainOptimized(constraintWidgetContainer, linearSystem, i, i3, chainHead)) {
                applyChainConstraints(constraintWidgetContainer, linearSystem, i, i3, chainHead);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v0, resolved type: androidx.constraintlayout.solver.SolverVariable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v1, resolved type: androidx.constraintlayout.solver.SolverVariable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v2, resolved type: androidx.constraintlayout.solver.widgets.ConstraintWidget} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v3, resolved type: androidx.constraintlayout.solver.SolverVariable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v4, resolved type: androidx.constraintlayout.solver.widgets.ConstraintWidget} */
    /* JADX WARNING: type inference failed for: r4v11, types: [androidx.constraintlayout.solver.SolverVariable] */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0035, code lost:
        if (r2.mHorizontalChainStyle == 2) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0048, code lost:
        if (r2.mVerticalChainStyle == 2) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004c, code lost:
        r5 = false;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x02ef  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x0301  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x0316  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x031d  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x0330  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x033b  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x0346  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x034a  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x034d  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x036b  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x0382  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x0385  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x038b  */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x03ed  */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x03f6  */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x0402  */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x0405  */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x0457  */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x048c  */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x04b1  */
    /* JADX WARNING: Removed duplicated region for block: B:268:0x04b4  */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x04ba  */
    /* JADX WARNING: Removed duplicated region for block: B:272:0x04bd  */
    /* JADX WARNING: Removed duplicated region for block: B:274:0x04c1  */
    /* JADX WARNING: Removed duplicated region for block: B:278:0x04d0  */
    /* JADX WARNING: Removed duplicated region for block: B:280:0x04d3  */
    /* JADX WARNING: Removed duplicated region for block: B:295:0x036c A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x017e  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0182  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x018c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void applyChainConstraints(androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r37, androidx.constraintlayout.solver.LinearSystem r38, int r39, int r40, androidx.constraintlayout.solver.widgets.ChainHead r41) {
        /*
            r0 = r37
            r9 = r38
            r1 = r41
            androidx.constraintlayout.solver.widgets.ConstraintWidget r10 = r1.mFirst
            androidx.constraintlayout.solver.widgets.ConstraintWidget r11 = r1.mLast
            androidx.constraintlayout.solver.widgets.ConstraintWidget r12 = r1.mFirstVisibleWidget
            androidx.constraintlayout.solver.widgets.ConstraintWidget r13 = r1.mLastVisibleWidget
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = r1.mHead
            float r3 = r1.mTotalWeight
            androidx.constraintlayout.solver.widgets.ConstraintWidget r4 = r1.mFirstMatchConstraintWidget
            androidx.constraintlayout.solver.widgets.ConstraintWidget r4 = r1.mLastMatchConstraintWidget
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r4 = r0.mListDimensionBehaviors
            r4 = r4[r39]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r5 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            r7 = 1
            if (r4 != r5) goto L_0x0021
            r4 = 1
            goto L_0x0022
        L_0x0021:
            r4 = 0
        L_0x0022:
            r5 = 2
            if (r39 != 0) goto L_0x0038
            int r8 = r2.mHorizontalChainStyle
            if (r8 != 0) goto L_0x002b
            r8 = 1
            goto L_0x002c
        L_0x002b:
            r8 = 0
        L_0x002c:
            int r14 = r2.mHorizontalChainStyle
            if (r14 != r7) goto L_0x0032
            r14 = 1
            goto L_0x0033
        L_0x0032:
            r14 = 0
        L_0x0033:
            int r15 = r2.mHorizontalChainStyle
            if (r15 != r5) goto L_0x004c
            goto L_0x004a
        L_0x0038:
            int r8 = r2.mVerticalChainStyle
            if (r8 != 0) goto L_0x003e
            r8 = 1
            goto L_0x003f
        L_0x003e:
            r8 = 0
        L_0x003f:
            int r14 = r2.mVerticalChainStyle
            if (r14 != r7) goto L_0x0045
            r14 = 1
            goto L_0x0046
        L_0x0045:
            r14 = 0
        L_0x0046:
            int r15 = r2.mVerticalChainStyle
            if (r15 != r5) goto L_0x004c
        L_0x004a:
            r5 = 1
            goto L_0x004d
        L_0x004c:
            r5 = 0
        L_0x004d:
            r7 = r10
            r15 = r14
            r14 = r8
            r8 = 0
        L_0x0051:
            r21 = 0
            if (r8 != 0) goto L_0x0126
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r6 = r7.mListAnchors
            r6 = r6[r40]
            if (r4 != 0) goto L_0x0061
            if (r5 == 0) goto L_0x005e
            goto L_0x0061
        L_0x005e:
            r23 = 4
            goto L_0x0063
        L_0x0061:
            r23 = 1
        L_0x0063:
            int r24 = r6.getMargin()
            r25 = r3
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r6.mTarget
            if (r3 == 0) goto L_0x0075
            if (r7 == r10) goto L_0x0075
            int r3 = r3.getMargin()
            int r24 = r24 + r3
        L_0x0075:
            r3 = r24
            if (r5 == 0) goto L_0x0083
            if (r7 == r10) goto L_0x0083
            if (r7 == r12) goto L_0x0083
            r24 = r8
            r23 = r15
            r8 = 6
            goto L_0x0093
        L_0x0083:
            if (r14 == 0) goto L_0x008d
            if (r4 == 0) goto L_0x008d
            r24 = r8
            r23 = r15
            r8 = 4
            goto L_0x0093
        L_0x008d:
            r24 = r8
            r8 = r23
            r23 = r15
        L_0x0093:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r15 = r6.mTarget
            if (r15 == 0) goto L_0x00bc
            if (r7 != r12) goto L_0x00a6
            r26 = r14
            androidx.constraintlayout.solver.SolverVariable r14 = r6.mSolverVariable
            androidx.constraintlayout.solver.SolverVariable r15 = r15.mSolverVariable
            r27 = r2
            r2 = 5
            r9.addGreaterThan(r14, r15, r3, r2)
            goto L_0x00b2
        L_0x00a6:
            r27 = r2
            r26 = r14
            androidx.constraintlayout.solver.SolverVariable r2 = r6.mSolverVariable
            androidx.constraintlayout.solver.SolverVariable r14 = r15.mSolverVariable
            r15 = 6
            r9.addGreaterThan(r2, r14, r3, r15)
        L_0x00b2:
            androidx.constraintlayout.solver.SolverVariable r2 = r6.mSolverVariable
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r6 = r6.mTarget
            androidx.constraintlayout.solver.SolverVariable r6 = r6.mSolverVariable
            r9.addEquality(r2, r6, r3, r8)
            goto L_0x00c0
        L_0x00bc:
            r27 = r2
            r26 = r14
        L_0x00c0:
            if (r4 == 0) goto L_0x00f5
            int r2 = r7.getVisibility()
            r3 = 8
            if (r2 == r3) goto L_0x00e4
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r2 = r7.mListDimensionBehaviors
            r2 = r2[r39]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r2 != r3) goto L_0x00e4
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r2 = r7.mListAnchors
            int r3 = r40 + 1
            r3 = r2[r3]
            androidx.constraintlayout.solver.SolverVariable r3 = r3.mSolverVariable
            r2 = r2[r40]
            androidx.constraintlayout.solver.SolverVariable r2 = r2.mSolverVariable
            r6 = 5
            r8 = 0
            r9.addGreaterThan(r3, r2, r8, r6)
            goto L_0x00e5
        L_0x00e4:
            r8 = 0
        L_0x00e5:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r2 = r7.mListAnchors
            r2 = r2[r40]
            androidx.constraintlayout.solver.SolverVariable r2 = r2.mSolverVariable
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r3 = r0.mListAnchors
            r3 = r3[r40]
            androidx.constraintlayout.solver.SolverVariable r3 = r3.mSolverVariable
            r6 = 6
            r9.addGreaterThan(r2, r3, r8, r6)
        L_0x00f5:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r2 = r7.mListAnchors
            int r3 = r40 + 1
            r2 = r2[r3]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r2.mTarget
            if (r2 == 0) goto L_0x0114
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = r2.mOwner
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r3 = r2.mListAnchors
            r6 = r3[r40]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r6 = r6.mTarget
            if (r6 == 0) goto L_0x0114
            r3 = r3[r40]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r3.mTarget
            androidx.constraintlayout.solver.widgets.ConstraintWidget r3 = r3.mOwner
            if (r3 == r7) goto L_0x0112
            goto L_0x0114
        L_0x0112:
            r21 = r2
        L_0x0114:
            if (r21 == 0) goto L_0x011b
            r7 = r21
            r8 = r24
            goto L_0x011c
        L_0x011b:
            r8 = 1
        L_0x011c:
            r15 = r23
            r3 = r25
            r14 = r26
            r2 = r27
            goto L_0x0051
        L_0x0126:
            r27 = r2
            r25 = r3
            r26 = r14
            r23 = r15
            if (r13 == 0) goto L_0x0150
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r2 = r11.mListAnchors
            int r3 = r40 + 1
            r6 = r2[r3]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r6 = r6.mTarget
            if (r6 == 0) goto L_0x0150
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r6 = r13.mListAnchors
            r6 = r6[r3]
            androidx.constraintlayout.solver.SolverVariable r7 = r6.mSolverVariable
            r2 = r2[r3]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r2.mTarget
            androidx.constraintlayout.solver.SolverVariable r2 = r2.mSolverVariable
            int r3 = r6.getMargin()
            int r3 = -r3
            r6 = 5
            r9.addLowerThan(r7, r2, r3, r6)
            goto L_0x0151
        L_0x0150:
            r6 = 5
        L_0x0151:
            if (r4 == 0) goto L_0x016b
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r0 = r0.mListAnchors
            int r2 = r40 + 1
            r0 = r0[r2]
            androidx.constraintlayout.solver.SolverVariable r0 = r0.mSolverVariable
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r3 = r11.mListAnchors
            r4 = r3[r2]
            androidx.constraintlayout.solver.SolverVariable r4 = r4.mSolverVariable
            r2 = r3[r2]
            int r2 = r2.getMargin()
            r3 = 6
            r9.addGreaterThan(r0, r4, r2, r3)
        L_0x016b:
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.ConstraintWidget> r0 = r1.mWeightedMatchConstraintsWidgets
            if (r0 == 0) goto L_0x021a
            int r2 = r0.size()
            r3 = 1
            if (r2 <= r3) goto L_0x021a
            boolean r4 = r1.mHasUndefinedWeights
            if (r4 == 0) goto L_0x0182
            boolean r4 = r1.mHasComplexMatchWeights
            if (r4 != 0) goto L_0x0182
            int r4 = r1.mWidgetsMatchCount
            float r4 = (float) r4
            goto L_0x0184
        L_0x0182:
            r4 = r25
        L_0x0184:
            r7 = 0
            r14 = r21
            r8 = 0
            r29 = 0
        L_0x018a:
            if (r8 >= r2) goto L_0x021a
            java.lang.Object r15 = r0.get(r8)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r15 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r15
            float[] r3 = r15.mWeight
            r3 = r3[r39]
            int r19 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r19 >= 0) goto L_0x01b6
            boolean r3 = r1.mHasComplexMatchWeights
            if (r3 == 0) goto L_0x01b1
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r3 = r15.mListAnchors
            int r15 = r40 + 1
            r15 = r3[r15]
            androidx.constraintlayout.solver.SolverVariable r15 = r15.mSolverVariable
            r3 = r3[r40]
            androidx.constraintlayout.solver.SolverVariable r3 = r3.mSolverVariable
            r6 = 4
            r7 = 0
            r9.addEquality(r15, r3, r7, r6)
            r6 = 6
            goto L_0x01cc
        L_0x01b1:
            r6 = 4
            r3 = 1065353216(0x3f800000, float:1.0)
            r7 = 0
            goto L_0x01b7
        L_0x01b6:
            r6 = 4
        L_0x01b7:
            int r20 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r20 != 0) goto L_0x01d1
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r3 = r15.mListAnchors
            int r15 = r40 + 1
            r15 = r3[r15]
            androidx.constraintlayout.solver.SolverVariable r15 = r15.mSolverVariable
            r3 = r3[r40]
            androidx.constraintlayout.solver.SolverVariable r3 = r3.mSolverVariable
            r6 = 6
            r7 = 0
            r9.addEquality(r15, r3, r7, r6)
        L_0x01cc:
            r25 = r0
            r17 = r2
            goto L_0x020f
        L_0x01d1:
            r6 = 6
            r7 = 0
            if (r14 == 0) goto L_0x0208
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r14 = r14.mListAnchors
            r6 = r14[r40]
            androidx.constraintlayout.solver.SolverVariable r6 = r6.mSolverVariable
            int r17 = r40 + 1
            r14 = r14[r17]
            androidx.constraintlayout.solver.SolverVariable r14 = r14.mSolverVariable
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r7 = r15.mListAnchors
            r25 = r0
            r0 = r7[r40]
            androidx.constraintlayout.solver.SolverVariable r0 = r0.mSolverVariable
            r7 = r7[r17]
            androidx.constraintlayout.solver.SolverVariable r7 = r7.mSolverVariable
            r17 = r2
            androidx.constraintlayout.solver.ArrayRow r2 = r38.createRow()
            r28 = r2
            r30 = r4
            r31 = r3
            r32 = r6
            r33 = r14
            r34 = r0
            r35 = r7
            r28.createRowEqualMatchDimensions(r29, r30, r31, r32, r33, r34, r35)
            r9.addConstraint(r2)
            goto L_0x020c
        L_0x0208:
            r25 = r0
            r17 = r2
        L_0x020c:
            r29 = r3
            r14 = r15
        L_0x020f:
            int r8 = r8 + 1
            r2 = r17
            r0 = r25
            r3 = 1
            r6 = 5
            r7 = 0
            goto L_0x018a
        L_0x021a:
            if (r12 == 0) goto L_0x027a
            if (r12 == r13) goto L_0x0220
            if (r5 == 0) goto L_0x027a
        L_0x0220:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r0 = r10.mListAnchors
            r1 = r0[r40]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r2 = r11.mListAnchors
            int r3 = r40 + 1
            r2 = r2[r3]
            r4 = r0[r40]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r4.mTarget
            if (r4 == 0) goto L_0x0238
            r0 = r0[r40]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r0.mTarget
            androidx.constraintlayout.solver.SolverVariable r0 = r0.mSolverVariable
            r4 = r0
            goto L_0x023a
        L_0x0238:
            r4 = r21
        L_0x023a:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r0 = r11.mListAnchors
            r5 = r0[r3]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r5 = r5.mTarget
            if (r5 == 0) goto L_0x024a
            r0 = r0[r3]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r0.mTarget
            androidx.constraintlayout.solver.SolverVariable r0 = r0.mSolverVariable
            r5 = r0
            goto L_0x024c
        L_0x024a:
            r5 = r21
        L_0x024c:
            if (r12 != r13) goto L_0x0254
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r0 = r12.mListAnchors
            r1 = r0[r40]
            r2 = r0[r3]
        L_0x0254:
            if (r4 == 0) goto L_0x049d
            if (r5 == 0) goto L_0x049d
            r0 = r27
            if (r39 != 0) goto L_0x025f
            float r0 = r0.mHorizontalBiasPercent
            goto L_0x0261
        L_0x025f:
            float r0 = r0.mVerticalBiasPercent
        L_0x0261:
            r6 = r0
            int r3 = r1.getMargin()
            int r7 = r2.getMargin()
            androidx.constraintlayout.solver.SolverVariable r1 = r1.mSolverVariable
            androidx.constraintlayout.solver.SolverVariable r8 = r2.mSolverVariable
            r10 = 5
            r0 = r38
            r2 = r4
            r4 = r6
            r6 = r8
            r8 = r10
            r0.addCentering(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x049d
        L_0x027a:
            if (r26 == 0) goto L_0x0370
            if (r12 == 0) goto L_0x0370
            int r0 = r1.mWidgetsMatchCount
            if (r0 <= 0) goto L_0x0289
            int r1 = r1.mWidgetsCount
            if (r1 != r0) goto L_0x0289
            r16 = 1
            goto L_0x028b
        L_0x0289:
            r16 = 0
        L_0x028b:
            r14 = r12
            r15 = r14
        L_0x028d:
            if (r14 == 0) goto L_0x049d
            androidx.constraintlayout.solver.widgets.ConstraintWidget[] r0 = r14.mNextChainWidget
            r0 = r0[r39]
            r8 = r0
        L_0x0294:
            if (r8 == 0) goto L_0x02a3
            int r0 = r8.getVisibility()
            r6 = 8
            if (r0 != r6) goto L_0x02a5
            androidx.constraintlayout.solver.widgets.ConstraintWidget[] r0 = r8.mNextChainWidget
            r8 = r0[r39]
            goto L_0x0294
        L_0x02a3:
            r6 = 8
        L_0x02a5:
            if (r8 != 0) goto L_0x02b2
            if (r14 != r13) goto L_0x02aa
            goto L_0x02b2
        L_0x02aa:
            r17 = r8
            r18 = 4
            r20 = 6
            goto L_0x0363
        L_0x02b2:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r0 = r14.mListAnchors
            r0 = r0[r40]
            androidx.constraintlayout.solver.SolverVariable r1 = r0.mSolverVariable
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r0.mTarget
            if (r2 == 0) goto L_0x02bf
            androidx.constraintlayout.solver.SolverVariable r2 = r2.mSolverVariable
            goto L_0x02c1
        L_0x02bf:
            r2 = r21
        L_0x02c1:
            if (r15 == r14) goto L_0x02cc
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r2 = r15.mListAnchors
            int r3 = r40 + 1
            r2 = r2[r3]
        L_0x02c9:
            androidx.constraintlayout.solver.SolverVariable r2 = r2.mSolverVariable
            goto L_0x02df
        L_0x02cc:
            if (r14 != r12) goto L_0x02df
            if (r15 != r14) goto L_0x02df
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r2 = r10.mListAnchors
            r3 = r2[r40]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r3.mTarget
            if (r3 == 0) goto L_0x02dd
            r2 = r2[r40]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r2.mTarget
            goto L_0x02c9
        L_0x02dd:
            r2 = r21
        L_0x02df:
            int r0 = r0.getMargin()
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r3 = r14.mListAnchors
            int r4 = r40 + 1
            r3 = r3[r4]
            int r3 = r3.getMargin()
            if (r8 == 0) goto L_0x0301
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r5 = r8.mListAnchors
            r5 = r5[r40]
            androidx.constraintlayout.solver.SolverVariable r7 = r5.mSolverVariable
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r6 = r14.mListAnchors
            r6 = r6[r4]
            androidx.constraintlayout.solver.SolverVariable r6 = r6.mSolverVariable
            r36 = r7
            r7 = r6
            r6 = r36
            goto L_0x0314
        L_0x0301:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r5 = r11.mListAnchors
            r5 = r5[r4]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r5 = r5.mTarget
            if (r5 == 0) goto L_0x030c
            androidx.constraintlayout.solver.SolverVariable r6 = r5.mSolverVariable
            goto L_0x030e
        L_0x030c:
            r6 = r21
        L_0x030e:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r7 = r14.mListAnchors
            r7 = r7[r4]
            androidx.constraintlayout.solver.SolverVariable r7 = r7.mSolverVariable
        L_0x0314:
            if (r5 == 0) goto L_0x031b
            int r5 = r5.getMargin()
            int r3 = r3 + r5
        L_0x031b:
            if (r15 == 0) goto L_0x0326
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r5 = r15.mListAnchors
            r5 = r5[r4]
            int r5 = r5.getMargin()
            int r0 = r0 + r5
        L_0x0326:
            if (r1 == 0) goto L_0x02aa
            if (r2 == 0) goto L_0x02aa
            if (r6 == 0) goto L_0x02aa
            if (r7 == 0) goto L_0x02aa
            if (r14 != r12) goto L_0x0338
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r0 = r12.mListAnchors
            r0 = r0[r40]
            int r0 = r0.getMargin()
        L_0x0338:
            r5 = r0
            if (r14 != r13) goto L_0x0346
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r0 = r13.mListAnchors
            r0 = r0[r4]
            int r0 = r0.getMargin()
            r17 = r0
            goto L_0x0348
        L_0x0346:
            r17 = r3
        L_0x0348:
            if (r16 == 0) goto L_0x034d
            r19 = 6
            goto L_0x034f
        L_0x034d:
            r19 = 4
        L_0x034f:
            r4 = 1056964608(0x3f000000, float:0.5)
            r0 = r38
            r3 = r5
            r5 = r6
            r18 = 4
            r20 = 6
            r6 = r7
            r7 = r17
            r17 = r8
            r8 = r19
            r0.addCentering(r1, r2, r3, r4, r5, r6, r7, r8)
        L_0x0363:
            int r0 = r14.getVisibility()
            r8 = 8
            if (r0 == r8) goto L_0x036c
            r15 = r14
        L_0x036c:
            r14 = r17
            goto L_0x028d
        L_0x0370:
            r8 = 8
            r18 = 4
            r20 = 6
            if (r23 == 0) goto L_0x049d
            if (r12 == 0) goto L_0x049d
            int r0 = r1.mWidgetsMatchCount
            if (r0 <= 0) goto L_0x0385
            int r1 = r1.mWidgetsCount
            if (r1 != r0) goto L_0x0385
            r16 = 1
            goto L_0x0387
        L_0x0385:
            r16 = 0
        L_0x0387:
            r14 = r12
            r15 = r14
        L_0x0389:
            if (r14 == 0) goto L_0x043f
            androidx.constraintlayout.solver.widgets.ConstraintWidget[] r0 = r14.mNextChainWidget
            r0 = r0[r39]
        L_0x038f:
            if (r0 == 0) goto L_0x039c
            int r1 = r0.getVisibility()
            if (r1 != r8) goto L_0x039c
            androidx.constraintlayout.solver.widgets.ConstraintWidget[] r0 = r0.mNextChainWidget
            r0 = r0[r39]
            goto L_0x038f
        L_0x039c:
            if (r14 == r12) goto L_0x042c
            if (r14 == r13) goto L_0x042c
            if (r0 == 0) goto L_0x042c
            if (r0 != r13) goto L_0x03a7
            r7 = r21
            goto L_0x03a8
        L_0x03a7:
            r7 = r0
        L_0x03a8:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r0 = r14.mListAnchors
            r0 = r0[r40]
            androidx.constraintlayout.solver.SolverVariable r1 = r0.mSolverVariable
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r0.mTarget
            if (r2 == 0) goto L_0x03b4
            androidx.constraintlayout.solver.SolverVariable r2 = r2.mSolverVariable
        L_0x03b4:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r2 = r15.mListAnchors
            int r3 = r40 + 1
            r2 = r2[r3]
            androidx.constraintlayout.solver.SolverVariable r2 = r2.mSolverVariable
            int r0 = r0.getMargin()
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r4 = r14.mListAnchors
            r4 = r4[r3]
            int r4 = r4.getMargin()
            if (r7 == 0) goto L_0x03d8
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r5 = r7.mListAnchors
            r5 = r5[r40]
            androidx.constraintlayout.solver.SolverVariable r6 = r5.mSolverVariable
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r8 = r5.mTarget
            if (r8 == 0) goto L_0x03d5
            goto L_0x03e9
        L_0x03d5:
            r8 = r21
            goto L_0x03eb
        L_0x03d8:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r5 = r14.mListAnchors
            r5 = r5[r3]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r5 = r5.mTarget
            if (r5 == 0) goto L_0x03e3
            androidx.constraintlayout.solver.SolverVariable r6 = r5.mSolverVariable
            goto L_0x03e5
        L_0x03e3:
            r6 = r21
        L_0x03e5:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r8 = r14.mListAnchors
            r8 = r8[r3]
        L_0x03e9:
            androidx.constraintlayout.solver.SolverVariable r8 = r8.mSolverVariable
        L_0x03eb:
            if (r5 == 0) goto L_0x03f2
            int r5 = r5.getMargin()
            int r4 = r4 + r5
        L_0x03f2:
            r17 = r4
            if (r15 == 0) goto L_0x03ff
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r4 = r15.mListAnchors
            r3 = r4[r3]
            int r3 = r3.getMargin()
            int r0 = r0 + r3
        L_0x03ff:
            r3 = r0
            if (r16 == 0) goto L_0x0405
            r22 = 6
            goto L_0x0407
        L_0x0405:
            r22 = 4
        L_0x0407:
            if (r1 == 0) goto L_0x0423
            if (r2 == 0) goto L_0x0423
            if (r6 == 0) goto L_0x0423
            if (r8 == 0) goto L_0x0423
            r4 = 1056964608(0x3f000000, float:0.5)
            r0 = r38
            r5 = r6
            r6 = r8
            r19 = r7
            r7 = r17
            r17 = r15
            r15 = 8
            r8 = r22
            r0.addCentering(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x0429
        L_0x0423:
            r19 = r7
            r17 = r15
            r15 = 8
        L_0x0429:
            r0 = r19
            goto L_0x0430
        L_0x042c:
            r17 = r15
            r15 = 8
        L_0x0430:
            int r1 = r14.getVisibility()
            if (r1 == r15) goto L_0x0437
            goto L_0x0439
        L_0x0437:
            r14 = r17
        L_0x0439:
            r15 = r14
            r8 = 8
            r14 = r0
            goto L_0x0389
        L_0x043f:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r0 = r12.mListAnchors
            r0 = r0[r40]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r1 = r10.mListAnchors
            r1 = r1[r40]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r1.mTarget
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r2 = r13.mListAnchors
            int r3 = r40 + 1
            r10 = r2[r3]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r2 = r11.mListAnchors
            r2 = r2[r3]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r14 = r2.mTarget
            if (r1 == 0) goto L_0x048c
            if (r12 == r13) goto L_0x0466
            androidx.constraintlayout.solver.SolverVariable r2 = r0.mSolverVariable
            androidx.constraintlayout.solver.SolverVariable r1 = r1.mSolverVariable
            int r0 = r0.getMargin()
            r15 = 5
            r9.addEquality(r2, r1, r0, r15)
            goto L_0x048d
        L_0x0466:
            r15 = 5
            if (r14 == 0) goto L_0x048d
            androidx.constraintlayout.solver.SolverVariable r2 = r0.mSolverVariable
            androidx.constraintlayout.solver.SolverVariable r3 = r1.mSolverVariable
            int r4 = r0.getMargin()
            r5 = 1056964608(0x3f000000, float:0.5)
            androidx.constraintlayout.solver.SolverVariable r6 = r10.mSolverVariable
            androidx.constraintlayout.solver.SolverVariable r7 = r14.mSolverVariable
            int r8 = r10.getMargin()
            r16 = 5
            r0 = r38
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r16
            r0.addCentering(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x048d
        L_0x048c:
            r15 = 5
        L_0x048d:
            if (r14 == 0) goto L_0x049d
            if (r12 == r13) goto L_0x049d
            androidx.constraintlayout.solver.SolverVariable r0 = r10.mSolverVariable
            androidx.constraintlayout.solver.SolverVariable r1 = r14.mSolverVariable
            int r2 = r10.getMargin()
            int r2 = -r2
            r9.addEquality(r0, r1, r2, r15)
        L_0x049d:
            if (r26 != 0) goto L_0x04a1
            if (r23 == 0) goto L_0x0503
        L_0x04a1:
            if (r12 == 0) goto L_0x0503
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r0 = r12.mListAnchors
            r0 = r0[r40]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r1 = r13.mListAnchors
            int r2 = r40 + 1
            r1 = r1[r2]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r0.mTarget
            if (r3 == 0) goto L_0x04b4
            androidx.constraintlayout.solver.SolverVariable r3 = r3.mSolverVariable
            goto L_0x04b6
        L_0x04b4:
            r3 = r21
        L_0x04b6:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r1.mTarget
            if (r4 == 0) goto L_0x04bd
            androidx.constraintlayout.solver.SolverVariable r4 = r4.mSolverVariable
            goto L_0x04bf
        L_0x04bd:
            r4 = r21
        L_0x04bf:
            if (r11 == r13) goto L_0x04d0
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r4 = r11.mListAnchors
            r4 = r4[r2]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r4.mTarget
            if (r4 == 0) goto L_0x04cd
            androidx.constraintlayout.solver.SolverVariable r4 = r4.mSolverVariable
            r21 = r4
        L_0x04cd:
            r5 = r21
            goto L_0x04d1
        L_0x04d0:
            r5 = r4
        L_0x04d1:
            if (r12 != r13) goto L_0x04de
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r0 = r12.mListAnchors
            r1 = r0[r40]
            r0 = r0[r2]
            r36 = r1
            r1 = r0
            r0 = r36
        L_0x04de:
            if (r3 == 0) goto L_0x0503
            if (r5 == 0) goto L_0x0503
            r4 = 1056964608(0x3f000000, float:0.5)
            int r6 = r0.getMargin()
            if (r13 != 0) goto L_0x04eb
            goto L_0x04ec
        L_0x04eb:
            r11 = r13
        L_0x04ec:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r7 = r11.mListAnchors
            r2 = r7[r2]
            int r7 = r2.getMargin()
            androidx.constraintlayout.solver.SolverVariable r2 = r0.mSolverVariable
            androidx.constraintlayout.solver.SolverVariable r8 = r1.mSolverVariable
            r10 = 5
            r0 = r38
            r1 = r2
            r2 = r3
            r3 = r6
            r6 = r8
            r8 = r10
            r0.addCentering(r1, r2, r3, r4, r5, r6, r7, r8)
        L_0x0503:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.Chain.applyChainConstraints(androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer, androidx.constraintlayout.solver.LinearSystem, int, int, androidx.constraintlayout.solver.widgets.ChainHead):void");
    }
}
