package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.state.ConstraintReference;
import androidx.constraintlayout.core.state.State;
import java.util.Iterator;

public class VerticalChainReference extends ChainReference {

    /* renamed from: androidx.constraintlayout.core.state.helpers.VerticalChainReference$1 */
    static /* synthetic */ class C01851 {
        static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$core$state$State$Chain;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                androidx.constraintlayout.core.state.State$Chain[] r0 = androidx.constraintlayout.core.state.State.Chain.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$androidx$constraintlayout$core$state$State$Chain = r0
                androidx.constraintlayout.core.state.State$Chain r1 = androidx.constraintlayout.core.state.State.Chain.SPREAD     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$androidx$constraintlayout$core$state$State$Chain     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.constraintlayout.core.state.State$Chain r1 = androidx.constraintlayout.core.state.State.Chain.SPREAD_INSIDE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$androidx$constraintlayout$core$state$State$Chain     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.constraintlayout.core.state.State$Chain r1 = androidx.constraintlayout.core.state.State.Chain.PACKED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.state.helpers.VerticalChainReference.C01851.<clinit>():void");
        }
    }

    public VerticalChainReference(State state) {
        super(state, State.Helper.VERTICAL_CHAIN);
    }

    public void apply() {
        ConstraintReference bottomToBottom;
        ConstraintReference constraintReference;
        Iterator<Object> it = this.mReferences.iterator();
        while (it.hasNext()) {
            this.mState.constraints(it.next()).clearVertical();
        }
        Iterator<Object> it2 = this.mReferences.iterator();
        ConstraintReference constraintReference2 = null;
        ConstraintReference constraintReference3 = null;
        while (it2.hasNext()) {
            ConstraintReference constraints = this.mState.constraints(it2.next());
            if (constraintReference3 == null) {
                Object obj = this.mTopToTop;
                if (obj != null) {
                    constraintReference = constraints.topToTop(obj);
                } else {
                    Object obj2 = this.mTopToBottom;
                    if (obj2 != null) {
                        constraintReference = constraints.topToBottom(obj2);
                    } else {
                        constraints.topToTop(State.PARENT);
                        constraintReference3 = constraints;
                    }
                }
                constraintReference.margin(this.mMarginTop).marginGone(this.mMarginTopGone);
                constraintReference3 = constraints;
            }
            if (constraintReference2 != null) {
                constraintReference2.bottomToTop(constraints.getKey());
                constraints.topToBottom(constraintReference2.getKey());
            }
            constraintReference2 = constraints;
        }
        if (constraintReference2 != null) {
            Object obj3 = this.mBottomToTop;
            if (obj3 != null) {
                bottomToBottom = constraintReference2.bottomToTop(obj3);
            } else {
                Object obj4 = this.mBottomToBottom;
                if (obj4 != null) {
                    bottomToBottom = constraintReference2.bottomToBottom(obj4);
                } else {
                    constraintReference2.bottomToBottom(State.PARENT);
                }
            }
            bottomToBottom.margin(this.mMarginBottom).marginGone(this.mMarginBottomGone);
        }
        if (constraintReference3 != null) {
            float f = this.mBias;
            if (f != 0.5f) {
                constraintReference3.verticalBias(f);
            }
            int i = C01851.$SwitchMap$androidx$constraintlayout$core$state$State$Chain[this.mStyle.ordinal()];
            if (i == 1) {
                constraintReference3.setVerticalChainStyle(0);
            } else if (i == 2) {
                constraintReference3.setVerticalChainStyle(1);
            } else if (i == 3) {
                constraintReference3.setVerticalChainStyle(2);
            }
        }
    }
}
