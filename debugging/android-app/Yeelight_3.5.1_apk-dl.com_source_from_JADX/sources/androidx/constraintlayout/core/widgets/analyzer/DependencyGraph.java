package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.Barrier;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.Guideline;
import androidx.constraintlayout.core.widgets.HelperWidget;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.apache.commons.p194io.IOUtils;

public class DependencyGraph {
    private static final boolean USE_GROUPS = true;
    private ConstraintWidgetContainer container;
    private ConstraintWidgetContainer mContainer;
    ArrayList<RunGroup> mGroups = new ArrayList<>();
    private BasicMeasure.Measure mMeasure = new BasicMeasure.Measure();
    private BasicMeasure.Measurer mMeasurer = null;
    private boolean mNeedBuildGraph = true;
    private boolean mNeedRedoMeasures = true;
    private ArrayList<WidgetRun> mRuns = new ArrayList<>();
    private ArrayList<RunGroup> runGroups = new ArrayList<>();

    public DependencyGraph(ConstraintWidgetContainer constraintWidgetContainer) {
        this.container = constraintWidgetContainer;
        this.mContainer = constraintWidgetContainer;
    }

    private void applyGroup(DependencyNode dependencyNode, int i, int i2, DependencyNode dependencyNode2, ArrayList<RunGroup> arrayList, RunGroup runGroup) {
        WidgetRun widgetRun = dependencyNode.run;
        if (widgetRun.runGroup == null) {
            ConstraintWidgetContainer constraintWidgetContainer = this.container;
            if (widgetRun != constraintWidgetContainer.horizontalRun && widgetRun != constraintWidgetContainer.verticalRun) {
                if (runGroup == null) {
                    runGroup = new RunGroup(widgetRun, i2);
                    arrayList.add(runGroup);
                }
                widgetRun.runGroup = runGroup;
                runGroup.add(widgetRun);
                for (Dependency next : widgetRun.start.dependencies) {
                    if (next instanceof DependencyNode) {
                        applyGroup((DependencyNode) next, i, 0, dependencyNode2, arrayList, runGroup);
                    }
                }
                for (Dependency next2 : widgetRun.end.dependencies) {
                    if (next2 instanceof DependencyNode) {
                        applyGroup((DependencyNode) next2, i, 1, dependencyNode2, arrayList, runGroup);
                    }
                }
                if (i == 1 && (widgetRun instanceof VerticalWidgetRun)) {
                    for (Dependency next3 : ((VerticalWidgetRun) widgetRun).baseline.dependencies) {
                        if (next3 instanceof DependencyNode) {
                            applyGroup((DependencyNode) next3, i, 2, dependencyNode2, arrayList, runGroup);
                        }
                    }
                }
                for (DependencyNode next4 : widgetRun.start.targets) {
                    if (next4 == dependencyNode2) {
                        runGroup.dual = true;
                    }
                    applyGroup(next4, i, 0, dependencyNode2, arrayList, runGroup);
                }
                for (DependencyNode next5 : widgetRun.end.targets) {
                    if (next5 == dependencyNode2) {
                        runGroup.dual = true;
                    }
                    applyGroup(next5, i, 1, dependencyNode2, arrayList, runGroup);
                }
                if (i == 1 && (widgetRun instanceof VerticalWidgetRun)) {
                    for (DependencyNode applyGroup : ((VerticalWidgetRun) widgetRun).baseline.targets) {
                        applyGroup(applyGroup, i, 2, dependencyNode2, arrayList, runGroup);
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:128:0x01da, code lost:
        r4 = r0.mListDimensionBehaviors;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0074, code lost:
        if (r2.mMatchConstraintDefaultHeight == 0) goto L_0x0065;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean basicMeasureWidgets(androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r17) {
        /*
            r16 = this;
            r0 = r17
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r1 = r0.mChildren
            java.util.Iterator r1 = r1.iterator()
        L_0x0008:
            boolean r2 = r1.hasNext()
            r3 = 0
            if (r2 == 0) goto L_0x0269
            java.lang.Object r2 = r1.next()
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r2
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r4 = r2.mListDimensionBehaviors
            r5 = r4[r3]
            r10 = 1
            r4 = r4[r10]
            int r6 = r2.getVisibility()
            r7 = 8
            if (r6 != r7) goto L_0x0027
        L_0x0024:
            r2.measured = r10
            goto L_0x0008
        L_0x0027:
            float r6 = r2.mMatchConstraintPercentWidth
            r11 = 1065353216(0x3f800000, float:1.0)
            r7 = 2
            int r6 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r6 >= 0) goto L_0x0036
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r5 != r6) goto L_0x0036
            r2.mMatchConstraintDefaultWidth = r7
        L_0x0036:
            float r6 = r2.mMatchConstraintPercentHeight
            int r6 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r6 >= 0) goto L_0x0042
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r4 != r6) goto L_0x0042
            r2.mMatchConstraintDefaultHeight = r7
        L_0x0042:
            float r6 = r2.getDimensionRatio()
            r8 = 0
            r9 = 3
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 <= 0) goto L_0x0077
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r5 != r6) goto L_0x005b
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r8 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r4 == r8) goto L_0x0058
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r8 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r4 != r8) goto L_0x005b
        L_0x0058:
            r2.mMatchConstraintDefaultWidth = r9
            goto L_0x0077
        L_0x005b:
            if (r4 != r6) goto L_0x0068
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r8 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r5 == r8) goto L_0x0065
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r8 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r5 != r8) goto L_0x0068
        L_0x0065:
            r2.mMatchConstraintDefaultHeight = r9
            goto L_0x0077
        L_0x0068:
            if (r5 != r6) goto L_0x0077
            if (r4 != r6) goto L_0x0077
            int r6 = r2.mMatchConstraintDefaultWidth
            if (r6 != 0) goto L_0x0072
            r2.mMatchConstraintDefaultWidth = r9
        L_0x0072:
            int r6 = r2.mMatchConstraintDefaultHeight
            if (r6 != 0) goto L_0x0077
            goto L_0x0065
        L_0x0077:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r5 != r6) goto L_0x008d
            int r8 = r2.mMatchConstraintDefaultWidth
            if (r8 != r10) goto L_0x008d
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r2.mLeft
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r8.mTarget
            if (r8 == 0) goto L_0x008b
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r2.mRight
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r8.mTarget
            if (r8 != 0) goto L_0x008d
        L_0x008b:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r5 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
        L_0x008d:
            r8 = r5
            if (r4 != r6) goto L_0x00a2
            int r5 = r2.mMatchConstraintDefaultHeight
            if (r5 != r10) goto L_0x00a2
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r2.mTop
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r5.mTarget
            if (r5 == 0) goto L_0x00a0
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r2.mBottom
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r5.mTarget
            if (r5 != 0) goto L_0x00a2
        L_0x00a0:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
        L_0x00a2:
            r12 = r4
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r4 = r2.horizontalRun
            r4.dimensionBehavior = r8
            int r5 = r2.mMatchConstraintDefaultWidth
            r4.matchConstraintsType = r5
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r4 = r2.verticalRun
            r4.dimensionBehavior = r12
            int r13 = r2.mMatchConstraintDefaultHeight
            r4.matchConstraintsType = r13
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT
            if (r8 == r4) goto L_0x00bf
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r14 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r8 == r14) goto L_0x00bf
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r14 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r8 != r14) goto L_0x00cb
        L_0x00bf:
            if (r12 == r4) goto L_0x0215
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r14 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r12 == r14) goto L_0x0215
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r14 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r12 != r14) goto L_0x00cb
            goto L_0x0215
        L_0x00cb:
            r14 = 1056964608(0x3f000000, float:0.5)
            if (r8 != r6) goto L_0x014a
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r15 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r12 == r15) goto L_0x00d7
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r11 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r12 != r11) goto L_0x014a
        L_0x00d7:
            if (r5 != r9) goto L_0x00f8
            if (r12 != r15) goto L_0x00e5
            r7 = 0
            r9 = 0
            r4 = r16
            r5 = r2
            r6 = r15
            r8 = r15
            r4.measure(r5, r6, r7, r8, r9)
        L_0x00e5:
            int r9 = r2.getHeight()
            float r3 = (float) r9
            float r4 = r2.mDimensionRatio
            float r3 = r3 * r4
            float r3 = r3 + r14
            int r7 = (int) r3
        L_0x00f0:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r8 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
        L_0x00f2:
            r4 = r16
            r5 = r2
            r6 = r8
            goto L_0x024e
        L_0x00f8:
            if (r5 != r10) goto L_0x0110
            r7 = 0
            r9 = 0
            r4 = r16
            r5 = r2
            r6 = r15
            r8 = r12
            r4.measure(r5, r6, r7, r8, r9)
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r3 = r2.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r3 = r3.dimension
            int r2 = r2.getWidth()
        L_0x010c:
            r3.wrapValue = r2
            goto L_0x0008
        L_0x0110:
            if (r5 != r7) goto L_0x0133
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r11 = r0.mListDimensionBehaviors
            r15 = r11[r3]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r15 == r7) goto L_0x011e
            r11 = r11[r3]
            if (r11 != r4) goto L_0x014a
        L_0x011e:
            float r3 = r2.mMatchConstraintPercentWidth
            int r4 = r17.getWidth()
            float r4 = (float) r4
            float r3 = r3 * r4
            float r3 = r3 + r14
            int r3 = (int) r3
            int r9 = r2.getHeight()
            r4 = r16
            r5 = r2
            r6 = r7
            r7 = r3
            goto L_0x0147
        L_0x0133:
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r7 = r2.mListAnchors
            r11 = r7[r3]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r11.mTarget
            if (r11 == 0) goto L_0x0141
            r7 = r7[r10]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r7 = r7.mTarget
            if (r7 != 0) goto L_0x014a
        L_0x0141:
            r7 = 0
            r9 = 0
            r4 = r16
            r5 = r2
            r6 = r15
        L_0x0147:
            r8 = r12
            goto L_0x024e
        L_0x014a:
            if (r12 != r6) goto L_0x01cc
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r11 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r8 == r11) goto L_0x0154
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r8 != r7) goto L_0x01cc
        L_0x0154:
            if (r13 != r9) goto L_0x017a
            if (r8 != r11) goto L_0x0162
            r7 = 0
            r9 = 0
            r4 = r16
            r5 = r2
            r6 = r11
            r8 = r11
            r4.measure(r5, r6, r7, r8, r9)
        L_0x0162:
            int r7 = r2.getWidth()
            float r3 = r2.mDimensionRatio
            int r4 = r2.getDimensionRatioSide()
            r5 = -1
            if (r4 != r5) goto L_0x0173
            r4 = 1065353216(0x3f800000, float:1.0)
            float r3 = r4 / r3
        L_0x0173:
            float r4 = (float) r7
            float r4 = r4 * r3
            float r4 = r4 + r14
            int r9 = (int) r4
            goto L_0x00f0
        L_0x017a:
            if (r13 != r10) goto L_0x0190
            r7 = 0
            r9 = 0
            r4 = r16
            r5 = r2
            r6 = r8
            r8 = r11
            r4.measure(r5, r6, r7, r8, r9)
        L_0x0186:
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r3 = r2.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r3 = r3.dimension
            int r2 = r2.getHeight()
            goto L_0x010c
        L_0x0190:
            r7 = 2
            if (r13 != r7) goto L_0x01b5
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r7 = r0.mListDimensionBehaviors
            r9 = r7[r10]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r11 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r9 == r11) goto L_0x019f
            r7 = r7[r10]
            if (r7 != r4) goto L_0x01cc
        L_0x019f:
            float r3 = r2.mMatchConstraintPercentHeight
            int r7 = r2.getWidth()
            int r4 = r17.getHeight()
            float r4 = (float) r4
            float r3 = r3 * r4
            float r3 = r3 + r14
            int r9 = (int) r3
            r4 = r16
            r5 = r2
            r6 = r8
            r8 = r11
            goto L_0x024e
        L_0x01b5:
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r4 = r2.mListAnchors
            r7 = 2
            r15 = r4[r7]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r7 = r15.mTarget
            if (r7 == 0) goto L_0x01c4
            r4 = r4[r9]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r4.mTarget
            if (r4 != 0) goto L_0x01cc
        L_0x01c4:
            r7 = 0
            r9 = 0
            r4 = r16
            r5 = r2
            r6 = r11
            goto L_0x0147
        L_0x01cc:
            if (r8 != r6) goto L_0x0008
            if (r12 != r6) goto L_0x0008
            if (r5 == r10) goto L_0x01fe
            if (r13 != r10) goto L_0x01d5
            goto L_0x01fe
        L_0x01d5:
            r4 = 2
            if (r13 != r4) goto L_0x0008
            if (r5 != r4) goto L_0x0008
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r4 = r0.mListDimensionBehaviors
            r3 = r4[r3]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r8 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r3 != r8) goto L_0x0008
            r3 = r4[r10]
            if (r3 != r8) goto L_0x0008
            float r3 = r2.mMatchConstraintPercentWidth
            float r4 = r2.mMatchConstraintPercentHeight
            int r5 = r17.getWidth()
            float r5 = (float) r5
            float r3 = r3 * r5
            float r3 = r3 + r14
            int r7 = (int) r3
            int r3 = r17.getHeight()
            float r3 = (float) r3
            float r4 = r4 * r3
            float r4 = r4 + r14
            int r9 = (int) r4
            goto L_0x00f2
        L_0x01fe:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r8 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            r7 = 0
            r9 = 0
            r4 = r16
            r5 = r2
            r6 = r8
            r4.measure(r5, r6, r7, r8, r9)
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r3 = r2.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r3 = r3.dimension
            int r4 = r2.getWidth()
            r3.wrapValue = r4
            goto L_0x0186
        L_0x0215:
            int r3 = r2.getWidth()
            if (r8 != r4) goto L_0x022e
            int r3 = r17.getWidth()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r2.mLeft
            int r5 = r5.mMargin
            int r3 = r3 - r5
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r2.mRight
            int r5 = r5.mMargin
            int r3 = r3 - r5
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r5 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r7 = r3
            r6 = r5
            goto L_0x0230
        L_0x022e:
            r7 = r3
            r6 = r8
        L_0x0230:
            int r3 = r2.getHeight()
            if (r12 != r4) goto L_0x0249
            int r3 = r17.getHeight()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r2.mTop
            int r4 = r4.mMargin
            int r3 = r3 - r4
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r2.mBottom
            int r4 = r4.mMargin
            int r3 = r3 - r4
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r9 = r3
            r8 = r4
            goto L_0x024b
        L_0x0249:
            r9 = r3
            r8 = r12
        L_0x024b:
            r4 = r16
            r5 = r2
        L_0x024e:
            r4.measure(r5, r6, r7, r8, r9)
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r3 = r2.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r3 = r3.dimension
            int r4 = r2.getWidth()
            r3.resolve(r4)
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r3 = r2.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r3 = r3.dimension
            int r4 = r2.getHeight()
            r3.resolve(r4)
            goto L_0x0024
        L_0x0269:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.analyzer.DependencyGraph.basicMeasureWidgets(androidx.constraintlayout.core.widgets.ConstraintWidgetContainer):boolean");
    }

    private int computeWrap(ConstraintWidgetContainer constraintWidgetContainer, int i) {
        int size = this.mGroups.size();
        long j = 0;
        for (int i2 = 0; i2 < size; i2++) {
            j = Math.max(j, this.mGroups.get(i2).computeWrapSize(constraintWidgetContainer, i));
        }
        return (int) j;
    }

    private void displayGraph() {
        Iterator<WidgetRun> it = this.mRuns.iterator();
        String str = "digraph {\n";
        while (it.hasNext()) {
            str = generateDisplayGraph(it.next(), str);
        }
        String str2 = str + "\n}\n";
        System.out.println("content:<<\n" + str2 + "\n>>");
    }

    private void findGroup(WidgetRun widgetRun, int i, ArrayList<RunGroup> arrayList) {
        for (Dependency next : widgetRun.start.dependencies) {
            if (next instanceof DependencyNode) {
                applyGroup((DependencyNode) next, i, 0, widgetRun.end, arrayList, (RunGroup) null);
            } else if (next instanceof WidgetRun) {
                applyGroup(((WidgetRun) next).start, i, 0, widgetRun.end, arrayList, (RunGroup) null);
            }
        }
        for (Dependency next2 : widgetRun.end.dependencies) {
            if (next2 instanceof DependencyNode) {
                applyGroup((DependencyNode) next2, i, 1, widgetRun.start, arrayList, (RunGroup) null);
            } else if (next2 instanceof WidgetRun) {
                applyGroup(((WidgetRun) next2).end, i, 1, widgetRun.start, arrayList, (RunGroup) null);
            }
        }
        if (i == 1) {
            for (Dependency next3 : ((VerticalWidgetRun) widgetRun).baseline.dependencies) {
                if (next3 instanceof DependencyNode) {
                    applyGroup((DependencyNode) next3, i, 2, (DependencyNode) null, arrayList, (RunGroup) null);
                }
            }
        }
    }

    private String generateChainDisplayGraph(ChainRun chainRun, String str) {
        int i = chainRun.orientation;
        StringBuilder sb = new StringBuilder("subgraph ");
        sb.append("cluster_");
        sb.append(chainRun.widget.getDebugName());
        sb.append(i == 0 ? "_h" : "_v");
        sb.append(" {\n");
        Iterator<WidgetRun> it = chainRun.widgets.iterator();
        String str2 = "";
        while (it.hasNext()) {
            WidgetRun next = it.next();
            sb.append(next.widget.getDebugName());
            sb.append(i == 0 ? "_HORIZONTAL" : "_VERTICAL");
            sb.append(";\n");
            str2 = generateDisplayGraph(next, str2);
        }
        sb.append("}\n");
        return str + str2 + sb;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e4, code lost:
        if (r1.targets.isEmpty() == false) goto L_0x00e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00e6, code lost:
        r2.append(org.apache.commons.p194io.IOUtils.LINE_SEPARATOR_UNIX);
        r2.append(r0.name());
        r2.append(" -> ");
        r0 = r1.name();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0153, code lost:
        if (r1.targets.isEmpty() == false) goto L_0x00e6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0161  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String generateDisplayGraph(androidx.constraintlayout.core.widgets.analyzer.WidgetRun r10, java.lang.String r11) {
        /*
            r9 = this;
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r10.start
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r10.end
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r11)
            boolean r3 = r10 instanceof androidx.constraintlayout.core.widgets.analyzer.HelperReferences
            if (r3 != 0) goto L_0x002d
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.Dependency> r3 = r0.dependencies
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x002d
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.Dependency> r3 = r1.dependencies
            boolean r3 = r3.isEmpty()
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r4 = r0.targets
            boolean r4 = r4.isEmpty()
            r3 = r3 & r4
            if (r3 == 0) goto L_0x002d
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r3 = r1.targets
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x002d
            return r11
        L_0x002d:
            java.lang.String r3 = r9.nodeDefinition(r10)
            r2.append(r3)
            boolean r3 = r9.isCenteredConnection(r0, r1)
            java.lang.String r11 = r9.generateDisplayNode(r0, r3, r11)
            java.lang.String r11 = r9.generateDisplayNode(r1, r3, r11)
            boolean r4 = r10 instanceof androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun
            if (r4 == 0) goto L_0x004d
            r5 = r10
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r5 = (androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun) r5
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r5 = r5.baseline
            java.lang.String r11 = r9.generateDisplayNode(r5, r3, r11)
        L_0x004d:
            boolean r3 = r10 instanceof androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun
            r5 = 0
            java.lang.String r6 = " -> "
            java.lang.String r7 = "\n"
            if (r3 != 0) goto L_0x00f8
            boolean r3 = r10 instanceof androidx.constraintlayout.core.widgets.analyzer.ChainRun
            if (r3 == 0) goto L_0x0063
            r8 = r10
            androidx.constraintlayout.core.widgets.analyzer.ChainRun r8 = (androidx.constraintlayout.core.widgets.analyzer.ChainRun) r8
            int r8 = r8.orientation
            if (r8 != 0) goto L_0x0063
            goto L_0x00f8
        L_0x0063:
            if (r4 != 0) goto L_0x006f
            if (r3 == 0) goto L_0x0156
            r3 = r10
            androidx.constraintlayout.core.widgets.analyzer.ChainRun r3 = (androidx.constraintlayout.core.widgets.analyzer.ChainRun) r3
            int r3 = r3.orientation
            r4 = 1
            if (r3 != r4) goto L_0x0156
        L_0x006f:
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r10.widget
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = r3.getVerticalDimensionBehaviour()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r3 == r4) goto L_0x00ad
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r3 != r4) goto L_0x007e
            goto L_0x00ad
        L_0x007e:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r3 != r0) goto L_0x0156
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r10.widget
            float r0 = r0.getDimensionRatio()
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x0156
            r2.append(r7)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r10.widget
            java.lang.String r0 = r0.getDebugName()
            r2.append(r0)
            java.lang.String r0 = "_VERTICAL -> "
            r2.append(r0)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r10.widget
            java.lang.String r0 = r0.getDebugName()
            r2.append(r0)
            java.lang.String r0 = "_HORIZONTAL;\n"
        L_0x00a8:
            r2.append(r0)
            goto L_0x0156
        L_0x00ad:
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r3 = r0.targets
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x00d6
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r3 = r1.targets
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x00d6
        L_0x00bd:
            r2.append(r7)
            java.lang.String r1 = r1.name()
            r2.append(r1)
            r2.append(r6)
            java.lang.String r0 = r0.name()
        L_0x00ce:
            r2.append(r0)
            r2.append(r7)
            goto L_0x0156
        L_0x00d6:
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r3 = r0.targets
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x0156
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r3 = r1.targets
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x0156
        L_0x00e6:
            r2.append(r7)
            java.lang.String r0 = r0.name()
            r2.append(r0)
            r2.append(r6)
            java.lang.String r0 = r1.name()
            goto L_0x00ce
        L_0x00f8:
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r10.widget
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = r3.getHorizontalDimensionBehaviour()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r3 == r4) goto L_0x0133
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r3 != r4) goto L_0x0107
            goto L_0x0133
        L_0x0107:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r3 != r0) goto L_0x0156
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r10.widget
            float r0 = r0.getDimensionRatio()
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x0156
            r2.append(r7)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r10.widget
            java.lang.String r0 = r0.getDebugName()
            r2.append(r0)
            java.lang.String r0 = "_HORIZONTAL -> "
            r2.append(r0)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r10.widget
            java.lang.String r0 = r0.getDebugName()
            r2.append(r0)
            java.lang.String r0 = "_VERTICAL;\n"
            goto L_0x00a8
        L_0x0133:
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r3 = r0.targets
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x0145
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r3 = r1.targets
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x0145
            goto L_0x00bd
        L_0x0145:
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r3 = r0.targets
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x0156
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r3 = r1.targets
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x0156
            goto L_0x00e6
        L_0x0156:
            boolean r0 = r10 instanceof androidx.constraintlayout.core.widgets.analyzer.ChainRun
            if (r0 == 0) goto L_0x0161
            androidx.constraintlayout.core.widgets.analyzer.ChainRun r10 = (androidx.constraintlayout.core.widgets.analyzer.ChainRun) r10
            java.lang.String r10 = r9.generateChainDisplayGraph(r10, r11)
            return r10
        L_0x0161:
            java.lang.String r10 = r2.toString()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.analyzer.DependencyGraph.generateDisplayGraph(androidx.constraintlayout.core.widgets.analyzer.WidgetRun, java.lang.String):java.lang.String");
    }

    private String generateDisplayNode(DependencyNode dependencyNode, boolean z, String str) {
        StringBuilder sb = new StringBuilder(str);
        for (DependencyNode name : dependencyNode.targets) {
            String str2 = (IOUtils.LINE_SEPARATOR_UNIX + dependencyNode.name()) + " -> " + name.name();
            if (dependencyNode.margin > 0 || z || (dependencyNode.run instanceof HelperReferences)) {
                String str3 = str2 + "[";
                if (dependencyNode.margin > 0) {
                    str3 = str3 + "label=\"" + dependencyNode.margin + "\"";
                    if (z) {
                        str3 = str3 + Constants.ACCEPT_TIME_SEPARATOR_SP;
                    }
                }
                if (z) {
                    str3 = str3 + " style=dashed ";
                }
                if (dependencyNode.run instanceof HelperReferences) {
                    str3 = str3 + " style=bold,color=gray ";
                }
                str2 = str3 + "]";
            }
            sb.append(str2 + IOUtils.LINE_SEPARATOR_UNIX);
        }
        return sb.toString();
    }

    private boolean isCenteredConnection(DependencyNode dependencyNode, DependencyNode dependencyNode2) {
        int i = 0;
        for (DependencyNode dependencyNode3 : dependencyNode.targets) {
            if (dependencyNode3 != dependencyNode2) {
                i++;
            }
        }
        int i2 = 0;
        for (DependencyNode dependencyNode4 : dependencyNode2.targets) {
            if (dependencyNode4 != dependencyNode) {
                i2++;
            }
        }
        return i > 0 && i2 > 0;
    }

    private void measure(ConstraintWidget constraintWidget, ConstraintWidget.DimensionBehaviour dimensionBehaviour, int i, ConstraintWidget.DimensionBehaviour dimensionBehaviour2, int i2) {
        BasicMeasure.Measure measure = this.mMeasure;
        measure.horizontalBehavior = dimensionBehaviour;
        measure.verticalBehavior = dimensionBehaviour2;
        measure.horizontalDimension = i;
        measure.verticalDimension = i2;
        this.mMeasurer.measure(constraintWidget, measure);
        constraintWidget.setWidth(this.mMeasure.measuredWidth);
        constraintWidget.setHeight(this.mMeasure.measuredHeight);
        constraintWidget.setHasBaseline(this.mMeasure.measuredHasBaseline);
        constraintWidget.setBaselineDistance(this.mMeasure.measuredBaseline);
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00c0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String nodeDefinition(androidx.constraintlayout.core.widgets.analyzer.WidgetRun r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r10.widget
            java.lang.String r1 = r1.getDebugName()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r10.widget
            if (r0 != 0) goto L_0x0016
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = r3.getHorizontalDimensionBehaviour()
            goto L_0x001a
        L_0x0016:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = r3.getVerticalDimensionBehaviour()
        L_0x001a:
            androidx.constraintlayout.core.widgets.analyzer.RunGroup r4 = r10.runGroup
            if (r0 != 0) goto L_0x0021
            java.lang.String r5 = "_HORIZONTAL"
            goto L_0x0023
        L_0x0021:
            java.lang.String r5 = "_VERTICAL"
        L_0x0023:
            r2.append(r5)
            java.lang.String r5 = " [shape=none, label=<"
            r2.append(r5)
            java.lang.String r5 = "<TABLE BORDER=\"0\" CELLSPACING=\"0\" CELLPADDING=\"2\">"
            r2.append(r5)
            java.lang.String r5 = "  <TR>"
            r2.append(r5)
            java.lang.String r5 = " BGCOLOR=\"green\""
            java.lang.String r6 = "    <TD "
            r2.append(r6)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r7 = r10.start
            boolean r7 = r7.resolved
            if (r0 != 0) goto L_0x004a
            if (r7 == 0) goto L_0x0047
            r2.append(r5)
        L_0x0047:
            java.lang.String r7 = " PORT=\"LEFT\" BORDER=\"1\">L</TD>"
            goto L_0x0051
        L_0x004a:
            if (r7 == 0) goto L_0x004f
            r2.append(r5)
        L_0x004f:
            java.lang.String r7 = " PORT=\"TOP\" BORDER=\"1\">T</TD>"
        L_0x0051:
            r2.append(r7)
            java.lang.String r7 = "    <TD BORDER=\"1\" "
            r2.append(r7)
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r7 = r10.dimension
            boolean r7 = r7.resolved
            if (r7 == 0) goto L_0x0068
            androidx.constraintlayout.core.widgets.ConstraintWidget r8 = r10.widget
            boolean r8 = r8.measured
            if (r8 != 0) goto L_0x0068
            java.lang.String r7 = " BGCOLOR=\"green\" "
            goto L_0x006c
        L_0x0068:
            if (r7 == 0) goto L_0x0070
            java.lang.String r7 = " BGCOLOR=\"lightgray\" "
        L_0x006c:
            r2.append(r7)
            goto L_0x0079
        L_0x0070:
            androidx.constraintlayout.core.widgets.ConstraintWidget r7 = r10.widget
            boolean r7 = r7.measured
            if (r7 == 0) goto L_0x0079
            java.lang.String r7 = " BGCOLOR=\"yellow\" "
            goto L_0x006c
        L_0x0079:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r3 != r7) goto L_0x0082
            java.lang.String r3 = "style=\"dashed\""
            r2.append(r3)
        L_0x0082:
            java.lang.String r3 = ">"
            r2.append(r3)
            r2.append(r1)
            if (r4 == 0) goto L_0x00a7
            java.lang.String r1 = " ["
            r2.append(r1)
            int r1 = r4.groupIndex
            int r1 = r1 + 1
            r2.append(r1)
            java.lang.String r1 = "/"
            r2.append(r1)
            int r1 = androidx.constraintlayout.core.widgets.analyzer.RunGroup.index
            r2.append(r1)
            java.lang.String r1 = "]"
            r2.append(r1)
        L_0x00a7:
            java.lang.String r1 = " </TD>"
            r2.append(r1)
            r2.append(r6)
            if (r0 != 0) goto L_0x00c0
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r10 = r10.end
            boolean r10 = r10.resolved
            if (r10 == 0) goto L_0x00ba
            r2.append(r5)
        L_0x00ba:
            java.lang.String r10 = " PORT=\"RIGHT\" BORDER=\"1\">R</TD>"
        L_0x00bc:
            r2.append(r10)
            goto L_0x00e0
        L_0x00c0:
            r0 = r10
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r0 = (androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun) r0
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.baseline
            boolean r0 = r0.resolved
            if (r0 == 0) goto L_0x00cc
            r2.append(r5)
        L_0x00cc:
            java.lang.String r0 = " PORT=\"BASELINE\" BORDER=\"1\">b</TD>"
            r2.append(r0)
            r2.append(r6)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r10 = r10.end
            boolean r10 = r10.resolved
            if (r10 == 0) goto L_0x00dd
            r2.append(r5)
        L_0x00dd:
            java.lang.String r10 = " PORT=\"BOTTOM\" BORDER=\"1\">B</TD>"
            goto L_0x00bc
        L_0x00e0:
            java.lang.String r10 = "  </TR></TABLE>"
            r2.append(r10)
            java.lang.String r10 = ">];\n"
            r2.append(r10)
            java.lang.String r10 = r2.toString()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.analyzer.DependencyGraph.nodeDefinition(androidx.constraintlayout.core.widgets.analyzer.WidgetRun):java.lang.String");
    }

    public void buildGraph() {
        buildGraph(this.mRuns);
        this.mGroups.clear();
        RunGroup.index = 0;
        findGroup(this.container.horizontalRun, 0, this.mGroups);
        findGroup(this.container.verticalRun, 1, this.mGroups);
        this.mNeedBuildGraph = false;
    }

    public void buildGraph(ArrayList<WidgetRun> arrayList) {
        Object helperReferences;
        arrayList.clear();
        this.mContainer.horizontalRun.clear();
        this.mContainer.verticalRun.clear();
        arrayList.add(this.mContainer.horizontalRun);
        arrayList.add(this.mContainer.verticalRun);
        Iterator<ConstraintWidget> it = this.mContainer.mChildren.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            ConstraintWidget next = it.next();
            if (next instanceof Guideline) {
                helperReferences = new GuidelineReference(next);
            } else {
                if (next.isInHorizontalChain()) {
                    if (next.horizontalChainRun == null) {
                        next.horizontalChainRun = new ChainRun(next, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.horizontalChainRun);
                } else {
                    arrayList.add(next.horizontalRun);
                }
                if (next.isInVerticalChain()) {
                    if (next.verticalChainRun == null) {
                        next.verticalChainRun = new ChainRun(next, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.verticalChainRun);
                } else {
                    arrayList.add(next.verticalRun);
                }
                if (next instanceof HelperWidget) {
                    helperReferences = new HelperReferences(next);
                }
            }
            arrayList.add(helperReferences);
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator<WidgetRun> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            it2.next().clear();
        }
        Iterator<WidgetRun> it3 = arrayList.iterator();
        while (it3.hasNext()) {
            WidgetRun next2 = it3.next();
            if (next2.widget != this.mContainer) {
                next2.apply();
            }
        }
    }

    public void defineTerminalWidgets(ConstraintWidget.DimensionBehaviour dimensionBehaviour, ConstraintWidget.DimensionBehaviour dimensionBehaviour2) {
        if (this.mNeedBuildGraph) {
            buildGraph();
            Iterator<ConstraintWidget> it = this.container.mChildren.iterator();
            boolean z = false;
            while (it.hasNext()) {
                ConstraintWidget next = it.next();
                boolean[] zArr = next.isTerminalWidget;
                zArr[0] = true;
                zArr[1] = true;
                if (next instanceof Barrier) {
                    z = true;
                }
            }
            if (!z) {
                Iterator<RunGroup> it2 = this.mGroups.iterator();
                while (it2.hasNext()) {
                    RunGroup next2 = it2.next();
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    next2.defineTerminalWidgets(dimensionBehaviour == dimensionBehaviour3, dimensionBehaviour2 == dimensionBehaviour3);
                }
            }
        }
    }

    public boolean directMeasure(boolean z) {
        boolean z2;
        boolean z3 = true;
        boolean z4 = z & true;
        if (this.mNeedBuildGraph || this.mNeedRedoMeasures) {
            Iterator<ConstraintWidget> it = this.container.mChildren.iterator();
            while (it.hasNext()) {
                ConstraintWidget next = it.next();
                next.ensureWidgetRuns();
                next.measured = false;
                next.horizontalRun.reset();
                next.verticalRun.reset();
            }
            this.container.ensureWidgetRuns();
            ConstraintWidgetContainer constraintWidgetContainer = this.container;
            constraintWidgetContainer.measured = false;
            constraintWidgetContainer.horizontalRun.reset();
            this.container.verticalRun.reset();
            this.mNeedRedoMeasures = false;
        }
        if (basicMeasureWidgets(this.mContainer)) {
            return false;
        }
        this.container.setX(0);
        this.container.setY(0);
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = this.container.getDimensionBehaviour(0);
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = this.container.getDimensionBehaviour(1);
        if (this.mNeedBuildGraph) {
            buildGraph();
        }
        int x = this.container.getX();
        int y = this.container.getY();
        this.container.horizontalRun.start.resolve(x);
        this.container.verticalRun.start.resolve(y);
        measureWidgets();
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        if (dimensionBehaviour == dimensionBehaviour3 || dimensionBehaviour2 == dimensionBehaviour3) {
            if (z4) {
                Iterator<WidgetRun> it2 = this.mRuns.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (!it2.next().supportsWrapComputation()) {
                            z4 = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (z4 && dimensionBehaviour == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                this.container.setHorizontalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.FIXED);
                ConstraintWidgetContainer constraintWidgetContainer2 = this.container;
                constraintWidgetContainer2.setWidth(computeWrap(constraintWidgetContainer2, 0));
                ConstraintWidgetContainer constraintWidgetContainer3 = this.container;
                constraintWidgetContainer3.horizontalRun.dimension.resolve(constraintWidgetContainer3.getWidth());
            }
            if (z4 && dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                this.container.setVerticalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.FIXED);
                ConstraintWidgetContainer constraintWidgetContainer4 = this.container;
                constraintWidgetContainer4.setHeight(computeWrap(constraintWidgetContainer4, 1));
                ConstraintWidgetContainer constraintWidgetContainer5 = this.container;
                constraintWidgetContainer5.verticalRun.dimension.resolve(constraintWidgetContainer5.getHeight());
            }
        }
        ConstraintWidgetContainer constraintWidgetContainer6 = this.container;
        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidgetContainer6.mListDimensionBehaviors;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = dimensionBehaviourArr[0];
        ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.FIXED;
        if (dimensionBehaviour4 == dimensionBehaviour5 || dimensionBehaviourArr[0] == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
            int width = constraintWidgetContainer6.getWidth() + x;
            this.container.horizontalRun.end.resolve(width);
            this.container.horizontalRun.dimension.resolve(width - x);
            measureWidgets();
            ConstraintWidgetContainer constraintWidgetContainer7 = this.container;
            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr2 = constraintWidgetContainer7.mListDimensionBehaviors;
            if (dimensionBehaviourArr2[1] == dimensionBehaviour5 || dimensionBehaviourArr2[1] == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
                int height = constraintWidgetContainer7.getHeight() + y;
                this.container.verticalRun.end.resolve(height);
                this.container.verticalRun.dimension.resolve(height - y);
            }
            measureWidgets();
            z2 = true;
        } else {
            z2 = false;
        }
        Iterator<WidgetRun> it3 = this.mRuns.iterator();
        while (it3.hasNext()) {
            WidgetRun next2 = it3.next();
            if (next2.widget != this.container || next2.resolved) {
                next2.applyToWidget();
            }
        }
        Iterator<WidgetRun> it4 = this.mRuns.iterator();
        while (true) {
            if (!it4.hasNext()) {
                break;
            }
            WidgetRun next3 = it4.next();
            if ((z2 || next3.widget != this.container) && (!next3.start.resolved || ((!next3.end.resolved && !(next3 instanceof GuidelineReference)) || (!next3.dimension.resolved && !(next3 instanceof ChainRun) && !(next3 instanceof GuidelineReference))))) {
                z3 = false;
            }
        }
        z3 = false;
        this.container.setHorizontalDimensionBehaviour(dimensionBehaviour);
        this.container.setVerticalDimensionBehaviour(dimensionBehaviour2);
        return z3;
    }

    public boolean directMeasureSetup(boolean z) {
        if (this.mNeedBuildGraph) {
            Iterator<ConstraintWidget> it = this.container.mChildren.iterator();
            while (it.hasNext()) {
                ConstraintWidget next = it.next();
                next.ensureWidgetRuns();
                next.measured = false;
                HorizontalWidgetRun horizontalWidgetRun = next.horizontalRun;
                horizontalWidgetRun.dimension.resolved = false;
                horizontalWidgetRun.resolved = false;
                horizontalWidgetRun.reset();
                VerticalWidgetRun verticalWidgetRun = next.verticalRun;
                verticalWidgetRun.dimension.resolved = false;
                verticalWidgetRun.resolved = false;
                verticalWidgetRun.reset();
            }
            this.container.ensureWidgetRuns();
            ConstraintWidgetContainer constraintWidgetContainer = this.container;
            constraintWidgetContainer.measured = false;
            HorizontalWidgetRun horizontalWidgetRun2 = constraintWidgetContainer.horizontalRun;
            horizontalWidgetRun2.dimension.resolved = false;
            horizontalWidgetRun2.resolved = false;
            horizontalWidgetRun2.reset();
            VerticalWidgetRun verticalWidgetRun2 = this.container.verticalRun;
            verticalWidgetRun2.dimension.resolved = false;
            verticalWidgetRun2.resolved = false;
            verticalWidgetRun2.reset();
            buildGraph();
        }
        if (basicMeasureWidgets(this.mContainer)) {
            return false;
        }
        this.container.setX(0);
        this.container.setY(0);
        this.container.horizontalRun.start.resolve(0);
        this.container.verticalRun.start.resolve(0);
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x013e A[EDGE_INSN: B:78:0x013e->B:64:0x013e ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean directMeasureWithOrientation(boolean r10, int r11) {
        /*
            r9 = this;
            r0 = 1
            r10 = r10 & r0
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r1 = r9.container
            r2 = 0
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = r1.getDimensionBehaviour(r2)
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r3 = r9.container
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = r3.getDimensionBehaviour(r0)
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r4 = r9.container
            int r4 = r4.getX()
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r5 = r9.container
            int r5 = r5.getY()
            if (r10 == 0) goto L_0x0086
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r1 == r6) goto L_0x0023
            if (r3 != r6) goto L_0x0086
        L_0x0023:
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r6 = r9.mRuns
            java.util.Iterator r6 = r6.iterator()
        L_0x0029:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0040
            java.lang.Object r7 = r6.next()
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r7 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r7
            int r8 = r7.orientation
            if (r8 != r11) goto L_0x0029
            boolean r7 = r7.supportsWrapComputation()
            if (r7 != 0) goto L_0x0029
            r10 = 0
        L_0x0040:
            if (r11 != 0) goto L_0x0063
            if (r10 == 0) goto L_0x0086
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r10 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r1 != r10) goto L_0x0086
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r10 = r9.container
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r10.setHorizontalDimensionBehaviour(r6)
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r10 = r9.container
            int r6 = r9.computeWrap(r10, r2)
            r10.setWidth(r6)
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r10 = r9.container
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r6 = r10.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r6 = r6.dimension
            int r10 = r10.getWidth()
            goto L_0x0083
        L_0x0063:
            if (r10 == 0) goto L_0x0086
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r10 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r3 != r10) goto L_0x0086
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r10 = r9.container
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r10.setVerticalDimensionBehaviour(r6)
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r10 = r9.container
            int r6 = r9.computeWrap(r10, r0)
            r10.setHeight(r6)
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r10 = r9.container
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r6 = r10.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r6 = r6.dimension
            int r10 = r10.getHeight()
        L_0x0083:
            r6.resolve(r10)
        L_0x0086:
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r10 = r9.container
            if (r11 != 0) goto L_0x00b1
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r5 = r10.mListDimensionBehaviors
            r6 = r5[r2]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r6 == r7) goto L_0x0098
            r5 = r5[r2]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT
            if (r5 != r6) goto L_0x00c0
        L_0x0098:
            int r10 = r10.getWidth()
            int r10 = r10 + r4
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r5 = r9.container
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r5 = r5.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r5 = r5.end
            r5.resolve(r10)
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r5 = r9.container
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r5 = r5.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r5 = r5.dimension
            int r10 = r10 - r4
            r5.resolve(r10)
            goto L_0x00da
        L_0x00b1:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r4 = r10.mListDimensionBehaviors
            r6 = r4[r0]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r6 == r7) goto L_0x00c2
            r4 = r4[r0]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT
            if (r4 != r6) goto L_0x00c0
            goto L_0x00c2
        L_0x00c0:
            r10 = 0
            goto L_0x00db
        L_0x00c2:
            int r10 = r10.getHeight()
            int r10 = r10 + r5
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r4 = r9.container
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r4 = r4.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r4 = r4.end
            r4.resolve(r10)
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r4 = r9.container
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r4 = r4.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r4 = r4.dimension
            int r10 = r10 - r5
            r4.resolve(r10)
        L_0x00da:
            r10 = 1
        L_0x00db:
            r9.measureWidgets()
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r4 = r9.mRuns
            java.util.Iterator r4 = r4.iterator()
        L_0x00e4:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0104
            java.lang.Object r5 = r4.next()
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r5 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r5
            int r6 = r5.orientation
            if (r6 == r11) goto L_0x00f5
            goto L_0x00e4
        L_0x00f5:
            androidx.constraintlayout.core.widgets.ConstraintWidget r6 = r5.widget
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r7 = r9.container
            if (r6 != r7) goto L_0x0100
            boolean r6 = r5.resolved
            if (r6 != 0) goto L_0x0100
            goto L_0x00e4
        L_0x0100:
            r5.applyToWidget()
            goto L_0x00e4
        L_0x0104:
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r4 = r9.mRuns
            java.util.Iterator r4 = r4.iterator()
        L_0x010a:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x013e
            java.lang.Object r5 = r4.next()
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r5 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r5
            int r6 = r5.orientation
            if (r6 == r11) goto L_0x011b
            goto L_0x010a
        L_0x011b:
            if (r10 != 0) goto L_0x0124
            androidx.constraintlayout.core.widgets.ConstraintWidget r6 = r5.widget
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r7 = r9.container
            if (r6 != r7) goto L_0x0124
            goto L_0x010a
        L_0x0124:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r6 = r5.start
            boolean r6 = r6.resolved
            if (r6 != 0) goto L_0x012c
        L_0x012a:
            r0 = 0
            goto L_0x013e
        L_0x012c:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r6 = r5.end
            boolean r6 = r6.resolved
            if (r6 != 0) goto L_0x0133
            goto L_0x012a
        L_0x0133:
            boolean r6 = r5 instanceof androidx.constraintlayout.core.widgets.analyzer.ChainRun
            if (r6 != 0) goto L_0x010a
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r5 = r5.dimension
            boolean r5 = r5.resolved
            if (r5 != 0) goto L_0x010a
            goto L_0x012a
        L_0x013e:
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r10 = r9.container
            r10.setHorizontalDimensionBehaviour(r1)
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r10 = r9.container
            r10.setVerticalDimensionBehaviour(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.analyzer.DependencyGraph.directMeasureWithOrientation(boolean, int):boolean");
    }

    public void invalidateGraph() {
        this.mNeedBuildGraph = true;
    }

    public void invalidateMeasures() {
        this.mNeedRedoMeasures = true;
    }

    public void measureWidgets() {
        DimensionDependency dimensionDependency;
        DimensionDependency dimensionDependency2;
        int width;
        DimensionDependency dimensionDependency3;
        int width2;
        Iterator<ConstraintWidget> it = this.container.mChildren.iterator();
        while (it.hasNext()) {
            ConstraintWidget next = it.next();
            if (!next.measured) {
                ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = next.mListDimensionBehaviors;
                boolean z = false;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = dimensionBehaviourArr[1];
                int i = next.mMatchConstraintDefaultWidth;
                int i2 = next.mMatchConstraintDefaultHeight;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                boolean z2 = dimensionBehaviour == dimensionBehaviour3 || (dimensionBehaviour == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && i == 1);
                if (dimensionBehaviour2 == dimensionBehaviour3 || (dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && i2 == 1)) {
                    z = true;
                }
                DimensionDependency dimensionDependency4 = next.horizontalRun.dimension;
                boolean z3 = dimensionDependency4.resolved;
                DimensionDependency dimensionDependency5 = next.verticalRun.dimension;
                boolean z4 = dimensionDependency5.resolved;
                if (!z3 || !z4) {
                    if (!z3 || !z) {
                        if (z4 && z2) {
                            measure(next, dimensionBehaviour3, dimensionDependency4.value, ConstraintWidget.DimensionBehaviour.FIXED, dimensionDependency5.value);
                            if (dimensionBehaviour == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                                dimensionDependency3 = next.horizontalRun.dimension;
                                width2 = next.getWidth();
                            } else {
                                dimensionDependency2 = next.horizontalRun.dimension;
                                width = next.getWidth();
                                dimensionDependency2.resolve(width);
                            }
                        }
                        if (next.measured && (dimensionDependency = next.verticalRun.baselineDimension) != null) {
                            dimensionDependency.resolve(next.getBaselineDistance());
                        }
                    } else {
                        measure(next, ConstraintWidget.DimensionBehaviour.FIXED, dimensionDependency4.value, dimensionBehaviour3, dimensionDependency5.value);
                        if (dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                            dimensionDependency3 = next.verticalRun.dimension;
                            width2 = next.getHeight();
                        } else {
                            dimensionDependency2 = next.verticalRun.dimension;
                            width = next.getHeight();
                            dimensionDependency2.resolve(width);
                        }
                    }
                    dimensionDependency3.wrapValue = width2;
                    dimensionDependency.resolve(next.getBaselineDistance());
                } else {
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.FIXED;
                    measure(next, dimensionBehaviour4, dimensionDependency4.value, dimensionBehaviour4, dimensionDependency5.value);
                }
                next.measured = true;
                dimensionDependency.resolve(next.getBaselineDistance());
            }
        }
    }

    public void setMeasurer(BasicMeasure.Measurer measurer) {
        this.mMeasurer = measurer;
    }
}
