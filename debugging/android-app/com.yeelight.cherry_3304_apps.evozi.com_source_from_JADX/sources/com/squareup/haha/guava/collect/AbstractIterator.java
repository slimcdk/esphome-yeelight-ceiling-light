package com.squareup.haha.guava.collect;

import com.squareup.haha.guava.base.Ascii;
import java.util.NoSuchElementException;

public abstract class AbstractIterator<T> extends UnmodifiableIterator<T> {
    private T next;
    private int state$7fb44498;

    /* renamed from: com.squareup.haha.guava.collect.AbstractIterator$1 */
    static /* synthetic */ class C38421 {
        static final /* synthetic */ int[] $SwitchMap$com$google$common$collect$AbstractIterator$State;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x000e */
        static {
            /*
                com.squareup.haha.guava.collect.AbstractIterator.State.values$a4ba0e2()
                r0 = 4
                int[] r0 = new int[r0]
                $SwitchMap$com$google$common$collect$AbstractIterator$State = r0
                r1 = 2
                int r2 = com.squareup.haha.guava.collect.AbstractIterator.State.DONE$7fb44498     // Catch:{ NoSuchFieldError -> 0x000e }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x000e }
            L_0x000e:
                int[] r0 = $SwitchMap$com$google$common$collect$AbstractIterator$State     // Catch:{ NoSuchFieldError -> 0x0015 }
                int r2 = com.squareup.haha.guava.collect.AbstractIterator.State.READY$7fb44498     // Catch:{ NoSuchFieldError -> 0x0015 }
                r2 = 0
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0015 }
            L_0x0015:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.squareup.haha.guava.collect.AbstractIterator.C38421.<clinit>():void");
        }
    }

    enum State {
        ;

        static {
            $VALUES$2415113d = new int[]{1, 2, 3, 4};
        }

        public static int[] values$a4ba0e2() {
            return (int[]) $VALUES$2415113d.clone();
        }
    }

    /* access modifiers changed from: protected */
    public abstract T computeNext();

    public final boolean hasNext() {
        Ascii.checkState(this.state$7fb44498 != State.FAILED$7fb44498);
        int i = C38421.$SwitchMap$com$google$common$collect$AbstractIterator$State[this.state$7fb44498 - 1];
        if (i == 1) {
            return false;
        }
        if (i == 2) {
            return true;
        }
        this.state$7fb44498 = State.FAILED$7fb44498;
        this.next = computeNext();
        if (this.state$7fb44498 == State.DONE$7fb44498) {
            return false;
        }
        this.state$7fb44498 = State.READY$7fb44498;
        return true;
    }

    public final T next() {
        if (hasNext()) {
            this.state$7fb44498 = State.NOT_READY$7fb44498;
            T t = this.next;
            this.next = null;
            return t;
        }
        throw new NoSuchElementException();
    }
}
