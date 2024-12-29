package com.squareup.haha.guava.base;

import java.util.Iterator;
import java.util.NoSuchElementException;

abstract class AbstractIterator<T> implements Iterator<T> {
    private T next;
    private int state$74e26051;

    /* renamed from: com.squareup.haha.guava.base.AbstractIterator$1 */
    static /* synthetic */ class C41751 {
        static final /* synthetic */ int[] $SwitchMap$com$google$common$base$AbstractIterator$State;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x000e */
        static {
            /*
                com.squareup.haha.guava.base.AbstractIterator.State.values$745902e9()
                r0 = 4
                int[] r0 = new int[r0]
                $SwitchMap$com$google$common$base$AbstractIterator$State = r0
                r1 = 2
                int r2 = com.squareup.haha.guava.base.AbstractIterator.State.DONE$74e26051     // Catch:{ NoSuchFieldError -> 0x000e }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x000e }
            L_0x000e:
                int[] r0 = $SwitchMap$com$google$common$base$AbstractIterator$State     // Catch:{ NoSuchFieldError -> 0x0015 }
                int r2 = com.squareup.haha.guava.base.AbstractIterator.State.READY$74e26051     // Catch:{ NoSuchFieldError -> 0x0015 }
                r2 = 0
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0015 }
            L_0x0015:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.squareup.haha.guava.base.AbstractIterator.C41751.<clinit>():void");
        }
    }

    enum State {
        ;

        static {
            $VALUES$43579d2a = new int[]{1, 2, 3, 4};
        }

        public static int[] values$745902e9() {
            return (int[]) $VALUES$43579d2a.clone();
        }
    }

    /* access modifiers changed from: protected */
    public abstract T computeNext();

    public final boolean hasNext() {
        int i = this.state$74e26051;
        int i2 = State.FAILED$74e26051;
        Ascii.checkState(i != i2);
        int i3 = C41751.$SwitchMap$com$google$common$base$AbstractIterator$State[this.state$74e26051 - 1];
        if (i3 == 1) {
            return false;
        }
        if (i3 == 2) {
            return true;
        }
        this.state$74e26051 = i2;
        this.next = computeNext();
        if (this.state$74e26051 == State.DONE$74e26051) {
            return false;
        }
        this.state$74e26051 = State.READY$74e26051;
        return true;
    }

    public final T next() {
        if (hasNext()) {
            this.state$74e26051 = State.NOT_READY$74e26051;
            T t = this.next;
            this.next = null;
            return t;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
