package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;

public class Placeholder extends VirtualLayout {
    public void addToSolver(LinearSystem linearSystem, boolean z) {
        super.addToSolver(linearSystem, z);
        if (this.mWidgetsCount > 0) {
            ConstraintWidget constraintWidget = this.mWidgets[0];
            constraintWidget.resetAllConstraints();
            ConstraintAnchor.Type type = ConstraintAnchor.Type.LEFT;
            constraintWidget.connect(type, (ConstraintWidget) this, type);
            ConstraintAnchor.Type type2 = ConstraintAnchor.Type.RIGHT;
            constraintWidget.connect(type2, (ConstraintWidget) this, type2);
            ConstraintAnchor.Type type3 = ConstraintAnchor.Type.TOP;
            constraintWidget.connect(type3, (ConstraintWidget) this, type3);
            ConstraintAnchor.Type type4 = ConstraintAnchor.Type.BOTTOM;
            constraintWidget.connect(type4, (ConstraintWidget) this, type4);
        }
    }

    public void measure(int i, int i2, int i3, int i4) {
        boolean z = false;
        int paddingLeft = getPaddingLeft() + getPaddingRight() + 0;
        int paddingTop = getPaddingTop() + getPaddingBottom() + 0;
        if (this.mWidgetsCount > 0) {
            paddingLeft += this.mWidgets[0].getWidth();
            paddingTop += this.mWidgets[0].getHeight();
        }
        int max = Math.max(getMinWidth(), paddingLeft);
        int max2 = Math.max(getMinHeight(), paddingTop);
        if (i != 1073741824) {
            i2 = i == Integer.MIN_VALUE ? Math.min(max, i2) : i == 0 ? max : 0;
        }
        if (i3 != 1073741824) {
            i4 = i3 == Integer.MIN_VALUE ? Math.min(max2, i4) : i3 == 0 ? max2 : 0;
        }
        setMeasure(i2, i4);
        setWidth(i2);
        setHeight(i4);
        if (this.mWidgetsCount > 0) {
            z = true;
        }
        needsCallbackFromSolver(z);
    }
}
