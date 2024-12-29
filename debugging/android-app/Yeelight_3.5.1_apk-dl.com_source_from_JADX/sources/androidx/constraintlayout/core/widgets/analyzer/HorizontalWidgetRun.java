package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.Helper;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.core.widgets.analyzer.WidgetRun;
import java.util.List;

public class HorizontalWidgetRun extends WidgetRun {
    private static int[] tempDimensions = new int[2];

    /* renamed from: androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun$1 */
    static /* synthetic */ class C01891 {

        /* renamed from: $SwitchMap$androidx$constraintlayout$core$widgets$analyzer$WidgetRun$RunType */
        static final /* synthetic */ int[] f59x56910102;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                androidx.constraintlayout.core.widgets.analyzer.WidgetRun$RunType[] r0 = androidx.constraintlayout.core.widgets.analyzer.WidgetRun.RunType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f59x56910102 = r0
                androidx.constraintlayout.core.widgets.analyzer.WidgetRun$RunType r1 = androidx.constraintlayout.core.widgets.analyzer.WidgetRun.RunType.START     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f59x56910102     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.constraintlayout.core.widgets.analyzer.WidgetRun$RunType r1 = androidx.constraintlayout.core.widgets.analyzer.WidgetRun.RunType.END     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f59x56910102     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.constraintlayout.core.widgets.analyzer.WidgetRun$RunType r1 = androidx.constraintlayout.core.widgets.analyzer.WidgetRun.RunType.CENTER     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun.C01891.<clinit>():void");
        }
    }

    public HorizontalWidgetRun(ConstraintWidget constraintWidget) {
        super(constraintWidget);
        this.start.type = DependencyNode.Type.LEFT;
        this.end.type = DependencyNode.Type.RIGHT;
        this.orientation = 0;
    }

    private void computeInsetRatio(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 == -1) {
            int i8 = (int) ((((float) i7) * f) + 0.5f);
            int i9 = (int) ((((float) i6) / f) + 0.5f);
            if (i8 <= i6) {
                iArr[0] = i8;
                iArr[1] = i7;
            } else if (i9 <= i7) {
                iArr[0] = i6;
                iArr[1] = i9;
            }
        } else if (i5 == 0) {
            iArr[0] = (int) ((((float) i7) * f) + 0.5f);
            iArr[1] = i7;
        } else if (i5 == 1) {
            iArr[0] = i6;
            iArr[1] = (int) ((((float) i6) * f) + 0.5f);
        }
    }

    /* access modifiers changed from: package-private */
    public void apply() {
        ConstraintAnchor constraintAnchor;
        DependencyNode dependencyNode;
        int i;
        DependencyNode dependencyNode2;
        DependencyNode dependencyNode3;
        Object obj;
        List list;
        DependencyNode dependencyNode4;
        int i2;
        DependencyNode dependencyNode5;
        DependencyNode dependencyNode6;
        int i3;
        DependencyNode dependencyNode7;
        DependencyNode dependencyNode8;
        ConstraintWidget parent;
        ConstraintWidget parent2;
        ConstraintWidget constraintWidget = this.widget;
        if (constraintWidget.measured) {
            this.dimension.resolve(constraintWidget.getWidth());
        }
        if (!this.dimension.resolved) {
            ConstraintWidget.DimensionBehaviour horizontalDimensionBehaviour = this.widget.getHorizontalDimensionBehaviour();
            this.dimensionBehavior = horizontalDimensionBehaviour;
            if (horizontalDimensionBehaviour != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
                if (horizontalDimensionBehaviour == dimensionBehaviour && (parent2 = this.widget.getParent()) != null && (parent2.getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.FIXED || parent2.getHorizontalDimensionBehaviour() == dimensionBehaviour)) {
                    int width = (parent2.getWidth() - this.widget.mLeft.getMargin()) - this.widget.mRight.getMargin();
                    addTarget(this.start, parent2.horizontalRun.start, this.widget.mLeft.getMargin());
                    addTarget(this.end, parent2.horizontalRun.end, -this.widget.mRight.getMargin());
                    this.dimension.resolve(width);
                    return;
                } else if (this.dimensionBehavior == ConstraintWidget.DimensionBehaviour.FIXED) {
                    this.dimension.resolve(this.widget.getWidth());
                }
            }
        } else {
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = this.dimensionBehavior;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
            if (dimensionBehaviour2 == dimensionBehaviour3 && (parent = this.widget.getParent()) != null && (parent.getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.FIXED || parent.getHorizontalDimensionBehaviour() == dimensionBehaviour3)) {
                addTarget(this.start, parent.horizontalRun.start, this.widget.mLeft.getMargin());
                addTarget(this.end, parent.horizontalRun.end, -this.widget.mRight.getMargin());
                return;
            }
        }
        DimensionDependency dimensionDependency = this.dimension;
        if (dimensionDependency.resolved) {
            ConstraintWidget constraintWidget2 = this.widget;
            if (constraintWidget2.measured) {
                ConstraintAnchor[] constraintAnchorArr = constraintWidget2.mListAnchors;
                if (constraintAnchorArr[0].mTarget == null || constraintAnchorArr[1].mTarget == null) {
                    if (constraintAnchorArr[0].mTarget != null) {
                        dependencyNode8 = getTarget(constraintAnchorArr[0]);
                        if (dependencyNode8 != null) {
                            dependencyNode7 = this.start;
                            i3 = this.widget.mListAnchors[0].getMargin();
                        } else {
                            return;
                        }
                    } else if (constraintAnchorArr[1].mTarget != null) {
                        DependencyNode target = getTarget(constraintAnchorArr[1]);
                        if (target != null) {
                            addTarget(this.end, target, -this.widget.mListAnchors[1].getMargin());
                            dependencyNode6 = this.start;
                            dependencyNode5 = this.end;
                            i2 = -this.dimension.value;
                            addTarget(dependencyNode6, dependencyNode5, i2);
                            return;
                        }
                        return;
                    } else if (!(constraintWidget2 instanceof Helper) && constraintWidget2.getParent() != null && this.widget.getAnchor(ConstraintAnchor.Type.CENTER).mTarget == null) {
                        dependencyNode8 = this.widget.getParent().horizontalRun.start;
                        dependencyNode7 = this.start;
                        i3 = this.widget.getX();
                    } else {
                        return;
                    }
                    addTarget(dependencyNode7, dependencyNode8, i3);
                    dependencyNode6 = this.end;
                    dependencyNode5 = this.start;
                    i2 = this.dimension.value;
                    addTarget(dependencyNode6, dependencyNode5, i2);
                    return;
                } else if (constraintWidget2.isInHorizontalChain()) {
                    this.start.margin = this.widget.mListAnchors[0].getMargin();
                    dependencyNode = this.end;
                    constraintAnchor = this.widget.mListAnchors[1];
                    dependencyNode.margin = -constraintAnchor.getMargin();
                } else {
                    DependencyNode target2 = getTarget(this.widget.mListAnchors[0]);
                    if (target2 != null) {
                        addTarget(this.start, target2, this.widget.mListAnchors[0].getMargin());
                    }
                    DependencyNode target3 = getTarget(this.widget.mListAnchors[1]);
                    if (target3 != null) {
                        addTarget(this.end, target3, -this.widget.mListAnchors[1].getMargin());
                    }
                    this.start.delegateToWidgetRun = true;
                    this.end.delegateToWidgetRun = true;
                    return;
                }
            }
        }
        if (this.dimensionBehavior == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            ConstraintWidget constraintWidget3 = this.widget;
            int i4 = constraintWidget3.mMatchConstraintDefaultWidth;
            if (i4 == 2) {
                ConstraintWidget parent3 = constraintWidget3.getParent();
                if (parent3 != null) {
                    DimensionDependency dimensionDependency2 = parent3.verticalRun.dimension;
                    this.dimension.targets.add(dimensionDependency2);
                    dimensionDependency2.dependencies.add(this.dimension);
                    DimensionDependency dimensionDependency3 = this.dimension;
                    dimensionDependency3.delegateToWidgetRun = true;
                    dimensionDependency3.dependencies.add(this.start);
                    list = this.dimension.dependencies;
                    obj = this.end;
                }
            } else if (i4 == 3) {
                if (constraintWidget3.mMatchConstraintDefaultHeight == 3) {
                    this.start.updateDelegate = this;
                    this.end.updateDelegate = this;
                    VerticalWidgetRun verticalWidgetRun = constraintWidget3.verticalRun;
                    verticalWidgetRun.start.updateDelegate = this;
                    verticalWidgetRun.end.updateDelegate = this;
                    dimensionDependency.updateDelegate = this;
                    if (constraintWidget3.isInVerticalChain()) {
                        this.dimension.targets.add(this.widget.verticalRun.dimension);
                        this.widget.verticalRun.dimension.dependencies.add(this.dimension);
                        VerticalWidgetRun verticalWidgetRun2 = this.widget.verticalRun;
                        verticalWidgetRun2.dimension.updateDelegate = this;
                        this.dimension.targets.add(verticalWidgetRun2.start);
                        this.dimension.targets.add(this.widget.verticalRun.end);
                        this.widget.verticalRun.start.dependencies.add(this.dimension);
                        list = this.widget.verticalRun.end.dependencies;
                        obj = this.dimension;
                    } else if (this.widget.isInHorizontalChain()) {
                        this.widget.verticalRun.dimension.targets.add(this.dimension);
                        list = this.dimension.dependencies;
                        obj = this.widget.verticalRun.dimension;
                    } else {
                        dependencyNode4 = this.widget.verticalRun.dimension;
                    }
                } else {
                    DimensionDependency dimensionDependency4 = constraintWidget3.verticalRun.dimension;
                    dimensionDependency.targets.add(dimensionDependency4);
                    dimensionDependency4.dependencies.add(this.dimension);
                    this.widget.verticalRun.start.dependencies.add(this.dimension);
                    this.widget.verticalRun.end.dependencies.add(this.dimension);
                    DimensionDependency dimensionDependency5 = this.dimension;
                    dimensionDependency5.delegateToWidgetRun = true;
                    dimensionDependency5.dependencies.add(this.start);
                    this.dimension.dependencies.add(this.end);
                    this.start.targets.add(this.dimension);
                    dependencyNode4 = this.end;
                }
                list = dependencyNode4.targets;
                obj = this.dimension;
            }
            list.add(obj);
        }
        ConstraintWidget constraintWidget4 = this.widget;
        ConstraintAnchor[] constraintAnchorArr2 = constraintWidget4.mListAnchors;
        if (constraintAnchorArr2[0].mTarget == null || constraintAnchorArr2[1].mTarget == null) {
            if (constraintAnchorArr2[0].mTarget != null) {
                dependencyNode3 = getTarget(constraintAnchorArr2[0]);
                if (dependencyNode3 != null) {
                    dependencyNode2 = this.start;
                    i = this.widget.mListAnchors[0].getMargin();
                } else {
                    return;
                }
            } else if (constraintAnchorArr2[1].mTarget != null) {
                DependencyNode target4 = getTarget(constraintAnchorArr2[1]);
                if (target4 != null) {
                    addTarget(this.end, target4, -this.widget.mListAnchors[1].getMargin());
                    addTarget(this.start, this.end, -1, this.dimension);
                    return;
                }
                return;
            } else if (!(constraintWidget4 instanceof Helper) && constraintWidget4.getParent() != null) {
                dependencyNode3 = this.widget.getParent().horizontalRun.start;
                dependencyNode2 = this.start;
                i = this.widget.getX();
            } else {
                return;
            }
            addTarget(dependencyNode2, dependencyNode3, i);
            addTarget(this.end, this.start, 1, this.dimension);
        } else if (constraintWidget4.isInHorizontalChain()) {
            this.start.margin = this.widget.mListAnchors[0].getMargin();
            dependencyNode = this.end;
            constraintAnchor = this.widget.mListAnchors[1];
            dependencyNode.margin = -constraintAnchor.getMargin();
        } else {
            DependencyNode target5 = getTarget(this.widget.mListAnchors[0]);
            DependencyNode target6 = getTarget(this.widget.mListAnchors[1]);
            if (target5 != null) {
                target5.addDependency(this);
            }
            if (target6 != null) {
                target6.addDependency(this);
            }
            this.mRunType = WidgetRun.RunType.CENTER;
        }
    }

    public void applyToWidget() {
        DependencyNode dependencyNode = this.start;
        if (dependencyNode.resolved) {
            this.widget.setX(dependencyNode.value);
        }
    }

    /* access modifiers changed from: package-private */
    public void clear() {
        this.runGroup = null;
        this.start.clear();
        this.end.clear();
        this.dimension.clear();
        this.resolved = false;
    }

    /* access modifiers changed from: package-private */
    public void reset() {
        this.resolved = false;
        this.start.clear();
        this.start.resolved = false;
        this.end.clear();
        this.end.resolved = false;
        this.dimension.resolved = false;
    }

    /* access modifiers changed from: package-private */
    public boolean supportsWrapComputation() {
        return this.dimensionBehavior != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || this.widget.mMatchConstraintDefaultWidth == 0;
    }

    public String toString() {
        return "HorizontalRun " + this.widget.getDebugName();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0299, code lost:
        if (r14 != 1) goto L_0x02ee;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void update(androidx.constraintlayout.core.widgets.analyzer.Dependency r17) {
        /*
            r16 = this;
            r8 = r16
            int[] r0 = androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun.C01891.f59x56910102
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun$RunType r1 = r8.mRunType
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 2
            r2 = 3
            r9 = 1
            r10 = 0
            if (r0 == r9) goto L_0x0029
            if (r0 == r1) goto L_0x0023
            if (r0 == r2) goto L_0x0017
            goto L_0x002e
        L_0x0017:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r0.mLeft
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.mRight
            r3 = r17
            r8.updateRunCenter(r3, r1, r0, r10)
            return
        L_0x0023:
            r3 = r17
            r16.updateRunEnd(r17)
            goto L_0x002e
        L_0x0029:
            r3 = r17
            r16.updateRunStart(r17)
        L_0x002e:
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r8.dimension
            boolean r0 = r0.resolved
            r11 = 1056964608(0x3f000000, float:0.5)
            if (r0 != 0) goto L_0x02ee
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = r8.dimensionBehavior
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r0 != r3) goto L_0x02ee
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.widget
            int r3 = r0.mMatchConstraintDefaultWidth
            if (r3 == r1) goto L_0x02d3
            if (r3 == r2) goto L_0x0046
            goto L_0x02ee
        L_0x0046:
            int r1 = r0.mMatchConstraintDefaultHeight
            r3 = -1
            if (r1 == 0) goto L_0x0081
            if (r1 != r2) goto L_0x004e
            goto L_0x0081
        L_0x004e:
            int r0 = r0.getDimensionRatioSide()
            if (r0 == r3) goto L_0x0069
            if (r0 == 0) goto L_0x005a
            if (r0 == r9) goto L_0x0069
            r0 = 0
            goto L_0x007a
        L_0x005a:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.widget
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r1 = r0.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r1 = r1.dimension
            int r1 = r1.value
            float r1 = (float) r1
            float r0 = r0.getDimensionRatio()
            float r1 = r1 / r0
            goto L_0x0078
        L_0x0069:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.widget
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r1 = r0.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r1 = r1.dimension
            int r1 = r1.value
            float r1 = (float) r1
            float r0 = r0.getDimensionRatio()
            float r1 = r1 * r0
        L_0x0078:
            float r1 = r1 + r11
            int r0 = (int) r1
        L_0x007a:
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r1 = r8.dimension
            r1.resolve(r0)
            goto L_0x02ee
        L_0x0081:
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r1 = r0.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r12 = r1.start
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r13 = r1.end
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r0.mLeft
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r1.mTarget
            if (r1 == 0) goto L_0x008f
            r1 = 1
            goto L_0x0090
        L_0x008f:
            r1 = 0
        L_0x0090:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r0.mTop
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.mTarget
            if (r2 == 0) goto L_0x0098
            r2 = 1
            goto L_0x0099
        L_0x0098:
            r2 = 0
        L_0x0099:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r0.mRight
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r4.mTarget
            if (r4 == 0) goto L_0x00a1
            r4 = 1
            goto L_0x00a2
        L_0x00a1:
            r4 = 0
        L_0x00a2:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r0.mBottom
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r5.mTarget
            if (r5 == 0) goto L_0x00aa
            r5 = 1
            goto L_0x00ab
        L_0x00aa:
            r5 = 0
        L_0x00ab:
            int r14 = r0.getDimensionRatioSide()
            if (r1 == 0) goto L_0x01ef
            if (r2 == 0) goto L_0x01ef
            if (r4 == 0) goto L_0x01ef
            if (r5 == 0) goto L_0x01ef
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.widget
            float r15 = r0.getDimensionRatio()
            boolean r0 = r12.resolved
            if (r0 == 0) goto L_0x0120
            boolean r0 = r13.resolved
            if (r0 == 0) goto L_0x0120
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.start
            boolean r1 = r0.readyToSolve
            if (r1 == 0) goto L_0x011f
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r8.end
            boolean r1 = r1.readyToSolve
            if (r1 != 0) goto L_0x00d2
            goto L_0x011f
        L_0x00d2:
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r0.targets
            java.lang.Object r0 = r0.get(r10)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r0
            int r0 = r0.value
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r8.start
            int r1 = r1.margin
            int r2 = r0 + r1
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.end
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r0.targets
            java.lang.Object r0 = r0.get(r10)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r0
            int r0 = r0.value
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r8.end
            int r1 = r1.margin
            int r3 = r0 - r1
            int r0 = r12.value
            int r1 = r12.margin
            int r4 = r0 + r1
            int r0 = r13.value
            int r1 = r13.margin
            int r5 = r0 - r1
            int[] r1 = tempDimensions
            r0 = r16
            r6 = r15
            r7 = r14
            r0.computeInsetRatio(r1, r2, r3, r4, r5, r6, r7)
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r8.dimension
            int[] r1 = tempDimensions
            r1 = r1[r10]
            r0.resolve(r1)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.widget
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r0 = r0.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r0.dimension
            int[] r1 = tempDimensions
            r1 = r1[r9]
            r0.resolve(r1)
        L_0x011f:
            return
        L_0x0120:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.start
            boolean r1 = r0.resolved
            if (r1 == 0) goto L_0x017d
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r8.end
            boolean r2 = r1.resolved
            if (r2 == 0) goto L_0x017d
            boolean r2 = r12.readyToSolve
            if (r2 == 0) goto L_0x017c
            boolean r2 = r13.readyToSolve
            if (r2 != 0) goto L_0x0135
            goto L_0x017c
        L_0x0135:
            int r2 = r0.value
            int r0 = r0.margin
            int r2 = r2 + r0
            int r0 = r1.value
            int r1 = r1.margin
            int r3 = r0 - r1
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r12.targets
            java.lang.Object r0 = r0.get(r10)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r0
            int r0 = r0.value
            int r1 = r12.margin
            int r4 = r0 + r1
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r13.targets
            java.lang.Object r0 = r0.get(r10)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r0
            int r0 = r0.value
            int r1 = r13.margin
            int r5 = r0 - r1
            int[] r1 = tempDimensions
            r0 = r16
            r6 = r15
            r7 = r14
            r0.computeInsetRatio(r1, r2, r3, r4, r5, r6, r7)
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r8.dimension
            int[] r1 = tempDimensions
            r1 = r1[r10]
            r0.resolve(r1)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.widget
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r0 = r0.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r0.dimension
            int[] r1 = tempDimensions
            r1 = r1[r9]
            r0.resolve(r1)
            goto L_0x017d
        L_0x017c:
            return
        L_0x017d:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.start
            boolean r1 = r0.readyToSolve
            if (r1 == 0) goto L_0x01ee
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r8.end
            boolean r1 = r1.readyToSolve
            if (r1 == 0) goto L_0x01ee
            boolean r1 = r12.readyToSolve
            if (r1 == 0) goto L_0x01ee
            boolean r1 = r13.readyToSolve
            if (r1 != 0) goto L_0x0192
            goto L_0x01ee
        L_0x0192:
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r0.targets
            java.lang.Object r0 = r0.get(r10)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r0
            int r0 = r0.value
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r8.start
            int r1 = r1.margin
            int r2 = r0 + r1
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.end
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r0.targets
            java.lang.Object r0 = r0.get(r10)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r0
            int r0 = r0.value
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r8.end
            int r1 = r1.margin
            int r3 = r0 - r1
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r12.targets
            java.lang.Object r0 = r0.get(r10)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r0
            int r0 = r0.value
            int r1 = r12.margin
            int r4 = r0 + r1
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r13.targets
            java.lang.Object r0 = r0.get(r10)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r0
            int r0 = r0.value
            int r1 = r13.margin
            int r5 = r0 - r1
            int[] r1 = tempDimensions
            r0 = r16
            r6 = r15
            r7 = r14
            r0.computeInsetRatio(r1, r2, r3, r4, r5, r6, r7)
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r8.dimension
            int[] r1 = tempDimensions
            r1 = r1[r10]
            r0.resolve(r1)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.widget
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r0 = r0.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r0.dimension
            int[] r1 = tempDimensions
            r1 = r1[r9]
            goto L_0x02ce
        L_0x01ee:
            return
        L_0x01ef:
            if (r1 == 0) goto L_0x0268
            if (r4 == 0) goto L_0x0268
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.start
            boolean r0 = r0.readyToSolve
            if (r0 == 0) goto L_0x0267
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.end
            boolean r0 = r0.readyToSolve
            if (r0 != 0) goto L_0x0200
            goto L_0x0267
        L_0x0200:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.widget
            float r0 = r0.getDimensionRatio()
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r8.start
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r1 = r1.targets
            java.lang.Object r1 = r1.get(r10)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r1
            int r1 = r1.value
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r8.start
            int r2 = r2.margin
            int r1 = r1 + r2
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r8.end
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r2 = r2.targets
            java.lang.Object r2 = r2.get(r10)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r2
            int r2 = r2.value
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r4 = r8.end
            int r4 = r4.margin
            int r2 = r2 - r4
            if (r14 == r3) goto L_0x0243
            if (r14 == 0) goto L_0x0243
            if (r14 == r9) goto L_0x0230
            goto L_0x02ee
        L_0x0230:
            int r2 = r2 - r1
            int r1 = r8.getLimitedDimension(r2, r10)
            float r2 = (float) r1
            float r2 = r2 / r0
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.getLimitedDimension(r2, r9)
            if (r2 == r3) goto L_0x0257
            float r1 = (float) r3
            float r1 = r1 * r0
            goto L_0x0255
        L_0x0243:
            int r2 = r2 - r1
            int r1 = r8.getLimitedDimension(r2, r10)
            float r2 = (float) r1
            float r2 = r2 * r0
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.getLimitedDimension(r2, r9)
            if (r2 == r3) goto L_0x0257
            float r1 = (float) r3
            float r1 = r1 / r0
        L_0x0255:
            float r1 = r1 + r11
            int r1 = (int) r1
        L_0x0257:
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r8.dimension
            r0.resolve(r1)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.widget
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r0 = r0.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r0.dimension
            r0.resolve(r3)
            goto L_0x02ee
        L_0x0267:
            return
        L_0x0268:
            if (r2 == 0) goto L_0x02ee
            if (r5 == 0) goto L_0x02ee
            boolean r0 = r12.readyToSolve
            if (r0 == 0) goto L_0x02d2
            boolean r0 = r13.readyToSolve
            if (r0 != 0) goto L_0x0275
            goto L_0x02d2
        L_0x0275:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.widget
            float r0 = r0.getDimensionRatio()
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r1 = r12.targets
            java.lang.Object r1 = r1.get(r10)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r1
            int r1 = r1.value
            int r2 = r12.margin
            int r1 = r1 + r2
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r2 = r13.targets
            java.lang.Object r2 = r2.get(r10)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r2
            int r2 = r2.value
            int r4 = r13.margin
            int r2 = r2 - r4
            if (r14 == r3) goto L_0x02af
            if (r14 == 0) goto L_0x029c
            if (r14 == r9) goto L_0x02af
            goto L_0x02ee
        L_0x029c:
            int r2 = r2 - r1
            int r1 = r8.getLimitedDimension(r2, r9)
            float r2 = (float) r1
            float r2 = r2 * r0
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.getLimitedDimension(r2, r10)
            if (r2 == r3) goto L_0x02c3
            float r1 = (float) r3
            float r1 = r1 / r0
            goto L_0x02c1
        L_0x02af:
            int r2 = r2 - r1
            int r1 = r8.getLimitedDimension(r2, r9)
            float r2 = (float) r1
            float r2 = r2 / r0
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.getLimitedDimension(r2, r10)
            if (r2 == r3) goto L_0x02c3
            float r1 = (float) r3
            float r1 = r1 * r0
        L_0x02c1:
            float r1 = r1 + r11
            int r1 = (int) r1
        L_0x02c3:
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r8.dimension
            r0.resolve(r3)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.widget
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r0 = r0.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r0.dimension
        L_0x02ce:
            r0.resolve(r1)
            goto L_0x02ee
        L_0x02d2:
            return
        L_0x02d3:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r0.getParent()
            if (r0 == 0) goto L_0x02ee
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r0 = r0.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r0.dimension
            boolean r1 = r0.resolved
            if (r1 == 0) goto L_0x02ee
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r8.widget
            float r1 = r1.mMatchConstraintPercentWidth
            int r0 = r0.value
            float r0 = (float) r0
            float r0 = r0 * r1
            float r0 = r0 + r11
            int r0 = (int) r0
            goto L_0x007a
        L_0x02ee:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.start
            boolean r1 = r0.readyToSolve
            if (r1 == 0) goto L_0x0410
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r8.end
            boolean r2 = r1.readyToSolve
            if (r2 != 0) goto L_0x02fc
            goto L_0x0410
        L_0x02fc:
            boolean r0 = r0.resolved
            if (r0 == 0) goto L_0x030b
            boolean r0 = r1.resolved
            if (r0 == 0) goto L_0x030b
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r8.dimension
            boolean r0 = r0.resolved
            if (r0 == 0) goto L_0x030b
            return
        L_0x030b:
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r8.dimension
            boolean r0 = r0.resolved
            if (r0 != 0) goto L_0x0355
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = r8.dimensionBehavior
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r0 != r1) goto L_0x0355
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.widget
            int r1 = r0.mMatchConstraintDefaultWidth
            if (r1 != 0) goto L_0x0355
            boolean r0 = r0.isInHorizontalChain()
            if (r0 != 0) goto L_0x0355
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.start
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r0.targets
            java.lang.Object r0 = r0.get(r10)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r0
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r8.end
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r1 = r1.targets
            java.lang.Object r1 = r1.get(r10)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r1
            int r0 = r0.value
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r8.start
            int r3 = r2.margin
            int r0 = r0 + r3
            int r1 = r1.value
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r3 = r8.end
            int r3 = r3.margin
            int r1 = r1 + r3
            int r3 = r1 - r0
            r2.resolve(r0)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.end
            r0.resolve(r1)
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r8.dimension
            r0.resolve(r3)
            return
        L_0x0355:
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r8.dimension
            boolean r0 = r0.resolved
            if (r0 != 0) goto L_0x03b9
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = r8.dimensionBehavior
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r0 != r1) goto L_0x03b9
            int r0 = r8.matchConstraintsType
            if (r0 != r9) goto L_0x03b9
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.start
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r0.targets
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x03b9
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.end
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r0.targets
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x03b9
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.start
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r0.targets
            java.lang.Object r0 = r0.get(r10)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r0
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r8.end
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r1 = r1.targets
            java.lang.Object r1 = r1.get(r10)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r1
            int r0 = r0.value
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r8.start
            int r2 = r2.margin
            int r0 = r0 + r2
            int r1 = r1.value
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r8.end
            int r2 = r2.margin
            int r1 = r1 + r2
            int r1 = r1 - r0
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r8.dimension
            int r0 = r0.wrapValue
            int r0 = java.lang.Math.min(r1, r0)
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r8.widget
            int r2 = r1.mMatchConstraintMaxWidth
            int r1 = r1.mMatchConstraintMinWidth
            int r0 = java.lang.Math.max(r1, r0)
            if (r2 <= 0) goto L_0x03b4
            int r0 = java.lang.Math.min(r2, r0)
        L_0x03b4:
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r1 = r8.dimension
            r1.resolve(r0)
        L_0x03b9:
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r8.dimension
            boolean r0 = r0.resolved
            if (r0 != 0) goto L_0x03c0
            return
        L_0x03c0:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.start
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r0.targets
            java.lang.Object r0 = r0.get(r10)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r0
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r8.end
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r1 = r1.targets
            java.lang.Object r1 = r1.get(r10)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r1
            int r2 = r0.value
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r3 = r8.start
            int r3 = r3.margin
            int r2 = r2 + r3
            int r3 = r1.value
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r4 = r8.end
            int r4 = r4.margin
            int r3 = r3 + r4
            androidx.constraintlayout.core.widgets.ConstraintWidget r4 = r8.widget
            float r4 = r4.getHorizontalBiasPercent()
            if (r0 != r1) goto L_0x03f0
            int r2 = r0.value
            int r3 = r1.value
            r4 = 1056964608(0x3f000000, float:0.5)
        L_0x03f0:
            int r3 = r3 - r2
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r8.dimension
            int r0 = r0.value
            int r3 = r3 - r0
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.start
            float r1 = (float) r2
            float r1 = r1 + r11
            float r2 = (float) r3
            float r2 = r2 * r4
            float r1 = r1 + r2
            int r1 = (int) r1
            r0.resolve(r1)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.end
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r8.start
            int r1 = r1.value
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r2 = r8.dimension
            int r2 = r2.value
            int r1 = r1 + r2
            r0.resolve(r1)
        L_0x0410:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun.update(androidx.constraintlayout.core.widgets.analyzer.Dependency):void");
    }
}
