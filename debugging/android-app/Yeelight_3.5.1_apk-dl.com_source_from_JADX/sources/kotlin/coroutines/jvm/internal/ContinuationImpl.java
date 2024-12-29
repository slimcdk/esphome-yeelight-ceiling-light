package kotlin.coroutines.jvm.internal;

import kotlin.SinceKotlin;
import kotlin.coroutines.C9378a;
import kotlin.coroutines.C9379b;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C9424q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SinceKotlin(version = "1.3")
public abstract class ContinuationImpl extends BaseContinuationImpl {
    @Nullable
    private final CoroutineContext _context;
    @Nullable
    private transient C9378a<Object> intercepted;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ContinuationImpl(@Nullable C9378a<Object> aVar) {
        this(aVar, aVar != null ? aVar.getContext() : null);
    }

    public ContinuationImpl(@Nullable C9378a<Object> aVar, @Nullable CoroutineContext coroutineContext) {
        super(aVar);
        this._context = coroutineContext;
    }

    @NotNull
    public CoroutineContext getContext() {
        CoroutineContext coroutineContext = this._context;
        C9424q.m22993b(coroutineContext);
        return coroutineContext;
    }

    @NotNull
    public final C9378a<Object> intercepted() {
        C9378a<Object> aVar = this.intercepted;
        if (aVar == null) {
            C9379b bVar = (C9379b) getContext().get(C9379b.f17271L);
            if (bVar == null || (aVar = bVar.mo38226b(this)) == null) {
                aVar = this;
            }
            this.intercepted = aVar;
        }
        return aVar;
    }

    /* access modifiers changed from: protected */
    public void releaseIntercepted() {
        C9378a<Object> aVar = this.intercepted;
        if (!(aVar == null || aVar == this)) {
            CoroutineContext.C9376a aVar2 = getContext().get(C9379b.f17271L);
            C9424q.m22993b(aVar2);
            ((C9379b) aVar2).mo38225a(aVar);
        }
        this.intercepted = C9390b.f17273a;
    }
}
