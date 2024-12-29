package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.state.HelperReference;
import androidx.constraintlayout.core.state.State;

public class AlignHorizontallyReference extends HelperReference {
    private float mBias = 0.5f;

    public AlignHorizontallyReference(State state) {
        super(state, State.Helper.ALIGN_VERTICALLY);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0006 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void apply() {
        /*
            r4 = this;
            java.util.ArrayList<java.lang.Object> r0 = r4.mReferences
            java.util.Iterator r0 = r0.iterator()
        L_0x0006:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x004a
            java.lang.Object r1 = r0.next()
            androidx.constraintlayout.core.state.State r2 = r4.mState
            androidx.constraintlayout.core.state.ConstraintReference r1 = r2.constraints(r1)
            r1.clearHorizontal()
            java.lang.Object r2 = r4.mStartToStart
            if (r2 == 0) goto L_0x0021
        L_0x001d:
            r1.startToStart(r2)
            goto L_0x002c
        L_0x0021:
            java.lang.Object r2 = r4.mStartToEnd
            if (r2 == 0) goto L_0x0029
            r1.startToEnd(r2)
            goto L_0x002c
        L_0x0029:
            java.lang.Integer r2 = androidx.constraintlayout.core.state.State.PARENT
            goto L_0x001d
        L_0x002c:
            java.lang.Object r2 = r4.mEndToStart
            if (r2 == 0) goto L_0x0034
            r1.endToStart(r2)
            goto L_0x003e
        L_0x0034:
            java.lang.Object r2 = r4.mEndToEnd
            if (r2 == 0) goto L_0x0039
            goto L_0x003b
        L_0x0039:
            java.lang.Integer r2 = androidx.constraintlayout.core.state.State.PARENT
        L_0x003b:
            r1.endToEnd(r2)
        L_0x003e:
            float r2 = r4.mBias
            r3 = 1056964608(0x3f000000, float:0.5)
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 == 0) goto L_0x0006
            r1.horizontalBias(r2)
            goto L_0x0006
        L_0x004a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.state.helpers.AlignHorizontallyReference.apply():void");
    }
}
