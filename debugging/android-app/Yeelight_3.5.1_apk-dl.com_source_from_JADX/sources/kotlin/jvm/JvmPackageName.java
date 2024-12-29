package kotlin.jvm;

import java.lang.annotation.Documented;
import java.lang.annotation.RetentionPolicy;
import kotlin.SinceKotlin;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.annotation.MustBeDocumented;
import kotlin.annotation.Retention;
import kotlin.annotation.Target;

@MustBeDocumented
@SinceKotlin(version = "1.2")
@Target(allowedTargets = {AnnotationTarget.FILE})
@Retention(AnnotationRetention.SOURCE)
@Documented
@java.lang.annotation.Target({})
@java.lang.annotation.Retention(RetentionPolicy.SOURCE)
public @interface JvmPackageName {
    String name();
}
