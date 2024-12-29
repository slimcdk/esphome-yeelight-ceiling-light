package kotlin;

import java.io.Serializable;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.C9422o;
import kotlin.jvm.internal.C9424q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@JvmInline
@SinceKotlin(version = "1.3")
public final class Result<T> implements Serializable {
    @NotNull
    public static final C9301a Companion = new C9301a((C9422o) null);
    @Nullable
    private final Object value;

    public static final class Failure implements Serializable {
        @NotNull
        @JvmField
        public final Throwable exception;

        public Failure(@NotNull Throwable th) {
            C9424q.m22996e(th, "exception");
            this.exception = th;
        }

        public boolean equals(@Nullable Object obj) {
            return (obj instanceof Failure) && C9424q.m22992a(this.exception, ((Failure) obj).exception);
        }

        public int hashCode() {
            return this.exception.hashCode();
        }

        @NotNull
        public String toString() {
            return "Failure(" + this.exception + ')';
        }
    }

    /* renamed from: kotlin.Result$a */
    public static final class C9301a {
        private C9301a() {
        }

        public /* synthetic */ C9301a(C9422o oVar) {
            this();
        }
    }

    @PublishedApi
    private /* synthetic */ Result(Object obj) {
        this.value = obj;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ Result m32000boximpl(Object obj) {
        return new Result(obj);
    }

    @NotNull
    @PublishedApi
    /* renamed from: constructor-impl  reason: not valid java name */
    public static <T> Object m32001constructorimpl(@Nullable Object obj) {
        return obj;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m32002equalsimpl(Object obj, Object obj2) {
        return (obj2 instanceof Result) && C9424q.m22992a(obj, ((Result) obj2).m32010unboximpl());
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m32003equalsimpl0(Object obj, Object obj2) {
        return C9424q.m22992a(obj, obj2);
    }

    @Nullable
    /* renamed from: exceptionOrNull-impl  reason: not valid java name */
    public static final Throwable m32004exceptionOrNullimpl(Object obj) {
        if (obj instanceof Failure) {
            return ((Failure) obj).exception;
        }
        return null;
    }

    @InlineOnly
    /* renamed from: getOrNull-impl  reason: not valid java name */
    private static final T m32005getOrNullimpl(Object obj) {
        if (m32007isFailureimpl(obj)) {
            return null;
        }
        return obj;
    }

    @PublishedApi
    public static /* synthetic */ void getValue$annotations() {
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m32006hashCodeimpl(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* renamed from: isFailure-impl  reason: not valid java name */
    public static final boolean m32007isFailureimpl(Object obj) {
        return obj instanceof Failure;
    }

    /* renamed from: isSuccess-impl  reason: not valid java name */
    public static final boolean m32008isSuccessimpl(Object obj) {
        return !(obj instanceof Failure);
    }

    @NotNull
    /* renamed from: toString-impl  reason: not valid java name */
    public static String m32009toStringimpl(Object obj) {
        if (obj instanceof Failure) {
            return ((Failure) obj).toString();
        }
        return "Success(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return m32002equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m32006hashCodeimpl(this.value);
    }

    @NotNull
    public String toString() {
        return m32009toStringimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ Object m32010unboximpl() {
        return this.value;
    }
}
