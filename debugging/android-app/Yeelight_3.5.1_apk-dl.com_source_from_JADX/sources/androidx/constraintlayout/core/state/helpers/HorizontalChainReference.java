package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.state.ConstraintReference;
import androidx.constraintlayout.core.state.State;
import java.util.Iterator;

public class HorizontalChainReference extends ChainReference {

    /* renamed from: androidx.constraintlayout.core.state.helpers.HorizontalChainReference$1 */
    static /* synthetic */ class C01841 {
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
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.state.helpers.HorizontalChainReference.C01841.<clinit>():void");
        }
    }

    public HorizontalChainReference(State state) {
        super(state, State.Helper.HORIZONTAL_CHAIN);
    }

    public void apply() {
        ConstraintReference endToEnd;
        ConstraintReference margin;
        int i;
        ConstraintReference endToEnd2;
        ConstraintReference startToEnd;
        ConstraintReference margin2;
        int i2;
        ConstraintReference startToEnd2;
        Iterator<Object> it = this.mReferences.iterator();
        while (it.hasNext()) {
            this.mState.constraints(it.next()).clearHorizontal();
        }
        Iterator<Object> it2 = this.mReferences.iterator();
        ConstraintReference constraintReference = null;
        ConstraintReference constraintReference2 = null;
        while (it2.hasNext()) {
            ConstraintReference constraints = this.mState.constraints(it2.next());
            if (constraintReference2 == null) {
                Object obj = this.mStartToStart;
                if (obj != null) {
                    startToEnd2 = constraints.startToStart(obj);
                } else {
                    Object obj2 = this.mStartToEnd;
                    if (obj2 != null) {
                        startToEnd2 = constraints.startToEnd(obj2);
                    } else {
                        Object obj3 = this.mLeftToLeft;
                        if (obj3 != null) {
                            startToEnd = constraints.startToStart(obj3);
                        } else {
                            Object obj4 = this.mLeftToRight;
                            if (obj4 != null) {
                                startToEnd = constraints.startToEnd(obj4);
                            } else {
                                constraints.startToStart(State.PARENT);
                                constraintReference2 = constraints;
                            }
                        }
                        margin2 = startToEnd.margin(this.mMarginLeft);
                        i2 = this.mMarginLeftGone;
                        margin2.marginGone(i2);
                        constraintReference2 = constraints;
                    }
                }
                margin2 = startToEnd2.margin(this.mMarginStart);
                i2 = this.mMarginStartGone;
                margin2.marginGone(i2);
                constraintReference2 = constraints;
            }
            if (constraintReference != null) {
                constraintReference.endToStart(constraints.getKey());
                constraints.startToEnd(constraintReference.getKey());
            }
            constraintReference = constraints;
        }
        if (constraintReference != null) {
            Object obj5 = this.mEndToStart;
            if (obj5 != null) {
                endToEnd2 = constraintReference.endToStart(obj5);
            } else {
                Object obj6 = this.mEndToEnd;
                if (obj6 != null) {
                    endToEnd2 = constraintReference.endToEnd(obj6);
                } else {
                    Object obj7 = this.mRightToLeft;
                    if (obj7 != null) {
                        endToEnd = constraintReference.endToStart(obj7);
                    } else {
                        Object obj8 = this.mRightToRight;
                        if (obj8 != null) {
                            endToEnd = constraintReference.endToEnd(obj8);
                        } else {
                            constraintReference.endToEnd(State.PARENT);
                        }
                    }
                    margin = endToEnd.margin(this.mMarginRight);
                    i = this.mMarginRightGone;
                    margin.marginGone(i);
                }
            }
            margin = endToEnd2.margin(this.mMarginEnd);
            i = this.mMarginEndGone;
            margin.marginGone(i);
        }
        if (constraintReference2 != null) {
            float f = this.mBias;
            if (f != 0.5f) {
                constraintReference2.horizontalBias(f);
            }
            int i3 = C01841.$SwitchMap$androidx$constraintlayout$core$state$State$Chain[this.mStyle.ordinal()];
            if (i3 == 1) {
                constraintReference2.setHorizontalChainStyle(0);
            } else if (i3 == 2) {
                constraintReference2.setHorizontalChainStyle(1);
            } else if (i3 == 3) {
                constraintReference2.setHorizontalChainStyle(2);
            }
        }
    }
}
