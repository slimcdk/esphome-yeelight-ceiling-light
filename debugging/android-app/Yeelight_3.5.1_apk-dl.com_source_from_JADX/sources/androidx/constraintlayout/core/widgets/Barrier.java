package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.HashMap;

public class Barrier extends HelperWidget {
    public static final int BOTTOM = 3;
    public static final int LEFT = 0;
    public static final int RIGHT = 1;
    public static final int TOP = 2;
    private static final boolean USE_RELAX_GONE = false;
    private static final boolean USE_RESOLUTION = true;
    private boolean mAllowsGoneWidget = true;
    private int mBarrierType = 0;
    private int mMargin = 0;
    boolean resolved = false;

    public Barrier() {
    }

    public Barrier(String str) {
        setDebugName(str);
    }

    public void addToSolver(LinearSystem linearSystem, boolean z) {
        ConstraintAnchor[] constraintAnchorArr;
        boolean z2;
        SolverVariable solverVariable;
        ConstraintAnchor constraintAnchor;
        int i;
        int i2;
        int i3;
        SolverVariable solverVariable2;
        int i4;
        ConstraintAnchor[] constraintAnchorArr2 = this.mListAnchors;
        constraintAnchorArr2[0] = this.mLeft;
        constraintAnchorArr2[2] = this.mTop;
        constraintAnchorArr2[1] = this.mRight;
        constraintAnchorArr2[3] = this.mBottom;
        int i5 = 0;
        while (true) {
            constraintAnchorArr = this.mListAnchors;
            if (i5 >= constraintAnchorArr.length) {
                break;
            }
            constraintAnchorArr[i5].mSolverVariable = linearSystem.createObjectVariable(constraintAnchorArr[i5]);
            i5++;
        }
        int i6 = this.mBarrierType;
        if (i6 >= 0 && i6 < 4) {
            ConstraintAnchor constraintAnchor2 = constraintAnchorArr[i6];
            if (!this.resolved) {
                allSolved();
            }
            if (this.resolved) {
                this.resolved = false;
                int i7 = this.mBarrierType;
                if (i7 == 0 || i7 == 1) {
                    linearSystem.addEquality(this.mLeft.mSolverVariable, this.f52mX);
                    solverVariable2 = this.mRight.mSolverVariable;
                    i4 = this.f52mX;
                } else if (i7 == 2 || i7 == 3) {
                    linearSystem.addEquality(this.mTop.mSolverVariable, this.f53mY);
                    solverVariable2 = this.mBottom.mSolverVariable;
                    i4 = this.f53mY;
                } else {
                    return;
                }
                linearSystem.addEquality(solverVariable2, i4);
                return;
            }
            int i8 = 0;
            while (true) {
                if (i8 >= this.mWidgetsCount) {
                    z2 = false;
                    break;
                }
                ConstraintWidget constraintWidget = this.mWidgets[i8];
                if ((this.mAllowsGoneWidget || constraintWidget.allowedInBarrier()) && ((((i2 = this.mBarrierType) == 0 || i2 == 1) && constraintWidget.getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.mLeft.mTarget != null && constraintWidget.mRight.mTarget != null) || (((i3 = this.mBarrierType) == 2 || i3 == 3) && constraintWidget.getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.mTop.mTarget != null && constraintWidget.mBottom.mTarget != null))) {
                    z2 = true;
                } else {
                    i8++;
                }
            }
            z2 = true;
            boolean z3 = this.mLeft.hasCenteredDependents() || this.mRight.hasCenteredDependents();
            boolean z4 = this.mTop.hasCenteredDependents() || this.mBottom.hasCenteredDependents();
            boolean z5 = !z2 && (((i = this.mBarrierType) == 0 && z3) || ((i == 2 && z4) || ((i == 1 && z3) || (i == 3 && z4))));
            int i9 = 5;
            if (!z5) {
                i9 = 4;
            }
            for (int i10 = 0; i10 < this.mWidgetsCount; i10++) {
                ConstraintWidget constraintWidget2 = this.mWidgets[i10];
                if (this.mAllowsGoneWidget || constraintWidget2.allowedInBarrier()) {
                    SolverVariable createObjectVariable = linearSystem.createObjectVariable(constraintWidget2.mListAnchors[this.mBarrierType]);
                    ConstraintAnchor[] constraintAnchorArr3 = constraintWidget2.mListAnchors;
                    int i11 = this.mBarrierType;
                    constraintAnchorArr3[i11].mSolverVariable = createObjectVariable;
                    int i12 = (constraintAnchorArr3[i11].mTarget == null || constraintAnchorArr3[i11].mTarget.mOwner != this) ? 0 : constraintAnchorArr3[i11].mMargin + 0;
                    if (i11 == 0 || i11 == 2) {
                        linearSystem.addLowerBarrier(constraintAnchor2.mSolverVariable, createObjectVariable, this.mMargin - i12, z2);
                    } else {
                        linearSystem.addGreaterBarrier(constraintAnchor2.mSolverVariable, createObjectVariable, this.mMargin + i12, z2);
                    }
                    linearSystem.addEquality(constraintAnchor2.mSolverVariable, createObjectVariable, this.mMargin + i12, i9);
                }
            }
            int i13 = this.mBarrierType;
            if (i13 == 0) {
                linearSystem.addEquality(this.mRight.mSolverVariable, this.mLeft.mSolverVariable, 0, 8);
                linearSystem.addEquality(this.mLeft.mSolverVariable, this.mParent.mRight.mSolverVariable, 0, 4);
                solverVariable = this.mLeft.mSolverVariable;
                constraintAnchor = this.mParent.mLeft;
            } else if (i13 == 1) {
                linearSystem.addEquality(this.mLeft.mSolverVariable, this.mRight.mSolverVariable, 0, 8);
                linearSystem.addEquality(this.mLeft.mSolverVariable, this.mParent.mLeft.mSolverVariable, 0, 4);
                solverVariable = this.mLeft.mSolverVariable;
                constraintAnchor = this.mParent.mRight;
            } else if (i13 == 2) {
                linearSystem.addEquality(this.mBottom.mSolverVariable, this.mTop.mSolverVariable, 0, 8);
                linearSystem.addEquality(this.mTop.mSolverVariable, this.mParent.mBottom.mSolverVariable, 0, 4);
                solverVariable = this.mTop.mSolverVariable;
                constraintAnchor = this.mParent.mTop;
            } else if (i13 == 3) {
                linearSystem.addEquality(this.mTop.mSolverVariable, this.mBottom.mSolverVariable, 0, 8);
                linearSystem.addEquality(this.mTop.mSolverVariable, this.mParent.mTop.mSolverVariable, 0, 4);
                solverVariable = this.mTop.mSolverVariable;
                constraintAnchor = this.mParent.mBottom;
            } else {
                return;
            }
            linearSystem.addEquality(solverVariable, constraintAnchor.mSolverVariable, 0, 0);
        }
    }

