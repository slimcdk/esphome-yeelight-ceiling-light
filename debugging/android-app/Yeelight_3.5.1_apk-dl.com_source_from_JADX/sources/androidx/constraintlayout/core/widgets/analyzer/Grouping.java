package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.Guideline;
import androidx.constraintlayout.core.widgets.HelperWidget;
import java.util.ArrayList;

public class Grouping {
    private static final boolean DEBUG = false;
    private static final boolean DEBUG_GROUPING = false;

    public static WidgetGroup findDependents(ConstraintWidget constraintWidget, int i, ArrayList<WidgetGroup> arrayList, WidgetGroup widgetGroup) {
        ConstraintAnchor constraintAnchor;
        int findGroupInDependents;
        int i2 = i == 0 ? constraintWidget.horizontalGroup : constraintWidget.verticalGroup;
        int i3 = 0;
        if (i2 != -1 && (widgetGroup == null || i2 != widgetGroup.f61id)) {
            int i4 = 0;
            while (true) {
                if (i4 >= arrayList.size()) {
                    break;
                }
                WidgetGroup widgetGroup2 = arrayList.get(i4);
                if (widgetGroup2.getId() == i2) {
                    if (widgetGroup != null) {
                        widgetGroup.moveTo(i, widgetGroup2);
                        arrayList.remove(widgetGroup);
                    }
                    widgetGroup = widgetGroup2;
                } else {
                    i4++;
                }
            }
        } else if (i2 != -1) {
            return widgetGroup;
        }
        if (widgetGroup == null) {
            if ((constraintWidget instanceof HelperWidget) && (findGroupInDependents = ((HelperWidget) constraintWidget).findGroupInDependents(i)) != -1) {
                int i5 = 0;
                while (true) {
                    if (i5 >= arrayList.size()) {
                        break;
                    }
                    WidgetGroup widgetGroup3 = arrayList.get(i5);
                    if (widgetGroup3.getId() == findGroupInDependents) {
                        widgetGroup = widgetGroup3;
                        break;
                    }
                    i5++;
                }
            }
            if (widgetGroup == null) {
                widgetGroup = new WidgetGroup(i);
            }
            arrayList.add(widgetGroup);
        }
        if (widgetGroup.add(constraintWidget)) {
            if (constraintWidget instanceof Guideline) {
                Guideline guideline = (Guideline) constraintWidget;
                ConstraintAnchor anchor = guideline.getAnchor();
                if (guideline.getOrientation() == 0) {
                    i3 = 1;
                }
                anchor.findDependents(i3, arrayList, widgetGroup);
            }
            int id = widgetGroup.getId();
            if (i == 0) {
                constraintWidget.horizontalGroup = id;
                constraintWidget.mLeft.findDependents(i, arrayList, widgetGroup);
                constraintAnchor = constraintWidget.mRight;
            } else {
                constraintWidget.verticalGroup = id;
                constraintWidget.mTop.findDependents(i, arrayList, widgetGroup);
                constraintWidget.mBaseline.findDependents(i, arrayList, widgetGroup);
                constraintAnchor = constraintWidget.mBottom;
            }
            constraintAnchor.findDependents(i, arrayList, widgetGroup);
            constraintWidget.mCenter.findDependents(i, arrayList, widgetGroup);
        }
        return widgetGroup;
    }

