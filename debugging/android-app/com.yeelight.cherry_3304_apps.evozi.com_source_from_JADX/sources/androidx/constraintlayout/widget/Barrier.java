package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

public class Barrier extends ConstraintHelper {
    public static final int BOTTOM = 3;
    public static final int END = 6;
    public static final int LEFT = 0;
    public static final int RIGHT = 1;
    public static final int START = 5;
    public static final int TOP = 2;
    private androidx.constraintlayout.solver.widgets.Barrier mBarrier;
    private int mIndicatedType;
    private int mResolvedType;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setVisibility(8);
    }

    public boolean allowsGoneWidget() {
        return this.mBarrier.allowsGoneWidget();
    }

    public int getType() {
        return this.mIndicatedType;
    }

    /* access modifiers changed from: protected */
    public void init(AttributeSet attributeSet) {
        super.init(attributeSet);
        this.mBarrier = new androidx.constraintlayout.solver.widgets.Barrier();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0140R.styleable.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0140R.styleable.ConstraintLayout_Layout_barrierDirection) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == C0140R.styleable.ConstraintLayout_Layout_barrierAllowsGoneWidgets) {
                    this.mBarrier.setAllowsGoneWidget(obtainStyledAttributes.getBoolean(index, true));
                }
            }
        }
        this.mHelperWidget = this.mBarrier;
        validateParams();
    }

    public void setAllowsGoneWidget(boolean z) {
        this.mBarrier.setAllowsGoneWidget(z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0030, code lost:
        if (r7 == 6) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0038, code lost:
        if (r7 == 6) goto L_0x0015;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0013, code lost:
        if (r7 == 6) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setType(int r7) {
        /*
            r6 = this;
            r6.mIndicatedType = r7
            r6.mResolvedType = r7
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 6
            r2 = 5
            r3 = 0
            r4 = 1
            r5 = 17
            if (r0 >= r5) goto L_0x0018
            if (r7 != r2) goto L_0x0013
        L_0x0010:
            r6.mResolvedType = r3
            goto L_0x003b
        L_0x0013:
            if (r7 != r1) goto L_0x003b
        L_0x0015:
            r6.mResolvedType = r4
            goto L_0x003b
        L_0x0018:
            android.content.res.Resources r7 = r6.getResources()
            android.content.res.Configuration r7 = r7.getConfiguration()
            int r7 = r7.getLayoutDirection()
            if (r4 != r7) goto L_0x0028
            r7 = 1
            goto L_0x0029
        L_0x0028:
            r7 = 0
        L_0x0029:
            if (r7 == 0) goto L_0x0033
            int r7 = r6.mIndicatedType
            if (r7 != r2) goto L_0x0030
            goto L_0x0015
        L_0x0030:
            if (r7 != r1) goto L_0x003b
            goto L_0x0010
        L_0x0033:
            int r7 = r6.mIndicatedType
            if (r7 != r2) goto L_0x0038
            goto L_0x0010
        L_0x0038:
            if (r7 != r1) goto L_0x003b
            goto L_0x0015
        L_0x003b:
            androidx.constraintlayout.solver.widgets.Barrier r7 = r6.mBarrier
            int r0 = r6.mResolvedType
            r7.setBarrierType(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.Barrier.setType(int):void");
    }
}
