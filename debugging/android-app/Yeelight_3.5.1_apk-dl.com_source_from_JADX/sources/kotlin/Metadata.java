package kotlin;

import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.annotation.Retention;
import kotlin.jvm.JvmName;

@SinceKotlin(version = "1.3")
@Target({ElementType.TYPE})
@kotlin.annotation.Target(allowedTargets = {AnnotationTarget.CLASS})
@Retention(AnnotationRetention.RUNTIME)
@java.lang.annotation.Retention(RetentionPolicy.RUNTIME)
public @interface Metadata {
    @JvmName(name = "bv")
    /* renamed from: bv */
    int[] mo23946bv() default {1, 0, 3};

    @JvmName(name = "d1")
    /* renamed from: d1 */
    String[] mo23947d1() default {};

    @JvmName(name = "d2")
    /* renamed from: d2 */
    String[] mo23948d2() default {};

    @JvmName(name = "k")
    /* renamed from: k */
    int mo23949k() default 1;

    @JvmName(name = "mv")
    /* renamed from: mv */
    int[] mo23950mv() default {};

    @JvmName(name = "pn")
    /* renamed from: pn */
    String mo23951pn() default "";

    @JvmName(name = "xi")
    /* renamed from: xi */
    int mo23952xi() default 0;

    @JvmName(name = "xs")
    /* renamed from: xs */
    String mo23953xs() default "";
}
