package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.LinearSystem;
import androidx.constraintlayout.solver.SolverVariable;
import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import java.util.ArrayList;

public class Guideline extends ConstraintWidget {
    public static final int HORIZONTAL = 0;
    public static final int RELATIVE_BEGIN = 1;
    public static final int RELATIVE_END = 2;
    public static final int RELATIVE_PERCENT = 0;
    public static final int RELATIVE_UNKNWON = -1;
    public static final int VERTICAL = 1;
    private ConstraintAnchor mAnchor = this.mTop;
    private Rectangle mHead;
    private int mHeadSize;
    private boolean mIsPositionRelaxed;
    private int mMinimumPosition;
    private int mOrientation;
    protected int mRelativeBegin = -1;
    protected int mRelativeEnd = -1;
    protected float mRelativePercent = -1.0f;

    /* renamed from: androidx.constraintlayout.solver.widgets.Guideline$1 */
    static /* synthetic */ class C01381 {

        /* renamed from: $SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type */
        static final /* synthetic */ int[] f18x4c44d048;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|(3:17|18|20)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type[] r0 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f18x4c44d048 = r0
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.LEFT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f18x4c44d048     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f18x4c44d048     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.TOP     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f18x4c44d048     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f18x4c44d048     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BASELINE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f18x4c44d048     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f18x4c44d048     // Catch:{ NoSuchFieldError -> 0x0054 }
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER_X     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f18x4c44d048     // Catch:{ NoSuchFieldError -> 0x0060 }
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER_Y     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f18x4c44d048     // Catch:{ NoSuchFieldError -> 0x006c }
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.NONE     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.Guideline.C01381.<clinit>():void");
        }
    }

    public Guideline() {
        this.mOrientation = 0;
        this.mIsPositionRelaxed = false;
        this.mMinimumPosition = 0;
        this.mHead = new Rectangle();
        this.mHeadSize = 8;
        this.mAnchors.clear();
        this.mAnchors.add(this.mAnchor);
        int length = this.mListAnchors.length;
        for (int i = 0; i < length; i++) {
            this.mListAnchors[i] = this.mAnchor;
        }
    }

    public void addToSolver(LinearSystem linearSystem) {
        ConstraintWidgetContainer constraintWidgetContainer = (ConstraintWidgetContainer) getParent();
        if (constraintWidgetContainer != null) {
            ConstraintAnchor anchor = constraintWidgetContainer.getAnchor(ConstraintAnchor.Type.LEFT);
            ConstraintAnchor anchor2 = constraintWidgetContainer.getAnchor(ConstraintAnchor.Type.RIGHT);
            ConstraintWidget constraintWidget = this.mParent;
            boolean z = true;
            boolean z2 = constraintWidget != null && constraintWidget.mListDimensionBehaviors[0] == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            if (this.mOrientation == 0) {
                anchor = constraintWidgetContainer.getAnchor(ConstraintAnchor.Type.TOP);
                anchor2 = constraintWidgetContainer.getAnchor(ConstraintAnchor.Type.BOTTOM);
                ConstraintWidget constraintWidget2 = this.mParent;
                if (constraintWidget2 == null || constraintWidget2.mListDimensionBehaviors[1] != ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                    z = false;
                }
                z2 = z;
            }
            if (this.mRelativeBegin != -1) {
                SolverVariable createObjectVariable = linearSystem.createObjectVariable(this.mAnchor);
                linearSystem.addEquality(createObjectVariable, linearSystem.createObjectVariable(anchor), this.mRelativeBegin, 6);
                if (z2) {
                    linearSystem.addGreaterThan(linearSystem.createObjectVariable(anchor2), createObjectVariable, 0, 5);
                }
            } else if (this.mRelativeEnd != -1) {
                SolverVariable createObjectVariable2 = linearSystem.createObjectVariable(this.mAnchor);
                SolverVariable createObjectVariable3 = linearSystem.createObjectVariable(anchor2);
                linearSystem.addEquality(createObjectVariable2, createObjectVariable3, -this.mRelativeEnd, 6);
                if (z2) {
                    linearSystem.addGreaterThan(createObjectVariable2, linearSystem.createObjectVariable(anchor), 0, 5);
                    linearSystem.addGreaterThan(createObjectVariable3, createObjectVariable2, 0, 5);
                }
            } else if (this.mRelativePercent != -1.0f) {
                linearSystem.addConstraint(LinearSystem.createRowDimensionPercent(linearSystem, linearSystem.createObjectVariable(this.mAnchor), linearSystem.createObjectVariable(anchor), linearSystem.createObjectVariable(anchor2), this.mRelativePercent, this.mIsPositionRelaxed));
            }
        }
    }

    public boolean allowedInBarrier() {
        return true;
    }

    public void analyze(int i) {
        ConstraintAnchor constraintAnchor;
        ResolutionAnchor resolutionAnchor;
        int i2;
        ConstraintAnchor constraintAnchor2;
        ResolutionAnchor resolutionAnchor2;
        ResolutionAnchor resolutionNode;
        int i3;
        ConstraintAnchor constraintAnchor3;
        ResolutionAnchor resolutionNode2;
        ConstraintWidget parent = getParent();
        if (parent != null) {
            if (getOrientation() == 1) {
                this.mTop.getResolutionNode().dependsOn(1, parent.mTop.getResolutionNode(), 0);
                this.mBottom.getResolutionNode().dependsOn(1, parent.mTop.getResolutionNode(), 0);
                if (this.mRelativeBegin != -1) {
                    this.mLeft.getResolutionNode().dependsOn(1, parent.mLeft.getResolutionNode(), this.mRelativeBegin);
                    resolutionAnchor2 = this.mRight.getResolutionNode();
                    constraintAnchor3 = parent.mLeft;
                } else if (this.mRelativeEnd != -1) {
                    this.mLeft.getResolutionNode().dependsOn(1, parent.mRight.getResolutionNode(), -this.mRelativeEnd);
                    resolutionNode2 = this.mRight.getResolutionNode();
                    constraintAnchor2 = parent.mRight;
                    resolutionNode = constraintAnchor2.getResolutionNode();
                    i3 = -this.mRelativeEnd;
                    resolutionAnchor2.dependsOn(1, resolutionNode, i3);
                } else if (this.mRelativePercent != -1.0f && parent.getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.FIXED) {
                    i2 = (int) (((float) parent.mWidth) * this.mRelativePercent);
                    this.mLeft.getResolutionNode().dependsOn(1, parent.mLeft.getResolutionNode(), i2);
                    resolutionAnchor = this.mRight.getResolutionNode();
                    constraintAnchor = parent.mLeft;
                    resolutionAnchor.dependsOn(1, constraintAnchor.getResolutionNode(), i2);
                    return;
                } else {
                    return;
                }
            } else {
                this.mLeft.getResolutionNode().dependsOn(1, parent.mLeft.getResolutionNode(), 0);
                this.mRight.getResolutionNode().dependsOn(1, parent.mLeft.getResolutionNode(), 0);
                if (this.mRelativeBegin != -1) {
                    this.mTop.getResolutionNode().dependsOn(1, parent.mTop.getResolutionNode(), this.mRelativeBegin);
                    resolutionAnchor2 = this.mBottom.getResolutionNode();
                    constraintAnchor3 = parent.mTop;
                } else if (this.mRelativeEnd != -1) {
                    this.mTop.getResolutionNode().dependsOn(1, parent.mBottom.getResolutionNode(), -this.mRelativeEnd);
                    resolutionNode2 = this.mBottom.getResolutionNode();
                    constraintAnchor2 = parent.mBottom;
                    resolutionNode = constraintAnchor2.getResolutionNode();
                    i3 = -this.mRelativeEnd;
                    resolutionAnchor2.dependsOn(1, resolutionNode, i3);
                } else if (this.mRelativePercent != -1.0f && parent.getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.FIXED) {
                    i2 = (int) (((float) parent.mHeight) * this.mRelativePercent);
                    this.mTop.getResolutionNode().dependsOn(1, parent.mTop.getResolutionNode(), i2);
                    resolutionAnchor = this.mBottom.getResolutionNode();
                    constraintAnchor = parent.mTop;
                    resolutionAnchor.dependsOn(1, constraintAnchor.getResolutionNode(), i2);
                    return;
                } else {
                    return;
                }
            }
            resolutionNode = constraintAnchor3.getResolutionNode();
            i3 = this.mRelativeBegin;
            resolutionAnchor2.dependsOn(1, resolutionNode, i3);
        }
    }

    public void cyclePosition() {
        if (this.mRelativeBegin != -1) {
            inferRelativePercentPosition();
        } else if (this.mRelativePercent != -1.0f) {
            inferRelativeEndPosition();
        } else if (this.mRelativeEnd != -1) {
            inferRelativeBeginPosition();
        }
    }

    public ConstraintAnchor getAnchor() {
        return this.mAnchor;
    }

    public ConstraintAnchor getAnchor(ConstraintAnchor.Type type) {
        switch (C01381.f18x4c44d048[type.ordinal()]) {
            case 1:
            case 2:
                if (this.mOrientation == 1) {
                    return this.mAnchor;
                }
                break;
            case 3:
            case 4:
                if (this.mOrientation == 0) {
                    return this.mAnchor;
                }
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
        }
        throw new AssertionError(type.name());
    }

    public ArrayList<ConstraintAnchor> getAnchors() {
        return this.mAnchors;
    }

    public Rectangle getHead() {
        Rectangle rectangle = this.mHead;
        int drawX = getDrawX() - this.mHeadSize;
        int drawY = getDrawY();
        int i = this.mHeadSize;
        rectangle.setBounds(drawX, drawY - (i * 2), i * 2, i * 2);
        if (getOrientation() == 0) {
            Rectangle rectangle2 = this.mHead;
            int drawX2 = getDrawX() - (this.mHeadSize * 2);
            int drawY2 = getDrawY();
            int i2 = this.mHeadSize;
            rectangle2.setBounds(drawX2, drawY2 - i2, i2 * 2, i2 * 2);
        }
        return this.mHead;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public int getRelativeBegin() {
        return this.mRelativeBegin;
    }

    public int getRelativeBehaviour() {
        if (this.mRelativePercent != -1.0f) {
            return 0;
        }
        if (this.mRelativeBegin != -1) {
            return 1;
        }
        return this.mRelativeEnd != -1 ? 2 : -1;
    }

    public int getRelativeEnd() {
        return this.mRelativeEnd;
    }

    public float getRelativePercent() {
        return this.mRelativePercent;
    }

    public String getType() {
        return "Guideline";
    }

    /* access modifiers changed from: package-private */
    public void inferRelativeBeginPosition() {
        int x = getX();
        if (this.mOrientation == 0) {
            x = getY();
        }
        setGuideBegin(x);
    }

    /* access modifiers changed from: package-private */
    public void inferRelativeEndPosition() {
        int width = getParent().getWidth() - getX();
        if (this.mOrientation == 0) {
            width = getParent().getHeight() - getY();
        }
        setGuideEnd(width);
    }

    /* access modifiers changed from: package-private */
    public void inferRelativePercentPosition() {
        float x = ((float) getX()) / ((float) getParent().getWidth());
        if (this.mOrientation == 0) {
            x = ((float) getY()) / ((float) getParent().getHeight());
        }
        setGuidePercent(x);
    }

    public void setDrawOrigin(int i, int i2) {
        int i3;
        float f;
        if (this.mOrientation == 1) {
            int i4 = i - this.mOffsetX;
            if (this.mRelativeBegin != -1) {
                setGuideBegin(i4);
                return;
            } else if (this.mRelativeEnd != -1) {
                setGuideEnd(getParent().getWidth() - i4);
                return;
            } else if (this.mRelativePercent != -1.0f) {
                f = (float) i4;
                i3 = getParent().getWidth();
            } else {
                return;
            }
        } else {
            int i5 = i2 - this.mOffsetY;
            if (this.mRelativeBegin != -1) {
                setGuideBegin(i5);
                return;
            } else if (this.mRelativeEnd != -1) {
                setGuideEnd(getParent().getHeight() - i5);
                return;
            } else if (this.mRelativePercent != -1.0f) {
                f = (float) i5;
                i3 = getParent().getHeight();
            } else {
                return;
            }
        }
        setGuidePercent(f / ((float) i3));
    }

    public void setGuideBegin(int i) {
        if (i > -1) {
            this.mRelativePercent = -1.0f;
            this.mRelativeBegin = i;
            this.mRelativeEnd = -1;
        }
    }

    public void setGuideEnd(int i) {
        if (i > -1) {
            this.mRelativePercent = -1.0f;
            this.mRelativeBegin = -1;
            this.mRelativeEnd = i;
        }
    }

    public void setGuidePercent(float f) {
        if (f > -1.0f) {
            this.mRelativePercent = f;
            this.mRelativeBegin = -1;
            this.mRelativeEnd = -1;
        }
    }

    public void setGuidePercent(int i) {
        setGuidePercent(((float) i) / 100.0f);
    }

    public void setMinimumPosition(int i) {
        this.mMinimumPosition = i;
    }

    public void setOrientation(int i) {
        if (this.mOrientation != i) {
            this.mOrientation = i;
            this.mAnchors.clear();
            this.mAnchor = this.mOrientation == 1 ? this.mLeft : this.mTop;
            this.mAnchors.add(this.mAnchor);
            int length = this.mListAnchors.length;
            for (int i2 = 0; i2 < length; i2++) {
                this.mListAnchors[i2] = this.mAnchor;
            }
        }
    }

    public void setPositionRelaxed(boolean z) {
        if (this.mIsPositionRelaxed != z) {
            this.mIsPositionRelaxed = z;
        }
    }

    public void updateFromSolver(LinearSystem linearSystem) {
        if (getParent() != null) {
            int objectVariableValue = linearSystem.getObjectVariableValue(this.mAnchor);
            if (this.mOrientation == 1) {
                setX(objectVariableValue);
                setY(0);
                setHeight(getParent().getHeight());
                setWidth(0);
                return;
            }
            setX(0);
            setY(objectVariableValue);
            setWidth(getParent().getWidth());
            setHeight(0);
        }
    }
}
