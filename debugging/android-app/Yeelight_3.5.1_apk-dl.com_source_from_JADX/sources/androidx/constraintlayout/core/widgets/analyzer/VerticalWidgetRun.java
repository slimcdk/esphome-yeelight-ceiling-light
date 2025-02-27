package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;

public class VerticalWidgetRun extends WidgetRun {
    public DependencyNode baseline;
    DimensionDependency baselineDimension = null;

    /* renamed from: androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun$1 */
    static /* synthetic */ class C01901 {

        /* renamed from: $SwitchMap$androidx$constraintlayout$core$widgets$analyzer$WidgetRun$RunType */
        static final /* synthetic */ int[] f60x56910102;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                androidx.constraintlayout.core.widgets.analyzer.WidgetRun$RunType[] r0 = androidx.constraintlayout.core.widgets.analyzer.WidgetRun.RunType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f60x56910102 = r0
                androidx.constraintlayout.core.widgets.analyzer.WidgetRun$RunType r1 = androidx.constraintlayout.core.widgets.analyzer.WidgetRun.RunType.START     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f60x56910102     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.constraintlayout.core.widgets.analyzer.WidgetRun$RunType r1 = androidx.constraintlayout.core.widgets.analyzer.WidgetRun.RunType.END     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f60x56910102     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.constraintlayout.core.widgets.analyzer.WidgetRun$RunType r1 = androidx.constraintlayout.core.widgets.analyzer.WidgetRun.RunType.CENTER     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun.C01901.<clinit>():void");
        }
    }

    public VerticalWidgetRun(ConstraintWidget constraintWidget) {
        super(constraintWidget);
        DependencyNode dependencyNode = new DependencyNode(this);
        this.baseline = dependencyNode;
        this.start.type = DependencyNode.Type.TOP;
        this.end.type = DependencyNode.Type.BOTTOM;
        dependencyNode.type = DependencyNode.Type.BASELINE;
        this.orientation = 1;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x02e7, code lost:
        if (r9.widget.hasBaseline() != false) goto L_0x02e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0342, code lost:
        if (r0.dimensionBehavior == r1) goto L_0x03ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0374, code lost:
        if (r9.widget.hasBaseline() != false) goto L_0x02e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x03eb, code lost:
        if (r0.dimensionBehavior == r1) goto L_0x03ed;
     */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0411  */
    /* JADX WARNING: Removed duplicated region for block: B:162:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void apply() {
        /*
            r9 = this;
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r9.widget
            boolean r1 = r0.measured
            if (r1 == 0) goto L_0x000f
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r1 = r9.dimension
            int r0 = r0.getHeight()
            r1.resolve(r0)
        L_0x000f:
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r9.dimension
            boolean r0 = r0.resolved
            if (r0 != 0) goto L_0x0097
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r9.widget
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = r0.getVerticalDimensionBehaviour()
            r9.dimensionBehavior = r0
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r9.widget
            boolean r0 = r0.hasBaseline()
            if (r0 == 0) goto L_0x002c
            androidx.constraintlayout.core.widgets.analyzer.BaselineDimensionDependency r0 = new androidx.constraintlayout.core.widgets.analyzer.BaselineDimensionDependency
            r0.<init>(r9)
            r9.baselineDimension = r0
        L_0x002c:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = r9.dimensionBehavior
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r0 == r1) goto L_0x00d1
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT
            if (r0 != r1) goto L_0x0085
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r9.widget
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r0.getParent()
            if (r0 == 0) goto L_0x0085
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = r0.getVerticalDimensionBehaviour()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r1 != r2) goto L_0x0085
            int r1 = r0.getHeight()
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r9.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.mTop
            int r2 = r2.getMargin()
            int r1 = r1 - r2
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r9.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.mBottom
            int r2 = r2.getMargin()
            int r1 = r1 - r2
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r9.start
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r3 = r0.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r3 = r3.start
            androidx.constraintlayout.core.widgets.ConstraintWidget r4 = r9.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r4.mTop
            int r4 = r4.getMargin()
            r9.addTarget(r2, r3, r4)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r9.end
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r0 = r0.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.end
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r9.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r3.mBottom
            int r3 = r3.getMargin()
            int r3 = -r3
            r9.addTarget(r2, r0, r3)
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r9.dimension
            r0.resolve(r1)
            return
        L_0x0085:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = r9.dimensionBehavior
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r0 != r1) goto L_0x00d1
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r9.dimension
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r9.widget
            int r1 = r1.getHeight()
            r0.resolve(r1)
            goto L_0x00d1
        L_0x0097:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = r9.dimensionBehavior
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT
            if (r0 != r1) goto L_0x00d1
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r9.widget
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r0.getParent()
            if (r0 == 0) goto L_0x00d1
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = r0.getVerticalDimensionBehaviour()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r1 != r2) goto L_0x00d1
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r9.start
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r2 = r0.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r2.start
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r9.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r3.mTop
            int r3 = r3.getMargin()
            r9.addTarget(r1, r2, r3)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r9.end
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r0 = r0.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.end
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r9.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.mBottom
            int r2 = r2.getMargin()
            int r2 = -r2
            r9.addTarget(r1, r0, r2)
            return
        L_0x00d1:
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r9.dimension
            boolean r1 = r0.resolved
            r2 = 0
            r3 = 4
            r4 = 1
            r5 = 2
            r6 = 3
            if (r1 == 0) goto L_0x0239
            androidx.constraintlayout.core.widgets.ConstraintWidget r7 = r9.widget
            boolean r8 = r7.measured
            if (r8 == 0) goto L_0x0239
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r0 = r7.mListAnchors
            r1 = r0[r5]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r1.mTarget
            if (r1 == 0) goto L_0x016a
            r1 = r0[r6]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r1.mTarget
            if (r1 == 0) goto L_0x016a
            boolean r0 = r7.isInVerticalChain()
            if (r0 == 0) goto L_0x0114
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r9.start
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r9.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r1 = r1.mListAnchors
            r1 = r1[r5]
            int r1 = r1.getMargin()
            r0.margin = r1
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r9.end
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r9.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r1 = r1.mListAnchors
            r1 = r1[r6]
            int r1 = r1.getMargin()
            int r1 = -r1
            r0.margin = r1
            goto L_0x0153
        L_0x0114:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r9.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r0 = r0.mListAnchors
            r0 = r0[r5]
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r9.getTarget(r0)
            if (r0 == 0) goto L_0x012f
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r9.start
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r9.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r2 = r2.mListAnchors
            r2 = r2[r5]
            int r2 = r2.getMargin()
            r9.addTarget(r1, r0, r2)
        L_0x012f:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r9.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r0 = r0.mListAnchors
            r0 = r0[r6]
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r9.getTarget(r0)
            if (r0 == 0) goto L_0x014b
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r9.end
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r9.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r2 = r2.mListAnchors
            r2 = r2[r6]
            int r2 = r2.getMargin()
            int r2 = -r2
            r9.addTarget(r1, r0, r2)
        L_0x014b:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r9.start
            r0.delegateToWidgetRun = r4
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r9.end
            r0.delegateToWidgetRun = r4
        L_0x0153:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r9.widget
            boolean r0 = r0.hasBaseline()
            if (r0 == 0) goto L_0x0415
        L_0x015b:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r9.baseline
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r9.start
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r9.widget
            int r2 = r2.getBaselineDistance()
        L_0x0165:
            r9.addTarget(r0, r1, r2)
            goto L_0x0415
        L_0x016a:
            r1 = r0[r5]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r1.mTarget
            if (r1 == 0) goto L_0x019b
            r0 = r0[r5]
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r9.getTarget(r0)
            if (r0 == 0) goto L_0x0415
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r9.start
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r9.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r2 = r2.mListAnchors
            r2 = r2[r5]
            int r2 = r2.getMargin()
            r9.addTarget(r1, r0, r2)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r9.end
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r9.start
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r2 = r9.dimension
            int r2 = r2.value
            r9.addTarget(r0, r1, r2)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r9.widget
            boolean r0 = r0.hasBaseline()
            if (r0 == 0) goto L_0x0415
            goto L_0x015b
        L_0x019b:
            r1 = r0[r6]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r1.mTarget
            if (r1 == 0) goto L_0x01ce
            r0 = r0[r6]
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r9.getTarget(r0)
            if (r0 == 0) goto L_0x01c5
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r9.end
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r9.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r2 = r2.mListAnchors
            r2 = r2[r6]
            int r2 = r2.getMargin()
            int r2 = -r2
            r9.addTarget(r1, r0, r2)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r9.start
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r9.end
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r2 = r9.dimension
            int r2 = r2.value
            int r2 = -r2
            r9.addTarget(r0, r1, r2)
        L_0x01c5:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r9.widget
            boolean r0 = r0.hasBaseline()
            if (r0 == 0) goto L_0x0415
            goto L_0x015b
        L_0x01ce:
            r1 = r0[r3]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r1.mTarget
            if (r1 == 0) goto L_0x01f9
            r0 = r0[r3]
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r9.getTarget(r0)
            if (r0 == 0) goto L_0x0415
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r9.baseline
            r9.addTarget(r1, r0, r2)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r9.start
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r9.baseline
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r9.widget
            int r2 = r2.getBaselineDistance()
            int r2 = -r2
            r9.addTarget(r0, r1, r2)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r9.end
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r9.start
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r2 = r9.dimension
            int r2 = r2.value
            goto L_0x0165
        L_0x01f9:
            boolean r0 = r7 instanceof androidx.constraintlayout.core.widgets.Helper
            if (r0 != 0) goto L_0x0415
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r7.getParent()
            if (r0 == 0) goto L_0x0415
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r9.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.getAnchor(r1)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.mTarget
            if (r0 != 0) goto L_0x0415
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r9.widget
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r0.getParent()
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r0 = r0.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.start
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r9.start
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r9.widget
            int r2 = r2.getY()
            r9.addTarget(r1, r0, r2)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r9.end
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r9.start
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r2 = r9.dimension
            int r2 = r2.value
            r9.addTarget(r0, r1, r2)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r9.widget
            boolean r0 = r0.hasBaseline()
            if (r0 == 0) goto L_0x0415
            goto L_0x015b
        L_0x0239:
            if (r1 != 0) goto L_0x0288
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = r9.dimensionBehavior
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r1 != r7) goto L_0x0288
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r9.widget
            int r1 = r0.mMatchConstraintDefaultHeight
            if (r1 == r5) goto L_0x025a
            if (r1 == r6) goto L_0x024a
            goto L_0x028b
        L_0x024a:
            boolean r0 = r0.isInVerticalChain()
            if (r0 != 0) goto L_0x028b
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r9.widget
            int r1 = r0.mMatchConstraintDefaultWidth
            if (r1 != r6) goto L_0x0257
            goto L_0x028b
        L_0x0257:
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r0 = r0.horizontalRun
            goto L_0x0263
        L_0x025a:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r0.getParent()
            if (r0 != 0) goto L_0x0261
            goto L_0x028b
        L_0x0261:
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r0 = r0.verticalRun
        L_0x0263:
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r0.dimension
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r1 = r9.dimension
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r1 = r1.targets
            r1.add(r0)
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.Dependency> r0 = r0.dependencies
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r1 = r9.dimension
            r0.add(r1)
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r9.dimension
            r0.delegateToWidgetRun = r4
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.Dependency> r0 = r0.dependencies
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r9.start
            r0.add(r1)
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r9.dimension
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.Dependency> r0 = r0.dependencies
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r9.end
            r0.add(r1)
            goto L_0x028b
        L_0x0288:
            r0.addDependency(r9)
        L_0x028b:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r9.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r1 = r0.mListAnchors
            r7 = r1[r5]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r7 = r7.mTarget
            if (r7 == 0) goto L_0x02f4
            r7 = r1[r6]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r7 = r7.mTarget
            if (r7 == 0) goto L_0x02f4
            boolean r0 = r0.isInVerticalChain()
            if (r0 == 0) goto L_0x02bf
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r9.start
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r9.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r1 = r1.mListAnchors
            r1 = r1[r5]
            int r1 = r1.getMargin()
            r0.margin = r1
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r9.end
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r9.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r1 = r1.mListAnchors
            r1 = r1[r6]
            int r1 = r1.getMargin()
            int r1 = -r1
            r0.margin = r1
            goto L_0x02e1
        L_0x02bf:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r9.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r0 = r0.mListAnchors
            r0 = r0[r5]
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r9.getTarget(r0)
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r9.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r1 = r1.mListAnchors
            r1 = r1[r6]
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r9.getTarget(r1)
            if (r0 == 0) goto L_0x02d8
            r0.addDependency(r9)
        L_0x02d8:
            if (r1 == 0) goto L_0x02dd
            r1.addDependency(r9)
        L_0x02dd:
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun$RunType r0 = androidx.constraintlayout.core.widgets.analyzer.WidgetRun.RunType.CENTER
            r9.mRunType = r0
        L_0x02e1:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r9.widget
            boolean r0 = r0.hasBaseline()
            if (r0 == 0) goto L_0x0407
        L_0x02e9:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r9.baseline
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r9.start
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r2 = r9.baselineDimension
        L_0x02ef:
            r9.addTarget(r0, r1, r4, r2)
            goto L_0x0407
        L_0x02f4:
            r7 = r1[r5]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r7 = r7.mTarget
            r8 = 0
            if (r7 == 0) goto L_0x0346
            r0 = r1[r5]
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r9.getTarget(r0)
            if (r0 == 0) goto L_0x0407
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r9.start
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r9.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r2 = r2.mListAnchors
            r2 = r2[r5]
            int r2 = r2.getMargin()
            r9.addTarget(r1, r0, r2)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r9.end
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r9.start
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r2 = r9.dimension
            r9.addTarget(r0, r1, r4, r2)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r9.widget
            boolean r0 = r0.hasBaseline()
            if (r0 == 0) goto L_0x032c
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r9.baseline
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r9.start
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r2 = r9.baselineDimension
            r9.addTarget(r0, r1, r4, r2)
        L_0x032c:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = r9.dimensionBehavior
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r0 != r1) goto L_0x0407
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r9.widget
            float r0 = r0.getDimensionRatio()
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x0407
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r9.widget
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r0 = r0.horizontalRun
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = r0.dimensionBehavior
            if (r2 != r1) goto L_0x0407
            goto L_0x03ed
        L_0x0346:
            r5 = r1[r6]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r5.mTarget
            r7 = -1
            if (r5 == 0) goto L_0x0378
            r0 = r1[r6]
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r9.getTarget(r0)
            if (r0 == 0) goto L_0x0407
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r9.end
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r9.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r2 = r2.mListAnchors
            r2 = r2[r6]
            int r2 = r2.getMargin()
            int r2 = -r2
            r9.addTarget(r1, r0, r2)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r9.start
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r9.end
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r2 = r9.dimension
            r9.addTarget(r0, r1, r7, r2)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r9.widget
            boolean r0 = r0.hasBaseline()
            if (r0 == 0) goto L_0x0407
            goto L_0x02e9
        L_0x0378:
            r5 = r1[r3]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r5.mTarget
            if (r5 == 0) goto L_0x039c
            r0 = r1[r3]
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r9.getTarget(r0)
            if (r0 == 0) goto L_0x0407
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r9.baseline
            r9.addTarget(r1, r0, r2)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r9.start
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r9.baseline
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r2 = r9.baselineDimension
            r9.addTarget(r0, r1, r7, r2)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r9.end
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r9.start
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r2 = r9.dimension
            goto L_0x02ef
        L_0x039c:
            boolean r1 = r0 instanceof androidx.constraintlayout.core.widgets.Helper
            if (r1 != 0) goto L_0x0407
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r0.getParent()
            if (r0 == 0) goto L_0x0407
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r9.widget
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r0.getParent()
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r0 = r0.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.start
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r9.start
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r9.widget
            int r2 = r2.getY()
            r9.addTarget(r1, r0, r2)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r9.end
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r9.start
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r2 = r9.dimension
            r9.addTarget(r0, r1, r4, r2)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r9.widget
            boolean r0 = r0.hasBaseline()
            if (r0 == 0) goto L_0x03d5
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r9.baseline
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r9.start
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r2 = r9.baselineDimension
            r9.addTarget(r0, r1, r4, r2)
        L_0x03d5:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = r9.dimensionBehavior
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r0 != r1) goto L_0x0407
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r9.widget
            float r0 = r0.getDimensionRatio()
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x0407
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r9.widget
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r0 = r0.horizontalRun
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = r0.dimensionBehavior
            if (r2 != r1) goto L_0x0407
        L_0x03ed:
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r0.dimension
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.Dependency> r0 = r0.dependencies
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r1 = r9.dimension
            r0.add(r1)
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r9.dimension
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r0.targets
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r9.widget
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r1 = r1.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r1 = r1.dimension
            r0.add(r1)
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r9.dimension
            r0.updateDelegate = r9
        L_0x0407:
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r9.dimension
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r0.targets
            int r0 = r0.size()
            if (r0 != 0) goto L_0x0415
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r0 = r9.dimension
            r0.readyToSolve = r4
        L_0x0415:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun.apply():void");
    }

    public void applyToWidget() {
        DependencyNode dependencyNode = this.start;
        if (dependencyNode.resolved) {
            this.widget.setY(dependencyNode.value);
        }
    }

    /* access modifiers changed from: package-private */
    public void clear() {
        this.runGroup = null;
        this.start.clear();
        this.end.clear();
        this.baseline.clear();
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
        this.baseline.clear();
        this.baseline.resolved = false;
        this.dimension.resolved = false;
    }

    /* access modifiers changed from: package-private */
    public boolean supportsWrapComputation() {
        return this.dimensionBehavior != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || this.widget.mMatchConstraintDefaultHeight == 0;
    }

    public String toString() {
        return "VerticalRun " + this.widget.getDebugName();
    }

    public void update(Dependency dependency) {
        int i;
        float f;
        int i2 = C01901.f60x56910102[this.mRunType.ordinal()];
        if (i2 == 1) {
            updateRunStart(dependency);
        } else if (i2 == 2) {
            updateRunEnd(dependency);
        } else if (i2 == 3) {
            ConstraintWidget constraintWidget = this.widget;
            updateRunCenter(dependency, constraintWidget.mTop, constraintWidget.mBottom, 1);
            return;
        }
        DimensionDependency dimensionDependency = this.dimension;
        if (dimensionDependency.readyToSolve && !dimensionDependency.resolved && this.dimensionBehavior == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            ConstraintWidget constraintWidget2 = this.widget;
            int i3 = constraintWidget2.mMatchConstraintDefaultHeight;
            if (i3 == 2) {
                ConstraintWidget parent = constraintWidget2.getParent();
                if (parent != null) {
                    DimensionDependency dimensionDependency2 = parent.verticalRun.dimension;
                    if (dimensionDependency2.resolved) {
                        i = (int) ((((float) dimensionDependency2.value) * this.widget.mMatchConstraintPercentHeight) + 0.5f);
                    }
                }
            } else if (i3 == 3 && constraintWidget2.horizontalRun.dimension.resolved) {
                int dimensionRatioSide = constraintWidget2.getDimensionRatioSide();
                if (dimensionRatioSide != -1) {
                    if (dimensionRatioSide == 0) {
                        ConstraintWidget constraintWidget3 = this.widget;
                        f = ((float) constraintWidget3.horizontalRun.dimension.value) * constraintWidget3.getDimensionRatio();
                        i = (int) (f + 0.5f);
                    } else if (dimensionRatioSide != 1) {
                        i = 0;
                    }
                }
                ConstraintWidget constraintWidget4 = this.widget;
                f = ((float) constraintWidget4.horizontalRun.dimension.value) / constraintWidget4.getDimensionRatio();
                i = (int) (f + 0.5f);
            }
            this.dimension.resolve(i);
        }
        DependencyNode dependencyNode = this.start;
        if (dependencyNode.readyToSolve) {
            DependencyNode dependencyNode2 = this.end;
            if (dependencyNode2.readyToSolve) {
                if (!dependencyNode.resolved || !dependencyNode2.resolved || !this.dimension.resolved) {
                    if (!this.dimension.resolved && this.dimensionBehavior == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        ConstraintWidget constraintWidget5 = this.widget;
                        if (constraintWidget5.mMatchConstraintDefaultWidth == 0 && !constraintWidget5.isInVerticalChain()) {
                            int i4 = this.start.targets.get(0).value;
                            DependencyNode dependencyNode3 = this.start;
                            int i5 = i4 + dependencyNode3.margin;
                            int i6 = this.end.targets.get(0).value + this.end.margin;
                            dependencyNode3.resolve(i5);
                            this.end.resolve(i6);
                            this.dimension.resolve(i6 - i5);
                            return;
                        }
                    }
                    if (!this.dimension.resolved && this.dimensionBehavior == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && this.matchConstraintsType == 1 && this.start.targets.size() > 0 && this.end.targets.size() > 0) {
                        int i7 = (this.end.targets.get(0).value + this.end.margin) - (this.start.targets.get(0).value + this.start.margin);
                        DimensionDependency dimensionDependency3 = this.dimension;
                        int i8 = dimensionDependency3.wrapValue;
                        if (i7 < i8) {
                            dimensionDependency3.resolve(i7);
                        } else {
                            dimensionDependency3.resolve(i8);
                        }
                    }
                    if (this.dimension.resolved && this.start.targets.size() > 0 && this.end.targets.size() > 0) {
                        DependencyNode dependencyNode4 = this.start.targets.get(0);
                        DependencyNode dependencyNode5 = this.end.targets.get(0);
                        int i9 = dependencyNode4.value + this.start.margin;
                        int i10 = dependencyNode5.value + this.end.margin;
                        float verticalBiasPercent = this.widget.getVerticalBiasPercent();
                        if (dependencyNode4 == dependencyNode5) {
                            i9 = dependencyNode4.value;
                            i10 = dependencyNode5.value;
                            verticalBiasPercent = 0.5f;
                        }
                        this.start.resolve((int) (((float) i9) + 0.5f + (((float) ((i10 - i9) - this.dimension.value)) * verticalBiasPercent)));
                        this.end.resolve(this.start.value + this.dimension.value);
                    }
                }
            }
        }
    }
}