    private static WidgetGroup findGroup(ArrayList<WidgetGroup> arrayList, int i) {
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            WidgetGroup widgetGroup = arrayList.get(i2);
            if (i == widgetGroup.f61id) {
                return widgetGroup;
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:177:0x035c  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x0398  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x039d A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean simpleSolvingPass(androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r16, androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measurer r17) {
        /*
            r0 = r16
            java.util.ArrayList r1 = r16.getChildren()
            int r2 = r1.size()
            r3 = 0
            r4 = 0
        L_0x000c:
            if (r4 >= r2) goto L_0x0033
            java.lang.Object r5 = r1.get(r4)
            androidx.constraintlayout.core.widgets.ConstraintWidget r5 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r5
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = r16.getHorizontalDimensionBehaviour()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r7 = r16.getVerticalDimensionBehaviour()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r8 = r5.getHorizontalDimensionBehaviour()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r9 = r5.getVerticalDimensionBehaviour()
            boolean r6 = validInGroup(r6, r7, r8, r9)
            if (r6 != 0) goto L_0x002b
            return r3
        L_0x002b:
            boolean r5 = r5 instanceof androidx.constraintlayout.core.widgets.Flow
            if (r5 == 0) goto L_0x0030
            return r3
        L_0x0030:
            int r4 = r4 + 1
            goto L_0x000c
        L_0x0033:
            androidx.constraintlayout.core.Metrics r4 = r0.mMetrics
            if (r4 == 0) goto L_0x003e
            long r5 = r4.grouping
            r7 = 1
            long r5 = r5 + r7
            r4.grouping = r5
        L_0x003e:
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
        L_0x0045:
            if (r5 >= r2) goto L_0x011e
            java.lang.Object r13 = r1.get(r5)
            androidx.constraintlayout.core.widgets.ConstraintWidget r13 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r13
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r14 = r16.getHorizontalDimensionBehaviour()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r15 = r16.getVerticalDimensionBehaviour()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = r13.getHorizontalDimensionBehaviour()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r12 = r13.getVerticalDimensionBehaviour()
            boolean r4 = validInGroup(r14, r15, r4, r12)
            if (r4 != 0) goto L_0x006d
            androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measure r4 = r0.mMeasure
            int r12 = androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure.SELF_DIMENSIONS
            r14 = r17
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer.measure(r3, r13, r14, r4, r12)
            goto L_0x006f
        L_0x006d:
            r14 = r17
        L_0x006f:
            boolean r4 = r13 instanceof androidx.constraintlayout.core.widgets.Guideline
            if (r4 == 0) goto L_0x0098
            r12 = r13
            androidx.constraintlayout.core.widgets.Guideline r12 = (androidx.constraintlayout.core.widgets.Guideline) r12
            int r15 = r12.getOrientation()
            if (r15 != 0) goto L_0x0086
            if (r8 != 0) goto L_0x0083
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
        L_0x0083:
            r8.add(r12)
        L_0x0086:
            int r15 = r12.getOrientation()
            r3 = 1
            if (r15 != r3) goto L_0x0098
            if (r6 != 0) goto L_0x0095
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r6 = r3
        L_0x0095:
            r6.add(r12)
        L_0x0098:
            boolean r3 = r13 instanceof androidx.constraintlayout.core.widgets.HelperWidget
            if (r3 == 0) goto L_0x00d9
            boolean r3 = r13 instanceof androidx.constraintlayout.core.widgets.Barrier
            if (r3 == 0) goto L_0x00c2
            r3 = r13
            androidx.constraintlayout.core.widgets.Barrier r3 = (androidx.constraintlayout.core.widgets.Barrier) r3
            int r12 = r3.getOrientation()
            if (r12 != 0) goto L_0x00b3
            if (r7 != 0) goto L_0x00b0
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        L_0x00b0:
            r7.add(r3)
        L_0x00b3:
            int r12 = r3.getOrientation()
            r15 = 1
            if (r12 != r15) goto L_0x00d9
            if (r9 != 0) goto L_0x00d6
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            goto L_0x00d6
        L_0x00c2:
            r3 = r13
            androidx.constraintlayout.core.widgets.HelperWidget r3 = (androidx.constraintlayout.core.widgets.HelperWidget) r3
            if (r7 != 0) goto L_0x00cc
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        L_0x00cc:
            r7.add(r3)
            if (r9 != 0) goto L_0x00d6
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
        L_0x00d6:
            r9.add(r3)
        L_0x00d9:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r13.mLeft
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r3.mTarget
            if (r3 != 0) goto L_0x00f6
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r13.mRight
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r3.mTarget
            if (r3 != 0) goto L_0x00f6
            if (r4 != 0) goto L_0x00f6
            boolean r3 = r13 instanceof androidx.constraintlayout.core.widgets.Barrier
            if (r3 != 0) goto L_0x00f6
            if (r10 != 0) goto L_0x00f3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r10 = r3
        L_0x00f3:
            r10.add(r13)
        L_0x00f6:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r13.mTop
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r3.mTarget
            if (r3 != 0) goto L_0x0119
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r13.mBottom
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r3.mTarget
            if (r3 != 0) goto L_0x0119
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r13.mBaseline
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r3.mTarget
            if (r3 != 0) goto L_0x0119
            if (r4 != 0) goto L_0x0119
            boolean r3 = r13 instanceof androidx.constraintlayout.core.widgets.Barrier
            if (r3 != 0) goto L_0x0119
            if (r11 != 0) goto L_0x0116
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r11 = r3
        L_0x0116:
            r11.add(r13)
        L_0x0119:
            int r5 = r5 + 1
            r3 = 0
            goto L_0x0045
        L_0x011e:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            if (r6 == 0) goto L_0x013b
            java.util.Iterator r4 = r6.iterator()
        L_0x0129:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x013b
            java.lang.Object r5 = r4.next()
            androidx.constraintlayout.core.widgets.Guideline r5 = (androidx.constraintlayout.core.widgets.Guideline) r5
            r6 = 0
            r12 = 0
            findDependents(r5, r6, r3, r12)
            goto L_0x0129
        L_0x013b:
            r6 = 0
            r12 = 0
            if (r7 == 0) goto L_0x015c
            java.util.Iterator r4 = r7.iterator()
        L_0x0143:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x015c
            java.lang.Object r5 = r4.next()
            androidx.constraintlayout.core.widgets.HelperWidget r5 = (androidx.constraintlayout.core.widgets.HelperWidget) r5
            androidx.constraintlayout.core.widgets.analyzer.WidgetGroup r7 = findDependents(r5, r6, r3, r12)
            r5.addDependents(r3, r6, r7)
            r7.cleanup(r3)
            r6 = 0
            r12 = 0
            goto L_0x0143
        L_0x015c:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r0.getAnchor(r4)
            java.util.HashSet r5 = r4.getDependents()
            if (r5 == 0) goto L_0x0184
            java.util.HashSet r4 = r4.getDependents()
            java.util.Iterator r4 = r4.iterator()
        L_0x0170:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0184
            java.lang.Object r5 = r4.next()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r5
            androidx.constraintlayout.core.widgets.ConstraintWidget r5 = r5.mOwner
            r6 = 0
            r7 = 0
            findDependents(r5, r6, r3, r7)
            goto L_0x0170
        L_0x0184:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r0.getAnchor(r4)
            java.util.HashSet r5 = r4.getDependents()
            if (r5 == 0) goto L_0x01ac
            java.util.HashSet r4 = r4.getDependents()
            java.util.Iterator r4 = r4.iterator()
        L_0x0198:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x01ac
            java.lang.Object r5 = r4.next()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r5
            androidx.constraintlayout.core.widgets.ConstraintWidget r5 = r5.mOwner
            r6 = 0
            r7 = 0
            findDependents(r5, r6, r3, r7)
            goto L_0x0198
        L_0x01ac:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r0.getAnchor(r4)
            java.util.HashSet r5 = r4.getDependents()
            if (r5 == 0) goto L_0x01d4
            java.util.HashSet r4 = r4.getDependents()
            java.util.Iterator r4 = r4.iterator()
        L_0x01c0:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x01d4
            java.lang.Object r5 = r4.next()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r5
            androidx.constraintlayout.core.widgets.ConstraintWidget r5 = r5.mOwner
            r6 = 0
            r7 = 0
            findDependents(r5, r6, r3, r7)
            goto L_0x01c0
        L_0x01d4:
            r6 = 0
            r7 = 0
            if (r10 == 0) goto L_0x01ec
            java.util.Iterator r4 = r10.iterator()
        L_0x01dc:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x01ec
            java.lang.Object r5 = r4.next()
            androidx.constraintlayout.core.widgets.ConstraintWidget r5 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r5
            findDependents(r5, r6, r3, r7)
            goto L_0x01dc
        L_0x01ec:
            if (r8 == 0) goto L_0x0203
            java.util.Iterator r4 = r8.iterator()
        L_0x01f2:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0203
            java.lang.Object r5 = r4.next()
            androidx.constraintlayout.core.widgets.Guideline r5 = (androidx.constraintlayout.core.widgets.Guideline) r5
            r6 = 1
            findDependents(r5, r6, r3, r7)
            goto L_0x01f2
        L_0x0203:
            r6 = 1
            if (r9 == 0) goto L_0x0223
            java.util.Iterator r4 = r9.iterator()
        L_0x020a:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0223
            java.lang.Object r5 = r4.next()
            androidx.constraintlayout.core.widgets.HelperWidget r5 = (androidx.constraintlayout.core.widgets.HelperWidget) r5
            androidx.constraintlayout.core.widgets.analyzer.WidgetGroup r8 = findDependents(r5, r6, r3, r7)
            r5.addDependents(r3, r6, r8)
            r8.cleanup(r3)
            r6 = 1
            r7 = 0
            goto L_0x020a
        L_0x0223:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r0.getAnchor(r4)
            java.util.HashSet r5 = r4.getDependents()
            if (r5 == 0) goto L_0x024b
            java.util.HashSet r4 = r4.getDependents()
            java.util.Iterator r4 = r4.iterator()
        L_0x0237:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x024b
            java.lang.Object r5 = r4.next()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r5
            androidx.constraintlayout.core.widgets.ConstraintWidget r5 = r5.mOwner
            r6 = 1
            r7 = 0
            findDependents(r5, r6, r3, r7)
            goto L_0x0237
        L_0x024b:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BASELINE
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r0.getAnchor(r4)
            java.util.HashSet r5 = r4.getDependents()
            if (r5 == 0) goto L_0x0273
            java.util.HashSet r4 = r4.getDependents()
            java.util.Iterator r4 = r4.iterator()
        L_0x025f:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0273
            java.lang.Object r5 = r4.next()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r5
            androidx.constraintlayout.core.widgets.ConstraintWidget r5 = r5.mOwner
            r6 = 1
            r7 = 0
            findDependents(r5, r6, r3, r7)
            goto L_0x025f
        L_0x0273:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r0.getAnchor(r4)
            java.util.HashSet r5 = r4.getDependents()
            if (r5 == 0) goto L_0x029b
            java.util.HashSet r4 = r4.getDependents()
            java.util.Iterator r4 = r4.iterator()
        L_0x0287:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x029b
            java.lang.Object r5 = r4.next()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r5
            androidx.constraintlayout.core.widgets.ConstraintWidget r5 = r5.mOwner
            r6 = 1
            r7 = 0
            findDependents(r5, r6, r3, r7)
            goto L_0x0287
        L_0x029b:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r0.getAnchor(r4)
            java.util.HashSet r5 = r4.getDependents()
            if (r5 == 0) goto L_0x02c3
            java.util.HashSet r4 = r4.getDependents()
            java.util.Iterator r4 = r4.iterator()
        L_0x02af:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x02c3
            java.lang.Object r5 = r4.next()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r5
            androidx.constraintlayout.core.widgets.ConstraintWidget r5 = r5.mOwner
            r6 = 1
            r12 = 0
            findDependents(r5, r6, r3, r12)
            goto L_0x02af
        L_0x02c3:
            r6 = 1
            r12 = 0
            if (r11 == 0) goto L_0x02db
            java.util.Iterator r4 = r11.iterator()
        L_0x02cb:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x02db
            java.lang.Object r5 = r4.next()
            androidx.constraintlayout.core.widgets.ConstraintWidget r5 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r5
            findDependents(r5, r6, r3, r12)
            goto L_0x02cb
        L_0x02db:
            r4 = 0
        L_0x02dc:
            if (r4 >= r2) goto L_0x0308
            java.lang.Object r5 = r1.get(r4)
            androidx.constraintlayout.core.widgets.ConstraintWidget r5 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r5
            boolean r6 = r5.oppositeDimensionsTied()
            if (r6 == 0) goto L_0x0305
            int r6 = r5.horizontalGroup
            androidx.constraintlayout.core.widgets.analyzer.WidgetGroup r6 = findGroup(r3, r6)
            int r5 = r5.verticalGroup
            androidx.constraintlayout.core.widgets.analyzer.WidgetGroup r5 = findGroup(r3, r5)
            if (r6 == 0) goto L_0x0305
            if (r5 == 0) goto L_0x0305
            r7 = 0
            r6.moveTo(r7, r5)
            r7 = 2
            r5.setOrientation(r7)
            r3.remove(r6)
        L_0x0305:
            int r4 = r4 + 1
            goto L_0x02dc
        L_0x0308:
            int r1 = r3.size()
            r2 = 1
            if (r1 > r2) goto L_0x0311
            r1 = 0
            return r1
        L_0x0311:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = r16.getHorizontalDimensionBehaviour()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r1 != r2) goto L_0x0353
            java.util.Iterator r1 = r3.iterator()
            r2 = r12
            r6 = 0
        L_0x031f:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0344
            java.lang.Object r4 = r1.next()
            androidx.constraintlayout.core.widgets.analyzer.WidgetGroup r4 = (androidx.constraintlayout.core.widgets.analyzer.WidgetGroup) r4
            int r5 = r4.getOrientation()
            r7 = 1
            if (r5 != r7) goto L_0x0333
            goto L_0x031f
        L_0x0333:
            r5 = 0
            r4.setAuthoritative(r5)
            androidx.constraintlayout.core.LinearSystem r7 = r16.getSystem()
            int r7 = r4.measureWrap((androidx.constraintlayout.core.LinearSystem) r7, (int) r5)
            if (r7 <= r6) goto L_0x031f
            r2 = r4
            r6 = r7
            goto L_0x031f
        L_0x0344:
            if (r2 == 0) goto L_0x0353
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r0.setHorizontalDimensionBehaviour(r1)
            r0.setWidth(r6)
            r1 = 1
            r2.setAuthoritative(r1)
            goto L_0x0354
        L_0x0353:
            r2 = r12
        L_0x0354:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = r16.getVerticalDimensionBehaviour()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r1 != r4) goto L_0x0398
            java.util.Iterator r1 = r3.iterator()
            r3 = r12
            r6 = 0
        L_0x0362:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0387
            java.lang.Object r4 = r1.next()
            androidx.constraintlayout.core.widgets.analyzer.WidgetGroup r4 = (androidx.constraintlayout.core.widgets.analyzer.WidgetGroup) r4
            int r5 = r4.getOrientation()
            if (r5 != 0) goto L_0x0375
            goto L_0x0362
        L_0x0375:
            r5 = 0
            r4.setAuthoritative(r5)
            androidx.constraintlayout.core.LinearSystem r7 = r16.getSystem()
            r8 = 1
            int r7 = r4.measureWrap((androidx.constraintlayout.core.LinearSystem) r7, (int) r8)
            if (r7 <= r6) goto L_0x0362
            r3 = r4
            r6 = r7
            goto L_0x0362
        L_0x0387:
            r5 = 0
            r8 = 1
            if (r3 == 0) goto L_0x039a
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r0.setVerticalDimensionBehaviour(r1)
            r0.setHeight(r6)
            r3.setAuthoritative(r8)
            r4 = r3
            goto L_0x039b
        L_0x0398:
            r5 = 0
            r8 = 1
        L_0x039a:
            r4 = r12
        L_0x039b:
            if (r2 != 0) goto L_0x03a2
            if (r4 == 0) goto L_0x03a0
            goto L_0x03a2
        L_0x03a0:
            r3 = 0
            goto L_0x03a3
        L_0x03a2:
            r3 = 1
        L_0x03a3:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.analyzer.Grouping.simpleSolvingPass(androidx.constraintlayout.core.widgets.ConstraintWidgetContainer, androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measurer):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r3 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean validInGroup(androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour r5, androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour r6, androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour r7, androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour r8) {
        /*
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r1 = 0
            r2 = 1
            if (r7 == r0) goto L_0x0013
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r7 == r3) goto L_0x0013
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT
            if (r7 != r4) goto L_0x0011
            if (r5 == r3) goto L_0x0011
            goto L_0x0013
        L_0x0011:
            r5 = 0
            goto L_0x0014
        L_0x0013:
            r5 = 1
        L_0x0014:
            if (r8 == r0) goto L_0x0023
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r8 == r7) goto L_0x0023
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT
            if (r8 != r0) goto L_0x0021
            if (r6 == r7) goto L_0x0021
            goto L_0x0023
        L_0x0021:
            r6 = 0
            goto L_0x0024
        L_0x0023:
            r6 = 1
        L_0x0024:
            if (r5 != 0) goto L_0x002a
            if (r6 == 0) goto L_0x0029
            goto L_0x002a
        L_0x0029:
            return r1
        L_0x002a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.analyzer.Grouping.validInGroup(androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour, androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour, androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour, androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour):boolean");
    }
}