    public boolean allSolved() {
        int i;
        ConstraintAnchor.Type type;
        ConstraintAnchor.Type type2;
        ConstraintAnchor.Type type3;
        int i2;
        int i3;
        int i4 = 0;
        boolean z = true;
        while (true) {
            i = this.mWidgetsCount;
            if (i4 >= i) {
                break;
            }
            ConstraintWidget constraintWidget = this.mWidgets[i4];
            if ((this.mAllowsGoneWidget || constraintWidget.allowedInBarrier()) && ((((i2 = this.mBarrierType) == 0 || i2 == 1) && !constraintWidget.isResolvedHorizontally()) || (((i3 = this.mBarrierType) == 2 || i3 == 3) && !constraintWidget.isResolvedVertically()))) {
                z = false;
            }
            i4++;
        }
        if (!z || i <= 0) {
            return false;
        }
        int i5 = 0;
        boolean z2 = false;
        for (int i6 = 0; i6 < this.mWidgetsCount; i6++) {
            ConstraintWidget constraintWidget2 = this.mWidgets[i6];
            if (this.mAllowsGoneWidget || constraintWidget2.allowedInBarrier()) {
                if (!z2) {
                    int i7 = this.mBarrierType;
                    if (i7 == 0) {
                        type3 = ConstraintAnchor.Type.LEFT;
                    } else if (i7 == 1) {
                        type3 = ConstraintAnchor.Type.RIGHT;
                    } else if (i7 == 2) {
                        type3 = ConstraintAnchor.Type.TOP;
                    } else {
                        if (i7 == 3) {
                            type3 = ConstraintAnchor.Type.BOTTOM;
                        }
                        z2 = true;
                    }
                    i5 = constraintWidget2.getAnchor(type3).getFinalValue();
                    z2 = true;
                }
                int i8 = this.mBarrierType;
                if (i8 == 0) {
                    type2 = ConstraintAnchor.Type.LEFT;
                } else {
                    if (i8 == 1) {
                        type = ConstraintAnchor.Type.RIGHT;
                    } else if (i8 == 2) {
                        type2 = ConstraintAnchor.Type.TOP;
                    } else if (i8 == 3) {
                        type = ConstraintAnchor.Type.BOTTOM;
                    }
                    i5 = Math.max(i5, constraintWidget2.getAnchor(type).getFinalValue());
                }
                i5 = Math.min(i5, constraintWidget2.getAnchor(type2).getFinalValue());
            }
        }
        int i9 = i5 + this.mMargin;
        int i10 = this.mBarrierType;
        if (i10 == 0 || i10 == 1) {
            setFinalHorizontal(i9, i9);
        } else {
            setFinalVertical(i9, i9);
        }
        this.resolved = true;
        return true;
    }

