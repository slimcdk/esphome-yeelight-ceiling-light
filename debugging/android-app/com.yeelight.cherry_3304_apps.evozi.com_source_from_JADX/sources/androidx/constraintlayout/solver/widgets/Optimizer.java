package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.LinearSystem;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;

public class Optimizer {
    static final int FLAG_CHAIN_DANGLING = 1;
    static final int FLAG_RECOMPUTE_BOUNDS = 2;
    static final int FLAG_USE_OPTIMIZE = 0;
    public static final int OPTIMIZATION_BARRIER = 2;
    public static final int OPTIMIZATION_CHAIN = 4;
    public static final int OPTIMIZATION_DIMENSIONS = 8;
    public static final int OPTIMIZATION_DIRECT = 1;
    public static final int OPTIMIZATION_GROUPS = 32;
    public static final int OPTIMIZATION_NONE = 0;
    public static final int OPTIMIZATION_RATIO = 16;
    public static final int OPTIMIZATION_STANDARD = 7;
    static boolean[] flags = new boolean[3];

    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01e0, code lost:
        if (r6 != false) goto L_0x01c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0070, code lost:
        if (r6 != false) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0080, code lost:
        if (r6 != false) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x008f, code lost:
        if (r6 != false) goto L_0x012e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00e9, code lost:
        if (r6 != false) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x010f, code lost:
        if (r6 != false) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01c4, code lost:
        if (r6 != false) goto L_0x01c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01cf, code lost:
        r4.dependsOn(r2, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void analyze(int r16, androidx.constraintlayout.solver.widgets.ConstraintWidget r17) {
        /*
            r0 = r17
            r17.updateResolutionNodes()
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r0.mLeft
            androidx.constraintlayout.solver.widgets.ResolutionAnchor r1 = r1.getResolutionNode()
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r0.mTop
            androidx.constraintlayout.solver.widgets.ResolutionAnchor r2 = r2.getResolutionNode()
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r0.mRight
            androidx.constraintlayout.solver.widgets.ResolutionAnchor r3 = r3.getResolutionNode()
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r0.mBottom
            androidx.constraintlayout.solver.widgets.ResolutionAnchor r4 = r4.getResolutionNode()
            r5 = 8
            r6 = r16 & 8
            r7 = 0
            r8 = 1
            if (r6 != r5) goto L_0x0027
            r6 = 1
            goto L_0x0028
        L_0x0027:
            r6 = 0
        L_0x0028:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r9 = r0.mListDimensionBehaviors
            r9 = r9[r7]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r10 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r9 != r10) goto L_0x0038
            boolean r9 = optimizableMatchConstraint(r0, r7)
            if (r9 == 0) goto L_0x0038
            r9 = 1
            goto L_0x0039
        L_0x0038:
            r9 = 0
        L_0x0039:
            int r10 = r1.type
            r11 = 3
            r12 = 4
            r13 = 0
            r14 = -1
            r15 = 2
            if (r10 == r12) goto L_0x0181
            int r10 = r3.type
            if (r10 == r12) goto L_0x0181
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r10 = r0.mListDimensionBehaviors
            r10 = r10[r7]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r10 == r7) goto L_0x00d7
            if (r9 == 0) goto L_0x0058
            int r7 = r17.getVisibility()
            if (r7 != r5) goto L_0x0058
            goto L_0x00d7
        L_0x0058:
            if (r9 == 0) goto L_0x0181
            int r7 = r17.getWidth()
            r1.setType(r8)
            r3.setType(r8)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r0.mLeft
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r9.mTarget
            if (r9 != 0) goto L_0x0074
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r0.mRight
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r9.mTarget
            if (r9 != 0) goto L_0x0074
            if (r6 == 0) goto L_0x00f8
            goto L_0x00eb
        L_0x0074:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r0.mLeft
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r9.mTarget
            if (r9 == 0) goto L_0x0083
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r0.mRight
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r9.mTarget
            if (r9 != 0) goto L_0x0083
            if (r6 == 0) goto L_0x00f8
            goto L_0x00eb
        L_0x0083:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r0.mLeft
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r9.mTarget
            if (r9 != 0) goto L_0x0093
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r0.mRight
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r9.mTarget
            if (r9 == 0) goto L_0x0093
            if (r6 == 0) goto L_0x013a
            goto L_0x012e
        L_0x0093:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r0.mLeft
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r9.mTarget
            if (r9 == 0) goto L_0x0181
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r0.mRight
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r9.mTarget
            if (r9 == 0) goto L_0x0181
            if (r6 == 0) goto L_0x00af
            androidx.constraintlayout.solver.widgets.ResolutionDimension r9 = r17.getResolutionWidth()
            r9.addDependent(r1)
            androidx.constraintlayout.solver.widgets.ResolutionDimension r9 = r17.getResolutionWidth()
            r9.addDependent(r3)
        L_0x00af:
            float r9 = r0.mDimensionRatio
            int r9 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r9 != 0) goto L_0x00c3
            r1.setType(r11)
            r3.setType(r11)
            r1.setOpposite(r3, r13)
            r3.setOpposite(r1, r13)
            goto L_0x0181
        L_0x00c3:
            r1.setType(r15)
            r3.setType(r15)
            int r9 = -r7
            float r9 = (float) r9
            r1.setOpposite(r3, r9)
            float r9 = (float) r7
            r3.setOpposite(r1, r9)
            r0.setWidth(r7)
            goto L_0x0181
        L_0x00d7:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r7 = r0.mLeft
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r7 = r7.mTarget
            if (r7 != 0) goto L_0x00fd
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r7 = r0.mRight
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r7 = r7.mTarget
            if (r7 != 0) goto L_0x00fd
            r1.setType(r8)
            r3.setType(r8)
            if (r6 == 0) goto L_0x00f4
        L_0x00eb:
            androidx.constraintlayout.solver.widgets.ResolutionDimension r7 = r17.getResolutionWidth()
            r3.dependsOn((androidx.constraintlayout.solver.widgets.ResolutionAnchor) r1, (int) r8, (androidx.constraintlayout.solver.widgets.ResolutionDimension) r7)
            goto L_0x0181
        L_0x00f4:
            int r7 = r17.getWidth()
        L_0x00f8:
            r3.dependsOn(r1, r7)
            goto L_0x0181
        L_0x00fd:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r7 = r0.mLeft
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r7 = r7.mTarget
            if (r7 == 0) goto L_0x0112
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r7 = r0.mRight
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r7 = r7.mTarget
            if (r7 != 0) goto L_0x0112
            r1.setType(r8)
            r3.setType(r8)
            if (r6 == 0) goto L_0x00f4
            goto L_0x00eb
        L_0x0112:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r7 = r0.mLeft
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r7 = r7.mTarget
            if (r7 != 0) goto L_0x013f
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r7 = r0.mRight
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r7 = r7.mTarget
            if (r7 == 0) goto L_0x013f
            r1.setType(r8)
            r3.setType(r8)
            int r7 = r17.getWidth()
            int r7 = -r7
            r1.dependsOn(r3, r7)
            if (r6 == 0) goto L_0x0136
        L_0x012e:
            androidx.constraintlayout.solver.widgets.ResolutionDimension r7 = r17.getResolutionWidth()
            r1.dependsOn((androidx.constraintlayout.solver.widgets.ResolutionAnchor) r3, (int) r14, (androidx.constraintlayout.solver.widgets.ResolutionDimension) r7)
            goto L_0x0181
        L_0x0136:
            int r7 = r17.getWidth()
        L_0x013a:
            int r7 = -r7
            r1.dependsOn(r3, r7)
            goto L_0x0181
        L_0x013f:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r7 = r0.mLeft
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r7 = r7.mTarget
            if (r7 == 0) goto L_0x0181
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r7 = r0.mRight
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r7 = r7.mTarget
            if (r7 == 0) goto L_0x0181
            r1.setType(r15)
            r3.setType(r15)
            if (r6 == 0) goto L_0x0170
            androidx.constraintlayout.solver.widgets.ResolutionDimension r7 = r17.getResolutionWidth()
            r7.addDependent(r1)
            androidx.constraintlayout.solver.widgets.ResolutionDimension r7 = r17.getResolutionWidth()
            r7.addDependent(r3)
            androidx.constraintlayout.solver.widgets.ResolutionDimension r7 = r17.getResolutionWidth()
            r1.setOpposite(r3, r14, r7)
            androidx.constraintlayout.solver.widgets.ResolutionDimension r7 = r17.getResolutionWidth()
            r3.setOpposite(r1, r8, r7)
            goto L_0x0181
        L_0x0170:
            int r7 = r17.getWidth()
            int r7 = -r7
            float r7 = (float) r7
            r1.setOpposite(r3, r7)
            int r7 = r17.getWidth()
            float r7 = (float) r7
            r3.setOpposite(r1, r7)
        L_0x0181:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r1 = r0.mListDimensionBehaviors
            r1 = r1[r8]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r1 != r3) goto L_0x0191
            boolean r1 = optimizableMatchConstraint(r0, r8)
            if (r1 == 0) goto L_0x0191
            r7 = 1
            goto L_0x0192
        L_0x0191:
            r7 = 0
        L_0x0192:
            int r1 = r2.type
            if (r1 == r12) goto L_0x0329
            int r1 = r4.type
            if (r1 == r12) goto L_0x0329
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r1 = r0.mListDimensionBehaviors
            r1 = r1[r8]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r1 == r3) goto L_0x0247
            if (r7 == 0) goto L_0x01ac
            int r1 = r17.getVisibility()
            if (r1 != r5) goto L_0x01ac
            goto L_0x0247
        L_0x01ac:
            if (r7 == 0) goto L_0x0329
            int r1 = r17.getHeight()
            r2.setType(r8)
            r4.setType(r8)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r0.mTop
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r3.mTarget
            if (r3 != 0) goto L_0x01d4
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r0.mBottom
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r3.mTarget
            if (r3 != 0) goto L_0x01d4
            if (r6 == 0) goto L_0x01cf
        L_0x01c6:
            androidx.constraintlayout.solver.widgets.ResolutionDimension r0 = r17.getResolutionHeight()
            r4.dependsOn((androidx.constraintlayout.solver.widgets.ResolutionAnchor) r2, (int) r8, (androidx.constraintlayout.solver.widgets.ResolutionDimension) r0)
            goto L_0x0329
        L_0x01cf:
            r4.dependsOn(r2, r1)
            goto L_0x0329
        L_0x01d4:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r0.mTop
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r3.mTarget
            if (r3 == 0) goto L_0x01e3
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r0.mBottom
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r3.mTarget
            if (r3 != 0) goto L_0x01e3
            if (r6 == 0) goto L_0x01cf
            goto L_0x01c6
        L_0x01e3:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r0.mTop
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r3.mTarget
            if (r3 != 0) goto L_0x0200
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r0.mBottom
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r3.mTarget
            if (r3 == 0) goto L_0x0200
            if (r6 == 0) goto L_0x01fa
            androidx.constraintlayout.solver.widgets.ResolutionDimension r0 = r17.getResolutionHeight()
            r2.dependsOn((androidx.constraintlayout.solver.widgets.ResolutionAnchor) r4, (int) r14, (androidx.constraintlayout.solver.widgets.ResolutionDimension) r0)
            goto L_0x0329
        L_0x01fa:
            int r0 = -r1
            r2.dependsOn(r4, r0)
            goto L_0x0329
        L_0x0200:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r0.mTop
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r3.mTarget
            if (r3 == 0) goto L_0x0329
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r0.mBottom
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r3.mTarget
            if (r3 == 0) goto L_0x0329
            if (r6 == 0) goto L_0x021c
            androidx.constraintlayout.solver.widgets.ResolutionDimension r3 = r17.getResolutionHeight()
            r3.addDependent(r2)
            androidx.constraintlayout.solver.widgets.ResolutionDimension r3 = r17.getResolutionWidth()
            r3.addDependent(r4)
        L_0x021c:
            float r3 = r0.mDimensionRatio
            int r3 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r3 != 0) goto L_0x0230
            r2.setType(r11)
            r4.setType(r11)
            r2.setOpposite(r4, r13)
            r4.setOpposite(r2, r13)
            goto L_0x0329
        L_0x0230:
            r2.setType(r15)
            r4.setType(r15)
            int r3 = -r1
            float r3 = (float) r3
            r2.setOpposite(r4, r3)
            float r3 = (float) r1
            r4.setOpposite(r2, r3)
            r0.setHeight(r1)
            int r1 = r0.mBaselineDistance
            if (r1 <= 0) goto L_0x0329
            goto L_0x02ac
        L_0x0247:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r0.mTop
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r1.mTarget
            if (r1 != 0) goto L_0x0285
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r0.mBottom
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r1.mTarget
            if (r1 != 0) goto L_0x0285
            r2.setType(r8)
            r4.setType(r8)
            if (r6 == 0) goto L_0x0263
            androidx.constraintlayout.solver.widgets.ResolutionDimension r1 = r17.getResolutionHeight()
            r4.dependsOn((androidx.constraintlayout.solver.widgets.ResolutionAnchor) r2, (int) r8, (androidx.constraintlayout.solver.widgets.ResolutionDimension) r1)
            goto L_0x026a
        L_0x0263:
            int r1 = r17.getHeight()
            r4.dependsOn(r2, r1)
        L_0x026a:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r0.mBaseline
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r1.mTarget
            if (r3 == 0) goto L_0x0329
            androidx.constraintlayout.solver.widgets.ResolutionAnchor r1 = r1.getResolutionNode()
            r1.setType(r8)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r0.mBaseline
            androidx.constraintlayout.solver.widgets.ResolutionAnchor r1 = r1.getResolutionNode()
            int r0 = r0.mBaselineDistance
            int r0 = -r0
            r2.dependsOn((int) r8, (androidx.constraintlayout.solver.widgets.ResolutionAnchor) r1, (int) r0)
            goto L_0x0329
        L_0x0285:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r0.mTop
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r1.mTarget
            if (r1 == 0) goto L_0x02b9
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r0.mBottom
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r1.mTarget
            if (r1 != 0) goto L_0x02b9
            r2.setType(r8)
            r4.setType(r8)
            if (r6 == 0) goto L_0x02a1
            androidx.constraintlayout.solver.widgets.ResolutionDimension r1 = r17.getResolutionHeight()
            r4.dependsOn((androidx.constraintlayout.solver.widgets.ResolutionAnchor) r2, (int) r8, (androidx.constraintlayout.solver.widgets.ResolutionDimension) r1)
            goto L_0x02a8
        L_0x02a1:
            int r1 = r17.getHeight()
            r4.dependsOn(r2, r1)
        L_0x02a8:
            int r1 = r0.mBaselineDistance
            if (r1 <= 0) goto L_0x0329
        L_0x02ac:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r0.mBaseline
            androidx.constraintlayout.solver.widgets.ResolutionAnchor r1 = r1.getResolutionNode()
            int r0 = r0.mBaselineDistance
            r1.dependsOn((int) r8, (androidx.constraintlayout.solver.widgets.ResolutionAnchor) r2, (int) r0)
            goto L_0x0329
        L_0x02b9:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r0.mTop
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r1.mTarget
            if (r1 != 0) goto L_0x02e2
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r0.mBottom
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r1.mTarget
            if (r1 == 0) goto L_0x02e2
            r2.setType(r8)
            r4.setType(r8)
            if (r6 == 0) goto L_0x02d5
            androidx.constraintlayout.solver.widgets.ResolutionDimension r1 = r17.getResolutionHeight()
            r2.dependsOn((androidx.constraintlayout.solver.widgets.ResolutionAnchor) r4, (int) r14, (androidx.constraintlayout.solver.widgets.ResolutionDimension) r1)
            goto L_0x02dd
        L_0x02d5:
            int r1 = r17.getHeight()
            int r1 = -r1
            r2.dependsOn(r4, r1)
        L_0x02dd:
            int r1 = r0.mBaselineDistance
            if (r1 <= 0) goto L_0x0329
            goto L_0x02ac
        L_0x02e2:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r0.mTop
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r1.mTarget
            if (r1 == 0) goto L_0x0329
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r0.mBottom
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r1.mTarget
            if (r1 == 0) goto L_0x0329
            r2.setType(r15)
            r4.setType(r15)
            if (r6 == 0) goto L_0x0313
            androidx.constraintlayout.solver.widgets.ResolutionDimension r1 = r17.getResolutionHeight()
            r2.setOpposite(r4, r14, r1)
            androidx.constraintlayout.solver.widgets.ResolutionDimension r1 = r17.getResolutionHeight()
            r4.setOpposite(r2, r8, r1)
            androidx.constraintlayout.solver.widgets.ResolutionDimension r1 = r17.getResolutionHeight()
            r1.addDependent(r2)
            androidx.constraintlayout.solver.widgets.ResolutionDimension r1 = r17.getResolutionWidth()
            r1.addDependent(r4)
            goto L_0x0324
        L_0x0313:
            int r1 = r17.getHeight()
            int r1 = -r1
            float r1 = (float) r1
            r2.setOpposite(r4, r1)
            int r1 = r17.getHeight()
            float r1 = (float) r1
            r4.setOpposite(r2, r1)
        L_0x0324:
            int r1 = r0.mBaselineDistance
            if (r1 <= 0) goto L_0x0329
            goto L_0x02ac
        L_0x0329:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.Optimizer.analyze(int, androidx.constraintlayout.solver.widgets.ConstraintWidget):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0032, code lost:
        if (r7.mHorizontalChainStyle == 2) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0036, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0048, code lost:
        if (r7.mVerticalChainStyle == 2) goto L_0x0034;
     */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x01d6  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0107  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static boolean applyChainOptimized(androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r24, androidx.constraintlayout.solver.LinearSystem r25, int r26, int r27, androidx.constraintlayout.solver.widgets.ChainHead r28) {
        /*
            r0 = r25
            r1 = r26
            r2 = r28
            androidx.constraintlayout.solver.widgets.ConstraintWidget r3 = r2.mFirst
            androidx.constraintlayout.solver.widgets.ConstraintWidget r4 = r2.mLast
            androidx.constraintlayout.solver.widgets.ConstraintWidget r5 = r2.mFirstVisibleWidget
            androidx.constraintlayout.solver.widgets.ConstraintWidget r6 = r2.mLastVisibleWidget
            androidx.constraintlayout.solver.widgets.ConstraintWidget r7 = r2.mHead
            float r8 = r2.mTotalWeight
            androidx.constraintlayout.solver.widgets.ConstraintWidget r9 = r2.mFirstMatchConstraintWidget
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = r2.mLastMatchConstraintWidget
            r9 = r24
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r2 = r9.mListDimensionBehaviors
            r2 = r2[r1]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r9 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            r2 = 2
            r10 = 1
            if (r1 != 0) goto L_0x0038
            int r11 = r7.mHorizontalChainStyle
            if (r11 != 0) goto L_0x0028
            r11 = 1
            goto L_0x0029
        L_0x0028:
            r11 = 0
        L_0x0029:
            int r12 = r7.mHorizontalChainStyle
            if (r12 != r10) goto L_0x002f
            r12 = 1
            goto L_0x0030
        L_0x002f:
            r12 = 0
        L_0x0030:
            int r7 = r7.mHorizontalChainStyle
            if (r7 != r2) goto L_0x0036
        L_0x0034:
            r2 = 1
            goto L_0x004b
        L_0x0036:
            r2 = 0
            goto L_0x004b
        L_0x0038:
            int r11 = r7.mVerticalChainStyle
            if (r11 != 0) goto L_0x003e
            r11 = 1
            goto L_0x003f
        L_0x003e:
            r11 = 0
        L_0x003f:
            int r12 = r7.mVerticalChainStyle
            if (r12 != r10) goto L_0x0045
            r12 = 1
            goto L_0x0046
        L_0x0045:
            r12 = 0
        L_0x0046:
            int r7 = r7.mVerticalChainStyle
            if (r7 != r2) goto L_0x0036
            goto L_0x0034
        L_0x004b:
            r14 = r3
            r10 = 0
            r13 = 0
            r15 = 0
            r16 = 0
            r17 = 0
        L_0x0053:
            r7 = 8
            if (r13 != 0) goto L_0x010a
            int r9 = r14.getVisibility()
            if (r9 == r7) goto L_0x00a1
            int r15 = r15 + 1
            if (r1 != 0) goto L_0x0066
            int r9 = r14.getWidth()
            goto L_0x006a
        L_0x0066:
            int r9 = r14.getHeight()
        L_0x006a:
            float r9 = (float) r9
            float r16 = r16 + r9
            if (r14 == r5) goto L_0x007a
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r9 = r14.mListAnchors
            r9 = r9[r27]
            int r9 = r9.getMargin()
            float r9 = (float) r9
            float r16 = r16 + r9
        L_0x007a:
            if (r14 == r6) goto L_0x0089
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r9 = r14.mListAnchors
            int r19 = r27 + 1
            r9 = r9[r19]
            int r9 = r9.getMargin()
            float r9 = (float) r9
            float r16 = r16 + r9
        L_0x0089:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r9 = r14.mListAnchors
            r9 = r9[r27]
            int r9 = r9.getMargin()
            float r9 = (float) r9
            float r17 = r17 + r9
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r9 = r14.mListAnchors
            int r19 = r27 + 1
            r9 = r9[r19]
            int r9 = r9.getMargin()
            float r9 = (float) r9
            float r17 = r17 + r9
        L_0x00a1:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r9 = r14.mListAnchors
            r9 = r9[r27]
            int r9 = r14.getVisibility()
            if (r9 == r7) goto L_0x00df
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r7 = r14.mListDimensionBehaviors
            r7 = r7[r1]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r9 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r7 != r9) goto L_0x00df
            int r10 = r10 + 1
            if (r1 != 0) goto L_0x00c7
            int r7 = r14.mMatchConstraintDefaultWidth
            if (r7 == 0) goto L_0x00bd
            r7 = 0
            return r7
        L_0x00bd:
            r7 = 0
            int r9 = r14.mMatchConstraintMinWidth
            if (r9 != 0) goto L_0x00c6
            int r9 = r14.mMatchConstraintMaxWidth
            if (r9 == 0) goto L_0x00d6
        L_0x00c6:
            return r7
        L_0x00c7:
            r7 = 0
            int r9 = r14.mMatchConstraintDefaultHeight
            if (r9 == 0) goto L_0x00cd
            return r7
        L_0x00cd:
            int r9 = r14.mMatchConstraintMinHeight
            if (r9 != 0) goto L_0x00de
            int r9 = r14.mMatchConstraintMaxHeight
            if (r9 == 0) goto L_0x00d6
            goto L_0x00de
        L_0x00d6:
            float r9 = r14.mDimensionRatio
            r18 = 0
            int r9 = (r9 > r18 ? 1 : (r9 == r18 ? 0 : -1))
            if (r9 == 0) goto L_0x00df
        L_0x00de:
            return r7
        L_0x00df:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r7 = r14.mListAnchors
            int r9 = r27 + 1
            r7 = r7[r9]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r7 = r7.mTarget
            if (r7 == 0) goto L_0x0101
            androidx.constraintlayout.solver.widgets.ConstraintWidget r7 = r7.mOwner
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r9 = r7.mListAnchors
            r20 = r7
            r7 = r9[r27]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r7 = r7.mTarget
            if (r7 == 0) goto L_0x0101
            r7 = r9[r27]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r7 = r7.mTarget
            androidx.constraintlayout.solver.widgets.ConstraintWidget r7 = r7.mOwner
            if (r7 == r14) goto L_0x00fe
            goto L_0x0101
        L_0x00fe:
            r9 = r20
            goto L_0x0102
        L_0x0101:
            r9 = 0
        L_0x0102:
            if (r9 == 0) goto L_0x0107
            r14 = r9
            goto L_0x0053
        L_0x0107:
            r13 = 1
            goto L_0x0053
        L_0x010a:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r9 = r3.mListAnchors
            r9 = r9[r27]
            androidx.constraintlayout.solver.widgets.ResolutionAnchor r9 = r9.getResolutionNode()
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r13 = r4.mListAnchors
            int r19 = r27 + 1
            r13 = r13[r19]
            androidx.constraintlayout.solver.widgets.ResolutionAnchor r13 = r13.getResolutionNode()
            androidx.constraintlayout.solver.widgets.ResolutionAnchor r7 = r9.target
            if (r7 == 0) goto L_0x0385
            r21 = r3
            androidx.constraintlayout.solver.widgets.ResolutionAnchor r3 = r13.target
            if (r3 != 0) goto L_0x0128
            goto L_0x0385
        L_0x0128:
            int r7 = r7.state
            r0 = 1
            if (r7 != r0) goto L_0x0383
            int r3 = r3.state
            if (r3 == r0) goto L_0x0133
            goto L_0x0383
        L_0x0133:
            if (r10 <= 0) goto L_0x0139
            if (r10 == r15) goto L_0x0139
            r0 = 0
            return r0
        L_0x0139:
            if (r2 != 0) goto L_0x0142
            if (r11 != 0) goto L_0x0142
            if (r12 == 0) goto L_0x0140
            goto L_0x0142
        L_0x0140:
            r0 = 0
            goto L_0x015b
        L_0x0142:
            if (r5 == 0) goto L_0x014e
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r0 = r5.mListAnchors
            r0 = r0[r27]
            int r0 = r0.getMargin()
            float r0 = (float) r0
            goto L_0x014f
        L_0x014e:
            r0 = 0
        L_0x014f:
            if (r6 == 0) goto L_0x015b
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r3 = r6.mListAnchors
            r3 = r3[r19]
            int r3 = r3.getMargin()
            float r3 = (float) r3
            float r0 = r0 + r3
        L_0x015b:
            androidx.constraintlayout.solver.widgets.ResolutionAnchor r3 = r9.target
            float r3 = r3.resolvedOffset
            androidx.constraintlayout.solver.widgets.ResolutionAnchor r6 = r13.target
            float r6 = r6.resolvedOffset
            int r7 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r7 >= 0) goto L_0x0169
            float r6 = r6 - r3
            goto L_0x016b
        L_0x0169:
            float r6 = r3 - r6
        L_0x016b:
            float r6 = r6 - r16
            r22 = 1
            if (r10 <= 0) goto L_0x0225
            if (r10 != r15) goto L_0x0225
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r14.getParent()
            if (r0 == 0) goto L_0x0187
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r14.getParent()
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r0.mListDimensionBehaviors
            r0 = r0[r1]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r0 != r2) goto L_0x0187
            r0 = 0
            return r0
        L_0x0187:
            float r6 = r6 + r16
            float r6 = r6 - r17
            r0 = r3
            r3 = r21
        L_0x018e:
            if (r3 == 0) goto L_0x0223
            androidx.constraintlayout.solver.Metrics r2 = androidx.constraintlayout.solver.LinearSystem.sMetrics
            if (r2 == 0) goto L_0x01a6
            long r11 = r2.nonresolvedWidgets
            long r11 = r11 - r22
            r2.nonresolvedWidgets = r11
            long r11 = r2.resolvedWidgets
            long r11 = r11 + r22
            r2.resolvedWidgets = r11
            long r11 = r2.chainConnectionResolved
            long r11 = r11 + r22
            r2.chainConnectionResolved = r11
        L_0x01a6:
            androidx.constraintlayout.solver.widgets.ConstraintWidget[] r2 = r3.mNextChainWidget
            r2 = r2[r1]
            if (r2 != 0) goto L_0x01b2
            if (r3 != r4) goto L_0x01af
            goto L_0x01b2
        L_0x01af:
            r7 = r25
            goto L_0x0220
        L_0x01b2:
            float r5 = (float) r10
            float r5 = r6 / r5
            r7 = 0
            int r11 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r11 <= 0) goto L_0x01cc
            float[] r5 = r3.mWeight
            r7 = r5[r1]
            r11 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r7 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r7 != 0) goto L_0x01c7
            r18 = 0
            goto L_0x01ce
        L_0x01c7:
            r5 = r5[r1]
            float r5 = r5 * r6
            float r5 = r5 / r8
        L_0x01cc:
            r18 = r5
        L_0x01ce:
            int r5 = r3.getVisibility()
            r7 = 8
            if (r5 != r7) goto L_0x01d8
            r18 = 0
        L_0x01d8:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r5 = r3.mListAnchors
            r5 = r5[r27]
            int r5 = r5.getMargin()
            float r5 = (float) r5
            float r0 = r0 + r5
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r5 = r3.mListAnchors
            r5 = r5[r27]
            androidx.constraintlayout.solver.widgets.ResolutionAnchor r5 = r5.getResolutionNode()
            androidx.constraintlayout.solver.widgets.ResolutionAnchor r7 = r9.resolvedTarget
            r5.resolve(r7, r0)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r5 = r3.mListAnchors
            r5 = r5[r19]
            androidx.constraintlayout.solver.widgets.ResolutionAnchor r5 = r5.getResolutionNode()
            androidx.constraintlayout.solver.widgets.ResolutionAnchor r7 = r9.resolvedTarget
            float r0 = r0 + r18
            r5.resolve(r7, r0)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r5 = r3.mListAnchors
            r5 = r5[r27]
            androidx.constraintlayout.solver.widgets.ResolutionAnchor r5 = r5.getResolutionNode()
            r7 = r25
            r5.addResolvedValue(r7)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r5 = r3.mListAnchors
            r5 = r5[r19]
            androidx.constraintlayout.solver.widgets.ResolutionAnchor r5 = r5.getResolutionNode()
            r5.addResolvedValue(r7)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r3 = r3.mListAnchors
            r3 = r3[r19]
            int r3 = r3.getMargin()
            float r3 = (float) r3
            float r0 = r0 + r3
        L_0x0220:
            r3 = r2
            goto L_0x018e
        L_0x0223:
            r0 = 1
            return r0
        L_0x0225:
            r7 = r25
            r8 = 0
            int r8 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r8 >= 0) goto L_0x022f
            r2 = 1
            r11 = 0
            r12 = 0
        L_0x022f:
            if (r2 == 0) goto L_0x02af
            float r6 = r6 - r0
            r2 = r21
            float r0 = r2.getBiasPercent(r1)
            float r6 = r6 * r0
            float r3 = r3 + r6
            r0 = r3
        L_0x023c:
            r3 = r2
            if (r3 == 0) goto L_0x02b6
            androidx.constraintlayout.solver.Metrics r2 = androidx.constraintlayout.solver.LinearSystem.sMetrics
            if (r2 == 0) goto L_0x0255
            long r5 = r2.nonresolvedWidgets
            long r5 = r5 - r22
            r2.nonresolvedWidgets = r5
            long r5 = r2.resolvedWidgets
            long r5 = r5 + r22
            r2.resolvedWidgets = r5
            long r5 = r2.chainConnectionResolved
            long r5 = r5 + r22
            r2.chainConnectionResolved = r5
        L_0x0255:
            androidx.constraintlayout.solver.widgets.ConstraintWidget[] r2 = r3.mNextChainWidget
            r2 = r2[r1]
            if (r2 != 0) goto L_0x025d
            if (r3 != r4) goto L_0x023c
        L_0x025d:
            if (r1 != 0) goto L_0x0264
            int r5 = r3.getWidth()
            goto L_0x0268
        L_0x0264:
            int r5 = r3.getHeight()
        L_0x0268:
            float r5 = (float) r5
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r6 = r3.mListAnchors
            r6 = r6[r27]
            int r6 = r6.getMargin()
            float r6 = (float) r6
            float r0 = r0 + r6
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r6 = r3.mListAnchors
            r6 = r6[r27]
            androidx.constraintlayout.solver.widgets.ResolutionAnchor r6 = r6.getResolutionNode()
            androidx.constraintlayout.solver.widgets.ResolutionAnchor r8 = r9.resolvedTarget
            r6.resolve(r8, r0)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r6 = r3.mListAnchors
            r6 = r6[r19]
            androidx.constraintlayout.solver.widgets.ResolutionAnchor r6 = r6.getResolutionNode()
            androidx.constraintlayout.solver.widgets.ResolutionAnchor r8 = r9.resolvedTarget
            float r0 = r0 + r5
            r6.resolve(r8, r0)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r5 = r3.mListAnchors
            r5 = r5[r27]
            androidx.constraintlayout.solver.widgets.ResolutionAnchor r5 = r5.getResolutionNode()
            r5.addResolvedValue(r7)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r5 = r3.mListAnchors
            r5 = r5[r19]
            androidx.constraintlayout.solver.widgets.ResolutionAnchor r5 = r5.getResolutionNode()
            r5.addResolvedValue(r7)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r3 = r3.mListAnchors
            r3 = r3[r19]
            int r3 = r3.getMargin()
            float r3 = (float) r3
            float r0 = r0 + r3
            goto L_0x023c
        L_0x02af:
            r2 = r21
            if (r11 != 0) goto L_0x02b9
            if (r12 == 0) goto L_0x02b6
            goto L_0x02b9
        L_0x02b6:
            r0 = 1
            goto L_0x0382
        L_0x02b9:
            if (r11 == 0) goto L_0x02bd
        L_0x02bb:
            float r6 = r6 - r0
            goto L_0x02c0
        L_0x02bd:
            if (r12 == 0) goto L_0x02c0
            goto L_0x02bb
        L_0x02c0:
            int r0 = r15 + 1
            float r0 = (float) r0
            float r0 = r6 / r0
            if (r12 == 0) goto L_0x02d2
            r8 = 1
            if (r15 <= r8) goto L_0x02ce
            int r0 = r15 + -1
            float r0 = (float) r0
            goto L_0x02d0
        L_0x02ce:
            r0 = 1073741824(0x40000000, float:2.0)
        L_0x02d0:
            float r0 = r6 / r0
        L_0x02d2:
            int r6 = r2.getVisibility()
            r8 = 8
            if (r6 == r8) goto L_0x02dd
            float r6 = r3 + r0
            goto L_0x02de
        L_0x02dd:
            r6 = r3
        L_0x02de:
            if (r12 == 0) goto L_0x02ed
            r8 = 1
            if (r15 <= r8) goto L_0x02ed
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r6 = r5.mListAnchors
            r6 = r6[r27]
            int r6 = r6.getMargin()
            float r6 = (float) r6
            float r6 = r6 + r3
        L_0x02ed:
            if (r11 == 0) goto L_0x02fb
            if (r5 == 0) goto L_0x02fb
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r3 = r5.mListAnchors
            r3 = r3[r27]
            int r3 = r3.getMargin()
            float r3 = (float) r3
            float r6 = r6 + r3
        L_0x02fb:
            r3 = r2
            if (r3 == 0) goto L_0x02b6
            androidx.constraintlayout.solver.Metrics r2 = androidx.constraintlayout.solver.LinearSystem.sMetrics
            if (r2 == 0) goto L_0x0314
            long r10 = r2.nonresolvedWidgets
            long r10 = r10 - r22
            r2.nonresolvedWidgets = r10
            long r10 = r2.resolvedWidgets
            long r10 = r10 + r22
            r2.resolvedWidgets = r10
            long r10 = r2.chainConnectionResolved
            long r10 = r10 + r22
            r2.chainConnectionResolved = r10
        L_0x0314:
            androidx.constraintlayout.solver.widgets.ConstraintWidget[] r2 = r3.mNextChainWidget
            r2 = r2[r1]
            if (r2 != 0) goto L_0x0320
            if (r3 != r4) goto L_0x031d
            goto L_0x0320
        L_0x031d:
            r8 = 8
            goto L_0x02fb
        L_0x0320:
            if (r1 != 0) goto L_0x0327
            int r8 = r3.getWidth()
            goto L_0x032b
        L_0x0327:
            int r8 = r3.getHeight()
        L_0x032b:
            float r8 = (float) r8
            if (r3 == r5) goto L_0x0338
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r10 = r3.mListAnchors
            r10 = r10[r27]
            int r10 = r10.getMargin()
            float r10 = (float) r10
            float r6 = r6 + r10
        L_0x0338:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r10 = r3.mListAnchors
            r10 = r10[r27]
            androidx.constraintlayout.solver.widgets.ResolutionAnchor r10 = r10.getResolutionNode()
            androidx.constraintlayout.solver.widgets.ResolutionAnchor r11 = r9.resolvedTarget
            r10.resolve(r11, r6)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r10 = r3.mListAnchors
            r10 = r10[r19]
            androidx.constraintlayout.solver.widgets.ResolutionAnchor r10 = r10.getResolutionNode()
            androidx.constraintlayout.solver.widgets.ResolutionAnchor r11 = r9.resolvedTarget
            float r12 = r6 + r8
            r10.resolve(r11, r12)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r10 = r3.mListAnchors
            r10 = r10[r27]
            androidx.constraintlayout.solver.widgets.ResolutionAnchor r10 = r10.getResolutionNode()
            r10.addResolvedValue(r7)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r10 = r3.mListAnchors
            r10 = r10[r19]
            androidx.constraintlayout.solver.widgets.ResolutionAnchor r10 = r10.getResolutionNode()
            r10.addResolvedValue(r7)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r3 = r3.mListAnchors
            r3 = r3[r19]
            int r3 = r3.getMargin()
            float r3 = (float) r3
            float r8 = r8 + r3
            float r6 = r6 + r8
            if (r2 == 0) goto L_0x031d
            int r3 = r2.getVisibility()
            r8 = 8
            if (r3 == r8) goto L_0x02fb
            float r6 = r6 + r0
            goto L_0x02fb
        L_0x0382:
            return r0
        L_0x0383:
            r0 = 0
            return r0
        L_0x0385:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.Optimizer.applyChainOptimized(androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer, androidx.constraintlayout.solver.LinearSystem, int, int, androidx.constraintlayout.solver.widgets.ChainHead):boolean");
    }

    static void checkMatchParent(ConstraintWidgetContainer constraintWidgetContainer, LinearSystem linearSystem, ConstraintWidget constraintWidget) {
        if (constraintWidgetContainer.mListDimensionBehaviors[0] != ConstraintWidget.DimensionBehaviour.WRAP_CONTENT && constraintWidget.mListDimensionBehaviors[0] == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
            int i = constraintWidget.mLeft.mMargin;
            int width = constraintWidgetContainer.getWidth() - constraintWidget.mRight.mMargin;
            ConstraintAnchor constraintAnchor = constraintWidget.mLeft;
            constraintAnchor.mSolverVariable = linearSystem.createObjectVariable(constraintAnchor);
            ConstraintAnchor constraintAnchor2 = constraintWidget.mRight;
            constraintAnchor2.mSolverVariable = linearSystem.createObjectVariable(constraintAnchor2);
            linearSystem.addEquality(constraintWidget.mLeft.mSolverVariable, i);
            linearSystem.addEquality(constraintWidget.mRight.mSolverVariable, width);
            constraintWidget.mHorizontalResolution = 2;
            constraintWidget.setHorizontalDimension(i, width);
        }
        if (constraintWidgetContainer.mListDimensionBehaviors[1] != ConstraintWidget.DimensionBehaviour.WRAP_CONTENT && constraintWidget.mListDimensionBehaviors[1] == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
            int i2 = constraintWidget.mTop.mMargin;
            int height = constraintWidgetContainer.getHeight() - constraintWidget.mBottom.mMargin;
            ConstraintAnchor constraintAnchor3 = constraintWidget.mTop;
            constraintAnchor3.mSolverVariable = linearSystem.createObjectVariable(constraintAnchor3);
            ConstraintAnchor constraintAnchor4 = constraintWidget.mBottom;
            constraintAnchor4.mSolverVariable = linearSystem.createObjectVariable(constraintAnchor4);
            linearSystem.addEquality(constraintWidget.mTop.mSolverVariable, i2);
            linearSystem.addEquality(constraintWidget.mBottom.mSolverVariable, height);
            if (constraintWidget.mBaselineDistance > 0 || constraintWidget.getVisibility() == 8) {
                ConstraintAnchor constraintAnchor5 = constraintWidget.mBaseline;
                constraintAnchor5.mSolverVariable = linearSystem.createObjectVariable(constraintAnchor5);
                linearSystem.addEquality(constraintWidget.mBaseline.mSolverVariable, constraintWidget.mBaselineDistance + i2);
            }
            constraintWidget.mVerticalResolution = 2;
            constraintWidget.setVerticalDimension(i2, height);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0039 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean optimizableMatchConstraint(androidx.constraintlayout.solver.widgets.ConstraintWidget r5, int r6) {
        /*
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r5.mListDimensionBehaviors
            r1 = r0[r6]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            r3 = 0
            if (r1 == r2) goto L_0x000a
            return r3
        L_0x000a:
            float r1 = r5.mDimensionRatio
            r2 = 0
            r4 = 1
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 == 0) goto L_0x001b
            if (r6 != 0) goto L_0x0015
            goto L_0x0016
        L_0x0015:
            r4 = 0
        L_0x0016:
            r5 = r0[r4]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            return r3
        L_0x001b:
            if (r6 != 0) goto L_0x002b
            int r6 = r5.mMatchConstraintDefaultWidth
            if (r6 == 0) goto L_0x0022
            return r3
        L_0x0022:
            int r6 = r5.mMatchConstraintMinWidth
            if (r6 != 0) goto L_0x002a
            int r5 = r5.mMatchConstraintMaxWidth
            if (r5 == 0) goto L_0x0039
        L_0x002a:
            return r3
        L_0x002b:
            int r6 = r5.mMatchConstraintDefaultHeight
            if (r6 == 0) goto L_0x0030
            return r3
        L_0x0030:
            int r6 = r5.mMatchConstraintMinHeight
            if (r6 != 0) goto L_0x003a
            int r5 = r5.mMatchConstraintMaxHeight
            if (r5 == 0) goto L_0x0039
            goto L_0x003a
        L_0x0039:
            return r4
        L_0x003a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.Optimizer.optimizableMatchConstraint(androidx.constraintlayout.solver.widgets.ConstraintWidget, int):boolean");
    }

    static void setOptimizedWidget(ConstraintWidget constraintWidget, int i, int i2) {
        int i3 = i * 2;
        int i4 = i3 + 1;
        constraintWidget.mListAnchors[i3].getResolutionNode().resolvedTarget = constraintWidget.getParent().mLeft.getResolutionNode();
        constraintWidget.mListAnchors[i3].getResolutionNode().resolvedOffset = (float) i2;
        constraintWidget.mListAnchors[i3].getResolutionNode().state = 1;
        constraintWidget.mListAnchors[i4].getResolutionNode().resolvedTarget = constraintWidget.mListAnchors[i3].getResolutionNode();
        constraintWidget.mListAnchors[i4].getResolutionNode().resolvedOffset = (float) constraintWidget.getLength(i);
        constraintWidget.mListAnchors[i4].getResolutionNode().state = 1;
    }
}
