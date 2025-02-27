package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.Barrier;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;

class HelperReferences extends WidgetRun {
    public HelperReferences(ConstraintWidget constraintWidget) {
        super(constraintWidget);
    }

    private void addDependency(DependencyNode dependencyNode) {
        this.start.dependencies.add(dependencyNode);
        dependencyNode.targets.add(this.start);
    }

    /* access modifiers changed from: package-private */
    public void apply() {
        WidgetRun widgetRun;
        ConstraintWidget constraintWidget = this.widget;
        if (constraintWidget instanceof Barrier) {
            this.start.delegateToWidgetRun = true;
            Barrier barrier = (Barrier) constraintWidget;
            int barrierType = barrier.getBarrierType();
            boolean allowsGoneWidget = barrier.getAllowsGoneWidget();
            int i = 0;
            if (barrierType == 0) {
                this.start.type = DependencyNode.Type.LEFT;
                while (i < barrier.mWidgetsCount) {
                    ConstraintWidget constraintWidget2 = barrier.mWidgets[i];
                    if (allowsGoneWidget || constraintWidget2.getVisibility() != 8) {
                        DependencyNode dependencyNode = constraintWidget2.horizontalRun.start;
                        dependencyNode.dependencies.add(this.start);
                        this.start.targets.add(dependencyNode);
                    }
                    i++;
                }
            } else if (barrierType != 1) {
                if (barrierType == 2) {
                    this.start.type = DependencyNode.Type.TOP;
                    while (i < barrier.mWidgetsCount) {
                        ConstraintWidget constraintWidget3 = barrier.mWidgets[i];
                        if (allowsGoneWidget || constraintWidget3.getVisibility() != 8) {
                            DependencyNode dependencyNode2 = constraintWidget3.verticalRun.start;
                            dependencyNode2.dependencies.add(this.start);
                            this.start.targets.add(dependencyNode2);
                        }
                        i++;
                    }
                } else if (barrierType == 3) {
                    this.start.type = DependencyNode.Type.BOTTOM;
                    while (i < barrier.mWidgetsCount) {
                        ConstraintWidget constraintWidget4 = barrier.mWidgets[i];
                        if (allowsGoneWidget || constraintWidget4.getVisibility() != 8) {
                            DependencyNode dependencyNode3 = constraintWidget4.verticalRun.end;
                            dependencyNode3.dependencies.add(this.start);
                            this.start.targets.add(dependencyNode3);
                        }
                        i++;
                    }
                } else {
                    return;
                }
                addDependency(this.widget.verticalRun.start);
                widgetRun = this.widget.verticalRun;
                addDependency(widgetRun.end);
            } else {
                this.start.type = DependencyNode.Type.RIGHT;
                while (i < barrier.mWidgetsCount) {
                    ConstraintWidget constraintWidget5 = barrier.mWidgets[i];
                    if (allowsGoneWidget || constraintWidget5.getVisibility() != 8) {
                        DependencyNode dependencyNode4 = constraintWidget5.horizontalRun.end;
                        dependencyNode4.dependencies.add(this.start);
                        this.start.targets.add(dependencyNode4);
                    }
                    i++;
                }
            }
            addDependency(this.widget.horizontalRun.start);
            widgetRun = this.widget.horizontalRun;
            addDependency(widgetRun.end);
        }
    }

    public void applyToWidget() {
        ConstraintWidget constraintWidget = this.widget;
        if (constraintWidget instanceof Barrier) {
            int barrierType = ((Barrier) constraintWidget).getBarrierType();
            if (barrierType == 0 || barrierType == 1) {
                this.widget.setX(this.start.value);
            } else {
                this.widget.setY(this.start.value);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void clear() {
        this.runGroup = null;
        this.start.clear();
    }

    /* access modifiers changed from: package-private */
    public void reset() {
        this.start.resolved = false;
    }

    /* access modifiers changed from: package-private */
    public boolean supportsWrapComputation() {
        return false;
    }

    public void update(Dependency dependency) {
        Barrier barrier = (Barrier) this.widget;
        int barrierType = barrier.getBarrierType();
        int i = 0;
        int i2 = -1;
        for (DependencyNode dependencyNode : this.start.targets) {
            int i3 = dependencyNode.value;
            if (i2 == -1 || i3 < i2) {
                i2 = i3;
            }
            if (i < i3) {
                i = i3;
            }
        }
        if (barrierType == 0 || barrierType == 2) {
            this.start.resolve(i2 + barrier.getMargin());
        } else {
            this.start.resolve(i + barrier.getMargin());
        }
    }
}