    public boolean allowedInBarrier() {
        return true;
    }

    @Deprecated
    public boolean allowsGoneWidget() {
        return this.mAllowsGoneWidget;
    }

    public void copy(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> hashMap) {
        super.copy(constraintWidget, hashMap);
        Barrier barrier = (Barrier) constraintWidget;
        this.mBarrierType = barrier.mBarrierType;
        this.mAllowsGoneWidget = barrier.mAllowsGoneWidget;
        this.mMargin = barrier.mMargin;
    }

    public boolean getAllowsGoneWidget() {
        return this.mAllowsGoneWidget;
    }

    public int getBarrierType() {
        return this.mBarrierType;
    }

    public int getMargin() {
        return this.mMargin;
    }

    public int getOrientation() {
        int i = this.mBarrierType;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    public boolean isResolvedHorizontally() {
        return this.resolved;
    }

    public boolean isResolvedVertically() {
        return this.resolved;
    }

    /* access modifiers changed from: protected */
    public void markWidgets() {
        for (int i = 0; i < this.mWidgetsCount; i++) {
            ConstraintWidget constraintWidget = this.mWidgets[i];
            if (this.mAllowsGoneWidget || constraintWidget.allowedInBarrier()) {
                int i2 = this.mBarrierType;
                if (i2 == 0 || i2 == 1) {
                    constraintWidget.setInBarrier(0, true);
                } else if (i2 == 2 || i2 == 3) {
                    constraintWidget.setInBarrier(1, true);
                }
            }
        }
    }

    public void setAllowsGoneWidget(boolean z) {
        this.mAllowsGoneWidget = z;
    }

    public void setBarrierType(int i) {
        this.mBarrierType = i;
    }

    public void setMargin(int i) {
        this.mMargin = i;
    }

    public String toString() {
        String str = "[Barrier] " + getDebugName() + " {";
        for (int i = 0; i < this.mWidgetsCount; i++) {
            ConstraintWidget constraintWidget = this.mWidgets[i];
            if (i > 0) {
                str = str + ", ";
            }
            str = str + constraintWidget.getDebugName();
        }
        return str + "}";
    }
}
