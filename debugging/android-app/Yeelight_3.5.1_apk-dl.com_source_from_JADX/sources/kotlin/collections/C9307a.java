package kotlin.collections;

import java.util.Iterator;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: kotlin.collections.a */
public abstract class C9307a<T> implements Iterator<T> {
    @NotNull

    /* renamed from: a */
    private State f17237a = State.NotReady;
    @Nullable

    /* renamed from: b */
    private T f17238b;

    /* renamed from: kotlin.collections.a$a */
    public /* synthetic */ class C9308a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f17239a;

        static {
            int[] iArr = new int[State.values().length];
            iArr[State.Done.ordinal()] = 1;
            iArr[State.Ready.ordinal()] = 2;
            f17239a = iArr;
        }
    }

    /* renamed from: d */
    private final boolean m22804d() {
        this.f17237a = State.Failed;
        mo37994a();
        return this.f17237a == State.Ready;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo37994a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo37995b() {
        this.f17237a = State.Done;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo37996c(T t) {
        this.f17238b = t;
        this.f17237a = State.Ready;
    }

    public boolean hasNext() {
        State state = this.f17237a;
        if (state != State.Failed) {
            int i = C9308a.f17239a[state.ordinal()];
            if (i == 1) {
                return false;
            }
            if (i != 2) {
                return m22804d();
            }
            return true;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public T next() {
        if (hasNext()) {
            this.f17237a = State.NotReady;
            return this.f17238b;
        }
        throw new NoSuchElementException();
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
