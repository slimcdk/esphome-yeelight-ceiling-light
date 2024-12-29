package kotlin.jvm;

import java.lang.annotation.Documented;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.annotation.MustBeDocumented;
import kotlin.annotation.Retention;

@MustBeDocumented
@Documented
@Target({})
@kotlin.annotation.Target(allowedTargets = {AnnotationTarget.TYPE})
@Retention(AnnotationRetention.BINARY)
@java.lang.annotation.Retention(RetentionPolicy.CLASS)
public @interface JvmWildcard {
}
