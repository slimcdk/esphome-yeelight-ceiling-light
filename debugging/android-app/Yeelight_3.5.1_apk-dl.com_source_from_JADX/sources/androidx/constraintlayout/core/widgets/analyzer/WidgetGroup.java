package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.widgets.Chain;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

public class WidgetGroup {
    private static final boolean DEBUG = false;
    static int count;
    boolean authoritative = false;

    /* renamed from: id */
    int f61id = -1;
    private int moveTo = -1;
    int orientation = 0;
    ArrayList<MeasureResult> results = null;
    ArrayList<ConstraintWidget> widgets = new ArrayList<>();

    class MeasureResult {
        int baseline;
        int bottom;
        int left;
        int orientation;
        int right;
        int top;
        WeakReference<ConstraintWidget> widgetRef;

        public MeasureResult(ConstraintWidget constraintWidget, LinearSystem linearSystem, int i) {
            this.widgetRef = new WeakReference<>(constraintWidget);
            this.left = linearSystem.getObjectVariableValue(constraintWidget.mLeft);
            this.top = linearSystem.getObjectVariableValue(constraintWidget.mTop);
            this.right = linearSystem.getObjectVariableValue(constraintWidget.mRight);
            this.bottom = linearSystem.getObjectVariableValue(constraintWidget.mBottom);
            this.baseline = linearSystem.getObjectVariableValue(constraintWidget.mBaseline);
            this.orientation = i;
        }

        public void apply() {
            ConstraintWidget constraintWidget = (ConstraintWidget) this.widgetRef.get();
            if (constraintWidget != null) {
                constraintWidget.setFinalFrame(this.left, this.top, this.right, this.bottom, this.baseline, this.orientation);
            }
        }
    }

    public WidgetGroup(int i) {
        int i2 = count;
        count = i2 + 1;
        this.f61id = i2;
        this.orientation = i;
    }

    private boolean contains(ConstraintWidget constraintWidget) {
        return this.widgets.contains(constraintWidget);
    }

    private String getOrientationString() {
        int i = this.orientation;
        return i == 0 ? "Horizontal" : i == 1 ? "Vertical" : i == 2 ? "Both" : "Unknown";
    }

    private int measureWrap(int i, ConstraintWidget constraintWidget) {
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = constraintWidget.getDimensionBehaviour(i);
        if (dimensionBehaviour == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || dimensionBehaviour == ConstraintWidget.DimensionBehaviour.MATCH_PARENT || dimensionBehaviour == ConstraintWidget.DimensionBehaviour.FIXED) {
            return i == 0 ? constraintWidget.getWidth() : constraintWidget.getHeight();
        }
        return -1;
    }

    private int solverMeasure(LinearSystem linearSystem, ArrayList<ConstraintWidget> arrayList, int i) {
        int objectVariableValue;
        ConstraintAnchor constraintAnchor;
        ConstraintWidgetContainer constraintWidgetContainer = (ConstraintWidgetContainer) arrayList.get(0).getParent();
        linearSystem.reset();
        constraintWidgetContainer.addToSolver(linearSystem, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            arrayList.get(i2).addToSolver(linearSystem, false);
        }
        if (i == 0 && constraintWidgetContainer.mHorizontalChainsSize > 0) {
            Chain.applyChainConstraints(constraintWidgetContainer, linearSystem, arrayList, 0);
        }
        if (i == 1 && constraintWidgetContainer.mVerticalChainsSize > 0) {
            Chain.applyChainConstraints(constraintWidgetContainer, linearSystem, arrayList, 1);
        }
        try {
            linearSystem.minimize();
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.results = new ArrayList<>();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            this.results.add(new MeasureResult(arrayList.get(i3), linearSystem, i));
        }
        if (i == 0) {
            objectVariableValue = linearSystem.getObjectVariableValue(constraintWidgetContainer.mLeft);
            constraintAnchor = constraintWidgetContainer.mRight;
        } else {
            objectVariableValue = linearSystem.getObjectVariableValue(constraintWidgetContainer.mTop);
            constraintAnchor = constraintWidgetContainer.mBottom;
        }
        int objectVariableValue2 = linearSystem.getObjectVariableValue(constraintAnchor);
        linearSystem.reset();
        return objectVariableValue2 - objectVariableValue;
    }

    public boolean add(ConstraintWidget constraintWidget) {
        if (this.widgets.contains(constraintWidget)) {
            return false;
        }
        this.widgets.add(constraintWidget);
        return true;
    }

    public void apply() {
        if (this.results != null && this.authoritative) {
            for (int i = 0; i < this.results.size(); i++) {
                this.results.get(i).apply();
            }
        }
    }

    public void cleanup(ArrayList<WidgetGroup> arrayList) {
        int size = this.widgets.size();
        if (this.moveTo != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                WidgetGroup widgetGroup = arrayList.get(i);
                if (this.moveTo == widgetGroup.f61id) {
                    moveTo(this.orientation, widgetGroup);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public void clear() {
        this.widgets.clear();
    }

    public int getId() {
        return this.f61id;
    }

    public int getOrientation() {
        return this.orientation;
    }

    public boolean intersectWith(WidgetGroup widgetGroup) {
        for (int i = 0; i < this.widgets.size(); i++) {
            if (widgetGroup.contains(this.widgets.get(i))) {
                return true;
            }
        }
        return false;
    }

    public boolean isAuthoritative() {
        return this.authoritative;
    }

    public int measureWrap(LinearSystem linearSystem, int i) {
        if (this.widgets.size() == 0) {
            return 0;
        }
        return solverMeasure(linearSystem, this.widgets, i);
    }

    public void moveTo(int i, WidgetGroup widgetGroup) {
        Iterator<ConstraintWidget> it = this.widgets.iterator();
        while (it.hasNext()) {
            ConstraintWidget next = it.next();
            widgetGroup.add(next);
            int id = widgetGroup.getId();
            if (i == 0) {
                next.horizontalGroup = id;
            } else {
                next.verticalGroup = id;
            }
        }
        this.moveTo = widgetGroup.f61id;
    }

    public void setAuthoritative(boolean z) {
        this.authoritative = z;
    }

    public void setOrientation(int i) {
        this.orientation = i;
    }

    public int size() {
        return this.widgets.size();
    }

    public String toString() {
        String str = getOrientationString() + " [" + this.f61id + "] <";
        Iterator<ConstraintWidget> it = this.widgets.iterator();
        while (it.hasNext()) {
            str = str + " " + it.next().getDebugName();
        }
        return str + " >";
    }
}
