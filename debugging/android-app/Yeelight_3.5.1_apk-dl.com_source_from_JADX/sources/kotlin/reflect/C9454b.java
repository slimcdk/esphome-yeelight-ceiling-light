package kotlin.reflect;

import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: kotlin.reflect.b */
public interface C9454b<R> extends C9453a {
    R call(@NotNull Object... objArr);

    R callBy(@NotNull Map<Object, ? extends Object> map);

    @NotNull
    List<Object> getParameters();

    @NotNull
    C9474o getReturnType();

    @NotNull
    List<Object> getTypeParameters();

    @Nullable
    KVisibility getVisibility();

    boolean isAbstract();

    boolean isFinal();

    boolean isOpen();

    boolean isSuspend();
}
