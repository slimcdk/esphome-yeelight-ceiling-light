package kotlin.coroutines.jvm.internal;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.SinceKotlin;
import kotlin.annotation.AnnotationTarget;
import kotlin.jvm.JvmName;

@SinceKotlin(version = "1.3")
@Target({ElementType.TYPE})
@kotlin.annotation.Target(allowedTargets = {AnnotationTarget.CLASS})
@Retention(RetentionPolicy.RUNTIME)
public @interface DebugMetadata {
    @JvmName(name = "c")
    /* renamed from: c */
    String mo23966c() default "";

    @JvmName(name = "f")
    /* renamed from: f */
    String mo23967f() default "";

    @JvmName(name = "i")
    /* renamed from: i */
    int[] mo23968i() default {};

    @JvmName(name = "l")
    /* renamed from: l */
    int[] mo23969l() default {};

    @JvmName(name = "m")
    /* renamed from: m */
    String mo23970m() default "";

    @JvmName(name = "n")
    /* renamed from: n */
    String[] mo23971n() default {};

    @JvmName(name = "s")
    /* renamed from: s */
    String[] mo23972s() default {};

    @JvmName(name = "v")
    /* renamed from: v */
    int mo23973v() default 1;
}
